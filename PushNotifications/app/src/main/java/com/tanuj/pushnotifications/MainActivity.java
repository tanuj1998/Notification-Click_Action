package com.tanuj.pushnotifications;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MainActivity extends AppCompatActivity {
    private EditText etTitle;
    private EditText etMessage;
    private Button button1;
    private Button button2;

    private NotificationHelper mNotificationHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("NEWS");
        etTitle = findViewById(R.id.etTitle);
        etMessage = findViewById(R.id.etMessage);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        mNotificationHelper = new NotificationHelper(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            sendOnChannel1(etTitle.getText().toString(),etMessage.getText().toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendOnChannel2(etTitle.getText().toString(),etMessage.getText().toString());
            }
        });
    }

    public void sendOnChannel1(String title, String message){
        NotificationCompat.Builder nb = mNotificationHelper.getChannel1Notification(title,message);
        mNotificationHelper.getManager().notify(1,nb.build());

    }

    public void sendOnChannel2(String title, String message){
        NotificationCompat.Builder nb = mNotificationHelper.getChannel2Notification(title,message);
        mNotificationHelper.getManager().notify(2,nb.build());
    }
}
