package com.example.lesson7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Integer firstValue = 0;
    private Integer secondValue = 0;
    private Integer result = 0;
    private TextView tvResult;
    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine, btnPlus,btnMinus,btnMultiplication,btnDivision, btnEqual, btnClear;
    private boolean onCheckFirstValue = true;
    private boolean addition = false;
    private boolean subtraction = false;
    private boolean multiplication = false;
    private boolean division = false;
    private Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMultiplication = findViewById(R.id.btn_multiplication);
        btnDivision = findViewById(R.id.btn_division);
        btnEqual = findViewById(R.id.btn_equal);
        btnClear = findViewById(R.id.btn_clear);
        calculatedNew();
    }

    @SuppressLint("SetTextI18n")
    public void calculatedNew() {
        btnOne.setOnClickListener(v -> {
            if (onCheckFirstValue) {
                if (firstValue.equals(0)) firstValue = 1;
                else firstValue = Integer.valueOf(firstValue + "1");
                tvResult.setText(firstValue.toString());
            } else {
                if (secondValue.equals(0)) secondValue = 1;
                else secondValue = Integer.valueOf(secondValue + "1");
                tvResult.setText(secondValue.toString());
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 2;
                    else firstValue = Integer.valueOf(firstValue + "2");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 2;
                    else secondValue = Integer.valueOf(secondValue + "2");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 3;
                    else firstValue = Integer.valueOf(firstValue + "3");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 3;
                    else secondValue = Integer.valueOf(secondValue + "3");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 4;
                    else firstValue = Integer.valueOf(firstValue + "4");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 4;
                    else secondValue = Integer.valueOf(secondValue + "4");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 5;
                    else firstValue = Integer.valueOf(firstValue + "5");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 5;
                    else secondValue = Integer.valueOf(secondValue + "5");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 6;
                    else firstValue = Integer.valueOf(firstValue + "6");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 6;
                    else secondValue = Integer.valueOf(secondValue + "6");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 7;
                    else firstValue = Integer.valueOf(firstValue + "7");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 7;
                    else secondValue = Integer.valueOf(secondValue + "7");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 8;
                    else firstValue = Integer.valueOf(firstValue + "8");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 8;
                    else secondValue = Integer.valueOf(secondValue + "8");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 9;
                    else firstValue = Integer.valueOf(firstValue + "9");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 9;
                    else secondValue = Integer.valueOf(secondValue + "9");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnPlus.setOnClickListener(v -> {
            addition = true;
            onCheckFirstValue = false;
        });
        btnMinus.setOnClickListener(v -> {
            subtraction = true;
            onCheckFirstValue = false;
        });
        btnMultiplication.setOnClickListener(v -> {
            multiplication = true;
            onCheckFirstValue = false;
        });
        btnDivision.setOnClickListener(v -> {
            division = true;
            onCheckFirstValue = false;
        });

        btnClear.setOnClickListener(v -> {
            firstValue = 0;
            secondValue = 0;
            tvResult.setText("0");
            result = 0;
        });

        btnEqual.setOnClickListener(v -> {
            if (addition) {
                result = firstValue + secondValue;
                addition = false;
            }
            else if (subtraction){
                result = firstValue - secondValue;
                subtraction = false;
            }
            else if (multiplication){
            result = firstValue * secondValue;
            multiplication = false;
            }
            else if (division){
                result = firstValue / secondValue;
                division = false;
            }
            tvResult.setText(result.toString());
            firstValue = 0;
            secondValue = 0;
            result = 0;
            onCheckFirstValue = true;
        });
    }
}