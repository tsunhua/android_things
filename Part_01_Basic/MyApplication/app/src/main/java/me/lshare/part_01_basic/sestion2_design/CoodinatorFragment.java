package me.lshare.part_01_basic.sestion2_design;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.lshare.part_01_basic.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoodinatorFragment extends Fragment {

  private Toolbar toolbar;

  public CoodinatorFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View rootView = inflater.inflate(R.layout.fragment_coodinator, container, false);
    toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
    return rootView;
  }

  @Override public void onResume() {
    super.onResume();
    AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
    appCompatActivity.setSupportActionBar(toolbar);
    toolbar.setTitle("Title");
  }
}
