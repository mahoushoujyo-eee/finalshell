package com.finalshell.core;

import java.awt.Component;

public class IE3 implements Ka2 {
   final com.finalshell.ui.panel.QB b;

   IE3(com.finalshell.ui.panel.QB var1) {
      this.b = var1;
   }

   @Override
   public void N(Component var1, Component var2) {
      int[] var3 = WC_2.V();
      Object var10000 = this.b;
      if (var3 == null) {
         if (!this.b.V) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 == null) {
         this.b.l$QB();
      }
   }
}





