package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.EstateAgent;
import nextsteps.dev.web.jpa.repository.EstateAgentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstateAgentService extends BaseService<EstateAgent, String>{

    private final EstateAgentRepository estateAgentRepository;

    public EstateAgentService(EstateAgentRepository estateAgentRepository) {
        super(estateAgentRepository);
        this.estateAgentRepository = estateAgentRepository;
    }

//    public List<EstateAgent> getEstateAgents() {
//        List<EstateAgent> estateAgents = new ArrayList<>();
//        estateAgentRepository.findAll().forEach(estateAgents::add);
//        return estateAgents;
//    }
//
//    public EstateAgent getEstateAgent(String id) {
//        return estateAgentRepository.findById(id).orElse(null);
//    }
//
//    public void addEstateAgent(EstateAgent estateAgent) {
//        estateAgentRepository.save(estateAgent);
//    }
//
//    public void deleteEstateAgent(String id) {
//        estateAgentRepository.deleteById(id);
//    }
}