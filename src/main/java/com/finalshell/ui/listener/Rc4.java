package com.finalshell.ui.listener;

import com.finalshell.core.AO_2;
import com.finalshell.core.Fm2;
import com.finalshell.core.UE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rc4 implements ActionListener {
   final Fm2 M;

   Rc4(Fm2 var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = UE.o();
      AO_2 var10000 = this.M.I;
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

      var10000.G$void();
      this.M.U.repaint();
   }
}





