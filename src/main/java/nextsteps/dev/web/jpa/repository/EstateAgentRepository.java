package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.EstateAgent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateAgentRepository extends CrudRepository<EstateAgent, String> {

    EstateAgent findEstateAgentByCompanyName(String company);
}
