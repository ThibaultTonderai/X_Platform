package be.derieuw.thibault.oefening_databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import be.derieuw.thibault.oefening_databinding.R;

import be.derieuw.thibault.oefening_databinding.databinding.RowLayoutBinding;
import be.derieuw.thibault.oefening_databinding.model.UserRepository;


public class UserAdapter extends ArrayAdapter<UserRepository> {

    public UserAdapter(Context context){
        super(context, R.layout.row_layout);
    }

    @Override
    public View getView(int position, View convertView , ViewGroup parent){
        final RowLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_layout, parent ,false);
        binding.setUser(getItem(position));
        return binding.getRoot();
    }



}
