package letbyte.com.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;

public class ToolbarCustom extends Toolbar {

    private View mRootView;

    public ToolbarCustom(Context context) {
        super(context);
        init(context, null);
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attributeSet) {
        mRootView = inflate(context, R.layout.toolbar, this);

        if(attributeSet != null) {

            TypedArray ta = null;
            try {
                //read xml attributes
                ta = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ToolbarCustom,
                        0, 0);
                if (ta != null) {
                    String title = ta.getString(R.styleable.ToolbarCustom_custom_title);
                    setTitle(title);
                }
            } finally {
                if (ta != null) {
                    ta.recycle();
                }
            }
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }
}
