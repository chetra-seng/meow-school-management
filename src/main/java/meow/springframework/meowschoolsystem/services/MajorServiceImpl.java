package meow.springframework.meowschoolsystem.services;

import meow.springframework.meowschoolsystem.model.Major;
import meow.springframework.meowschoolsystem.repositories.MajorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService{
    private final MajorRepository majorRepository;

    public MajorServiceImpl(MajorRepository majorRepository) {
        this.majorRepository = majorRepository;
    }

    @Override
    public List<Major> getAllMajors() {
        return ((List<Major>)majorRepository.findAll());
    }
}
