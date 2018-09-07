package com.an.viewpagerexample2.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.an.viewpagerexample2.R;
import com.an.viewpagerexample2.dto.BeanNews;

public class PagerFragment extends Fragment {

    //constants
    private static final String TAG = PagerFragment.class.getSimpleName();
    private static final String ARG_PARAM_1 = "news_item";

    // UI Components
    private TextView mTvNewsIdAndTitle, mTvNewsDateTime, mTvNewsDescription;

    // Other objects
    private Activity mActivity;
    private BeanNews mNews;

    public static PagerFragment newInstance(BeanNews newsObject) {
        PagerFragment fragment = new PagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_PARAM_1, newsObject);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mActivity = getActivity();
        Log.d(TAG, "OnCreateView -> PagerFragment loads");

        return inflater.inflate(R.layout.fragment_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTvNewsIdAndTitle = view.findViewById(R.id.fragment_pager_tv_news_id_and_title);
        mTvNewsDateTime = view.findViewById(R.id.fragment_pager_tv_news_date_time);
        mTvNewsDescription = view.findViewById(R.id.fragment_pager_tv_news_description);

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume() on fragment: PagerFragment");

        if (getArguments() != null) {
            mNews = (BeanNews) getArguments().getSerializable(ARG_PARAM_1);
        }

        if (mNews != null) {
            mTvNewsIdAndTitle.setText("News ID: " + mNews.getNewsId() + " | Title: " + mNews.getNewsTitle());
            mTvNewsDateTime.setText(mNews.getNewsDateTime());
            mTvNewsDescription.setText(mNews.getNewsDescription());
        }
    }
}