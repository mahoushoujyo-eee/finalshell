package com;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class DT extends com.DU {
   private static final String b;

   public static ComponentUI createUI(JComponent var0) {
      return new com.DT();
   }

   @Override
   protected String getPropertyPrefix() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001f:\u0012^\u0019Za.".toCharArray();
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
            b = var9;
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
               var23 = 102;
               break;
            case 1:
               var23 = 114;
               break;
            case 2:
               var23 = 71;
               break;
            case 3:
               var23 = 7;
               break;
            case 4:
               var23 = 100;
               break;
            case 5:
               var23 = 22;
               break;
            default:
               var23 = 34;
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
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





