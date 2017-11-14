package be.derieuw.thibault.oefening_databinding.binder;

import android.databinding.BindingAdapter;
import android.databinding.ObservableList;
import android.widget.ListView;

import be.derieuw.thibault.oefening_databinding.adapter.UserAdapter;
import be.derieuw.thibault.oefening_databinding.model.UserRepository;

/**
 * Created by Thibault on 14/11/2017.
 */

public class UserBinder {


    @BindingAdapter("items")
    public static void setItems(ListView listView , ObservableList<UserRepository> users){
        UserAdapter adapter = new UserAdapter(listView.getContext());
        adapter.addAll(users);
        listView.setAdapter(adapter);
    }
}
