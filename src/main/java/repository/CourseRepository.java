package repository;

import hongik.challenge.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    CourseEntity findByCourseIndex(int courseIndex);
}
