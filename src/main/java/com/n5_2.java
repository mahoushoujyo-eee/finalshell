package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class n5_2 implements ActionListener {
   final com.k0_2 n;

   n5_2(com.k0_2 var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = com.kz_4.M();
      this.n.X -= 0.1F;
      String var2 = var10000;
      com.k0_2 var3 = this.n;
      if (var2 != null) {
         if (this.n.X > 0.0F) {
            this.n.repaint();
            if (var2 != null) {
               return;
            }
         }

         this.n.g();
         var3 = this.n;
      }

      var3.v.Y();
   }
}





