package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {

    List<User> findByUsernameContaining(String userName);

    @Query("select u.userid from User u")
    List<Integer> getUserIDs();
}
