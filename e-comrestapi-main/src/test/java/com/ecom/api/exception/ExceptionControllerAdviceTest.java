package com.ecom.api.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class ExceptionControllerAdviceTest {
    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
    @Test
    void testHandleUpdateFailException() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new AuthenticationFailException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
    @Test
    void testHandleUpdateFailException2() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new AuthenticationFailException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException2() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:14)
//        //   In order to prevent handleUpdateFailException(AuthenticationFailException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(AuthenticationFailException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((AuthenticationFailException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
    @Test
    void testHandleUpdateFailException3() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CartItemNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
	/*
	 * @Test
	 * 
	 * @Disabled("TODO: Complete this test") void testHandleUpdateFailException4() {
	 * // TODO: Complete this test. // Reason: R013 No inputs found that don't throw
	 * a trivial exception. // Diffblue Cover tried to run the arrange/act section,
	 * but the method under // test threw // java.lang.NullPointerException // at
	 * com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(
	 * ExceptionControllerAdvice.java:14) // In order to prevent
	 * handleUpdateFailException(AuthenticationFailException) // from throwing
	 * NullPointerException, add constructors or factory // methods that make it
	 * easier to construct fully initialized objects used in //
	 * handleUpdateFailException(AuthenticationFailException). // See
	 * https://diff.blue/R013 to resolve this issue.
	 * 
	 * (new ExceptionControllerAdvice()).handleUpdateFailException((
	 * AuthenticationFailException) null); }
	 */
    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException4() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:27)
//        //   In order to prevent handleUpdateFailException(CartItemNotExistException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(CartItemNotExistException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((CartItemNotExistException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
    @Test
    void testHandleUpdateFailException5() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CustomException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
    @Test
    void testHandleUpdateFailException6() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CartItemNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException6() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:23)
//        //   In order to prevent handleUpdateFailException(CustomException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(CustomException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((CustomException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
    @Test
    void testHandleUpdateFailException7() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new ProductNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
	/*
	 * @Test
	 * 
	 * @Disabled("TODO: Complete this test") void testHandleUpdateFailException8() {
	 * // TODO: Complete this test. // Reason: R013 No inputs found that don't throw
	 * a trivial exception. // Diffblue Cover tried to run the arrange/act section,
	 * but the method under // test threw // java.lang.NullPointerException // at
	 * com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(
	 * ExceptionControllerAdvice.java:27) // In order to prevent
	 * handleUpdateFailException(CartItemNotExistException) // from throwing
	 * NullPointerException, add constructors or factory // methods that make it
	 * easier to construct fully initialized objects used in //
	 * handleUpdateFailException(CartItemNotExistException). // See
	 * https://diff.blue/R013 to resolve this issue.
	 * 
	 * (new ExceptionControllerAdvice()).handleUpdateFailException((
	 * CartItemNotExistException) null); }
	 */
    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException8() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:19)
//        //   In order to prevent handleUpdateFailException(ProductNotExistException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(ProductNotExistException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((ProductNotExistException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
    @Test
    void testHandleUpdateFailException9() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new AuthenticationFailException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
    @Test
    void testHandleUpdateFailException10() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CustomException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(AuthenticationFailException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException10() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:14)
//        //   In order to prevent handleUpdateFailException(AuthenticationFailException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(AuthenticationFailException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((AuthenticationFailException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
    @Test
    void testHandleUpdateFailException11() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CartItemNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
	/*
	 * @Test
	 * 
	 * @Disabled("TODO: Complete this test") void testHandleUpdateFailException12()
	 * { // TODO: Complete this test. // Reason: R013 No inputs found that don't
	 * throw a trivial exception. // Diffblue Cover tried to run the arrange/act
	 * section, but the method under // test threw // java.lang.NullPointerException
	 * // at
	 * com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(
	 * ExceptionControllerAdvice.java:23) // In order to prevent
	 * handleUpdateFailException(CustomException) // from throwing
	 * NullPointerException, add constructors or factory // methods that make it
	 * easier to construct fully initialized objects used in //
	 * handleUpdateFailException(CustomException). // See https://diff.blue/R013 to
	 * resolve this issue.
	 * 
	 * (new ExceptionControllerAdvice()).handleUpdateFailException((CustomException)
	 * null); }
	 */

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CartItemNotExistException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException12() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:27)
//        //   In order to prevent handleUpdateFailException(CartItemNotExistException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(CartItemNotExistException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((CartItemNotExistException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
    @Test
    void testHandleUpdateFailException13() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new CustomException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
    @Test
    void testHandleUpdateFailException14() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new ProductNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(CustomException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException14() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:23)
//        //   In order to prevent handleUpdateFailException(CustomException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(CustomException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((CustomException) null);
//    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
    @Test
    void testHandleUpdateFailException15() {
        ExceptionControllerAdvice exceptionControllerAdvice = new ExceptionControllerAdvice();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = exceptionControllerAdvice
                .handleUpdateFailException(new ProductNotExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
	/*
	 * @Test
	 * 
	 * @Disabled("TODO: Complete this test") void testHandleUpdateFailException16()
	 * { // TODO: Complete this test. // Reason: R013 No inputs found that don't
	 * throw a trivial exception. // Diffblue Cover tried to run the arrange/act
	 * section, but the method under // test threw // java.lang.NullPointerException
	 * // at
	 * com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(
	 * ExceptionControllerAdvice.java:19) // In order to prevent
	 * handleUpdateFailException(ProductNotExistException) // from throwing
	 * NullPointerException, add constructors or factory // methods that make it
	 * easier to construct fully initialized objects used in //
	 * handleUpdateFailException(ProductNotExistException). // See
	 * https://diff.blue/R013 to resolve this issue.
	 * 
	 * (new ExceptionControllerAdvice()).handleUpdateFailException((
	 * ProductNotExistException) null); }
	 */
    /**
     * Method under test: {@link ExceptionControllerAdvice#handleUpdateFailException(ProductNotExistException)}
     */
//    @Test
//    @Disabled("TODO: Complete this test")
//    void testHandleUpdateFailException16() {
//        // TODO: Complete this test.
//        //   Reason: R013 No inputs found that don't throw a trivial exception.
//        //   Diffblue Cover tried to run the arrange/act section, but the method under
//        //   test threw
//        //   java.lang.NullPointerException
//        //       at com.ecom.api.exception.ExceptionControllerAdvice.handleUpdateFailException(ExceptionControllerAdvice.java:19)
//        //   In order to prevent handleUpdateFailException(ProductNotExistException)
//        //   from throwing NullPointerException, add constructors or factory
//        //   methods that make it easier to construct fully initialized objects used in
//        //   handleUpdateFailException(ProductNotExistException).
//        //   See https://diff.blue/R013 to resolve this issue.
//
//        (new ExceptionControllerAdvice()).handleUpdateFailException((ProductNotExistException) null);
//    }
}

