package org.sopthapse.www.HapseProject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    @Builder
    public Product(Long productType, String productName, String productCost, String productImgUrl) {
        this.productType = productType;
        this.productName = productName;
        this.productCost = productCost;
        this.productImgUrl = productImgUrl;
    }
}