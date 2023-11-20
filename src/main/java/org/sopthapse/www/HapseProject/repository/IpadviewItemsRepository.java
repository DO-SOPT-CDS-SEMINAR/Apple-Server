package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.IpadviewItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpadviewItemsRepository extends JpaRepository<IpadviewItems, Long> {
}
