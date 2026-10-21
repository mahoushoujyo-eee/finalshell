package com.finalshell.ui.listener;

import com.finalshell.core.Qe2_2;
import com.finalshell.ui.panel.Kz4;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Cr4 implements PopupMenuListener {
   public final Qe2_2 R;
   public final Kz4 m;

   public Cr4(Kz4 var1, Qe2_2 var2) {
      this.m = var1;
      this.R = var2;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      this.R.setSelected(false);
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      this.R.setSelected(false);
   }
}





