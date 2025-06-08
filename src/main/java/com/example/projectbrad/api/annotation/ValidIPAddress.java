//package com.example.projectbrad.api.annotation;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.ElementType.PARAMETER;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
///**
// * 
// * @since 2024-03-19
// * @version 0.9.0
// * @author <a href="http://vertis-solutions.com">Vertis Solutions</a>
// */
//@Documented
//@Constraint(validatedBy = IPAddressValidator.class)
//@Target({ FIELD, PARAMETER })
//@Retention(RetentionPolicy.RUNTIME)
//public @interface ValidIPAddress {
//
//    String message() default "Invalid IP address";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//
//}
