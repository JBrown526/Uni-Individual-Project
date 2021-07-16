package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "solicitor")
public class Solicitor {

    @Id
    @Column(name = "solicitor_email")
    private String email;
    @OneToOne
    @MapsId
    @JoinColumn(name = "solicitor_email", referencedColumnName = "email")
    private Contact contact;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "in_network")
    private boolean networked;
    @OneToMany(mappedBy = "buyerSolicitor", cascade = CascadeType.ALL)
    private List<PurchaseRecord> purchaseRecordsBuyer = new ArrayList<>();
    @OneToMany(mappedBy = "sellerSolicitor", cascade = CascadeType.ALL)
    private List<PurchaseRecord> purchaseRecordsSeller = new ArrayList<>();

    protected Solicitor() {}

    public Solicitor(Contact contact, boolean networked) {
        this.contact = contact;
        email = contact.getEmail();
        this.networked = networked;
    }

    public Solicitor(Contact contact, String companyName, boolean networked) {
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

    public List<PurchaseRecord> getPurchaseRecordsBuyer() {
        return purchaseRecordsBuyer;
    }

    public void setPurchaseRecordsBuyer(List<PurchaseRecord> purchaseRecordsBuyer) {
        this.purchaseRecordsBuyer = purchaseRecordsBuyer;
    }

    public List<PurchaseRecord> getPurchaseRecordsSeller() {
        return purchaseRecordsSeller;
    }

    public void setPurchaseRecordsSeller(List<PurchaseRecord> purchaseRecordsSeller) {
        this.purchaseRecordsSeller = purchaseRecordsSeller;
    }

    @Override
    public String toString() {
        return "Solicitor{" +
                "email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                ", networked=" + networked +
                '}';
    }
}
