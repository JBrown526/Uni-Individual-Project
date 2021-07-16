package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.MortgageAdvisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MortgageAdvisorRepository extends CrudRepository<MortgageAdvisor, String> {

    MortgageAdvisor getMortgageAdvisorByCompanyName(String company);

    List<MortgageAdvisor> getMortgageAdvisorsByNetworked(boolean networked);
}
