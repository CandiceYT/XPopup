package com.lxj.xpopup.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.lxj.xpopup.R;
import com.lxj.xpopup.core.CenterPopupView;

/**
 * Description: 加载对话框
 * Create by dance, at 2018/12/16
 */
public class LoadingPopupView extends CenterPopupView {
    private TextView tv_title;
    public LoadingPopupView(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return bindLayoutId != 0 ? bindLayoutId : R.layout._xpopup_center_impl_loading;
    }

    public LoadingPopupView bindLayout(int layoutId){
        bindLayoutId = layoutId;
        return this;
    }

    @Override
    protected void initPopupContent() {
        super.initPopupContent();
        tv_title = findViewById(R.id.tv_title);
        if(title!=null && tv_title!=null){
            tv_title.setVisibility(VISIBLE);
            tv_title.setText(title);
        }
    }

    private String title;
    public LoadingPopupView setTitle(String title){
        this.title = title;
        return this;
    }
}
