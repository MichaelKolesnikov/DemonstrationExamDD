package dd.DemonstrationExamDd;

import dd.DemonstrationExamDd.model.Country;
import dd.DemonstrationExamDd.model.User;
import dd.DemonstrationExamDd.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemonstrationExamDdApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemonstrationExamDdApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("John", 25, Country.USA));
            userRepository.save(new User("Ivan", 30, Country.RUSSIA));
            userRepository.save(new User("Hans", 20, Country.GERMANY));
            userRepository.save(new User("Pierre", 18, Country.FRANCE));
            userRepository.save(new User("Yuki", 22, Country.JAPAN));
        };
    }
}