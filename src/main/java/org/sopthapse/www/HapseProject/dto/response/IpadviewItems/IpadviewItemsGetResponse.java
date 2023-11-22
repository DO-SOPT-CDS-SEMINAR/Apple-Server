package org.sopthapse.www.HapseProject.dto.response.IpadviewItems;

import org.sopthapse.www.HapseProject.domain.IpadviewItems;

public record IpadviewItemsGetResponse(
        String productAsset,
        String productName,
        String productCost,
        String productImgUrl
) {
    public static IpadviewItemsGetResponse of(IpadviewItems ipadviewItems) {
        return new IpadviewItemsGetResponse(
                ipadviewItems.getProductAsset(),
                ipadviewItems.getProductName(),
                ipadviewItems.getProductCost(),
                ipadviewItems.getProductImgUrl()
        );
    }
}
