package com;

public class kB_3 {
   public float n;
   public float i;
   public float Z;
   public float e;
   public float C;
   public float B;
   public float a;
   public float Y;
   public float v;
   public float T;
   public float P;
   public float D;
   public float L;
   public float H;
   public float E;
   public float Q;
   private static final long[] b;
   private static final Integer[] c;

   public kB_3() {
      this.h();
   }

   public kB_3(com.kB_3 var1) {
      this.T(var1);
   }

   public kB_3(float[] var1) {
      this.L(var1);
   }

   public void T(com.kB_3 var1) {
      this.n = var1.n;
      this.i = var1.i;
      this.Z = var1.Z;
      this.e = var1.e;
      this.C = var1.C;
      this.B = var1.B;
      this.a = var1.a;
      this.Y = var1.Y;
      this.v = var1.v;
      this.T = var1.T;
      this.P = var1.P;
      this.D = var1.D;
      this.L = var1.L;
      this.H = var1.H;
      this.E = var1.E;
      this.Q = var1.Q;
   }

   public void L(float[] var1) {
      this.n = var1[0];
      this.i = var1[1];
      this.Z = var1[2];
      this.e = var1[3];
      this.C = var1[4];
      this.B = var1[5];
      this.a = var1[a(16924, 4151299614982860977L)];
      this.Y = var1[a(8169, 3532208586903760204L)];
      this.v = var1[a(12517, 292077663659524674L)];
      this.T = var1[a(5036, 4718186387161063694L)];
      this.P = var1[a(1207, 86680155689137689L)];
      this.D = var1[a(32641, 2897227884615781666L)];
      this.L = var1[a(743, 8728177995766149197L)];
      this.H = var1[a(1605, 266041320694134010L)];
      this.E = var1[a(4948, 650310218650853885L)];
      this.Q = var1[a(8395, 9063869472285889120L)];
   }

   public void q(com.kB_3 var1) {
      var1.n = this.n;
      var1.i = this.i;
      var1.Z = this.Z;
      var1.e = this.e;
      var1.C = this.C;
      var1.B = this.B;
      var1.a = this.a;
      var1.Y = this.Y;
      var1.v = this.v;
      var1.T = this.T;
      var1.P = this.P;
      var1.D = this.D;
      var1.L = this.L;
      var1.H = this.H;
      var1.E = this.E;
      var1.Q = this.Q;
   }

   public void u(float[] var1) {
      var1[0] = this.n;
      var1[1] = this.i;
      var1[2] = this.Z;
      var1[3] = this.e;
      var1[4] = this.C;
      var1[5] = this.B;
      var1[a(5586, 1964429935450597236L)] = this.a;
      var1[a(5040, 2872316149067882765L)] = this.Y;
      var1[a(13735, 3498001318591923971L)] = this.v;
      var1[a(23623, 926816394515541734L)] = this.T;
      var1[a(14730, 6624271552371559202L)] = this.P;
      var1[a(21790, 3540108726088460192L)] = this.D;
      var1[a(10397, 7785798044555837L)] = this.L;
      var1[a(26259, 4221029804295509039L)] = this.H;
      var1[a(14480, 98519134223436348L)] = this.E;
      var1[a(23721, 4696929993345854982L)] = this.Q;
   }

   public void h() {
      this.n = 1.0F;
      this.i = 0.0F;
      this.Z = 0.0F;
      this.e = 0.0F;
      this.C = 0.0F;
      this.B = 1.0F;
      this.a = 0.0F;
      this.Y = 0.0F;
      this.v = 0.0F;
      this.T = 0.0F;
      this.P = 1.0F;
      this.D = 0.0F;
      this.L = 0.0F;
      this.H = 0.0F;
      this.E = 0.0F;
      this.Q = 1.0F;
   }

   public void E(com.kB_3 var1) {
      float var3 = this.n;
      float var4 = this.i;
      float var5 = this.Z;
      float var6 = this.e;
      float var7 = this.C;
      float var8 = this.B;
      float var9 = this.a;
      float var10 = this.Y;
      float var11 = this.v;
      float var12 = this.T;
      float var13 = this.P;
      float var14 = this.D;
      float var15 = this.L;
      float var16 = this.H;
      float var17 = this.E;
      int var10000 = com.R.F();
      float var18 = this.Q;
      this.n = var3 * var1.n + var7 * var1.i + var11 * var1.Z + var15 * var1.e;
      this.i = var4 * var1.n + var8 * var1.i + var12 * var1.Z + var16 * var1.e;
      this.Z = var5 * var1.n + var9 * var1.i + var13 * var1.Z + var17 * var1.e;
      this.e = var6 * var1.n + var10 * var1.i + var14 * var1.Z + var18 * var1.e;
      this.C = var3 * var1.C + var7 * var1.B + var11 * var1.a + var15 * var1.Y;
      this.B = var4 * var1.C + var8 * var1.B + var12 * var1.a + var16 * var1.Y;
      this.a = var5 * var1.C + var9 * var1.B + var13 * var1.a + var17 * var1.Y;
      this.Y = var6 * var1.C + var10 * var1.B + var14 * var1.a + var18 * var1.Y;
      this.v = var3 * var1.v + var7 * var1.T + var11 * var1.P + var15 * var1.D;
      this.T = var4 * var1.v + var8 * var1.T + var12 * var1.P + var16 * var1.D;
      this.P = var5 * var1.v + var9 * var1.T + var13 * var1.P + var17 * var1.D;
      this.D = var6 * var1.v + var10 * var1.T + var14 * var1.P + var18 * var1.D;
      this.L = var3 * var1.L + var7 * var1.H + var11 * var1.E + var15 * var1.Q;
      int var2 = var10000;
      this.H = var4 * var1.L + var8 * var1.H + var12 * var1.E + var16 * var1.Q;
      this.E = var5 * var1.L + var9 * var1.H + var13 * var1.E + var17 * var1.Q;
      this.Q = var6 * var1.L + var10 * var1.H + var14 * var1.E + var18 * var1.Q;
      if (var2 == 0) {
         com.ky_4.K(new String[5]);
      }
   }

   public void N() {
      com.kB_3 var1 = new com.kB_3(this);
      this.e(var1);
   }

   public void e(com.kB_3 var1) {
      this.n = var1.n;
      this.i = var1.C;
      this.Z = var1.v;
      this.e = var1.e;
      this.C = var1.i;
      this.B = var1.B;
      this.a = var1.T;
      this.Y = var1.Y;
      this.v = var1.Z;
      this.T = var1.a;
      this.P = var1.P;
      this.D = var1.D;
      this.L *= -1.0F;
      this.H *= -1.0F;
      this.E *= -1.0F;
      this.Q = var1.Q;
   }

   public void U(com.Kl_2 var1) {
      float var2 = var1.G * 0.5F;
      float var3 = (float)Math.cos((double)var2);
      float var4 = (float)Math.sin((double)var2);
      this.M(new B(var1.C * var4, var1.w * var4, var1.J * var4, var3));
   }

   public void M(B var1) {
      float var12 = var1.T + var1.T;
      float var13 = var1.o + var1.o;
      float var14 = var1.I + var1.I;
      float var6 = var1.T * var12;
      float var9 = var1.T * var13;
      float var10 = var1.T * var14;
      float var7 = var1.o * var13;
      int var10000 = com.R.F();
      float var8 = var1.o * var14;
      float var11 = var1.I * var14;
      float var3 = var1.z * var12;
      float var4 = var1.z * var13;
      float var5 = var1.z * var14;
      this.n = 1.0F - (var7 + var11);
      this.i = var9 - var5;
      this.Z = var10 + var4;
      this.e = 0.0F;
      this.C = var9 + var5;
      this.B = 1.0F - (var6 + var11);
      this.a = var8 - var3;
      this.Y = 0.0F;
      this.v = var10 - var4;
      this.T = var8 + var3;
      this.P = 1.0F - (var6 + var7);
      this.D = 0.0F;
      this.L = 0.0F;
      int var2 = var10000;
      this.H = 0.0F;
      this.E = 0.0F;
      this.Q = 1.0F;
      if (com.ky_4.F() != null) {
         com.R.T(++var2);
      }
   }

   public void Y(com.oE_3 var1) {
      float var2 = var1.e * this.n + var1.I * this.C + var1.k * this.v + this.L;
      float var3 = var1.e * this.i + var1.I * this.B + var1.k * this.T + this.H;
      float var4 = var1.e * this.Z + var1.I * this.a + var1.k * this.P + this.E;
      var1.e = var2;
      var1.I = var3;
      var1.k = var4;
   }

   public void b(com.od_4 var1) {
      float var2 = var1.e * this.n + var1.I * this.C + var1.k * this.v;
      float var3 = var1.e * this.i + var1.I * this.B + var1.k * this.T;
      float var4 = var1.e * this.Z + var1.I * this.a + var1.k * this.P;
      var1.e = var2;
      var1.I = var3;
      var1.k = var4;
   }

   public void d(com.od_4 var1) {
      this.L = var1.e;
      this.H = var1.I;
      this.E = var1.k;
   }

   public void c(float var1) {
      this.n = var1;
      this.B = var1;
      this.P = var1;
   }

   public void w(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.n = 1.0F;
      this.i = 0.0F;
      this.Z = 0.0F;
      this.e = 0.0F;
      this.C = 0.0F;
      this.B = var3;
      this.a = var2;
      this.Y = 0.0F;
      this.v = 0.0F;
      this.T = -var2;
      this.P = var3;
      this.D = 0.0F;
      this.L = 0.0F;
      this.H = 0.0F;
      this.E = 0.0F;
      this.Q = 1.0F;
   }

   public void b(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.n = var3;
      this.i = 0.0F;
      this.Z = -var2;
      this.e = 0.0F;
      this.C = 0.0F;
      this.B = 1.0F;
      this.a = 0.0F;
      this.Y = 0.0F;
      this.v = var2;
      this.T = 0.0F;
      this.P = var3;
      this.D = 0.0F;
      this.L = 0.0F;
      this.H = 0.0F;
      this.E = 0.0F;
      this.Q = 1.0F;
   }

   public void U(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.n = var3;
      this.i = var2;
      this.Z = 0.0F;
      this.e = 0.0F;
      this.C = -var2;
      this.B = var3;
      this.a = 0.0F;
      this.Y = 0.0F;
      this.v = 0.0F;
      this.T = 0.0F;
      this.P = 1.0F;
      this.D = 0.0F;
      this.L = 0.0F;
      this.H = 0.0F;
      this.E = 0.0F;
      this.Q = 1.0F;
   }

   static {
      long var0 = 935663372430368056L;
      long[] var6 = new long[20];
      int var3 = 0;
      String var4 = "\u0010@öPOãk+ÚÖ©`³O³13fV²Qù×\nÉ\u0082rªdJ\u00ad\u008fs¸hn\u0091\u000bíyÖÊ±3\u0005\u0015ÏW}[V\u0085yÛV\u0010mÆv6÷süË²-WÂw£zJ\u001a³\u0015ºRNßrl õÂ½\u008bZ3\u0091U.íñõðsZ\u009cñ;Yßü?(ø\u001f#\u0010ï\u0010\u0011\u0000ÂGøa³G\t\f\t%â\u0090\u00153×\u0001¬\u0091ÉsÍ:\u0093^1Ô¯Ð\u0082éÏ";
      int var5 = "\u0010@öPOãk+ÚÖ©`³O³13fV²Qù×\nÉ\u0082rªdJ\u00ad\u008fs¸hn\u0091\u000bíyÖÊ±3\u0005\u0015ÏW}[V\u0085yÛV\u0010mÆv6÷süË²-WÂw£zJ\u001a³\u0015ºRNßrl õÂ½\u008bZ3\u0091U.íñõðsZ\u009cñ;Yßü?(ø\u001f#\u0010ï\u0010\u0011\u0000ÂGøa³G\t\f\t%â\u0090\u00153×\u0001¬\u0091ÉsÍ:\u0093^1Ô¯Ð\u0082éÏ"
         .length();
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
                     b = var6;
                     c = new Integer[20];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0011ðï¯\bP\u0089\u001aÖ£LøüÁ|2";
                  var5 = "\u0011ðï¯\bP\u0089\u001aÖ£LøüÁ|2".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12974;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





