package repository;

import hongik.challenge.entity.CourseEnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseEnrollmentRepository extends JpaRepository<CourseEnrollmentEntity, Long> {

}
