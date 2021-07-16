package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.MortgageProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MortgageProviderRepository extends CrudRepository<MortgageProvider, String> {

    List<MortgageProvider> getMortgageProvidersByNetworked(boolean networked);
}
