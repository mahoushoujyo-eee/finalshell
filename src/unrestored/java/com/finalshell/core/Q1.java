package com.finalshell.core;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Q1 extends QH {
   public static String g;

   public static ComponentUI createUI(JComponent var0) {
      return new Q1();
   }

   @Override
   public String getPropertyPrefix() {
      return g;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\",j>+o$\u0001'L62o\u0016\r&t7".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 1;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 1;
         var10006 = var0;
      } else {
         var6 = 1;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            g = var9;
            return;
         }

         var10005 = var10003;
         var10 = 1;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 101;
               break;
            case 1:
               var23 = 66;
               break;
            case 2:
               var23 = 25;
               break;
            case 3:
               var23 = 82;
               break;
            case 4:
               var23 = 75;
               break;
            case 5:
               var23 = 26;
               break;
            default:
               var23 = 81;
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
               g = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





