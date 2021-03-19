package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo3 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql="delete from practice where SNO='s004'";
            //3.获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///text?characterEncoding=utf-8", "root", "230017");
            //4.获取sql执行对象 Statement
            stmt=conn.createStatement();
            //5.执行sql
            int count=stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);
            if(count>0)
                System.out.println("删除成功");
            else
                System.out.println("删除失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
