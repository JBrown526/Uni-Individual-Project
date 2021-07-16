package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.Address;
import nextsteps.dev.web.jpa.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends BaseService<Address, Long>{

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        super(addressRepository);
        this.addressRepository = addressRepository;
    }
}
