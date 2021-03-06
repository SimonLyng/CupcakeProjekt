package dat.startcode.model.persistence;

import dat.startcode.model.entities.User;
import dat.startcode.model.exceptions.DatabaseException;

public interface IUserMapper
{
    public User login(String email, String password) throws DatabaseException;
    public User createUser(String FirstName, String LastName, String email, String password, String Role) throws DatabaseException;
}
