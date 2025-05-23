package table.avaliability.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import table.avaliability.microservice.domain.TableAvaliability;

@Repository
public interface TableAvaliabilityRepository extends JpaRepository<TableAvaliability, Long> {
    TableAvaliability findById(long tableId);
}
