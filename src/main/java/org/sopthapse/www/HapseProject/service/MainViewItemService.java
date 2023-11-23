package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.Main.MainviewItemGetResponse;
import org.sopthapse.www.HapseProject.repository.MainViewItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MainViewItemService {
    private final MainViewItemRepository mainViewItemRepository;

    public List<MainviewItemGetResponse> getMainviewItems() {
        return mainViewItemRepository.findAll().stream()
                .map(MainviewItemGetResponse::of)
                .collect(Collectors.toList());
    }
}
