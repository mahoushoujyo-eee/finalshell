package com.finalshell.core;

import java.awt.Color;
import javax.swing.ImageIcon;

public final class Lf4 {
   public static ImageIcon B;
   public static Color R;
   public static Color f;
   public static Color X;
   public static Color O;
   public static boolean k;
   public static boolean w;
   public static int t;
   public static int C;
   public static int Z;
   public static boolean I;
   public static boolean i;
   public static int r;
   public static boolean s;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "0lD/^{\u000b<bD3Tz\u00167h".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var36 = 62;
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
         var10007 = 62;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var52 = 103;
               break;
            case 1:
               var52 = 49;
               break;
            case 2:
               var52 = 21;
               break;
            case 3:
               var52 = 127;
               break;
            case 4:
               var52 = 19;
               break;
            case 5:
               var52 = 106;
               break;
            default:
               var52 = 88;
         }
      } else {
         var36 = 62;
         var21 = var10004;
         if (var10004 <= var9) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            String var19 = var41;
            long var11 = 2730180531605770268L;
            long[] var10 = new long[6];
            int var13 = 0;
            String var14 = "\n(ûÓw\f\u0090«9\u008eø¢w\f\u0093ô\u0007z¶Üw\f\u0090.xv\u009agw\f\u0090\u009e";
            int var15 = "\n(ûÓw\f\u0090«9\u008eø¢w\f\u0093ô\u0007z¶Üw\f\u0090.xv\u009agw\f\u0090\u009e".length();
            byte var12 = 0;

            label72:
            while (true) {
               var27 = var12;
               var12 += 8;
               byte[] var17 = var14.substring(var27, var12).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                           B = new ImageIcon(Lf4.class.getResource(var19));
                           R = Color.GRAY;
                           f = Color.LIGHT_GRAY;
                           X = new Color((int)var10[5], (int)var10[3], (int)var10[0]);
                           O = new Color(0, 0, (int)var10[4], (int)var10[2]);
                           k = GO.d;
                           w = true;
                           t = GO.FH;
                           C = GO.FG;
                           Z = GO.Fx;
                           I = true;
                           i = true;
                           r = (int)var10[1];
                           s = true;
                           return;
                        }
                        break;
                     default:
                        var20[var27] = var50;
                        if (var12 < var15) {
                           continue label72;
                        }

                        var14 = "0\u0007uOw\f\u0090ã=.âów\f\u0090\u009e";
                        var15 = "0\u0007uOw\f\u0090ã=.âów\f\u0090\u009e".length();
                        var12 = 0;
                  }

                  byte var30 = var12;
                  var12 += 8;
                  var17 = var14.substring(var30, var12).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
         var10007 = 62;
         var10006 = var53;
         switch (var9 % 7) {
            case 0:
               var52 = 103;
               break;
            case 1:
               var52 = 49;
               break;
            case 2:
               var52 = 21;
               break;
            case 3:
               var52 = 127;
               break;
            case 4:
               var52 = 19;
               break;
            case 5:
               var52 = 106;
               break;
            default:
               var52 = 88;
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
                  var52 = 103;
                  break;
               case 1:
                  var52 = 49;
                  break;
               case 2:
                  var52 = 21;
                  break;
               case 3:
                  var52 = 127;
                  break;
               case 4:
                  var52 = 19;
                  break;
               case 5:
                  var52 = 106;
                  break;
               default:
                  var52 = 88;
            }
         } else {
            if (var21 <= var9) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               String var8 = var38;
               long var1 = 2730180531605770268L;
               long[] var0 = new long[6];
               int var4 = 0;
               String var5 = "\n(ûÓw\f\u0090«9\u008eø¢w\f\u0093ô\u0007z¶Üw\f\u0090.xv\u009agw\f\u0090\u009e";
               int var6 = "\n(ûÓw\f\u0090«9\u008eø¢w\f\u0093ô\u0007z¶Üw\f\u0090.xv\u009agw\f\u0090\u009e".length();
               byte var3 = 0;

               label38:
               while (true) {
                  var23 = var3;
                  var3 += 8;
                  byte[] var7 = var5.substring(var23, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                              B = new ImageIcon(Lf4.class.getResource(var8));
                              R = Color.GRAY;
                              f = Color.LIGHT_GRAY;
                              X = new Color((int)var0[5], (int)var0[3], (int)var0[0]);
                              O = new Color(0, 0, (int)var0[4], (int)var0[2]);
                              k = GO.d;
                              w = true;
                              t = GO.FH;
                              C = GO.FG;
                              Z = GO.Fx;
                              I = true;
                              i = true;
                              r = (int)var0[1];
                              s = true;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var3 < var6) {
                              continue label38;
                           }

                           var5 = "0\u0007uOw\f\u0090ã=.âów\f\u0090\u009e";
                           var6 = "0\u0007uOw\f\u0090ã=.âów\f\u0090\u009e".length();
                           var3 = 0;
                     }

                     byte var26 = var3;
                     var3 += 8;
                     var7 = var5.substring(var26, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                  var52 = 103;
                  break;
               case 1:
                  var52 = 49;
                  break;
               case 2:
                  var52 = 21;
                  break;
               case 3:
                  var52 = 127;
                  break;
               case 4:
                  var52 = 19;
                  break;
               case 5:
                  var52 = 106;
                  break;
               default:
                  var52 = 88;
            }
         }
      }
   }
}





