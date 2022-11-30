package com.example.rv_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList heroList = new ArrayList();
    private RecyclerView rvHero;
    private RecyclerView.Adapter heroAdapter = new HeroAdapter(heroList);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHero = findViewById(R.id.rv_hero);
        loadData();
        rvHero.setAdapter(heroAdapter);
    }

    private void loadData() {
        heroList.add("Зевс");
        heroList.add("Доктор Айболит");
        heroList.add("Тор");
        heroList.add("Человек-Паук");
        heroList.add("Hit Man");
        heroList.add("Торпеда");
        heroList.add("Грунт");
        heroList.add("Великий Майк");
        heroList.add("Самуэль Жэксон");
        heroList.add("Капитан Америка");
        heroList.add("Серебрянный сёрфер");
        heroList.add("Черная дева");
        heroList.add("Гоблин");
    }
}