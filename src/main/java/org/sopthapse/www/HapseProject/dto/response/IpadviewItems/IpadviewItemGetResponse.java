package org.sopthapse.www.HapseProject.dto.response.IpadviewItems;

import org.sopthapse.www.HapseProject.domain.IpadviewItem;

public record IpadviewItemGetResponse(
        Long productAsset,
        String productName,
        String productCost,
        String productImgUrl
) {
    public static IpadviewItemGetResponse of(IpadviewItem ipadviewItem) {
        return new IpadviewItemGetResponse(
                ipadviewItem.getProductAsset(),
                ipadviewItem.getProductName(),
                ipadviewItem.getProductCost(),
                ipadviewItem.getProductImgUrl()
        );
    }
}
