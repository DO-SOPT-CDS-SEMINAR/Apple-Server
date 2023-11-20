package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ipad-pro")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/{modelType}/accessory")
    public ResponseEntity<Message> getAccessoryByModelType(@PathVariable Long modelType) {
        return ResponseEntity.ok().body(Message.of(
                true,
                "iPad Pro 악세서리 제품 정보 조회 성공",
                paymentService.getAccessoryByModelType(modelType)
        ));
    }
}
