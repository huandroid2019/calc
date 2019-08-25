package com.example.calcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView tv_last_ops;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ed_input);
        tv_last_ops = findViewById(R.id.tv_last_operation);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_CE:
                tv_last_ops.setText("");
                break;
            case R.id.btn_C:
                break;
            case R.id.btn_del:
                break;
            case R.id.btn_0:
                addToInput("0");
                break;
            case R.id.btn_1:
                break;
            case R.id.btn_2:
                break;
            case R.id.btn_3:
                break;
            case R.id.btn_4:
                break;
            case R.id.btn_5:
                break;
            case R.id.btn_6:
                break;
            case R.id.btn_7:
                break;
            case R.id.btn_8:
                break;
            case R.id.btn_9:
                break;

            case R.id.btn_dot:
                break;
            case R.id.btn_equal:
                //здесь и ниже в tv_last_ops
                // просто показываем последнюю операцию
                tv_last_ops.setText("=");
                break;
            case R.id.btn_plus:
                tv_last_ops.setText("+");
                break;
            case R.id.btn_minus:
                tv_last_ops.setText("-");
                break;
            case R.id.btn_plus_minus:
                break;
            case R.id.btn_mult:
                tv_last_ops.setText("×");
                break;
            case R.id.btn_division:
                tv_last_ops.setText("÷");
                break;
        }
    }

    /**
     * данный метод помещает строку в поле ввода (EditTExt)
     * @param s
     */
    void setToInput(String s){
        editText.setText(s);
    }

    /***
     * добавляет строку s содержимому в поле ввода
     * @param s
     */
    void addToInput(String s){
        editText.getText().append(s);
    }

    /**
     * возвращает содержимое из поля ввода
     *
     * @return
     */
    String getInput(){
        return editText.getText().toString();
    }
}
