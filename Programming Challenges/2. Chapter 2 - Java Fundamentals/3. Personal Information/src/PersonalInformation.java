/*
* Book: Starting Out with Java, 7th Edition by Tony Gaddis
* Program Author: Kyle Martin | https://github.com/thesnowmanndev
* This program was created to display information on their own separate line
* */
public class PersonalInformation {
    public static void main(String[] args) {
        String  name = "Kyle Martin", street = "Old Town Blvd", city = "Stormwind", state = "Elwynn Forest",
                major = "Computer Programming";
        int houseNumber = 14, zip = 12345, telephone = 8675309;

        System.out.println( "Name = " + name + "\n" +
                            "Address = " + houseNumber + " " + street + " " + city + ", " + state + " " + zip + "\n" +
                            "Telephone = " + telephone + "\n" +
                            "Major = " + major);
    }
}
