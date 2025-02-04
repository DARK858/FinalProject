package com.example.awesomecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    private TextView previousCalculation;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        previousCalculation = findViewById(R.id.Calculator);
        display = findViewById(R.id.DisplayEditText);

        display.setShowSoftInputOnFocus(false);

    }

    private void updateText(String strToAdd) {
//        String oldStr = display.getText().toString();
//
//        int cursorPos = display.getSelectionStart();
//
//        String leftStr = oldStr.substring(0, cursorPos);
//        String rightStr = oldStr.substring(cursorPos);
//
//        display.setText(String.format("%s%s%s", leftStr, oldStr, strToAdd, rightStr));
//        display.setSelection(cursorPos + strToAdd.length());
        display.setText(display.getText().toString() + strToAdd);
    }


    public void zeroBTNPush(View view) {

        updateText(getResources().getString(R.string.zeroText));


    }

    public void oneBTNPush(View view) {
        updateText(getResources().getString(R.string.oneText));
    }

    public void twoBTNPush(View view) {
        updateText(getResources().getString(R.string.twoText));
    }


    public void threeBTNPush(View view) {
        updateText(getResources().getString(R.string.threeText));
    }


    public void fourBTNPush(View view) {
        updateText(getResources().getString(R.string.fourText));
    }


    public void fiveBTNPush(View view) {
        updateText(getResources().getString(R.string.fiveText));
    }


    public void sixBTNPush(View view) {
        updateText(getResources().getString(R.string.sixText));
    }


    public void sevenBTNPush(View view) {
        updateText(getResources().getString(R.string.sevenText));
    }

    public void eightBTNPush(View view) {
        updateText(getResources().getString(R.string.eightText));
    }


    public void nineBTNPush(View view) {
        updateText(getResources().getString(R.string.nineText));
    }


    public void decimalBTNPush(View view) {
        updateText(getResources().getString(R.string.decimalText));
    }


    public void equalsBTNPush(View view) {
       String userExp = display.getText().toString();

       userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
       Expression exp = new Expression(userExp);
       String result = String.valueOf(exp.calculate());

       display.setText(result);
       display.setSelection(result.length());


    }


    public void addBTNPush(View view) {
        updateText(getResources().getString(R.string.addText));
    }

    public void subtractBTNPush(View view) {
        updateText(getResources().getString(R.string.subtractText));
    }

    public void multiplyBTNPush(View view) {
        updateText(getResources().getString(R.string.multiplyText));
    }

    public void divideBTNPush(View view) {
        updateText(getResources().getString(R.string.divideText));
    }

    public void parenthesesCloseBTNPush(View view) {
        updateText(getResources().getString(R.string.parenthesesCloseText));

    }

    public void parenthesesOpenBTNPush(View view) {
        updateText(getResources().getString(R.string.parenthesesOpenText));

    }

    public void BackspaceBTNPush(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }




        }
    public void clearBTNPush (View view) {
        display.setText("");


    }

}