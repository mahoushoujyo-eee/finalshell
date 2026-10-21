package com.finalshell.core;

import java.awt.Rectangle;

public class GW3 extends GT3 {
   private static int[] var39;
   public static int[] T;
   public int[] v;
   public int D = a(27645, 8361874596275343796L);
   public boolean Q = true;
   public boolean f = true;
   public int j = a(29719, 5395795144619904592L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public GW3() {
      this.U(T);
   }

   public void A(boolean var1) {
      this.Q = var1;
   }

   public boolean b() {
      return this.Q;
   }

   public void y(boolean var1) {
      this.f = var1;
   }

   public boolean F() {
      return this.f;
   }

   public void U(int[] var1) {
      this.v = var1;
      this.D = 0;
      String[] var10000 = W5.q();
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.length) {
         this.D = this.D + var1[var3];
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public int[] B() {
      return this.v;
   }

   public void q(int var1) {
      this.j = var1;
   }

   public int n() {
      return this.j;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var41;
      int var44;
      int var48;
      String[] var10000 = W5.q();
      int[] var6 = new int[var1 * var2];
      int var7 = 0;
      int[] var8 = new int[this.j];
      String[] var5 = var10000;
      int var9 = 0;

      while (true) {
         if (var9 < this.j) {
            int var10 = a(28818, 4728002682793183960L) * var9 / (this.j - 1);
            var39 = var8;
            if (var5 == null) {
               break;
            }

            var8[var9] = var10;
            var9++;
            if (var5 != null) {
               continue;
            }
         }

         var39 = new int[a(7935, 6862936480065365170L)];
         break;
      }

      int[] var30 = var39;
      int var31 = 0;

      while (true) {
         if (var31 < a(4612, 803723066245261381L)) {
            var30[var31] = this.j * var31 / a(4612, 803723066245261381L);
            var31++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var31 = 0;
         break;
      }

      label172:
      while (true) {
         int var40 = var31;

         label170:
         while (var40 < var2) {
            label167: {
               label194: {
                  var41 = (this.Q) ? 1 : 0;
                  if (var5 != null) {
                     if (!this.Q) {
                        break label194;
                     }

                     var41 = var31 & 1;
                  }

                  if (var5 == null) {
                     break label167;
                  }

                  if (var41 == 1) {
                     var41 = 1;
                     break label167;
                  }
               }

               var41 = 0;
            }

            int var11;
            int var12;
            label156: {
               var11 = var41;
               int var42 = var11;
               if (var5 != null) {
                  if (var11 != 0) {
                     var7 = var31 * var1 + var1 - 1;
                     var12 = -1;
                     if (var5 != null) {
                        break label156;
                     }
                  }

                  var7 = var31 * var1;
                  var42 = 1;
               }

               var12 = var42;
            }

            int var13 = 0;

            label148:
            while (var13 < var1) {
               int var14 = var3[var7];
               int var15 = var14 >> a(21515, 3555660113599852109L) & a(10269, 8294312473434002006L);
               int var16 = var14 >> a(26693, 6465829375574069766L) & a(10269, 8294312473434002006L);
               int var17 = var14 & a(10269, 8294312473434002006L);
               var40 = (this.f) ? 1 : 0;
               if (var5 == null) {
                  continue label170;
               }

               if (var5 != null) {
                  if (!this.f) {
                     var15 = var16 = var17 = (var15 + var16 + var17) / 3;
                  }

                  var40 = var8[var30[var15]];
               }

               int var18 = var40;
               int var19 = var8[var30[var16]];
               int var20 = var8[var30[var17]];
               var6[var7] = var14 & a(18407, 7637150823412039083L) | var18 << a(27645, 8361874596275343796L) | var19 << a(23875, 6508546602740967174L) | var20;
               int var21 = var15 - var18;
               int var22 = var16 - var19;
               int var23 = var17 - var20;
               int var24 = -1;

               label146:
               while (true) {
                  int var43 = var24;
                  int var10001 = 1;

                  label143:
                  while (true) {
                     if (var43 <= var10001) {
                        int var25 = var24 + var31;
                        if (var5 != null) {
                           var44 = 0;
                           var10001 = var25;
                           if (var5 == null) {
                              break;
                           }

                           label137:
                           if (0 <= var25) {
                              int var45 = var25;
                              if (var5 != null) {
                                 if (var25 >= var2) {
                                    break label137;
                                 }

                                 var45 = -1;
                              }

                              int var26 = var45;

                              while (var26 <= 1) {
                                 int var27 = var26 + var13;
                                 if (var5 != null) {
                                    var43 = 0;
                                    var10001 = var27;
                                    if (var5 == null) {
                                       continue label143;
                                    }

                                    label108:
                                    if (0 <= var27) {
                                       int var46 = var27;
                                       if (var5 != null) {
                                          if (var27 >= var1) {
                                             break label108;
                                          }

                                          var46 = var11;
                                       }

                                       int var28;
                                       label122: {
                                          if (var5 != null) {
                                             if (var46 != 0) {
                                                var28 = this.v[(var24 + 1) * 3 - var26 + 1];
                                                if (var5 != null) {
                                                   break label122;
                                                }
                                             }

                                             var46 = this.v[(var24 + 1) * 3 + var26 + 1];
                                          }

                                          var28 = var46;
                                       }

                                       int var47 = var28;
                                       if (var5 != null) {
                                          if (var28 == 0) {
                                             break label108;
                                          }

                                          var47 = var11;
                                       }

                                       label114: {
                                          if (var5 != null) {
                                             if (var47 != 0) {
                                                var48 = var7 - var26;
                                                break label114;
                                             }

                                             var47 = var7;
                                          }

                                          var48 = var47 + var26;
                                       }

                                       int var29 = var48;
                                       var14 = var3[var29];
                                       var15 = var14 >> a(27645, 8361874596275343796L) & a(10269, 8294312473434002006L);
                                       var16 = var14 >> a(23875, 6508546602740967174L) & a(10269, 8294312473434002006L);
                                       var17 = var14 & a(10269, 8294312473434002006L);
                                       var15 += var21 * var28 / this.D;
                                       var16 += var22 * var28 / this.D;
                                       var17 += var23 * var28 / this.D;
                                       var3[var29] = var3[var29] & a(29516, 4735871104803588356L)
                                          | Iw4.e(var15) << a(27645, 8361874596275343796L)
                                          | Iw4.e(var16) << a(23875, 6508546602740967174L)
                                          | Iw4.e(var17);
                                    }

                                    var26++;
                                 }

                                 if (var5 == null) {
                                    break;
                                 }
                              }
                           }

                           var24++;
                        }

                        if (var5 != null) {
                           continue label146;
                        }
                     }

                     var44 = var7;
                     var10001 = var12;
                     break;
                  }

                  var7 = var44 + var10001;
                  var13++;
                  if (var5 == null) {
                     break label148;
                  }
                  break;
               }
            }

            var31++;
            if (var5 == null) {
               return var6;
            }
            continue label172;
         }

         return var6;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14912;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var41;
      char[] var44;
      long var48;
      char[] var10003 = "G\u0018{\u007f\u001aeo@\u001eqv\u001de)k\u00197T\u0001b(a\u00059>F".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var36 = 90;
      char[] var10002 = var10003;
      int var21 = var10004;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 90;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var52 = 94;
               break;
            case 1:
               var52 = 45;
               break;
            case 2:
               var52 = 77;
               break;
            case 3:
               var52 = 74;
               break;
            case 4:
               var52 = 50;
               break;
            case 5:
               var52 = 76;
               break;
            default:
               var52 = 26;
         }
      } else {
         var36 = 90;
         var21 = var10004;
         if (var10004 <= var8) {
            var41 = new String(var10003).intern();
            int var27 = -1;
            a = var41;
            long var9 = 2480984682911172291L;
            long[] var14 = new long[15];
            int var11 = 0;
            String var12 = "Ö\u0010Úó\u0019\u0095ôe:\u0097æéKM/\u0086øàábLÆ«f\u009aÆ\u0092\u008fÛ{ÔÍJí:TD\rU\u0088\u0007\u000f\t1ZhaÍ\u001d« \u000fC?è\u009eo@Õ\b\u0015ÃÈ\u0095à\u0093\u008f·öÁÏÇ\u0091ÖWñùA×g¾ý,ÛJàLäPülTE;\u0014j¤ä\u000eV\u0084\u0095{h";
            int var13 = "Ö\u0010Úó\u0019\u0095ôe:\u0097æéKM/\u0086øàábLÆ«f\u009aÆ\u0092\u008fÛ{ÔÍJí:TD\rU\u0088\u0007\u000f\t1ZhaÍ\u001d« \u000fC?è\u009eo@Õ\b\u0015ÃÈ\u0095à\u0093\u008f·öÁÏÇ\u0091ÖWñùA×g¾ý,ÛJàLäPülTE;\u0014j¤ä\u000eV\u0084\u0095{h"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var27 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var27, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var19 = var14;
               var27 = var11++;
               long var34 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var9;
                  switch (var42) {
                     case 0:
                        var19[var27] = var50;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[15];
                           int[] var20 = new int[a(26886, 2723155418470044482L)];
                           var20[0] = 0;
                           var20[1] = 0;
                           var20[2] = 0;
                           var20[3] = 0;
                           var20[4] = 0;
                           var20[5] = a(18657, 3245755286632198817L);
                           var20[a(2112, 4143465882010169870L)] = 3;
                           var20[a(6112, 2805580857280933282L)] = 5;
                           var20[a(23875, 6508546602740967174L)] = 1;
                           T = var20;
                           return;
                        }
                        break;
                     default:
                        var19[var27] = var50;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ù\u0017=S\u009cF£q½\nzæÚ1´Ë";
                        var13 = "ù\u0017=S\u009cF£q½\nzæÚ1´Ë".length();
                        var10 = 0;
                  }

                  byte var30 = var10;
                  var10 += 8;
                  var16 = var12.substring(var30, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var19 = var14;
                  var27 = var11++;
                  var34 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var8;
         char var53 = var10003[var8];
         var10007 = 90;
         var10006 = var53;
         switch (var8 % 7) {
            case 0:
               var52 = 94;
               break;
            case 1:
               var52 = 45;
               break;
            case 2:
               var52 = 77;
               break;
            case 3:
               var52 = 74;
               break;
            case 4:
               var52 = 50;
               break;
            case 5:
               var52 = 76;
               break;
            default:
               var52 = 26;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var8++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var8 % 7) {
               case 0:
                  var52 = 94;
                  break;
               case 1:
                  var52 = 45;
                  break;
               case 2:
                  var52 = 77;
                  break;
               case 3:
                  var52 = 74;
                  break;
               case 4:
                  var52 = 50;
                  break;
               case 5:
                  var52 = 76;
                  break;
               default:
                  var52 = 26;
            }
         } else {
            if (var21 <= var8) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               a = var38;
               long var0 = 2480984682911172291L;
               long[] var6 = new long[15];
               int var3 = 0;
               String var4 = "Ö\u0010Úó\u0019\u0095ôe:\u0097æéKM/\u0086øàábLÆ«f\u009aÆ\u0092\u008fÛ{ÔÍJí:TD\rU\u0088\u0007\u000f\t1ZhaÍ\u001d« \u000fC?è\u009eo@Õ\b\u0015ÃÈ\u0095à\u0093\u008f·öÁÏÇ\u0091ÖWñùA×g¾ý,ÛJàLäPülTE;\u0014j¤ä\u000eV\u0084\u0095{h";
               int var5 = "Ö\u0010Úó\u0019\u0095ôe:\u0097æéKM/\u0086øàábLÆ«f\u009aÆ\u0092\u008fÛ{ÔÍJí:TD\rU\u0088\u0007\u000f\t1ZhaÍ\u001d« \u000fC?è\u009eo@Õ\b\u0015ÃÈ\u0095à\u0093\u008f·öÁÏÇ\u0091ÖWñùA×g¾ý,ÛJàLäPülTE;\u0014j¤ä\u000eV\u0084\u0095{h"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var23 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var23, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var23 = var3++;
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
                     var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[15];
                              int[] var18 = new int[a(26886, 2723155418470044482L)];
                              var18[0] = 0;
                              var18[1] = 0;
                              var18[2] = 0;
                              var18[3] = 0;
                              var18[4] = 0;
                              var18[5] = a(18657, 3245755286632198817L);
                              var18[a(2112, 4143465882010169870L)] = 3;
                              var18[a(6112, 2805580857280933282L)] = 5;
                              var18[a(23875, 6508546602740967174L)] = 1;
                              T = var18;
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ù\u0017=S\u009cF£q½\nzæÚ1´Ë";
                           var5 = "ù\u0017=S\u009cF£q½\nzæÚ1´Ë".length();
                           var2 = 0;
                     }

                     byte var26 = var2;
                     var2 += 8;
                     var7 = var4.substring(var26, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var23 = var3++;
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
            var10005 = var8;
            char var54 = var10002[var8];
            var10007 = var36;
            var10006 = var54;
            switch (var8 % 7) {
               case 0:
                  var52 = 94;
                  break;
               case 1:
                  var52 = 45;
                  break;
               case 2:
                  var52 = 77;
                  break;
               case 3:
                  var52 = 74;
                  break;
               case 4:
                  var52 = 50;
                  break;
               case 5:
                  var52 = 76;
                  break;
               default:
                  var52 = 26;
            }
         }
      }
   }
}





