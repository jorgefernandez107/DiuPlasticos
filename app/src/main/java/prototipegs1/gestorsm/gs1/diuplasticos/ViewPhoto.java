package prototipegs1.gestorsm.gs1.diuplasticos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewPhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);
    }

    public void back(View view){
        onBackPressed();
    }
}
