package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.MainViewItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainViewItemRepository extends JpaRepository<MainViewItem, Long> {
}
