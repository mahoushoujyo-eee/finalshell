package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.DK3;
import com.finalshell.ui.listener.L8;
import com.finalshell.ui.listener.Lp4;
import com.finalshell.ui.model.EL3;
import com.finalshell.ui.panel.Pb4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Window;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JPopupMenu;
import javax.swing.JWindow;
import javax.swing.Popup;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;

public class FJ extends BasicPopupMenuUI implements SwingConstants, D7, W2_3, L0_2 {
   protected Insets Q = Cq4.V;
   protected int R = Cq4.y;
   protected boolean U = Cq4.d;
   protected HQ E;
   protected PropertyChangeListener J;
   protected PropertyChangeListener g;
   protected PropertyChangeListener f;
   protected PropertyChangeListener p;
   protected String S = null;
   protected boolean N = false;
   protected EL3 P = null;
   public static String[] a;
   public static String[] b;

   public static ComponentUI createUI(JComponent var0) {
      return new FJ();
   }

   @Override
   public void installUI(JComponent var1) {
      int[] var2;
      boolean var10001;
      int[] var10000 = Pb4.g();
      super.installUI(var1);
      var2 = var10000;
      var10001 = Xk2.R();
      label32:
      if (var2 != null) {
         if (!var10001) {
            var10001 = Xk2.d();
            if (var2 == null) {
               break label32;
            }

            if (!var10001) {
               var10001 = false;
               break label32;
            }
         }

         var10001 = true;
      }

      label24: {
         this.N = var10001;
         Registry.lookupField(312797311594469464L).setInt(null, 1);
         this.N = false;
         FN.Y(this.popupMenu);
         FN.g(this.popupMenu);
         Ox4.B(this.popupMenu);
         this.J = new Lp4(this);
         this.popupMenu.addPropertyChangeListener(a(27156, -9287), this.J);
         this.g = new com.finalshell.ui.listener.XU(this);
         this.popupMenu.addPropertyChangeListener(a(27164, 17083), this.g);
         boolean var3 = this.N;
         if (var2 != null) {
            if (this.N) {
               this.f = new DK3(this);
               this.popupMenu.addPropertyChangeListener(a(27156, -9287), this.f);
               if (var2 != null) {
                  break label24;
               }
            }

            var3 = Wx2.R();
         }

         if (var3) {
            this.p = new L8(this);
            this.popupMenu.addPropertyChangeListener(a(27156, -9287), this.p);
         }
      }

      this.popupMenu.setBorder((Border)Registry.lookupField(294493968073699218L).get(null));
   }

   @Override
   public void uninstallUI(JComponent var1) {
      label17: {
         int[] var10000 = Pb4.g();
         this.popupMenu.removePropertyChangeListener(a(27159, 31949), this.J);
         int[] var2 = var10000;
         this.J = null;
         this.popupMenu.removePropertyChangeListener(a(27155, -10633), this.g);
         this.g = null;
         boolean var3 = this.N;
         if (var2 != null) {
            if (this.N) {
               this.popupMenu.removePropertyChangeListener(a(27156, -9287), this.f);
               this.f = null;
               if (var2 != null) {
                  break label17;
               }
            }

            var3 = Wx2.R();
         }

         if (var3) {
            this.popupMenu.removePropertyChangeListener(a(27156, -9287), this.p);
            this.p = null;
         }
      }

      Ox4.o(this.popupMenu);
      super.uninstallUI(var1);
   }

   @Override
   public String A() {
      return this.S;
   }

   @Override
   public void S(String var1) {
      this.S = var1;
      Ox4.B(this.popupMenu);
   }

   @Override
   public Shape B() {
      return GA.X(this.popupMenu, 0, GO.Fx);
   }

   @Override
   public void h() {
      GA.Z(this.popupMenu, this.Q, this.E);
   }

   public Insets J() {
      return this.Q;
   }

   public void u(Insets var1) {
      this.Q = var1;
      this.h();
   }

   public int n() {
      return this.R;
   }

   public void q(int var1) {
      int[] var10000 = Pb4.g();
      this.R = var1;
      int[] var2 = var10000;
      HQ var3 = this.E;
      if (var2 != null) {
         if (this.E == null) {
            return;
         }

         var3 = this.E;
      }

      var3.F(var1);
   }

   public boolean j() {
      return this.U;
   }

   public void h(boolean var1) {
      int[] var10000 = Pb4.g();
      this.U = var1;
      int[] var2 = var10000;
      HQ var3 = this.E;
      if (var2 != null) {
         if (this.E == null) {
            return;
         }

         var3 = this.E;
      }

      var3.v(var1);
   }

   public void N(EL3 var1) {
      int[] var10000 = Pb4.g();
      this.P = var1;
      int[] var2 = var10000;
      HQ var3 = this.E;
      if (var2 != null) {
         if (this.E == null) {
            return;
         }

         var3 = this.E;
      }

      var3.b(var1);
   }

   public com.finalshell.ui.model.M M() {
      int[] var10000 = Pb4.g();
      com.finalshell.ui.model.M var2 = (com.finalshell.ui.model.M)Ox4.a(this.popupMenu, a(27146, 14944));
      int[] var1 = var10000;
      com.finalshell.ui.model.M var3 = var2;
      if (var1 != null) {
         var3 = var2 != null ? var2 : Cq4.G;
      }

      return var3;
   }

   public void A(com.finalshell.ui.model.M var1) {
      Ox4.E(this.popupMenu, a(27157, -17057), var1);
   }

   public Color S() {
      int[] var10000 = Pb4.g();
      Color var2 = (Color)Ox4.a(this.popupMenu, a(27165, -30853));
      int[] var1 = var10000;
      Color var3 = var2;
      if (var1 != null) {
         var3 = var2 != null ? var2 : Cq4.u;
      }

      return var3;
   }

   public void B(Color var1) {
      Ox4.E(this.popupMenu, a(27145, -22233), var1);
   }

   public int r() {
      int[] var10000 = Pb4.g();
      Integer var2 = (Integer)Ox4.a(this.popupMenu, a(27144, 3991));
      int[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.N;
         }

         var3 = var2;
      }

      return var3;
   }

   public void O(int var1) {
      Ox4.E(this.popupMenu, a(27147, 16121), var1);
   }

   public int G() {
      int[] var10000 = Pb4.g();
      Integer var2 = (Integer)Ox4.a(this.popupMenu, a(27160, -24021));
      int[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.K;
         }

         var3 = var2;
      }

      return var3;
   }

   public void T(int var1) {
      Ox4.E(this.popupMenu, a(27167, 8465), var1);
   }

   public float I() {
      int[] var10000 = Pb4.g();
      Float var2 = (Float)Ox4.a(this.popupMenu, a(27149, 11042));
      int[] var1 = var10000;
      Float var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.Q;
         }

         var3 = var2;
      }

      return var3;
   }

   public void u(float var1) {
      Ox4.E(this.popupMenu, a(27161, -23313), var1);
   }

   public int t$int() {
      int[] var10000 = Pb4.g();
      Integer var2 = (Integer)Ox4.a(this.popupMenu, a(27162, 6390));
      int[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.P;
         }

         var3 = var2;
      }

      return var3;
   }

   public void y(int var1) {
      Ox4.E(this.popupMenu, a(27166, -14503), var1);
   }

   public int p() {
      int[] var10000 = Pb4.g();
      Integer var2 = (Integer)Ox4.a(this.popupMenu, a(27152, 12784));
      int[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.o;
         }

         var3 = var2;
      }

      return var3;
   }

   public void D(int var1) {
      Ox4.E(this.popupMenu, a(27153, 2493), var1);
   }

   public float t$float() {
      int[] var10000 = Pb4.g();
      Float var2 = (Float)Ox4.a(this.popupMenu, a(27148, 23625));
      int[] var1 = var10000;
      Float var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return Cq4.L;
         }

         var3 = var2;
      }

      return var3;
   }

   public void x(float var1) {
      Ox4.E(this.popupMenu, a(27154, -23491), var1);
   }

   public Og4 a() {
      return GA.m(this.E);
   }

   public void B(Og4 var1) {
      HQ var2 = (HQ)GA.u(var1, HQ.class, LU.class);
      WO.C(this.popupMenu, this.E);
      HQ var3 = this.E;
      this.E = var2;
      this.v(var2);
      WO.t(this.popupMenu, var2);
      GA.q(this.popupMenu, var3, var2);
   }

   protected void v(HQ var1) {
      int[] var2 = Pb4.g();
      HQ var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var1.F(this.R);
         var1.v(this.U);
         var1.d(this.N);
         var10000 = var1;
      }

      var10000.b(this.P);
   }

   @Override
   public Popup getPopup(JPopupMenu var1, int var2, int var3) {
      int[] var4 = Pb4.g();
      FJ var10000 = this;
      if (var4 != null) {
         if (this.E != null) {
            this.E.F(this.R);
            this.E.v(this.U);
            this.E.b(this.P);
            Point var5 = this.E.F(var1, var1.getInvoker(), var2, var3);
            var10000 = this;
            if (var4 != null) {
               if (this.U) {
                  var2 = var5.x;
                  var3 = var5.y;
               }

               var10000 = this;
            }

            var10000.P = null;
         }

         var3 -= Registry.lookupField(319640283721714084L).getInt(null);
         var10000 = this;
      }

      Popup var10 = var10000.getPopup(var1, var2, var3);
      Object var12 = this;
      if (var4 != null) {
         if (!this.N) {
            return var10;
         }

         if (var4 == null) {
            return var10;
         }

         var12 = Kp2.I(var10, a(27158, 6947), new Object[0]);
      }

      Component var6 = (Component)var12;
      if (var6 instanceof Window) {
         Window var7;
         var7 = (Window)var6;
         var14 = var7 instanceof JWindow;
         label60:
         if (var4 != null) {
            if (var14) {
               var14 = Wx2.E();
               if (var4 == null) {
                  break label60;
               }

               if (var14) {
                  ((JWindow)var7).getRootPane().putClientProperty(a(27163, -7267), Boolean.FALSE);
               }
            }

            Xk2.Z(var7, false);
            var14 = this.E instanceof W_2;
         }

         if (var4 != null) {
            if (!var14) {
               return var10;
            }

            var14 = Xk2.R();
         }

         if (var4 != null) {
            if (var14) {
               return var10;
            }

            var14 = Xk2.d();
         }

         if (var14) {
            var7.pack();
            Rectangle var8 = var7.getBounds();
            var8.width++;
            var8.height++;
            Shape var9 = ((W_2)this.E).g(this.popupMenu, var8);
            Xk2.v(var7, var9);
         }
      }

      return var10;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int[] var3 = Pb4.g();
      HQ var10000 = this.E;
      if (var3 != null) {
         if (this.E == null) {
            return;
         }

         var10000 = this.E;
      }

      var10000.u((Graphics2D)var1, FN.N(var2), var2);
   }

   static JPopupMenu T(FJ var0) {
      return var0.popupMenu;
   }

   static JPopupMenu C(FJ var0) {
      return var0.popupMenu;
   }

   static JPopupMenu P(FJ var0) {
      return var0.popupMenu;
   }

   static JPopupMenu V(FJ var0) {
      return var0.popupMenu;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 27160) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 230;
               break;
            case 1:
               var10000 = 241;
               break;
            case 2:
               var10000 = 32;
               break;
            case 3:
               var10000 = 143;
               break;
            case 4:
               var10000 = 64;
               break;
            case 5:
               var10000 = 207;
               break;
            case 6:
               var10000 = 50;
               break;
            case 7:
               var10000 = 145;
               break;
            case 8:
               var10000 = 42;
               break;
            case 9:
               var10000 = 216;
               break;
            case 10:
               var10000 = 67;
               break;
            case 11:
               var10000 = 219;
               break;
            case 12:
               var10000 = 206;
               break;
            case 13:
               var10000 = 41;
               break;
            case 14:
               var10000 = 164;
               break;
            case 15:
               var10000 = 126;
               break;
            case 16:
               var10000 = 16;
               break;
            case 17:
               var10000 = 228;
               break;
            case 18:
               var10000 = 11;
               break;
            case 19:
               var10000 = 177;
               break;
            case 20:
               var10000 = 187;
               break;
            case 21:
               var10000 = 139;
               break;
            case 22:
               var10000 = 138;
               break;
            case 23:
               var10000 = 80;
               break;
            case 24:
               var10000 = 124;
               break;
            case 25:
               var10000 = 37;
               break;
            case 26:
               var10000 = 158;
               break;
            case 27:
               var10000 = 83;
               break;
            case 28:
               var10000 = 179;
               break;
            case 29:
               var10000 = 204;
               break;
            case 30:
               var10000 = 31;
               break;
            case 31:
               var10000 = 86;
               break;
            case 32:
               var10000 = 99;
               break;
            case 33:
               var10000 = 167;
               break;
            case 34:
               var10000 = 101;
               break;
            case 35:
               var10000 = 13;
               break;
            case 36:
               var10000 = 18;
               break;
            case 37:
               var10000 = 249;
               break;
            case 38:
               var10000 = 202;
               break;
            case 39:
               var10000 = 173;
               break;
            case 40:
               var10000 = 100;
               break;
            case 41:
               var10000 = 90;
               break;
            case 42:
               var10000 = 183;
               break;
            case 43:
               var10000 = 190;
               break;
            case 44:
               var10000 = 243;
               break;
            case 45:
               var10000 = 151;
               break;
            case 46:
               var10000 = 1;
               break;
            case 47:
               var10000 = 238;
               break;
            case 48:
               var10000 = 44;
               break;
            case 49:
               var10000 = 111;
               break;
            case 50:
               var10000 = 210;
               break;
            case 51:
               var10000 = 3;
               break;
            case 52:
               var10000 = 127;
               break;
            case 53:
               var10000 = 159;
               break;
            case 54:
               var10000 = 214;
               break;
            case 55:
               var10000 = 29;
               break;
            case 56:
               var10000 = 14;
               break;
            case 57:
               var10000 = 186;
               break;
            case 58:
               var10000 = 155;
               break;
            case 59:
               var10000 = 98;
               break;
            case 60:
               var10000 = 246;
               break;
            case 61:
               var10000 = 184;
               break;
            case 62:
               var10000 = 68;
               break;
            case 63:
               var10000 = 255;
               break;
            case 64:
               var10000 = 253;
               break;
            case 65:
               var10000 = 35;
               break;
            case 66:
               var10000 = 192;
               break;
            case 67:
               var10000 = 178;
               break;
            case 68:
               var10000 = 40;
               break;
            case 69:
               var10000 = 61;
               break;
            case 70:
               var10000 = 188;
               break;
            case 71:
               var10000 = 203;
               break;
            case 72:
               var10000 = 12;
               break;
            case 73:
               var10000 = 134;
               break;
            case 74:
               var10000 = 226;
               break;
            case 75:
               var10000 = 220;
               break;
            case 76:
               var10000 = 147;
               break;
            case 77:
               var10000 = 251;
               break;
            case 78:
               var10000 = 245;
               break;
            case 79:
               var10000 = 78;
               break;
            case 80:
               var10000 = 212;
               break;
            case 81:
               var10000 = 199;
               break;
            case 82:
               var10000 = 7;
               break;
            case 83:
               var10000 = 66;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 115;
               break;
            case 86:
               var10000 = 146;
               break;
            case 87:
               var10000 = 135;
               break;
            case 88:
               var10000 = 237;
               break;
            case 89:
               var10000 = 185;
               break;
            case 90:
               var10000 = 121;
               break;
            case 91:
               var10000 = 142;
               break;
            case 92:
               var10000 = 227;
               break;
            case 93:
               var10000 = 129;
               break;
            case 94:
               var10000 = 160;
               break;
            case 95:
               var10000 = 63;
               break;
            case 96:
               var10000 = 191;
               break;
            case 97:
               var10000 = 54;
               break;
            case 98:
               var10000 = 91;
               break;
            case 99:
               var10000 = 182;
               break;
            case 100:
               var10000 = 102;
               break;
            case 101:
               var10000 = 128;
               break;
            case 102:
               var10000 = 232;
               break;
            case 103:
               var10000 = 4;
               break;
            case 104:
               var10000 = 144;
               break;
            case 105:
               var10000 = 58;
               break;
            case 106:
               var10000 = 88;
               break;
            case 107:
               var10000 = 161;
               break;
            case 108:
               var10000 = 0;
               break;
            case 109:
               var10000 = 96;
               break;
            case 110:
               var10000 = 236;
               break;
            case 111:
               var10000 = 162;
               break;
            case 112:
               var10000 = 215;
               break;
            case 113:
               var10000 = 82;
               break;
            case 114:
               var10000 = 120;
               break;
            case 115:
               var10000 = 163;
               break;
            case 116:
               var10000 = 156;
               break;
            case 117:
               var10000 = 107;
               break;
            case 118:
               var10000 = 166;
               break;
            case 119:
               var10000 = 211;
               break;
            case 120:
               var10000 = 55;
               break;
            case 121:
               var10000 = 87;
               break;
            case 122:
               var10000 = 242;
               break;
            case 123:
               var10000 = 112;
               break;
            case 124:
               var10000 = 250;
               break;
            case 125:
               var10000 = 104;
               break;
            case 126:
               var10000 = 10;
               break;
            case 127:
               var10000 = 38;
               break;
            case 128:
               var10000 = 21;
               break;
            case 129:
               var10000 = 51;
               break;
            case 130:
               var10000 = 106;
               break;
            case 131:
               var10000 = 239;
               break;
            case 132:
               var10000 = 2;
               break;
            case 133:
               var10000 = 196;
               break;
            case 134:
               var10000 = 113;
               break;
            case 135:
               var10000 = 217;
               break;
            case 136:
               var10000 = 6;
               break;
            case 137:
               var10000 = 240;
               break;
            case 138:
               var10000 = 43;
               break;
            case 139:
               var10000 = 75;
               break;
            case 140:
               var10000 = 9;
               break;
            case 141:
               var10000 = 189;
               break;
            case 142:
               var10000 = 85;
               break;
            case 143:
               var10000 = 252;
               break;
            case 144:
               var10000 = 140;
               break;
            case 145:
               var10000 = 165;
               break;
            case 146:
               var10000 = 209;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 197;
               break;
            case 149:
               var10000 = 22;
               break;
            case 150:
               var10000 = 130;
               break;
            case 151:
               var10000 = 218;
               break;
            case 152:
               var10000 = 116;
               break;
            case 153:
               var10000 = 152;
               break;
            case 154:
               var10000 = 77;
               break;
            case 155:
               var10000 = 69;
               break;
            case 156:
               var10000 = 108;
               break;
            case 157:
               var10000 = 223;
               break;
            case 158:
               var10000 = 33;
               break;
            case 159:
               var10000 = 105;
               break;
            case 160:
               var10000 = 176;
               break;
            case 161:
               var10000 = 57;
               break;
            case 162:
               var10000 = 103;
               break;
            case 163:
               var10000 = 79;
               break;
            case 164:
               var10000 = 52;
               break;
            case 165:
               var10000 = 47;
               break;
            case 166:
               var10000 = 254;
               break;
            case 167:
               var10000 = 150;
               break;
            case 168:
               var10000 = 93;
               break;
            case 169:
               var10000 = 81;
               break;
            case 170:
               var10000 = 234;
               break;
            case 171:
               var10000 = 233;
               break;
            case 172:
               var10000 = 74;
               break;
            case 173:
               var10000 = 60;
               break;
            case 174:
               var10000 = 119;
               break;
            case 175:
               var10000 = 62;
               break;
            case 176:
               var10000 = 131;
               break;
            case 177:
               var10000 = 84;
               break;
            case 178:
               var10000 = 46;
               break;
            case 179:
               var10000 = 170;
               break;
            case 180:
               var10000 = 34;
               break;
            case 181:
               var10000 = 154;
               break;
            case 182:
               var10000 = 39;
               break;
            case 183:
               var10000 = 169;
               break;
            case 184:
               var10000 = 175;
               break;
            case 185:
               var10000 = 56;
               break;
            case 186:
               var10000 = 174;
               break;
            case 187:
               var10000 = 235;
               break;
            case 188:
               var10000 = 193;
               break;
            case 189:
               var10000 = 181;
               break;
            case 190:
               var10000 = 224;
               break;
            case 191:
               var10000 = 149;
               break;
            case 192:
               var10000 = 222;
               break;
            case 193:
               var10000 = 118;
               break;
            case 194:
               var10000 = 171;
               break;
            case 195:
               var10000 = 137;
               break;
            case 196:
               var10000 = 231;
               break;
            case 197:
               var10000 = 172;
               break;
            case 198:
               var10000 = 72;
               break;
            case 199:
               var10000 = 168;
               break;
            case 200:
               var10000 = 24;
               break;
            case 201:
               var10000 = 89;
               break;
            case 202:
               var10000 = 247;
               break;
            case 203:
               var10000 = 201;
               break;
            case 204:
               var10000 = 65;
               break;
            case 205:
               var10000 = 208;
               break;
            case 206:
               var10000 = 73;
               break;
            case 207:
               var10000 = 71;
               break;
            case 208:
               var10000 = 25;
               break;
            case 209:
               var10000 = 198;
               break;
            case 210:
               var10000 = 153;
               break;
            case 211:
               var10000 = 59;
               break;
            case 212:
               var10000 = 157;
               break;
            case 213:
               var10000 = 200;
               break;
            case 214:
               var10000 = 20;
               break;
            case 215:
               var10000 = 248;
               break;
            case 216:
               var10000 = 23;
               break;
            case 217:
               var10000 = 141;
               break;
            case 218:
               var10000 = 76;
               break;
            case 219:
               var10000 = 229;
               break;
            case 220:
               var10000 = 110;
               break;
            case 221:
               var10000 = 195;
               break;
            case 222:
               var10000 = 28;
               break;
            case 223:
               var10000 = 117;
               break;
            case 224:
               var10000 = 109;
               break;
            case 225:
               var10000 = 19;
               break;
            case 226:
               var10000 = 180;
               break;
            case 227:
               var10000 = 244;
               break;
            case 228:
               var10000 = 26;
               break;
            case 229:
               var10000 = 225;
               break;
            case 230:
               var10000 = 92;
               break;
            case 231:
               var10000 = 48;
               break;
            case 232:
               var10000 = 132;
               break;
            case 233:
               var10000 = 45;
               break;
            case 234:
               var10000 = 123;
               break;
            case 235:
               var10000 = 122;
               break;
            case 236:
               var10000 = 30;
               break;
            case 237:
               var10000 = 8;
               break;
            case 238:
               var10000 = 114;
               break;
            case 239:
               var10000 = 17;
               break;
            case 240:
               var10000 = 27;
               break;
            case 241:
               var10000 = 133;
               break;
            case 242:
               var10000 = 125;
               break;
            case 243:
               var10000 = 221;
               break;
            case 244:
               var10000 = 97;
               break;
            case 245:
               var10000 = 36;
               break;
            case 246:
               var10000 = 213;
               break;
            case 247:
               var10000 = 95;
               break;
            case 248:
               var10000 = 194;
               break;
            case 249:
               var10000 = 148;
               break;
            case 250:
               var10000 = 94;
               break;
            case 251:
               var10000 = 53;
               break;
            case 252:
               var10000 = 5;
               break;
            case 253:
               var10000 = 49;
               break;
            case 254:
               var10000 = 15;
               break;
            default:
               var10000 = 205;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "ÔcM\\]dÕËzR\u0011k(º5£J\u0011h\u0080\u0098ò³\u0002\u0080\u008cJà\u000b³ú \u0082\u0091Ñrñg¥]\r\u000fX\u0099\u001a#\u008c\u0016å±k\u0006\u0093\u000f\u0014\u000b©¨öf\u009eõ\u0080óWÇùñË\u001dK\u0086|\u0099õ\u000bÎè.Ê@\u0093\\¿<±%\u000bY\u0080ýÍ:8\u0007ÌÉ\u0002\u0088\nnB\u001ax·à\u0088[Ñ@\u000f\u009dñeã)ýsq\u009e\u0003ÈZ\u008f;Ò\u000fú\u0005\u0089}´.À\u000bèL\u0006³V\u0006é\f©/\u0005\u0086BSêø\u0085æ+Ú\u0014ëa´ïå½\u0085äýÛ\u0006hÉù\u001a\rf´\u0085ì\u0007_E\u008b´ÒîÏ\nS\u0089Ï÷+&±\u001aPÛ\f\u0003.4~ÏÙÕ\nZ\r·À\u00071ÚFGk\u0090ø\u0005\u0018ºá\u008a_\u000bßw\f9\u0004íÔp-H\u0007\n^\u0018nÅ\u001f`7Ò\u0080Â\u0005òw¼3ô";
      int var4 = "ÔcM\\]dÕËzR\u0011k(º5£J\u0011h\u0080\u0098ò³\u0002\u0080\u008cJà\u000b³ú \u0082\u0091Ñrñg¥]\r\u000fX\u0099\u001a#\u008c\u0016å±k\u0006\u0093\u000f\u0014\u000b©¨öf\u009eõ\u0080óWÇùñË\u001dK\u0086|\u0099õ\u000bÎè.Ê@\u0093\\¿<±%\u000bY\u0080ýÍ:8\u0007ÌÉ\u0002\u0088\nnB\u001ax·à\u0088[Ñ@\u000f\u009dñeã)ýsq\u009e\u0003ÈZ\u008f;Ò\u000fú\u0005\u0089}´.À\u000bèL\u0006³V\u0006é\f©/\u0005\u0086BSêø\u0085æ+Ú\u0014ëa´ïå½\u0085äýÛ\u0006hÉù\u001a\rf´\u0085ì\u0007_E\u008b´ÒîÏ\nS\u0089Ï÷+&±\u001aPÛ\f\u0003.4~ÏÙÕ\nZ\r·À\u00071ÚFGk\u0090ø\u0005\u0018ºá\u008a_\u000bßw\f9\u0004íÔp-H\u0007\n^\u0018nÅ\u001f`7Ò\u0080Â\u0005òw¼3ô"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 49;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
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
                        var46 = 76;
                        break;
                     case 1:
                        var46 = 107;
                        break;
                     case 2:
                        var46 = 53;
                        break;
                     case 3:
                        var46 = 75;
                        break;
                     case 4:
                        var46 = 109;
                        break;
                     case 5:
                        var46 = 46;
                        break;
                     default:
                        var46 = 100;
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
                     a = var5;
                     b = new String[22];
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

                  var2 = "xlP\u0081\u0087Ü=f\u0010Zö\"\u0011K`ÑS¡é>s\n\u0094Ì]ª2ösÀ";
                  var4 = "xlP\u0081\u0087Ü=f\u0010Zö\"\u0011K`ÑS¡é>s\n\u0094Ì]ª2ösÀ".length();
                  var1 = '\f';
                  var8 = -1;
            }

            var10000 = 27;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





