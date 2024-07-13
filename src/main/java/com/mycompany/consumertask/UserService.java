/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consumertask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author anara
 */
public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void create(User user) {
        users.add(user);
    }
    public Consumer<User> create = user -> users.add(user);
    
    public User getById(int id){
        return users.get(id-1);
    }
    
    public Function<Integer,User> getById = id -> users.get(id-1);
    
    public Supplier<List<User>> getAllUser = () -> users;
    public Consumer<Integer> delete = id -> users.remove(id);

}
