package cn.itcast.jdbc;

import java.sql.*;

public class jdbcdemo4 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql="select *from practice where SNO='s003'";
            //3.获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///text?characterEncoding=utf-8", "root", "230017");
            //4.获取sql执行对象 Statement
            stmt=conn.createStatement();
            //5.执行sql
            rs=stmt.executeQuery(sql);
            //6.获取数据
            while(rs.next()){
                String sno=rs.getString("SNO");
                String name=rs.getString("Name");
                int age=rs.getInt(3);
                String college=rs.getString("College");
                System.out.println(sno+","+name+","+age+","+college);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
