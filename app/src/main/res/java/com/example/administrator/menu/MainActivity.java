package com.example.administrator.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }
    //创建选项菜单

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        menu.add(0,1,0,R.string.m3);

        /*menu.add(0,1,0,R.string.m1);
        menu.add(0,2,0,R.string.m2);
        menu.add(0,1,0,R.string.m3);*/
        return super.onCreateOptionsMenu(menu);
    }
    //选项菜单被选中

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        /*switch (item.getItemId()){
            case 1:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(this,"test",Toast.LENGTH_LONG).show();
                break;
        }*/
        return super.onOptionsItemSelected(item);
    }
    //创建上下文菜单

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        menu.add(0,1,0,R.string.m3);
    }
    //上下文菜单被选中


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}
