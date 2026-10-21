package com.finalshell.core;

import com.finalshell.ui.model.WF3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Im4 {
   public static Logger B;
   @NotNull
   public final Ov4 t;
   public Ua2 M;
   public Ua2 F;
   public int D;
   public int R;
   public final int I;
   public final Lock v = new ReentrantLock();
   public Ua2 e;
   public Ua2 f;
   public boolean V = false;
   public boolean z = false;
   public final List o = new CopyOnWriteArrayList();
   public final List p = new CopyOnWriteArrayList();
   @Nullable
   public final In4 J;
   boolean X = false;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Im4(int var1, int var2, @NotNull Ov4 var3) {
      this(var1, var2, var3, null);
   }

   public Im4(int var1, int var2, @NotNull Ov4 var3, @Nullable In4 var4) {
      this(var1, var2, var3, a(27699, 1595548852316604916L), var4);
   }

   public Im4(int var1, int var2, @NotNull Ov4 var3, int var4, @Nullable In4 var5) {
      this.t = var3;
      this.D = var1;
      this.R = var2;
      this.I = var4;
      this.J = var5;
      this.F = this.L();
      this.M = this.R();
   }

   @NotNull
   public Ua2 L() {
      return new Ua2(-1, this.J);
   }

   @NotNull
   public Ua2 R() {
      return new Ua2(this.I, this.J);
   }

   public void h(@NotNull OT var1, @NotNull WF3 var2, int var3, int var4, @NotNull NO3 var5, @Nullable RU3 var6) {
      this.w();

      try {
         this.Q(var1, var3, var4, var5, var6);
      } finally {
         this.h$void();
      }
   }

   public void Q(@NotNull OT var1, int var2, int var3, @NotNull NO3 var4, @Nullable RU3 var5) {
      boolean var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var18;
      var7 = var1.R();
      var8 = var1.c();
      int var10000 = (com.finalshell.ui.model.J2.P()) ? 1 : 0;
      var9 = var2;
      var6 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10 = var3;
      var18 = this.D;
      label90:
      if (!var6) {
         if (this.D != var7) {
            EG var11 = new EG(this, var7, var8);
            XE var12 = new XE(var2, var3 - 1);
            var11.U(var12, true);
            if (!var6) {
               if (var5 != null) {
                  var11.W(var5.N());
                  var11.W(var5.e());
               }

               var11.i();
               this.D = var7;
               this.R = var8;
            }

            XE var13 = var11.d(var12);
            var9 = var13.q;
            var18 = var13.r + 1;
            if (var6) {
               break label90;
            }

            var10 = var18;
            if (var5 != null) {
               var5.N().A(var11.d(var5.N()));
               var5.e().A(var11.d(var5.e()));
            }
         }

         var18 = this.R;
      }

      label94: {
         int var14;
         label95: {
            var14 = var18;
            var10000 = var8;
            int var10001 = var14;
            if (!var6) {
               if (var8 < var14) {
                  int var15;
                  label76: {
                     var15 = var14 - var8;
                     var10000 = (this.V) ? 1 : 0;
                     if (!var6) {
                        if (!this.V) {
                           int var17 = this.F.Q(var14 - 1, var15);
                           this.F.Q(var15 - var17, this.M);
                           var10 = var3 - (var15 - var17);
                           if (!var6) {
                              break label76;
                           }
                        }

                        var10000 = var3;
                     }

                     var10 = var10000;
                  }

                  label69: {
                     RU3 var21 = var5;
                     if (!var6) {
                        if (var5 == null) {
                           break label69;
                        }

                        var21 = var5;
                     }

                     var21.t(-var15);
                  }

                  if (!var6) {
                     break label94;
                  }
               }

               var10000 = var8;
               if (var6) {
                  break label95;
               }

               var10001 = var14;
            }

            if (var10000 <= var10001) {
               break label94;
            }

            var10000 = (this.V) ? 1 : 0;
         }

         label54: {
            if (!var6) {
               if (var10000 == 0) {
                  int var16 = Math.min(var8 - var14, this.M.b());
                  this.M.U(var16, this.F);
                  var10 = var3 + var16;
                  if (!var6) {
                     break label54;
                  }
               }

               var10000 = var3;
            }

            var10 = var10000;
         }

         RU3 var22 = var5;
         if (!var6) {
            if (var5 == null) {
               break label94;
            }

            var22 = var5;
         }

         var22.t(var8 - var3);
      }

      this.D = var7;
      this.R = var8;
      var4.L(this.D, this.R, var9, var10);
      this.P();
   }

   public void P(IL3 var1) {
      this.o.add(var1);
   }

   public void Y(IL3 var1) {
      this.p.add(var1);
   }

   public void q(IL3 var1) {
      this.o.remove(var1);
   }

   public void w(IL3 var1) {
      this.p.remove(var1);
   }

   public boolean u() {
      return this.X;
   }

   public void d(boolean var1) {
      this.X = var1;
   }

   void P() {
      this.X = true;
      boolean var10000 = com.finalshell.ui.model.J2.P();
      Iterator var2 = this.o.iterator();
      boolean var1 = var10000;

      while (var2.hasNext()) {
         IL3 var3 = (IL3)var2.next();
         var3.s();
         if (var1) {
            break;
         }
      }
   }

   void z() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      Iterator var2 = this.p.iterator();
      boolean var1 = var10000;

      while (var2.hasNext()) {
         IL3 var3 = (IL3)var2.next();
         var3.s();
         if (!var1) {
            break;
         }
      }
   }

   public YP W$YP() {
      return this.t.U().j();
   }

   public Lu4 h$lu_4() {
      return new Lu4(this.W$YP(), new com.finalshell.ui.model.J2('\u0000', this.D));
   }

   public void O(int var1, int var2, int var3) {
      boolean var4;
      int var10000;
      label36: {
         label35: {
            var4 = com.finalshell.ui.model.J2.g();
            if (var4) {
               if (var2 <= this.R - 1) {
                  var10000 = var2;
                  if (!var4) {
                     break label36;
                  }

                  if (var2 >= 0) {
                     break label35;
                  }
               }

               B.error(a(-24930, -24854) + var2 + a(-24934, -2976) + var1 + a(-24938, 29287) + var3);
            }

            if (var4) {
               return;
            }
         }

         var10000 = var3;
      }

      if (var4) {
         if (var10000 < 0) {
            B.error(a(-24939, 10972) + var3);
            if (var4) {
               return;
            }
         }

         var10000 = var3;
      }

      if (var10000 > 0) {
         this.F.Z(var1, var2, var3, this.W$YP());
         this.P();
      }
   }

   public void X(int var1, int var2, int var3) {
      boolean var4;
      int var10000;
      label36: {
         label35: {
            var4 = com.finalshell.ui.model.J2.g();
            if (var4) {
               if (var2 <= this.R - 1) {
                  var10000 = var2;
                  if (!var4) {
                     break label36;
                  }

                  if (var2 >= 0) {
                     break label35;
                  }
               }

               B.error(a(-24935, 10312) + var2 + a(-24942, -21400) + var1 + a(-24937, 1662) + var3);
            }

            if (var4) {
               return;
            }
         }

         var10000 = var3;
      }

      if (var4) {
         if (var10000 < 0) {
            B.error(a(-24941, -6928) + var3);
            if (var4) {
               return;
            }
         }

         var10000 = var3;
      }

      if (var10000 > 0) {
         this.F.w(var1, var2, var3, this.D, this.W$YP());
         this.P();
      }
   }

   public void h(int var1, int var2, @NotNull com.finalshell.ui.model.J2 var3) {
      this.p(var1, var2, var3, this.t.U());
   }

   public void j(@NotNull DC3 var1) {
      this.F.O(List.of(var1));
      this.P();
   }

   public void p(int var1, int var2, @NotNull com.finalshell.ui.model.J2 var3, @NotNull YP var4) {
      this.F.S(var1, var2 - 1, var3, var4);
      this.P();
   }

   public void C(int var1, int var2, int var3) {
      boolean var4 = com.finalshell.ui.model.J2.g();
      int var10000 = var2;
      if (var4) {
         if (var2 == 0) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 > 0) {
         this.S(var1 - 1, var2, var3);
         if (var4) {
            return;
         }
      }

      Ua2 var5 = this.o(var1 - 1, -var2, var3);
      if (var1 == 1) {
         var5.Q(var5.b(), this.M);
      }

      this.P();
   }

   public String M() {
      HashMap var1 = new HashMap();
      this.v.lock();

      String var3;
      try {
         StringBuilder var2 = new StringBuilder();
         this.F.A(0, this.R, new Pl4(this, var2, var1));
         var3 = var2.toString();
      } finally {
         this.v.unlock();
      }

      return var3;
   }

   public DC3 D(int var1) {
      boolean var2 = com.finalshell.ui.model.J2.g();
      int var10000 = var1;
      if (var2) {
         if (var1 >= 0) {
            if (var1 >= this.O()) {
               B.error(a(-24943, -9739) + var1 + a(-24933, -21269) + this.O());
               return DC3.v();
            }

            return this.F.t(var1);
         }

         var10000 = var1;
      }

      if (var10000 < -this.H()) {
         B.error(a(-24936, -14973) + var1 + a(-24944, 30249) + -this.H());
         return DC3.v();
      } else {
         return this.M.t(this.H() + var1);
      }
   }

   public String c$String() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      this.v.lock();
      boolean var1 = var10000;

      String var9;
      try {
         StringBuilder var2 = new StringBuilder();
         int var3 = 0;

         while (true) {
            if (var3 < this.R) {
      boolean var10;
               StringBuilder var4 = new StringBuilder(this.F.t(var3).V$String());
               var10 = var4;
               if (!var1) {
                  break;
               }

               int var5 = var4.length();

               label90: {
                  while (var5 < this.D) {
                     var4.append((char)a(26422, 2769665079420388080L));
                     var5++;
                     if (!var1) {
                        break label90;
                     }

                     if (!var1) {
                        break;
                     }
                  }

                  if (var1) {
                     if (var4.length() > this.D) {
                        var4.setLength(this.D);
                     }

                     var2.append((CharSequence)var4);
                     var2.append((char)a(25581, 2370700456817460777L));
                  }

                  var3++;
               }

               if (var1) {
      Iterator var10;
                  continue;
               }
            }

            var10 = var2;
            break;
         }

         var9 = var10.toString();
      } finally {
         this.v.unlock();
      }

      return var9;
   }

   public void x(int var1, int var2, @NotNull Lf2 var3) {
      this.F.A(var1, var2, var3);
   }

   public void w() {
      this.v.lock();
   }

   public void h$void() {
      this.v.unlock();
   }

   public boolean d() {
      return this.v.tryLock();
   }

   public int B$int() {
      return this.D;
   }

   public int O() {
      return this.R;
   }

   public int H() {
      return this.M.b();
   }

   public int k() {
      return this.F.b();
   }

   public char g(int var1, int var2) {
      return this.D(var2).N(var1);
   }

   public YP l(int var1, int var2) {
      return this.D(var2).x(var1);
   }

   public KB X(int var1, int var2) {
      synchronized (this.F) {
         DC3 var4 = this.D(var2);
         return new KB(var4.N(var1), var4.x(var1));
      }
   }

   public char E(int var1, int var2) {
      synchronized (this.F) {
         DC3 var4 = this.D(var2);
         return var4.N(var1);
      }
   }

   public boolean T$boolean() {
      return this.z;
   }

   public void P(boolean var1) {
      Im4 var4;
      label29: {
         label28: {
            boolean var10000 = com.finalshell.ui.model.J2.P();
            this.V = var1;
            boolean var2 = var10000;
            boolean var3 = var1;
            if (!var2) {
               if (var1) {
                  var4 = this;
                  if (var2) {
                     break label29;
                  }

                  if (this.z) {
                     break label28;
                  }

                  this.f = this.F;
                  this.e = this.M;
                  this.F = this.L();
                  this.M = this.R();
                  this.z = true;
                  if (!var2) {
                     break label28;
                  }
               }

               var4 = this;
               if (var2) {
                  break label29;
               }

               var3 = this.z;
            }

            if (var3) {
               this.F = this.f;
               this.M = this.e;
               this.f = this.L();
               this.e = this.R();
               this.z = false;
            }
         }

         var4 = this;
      }

      var4.P();
   }

   public Ua2 x() {
      return this.M;
   }

   @NotNull
   public Ua2 l() {
      return this.F;
   }

   public void S(int var1, int var2, int var3) {
      this.F.D(var1, var2, var3 - 1, this.h$lu_4());
      this.P();
   }

   public Ua2 o(int var1, int var2, int var3) {
      Ua2 var4 = this.F.K(var1, var2, var3 - 1, this.h$lu_4());
      this.P();
      return var4;
   }

   public void U(int var1, int var2) {
      this.F.b(var1, var2, this.h$lu_4());
      this.P();
   }

   public void y(int var1, int var2, int var3) {
      label25: {
         boolean var10000 = com.finalshell.ui.model.J2.P();
         YP var5 = this.W$YP();
         boolean var4 = var10000;
         if (!var4) {
            if (var3 < 0) {
               break label25;
            }

            this.F.k(var1, var3, var2, var3 + 1, var5);
            this.P();
         }

         if (this.J == null || var3 >= this.O()) {
            return;
         }

         this.J.U(this.F, this.D(var3));
         if (!var4) {
            return;
         }
      }

      B.error(a(-24940, 2314) + var3);
   }

   public void W$void() {
      this.F.D();
      this.P();
   }

   public void q(int var1, int var2, Lf2 var3) {
      boolean var4 = com.finalshell.ui.model.J2.P();
      int var10000 = var2;
      if (!var4) {
         if (var2 < 0) {
            var2 = this.M.b() + this.F.b();
         }

         var10000 = Math.min(-var1, var2);
      }

      int var10001;
      int var10002;
      Lf2 var10003;
      int var10004;
      label34: {
         int var5 = var10000;
         int var6 = this.M.b() + var1;
         var10000 = var6;
         if (!var4) {
            if (var6 < 0) {
               var6 = 0;
            }

            var8 = this.M;
            var10001 = var6;
            var10002 = var5;
            var10003 = var3;
            var10004 = var6;
            if (var4) {
               break label34;
            }

            this.M.t(var6, var5, var3, var6);
            var10000 = var5;
         }

         if (var10000 >= var2) {
            return;
         }

         var8 = this.F;
         var10001 = 0;
         var10002 = var2 - var5;
         var10003 = var3;
         var10004 = -var5;
      }

      var8.t(var10001, var10002, var10003, var10004);
   }

   public void c$void() {
      this.M.D();
      this.P();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void B$void() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      this.v.lock();
      boolean var1 = var10000;
      boolean var4 = false /* VF: Semaphore variable */;

      label35: {
         try {
            var4 = true;
            this.F.Q(this.F.b() - 1, this.F.b());
            this.F.Q(this.F.b(), this.M);
            var10 = this;
            if (!var1) {
               var4 = false;
               break label35;
            }

            if (this.M.b() > 0) {
               this.M.t(this.M.b() - 1).M(false);
               var4 = false;
            } else {
               var4 = false;
            }
         } finally {
            if (var4) {
               this.v.unlock();
            }
         }

         var10 = this;
      }

      var10.v.unlock();
   }

   @NotNull
   Ua2 T$ua_2() {
      boolean var1 = com.finalshell.ui.model.J2.P();
      Im4 var10000 = this;
      if (!var1) {
         if (this.z) {
            return this.e;
         }

         var10000 = this;
      }

      return var10000.M;
   }

   @NotNull
   Ua2 N() {
      boolean var1 = com.finalshell.ui.model.J2.g();
      Im4 var10000 = this;
      if (var1) {
         if (this.z) {
            return this.f;
         }

         var10000 = this;
      }

      return var10000.F;
   }

   public int R(@NotNull DC3 var1) {
      return this.F.h(var1);
   }

   public void D() {
      this.F.e();
      this.M.e();
      this.P();
   }

   @Nullable
   In4 p() {
      return this.J;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -24942) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 67;
               break;
            case 1:
               var10000 = 117;
               break;
            case 2:
               var10000 = 49;
               break;
            case 3:
               var10000 = 28;
               break;
            case 4:
               var10000 = 93;
               break;
            case 5:
               var10000 = 174;
               break;
            case 6:
               var10000 = 255;
               break;
            case 7:
               var10000 = 46;
               break;
            case 8:
               var10000 = 195;
               break;
            case 9:
               var10000 = 223;
               break;
            case 10:
               var10000 = 145;
               break;
            case 11:
               var10000 = 61;
               break;
            case 12:
               var10000 = 196;
               break;
            case 13:
               var10000 = 38;
               break;
            case 14:
               var10000 = 85;
               break;
            case 15:
               var10000 = 102;
               break;
            case 16:
               var10000 = 22;
               break;
            case 17:
               var10000 = 73;
               break;
            case 18:
               var10000 = 128;
               break;
            case 19:
               var10000 = 41;
               break;
            case 20:
               var10000 = 202;
               break;
            case 21:
               var10000 = 192;
               break;
            case 22:
               var10000 = 74;
               break;
            case 23:
               var10000 = 160;
               break;
            case 24:
               var10000 = 132;
               break;
            case 25:
               var10000 = 244;
               break;
            case 26:
               var10000 = 47;
               break;
            case 27:
               var10000 = 98;
               break;
            case 28:
               var10000 = 11;
               break;
            case 29:
               var10000 = 238;
               break;
            case 30:
               var10000 = 147;
               break;
            case 31:
               var10000 = 53;
               break;
            case 32:
               var10000 = 218;
               break;
            case 33:
               var10000 = 45;
               break;
            case 34:
               var10000 = 13;
               break;
            case 35:
               var10000 = 179;
               break;
            case 36:
               var10000 = 106;
               break;
            case 37:
               var10000 = 171;
               break;
            case 38:
               var10000 = 71;
               break;
            case 39:
               var10000 = 24;
               break;
            case 40:
               var10000 = 219;
               break;
            case 41:
               var10000 = 15;
               break;
            case 42:
               var10000 = 159;
               break;
            case 43:
               var10000 = 214;
               break;
            case 44:
               var10000 = 126;
               break;
            case 45:
               var10000 = 121;
               break;
            case 46:
               var10000 = 185;
               break;
            case 47:
               var10000 = 157;
               break;
            case 48:
               var10000 = 30;
               break;
            case 49:
               var10000 = 109;
               break;
            case 50:
               var10000 = 164;
               break;
            case 51:
               var10000 = 153;
               break;
            case 52:
               var10000 = 16;
               break;
            case 53:
               var10000 = 215;
               break;
            case 54:
               var10000 = 235;
               break;
            case 55:
               var10000 = 213;
               break;
            case 56:
               var10000 = 138;
               break;
            case 57:
               var10000 = 82;
               break;
            case 58:
               var10000 = 79;
               break;
            case 59:
               var10000 = 119;
               break;
            case 60:
               var10000 = 246;
               break;
            case 61:
               var10000 = 188;
               break;
            case 62:
               var10000 = 143;
               break;
            case 63:
               var10000 = 254;
               break;
            case 64:
               var10000 = 118;
               break;
            case 65:
               var10000 = 122;
               break;
            case 66:
               var10000 = 222;
               break;
            case 67:
               var10000 = 200;
               break;
            case 68:
               var10000 = 176;
               break;
            case 69:
               var10000 = 237;
               break;
            case 70:
               var10000 = 77;
               break;
            case 71:
               var10000 = 194;
               break;
            case 72:
               var10000 = 1;
               break;
            case 73:
               var10000 = 52;
               break;
            case 74:
               var10000 = 248;
               break;
            case 75:
               var10000 = 178;
               break;
            case 76:
               var10000 = 216;
               break;
            case 77:
               var10000 = 78;
               break;
            case 78:
               var10000 = 94;
               break;
            case 79:
               var10000 = 231;
               break;
            case 80:
               var10000 = 241;
               break;
            case 81:
               var10000 = 221;
               break;
            case 82:
               var10000 = 242;
               break;
            case 83:
               var10000 = 20;
               break;
            case 84:
               var10000 = 230;
               break;
            case 85:
               var10000 = 50;
               break;
            case 86:
               var10000 = 92;
               break;
            case 87:
               var10000 = 191;
               break;
            case 88:
               var10000 = 149;
               break;
            case 89:
               var10000 = 91;
               break;
            case 90:
               var10000 = 141;
               break;
            case 91:
               var10000 = 207;
               break;
            case 92:
               var10000 = 175;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 64;
               break;
            case 95:
               var10000 = 158;
               break;
            case 96:
               var10000 = 62;
               break;
            case 97:
               var10000 = 96;
               break;
            case 98:
               var10000 = 139;
               break;
            case 99:
               var10000 = 35;
               break;
            case 100:
               var10000 = 104;
               break;
            case 101:
               var10000 = 2;
               break;
            case 102:
               var10000 = 203;
               break;
            case 103:
               var10000 = 60;
               break;
            case 104:
               var10000 = 70;
               break;
            case 105:
               var10000 = 236;
               break;
            case 106:
               var10000 = 116;
               break;
            case 107:
               var10000 = 33;
               break;
            case 108:
               var10000 = 133;
               break;
            case 109:
               var10000 = 135;
               break;
            case 110:
               var10000 = 26;
               break;
            case 111:
               var10000 = 3;
               break;
            case 112:
               var10000 = 187;
               break;
            case 113:
               var10000 = 7;
               break;
            case 114:
               var10000 = 127;
               break;
            case 115:
               var10000 = 152;
               break;
            case 116:
               var10000 = 34;
               break;
            case 117:
               var10000 = 14;
               break;
            case 118:
               var10000 = 58;
               break;
            case 119:
               var10000 = 226;
               break;
            case 120:
               var10000 = 83;
               break;
            case 121:
               var10000 = 137;
               break;
            case 122:
               var10000 = 88;
               break;
            case 123:
               var10000 = 4;
               break;
            case 124:
               var10000 = 59;
               break;
            case 125:
               var10000 = 63;
               break;
            case 126:
               var10000 = 233;
               break;
            case 127:
               var10000 = 193;
               break;
            case 128:
               var10000 = 27;
               break;
            case 129:
               var10000 = 32;
               break;
            case 130:
               var10000 = 227;
               break;
            case 131:
               var10000 = 9;
               break;
            case 132:
               var10000 = 229;
               break;
            case 133:
               var10000 = 89;
               break;
            case 134:
               var10000 = 129;
               break;
            case 135:
               var10000 = 205;
               break;
            case 136:
               var10000 = 123;
               break;
            case 137:
               var10000 = 201;
               break;
            case 138:
               var10000 = 57;
               break;
            case 139:
               var10000 = 211;
               break;
            case 140:
               var10000 = 23;
               break;
            case 141:
               var10000 = 198;
               break;
            case 142:
               var10000 = 90;
               break;
            case 143:
               var10000 = 84;
               break;
            case 144:
               var10000 = 72;
               break;
            case 145:
               var10000 = 19;
               break;
            case 146:
               var10000 = 177;
               break;
            case 147:
               var10000 = 167;
               break;
            case 148:
               var10000 = 8;
               break;
            case 149:
               var10000 = 44;
               break;
            case 150:
               var10000 = 156;
               break;
            case 151:
               var10000 = 69;
               break;
            case 152:
               var10000 = 6;
               break;
            case 153:
               var10000 = 100;
               break;
            case 154:
               var10000 = 54;
               break;
            case 155:
               var10000 = 68;
               break;
            case 156:
               var10000 = 190;
               break;
            case 157:
               var10000 = 0;
               break;
            case 158:
               var10000 = 161;
               break;
            case 159:
               var10000 = 228;
               break;
            case 160:
               var10000 = 113;
               break;
            case 161:
               var10000 = 181;
               break;
            case 162:
               var10000 = 31;
               break;
            case 163:
               var10000 = 131;
               break;
            case 164:
               var10000 = 224;
               break;
            case 165:
               var10000 = 182;
               break;
            case 166:
               var10000 = 150;
               break;
            case 167:
               var10000 = 134;
               break;
            case 168:
               var10000 = 243;
               break;
            case 169:
               var10000 = 173;
               break;
            case 170:
               var10000 = 18;
               break;
            case 171:
               var10000 = 51;
               break;
            case 172:
               var10000 = 97;
               break;
            case 173:
               var10000 = 95;
               break;
            case 174:
               var10000 = 99;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 204;
               break;
            case 177:
               var10000 = 247;
               break;
            case 178:
               var10000 = 86;
               break;
            case 179:
               var10000 = 225;
               break;
            case 180:
               var10000 = 183;
               break;
            case 181:
               var10000 = 124;
               break;
            case 182:
               var10000 = 10;
               break;
            case 183:
               var10000 = 199;
               break;
            case 184:
               var10000 = 168;
               break;
            case 185:
               var10000 = 130;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 110;
               break;
            case 188:
               var10000 = 163;
               break;
            case 189:
               var10000 = 112;
               break;
            case 190:
               var10000 = 66;
               break;
            case 191:
               var10000 = 65;
               break;
            case 192:
               var10000 = 111;
               break;
            case 193:
               var10000 = 155;
               break;
            case 194:
               var10000 = 17;
               break;
            case 195:
               var10000 = 39;
               break;
            case 196:
               var10000 = 29;
               break;
            case 197:
               var10000 = 165;
               break;
            case 198:
               var10000 = 206;
               break;
            case 199:
               var10000 = 186;
               break;
            case 200:
               var10000 = 42;
               break;
            case 201:
               var10000 = 251;
               break;
            case 202:
               var10000 = 101;
               break;
            case 203:
               var10000 = 144;
               break;
            case 204:
               var10000 = 180;
               break;
            case 205:
               var10000 = 43;
               break;
            case 206:
               var10000 = 120;
               break;
            case 207:
               var10000 = 240;
               break;
            case 208:
               var10000 = 12;
               break;
            case 209:
               var10000 = 208;
               break;
            case 210:
               var10000 = 249;
               break;
            case 211:
               var10000 = 114;
               break;
            case 212:
               var10000 = 136;
               break;
            case 213:
               var10000 = 162;
               break;
            case 214:
               var10000 = 166;
               break;
            case 215:
               var10000 = 252;
               break;
            case 216:
               var10000 = 170;
               break;
            case 217:
               var10000 = 146;
               break;
            case 218:
               var10000 = 239;
               break;
            case 219:
               var10000 = 217;
               break;
            case 220:
               var10000 = 36;
               break;
            case 221:
               var10000 = 189;
               break;
            case 222:
               var10000 = 40;
               break;
            case 223:
               var10000 = 21;
               break;
            case 224:
               var10000 = 37;
               break;
            case 225:
               var10000 = 75;
               break;
            case 226:
               var10000 = 107;
               break;
            case 227:
               var10000 = 25;
               break;
            case 228:
               var10000 = 56;
               break;
            case 229:
               var10000 = 76;
               break;
            case 230:
               var10000 = 103;
               break;
            case 231:
               var10000 = 234;
               break;
            case 232:
               var10000 = 55;
               break;
            case 233:
               var10000 = 108;
               break;
            case 234:
               var10000 = 5;
               break;
            case 235:
               var10000 = 184;
               break;
            case 236:
               var10000 = 81;
               break;
            case 237:
               var10000 = 253;
               break;
            case 238:
               var10000 = 154;
               break;
            case 239:
               var10000 = 197;
               break;
            case 240:
               var10000 = 151;
               break;
            case 241:
               var10000 = 220;
               break;
            case 242:
               var10000 = 125;
               break;
            case 243:
               var10000 = 212;
               break;
            case 244:
               var10000 = 210;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 232;
               break;
            case 247:
               var10000 = 245;
               break;
            case 248:
               var10000 = 105;
               break;
            case 249:
               var10000 = 87;
               break;
            case 250:
               var10000 = 209;
               break;
            case 251:
               var10000 = 250;
               break;
            case 252:
               var10000 = 80;
               break;
            case 253:
               var10000 = 142;
               break;
            case 254:
               var10000 = 115;
               break;
            default:
               var10000 = 148;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26054;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "\u0011ÏÁ\u001dä«Â\u0086ö¦\fö<5\u009bë´,\u0092\u009fÒ\u001f\u0091r&6-ÅÑ\u0092]\u0080¬òeD\u0016v\u0080|+\u0010\u009f\b¦éÄûà£N\u0090\u001bò\u0091¤9t¡³»Ë\b±¨CB\u00039\u008fù#1\u0081áa86\u0087*;Ôsì\u008cVÊ\u0019ÎbklÿnLìÒL[u\u0092°dgÏ\u009dð\u0007\u008e¿@CwdC\u0007õW/^\u009aÇþ%T\u0019Mr\u00adT5fm]¹ßÂg¥\u0081STµG\u0095v¨-±¾/ÿ#ðÚ\u001f\u0085Ï¥Ò\u0018/ÖD\u001dÙ§!tÈE\u0088¼du<°W`þ8=÷½DIÊ\u009bbí²\u0096\u009b\"ü\u0094úî£¢æ4c¬\u0095ª\u00844\u009a\rßY\u0018Ïßñ¥Í\u001aÏ\u0091Û\u008f\u0004¬\u008aVF#·¹1f\"ÖÄ6SW~\u009c-XþØHZ»kå\u008e\u000fðºÏV\u00053¾P¦I¥ ";
      int var12 = "\u0011ÏÁ\u001dä«Â\u0086ö¦\fö<5\u009bë´,\u0092\u009fÒ\u001f\u0091r&6-ÅÑ\u0092]\u0080¬òeD\u0016v\u0080|+\u0010\u009f\b¦éÄûà£N\u0090\u001bò\u0091¤9t¡³»Ë\b±¨CB\u00039\u008fù#1\u0081áa86\u0087*;Ôsì\u008cVÊ\u0019ÎbklÿnLìÒL[u\u0092°dgÏ\u009dð\u0007\u008e¿@CwdC\u0007õW/^\u009aÇþ%T\u0019Mr\u00adT5fm]¹ßÂg¥\u0081STµG\u0095v¨-±¾/ÿ#ðÚ\u001f\u0085Ï¥Ò\u0018/ÖD\u001dÙ§!tÈE\u0088¼du<°W`þ8=÷½DIÊ\u009bbí²\u0096\u009b\"ü\u0094úî£¢æ4c¬\u0095ª\u00844\u009a\rßY\u0018Ïßñ¥Í\u001aÏ\u0091Û\u008f\u0004¬\u008aVF#·¹1f\"ÖÄ6SW~\u009c-XþØHZ»kå\u008e\u000fðºÏV\u00053¾P¦I¥ "
         .length();
      char var9 = '\r';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 60;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 66;
                        break;
                     case 1:
                        var58 = 59;
                        break;
                     case 2:
                        var58 = 41;
                        break;
                     case 3:
                        var58 = 18;
                        break;
                     case 4:
                        var58 = 13;
                        break;
                     case 5:
                        var58 = 90;
                        break;
                     default:
                        var58 = 46;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[13];
                     long var0 = 4819120483196325120L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "ÔßÃD×\u0011ÏÐTÛ!k¶¤×|\u001aâÁ ·ÏË#";
                     int var5 = "ÔßÃD×\u0011ÏÐTÛ!k¶¤×|\u001aâÁ ·ÏË#".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[3];
                     B = LoggerFactory.getLogger(Im4.class);
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "ËÇUfa\u0019c\u0000h^Ö|üC$\u008d,¬A±\u009cÄ?\u000e\u0083ÑrÖ\rLÀÂ û²\u008dý'\u001a3«Jë\u0082¨\u001f6ç\u0098'©ÉJèV¤\u0011h\u0004\u00922\u0095Ü\u0092D";
                  var12 = "ËÇUfa\u0019c\u0000h^Ö|üC$\u008d,¬A±\u009cÄ?\u000e\u0083ÑrÖ\rLÀÂ û²\u008dý'\u001a3«Jë\u0082¨\u001f6ç\u0098'©ÉJèV¤\u0011h\u0004\u00922\u0095Ü\u0092D"
                     .length();
                  var9 = '&';
                  var16 = -1;
            }

            var10000 = 50;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}






