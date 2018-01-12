package prototipegs1.gestorsm.gs1.diuplasticos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

public class MapClock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_clock);
    }

    public void ViewPhoto(View view) {
        Intent i = new Intent(this, ViewPhoto.class);
        startActivity(i);
    }

    public void newPhoto(View view) {
        Intent i = new Intent(this, SelectSourceImage.class);
        startActivity(i);
    }

    public void back(View view) {
        onBackPressed();
    }

    public void searchNewLocation(View view) {
        ImageView image = (ImageView)findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.ubicacion2);
        SearchView sv = (SearchView)findViewById(R.id.sView);
        sv.setQuery("", false);
        sv.clearFocus();
    }

    public void downloadData(View view){
        Intent i = new Intent(this, DownloadData.class);
        startActivity(i);
    }

}

