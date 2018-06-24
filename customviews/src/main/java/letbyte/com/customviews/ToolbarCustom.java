package letbyte.com.customviews;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;

public class ToolbarCustom extends Toolbar {

    private View mRootView;

    public ToolbarCustom(Context context) {
        super(context);
        init(context);
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ToolbarCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mRootView = inflate(context, R.layout.toolbar, this);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }
}
