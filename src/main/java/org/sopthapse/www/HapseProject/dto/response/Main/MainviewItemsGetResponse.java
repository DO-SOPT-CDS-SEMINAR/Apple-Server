package org.sopthapse.www.HapseProject.dto.response.Main;

import org.sopthapse.www.HapseProject.domain.MainViewItems;

import java.util.SimpleTimeZone;

public record MainviewItemsGetResponse(
        String mainItemsAsset,
        String mainItemsName,
        String mainItemsPrice,
        String mainCategoryImg
) {
    public static MainviewItemsGetResponse of(MainViewItems mainViewItems){
        return new MainviewItemsGetResponse(
                mainViewItems.getMainItemsAsset(),
                mainViewItems.getMainItemsName(),
                mainViewItems.getMainItemsCost(),
                mainViewItems.getMainCategoryImg()
        );
    }
}
