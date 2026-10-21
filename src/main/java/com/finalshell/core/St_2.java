package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class St_2 {
   public static boolean p;

   public static void main(String[] var0) {
      Registry.packArgs(var0);
      long var1 = 405573401826445833L;
      Ref.h2(405573401826445833L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static void L(boolean var0) {
      p = var0;
   }

   public static boolean b() {
      return p;
   }

   public static boolean u() {
      boolean var0 = b();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!b()) {
         L(true);
      }
   }
}





