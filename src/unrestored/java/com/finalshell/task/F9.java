package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cc2;
import java.lang.reflect.InvocationTargetException;

public class F9 implements Runnable {
   public final Cc2 F;

   public F9(Cc2 var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Object var1 = 429840759379633187L;
      Ref.g(429840759379633187L, var1);
      Object[] var10002 = Registry.packArgs(Ref.g(306654569208204766L, null));
      long var4 = 525365375200145529L;
      Object[] var3 = var10002;
      Ref.h(525365375200145529L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





