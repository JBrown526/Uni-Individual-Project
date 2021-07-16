package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "purchase_record")
public class PurchaseRecord {

    @Id
    @GeneratedValue
    @Column(name = "purchase_id")
    private long purchaseId;
    @ManyToOne
    @JoinColumn(name = "user_email", referencedColumnName = "user_email")
    private User user;
    @ManyToOne
    @JoinColumn(name = "mortgage_provider_email", referencedColumnName = "mortgage_provider_email")
    private MortgageProvider mortgageProvider;
    @ManyToOne
    @JoinColumn(name = "mortgage_advisor_email", referencedColumnName = "mortgage_advisor_email")
    private MortgageAdvisor mortgageAdvisor;
    @ManyToOne
    @JoinColumn(name = "buyers_solicitor_email", referencedColumnName = "solicitor_email")
    private Solicitor buyerSolicitor;
    @ManyToOne
    @JoinColumn(name = "sellers_solicitor_email", referencedColumnName = "solicitor_email")
    private Solicitor sellerSolicitor;
    @ManyToOne
    @JoinColumn(name = "surveyor_email", referencedColumnName = "surveyor_email")
    private Surveyor surveyor;
    @OneToOne(mappedBy = "purchaseRecord", cascade = CascadeType.ALL)
    private PropertyNegotiation propertyNegotiation;

    protected PurchaseRecord() {}

    private PurchaseRecord(PurchaseRecordBuilder purchaseRecordBuilder) {
        user = purchaseRecordBuilder.user;
        mortgageProvider = purchaseRecordBuilder.mortgageProvider;
        mortgageAdvisor = purchaseRecordBuilder.mortgageAdvisor;
        buyerSolicitor = purchaseRecordBuilder.buyerSolicitor;
        sellerSolicitor = purchaseRecordBuilder.sellerSolicitor;
        surveyor = purchaseRecordBuilder.surveyor;
    }

    public static class PurchaseRecordBuilder {
        private final User user;
        private MortgageProvider mortgageProvider;
        private MortgageAdvisor mortgageAdvisor;
        private Solicitor buyerSolicitor;
        private Solicitor sellerSolicitor;
        private Surveyor surveyor;

        public PurchaseRecordBuilder(User user) {
            this.user = user;
        }

        public PurchaseRecordBuilder withMortgageProvider(MortgageProvider mortgageProvider) {
            this.mortgageProvider = mortgageProvider;
            return this;
        }

        public PurchaseRecordBuilder withMortgageAdvisor(MortgageAdvisor mortgageAdvisor) {
            this.mortgageAdvisor = mortgageAdvisor;
            return this;
        }

        public PurchaseRecordBuilder withBuyerSolicitor(Solicitor solicitor) {
            this.buyerSolicitor = solicitor;
            return this;
        }

        public PurchaseRecordBuilder withSellerSolicitor(Solicitor solicitor) {
            this.sellerSolicitor = solicitor;
            return this;
        }

        public PurchaseRecordBuilder withSurveyor(Surveyor surveyor) {
            this.surveyor = surveyor;
            return this;
        }

        public PurchaseRecord build() {
            return new PurchaseRecord(this);
        }
    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MortgageProvider getMortgageProvider() {
        return mortgageProvider;
    }

    public void setMortgageProvider(MortgageProvider mortgageProvider) {
        this.mortgageProvider = mortgageProvider;
    }

    public MortgageAdvisor getMortgageAdvisor() {
        return mortgageAdvisor;
    }

    public void setMortgageAdvisor(MortgageAdvisor mortgageAdvisor) {
        this.mortgageAdvisor = mortgageAdvisor;
    }

    public Solicitor getBuyerSolicitor() {
        return buyerSolicitor;
    }

    public void setBuyerSolicitor(Solicitor buyerSolicitor) {
        this.buyerSolicitor = buyerSolicitor;
    }

    public Solicitor getSellerSolicitor() {
        return sellerSolicitor;
    }

    public void setSellerSolicitor(Solicitor sellerSolicitor) {
        this.sellerSolicitor = sellerSolicitor;
    }

    public Surveyor getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(Surveyor surveyor) {
        this.surveyor = surveyor;
    }

    public PropertyNegotiation getPropertyNegotiation() {
        return propertyNegotiation;
    }

    public void setPropertyNegotiation(PropertyNegotiation propertyNegotiation) {
        this.propertyNegotiation = propertyNegotiation;
    }

    @Override
    public String toString() {
        return "PurchaseRecord{" +
                "purchaseId=" + purchaseId +
                '}';
    }
}
