package edward.com.animation.effects;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import edward.com.animation.impl.Effect4View;

/**
 * Created by Edward on 2015/2/1.
 */
public class StandUp implements Effect4View {
    @Override
    public Animator[] getAnimators(View target) {
        float x = (target.getWidth() - target.getPaddingLeft() - target.getPaddingRight())/2
                + target.getPaddingLeft();
        float y = target.getHeight() - target.getPaddingBottom();
        return new Animator[]{
            ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x),
                    ObjectAnimator.ofFloat(target,"pivotY",y,y,y,y,y),
                    ObjectAnimator.ofFloat(target,"rotationX",55,-30,15,-15,0)
        };
    }

    @Override
    public void reset(View target) {
        target.setRotationX(0);
        target.setPivotX(target.getMeasuredWidth() / 2.0f);
        target.setPivotY(target.getMeasuredHeight() / 2.0f);
    }
}
