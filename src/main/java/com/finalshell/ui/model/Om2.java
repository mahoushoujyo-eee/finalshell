package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Om2 implements Comparator {
   public int x(Integer var1, Integer var2) {
      return var1.compareTo(var2);
   }

   public int V(Float var1, Float var2) {
      return var1.compareTo(var2);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((Integer)var1, (Integer)var2);
      long var4 = 227703286706087580L;
      Object[] var3 = var10001;
      var10001 = Ref.h(227703286706087580L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





