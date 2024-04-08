package com.example.furniture_kemelova.ui.kidsroom;

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
import com.example.furniture_kemelova.databinding.FragmentKidsBinding;
import com.example.furniture_kemelova.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KidsFragment extends Fragment {

    FragmentKidsBinding binding;
    NavController navController;
    List<FurnitureModel> list_kids = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKidsBinding
                .inflate(inflater,container,false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kids);
        binding.rvKids.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kidsFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_kids.add(new FurnitureModel("Детская мебель", "Стол и стулья", "350",
                "Детский комплект мебели \"Маленький исследователь\" - отличное решение для игровой комнаты вашего ребенка. Включает в себя яркий стол и несколько удобных стульев.", "20%", R.drawable.kids));
        list_kids.add(new FurnitureModel("Детская мебель", "Кровать", "450",
                "Детская кровать-машина с яркими декорациями и удобным матрасом - мечта любого маленького путешественника.", "30%", R.drawable.kitchen));
        list_kids.add(new FurnitureModel("Детская мебель", "Стеллаж", "280",
                "Яркий и компактный стеллаж для хранения игрушек и книг позволит вашему ребенку легко найти все необходимое.", "10%", R.drawable.kids2));
        list_kids.add(new FurnitureModel("Детская мебель", "Столик", "150",
                "Удобный и прочный детский столик для творчества и обучения с яркой поверхностью, которая легко чистится.", "15%", R.drawable.kids2));
        list_kids.add(new FurnitureModel("Детская мебель", "Кресло", "200",
                "Мягкое и уютное кресло-мешок станет любимым местом вашего ребенка для чтения и отдыха.", "25%", R.drawable.kids));
        list_kids.add(new FurnitureModel("Детская мебель", "Шкаф", "380",
                "Просторный детский шкаф с разнообразными отделениями и ящиками для удобного хранения одежды и игрушек.", "20%", R.drawable.kids2));
        list_kids.add(new FurnitureModel("Детская мебель", "Комод", "320",
                "Компактный комод с яркими выдвижными ящиками поможет поддерживать порядок в детской комнате.", "15%", R.drawable.kids));
        list_kids.add(new FurnitureModel("Детская мебель", "Стулья", "80",
                "Набор ярких и удобных стульев для детского стола или игрового пространства.", "10%", R.drawable.kids2));

    }
}