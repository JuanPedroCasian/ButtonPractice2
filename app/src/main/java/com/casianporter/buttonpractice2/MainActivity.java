package com.casianporter.buttonpractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText; // Imports code to read the text edits in order to create edittext variables

public class MainActivity extends AppCompatActivity {

    public void ClickOnFunction (View Button) {

        EditText TextUsername = (EditText) findViewById(R.id.TextUsername); /* Here we created an Edit Text variable which gets the
                                                                input from the View TextInput1

                                                                findViewById(ruta a view);

                                                                = a buscar el valor en la vista que buscas

                                                                (EditText) convierte lo que viene de la view en VIew variable
                                                                a data de EditText
                                                                */
        EditText TextPassword = (EditText) findViewById(R.id.TextPassword);

        Log.i("Info:", "Username: " + TextUsername.getText().toString()); /* in UserInput1.getText().toString()
                                                                                    we get the text from the edittext variable
                                                                                    and then convert it into a string to print.

                                                                                     Este es como c++ que puedes imprimir muchas cosas poniendo +

                                                                                     */
        Log.i("Info:", "Password: " + TextPassword.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
