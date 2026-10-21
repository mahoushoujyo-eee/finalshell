package com;

import java.awt.Rectangle;

public class gA_3 extends gl_4 {
   private static final String c;
   private static final long[] e;
   private static final Integer[] f;

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var10000 = com.W5.q();
      int var6 = 0;
      int[] var7 = new int[var1 * var2];
      String[] var5 = var10000;
      int var8 = 0;

      label151:
      while (true) {
         int var22 = var8;

         label149:
         while (var22 < var2) {
            int var9 = 0;

            label146:
            do {
               int var23 = var9;
               int var10001 = var1;

               int var13;
               int var15;
               label143:
               while (true) {
                  if (var23 >= var10001) {
                     break label146;
                  }

                  boolean var10 = false;
                  boolean var11 = false;
                  boolean var12 = false;
                  var13 = var3[var8 * var1 + var9];
                  int var14 = var13 & a(17422, 3074429024884164376L);
                  var15 = 0;
                  var22 = -1;
                  if (var5 == null) {
                     continue label149;
                  }

                  int var16 = -1;

                  while (true) {
                     int var24 = var16;

                     label138: {
                        label137:
                        while (true) {
                           if (var24 > 1) {
                              break label143;
                           }

                           int var17 = var8 + var16;
                           if (var5 == null) {
                              break label138;
                           }

                           var23 = 0;
                           var10001 = var17;
                           if (var5 == null) {
                              continue label143;
                           }

                           if (0 > var17) {
                              break;
                           }

                           int var25 = var17;
                           var10001 = var2;
                           if (var5 != null) {
                              if (var17 >= var2) {
                                 break;
                              }

                              var25 = var17;
                              var10001 = var1;
                           }

                           int var18 = var25 * var10001;
                           int var19 = -1;

                           while (true) {
                              if (var19 > 1) {
                                 break label137;
                              }

                              int var20 = var9 + var19;
                              var24 = var16;
                              if (var5 == null) {
                                 break;
                              }

                              label132: {
                                 label161: {
                                    label130:
                                    if (var5 != null) {
                                       if (var16 == 0) {
                                          var24 = var19;
                                          if (var5 == null) {
                                             break label130;
                                          }

                                          if (var19 == 0) {
                                             break label161;
                                          }
                                       }

                                       var24 = 0;
                                    }

                                    label162: {
                                       var10001 = var20;
                                       if (var5 != null) {
                                          if (var24 > var20) {
                                             break label161;
                                          }

                                          var24 = var20;
                                          if (var5 == null) {
                                             break label162;
                                          }

                                          var10001 = var1;
                                       }

                                       if (var24 >= var10001) {
                                          break label161;
                                       }

                                       var24 = var3[var18 + var20];
                                    }

                                    int var21 = var24;
                                    if (var5 == null) {
                                       break label132;
                                    }

                                    if (this.F.v(var21)) {
                                       var15++;
                                    }
                                 }

                                 var19++;
                              }

                              if (var5 == null) {
                                 break label137;
                              }
                           }
                        }

                        var16++;
                     }

                     if (var5 == null) {
                        break label143;
                     }
                  }
               }

               label164: {
                  if (this.F.v(var13)) {
                     int var10002;
                     var10001 = var6++;
                     var10002 = var15;
                     label82:
                     if (var5 != null) {
                        if (var15 != 2) {
                           var10002 = var15;
                           if (var5 == null) {
                              break label82;
                           }

                           if (var15 != 3) {
                              var10002 = -1;
                              break label82;
                           }
                        }

                        var10002 = var13;
                     }

                     var7[var10001] = var10002;
                     if (var5 != null) {
                        break label164;
                     }
                  }

                  var10001 = var6++;
                  int var30 = var15;
                  if (var5 != null) {
                     var30 = var15 == 3 ? a(14004, 8311872995899274659L) : var13;
                  }

                  var7[var10001] = var30;
               }

               var9++;
            } while (var5 != null);

            var8++;
            if (var5 == null) {
               return var7;
            }
            continue label151;
         }

         return var7;
      }
   }

   @Override
   public String toString() {
      return c;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "=\u0014B\u0000nu{3\u0014J\u0004".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 54;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 73;
               break;
            case 1:
               var37 = 75;
               break;
            case 2:
               var37 = 26;
               break;
            case 3:
               var37 = 87;
               break;
            case 4:
               var37 = 42;
               break;
            case 5:
               var37 = 58;
               break;
            default:
               var37 = 98;
         }
      } else {
         var25 = 54;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            c = var29;
            long var9 = 9136743268899274326L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "©\f\u0016èW\u0012Kõ£ÿX¯vñ¹N";
            int var13 = "©\f\u0016èW\u0012Kõ£ÿX¯vñ¹N".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            e = var14;
            f = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 54;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 73;
               break;
            case 1:
               var37 = 75;
               break;
            case 2:
               var37 = 26;
               break;
            case 3:
               var37 = 87;
               break;
            case 4:
               var37 = 42;
               break;
            case 5:
               var37 = 58;
               break;
            default:
               var37 = 98;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 73;
                  break;
               case 1:
                  var37 = 75;
                  break;
               case 2:
                  var37 = 26;
                  break;
               case 3:
                  var37 = 87;
                  break;
               case 4:
                  var37 = 42;
                  break;
               case 5:
                  var37 = 58;
                  break;
               default:
                  var37 = 98;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               c = var27;
               long var0 = 9136743268899274326L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "©\f\u0016èW\u0012Kõ£ÿX¯vñ¹N";
               int var5 = "©\f\u0016èW\u0012Kõ£ÿX¯vñ¹N".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               e = var6;
               f = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 73;
                  break;
               case 1:
                  var37 = 75;
                  break;
               case 2:
                  var37 = 26;
                  break;
               case 3:
                  var37 = 87;
                  break;
               case 4:
                  var37 = 42;
                  break;
               case 5:
                  var37 = 58;
                  break;
               default:
                  var37 = 98;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17175;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }
}





