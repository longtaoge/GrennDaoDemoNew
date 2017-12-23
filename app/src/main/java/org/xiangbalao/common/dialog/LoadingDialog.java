package org.xiangbalao.common.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

import org.xiangbalao.common.grenndaodemo.R;


public class LoadingDialog extends ProgressDialog {
    public LoadingDialog(Context context) {
        super(context);
    }

    public LoadingDialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_loading);
        getWindow().setBackgroundDrawableResource(R.color.transparent);

    }

}
