package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Ac2;
import com.finalshell.core.B7;
import com.finalshell.core.FN;
import com.finalshell.core.G2_2;
import com.finalshell.core.IJ3;
import com.finalshell.core.NE;
import com.finalshell.core.RV;
import com.finalshell.core.W2_3;
import com.finalshell.core.W62;
import com.finalshell.core.WC_2;
import com.finalshell.ui.listener.Fh2_2;
import com.finalshell.ui.listener.K7;
import com.finalshell.ui.listener.KQ;
import com.finalshell.ui.model.IC3;
import com.finalshell.ui.model.WF;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D.Double;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorListener;

public class Wd2 extends JComponent implements W2_3 {
   public static int Y;
   public static long R;
   public static int L;
   public static int Z;
   public final String i;
   public final WeakReference C;
   public JComponent x;
   public Point T;
   public Rectangle N;
   public WeakReference e;
   public WF W;
   public boolean c;
   public int f;
   public boolean m;
   public int d;
   public int K;
   public int X;
   public int u;
   public int H;
   public Color t;
   public Color w;
   public Color E;
   public Color I;
   public Color J;
   public float r;
   public final List k;
   public AncestorListener n;
   public final O8 M;
   public int P;
   public final WC_2 v;
   public IC3 a;
   public float q;
   public static String[] b;
   public static String[] g;
   public static long[] h;
   public static Integer[] j;

   public Wd2(Component var1, String var2) {
      this(var1, null, var2);
   }

   public Wd2(Component var1, Icon var2, String var3) {
      this(var1, B(var2, var3));
   }

   public Wd2(Component var1, String var2, WF var3) {
      this(var1, null, var2, var3);
   }

   public Wd2(Component var1, Icon var2, String var3, WF var4) {
      this(var1, B(var2, var3), var4);
   }

   public Wd2(Component var1, String var2, boolean var3) {
      this(var1, null, var2, var3);
   }

   public Wd2(Component var1, Icon var2, String var3, boolean var4) {
      this(var1, B(var2, var3), var4);
   }

   public Wd2(Component var1, String var2, WF var3, boolean var4) {
      this(var1, null, var2, var3, var4);
   }

   public Wd2(Component var1, Icon var2, String var3, WF var4, boolean var5) {
      this(var1, B(var2, var3), var4, var5);
   }

   public Wd2(Component var1, JComponent var2) {
      this(var1, var2, B7.s);
   }

   public Wd2(Component var1, JComponent var2, WF var3) {
      this(var1, var2, var3, B7.D);
   }

   public Wd2(Component var1, JComponent var2, boolean var3) {
      this(var1, var2, B7.s, var3);
   }

   public Wd2(Component var1, JComponent var2, WF var3, boolean var4) {
   super();
      Ky4[] var5;
      label17: {
         this.W = B7.s;
         this.c = B7.D;
         this.f = B7.M;
         this.m = B7.Y;
         this.d = B7.t;
         this.K = B7.v;
         this.X = B7.U;
         this.u = B7.a;
         this.H = B7.j;
         this.t = B7.b;
         this.w = B7.z;
         this.E = B7.E;
         this.I = B7.I;
         this.J = B7.d;
         Ky4[] var10000 = Ac2.n();
         this.r = B7.Z;
         this.k = new ArrayList(2);
         this.P = 0;
         this.q = 0.0F;
         FN.Y(this);
         this.setOpaque(false);
         this.i = NE.E(a(27627, -22657));
         this.C = new WeakReference<>(var1);
         this.x = var2;
         this.c = var4;
         var5 = var10000;
         this.W = var3;
         this.M = new O8();
         this.M.setFont(G2_2.c());
         this.setLayout(new BorderLayout(a(7962, 3496361729458523100L), a(4442, 2789570448754165146L)));
         this.add(var2, a(27616, -4745));
         this.v = new WC_2(a(27620, 144), (long)(a(32038, 962395468089502180L) / Y));
         this.v.q(new KQ(this));
         this.addAncestorListener(new K7(this));
         Component var6 = var1;
         if (var5 == null) {
            if (!(var1 instanceof JComponent)) {
               break label17;
            }

            this.n = new Fh2_2(this);
            var6 = var1;
         }

         ((JComponent)var6).addAncestorListener(this.n);
      }

      if (var5 != null) {
         Ky4.K(new String[4]);
      }
   }

   public void x$void() {
      Ky4[] var1 = Ac2.n();
      Wd2 var10000 = this;
      if (var1 == null) {
         if (this.c) {
            Component var2 = this.N$Component();
            if (var1 != null) {
               return;
            }

            if (var2 instanceof JComponent) {
               String var3 = W62.S((JComponent)var2);
               if (var1 != null) {
                  return;
               }

               if (!NE.B(var3)) {
                  this.M.setText(var3);
                  var10000 = this;
                  O8 var10001 = this.M;
                  if (var1 == null) {
                     if (this.getComponentZOrder(this.M) != -1) {
                        this.remove(this.M);
                     }

                     var10000 = this;
                     var10001 = this.M;
                  }

                  var10000.add(var10001, this.F$String());
                  return;
               }
            }
         }

         var10000 = this;
      }

      var10000.remove(this.M);
   }

   public String F$String() {
      switch (this.f) {
         case 2:
            return a(27622, -2123);
         case 3:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            return a(27617, -17155);
         case 4:
            return a(27626, -6560);
         case 10:
            return a(27621, 2391);
         case 11:
            return a(27618, 22900);
      }
   }

   public void j$void() {
      Ky4[] var1 = Ac2.n();
      Wd2 var10000 = this;
      if (var1 == null) {
         if (this.getParent() == null) {
            return;
         }

         this.a = IC3.fadeOut;
         var10000 = this;
      }

      if (var1 == null && !var10000.v.i()) {
         this.v.u$WC();
      }
   }

   public void R$void() {
      Ky4[] var10000 = Ac2.n();
      Component var2 = this.N$Component();
      Ky4[] var1 = var10000;
      if (var1 == null) {
         if (var2 instanceof JComponent) {
            ((JComponent)var2).removeAncestorListener(this.n);
         }

         this.w();
      }
   }

   public WF p() {
      Ky4[] var10000 = Ac2.n();
      Component var2 = this.N$Component();
      Ky4[] var1 = var10000;
      var10000 = this;
      if (var1 == null) {
         if (this.W != null) {
            boolean var11 = this.W.equals(WF.leading);
            if (var1 == null) {
               if (!var11) {
                  if (var1 != null) {
                     return this.W;
                  }

                  if (!this.W.equals(WF.trailing)) {
                     return this.W;
                  }
               }

               var11 = var2.getComponentOrientation().isLeftToRight();
            }

            boolean var7;
            var7 = var11;
            var13 = this.W.equals(WF.leading);
            label84:
            if (var1 == null) {
               if (var13) {
      boolean var13;
                  var13 = var7;
                  if (var1 != null) {
                     break label84;
                  }

                  if (var7) {
                     return WF.left;
                  }
               }

               if (var1 != null) {
                  return this.W;
               }

               var13 = this.W.equals(WF.trailing);
            }

            if (var13 && !var7) {
               return WF.left;
            }

            return WF.right;
         }

         var10000 = var2;
      }

      if (var1 == null) {
         if (!var10000.isShowing()) {
            return WF.down;
         }

         var10000 = SwingUtilities.getRootPane(var2).getGlassPane();
      }

      Object var3 = var10000;
      Object var9 = var3;
      if (var1 == null) {
         if (!var3.isShowing()) {
            return WF.down;
         }

         var9 = var3;
      }

      Dimension var4 = var9.getSize();
      Rectangle var5 = FN.J(var2, (Component)var3);
      Dimension var6 = this.getPreferredSize();
      int var10 = var5.y + this.e(var2, WF.down).y + var6.height;
      int var10001 = var4.height - this.X;
      if (var1 == null) {
         if (var10 < var10001) {
            return WF.down;
         }

         var10 = var5.y + this.e(var2, WF.up).y - var6.height;
         var10001 = this.X;
      }

      if (var1 == null) {
         if (var10 > var10001) {
            return WF.up;
         }

         var10 = var5.x + this.e(var2, WF.right).x + var6.width;
         var10001 = var4.width - this.X;
      }

      if (var1 == null) {
         if (var10 < var10001) {
            return WF.right;
         }

         var10 = var5.x + this.e(var2, WF.left).x - var6.width;
         var10001 = this.X;
      }

      return var10 > var10001 ? WF.left : WF.down;
   }

   public Point e(Component var1, WF var2) {
      Ky4[] var3 = Ac2.n();
      Point var10000 = this.T;
      if (var3 == null) {
         if (this.T == null) {
            boolean var4 = var2.equals(WF.down);
            if (var3 == null) {
               if (var4) {
                  return new Point(var1.getWidth() / 2, var1.getHeight() - L / 2 + this.H);
               }

               var4 = var2.equals(WF.up);
            }

            if (var3 == null) {
               if (var4) {
                  return new Point(var1.getWidth() / 2, L / 2 - this.H);
               }

               var4 = var2.equals(WF.left);
            }

            if (var4) {
               return new Point(L / 2 - this.H, this.getHeight() / 2);
            }

            return new Point(var1.getWidth() - L / 2 + this.H, this.getHeight() / 2);
         }

         var10000 = this.T;
      }

      return var10000;
   }

   public void N$void() {
      Ky4[] var10000 = Ac2.n();
      WF var2 = this.p();
      Ky4[] var1 = var10000;
      int var8 = (this.H + this.d + this.K) ? 1 : 0;
      int var10001 = (var2.equals(WF.right)) ? 1 : 0;
      if (var1 == null) {
         var10001 = var10001 != 0 ? L : 0;
      }

      int var3 = var8 + var10001;
      int var9 = (this.H + this.d + this.K) ? 1 : 0;
      var10001 = (var2.equals(WF.left)) ? 1 : 0;
      if (var1 == null) {
         var10001 = var10001 != 0 ? L : 0;
      }

      int var4 = var9 + var10001;
      int var10 = (this.H + this.d) ? 1 : 0;
      var10001 = (var2.equals(WF.down)) ? 1 : 0;
      if (var1 == null) {
         var10001 = var10001 != 0 ? L : 0;
      }

      int var5 = var10 + var10001;
      int var11 = (this.H + this.d) ? 1 : 0;
      var10001 = (var2.equals(WF.up)) ? 1 : 0;
      if (var1 == null) {
         var10001 = var10001 != 0 ? L : 0;
      }

      int var6 = var11 + var10001;
      Insets var7 = this.x$Insets();
      this.setBorder(BorderFactory.createEmptyBorder(var5 + var7.top, var3 + var7.left, var6 + var7.bottom, var4 + var7.right));
      this.revalidate();
      if (Ky4.F$arrString() != null) {
         Ac2.G(new Ky4[4]);
      }
   }

   public Insets x$Insets() {
      Ky4[] var1;
      int var6;
      Ky4[] var10000 = Ac2.n();
      byte var2 = (this.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      var1 = var10000;
      var6 = this.f;
      label81:
      if (var1 == null) {
         label67:
         if (this.f != 2) {
            label85: {
               label86: {
                  var6 = this.f;
                  int var10001 = a(24202, 6185470898409212489L);
                  if (var1 == null) {
                     if (var6 == var10001) {
                        var6 = var2;
                        if (var1 != null) {
                           break label81;
                        }

                        if (var2 != 0) {
                           break label67;
                        }
                     }

                     var6 = this.f;
                     if (var1 != null) {
                        break label86;
                     }

                     var10001 = a(5490, 304519638884106675L);
                  }

                  if (var6 != var10001) {
                     break label85;
                  }

                  var6 = var2;
               }

               if (var1 != null) {
                  break label81;
               }

               if (var6 == 0) {
                  break label67;
               }
            }

            var6 = 0;
            break label81;
         }

         var6 = 1;
      }

      int var3;
      label56: {
         label88: {
            var3 = (((((var6) ? 1 : 0) != 0) != 0) ? 1 : 0) != 0;
            var6 = (this.c) ? 1 : 0;
            if (var1 == null) {
               if (!this.c) {
                  break label88;
               }

               var6 = var3;
            }

            if (var1 != null) {
               break label56;
            }

            if (var6 != 0) {
               var6 = 0;
               break label56;
            }
         }

         var6 = 2;
      }

      int var4;
      label45: {
         label89: {
            var4 = (((((var6) ? 1 : 0) != 0) != 0) ? 1 : 0) != 0;
            var6 = (this.c) ? 1 : 0;
            if (var1 == null) {
               if (!this.c) {
                  break label89;
               }

               var6 = var3;
            }

            if (var1 != null) {
               break label45;
            }

            if (var6 == 0) {
               var6 = 0;
               break label45;
            }
         }

         var6 = 2;
      }

      int var5 = var6;
      return new Insets(0, var4, 0, var5);
   }

   @Override
   public void applyComponentOrientation(ComponentOrientation var1) {
      super.applyComponentOrientation(var1);
      this.j$void();
   }

   public int N$int() {
      return this.d;
   }

   public void S(int var1) {
      this.d = var1;
      this.N$void();
   }

   public int Y() {
      return this.K;
   }

   public void t(int var1) {
      this.K = var1;
      this.N$void();
      this.t$void();
   }

   public void t$void() {
      Ky4[] var10000 = Ac2.n();
      Component var2 = this.N$Component();
      Ky4[] var1 = var10000;
      Container var23 = this.getParent();
      if (var1 == null) {
         if (var23 == null) {
            return;
         }

         var23 = this.getParent();
      }

      boolean var24 = var23.isShowing();
      if (var1 == null) {
         if (!var24) {
            return;
         }

         var24 = var2.isShowing();
      }

      if (var24) {
         label264: {
            WF var3;
            Dimension var6;
            int var7;
            int var8;
            label248: {
               label265: {
                  label266: {
                     var3 = this.p();
                     Point var4 = this.getParent().getLocationOnScreen();
                     Point var5 = var2.getLocationOnScreen();
                     var6 = this.getPreferredSize();
                     var7 = var5.x - var4.x;
                     var8 = var5.y - var4.y;
                     var25 = var3.equals(WF.up);
                     if (var1 == null) {
                        if (var25) {
                           break label266;
                        }

                        var25 = var3.equals(WF.down);
                     }

                     if (var1 != null) {
                        break label248;
                     }

                     if (!var25) {
                        break label265;
                     }
                  }

                  int var9;
                  int var10;
                  label267: {
                     label282: {
                        Wd2 var26 = this;
                        if (var1 == null) {
                           if (this.T != null) {
                              break label282;
                           }

                           var26 = this;
                        }

                        Rectangle var27 = var26.N;
                        if (var1 == null) {
                           if (var26.N == null) {
                              label270: {
                                 Component var11 = this.y$Component();
                                 Component var28 = var11;
                                 if (var1 == null) {
                                    if (var11 == null) {
                                       int var40;
                                       label221: {
                                          var9 = (((((var7 + var2.getWidth() / 2) ? 1 : 0) != 0) != 0) ? 1 : 0) != 0;
                                          var40 = (var3.equals(WF.up)) ? 1 : 0;
                                          if (var1 == null) {
                                             if (var40 != 0) {
                                                var40 = L / 2 - this.H - var6.height;
                                                break label221;
                                             }

                                             var40 = var2.getHeight() - L / 2;
                                          }

                                          var40 += this.H;
                                       }

                                       var10 = var8 + var40;
                                       if (var1 == null) {
                                          break label270;
                                       }
                                    }

                                    var28 = var11;
                                 }

                                 int var42;
                                 label213: {
                                    Rectangle var12 = FN.J(var28, var2);
                                    var9 = var7 + var12.x + var12.width / 2;
                                    var29 = ((((var8 + var12.y) ? 1 : 0) != 0) != 0) != 0;
                                    var42 = (var3.equals(WF.up)) ? 1 : 0;
                                    if (var1 == null) {
                                       if (var42 != 0) {
                                          var42 = L / 2 - this.H - var6.height;
                                          break label213;
                                       }

                                       var42 = var12.height - L / 2;
                                    }

                                    var42 += this.H;
                                 }

                                 var10 = var29 + var42;
                              }

                              if (var1 == null) {
                                 break label267;
                              }
                           }

                           var27 = this.N;
                        }

                        int var44;
                        label203: {
                           Rectangle var15 = var27;
                           var9 = var7 + var15.x + var15.width / 2;
                           var30 = ((((var8 + var15.y) ? 1 : 0) != 0) != 0) != 0;
                           var44 = (var3.equals(WF.up)) ? 1 : 0;
                           if (var1 == null) {
                              if (var44 != 0) {
                                 var44 = L / 2 - this.H - var6.height;
                                 break label203;
                              }

                              var44 = var15.height - L / 2;
                           }

                           var44 += this.H;
                        }

                        var10 = var30 + var44;
                        if (var1 == null) {
                           break label267;
                        }
                     }

                     var9 = var7 + this.T.x;
                     int var31 = (var8 + this.T.y) ? 1 : 0;
                     int var45 = (var3.equals(WF.up)) ? 1 : 0;
                     if (var1 == null) {
                        var45 = var45 != 0 ? var6.height : 0;
                     }

                     var10 = var31 - var45;
                  }

                  label272: {
                     int var32 = var9 - var6.width / 2;
                     int var46 = this.X;
                     if (var1 == null) {
                        if (var32 < this.X) {
                           int var16 = this.X - (var9 - var6.width / 2);
                           this.P = Math.max(this.H + this.u + Z + 1, this.getWidth() / 2 - var16);
                           this.setLocation(this.X, var10);
                           if (var1 == null) {
                              break label272;
                           }
                        }

                        var32 = var9 + var6.width / 2;
                        var46 = this.getParent().getWidth() - this.X;
                     }

                     label192: {
                        if (var1 == null) {
                           if (var32 <= var46) {
                              break label192;
                           }

                           var32 = var9 + var6.width / 2;
                           var46 = this.getParent().getWidth() - this.X;
                        }

                        int var17 = var32 - var46;
                        this.P = Math.min(var6.width - this.H - this.u - Z - 1, this.getWidth() / 2 + var17);
                        this.setLocation(this.getParent().getWidth() - this.X - var6.width, var10);
                        if (var1 == null) {
                           break label272;
                        }
                     }

                     this.P = this.getWidth() / 2;
                     this.setLocation(var9 - var6.width / 2, var10);
                  }

                  if (var1 == null) {
                     break label264;
                  }
               }

               var25 = var3.equals(WF.left);
            }

            label178: {
               if (var1 == null) {
                  if (var25) {
                     break label178;
                  }

                  var25 = var3.equals(WF.right);
               }

               if (!var25) {
                  break label264;
               }
            }

            int var13;
            int var14;
            label273: {
               label284: {
                  Wd2 var33 = this;
                  if (var1 == null) {
                     if (this.T != null) {
                        break label284;
                     }

                     var33 = this;
                  }

                  Rectangle var34 = var33.N;
                  if (var1 == null) {
                     if (var33.N == null) {
                        label276: {
                           Component var18 = this.y$Component();
                           Component var35 = var18;
                           if (var1 == null) {
                              if (var18 == null) {
                                 int var48;
                                 label156: {
                                    var13 = (((((var8 + var2.getHeight() / 2) ? 1 : 0) != 0) != 0) ? 1 : 0) != 0;
                                    var48 = (var3.equals(WF.left)) ? 1 : 0;
                                    if (var1 == null) {
                                       if (var48 != 0) {
                                          var48 = L / 2 - this.H - var6.width;
                                          break label156;
                                       }

                                       var48 = var2.getWidth() - L / 2;
                                    }

                                    var48 += this.H;
                                 }

                                 var14 = var7 + var48;
                                 if (var1 == null) {
                                    break label276;
                                 }
                              }

                              var35 = var18;
                           }

                           int var50;
                           label148: {
                              Rectangle var22 = FN.J(var35, var2);
                              var13 = var8 + var22.y + var22.height / 2;
                              var36 = ((((var7 + var22.x) ? 1 : 0) != 0) != 0) != 0;
                              var50 = (var3.equals(WF.left)) ? 1 : 0;
                              if (var1 == null) {
                                 if (var50 != 0) {
                                    var50 = L / 2 - this.H - var6.width;
                                    break label148;
                                 }

                                 var50 = var22.width - L / 2;
                              }

                              var50 += this.H;
                           }

                           var14 = var36 + var50;
                        }

                        if (var1 == null) {
                           break label273;
                        }
                     }

                     var34 = this.N;
                  }

                  int var52;
                  label138: {
                     Rectangle var19 = var34;
                     var13 = var8 + var19.y + var19.height / 2;
                     var37 = ((((var7 + var19.x) ? 1 : 0) != 0) != 0) != 0;
                     var52 = (var3.equals(WF.left)) ? 1 : 0;
                     if (var1 == null) {
                        if (var52 != 0) {
                           var52 = L / 2 - this.H - var6.width;
                           break label138;
                        }

                        var52 = var19.width - L / 2;
                     }

                     var52 += this.H;
                  }

                  var14 = var37 + var52;
                  if (var1 == null) {
                     break label273;
                  }
               }

               var13 = var8 + this.T.y;
               int var38 = (var7 + this.T.x) ? 1 : 0;
               int var53 = (var3.equals(WF.left)) ? 1 : 0;
               if (var1 == null) {
                  var53 = var53 != 0 ? var6.width : 0;
               }

               var14 = var38 - var53;
            }

            int var39 = var13 - var6.height / 2;
            int var54 = this.X;
            if (var1 == null) {
               if (var39 < this.X) {
                  int var20 = this.X - (var13 - var6.height / 2);
                  this.P = Math.max(this.H + this.u + Z + 1, this.getHeight() / 2 - var20);
                  this.setLocation(var14, this.X);
                  if (var1 == null) {
                     break label264;
                  }
               }

               var39 = var13 + var6.height / 2;
               var54 = this.getParent().getHeight() - this.X;
            }

            label128: {
               if (var1 == null) {
                  if (var39 <= var54) {
                     break label128;
                  }

                  var39 = var13 + var6.height / 2;
                  var54 = this.getParent().getHeight() - this.X;
               }

               int var21 = var39 - var54;
               this.P = Math.min(var6.height - this.H - this.u - Z - 1, this.getHeight() / 2 + var21);
               this.setLocation(var14, this.getParent().getHeight() - this.X - var6.height);
               if (var1 == null) {
                  break label264;
               }
            }

            this.P = this.getHeight() / 2;
            this.setLocation(var14, var13 - var6.height / 2);
         }

         this.setSize(this.getPreferredSize());
      }
   }

   public Point C() {
      return this.T;
   }

   public void d(int var1, int var2) {
      this.G(new Point(var1, var2));
   }

   public void G(Point var1) {
      this.T = var1;
      this.t$void();
   }

   public Rectangle j$Rectangle() {
      return this.N;
   }

   public void Q(Rectangle var1) {
      this.N = var1;
      this.t$void();
   }

   public Component y$Component() {
      Ky4[] var1 = Ac2.n();
      Object var10000 = this.e;
      if (var1 == null) {
         if (this.e == null) {
            return null;
         }

         var10000 = this.e.get();
      }

      return (Component)var10000;
   }

   public void L(Component var1) {
      this.e = new WeakReference<>(var1);
      this.t$void();
   }

   public int h() {
      return this.X;
   }

   public void N(int var1) {
      this.X = var1;
      this.t$void();
   }

   public int H() {
      return this.u;
   }

   public void J(int var1) {
      this.u = var1;
      this.t$void();
   }

   public int r() {
      return this.H;
   }

   public void Y(int var1) {
      this.H = var1;
      this.N$void();
      this.t$void();
   }

   public Color q() {
      return this.t;
   }

   public void H(Color var1) {
      this.t = var1;
      this.repaint();
   }

   public Component N$Component() {
      return (Component)this.C.get();
   }

   public String j$String() {
      return this.i;
   }

   public JComponent T() {
      return this.x;
   }

   public void a(String var1) {
      Ky4[] var2 = Ac2.n();
      JComponent var10000 = this.x;
      if (var2 == null) {
         if (this.x == null) {
            return;
         }

         var10000 = this.x;
      }

      if (var2 == null) {
         if (!(var10000 instanceof JLabel)) {
            return;
         }

         var10000 = this.x;
      }

      ((JLabel)var10000).setText(var1);
      this.N$void();
      this.t$void();
   }

   public void K(JComponent var1) {
      Ky4[] var2 = Ac2.n();
      Wd2 var10000 = this;
      if (var2 == null) {
         if (this.x != null) {
            this.remove(this.x);
         }

         this.x = var1;
         this.add(var1, a(27623, 15637));
         this.N$void();
         var10000 = this;
      }

      var10000.t$void();
   }

   public WF k$WF() {
      return this.W;
   }

   public void A(WF var1) {
      this.W = var1;
      this.N$void();
      this.t$void();
   }

   public boolean k$boolean() {
      return this.c;
   }

   public void e(boolean var1) {
      this.c = var1;
      this.x$void();
      this.N$void();
      this.t$void();
   }

   public int k$int() {
      return this.f;
   }

   public void D(int var1) {
      this.f = var1;
      this.x$void();
      this.N$void();
      this.t$void();
   }

   public boolean R$boolean() {
      return this.m;
   }

   public void X(boolean var1) {
      this.m = var1;
   }

   public Color F$Color() {
      return this.J;
   }

   public void e(Color var1) {
      this.J = var1;
   }

   public Color Z() {
      return this.M.getForeground();
   }

   public void Z(Color var1) {
      this.M.setForeground(var1);
   }

   public Color N$Color() {
      return this.E;
   }

   public void K(Color var1) {
      this.E = var1;
   }

   public Color I() {
      return this.I;
   }

   public void n(Color var1) {
      this.I = var1;
   }

   public Color t$Color() {
      return this.w;
   }

   public void y(Color var1) {
      this.w = var1;
   }

   public float j$float() {
      return this.r;
   }

   public void k(float var1) {
      this.r = var1;
   }

   @Override
   public Shape B() {
      return this.f(this.p(), true);
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Ky4[] var10000 = Ac2.n();
      Graphics2D var3 = (Graphics2D)var1;
      Ky4[] var2 = var10000;
      Object var4 = RV.X(var3);
      if (this.q < 1.0F) {
         RV.p(var3, this.q);
      }

      Composite var5 = null;
      if (this.r < 1.0F) {
         var5 = RV.p(var3, this.r);
      }

      WF var6;
      Shape var7;
      label63: {
         var6 = this.p();
         var7 = null;
         Wd2 var8 = this;
         if (var2 == null) {
            if (this.H <= 0) {
               break label63;
            }

            var8 = this;
         }

         if (var2 == null) {
            if (var8.t == null) {
               break label63;
            }

            var8 = this;
         }

         var7 = var8.f(var6, false);
      }

      RV.y(var3, var7, B7.l, this.t, this.H);
      Color var9 = this.E;
      if (var2 == null) {
         if (this.E != null) {
            label42: {
               if (this.I != null) {
                  if (var6.equals(WF.down)) {
                     var3.setPaint(new GradientPaint(0.0F, (float)(this.getHeight() * 2 / 3), this.E, 0.0F, (float)this.getHeight(), this.I));
                     if (var2 == null) {
                        break label42;
                     }
                  }

                  var3.setPaint(new GradientPaint(0.0F, (float)(this.getHeight() / 3), this.E, 0.0F, (float)this.getHeight(), this.I));
                  if (var2 == null) {
                     break label42;
                  }
               }

               var3.setPaint(this.E);
            }

            var3.fill(this.f(var6, true));
         }

         var9 = this.w;
      }

      if (var9 != null) {
         var3.setPaint(this.w);
         var3.draw(var7);
      }

      if (var5 != null) {
         RV.c(var3, var5);
      }

      RV.X(var3, var4);
   }

   public Shape f(WF var1, boolean var2) {
      Ky4[] var3;
      float var5;
      int var10000;
      var3 = Ac2.n();
      var5 = (var2 ? 1.0F : 0.0F) ? 1 : 0;
      var10000 = (var1.equals(WF.left)) ? 1 : 0;
      label86:
      if (var3 == null) {
         if (var10000 == 0) {
            var10000 = (var1.equals(WF.right)) ? 1 : 0;
            if (var3 != null) {
               break label86;
            }

            if (var10000 == 0) {
               var10000 = 1;
               break label86;
            }
         }

         var10000 = L + 1;
      }

      float var6;
      var6 = ((float)var10000 - var5 + (float)(this.H * 2)) ? 1 : 0;
      var10000 = (var1.equals(WF.up)) ? 1 : 0;
      label78:
      if (var3 == null) {
         if (var10000 == 0) {
            var10000 = (var1.equals(WF.down)) ? 1 : 0;
            if (var3 != null) {
               break label78;
            }

            if (var10000 == 0) {
               var10000 = 1;
               break label78;
            }
         }

         var10000 = L + 1;
      }

      Area var4;
      GeneralPath var8;
      label90: {
         float var7 = (float)var10000 - var5 + (float)(this.H * 2);
         var4 = new Area(
            new Double(
               (double)(this.H + (var1.equals(WF.right) ? L : 0)),
               (double)(this.H + (var1.equals(WF.down) ? L : 0)),
               (double)((float)this.getWidth() - var6),
               (double)((float)this.getHeight() - var7),
               (double)(this.u * 2),
               (double)(this.u * 2)
            )
         );
         var5 = var2 ? 0.5F : 0.0F;
         var8 = new GeneralPath(0);
         boolean var11 = var1.equals(WF.up);
         if (var3 == null) {
            if (var11) {
               var8.moveTo((float)this.P + var5, (float)(this.getHeight() - this.H - 1));
               var8.lineTo((float)(this.P - Z) + var5, (float)(this.getHeight() - this.H - 1 - L));
               var8.lineTo((float)(this.P + Z) + var5, (float)(this.getHeight() - this.H - 1 - L));
               if (var3 == null) {
                  break label90;
               }
            }

            var11 = var1.equals(WF.down);
         }

         if (var3 == null) {
            if (var11) {
               var8.moveTo((float)this.P, (float)this.H);
               var8.lineTo((float)(this.P - Z), (float)(this.H + L));
               var8.lineTo((float)(this.P + Z), (float)(this.H + L));
               if (var3 == null) {
                  break label90;
               }
            }

            var11 = var1.equals(WF.left);
         }

         if (var3 == null) {
            if (var11) {
               var8.moveTo((float)(this.getWidth() - this.H - 1), (float)this.P + var5);
               var8.lineTo((float)(this.getWidth() - this.H - 1 - L), (float)this.P + var5 - (float)Z);
               var8.lineTo((float)(this.getWidth() - this.H - 1 - L), (float)this.P + var5 + (float)Z);
               if (var3 == null) {
                  break label90;
               }
            }

            var11 = var1.equals(WF.right);
         }

         if (var11) {
            var8.moveTo((float)this.H, (float)this.P);
            var8.lineTo((float)(this.H + L), (float)(this.P - Z));
            var8.lineTo((float)(this.H + L), (float)(this.P + Z));
         }
      }

      var8.closePath();
      var4.add(new Area(var8));
      return var4;
   }

   public void e(IJ3 var1) {
      this.k.add(var1);
   }

   public void R(IJ3 var1) {
      this.k.remove(var1);
   }

   public void b() {
      this.k.clear();
   }

   public void y$void() {
      Ky4[] var10000 = Ac2.n();
      Iterator var2 = AL_2.J((Collection)this.k).iterator();
      Ky4[] var1 = var10000;

      while (var2.hasNext()) {
         IJ3 var3 = (IJ3)var2.next();
         var3.R();
         if (var1 != null) {
            break;
         }
      }
   }

   public void n() {
      Ky4[] var10000 = Ac2.n();
      Iterator var2 = AL_2.J((Collection)this.k).iterator();
      Ky4[] var1 = var10000;

      while (var2.hasNext()) {
         IJ3 var3 = (IJ3)var2.next();
         var3.G();
         if (var1 != null) {
            break;
         }
      }
   }

   public void F$void() {
      Ky4[] var10000 = Ac2.n();
      Iterator var2 = AL_2.J((Collection)this.k).iterator();
      Ky4[] var1 = var10000;

      while (var2.hasNext()) {
         IJ3 var3 = (IJ3)var2.next();
         var3.d();
         if (var1 != null) {
            break;
         }
      }
   }

   public void w() {
      Ky4[] var10000 = Ac2.n();
      Iterator var2 = AL_2.J((Collection)this.k).iterator();
      Ky4[] var1 = var10000;

      while (var2.hasNext()) {
         IJ3 var3 = (IJ3)var2.next();
         var3.M();
         if (var1 != null) {
            break;
         }
      }
   }

   public static O B(Icon var0, String var1) {
      O var2 = new O(var1, var0);
      var2.S$void(a(27619, 29080));
      var2.setFont(G2_2.b());
      return var2;
   }

   public static long J() {
      return R;
   }

   public static int x$int() {
      return Y;
   }

   public static IC3 q(Wd2 var0) {
      return var0.a;
   }

   public static float Y$float(Wd2 var0) {
      return var0.q;
   }

   public static float F(Wd2 var0, float var1) {
      return var0.q = var1;
   }

   public static void Y$void(Wd2 var0) {
      var0.n();
   }

   public static WC_2 N(Wd2 var0) {
      return var0.v;
   }

   public static void L(Wd2 var0) {
      var0.x$void();
   }

   public static IC3 D(Wd2 var0, IC3 var1) {
      return var0.a = var1;
   }

   public static void A(Wd2 var0) {
      var0.y$void();
   }

   public static void I(Wd2 var0) {
      var0.F$void();
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 27618) & 65535;
      if (g[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 172;
               break;
            case 1:
               var10000 = 137;
               break;
            case 2:
               var10000 = 64;
               break;
            case 3:
               var10000 = 138;
               break;
            case 4:
               var10000 = 204;
               break;
            case 5:
               var10000 = 178;
               break;
            case 6:
               var10000 = 90;
               break;
            case 7:
               var10000 = 167;
               break;
            case 8:
               var10000 = 246;
               break;
            case 9:
               var10000 = 17;
               break;
            case 10:
               var10000 = 225;
               break;
            case 11:
               var10000 = 186;
               break;
            case 12:
               var10000 = 98;
               break;
            case 13:
               var10000 = 28;
               break;
            case 14:
               var10000 = 68;
               break;
            case 15:
               var10000 = 29;
               break;
            case 16:
               var10000 = 1;
               break;
            case 17:
               var10000 = 76;
               break;
            case 18:
               var10000 = 128;
               break;
            case 19:
               var10000 = 59;
               break;
            case 20:
               var10000 = 42;
               break;
            case 21:
               var10000 = 183;
               break;
            case 22:
               var10000 = 36;
               break;
            case 23:
               var10000 = 247;
               break;
            case 24:
               var10000 = 215;
               break;
            case 25:
               var10000 = 158;
               break;
            case 26:
               var10000 = 152;
               break;
            case 27:
               var10000 = 37;
               break;
            case 28:
               var10000 = 109;
               break;
            case 29:
               var10000 = 230;
               break;
            case 30:
               var10000 = 243;
               break;
            case 31:
               var10000 = 196;
               break;
            case 32:
               var10000 = 220;
               break;
            case 33:
               var10000 = 252;
               break;
            case 34:
               var10000 = 153;
               break;
            case 35:
               var10000 = 95;
               break;
            case 36:
               var10000 = 127;
               break;
            case 37:
               var10000 = 160;
               break;
            case 38:
               var10000 = 13;
               break;
            case 39:
               var10000 = 83;
               break;
            case 40:
               var10000 = 151;
               break;
            case 41:
               var10000 = 62;
               break;
            case 42:
               var10000 = 170;
               break;
            case 43:
               var10000 = 169;
               break;
            case 44:
               var10000 = 93;
               break;
            case 45:
               var10000 = 105;
               break;
            case 46:
               var10000 = 213;
               break;
            case 47:
               var10000 = 221;
               break;
            case 48:
               var10000 = 119;
               break;
            case 49:
               var10000 = 132;
               break;
            case 50:
               var10000 = 216;
               break;
            case 51:
               var10000 = 49;
               break;
            case 52:
               var10000 = 210;
               break;
            case 53:
               var10000 = 33;
               break;
            case 54:
               var10000 = 107;
               break;
            case 55:
               var10000 = 161;
               break;
            case 56:
               var10000 = 101;
               break;
            case 57:
               var10000 = 14;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 54;
               break;
            case 60:
               var10000 = 206;
               break;
            case 61:
               var10000 = 240;
               break;
            case 62:
               var10000 = 73;
               break;
            case 63:
               var10000 = 86;
               break;
            case 64:
               var10000 = 219;
               break;
            case 65:
               var10000 = 67;
               break;
            case 66:
               var10000 = 217;
               break;
            case 67:
               var10000 = 122;
               break;
            case 68:
               var10000 = 223;
               break;
            case 69:
               var10000 = 15;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 211;
               break;
            case 72:
               var10000 = 182;
               break;
            case 73:
               var10000 = 126;
               break;
            case 74:
               var10000 = 168;
               break;
            case 75:
               var10000 = 212;
               break;
            case 76:
               var10000 = 236;
               break;
            case 77:
               var10000 = 44;
               break;
            case 78:
               var10000 = 50;
               break;
            case 79:
               var10000 = 205;
               break;
            case 80:
               var10000 = 229;
               break;
            case 81:
               var10000 = 188;
               break;
            case 82:
               var10000 = 129;
               break;
            case 83:
               var10000 = 165;
               break;
            case 84:
               var10000 = 141;
               break;
            case 85:
               var10000 = 32;
               break;
            case 86:
               var10000 = 79;
               break;
            case 87:
               var10000 = 16;
               break;
            case 88:
               var10000 = 235;
               break;
            case 89:
               var10000 = 131;
               break;
            case 90:
               var10000 = 222;
               break;
            case 91:
               var10000 = 39;
               break;
            case 92:
               var10000 = 102;
               break;
            case 93:
               var10000 = 194;
               break;
            case 94:
               var10000 = 85;
               break;
            case 95:
               var10000 = 135;
               break;
            case 96:
               var10000 = 96;
               break;
            case 97:
               var10000 = 65;
               break;
            case 98:
               var10000 = 7;
               break;
            case 99:
               var10000 = 92;
               break;
            case 100:
               var10000 = 253;
               break;
            case 101:
               var10000 = 52;
               break;
            case 102:
               var10000 = 106;
               break;
            case 103:
               var10000 = 30;
               break;
            case 104:
               var10000 = 200;
               break;
            case 105:
               var10000 = 244;
               break;
            case 106:
               var10000 = 175;
               break;
            case 107:
               var10000 = 224;
               break;
            case 108:
               var10000 = 43;
               break;
            case 109:
               var10000 = 228;
               break;
            case 110:
               var10000 = 2;
               break;
            case 111:
               var10000 = 124;
               break;
            case 112:
               var10000 = 226;
               break;
            case 113:
               var10000 = 91;
               break;
            case 114:
               var10000 = 136;
               break;
            case 115:
               var10000 = 3;
               break;
            case 116:
               var10000 = 99;
               break;
            case 117:
               var10000 = 201;
               break;
            case 118:
               var10000 = 150;
               break;
            case 119:
               var10000 = 69;
               break;
            case 120:
               var10000 = 24;
               break;
            case 121:
               var10000 = 157;
               break;
            case 122:
               var10000 = 251;
               break;
            case 123:
               var10000 = 179;
               break;
            case 124:
               var10000 = 113;
               break;
            case 125:
               var10000 = 149;
               break;
            case 126:
               var10000 = 100;
               break;
            case 127:
               var10000 = 8;
               break;
            case 128:
               var10000 = 134;
               break;
            case 129:
               var10000 = 203;
               break;
            case 130:
               var10000 = 0;
               break;
            case 131:
               var10000 = 140;
               break;
            case 132:
               var10000 = 77;
               break;
            case 133:
               var10000 = 237;
               break;
            case 134:
               var10000 = 185;
               break;
            case 135:
               var10000 = 146;
               break;
            case 136:
               var10000 = 46;
               break;
            case 137:
               var10000 = 163;
               break;
            case 138:
               var10000 = 123;
               break;
            case 139:
               var10000 = 181;
               break;
            case 140:
               var10000 = 176;
               break;
            case 141:
               var10000 = 234;
               break;
            case 142:
               var10000 = 11;
               break;
            case 143:
               var10000 = 75;
               break;
            case 144:
               var10000 = 104;
               break;
            case 145:
               var10000 = 139;
               break;
            case 146:
               var10000 = 9;
               break;
            case 147:
               var10000 = 81;
               break;
            case 148:
               var10000 = 233;
               break;
            case 149:
               var10000 = 115;
               break;
            case 150:
               var10000 = 10;
               break;
            case 151:
               var10000 = 5;
               break;
            case 152:
               var10000 = 97;
               break;
            case 153:
               var10000 = 147;
               break;
            case 154:
               var10000 = 241;
               break;
            case 155:
               var10000 = 35;
               break;
            case 156:
               var10000 = 174;
               break;
            case 157:
               var10000 = 207;
               break;
            case 158:
               var10000 = 71;
               break;
            case 159:
               var10000 = 189;
               break;
            case 160:
               var10000 = 27;
               break;
            case 161:
               var10000 = 177;
               break;
            case 162:
               var10000 = 173;
               break;
            case 163:
               var10000 = 209;
               break;
            case 164:
               var10000 = 171;
               break;
            case 165:
               var10000 = 195;
               break;
            case 166:
               var10000 = 82;
               break;
            case 167:
               var10000 = 61;
               break;
            case 168:
               var10000 = 23;
               break;
            case 169:
               var10000 = 133;
               break;
            case 170:
               var10000 = 40;
               break;
            case 171:
               var10000 = 51;
               break;
            case 172:
               var10000 = 218;
               break;
            case 173:
               var10000 = 254;
               break;
            case 174:
               var10000 = 57;
               break;
            case 175:
               var10000 = 21;
               break;
            case 176:
               var10000 = 56;
               break;
            case 177:
               var10000 = 25;
               break;
            case 178:
               var10000 = 148;
               break;
            case 179:
               var10000 = 193;
               break;
            case 180:
               var10000 = 22;
               break;
            case 181:
               var10000 = 66;
               break;
            case 182:
               var10000 = 238;
               break;
            case 183:
               var10000 = 87;
               break;
            case 184:
               var10000 = 159;
               break;
            case 185:
               var10000 = 120;
               break;
            case 186:
               var10000 = 26;
               break;
            case 187:
               var10000 = 245;
               break;
            case 188:
               var10000 = 154;
               break;
            case 189:
               var10000 = 55;
               break;
            case 190:
               var10000 = 111;
               break;
            case 191:
               var10000 = 145;
               break;
            case 192:
               var10000 = 164;
               break;
            case 193:
               var10000 = 180;
               break;
            case 194:
               var10000 = 31;
               break;
            case 195:
               var10000 = 94;
               break;
            case 196:
               var10000 = 190;
               break;
            case 197:
               var10000 = 88;
               break;
            case 198:
               var10000 = 198;
               break;
            case 199:
               var10000 = 255;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 242;
               break;
            case 202:
               var10000 = 80;
               break;
            case 203:
               var10000 = 187;
               break;
            case 204:
               var10000 = 4;
               break;
            case 205:
               var10000 = 121;
               break;
            case 206:
               var10000 = 214;
               break;
            case 207:
               var10000 = 20;
               break;
            case 208:
               var10000 = 117;
               break;
            case 209:
               var10000 = 70;
               break;
            case 210:
               var10000 = 84;
               break;
            case 211:
               var10000 = 110;
               break;
            case 212:
               var10000 = 114;
               break;
            case 213:
               var10000 = 19;
               break;
            case 214:
               var10000 = 184;
               break;
            case 215:
               var10000 = 250;
               break;
            case 216:
               var10000 = 89;
               break;
            case 217:
               var10000 = 155;
               break;
            case 218:
               var10000 = 72;
               break;
            case 219:
               var10000 = 103;
               break;
            case 220:
               var10000 = 6;
               break;
            case 221:
               var10000 = 199;
               break;
            case 222:
               var10000 = 47;
               break;
            case 223:
               var10000 = 202;
               break;
            case 224:
               var10000 = 12;
               break;
            case 225:
               var10000 = 232;
               break;
            case 226:
               var10000 = 143;
               break;
            case 227:
               var10000 = 108;
               break;
            case 228:
               var10000 = 38;
               break;
            case 229:
               var10000 = 227;
               break;
            case 230:
               var10000 = 58;
               break;
            case 231:
               var10000 = 248;
               break;
            case 232:
               var10000 = 60;
               break;
            case 233:
               var10000 = 130;
               break;
            case 234:
               var10000 = 74;
               break;
            case 235:
               var10000 = 249;
               break;
            case 236:
               var10000 = 116;
               break;
            case 237:
               var10000 = 78;
               break;
            case 238:
               var10000 = 231;
               break;
            case 239:
               var10000 = 144;
               break;
            case 240:
               var10000 = 112;
               break;
            case 241:
               var10000 = 239;
               break;
            case 242:
               var10000 = 208;
               break;
            case 243:
               var10000 = 166;
               break;
            case 244:
               var10000 = 197;
               break;
            case 245:
               var10000 = 34;
               break;
            case 246:
               var10000 = 118;
               break;
            case 247:
               var10000 = 45;
               break;
            case 248:
               var10000 = 41;
               break;
            case 249:
               var10000 = 53;
               break;
            case 250:
               var10000 = 192;
               break;
            case 251:
               var10000 = 191;
               break;
            case 252:
               var10000 = 125;
               break;
            case 253:
               var10000 = 48;
               break;
            case 254:
               var10000 = 142;
               break;
            default:
               var10000 = 18;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21698;
      if (j[var3] == null) {
         j[var3] = (int)(h[var3] ^ var1);
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "!*\u0087\u0098µ\u0014=GeU\u0013e0\\F 4/V\u0092çç«m\u0090·\u0006üKdÆ\u0087\b\u0005r\u0095íoø\u0004ì\u009bíÜ\u0006BK³Æ}\b\u0015dÁí +\u00147´Öþg£Z\u007f\u0087Â$RÃÜ\u00ad\u0006\u0080\u0012ÂöMa";
      int var12 = "!*\u0087\u0098µ\u0014=GeU\u0013e0\\F 4/V\u0092çç«m\u0090·\u0006üKdÆ\u0087\b\u0005r\u0095íoø\u0004ì\u009bíÜ\u0006BK³Æ}\b\u0015dÁí +\u00147´Öþg£Z\u007f\u0087Â$RÃÜ\u00ad\u0006\u0080\u0012ÂöMa"
         .length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 102;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      int var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 97;
                        break;
                     case 1:
                        var65 = 102;
                        break;
                     case 2:
                        var65 = 56;
                        break;
                     case 3:
                        var65 = 116;
                        break;
                     case 4:
                        var65 = 96;
                        break;
                     case 5:
                        var65 = 124;
                        break;
                     default:
                        var65 = 91;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     g = new String[10];
                     long var0 = 8012813881211990188L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "y\u0010©\\8\u001e\u001a \u0002\u0005`FäÇ:ïÞr\u0083\u001ci\u001eõ0";
                     int var5 = "y\u0010©\\8\u001e\u001a \u0002\u0005`FäÇ:ïÞr\u0083\u001ci\u001eõ0".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    h = var6;
                                    j = new Integer[5];
                                    Y = B7.r;
                                    R = B7.T;
                                    L = B7.e;
                                    Z = B7.W;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "k4x\u0092ö$ñ\u0014æ\u001bä¢\u009aPûv";
                                 var5 = "k4x\u0092ö$ñ\u0014æ\u001bä¢\u009aPûv".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "kÆ©\u0017\u0003Yb\u0098";
                  var12 = "kÆ©\u0017\u0003Yb\u0098".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 43;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





