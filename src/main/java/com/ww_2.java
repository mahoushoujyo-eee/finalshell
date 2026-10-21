package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ww_2 implements ActionListener {
   final Xt_2 u;
   private static final long a;

   Ww_2(Xt_2 var1) {
      this.u = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = com.oY_3.y();
      int var10000 = Xt_2.M(this.u);
      if (var2) {
         if (var10000 > 0) {
            Xt_2.n(this.u, (int)a);
            if (var2) {
               return;
            }
         }

         Xt_2.i(this.u, 0);
      }

      Xt_2.K(this.u).Y();
      Xt_2.a(this.u);
      this.u.setVisible(false);
   }

   static {
      long var0 = 1488391915559922698L;
      long var10002 = -6479319485684438014L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





