package com.finalshell.core;

public class Hw4 extends HN3 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Hw4() {
      this.O = true;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var10000 = W5.q();
      int var5 = var3 & a(6094, 7757355591516564419L);
      String[] var4 = var10000;
      int var6 = var3 >> a(6900, 2321147317950818044L) & a(30199, 6148820865973471742L);
      int var7 = var3 >> a(31189, 636125824812959199L) & a(24068, 1854120050932408840L);
      int var8 = var3 & a(24068, 1854120050932408840L);
      int var9 = a(30493, 4139943626883418902L);
      float var10 = 0.42F;
      var6 = (int)((float)var6 * var10) + var9;
      var7 = (int)((float)var7 * var10) + var9;
      var8 = (int)((float)var8 * var10) + var9;
      int var14 = var6;
      int var10001 = a(24068, 1854120050932408840L);
      if (var4 != null) {
         if (var6 > var10001) {
            var6 = a(24068, 1854120050932408840L);
         }

         var14 = var7;
         var10001 = a(24068, 1854120050932408840L);
      }

      if (var4 != null) {
         if (var14 > var10001) {
            var7 = a(24068, 1854120050932408840L);
         }

         var14 = var8;
         var10001 = a(24068, 1854120050932408840L);
      }

      if (var4 != null) {
         if (var14 > var10001) {
            var8 = a(24068, 1854120050932408840L);
         }

         var14 = var5 | var6 << a(23456, 424694068316727214L) | var7 << a(19690, 8972653595430285541L);
         var10001 = var8;
      }

      return var14 | var10001;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15372;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "N\u0005S\u0014\\\u00120J\u0018^\u0002\u000e.jy".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 54;
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
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 59;
               break;
            case 1:
               var50 = 92;
               break;
            case 2:
               var50 = 9;
               break;
            case 3:
               var50 = 77;
               break;
            case 4:
               var50 = 24;
               break;
            case 5:
               var50 = 87;
               break;
            default:
               var50 = 41;
         }
      } else {
         var34 = 54;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8584469709065234302L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "àúÒ\u008d\u0017.E\u0089¸\u008a>sZS\f½\u00adP{Ì\u0081ÔÀÀ\u008d\u0093<[!¯×\u0093!pÃ8Ä \u0001\u0092\u0006<¾û&4î\u007f";
            int var13 = "àúÒ\u008d\u0017.E\u0089¸\u008a>sZS\f½\u00adP{Ì\u0081ÔÀÀ\u008d\u0093<[!¯×\u0093!pÃ8Ä \u0001\u0092\u0006<¾û&4î\u007f".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "M\u0082\u0010°õ\u0082â©lQ}f\u009fhlþ";
                        var13 = "M\u0082\u0010°õ\u0082â©lQ}f\u009fhlþ".length();
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
         var10007 = 54;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 59;
               break;
            case 1:
               var50 = 92;
               break;
            case 2:
               var50 = 9;
               break;
            case 3:
               var50 = 77;
               break;
            case 4:
               var50 = 24;
               break;
            case 5:
               var50 = 87;
               break;
            default:
               var50 = 41;
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
                  var50 = 59;
                  break;
               case 1:
                  var50 = 92;
                  break;
               case 2:
                  var50 = 9;
                  break;
               case 3:
                  var50 = 77;
                  break;
               case 4:
                  var50 = 24;
                  break;
               case 5:
                  var50 = 87;
                  break;
               default:
                  var50 = 41;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8584469709065234302L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "àúÒ\u008d\u0017.E\u0089¸\u008a>sZS\f½\u00adP{Ì\u0081ÔÀÀ\u008d\u0093<[!¯×\u0093!pÃ8Ä \u0001\u0092\u0006<¾û&4î\u007f";
               int var5 = "àúÒ\u008d\u0017.E\u0089¸\u008a>sZS\f½\u00adP{Ì\u0081ÔÀÀ\u008d\u0093<[!¯×\u0093!pÃ8Ä \u0001\u0092\u0006<¾û&4î\u007f".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "M\u0082\u0010°õ\u0082â©lQ}f\u009fhlþ";
                           var5 = "M\u0082\u0010°õ\u0082â©lQ}f\u009fhlþ".length();
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
                  var50 = 59;
                  break;
               case 1:
                  var50 = 92;
                  break;
               case 2:
                  var50 = 9;
                  break;
               case 3:
                  var50 = 77;
                  break;
               case 4:
                  var50 = 24;
                  break;
               case 5:
                  var50 = 87;
                  break;
               default:
                  var50 = 41;
            }
         }
      }
   }
}





