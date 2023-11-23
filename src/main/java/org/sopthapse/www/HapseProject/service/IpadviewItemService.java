package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.IpadviewItems.IpadviewItemGetResponse;
import org.sopthapse.www.HapseProject.repository.IpadviewItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IpadviewItemService {
    private final IpadviewItemRepository ipadviewItemRepository;

    public List<IpadviewItemGetResponse> getIpadviewItems() {
        return ipadviewItemRepository.findAll().stream()
                .map(IpadviewItemGetResponse::of)
                .collect(Collectors.toList());
    }
}
