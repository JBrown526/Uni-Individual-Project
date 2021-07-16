package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.Property;
import nextsteps.dev.web.jpa.repository.PropertyRepository;

public class PropertyService extends BaseService<Property, Long> {

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        super(propertyRepository);
        this.propertyRepository = propertyRepository;
    }
}
