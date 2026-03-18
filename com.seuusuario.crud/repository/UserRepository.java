package com.seuusuario.crud.repository;

import com.seuusuario.crud.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    //com o ArrayList ele inicia um array vazio
    private List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(Long id){
        for(User user: users){
            if(user.getId().equals(id)) {
              return user;
            }
        }
        return null;
    }

    public boolean deleteById(Long id){
        User userById = findById(id);
        if(userById != null){
            users.remove(userById);
            return true;
        }
        return false;
    };
}
