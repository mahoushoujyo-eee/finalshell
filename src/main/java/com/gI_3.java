package com;

public class gI_3 extends g3_2 {
   private float s = 0.4F;
   private boolean R = false;
   private int m;
   private static final String d;
   private static final long f;

   public gI_3() {
      this.m = (int)f;
      this.u(16.0F);
      this.U(0.0F);
   }

   public void O(float var1) {
      this.s = var1;
   }

   public float a() {
      return this.s;
   }

   public void x(boolean var1) {
      this.R = var1;
   }

   public boolean t() {
      return this.R;
   }

   public void o(int var1) {
      this.m = var1;
   }

   public int h() {
      return this.m;
   }

   @Override
   public int J(int var1, int var2, int[] var3, int var4, int var5) {
      float var7 = this.i * (float)var1 + this.x * (float)var2;
      String[] var10000 = com.W5.q();
      float var8 = this.O * (float)var1 + this.h * (float)var2;
      String[] var6 = var10000;
      var7 /= this.E;
      var8 /= this.E * this.N;
      var7 += 1000.0F;
      var8 += 1000.0F;
      float var9 = this.h(var7, var8);
      float var10 = this.n[0].S;
      float var11 = this.n[1].S;
      int var12 = NM.L((int)((this.n[0].E - 1000.0F) * this.E), 0, var4 - 1);
      int var13 = NM.L((int)((this.n[0].k - 1000.0F) * this.E), 0, var5 - 1);
      int var14 = var3[var13 * var4 + var12];
      var9 = (var11 - var10) / this.s;
      var9 = NM.k(0.0F, this.s, var9);
      int var25 = this.R;
      if (var6 != null) {
         if (this.R) {
            var12 = NM.L((int)((this.n[1].E - 1000.0F) * this.E), 0, var4 - 1);
            var13 = NM.L((int)((this.n[1].k - 1000.0F) * this.E), 0, var5 - 1);
            int var15 = var3[var13 * var4 + var12];
            var15 = NM.n(0.5F, var15, var14);
            var14 = NM.n(var9, var15, var14);
            if (var6 != null) {
               return var14;
            }
         }

         var25 = NM.n(var9, this.m, var14);
      }

      return var25;
   }

   @Override
   public String toString() {
      return d;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Pa\u0007e\u0018D0tmPC\u0006Q\"ti\u0013l\u001dR4.&Q".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 92;
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
         var10007 = 92;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 84;
               break;
            case 2:
               var21 = 35;
               break;
            case 3:
               var21 = 92;
               break;
            case 4:
               var21 = 40;
               break;
            case 5:
               var21 = 116;
               break;
            default:
               var21 = 13;
         }
      } else {
         var13 = 92;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 8239549337653411640L;
            long var12 = -3197174143508086984L ^ var3;
            var8 = -1;
            f = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 92;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 84;
               break;
            case 2:
               var21 = 35;
               break;
            case 3:
               var21 = 92;
               break;
            case 4:
               var21 = 40;
               break;
            case 5:
               var21 = 116;
               break;
            default:
               var21 = 13;
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
                  var21 = 92;
                  break;
               case 1:
                  var21 = 84;
                  break;
               case 2:
                  var21 = 35;
                  break;
               case 3:
                  var21 = 92;
                  break;
               case 4:
                  var21 = 40;
                  break;
               case 5:
                  var21 = 116;
                  break;
               default:
                  var21 = 13;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 8239549337653411640L;
               long var11 = -3197174143508086984L ^ var0;
               var6 = -1;
               f = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 92;
                  break;
               case 1:
                  var21 = 84;
                  break;
               case 2:
                  var21 = 35;
                  break;
               case 3:
                  var21 = 92;
                  break;
               case 4:
                  var21 = 40;
                  break;
               case 5:
                  var21 = 116;
                  break;
               default:
                  var21 = 13;
            }
         }
      }
   }
}





