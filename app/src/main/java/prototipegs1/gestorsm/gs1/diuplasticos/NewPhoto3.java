package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NewPhoto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_photo3);
    }

    public void newPhoto(View view) {
        Intent i = new Intent(this, CompleteUpload.class);
        startActivity(i);
    }

    public void back(View view) {
        Intent i = new Intent(this, Map2.class);
        startActivity(i);

    }
}
