package me.lshare.part_01_basic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import me.lshare.part_01_basic.session1_ui.UIFragment;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    changeSession(new UIFragment());
  }

  /**
   * 切换不同的Session
   * @param fragment
   */
  private void changeSession(Fragment fragment) {
    getSupportFragmentManager().beginTransaction().add(R.id.layout_container, fragment).commit();
  }
}
