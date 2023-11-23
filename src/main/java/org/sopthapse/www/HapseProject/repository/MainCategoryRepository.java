package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainCategoryRepository extends JpaRepository<MainCategory, Long> {
}
