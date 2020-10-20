package id.ac.id.telkomuniversity.tass.prak5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button,button2;
    EditText editText,editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button      = findViewById(R.id.button);
        button2     = findViewById(R.id.button2);
        editText   = findViewById(R.id.username);
        editText2  = findViewById(R.id.password);
    }
    public void login(View v){
        Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
        Bundle b = new Bundle();

        b.putString("nama",editText.getText().toString());
        b.putString("katasandi",editText2.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
    public void lupaPassword(View v){
        Intent intent = new Intent(MainActivity.this, ActivityKetiga.class);
        Bundle b = new Bundle();

        intent.putExtras(b);
        startActivity(intent);
    }


}