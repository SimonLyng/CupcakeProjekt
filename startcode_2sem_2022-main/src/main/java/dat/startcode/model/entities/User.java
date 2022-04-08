package dat.startcode.model.entities;

import java.util.Objects;

public class User
{


    private String email;
    private String password;
    private String role;
    private int balance;



    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "brugerNavn='" + email + '\'' +
                ", kodeord='" + password + '\'' +
                ", rolle='" + role + '\'' +
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

    public int withdraw(int i)
    {


        if (i > 0) {
            balance = balance - i;
        }

        return balance;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(getEmail(), getPassword(), getRole());
    }
}
