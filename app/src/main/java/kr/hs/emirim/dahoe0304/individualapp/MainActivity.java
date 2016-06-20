package kr.hs.emirim.dahoe0304.individualapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNum1;
    TextView textResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResult=(TextView)findViewById(R.id.text_result);
    }
    public void onClick(View v){
        String num1Str=editNum1.getText().toString();
        int num1=Integer.parseInt(num1Str);
        double result=0;

        textResult.setText("계산 결과 : "+result);
    }
}
