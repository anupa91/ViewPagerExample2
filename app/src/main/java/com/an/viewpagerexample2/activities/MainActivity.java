package com.an.viewpagerexample2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.an.viewpagerexample2.R;
import com.an.viewpagerexample2.adapters.ViewPagerAdapter;
import com.an.viewpagerexample2.custom.VerticalViewPager;
import com.an.viewpagerexample2.dto.BeanNews;
import com.an.viewpagerexample2.fragments.PagerFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Constants
    private static final String TAG = MainActivity.class.getSimpleName();

    // UI Components
    private VerticalViewPager mVvpMainPager;

    // Other objects
    private ViewPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mVvpMainPager = findViewById(R.id.activity_main_vvp_main_pager);

        setupViewPager();
    }

    private void setupViewPager() {
        mPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        for (BeanNews news : generateSampleNewsData()) {
            mPagerAdapter.addFragment(PagerFragment.newInstance(news), "News " + news.getNewsId());
        }
        mVvpMainPager.setAdapter(mPagerAdapter);
        mVvpMainPager.setOffscreenPageLimit(generateSampleNewsData().size());
    }

    private ArrayList<BeanNews> generateSampleNewsData() {

        /*
         * Sample JSON format
         *
         * [
         *   {
         *       "newsId":1,
         *       "newsTitle":"Title 1",
         *       "newsDateTime":"08/Sep/2018 | 1:40 AM",
         *       "newsDescription":"News Description 1"
         *   },
         *   {
         *       "newsId":2,
         *       "newsTitle":"Title 2",
         *       "newsDateTime":"08/Sep/2018 | 1:45 AM",
         *       "newsDescription":"News Description 2"
         *   },
         *   {
         *       "newsId":3,
         *       "newsTitle":"Title 3",
         *       "newsDateTime":"08/Sep/2018 | 1:50 AM",
         *       "newsDescription":"News Description 3"
         *   }
         * ]
         *
         * */

        BeanNews news1 = new BeanNews(1, "Title 1", "08/Sep/2018 | 1:40 AM", "News Description 1");
        BeanNews news2 = new BeanNews(2, "Title 2", "08/Sep/2018 | 1:45 AM", "News Description 2");
        BeanNews news3 = new BeanNews(3, "Title 3", "08/Sep/2018 | 1:50 AM", "News Description 3");
        BeanNews news4 = new BeanNews(4, "Title 4", "08/Sep/2018 | 1:55 AM", "News Description 4");
        BeanNews news5 = new BeanNews(5, "Title 5", "08/Sep/2018 | 2:00 AM", "News Description 5");
        BeanNews news6 = new BeanNews(6, "Title 6", "08/Sep/2018 | 2:05 AM", "News Description 6");
        BeanNews news7 = new BeanNews(7, "Title 7", "08/Sep/2018 | 2:10 AM", "News Description 7");

        ArrayList<BeanNews> newsList = new ArrayList<>();
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);

        return newsList;
    }
}