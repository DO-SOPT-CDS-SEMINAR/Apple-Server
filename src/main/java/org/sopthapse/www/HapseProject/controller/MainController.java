package org.sopthapse.www.HapseProject.controller;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.domain.Message;
import org.sopthapse.www.HapseProject.service.MainCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainController {
    private final MainCategoryService mainCategoryService;

    @GetMapping("/category")
    public ResponseEntity<Message> getMainCategory() {
        return ResponseEntity.ok().body(Message.of(
                true,
                "카테고리 조회 성공",
                mainCategoryService.getMainCategory()
        ));
    }
}
