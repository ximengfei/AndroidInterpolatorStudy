package com.mengfei.androidinterpolatorstudy;

import android.view.animation.Interpolator;

/**
 * Created by xmf on 2017/9/19.
 * 差值器效果预览网站:
 * http://inloop.github.io/interpolator/
 */

public class SpringInterpolator implements Interpolator {
    @Override
    public float getInterpolation(float x) {
        double factor = 0.4;
        return (float) (Math.pow(2, -10 * x) * Math.sin((x - factor / 4) * (2 * Math.PI) / factor) + 1);
    }

}
