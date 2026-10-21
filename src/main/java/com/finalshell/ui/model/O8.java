package com.finalshell.ui.model;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class O8 implements Comparator {
   public int t(Long var1, Long var2) {
      String var3 = Km2.U$String();
      long var4;
      int var10000 = (var4 = var1 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
      if (var3 == null) {
         if (var10000 > 0) {
            return 1;
         }

         long var5;
         var10000 = (var5 = var1 - var2) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 < 0) {
            return -1;
         }

         var10000 = 0;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((Long)var1, (Long)var2);
      long var4 = 262915954633911742L;
      Object var3 = var10001;
      var10001 = Ref.h(262915954633911742L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





