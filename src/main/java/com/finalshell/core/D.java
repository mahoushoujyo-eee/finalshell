package com.finalshell.core;

import com.finalshell.ui.panel.K22;
import com.finalshell.ui.panel.Ky4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRootPaneUI;

public class D extends BasicRootPaneUI implements SwingConstants {
   public static ImageIcon U;
   public static ImageIcon m;
   public static ImageIcon i;
   public static ImageIcon w;
   public static ImageIcon K;
   public static ImageIcon H;
   public static ImageIcon o;
   public static ImageIcon Z;
   public Color R;
   public Color J;
   public Color r;
   public Color v;
   public int X;
   public int I;
   public int Y;
   public Insets T;
   public boolean G;
   public ImageIcon a;
   public int z;
   public String s;
   public boolean f;
   public boolean t;
   public boolean p;
   public boolean q;
   public boolean g;
   public boolean k;
   public boolean Q;
   public boolean C;
   public boolean F;
   public boolean M;
   public JRootPane N;
   public Window x;
   public Frame P;
   public Dialog j;
   public int B;
   public LayoutManager E;
   public LayoutManager h;
   public WindowFocusListener y;
   public PropertyChangeListener D;
   public PropertyChangeListener u;
   public WindowStateListener n;
   public JComponent V;
   public K22 S;
   public com.finalshell.ui.panel.M2 A;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public D() {
      com.finalshell.ui.dialog.Y2.M$arrint();
      this.R = C2_2.G;
      this.J = C2_2.Y;
      this.r = C2_2.X;
      this.v = C2_2.p;
      this.X = C2_2.i;
      this.I = C2_2.V;
      this.Y = C2_2.e;
      this.T = C2_2.h;
      this.G = C2_2.W;
      this.a = C2_2.K;
      this.z = C2_2.I;
      this.s = a(-27687, 2326);
      this.f = C2_2.M;
      this.t = C2_2.Q;
      this.p = C2_2.z;
      this.q = C2_2.u;
      this.g = C2_2.A;
      this.k = C2_2.o;
      this.Q = C2_2.g;
      this.C = C2_2.R;
      this.F = C2_2.U;
      this.M = false;
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.dialog.Y2.s(new int[5]);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new D();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.N = (JRootPane)var1;
      FN.Y(this.N);
      this.N.setBackground(GO.R);
      this.N();
   }

   @Override
   public void uninstallUI(JComponent var1) {
      super.uninstallUI(var1);
      this.d$void();
      this.E = null;
      this.N = null;
   }

   public boolean r$boolean() {
      return this.M;
   }

   public Color q$Color() {
      return this.R;
   }

   public void R(Color var1) {
      this.R = var1;
      this.N.repaint();
   }

   public Color V() {
      return this.J;
   }

   public void k(Color var1) {
      this.J = var1;
      this.N.repaint();
   }

   public Color s$Color() {
      return this.r;
   }

   public void h(Color var1) {
      this.r = var1;
      this.N.repaint();
   }

   public Color t$Color() {
      return this.v;
   }

   public void D(Color var1) {
      this.v = var1;
      this.N.repaint();
   }

   public int x() {
      return this.X;
   }

   public void f(int var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      int var3 = var1 - this.X;
      this.X = var1;
      var2 = var10000;
      D var5 = this;
      if (var2 != null) {
         if (!this.M) {
            return;
         }

         var5 = this;
      }

      Window var6 = var5.x;
      if (var2 != null) {
         if (var5.x == null) {
            return;
         }

         var6 = this.x;
      }

      Rectangle var4 = var6.getBounds();
      this.x.setBounds(var4.x - var3, var4.y - var3, var4.width + var3 * 2, var4.height + var3 * 2);
      this.R$void();
      this.N.revalidate();
      this.N.repaint();
   }

   public int d$int() {
      return this.I;
   }

   public void b(int var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.I = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.M) {
            return;
         }

         this.R$void();
         this.N.revalidate();
         var3 = this;
      }

      var3.N.repaint();
   }

   public int u$int() {
      return this.Y;
   }

   public void Q(int var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.Y = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.M) {
            return;
         }

         this.n();
         this.N.revalidate();
         var3 = this;
      }

      var3.N.repaint();
   }

   public Insets M$Insets() {
      return this.T;
   }

   public void I(Insets var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.T = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.M) {
            return;
         }

         this.R$void();
         this.N.revalidate();
         var3 = this;
      }

      var3.N.repaint();
   }

   public boolean C() {
      return this.G;
   }

   public void H(boolean var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.G = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.M) {
            return;
         }

         var3 = this;
      }

      var3.N.repaint();
   }

   public ImageIcon l() {
      D var2;
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      ImageIcon var10000 = this.a;
      if (var1 != null) {
         label17: {
            if (this.a == null) {
               var2 = this;
               if (var1 == null) {
                  break label17;
               }

               if (this.G) {
                  this.a = new ImageIcon(D.class.getResource(a(-27698, -7189)));
               }
            }

            var2 = this;
         }

         var10000 = var2.a;
      }

      return var10000;
   }

   public void g(ImageIcon var1) {
      this.a = var1;
   }

   public int R$int() {
      return this.z;
   }

   public void q(int var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.z = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.r$boolean()) {
            return;
         }

         var3 = this;
      }

      JComponent var4 = var3.V;
      if (var2 != null) {
         if (var3.V == null) {
            return;
         }

         this.V.revalidate();
         var4 = this.V;
      }

      var4.repaint();
   }

   public String D() {
      return this.s;
   }

   public void S(String var1) {
      int[] var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.s = var1;
      var2 = var10000;
      D var3 = this;
      if (var2 != null) {
         if (!this.r$boolean()) {
            return;
         }

         var3 = this;
      }

      JComponent var4 = var3.V;
      if (var2 != null) {
         if (var3.V == null) {
            return;
         }

         this.V.revalidate();
         var4 = this.V;
      }

      var4.repaint();
   }

   public JComponent R$JComponent() {
      return this.V;
   }

   public void B(JComponent var1) {
      this.V = var1;
      this.N.revalidate();
   }

   public K22 M$k2_2() {
      return this.S;
   }

   public com.finalshell.ui.panel.M2 F() {
      return this.A;
   }

   public boolean i$boolean() {
      return this.F;
   }

   public void m(boolean var1) {
      this.F = var1;
      this.N.revalidate();
   }

   public boolean A$boolean() {
      return this.f;
   }

   public void V(boolean var1) {
      this.f = var1;
      this.N.revalidate();
   }

   public boolean y() {
      return this.p;
   }

   public void r(boolean var1) {
      this.p = var1;
      this.N.revalidate();
   }

   public boolean k$boolean() {
      return this.q;
   }

   public void v(boolean var1) {
      this.q = var1;
      this.Z$void();
      this.N.revalidate();
   }

   public boolean t$boolean() {
      return this.g;
   }

   public void L(boolean var1) {
      this.g = var1;
      this.Z$void();
      this.N.revalidate();
   }

   public boolean w() {
      return this.k;
   }

   public void E(boolean var1) {
      this.k = var1;
      this.Z$void();
      this.N.revalidate();
   }

   public boolean v() {
      return this.Q;
   }

   public void f(boolean var1) {
      this.Q = var1;
      this.Z$void();
      this.N.revalidate();
      this.N.repaint();
   }

   public boolean z() {
      return this.C;
   }

   public void O(boolean var1) {
      this.C = var1;
      this.Z$void();
      this.N.revalidate();
      this.N.repaint();
   }

   public boolean s$boolean() {
      return this.t;
   }

   public void C(boolean var1) {
      this.t = var1;
      this.N.revalidate();
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var2;
      D var7;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      super.propertyChange(var1);
      var2 = var10000;
      String var3 = var1.getPropertyName();
      var10000 = (int[])var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var10000 = (int[])var3;
      }

      if (var2 != null) {
         if (!var10000.equals(a(-27694, 18487))) {
            return;
         }

         var10000 = (int[])var1.getSource();
      }

      JRootPane var4 = (JRootPane)var10000;
      int var5 = var4.getWindowDecorationStyle();
      var7 = this;
      if (var2 != null) {
         this.d$void();
         if (var5 == 0) {
            return;
         }

         var7 = this;
      }

      var7.N();
   }

   public void N() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (this.N.getWindowDecorationStyle() == 0) {
            return;
         }

         var10000 = this;
      }

      Window var2;
      label40: {
         JRootPane var10001 = this.N;
         if (var1 != null) {
            if (this.N == null) {
               var2 = null;
               break label40;
            }

            var10001 = this.N;
         }

         var2 = FN.L(var10001);
      }

      label34: {
         var10000.x = var2;
         var2 = this.x;
         if (var1 != null) {
            if (!(this.x instanceof Frame)) {
               var2 = null;
               break label34;
            }

            var2 = this.x;
         }

         var2 = (Frame)var2;
      }

      label28: {
         this.P = var2;
         var2 = this.x;
         if (var1 != null) {
            if (!(this.x instanceof Dialog)) {
               var2 = null;
               break label28;
            }

            var2 = this.x;
         }

         var2 = (Dialog)var2;
      }

      this.j = var2;
      this.f$void();
      this.O();
      this.X();
      this.R$void();
      this.b();
      this.j$void();
      this.M = true;
   }

   public void d$void() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (!this.M) {
            return;
         }

         this.q$void();
         this.A$void();
         this.r$void();
         this.m();
         this.T();
         this.h();
         this.x = null;
         this.P = null;
         this.j = null;
         var10000 = this;
      }

      var10000.M = false;
   }

   public void f$void() {
   }

   public void q$void() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (!this.u$boolean()) {
            return;
         }

         var10000 = this;
      }

      var10000.P.setMaximizedBounds(null);
   }

   public void O() {
      D var2;
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.y = new B_2(this);
      int[] var1 = var10000;
      this.x.addWindowFocusListener(this.y);
      this.D = new com.finalshell.ui.listener.N(this);
      this.x.addPropertyChangeListener(a(-27684, -27584), this.D);
      this.x.addPropertyChangeListener(a(-27685, 9307), this.D);
      this.u = new com.finalshell.ui.listener.Y3(this);
      this.x.addPropertyChangeListener(a(-27702, 23514), this.u);
      var2 = this;
      if (var1 != null) {
         if (!this.u$boolean()) {
            return;
         }

         this.B = this.P.getState();
         this.n = new H(this);
         var2 = this;
      }

      var2.x.addWindowStateListener(this.n);
   }

   public void A$void() {
      D var2;
      this.x.removeWindowFocusListener(this.y);
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      this.x.removePropertyChangeListener(a(-27695, 7361), this.D);
      this.x.removePropertyChangeListener(a(-27682, 9191), this.D);
      this.x.removePropertyChangeListener(a(-27701, 20287), this.u);
      int[] var1 = var10000;
      var2 = this;
      if (var1 != null) {
         if (!this.u$boolean()) {
            return;
         }

         var2 = this;
      }

      var2.x.removeWindowStateListener(this.n);
   }

   public void X() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      if (var1 != null) {
         if (!Xk2.R()) {
            return;
         }

         this.N.setOpaque(false);
      }

      Xk2.Z(this.x, false);
   }

   public void r$void() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      if (var1 != null) {
         if (!Xk2.R()) {
            return;
         }

         this.N.setOpaque(true);
      }

      Xk2.Z(this.x, true);
   }

   public void R$void() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (!this.j$boolean()) {
            this.N
               .setBorder(
                  BorderFactory.createEmptyBorder(this.X + 1 + this.T.top, this.X + 1 + this.T.left, this.X + 1 + this.T.bottom, this.X + 1 + this.T.right)
               );
            if (var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.N.setBorder(BorderFactory.createEmptyBorder(1 + this.T.top, 1 + this.T.left, 1 + this.T.bottom, 1 + this.T.right));
   }

   public void m() {
      this.N.setBorder(null);
   }

   public void b() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (this.E == null) {
            this.E = new P();
         }

         this.h = this.N.getLayout();
         var10000 = this;
      }

      var10000.N.setLayout(this.E);
   }

   public void T() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (this.h == null) {
            return;
         }

         this.N.setLayout(this.h);
         var10000 = this;
      }

      var10000.h = null;
   }

   public void j$void() {
      this.V = this.I();
      this.N.add(this.V);
      this.Z$void();
      this.A = new com.finalshell.ui.panel.M2();
      this.N.add(this.A);
   }

   public JComponent I() {
      com.finalshell.ui.panel.V var2;
      com.finalshell.ui.panel.W var1 = new com.finalshell.ui.panel.W(this);
      var2 = new com.finalshell.ui.panel.V(this);
      var2.D(true);
      var2.setHorizontalAlignment(0);
      var2.addComponentListener(new com.finalshell.ui.listener.O2(this, var2));
      FN.O(var2, a(11453, 943208823448200609L));
      Ky4 var3 = new Ky4(new BorderLayout(5, 0));
      var3.setOpaque(false);
      var3.N(4, 5, 4, a(14706, 251982342018134122L));
      var3.add(var1, a(-27688, 24915));
      var3.add(var2, a(-27696, 635));
      com.finalshell.ui.listener.L2 var4 = new com.finalshell.ui.listener.L2(this);
      var3.addMouseListener(var4);
      var3.addMouseMotionListener(var4);
      return var3;
   }

   public void Z$void() {
      boolean var2;
      boolean var7;
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (this.S != null) {
            this.N.remove(this.S);
         }

         var10000 = this;
      }

      JComponent[] var3;
      var2 = var10000.u$boolean();
      var3 = new JComponent[3];
      var7 = this.q;
      label53:
      if (var1 != null) {
         if (this.q) {
            var7 = var2;
            if (var1 == null) {
               break label53;
            }

            if (var2) {
               KD var4 = new KD(U);
               var4.setName(a(-27692, -28005));
               var4.setRolloverIcon(m);
               var4.setFocusable(false);
               var4.addActionListener(new com.finalshell.ui.listener.U3(this));
               var3[0] = var4;
            }
         }

         var7 = this.g;
      }

      label57: {
         label45:
         if (var1 != null) {
            if (var7) {
               var7 = this.f$boolean();
               if (var1 == null) {
                  break label45;
               }

               if (var7) {
                  var7 = var2;
                  if (var1 == null) {
                     break label45;
                  }

                  if (var2) {
                     T var5 = new T(this, i);
                     var5.setName(a(-27700, 9954));
                     var5.setRolloverIcon(w);
                     var5.setFocusable(false);
                     var5.addActionListener(new com.finalshell.ui.listener.V_2(this));
                     var3[1] = var5;
                  }
               }
            }

            var10000 = this;
            if (var1 == null) {
               break label57;
            }

            var7 = this.k;
         }

         if (var7) {
            KD var6 = new KD(o);
            var6.setName(a(-27686, 18636));
            var6.setRolloverIcon(Z);
            var6.setFocusable(false);
            var6.addActionListener(new com.finalshell.ui.listener.X(this));
            var3[2] = var6;
         }

         this.S = new com.finalshell.ui.panel.J(this, var3);
         this.n();
         var10000 = this;
      }

      var10000.N.add(this.S);
   }

   public void n() {
      D var2;
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      K22 var10000 = this.S;
      if (var1 != null) {
         if (this.S == null) {
            return;
         }

         this.S.E(false);
         this.S.J(C2_2.T);
         this.S.r$void(this.Y);
         var10000 = this.S;
      }

      var10000.I(C2_2.b);
      var2 = this;
      if (var1 != null) {
         if (!this.C) {
            return;
         }

         this.S.i(false);
         var2 = this;
      }

      int var10001 = this.Y;
      if (var1 != null) {
         var10001 = this.Y > 0 ? 1 : 0;
      }

      var2.S.P(var10001);
   }

   public void h() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var1 != null) {
         if (this.V != null) {
            this.N.remove(this.V);
            this.V = null;
         }

         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.S != null) {
            this.N.remove(this.S);
            this.S = null;
         }

         var10000 = this;
      }

      if (var1 != null) {
         if (var10000.A == null) {
            return;
         }

         this.N.remove(this.A);
         var10000 = this;
      }

      var10000.A = null;
   }

   public String i$String() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      boolean var10000 = this.Z$boolean();
      if (var1 != null) {
         if (var10000) {
            return this.j.getTitle();
         }

         if (var1 == null) {
            return this.P.getTitle();
         }

         var10000 = this.u$boolean();
      }

      return !var10000 ? null : this.P.getTitle();
   }

   public ImageIcon k$ImageIcon() {
      List var2;
      List var7;
      int[] var1;
      label67: {
         var1 = com.finalshell.ui.dialog.Y2.M$arrint();
         Window var10000 = this.x;
         if (var1 != null) {
            if (this.x == null) {
               var7 = null;
               break label67;
            }

            var10000 = this.x;
         }

         var7 = var10000.getIconImages();
      }

      var2 = var7;
      var7 = var2;
      label61:
      if (var1 != null) {
         if (var2 != null) {
            var7 = var2;
            if (var1 == null) {
               break label61;
            }

            if (var2.size() > 1) {
               int var3 = 0;
               int var4 = Math.abs(((Image)var2.get(var3)).getWidth(null) - a(28489, 1625212319596226132L));
               int var5 = 1;

               while (var5 < var2.size()) {
                  int var9 = var4;
                  if (var1 != null) {
                     if (var4 == 0 && var1 != null) {
                        break;
                     }

                     var9 = Math.abs(((Image)var2.get(var5)).getWidth(null) - a(16986, 928103912585202500L));
                  }

                  int var6 = var9;
                  if (var1 != null) {
                     if (var6 < var4) {
                        var3 = var5;
                        var4 = var6;
                     }

                     var5++;
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               return this.Y((Image)var2.get(var3));
            }
         }

         var7 = var2;
      }

      if (var1 != null) {
         if (var7 == null) {
            return new ImageIcon();
         }

         var7 = var2;
      }

      return var7.size() == 1 ? this.Y((Image)var2.get(0)) : new ImageIcon();
   }

   public ImageIcon Y(Image var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      Image var10000 = var1;
      if (var2 != null) {
         if (var1.getWidth(null) <= a(16986, 928103912585202500L)) {
            return new ImageIcon(var1);
         }

         var10000 = var1;
      }

      return Xg2.T(var10000, a(16986, 928103912585202500L));
   }

   public void Q() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      Window var10000 = this.x;
      if (var1 != null) {
         if (this.x == null) {
            return;
         }

         var10000 = this.x;
      }

      var10000.dispatchEvent(new WindowEvent(this.x, a(16848, 4512645558544861387L)));
   }

   public void U() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      Frame var10000 = this.P;
      if (var1 != null) {
         if (this.P == null) {
            return;
         }

         var10000 = this.P;
      }

      var10000.setExtendedState(1);
   }

   public void p() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      Frame var10000 = this.P;
      if (var1 != null) {
         if (this.P == null) {
            return;
         }

         var10000 = this.P;
      }

      GraphicsConfiguration var2 = var10000.getGraphicsConfiguration().getDevice().getDefaultConfiguration();
      this.P.setMaximizedBounds(Wx2.F(var2, true));
      this.P.setExtendedState(a(31005, 2934375978528878596L));
   }

   public void J() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      Frame var10000 = this.P;
      if (var1 != null) {
         if (this.P == null) {
            return;
         }

         var10000 = this.P;
      }

      var10000.setExtendedState(0);
   }

   public boolean f$boolean() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      boolean var10000 = this.Z$boolean();
      if (var1 != null) {
         if (var10000) {
            return this.j.isResizable();
         }

         var10000 = this.u$boolean();
      }

      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.P.isResizable();
      }

      return var1 == null ? var10000 : var10000;
   }

   public boolean u$boolean() {
      return this.P != null;
   }

   public boolean j$boolean() {
      int[] var1 = com.finalshell.ui.dialog.Y2.M$arrint();
      int var10000 = (this.u$boolean()) ? 1 : 0;
      if (var1 != null) {
         if (var10000 == 0) {
            return 0 != 0;
         }

         var10000 = this.B;
      }

      if (var1 == null) {
         return var10000 != 0;
      } else {
         return (boolean)((var10000 == a(2628, 5593412264602878814L) ? 1 : 0) != 0);
      }
   }

   public boolean Z$boolean() {
      return this.j != null;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int var12;
      int[] var3 = com.finalshell.ui.dialog.Y2.M$arrint();
      if (this.M) {
         Graphics2D var10;
         Object var10001;
         label55: {
            Object var5;
            label54: {
               Graphics2D var4;
               label63: {
                  var4 = (Graphics2D)var1;
                  var5 = RV.X(var4);
                  byte var6 = (byte)((this.j$boolean()) ? 1 : 0);
                  int var10000 = var6;
                  if (var3 != null) {
                     if (var6 != 0) {
                        var4.setPaint(new GradientPaint(0.0F, 0.0F, this.R, 0.0F, 30.0F, this.J));
                        var4.fillRect(0, 0, var2.getWidth(), var2.getHeight());
                        var4.setPaint(this.r);
                        var4.drawRect(0, 0, var2.getWidth() - 1, var2.getHeight() - 1);
                        var4.setPaint(this.v);
                        var10 = var4;
                        if (var3 == null) {
                           break label54;
                        }

                        var4.drawRect(1, 1, var2.getWidth() - 3, var2.getHeight() - 3);
                        if (!this.G) {
                           break label63;
                        }

                        Shape var7 = RV.n(var4, this.Z(var2));
                        var4.drawImage(this.l().getImage(), 2, 2, null);
                        RV.w(var4, var7);
                        if (var3 != null) {
                           break label63;
                        }
                     }

                     var10000 = this.X;
                  }

                  if (var3 != null) {
                     if (var10000 > 0) {
                        label39: {
                           int var11 = (this.x(var2)) ? 1 : 0;
                           if (var3 != null) {
                              if (var11 != 0) {
                                 var12 = 0;
                                 break label39;
                              }

                              var11 = this.X;
                           }

                           var12 = var11 - this.I;
                        }

                        int var8 = var12;
                        this.q(var2).l(var4, var8, var8, var2.getWidth() - var8 * 2, var2.getHeight() - var8 * 2);
                     }

                     var4.setPaint(new GradientPaint(0.0F, (float)this.X, this.R, 0.0F, (float)(this.X + a(19612, 5294271776300074371L)), this.J));
                     var4.fillRoundRect(this.X, this.X, var2.getWidth() - this.X * 2, var2.getHeight() - this.X * 2, this.Y * 2, this.Y * 2);
                     var4.setPaint(this.r);
                     var4.drawRoundRect(this.X, this.X, var2.getWidth() - this.X * 2 - 1, var2.getHeight() - this.X * 2 - 1, this.Y * 2 - 2, this.Y * 2 - 2);
                     var4.setPaint(this.v);
                     var10 = var4;
                     var10001 = this;
                     if (var3 == null) {
                        break label55;
                     }

                     var4.drawRoundRect(
                        this.X + 1, this.X + 1, var2.getWidth() - this.X * 2 - 3, var2.getHeight() - this.X * 2 - 3, this.Y * 2 - 4, this.Y * 2 - 4
                     );
                     var10000 = (this.G) ? 1 : 0;
                  }

                  if (var10000 != 0) {
                     Shape var9 = RV.n(var4, this.Z(var2));
                     var4.drawImage(this.l().getImage(), this.X + 2, this.X + 2, null);
                     RV.w(var4, var9);
                  }
               }

               var10 = var4;
            }

            var10001 = var5;
         }

         RV.X(var10, var10001);
      }
   }

   public Double Z(JComponent var1) {
      return new Double(
         (double)(this.X + 2),
         (double)(this.X + 2),
         (double)(var1.getWidth() - this.X * 2 - 3),
         (double)(var1.getHeight() - this.X * 2 - 3),
         (double)(this.Y * 2 - 4),
         (double)(this.Y * 2 - 4)
      );
   }

   public PF3 q(JComponent var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      int var10000 = this.X;
      if (var2 != null) {
         if (this.X <= 0) {
            return null;
         }

         var10000 = this.H(var1);
      }

      return Fk2.I(var10000, this.Y, 0.8F);
   }

   public int H(JComponent var1) {
      int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
      D var10000 = this;
      if (var2 != null) {
         if (this.x(var1)) {
            return this.X;
         }

         var10000 = this;
      }

      return var10000.I;
   }

   public boolean x(JComponent var1) {
      return FN.L(var1).isFocused();
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -27682) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 6;
               break;
            case 1:
               var10000 = 174;
               break;
            case 2:
               var10000 = 214;
               break;
            case 3:
               var10000 = 159;
               break;
            case 4:
               var10000 = 179;
               break;
            case 5:
               var10000 = 233;
               break;
            case 6:
               var10000 = 110;
               break;
            case 7:
               var10000 = 83;
               break;
            case 8:
               var10000 = 5;
               break;
            case 9:
               var10000 = 158;
               break;
            case 10:
               var10000 = 123;
               break;
            case 11:
               var10000 = 19;
               break;
            case 12:
               var10000 = 58;
               break;
            case 13:
               var10000 = 118;
               break;
            case 14:
               var10000 = 38;
               break;
            case 15:
               var10000 = 183;
               break;
            case 16:
               var10000 = 15;
               break;
            case 17:
               var10000 = 148;
               break;
            case 18:
               var10000 = 242;
               break;
            case 19:
               var10000 = 8;
               break;
            case 20:
               var10000 = 203;
               break;
            case 21:
               var10000 = 61;
               break;
            case 22:
               var10000 = 193;
               break;
            case 23:
               var10000 = 74;
               break;
            case 24:
               var10000 = 145;
               break;
            case 25:
               var10000 = 52;
               break;
            case 26:
               var10000 = 173;
               break;
            case 27:
               var10000 = 164;
               break;
            case 28:
               var10000 = 154;
               break;
            case 29:
               var10000 = 234;
               break;
            case 30:
               var10000 = 207;
               break;
            case 31:
               var10000 = 11;
               break;
            case 32:
               var10000 = 100;
               break;
            case 33:
               var10000 = 240;
               break;
            case 34:
               var10000 = 76;
               break;
            case 35:
               var10000 = 70;
               break;
            case 36:
               var10000 = 92;
               break;
            case 37:
               var10000 = 78;
               break;
            case 38:
               var10000 = 157;
               break;
            case 39:
               var10000 = 46;
               break;
            case 40:
               var10000 = 147;
               break;
            case 41:
               var10000 = 105;
               break;
            case 42:
               var10000 = 195;
               break;
            case 43:
               var10000 = 71;
               break;
            case 44:
               var10000 = 16;
               break;
            case 45:
               var10000 = 14;
               break;
            case 46:
               var10000 = 128;
               break;
            case 47:
               var10000 = 75;
               break;
            case 48:
               var10000 = 185;
               break;
            case 49:
               var10000 = 86;
               break;
            case 50:
               var10000 = 66;
               break;
            case 51:
               var10000 = 57;
               break;
            case 52:
               var10000 = 18;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 77;
               break;
            case 55:
               var10000 = 146;
               break;
            case 56:
               var10000 = 9;
               break;
            case 57:
               var10000 = 227;
               break;
            case 58:
               var10000 = 20;
               break;
            case 59:
               var10000 = 104;
               break;
            case 60:
               var10000 = 160;
               break;
            case 61:
               var10000 = 67;
               break;
            case 62:
               var10000 = 35;
               break;
            case 63:
               var10000 = 137;
               break;
            case 64:
               var10000 = 198;
               break;
            case 65:
               var10000 = 12;
               break;
            case 66:
               var10000 = 43;
               break;
            case 67:
               var10000 = 248;
               break;
            case 68:
               var10000 = 23;
               break;
            case 69:
               var10000 = 225;
               break;
            case 70:
               var10000 = 220;
               break;
            case 71:
               var10000 = 34;
               break;
            case 72:
               var10000 = 255;
               break;
            case 73:
               var10000 = 253;
               break;
            case 74:
               var10000 = 129;
               break;
            case 75:
               var10000 = 133;
               break;
            case 76:
               var10000 = 163;
               break;
            case 77:
               var10000 = 135;
               break;
            case 78:
               var10000 = 213;
               break;
            case 79:
               var10000 = 167;
               break;
            case 80:
               var10000 = 3;
               break;
            case 81:
               var10000 = 210;
               break;
            case 82:
               var10000 = 117;
               break;
            case 83:
               var10000 = 136;
               break;
            case 84:
               var10000 = 194;
               break;
            case 85:
               var10000 = 27;
               break;
            case 86:
               var10000 = 94;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 218;
               break;
            case 89:
               var10000 = 37;
               break;
            case 90:
               var10000 = 127;
               break;
            case 91:
               var10000 = 188;
               break;
            case 92:
               var10000 = 228;
               break;
            case 93:
               var10000 = 93;
               break;
            case 94:
               var10000 = 113;
               break;
            case 95:
               var10000 = 25;
               break;
            case 96:
               var10000 = 181;
               break;
            case 97:
               var10000 = 226;
               break;
            case 98:
               var10000 = 239;
               break;
            case 99:
               var10000 = 144;
               break;
            case 100:
               var10000 = 138;
               break;
            case 101:
               var10000 = 151;
               break;
            case 102:
               var10000 = 124;
               break;
            case 103:
               var10000 = 101;
               break;
            case 104:
               var10000 = 176;
               break;
            case 105:
               var10000 = 246;
               break;
            case 106:
               var10000 = 162;
               break;
            case 107:
               var10000 = 85;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 31;
               break;
            case 111:
               var10000 = 96;
               break;
            case 112:
               var10000 = 39;
               break;
            case 113:
               var10000 = 73;
               break;
            case 114:
               var10000 = 252;
               break;
            case 115:
               var10000 = 139;
               break;
            case 116:
               var10000 = 202;
               break;
            case 117:
               var10000 = 69;
               break;
            case 118:
               var10000 = 4;
               break;
            case 119:
               var10000 = 87;
               break;
            case 120:
               var10000 = 189;
               break;
            case 121:
               var10000 = 48;
               break;
            case 122:
               var10000 = 79;
               break;
            case 123:
               var10000 = 180;
               break;
            case 124:
               var10000 = 232;
               break;
            case 125:
               var10000 = 216;
               break;
            case 126:
               var10000 = 29;
               break;
            case 127:
               var10000 = 190;
               break;
            case 128:
               var10000 = 55;
               break;
            case 129:
               var10000 = 231;
               break;
            case 130:
               var10000 = 22;
               break;
            case 131:
               var10000 = 168;
               break;
            case 132:
               var10000 = 63;
               break;
            case 133:
               var10000 = 7;
               break;
            case 134:
               var10000 = 230;
               break;
            case 135:
               var10000 = 72;
               break;
            case 136:
               var10000 = 116;
               break;
            case 137:
               var10000 = 95;
               break;
            case 138:
               var10000 = 51;
               break;
            case 139:
               var10000 = 142;
               break;
            case 140:
               var10000 = 219;
               break;
            case 141:
               var10000 = 224;
               break;
            case 142:
               var10000 = 2;
               break;
            case 143:
               var10000 = 212;
               break;
            case 144:
               var10000 = 112;
               break;
            case 145:
               var10000 = 186;
               break;
            case 146:
               var10000 = 140;
               break;
            case 147:
               var10000 = 0;
               break;
            case 148:
               var10000 = 88;
               break;
            case 149:
               var10000 = 98;
               break;
            case 150:
               var10000 = 80;
               break;
            case 151:
               var10000 = 250;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 200;
               break;
            case 154:
               var10000 = 192;
               break;
            case 155:
               var10000 = 229;
               break;
            case 156:
               var10000 = 115;
               break;
            case 157:
               var10000 = 205;
               break;
            case 158:
               var10000 = 130;
               break;
            case 159:
               var10000 = 42;
               break;
            case 160:
               var10000 = 172;
               break;
            case 161:
               var10000 = 221;
               break;
            case 162:
               var10000 = 41;
               break;
            case 163:
               var10000 = 33;
               break;
            case 164:
               var10000 = 30;
               break;
            case 165:
               var10000 = 177;
               break;
            case 166:
               var10000 = 56;
               break;
            case 167:
               var10000 = 103;
               break;
            case 168:
               var10000 = 215;
               break;
            case 169:
               var10000 = 165;
               break;
            case 170:
               var10000 = 53;
               break;
            case 171:
               var10000 = 1;
               break;
            case 172:
               var10000 = 245;
               break;
            case 173:
               var10000 = 32;
               break;
            case 174:
               var10000 = 217;
               break;
            case 175:
               var10000 = 102;
               break;
            case 176:
               var10000 = 24;
               break;
            case 177:
               var10000 = 64;
               break;
            case 178:
               var10000 = 60;
               break;
            case 179:
               var10000 = 90;
               break;
            case 180:
               var10000 = 236;
               break;
            case 181:
               var10000 = 182;
               break;
            case 182:
               var10000 = 243;
               break;
            case 183:
               var10000 = 119;
               break;
            case 184:
               var10000 = 156;
               break;
            case 185:
               var10000 = 254;
               break;
            case 186:
               var10000 = 191;
               break;
            case 187:
               var10000 = 178;
               break;
            case 188:
               var10000 = 131;
               break;
            case 189:
               var10000 = 28;
               break;
            case 190:
               var10000 = 184;
               break;
            case 191:
               var10000 = 132;
               break;
            case 192:
               var10000 = 84;
               break;
            case 193:
               var10000 = 134;
               break;
            case 194:
               var10000 = 59;
               break;
            case 195:
               var10000 = 251;
               break;
            case 196:
               var10000 = 26;
               break;
            case 197:
               var10000 = 36;
               break;
            case 198:
               var10000 = 17;
               break;
            case 199:
               var10000 = 161;
               break;
            case 200:
               var10000 = 121;
               break;
            case 201:
               var10000 = 49;
               break;
            case 202:
               var10000 = 222;
               break;
            case 203:
               var10000 = 208;
               break;
            case 204:
               var10000 = 109;
               break;
            case 205:
               var10000 = 187;
               break;
            case 206:
               var10000 = 111;
               break;
            case 207:
               var10000 = 108;
               break;
            case 208:
               var10000 = 47;
               break;
            case 209:
               var10000 = 152;
               break;
            case 210:
               var10000 = 10;
               break;
            case 211:
               var10000 = 247;
               break;
            case 212:
               var10000 = 237;
               break;
            case 213:
               var10000 = 169;
               break;
            case 214:
               var10000 = 197;
               break;
            case 215:
               var10000 = 143;
               break;
            case 216:
               var10000 = 244;
               break;
            case 217:
               var10000 = 141;
               break;
            case 218:
               var10000 = 106;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 153;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 170;
               break;
            case 223:
               var10000 = 201;
               break;
            case 224:
               var10000 = 125;
               break;
            case 225:
               var10000 = 120;
               break;
            case 226:
               var10000 = 206;
               break;
            case 227:
               var10000 = 166;
               break;
            case 228:
               var10000 = 50;
               break;
            case 229:
               var10000 = 107;
               break;
            case 230:
               var10000 = 40;
               break;
            case 231:
               var10000 = 209;
               break;
            case 232:
               var10000 = 171;
               break;
            case 233:
               var10000 = 13;
               break;
            case 234:
               var10000 = 149;
               break;
            case 235:
               var10000 = 235;
               break;
            case 236:
               var10000 = 199;
               break;
            case 237:
               var10000 = 114;
               break;
            case 238:
               var10000 = 68;
               break;
            case 239:
               var10000 = 65;
               break;
            case 240:
               var10000 = 21;
               break;
            case 241:
               var10000 = 211;
               break;
            case 242:
               var10000 = 97;
               break;
            case 243:
               var10000 = 44;
               break;
            case 244:
               var10000 = 82;
               break;
            case 245:
               var10000 = 196;
               break;
            case 246:
               var10000 = 62;
               break;
            case 247:
               var10000 = 223;
               break;
            case 248:
               var10000 = 122;
               break;
            case 249:
               var10000 = 241;
               break;
            case 250:
               var10000 = 238;
               break;
            case 251:
               var10000 = 89;
               break;
            case 252:
               var10000 = 81;
               break;
            case 253:
               var10000 = 150;
               break;
            case 254:
               var10000 = 99;
               break;
            default:
               var10000 = 175;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18718;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var12;
      char[] var33;
      byte[] var7;
      String[] var13 = new String[22];
      int var11 = 0;
      String var10 = "¥\u009aý\t\u0098\u0016$-h¶D÷Rëû(êÿX\u008c\u0081&{\u0097Aæ\tv\t.6)ÕVÙo/\u0014\u000fpÆâË\u0015Xx\u001e¾\u0096BY\\\n!\u0005,É\"Ù\u001b\u0005Ëé0g!\u0006ø¯´!ön\u0003\u0018sÀ\u0011Ùþ×Ì³¸½\u000b)\u001b%SîÜ×Ï$\u0019²*ºV\u001eë\u0017m\u009dG\u000f}ö*\u0007<ðÌÀ¸\u009d2Û\u0004\u0010\bu\u001eÇ\u009c\u008e\u0013Ïð\u0012\u0011¦ÎÇ\u0090ÙÆ+§\u008fHd\u001e\tkI/B\u0015¨Á%jÐ\u007fx qu!õÁ>\u001e<Õ\"B\u007fß\u0018\u00961>5\u008e\u0087\u001aìÝç»Ì=^¼Íi\u00ad\u00199\u0011-v{\u0006\nñÃñ\u0006\u001b\tP\u009bæ`¯oPùó\u0013ó\u0097\u0092á\u001b\u001d\u00ad»\u0089\u0098Ë\u000f\u0089÷¤=%P\u0005\u0019\u0017b\u000e_\u0088ÊÅAÑËRì]\u0018rz^\u0004\u0015¡'\u0011\u008c`ú\b]ûÔ)8¥\u0019&\u0012\u0088åý¯öÔ\n\u0082(³mãºùÿW½\u0081";
      var12 = "¥\u009aý\t\u0098\u0016$-h¶D÷Rëû(êÿX\u008c\u0081&{\u0097Aæ\tv\t.6)ÕVÙo/\u0014\u000fpÆâË\u0015Xx\u001e¾\u0096BY\\\n!\u0005,É\"Ù\u001b\u0005Ëé0g!\u0006ø¯´!ön\u0003\u0018sÀ\u0011Ùþ×Ì³¸½\u000b)\u001b%SîÜ×Ï$\u0019²*ºV\u001eë\u0017m\u009dG\u000f}ö*\u0007<ðÌÀ¸\u009d2Û\u0004\u0010\bu\u001eÇ\u009c\u008e\u0013Ïð\u0012\u0011¦ÎÇ\u0090ÙÆ+§\u008fHd\u001e\tkI/B\u0015¨Á%jÐ\u007fx qu!õÁ>\u001e<Õ\"B\u007fß\u0018\u00961>5\u008e\u0087\u001aìÝç»Ì=^¼Íi\u00ad\u00199\u0011-v{\u0006\nñÃñ\u0006\u001b\tP\u009bæ`¯oPùó\u0013ó\u0097\u0092á\u001b\u001d\u00ad»\u0089\u0098Ë\u000f\u0089÷¤=%P\u0005\u0019\u0017b\u000e_\u0088ÊÅAÑËRì]\u0018rz^\u0004\u0015¡'\u0011\u008c`ú\b]ûÔ)8¥\u0019&\u0012\u0088åý¯öÔ\n\u0082(³mãºùÿW½\u0081";
         // [VF] .length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 92;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 11;
                        break;
                     case 1:
                        var65 = 109;
                        break;
                     case 2:
                        var65 = 113;
                        break;
                     case 3:
                        var65 = 8;
                        break;
                     case 4:
                        var65 = 65;
                        break;
                     case 5:
                        var65 = 123;
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
                     c = new String[22];
                     long var0 = 9018354052923249198L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0087Tx\u0096\u008f{Yz\u0016`\u008cµ\u008d\u008f×³q\\¼ô¡\u00957\u0082\u0011\u0002Wµ¥.ôji|\u009bt\u001eÆ\u0011vq/vÀ-~Z,";
                     int var5 = "\u0087Tx\u0096\u008f{Yz\u0016`\u008cµ\u008d\u008f×³q\\¼ô¡\u00957\u0082\u0011\u0002Wµ¥.ôji|\u009bt\u001eÆ\u0011vq/vÀ-~Z,"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
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
                                    d = var6;
                                    e = new Integer[8];
                                    U = new ImageIcon(D.class.getResource(a(-27691, -12277)));
                                    m = new ImageIcon(D.class.getResource(a(-27689, -7177)));
                                    i = new ImageIcon(D.class.getResource(a(-27699, -32641)));
                                    w = new ImageIcon(D.class.getResource(a(-27697, -2321)));
                                    K = new ImageIcon(D.class.getResource(a(-27690, -20759)));
                                    H = new ImageIcon(D.class.getResource(a(-27693, -5842)));
                                    o = new ImageIcon(D.class.getResource(a(-27683, -15748)));
                                    Z = new ImageIcon(D.class.getResource(a(-27681, 2725)));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u008b:N£6\u0098¢N²\u009a\u001ac\u001a\u0096â,";
                                 var5 = "\u008b:N£6\u0098¢N²\u009a\u001ac\u001a\u0096â,".length();
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

                  var10 = "Ö$=9\u0017À~å:\t<=`\u001a¼¤\u000bi\u0094";
                  var12 = ("Ö$=9\u0017À~å:\t<=`\u001a¼¤\u000bi\u0094".length()) != 0;
                  var9 = '\t';
                  var17 = -1;
            }

            var10000 = 118;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





