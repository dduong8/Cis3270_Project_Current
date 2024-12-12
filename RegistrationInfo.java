import java.util.Scanner;
public class RegistrationInfo {
    public static void main(String[] args) {

        Register register = new Register();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        register.setFirstName(scanner.nextLine());

        System.out.println("Enter Last Name: ");
        register.setLastName(scanner.nextLine());

        System.out.println("Enter Address");
        register.setAddress(scanner.nextLine());

        System.out.println("Enter ZIP Code: ");
        register.setZip (scanner.nextLong());

        System.out.println("Enter State");
        register.setState (scanner.nextLine());

        System.out.print("Enter Username ");
        register.setUserName(scanner.nextLine());

        System.out.print("Enter password: ");
        register.setPassword(scanner.nextLine());

        System.out.print("Enter emailId: ");
        register.setEmailId(scanner.nextLine());

        System.out.print("Enter Social Security Number: ");
        register.setSocialSecNum(scanner.nextLong());

        System.out.println(register.toString());


    }

}
