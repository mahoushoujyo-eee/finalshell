package com.L;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class N implements PopupMenuListener {
   final com.L.c q;

   N(com.L.c var1) {
      this.q = var1;
   }

   @Override
   public void popupMenuWillBecomeVisible(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.G);
      com.L.c.O(this.q).repaint();
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.r);
      com.L.c.C(this.q).repaint();
   }

   @Override
   public void popupMenuCanceled(PopupMenuEvent var1) {
      this.q.Z.S.setIcon(this.q.Z.r);
   }
}





