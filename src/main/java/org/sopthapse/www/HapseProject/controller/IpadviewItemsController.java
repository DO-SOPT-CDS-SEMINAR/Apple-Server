package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.IpadviewItemsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IpadviewItemsController {
    private final IpadviewItemsService ipadviewItemsService;

    @GetMapping("/ipad/items")
    public ResponseEntity<Message> getIpadviewItems() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "아이패드 뷰 내 모든 제품 정보 조회 성공",
                ipadviewItemsService.getIpadviewItems()
        ));
    }
}
