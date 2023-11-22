package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.Main.MainviewItemsGetResponse;
import org.sopthapse.www.HapseProject.repository.MainViewItemsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MainViewItemsService {
    private final MainViewItemsRepository mainViewItemsRepository;

    public List<MainviewItemsGetResponse> getMainviewItems() {
        return mainViewItemsRepository.findAll().stream()
                .map(MainviewItemsGetResponse::of)
                .collect(Collectors.toList());
    }
}
