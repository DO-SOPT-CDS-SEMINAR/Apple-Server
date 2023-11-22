package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.MainViewItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainViewItemsRepository extends JpaRepository<MainViewItems, Long> {
}
