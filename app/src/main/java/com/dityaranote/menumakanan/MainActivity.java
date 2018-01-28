package com.dityaranote.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int totalHarga = 0;
    int hargaMadu = 50000;
    int Quantity = 0;

    private void setQuantitis(int quantiti){
        Quantity = quantiti;
    }

// kita bakalan membuat method untuk manampilkan quantitinya kita ke layout xml
    private void displayQuantity(int Quantiti){
        TextView qty = (TextView)findViewById(R.id.tv_qty);
        qty.setText(""+Quantiti);
    }


    public void setPlus(View view) {
//        nanti kita bakalan nulis action disini
        setQuantitis(Quantity+1);
        displayQuantity(Quantity);

    }

    public void setMin(View view) {
//        nanti kita bakalan nulis action disini
//       jika nilai Quantity kurang dari atau samadengan 0 maka
        if (Quantity <= 0){
            Toast.makeText(MainActivity.this,"Maaf quantity sudah 0",Toast.LENGTH_SHORT).show();
        } else {
            //        selain itu mkaa dikurangi satu
            setQuantitis(Quantity-1);
            displayQuantity(Quantity);
        }


    }

    public void myOrder(View view) {
//        doit
        TextView tv_harga = (TextView)findViewById(R.id.harga);
        totalHarga  = Quantity*hargaMadu;
        name();
        tv_harga.setText(""+totalHarga);
    }
//    membuat nama pemesan pada editText
    private void name(){
        EditText edtname = (EditText)findViewById(R.id.edt_name);
        String name = edtname.getText().toString();
        Toast.makeText(MainActivity.this,"Pesanana Atas Nama : "+
                name + ", Jumlah pesan :"+ Quantity +", Dengan harga :+"
                +Quantity*hargaMadu,Toast.LENGTH_SHORT).show();
    }


}
