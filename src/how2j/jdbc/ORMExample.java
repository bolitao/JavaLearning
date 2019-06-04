package how2j.jdbc;

import how2j.exception.Hero;

import java.sql.*;

public class ORMExample {
    public static Hero get(int id) {
        Hero hero = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "select * from hero where id = (?)";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:330hibernate.rar6/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1));
                hero = new Hero();
                hero.setId(id);
                hero.setName(resultSet.getString("name"));
                hero.setDamage(resultSet.getInt("damage"));
                hero.setHp(resultSet.getFloat("hp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void add(Hero hero) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into hero values(null, ?, ?, ?)";
        String countSQL = "select count(*) from hero";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(sql);
                PreparedStatement countStatement = connection.prepareStatement(countSQL);
        ) {
            ResultSet countResult = countStatement.executeQuery();
            while (countResult.next()) {
                System.out.println("当前共有 " + countResult.getInt(1) + " 条数据");
            }
            statement.setString(1, hero.getName());
            statement.setInt(2, hero.getDamage());
            statement.setFloat(3, hero.getHp());
            statement.execute();
            System.out.println("成功添加数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Hero hero) {
        String sql = "delete from hero where id = (?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, hero.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Hero hero) {
        String sql = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        "bolitao", "bolitao");
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // query/ get 测试
        int id = 69858;
        Hero hero = ORMExample.get(id);
        System.out.println(hero.getName());
        Hero hero1 = new Hero();
        hero1.setName("NMDWSM");
        hero1.setDamage(80);
        hero1.setHp(700);
        ORMExample.add(hero1);
    }
}
