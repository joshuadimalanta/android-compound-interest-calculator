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

@EActivity(R.layout.activity_calculate_r)
public class CalculateR extends AppCompatActivity {

    // VARS
    @ViewById(R.id.calculateR_A)
    EditText calculateR_A;
    @ViewById(R.id.calculateR_P)
    EditText calculateR_P;
    @ViewById(R.id.calculateR_N)
    EditText calculateR_N;
    @ViewById(R.id.calculateR_T)
    EditText calculateR_T;
    @ViewById(R.id.calculateR_result)
    TextView calculateR_result;
    @ViewById(R.id.calculateR_go)
    Button calculateR_go;
    double resultR = 0;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
    @Click(R.id.calculateR_go)
    public void calculateR_go(View view){
        try {
            resultR = ((Double.valueOf(calculateR_N.getText().toString())) * (
                    Math.pow(((Double.valueOf(calculateR_A.getText().toString()))/(Double.valueOf(calculateR_P.getText().toString()))),
                            (1/((Double.valueOf(calculateR_N.getText().toString()))*(Double.valueOf(calculateR_T.getText().toString())))))
                    -1))/((Double.valueOf(calculateR_N.getText().toString())));
            resultR = resultR * 100;
            calculateR_result.setText(String.format("%,.2f", resultR)+"%");
        }
        catch(Exception e) {
            calculateR_result.setText("error");
        }
    }
}