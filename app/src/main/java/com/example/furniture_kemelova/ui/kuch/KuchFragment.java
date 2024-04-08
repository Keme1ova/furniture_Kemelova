package com.example.furniture_kemelova.ui.kuch;

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
import com.example.furniture_kemelova.databinding.FragmentKuchBinding;
import com.example.furniture_kemelova.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KuchFragment extends Fragment {

    FragmentKuchBinding binding;
    NavController navController;
    List<FurnitureModel> list_k = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKuchBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_k);
        binding.rvKuch.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kuchFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонный стол и стулья", "1280",
                "Этот стильный комплект кухонной мебели идеально подойдет для вашей кухни или столовой. В комплект входит прочный стол и четыре удобных стула с мягкими сиденьями, созданные для комфортного обеда или завтрака в семейной обстановке.", "Скидка 40%", R.drawable.kitchen));
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонные стулья", "480",
                "Эти элегантные кухонные стулья изготовлены из высококачественного ротангового дерева, обеспечивая прочность и надежность. Идеально подходят для украшения вашей кухни и обеспечения удобства при приеме пищи.", "Скидка 60%", R.drawable.kuch));
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонное кресло", "380",
                "Это удобное кухонное кресло станет прекрасным дополнением к вашему обеденному столу. Сделано из качественного ротангового дерева, оно обеспечивает надежную поддержку и комфорт при приеме пищи.", "Скидка 55%", R.drawable.kuch1));
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонный стол", "600",
                "Этот прочный кухонный стол сделан из качественного ротангового дерева, что обеспечивает долговечность и элегантность вашей кухонной обстановки. Идеально подходит для приема пищи в семейном кругу.", "Скидка 60%", R.drawable.kuch3));
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонный стол и стулья", "780",
                "Этот комплект кухонной мебели сочетает в себе функциональность и стиль. Выполненный из ротангового дерева, он обеспечивает комфорт и удобство при приеме пищи. В комплект входит стол и четыре стула.", "Скидка 45%", R.drawable.kuch2));
        list_k.add(new FurnitureModel("Кухонная мебель", "Кухонный стол и стулья", "800",
                "Этот стильный комплект кухонной мебели добавит элегантности вашей кухне. Изготовленный из прочного ротангового дерева, он обеспечивает надежность и комфорт во время приема пищи. В комплект входит стол и четыре удобных стула.", "Скидка 60%", R.drawable.kitchen));


    }
}