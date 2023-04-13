package hongik.challenge.domain.domain.example.domain;

import hongik.challenge.domain.common.BaseTimeEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExampleEntity extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long example_id;

    private String example_content;

    @Builder
    public ExampleEntity(String example_content) {
        this.example_content = example_content;
    }
}
