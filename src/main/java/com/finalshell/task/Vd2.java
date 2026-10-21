package com.finalshell.task;

import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Refresh;
import java.lang.reflect.InvocationTargetException;

public class Vd2 implements Runnable {
   public final Ty2 S;
   public final Refresh d;

   public Vd2(Refresh var1, Ty2 var2) {
      this.d = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      int[] var1 = Refresh.K();
      if (var1 != null) {
         Object var2 = 202071010499428846L;
         Ref.g(202071010499428846L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 121632250293569146L;
         Object[] var4 = var10002;
         Ref.h(121632250293569146L, var4, var5);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 209547680018014679L;
         Object[] var6 = var10003;
         var10003 = Ref.h(209547680018014679L, var6, var7);

         try {
            var19 = (Long)var10003;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         if (var19 <= 0L) {
            return;
         }
      }

      Object var8 = 449269637640691602L;
      Ref.g(449269637640691602L, var8);
      Object var10 = 202071010499428846L;
      Ref.g(202071010499428846L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 121632250293569146L;
      Object[] var12 = var10004;
      var10004 = Registry.packArgs(Ref.h(121632250293569146L, var12, var13));
      long var15 = 540897424776196125L;
      Object[] var14 = var10004;
      Ref.h(540897424776196125L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }
}





