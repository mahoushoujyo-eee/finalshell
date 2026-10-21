package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class FV3 implements BH {
   public final YT3_2 j;

   public FV3(YT3_2 var1) {
      this.j = var1;
   }

   @Override
   public void t(L1 var1) {
      Object var2 = 612009590573368648L;
      Ref.g(612009590573368648L, var2);
      Object var4 = 507208485423109694L;
      Ref.g(507208485423109694L, var4);
      Object[] var10004 = Registry.emptyArgs();
      long var7 = 542058094445767607L;
      Object[] var6 = var10004;
      Registry.packArgs(Ref.h(542058094445767607L, var6, var7));
      long var8 = 417955638237048558L;
      Object[] var10005 = Registry.packArgs(Ref.h2(417955638237048558L, var8), Registry.lookupField(533852929194464166L).getInt(null));
      long var11 = 336149661543182260L;
      Object[] var10 = var10005;
      Ref.h(336149661543182260L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





