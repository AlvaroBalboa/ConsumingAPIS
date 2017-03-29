package consumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by souporman on 3/29/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    String address;
    String education;
    String email;
    String emplyment;
    int id;
    String name;

    public Person() {
    }

    public Person(String address, String education, String email, String emplyment, int id, String name) {
        this.address = address;
        this.education = education;
        this.email = email;
        this.emplyment = emplyment;
        this.id = id;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmplyment() {
        return emplyment;
    }

    public void setEmplyment(String emplyment) {
        this.emplyment = emplyment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    @Override
//    public String toString(){
//        return "\"address\": \"string\",\n" +
//                "    \"education\": \"string\",\n" +
//                "    \"email\": \"string\",\n" +
//                "    \"employment\": \"string\",\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"string\""
}
