package com;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class cr_4 implements PopupMenuListener {
   final com.Qe_2 R;
   final com.kz_4 m;

   cr_4(com.kz_4 var1, com.Qe_2 var2) {
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





