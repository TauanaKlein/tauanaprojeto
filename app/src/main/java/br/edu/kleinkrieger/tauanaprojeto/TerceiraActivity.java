package br.edu.kleinkrieger.tauanaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {

    private Button ok;
    private Button ok2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        ok = findViewById(R.id.button3);
        ok2 = findViewById(R.id.butt_back);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsegunda = new Intent(TerceiraActivity.this, SegundaActivity.class);
                startActivity(intentsegunda);

            }
        });
        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprincipal = new Intent(TerceiraActivity.this, PrincipalActivity.class);
                startActivity(intentprincipal);
            }
        });
    }
}
