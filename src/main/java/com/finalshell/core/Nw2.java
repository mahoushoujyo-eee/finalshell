package com.finalshell.core;

import com.finalshell.ui.frame.XD3;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.UIResource;

public class Nw2 extends NP {
   public static Nw2 V;
   public static String[] c;
   public static String[] d;
   public static long[] g;
   public static Integer[] h;

   public static Nw2 l() {
      String[] var0 = XD3.U();
      Nw2 var10000 = V;
      if (var0 == null) {
         if (V == null) {
            V = new Nw2();
         }

         var10000 = V;
      }

      return var10000;
   }

   @Override
   public int getPreferredGap(JComponent var1, JComponent var2, ComponentPlacement var3, int var4, Container var5) {
      String[] var6;
      int var12;
      label106: {
         int var7;
         String[] var10000 = XD3.U();
         super.getPreferredGap(var1, var2, var3, var4, var5);
         var7 = 0;
         var6 = var10000;
         var12 = YJ3.W[var3.ordinal()];
         label67:
         if (var6 == null) {
            label93: {
               label92: {
                  label107: {
                     switch (var12) {
                        case 1:
                           var12 = var4;
                           if (var6 != null) {
                              break label106;
                           }

                           if (var4 == 3) {
                              break label93;
                           }

                           var12 = var4;
                           if (var6 != null) {
                              break;
                           }

                           if (var4 == b(28870, 8878360631157840405L)) {
                              break label93;
                           }
                        case 2:
                           var12 = (var1.getUIClassID().equals(b(5018, -29652))) ? 1 : 0;
                           break;
                        case 3:
                           break label107;
                        default:
                           break label92;
                     }

                     label80:
                     if (var6 == null) {
                        if (var12 != 0) {
                           var12 = (var2.getUIClassID().equals(b(5018, -29652))) ? 1 : 0;
                           if (var6 != null) {
                              break label80;
                           }

                           if (var12 != 0) {
                              ButtonModel var8 = ((JToggleButton)var1).getModel();
                              ButtonModel var9 = ((JToggleButton)var2).getModel();
                              byte var14 = (byte)((var8 instanceof DefaultButtonModel) ? 1 : 0);
                              if (var6 == null) {
                                 if (var14 != 0) {
                                    var14 = (byte)((var9 instanceof DefaultButtonModel) ? 1 : 0);
                                    if (var6 != null) {
                                       return var14;
                                    }

                                    label57:
                                    if (var14 != 0) {
                                       ButtonGroup var15 = ((DefaultButtonModel)var8).getGroup();
                                       if (var6 == null) {
                                          if (var15 != ((DefaultButtonModel)var9).getGroup()) {
                                             break label57;
                                          }

                                          var15 = ((DefaultButtonModel)var8).getGroup();
                                       }

                                       if (var15 != null) {
                                          return 2;
                                       }
                                    }
                                 }

                                 var14 = 5;
                              }

                              return var14;
                           }
                        }

                        var12 = b(20359, 1556437013922702677L);
                     }

                     var7 = var12;
                     if (var6 == null) {
                        break label92;
                     }
                  }

                  var7 = b(18288, 7863585141233773991L);
               }

               var12 = (this.E(var1, var2, var4)) ? 1 : 0;
               break label67;
            }

            var12 = this.i(var1, var4);
            break label106;
         }

         if (var6 == null) {
            if (var12 != 0) {
               return this.M(var1, var2, var4, var7 + b(23499, 8175125693640110362L));
            }

            var12 = this.M(var1, var2, var4, var7);
         }

         return var12;
      }

      int var10 = var12;
      var12 = var10;
      if (var6 == null) {
         if (var10 > 0) {
            return var10;
         }

         var12 = b(18288, 7863585141233773991L);
      }

      return var12;
   }

   @Override
   public int getContainerGap(JComponent var1, int var2, Container var3) {
      super.getContainerGap(var1, var2, var3);
      return this.I(var1, var2, b(20089, 4451886024593892521L) - this.t(var1, var2));
   }

   @Override
   public int M(JComponent var1, JComponent var2, int var3, int var4) {
      String[] var10000 = XD3.U();
      var4 = super.M(var1, var2, var3, var4);
      String[] var5 = var10000;
      int var8 = var4;
      if (var5 == null) {
         if (var4 > 0) {
            int var6 = this.t(var1, var3);
            int var9 = var6;
            if (var5 == null) {
               if (var6 == 0) {
                  var6 = this.t(var2, this.i(var3));
               }

               var9 = var4 - var6;
            }

            var4 = var9;
         }

         var8 = var4;
      }

      if (var5 == null) {
         if (var8 < 0) {
            return 0;
         }

         var8 = var4;
      }

      return var8;
   }

   public int t(JComponent var1, int var2) {
      String[] var10000 = XD3.U();
      String var4 = var1.getUIClassID();
      String[] var3 = var10000;
      int var5 = (var4.equals(b(5016, 3964))) ? 1 : 0;
      if (var3 == null) {
         label61:
         if (var5 == 0) {
            int var7 = (var4.equals(b(5017, 27437))) ? 1 : 0;
            if (var3 == null) {
               if (var7 != 0) {
                  break label61;
               }

               var7 = var2;
            }

            if (var3 != null) {
               return var7;
            }

            if (var7 == 5) {
               byte var6 = (byte)((var4.equals(b(5022, -2476))) ? 1 : 0);
               if (var3 != null) {
                  return var6;
               }

               if (var6 != 0) {
                  return 1;
               }

               byte var8 = (byte)((var4.equals(b(5019, 1712))) ? 1 : 0);
               if (var3 != null) {
                  return var8;
               }

               if (var8 != 0) {
                  return 1;
               }
            }

            return 0;
         }

         var5 = var2;
      }

      if (var3 == null) {
         if (var5 != 3) {
            if (var3 != null) {
               return var2;
            }

            if (var2 != 5) {
               return 0;
            }
         }

         var5 = (var1.getBorder() instanceof UIResource) ? 1 : 0;
      }

      if (var3 != null) {
         return var5;
      } else {
         return var5 != 0 ? 1 : 0;
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 5018) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 217;
               break;
            case 1:
               var10000 = 184;
               break;
            case 2:
               var10000 = 132;
               break;
            case 3:
               var10000 = 241;
               break;
            case 4:
               var10000 = 136;
               break;
            case 5:
               var10000 = 49;
               break;
            case 6:
               var10000 = 61;
               break;
            case 7:
               var10000 = 208;
               break;
            case 8:
               var10000 = 227;
               break;
            case 9:
               var10000 = 215;
               break;
            case 10:
               var10000 = 229;
               break;
            case 11:
               var10000 = 250;
               break;
            case 12:
               var10000 = 13;
               break;
            case 13:
               var10000 = 114;
               break;
            case 14:
               var10000 = 146;
               break;
            case 15:
               var10000 = 177;
               break;
            case 16:
               var10000 = 78;
               break;
            case 17:
               var10000 = 156;
               break;
            case 18:
               var10000 = 99;
               break;
            case 19:
               var10000 = 209;
               break;
            case 20:
               var10000 = 153;
               break;
            case 21:
               var10000 = 111;
               break;
            case 22:
               var10000 = 236;
               break;
            case 23:
               var10000 = 62;
               break;
            case 24:
               var10000 = 117;
               break;
            case 25:
               var10000 = 40;
               break;
            case 26:
               var10000 = 37;
               break;
            case 27:
               var10000 = 115;
               break;
            case 28:
               var10000 = 163;
               break;
            case 29:
               var10000 = 22;
               break;
            case 30:
               var10000 = 150;
               break;
            case 31:
               var10000 = 68;
               break;
            case 32:
               var10000 = 53;
               break;
            case 33:
               var10000 = 80;
               break;
            case 34:
               var10000 = 128;
               break;
            case 35:
               var10000 = 97;
               break;
            case 36:
               var10000 = 38;
               break;
            case 37:
               var10000 = 10;
               break;
            case 38:
               var10000 = 67;
               break;
            case 39:
               var10000 = 41;
               break;
            case 40:
               var10000 = 18;
               break;
            case 41:
               var10000 = 35;
               break;
            case 42:
               var10000 = 249;
               break;
            case 43:
               var10000 = 159;
               break;
            case 44:
               var10000 = 233;
               break;
            case 45:
               var10000 = 100;
               break;
            case 46:
               var10000 = 180;
               break;
            case 47:
               var10000 = 89;
               break;
            case 48:
               var10000 = 232;
               break;
            case 49:
               var10000 = 70;
               break;
            case 50:
               var10000 = 112;
               break;
            case 51:
               var10000 = 244;
               break;
            case 52:
               var10000 = 222;
               break;
            case 53:
               var10000 = 224;
               break;
            case 54:
               var10000 = 240;
               break;
            case 55:
               var10000 = 46;
               break;
            case 56:
               var10000 = 130;
               break;
            case 57:
               var10000 = 43;
               break;
            case 58:
               var10000 = 234;
               break;
            case 59:
               var10000 = 255;
               break;
            case 60:
               var10000 = 237;
               break;
            case 61:
               var10000 = 166;
               break;
            case 62:
               var10000 = 158;
               break;
            case 63:
               var10000 = 193;
               break;
            case 64:
               var10000 = 142;
               break;
            case 65:
               var10000 = 194;
               break;
            case 66:
               var10000 = 155;
               break;
            case 67:
               var10000 = 42;
               break;
            case 68:
               var10000 = 66;
               break;
            case 69:
               var10000 = 5;
               break;
            case 70:
               var10000 = 108;
               break;
            case 71:
               var10000 = 225;
               break;
            case 72:
               var10000 = 39;
               break;
            case 73:
               var10000 = 65;
               break;
            case 74:
               var10000 = 113;
               break;
            case 75:
               var10000 = 60;
               break;
            case 76:
               var10000 = 161;
               break;
            case 77:
               var10000 = 93;
               break;
            case 78:
               var10000 = 210;
               break;
            case 79:
               var10000 = 191;
               break;
            case 80:
               var10000 = 203;
               break;
            case 81:
               var10000 = 202;
               break;
            case 82:
               var10000 = 198;
               break;
            case 83:
               var10000 = 221;
               break;
            case 84:
               var10000 = 245;
               break;
            case 85:
               var10000 = 19;
               break;
            case 86:
               var10000 = 207;
               break;
            case 87:
               var10000 = 144;
               break;
            case 88:
               var10000 = 129;
               break;
            case 89:
               var10000 = 110;
               break;
            case 90:
               var10000 = 64;
               break;
            case 91:
               var10000 = 31;
               break;
            case 92:
               var10000 = 223;
               break;
            case 93:
               var10000 = 106;
               break;
            case 94:
               var10000 = 24;
               break;
            case 95:
               var10000 = 205;
               break;
            case 96:
               var10000 = 105;
               break;
            case 97:
               var10000 = 206;
               break;
            case 98:
               var10000 = 214;
               break;
            case 99:
               var10000 = 103;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 192;
               break;
            case 102:
               var10000 = 82;
               break;
            case 103:
               var10000 = 2;
               break;
            case 104:
               var10000 = 228;
               break;
            case 105:
               var10000 = 59;
               break;
            case 106:
               var10000 = 83;
               break;
            case 107:
               var10000 = 139;
               break;
            case 108:
               var10000 = 69;
               break;
            case 109:
               var10000 = 140;
               break;
            case 110:
               var10000 = 50;
               break;
            case 111:
               var10000 = 47;
               break;
            case 112:
               var10000 = 183;
               break;
            case 113:
               var10000 = 134;
               break;
            case 114:
               var10000 = 81;
               break;
            case 115:
               var10000 = 14;
               break;
            case 116:
               var10000 = 218;
               break;
            case 117:
               var10000 = 162;
               break;
            case 118:
               var10000 = 238;
               break;
            case 119:
               var10000 = 104;
               break;
            case 120:
               var10000 = 137;
               break;
            case 121:
               var10000 = 48;
               break;
            case 122:
               var10000 = 141;
               break;
            case 123:
               var10000 = 119;
               break;
            case 124:
               var10000 = 96;
               break;
            case 125:
               var10000 = 211;
               break;
            case 126:
               var10000 = 131;
               break;
            case 127:
               var10000 = 56;
               break;
            case 128:
               var10000 = 118;
               break;
            case 129:
               var10000 = 85;
               break;
            case 130:
               var10000 = 16;
               break;
            case 131:
               var10000 = 109;
               break;
            case 132:
               var10000 = 58;
               break;
            case 133:
               var10000 = 138;
               break;
            case 134:
               var10000 = 121;
               break;
            case 135:
               var10000 = 0;
               break;
            case 136:
               var10000 = 3;
               break;
            case 137:
               var10000 = 174;
               break;
            case 138:
               var10000 = 29;
               break;
            case 139:
               var10000 = 88;
               break;
            case 140:
               var10000 = 6;
               break;
            case 141:
               var10000 = 189;
               break;
            case 142:
               var10000 = 239;
               break;
            case 143:
               var10000 = 230;
               break;
            case 144:
               var10000 = 254;
               break;
            case 145:
               var10000 = 201;
               break;
            case 146:
               var10000 = 196;
               break;
            case 147:
               var10000 = 251;
               break;
            case 148:
               var10000 = 143;
               break;
            case 149:
               var10000 = 45;
               break;
            case 150:
               var10000 = 33;
               break;
            case 151:
               var10000 = 167;
               break;
            case 152:
               var10000 = 160;
               break;
            case 153:
               var10000 = 216;
               break;
            case 154:
               var10000 = 4;
               break;
            case 155:
               var10000 = 98;
               break;
            case 156:
               var10000 = 15;
               break;
            case 157:
               var10000 = 107;
               break;
            case 158:
               var10000 = 8;
               break;
            case 159:
               var10000 = 36;
               break;
            case 160:
               var10000 = 9;
               break;
            case 161:
               var10000 = 126;
               break;
            case 162:
               var10000 = 77;
               break;
            case 163:
               var10000 = 76;
               break;
            case 164:
               var10000 = 74;
               break;
            case 165:
               var10000 = 252;
               break;
            case 166:
               var10000 = 25;
               break;
            case 167:
               var10000 = 91;
               break;
            case 168:
               var10000 = 243;
               break;
            case 169:
               var10000 = 204;
               break;
            case 170:
               var10000 = 173;
               break;
            case 171:
               var10000 = 220;
               break;
            case 172:
               var10000 = 87;
               break;
            case 173:
               var10000 = 28;
               break;
            case 174:
               var10000 = 12;
               break;
            case 175:
               var10000 = 95;
               break;
            case 176:
               var10000 = 133;
               break;
            case 177:
               var10000 = 90;
               break;
            case 178:
               var10000 = 195;
               break;
            case 179:
               var10000 = 135;
               break;
            case 180:
               var10000 = 187;
               break;
            case 181:
               var10000 = 73;
               break;
            case 182:
               var10000 = 212;
               break;
            case 183:
               var10000 = 148;
               break;
            case 184:
               var10000 = 63;
               break;
            case 185:
               var10000 = 34;
               break;
            case 186:
               var10000 = 71;
               break;
            case 187:
               var10000 = 86;
               break;
            case 188:
               var10000 = 94;
               break;
            case 189:
               var10000 = 149;
               break;
            case 190:
               var10000 = 20;
               break;
            case 191:
               var10000 = 253;
               break;
            case 192:
               var10000 = 55;
               break;
            case 193:
               var10000 = 179;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 188;
               break;
            case 196:
               var10000 = 1;
               break;
            case 197:
               var10000 = 168;
               break;
            case 198:
               var10000 = 57;
               break;
            case 199:
               var10000 = 127;
               break;
            case 200:
               var10000 = 101;
               break;
            case 201:
               var10000 = 52;
               break;
            case 202:
               var10000 = 27;
               break;
            case 203:
               var10000 = 226;
               break;
            case 204:
               var10000 = 185;
               break;
            case 205:
               var10000 = 17;
               break;
            case 206:
               var10000 = 170;
               break;
            case 207:
               var10000 = 116;
               break;
            case 208:
               var10000 = 7;
               break;
            case 209:
               var10000 = 186;
               break;
            case 210:
               var10000 = 92;
               break;
            case 211:
               var10000 = 124;
               break;
            case 212:
               var10000 = 123;
               break;
            case 213:
               var10000 = 23;
               break;
            case 214:
               var10000 = 152;
               break;
            case 215:
               var10000 = 79;
               break;
            case 216:
               var10000 = 125;
               break;
            case 217:
               var10000 = 165;
               break;
            case 218:
               var10000 = 242;
               break;
            case 219:
               var10000 = 197;
               break;
            case 220:
               var10000 = 102;
               break;
            case 221:
               var10000 = 154;
               break;
            case 222:
               var10000 = 176;
               break;
            case 223:
               var10000 = 248;
               break;
            case 224:
               var10000 = 213;
               break;
            case 225:
               var10000 = 21;
               break;
            case 226:
               var10000 = 246;
               break;
            case 227:
               var10000 = 84;
               break;
            case 228:
               var10000 = 172;
               break;
            case 229:
               var10000 = 171;
               break;
            case 230:
               var10000 = 145;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 26;
               break;
            case 233:
               var10000 = 164;
               break;
            case 234:
               var10000 = 54;
               break;
            case 235:
               var10000 = 200;
               break;
            case 236:
               var10000 = 75;
               break;
            case 237:
               var10000 = 181;
               break;
            case 238:
               var10000 = 231;
               break;
            case 239:
               var10000 = 51;
               break;
            case 240:
               var10000 = 199;
               break;
            case 241:
               var10000 = 122;
               break;
            case 242:
               var10000 = 219;
               break;
            case 243:
               var10000 = 30;
               break;
            case 244:
               var10000 = 32;
               break;
            case 245:
               var10000 = 147;
               break;
            case 246:
               var10000 = 235;
               break;
            case 247:
               var10000 = 247;
               break;
            case 248:
               var10000 = 157;
               break;
            case 249:
               var10000 = 169;
               break;
            case 250:
               var10000 = 190;
               break;
            case 251:
               var10000 = 151;
               break;
            case 252:
               var10000 = 44;
               break;
            case 253:
               var10000 = 120;
               break;
            case 254:
               var10000 = 178;
               break;
            default:
               var10000 = 175;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10963;
      if (h[var3] == null) {
         h[var3] = (int)(g[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "]\u0097|y\u0018èbÆ\u0089\u0019ÊÇ§Ð\n.>å¯n\u0091f' ´\bJ»Y¶ÎkÌà";
      int var12 = "]\u0097|y\u0018èbÆ\u0089\u0019ÊÇ§Ð\n.>å¯n\u0091f' ´\bJ»Y¶ÎkÌà".length();
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 75;
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
                        var65 = 41;
                        break;
                     case 1:
                        var65 = 120;
                        break;
                     case 2:
                        var65 = 105;
                        break;
                     case 3:
                        var65 = 67;
                        break;
                     case 4:
                        var65 = 127;
                        break;
                     case 5:
                        var65 = 99;
                        break;
                     default:
                        var65 = 15;
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
                     c = var13;
                     d = new String[5];
                     long var0 = 6563952287364805229L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "ö\u0095ü÷\u00ad\u0004(\u007f6}¬ü8Ü\u0017>¡õ²½Ék\u0083q";
                     int var5 = "ö\u0095ü÷\u00ad\u0004(\u007f6}¬ü8Ü\u0017>¡õ²½Ék\u0083q".length();
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
                                    g = var6;
                                    h = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ªù×Jn\u008c\u0016ÈV\u009aab&º\u009fÆ";
                                 var5 = "ªù×Jn\u008c\u0016ÈV\u009aab&º\u009fÆ".length();
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

                  var10 = "dÈ\u009dTâ\u008bûl|\u008a²sn\u0080\r\u009d\u0019g¯Ý\u001cH\\Û¶G·í";
                  var12 = "dÈ\u009dTâ\u008bûl|\u008a²sn\u0080\r\u009d\u0019g¯Ý\u001cH\\Û¶G·í".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 77;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





