package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.Contact;
import nextsteps.dev.web.jpa.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService extends BaseService<Contact, String>{

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        super(contactRepository);
        this.contactRepository = contactRepository;
    }

    public Contact getContactByAddressId(Long id) {
        return contactRepository.findContactByAddress_PropertyID(id);
    }

}
