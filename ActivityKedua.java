package id.ac.id.telkomuniversity.tass.prak5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
        TextView textView,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Bundle b = getIntent().getExtras();

        textView = findViewById(R.id.username);
        textView2 = findViewById(R.id.ps);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        textView.setText(b.getCharSequence("nama"));
        textView2.setText(b.getCharSequence("katasandi"));

    }
}