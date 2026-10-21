package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.C_q_2;
import com.finalshell.ui.listener.IP;
import com.finalshell.ui.listener.Ot4;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;

public class QH extends BasicTextFieldUI implements W2_3, SwingConstants, L0_2 {
   public JTextField u = null;
   public boolean M = Ee4.n;
   public boolean G = Ee4.X;
   public int r = Ee4.J;
   public boolean V = Ee4.k;
   public int A = Ee4.x;
   public boolean b = Ee4.u;
   public boolean h = Ee4.N;
   public Insets U = Ee4.W;
   public String Q = Ee4.h;
   public Font S = Ee4.K;
   public Color f = Ee4.j;
   public int a = Ee4.E;
   public boolean J = Ee4.S;
   public Og4 e = Ee4.l;
   public JComponent y = null;
   public JComponent K = null;
   public boolean t = false;
   public FocusListener C;
   public PropertyChangeListener j;
   public PropertyChangeListener L;
   public PropertyChangeListener Y;
   public ComponentAdapter k;
   public boolean O = true;
   public boolean F = false;
   public Color z = new Color(a(3872, 1008117158691340778L), a(19021, 6848781374362076294L), a(19021, 6848781374362076294L), a(28851, 5840628270621621885L));
   public static String[] c;
   public static String[] d;
   public static long[] i;
   public static Integer[] l;

   public boolean K() {
      return this.F;
   }

   public void v(boolean var1) {
      this.F = var1;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new QH();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.u = (JTextField)var1;
      FN.Y(this.u);
      LookAndFeel.installProperty(this.u, a(-26633, 482), Boolean.FALSE);
      this.u.putClientProperty(a(-26631, 24920), Boolean.valueOf(true));
      boolean var10000 = Ne4.m$boolean();
      this.u.setFocusable(true);
      this.u.setMargin(Ee4.Q);
      this.u.setBackground(Ee4.q);
      this.u.setSelectionColor(GO.F4);
      this.u.setForeground(Ee4.G);
      this.u.setSelectedTextColor(Ee4.i);
      this.u.setCaretColor(Ee4.p);
      this.u.setLayout(new TC(this.u));
      WO.t(this.u, this.e);
      this.h();
      this.C = new Ot4(this);
      this.u.addFocusListener(this.C);
      this.j = new IP(this);
      this.u.addPropertyChangeListener(a(-26628, -20360), this.j);
      this.L = new com.finalshell.ui.listener.Yl4(this);
      this.u.addPropertyChangeListener(a(-26625, 9945), this.L);
      this.Y = new C_q_2(this);
      this.u.addPropertyChangeListener(a(-26627, -24143), this.Y);
      this.k = new com.finalshell.ui.listener.Da4(this);
      boolean var2 = var10000;
      if (var2) {
         Ky4.K(new String[1]);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      WO.C(this.u, this.e);
      this.u.putClientProperty(a(-26636, 26545), null);
      this.u.removeFocusListener(this.C);
      this.u.removePropertyChangeListener(a(-26629, -29146), this.j);
      this.u.removePropertyChangeListener(a(-26630, -2551), this.L);
      this.u.removePropertyChangeListener(a(-26626, 18640), this.Y);
      this.B$void();
      this.W();
      this.u.setLayout(null);
      this.u = null;
      super.uninstallUI(var1);
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      boolean var10000 = Ne4.A$boolean();
      super.propertyChange(var1);
      boolean var2 = var10000;
      if (var2) {
         if (!var1.getPropertyName().equals(a(-26628, -20360))) {
            return;
         }

         FN.o(this.y, this.u.isEnabled());
      }

      FN.o(this.K, this.u.isEnabled());
   }

   public Shape B$Shape() {
      boolean var1 = Ne4.m$boolean();
      QH var10000 = this;
      if (!var1) {
         if (this.M) {
            return GA.X(this.u, this.A, this.r);
         }

         var10000 = this;
      }

      return FN.N(var10000.u);
   }

   public void J() {
      boolean var1 = Ne4.m$boolean();
      JComponent var10000 = this.y;
      if (!var1) {
         if (this.y != null) {
            this.y.setEnabled(this.u.isEnabled());
         }

         var10000 = this.K;
      }

      if (!var1) {
         if (var10000 == null) {
            return;
         }

         var10000 = this.K;
      }

      var10000.setEnabled(this.u.isEnabled());
   }

   public JComponent v() {
      return this.y;
   }

   public void o(JComponent var1) {
      boolean var2 = Ne4.A$boolean();
      JComponent var10000 = this.y;
      if (var2) {
         if (this.y == var1) {
            return;
         }

         this.B$void();
         if (!var2) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         this.y = var1;
         this.y.addComponentListener(this.k);
         this.u.add(var1, a(-26632, -7327));
         this.J();
      }

      this.u.revalidate();
      this.h();
   }

   public void B$void() {
      boolean var1 = Ne4.A$boolean();
      JComponent var10000 = this.y;
      if (var1) {
         if (this.y == null) {
            return;
         }

         var10000 = this.y;
      }

      var10000.removeComponentListener(this.k);
      this.u.remove(this.y);
      this.y = null;
   }

   public JComponent d() {
      return this.K;
   }

   public void z(JComponent var1) {
      boolean var2 = Ne4.A$boolean();
      JComponent var10000 = this.K;
      if (var2) {
         if (this.K == var1) {
            return;
         }

         this.W();
         if (!var2) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         this.K = var1;
         this.K.addComponentListener(this.k);
         this.u.add(var1, a(-26634, -9662));
         this.J();
      }

      this.u.revalidate();
      this.h();
   }

   public void W() {
      boolean var1 = Ne4.A$boolean();
      JComponent var10000 = this.K;
      if (var1) {
         if (this.K == null) {
            return;
         }

         var10000 = this.K;
      }

      var10000.removeComponentListener(this.k);
      this.u.remove(this.K);
      this.K = null;
   }

   public void T(Insets var1) {
      this.U = var1;
      this.h();
   }

   public Insets Z() {
      return this.U;
   }

   public String F() {
      return this.Q;
   }

   public void F(String var1) {
      boolean var3;
      label22: {
         label24: {
            boolean var10000 = Ne4.A$boolean();
            this.Q = var1;
            boolean var2 = var10000;
            String var10001 = var1;
            if (var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1.trim();
            }

            var3 = var10001.equals("");
            if (!var2) {
               break label22;
            }

            if (!var3) {
               var3 = true;
               break label22;
            }
         }

         var3 = false;
      }

      this.t = var3;
      this.Y();
   }

   public Font n() {
      return this.S;
   }

   public void B(Font var1) {
      this.S = var1;
      this.Y();
   }

   public Color u() {
      return this.f;
   }

   public void w(Color var1) {
      this.f = var1;
      this.Y();
   }

   public int O() {
      return this.a;
   }

   public void e(int var1) {
      this.a = var1;
      this.Y();
   }

   public boolean A() {
      return this.J;
   }

   public void k(boolean var1) {
      this.J = var1;
      this.Y();
   }

   public boolean T() {
      return this.V;
   }

   public void h(boolean var1) {
      this.V = var1;
   }

   public int a() {
      return this.A;
   }

   public void g(int var1) {
      this.A = var1;
      this.h();
   }

   public boolean G() {
      return this.b;
   }

   public void L(boolean var1) {
      this.b = var1;
      this.H();
   }

   public boolean q() {
      return this.h;
   }

   public void D(boolean var1) {
      this.h = var1;
      this.H();
   }

   public int k() {
      return this.r;
   }

   public void T(int var1) {
      this.r = var1;
      this.H();
   }

   public boolean R() {
      return this.M;
   }

   public void R(boolean var1) {
      this.M = var1;
      this.h();
   }

   public boolean C() {
      return this.G;
   }

   public void o(boolean var1) {
      this.G = var1;
      this.H();
   }

   public Og4 i() {
      return this.e;
   }

   public void Y(Og4 var1) {
      JTextComponent var3;
      boolean var4;
      label22: {
         label24: {
            WO.C(this.u, this.e);
            boolean var10000 = Ne4.m$boolean();
            this.e = var1;
            boolean var2 = var10000;
            var3 = this.getComponent();
            Og4 var10001 = var1;
            if (!var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1;
            }

            var4 = var10001.d$Boolean(this.u);
            if (var2) {
               break label22;
            }

            if (!var4) {
               var4 = false;
               break label22;
            }
         }

         var4 = true;
      }

      var3.setOpaque(var4);
      WO.t(this.u, this.e);
      this.h();
   }

   public void Y() {
      boolean var1 = Ne4.m$boolean();
      QH var10000 = this;
      if (!var1) {
         if (!this.L(this.getComponent())) {
            return;
         }

         var10000 = this;
      }

      var10000.H();
   }

   public boolean L(JTextComponent var1) {
      boolean var2 = Ne4.A$boolean();
      boolean var10000 = this.t;
      if (var2) {
         if (!this.t) {
            return false;
         }

         var10000 = var1.isEditable();
      }

      if (var2) {
         if (!var10000) {
            return false;
         }

         var10000 = var1.isEnabled();
      }

      if (var2) {
         if (!var10000) {
            return false;
         }

         var10000 = this.J;
      }

      if (var2) {
         if (var10000) {
            var10000 = var1.isFocusOwner();
            if (!var2) {
               return !var2 ? var10000 : var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = var1.getText().equals("");
      }

      return !var2 ? var10000 : var10000;
   }

   public void H() {
      boolean var1 = Ne4.A$boolean();
      JTextField var10000 = this.u;
      if (var1) {
         if (this.u == null) {
            return;
         }

         var10000 = this.u;
      }

      var10000.repaint();
   }

   @Override
   public void h() {
      boolean var1;
      QH var7;
      label131: {
         var1 = Ne4.A$boolean();
         JTextField var10000 = this.u;
         if (var1) {
            if (this.u == null) {
               return;
            }

            var7 = this;
            if (!var1) {
               break label131;
            }

            var10000 = this.u;
         }

         if (FN.l((JComponent)var10000)) {
            return;
         }

         var7 = this;
      }

      Insets var2;
      label133: {
         if (var1) {
            if (var7.e != null) {
               var2 = this.e.B(this.getComponent());
               if (var1) {
                  break label133;
               }
            }

            var7 = this;
         }

         if (var7.M) {
            var2 = new Insets(this.A + 1, this.A + 1, this.A + 1, this.A + 1);
            if (var1) {
               break label133;
            }
         }

         var2 = new Insets(0, 0, 0, 0);
      }

      boolean var3 = this.u.getComponentOrientation().isLeftToRight();
      Insets var4 = this.u.getMargin();
      Insets var8 = var4;
      if (var1) {
         if (var4 != null) {
      boolean var9;
            int var16;
            int var10001;
            label104: {
               var9 = var2;
               var10001 = var2.top;
               Insets var10002 = var4;
               if (var1) {
                  var2.top = var2.top + var4.top;
                  var9 = var2;
                  var10001 = var2.left;
                  if (var3) {
      boolean var10;
                     var16 = var4.left;
                     break label104;
                  }

                  var10002 = var4;
               }

               var16 = var10002.right;
            }

            label98: {
               var9.left = var10001 + var16;
               var10 = var2;
               var10001 = var2.bottom;
               Insets var17 = var4;
               if (var1) {
                  var2.bottom = var2.bottom + var4.bottom;
                  var10 = var2;
                  var10001 = var2.right;
                  if (var3) {
                     var16 = var4.right;
                     break label98;
                  }

                  var17 = var4;
               }

               var16 = var17.left;
            }

            var10.right = var10001 + var16;
         }

         var8 = this.U;
      }

      label136: {
         int var14;
         int var20;
         label89: {
            label137: {
               if (var1) {
                  if (var8 == null) {
                     break label136;
                  }

                  var8 = var2;
                  var14 = var2.top;
                  var19 = this.U;
                  if (!var1) {
                     break label137;
                  }

                  var2.top = var2.top + this.U.top;
                  var8 = var2;
               }

               var14 = var8.left;
               if (var3) {
                  var20 = this.U.left;
                  break label89;
               }

               var19 = this.U;
            }

            var20 = var19.right;
         }

         label78: {
            var8.left = var14 + var20;
            var11 = var2;
            var14 = var2.bottom;
            Insets var21 = this.U;
            if (var1) {
               var2.bottom = var2.bottom + this.U.bottom;
               var11 = var2;
               var14 = var2.right;
               if (var3) {
                  var20 = this.U.right;
                  break label78;
               }

               var21 = this.U;
            }

            var20 = var21.left;
         }

         var11.right = var14 + var20;
      }

      JComponent var5 = var3 ? this.y : this.K;
      JComponent var6 = var3 ? this.K : this.y;
      JComponent var12 = var5;
      if (var1) {
         if (var5 != null) {
            var2.left = var2.left + var5.getPreferredSize().width;
         }

         var12 = var6;
      }

      if (var12 != null) {
         var2.right = var2.right + var6.getPreferredSize().width;
      }

      this.u.setBorder(GA.y(var2));
   }

   @Override
   public void paintSafely(Graphics var1) {
      Ne4.m$boolean();
      Object[] var10001 = Registry.packArgs(this.getComponent(), var1);
      long var12 = 135169693674870498L;
      Object var10002 = Ref.h2(135169693674870498L, var12);

      try {
         var10002 = (Graphics)var10002;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var2;
      JTextComponent var3;
      Graphics2D var4;
      var1 = (Graphics)var10002;
      var3 = this.getComponent();
      var4 = (Graphics2D)var1;
      var2 = var10001;
      var20 = var3.isOpaque();
      label200:
      if (var2 == null) {
         label198:
         if (var20 != 0) {
            label204: {
               Og4 var21 = this.e;
               if (var2 == null) {
                  if (this.e == null) {
                     break label204;
                  }

                  var21 = this.e;
               }

               var20 = var21.d$Boolean(this.u);
               if (var2 == null) {
                  break label200;
               }

               if (var20 != 0) {
                  break label198;
               }
            }

            var1.setColor(var3.getBackground());
            var1.fillRect(0, 0, var3.getWidth(), var3.getHeight());
         }

         var20 = this.F;
      }

      label205: {
         if (var2 == null) {
            if (var20 == 0) {
               var10001 = this.e;
               label180:
               if (var2 == null) {
                  if (this.e == null) {
                     var10001 = this;
                     if (var2 == null) {
                        break label180;
                     }

                     if (!this.M) {
                        break label205;
                     }
                  }

                  var10001 = (Object[])RV.X(var4);
               }

               Object var5;
               label207: {
                  var5 = var10001;
                  QH var23 = this;
                  if (var2 == null) {
                     if (this.e != null) {
                        this.e.u(var4, FN.N(var3), var3);
                        if (var2 == null) {
                           break label207;
                        }
                     }

                     var23 = this;
                  }

                  boolean var24 = var23.M;
                  if (var2 == null) {
                     if (!var23.M) {
                        break label207;
                     }

                     var24 = this.V;
                  }

                  Color var6;
                  label161: {
                     label208: {
                        if (var2 == null) {
                           if (!var24) {
                              break label208;
                           }

                           var24 = this.G;
                        }

                        label154: {
                           label153: {
                              if (var2 == null) {
                                 if (!var24) {
                                    break label153;
                                 }

                                 var24 = var3.isFocusOwner();
                              }

                              if (var24) {
                                 var10001 = GO.c;
                                 break label154;
                              }
                           }

                           var10001 = GO.r;
                        }

                        var6 = var10001;
                        if (var2 == null) {
                           break label161;
                        }
                     }

                     var6 = null;
                  }

                  GA.r(var4, var3, var6, this.A, this.r, this.b, this.h);
               }

               RV.X(var4, var5);
               if (var2 == null) {
                  break label205;
               }
            }

            var20 = this.O;
         }

         if (var2 == null) {
            if (var20 == 0) {
               break label205;
            }

            var4.setColor(this.z);
            var20 = 0;
         }

         byte var16 = var20;
         byte var18 = 1;
         var4.fillRect(var16 + 3, var3.getHeight() - var18 - 3, var3.getWidth() - a(30780, 2355298687250003700L), var18);
      }

      Map var17 = FN.Y(var4);
      super.paintSafely(var1);
      if (var2 == null) {
         if (this.L(var3)) {
            byte var19 = var3.getComponentOrientation().isLeftToRight();
            Rectangle var7 = this.getVisibleEditorRect();
            Shape var8 = RV.n(var4, var7);
            var10002 = this.S;
            if (var2 == null) {
               var10002 = this.S != null ? this.S : var3.getFont();
            }

            var4.setFont((Font)var10002);
            var10002 = this.f;
            if (var2 == null) {
               var10002 = this.f != null ? this.f : var3.getForeground();
            }

            String var9;
            int var11;
            label210: {
               var4.setPaint((Paint)var10002);
               var9 = Cf4_2.X(this.Q);
               FontMetrics var10 = var4.getFontMetrics();
               int var26 = this.a;
               if (var2 == null) {
                  if (this.a == 0) {
                     var11 = var7.x + var7.width / 2 - var10.stringWidth(var9) / 2;
                     if (var2 == null) {
                        break label210;
                     }
                  }

                  var26 = var19;
               }

               label119: {
                  label118: {
                     label117: {
                        label211: {
                           if (var2 == null) {
                              if (var26 != 0) {
                                 var27 = this.a;
                                 if (var2 == null) {
                                    break label117;
                                 }

                                 if (this.a == a(14608, 8443338771349125081L)) {
                                    break label211;
                                 }
                              }

                              var26 = var19;
                           }

                           if (var2 == null) {
                              if (var26 == 0) {
                                 var27 = this.a;
                                 if (var2 == null) {
                                    break label117;
                                 }

                                 if (this.a == a(29044, 3711130744072929211L)) {
                                    break label211;
                                 }
                              }

                              var26 = this.a;
                           }

                           var31 = 2;
                           if (var2 == null) {
                              break label119;
                           }

                           if (var26 != 2) {
                              break label118;
                           }
                        }

                        var27 = var7.x;
                     }

                     var11 = var27;
                     if (var2 == null) {
                        break label210;
                     }
                  }

                  var26 = var7.x + var7.width;
                  var31 = var10.stringWidth(var9);
               }

               var11 = var26 - var31;
            }

            var4.drawString(var9, var11, this.getBaseline(var3, var3.getWidth(), var3.getHeight()));
            var4.setClip(var8);
         }

         FN.k(var4, var17);
      }
   }

   @Override
   public void paintBackground(Graphics var1) {
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var3;
      QH var6;
      label25: {
         label24: {
            boolean var10000 = Ne4.A$boolean();
            var3 = super.getPreferredSize(var1);
            boolean var2 = var10000;
            var3.width++;
            JComponent var5 = this.y;
            if (var2) {
               if (this.y == null) {
                  var6 = this;
                  if (!var2) {
                     break label25;
                  }

                  if (this.K == null) {
                     break label24;
                  }
               }

               var5 = var1;
            }

            Dimension var4 = var5.getLayout().preferredLayoutSize(var1);
            var3.height = Math.max(var3.height, var4.height);
         }

         var6 = this;
      }

      if (var6.e != null) {
         var3 = FN.h(var3, this.e.d$Dimension(var1));
      }

      return var3;
   }

   public boolean V() {
      return this.O;
   }

   public void n(boolean var1) {
      this.O = var1;
   }

   public static JTextField P(QH var0) {
      return var0.u;
   }

   public static void j(QH var0) {
      var0.J();
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26626) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 21;
               break;
            case 1:
               var10000 = 44;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 60;
               break;
            case 4:
               var10000 = 99;
               break;
            case 5:
               var10000 = 67;
               break;
            case 6:
               var10000 = 188;
               break;
            case 7:
               var10000 = 70;
               break;
            case 8:
               var10000 = 166;
               break;
            case 9:
               var10000 = 93;
               break;
            case 10:
               var10000 = 100;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 120;
               break;
            case 13:
               var10000 = 185;
               break;
            case 14:
               var10000 = 154;
               break;
            case 15:
               var10000 = 6;
               break;
            case 16:
               var10000 = 119;
               break;
            case 17:
               var10000 = 245;
               break;
            case 18:
               var10000 = 208;
               break;
            case 19:
               var10000 = 216;
               break;
            case 20:
               var10000 = 142;
               break;
            case 21:
               var10000 = 241;
               break;
            case 22:
               var10000 = 11;
               break;
            case 23:
               var10000 = 76;
               break;
            case 24:
               var10000 = 243;
               break;
            case 25:
               var10000 = 90;
               break;
            case 26:
               var10000 = 175;
               break;
            case 27:
               var10000 = 197;
               break;
            case 28:
               var10000 = 200;
               break;
            case 29:
               var10000 = 207;
               break;
            case 30:
               var10000 = 249;
               break;
            case 31:
               var10000 = 145;
               break;
            case 32:
               var10000 = 172;
               break;
            case 33:
               var10000 = 40;
               break;
            case 34:
               var10000 = 217;
               break;
            case 35:
               var10000 = 139;
               break;
            case 36:
               var10000 = 191;
               break;
            case 37:
               var10000 = 101;
               break;
            case 38:
               var10000 = 106;
               break;
            case 39:
               var10000 = 35;
               break;
            case 40:
               var10000 = 253;
               break;
            case 41:
               var10000 = 198;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 202;
               break;
            case 44:
               var10000 = 97;
               break;
            case 45:
               var10000 = 10;
               break;
            case 46:
               var10000 = 0;
               break;
            case 47:
               var10000 = 32;
               break;
            case 48:
               var10000 = 52;
               break;
            case 49:
               var10000 = 178;
               break;
            case 50:
               var10000 = 141;
               break;
            case 51:
               var10000 = 252;
               break;
            case 52:
               var10000 = 153;
               break;
            case 53:
               var10000 = 221;
               break;
            case 54:
               var10000 = 48;
               break;
            case 55:
               var10000 = 68;
               break;
            case 56:
               var10000 = 194;
               break;
            case 57:
               var10000 = 143;
               break;
            case 58:
               var10000 = 138;
               break;
            case 59:
               var10000 = 47;
               break;
            case 60:
               var10000 = 109;
               break;
            case 61:
               var10000 = 171;
               break;
            case 62:
               var10000 = 91;
               break;
            case 63:
               var10000 = 214;
               break;
            case 64:
               var10000 = 114;
               break;
            case 65:
               var10000 = 193;
               break;
            case 66:
               var10000 = 102;
               break;
            case 67:
               var10000 = 186;
               break;
            case 68:
               var10000 = 167;
               break;
            case 69:
               var10000 = 117;
               break;
            case 70:
               var10000 = 239;
               break;
            case 71:
               var10000 = 43;
               break;
            case 72:
               var10000 = 45;
               break;
            case 73:
               var10000 = 176;
               break;
            case 74:
               var10000 = 147;
               break;
            case 75:
               var10000 = 85;
               break;
            case 76:
               var10000 = 179;
               break;
            case 77:
               var10000 = 94;
               break;
            case 78:
               var10000 = 170;
               break;
            case 79:
               var10000 = 110;
               break;
            case 80:
               var10000 = 62;
               break;
            case 81:
               var10000 = 192;
               break;
            case 82:
               var10000 = 238;
               break;
            case 83:
               var10000 = 55;
               break;
            case 84:
               var10000 = 159;
               break;
            case 85:
               var10000 = 96;
               break;
            case 86:
               var10000 = 39;
               break;
            case 87:
               var10000 = 228;
               break;
            case 88:
               var10000 = 233;
               break;
            case 89:
               var10000 = 222;
               break;
            case 90:
               var10000 = 123;
               break;
            case 91:
               var10000 = 181;
               break;
            case 92:
               var10000 = 150;
               break;
            case 93:
               var10000 = 88;
               break;
            case 94:
               var10000 = 157;
               break;
            case 95:
               var10000 = 205;
               break;
            case 96:
               var10000 = 12;
               break;
            case 97:
               var10000 = 246;
               break;
            case 98:
               var10000 = 80;
               break;
            case 99:
               var10000 = 4;
               break;
            case 100:
               var10000 = 66;
               break;
            case 101:
               var10000 = 242;
               break;
            case 102:
               var10000 = 235;
               break;
            case 103:
               var10000 = 65;
               break;
            case 104:
               var10000 = 156;
               break;
            case 105:
               var10000 = 247;
               break;
            case 106:
               var10000 = 86;
               break;
            case 107:
               var10000 = 209;
               break;
            case 108:
               var10000 = 18;
               break;
            case 109:
               var10000 = 224;
               break;
            case 110:
               var10000 = 254;
               break;
            case 111:
               var10000 = 152;
               break;
            case 112:
               var10000 = 116;
               break;
            case 113:
               var10000 = 51;
               break;
            case 114:
               var10000 = 165;
               break;
            case 115:
               var10000 = 126;
               break;
            case 116:
               var10000 = 41;
               break;
            case 117:
               var10000 = 5;
               break;
            case 118:
               var10000 = 196;
               break;
            case 119:
               var10000 = 163;
               break;
            case 120:
               var10000 = 128;
               break;
            case 121:
               var10000 = 211;
               break;
            case 122:
               var10000 = 13;
               break;
            case 123:
               var10000 = 103;
               break;
            case 124:
               var10000 = 158;
               break;
            case 125:
               var10000 = 34;
               break;
            case 126:
               var10000 = 23;
               break;
            case 127:
               var10000 = 204;
               break;
            case 128:
               var10000 = 180;
               break;
            case 129:
               var10000 = 20;
               break;
            case 130:
               var10000 = 173;
               break;
            case 131:
               var10000 = 61;
               break;
            case 132:
               var10000 = 149;
               break;
            case 133:
               var10000 = 226;
               break;
            case 134:
               var10000 = 63;
               break;
            case 135:
               var10000 = 69;
               break;
            case 136:
               var10000 = 104;
               break;
            case 137:
               var10000 = 24;
               break;
            case 138:
               var10000 = 3;
               break;
            case 139:
               var10000 = 14;
               break;
            case 140:
               var10000 = 127;
               break;
            case 141:
               var10000 = 83;
               break;
            case 142:
               var10000 = 189;
               break;
            case 143:
               var10000 = 237;
               break;
            case 144:
               var10000 = 131;
               break;
            case 145:
               var10000 = 19;
               break;
            case 146:
               var10000 = 27;
               break;
            case 147:
               var10000 = 248;
               break;
            case 148:
               var10000 = 30;
               break;
            case 149:
               var10000 = 113;
               break;
            case 150:
               var10000 = 223;
               break;
            case 151:
               var10000 = 81;
               break;
            case 152:
               var10000 = 92;
               break;
            case 153:
               var10000 = 227;
               break;
            case 154:
               var10000 = 164;
               break;
            case 155:
               var10000 = 187;
               break;
            case 156:
               var10000 = 230;
               break;
            case 157:
               var10000 = 174;
               break;
            case 158:
               var10000 = 219;
               break;
            case 159:
               var10000 = 220;
               break;
            case 160:
               var10000 = 72;
               break;
            case 161:
               var10000 = 199;
               break;
            case 162:
               var10000 = 22;
               break;
            case 163:
               var10000 = 250;
               break;
            case 164:
               var10000 = 148;
               break;
            case 165:
               var10000 = 136;
               break;
            case 166:
               var10000 = 111;
               break;
            case 167:
               var10000 = 255;
               break;
            case 168:
               var10000 = 177;
               break;
            case 169:
               var10000 = 140;
               break;
            case 170:
               var10000 = 121;
               break;
            case 171:
               var10000 = 206;
               break;
            case 172:
               var10000 = 229;
               break;
            case 173:
               var10000 = 169;
               break;
            case 174:
               var10000 = 155;
               break;
            case 175:
               var10000 = 133;
               break;
            case 176:
               var10000 = 132;
               break;
            case 177:
               var10000 = 28;
               break;
            case 178:
               var10000 = 151;
               break;
            case 179:
               var10000 = 16;
               break;
            case 180:
               var10000 = 95;
               break;
            case 181:
               var10000 = 168;
               break;
            case 182:
               var10000 = 78;
               break;
            case 183:
               var10000 = 64;
               break;
            case 184:
               var10000 = 1;
               break;
            case 185:
               var10000 = 26;
               break;
            case 186:
               var10000 = 58;
               break;
            case 187:
               var10000 = 240;
               break;
            case 188:
               var10000 = 251;
               break;
            case 189:
               var10000 = 124;
               break;
            case 190:
               var10000 = 8;
               break;
            case 191:
               var10000 = 201;
               break;
            case 192:
               var10000 = 203;
               break;
            case 193:
               var10000 = 162;
               break;
            case 194:
               var10000 = 25;
               break;
            case 195:
               var10000 = 36;
               break;
            case 196:
               var10000 = 115;
               break;
            case 197:
               var10000 = 184;
               break;
            case 198:
               var10000 = 244;
               break;
            case 199:
               var10000 = 215;
               break;
            case 200:
               var10000 = 84;
               break;
            case 201:
               var10000 = 122;
               break;
            case 202:
               var10000 = 137;
               break;
            case 203:
               var10000 = 42;
               break;
            case 204:
               var10000 = 225;
               break;
            case 205:
               var10000 = 218;
               break;
            case 206:
               var10000 = 108;
               break;
            case 207:
               var10000 = 49;
               break;
            case 208:
               var10000 = 7;
               break;
            case 209:
               var10000 = 2;
               break;
            case 210:
               var10000 = 87;
               break;
            case 211:
               var10000 = 33;
               break;
            case 212:
               var10000 = 31;
               break;
            case 213:
               var10000 = 134;
               break;
            case 214:
               var10000 = 161;
               break;
            case 215:
               var10000 = 17;
               break;
            case 216:
               var10000 = 98;
               break;
            case 217:
               var10000 = 71;
               break;
            case 218:
               var10000 = 53;
               break;
            case 219:
               var10000 = 144;
               break;
            case 220:
               var10000 = 107;
               break;
            case 221:
               var10000 = 56;
               break;
            case 222:
               var10000 = 9;
               break;
            case 223:
               var10000 = 112;
               break;
            case 224:
               var10000 = 190;
               break;
            case 225:
               var10000 = 146;
               break;
            case 226:
               var10000 = 212;
               break;
            case 227:
               var10000 = 89;
               break;
            case 228:
               var10000 = 74;
               break;
            case 229:
               var10000 = 73;
               break;
            case 230:
               var10000 = 129;
               break;
            case 231:
               var10000 = 82;
               break;
            case 232:
               var10000 = 183;
               break;
            case 233:
               var10000 = 231;
               break;
            case 234:
               var10000 = 75;
               break;
            case 235:
               var10000 = 37;
               break;
            case 236:
               var10000 = 105;
               break;
            case 237:
               var10000 = 57;
               break;
            case 238:
               var10000 = 77;
               break;
            case 239:
               var10000 = 135;
               break;
            case 240:
               var10000 = 54;
               break;
            case 241:
               var10000 = 79;
               break;
            case 242:
               var10000 = 46;
               break;
            case 243:
               var10000 = 182;
               break;
            case 244:
               var10000 = 213;
               break;
            case 245:
               var10000 = 195;
               break;
            case 246:
               var10000 = 234;
               break;
            case 247:
               var10000 = 236;
               break;
            case 248:
               var10000 = 232;
               break;
            case 249:
               var10000 = 210;
               break;
            case 250:
               var10000 = 50;
               break;
            case 251:
               var10000 = 160;
               break;
            case 252:
               var10000 = 38;
               break;
            case 253:
               var10000 = 59;
               break;
            case 254:
               var10000 = 29;
               break;
            default:
               var10000 = 130;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3786;
      if (l[var3] == null) {
         l[var3] = (int)(i[var3] ^ var1);
      }

      return l[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "Ñ\u009589ò\u009a\u0014Ü\u00adIæ&\u0094Djÿ\u0011ÖMÛäó\u0094@\u0017=\u0090\u0007¯Líé<.e\u0006¤\u0088\u0096\u009a'î\u0014`IÞzÔ\u0007\u001a\u00184_¯\u0084ôÝ\u0016³üóª\f\u0007öuÆÎYÊÉ\u0007\u0017¬Ö\u009dZi\u000b\u0014tB1ÄMIX®½\u009fº\u0096*úê+\r¼\u008bã\bÐ\u000e51#W\u0088ø";
      int var12 = "Ñ\u009589ò\u009a\u0014Ü\u00adIæ&\u0094Djÿ\u0011ÖMÛäó\u0094@\u0017=\u0090\u0007¯Líé<.e\u0006¤\u0088\u0096\u009a'î\u0014`IÞzÔ\u0007\u001a\u00184_¯\u0084ôÝ\u0016³üóª\f\u0007öuÆÎYÊÉ\u0007\u0017¬Ö\u009dZi\u000b\u0014tB1ÄMIX®½\u009fº\u0096*úê+\r¼\u008bã\bÐ\u000e51#W\u0088ø"
         .length();
      char var9 = 6;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 101;
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
                        var65 = 90;
                        break;
                     case 1:
                        var65 = 106;
                        break;
                     case 2:
                        var65 = 50;
                        break;
                     case 3:
                        var65 = 37;
                        break;
                     case 4:
                        var65 = 47;
                        break;
                     case 5:
                        var65 = 53;
                        break;
                     default:
                        var65 = 75;
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
                     c = var13;
                     d = new String[11];
                     long var0 = 3515604448399464222L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0082ÌF\u007fbd\u0016b×9¸\u007f.\u008bÓ\u000eF0:ÒÔØáí\u0007Ô\u009dÚ5. Í";
                     int var5 = "\u0082ÌF\u007fbd\u0016b×9¸\u007f.\u008bÓ\u000eF0:ÒÔØáí\u0007Ô\u009dÚ5. Í".length();
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
                                    i = var6;
                                    l = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "×Q\f\u0010\u001a#i\u001b\u0004\u000fj\"^Ýh®";
                                 var5 = "×Q\f\u0010\u001a#i\u001b\u0004\u000fj\"^Ýh®".length();
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

                  var10 = "\u0011\u001dZ&ø\u008d\u0014×\u0094n5\u008d\\k'ð\u00858þQÜ®Ä®jÔ\u0012";
                  var12 = "\u0011\u001dZ&ø\u008d\u0014×\u0094n5\u008d\\k'ð\u00858þQÜ®Ä®jÔ\u0012".length();
                  var9 = 6;
                  var17 = -1;
            }

            var10000 = 38;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






