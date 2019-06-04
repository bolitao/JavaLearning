package how2j.jdbc;

import java.sql.*;

public class PasswordJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "bolitao", "bolitao");
                Statement statement = connection.createStatement()) {
            String name = "bolitao";
            String password = "bolitao";
            // 正确密码是 bolitao
//            String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";
            String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println("密码正确");
            } else {
                System.out.println("密码错误");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
