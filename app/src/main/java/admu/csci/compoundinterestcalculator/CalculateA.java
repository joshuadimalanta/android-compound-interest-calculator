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

@EActivity(R.layout.activity_calculate)
public class CalculateA extends AppCompatActivity {

    // VARS
    @ViewById(R.id.calculateA_P)
    EditText calculateA_P;
    @ViewById(R.id.calculateA_R)
    EditText calculateA_R;
    @ViewById(R.id.calculateA_N)
    EditText calculateA_N;
    @ViewById(R.id.calculateA_T)
    EditText calculateA_T;
    @ViewById(R.id.calculateA_result)
    TextView calculateA_result;
    @ViewById(R.id.calculateA_go)
    Button calculateA_go;
    double resultA = 0;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
    @Click(R.id.calculateA_go)
    public void calculateA_go(View view){
        try {
            resultA = (Double.valueOf(calculateA_P.getText().toString())) *
                    Math.pow((((1) + ((Double.valueOf(calculateA_R.getText().toString())/(100) *(Double.valueOf(calculateA_N.getText().toString()))) / Double.valueOf(calculateA_N.getText().toString())))),
                            ((Double.valueOf(calculateA_N.getText().toString()))*(Double.valueOf(calculateA_T.getText().toString()))));
            calculateA_result.setText(String.format("%,.2f", resultA));
//            calculateA_result.setText(String.valueOf((float)resultA));
        }
        catch(Exception e) {
            calculateA_result.setText("error");
        }
    }
}