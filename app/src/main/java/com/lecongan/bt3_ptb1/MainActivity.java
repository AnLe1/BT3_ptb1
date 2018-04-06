package com.lecongan.bt3_ptb1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edta, edtb;
    private TextView tvKq;
    private Button btnTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edta= (EditText) findViewById(R.id.edt_a);
        edtb= (EditText) findViewById(R.id.edt_b);
        tvKq = (TextView) findViewById(R.id.tv_kq);
        btnTinh = (Button) findViewById(R.id.btn_tinh);
        btnTinh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tinh:
                if(!edta.getText().toString().isEmpty() && !edtb.getText().toString().isEmpty()){
                    float a = Float.parseFloat(edta.getText().toString());
                    float b = Float.parseFloat(edtb.getText().toString());
                    float x = - (b/a);

                    if(a==0){
                        if(b==0){
                            tvKq.setText("PT có nghiệm đúng với mọi x !!");
                        } else tvKq.setText("PT vô nghiệm!");

                    }else {
                        tvKq.setText("PT có nghiệm duy nhất là: "+ x);
                    }

                } else {
                    tvKq.setText("Invalid input !!");
                }
                break;
                default:
                    break;
        }
    }
}
