package com;

import javax.swing.ImageIcon;

public class W6 {
   public static ImageIcon H;
   public static int A;
   public static int v;
   public static boolean c;
   public static eL_3 b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "y+awKL8`$gmq\u0000$~f~w_".toCharArray();
      int var10004 = var10003.length;
      int var5 = 0;
      byte var18 = 15;
      char[] var10002 = var10003;
      int var9 = var10004;
      char[] var22;
      byte var26;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var22 = var10003;
         var10005 = var5;
         char var10008 = var10003[var5];
         var10007 = 15;
         var10006 = var10008;
         switch (var5 % 7) {
            case 0:
               var26 = 31;
               break;
            case 1:
               var26 = 71;
               break;
            case 2:
               var26 = 1;
               break;
            case 3:
               var26 = 22;
               break;
            case 4:
               var26 = 55;
               break;
            case 5:
               var26 = 108;
               break;
            default:
               var26 = 68;
         }
      } else {
         var18 = 15;
         var9 = var10004;
         if (var10004 <= var5) {
            String var21 = new String(var10003).intern();
            byte var13 = -1;
            String var8 = var21;
            long var7 = 2078424046471458882L;
            long var17 = -4217405273912922044L ^ var7;
            var13 = -1;
            long var6 = var17;
            H = new ImageIcon(com.W6.class.getResource(var8));
            A = 1;
            v = (int)var6;
            c = false;
            b = eL_3.belowStart;
            return;
         }

         var22 = var10003;
         var10005 = var5;
         char var27 = var10003[var5];
         var10007 = 15;
         var10006 = var27;
         switch (var5 % 7) {
            case 0:
               var26 = 31;
               break;
            case 1:
               var26 = 71;
               break;
            case 2:
               var26 = 1;
               break;
            case 3:
               var26 = 22;
               break;
            case 4:
               var26 = 55;
               break;
            case 5:
               var26 = 108;
               break;
            default:
               var26 = 68;
         }
      }

      while (true) {
         var22[var10005] = (char)(var10006 ^ var10007 ^ var26);
         var5++;
         if (var18 == 0) {
            var22 = var10002;
            var10005 = var18;
            char var29 = var10002[var18];
            var10007 = var18;
            var10006 = var29;
            switch (var5 % 7) {
               case 0:
                  var26 = 31;
                  break;
               case 1:
                  var26 = 71;
                  break;
               case 2:
                  var26 = 1;
                  break;
               case 3:
                  var26 = 22;
                  break;
               case 4:
                  var26 = 55;
                  break;
               case 5:
                  var26 = 108;
                  break;
               default:
                  var26 = 68;
            }
         } else {
            if (var9 <= var5) {
               String var20 = new String(var10002).intern();
               byte var11 = -1;
               String var4 = var20;
               long var2 = 2078424046471458882L;
               long var16 = -4217405273912922044L ^ var2;
               var11 = -1;
               long var0 = var16;
               H = new ImageIcon(com.W6.class.getResource(var4));
               A = 1;
               v = (int)var0;
               c = false;
               b = eL_3.belowStart;
               return;
            }

            var22 = var10002;
            var10005 = var5;
            char var28 = var10002[var5];
            var10007 = var18;
            var10006 = var28;
            switch (var5 % 7) {
               case 0:
                  var26 = 31;
                  break;
               case 1:
                  var26 = 71;
                  break;
               case 2:
                  var26 = 1;
                  break;
               case 3:
                  var26 = 22;
                  break;
               case 4:
                  var26 = 55;
                  break;
               case 5:
                  var26 = 108;
                  break;
               default:
                  var26 = 68;
            }
         }
      }
   }
}





