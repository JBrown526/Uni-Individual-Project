package nextsteps.dev.web.controller;

import nextsteps.dev.web.service.BaseService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BaseController<T, ID> {

    private final BaseService<T, ID> baseService;
    private static final String basePath;

    public BaseController(BaseService<T, ID> baseService, String path) {
        this.baseService = baseService;
        basePath = "/" + path;
    }

    @GetMapping(basePath)
    public List<T> getAll() {
        return baseService.getAll();
    }
}
