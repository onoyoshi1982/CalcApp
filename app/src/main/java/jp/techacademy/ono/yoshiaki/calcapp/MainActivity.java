package jp.techacademy.ono.yoshiaki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);

        mEditText2 = (EditText) findViewById(R.id.editText2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, SecondActivity.class);

        float num1 = Float.parseFloat(mEditText1.getText().toString());
        float num2 = Float.parseFloat(mEditText2.getText().toString());

        if (v.getId() == R.id.button1) {
            intent.putExtra("VALUE", num1 + num2);
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("VALUE", num1 - num2);
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("VALUE", num1 * num2);
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("VALUE", num1 / num2);
        }

        startActivity(intent);

    }
}
