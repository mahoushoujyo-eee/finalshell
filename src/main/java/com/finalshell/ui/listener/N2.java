package com.finalshell.ui.listener;

import com.finalshell.core.C_4;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class N2 implements PopupMenuListener {
   final C_4 q;

   N2(C_4 var1) {
      this.q = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.G);
      C_4.O(this.q).repaint();
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.r);
      C_4.C(this.q).repaint();
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.r);
   }
}





