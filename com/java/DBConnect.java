package com.java;
import java.sql.*;
public class DBConnect {
        public static void main(String[] args) {
            try {
                //Step 1 Load the driver
                Class.forName("oracle.jdbc.driver.OracleDriver");

                //Step 2 Create the connection
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

                Statement stmt=con.createStatement();

                ResultSet rs=stmt.executeQuery("select * from emp");
                while(rs.next())
                {
                    System.out.println(rs.getInt(1)+" | "+rs.getString(2));
                }
                con.close();
            } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

