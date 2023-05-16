package home.danil.myfight.repositories;

import home.danil.myfight.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
