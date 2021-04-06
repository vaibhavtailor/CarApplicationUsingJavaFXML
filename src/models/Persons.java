package models;

import java.util.Locale;

public class Persons {
    private String firstName, lastName, email, address, contactNumber;

    public Persons(String firstName, String lastName, String email, String address, String contactNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAddress(address);
        setContactNumber(contactNumber);
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        firstName = firstName.trim();

        if(firstName.length()>=2 && firstName.length()<=20)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name should be between 2 to 20");
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        lastName = lastName.trim();

        if(lastName.length()>=2 && lastName.length()<=30)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Last name should be between 2-30");
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
         email = email.toLowerCase();

         if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
             this.email = email;
         else
             throw new IllegalArgumentException("Please enter a valid email address");
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        address = address.trim();

        if(address.length()>=5 && address.length()<=100)
            this.address = address;
        else
            throw new IllegalArgumentException("Address must be between 5-100 characters");
    }

    public String getContactNumber() {

        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {

        if(contactNumber.matches("[0-9]{10}"))
            this.contactNumber = contactNumber;
        else
            throw new IllegalArgumentException("The contact number should be of 10 digits where the digits should be between 0-9.");
    }

    public String toString() {
        return String.format("Hello, %d %d", firstName, lastName);
    }

}
