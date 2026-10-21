package com.finalshell.core;

import java.lang.reflect.Method;

public final class D_8 {
   public static int[] Y;

   public static java.lang.Class Z(String var0) {
      return M(ClassLoader.getSystemClassLoader(), var0);
   }

   public static java.lang.Class M(ClassLoader var0, String var1) {
      try {
         return var0.loadClass(var1);
      } catch (Exception var3) {
         throw new AssertionError(var3);
      }
   }

   public static Method z(java.lang.Class var0, String var1, java.lang.Class[] var2) {
      try {
         return var0.getDeclaredMethod(var1, var2);
      } catch (Exception var4) {
         throw new AssertionError(var4);
      }
   }

   public static void P(int[] var0) {
      Y = var0;
   }

   public static int[] q() {
      return Y;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (q() != null) {
         P(new int[2]);
      }
   }
}





