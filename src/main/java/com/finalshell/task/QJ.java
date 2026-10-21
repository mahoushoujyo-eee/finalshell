package com.finalshell.task;

import com.finalshell.core.Yd2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Nq2;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class QJ implements Runnable {
   final String S;
   final Nq2 Q;
   final List r;
   final String K;
   final Yd2 I;

   QJ(Yd2 var1, String var2, Nq2 var3, List var4, String var5) {
      this.I = var1;
      this.S = var2;
      this.Q = var3;
      this.r = var4;
      this.K = var5;
   }

   @Override
   public void run() {
      Object var2 = 521442314554970225L;
      Registry.packArgs(Ref.g(521442314554970225L, var2));
      long var4 = 571034619098221891L;
      Object var10002 = Ref.h2(571034619098221891L, var4);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var1 = (String)var10002;
      Object var6 = 144331608959698200L;
      Ref.g(144331608959698200L, var6);
      Object var8 = 199262481176799242L;
      Ref.g(199262481176799242L, var8);
      Object var10 = 521442314554970225L;
      Object var10007 = Ref.g(521442314554970225L, var10);
      Object var12 = 217205850914256335L;
      var10007 = Registry.packArgs(var10007, this, Ref.g(217205850914256335L, var12), var1);
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





