package ipn.cecyt9.graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MiCanvas canvas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvas1 = new MiCanvas(this);
        setContentView(canvas1);
    }
}