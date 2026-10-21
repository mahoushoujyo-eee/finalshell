package com.finalshell.core;

import com.finalshell.ui.model.Py4;
import java.awt.geom.AffineTransform;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public final class DE {
   public static List o;
   public static Q5 F;
   public static R2_2 I;
   public static H3 Y;
   public static F3_2 W;
   public static U3_2 Z;
   public static O3_2 S;
   public static F3_2 t;
   public static List d;
   public static Py4 n;
   public static AffineTransform m;
   public static AffineTransform s;
   public static AffineTransform A;
   public static boolean K;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var31;
      String[] var8 = new String[8];
      int var12 = 0;
      String var11 = "Y\u0019\u0000\u000f\u0004R\u0019\u000b\u000f\u0003Y\u0019\u0002\bY\u0019\u0000\u000fY\u000fV\u0003\u0003C\u0007\u0002\u0003T\u0000\u0003";
      int var13 = "Y\u0019\u0000\u000f\u0004R\u0019\u000b\u000f\u0003Y\u0019\u0002\bY\u0019\u0000\u000fY\u000fV\u0003\u0003C\u0007\u0002\u0003T\u0000\u0003"
         .length();
      char var10 = 4;
      int var16 = -1;

      label63:
      while (true) {
         byte var10000 = 58;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
            label58: {
               char[] var35 = var10001.toCharArray();
               int var10004 = var35.length;
               int var14 = 0;
               byte var38 = var10000;
               var31 = var35;
               int var23 = var10004;
               byte var44;
               char[] var49;
               int var10006;
               if (var10004 <= 1) {
                  var49 = var35;
                  var44 = var10000;
                  var10006 = var14;
               } else {
                  var38 = var10000;
                  var23 = var10004;
                  if (var10004 <= var14) {
                     break label58;
                  }

                  var49 = var35;
                  var44 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var58 = var49[var10006];
                  byte var59;
                  switch (var14 % 7) {
                     case 0:
                        var59 = 9;
                        break;
                     case 1:
                        var59 = 83;
                        break;
                     case 2:
                        var59 = 95;
                        break;
                     case 3:
                        var59 = 82;
                        break;
                     case 4:
                        var59 = 81;
                        break;
                     case 5:
                        var59 = 5;
                        break;
                     default:
                        var59 = 92;
                  }

                  var49[var10006] = (char)(var58 ^ var44 ^ var59);
                  var14++;
                  if (var38 == 0) {
                     var10006 = var38;
                     var49 = var31;
                     var44 = var38;
                  } else {
                     if (var23 <= var14) {
                        break;
                     }

                     var49 = var31;
                     var44 = var38;
                     var10006 = var14;
                  }
               }
            }

            String var40 = new String(var31).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var40;
                  if ((var16 += var10) >= var13) {
                     long var1 = 3167877046134569485L;
                     long[] var0 = new long[3];
                     int var4 = 0;
                     String var5 = "(\u008fWÙªöú\u0005Ì\u001bP@ªöú\u000b\u0088á:°ªöú\n";
                     int var6 = "(\u008fWÙªöú\u0005Ì\u001bP@ªöú\u000b\u0088á:°ªöú\n".length();
                     byte var3 = 0;

                     do {
                        byte var25 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var25, var3).getBytes("ISO-8859-1");
                        int var26 = var4++;
                        long var48 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var1;
                        byte var41 = -1;
                        var0[var26] = var48;
                     } while (var3 < var6);

                     String[] var18 = new String[(int)var0[0]];
                     var18[0] = var8[4];
                     var18[1] = var8[1];
                     var18[2] = var8[5];
                     var18[3] = var8[6];
                     var18[4] = var8[2];
                     var18[5] = var8[0];
                     var18[(int)var0[1]] = var8[3];
                     var18[(int)var0[2]] = var8[7];
                     o = Arrays.asList(var18);
                     F = new Q5();
                     I = new R2_2();
                     Y = new H3();
                     W = new F3_2(com.finalshell.ui.model.A_3.AND, new FileFilter[]{Y, I});
                     Z = new U3_2();
                     S = new O3_2();
                     t = new F3_2(com.finalshell.ui.model.A_3.OR, new FileFilter[]{S, Y});
                     d = Arrays.asList(F, t, Y);
                     n = new Py4();
                     m = new AffineTransform();
                     s = new AffineTransform();
                     A = new AffineTransform();
                     m.translate(1.0, 0.0);
                     s.translate(0.0, 1.0);
                     A.translate(1.0, 1.0);
                     K = false;
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var40;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label63;
                  }

                  var11 = "\u001eB@B\u0003\u001dHY";
                  var13 = "\u001eB@B\u0003\u001dHY".length();
                  var10 = 4;
                  var16 = -1;
            }

            var10000 = 118;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}





