package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DownloadConfirmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_confirmed);
    }

    public void toMap(View view){
        Intent i = new Intent(this, Map2.class);
        startActivity(i);
    }
}
