package dat.startcode.model.entities;

import java.util.Objects;

public class User
{


    private String Email;
    private String password;
    private String Role;
    private int balance;



    public User(String email, String password, String role) {
        this.Email = email;
        this.password = password;
        this.Role = role;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }






    @Override
    public String toString()
    {
        return "User{" +
                "brugerNavn='" + Email + '\'' +
                ", kodeord='" + password + '\'' +
                ", rolle='" + Role + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof dat.startcode.model.entities.User)) return false;
        dat.startcode.model.entities.User user = (dat.startcode.model.entities.User) o;
        return getEmail().equals(user.getEmail()) && getPassword().equals(user.getPassword()) &&
                getRole().equals(user.getRole());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getEmail(), getPassword(), getRole());
    }
}
