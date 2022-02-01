package br.com.vamboraprogramar.liveunittest.controller;

import br.com.vamboraprogramar.liveunittest.entity.User;
import br.com.vamboraprogramar.liveunittest.repository.UserRepository;
import br.com.vamboraprogramar.liveunittest.validator.UserValidator;

public class UserController {

    private UserValidator userValidator;
    private UserRepository userRepository;

    public UserController(){
        userValidator = new UserValidator();
        userRepository = UserRepository.getInstance();
    }

    public void add(User user){
        userValidator.validate(user);
        userRepository.add(user);
    }
}
