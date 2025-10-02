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

public class divicionActivity extends AppCompatActivity {

    EditText d1, d2;

    Button btnresultadodivicion;

    TextView lbresdivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divicion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        d1 = findViewById(R.id.d1);
        btnresultadodivicion = findViewById(R.id.btnresultadodivicion);
        d2 = findViewById(R.id.d2);
        lbresdivi= findViewById(R.id.lbresdivi);

    }

    public void onClickdivi(View view) {
        double m1, m2;

        m1 = Double.parseDouble(d1.getText().toString());
        m2 = Double.parseDouble(d2.getText().toString());

        if (m2 != 0) {
            String cadena = "El resultado de la División es: " + String.valueOf(m1 / m2);
            lbresdivi.setText(cadena);
        } else {
            lbresdivi.setText("Error: División entre cero");
        }

    }


}