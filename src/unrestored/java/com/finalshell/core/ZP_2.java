package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public abstract class ZP_2 {
   public abstract Object o();

   public abstract int U();

   public abstract int i();

   public abstract Object o(int var1, int var2);

   public String L(int var1, int var2) {
      Uo2.k();
      Object[] var10002 = Registry.packArgs(var1, var2);
      long var7 = 533716037937215783L;
      Object[] var6 = var10002;
      var10002 = Ref.h(533716037937215783L, var6, var7);

      try {
         var10002 = (Object[])((Object)var10002);
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }

      Object var4 = var10002;
      String var10001 = (String)var4;
      if (this == null) {
         if (var4 == null) {
            return "";
         }

         var10001 = (String)var4;
      }

      String var5 = var10001.toString();
      var10001 = var5;
      if (this == null) {
         if (var5 == null) {
            return "";
         }

         var10001 = var5;
      }

      return var10001;
   }

   public abstract Object U(int var1);
}





