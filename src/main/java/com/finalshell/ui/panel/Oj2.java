package com.finalshell.ui.panel;

import com.finalshell.core.AL_2;
import com.finalshell.core.Cz2;
import com.finalshell.core.Xu4;
import com.finalshell.task.Ke2;
import com.finalshell.task.Ra4;
import com.finalshell.ui.listener.Fe2;
import com.finalshell.ui.listener.H7;
import com.finalshell.ui.listener.HZ;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Oj2 extends O {
   public static ImageIcon a;
   public static ImageIcon Y;
   public ExecutorService d = Executors.newSingleThreadExecutor();
   public List B = new ArrayList(1);
   public boolean y = Xu4.L;
   public boolean i = Xu4.m;
   public boolean Z = Xu4.e;
   public Color U = Xu4.H;
   public Color h = Xu4.T;
   public Runnable u = null;
   public String j = "";
   public boolean o = false;
   public boolean l = false;
   public static boolean N;
   public static String[] b;
   public static String[] c;
   public static long e;

   public Oj2() {
      this.Y();
   }

   public Oj2(Icon var1) {
      super(var1);
      this.Y();
   }

   public Oj2(Icon var1, int var2) {
      super(var1, var2);
      this.Y();
   }

   public Oj2(String var1) {
      super(var1);
      this.setText(var1);
      this.Y();
   }

   public Oj2(String var1, int var2) {
      super(var1, var2, new Object[0]);
      this.setText(var1);
      this.Y();
   }

   public Oj2(String var1, Icon var2) {
      super(var1, var2);
      this.setText(var1);
      this.Y();
   }

   public Oj2(String var1, Icon var2, int var3) {
      super(var1, var2, var3, new Object[0]);
      this.setText(var1);
      this.Y();
   }

   public void Y() {
      this.setCursor(Cursor.getPredefinedCursor((int)e));
      this.H$void();
      H7 var1 = new H7(this);
      this.addMouseListener(var1);
      this.addMouseMotionListener(var1);
      this.addAncestorListener(new Fe2(this));
      this.addKeyListener(new HZ(this));
   }

   public void f(boolean var1) {
      Oj2 var5;
      label51: {
         boolean var2 = V();
         boolean var10000 = var1;
         if (!var2) {
            if (var1) {
               boolean var3 = this.isEnabled();
               if (!var2) {
                  if (!var3) {
                     return;
                  }

                  var3 = this.y;
               }

               label54: {
                  if (!var2) {
                     if (!var3) {
                        return;
                     }

                     var5 = this;
                     if (var2) {
                        break label54;
                     }

                     var3 = this.o;
                  }

                  if (var3) {
                     return;
                  }

                  this.o = true;
                  var5 = this;
               }

               var5.j();
               if (!var2) {
                  return;
               }
            }

            var5 = this;
            if (var2) {
               break label51;
            }

            var10000 = this.o;
         }

         if (!var10000) {
            return;
         }

         this.o = false;
         var5 = this;
      }

      var5.j();
   }

   public Color a() {
      return this.U;
   }

   public void V(Color var1) {
      this.setForeground(var1);
   }

   @Override
   public void setForeground(Color var1) {
      this.U = var1;
      this.H$void();
   }

   public Color O() {
      return this.h;
   }

   public void o(Color var1) {
      this.h = var1;
      this.H$void();
   }

   public void H$void() {
      Color var2;
      label20: {
         boolean var1 = g();
         var10001 = this;
         label19:
         if (var1) {
            if (this.Z) {
               var10001 = this;
               if (!var1) {
                  break label19;
               }

               if (this.l) {
                  var2 = this.h;
                  break label20;
               }
            }

            var10001 = this;
         }

         var2 = var10001.U;
      }

      a(this, var2);
   }

   public String X() {
      return this.j;
   }

   @Override
   public void setText(String var1) {
      this.j = var1;
      this.j();
   }

   public void j() {
   }

   public boolean H$boolean() {
      return this.l;
   }

   public Runnable G() {
      return this.u;
   }

   public void O(Runnable var1) {
      this.u = var1;
   }

   public void y(String var1, Runnable var2) {
      this.u = var2;
      this.setText(var1);
   }

   public void O(String var1) {
      this.l(var1, true);
   }

   public void l(String var1, boolean var2) {
      this.i(var1, var1, var2);
   }

   public void X(String var1, String var2) {
      this.i(var1, var2, true);
   }

   public void i(String var1, String var2, boolean var3) {
      this.x(var1, this.C(var2), var3);
   }

   public void x(String var1, Runnable var2, boolean var3) {
      boolean var4 = V();
      if (!var4) {
         if (var3) {
            this.setIcon(a);
            this.setText(var1);
         }

         this.u = var2;
      }
   }

   public void i(String var1) {
      this.X(var1, true);
   }

   public void X(String var1, boolean var2) {
      this.m(var1, var1, var2);
   }

   public void l(String var1, String var2) {
      this.m(var1, var2, true);
   }

   public void m(String var1, String var2, boolean var3) {
      boolean var4 = V();
      if (!var4) {
         if (var3) {
            this.setIcon(Y);
            this.setText(var1);
         }

         this.u = this.M(var2);
      }
   }

   public void I(java.io.File var1) {
      this.n(var1, true);
   }

   public void n(java.io.File var1, boolean var2) {
      this.K(Cz2.X(var1), var1, var2);
   }

   public void n(String var1, java.io.File var2) {
      this.K(var1, var2, true);
   }

   public void K(String var1, java.io.File var2, boolean var3) {
      boolean var4 = g();
      if (var4) {
         if (var3) {
            this.setIcon(Cz2.B(var2));
            this.setText(var1);
         }

         this.u = this.z(var2);
      }
   }

   public boolean Z() {
      return this.y;
   }

   public void k(boolean var1) {
      this.y = var1;
      this.j();
   }

   public boolean J() {
      return this.Z;
   }

   public void l(boolean var1) {
      this.Z = var1;
      this.H$void();
   }

   public boolean D() {
      return this.i;
   }

   public void C(boolean var1) {
      this.i = var1;
   }

   public void Y(ActionListener var1) {
      this.B.add(var1);
   }

   public void T(ActionListener var1) {
      this.B.remove(var1);
   }

   public void A() {
      boolean var10000 = g();
      this.l = true;
      boolean var1 = var10000;
      this.H$void();
      Oj2 var2 = this;
      if (var1) {
         if (this.u != null) {
            this.u.run();
         }

         var2 = this;
      }

      var2.P();
   }

   public void P() {
      ActionEvent var2 = new ActionEvent(this, 0, a(-4328, -17161));
      boolean var10000 = V();
      Iterator var3 = AL_2.J((Collection)this.B).iterator();
      boolean var1 = var10000;

      while (var3.hasNext()) {
         ActionListener var4 = (ActionListener)var3.next();
         var4.actionPerformed(var2);
         if (var1) {
            break;
         }
      }
   }

   public Runnable C(String var1) {
      return var1 != null ? new Ke2(this, var1) : null;
   }

   public Runnable M(String var1) {
      return var1 != null ? new com.finalshell.task.QU(this, var1) : null;
   }

   public Runnable z(java.io.File var1) {
      return var1 != null ? new Ra4(this, var1) : null;
   }

   public static void a(Oj2 var0, Color var1) {
      var0.setForeground(var1);
   }

   static {
      __vfClinit__();
   }

   public static void T(boolean var0) {
      N = var0;
   }

   public static boolean V() {
      return N;
   }

   public static boolean g() {
      boolean var0 = V();
      return !var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4326) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 148;
               break;
            case 1:
               var10000 = 155;
               break;
            case 2:
               var10000 = 187;
               break;
            case 3:
               var10000 = 74;
               break;
            case 4:
               var10000 = 215;
               break;
            case 5:
               var10000 = 29;
               break;
            case 6:
               var10000 = 225;
               break;
            case 7:
               var10000 = 7;
               break;
            case 8:
               var10000 = 255;
               break;
            case 9:
               var10000 = 83;
               break;
            case 10:
               var10000 = 165;
               break;
            case 11:
               var10000 = 160;
               break;
            case 12:
               var10000 = 18;
               break;
            case 13:
               var10000 = 151;
               break;
            case 14:
               var10000 = 63;
               break;
            case 15:
               var10000 = 238;
               break;
            case 16:
               var10000 = 88;
               break;
            case 17:
               var10000 = 171;
               break;
            case 18:
               var10000 = 251;
               break;
            case 19:
               var10000 = 67;
               break;
            case 20:
               var10000 = 202;
               break;
            case 21:
               var10000 = 237;
               break;
            case 22:
               var10000 = 104;
               break;
            case 23:
               var10000 = 137;
               break;
            case 24:
               var10000 = 214;
               break;
            case 25:
               var10000 = 188;
               break;
            case 26:
               var10000 = 182;
               break;
            case 27:
               var10000 = 100;
               break;
            case 28:
               var10000 = 184;
               break;
            case 29:
               var10000 = 20;
               break;
            case 30:
               var10000 = 134;
               break;
            case 31:
               var10000 = 34;
               break;
            case 32:
               var10000 = 183;
               break;
            case 33:
               var10000 = 26;
               break;
            case 34:
               var10000 = 28;
               break;
            case 35:
               var10000 = 39;
               break;
            case 36:
               var10000 = 213;
               break;
            case 37:
               var10000 = 208;
               break;
            case 38:
               var10000 = 231;
               break;
            case 39:
               var10000 = 43;
               break;
            case 40:
               var10000 = 201;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 243;
               break;
            case 43:
               var10000 = 245;
               break;
            case 44:
               var10000 = 135;
               break;
            case 45:
               var10000 = 247;
               break;
            case 46:
               var10000 = 176;
               break;
            case 47:
               var10000 = 152;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 217;
               break;
            case 50:
               var10000 = 140;
               break;
            case 51:
               var10000 = 32;
               break;
            case 52:
               var10000 = 173;
               break;
            case 53:
               var10000 = 19;
               break;
            case 54:
               var10000 = 40;
               break;
            case 55:
               var10000 = 65;
               break;
            case 56:
               var10000 = 54;
               break;
            case 57:
               var10000 = 114;
               break;
            case 58:
               var10000 = 196;
               break;
            case 59:
               var10000 = 244;
               break;
            case 60:
               var10000 = 181;
               break;
            case 61:
               var10000 = 13;
               break;
            case 62:
               var10000 = 27;
               break;
            case 63:
               var10000 = 142;
               break;
            case 64:
               var10000 = 73;
               break;
            case 65:
               var10000 = 242;
               break;
            case 66:
               var10000 = 60;
               break;
            case 67:
               var10000 = 91;
               break;
            case 68:
               var10000 = 42;
               break;
            case 69:
               var10000 = 130;
               break;
            case 70:
               var10000 = 37;
               break;
            case 71:
               var10000 = 116;
               break;
            case 72:
               var10000 = 123;
               break;
            case 73:
               var10000 = 14;
               break;
            case 74:
               var10000 = 101;
               break;
            case 75:
               var10000 = 146;
               break;
            case 76:
               var10000 = 216;
               break;
            case 77:
               var10000 = 168;
               break;
            case 78:
               var10000 = 233;
               break;
            case 79:
               var10000 = 102;
               break;
            case 80:
               var10000 = 30;
               break;
            case 81:
               var10000 = 122;
               break;
            case 82:
               var10000 = 204;
               break;
            case 83:
               var10000 = 223;
               break;
            case 84:
               var10000 = 143;
               break;
            case 85:
               var10000 = 133;
               break;
            case 86:
               var10000 = 69;
               break;
            case 87:
               var10000 = 93;
               break;
            case 88:
               var10000 = 236;
               break;
            case 89:
               var10000 = 80;
               break;
            case 90:
               var10000 = 170;
               break;
            case 91:
               var10000 = 56;
               break;
            case 92:
               var10000 = 49;
               break;
            case 93:
               var10000 = 254;
               break;
            case 94:
               var10000 = 222;
               break;
            case 95:
               var10000 = 149;
               break;
            case 96:
               var10000 = 127;
               break;
            case 97:
               var10000 = 1;
               break;
            case 98:
               var10000 = 85;
               break;
            case 99:
               var10000 = 51;
               break;
            case 100:
               var10000 = 224;
               break;
            case 101:
               var10000 = 17;
               break;
            case 102:
               var10000 = 164;
               break;
            case 103:
               var10000 = 89;
               break;
            case 104:
               var10000 = 36;
               break;
            case 105:
               var10000 = 221;
               break;
            case 106:
               var10000 = 200;
               break;
            case 107:
               var10000 = 226;
               break;
            case 108:
               var10000 = 153;
               break;
            case 109:
               var10000 = 41;
               break;
            case 110:
               var10000 = 97;
               break;
            case 111:
               var10000 = 154;
               break;
            case 112:
               var10000 = 199;
               break;
            case 113:
               var10000 = 198;
               break;
            case 114:
               var10000 = 113;
               break;
            case 115:
               var10000 = 172;
               break;
            case 116:
               var10000 = 2;
               break;
            case 117:
               var10000 = 0;
               break;
            case 118:
               var10000 = 230;
               break;
            case 119:
               var10000 = 25;
               break;
            case 120:
               var10000 = 23;
               break;
            case 121:
               var10000 = 240;
               break;
            case 122:
               var10000 = 203;
               break;
            case 123:
               var10000 = 157;
               break;
            case 124:
               var10000 = 126;
               break;
            case 125:
               var10000 = 62;
               break;
            case 126:
               var10000 = 105;
               break;
            case 127:
               var10000 = 219;
               break;
            case 128:
               var10000 = 31;
               break;
            case 129:
               var10000 = 68;
               break;
            case 130:
               var10000 = 210;
               break;
            case 131:
               var10000 = 86;
               break;
            case 132:
               var10000 = 112;
               break;
            case 133:
               var10000 = 115;
               break;
            case 134:
               var10000 = 194;
               break;
            case 135:
               var10000 = 121;
               break;
            case 136:
               var10000 = 106;
               break;
            case 137:
               var10000 = 59;
               break;
            case 138:
               var10000 = 81;
               break;
            case 139:
               var10000 = 167;
               break;
            case 140:
               var10000 = 4;
               break;
            case 141:
               var10000 = 75;
               break;
            case 142:
               var10000 = 77;
               break;
            case 143:
               var10000 = 229;
               break;
            case 144:
               var10000 = 129;
               break;
            case 145:
               var10000 = 220;
               break;
            case 146:
               var10000 = 119;
               break;
            case 147:
               var10000 = 158;
               break;
            case 148:
               var10000 = 111;
               break;
            case 149:
               var10000 = 58;
               break;
            case 150:
               var10000 = 6;
               break;
            case 151:
               var10000 = 47;
               break;
            case 152:
               var10000 = 11;
               break;
            case 153:
               var10000 = 46;
               break;
            case 154:
               var10000 = 38;
               break;
            case 155:
               var10000 = 185;
               break;
            case 156:
               var10000 = 76;
               break;
            case 157:
               var10000 = 16;
               break;
            case 158:
               var10000 = 95;
               break;
            case 159:
               var10000 = 55;
               break;
            case 160:
               var10000 = 92;
               break;
            case 161:
               var10000 = 191;
               break;
            case 162:
               var10000 = 234;
               break;
            case 163:
               var10000 = 179;
               break;
            case 164:
               var10000 = 190;
               break;
            case 165:
               var10000 = 61;
               break;
            case 166:
               var10000 = 141;
               break;
            case 167:
               var10000 = 241;
               break;
            case 168:
               var10000 = 5;
               break;
            case 169:
               var10000 = 94;
               break;
            case 170:
               var10000 = 218;
               break;
            case 171:
               var10000 = 232;
               break;
            case 172:
               var10000 = 139;
               break;
            case 173:
               var10000 = 253;
               break;
            case 174:
               var10000 = 90;
               break;
            case 175:
               var10000 = 212;
               break;
            case 176:
               var10000 = 82;
               break;
            case 177:
               var10000 = 189;
               break;
            case 178:
               var10000 = 84;
               break;
            case 179:
               var10000 = 162;
               break;
            case 180:
               var10000 = 24;
               break;
            case 181:
               var10000 = 150;
               break;
            case 182:
               var10000 = 10;
               break;
            case 183:
               var10000 = 206;
               break;
            case 184:
               var10000 = 177;
               break;
            case 185:
               var10000 = 175;
               break;
            case 186:
               var10000 = 45;
               break;
            case 187:
               var10000 = 15;
               break;
            case 188:
               var10000 = 22;
               break;
            case 189:
               var10000 = 192;
               break;
            case 190:
               var10000 = 180;
               break;
            case 191:
               var10000 = 163;
               break;
            case 192:
               var10000 = 48;
               break;
            case 193:
               var10000 = 178;
               break;
            case 194:
               var10000 = 117;
               break;
            case 195:
               var10000 = 252;
               break;
            case 196:
               var10000 = 57;
               break;
            case 197:
               var10000 = 128;
               break;
            case 198:
               var10000 = 50;
               break;
            case 199:
               var10000 = 108;
               break;
            case 200:
               var10000 = 248;
               break;
            case 201:
               var10000 = 228;
               break;
            case 202:
               var10000 = 209;
               break;
            case 203:
               var10000 = 72;
               break;
            case 204:
               var10000 = 250;
               break;
            case 205:
               var10000 = 96;
               break;
            case 206:
               var10000 = 64;
               break;
            case 207:
               var10000 = 103;
               break;
            case 208:
               var10000 = 235;
               break;
            case 209:
               var10000 = 35;
               break;
            case 210:
               var10000 = 197;
               break;
            case 211:
               var10000 = 66;
               break;
            case 212:
               var10000 = 79;
               break;
            case 213:
               var10000 = 138;
               break;
            case 214:
               var10000 = 193;
               break;
            case 215:
               var10000 = 33;
               break;
            case 216:
               var10000 = 70;
               break;
            case 217:
               var10000 = 159;
               break;
            case 218:
               var10000 = 144;
               break;
            case 219:
               var10000 = 249;
               break;
            case 220:
               var10000 = 118;
               break;
            case 221:
               var10000 = 8;
               break;
            case 222:
               var10000 = 71;
               break;
            case 223:
               var10000 = 145;
               break;
            case 224:
               var10000 = 169;
               break;
            case 225:
               var10000 = 147;
               break;
            case 226:
               var10000 = 246;
               break;
            case 227:
               var10000 = 136;
               break;
            case 228:
               var10000 = 78;
               break;
            case 229:
               var10000 = 227;
               break;
            case 230:
               var10000 = 109;
               break;
            case 231:
               var10000 = 239;
               break;
            case 232:
               var10000 = 207;
               break;
            case 233:
               var10000 = 98;
               break;
            case 234:
               var10000 = 195;
               break;
            case 235:
               var10000 = 9;
               break;
            case 236:
               var10000 = 131;
               break;
            case 237:
               var10000 = 125;
               break;
            case 238:
               var10000 = 205;
               break;
            case 239:
               var10000 = 166;
               break;
            case 240:
               var10000 = 53;
               break;
            case 241:
               var10000 = 87;
               break;
            case 242:
               var10000 = 156;
               break;
            case 243:
               var10000 = 174;
               break;
            case 244:
               var10000 = 161;
               break;
            case 245:
               var10000 = 21;
               break;
            case 246:
               var10000 = 52;
               break;
            case 247:
               var10000 = 120;
               break;
            case 248:
               var10000 = 99;
               break;
            case 249:
               var10000 = 3;
               break;
            case 250:
               var10000 = 110;
               break;
            case 251:
               var10000 = 124;
               break;
            case 252:
               var10000 = 132;
               break;
            case 253:
               var10000 = 211;
               break;
            case 254:
               var10000 = 12;
               break;
            default:
               var10000 = 44;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0092.ÎÄ}/P.õÛÿDU\u008aß\u000e÷ÝbºèàëÓ¥âY\u007f\u0095q\u000bàb\u0000\u0003Ö2\tÍf¢k";
      int var6 = "\u0092.ÎÄ}/P.õÛÿDU\u008aß\u000e÷ÝbºèàëÓ¥âY\u007f\u0095q\u000bàb\u0000\u0003Ö2\tÍf¢k".length();
      T(false);
      char var3 = 15;
      int var2 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var4.substring(++var2, var2 + var3).toCharArray();
            int var10004 = var10003.length;
            int var8 = 0;
            byte var17 = 27;
            var10002 = var10003;
            int var10 = var10004;
            byte var20;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var20 = 27;
               var10006 = var8;
            } else {
               var17 = 27;
               var10 = var10004;
               if (var10004 <= var8) {
                  break label38;
               }

               var10005 = var10003;
               var20 = 27;
               var10006 = var8;
            }

            while (true) {
               char var32 = var10005[var10006];
               byte var33;
               switch (var8 % 7) {
                  case 0:
                     var33 = 60;
                     break;
                  case 1:
                     var33 = 64;
                     break;
                  case 2:
                     var33 = 72;
                     break;
                  case 3:
                     var33 = 16;
                     break;
                  case 4:
                     var33 = 36;
                     break;
                  case 5:
                     var33 = 65;
                     break;
                  default:
                     var33 = 123;
               }

               var10005[var10006] = (char)(var32 ^ var20 ^ var33);
               var8++;
               if (var17 == 0) {
                  var10006 = var17;
                  var10005 = var10002;
                  var20 = var17;
               } else {
                  if (var10 <= var8) {
                     break;
                  }

                  var10005 = var10002;
                  var20 = var17;
                  var10006 = var8;
               }
            }
         }

         String var19 = new String(var10002).intern();
         byte var12 = -1;
         var7[var5++] = var19;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            long var0 = 2191926277497134161L;
            long var16 = -8972016694993118115L ^ var0;
            var12 = -1;
            e = var16;
            a = new ImageIcon(Oj2.class.getResource(a(-4325, -12124)));
            Y = new ImageIcon(Oj2.class.getResource(a(-4326, -21390)));
            return;
         }

         var3 = var4.charAt(var2);
      }
   }
}





