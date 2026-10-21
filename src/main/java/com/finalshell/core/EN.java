package com.finalshell.core;

import com.finalshell.ui.model.Pf4;

public class EN {
   protected static Pf4 h;
   protected static boolean U;
   public static String m;
   public static String b;

   public static synchronized void b() {
      String var0 = Y();
      boolean var10000 = U;
      if (var0 != null) {
         if (U) {
            return;
         }

         var10000 = true;
      }

      U = var10000;
      PM.m(Pf4.class);
   }

   public static Pf4 t() {
      String var0 = Y();
      Pf4 var10000 = h;
      if (var0 != null) {
         if (h == null) {
            h = (Pf4)PM.s(A9.class.getResource(b));
         }

         var10000 = h;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static void F(String var0) {
      m = var0;
   }

   public static String Y() {
      return m;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (Y() == null) {
         F("ucxTnb");
      }

      char[] var10003 = "^6J4{*bI \u0016-k*rE<Wuv5m".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 49;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      } else {
         var6 = 49;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            h = null;
            U = false;
            return;
         }

         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 29;
               break;
            case 1:
               var23 = 98;
               break;
            case 2:
               var23 = 8;
               break;
            case 3:
               var23 = 106;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 105;
               break;
            default:
               var23 = 48;
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
               b = var8;
               h = null;
               U = false;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





