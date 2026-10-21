package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Ac2;
import com.finalshell.core.Cz2;
import com.finalshell.core.DE;
import com.finalshell.core.DS_2;
import com.finalshell.core.GR;
import com.finalshell.core.KD;
import com.finalshell.core.RM;
import com.finalshell.core.V3;
import com.finalshell.task.Q3;
import com.finalshell.ui.listener.C2_2;
import com.finalshell.ui.listener.C_r_2;
import com.finalshell.ui.listener.DD3;
import com.finalshell.ui.listener.Dd4;
import com.finalshell.ui.listener.Pi2;
import com.finalshell.ui.listener.RU;
import com.finalshell.ui.listener.S22;
import com.finalshell.ui.model.LS;
import com.finalshell.ui.model.RK;
import com.finalshell.ui.model.WF;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionListener;

public class KF3 extends Ky4 {
   public static ImageIcon v;
   public static ImageIcon c;
   public static ImageIcon r;
   public static ImageIcon y;
   public static ImageIcon i;
   public List t = new ArrayList(1);
   public java.io.File D = Cz2.z()[0];
   public V3 V = DE.W;
   public KD B;
   public KD H;
   public KD K;
   public KD T;
   public KD W;
   public Kz4 d;
   public U22 a;
   public TreeSelectionListener u;
   public static String[] b;
   public static String[] e;
   public static long[] f;
   public static Integer[] g;

   public KF3() {
      this.setOpaque(true);
      XT3 var2 = new XT3(0);
      var2.X(LS.attached);
      var2.setFloatable(false);
      this.B = new KD(v);
      this.B.u(b(-31862, 20542), new Object[0]);
      this.B.Y(this, GR.ra).T(WF.down);
      this.B.K(true);
      this.B.addActionListener(new RU(this));
      String var10000 = Kz4.M();
      var2.add(this.B);
      this.H = new KD(c);
      this.H.u(b(-31860, -6426), new Object[0]);
      String var1 = var10000;
      this.H.Y(this, GR.lY).T(WF.trailing);
      this.H.K(true);
      this.H.addActionListener(new C2_2(this));
      var2.add(this.H);
      var2.addSeparator();
      Iterator var3 = RK.drives.I().iterator();

      while (true) {
         if (var3.hasNext()) {
            java.io.File var4 = (java.io.File)var3.next();
            KD var5 = new KD(Cz2.B(var4));
            Ac2.I(var5, Cz2.X(var4));
            var5.K(true);
            var5.addActionListener(new S22(this, var4));
            var2.add(var5);
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }

            Ky4.K(new String[3]);
         }

         this.T = new KD(y);
         this.T.u(b(-31859, -29722), new Object[0]);
         this.T.Y(this, GR.c).T(WF.leading);
         this.T.K(true);
         this.T.addActionListener(new DD3(this));
         var2.add(this.T, b(-31857, -2492));
         this.K = new KD(r);
         this.K.u(b(-31864, -13532), new Object[0]);
         this.K.Y(this, GR.lr).T(WF.down);
         this.K.K(true);
         this.K.addActionListener(new Pi2(this));
         var2.add(this.K, b(-31871, 25444));
         this.W = new KD(i);
         this.W.u(b(-31858, 18131), new Object[0]);
         this.W.Y(this, GR.v).T(WF.down);
         this.W.K(true);
         this.W.addActionListener(new C_r_2(this));
         var2.add(this.W, b(-31871, 25444));
         this.d = new Kz4(this.D);
         this.d.F(this.V);
         this.d.z(new DS_2(this));
         this.a = new U22(RK.drives);
         this.a.setVisibleRowCount(a(31796, 8013721986848456373L));
         this.a.M(this.V);
         this.a.q(this.D, true);
         this.a.T(1);
         this.a.setEditable(true);
         this.u = new com.finalshell.ui.listener.TreeSelectionHandler(this);
         this.a.addTreeSelectionListener(this.u);
         this.a.addTreeSelectionListener(new Dd4(this));
         break;
      }

      SZ var6 = new SZ(this.a);
      var6.m(a(26238, 7617314856960025854L));
      this.setLayout(new BorderLayout(0, 3));
      this.add(var2, b(-31866, 16024));
      Ky4 var7 = new Ky4(new BorderLayout(0, 1));
      var7.N(0, 3, 2, 3);
      var7.add(this.d, b(-31872, -22711));
      var7.add(var6, b(-31861, 24617));
      this.add(var7, b(-31865, -10828));
      this.V(null, true, true);
      this.e();
   }

   public void e() {
      String var1;
      java.io.File var2;
      boolean var3;
      label64: {
         label63: {
            String var10000 = Kz4.M();
            var2 = this.a.N();
            var1 = var10000;
            java.io.File var10001 = var2;
            if (var1 != null) {
               if (var2 == null) {
                  break label63;
               }

               var10001 = var2.getParentFile();
            }

            if (var10001 != null) {
               var3 = true;
               break label64;
            }
         }

         var3 = false;
      }

      label55: {
         label67: {
            this.B.setEnabled(var3);
            java.io.File var4 = var2;
            if (var1 != null) {
               if (var2 == null) {
                  break label67;
               }

               var4 = var2;
            }

            var3 = var4.canWrite();
            if (var1 == null) {
               break label55;
            }

            if (var3) {
               var3 = true;
               break label55;
            }
         }

         var3 = false;
      }

      label44: {
         label68: {
            this.K.setEnabled(var3);
            java.io.File var6 = var2;
            if (var1 != null) {
               if (var2 == null) {
                  break label68;
               }

               var6 = var2.getParentFile();
            }

            if (var1 != null) {
               if (var6 == null) {
                  break label68;
               }

               var6 = var2;
            }

            var3 = var6.canWrite();
            if (var1 == null) {
               break label44;
            }

            if (var3) {
               var3 = true;
               break label44;
            }
         }

         var3 = false;
      }

      this.W.setEnabled(var3);
   }

   public void V(java.io.File var1, boolean var2, boolean var3) {
      String var10000 = Kz4.M();
      this.D = var1;
      String var4 = var10000;
      boolean var5 = var2;
      if (var4 != null) {
         if (var2) {
            this.d.E(var1);
         }

         var5 = var3;
      }

      label20:
      if (var5) {
         if (var1 != null) {
            this.a.l(var1, false, true, new Q3(this, var1));
            if (var4 != null) {
               break label20;
            }
         }

         this.a.clearSelection();
         this.a.J();
      }

      this.N(this.D);
   }

   public V3 Q() {
      return this.V;
   }

   public void w(V3 var1) {
      this.V = var1;
      this.a.M(var1);
   }

   public java.io.File N() {
      return this.D;
   }

   public void L(java.io.File var1) {
      this.V(var1, true, true);
   }

   public boolean v() {
      String var1 = Kz4.M();
      boolean var10000 = this.a.isEditing();
      if (var1 != null) {
         if (var10000) {
            return false;
         }

         var10000 = this.d.V();
      }

      return var1 == null ? var10000 : !var10000;
   }

   public void F(RM var1) {
      this.t.add(var1);
   }

   public void I(RM var1) {
      this.t.remove(var1);
   }

   public void N(java.io.File var1) {
      String var10000 = Kz4.M();
      Iterator var3 = AL_2.J((Collection)this.t).iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         RM var4 = (RM)var3.next();
         var4.m(var1);
         if (var2 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -31857) & 65535;
      if (e[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 60;
               break;
            case 1:
               var10000 = 117;
               break;
            case 2:
               var10000 = 180;
               break;
            case 3:
               var10000 = 63;
               break;
            case 4:
               var10000 = 250;
               break;
            case 5:
               var10000 = 109;
               break;
            case 6:
               var10000 = 115;
               break;
            case 7:
               var10000 = 8;
               break;
            case 8:
               var10000 = 248;
               break;
            case 9:
               var10000 = 104;
               break;
            case 10:
               var10000 = 73;
               break;
            case 11:
               var10000 = 108;
               break;
            case 12:
               var10000 = 122;
               break;
            case 13:
               var10000 = 220;
               break;
            case 14:
               var10000 = 142;
               break;
            case 15:
               var10000 = 106;
               break;
            case 16:
               var10000 = 134;
               break;
            case 17:
               var10000 = 12;
               break;
            case 18:
               var10000 = 121;
               break;
            case 19:
               var10000 = 37;
               break;
            case 20:
               var10000 = 15;
               break;
            case 21:
               var10000 = 228;
               break;
            case 22:
               var10000 = 0;
               break;
            case 23:
               var10000 = 32;
               break;
            case 24:
               var10000 = 78;
               break;
            case 25:
               var10000 = 7;
               break;
            case 26:
               var10000 = 209;
               break;
            case 27:
               var10000 = 191;
               break;
            case 28:
               var10000 = 80;
               break;
            case 29:
               var10000 = 245;
               break;
            case 30:
               var10000 = 124;
               break;
            case 31:
               var10000 = 215;
               break;
            case 32:
               var10000 = 49;
               break;
            case 33:
               var10000 = 1;
               break;
            case 34:
               var10000 = 204;
               break;
            case 35:
               var10000 = 187;
               break;
            case 36:
               var10000 = 88;
               break;
            case 37:
               var10000 = 212;
               break;
            case 38:
               var10000 = 217;
               break;
            case 39:
               var10000 = 101;
               break;
            case 40:
               var10000 = 160;
               break;
            case 41:
               var10000 = 149;
               break;
            case 42:
               var10000 = 194;
               break;
            case 43:
               var10000 = 223;
               break;
            case 44:
               var10000 = 6;
               break;
            case 45:
               var10000 = 178;
               break;
            case 46:
               var10000 = 234;
               break;
            case 47:
               var10000 = 145;
               break;
            case 48:
               var10000 = 74;
               break;
            case 49:
               var10000 = 55;
               break;
            case 50:
               var10000 = 210;
               break;
            case 51:
               var10000 = 237;
               break;
            case 52:
               var10000 = 62;
               break;
            case 53:
               var10000 = 175;
               break;
            case 54:
               var10000 = 52;
               break;
            case 55:
               var10000 = 147;
               break;
            case 56:
               var10000 = 193;
               break;
            case 57:
               var10000 = 21;
               break;
            case 58:
               var10000 = 24;
               break;
            case 59:
               var10000 = 146;
               break;
            case 60:
               var10000 = 208;
               break;
            case 61:
               var10000 = 46;
               break;
            case 62:
               var10000 = 230;
               break;
            case 63:
               var10000 = 102;
               break;
            case 64:
               var10000 = 225;
               break;
            case 65:
               var10000 = 246;
               break;
            case 66:
               var10000 = 132;
               break;
            case 67:
               var10000 = 205;
               break;
            case 68:
               var10000 = 154;
               break;
            case 69:
               var10000 = 181;
               break;
            case 70:
               var10000 = 40;
               break;
            case 71:
               var10000 = 41;
               break;
            case 72:
               var10000 = 98;
               break;
            case 73:
               var10000 = 3;
               break;
            case 74:
               var10000 = 113;
               break;
            case 75:
               var10000 = 162;
               break;
            case 76:
               var10000 = 53;
               break;
            case 77:
               var10000 = 166;
               break;
            case 78:
               var10000 = 9;
               break;
            case 79:
               var10000 = 48;
               break;
            case 80:
               var10000 = 59;
               break;
            case 81:
               var10000 = 116;
               break;
            case 82:
               var10000 = 155;
               break;
            case 83:
               var10000 = 185;
               break;
            case 84:
               var10000 = 151;
               break;
            case 85:
               var10000 = 243;
               break;
            case 86:
               var10000 = 199;
               break;
            case 87:
               var10000 = 189;
               break;
            case 88:
               var10000 = 57;
               break;
            case 89:
               var10000 = 97;
               break;
            case 90:
               var10000 = 129;
               break;
            case 91:
               var10000 = 144;
               break;
            case 92:
               var10000 = 44;
               break;
            case 93:
               var10000 = 126;
               break;
            case 94:
               var10000 = 76;
               break;
            case 95:
               var10000 = 202;
               break;
            case 96:
               var10000 = 39;
               break;
            case 97:
               var10000 = 218;
               break;
            case 98:
               var10000 = 127;
               break;
            case 99:
               var10000 = 71;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 83;
               break;
            case 102:
               var10000 = 120;
               break;
            case 103:
               var10000 = 47;
               break;
            case 104:
               var10000 = 254;
               break;
            case 105:
               var10000 = 25;
               break;
            case 106:
               var10000 = 4;
               break;
            case 107:
               var10000 = 158;
               break;
            case 108:
               var10000 = 94;
               break;
            case 109:
               var10000 = 207;
               break;
            case 110:
               var10000 = 168;
               break;
            case 111:
               var10000 = 242;
               break;
            case 112:
               var10000 = 150;
               break;
            case 113:
               var10000 = 2;
               break;
            case 114:
               var10000 = 233;
               break;
            case 115:
               var10000 = 173;
               break;
            case 116:
               var10000 = 28;
               break;
            case 117:
               var10000 = 216;
               break;
            case 118:
               var10000 = 183;
               break;
            case 119:
               var10000 = 156;
               break;
            case 120:
               var10000 = 105;
               break;
            case 121:
               var10000 = 255;
               break;
            case 122:
               var10000 = 58;
               break;
            case 123:
               var10000 = 186;
               break;
            case 124:
               var10000 = 236;
               break;
            case 125:
               var10000 = 226;
               break;
            case 126:
               var10000 = 29;
               break;
            case 127:
               var10000 = 203;
               break;
            case 128:
               var10000 = 192;
               break;
            case 129:
               var10000 = 240;
               break;
            case 130:
               var10000 = 195;
               break;
            case 131:
               var10000 = 33;
               break;
            case 132:
               var10000 = 174;
               break;
            case 133:
               var10000 = 222;
               break;
            case 134:
               var10000 = 68;
               break;
            case 135:
               var10000 = 227;
               break;
            case 136:
               var10000 = 27;
               break;
            case 137:
               var10000 = 70;
               break;
            case 138:
               var10000 = 171;
               break;
            case 139:
               var10000 = 86;
               break;
            case 140:
               var10000 = 214;
               break;
            case 141:
               var10000 = 16;
               break;
            case 142:
               var10000 = 96;
               break;
            case 143:
               var10000 = 103;
               break;
            case 144:
               var10000 = 35;
               break;
            case 145:
               var10000 = 137;
               break;
            case 146:
               var10000 = 141;
               break;
            case 147:
               var10000 = 152;
               break;
            case 148:
               var10000 = 92;
               break;
            case 149:
               var10000 = 22;
               break;
            case 150:
               var10000 = 26;
               break;
            case 151:
               var10000 = 197;
               break;
            case 152:
               var10000 = 64;
               break;
            case 153:
               var10000 = 50;
               break;
            case 154:
               var10000 = 43;
               break;
            case 155:
               var10000 = 170;
               break;
            case 156:
               var10000 = 10;
               break;
            case 157:
               var10000 = 221;
               break;
            case 158:
               var10000 = 135;
               break;
            case 159:
               var10000 = 253;
               break;
            case 160:
               var10000 = 169;
               break;
            case 161:
               var10000 = 157;
               break;
            case 162:
               var10000 = 247;
               break;
            case 163:
               var10000 = 198;
               break;
            case 164:
               var10000 = 188;
               break;
            case 165:
               var10000 = 67;
               break;
            case 166:
               var10000 = 224;
               break;
            case 167:
               var10000 = 123;
               break;
            case 168:
               var10000 = 5;
               break;
            case 169:
               var10000 = 165;
               break;
            case 170:
               var10000 = 244;
               break;
            case 171:
               var10000 = 249;
               break;
            case 172:
               var10000 = 89;
               break;
            case 173:
               var10000 = 177;
               break;
            case 174:
               var10000 = 81;
               break;
            case 175:
               var10000 = 200;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 112;
               break;
            case 178:
               var10000 = 77;
               break;
            case 179:
               var10000 = 90;
               break;
            case 180:
               var10000 = 34;
               break;
            case 181:
               var10000 = 213;
               break;
            case 182:
               var10000 = 110;
               break;
            case 183:
               var10000 = 176;
               break;
            case 184:
               var10000 = 85;
               break;
            case 185:
               var10000 = 84;
               break;
            case 186:
               var10000 = 235;
               break;
            case 187:
               var10000 = 111;
               break;
            case 188:
               var10000 = 128;
               break;
            case 189:
               var10000 = 93;
               break;
            case 190:
               var10000 = 163;
               break;
            case 191:
               var10000 = 251;
               break;
            case 192:
               var10000 = 140;
               break;
            case 193:
               var10000 = 42;
               break;
            case 194:
               var10000 = 87;
               break;
            case 195:
               var10000 = 211;
               break;
            case 196:
               var10000 = 130;
               break;
            case 197:
               var10000 = 136;
               break;
            case 198:
               var10000 = 201;
               break;
            case 199:
               var10000 = 125;
               break;
            case 200:
               var10000 = 238;
               break;
            case 201:
               var10000 = 239;
               break;
            case 202:
               var10000 = 179;
               break;
            case 203:
               var10000 = 252;
               break;
            case 204:
               var10000 = 196;
               break;
            case 205:
               var10000 = 66;
               break;
            case 206:
               var10000 = 119;
               break;
            case 207:
               var10000 = 114;
               break;
            case 208:
               var10000 = 241;
               break;
            case 209:
               var10000 = 131;
               break;
            case 210:
               var10000 = 232;
               break;
            case 211:
               var10000 = 14;
               break;
            case 212:
               var10000 = 23;
               break;
            case 213:
               var10000 = 69;
               break;
            case 214:
               var10000 = 30;
               break;
            case 215:
               var10000 = 229;
               break;
            case 216:
               var10000 = 231;
               break;
            case 217:
               var10000 = 172;
               break;
            case 218:
               var10000 = 182;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 75;
               break;
            case 221:
               var10000 = 20;
               break;
            case 222:
               var10000 = 18;
               break;
            case 223:
               var10000 = 184;
               break;
            case 224:
               var10000 = 91;
               break;
            case 225:
               var10000 = 51;
               break;
            case 226:
               var10000 = 159;
               break;
            case 227:
               var10000 = 65;
               break;
            case 228:
               var10000 = 82;
               break;
            case 229:
               var10000 = 164;
               break;
            case 230:
               var10000 = 118;
               break;
            case 231:
               var10000 = 13;
               break;
            case 232:
               var10000 = 148;
               break;
            case 233:
               var10000 = 219;
               break;
            case 234:
               var10000 = 56;
               break;
            case 235:
               var10000 = 190;
               break;
            case 236:
               var10000 = 99;
               break;
            case 237:
               var10000 = 100;
               break;
            case 238:
               var10000 = 38;
               break;
            case 239:
               var10000 = 19;
               break;
            case 240:
               var10000 = 95;
               break;
            case 241:
               var10000 = 79;
               break;
            case 242:
               var10000 = 54;
               break;
            case 243:
               var10000 = 31;
               break;
            case 244:
               var10000 = 107;
               break;
            case 245:
               var10000 = 61;
               break;
            case 246:
               var10000 = 72;
               break;
            case 247:
               var10000 = 17;
               break;
            case 248:
               var10000 = 167;
               break;
            case 249:
               var10000 = 161;
               break;
            case 250:
               var10000 = 138;
               break;
            case 251:
               var10000 = 139;
               break;
            case 252:
               var10000 = 143;
               break;
            case 253:
               var10000 = 153;
               break;
            case 254:
               var10000 = 36;
               break;
            default:
               var10000 = 133;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 641;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[16];
      int var11 = 0;
      String var10 = "ÇÂÑ\u001b\n;:}Õ\u0015àÓí\u001d\u0011ü\u0085\u0081Z2Á\b\u0002S\u009e\u008c?\u0095ôú\u000f\u001c|côv\ftÛÿ\u008a\u0098ýL\u0018\u0097éð·PÌXGû\u0004¥\u0084¦âL\u0019ô¶åÌ.#\u009f\u0015\u0002Åìç:â\u00ad^?\u0085Ýâe¶J^\u0011\u0006Ð]ß©à\u0080\u001d\u0015iÙ7©\\oú\u001c8/XB\u0015¢ ÞZá\u0019âÇº¾\u000e\u008efT>\u0013ñ{\u0095±\u009e\u0087\u0091ë\u0096\u001bé$\u0096ô¨\t\u009b\u001b·\u001eÍ6ÂÜÊ!\u0003U\u0091Í\u009eætÂdZ\u0006\u0005úò\u0081²Ü\u0002\u008bk\u008a²k®\u00068oÂïCH\u0005ù\"J\rÀ\u0011\u008cù:ák\u008d; _/\u009bwïäV{S\u0015#×Ï$Õ5ø½»ÑL}\"Â!2C\u0017\fZ¡\u0010÷áUâ\u0086í\u0086¬ã³uL\u0005\t\u009bZ\u0014ìh6ÓêË\u001fbG*Ó\u0002Ñ+UÓÍ,á¡";
      int var12 = "ÇÂÑ\u001b\n;:}Õ\u0015àÓí\u001d\u0011ü\u0085\u0081Z2Á\b\u0002S\u009e\u008c?\u0095ôú\u000f\u001c|côv\ftÛÿ\u008a\u0098ýL\u0018\u0097éð·PÌXGû\u0004¥\u0084¦âL\u0019ô¶åÌ.#\u009f\u0015\u0002Åìç:â\u00ad^?\u0085Ýâe¶J^\u0011\u0006Ð]ß©à\u0080\u001d\u0015iÙ7©\\oú\u001c8/XB\u0015¢ ÞZá\u0019âÇº¾\u000e\u008efT>\u0013ñ{\u0095±\u009e\u0087\u0091ë\u0096\u001bé$\u0096ô¨\t\u009b\u001b·\u001eÍ6ÂÜÊ!\u0003U\u0091Í\u009eætÂdZ\u0006\u0005úò\u0081²Ü\u0002\u008bk\u008a²k®\u00068oÂïCH\u0005ù\"J\rÀ\u0011\u008cù:ák\u008d; _/\u009bwïäV{S\u0015#×Ï$Õ5ø½»ÑL}\"Â!2C\u0017\fZ¡\u0010÷áUâ\u0086í\u0086¬ã³uL\u0005\t\u009bZ\u0014ìh6ÓêË\u001fbG*Ó\u0002Ñ+UÓÍ,á¡"
         .length();
      char var9 = 3;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 95;
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
                        var58 = 42;
                        break;
                     case 1:
                        var58 = 122;
                        break;
                     case 2:
                        var58 = 113;
                        break;
                     case 3:
                        var58 = 68;
                        break;
                     case 4:
                        var58 = 71;
                        break;
                     case 5:
                        var58 = 1;
                        break;
                     default:
                        var58 = 101;
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
                     b = var13;
                     e = new String[16];
                     long var0 = 6493862550425764459L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ewu8(\u0081üÑ\u001f<HÉe?g\u0005";
                     int var5 = "ewu8(\u0081üÑ\u001f<HÉe?g\u0005".length();
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

                     f = var6;
                     g = new Integer[2];
                     v = new ImageIcon(KF3.class.getResource(b(-31863, -5221)));
                     c = new ImageIcon(KF3.class.getResource(b(-31868, 22534)));
                     r = new ImageIcon(KF3.class.getResource(b(-31870, 24610)));
                     y = new ImageIcon(KF3.class.getResource(b(-31867, 24625)));
                     i = new ImageIcon(KF3.class.getResource(b(-31869, 27310)));
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

                  var10 = "\u008aÐ\u009f\u0005\u00ad¢'ú\u008a";
                  var12 = "\u008aÐ\u009f\u0005\u00ad¢'ú\u008a".length();
                  var9 = 3;
                  var16 = -1;
            }

            var10000 = 88;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





