package how2j.jdbc;

import java.sql.*;

public class PrepareStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into hero values (null, ?, ?, ?)";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, "提莫");
            statement.setFloat(2, 2.2f);
            statement.setFloat(3, 333f);
            statement.execute();
            System.out.println("执行完毕惹");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
