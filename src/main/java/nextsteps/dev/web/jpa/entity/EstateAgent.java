package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estate_agent")
public class EstateAgent {

    @Id
    @Column(name = "estate_agent_email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "estate_agent_email", referencedColumnName = "email")
    private Contact contact;
    @Column(name = "company_name")
    private String companyName;
    @OneToMany(mappedBy = "estateAgent", cascade = CascadeType.ALL)
    private List<PropertyNegotiation> propertyNegotiations = new ArrayList<>();

    protected EstateAgent() {}

    public EstateAgent(Contact contact) {
        this.contact = contact;
        email = contact.getEmail();
    }

    public EstateAgent(Contact contact, String companyName) {
        this.contact = contact;
        email = contact.getEmail();
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<PropertyNegotiation> getPropertyNegotiations() {
        return propertyNegotiations;
    }

    public void setPropertyNegotiations(List<PropertyNegotiation> propertyNegotiations) {
        this.propertyNegotiations = propertyNegotiations;
    }

    @Override
    public String toString() {
        return "EstateAgent{" +
                "email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
