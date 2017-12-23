package org.xiangbalao.common.weight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

import org.xiangbalao.common.grenndaodemo.R;

/**
 * Created by longtaoge on 2017/12/23.
 */

public class EditTextHintIcon  extends android.support.v7.widget.AppCompatEditText {
    private float hintImageSize = 0;
    private float hintTextSize = 0;
    private int hingTextColor = 0xFF000000;
    private Drawable mDrawable;
    private Paint paint;
    private String hintText;
    private Handler mHandler;

    public EditTextHintIcon(Context context) {
        super(context);
    }

    public EditTextHintIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        InitResource(context, attrs);
        InitPaint();
    }

    public EditTextHintIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitResource(context, attrs);
        InitPaint();
    }


    private void InitResource(Context context, AttributeSet attrs) {
        mHandler = new Handler();



        TypedArray androidArray = context.obtainStyledAttributes(attrs, new int[]{android.R.attr
                .hint});

         hintText = androidArray.getString(0);

         androidArray.recycle();

        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.edit_hint_img);

        float density = context.getResources().getDisplayMetrics().density;

        hintImageSize = mTypedArray.getDimension(R.styleable.edit_hint_img_imageSize, 18 * density + 0.5F);

        mDrawable = mTypedArray.getDrawable(R.styleable.edit_hint_img_hintImage);
        if (mDrawable != null)
            mDrawable.setBounds(0, 0, (int) hintImageSize, (int) hintImageSize);

        this.setHintText("");

        hingTextColor = mTypedArray.getColor(R.styleable.edit_hint_img_hintTextColor, 0xFF848484);
        hintTextSize = mTypedArray.getDimension(R.styleable.edit_hint_img_hintTextSize, 14 * density + 0.5F);
        mTypedArray.recycle();
    }

    private void InitPaint() {
        if (paint == null)
            paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(hingTextColor);
        paint.setTextSize(hintTextSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawSearchIcon(canvas);
    }

    private void DrawSearchIcon(Canvas canvas) {
        if (this.getText().toString().length() == 0) {
            float textWidth = paint.measureText(hintText);
            float textHeight = getFontLeading(paint);
            float dx = hintImageSize + textWidth + 8;
            float dy = (getHeight() - hintImageSize) / 2;
            canvas.save();
            canvas.translate(0, getScrollY() + dy);
            if (mDrawable != null) {
                mDrawable.draw(canvas);
            }
            canvas.drawText(hintText, getScrollX() + hintImageSize + 8, getScrollY() + (getHeight() - (getHeight() - textHeight) / 2) - paint.getFontMetrics().bottom - dy, paint);
            canvas.restore();
        }
    }

    public void setHintText(String hint) {
        this.hintText = hint;
        updateUI();
    }

    public void setHintTextSize(int hintSize) {
        this.hintTextSize = hintSize;
        InitPaint();
        updateUI();
    }

    public void setHingTextColor(int hintColor) {
        this.hingTextColor = hintColor;
        InitPaint();
        updateUI();
    }

    public void setHingIcon(Drawable hintIcon) {
        this.mDrawable = hintIcon;
        if (mDrawable != null)
            mDrawable.setBounds(0, 0, (int) hintImageSize, (int) hintImageSize);
        updateUI();
    }

    public void setHingIconSize(int hintIconSize) {
        this.hintImageSize = hintIconSize;
        updateUI();
    }

    private void updateUI() {

        mHandler.post(new Runnable() {
            @Override
            public void run() {

                invalidate();
            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
//        if (mDrawable == null) {
//            try {
//                mDrawable = getContext().getResources().getDrawable(R.drawable.search);
//                mDrawable.setBounds(0, 0, (int) hintImageSize, (int) hintImageSize);
//            } catch (Exception e) {
//
//            }
//        }
    }

    @Override
    protected void onDetachedFromWindow() {
        if (mDrawable != null) {
            mDrawable.setCallback(null);
            mDrawable = null;
        }
        super.onDetachedFromWindow();
    }

    public float getFontLeading(Paint paint) {
        Paint.FontMetrics fm = paint.getFontMetrics();
        return fm.bottom - fm.top;
    }
}
