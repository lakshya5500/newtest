package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

class GlobalExceptionHandlerTest {
    /**
     * Method under test: {@link GlobalExceptionHandler#handleMethodArgsNotValidException(MethodArgumentNotValidException)}
     */
    @Test
    void testHandleMethodArgsNotValidException() {
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
        MethodParameter parameter = new MethodParameter(
                new MethodParameter(new MethodParameter(new MethodParameter(mock(MethodParameter.class)))));
        ResponseEntity<Map<String, String>> actualHandleMethodArgsNotValidExceptionResult = globalExceptionHandler
                .handleMethodArgsNotValidException(
                        new MethodArgumentNotValidException(parameter, new BindException(new BindException(
                                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
        assertTrue(actualHandleMethodArgsNotValidExceptionResult.hasBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleMethodArgsNotValidExceptionResult.getStatusCode());
        assertTrue(actualHandleMethodArgsNotValidExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link GlobalExceptionHandler#handleMethodArgsNotValidException(MethodArgumentNotValidException)}
     */
    @Test
    void testHandleMethodArgsNotValidException2() {
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.getAllErrors()).thenReturn(new ArrayList<>());
        BindException bindingResult1 = new BindException(
                new BindException(new BindException(new BindException(new BindException(
                        new BindException(new BindException(new BindException(new BindException(bindingResult)))))))));
        ResponseEntity<Map<String, String>> actualHandleMethodArgsNotValidExceptionResult = globalExceptionHandler
                .handleMethodArgsNotValidException(new MethodArgumentNotValidException(
                        new MethodParameter(
                                new MethodParameter(new MethodParameter(new MethodParameter(mock(MethodParameter.class))))),
                        bindingResult1));
        assertTrue(actualHandleMethodArgsNotValidExceptionResult.hasBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleMethodArgsNotValidExceptionResult.getStatusCode());
        assertTrue(actualHandleMethodArgsNotValidExceptionResult.getHeaders().isEmpty());
        verify(bindingResult).getAllErrors();
    }
}

