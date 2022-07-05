package com.ecom.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Cart}
     *   <li>{@link Cart#setDescription(String)}
     *   <li>{@link Cart#setId(Integer)}
     *   <li>{@link Cart#setImg(String)}
     *   <li>{@link Cart#setPbrand(String)}
     *   <li>{@link Cart#setPid(Integer)}
     *   <li>{@link Cart#setPname(String)}
     *   <li>{@link Cart#setPrice(double)}
     *   <li>{@link Cart#setQuantity(Integer)}
     *   <li>{@link Cart#setRating(float)}
     *   <li>{@link Cart#setTotal(double)}
     *   <li>{@link Cart#getDescription()}
     *   <li>{@link Cart#getId()}
     *   <li>{@link Cart#getImg()}
     *   <li>{@link Cart#getPbrand()}
     *   <li>{@link Cart#getPid()}
     *   <li>{@link Cart#getPname()}
     *   <li>{@link Cart#getPrice()}
     *   <li>{@link Cart#getQuantity()}
     *   <li>{@link Cart#getRating()}
     *   <li>{@link Cart#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Cart actualCart = new Cart();
        actualCart.setDescription("The characteristics of someone or something");
        actualCart.setId(1);
        actualCart.setImg("Img");
        actualCart.setPbrand("Pbrand");
        actualCart.setPid(1);
        actualCart.setPname("Pname");
        actualCart.setPrice(10.0d);
        actualCart.setQuantity(1);
        actualCart.setRating(10.0f);
        actualCart.setTotal(10.0d);
        assertEquals("The characteristics of someone or something", actualCart.getDescription());
        assertEquals(1, actualCart.getId().intValue());
        assertEquals("Img", actualCart.getImg());
        assertEquals("Pbrand", actualCart.getPbrand());
        assertEquals(1, actualCart.getPid().intValue());
        assertEquals("Pname", actualCart.getPname());
        assertEquals(10.0d, actualCart.getPrice());
        assertEquals(1, actualCart.getQuantity().intValue());
        assertEquals(10.0f, actualCart.getRating());
        assertEquals(10.0d, actualCart.getTotal());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Cart}
     *   <li>{@link Cart#setDescription(String)}
     *   <li>{@link Cart#setId(Integer)}
     *   <li>{@link Cart#setImg(String)}
     *   <li>{@link Cart#setPbrand(String)}
     *   <li>{@link Cart#setPid(Integer)}
     *   <li>{@link Cart#setPname(String)}
     *   <li>{@link Cart#setPrice(double)}
     *   <li>{@link Cart#setQuantity(Integer)}
     *   <li>{@link Cart#setRating(float)}
     *   <li>{@link Cart#setTotal(double)}
     *   <li>{@link Cart#getDescription()}
     *   <li>{@link Cart#getId()}
     *   <li>{@link Cart#getImg()}
     *   <li>{@link Cart#getPbrand()}
     *   <li>{@link Cart#getPid()}
     *   <li>{@link Cart#getPname()}
     *   <li>{@link Cart#getPrice()}
     *   <li>{@link Cart#getQuantity()}
     *   <li>{@link Cart#getRating()}
     *   <li>{@link Cart#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Cart actualCart = new Cart();
        actualCart.setDescription("The characteristics of someone or something");
        actualCart.setId(1);
        actualCart.setImg("Img");
        actualCart.setPbrand("Pbrand");
        actualCart.setPid(1);
        actualCart.setPname("Pname");
        actualCart.setPrice(10.0d);
        actualCart.setQuantity(1);
        actualCart.setRating(10.0f);
        actualCart.setTotal(10.0d);
        assertEquals("The characteristics of someone or something", actualCart.getDescription());
        assertEquals(1, actualCart.getId().intValue());
        assertEquals("Img", actualCart.getImg());
        assertEquals("Pbrand", actualCart.getPbrand());
        assertEquals(1, actualCart.getPid().intValue());
        assertEquals("Pname", actualCart.getPname());
        assertEquals(10.0d, actualCart.getPrice());
        assertEquals(1, actualCart.getQuantity().intValue());
        assertEquals(10.0f, actualCart.getRating());
        assertEquals(10.0d, actualCart.getTotal());
    }
}

