package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tbl_timetable_enrollment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TimetableEnrollmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="timetableEnrollmentIndex")
    private Integer timetableCourseIndex;        // 대표시간표 식별자
    @Column(name="timetableEnrollmentOrder")
    private String timetableEnrollmentOrder;    // 대표시간표 정보

    @Builder
    public TimetableEnrollmentEntity(Integer timetableCourseIndex,
                                     String timetableEnrollmentOrder){
        this.timetableCourseIndex = timetableCourseIndex;
        this.timetableEnrollmentOrder = timetableEnrollmentOrder;
    }
}
