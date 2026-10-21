package com.finalshell.core;

public class Ek2 implements SC {
   public float[] D;
   public float M;
   public float q;
   public float y;
   public SC N;

   public Ek2(float var1, float var2, float var3) {
      this(var1, var2, var3, new UZ());
   }

   public Ek2(float var1, float var2, float var3, SC var4) {
   super();
      String var10000 = UZ.h();
      this.M = var1;
      this.q = var2;
      this.y = var3;
      this.N = var4;
      this.D = new float[(int)var3 + 1];
      String var5 = var10000;
      float var6 = 1.0F;
      int var7 = 0;

      while (var7 <= (int)var3) {
         this.D[var7] = (float)Math.pow((double)var6, (double)(-var1));
         var6 *= var2;
         var7++;
         if (var5 != null) {
            break;
         }
      }
   }

   public void b(SC var1) {
      this.N = var1;
   }

   public SC C() {
      return this.N;
   }

   @Override
   public float h(float var1, float var2) {
      String var10000 = UZ.h();
      float var4 = 0.0F;
      var1 += 371.0F;
      String var3 = var10000;
      var2 += 529.0F;
      int var6 = 0;

      while (true) {
         if (var6 < (int)this.y) {
            var4 += this.N.h(var1, var2) * this.D[var6];
            var1 *= this.q;
            var9 = var2 * this.q;
            if (var3 != null) {
               break;
            }

            var2 = var9;
            var6++;
            if (var3 == null) {
               continue;
            }
         }

         var9 = this.y - (float)((int)this.y);
         break;
      }

      float var5 = var9;
      float var10 = var5;
      if (var3 == null) {
         if (var5 != 0.0F) {
            var4 += var5 * this.N.h(var1, var2) * this.D[var6];
         }

         var10 = var4;
      }

      return var10;
   }
}





