package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewPhoto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_photo2);
    }

    public void newPhoto(View view){
        Intent i = new Intent(this, NewPhoto3.class);
        startActivity(i);
    }

    public void back(View view) {
        onBackPressed();
    }
}