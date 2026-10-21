package com.finalshell.core;

import javax.swing.JComponent;

public class Eu4 extends E12 {
   public static String a;

   public void d(L42 var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      var1.setText(this.q(var3, var4));
      var1.d(this.P(a, var3, var4));
   }

   @Override
   public void L(JComponent var1, String var2, com.finalshell.ui.model.G9 var3, Object[] var4) {
      this.d((L42)var1, var2, var3, var4);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "U#`\u0016\"w+S=}\u0017".toCharArray();
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
            a = var9;
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
               var23 = 13;
               break;
            case 1:
               var23 = 124;
               break;
            case 2:
               var23 = 33;
               break;
            case 3:
               var23 = 82;
               break;
            case 4:
               var23 = 103;
               break;
            case 5:
               var23 = 22;
               break;
            default:
               var23 = 104;
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





