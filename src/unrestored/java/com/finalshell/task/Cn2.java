package com.finalshell.task;

import com.finalshell.core.L9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import org.icmp4j.j;

public class Cn2 implements Runnable {
   public final j k;
   public final L9 X;
   public final com.finalshell.core.Dw4 U;

   public Cn2(com.finalshell.core.Dw4 var1, j var2, L9 var3) {
      this.U = var1;
      this.k = var2;
      this.X = var3;
   }

   @Override
   public void run() {
      int[] var1 = L9.X();
      if (var1 == null) {
         Object var3 = 549298689525284783L;
         if (((j)Ref.g(549298689525284783L, var3)).r() >= 0) {
            return;
         }
      }

      Object var5 = 608283482680598697L;
      Ref.g(608283482680598697L, var5);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 219753915081057422L;
      Object[] var7 = var10002;
      Ref.h(219753915081057422L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw new RuntimeException(var32.getTargetException());
      }

      Object var9 = 549298689525284783L;
      Object[] var10004 = Registry.packArgs(Ref.g(549298689525284783L, var9));
      long var12 = 608917329576578057L;
      Object[] var11 = var10004;
      Ref.h(608917329576578057L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw new RuntimeException(var31.getTargetException());
      }

      Object var13 = 440131299031849072L;
      Ref.g(440131299031849072L, var13);
      Object var15 = 487072334706875582L;
      Ref.g(487072334706875582L, var15);
      Object var17 = 608283482680598697L;
      Object[] var10008 = Registry.packArgs(Ref.g(608283482680598697L, var17));
      long var20 = 137222181119797019L;
      Object[] var19 = var10008;
      Ref.h(137222181119797019L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw new RuntimeException(var30.getTargetException());
      }

      Object var21 = 608283482680598697L;
      Ref.g(608283482680598697L, var21);
      Object var23 = 440131299031849072L;
      Object var10011 = Ref.g(440131299031849072L, var23);
      Object var25 = 487072334706875582L;
      Registry.packArgs(var10011, Ref.g(487072334706875582L, var25));
      long var27 = 146445297662860567L;
      Ref.h2(146445297662860567L, var27);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw new RuntimeException(var29.getTargetException());
      }
   }
}





