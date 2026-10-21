package com.finalshell.core;

import java.util.Random;

public class HM3 extends HN3 {
   public int V = a(9667, 493054718073799650L);
   public int I = a(20923, 6010599173877725080L);
   public int s = a(20599, 6125990442273994327L);
   public int G = -1;
   public int J = a(10328, 4625498123037478526L);
   public int F;
   public int k;
   public int L;
   public int A;
   public long B;
   public float[] P;
   public Random h;
   public static String a;
   public static long[] b;
   public static Integer[] c;
   public static long d;

   public HM3() {
      this.B = d;
      this.h = new Random();
   }

   public void I(int var1) {
      this.G = var1;
   }

   public int K() {
      return this.G;
   }

   public void e(int var1) {
      this.J = var1;
   }

   public int E() {
      return this.J;
   }

   public void M(int var1) {
      this.s = var1;
   }

   public int f() {
      return this.s;
   }

   public void J(int var1) {
      this.V = var1;
   }

   public int V() {
      return this.V;
   }

   public void s(int var1) {
      this.I = var1;
   }

   public int Z() {
      return this.I;
   }

   @Override
   public void C(int var1, int var2) {
      this.F = var1;
      String[] var10000 = W5.q();
      this.k = var2;
      this.L = var1 / 2;
      this.A = var2 / 2;
      super.C(var1, var2);
      this.h.setSeed(this.B);
      String[] var3 = var10000;
      this.P = new float[this.V];
      int var4 = 0;

      while (var4 < this.V) {
         this.P[var4] = (float)this.I + (float)this.J / 100.0F * (float)this.I * (float)this.h.nextGaussian();
         var4++;
         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public int C(int var1, int var2, int var3) {
      float var5 = (float)(var1 - this.L);
      String[] var10000 = W5.q();
      float var6 = (float)(var2 - this.A);
      float var7 = var5 * var5 + var6 * var6;
      String[] var4 = var10000;
      float var8 = (float)Math.atan2((double)var6, (double)var5);
      float var9 = (var8 + (float) Math.PI) / (float) (Math.PI * 2) * (float)this.V;
      int var10 = (int)var9;
      float var11 = var9 - (float)var10;
      int var18 = this.I;
      if (var4 != null) {
         if (this.I != 0) {
            float var12 = NM.J(var11, this.P[var10 % this.V], this.P[(var10 + 1) % this.V]);
            float var13 = var12 * var12 / (var7 + 1.0E-4F);
            var13 = (float)Math.pow((double)var13, (double)(a(12227, 5953736778399877601L) - this.s) / 50.0);
            var11 -= 0.5F;
            var11 = 1.0F - var11 * var11;
            var11 *= var13;
         }

         var11 = NM.X(var11, 0.0F, 1.0F);
         var18 = NM.n(var11, var3, this.G);
      }

      return var18;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9762;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "d\u0017V,}E-\u00180_!fT$RM\u0001n".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var41 = 101;
      char[] var10002 = var10003;
      int var22 = var10004;
      char[] var49;
      byte var57;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var49 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 101;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var57 = 82;
               break;
            case 1:
               var57 = 6;
               break;
            case 2:
               var57 = 74;
               break;
            case 3:
               var57 = 37;
               break;
            case 4:
               var57 = 113;
               break;
            case 5:
               var57 = 90;
               break;
            default:
               var57 = 45;
         }
      } else {
         var41 = 101;
         var22 = var10004;
         if (var10004 <= var10) {
            String var46 = new String(var10003).intern();
            int var29 = -1;
            a = var46;
            long var12 = 8001144796514680399L;
            long[] var17 = new long[5];
            int var14 = 0;
            String var15 = "²é\u0090¹²\f÷Ê¾-\u0080R\u0096\u0084\tÎO:l\u0002A\u0095\b*";
            int var16 = "²é\u0090¹²\f÷Ê¾-\u0080R\u0096\u0084\tÎO:l\u0002A\u0095\b*".length();
            byte var13 = 0;

            label71:
            while (true) {
               var29 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var29, var13).getBytes("ISO-8859-1");
               long[] var21 = var17;
               var29 = var14++;
               long var38 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var47 = -1;

               while (true) {
                  long var55 = var38 ^ var12;
                  switch (var47) {
                     case 0:
                        var21[var29] = var55;
                        if (var13 >= var16) {
                           b = var17;
                           c = new Integer[5];
                           long var11 = 4239301942021199721L;
                           long var40 = 4239301942021199386L ^ var11;
                           byte var33 = -1;
                           d = var40;
                           return;
                        }
                        break;
                     default:
                        var21[var29] = var55;
                        if (var13 < var16) {
                           continue label71;
                        }

                        var15 = "¢×¿\u0097\u00ad&}\u009f@æ6wÄZp(";
                        var16 = "¢×¿\u0097\u00ad&}\u009f@æ6wÄZp(".length();
                        var13 = 0;
                  }

                  byte var32 = var13;
                  var13 += 8;
                  var19 = var15.substring(var32, var13).getBytes("ISO-8859-1");
                  var21 = var17;
                  var29 = var14++;
                  var38 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var47 = 0;
               }
            }
         }

         var49 = var10003;
         var10005 = var10;
         char var58 = var10003[var10];
         var10007 = 101;
         var10006 = var58;
         switch (var10 % 7) {
            case 0:
               var57 = 82;
               break;
            case 1:
               var57 = 6;
               break;
            case 2:
               var57 = 74;
               break;
            case 3:
               var57 = 37;
               break;
            case 4:
               var57 = 113;
               break;
            case 5:
               var57 = 90;
               break;
            default:
               var57 = 45;
         }
      }

      while (true) {
         var49[var10005] = (char)(var10006 ^ var10007 ^ var57);
         var10++;
         if (var41 == 0) {
            var49 = var10002;
            var10005 = var41;
            char var60 = var10002[var41];
            var10007 = var41;
            var10006 = var60;
            switch (var10 % 7) {
               case 0:
                  var57 = 82;
                  break;
               case 1:
                  var57 = 6;
                  break;
               case 2:
                  var57 = 74;
                  break;
               case 3:
                  var57 = 37;
                  break;
               case 4:
                  var57 = 113;
                  break;
               case 5:
                  var57 = 90;
                  break;
               default:
                  var57 = 45;
            }
         } else {
            if (var22 <= var10) {
               String var43 = new String(var10002).intern();
               int var24 = -1;
               a = var43;
               long var2 = 8001144796514680399L;
               long[] var8 = new long[5];
               int var5 = 0;
               String var6 = "²é\u0090¹²\f÷Ê¾-\u0080R\u0096\u0084\tÎO:l\u0002A\u0095\b*";
               int var7 = "²é\u0090¹²\f÷Ê¾-\u0080R\u0096\u0084\tÎO:l\u0002A\u0095\b*".length();
               byte var4 = 0;

               label37:
               while (true) {
                  var24 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  long[] var10000 = var8;
                  var24 = var5++;
                  long var35 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  byte var44 = -1;

                  while (true) {
                     long var53 = var35 ^ var2;
                     switch (var44) {
                        case 0:
                           var10000[var24] = var53;
                           if (var4 >= var7) {
                              b = var8;
                              c = new Integer[5];
                              long var0 = 4239301942021199721L;
                              long var37 = 4239301942021199386L ^ var0;
                              byte var28 = -1;
                              d = var37;
                              return;
                           }
                           break;
                        default:
                           var10000[var24] = var53;
                           if (var4 < var7) {
                              continue label37;
                           }

                           var6 = "¢×¿\u0097\u00ad&}\u009f@æ6wÄZp(";
                           var7 = "¢×¿\u0097\u00ad&}\u009f@æ6wÄZp(".length();
                           var4 = 0;
                     }

                     byte var27 = var4;
                     var4 += 8;
                     var9 = var6.substring(var27, var4).getBytes("ISO-8859-1");
                     var10000 = var8;
                     var24 = var5++;
                     var35 = ((long)var9[0] & 255L) << 56
                        | ((long)var9[1] & 255L) << 48
                        | ((long)var9[2] & 255L) << 40
                        | ((long)var9[3] & 255L) << 32
                        | ((long)var9[4] & 255L) << 24
                        | ((long)var9[5] & 255L) << 16
                        | ((long)var9[6] & 255L) << 8
                        | (long)var9[7] & 255L;
                     var44 = 0;
                  }
               }
            }

            var49 = var10002;
            var10005 = var10;
            char var59 = var10002[var10];
            var10007 = var41;
            var10006 = var59;
            switch (var10 % 7) {
               case 0:
                  var57 = 82;
                  break;
               case 1:
                  var57 = 6;
                  break;
               case 2:
                  var57 = 74;
                  break;
               case 3:
                  var57 = 37;
                  break;
               case 4:
                  var57 = 113;
                  break;
               case 5:
                  var57 = 90;
                  break;
               default:
                  var57 = 45;
            }
         }
      }
   }
}





