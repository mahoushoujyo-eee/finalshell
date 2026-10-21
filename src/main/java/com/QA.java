package com;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class QA implements PopupMenuListener {
   final com.kz_4 r;

   QA(com.kz_4 var1) {
      this.r = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      this.r.W.setSelected(false);
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      this.r.W.setSelected(false);
   }
}





