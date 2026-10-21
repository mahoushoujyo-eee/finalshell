package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FB implements ActionListener {
   final com.Tb_2 e;

   FB(com.Tb_2 var1) {
      this.e = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = com.T4.O();
      com.Tb_2 var10000 = this.e;
      if (var2 == 0) {
         if (this.e.d > 0) {
            this.e.d = this.e.d - this.e.I;
            this.e.Y.revalidate();
            if (var2 == 0) {
               return;
            }
         }

         this.e.d = 0;
         var10000 = this.e;
      }

      var10000.U.Y();
   }
}





