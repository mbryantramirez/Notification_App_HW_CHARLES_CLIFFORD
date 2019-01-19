package org.pursuit.notification_app_hw_charles_clifford.view;

import android.app.NotificationManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.pursuit.notification_app_hw_charles_clifford.MainActivity;
import org.pursuit.notification_app_hw_charles_clifford.R;
import org.pursuit.notification_app_hw_charles_clifford.model.ViewModel;

import java.util.Random;

public class ViewHolder extends RecyclerView.ViewHolder{
    private final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private NotificationManager notifyManager;
    public ImageView imageView;
    public TextView message;
    public TextView imageUri;
    public Button notifyButton;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.recycler_ImageView);
        message =  itemView.findViewById(R.id.recyclerView_TextView);
        notifyButton = itemView.findViewById(R.id.recycler_Button);
        imageUri= itemView.findViewById(R.id.uri_textView);
        View.OnClickListener clickItem = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotification();

            }
        };

    }

    public void onBind(ViewModel viewModel){

        message.setText(viewModel.getMessage());
        imageUri.setText(viewModel.getImageUri());
        Picasso.with(imageView.getContext()).setLoggingEnabled(true);
        Picasso.with(imageView.getContext()).load(viewModel.getImageUri()).into(imageView);


    }
    public void sendNotification(){}


    private String setImages(){
        String[] imgUrl = new String[]{"http://pluspng.com/img-png/one-piece-png-one-piece-png-by-bloomsama-one-piece-png-by-bloomsama-1024.png",
                "http://pluspng.com/img-png/one-piece-png-873x786-px-873.png"};
        String uri = "";
        for (int i = 0; i <imgUrl.length; i++) {

            uri = imgUrl[i];
        }
        return uri;


        }


    }




