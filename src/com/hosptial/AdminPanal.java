package com.hosptial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminPanal {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/hosp";
    private static final String user = "root";
    private static final String pass = "vikas1234";
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,pass);
        Scanner sc = new Scanner(System.in);
        User u = new User(conn,sc);
        Appointment ap = new Appointment(conn,sc);
while(true) {
            System.out.println("\n\nWELCOME TO HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("\n1. Add Patient");
            System.out.println("2. Display Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Display Doctor");
            System.out.println("5. Book An Appointment");
            System.out.println("6. View Appointment");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch(choice) {
            case 1: 
                u.AddUser("Patient");
                break;
            case 2:
                u.DisplayUser("Patient");
                break;
            case 3:
                u.AddUser("Doctor");
                break;
            case 4:
                u.DisplayUser("Doctor");
                break;
            case 5:
                ap.BookAppointment();
               break;
            case 6:
            	ap.DisplayAppointments();
            	break;
            case 7:
                System.out.println("THANK YOU!");
                return;
            default:
                System.out.println("Wrong Choice!\n");
                break;

            }
        }
    }
}