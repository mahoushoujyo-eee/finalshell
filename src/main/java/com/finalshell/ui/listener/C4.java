package com.finalshell.ui.listener;

import com.finalshell.core.B5_2;
import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.GO;
import com.finalshell.core.K4_2;
import com.finalshell.core.P9;
import com.finalshell.core.V4_2;
import com.finalshell.core.W2_3;
import com.finalshell.core.WC_2;
import com.finalshell.core.Xg2;
import com.finalshell.ui.panel.Ky4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;

public class C4 extends BasicRadioButtonUI implements PropertyChangeListener, W2_3 {
   public static List S;
   public static ImageIcon p;
   public Color H = V4_2.S;
   public Color Z = V4_2.M;
   public Color e;
   public Color o;
   public Color O;
   public Color F;
   public Color q;
   public int B;
   public Insets f;
   public boolean z;
   public boolean Q;
   public Stroke m;
   public int P;
   public int R;
   public int t;
   public boolean d;
   public WC_2 y;
   public int i;
   public boolean v;
   public WC_2 r;
   public Rectangle D;
   public JRadioButton u;
   public MouseAdapter V;
   public ItemListener T;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] g;
   public static long[] h;
   public static Long[] j;

   public C4() {
      this.e = V4_2.e;
      this.o = V4_2.k;
      this.O = V4_2.p;
      this.F = V4_2.U;
      this.q = V4_2.d;
      this.B = V4_2.t;
      this.f = V4_2.A;
      this.z = V4_2.s;
      this.Q = V4_2.n;
      this.m = new BasicStroke(1.5F);
      this.P = a(16740, 371257481157915169L);
      this.R = a(1660, 5206708749279982904L);
      this.t = 0;
   }

   public static ComponentUI createUI(JComponent var0) {
      return new C4();
   }

   @Override
   public void installUI(JComponent var1) {
      boolean var10000 = K4_2.Z$boolean();
      super.installUI(var1);
      boolean var2 = var10000;
      this.u = (JRadioButton)var1;
      FN.Y(this.u);
      LookAndFeel.installProperty(this.u, a(-15603, -20310), Boolean.FALSE);
      int var10001 = (this.u.isSelected()) ? 1 : 0;
      if (var2) {
         var10001 = var10001 != 0 ? S.size() - 1 : 0;
      }

      this.i = var10001;
      this.c$void();
      this.a(this.u);
      this.y = new WC_2(a(-15601, -27218), b(27577, 7805315119986895795L), new Y8(this, var1));
      this.V = new J3(this, var1);
      this.u.addMouseListener(this.V);
      this.r = new WC_2(a(-15605, -26748), b(22970, 7293637536917150129L), new A4(this));
      this.T = new G3(this);
      this.u.addItemListener(this.T);
      this.u.addPropertyChangeListener(a(-15607, 27154), this);
      if (Ky4.F$arrString() != null) {
         K4_2.G(!var2);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.u.removePropertyChangeListener(a(-15606, 23449), this);
      this.u.removeMouseListener(this.V);
      this.u.removeItemListener(this.T);
      this.u.setIcon(null);
      this.u = null;
      super.uninstallUI(var1);
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.K();
   }

   protected void K() {
      boolean var10000 = K4_2.V();
      this.r.Y();
      boolean var1 = var10000;
      int var10001 = (this.u.isSelected()) ? 1 : 0;
      if (!var1) {
         var10001 = var10001 != 0 ? S.size() - 1 : 0;
      }

      this.i = var10001;
      this.u.repaint();
   }

   public Shape B$Shape() {
      return GA.X(this.u, this.V(), this.A());
   }

   public void c$void() {
      boolean var1 = K4_2.V();
      boolean var10000 = FN.l((JComponent)this.u);
      if (!var1) {
         if (var10000) {
            return;
         }

         var10000 = this.u.getComponentOrientation().isLeftToRight();
      }

      boolean var2 = var10000;
      Insets var3 = new Insets(this.f.top, var2 ? this.f.left : this.f.right, this.f.bottom, var2 ? this.f.right : this.f.left);
      this.u.setBorder(GA.y(var3));
   }

   public Insets E() {
      return this.f;
   }

   public void t(Insets var1) {
      this.f = var1;
      this.c$void();
   }

   public boolean w() {
      boolean var1 = K4_2.V();
      C4 var10000 = this;
      if (!var1) {
         if (!this.z) {
            return false;
         }

         var10000 = this;
      }

      Object var2 = var10000.u;
      if (!var1) {
         if (var10000.u == null) {
            return true;
         }

         var2 = this.u.getParent();
      }

      if (!var1) {
         if (var2 == null) {
            return true;
         }

         var2 = this.u.getParent();
      }

      boolean var3 = var2 instanceof com.finalshell.ui.panel.OS;
      if (!var1) {
         if (var3) {
            return false;
         }

         var3 = this.u.getParent() instanceof com.finalshell.ui.panel.G;
      }

      return var1 ? var3 : !var3;
   }

   public void r(boolean var1) {
      this.z = var1;
   }

   public boolean e() {
      return this.Q;
   }

   public void t(boolean var1) {
      this.Q = var1;
   }

   public Color H() {
      return this.H;
   }

   public void i(Color var1) {
      this.H = var1;
   }

   public Color D() {
      return this.Z;
   }

   public void k(Color var1) {
      this.Z = var1;
   }

   public Color k() {
      return this.e;
   }

   public void O(Color var1) {
      this.e = var1;
   }

   public Color B$Color() {
      return this.o;
   }

   public void J(Color var1) {
      this.o = var1;
   }

   public Color L() {
      return this.O;
   }

   public void G(Color var1) {
      this.O = var1;
   }

   public Color i() {
      return this.F;
   }

   public void a(Color var1) {
      this.F = var1;
   }

   public Color c$Color() {
      return this.q;
   }

   public void T(Color var1) {
      this.q = var1;
   }

   public int A() {
      return a(26262, 6162692780123461072L);
   }

   public int V() {
      return this.B;
   }

   public void u(int var1) {
      this.B = var1;
   }

   public int d() {
      return this.P;
   }

   public void c(int var1) {
      this.P = var1;
   }

   public int q() {
      return this.R;
   }

   public void G(int var1) {
      this.R = var1;
   }

   public void a(JRadioButton var1) {
      var1.setIcon(new B5_2(this, var1));
   }

   public Color[] N(JRadioButton var1) {
      boolean var2 = K4_2.Z$boolean();
      int var10000 = (var1.isEnabled()) ? 1 : 0;
      if (var2) {
         if (var10000 != 0) {
            float var3 = this.T$float();
            float var7;
            var10000 = (var7 = var3 - 1.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
            if (var2) {
               if (var10000 < 0) {
                  return new Color[]{P9.N(this.o, this.F, var3), P9.N(this.O, this.q, var3)};
               }

               var10000 = 2;
            }

            Color[] var6 = new Color[var10000];
            var6[0] = this.F;
            var6[1] = this.q;
            return var6;
         }

         var10000 = 2;
      }

      Color[] var4 = new Color[var10000];
      var4[0] = this.o;
      var4[1] = this.O;
      return var4;
   }

   public float T$float() {
      return (float)this.t / 5.0F;
   }

   public Rectangle T$Rectangle() {
      boolean var1 = K4_2.V();
      Rectangle var10000 = this.D;
      if (!var1) {
         var10000 = this.D != null ? new Rectangle(this.D) : new Rectangle();
      }

      return var10000;
   }

   @Override
   public synchronized void paint(Graphics var1, JComponent var2) {
      Map var3 = FN.B(var1);
      super.paint(var1, var2);
      FN.O(var1, var3);
   }

   @Override
   protected void paintText(Graphics var1, JComponent var2, Rectangle var3, String var4) {
      boolean var10000 = K4_2.V();
      AbstractButton var6 = (AbstractButton)var2;
      boolean var5 = var10000;
      ButtonModel var7 = var6.getModel();
      FontMetrics var8 = FN.L(var2, var1);
      int var9 = var6.getDisplayedMnemonicIndex();
      if (!var5) {
         if (var7.isEnabled()) {
            var1.setColor(var6.getForeground());
            FN.W(var1, var4, var9, var3.x + this.getTextShiftOffset(), var3.y + var8.getAscent() + this.getTextShiftOffset());
            if (!var5) {
               return;
            }
         }

         var1.setColor(var6.getBackground().brighter());
         FN.W(var1, var4, var9, var3.x, var3.y + var8.getAscent());
         var1.setColor(var6.getBackground().darker());
      }

      FN.W(var1, var4, var9, var3.x - 1, var3.y + var8.getAscent() - 1);
   }

   static boolean i(C4 var0) {
      return var0.d;
   }

   static int D(C4 var0) {
      return var0.t;
   }

   static int w(C4 var0) {
      return var0.t++;
   }

   static int E(C4 var0) {
      return var0.t--;
   }

   static WC_2 T$WC(C4 var0) {
      return var0.y;
   }

   static boolean m(C4 var0, boolean var1) {
      return var0.d = var1;
   }

   static int z(C4 var0, int var1) {
      return var0.t = var1;
   }

   static boolean P(C4 var0) {
      return var0.v;
   }

   static int C$int(C4 var0) {
      return var0.i;
   }

   static int N(C4 var0) {
      return var0.i++;
   }

   static JRadioButton T$JRadioButton(C4 var0) {
      return var0.u;
   }

   static int B(C4 var0) {
      return var0.i--;
   }

   static WC_2 t(C4 var0) {
      return var0.r;
   }

   static boolean l(C4 var0) {
      return var0.z;
   }

   static boolean K(C4 var0, boolean var1) {
      return var0.v = var1;
   }

   static Rectangle f(C4 var0, Rectangle var1) {
      return var0.D = var1;
   }

   static int L$int(C4 var0) {
      return var0.P;
   }

   static int c(C4 var0) {
      return var0.R;
   }

   static int e(C4 var0) {
      return var0.B;
   }

   static Color[] W(C4 var0, JRadioButton var1) {
      return var0.N(var1);
   }

   static boolean f(C4 var0) {
      return var0.Q;
   }

   static Color O(C4 var0) {
      return var0.H;
   }

   static Color L$Color(C4 var0) {
      return var0.Z;
   }

   static float T$float(C4 var0) {
      return var0.T$float();
   }

   static Color C$Color(C4 var0) {
      return var0.e;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -15602) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 62;
               break;
            case 1:
               var10000 = 74;
               break;
            case 2:
               var10000 = 30;
               break;
            case 3:
               var10000 = 3;
               break;
            case 4:
               var10000 = 174;
               break;
            case 5:
               var10000 = 65;
               break;
            case 6:
               var10000 = 39;
               break;
            case 7:
               var10000 = 11;
               break;
            case 8:
               var10000 = 51;
               break;
            case 9:
               var10000 = 197;
               break;
            case 10:
               var10000 = 235;
               break;
            case 11:
               var10000 = 38;
               break;
            case 12:
               var10000 = 242;
               break;
            case 13:
               var10000 = 52;
               break;
            case 14:
               var10000 = 60;
               break;
            case 15:
               var10000 = 75;
               break;
            case 16:
               var10000 = 58;
               break;
            case 17:
               var10000 = 17;
               break;
            case 18:
               var10000 = 117;
               break;
            case 19:
               var10000 = 9;
               break;
            case 20:
               var10000 = 100;
               break;
            case 21:
               var10000 = 208;
               break;
            case 22:
               var10000 = 138;
               break;
            case 23:
               var10000 = 193;
               break;
            case 24:
               var10000 = 25;
               break;
            case 25:
               var10000 = 119;
               break;
            case 26:
               var10000 = 170;
               break;
            case 27:
               var10000 = 44;
               break;
            case 28:
               var10000 = 248;
               break;
            case 29:
               var10000 = 124;
               break;
            case 30:
               var10000 = 205;
               break;
            case 31:
               var10000 = 181;
               break;
            case 32:
               var10000 = 122;
               break;
            case 33:
               var10000 = 241;
               break;
            case 34:
               var10000 = 249;
               break;
            case 35:
               var10000 = 150;
               break;
            case 36:
               var10000 = 41;
               break;
            case 37:
               var10000 = 201;
               break;
            case 38:
               var10000 = 126;
               break;
            case 39:
               var10000 = 135;
               break;
            case 40:
               var10000 = 190;
               break;
            case 41:
               var10000 = 226;
               break;
            case 42:
               var10000 = 225;
               break;
            case 43:
               var10000 = 118;
               break;
            case 44:
               var10000 = 43;
               break;
            case 45:
               var10000 = 42;
               break;
            case 46:
               var10000 = 133;
               break;
            case 47:
               var10000 = 111;
               break;
            case 48:
               var10000 = 251;
               break;
            case 49:
               var10000 = 19;
               break;
            case 50:
               var10000 = 14;
               break;
            case 51:
               var10000 = 93;
               break;
            case 52:
               var10000 = 71;
               break;
            case 53:
               var10000 = 12;
               break;
            case 54:
               var10000 = 168;
               break;
            case 55:
               var10000 = 82;
               break;
            case 56:
               var10000 = 108;
               break;
            case 57:
               var10000 = 145;
               break;
            case 58:
               var10000 = 26;
               break;
            case 59:
               var10000 = 187;
               break;
            case 60:
               var10000 = 105;
               break;
            case 61:
               var10000 = 132;
               break;
            case 62:
               var10000 = 185;
               break;
            case 63:
               var10000 = 59;
               break;
            case 64:
               var10000 = 151;
               break;
            case 65:
               var10000 = 32;
               break;
            case 66:
               var10000 = 129;
               break;
            case 67:
               var10000 = 87;
               break;
            case 68:
               var10000 = 210;
               break;
            case 69:
               var10000 = 164;
               break;
            case 70:
               var10000 = 123;
               break;
            case 71:
               var10000 = 91;
               break;
            case 72:
               var10000 = 33;
               break;
            case 73:
               var10000 = 152;
               break;
            case 74:
               var10000 = 234;
               break;
            case 75:
               var10000 = 72;
               break;
            case 76:
               var10000 = 209;
               break;
            case 77:
               var10000 = 57;
               break;
            case 78:
               var10000 = 139;
               break;
            case 79:
               var10000 = 85;
               break;
            case 80:
               var10000 = 194;
               break;
            case 81:
               var10000 = 224;
               break;
            case 82:
               var10000 = 239;
               break;
            case 83:
               var10000 = 177;
               break;
            case 84:
               var10000 = 6;
               break;
            case 85:
               var10000 = 141;
               break;
            case 86:
               var10000 = 128;
               break;
            case 87:
               var10000 = 167;
               break;
            case 88:
               var10000 = 227;
               break;
            case 89:
               var10000 = 159;
               break;
            case 90:
               var10000 = 67;
               break;
            case 91:
               var10000 = 36;
               break;
            case 92:
               var10000 = 214;
               break;
            case 93:
               var10000 = 212;
               break;
            case 94:
               var10000 = 156;
               break;
            case 95:
               var10000 = 253;
               break;
            case 96:
               var10000 = 204;
               break;
            case 97:
               var10000 = 202;
               break;
            case 98:
               var10000 = 146;
               break;
            case 99:
               var10000 = 157;
               break;
            case 100:
               var10000 = 13;
               break;
            case 101:
               var10000 = 21;
               break;
            case 102:
               var10000 = 7;
               break;
            case 103:
               var10000 = 10;
               break;
            case 104:
               var10000 = 35;
               break;
            case 105:
               var10000 = 213;
               break;
            case 106:
               var10000 = 166;
               break;
            case 107:
               var10000 = 161;
               break;
            case 108:
               var10000 = 230;
               break;
            case 109:
               var10000 = 125;
               break;
            case 110:
               var10000 = 79;
               break;
            case 111:
               var10000 = 220;
               break;
            case 112:
               var10000 = 98;
               break;
            case 113:
               var10000 = 250;
               break;
            case 114:
               var10000 = 142;
               break;
            case 115:
               var10000 = 64;
               break;
            case 116:
               var10000 = 22;
               break;
            case 117:
               var10000 = 175;
               break;
            case 118:
               var10000 = 1;
               break;
            case 119:
               var10000 = 158;
               break;
            case 120:
               var10000 = 180;
               break;
            case 121:
               var10000 = 102;
               break;
            case 122:
               var10000 = 55;
               break;
            case 123:
               var10000 = 107;
               break;
            case 124:
               var10000 = 8;
               break;
            case 125:
               var10000 = 90;
               break;
            case 126:
               var10000 = 231;
               break;
            case 127:
               var10000 = 243;
               break;
            case 128:
               var10000 = 84;
               break;
            case 129:
               var10000 = 173;
               break;
            case 130:
               var10000 = 48;
               break;
            case 131:
               var10000 = 218;
               break;
            case 132:
               var10000 = 171;
               break;
            case 133:
               var10000 = 76;
               break;
            case 134:
               var10000 = 255;
               break;
            case 135:
               var10000 = 219;
               break;
            case 136:
               var10000 = 97;
               break;
            case 137:
               var10000 = 228;
               break;
            case 138:
               var10000 = 88;
               break;
            case 139:
               var10000 = 254;
               break;
            case 140:
               var10000 = 130;
               break;
            case 141:
               var10000 = 50;
               break;
            case 142:
               var10000 = 148;
               break;
            case 143:
               var10000 = 77;
               break;
            case 144:
               var10000 = 143;
               break;
            case 145:
               var10000 = 233;
               break;
            case 146:
               var10000 = 223;
               break;
            case 147:
               var10000 = 73;
               break;
            case 148:
               var10000 = 121;
               break;
            case 149:
               var10000 = 45;
               break;
            case 150:
               var10000 = 192;
               break;
            case 151:
               var10000 = 69;
               break;
            case 152:
               var10000 = 155;
               break;
            case 153:
               var10000 = 163;
               break;
            case 154:
               var10000 = 131;
               break;
            case 155:
               var10000 = 162;
               break;
            case 156:
               var10000 = 189;
               break;
            case 157:
               var10000 = 236;
               break;
            case 158:
               var10000 = 23;
               break;
            case 159:
               var10000 = 144;
               break;
            case 160:
               var10000 = 199;
               break;
            case 161:
               var10000 = 18;
               break;
            case 162:
               var10000 = 134;
               break;
            case 163:
               var10000 = 66;
               break;
            case 164:
               var10000 = 120;
               break;
            case 165:
               var10000 = 244;
               break;
            case 166:
               var10000 = 2;
               break;
            case 167:
               var10000 = 28;
               break;
            case 168:
               var10000 = 217;
               break;
            case 169:
               var10000 = 80;
               break;
            case 170:
               var10000 = 15;
               break;
            case 171:
               var10000 = 114;
               break;
            case 172:
               var10000 = 237;
               break;
            case 173:
               var10000 = 115;
               break;
            case 174:
               var10000 = 81;
               break;
            case 175:
               var10000 = 37;
               break;
            case 176:
               var10000 = 200;
               break;
            case 177:
               var10000 = 113;
               break;
            case 178:
               var10000 = 147;
               break;
            case 179:
               var10000 = 211;
               break;
            case 180:
               var10000 = 240;
               break;
            case 181:
               var10000 = 40;
               break;
            case 182:
               var10000 = 56;
               break;
            case 183:
               var10000 = 215;
               break;
            case 184:
               var10000 = 178;
               break;
            case 185:
               var10000 = 94;
               break;
            case 186:
               var10000 = 136;
               break;
            case 187:
               var10000 = 195;
               break;
            case 188:
               var10000 = 140;
               break;
            case 189:
               var10000 = 165;
               break;
            case 190:
               var10000 = 104;
               break;
            case 191:
               var10000 = 169;
               break;
            case 192:
               var10000 = 31;
               break;
            case 193:
               var10000 = 110;
               break;
            case 194:
               var10000 = 54;
               break;
            case 195:
               var10000 = 172;
               break;
            case 196:
               var10000 = 206;
               break;
            case 197:
               var10000 = 78;
               break;
            case 198:
               var10000 = 232;
               break;
            case 199:
               var10000 = 252;
               break;
            case 200:
               var10000 = 247;
               break;
            case 201:
               var10000 = 203;
               break;
            case 202:
               var10000 = 221;
               break;
            case 203:
               var10000 = 184;
               break;
            case 204:
               var10000 = 153;
               break;
            case 205:
               var10000 = 83;
               break;
            case 206:
               var10000 = 29;
               break;
            case 207:
               var10000 = 196;
               break;
            case 208:
               var10000 = 61;
               break;
            case 209:
               var10000 = 99;
               break;
            case 210:
               var10000 = 216;
               break;
            case 211:
               var10000 = 68;
               break;
            case 212:
               var10000 = 53;
               break;
            case 213:
               var10000 = 149;
               break;
            case 214:
               var10000 = 179;
               break;
            case 215:
               var10000 = 116;
               break;
            case 216:
               var10000 = 222;
               break;
            case 217:
               var10000 = 127;
               break;
            case 218:
               var10000 = 245;
               break;
            case 219:
               var10000 = 188;
               break;
            case 220:
               var10000 = 160;
               break;
            case 221:
               var10000 = 101;
               break;
            case 222:
               var10000 = 95;
               break;
            case 223:
               var10000 = 16;
               break;
            case 224:
               var10000 = 137;
               break;
            case 225:
               var10000 = 106;
               break;
            case 226:
               var10000 = 49;
               break;
            case 227:
               var10000 = 47;
               break;
            case 228:
               var10000 = 24;
               break;
            case 229:
               var10000 = 27;
               break;
            case 230:
               var10000 = 46;
               break;
            case 231:
               var10000 = 70;
               break;
            case 232:
               var10000 = 154;
               break;
            case 233:
               var10000 = 92;
               break;
            case 234:
               var10000 = 63;
               break;
            case 235:
               var10000 = 238;
               break;
            case 236:
               var10000 = 86;
               break;
            case 237:
               var10000 = 103;
               break;
            case 238:
               var10000 = 198;
               break;
            case 239:
               var10000 = 0;
               break;
            case 240:
               var10000 = 182;
               break;
            case 241:
               var10000 = 5;
               break;
            case 242:
               var10000 = 89;
               break;
            case 243:
               var10000 = 109;
               break;
            case 244:
               var10000 = 229;
               break;
            case 245:
               var10000 = 176;
               break;
            case 246:
               var10000 = 207;
               break;
            case 247:
               var10000 = 20;
               break;
            case 248:
               var10000 = 191;
               break;
            case 249:
               var10000 = 96;
               break;
            case 250:
               var10000 = 246;
               break;
            case 251:
               var10000 = 112;
               break;
            case 252:
               var10000 = 34;
               break;
            case 253:
               var10000 = 4;
               break;
            case 254:
               var10000 = 186;
               break;
            default:
               var10000 = 183;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29508;
      if (g[var3] == null) {
         g[var3] = (int)(c[var3] ^ var1);
      }

      return g[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 11) & 32767;
      if (j[var3] == null) {
         j[var3] = h[var3] ^ var1;
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[8];
      int var19 = 0;
      String var18 = "9ô\r 2³\u0003\u001a\u0089æï\u0018ÐT\u0005\u0003P\u0096+\u001fÛL¢\u0095\u0084ï~\u00ad\u000f \b\u0099vÙ\u001d-:{\u0083B'Wm\u001a[b¦ò{ü^\u001c\u000fÄµ\u0082ó#\u0098°òWcF\u0006=\u0016E\u0092òC\u0005\u008bùÔ\u0087|\u001cw`0È+Nz@¿þÖ\u0012díU¡zb¥LîPø\u0090_ìè.";
      int var20 = "9ô\r 2³\u0003\u001a\u0089æï\u0018ÐT\u0005\u0003P\u0096+\u001fÛL¢\u0095\u0084ï~\u00ad\u000f \b\u0099vÙ\u001d-:{\u0083B'Wm\u001a[b¦ò{ü^\u001c\u000fÄµ\u0082ó#\u0098°òWcF\u0006=\u0016E\u0092òC\u0005\u008bùÔ\u0087|\u001cw`0È+Nz@¿þÖ\u0012díU¡zb¥LîPø\u0090_ìè."
         .length();
      char var17 = 7;
      int var25 = -1;

      label82:
      while (true) {
         byte var10000 = 65;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var41;
            label77: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var22 = 0;
               byte var48 = var10000;
               var41 = var45;
               int var31 = var10004;
               byte var55;
               char[] var61;
               int var10006;
               if (var10004 <= 1) {
                  var61 = var45;
                  var55 = var10000;
                  var10006 = var22;
               } else {
                  var48 = var10000;
                  var31 = var10004;
                  if (var10004 <= var22) {
                     break label77;
                  }

                  var61 = var45;
                  var55 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var70 = var61[var10006];
                  byte var71;
                  switch (var22 % 7) {
                     case 0:
                        var71 = 75;
                        break;
                     case 1:
                        var71 = 121;
                        break;
                     case 2:
                        var71 = 1;
                        break;
                     case 3:
                        var71 = 25;
                        break;
                     case 4:
                        var71 = 43;
                        break;
                     case 5:
                        var71 = 97;
                        break;
                     default:
                        var71 = 55;
                  }

                  var61[var10006] = (char)(var70 ^ var55 ^ var71);
                  var22++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var61 = var41;
                     var55 = var48;
                  } else {
                     if (var31 <= var22) {
                        break;
                     }

                     var61 = var41;
                     var55 = var48;
                     var10006 = var22;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var50;
                  if ((var25 += var17) >= var20) {
                     a = var21;
                     b = new String[8];
                     long var8 = 3858285151240435193L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "Ö>µ\u0006@\u0019ÀÑ=7\u001d¸eF\u0007È\u0095s*\u0007\u008aÆ /";
                     int var13 = "Ö>µ\u0006@\u0019ÀÑ=7\u001d¸eF\u0007È\u0095s*\u0007\u008aÆ /".length();
                     byte var10 = 0;

                     do {
                        byte var33 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var33, var10).getBytes("ISO-8859-1");
                        int var34 = var11++;
                        long var59 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var51 = -1;
                        var14[var34] = var59;
                     } while (var10 < var13);

                     c = var14;
                     g = new Integer[3];
                     long var0 = 2573656238174866871L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "F\u008fB\u00046\u0007T.Oåz\t4¬f,";
                     int var5 = "F\u008fB\u00046\u0007T.Oåz\t4¬f,".length();
                     byte var2 = 0;

                     do {
                        byte var35 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        int var36 = var3++;
                        long var60 = (
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
                        byte var52 = -1;
                        var6[var36] = var60;
                     } while (var2 < var5);

                     h = var6;
                     j = new Long[2];
                     S = new ArrayList();
                     p = null;
                     S.add(GO.FZ);

                     for (int var23 = 1; var23 <= 3; var23++) {
                        S.add(new ImageIcon(C4.class.getResource(a(-15602, 3255) + var23 + a(-15608, -22256))));
                     }

                     p = Xg2.H(a(-15604, -4361), (ImageIcon)S.get(S.size() - 1));
                     return;
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var50;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label82;
                  }

                  var18 = "í&¥\u001e\u0005Ñ9\u0003\u0003\u001a";
                  var20 = "í&¥\u001e\u0005Ñ9\u0003\u0003\u001a".length();
                  var17 = 4;
                  var25 = -1;
            }

            var10000 = 23;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
}





