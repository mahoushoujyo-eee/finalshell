package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.LK3;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class V7 {
   public static String[] a;
   public static String[] b;

   public static void d(Oc2 var0) {
      long var20;
      Object[] var24;
      Object[] var26;
      boolean var40;
      Registry.packArgs(var0);
      long var8 = 309393706086347748L;
      Object var10001 = Ref.h2(309393706086347748L, var8);

      try {
         var10001 = (ArrayList)var10001;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      ArrayList var2 = (ArrayList)var10001;
      LD3_2.v();
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 306266403902896148L;
      Object[] var12 = var10004;
      var10004 = Ref.h(306266403902896148L, var12, var13);
      ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
      long var15 = 401275417195122293L;
      Object var14 = var10005;
      var10005 = Ref.h(401275417195122293L, var14, var15);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      ArrayList var3 = var10005;
      Object var1 = var10004;
      Registry.packArgs(var2, var3, new LD3_2());
      long var16 = 212474312414779304L;
      var10005 = Ref.h2(212474312414779304L, var16);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      ArrayList var4 = var10005;
      ArrayList var5 = new ArrayList();
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            LD3_2 var7 = (LD3_2)var6.next();
            if (var1 == null) {
               break;
            }

            Registry.packArgs(var7);
            long var18 = 366543685241882690L;
            Object var10006 = Ref.h2(366543685241882690L, var18);

            try {
               var40 = (Boolean)var10006;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            if (var1 == null && !var40) {
               var5.add(var7);
            }

            if (var1 == null) {
               continue;
            }

            Ky4.K(new String[1]);
         }

         Registry.packArgs(var5);
         var20 = 281009066630120083L;
         Ref.h2(281009066630120083L, var20);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Registry.emptyArgs();
         long var22 = 270389152141252877L;
         Ref.h2(270389152141252877L, var22);
         Object[] var10008 = Registry.emptyArgs();
         long var25 = 306266403902896148L;
         var24 = var10008;
         Ref.h(306266403902896148L, var24, var25);
         Object[] var10009 = Registry.packArgs(var5);
         long var27 = 475770670235303350L;
         var26 = var10009;
         Ref.h(475770670235303350L, var26, var27);

         try {
            break;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }
   }

   public static void U(ArrayList var0) {
      Collections.sort(var0, new LK3());
   }

   public static ArrayList x(Oc2 var0) {
      int var10000 = LD3_2.v();
      ArrayList var2 = new ArrayList();
      int var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var0.size()) {
      ArrayList var24;
            O0 var4 = var0.V(var3);
            LD3_2 var5 = new LD3_2();
            var24 = (ArrayList)(var5);
            Object[] var10001 = Registry.packArgs(var4.b(a(18532, 28921)));
            long var7 = 225283838617508237L;
            Object[] var6 = var10001;
            Ref.h(225283838617508237L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            Object[] var10002 = Registry.packArgs(var4.C$String(a(18535, -22362)));
            long var9 = 377666728424280826L;
            Object[] var8 = var10002;
            Ref.h(377666728424280826L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            Object[] var10003 = Registry.packArgs(var4.C$String(a(18534, -28728)));
            long var11 = 164722860361686941L;
            Object[] var10 = var10003;
            Ref.h(164722860361686941L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Object[] var10004 = Registry.packArgs(var4.C$String(a(18536, 21435)));
            long var13 = 182129248968368124L;
            Object[] var12 = var10004;
            Ref.h(182129248968368124L, var12, var13);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            Object[] var10005 = Registry.packArgs(var4.b(a(18529, 1423)));
            long var15 = 272088854428135235L;
            Object[] var14 = var10005;
            Ref.h(272088854428135235L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            Registry.packArgs(var5, var4);
            long var16 = 272456164038541053L;
            Ref.h2(272456164038541053L, var16);

            try {
               ;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            if (var1 == 0) {
               break;
            }

            var2.add(var5);
            var3++;
            if (var1 != 0) {
               continue;
            }
         }

         var24 = var2;
         break;
      }

      return (ArrayList)var24;
   }

   public static Oc2 F(ArrayList var0) {
      Integer var26;
      Integer var32;
      int var10000 = LD3_2.v();
      Oc2 var2 = new Oc2();
      int var1 = var10000;
      Iterator var3 = var0.iterator();

      while (true) {
         if (var3.hasNext()) {
            LD3_2 var4 = (LD3_2)var3.next();
            O0 var5 = new O0();
            var24 = var5;
            String var10001 = a(18528, -18756);
            Object var10003 = Registry.emptyArgs();
            long var7 = 562951426394330328L;
            Object var6 = var10003;
            var10003 = Ref.h(562951426394330328L, var6, var7);

            try {
               var26 = (Integer)var10003;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            var10001.C(var4, var26);
            String var10002 = a(18537, 30177);
            Object var10004 = Registry.emptyArgs();
            long var9 = 531355023953548464L;
            Object var8 = var10004;
            var10004 = Ref.h(531355023953548464L, var8, var9);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var10002.C(var4, var10004);
            String var27 = a(18530, 23914);
            Object var10005 = Registry.emptyArgs();
            long var11 = 511476850441845458L;
            Object var10 = var10005;
            var10005 = Ref.h(511476850441845458L, var10, var11);

            try {
               var32 = (Integer)var10005;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            var27.C(var4, var32);
            String var30 = a(18531, -12359);
            Object var10006 = Registry.emptyArgs();
            long var13 = 562777604625200665L;
            Object var12 = var10006;
            var10006 = Ref.h(562777604625200665L, var12, var13);

            try {
               var10006 = (String)var10006;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            var30.C(var4, var10006);
            String var33 = a(18533, -25501);
            Object var10007 = Registry.emptyArgs();
            long var15 = 465224899237569377L;
            Object var14 = var10007;
            var10007 = Ref.h(465224899237569377L, var14, var15);

            try {
               var10007 = (String)var10007;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            var33.C(var4, var10007);
            Registry.packArgs(var4, var5);
            long var16 = 622166953529806027L;
            Ref.h2(622166953529806027L, var16);

            try {
               ;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            if (var1 == 0) {
               break;
            }

            var2.add(var5);
            if (var1 != 0) {
               continue;
            }
         }

         var24 = var2;
         break;
      }

      return (Oc2)var24;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 18528) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 12;
               break;
            case 1:
               var10000 = 192;
               break;
            case 2:
               var10000 = 77;
               break;
            case 3:
               var10000 = 121;
               break;
            case 4:
               var10000 = 217;
               break;
            case 5:
               var10000 = 29;
               break;
            case 6:
               var10000 = 214;
               break;
            case 7:
               var10000 = 190;
               break;
            case 8:
               var10000 = 242;
               break;
            case 9:
               var10000 = 109;
               break;
            case 10:
               var10000 = 15;
               break;
            case 11:
               var10000 = 142;
               break;
            case 12:
               var10000 = 43;
               break;
            case 13:
               var10000 = 83;
               break;
            case 14:
               var10000 = 135;
               break;
            case 15:
               var10000 = 180;
               break;
            case 16:
               var10000 = 193;
               break;
            case 17:
               var10000 = 247;
               break;
            case 18:
               var10000 = 40;
               break;
            case 19:
               var10000 = 44;
               break;
            case 20:
               var10000 = 100;
               break;
            case 21:
               var10000 = 235;
               break;
            case 22:
               var10000 = 212;
               break;
            case 23:
               var10000 = 137;
               break;
            case 24:
               var10000 = 14;
               break;
            case 25:
               var10000 = 49;
               break;
            case 26:
               var10000 = 4;
               break;
            case 27:
               var10000 = 98;
               break;
            case 28:
               var10000 = 87;
               break;
            case 29:
               var10000 = 152;
               break;
            case 30:
               var10000 = 101;
               break;
            case 31:
               var10000 = 81;
               break;
            case 32:
               var10000 = 31;
               break;
            case 33:
               var10000 = 230;
               break;
            case 34:
               var10000 = 139;
               break;
            case 35:
               var10000 = 24;
               break;
            case 36:
               var10000 = 88;
               break;
            case 37:
               var10000 = 168;
               break;
            case 38:
               var10000 = 208;
               break;
            case 39:
               var10000 = 226;
               break;
            case 40:
               var10000 = 84;
               break;
            case 41:
               var10000 = 178;
               break;
            case 42:
               var10000 = 13;
               break;
            case 43:
               var10000 = 255;
               break;
            case 44:
               var10000 = 243;
               break;
            case 45:
               var10000 = 166;
               break;
            case 46:
               var10000 = 37;
               break;
            case 47:
               var10000 = 252;
               break;
            case 48:
               var10000 = 251;
               break;
            case 49:
               var10000 = 233;
               break;
            case 50:
               var10000 = 237;
               break;
            case 51:
               var10000 = 134;
               break;
            case 52:
               var10000 = 151;
               break;
            case 53:
               var10000 = 206;
               break;
            case 54:
               var10000 = 205;
               break;
            case 55:
               var10000 = 32;
               break;
            case 56:
               var10000 = 159;
               break;
            case 57:
               var10000 = 6;
               break;
            case 58:
               var10000 = 17;
               break;
            case 59:
               var10000 = 64;
               break;
            case 60:
               var10000 = 71;
               break;
            case 61:
               var10000 = 195;
               break;
            case 62:
               var10000 = 163;
               break;
            case 63:
               var10000 = 21;
               break;
            case 64:
               var10000 = 10;
               break;
            case 65:
               var10000 = 162;
               break;
            case 66:
               var10000 = 22;
               break;
            case 67:
               var10000 = 249;
               break;
            case 68:
               var10000 = 239;
               break;
            case 69:
               var10000 = 148;
               break;
            case 70:
               var10000 = 30;
               break;
            case 71:
               var10000 = 89;
               break;
            case 72:
               var10000 = 186;
               break;
            case 73:
               var10000 = 106;
               break;
            case 74:
               var10000 = 61;
               break;
            case 75:
               var10000 = 218;
               break;
            case 76:
               var10000 = 236;
               break;
            case 77:
               var10000 = 254;
               break;
            case 78:
               var10000 = 34;
               break;
            case 79:
               var10000 = 127;
               break;
            case 80:
               var10000 = 172;
               break;
            case 81:
               var10000 = 75;
               break;
            case 82:
               var10000 = 176;
               break;
            case 83:
               var10000 = 111;
               break;
            case 84:
               var10000 = 229;
               break;
            case 85:
               var10000 = 158;
               break;
            case 86:
               var10000 = 200;
               break;
            case 87:
               var10000 = 197;
               break;
            case 88:
               var10000 = 224;
               break;
            case 89:
               var10000 = 223;
               break;
            case 90:
               var10000 = 7;
               break;
            case 91:
               var10000 = 164;
               break;
            case 92:
               var10000 = 82;
               break;
            case 93:
               var10000 = 165;
               break;
            case 94:
               var10000 = 129;
               break;
            case 95:
               var10000 = 245;
               break;
            case 96:
               var10000 = 104;
               break;
            case 97:
               var10000 = 79;
               break;
            case 98:
               var10000 = 50;
               break;
            case 99:
               var10000 = 26;
               break;
            case 100:
               var10000 = 45;
               break;
            case 101:
               var10000 = 181;
               break;
            case 102:
               var10000 = 103;
               break;
            case 103:
               var10000 = 118;
               break;
            case 104:
               var10000 = 171;
               break;
            case 105:
               var10000 = 1;
               break;
            case 106:
               var10000 = 120;
               break;
            case 107:
               var10000 = 96;
               break;
            case 108:
               var10000 = 69;
               break;
            case 109:
               var10000 = 51;
               break;
            case 110:
               var10000 = 220;
               break;
            case 111:
               var10000 = 124;
               break;
            case 112:
               var10000 = 174;
               break;
            case 113:
               var10000 = 157;
               break;
            case 114:
               var10000 = 177;
               break;
            case 115:
               var10000 = 196;
               break;
            case 116:
               var10000 = 244;
               break;
            case 117:
               var10000 = 80;
               break;
            case 118:
               var10000 = 189;
               break;
            case 119:
               var10000 = 207;
               break;
            case 120:
               var10000 = 91;
               break;
            case 121:
               var10000 = 53;
               break;
            case 122:
               var10000 = 191;
               break;
            case 123:
               var10000 = 140;
               break;
            case 124:
               var10000 = 146;
               break;
            case 125:
               var10000 = 20;
               break;
            case 126:
               var10000 = 8;
               break;
            case 127:
               var10000 = 59;
               break;
            case 128:
               var10000 = 125;
               break;
            case 129:
               var10000 = 67;
               break;
            case 130:
               var10000 = 156;
               break;
            case 131:
               var10000 = 110;
               break;
            case 132:
               var10000 = 2;
               break;
            case 133:
               var10000 = 182;
               break;
            case 134:
               var10000 = 219;
               break;
            case 135:
               var10000 = 154;
               break;
            case 136:
               var10000 = 78;
               break;
            case 137:
               var10000 = 16;
               break;
            case 138:
               var10000 = 179;
               break;
            case 139:
               var10000 = 119;
               break;
            case 140:
               var10000 = 0;
               break;
            case 141:
               var10000 = 63;
               break;
            case 142:
               var10000 = 41;
               break;
            case 143:
               var10000 = 35;
               break;
            case 144:
               var10000 = 94;
               break;
            case 145:
               var10000 = 25;
               break;
            case 146:
               var10000 = 102;
               break;
            case 147:
               var10000 = 56;
               break;
            case 148:
               var10000 = 28;
               break;
            case 149:
               var10000 = 107;
               break;
            case 150:
               var10000 = 153;
               break;
            case 151:
               var10000 = 66;
               break;
            case 152:
               var10000 = 33;
               break;
            case 153:
               var10000 = 128;
               break;
            case 154:
               var10000 = 36;
               break;
            case 155:
               var10000 = 169;
               break;
            case 156:
               var10000 = 47;
               break;
            case 157:
               var10000 = 130;
               break;
            case 158:
               var10000 = 221;
               break;
            case 159:
               var10000 = 126;
               break;
            case 160:
               var10000 = 232;
               break;
            case 161:
               var10000 = 58;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 74;
               break;
            case 164:
               var10000 = 123;
               break;
            case 165:
               var10000 = 131;
               break;
            case 166:
               var10000 = 3;
               break;
            case 167:
               var10000 = 216;
               break;
            case 168:
               var10000 = 97;
               break;
            case 169:
               var10000 = 113;
               break;
            case 170:
               var10000 = 167;
               break;
            case 171:
               var10000 = 147;
               break;
            case 172:
               var10000 = 105;
               break;
            case 173:
               var10000 = 138;
               break;
            case 174:
               var10000 = 70;
               break;
            case 175:
               var10000 = 175;
               break;
            case 176:
               var10000 = 145;
               break;
            case 177:
               var10000 = 39;
               break;
            case 178:
               var10000 = 228;
               break;
            case 179:
               var10000 = 99;
               break;
            case 180:
               var10000 = 194;
               break;
            case 181:
               var10000 = 115;
               break;
            case 182:
               var10000 = 240;
               break;
            case 183:
               var10000 = 225;
               break;
            case 184:
               var10000 = 202;
               break;
            case 185:
               var10000 = 57;
               break;
            case 186:
               var10000 = 72;
               break;
            case 187:
               var10000 = 210;
               break;
            case 188:
               var10000 = 38;
               break;
            case 189:
               var10000 = 86;
               break;
            case 190:
               var10000 = 73;
               break;
            case 191:
               var10000 = 108;
               break;
            case 192:
               var10000 = 54;
               break;
            case 193:
               var10000 = 55;
               break;
            case 194:
               var10000 = 246;
               break;
            case 195:
               var10000 = 27;
               break;
            case 196:
               var10000 = 170;
               break;
            case 197:
               var10000 = 209;
               break;
            case 198:
               var10000 = 149;
               break;
            case 199:
               var10000 = 213;
               break;
            case 200:
               var10000 = 122;
               break;
            case 201:
               var10000 = 52;
               break;
            case 202:
               var10000 = 85;
               break;
            case 203:
               var10000 = 231;
               break;
            case 204:
               var10000 = 188;
               break;
            case 205:
               var10000 = 155;
               break;
            case 206:
               var10000 = 253;
               break;
            case 207:
               var10000 = 93;
               break;
            case 208:
               var10000 = 117;
               break;
            case 209:
               var10000 = 114;
               break;
            case 210:
               var10000 = 112;
               break;
            case 211:
               var10000 = 136;
               break;
            case 212:
               var10000 = 201;
               break;
            case 213:
               var10000 = 150;
               break;
            case 214:
               var10000 = 23;
               break;
            case 215:
               var10000 = 238;
               break;
            case 216:
               var10000 = 19;
               break;
            case 217:
               var10000 = 241;
               break;
            case 218:
               var10000 = 227;
               break;
            case 219:
               var10000 = 5;
               break;
            case 220:
               var10000 = 248;
               break;
            case 221:
               var10000 = 11;
               break;
            case 222:
               var10000 = 204;
               break;
            case 223:
               var10000 = 143;
               break;
            case 224:
               var10000 = 222;
               break;
            case 225:
               var10000 = 133;
               break;
            case 226:
               var10000 = 161;
               break;
            case 227:
               var10000 = 160;
               break;
            case 228:
               var10000 = 250;
               break;
            case 229:
               var10000 = 234;
               break;
            case 230:
               var10000 = 132;
               break;
            case 231:
               var10000 = 92;
               break;
            case 232:
               var10000 = 184;
               break;
            case 233:
               var10000 = 42;
               break;
            case 234:
               var10000 = 203;
               break;
            case 235:
               var10000 = 199;
               break;
            case 236:
               var10000 = 173;
               break;
            case 237:
               var10000 = 141;
               break;
            case 238:
               var10000 = 187;
               break;
            case 239:
               var10000 = 215;
               break;
            case 240:
               var10000 = 185;
               break;
            case 241:
               var10000 = 48;
               break;
            case 242:
               var10000 = 198;
               break;
            case 243:
               var10000 = 144;
               break;
            case 244:
               var10000 = 183;
               break;
            case 245:
               var10000 = 76;
               break;
            case 246:
               var10000 = 90;
               break;
            case 247:
               var10000 = 18;
               break;
            case 248:
               var10000 = 65;
               break;
            case 249:
               var10000 = 68;
               break;
            case 250:
               var10000 = 116;
               break;
            case 251:
               var10000 = 46;
               break;
            case 252:
               var10000 = 62;
               break;
            case 253:
               var10000 = 95;
               break;
            case 254:
               var10000 = 9;
               break;
            default:
               var10000 = 211;
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
      char[] var20;
      byte var32;
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "î\u008bÆ»\u0004]\u008a6^\u0004F8U\b\t\u0001\u001f\u000fu$9Læ_\u0004k\u008dv{\b6\u001cZDr?¸\u000e\t&«ëã¸ëß¼-\u00042EÁ§";
      int var4 = "î\u008bÆ»\u0004]\u008a6^\u0004F8U\b\t\u0001\u001f\u000fu$9Læ_\u0004k\u008dv{\b6\u001cZDr?¸\u000e\t&«ëã¸ëß¼-\u00042EÁ§".length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 118;
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
                        var46 = 56;
                        break;
                     case 1:
                        var46 = 74;
                        break;
                     case 2:
                        var46 = 46;
                        break;
                     case 3:
                        var46 = 8;
                        break;
                     case 4:
                        var46 = 46;
                        break;
                     case 5:
                        var46 = 124;
                        break;
                     default:
                        var46 = 96;
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
                     b = new String[10];
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

                  var2 = "§,«\u0081\u008fDÄ¢\u0004Z\u009b\u000f¿";
                  var4 = "§,«\u0081\u008fDÄ¢\u0004Z\u009b\u000f¿".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 81;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
   private static Object var24;
}





