package com.finalshell.ui.model;

import com.finalshell.core.Ln4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Jl2 implements Comparator {
   public int I(Ln4_2 var1, Ln4_2 var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 145535910876897139L;
      Object[] var3 = var10001;
      var10001 = Ref.h(145535910876897139L, var3, var4);

      try {
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 145535910876897139L;
      Object[] var5 = var10003;
      var10003 = Ref.h(145535910876897139L, var5, var6);

      try {
         var11 = (Integer)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return Integer.compare((int)var2, var11);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Ln4_2)var1, (Ln4_2)var2);
      long var4 = 459791630102767596L;
      Object[] var3 = var10001;
      var10001 = Ref.h(459791630102767596L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





