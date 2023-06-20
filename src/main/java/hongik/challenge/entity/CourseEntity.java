package hongik.challenge.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tbl_course")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="courseIndex")
    private Integer courseIndex;                  // 강의 식별자
    @Column(name="courseKoreanName")
    private String courseKoreanName;            // 강의 한글 이름
    @Column(name="courseEnglishName")
    private String courseEnglishName;           // 강의 영어 이름
    @Column(name="courseGrade")
    private Integer courseGrade;                // 강의 학점
    @Column(name="courseClass")
    private String courseClass;
    @Column(name="courseDepartment")
    private String courseDepartment;           // 강의 주관 학과
    @Column(name="courseRestrictDepartment")
    private String courseRestrictDepartment;   // 강의 제한 학과
    @Column(name="courseSemester")
    private Integer courseSemester;             // 강의 개설 학기

    @Builder
    public CourseEntity(Integer courseIndex,
                         String courseKoreanName,
                         String courseEnglishName,
                         Integer courseGrade,
                         String courseClass,
                         String courseDepartment,
                         String courseRestrictDepartment,
                         Integer courseSemester){
        this.courseIndex = courseIndex;
        this.courseKoreanName = courseKoreanName;
        this.courseEnglishName = courseEnglishName;
        this.courseGrade = courseGrade;
        this.courseClass = courseClass;
        this.courseDepartment = courseDepartment;
        this.courseRestrictDepartment = courseRestrictDepartment;
        this.courseSemester = courseSemester;
    }
}
