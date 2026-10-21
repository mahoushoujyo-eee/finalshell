package com;

public class hP_3 extends hN_3 {
   private int a;
   private int R;
   private int E;
   private int x;
   private int Z;
   private int G;
   private int W;
   private int n;
   private int j;
   private int H;
   private int g;
   private int c;
   private int f;
   private int S;
   private int h;
   private int v;
   private int U;
   private int p;
   private static final String b;
   private static final long[] d;
   private static final Integer[] e;

   public hP_3() {
      this.v(a(27421, 3702674813589743801L));
      this.t(a(6264, 4903638639811894227L));
      this.l(a(23192, 7386057376625940798L));
      this.h(a(28685, 4504929482384143279L));
   }

   public void v(int var1) {
      this.E = var1;
      this.W = var1 >> a(18417, 2741671732329170002L) & a(14657, 2496537401441041120L);
      this.n = var1 >> a(14663, 6459086431565855458L) & a(24950, 8989041695405695697L);
      this.j = var1 & a(24950, 8989041695405695697L);
   }

   public int C() {
      return this.E;
   }

   public void t(int var1) {
      this.x = var1;
      this.H = var1 >> a(25300, 6598123163718181245L) & a(24950, 8989041695405695697L);
      this.g = var1 >> a(16924, 6286631455733236148L) & a(24950, 8989041695405695697L);
      this.c = var1 & a(24950, 8989041695405695697L);
   }

   public int l() {
      return this.x;
   }

   public void l(int var1) {
      this.Z = var1;
      this.f = var1 >> a(25300, 6598123163718181245L) & a(24950, 8989041695405695697L);
      this.S = var1 >> a(16924, 6286631455733236148L) & a(24950, 8989041695405695697L);
      this.h = var1 & a(24950, 8989041695405695697L);
   }

   public int e() {
      return this.Z;
   }

   public void h(int var1) {
      this.G = var1;
      this.v = var1 >> a(25300, 6598123163718181245L) & a(24950, 8989041695405695697L);
      this.U = var1 >> a(16924, 6286631455733236148L) & a(24950, 8989041695405695697L);
      this.p = var1 & a(24950, 8989041695405695697L);
   }

   public int b() {
      return this.G;
   }

   @Override
   public void C(int var1, int var2) {
      this.a = var1;
      this.R = var2;
      super.C(var1, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      float var4 = (float)var1 / (float)this.a;
      float var5 = (float)var2 / (float)this.R;
      float var6 = (float)this.W + (float)(this.H - this.W) * var4;
      float var7 = (float)this.f + (float)(this.v - this.f) * var4;
      int var8 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      var6 = (float)this.n + (float)(this.g - this.n) * var4;
      var7 = (float)this.S + (float)(this.U - this.S) * var4;
      int var9 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      var6 = (float)this.j + (float)(this.c - this.j) * var4;
      var7 = (float)this.h + (float)(this.p - this.h) * var4;
      int var10 = (int)(var6 + (var7 - var6) * var5 + 0.5F);
      return a(23222, 8332263420326861078L) | var8 << a(25300, 6598123163718181245L) | var9 << a(16924, 6286631455733236148L) | var10;
   }

   @Override
   public String toString() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = " )&2j\u00175[\n13mE\u0013\u001b 14?#9\u0018 ph1".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 54;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 54;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 66;
               break;
            case 1:
               var50 = 122;
               break;
            case 2:
               var50 = 104;
               break;
            case 3:
               var50 = 112;
               break;
            case 4:
               var50 = 41;
               break;
            case 5:
               var50 = 83;
               break;
            default:
               var50 = 102;
         }
      } else {
         var34 = 54;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 2840366804116714446L;
            long[] var14 = new long[11];
            int var11 = 0;
            String var12 = "ËÏ\u000f£\"n\u0089Ñ<DÖå÷ jØBK£o\u0017\u0005÷\u008choIý7\u0080?\u009e¤ëFmp7\t$iv\"lÞ\u0002[wô¤ÆkòäÑà\u0098\u008aqèØAj\u000fÑWÕI*\u0082Ò£";
            int var13 = "ËÏ\u000f£\"n\u0089Ñ<DÖå÷ jØBK£o\u0017\u0005÷\u008choIý7\u0080?\u009e¤ëFmp7\t$iv\"lÞ\u0002[wô¤ÆkòäÑà\u0098\u008aqèØAj\u000fÑWÕI*\u0082Ò£"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           d = var14;
                           e = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ÁgGPwöòr\u000fªèÀ\b\u0011(â";
                        var13 = "ÁgGPwöòr\u000fªèÀ\b\u0011(â".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 54;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 66;
               break;
            case 1:
               var50 = 122;
               break;
            case 2:
               var50 = 104;
               break;
            case 3:
               var50 = 112;
               break;
            case 4:
               var50 = 41;
               break;
            case 5:
               var50 = 83;
               break;
            default:
               var50 = 102;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 66;
                  break;
               case 1:
                  var50 = 122;
                  break;
               case 2:
                  var50 = 104;
                  break;
               case 3:
                  var50 = 112;
                  break;
               case 4:
                  var50 = 41;
                  break;
               case 5:
                  var50 = 83;
                  break;
               default:
                  var50 = 102;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 2840366804116714446L;
               long[] var6 = new long[11];
               int var3 = 0;
               String var4 = "ËÏ\u000f£\"n\u0089Ñ<DÖå÷ jØBK£o\u0017\u0005÷\u008choIý7\u0080?\u009e¤ëFmp7\t$iv\"lÞ\u0002[wô¤ÆkòäÑà\u0098\u008aqèØAj\u000fÑWÕI*\u0082Ò£";
               int var5 = "ËÏ\u000f£\"n\u0089Ñ<DÖå÷ jØBK£o\u0017\u0005÷\u008choIý7\u0080?\u009e¤ëFmp7\t$iv\"lÞ\u0002[wô¤ÆkòäÑà\u0098\u008aqèØAj\u000fÑWÕI*\u0082Ò£"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              d = var6;
                              e = new Integer[11];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ÁgGPwöòr\u000fªèÀ\b\u0011(â";
                           var5 = "ÁgGPwöòr\u000fªèÀ\b\u0011(â".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 66;
                  break;
               case 1:
                  var50 = 122;
                  break;
               case 2:
                  var50 = 104;
                  break;
               case 3:
                  var50 = 112;
                  break;
               case 4:
                  var50 = 41;
                  break;
               case 5:
                  var50 = 83;
                  break;
               default:
                  var50 = 102;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 929;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





