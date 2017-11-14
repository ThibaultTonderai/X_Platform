package be.derieuw.thibault.oefening_databinding.model;

import android.databinding.ObservableList;

import java.util.List;

public class UserRepository {


    // singleton design pattern
    private static UserRepository INSTANCE = null;
    private UserRepository(){}
    public static UserRepository getInstance(){
        if(INSTANCE == null)
            INSTANCE = new UserRepository();
        return INSTANCE;
    }



    private ObservableList<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ObservableList<User> users) {
        this.users = users;
    }
}
