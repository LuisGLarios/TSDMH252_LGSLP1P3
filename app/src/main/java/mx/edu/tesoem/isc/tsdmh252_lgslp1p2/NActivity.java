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

public class NActivity extends AppCompatActivity {


    EditText N, NN;

    Button btnPN;

    TextView lbresultadoN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        N = findViewById(R.id.N);
        NN = findViewById(R.id.NN);
        btnPN = findViewById(R.id.btnPN);
        lbresultadoN = findViewById(R.id.lbresultadoN);


    }

    public void onclickelevarN(View view) {
        // Base
        double N1 = Double.parseDouble(N.getText().toString());

        // Exponente (lo lees desde otro EditText llamado n2)
        double N = Double.parseDouble(NN.getText().toString());

        // Potencia
        double resultado = Math.pow(N1, N);

        // Mostrar resultado
        String cadena = "El resultado de elevar " + N1 + " a la potencia " + N + " es: " + resultado;
        lbresultadoN.setText(cadena);


    }

}