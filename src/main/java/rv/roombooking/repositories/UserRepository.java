package rv.roombooking.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import rv.roombooking.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods if needed
}
