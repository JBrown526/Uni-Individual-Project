package nextsteps.dev.web.jpa.entity;

import nextsteps.dev.web.jpa.entity.composite_key.PropertyNegotiationId;

import javax.persistence.*;

@Entity
@IdClass(PropertyNegotiationId.class)
@Table(name = "property_negotiation")
public class PropertyNegotiation {

    @Id
    @Column(name = "purchase_id")
    private Long purchaseId;
    @OneToOne
    @MapsId("purchaseId")
    @JoinColumn(name = "purchase_id", referencedColumnName = "purchase_id")
    private PurchaseRecord purchaseRecord;
    @Id
    @Column(name = "property_id")
    private Long propertyId;
    @ManyToOne
    @MapsId("propertyId")
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    private Property property;
    @ManyToOne
    @JoinColumn(name = "estate_agent_email", referencedColumnName = "estate_agent_email")
    private EstateAgent estateAgent;
    private int offer;

    protected PropertyNegotiation() {}

    public PropertyNegotiation(PurchaseRecord purchaseRecord, Property property) {
        this.purchaseRecord = purchaseRecord;
        this.property = property;
        purchaseId = purchaseRecord.getPurchaseId();
        propertyId = property.getId();
    }

    public PropertyNegotiation(PurchaseRecord purchaseRecord, Property property, EstateAgent estateAgent) {
        this.purchaseRecord = purchaseRecord;
        this.property = property;
        purchaseId = purchaseRecord.getPurchaseId();
        propertyId = property.getId();
        this.estateAgent = estateAgent;
    }

    public PropertyNegotiation(PurchaseRecord purchaseRecord, Property property, int offer) {
        this.purchaseRecord = purchaseRecord;
        this.property = property;
        purchaseId = purchaseRecord.getPurchaseId();
        propertyId = property.getId();
        this.offer = offer;
    }

    public PropertyNegotiation(PurchaseRecord purchaseRecord, Property property, EstateAgent estateAgent, int offer) {
        this.purchaseRecord = purchaseRecord;
        this.property = property;
        purchaseId = purchaseRecord.getPurchaseId();
        propertyId = property.getId();
        this.estateAgent = estateAgent;
        this.offer = offer;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public PurchaseRecord getPurchaseRecord() {
        return purchaseRecord;
    }

    public void setPurchaseRecord(PurchaseRecord purchaseRecord) {
        this.purchaseRecord = purchaseRecord;
    }

    public Property getPropertyEntity() {
        return property;
    }

    public void setPropertyEntity(Property property) {
        this.property = property;
    }

    public EstateAgent getEstateAgent() {
        return estateAgent;
    }

    public void setEstateAgent(EstateAgent estateAgent) {
        this.estateAgent = estateAgent;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "PropertyNegotiation{" +
                "purchaseId=" + purchaseId +
                ", propertyId=" + propertyId +
                ", offer=" + offer +
                '}';
    }
}
