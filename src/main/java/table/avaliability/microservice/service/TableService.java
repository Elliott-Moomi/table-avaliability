package table.avaliability.microservice.service;

import org.springframework.stereotype.Service;
import table.avaliability.microservice.domain.TableAvaliability;
import table.avaliability.microservice.repository.TableAvaliabilityRepository;


@Service
public class TableService {

    private final TableAvaliabilityRepository repository;

    public TableService(TableAvaliabilityRepository repository) {
        this.repository = repository;
    }

    public TableAvaliability findById(long tableId) {
        return repository.findById(tableId);
    }

    public TableAvaliability update(long tableId ,TableAvaliability tableRequest) {
        TableAvaliability tableAvaliability =  repository.findById(tableId);

        tableAvaliability.setAvaliable(tableRequest.isAvaliable());
        tableAvaliability.setLocation(tableRequest.getLocation());
        tableAvaliability.setCapacity(tableRequest.getCapacity());

        return repository.save(tableAvaliability);
    }
}
