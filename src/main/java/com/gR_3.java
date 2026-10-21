package com;

public class gR_3 extends gy_4 {
   private float V = 32.0F;
   private float k = 1.0F;
   private float B = 0.0F;
   private float v = 1.0F;
   private float s = 1.0F;
   private float T = 0.0F;
   private float w = 1.0F;
   private float o = 0.0F;
   private float F = 0.0F;
   private float g = 1.0F;
   private static final String a;

   public void D(float var1) {
      this.v = var1;
   }

   public float k() {
      return this.v;
   }

   public void e(float var1) {
      this.V = var1;
   }

   public float v() {
      return this.V;
   }

   public void J(float var1) {
      this.k = var1;
   }

   public float U() {
      return this.k;
   }

   public void Q(float var1) {
      this.B = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.w = var2;
      this.o = var3;
      this.F = -var3;
      this.g = var2;
   }

   public float K() {
      return this.B;
   }

   public void q(float var1) {
      this.s = var1;
   }

   public float g() {
      return this.s;
   }

   public void M(float var1) {
      this.T = var1;
   }

   public float M() {
      return this.T;
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      float var5 = this.w * (float)var1 + this.o * (float)var2;
      String[] var10000 = com.W5.q();
      float var6 = this.F * (float)var1 + this.g * (float)var2;
      String[] var4 = var10000;
      var5 /= this.V;
      var6 /= this.V * this.k;
      if (var4 != null) {
         if (this.s == 1.0F) {
            var3[0] = (float)var1 + this.v * uZ.G(var5 + 0.5F, var6, this.T);
            var3[1] = (float)var2 + this.v * uZ.G(var5, var6 + 0.5F, this.T);
            if (var4 != null) {
               return;
            }
         }

         var3[0] = (float)var1 + this.v * uZ.b(var5 + 0.5F, var6, this.s, this.T);
      }

      var3[1] = (float)var2 + this.v * uZ.b(var5, var6 + 0.5F, this.s, this.T);
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "$_<H_q#Oe8U]-yN".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 59;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 59;
         var10006 = var0;
      } else {
         var6 = 59;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 59;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 91;
               break;
            case 1:
               var23 = 13;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 7;
               break;
            case 4:
               var23 = 11;
               break;
            case 5:
               var23 = 56;
               break;
            default:
               var23 = 108;
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





