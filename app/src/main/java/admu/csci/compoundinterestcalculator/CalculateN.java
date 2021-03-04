package admu.csci.compoundinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_calculate_n)
public class CalculateN extends AppCompatActivity {

    // VARS
    @ViewById(R.id.calculateN_A)
    EditText calculateN_A;
    @ViewById(R.id.calculateN_P)
    EditText calculateN_P;
    @ViewById(R.id.calculateN_R)
    EditText calculateN_R;
    @ViewById(R.id.calculateN_T)
    EditText calculateN_T;
    @ViewById(R.id.calculateN_result)
    TextView calculateN_result;
    @ViewById(R.id.calculateN_go)
    Button calculateN_go;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
//    @Click(R.id.buttonA)
//    public void clickButtonA(View view){
//        CalculateA_.intent(this).start();
//    }
}