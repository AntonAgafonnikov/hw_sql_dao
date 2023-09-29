package netology.hw_sql_dao.service;

import netology.hw_sql_dao.repository.DataBaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseService {
    DataBaseRepository dataBaseRepository;

    public DataBaseService(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public List<String> getProductName(String name) {
        return dataBaseRepository.getProductName(name);
    }
}
