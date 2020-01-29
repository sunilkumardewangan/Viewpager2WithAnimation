package com.mike.viewpager2sample.transformation;

import android.view.View;
import android.widget.TextView;

import com.mike.viewpager2sample.R;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class SlowTransformation implements ViewPager2.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {

        TextView title = page.findViewById(R.id.tvTitle);
        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0);

        } else if (position <= 1) { // [-1,1]

            title.setTranslationX(-position * 0.5f * page.getWidth());
//            word.setTranslationX(-position * 1.0f * page.getWidth());
//            github.setTranslationX(-position * 2.0f * page.getWidth());
//            code.setTranslationX(-position * 2.5f * page.getWidth());
//            // The 0.5, 1.0, 2.0, 2.5 values you see here are what makes the view move in a different speed.
//            // The bigger the number, the faster the view will translate.
//            // The result float is preceded by a minus because the views travel in the opposite direction of the movement.

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0);
        }
    }
}
