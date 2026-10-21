package com.finalshell.core;

public class B_3 extends R_2 {
   public B_3() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public B_3(float[] var1) {
      this.T = var1[0];
      this.o = var1[1];
      this.I = var1[2];
      this.z = var1[3];
   }

   public B_3(float var1, float var2, float var3, float var4) {
      this.T = var1;
      this.o = var2;
      this.I = var3;
      this.z = var4;
   }

   public B_3(B_3 var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public B_3(R_2 var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public void S(Kl2_2 var1) {
      float var2 = var1.G * 0.5F;
      float var3 = (float)Math.cos((double)var2);
      float var4 = (float)Math.sin((double)var2);
      this.T = var1.C * var4;
      this.o = var1.w * var4;
      this.I = var1.J * var4;
      this.z = var3;
   }

   public void l() {
      float var1 = 1.0F / (this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z);
      this.T *= var1;
      this.o *= var1;
      this.I *= var1;
      this.z *= var1;
   }

   public void G(KB3 var1) {
      int var10000 = R_2.g();
      float var5 = var1.n + var1.B + var1.P;
      int var2 = var10000;
      double var12;
      var10000 = (var12 = (double)var5 - 0.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
      if (var2 == 0) {
         if (var10000 > 0) {
            float var3 = (float)Math.sqrt((double)(var5 + 1.0F));
            this.z = var3 / 2.0F;
            var3 = 0.5F / var3;
            this.T = (var1.a - var1.T) * var3;
            this.o = (var1.v - var1.Z) * var3;
            this.I = (var1.i - var1.C) * var3;
            if (var2 == 0) {
               return;
            }
         }

         var10000 = 0;
      }

      label66: {
         int var4;
         label76: {
            var4 = var10000;
            float var13;
            var10000 = (var13 = var1.B - var1.n) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            if (var2 == 0) {
               if (var10000 > 0) {
                  var4 = 1;
                  float var14;
                  var10000 = (var14 = var1.P - var1.B) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
                  if (var2 != 0) {
                     break label66;
                  }

                  if (var10000 <= 0) {
                     break label76;
                  }

                  var4 = 2;
                  if (var2 == 0) {
                     break label76;
                  }
               }

               float var15;
               var10000 = (var15 = var1.P - var1.n) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            }

            if (var2 != 0) {
               break label66;
            }

            if (var10000 > 0) {
               var4 = 2;
            }
         }

         var10000 = var4;
      }

      switch (var10000) {
         case 0:
            float var7 = (float)Math.sqrt((double)(var1.n - (var1.B + var1.P) + 1.0F));
            this.T = var7 * 0.5F;
            if (var2 == 0) {
               if ((double)var7 != 0.0) {
                  var7 = 0.5F / var7;
               }

               this.z = (var1.a - var1.T) * var7;
               this.o = (var1.i + var1.C) * var7;
               this.I = (var1.Z + var1.v) * var7;
            }

            if (var2 == 0) {
               break;
            }
         case 1:
            float var8 = (float)Math.sqrt((double)(var1.B - (var1.P + var1.n) + 1.0F));
            this.o = var8 * 0.5F;
            if (var2 == 0) {
               if ((double)var8 != 0.0) {
                  var8 = 0.5F / var8;
               }

               this.z = (var1.v - var1.Z) * var8;
               this.I = (var1.a + var1.T) * var8;
               this.T = (var1.C + var1.i) * var8;
            }

            if (var2 == 0) {
               break;
            }
         case 2:
            float var9 = (float)Math.sqrt((double)(var1.n - (var1.B + var1.P) + 1.0F));
            this.I = var9 * 0.5F;
            if (var2 == 0) {
               if ((double)var9 != 0.0) {
                  var9 = 0.5F / var9;
               }

               this.z = (var1.i - var1.C) * var9;
               this.T = (var1.v + var1.Z) * var9;
            }

            this.o = (var1.T + var1.a) * var9;
      }
   }
}





