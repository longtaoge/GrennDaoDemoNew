package org.xiangbalao.grenndao;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.xiangbalao.common.dialog.DialogBuilder;
import org.xiangbalao.common.dialog.LoadingDialog;
import org.xiangbalao.common.grenndaodemo.R;
import org.xiangbalao.common.weight.EditTextHintIcon;

/**
 * Created by longtaoge on 2017/12/15.
 */

public class TestFragment extends Fragment implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private LoadingDialog mLoadingDialog;

  private EditTextHintIcon editTextHintIcon;



    protected void initView(View view) {



        bt1 = (Button) view.findViewById(R.id.bt_1);
        bt1.setOnClickListener(this);
        bt2 = (Button) view.findViewById(R.id.bt_2);
        bt2.setOnClickListener(this);
        bt3 = (Button) view.findViewById(R.id.bt_3);
        bt3.setOnClickListener(this);
        bt4 = (Button) view.findViewById(R.id.bt_4);
        bt4.setOnClickListener(this);
        bt5 = (Button) view.findViewById(R.id.bt_5);
        bt5.setOnClickListener(this);


        editTextHintIcon = view.findViewById(R.id.ei_test);

        editTextHintIcon.setHingIcon(getResources().getDrawable(R.mipmap.ic_launcher));
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_1:
                final DialogBuilder mDialog = DialogBuilder
                        .getInstance(getActivity())
                        .withTitle("提示")
                        .withbuton("取消", "确定")
                        .withMsg("确定要结算吗？");
                mDialog.withButton1Onclick(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDialog.dismiss();
                    }
                }).withButton2Onclick(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mDialog.dismiss();

                    }
                }).show();


                break;
            case R.id.bt_2:

                //insertTestDb();

                break;
            case R.id.bt_3:

                mLoadingDialog = new LoadingDialog(getActivity());
                mLoadingDialog.setOwnerActivity(getActivity());
                mLoadingDialog.setCanceledOnTouchOutside(false);
                mLoadingDialog.show();
              //  mLoadingDialog.dismiss();
                break;
            case R.id.bt_4:


                break;
            case R.id.bt_5:

                break;
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View view = inflater.inflate(R.layout.db_test, container, false);
         initView(view);
        return view;
    }
}
