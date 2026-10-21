package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class c6_2 extends MouseAdapter {
   final com.Cn_2 G;
   final wH_3 O;
   final _y_2 e;
   final xW_3 m;

   c6_2(xW_3 var1, com.Cn_2 var2, wH_3 var3, _y_2 var4) {
      this.m = var1;
      this.G = var2;
      this.O = var3;
      this.e = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.m.M(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.O.i(this.e);
      this.m.M(var1);
   }
}





