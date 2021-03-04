package admu.csci.compoundinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_calculate_t)
public class CalculateT extends AppCompatActivity {

    // VARS
    @ViewById(R.id.calculateT_A)
    EditText calculateT_A;
    @ViewById(R.id.calculateT_P)
    EditText calculateT_P;
    @ViewById(R.id.calculateT_R)
    EditText calculateT_R;
    @ViewById(R.id.calculateT_N)
    EditText calculateT_N;
    @ViewById(R.id.calculateT_result)
    TextView calculateT_result;
    @ViewById(R.id.calculateT_go)
    Button calculateT_go;
    double resultT = 0;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
    @Click(R.id.calculateT_go)
    public void calculateT_go(View view){
        try {
            resultT = (Math.log( ((Double.valueOf(calculateT_A.getText().toString()))/(Double.valueOf(calculateT_P.getText().toString()))) )) /
                    ((Double.valueOf(calculateT_N.getText().toString())) *
                    (Math.log(1+(((Double.valueOf(calculateT_R.getText().toString()))/(100) *(Double.valueOf(calculateT_N.getText().toString())))
                            /(Double.valueOf(calculateT_N.getText().toString()))))))
                    ;
            calculateT_result.setText(String.format("%,.2f", resultT)+" year(s)");
        }
        catch(Exception e) {
            calculateT_result.setText("error");
        }
    }
}