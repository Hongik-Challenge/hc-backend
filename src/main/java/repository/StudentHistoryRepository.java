package repository;

import hongik.challenge.entity.StudentHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentHistoryRepository  extends JpaRepository<StudentHistoryEntity, Long> {
    List<StudentHistoryEntity> findAllByStudentIndex(int studentIndex);
}
