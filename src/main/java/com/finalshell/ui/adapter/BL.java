package com.finalshell.ui.adapter;

import com.finalshell.core.Kl2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FilePanel;
import com.finalshell.ui.panel.LI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class BL extends DefaultTableCellRenderer {
   Border r;
   SimpleDateFormat P;
   LI Y;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public BL() {
      Border var10001 = BorderFactory.createEmptyBorder(0, 2, 0, 2);
      long var2 = 309099026769308988L;
      Border var1 = var10001;
      Ref.s(309099026769308988L, var1, var2);
      SimpleDateFormat var10002 = new SimpleDateFormat(a(12733, -20228));
      long var4 = 588630502317331173L;
      SimpleDateFormat var3 = var10002;
      Ref.s(588630502317331173L, var3, var4);
      LI var10003 = new LI();
      long var6 = 595445583775762992L;
      LI var5 = var10003;
      Ref.s(595445583775762992L, var5, var6);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Object var13 = 595445583775762992L;
      LI var8 = (LI)Ref.g(595445583775762992L, var13);
      boolean var10001 = FilePanel.q();
      int var9 = var1.convertColumnIndexToModel(var6);
      boolean var7 = var10001;
      if (var9 == 1) {
      }

      var8.setHorizontalAlignment(2);
      Kl2 var10 = null;
      var8.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object[] var10002 = Registry.packArgs(false);
      long var16 = 630219014051795833L;
      Object[] var15 = var10002;
      Ref.h(630219014051795833L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      label180: {
         var10002 = var2.getClass();
         if (var7) {
            if (!var10002.equals(Kl2.class)) {
               break label180;
            }

            var10002 = (Object[])var2;
         }

         String var11;
         label181: {
            var10 = (Kl2)var10002;
            var11 = "";
            int var58 = var9;
            byte var10003 = 4;
            if (var7) {
               if (var9 == 4) {
                  Object[] var59 = Registry.emptyArgs();
                  long var18 = 472130306342185677L;
                  Object[] var17 = var59;
                  Object var60 = Ref.h(472130306342185677L, var17, var18);

                  try {
                     var61 = (String)var60;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }

                  var11 = var61;
                  if (var7) {
                     break label181;
                  }
               }

               var58 = var9;
               var10003 = 1;
            }

            label183: {
               if (var7) {
                  if (var58 == var10003) {
                     new StringBuilder();
                     Object[] var10004 = Registry.emptyArgs();
                     long var20 = 405237998940608713L;
                     Object[] var19 = var10004;
                     var10004 = Ref.h(405237998940608713L, var19, var20);

                     try {
                        var66 = (Long)var10004;
                     } catch (InvocationTargetException var53) {
                        throw var53.getTargetException();
                     }

                     var10004 = Registry.e(var66);
                     long var21 = 406907072371364013L;
                     Object var10005 = Ref.h2(406907072371364013L, var21);

                     try {
                        var10005 = (String)var10005;
                     } catch (InvocationTargetException var52) {
                        throw var52.getTargetException();
                     }

                     var10004.append((String)var10005).append("/");
                     Object[] var10006 = Registry.emptyArgs();
                     long var24 = 399113218510016089L;
                     Object[] var23 = var10006;
                     var10006 = Ref.h(399113218510016089L, var23, var24);

                     try {
                        var77 = (Long)var10006;
                     } catch (InvocationTargetException var51) {
                        throw var51.getTargetException();
                     }

                     var10006 = Registry.e(var77);
                     long var25 = 406907072371364013L;
                     Object var10007 = Ref.h2(406907072371364013L, var25);

                     try {
                        var10007 = (String)var10007;
                     } catch (InvocationTargetException var50) {
                        throw var50.getTargetException();
                     }

                     var11 = var10006.append((String)var10007).toString();
                     var8.setHorizontalAlignment(4);
                     var10007 = Registry.packArgs(true);
                     long var28 = 630219014051795833L;
                     Object[] var27 = (Object[])var10007;
                     Ref.h(630219014051795833L, var27, var28);

                     try {
                        ;
                     } catch (InvocationTargetException var49) {
                        throw var49.getTargetException();
                     }

                     float var81 = 100.0F;
                     Object[] var10009 = Registry.emptyArgs();
                     long var30 = 431375544983974376L;
                     Object[] var29 = var10009;
                     var10009 = Ref.h(431375544983974376L, var29, var30);

                     try {
                        var83 = (Long)var10009;
                     } catch (InvocationTargetException var48) {
                        throw var48.getTargetException();
                     }

                     float var10008 = var10 * (float)var83;
                     Object[] var10010 = Registry.emptyArgs();
                     long var32 = 399113218510016089L;
                     Object[] var31 = var10010;
                     var10010 = Ref.h(399113218510016089L, var31, var32);

                     try {
                        var85 = (Long)var10010;
                     } catch (InvocationTargetException var47) {
                        throw var47.getTargetException();
                     }

                     float var12 = var10 / (float)var85;
                     var8.setHorizontalAlignment(4);
                     if (var7) {
                        break label181;
                     }
                  }

                  var58 = var9;
                  if (!var7) {
                     break label183;
                  }

                  var10003 = 2;
               }

               if (var58 == var10003) {
                  Object[] var62 = Registry.emptyArgs();
                  long var34 = 405237998940608713L;
                  Object[] var33 = var62;
                  Object var63 = Ref.h(405237998940608713L, var33, var34);

                  try {
                     var64 = (Long)var63;
                  } catch (InvocationTargetException var46) {
                     throw var46.getTargetException();
                  }

                  Registry.e(var64);
                  long var35 = 148259110884974759L;
                  Object var68 = Ref.h2(148259110884974759L, var35);

                  try {
                     var68 = (String)var68;
                  } catch (InvocationTargetException var45) {
                     throw var45.getTargetException();
                  }

                  var11 = (String)var68;
                  var8.setHorizontalAlignment(4);
                  if (var7) {
                     break label181;
                  }
               }

               var58 = var9;
            }

            if (var58 == 0) {
               new StringBuilder();
               String var70 = (String)(Registry.emptyArgs());
               long var38 = 607781649910455471L;
               Object[] var37 = var70;
               var70 = Ref.h(607781649910455471L, var37, var38);

               try {
                  var70 = (String)var70;
               } catch (InvocationTargetException var44) {
                  throw var44.getTargetException();
               }

               var11 = var10.append((String)var70).append("").toString();
            }
         }

         var8.setText(var11);
      }

      Object var39 = 309099026769308988L;
      this.setBorder((Border)Ref.g(309099026769308988L, var39));
      var8.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object[] var73 = Registry.packArgs(var10);
      long var42 = 135979377668257475L;
      Object[] var41 = var73;
      Ref.h(135979377668257475L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      int var74 = (var3) ? 1 : 0;
      if (var7) {
         if (var3 != 0) {
            var8.setBackground((Color)Registry.lookupField(623875439513009390L).get(null));
            var8.setForeground((Color)Registry.lookupField(513155505692963448L).get(null));
            var8.setOpaque(true);
            if (var7) {
               return var8;
            }
         }

         var74 = var5 % 2;
      }

      int var56 = var74;
      var8.setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      if (var7) {
         if (var56 == 0) {
            var8.setOpaque(false);
            if (var7) {
               return var8;
            }
         }

         var8.setOpaque(true);
      }

      var8.setBackground(
         new Color(a(2853, 2002663596686180547L), a(12097, 6522143982347658404L), a(12097, 6522143982347658404L), a(22835, 8571133897542554324L))
      );
      return var8;
   }

   static String a(long var0) {
      Registry.e(var0);
      long var2 = 148259110884974759L;
      Object var10001 = Ref.h2(148259110884974759L, var2);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return var10001.replaceAll(a(12732, 4695), "M");
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 12732) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 130;
               break;
            case 1:
               var10000 = 236;
               break;
            case 2:
               var10000 = 112;
               break;
            case 3:
               var10000 = 36;
               break;
            case 4:
               var10000 = 72;
               break;
            case 5:
               var10000 = 25;
               break;
            case 6:
               var10000 = 152;
               break;
            case 7:
               var10000 = 82;
               break;
            case 8:
               var10000 = 219;
               break;
            case 9:
               var10000 = 157;
               break;
            case 10:
               var10000 = 144;
               break;
            case 11:
               var10000 = 48;
               break;
            case 12:
               var10000 = 99;
               break;
            case 13:
               var10000 = 32;
               break;
            case 14:
               var10000 = 39;
               break;
            case 15:
               var10000 = 155;
               break;
            case 16:
               var10000 = 231;
               break;
            case 17:
               var10000 = 7;
               break;
            case 18:
               var10000 = 203;
               break;
            case 19:
               var10000 = 85;
               break;
            case 20:
               var10000 = 191;
               break;
            case 21:
               var10000 = 149;
               break;
            case 22:
               var10000 = 134;
               break;
            case 23:
               var10000 = 27;
               break;
            case 24:
               var10000 = 216;
               break;
            case 25:
               var10000 = 254;
               break;
            case 26:
               var10000 = 186;
               break;
            case 27:
               var10000 = 162;
               break;
            case 28:
               var10000 = 200;
               break;
            case 29:
               var10000 = 100;
               break;
            case 30:
               var10000 = 154;
               break;
            case 31:
               var10000 = 91;
               break;
            case 32:
               var10000 = 240;
               break;
            case 33:
               var10000 = 180;
               break;
            case 34:
               var10000 = 92;
               break;
            case 35:
               var10000 = 125;
               break;
            case 36:
               var10000 = 217;
               break;
            case 37:
               var10000 = 222;
               break;
            case 38:
               var10000 = 161;
               break;
            case 39:
               var10000 = 168;
               break;
            case 40:
               var10000 = 96;
               break;
            case 41:
               var10000 = 199;
               break;
            case 42:
               var10000 = 235;
               break;
            case 43:
               var10000 = 61;
               break;
            case 44:
               var10000 = 54;
               break;
            case 45:
               var10000 = 111;
               break;
            case 46:
               var10000 = 178;
               break;
            case 47:
               var10000 = 233;
               break;
            case 48:
               var10000 = 128;
               break;
            case 49:
               var10000 = 242;
               break;
            case 50:
               var10000 = 51;
               break;
            case 51:
               var10000 = 196;
               break;
            case 52:
               var10000 = 15;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 29;
               break;
            case 55:
               var10000 = 46;
               break;
            case 56:
               var10000 = 87;
               break;
            case 57:
               var10000 = 28;
               break;
            case 58:
               var10000 = 121;
               break;
            case 59:
               var10000 = 75;
               break;
            case 60:
               var10000 = 140;
               break;
            case 61:
               var10000 = 60;
               break;
            case 62:
               var10000 = 44;
               break;
            case 63:
               var10000 = 108;
               break;
            case 64:
               var10000 = 63;
               break;
            case 65:
               var10000 = 14;
               break;
            case 66:
               var10000 = 252;
               break;
            case 67:
               var10000 = 57;
               break;
            case 68:
               var10000 = 179;
               break;
            case 69:
               var10000 = 68;
               break;
            case 70:
               var10000 = 177;
               break;
            case 71:
               var10000 = 190;
               break;
            case 72:
               var10000 = 115;
               break;
            case 73:
               var10000 = 214;
               break;
            case 74:
               var10000 = 19;
               break;
            case 75:
               var10000 = 127;
               break;
            case 76:
               var10000 = 139;
               break;
            case 77:
               var10000 = 113;
               break;
            case 78:
               var10000 = 143;
               break;
            case 79:
               var10000 = 208;
               break;
            case 80:
               var10000 = 246;
               break;
            case 81:
               var10000 = 90;
               break;
            case 82:
               var10000 = 58;
               break;
            case 83:
               var10000 = 218;
               break;
            case 84:
               var10000 = 12;
               break;
            case 85:
               var10000 = 249;
               break;
            case 86:
               var10000 = 65;
               break;
            case 87:
               var10000 = 221;
               break;
            case 88:
               var10000 = 159;
               break;
            case 89:
               var10000 = 118;
               break;
            case 90:
               var10000 = 24;
               break;
            case 91:
               var10000 = 132;
               break;
            case 92:
               var10000 = 38;
               break;
            case 93:
               var10000 = 182;
               break;
            case 94:
               var10000 = 55;
               break;
            case 95:
               var10000 = 2;
               break;
            case 96:
               var10000 = 150;
               break;
            case 97:
               var10000 = 171;
               break;
            case 98:
               var10000 = 50;
               break;
            case 99:
               var10000 = 70;
               break;
            case 100:
               var10000 = 18;
               break;
            case 101:
               var10000 = 215;
               break;
            case 102:
               var10000 = 0;
               break;
            case 103:
               var10000 = 248;
               break;
            case 104:
               var10000 = 188;
               break;
            case 105:
               var10000 = 3;
               break;
            case 106:
               var10000 = 253;
               break;
            case 107:
               var10000 = 79;
               break;
            case 108:
               var10000 = 120;
               break;
            case 109:
               var10000 = 141;
               break;
            case 110:
               var10000 = 158;
               break;
            case 111:
               var10000 = 11;
               break;
            case 112:
               var10000 = 49;
               break;
            case 113:
               var10000 = 165;
               break;
            case 114:
               var10000 = 176;
               break;
            case 115:
               var10000 = 129;
               break;
            case 116:
               var10000 = 209;
               break;
            case 117:
               var10000 = 237;
               break;
            case 118:
               var10000 = 33;
               break;
            case 119:
               var10000 = 31;
               break;
            case 120:
               var10000 = 114;
               break;
            case 121:
               var10000 = 136;
               break;
            case 122:
               var10000 = 66;
               break;
            case 123:
               var10000 = 107;
               break;
            case 124:
               var10000 = 167;
               break;
            case 125:
               var10000 = 193;
               break;
            case 126:
               var10000 = 142;
               break;
            case 127:
               var10000 = 153;
               break;
            case 128:
               var10000 = 211;
               break;
            case 129:
               var10000 = 234;
               break;
            case 130:
               var10000 = 164;
               break;
            case 131:
               var10000 = 124;
               break;
            case 132:
               var10000 = 133;
               break;
            case 133:
               var10000 = 225;
               break;
            case 134:
               var10000 = 71;
               break;
            case 135:
               var10000 = 23;
               break;
            case 136:
               var10000 = 94;
               break;
            case 137:
               var10000 = 207;
               break;
            case 138:
               var10000 = 213;
               break;
            case 139:
               var10000 = 67;
               break;
            case 140:
               var10000 = 117;
               break;
            case 141:
               var10000 = 21;
               break;
            case 142:
               var10000 = 119;
               break;
            case 143:
               var10000 = 45;
               break;
            case 144:
               var10000 = 30;
               break;
            case 145:
               var10000 = 195;
               break;
            case 146:
               var10000 = 10;
               break;
            case 147:
               var10000 = 88;
               break;
            case 148:
               var10000 = 202;
               break;
            case 149:
               var10000 = 145;
               break;
            case 150:
               var10000 = 170;
               break;
            case 151:
               var10000 = 175;
               break;
            case 152:
               var10000 = 64;
               break;
            case 153:
               var10000 = 123;
               break;
            case 154:
               var10000 = 78;
               break;
            case 155:
               var10000 = 151;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 250;
               break;
            case 158:
               var10000 = 131;
               break;
            case 159:
               var10000 = 80;
               break;
            case 160:
               var10000 = 5;
               break;
            case 161:
               var10000 = 173;
               break;
            case 162:
               var10000 = 77;
               break;
            case 163:
               var10000 = 247;
               break;
            case 164:
               var10000 = 172;
               break;
            case 165:
               var10000 = 126;
               break;
            case 166:
               var10000 = 255;
               break;
            case 167:
               var10000 = 137;
               break;
            case 168:
               var10000 = 81;
               break;
            case 169:
               var10000 = 9;
               break;
            case 170:
               var10000 = 146;
               break;
            case 171:
               var10000 = 40;
               break;
            case 172:
               var10000 = 8;
               break;
            case 173:
               var10000 = 37;
               break;
            case 174:
               var10000 = 189;
               break;
            case 175:
               var10000 = 228;
               break;
            case 176:
               var10000 = 183;
               break;
            case 177:
               var10000 = 184;
               break;
            case 178:
               var10000 = 174;
               break;
            case 179:
               var10000 = 181;
               break;
            case 180:
               var10000 = 239;
               break;
            case 181:
               var10000 = 198;
               break;
            case 182:
               var10000 = 212;
               break;
            case 183:
               var10000 = 223;
               break;
            case 184:
               var10000 = 109;
               break;
            case 185:
               var10000 = 17;
               break;
            case 186:
               var10000 = 110;
               break;
            case 187:
               var10000 = 205;
               break;
            case 188:
               var10000 = 147;
               break;
            case 189:
               var10000 = 26;
               break;
            case 190:
               var10000 = 230;
               break;
            case 191:
               var10000 = 4;
               break;
            case 192:
               var10000 = 13;
               break;
            case 193:
               var10000 = 97;
               break;
            case 194:
               var10000 = 83;
               break;
            case 195:
               var10000 = 226;
               break;
            case 196:
               var10000 = 229;
               break;
            case 197:
               var10000 = 59;
               break;
            case 198:
               var10000 = 166;
               break;
            case 199:
               var10000 = 6;
               break;
            case 200:
               var10000 = 232;
               break;
            case 201:
               var10000 = 238;
               break;
            case 202:
               var10000 = 220;
               break;
            case 203:
               var10000 = 62;
               break;
            case 204:
               var10000 = 245;
               break;
            case 205:
               var10000 = 169;
               break;
            case 206:
               var10000 = 135;
               break;
            case 207:
               var10000 = 160;
               break;
            case 208:
               var10000 = 227;
               break;
            case 209:
               var10000 = 43;
               break;
            case 210:
               var10000 = 197;
               break;
            case 211:
               var10000 = 101;
               break;
            case 212:
               var10000 = 53;
               break;
            case 213:
               var10000 = 116;
               break;
            case 214:
               var10000 = 148;
               break;
            case 215:
               var10000 = 185;
               break;
            case 216:
               var10000 = 73;
               break;
            case 217:
               var10000 = 241;
               break;
            case 218:
               var10000 = 1;
               break;
            case 219:
               var10000 = 122;
               break;
            case 220:
               var10000 = 56;
               break;
            case 221:
               var10000 = 34;
               break;
            case 222:
               var10000 = 69;
               break;
            case 223:
               var10000 = 16;
               break;
            case 224:
               var10000 = 20;
               break;
            case 225:
               var10000 = 22;
               break;
            case 226:
               var10000 = 76;
               break;
            case 227:
               var10000 = 84;
               break;
            case 228:
               var10000 = 41;
               break;
            case 229:
               var10000 = 194;
               break;
            case 230:
               var10000 = 201;
               break;
            case 231:
               var10000 = 210;
               break;
            case 232:
               var10000 = 89;
               break;
            case 233:
               var10000 = 105;
               break;
            case 234:
               var10000 = 251;
               break;
            case 235:
               var10000 = 93;
               break;
            case 236:
               var10000 = 86;
               break;
            case 237:
               var10000 = 156;
               break;
            case 238:
               var10000 = 98;
               break;
            case 239:
               var10000 = 35;
               break;
            case 240:
               var10000 = 138;
               break;
            case 241:
               var10000 = 187;
               break;
            case 242:
               var10000 = 224;
               break;
            case 243:
               var10000 = 102;
               break;
            case 244:
               var10000 = 163;
               break;
            case 245:
               var10000 = 206;
               break;
            case 246:
               var10000 = 42;
               break;
            case 247:
               var10000 = 243;
               break;
            case 248:
               var10000 = 192;
               break;
            case 249:
               var10000 = 244;
               break;
            case 250:
               var10000 = 103;
               break;
            case 251:
               var10000 = 95;
               break;
            case 252:
               var10000 = 74;
               break;
            case 253:
               var10000 = 47;
               break;
            case 254:
               var10000 = 104;
               break;
            default:
               var10000 = 52;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3047;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "%<NÉC\u0010G\u00ad¦[½Ü\u0096ÑPõ\u0003\u000e \u001c¹\u0091";
      int var12 = "%<NÉC\u0010G\u00ad¦[½Ü\u0096ÑPõ\u0003\u000e \u001c¹\u0091".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 89;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 89;
               var10006 = var14;
            } else {
               var23 = 89;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 89;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 89;
                     break;
                  case 1:
                     var41 = 127;
                     break;
                  case 2:
                     var41 = 56;
                     break;
                  case 3:
                     var41 = 92;
                     break;
                  case 4:
                     var41 = 101;
                     break;
                  case 5:
                     var41 = 85;
                     break;
                  default:
                     var41 = 120;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 598888680411900949L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "LR+\u0092Ú¡~Ë \u0092údÒâ,²Ø³Gò\u0086<\u0088Õ";
            int var5 = "LR+\u0092Ú¡~Ë \u0092údÒâ,²Ø³Gò\u0086<\u0088Õ".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





