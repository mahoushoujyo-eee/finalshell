package com.A;

import com.GO;
import com.SG;
import com.Xk_2;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;

public final class c_2 {
   public static Color G;
   public static Color Y;
   public static Color X;
   public static Color p;
   public static int i;
   public static int V;
   public static int e;
   public static Insets h;
   public static boolean W;
   public static ImageIcon K;
   public static int I;
   public static String P;
   public static boolean M;
   public static boolean Q;
   public static boolean z;
   public static boolean u;
   public static boolean A;
   public static boolean g;
   public static boolean R;
   public static Integer y;
   public static int T;
   public static Insets b;
   public static boolean o;
   public static boolean U;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012uT".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var36 = 88;
      char[] var10002 = var10003;
      int var21 = var10004;
      char[] var44;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var9;
         char var10008 = var10003[var9];
         var10007 = 88;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var52 = 106;
               break;
            case 1:
               var52 = 13;
               break;
            case 2:
               var52 = 44;
               break;
            case 3:
               var52 = 66;
               break;
            case 4:
               var52 = 9;
               break;
            case 5:
               var52 = 34;
               break;
            default:
               var52 = 67;
         }
      } else {
         var36 = 88;
         var21 = var10004;
         if (var10004 <= var9) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            String var19 = var41;
            long var11 = 4182493412644211633L;
            long[] var10 = new long[7];
            int var13 = 0;
            String var14 = "2\u0015Y\u0096X\u0011Ë¨¤GÖ\u0012X\u0011ËZí\u008eÎcX\u0011ËZiÀ¬ÒX\u0011ËEï6V\u008eX\u0011Ë¾";
            int var15 = "2\u0015Y\u0096X\u0011Ë¨¤GÖ\u0012X\u0011ËZí\u008eÎcX\u0011ËZiÀ¬ÒX\u0011ËEï6V\u008eX\u0011Ë¾".length();
            byte var12 = 0;

            label87:
            while (true) {
               var27 = var12;
               var12 += 8;
               byte[] var17 = var14.substring(var27, var12).getBytes("ISO-8859-1");
               long[] var20 = var10;
               var27 = var13++;
               long var34 = ((long)var17[0] & 255L) << 56
                  | ((long)var17[1] & 255L) << 48
                  | ((long)var17[2] & 255L) << 40
                  | ((long)var17[3] & 255L) << 32
                  | ((long)var17[4] & 255L) << 24
                  | ((long)var17[5] & 255L) << 16
                  | ((long)var17[6] & 255L) << 8
                  | (long)var17[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var11;
                  switch (var42) {
                     case 0:
                        var20[var27] = var50;
                        if (var12 >= var15) {
                           G = new Color((int)var10[6], (int)var10[3], (int)var10[3]);
                           Y = new Color((int)var10[1], (int)var10[2], (int)var10[2]);
                           X = GO.N;
                           p = GO.t;
                           i = Xk_2.R() ? (int)var10[0] : 0;
                           V = Xk_2.R() ? (int)var10[4] : 0;
                           e = Xk_2.R() ? GO.Y : 0;
                           h = new Insets(0, 0, 0, 0);
                           W = false;
                           K = null;
                           I = (int)var10[5];
                           P = var19;
                           M = true;
                           Q = true;
                           z = true;
                           u = true;
                           A = true;
                           g = true;
                           R = true;
                           y = null;
                           T = SG.d;
                           b = new Insets(1, 4, 1, 4);
                           o = true;
                           U = true;
                           return;
                        }
                        break;
                     default:
                        var20[var27] = var50;
                        if (var12 < var15) {
                           continue label87;
                        }

                        var14 = "æ\u0089-TX\u0011ËÕè\u009cËØX\u0011ËE";
                        var15 = "æ\u0089-TX\u0011ËÕè\u009cËØX\u0011ËE".length();
                        var12 = 0;
                  }

                  byte var30 = var12;
                  var12 += 8;
                  var17 = var14.substring(var30, var12).getBytes("ISO-8859-1");
                  var20 = var10;
                  var27 = var13++;
                  var34 = ((long)var17[0] & 255L) << 56
                     | ((long)var17[1] & 255L) << 48
                     | ((long)var17[2] & 255L) << 40
                     | ((long)var17[3] & 255L) << 32
                     | ((long)var17[4] & 255L) << 24
                     | ((long)var17[5] & 255L) << 16
                     | ((long)var17[6] & 255L) << 8
                     | (long)var17[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var9;
         char var53 = var10003[var9];
         var10007 = 88;
         var10006 = var53;
         switch (var9 % 7) {
            case 0:
               var52 = 106;
               break;
            case 1:
               var52 = 13;
               break;
            case 2:
               var52 = 44;
               break;
            case 3:
               var52 = 66;
               break;
            case 4:
               var52 = 9;
               break;
            case 5:
               var52 = 34;
               break;
            default:
               var52 = 67;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var9++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var9 % 7) {
               case 0:
                  var52 = 106;
                  break;
               case 1:
                  var52 = 13;
                  break;
               case 2:
                  var52 = 44;
                  break;
               case 3:
                  var52 = 66;
                  break;
               case 4:
                  var52 = 9;
                  break;
               case 5:
                  var52 = 34;
                  break;
               default:
                  var52 = 67;
            }
         } else {
            if (var21 <= var9) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               String var8 = var38;
               long var1 = 4182493412644211633L;
               long[] var0 = new long[7];
               int var4 = 0;
               String var5 = "2\u0015Y\u0096X\u0011Ë¨¤GÖ\u0012X\u0011ËZí\u008eÎcX\u0011ËZiÀ¬ÒX\u0011ËEï6V\u008eX\u0011Ë¾";
               int var6 = "2\u0015Y\u0096X\u0011Ë¨¤GÖ\u0012X\u0011ËZí\u008eÎcX\u0011ËZiÀ¬ÒX\u0011ËEï6V\u008eX\u0011Ë¾".length();
               byte var3 = 0;

               label53:
               while (true) {
                  var23 = var3;
                  var3 += 8;
                  byte[] var7 = var5.substring(var23, var3).getBytes("ISO-8859-1");
                  long[] var10000 = var0;
                  var23 = var4++;
                  long var32 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var39 = -1;

                  while (true) {
                     long var48 = var32 ^ var1;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var3 >= var6) {
                              G = new Color((int)var0[6], (int)var0[3], (int)var0[3]);
                              Y = new Color((int)var0[1], (int)var0[2], (int)var0[2]);
                              X = GO.N;
                              p = GO.t;
                              i = Xk_2.R() ? (int)var0[0] : 0;
                              V = Xk_2.R() ? (int)var0[4] : 0;
                              e = Xk_2.R() ? GO.Y : 0;
                              h = new Insets(0, 0, 0, 0);
                              W = false;
                              K = null;
                              I = (int)var0[5];
                              P = var8;
                              M = true;
                              Q = true;
                              z = true;
                              u = true;
                              A = true;
                              g = true;
                              R = true;
                              y = null;
                              T = SG.d;
                              b = new Insets(1, 4, 1, 4);
                              o = true;
                              U = true;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var3 < var6) {
                              continue label53;
                           }

                           var5 = "æ\u0089-TX\u0011ËÕè\u009cËØX\u0011ËE";
                           var6 = "æ\u0089-TX\u0011ËÕè\u009cËØX\u0011ËE".length();
                           var3 = 0;
                     }

                     byte var26 = var3;
                     var3 += 8;
                     var7 = var5.substring(var26, var3).getBytes("ISO-8859-1");
                     var10000 = var0;
                     var23 = var4++;
                     var32 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var39 = 0;
                  }
               }
            }

            var44 = var10002;
            var10005 = var9;
            char var54 = var10002[var9];
            var10007 = var36;
            var10006 = var54;
            switch (var9 % 7) {
               case 0:
                  var52 = 106;
                  break;
               case 1:
                  var52 = 13;
                  break;
               case 2:
                  var52 = 44;
                  break;
               case 3:
                  var52 = 66;
                  break;
               case 4:
                  var52 = 9;
                  break;
               case 5:
                  var52 = 34;
                  break;
               default:
                  var52 = 67;
            }
         }
      }
   }
}





