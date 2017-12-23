package org.xiangbalao.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.xiangbalao.common.grenndaodemo.R;


/**
 * Created by longtaoge on 2017/12/15.
 */

public class DialogBuilder extends Dialog {


    //实例
    private static DialogBuilder instance;
    //上下文
    private static Context tempContext;
    //对话框根view
    private View mDialogView;
    /**
     * 标题
     */
    private TextView dialogTitle;
    //确定按钮
    private TextView button1;
    //取消按钮
    private TextView button2;
    //信息
    private TextView msg;
    //最外层
    private RelativeLayout main_RelativeLayout;

    private boolean cancelableOnTouchOutside;

    protected DialogBuilder(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    private DialogBuilder(Context context) {
        super(context);
        init(context);
    }


    private DialogBuilder(Context context, int theme) {
        super(context, theme);
        init(context);
    }

    public static DialogBuilder getInstance(Context context) {

        if (tempContext != null || !(context.equals(tempContext))) {

            synchronized (DialogBuilder.class) {
                instance = new DialogBuilder(context, R.style.widget_dialogbuilder_dialog_untran);

            }
        }
        tempContext = context;

        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(params);
    }

    private void init(Context context) {

        mDialogView = View.inflate(context, R.layout.widget_dialog_common, null);

        dialogTitle = (TextView) mDialogView.findViewById(R.id.tv_title);

        button1 = (TextView) mDialogView.findViewById(R.id.cancel_textView);
        button2 = (TextView) mDialogView.findViewById(R.id.confirm_textView);
        msg = (TextView) mDialogView.findViewById(R.id.tv_msg);
        main_RelativeLayout = (RelativeLayout) mDialogView.findViewById(R.id.rl_main_RelativeLayout);

        main_RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cancelableOnTouchOutside) {
                    dismiss();
                }


            }
        });

        setContentView(mDialogView);
    }

    /**
     * 点击外部取消
     *
     * @param cancelableOnTouchOutside
     * @return
     */
    public DialogBuilder withCancelableOnTouchOutside(boolean cancelableOnTouchOutside) {

        this.cancelableOnTouchOutside = cancelableOnTouchOutside;
        return this;
    }


    /**
     * 设置标题
     *
     * @param title
     * @return
     */
    public DialogBuilder withTitle(String title) {
        dialogTitle.setText(title);

        return this;
    }


    public DialogBuilder withbuton(String buton1, String buton2) {
        button1.setText(buton1);
        button2.setText(buton2);
        return this;
    }

    public DialogBuilder hideButon1() {
        button1.setVisibility(View.GONE);
        return this;
    }

    public DialogBuilder hideButon2() {
        button2.setVisibility(View.GONE);
        return this;
    }


    /**
     * 设置信息
     *
     * @param msg
     * @return
     */
    public DialogBuilder withMsg(String msg) {
        this.msg.setText(msg);
        return this;
    }

    /**
     * 设置确定按钮
     *
     * @param listener
     * @return
     */

    public DialogBuilder withButton1Onclick(View.OnClickListener listener) {

        if (button1 != null)
            button1.setOnClickListener(listener);

        return this;

    }


    /**
     * 设置确定按钮
     *
     * @param listener
     * @return
     */

    public DialogBuilder withButton1Onclick(String title, View.OnClickListener listener) {

        if (button1 != null) {
            if (!TextUtils.isEmpty(title)) {
                button1.setText(title);
            }
            if (listener == null) {

                button1.setVisibility(View.GONE);
            } else {
                button1.setOnClickListener(listener);
            }
        }

        return this;

    }


    public DialogBuilder withButton2Onclick(View.OnClickListener listener) {

        if (button2 != null) {
            button2.setOnClickListener(listener);
            if (listener == null) {
                button2.setVisibility(View.GONE);
            }
        }
        return this;

    }

    @Override
    public void dismiss() {
        super.dismiss();
        //去除引用
        tempContext = null;


    }
}
