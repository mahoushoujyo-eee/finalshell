package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CU implements ActionListener {
   final com.Fg_2 Z;

   CU(com.Fg_2 var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = com.kz_4.M();
      this.Z.f.X += 0.1F;
      String var2 = var10000;
      com.k0_2 var3 = this.Z.f;
      if (var2 != null) {
         if (this.Z.f.X < 1.0F) {
            this.Z.f.repaint();
            if (var2 != null) {
               return;
            }
         }

         this.Z.f.X = 1.0F;
         this.Z.f.repaint();
         var3 = this.Z.f;
      }

      var3.v.Y();
   }
}





