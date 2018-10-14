package org.dalol.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.dalol.libarydivision.DivisionCalculator;
import org.dalol.librarycommon.ICalculator;
import org.dalol.librarymultiplication.MultiplicationCalculator;
import org.dalol.librarytwo.SubtractionCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ICalculator addCalculator = new AdditionCalculator(); // excluded module

        ICalculator subCalculator = new SubtractionCalculator();
        ICalculator divCalculator = new DivisionCalculator();
        ICalculator multCalculator = new MultiplicationCalculator();
        //ICalculator calculator = new AdditionCalculator();


        double answer1 = subCalculator.getAnswer(10, 5);
        double answer2 = divCalculator.getAnswer(50, 5);
        double answer3 = multCalculator.getAnswer(10, 10);
    }
}
