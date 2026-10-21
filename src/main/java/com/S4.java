package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class S4 extends MouseAdapter {
   final com.kf_4 d;

   S4(com.kf_4 var1) {
      this.d = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = com.Tk_2.B();
      boolean var10000 = com.FN.B(var1);
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

      com.kf_4 var3 = this.d;
      boolean var10001 = this.d.D();
      if (!var2) {
         var10001 = !var10001;
      }

      var3.c(var10001);
   }
}





