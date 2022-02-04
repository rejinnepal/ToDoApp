package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
        // user can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));

            }
        });
        // User can tap a button to change the text string of the label - Codepath is Great!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Codepath is Great!");

            }
        });
        // User can tap on the background view to reset all views to default settings
        // 1. Reset the text to "Hello from Rejin!" id-text
        // 2. Reset the color of the text to original color
               // original text color- black, text id - text
        // 3. Reset the background color
                //original background color - R.color.light_purple

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset the text to "Hello from Rasneet!" id-text
                textView.setText("Hello from Rejin!");

                // 2. Reset the color of the text to original color
                // original text color- black, text id - text
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3. Reset the background color
                //original background color - R.color.light_purple
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));
            }
        });

        //User can tap the "Change text string" button to update the label with the text from the text field
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                textView.setText(userEnteredText);

                // if the text field is empty, update label with default text string.

                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter Your Own Text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}