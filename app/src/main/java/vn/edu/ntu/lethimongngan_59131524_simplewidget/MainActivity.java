package vn.edu.ntu.lethimongngan_59131524_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtTen, edtNgaysinh, edtSothich;
    RadioGroup rdg;
    RadioButton radioButton;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();

    }
    private void addView()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaysinh = findViewById(R.id.edtNgaysinh);
        rdg = findViewById(R.id.rdg);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        edtSothich = findViewById(R.id.edtSothich);
        btXacnhan = findViewById(R.id.btXacnhan);
    }
    private void addEvents()
    {

        btXacnhan.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        String s = "";
        if (cb1.isChecked())
        {
            s += "Xem phim;";
        }
        if (cb2.isChecked())
        {
            s += "Nghe nhạc;";
        }
        if (cb3.isChecked())
        {
            s += "Đi cafe với bạn bè;";
        }
        if (cb4.isChecked())
        {
            s += "Ở nhà một mình;";
        }
        if (cb5.isChecked())
        {
            s += "Vào bếp nấu ăn;";
        }

        Toast.makeText(this, "Tên: " + edtTen.getText().toString() + "\n" +
            "Ngày sinh: " + edtNgaysinh.getText().toString() + "\n" +
            "Giới tính: " + radioButton.getText().toString() + "\n" +
            "Sở thích: " + s + edtSothich.getText().toString(),
                    LENGTH_SHORT).show();

    }


    public void checkButton(View v)
    {
        int radioId = rdg.getCheckedRadioButtonId();
        radioButton= findViewById(radioId);
    }
}
