package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Method;

public final class I_4 {
   public static Ky4[] Y;
   public static String a;

   public static L_6 c(Object var0) {
      return new M_6(var0);
   }

   public static Object h(L_6 var0) {
      Ky4[] var1 = W();
      Object var10000 = N_8.A(var0, new Method[]{L_6.F, D_8.z(var0.getClass(), a, new java.lang.Class[]{Object.class})});
      if (var1 != null) {
         Ky4.K(new String[1]);
      }

      return var10000;
   }

   public static void o(Ky4[] var0) {
      Y = var0;
   }

   public static Ky4[] W() {
      return Y;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (W() != null) {
         o(new Ky4[3]);
      }

      char[] var10003 = "rk0lOV".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 39;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      } else {
         var6 = 39;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 52;
               break;
            case 1:
               var23 = 47;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 46;
               break;
            case 4:
               var23 = 24;
               break;
            case 5:
               var23 = 5;
               break;
            default:
               var23 = 101;
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





