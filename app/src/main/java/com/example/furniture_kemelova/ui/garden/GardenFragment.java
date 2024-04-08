package com.example.furniture_kemelova.ui.garden;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_kemelova.MAdapter;
import com.example.furniture_kemelova.R;
import com.example.furniture_kemelova.databinding.FragmentGardenBinding;
import com.example.furniture_kemelova.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGardenBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_g);
        binding.rvGarden.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Садовая мебель", "Cтол и стулья ", "980",
                "Садовый комплект \"Летняя Гармония\" представляет собой идеальное решение для вашего сада или террасы. В комплект входит столик и четыре удобных стула, выполненных из прочного и устойчивого к погодным условиям алюминия с покрытием из порошковой краски. ", "40%",R.drawable.sad1));
        list_g.add(new FurnitureModel("Садовая мебель", "стулья ", "380",
                "материал - ротанговое дерево", "60%",R.drawable.sad2));
        list_g.add(new FurnitureModel("Садовая мебель", "Кресло ", "280",
                "материал - ротанговое дерево", "55%",R.drawable.sad3));
        list_g.add(new FurnitureModel("Садовая мебель", "Cтол", "600",
                "материал - ротанговое дерево", "60%",R.drawable.sad4));
        list_g.add(new FurnitureModel("Садовая мебель", "Cтол и стулья ", "780",
                "материал - ротанговое дерево", "45%",R.drawable.sad2));
        list_g.add(new FurnitureModel("Садовая мебель", "Cтол и стулья ", "800",
                "материал - ротанговое дерево", "60%",R.drawable.sad3));
        list_g.add(new FurnitureModel("Садовая мебель", "Cтол", "660",
                "материал - ротанговое дерево", "70%", R.drawable.sad1));
//        list_g.add(new FurnitureModel("Садовая мебель", "стулья ", "390",
//                "материал - ротанговое дерево", "60%",R.drawable.ic_launcher_background));
    }
}