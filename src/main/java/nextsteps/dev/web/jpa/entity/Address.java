package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "property_id")
    private Long propertyID;
    @Column(name = "address")
    private String addressField1;
    @Column(name = "address_2")
    private String addressField2;
    private String postcode;
    private String city;
    private String country;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Contact contact;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Property propertyListing;

    protected Address() {}

    public Address(String addressField1, String postcode, String country) {
        this.addressField1 = addressField1;
        this.postcode = postcode;
        this.country = country;
    }

    public Address(String addressField1, String postcode, String country, String otherParam, boolean isCity) {
        this.addressField1 = addressField1;
        this.postcode = postcode;
        this.country = country;
        if (isCity) {
            this.city = otherParam;
        } else {
            this.addressField2 = otherParam;
        }
    }

    public Address(String addressField1, String addressField2, String postcode, String city, String country) {
        this.addressField1 = addressField1;
        this.addressField2 = addressField2;
        this.postcode = postcode;
        this.city = city;
        this.country = country;
    }

    public Long getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(Long propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddressField1() {
        return addressField1;
    }

    public void setAddressField1(String address) {
        this.addressField1 = address;
    }

    public String getAddressField2() {
        return addressField2;
    }

    public void setAddressField2(String address2) {
        this.addressField2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Property getPropertyListing() {
        return propertyListing;
    }

    public void setPropertyListing(Property propertyAddress) {
        this.propertyListing = propertyAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "propertyID=" + propertyID +
                ", addressField1='" + addressField1 + '\'' +
                ", addressField2='" + addressField2 + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
