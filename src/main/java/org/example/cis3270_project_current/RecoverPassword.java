package org.example.cis3270_project_current;

import java.util.Scanner;
public class RecoverPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.nextLine();

        System.out.print("Security question: What is your favorite color? ");
        String SecurityQuestionAnswer = sc.nextLine();

        if (userName.equals(userName) && SecurityQuestionAnswer.equals(SecurityQuestionAnswer)) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("Incorrect username or password!");

        }
    }
}
