package com.finalshell.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DC3 {
   public static Logger d;
   public com.finalshell.ui.model.Bf2 Q = new com.finalshell.ui.model.Bf2(null);
   public boolean p = false;
   public final List R = new ArrayList();
   DC3 N;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public DC3() {
   }

   public DC3(@NotNull Lu4 var1) {
      this.Q.n(var1);
   }

   public static DC3 v() {
      return new DC3();
   }

   @NotNull
   public String V$String() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      StringBuilder var2 = new StringBuilder(com.finalshell.ui.model.Bf2.h(this.Q));
      Iterator var3 = this.Q.iterator();
      boolean var1 = var10000;

      while (var3.hasNext()) {
         Lu4 var4 = (Lu4)var3.next();
         if (var1) {
            if (var4.v().Y() && var1) {
               break;
            }

            var2.append((CharSequence)var4.v());
         }

         if (!var1) {
            break;
         }
      }

      return var2.toString();
   }

   @NotNull
   public DC3 X() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      DC3 var2 = new DC3();
      boolean var1 = var10000;
      Iterator var3 = this.Q.iterator();

      while (true) {
         if (var3.hasNext()) {
            Lu4 var4 = (Lu4)var3.next();
            var2.Q.n(var4);
            if (!var1) {
               break;
            }

            if (var1) {
               continue;
            }
         }

         var2.p = this.p;
         break;
      }

      return var2;
   }

   public char N(int var1) {
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      DC3 var3 = this.N;
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      DC3 var5 = var3;
      if (var2) {
         if (var3 != null) {
            return var3.N(var1);
         }

         var5 = this;
      }

      String var4 = var5.V$String();
      var10000 = var1;
      if (var2) {
         var10000 = var1 < var4.length() ? var4.charAt(var1) : a(21195, 6518221519311044562L);
      }

      return (char)var10000;
   }

   public boolean G() {
      return this.p;
   }

   public void M(boolean var1) {
      this.p = var1;
   }

   public synchronized void c(@NotNull Lu4 var1) {
      this.Q.e();
      this.Q.n(var1);
      this.M(false);
   }

   public void W(int var1, @NotNull com.finalshell.ui.model.J2 var2, @NotNull YP var3) {
      this.j(var1, var3, var2);
   }

   public void V(int var1, @NotNull com.finalshell.ui.model.J2 var2, @NotNull YP var3) {
      this.R(var1, var3, var2);
   }

   public synchronized void j(int var1, @NotNull YP var2, @NotNull com.finalshell.ui.model.J2 var3) {
      int var10000 = (com.finalshell.ui.model.J2.P()) ? 1 : 0;
      int var5 = this.Q.o();
      boolean var4 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10000 = var1;
      int var10001 = var5;
      if (!var4) {
         if (var1 >= var5) {
            if (var1 - var5 > 0) {
               this.Q.n(new Lu4(YP.r, new com.finalshell.ui.model.J2('\u0000', var1 - var5)));
            }

            this.Q.n(new Lu4(var2, var3));
            if (!var4) {
               return;
            }
         }

         var10000 = var5;
         var10001 = var1 + var3.length();
      }

      var5 = Math.max(var10000, var10001);
      this.Q = U(var1, var3, var2, this.Q, var5);
   }

   public synchronized void R(int var1, @NotNull YP var2, @NotNull com.finalshell.ui.model.J2 var3) {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      int var5 = this.Q.o();
      boolean var4 = var10000;
      if (!var4) {
         if (var1 <= var5) {
            KB var6 = w(this.Q, var5 + var3.length());
            int var7 = var5 - 1;

            while (true) {
               if (var7 >= var1) {
                  ((char[])var6.X)[var7 + var3.length()] = ((char[])var6.X)[var7];
                  ((YP[])var6.S)[var7 + var3.length()] = ((YP[])var6.S)[var7];
                  var7--;
                  if (var4) {
                     break;
                  }

                  if (!var4) {
                     continue;
                  }
               }

               var7 = 0;
               break;
            }

            while (true) {
               if (var7 < var3.length()) {
                  ((char[])var6.X)[var7 + var1] = var3.charAt(var7);
                  ((YP[])var6.S)[var7 + var1] = var2;
                  var7++;
                  if (var4) {
                     break;
                  }

                  if (!var4) {
                     continue;
                  }
               }

               this.Q = b((char[])var6.X, (YP[])var6.S);
               break;
            }

            return;
         }

         this.j(var1, var2, var3);
      }
   }

   public static com.finalshell.ui.model.Bf2 U(
      int var0, @NotNull com.finalshell.ui.model.J2 var1, @NotNull YP var2, @NotNull com.finalshell.ui.model.Bf2 var3, int var4
   ) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      KB var6 = w(var3, var4);
      boolean var5 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var1.length()) {
            ((char[])var6.X)[var7 + var0] = var1.charAt(var7);
            var8 = (YP[])var6.S;
            if (!var5) {
               break;
            }

            ((Object[])var8)[var7 + var0] = var2;
            var7++;
            if (var5) {
               continue;
            }
         }

         var8 = var6.X;
         break;
      }

      return b((char[])var8, (YP[])var6.S);
   }

   public static KB w(com.finalshell.ui.model.Bf2 var0, int var1) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      KB var3 = KB.Z(new char[var1], new YP[var1]);
      boolean var2 = var10000;
      int var4 = 0;

      for (Lu4 var6 : var0) {
         int var7 = 0;

         while (true) {
            if (var7 < var6.s()) {
               ((char[])var3.X)[var4 + var7] = var6.v().charAt(var7);
               ((YP[])var3.S)[var4 + var7] = var6.j();
               var7++;
               if (!var2) {
                  break;
               }

               if (var2) {
                  continue;
               }
            }

            var4 += var6.s();
            break;
         }

         if (!var2) {
            break;
         }
      }

      return var3;
   }

   public static com.finalshell.ui.model.Bf2 b(char[] var0, @NotNull YP[] var1) {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      com.finalshell.ui.model.Bf2 var3 = new com.finalshell.ui.model.Bf2(null);
      YP var4 = var1[0];
      boolean var2 = var10000;
      int var5 = 0;
      int var6 = 1;

      while (true) {
         if (var6 < var0.length) {
            if (!var2) {
               break;
            }

            label21: {
               YP var7 = var1[var6];
               if (var2) {
                  if (var7 == var4) {
                     break label21;
                  }

                  var3.n(new Lu4(var4, new com.finalshell.ui.model.J2(var0, var5, var6 - var5)));
                  var7 = var1[var6];
               }

               var4 = var7;
               var5 = var6;
            }

            var6++;
            if (var2) {
               continue;
            }
         }

         var3.n(new Lu4(var4, new com.finalshell.ui.model.J2(var0, var5, var0.length - var5)));
         break;
      }

      return var3;
   }

   public synchronized void d(int var1) {
      this.F(var1, YP.r);
   }

   public synchronized void F(int var1, @NotNull YP var2) {
      this.R(var1, this.Q.o() - var1, var2);
      this.M(false);
   }

   public synchronized void R(int var1, int var2, @NotNull YP var3) {
      int var5 = 0;
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      com.finalshell.ui.model.Bf2 var6 = new com.finalshell.ui.model.Bf2(null);
      boolean var4 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      int var7 = var2;
      Iterator var8 = this.Q.iterator();

      while (true) {
         if (var8.hasNext()) {
            Lu4 var9 = (Lu4)var8.next();
            var10000 = var7;
            if (!var4) {
               break;
            }

            if (var4) {
               if (var7 == 0) {
                  var6.n(var9);
                  if (var4) {
                     continue;
                  }
               }

               var10000 = var9.s();
            }

            int var10 = var10000;
            var10000 = var5 + var10;
            int var10001 = var1;
            if (var4) {
               if (var10000 <= var1) {
                  var5 += var10;
                  var6.n(var9);
                  if (var4) {
                     continue;
                  }
               }

               var10000 = var1;
               var10001 = var5;
            }

            int var11 = var10000 - var10001;
            var10000 = var11;
            if (var4) {
               if (var11 > 0) {
                  var6.n(new Lu4(var9.j(), var9.v().Y(0, var11)));
                  var5 = var1;
               }

               var10000 = var11 + var7;
            }

            label52: {
               var10001 = var10;
               if (var4) {
                  if (var10000 < var10) {
                     var6.n(new Lu4(var9.j(), var9.v().Y(var11 + var7, var10 - (var11 + var7))));
                     var7 = 0;
                     if (var4) {
                        break label52;
                     }
                  }

                  var10000 = var7;
                  var10001 = var10 - var11;
               }

               var7 = var10000 - var10001;
               var5 = var1;
            }

            if (var4) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      if (var10000 > 0 && var3 != YP.r) {
         var6.n(new Lu4(var3, new com.finalshell.ui.model.J2('\u0000', var2)));
      }

      this.Q = var6;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public synchronized void j(int var1, int var2, int var3, @NotNull YP var4) {
      int var6 = this.Q.o();
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      var6 = Math.min(var6 + var2, var3);
      char[] var7 = new char[var6];
      YP[] var8 = new YP[var6];
      boolean var5 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      int var9 = 0;
      Iterator var10 = this.Q.iterator();

      label104:
      while (true) {
         if (var10.hasNext()) {
            Lu4 var11 = (Lu4)var10.next();
            var10000 = 0;
            if (var5) {
               int var12 = 0;

               int var10001;
               label81: {
                  while (var12 < var11.s()) {
                     var10000 = var9;
                     var10001 = var6;
                     if (!var5 || !var5) {
                        break label81;
                     }

                     if (var9 >= var6) {
                        break;
                     }

                     var10000 = var9;
                     var10001 = var1;
                     label77:
                     if (var5) {
                        if (var9 == var1) {
                           int var13 = 0;

                           while (var13 < var2) {
                              var10000 = var9;
                              var10001 = var6;
                              if (!var5 || !var5) {
                                 break label77;
                              }

                              if (var9 >= var6) {
                                 break;
                              }

                              var7[var9] = (char)a(21195, 6518221519311044562L);
                              var8[var9] = var4;
                              var9++;
                              var13++;
                              if (!var5) {
                                 break;
                              }
                           }
                        }

                        var10000 = var9;
                        var10001 = var6;
                     }

                     if (var10000 < var10001) {
                        var7[var9] = var11.v().charAt(var12);
                        var8[var9] = var11.j();
                        var9++;
                     }

                     var12++;
                     if (!var5) {
                        break;
                     }
                  }

                  var10000 = var9;
                  var10001 = var6;
               }

               if ((var10000 < var10001 || !var5) && var5) {
                  continue;
               }

               var10000 = var9;
            }
         } else {
            var10000 = var9;
         }

         while (true) {
            int var22;
            if (var10000 < var1) {
               var10000 = var9;
               var22 = var6;
               if (var5 && var5) {
                  if (var9 < var6) {
                     var7[var9] = (char)a(21195, 6518221519311044562L);
                     var8[var9] = YP.r;
                     var9++;
                     var9++;
                     if (var5) {
                        var10000 = var9;
                        continue;
                     }
                  }

                  var10000 = var9;
                  var22 = var1 + var2;
               }
            } else {
               var10000 = var9;
               var22 = var1 + var2;
            }

            while (true) {
               if (var10000 >= var22 || var9 >= var6) {
                  break label104;
               }

               var7[var9] = (char)a(21195, 6518221519311044562L);
               var8[var9] = var4;
               var9++;
               var9++;
               if (!var5) {
                  break label104;
               }

               var10000 = var9;
               var22 = var1 + var2;
            }
         }
      }

      this.Q = b(var7, var8);
   }

   public synchronized void A(int var1, int var2, @NotNull YP var3) {
      label18: {
         boolean var4 = com.finalshell.ui.model.J2.g();
         int var10000 = var2;
         int var10001 = -1;
         if (var4) {
            if (var2 != -1) {
               break label18;
            }

            var10000 = this.Q.o();
            var10001 = var1;
         }

         var2 = Math.max(var10000, var10001);
      }

      this.j(var1, var3, new com.finalshell.ui.model.J2((char)(var2 >= this.Q.o() ? '\u0000' : a(17651, 2446164316241324523L)), var2 - var1));
   }

   @Nullable
   public synchronized YP x(int var1) {
      int var10000 = (com.finalshell.ui.model.J2.g()) ? 1 : 0;
      int var3 = 0;
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      for (Lu4 var5 : this.Q) {
         int var10001;
         var10000 = var1;
         var10001 = var3;
         label23:
         if (var2) {
            if (var1 >= var3) {
               var10000 = var1;
               var10001 = var3 + var5.s();
               if (!var2) {
                  break label23;
               }

               if (var1 < var10001) {
                  return var5.j();
               }
            }

            var10000 = var3;
            var10001 = var5.s();
         }

         var3 = var10000 + var10001;
         if (!var2) {
            break;
         }
      }

      return null;
   }

   public synchronized void l(int var1, Lf2 var2, int var3) {
      boolean var4;
      int var5;
      int var6;
      Bs2_2 var7;
      com.finalshell.ui.model.Bf2 var13;
      label75: {
         boolean var10000 = com.finalshell.ui.model.J2.P();
         var5 = 0;
         var4 = var10000;
         var6 = -1;
         var7 = (Bs2_2)this.R.stream().findFirst().orElse(null);
         DC3 var8 = this.N;
         DC3 var12 = var8;
         if (!var4) {
            if (var8 != null) {
               var13 = var8.Q;
               break label75;
            }

            var12 = this;
         }

         var13 = var12.Q;
      }

      com.finalshell.ui.model.Bf2 var9 = var13;
      Iterator var10 = var9.iterator();

      while (true) {
         if (var10.hasNext()) {
            Lu4 var11 = (Lu4)var10.next();
            if (var4) {
               break;
            }

            label80: {
               label81: {
                  int var14 = (var11.v().Y()) ? 1 : 0;
                  if (!var4) {
                     if (var14 == 0) {
                        break label81;
                     }

                     var14 = var6;
                  }

                  label56: {
                     if (!var4) {
                        if (var14 >= 0) {
                           break label56;
                        }

                        var14 = var5;
                     }

                     var6 = var14;
                  }

                  var2.r(var5, var1, var6, var11.j(), var11.v(), var3);
                  if (!var4) {
                     break label80;
                  }
               }

               label50:
               if (var7 != null) {
                  int var15 = var11.s();
                  if (!var4) {
                     if (var15 <= 0) {
                        break label50;
                     }

                     var15 = (var7.v(var5, var5 + var11.s())) ? 1 : 0;
                  }

                  if (var15 != 0) {
                     this.G(var5, var1, var11, var2, var3, var7);
                     if (!var4) {
                        break label80;
                     }
                  }
               }

               var2.N(var5, var1, var11.j(), var11.v(), var3);
            }

            var5 += var11.s();
            if (!var4) {
               continue;
            }
         }

         int var10003 = var6;
         if (!var4) {
            var10003 = var6 < 0 ? var5 : var6;
         }

         var2.K(var5, var1, var10003, var3);
         break;
      }
   }

   public void G(int var1, int var2, @NotNull Lu4 var3, @NotNull Lf2 var4, int var5, @NotNull Bs2_2 var6) {
      com.finalshell.ui.model.J2 var8 = var3.v();
      int var9 = var1 + var8.length();
      int[] var10 = new int[]{var1, var9, var6.m(), var6.r()};
      int var10000 = (com.finalshell.ui.model.J2.P()) ? 1 : 0;
      Arrays.sort(var10);
      boolean var7 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      int var11 = Arrays.binarySearch(var10, var1);
      int var12 = Arrays.binarySearch(var10, var9);
      if (!var7) {
         label47:
         if (var11 >= 0) {
            var10000 = var12;
            if (!var7) {
               if (var12 < 0) {
                  break label47;
               }

               var10000 = var11;
            }

            int var13 = var10000;

            while (var13 < var12) {
               int var14 = var10[var13 + 1] - var10[var13];
               label33:
               if (var14 != 0) {
                  com.finalshell.ui.model.Q2 var15;
                  label31: {
                     var15 = new com.finalshell.ui.model.Q2(var8, var10[var13] - var1, var14);
                     if (!var7) {
                        if (!var6.v(var10[var13], var10[var13 + 1])) {
                           break label31;
                        }

                        var4.N(var10[var13], var2, var6.A(var3.j()), var15, var5);
                     }

                     if (!var7) {
                        break label33;
                     }
                  }

                  var4.N(var10[var13], var2, var3.j(), var15, var5);
               }

               var13++;
               if (var7) {
                  break;
               }
            }

            return;
         }

         d.error(
            a(21876, 410)
               + Arrays.toString(new int[]{var1, var9})
               + a(21875, 9916)
               + Arrays.toString(var10)
               + a(21874, 21319)
               + Arrays.toString(new int[]{var11, var12})
         );
         var4.N(var1, var2, var3.j(), var8, var5);
      }
   }

   public synchronized boolean V$boolean() {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      Iterator var2 = this.Q.iterator();
      boolean var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            Lu4 var3 = (Lu4)var2.next();
            var10000 = var3.V();
            if (var1) {
               break;
            }

            if (var1) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }

            if (!var1) {
               continue;
            }
         }

         var10000 = true;
         break;
      }

      return var10000;
   }

   void R(@NotNull Consumer var1) {
      this.Q.forEach(var1);
   }

   public List e() {
      return Collections.unmodifiableList(com.finalshell.ui.model.Bf2.T(this.Q));
   }

   void s(@NotNull Lu4 var1) {
      this.Q.n(var1);
   }

   @NotNull
   public synchronized Bs2_2 s(int var1, int var2, @NotNull YP var3) {
      B2_2 var4 = new B2_2(this, this, var1, var2, var3);
      this.R.add(var4);
      return var4;
   }

   @Override
   public String toString() {
      boolean var1 = com.finalshell.ui.model.J2.P();
      StringBuilder var10000 = new StringBuilder().append(this.Q.o());
      String var10001 = a(21879, 30333);
      if (!var1) {
         var10000 = var10000.append(var10001);
         var10001 = this.p ? a(21877, -26999) : "";
      }

      return var10000.append(var10001)
         .append(com.finalshell.ui.model.Bf2.I(this.Q).size())
         .append(a(21878, -22955))
         .append(com.finalshell.ui.model.Bf2.I(this.Q).stream().map(DC3::lambda$toString$0).collect(Collectors.joining("|")))
         .toString();
   }

   public static String lambda$toString$0(Lu4 var0) {
      return var0.v().toString();
   }

   static List G(DC3 var0) {
      return var0.R;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 21878) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 25;
               break;
            case 1:
               var10000 = 192;
               break;
            case 2:
               var10000 = 144;
               break;
            case 3:
               var10000 = 170;
               break;
            case 4:
               var10000 = 20;
               break;
            case 5:
               var10000 = 65;
               break;
            case 6:
               var10000 = 197;
               break;
            case 7:
               var10000 = 230;
               break;
            case 8:
               var10000 = 98;
               break;
            case 9:
               var10000 = 44;
               break;
            case 10:
               var10000 = 48;
               break;
            case 11:
               var10000 = 35;
               break;
            case 12:
               var10000 = 232;
               break;
            case 13:
               var10000 = 17;
               break;
            case 14:
               var10000 = 165;
               break;
            case 15:
               var10000 = 107;
               break;
            case 16:
               var10000 = 46;
               break;
            case 17:
               var10000 = 61;
               break;
            case 18:
               var10000 = 3;
               break;
            case 19:
               var10000 = 160;
               break;
            case 20:
               var10000 = 31;
               break;
            case 21:
               var10000 = 128;
               break;
            case 22:
               var10000 = 122;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 27;
               break;
            case 25:
               var10000 = 196;
               break;
            case 26:
               var10000 = 114;
               break;
            case 27:
               var10000 = 23;
               break;
            case 28:
               var10000 = 109;
               break;
            case 29:
               var10000 = 221;
               break;
            case 30:
               var10000 = 105;
               break;
            case 31:
               var10000 = 6;
               break;
            case 32:
               var10000 = 41;
               break;
            case 33:
               var10000 = 231;
               break;
            case 34:
               var10000 = 218;
               break;
            case 35:
               var10000 = 50;
               break;
            case 36:
               var10000 = 129;
               break;
            case 37:
               var10000 = 83;
               break;
            case 38:
               var10000 = 91;
               break;
            case 39:
               var10000 = 177;
               break;
            case 40:
               var10000 = 26;
               break;
            case 41:
               var10000 = 90;
               break;
            case 42:
               var10000 = 152;
               break;
            case 43:
               var10000 = 244;
               break;
            case 44:
               var10000 = 59;
               break;
            case 45:
               var10000 = 36;
               break;
            case 46:
               var10000 = 174;
               break;
            case 47:
               var10000 = 80;
               break;
            case 48:
               var10000 = 251;
               break;
            case 49:
               var10000 = 137;
               break;
            case 50:
               var10000 = 181;
               break;
            case 51:
               var10000 = 141;
               break;
            case 52:
               var10000 = 246;
               break;
            case 53:
               var10000 = 45;
               break;
            case 54:
               var10000 = 254;
               break;
            case 55:
               var10000 = 86;
               break;
            case 56:
               var10000 = 189;
               break;
            case 57:
               var10000 = 40;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 156;
               break;
            case 60:
               var10000 = 167;
               break;
            case 61:
               var10000 = 52;
               break;
            case 62:
               var10000 = 11;
               break;
            case 63:
               var10000 = 30;
               break;
            case 64:
               var10000 = 243;
               break;
            case 65:
               var10000 = 159;
               break;
            case 66:
               var10000 = 209;
               break;
            case 67:
               var10000 = 208;
               break;
            case 68:
               var10000 = 106;
               break;
            case 69:
               var10000 = 168;
               break;
            case 70:
               var10000 = 173;
               break;
            case 71:
               var10000 = 233;
               break;
            case 72:
               var10000 = 68;
               break;
            case 73:
               var10000 = 253;
               break;
            case 74:
               var10000 = 204;
               break;
            case 75:
               var10000 = 151;
               break;
            case 76:
               var10000 = 66;
               break;
            case 77:
               var10000 = 245;
               break;
            case 78:
               var10000 = 88;
               break;
            case 79:
               var10000 = 77;
               break;
            case 80:
               var10000 = 9;
               break;
            case 81:
               var10000 = 178;
               break;
            case 82:
               var10000 = 216;
               break;
            case 83:
               var10000 = 183;
               break;
            case 84:
               var10000 = 148;
               break;
            case 85:
               var10000 = 205;
               break;
            case 86:
               var10000 = 24;
               break;
            case 87:
               var10000 = 47;
               break;
            case 88:
               var10000 = 62;
               break;
            case 89:
               var10000 = 133;
               break;
            case 90:
               var10000 = 239;
               break;
            case 91:
               var10000 = 117;
               break;
            case 92:
               var10000 = 172;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 215;
               break;
            case 95:
               var10000 = 79;
               break;
            case 96:
               var10000 = 134;
               break;
            case 97:
               var10000 = 64;
               break;
            case 98:
               var10000 = 248;
               break;
            case 99:
               var10000 = 21;
               break;
            case 100:
               var10000 = 96;
               break;
            case 101:
               var10000 = 206;
               break;
            case 102:
               var10000 = 145;
               break;
            case 103:
               var10000 = 153;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 176;
               break;
            case 106:
               var10000 = 72;
               break;
            case 107:
               var10000 = 56;
               break;
            case 108:
               var10000 = 250;
               break;
            case 109:
               var10000 = 95;
               break;
            case 110:
               var10000 = 7;
               break;
            case 111:
               var10000 = 236;
               break;
            case 112:
               var10000 = 123;
               break;
            case 113:
               var10000 = 118;
               break;
            case 114:
               var10000 = 29;
               break;
            case 115:
               var10000 = 191;
               break;
            case 116:
               var10000 = 142;
               break;
            case 117:
               var10000 = 58;
               break;
            case 118:
               var10000 = 67;
               break;
            case 119:
               var10000 = 16;
               break;
            case 120:
               var10000 = 158;
               break;
            case 121:
               var10000 = 150;
               break;
            case 122:
               var10000 = 238;
               break;
            case 123:
               var10000 = 10;
               break;
            case 124:
               var10000 = 38;
               break;
            case 125:
               var10000 = 164;
               break;
            case 126:
               var10000 = 186;
               break;
            case 127:
               var10000 = 54;
               break;
            case 128:
               var10000 = 171;
               break;
            case 129:
               var10000 = 219;
               break;
            case 130:
               var10000 = 110;
               break;
            case 131:
               var10000 = 4;
               break;
            case 132:
               var10000 = 147;
               break;
            case 133:
               var10000 = 89;
               break;
            case 134:
               var10000 = 103;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 175;
               break;
            case 137:
               var10000 = 229;
               break;
            case 138:
               var10000 = 163;
               break;
            case 139:
               var10000 = 76;
               break;
            case 140:
               var10000 = 255;
               break;
            case 141:
               var10000 = 94;
               break;
            case 142:
               var10000 = 138;
               break;
            case 143:
               var10000 = 39;
               break;
            case 144:
               var10000 = 124;
               break;
            case 145:
               var10000 = 33;
               break;
            case 146:
               var10000 = 119;
               break;
            case 147:
               var10000 = 212;
               break;
            case 148:
               var10000 = 74;
               break;
            case 149:
               var10000 = 92;
               break;
            case 150:
               var10000 = 241;
               break;
            case 151:
               var10000 = 185;
               break;
            case 152:
               var10000 = 235;
               break;
            case 153:
               var10000 = 193;
               break;
            case 154:
               var10000 = 195;
               break;
            case 155:
               var10000 = 116;
               break;
            case 156:
               var10000 = 225;
               break;
            case 157:
               var10000 = 166;
               break;
            case 158:
               var10000 = 32;
               break;
            case 159:
               var10000 = 203;
               break;
            case 160:
               var10000 = 228;
               break;
            case 161:
               var10000 = 252;
               break;
            case 162:
               var10000 = 222;
               break;
            case 163:
               var10000 = 42;
               break;
            case 164:
               var10000 = 60;
               break;
            case 165:
               var10000 = 2;
               break;
            case 166:
               var10000 = 180;
               break;
            case 167:
               var10000 = 53;
               break;
            case 168:
               var10000 = 139;
               break;
            case 169:
               var10000 = 210;
               break;
            case 170:
               var10000 = 200;
               break;
            case 171:
               var10000 = 85;
               break;
            case 172:
               var10000 = 214;
               break;
            case 173:
               var10000 = 87;
               break;
            case 174:
               var10000 = 49;
               break;
            case 175:
               var10000 = 14;
               break;
            case 176:
               var10000 = 213;
               break;
            case 177:
               var10000 = 113;
               break;
            case 178:
               var10000 = 22;
               break;
            case 179:
               var10000 = 149;
               break;
            case 180:
               var10000 = 136;
               break;
            case 181:
               var10000 = 249;
               break;
            case 182:
               var10000 = 247;
               break;
            case 183:
               var10000 = 132;
               break;
            case 184:
               var10000 = 57;
               break;
            case 185:
               var10000 = 125;
               break;
            case 186:
               var10000 = 198;
               break;
            case 187:
               var10000 = 207;
               break;
            case 188:
               var10000 = 104;
               break;
            case 189:
               var10000 = 161;
               break;
            case 190:
               var10000 = 237;
               break;
            case 191:
               var10000 = 43;
               break;
            case 192:
               var10000 = 135;
               break;
            case 193:
               var10000 = 81;
               break;
            case 194:
               var10000 = 190;
               break;
            case 195:
               var10000 = 69;
               break;
            case 196:
               var10000 = 55;
               break;
            case 197:
               var10000 = 51;
               break;
            case 198:
               var10000 = 112;
               break;
            case 199:
               var10000 = 121;
               break;
            case 200:
               var10000 = 201;
               break;
            case 201:
               var10000 = 73;
               break;
            case 202:
               var10000 = 28;
               break;
            case 203:
               var10000 = 240;
               break;
            case 204:
               var10000 = 34;
               break;
            case 205:
               var10000 = 182;
               break;
            case 206:
               var10000 = 82;
               break;
            case 207:
               var10000 = 75;
               break;
            case 208:
               var10000 = 202;
               break;
            case 209:
               var10000 = 227;
               break;
            case 210:
               var10000 = 0;
               break;
            case 211:
               var10000 = 115;
               break;
            case 212:
               var10000 = 188;
               break;
            case 213:
               var10000 = 155;
               break;
            case 214:
               var10000 = 220;
               break;
            case 215:
               var10000 = 8;
               break;
            case 216:
               var10000 = 102;
               break;
            case 217:
               var10000 = 37;
               break;
            case 218:
               var10000 = 211;
               break;
            case 219:
               var10000 = 97;
               break;
            case 220:
               var10000 = 242;
               break;
            case 221:
               var10000 = 140;
               break;
            case 222:
               var10000 = 93;
               break;
            case 223:
               var10000 = 5;
               break;
            case 224:
               var10000 = 111;
               break;
            case 225:
               var10000 = 199;
               break;
            case 226:
               var10000 = 1;
               break;
            case 227:
               var10000 = 157;
               break;
            case 228:
               var10000 = 217;
               break;
            case 229:
               var10000 = 127;
               break;
            case 230:
               var10000 = 234;
               break;
            case 231:
               var10000 = 101;
               break;
            case 232:
               var10000 = 100;
               break;
            case 233:
               var10000 = 223;
               break;
            case 234:
               var10000 = 143;
               break;
            case 235:
               var10000 = 18;
               break;
            case 236:
               var10000 = 169;
               break;
            case 237:
               var10000 = 12;
               break;
            case 238:
               var10000 = 120;
               break;
            case 239:
               var10000 = 194;
               break;
            case 240:
               var10000 = 71;
               break;
            case 241:
               var10000 = 179;
               break;
            case 242:
               var10000 = 224;
               break;
            case 243:
               var10000 = 126;
               break;
            case 244:
               var10000 = 78;
               break;
            case 245:
               var10000 = 99;
               break;
            case 246:
               var10000 = 15;
               break;
            case 247:
               var10000 = 162;
               break;
            case 248:
               var10000 = 19;
               break;
            case 249:
               var10000 = 226;
               break;
            case 250:
               var10000 = 130;
               break;
            case 251:
               var10000 = 131;
               break;
            case 252:
               var10000 = 13;
               break;
            case 253:
               var10000 = 108;
               break;
            case 254:
               var10000 = 187;
               break;
            default:
               var10000 = 154;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11545;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[6];
      int var11 = 0;
      String var10 = "\u0014A\u0016\u0012Î.ï!tÇ\b\n\rÓH°Èi÷\f\n\u0084Ú4J®\u0084\u009a§ISw\tÌ\u009f¿8\u0017ã\u0097J@";
      int var12 = "\u0014A\u0016\u0012Î.ï!tÇ\b\n\rÓH°Èi÷\f\n\u0084Ú4J®\u0084\u009a§ISw\tÌ\u009f¿8\u0017ã\u0097J@".length();
      char var9 = '\n';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 62;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
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
                        var58 = 35;
                        break;
                     case 1:
                        var58 = 96;
                        break;
                     case 2:
                        var58 = 67;
                        break;
                     case 3:
                        var58 = 114;
                        break;
                     case 4:
                        var58 = 76;
                        break;
                     case 5:
                        var58 = 72;
                        break;
                     default:
                        var58 = 31;
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
                     b = new String[6];
                     long var0 = 3823329142471612116L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0017:9¾õ¼)&Ü\u0093\u0093\u0093\u001f§¿\u001f";
                     int var5 = "\u0017:9¾õ¼)&Ü\u0093\u0093\u0093\u001f§¿\u001f".length();
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
                     e = new Integer[2];
                     d = LoggerFactory.getLogger(DC3.class);
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

                  var10 = "\u0091Ô\u0004-\u0091¡A";
                  var12 = "\u0091Ô\u0004-\u0091¡A".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 65;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





