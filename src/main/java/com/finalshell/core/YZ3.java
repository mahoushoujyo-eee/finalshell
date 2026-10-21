package com.finalshell.core;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class YZ3 extends GT3 {
   public float g = 1.0F;
   public float D = 0.0F;
   public Po2 T = new WY3();
   public Random r;
   public long u;
   public boolean w;
   public boolean F;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long d;

   public YZ3() {
      this.u = d;
      this.w = false;
      this.F = false;
      this.r = new Random();
   }

   public void V(float var1) {
      this.g = var1;
   }

   public float N() {
      return this.g;
   }

   public void k(float var1) {
      this.D = var1;
   }

   public float h() {
      return this.D;
   }

   public void r(Po2 var1) {
      this.T = var1;
   }

   public Po2 v() {
      return this.T;
   }

   public void f(boolean var1) {
      this.w = var1;
   }

   public boolean s() {
      return this.w;
   }

   public void W(boolean var1) {
      this.F = var1;
   }

   public boolean J$boolean() {
      return this.F;
   }

   public void W(int var1) {
      this.u = (long)var1;
   }

   public int T() {
      return (int)this.u;
   }

   public void J$void() {
      this.u = new Date().getTime();
   }

   public int G(int[] var1, int var2, int var3) {
      String[] var4 = W5.q();
      int var10000 = (this.F) ? 1 : 0;
      if (var4 != null) {
         if (this.F) {
            return var1[var3 * this.H.width + var2];
         }

         var10000 = (int)(255.0F * this.r.nextFloat());
      }

      int var5 = var10000;
      int var6 = (int)(255.0F * this.r.nextFloat());
      int var7 = (int)(255.0F * this.r.nextFloat());
      return a(16085, 3711343934145825361L) | var5 << a(8301, 5170418059275146477L) | var6 << a(28456, 1770221322871954351L) | var7;
   }

   public int S(int var1, float var2) {
      int var3 = var1 >> a(17929, 3511331616957919880L) & a(26130, 1330109334475657872L);
      int var4 = var1 >> a(21366, 403324178118895609L) & a(9593, 1494584738105725436L);
      int var5 = var1 & a(9593, 1494584738105725436L);
      var3 = Iw4.e(var3 + (int)((double)var2 * ((double)this.r.nextFloat() - 0.5)));
      var4 = Iw4.e(var4 + (int)((double)var2 * ((double)this.r.nextFloat() - 0.5)));
      var5 = Iw4.e(var5 + (int)((double)var2 * ((double)this.r.nextFloat() - 0.5)));
      return a(27181, 4050020905111805611L) | var3 << a(8301, 5170418059275146477L) | var4 << a(28456, 1770221322871954351L) | var5;
   }

   public int y(int var1, int var2) {
      return Iw4.P(var1, var2, a(15352, 6264230424333750139L));
   }

   public int P(int var1, int var2, int[] var3, int var4) {
      return var3[var2 * var4 + var1];
   }

   public void y(int var1, int var2, int var3, int[] var4, int var5) {
      var4[var2 * var5 + var1] = var3;
   }

   public boolean Y(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8) {
      String[] var9 = W5.q();
      int var10000 = var7;
      if (var9 != null) {
         if (var7 == 0) {
            int var18;
            int var19;
            int var20;
            int var21;
            float var22;
            int var23;
            int var24;
            int var35;
            label135: {
               label142: {
                  label143: {
                     var18 = this.P(var1, var2, var5, var6);
                     var19 = this.P(var1, var4, var5, var6);
                     var20 = this.P(var3, var2, var5, var6);
                     var21 = this.P(var3, var4, var5, var6);
                     var22 = 256.0F / (2.0F * (float)var8) * this.g;
                     var23 = (var1 + var3) / 2;
                     var24 = (var2 + var4) / 2;
                     var10000 = var23;
                     var35 = var1;
                     label132:
                     if (var9 != null) {
                        if (var23 == var1) {
                           var10000 = var23;
                           var35 = var3;
                           if (var9 == null) {
                              break label132;
                           }

                           if (var23 == var3) {
                              var10000 = var24;
                              var35 = var2;
                              if (var9 == null) {
                                 break label132;
                              }

                              if (var24 == var2) {
                                 var10000 = var24;
                                 var35 = var4;
                                 if (var9 == null) {
                                    break label132;
                                 }

                                 if (var24 == var4) {
                                    return true;
                                 }
                              }
                           }
                        }

                        var10000 = var23;
                        if (var9 == null) {
                           break label143;
                        }

                        var35 = var1;
                     }

                     if (var10000 == var35) {
                        var10000 = var23;
                        var35 = var3;
                        if (var9 == null) {
                           break label135;
                        }

                        if (var23 == var3) {
                           break label142;
                        }
                     }

                     var10000 = this.y(var18, var19);
                  }

                  int var12 = var10000;
                  var12 = this.S(var12, var22);
                  this.y(var1, var24, var12, var5, var6);
                  var10000 = var1;
                  var35 = var3;
                  if (var9 == null) {
                     break label135;
                  }

                  if (var1 != var3) {
                     int var13 = this.y(var20, var21);
                     var13 = this.S(var13, var22);
                     this.y(var3, var24, var13, var5, var6);
                  }
               }

               var10000 = var24;
               var35 = var2;
            }

            label146: {
               label105: {
                  label147: {
                     label148: {
                        label149: {
                           label101: {
                              label100: {
                                 label150: {
                                    if (var9 != null) {
                                       if (var10000 == var35) {
                                          var10000 = var24;
                                          var35 = var4;
                                          if (var9 == null) {
                                             break label148;
                                          }

                                          if (var24 == var4) {
                                             break label149;
                                          }
                                       }

                                       var10000 = var1;
                                       if (var9 == null) {
                                          break label150;
                                       }

                                       var35 = var23;
                                    }

                                    if (var10000 == var35) {
                                       var10000 = var24;
                                       var35 = var4;
                                       if (var9 == null) {
                                          break label101;
                                       }

                                       if (var24 == var4) {
                                          break label100;
                                       }
                                    }

                                    var10000 = this.y(var19, var21);
                                 }

                                 int var15 = var10000;
                                 var15 = this.S(var15, var22);
                                 this.y(var23, var4, var15, var5, var6);
                              }

                              var10000 = var2;
                              var35 = var4;
                           }

                           if (var9 == null) {
                              break label148;
                           }

                           if (var10000 != var35) {
                              int var14 = this.y(var18, var20);
                              var14 = this.S(var14, var22);
                              this.y(var23, var2, var14, var5, var6);
                           }
                        }

                        var10000 = var2;
                        if (var9 == null) {
                           break label147;
                        }

                        var35 = var4;
                     }

                     if (var10000 == var35) {
                        var10000 = var1;
                        var35 = var3;
                        if (var9 == null) {
                           break label146;
                        }

                        if (var1 == var3) {
                           break label105;
                        }
                     }

                     var10000 = this.y(var18, var21);
                  }

                  int var16 = var10000;
                  int var17 = this.y(var19, var20);
                  var16 = this.y(var16, var17);
                  var16 = this.S(var16, var22);
                  this.y(var23, var24, var16, var5, var6);
               }

               var10000 = var3 - var1;
               if (var9 == null) {
                  return var10000 != 0;
               }

               var35 = 3;
            }

            if (var10000 < var35) {
               var10000 = var4 - var2;
               if (var9 == null) {
                  return var10000 != 0;
               }

               if (var10000 < 3) {
                  return false;
               }
            }

            return 1 != 0;
         }

         var10000 = (var1 + var3) / 2;
      }

      int var10 = var10000;
      int var11 = (var2 + var4) / 2;
      this.Y(var1, var2, var10, var11, var5, var6, var7 - 1, var8 + 1);
      this.Y(var1, var11, var10, var4, var5, var6, var7 - 1, var8 + 1);
      this.Y(var10, var2, var3, var11, var5, var6, var7 - 1, var8 + 1);
      return this.Y(var10, var11, var3, var4, var5, var6, var7 - 1, var8 + 1);
   }

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var6 = new int[var1 * var2];
      String[] var10000 = W5.q();
      this.r.setSeed(this.u);
      int var7 = var1 - 1;
      int var8 = var2 - 1;
      this.y(0, 0, this.G(var3, 0, 0), var6, var1);
      this.y(var7, 0, this.G(var3, var7, 0), var6, var1);
      this.y(0, var8, this.G(var3, 0, var8), var6, var1);
      String[] var5 = var10000;
      this.y(var7, var8, this.G(var3, var7, var8), var6, var1);
      this.y(var7 / 2, var8 / 2, this.G(var3, var7 / 2, var8 / 2), var6, var1);
      this.y(0, var8 / 2, this.G(var3, 0, var8 / 2), var6, var1);
      this.y(var7, var8 / 2, this.G(var3, var7, var8 / 2), var6, var1);
      this.y(var7 / 2, 0, this.G(var3, var7 / 2, 0), var6, var1);
      this.y(var7 / 2, var8, this.G(var3, var7 / 2, var8), var6, var1);
      int var9 = 1;

      while (true) {
         if (this.Y(0, 0, var1 - 1, var2 - 1, var6, var1, var9, 0)) {
            var9++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         YZ3 var13 = this;
         if (var5 != null) {
            if (!this.w) {
               break;
            }

            var13 = this;
         }

         if (var13.T != null) {
            int var10 = 0;
            int var11 = 0;

            while (var11 < var2) {
               int var12 = 0;

               label33: {
                  while (var12 < var1) {
                     var6[var10] = this.T.D((float)(var6[var10] & a(9593, 1494584738105725436L)) / 255.0F);
                     var10++;
                     var12++;
                     if (var5 == null) {
                        break label33;
                     }

                     if (var5 == null) {
                        break;
                     }
                  }

                  var11++;
               }

               if (var5 == null) {
                  return var6;
               }
            }
         }
         break;
      }

      return var6;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13447;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "5.\u0001\u0013\n2\u001bN\u001b\u0015\u0006\f-\u001fOeW".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var41 = 58;
      char[] var10002 = var10003;
      int var22 = var10004;
      char[] var49;
      byte var57;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var49 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 58;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var57 = 91;
               break;
            case 1:
               var57 = 113;
               break;
            case 2:
               var57 = 67;
               break;
            case 3:
               var57 = 93;
               break;
            case 4:
               var57 = 69;
               break;
            case 5:
               var57 = 122;
               break;
            default:
               var57 = 68;
         }
      } else {
         var41 = 58;
         var22 = var10004;
         if (var10004 <= var10) {
            String var46 = new String(var10003).intern();
            int var29 = -1;
            a = var46;
            long var12 = 7745782081022057597L;
            long[] var17 = new long[9];
            int var14 = 0;
            String var15 = "@Émï\u0085}\u0007Úè(±[_ÿ\u0082Ö´|»ê\u0017dÍ~\\I\u0081å{÷Ö,3b\u0013\u009f7|S\u000b8#í\u0001ÿ=\u008e\u0012\u009cDñsó¸.å";
            int var16 = "@Émï\u0085}\u0007Úè(±[_ÿ\u0082Ö´|»ê\u0017dÍ~\\I\u0081å{÷Ö,3b\u0013\u009f7|S\u000b8#í\u0001ÿ=\u008e\u0012\u009cDñsó¸.å".length();
            byte var13 = 0;

            label71:
            while (true) {
               var29 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var29, var13).getBytes("ISO-8859-1");
               long[] var21 = var17;
               var29 = var14++;
               long var38 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var47 = -1;

               while (true) {
                  long var55 = var38 ^ var12;
                  switch (var47) {
                     case 0:
                        var21[var29] = var55;
                        if (var13 >= var16) {
                           b = var17;
                           c = new Integer[9];
                           long var11 = 1727192939476898652L;
                           long var40 = 1727192939476898155L ^ var11;
                           byte var33 = -1;
                           d = var40;
                           return;
                        }
                        break;
                     default:
                        var21[var29] = var55;
                        if (var13 < var16) {
                           continue label71;
                        }

                        var15 = "¯sÐ±5»È\u0080áMô\u001bxý»\u008c";
                        var16 = "¯sÐ±5»È\u0080áMô\u001bxý»\u008c".length();
                        var13 = 0;
                  }

                  byte var32 = var13;
                  var13 += 8;
                  var19 = var15.substring(var32, var13).getBytes("ISO-8859-1");
                  var21 = var17;
                  var29 = var14++;
                  var38 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var47 = 0;
               }
            }
         }

         var49 = var10003;
         var10005 = var10;
         char var58 = var10003[var10];
         var10007 = 58;
         var10006 = var58;
         switch (var10 % 7) {
            case 0:
               var57 = 91;
               break;
            case 1:
               var57 = 113;
               break;
            case 2:
               var57 = 67;
               break;
            case 3:
               var57 = 93;
               break;
            case 4:
               var57 = 69;
               break;
            case 5:
               var57 = 122;
               break;
            default:
               var57 = 68;
         }
      }

      while (true) {
         var49[var10005] = (char)(var10006 ^ var10007 ^ var57);
         var10++;
         if (var41 == 0) {
            var49 = var10002;
            var10005 = var41;
            char var60 = var10002[var41];
            var10007 = var41;
            var10006 = var60;
            switch (var10 % 7) {
               case 0:
                  var57 = 91;
                  break;
               case 1:
                  var57 = 113;
                  break;
               case 2:
                  var57 = 67;
                  break;
               case 3:
                  var57 = 93;
                  break;
               case 4:
                  var57 = 69;
                  break;
               case 5:
                  var57 = 122;
                  break;
               default:
                  var57 = 68;
            }
         } else {
            if (var22 <= var10) {
               String var43 = new String(var10002).intern();
               int var24 = -1;
               a = var43;
               long var2 = 7745782081022057597L;
               long[] var8 = new long[9];
               int var5 = 0;
               String var6 = "@Émï\u0085}\u0007Úè(±[_ÿ\u0082Ö´|»ê\u0017dÍ~\\I\u0081å{÷Ö,3b\u0013\u009f7|S\u000b8#í\u0001ÿ=\u008e\u0012\u009cDñsó¸.å";
               int var7 = "@Émï\u0085}\u0007Úè(±[_ÿ\u0082Ö´|»ê\u0017dÍ~\\I\u0081å{÷Ö,3b\u0013\u009f7|S\u000b8#í\u0001ÿ=\u008e\u0012\u009cDñsó¸.å".length();
               byte var4 = 0;

               label37:
               while (true) {
                  var24 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  long[] var10000 = var8;
                  var24 = var5++;
                  long var35 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  byte var44 = -1;

                  while (true) {
                     long var53 = var35 ^ var2;
                     switch (var44) {
                        case 0:
                           var10000[var24] = var53;
                           if (var4 >= var7) {
                              b = var8;
                              c = new Integer[9];
                              long var0 = 1727192939476898652L;
                              long var37 = 1727192939476898155L ^ var0;
                              byte var28 = -1;
                              d = var37;
                              return;
                           }
                           break;
                        default:
                           var10000[var24] = var53;
                           if (var4 < var7) {
                              continue label37;
                           }

                           var6 = "¯sÐ±5»È\u0080áMô\u001bxý»\u008c";
                           var7 = "¯sÐ±5»È\u0080áMô\u001bxý»\u008c".length();
                           var4 = 0;
                     }

                     byte var27 = var4;
                     var4 += 8;
                     var9 = var6.substring(var27, var4).getBytes("ISO-8859-1");
                     var10000 = var8;
                     var24 = var5++;
                     var35 = ((long)var9[0] & 255L) << 56
                        | ((long)var9[1] & 255L) << 48
                        | ((long)var9[2] & 255L) << 40
                        | ((long)var9[3] & 255L) << 32
                        | ((long)var9[4] & 255L) << 24
                        | ((long)var9[5] & 255L) << 16
                        | ((long)var9[6] & 255L) << 8
                        | (long)var9[7] & 255L;
                     var44 = 0;
                  }
               }
            }

            var49 = var10002;
            var10005 = var10;
            char var59 = var10002[var10];
            var10007 = var41;
            var10006 = var59;
            switch (var10 % 7) {
               case 0:
                  var57 = 91;
                  break;
               case 1:
                  var57 = 113;
                  break;
               case 2:
                  var57 = 67;
                  break;
               case 3:
                  var57 = 93;
                  break;
               case 4:
                  var57 = 69;
                  break;
               case 5:
                  var57 = 122;
                  break;
               default:
                  var57 = 68;
            }
         }
      }
   }
}





