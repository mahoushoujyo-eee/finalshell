package com;

public class gC_3 extends g3_2 {
   private float t = 0.4F;
   private boolean K = false;
   private int M;
   private float f;
   private static final String d;
   private static final long j;

   public gC_3() {
      this.M = (int)j;
      this.f = 0.1F;
      this.u(16.0F);
      this.U(0.0F);
   }

   public void Z(float var1) {
      this.t = var1;
   }

   public float J() {
      return this.t;
   }

   public void D(boolean var1) {
      this.K = var1;
   }

   public boolean H() {
      return this.K;
   }

   public void m(int var1) {
      this.M = var1;
   }

   public int v() {
      return this.M;
   }

   public void z(float var1) {
      this.f = var1;
   }

   public float s() {
      return this.f;
   }

   @Override
   public int J(int var1, int var2, int[] var3, int var4, int var5) {
      float var7 = this.i * (float)var1 + this.x * (float)var2;
      float var8 = this.O * (float)var1 + this.h * (float)var2;
      var7 /= this.E;
      var8 /= this.E * this.N;
      String[] var10000 = com.W5.q();
      var7 += 1000.0F;
      var8 += 1000.0F;
      float var9 = this.h(var7, var8);
      float var10 = this.n[0].S;
      int var11 = NM.L((int)((this.n[0].E - 1000.0F) * this.E), 0, var4 - 1);
      String[] var6 = var10000;
      int var12 = NM.L((int)((this.n[0].k - 1000.0F) * this.E), 0, var5 - 1);
      int var13 = var3[var12 * var4 + var11];
      int var23 = this.K;
      if (var6 != null) {
         if (this.K) {
            float var14 = this.n[1].S;
            var11 = NM.L((int)((this.n[1].E - 1000.0F) * this.E), 0, var4 - 1);
            var12 = NM.L((int)((this.n[1].k - 1000.0F) * this.E), 0, var5 - 1);
            int var15 = var3[var12 * var4 + var11];
            var13 = NM.n(0.5F * var10 / var14, var13, var15);
            if (var6 != null) {
               return var13;
            }
         }

         var9 = 1.0F - NM.k(this.t, this.t + this.f, var10);
         var23 = NM.n(var9, this.M, var13);
      }

      return var23;
   }

   @Override
   public String toString() {
      return d;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Ej-\u000bm\u000fnafz>n\naaj9\u0002h\u0019j;-{".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 19;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 19;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 6;
               break;
            case 1:
               var21 = 16;
               break;
            case 2:
               var21 = 70;
               break;
            case 3:
               var21 = 125;
               break;
            case 4:
               var21 = 18;
               break;
            case 5:
               var21 = 112;
               break;
            default:
               var21 = 28;
         }
      } else {
         var13 = 19;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 8141687885352367223L;
            long var12 = -3468899188269943689L ^ var3;
            var8 = -1;
            j = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 19;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 6;
               break;
            case 1:
               var21 = 16;
               break;
            case 2:
               var21 = 70;
               break;
            case 3:
               var21 = 125;
               break;
            case 4:
               var21 = 18;
               break;
            case 5:
               var21 = 112;
               break;
            default:
               var21 = 28;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 6;
                  break;
               case 1:
                  var21 = 16;
                  break;
               case 2:
                  var21 = 70;
                  break;
               case 3:
                  var21 = 125;
                  break;
               case 4:
                  var21 = 18;
                  break;
               case 5:
                  var21 = 112;
                  break;
               default:
                  var21 = 28;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 8141687885352367223L;
               long var11 = -3468899188269943689L ^ var0;
               var6 = -1;
               j = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 6;
                  break;
               case 1:
                  var21 = 16;
                  break;
               case 2:
                  var21 = 70;
                  break;
               case 3:
                  var21 = 125;
                  break;
               case 4:
                  var21 = 18;
                  break;
               case 5:
                  var21 = 112;
                  break;
               default:
                  var21 = 28;
            }
         }
      }
   }
}





