package com.finalshell.ui.listener;

import com.finalshell.core.W_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P implements ActionListener {
   public final com.finalshell.core.Y2 Z;

   public P(com.finalshell.core.Y2 var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = W_2.B$arrint();
      com.finalshell.core.Y2 var10000 = this.Z;
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





