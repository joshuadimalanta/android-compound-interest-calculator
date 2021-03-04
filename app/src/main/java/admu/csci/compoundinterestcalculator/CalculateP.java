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

@EActivity(R.layout.activity_calculate_p)
public class CalculateP extends AppCompatActivity {

    // VARS
    @ViewById(R.id.calculateP_A)
    EditText calculateP_A;
    @ViewById(R.id.calculateP_R)
    EditText calculateP_R;
    @ViewById(R.id.calculateP_N)
    EditText calculateP_N;
    @ViewById(R.id.calculateP_T)
    EditText calculateP_T;
    @ViewById(R.id.calculateP_result)
    TextView calculateP_result;
    @ViewById(R.id.calculateP_go)
    Button calculateP_go;
    double resultP = 0;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
    @Click(R.id.calculateP_go)
    public void calculateP_go(View view){
        try {
            resultP = Double.valueOf(calculateP_A.getText().toString()) /
                    Math.pow((1 + ( (Double.valueOf(calculateP_R.getText().toString())/(100)*(Double.valueOf(calculateP_N.getText().toString())))
                                    / (Double.valueOf(calculateP_N.getText().toString())))),
                            (Double.valueOf(calculateP_N.getText().toString()))*(Double.valueOf(calculateP_T.getText().toString())));
            calculateP_result.setText(String.format("%,.2f", resultP));
        }
        catch(Exception e) {
            calculateP_result.setText("error");
        }
    }
}