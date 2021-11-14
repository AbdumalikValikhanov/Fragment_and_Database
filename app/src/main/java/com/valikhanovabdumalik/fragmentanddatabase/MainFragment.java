package com.valikhanovabdumalik.fragmentanddatabase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.valikhanovabdumalik.fragmentanddatabase.Room.Contact_Fragment;
import com.valikhanovabdumalik.fragmentanddatabase.databinding.MainFragmentLayoutBinding;

public class MainFragment extends Fragment {
   MainFragmentLayoutBinding binding;
    public MainFragment() {
//        super(R.layout.main_fragment_layout);
    }

    @Nullable

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_fragment_layout,container,false);
        binding=MainFragmentLayoutBinding.bind(view);
//        binding =MainFragmentLayoutBinding.inflate(inflater,container,false);
//        View view=binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.viewPagerbtn.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Salom",Toast.LENGTH_SHORT).show();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .addToBackStack("")
                    .replace(R.id.main_container,new ViewPagerFragment())
                    .commit();
        });
        binding.roomDatabasebtn.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .addToBackStack("")
                    .replace(R.id.main_container,new Contact_Fragment())
                    .commit();
        });
    }
}
