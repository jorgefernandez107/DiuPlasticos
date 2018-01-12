package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SelectSourceImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_source_image);
    }

    public void back(View view) {
        onBackPressed();
    }

    public void toCamera(View view){
        Intent i = new Intent(this, NewPhoto.class);
        startActivity(i);
    }

    public void selectFromGallery(View view){
        Toast.makeText(this, "Selección de imágenes desde la galería", Toast.LENGTH_LONG).show();
    }
}
