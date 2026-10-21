package com.finalshell.core;

import java.io.File;
import java.io.FilenameFilter;

public class K2_4 implements FilenameFilter {
   public static boolean n;
   public final com.finalshell.ui.model.Y2 S;
   public static String a;

   public K2_4(com.finalshell.ui.model.Y2 var1) {
      this.S = var1;
   }

   @Override
   public boolean accept(@C_9 File var1, @C_9 String var2) {
      String var4;
      int[] var3 = F_6.h();
      boolean var10000 = n;
      if (var3 == null) {
         if (!n && var1 == null) {
            throw new AssertionError();
         }

         var10000 = n;
      }

      if (var3 == null) {
         label26: {
            if (!var10000) {
               var4 = var2;
               if (var3 != null) {
                  break label26;
               }

               if (var2 == null) {
                  throw new AssertionError();
               }
            }

            var4 = var2;
         }

         var10000 = var4.endsWith(a);
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Q\u0019\u0014,".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 73;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      } else {
         var6 = 73;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            n = !G_5.class.desiredAssertionStatus();
            return;
         }

         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 54;
               break;
            case 1:
               var23 = 58;
               break;
            case 2:
               var23 = 60;
               break;
            case 3:
               var23 = 23;
               break;
            case 4:
               var23 = 92;
               break;
            case 5:
               var23 = 67;
               break;
            default:
               var23 = 97;
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
               n = !G_5.class.desiredAssertionStatus();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





