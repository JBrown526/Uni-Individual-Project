package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "property")
public class Property {

    @Id
    @Column(name = "property_id")
    private Long id;
    @OneToOne
    @MapsId
    @JoinColumn(name = "property_id", referencedColumnName = "`property_id`")
    private Address address;
    private int valuation;
    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<PropertyNegotiation> propertyNegotiations = new ArrayList<>();

    protected Property() {}

    public Property(Address address) {
        this.address = address;
        id = address.getPropertyID();
    }

    public Property(Address address, int valuation) {
        this.address = address;
        id = address.getPropertyID();
        this.valuation = valuation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getValuation() {
        return valuation;
    }

    public void setValuation(int valuation) {
        this.valuation = valuation;
    }

    public List<PropertyNegotiation> getPropertyNegotiations() {
        return propertyNegotiations;
    }

    public void setPropertyNegotiations(List<PropertyNegotiation> propertyNegotiations) {
        this.propertyNegotiations = propertyNegotiations;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", valuation=" + valuation +
                '}';
    }
}
