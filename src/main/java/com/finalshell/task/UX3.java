package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class UX3 implements Runnable {
   public final YT3_2 e;

   public UX3(YT3_2 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var1 = YT3_2.c();
      Object var2 = 595259318578023995L;
      Object var10001 = (YT3_2)Ref.g(595259318578023995L, var2);
      if (var1 != null) {
         if (!Registry.lookupField(309441501335294259L).getBoolean(var10001)) {
            return;
         }

         var10001 = this;
         Object var4 = 595259318578023995L;
         Ref.g(595259318578023995L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 223833355588839652L;
         Object[] var6 = var10003;
         Ref.h(223833355588839652L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         Object var8 = 595259318578023995L;
         YT3_2 var10004 = (YT3_2)Ref.g(595259318578023995L, var8);
      }

      Registry.lookupField(309441501335294259L).setBoolean(var10001, false);
   }
}





