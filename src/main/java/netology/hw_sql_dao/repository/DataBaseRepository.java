package netology.hw_sql_dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import netology.hw_sql_dao.model.Customer;
import netology.hw_sql_dao.reader.ReaderSQLScript;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataBaseRepository {
    private static final String pathScript = "myScript.sql";
    private static String script = ReaderSQLScript.read(pathScript);

    @PersistenceContext
    EntityManager entityManager;

    public List<String> getProductName(String name) {
        Query queryEM = entityManager.createQuery(script, Customer.class);
        queryEM.setParameter("queryName", name);
        return queryEM.getResultList();
    }
}
