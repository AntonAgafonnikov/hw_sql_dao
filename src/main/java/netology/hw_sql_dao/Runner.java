package netology.hw_sql_dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import netology.hw_sql_dao.reader.ReaderSQLScript;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner implements CommandLineRunner {

    @PersistenceContext
    EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.run(args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        entityManager.createNativeQuery(ReaderSQLScript.read("CreateTableCustomers.sql")).executeUpdate();
        entityManager.createNativeQuery(ReaderSQLScript.read("CreateTableOrders.sql")).executeUpdate();
        entityManager.createNativeQuery(ReaderSQLScript.read("InsertTableCustomers.sql")).executeUpdate();
        entityManager.createNativeQuery(ReaderSQLScript.read("InsertTableOrders.sql")).executeUpdate();
    }
}
