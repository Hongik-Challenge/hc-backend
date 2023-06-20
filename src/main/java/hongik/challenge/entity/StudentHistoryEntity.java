package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;

@Entity
@Getter
@Table(name = "tbl_student_history")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentHistoryIndex")
    private Integer studentHistoryIndex;    // 수강내역 교과목 식별자
    @Column(name="studentIndex")
    private Integer studentIndex;          // 학생 식별자
    @Column(name="courseIndex")
    private Integer courseIndex;             // 교과목 식별자
    @Column(name="historyYear")
    private Year historyYear;              // 수강내역 교과목 이수연도
    @Column(name="historySemester")
    private Integer historySemester;       // 수강내역 교과목 이수학기
    @Column(name="historyProfessor")
    private String historyProfessor;       // 수강내역 교수
    @Column(name="historyGrade")
    private Double historyGrade;          // 수강내역 학점
    @Column(name="historyIsEnglish")
    private Boolean historyIsEnglish;      // 수강내역 교과목 영어강좌 여부
    @Column(name="historyIsCyber")
    private Boolean historyIsCyber;        // 수강내역 교과목 사이버강좌 여부
    @Column(name="historyNote")
    private String historyNote;            // 수강내역 비고

    @Builder
    public StudentHistoryEntity(Integer studentHistoryIndex,
                                Integer studentIndex,
                                Integer courseIndex,
                                Year historyYear,
                                Integer historySemester,
                                String historyProfessor,
                                Double historyGrade,
                                Boolean historyIsEnglish,
                                Boolean historyIsCyber,
                                String historyNote){
        this.studentHistoryIndex = studentHistoryIndex;
        this.studentIndex = studentIndex;
        this.courseIndex = courseIndex;
        this.historyYear = historyYear;
        this.historySemester = historySemester;
        this.historyProfessor = historyProfessor;
        this.historyGrade = historyGrade;
        this.historyIsEnglish = historyIsEnglish;
        this.historyIsCyber = historyIsCyber;
        this.historyNote = historyNote;
    }
}
