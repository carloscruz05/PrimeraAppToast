package com.example.apptoast;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAccept = findViewById(R.id.btn_accept);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Confirmación")
                .setMessage("¿Estás seguro de que deseas aceptar?")
                .setPositiveButton("Aceptar", (dialog, which) -> {
                    Log.e("onClick", "Presionó aceptar");
                    Toast.makeText(MainActivity.this, "Has seleccionado aceptar", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("Cancelar", (dialog, which) -> {
                    Log.e("onClick", "Presionó cancelar");
                    Toast.makeText(MainActivity.this, "Has seleccionado cancelar", Toast.LENGTH_SHORT).show();
                })
                .create()
                .show();
    }
}
