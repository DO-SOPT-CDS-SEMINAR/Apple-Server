package org.sopthapse.www.HapseProject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "ipadview_items")
public class IpadviewItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String productCost;
    private String productImgUrl;

    @Builder
    public IpadviewItems(String productName, String productCost, String productImgUrl) {
        this.productName = productName;
        this.productCost = productCost;
        this.productImgUrl = productImgUrl;
    }
}