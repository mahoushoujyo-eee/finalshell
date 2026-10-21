package com.finalshell.task;

import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public class Yv2 implements Callable {
   public final String F;
   public final String L;
   public final RemoteProcessManager M;
   public static String a;

   public Yv2(RemoteProcessManager var1, String var2, String var3) {
      this.M = var1;
      this.F = var2;
      this.L = var3;
   }

   @Override
   public Object call() throws Exception {
      Object var1 = 476438001673837429L;
      Ref.g(476438001673837429L, var1);
      Object var3 = 393873875489086772L;
      Object var10004 = Ref.g(393873875489086772L, var3);
      Object var5 = 472565642410851081L;
      var10004 = Registry.packArgs(var10004, this, Ref.g(472565642410851081L, var5));
      long var8 = 543008358971428048L;
      Object[] var7 = (Object[])var10004;
      Ref.h(543008358971428048L, var7, var8);

      try {
         return null;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001d4%@\u001e\u0018'[7 B\u001c[".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 25;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      } else {
         var6 = 25;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 25;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 42;
               break;
            case 1:
               var23 = 75;
               break;
            case 2:
               var23 = 85;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 102;
               break;
            case 5:
               var23 = 109;
               break;
            default:
               var23 = 77;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





