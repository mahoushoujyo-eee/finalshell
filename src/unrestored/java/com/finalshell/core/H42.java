package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.util.Random;

public class H42 extends HN3 {
   public float z = 1.0F;
   public float k = 0.0F;
   public float t;
   public float A;
   public Random n;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void J(float var1) {
      this.z = var1;
   }

   public float n() {
      return this.z;
   }

   public void V(float var1) {
      this.k = var1;
   }

   public float L() {
      return this.k;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      float var3 = (1.0F - this.z) * (1.0F + this.k);
      this.t = var3 - this.k;
      this.A = var3;
      this.n = new Random(0L);
      return super.filter(var1, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 >> a(4034, 3521979274267364896L) & a(8595, 8191003487376547955L);
      float var5 = this.n.nextFloat();
      float var6 = NM.k(this.t, this.A, var5);
      return (int)((float)var4 * var6) << a(22580, 7209530937309977047L) | var3 & a(11002, 7626885432755661595L);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 483;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u00045\u001fZd3`x\u0005\u000fE~&i!$H\u0018#".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 18;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 18;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 69;
               break;
            case 1:
               var50 = 83;
               break;
            case 2:
               var50 = 116;
               break;
            case 3:
               var50 = 36;
               break;
            case 4:
               var50 = 31;
               break;
            case 5:
               var50 = 91;
               break;
            default:
               var50 = 23;
         }
      } else {
         var34 = 18;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6466965829329417968L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "\u008eÈ$d\u0014H/?\u009c\u0004=çÛ:xÈ";
            int var13 = "\u008eÈ$d\u0014H/?\u009c\u0004=çÛ:xÈ".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u008b\u007fécå;¢\u0014 ÆÓ\u000e¤ÔV|";
                        var13 = "\u008b\u007fécå;¢\u0014 ÆÓ\u000e¤ÔV|".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 18;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 69;
               break;
            case 1:
               var50 = 83;
               break;
            case 2:
               var50 = 116;
               break;
            case 3:
               var50 = 36;
               break;
            case 4:
               var50 = 31;
               break;
            case 5:
               var50 = 91;
               break;
            default:
               var50 = 23;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 69;
                  break;
               case 1:
                  var50 = 83;
                  break;
               case 2:
                  var50 = 116;
                  break;
               case 3:
                  var50 = 36;
                  break;
               case 4:
                  var50 = 31;
                  break;
               case 5:
                  var50 = 91;
                  break;
               default:
                  var50 = 23;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6466965829329417968L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "\u008eÈ$d\u0014H/?\u009c\u0004=çÛ:xÈ";
               int var5 = "\u008eÈ$d\u0014H/?\u009c\u0004=çÛ:xÈ".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u008b\u007fécå;¢\u0014 ÆÓ\u000e¤ÔV|";
                           var5 = "\u008b\u007fécå;¢\u0014 ÆÓ\u000e¤ÔV|".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 69;
                  break;
               case 1:
                  var50 = 83;
                  break;
               case 2:
                  var50 = 116;
                  break;
               case 3:
                  var50 = 36;
                  break;
               case 4:
                  var50 = 31;
                  break;
               case 5:
                  var50 = 91;
                  break;
               default:
                  var50 = 23;
            }
         }
      }
   }
}





