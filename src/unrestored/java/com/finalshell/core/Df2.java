package com.finalshell.core;

import com.finalshell.ui.model.D92;

public class Df2 {
   public byte[] x;
   public int f;
   public int L;
   public long O;
   public byte[] h;
   public int V;
   public int g;
   public long F;
   public String t;
   public Wa2_2 d;
   public A4_3 T;
   public int s;
   public Aj2 e;
   public static long[] c;
   public static Integer[] i;

   public Df2() {
      this(new DG3());
   }

   public Df2(Aj2 var1) {
      this.e = var1;
   }

   public int S() {
      return this.v(a(8603, 6257372309529097965L));
   }

   public int x(boolean var1) {
      return this.A(a(8603, 6257372309529097965L), var1);
   }

   public int v(int var1) {
      return this.A(var1, false);
   }

   public int W(D92 var1) {
      return this.X(a(8603, 6257372309529097965L), var1);
   }

   public int X(int var1, D92 var2) {
      int[] var10000;
      boolean var4;
      var10000 = Nm4.g();
      var4 = false;
      int[] var3 = var10000;
      D92 var5 = var2;
      D92 var10001 = Ro2.W;
      if (var3 == null) {
         if (var2 == Ro2.W) {
            var4 = true;
            if (var3 == null) {
               return this.A(var1, var4);
            }
         }

         var5 = var2;
         var10001 = Ro2.k;
      }

      if (var3 == null) {
         if (var5 == var10001) {
            var1 += 16;
            if (var3 == null) {
               return this.A(var1, var4);
            }
         }

         var5 = var2;
         var10001 = Ro2.I;
      }

      if (var3 == null) {
         if (var5 == var10001) {
            var1 |= a(2861, 5039373070596398172L);
            if (var3 == null) {
               return this.A(var1, var4);
            }
         }

         var5 = var2;
         var10001 = Ro2.C;
      }

      if (var5 == var10001) {
      }

      return this.A(var1, var4);
   }

   public int A(int var1, boolean var2) {
      int[] var10000;
      var10000 = Nm4.g();
      this.T = new A4_3(this);
      int[] var3 = var10000;
      int var10001 = (var2) ? 1 : 0;
      if (var3 == null) {
         var10001 = var2 != 0 ? -var1 : var1;
      }

      return this.T.e(var10001);
   }

   public int Q(int var1) {
      int[] var2 = Nm4.g();
      A4_3 var10000 = this.T;
      if (var2 == null) {
         if (this.T == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.T;
      }

      return var10000.N(var1);
   }

   public int M() {
      int[] var1 = Nm4.g();
      A4_3 var10000 = this.T;
      if (var1 == null) {
         if (this.T == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.T;
      }

      return var10000.m();
   }

   public int n$int() {
      int[] var1 = Nm4.g();
      A4_3 var10000 = this.T;
      if (var1 == null) {
         if (this.T == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.T;
      }

      return var10000.D();
   }

   public int W() {
      int[] var1 = Nm4.g();
      A4_3 var10000 = this.T;
      if (var1 == null) {
         if (this.T == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.T;
      }

      return var10000.i();
   }

   public int a(byte[] var1, int var2) {
      int[] var3 = Nm4.g();
      A4_3 var10000 = this.T;
      if (var3 == null) {
         if (this.T == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.T;
      }

      return var10000.I(var1, var2);
   }

   public boolean N$boolean() {
      int[] var1 = Nm4.g();
      int var10000 = this.T.O;
      if (var1 == null) {
         var10000 = this.T.O == a(7955, 1963561154465843297L) ? 1 : 0;
      }

      return var10000 != 0;
   }

   public int D(int var1) {
      return this.q(var1, a(8603, 6257372309529097965L));
   }

   public int U(int var1, boolean var2) {
      return this.Y(var1, a(8603, 6257372309529097965L), var2);
   }

   public int q(int var1, int var2) {
      return this.Y(var1, var2, false);
   }

   public int w(int var1, int var2, int var3, D92 var4) {
      int var10000;
      int[] var5 = Nm4.g();
      var10000 = var2;
      if (var5 == null) {
         if (var2 >= a(9064, 5331821358581249055L)) {
            if (var5 != null) {
               return var2;
            }

            if (var2 <= a(8146, 186772889237473442L)) {
               D92 var6 = var4;
               D92 var10001 = Ro2.W;
               if (var5 == null) {
                  if (var4 == Ro2.W) {
                     var2 *= -1;
                     if (var5 == null) {
                        return this.r(var1, var2, var3);
                     }
                  }

                  var6 = var4;
                  var10001 = Ro2.k;
               }

               if (var5 == null) {
                  if (var6 == var10001) {
                     var2 += 16;
                     if (var5 == null) {
                        return this.r(var1, var2, var3);
                     }
                  }

                  var6 = var4;
                  var10001 = Ro2.I;
               }

               if (var5 == null) {
                  if (var6 == var10001) {
                     return a(1442, 5021610010287526614L);
                  }

                  var6 = var4;
                  var10001 = Ro2.C;
               }

               if (var6 == var10001) {
               }

               return this.r(var1, var2, var3);
            }
         }

         var10000 = a(1442, 5021610010287526614L);
      }

      return var10000;
   }

   public int r(int var1, int var2, int var3) {
      this.d = new Wa2_2(this);
      return this.d.m(var1, var2, var3);
   }

   public int Y(int var1, int var2, boolean var3) {
      int[] var4;
      int[] var10000;
      var10000 = Nm4.g();
      this.d = new Wa2_2(this);
      var4 = var10000;
      int var10002 = (var3) ? 1 : 0;
      if (var4 == null) {
         var10002 = var3 != 0 ? -var2 : var2;
      }

      return this.d.Q(var1, var10002);
   }

   public int o(int var1) {
      int[] var2 = Nm4.g();
      Wa2_2 var10000 = this.d;
      if (var2 == null) {
         if (this.d == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.d;
      }

      return var10000.a(var1);
   }

   public int I() {
      int[] var1 = Nm4.g();
      Wa2_2 var10000 = this.d;
      if (var1 == null) {
         if (this.d == null) {
            return a(28512, 7488959672094373907L);
         }

         var10000 = this.d;
      }

      int var2 = var10000.Y();
      this.d = null;
      return var2;
   }

   public int m(int var1, int var2) {
      int[] var3 = Nm4.g();
      Wa2_2 var10000 = this.d;
      if (var3 == null) {
         if (this.d == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.d;
      }

      return var10000.K(var1, var2);
   }

   public int I(byte[] var1, int var2) {
      int[] var3 = Nm4.g();
      Wa2_2 var10000 = this.d;
      if (var3 == null) {
         if (this.d == null) {
            return a(1442, 5021610010287526614L);
         }

         var10000 = this.d;
      }

      return var10000.x(var1, var2);
   }

   public void O() {
      int[] var10000;
      var10000 = Nm4.g();
      int var2 = this.d.I;
      int[] var1 = var10000;
      int var3 = var2;
      if (var1 == null) {
         if (var2 > this.g) {
            var2 = this.g;
         }

         var3 = var2;
      }

      if (var1 == null) {
         if (var3 == 0) {
            return;
         }

         var3 = this.d.F.length;
      }

      label54: {
         label46:
         if (var1 == null) {
            if (var3 > this.d.W) {
               var3 = this.h.length;
               if (var1 != null) {
                  break label46;
               }

               if (var3 > this.V) {
                  var3 = this.d.F.length;
                  if (var1 != null) {
                     break label46;
                  }

                  if (var3 >= this.d.W + var2 && this.h.length < this.V + var2) {
                  }
               }
            }

            System.arraycopy(this.d.F, this.d.W, this.h, this.V, var2);
            this.V += var2;
            this.d.W += var2;
            this.F += (long)var2;
            this.g -= var2;
            this.d.I -= var2;
            var4 = this.d;
            if (var1 != null) {
               break label54;
            }

            var3 = this.d.I;
         }

         if (var3 != 0) {
            return;
         }

         var4 = this.d;
      }

      var4.W = 0;
   }

   public int H(byte[] var1, int var2, int var3) {
      int[] var4;
      int[] var10000;
      var10000 = Nm4.g();
      int var5 = this.L;
      var4 = var10000;
      int var6 = var5;
      if (var4 == null) {
         if (var5 > var3) {
            var5 = var3;
         }

         var6 = var5;
      }

      if (var4 == null) {
         if (var6 == 0) {
            return 0;
         }

         this.L -= var5;
         var6 = this.d.Y;
      }

      if (var4 == null) {
         if (var6 != 0) {
            this.e.A(this.x, this.f, var5);
         }

         System.arraycopy(this.x, this.f, var1, var2, var5);
         this.f += var5;
         this.O += (long)var5;
         var6 = var5;
      }

      return var6;
   }

   public long U() {
      return this.e.u();
   }

   public void n$void() {
      this.x = null;
      this.h = null;
      this.t = null;
   }

   public void j(byte[] var1) {
      this.U(var1, 0, var1.length);
   }

   public void U(byte[] var1, int var2, int var3) {
      this.h = var1;
      this.V = var2;
      this.g = var3;
   }

   public void b(byte[] var1) {
      this.Z(var1, 0, var1.length, false);
   }

   public void X(byte[] var1, boolean var2) {
      this.Z(var1, 0, var1.length, var2);
   }

   public void Z(byte[] var1, int var2, int var3, boolean var4) {
      int[] var10000;
      Df2 var7;
      label54: {
         int[] var5;
         var5 = Nm4.g();
         var10000 = (int[])(var3);
         label46:
         if (var5 == null) {
            label44: {
               if (var3 <= 0) {
                  var10000 = (int[])(var4);
                  if (var5 != null) {
                     break label46;
                  }

                  if (var4) {
                     var7 = this;
                     if (var5 != null) {
                        break label44;
                     }

                     if (this.x != null) {
                        return;
                     }
                  }
               }

               var7 = this;
            }

            if (var5 != null) {
               break label54;
            }

            var10000 = (int[])(var7.L);
         }

         label30:
         if (var10000 > 0) {
            int var8 = var4;
            if (var5 == null) {
               if (!var4) {
                  break label30;
               }

               var8 = this.L + var3;
            }

            byte[] var6 = new byte[var8];
            System.arraycopy(this.x, this.f, var6, 0, this.L);
            System.arraycopy(var1, var2, var6, this.L, var3);
            this.x = var6;
            this.f = 0;
            this.L += var3;
            if (var5 == null) {
               return;
            }
         }

         this.x = var1;
         this.f = var2;
         var7 = this;
      }

      var7.L = var3;
   }

   public byte[] y() {
      return this.x;
   }

   public void B(byte[] var1) {
      this.x = var1;
   }

   public int b() {
      return this.f;
   }

   public void x(int var1) {
      this.f = var1;
   }

   public int s() {
      return this.L;
   }

   public void O(int var1) {
      this.L = var1;
   }

   public byte[] D() {
      return this.h;
   }

   public void e(byte[] var1) {
      this.h = var1;
   }

   public int h$int() {
      return this.V;
   }

   public void h(int var1) {
      this.V = var1;
   }

   public int e() {
      return this.g;
   }

   public void u(int var1) {
      this.g = var1;
   }

   public long N$long() {
      return this.F;
   }

   public long z() {
      return this.O;
   }

   public String R() {
      return this.t;
   }

   public int v() {
      return 0;
   }

   public boolean h$boolean() {
      return false;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22386;
      if (i[var3] == null) {
         i[var3] = (int)(c[var3] ^ var1);
      }

      return i[var3];
   }

   public static void __vfClinit__() {
      long[] var10000;
      long var0 = 6900814795839161487L;
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "\u009ehé/Ôq\u008câêí 9\u0099V\u0003bs\u008cíÈ¢l\u008c\"µ9Ø\u0007EQ\u0098Ó<õ§òÎ\u00182m";
      int var5 = "\u009ehé/Ôq\u008câêí 9\u0099V\u0003bs\u008cíÈ¢l\u008c\"µ9Ø\u0007EQ\u0098Ó<õ§òÎ\u00182m".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10000 = var6;
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
                     c = var6;
                     i = new Integer[7];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Gg\u007f_bÓ°\u0099ö]A\u0093\u0086\u0084é§";
                  var5 = "Gg\u007f_bÓ°\u0099ö]A\u0093\u0086\u0084é§".length();
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
}





