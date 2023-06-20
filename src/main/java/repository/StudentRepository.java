package repository;

import hongik.challenge.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<StudentEntity, Long> {
    StudentEntity findByStudentIndex(int studentIndex);
}
