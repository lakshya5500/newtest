package com.ecom.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Category;
import com.ecom.api.entity.Product;
import com.ecom.api.exception.ProductNotExistException;
import com.ecom.api.repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ProductService.class})
@ExtendWith(SpringExtension.class)
class ProductServiceTest {
    @MockBean
    private ProductRepo productRepo;

    @Autowired
    private ProductService productService;

    /**
     * Method under test: {@link ProductService#findProducts()}
     */
    @Test
    void testFindProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        when(productRepo.findAll()).thenReturn(productList);
        List<Product> actualFindProductsResult = productService.findProducts();
        assertSame(productList, actualFindProductsResult);
        assertTrue(actualFindProductsResult.isEmpty());
        verify(productRepo).findAll();
    }

    /**
     * Method under test: {@link ProductService#findProducts()}
     */
//    @Test
//    void testFindProducts2() {
//        when(productRepo.findAll()).thenThrow(new ProductNotExistException("Msg"));
//        assertThrows(ProductNotExistException.class, () -> productService.findProducts());
//        verify(productRepo).findAll();
//    }

    /**
     * Method under test: {@link ProductService#saveProduct(Product)}
     */
    @Test
    void testSaveProduct() {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        when(productRepo.save((Product) any())).thenReturn(product);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");

        Product product1 = new Product();
        product1.setCategory(category1);
        product1.setDescription("The characteristics of someone or something");
        product1.setImg("Img");
        product1.setPbrand("Pbrand");
        product1.setPid(1);
        product1.setPname("Pname");
        product1.setPrice(10.0d);
        product1.setQuantity(1);
        product1.setRating(10.0f);
        product1.setTotal(10.0d);
        assertSame(product, productService.saveProduct(product1));
        verify(productRepo).save((Product) any());
    }

    /**
     * Method under test: {@link ProductService#saveProduct(Product)}
     */
    @Test
    void testSaveProduct2() {
        when(productRepo.save((Product) any())).thenThrow(new ProductNotExistException("Msg"));

        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        assertThrows(ProductNotExistException.class, () -> productService.saveProduct(product));
        verify(productRepo).save((Product) any());
    }

    /**
     * Method under test: {@link ProductService#getProductbyid(Integer)}
     */
    @Test
    void testGetProductbyid() throws ProductNotExistException {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        Optional<Product> ofResult = Optional.of(product);
        when(productRepo.findById((Integer) any())).thenReturn(ofResult);
        Optional<Product> actualProductbyid = productService.getProductbyid(1);
        assertSame(ofResult, actualProductbyid);
        assertTrue(actualProductbyid.isPresent());
        verify(productRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#getProductbyid(Integer)}
     */
    @Test
    void testGetProductbyid2() throws ProductNotExistException {
        when(productRepo.findById((Integer) any())).thenReturn(Optional.empty());
        assertThrows(ProductNotExistException.class, () -> productService.getProductbyid(1));
        verify(productRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#getProductbyid(Integer)}
     */
    @Test
    void testGetProductbyid3() throws ProductNotExistException {
        when(productRepo.findById((Integer) any())).thenThrow(new ProductNotExistException("Product Not Exist :  "));
        assertThrows(ProductNotExistException.class, () -> productService.getProductbyid(1));
        verify(productRepo).findById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#deleteProduct(Integer)}
     */
    @Test
    void testDeleteProduct() throws ProductNotExistException {
        doNothing().when(productRepo).deleteById((Integer) any());
        when(productRepo.existsById((Integer) any())).thenReturn(true);
        assertEquals("Product Deleted", productService.deleteProduct(1));
        verify(productRepo).existsById((Integer) any());
        verify(productRepo).deleteById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#deleteProduct(Integer)}
     */
    @Test
    void testDeleteProduct2() throws ProductNotExistException {
        doThrow(new ProductNotExistException("Product Deleted")).when(productRepo).deleteById((Integer) any());
        when(productRepo.existsById((Integer) any())).thenReturn(true);
        assertThrows(ProductNotExistException.class, () -> productService.deleteProduct(1));
        verify(productRepo).existsById((Integer) any());
        verify(productRepo).deleteById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#deleteProduct(Integer)}
     */
    @Test
    void testDeleteProduct3() throws ProductNotExistException {
        doNothing().when(productRepo).deleteById((Integer) any());
        when(productRepo.existsById((Integer) any())).thenReturn(false);
        assertThrows(ProductNotExistException.class, () -> productService.deleteProduct(1));
        verify(productRepo).existsById((Integer) any());
    }

    /**
     * Method under test: {@link ProductService#updateProduct(Integer, Product)}
     */
    @Test
    void testUpdateProduct() {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        when(productRepo.save((Product) any())).thenReturn(product);
        when(productRepo.existsById((Integer) any())).thenReturn(true);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");

        Product product1 = new Product();
        product1.setCategory(category1);
        product1.setDescription("The characteristics of someone or something");
        product1.setImg("Img");
        product1.setPbrand("Pbrand");
        product1.setPid(1);
        product1.setPname("Pname");
        product1.setPrice(10.0d);
        product1.setQuantity(1);
        product1.setRating(10.0f);
        product1.setTotal(10.0d);
        assertSame(product, productService.updateProduct(1, product1));
        verify(productRepo).existsById((Integer) any());
        verify(productRepo).save((Product) any());
    }

    /**
     * Method under test: {@link ProductService#updateProduct(Integer, Product)}
     */
    @Test
    void testUpdateProduct2() {
        when(productRepo.save((Product) any())).thenThrow(new ProductNotExistException("Msg"));
        when(productRepo.existsById((Integer) any())).thenReturn(true);

        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        assertThrows(ProductNotExistException.class, () -> productService.updateProduct(1, product));
        verify(productRepo).existsById((Integer) any());
        verify(productRepo).save((Product) any());
    }

    /**
     * Method under test: {@link ProductService#updateProduct(Integer, Product)}
     */
    @Test
    void testUpdateProduct3() {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");

        Product product = new Product();
        product.setCategory(category);
        product.setDescription("The characteristics of someone or something");
        product.setImg("Img");
        product.setPbrand("Pbrand");
        product.setPid(1);
        product.setPname("Pname");
        product.setPrice(10.0d);
        product.setQuantity(1);
        product.setRating(10.0f);
        product.setTotal(10.0d);
        when(productRepo.save((Product) any())).thenReturn(product);
        when(productRepo.existsById((Integer) any())).thenReturn(false);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");

        Product product1 = new Product();
        product1.setCategory(category1);
        product1.setDescription("The characteristics of someone or something");
        product1.setImg("Img");
        product1.setPbrand("Pbrand");
        product1.setPid(1);
        product1.setPname("Pname");
        product1.setPrice(10.0d);
        product1.setQuantity(1);
        product1.setRating(10.0f);
        product1.setTotal(10.0d);
        assertThrows(ProductNotExistException.class, () -> productService.updateProduct(1, product1));
        verify(productRepo).existsById((Integer) any());
    }
}

