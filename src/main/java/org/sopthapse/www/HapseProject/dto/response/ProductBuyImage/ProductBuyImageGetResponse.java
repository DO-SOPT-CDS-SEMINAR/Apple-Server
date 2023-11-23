package org.sopthapse.www.HapseProject.dto.response.ProductBuyImage;

import org.sopthapse.www.HapseProject.domain.ProductBuyImage;

public record ProductBuyImageGetResponse(
        String productImgUrl
) {
    public static ProductBuyImageGetResponse of(ProductBuyImage productBuyImage) {
        return new ProductBuyImageGetResponse(
                productBuyImage.getProductImgUrl()
        );
    }
}
