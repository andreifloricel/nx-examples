package com.bmw.ptad;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FULLY OPTIONAL In Quarkus all injected classes have to be annotated.
 * <p>
 * You could use any annotation to make a class injectable, or use a custom
 * stereotype for that purpose.
 * <p>
 * The @Boundary annotation is RequestScoped. @RequestScoped with @Transactional
 * annotation behaves similarly to a @Stateless EJB on stock Jakarta EE / Java
 * EE / MicroProfile runtimes.
 */
@Stereotype
//@Transactional
@RequestScoped
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Boundary {
}