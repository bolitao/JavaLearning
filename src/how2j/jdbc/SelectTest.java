package how2j.jdbc;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "bolitao", "bolitao");
                Statement statement = connection.createStatement()) {
            String selectAllSQL = "select * from hero";
            ResultSet resultSet = statement.executeQuery(selectAllSQL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                float hp = resultSet.getFloat("hp");
                int damage = resultSet.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d\n", id, name, hp, damage);
            }
            resultSet.close();
            String countSQL = "";
//            ResultSet countResultSet = ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
