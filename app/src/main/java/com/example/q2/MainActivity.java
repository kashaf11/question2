package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] use = getResources().getStringArray(R.array.email);
        final String[] pas = getResources().getStringArray(R.array.pass);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean found = false;
                String myUsername = email.getText().toString();
                String myPassword = password.getText().toString();

                for (int i = 0; i < use.length; i++) {
                    if (use[i].equals(myUsername) && pas[i].equals(myPassword)) {
                        Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}