package com.finalshell.core;

import java.awt.Insets;

public final class KG_2 {
   public static Insets L;
   public static int z;
   public static boolean C;
   public static float s;
   public static String j;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "/S\u0004".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 22;
      char[] var10002 = var10003;
      int var3 = var10004;
      char[] var12;
      byte var16;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var12 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 22;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 23;
               break;
            case 1:
               var16 = 107;
               break;
            case 2:
               var16 = 60;
               break;
            case 3:
               var16 = 64;
               break;
            case 4:
               var16 = 74;
               break;
            case 5:
               var16 = 72;
               break;
            default:
               var16 = 1;
         }
      } else {
         var8 = 22;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            L = O__2.u;
            z = 1;
            C = false;
            s = 1.5F;
            j = var2;
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 22;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 23;
               break;
            case 1:
               var16 = 107;
               break;
            case 2:
               var16 = 60;
               break;
            case 3:
               var16 = 64;
               break;
            case 4:
               var16 = 74;
               break;
            case 5:
               var16 = 72;
               break;
            default:
               var16 = 1;
         }
      }

      while (true) {
         var12[var10005] = (char)(var10006 ^ var10007 ^ var16);
         var1++;
         if (var8 == 0) {
            var12 = var10002;
            var10005 = var8;
            char var19 = var10002[var8];
            var10007 = var8;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var16 = 23;
                  break;
               case 1:
                  var16 = 107;
                  break;
               case 2:
                  var16 = 60;
                  break;
               case 3:
                  var16 = 64;
                  break;
               case 4:
                  var16 = 74;
                  break;
               case 5:
                  var16 = 72;
                  break;
               default:
                  var16 = 1;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               L = O__2.u;
               z = 1;
               C = false;
               s = 1.5F;
               j = var0;
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 23;
                  break;
               case 1:
                  var16 = 107;
                  break;
               case 2:
                  var16 = 60;
                  break;
               case 3:
                  var16 = 64;
                  break;
               case 4:
                  var16 = 74;
                  break;
               case 5:
                  var16 = 72;
                  break;
               default:
                  var16 = 1;
            }
         }
      }
   }
}





