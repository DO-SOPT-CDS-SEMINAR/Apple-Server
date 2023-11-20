package org.sopthapse.www.HapseProject.dto.response.IpadviewItems;

import org.sopthapse.www.HapseProject.domain.IpadviewItems;

public record IpadviewItemsGetResponse(
        String productName,
        String productCost,
        String productImgUrl
) {
    public static IpadviewItemsGetResponse of(IpadviewItems ipadviewItems) {
        return new IpadviewItemsGetResponse(
                ipadviewItems.getProductName(),
                ipadviewItems.getProductCost(),
                ipadviewItems.getProductImgUrl()
        );
    }
}
