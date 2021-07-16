package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.PropertyNegotiation;
import nextsteps.dev.web.jpa.entity.composite_key.PropertyNegotiationId;
import nextsteps.dev.web.jpa.repository.PropertyNegotiationRepository;

public class PropertyNegotiationService extends BaseService<PropertyNegotiation, PropertyNegotiationId> {

    private final PropertyNegotiationRepository propertyNegotiationRepository;

    public PropertyNegotiationService(PropertyNegotiationRepository propertyNegotiationRepository) {
        super(propertyNegotiationRepository);
        this.propertyNegotiationRepository = propertyNegotiationRepository;
    }
}
