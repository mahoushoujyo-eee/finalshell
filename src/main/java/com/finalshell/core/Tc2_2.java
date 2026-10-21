package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tc2_2 extends T4 implements Pc4 {
   public boolean o = true;
   public String F = null;
   public Insets T = new Insets(1, 1, 1, 1);
   public int i = 0;
   public int p;
   public Insets A;
   public Insets M;
   public Map J;
   public R0 S;
   public static long a;

   public Tc2_2() {
      this.p = (int)a;
      this.A = new Insets(0, 0, 0, 0);
      this.M = new Insets(0, 0, 0, 0);
      this.J = new HashMap();
      this.S = null;
   }

   public boolean O() {
      return this.o;
   }

   public void I(boolean var1) {
      this.o = var1;
   }

   public String P() {
      return this.F;
   }

   public void L(String var1) {
      this.F = var1;
   }

   public Insets B() {
      return this.T;
   }

   public void y(Insets var1) {
      this.T = var1;
   }

   public int F() {
      return this.i;
   }

   public void s(int var1) {
      this.i = var1;
   }

   public int L() {
      return this.p;
   }

   public void L(int var1) {
      this.p = var1;
   }

   public Insets a() {
      return this.A;
   }

   public void e(Insets var1) {
      this.A = var1;
   }

   public Insets M() {
      return this.M;
   }

   public void I(Insets var1) {
      this.M = var1;
   }

   public Map c() {
      return this.J;
   }

   public void x(Map var1) {
      this.J = var1;
   }

   public R0 l() {
      return this.S;
   }

   @Override
   public void A(Component var1, Object var2) {
      this.J.put(var1, (String)var2);
   }

   @Override
   public void F(Component var1) {
      this.J.remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return new Dimension(0, 0);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var2;
      Component var69;
      label302: {
         label305: {
            label300: {
               label299: {
                  label306: {
                     label307: {
                        label296: {
                           label308: {
                              int var10000 = com.finalshell.ui.panel.Ku4.H();
                              this.S = new R0(this, var1);
                              var2 = var10000;
                              var55 = this.S.x;
                              if (var2 == 0) {
                                 if (this.S.x) {
                                    int var5 = this.S.i.y + this.T.top;
                                    int var6 = this.S.i.x + this.S.L.width + this.T.left;
                                    int var3 = 0;
                                    Iterator var7 = this.S.u.iterator();

                                    label290: {
                                       while (true) {
                                          if (var7.hasNext()) {
                                             Component var8 = (Component)var7.next();
                                             Dimension var9 = var8.getPreferredSize();
                                             var8.setBounds(var6 + var3, var5, var9.width, this.S.V.height);
                                             var3 += var9.width + this.i;
                                             if (var2 != 0) {
                                                break;
                                             }

                                             if (var2 == 0) {
                                                continue;
                                             }
                                          }

                                          var56 = this.S.V.width + this.S.L.width + this.S.p.width;
                                          if (var2 != 0) {
                                             break label290;
                                          }

                                          if (var56 < this.S.i.width) {
                                             var56 = 1;
                                             break label290;
                                          }
                                          break;
                                       }

                                       var56 = 0;
                                    }

                                    label311: {
                                       int var28 = var56;
                                       int var57 = var28;
                                       if (var2 == 0) {
                                          if (var28 != 0) {
                                             var58 = this.S.i.x + this.S.i.width - this.S.p.width - this.T.right;
                                             break label311;
                                          }

                                          var57 = var3;
                                       }

                                       if (var2 == 0) {
                                          var57 = var57 > 0 ? var6 + var3 - this.i + this.S.P : var6;
                                       }

                                       var58 = var57 + this.S.C.width - this.T.right;
                                    }

                                    int var35 = var58;
                                    var3 = 0;

                                    for (Component var10 : this.S.t) {
                                       Dimension var11 = var10.getPreferredSize();
                                       var3 += var11.width;
                                       var10.setBounds(var35 - var3, var5, var11.width, this.S.V.height);
                                       var3 += this.i;
                                       if (var2 != 0) {
                                          break label308;
                                       }

                                       if (var2 != 0) {
                                          break;
                                       }
                                    }
                                 }

                                 var55 = this.S.K;
                              }

                              if (var2 != 0) {
                                 break label296;
                              }

                              if (var55) {
                                 int var22 = this.S.i.y + this.S.i.height - this.T.bottom - this.S.f.height;
                                 int var25 = this.S.i.x + this.S.L.width + this.T.left;
                                 int var14 = 0;
                                 Iterator var29 = this.S.B.iterator();

                                 label257: {
                                    while (true) {
                                       if (var29.hasNext()) {
                                          Component var36 = (Component)var29.next();
                                          Dimension var43 = var36.getPreferredSize();
                                          var36.setBounds(var25 + var14, var22, var43.width, this.S.f.height);
                                          var14 += var43.width + this.i;
                                          if (var2 != 0) {
                                             break;
                                          }

                                          if (var2 == 0) {
                                             continue;
                                          }
                                       }

                                       var59 = this.S.f.width + this.S.L.width + this.S.p.width;
                                       if (var2 != 0) {
                                          break label257;
                                       }

                                       if (var59 < this.S.i.width) {
                                          var59 = 1;
                                          break label257;
                                       }
                                       break;
                                    }

                                    var59 = 0;
                                 }

                                 label315: {
                                    int var30 = var59;
                                    int var60 = var30;
                                    if (var2 == 0) {
                                       if (var30 != 0) {
                                          var61 = this.S.i.x + this.S.i.width - this.S.p.width - this.T.right;
                                          break label315;
                                       }

                                       var60 = var14;
                                    }

                                    if (var2 == 0) {
                                       var60 = var60 > 0 ? var25 + var14 - this.i + this.S.P : var25;
                                    }

                                    var61 = var60 + this.S.J.width - this.T.right;
                                 }

                                 int var37 = var61;
                                 var14 = 0;

                                 for (Component var49 : this.S.Z) {
                                    Dimension var52 = var49.getPreferredSize();
                                    var14 += var52.width;
                                    var49.setBounds(var37 - var14, var22, var52.width, this.S.f.height);
                                    var14 += this.i;
                                    if (var2 != 0) {
                                       break label307;
                                    }

                                    if (var2 != 0) {
                                       break;
                                    }
                                 }
                              }
                           }

                           var55 = this.S.Q;
                        }

                        if (var2 != 0) {
                           break label306;
                        }

                        if (var55) {
                           int var23 = this.S.i.x + this.T.left;
                           int var26 = this.S.i.y + this.S.q.height + this.T.top;
                           int var4 = 0;
                           Iterator var31 = this.S.S.iterator();

                           label224: {
                              while (true) {
                                 if (var31.hasNext()) {
                                    Component var38 = (Component)var31.next();
                                    Dimension var45 = var38.getPreferredSize();
                                    var38.setBounds(var23, var26 + var4, this.S.N.width, var45.height);
                                    var4 += var45.height + this.i;
                                    if (var2 != 0) {
                                       break;
                                    }

                                    if (var2 == 0) {
                                       continue;
                                    }
                                 }

                                 var62 = this.S.N.height + this.S.q.height + this.S.c.height;
                                 if (var2 != 0) {
                                    break label224;
                                 }

                                 if (var62 < this.S.i.height) {
                                    var62 = 1;
                                    break label224;
                                 }
                                 break;
                              }

                              var62 = 0;
                           }

                           label319: {
                              int var32 = var62;
                              int var63 = var32;
                              if (var2 == 0) {
                                 if (var32 != 0) {
                                    var64 = this.S.i.y + this.S.i.height - this.S.c.height - this.T.bottom;
                                    break label319;
                                 }

                                 var63 = var4;
                              }

                              if (var2 == 0) {
                                 var63 = var63 > 0 ? var26 + var4 - this.i + this.S.P : var26;
                              }

                              var64 = var63 + this.S.k.height - this.T.bottom;
                           }

                           int var39 = var64;
                           var4 = 0;

                           for (Component var50 : this.S.a) {
                              Dimension var53 = var50.getPreferredSize();
                              var4 += var53.height;
                              var50.setBounds(var23, var39 - var4, this.S.N.width, var53.height);
                              var4 += this.i;
                              if (var2 != 0) {
                                 break label299;
                              }

                              if (var2 != 0) {
                                 break;
                              }
                           }
                        }
                     }

                     var65 = this.S;
                     if (var2 != 0) {
                        break label300;
                     }

                     var55 = this.S.H;
                  }

                  if (var55) {
                     int var24 = this.S.i.x + this.S.i.width - this.T.right - this.S.O.width;
                     int var27 = this.S.i.y + this.S.q.height + this.T.top;
                     int var19 = 0;
                     Iterator var33 = this.S.o.iterator();

                     label192: {
                        while (true) {
                           if (var33.hasNext()) {
                              Component var40 = (Component)var33.next();
                              Dimension var47 = var40.getPreferredSize();
                              var40.setBounds(var24, var27 + var19, this.S.O.width, var47.height);
                              var19 += var47.height + this.i;
                              if (var2 != 0) {
                                 break;
                              }

                              if (var2 == 0) {
                                 continue;
                              }
                           }

                           var66 = this.S.O.height + this.S.q.height + this.S.c.height;
                           if (var2 != 0) {
                              break label192;
                           }

                           if (var66 < this.S.i.height) {
                              var66 = 1;
                              break label192;
                           }
                           break;
                        }

                        var66 = 0;
                     }

                     label323: {
                        int var34 = var66;
                        int var67 = var34;
                        if (var2 == 0) {
                           if (var34 != 0) {
                              var68 = this.S.i.y + this.S.i.height - this.S.c.height - this.T.bottom;
                              break label323;
                           }

                           var67 = var19;
                        }

                        if (var2 == 0) {
                           var67 = var67 > 0 ? var27 + var19 - this.i + this.S.P : var27;
                        }

                        var68 = var67 + this.S.M.height - this.T.bottom;
                     }

                     int var41 = var68;
                     var19 = 0;

                     for (Component var51 : this.S.A) {
                        Dimension var54 = var51.getPreferredSize();
                        var19 += var54.height;
                        var51.setBounds(var24, var41 - var19, this.S.O.width, var54.height);
                        var19 += this.i;
                        if (var2 != 0) {
                           break label305;
                        }

                        if (var2 != 0) {
                           break;
                        }
                     }
                  }
               }

               var65 = this.S;
            }

            var69 = var65.r;
            if (var2 != 0) {
               break label302;
            }

            if (var65.r != null) {
               this.S.r.setBounds(this.S.m);
            }
         }

         var69 = this.S.n;
      }

      if (var2 == 0) {
         if (var69 != null) {
            this.S.n.setBounds(this.S.U);
         }

         var69 = this.S.R;
      }

      if (var2 == 0) {
         if (var69 != null) {
            this.S.R.setBounds(this.S.v);
         }

         var69 = this.S.y;
      }

      if (var2 == 0) {
         if (var69 != null) {
            this.S.y.setBounds(this.S.W);
         }

         var69 = this.S.Y;
      }

      if (var2 == 0) {
         if (var69 == null) {
            return;
         }

         var69 = this.S.Y;
      }

      var69.setBounds(this.S.g);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3271341050268768390L;
      long var10002 = 3049016612266727570L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





