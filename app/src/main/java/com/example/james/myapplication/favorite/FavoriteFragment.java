package com.example.james.myapplication.favorite;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.james.myapplication.R;

public class FavoriteFragment extends Fragment{

    public FavoriteFragment()
    {
    }

    public static FavoriteFragment newInstance()
    {
        return new FavoriteFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        //container.removeAllViews();
        View v = inflater.inflate(R.layout.fragment_favorite, container, false);
        if (v != null)
        {
        }

        ListView mListView = (ListView) getActivity().findViewById(R.id.staticListView);
        mListView.setAdapter(null);

        return v;
    }

}
