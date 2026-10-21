package com.finalshell.core;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ou4 {
   public static String a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static String f(Hashtable var0) {
      String var10000 = D6.k();
      StringBuffer var2 = new StringBuffer();
      String var1 = var10000;
      Enumeration var3 = var0.keys();
      if (var1 != null) {
         var10000 = (String)var3.nextElement();
      } else if (!var3.hasMoreElements()) {
         var10000 = var2.toString();
         if (var1 == null) {
            return var10000;
         }
      } else {
         var10000 = (String)var3.nextElement();
      }

      while (true) {
         String var4 = var10000;
         var2.append(var0.get(var4) + a + var4 + "\n");
         if (!var3.hasMoreElements()) {
            var10000 = var2.toString();
            if (var1 == null) {
               return var10000;
            }
         } else {
            var10000 = (String)var3.nextElement();
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001c\b\t".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 17;
               break;
            case 1:
               var23 = 31;
               break;
            case 2:
               var23 = 4;
               break;
            case 3:
               var23 = 13;
               break;
            case 4:
               var23 = 46;
               break;
            case 5:
               var23 = 37;
               break;
            default:
               var23 = 17;
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





