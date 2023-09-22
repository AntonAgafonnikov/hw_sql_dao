package netology.hw_sql_dao;

import netology.hw_sql_dao.reader.ReaderSQLScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

@SpringBootApplication
public class Runner implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.run(args);
    }

    @Override
    public void run(String... args) throws SQLException {
        jdbcTemplate.execute(ReaderSQLScript.read("CreateTableCustomers.sql"));
        jdbcTemplate.execute(ReaderSQLScript.read("CreateTableOrders.sql"));
        jdbcTemplate.execute(ReaderSQLScript.read("InsertTableCustomers.sql"));
        jdbcTemplate.execute(ReaderSQLScript.read("InsertTableOrders.sql"));
    }
}
