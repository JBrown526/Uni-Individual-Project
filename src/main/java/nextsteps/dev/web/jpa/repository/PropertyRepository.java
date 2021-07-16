package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {

}
