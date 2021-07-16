package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.Surveyor;
import nextsteps.dev.web.jpa.repository.SurveyorRepository;
import org.springframework.stereotype.Service;

@Service
public class SurveyorService extends BaseService<Surveyor, String>{

    private final SurveyorRepository surveyorRepository;

    public SurveyorService(SurveyorRepository repository) {
        super(repository);
        this.surveyorRepository = repository;
    }
}
