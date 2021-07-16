package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.Address;
import nextsteps.dev.web.jpa.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {

    List<Contact> findContactsByLastName(String lastName);

    List<Contact> findContactByAddress(Address address);

    Contact findContactByAddress_PropertyID(Long id);
}
