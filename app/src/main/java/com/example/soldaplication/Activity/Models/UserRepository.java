package com.example.soldaplication.Activity.Models;

import java.util.List;

/**
 * Created by Erick_lap on 27/09/2017.
 */

public class UserRepository {
    private static UserRepository instance;
    private List<User> users;

    public static UserRepository getInstance()
    {
        if(instance == null) instance = new UserRepository();
        return instance;
    }

    public UserRepository() {
        User sample = new User(1,"juan","Torres","sample@hotmail.com","123","lima",123456789,1234,1234);
        users.add(sample);
    }

    public List<User> getUsers() {
        return users;
    }
    public boolean addUser(User user)
    {
        if (user.getEmail().isEmpty() || user.getPassword().isEmpty() || user.getName().isEmpty())
            return false;
        users.add(user);
        return true;
    }
    public static User sampleUser()
    {
        User sample = new User(1,"juan","Torres","sample@hotmail.com","123","lima",123456789,1234,1234);
        return sample;
    }
}
