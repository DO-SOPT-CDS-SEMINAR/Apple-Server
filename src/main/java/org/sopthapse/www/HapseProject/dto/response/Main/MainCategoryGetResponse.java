package org.sopthapse.www.HapseProject.dto.response.Main;

import org.sopthapse.www.HapseProject.domain.MainCategory;

public record MainCategoryGetResponse(
    Long mainCategoryId,
    String mainCategoryName,
    String mainCategoryImg
){
    public static MainCategoryGetResponse of(MainCategory mainCategory){
        return new MainCategoryGetResponse(
                mainCategory.getId(),
                mainCategory.getMainCategoryName(),
                mainCategory.getMainCategoryImg()
        );
    }
}
