package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CompleteUpload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_upload);
    }

    public void back(View view) {
        Intent i = new Intent(this, Map2.class);
        startActivity(i);
    }
}
