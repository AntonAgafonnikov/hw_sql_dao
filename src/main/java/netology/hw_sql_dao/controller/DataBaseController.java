package netology.hw_sql_dao.controller;

import netology.hw_sql_dao.service.DataBaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class DataBaseController {
    DataBaseService dataBaseService;

    public DataBaseController(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getAuthorities(@RequestParam("name") String name) throws SQLException {
        return dataBaseService.getProductName(name);
    }
}
