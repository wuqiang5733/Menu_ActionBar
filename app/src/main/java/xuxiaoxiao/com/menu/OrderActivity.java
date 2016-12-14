package xuxiaoxiao.com.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mac on 2016/12/14.
 */

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
//        下面这两行是给这个Activity加返回键的，但是是加上之后就会报错。
//        ActionBar actionBar = getActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
