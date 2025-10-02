package mx.edu.tesoem.isc.tsdmh252_lgslp1p2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class PrincipalActivity extends AppCompatActivity {

    Button btnsu, btnre, btnmul, btndi, btnN2, btnra, btnN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, sumaActivity.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(this, resta2Activity.class);
        startActivity(intent);
    }

    public void onClick3(View v) {
        Intent intent = new Intent(this, multiActivity.class);
        startActivity(intent);
    }

    public void onClick4(View v) {
        Intent intent = new Intent(this, divicionActivity.class);
        startActivity(intent);
    }

    public void onClick5(View v) {
        Intent intent = new Intent(this, P2Activity.class);
        startActivity(intent);


    }

    public void onClick6(View v) {
        Intent intent = new Intent(this, NActivity.class);
        startActivity(intent);

    }

    public void onClick7(View v) {
        Intent intent = new Intent(this, raizActivity.class);
        startActivity(intent);


    }

}

