package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

class YM extends MouseAdapter {
   private boolean L;
   private com.A.E C;
   private com.ky_4 n;
   private com.O_ v;
   private boolean I;
   private BufferedImage H;
   private Color y;
   final nx_4 O;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   YM(nx_4 var1) {
      this.O = var1;
      this.I = false;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = nx_4.R();
      boolean var10000 = this.O.X;
      if (var2 == 0) {
         if (!this.O.X) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      label33: {
         if (var2 == 0) {
            if (!var10000) {
               return;
            }

            var3 = this;
            if (var2 != 0) {
               break label33;
            }

            var10000 = this.O.isEnabled();
         }

         if (!var10000) {
            return;
         }

         this.L = true;
         this.N();
         this.I();
         this.C.pack();
         this.C.setVisible(true);
         this.n.requestFocus();
         var3 = this;
      }

      var3.d();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = nx_4.c();
      boolean var10000 = this.O.X;
      if (var2 != 0) {
         if (!this.O.X) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         com.YM var3 = this;
         if (var2 != 0) {
            if (this.C == null) {
               return;
            }

            this.I();
            var3 = this;
         }

         var3.d();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2 = nx_4.R();
      boolean var10000 = this.O.X;
      if (var2 == 0) {
         if (!this.O.X) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         com.A.E var3 = this.C;
         if (var2 == 0) {
            if (this.C == null) {
               return;
            }

            var3 = this.C;
         }

         var3.dispose();
      }
   }

   private void d() {
      int var1 = nx_4.c();
      com.YM var10000 = this;
      if (var1 != 0) {
         if (this.I) {
            return;
         }

         var10000 = this;
      }

      var10000.I = true;
      Thread var2 = new Thread(new eG_3(this));
      var2.setDaemon(true);
      var2.start();
   }

   private void N() {
      this.C = new com.A.E(this.O.L);
      this.C.setLayout(new BorderLayout());
      this.C.setAlwaysOnTop(true);
      this.C.setFocusableWindowState(false);
      this.C.addWindowListener(new PH(this));
      com.LD var1 = new com.LD(this);
      this.n = new com.ky_4(var1);
      this.n.setFocusable(true);
      this.n.setPreferredSize(new Dimension(a(11515, 6624640196447847543L), a(17760, 8066222450726219246L)));
      this.C.add(this.n, a(-13118, -6776));
      this.v = new com.O_(a(31235, 5940480852037440140L));
      this.v.x(4);
      this.v.setIcon(new com.lx_4(this));
      this.v.V(new com.LR(this));
      this.C.add(this.v, a(-13117, -1694));
      w6_2.v(this.n, GR.lD, new nu_4(this));
   }

   private void I() {
      int var1;
      Point var2;
      Rectangle var3;
      int var5;
      int var9;
      label25: {
         var9 = nx_4.R();
         var2 = MouseInfo.getPointerInfo().getLocation();
         var1 = var9;
         var3 = this.C.getGraphicsConfiguration().getDevice().getDefaultConfiguration().getBounds();
         int var4 = this.C.getWidth();
         var5 = this.C.getHeight();
         var9 = var2.x + a(19200, 6499329437529908106L) + var4;
         int var10001 = var3.x + var3.width;
         if (var1 == 0) {
            if (var9 < var10001) {
               var9 = var2.x + a(25477, 1625791149683510024L);
               break label25;
            }

            var9 = var2.x - a(25477, 1625791149683510024L);
            var10001 = var4;
         }

         var9 -= var10001;
      }

      int var6;
      label19: {
         var6 = var9;
         var9 = var2.y + a(25477, 1625791149683510024L) + var5;
         int var12 = var3.y + var3.height;
         if (var1 == 0) {
            if (var9 < var12) {
               var9 = var2.y + a(25477, 1625791149683510024L);
               break label19;
            }

            var9 = var2.y - a(25477, 1625791149683510024L);
            var12 = var5;
         }

         var9 -= var12;
      }

      int var7 = var9;
      this.C.setLocation(var6, var7);
   }

   static com.ky_4 l(com.YM var0) {
      return var0.n;
   }

   static BufferedImage I(com.YM var0, BufferedImage var1) {
      return var0.H = var1;
   }

   static Color d(com.YM var0, Color var1) {
      return var0.y = var1;
   }

   static BufferedImage q(com.YM var0) {
      return var0.H;
   }

   static Color O(com.YM var0) {
      return var0.y;
   }

   static com.O_ N(com.YM var0) {
      return var0.v;
   }

   static boolean C(com.YM var0, boolean var1) {
      return var0.I = var1;
   }

   static boolean Z(com.YM var0) {
      return var0.L;
   }

   static com.A.E E(com.YM var0, com.A.E var1) {
      return var0.C = var1;
   }

   static com.ky_4 W(com.YM var0, com.ky_4 var1) {
      return var0.n = var1;
   }

   static com.A.E M(com.YM var0) {
      return var0.C;
   }

   static boolean A(com.YM var0, boolean var1) {
      return var0.L = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "¾\u0094/ál\\\u0005H~ø÷ã";
      int var12 = "¾\u0094/ál\\\u0005H~ø÷ã".length();
      char var9 = 6;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 78;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 78;
               var10006 = var14;
            } else {
               var27 = 78;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 78;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 34;
                     break;
                  case 1:
                     var47 = 81;
                     break;
                  case 2:
                     var47 = 126;
                     break;
                  case 3:
                     var47 = 99;
                     break;
                  case 4:
                     var47 = 7;
                     break;
                  case 5:
                     var47 = 3;
                     break;
                  default:
                     var47 = 28;
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
            long var0 = 9143791895416655663L;
            long[] var6 = new long[5];
            int var3 = 0;
            String var4 = "ÝyßÍ|¶â¦À\"VÉ\u0016Ô]©J(ý@\u0098k\u008b?";
            int var5 = "ÝyßÍ|¶â¦À\"VÉ\u0016Ô]©J(ý@\u0098k\u008b?".length();
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

                        var4 = "<UËÎ¡»Ä32í\u0090\u00880Rl±";
                        var5 = "<UËÎ¡»Ä32í\u0090\u00880Rl±".length();
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

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13118) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 168;
               break;
            case 1:
               var10000 = 165;
               break;
            case 2:
               var10000 = 251;
               break;
            case 3:
               var10000 = 210;
               break;
            case 4:
               var10000 = 32;
               break;
            case 5:
               var10000 = 5;
               break;
            case 6:
               var10000 = 8;
               break;
            case 7:
               var10000 = 55;
               break;
            case 8:
               var10000 = 38;
               break;
            case 9:
               var10000 = 29;
               break;
            case 10:
               var10000 = 69;
               break;
            case 11:
               var10000 = 47;
               break;
            case 12:
               var10000 = 100;
               break;
            case 13:
               var10000 = 125;
               break;
            case 14:
               var10000 = 230;
               break;
            case 15:
               var10000 = 23;
               break;
            case 16:
               var10000 = 92;
               break;
            case 17:
               var10000 = 97;
               break;
            case 18:
               var10000 = 246;
               break;
            case 19:
               var10000 = 221;
               break;
            case 20:
               var10000 = 158;
               break;
            case 21:
               var10000 = 241;
               break;
            case 22:
               var10000 = 239;
               break;
            case 23:
               var10000 = 253;
               break;
            case 24:
               var10000 = 173;
               break;
            case 25:
               var10000 = 102;
               break;
            case 26:
               var10000 = 62;
               break;
            case 27:
               var10000 = 120;
               break;
            case 28:
               var10000 = 166;
               break;
            case 29:
               var10000 = 244;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 50;
               break;
            case 32:
               var10000 = 196;
               break;
            case 33:
               var10000 = 25;
               break;
            case 34:
               var10000 = 19;
               break;
            case 35:
               var10000 = 33;
               break;
            case 36:
               var10000 = 235;
               break;
            case 37:
               var10000 = 44;
               break;
            case 38:
               var10000 = 42;
               break;
            case 39:
               var10000 = 199;
               break;
            case 40:
               var10000 = 80;
               break;
            case 41:
               var10000 = 6;
               break;
            case 42:
               var10000 = 242;
               break;
            case 43:
               var10000 = 82;
               break;
            case 44:
               var10000 = 9;
               break;
            case 45:
               var10000 = 197;
               break;
            case 46:
               var10000 = 211;
               break;
            case 47:
               var10000 = 74;
               break;
            case 48:
               var10000 = 41;
               break;
            case 49:
               var10000 = 101;
               break;
            case 50:
               var10000 = 179;
               break;
            case 51:
               var10000 = 91;
               break;
            case 52:
               var10000 = 245;
               break;
            case 53:
               var10000 = 96;
               break;
            case 54:
               var10000 = 249;
               break;
            case 55:
               var10000 = 226;
               break;
            case 56:
               var10000 = 20;
               break;
            case 57:
               var10000 = 106;
               break;
            case 58:
               var10000 = 126;
               break;
            case 59:
               var10000 = 163;
               break;
            case 60:
               var10000 = 127;
               break;
            case 61:
               var10000 = 147;
               break;
            case 62:
               var10000 = 124;
               break;
            case 63:
               var10000 = 172;
               break;
            case 64:
               var10000 = 194;
               break;
            case 65:
               var10000 = 22;
               break;
            case 66:
               var10000 = 236;
               break;
            case 67:
               var10000 = 66;
               break;
            case 68:
               var10000 = 205;
               break;
            case 69:
               var10000 = 252;
               break;
            case 70:
               var10000 = 12;
               break;
            case 71:
               var10000 = 191;
               break;
            case 72:
               var10000 = 228;
               break;
            case 73:
               var10000 = 215;
               break;
            case 74:
               var10000 = 150;
               break;
            case 75:
               var10000 = 229;
               break;
            case 76:
               var10000 = 248;
               break;
            case 77:
               var10000 = 75;
               break;
            case 78:
               var10000 = 76;
               break;
            case 79:
               var10000 = 201;
               break;
            case 80:
               var10000 = 30;
               break;
            case 81:
               var10000 = 37;
               break;
            case 82:
               var10000 = 18;
               break;
            case 83:
               var10000 = 59;
               break;
            case 84:
               var10000 = 2;
               break;
            case 85:
               var10000 = 84;
               break;
            case 86:
               var10000 = 176;
               break;
            case 87:
               var10000 = 53;
               break;
            case 88:
               var10000 = 86;
               break;
            case 89:
               var10000 = 10;
               break;
            case 90:
               var10000 = 161;
               break;
            case 91:
               var10000 = 223;
               break;
            case 92:
               var10000 = 70;
               break;
            case 93:
               var10000 = 183;
               break;
            case 94:
               var10000 = 164;
               break;
            case 95:
               var10000 = 15;
               break;
            case 96:
               var10000 = 105;
               break;
            case 97:
               var10000 = 203;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 156;
               break;
            case 100:
               var10000 = 142;
               break;
            case 101:
               var10000 = 79;
               break;
            case 102:
               var10000 = 4;
               break;
            case 103:
               var10000 = 178;
               break;
            case 104:
               var10000 = 233;
               break;
            case 105:
               var10000 = 57;
               break;
            case 106:
               var10000 = 155;
               break;
            case 107:
               var10000 = 145;
               break;
            case 108:
               var10000 = 116;
               break;
            case 109:
               var10000 = 93;
               break;
            case 110:
               var10000 = 119;
               break;
            case 111:
               var10000 = 177;
               break;
            case 112:
               var10000 = 21;
               break;
            case 113:
               var10000 = 225;
               break;
            case 114:
               var10000 = 85;
               break;
            case 115:
               var10000 = 107;
               break;
            case 116:
               var10000 = 46;
               break;
            case 117:
               var10000 = 132;
               break;
            case 118:
               var10000 = 207;
               break;
            case 119:
               var10000 = 154;
               break;
            case 120:
               var10000 = 111;
               break;
            case 121:
               var10000 = 98;
               break;
            case 122:
               var10000 = 159;
               break;
            case 123:
               var10000 = 43;
               break;
            case 124:
               var10000 = 218;
               break;
            case 125:
               var10000 = 34;
               break;
            case 126:
               var10000 = 61;
               break;
            case 127:
               var10000 = 128;
               break;
            case 128:
               var10000 = 206;
               break;
            case 129:
               var10000 = 89;
               break;
            case 130:
               var10000 = 81;
               break;
            case 131:
               var10000 = 140;
               break;
            case 132:
               var10000 = 238;
               break;
            case 133:
               var10000 = 58;
               break;
            case 134:
               var10000 = 209;
               break;
            case 135:
               var10000 = 112;
               break;
            case 136:
               var10000 = 182;
               break;
            case 137:
               var10000 = 31;
               break;
            case 138:
               var10000 = 231;
               break;
            case 139:
               var10000 = 202;
               break;
            case 140:
               var10000 = 195;
               break;
            case 141:
               var10000 = 186;
               break;
            case 142:
               var10000 = 152;
               break;
            case 143:
               var10000 = 115;
               break;
            case 144:
               var10000 = 193;
               break;
            case 145:
               var10000 = 204;
               break;
            case 146:
               var10000 = 1;
               break;
            case 147:
               var10000 = 121;
               break;
            case 148:
               var10000 = 181;
               break;
            case 149:
               var10000 = 63;
               break;
            case 150:
               var10000 = 250;
               break;
            case 151:
               var10000 = 7;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 198;
               break;
            case 154:
               var10000 = 94;
               break;
            case 155:
               var10000 = 143;
               break;
            case 156:
               var10000 = 77;
               break;
            case 157:
               var10000 = 72;
               break;
            case 158:
               var10000 = 17;
               break;
            case 159:
               var10000 = 162;
               break;
            case 160:
               var10000 = 60;
               break;
            case 161:
               var10000 = 108;
               break;
            case 162:
               var10000 = 73;
               break;
            case 163:
               var10000 = 110;
               break;
            case 164:
               var10000 = 167;
               break;
            case 165:
               var10000 = 122;
               break;
            case 166:
               var10000 = 213;
               break;
            case 167:
               var10000 = 146;
               break;
            case 168:
               var10000 = 216;
               break;
            case 169:
               var10000 = 27;
               break;
            case 170:
               var10000 = 149;
               break;
            case 171:
               var10000 = 36;
               break;
            case 172:
               var10000 = 99;
               break;
            case 173:
               var10000 = 200;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 137;
               break;
            case 176:
               var10000 = 49;
               break;
            case 177:
               var10000 = 51;
               break;
            case 178:
               var10000 = 109;
               break;
            case 179:
               var10000 = 67;
               break;
            case 180:
               var10000 = 170;
               break;
            case 181:
               var10000 = 65;
               break;
            case 182:
               var10000 = 113;
               break;
            case 183:
               var10000 = 114;
               break;
            case 184:
               var10000 = 212;
               break;
            case 185:
               var10000 = 171;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 0;
               break;
            case 188:
               var10000 = 87;
               break;
            case 189:
               var10000 = 133;
               break;
            case 190:
               var10000 = 68;
               break;
            case 191:
               var10000 = 151;
               break;
            case 192:
               var10000 = 28;
               break;
            case 193:
               var10000 = 148;
               break;
            case 194:
               var10000 = 95;
               break;
            case 195:
               var10000 = 39;
               break;
            case 196:
               var10000 = 255;
               break;
            case 197:
               var10000 = 104;
               break;
            case 198:
               var10000 = 83;
               break;
            case 199:
               var10000 = 184;
               break;
            case 200:
               var10000 = 175;
               break;
            case 201:
               var10000 = 224;
               break;
            case 202:
               var10000 = 88;
               break;
            case 203:
               var10000 = 174;
               break;
            case 204:
               var10000 = 136;
               break;
            case 205:
               var10000 = 64;
               break;
            case 206:
               var10000 = 153;
               break;
            case 207:
               var10000 = 71;
               break;
            case 208:
               var10000 = 123;
               break;
            case 209:
               var10000 = 187;
               break;
            case 210:
               var10000 = 247;
               break;
            case 211:
               var10000 = 141;
               break;
            case 212:
               var10000 = 35;
               break;
            case 213:
               var10000 = 24;
               break;
            case 214:
               var10000 = 243;
               break;
            case 215:
               var10000 = 169;
               break;
            case 216:
               var10000 = 222;
               break;
            case 217:
               var10000 = 134;
               break;
            case 218:
               var10000 = 48;
               break;
            case 219:
               var10000 = 232;
               break;
            case 220:
               var10000 = 254;
               break;
            case 221:
               var10000 = 40;
               break;
            case 222:
               var10000 = 240;
               break;
            case 223:
               var10000 = 103;
               break;
            case 224:
               var10000 = 135;
               break;
            case 225:
               var10000 = 26;
               break;
            case 226:
               var10000 = 139;
               break;
            case 227:
               var10000 = 185;
               break;
            case 228:
               var10000 = 234;
               break;
            case 229:
               var10000 = 190;
               break;
            case 230:
               var10000 = 13;
               break;
            case 231:
               var10000 = 144;
               break;
            case 232:
               var10000 = 138;
               break;
            case 233:
               var10000 = 52;
               break;
            case 234:
               var10000 = 214;
               break;
            case 235:
               var10000 = 90;
               break;
            case 236:
               var10000 = 129;
               break;
            case 237:
               var10000 = 11;
               break;
            case 238:
               var10000 = 188;
               break;
            case 239:
               var10000 = 219;
               break;
            case 240:
               var10000 = 117;
               break;
            case 241:
               var10000 = 56;
               break;
            case 242:
               var10000 = 118;
               break;
            case 243:
               var10000 = 217;
               break;
            case 244:
               var10000 = 180;
               break;
            case 245:
               var10000 = 3;
               break;
            case 246:
               var10000 = 131;
               break;
            case 247:
               var10000 = 45;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 14;
               break;
            case 250:
               var10000 = 208;
               break;
            case 251:
               var10000 = 16;
               break;
            case 252:
               var10000 = 130;
               break;
            case 253:
               var10000 = 78;
               break;
            case 254:
               var10000 = 157;
               break;
            default:
               var10000 = 160;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26766;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





