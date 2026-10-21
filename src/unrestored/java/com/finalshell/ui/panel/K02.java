package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Cz2;
import com.finalshell.core.Ee2;
import com.finalshell.core.GO;
import com.finalshell.core.KD;
import com.finalshell.core.RV;
import com.finalshell.core.WC_2;
import com.finalshell.ui.listener.IS;
import com.finalshell.ui.listener.Kj2;
import com.finalshell.ui.listener.N52;
import com.finalshell.ui.model.IX3;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class K02 extends Ky4 {
   public static ImageIcon e;
   public final List p;
   public boolean t;
   public boolean S;
   public final boolean j;
   public boolean l;
   public int B;
   public final java.io.File x;
   public WC_2 v;
   public float X;
   public final O F;
   public KD z;
   public static String[] a;
   public static String[] b;
   public static long c;

   public K02(java.io.File var1) {
      this(var1, true);
   }

   public K02(java.io.File var1, boolean var2) {
      super(var2);
      String var10000 = Kz4.M();
      this.p = new ArrayList(1);
      String var3 = var10000;
      this.t = true;
      this.S = false;
      this.j = GO.k;
      this.l = false;
      this.B = (int)c;
      this.v = null;
      this.X = 0.0F;
      this.z = null;
      this.x = var1;
      this.N(0, 3, 0, 0);
      IX3 var4 = new IX3(new double[][]{{-1.0, -2.0}, {-2.0}});
      var4.q(0);
      var4.p(0);
      this.setLayout(var4);
      this.F = new O();
      int var10004 = (this.t) ? 1 : 0;
      if (var3 != null) {
         var10004 = this.t ? 1 : 0;
      }

      this.F.G(0, 0, 0, var10004);
      this.add(this.F, b(-21795, 16668));
      this.b();
      K02 var6 = this;
      if (var3 != null) {
         if (this.t) {
            this.add(this.R(), b(-21796, 19694));
         }

         var6 = this;
      }

      var6.addAncestorListener(new com.finalshell.ui.listener.Fg2(this));
      Kj2 var5 = new Kj2(this);
      this.addMouseListener(var5);
      this.addMouseMotionListener(var5);
      this.setTransferHandler(new Ee2(this, true, true, var1));
   }

   public boolean N() {
      return this.l;
   }

   public void Y(boolean var1) {
      this.l = var1;
   }

   public int U() {
      return this.B;
   }

   public void w(int var1) {
      this.B = var1;
   }

   public void b() {
      this.F.setIcon(this.k(this.x));
      this.F.setText(this.s(this.x));
   }

   public KD R() {
      String var1 = Kz4.M();
      KD var10000 = this.z;
      if (var1 != null) {
         if (this.z == null) {
            this.z = KD.S(e, GO.Fx, 3, 1, true, false);
            this.z.setFocusable(false);
            this.z.addActionListener(new IS(this));
         }

         var10000 = this.z;
      }

      return var10000;
   }

   public void K(ActionEvent var1, boolean var2) {
      String var3;
      boolean var4;
      label29: {
         label32: {
            var3 = Kz4.M();
            WC_2 var10000 = this.v;
            if (var3 != null) {
               if (this.v == null) {
                  break label32;
               }

               var10000 = this.v;
            }

            var4 = var10000.i();
            if (var3 == null) {
               break label29;
            }

            if (var4) {
               this.v.Y();
            }
         }

         var4 = var2;
      }

      label19: {
         if (var4) {
            this.v = new WC_2(b(-21794, 9205), GO.FK, new N52(this));
            this.v.u$WC();
            if (var3 != null) {
               break label19;
            }
         }

         this.g();
      }

      this.q(var1);
   }

   public void g() {
      String var10000 = Kz4.M();
      this.X = 0.0F;
      Container var2 = this.getParent();
      String var1 = var10000;
      Container var4 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return;
         }

         var4 = var2;
      }

      if (var1 != null) {
         if (!(var4 instanceof JComponent)) {
            return;
         }

         var4 = var2;
      }

      JComponent var3 = (JComponent)var4;
      var3.remove(this);
      var3.revalidate();
      var3.repaint();
   }

   public ImageIcon k(java.io.File var1) {
      return Cz2.U(var1, false);
   }

   public String s(java.io.File var1) {
      String var10000 = Kz4.M();
      String var3 = Cz2.X(var1);
      String var2 = var10000;
      boolean var4 = this.S;
      if (var2 != null) {
         if (this.S) {
            return var3;
         }

         var4 = var1.isDirectory();
      }

      return !var4 ? Cz2.Z(var3) : var3;
   }

   public boolean o() {
      return this.t;
   }

   public void b(boolean var1) {
      label26: {
         K02 var3;
         label29: {
            String var2 = Kz4.M();
            boolean var10000 = this.t;
            if (var2 != null) {
               if (this.t == var1) {
                  return;
               }

               var3 = this;
               if (var2 == null) {
                  break label29;
               }

               this.t = var1;
               var10000 = var1;
            }

            if (var10000) {
               this.add(this.R(), b(-21798, -5564));
               if (var2 != null) {
                  break label26;
               }
            }

            var3 = this;
         }

         var3.remove(this.R());
      }

      this.revalidate();
   }

   public boolean T() {
      return this.S;
   }

   public void V(boolean var1) {
      this.S = var1;
      this.b();
   }

   public java.io.File y() {
      return this.x;
   }

   public void P() {
      this.z.doClick(0);
   }

   @Override
   public void paintComponent(Graphics var1) {
      String var2 = Kz4.M();
      Graphics2D var10000 = (Graphics2D)var1;
      Float var10001 = this.X;
      float var3;
      int var10002 = (var3 = this.X - 1.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      if (var2 != null) {
         var10002 = var10002 < 0 ? 1 : 0;
      }

      RV.a(var10000, var10001, var10002);
      super.paintComponent(var1);
   }

   public void y(ActionListener var1) {
      this.p.add(var1);
   }

   public void C(ActionListener var1) {
      this.p.remove(var1);
   }

   public void q(ActionEvent var1) {
      String var10000 = Kz4.M();
      Iterator var3 = AL_2.J((Collection)this.p).iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         ActionListener var4 = (ActionListener)var3.next();
         var4.actionPerformed(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -21794) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 105;
               break;
            case 1:
               var10000 = 14;
               break;
            case 2:
               var10000 = 38;
               break;
            case 3:
               var10000 = 112;
               break;
            case 4:
               var10000 = 17;
               break;
            case 5:
               var10000 = 117;
               break;
            case 6:
               var10000 = 39;
               break;
            case 7:
               var10000 = 88;
               break;
            case 8:
               var10000 = 247;
               break;
            case 9:
               var10000 = 52;
               break;
            case 10:
               var10000 = 209;
               break;
            case 11:
               var10000 = 5;
               break;
            case 12:
               var10000 = 178;
               break;
            case 13:
               var10000 = 81;
               break;
            case 14:
               var10000 = 144;
               break;
            case 15:
               var10000 = 138;
               break;
            case 16:
               var10000 = 235;
               break;
            case 17:
               var10000 = 164;
               break;
            case 18:
               var10000 = 189;
               break;
            case 19:
               var10000 = 119;
               break;
            case 20:
               var10000 = 60;
               break;
            case 21:
               var10000 = 239;
               break;
            case 22:
               var10000 = 109;
               break;
            case 23:
               var10000 = 67;
               break;
            case 24:
               var10000 = 89;
               break;
            case 25:
               var10000 = 46;
               break;
            case 26:
               var10000 = 195;
               break;
            case 27:
               var10000 = 225;
               break;
            case 28:
               var10000 = 234;
               break;
            case 29:
               var10000 = 40;
               break;
            case 30:
               var10000 = 65;
               break;
            case 31:
               var10000 = 23;
               break;
            case 32:
               var10000 = 85;
               break;
            case 33:
               var10000 = 36;
               break;
            case 34:
               var10000 = 24;
               break;
            case 35:
               var10000 = 134;
               break;
            case 36:
               var10000 = 61;
               break;
            case 37:
               var10000 = 243;
               break;
            case 38:
               var10000 = 253;
               break;
            case 39:
               var10000 = 16;
               break;
            case 40:
               var10000 = 6;
               break;
            case 41:
               var10000 = 29;
               break;
            case 42:
               var10000 = 127;
               break;
            case 43:
               var10000 = 249;
               break;
            case 44:
               var10000 = 205;
               break;
            case 45:
               var10000 = 157;
               break;
            case 46:
               var10000 = 11;
               break;
            case 47:
               var10000 = 177;
               break;
            case 48:
               var10000 = 10;
               break;
            case 49:
               var10000 = 238;
               break;
            case 50:
               var10000 = 231;
               break;
            case 51:
               var10000 = 142;
               break;
            case 52:
               var10000 = 202;
               break;
            case 53:
               var10000 = 53;
               break;
            case 54:
               var10000 = 173;
               break;
            case 55:
               var10000 = 213;
               break;
            case 56:
               var10000 = 28;
               break;
            case 57:
               var10000 = 190;
               break;
            case 58:
               var10000 = 175;
               break;
            case 59:
               var10000 = 116;
               break;
            case 60:
               var10000 = 204;
               break;
            case 61:
               var10000 = 135;
               break;
            case 62:
               var10000 = 30;
               break;
            case 63:
               var10000 = 84;
               break;
            case 64:
               var10000 = 244;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 153;
               break;
            case 67:
               var10000 = 160;
               break;
            case 68:
               var10000 = 111;
               break;
            case 69:
               var10000 = 18;
               break;
            case 70:
               var10000 = 90;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 214;
               break;
            case 73:
               var10000 = 133;
               break;
            case 74:
               var10000 = 148;
               break;
            case 75:
               var10000 = 252;
               break;
            case 76:
               var10000 = 62;
               break;
            case 77:
               var10000 = 181;
               break;
            case 78:
               var10000 = 68;
               break;
            case 79:
               var10000 = 4;
               break;
            case 80:
               var10000 = 124;
               break;
            case 81:
               var10000 = 223;
               break;
            case 82:
               var10000 = 217;
               break;
            case 83:
               var10000 = 196;
               break;
            case 84:
               var10000 = 166;
               break;
            case 85:
               var10000 = 229;
               break;
            case 86:
               var10000 = 241;
               break;
            case 87:
               var10000 = 63;
               break;
            case 88:
               var10000 = 8;
               break;
            case 89:
               var10000 = 146;
               break;
            case 90:
               var10000 = 165;
               break;
            case 91:
               var10000 = 12;
               break;
            case 92:
               var10000 = 151;
               break;
            case 93:
               var10000 = 171;
               break;
            case 94:
               var10000 = 174;
               break;
            case 95:
               var10000 = 56;
               break;
            case 96:
               var10000 = 237;
               break;
            case 97:
               var10000 = 13;
               break;
            case 98:
               var10000 = 152;
               break;
            case 99:
               var10000 = 186;
               break;
            case 100:
               var10000 = 198;
               break;
            case 101:
               var10000 = 107;
               break;
            case 102:
               var10000 = 251;
               break;
            case 103:
               var10000 = 136;
               break;
            case 104:
               var10000 = 19;
               break;
            case 105:
               var10000 = 104;
               break;
            case 106:
               var10000 = 219;
               break;
            case 107:
               var10000 = 210;
               break;
            case 108:
               var10000 = 9;
               break;
            case 109:
               var10000 = 94;
               break;
            case 110:
               var10000 = 2;
               break;
            case 111:
               var10000 = 230;
               break;
            case 112:
               var10000 = 45;
               break;
            case 113:
               var10000 = 113;
               break;
            case 114:
               var10000 = 228;
               break;
            case 115:
               var10000 = 101;
               break;
            case 116:
               var10000 = 184;
               break;
            case 117:
               var10000 = 43;
               break;
            case 118:
               var10000 = 31;
               break;
            case 119:
               var10000 = 99;
               break;
            case 120:
               var10000 = 131;
               break;
            case 121:
               var10000 = 97;
               break;
            case 122:
               var10000 = 118;
               break;
            case 123:
               var10000 = 66;
               break;
            case 124:
               var10000 = 145;
               break;
            case 125:
               var10000 = 35;
               break;
            case 126:
               var10000 = 93;
               break;
            case 127:
               var10000 = 98;
               break;
            case 128:
               var10000 = 50;
               break;
            case 129:
               var10000 = 44;
               break;
            case 130:
               var10000 = 75;
               break;
            case 131:
               var10000 = 255;
               break;
            case 132:
               var10000 = 161;
               break;
            case 133:
               var10000 = 143;
               break;
            case 134:
               var10000 = 71;
               break;
            case 135:
               var10000 = 33;
               break;
            case 136:
               var10000 = 137;
               break;
            case 137:
               var10000 = 207;
               break;
            case 138:
               var10000 = 216;
               break;
            case 139:
               var10000 = 245;
               break;
            case 140:
               var10000 = 215;
               break;
            case 141:
               var10000 = 15;
               break;
            case 142:
               var10000 = 182;
               break;
            case 143:
               var10000 = 140;
               break;
            case 144:
               var10000 = 122;
               break;
            case 145:
               var10000 = 240;
               break;
            case 146:
               var10000 = 79;
               break;
            case 147:
               var10000 = 150;
               break;
            case 148:
               var10000 = 179;
               break;
            case 149:
               var10000 = 7;
               break;
            case 150:
               var10000 = 185;
               break;
            case 151:
               var10000 = 26;
               break;
            case 152:
               var10000 = 250;
               break;
            case 153:
               var10000 = 194;
               break;
            case 154:
               var10000 = 169;
               break;
            case 155:
               var10000 = 55;
               break;
            case 156:
               var10000 = 227;
               break;
            case 157:
               var10000 = 130;
               break;
            case 158:
               var10000 = 147;
               break;
            case 159:
               var10000 = 49;
               break;
            case 160:
               var10000 = 220;
               break;
            case 161:
               var10000 = 73;
               break;
            case 162:
               var10000 = 20;
               break;
            case 163:
               var10000 = 212;
               break;
            case 164:
               var10000 = 21;
               break;
            case 165:
               var10000 = 206;
               break;
            case 166:
               var10000 = 114;
               break;
            case 167:
               var10000 = 126;
               break;
            case 168:
               var10000 = 100;
               break;
            case 169:
               var10000 = 34;
               break;
            case 170:
               var10000 = 141;
               break;
            case 171:
               var10000 = 254;
               break;
            case 172:
               var10000 = 188;
               break;
            case 173:
               var10000 = 200;
               break;
            case 174:
               var10000 = 176;
               break;
            case 175:
               var10000 = 191;
               break;
            case 176:
               var10000 = 168;
               break;
            case 177:
               var10000 = 83;
               break;
            case 178:
               var10000 = 57;
               break;
            case 179:
               var10000 = 106;
               break;
            case 180:
               var10000 = 48;
               break;
            case 181:
               var10000 = 129;
               break;
            case 182:
               var10000 = 123;
               break;
            case 183:
               var10000 = 197;
               break;
            case 184:
               var10000 = 128;
               break;
            case 185:
               var10000 = 121;
               break;
            case 186:
               var10000 = 120;
               break;
            case 187:
               var10000 = 87;
               break;
            case 188:
               var10000 = 246;
               break;
            case 189:
               var10000 = 42;
               break;
            case 190:
               var10000 = 163;
               break;
            case 191:
               var10000 = 92;
               break;
            case 192:
               var10000 = 3;
               break;
            case 193:
               var10000 = 222;
               break;
            case 194:
               var10000 = 125;
               break;
            case 195:
               var10000 = 159;
               break;
            case 196:
               var10000 = 170;
               break;
            case 197:
               var10000 = 232;
               break;
            case 198:
               var10000 = 69;
               break;
            case 199:
               var10000 = 0;
               break;
            case 200:
               var10000 = 22;
               break;
            case 201:
               var10000 = 95;
               break;
            case 202:
               var10000 = 154;
               break;
            case 203:
               var10000 = 221;
               break;
            case 204:
               var10000 = 193;
               break;
            case 205:
               var10000 = 158;
               break;
            case 206:
               var10000 = 103;
               break;
            case 207:
               var10000 = 41;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 37;
               break;
            case 210:
               var10000 = 58;
               break;
            case 211:
               var10000 = 162;
               break;
            case 212:
               var10000 = 76;
               break;
            case 213:
               var10000 = 115;
               break;
            case 214:
               var10000 = 248;
               break;
            case 215:
               var10000 = 149;
               break;
            case 216:
               var10000 = 233;
               break;
            case 217:
               var10000 = 132;
               break;
            case 218:
               var10000 = 1;
               break;
            case 219:
               var10000 = 74;
               break;
            case 220:
               var10000 = 155;
               break;
            case 221:
               var10000 = 218;
               break;
            case 222:
               var10000 = 224;
               break;
            case 223:
               var10000 = 242;
               break;
            case 224:
               var10000 = 54;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 70;
               break;
            case 227:
               var10000 = 51;
               break;
            case 228:
               var10000 = 172;
               break;
            case 229:
               var10000 = 208;
               break;
            case 230:
               var10000 = 72;
               break;
            case 231:
               var10000 = 108;
               break;
            case 232:
               var10000 = 27;
               break;
            case 233:
               var10000 = 226;
               break;
            case 234:
               var10000 = 183;
               break;
            case 235:
               var10000 = 167;
               break;
            case 236:
               var10000 = 110;
               break;
            case 237:
               var10000 = 78;
               break;
            case 238:
               var10000 = 96;
               break;
            case 239:
               var10000 = 199;
               break;
            case 240:
               var10000 = 211;
               break;
            case 241:
               var10000 = 47;
               break;
            case 242:
               var10000 = 25;
               break;
            case 243:
               var10000 = 201;
               break;
            case 244:
               var10000 = 32;
               break;
            case 245:
               var10000 = 203;
               break;
            case 246:
               var10000 = 82;
               break;
            case 247:
               var10000 = 139;
               break;
            case 248:
               var10000 = 102;
               break;
            case 249:
               var10000 = 80;
               break;
            case 250:
               var10000 = 236;
               break;
            case 251:
               var10000 = 91;
               break;
            case 252:
               var10000 = 77;
               break;
            case 253:
               var10000 = 156;
               break;
            case 254:
               var10000 = 187;
               break;
            default:
               var10000 = 192;
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
      char[] var23;
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "u(û\u0095\u0082£ëú÷îtO©Ü\u0080z²÷Pß\u001fW\u007fAB\u000f\u0019Ê\u0082'\u001b\u009b\u0087ô¿[\u0019â½C\u0091\u0003'¥I";
      int var6 = "u(û\u0095\u0082£ëú÷îtO©Ü\u0080z²÷Pß\u001fW\u007fAB\u000f\u0019Ê\u0082'\u001b\u009b\u0087ô¿[\u0019â½C\u0091\u0003'¥I".length();
      char var3 = 25;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 23;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 42;
                        break;
                     case 1:
                        var50 = 23;
                        break;
                     case 2:
                        var50 = 58;
                        break;
                     case 3:
                        var50 = 8;
                        break;
                     case 4:
                        var50 = 8;
                        break;
                     case 5:
                        var50 = 7;
                        break;
                     default:
                        var50 = 110;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[5];
                     long var0 = 7997548836641212997L;
                     long var27 = 16398353878649415L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     e = new ImageIcon(K02.class.getResource(b(-21793, -6518)));
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "Ø\u001cF\u0003e\u001fÐ";
                  var6 = "Ø\u001cF\u0003e\u001fÐ".length();
                  var3 = 3;
                  var10 = -1;
            }

            var10000 = 32;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





