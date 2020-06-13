package com.example.hideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private boolean isShowPassword = false;
    EditText editText;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickMethod();
    }

    private void clickMethod() {
        editText=  findViewById(R.id.etPassword);
        imageView = findViewById(R.id.imgEye);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isShowPassword) {

                    editText.setTransformationMethod(new PasswordTransformationMethod());
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.visibility_on));
                    isShowPassword = false;
                }else{
                    editText.setTransformationMethod(null);
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.visibility_off));
                    isShowPassword = true;
                }
            }
        });
    }


}
