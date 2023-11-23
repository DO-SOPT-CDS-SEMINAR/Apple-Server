package org.sopthapse.www.HapseProject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "main_category")
public class MainCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "main_category_name")
    private String mainCategoryName;

    @Column(name = "main_category_img")
    private String mainCategoryImg;

    @Builder
    public MainCategory(String mainCategoryName, String mainCategoryImg) {
        this.mainCategoryName = mainCategoryName;
        this.mainCategoryImg = mainCategoryImg;
    }
}
