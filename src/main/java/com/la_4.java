package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class la_4 implements ActionListener {
   final com.Tb_2 h;

   la_4(com.Tb_2 var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = com.T4.O();
      com.Tb_2 var10000 = this.h;
      if (var2 == 0) {
         if (this.h.d < this.h.f) {
            this.h.d = this.h.d + this.h.I;
            this.h.Y.revalidate();
            if (var2 == 0) {
               return;
            }
         }

         this.h.d = this.h.f;
         var10000 = this.h;
      }

      var10000.U.Y();
   }
}





