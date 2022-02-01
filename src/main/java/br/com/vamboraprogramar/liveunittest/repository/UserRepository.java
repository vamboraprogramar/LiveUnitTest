package br.com.vamboraprogramar.liveunittest.repository;

import br.com.vamboraprogramar.liveunittest.entity.User;

public class UserRepository {

    private static final UserRepository INSTANCE = new UserRepository();
    private static final int MAX_USER_ON_SYSTEM = 5;
    private static final User[] users = new User[MAX_USER_ON_SYSTEM];
    private int totalUsers;

    private UserRepository(){
        totalUsers = 0;
    }

    public static UserRepository getInstance(){
        return INSTANCE;
    }

    public void add(User user){
        users[totalUsers] = user;
        totalUsers++;
    }
}
