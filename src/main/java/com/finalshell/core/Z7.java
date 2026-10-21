package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class Z7 extends Z9 {
   protected float I;
   protected Kernel n;
   public static long[] c;
   public static Integer[] d;

   public Z7() {
      this(2.0F);
   }

   public Z7(float var1) {
      this.o(var1);
   }

   public void o(float var1) {
      this.I = var1;
      this.n = i(var1);
   }

   public float V() {
      return this.I;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4;
      int var5;
      label13: {
         String[] var10000 = ZH.U();
         var4 = var1.getWidth();
         String[] var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var8 = var2;
         if (var3 == null) {
            if (var2 != null) {
               break label13;
            }

            var8 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var8;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      var1.getRGB(0, 0, var4, var5, var6, 0, var4);
      s(this.n, var6, var7, var4, var5, this.T, i);
      s(this.n, var7, var6, var5, var4, this.T, i);
      var2.setRGB(0, 0, var4, var5, var6, 0, var4);
      return var2;
   }

   public static void s(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      String[] var10000 = ZH.U();
      float[] var8 = var0.getKernelData(null);
      String[] var7 = var10000;
      int var9 = var0.getWidth();
      int var10 = var9 / 2;
      int var11 = 0;

      label111:
      while (true) {
         int var27 = var11;

         label109:
         while (var27 < var4) {
            int var12 = var11;
            int var13 = var11 * var3;
            int var14 = 0;

            while (var14 < var3) {
               float var15 = 0.0F;
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;
               var27 = -var10;
               if (var7 != null) {
                  continue label109;
               }

               int var19 = var27;

               while (true) {
                  if (var19 <= var10) {
                     float var20 = var8[var10 + var19];
                     if (var7 == null) {
                        float var31;
                        var28 = (var31 = var20 - 0.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                        if (var7 != null) {
                           break;
                        }

                        if (var28 != 0) {
      int var29;
                           label95: {
                              int var21;
                              label118: {
                                 var21 = var14 + var19;
                                 var29 = var21;
                                 if (var7 == null) {
                                    if (var21 < 0) {
                                       var29 = var6;
                                       int var10001 = i;
                                       if (var7 == null) {
                                          if (var6 == i) {
                                             var21 = 0;
                                             if (var7 == null) {
                                                break label118;
                                             }
                                          }

                                          var29 = var6;
                                          if (var7 != null) {
                                             break label95;
                                          }

                                          var10001 = G;
                                       }

                                       if (var29 != var10001) {
                                          break label118;
                                       }

                                       var21 = (var14 + var3) % var3;
                                       if (var7 == null) {
                                          break label118;
                                       }
                                    }

                                    var29 = var21;
                                 }

                                 if (var7 != null) {
                                    break label95;
                                 }

                                 label80:
                                 if (var29 >= var3) {
                                    var29 = var6;
                                    int var30 = i;
                                    if (var7 == null) {
                                       if (var6 == i) {
                                          var21 = var3 - 1;
                                          if (var7 == null) {
                                             break label80;
                                          }
                                       }

                                       var29 = var6;
                                       if (var7 != null) {
                                          break label95;
                                       }

                                       var30 = G;
                                    }

                                    if (var29 == var30) {
                                       var21 = (var14 + var3) % var3;
                                    }
                                 }
                              }

                              var29 = var1[var13 + var21];
                           }

                           int var22 = var29;
                           var18 += var20 * (float)(var22 >> b(26857, 705373954430749629L) & b(6705, 1882377701407930722L));
                           var15 += var20 * (float)(var22 >> b(2814, 2400866963155233192L) & b(9559, 4802532881827956226L));
                           var16 += var20 * (float)(var22 >> b(10486, 1390218484461669284L) & b(9559, 4802532881827956226L));
                           var17 += var20 * (float)(var22 & b(9559, 4802532881827956226L));
                        }

                        var19++;
                     }

                     if (var7 == null) {
      int var28;
                        continue;
                     }
                  }

                  var28 = var5;
                  break;
               }

               if (var7 == null) {
                  var28 = var28 != 0 ? N6.W((int)((double)var18 + 0.5)) : b(9559, 4802532881827956226L);
               }

               var19 = var28;
               int var24 = N6.W((int)((double)var15 + 0.5));
               int var25 = N6.W((int)((double)var16 + 0.5));
               int var26 = N6.W((int)((double)var17 + 0.5));
               var2[var12] = var19 << b(11361, 3626671100152123185L)
                  | var24 << b(29157, 7833370080731124402L)
                  | var25 << b(12814, 5450116554555625823L)
                  | var26;
               var12 += var4;
               var14++;
               if (var7 != null) {
                  break;
               }
            }

            var11++;
            if (var7 != null) {
               return;
            }
            continue label111;
         }

         return;
      }
   }

   public static Kernel i(float var0) {
      int var2 = (int)Math.ceil((double)var0);
      String[] var10000 = ZH.U();
      int var3 = var2 * 2 + 1;
      float[] var4 = new float[var3];
      float var5 = var0 / 3.0F;
      float var6 = 2.0F * var5 * var5;
      float var7 = (float) (Math.PI * 2) * var5;
      float var8 = (float)Math.sqrt((double)var7);
      float var9 = var0 * var0;
      String[] var1 = var10000;
      float var10 = 0.0F;
      int var11 = 0;
      int var12 = -var2;

      while (true) {
         if (var12 <= var2) {
            label36: {
               float var13;
               label35: {
                  var13 = (float)(var12 * var12);
                  if (var1 == null) {
                     float var16;
                     var15 = (var16 = var13 - var9) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
                     if (var1 != null) {
                        break;
                     }

                     if (var15 <= 0) {
                        break label35;
                     }

                     var4[var11] = 0.0F;
                  }

                  if (var1 == null) {
                     break label36;
                  }
               }

               var4[var11] = (float)Math.exp((double)(-var13 / var6)) / var8;
            }

            var10 += var4[var11];
            var11++;
            var12++;
            if (var1 == null) {
               continue;
            }
         }

         var15 = 0;
         break;
      }

      var12 = var15;

      while (var12 < var3) {
         var4[var12] /= var10;
         var12++;
         if (var1 != null) {
            break;
         }
      }

      return new Kernel(var3, 1, var4);
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9041;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5113615349178364905L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "\u00901ÊÊG\u0001b¾ó\u001d^X´|üÀÌÌéUôKÊt¹Gõ\u008c«GøEÔ]GK.¿õ\u0014j0\fíöj¸L";
      int var5 = "\u00901ÊÊG\u0001b¾ó\u001d^X´|üÀÌÌéUôKÊt¹Gõ\u008c«GøEÔ]GK.¿õ\u0014j0\fíöj¸L".length();
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
                     c = var6;
                     d = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "#®E\fÅä!K\"Gi/~\u0014ZQ";
                  var5 = "#®E\fÅä!K\"Gi/~\u0014ZQ".length();
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






