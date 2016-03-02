package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";
    String strMiddleName="";
    String strLastName="";
    Button btnGreetMe;
    EditText edtxtMiddleName;
    EditText edtxtLastName;
    EditText edtxtNameField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMiddleName = (EditText) findViewById(R.id.editText2);
        edtxtLastName = (EditText) findViewById(R.id.editText);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strMiddleName = edtxtMiddleName.getText().toString();
        strLastName = edtxtLastName.getText().toString();

        txtvwGreetingSpace.setText(String.format("Hello, %1$s %2$s %3$s", strUsersName, strMiddleName, strLastName));
    }
}
