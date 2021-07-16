package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.PurchaseRecord;
import nextsteps.dev.web.jpa.repository.PurchaseRecordRepository;

public class PurchaseRecordService extends BaseService<PurchaseRecord, Long> {

    private final PurchaseRecordRepository purchaseRecordRepository;

    public PurchaseRecordService(PurchaseRecordRepository purchaseRecordRepository) {
        super(purchaseRecordRepository);
        this.purchaseRecordRepository = purchaseRecordRepository;
    }
}
