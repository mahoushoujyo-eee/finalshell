package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Random;

public class HW3 extends HN3 {
   public float C = 0.1F;
   public float u = 1.0F;
   public float V = 0.0F;
   public float K = 1.0F;
   public float v = 1.0F;
   public float b = 8.0F;
   public float Y = 2.0F;
   public float c = 1.0F;
   public float h;
   public int x;
   public float B;
   public float f;
   public Random P;
   public float l;
   public float R;
   public float S;
   public float i;
   public float o;
   public float M;
   public float U;
   public float k;
   public int j;
   public float F;
   public float X;
   public float E;
   public float z;
   public float W;
   public float r;
   public float d;
   public float p;
   public float G;
   public float[] w;
   public float[] Q;
   public BufferedImage T;
   public float y;
   public float a;
   public float I;
   public float J;
   public static String[] e;
   public static String[] g;
   public static long[] m;
   public static Integer[] n;

   public HW3() {
      String[] var10000 = W5.q();
      this.h = 0.6F;
      this.P = new Random();
      this.l = 0.5F;
      String[] var1 = var10000;
      this.R = 0.5F;
      this.S = 0.3F;
      this.i = 0.5F;
      this.o = 0.5F;
      this.M = 0.96F;
      this.U = 0.0F;
      this.k = 10.0F;
      this.j = -1;
      this.z = 0.5F;
      this.W = 0.5F;
      this.r = 0.0F;
      this.d = 0.0F;
      this.p = 0.0F;
      this.G = 1.0F;
      HW3 var2 = this;
      if (var1 != null) {
         if (this.T != null) {
            return;
         }

         var2 = this;
      }

      var2.T = Zb2.d(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource(a(30435, 4608))).getSource());
   }

   public void k(float var1) {
      this.K = var1;
   }

   public float E() {
      return this.K;
   }

   public void U(int var1) {
      this.x = var1;
   }

   public int x() {
      return this.x;
   }

   public void x(float var1) {
      this.C = var1;
   }

   public float p() {
      return this.C;
   }

   public void H(float var1) {
      this.u = var1;
   }

   public float q() {
      return this.u;
   }

   public void l(float var1) {
      this.U = var1;
   }

   public float Q() {
      return this.U;
   }

   public void R(float var1) {
      this.G = var1;
   }

   public float G() {
      return this.G;
   }

   public void e(float var1) {
      this.l = var1;
   }

   public float g() {
      return this.l;
   }

   public void r(float var1) {
      this.R = var1;
   }

   public float k() {
      return this.R;
   }

   public void P(float var1) {
      this.S = var1;
   }

   public float S() {
      return this.S;
   }

   public void K(float var1) {
      this.i = var1;
   }

   public float o() {
      return this.i;
   }

   public void S(float var1) {
      this.o = var1;
   }

   public float Z() {
      return this.o;
   }

   public void O(float var1) {
      this.V = var1;
   }

   public float X() {
      return this.V;
   }

   public void Q(float var1) {
      this.b = var1;
   }

   public float t() {
      return this.b;
   }

   public void y(float var1) {
      this.v = var1;
   }

   public float F() {
      return this.v;
   }

   public void U(float var1) {
      this.Y = var1;
   }

   public float m() {
      return this.Y;
   }

   public void i(float var1) {
      this.c = var1;
   }

   public float u() {
      return this.c;
   }

   public void d(float var1) {
      this.h = var1;
   }

   public float b() {
      return this.h;
   }

   public void Z(float var1) {
      this.M = var1;
   }

   public float l() {
      return this.M;
   }

   public void n(float var1) {
      this.W = var1;
   }

   public float c() {
      return this.W;
   }

   public void D(float var1) {
      this.z = var1;
   }

   public float J() {
      return this.z;
   }

   public void K(int var1) {
      this.j = var1;
   }

   public int W() {
      return this.j;
   }

   public void J(float var1) {
      this.p = var1;
   }

   public float i() {
      return this.p;
   }

   public void o(float var1) {
      this.d = var1;
   }

   public float a() {
      return this.d;
   }

   public void m(float var1) {
      this.r = var1;
   }

   public float r() {
      return this.r;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      BufferedImage var13;
      Graphics2D var9;
      long var4 = System.currentTimeMillis();
      String[] var10000 = W5.q();
      this.F = (float)(this.j >> a(441, 1969262590378910249L) & a(19191, 7104045652179741039L)) * 0.003921569F;
      this.X = (float)(this.j >> a(24501, 4506612208273161250L) & a(7626, 6180954340632280668L)) * 0.003921569F;
      String[] var3 = var10000;
      this.E = (float)(this.j & a(7626, 6180954340632280668L)) * 0.003921569F;
      this.I = 10000.0F;
      this.J = -10000.0F;
      this.w = new float[(int)this.b + 1];
      float var6 = 1.0F;
      int var7 = 0;

      while (true) {
         if (var7 <= (int)this.b) {
            this.w[var7] = (float)Math.pow(2.0, (double)(-var7));
            var6 *= this.Y;
            var7++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         this.B = -1.0F;
         this.f = 1.0F;
         this.y = (float)var1.getWidth();
         this.a = (float)var1.getHeight();
         var7 = var1.getHeight();
         this.Q = new float[var7];
         break;
      }

      int var8 = 0;

      label31: {
         while (true) {
            if (var8 < var7) {
               this.Q[var8] = (float)Math.tan((double)(this.G * (float)var8 / (float)var7) * Math.PI * 0.5);
               var8++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            var13 = var2;
            if (var3 == null) {
               break label31;
            }

            if (var2 == null) {
               var2 = this.createCompatibleDestImage(var1, null);
            }

            var8 = (int)(63.0F * this.S);
            break;
         }

         var13 = var2;
      }

      var9 = var13.createGraphics();
      var9.drawImage(this.T, 0, 0, var2.getWidth(), var2.getHeight(), var8, 0, var8 + 1, a(1713, 1373492479831942432L), null);
      var9.dispose();
      BufferedImage var10 = super.filter(var2, var2);
      long var11 = System.currentTimeMillis();
      System.out.println(this.I + " " + this.J + " " + (float)(var11 - var4) * 0.001F);
      this.w = null;
      this.Q = null;
      return var2;
   }

   public float k(float var1, float var2) {
      float var9;
      String[] var10000 = W5.q();
      float var4 = 0.0F;
      var1 += 371.0F;
      String[] var3 = var10000;
      var2 += 529.0F;
      int var6 = 0;

      while (true) {
         if (var6 < (int)this.b) {
            var4 += UZ.G(var1, var2, this.U) * this.w[var6];
            var1 *= this.Y;
            var9 = var2 * this.Y;
            if (var3 == null) {
               break;
            }

            var2 = var9;
            var6++;
            if (var3 != null) {
               continue;
            }
         }

         var9 = this.b - (float)((int)this.b);
         break;
      }

      float var5 = var9;
      float var10 = var5;
      if (var3 != null) {
         if (var5 != 0.0F) {
            var4 += var5 * UZ.G(var1, var2, this.U) * this.w[var6];
         }

         var10 = var4;
      }

      return var10;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      float var13;
      float var9;
      float var5 = (float)var1 / this.y;
      float var6 = (float)var2 / this.a;
      float var7 = (float)Math.pow((double)this.M, (double)(100.0F * var6 * var6));
      float var8 = (float)(var3 >> a(27537, 9161988940983322626L) & a(7626, 6180954340632280668L)) * 0.003921569F;
      var9 = (float)(var3 >> a(27458, 4500278557435775191L) & a(7626, 6180954340632280668L)) * 0.003921569F;
      String[] var10000 = W5.q();
      float var10 = (float)(var3 & a(7626, 6180954340632280668L)) * 0.003921569F;
      float var11 = this.y * 0.5F;
      float var12 = (float)var1 - var11;
      var13 = (float)var2;
      var13 = this.Q[var2];
      var12 = (var5 - 0.5F) * (1.0F + var13);
      var13 += this.U * this.r;
      var12 /= this.C;
      var13 /= this.C * this.u;
      String[] var4 = var10000;
      float var14 = this.k(var12, var13);
      var14 = (var14 + 1.23F) / 2.46F;
      int var16 = var3 & a(16129, 5220240986096016531L);
      float var18 = var14 - this.l;
      float var52 = var18;
      float var10001 = 0.0F;
      if (var4 != null) {
         if (var18 < 0.0F) {
            var18 = 0.0F;
         }

         var52 = 1.0F;
         var10001 = (float)Math.pow((double)this.R, (double)var18);
      }

      float var19 = var52 - var10001;
      this.I = Math.min(this.I, var19);
      this.J = Math.max(this.J, var19);
      float var20 = this.y * this.z;
      float var21 = this.a * this.W;
      float var22 = (float)var1 - var20;
      float var23 = (float)var2 - var21;
      float var24 = var22 * var22 + var23 * var23;
      var24 = (float)Math.pow((double)var24, (double)this.o);
      float var25 = 10.0F * (float)Math.exp((double)(-var24 * this.i * 0.1F));
      var8 += var25 * this.F;
      var9 += var25 * this.X;
      var10 += var25 * this.E;
      float var26 = (1.0F - var19 * var19 * var19 * var19) * this.K;
      float var27 = this.F * var26;
      float var28 = this.X * var26;
      float var29 = this.E * var26;
      var19 *= var7;
      float var30 = 1.0F - var19;
      var8 = var30 * var8 + var19 * var27;
      var9 = var30 * var9 + var19 * var28;
      var10 = var30 * var10 + var19 * var29;
      float var31 = this.c;
      var8 = 1.0F - (float)Math.exp((double)(-var8 * var31));
      var9 = 1.0F - (float)Math.exp((double)(-var9 * var31));
      var10 = 1.0F - (float)Math.exp((double)(-var10 * var31));
      int var32 = (int)(255.0F * var8) << a(27537, 9161988940983322626L);
      int var33 = (int)(255.0F * var9) << a(27458, 4500278557435775191L);
      int var34 = (int)(255.0F * var10);
      int var17 = a(9837, 6872046394534364665L) | var32 | var33 | var34;
      if (var4 == null) {
         Ky4.K(new String[1]);
      }

      return var17;
   }

   @Override
   public String toString() {
      return a(30434, 14254);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 30435) & 65535;
      if (g[var2] == null) {
         char[] var3 = e[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 249;
               break;
            case 1:
               var10000 = 93;
               break;
            case 2:
               var10000 = 194;
               break;
            case 3:
               var10000 = 190;
               break;
            case 4:
               var10000 = 185;
               break;
            case 5:
               var10000 = 156;
               break;
            case 6:
               var10000 = 210;
               break;
            case 7:
               var10000 = 17;
               break;
            case 8:
               var10000 = 1;
               break;
            case 9:
               var10000 = 145;
               break;
            case 10:
               var10000 = 89;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 30;
               break;
            case 13:
               var10000 = 98;
               break;
            case 14:
               var10000 = 121;
               break;
            case 15:
               var10000 = 180;
               break;
            case 16:
               var10000 = 63;
               break;
            case 17:
               var10000 = 81;
               break;
            case 18:
               var10000 = 85;
               break;
            case 19:
               var10000 = 200;
               break;
            case 20:
               var10000 = 94;
               break;
            case 21:
               var10000 = 203;
               break;
            case 22:
               var10000 = 174;
               break;
            case 23:
               var10000 = 218;
               break;
            case 24:
               var10000 = 187;
               break;
            case 25:
               var10000 = 248;
               break;
            case 26:
               var10000 = 232;
               break;
            case 27:
               var10000 = 82;
               break;
            case 28:
               var10000 = 141;
               break;
            case 29:
               var10000 = 5;
               break;
            case 30:
               var10000 = 182;
               break;
            case 31:
               var10000 = 253;
               break;
            case 32:
               var10000 = 10;
               break;
            case 33:
               var10000 = 117;
               break;
            case 34:
               var10000 = 176;
               break;
            case 35:
               var10000 = 107;
               break;
            case 36:
               var10000 = 255;
               break;
            case 37:
               var10000 = 27;
               break;
            case 38:
               var10000 = 44;
               break;
            case 39:
               var10000 = 50;
               break;
            case 40:
               var10000 = 206;
               break;
            case 41:
               var10000 = 110;
               break;
            case 42:
               var10000 = 138;
               break;
            case 43:
               var10000 = 84;
               break;
            case 44:
               var10000 = 123;
               break;
            case 45:
               var10000 = 193;
               break;
            case 46:
               var10000 = 155;
               break;
            case 47:
               var10000 = 34;
               break;
            case 48:
               var10000 = 211;
               break;
            case 49:
               var10000 = 238;
               break;
            case 50:
               var10000 = 42;
               break;
            case 51:
               var10000 = 104;
               break;
            case 52:
               var10000 = 242;
               break;
            case 53:
               var10000 = 8;
               break;
            case 54:
               var10000 = 96;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 209;
               break;
            case 57:
               var10000 = 112;
               break;
            case 58:
               var10000 = 204;
               break;
            case 59:
               var10000 = 62;
               break;
            case 60:
               var10000 = 6;
               break;
            case 61:
               var10000 = 197;
               break;
            case 62:
               var10000 = 151;
               break;
            case 63:
               var10000 = 163;
               break;
            case 64:
               var10000 = 158;
               break;
            case 65:
               var10000 = 201;
               break;
            case 66:
               var10000 = 101;
               break;
            case 67:
               var10000 = 95;
               break;
            case 68:
               var10000 = 159;
               break;
            case 69:
               var10000 = 64;
               break;
            case 70:
               var10000 = 68;
               break;
            case 71:
               var10000 = 114;
               break;
            case 72:
               var10000 = 111;
               break;
            case 73:
               var10000 = 227;
               break;
            case 74:
               var10000 = 229;
               break;
            case 75:
               var10000 = 199;
               break;
            case 76:
               var10000 = 55;
               break;
            case 77:
               var10000 = 240;
               break;
            case 78:
               var10000 = 91;
               break;
            case 79:
               var10000 = 83;
               break;
            case 80:
               var10000 = 61;
               break;
            case 81:
               var10000 = 70;
               break;
            case 82:
               var10000 = 184;
               break;
            case 83:
               var10000 = 22;
               break;
            case 84:
               var10000 = 212;
               break;
            case 85:
               var10000 = 18;
               break;
            case 86:
               var10000 = 125;
               break;
            case 87:
               var10000 = 130;
               break;
            case 88:
               var10000 = 21;
               break;
            case 89:
               var10000 = 246;
               break;
            case 90:
               var10000 = 191;
               break;
            case 91:
               var10000 = 129;
               break;
            case 92:
               var10000 = 65;
               break;
            case 93:
               var10000 = 215;
               break;
            case 94:
               var10000 = 164;
               break;
            case 95:
               var10000 = 250;
               break;
            case 96:
               var10000 = 244;
               break;
            case 97:
               var10000 = 31;
               break;
            case 98:
               var10000 = 195;
               break;
            case 99:
               var10000 = 40;
               break;
            case 100:
               var10000 = 77;
               break;
            case 101:
               var10000 = 228;
               break;
            case 102:
               var10000 = 144;
               break;
            case 103:
               var10000 = 72;
               break;
            case 104:
               var10000 = 181;
               break;
            case 105:
               var10000 = 47;
               break;
            case 106:
               var10000 = 78;
               break;
            case 107:
               var10000 = 29;
               break;
            case 108:
               var10000 = 252;
               break;
            case 109:
               var10000 = 157;
               break;
            case 110:
               var10000 = 124;
               break;
            case 111:
               var10000 = 103;
               break;
            case 112:
               var10000 = 2;
               break;
            case 113:
               var10000 = 119;
               break;
            case 114:
               var10000 = 154;
               break;
            case 115:
               var10000 = 90;
               break;
            case 116:
               var10000 = 241;
               break;
            case 117:
               var10000 = 57;
               break;
            case 118:
               var10000 = 73;
               break;
            case 119:
               var10000 = 69;
               break;
            case 120:
               var10000 = 175;
               break;
            case 121:
               var10000 = 15;
               break;
            case 122:
               var10000 = 196;
               break;
            case 123:
               var10000 = 188;
               break;
            case 124:
               var10000 = 139;
               break;
            case 125:
               var10000 = 205;
               break;
            case 126:
               var10000 = 102;
               break;
            case 127:
               var10000 = 4;
               break;
            case 128:
               var10000 = 222;
               break;
            case 129:
               var10000 = 146;
               break;
            case 130:
               var10000 = 66;
               break;
            case 131:
               var10000 = 136;
               break;
            case 132:
               var10000 = 54;
               break;
            case 133:
               var10000 = 153;
               break;
            case 134:
               var10000 = 237;
               break;
            case 135:
               var10000 = 219;
               break;
            case 136:
               var10000 = 189;
               break;
            case 137:
               var10000 = 106;
               break;
            case 138:
               var10000 = 234;
               break;
            case 139:
               var10000 = 76;
               break;
            case 140:
               var10000 = 131;
               break;
            case 141:
               var10000 = 172;
               break;
            case 142:
               var10000 = 52;
               break;
            case 143:
               var10000 = 46;
               break;
            case 144:
               var10000 = 192;
               break;
            case 145:
               var10000 = 178;
               break;
            case 146:
               var10000 = 224;
               break;
            case 147:
               var10000 = 59;
               break;
            case 148:
               var10000 = 230;
               break;
            case 149:
               var10000 = 152;
               break;
            case 150:
               var10000 = 109;
               break;
            case 151:
               var10000 = 39;
               break;
            case 152:
               var10000 = 171;
               break;
            case 153:
               var10000 = 127;
               break;
            case 154:
               var10000 = 9;
               break;
            case 155:
               var10000 = 116;
               break;
            case 156:
               var10000 = 220;
               break;
            case 157:
               var10000 = 16;
               break;
            case 158:
               var10000 = 183;
               break;
            case 159:
               var10000 = 67;
               break;
            case 160:
               var10000 = 115;
               break;
            case 161:
               var10000 = 165;
               break;
            case 162:
               var10000 = 13;
               break;
            case 163:
               var10000 = 33;
               break;
            case 164:
               var10000 = 143;
               break;
            case 165:
               var10000 = 208;
               break;
            case 166:
               var10000 = 128;
               break;
            case 167:
               var10000 = 25;
               break;
            case 168:
               var10000 = 168;
               break;
            case 169:
               var10000 = 137;
               break;
            case 170:
               var10000 = 56;
               break;
            case 171:
               var10000 = 32;
               break;
            case 172:
               var10000 = 169;
               break;
            case 173:
               var10000 = 254;
               break;
            case 174:
               var10000 = 86;
               break;
            case 175:
               var10000 = 150;
               break;
            case 176:
               var10000 = 133;
               break;
            case 177:
               var10000 = 148;
               break;
            case 178:
               var10000 = 134;
               break;
            case 179:
               var10000 = 108;
               break;
            case 180:
               var10000 = 97;
               break;
            case 181:
               var10000 = 80;
               break;
            case 182:
               var10000 = 3;
               break;
            case 183:
               var10000 = 161;
               break;
            case 184:
               var10000 = 186;
               break;
            case 185:
               var10000 = 92;
               break;
            case 186:
               var10000 = 11;
               break;
            case 187:
               var10000 = 231;
               break;
            case 188:
               var10000 = 147;
               break;
            case 189:
               var10000 = 236;
               break;
            case 190:
               var10000 = 226;
               break;
            case 191:
               var10000 = 245;
               break;
            case 192:
               var10000 = 48;
               break;
            case 193:
               var10000 = 53;
               break;
            case 194:
               var10000 = 88;
               break;
            case 195:
               var10000 = 214;
               break;
            case 196:
               var10000 = 37;
               break;
            case 197:
               var10000 = 223;
               break;
            case 198:
               var10000 = 14;
               break;
            case 199:
               var10000 = 162;
               break;
            case 200:
               var10000 = 36;
               break;
            case 201:
               var10000 = 99;
               break;
            case 202:
               var10000 = 23;
               break;
            case 203:
               var10000 = 170;
               break;
            case 204:
               var10000 = 126;
               break;
            case 205:
               var10000 = 217;
               break;
            case 206:
               var10000 = 198;
               break;
            case 207:
               var10000 = 142;
               break;
            case 208:
               var10000 = 28;
               break;
            case 209:
               var10000 = 100;
               break;
            case 210:
               var10000 = 179;
               break;
            case 211:
               var10000 = 221;
               break;
            case 212:
               var10000 = 87;
               break;
            case 213:
               var10000 = 38;
               break;
            case 214:
               var10000 = 19;
               break;
            case 215:
               var10000 = 35;
               break;
            case 216:
               var10000 = 120;
               break;
            case 217:
               var10000 = 75;
               break;
            case 218:
               var10000 = 41;
               break;
            case 219:
               var10000 = 12;
               break;
            case 220:
               var10000 = 149;
               break;
            case 221:
               var10000 = 243;
               break;
            case 222:
               var10000 = 140;
               break;
            case 223:
               var10000 = 247;
               break;
            case 224:
               var10000 = 239;
               break;
            case 225:
               var10000 = 213;
               break;
            case 226:
               var10000 = 79;
               break;
            case 227:
               var10000 = 7;
               break;
            case 228:
               var10000 = 58;
               break;
            case 229:
               var10000 = 122;
               break;
            case 230:
               var10000 = 167;
               break;
            case 231:
               var10000 = 135;
               break;
            case 232:
               var10000 = 49;
               break;
            case 233:
               var10000 = 160;
               break;
            case 234:
               var10000 = 166;
               break;
            case 235:
               var10000 = 60;
               break;
            case 236:
               var10000 = 235;
               break;
            case 237:
               var10000 = 202;
               break;
            case 238:
               var10000 = 0;
               break;
            case 239:
               var10000 = 43;
               break;
            case 240:
               var10000 = 26;
               break;
            case 241:
               var10000 = 225;
               break;
            case 242:
               var10000 = 51;
               break;
            case 243:
               var10000 = 20;
               break;
            case 244:
               var10000 = 216;
               break;
            case 245:
               var10000 = 207;
               break;
            case 246:
               var10000 = 45;
               break;
            case 247:
               var10000 = 74;
               break;
            case 248:
               var10000 = 71;
               break;
            case 249:
               var10000 = 177;
               break;
            case 250:
               var10000 = 105;
               break;
            case 251:
               var10000 = 132;
               break;
            case 252:
               var10000 = 233;
               break;
            case 253:
               var10000 = 113;
               break;
            case 254:
               var10000 = 173;
               break;
            default:
               var10000 = 251;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9104;
      if (n[var3] == null) {
         n[var3] = (int)(m[var3] ^ var1);
      }

      return n[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13;
      char var9;
      var13 = new String[2];
      int var11 = 0;
      String var10 = "ßÔ{t·>Ò\u0007Ú2\u009d\"]\u000eºE1¾Å¨ÏU\u0012Ë©°º\u001a";
      int var12 = "ßÔ{t·>Ò\u0007Ú2\u009d\"]\u000eºE1¾Å¨ÏU\u0012Ë©°º\u001a".length();
      var9 = '\r';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 69;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 69;
               var10006 = var14;
            } else {
               var27 = 69;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 69;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 120;
                     break;
                  case 1:
                     var47 = 57;
                     break;
                  case 2:
                     var47 = 34;
                     break;
                  case 3:
                     var47 = 97;
                     break;
                  case 4:
                     var47 = 72;
                     break;
                  case 5:
                     var47 = 54;
                     break;
                  default:
                     var47 = 45;
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
            e = var13;
            g = new String[2];
            long var0 = 5667884269538468402L;
            long[] var6 = new long[9];
            int var3 = 0;
            String var4 = "\"ô\u0086?ÐÝ@\u000b·û2Ù\u0083ÐÇR\u0001Òê\u0088\u008cí~¡~F\u0010læ\u0083* \u008fä\u0092\u000e\u001cäçËcÔØõ\u0087\u0099*í\u001e¶þX'\u0096Ü\u0091";
            int var5 = "\"ô\u0086?ÐÝ@\u000b·û2Ù\u0083ÐÇR\u0001Òê\u0088\u008cí~¡~F\u0010læ\u0083* \u008fä\u0092\u000e\u001cäçËcÔØõ\u0087\u0099*í\u001e¶þX'\u0096Ü\u0091"
               .length();
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
                           m = var6;
                           n = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "»ú\u0003È\u0087R\u001e\u0018\u0010Ü«D\u001f\u0089\u008b¢";
                        var5 = "»ú\u0003È\u0087R\u001e\u0018\u0010Ü«D\u001f\u0089\u008b¢".length();
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





