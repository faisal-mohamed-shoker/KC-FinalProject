package com.example.newcw;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
   ArrayList<Student> students = new ArrayList<>();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


   Student s1 = new Student("يوسف" , 14 ,12 , 0);
   Student s2 = new Student("سلمان" , 13 , 10 , 0);
   Student s3 = new Student( "ماجد" , 15 ,11 ,0);
   Student s4 = new Student("فيصل" , 17, 12 , 0);



      students.add(s1);
      students.add(s2);
      students.add(s3);
      students.add(s4);












    }

}