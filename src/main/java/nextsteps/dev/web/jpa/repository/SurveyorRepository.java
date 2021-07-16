package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.Surveyor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyorRepository extends CrudRepository<Surveyor, String> {

    Surveyor findSurveyorByCompanyName(String company);

    List<Surveyor> findSurveyorsByNetworked(boolean networked);
}
