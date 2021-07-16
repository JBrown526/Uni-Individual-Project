package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.PurchaseRecord;
import nextsteps.dev.web.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRecordRepository extends CrudRepository<PurchaseRecord, Long> {

    List<PurchaseRecord> findPurchaseRecordsByUser(User user);
}
