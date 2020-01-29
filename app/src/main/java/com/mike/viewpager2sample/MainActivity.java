package com.mike.viewpager2sample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.mike.viewpager2sample.adapter.ViewPagerAdapter;
import com.mike.viewpager2sample.transformation.AntiClockSpinTransformation;
import com.mike.viewpager2sample.transformation.Clock_SpinTransformation;
import com.mike.viewpager2sample.transformation.CubeInDepthTransformation;
import com.mike.viewpager2sample.transformation.CubeInScalingTransformation;
import com.mike.viewpager2sample.transformation.CubeOutDepthTransformation;
import com.mike.viewpager2sample.transformation.CubeOutRotationTransformation;
import com.mike.viewpager2sample.transformation.CubeOutScalingTransformation;
import com.mike.viewpager2sample.transformation.DepthTranfrom;
import com.mike.viewpager2sample.transformation.FadeOutTransformation;
import com.mike.viewpager2sample.transformation.FanTransformation;
import com.mike.viewpager2sample.transformation.FidgetSpinTransformation;
import com.mike.viewpager2sample.transformation.GateTransformation;
import com.mike.viewpager2sample.transformation.HingeTransformation;
import com.mike.viewpager2sample.transformation.HorizontalFlipTransformation;
import com.mike.viewpager2sample.transformation.PopTransformation;
import com.mike.viewpager2sample.transformation.SimpleTransformation;
import com.mike.viewpager2sample.transformation.SlowTransformation;
import com.mike.viewpager2sample.transformation.SpinnerTransformation;
import com.mike.viewpager2sample.transformation.TossTransformation;
import com.mike.viewpager2sample.transformation.VerticalFlipTransformation;
import com.mike.viewpager2sample.transformation.VerticalShutTransformation;
import com.mike.viewpager2sample.transformation.ZoomOutTransformation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    ViewPager2.OnPageChangeCallback onPageChangeCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPager2);
        List<String> list = new ArrayList<>();
        list.add("First Screen");
        list.add("Second Screen");

        list.add("Third Screen");



        list.add("Fourth Screen");

        //set adapter in viewpager2
        viewPager2.setAdapter(new ViewPagerAdapter(this, list, viewPager2));

        //set onPageChangeCallback
        onPageChangeCallback = new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);

                System.out.println("viewPager onPageSelected at position "+position+"  positionoffset "+positionOffset+"    "+positionOffsetPixels);

            }
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                System.out.println("viewPager onPageSelected at "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                System.out.println("viewPager onPageScrollStateChanged at "+state);
            }
        };

        //register onPageChangeCallback
        viewPager2.registerOnPageChangeCallback(onPageChangeCallback);

        MarginPageTransformer marginPageTransformer = new MarginPageTransformer(50);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.simple:
                viewPager2.setPageTransformer(new SimpleTransformation());
                break;
            case R.id.depth_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new DepthTranfrom());
                break;
            case R.id.zoomout_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new ZoomOutTransformation());
                break;
            case R.id.clockspin_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new Clock_SpinTransformation());
                break;
            case R.id.anticlockspin_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new AntiClockSpinTransformation());
                break;
            case R.id.fidgetspin_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new FidgetSpinTransformation());
                break;

            case R.id.vertical_flip_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new VerticalFlipTransformation());
                break;

            case R.id.horizontal_flip_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new HorizontalFlipTransformation());
                break;

            case R.id.pop_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new PopTransformation());
                break;

            case R.id.fade_out_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new FadeOutTransformation());
                break;

            case R.id.cube_out_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new CubeOutDepthTransformation());
                break;

            case R.id.cube_in_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new CubeInDepthTransformation());
                break;

            case R.id.cube_out_scaling_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new CubeOutScalingTransformation());
                break;

            case R.id.cube_in_scaling_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new CubeInScalingTransformation());
                break;

            case R.id.cube_out_depth_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new CubeOutRotationTransformation());
                break;

            case R.id.cube_in_depth_transformation:
                viewPager2.setPageTransformer(new CubeInDepthTransformation());
                break;

            case R.id.hing_scaling_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new HingeTransformation());
                break;


            case R.id.gate_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new GateTransformation());
                break;

            case R.id.toss_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new TossTransformation());
                break;

            case R.id.fan_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new FanTransformation());
                break;

            case R.id.spinner_transformation:
                viewPager2.setPageTransformer(new SpinnerTransformation());
                break;

            case R.id.vertical_shut_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new VerticalShutTransformation());
                break;

            case R.id.slow_motion_transformation:
                viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
                viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
                viewPager2.setPageTransformer(new SlowTransformation());
                break;


        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //unregister onPageChangeCallback
        viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
    }
}
