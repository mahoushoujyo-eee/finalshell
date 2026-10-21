package com.finalshell.core;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;

public final class Z {
   public static ImageIcon W;
   public static ImageIcon X;
   public static int Q;
   public static boolean e;
   public static boolean i;
   public static Color c;
   public static boolean F;
   public static Color a;
   public static Color E;
   public static int P;
   public static int N;
   public static boolean s;
   public static int v;
   public static Insets k;
   public static boolean m;
   public static boolean K;
   public static boolean L;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "xo\u001aJ6~jc~\u001aSk!ev".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var36 = 100;
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
         var10007 = 100;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var52 = 117;
               break;
            case 1:
               var52 = 104;
               break;
            case 2:
               var52 = 17;
               break;
            case 3:
               var52 = 64;
               break;
            case 4:
               var52 = 33;
               break;
            case 5:
               var52 = 53;
               break;
            default:
               var52 = 111;
         }
      } else {
         var36 = 100;
         var21 = var10004;
         if (var10004 <= var9) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            String var19 = var41;
            long var11 = 365858652311201308L;
            long[] var10 = new long[11];
            int var13 = 0;
            String var14 = "ûK>b\u0081\u0003&\u0018s\u009a\u0003ö\u0081\u0003&Ø,îÝf\u0081\u0003&¦¸\u0095 \u001e\u0081\u0003&É<t¿´\u0081\u0003&Ì\u0017ÍÊ\u0000\u0081\u0003&Ã\fNsm\u0081\u0003&Ú<*QG\u0081\u0003&À\u009a±º\u000b\u0081\u0003&Ì";
            int var15 = "ûK>b\u0081\u0003&\u0018s\u009a\u0003ö\u0081\u0003&Ø,îÝf\u0081\u0003&¦¸\u0095 \u001e\u0081\u0003&É<t¿´\u0081\u0003&Ì\u0017ÍÊ\u0000\u0081\u0003&Ã\fNsm\u0081\u0003&Ú<*QG\u0081\u0003&À\u009a±º\u000b\u0081\u0003&Ì"
               .length();
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
                           W = new ImageIcon(Z.class.getResource(var19));
                           X = Xg2.r(W);
                           Q = (int)var10[9];
                           e = GO.d;
                           i = true;
                           c = new Color((int)var10[5], (int)var10[7], (int)var10[3]);
                           F = true;
                           a = new Color((int)var10[8], (int)var10[4], (int)var10[6]);
                           E = new Color((int)var10[10], (int)var10[1], (int)var10[2]);
                           P = GO.Fx;
                           N = GO.FG;
                           s = true;
                           v = (int)var10[0];
                           k = new Insets(0, 1, 0, 1);
                           m = false;
                           K = false;
                           L = false;
                           return;
                        }
                        break;
                     default:
                        var20[var27] = var50;
                        if (var12 < var15) {
                           continue label72;
                        }

                        var14 = ":Ùk\u009e\u0081\u0003&\u001f\u008d\u008b\u0093j\u0081\u0003&Ø";
                        var15 = ":Ùk\u009e\u0081\u0003&\u001f\u008d\u008b\u0093j\u0081\u0003&Ø".length();
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
         var10007 = 100;
         var10006 = var53;
         switch (var9 % 7) {
            case 0:
               var52 = 117;
               break;
            case 1:
               var52 = 104;
               break;
            case 2:
               var52 = 17;
               break;
            case 3:
               var52 = 64;
               break;
            case 4:
               var52 = 33;
               break;
            case 5:
               var52 = 53;
               break;
            default:
               var52 = 111;
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
                  var52 = 117;
                  break;
               case 1:
                  var52 = 104;
                  break;
               case 2:
                  var52 = 17;
                  break;
               case 3:
                  var52 = 64;
                  break;
               case 4:
                  var52 = 33;
                  break;
               case 5:
                  var52 = 53;
                  break;
               default:
                  var52 = 111;
            }
         } else {
            if (var21 <= var9) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               String var8 = var38;
               long var1 = 365858652311201308L;
               long[] var0 = new long[11];
               int var4 = 0;
               String var5 = "ûK>b\u0081\u0003&\u0018s\u009a\u0003ö\u0081\u0003&Ø,îÝf\u0081\u0003&¦¸\u0095 \u001e\u0081\u0003&É<t¿´\u0081\u0003&Ì\u0017ÍÊ\u0000\u0081\u0003&Ã\fNsm\u0081\u0003&Ú<*QG\u0081\u0003&À\u009a±º\u000b\u0081\u0003&Ì";
               int var6 = "ûK>b\u0081\u0003&\u0018s\u009a\u0003ö\u0081\u0003&Ø,îÝf\u0081\u0003&¦¸\u0095 \u001e\u0081\u0003&É<t¿´\u0081\u0003&Ì\u0017ÍÊ\u0000\u0081\u0003&Ã\fNsm\u0081\u0003&Ú<*QG\u0081\u0003&À\u009a±º\u000b\u0081\u0003&Ì"
                  .length();
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
                              W = new ImageIcon(Z.class.getResource(var8));
                              X = Xg2.r(W);
                              Q = (int)var0[9];
                              e = GO.d;
                              i = true;
                              c = new Color((int)var0[5], (int)var0[7], (int)var0[3]);
                              F = true;
                              a = new Color((int)var0[8], (int)var0[4], (int)var0[6]);
                              E = new Color((int)var0[10], (int)var0[1], (int)var0[2]);
                              P = GO.Fx;
                              N = GO.FG;
                              s = true;
                              v = (int)var0[0];
                              k = new Insets(0, 1, 0, 1);
                              m = false;
                              K = false;
                              L = false;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var3 < var6) {
                              continue label38;
                           }

                           var5 = ":Ùk\u009e\u0081\u0003&\u001f\u008d\u008b\u0093j\u0081\u0003&Ø";
                           var6 = ":Ùk\u009e\u0081\u0003&\u001f\u008d\u008b\u0093j\u0081\u0003&Ø".length();
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
                  var52 = 117;
                  break;
               case 1:
                  var52 = 104;
                  break;
               case 2:
                  var52 = 17;
                  break;
               case 3:
                  var52 = 64;
                  break;
               case 4:
                  var52 = 33;
                  break;
               case 5:
                  var52 = 53;
                  break;
               default:
                  var52 = 111;
            }
         }
      }
   }
}





