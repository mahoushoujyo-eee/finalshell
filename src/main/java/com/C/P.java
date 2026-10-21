package com.C;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class P implements ActionListener {
   final com.C.y_2 Z;

   P(com.C.y_2 var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.C.W.B();
      com.C.y_2 var10000 = this.Z;
      if (var2 == null) {
         if (this.Z.D > 0.0F) {
            this.Z.D -= 0.1F;
            this.Z.p();
            if (var2 == null) {
               return;
            }
         }

         this.Z.D = 0.0F;
         var10000 = this.Z;
      }

      var10000.Q.Y();
   }
}





