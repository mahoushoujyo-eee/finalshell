package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.util.Random;

public class H02 extends HN3 implements Cloneable {
   public float a = 32.0F;
   public float f = 1.0F;
   public float t = 0.0F;
   public float N = 1.0F;
   public float E = 1.0F;
   public float n = 4.0F;
   public float D = 2.0F;
   public float i = 0.5F;
   public float F = 0.5F;
   public int W;
   public float m = 1.0F;
   public float J = 0.0F;
   public float M = 0.0F;
   public float j = 1.0F;
   public float s;
   public float Z;
   public Po2 Q = new C4();
   public Ek2 C;
   public Random g = new Random();
   public int k = 0;
   public SC z;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public H02() {
      this.C(0);
   }

   public void P(float var1) {
      this.N = var1;
   }

   public float X() {
      return this.N;
   }

   public void W(int var1) {
      this.W = var1;
   }

   public int k() {
      return this.W;
   }

   public void p(float var1) {
      this.a = var1;
   }

   public float e() {
      return this.a;
   }

   public void X(float var1) {
      this.f = var1;
   }

   public float y() {
      return this.f;
   }

   public void g(float var1) {
      this.t = var1;
      float var2 = (float)Math.cos((double)this.t);
      float var3 = (float)Math.sin((double)this.t);
      this.m = var2;
      this.J = var3;
      this.M = -var3;
      this.j = var2;
   }

   public float o() {
      return this.t;
   }

   public void y(float var1) {
      this.n = var1;
   }

   public float F() {
      return this.n;
   }

   public void q(float var1) {
      this.E = var1;
   }

   public float s() {
      return this.E;
   }

   public void f(float var1) {
      this.D = var1;
   }

   public float J() {
      return this.D;
   }

   public void v(float var1) {
      this.i = var1;
   }

   public float h() {
      return this.i;
   }

   public void J(float var1) {
      this.F = var1;
   }

   public float H() {
      return this.F;
   }

   public void z(Po2 var1) {
      this.Q = var1;
   }

   public Po2 d() {
      return this.Q;
   }

   public void C(int var1) {
      String[] var2 = W5.q();
      H02 var10000 = this;
      if (var2 != null) {
         this.k = var1;
         switch (var1) {
            case 0:
            default:
               this.z = new UZ();
               if (var2 != null) {
                  return;
               }
            case 1:
               this.z = new S2();
               if (var2 != null) {
                  return;
               }
            case 2:
               this.z = new Rr4();
               if (var2 != null) {
                  return;
               }
            case 3:
               this.z = new RY();
               if (var2 != null) {
                  return;
               }
            case 4:
               var10000 = this;
         }
      }

      var10000.z = new EI3();
   }

   public int r() {
      return this.k;
   }

   public void H(SC var1) {
      this.z = var1;
   }

   public SC P() {
      return this.z;
   }

   public Ek2 O(float var1, float var2, float var3) {
      Ek2 var4 = new Ek2(var1, var2, var3, this.z);
      float[] var5 = UZ.B(var4, null);
      this.s = var5[0];
      this.Z = var5[1];
      return var4;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.C = this.O(this.E, this.D, this.n);
      return super.filter(var1, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      String[] var4;
      int var9;
      label25: {
         int var8;
         float var18;
         label24: {
            String[] var10000 = W5.q();
            float var5 = this.m * (float)var1 + this.J * (float)var2;
            var4 = var10000;
            float var6 = this.M * (float)var1 + this.j * (float)var2;
            var5 /= this.a;
            var6 /= this.a * this.f;
            var18 = this.C.h(var5, var6);
            var18 = (var18 - this.s) / (this.Z - this.s);
            var18 = NM.w(var18, this.i);
            var18 = NM.E(var18, this.F);
            var18 *= this.N;
            var8 = var3 & a(6877, 7730336372010838535L);
            Po2 var20 = this.Q;
            if (var4 != null) {
               if (this.Q == null) {
                  break label24;
               }

               var20 = this.Q;
            }

            var9 = var20.D(var18);
            if (var4 != null) {
               break label25;
            }
         }

         var9 = Iw4.e((int)(var18 * 255.0F));
         int var10 = var9 << a(6249, 8072282187260717233L);
         int var11 = var9 << a(162, 4542516541923848313L);
         var9 = var8 | var10 | var11 | var9;
      }

      int var21 = this.W;
      if (var4 != null) {
         if (this.W != 0) {
            var9 = Iw4.P(var3, var9, this.W);
         }

         var21 = var9;
      }

      return var21;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28890;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001dM7]\u0012\u0011Jfn=H\u0004\u0017N%\b\r[\b\u0014A I!\t*\f[ G!\u0007IM".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 102;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 102;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 47;
               break;
            case 1:
               var37 = 78;
               break;
            case 2:
               var37 = 41;
               break;
            case 3:
               var37 = 79;
               break;
            case 4:
               var37 = 1;
               break;
            case 5:
               var37 = 5;
               break;
            default:
               var37 = 73;
         }
      } else {
         var25 = 102;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            b = var29;
            long var9 = 4915463846825656560L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "ì\u009dkÀ\u0088\u00adj÷\u0003% \u008e\u0013åp\u0081âOU×:2èQ";
            int var13 = "ì\u009dkÀ\u0088\u00adj÷\u0003% \u008e\u0013åp\u0081âOU×:2èQ".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            c = var14;
            d = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 102;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 47;
               break;
            case 1:
               var37 = 78;
               break;
            case 2:
               var37 = 41;
               break;
            case 3:
               var37 = 79;
               break;
            case 4:
               var37 = 1;
               break;
            case 5:
               var37 = 5;
               break;
            default:
               var37 = 73;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 47;
                  break;
               case 1:
                  var37 = 78;
                  break;
               case 2:
                  var37 = 41;
                  break;
               case 3:
                  var37 = 79;
                  break;
               case 4:
                  var37 = 1;
                  break;
               case 5:
                  var37 = 5;
                  break;
               default:
                  var37 = 73;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               b = var27;
               long var0 = 4915463846825656560L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "ì\u009dkÀ\u0088\u00adj÷\u0003% \u008e\u0013åp\u0081âOU×:2èQ";
               int var5 = "ì\u009dkÀ\u0088\u00adj÷\u0003% \u008e\u0013åp\u0081âOU×:2èQ".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               c = var6;
               d = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 47;
                  break;
               case 1:
                  var37 = 78;
                  break;
               case 2:
                  var37 = 41;
                  break;
               case 3:
                  var37 = 79;
                  break;
               case 4:
                  var37 = 1;
                  break;
               case 5:
                  var37 = 5;
                  break;
               default:
                  var37 = 73;
            }
         }
      }
   }
}





