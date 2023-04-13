package hongik.challenge.domain.domain.example.repository;

import hongik.challenge.domain.domain.example.domain.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {}
