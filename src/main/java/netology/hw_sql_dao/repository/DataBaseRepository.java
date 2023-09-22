package netology.hw_sql_dao.repository;

import netology.hw_sql_dao.reader.ReaderSQLScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DataBaseRepository {
    private static final String pathScript = "myScript.sql";

    @Autowired
    private DataSource dataSource;

    public List<String> getProductName(String name) throws SQLException {
        Connection connection = dataSource.getConnection();
        String query = ReaderSQLScript.read(pathScript);
        List<String> products = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, name);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                String nameProduct = result.getString("product_name");
                products.add(nameProduct);
            }

        }
        return products;
    }
}
