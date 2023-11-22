package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{productType}/items")
    public ResponseEntity<Message> getProductsByType(@PathVariable Long productType) {
        return ResponseEntity.ok().body(Message.of(
                true,
                "상품 목록 조회 성공",
                productService.getProductsByType(productType)
        ));
    }

    @PostMapping("/{productId}/{modelType}/accessory")
    public ResponseEntity<Message> getAccessoryByModelType(@PathVariable Long productId, @PathVariable Long modelType) {
        return ResponseEntity.ok().body(Message.of(
                true,
                "iPad Pro 악세서리 제품 정보 조회 성공",
                productService.getAccessoryByModelType(productId, modelType)
        ));
    }

    @GetMapping("/{productId}/delivery-date")
    public ResponseEntity<Message> getDeliveryDate(@PathVariable Long productId) {
        return ResponseEntity.ok().body(Message.of(
                true,
                "iPad Pro 배송 도착 정보 조회 성공",
                productService.getDeliveryDate(productId)
        ));
    }
}
