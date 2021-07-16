package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.Solicitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitorRepository extends CrudRepository<Solicitor, String> {

    Solicitor getSolicitorByCompanyName(String company);

    List<Solicitor> getSolicitorsByNetworked(boolean networked);
}
