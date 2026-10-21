package com.finalshell.core;

public class A1_2 {
   public float[] D;
   public float[] U;
   public float[] c;

   public A1_2(int var1) {
      this.D = new float[var1];
      String var10000 = UZ.h();
      this.U = new float[var1];
      this.c = new float[var1];
      byte var3 = 1;
      String var2 = var10000;
      int var4 = 0;

      while (var4 < var1) {
         var3 <<= 1;
         double var5 = (-Math.PI * 2) / (double)var3;
         this.D[var4] = (float)Math.sin(0.5 * var5);
         this.U[var4] = -2.0F * this.D[var4] * this.D[var4];
         this.c[var4] = (float)Math.sin(var5);
         var4++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void L(int var1, float[] var2, float[] var3) {
      int var11;
      String var10000 = UZ.h();
      int var5 = 0;
      int var6 = 0;
      String var4 = var10000;

      while (var6 < var1) {
         int var10 = var6;
         int var10001 = var5;
         if (var4 == null) {
            if (var6 > var5) {
               float var7 = var2[var5];
               var2[var5] = var2[var6];
               var2[var6] = var7;
               var7 = var3[var5];
               var3[var5] = var3[var6];
               var3[var6] = var7;
            }

            var10 = var1;
            var10001 = 1;
         }

         int var9 = var10 >> var10001;

         while (true) {
            if (var5 >= var9) {
               var11 = var9;
               var10001 = 2;
               if (var4 != null || var4 != null) {
                  break;
               }

               if (var9 >= 2) {
                  var5 -= var9;
                  var9 >>= 1;
                  if (var4 == null) {
                     continue;
                  }
               }
            }

            var11 = var5;
            var10001 = var9;
            break;
         }

         var5 = var11 + var10001;
         var6++;
         if (var4 != null) {
            break;
         }
      }
   }

   public void L(int var1, int var2, int var3, float[] var4, float[] var5) {
      int var26;
      byte var7 = 1;
      String var10000 = UZ.h();
      int var8 = 0;
      String var6 = var10000;

      label61:
      while (true) {
         int var25 = var8;

         label58:
         while (var25 < var2) {
            byte var16 = var7;
            var7 <<= 1;
            float var15 = (float)var3 * this.D[var8];
            float var11 = this.U[var8];
            float var12 = (float)var3 * this.c[var8];
            float var9 = 1.0F;
            float var10 = 0.0F;
            var26 = 0;
            if (var6 != null) {
               break label61;
            }

            int var17 = 0;

            while (var17 < var16) {
               var25 = var17;
               if (var6 != null) {
                  continue label58;
               }

               int var18 = var17;

               while (true) {
                  if (var18 < var1) {
                     int var19 = var18 + var16;
                     float var20 = var4[var19];
                     float var21 = var5[var19];
                     float var13 = var9 * var20 - var10 * var21;
                     float var14 = var10 * var20 + var9 * var21;
                     var4[var19] = var4[var18] - var13;
                     var4[var18] += var13;
                     var5[var19] = var5[var18] - var14;
                     var5[var18] += var14;
                     var18 += var7;
                     if (var6 != null) {
                        break;
                     }

                     if (var6 == null) {
                        continue;
                     }
                  }

                  var15 = var9;
                  var9 += var9 * var11 - var10 * var12;
                  var10 += var10 * var11 + var15 * var12;
                  var17++;
                  break;
               }

               if (var6 != null) {
                  break;
               }
            }

            var8++;
            if (var6 == null) {
               continue label61;
            }
            break;
         }

         var26 = var3;
         break;
      }

      if (var26 == -1) {
         float var22 = 1.0F / (float)var1;
         int var23 = 0;

         while (var23 < var1) {
            var4[var23] *= var22;
            var5[var23] *= var22;
            var23++;
            if (var6 != null) {
               break;
            }
         }
      }
   }

   public void r(float[] var1, float[] var2, int var3, int var4, boolean var5) {
      String var10000 = UZ.h();
      this.L(var4, var1, var2);
      String var6 = var10000;
      int var10003 = (var5) ? 1 : 0;
      if (var6 == null) {
         var10003 = var5 != 0 ? 1 : -1;
      }

      this.L(var4, var3, var10003, var1, var2);
   }

   public void f(float[] var1, float[] var2, int var3, int var4, boolean var5) {
      float[] var11;
      String var10000 = UZ.h();
      int var7 = this.r(var3);
      int var8 = this.r(var4);
      int var9 = Math.max(var4, var3);
      String var6 = var10000;
      float[] var10 = new float[var9];
      var11 = new float[var9];
      int var12 = 0;

      while (true) {
         if (var12 < var4) {
            int var13 = var12 * var3;
            System.arraycopy(var1, var13, var10, 0, var3);
            System.arraycopy(var2, var13, var11, 0, var3);
            this.r(var10, var11, var7, var3, var5);
            System.arraycopy(var10, 0, var1, var13, var3);
            System.arraycopy(var11, 0, var2, var13, var3);
            var12++;
            if (var6 != null) {
               break;
            }

            if (var6 == null) {
               continue;
            }
         }

         var12 = 0;
         break;
      }

      while (var12 < var3) {
         int var15 = var12;
         int var14 = 0;

         while (true) {
            if (var14 < var4) {
               var10[var14] = var1[var15];
               var11[var14] = var2[var15];
               var15 += var3;
               var14++;
               if (var6 != null) {
                  break;
               }

               if (var6 == null) {
                  continue;
               }
            }

            this.r(var10, var11, var8, var4, var5);
            var15 = var12;
            break;
         }

         var14 = 0;

         while (true) {
            if (var14 < var4) {
               var1[var15] = var10[var14];
               var2[var15] = var11[var14];
               var15 += var3;
               var14++;
               if (var6 != null) {
                  break;
               }

               if (var6 == null) {
                  continue;
               }
            }

            var12++;
            break;
         }

         if (var6 != null) {
            break;
         }
      }
   }

   public int r(int var1) {
      String var10000 = UZ.h();
      byte var3 = 1;
      String var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var3 < var1) {
            var3 *= 2;
            var4++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         if (var2 != null) {
            return var3;
         }

         if (var3 == var1) {
            return var4;
         }
         break;
      }

      return -1;
   }
}





