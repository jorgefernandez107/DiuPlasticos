package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
            Intent i = new Intent(this, Map.class);
            startActivity(i);
    }

    public void register(View view) {
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }

    public void forgotPass(View view){
        Intent i = new Intent(this,ForgotPass.class);
        startActivity(i);
    }
}

