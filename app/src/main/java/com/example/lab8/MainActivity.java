package com.example.lab8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double toDouble(int id) {
        return Double.parseDouble( ((EditText)(findViewById(id))).getText().toString() );
    }

    public void onClickCalculate(View view) {
        double items = toDouble(R.id.txtNItems);
        double itemCost = toDouble(R.id.txtItemCost);
        int min = (int)toDouble(R.id.txtMinimum);
        double percent = toDouble(R.id.txtPercent);
        int NForDisc = (int)toDouble(R.id.txtNForDiscount);

        BulkDiscount bd = new BulkDiscount(min, percent);

        TextView txtBD = findViewById(R.id.txtBD);
        txtBD.setText("BulkDiscount:  $"+bd.computeDiscount(items, itemCost));

        BuyNGetOneFree bogo = new BuyNGetOneFree(NForDisc);

        TextView txtBOGO = findViewById(R.id.txtBOGO);
        txtBOGO.setText("BuyN:  $"+bogo.computeDiscount(items, itemCost));
    }
}
