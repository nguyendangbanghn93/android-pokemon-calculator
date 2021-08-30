package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditUserActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edUser;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);
        edUser = (EditText) findViewById(R.id.edUser);
        btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDone:
                onDone();
                break;
            default:
        }
    }

    private void onDone() {
        Intent intent = new Intent();
        intent.putExtra("RESULT", edUser.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}