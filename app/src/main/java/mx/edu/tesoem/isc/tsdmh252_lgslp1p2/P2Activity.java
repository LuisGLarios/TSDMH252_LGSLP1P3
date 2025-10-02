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

public class P2Activity extends AppCompatActivity {

    EditText po;

    Button btnP2;

    TextView lbresultadop2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_p2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        po = findViewById(R.id.po);
        btnP2 = findViewById(R.id.btnP2);
        lbresultadop2= findViewById(R.id.lbresultadop2);

    }

    public void onclickelevar(View view){
        double E1;

        E1 = Double.parseDouble(po.getText().toString());


        double resultado = E1 * E1;

        String cadena = "El resultado de elevar al cuadrado es: " + String.valueOf(resultado);
        lbresultadop2.setText(cadena);
    }


}