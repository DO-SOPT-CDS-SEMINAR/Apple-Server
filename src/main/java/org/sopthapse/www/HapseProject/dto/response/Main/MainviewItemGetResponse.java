package org.sopthapse.www.HapseProject.dto.response.Main;

import org.sopthapse.www.HapseProject.domain.MainViewItem;

public record MainviewItemGetResponse(
        String mainItemAsset,
        String mainItemName,
        String mainItemPrice,
        String mainCategoryImg
) {
    public static MainviewItemGetResponse of(MainViewItem mainViewItem) {
        return new MainviewItemGetResponse(
                mainViewItem.getMainItemAsset(),
                mainViewItem.getMainItemName(),
                mainViewItem.getMainItemCost(),
                mainViewItem.getMainCategoryImg()
        );
    }
}
