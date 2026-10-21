package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cF_3 implements ActionListener {
   final II y;

   cF_3(II var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.Wb_2.m();
      II var10000 = this.y;
      if (var2 != null) {
         if (II.Z(this.y) < 1.0F) {
            II.k(this.y, 0.08F);
            II.T(this.y, Math.min(II.Z(this.y), 1.0F));
            this.y.repaint();
            if (var2 != null) {
               return;
            }
         }

         var10000 = this.y;
      }

      II.I(var10000).Y();
   }
}





