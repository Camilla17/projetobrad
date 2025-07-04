//package com.example.projectbrad.api.annotation;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import com.smartvtc.core.api.exception.Error;
//
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//
///**
// * @since   2023-07-10
// * @version 0.0.1
// * @author  <a href="http://vertis-solutions.com">Vertis Solutions</a>
// */
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//@ResponseStatus(HttpStatus.CREATED)
//@ApiResponse(
//		responseCode = "400",
//		description = "Bad request",
//		content = @Content(schema = @Schema(implementation = Error.class))
//)
//@ApiResponse(
//		responseCode = "401",
//		description = "Requires authentication"
//)
//@ApiResponse(
//		responseCode = "403",
//		description = "Forbidden"
//)
//public @interface PostApiResponse {
//
//}
