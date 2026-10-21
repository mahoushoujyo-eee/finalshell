import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;

public class zt_2 extends z7 {
   private static boolean u;
   private static final String[] a;
   private static final String[] b;

   public zt_2() {
      this.setLayout(new MigLayout(a(23287, 11042), a(23284, 17143), a(23285, 4204)));
      boolean var10000 = N();
      JCheckBox var10001;
      String var10003 = a(23283, 32494);
      Object[] var10004 = com.c.f();
      Method var67 = com.c.d(270389152141252877L);
      Object[] var108 = var10004;
      Object var91 = null;

      try {
         var10004 = (Object[])var67.invoke(var91, var108);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var91 = com.c.f();
      Method var10007 = com.c.d(306266403902896148L);
      var108 = (Object[])var91;
      var91 = var10004;
      Method var69 = var10007;

      try {
         var10004 = (Object[])var69.invoke(var91, var108);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var91 = com.c.f();
      var10007 = com.c.d(623727123785142657L);
      var108 = (Object[])var91;
      var91 = var10004;
      Method var71 = var10007;

      try {
         var72 = (Boolean)var71.invoke(var91, var108);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var10001 = new JCheckBox(var10003, var72);
      JCheckBox var2 = var10001;
      boolean var1 = var10000;
      this.add(var2, a(23286, -7441));
      var2.addActionListener(new l8_2(this, var2));
      JCheckBox var21;
      String var10002 = a(23295, 14231);
      Object[] var46 = com.c.f();
      Method var47 = com.c.d(270389152141252877L);
      var91 = var46;
      var10004 = null;

      try {
         var10003 = (String)var47.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      var10004 = com.c.f();
      Method var111 = com.c.d(306266403902896148L);
      var91 = var10004;
      var10004 = var10003;
      Method var49 = var111;

      try {
         var10003 = (String)var49.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var10004 = com.c.f();
      Method var112 = com.c.d(593871185714058018L);
      var91 = var10004;
      var10004 = var10003;
      Method var51 = var112;

      try {
         var52 = (Boolean)var51.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var21 = new JCheckBox(var10002, var52);
      JCheckBox var3 = var21;
      Object[] var22 = com.c.f();
      Method var23 = com.c.d(253808553645062345L);
      Object[] var39 = var22;
      Object var33 = null;

      try {
         var10000 = (Boolean)var23.invoke(var33, var39);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      label142: {
         label141: {
            if (!var1) {
               if (var10000) {
                  break label141;
               }

               Object[] var25 = com.c.f();
               Method var26 = com.c.d(454647487873911743L);
               Object[] var41 = var25;
               var33 = null;

               try {
                  var10000 = (Boolean)var26.invoke(var33, var41);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }
            }

            if (!var10000) {
               break label142;
            }
         }

         this.add(var3, a(23281, 15640));
      }

      var3.addActionListener(new mP(this, var3));
      JCheckBox var27;
      var10002 = a(23280, 11267);
      Object[] var53 = com.c.f();
      Method var54 = com.c.d(270389152141252877L);
      var91 = var53;
      var10004 = null;

      try {
         var10003 = (String)var54.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10004 = com.c.f();
      Method var113 = com.c.d(306266403902896148L);
      var91 = var10004;
      var10004 = var10003;
      Method var56 = var113;

      try {
         var10003 = (String)var56.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10004 = com.c.f();
      Method var114 = com.c.d(249847093911123285L);
      var91 = var10004;
      var10004 = var10003;
      Method var58 = var114;

      try {
         var59 = (Boolean)var58.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var27 = new JCheckBox(var10002, var59);
      JCheckBox var4 = var27;
      this.add(var4, a(23281, 15640));
      var4.addActionListener(new m3(this, var4));
      JCheckBox var28;
      var10002 = a(23282, -1287);
      Object[] var60 = com.c.f();
      Method var61 = com.c.d(270389152141252877L);
      var91 = var60;
      var10004 = null;

      try {
         var10003 = (String)var61.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10004 = com.c.f();
      Method var115 = com.c.d(306266403902896148L);
      var91 = var10004;
      var10004 = var10003;
      Method var63 = var115;

      try {
         var10003 = (String)var63.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10004 = com.c.f();
      Method var116 = com.c.d(629017702607628679L);
      var91 = var10004;
      var10004 = var10003;
      Method var65 = var116;

      try {
         var66 = (Boolean)var65.invoke(var10004, (Object[])var91);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var28 = new JCheckBox(var10002, var66);
      JCheckBox var5 = var28;
      Object[] var29 = com.c.f();
      Method var30 = com.c.d(253808553645062345L);
      Object[] var45 = var29;
      var33 = null;

      try {
         var10000 = (Boolean)var30.invoke(var33, var45);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var10000) {
      }

      var5.addActionListener(new bY_3(this, var5));
      if (var1) {
         com.ky_4.K(new String[3]);
      }
   }

   @Override
   public void A(lv_4 var1) {
   }

   @Override
   public Vg_2 c() {
      return null;
   }

   @Override
   public void F(lv_4 var1) {
   }

   public static void t(boolean var0) {
      u = var0;
   }

   public static boolean p() {
      return u;
   }

   public static boolean N() {
      boolean var0 = p();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "X §öª\u0015¸¯±Y\u0005\bæ1é£¡T\u0004L,êý\u0004Ñ\u001dÊ<\u0002zÝ\u0006脉劭逄丑梘箥\u0004復柤咁剽\u0004\u008d¡ÒL";
      int var4 = "X §öª\u0015¸¯±Y\u0005\bæ1é£¡T\u0004L,êý\u0004Ñ\u001dÊ<\u0002zÝ\u0006脉劭逄丑梘箥\u0004復柤咁剽\u0004\u008d¡ÒL".length();
      char var1 = 18;
      int var8 = -1;
      t(true);

      label52:
      while (true) {
         byte var10000 = 47;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 104;
                        break;
                     case 1:
                        var46 = 30;
                        break;
                     case 2:
                        var46 = 92;
                        break;
                     case 3:
                        var46 = 61;
                        break;
                     case 4:
                        var46 = 118;
                        break;
                     case 5:
                        var46 = 28;
                        break;
                     default:
                        var46 = 51;
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
                     b = new String[9];
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

                  var2 = "凋锊穼叒劄磎诳\t償镗呿枚尌匠剼抽盇";
                  var4 = "凋锊穼叒劄磎诳\t償镗呿枚尌匠剼抽盇".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 84;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 23287) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 98;
               break;
            case 1:
               var10000 = 110;
               break;
            case 2:
               var10000 = 213;
               break;
            case 3:
               var10000 = 233;
               break;
            case 4:
               var10000 = 75;
               break;
            case 5:
               var10000 = 73;
               break;
            case 6:
               var10000 = 208;
               break;
            case 7:
               var10000 = 111;
               break;
            case 8:
               var10000 = 21;
               break;
            case 9:
               var10000 = 245;
               break;
            case 10:
               var10000 = 114;
               break;
            case 11:
               var10000 = 115;
               break;
            case 12:
               var10000 = 94;
               break;
            case 13:
               var10000 = 99;
               break;
            case 14:
               var10000 = 39;
               break;
            case 15:
               var10000 = 17;
               break;
            case 16:
               var10000 = 15;
               break;
            case 17:
               var10000 = 218;
               break;
            case 18:
               var10000 = 144;
               break;
            case 19:
               var10000 = 42;
               break;
            case 20:
               var10000 = 228;
               break;
            case 21:
               var10000 = 135;
               break;
            case 22:
               var10000 = 32;
               break;
            case 23:
               var10000 = 128;
               break;
            case 24:
               var10000 = 26;
               break;
            case 25:
               var10000 = 49;
               break;
            case 26:
               var10000 = 181;
               break;
            case 27:
               var10000 = 67;
               break;
            case 28:
               var10000 = 112;
               break;
            case 29:
               var10000 = 192;
               break;
            case 30:
               var10000 = 30;
               break;
            case 31:
               var10000 = 172;
               break;
            case 32:
               var10000 = 176;
               break;
            case 33:
               var10000 = 41;
               break;
            case 34:
               var10000 = 24;
               break;
            case 35:
               var10000 = 71;
               break;
            case 36:
               var10000 = 52;
               break;
            case 37:
               var10000 = 175;
               break;
            case 38:
               var10000 = 163;
               break;
            case 39:
               var10000 = 78;
               break;
            case 40:
               var10000 = 246;
               break;
            case 41:
               var10000 = 170;
               break;
            case 42:
               var10000 = 100;
               break;
            case 43:
               var10000 = 194;
               break;
            case 44:
               var10000 = 55;
               break;
            case 45:
               var10000 = 104;
               break;
            case 46:
               var10000 = 196;
               break;
            case 47:
               var10000 = 139;
               break;
            case 48:
               var10000 = 48;
               break;
            case 49:
               var10000 = 81;
               break;
            case 50:
               var10000 = 136;
               break;
            case 51:
               var10000 = 241;
               break;
            case 52:
               var10000 = 102;
               break;
            case 53:
               var10000 = 105;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 142;
               break;
            case 56:
               var10000 = 18;
               break;
            case 57:
               var10000 = 171;
               break;
            case 58:
               var10000 = 227;
               break;
            case 59:
               var10000 = 97;
               break;
            case 60:
               var10000 = 239;
               break;
            case 61:
               var10000 = 145;
               break;
            case 62:
               var10000 = 191;
               break;
            case 63:
               var10000 = 19;
               break;
            case 64:
               var10000 = 6;
               break;
            case 65:
               var10000 = 121;
               break;
            case 66:
               var10000 = 237;
               break;
            case 67:
               var10000 = 5;
               break;
            case 68:
               var10000 = 120;
               break;
            case 69:
               var10000 = 162;
               break;
            case 70:
               var10000 = 169;
               break;
            case 71:
               var10000 = 200;
               break;
            case 72:
               var10000 = 167;
               break;
            case 73:
               var10000 = 232;
               break;
            case 74:
               var10000 = 53;
               break;
            case 75:
               var10000 = 64;
               break;
            case 76:
               var10000 = 79;
               break;
            case 77:
               var10000 = 214;
               break;
            case 78:
               var10000 = 74;
               break;
            case 79:
               var10000 = 88;
               break;
            case 80:
               var10000 = 178;
               break;
            case 81:
               var10000 = 50;
               break;
            case 82:
               var10000 = 217;
               break;
            case 83:
               var10000 = 103;
               break;
            case 84:
               var10000 = 182;
               break;
            case 85:
               var10000 = 193;
               break;
            case 86:
               var10000 = 173;
               break;
            case 87:
               var10000 = 236;
               break;
            case 88:
               var10000 = 254;
               break;
            case 89:
               var10000 = 68;
               break;
            case 90:
               var10000 = 63;
               break;
            case 91:
               var10000 = 89;
               break;
            case 92:
               var10000 = 231;
               break;
            case 93:
               var10000 = 165;
               break;
            case 94:
               var10000 = 247;
               break;
            case 95:
               var10000 = 206;
               break;
            case 96:
               var10000 = 29;
               break;
            case 97:
               var10000 = 158;
               break;
            case 98:
               var10000 = 141;
               break;
            case 99:
               var10000 = 14;
               break;
            case 100:
               var10000 = 168;
               break;
            case 101:
               var10000 = 201;
               break;
            case 102:
               var10000 = 43;
               break;
            case 103:
               var10000 = 28;
               break;
            case 104:
               var10000 = 131;
               break;
            case 105:
               var10000 = 164;
               break;
            case 106:
               var10000 = 82;
               break;
            case 107:
               var10000 = 31;
               break;
            case 108:
               var10000 = 166;
               break;
            case 109:
               var10000 = 129;
               break;
            case 110:
               var10000 = 179;
               break;
            case 111:
               var10000 = 154;
               break;
            case 112:
               var10000 = 202;
               break;
            case 113:
               var10000 = 250;
               break;
            case 114:
               var10000 = 186;
               break;
            case 115:
               var10000 = 76;
               break;
            case 116:
               var10000 = 249;
               break;
            case 117:
               var10000 = 61;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 224;
               break;
            case 120:
               var10000 = 234;
               break;
            case 121:
               var10000 = 185;
               break;
            case 122:
               var10000 = 238;
               break;
            case 123:
               var10000 = 123;
               break;
            case 124:
               var10000 = 57;
               break;
            case 125:
               var10000 = 45;
               break;
            case 126:
               var10000 = 108;
               break;
            case 127:
               var10000 = 204;
               break;
            case 128:
               var10000 = 62;
               break;
            case 129:
               var10000 = 240;
               break;
            case 130:
               var10000 = 203;
               break;
            case 131:
               var10000 = 205;
               break;
            case 132:
               var10000 = 59;
               break;
            case 133:
               var10000 = 134;
               break;
            case 134:
               var10000 = 211;
               break;
            case 135:
               var10000 = 3;
               break;
            case 136:
               var10000 = 47;
               break;
            case 137:
               var10000 = 34;
               break;
            case 138:
               var10000 = 25;
               break;
            case 139:
               var10000 = 235;
               break;
            case 140:
               var10000 = 212;
               break;
            case 141:
               var10000 = 95;
               break;
            case 142:
               var10000 = 148;
               break;
            case 143:
               var10000 = 253;
               break;
            case 144:
               var10000 = 118;
               break;
            case 145:
               var10000 = 187;
               break;
            case 146:
               var10000 = 149;
               break;
            case 147:
               var10000 = 243;
               break;
            case 148:
               var10000 = 92;
               break;
            case 149:
               var10000 = 0;
               break;
            case 150:
               var10000 = 159;
               break;
            case 151:
               var10000 = 66;
               break;
            case 152:
               var10000 = 207;
               break;
            case 153:
               var10000 = 69;
               break;
            case 154:
               var10000 = 124;
               break;
            case 155:
               var10000 = 183;
               break;
            case 156:
               var10000 = 13;
               break;
            case 157:
               var10000 = 70;
               break;
            case 158:
               var10000 = 152;
               break;
            case 159:
               var10000 = 223;
               break;
            case 160:
               var10000 = 83;
               break;
            case 161:
               var10000 = 197;
               break;
            case 162:
               var10000 = 219;
               break;
            case 163:
               var10000 = 195;
               break;
            case 164:
               var10000 = 1;
               break;
            case 165:
               var10000 = 12;
               break;
            case 166:
               var10000 = 138;
               break;
            case 167:
               var10000 = 107;
               break;
            case 168:
               var10000 = 189;
               break;
            case 169:
               var10000 = 155;
               break;
            case 170:
               var10000 = 132;
               break;
            case 171:
               var10000 = 85;
               break;
            case 172:
               var10000 = 188;
               break;
            case 173:
               var10000 = 65;
               break;
            case 174:
               var10000 = 2;
               break;
            case 175:
               var10000 = 160;
               break;
            case 176:
               var10000 = 130;
               break;
            case 177:
               var10000 = 86;
               break;
            case 178:
               var10000 = 23;
               break;
            case 179:
               var10000 = 38;
               break;
            case 180:
               var10000 = 157;
               break;
            case 181:
               var10000 = 122;
               break;
            case 182:
               var10000 = 10;
               break;
            case 183:
               var10000 = 133;
               break;
            case 184:
               var10000 = 184;
               break;
            case 185:
               var10000 = 90;
               break;
            case 186:
               var10000 = 20;
               break;
            case 187:
               var10000 = 36;
               break;
            case 188:
               var10000 = 4;
               break;
            case 189:
               var10000 = 77;
               break;
            case 190:
               var10000 = 225;
               break;
            case 191:
               var10000 = 199;
               break;
            case 192:
               var10000 = 27;
               break;
            case 193:
               var10000 = 146;
               break;
            case 194:
               var10000 = 180;
               break;
            case 195:
               var10000 = 44;
               break;
            case 196:
               var10000 = 119;
               break;
            case 197:
               var10000 = 177;
               break;
            case 198:
               var10000 = 51;
               break;
            case 199:
               var10000 = 22;
               break;
            case 200:
               var10000 = 16;
               break;
            case 201:
               var10000 = 60;
               break;
            case 202:
               var10000 = 91;
               break;
            case 203:
               var10000 = 84;
               break;
            case 204:
               var10000 = 8;
               break;
            case 205:
               var10000 = 229;
               break;
            case 206:
               var10000 = 198;
               break;
            case 207:
               var10000 = 174;
               break;
            case 208:
               var10000 = 40;
               break;
            case 209:
               var10000 = 126;
               break;
            case 210:
               var10000 = 96;
               break;
            case 211:
               var10000 = 147;
               break;
            case 212:
               var10000 = 150;
               break;
            case 213:
               var10000 = 161;
               break;
            case 214:
               var10000 = 56;
               break;
            case 215:
               var10000 = 106;
               break;
            case 216:
               var10000 = 230;
               break;
            case 217:
               var10000 = 248;
               break;
            case 218:
               var10000 = 33;
               break;
            case 219:
               var10000 = 35;
               break;
            case 220:
               var10000 = 143;
               break;
            case 221:
               var10000 = 72;
               break;
            case 222:
               var10000 = 117;
               break;
            case 223:
               var10000 = 156;
               break;
            case 224:
               var10000 = 9;
               break;
            case 225:
               var10000 = 252;
               break;
            case 226:
               var10000 = 109;
               break;
            case 227:
               var10000 = 215;
               break;
            case 228:
               var10000 = 137;
               break;
            case 229:
               var10000 = 80;
               break;
            case 230:
               var10000 = 7;
               break;
            case 231:
               var10000 = 87;
               break;
            case 232:
               var10000 = 101;
               break;
            case 233:
               var10000 = 58;
               break;
            case 234:
               var10000 = 255;
               break;
            case 235:
               var10000 = 153;
               break;
            case 236:
               var10000 = 226;
               break;
            case 237:
               var10000 = 54;
               break;
            case 238:
               var10000 = 11;
               break;
            case 239:
               var10000 = 113;
               break;
            case 240:
               var10000 = 220;
               break;
            case 241:
               var10000 = 93;
               break;
            case 242:
               var10000 = 46;
               break;
            case 243:
               var10000 = 222;
               break;
            case 244:
               var10000 = 216;
               break;
            case 245:
               var10000 = 37;
               break;
            case 246:
               var10000 = 190;
               break;
            case 247:
               var10000 = 127;
               break;
            case 248:
               var10000 = 140;
               break;
            case 249:
               var10000 = 210;
               break;
            case 250:
               var10000 = 151;
               break;
            case 251:
               var10000 = 209;
               break;
            case 252:
               var10000 = 244;
               break;
            case 253:
               var10000 = 221;
               break;
            case 254:
               var10000 = 125;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }
}





