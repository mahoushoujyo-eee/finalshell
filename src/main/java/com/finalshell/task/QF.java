package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.Nq2;

public class QF implements Runnable {
   public final OE3 I;
   public static long a;

   public QF(OE3 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var6) {
         var6.printStackTrace();
      }

      Object var2 = 442764781923245602L;
      Ref.g(442764781923245602L, var2);
      Object var4 = 549465658310609690L;
      ((Nq2)Ref.g(549465658310609690L, var4)).setVisible(false);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6469273428450883857L;
      long var10002 = 6469273428450884613L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





