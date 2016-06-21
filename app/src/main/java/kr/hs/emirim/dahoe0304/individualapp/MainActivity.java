package kr.hs.emirim.dahoe0304.individualapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button butCal;
    EditText editNum1;
    TextView textResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butCal=(Button)findViewById(R.id.but_cal);
        textResult=(TextView)findViewById(R.id.text_result);
        editNum1=(EditText)findViewById(R.id.num);

        butCal.setOnClickListener(this);
    }
    public void onClick(View v){
        String num1Str=editNum1.getText().toString();

        int num1=Integer.parseInt(num1Str);

        double result=0.0;

        switch(v.getId()){
            case R.id.but_cal:
                result=num1/3.3;
                break;
        }
        textResult.setText("평수는 : "+result);
    }
}
