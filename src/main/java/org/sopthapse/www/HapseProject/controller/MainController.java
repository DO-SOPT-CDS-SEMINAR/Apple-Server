package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.MainCategoryService;
import org.sopthapse.www.HapseProject.service.MainInformationService;
import org.sopthapse.www.HapseProject.service.MainViewItemsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainController {
    private final MainCategoryService mainCategoryService;
    private final MainInformationService mainInformationService;
    private final MainViewItemsService mainViewItemsService;

    @GetMapping("/category")
    public ResponseEntity<Message> getMainCategory() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "카테고리 조회 성공",
                mainCategoryService.getMainCategory()
        ));
    }

    @GetMapping("/information")
    public ResponseEntity<Message> getMainInformation() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "하단 안내 문구 조회 성공",
                mainInformationService.getMainInformation()
        ));
    }

    @GetMapping("/items")
    public ResponseEntity<Message> getMainViewItems() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "메인 뷰 내의 제품 정보 조회 성공",
                mainViewItemsService.getMainviewItems()
        ));
    }
}
