package com;

public class gg_4 extends hN_3 {
   private float W = 200.0F;
   private float X = 10.0F;
   private float s = (float) (Math.PI / 2);
   private float N = 0.5F;
   private float c = 0.0F;
   private float L = 0.5F;
   private float g = 0.8F;
   private float d = 1.0F;
   private float w = 0.0F;
   private float t = 0.0F;
   private float k = 1.0F;
   private Po_2 o = new wY_3(a(31256, 2821238027488255447L), a(8907, 6172687912873788677L));
   private static final String a;
   private static final long[] b;
   private static final Integer[] e;

   public void b(float var1) {
      this.N = var1;
   }

   public float l() {
      return this.N;
   }

   public void I(float var1) {
      this.W = var1;
   }

   public float S() {
      return this.W;
   }

   public void s(float var1) {
      this.X = var1;
   }

   public float n() {
      return this.X;
   }

   public void E(float var1) {
      this.s = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.d = var2;
      this.w = var3;
      this.t = -var3;
      this.k = var2;
   }

   public float L() {
      return this.s;
   }

   public void A(float var1) {
      this.c = var1;
   }

   public float j() {
      return this.c;
   }

   public void q(float var1) {
      this.L = var1;
   }

   public float a() {
      return this.L;
   }

   public void v(float var1) {
      this.g = var1;
   }

   public float J() {
      return this.g;
   }

   public void o(Po_2 var1) {
      this.o = var1;
   }

   public Po_2 Z() {
      return this.o;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var8;
      float var20;
      label16: {
         float var5 = this.d * (float)var1 + this.w * (float)var2;
         float var6 = this.t * (float)var1 + this.k * (float)var2;
         var5 /= this.W;
         var6 /= this.W * this.X;
         var20 = uZ.x(var5, var6);
         var20 += 0.1F * this.c * uZ.x(var5 * 0.05F, var6 * 20.0F);
         var20 = var20 * 0.5F + 0.5F;
         var20 *= this.N * 50.0F;
         String[] var10000 = com.W5.q();
         var20 -= (float)((int)var20);
         var20 *= 1.0F - NM.k(this.g, 1.0F, var20);
         var20 += this.L * uZ.x(var5 * this.W, var6 * 50.0F);
         var8 = var3 & a(839, 5494301263262590095L);
         String[] var4 = var10000;
         Po_2 var22 = this.o;
         if (var4 != null) {
            if (this.o == null) {
               break label16;
            }

            var22 = this.o;
         }

         int var9 = var22.D(var20);
         if (var4 != null) {
            return var9;
         }
      }

      int var21 = iw_4.e((int)(var20 * 255.0F));
      int var10 = var21 << a(29973, 5837373978456347353L);
      int var11 = var21 << a(916, 553419587930039385L);
      return var8 | var10 | var11 | var21;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\n=\u001da\u001339q\u000f\nz\u0002orp".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 91;
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
         var10007 = 91;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 5;
               break;
            case 1:
               var50 = 3;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 78;
               break;
            case 4:
               var50 = 61;
               break;
            case 5:
               var50 = 26;
               break;
            default:
               var50 = 7;
         }
      } else {
         var34 = 91;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3968563715794475662L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "Ý\u0082Y%ò\u0090ÈG\u0082Nä8\u008a?>ß\u008e\u001aqè\u007fÇäÚ";
            int var13 = "Ý\u0082Y%ò\u0090ÈG\u0082Nä8\u008a?>ß\u008e\u001aqè\u007fÇäÚ".length();
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
                           b = var14;
                           e = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Ö\u009fÜ´|È\u0003Íy\u0095ö\u000b&Ð>\u0001";
                        var13 = "Ö\u009fÜ´|È\u0003Íy\u0095ö\u000b&Ð>\u0001".length();
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
         var10007 = 91;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 5;
               break;
            case 1:
               var50 = 3;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 78;
               break;
            case 4:
               var50 = 61;
               break;
            case 5:
               var50 = 26;
               break;
            default:
               var50 = 7;
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
                  var50 = 5;
                  break;
               case 1:
                  var50 = 3;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 78;
                  break;
               case 4:
                  var50 = 61;
                  break;
               case 5:
                  var50 = 26;
                  break;
               default:
                  var50 = 7;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3968563715794475662L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "Ý\u0082Y%ò\u0090ÈG\u0082Nä8\u008a?>ß\u008e\u001aqè\u007fÇäÚ";
               int var5 = "Ý\u0082Y%ò\u0090ÈG\u0082Nä8\u008a?>ß\u008e\u001aqè\u007fÇäÚ".length();
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
                              b = var6;
                              e = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Ö\u009fÜ´|È\u0003Íy\u0095ö\u000b&Ð>\u0001";
                           var5 = "Ö\u009fÜ´|È\u0003Íy\u0095ö\u000b&Ð>\u0001".length();
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
                  var50 = 5;
                  break;
               case 1:
                  var50 = 3;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 78;
                  break;
               case 4:
                  var50 = 61;
                  break;
               case 5:
                  var50 = 26;
                  break;
               default:
                  var50 = 7;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10188;
      if (e[var3] == null) {
         e[var3] = (int)(b[var3] ^ var1);
      }

      return e[var3];
   }
}





