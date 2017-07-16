package br.com.jordan.atmconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
    private ImageButton ibEmpresa, ibServico, ibCliente, ibContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibEmpresa = (ImageButton) findViewById(R.id.ibEmpresa);
        ibServico = (ImageButton) findViewById(R.id.ibServico);
        ibCliente = (ImageButton) findViewById(R.id.ibCliente);
        ibContato = (ImageButton) findViewById(R.id.ibContato);

        ibEmpresa.setOnClickListener(listernerEmpresa);
        ibServico.setOnClickListener(listenerServico);
        ibCliente.setOnClickListener(listenerCliente);
        ibContato.setOnClickListener(listenerContato);
    }

    private View.OnClickListener listernerEmpresa = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
        }
    };

    private View.OnClickListener listenerServico = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, ServicoActivity.class));
        }
    };

    private View.OnClickListener listenerCliente = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, ClienteActivity.class));
        }
    };

    private View.OnClickListener listenerContato = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
