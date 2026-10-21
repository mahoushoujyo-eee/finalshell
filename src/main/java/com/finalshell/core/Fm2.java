package com.finalshell.core;

import com.finalshell.ui.listener.Dk4;
import com.finalshell.ui.listener.N02;
import com.finalshell.ui.listener.NI3;
import com.finalshell.ui.listener.Rc4;
import com.finalshell.ui.listener.WJ3;
import com.finalshell.ui.model.Pt2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.OS;
import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D.Double;
import java.beans.PropertyChangeListener;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicCheckBoxUI;
import javax.swing.tree.TreeCellRenderer;

public class Fm2 extends BasicCheckBoxUI implements W2_3 {
   public static float[] V;
   public Color H = C_Q.r;
   public Color q = C_Q.X;
   public Color p;
   public Color f;
   public Color R;
   public Color C;
   public Color d;
   public int W;
   public int Z;
   public Insets S;
   public boolean K;
   public boolean b;
   public Stroke x;
   public int r;
   public int v;
   public int G;
   public boolean m;
   public WC_2 g;
   public AO_2 I;
   public WC_2 P;
   public Rectangle i;
   public JCheckBox U;
   public PropertyChangeListener c;
   public PropertyChangeListener y;
   public MouseAdapter Q;
   public ItemListener T;
   public static String[] a;
   public static String[] e;
   public static long[] h;
   public static Long[] j;

   public Fm2() {
      boolean var10000 = UE.Z();
      this.p = C_Q.B;
      boolean var1 = var10000;
      this.f = C_Q.Q;
      this.R = C_Q.D;
      this.C = C_Q.d;
      this.d = C_Q.H;
      this.W = C_Q.l;
      this.Z = C_Q.a;
      this.S = C_Q.I;
      this.K = C_Q.v;
      this.b = C_Q.L;
      this.x = C_Q.t;
      this.r = C_Q.S;
      this.v = C_Q.Y;
      this.G = 0;
      this.U = null;
      if (Ky4.F$arrString() != null) {
         UE.X(!var1);
      }
   }

   public static ComponentUI createUI(JComponent var0) {
      return new Fm2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.U = (JCheckBox)var1;
      this.I = this.s();
      this.I.a(this.U.isEnabled());
      this.I.c(this.U.isSelected() ? Pt2.checked : Pt2.unchecked);
      FN.Y(this.U);
      LookAndFeel.installProperty(this.U, a(20474, -20468), Boolean.FALSE);
      this.U.setIcon(this.H$Icon());
      this.C(this.j());
      this.D();
      this.I();
      this.p$void();
      this.L();
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.g();
      this.v();
      this.E();
      this.U.setIcon(null);
      this.I = null;
      this.U = null;
      super.uninstallUI(var1);
   }

   public AO_2 s() {
      return new As2();
   }

   public void I() {
      this.c = new N02(this);
      this.U.addPropertyChangeListener(a(20479, 8553), this.c);
   }

   public void g() {
      this.U.removePropertyChangeListener(a(20475, -10212), this.c);
   }

   public void p$void() {
      this.g = new WC_2(a(20473, 31790), a(26169, 5170948246833668470L), new com.finalshell.ui.listener.NT(this));
      this.Q = new NI3(this);
      this.U.addMouseListener(this.Q);
   }

   public void v() {
      this.U.removeMouseListener(this.Q);
   }

   public void L() {
      this.P = new WC_2(a(20478, 9392), a(15578, 4753814604053707668L), new Rc4(this));
      this.T = new Dk4(this);
      this.U.addItemListener(this.T);
      this.y = new WJ3(this);
      this.U.addPropertyChangeListener(a(20476, 18121), this.y);
   }

   public void A() {
      Fm2 var10000;
      boolean var1 = UE.Z();
      var10000 = this;
      label35:
      if (!var1) {
         if (this.u$boolean()) {
            var10000 = this;
            if (var1) {
               break label35;
            }

            if (this.O()) {
               var10000 = this;
               if (var1) {
                  break label35;
               }

               if (this.U.isEnabled()) {
                  this.I.U(this.U.isSelected() ? Pt2.checked : Pt2.unchecked);
                  this.P.u$WC();
                  if (!var1) {
                     return;
                  }
               }
            }
         }

         this.P.Y();
         var10000 = this;
      }

      var10000.I.c(this.U.isSelected() ? Pt2.checked : Pt2.unchecked);
      this.U.repaint();
   }

   public void E() {
      this.U.removeItemListener(this.T);
      this.U.removePropertyChangeListener(this.y);
   }

   @Override
   public Shape B() {
      return GA.X(this.U, this.V(), this.n$int());
   }

   public boolean j() {
      boolean var1 = UE.Z();
      boolean var10000 = C_Q.v;
      if (!var1) {
         if (!C_Q.v) {
            return false;
         }

         var10000 = Kp2.S(this.U.getClass(), a(20472, 6788));
      }

      return var1 ? var10000 : !var10000;
   }

   public boolean u$boolean() {
      boolean var10000 = UE.Z();
      Container var2 = this.U.getParent();
      boolean var1 = var10000;
      Container var4 = var2;
      if (!var1) {
         if (var2 == null) {
            return true;
         }

         var4 = var2;
      }

      java.lang.Class var3 = var4.getClass();
      var10000 = Kp2.S(var3, a(20477, -25290));
      if (!var1) {
         if (var10000) {
            return false;
         }

         var10000 = Kp2.S(var3, a(20467, 25086));
      }

      return var1 ? var10000 : !var10000;
   }

   public void D() {
      boolean var1 = UE.o();
      boolean var10000 = FN.l((JComponent)this.U);
      if (var1) {
         if (var10000) {
            return;
         }

         var10000 = this.U.getComponentOrientation().isLeftToRight();
      }

      boolean var2 = var10000;
      Insets var3 = new Insets(this.S.top, var2 ? this.S.left : this.S.right, this.S.bottom, var2 ? this.S.right : this.S.left);
      this.U.setBorder(GA.y(var3));
   }

   public Insets k() {
      return this.S;
   }

   public void G(Insets var1) {
      this.S = var1;
      this.D();
   }

   public boolean O() {
      boolean var1 = UE.o();
      Fm2 var10000 = this;
      if (var1) {
         if (!this.K) {
            return false;
         }

         var10000 = this;
      }

      Object var2 = var10000.U;
      if (var1) {
         if (var10000.U == null) {
            return true;
         }

         var2 = this.U.getParent();
      }

      if (var1) {
         if (var2 == null) {
            return true;
         }

         var2 = this.U.getParent();
      }

      boolean var3 = var2 instanceof OS;
      if (var1) {
         if (var3) {
            return false;
         }

         var3 = this.U.getParent() instanceof TreeCellRenderer;
      }

      return !var1 ? var3 : !var3;
   }

   public void C(boolean var1) {
      this.K = var1;
   }

   public boolean h$boolean() {
      return this.b;
   }

   public void m(boolean var1) {
      this.b = var1;
   }

   public Color J() {
      return this.H;
   }

   public void Z(Color var1) {
      this.H = var1;
   }

   public Color e() {
      return this.q;
   }

   public void p(Color var1) {
      this.q = var1;
   }

   public Color p$Color() {
      return this.p;
   }

   public void O(Color var1) {
      this.p = var1;
   }

   public Color h$Color() {
      return this.f;
   }

   public void R(Color var1) {
      this.f = var1;
   }

   public Color a() {
      return this.R;
   }

   public void b(Color var1) {
      this.R = var1;
   }

   public Color n$Color() {
      return this.C;
   }

   public void B(Color var1) {
      this.C = var1;
   }

   public Color S() {
      return this.d;
   }

   public void n(Color var1) {
      this.d = var1;
   }

   public int n$int() {
      return this.W;
   }

   public void i(int var1) {
      this.W = var1;
   }

   public int V() {
      return this.Z;
   }

   public void f(int var1) {
      this.Z = var1;
   }

   public int H$int() {
      return this.r;
   }

   public void P(int var1) {
      this.r = var1;
   }

   public int R() {
      return this.v;
   }

   public void t(int var1) {
      this.v = var1;
   }

   public Icon H$Icon() {
      return new Ez4(this);
   }

   public Color[] r() {
      boolean var1 = UE.o();
      int var10000 = (this.U.isEnabled()) ? 1 : 0;
      if (var1) {
         if (var10000 != 0) {
            float var2 = this.T();
            float var6;
            var10000 = (var6 = var2 - 1.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
            if (var1) {
               if (var10000 < 0) {
                  return new Color[]{P9.N(this.f, this.C, var2), P9.N(this.R, this.d, var2)};
               }

               var10000 = 2;
            }

            Color[] var5 = new Color[var10000];
            var5[0] = this.C;
            var5[1] = this.d;
            return var5;
         }

         var10000 = 2;
      }

      Color[] var3 = new Color[var10000];
      var3[0] = this.f;
      var3[1] = this.R;
      return var3;
   }

   public float T() {
      return (float)this.G / 5.0F;
   }

   public Rectangle u$Rectangle() {
      boolean var1 = UE.Z();
      Rectangle var10000 = this.i;
      if (!var1) {
         var10000 = this.i != null ? new Rectangle(this.i) : new Rectangle();
      }

      return var10000;
   }

   @Override
   public synchronized void paint(Graphics var1, JComponent var2) {
      Map var3 = FN.B(var1);
      super.paint(var1, var2);
      FN.O(var1, var3);
   }

   public void r(Graphics2D var1, int var2, int var3) {
      this.T(var1, var2, var3);
      this.c(var1, var2, var3);
   }

   public void T(Graphics2D var1, int var2, int var3) {
      byte var5 = (this.U.isEnabled()) ? 1 : 0;
      int var10000 = (UE.Z()) ? 1 : 0;
      Rectangle var6 = new Rectangle(var2 + this.Z, var3 + this.Z, this.r - this.Z * 2 - 1, this.v - this.Z * 2 - 1);
      Double var7 = new Double((double)var6.x, (double)var6.y, (double)var6.width, (double)var6.height, (double)(this.W * 2), (double)(this.W * 2));
      boolean var4 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10000 = var5;
      if (!var4) {
         if (var5 != 0) {
            Color var8 = this.U.isFocusOwner() ? GO.c : GO.r;
            RV.Y(var1, var7, var8, this.Z);
         }

         var10000 = Math.round((float)Math.sqrt((double)(var6.width * var6.width / 2)));
      }

      Stroke var11;
      Color var15;
      label40: {
         label44: {
            int var12 = var10000;
            int var9 = var6.x + var6.width / 2;
            int var10 = var6.y + var6.height / 2;
            var1.setPaint(new RadialGradientPaint((float)var9, (float)var10, (float)var12, V, this.r()));
            var1.fill(var7);
            var11 = RV.M(var1, this.x);
            byte var10001 = var5;
            if (!var4) {
               if (var5 == 0) {
                  var15 = this.p;
                  break label40;
               }

               var14 = this;
               if (var4) {
                  break label44;
               }

               var10001 = (this.b) ? 1 : 0;
            }

            if (var10001 != 0) {
               var15 = P9.N(this.H, this.q, this.T());
               break label40;
            }

            var14 = this;
         }

         var15 = var14.q;
      }

      var1.setPaint(var15);
      var1.draw(var7);
      RV.p(var1, var11);
      if (var4) {
         Ky4.K(new String[3]);
      }
   }

   public void c(Graphics2D var1, int var2, int var3) {
      this.I.O(this.U, var1, var2, var3, this.r, this.v);
   }

   @Override
   public void paintText(Graphics var1, AbstractButton var2, Rectangle var3, String var4) {
      ButtonModel var6 = var2.getModel();
      FontMetrics var7 = FN.L(var2, var1);
      boolean var10000 = UE.Z();
      int var8 = var2.getDisplayedMnemonicIndex();
      boolean var5 = var10000;
      if (!var5) {
         if (var6.isEnabled()) {
            var1.setColor(var2.getForeground());
            FN.W(var1, var4, var8, var3.x + this.getTextShiftOffset(), var3.y + var7.getAscent() + this.getTextShiftOffset());
            if (!var5) {
               return;
            }
         }

         var1.setColor(var2.getBackground().brighter());
         FN.W(var1, var4, var8, var3.x, var3.y + var7.getAscent());
         var1.setColor(var2.getBackground().darker());
      }

      FN.W(var1, var4, var8, var3.x - 1, var3.y + var7.getAscent() - 1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 20475) & 65535;
      if (e[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 71;
               break;
            case 1:
               var10000 = 126;
               break;
            case 2:
               var10000 = 64;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 238;
               break;
            case 5:
               var10000 = 53;
               break;
            case 6:
               var10000 = 26;
               break;
            case 7:
               var10000 = 94;
               break;
            case 8:
               var10000 = 196;
               break;
            case 9:
               var10000 = 154;
               break;
            case 10:
               var10000 = 175;
               break;
            case 11:
               var10000 = 150;
               break;
            case 12:
               var10000 = 12;
               break;
            case 13:
               var10000 = 24;
               break;
            case 14:
               var10000 = 206;
               break;
            case 15:
               var10000 = 0;
               break;
            case 16:
               var10000 = 31;
               break;
            case 17:
               var10000 = 22;
               break;
            case 18:
               var10000 = 193;
               break;
            case 19:
               var10000 = 144;
               break;
            case 20:
               var10000 = 70;
               break;
            case 21:
               var10000 = 47;
               break;
            case 22:
               var10000 = 207;
               break;
            case 23:
               var10000 = 133;
               break;
            case 24:
               var10000 = 34;
               break;
            case 25:
               var10000 = 165;
               break;
            case 26:
               var10000 = 239;
               break;
            case 27:
               var10000 = 45;
               break;
            case 28:
               var10000 = 87;
               break;
            case 29:
               var10000 = 52;
               break;
            case 30:
               var10000 = 185;
               break;
            case 31:
               var10000 = 57;
               break;
            case 32:
               var10000 = 101;
               break;
            case 33:
               var10000 = 3;
               break;
            case 34:
               var10000 = 211;
               break;
            case 35:
               var10000 = 85;
               break;
            case 36:
               var10000 = 220;
               break;
            case 37:
               var10000 = 112;
               break;
            case 38:
               var10000 = 21;
               break;
            case 39:
               var10000 = 20;
               break;
            case 40:
               var10000 = 122;
               break;
            case 41:
               var10000 = 74;
               break;
            case 42:
               var10000 = 46;
               break;
            case 43:
               var10000 = 155;
               break;
            case 44:
               var10000 = 108;
               break;
            case 45:
               var10000 = 177;
               break;
            case 46:
               var10000 = 128;
               break;
            case 47:
               var10000 = 209;
               break;
            case 48:
               var10000 = 197;
               break;
            case 49:
               var10000 = 63;
               break;
            case 50:
               var10000 = 81;
               break;
            case 51:
               var10000 = 118;
               break;
            case 52:
               var10000 = 179;
               break;
            case 53:
               var10000 = 69;
               break;
            case 54:
               var10000 = 60;
               break;
            case 55:
               var10000 = 222;
               break;
            case 56:
               var10000 = 166;
               break;
            case 57:
               var10000 = 79;
               break;
            case 58:
               var10000 = 18;
               break;
            case 59:
               var10000 = 58;
               break;
            case 60:
               var10000 = 254;
               break;
            case 61:
               var10000 = 236;
               break;
            case 62:
               var10000 = 174;
               break;
            case 63:
               var10000 = 208;
               break;
            case 64:
               var10000 = 167;
               break;
            case 65:
               var10000 = 93;
               break;
            case 66:
               var10000 = 237;
               break;
            case 67:
               var10000 = 205;
               break;
            case 68:
               var10000 = 48;
               break;
            case 69:
               var10000 = 189;
               break;
            case 70:
               var10000 = 106;
               break;
            case 71:
               var10000 = 242;
               break;
            case 72:
               var10000 = 188;
               break;
            case 73:
               var10000 = 120;
               break;
            case 74:
               var10000 = 194;
               break;
            case 75:
               var10000 = 28;
               break;
            case 76:
               var10000 = 168;
               break;
            case 77:
               var10000 = 99;
               break;
            case 78:
               var10000 = 32;
               break;
            case 79:
               var10000 = 36;
               break;
            case 80:
               var10000 = 137;
               break;
            case 81:
               var10000 = 152;
               break;
            case 82:
               var10000 = 210;
               break;
            case 83:
               var10000 = 142;
               break;
            case 84:
               var10000 = 198;
               break;
            case 85:
               var10000 = 15;
               break;
            case 86:
               var10000 = 146;
               break;
            case 87:
               var10000 = 8;
               break;
            case 88:
               var10000 = 13;
               break;
            case 89:
               var10000 = 30;
               break;
            case 90:
               var10000 = 247;
               break;
            case 91:
               var10000 = 255;
               break;
            case 92:
               var10000 = 221;
               break;
            case 93:
               var10000 = 75;
               break;
            case 94:
               var10000 = 41;
               break;
            case 95:
               var10000 = 226;
               break;
            case 96:
               var10000 = 61;
               break;
            case 97:
               var10000 = 252;
               break;
            case 98:
               var10000 = 39;
               break;
            case 99:
               var10000 = 173;
               break;
            case 100:
               var10000 = 96;
               break;
            case 101:
               var10000 = 212;
               break;
            case 102:
               var10000 = 187;
               break;
            case 103:
               var10000 = 131;
               break;
            case 104:
               var10000 = 16;
               break;
            case 105:
               var10000 = 59;
               break;
            case 106:
               var10000 = 5;
               break;
            case 107:
               var10000 = 78;
               break;
            case 108:
               var10000 = 102;
               break;
            case 109:
               var10000 = 178;
               break;
            case 110:
               var10000 = 186;
               break;
            case 111:
               var10000 = 134;
               break;
            case 112:
               var10000 = 199;
               break;
            case 113:
               var10000 = 233;
               break;
            case 114:
               var10000 = 241;
               break;
            case 115:
               var10000 = 191;
               break;
            case 116:
               var10000 = 17;
               break;
            case 117:
               var10000 = 80;
               break;
            case 118:
               var10000 = 184;
               break;
            case 119:
               var10000 = 218;
               break;
            case 120:
               var10000 = 147;
               break;
            case 121:
               var10000 = 23;
               break;
            case 122:
               var10000 = 244;
               break;
            case 123:
               var10000 = 214;
               break;
            case 124:
               var10000 = 225;
               break;
            case 125:
               var10000 = 195;
               break;
            case 126:
               var10000 = 139;
               break;
            case 127:
               var10000 = 203;
               break;
            case 128:
               var10000 = 246;
               break;
            case 129:
               var10000 = 4;
               break;
            case 130:
               var10000 = 171;
               break;
            case 131:
               var10000 = 116;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 219;
               break;
            case 134:
               var10000 = 73;
               break;
            case 135:
               var10000 = 14;
               break;
            case 136:
               var10000 = 44;
               break;
            case 137:
               var10000 = 121;
               break;
            case 138:
               var10000 = 7;
               break;
            case 139:
               var10000 = 105;
               break;
            case 140:
               var10000 = 135;
               break;
            case 141:
               var10000 = 25;
               break;
            case 142:
               var10000 = 158;
               break;
            case 143:
               var10000 = 125;
               break;
            case 144:
               var10000 = 76;
               break;
            case 145:
               var10000 = 104;
               break;
            case 146:
               var10000 = 140;
               break;
            case 147:
               var10000 = 100;
               break;
            case 148:
               var10000 = 123;
               break;
            case 149:
               var10000 = 6;
               break;
            case 150:
               var10000 = 86;
               break;
            case 151:
               var10000 = 130;
               break;
            case 152:
               var10000 = 216;
               break;
            case 153:
               var10000 = 157;
               break;
            case 154:
               var10000 = 109;
               break;
            case 155:
               var10000 = 107;
               break;
            case 156:
               var10000 = 77;
               break;
            case 157:
               var10000 = 33;
               break;
            case 158:
               var10000 = 38;
               break;
            case 159:
               var10000 = 172;
               break;
            case 160:
               var10000 = 114;
               break;
            case 161:
               var10000 = 202;
               break;
            case 162:
               var10000 = 2;
               break;
            case 163:
               var10000 = 224;
               break;
            case 164:
               var10000 = 169;
               break;
            case 165:
               var10000 = 98;
               break;
            case 166:
               var10000 = 132;
               break;
            case 167:
               var10000 = 213;
               break;
            case 168:
               var10000 = 234;
               break;
            case 169:
               var10000 = 49;
               break;
            case 170:
               var10000 = 9;
               break;
            case 171:
               var10000 = 72;
               break;
            case 172:
               var10000 = 149;
               break;
            case 173:
               var10000 = 90;
               break;
            case 174:
               var10000 = 97;
               break;
            case 175:
               var10000 = 40;
               break;
            case 176:
               var10000 = 55;
               break;
            case 177:
               var10000 = 143;
               break;
            case 178:
               var10000 = 182;
               break;
            case 179:
               var10000 = 27;
               break;
            case 180:
               var10000 = 103;
               break;
            case 181:
               var10000 = 91;
               break;
            case 182:
               var10000 = 227;
               break;
            case 183:
               var10000 = 119;
               break;
            case 184:
               var10000 = 200;
               break;
            case 185:
               var10000 = 92;
               break;
            case 186:
               var10000 = 50;
               break;
            case 187:
               var10000 = 83;
               break;
            case 188:
               var10000 = 115;
               break;
            case 189:
               var10000 = 245;
               break;
            case 190:
               var10000 = 84;
               break;
            case 191:
               var10000 = 161;
               break;
            case 192:
               var10000 = 190;
               break;
            case 193:
               var10000 = 1;
               break;
            case 194:
               var10000 = 124;
               break;
            case 195:
               var10000 = 136;
               break;
            case 196:
               var10000 = 248;
               break;
            case 197:
               var10000 = 240;
               break;
            case 198:
               var10000 = 95;
               break;
            case 199:
               var10000 = 153;
               break;
            case 200:
               var10000 = 66;
               break;
            case 201:
               var10000 = 192;
               break;
            case 202:
               var10000 = 19;
               break;
            case 203:
               var10000 = 230;
               break;
            case 204:
               var10000 = 232;
               break;
            case 205:
               var10000 = 160;
               break;
            case 206:
               var10000 = 148;
               break;
            case 207:
               var10000 = 235;
               break;
            case 208:
               var10000 = 68;
               break;
            case 209:
               var10000 = 201;
               break;
            case 210:
               var10000 = 10;
               break;
            case 211:
               var10000 = 65;
               break;
            case 212:
               var10000 = 229;
               break;
            case 213:
               var10000 = 183;
               break;
            case 214:
               var10000 = 62;
               break;
            case 215:
               var10000 = 156;
               break;
            case 216:
               var10000 = 43;
               break;
            case 217:
               var10000 = 223;
               break;
            case 218:
               var10000 = 42;
               break;
            case 219:
               var10000 = 170;
               break;
            case 220:
               var10000 = 231;
               break;
            case 221:
               var10000 = 217;
               break;
            case 222:
               var10000 = 89;
               break;
            case 223:
               var10000 = 110;
               break;
            case 224:
               var10000 = 180;
               break;
            case 225:
               var10000 = 249;
               break;
            case 226:
               var10000 = 11;
               break;
            case 227:
               var10000 = 127;
               break;
            case 228:
               var10000 = 141;
               break;
            case 229:
               var10000 = 243;
               break;
            case 230:
               var10000 = 56;
               break;
            case 231:
               var10000 = 159;
               break;
            case 232:
               var10000 = 151;
               break;
            case 233:
               var10000 = 250;
               break;
            case 234:
               var10000 = 117;
               break;
            case 235:
               var10000 = 253;
               break;
            case 236:
               var10000 = 215;
               break;
            case 237:
               var10000 = 163;
               break;
            case 238:
               var10000 = 204;
               break;
            case 239:
               var10000 = 88;
               break;
            case 240:
               var10000 = 138;
               break;
            case 241:
               var10000 = 54;
               break;
            case 242:
               var10000 = 162;
               break;
            case 243:
               var10000 = 51;
               break;
            case 244:
               var10000 = 82;
               break;
            case 245:
               var10000 = 67;
               break;
            case 246:
               var10000 = 111;
               break;
            case 247:
               var10000 = 113;
               break;
            case 248:
               var10000 = 35;
               break;
            case 249:
               var10000 = 145;
               break;
            case 250:
               var10000 = 129;
               break;
            case 251:
               var10000 = 176;
               break;
            case 252:
               var10000 = 251;
               break;
            case 253:
               var10000 = 164;
               break;
            case 254:
               var10000 = 37;
               break;
            default:
               var10000 = 29;
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

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18254) & 32767;
      if (j[var3] == null) {
         j[var3] = h[var3] ^ var1;
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "Xðf\u0091Dtú\u0006¬p³OçÞ\u0017\u0096\u0019Èçö¿/þ\ns}\u0010\u009c$:ªùà\r\u000eÊBs#î'z\u0006LO=c\u009e\u000fæ¾U©\u009dã\u0081\u0011\u0014ðì\u0002pµ<\u0091¢|^c\b\u0080åt9\u0007\u009c°þ\u0099Wu\u0098\u0019Í\u001c£G\u009b«\u0082|¿#Ë\u001aJeë\u0086\u0093ÿ\f!í\u0090\u0083ÿ¶\u001f¾Fp*\rÊ\u0015Ó\u009b\u0019F|Añ\u001fèÑp\u001eË·\u009cRôI^Vò\u007fJ\u001a";
      int var12 = "Xðf\u0091Dtú\u0006¬p³OçÞ\u0017\u0096\u0019Èçö¿/þ\ns}\u0010\u009c$:ªùà\r\u000eÊBs#î'z\u0006LO=c\u009e\u000fæ¾U©\u009dã\u0081\u0011\u0014ðì\u0002pµ<\u0091¢|^c\b\u0080åt9\u0007\u009c°þ\u0099Wu\u0098\u0019Í\u001c£G\u009b«\u0082|¿#Ë\u001aJeë\u0086\u0093ÿ\f!í\u0090\u0083ÿ¶\u001f¾Fp*\rÊ\u0015Ó\u009b\u0019F|Añ\u001fèÑp\u001eË·\u009cRôI^Vò\u007fJ\u001a"
         .length();
      char var9 = 7;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 93;
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
                        var58 = 90;
                        break;
                     case 1:
                        var58 = 53;
                        break;
                     case 2:
                        var58 = 120;
                        break;
                     case 3:
                        var58 = 30;
                        break;
                     case 4:
                        var58 = 80;
                        break;
                     case 5:
                        var58 = 56;
                        break;
                     default:
                        var58 = 11;
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
                     e = new String[9];
                     long var0 = 6652424685173263207L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u001dªØ3\\e°Û\u001b\u0090Ï\tÒ¹ê9";
                     int var5 = "\u001dªØ3\\e°Û\u001b\u0090Ï\tÒ¹ê9".length();
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

                     h = var6;
                     j = new Long[2];
                     V = new float[]{0.0F, 1.0F};
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

                  var10 = "!óbðF+\f\b\u0001Ä\u00040\u0013«|1\u009d^\u001d\u0092³£c>o%¾fT\u008c®v\u008dÈ8'¼\u0007µ\u008dÃ\u008eyEëàÍ`{";
                  var12 = "!óbðF+\f\b\u0001Ä\u00040\u0013«|1\u009d^\u001d\u0092³£c>o%¾fT\u008c®v\u008dÈ8'¼\u0007µ\u008dÃ\u008eyEëàÍ`{".length();
                  var9 = 5;
                  var16 = -1;
            }

            var10000 = 55;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





