package com.ecom.api.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.ecom.api.entity.Category;
import com.ecom.api.repository.CategoryRepo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CategoryService.class})
@ExtendWith(SpringExtension.class)
class CategoryServiceTest {
    @MockBean
    private CategoryRepo categoryRepo;

    @Autowired
    private CategoryService categoryService;

    /**
     * Method under test: {@link CategoryService#findCategory()}
     */
    @Test
    void testFindCategory() {
        ArrayList<Category> categoryList = new ArrayList<>();
        when(categoryRepo.findAll()).thenReturn(categoryList);
        List<Category> actualFindCategoryResult = categoryService.findCategory();
        assertSame(categoryList, actualFindCategoryResult);
        assertTrue(actualFindCategoryResult.isEmpty());
        verify(categoryRepo).findAll();
    }

    /**
     * Method under test: {@link CategoryService#saveCategory(Category)}
     */
    @Test
    void testSaveCategory() {
        Category category = new Category();
        category.setCat("Cat");
        category.setImgUrl("https://example.org/example");
        category.setSubcat("Subcat");
        when(categoryRepo.save((Category) any())).thenReturn(category);

        Category category1 = new Category();
        category1.setCat("Cat");
        category1.setImgUrl("https://example.org/example");
        category1.setSubcat("Subcat");
        assertSame(category, categoryService.saveCategory(category1));
        verify(categoryRepo).save((Category) any());
    }
}

