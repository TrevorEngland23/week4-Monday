public class User {
     String firstName;
     String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void Display(){
        System.out.println("User name: " + firstName + " " + lastName);
    }
}
