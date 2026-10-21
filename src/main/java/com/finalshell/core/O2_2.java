package com.finalshell.core;

import java.awt.event.WindowEvent;

public class O2_2 extends C42 {
   final com.finalshell.ui.dialog.Y2 R;
   public static long a;

   O2_2(com.finalshell.ui.dialog.Y2 var1, boolean var2) {
      super(var2);
      this.R = var1;
   }

   @Override
   public boolean z() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      boolean var10000 = this.R.isShowing();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.R.a;
      }

      return var1 == null ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      boolean var10000 = this.R.a;
      if (var2 != null) {
         if (!this.R.a) {
            return;
         }

         var10000 = this.R.isShowing();
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = var1;
      }

      if (!var10000) {
         com.finalshell.ui.dialog.Y2.X(this.R, new WindowEvent(this.R, (int)a));
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 73805248783452370L;
      long var10002 = 2683155618072365083L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





