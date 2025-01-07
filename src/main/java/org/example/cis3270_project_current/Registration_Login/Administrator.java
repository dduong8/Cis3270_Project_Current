package org.example.cis3270_project_current.Registration_Login;

public class Administrator extends Register {

    public final static Boolean isAdminAccount = true;

    public Administrator(String username, String password) {
        super(username ,password);
    }
    public Administrator(String userName, String password, String firstName, String lastName,
    int zip,String state,String emailId,int socialSecNum,String securityQuestionAnswer ) {

        super(userName,password,firstName,lastName,zip,state,emailId,socialSecNum,securityQuestionAnswer);

    }
    @Override
    public String toString(){
        return "\nuserName:"+ this.getUserName()+"\npassword:"+ this.getPassword();
    }


}
