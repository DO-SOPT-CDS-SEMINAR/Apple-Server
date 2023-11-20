package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.Product.ProductGetResponse;
import org.sopthapse.www.HapseProject.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public List<ProductGetResponse> getProductsByType(Long productType) {
        return productRepository.findAllByProductType(productType).stream()
                .map(ProductGetResponse::of)
                .collect(Collectors.toList());
    }
}
