package how2j.jdbc;

import java.sql.*;

public class CountJDBCTest {
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
            String sql = "select count(*) from hero";
            ResultSet resultSet = statement.executeQuery(sql);
            int total = 0;
            while (resultSet.next()) {
                total = resultSet.getInt(1);
//                total = Integer.parseInt(resultSet.getString(1));
            }
            System.out.println(total);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
