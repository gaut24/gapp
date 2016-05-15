package com.dev.actions;

 
import org.db.Personnes;
 
public interface PersonnesDao {
 
    Personnes getUserByCredentials(String login, String password);
}