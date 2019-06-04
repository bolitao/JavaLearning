package how2j.jdbc;

import java.sql.*;

public class AutoIncreaseTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                "bolitao", "bolitao");
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, "盖伦");
            ps.setFloat(2, 616);
            ps.setInt(3, 100);
            ps.execute();
            // 无论是 execute 还是 executeUpdate 都不会返回这个自增长 id 是多少。需要通过 Statement 的 getGeneratedKeys 获取该 id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
