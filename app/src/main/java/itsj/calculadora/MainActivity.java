package itsj.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double n1, n2, res;
    public int num;
    double ms;

    public EditText pantalla1, pantalla2;
    public Button btnMC, btnMR, btnMplus, btnMless, btnMS, btnM;
    public Button btnPorcentaje, btnRaiz, btnPotencia, btnDivisionx;
    public Button btnCE, btnC, btnBorrar, btnDivision;
    public Button btnSiete, btnOcho, btnNueve, btnMultiplicacion;
    public Button btnCuatro, btnCinco, btnSeis, btnResta;
    public Button btnUno, btnDos, btnTres, btnSuma;
    public Button btnMasmenos, btnCero, btnPunto, btnIgual;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla2 = findViewById(R.id.pantalla2);
        pantalla1 = findViewById(R.id.pantalla1);
        num = 0;

        btnMC = findViewById(R.id.btnMC);
        btnMC.setOnClickListener((View.OnClickListener) this);
        btnMR = findViewById(R.id.btnMR);
        btnMR.setOnClickListener((View.OnClickListener) this);
        btnMplus = findViewById(R.id.btnMplus);
        btnMplus.setOnClickListener((View.OnClickListener) this);
        btnMless = findViewById(R.id.btnMless);
        btnMless.setOnClickListener((View.OnClickListener) this);
        btnMS = findViewById(R.id.btnMS);
        btnMS.setOnClickListener((View.OnClickListener) this);
        btnM = findViewById(R.id.btnM);
        btnM.setOnClickListener((View.OnClickListener) this);

        btnPorcentaje = findViewById(R.id.btnPorcentaje);
        btnPorcentaje.setOnClickListener((View.OnClickListener) this);
        btnRaiz = findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener((View.OnClickListener) this);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnPotencia.setOnClickListener((View.OnClickListener) this);
        btnDivisionx = findViewById(R.id.btnDivisionx);
        btnDivisionx.setOnClickListener((View.OnClickListener) this);
        btnCE = findViewById(R.id.btnCE);
        btnCE.setOnClickListener((View.OnClickListener) this);
        btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener((View.OnClickListener) this);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener((View.OnClickListener) this);
        btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener((View.OnClickListener) this);
        btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener((View.OnClickListener) this);

        btnCero = findViewById(R.id.btnCero);
        btnCero.setOnClickListener((View.OnClickListener) this);
        btnUno = findViewById(R.id.btnUno);
        btnUno.setOnClickListener((View.OnClickListener) this);
        btnDos = findViewById(R.id.btnDos);
        btnDos.setOnClickListener((View.OnClickListener) this);
        btnTres = findViewById(R.id.btnTres);
        btnTres.setOnClickListener((View.OnClickListener) this);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCuatro.setOnClickListener((View.OnClickListener) this);
        btnCinco = findViewById(R.id.btnCinco);
        btnCinco.setOnClickListener((View.OnClickListener) this);
        btnSeis = findViewById(R.id.btnSeis);
        btnSeis.setOnClickListener((View.OnClickListener) this);
        btnSiete = findViewById(R.id.btnSiete);
        btnSiete.setOnClickListener((View.OnClickListener) this);
        btnOcho = findViewById(R.id.btnOcho);
        btnOcho.setOnClickListener((View.OnClickListener) this);
        btnNueve = findViewById(R.id.btnNueve);
        btnNueve.setOnClickListener((View.OnClickListener) this);

        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener((View.OnClickListener) this);
        btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener((View.OnClickListener) this);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnMultiplicacion.setOnClickListener((View.OnClickListener) this);
        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener((View.OnClickListener) this);
        btnMasmenos = findViewById(R.id.btnMasmenos);
        btnMasmenos.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        int evento = v.getId();
        String cad = "";
        cad = cad + pantalla1.getText();

        if(evento == R.id.btnCero) {
            if(pantalla1.getText().equals("0") ) {
                pantalla1.setText("0");
            } else {
                pantalla1.setText(cad+"0");
            }
        } else if(evento == R.id.btnUno) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("1");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"1");
            } else {
                pantalla1.setText(cad+"1");
            }
        } else if(evento == R.id.btnDos) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("2");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"2");
            } else {
                pantalla1.setText(cad+"2");
            }
        } else if(evento == R.id.btnTres) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("3");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"3");
            } else {
                pantalla1.setText(cad+"3");
            }
        } else if(evento == R.id.btnCuatro) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("4");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"4");
            } else {
                pantalla1.setText(cad+"4");
            }
        } else if(evento == R.id.btnCinco) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("5");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"5");
            } else {
                pantalla1.setText(cad+"5");
            }
        } else if(evento == R.id.btnSeis) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("6");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"6");
            } else {
                pantalla1.setText(cad+"6");
            }
        } else if(evento == R.id.btnSiete) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("7");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"7");
            } else {
                pantalla1.setText(cad+"7");
            }
        } else if(evento == R.id.btnOcho) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("8");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"8");
            } else {
                pantalla1.setText(cad+"8");
            }
        } else if(evento == R.id.btnNueve) {
            if(pantalla1.getText().equals("0")) {
                pantalla1.setText("9");
            } else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
                cad = "";
                pantalla1.setText(cad+"9");
            } else {
                pantalla1.setText(cad+"9");
            }
        } else if(evento == R.id.btnC) {
            pantalla1.setText("");
            pantalla2.setText("");
            ms = 0;
            res = 0.0;
            num = 0;
        } else if(evento == R.id.btnCE) {
            pantalla1.setText("");
            pantalla2.setText("");
            ms = 0;
            res = 0.0;
            num = 0;
        } else if(evento == R.id.btnPunto) {
            int cont=0;
            for(int i=0; i < pantalla1.getText().length(); i++) {
                if(pantalla1.getText().toString().substring(i, i+1).equals(".")) {
                    cont++;
                }
            }

            if(cont==0) {
                pantalla1.setText(cad+".");
            }
        } else if(evento == R.id.btnIgual) {
            n2 = Double.parseDouble(pantalla1.getText().toString());
            if(num == 1) {
                res = res+n2;
            } else if(num == 2) {
                res = res-n2;
            } else if(num == 3) {
                res = res*n2;
            } else if(num == 4) {
                res = res/n2;
            }

            pantalla1.setText(res+"");
            pantalla2.setText("");
        } else if(evento == R.id.btnSuma){
            if(pantalla2.getText().toString().equals("")) {
                n2=0;
            } else {
                n2 = Double.parseDouble(pantalla2.getText().toString());
            }

            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = n2 + n1;
            pantalla1.setText("");
            pantalla2.setText(res+"+");
            num = 1;
        } else if(evento == R.id.btnResta){
            if(pantalla2.getText().toString().equals("")) {
                n2=0;
            } else {
                n2 = Double.parseDouble(pantalla2.getText().toString());
            }

            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = n1 - n2;
            pantalla1.setText("");
            pantalla2.setText(res+"-");
            num = 2;
        } else if(evento == R.id.btnMultiplicacion){
            if(pantalla2.getText().toString().equals("")) {
                n1=1;
            } else {
                n1 = Double.parseDouble(pantalla2.getText().toString());
            }

            if(pantalla1.getText().toString().equals("")) {
                n2= 1;
            } else {
                n2 = Double.parseDouble(pantalla1.getText().toString());
            }
            res = 1;
            res = res * n2;
            pantalla1.setText("");
            pantalla2.setText(res+"x");
            num = 3;
        } else if(evento == R.id.btnDivision){
            if(pantalla2.getText().toString().equals("")) {
                n1=1;
            } else {
                n1 = Double.parseDouble(pantalla2.getText().toString());
            }

            if(pantalla1.getText().toString().equals("")) {
                n2= 1;
            } else {
                n2 = Double.parseDouble(pantalla1.getText().toString());
            }

            //res = 1;
            //n1 = Double.parseDouble(pantalla1.getText().toString());
            res = n2 / n1;
            pantalla1.setText("");
            pantalla2.setText(res+"/");
            num = 4;
        } else if(evento == R.id.btnDivisionx){
            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = 1/n1;
            pantalla1.setText(res+"");
        } else if(evento == R.id.btnPotencia){
            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = Math.pow(n1, 2);
            pantalla1.setText(res+"");
        } else if(evento == R.id.btnPorcentaje){

        } else if(evento == R.id.btnRaiz){
            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = Math.sqrt(n1);
            pantalla1.setText(res+"");
        } else if(evento == R.id.btnMasmenos){
            n1 = Double.parseDouble(pantalla1.getText().toString());
            res = n1*(-1);
            pantalla1.setText(res+"");
        } else if(evento == R.id.btnBorrar){
            if(pantalla1.getText().length() == 1) {
                pantalla1.setText("0");
            } else {
                pantalla1.setText(pantalla1.getText().toString().substring(0, pantalla1.getText().length()-1));
            }
        } else if(evento == R.id.btnM){

        } else if(evento == R.id.btnMS){
            ms = Double.parseDouble(pantalla1.getText().toString());
            pantalla1.setText("");
        } else if(evento == R.id.btnMR){
            pantalla1.setText(ms+"");
        } else if(evento == R.id.btnMplus){
            ms = ms + Double.parseDouble(pantalla1.getText().toString());
        } else if(evento == R.id.btnMless){
            ms = ms - Double.parseDouble(pantalla1.getText().toString());
        } else if(evento == R.id.btnMC){
            ms = 0;
        }

    }
};
