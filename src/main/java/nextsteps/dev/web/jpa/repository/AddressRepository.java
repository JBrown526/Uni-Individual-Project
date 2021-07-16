package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findAddressesByPostcode(String postcode);

    List<Address> findAddressesByCity(String city);

    List<Address> findAddressesByCountry(String country);
}
