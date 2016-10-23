package co.com.summum.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irRoerikCafe(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void irTexasBurger(View view) {
        Intent intent = new Intent(this, MapOneActivity.class);
        startActivity(intent);
    }

    public void irSantaFe(View view) {
        Intent intent = new Intent(this, MapDosActivity.class);
        startActivity(intent);
    }

    public void irBiblioteca(View view) {
        Intent intent = new Intent(this, MapTresActivity.class);
        startActivity(intent);
    }
}
