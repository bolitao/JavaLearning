package how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
//        常规写法
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("数据库驱动加载成功");
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "bolitao", "bolitao");
//            System.out.println("连接成功，获取连接对象：" + connection);
//            statement = connection.createStatement();
//            System.out.println("获取 statement 对象：" + statement);
//            String sql = "INSERT INTO hero VALUES(NULL, " + "'提莫'" + ", + " + 313.0f + ", " + 50 + ")";
//            statement.execute(sql);
//            System.out.println("执行插入语句成功");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                    System.out.println("关闭 statment");
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                    System.out.println("关闭 connection");
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        // 关闭流的写法
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try (
//                Connection connection = DriverManager.getConnection(
//        "jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
//                "bolitao", "bolitao");
//                Statement statement = connection.createStatement()) {
//            String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
////            for (int i = 0; i < 100; i++) {
//            statement.execute(sql);
//            System.out.println("成功插入数据");
////            }
//            String deleteSQL = "DELETE FROM hero WHERE id = 5";
//            statement.execute(deleteSQL);
//            System.out.println("成功删除数据");
//            String updateSQL = "UPDATE hero SET name = 'name 5' WHERE id = 3";
//            statement.execute(updateSQL);
//            System.out.println("成功修改数据");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        TestJDBC.execute("update hero set name = 'name33333123 5' where id = 3");
        TestJDBC.execute("delete from hero where id = 4");
    }

    public static void execute(String sql) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                Statement statement = connection.createStatement()) {

            statement.execute(sql);
            System.out.println("操作执行成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
