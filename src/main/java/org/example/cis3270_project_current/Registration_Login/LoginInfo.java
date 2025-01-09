package org.example.cis3270_project_current.Registration_Login;

import java.util.Scanner;

public class LoginInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (userName.equals(userName) && password.equals(password)) {
            System.out.println("You are logged in!");
        }else{
            System.out.println("Incorrect username or password!");

        }
    }


}