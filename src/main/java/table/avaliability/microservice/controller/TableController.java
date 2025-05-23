package table.avaliability.microservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import table.avaliability.microservice.domain.TableAvaliability;
import table.avaliability.microservice.service.TableService;


@RestController
@RequestMapping(path = "api/tables")
public class TableController {
    private final TableService tableService;

    public TableController(final TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TableAvaliability getTable (@PathVariable("id") final long id) {
        return tableService.findById(id);
    }

    @PutMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TableAvaliability updateTable (@PathVariable("id") final long id, @RequestBody final TableAvaliability tableRequest) {
        return tableService.update(id, tableRequest);
    }
}

