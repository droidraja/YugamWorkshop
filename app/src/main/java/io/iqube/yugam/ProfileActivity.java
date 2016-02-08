package io.iqube.yugam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by raja sudhan on 2/8/2016.
 */
public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    Button fetchImage;
    EditText fbId;
    ImageView myPic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fetchImage=(Button)findViewById(R.id.fetch);
        fbId=(EditText)findViewById(R.id.fb_id);
        myPic=(ImageView)findViewById(R.id.my_pic);
        fetchImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String url="https://graph.facebook.com/"+fbId.getText().toString().trim()+"/picture?type=large";
        Picasso.with(this).load(url).error(R.drawable.blood_donate).into(myPic);
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show();
    }
}
