package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.BK2;
import com.finalshell.ui.panel.K22;
import com.finalshell.ui.panel.Ky4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.View;

public class Gi2 extends BasicButtonUI implements W2_3, SwingConstants, L0_2 {
   public static Stroke U;
   public Color e = SG.Y;
   public Color O = SG.k;
   public Color S = SG.K;
   public Color q = SG.h;
   public Color H = SG.S;
   public boolean j;
   public Color s;
   public boolean c;
   public int i;
   public boolean f;
   public boolean B;
   public boolean l;
   public int C;
   public Insets J;
   public Color A;
   public int h;
   public Color n;
   public Color y;
   public int a;
   public boolean P;
   public float R;
   public boolean V;
   public boolean K;
   public boolean o;
   public boolean k;
   public Og4 L;
   public boolean X;
   public boolean w;
   public boolean I;
   public boolean N;
   public boolean G;
   public boolean m;
   public boolean g;
   public boolean z;
   public boolean D;
   public Color E;
   public boolean W;
   public float u;
   public Point F;
   public WC_2 x;
   public AbstractButton b;
   public boolean d;
   public boolean Z;
   public boolean T;
   public boolean t;
   public MouseAdapter Q;
   public AncestorListener p;
   public PropertyChangeListener M;
   public static Rectangle v;
   public static Rectangle r;
   public static Rectangle Y;
   public static String[] ab;
   public static String[] bb;

   public Gi2() {
      this.j = SG.P;
      this.s = SG.N;
      this.c = SG.j;
      this.i = SG.t;
      this.f = SG.q;
      this.B = SG.F;
      this.l = SG.e;
      int[] var10000 = KD.s$arrint();
      this.C = SG.d;
      this.J = SG.Z;
      this.A = SG.p;
      this.h = SG.Q;
      this.n = SG.f;
      this.y = SG.J;
      this.a = SG.H;
      this.P = SG.C;
      this.R = SG.U;
      this.V = SG.G;
      this.K = SG.i;
      this.o = SG.w;
      int[] var1 = var10000;
      this.k = SG.g;
      this.L = SG.B;
      this.X = SG.m;
      this.w = true;
      this.I = true;
      this.N = true;
      this.G = true;
      this.m = false;
      this.g = false;
      this.z = false;
      this.D = false;
      this.E = new Color(this.s.getRed(), this.s.getGreen(), this.s.getBlue(), 0);
      this.W = false;
      this.u = 0.0F;
      this.F = null;
      this.x = null;
      this.b = null;
      if (var1 != null) {
         Ky4.K(new String[4]);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new Gi2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.b = (AbstractButton)var1;
      this.d = this.b.isFocusPainted();
      this.Z = this.b.isContentAreaFilled();
      this.T = this.b.isBorderPainted();
      this.t = this.b.isFocusable();
      FN.Y(this.b);
      this.b.setFocusPainted(false);
      this.b.setContentAreaFilled(false);
      this.b.setBorderPainted(false);
      this.b.setFocusable(true);
      KD.s$arrint();
      LookAndFeel.installProperty(this.b, a(19603, -32543), Boolean.FALSE);
      WO.t(this.b, this.L);
      this.h();
      this.Q = new BK2(this, var1);
      var1.addMouseListener(this.Q);
      var1.addMouseMotionListener(this.Q);
      this.p = new com.finalshell.ui.listener.Fr2(this, var1);
      var1.addAncestorListener(this.p);
      this.M = new com.finalshell.ui.listener.Ce4(this);
      var1.addPropertyChangeListener(a(19600, 7971), this.M);
      if (Ky4.F$arrString() != null) {
         KD.u(new int[4]);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      WO.C(this.b, this.L);
      var1.removeMouseListener(this.Q);
      var1.removeMouseMotionListener(this.Q);
      var1.removeAncestorListener(this.p);
      var1.removePropertyChangeListener(a(19601, 15512), this.M);
      this.b.setBorderPainted(this.T);
      this.b.setContentAreaFilled(this.Z);
      this.b.setFocusPainted(this.d);
      this.b.setFocusable(this.t);
      super.uninstallUI(var1);
   }

   public Shape B$Shape() {
      int[] var1 = KD.s$arrint();
      Gi2 var10000 = this;
      if (var1 == null) {
         label20:
         if (this.L == null) {
            var10000 = this;
            if (var1 == null) {
               if (this.k) {
                  break label20;
               }

               var10000 = this;
            }

            return var10000.u(this.b, true);
         }

         var10000 = this;
      }

      return FN.N(var10000.b);
   }

   public Color Y$Color() {
      return this.e;
   }

   public void d(Color var1) {
      this.e = var1;
   }

   public Color z() {
      return this.O;
   }

   public void Q(Color var1) {
      this.O = var1;
   }

   public Color k$Color() {
      return this.S;
   }

   public void J(Color var1) {
      this.S = var1;
   }

   public Color i$Color() {
      return this.q;
   }

   public void w(Color var1) {
      this.q = var1;
   }

   public Color H$Color() {
      return this.H;
   }

   public void j(Color var1) {
      this.H = var1;
   }

   public boolean H$boolean() {
      return this.c;
   }

   public void f(boolean var1) {
      this.c = var1;
   }

   public boolean G() {
      return this.j;
   }

   public void y(boolean var1) {
      this.j = var1;
   }

   public Color l$Color() {
      return this.s;
   }

   public void u(Color var1) {
      this.s = var1;
      this.v();
   }

   public void v() {
      this.E = new Color(this.s.getRed(), this.s.getGreen(), this.s.getBlue(), Math.round(this.u * (float)this.s.getAlpha()));
   }

   @Override
   public void h() {
      int[] var1 = KD.s$arrint();
      AbstractButton var10000 = this.b;
      if (var1 == null) {
         if (this.b == null) {
            return;
         }

         var10000 = this.b;
      }

      var10000.setBorder(GA.y(this.g()));
   }

   public Insets g() {
      Insets var10;
      int[] var10000 = KD.s$arrint();
      byte var2 = (byte)((this.b.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      int[] var1 = var10000;
      Insets var3 = new Insets(this.J.top, (var2 != 0 ? this.J.left : this.J.right) + this.a, this.J.bottom, (var2 != 0 ? this.J.right : this.J.left) + this.a);
      Gi2 var9 = this;
      if (var1 == null) {
         if (this.L != null) {
            Insets var4;
            int var15;
            int var10001;
            label148: {
               var4 = this.L.B(this.b);
               var3.top = var3.top + var4.top;
               var10 = var3;
               var10001 = var3.bottom;
               Insets var10002 = var4;
               if (var1 == null) {
                  var3.bottom = var3.bottom + var4.bottom;
                  var10 = var3;
                  var10001 = var3.left;
                  if (var2 != 0) {
                     var15 = var4.left;
                     break label148;
                  }

                  var10002 = var4;
               }

               var15 = var10002.right;
            }

            var10.left = var10001 + var15;
            var15 = var2;
            if (var1 == null) {
               var15 = var2 != 0 ? var4.right : var4.left;
            }

            var3.right += var15;
            if (var1 == null) {
               return var3;
            }
         }

         var9 = this;
      }

      byte var11 = (byte)((var9.k) ? 1 : 0);
      if (var1 == null) {
         if (var9.k != 0) {
            return var3;
         }

         var11 = var2;
      }

      if (var1 == null) {
         var11 = (byte)((var11 != 0 ? this.I : this.G) ? 1 : 0);
      }

      byte var8 = var11;
      byte var12 = var2;
      if (var1 == null) {
         var12 = (byte)((var2 != 0 ? this.g : this.D) ? 1 : 0);
      }

      byte var5 = var12;
      byte var13 = var2;
      if (var1 == null) {
         var13 = (byte)((var2 != 0 ? this.G : this.I) ? 1 : 0);
      }

      byte var6 = var13;
      byte var14 = var2;
      if (var1 == null) {
         var14 = (byte)((var2 != 0 ? this.D : this.g) ? 1 : 0);
      }

      byte var7;
      int var17;
      label126: {
         var7 = var14;
         var17 = (this.w) ? 1 : 0;
         if (var1 == null) {
            if (this.w) {
               var17 = this.C + 1;
               break label126;
            }

            var17 = (this.m) ? 1 : 0;
         }

         if (var1 == null) {
            var17 = var17 != 0 ? 1 : 0;
         }
      }

      label120: {
         var3.top = var3.top + var17 + this.h;
         var17 = var8;
         if (var1 == null) {
            if (var8 != 0) {
               var17 = this.C + 1;
               break label120;
            }

            var17 = var5;
         }

         if (var1 == null) {
            var17 = var17 != 0 ? 1 : 0;
         }
      }

      label114: {
         var3.left = var3.left + var17 + this.h;
         var17 = (this.N) ? 1 : 0;
         if (var1 == null) {
            if (this.N) {
               var17 = this.C + 1;
               break label114;
            }

            var17 = (this.z) ? 1 : 0;
         }

         if (var1 == null) {
            var17 = var17 != 0 ? 1 : 0;
         }
      }

      label108: {
         var3.bottom = var3.bottom + var17 + this.h;
         var17 = var6;
         if (var1 == null) {
            if (var6 != 0) {
               var17 = this.C + 1;
               break label108;
            }

            var17 = var7;
         }

         if (var1 == null) {
            var17 = var17 != 0 ? 1 : 0;
         }
      }

      var3.right = var3.right + var17 + this.h;
      return var3;
   }

   public boolean R$boolean() {
      return this.f;
   }

   public void w(boolean var1) {
      this.f = var1;
   }

   public boolean U() {
      return this.B;
   }

   public void d(boolean var1) {
      this.B = var1;
   }

   public boolean k$boolean() {
      return this.l;
   }

   public void A(boolean var1) {
      this.l = var1;
   }

   public int d() {
      return this.C;
   }

   public void z(int var1) {
      this.C = var1;
      this.h();
   }

   public Insets A$Insets() {
      return this.J;
   }

   public void Q(Insets var1) {
      this.J = var1;
      this.h();
   }

   public Color V() {
      return this.A;
   }

   public void F(Color var1) {
      this.A = var1;
   }

   public int Z$int() {
      return this.h;
   }

   public void r(int var1) {
      this.h = var1;
      this.h();
   }

   public Color t() {
      return this.n;
   }

   public void O(Color var1) {
      this.n = var1;
   }

   public Color E() {
      return this.y;
   }

   public void s(Color var1) {
      this.y = var1;
   }

   public int N() {
      return this.a;
   }

   public void l(int var1) {
      this.a = var1;
      this.h();
   }

   public int C$int() {
      return this.i;
   }

   public void D(int var1) {
      this.i = var1;
   }

   public boolean l$boolean() {
      return this.P;
   }

   public void u(boolean var1) {
      this.P = var1;
   }

   public float Z$float() {
      return this.R;
   }

   public void j(float var1) {
      this.R = var1;
   }

   public boolean o() {
      return this.k;
   }

   public void l(boolean var1) {
      this.k = var1;
      this.h();
   }

   public Og4 R$og_4() {
      return this.L;
   }

   public void S(Og4 var1) {
      WO.C(this.b, this.L);
      this.L = var1;
      WO.t(this.b, this.L);
      this.h();
   }

   public boolean K() {
      return this.X;
   }

   public void B(boolean var1) {
      this.X = var1;
   }

   public boolean x() {
      return this.K;
   }

   public void q(boolean var1) {
      this.K = var1;
   }

   public boolean m() {
      return this.o;
   }

   public void k(boolean var1) {
      this.o = var1;
   }

   public boolean A$boolean() {
      return this.V;
   }

   public void M(boolean var1) {
      this.V = var1;
   }

   public boolean n() {
      return this.N;
   }

   public void r(boolean var1) {
      this.N = var1;
      this.h();
   }

   public boolean i$boolean() {
      return this.I;
   }

   public void m(boolean var1) {
      this.I = var1;
      this.h();
   }

   public boolean C$boolean() {
      return this.G;
   }

   public void E(boolean var1) {
      this.G = var1;
      this.h();
   }

   public boolean Y$boolean() {
      return this.w;
   }

   public void J(boolean var1) {
      this.w = var1;
      this.h();
   }

   public void Z(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.w = var1;
      this.I = var2;
      this.N = var3;
      this.G = var4;
      this.h();
   }

   public boolean F() {
      return this.m;
   }

   public void L(boolean var1) {
      this.m = var1;
      this.h();
   }

   public boolean B$boolean() {
      return this.g;
   }

   public void Q(boolean var1) {
      this.g = var1;
      this.h();
   }

   public boolean W() {
      return this.z;
   }

   public void W(boolean var1) {
      this.z = var1;
      this.h();
   }

   public boolean I() {
      return this.D;
   }

   public void K(boolean var1) {
      this.D = var1;
      this.h();
   }

   public void a(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.m = var1;
      this.g = var2;
      this.z = var3;
      this.D = var4;
      this.h();
   }

   public boolean X() {
      return this.W;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      byte var17;
      int var20;
      int var22;
      boolean var39;
      boolean var52;
      int[] var3;
      Graphics2D var6;
      Object var7;
      int var38;
      label568: {
         ButtonModel var5;
         label571: {
            AbstractButton var4;
            label572: {
               var4 = (AbstractButton)var2;
               int[] var10000 = KD.s$arrint();
               var5 = var4.getModel();
               var6 = (Graphics2D)var1;
               var7 = RV.X(var6);
               var3 = var10000;
               Og4 var37 = this.L;
               if (var3 == null) {
                  if (this.L == null) {
                     var38 = (this.k) ? 1 : 0;
                     if (var3 != null) {
                        break label568;
                     }

                     if (this.k) {
                        break label571;
                     }
                  }

                  var39 = (boolean)(this);
                  if (var3 != null) {
                     break label572;
                  }

                  var37 = this.L;
               }

               if (var37 != null) {
                  this.L.u(var6, FN.N(var2), var2);
                  if (var3 == null) {
                     break label571;
                  }
               }

               var39 = (boolean)(this);
            }

            var38 = var39.k;
            if (var3 != null) {
               break label568;
            }

            if (!var39.k) {
               var38 = (var5.isPressed()) ? 1 : 0;
               label549:
               if (var3 == null) {
                  if (!var38) {
                     var38 = (var5.isSelected()) ? 1 : 0;
                     if (var3 != null) {
                        break label549;
                     }

                     if (!var38) {
                        var38 = (int)((0) != 0);
                        break label549;
                     }
                  }

                  var38 = (int)((1) != 0);
               }

               boolean var8 = (var38) != 0;
               Shape var9 = this.u(var4, true);
               var38 = (this.m(var2, var5)) ? 1 : 0;
               if (var3 != null) {
                  break label568;
               }

               if (var38 != 0) {
                  label539: {
                     label577: {
                        var38 = (this.o) ? 1 : 0;
                        if (var3 == null) {
                           if (!this.o) {
                              break label577;
                           }

                           var38 = (this.K) ? 1 : 0;
                        }

                        if (var3 == null) {
                           if (!var38) {
                              break label577;
                           }

                           var38 = (var8) ? 1 : 0;
                        }

                        if (var3 != null) {
                           break label539;
                        }

                        if (!var38) {
                           var38 = (int)((1) != 0);
                           break label539;
                        }
                     }

                     var38 = (int)((0) != 0);
                  }

                  boolean var10;
                  Composite var11;
                  label578: {
                     var10 = (var38) != 0;
                     var11 = RV.a(var6, this.u, var10);
                     var38 = (this.f) ? 1 : 0;
                     if (var3 == null) {
                        if (!this.f) {
                           break label578;
                        }

                        var38 = (var2.isEnabled()) ? 1 : 0;
                     }

                     label521:
                     if (var3 == null) {
                        if (!var38) {
                           var38 = (this.O(var4)) ? 1 : 0;
                           if (var3 != null) {
                              break label521;
                           }

                           if (!var38) {
                              var38 = (this.l) ? 1 : 0;
                              if (var3 != null) {
                                 break label521;
                              }

                              if (!this.l) {
                                 break label578;
                              }
                           }
                        }

                        var38 = (this.B) ? 1 : 0;
                     }

                     label511:
                     if (var3 == null) {
                        if (var38 != 0) {
                           var38 = (this.W) ? 1 : 0;
                           if (var3 != null) {
                              break label511;
                           }

                           if (!this.W) {
                              break label578;
                           }
                        }

                        var38 = (var10) ? 1 : 0;
                     }

                     label504: {
                        label579: {
                           if (var3 == null) {
                              if (var38 != 0) {
                                 break label579;
                              }

                              var38 = (this.B) ? 1 : 0;
                           }

                           if (var3 != null) {
                              break label504;
                           }

                           if (var38 != 0) {
                              var38 = (int)((1) != 0);
                              break label504;
                           }
                        }

                        var38 = (int)((0) != 0);
                     }

                     boolean var12;
                     Composite var13;
                     label580: {
                        var12 = (var38) != 0;
                        var13 = RV.a(var6, this.u, var12);
                        var38 = this.C;
                        if (var3 == null) {
                           if (this.C < 3) {
                              RV.Y(var6, var9, this.K(var2), this.C);
                              if (var3 == null) {
                                 break label580;
                              }
                           }

                           var38 = var4.getWidth();
                        }

                        int var14 = var38;
                        int var15 = var4.getHeight();
                        byte var16 = (byte)((var4.getComponentOrientation().isLeftToRight()) ? 1 : 0);
                        int var44 = var16;
                        if (var3 == null) {
                           var44 = (var16 != 0 ? this.I : this.G) ? 1 : 0;
                        }

                        var17 = (byte)var44;
                        var44 = var16;
                        if (var3 == null) {
                           var44 = (var16 != 0 ? this.G : this.I) ? 1 : 0;
                        }

                        byte var18;
                        PF3 var19;
                        label483: {
                           var18 = (byte)(var44);
                           var19 = Fk2.I(this.C, this.i * 2, this.u);
                           var44 = var17;
                           if (var3 == null) {
                              if (var17 != 0) {
                                 var44 = 0;
                                 break label483;
                              }

                              var44 = -this.C;
                           }

                           var44 *= 2;
                        }

                        int var61;
                        label477: {
                           var20 = var44;
                           var61 = var17;
                           if (var3 == null) {
                              if (var17 != 0) {
                                 var61 = 0;
                                 break label477;
                              }

                              var61 = this.C;
                           }

                           var61 *= 2;
                        }

                        label471: {
                           var44 = var14 + var61;
                           var61 = var18;
                           if (var3 == null) {
                              if (var18 != 0) {
                                 var61 = 0;
                                 break label471;
                              }

                              var61 = this.C;
                           }

                           var61 *= 2;
                        }

                        int var21;
                        label465: {
                           var21 = var44 + var61;
                           var44 = (this.w) ? 1 : 0;
                           if (var3 == null) {
                              if (this.w) {
                                 var44 = 0;
                                 break label465;
                              }

                              var44 = -this.C;
                           }

                           var44 *= 2;
                        }

                        label459: {
                           var22 = var44;
                           var61 = (this.w) ? 1 : 0;
                           if (var3 == null) {
                              if (this.w) {
                                 var61 = 0;
                                 break label459;
                              }

                              var61 = this.C;
                           }

                           var61 *= 2;
                        }

                        label453: {
                           var44 = var15 + var61;
                           var61 = (this.N) ? 1 : 0;
                           if (var3 == null) {
                              if (this.N) {
                                 var61 = 0;
                                 break label453;
                              }

                              var61 = this.C;
                           }

                           var61 *= 2;
                        }

                        int var23 = var44 + var61;
                        var19.l(var6, var20, var22, var21, var23);
                     }

                     RV.E(var6, var13, var12);
                  }

                  var6.setPaint(
                     new GradientPaint(0.0F, this.w ? (float)this.C : 0.0F, this.z(var8), 0.0F, (float)(var4.getHeight() - (this.N ? this.C : 0)), this.v(var8))
                  );
                  var6.fill(this.u(var4, false));
                  var52 = this.j;
                  label439:
                  if (var3 == null) {
                     if (this.j && this.F != null) {
                        var52 = var2.isEnabled();
                        if (var3 != null) {
                           break label439;
                        }

                        if (var52) {
                           Shape var25 = RV.n(var6, var9);
                           var6.setPaint(
                              new RadialGradientPaint(
                                 (float)this.F.x, (float)var2.getHeight(), (float)var2.getWidth(), new float[]{0.0F, 1.0F}, new Color[]{this.E, GO.l}
                              )
                           );
                           var6.fill(var9);
                           RV.w(var6, var25);
                        }
                     }

                     var52 = var8;
                  }

                  if (var3 == null) {
                     if (var52) {
                        RV.D(var6, var9, this.n, this.h, var9);
                     }

                     var52 = this.e();
                  }

                  if (var52) {
                     Shape var26 = RV.e(var6, var9);
                     Stroke var28 = RV.M(var6, U);
                     var6.setPaint(this.y);
                     var6.draw(var9);
                     RV.p(var6, var28);
                     RV.w(var6, var26);
                  }

                  Color var69;
                  label582: {
                     boolean var68 = var2.isEnabled();
                     if (var3 == null) {
                        if (!var68) {
                           var69 = GO.FX;
                           break label582;
                        }

                        var68 = this.c;
                     }

                     label426:
                     if (var3 == null) {
                        if (var68) {
                           var68 = this.W;
                           if (var3 != null) {
                              break label426;
                           }

                           if (this.W) {
                              var69 = this.L();
                              break label582;
                           }
                        }

                        var68 = this.c;
                     }

                     var69 = !var68 ? GO.Ff : GO.N;
                  }

                  var6.setPaint(var69);
                  var6.draw(var9);
                  byte var27 = (byte)((var4.getComponentOrientation().isLeftToRight()) ? 1 : 0);
                  int var53 = var27;
                  if (var3 == null) {
                     var53 = (var27 != 0 ? this.I : this.G) ? 1 : 0;
                  }

                  byte var29 = (byte)var53;
                  var53 = var27;
                  if (var3 == null) {
                     var53 = (var27 != 0 ? this.g : this.D) ? 1 : 0;
                  }

                  byte var30 = (byte)(var53);
                  var53 = var27;
                  if (var3 == null) {
                     var53 = (var27 != 0 ? this.G : this.I) ? 1 : 0;
                  }

                  byte var31 = (byte)(var53);
                  var53 = var27;
                  if (var3 == null) {
                     var53 = (var27 != 0 ? this.D : this.g) ? 1 : 0;
                  }

                  byte var32;
                  var32 = (byte)(var53);
                  var53 = (this.w) ? 1 : 0;
                  label393:
                  if (var3 == null) {
                     if (!this.w) {
                        var53 = (this.m) ? 1 : 0;
                        if (var3 != null) {
                           break label393;
                        }

                        if (this.m) {
                           var53 = var29;
                           if (var3 == null) {
                              var53 = var29 != 0 ? this.C : 0;
                           }

                           int var33;
                           label401: {
                              label400: {
                                 var33 = var53;
                                 boolean var70 = var2.isEnabled();
                                 if (var3 == null) {
                                    if (var70) {
                                       break label400;
                                    }

                                    var70 = this.g(var4);
                                 }

                                 if (!var70) {
                                    var69 = GO.FX;
                                    break label401;
                                 }
                              }

                              var69 = GO.Ff;
                           }

                           var6.setPaint(var69);
                           int var10003 = var33 + var2.getWidth();
                           int var10004 = var29;
                           if (var3 == null) {
                              var10004 = var29 != 0 ? this.C : 0;
                           }

                           var10003 -= var10004;
                           var10004 = var31;
                           if (var3 == null) {
                              var10004 = var31 != 0 ? this.C + 1 : 0;
                           }

                           var6.drawLine(var33, 0, var10003 - var10004, 0);
                        }
                     }

                     var53 = var29;
                  }

                  label374:
                  if (var3 == null) {
                     if (var53 == 0) {
                        var53 = var30;
                        if (var3 != null) {
                           break label374;
                        }

                        if (var30 != 0) {
                           var53 = (this.w) ? 1 : 0;
                           if (var3 == null) {
                              var53 = this.w ? this.C : 0;
                           }

                           int var34;
                           label382: {
                              label381: {
                                 var34 = var53;
                                 boolean var72 = var2.isEnabled();
                                 if (var3 == null) {
                                    if (var72) {
                                       break label381;
                                    }

                                    var72 = this.g(var4);
                                 }

                                 if (!var72) {
                                    var69 = GO.FX;
                                    break label382;
                                 }
                              }

                              var69 = GO.Ff;
                           }

                           var6.setPaint(var69);
                           int var84 = var34 + var2.getHeight();
                           int var10005 = (this.w) ? 1 : 0;
                           if (var3 == null) {
                              var10005 = this.w ? this.C : 0;
                           }

                           var84 -= var10005;
                           var10005 = (this.N) ? 1 : 0;
                           if (var3 == null) {
                              var10005 = this.N ? this.C + 1 : 0;
                           }

                           var6.drawLine(0, var34, 0, var84 - var10005);
                        }
                     }

                     var53 = (this.N) ? 1 : 0;
                  }

                  label355:
                  if (var3 == null) {
                     if (var53 == 0) {
                        var53 = (this.z) ? 1 : 0;
                        if (var3 != null) {
                           break label355;
                        }

                        if (this.z) {
                           var53 = var29;
                           if (var3 == null) {
                              var53 = var29 != 0 ? this.C : 0;
                           }

                           int var35;
                           label363: {
                              label362: {
                                 var35 = var53;
                                 boolean var74 = var2.isEnabled();
                                 if (var3 == null) {
                                    if (var74) {
                                       break label362;
                                    }

                                    var74 = this.Q(var4);
                                 }

                                 if (!var74) {
                                    var69 = GO.FX;
                                    break label363;
                                 }
                              }

                              var69 = GO.Ff;
                           }

                           var6.setPaint(var69);
                           int var10002 = var2.getHeight() - 1;
                           int var80 = var35 + var2.getWidth();
                           int var86 = var29;
                           if (var3 == null) {
                              var86 = var29 != 0 ? this.C : 0;
                           }

                           var80 -= var86;
                           var86 = var31;
                           if (var3 == null) {
                              var86 = var31 != 0 ? this.C + 1 : 0;
                           }

                           var6.drawLine(var35, var10002, var80 - var86, var2.getHeight() - 1);
                        }
                     }

                     var53 = var31;
                  }

                  label589: {
                     if (var3 == null) {
                        if (var53 != 0) {
                           break label589;
                        }

                        var53 = var32;
                     }

                     if (var3 == null) {
                        if (var53 == 0) {
                           break label589;
                        }

                        var53 = (this.w) ? 1 : 0;
                     }

                     if (var3 == null) {
                        var53 = var53 != 0 ? this.C : 0;
                     }

                     int var36;
                     label346: {
                        label345: {
                           var36 = var53;
                           boolean var76 = var2.isEnabled();
                           if (var3 == null) {
                              if (var76) {
                                 break label345;
                              }

                              var76 = this.Q(var4);
                           }

                           if (!var76) {
                              var69 = GO.FX;
                              break label346;
                           }
                        }

                        var69 = GO.Ff;
                     }

                     var6.setPaint(var69);
                     int var78 = var2.getWidth() - 1;
                     int var82 = var2.getWidth() - 1;
                     int var88 = var36 + var2.getHeight();
                     int var91 = (this.w) ? 1 : 0;
                     if (var3 == null) {
                        var91 = this.w ? this.C : 0;
                     }

                     var88 -= var91;
                     var91 = (this.N) ? 1 : 0;
                     if (var3 == null) {
                        var91 = this.N ? this.C + 1 : 0;
                     }

                     var6.drawLine(var78, var36, var82, var88 - var91);
                  }

                  RV.E(var6, var11, var10);
               }
            }
         }

         var38 = (var5.isPressed()) ? 1 : 0;
      }

      label327: {
         if (var3 == null) {
            if (!var38) {
               break label327;
            }

            var38 = (this.X) ? 1 : 0;
         }

         if (var38 != 0) {
            var6.translate(1, 1);
         }
      }

      RV.X(var6, var7);
      Map var24 = FN.Y(var6);
      this.B(var1, var2);
      FN.k(var6, var24);
   }

   public void B(Graphics var1, JComponent var2) {
      boolean var17;
      View var18;
      Registry.packArgs(var2, var1);
      long var9 = 135169693674870498L;
      String var10001 = (String)Ref.h2(135169693674870498L, var9);

      try {
         var10001 = (Graphics)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      int[] var3;
      AbstractButton var4;
      String var7;
      label69: {
         var1 = (Graphics)var10001;
         var4 = (AbstractButton)var2;
         ButtonModel var5 = var4.getModel();
         FontMetrics var6 = var2.getFontMetrics(var2.getFont());
         var10001 = (String)(KD.s$arrint());
         var7 = this.X(var4, var6, var4.getWidth(), var4.getHeight());
         this.clearTextShiftOffset();
         var3 = (int[])var10001;
         boolean var15 = var5.isArmed();
         if (var3 == null) {
            if (!var15) {
               break label69;
            }

            var15 = var5.isPressed();
         }

         if (var15) {
            this.paintButtonPressed(var1, var4);
         }
      }

      if (var4.getIcon() != null) {
         this.paintIcon(var1, var2, Y);
      }

      label62: {
         label73: {
            var10001 = var7;
            if (var3 == null) {
               if (var7 == null) {
                  break label73;
               }

               var10001 = var7;
            }

            var17 = var10001.isEmpty();
            if (var3 != null) {
               break label62;
            }

            label55:
            if (!var17) {
               label53: {
                  View var8 = (View)var2.getClientProperty(a(19602, 21899));
                  var18 = var8;
                  if (var3 == null) {
                     if (var8 == null) {
                        break label53;
                     }

                     var18 = var8;
                  }

                  var18.paint(var1, r);
                  if (var3 == null) {
                     break label55;
                  }
               }

               this.paintText(var1, var4, r, var7);
            }
         }

         var17 = var4.isFocusPainted();
      }

      if (var3 == null) {
         if (!var17) {
            return;
         }

         var17 = var4.hasFocus();
      }

      if (var17) {
         this.paintFocus(var1, var4, v, r, Y);
      }
   }

   public String X(AbstractButton var1, FontMetrics var2, int var3, int var4) {
      Insets var6 = var1.getInsets();
      int[] var10000 = KD.s$arrint();
      v.x = var6.left;
      int[] var5 = var10000;
      v.y = var6.top;
      v.width = var3 - (var6.right + v.x);
      v.height = var4 - (var6.bottom + v.y);
      r.x = r.y = r.width = r.height = 0;
      Y.x = Y.y = Y.width = Y.height = 0;
      String var10002 = var1.getText();
      Icon var10003 = var1.getIcon();
      int var10004 = var1.getVerticalAlignment();
      int var10005 = var1.getHorizontalAlignment();
      int var10006 = var1.getVerticalTextPosition();
      int var10007 = var1.getHorizontalTextPosition();
      Rectangle var10008 = v;
      Rectangle var10009 = Y;
      Rectangle var10010 = r;
      AbstractButton var10011 = var1;
      if (var5 == null) {
         if (var1.getText() == null) {
            return SwingUtilities.layoutCompoundLabel(var1, var2, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010, 0);
         }

         var10011 = var1;
      }

      return SwingUtilities.layoutCompoundLabel(var1, var2, var10002, var10003, var10004, var10005, var10006, var10007, v, Y, r, var10011.getIconTextGap());
   }

   public boolean e() {
      int[] var1 = KD.s$arrint();
      boolean var10000 = this.b instanceof JButton;
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = ((JButton)this.b).isDefaultButton();
      }

      return var1 != null ? var10000 : var10000;
   }

   public Color z(boolean var1) {
      return var1 ? this.S : this.e;
   }

   public Color v(boolean var1) {
      return var1 ? this.q : this.O;
   }

   public boolean g(AbstractButton var1) {
      int[] var10000 = KD.s$arrint();
      Container var3 = var1.getParent();
      int[] var2 = var10000;
      Container var7 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return 0 != 0;
         }

         var7 = var3;
      }

      boolean var8 = var7 instanceof K22;
      if (var2 != null) {
         return var8;
      } else {
         if (var8) {
            int var4 = var3.getComponentZOrder(var1);
            if (var2 != null) {
               return var4 != 0;
            }

            if (var4 > 0) {
               K22 var5 = (K22)var3;
               Component var6 = var5.getComponent(var4 - 1);
               boolean var9 = var6 instanceof KD;
               if (var2 != null) {
                  return var9;
               }

               if (var9) {
                  return var6.isEnabled();
               }
            }
         }

         return 0 != 0;
      }
   }

   public boolean Q(AbstractButton var1) {
      int[] var10000 = KD.s$arrint();
      Container var3 = var1.getParent();
      int[] var2 = var10000;
      Container var7 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return 0 != 0;
         }

         var7 = var3;
      }

      boolean var8 = var7 instanceof K22;
      if (var2 != null) {
         return var8;
      } else {
         if (var8) {
            int var4 = var3.getComponentZOrder(var1);
            if (var2 != null) {
               return var4 != 0;
            }

            if (var4 < var3.getComponentCount() - 1) {
               K22 var5 = (K22)var3;
               Component var6 = var5.getComponent(var4 + 1);
               boolean var9 = var6 instanceof KD;
               if (var2 != null) {
                  return var9;
               }

               if (var9) {
                  return var6.isEnabled();
               }
            }
         }

         return 0 != 0;
      }
   }

   public boolean O(AbstractButton var1) {
      int[] var10000 = KD.s$arrint();
      Container var3 = var1.getParent();
      int[] var2 = var10000;
      Container var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return false;
         }

         var4 = var3;
      }

      return var2 != null ? var4 instanceof K22 : var4 instanceof K22;
   }

   public Color K(JComponent var1) {
      int[] var2 = KD.s$arrint();
      Gi2 var10000 = this;
      if (var2 == null) {
         if (this.j(var1)) {
            return GO.c;
         }

         var10000 = this;
      }

      return var10000.A;
   }

   public boolean j(JComponent var1) {
      int[] var2 = KD.s$arrint();
      boolean var10000 = var1.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.V;
      }

      if (var2 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = var1.isFocusOwner();
      }

      return var2 != null ? var10000 : var10000;
   }

   public boolean m(JComponent var1, ButtonModel var2) {
      int[] var3;
      int var10000;
      var3 = KD.s$arrint();
      var10000 = (this.K) ? 1 : 0;
      label60:
      if (var3 == null) {
         if (this.K) {
            var10000 = (this.W) ? 1 : 0;
            if (var3 != null) {
               break label60;
            }

            if (this.W) {
               byte var5 = (byte)((var1.isEnabled()) ? 1 : 0);
               if (var3 != null) {
                  return var5 != 0;
               }

               if (var5 != 0) {
                  return 1 != 0;
               }
            }
         }

         var10000 = (this.o) ? 1 : 0;
      }

      label49:
      if (var3 == null) {
         if (var10000 != 0) {
            float var4;
            var10000 = (var4 = this.u - 0.0F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
            if (var3 != null) {
               break label49;
            }

            if (var10000 > 0) {
               byte var6 = (byte)((var1.isEnabled()) ? 1 : 0);
               if (var3 != null) {
                  return var6 != 0;
               }

               if (var6 != 0) {
                  return 1 != 0;
               }
            }
         }

         var10000 = (this.K) ? 1 : 0;
      }

      if (var3 != null) {
         return var10000 != 0;
      } else {
         if (var10000 != 0) {
            byte var7 = (byte)((var2.isSelected()) ? 1 : 0);
            if (var3 != null) {
               return var7 != 0;
            }

            if (!var7) {
               var7 = (byte)((var2.isPressed()) ? 1 : 0);
               if (var3 != null) {
                  return var7 != 0;
               }

               if (var7 == 0) {
                  return 0 != 0;
               }
            }
         }

         return 1 != 0;
      }
   }

   @Override
   public void paintText(Graphics var1, JComponent var2, Rectangle var3, String var4) {
      AbstractButton var6 = (AbstractButton)var2;
      ButtonModel var7 = var6.getModel();
      int[] var10000 = KD.s$arrint();
      FontMetrics var8 = FN.L(var2, var1);
      int[] var5 = var10000;
      int var9 = var6.getDisplayedMnemonicIndex();
      if (var5 == null) {
         if (var7.isEnabled()) {
            Color var10;
            label27: {
               label26: {
                  boolean var10001 = var7.isPressed();
                  if (var5 == null) {
                     if (var10001) {
                        break label26;
                     }

                     var10001 = var7.isSelected();
                  }

                  if (!var10001) {
                     var10 = var6.getForeground();
                     break label27;
                  }
               }

               var10 = this.H;
            }

            var1.setColor(var10);
            FN.W(var1, var4, var9, var3.x + this.getTextShiftOffset(), var3.y + var8.getAscent() + this.getTextShiftOffset());
            if (var5 == null) {
               return;
            }
         }

         var1.setColor(var6.getBackground().brighter());
         FN.W(var1, var4, var9, var3.x, var3.y + var8.getAscent());
         var1.setColor(var6.getBackground().darker());
      }

      FN.W(var1, var4, var9, var3.x - 1, var3.y + var8.getAscent() - 1);
   }

   public Color L() {
      return P9.N(GO.N, GO.Ff, this.u);
   }

   @Override
   public void paintIcon(Graphics var1, JComponent var2, Rectangle var3) {
      boolean var10;
      Graphics2D var7;
      label30: {
         label32: {
            int[] var10000 = KD.s$arrint();
            AbstractButton var5 = (AbstractButton)var2;
            int[] var4 = var10000;
            ButtonModel var6 = var5.getModel();
            var7 = (Graphics2D)var1;
            var10 = this.P;
            if (var4 == null) {
               if (!this.P) {
                  break label32;
               }

               var10 = var5 instanceof JToggleButton;
            }

            if (var4 == null) {
               if (!var10) {
                  break label32;
               }

               var10 = var6.isSelected();
            }

            if (var4 != null) {
               break label30;
            }

            if (!var10) {
               var10 = true;
               break label30;
            }
         }

         var10 = false;
      }

      boolean var8 = var10;
      Composite var9 = RV.a(var7, this.R, var8);
      super.paintIcon(var1, var2, var3);
      RV.E(var7, var9, var8);
   }

   public Shape u(AbstractButton var1, boolean var2) {
      int var10;
      int var16;
      int var18;
      int var22;
      int[] var10000 = KD.s$arrint();
      byte var4 = (byte)((var1.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      int[] var3 = var10000;
      byte var13 = var4;
      if (var3 == null) {
         var13 = (byte)((var4 != 0 ? this.I : this.G) ? 1 : 0);
      }

      byte var5 = var13;
      byte var14 = var4;
      if (var3 == null) {
         var14 = (byte)((var4 != 0 ? this.G : this.I) ? 1 : 0);
      }

      byte var6;
      label74: {
         var6 = var14;
         int var15 = var5;
         if (var3 == null) {
            if (var5 != 0) {
               var16 = this.C;
               break label74;
            }

            var15 = -this.C - this.i;
         }

         var16 = var15 - 1;
      }

      int var7;
      label68: {
         var7 = var16;
         int var17 = (this.w) ? 1 : 0;
         if (var3 == null) {
            if (this.w) {
               var18 = this.C;
               break label68;
            }

            var17 = -this.C - this.i;
         }

         var18 = var17 - 1;
      }

      int var8;
      label62: {
         var8 = var18;
         int var19 = var6;
         if (var3 == null) {
            if (var6 != 0) {
               var20 = var1.getWidth() - this.C - 1;
               break label62;
            }

            var19 = var1.getWidth() + this.C;
         }

         var20 = var19 + this.i;
      }

      int var9;
      label56: {
         var9 = var20;
         int var21 = (this.N) ? 1 : 0;
         if (var3 == null) {
            if (this.N) {
               var22 = var1.getHeight() - this.C - 1;
               break label56;
            }

            var21 = var1.getHeight() + this.C;
         }

         var22 = var21 + this.i;
      }

      var10 = var22;
      int var11 = var9 - var7;
      int var12 = var10 - var8;
      return (Shape)(this.i > 0
         ? new Double((double)var7, (double)var8, (double)var11, (double)var12, (double)(this.i * 2 + (var2 ? 0 : 1)), (double)(this.i * 2 + (var2 ? 0 : 1)))
         : new java.awt.geom.Rectangle2D.Double((double)var7, (double)var8, (double)var11, (double)var12));
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var2 = super.getPreferredSize(var1);
      if (this.L != null) {
         var2 = FN.h(var2, this.L.d$Dimension(var1));
      }

      return var2;
   }

   public static void F(Gi2 var0) {
      var0.v();
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 19600) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 72;
               break;
            case 1:
               var10000 = 244;
               break;
            case 2:
               var10000 = 81;
               break;
            case 3:
               var10000 = 192;
               break;
            case 4:
               var10000 = 249;
               break;
            case 5:
               var10000 = 34;
               break;
            case 6:
               var10000 = 95;
               break;
            case 7:
               var10000 = 78;
               break;
            case 8:
               var10000 = 164;
               break;
            case 9:
               var10000 = 227;
               break;
            case 10:
               var10000 = 165;
               break;
            case 11:
               var10000 = 52;
               break;
            case 12:
               var10000 = 8;
               break;
            case 13:
               var10000 = 126;
               break;
            case 14:
               var10000 = 170;
               break;
            case 15:
               var10000 = 183;
               break;
            case 16:
               var10000 = 68;
               break;
            case 17:
               var10000 = 103;
               break;
            case 18:
               var10000 = 46;
               break;
            case 19:
               var10000 = 3;
               break;
            case 20:
               var10000 = 226;
               break;
            case 21:
               var10000 = 50;
               break;
            case 22:
               var10000 = 174;
               break;
            case 23:
               var10000 = 88;
               break;
            case 24:
               var10000 = 80;
               break;
            case 25:
               var10000 = 253;
               break;
            case 26:
               var10000 = 6;
               break;
            case 27:
               var10000 = 76;
               break;
            case 28:
               var10000 = 85;
               break;
            case 29:
               var10000 = 7;
               break;
            case 30:
               var10000 = 219;
               break;
            case 31:
               var10000 = 140;
               break;
            case 32:
               var10000 = 1;
               break;
            case 33:
               var10000 = 60;
               break;
            case 34:
               var10000 = 44;
               break;
            case 35:
               var10000 = 39;
               break;
            case 36:
               var10000 = 168;
               break;
            case 37:
               var10000 = 231;
               break;
            case 38:
               var10000 = 254;
               break;
            case 39:
               var10000 = 237;
               break;
            case 40:
               var10000 = 151;
               break;
            case 41:
               var10000 = 155;
               break;
            case 42:
               var10000 = 91;
               break;
            case 43:
               var10000 = 145;
               break;
            case 44:
               var10000 = 48;
               break;
            case 45:
               var10000 = 224;
               break;
            case 46:
               var10000 = 218;
               break;
            case 47:
               var10000 = 112;
               break;
            case 48:
               var10000 = 101;
               break;
            case 49:
               var10000 = 217;
               break;
            case 50:
               var10000 = 220;
               break;
            case 51:
               var10000 = 247;
               break;
            case 52:
               var10000 = 40;
               break;
            case 53:
               var10000 = 139;
               break;
            case 54:
               var10000 = 188;
               break;
            case 55:
               var10000 = 19;
               break;
            case 56:
               var10000 = 206;
               break;
            case 57:
               var10000 = 14;
               break;
            case 58:
               var10000 = 135;
               break;
            case 59:
               var10000 = 21;
               break;
            case 60:
               var10000 = 15;
               break;
            case 61:
               var10000 = 156;
               break;
            case 62:
               var10000 = 181;
               break;
            case 63:
               var10000 = 43;
               break;
            case 64:
               var10000 = 162;
               break;
            case 65:
               var10000 = 223;
               break;
            case 66:
               var10000 = 67;
               break;
            case 67:
               var10000 = 111;
               break;
            case 68:
               var10000 = 215;
               break;
            case 69:
               var10000 = 23;
               break;
            case 70:
               var10000 = 97;
               break;
            case 71:
               var10000 = 147;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 230;
               break;
            case 74:
               var10000 = 45;
               break;
            case 75:
               var10000 = 36;
               break;
            case 76:
               var10000 = 212;
               break;
            case 77:
               var10000 = 77;
               break;
            case 78:
               var10000 = 32;
               break;
            case 79:
               var10000 = 187;
               break;
            case 80:
               var10000 = 69;
               break;
            case 81:
               var10000 = 41;
               break;
            case 82:
               var10000 = 130;
               break;
            case 83:
               var10000 = 166;
               break;
            case 84:
               var10000 = 125;
               break;
            case 85:
               var10000 = 195;
               break;
            case 86:
               var10000 = 70;
               break;
            case 87:
               var10000 = 53;
               break;
            case 88:
               var10000 = 238;
               break;
            case 89:
               var10000 = 138;
               break;
            case 90:
               var10000 = 248;
               break;
            case 91:
               var10000 = 177;
               break;
            case 92:
               var10000 = 119;
               break;
            case 93:
               var10000 = 106;
               break;
            case 94:
               var10000 = 216;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 82;
               break;
            case 97:
               var10000 = 158;
               break;
            case 98:
               var10000 = 178;
               break;
            case 99:
               var10000 = 136;
               break;
            case 100:
               var10000 = 214;
               break;
            case 101:
               var10000 = 56;
               break;
            case 102:
               var10000 = 10;
               break;
            case 103:
               var10000 = 235;
               break;
            case 104:
               var10000 = 87;
               break;
            case 105:
               var10000 = 64;
               break;
            case 106:
               var10000 = 94;
               break;
            case 107:
               var10000 = 137;
               break;
            case 108:
               var10000 = 107;
               break;
            case 109:
               var10000 = 27;
               break;
            case 110:
               var10000 = 245;
               break;
            case 111:
               var10000 = 198;
               break;
            case 112:
               var10000 = 176;
               break;
            case 113:
               var10000 = 169;
               break;
            case 114:
               var10000 = 205;
               break;
            case 115:
               var10000 = 157;
               break;
            case 116:
               var10000 = 246;
               break;
            case 117:
               var10000 = 110;
               break;
            case 118:
               var10000 = 209;
               break;
            case 119:
               var10000 = 194;
               break;
            case 120:
               var10000 = 73;
               break;
            case 121:
               var10000 = 42;
               break;
            case 122:
               var10000 = 58;
               break;
            case 123:
               var10000 = 123;
               break;
            case 124:
               var10000 = 108;
               break;
            case 125:
               var10000 = 153;
               break;
            case 126:
               var10000 = 93;
               break;
            case 127:
               var10000 = 84;
               break;
            case 128:
               var10000 = 213;
               break;
            case 129:
               var10000 = 12;
               break;
            case 130:
               var10000 = 128;
               break;
            case 131:
               var10000 = 98;
               break;
            case 132:
               var10000 = 66;
               break;
            case 133:
               var10000 = 175;
               break;
            case 134:
               var10000 = 134;
               break;
            case 135:
               var10000 = 38;
               break;
            case 136:
               var10000 = 241;
               break;
            case 137:
               var10000 = 148;
               break;
            case 138:
               var10000 = 199;
               break;
            case 139:
               var10000 = 35;
               break;
            case 140:
               var10000 = 208;
               break;
            case 141:
               var10000 = 252;
               break;
            case 142:
               var10000 = 225;
               break;
            case 143:
               var10000 = 186;
               break;
            case 144:
               var10000 = 159;
               break;
            case 145:
               var10000 = 141;
               break;
            case 146:
               var10000 = 29;
               break;
            case 147:
               var10000 = 0;
               break;
            case 148:
               var10000 = 182;
               break;
            case 149:
               var10000 = 83;
               break;
            case 150:
               var10000 = 240;
               break;
            case 151:
               var10000 = 13;
               break;
            case 152:
               var10000 = 204;
               break;
            case 153:
               var10000 = 200;
               break;
            case 154:
               var10000 = 150;
               break;
            case 155:
               var10000 = 124;
               break;
            case 156:
               var10000 = 71;
               break;
            case 157:
               var10000 = 57;
               break;
            case 158:
               var10000 = 242;
               break;
            case 159:
               var10000 = 55;
               break;
            case 160:
               var10000 = 116;
               break;
            case 161:
               var10000 = 202;
               break;
            case 162:
               var10000 = 2;
               break;
            case 163:
               var10000 = 143;
               break;
            case 164:
               var10000 = 118;
               break;
            case 165:
               var10000 = 127;
               break;
            case 166:
               var10000 = 47;
               break;
            case 167:
               var10000 = 203;
               break;
            case 168:
               var10000 = 105;
               break;
            case 169:
               var10000 = 190;
               break;
            case 170:
               var10000 = 28;
               break;
            case 171:
               var10000 = 37;
               break;
            case 172:
               var10000 = 228;
               break;
            case 173:
               var10000 = 173;
               break;
            case 174:
               var10000 = 86;
               break;
            case 175:
               var10000 = 51;
               break;
            case 176:
               var10000 = 96;
               break;
            case 177:
               var10000 = 92;
               break;
            case 178:
               var10000 = 243;
               break;
            case 179:
               var10000 = 211;
               break;
            case 180:
               var10000 = 90;
               break;
            case 181:
               var10000 = 54;
               break;
            case 182:
               var10000 = 114;
               break;
            case 183:
               var10000 = 115;
               break;
            case 184:
               var10000 = 132;
               break;
            case 185:
               var10000 = 131;
               break;
            case 186:
               var10000 = 65;
               break;
            case 187:
               var10000 = 171;
               break;
            case 188:
               var10000 = 26;
               break;
            case 189:
               var10000 = 197;
               break;
            case 190:
               var10000 = 250;
               break;
            case 191:
               var10000 = 33;
               break;
            case 192:
               var10000 = 63;
               break;
            case 193:
               var10000 = 146;
               break;
            case 194:
               var10000 = 207;
               break;
            case 195:
               var10000 = 179;
               break;
            case 196:
               var10000 = 100;
               break;
            case 197:
               var10000 = 185;
               break;
            case 198:
               var10000 = 232;
               break;
            case 199:
               var10000 = 210;
               break;
            case 200:
               var10000 = 17;
               break;
            case 201:
               var10000 = 25;
               break;
            case 202:
               var10000 = 144;
               break;
            case 203:
               var10000 = 31;
               break;
            case 204:
               var10000 = 163;
               break;
            case 205:
               var10000 = 201;
               break;
            case 206:
               var10000 = 233;
               break;
            case 207:
               var10000 = 102;
               break;
            case 208:
               var10000 = 22;
               break;
            case 209:
               var10000 = 229;
               break;
            case 210:
               var10000 = 11;
               break;
            case 211:
               var10000 = 234;
               break;
            case 212:
               var10000 = 59;
               break;
            case 213:
               var10000 = 189;
               break;
            case 214:
               var10000 = 222;
               break;
            case 215:
               var10000 = 255;
               break;
            case 216:
               var10000 = 154;
               break;
            case 217:
               var10000 = 20;
               break;
            case 218:
               var10000 = 221;
               break;
            case 219:
               var10000 = 152;
               break;
            case 220:
               var10000 = 251;
               break;
            case 221:
               var10000 = 161;
               break;
            case 222:
               var10000 = 109;
               break;
            case 223:
               var10000 = 167;
               break;
            case 224:
               var10000 = 184;
               break;
            case 225:
               var10000 = 121;
               break;
            case 226:
               var10000 = 30;
               break;
            case 227:
               var10000 = 24;
               break;
            case 228:
               var10000 = 193;
               break;
            case 229:
               var10000 = 104;
               break;
            case 230:
               var10000 = 75;
               break;
            case 231:
               var10000 = 79;
               break;
            case 232:
               var10000 = 133;
               break;
            case 233:
               var10000 = 5;
               break;
            case 234:
               var10000 = 117;
               break;
            case 235:
               var10000 = 113;
               break;
            case 236:
               var10000 = 149;
               break;
            case 237:
               var10000 = 122;
               break;
            case 238:
               var10000 = 172;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 18;
               break;
            case 241:
               var10000 = 196;
               break;
            case 242:
               var10000 = 9;
               break;
            case 243:
               var10000 = 49;
               break;
            case 244:
               var10000 = 99;
               break;
            case 245:
               var10000 = 120;
               break;
            case 246:
               var10000 = 129;
               break;
            case 247:
               var10000 = 160;
               break;
            case 248:
               var10000 = 74;
               break;
            case 249:
               var10000 = 191;
               break;
            case 250:
               var10000 = 236;
               break;
            case 251:
               var10000 = 239;
               break;
            case 252:
               var10000 = 142;
               break;
            case 253:
               var10000 = 62;
               break;
            case 254:
               var10000 = 180;
               break;
            default:
               var10000 = 4;
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

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "f\f®\u001bçq¯{½\u0083W\"±Ú\u0013lìÁ\u0095\u0010\u0014\u0093Y\u0010±0$UÑâÖ¼\u0088Ì\u008f¼Æ\u0019\u0094+º";
      int var4 = "f\f®\u001bçq¯{½\u0083W\"±Ú\u0013lìÁ\u0095\u0010\u0014\u0093Y\u0010±0$UÑâÖ¼\u0088Ì\u008f¼Æ\u0019\u0094+º".length();
      char var1 = 20;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 94;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 46;
                        break;
                     case 1:
                        var46 = 76;
                        break;
                     case 2:
                        var46 = 80;
                        break;
                     case 3:
                        var46 = 116;
                        break;
                     case 4:
                        var46 = 2;
                        break;
                     case 5:
                        var46 = 25;
                        break;
                     default:
                        var46 = 97;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     ab = var5;
                     bb = new String[4];
                     U = new BasicStroke(3.0F);
                     v = new Rectangle();
                     r = new Rectangle();
                     Y = new Rectangle();
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "fâË\u00ad\u0006¹eÛÄÑ¯";
                  var4 = "fâË\u00ad\u0006¹eÛÄÑ¯".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 61;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





