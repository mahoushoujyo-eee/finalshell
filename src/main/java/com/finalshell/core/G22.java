package com.finalshell.core;

import java.awt.Rectangle;
import java.util.Random;

public class G22 extends GT3 {
   public float i = 32.0F;
   public float C = 0.0F;
   public int k = a(12351, 8723941394870656953L);
   public float Z = 1.0F;
   public float S = 1.0F;
   public float r = 0.0F;
   public float N = 0.0F;
   public int p = a(1222, 33084816068012878L);
   public int o = a(26388, 1440950252612880534L);
   public float A;
   public float I;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void v(float var1) {
      this.i = var1;
   }

   public float W() {
      return this.i;
   }

   public void z(int var1) {
      this.k = var1;
   }

   public int D() {
      return this.k;
   }

   public void p(float var1) {
      this.S = var1;
   }

   public float Q() {
      return this.S;
   }

   public void I(float var1) {
      this.Z = var1;
   }

   public float m() {
      return this.Z;
   }

   public void N(float var1) {
      this.r = var1;
   }

   public float h() {
      return this.r;
   }

   public void B(float var1) {
      this.N = var1;
   }

   public float E() {
      return this.N;
   }

   public void U(int var1) {
      this.p = var1;
   }

   public int i() {
      return this.p;
   }

   public void t(int var1) {
      this.o = var1;
   }

   public int l() {
      return this.o;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      Random var6 = new Random(0L);
      String[] var10000 = W5.q();
      this.A = (float)Math.sin(0.1);
      this.I = (float)Math.cos(0.1);
      int var7 = this.H.width;
      String[] var5 = var10000;
      int var8 = this.H.height;
      int var9 = var4.width;
      int var10 = var4.height;
      int var11 = 0;
      int[] var12 = new int[var9 * var10];
      int var13 = 0;

      while (true) {
         if (var13 < var10) {
            var47 = 0;
            if (var5 == null) {
               break;
            }

            int var14 = 0;

            label255: {
               while (var14 < var9) {
                  var12[var11++] = this.o;
                  var14++;
                  if (var5 == null) {
                     break label255;
                  }

                  if (var5 == null) {
                     break;
                  }
               }

               var13++;
            }

            if (var5 != null) {
      int var47;
      int var47;
               continue;
            }
         }

         var13 = this.k / this.p;
         var47 = var13;
         break;
      }

      label241: {
         if (var5 != null) {
            if (var47 != 0) {
               break label241;
            }

            var47 = 1;
         }

         var13 = var47;
      }

      float var36 = 1.0F / this.i;
      float var15 = 0.95F;
      boolean var35 = false;
      int var16 = 0;

      label234:
      while (true) {
         int var48 = var16;

         label232:
         while (var48 < var10) {
            int var17 = 0;

            label229:
            while (true) {
               int var49 = var17;

               label227:
               while (true) {
                  if (var49 >= var9) {
                     break label229;
                  }

                  var48 = 0;
                  if (var5 == null) {
                     continue label232;
                  }

                  int var18 = 0;

                  label224:
                  while (true) {
                     int var50 = var18;

                     label222:
                     while (true) {
                        if (var50 >= this.p) {
                           break label224;
                        }

                        label219: {
                           label269: {
                              float var19 = (float)var17 + var6.nextFloat();
                              float var20 = (float)var16 + var6.nextFloat();
                              float var21 = var19 * var36;
                              float var22 = var20 * var36;
                              float var25 = 0.1F + this.Z;
                              float var23 = this.J(var21 - var15, var22) - this.J(var21 + var15, var22);
                              float var24 = this.J(var21, var22 + var15) - this.J(var21, var22 - var15);
                              float var51 = this.r;
                              float var57 = 0.0F;
                              if (var5 != null) {
                                 float var61;
                                 var49 = (var61 = this.r - 0.0F) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
                                 if (var5 == null) {
                                    continue label227;
                                 }

                                 if (var49 > 0) {
                                    int var26 = 0;

                                    while (var26 < 3) {
                                       float var27 = 1.0F + (float)var26 * this.r;
                                       float var28 = var19 + this.i * var25 * var23 * var27;
                                       float var29 = var20 + this.i * var25 * var24 * var27;
                                       if (var5 != null) {
                                          float var62;
                                          var50 = (var62 = var28 - 0.0F) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
                                          if (var5 == null) {
                                             continue label222;
                                          }

                                          label176:
                                          if (var50 >= 0) {
                                             float var63;
                                             int var52 = (var63 = var28 - (float)(var9 - 1)) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
                                             if (var5 != null) {
                                                if (var52 >= 0) {
                                                   break label176;
                                                }

                                                float var64;
                                                var52 = (var64 = var29 - 0.0F) == 0.0F ? 0 : (var64 < 0.0F ? -1 : 1);
                                             }

                                             if (var5 != null) {
                                                if (var52 < 0) {
                                                   break label176;
                                                }

                                                float var65;
                                                var52 = (var65 = var29 - (float)(var10 - 1)) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                                             }

                                             if (var5 != null) {
                                                if (var52 >= 0) {
                                                   break label176;
                                                }

                                                var52 = (int)var29 * var9 + (int)var28;
                                             }

                                             int var30;
                                             int var32;
                                             int var33;
                                             int var34;
                                             label275: {
                                                var30 = var52;
                                                int var31 = var12[var30];
                                                var32 = var31 >> a(14258, 378533527156742195L) & a(4390, 4532122126271250085L);
                                                var33 = var31 >> a(27573, 6883390274458092592L) & a(4390, 4532122126271250085L);
                                                var34 = var31 & a(4390, 4532122126271250085L);
                                                int var53 = var26;
                                                int var58 = 2;
                                                if (var5 != null) {
                                                   if (var26 == 2) {
                                                      var32 += var13;
                                                      if (var5 != null) {
                                                         break label275;
                                                      }
                                                   }

                                                   var53 = var26;
                                                   var58 = 1;
                                                }

                                                if (var5 != null) {
                                                   if (var53 == var58) {
                                                      var33 += var13;
                                                      if (var5 != null) {
                                                         break label275;
                                                      }
                                                   }

                                                   var53 = var34;
                                                   var58 = var13;
                                                }

                                                var34 = var53 + var58;
                                             }

                                             int var54 = var32;
                                             int var59 = a(4390, 4532122126271250085L);
                                             if (var5 != null) {
                                                if (var32 > var59) {
                                                   var32 = a(4390, 4532122126271250085L);
                                                }

                                                var54 = var33;
                                                var59 = a(4390, 4532122126271250085L);
                                             }

                                             label187: {
                                                label276: {
                                                   if (var5 != null) {
                                                      if (var54 > var59) {
                                                         var33 = a(4390, 4532122126271250085L);
                                                      }

                                                      var54 = var34;
                                                      if (var5 == null) {
                                                         break label276;
                                                      }

                                                      var59 = a(4390, 4532122126271250085L);
                                                   }

                                                   if (var54 <= var59) {
                                                      break label187;
                                                   }

                                                   var54 = a(4390, 4532122126271250085L);
                                                }

                                                var34 = var54;
                                             }

                                             var12[var30] = a(1152, 4474412071046638343L)
                                                | var32 << a(14258, 378533527156742195L)
                                                | var33 << a(27573, 6883390274458092592L)
                                                | var34;
                                          }

                                          var26++;
                                       }

                                       if (var5 == null) {
                                          break;
                                       }
                                    }

                                    if (var5 != null) {
                                       break label269;
                                    }
                                 }

                                 var51 = var19;
                                 var57 = this.i * var25 * var23;
                              }

                              float var37 = var51 + var57;
                              float var38 = var20 + this.i * var25 * var24;
                              if (var5 == null) {
                                 break label219;
                              }

                              label157:
                              if (!(var37 < 0.0F)) {
                                 float var66;
                                 int var55 = (var66 = var37 - (float)(var9 - 1)) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
                                 if (var5 != null) {
                                    if (var55 >= 0) {
                                       break label157;
                                    }

                                    float var67;
                                    var55 = (var67 = var38 - 0.0F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
                                 }

                                 if (var5 != null) {
                                    if (var55 < 0) {
                                       break label157;
                                    }

                                    float var68;
                                    var55 = (var68 = var38 - (float)(var10 - 1)) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                                 }

                                 if (var5 != null) {
                                    if (var55 >= 0) {
                                       break label157;
                                    }

                                    var55 = (int)var38 * var9 + (int)var37;
                                 }

                                 int var39 = var55;
                                 int var40 = var12[var39];
                                 int var41 = var40 >> a(14258, 378533527156742195L) & a(4390, 4532122126271250085L);
                                 int var43 = var40 >> a(27573, 6883390274458092592L) & a(4390, 4532122126271250085L);
                                 int var45 = var40 & a(4390, 4532122126271250085L);
                                 var41 += var13;
                                 var43 += var13;
                                 var45 += var13;
                                 int var56 = var41;
                                 int var60 = a(4390, 4532122126271250085L);
                                 if (var5 != null) {
                                    if (var41 > var60) {
                                       var41 = a(4390, 4532122126271250085L);
                                    }

                                    var56 = var43;
                                    var60 = a(4390, 4532122126271250085L);
                                 }

                                 label139: {
                                    label279: {
                                       if (var5 != null) {
                                          if (var56 > var60) {
                                             var43 = a(4390, 4532122126271250085L);
                                          }

                                          var56 = var45;
                                          if (var5 == null) {
                                             break label279;
                                          }

                                          var60 = a(4390, 4532122126271250085L);
                                       }

                                       if (var56 <= var60) {
                                          break label139;
                                       }

                                       var56 = a(4390, 4532122126271250085L);
                                    }

                                    var45 = var56;
                                 }

                                 var12[var39] = a(1152, 4474412071046638343L)
                                    | var41 << a(14258, 378533527156742195L)
                                    | var43 << a(27573, 6883390274458092592L)
                                    | var45;
                              }
                           }

                           var18++;
                        }

                        if (var5 == null) {
                           break label224;
                        }
                        break;
                     }
                  }

                  var17++;
                  if (var5 == null) {
                     break label229;
                  }
                  break;
               }
            }

            var16++;
            if (var5 == null) {
               return var12;
            }
            continue label234;
         }

         return var12;
      }
   }

   public static int q(int var0, float var1) {
      int var3 = var0 >> a(8728, 7053032478917512604L) & a(15062, 5858205079870985565L);
      int var4 = var0 >> a(19318, 2169074326066603254L) & a(4390, 4532122126271250085L);
      int var5 = var0 & a(4390, 4532122126271250085L);
      String[] var10000 = W5.q();
      var3 = (int)((float)var3 + var1);
      var4 = (int)((float)var4 + var1);
      var5 = (int)((float)var5 + var1);
      String[] var2 = var10000;
      int var9 = var3;
      int var10001 = a(4390, 4532122126271250085L);
      if (var2 != null) {
         if (var3 > var10001) {
            var3 = a(4390, 4532122126271250085L);
         }

         var9 = var4;
         var10001 = a(4390, 4532122126271250085L);
      }

      if (var2 != null) {
         if (var9 > var10001) {
            var4 = a(4390, 4532122126271250085L);
         }

         var9 = var5;
         var10001 = a(4390, 4532122126271250085L);
      }

      if (var2 != null) {
         if (var9 > var10001) {
            var5 = a(4390, 4532122126271250085L);
         }

         var9 = a(3511, 1577154078738014781L) | var3 << a(14258, 378533527156742195L) | var4 << a(27573, 6883390274458092592L);
         var10001 = var5;
      }

      return var9 | var10001;
   }

   public static int c(int var0, float var1, int var2) {
      String[] var3;
      int var4;
      int var5;
      int var6;
      label50: {
         int var7;
         label53: {
            String[] var10000 = W5.q();
            var4 = var0 >> a(14258, 378533527156742195L) & a(4390, 4532122126271250085L);
            var5 = var0 >> a(27573, 6883390274458092592L) & a(4390, 4532122126271250085L);
            var6 = var0 & a(4390, 4532122126271250085L);
            var3 = var10000;
            var7 = var2;
            byte var10001 = 2;
            if (var3 != null) {
               if (var2 == 2) {
                  var4 = (int)((float)var4 + var1);
                  if (var3 != null) {
                     break label50;
                  }
               }

               var7 = var2;
               if (var3 == null) {
                  break label53;
               }

               var10001 = 1;
            }

            if (var7 == var10001) {
               var5 = (int)((float)var5 + var1);
               if (var3 != null) {
                  break label50;
               }
            }

            var7 = (int)((float)var6 + var1);
         }

         var6 = var7;
      }

      int var8 = var4;
      int var9 = a(4390, 4532122126271250085L);
      if (var3 != null) {
         if (var4 > var9) {
            var4 = a(4390, 4532122126271250085L);
         }

         var8 = var5;
         var9 = a(4390, 4532122126271250085L);
      }

      if (var3 != null) {
         if (var8 > var9) {
            var5 = a(4390, 4532122126271250085L);
         }

         var8 = var6;
         var9 = a(4390, 4532122126271250085L);
      }

      if (var3 != null) {
         if (var8 > var9) {
            var6 = a(4390, 4532122126271250085L);
         }

         var8 = a(1152, 4474412071046638343L) | var4 << a(14258, 378533527156742195L) | var5 << a(27573, 6883390274458092592L);
         var9 = var6;
      }

      return var8 | var9;
   }

   public static float L(float var0, float var1, float var2, float var3) {
      String[] var10000 = W5.q();
      float var5 = 0.0F;
      float var7 = 2.0F;
      String[] var4 = var10000;
      float var8 = 1.0F;
      var0 += 371.0F;
      var1 += 529.0F;
      int var9 = 0;

      while (true) {
         if (var9 < (int)var3) {
            var5 += UZ.G(var0, var1, var2) / var8;
            var0 *= var7;
            var1 *= var7;
            var12 = var8 * 2.0F;
            if (var4 == null) {
               break;
            }

            var8 = var12;
            var9++;
            if (var4 != null) {
               continue;
            }
         }

         var12 = var3 - (float)((int)var3);
         break;
      }

      float var6 = var12;
      float var13 = var6;
      if (var4 != null) {
         if (var6 != 0.0F) {
            var5 += var6 * UZ.G(var0, var1, var2) / var8;
         }

         var13 = var5;
      }

      return var13;
   }

   public float J(float var1, float var2) {
      String[] var10000 = W5.q();
      float var4 = this.A * var1 + this.I * this.N;
      float var5 = this.I * var1 - this.I * this.N;
      String[] var3 = var10000;
      float var7 = this.S;
      if (var3 != null) {
         if ((double)this.S == 0.0) {
            return UZ.G(var4, var2, var5);
         }

         var7 = var4;
      }

      return L(var7, var2, var5, this.S);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28546;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "vxH_aCm\r^Q^gEaAn\u001e\u0005:".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 3;
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
         var10007 = 3;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 33;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 51;
               break;
            case 3:
               var50 = 40;
               break;
            case 4:
               var50 = 23;
               break;
            case 5:
               var50 = 50;
               break;
            default:
               var50 = 11;
         }
      } else {
         var34 = 3;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 9070760393125776947L;
            long[] var14 = new long[11];
            int var11 = 0;
            String var12 = "\u009f\u0094P\u000f÷\u0088YZ\u001b±WD\u0005ä0iª\u008d¹{ºojÍ³òÄ¡\u00071\u0016\u0010²â\u0004\u0004èf\u0091\u0080¨a\u0086ÓD\u0085¥4µCÑ\u0005\u0005Ú\u0003¿\u001ca\u009c\\Ý\u0085Ê\u000b£è\fTvÍ,\u000e";
            int var13 = "\u009f\u0094P\u000f÷\u0088YZ\u001b±WD\u0005ä0iª\u008d¹{ºojÍ³òÄ¡\u00071\u0016\u0010²â\u0004\u0004èf\u0091\u0080¨a\u0086ÓD\u0085¥4µCÑ\u0005\u0005Ú\u0003¿\u001ca\u009c\\Ý\u0085Ê\u000b£è\fTvÍ,\u000e"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
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
                           c = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "^Xob¥è\u009b\u0091»\u0011cÿÇÀ¥\u007f";
                        var13 = "^Xob¥è\u009b\u0091»\u0011cÿÇÀ¥\u007f".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
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
         var10007 = 3;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 33;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 51;
               break;
            case 3:
               var50 = 40;
               break;
            case 4:
               var50 = 23;
               break;
            case 5:
               var50 = 50;
               break;
            default:
               var50 = 11;
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
                  var50 = 33;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 51;
                  break;
               case 3:
                  var50 = 40;
                  break;
               case 4:
                  var50 = 23;
                  break;
               case 5:
                  var50 = 50;
                  break;
               default:
                  var50 = 11;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 9070760393125776947L;
               long[] var6 = new long[11];
               int var3 = 0;
               String var4 = "\u009f\u0094P\u000f÷\u0088YZ\u001b±WD\u0005ä0iª\u008d¹{ºojÍ³òÄ¡\u00071\u0016\u0010²â\u0004\u0004èf\u0091\u0080¨a\u0086ÓD\u0085¥4µCÑ\u0005\u0005Ú\u0003¿\u001ca\u009c\\Ý\u0085Ê\u000b£è\fTvÍ,\u000e";
               int var5 = "\u009f\u0094P\u000f÷\u0088YZ\u001b±WD\u0005ä0iª\u008d¹{ºojÍ³òÄ¡\u00071\u0016\u0010²â\u0004\u0004èf\u0091\u0080¨a\u0086ÓD\u0085¥4µCÑ\u0005\u0005Ú\u0003¿\u001ca\u009c\\Ý\u0085Ê\u000b£è\fTvÍ,\u000e"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
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
                              c = new Integer[11];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "^Xob¥è\u009b\u0091»\u0011cÿÇÀ¥\u007f";
                           var5 = "^Xob¥è\u009b\u0091»\u0011cÿÇÀ¥\u007f".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
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
                  var50 = 33;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 51;
                  break;
               case 3:
                  var50 = 40;
                  break;
               case 4:
                  var50 = 23;
                  break;
               case 5:
                  var50 = 50;
                  break;
               default:
                  var50 = 11;
            }
         }
      }
   }
}






