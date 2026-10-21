package com.finalshell.core;

import java.awt.event.KeyEvent;

public class Nu4 extends Wc2{
   final com.finalshell.ui.listener.YM a;

   Nu4(com.finalshell.ui.listener.YM var1) {
      this.a = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int var2 = Nx4.R();
      E var10000 = com.finalshell.ui.listener.YM.M(this.a);
      if (var2 == 0) {
         if (var10000 == null) {
            return;
         }

         com.finalshell.ui.listener.YM.A(this.a, false);
         var10000 = com.finalshell.ui.listener.YM.M(this.a);
      }

      var10000.dispose();
   }
}





