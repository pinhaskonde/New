package tests;

public class User {

    String name;
    String lastname;
    String id;
    String phone;
    String gender;
    String dateOfBirth;

    public User(String name, String lastname, String id, String phone, String gender,String dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.phone = phone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }


}
