package net.balmes.api.objects;

public class Smix {
    final String group = "Smix";
    private String name;
    private String surname;
    private String email;

    public Smix(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SMIX [group=" + group + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
    }

}
