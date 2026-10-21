package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class QA implements PopupMenuListener {
   public final Kz4 r;

   public QA(Kz4 var1) {
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





