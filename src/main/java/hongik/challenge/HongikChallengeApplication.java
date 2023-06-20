package hongik.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HongikChallengeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HongikChallengeApplication.class, args);
    }
}
