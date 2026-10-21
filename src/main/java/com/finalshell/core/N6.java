package com.finalshell.core;

import java.awt.Color;

public final class N6 {
   public static float[] F;
   public static float[] K;
   public static long[] a;
   public static Integer[] b;

   public static int W(int var0) {
      String[] var1 = ZH.U();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         if (var10000 > a(11824, 8426776992224049655L)) {
            return a(11824, 8426776992224049655L);
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static int v(int var0, int var1, float var2) {
      return W((int)((float)var0 + var2 * (float)(var1 - var0)));
   }

   public static int D(int var0) {
      int var1 = var0 >> a(27361, 2333081108960394532L) & a(11824, 8426776992224049655L);
      int var2 = var0 >> a(23798, 4046984552660798261L) & a(11824, 8426776992224049655L);
      int var3 = var0 & a(11824, 8426776992224049655L);
      return (var1 + var2 + var3) / 3;
   }

   public static boolean U(int var0, int var1, int var2) {
      String[] var10000 = ZH.U();
      int var4 = var0 >> a(20295, 1116493213620639879L) & a(11824, 8426776992224049655L);
      int var5 = var0 >> a(11194, 1137099505876434043L) & a(11824, 8426776992224049655L);
      String[] var3 = var10000;
      int var6 = var0 & a(11824, 8426776992224049655L);
      int var7 = var1 >> a(27361, 2333081108960394532L) & a(11824, 8426776992224049655L);
      int var8 = var1 >> a(23798, 4046984552660798261L) & a(11824, 8426776992224049655L);
      int var9 = var1 & a(11824, 8426776992224049655L);
      int var10 = Math.abs(var4 - var7);
      int var10001 = var2;
      if (var3 == null) {
         if (var10 > var2) {
            return 0 != 0;
         }

         var10 = Math.abs(var5 - var8);
         var10001 = var2;
      }

      if (var3 == null) {
         if (var10 > var10001) {
            return 0 != 0;
         }

         var10 = Math.abs(var6 - var9);
         if (var3 != null) {
            return var10 != 0;
         }

         var10001 = var2;
      }

      return ((var10 <= var10001 ? 1 : 0) != 0);
   }

   public static int X(int var0, int var1, int var2) {
      return S(var0, var1, var2, a(17556, 6933225212292895568L));
   }

   public static int m(int var0, int var1, int var2, int var3, int var4) {
      return var1 & ~var4 | S(var0 & var4, var1, var2, var3);
   }

   public static int S(int var0, int var1, int var2, int var3) {
      String[] var4 = ZH.U();
      int var10000 = var2;
      if (var4 == null) {
         if (var2 == 0) {
            return var0;
         }

         var10000 = var0 >> a(31103, 2280231343804296893L) & a(11824, 8426776992224049655L);
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
            var6 = var0 >> a(27361, 2333081108960394532L) & a(11824, 8426776992224049655L);
            var7 = var0 >> a(23798, 4046984552660798261L) & a(11824, 8426776992224049655L);
            var8 = var0 & a(11824, 8426776992224049655L);
            var9 = var1 >> a(17181, 6831033859364590811L) & a(11824, 8426776992224049655L);
            var10 = var1 >> a(27361, 2333081108960394532L) & a(11824, 8426776992224049655L);
            var11 = var1 >> a(23798, 4046984552660798261L) & a(11824, 8426776992224049655L);
            var12 = var1 & a(11824, 8426776992224049655L);
            var10000 = var2;
            if (var4 == null) {
               label103: {
                  label102: {
                     switch (var2) {
                        case 1:
                           if (var4 == null) {
                              break label103;
                           }
                        case 2:
                           var6 = Math.min(var6, var10);
                           var7 = Math.min(var7, var11);
                           var8 = Math.min(var8, var12);
                           if (var4 == null) {
                              break label103;
                           }
                        case 3:
                           var6 = Math.max(var6, var10);
                           var7 = Math.max(var7, var11);
                           var8 = Math.max(var8, var12);
                           if (var4 == null) {
                              break label103;
                           }
                        case 4:
                           var6 = W(var6 + var10);
                           var7 = W(var7 + var11);
                           var8 = W(var8 + var12);
                           if (var4 == null) {
                              break label103;
                           }
                        case 5:
                           var6 = W(var10 - var6);
                           var7 = W(var11 - var7);
                           var8 = W(var12 - var8);
                           if (var4 == null) {
                              break label103;
                           }
                        case 6:
                           var6 = W(Math.abs(var6 - var10));
                           var7 = W(Math.abs(var7 - var11));
                           var8 = W(Math.abs(var8 - var12));
                           if (var4 == null) {
                              break label103;
                           }
                        case 7:
                           var6 = W(var6 * var10 / a(11824, 8426776992224049655L));
                           var7 = W(var7 * var11 / a(11824, 8426776992224049655L));
                           var8 = W(var8 * var12 / a(11824, 8426776992224049655L));
                           if (var4 == null) {
                              break label103;
                           }
                        case 17:
                           var10000 = Gw2.U() & a(11824, 8426776992224049655L);
                           var10001 = var5;
                           if (var4 != null) {
                              break label106;
                           }

                           if (var10000 > var5) {
                              break label103;
                           }

                           var6 = var10;
                           var7 = var11;
                           var8 = var12;
                           if (var4 == null) {
                              break label103;
                           }
                        case 13:
                           var6 = (var6 + var10) / 2;
                           var7 = (var7 + var11) / 2;
                           var8 = (var8 + var12) / 2;
                           if (var4 == null) {
                              break label103;
                           }
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                           Color.RGBtoHSB(var6, var7, var8, F);
                           Color.RGBtoHSB(var10, var11, var12, K);
                           var10000 = var2;
                           if (var4 == null) {
                              switch (var2) {
                                 case 8:
                                    K[0] = F[0];
                                    if (var4 == null) {
                                       break;
                                    }
                                 case 9:
                                    K[1] = F[1];
                                    if (var4 == null) {
                                       break;
                                    }
                                 case 10:
                                    K[2] = F[2];
                                    if (var4 == null) {
                                       break;
                                    }
                                 case 11:
                                    K[0] = F[0];
                                    K[1] = F[1];
                              }

                              var0 = Color.HSBtoRGB(K[0], K[1], K[2]);
                              var6 = var0 >> a(27361, 2333081108960394532L) & a(11824, 8426776992224049655L);
                              var7 = var0 >> a(23798, 4046984552660798261L) & a(11824, 8426776992224049655L);
                              var10000 = var0 & a(11824, 8426776992224049655L);
                           }

                           var8 = var10000;
                           if (var4 == null) {
                              break label103;
                           }
                        case 12:
                           var6 = a(11824, 8426776992224049655L)
                              - (a(11824, 8426776992224049655L) - var6) * (a(11824, 8426776992224049655L) - var10) / a(11824, 8426776992224049655L);
                           var7 = a(11824, 8426776992224049655L)
                              - (a(11824, 8426776992224049655L) - var7) * (a(11824, 8426776992224049655L) - var11) / a(11824, 8426776992224049655L);
                           var8 = a(11824, 8426776992224049655L)
                              - (a(11824, 8426776992224049655L) - var8) * (a(11824, 8426776992224049655L) - var12) / a(11824, 8426776992224049655L);
                           if (var4 == null) {
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
                           var5 = var5 * var9 / a(11824, 8426776992224049655L);
                           return var5 << a(17181, 6831033859364590811L)
                              | var10 << a(27361, 2333081108960394532L)
                              | var11 << a(23798, 4046984552660798261L)
                              | var12;
                        case 20:
                           int var15 = a(11824, 8426776992224049655L) - var5;
                           return var5 << a(17181, 6831033859364590811L)
                              | var15 << a(27361, 2333081108960394532L)
                              | var15 << a(23798, 4046984552660798261L)
                              | var15;
                     }

                     int var14 = a(11824, 8426776992224049655L)
                        - (a(11824, 8426776992224049655L) - var6) * (a(11824, 8426776992224049655L) - var10) / a(11824, 8426776992224049655L);
                     int var13 = var6 * var10 / a(11824, 8426776992224049655L);
                     var6 = (var14 * var6 + var13 * (a(11824, 8426776992224049655L) - var6)) / a(11824, 8426776992224049655L);
                     var14 = a(11824, 8426776992224049655L)
                        - (a(11824, 8426776992224049655L) - var7) * (a(11824, 8426776992224049655L) - var11) / a(11824, 8426776992224049655L);
                     var13 = var7 * var11 / a(11824, 8426776992224049655L);
                     var7 = (var14 * var7 + var13 * (a(11824, 8426776992224049655L) - var7)) / a(11824, 8426776992224049655L);
                     var14 = a(11824, 8426776992224049655L)
                        - (a(11824, 8426776992224049655L) - var8) * (a(11824, 8426776992224049655L) - var12) / a(11824, 8426776992224049655L);
                     var13 = var8 * var12 / a(11824, 8426776992224049655L);
                     var8 = (var14 * var8 + var13 * (a(11824, 8426776992224049655L) - var8)) / a(11824, 8426776992224049655L);
                     if (var4 == null) {
                        break label103;
                     }
                  }

                  var6 = var7 = var8 = a(11824, 8426776992224049655L);
                  if (var4 != null) {
                     break label124;
                  }
               }

               var10000 = var3;
            }

            var10001 = a(11824, 8426776992224049655L);
         }

         if (var4 == null) {
            if (var10000 == var10001) {
               var10001 = a(11824, 8426776992224049655L);
               if (var4 != null) {
                  return var5 | var10001;
               }

               if (var5 == var10001) {
                  return var5 << a(17181, 6831033859364590811L) | var6 << a(27361, 2333081108960394532L) | var7 << a(23798, 4046984552660798261L) | var8;
               }
            }

            var5 = var5 * var3 / a(11824, 8426776992224049655L);
            var10000 = (a(11824, 8426776992224049655L) - var5) * var9;
            var10001 = a(11824, 8426776992224049655L);
         }

         int var24 = var10000 / var10001;
         var6 = W((var6 * var5 + var10 * var24) / a(11824, 8426776992224049655L));
         var7 = W((var7 * var5 + var11 * var24) / a(11824, 8426776992224049655L));
         var8 = W((var8 * var5 + var12 * var24) / a(11824, 8426776992224049655L));
         var5 = W(var5 + var24);
         return var5 << a(17181, 6831033859364590811L) | var6 << a(27361, 2333081108960394532L) | var7 << a(23798, 4046984552660798261L) | var8;
      }

      int var19 = W(var10 * var5 / a(11824, 8426776992224049655L));
      int var20 = W(var11 * var5 / a(11824, 8426776992224049655L));
      int var21 = W(var12 * var5 / a(11824, 8426776992224049655L));
      var5 = W(var9 * var5 / a(11824, 8426776992224049655L));
      return var5 << a(17181, 6831033859364590811L) | var19 << a(27361, 2333081108960394532L) | var20 << a(23798, 4046984552660798261L) | var21;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22468;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9132667006397630653L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "-¶}±¦ÂÛ\u0012E\u0081N±+\u0080õ\u0089\u0090,¼J,U\\~\u001dí)öf°1µ(\u008f{{ï¼Ð*\u0017ë¾jºK´Î";
      int var5 = "-¶}±¦ÂÛ\u0012E\u0081N±+\u0080õ\u0089\u0090,¼J,U\\~\u001dí)öf°1µ(\u008f{{ï¼Ð*\u0017ë¾jºK´Î".length();
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
                     F = new float[3];
                     K = new float[3];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "6¿\u0014.\u0015hf\u0018Ð©ß\u0013 \u0095Ã\u0080";
                  var5 = "6¿\u0014.\u0015hf\u0018Ð©ß\u0013 \u0095Ã\u0080".length();
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
}





