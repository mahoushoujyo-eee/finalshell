package org.l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.T.a;

public final class F {
   private static boolean g;

   private F() {
   }

   public static Iterable v(Object[] var0, Class var1) {
      return L(Arrays.asList(var0), var1);
   }

   public static Iterable L(Iterable var0, Class var1) {
      return new org.l.e_2(var0, var1);
   }

   public static Iterator P(Iterator var0, Class var1) {
      return e(var0, new d_2(var1));
   }

   public static Iterable t(Object[] var0, a var1) {
      return W(Arrays.asList(var0), var1);
   }

   public static Iterable W(Iterable var0, a var1) {
      return new org.l.o_2(var0, var1);
   }

   public static Iterator e(Iterator var0, a var1) {
      return new org.l.E(var0, var1);
   }

   public static Object[] A(Iterable var0, Class var1) {
      return p(var0.iterator(), var1);
   }

   public static Object[] p(Iterator var0, Class var1) {
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

         var5 = Array.newInstance(var1, var3.size());
         break;
      }

      Object[] var4 = (Object[])var5;
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
      if (G()) {
         u(true);
      }
   }
}





