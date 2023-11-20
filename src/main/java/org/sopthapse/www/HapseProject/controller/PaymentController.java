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

    @GetMapping("/delivery-date")
    public ResponseEntity<Message> getDeliveryDate() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "iPad Pro 배송 도착 정보 조회 성공",
                paymentService.getDeliveryDate()
        ));
    }
}