package com.bruce.testbufferknife;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

import butterknife.Bind;
import cn.aigestudio.datepicker.cons.DPMode;
import cn.aigestudio.datepicker.views.DatePicker;

public class TestTimeActivity extends Activity {
    Dialog dialog;
    @Bind(R.id.DataPicker)
    DatePicker DataPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDialog();
    }

    /**
     * 初始化对话框
     */
    private void initDialog() {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_test_time);
        dialog.setTitle("选择日期");
        init(dialog);
        dialog.show();
//        dialog.dismiss();

    }

    private void init(final Dialog dialog) {
        DatePicker picker = (DatePicker) dialog.findViewById(R.id.DataPicker);
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);// 年
        final int month = a.get(Calendar.MONTH) + 1;//由于月份是从0开始的所以加1
        int day = a.get(Calendar.DATE);//日
        Log.w("year", "" + year);
        Log.w("month", "" + month);
        picker.setDate(year, month);
        picker.setMode(DPMode.SINGLE);
        picker.setOnDatePickedListener(new DatePicker.OnDatePickedListener() {
            @Override
            public void onDatePicked(String date) {
                Toast.makeText(TestTimeActivity.this, date, Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
    }
}
