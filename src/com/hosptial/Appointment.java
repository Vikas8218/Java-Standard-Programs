package com.hosptial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Appointment {
    private Connection conn;
    private Scanner sc;

    public Appointment(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void BookAppointment() {
        try {
            System.out.println("Enter Patient ID : ");
            int puid = sc.nextInt();
            String sql = "SELECT * FROM user WHERE uid=? AND urole='Patient'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, puid);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Enter Doctor ID : ");
                int duid = sc.nextInt();
                String sql2 = "SELECT * FROM user WHERE uid=? AND urole='Doctor'";
                PreparedStatement pst2 = conn.prepareStatement(sql2);
                pst2.setInt(1, duid);
                ResultSet rs2 = pst2.executeQuery();
                if (rs2.next()) {
                    System.out.println("Enter Date(YYYY-MM-DD) : ");
                    String date = sc.next();
                    System.out.println("Enter Disease : ");
                    String detail = sc.next();
                    String query = "INSERT INTO appointment(puid,duid,date,details) VALUES(?,?,?,?)";
                    PreparedStatement pst3 = conn.prepareStatement(query);
                    pst3.setInt(1, puid);
                    pst3.setInt(2, duid);
                    pst3.setString(3, date);
                    pst3.setString(4, detail);
                    int ar = pst3.executeUpdate();
                    if (ar > 0) {
                        System.out.println("Appointment Booked!");
                    } else {
                        System.out.println("Appointment Booking Failed!");
                    }
                } else {
                    System.out.println("Doctor Not Found!");
                }
            } else {
                System.out.println("Patient Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DisplayAppointments() {
        try {
            String sql = "SELECT fname, lname, mobile, address, date, details FROM user " +
                         "JOIN appointment ON user.uid = appointment.duid";
            try (PreparedStatement pst = conn.prepareStatement(sql);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    System.out.println("Name: " + rs.getString("fname") + " " + rs.getString("lname"));
                    System.out.println("Mobile: " + rs.getString("mobile"));
                    System.out.println("Address: " + rs.getString("address"));
                    System.out.println("Appointment Date: " + rs.getString("date"));
                    System.out.println("Appointment Details: " + rs.getString("details"));
                    System.out.println("====================");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}