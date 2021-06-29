/*
* Book: Starting Out with Java, 7th Edition by Tony Gaddis
* Program Author: Kyle Martin | https://github.com/thesnowmanndev
* This program was created to display contents of variables on the screen.
* */
public class NameAndInitials {
    public static void main(String[] args) {
        String firstName = "Joe", middleName = "John", lastName = "Smith";
        char firstInitial = 'J', middleInitial = 'J', lastInitial = 'S';

        System.out.println( "First Name = " + firstName + "\n" +
                            "Middle Name = " + middleName + "\n" +
                            "Last Name = " + lastName + "\n" +
                            "Initials = " + firstInitial + middleInitial + lastInitial);
    }
}
