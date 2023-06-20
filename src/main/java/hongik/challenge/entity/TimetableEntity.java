package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tbl_timetable")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TimetableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="timetableIndex")
    private Integer timetableIndex;      // 수강신청 시간표 식별자

    @Column(name="studentIndex")
    private String studentIndex;      // 수강신청 시간표 이름

    @Column(name="timetableOrder")
    private Integer timetableOrder;      // 수강신청 순서

    @Builder
    public TimetableEntity(Integer timetableIndex,
                           String studentIndex,
                           Integer timetableOrder){
        this.timetableIndex = timetableIndex;
        this.studentIndex = studentIndex;
        this.timetableOrder = timetableOrder;
    }
}
