/**
 * Copyright (C) Bikeemotion
 * 2014
 *
 * The reproduction, transmission or use of this document or its contents is not
 * permitted without express written authorization. All rights, including rights
 * created by patent grant or registration of a utility model or design, are
 * reserved. Modifications made to this document are restricted to authorized
 * personnel only. Technical specifications and features are binding only when
 * specifically and expressly agreed upon in a written contract.
 */
package com.bikeemotion.common.utils;

import com.bikeemotion.common.exception.MissingServiceException;
import java.util.concurrent.TimeUnit;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleReference;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceHelpers {

  private static final Logger LOG = LoggerFactory.getLogger(ServiceHelpers.class);

  public static <T> void waitForService(final Class callerClass, final Class serviceClass, final T service)
    throws MissingServiceException, InterruptedException {

    waitForService(callerClass, serviceClass, service, 0);
  }

  public static <T> T getService(final Class c, final Class<T> type, final String filters) {

    T result = null;
    try {

      final BundleContext bContext = getBundleContext(c);

      final ServiceReference[] references = bContext.getServiceReferences(type.getName(), filters);

      result = (T) bContext.getService(references[0]);
    } catch (Exception e) {

      LOG.error(String.format(
          "Can't get the %s Service Reference",
          type.getCanonicalName()),
          e);
    }

    return result;

  }

  private static BundleContext getBundleContext(Class c) {

    return ((BundleReference) c.getClassLoader())
        .getBundle()
        .getBundleContext();
  }

  private static <T> void waitForService(
      final Class callerClass,
      final Class serviceClass,
      final T service,
      int retriesCounter)
        throws MissingServiceException,
        InterruptedException {

    final Logger log = LoggerFactory.getLogger(callerClass);

    try {
      if (service == null) {
        throw new MissingServiceException("Service is still null.");
      }
      service.toString();
    } catch (Exception ex) {
      log.debug("Error when getting service reference", ex);

      if (retriesCounter < Constants.serviceLookupMaxRetries) {
        log.warn(
            String.format(
                "Waiting (%s) for service [%s] with error [%s]..",
                retriesCounter,
                serviceClass.getCanonicalName(),
                ex));
        Thread.sleep(TimeUnit.SECONDS.toMillis(Constants.serviceLookupEachSecs));
        waitForService(callerClass, serviceClass, service, ++retriesCounter);
      } else {
        throw new MissingServiceException(
            String.format(Constants.serviceLookupMaxRetriesHitMsg, serviceClass.getCanonicalName()));
      }

    }
  }
}
