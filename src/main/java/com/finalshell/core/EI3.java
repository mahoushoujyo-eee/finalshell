package com.finalshell.core;

import java.util.Random;

public class EI3 implements SC {
   public float m = 2.0F;
   public boolean E;
   public boolean r;
   public float[] R;
   public Random M;
   public LV[] w;
   public static long[] a;
   public static Integer[] b;

   public EI3() {
      String var10000 = UZ.h();
      this.E = false;
      String var1 = var10000;
      this.r = false;
      this.R = new float[]{1.0F, 0.0F, 0.0F, 0.0F};
      this.M = new Random();
      this.w = null;
      this.w = new LV[2];
      int var2 = 0;

      while (var2 < this.w.length) {
         this.w[var2] = new LV(this);
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   public void a(int var1, float var2) {
      this.R[var1] = var2;
   }

   public float B(int var1) {
      return this.R[var1];
   }

   public float f(float var1, float var2, int var3, int var4, LV[] var5) {
      String var10000 = UZ.h();
      this.M.setSeed((long)(a(12881, 8123721411019069730L) * var3 + a(28541, 1920118299313570831L) * var4));
      int var7 = 3 + this.M.nextInt() % 4;
      byte var17 = 4;
      int var8 = 0;
      String var6 = var10000;

      label87:
      while (true) {
         int var19 = var8;

         label84:
         while (var19 < var17) {
            float var9 = this.M.nextFloat();
            float var10 = this.M.nextFloat();
            float var11 = Math.abs(var1 - var9);
            float var12 = Math.abs(var2 - var10);
            if (var6 != null) {
               return this.m;
            }

            float var13;
            label81: {
               label93: {
                  float var23;
                  int var21 = (var23 = this.m - 1.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
                  if (var6 == null) {
                     if (!var21) {
                        var13 = var11 + var12;
                        if (var6 == null) {
                           break label81;
                        }
                     }

                     var22 = this.m;
                     if (var6 != null) {
                        break label93;
                     }

                     float var24;
                     var21 = (var24 = this.m - 2.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
                  }

                  if (!var21) {
                     var13 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
                     if (var6 == null) {
                        break label81;
                     }
                  }

                  var22 = (float)Math.pow(Math.pow((double)var11, (double)this.m) + Math.pow((double)var12, (double)this.m), (double)(1.0F / this.m));
               }

               var13 = var22;
            }

            int var14 = 0;

            while (var14 < var5.length) {
               double var25;
               var19 = (var25 = (double)var5[var14].g - (Double.POSITIVE_INFINITY)) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               if (var6 != null) {
                  continue label84;
               }

               if (var6 == null) {
                  if (var19 == 0) {
                     LV var15 = var5[var14];
                     var15.g = var13;
                     var15.t = var9;
                     var15.Y = var10;
                     var5[var14] = var15;
                     if (var6 == null) {
                        break;
                     }
                  }

                  float var26;
                  var19 = (var26 = var13 - var5[var14].g) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               }

               if (var19 < 0) {
                  LV var18 = var5[var5.length - 1];
                  int var16 = var5.length - 1;

                  label60: {
                     while (var16 > var14) {
                        var5[var16] = var5[var16 - 1];
                        var16--;
                        if (var6 != null) {
                           break label60;
                        }

                        if (var6 != null) {
                           break;
                        }
                     }

                     var18.g = var13;
                     var18.t = var9;
                     var18.Y = var10;
                     var5[var14] = var18;
                  }

                  if (var6 == null) {
                     break;
                  }
               }

               var14++;
               if (var6 != null) {
                  break;
               }
            }

            var8++;
            if (var6 == null) {
               continue label87;
            }
            break;
         }

         return var5[1].g;
      }
   }

   @Override
   public float h(float var1, float var2) {
      String var10000 = UZ.h();
      int var4 = 0;
      String var3 = var10000;

      while (true) {
         if (var4 < this.w.length) {
            this.w[var4].g = Float.POSITIVE_INFINITY;
            var4++;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         var4 = (int)var1;
         break;
      }

      int var5 = (int)var2;
      float var6 = var1 - (float)var4;
      float var7 = var2 - (float)var5;
      float var8 = this.f(var6, var7, var4, var5, this.w);
      float var16;
      int var13 = (var16 = var8 - var7) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      if (var3 == null) {
         if (var13 > 0) {
            var8 = this.f(var6, var7 + 1.0F, var4, var5 - 1, this.w);
         }

         float var17;
         var13 = (var17 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      if (var3 == null) {
         if (var13 > 0) {
            var8 = this.f(var6, var7 - 1.0F, var4, var5 + 1, this.w);
         }

         float var18;
         var13 = (var18 = var8 - var6) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
      }

      label98: {
         label82:
         if (var3 == null) {
            if (var13 > 0) {
               this.f(var6 + 1.0F, var7, var4 - 1, var5, this.w);
               float var19;
               var13 = (var19 = var8 - var7) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  if (var13 > 0) {
                     var8 = this.f(var6 + 1.0F, var7 + 1.0F, var4 - 1, var5 - 1, this.w);
                  }

                  float var20;
                  var13 = (var20 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
               }

               if (var3 != null) {
                  break label82;
               }

               if (var13 > 0) {
      int var14;
      int var14;
                  var8 = this.f(var6 + 1.0F, var7 - 1.0F, var4 - 1, var5 + 1, this.w);
               }
            }

            var14 = var8;
            if (var3 != null) {
               break label98;
            }

            float var21;
            var13 = (var21 = var8 - (1.0F - var6)) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
         }

         if (var13 > 0) {
            var8 = this.f(var6 - 1.0F, var7, var4 + 1, var5, this.w);
            float var22;
            int var15 = (var22 = var8 - var7) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
            if (var3 == null) {
               if (var15 > 0) {
                  var8 = this.f(var6 - 1.0F, var7 + 1.0F, var4 + 1, var5 - 1, this.w);
               }

               var14 = var8;
               if (var3 != null) {
                  break label98;
               }

               float var23;
               var15 = (var23 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            }

            if (var15 > 0) {
               var8 = this.f(var6 - 1.0F, var7 - 1.0F, var4 + 1, var5 + 1, this.w);
            }
         }

         var14 = 0.0F;
      }

      float var9 = var14;
      int var10 = 0;

      while (true) {
         if (var10 < 2) {
            var9 += this.R[var10] * this.w[var10].g;
            var10++;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         if (this.r) {
            var9 = (float)((double)var9 + Math.atan2((double)(var7 - this.w[0].Y), (double)(var6 - this.w[0].t)) / (Math.PI * 2) + 0.5);
         }
         break;
      }

      return var9;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27506;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3493336851624527988L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Kkè\u007f,\u008c\u008clÝ\u0086\u0004ÍWÚSm";
      int var5 = "Kkè\u007f,\u008c\u008clÝ\u0086\u0004ÍWÚSm".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}






