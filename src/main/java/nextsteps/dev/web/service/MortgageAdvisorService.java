package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.MortgageAdvisor;
import nextsteps.dev.web.jpa.repository.MortgageAdvisorRepository;

public class MortgageAdvisorService extends BaseService<MortgageAdvisor, String> {

    private final MortgageAdvisorRepository mortgageAdvisorRepository;

    public MortgageAdvisorService(MortgageAdvisorRepository mortgageAdvisorRepository) {
        super(mortgageAdvisorRepository);
        this.mortgageAdvisorRepository = mortgageAdvisorRepository;
    }
}
