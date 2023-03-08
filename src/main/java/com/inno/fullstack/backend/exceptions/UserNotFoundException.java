package com.inno.fullstack.backend.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Could not find the user with id "+ id);
    }
}
