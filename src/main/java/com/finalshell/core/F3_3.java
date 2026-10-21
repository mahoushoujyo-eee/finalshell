package com.finalshell.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class F3_3 {
   public static boolean g;

   public static Iterable v(Object[] var0, java.lang.Class var1) {
      return L(Arrays.asList(var0), var1);
   }

   public static Iterable L(Iterable var0, java.lang.Class var1) {
      return new com.finalshell.ui.model.E2(var0, var1);
   }

   public static Iterator P(Iterator var0, java.lang.Class var1) {
      return e(var0, new D_2_4(var1));
   }

   public static Iterable t(Object[] var0, A_4 var1) {
      return W(Arrays.asList(var0), var1);
   }

   public static Iterable W(Iterable var0, A_4 var1) {
      return new com.finalshell.ui.model.O2(var0, var1);
   }

   public static Iterator e(Iterator var0, A_4 var1) {
      return new com.finalshell.ui.model.E_2(var0, var1);
   }

   public static Object[] A(Iterable var0, java.lang.Class var1) {
      return p(var0.iterator(), var1);
   }

   public static Object[] p(Iterator var0, java.lang.Class var1) {
      ArrayList var5;
      boolean var10000 = G();
      ArrayList var3 = new ArrayList();
      boolean var2 = var10000;

      while (true) {
         if (var0.hasNext()) {
            var5 = var3;
            if (var2) {
               break;
            }

            var3.add(var0.next());
            if (!var2) {
               continue;
            }
         }

         var5 = (ArrayList)(Array.newInstance(var1, var3.size()));
         break;
      }

      Object var4 = (Object[])var5;
      return var3.toArray(var4);
   }

   public static void u(boolean var0) {
      g = var0;
   }

   public static boolean G() {
      return g;
   }

   public static boolean s() {
      boolean var0 = G();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (G()) {
         u(true);
      }
   }
}





