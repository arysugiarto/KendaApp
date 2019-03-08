package id.kendaapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.kendaapp.R;

public class RegisterActivity extends AppCompatActivity {

    private Button btn_regis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_regis = (Button)findViewById(R.id.btn_regis);

        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(moveIntent);
            }
        });
    }


}
