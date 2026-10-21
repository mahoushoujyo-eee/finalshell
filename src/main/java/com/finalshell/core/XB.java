package com.finalshell.core;

public class XB {
   public static XB x;
   public static XB e;
   public static XB z;
   public static XB l;
   public static XB d;
   public static XB U;
   public static XB I;
   public static XB h;
   public static XB S;
   protected final int q;
   public final char[] R;
   public final int s;
   public final int b;
   public static int[] j;
   public static String[] a;
   public static String[] c;
   public static long[] f;
   public static Integer[] g;

   public XB(int var1, char[] var2, int var3, int var4) {
      this.q = var1;
      this.R = var2;
      this.s = var3;
      this.b = var4;
   }

   public static XB G(String var0) {
      return V(var0.toCharArray(), 0);
   }

   public static int V(String var0) {
      int[] var10000 = X();
      int var2 = 1;
      int var3 = 1;
      int[] var1 = var10000;

      while (true) {
         char var4;
         int var6;
         while (true) {
            var4 = var0.charAt(var3++);
            if (var4 == a(19677, 9212253326056996958L)) {
               var4 = var0.charAt(var3);
               var5 = var2 << 2;
               var6 = var4;
               if (var1 == null) {
                  int var10002 = a(16136, 5089441160449143697L);
                  if (var1 == null) {
                     if (var4 == var10002) {
                        return var5 | 0;
                     }

                     var6 = var4;
                     if (var1 != null) {
                        return var5 | var4;
                     }

                     var10002 = a(13386, 2655541516436945108L);
                  }

                  if (var6 != var10002) {
                     if (var1 != null) {
                        return var5 | var4;
                     }

                     if (var4 != a(3328, 7654443794262065562L)) {
      char var5;
      char var5;
                        return var5 | 1;
                     }
                  }

                  return var5 | 2;
               }
            } else {
               var5 = var4;
               var6 = a(24340, 3199410945360122752L);
            }

            if (var1 != null) {
               break;
            }

            if (var5 == var6) {
               while (var0.charAt(var3++) != a(6569, 3524073762061227318L)) {
               }

               var2++;
               if (var1 == null) {
                  continue;
               }
            }

            var5 = var4;
            var6 = a(19367, 2761181721334499127L);
            break;
         }

         label69: {
            label68: {
               if (var1 == null) {
                  if (var5 == var6) {
                     break label68;
                  }

                  var5 = var4;
                  var6 = a(18704, 6211238611294799235L);
               }

               if (var5 != var6) {
                  break label69;
               }
            }

            var2 += 2;
            if (var1 == null) {
               continue;
            }
         }

         var2++;
      }
   }

   public static XB V(char[] var0, int var1) {
      int[] var2 = X();
      char var10000 = var0[var1];
      if (var2 == null) {
         switch (var10000) {
            case 'B':
               return l;
            case 'C':
               return z;
            case 'D':
               return S;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
               var10000 = 1;
               break;
            case 'F':
               return I;
            case 'I':
               return U;
            case 'J':
               return h;
            case 'S':
               return d;
            case 'V':
               return x;
            case 'Z':
               return e;
            case '[':
               int var3 = 1;

               while (true) {
                  if (var0[var1 + var3] == a(10527, 8524241054097515927L)) {
                     var3++;
                     if (var2 != null) {
                        break;
                     }

                     if (var2 == null) {
                        continue;
                     }
                  }

                  if (var0[var1 + var3] == a(1160, 2419731413243463684L)) {
                     var3++;

                     while (var0[var1 + var3] != a(9548, 4376527785595120066L)) {
                        var3++;
                        if (var2 != null) {
                           return new XB(a(32280, 6769965947101737605L), var0, var1, var3 + 1);
                        }
                     }
                  }
                  break;
               }

               return new XB(a(32280, 6769965947101737605L), var0, var1, var3 + 1);
         }
      }

      int var4 = var10000;

      while (var0[var1 + var4] != a(6569, 3524073762061227318L)) {
         var4++;
         if (var2 != null) {
            break;
         }
      }

      return new XB(a(19373, 4865834831405401892L), var0, var1 + 1, var4 - 1);
   }

   public String o() {
      return new String(this.R, this.s, this.b);
   }

   String i() {
      return new String(this.R, this.s, this.b);
   }

   public int N() {
      int[] var10000 = X();
      int var2 = 1;
      int[] var1 = var10000;

      while (this.R[this.s + var2] == a(16235, 1543027663308207085L)) {
         var2++;
         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   static XB[] l(String var0) {
      int[] var10000 = X();
      char[] var2 = var0.toCharArray();
      int[] var1 = var10000;
      int var3 = 1;
      int var4 = 0;

      do {
         int var11;
         label59: {
            char var5;
            label66: {
               var5 = var2[var3++];
               if (var5 == a(26212, 4753149480752704252L)) {
                  if (var1 != null) {
                     break label66;
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               var9 = var5;
               var11 = a(24340, 3199410945360122752L);
               if (var1 != null) {
                  break label59;
               }

               if (var5 == var11) {
                  while (var2[var3++] != a(6569, 3524073762061227318L)) {
                  }

                  var4++;
                  if (var1 == null) {
                     continue;
                  }
               }
            }

            var9 = var5;
            var11 = a(10527, 8524241054097515927L);
         }

         if (var9 != var11) {
            var4++;
         }
      } while (var1 == null);

      XB[] var8 = new XB[var4];
      var3 = 1;
      var4 = 0;

      while (true) {
         if (var2[var3] != a(19677, 9212253326056996958L)) {
            var10 = var8;
            if (var1 != null) {
               break;
            }

            var8[var4] = V(var2, var3);
            int var10002 = var8[var4].q;
            if (var1 == null) {
               var10002 = var8[var4].q == a(8336, 2134290973955238933L) ? 2 : 0;
            }

            var3 += var8[var4].b + var10002;
            var4++;
            if (var1 == null) {
               continue;
            }
         }

         var10 = var8;
         break;
      }

      return var10;
   }

   protected String G() {
      int[] var1 = X();
      switch (this.q) {
         case 0:
            return a(-5338, 4214);
         case 1:
            return a(-5334, 11900);
         case 2:
            return a(-5340, -22418);
         case 3:
            return a(-5339, -6645);
         case 4:
            return a(-5341, 14794);
         case 5:
            return a(-5333, 9808);
         case 6:
            return a(-5344, 11938);
         case 7:
            return a(-5343, -21539);
         case 8:
            return a(-5342, 31438);
         case 9:
            XB var2 = V(this.R, this.s + this.N());
            StringBuilder var3 = new StringBuilder(var2.G());
            int var4 = this.N();

            StringBuilder var10000;
            while (true) {
               if (var4 > 0) {
                  var10000 = var3.append(a(-5337, -13937));
                  if (var1 != null) {
                     break;
                  }

                  var4--;
                  if (var1 == null) {
                     continue;
                  }
               }

               var10000 = var3;
               break;
            }

            return var10000.toString();
         default:
            return new String(this.R, this.s, this.b).replace((char)a(23277, 6906823373596874346L), (char)a(26771, 3288223279149671426L));
      }
   }

   static {
      __vfClinit__();
   }

   public static void N(int[] var0) {
      j = var0;
   }

   public static int[] X() {
      return j;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -5341) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 100;
               break;
            case 1:
               var10000 = 184;
               break;
            case 2:
               var10000 = 41;
               break;
            case 3:
               var10000 = 254;
               break;
            case 4:
               var10000 = 213;
               break;
            case 5:
               var10000 = 19;
               break;
            case 6:
               var10000 = 104;
               break;
            case 7:
               var10000 = 4;
               break;
            case 8:
               var10000 = 66;
               break;
            case 9:
               var10000 = 97;
               break;
            case 10:
               var10000 = 139;
               break;
            case 11:
               var10000 = 192;
               break;
            case 12:
               var10000 = 42;
               break;
            case 13:
               var10000 = 73;
               break;
            case 14:
               var10000 = 215;
               break;
            case 15:
               var10000 = 106;
               break;
            case 16:
               var10000 = 236;
               break;
            case 17:
               var10000 = 32;
               break;
            case 18:
               var10000 = 187;
               break;
            case 19:
               var10000 = 12;
               break;
            case 20:
               var10000 = 21;
               break;
            case 21:
               var10000 = 1;
               break;
            case 22:
               var10000 = 16;
               break;
            case 23:
               var10000 = 198;
               break;
            case 24:
               var10000 = 193;
               break;
            case 25:
               var10000 = 99;
               break;
            case 26:
               var10000 = 75;
               break;
            case 27:
               var10000 = 231;
               break;
            case 28:
               var10000 = 140;
               break;
            case 29:
               var10000 = 112;
               break;
            case 30:
               var10000 = 18;
               break;
            case 31:
               var10000 = 122;
               break;
            case 32:
               var10000 = 58;
               break;
            case 33:
               var10000 = 174;
               break;
            case 34:
               var10000 = 45;
               break;
            case 35:
               var10000 = 81;
               break;
            case 36:
               var10000 = 118;
               break;
            case 37:
               var10000 = 243;
               break;
            case 38:
               var10000 = 190;
               break;
            case 39:
               var10000 = 136;
               break;
            case 40:
               var10000 = 28;
               break;
            case 41:
               var10000 = 74;
               break;
            case 42:
               var10000 = 84;
               break;
            case 43:
               var10000 = 170;
               break;
            case 44:
               var10000 = 17;
               break;
            case 45:
               var10000 = 46;
               break;
            case 46:
               var10000 = 93;
               break;
            case 47:
               var10000 = 54;
               break;
            case 48:
               var10000 = 232;
               break;
            case 49:
               var10000 = 39;
               break;
            case 50:
               var10000 = 61;
               break;
            case 51:
               var10000 = 185;
               break;
            case 52:
               var10000 = 48;
               break;
            case 53:
               var10000 = 169;
               break;
            case 54:
               var10000 = 153;
               break;
            case 55:
               var10000 = 246;
               break;
            case 56:
               var10000 = 120;
               break;
            case 57:
               var10000 = 151;
               break;
            case 58:
               var10000 = 56;
               break;
            case 59:
               var10000 = 77;
               break;
            case 60:
               var10000 = 72;
               break;
            case 61:
               var10000 = 211;
               break;
            case 62:
               var10000 = 251;
               break;
            case 63:
               var10000 = 175;
               break;
            case 64:
               var10000 = 115;
               break;
            case 65:
               var10000 = 163;
               break;
            case 66:
               var10000 = 204;
               break;
            case 67:
               var10000 = 62;
               break;
            case 68:
               var10000 = 195;
               break;
            case 69:
               var10000 = 159;
               break;
            case 70:
               var10000 = 180;
               break;
            case 71:
               var10000 = 181;
               break;
            case 72:
               var10000 = 137;
               break;
            case 73:
               var10000 = 255;
               break;
            case 74:
               var10000 = 223;
               break;
            case 75:
               var10000 = 131;
               break;
            case 76:
               var10000 = 221;
               break;
            case 77:
               var10000 = 216;
               break;
            case 78:
               var10000 = 253;
               break;
            case 79:
               var10000 = 33;
               break;
            case 80:
               var10000 = 98;
               break;
            case 81:
               var10000 = 200;
               break;
            case 82:
               var10000 = 27;
               break;
            case 83:
               var10000 = 188;
               break;
            case 84:
               var10000 = 80;
               break;
            case 85:
               var10000 = 179;
               break;
            case 86:
               var10000 = 167;
               break;
            case 87:
               var10000 = 78;
               break;
            case 88:
               var10000 = 130;
               break;
            case 89:
               var10000 = 191;
               break;
            case 90:
               var10000 = 218;
               break;
            case 91:
               var10000 = 128;
               break;
            case 92:
               var10000 = 161;
               break;
            case 93:
               var10000 = 222;
               break;
            case 94:
               var10000 = 101;
               break;
            case 95:
               var10000 = 189;
               break;
            case 96:
               var10000 = 9;
               break;
            case 97:
               var10000 = 7;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 148;
               break;
            case 100:
               var10000 = 30;
               break;
            case 101:
               var10000 = 105;
               break;
            case 102:
               var10000 = 158;
               break;
            case 103:
               var10000 = 244;
               break;
            case 104:
               var10000 = 252;
               break;
            case 105:
               var10000 = 92;
               break;
            case 106:
               var10000 = 208;
               break;
            case 107:
               var10000 = 229;
               break;
            case 108:
               var10000 = 86;
               break;
            case 109:
               var10000 = 59;
               break;
            case 110:
               var10000 = 205;
               break;
            case 111:
               var10000 = 23;
               break;
            case 112:
               var10000 = 25;
               break;
            case 113:
               var10000 = 177;
               break;
            case 114:
               var10000 = 53;
               break;
            case 115:
               var10000 = 89;
               break;
            case 116:
               var10000 = 219;
               break;
            case 117:
               var10000 = 238;
               break;
            case 118:
               var10000 = 82;
               break;
            case 119:
               var10000 = 55;
               break;
            case 120:
               var10000 = 166;
               break;
            case 121:
               var10000 = 135;
               break;
            case 122:
               var10000 = 11;
               break;
            case 123:
               var10000 = 138;
               break;
            case 124:
               var10000 = 113;
               break;
            case 125:
               var10000 = 107;
               break;
            case 126:
               var10000 = 201;
               break;
            case 127:
               var10000 = 145;
               break;
            case 128:
               var10000 = 154;
               break;
            case 129:
               var10000 = 224;
               break;
            case 130:
               var10000 = 228;
               break;
            case 131:
               var10000 = 70;
               break;
            case 132:
               var10000 = 49;
               break;
            case 133:
               var10000 = 168;
               break;
            case 134:
               var10000 = 206;
               break;
            case 135:
               var10000 = 69;
               break;
            case 136:
               var10000 = 173;
               break;
            case 137:
               var10000 = 230;
               break;
            case 138:
               var10000 = 71;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 183;
               break;
            case 141:
               var10000 = 109;
               break;
            case 142:
               var10000 = 178;
               break;
            case 143:
               var10000 = 227;
               break;
            case 144:
               var10000 = 165;
               break;
            case 145:
               var10000 = 88;
               break;
            case 146:
               var10000 = 226;
               break;
            case 147:
               var10000 = 199;
               break;
            case 148:
               var10000 = 51;
               break;
            case 149:
               var10000 = 127;
               break;
            case 150:
               var10000 = 22;
               break;
            case 151:
               var10000 = 26;
               break;
            case 152:
               var10000 = 94;
               break;
            case 153:
               var10000 = 96;
               break;
            case 154:
               var10000 = 111;
               break;
            case 155:
               var10000 = 44;
               break;
            case 156:
               var10000 = 147;
               break;
            case 157:
               var10000 = 50;
               break;
            case 158:
               var10000 = 197;
               break;
            case 159:
               var10000 = 36;
               break;
            case 160:
               var10000 = 157;
               break;
            case 161:
               var10000 = 5;
               break;
            case 162:
               var10000 = 126;
               break;
            case 163:
               var10000 = 214;
               break;
            case 164:
               var10000 = 245;
               break;
            case 165:
               var10000 = 57;
               break;
            case 166:
               var10000 = 91;
               break;
            case 167:
               var10000 = 8;
               break;
            case 168:
               var10000 = 241;
               break;
            case 169:
               var10000 = 150;
               break;
            case 170:
               var10000 = 40;
               break;
            case 171:
               var10000 = 108;
               break;
            case 172:
               var10000 = 172;
               break;
            case 173:
               var10000 = 203;
               break;
            case 174:
               var10000 = 242;
               break;
            case 175:
               var10000 = 249;
               break;
            case 176:
               var10000 = 119;
               break;
            case 177:
               var10000 = 31;
               break;
            case 178:
               var10000 = 182;
               break;
            case 179:
               var10000 = 162;
               break;
            case 180:
               var10000 = 196;
               break;
            case 181:
               var10000 = 116;
               break;
            case 182:
               var10000 = 37;
               break;
            case 183:
               var10000 = 233;
               break;
            case 184:
               var10000 = 247;
               break;
            case 185:
               var10000 = 34;
               break;
            case 186:
               var10000 = 29;
               break;
            case 187:
               var10000 = 212;
               break;
            case 188:
               var10000 = 114;
               break;
            case 189:
               var10000 = 133;
               break;
            case 190:
               var10000 = 38;
               break;
            case 191:
               var10000 = 125;
               break;
            case 192:
               var10000 = 14;
               break;
            case 193:
               var10000 = 248;
               break;
            case 194:
               var10000 = 220;
               break;
            case 195:
               var10000 = 129;
               break;
            case 196:
               var10000 = 13;
               break;
            case 197:
               var10000 = 144;
               break;
            case 198:
               var10000 = 141;
               break;
            case 199:
               var10000 = 47;
               break;
            case 200:
               var10000 = 6;
               break;
            case 201:
               var10000 = 142;
               break;
            case 202:
               var10000 = 103;
               break;
            case 203:
               var10000 = 85;
               break;
            case 204:
               var10000 = 171;
               break;
            case 205:
               var10000 = 0;
               break;
            case 206:
               var10000 = 234;
               break;
            case 207:
               var10000 = 121;
               break;
            case 208:
               var10000 = 60;
               break;
            case 209:
               var10000 = 24;
               break;
            case 210:
               var10000 = 235;
               break;
            case 211:
               var10000 = 79;
               break;
            case 212:
               var10000 = 217;
               break;
            case 213:
               var10000 = 164;
               break;
            case 214:
               var10000 = 110;
               break;
            case 215:
               var10000 = 63;
               break;
            case 216:
               var10000 = 143;
               break;
            case 217:
               var10000 = 124;
               break;
            case 218:
               var10000 = 102;
               break;
            case 219:
               var10000 = 87;
               break;
            case 220:
               var10000 = 15;
               break;
            case 221:
               var10000 = 132;
               break;
            case 222:
               var10000 = 209;
               break;
            case 223:
               var10000 = 10;
               break;
            case 224:
               var10000 = 83;
               break;
            case 225:
               var10000 = 152;
               break;
            case 226:
               var10000 = 43;
               break;
            case 227:
               var10000 = 176;
               break;
            case 228:
               var10000 = 240;
               break;
            case 229:
               var10000 = 250;
               break;
            case 230:
               var10000 = 35;
               break;
            case 231:
               var10000 = 155;
               break;
            case 232:
               var10000 = 117;
               break;
            case 233:
               var10000 = 95;
               break;
            case 234:
               var10000 = 64;
               break;
            case 235:
               var10000 = 68;
               break;
            case 236:
               var10000 = 156;
               break;
            case 237:
               var10000 = 65;
               break;
            case 238:
               var10000 = 146;
               break;
            case 239:
               var10000 = 90;
               break;
            case 240:
               var10000 = 202;
               break;
            case 241:
               var10000 = 225;
               break;
            case 242:
               var10000 = 134;
               break;
            case 243:
               var10000 = 123;
               break;
            case 244:
               var10000 = 67;
               break;
            case 245:
               var10000 = 52;
               break;
            case 246:
               var10000 = 186;
               break;
            case 247:
               var10000 = 76;
               break;
            case 248:
               var10000 = 239;
               break;
            case 249:
               var10000 = 237;
               break;
            case 250:
               var10000 = 2;
               break;
            case 251:
               var10000 = 207;
               break;
            case 252:
               var10000 = 210;
               break;
            case 253:
               var10000 = 149;
               break;
            case 254:
               var10000 = 20;
               break;
            default:
               var10000 = 3;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3231;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "\u0082Üà©?\u0006ùº`\u0092nÕ\u0004\u0099|~O\u0005JÈN¼ê\u0002å\u001d\u0004\u000b\u0088rÒ\u0004:2ßP\u0004TQ&\u0018";
      int var12 = "\u0082Üà©?\u0006ùº`\u0092nÕ\u0004\u0099|~O\u0005JÈN¼ê\u0002å\u001d\u0004\u000b\u0088rÒ\u0004:2ßP\u0004TQ&\u0018".length();
      N(null);
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 98;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 20;
                        break;
                     case 1:
                        var65 = 32;
                        break;
                     case 2:
                        var65 = 110;
                        break;
                     case 3:
                        var65 = 15;
                        break;
                     case 4:
                        var65 = 54;
                        break;
                     case 5:
                        var65 = 3;
                        break;
                     default:
                        var65 = 86;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     c = new String[10];
                     long var0 = 3610043439657893188L;
                     long[] var6 = new long[30];
                     int var3 = 0;
                     String var4 = "Sä¯äáf¨IÆWt{)\u000f\u0005Ô3\u0000uúVôÏÈÌ\u0097f¦\u0014ÀÇ\u00003°Q\u008eÝH+Æ;ò \u008dÂ¦¼\u0094EÄõ\t\u0095[\u000e\u0083Õ¸Ä\u0018P\u0011W\u0091\u0090\fËxêáÉÝà%?ø)_Ø:aÏpû`\u001bF \u007f\rû\u009a\u0014&n\u0088{A'\u0099mãx\u008d(Ã\u0092òü 0Zà¥Ä¥#kYh¸7º;Àøz7<ãÎ\u0093O{ö\u0084,\u0083i\u009cæ\u008f\u0094½»û¯\u0086\f²Ña\u008c\u0083O¬Æ²µ\fãR#\u0084zNE(¡À©9TøîÂ5¬Õ¦\u0019-új\u0012#ó\u008eåÁ\u0018\u0088íTl¹\u0001\u0012ë\u0001d4Êªª\u009f\u008eòàÂE\u0082\u0099e\u0011[üjÂ\u0086\u0088G\u001cM";
                     int var5 = "Sä¯äáf¨IÆWt{)\u000f\u0005Ô3\u0000uúVôÏÈÌ\u0097f¦\u0014ÀÇ\u00003°Q\u008eÝH+Æ;ò \u008dÂ¦¼\u0094EÄõ\t\u0095[\u000e\u0083Õ¸Ä\u0018P\u0011W\u0091\u0090\fËxêáÉÝà%?ø)_Ø:aÏpû`\u001bF \u007f\rû\u009a\u0014&n\u0088{A'\u0099mãx\u008d(Ã\u0092òü 0Zà¥Ä¥#kYh¸7º;Àøz7<ãÎ\u0093O{ö\u0084,\u0083i\u009cæ\u008f\u0094½»û¯\u0086\f²Ña\u008c\u0083O¬Æ²µ\fãR#\u0084zNE(¡À©9TøîÂ5¬Õ¦\u0019-új\u0012#ó\u008eåÁ\u0018\u0088íTl¹\u0001\u0012ë\u0001d4Êªª\u009f\u008eòàÂE\u0082\u0099e\u0011[üjÂ\u0086\u0088G\u001cM"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    f = var6;
                                    g = new Integer[30];
                                    x = new XB(0, null, a(6681, 5397795107347142274L), 1);
                                    e = new XB(1, null, a(26025, 6275195678922336548L), 1);
                                    z = new XB(2, null, a(28889, 5250476856469716037L), 1);
                                    l = new XB(3, null, a(29296, 4966517492757495525L), 1);
                                    d = new XB(4, null, a(22541, 7322695028083610759L), 1);
                                    U = new XB(5, null, a(30735, 4254254051424236696L), 1);
                                    I = new XB(a(18249, 1287394451977817030L), null, a(19793, 9048505484603310547L), 1);
                                    h = new XB(a(395, 5961826723189853465L), null, a(11407, 2388564008179310603L), 1);
                                    S = new XB(a(27104, 5784144790343279990L), null, a(30693, 8119979968718764910L), 1);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Þ0oÝÄ\u0000}3©\u0007Ë$ÿ\u007fþ\u0096";
                                 var5 = "Þ0oÝÄ\u0000}3©\u0007Ë$ÿ\u007fþ\u0096".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "¯òæ\u0007Ø\u0013yHü¤g";
                  var12 = "¯òæ\u0007Ø\u0013yHü¤g".length();
                  var9 = 3;
                  var17 = -1;
            }

            var10000 = 14;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






