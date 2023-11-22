package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.Product;
import org.sopthapse.www.HapseProject.domain.ProductBuyImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductBuyImageRepository extends JpaRepository<ProductBuyImage, Long> {
}
