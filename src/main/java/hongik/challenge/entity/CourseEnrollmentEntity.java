package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tbl_course_enrollment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CourseEnrollmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="enrollmentIndex")
    private Integer enrollmentIndex;                  // 수강신청 교과목 식별자
    @Column(name="courseIndex")
    private Integer courseIndex;                      // 강의 식별자
    @Column(name="enrollmentNum")
    private Integer enrollmentNum;                    // 수강신청 교과목 분반번호
    @Column(name="enrollmentProfessor")
    private String enrollmentProfessor;             // 수강신청 교과목 교수
    @Column(name="enrollmentDepartment")
    private String enrollmentDepartment;              // 수강신청 교과목 학과
    @Column(name="enrollmentEngineering")
    private Boolean enrollmentEngineering;          // 수강신청 교과목 공학인증 여부
    @Column(name="enrollmentRoom")
    private String enrollmentRoom;                  // 수강신청 교과목 강의실
    @Column(name="enrollmentTime")
    private String enrollmentTime;                  // 수강신청 교과목 시간표
    @Column(name="enrollmentTo")
    private String enrollmentTo;                    // 수강신청 교과목 TO
    @Column(name="enrollmentCompetition")
    private String enrollmentCompetition;           // 수강신청 교과목 담아두기 인원
    @Column(name="enrollmentCompetitionHistory")
    private String enrollmentCompetitionHistory;    // 수강신청 교과목 과거 경쟁률
    @Column(name="enrollmentIsEnglish")
    private Boolean enrollmentIsEnglish;            // 수강신청 영어강좌 여부
    @Column(name="enrollmentIsCyber")
    private Boolean enrollmentIsCyber;              // 수강신청 사이버강좌 여부

    @Builder
    public CourseEnrollmentEntity(Integer enrollmentIndex,
                                  Integer courseIndex,
                                  Integer enrollmentNum,
                                  String enrollmentProfessor,
                                  String enrollmentDepartment,
                                  Boolean enrollmentEngineering,
                                  String enrollmentRoom,
                                  String enrollmentTime,
                                  String enrollmentTo,
                                  String enrollmentCompetition,
                                  String enrollmentCompetitionHistory,
                                  Boolean enrollmentIsEnglish,
                                  Boolean enrollmentIsCyber){
        this.enrollmentIndex = enrollmentIndex;
        this.courseIndex = courseIndex;
        this.enrollmentNum = enrollmentNum;
        this.enrollmentProfessor = enrollmentProfessor;
        this.enrollmentEngineering = enrollmentEngineering;
        this.enrollmentDepartment = enrollmentDepartment;
        this.enrollmentRoom = enrollmentRoom;
        this.enrollmentTime = enrollmentTime;
        this.enrollmentTo = enrollmentTo;
        this.enrollmentCompetition = enrollmentCompetition;
        this.enrollmentCompetitionHistory = enrollmentCompetitionHistory;
        this.enrollmentIsCyber = enrollmentIsCyber;
        this.enrollmentIsEnglish = enrollmentIsEnglish;
    }
}
