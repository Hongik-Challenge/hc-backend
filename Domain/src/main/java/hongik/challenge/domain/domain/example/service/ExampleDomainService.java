package hongik.challenge.domain.domain.example.service;

import hongik.challenge.common.exception.ExampleCodeException;
import hongik.challenge.domain.domain.example.domain.ExampleEntity;
import hongik.challenge.domain.domain.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExampleDomainService {
    private final ExampleRepository exampleRepository;

    public void exampleException() {
        throw new ExampleCodeException(400, "샘플 오류!", "Example 도메인에서 발생한 샘플 오류입니다.");
    }

    public ExampleEntity exampleQuery(Long id) {
        return exampleRepository
                .findById(id)
                .orElseThrow(() -> new ExampleCodeException(400, "샘플 오류!", "Example 도메인에서 발생한 샘플 오류입니다."));
    }

    public ExampleEntity exampleSave(String content) {
        ExampleEntity exampleBuild = ExampleEntity.builder().example_content(content).build();
        return exampleRepository.save(exampleBuild);
    }
}
