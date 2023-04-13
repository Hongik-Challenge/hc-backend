package hongik.challenge.api.example.controller.dto;

import hongik.challenge.domain.domain.example.domain.ExampleEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ExampleResponse {
    private final Long id;
    private final String content;

    public static ExampleResponse from(ExampleEntity exampleEntity) {
        return new ExampleResponse(
                exampleEntity.getExample_id(), exampleEntity.getExample_content());
    }
}
