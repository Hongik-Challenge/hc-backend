package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;
import java.util.Date;

@Entity
@Getter
@Table(name = "tbl_student")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentIndex")
    private Integer studentIndex;             // 회원 식별자
    @Column(name="studentKoreanName")
    private String studentKoreanName;       // 회원 한글 이름
    @Column(name="studentEnglishName")
    private String studentEnglishName;      // 회원 영어 이름
    @Column(name="studentBirth")
    private Date studentBirth;              // 회원 생년월일
    @Column(name="studentMajor")
    private String studentMajor;            // 회원 전공 학과
    @Column(name="studentMultiple")
    private String studentMultiple;         // 회원 복수전공 학과
    @Column(name="studentMinor")
    private String studentMinor;            // 회원 부전공 학과
    @Column(name="studentTransfer")
    private Boolean studentTransfer;        // 회원 편입 여부
    @Column(name="studentYear")
    private Year studentYear;               // 회원 재학학년
    @Column(name="studentSemester")
    private Integer studentSemester;        // 회원 수료학기
    @Column(name="studentState")
    private String studentState;            // 회원 학적상태
    @Column(name="studentTimetable")
    private Integer studentTimetable;       // 회원 대표시간표 번호

    @Builder
    public StudentEntity(Integer studentIndex,
                         String studentKoreanName,
                         String studentEnglishName,
                         Date studentBirth,
                         String studentMajor,
                         String studentMultiple,
                         String studentMinor,
                         Boolean studentTransfer,
                         Year studentYear,
                         Integer studentSemester,
                         String studentState,
                         Integer studentTimetable){
        this.studentIndex = studentIndex;
        this.studentKoreanName = studentKoreanName;
        this.studentEnglishName = studentEnglishName;
        this.studentBirth = studentBirth;
        this.studentMajor = studentMajor;
        this.studentMultiple = studentMultiple;
        this.studentMinor = studentMinor;
        this.studentTransfer = studentTransfer;
        this.studentYear = studentYear;
        this.studentSemester = studentSemester;
        this.studentState = studentState;
        this.studentTimetable = studentTimetable;
    }
}
