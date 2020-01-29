package com.mike.viewpager2sample.transformation;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class FadeOutTransformation implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        page.setTranslationX(-position*page.getWidth());

        page.setAlpha(1-Math.abs(position));
    }
}
