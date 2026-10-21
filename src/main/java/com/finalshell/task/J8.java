package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.lang.reflect.InvocationTargetException;

public class J8 extends Thread {
   public final SelectDownloadFolderPanel Q;
   public static long a;

   public J8(SelectDownloadFolderPanel var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var7) {
            var7.printStackTrace();
         }

         Object var2 = 424677657916615795L;
         Ref.g(424677657916615795L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 391362407042412196L;
         Object[] var4 = var10002;
         Ref.h(391362407042412196L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3186634981635917129L;
      long var10002 = 3186634981635916901L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





