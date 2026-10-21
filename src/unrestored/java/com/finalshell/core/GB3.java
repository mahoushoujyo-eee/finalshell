package com.finalshell.core;

import java.awt.image.BufferedImage;

public class GB3 extends HN3 {
   public int g = a(18594, 2900202558418253257L);
   public int e = a(32449, 5268810244770317229L);
   public int Z = -1;
   public int[] M;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      this.M = new int[a(1022, 3440763975392050832L)];
      String[] var3 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < a(6973, 1479743374306223701L)) {
            float var5 = (float)var4 / 127.0F;
            this.M[var4] = NM.n(var5, this.g, this.e);
            var4++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var4 = a(6516, 4501726301351453723L);
         break;
      }

      while (true) {
         if (var4 < a(6572, 4466801180826281158L)) {
            float var6 = (float)(var4 - a(1764, 6869513870636202893L)) / 128.0F;
            this.M[var4] = NM.n(var6, this.e, this.Z);
            var4++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var2 = super.filter(var1, var2);
         this.M = null;
         break;
      }

      return var2;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      return this.M[Iw4.g(var3)];
   }

   public void R(int var1) {
      this.g = var1;
   }

   public int p() {
      return this.g;
   }

   public void H(int var1) {
      this.e = var1;
   }

   public int c() {
      return this.e;
   }

   public void y(int var1) {
      this.Z = var1;
   }

   public int S() {
      return this.Z;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15722;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "/>+P_l 8#.KBqjB\u007fi".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 48;
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
         var10007 = 48;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 92;
               break;
            case 1:
               var50 = 97;
               break;
            case 2:
               var50 = 119;
               break;
            case 3:
               var50 = 15;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 47;
               break;
            default:
               var50 = 63;
         }
      } else {
         var34 = 48;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 759513339624490478L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "¶H\u0001f»\u000f (s\u0097*£\"Oð'=\u008a4õò?£;¢\u000b^\u0011¬\u009e¾\u001cS¹hÔ·I:~";
            int var13 = "¶H\u0001f»\u000f (s\u0097*£\"Oð'=\u008a4õò?£;¢\u000b^\u0011¬\u009e¾\u001cS¹hÔ·I:~".length();
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
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0080{P°ök!u\u0092ó\u009a8Ñ\u008cÎË";
                        var13 = "\u0080{P°ök!u\u0092ó\u009a8Ñ\u008cÎË".length();
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
         var10007 = 48;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 92;
               break;
            case 1:
               var50 = 97;
               break;
            case 2:
               var50 = 119;
               break;
            case 3:
               var50 = 15;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 47;
               break;
            default:
               var50 = 63;
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
                  var50 = 92;
                  break;
               case 1:
                  var50 = 97;
                  break;
               case 2:
                  var50 = 119;
                  break;
               case 3:
                  var50 = 15;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 47;
                  break;
               default:
                  var50 = 63;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 759513339624490478L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "¶H\u0001f»\u000f (s\u0097*£\"Oð'=\u008a4õò?£;¢\u000b^\u0011¬\u009e¾\u001cS¹hÔ·I:~";
               int var5 = "¶H\u0001f»\u000f (s\u0097*£\"Oð'=\u008a4õò?£;¢\u000b^\u0011¬\u009e¾\u001cS¹hÔ·I:~".length();
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
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0080{P°ök!u\u0092ó\u009a8Ñ\u008cÎË";
                           var5 = "\u0080{P°ök!u\u0092ó\u009a8Ñ\u008cÎË".length();
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
                  var50 = 92;
                  break;
               case 1:
                  var50 = 97;
                  break;
               case 2:
                  var50 = 119;
                  break;
               case 3:
                  var50 = 15;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 47;
                  break;
               default:
                  var50 = 63;
            }
         }
      }
   }
}





