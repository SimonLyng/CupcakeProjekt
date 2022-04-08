package dat.startcode.model.persistence;

import dat.startcode.model.entities.User;
import dat.startcode.model.exceptions.DatabaseException;

public interface IOrderMapper
{
    public User login(String email, String password) throws DatabaseException;
    public User createOrder(String FirstName, String LastName, String email, String password, String role) throws DatabaseException;
}
