package nextsteps.dev.web.service;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class BaseService<T, ID> {

    private final CrudRepository<T, ID> repository;

    public BaseService(CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        List<T> objs = new ArrayList<>();
        repository.findAll().forEach(objs::add);
        return objs;
    }

    public T getOne(ID id) {
        return repository.findById(id).orElse(null);
    }

    public void addEntry(T obj) {
        repository.save(obj);
    }

    public void updateEntry(T obj) {
        repository.save(obj);
    }

    public void deleteEntryId(ID id) {
        repository.deleteById(id);
    }

    public void deleteEntry(T obj) {
        repository.delete(obj);
    }
}
