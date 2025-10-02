package mx.edu.tesoem.isc.tsdmh252_lgslp1p2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class resta2Activity extends AppCompatActivity {

    EditText r, rr;

    Button btnresultadoresta;

    TextView lbresultadoresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resta2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        r = findViewById(R.id.r);
        btnresultadoresta = findViewById(R.id.btnresultadoresta);
        rr = findViewById(R.id.rr);
        lbresultadoresta = findViewById(R.id.lbresultadoresta);
    }

    public void onClickresta(View view) {
        int v1, v2;
        v1 = Integer.parseInt(r.getText().toString());
        v2 = Integer.parseInt(rr.getText().toString());
        String cadena = "El resultado de la resta es :" + String.valueOf(v1 - v2);
        lbresultadoresta.setText(cadena);
    }

}