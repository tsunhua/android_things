package me.lshare.part_01_basic.session1_ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import me.lshare.part_01_basic.R;

/**
 * UI体系部分
 */
public class UIFragment extends Fragment {

  public UIFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    FrameLayout frameLayout =
        (FrameLayout) inflater.inflate(R.layout.fragment_ui, container, false);
    initChildViews(frameLayout);
    return frameLayout;
  }

  private void initChildViews(FrameLayout parentView) {
    RecyclerView recyclerView = new RecyclerView(getContext());
    recyclerView.setLayoutManager(
        new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
    TextView textView = new TextView(getContext());
    textView.setText("fuck");
    recyclerView.addView(textView);
    parentView.addView(recyclerView);
  }
}
