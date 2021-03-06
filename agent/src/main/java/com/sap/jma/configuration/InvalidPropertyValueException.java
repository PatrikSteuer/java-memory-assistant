/*
 * Copyright (c) 2017 SAP SE or an SAP affiliate company. All rights reserved.
 * This file is licensed under the Apache Software License, v. 2 except as noted
 * otherwise in the LICENSE file at the root of the repository.
 */

package com.sap.jma.configuration;

public class InvalidPropertyValueException extends Exception {

  InvalidPropertyValueException(String message) {
    super(message);
  }

  InvalidPropertyValueException(String message, Throwable cause) {
    super(message, cause);
  }

}
