package com.chetan.javaadvanced;

import java.sql.*;
public class JDBCDemo {
    static final String JDBC_DRIVER= "com.mysql.cj.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost:3306/chetan";
    //Database Cred
    static final String USER= "root";
    static final String PASSWORD= "Password@123";
    public static void main(String[] args){

        Connection conn=null;
        Statement stmt=null;
        try{
            //Register JDBC Driver
            Class.forName(JDBC_DRIVER);

            //Open a conection
            System.out.println("Connecting to Database...");
            conn=DriverManager.getConnection(DB_URL,USER,PASSWORD);

            //Execute a query
            System.out.println("Creating a statement...");
            stmt=conn.createStatement();
            String sql="select * from employee limit 10" ;
            ResultSet rs=stmt.executeQuery(sql);

            //Extract Data from result set

            System.out.println("Executing Query ....");
            while(rs.next())
            {
                //Retrieve by column
                int id=rs.getInt("empID");
                String firstName=rs.getString("firstname");
                String lastName=rs.getString("lastname");
                String ipAdd=rs.getString("ipaddress");

                //Display value
                System.out.print("ID=>"+id);
                System.out.print(",Name=>"+firstName+" "+lastName);
                System.out.println(",IP Addr=>"+ipAdd);
            }

            //closing connetion
            System.out.println("Closing SQL connection....");
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException exc){
           exc.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(stmt!=null)
                    stmt.close();
            }catch (SQLException exc2){//do nothing
            }

            try{
                if(conn!=null)
                    conn.close();
            }catch (SQLException exc3){
                exc3.printStackTrace();
            }
        }
    }
}

