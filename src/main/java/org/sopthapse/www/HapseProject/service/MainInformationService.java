package org.sopthapse.www.HapseProject.service;

import lombok.RequiredArgsConstructor;
import org.sopthapse.www.HapseProject.dto.response.Main.MainInformationGetResponse;
import org.sopthapse.www.HapseProject.repository.MainInformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MainInformationService {
    private final MainInformationRepository mainInformationRepository;

    public List<MainInformationGetResponse> getMainInformation() {
        return mainInformationRepository.findAll().stream()
                .map(MainInformationGetResponse::of)
                .collect(Collectors.toList());
    }
}
