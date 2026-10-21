package com;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class g8_2 extends gy_4 {
   private float W = 1.0F;
   private float n = 1.0F;
   private float N = 2.0F;
   private p9_2[] w;
   private p9_2[] G;
   private p9_2[] e;
   private float b;
   private float R;
   private static final String a;

   public void I(float var1) {
      this.W = var1;
   }

   public float R() {
      return this.W;
   }

   public void W(float var1) {
      this.n = var1;
   }

   public float j() {
      return this.n;
   }

   public void U(float var1) {
      this.N = var1;
   }

   public float M() {
      return this.N;
   }

   public void d(p9_2[] var1) {
      this.w = var1;
   }

   public p9_2[] K() {
      return this.w;
   }

   public void K(p9_2[] var1) {
      this.G = var1;
   }

   public p9_2[] E() {
      return this.G;
   }

   protected void B(int var1, int var2, Point var3) {
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      float var5 = 0.0F;
      float var6 = 0.0F;
      String[] var10000 = com.W5.q();
      float var7 = 0.0F;
      float var11 = 0.001F;
      float var12 = 1.5F * this.N + 0.5F;
      float var13 = this.n;
      float var14 = 0.0F;
      float var15 = 0.0F;
      String[] var4 = var10000;
      float var16 = 0.0F;
      int var17 = 0;

      while (true) {
         if (var17 < this.w.length) {
            p9_2 var18 = this.w[var17];
            p9_2 var19 = this.e[var17];
            float var20 = (float)(var1 - var19.i);
            float var21 = (float)(var2 - var19.l);
            var7 = (var20 * (float)var19.z + var21 * (float)var19.G) / var19.f;
            float var9 = (var21 * (float)var19.z - var20 * (float)var19.G) / var19.V;
            if (var4 == null) {
               break;
            }

            float var8;
            label53: {
               float var29;
               int var27 = (var29 = var7 - 0.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               if (var4 != null) {
                  if (var27 <= 0) {
                     var8 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21));
                     if (var4 != null) {
                        break label53;
                     }
                  }

                  float var30;
                  var27 = (var30 = var7 - 1.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
               }

               label54: {
                  if (var4 != null) {
                     if (var27 >= 0) {
                        var20 = (float)(var1 - var19.q);
                        var21 = (float)(var2 - var19.W);
                        var8 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21));
                        if (var4 != null) {
                           break label53;
                        }
                     }

                     var28 = var9;
                     if (var4 == null) {
                        break label54;
                     }

                     float var31;
                     var27 = (var31 = var9 - 0.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                  }

                  if (var27 >= 0) {
                     var8 = var9;
                     if (var4 != null) {
                        break label53;
                     }
                  }

                  var28 = -var9;
               }

               var8 = var28;
            }

            var5 = (float)var18.i + var7 * (float)var18.z - var9 * (float)var18.G / var18.V;
            var6 = (float)var18.l + var7 * (float)var18.G + var9 * (float)var18.z / var18.V;
            float var10 = (float)Math.pow(Math.pow((double)var19.V, (double)var13) / (double)(var11 + var8), (double)var12);
            var15 += (var5 - (float)var1) * var10;
            var16 += (var6 - (float)var2) * var10;
            var14 += var10;
            var17++;
            if (var4 != null) {
               continue;
            }
         }

         var3[0] = (float)var1 + var15 / var14 + 0.5F;
         var3[1] = (float)var2 + var16 / var14 + 0.5F;
         break;
      }
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      g8_2 var7;
      label39: {
         String[] var10000 = com.W5.q();
         this.b = this.b;
         var3 = var10000;
         this.R = this.R;
         p9_2[] var6 = this.w;
         if (var3 != null) {
            if (this.w == null) {
               return var1;
            }

            var7 = this;
            if (var3 == null) {
               break label39;
            }

            var6 = this.G;
         }

         if (var6 == null) {
            return var1;
         }

         var7 = this;
      }

      var7.e = new p9_2[this.w.length];
      int var4 = 0;

      while (true) {
         if (var4 < this.w.length) {
            p9_2 var5 = this.e[var4] = new p9_2(
               NM.Q(this.W, this.w[var4].i, this.G[var4].i),
               NM.Q(this.W, this.w[var4].l, this.G[var4].l),
               NM.Q(this.W, this.w[var4].q, this.G[var4].q),
               NM.Q(this.W, this.w[var4].W, this.G[var4].W)
            );
            var5.o();
            this.w[var4].o();
            var4++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var2 = super.filter(var1, var2);
         this.e = null;
         break;
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "UxR\u001dH9q>WH\fK/%FpS\u0019\te+".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 113;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 113;
         var10006 = var0;
      } else {
         var6 = 113;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 113;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 96;
               break;
            case 1:
               var23 = 96;
               break;
            case 2:
               var23 = 80;
               break;
            case 3:
               var23 = 24;
               break;
            case 4:
               var23 = 86;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 116;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





