package com.hosptial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class User {
    private Connection conn;
    private Scanner sc;
    public User(Connection conn,Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }
    public void AddUser(String role) {
        System.out.println("Enter First Name : ");
        String fname = sc.next();
        System.out.println("Enter Last Name : ");
        String lname = sc.next();
        System.out.println("Enter Mobile Number : ");
        String mobile = sc.next();
        System.out.println("Enter Address : ");
        String add = sc.next();
        try {
            String sql = "INSERT INTO user(fname,lname,mobile,address,urole) VALUE(?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,fname);
            pst.setString(2,lname);
            pst.setString(3,mobile);
            pst.setString(4,add);
            pst.setString(5,role);
            int ar = pst.executeUpdate();
            if(ar>0) {
                System.out.println(role+" Added Successfully!");
            }else {
                System.out.println(role+" Added Failed!");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
public void DisplayUser(String role) {
	 try {
         String sql = "SELECT * FROM user WHERE urole=?";
         PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1,role);
         ResultSet rs = pst.executeQuery();
         System.out.println("+-----+---------------+---------------+--------------+------------+-----------+");
         System.out.println("| UID | FISRT NAME    | LAST NAME     | MOBILE       | ADDRESS    | USER ROLE |");
         System.out.println("+-----+---------------+---------------+--------------+------------+-----------+");
         while(rs.next()) {
             System.out.printf("| %3d | %13s | %13s | %12s | %10s | %9s |\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
         }
         System.out.println("+-----+---------------+---------------+--------------+------------+-----------+");
     }catch(Exception e) {
         e.printStackTrace();
     }
 }}
