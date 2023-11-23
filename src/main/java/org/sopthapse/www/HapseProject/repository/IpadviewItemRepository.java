package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.IpadviewItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpadviewItemRepository extends JpaRepository<IpadviewItem, Long> {
}
