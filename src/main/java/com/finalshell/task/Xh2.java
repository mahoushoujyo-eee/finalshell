package com.finalshell.task;

import com.finalshell.core.SelectUploadFile;
import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class Xh2 implements Runnable {
   public final SetBackgroundImagePanel n;
   public final SelectUploadFile i;
   public static long a;

   public Xh2(SelectUploadFile var1, SetBackgroundImagePanel var2) {
      this.i = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      String var1 = SelectUploadFile.r$String();
      int var10000 = (this.i.N) ? 1 : 0;
      if (var1 == null) {
         if (!this.i.N) {
            return;
         }

         long var2;
         var10000 = (var2 = this.i.D - this.i.u) == 0L ? 0 : (var2 < 0L ? -1 : 1);
      }

      if (var1 == null) {
         if (var10000 <= 0) {
            return;
         }

         long var3;
         var10000 = (var3 = System.currentTimeMillis() - this.i.u - a) == 0L ? 0 : (var3 < 0L ? -1 : 1);
      }

      if (var10000 > 0) {
         this.i.u = System.currentTimeMillis();
         this.n.X$_y_2().i$void();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2727671679669309245L;
      long var10002 = 2727671679669309273L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





