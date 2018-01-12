package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DownloadData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_data);
    }

    public void back(View view) {
        onBackPressed();
    }

    public void confirmed(View view){
        Intent i = new Intent(this, DownloadConfirmed.class);
        startActivity(i);
    }
}
