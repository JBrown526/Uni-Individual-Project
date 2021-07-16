package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.MortgageProvider;
import nextsteps.dev.web.jpa.repository.MortgageProviderRepository;

public class MortgageProviderService extends BaseService<MortgageProvider, String> {

    private MortgageProviderRepository mortgageProviderRepository;

    public MortgageProviderService(MortgageProviderRepository mortgageProviderRepository) {
        super(mortgageProviderRepository);
        this.mortgageProviderRepository = mortgageProviderRepository;
    }
}
