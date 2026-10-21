package com;

import java.awt.Color;
import java.util.Random;

public class iw_4 {
   private static Random j;
   private static final float[] G;
   private static final float[] Z;
   private static final long[] a;
   private static final Integer[] b;

   public static int e(int var0) {
      String[] var1 = com.W5.q();
      int var10000 = var0;
      if (var1 != null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 != null) {
         if (var10000 > a(14307, 4846701457283360350L)) {
            return a(14307, 4846701457283360350L);
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static int h(int var0, int var1, float var2) {
      return e((int)((float)var0 + var2 * (float)(var1 - var0)));
   }

   public static int g(int var0) {
      int var1 = var0 >> a(7715, 8804303839714414495L) & a(14307, 4846701457283360350L);
      int var2 = var0 >> a(18729, 7050251373656070288L) & a(14307, 4846701457283360350L);
      int var3 = var0 & a(14307, 4846701457283360350L);
      return (var1 + var2 + var3) / 3;
   }

   public static boolean k(int var0, int var1, int var2) {
      int var4 = var0 >> a(7715, 8804303839714414495L) & a(14307, 4846701457283360350L);
      String[] var10000 = com.W5.q();
      int var5 = var0 >> a(18729, 7050251373656070288L) & a(14307, 4846701457283360350L);
      int var6 = var0 & a(14307, 4846701457283360350L);
      String[] var3 = var10000;
      int var7 = var1 >> a(7715, 8804303839714414495L) & a(14307, 4846701457283360350L);
      int var8 = var1 >> a(18729, 7050251373656070288L) & a(14307, 4846701457283360350L);
      int var9 = var1 & a(14307, 4846701457283360350L);
      int var10 = Math.abs(var4 - var7);
      int var10001 = var2;
      if (var3 != null) {
         if (var10 > var2) {
            return (boolean)0;
         }

         var10 = Math.abs(var5 - var8);
         var10001 = var2;
      }

      if (var3 != null) {
         if (var10 > var10001) {
            return (boolean)0;
         }

         var10 = Math.abs(var6 - var9);
         if (var3 == null) {
            return (boolean)var10;
         }

         var10001 = var2;
      }

      return (boolean)(var10 <= var10001 ? 1 : 0);
   }

   public static int P(int var0, int var1, int var2) {
      return k(var0, var1, var2, a(14307, 4846701457283360350L));
   }

   public static int C(int var0, int var1, int var2, int var3, int var4) {
      return var1 & ~var4 | k(var0 & var4, var1, var2, var3);
   }

   public static int k(int var0, int var1, int var2, int var3) {
      String[] var4 = com.W5.q();
      int var10000 = var2;
      if (var4 != null) {
         if (var2 == 0) {
            return var0;
         }

         var10000 = var0 >> a(9957, 7743417918229100379L) & a(28695, 8598715152498876840L);
      }

      int var5;
      int var9;
      int var10;
      int var11;
      int var12;
      label124: {
         int var6;
         int var7;
         int var8;
         int var10001;
         label106: {
            var5 = var10000;
            var6 = var0 >> a(31874, 8708818097337920826L) & a(14307, 4846701457283360350L);
            var7 = var0 >> a(24587, 498171304907665840L) & a(14307, 4846701457283360350L);
            var8 = var0 & a(14307, 4846701457283360350L);
            var9 = var1 >> a(3903, 7630036680522735237L) & a(14307, 4846701457283360350L);
            var10 = var1 >> a(7715, 8804303839714414495L) & a(14307, 4846701457283360350L);
            var11 = var1 >> a(18729, 7050251373656070288L) & a(14307, 4846701457283360350L);
            var12 = var1 & a(14307, 4846701457283360350L);
            var10000 = var2;
            if (var4 != null) {
               label103: {
                  label102: {
                     switch (var2) {
                        case 1:
                           if (var4 != null) {
                              break label103;
                           }
                        case 2:
                           var6 = Math.min(var6, var10);
                           var7 = Math.min(var7, var11);
                           var8 = Math.min(var8, var12);
                           if (var4 != null) {
                              break label103;
                           }
                        case 3:
                           var6 = Math.max(var6, var10);
                           var7 = Math.max(var7, var11);
                           var8 = Math.max(var8, var12);
                           if (var4 != null) {
                              break label103;
                           }
                        case 4:
                           var6 = e(var6 + var10);
                           var7 = e(var7 + var11);
                           var8 = e(var8 + var12);
                           if (var4 != null) {
                              break label103;
                           }
                        case 5:
                           var6 = e(var10 - var6);
                           var7 = e(var11 - var7);
                           var8 = e(var12 - var8);
                           if (var4 != null) {
                              break label103;
                           }
                        case 6:
                           var6 = e(Math.abs(var6 - var10));
                           var7 = e(Math.abs(var7 - var11));
                           var8 = e(Math.abs(var8 - var12));
                           if (var4 != null) {
                              break label103;
                           }
                        case 7:
                           var6 = e(var6 * var10 / a(14307, 4846701457283360350L));
                           var7 = e(var7 * var11 / a(14307, 4846701457283360350L));
                           var8 = e(var8 * var12 / a(14307, 4846701457283360350L));
                           if (var4 != null) {
                              break label103;
                           }
                        case 17:
                           var10000 = j.nextInt() & a(14307, 4846701457283360350L);
                           var10001 = var5;
                           if (var4 == null) {
                              break label106;
                           }

                           if (var10000 > var5) {
                              break label103;
                           }

                           var6 = var10;
                           var7 = var11;
                           var8 = var12;
                           if (var4 != null) {
                              break label103;
                           }
                        case 13:
                           var6 = (var6 + var10) / 2;
                           var7 = (var7 + var11) / 2;
                           var8 = (var8 + var12) / 2;
                           if (var4 != null) {
                              break label103;
                           }
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                           Color.RGBtoHSB(var6, var7, var8, G);
                           Color.RGBtoHSB(var10, var11, var12, Z);
                           var10000 = var2;
                           if (var4 != null) {
                              switch (var2) {
                                 case 8:
                                    Z[0] = G[0];
                                    if (var4 != null) {
                                       break;
                                    }
                                 case 9:
                                    Z[1] = G[1];
                                    if (var4 != null) {
                                       break;
                                    }
                                 case 10:
                                    Z[2] = G[2];
                                    if (var4 != null) {
                                       break;
                                    }
                                 case 11:
                                    Z[0] = G[0];
                                    Z[1] = G[1];
                              }

                              var0 = Color.HSBtoRGB(Z[0], Z[1], Z[2]);
                              var6 = var0 >> a(7715, 8804303839714414495L) & a(14307, 4846701457283360350L);
                              var7 = var0 >> a(18729, 7050251373656070288L) & a(14307, 4846701457283360350L);
                              var10000 = var0 & a(14307, 4846701457283360350L);
                           }

                           var8 = var10000;
                           if (var4 != null) {
                              break label103;
                           }
                        case 12:
                           var6 = a(14307, 4846701457283360350L)
                              - (a(14307, 4846701457283360350L) - var6) * (a(14307, 4846701457283360350L) - var10) / a(14307, 4846701457283360350L);
                           var7 = a(14307, 4846701457283360350L)
                              - (a(14307, 4846701457283360350L) - var7) * (a(14307, 4846701457283360350L) - var11) / a(14307, 4846701457283360350L);
                           var8 = a(14307, 4846701457283360350L)
                              - (a(14307, 4846701457283360350L) - var8) * (a(14307, 4846701457283360350L) - var12) / a(14307, 4846701457283360350L);
                           if (var4 != null) {
                              break label103;
                           }
                        case 14:
                           break;
                        case 15:
                           break label102;
                        case 16:
                        default:
                           break label103;
                        case 18:
                           break label124;
                        case 19:
                           var5 = var5 * var9 / a(14307, 4846701457283360350L);
                           return var5 << a(3903, 7630036680522735237L)
                              | var10 << a(7715, 8804303839714414495L)
                              | var11 << a(18729, 7050251373656070288L)
                              | var12;
                        case 20:
                           int var15 = a(14307, 4846701457283360350L) - var5;
                           return var5 << a(3903, 7630036680522735237L)
                              | var15 << a(7715, 8804303839714414495L)
                              | var15 << a(18729, 7050251373656070288L)
                              | var15;
                     }

                     int var14 = a(14307, 4846701457283360350L)
                        - (a(14307, 4846701457283360350L) - var6) * (a(14307, 4846701457283360350L) - var10) / a(14307, 4846701457283360350L);
                     int var13 = var6 * var10 / a(14307, 4846701457283360350L);
                     var6 = (var14 * var6 + var13 * (a(14307, 4846701457283360350L) - var6)) / a(14307, 4846701457283360350L);
                     var14 = a(14307, 4846701457283360350L)
                        - (a(14307, 4846701457283360350L) - var7) * (a(14307, 4846701457283360350L) - var11) / a(14307, 4846701457283360350L);
                     var13 = var7 * var11 / a(14307, 4846701457283360350L);
                     var7 = (var14 * var7 + var13 * (a(14307, 4846701457283360350L) - var7)) / a(14307, 4846701457283360350L);
                     var14 = a(14307, 4846701457283360350L)
                        - (a(14307, 4846701457283360350L) - var8) * (a(14307, 4846701457283360350L) - var12) / a(14307, 4846701457283360350L);
                     var13 = var8 * var12 / a(14307, 4846701457283360350L);
                     var8 = (var14 * var8 + var13 * (a(14307, 4846701457283360350L) - var8)) / a(14307, 4846701457283360350L);
                     if (var4 != null) {
                        break label103;
                     }
                  }

                  var6 = var7 = var8 = a(14307, 4846701457283360350L);
                  if (var4 == null) {
                     break label124;
                  }
               }

               var10000 = var3;
            }

            var10001 = a(14307, 4846701457283360350L);
         }

         if (var4 != null) {
            if (var10000 == var10001) {
               var10001 = a(14307, 4846701457283360350L);
               if (var4 == null) {
                  return var5 | var10001;
               }

               if (var5 == var10001) {
                  return var5 << a(3903, 7630036680522735237L) | var6 << a(7715, 8804303839714414495L) | var7 << a(18729, 7050251373656070288L) | var8;
               }
            }

            var5 = var5 * var3 / a(14307, 4846701457283360350L);
            var10000 = (a(14307, 4846701457283360350L) - var5) * var9;
            var10001 = a(14307, 4846701457283360350L);
         }

         int var24 = var10000 / var10001;
         var6 = e((var6 * var5 + var10 * var24) / a(14307, 4846701457283360350L));
         var7 = e((var7 * var5 + var11 * var24) / a(14307, 4846701457283360350L));
         var8 = e((var8 * var5 + var12 * var24) / a(14307, 4846701457283360350L));
         var5 = e(var5 + var24);
         return var5 << a(3903, 7630036680522735237L) | var6 << a(7715, 8804303839714414495L) | var7 << a(18729, 7050251373656070288L) | var8;
      }

      int var19 = e(var10 * var5 / a(14307, 4846701457283360350L));
      int var20 = e(var11 * var5 / a(14307, 4846701457283360350L));
      int var21 = e(var12 * var5 / a(14307, 4846701457283360350L));
      var5 = e(var9 * var5 / a(14307, 4846701457283360350L));
      return var5 << a(3903, 7630036680522735237L) | var19 << a(7715, 8804303839714414495L) | var20 << a(18729, 7050251373656070288L) | var21;
   }

   static {
      long var0 = 2466185119551452465L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u0099\u0002ñNSg\u0084\u0089U:#\u0010¬õë¬Ò»ïÛþÍ-©¼ë\u0016\u0014Ðf\u0018\u001bN\u0016^\u000fLA\u0014f¡\u0001\u009aì:GBr";
      int var5 = "\u0099\u0002ñNSg\u0084\u0089U:#\u0010¬õë¬Ò»ïÛþÍ-©¼ë\u0016\u0014Ðf\u0018\u001bN\u0016^\u000fLA\u0014f¡\u0001\u009aì:GBr".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[8];
                     j = new Random();
                     G = new float[3];
                     Z = new float[3];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ú\u0088´ú$\u0089Ó\u0090)«\u008aÂ-þú¾";
                  var5 = "Ú\u0088´ú$\u0089Ó\u0090)«\u008aÂ-þú¾".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4539;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





