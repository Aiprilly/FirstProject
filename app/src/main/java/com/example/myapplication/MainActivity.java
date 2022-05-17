package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*User student = new User();
        student.firstname = "Александр";
        student.lastname = "Викторов";
        student.school = 17;
        student.schoolInfo=new School();
        student.schoolInfo.adress="sggdg";
        student.schoolInfo.name="gkgkg";
        Gson gson = new Gson();
        Log.i("GSON", gson.toJson(student));*/
        String jsonText ="{\"firstname\":\"Alexandr\",\"lastname\":\"Viktorov\",\"school\":17}";
        Gson gson = new Gson();
        User user = gson.fromJson(jsonText, User.class);
        Log.i("GSON", "Student: " + user.firstname + " " + user.lastname + " , school N " + user.school);



    }
}

 class User {
    public String firstname; // имя
    public String lastname; // фамилия
    public int school; // номер школы
    School schoolInfo;
}
class School{
    String name;
    String adress;
}