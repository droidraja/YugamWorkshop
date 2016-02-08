package io.iqube.yugam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button addition,profilePic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition=(Button)findViewById(R.id.add);
        profilePic=(Button)findViewById(R.id.page_profile);
        addition.setOnClickListener(this);
        profilePic.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==addition)
        {
            Intent i=new Intent(this,AdditionActivity.class);
            startActivity(i);
        }
        else
        {

            Intent i=new Intent(this,ProfileActivity.class);
            startActivity(i);
        }
    }
}

