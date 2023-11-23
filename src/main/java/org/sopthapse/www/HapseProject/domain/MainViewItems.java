package org.sopthapse.www.HapseProject.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "main_items")
public class MainViewItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "main_items_asset")
    private String mainItemsAsset;

    @Column(name = "main_items_name")
    private String mainItemsName;

    @Column(name = "main_items_cost")
    private String mainItemsCost;

    @Column(name = "main_category_img")
    private String mainCategoryImg;
}
