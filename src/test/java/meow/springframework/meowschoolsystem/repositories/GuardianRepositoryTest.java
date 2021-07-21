package meow.springframework.meowschoolsystem.repositories;

import meow.springframework.meowschoolsystem.model.Guardian;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GuardianRepositoryTest {
    @Autowired
    private GuardianRepository guardianRepository;

    @Test
    void saveGuardian(){
        Guardian guardian = new Guardian("Seng", "Hak", "Male", "092823836", "Battambang");
        guardianRepository.save(guardian);
    }
}