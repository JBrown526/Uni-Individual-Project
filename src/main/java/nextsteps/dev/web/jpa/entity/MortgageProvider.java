package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mortgage_provider")
public class MortgageProvider {

    @Id
    @Column(name = "mortgage_provider_email")
    private String email;
    @OneToOne
    @MapsId
    @JoinColumn(name = "mortgage_provider_email", referencedColumnName = "email")
    private Contact contact;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "in_network")
    private boolean networked;
    @OneToMany(mappedBy = "mortgageProvider", cascade = CascadeType.ALL)
    private List<PurchaseRecord> purchaseRecords = new ArrayList<>();

    protected MortgageProvider() {}

    public MortgageProvider(Contact contact, boolean networked) {
        this.contact = contact;
        email = contact.getEmail();
        this.networked = networked;
    }

    public MortgageProvider(Contact contact, String companyName, boolean networked) {
        this.contact = contact;
        email = contact.getEmail();
        this.companyName = companyName;
        this.networked = networked;
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

    public boolean isNetworked() {
        return networked;
    }

    public void setNetworked(boolean networked) {
        this.networked = networked;
    }

    public List<PurchaseRecord> getPurchaseRecords() {
        return purchaseRecords;
    }

    public void setPurchaseRecords(List<PurchaseRecord> purchaseRecords) {
        this.purchaseRecords = purchaseRecords;
    }

    @Override
    public String toString() {
        return "MortgageProvider{" +
                "email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                ", networked=" + networked +
                '}';
    }
}
