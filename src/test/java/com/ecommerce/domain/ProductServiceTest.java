package com.ecommerce.domain;

import com.ecommerce.infrastructure.ProductRepository;
import com.ecommerce.domain.ProductService;
import com.ecommerce.domain.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        when(productRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(productService.getAllProducts().isEmpty());
    }

    @Test
    public void testGetProductById() {
        Long id = 1L;
        Product product = new Product();
        product.setId(id);
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        assertEquals(product, productService.getProductById(id).get());
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        when(productRepository.save(product)).thenReturn(product);
        assertEquals(product, productService.createProduct(product));
    }

    @Test
    public void testUpdateProduct() {
        Long id = 1L;
        Product product = new Product();
        product.setId(id);
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        when(productRepository.save(product)).thenReturn(product);
        assertEquals(product, productService.updateProduct(id, product));
    }

    @Test
    public void testDeleteProduct() {
        Long id = 1L;
        productService.deleteProduct(id);
        verify(productRepository, times(1)).deleteById(id);
    }
}