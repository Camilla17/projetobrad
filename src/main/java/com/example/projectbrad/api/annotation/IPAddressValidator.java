//package com.example.projectbrad.api.annotation;
//
//import java.util.regex.Pattern;
//
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
///**
// * 
// * @since 2024-03-19
// * @version 0.9.0
// * @author <a href="http://vertis-solutions.com">Vertis Solutions</a>
// */
//public class IPAddressValidator implements ConstraintValidator<ValidIPAddress, String> {
//
//    private static final String IP_ADDRESS_PATTERN = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.|$)){4}\\b";
//
//    private static final Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);
//
//    @Override
//    public void initialize(ValidIPAddress constraintAnnotation) {
//        // The method is empty because ValidIPAddress initialization does not require
//        // no specific action at this time.
//    }
//
//    @Override
//    public boolean isValid(String value, ConstraintValidatorContext context) {
//        if (value == null) {
//            return true;
//        }
//        if (!pattern.matcher(value).matches()) {
//            context.disableDefaultConstraintViolation();
//            context.buildConstraintViolationWithTemplate("IP address is not valid: " + value)
//                    .addConstraintViolation();
//            return false;
//        }
//        return true;
//    }
//}
