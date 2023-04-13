package hongik.challenge.api.example.service;

import hongik.challenge.api.example.controller.dto.ExampleResponse;
import hongik.challenge.domain.domain.example.domain.ExampleEntity;
import hongik.challenge.domain.domain.example.service.ExampleDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleApiService {
    private final ExampleDomainService exampleDomainService;

    public ExampleResponse getExample() {
        ExampleEntity query = exampleDomainService.exampleQuery(1L);

        return ExampleResponse.from(query);
    }

    public ExampleResponse createExample(){
        ExampleEntity qwer = exampleDomainService.exampleSave("qwer");
        return ExampleResponse.from(qwer);
    }
}
