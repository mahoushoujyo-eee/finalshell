package com;

import java.lang.reflect.ParameterizedType;

public abstract class e1_2 implements com.ld_4 {
   private static String[] X;

   @Override
   public Class D() {
      try {
         return (Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
      } catch (Throwable var2) {
         return null;
      }
   }

   protected String q(G9 var1, Object[] var2) {
      return this.P(null, var1, var2);
   }

   protected String P(String var1, G9 var2, Object[] var3) {
      return this.I(var1, false, var2, var3);
   }

   protected String I(String var1, boolean var2, G9 var3, Object[] var4) {
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

   private String B(String var1, Object[] var2) {
      return String.format(var1, var2);
   }

   public static void K(String[] var0) {
      X = var0;
   }

   public static String[] A() {
      return X;
   }

   static {
      if (A() == null) {
         K(new String[1]);
      }
   }
}





