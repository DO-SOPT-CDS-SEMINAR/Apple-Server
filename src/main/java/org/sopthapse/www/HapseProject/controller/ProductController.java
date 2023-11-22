package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product/{productType}/items")
    public ResponseEntity<Message> getProductsByType(@PathVariable Long productType) {
        return ResponseEntity.ok().body(Message.of(
                true,
                "상품 목록 조회 성공",
                productService.getProductsByType(productType)
        ));
    }
}
