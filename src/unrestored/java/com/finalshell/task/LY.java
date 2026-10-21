package com.finalshell.task;

import com.finalshell.core.L9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class LY implements Runnable {
   public final L9 n;
   public final Kd2 G;

   public LY(Kd2 var1, L9 var2) {
      this.G = var1;
      this.n = var2;
   }

   @Override
   public void run() {
      Object var1 = 163845508223340572L;
      Ref.g(163845508223340572L, var1);
      Object var3 = 188463863722214745L;
      Ref.g(188463863722214745L, var3);
      Object var5 = 223064528988202144L;
      Object[] var10004 = Registry.packArgs(Ref.g(223064528988202144L, var5));
      long var8 = 510458658460942160L;
      Object[] var7 = var10004;
      Ref.h(510458658460942160L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }
}





