/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.javadb;

public class User {
    private int userid;
    private String password;
    private String Fname;
    private String Lname;
    private String phone;
    private String email;
    private String country;
    private String Address;

    public User(String country, String phone,String Address, String Fname, String Lname, String email, String password) {
        this.country=country;
        this.password = password;
        this.Fname = Fname;
        this.Lname = Lname;
        this.phone = phone;
        this.email = email;
        this.Address = Address;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getUsername() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }
    
    
}