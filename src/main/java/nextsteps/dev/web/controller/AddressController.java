package nextsteps.dev.web.controller;

import nextsteps.dev.web.jpa.entity.Address;
import nextsteps.dev.web.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address")
    public List<Address> getAllAddresses() {
        return addressService.getAll();
    }

    @GetMapping("/address/{id}")
    public Address getAddress(@PathVariable Long id) {
        return addressService.getOne(id);
    }

    @PostMapping("/address")
    public void addAddress(@RequestBody Address address) {
        addressService.addEntry(address);
    }

}
