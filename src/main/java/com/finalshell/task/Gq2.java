package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.DownloadDialog;

public class Gq2 implements Runnable {
   public final DownloadDialog U;
   public static long a;

   public Gq2(DownloadDialog var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

      Object var2 = 310503994018213298L;
      ((DownloadDialog)Ref.g(310503994018213298L, var2)).setVisible(false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8745436831272366096L;
      long var10002 = 8745436831272367364L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





