package org.example.cis3270_project_current.Registration_Login;

import java.util.Random;



public class RegisterAccount {
    private String firstName;
    private String lastName;
    private String address;
    private int zip;
    private String state;
    private String userName;
    private String password;
    private String emailId;
    private int socialSecNum;
    private int accountID;
    private String securityQuestion;
    private String securityQuestionAnswer;
    public static boolean isAdminAccount = false;

    public RegisterAccount(String Username, String Password) {
        this.userName = Username;
        this.password = Password;

    }

    public RegisterAccount(String userName, String password, String firstName, String lastName, int zip, String state, String emailId,
                           int socialSecNum, String securityQuestion, String securityQuestionAnswer, int accountID) {

        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
        this.state = state;
        this.emailId = emailId;
        this.socialSecNum = socialSecNum;
        this.securityQuestion = securityQuestion;
        this.securityQuestionAnswer = securityQuestionAnswer;
        this.accountID = accountID;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getSocialSecNum() {
        return socialSecNum;
    }
    public void setSocialSecNum(int socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    public int getAccountID() {return accountID;}

    public static int generateAccountID(){
        Random rand = new Random();
        int ID = rand.nextInt(99999);
        return ID;

    }
    public void setAccountID(int accountID) {this.accountID = accountID;}

    public String getSecurityQuestion() {return securityQuestion;}
    public void setSecurityQuestion(String securityQuestion) {this.securityQuestion = securityQuestion;}

    public String getSecurityQuestionAnswer() {return securityQuestionAnswer;}
    public void setSecurityQuestionAnswer(String securityQuestionAnswer )
    {this.securityQuestionAnswer = securityQuestionAnswer;}




    @Override
    public String toString() {
        return "Register [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
                + ", zip=" + zip + ", state=" + state + ", userName=" + userName + ", password=" + password
                + ", emailId=" + emailId + ", socialSecNum=" + socialSecNum +
                ", securityQuestionAnswer="+ securityQuestionAnswer;
    }

}

