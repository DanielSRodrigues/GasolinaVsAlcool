package br.edu.unibratec.gasolinavsalcool;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtGasolina;
    private EditText edtAlcool;
    private EditText edtMsg;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGasolina = (EditText) findViewById(R.id.edtGasolina);
        edtAlcool = (EditText) findViewById(R.id.edtAlcool);
        edtMsg = (EditText) findViewById(R.id.edtMsg);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pAlcool = Double.parseDouble(edtAlcool.getText().toString());
                double pGasolina = Double.parseDouble(edtGasolina.getText().toString());
                String msg = "";
                if (pAlcool < pGasolina * 0.70) {
                    msg = getString(R.string.msgMelhorAlcool);
                } else {
                    msg = getString(R.string.msgMelhorGasolina);
                }
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
                edtMsg.setText(msg);
            }
        });


    }
}
