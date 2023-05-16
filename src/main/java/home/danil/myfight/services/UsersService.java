package home.danil.myfight.services;
import home.danil.myfight.models.User;
import java.util.List;


public interface UsersService {

    List<User> findAll();

    User findOne(long id);

    void save(User user);

    void update(long id, User updatedUser);

    void delete(long id);
}
