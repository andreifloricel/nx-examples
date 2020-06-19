//==============================================================================
// Copyright (c) 2020 BMW Group. All rights reserved.
//==============================================================================
package com.bmw.ptad;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Stereotype;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FULLY OPTIONAL
 * <p>
 * However, you will have to annotate a class to become injectable.
 * <p>
 * A managed bean annotated with Dependent annotation on Quarkus behaves as an
 * injected class without any annotations on stock Jakarta EE / Java EE
 * (CA.micro) runtimes.
 */
@Dependent
@Stereotype
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Control {
}