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

public class raizActivity extends AppCompatActivity {

    EditText lbRC ;

    Button btnraiz;

    TextView lbresultadoraiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_raiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lbRC = findViewById(R.id.lbRC);
        btnraiz = findViewById(R.id.btnraiz);
        lbresultadoraiz= findViewById(R.id.lbresultadoraiz);



    }

    public void onclickraiz(View view) {

        // Tomamos el número
        double R1 = Double.parseDouble(lbRC.getText().toString());

        // Calculamos la raíz cuadrada
        double resultado = Math.sqrt(R1);

        // Mostramos el resultado
        String cadena = "La raíz cuadrada de " + R1 + " es: " + resultado;
        lbresultadoraiz.setText(cadena);
    }



}