package org.pursuit.notification_app_hw_charles_clifford;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import org.pursuit.notification_app_hw_charles_clifford.Controller.RecyclerAdapter;
import org.pursuit.notification_app_hw_charles_clifford.model.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ViewModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView notificationRecyclerView = findViewById(R.id.notification_RecyclerView);


       ViewModel viewModel = new ViewModel("Hell0","https://cdn0.iconfinder.com/data/icons/small-n-flat/24/678134-sign-check-512.png");
    models.add(viewModel);


        RecyclerAdapter myAdapter = new RecyclerAdapter(models);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        notificationRecyclerView.setAdapter(myAdapter);
        notificationRecyclerView.setLayoutManager(linearLayoutManager);



    }



    }



