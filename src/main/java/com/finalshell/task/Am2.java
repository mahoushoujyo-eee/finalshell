package com.finalshell.task;

import com.finalshell.core.Yd2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Nq2;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Am2 implements Runnable {
   final String W;
   final Nq2 C;
   final List D;
   final String x;
   final Yd2 M;

   Am2(Yd2 var1, String var2, Nq2 var3, List var4, String var5) {
      this.M = var1;
      this.W = var2;
      this.C = var3;
      this.D = var4;
      this.x = var5;
   }

   @Override
   public void run() {
      Object var2 = 368842162260574859L;
      Registry.packArgs(Ref.g(368842162260574859L, var2));
      long var4 = 571034619098221891L;
      Object var10002 = Ref.h2(571034619098221891L, var4);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var1 = (String)var10002;
      Object var6 = 154461434244282461L;
      Ref.g(154461434244282461L, var6);
      Object var8 = 431442171639759456L;
      Ref.g(431442171639759456L, var8);
      Object var10 = 368842162260574859L;
      Object var10007 = Ref.g(368842162260574859L, var10);
      Object var12 = 285066172273015811L;
      var10007 = Registry.packArgs(var10007, this, Ref.g(285066172273015811L, var12), var1);
      long var15 = 566104538227199671L;
      Object[] var14 = (Object[])var10007;
      Ref.h(566104538227199671L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }
}





