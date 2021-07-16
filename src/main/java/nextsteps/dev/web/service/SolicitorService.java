package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.Solicitor;
import nextsteps.dev.web.jpa.repository.SolicitorRepository;

public class SolicitorService extends BaseService<Solicitor, String> {

    private final SolicitorRepository solicitorRepository;

    public SolicitorService(SolicitorRepository solicitorRepository) {
        super(solicitorRepository);
        this.solicitorRepository = solicitorRepository;
    }
}
