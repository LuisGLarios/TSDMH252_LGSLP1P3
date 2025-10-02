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

public class multiActivity extends AppCompatActivity {

    EditText m1, mm;

    Button btnresultadomulti;

    TextView lbresultadomulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        m1 = findViewById(R.id.m1);
        btnresultadomulti = findViewById(R.id.btnresultadomulti);
        mm = findViewById(R.id.mm);
        lbresultadomulti = findViewById(R.id.lbresultadomulti);





    }

    public void onClickmulti(View view) {
        int v1, v2;
        v1 = Integer.parseInt(m1.getText().toString());
        v2 = Integer.parseInt(mm.getText().toString());
        String cadena = "El resultado de la multiplicacion es :" + String.valueOf(v1 * v2);
        lbresultadomulti.setText(cadena);
    }
}