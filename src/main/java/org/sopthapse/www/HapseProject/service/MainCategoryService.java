package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.Main.MainCategoryGetResponse;
import org.sopthapse.www.HapseProject.repository.MainCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MainCategoryService {
    private final MainCategoryRepository mainCategoryRepository;

    public List<MainCategoryGetResponse> getMainCategory() {
        return mainCategoryRepository.findAll().stream()
                .map(MainCategoryGetResponse::of)
                .collect(Collectors.toList());
    }
}
