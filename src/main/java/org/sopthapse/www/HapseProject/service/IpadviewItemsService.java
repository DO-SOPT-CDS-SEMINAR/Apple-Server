package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.IpadviewItems.IpadviewItemsGetResponse;
import org.sopthapse.www.HapseProject.repository.IpadviewItemsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IpadviewItemsService {
    private final IpadviewItemsRepository ipadviewItemsRepository;

    public List<IpadviewItemsGetResponse> getIpadviewItems() {
        return ipadviewItemsRepository.findAll().stream()
                .map(IpadviewItemsGetResponse::of)
                .collect(Collectors.toList());
    }
}
