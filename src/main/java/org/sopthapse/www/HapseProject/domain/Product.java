package org.sopthapse.www.HapseProject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productType;

    private String productName;

    private String productCost;

    private String productImgUrl;

    private String productSubName;

    @OneToMany(mappedBy = "product")
    private List<ProductBuyImage> productBuyImages = new ArrayList<>();

    @Builder
    public Product(Long productType, String productName, String productCost, String productImgUrl, String productSubName) {
        this.productType = productType;
        this.productName = productName;
        this.productCost = productCost;
        this.productImgUrl = productImgUrl;
        this.productSubName = productSubName;
    }
}