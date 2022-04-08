package dat.startcode.model.persistence;

import dat.startcode.model.entities.User;
import dat.startcode.model.exceptions.DatabaseException;

public interface IUserMapper
{
    public User login(String Email, String password) throws DatabaseException;
    public User createUser(String FirstName, String LastName, String Email, String password, String role) throws DatabaseException;
}
