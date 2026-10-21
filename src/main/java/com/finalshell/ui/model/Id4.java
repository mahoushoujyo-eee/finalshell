package com.finalshell.ui.model;

public final class Id4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Id4 circe;
   public static Id4 facebook;
   public static Id4 roller;
   public static Id4 arrows;
   public static Id4 indicator;
   public static Id4 snake;
   public static Id4 none;
   public static long[] a;
   public static Integer[] b;

   public static Id4[] values() {
      return (Id4[])c.clone();
   }

   public static Id4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Id4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25740;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var8 = new String[7];
      int var12 = 0;
      String var11 = "(r]P7\u00058uNX7\u00069tC_7_\u0006*i]\\%^\b-zLV0Bz ";
      int var13 = "(r]P7\u00058uNX7\u00069tC_7_\u0006*i]\\%^\b-zLV0Bz ".length();
      char var10 = 5;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 86;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 29;
                        break;
                     case 1:
                        var58 = 77;
                        break;
                     case 2:
                        var58 = 121;
                        break;
                     case 3:
                        var58 = 101;
                        break;
                     case 4:
                        var58 = 4;
                        break;
                     case 5:
                        var58 = 123;
                        break;
                     default:
                        var58 = 67;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var39;
                  if ((var16 += var10) >= var13) {
                     long var0 = 277624548844636480L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0098Ø\t\u009eÀ\u009aíÒ\u0091&¦K®4z\u001df¬\n\u0096Óï/\u0092";
                     int var5 = "\u0098Ø\t\u009eÀ\u009aíÒ\u0091&¦K®4z\u001df¬\n\u0096Óï/\u0092".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     a = var6;
                     b = new Integer[3];
                     circe = new Id4(var8[0], 0);
                     facebook = new Id4(var8[4], 1);
                     roller = new Id4(var8[2], 2);
                     arrows = new Id4(var8[3], 3);
                     indicator = new Id4(var8[5], 4);
                     snake = new Id4(var8[1], 5);
                     none = new Id4(var8[6], a(24, 7509580539788715156L));
                     c = s();
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var39;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label61;
                  }

                  var11 = "<kUD/R\u007f:w\u0004;j_H";
                  var13 = "<kUD/R\u007f:w\u0004;j_H".length();
                  var10 = '\t';
                  var16 = -1;
            }

            var10000 = 72;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}







