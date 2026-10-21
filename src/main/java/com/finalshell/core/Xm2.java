package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.K22;
import com.finalshell.ui.listener.Ri4;
import com.finalshell.ui.model.Ex4;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.SZ;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Xm2 extends BasicScrollBarUI implements D7, L0_2 {
   public Insets g = V_3.B;
   public int B = V_3.k;
   public boolean e = V_3.d;
   public boolean Y = V_3.S;
   public Wt4 E;
   public AC X;
   public AC I;
   public PropertyChangeListener K;
   public String Q = null;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static ComponentUI createUI(JComponent var0) {
      return new Xm2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.scrollbar);
      FN.g(this.scrollbar);
      SZ.L();
      Ox4.B(this.scrollbar);
      this.K = new K22(this);
      this.scrollbar.addPropertyChangeListener(a(-802, 22250), this.K);
      this.scrollbar.remove(this.incrButton);
      this.scrollbar.remove(this.decrButton);
      this.incrButton.setPreferredSize((Dimension)Registry.lookupField(467813398355513939L).get(null));
      this.decrButton.setPreferredSize((Dimension)Registry.lookupField(467813398355513939L).get(null));
      this.scrollbar.setBorder((Border)Registry.lookupField(174775768072040332L).get(null));
      this.scrollbar.setUnitIncrement(a(26357, 2685816124588434725L));
      this.scrollbar.setBackground(new Color(a(32062, 7946747690666901231L), a(6160, 1227873253683452866L), a(6160, 1227873253683452866L)));
      this.scrollbar.addAdjustmentListener(new Ri4(this));
      if (Ky4.F$arrString() != null) {
         SZ.d("NarENb");
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.scrollbar.removePropertyChangeListener(a(-801, -28544), this.K);
      Ox4.o(this.scrollbar);
      super.uninstallUI(var1);
   }

   @Override
   public String A() {
      return this.Q;
   }

   @Override
   public void S(String var1) {
      this.Q = var1;
      Ox4.B(this.scrollbar);
   }

   public void h$void() {
      GA.Z(this.scrollbar, this.g, this.E);
   }

   public boolean t() {
      return this.e;
   }

   public void R(boolean var1) {
      String var10000 = SZ.L();
      this.e = var1;
      String var2 = var10000;
      Wt4 var3 = this.E;
      if (var2 == null) {
         if (this.E == null) {
            return;
         }

         var3 = this.E;
      }

      var3.R(var1);
   }

   public boolean q() {
      return this.Y;
   }

   public void Y(boolean var1) {
      String var10000 = SZ.L();
      this.Y = var1;
      String var2 = var10000;
      Wt4 var3 = this.E;
      if (var2 == null) {
         if (this.E == null) {
            return;
         }

         var3 = this.E;
      }

      var3.G(var1);
   }

   public Insets Z() {
      return this.g;
   }

   public void i(Insets var1) {
      this.g = var1;
      this.h$void();
   }

   public int y$int() {
      return this.B;
   }

   public void X(int var1) {
      this.B = var1;
      this.h$void();
   }

   public Og4 r() {
      return GA.m(this.E);
   }

   public void G(Og4 var1) {
      Wt4 var2 = (Wt4)GA.u(var1, Wt4.class, Lb2.class);
      WO.C(this.scrollbar, this.E);
      Wt4 var3 = this.E;
      this.E = var2;
      this.U(var2);
      WO.t(this.scrollbar, var2);
      GA.q(this.scrollbar, var3, var2);
   }

   public void U(Wt4 var1) {
      String var2 = SZ.L();
      Wt4 var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var1.R(this.e);
         var1.G(this.Y);
         var1.j(this.isDragging);
         var1.R(this.getTrackBounds());
         var10000 = var1;
      }

      var10000.j(this.getThumbBounds());
   }

   public Og4 h$og_4() {
      return GA.m(this.X);
   }

   public void r(Og4 var1) {
      String var10000 = SZ.L();
      AC var3 = (AC)GA.u(var1, AC.class, Ll2.class);
      this.X = var3;
      String var2 = var10000;
      if (this.decrButton != null) {
         label15: {
            AC var4 = var3;
            if (var2 == null) {
               if (var3 == null) {
                  break label15;
               }

               var3.I(Ex4.decrease);
               var4 = var3;
            }

            var4.g(this.scrollbar);
         }

         ((KD)this.decrButton).U(var3);
      }
   }

   public Og4 y$og_4() {
      return GA.m(this.I);
   }

   public void S(Og4 var1) {
      String var10000 = SZ.L();
      AC var3 = (AC)GA.u(var1, AC.class, Ll2.class);
      String var2 = var10000;
      this.I = var3;
      if (this.incrButton != null) {
         label15: {
            AC var4 = var3;
            if (var2 == null) {
               if (var3 == null) {
                  break label15;
               }

               var3.I(Ex4.increase);
               var4 = var3;
            }

            var4.g(this.scrollbar);
         }

         ((KD)this.incrButton).U(var3);
      }
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      String var3 = SZ.L();
      Wt4 var10000 = this.E;
      if (var3 == null) {
         if (this.E == null) {
            return;
         }

         this.E.j(this.isDragging);
         this.E.R(this.getTrackBounds());
         this.E.j(this.getThumbBounds());
         var10000 = this.E;
      }

      var10000.u((Graphics2D)var1, FN.N(var2), var2);
   }

   @Override
   public void installComponents() {
      Kw2_2 var1 = new Kw2_2(this, this.X);
      var1.setFocusable(false);
      var1.O$KD(0);
      this.decrButton = var1;
      this.scrollbar.add(this.decrButton);
      KJ_2 var2 = new KJ_2(this, this.I);
      var2.setFocusable(false);
      var2.O$KD(0);
      this.incrButton = var2;
      this.scrollbar.add(this.incrButton);
      this.scrollbar.setEnabled(this.scrollbar.isEnabled());
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      String var2 = SZ.L();
      int var10000 = this.scrollbar.getOrientation();
      if (var2 == null) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      Dimension var4;
      label64: {
         label70: {
            int var3 = var10000;
            var4 = var3 != 0 ? new Dimension(this.B, a(9844, 5187113655057016231L)) : new Dimension(a(30394, 604614961711986028L), this.B);
            Xm2 var8 = this;
            if (var2 == null) {
               if (this.E == null) {
                  break label70;
               }

               var8 = this;
            }

            if (var2 == null) {
               if (!var8.e) {
                  break label70;
               }

               var8 = this;
            }

            var9 = var8.decrButton;
            if (var2 != null) {
               break label64;
            }

            if (var8.decrButton != null) {
               var9 = this.incrButton;
               if (var2 != null) {
                  break label64;
               }

               label50:
               if (this.incrButton != null) {
                  Dimension var5;
                  Dimension var6;
                  label48: {
                     var5 = this.decrButton.getPreferredSize();
                     var6 = this.incrButton.getPreferredSize();
                     if (var2 == null) {
                        if (var3 == 0) {
                           break label48;
                        }

                        var4.width = Math.max(var4.width, Math.max(var5.width, var6.width));
                     }

                     if (var2 == null) {
      Kw2_2 var9;
      Kw2_2 var9;
                        break label50;
                     }
                  }

                  var4.height = Math.max(var4.height, Math.max(var5.height, var6.height));
               }
            }
         }

         var9 = var1;
      }

      Insets var7 = var9.getInsets();
      var4.width = var4.width + var7.left + var7.right;
      Dimension var10 = var4;
      if (var2 == null) {
         var4.height = var4.height + var7.top + var7.bottom;
         if (this.E != null) {
            var4 = FN.h(var4, this.E.d(var1));
         }

         var10 = var4;
      }

      return var10;
   }

   public static JScrollBar x(Xm2 var0) {
      return var0.scrollbar;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -801) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 17;
               break;
            case 1:
               var10000 = 61;
               break;
            case 2:
               var10000 = 120;
               break;
            case 3:
               var10000 = 226;
               break;
            case 4:
               var10000 = 229;
               break;
            case 5:
               var10000 = 48;
               break;
            case 6:
               var10000 = 152;
               break;
            case 7:
               var10000 = 128;
               break;
            case 8:
               var10000 = 1;
               break;
            case 9:
               var10000 = 171;
               break;
            case 10:
               var10000 = 90;
               break;
            case 11:
               var10000 = 62;
               break;
            case 12:
               var10000 = 49;
               break;
            case 13:
               var10000 = 19;
               break;
            case 14:
               var10000 = 164;
               break;
            case 15:
               var10000 = 28;
               break;
            case 16:
               var10000 = 217;
               break;
            case 17:
               var10000 = 234;
               break;
            case 18:
               var10000 = 64;
               break;
            case 19:
               var10000 = 75;
               break;
            case 20:
               var10000 = 129;
               break;
            case 21:
               var10000 = 187;
               break;
            case 22:
               var10000 = 144;
               break;
            case 23:
               var10000 = 191;
               break;
            case 24:
               var10000 = 5;
               break;
            case 25:
               var10000 = 141;
               break;
            case 26:
               var10000 = 35;
               break;
            case 27:
               var10000 = 232;
               break;
            case 28:
               var10000 = 53;
               break;
            case 29:
               var10000 = 43;
               break;
            case 30:
               var10000 = 14;
               break;
            case 31:
               var10000 = 54;
               break;
            case 32:
               var10000 = 190;
               break;
            case 33:
               var10000 = 11;
               break;
            case 34:
               var10000 = 227;
               break;
            case 35:
               var10000 = 136;
               break;
            case 36:
               var10000 = 80;
               break;
            case 37:
               var10000 = 177;
               break;
            case 38:
               var10000 = 180;
               break;
            case 39:
               var10000 = 188;
               break;
            case 40:
               var10000 = 22;
               break;
            case 41:
               var10000 = 204;
               break;
            case 42:
               var10000 = 40;
               break;
            case 43:
               var10000 = 183;
               break;
            case 44:
               var10000 = 202;
               break;
            case 45:
               var10000 = 105;
               break;
            case 46:
               var10000 = 211;
               break;
            case 47:
               var10000 = 158;
               break;
            case 48:
               var10000 = 219;
               break;
            case 49:
               var10000 = 200;
               break;
            case 50:
               var10000 = 88;
               break;
            case 51:
               var10000 = 52;
               break;
            case 52:
               var10000 = 186;
               break;
            case 53:
               var10000 = 122;
               break;
            case 54:
               var10000 = 92;
               break;
            case 55:
               var10000 = 124;
               break;
            case 56:
               var10000 = 131;
               break;
            case 57:
               var10000 = 241;
               break;
            case 58:
               var10000 = 157;
               break;
            case 59:
               var10000 = 68;
               break;
            case 60:
               var10000 = 145;
               break;
            case 61:
               var10000 = 251;
               break;
            case 62:
               var10000 = 93;
               break;
            case 63:
               var10000 = 103;
               break;
            case 64:
               var10000 = 113;
               break;
            case 65:
               var10000 = 67;
               break;
            case 66:
               var10000 = 153;
               break;
            case 67:
               var10000 = 201;
               break;
            case 68:
               var10000 = 175;
               break;
            case 69:
               var10000 = 252;
               break;
            case 70:
               var10000 = 149;
               break;
            case 71:
               var10000 = 172;
               break;
            case 72:
               var10000 = 140;
               break;
            case 73:
               var10000 = 195;
               break;
            case 74:
               var10000 = 203;
               break;
            case 75:
               var10000 = 220;
               break;
            case 76:
               var10000 = 36;
               break;
            case 77:
               var10000 = 42;
               break;
            case 78:
               var10000 = 206;
               break;
            case 79:
               var10000 = 166;
               break;
            case 80:
               var10000 = 228;
               break;
            case 81:
               var10000 = 165;
               break;
            case 82:
               var10000 = 194;
               break;
            case 83:
               var10000 = 215;
               break;
            case 84:
               var10000 = 46;
               break;
            case 85:
               var10000 = 59;
               break;
            case 86:
               var10000 = 216;
               break;
            case 87:
               var10000 = 182;
               break;
            case 88:
               var10000 = 94;
               break;
            case 89:
               var10000 = 41;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 108;
               break;
            case 92:
               var10000 = 65;
               break;
            case 93:
               var10000 = 210;
               break;
            case 94:
               var10000 = 24;
               break;
            case 95:
               var10000 = 137;
               break;
            case 96:
               var10000 = 254;
               break;
            case 97:
               var10000 = 44;
               break;
            case 98:
               var10000 = 208;
               break;
            case 99:
               var10000 = 159;
               break;
            case 100:
               var10000 = 84;
               break;
            case 101:
               var10000 = 7;
               break;
            case 102:
               var10000 = 95;
               break;
            case 103:
               var10000 = 209;
               break;
            case 104:
               var10000 = 132;
               break;
            case 105:
               var10000 = 118;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 32;
               break;
            case 108:
               var10000 = 8;
               break;
            case 109:
               var10000 = 168;
               break;
            case 110:
               var10000 = 9;
               break;
            case 111:
               var10000 = 119;
               break;
            case 112:
               var10000 = 116;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 181;
               break;
            case 115:
               var10000 = 148;
               break;
            case 116:
               var10000 = 70;
               break;
            case 117:
               var10000 = 199;
               break;
            case 118:
               var10000 = 30;
               break;
            case 119:
               var10000 = 231;
               break;
            case 120:
               var10000 = 51;
               break;
            case 121:
               var10000 = 253;
               break;
            case 122:
               var10000 = 146;
               break;
            case 123:
               var10000 = 142;
               break;
            case 124:
               var10000 = 10;
               break;
            case 125:
               var10000 = 212;
               break;
            case 126:
               var10000 = 169;
               break;
            case 127:
               var10000 = 101;
               break;
            case 128:
               var10000 = 83;
               break;
            case 129:
               var10000 = 76;
               break;
            case 130:
               var10000 = 239;
               break;
            case 131:
               var10000 = 133;
               break;
            case 132:
               var10000 = 247;
               break;
            case 133:
               var10000 = 189;
               break;
            case 134:
               var10000 = 147;
               break;
            case 135:
               var10000 = 21;
               break;
            case 136:
               var10000 = 58;
               break;
            case 137:
               var10000 = 47;
               break;
            case 138:
               var10000 = 167;
               break;
            case 139:
               var10000 = 98;
               break;
            case 140:
               var10000 = 109;
               break;
            case 141:
               var10000 = 154;
               break;
            case 142:
               var10000 = 163;
               break;
            case 143:
               var10000 = 233;
               break;
            case 144:
               var10000 = 161;
               break;
            case 145:
               var10000 = 50;
               break;
            case 146:
               var10000 = 4;
               break;
            case 147:
               var10000 = 150;
               break;
            case 148:
               var10000 = 179;
               break;
            case 149:
               var10000 = 221;
               break;
            case 150:
               var10000 = 97;
               break;
            case 151:
               var10000 = 39;
               break;
            case 152:
               var10000 = 117;
               break;
            case 153:
               var10000 = 2;
               break;
            case 154:
               var10000 = 193;
               break;
            case 155:
               var10000 = 184;
               break;
            case 156:
               var10000 = 255;
               break;
            case 157:
               var10000 = 240;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 26;
               break;
            case 160:
               var10000 = 78;
               break;
            case 161:
               var10000 = 235;
               break;
            case 162:
               var10000 = 16;
               break;
            case 163:
               var10000 = 162;
               break;
            case 164:
               var10000 = 106;
               break;
            case 165:
               var10000 = 111;
               break;
            case 166:
               var10000 = 33;
               break;
            case 167:
               var10000 = 112;
               break;
            case 168:
               var10000 = 196;
               break;
            case 169:
               var10000 = 29;
               break;
            case 170:
               var10000 = 69;
               break;
            case 171:
               var10000 = 74;
               break;
            case 172:
               var10000 = 71;
               break;
            case 173:
               var10000 = 173;
               break;
            case 174:
               var10000 = 156;
               break;
            case 175:
               var10000 = 13;
               break;
            case 176:
               var10000 = 224;
               break;
            case 177:
               var10000 = 238;
               break;
            case 178:
               var10000 = 125;
               break;
            case 179:
               var10000 = 115;
               break;
            case 180:
               var10000 = 23;
               break;
            case 181:
               var10000 = 135;
               break;
            case 182:
               var10000 = 230;
               break;
            case 183:
               var10000 = 63;
               break;
            case 184:
               var10000 = 127;
               break;
            case 185:
               var10000 = 176;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 55;
               break;
            case 188:
               var10000 = 174;
               break;
            case 189:
               var10000 = 31;
               break;
            case 190:
               var10000 = 213;
               break;
            case 191:
               var10000 = 38;
               break;
            case 192:
               var10000 = 15;
               break;
            case 193:
               var10000 = 18;
               break;
            case 194:
               var10000 = 20;
               break;
            case 195:
               var10000 = 91;
               break;
            case 196:
               var10000 = 89;
               break;
            case 197:
               var10000 = 6;
               break;
            case 198:
               var10000 = 126;
               break;
            case 199:
               var10000 = 222;
               break;
            case 200:
               var10000 = 123;
               break;
            case 201:
               var10000 = 134;
               break;
            case 202:
               var10000 = 242;
               break;
            case 203:
               var10000 = 197;
               break;
            case 204:
               var10000 = 96;
               break;
            case 205:
               var10000 = 114;
               break;
            case 206:
               var10000 = 57;
               break;
            case 207:
               var10000 = 77;
               break;
            case 208:
               var10000 = 121;
               break;
            case 209:
               var10000 = 25;
               break;
            case 210:
               var10000 = 223;
               break;
            case 211:
               var10000 = 245;
               break;
            case 212:
               var10000 = 139;
               break;
            case 213:
               var10000 = 79;
               break;
            case 214:
               var10000 = 27;
               break;
            case 215:
               var10000 = 102;
               break;
            case 216:
               var10000 = 185;
               break;
            case 217:
               var10000 = 170;
               break;
            case 218:
               var10000 = 82;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 110;
               break;
            case 221:
               var10000 = 248;
               break;
            case 222:
               var10000 = 85;
               break;
            case 223:
               var10000 = 12;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 73;
               break;
            case 226:
               var10000 = 99;
               break;
            case 227:
               var10000 = 66;
               break;
            case 228:
               var10000 = 244;
               break;
            case 229:
               var10000 = 37;
               break;
            case 230:
               var10000 = 60;
               break;
            case 231:
               var10000 = 192;
               break;
            case 232:
               var10000 = 100;
               break;
            case 233:
               var10000 = 3;
               break;
            case 234:
               var10000 = 87;
               break;
            case 235:
               var10000 = 205;
               break;
            case 236:
               var10000 = 207;
               break;
            case 237:
               var10000 = 225;
               break;
            case 238:
               var10000 = 155;
               break;
            case 239:
               var10000 = 198;
               break;
            case 240:
               var10000 = 56;
               break;
            case 241:
               var10000 = 250;
               break;
            case 242:
               var10000 = 0;
               break;
            case 243:
               var10000 = 104;
               break;
            case 244:
               var10000 = 86;
               break;
            case 245:
               var10000 = 143;
               break;
            case 246:
               var10000 = 34;
               break;
            case 247:
               var10000 = 249;
               break;
            case 248:
               var10000 = 243;
               break;
            case 249:
               var10000 = 214;
               break;
            case 250:
               var10000 = 130;
               break;
            case 251:
               var10000 = 72;
               break;
            case 252:
               var10000 = 138;
               break;
            case 253:
               var10000 = 237;
               break;
            case 254:
               var10000 = 160;
               break;
            default:
               var10000 = 246;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17362;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "C\u0006\nJ?ï\u001a\u0094+~\u0095Ñ]\n²VØ\u0096_N\u0014}¼Í\u001dÇ\u0005\u0005ÉÈÕé¤Ò¤C\u0083æ,\u0098\u0019";
      int var12 = "C\u0006\nJ?ï\u001a\u0094+~\u0095Ñ]\n²VØ\u0096_N\u0014}¼Í\u001dÇ\u0005\u0005ÉÈÕé¤Ò¤C\u0083æ,\u0098\u0019".length();
      char var9 = 20;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 84;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 84;
               var10006 = var14;
            } else {
               var27 = 84;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 84;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 126;
                     break;
                  case 1:
                     var47 = 39;
                     break;
                  case 2:
                     var47 = 17;
                     break;
                  case 3:
                     var47 = 66;
                     break;
                  case 4:
                     var47 = 45;
                     break;
                  case 5:
                     var47 = 32;
                     break;
                  default:
                     var47 = 97;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 7768148470628829532L;
            long[] var6 = new long[5];
            int var3 = 0;
            String var4 = "\u0012VãD\u0091R\u0012a\u00adÓ\u008fEi\u0013,Ëß¸¥rlOlQ";
            int var5 = "\u0012VãD\u0091R\u0012a\u00adÓ\u008fEi\u0013,Ëß¸¥rlOlQ".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "ùºÔÏ¯\u0088wLâ=À\u0082Øéü\u0000";
                        var5 = "ùºÔÏ¯\u0088wLâ=À\u0082Øéü\u0000".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}






