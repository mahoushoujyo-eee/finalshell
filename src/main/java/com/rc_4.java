package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class rc_4 implements ActionListener {
   final com.Fm_2 M;

   rc_4(com.Fm_2 var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = uE.o();
      com.aO var10000 = this.M.I;
      if (var2) {
         if (this.M.I.B()) {
            this.M.I.l();
            this.M.P.Y();
            if (var2) {
               return;
            }
         }

         var10000 = this.M.I;
      }

      var10000.G();
      this.M.U.repaint();
   }
}





