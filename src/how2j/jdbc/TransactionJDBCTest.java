package how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionJDBCTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                Statement statement = connection.createStatement()
        ) {
            connection.setAutoCommit(false);
            String sql1 = "update hero set hp = hp +1 where id = 69835";
            statement.execute(sql1);
            String sql2 = "updata hero set hp = hp -1 where id = 69835";
            statement.execute(sql2);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
