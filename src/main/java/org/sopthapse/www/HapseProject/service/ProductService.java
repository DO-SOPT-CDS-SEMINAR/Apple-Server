package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.common.exception.BadRequestException;
import org.sopthapse.www.HapseProject.dto.response.Product.ProductGetResponse;
import org.sopthapse.www.HapseProject.dto.response.ProductBuyImage.ProductBuyImageGetResponse;
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

    public List<ProductBuyImageGetResponse> getProductBuyImages(Long productId) {
        if (productRepository.findById(productId).get().getProductBuyImages().isEmpty()) {
            throw new BadRequestException("해당 제품의 구입하기 이미지가 존재하지 않습니다.");
        }
        return productRepository.findById(productId).get().getProductBuyImages().stream()
                .map(ProductBuyImageGetResponse::of)
                .collect(Collectors.toList());
    }
}
