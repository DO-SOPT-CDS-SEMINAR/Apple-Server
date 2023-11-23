package org.sopthapse.www.HapseProject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "ipadview_item")
public class IpadviewItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productAsset;
    private String productName;
    private String productCost;
    private String productImgUrl;

    @Builder
    public IpadviewItem(String productAsset, String productName, String productCost, String productImgUrl) {
        this.productAsset = productAsset;
        this.productName = productName;
        this.productCost = productCost;
        this.productImgUrl = productImgUrl;
    }
}