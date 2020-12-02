package com.example.extractassets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.AssetManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity" ;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadFile();
            }
        });
    }

    private void LoadFile(){
        AssetManager am = this.getAssets();
        try {
            InputStream is = am.open("haarcascade_eye.xml");
            Log.d(TAG,"File Load");
            String str = String.valueOf(is);
            if(str!=null){
                Log.d(TAG,"File Loading");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}