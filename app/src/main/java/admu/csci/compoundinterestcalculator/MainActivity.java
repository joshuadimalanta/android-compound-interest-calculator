package admu.csci.compoundinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    // VARS
    @ViewById(R.id.buttonA)
    Button buttonA;
    @ViewById(R.id.buttonP)
    Button buttonP;
    @ViewById(R.id.buttonR)
    Button buttonR;
    @ViewById(R.id.buttonT)
    Button buttonT;

    // INIT
    @AfterViews
    public void init(){
    }

    // CLICKS
    @Click(R.id.buttonA)
    public void clickButtonA(View view){
        CalculateA_.intent(this).start();
    }
    @Click(R.id.buttonP)
    public void clickButtonP(View view){
        CalculateP_.intent(this).start();
    }
    @Click(R.id.buttonR)
    public void clickButtonR(View view){
        CalculateR_.intent(this).start();
    }
    @Click(R.id.buttonT)
    public void clickButtonT(View view){
        CalculateT_.intent(this).start();
    }

}