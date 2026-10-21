package com.C;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class i_2 extends MouseAdapter {
   final com.C.y_2 O;

   i_2(com.C.y_2 var1) {
      this.O = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.O.I(true);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.O.I(false);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.O.P(this.O.K.contains(var1.getPoint()));
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.O.P(this.O.K.contains(var1.getPoint()));
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.O.P(false);
   }
}





