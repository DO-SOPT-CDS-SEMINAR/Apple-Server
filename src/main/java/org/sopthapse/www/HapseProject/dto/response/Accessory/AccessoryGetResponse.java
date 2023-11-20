package org.sopthapse.www.HapseProject.dto.response.Accessory;

import java.util.List;

public record AccessoryGetResponse(
        String name,
        String cost,
        List<String> imgUrls
) {
    public static AccessoryGetResponse of(String modelType, int cost, List<String> imgUrls) {
        return new AccessoryGetResponse(
                String.format("iPad Pro %s용 Magic Keyboard - 한국어 - 화이트", modelType),
                String.format("%,d", cost),
                imgUrls
        );
    }
}
