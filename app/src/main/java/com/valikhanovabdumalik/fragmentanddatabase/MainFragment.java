package com.valikhanovabdumalik.fragmentanddatabase;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainFragment extends Fragment {
    public MainFragment() {
        super(R.layout.main_fragment_layout);
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button=view.findViewById(R.id.viewPagerbtn);
        button.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Salom",Toast.LENGTH_SHORT).show();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .addToBackStack("")
                    .replace(R.id.main_container,new ViewPagerFragment())
                    .commit();
        });
    }
}
