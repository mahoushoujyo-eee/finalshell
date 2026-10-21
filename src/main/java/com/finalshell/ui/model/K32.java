package com.finalshell.ui.model;

import com.finalshell.core.Kb4;
import com.finalshell.core.Ln2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class K32 implements Comparator {
   final Ln2 T;

   K32(Ln2 var1) {
      this.T = var1;
   }

   public int S(Kb4 var1, Kb4 var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 561034201633722257L;
      Object[] var3 = var10001;
      var10001 = Ref.h(561034201633722257L, var3, var4);

      try {
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 561034201633722257L;
      Object[] var5 = var10003;
      var10003 = Ref.h(561034201633722257L, var5, var6);

      try {
         var11 = (Long)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return Long.compare((long)var1, var11);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Kb4)var1, (Kb4)var2);
      long var4 = 234402973361298962L;
      Object[] var3 = var10001;
      var10001 = Ref.h(234402973361298962L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





