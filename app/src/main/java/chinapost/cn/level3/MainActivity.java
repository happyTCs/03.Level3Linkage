package chinapost.cn.level3;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import chinapost.cn.level3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding mBinding;
    private CityPicker cityPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        cityPicker = (CityPicker) findViewById(R.id.citypicker);
        initVarias();
    }

    private void initVarias() {
//        findViewById(R.id.butn_site).setOnClickListener(this);
        mBinding.butnSite.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.butn_site:
                Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
//                //启动地址选择弹窗
//                showAddress();

                break;
        }
    }

    /**
     * 显示寄达地区
     */
    private void showAddress() {
    }

    /**
     * 关闭输入法
     */
    private void closeInputMethod() {
        // 关闭输入法
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        try {
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
