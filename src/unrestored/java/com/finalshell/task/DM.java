package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Lm4;
import java.lang.reflect.InvocationTargetException;

public class DM implements Runnable {
   public final Lm4 F;

   public DM(Lm4 var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Object var1 = 283419271612920079L;
      Ref.g(283419271612920079L, var1);
      Object var3 = 275628384420924903L;
      Ref.g(275628384420924903L, var3);
      Object var5 = 636752062782772004L;
      Registry.packArgs(Ref.g(636752062782772004L, var5));
      long var7 = 264379078899316637L;
      Ref.h2(264379078899316637L, var7);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }
}





