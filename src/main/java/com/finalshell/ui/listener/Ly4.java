package com.finalshell.ui.listener;

import com.finalshell.core.IL3;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ly4 implements ChangeListener {
   final IL3 b;
   final SetBackgroundImagePanel F;

   Ly4(SetBackgroundImagePanel var1, IL3 var2) {
      this.F = var1;
      this.b = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      SetBackgroundImagePanel.y(this.F).removeChangeListener(this);
      SetBackgroundImagePanel.T(this.F).q(this.b);
   }
}





