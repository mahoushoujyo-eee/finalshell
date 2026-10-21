package com.finalshell.ui.listener;

import com.finalshell.core.T4;
import com.finalshell.core.Tb2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class La4 implements ActionListener {
   final Tb2 h;

   La4(Tb2 var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = T4.O();
      Tb2 var10000 = this.h;
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





