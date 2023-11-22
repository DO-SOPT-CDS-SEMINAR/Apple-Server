package org.sopthapse.www.HapseProject.dto.response.Accessory;

import java.util.List;

public record AccessoryGetResponse(
        String accessoryName,
        String accessoryCost,
        List<String> accessoryImgUrls
) {
    public static AccessoryGetResponse of(String modelType, int accessoryCost, List<String> accessoryImgUrls) {
        return new AccessoryGetResponse(
                String.format("iPad Pro %s용 Magic Keyboard - 한국어 - 화이트", modelType),
                String.format("%,d", accessoryCost),
                accessoryImgUrls
        );
    }
}
