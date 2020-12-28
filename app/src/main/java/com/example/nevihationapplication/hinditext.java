package com.example.nevihationapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class hinditext extends androidx.appcompat.widget.AppCompatTextView {
    public hinditext(Context context) {
        super(context);
        initTypeface(context);
    }

    public hinditext(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTypeface(context);
    }

    public hinditext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeface(context);
    }
    private  void initTypeface(Context context)
    {
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"Kruti Dev 714 Normal.ttf");
        this.setTypeface(typeface);
    }

}
