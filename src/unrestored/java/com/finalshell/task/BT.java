package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Lw2;
import java.lang.reflect.InvocationTargetException;

public class BT implements Runnable {
   public final String F;
   public final Lw2 W;

   public BT(Lw2 var1, String var2) {
      this.W = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Object var1 = 216367832445276444L;
      Ref.g(216367832445276444L, var1);
      Object var3 = 257342744894307012L;
      Ref.g(257342744894307012L, var3);
      Object var5 = 294487557435087442L;
      Ref.g(294487557435087442L, var5);
      Object var7 = 527035799301297247L;
      Object[] var10005 = Registry.packArgs(Ref.g(527035799301297247L, var7), true, true);
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





