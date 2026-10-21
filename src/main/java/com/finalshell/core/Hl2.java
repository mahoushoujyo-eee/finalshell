package com.finalshell.core;

import com.finalshell.ui.listener.Li2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import javax.swing.text.JTextComponent;

public class Hl2 extends BasicPasswordFieldUI implements W2_3, SwingConstants, L0_2 {
   public boolean G = DR.u;
   public boolean Q = DR.t;
   public int f = DR.C;
   public boolean c = DR.g;
   public int T;
   public boolean W;
   public boolean v;
   public Insets R;
   public String a;
   public Font o;
   public Color b;
   public int L;
   public boolean h;
   public Og4 D;
   public JPasswordField K;
   public JComponent U;
   public JComponent H;
   public boolean C;
   public FocusListener Z;
   public PropertyChangeListener J;
   public PropertyChangeListener m;
   public PropertyChangeListener O;
   public ComponentAdapter r;
   public static String[] d;
   public static String[] e;
   public static long[] g;
   public static Integer[] i;

   public Hl2() {
      this.T = DR.L;
      this.W = DR.Z;
      this.v = DR.P;
      this.R = DR.A;
      this.a = Ee4.h;
      this.o = Ee4.K;
      this.b = Ee4.j;
      this.L = Ee4.E;
      this.h = Ee4.S;
      this.D = DR.H;
      this.U = null;
      this.H = null;
      this.C = false;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new Hl2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.K = (JPasswordField)var1;
      FN.Y(this.K);
      LookAndFeel.installProperty(this.K, a(26519, -10295), Boolean.FALSE);
      this.K.putClientProperty(a(26518, 25241), Boolean.valueOf(true));
      this.K.setFocusable(true);
      this.K.setMargin(DR.r);
      this.K.setBackground(Color.WHITE);
      boolean var10000 = Ne4.m$boolean();
      this.K.setSelectionColor(GO.F4);
      this.K.setForeground(Color.BLACK);
      boolean var2 = var10000;
      this.K.setSelectedTextColor(Color.BLACK);
      this.K.setCaretColor(Color.GRAY);
      this.K.setLayout(new TC(this.K));
      WO.t(this.K, this.D);
      this.h();
      this.Z = new Li2(this);
      this.K.addFocusListener(this.Z);
      this.J = new com.finalshell.ui.listener.NL(this);
      this.K.addPropertyChangeListener(a(26525, -8074), this.J);
      this.m = new com.finalshell.ui.listener.DW(this);
      this.K.addPropertyChangeListener(a(26516, -15856), this.m);
      this.O = new com.finalshell.ui.listener.Q22(this);
      this.K.addPropertyChangeListener(a(26527, -6757), this.O);
      this.r = new com.finalshell.ui.listener.X4(this);
      if (Ky4.F$arrString() != null) {
         Ne4.p(!var2);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      WO.C(this.K, this.D);
      this.K.putClientProperty(a(26524, -20155), null);
      this.K.removeFocusListener(this.Z);
      this.K.removePropertyChangeListener(a(26523, -7899), this.J);
      this.K.removePropertyChangeListener(a(26522, 14070), this.m);
      this.K.removePropertyChangeListener(a(26520, -31318), this.O);
      this.E();
      this.F();
      this.K.setLayout(null);
      this.K = null;
      super.uninstallUI(var1);
   }

   @Override
   public Shape B() {
      boolean var1 = Ne4.A$boolean();
      Hl2 var10000 = this;
      if (var1) {
         if (this.G) {
            return GA.X(this.K, this.T, this.f);
         }

         var10000 = this;
      }

      return FN.N(var10000.K);
   }

   public void U() {
      boolean var1 = Ne4.A$boolean();
      JComponent var10000 = this.U;
      if (var1) {
         if (this.U != null) {
            this.U.setEnabled(this.K.isEnabled());
         }

         var10000 = this.H;
      }

      if (var1) {
         if (var10000 == null) {
            return;
         }

         var10000 = this.H;
      }

      var10000.setEnabled(this.K.isEnabled());
   }

   public JComponent w() {
      return this.U;
   }

   public void K(JComponent var1) {
      boolean var2 = Ne4.A$boolean();
      JComponent var10000 = this.U;
      if (var2) {
         if (this.U == var1) {
            return;
         }

         this.E();
         if (!var2) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         this.U = var1;
         this.U.addComponentListener(this.r);
         this.K.add(var1, a(26521, -3579));
         this.U();
      }

      this.K.revalidate();
      this.h();
   }

   public void E() {
      boolean var1 = Ne4.A$boolean();
      JComponent var10000 = this.U;
      if (var1) {
         if (this.U == null) {
            return;
         }

         var10000 = this.U;
      }

      var10000.removeComponentListener(this.r);
      this.K.remove(this.U);
      this.U = null;
   }

   public JComponent f() {
      return this.H;
   }

   public void b(JComponent var1) {
      boolean var2 = Ne4.m$boolean();
      JComponent var10000 = this.H;
      if (!var2) {
         if (this.H == var1) {
            return;
         }

         this.F();
         if (var2) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         this.H = var1;
         this.H.addComponentListener(this.r);
         this.K.add(var1, a(26526, 30804));
         this.U();
      }

      this.K.revalidate();
      this.h();
   }

   public void F() {
      boolean var1 = Ne4.A$boolean();
      JComponent var10000 = this.H;
      if (var1) {
         if (this.H == null) {
            return;
         }

         var10000 = this.H;
      }

      var10000.removeComponentListener(this.r);
      this.K.remove(this.H);
      this.H = null;
   }

   public void S(Insets var1) {
      this.R = var1;
      this.h();
   }

   public Insets v() {
      return this.R;
   }

   public String P() {
      return this.a;
   }

   public void w(String var1) {
      boolean var3;
      label22: {
         label24: {
            boolean var10000 = Ne4.m$boolean();
            this.a = var1;
            boolean var2 = var10000;
            String var10001 = var1;
            if (!var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1.trim();
            }

            var3 = var10001.equals("");
            if (var2) {
               break label22;
            }

            if (!var3) {
               var3 = true;
               break label22;
            }
         }

         var3 = false;
      }

      this.C = var3;
      this.O();
   }

   public Font M() {
      return this.o;
   }

   public void G(Font var1) {
      this.o = var1;
      this.O();
   }

   public Color t() {
      return this.b;
   }

   public void o(Color var1) {
      this.b = var1;
      this.O();
   }

   public int s() {
      return this.L;
   }

   public void U(int var1) {
      this.L = var1;
      this.O();
   }

   public boolean D() {
      return this.h;
   }

   public void T(boolean var1) {
      this.h = var1;
      this.O();
   }

   public boolean Z() {
      return this.c;
   }

   public void A(boolean var1) {
      this.c = var1;
   }

   public int G() {
      return this.T;
   }

   public void M(int var1) {
      this.T = var1;
      this.h();
   }

   public boolean b$boolean() {
      return this.W;
   }

   public void Y(boolean var1) {
      this.W = var1;
      this.p();
   }

   public boolean C() {
      return this.v;
   }

   public void m(boolean var1) {
      this.v = var1;
      this.p();
   }

   public int b$int() {
      return this.f;
   }

   public void b(int var1) {
      this.f = var1;
      this.p();
   }

   public boolean K() {
      return this.G;
   }

   public void g(boolean var1) {
      this.G = var1;
      this.h();
   }

   public boolean X() {
      return this.Q;
   }

   public void X(boolean var1) {
      this.Q = var1;
      this.p();
   }

   public Og4 o() {
      return this.D;
   }

   public void f(Og4 var1) {
      JTextComponent var3;
      boolean var4;
      label22: {
         label24: {
            boolean var10000 = Ne4.m$boolean();
            WO.C(this.K, this.D);
            this.D = var1;
            boolean var2 = var10000;
            var3 = this.getComponent();
            Og4 var10001 = var1;
            if (!var2) {
               if (var1 == null) {
                  break label24;
               }

               var10001 = var1;
            }

            var4 = var10001.d$Boolean(this.K);
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
      WO.t(this.K, this.D);
      this.h();
   }

   public void O() {
      boolean var1 = Ne4.A$boolean();
      Hl2 var10000 = this;
      if (var1) {
         if (!this.Q(this.getComponent())) {
            return;
         }

         var10000 = this;
      }

      var10000.p();
   }

   public boolean Q(JTextComponent var1) {
      boolean var2 = Ne4.A$boolean();
      boolean var10000 = this.C;
      if (var2) {
         if (!this.C) {
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

         var10000 = this.h;
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

   public void p() {
      boolean var1 = Ne4.A$boolean();
      JPasswordField var10000 = this.K;
      if (var1) {
         if (this.K == null) {
            return;
         }

         var10000 = this.K;
      }

      var10000.repaint();
   }

   @Override
   public void h() {
      boolean var1;
      Hl2 var7;
      label131: {
         var1 = Ne4.A$boolean();
         JPasswordField var10000 = this.K;
         if (var1) {
            if (this.K == null) {
               return;
            }

            var7 = this;
            if (!var1) {
               break label131;
            }

            var10000 = this.K;
         }

         if (FN.l((JComponent)var10000)) {
            return;
         }

         var7 = this;
      }

      Insets var2;
      label133: {
         if (var1) {
            if (var7.D != null) {
               var2 = this.D.B(this.getComponent());
               if (var1) {
                  break label133;
               }
            }

            var7 = this;
         }

         if (var7.G) {
            var2 = new Insets(this.T + 1, this.T + 1, this.T + 1, this.T + 1);
            if (var1) {
               break label133;
            }
         }

         var2 = new Insets(0, 0, 0, 0);
      }

      boolean var3 = this.K.getComponentOrientation().isLeftToRight();
      Insets var4 = this.K.getMargin();
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

         var8 = this.R;
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
                  var19 = this.R;
                  if (!var1) {
                     break label137;
                  }

                  var2.top = var2.top + this.R.top;
                  var8 = var2;
               }

               var14 = var8.left;
               if (var3) {
                  var20 = this.R.left;
                  break label89;
               }

               var19 = this.R;
            }

            var20 = var19.right;
         }

         label78: {
            var8.left = var14 + var20;
            var11 = var2;
            var14 = var2.bottom;
            Insets var21 = this.R;
            if (var1) {
               var2.bottom = var2.bottom + this.R.bottom;
               var11 = var2;
               var14 = var2.right;
               if (var3) {
                  var20 = this.R.right;
                  break label78;
               }

               var21 = this.R;
            }

            var20 = var21.left;
         }

         var11.right = var14 + var20;
      }

      JComponent var5 = var3 ? this.U : this.H;
      JComponent var6 = var3 ? this.H : this.U;
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

      this.K.setBorder(GA.y(var2));
   }

   @Override
   public void paintSafely(Graphics var1) {
      boolean var2;
      JTextComponent var3;
      Graphics2D var4;
      Object var14;
      label170: {
         boolean var10000 = Ne4.A$boolean();
         var3 = this.getComponent();
         var4 = (Graphics2D)var1;
         var2 = var10000;
         label169:
         if (var3.isOpaque()) {
            label173: {
               var14 = this.D;
               if (var2) {
                  if (this.D == null) {
                     break label173;
                  }

                  var14 = this.D;
               }

               if (!var2) {
                  break label170;
               }

               if (var14.d$Boolean(this.K)) {
                  break label169;
               }
            }

            var1.setColor(var3.getBackground());
            var1.fillRect(0, 0, var3.getWidth(), var3.getHeight());
         }

         var14 = this.D;
      }

      label174: {
         label155:
         if (var2) {
            if (var14 == null) {
               var14 = this;
               if (!var2) {
                  break label155;
               }

               if (!this.G) {
                  break label174;
               }
            }

            var14 = (Hl2)RV.X(var4);
         }

         Object var5;
         label175: {
            var5 = var14;
            var14 = this;
            if (var2) {
               if (this.D != null) {
                  this.D.u(var4, FN.N(var3), var3);
                  if (var2) {
                     break label175;
                  }
               }

               var14 = this;
            }

            boolean var16 = var14.G;
            if (var2) {
               if (!var14.G) {
                  break label175;
               }

               var16 = this.c;
            }

            Color var6;
            label142: {
               label176: {
                  if (var2) {
                     if (!var16) {
                        break label176;
                     }

                     var16 = this.Q;
                  }

                  label135: {
                     label134: {
                        if (var2) {
                           if (!var16) {
                              break label134;
                           }

                           var16 = var3.isFocusOwner();
                        }

                        if (var16) {
                           var17 = GO.c;
                           break label135;
                        }
                     }

                     var17 = GO.r;
                  }

                  var6 = var17;
                  if (var2) {
                     break label142;
                  }
               }

               var6 = null;
            }

            GA.r(var4, var3, var6, this.T, this.f, this.W, this.v);
         }

         RV.X(var4, var5);
      }

      Map var12 = FN.Y(var4);
      super.paintSafely(var1);
      if (var2) {
         if (this.Q(var3)) {
            byte var13 = var3.getComponentOrientation().isLeftToRight();
            Rectangle var7 = this.getVisibleEditorRect();
            Shape var8 = RV.n(var4, var7);
            Font var10001 = this.o;
            if (var2) {
               var10001 = this.o != null ? this.o : var3.getFont();
            }

            var4.setFont(var10001);
            Color var20 = this.b;
            if (var2) {
               var20 = this.b != null ? this.b : var3.getForeground();
            }

            String var9;
            int var11;
            label178: {
               var4.setPaint(var20);
               var9 = Cf4_2.X(this.a);
               FontMetrics var10 = var4.getFontMetrics();
               int var18 = this.L;
               if (var2) {
                  if (this.L == 0) {
                     var11 = var7.x + var7.width / 2 - var10.stringWidth(var9) / 2;
                     if (var2) {
                        break label178;
                     }
                  }

                  var18 = var13;
               }

               label103: {
                  label102: {
                     label101: {
                        label179: {
                           if (var2) {
                              if (var18 != 0) {
                                 var19 = this.L;
                                 if (!var2) {
                                    break label101;
                                 }

                                 if (this.L == a(6699, 6081752597153439722L)) {
                                    break label179;
                                 }
                              }

                              var18 = var13;
                           }

                           if (var2) {
                              if (var18 == 0) {
                                 var19 = this.L;
                                 if (!var2) {
                                    break label101;
                                 }

                                 if (this.L == a(5214, 2167190049943703966L)) {
                                    break label179;
                                 }
                              }

                              var18 = this.L;
                           }

                           var21 = 2;
                           if (!var2) {
                              break label103;
                           }

                           if (var18 != 2) {
                              break label102;
                           }
                        }

                        var19 = var7.x;
                     }

                     var11 = var19;
                     if (var2) {
                        break label178;
                     }
                  }

                  var18 = var7.x + var7.width;
                  var21 = var10.stringWidth(var9);
               }

               var11 = var18 - var21;
            }

            var4.drawString(var9, var11, this.getBaseline(var3, var3.getWidth(), var3.getHeight()));
            RV.w(var4, var8);
         }

         FN.k(var4, var12);
      }
   }

   @Override
   public void paintBackground(Graphics var1) {
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      Dimension var3;
      Hl2 var6;
      label25: {
         label24: {
            boolean var10000 = Ne4.m$boolean();
            var3 = super.getPreferredSize(var1);
            var3.width++;
            boolean var2 = var10000;
            JComponent var5 = this.U;
            if (!var2) {
               if (this.U == null) {
                  var6 = this;
                  if (var2) {
                     break label25;
                  }

                  if (this.H == null) {
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

      if (var6.D != null) {
         var3 = FN.h(var3, this.D.d$Dimension(var1));
      }

      return var3;
   }

   public static JPasswordField s(Hl2 var0) {
      return var0.K;
   }

   public static void i(Hl2 var0) {
      var0.U();
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 26526) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 32;
               break;
            case 1:
               var10000 = 116;
               break;
            case 2:
               var10000 = 205;
               break;
            case 3:
               var10000 = 22;
               break;
            case 4:
               var10000 = 124;
               break;
            case 5:
               var10000 = 178;
               break;
            case 6:
               var10000 = 201;
               break;
            case 7:
               var10000 = 96;
               break;
            case 8:
               var10000 = 155;
               break;
            case 9:
               var10000 = 110;
               break;
            case 10:
               var10000 = 238;
               break;
            case 11:
               var10000 = 221;
               break;
            case 12:
               var10000 = 197;
               break;
            case 13:
               var10000 = 251;
               break;
            case 14:
               var10000 = 144;
               break;
            case 15:
               var10000 = 136;
               break;
            case 16:
               var10000 = 52;
               break;
            case 17:
               var10000 = 66;
               break;
            case 18:
               var10000 = 253;
               break;
            case 19:
               var10000 = 42;
               break;
            case 20:
               var10000 = 248;
               break;
            case 21:
               var10000 = 133;
               break;
            case 22:
               var10000 = 241;
               break;
            case 23:
               var10000 = 8;
               break;
            case 24:
               var10000 = 203;
               break;
            case 25:
               var10000 = 72;
               break;
            case 26:
               var10000 = 100;
               break;
            case 27:
               var10000 = 148;
               break;
            case 28:
               var10000 = 77;
               break;
            case 29:
               var10000 = 250;
               break;
            case 30:
               var10000 = 168;
               break;
            case 31:
               var10000 = 236;
               break;
            case 32:
               var10000 = 130;
               break;
            case 33:
               var10000 = 167;
               break;
            case 34:
               var10000 = 60;
               break;
            case 35:
               var10000 = 121;
               break;
            case 36:
               var10000 = 113;
               break;
            case 37:
               var10000 = 174;
               break;
            case 38:
               var10000 = 215;
               break;
            case 39:
               var10000 = 46;
               break;
            case 40:
               var10000 = 235;
               break;
            case 41:
               var10000 = 48;
               break;
            case 42:
               var10000 = 12;
               break;
            case 43:
               var10000 = 191;
               break;
            case 44:
               var10000 = 160;
               break;
            case 45:
               var10000 = 192;
               break;
            case 46:
               var10000 = 105;
               break;
            case 47:
               var10000 = 249;
               break;
            case 48:
               var10000 = 218;
               break;
            case 49:
               var10000 = 0;
               break;
            case 50:
               var10000 = 87;
               break;
            case 51:
               var10000 = 187;
               break;
            case 52:
               var10000 = 56;
               break;
            case 53:
               var10000 = 86;
               break;
            case 54:
               var10000 = 75;
               break;
            case 55:
               var10000 = 44;
               break;
            case 56:
               var10000 = 28;
               break;
            case 57:
               var10000 = 68;
               break;
            case 58:
               var10000 = 134;
               break;
            case 59:
               var10000 = 199;
               break;
            case 60:
               var10000 = 74;
               break;
            case 61:
               var10000 = 122;
               break;
            case 62:
               var10000 = 153;
               break;
            case 63:
               var10000 = 71;
               break;
            case 64:
               var10000 = 229;
               break;
            case 65:
               var10000 = 207;
               break;
            case 66:
               var10000 = 128;
               break;
            case 67:
               var10000 = 163;
               break;
            case 68:
               var10000 = 102;
               break;
            case 69:
               var10000 = 173;
               break;
            case 70:
               var10000 = 143;
               break;
            case 71:
               var10000 = 65;
               break;
            case 72:
               var10000 = 18;
               break;
            case 73:
               var10000 = 80;
               break;
            case 74:
               var10000 = 59;
               break;
            case 75:
               var10000 = 97;
               break;
            case 76:
               var10000 = 70;
               break;
            case 77:
               var10000 = 183;
               break;
            case 78:
               var10000 = 106;
               break;
            case 79:
               var10000 = 131;
               break;
            case 80:
               var10000 = 95;
               break;
            case 81:
               var10000 = 26;
               break;
            case 82:
               var10000 = 244;
               break;
            case 83:
               var10000 = 198;
               break;
            case 84:
               var10000 = 217;
               break;
            case 85:
               var10000 = 27;
               break;
            case 86:
               var10000 = 3;
               break;
            case 87:
               var10000 = 99;
               break;
            case 88:
               var10000 = 34;
               break;
            case 89:
               var10000 = 132;
               break;
            case 90:
               var10000 = 57;
               break;
            case 91:
               var10000 = 150;
               break;
            case 92:
               var10000 = 138;
               break;
            case 93:
               var10000 = 182;
               break;
            case 94:
               var10000 = 15;
               break;
            case 95:
               var10000 = 230;
               break;
            case 96:
               var10000 = 208;
               break;
            case 97:
               var10000 = 135;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 186;
               break;
            case 100:
               var10000 = 101;
               break;
            case 101:
               var10000 = 7;
               break;
            case 102:
               var10000 = 224;
               break;
            case 103:
               var10000 = 58;
               break;
            case 104:
               var10000 = 243;
               break;
            case 105:
               var10000 = 118;
               break;
            case 106:
               var10000 = 202;
               break;
            case 107:
               var10000 = 129;
               break;
            case 108:
               var10000 = 190;
               break;
            case 109:
               var10000 = 114;
               break;
            case 110:
               var10000 = 246;
               break;
            case 111:
               var10000 = 54;
               break;
            case 112:
               var10000 = 149;
               break;
            case 113:
               var10000 = 175;
               break;
            case 114:
               var10000 = 212;
               break;
            case 115:
               var10000 = 61;
               break;
            case 116:
               var10000 = 145;
               break;
            case 117:
               var10000 = 165;
               break;
            case 118:
               var10000 = 11;
               break;
            case 119:
               var10000 = 156;
               break;
            case 120:
               var10000 = 226;
               break;
            case 121:
               var10000 = 166;
               break;
            case 122:
               var10000 = 220;
               break;
            case 123:
               var10000 = 161;
               break;
            case 124:
               var10000 = 9;
               break;
            case 125:
               var10000 = 88;
               break;
            case 126:
               var10000 = 252;
               break;
            case 127:
               var10000 = 204;
               break;
            case 128:
               var10000 = 125;
               break;
            case 129:
               var10000 = 67;
               break;
            case 130:
               var10000 = 177;
               break;
            case 131:
               var10000 = 162;
               break;
            case 132:
               var10000 = 169;
               break;
            case 133:
               var10000 = 24;
               break;
            case 134:
               var10000 = 137;
               break;
            case 135:
               var10000 = 91;
               break;
            case 136:
               var10000 = 40;
               break;
            case 137:
               var10000 = 142;
               break;
            case 138:
               var10000 = 176;
               break;
            case 139:
               var10000 = 196;
               break;
            case 140:
               var10000 = 247;
               break;
            case 141:
               var10000 = 159;
               break;
            case 142:
               var10000 = 90;
               break;
            case 143:
               var10000 = 108;
               break;
            case 144:
               var10000 = 10;
               break;
            case 145:
               var10000 = 171;
               break;
            case 146:
               var10000 = 158;
               break;
            case 147:
               var10000 = 103;
               break;
            case 148:
               var10000 = 6;
               break;
            case 149:
               var10000 = 115;
               break;
            case 150:
               var10000 = 43;
               break;
            case 151:
               var10000 = 78;
               break;
            case 152:
               var10000 = 30;
               break;
            case 153:
               var10000 = 94;
               break;
            case 154:
               var10000 = 233;
               break;
            case 155:
               var10000 = 33;
               break;
            case 156:
               var10000 = 2;
               break;
            case 157:
               var10000 = 151;
               break;
            case 158:
               var10000 = 231;
               break;
            case 159:
               var10000 = 16;
               break;
            case 160:
               var10000 = 104;
               break;
            case 161:
               var10000 = 210;
               break;
            case 162:
               var10000 = 239;
               break;
            case 163:
               var10000 = 164;
               break;
            case 164:
               var10000 = 50;
               break;
            case 165:
               var10000 = 216;
               break;
            case 166:
               var10000 = 170;
               break;
            case 167:
               var10000 = 181;
               break;
            case 168:
               var10000 = 64;
               break;
            case 169:
               var10000 = 126;
               break;
            case 170:
               var10000 = 13;
               break;
            case 171:
               var10000 = 228;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 109;
               break;
            case 174:
               var10000 = 76;
               break;
            case 175:
               var10000 = 123;
               break;
            case 176:
               var10000 = 157;
               break;
            case 177:
               var10000 = 84;
               break;
            case 178:
               var10000 = 73;
               break;
            case 179:
               var10000 = 117;
               break;
            case 180:
               var10000 = 225;
               break;
            case 181:
               var10000 = 195;
               break;
            case 182:
               var10000 = 188;
               break;
            case 183:
               var10000 = 240;
               break;
            case 184:
               var10000 = 21;
               break;
            case 185:
               var10000 = 41;
               break;
            case 186:
               var10000 = 14;
               break;
            case 187:
               var10000 = 79;
               break;
            case 188:
               var10000 = 39;
               break;
            case 189:
               var10000 = 223;
               break;
            case 190:
               var10000 = 4;
               break;
            case 191:
               var10000 = 49;
               break;
            case 192:
               var10000 = 213;
               break;
            case 193:
               var10000 = 120;
               break;
            case 194:
               var10000 = 245;
               break;
            case 195:
               var10000 = 146;
               break;
            case 196:
               var10000 = 25;
               break;
            case 197:
               var10000 = 189;
               break;
            case 198:
               var10000 = 55;
               break;
            case 199:
               var10000 = 184;
               break;
            case 200:
               var10000 = 219;
               break;
            case 201:
               var10000 = 98;
               break;
            case 202:
               var10000 = 255;
               break;
            case 203:
               var10000 = 23;
               break;
            case 204:
               var10000 = 29;
               break;
            case 205:
               var10000 = 232;
               break;
            case 206:
               var10000 = 5;
               break;
            case 207:
               var10000 = 53;
               break;
            case 208:
               var10000 = 37;
               break;
            case 209:
               var10000 = 141;
               break;
            case 210:
               var10000 = 237;
               break;
            case 211:
               var10000 = 47;
               break;
            case 212:
               var10000 = 234;
               break;
            case 213:
               var10000 = 111;
               break;
            case 214:
               var10000 = 89;
               break;
            case 215:
               var10000 = 17;
               break;
            case 216:
               var10000 = 185;
               break;
            case 217:
               var10000 = 211;
               break;
            case 218:
               var10000 = 180;
               break;
            case 219:
               var10000 = 227;
               break;
            case 220:
               var10000 = 36;
               break;
            case 221:
               var10000 = 51;
               break;
            case 222:
               var10000 = 193;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 85;
               break;
            case 225:
               var10000 = 209;
               break;
            case 226:
               var10000 = 1;
               break;
            case 227:
               var10000 = 20;
               break;
            case 228:
               var10000 = 206;
               break;
            case 229:
               var10000 = 107;
               break;
            case 230:
               var10000 = 147;
               break;
            case 231:
               var10000 = 69;
               break;
            case 232:
               var10000 = 62;
               break;
            case 233:
               var10000 = 214;
               break;
            case 234:
               var10000 = 172;
               break;
            case 235:
               var10000 = 127;
               break;
            case 236:
               var10000 = 140;
               break;
            case 237:
               var10000 = 112;
               break;
            case 238:
               var10000 = 38;
               break;
            case 239:
               var10000 = 152;
               break;
            case 240:
               var10000 = 200;
               break;
            case 241:
               var10000 = 31;
               break;
            case 242:
               var10000 = 35;
               break;
            case 243:
               var10000 = 242;
               break;
            case 244:
               var10000 = 19;
               break;
            case 245:
               var10000 = 154;
               break;
            case 246:
               var10000 = 92;
               break;
            case 247:
               var10000 = 119;
               break;
            case 248:
               var10000 = 139;
               break;
            case 249:
               var10000 = 93;
               break;
            case 250:
               var10000 = 179;
               break;
            case 251:
               var10000 = 63;
               break;
            case 252:
               var10000 = 254;
               break;
            case 253:
               var10000 = 83;
               break;
            case 254:
               var10000 = 81;
               break;
            default:
               var10000 = 222;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17856;
      if (i[var3] == null) {
         i[var3] = (int)(g[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "IcdÇ\u0084Àªû\u0006»E\u0017x\u009aû\u0014(\u009dØdý\u0014\u0098ôb¶\u001a>w9°\u0094$\u0010#?\u0007ÖO Ò\u0018\u00007\u00140ô¶\u0096TÓÜs+P\u0017èª\u0086,\u001fÙ=\u0083\u009c\u00075rÜu\u0097ôÆ\u0006z\u0093/¢\u009d \u0007Ï9¯tø\u001d\u0089\u0014\u0017]?|\u0001\u0017\u0007\u0094\u0091ºd¿¸\tI\u0092\u001bÐÄ'";
      int var12 = "IcdÇ\u0084Àªû\u0006»E\u0017x\u009aû\u0014(\u009dØdý\u0014\u0098ôb¶\u001a>w9°\u0094$\u0010#?\u0007ÖO Ò\u0018\u00007\u00140ô¶\u0096TÓÜs+P\u0017èª\u0086,\u001fÙ=\u0083\u009c\u00075rÜu\u0097ôÆ\u0006z\u0093/¢\u009d \u0007Ï9¯tø\u001d\u0089\u0014\u0017]?|\u0001\u0017\u0007\u0094\u0091ºd¿¸\tI\u0092\u001bÐÄ'"
         .length();
      char var9 = '\b';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 126;
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
                        var58 = 112;
                        break;
                     case 1:
                        var58 = 120;
                        break;
                     case 2:
                        var58 = 109;
                        break;
                     case 3:
                        var58 = 68;
                        break;
                     case 4:
                        var58 = 49;
                        break;
                     case 5:
                        var58 = 40;
                        break;
                     default:
                        var58 = 38;
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
                     d = var13;
                     e = new String[11];
                     long var0 = 3553164578915780092L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "QóÖ\u0012ÕaTi\u0093\u0084zìWåZ\u001c";
                     int var5 = "QóÖ\u0012ÕaTi\u0093\u0084zìWåZ\u001c".length();
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

                     g = var6;
                     i = new Integer[2];
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

                  var10 = "Ä\u00ad\u0017þIJ\u0014G\u009dæ\u0005à\u001fôT\u0090\nÞ\u001d-\u0086b¡®TÓ\u000f";
                  var12 = "Ä\u00ad\u0017þIJ\u0014G\u009dæ\u0005à\u001fôT\u0090\nÞ\u001d-\u0086b¡®TÓ\u000f".length();
                  var9 = 6;
                  var16 = -1;
            }

            var10000 = 99;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}






