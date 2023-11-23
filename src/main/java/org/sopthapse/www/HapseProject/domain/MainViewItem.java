package org.sopthapse.www.HapseProject.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "main_item")
public class MainViewItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "main_item_asset")
    private String mainItemAsset;

    @Column(name = "main_item_name")
    private String mainItemName;

    @Column(name = "main_item_cost")
    private String mainItemCost;

    @Column(name = "main_category_img")
    private String mainCategoryImg;
}
