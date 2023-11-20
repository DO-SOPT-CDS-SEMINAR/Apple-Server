package org.sopthapse.www.HapseProject.dto.response.Product;

import org.sopthapse.www.HapseProject.domain.Product;

public record ProductGetResponse(
        String productName,
        String productCost,
        String productImgUrl
) {
    public static ProductGetResponse of(Product product) {
        return new ProductGetResponse(
                product.getProductName(),
                product.getProductCost(),
                product.getProductImgUrl()
        );
    }
}
