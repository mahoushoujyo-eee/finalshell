package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Fy4 implements Runnable {
   public final B72 n;

   public Fy4(B72 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Object var1 = 263718116894060700L;
      Ref.g(263718116894060700L, var1);
      Object var3 = 440529940248018366L;
      Ref.g(440529940248018366L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 399329213267848661L;
      Object[] var5 = var10003;
      Ref.h(399329213267848661L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





