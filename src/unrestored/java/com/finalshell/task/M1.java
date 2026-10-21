package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class M1 implements Runnable {
   public final String F;
   public final com.finalshell.ui.listener.LG p;

   public M1(com.finalshell.ui.listener.LG var1, String var2) {
      this.p = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Object var1 = 251848875917497846L;
      Ref.g(251848875917497846L, var1);
      Object var3 = 414662050894156863L;
      Ref.g(414662050894156863L, var3);
      Object var5 = 294487557435087442L;
      Ref.g(294487557435087442L, var5);
      Object var7 = 557992366598426798L;
      Object[] var10005 = Registry.packArgs(Ref.g(557992366598426798L, var7), true, true);
      long var10 = 413727787977868950L;
      Object[] var9 = var10005;
      Ref.h(413727787977868950L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }
   }
}





