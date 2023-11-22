package org.sopthapse.www.HapseProject.dto.response.Main;

import org.sopthapse.www.HapseProject.domain.Information;

public record MainInformationGetResponse(
        Long id,
        String content

) {
    public static MainInformationGetResponse of(Information information){
        return new MainInformationGetResponse(
                information.getId(),
                information.getContent()
        );
    }
}
