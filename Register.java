public class Register {
    private String firstName;
    private String lastName;
    private String address;
    private long zip;
    private String state;
    private String userName;
    private String password;
    private String emailId;
    private long socialSecNum;

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
    public long getZip() {
        return zip;
    }
    public void setZip(long zip) {
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
    public long getSocialSecNum() {
        return socialSecNum;
    }
    public void setSocialSecNum(long socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    @Override
    public String toString() {
        return "Register [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
                + ", zip=" + zip + ", state=" + state + ", userName=" + userName + ", password=" + password
                + ", emailId=" + emailId + ", socialSecNum=" + socialSecNum + "]";
    }







}
