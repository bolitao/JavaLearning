package how2j.jdbc;

import java.sql.*;
import java.util.Scanner;

public class TransactionPractice {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                Statement query = connection.createStatement();
                Statement delete = connection.createStatement()
        ) {
            connection.setAutoCommit(false);
            String sql = "SELECT * FROM hero ORDER BY id ASC LIMIT 10";
            ResultSet resultSet = query.executeQuery(sql);
            System.out.println("将删除以下数据：");
            System.out.println("id\tname\thp\tdamage");
            while (resultSet.next()) {
//                System.out.println("即将删除 ID 为 " + resultSet.getString(1) + " 的数据");
                int id = resultSet.getInt(1);
                String deleteSQL = "delete from hero where id = " + id;
                delete.execute(deleteSQL);
                System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
            }
            Scanner scanner = new Scanner(System.in);
            String input = "";
            while (!input.equals("y") && !input.equals("N")) {
                System.out.print("是否确认删除？（y/N）：");
                input = scanner.nextLine();
            }
            if (input.equals("y")) {
                connection.commit();
                System.out.println("已删除数据");
            } else {
                System.out.println("放弃删除操作");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
