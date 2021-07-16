package nextsteps.dev.web.jpa.entity.composite_key;

import java.io.Serializable;
import java.util.Objects;

public class PropertyNegotiationId implements Serializable {

    private final Long purchaseId;
    private final Long propertyId;

    public PropertyNegotiationId(Long purchaseId, Long propertyId) {
        this.purchaseId = purchaseId;
        this.propertyId = propertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyNegotiationId that = (PropertyNegotiationId) o;
        return purchaseId == that.purchaseId && propertyId == that.propertyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseId, propertyId);
    }
}
