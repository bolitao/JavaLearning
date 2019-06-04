package how2j.jdbc;

import java.sql.*;

public class JDBCListTest {
    static void listQuery(int start, int count) {
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
            String sql = "SELECT * FROM hero LIMIT " + start + ", " + count;
//            String sql = "select * from hero limit " + start + "," + count;
//            String sql = "select * from hero limit " + start + "," + count;
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                float hp = resultSet.getFloat("hp");
                float damage = resultSet.getFloat("damage");
                System.out.printf("%d\t%s\t%f\t%f\n", id, name, hp, damage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        listQuery(4, 2);
    }
}
