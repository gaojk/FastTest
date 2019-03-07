package com.fast.xinyue.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;


/**
 *
 * Connection对象 与特定数据库的连接（会话），在连接上下文中执行sql语句并返回结果
 * Statement接口  用于执行静态SQL语句并返回它所生成结果的对象
 * ResultSet接口  提供检索不同类型字段的方法
 * 使用后依次关闭对象及连接：ResultSet → Statement → Connection　　
 *
 * Connection常用方法：
 *  createStatement()：创建向数据库发送sql的statement对象。
 *  prepareStatement(sql) ：创建向数据库发送预编译sql的PrepareSatement对象。
 *  prepareCall(sql)：创建执行存储过程的callableStatement对象。
 *  setAutoCommit(boolean autoCommit)：设置事务是否自动提交。
 *  commit() ：在链接上提交事务。
 *  rollback() ：在此链接上回滚事务。
 *
 * Statement接口：
 *  execute(String sql):运行语句，返回是否有结果集
 *  executeQuery(String sql)：运行select语句，返回ResultSet结果集。
 *  executeUpdate(String sql)：运行insert/update/delete操作，返回更新的行数。
 *  addBatch(String sql) ：把多条sql语句放到一个批处理中。
 *  executeBatch()：向数据库发送一批sql语句执行。
 *
 * ResultSet接口：
 *  getString(int index)、getString(String columnName)：获得在数据库里是varchar、char等类型的数据对象。
 *  getFloat(int index)、getFloat(String columnName)：获得在数据库里是Float类型的数据对象。
 *  getDate(int index)、getDate(String columnName)：获得在数据库里是Date类型的数据。
 *  getBoolean(int index)、getBoolean(String columnName)：获得在数据库里是Boolean类型的数据。
 *  getObject(int index)、getObject(String columnName)：获取在数据库里任意类型的数据
 *
 * ResultSet还提供了对结果集进行滚动的方法：
 *  next()：移动到下一行
 *  Previous()：移动到前一行
 *  absolute(int row)：移动到指定行
 *  beforeFirst()：移动resultSet的最前面。
 *  afterLast() ：移动到resultSet的最后面。
 */


public class MysqlJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://127.0.0.1:3306/request01";
        String USER = "root";
        String PASSWORD = "root";
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL8 需要这个驱动哦
        //2.获得数据库链接
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from request");
        //4.处理数据库的返回结果(使用ResultSet类)
        try {
            while (rs.next()) {
                HashMap<String, String> data = new HashMap<String, String>();
                data.put("method", rs.getString("request_method"));
                data.put("name",rs.getString("request_name"));
                data.put("url",rs.getString("request_uri"));
                data.put("data",rs.getString("request_data"));
                System.out.println(data);

            }
        }
        finally {
            //关闭资源
            rs.close();
            st.close();
            connection.close();
        }
    }

}


