package com.finalshell.core;

public final class Wa2_2 implements Cloneable {
   public static DT3[] r;
   public static String[] O;
   public Df2 Q;
   public int R;
   public byte[] F;
   public int a;
   public int W;
   public int I;
   public int Y = 1;
   public byte M;
   public byte T;
   public int c;
   public int Z;
   public int B;
   public int p;
   public byte[] D;
   public int x;
   public short[] i;
   public short[] k;
   public int U4;
   public int UK;
   public int S;
   public int w;
   public int C;
   public int q;
   public int E;
   public int e;
   public int d;
   public int f;
   public int j;
   public int U;
   public int Uj;
   public int u;
   public int P;
   public int N;
   public int b;
   public int l;
   public int g;
   public short[] L;
   public short[] Ue;
   public short[] Uf;
   public Xd2 UJ = new Xd2();
   public Xd2 s = new Xd2();
   public Xd2 m = new Xd2();
   public short[] v = new short[a(11385, 6033874610907855286L)];
   public short[] UW = new short[a(11385, 6033874610907855286L)];
   public int[] X = new int[a(19763, 7225873651125737694L)];
   public int h;
   public int H;
   public byte[] z = new byte[a(28674, 1165011225590556113L)];
   public byte[] G;
   public int K;
   public int n;
   public int y;
   public int V;
   public int t;
   public int A;
   public int U9;
   public short o;
   public int J;
   public DF_2 UV = null;
   public static long[] ab;
   public static Integer[] bb;
   public static long[] cb;
   public static Long[] db;

   public Wa2_2(Df2 var1) {
      this.Q = var1;
      this.L = new short[a(30706, 2572097326115644012L)];
      this.Ue = new short[a(1533, 1726388448479842404L)];
      this.Uf = new short[a(28537, 3590607867828796089L)];
   }

   public void m() {
      int[] var10000 = Nm4.g();
      this.x = 2 * this.Z;
      this.k[this.UK - 1] = 0;
      int[] var1 = var10000;
      int var2 = 0;

      while (true) {
         if (var2 < this.UK - 1) {
            this.k[var2] = 0;
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         this.P = r[this.N].r;
         this.l = r[this.N].q;
         this.g = r[this.N].y;
         this.u = r[this.N].U;
         this.f = 0;
         this.q = 0;
         this.U = 0;
         this.E = this.Uj = 2;
         this.d = 0;
         this.U4 = 0;
         break;
      }
   }

   public void B() {
      this.UJ.V = this.L;
      this.UJ.n = GK.D;
      this.s.V = this.Ue;
      this.s.n = GK.p;
      this.m.V = this.Uf;
      this.m.n = GK.L;
      this.o = 0;
      this.J = 0;
      this.U9 = a(674, 4619306808194668361L);
      this.X();
   }

   public void X() {
      int[] var10000 = Nm4.g();
      int var2 = 0;
      int[] var1 = var10000;

      while (true) {
         if (var2 < a(4070, 384312355185793581L)) {
            this.L[var2 * 2] = 0;
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var2 = 0;
         break;
      }

      while (true) {
         if (var2 < a(12369, 6660857589810767260L)) {
            this.Ue[var2 * 2] = 0;
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var2 = 0;
         break;
      }

      while (true) {
         if (var2 < a(27447, 7314451647333793519L)) {
            this.Uf[var2 * 2] = 0;
            var2++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         this.L[a(22120, 7571742034290656139L)] = 1;
         this.V = this.t = 0;
         this.n = this.A = 0;
         break;
      }
   }

   public void O(short[] var1, int var2) {
      int[] var3;
      int var6;
      int[] var10000 = Nm4.g();
      int var4 = this.X[var2];
      var3 = var10000;
      int var5 = var2 << 1;

      while (true) {
         label39:
         if (var5 <= this.h) {
            if (var3 != null) {
               break;
            }

            var6 = var5;
            label35:
            if (var3 == null) {
               if (var5 < this.h) {
                  var6 = (m(var1, this.X[var5 + 1], this.X[var5], this.z)) ? 1 : 0;
                  if (var3 != null) {
                     break label35;
                  }

                  if (var6 != 0) {
                     var5++;
                  }
               }

               var6 = (m(var1, var4, this.X[var5], this.z)) ? 1 : 0;
            }

            if (var3 == null) {
               if (var6 != 0 && var3 == null) {
                  break label39;
               }

               this.X[var2] = this.X[var5];
               var2 = var5;
               var6 = var5 << 1;
            }

            var5 = var6;
            if (var3 == null) {
               continue;
            }
         }

         this.X[var2] = var4;
         break;
      }
   }

   public static boolean m(short[] var0, int var1, int var2, byte[] var3) {
      int[] var10000 = Nm4.g();
      short var5 = var0[var1 * 2];
      int[] var4 = var10000;
      short var6 = var0[var2 * 2];
      short var7 = var5;
      if (var4 == null) {
         if (var5 >= var6) {
            short var8 = var5;
            short var10001 = var6;
            if (var4 == null) {
               if (var5 != var6) {
                  return 0 != 0;
               }

               var8 = var3[var1];
               if (var4 != null) {
                  return var8 != 0;
               }

               var10001 = var3[var2];
            }

            if (var8 > var10001) {
               return 0 != 0;
            }
         }

         var7 = 1;
      }

      return var7 != 0;
   }

   public void B(short[] var1, int var2) {
      int[] var3;
      short var6;
      short var5 = -1;
      int[] var10002 = Nm4.g();
      short var7 = var1[1];
      var3 = var10002;
      int var8 = 0;
      int var9 = a(29657, 4152544568793720388L);
      short var10 = 4;
      int var10000 = var7;
      if (var3 == null) {
         if (var7 == 0) {
            var9 = a(18567, 1433694224735001958L);
            var10 = 3;
         }

         var1[(var2 + 1) * 2 + 1] = -1;
         var10000 = 0;
      }

      int var4 = var10000;

      while (var4 <= var2) {
         label97: {
            label98: {
               label99: {
                  int var10001;
                  var6 = var7;
                  var7 = var1[(var4 + 1) * 2 + 1];
                  var10000 = ++var8;
                  var10001 = var9;
                  label86:
                  if (var3 == null) {
                     if (var8 < var9) {
                        var10000 = var6;
                        var10001 = var7;
                        if (var3 != null) {
                           break label86;
                        }

                        if (var6 == var7 && var3 == null) {
                           break label97;
                        }
                     }

                     var10000 = var8;
                     if (var3 != null) {
                        break label99;
                     }

                     var10001 = var10;
                  }

                  if (var10000 < var10001) {
                     this.Uf[var6 * 2] = (short)(this.Uf[var6 * 2] + (short)var8);
                     if (var3 == null) {
                        break label98;
                     }
                  }

                  var10000 = var6;
               }

               if (var3 == null) {
                  if (var10000 != 0) {
                     if (var6 != var5) {
                        this.Uf[var6 * 2]++;
                     }

                     this.Uf[a(32470, 4607017807551359760L)]++;
                     if (var3 == null) {
                        break label98;
                     }
                  }

                  var10000 = var8;
               }

               if (var10000 <= a(25474, 5076007018410538614L)) {
                  this.Uf[a(27496, 1076911588194156223L)]++;
                  if (var3 == null) {
                     break label98;
                  }
               }

               this.Uf[a(13196, 7471053410697062012L)]++;
            }

            var8 = 0;
            var5 = var6;
            short var15 = var7;
            if (var3 == null) {
               if (var7 == 0) {
                  var9 = a(18567, 1433694224735001958L);
                  var10 = 3;
                  if (var3 == null) {
                     break label97;
                  }
               }

               var15 = var6;
            }

            if (var3 == null) {
               if (var15 == var7) {
                  var9 = a(26002, 7364195423021592659L);
                  var10 = 3;
                  if (var3 == null) {
                     break label97;
                  }
               }

               var9 = a(29657, 4152544568793720388L);
               var15 = 4;
            }

            var10 = var15;
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   public int D() {
      int var3;
      this.B(this.L, this.UJ.J);
      this.B(this.Ue, this.s.J);
      this.m.t(this);
      int[] var10000 = Nm4.g();
      int var2 = a(14389, 8170115760957042169L);
      int[] var1 = var10000;

      while (true) {
         if (var2 >= 3) {
            var3 = this.Uf[Xd2.M[var2] * 2 + 1];
            if (var1 != null) {
               break;
            }

            if (var3 == 0 || var1 != null) {
               var2--;
               if (var1 == null) {
                  continue;
               }
            }
         }

         this.V += 3 * (var2 + 1) + 5 + 5 + 4;
         var3 = var2;
         break;
      }

      return var3;
   }

   public void f(int var1, int var2, int var3) {
      this.W(var1 - a(16642, 7579497002448737520L), 5);
      int[] var10000 = Nm4.g();
      this.W(var2 - 1, 5);
      this.W(var3 - 4, 4);
      int[] var4 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var3) {
            this.W(this.Uf[Xd2.M[var5] * 2 + 1], 3);
            var5++;
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         this.w(this.L, var1 - 1);
         this.w(this.Ue, var2 - 1);
         break;
      }
   }

   public void w(short[] var1, int var2) {
      int var11;
      int var12;
      int[] var3;
      short var6;
      short var5 = -1;
      int[] var10000 = Nm4.g();
      short var7 = var1[1];
      int var8 = 0;
      int var9 = a(29657, 4152544568793720388L);
      var3 = var10000;
      short var10 = 4;
      var11 = var7;
      if (var3 == null) {
         if (var7 == 0) {
            var9 = a(19309, 2657578515937255103L);
            var10 = 3;
         }

         var11 = 0;
      }

      int var4 = var11;

      while (var4 <= var2) {
         label100: {
            label101: {
               label102: {
                  int var10001;
                  var6 = var7;
                  var7 = var1[(var4 + 1) * 2 + 1];
                  var12 = ++var8;
                  var10001 = var9;
                  label89:
                  if (var3 == null) {
                     if (var8 < var9) {
                        var12 = var6;
                        var10001 = var7;
                        if (var3 != null) {
                           break label89;
                        }

                        if (var6 == var7 && var3 == null) {
                           break label100;
                        }
                     }

                     var12 = var8;
                     if (var3 != null) {
                        break label102;
                     }

                     var10001 = var10;
                  }

                  if (var12 < var10001) {
                     while (true) {
                        this.i(var6, this.Uf);
                        if (--var8 == 0) {
                           break label101;
                        }
                     }
                  }

                  var12 = var6;
               }

               if (var3 == null) {
                  if (var12 != 0) {
                     if (var6 != var5) {
                        this.i(var6, this.Uf);
                        var8--;
                     }

                     this.i(a(11385, 6033874610907855286L), this.Uf);
                     this.W(var8 - 3, 2);
                     if (var3 == null) {
                        break label101;
                     }
                  }

                  var12 = var8;
               }

               if (var12 <= a(25474, 5076007018410538614L)) {
                  this.i(a(9546, 4294102662092337324L), this.Uf);
                  this.W(var8 - 3, 3);
                  if (var3 == null) {
                     break label101;
                  }
               }

               this.i(a(5547, 1186511094697230403L), this.Uf);
               this.W(var8 - a(4912, 4650141211243284175L), a(29657, 4152544568793720388L));
            }

            var8 = 0;
            var5 = var6;
            short var13 = var7;
            if (var3 == null) {
               if (var7 == 0) {
                  var9 = a(18567, 1433694224735001958L);
                  var10 = 3;
                  if (var3 == null) {
                     break label100;
                  }
               }

               var13 = var6;
            }

            if (var3 == null) {
               if (var13 == var7) {
                  var9 = a(26002, 7364195423021592659L);
                  var10 = 3;
                  if (var3 == null) {
                     break label100;
                  }
               }

               var9 = a(29657, 4152544568793720388L);
               var13 = 4;
            }

            var10 = var13;
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   public final void P(byte[] var1, int var2, int var3) {
      System.arraycopy(var1, var2, this.F, this.I, var3);
      this.I += var3;
   }

   public final void a(byte var1) {
      this.F[this.I++] = var1;
   }

   public final void C(int var1) {
      this.a((byte)var1);
      this.a((byte)(var1 >>> a(674, 4619306808194668361L)));
   }

   public final void G(int var1) {
      this.a((byte)(var1 >> a(674, 4619306808194668361L)));
      this.a((byte)var1);
   }

   public final void i(int var1, short[] var2) {
      int var3;
      var3 = var1 * 2;
      this.W(var2[var3] & a(10923, 7527050280887795560L), var2[var3 + 1] & a(14491, 9174950205415632236L));
   }

   public void W(int var1, int var2) {
      int[] var3 = Nm4.g();
      Wa2_2 var10000 = this;
      if (var3 == null) {
         if (this.J > a(11385, 6033874610907855286L) - var2) {
            this.o = (short)(this.o | (short)(var1 << this.J & a(14491, 9174950205415632236L)));
            this.C(this.o);
            this.o = (short)(var1 >>> a(11385, 6033874610907855286L) - this.J);
            this.J = this.J + (var2 - a(11385, 6033874610907855286L));
            if (var3 == null) {
               return;
            }
         }

         this.o = (short)(this.o | (short)(var1 << this.J & a(14491, 9174950205415632236L)));
         var10000 = this;
      }

      var10000.J += var2;
   }

   public void E() {
      int[] var10000 = Nm4.g();
      this.W(2, 3);
      int[] var1 = var10000;
      this.i(a(11665, 4083881631959726166L), GK.G);
      this.Z();
      if (var1 == null) {
         if (1 + this.U9 + a(25474, 5076007018410538614L) - this.J < a(32530, 6539745746093271784L)) {
            this.W(2, 3);
            this.i(a(11665, 4083881631959726166L), GK.G);
            this.Z();
         }

         this.U9 = a(29657, 4152544568793720388L);
      }
   }

   public boolean Y(int var1, int var2) {
      int[] var3;
      int var6;
      label68: {
         this.F[this.y + this.n * 2] = (byte)(var1 >>> a(674, 4619306808194668361L));
         int[] var10000 = Nm4.g();
         this.F[this.y + this.n * 2 + 1] = (byte)var1;
         this.G[this.n] = (byte)var2;
         this.n++;
         var3 = var10000;
         if (var3 == null) {
            if (var1 == 0) {
               this.L[var2 * 2]++;
               if (var3 == null) {
                  break label68;
               }
            }

            this.A++;
            var1--;
            this.L[(Xd2.v[var2] + a(11665, 4083881631959726166L) + 1) * 2]++;
         }

         this.Ue[Xd2.f(var1) * 2]++;
      }

      int var9 = this.n & a(19623, 3237656604028787066L);
      if (var3 == null) {
         if (var9 == 0) {
            if (var3 != null) {
               return (boolean)((this.N == 2 ? 1 : 0) != 0);
            }

            if (this.N > 2) {
               int var4 = this.n * a(674, 4619306808194668361L);
               int var5 = this.f - this.q;
               var6 = 0;

               while (true) {
                  if (var6 < a(2004, 6993718967149859372L)) {
                     var4 += this.Ue[var6 * 2] * (5 + Xd2.A[var6]);
                     var6++;
                     if (var3 != null) {
                        break;
                     }

                     if (var3 == null) {
                        continue;
                     }
                  }

                  var4 >>>= 3;
                  break;
               }

               int var11 = this.n / 2;
               if (var3 != null) {
                  return (boolean)((this.A == var11 ? 1 : 0) != 0);
               }

               if (this.A < var11) {
                  var11 = var5 / 2;
                  if (var3 != null) {
                     return (boolean)((var4 == var11 ? 1 : 0) != 0);
                  }

                  if (var4 < var11) {
                     return true;
                  }
               }
            }
         }

         var9 = this.n;
      }

      if (var3 != null) {
         return var9 != 0;
      } else {
         return (boolean)((var9 == this.K - 1 ? 1 : 0) != 0);
      }
   }

   public void H(short[] var1, short[] var2) {
      Wa2_2 var11;
      int var12;
      int[] var3;
      int var6;
      int[] var10000 = Nm4.g();
      var6 = 0;
      var3 = var10000;
      var11 = this;
      if (var3 == null) {
         if (this.n != 0) {
            do {
               label41: {
                  int var4 = this.F[this.y + var6 * 2] << a(674, 4619306808194668361L) & a(30469, 2117598553947464410L)
                     | this.F[this.y + var6 * 2 + 1] & a(28102, 2568201338079377498L);
                  int var5 = this.G[var6] & a(28102, 2568201338079377498L);
                  var6++;
                  if (var4 == 0) {
                     this.i(var5, var1);
                     if (var3 == null) {
                        break label41;
                     }
                  }

                  int var7 = Xd2.v[var5];
                  this.i(var7 + a(11665, 4083881631959726166L) + 1, var1);
                  int var8 = Xd2.w[var7];
                  var12 = var8;
                  if (var3 == null) {
                     if (var8 != 0) {
                        var5 -= Xd2.j[var7];
                        this.W(var5, var8);
                     }

                     var7 = Xd2.f(--var4);
                     this.i(var7, var2);
                     var8 = Xd2.A[var7];
                     var12 = var8;
                  }

                  if (var3 != null) {
                     continue;
                  }

                  if (var12 != 0) {
                     var4 -= Xd2.N[var7];
                     this.W(var4, var8);
                  }
               }

               var12 = var6;
            } while (var12 < this.n);
         }

         this.i(a(11665, 4083881631959726166L), var1);
         var11 = this;
      }

      var11.U9 = var1[a(23070, 2628685220654927856L)];
   }

   public void A() {
      int[] var10000 = Nm4.g();
      int var2 = 0;
      int[] var1 = var10000;
      short var3 = 0;
      short var4 = 0;

      label45: {
         label44:
         while (true) {
            if (var2 < a(29657, 4152544568793720388L)) {
               var4 += this.L[var2 * 2];
               var2++;
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            while (true) {
               if (var2 >= a(23439, 60516941033197130L)) {
                  break label44;
               }

               var3 += this.L[var2 * 2];
               var2++;
               if (var1 != null) {
                  break label45;
               }

               if (var1 != null) {
                  break label44;
               }
            }
         }

         while (var2 < a(11665, 4083881631959726166L)) {
            var4 += this.L[var2 * 2];
            var2++;
            if (var1 != null) {
               return;
            }

            if (var1 != null) {
               break;
            }
         }
      }

      int var10001 = var4;
      if (var1 == null) {
         var10001 = var4 > var3 >>> 2 ? 0 : 1;
      }

      this.M = (byte)var10001;
   }

   public void Z() {
      Wa2_2 var2;
      label26: {
         int[] var1 = Nm4.g();
         int var10000 = this.J;
         int var10001 = a(11385, 6033874610907855286L);
         if (var1 == null) {
            if (var10000 == var10001) {
               this.C(this.o);
               this.o = 0;
               this.J = 0;
               if (var1 == null) {
                  return;
               }
            }

            var2 = this;
            if (var1 != null) {
               break label26;
            }

            var10000 = this.J;
            var10001 = a(674, 4619306808194668361L);
         }

         if (var10000 < var10001) {
            return;
         }

         this.a((byte)this.o);
         this.o = (short)(this.o >>> a(674, 4619306808194668361L));
         var2 = this;
      }

      var2.J = var2.J - a(674, 4619306808194668361L);
   }

   public void F() {
      Wa2_2 var2;
      label23: {
         label22: {
            int[] var1 = Nm4.g();
            int var10000 = this.J;
            if (var1 == null) {
               if (this.J > a(674, 4619306808194668361L)) {
                  this.C(this.o);
                  if (var1 == null) {
                     break label22;
                  }
               }

               var2 = this;
               if (var1 != null) {
                  break label23;
               }

               var10000 = this.J;
            }

            if (var10000 > 0) {
               this.a((byte)this.o);
            }
         }

         this.o = 0;
         var2 = this;
      }

      var2.J = 0;
   }

   public void D(int var1, int var2, boolean var3) {
      int[] var10000 = Nm4.g();
      boolean var5 = false;
      int[] var4 = var10000;
      this.F();
      this.U9 = a(11616, 1819031572542765199L);
      if (var4 == null) {
         if (var3) {
            this.C((short)var2);
            this.C((short)(~var2));
         }

         this.P(this.D, var1, var2);
      }
   }

   public void b(boolean var1) {
      int[] var2 = Nm4.g();
      int var10001 = this.q;
      if (var2 == null) {
         var10001 = this.q >= 0 ? this.q : -1;
      }

      this.t(var10001, this.f - this.q, var1);
      this.q = this.f;
      this.Q.O();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int P(int var1) {
      int var3;
      int var6;
      int[] var10000 = Nm4.g();
      var3 = a(14491, 9174950205415632236L);
      int[] var2 = var10000;
      int var5 = var3;
      int var10001 = this.a - 5;
      if (var2 == null) {
         if (var3 > var10001) {
            var3 = this.a - 5;
         }

         var5 = this.U;
         var10001 = 1;
      }

      label225:
      while (true) {
         if (var5 <= var10001) {
            this.M();
            var6 = this.U;
            if (var2 == null) {
               if (this.U == 0) {
                  var6 = var1;
                  if (var2 == null) {
                     if (var1 == 0) {
                        return 0;
                     }

                     var6 = this.U;
                  }
               } else {
                  var6 = this.U;
               }
            }

            if (var2 == null) {
               if (var6 == 0 && var2 == null) {
                  var10001 = var1;
                  if (var2 == null) {
                     var10001 = var1 == 4 ? 1 : 0;
                  }

                  this.b(var10001);
                  int var7 = this.Q.g;
                  if (var2 == null) {
                     if (this.Q.g == 0) {
                        int var8 = var1;
                        if (var2 == null) {
                           var8 = var1 == 4 ? 2 : 0;
                        }

                        return var8;
                     }

                     var7 = var1;
                  }

                  if (var2 == null) {
                     var7 = var7 == 4 ? 3 : 1;
                  }

                  return var7;
               }

               this.f = this.f + this.U;
               this.U = 0;
               var6 = this.q + var3;
            }
         } else {
            this.f = this.f + this.U;
            this.U = 0;
            var6 = this.q + var3;
         }

         while (true) {
            int var4 = var6;
            int var9 = this.f;
            if (var2 == null) {
               if (this.f != 0) {
                  if (var2 == null) {
                     int var10;
                     if (this.f >= var4) {
                        this.U = this.f - var4;
                        this.f = var4;
                        this.b(false);
                        var10 = this.Q.g;
                        if (var2 == null) {
                           if (this.Q.g == 0) {
                              return 0;
                           }

                           var10 = this.f - this.q;
                        }
                     } else {
                        var10 = this.f - this.q;
                     }

                     if (var2 == null) {
                        if (var10 < this.Z - a(3252, 258262829457807697L)) {
                           break;
                        }

                        this.b(false);
                        var10 = this.Q.g;
                     }

                     if (var10 != 0) {
                        var5 = this.U;
                        var10001 = 1;
                        continue label225;
                     }

                     var6 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  } else {
                     if (this.f < var4) {
                        break;
                     }

                     this.b(false);
                     if (this.Q.g != 0) {
                        var5 = this.U;
                        var10001 = 1;
                        continue label225;
                     }

                     var6 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  }
               } else {
                  this.U = this.f - var4;
                  this.f = var4;
                  this.b(false);
                  int var11 = this.Q.g;
                  if (var2 == null) {
                     if (this.Q.g == 0) {
                        return 0;
                     }

                     var11 = this.f - this.q;
                  }

                  if (var2 == null) {
                     if (var11 < this.Z - a(3252, 258262829457807697L)) {
                        break;
                     }

                     this.b(false);
                     var11 = this.Q.g;
                  }

                  if (var11 != 0) {
                     var5 = this.U;
                     var10001 = 1;
                     continue label225;
                  }

                  var6 = 0;
                  if (var2 == null) {
                     return 0;
                  }
               }
            } else {
               if (var2 == null) {
                  if (this.f == 0) {
                     return 0;
                  }

                  var9 = this.f - this.q;
               }

               if (var2 == null) {
                  if (var9 < this.Z - a(3252, 258262829457807697L)) {
                     break;
                  }

                  this.b(false);
                  var9 = this.Q.g;
               }

               if (var9 != 0) {
                  var5 = this.U;
                  var10001 = 1;
                  continue label225;
               }

               var6 = 0;
               if (var2 == null) {
                  return 0;
               }
            }

            if (var2 == null) {
               if (var6 == 0) {
                  var6 = var1;
                  if (var2 == null) {
                     if (var1 == 0) {
                        return 0;
                     }

                     var6 = this.U;
                  }
               } else {
                  var6 = this.U;
               }
            }

            if (var2 == null) {
               if (var6 == 0 && var2 == null) {
                  var10001 = var1;
                  if (var2 == null) {
                     var10001 = var1 == 4 ? 1 : 0;
                  }

                  this.b(var10001);
                  int var12 = this.Q.g;
                  if (var2 == null) {
                     if (this.Q.g == 0) {
                        int var13 = var1;
                        if (var2 == null) {
                           var13 = var1 == 4 ? 2 : 0;
                        }

                        return var13;
                     }

                     var12 = var1;
                  }

                  if (var2 == null) {
                     var12 = var12 == 4 ? 3 : 1;
                  }

                  return var12;
               }

               this.f = this.f + this.U;
               this.U = 0;
               var6 = this.q + var3;
            }
         }

         var5 = this.U;
         var10001 = 1;
      }
   }

   public void l(int var1, int var2, boolean var3) {
      int[] var4 = Nm4.g();
      int var10002 = (var3) ? 1 : 0;
      if (var4 == null) {
         var10002 = var3 != 0 ? 1 : 0;
      }

      this.W(0 + var10002, 3);
      this.D(var1, var2, true);
   }

   public void t(int var1, int var2, boolean var3) {
      Wa2_2 var11;
      boolean var13;
      int var6;
      int[] var4;
      int var5;
      int var7;
      int var10;
      int var12;
      label82: {
         label81: {
            int[] var10000 = Nm4.g();
            var7 = 0;
            var4 = var10000;
            var10 = this.N;
            if (var4 == null) {
               if (this.N > 0) {
                  var10 = this.M;
                  byte var10001 = 2;
                  if (var4 == null) {
                     if (this.M == 2) {
                        this.A();
                     }

                     this.UJ.t(this);
                     this.s.t(this);
                     var7 = this.D();
                     var10 = this.V + 3 + a(29657, 4152544568793720388L);
                     var10001 = 3;
                  }

                  var5 = var10 >>> var10001;
                  var6 = this.t + 3 + a(29657, 4152544568793720388L) >>> 3;
                  var10 = var6;
                  var12 = var5;
                  if (var4 != null) {
                     break label82;
                  }

                  if (var6 > var5) {
                     break label81;
                  }

                  var5 = var6;
                  if (var4 == null) {
                     break label81;
                  }
               }

               var10 = var2 + 5;
            }

            var6 = var10;
            var5 = var10;
         }

         var10 = var2 + 4;
         var12 = var5;
      }

      label86: {
         label67:
         if (var4 == null) {
            if (var10 <= var12) {
               var10 = var1;
               var12 = -1;
               if (var4 != null) {
                  break label67;
               }

               if (var1 != -1) {
                  this.l(var1, var2, (boolean)var3);
                  if (var4 == null) {
                     break label86;
                  }
               }
            }

            var10 = var6;
            var12 = var5;
         }

         if (var10 == var12) {
            int var10002 = (var3) ? 1 : 0;
            if (var4 == null) {
               var10002 = var3 != 0 ? 1 : 0;
            }

            this.W(2 + var10002, 3);
            this.H(GK.G, GK.d);
            if (var4 == null) {
               break label86;
            }
         }

         var13 = var3;
         if (var4 == null) {
            var13 = (var3 != 0 ? 1 : 0) != 0;
         }

         this.W(4 + var13, 3);
         this.f(this.UJ.J + 1, this.s.J + 1, var7 + 1);
         this.H(this.L, this.Ue);
      }

      var11 = this;
      if (var4 == null) {
         this.X();
         if (var3 == 0) {
            return;
         }

         var11 = this;
      }

      var11.F();
   }

   public void M() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nm4.g ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Wa2_2.x I
      // 008: aload 0
      // 009: getfield com/finalshell/core/Wa2_2.U I
      // 00c: isub
      // 00d: aload 0
      // 00e: getfield com/finalshell/core/Wa2_2.f I
      // 011: isub
      // 012: istore 5
      // 014: iload 5
      // 016: ifne 039
      // 019: aload 0
      // 01a: getfield com/finalshell/core/Wa2_2.f I
      // 01d: aload 1
      // 01e: ifnonnull 03b
      // 021: ifne 039
      // 024: aload 0
      // 025: getfield com/finalshell/core/Wa2_2.U I
      // 028: aload 1
      // 029: ifnonnull 03b
      // 02c: ifne 039
      // 02f: aload 0
      // 030: getfield com/finalshell/core/Wa2_2.Z I
      // 033: istore 5
      // 035: aload 1
      // 036: ifnull 130
      // 039: iload 5
      // 03b: bipush -1
      // 03c: aload 1
      // 03d: ifnonnull 065
      // 040: if_icmpne 04a
      // 043: iinc 5 -1
      // 046: aload 1
      // 047: ifnull 130
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Wa2_2.f I
      // 04e: aload 1
      // 04f: ifnonnull 137
      // 052: aload 0
      // 053: getfield com/finalshell/core/Wa2_2.Z I
      // 056: aload 0
      // 057: getfield com/finalshell/core/Wa2_2.Z I
      // 05a: iadd
      // 05b: sipush 3252
      // 05e: ldc2_w 258262829457807697
      // 061: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 064: isub
      // 065: if_icmplt 130
      // 068: aload 0
      // 069: getfield com/finalshell/core/Wa2_2.D [B
      // 06c: aload 0
      // 06d: getfield com/finalshell/core/Wa2_2.Z I
      // 070: aload 0
      // 071: getfield com/finalshell/core/Wa2_2.D [B
      // 074: bipush 0
      // 075: aload 0
      // 076: getfield com/finalshell/core/Wa2_2.Z I
      // 079: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 07c: aload 0
      // 07d: dup
      // 07e: getfield com/finalshell/core/Wa2_2.j I
      // 081: aload 0
      // 082: getfield com/finalshell/core/Wa2_2.Z I
      // 085: isub
      // 086: putfield com/finalshell/core/Wa2_2.j I
      // 089: aload 0
      // 08a: dup
      // 08b: getfield com/finalshell/core/Wa2_2.f I
      // 08e: aload 0
      // 08f: getfield com/finalshell/core/Wa2_2.Z I
      // 092: isub
      // 093: putfield com/finalshell/core/Wa2_2.f I
      // 096: aload 0
      // 097: dup
      // 098: getfield com/finalshell/core/Wa2_2.q I
      // 09b: aload 0
      // 09c: getfield com/finalshell/core/Wa2_2.Z I
      // 09f: isub
      // 0a0: putfield com/finalshell/core/Wa2_2.q I
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/Wa2_2.UK I
      // 0a7: istore 2
      // 0a8: iload 2
      // 0a9: istore 4
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/Wa2_2.k [S
      // 0af: iinc 4 -1
      // 0b2: iload 4
      // 0b4: saload
      // 0b5: sipush 14491
      // 0b8: ldc2_w 9174950205415632236
      // 0bb: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 0be: iand
      // 0bf: istore 3
      // 0c0: aload 0
      // 0c1: getfield com/finalshell/core/Wa2_2.k [S
      // 0c4: iload 4
      // 0c6: iload 3
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/core/Wa2_2.Z I
      // 0cb: if_icmplt 0d8
      // 0ce: iload 3
      // 0cf: aload 0
      // 0d0: getfield com/finalshell/core/Wa2_2.Z I
      // 0d3: isub
      // 0d4: i2s
      // 0d5: goto 0d9
      // 0d8: bipush 0
      // 0d9: sastore
      // 0da: iinc 2 -1
      // 0dd: iload 2
      // 0de: ifne 0ab
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/Wa2_2.Z I
      // 0e5: istore 2
      // 0e6: iload 2
      // 0e7: aload 1
      // 0e8: ifnonnull 0de
      // 0eb: istore 4
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/core/Wa2_2.i [S
      // 0f1: iinc 4 -1
      // 0f4: iload 4
      // 0f6: saload
      // 0f7: sipush 14491
      // 0fa: ldc2_w 9174950205415632236
      // 0fd: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 100: iand
      // 101: istore 3
      // 102: aload 0
      // 103: getfield com/finalshell/core/Wa2_2.i [S
      // 106: iload 4
      // 108: iload 3
      // 109: aload 0
      // 10a: getfield com/finalshell/core/Wa2_2.Z I
      // 10d: if_icmplt 11a
      // 110: iload 3
      // 111: aload 0
      // 112: getfield com/finalshell/core/Wa2_2.Z I
      // 115: isub
      // 116: i2s
      // 117: goto 11b
      // 11a: bipush 0
      // 11b: sastore
      // 11c: iinc 2 -1
      // 11f: iload 2
      // 120: ifne 0ed
      // 123: iload 5
      // 125: aload 0
      // 126: getfield com/finalshell/core/Wa2_2.Z I
      // 129: iadd
      // 12a: aload 1
      // 12b: ifnonnull 120
      // 12e: istore 5
      // 130: aload 0
      // 131: getfield com/finalshell/core/Wa2_2.Q Lcom/finalshell/core/Df2;
      // 134: getfield com/finalshell/core/Df2.L I
      // 137: aload 1
      // 138: ifnonnull 155
      // 13b: ifne 13f
      // 13e: return
      // 13f: aload 0
      // 140: getfield com/finalshell/core/Wa2_2.Q Lcom/finalshell/core/Df2;
      // 143: aload 0
      // 144: getfield com/finalshell/core/Wa2_2.D [B
      // 147: aload 0
      // 148: getfield com/finalshell/core/Wa2_2.f I
      // 14b: aload 0
      // 14c: getfield com/finalshell/core/Wa2_2.U I
      // 14f: iadd
      // 150: iload 5
      // 152: invokevirtual com/finalshell/core/Df2.H ([BII)I
      // 155: istore 2
      // 156: aload 0
      // 157: dup
      // 158: getfield com/finalshell/core/Wa2_2.U I
      // 15b: iload 2
      // 15c: iadd
      // 15d: putfield com/finalshell/core/Wa2_2.U I
      // 160: aload 0
      // 161: getfield com/finalshell/core/Wa2_2.U I
      // 164: bipush 3
      // 165: aload 1
      // 166: ifnonnull 1bc
      // 169: if_icmplt 1ab
      // 16c: aload 0
      // 16d: aload 0
      // 16e: getfield com/finalshell/core/Wa2_2.D [B
      // 171: aload 0
      // 172: getfield com/finalshell/core/Wa2_2.f I
      // 175: baload
      // 176: sipush 28102
      // 179: ldc2_w 2568201338079377498
      // 17c: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 17f: iand
      // 180: putfield com/finalshell/core/Wa2_2.U4 I
      // 183: aload 0
      // 184: aload 0
      // 185: getfield com/finalshell/core/Wa2_2.U4 I
      // 188: aload 0
      // 189: getfield com/finalshell/core/Wa2_2.C I
      // 18c: ishl
      // 18d: aload 0
      // 18e: getfield com/finalshell/core/Wa2_2.D [B
      // 191: aload 0
      // 192: getfield com/finalshell/core/Wa2_2.f I
      // 195: bipush 1
      // 196: iadd
      // 197: baload
      // 198: sipush 28102
      // 19b: ldc2_w 2568201338079377498
      // 19e: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 1a1: iand
      // 1a2: ixor
      // 1a3: aload 0
      // 1a4: getfield com/finalshell/core/Wa2_2.w I
      // 1a7: iand
      // 1a8: putfield com/finalshell/core/Wa2_2.U4 I
      // 1ab: aload 0
      // 1ac: getfield com/finalshell/core/Wa2_2.U I
      // 1af: aload 1
      // 1b0: ifnonnull 1c6
      // 1b3: sipush 3252
      // 1b6: ldc2_w 258262829457807697
      // 1b9: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 1bc: if_icmpge 1c9
      // 1bf: aload 0
      // 1c0: getfield com/finalshell/core/Wa2_2.Q Lcom/finalshell/core/Df2;
      // 1c3: getfield com/finalshell/core/Df2.L I
      // 1c6: ifne 004
      // 1c9: aload 1
      // 1ca: ifnonnull 039
      // 1cd: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int k(int var1) {
      int var3;
      int var6;
      int var9;
      int[] var10000 = Nm4.g();
      var3 = 0;
      int[] var2 = var10000;

      while (true) {
         int var7;
         if (this.U < a(5703, 8615324106034709403L)) {
            this.M();
            var7 = this.U;
            if (var2 == null) {
               if (this.U < a(3252, 258262829457807697L)) {
                  var7 = var1;
                  if (var2 == null) {
                     if (var1 == 0) {
                        return 0;
                     }

                     var7 = this.U;
                  }
               } else {
                  var7 = this.U;
               }
            }

            if (var2 == null) {
               if (var7 == 0 && var2 == null) {
                  int var10001 = var1;
                  if (var2 == null) {
                     var10001 = var1 == 4 ? 1 : 0;
                  }

                  this.b(var10001);
                  int var8 = this.Q.g;
                  if (var2 == null) {
                     if (this.Q.g == 0) {
                        var9 = var1;
                        if (var2 == null) {
                           if (var1 == 4) {
                              return 2;
                           }

                           var9 = 0;
                        }

                        return var9;
                     }

                     var8 = var1;
                  }

                  if (var2 == null) {
                     var8 = var8 == 4 ? 3 : 1;
                  }

                  return var8;
               }

               var7 = this.U;
            }

            if (var2 == null) {
               if (var7 >= 3) {
                  this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(30278, 9099380523506787223L)) & this.w;
                  var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                  this.i[this.f & this.p] = this.k[this.U4];
                  this.k[this.U4] = (short)this.f;
               }

               long var22;
               var7 = (var22 = (long)var3 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            }
         } else {
            var7 = this.U;
            if (var2 == null) {
               if (this.U >= 3) {
                  this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(30278, 9099380523506787223L)) & this.w;
                  var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                  this.i[this.f & this.p] = this.k[this.U4];
                  this.k[this.U4] = (short)this.f;
               }

               long var23;
               var7 = (var23 = (long)var3 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            }
         }

         while (true) {
            label353: {
               int var20;
               label354: {
                  if (var2 == null) {
                     if (var7 != 0) {
                        var7 = this.f - var3 & a(14491, 9174950205415632236L);
                        var20 = this.Z - a(3252, 258262829457807697L);
                        if (var2 != null) {
                           break label354;
                        }

                        if (var7 <= var20) {
                           var7 = this.b;
                           var20 = 2;
                           if (var2 != null) {
                              break label354;
                           }

                           if (this.b != 2) {
                              this.E = this.B(var3);
                           }

                           var7 = this.E;
                        } else {
                           var7 = this.E;
                        }
                     } else {
                        var7 = this.E;
                     }
                  }

                  if (var2 != null) {
                     var6 = var7;
                     this.U--;
                     this.f++;
                     int var17 = var6;
                     if (var2 == null) {
                        if (var6 == 0) {
                           break;
                        }

                        this.b(false);
                        var17 = this.Q.g;
                     }

                     if (var17 != 0) {
                        break;
                     }

                     var7 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                     break label353;
                  }

                  var20 = 3;
               }

               if (var7 < var20) {
                  byte var5 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                  this.U--;
                  this.f++;
                  int var16 = var5;
                  if (var2 == null) {
                     if (var5 == 0) {
                        break;
                     }

                     this.b(false);
                     var16 = this.Q.g;
                  }

                  if (var16 != 0) {
                     break;
                  }

                  var7 = 0;
                  if (var2 == null) {
                     return 0;
                  }
               } else {
                  byte var4 = (byte)((this.Y(this.f - this.j, this.E - 3)) ? 1 : 0);
                  this.U = this.U - this.E;
                  if (var2 != null) {
                     this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & a(28102, 2568201338079377498L)) & this.w;
                     if (var2 != null) {
                        var4 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                        this.U--;
                        this.f++;
                     }

                     int var15 = var4;
                     if (var2 == null) {
                        if (var4 == 0) {
                           break;
                        }

                        this.b(false);
                        var15 = this.Q.g;
                     }

                     if (var15 != 0) {
                        break;
                     }

                     var7 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  } else if (this.E > this.P) {
                     this.f = this.f + this.E;
                     this.E = 0;
                     this.U4 = this.D[this.f] & a(28102, 2568201338079377498L);
                     this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & a(28102, 2568201338079377498L)) & this.w;
                     if (var2 != null) {
                        var4 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                        this.U--;
                        this.f++;
                     }

                     int var14 = var4;
                     if (var2 == null) {
                        if (var4 == 0) {
                           break;
                        }

                        this.b(false);
                        var14 = this.Q.g;
                     }

                     if (var14 != 0) {
                        break;
                     }

                     var7 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  } else if (var2 != null) {
                     this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & a(28102, 2568201338079377498L)) & this.w;
                     if (var2 != null) {
                        var4 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                        this.U--;
                        this.f++;
                     }

                     int var13 = var4;
                     if (var2 == null) {
                        if (var4 == 0) {
                           break;
                        }

                        this.b(false);
                        var13 = this.Q.g;
                     }

                     if (var13 != 0) {
                        break;
                     }

                     var7 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  } else if (this.U < 3) {
                     this.f = this.f + this.E;
                     this.E = 0;
                     this.U4 = this.D[this.f] & a(28102, 2568201338079377498L);
                     this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & a(28102, 2568201338079377498L)) & this.w;
                     if (var2 != null) {
                        var4 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                        this.U--;
                        this.f++;
                     }

                     int var12 = var4;
                     if (var2 == null) {
                        if (var4 == 0) {
                           break;
                        }

                        this.b(false);
                        var12 = this.Q.g;
                     }

                     if (var12 != 0) {
                        break;
                     }

                     var7 = 0;
                     if (var2 == null) {
                        return 0;
                     }
                  } else {
                     this.E--;
                     this.f++;
                     this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(28102, 2568201338079377498L)) & this.w;
                     var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                     this.i[this.f & this.p] = this.k[this.U4];
                     this.k[this.U4] = (short)this.f;

                     do {
                        while (--this.E != 0) {
                           this.f++;
                           this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(28102, 2568201338079377498L)) & this.w;
                           var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                           this.i[this.f & this.p] = this.k[this.U4];
                           this.k[this.U4] = (short)this.f;
                        }

                        this.f++;
                     } while (var2 != null);

                     if (var2 != null) {
                        this.f = this.f + this.E;
                        this.E = 0;
                        this.U4 = this.D[this.f] & a(28102, 2568201338079377498L);
                        this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & a(28102, 2568201338079377498L)) & this.w;
                        if (var2 != null) {
                           var4 = (byte)((this.Y(0, this.D[this.f] & a(28102, 2568201338079377498L))) ? 1 : 0);
                           this.U--;
                           this.f++;
                        }

                        int var10 = var4;
                        if (var2 == null) {
                           if (var4 == 0) {
                              break;
                           }

                           this.b(false);
                           var10 = this.Q.g;
                        }

                        if (var10 != 0) {
                           break;
                        }

                        var7 = 0;
                        if (var2 == null) {
                           return 0;
                        }
                     } else {
                        int var11 = var4;
                        if (var2 == null) {
                           if (var4 == 0) {
                              break;
                           }

                           this.b(false);
                           var11 = this.Q.g;
                        }

                        if (var11 != 0) {
                           break;
                        }

                        var7 = 0;
                        if (var2 == null) {
                           return 0;
                        }
                     }
                  }
               }
            }

            if (var2 == null) {
               if (var7 < a(3252, 258262829457807697L)) {
                  var7 = var1;
                  if (var2 == null) {
                     if (var1 == 0) {
                        return 0;
                     }

                     var7 = this.U;
                  }
               } else {
                  var7 = this.U;
               }
            }

            if (var2 == null) {
               if (var7 == 0 && var2 == null) {
                  int var21 = var1;
                  if (var2 == null) {
                     var21 = var1 == 4 ? 1 : 0;
                  }

                  this.b(var21);
                  int var18 = this.Q.g;
                  if (var2 == null) {
                     if (this.Q.g == 0) {
                        int var19 = var1;
                        if (var2 == null) {
                           if (var1 == 4) {
                              return 2;
                           }

                           var19 = 0;
                        }

                        return var19;
                     }

                     var18 = var1;
                  }

                  if (var2 == null) {
                     var18 = var18 == 4 ? 3 : 1;
                  }

                  return var18;
               }

               var7 = this.U;
            }

            if (var2 == null) {
               if (var7 >= 3) {
                  this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(30278, 9099380523506787223L)) & this.w;
                  var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                  this.i[this.f & this.p] = this.k[this.U4];
                  this.k[this.U4] = (short)this.f;
               }

               long var24;
               var7 = (var24 = (long)var3 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int f(int var1) {
      Wa2_2 var11;
      int var12;
      int var3;
      int var9;
      int[] var10000 = Nm4.g();
      var3 = 0;
      int[] var2 = var10000;

      label250:
      while (true) {
         label257: {
            int var10001;
            label258: {
               label246: {
                  if (this.U < a(3252, 258262829457807697L)) {
                     this.M();
                     var9 = this.U;
                     label242:
                     if (var2 == null) {
                        var10001 = a(3252, 258262829457807697L);
                        if (var2 != null) {
                           break label258;
                        }

                        if (var9 < var10001) {
                           var9 = var1;
                           if (var2 != null) {
                              break label242;
                           }

                           if (var1 == 0) {
                              return 0;
                           }
                        }

                        var9 = this.U;
                     }

                     if (var2 != null) {
                        break label246;
                     }

                     if (var9 == 0 && var2 == null) {
                        break;
                     }
                  }

                  var9 = this.U;
               }

               if (var2 != null) {
                  break label257;
               }

               var10001 = 3;
            }

            if (var9 >= var10001) {
               this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(28102, 2568201338079377498L)) & this.w;
               var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
               this.i[this.f & this.p] = this.k[this.U4];
               this.k[this.U4] = (short)this.f;
            }

            this.Uj = this.E;
            this.e = this.j;
            this.E = a(21730, 2608830680892227845L);
            var9 = var3;
         }

         label261: {
            int var19;
            label262: {
               if (var2 == null) {
                  if (var9 != 0) {
                     var9 = this.Uj;
                     var19 = this.P;
                     if (var2 != null) {
                        break label262;
                     }

                     if (this.Uj < this.P) {
                        var9 = this.f - var3 & a(14491, 9174950205415632236L);
                        var19 = this.Z - a(3252, 258262829457807697L);
                        if (var2 != null) {
                           break label262;
                        }

                        if (var9 <= var19) {
                           var9 = this.b;
                           var19 = 2;
                           if (var2 == null) {
                              if (this.b != 2) {
                                 this.E = this.B(var3);
                              }

                              var9 = this.E;
                              var19 = 5;
                           }

                           if (var2 != null) {
                              break label262;
                           }

                           label212:
                           if (var9 <= var19) {
                              Wa2_2 var10 = this;
                              if (var2 == null) {
                                 if (this.b != 1) {
                                    var9 = this.E;
                                    var19 = 3;
                                    if (var2 != null) {
                                       break label262;
                                    }

                                    if (this.E != 3) {
                                       break label212;
                                    }

                                    var9 = this.f - this.j;
                                    var19 = a(12905, 8440713305693071250L);
                                    if (var2 != null) {
                                       break label262;
                                    }

                                    if (var9 <= var19) {
                                       break label212;
                                    }
                                 }

                                 var10 = this;
                              }

                              var10.E = a(14237, 6663532021443043927L);
                           }
                        }
                     }
                  }

                  var9 = this.Uj;
               }

               if (var2 != null) {
                  if (var9 != 0) {
                     byte var4 = (byte)((this.Y(0, this.D[this.f - 1] & a(28102, 2568201338079377498L))) ? 1 : 0);
                     var12 = var4;
                     if (var2 == null) {
                        if (var4 != 0) {
                           this.b(false);
                        }

                        this.f++;
                        this.U--;
                        var12 = this.Q.g;
                     }

                     if (var2 == null) {
                        if (var12 != 0) {
                           continue;
                        }

                        var12 = 0;
                     }

                     return var12;
                  }

                  this.d = 1;
                  this.f++;
                  var11 = this;
                  break label261;
               }

               var19 = 3;
            }

            label266: {
               if (var9 >= var19) {
                  var13 = this.E;
                  if (var2 != null) {
                     break label266;
                  }

                  if (this.E <= this.Uj) {
                     int var5 = this.f + this.U - 3;
                     byte var6 = (byte)((this.Y(this.f - 1 - this.e, this.Uj - 3)) ? 1 : 0);
                     this.U = this.U - (this.Uj - 1);
                     this.Uj -= 2;

                     label187:
                     while (true) {
                        if (++this.f <= var5) {
                           this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & a(28102, 2568201338079377498L)) & this.w;
                           var3 = this.k[this.U4] & a(14491, 9174950205415632236L);
                           this.i[this.f & this.p] = this.k[this.U4];
                           this.k[this.U4] = (short)this.f;
                        }

                        while (--this.Uj == 0) {
                           this.d = 0;
                           this.E = a(14237, 6663532021443043927L);
                           this.f++;
                           int var14 = var6;
                           if (var2 == null) {
                              label269: {
                                 if (var2 == null) {
                                    if (var6 == 0) {
                                       break label269;
                                    }

                                    this.b(false);
                                    var14 = this.Q.g;
                                 }

                                 if (var2 != null) {
                                    return var14;
                                 }

                                 if (var14 == 0) {
                                    return 0;
                                 }
                              }

                              if (var2 == null) {
                                 continue label250;
                              }
                              break label187;
                           }

                           var3 = var6;
                           this.i[this.f & this.p] = this.k[this.U4];
                           this.k[this.U4] = (short)this.f;
                        }
                     }
                  }
               }

               var11 = this;
               if (var2 != null) {
                  break label261;
               }

               var13 = this.d;
            }

            if (var13 != 0) {
               byte var8 = (byte)((this.Y(0, this.D[this.f - 1] & a(28102, 2568201338079377498L))) ? 1 : 0);
               int var18 = var8;
               if (var2 == null) {
                  if (var8 != 0) {
                     this.b(false);
                  }

                  this.f++;
                  this.U--;
                  var18 = this.Q.g;
               }

               if (var2 == null) {
                  if (var18 != 0) {
                     continue;
                  }

                  var18 = 0;
               }

               return var18;
            }

            this.d = 1;
            this.f++;
            var11 = this;
         }

         var11.U--;
         if (var2 != null) {
            break;
         }
      }

      Wa2_2 var15 = this;
      if (var2 == null) {
         if (this.d != 0) {
            boolean var7 = this.Y(0, this.D[this.f - 1] & a(28102, 2568201338079377498L));
            this.d = 0;
         }

         var15 = this;
      }

      int var20 = var1;
      if (var2 == null) {
         var20 = var1 == 4 ? 1 : 0;
      }

      var15.b(var20);
      int var16 = this.Q.g;
      if (var2 == null) {
         if (this.Q.g == 0) {
            int var17 = var1;
            if (var2 == null) {
               if (var1 == 4) {
                  return 2;
               }

               var17 = 0;
            }

            return var17;
         }

         var16 = var1;
      }

      if (var2 == null) {
         var16 = var16 == 4 ? 3 : 1;
      }

      return var16;
   }

   public int B(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/core/Wa2_2.u I
      // 004: istore 3
      // 005: invokestatic com/finalshell/core/Nm4.g ()[I
      // 008: aload 0
      // 009: getfield com/finalshell/core/Wa2_2.f I
      // 00c: istore 4
      // 00e: astore 2
      // 00f: aload 0
      // 010: getfield com/finalshell/core/Wa2_2.Uj I
      // 013: istore 7
      // 015: aload 0
      // 016: getfield com/finalshell/core/Wa2_2.f I
      // 019: aload 0
      // 01a: getfield com/finalshell/core/Wa2_2.Z I
      // 01d: sipush 3252
      // 020: ldc2_w 258262829457807697
      // 023: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 026: isub
      // 027: aload 2
      // 028: ifnonnull 040
      // 02b: if_icmple 044
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/Wa2_2.f I
      // 032: aload 0
      // 033: getfield com/finalshell/core/Wa2_2.Z I
      // 036: sipush 3252
      // 039: ldc2_w 258262829457807697
      // 03c: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 03f: isub
      // 040: isub
      // 041: goto 045
      // 044: bipush 0
      // 045: istore 8
      // 047: aload 0
      // 048: getfield com/finalshell/core/Wa2_2.g I
      // 04b: istore 9
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Wa2_2.p I
      // 051: istore 10
      // 053: aload 0
      // 054: getfield com/finalshell/core/Wa2_2.f I
      // 057: sipush 19623
      // 05a: ldc2_w 5362284299108211022
      // 05d: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 060: iadd
      // 061: istore 11
      // 063: aload 0
      // 064: getfield com/finalshell/core/Wa2_2.D [B
      // 067: iload 4
      // 069: iload 7
      // 06b: iadd
      // 06c: bipush 1
      // 06d: isub
      // 06e: baload
      // 06f: istore 12
      // 071: aload 0
      // 072: getfield com/finalshell/core/Wa2_2.D [B
      // 075: iload 4
      // 077: iload 7
      // 079: iadd
      // 07a: baload
      // 07b: istore 13
      // 07d: aload 0
      // 07e: getfield com/finalshell/core/Wa2_2.Uj I
      // 081: aload 0
      // 082: getfield com/finalshell/core/Wa2_2.l I
      // 085: aload 2
      // 086: ifnonnull 09a
      // 089: if_icmplt 090
      // 08c: iload 3
      // 08d: bipush 2
      // 08e: ishr
      // 08f: istore 3
      // 090: iload 9
      // 092: aload 2
      // 093: ifnonnull 0a4
      // 096: aload 0
      // 097: getfield com/finalshell/core/Wa2_2.U I
      // 09a: if_icmple 0a3
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/Wa2_2.U I
      // 0a1: istore 9
      // 0a3: iload 1
      // 0a4: istore 5
      // 0a6: aload 0
      // 0a7: getfield com/finalshell/core/Wa2_2.D [B
      // 0aa: iload 5
      // 0ac: iload 7
      // 0ae: iadd
      // 0af: baload
      // 0b0: iload 13
      // 0b2: if_icmpne 23a
      // 0b5: aload 0
      // 0b6: getfield com/finalshell/core/Wa2_2.D [B
      // 0b9: iload 5
      // 0bb: iload 7
      // 0bd: iadd
      // 0be: bipush 1
      // 0bf: isub
      // 0c0: baload
      // 0c1: iload 12
      // 0c3: aload 2
      // 0c4: ifnonnull 251
      // 0c7: if_icmpne 23a
      // 0ca: aload 0
      // 0cb: getfield com/finalshell/core/Wa2_2.D [B
      // 0ce: iload 5
      // 0d0: baload
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/core/Wa2_2.D [B
      // 0d5: iload 4
      // 0d7: baload
      // 0d8: aload 2
      // 0d9: ifnonnull 251
      // 0dc: if_icmpne 23a
      // 0df: aload 0
      // 0e0: getfield com/finalshell/core/Wa2_2.D [B
      // 0e3: iinc 5 1
      // 0e6: iload 5
      // 0e8: baload
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/core/Wa2_2.D [B
      // 0ed: iload 4
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: baload
      // 0f2: if_icmpeq 0f9
      // 0f5: aload 2
      // 0f6: ifnull 23a
      // 0f9: iinc 4 2
      // 0fc: iinc 5 1
      // 0ff: aload 0
      // 100: getfield com/finalshell/core/Wa2_2.D [B
      // 103: iinc 4 1
      // 106: iload 4
      // 108: baload
      // 109: aload 0
      // 10a: getfield com/finalshell/core/Wa2_2.D [B
      // 10d: iinc 5 1
      // 110: iload 5
      // 112: baload
      // 113: if_icmpne 1da
      // 116: aload 0
      // 117: getfield com/finalshell/core/Wa2_2.D [B
      // 11a: iinc 4 1
      // 11d: iload 4
      // 11f: baload
      // 120: aload 0
      // 121: getfield com/finalshell/core/Wa2_2.D [B
      // 124: iinc 5 1
      // 127: iload 5
      // 129: baload
      // 12a: aload 2
      // 12b: ifnonnull 1e8
      // 12e: if_icmpne 1da
      // 131: aload 0
      // 132: getfield com/finalshell/core/Wa2_2.D [B
      // 135: iinc 4 1
      // 138: iload 4
      // 13a: baload
      // 13b: aload 0
      // 13c: getfield com/finalshell/core/Wa2_2.D [B
      // 13f: iinc 5 1
      // 142: iload 5
      // 144: baload
      // 145: aload 2
      // 146: ifnonnull 1e8
      // 149: if_icmpne 1da
      // 14c: aload 0
      // 14d: getfield com/finalshell/core/Wa2_2.D [B
      // 150: iinc 4 1
      // 153: iload 4
      // 155: baload
      // 156: aload 0
      // 157: getfield com/finalshell/core/Wa2_2.D [B
      // 15a: iinc 5 1
      // 15d: iload 5
      // 15f: baload
      // 160: aload 2
      // 161: ifnonnull 1e8
      // 164: if_icmpne 1da
      // 167: aload 0
      // 168: getfield com/finalshell/core/Wa2_2.D [B
      // 16b: iinc 4 1
      // 16e: iload 4
      // 170: baload
      // 171: aload 0
      // 172: getfield com/finalshell/core/Wa2_2.D [B
      // 175: iinc 5 1
      // 178: iload 5
      // 17a: baload
      // 17b: aload 2
      // 17c: ifnonnull 1e8
      // 17f: if_icmpne 1da
      // 182: aload 0
      // 183: getfield com/finalshell/core/Wa2_2.D [B
      // 186: iinc 4 1
      // 189: iload 4
      // 18b: baload
      // 18c: aload 0
      // 18d: getfield com/finalshell/core/Wa2_2.D [B
      // 190: iinc 5 1
      // 193: iload 5
      // 195: baload
      // 196: aload 2
      // 197: ifnonnull 1e8
      // 19a: if_icmpne 1da
      // 19d: aload 0
      // 19e: getfield com/finalshell/core/Wa2_2.D [B
      // 1a1: iinc 4 1
      // 1a4: iload 4
      // 1a6: baload
      // 1a7: aload 0
      // 1a8: getfield com/finalshell/core/Wa2_2.D [B
      // 1ab: iinc 5 1
      // 1ae: iload 5
      // 1b0: baload
      // 1b1: aload 2
      // 1b2: ifnonnull 1e8
      // 1b5: if_icmpne 1da
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/core/Wa2_2.D [B
      // 1bc: iinc 4 1
      // 1bf: iload 4
      // 1c1: baload
      // 1c2: aload 0
      // 1c3: getfield com/finalshell/core/Wa2_2.D [B
      // 1c6: iinc 5 1
      // 1c9: iload 5
      // 1cb: baload
      // 1cc: aload 2
      // 1cd: ifnonnull 1e8
      // 1d0: if_icmpne 1da
      // 1d3: iload 4
      // 1d5: iload 11
      // 1d7: if_icmplt 0ff
      // 1da: sipush 19623
      // 1dd: ldc2_w 5362284299108211022
      // 1e0: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 1e3: iload 11
      // 1e5: isub
      // 1e6: iload 4
      // 1e8: isub
      // 1e9: istore 6
      // 1eb: iload 11
      // 1ed: sipush 19623
      // 1f0: ldc2_w 5362284299108211022
      // 1f3: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 1f6: isub
      // 1f7: istore 4
      // 1f9: iload 6
      // 1fb: iload 7
      // 1fd: aload 2
      // 1fe: ifnonnull 12a
      // 201: aload 2
      // 202: ifnonnull 251
      // 205: if_icmple 23a
      // 208: aload 0
      // 209: iload 1
      // 20a: putfield com/finalshell/core/Wa2_2.j I
      // 20d: iload 6
      // 20f: istore 7
      // 211: iload 6
      // 213: aload 2
      // 214: ifnonnull 238
      // 217: iload 9
      // 219: if_icmplt 220
      // 21c: aload 2
      // 21d: ifnull 25f
      // 220: aload 0
      // 221: getfield com/finalshell/core/Wa2_2.D [B
      // 224: iload 4
      // 226: iload 7
      // 228: iadd
      // 229: bipush 1
      // 22a: isub
      // 22b: baload
      // 22c: istore 12
      // 22e: aload 0
      // 22f: getfield com/finalshell/core/Wa2_2.D [B
      // 232: iload 4
      // 234: iload 7
      // 236: iadd
      // 237: baload
      // 238: istore 13
      // 23a: aload 0
      // 23b: getfield com/finalshell/core/Wa2_2.i [S
      // 23e: iload 1
      // 23f: iload 10
      // 241: iand
      // 242: saload
      // 243: sipush 14491
      // 246: ldc2_w 9174950205415632236
      // 249: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 24c: iand
      // 24d: dup
      // 24e: istore 1
      // 24f: iload 8
      // 251: aload 2
      // 252: ifnonnull 26d
      // 255: if_icmple 25f
      // 258: iinc 3 -1
      // 25b: iload 3
      // 25c: ifne 0a3
      // 25f: iload 7
      // 261: aload 2
      // 262: ifnonnull 277
      // 265: aload 0
      // 266: getfield com/finalshell/core/Wa2_2.U I
      // 269: aload 2
      // 26a: ifnonnull 0c3
      // 26d: if_icmpgt 273
      // 270: iload 7
      // 272: ireturn
      // 273: aload 0
      // 274: getfield com/finalshell/core/Wa2_2.U I
      // 277: ireturn
   }

   public int m(int var1, int var2, int var3) {
      return this.C(var1, a(674, 4619306808194668361L), var2, var3, 0);
   }

   public int Q(int var1, int var2) {
      return this.C(var1, a(674, 4619306808194668361L), var2, a(674, 4619306808194668361L), 0);
   }

   public int x(int var1) {
      return this.Q(var1, a(12147, 2653577501029448333L));
   }

   public int C(int var1, int var2, int var3, int var4, int var5) {
      int[] var6;
      int var9;
      int[] var10000 = Nm4.g();
      byte var7 = 1;
      this.Q.t = null;
      var6 = var10000;
      int var8 = var1;
      if (var6 == null) {
         if (var1 == -1) {
            var1 = a(26002, 7364195423021592659L);
         }

         var8 = var3;
      }

      int var10001;
      label98: {
         label99: {
            if (var6 == null) {
               if (var8 < 0) {
                  var7 = 0;
                  var3 = -var3;
                  if (var6 == null) {
                     break label99;
                  }
               }

               var8 = var3;
            }

            var10001 = a(8208, 474818030858646985L);
            if (var6 != null) {
               break label98;
            }

            if (var8 > var10001) {
               var7 = 2;
               var3 -= 16;
               this.Q.e = new Ue2();
            }
         }

         var8 = var4;
         if (var6 != null) {
            return var4;
         }

         var10001 = 1;
      }

      if (var8 >= var10001) {
         if (var6 != null) {
            return var4;
         }

         if (var4 <= a(32530, 6539745746093271784L)) {
            if (var6 != null) {
               return var2;
            }

            if (var2 == a(674, 4619306808194668361L)) {
               if (var6 != null) {
                  return var3;
               }

               if (var3 >= a(32530, 6539745746093271784L)) {
                  if (var6 != null) {
                     return var3;
                  }

                  if (var3 <= a(12147, 2653577501029448333L)) {
                     if (var6 != null) {
                        return var1;
                     }

                     if (var1 >= 0) {
                        if (var6 != null) {
                           return var1;
                        }

                        if (var1 <= a(32530, 6539745746093271784L)) {
                           if (var6 != null) {
                              return var5;
                           }

                           if (var5 >= 0) {
                              var9 = var5;
                              if (var6 == null) {
                                 if (var5 > 2) {
                                    return a(11787, 3843511092555955169L);
                                 }

                                 this.Q.d = this;
                                 this.Y = var7;
                                 this.B = var3;
                                 this.Z = 1 << this.B;
                                 this.p = this.Z - 1;
                                 this.S = var4 + a(29657, 4152544568793720388L);
                                 this.UK = 1 << this.S;
                                 this.w = this.UK - 1;
                                 this.C = (this.S + 3 - 1) / 3;
                                 this.D = new byte[this.Z * 2];
                                 this.i = new short[this.Z];
                                 this.k = new short[this.UK];
                                 this.K = 1 << var4 + a(26002, 7364195423021592659L);
                                 this.F = new byte[this.K * 3];
                                 this.a = this.K * 3;
                                 this.y = this.K;
                                 this.G = new byte[this.K];
                                 this.N = var1;
                                 this.b = var5;
                                 this.T = (byte)var2;
                                 var9 = this.Q();
                              }

                              return var9;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return a(11787, 3843511092555955169L);
   }

   public int Q() {
      this.Q.O = this.Q.F = 0L;
      int[] var10000 = Nm4.g();
      this.Q.t = null;
      int[] var1 = var10000;
      this.Q.s = a(14237, 6663532021443043927L);
      this.I = 0;
      this.W = 0;
      Wa2_2 var2 = this;
      if (var1 == null) {
         if (this.Y < 0) {
            this.Y = -this.Y;
         }

         var2 = this;
      }

      int var10001 = this.Y;
      if (var1 == null) {
         var10001 = this.Y == 0 ? a(19013, 2193048932984872844L) : a(43, 8757325055301948887L);
      }

      var2.R = var10001;
      this.Q.e.C();
      this.c = 0;
      this.B();
      this.m();
      return 0;
   }

   public int Y() {
      int[] var1 = Nm4.g();
      int var10000 = this.R;
      int var10001 = a(43, 8757325055301948887L);
      if (var1 == null) {
         if (var10000 != var10001) {
            var10000 = this.R;
            var10001 = a(19013, 2193048932984872844L);
            if (var1 != null) {
               return var10000 == var10001 ? a(4162, 278793441181500800L) : 0;
            }

            if (var10000 != var10001) {
               var10000 = this.R;
               var10001 = a(11918, 7323045437863246698L);
               if (var1 != null) {
                  return var10000 == var10001 ? a(4162, 278793441181500800L) : 0;
               }

               if (var10000 != var10001) {
                  return a(11787, 3843511092555955169L);
               }
            }
         }

         this.F = null;
         this.G = null;
         this.k = null;
         this.i = null;
         this.D = null;
         var10000 = this.R;
         if (var1 != null) {
            return this.R;
         }

         var10001 = a(19013, 2193048932984872844L);
      }

      return var10000 == var10001 ? a(4162, 278793441181500800L) : 0;
   }

   public int K(int var1, int var2) {
      int[] var3;
      int[] var10000 = Nm4.g();
      int var4 = 0;
      var3 = var10000;
      int var5 = var1;
      if (var3 == null) {
         if (var1 == -1) {
            var1 = a(26002, 7364195423021592659L);
         }

         var5 = var1;
      }

      if (var3 == null) {
         if (var5 >= 0) {
            if (var3 != null) {
               return var1;
            }

            if (var1 <= a(32530, 6539745746093271784L)) {
               if (var3 != null) {
                  return var2;
               }

               label60:
               if (var2 >= 0) {
                  int var6 = var2;
                  int var10001 = 2;
                  if (var3 == null) {
                     if (var2 > 2) {
                        break label60;
                     }

                     var6 = r[this.N].A;
                     var10001 = r[var1].A;
                  }

                  if (var3 == null) {
                     label44: {
                        if (var6 != var10001) {
                           long var7;
                           var6 = (var7 = this.Q.O - 0L) == 0L ? 0 : (var7 < 0L ? -1 : 1);
                           if (var3 != null) {
                              break label44;
                           }

                           if (var6 != 0) {
                              var4 = this.Q.o(1);
                           }
                        }

                        var6 = this.N;
                     }

                     if (var3 != null) {
                        return var6;
                     }

                     var10001 = var1;
                  }

                  if (var6 != var10001) {
                     this.N = var1;
                     this.P = r[this.N].r;
                     this.l = r[this.N].q;
                     this.g = r[this.N].y;
                     this.u = r[this.N].U;
                  }

                  this.b = var2;
                  return var4;
               }
            }
         }

         var5 = a(12525, 4704727660512257335L);
      }

      return var5;
   }

   public int x(byte[] var1, int var2) {
      int[] var3;
      int var6;
      int[] var10000 = Nm4.g();
      int var4 = var2;
      int var5 = 0;
      var3 = var10000;
      if (var1 != null) {
         int var7 = this.R;
         int var10001 = a(21036, 7447472602658785273L);
         if (var3 == null) {
            if (var7 != var10001) {
               return a(11787, 3843511092555955169L);
            }

            this.Q.e.A(var1, 0, var2);
            var7 = var2;
            var10001 = 3;
         }

         label47: {
            if (var3 == null) {
               if (var7 < var10001) {
                  return 0;
               }

               var7 = var2;
               if (var3 != null) {
                  break label47;
               }

               var10001 = this.Z - a(3252, 258262829457807697L);
            }

            if (var7 > var10001) {
               var4 = this.Z - a(3252, 258262829457807697L);
               var5 = var2 - var4;
            }

            System.arraycopy(var1, var5, this.D, 0, var4);
            this.f = var4;
            this.q = var4;
            this.U4 = this.D[0] & a(28102, 2568201338079377498L);
            this.U4 = (this.U4 << this.C ^ this.D[1] & a(28102, 2568201338079377498L)) & this.w;
            var7 = 0;
         }

         var6 = var7;

         while (var6 <= var4 - 3) {
            this.U4 = (this.U4 << this.C ^ this.D[var6 + 2] & a(28102, 2568201338079377498L)) & this.w;
            this.i[var6 & this.p] = this.k[this.U4];
            this.k[this.U4] = (short)var6;
            var6++;
            if (var3 != null) {
               break;
            }
         }

         return 0;
      } else {
         return a(11787, 3843511092555955169L);
      }
   }

   public int a(int var1) {
      int var13;
      Wa2_2 var22;
      Wa2_2 var25;
      int[] var2 = Nm4.g();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 <= 4) {
            if (var2 != null) {
               return var1;
            }

            if (var1 >= 0) {
               label392: {
                  Df2 var14 = this.Q;
                  if (var2 == null) {
                     label342:
                     if (this.Q.h != null) {
                        Wa2_2 var15 = this;
                        if (var2 == null) {
                           if (this.Q.x == null) {
                              if (var2 != null) {
                                 return this.Q.L;
                              }

                              if (this.Q.L != 0) {
                                 break label342;
                              }
                           }

                           var15 = this;
                        }

                        var10000 = var15.R;
                        if (var2 != null) {
                           break label392;
                        }

                        if (var15.R == a(26424, 8057854510856499952L)) {
                           var10000 = var1;
                           if (var2 != null) {
                              break label392;
                           }

                           if (var1 != 4) {
                              break label342;
                           }
                        }

                        var10000 = this.Q.g;
                        break label392;
                     }

                     var14 = this.Q;
                  }

                  var14.t = O[4];
                  return a(11787, 3843511092555955169L);
               }

               if (var2 == null) {
                  if (var10000 == 0) {
                     this.Q.t = O[a(29657, 4152544568793720388L)];
                     return a(32411, 967861684975463266L);
                  }

                  var10000 = this.c;
               }

               int var3 = var10000;
               this.c = var1;
               var10000 = this.R;
               if (var2 == null) {
                  label305:
                  if (this.R == a(43, 8757325055301948887L)) {
                     var10000 = this.Y;
                     int var10001 = 2;
                     if (var2 == null) {
                        if (this.Y == 2) {
                           this.x().t(this);
                           this.R = a(8345, 3148434959273964887L);
                           this.Q.e.C();
                           if (var2 == null) {
                              break label305;
                           }
                        }

                        var10000 = a(674, 4619306808194668361L) + (this.B - a(674, 4619306808194668361L) << 4);
                        var10001 = a(674, 4619306808194668361L);
                     }

                     int var4 = var10000 << var10001;
                     int var5 = (this.N - 1 & a(28102, 2568201338079377498L)) >> 1;
                     var10000 = var5;
                     var10001 = 3;
                     if (var2 == null) {
                        if (var5 > 3) {
                           var5 = 3;
                        }

                        var10000 = var4;
                        var10001 = var5 << a(26002, 7364195423021592659L);
                     }

                     label361: {
                        var4 = var10000 | var10001;
                        var10000 = this.f;
                        if (var2 == null) {
                           if (this.f != 0) {
                              var4 |= a(32470, 4607017807551359760L);
                           }

                           var4 += a(26812, 7810448127324159312L) - var4 % a(25791, 8058402211562418506L);
                           this.R = a(19013, 2193048932984872844L);
                           this.G(var4);
                           var22 = this;
                           if (var2 != null) {
                              break label361;
                           }

                           var10000 = this.f;
                        }

                        if (var10000 != 0) {
                           long var6 = this.Q.e.u();
                           this.G((int)(var6 >>> a(11385, 6033874610907855286L)));
                           this.G((int)(var6 & b(8181, 7870284001560456034L)));
                        }

                        var22 = this;
                     }

                     var22.Q.e.C();
                  }

                  var10000 = this.I;
               }

               label363: {
                  int var28;
                  label364: {
                     label297: {
                        label365: {
                           if (var2 == null) {
                              if (var10000 != 0) {
                                 this.Q.O();
                                 var10000 = this.Q.g;
                                 if (var2 != null) {
                                    break label297;
                                 }

                                 if (this.Q.g == 0) {
                                    this.c = -1;
                                    return 0;
                                 }
                                 break label365;
                              }

                              var10000 = this.Q.L;
                           }

                           if (var2 != null) {
                              break label297;
                           }

                           if (var10000 == 0) {
                              var10000 = var1;
                              var28 = var3;
                              if (var2 != null) {
                                 break label364;
                              }

                              if (var1 <= var3) {
                                 var10000 = var1;
                                 var28 = 4;
                                 if (var2 != null) {
                                    break label364;
                                 }

                                 if (var1 != 4) {
                                    this.Q.t = O[a(29657, 4152544568793720388L)];
                                    return a(13820, 5370206813438222351L);
                                 }
                              }
                           }
                        }

                        var10000 = this.R;
                     }

                     if (var2 != null) {
                        break label363;
                     }

                     var28 = a(11918, 7323045437863246698L);
                  }

                  if (var10000 == var28) {
                     var10000 = this.Q.L;
                     if (var2 != null) {
                        break label363;
                     }

                     if (this.Q.L != 0) {
                        this.Q.t = O[a(29657, 4152544568793720388L)];
                        return a(13820, 5370206813438222351L);
                     }
                  }

                  var10000 = this.Q.L;
               }

               label366: {
                  label269: {
                     label367: {
                        int var29;
                        label368: {
                           label266: {
                              label386: {
                                 label264:
                                 if (var2 == null) {
                                    if (var10000 == 0) {
                                       var10000 = this.U;
                                       if (var2 != null) {
                                          break label264;
                                       }

                                       if (this.U == 0) {
                                          var10000 = var1;
                                          if (var2 != null) {
                                             break label266;
                                          }

                                          if (var1 == 0) {
                                             break label386;
                                          }

                                          var10000 = this.R;
                                          var29 = a(11918, 7323045437863246698L);
                                          if (var2 != null) {
                                             break label368;
                                          }

                                          if (var10000 == var29) {
                                             break label386;
                                          }
                                       }
                                    }

                                    var10000 = -1;
                                 }

                                 int var10 = var10000;
                                 var10000 = r[this.N].A;
                                 if (var2 == null) {
                                    switch (r[this.N].A) {
                                       case 0:
                                          var10 = this.P(var1);
                                          if (var2 == null) {
                                             break;
                                          }
                                       case 1:
                                          var10 = this.k(var1);
                                          if (var2 == null) {
                                             break;
                                          }
                                       case 2:
                                          var10 = this.f(var1);
                                    }

                                    var10000 = var10;
                                 }

                                 label240: {
                                    label239: {
                                       label238: {
                                          byte var30 = 2;
                                          if (var2 == null) {
                                             if (var10000 == 2) {
                                                break label238;
                                             }

                                             var10000 = var10;
                                             if (var2 != null) {
                                                break label240;
                                             }

                                             var30 = 3;
                                          }

                                          if (var10000 != var30) {
                                             break label239;
                                          }
                                       }

                                       this.R = a(11918, 7323045437863246698L);
                                    }

                                    var10000 = var10;
                                 }

                                 if (var2 != null) {
                                    break label366;
                                 }

                                 if (var10000 == 0) {
                                    break label367;
                                 }

                                 var10000 = var10;
                                 var29 = 2;
                                 if (var2 == null) {
                                    if (var10 == 2) {
                                       break label367;
                                    }

                                    var10000 = var10;
                                    var29 = 1;
                                 }

                                 if (var2 != null) {
                                    break label368;
                                 }

                                 if (var10000 == var29) {
                                    label225: {
                                       label224: {
                                          label223: {
                                             var10000 = var1;
                                             byte var31 = 1;
                                             if (var2 == null) {
                                                if (var1 == 1) {
                                                   this.E();
                                                   if (var2 == null) {
                                                      break label223;
                                                   }
                                                }

                                                this.l(0, 0, false);
                                                var10000 = var1;
                                                if (var2 != null) {
                                                   break label225;
                                                }

                                                var31 = 3;
                                             }

                                             if (var10000 == var31) {
                                                var13 = 0;

                                                while (var13 < this.UK) {
                                                   this.k[var13] = 0;
                                                   var13++;
                                                   if (var2 != null) {
                                                      break label224;
                                                   }

                                                   if (var2 != null) {
                                                      break;
                                                   }
                                                }
                                             }
                                          }

                                          this.Q.O();
                                       }

                                       var10000 = this.Q.g;
                                    }

                                    if (var2 != null) {
                                       break label266;
                                    }

                                    if (var10000 == 0) {
                                       this.c = -1;
                                       return 0;
                                    }
                                 }
                              }

                              var10000 = var1;
                           }

                           if (var2 != null) {
                              break label269;
                           }

                           var29 = 4;
                        }

                        if (var10000 != var29) {
                           return 0;
                        }

                        var10000 = this.Y;
                        break label269;
                     }

                     var10000 = this.Q.g;
                     break label366;
                  }

                  label182: {
                     label376: {
                        if (var2 == null) {
                           if (var10000 <= 0) {
                              return 1;
                           }

                           var25 = this;
                           if (var2 != null) {
                              break label376;
                           }

                           var10000 = this.Y;
                        }

                        if (var10000 == 2) {
                           long var11 = this.Q.e.u();
                           this.a((byte)((int)(var11 & b(945, 5403995328249001767L))));
                           this.a((byte)((int)(var11 >> a(674, 4619306808194668361L) & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(var11 >> a(11385, 6033874610907855286L) & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(var11 >> a(29683, 77260705144792595L) & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(this.Q.O & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(this.Q.O >> a(674, 4619306808194668361L) & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(this.Q.O >> a(11385, 6033874610907855286L) & b(26823, 470063940230257746L))));
                           this.a((byte)((int)(this.Q.O >> a(16520, 8532962705696380254L) & b(26823, 470063940230257746L))));
                           this.x().U(var11);
                           if (var2 == null) {
                              break label182;
                           }
                        }

                        var25 = this;
                     }

                     long var12 = var25.Q.e.u();
                     this.G((int)(var12 >>> a(11385, 6033874610907855286L)));
                     this.G((int)(var12 & b(16876, 7121400348714218872L)));
                  }

                  this.Q.O();
                  var10000 = this.Y;
                  if (var2 == null) {
                     if (this.Y > 0) {
                        this.Y = -this.Y;
                     }

                     var10000 = this.I;
                  }

                  if (var2 == null) {
                     var10000 = var10000 != 0 ? 0 : 1;
                  }

                  return var10000;
               }

               if (var2 == null) {
                  if (var10000 == 0) {
                     this.c = -1;
                  }

                  var10000 = 0;
               }

               return var10000;
            }
         }

         var10000 = a(11787, 3843511092555955169L);
      }

      return var10000;
   }

   public static int E(Df2 param0, Df2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 25
      // 09: getfield com/finalshell/core/Df2.d Lcom/finalshell/core/Wa2_2;
      // 0c: ifnonnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // 15: athrow
      // 16: sipush 11787
      // 19: ldc2_w 3843511092555955169
      // 1c: invokestatic com/finalshell/core/Wa2_2.a (IJ)I
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // 23: athrow
      // 24: aload 1
      // 25: getfield com/finalshell/core/Df2.x [B
      // 28: aload 2
      // 29: ifnonnull 81
      // 2c: ifnull 5a
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // 35: athrow
      // 36: aload 0
      // 37: aload 1
      // 38: getfield com/finalshell/core/Df2.x [B
      // 3b: arraylength
      // 3c: newarray 8
      // 3e: putfield com/finalshell/core/Df2.x [B
      // 41: aload 1
      // 42: getfield com/finalshell/core/Df2.x [B
      // 45: bipush 0
      // 46: aload 0
      // 47: getfield com/finalshell/core/Df2.x [B
      // 4a: bipush 0
      // 4b: aload 1
      // 4c: getfield com/finalshell/core/Df2.x [B
      // 4f: arraylength
      // 50: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: getfield com/finalshell/core/Df2.f I
      // 5f: putfield com/finalshell/core/Df2.f I
      // 62: aload 0
      // 63: aload 1
      // 64: getfield com/finalshell/core/Df2.L I
      // 67: putfield com/finalshell/core/Df2.L I
      // 6a: aload 0
      // 6b: aload 1
      // 6c: getfield com/finalshell/core/Df2.O J
      // 6f: putfield com/finalshell/core/Df2.O J
      // 72: aload 1
      // 73: aload 2
      // 74: ifnonnull ec
      // 77: getfield com/finalshell/core/Df2.h [B
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // 80: athrow
      // 81: ifnull a8
      // 84: aload 0
      // 85: aload 1
      // 86: getfield com/finalshell/core/Df2.h [B
      // 89: arraylength
      // 8a: newarray 8
      // 8c: putfield com/finalshell/core/Df2.h [B
      // 8f: aload 1
      // 90: getfield com/finalshell/core/Df2.h [B
      // 93: bipush 0
      // 94: aload 0
      // 95: getfield com/finalshell/core/Df2.h [B
      // 98: bipush 0
      // 99: aload 1
      // 9a: getfield com/finalshell/core/Df2.h [B
      // 9d: arraylength
      // 9e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // a7: athrow
      // a8: aload 0
      // a9: aload 1
      // aa: getfield com/finalshell/core/Df2.V I
      // ad: putfield com/finalshell/core/Df2.V I
      // b0: aload 0
      // b1: aload 1
      // b2: getfield com/finalshell/core/Df2.g I
      // b5: putfield com/finalshell/core/Df2.g I
      // b8: aload 0
      // b9: aload 1
      // ba: getfield com/finalshell/core/Df2.F J
      // bd: putfield com/finalshell/core/Df2.F J
      // c0: aload 0
      // c1: aload 1
      // c2: getfield com/finalshell/core/Df2.t Ljava/lang/String;
      // c5: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // c8: aload 0
      // c9: aload 1
      // ca: getfield com/finalshell/core/Df2.s I
      // cd: putfield com/finalshell/core/Df2.s I
      // d0: aload 0
      // d1: aload 1
      // d2: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // d5: invokeinterface com/finalshell/core/Aj2.y ()Lcom/finalshell/core/Aj2; 1
      // da: putfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // dd: aload 0
      // de: aload 1
      // df: getfield com/finalshell/core/Df2.d Lcom/finalshell/core/Wa2_2;
      // e2: invokevirtual com/finalshell/core/Wa2_2.clone ()Ljava/lang/Object;
      // e5: checkcast com/finalshell/core/Wa2_2
      // e8: putfield com/finalshell/core/Df2.d Lcom/finalshell/core/Wa2_2;
      // eb: aload 0
      // ec: getfield com/finalshell/core/Df2.d Lcom/finalshell/core/Wa2_2;
      // ef: aload 0
      // f0: putfield com/finalshell/core/Wa2_2.Q Lcom/finalshell/core/Df2;
      // f3: goto f7
      // f6: astore 3
      // f7: bipush 0
      // f8: ireturn
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: aload 0
      // 04: invokespecial java/lang/Object.clone ()Ljava/lang/Object;
      // 07: checkcast com/finalshell/core/Wa2_2
      // 0a: astore 2
      // 0b: aload 2
      // 0c: aload 0
      // 0d: aload 2
      // 0e: getfield com/finalshell/core/Wa2_2.F [B
      // 11: invokespecial com/finalshell/core/Wa2_2.y ([B)[B
      // 14: putfield com/finalshell/core/Wa2_2.F [B
      // 17: aload 2
      // 18: aload 0
      // 19: aload 2
      // 1a: getfield com/finalshell/core/Wa2_2.G [B
      // 1d: invokespecial com/finalshell/core/Wa2_2.y ([B)[B
      // 20: putfield com/finalshell/core/Wa2_2.G [B
      // 23: aload 2
      // 24: aload 0
      // 25: aload 2
      // 26: getfield com/finalshell/core/Wa2_2.D [B
      // 29: invokespecial com/finalshell/core/Wa2_2.y ([B)[B
      // 2c: putfield com/finalshell/core/Wa2_2.D [B
      // 2f: astore 1
      // 30: aload 2
      // 31: aload 0
      // 32: aload 2
      // 33: getfield com/finalshell/core/Wa2_2.i [S
      // 36: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 39: putfield com/finalshell/core/Wa2_2.i [S
      // 3c: aload 2
      // 3d: aload 0
      // 3e: aload 2
      // 3f: getfield com/finalshell/core/Wa2_2.k [S
      // 42: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 45: putfield com/finalshell/core/Wa2_2.k [S
      // 48: aload 2
      // 49: aload 0
      // 4a: aload 2
      // 4b: getfield com/finalshell/core/Wa2_2.L [S
      // 4e: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 51: putfield com/finalshell/core/Wa2_2.L [S
      // 54: aload 2
      // 55: aload 0
      // 56: aload 2
      // 57: getfield com/finalshell/core/Wa2_2.Ue [S
      // 5a: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 5d: putfield com/finalshell/core/Wa2_2.Ue [S
      // 60: aload 2
      // 61: aload 0
      // 62: aload 2
      // 63: getfield com/finalshell/core/Wa2_2.Uf [S
      // 66: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 69: putfield com/finalshell/core/Wa2_2.Uf [S
      // 6c: aload 2
      // 6d: aload 0
      // 6e: aload 2
      // 6f: getfield com/finalshell/core/Wa2_2.v [S
      // 72: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 75: putfield com/finalshell/core/Wa2_2.v [S
      // 78: aload 2
      // 79: aload 0
      // 7a: aload 2
      // 7b: getfield com/finalshell/core/Wa2_2.UW [S
      // 7e: invokespecial com/finalshell/core/Wa2_2.N ([S)[S
      // 81: putfield com/finalshell/core/Wa2_2.UW [S
      // 84: aload 2
      // 85: aload 0
      // 86: aload 2
      // 87: getfield com/finalshell/core/Wa2_2.X [I
      // 8a: invokespecial com/finalshell/core/Wa2_2.I ([I)[I
      // 8d: putfield com/finalshell/core/Wa2_2.X [I
      // 90: aload 2
      // 91: aload 0
      // 92: aload 2
      // 93: getfield com/finalshell/core/Wa2_2.z [B
      // 96: invokespecial com/finalshell/core/Wa2_2.y ([B)[B
      // 99: putfield com/finalshell/core/Wa2_2.z [B
      // 9c: aload 2
      // 9d: getfield com/finalshell/core/Wa2_2.UJ Lcom/finalshell/core/Xd2;
      // a0: aload 2
      // a1: getfield com/finalshell/core/Wa2_2.L [S
      // a4: putfield com/finalshell/core/Xd2.V [S
      // a7: aload 2
      // a8: getfield com/finalshell/core/Wa2_2.s Lcom/finalshell/core/Xd2;
      // ab: aload 2
      // ac: getfield com/finalshell/core/Wa2_2.Ue [S
      // af: putfield com/finalshell/core/Xd2.V [S
      // b2: aload 2
      // b3: getfield com/finalshell/core/Wa2_2.m Lcom/finalshell/core/Xd2;
      // b6: aload 2
      // b7: getfield com/finalshell/core/Wa2_2.Uf [S
      // ba: putfield com/finalshell/core/Xd2.V [S
      // bd: aload 2
      // be: aload 1
      // bf: ifnonnull e5
      // c2: getfield com/finalshell/core/Wa2_2.UV Lcom/finalshell/core/DF_2;
      // c5: ifnull e4
      // c8: goto cf
      // cb: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // ce: athrow
      // cf: aload 2
      // d0: aload 2
      // d1: getfield com/finalshell/core/Wa2_2.UV Lcom/finalshell/core/DF_2;
      // d4: invokevirtual com/finalshell/core/DF_2.clone ()Ljava/lang/Object;
      // d7: checkcast com/finalshell/core/DF_2
      // da: putfield com/finalshell/core/Wa2_2.UV Lcom/finalshell/core/DF_2;
      // dd: goto e4
      // e0: invokestatic com/finalshell/core/Wa2_2.a (Ljava/lang/CloneNotSupportedException;)Ljava/lang/CloneNotSupportedException;
      // e3: athrow
      // e4: aload 2
      // e5: areturn
   }

   public byte[] y(byte[] var1) {
      byte[] var2 = new byte[var1.length];
      System.arraycopy(var1, 0, var2, 0, var2.length);
      return var2;
   }

   public short[] N(short[] var1) {
      short[] var2 = new short[var1.length];
      System.arraycopy(var1, 0, var2, 0, var2.length);
      return var2;
   }

   public int[] I(int[] var1) {
      int[] var2 = new int[var1.length];
      System.arraycopy(var1, 0, var2, 0, var2.length);
      return var2;
   }

   public synchronized DF_2 x() {
      int[] var1 = Nm4.g();
      DF_2 var10000 = this.UV;
      if (var1 == null) {
         if (this.UV == null) {
            this.UV = new DF_2();
         }

         var10000 = this.UV;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static CloneNotSupportedException a(CloneNotSupportedException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3;
      var3 = var0 ^ (int)(var1 & 32767L) ^ 5597;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }

   public static long b(int var0, long var1) {
      int var3;
      var3 = (var0 ^ (int)var1 ^ 29847) & 32767;
      if (db[var3] == null) {
         db[var3] = cb[var3] ^ var1;
      }

      return db[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      boolean var13;
      int var3;
      char[] var47;
      long[] var6;
      String[] var16 = new String[8];
      int var20 = 0;
      String var19 = "G=oi\"sIQ3i\u000fM9~l\"rR@(rglwIZ\fA)}ngd\u001bF.igp\fP(imc{\u001bF.igp\u0013J2h}dpR@5~fv6VF1tz{\nE5wm\"sIQ3i";
      int var21 = "G=oi\"sIQ3i\u000fM9~l\"rR@(rglwIZ\fA)}ngd\u001bF.igp\fP(imc{\u001bF.igp\u0013J2h}dpR@5~fv6VF1tz{\nE5wm\"sIQ3i".length();
      char var18 = '\n';
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 82;
         String var10001 = var19.substring(++var26, var26 + var18);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var55 = var10001.toCharArray();
               int var10004 = var55.length;
               int var22 = 0;
               byte var58 = var10000;
               var47 = var55;
               int var35 = var10004;
               byte var67;
               char[] var75;
               int var10006;
               if (var10004 <= 1) {
                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               } else {
                  var58 = var10000;
                  var35 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var75 = var55;
                  var67 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var84 = var75[var10006];
                  byte var85;
                  switch (var22 % 7) {
                     case 0:
                        var85 = 113;
                        break;
                     case 1:
                        var85 = 14;
                        break;
                     case 2:
                        var85 = 73;
                        break;
                     case 3:
                        var85 = 90;
                        break;
                     case 4:
                        var85 = 80;
                        break;
                     case 5:
                        var85 = 68;
                        break;
                     default:
                        var85 = 105;
                  }

                  var75[var10006] = (char)(var84 ^ var67 ^ var85);
                  var22++;
                  if (var58 == 0) {
                     var10006 = var58;
                     var75 = var47;
                     var67 = var58;
                  } else {
                     if (var35 <= var22) {
                        break;
                     }

                     var75 = var47;
                     var67 = var58;
                     var10006 = var22;
                  }
               }
            }

            String var60 = new String(var47).intern();
            switch (var10002) {
               case 0:
                  var16[var20++] = var60;
                  if ((var26 += var18) >= var21) {
                     long var8 = 3991030405232282345L;
                     long[] var14 = new long[70];
                     var11 = 0;
                     String var12 = "\u0082«¿i\u001cr\fl\u0099\u0094OHò¨Ht°R#÷GL×3v©'>æñ]$4m9#©àÿ/n\tÄ\u0097\u0011¾´\u0015Çâ,§@°xÄ<\u0002o&\u0081\u0091\u0010 Ö§v¡¼I\r:õ\u0082-É=ûüvÉ!À¬+w4tÇ&\u00adB\u001d\u0017\u001f¯\u008b\f±\u00014\u001d©\u0081BÃwª\u0011º3Rú¿\u008f\u009a\u0093\r\u00ad\u0005¸k/Pz\u0081\u0014Ü²Ê9\u0097û\u0085ïkª\u0013\u0085\u007fN\rg\u0002©ô\u008d\u0099uÎsOUÐ\u00ad¢\u0006U\u007fÏñ\u0013T\u008c¶;\u0095\u0014x68ô,Æ:\u0083ÈBÄ¸\u0012\u0003ÑÚ\u0015¬ól\u0098*è¼Îìþ\u001bB\u008a\u0004#ÊëýT²ù¸Ò3>U\u001dî\u0014ó¿\u0090;\u008eµcX!Ù{,ZßBe:¼/!W\u001bî\u000f0\u001eI.va¡u\u008a~²iò\u001c³\r°\u0094YiHüFm\u009cd¬²uûXAß\u0014îÁt»\\(Ì-ùÑ\u0098>\u009bspk²aËøüôÞpàQ1Ã°FXÛ]\u000b:dË\u0018ý{A\u008bÉ`rå \bé,¸ôªÁ;¼¿xqÝ^\u0018¼\u0095C/ú6Æ\u0015\u0098zQ\u00ad\u0097ö\u00895®\u00041Ëñ(\u0089Y:Àú\u001dk\u001fu6ì±ï\u0016\u0010×\u0005\u0006\u0095\u001d,í\u000f\u0090°¿\u001f\u0018\u008aüÝÉ0\u0093\u0010\n\u001eqÖ\u008a¢b7¦\u0081g\u0098®Ë\u0006òn;5þHôÓ\u0087\u0018nÃêKÇX\u0092¥\u008b\u0085RwöÚJ¸°ÿonu[Ý¨\u008cð\u009c½zJ\u008eö&\u0004\u008c\u0098Ç\"R¾\\\u0094\u0081\u0098ÚEs\u0019\"\u0083\u0098¥\u008a\u001f\u008bî\u0005ú\u0005Ì¬µúTG(\u001e\u00132|\u0097\u0005\u009d\u0095\u007fù¢ç,â\u0010§b\u0001{n\u008bbè!l\u0088¤vÌàþâ)o×J,ªd=y°\u0084@2L7\u009cQ\u00adà\u0001Ý¡EéÝ½í}¬ÿ";
                     var13 = "\u0082«¿i\u001cr\fl\u0099\u0094OHò¨Ht°R#÷GL×3v©'>æñ]$4m9#©àÿ/n\tÄ\u0097\u0011¾´\u0015Çâ,§@°xÄ<\u0002o&\u0081\u0091\u0010 Ö§v¡¼I\r:õ\u0082-É=ûüvÉ!À¬+w4tÇ&\u00adB\u001d\u0017\u001f¯\u008b\f±\u00014\u001d©\u0081BÃwª\u0011º3Rú¿\u008f\u009a\u0093\r\u00ad\u0005¸k/Pz\u0081\u0014Ü²Ê9\u0097û\u0085ïkª\u0013\u0085\u007fN\rg\u0002©ô\u008d\u0099uÎsOUÐ\u00ad¢\u0006U\u007fÏñ\u0013T\u008c¶;\u0095\u0014x68ô,Æ:\u0083ÈBÄ¸\u0012\u0003ÑÚ\u0015¬ól\u0098*è¼Îìþ\u001bB\u008a\u0004#ÊëýT²ù¸Ò3>U\u001dî\u0014ó¿\u0090;\u008eµcX!Ù{,ZßBe:¼/!W\u001bî\u000f0\u001eI.va¡u\u008a~²iò\u001c³\r°\u0094YiHüFm\u009cd¬²uûXAß\u0014îÁt»\\(Ì-ùÑ\u0098>\u009bspk²aËøüôÞpàQ1Ã°FXÛ]\u000b:dË\u0018ý{A\u008bÉ`rå \bé,¸ôªÁ;¼¿xqÝ^\u0018¼\u0095C/ú6Æ\u0015\u0098zQ\u00ad\u0097ö\u00895®\u00041Ëñ(\u0089Y:Àú\u001dk\u001fu6ì±ï\u0016\u0010×\u0005\u0006\u0095\u001d,í\u000f\u0090°¿\u001f\u0018\u008aüÝÉ0\u0093\u0010\n\u001eqÖ\u008a¢b7¦\u0081g\u0098®Ë\u0006òn;5þHôÓ\u0087\u0018nÃêKÇX\u0092¥\u008b\u0085RwöÚJ¸°ÿonu[Ý¨\u008cð\u009c½zJ\u008eö&\u0004\u008c\u0098Ç\"R¾\\\u0094\u0081\u0098ÚEs\u0019\"\u0083\u0098¥\u008a\u001f\u008bî\u0005ú\u0005Ì¬µúTG(\u001e\u00132|\u0097\u0005\u009d\u0095\u007fù¢ç,â\u0010§b\u0001{n\u008bbè!l\u0088¤vÌàþâ)o×J,ªd=y°\u0084@2L7\u009cQ\u00adà\u0001Ý¡EéÝ½í}¬ÿ";
                        // [VF] .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var37 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var37, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var38 = var11++;
                        long var51 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var61 = -1;

                        while (true) {
                           long var72 = var51 ^ var8;
                           switch (var61) {
                              case 0:
                                 var28[var38] = var72;
                                 if (var10 >= var13) {
                                    ab = var14;
                                    bb = new Integer[70];
                                    long var0 = 1120406189603652126L;
                                    var6 = new long[4];
                                    var3 = 0;
                                    String var4 = "b´¦ç\u0095\n\u0016\u0083Er¢`Ó_uÆ";
                                    int var5 = "b´¦ç\u0095\n\u0016\u0083Er¢`Ó_uÆ".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var40 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var41 = var3++;
                                       long var53 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var63 = -1;

                                       while (true) {
                                          var72 = var53 ^ var0;
                                          switch (var63) {
                                             case 0:
                                                var29[var41] = var72;
                                                if (var2 >= var5) {
                                                   cb = var6;
                                                   db = new Long[4];
                                                   r = new DT3[a(26066, 9129754040370884643L)];
                                                   r[0] = new DT3(0, 0, 0, 0, 0);
                                                   r[1] = new DT3(4, 4, a(674, 4619306808194668361L), 4, 1);
                                                   r[2] = new DT3(4, 5, a(13238, 6098184612666091054L), a(674, 4619306808194668361L), 1);
                                                   r[3] = new DT3(
                                                      4, a(26617, 6531650983651373629L), a(9067, 3995945269766960831L), a(32470, 4607017807551359760L), 1
                                                   );
                                                   r[4] = new DT3(4, 4, a(11385, 6033874610907855286L), a(11385, 6033874610907855286L), 2);
                                                   r[5] = new DT3(
                                                      a(674, 4619306808194668361L),
                                                      a(11385, 6033874610907855286L),
                                                      a(32470, 4607017807551359760L),
                                                      a(32470, 4607017807551359760L),
                                                      2
                                                   );
                                                   r[a(26002, 7364195423021592659L)] = new DT3(
                                                      a(674, 4619306808194668361L),
                                                      a(11385, 6033874610907855286L),
                                                      a(17392, 8839140776413419021L),
                                                      a(23439, 60516941033197130L),
                                                      2
                                                   );
                                                   r[a(28956, 240043315357213930L)] = new DT3(
                                                      a(674, 4619306808194668361L),
                                                      a(32470, 4607017807551359760L),
                                                      a(23439, 60516941033197130L),
                                                      a(28011, 6017034201505560763L),
                                                      2
                                                   );
                                                   r[a(674, 4619306808194668361L)] = new DT3(
                                                      a(32470, 4607017807551359760L),
                                                      a(23439, 60516941033197130L),
                                                      a(4841, 9190719087147321099L),
                                                      a(1751, 2046487590678729544L),
                                                      2
                                                   );
                                                   r[a(10239, 8357003978534760996L)] = new DT3(
                                                      a(32470, 4607017807551359760L),
                                                      a(19623, 5362284299108211022L),
                                                      a(19623, 5362284299108211022L),
                                                      a(4627, 478319194565642189L),
                                                      2
                                                   );
                                                   String[] var30 = new String[a(25474, 5076007018410538614L)];
                                                   var30[0] = var16[1];
                                                   var30[1] = var16[6];
                                                   var30[2] = "";
                                                   var30[3] = var16[5];
                                                   var30[4] = var16[3];
                                                   var30[5] = var16[0];
                                                   var30[a(26002, 7364195423021592659L)] = var16[4];
                                                   var30[a(29657, 4152544568793720388L)] = var16[2];
                                                   var30[a(674, 4619306808194668361L)] = var16[7];
                                                   var30[a(32530, 6539745746093271784L)] = "";
                                                   O = var30;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var41] = var72;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "\t\n{×\u0084\\\u009e³mX0\u009c¯\rH\u0099";
                                                var5 = "\t\n{×\u0084\\\u009e³mX0\u009c¯\rH\u0099".length();
                                                var2 = 0;
                                          }

                                          byte var42 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var41 = var3++;
                                          var53 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var63 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var38] = var72;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "*ÃRÂ°]Ú÷o\u0006\u00840k\u0010l×";
                                 var13 = ("*ÃRÂ°]Ú÷o\u0006\u00840k\u0010l×".length()) != 0;
                                 var10 = 0;
                           }

                           byte var39 = var10;
                           var10 += 8;
                           var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var38 = var11++;
                           var51 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var61 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var26);
                  break;
               default:
                  var16[var20++] = var60;
                  if ((var26 += var18) < var21) {
                     var18 = var19.charAt(var26);
                     continue label88;
                  }

                  var19 = "3K\n\u000e\u0000\u0018x%Q\u001c\u0014)Q\u001b\u0004\f\u000594V\u001a\u0007\u0004U.%M\u000b\u0002\u000e\u001b";
                  var21 = "3K\n\u000e\u0000\u0018x%Q\u001c\u0014)Q\u001b\u0004\f\u000594V\u001a\u0007\u0004U.%M\u000b\u0002\u000e\u001b".length();
                  var18 = '\n';
                  var26 = -1;
            }

            var10000 = 49;
            var10001 = var19.substring(++var26, var26 + var18);
            var10002 = 0;
         }
      }
   }
}





