package org.sopthapse.www.HapseProject.repository;

import org.sopthapse.www.HapseProject.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainInformationRepository extends JpaRepository<Information, Long> {
}
