package com.finalshell.core;

import java.lang.reflect.ParameterizedType;

public abstract class E12 implements Ld4 {
   public static String[] X;

   @Override
   public java.lang.Class D() {
      try {
         return (java.lang.Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
      } catch (Throwable var2) {
         return null;
      }
   }

   public String q(com.finalshell.ui.model.G9 var1, Object[] var2) {
      return this.P(null, var1, var2);
   }

   public String P(String var1, com.finalshell.ui.model.G9 var2, Object[] var3) {
      return this.I(var1, false, var2, var3);
   }

   public String I(String var1, boolean var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      String[] var10000 = A();
      String var6 = var3.J(var1, var2);
      String[] var5 = var10000;
      if (var4 != null) {
         if (var5 == null) {
            return var6;
         }

         if (var6 != null) {
            return this.B(var6, var4);
         }
      }

      return var6;
   }

   public String B(String var1, Object[] var2) {
      return String.format(var1, var2);
   }

   public static void K(String[] var0) {
      X = var0;
   }

   public static String[] A() {
      return X;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (A() == null) {
         K(new String[1]);
      }
   }
}





