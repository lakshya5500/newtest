package com.ecom.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ProductTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Product}
     *   <li>{@link Product#setCategory(Category)}
     *   <li>{@link Product#setDescription(String)}
     *   <li>{@link Product#setImg(String)}
     *   <li>{@link Product#setPbrand(String)}
     *   <li>{@link Product#setPid(Integer)}
     *   <li>{@link Product#setPname(String)}
     *   <li>{@link Product#setPrice(double)}
     *   <li>{@link Product#setQuantity(Integer)}
     *   <li>{@link Product#setRating(float)}
     *   <li>{@link Product#setTotal(double)}
     *   <li>{@link Product#getCategory()}
     *   <li>{@link Product#getDescription()}
     *   <li>{@link Product#getImg()}
     *   <li>{@link Product#getPbrand()}
     *   <li>{@link Product#getPid()}
     *   <li>{@link Product#getPname()}
     *   <li>{@link Product#getPrice()}
     *   <li>{@link Product#getQuantity()}
     *   <li>{@link Product#getRating()}
     *   <li>{@link Product#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Product actualProduct = new Product();
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");
        actualProduct.setCategory(category);
        actualProduct.setDescription("The characteristics of someone or something");
        actualProduct.setImg("Img");
        actualProduct.setPbrand("Pbrand");
        actualProduct.setPid(1);
        actualProduct.setPname("Pname");
        actualProduct.setPrice(10.0d);
        actualProduct.setQuantity(1);
        actualProduct.setRating(10.0f);
        actualProduct.setTotal(10.0d);
        assertSame(category, actualProduct.getCategory());
        assertEquals("The characteristics of someone or something", actualProduct.getDescription());
        assertEquals("Img", actualProduct.getImg());
        assertEquals("Pbrand", actualProduct.getPbrand());
        assertEquals(1, actualProduct.getPid().intValue());
        assertEquals("Pname", actualProduct.getPname());
        assertEquals(10.0d, actualProduct.getPrice());
        assertEquals(1, actualProduct.getQuantity().intValue());
        assertEquals(10.0f, actualProduct.getRating());
        assertEquals(10.0d, actualProduct.getTotal());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Product}
     *   <li>{@link Product#setCategory(Category)}
     *   <li>{@link Product#setDescription(String)}
     *   <li>{@link Product#setImg(String)}
     *   <li>{@link Product#setPbrand(String)}
     *   <li>{@link Product#setPid(Integer)}
     *   <li>{@link Product#setPname(String)}
     *   <li>{@link Product#setPrice(double)}
     *   <li>{@link Product#setQuantity(Integer)}
     *   <li>{@link Product#setRating(float)}
     *   <li>{@link Product#setTotal(double)}
     *   <li>{@link Product#getCategory()}
     *   <li>{@link Product#getDescription()}
     *   <li>{@link Product#getImg()}
     *   <li>{@link Product#getPbrand()}
     *   <li>{@link Product#getPid()}
     *   <li>{@link Product#getPname()}
     *   <li>{@link Product#getPrice()}
     *   <li>{@link Product#getQuantity()}
     *   <li>{@link Product#getRating()}
     *   <li>{@link Product#getTotal()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Product actualProduct = new Product();
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");
        actualProduct.setCategory(category);
        actualProduct.setDescription("The characteristics of someone or something");
        actualProduct.setImg("Img");
        actualProduct.setPbrand("Pbrand");
        actualProduct.setPid(1);
        actualProduct.setPname("Pname");
        actualProduct.setPrice(10.0d);
        actualProduct.setQuantity(1);
        actualProduct.setRating(10.0f);
        actualProduct.setTotal(10.0d);
        assertSame(category, actualProduct.getCategory());
        assertEquals("The characteristics of someone or something", actualProduct.getDescription());
        assertEquals("Img", actualProduct.getImg());
        assertEquals("Pbrand", actualProduct.getPbrand());
        assertEquals(1, actualProduct.getPid().intValue());
        assertEquals("Pname", actualProduct.getPname());
        assertEquals(10.0d, actualProduct.getPrice());
        assertEquals(1, actualProduct.getQuantity().intValue());
        assertEquals(10.0f, actualProduct.getRating());
        assertEquals(10.0d, actualProduct.getTotal());
    }
}

