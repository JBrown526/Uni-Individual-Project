package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.composite_key.PropertyNegotiationId;
import nextsteps.dev.web.jpa.entity.PropertyNegotiation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyNegotiationRepository extends CrudRepository<PropertyNegotiation, PropertyNegotiationId> {

}
