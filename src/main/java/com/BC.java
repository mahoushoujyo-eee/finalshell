package com;

import javax.swing.ImageIcon;

public final class BC {
   public static boolean c;
   public static com.LX Z;
   public static int l;
   public static ImageIcon q;
   public static ImageIcon d;
   public static boolean W;
   public static boolean p;
   public static int x;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "F\u0015(ro\u0011~]\u0004(k2NqH".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 93;
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
         var10007 = 93;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 114;
               break;
            case 1:
               var16 = 43;
               break;
            case 2:
               var16 = 26;
               break;
            case 3:
               var16 = 65;
               break;
            case 4:
               var16 = 65;
               break;
            case 5:
               var16 = 99;
               break;
            default:
               var16 = 66;
         }
      } else {
         var8 = 93;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            c = GO.k;
            Z = com.LX.united;
            l = 1;
            q = new ImageIcon(com.BC.class.getResource(var2));
            d = Xg_2.U(q);
            W = true;
            p = true;
            x = 0;
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 93;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 114;
               break;
            case 1:
               var16 = 43;
               break;
            case 2:
               var16 = 26;
               break;
            case 3:
               var16 = 65;
               break;
            case 4:
               var16 = 65;
               break;
            case 5:
               var16 = 99;
               break;
            default:
               var16 = 66;
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
                  var16 = 114;
                  break;
               case 1:
                  var16 = 43;
                  break;
               case 2:
                  var16 = 26;
                  break;
               case 3:
                  var16 = 65;
                  break;
               case 4:
                  var16 = 65;
                  break;
               case 5:
                  var16 = 99;
                  break;
               default:
                  var16 = 66;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               c = GO.k;
               Z = com.LX.united;
               l = 1;
               q = new ImageIcon(com.BC.class.getResource(var0));
               d = Xg_2.U(q);
               W = true;
               p = true;
               x = 0;
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 114;
                  break;
               case 1:
                  var16 = 43;
                  break;
               case 2:
                  var16 = 26;
                  break;
               case 3:
                  var16 = 65;
                  break;
               case 4:
                  var16 = 65;
                  break;
               case 5:
                  var16 = 99;
                  break;
               default:
                  var16 = 66;
            }
         }
      }
   }
}





