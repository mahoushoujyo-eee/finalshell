package com;

import java.awt.Insets;
import javax.swing.ImageIcon;

public final class YA {
   public static boolean K;
   public static ImageIcon C;
   public static ImageIcon h;
   public static Insets W;
   public static boolean o;
   public static boolean x;
   public static int i;
   public static int w;
   public static Insets V;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "!N1\u000f\u0010Gz:_1\u0016M\u0018u/".toCharArray();
      int var10004 = var10003.length;
      int var5 = 0;
      byte var18 = 126;
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
         var10007 = 126;
         var10006 = var10008;
         switch (var5 % 7) {
            case 0:
               var26 = 54;
               break;
            case 1:
               var26 = 83;
               break;
            case 2:
               var26 = 32;
               break;
            case 3:
               var26 = 31;
               break;
            case 4:
               var26 = 29;
               break;
            case 5:
               var26 = 22;
               break;
            default:
               var26 = 101;
         }
      } else {
         var18 = 126;
         var9 = var10004;
         if (var10004 <= var5) {
            String var21 = new String(var10003).intern();
            byte var13 = -1;
            String var8 = var21;
            long var7 = 3712003134524243216L;
            long var17 = -5150667777761854188L ^ var7;
            var13 = -1;
            long var6 = var17;
            K = GO.k;
            C = new ImageIcon(com.k3_2.class.getResource(var8));
            h = Xg_2.r(C);
            W = new Insets(5, 5, 5, 5);
            o = true;
            x = true;
            i = (int)var6;
            w = 1;
            V = new Insets(0, 0, 0, 0);
            return;
         }

         var22 = var10003;
         var10005 = var5;
         char var27 = var10003[var5];
         var10007 = 126;
         var10006 = var27;
         switch (var5 % 7) {
            case 0:
               var26 = 54;
               break;
            case 1:
               var26 = 83;
               break;
            case 2:
               var26 = 32;
               break;
            case 3:
               var26 = 31;
               break;
            case 4:
               var26 = 29;
               break;
            case 5:
               var26 = 22;
               break;
            default:
               var26 = 101;
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
                  var26 = 54;
                  break;
               case 1:
                  var26 = 83;
                  break;
               case 2:
                  var26 = 32;
                  break;
               case 3:
                  var26 = 31;
                  break;
               case 4:
                  var26 = 29;
                  break;
               case 5:
                  var26 = 22;
                  break;
               default:
                  var26 = 101;
            }
         } else {
            if (var9 <= var5) {
               String var20 = new String(var10002).intern();
               byte var11 = -1;
               String var4 = var20;
               long var2 = 3712003134524243216L;
               long var16 = -5150667777761854188L ^ var2;
               var11 = -1;
               long var0 = var16;
               K = GO.k;
               C = new ImageIcon(com.k3_2.class.getResource(var4));
               h = Xg_2.r(C);
               W = new Insets(5, 5, 5, 5);
               o = true;
               x = true;
               i = (int)var0;
               w = 1;
               V = new Insets(0, 0, 0, 0);
               return;
            }

            var22 = var10002;
            var10005 = var5;
            char var28 = var10002[var5];
            var10007 = var18;
            var10006 = var28;
            switch (var5 % 7) {
               case 0:
                  var26 = 54;
                  break;
               case 1:
                  var26 = 83;
                  break;
               case 2:
                  var26 = 32;
                  break;
               case 3:
                  var26 = 31;
                  break;
               case 4:
                  var26 = 29;
                  break;
               case 5:
                  var26 = 22;
                  break;
               default:
                  var26 = 101;
            }
         }
      }
   }
}





