package br.com.softplan.process.converter;

import br.com.softplan.process.Converter;
import br.com.softplan.process.model.User;
import br.com.softplan.process.response.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserResponse, User> {

    @Override
    public User encode(UserResponse response) {
        return null;
    }

    @Override
    public UserResponse decode(User user) {
        UserResponse response = new UserResponse();

        response.setEmail(user.getEmail());
        response.setId(user.getId());
        response.setName(user.getName());
        response.setUsername(user.getUsername());

        return response;
    }
}
