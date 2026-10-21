package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Tk2;
import com.finalshell.ui.panel.Kf4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class S4 extends MouseAdapter {
   final Kf4 d;

   S4(Kf4 var1) {
      this.d = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = Tk2.B();
      boolean var10000 = FN.B(var1);
      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = this.d.isEnabled();
      }

      if (!var2) {
         if (!var10000) {
            return;
         }

         this.d.requestFocusInWindow();
      }

      Kf4 var3 = this.d;
      boolean var10001 = this.d.D();
      if (!var2) {
         var10001 = !var10001;
      }

      var3.c(var10001);
   }
}





