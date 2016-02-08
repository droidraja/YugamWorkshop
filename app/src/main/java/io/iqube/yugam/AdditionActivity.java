package io.iqube.yugam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by raja sudhan on 2/8/2016.
 */

public class AdditionActivity extends AppCompatActivity {

EditText num1,num2;
    TextView answer;
    Button add;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        answer=(TextView)findViewById(R.id.answer);
        add=(Button)findViewById(R.id.add);

    }

    public void add(View v)
    {
        int number1=Integer.parseInt(num1.getText().toString());
        int number2= Integer.parseInt(num2.getText().toString());
        int ans=number1+number2;
        answer.setText(""+ans);

    }

}
