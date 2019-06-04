package how2j.jdbc;

import java.sql.*;

/**
 * @author Boli Tao
 * TODO: 复习
 */
public class PrepareStatementCompare {
    static void inserByPrepareStatement(int count) {
        String prepareSQL = "insert into hero values(null, ?, ?, ?)";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(prepareSQL)

        ) {
            statement.setString(1, "提莫");
            statement.setFloat(2, 555f);
            statement.setFloat(3, 333f);
            for (int i = 0; i < count; i++) {
                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insertByRegularStatement(int count) {
        String sql = "insert into hero values(null," + "'提莫'" + "," + 233 + "," + 333 + ")";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                Statement statement = connection.createStatement()
        ) {
            for (int i = 0; i < count; i++) {
                statement.execute(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int count = 10;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        inserByPrepareStatement(count);
        long end = System.currentTimeMillis();
        System.out.printf("使用 PrepareStatement 插入 %d 条数据，耗时 %d 毫秒\n", count, end - start);
        start = System.currentTimeMillis();
        insertByRegularStatement(count);
        end = System.currentTimeMillis();
        System.out.printf("使用常规 Statement 插入 %d 条数据，耗时 %d 毫秒\n", count, end - start);
    }
}
