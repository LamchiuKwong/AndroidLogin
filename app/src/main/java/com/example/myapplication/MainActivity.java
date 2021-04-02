package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


          Button  login = (Button)findViewById(R.id.login_button);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String sname="";
                    EditText ename =(EditText)findViewById(R.id.name);
                    sname=ename.getText().toString();

                    String spassword="";
                    EditText epassword =(EditText)findViewById(R.id.password);
                    spassword=epassword.getText().toString();

                    if (sname.equals("jiang")&&spassword.equals("123"))
                    {
                        Toast.makeText(MainActivity.this,"欢迎你"+sname+"!,你的密码是："+spassword,Toast.LENGTH_LONG).show();



                        Uri uri = Uri.parse("https://www.bilibili.com/video/BV1GZ4y1A75G?spm_id_from=333.851.b_7265636f6d6d656e64.6");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                    }

                    else
                    {
                        Toast.makeText(MainActivity.this,"四月来临之际，刚拿到生活费，是不是感觉自己的钱没有花到地方？\n" +
                                " 我们特别推出《认识江林钊很幸运》活动！\n" +
                                "⭐ 即日起，发送短信“我想请江林钊喝奶茶”至15818932774就有99%！机会获得请江林钊喝奶茶的机会！" +
                                        "发红包至微信就有机会获得独享亲密备注机会一次，活动日期今日截止。"
                                ,Toast.LENGTH_LONG).show();
                       // Toast.makeText(MainActivity.this,"账号，密码不正确",Toast.LENGTH_LONG).show();

                    }

                }






            });
        }
}



