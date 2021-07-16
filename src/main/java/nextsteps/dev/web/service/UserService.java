package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.User;
import nextsteps.dev.web.jpa.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, String>{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }
}
