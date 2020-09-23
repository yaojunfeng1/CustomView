package com.yao.customview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.yao.customview.R;
import com.yao.customview.utils.StringUtils;

import java.util.List;

/**
 * @describe: 自定义进度view
 * @author: yjf
 * @createTime: 2020/9/22 11:30
 * @className: ProcessTipView
 */
public class ProcessTipView extends RelativeLayout {

    private Context mContext;

    private View mProcessView1;
    private TextView mSelectTipView1;
    private TextView mTextViewTip1;

    private View mProcessView2;
    private TextView mSelectTipView2;
    private TextView mTextViewTip2;

    private View mProcessView3;
    private TextView mSelectTipView3;
    private TextView mTextViewTip3;

    private View mProcessView4;
    private TextView mSelectTipView4;
    private TextView mTextViewTip4;

    public ProcessTipView(Context context) {
        this(context, null, 0);
    }

    public ProcessTipView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProcessTipView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView(context, attrs);
    }

    //初始化
    private void initView(Context context, AttributeSet attrs) {
        this.mContext = context;
        LayoutInflater.from(mContext).inflate(R.layout.view_process_tip, this);

        mProcessView1 = findViewById(R.id.process_view1);
        mSelectTipView1 = findViewById(R.id.select_tip1_view);
        mTextViewTip1 = (TextView) findViewById(R.id.sdk_text1_view);

        mProcessView2 = findViewById(R.id.process_view2);
        mSelectTipView2 =  findViewById(R.id.select_tip2_view);
        mTextViewTip2 = (TextView) findViewById(R.id.sdk_text2_view);

        mProcessView3 = findViewById(R.id.process_view3);
        mSelectTipView3 = findViewById(R.id.select_tip3_view);
        mTextViewTip3 = (TextView) findViewById(R.id.sdk_text3_view);

        mProcessView4 = findViewById(R.id.process_view4);
        mSelectTipView4 = findViewById(R.id.select_tip4_view);
        mTextViewTip4 = (TextView) findViewById(R.id.sdk_text4_view);
    }

    public void setData(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                if (list.size() == 4) {
                    mTextViewTip1.setText(StringUtils.getNotNullString(list.get(0)));
                    mTextViewTip2.setText(StringUtils.getNotNullString(list.get(1)));
                    mTextViewTip3.setText(StringUtils.getNotNullString(list.get(2)));
                    mTextViewTip4.setText(StringUtils.getNotNullString(list.get(3)));
                } else if (list.size() == 3) {
                    mProcessView3.setVisibility(GONE);
                    mTextViewTip1.setText(StringUtils.getNotNullString(list.get(0)));
                    mTextViewTip2.setText(StringUtils.getNotNullString(list.get(1)));
                    mTextViewTip4.setText(StringUtils.getNotNullString(list.get(2)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setProcess1() {
        findViewById(R.id.line1_1_view).setBackgroundResource(R.color.btn_red);
        mSelectTipView1.setBackgroundResource(R.drawable.icon_cb_defalse);
        mSelectTipView1.setTextColor(getResources().getColor(R.color.white));

    }

    public void setProcess2() {
        findViewById(R.id.line1_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line1_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line2_1_view).setBackgroundResource(R.color.btn_red);
        mSelectTipView1.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView2.setBackgroundResource(R.drawable.icon_cb_defalse);
        mSelectTipView2.setTextColor(getResources().getColor(R.color.white));
        mSelectTipView1.setText("");
    }

    public void setProcess3() {
        findViewById(R.id.line1_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line1_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line2_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line2_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line3_1_view).setBackgroundResource(R.color.btn_red);
        mSelectTipView1.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView2.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView3.setBackgroundResource(R.drawable.icon_cb_defalse);
        mSelectTipView3.setTextColor(getResources().getColor(R.color.white));
        mSelectTipView1.setText("");
        mSelectTipView2.setText("");
    }

    public void setProcess4() {
        findViewById(R.id.line1_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line1_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line2_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line2_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line3_1_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line3_2_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line4_view).setBackgroundResource(R.color.btn_red);
        findViewById(R.id.line4_2_view).setBackgroundResource(R.color.btn_red);
        mSelectTipView1.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView2.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView3.setBackgroundResource(R.drawable.ico_cb_true);
        mSelectTipView4.setBackgroundResource(R.drawable.icon_cb_defalse);
        mSelectTipView4.setTextColor(getResources().getColor(R.color.white));
        mSelectTipView1.setText("");
        mSelectTipView2.setText("");
        mSelectTipView3.setText("");
    }
}