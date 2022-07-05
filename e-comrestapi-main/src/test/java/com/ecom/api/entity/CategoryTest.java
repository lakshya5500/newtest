package com.ecom.api.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CategoryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Category}
     *   <li>{@link Category#setCat(String)}
     *   <li>{@link Category#setImgUrl(String)}
     *   <li>{@link Category#setSubcat(String)}
     *   <li>{@link Category#getCat()}
     *   <li>{@link Category#getImgUrl()}
     *   <li>{@link Category#getSubcat()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Category actualCategory = new Category();
        actualCategory.setCat("Cat");
        actualCategory.setImgUrl("https://example.org/example");
        actualCategory.setSubcat("Subcat");
        assertEquals("Cat", actualCategory.getCat());
        assertEquals("https://example.org/example", actualCategory.getImgUrl());
        assertEquals("Subcat", actualCategory.getSubcat());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Category}
     *   <li>{@link Category#setCat(String)}
     *   <li>{@link Category#setImgUrl(String)}
     *   <li>{@link Category#setSubcat(String)}
     *   <li>{@link Category#getCat()}
     *   <li>{@link Category#getImgUrl()}
     *   <li>{@link Category#getSubcat()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Category actualCategory = new Category();
        actualCategory.setCat("Cat");
        actualCategory.setImgUrl("https://example.org/example");
        actualCategory.setSubcat("Subcat");
        assertEquals("Cat", actualCategory.getCat());
        assertEquals("https://example.org/example", actualCategory.getImgUrl());
        assertEquals("Subcat", actualCategory.getSubcat());
    }
}

