package com.finalshell.ui.listener;

import com.finalshell.core.T4;
import com.finalshell.core.Tb2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FB implements ActionListener {
   public final Tb2 e;

   public FB(Tb2 var1) {
      this.e = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = T4.O();
      Tb2 var10000 = this.e;
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





