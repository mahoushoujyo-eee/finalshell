package com.finalshell.ui.listener;

import java.awt.Window;

public class RZ extends Rt2 {
   public final com.finalshell.ui.dialog.Ds2 U;

   public RZ(com.finalshell.ui.dialog.Ds2 var1, Window var2, Window var3) {
      super(var2, var3);
      this.U = var1;
   }

   @Override
   public boolean P() {
      int[] var1 = com.finalshell.ui.dialog.Ds2.U$arrint();
      boolean var10000 = this.U.r;
      if (var1 == null) {
         var10000 = !this.U.r;
      }

      return var10000;
   }
}





