package id.ac.id.telkomuniversity.tass.prak5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityKetiga extends AppCompatActivity {
        EditText editText,editText2;
        Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        editText    = findViewById(R.id.pslama);
        editText2   = findViewById(R.id.psbaru);
        button  = findViewById(R.id.ganti);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityKetiga.this, "Password  Berhasil Diubah!", Toast.LENGTH_LONG).show();
            }
        });

    }
}