package com.example.hotelbooking.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hotelbooking.Activities.ChangePasswordActivity;
import com.example.hotelbooking.Activities.ChangeProfileActivity;
import com.example.hotelbooking.R;

public class AccountFragment extends Fragment {
    private Button bt_changeprofile;
    private Button bt_chanepassword;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        bt_changeprofile=view.findViewById(R.id.bt_changeprofile);
        bt_chanepassword=view.findViewById(R.id.bt_changepassword);
        bt_changeprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChangeProfileActivity.class);
                startActivity(intent);
            }
        });
        bt_chanepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }

}
