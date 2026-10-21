package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class DD3 {
   public static int y;
   public static boolean x;
   public static String Q;
   public static String z;
   public static String D;
   public static String F;
   public static String U;
   public static String d;
   public static int H;
   public static int n;
   public static String J;
   public static String V;
   public static String g;
   public static String p;
   public static String G;
   public static String X;
   public static String o;
   public static int O;
   public static int S;
   public static String W;
   public static int E;
   public static boolean I;
   public static int K;
   public static int w;
   public static int P;
   public static int e;
   public static int u;
   public static String c;
   public static String t;
   public static String s;
   public static String r;
   public static int m;
   public static String j;
   public static String B;
   public static int T;
   public static String i;
   public static String R;
   public static String[] a;
   public static String[] b;

   public static void W() {
      Ky4[] var10000 = YT3_2.c();
      long var1 = System.currentTimeMillis();
      Ky4[] var0 = var10000;
      Properties var3 = System.getProperties();
      Registry.emptyArgs();
      long var12 = 561847341732101275L;
      Object var10001 = Ref.h2(561847341732101275L, var12);

      try {
         var10001 = (Boolean)var10001;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      label115: {
         if (var0 != null) {
            if (var10001 == null) {
               Registry.lookupField(417253634927399276L).set(null, a(23161, 3210));
               if (var0 != null) {
                  break label115;
               }
            }

            var10001 = Registry.emptyArgs();
            long var14 = 454647487873911743L;
            Object var10002 = Ref.h2(454647487873911743L, var14);

            try {
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }
         }

         if (var10001 == null) {
            Registry.lookupField(417253634927399276L).set(null, a(23146, -6748));
            if (var0 != null) {
               break label115;
            }
         }

         Registry.lookupField(417253634927399276L).set(null, new File("").getAbsolutePath() + File.separator);
      }

      String var4 = var3.getProperty(a(23138, -2486));
      Registry.emptyArgs();
      long var16 = 561847341732101275L;
      File var25 = (File)Ref.h2(561847341732101275L, var16);

      try {
         var25 = (Boolean)var25;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      label117: {
         if (var0 != null) {
            if (var25 == null) {
               Registry.lookupField(322398614556294006L).set(null, var4 + File.separator + a(23166, 26251) + File.separator);
               if (var0 != null) {
                  break label117;
               }
            }

            var25 = Registry.emptyArgs();
            long var18 = 454647487873911743L;
            Object var10003 = Ref.h2(454647487873911743L, var18);

            try {
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }

         if (var25 == null) {
            Registry.lookupField(322398614556294006L).set(null, var4 + File.separator + a(23162, -22373) + File.separator + a(23156, 14462) + File.separator);
            if (var0 != null) {
               break label117;
            }
         }

         Registry.lookupField(322398614556294006L).set(null, new File("").getAbsolutePath() + File.separator);
      }

      var3.setProperty(a(23141, -22136), (String)Registry.lookupField(322398614556294006L).get(null));
      Registry.lookupField(179276309776747034L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23153, -4678));
      Registry.lookupField(168719389020873220L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23139, -3477));
      Registry.lookupField(478301022169899080L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23165, -20935));
      Registry.lookupField(504992152467754337L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23159, -7419));
      Registry.lookupField(301859255694281363L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23144, -1623));
      Registry.lookupField(452023328242776550L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23157, 10434));
      Registry.lookupField(300479712887697887L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23145, -1824));
      Registry.lookupField(454976841716774960L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23136, 18089));
      Registry.lookupField(511836262186872780L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23158, -5226));
      var25 = new File((String)Registry.lookupField(511836262186872780L).get(null));
      if (var0 != null) {
         if (!var25.exists()) {
            new File((String)Registry.lookupField(511836262186872780L).get(null)).mkdirs();
         }

         Registry.lookupField(217567344693643410L).set(null, (String)Registry.lookupField(322398614556294006L).get(null) + a(23142, 23144));
         Registry.lookupField(520328224838264973L).set(null, (String)Registry.lookupField(217567344693643410L).get(null) + File.separator + a(23167, -3742));
         var25 = new File((String)Registry.lookupField(322398614556294006L).get(null) + a(23154, 20932));
      }

      label119: {
         File var5 = (File)var25;
         boolean var28 = var5.exists();
         if (var0 != null) {
            if (!var28) {
               var5.mkdirs();
            }

            Registry.lookupField(439146272996415412L).set(null, var5.getAbsolutePath());
            var25 = var5;
            if (var0 == null) {
               break label119;
            }

            var28 = var5.exists();
         }

         if (!var28) {
            var5.mkdirs();
         }

         var25 = new File((String)Registry.lookupField(159143763483921134L).get(null));
      }

      File var6 = (File)var25;
      var25 = var6;
      if (var0 != null) {
         if (!var6.exists()) {
            return;
         }

         var25 = var6;
      }

      File[] var7 = var25.listFiles();

      for (File var11 : var7) {
         var11.delete();
         if (var0 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23152) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 131;
               break;
            case 1:
               var10000 = 14;
               break;
            case 2:
               var10000 = 213;
               break;
            case 3:
               var10000 = 37;
               break;
            case 4:
               var10000 = 100;
               break;
            case 5:
               var10000 = 38;
               break;
            case 6:
               var10000 = 135;
               break;
            case 7:
               var10000 = 138;
               break;
            case 8:
               var10000 = 43;
               break;
            case 9:
               var10000 = 190;
               break;
            case 10:
               var10000 = 217;
               break;
            case 11:
               var10000 = 51;
               break;
            case 12:
               var10000 = 154;
               break;
            case 13:
               var10000 = 248;
               break;
            case 14:
               var10000 = 202;
               break;
            case 15:
               var10000 = 44;
               break;
            case 16:
               var10000 = 28;
               break;
            case 17:
               var10000 = 61;
               break;
            case 18:
               var10000 = 32;
               break;
            case 19:
               var10000 = 132;
               break;
            case 20:
               var10000 = 214;
               break;
            case 21:
               var10000 = 60;
               break;
            case 22:
               var10000 = 118;
               break;
            case 23:
               var10000 = 188;
               break;
            case 24:
               var10000 = 99;
               break;
            case 25:
               var10000 = 196;
               break;
            case 26:
               var10000 = 156;
               break;
            case 27:
               var10000 = 72;
               break;
            case 28:
               var10000 = 142;
               break;
            case 29:
               var10000 = 177;
               break;
            case 30:
               var10000 = 166;
               break;
            case 31:
               var10000 = 5;
               break;
            case 32:
               var10000 = 110;
               break;
            case 33:
               var10000 = 197;
               break;
            case 34:
               var10000 = 247;
               break;
            case 35:
               var10000 = 71;
               break;
            case 36:
               var10000 = 185;
               break;
            case 37:
               var10000 = 200;
               break;
            case 38:
               var10000 = 79;
               break;
            case 39:
               var10000 = 17;
               break;
            case 40:
               var10000 = 192;
               break;
            case 41:
               var10000 = 206;
               break;
            case 42:
               var10000 = 113;
               break;
            case 43:
               var10000 = 244;
               break;
            case 44:
               var10000 = 144;
               break;
            case 45:
               var10000 = 147;
               break;
            case 46:
               var10000 = 203;
               break;
            case 47:
               var10000 = 42;
               break;
            case 48:
               var10000 = 8;
               break;
            case 49:
               var10000 = 104;
               break;
            case 50:
               var10000 = 88;
               break;
            case 51:
               var10000 = 168;
               break;
            case 52:
               var10000 = 151;
               break;
            case 53:
               var10000 = 26;
               break;
            case 54:
               var10000 = 89;
               break;
            case 55:
               var10000 = 126;
               break;
            case 56:
               var10000 = 83;
               break;
            case 57:
               var10000 = 164;
               break;
            case 58:
               var10000 = 19;
               break;
            case 59:
               var10000 = 9;
               break;
            case 60:
               var10000 = 228;
               break;
            case 61:
               var10000 = 80;
               break;
            case 62:
               var10000 = 123;
               break;
            case 63:
               var10000 = 143;
               break;
            case 64:
               var10000 = 218;
               break;
            case 65:
               var10000 = 68;
               break;
            case 66:
               var10000 = 178;
               break;
            case 67:
               var10000 = 98;
               break;
            case 68:
               var10000 = 210;
               break;
            case 69:
               var10000 = 16;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 27;
               break;
            case 72:
               var10000 = 253;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 225;
               break;
            case 75:
               var10000 = 133;
               break;
            case 76:
               var10000 = 195;
               break;
            case 77:
               var10000 = 114;
               break;
            case 78:
               var10000 = 101;
               break;
            case 79:
               var10000 = 54;
               break;
            case 80:
               var10000 = 222;
               break;
            case 81:
               var10000 = 150;
               break;
            case 82:
               var10000 = 204;
               break;
            case 83:
               var10000 = 128;
               break;
            case 84:
               var10000 = 0;
               break;
            case 85:
               var10000 = 46;
               break;
            case 86:
               var10000 = 48;
               break;
            case 87:
               var10000 = 95;
               break;
            case 88:
               var10000 = 182;
               break;
            case 89:
               var10000 = 141;
               break;
            case 90:
               var10000 = 49;
               break;
            case 91:
               var10000 = 235;
               break;
            case 92:
               var10000 = 13;
               break;
            case 93:
               var10000 = 127;
               break;
            case 94:
               var10000 = 172;
               break;
            case 95:
               var10000 = 117;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 122;
               break;
            case 98:
               var10000 = 90;
               break;
            case 99:
               var10000 = 91;
               break;
            case 100:
               var10000 = 63;
               break;
            case 101:
               var10000 = 199;
               break;
            case 102:
               var10000 = 34;
               break;
            case 103:
               var10000 = 240;
               break;
            case 104:
               var10000 = 74;
               break;
            case 105:
               var10000 = 181;
               break;
            case 106:
               var10000 = 29;
               break;
            case 107:
               var10000 = 78;
               break;
            case 108:
               var10000 = 211;
               break;
            case 109:
               var10000 = 125;
               break;
            case 110:
               var10000 = 53;
               break;
            case 111:
               var10000 = 129;
               break;
            case 112:
               var10000 = 229;
               break;
            case 113:
               var10000 = 208;
               break;
            case 114:
               var10000 = 230;
               break;
            case 115:
               var10000 = 102;
               break;
            case 116:
               var10000 = 70;
               break;
            case 117:
               var10000 = 245;
               break;
            case 118:
               var10000 = 21;
               break;
            case 119:
               var10000 = 184;
               break;
            case 120:
               var10000 = 189;
               break;
            case 121:
               var10000 = 31;
               break;
            case 122:
               var10000 = 243;
               break;
            case 123:
               var10000 = 140;
               break;
            case 124:
               var10000 = 227;
               break;
            case 125:
               var10000 = 92;
               break;
            case 126:
               var10000 = 220;
               break;
            case 127:
               var10000 = 1;
               break;
            case 128:
               var10000 = 85;
               break;
            case 129:
               var10000 = 207;
               break;
            case 130:
               var10000 = 67;
               break;
            case 131:
               var10000 = 159;
               break;
            case 132:
               var10000 = 25;
               break;
            case 133:
               var10000 = 251;
               break;
            case 134:
               var10000 = 155;
               break;
            case 135:
               var10000 = 216;
               break;
            case 136:
               var10000 = 23;
               break;
            case 137:
               var10000 = 161;
               break;
            case 138:
               var10000 = 7;
               break;
            case 139:
               var10000 = 174;
               break;
            case 140:
               var10000 = 183;
               break;
            case 141:
               var10000 = 246;
               break;
            case 142:
               var10000 = 223;
               break;
            case 143:
               var10000 = 163;
               break;
            case 144:
               var10000 = 3;
               break;
            case 145:
               var10000 = 107;
               break;
            case 146:
               var10000 = 36;
               break;
            case 147:
               var10000 = 221;
               break;
            case 148:
               var10000 = 242;
               break;
            case 149:
               var10000 = 130;
               break;
            case 150:
               var10000 = 173;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 171;
               break;
            case 153:
               var10000 = 254;
               break;
            case 154:
               var10000 = 39;
               break;
            case 155:
               var10000 = 226;
               break;
            case 156:
               var10000 = 109;
               break;
            case 157:
               var10000 = 4;
               break;
            case 158:
               var10000 = 112;
               break;
            case 159:
               var10000 = 165;
               break;
            case 160:
               var10000 = 137;
               break;
            case 161:
               var10000 = 33;
               break;
            case 162:
               var10000 = 64;
               break;
            case 163:
               var10000 = 52;
               break;
            case 164:
               var10000 = 237;
               break;
            case 165:
               var10000 = 106;
               break;
            case 166:
               var10000 = 45;
               break;
            case 167:
               var10000 = 35;
               break;
            case 168:
               var10000 = 73;
               break;
            case 169:
               var10000 = 50;
               break;
            case 170:
               var10000 = 232;
               break;
            case 171:
               var10000 = 215;
               break;
            case 172:
               var10000 = 146;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 158;
               break;
            case 175:
               var10000 = 115;
               break;
            case 176:
               var10000 = 97;
               break;
            case 177:
               var10000 = 20;
               break;
            case 178:
               var10000 = 236;
               break;
            case 179:
               var10000 = 249;
               break;
            case 180:
               var10000 = 40;
               break;
            case 181:
               var10000 = 191;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 55;
               break;
            case 184:
               var10000 = 241;
               break;
            case 185:
               var10000 = 86;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 58;
               break;
            case 188:
               var10000 = 186;
               break;
            case 189:
               var10000 = 157;
               break;
            case 190:
               var10000 = 212;
               break;
            case 191:
               var10000 = 77;
               break;
            case 192:
               var10000 = 176;
               break;
            case 193:
               var10000 = 10;
               break;
            case 194:
               var10000 = 15;
               break;
            case 195:
               var10000 = 187;
               break;
            case 196:
               var10000 = 153;
               break;
            case 197:
               var10000 = 103;
               break;
            case 198:
               var10000 = 41;
               break;
            case 199:
               var10000 = 139;
               break;
            case 200:
               var10000 = 47;
               break;
            case 201:
               var10000 = 75;
               break;
            case 202:
               var10000 = 94;
               break;
            case 203:
               var10000 = 105;
               break;
            case 204:
               var10000 = 82;
               break;
            case 205:
               var10000 = 136;
               break;
            case 206:
               var10000 = 255;
               break;
            case 207:
               var10000 = 180;
               break;
            case 208:
               var10000 = 193;
               break;
            case 209:
               var10000 = 148;
               break;
            case 210:
               var10000 = 167;
               break;
            case 211:
               var10000 = 152;
               break;
            case 212:
               var10000 = 145;
               break;
            case 213:
               var10000 = 87;
               break;
            case 214:
               var10000 = 119;
               break;
            case 215:
               var10000 = 179;
               break;
            case 216:
               var10000 = 238;
               break;
            case 217:
               var10000 = 198;
               break;
            case 218:
               var10000 = 201;
               break;
            case 219:
               var10000 = 24;
               break;
            case 220:
               var10000 = 11;
               break;
            case 221:
               var10000 = 93;
               break;
            case 222:
               var10000 = 22;
               break;
            case 223:
               var10000 = 6;
               break;
            case 224:
               var10000 = 252;
               break;
            case 225:
               var10000 = 149;
               break;
            case 226:
               var10000 = 96;
               break;
            case 227:
               var10000 = 134;
               break;
            case 228:
               var10000 = 18;
               break;
            case 229:
               var10000 = 65;
               break;
            case 230:
               var10000 = 111;
               break;
            case 231:
               var10000 = 69;
               break;
            case 232:
               var10000 = 30;
               break;
            case 233:
               var10000 = 224;
               break;
            case 234:
               var10000 = 76;
               break;
            case 235:
               var10000 = 175;
               break;
            case 236:
               var10000 = 121;
               break;
            case 237:
               var10000 = 250;
               break;
            case 238:
               var10000 = 66;
               break;
            case 239:
               var10000 = 209;
               break;
            case 240:
               var10000 = 59;
               break;
            case 241:
               var10000 = 120;
               break;
            case 242:
               var10000 = 56;
               break;
            case 243:
               var10000 = 2;
               break;
            case 244:
               var10000 = 108;
               break;
            case 245:
               var10000 = 81;
               break;
            case 246:
               var10000 = 116;
               break;
            case 247:
               var10000 = 233;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 84;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 170;
               break;
            case 252:
               var10000 = 205;
               break;
            case 253:
               var10000 = 62;
               break;
            case 254:
               var10000 = 231;
               break;
            default:
               var10000 = 12;
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
      String[] var13 = new String[27];
      int var11 = 0;
      String var10 = "¾µ_±o?yF÷zý©2¦\u00ad\u0004i\"¥C\t±À¾\u001fSüêæ\u0002\u0018²cXXéK!âZþ\u001b\u0003\u0096Ê\u001dlÃ¼[f\u008c\u00910\u0080\nR\u0090µ\u0089\u0012+åàv¦\b ` ÿY\u0081s\u001d\u0011\u0085gôÁqiÙÑ_\r\u0081`áNÀ`M\u000fp@xb\u0088¹óøKn\u0003Ñü\\5\nÌ\u0002\u0002\u0090¥y%£¼J\u001cT\u009f,äÜÈ\u0016Cj?PH+è\u0082W7](a¦V\u0094¾c\u0006U¿\u0007Ýà\u0003\u0094DØ\u0092\nó\f\\\u001eý\u001cð¾\u0017\u0005\u001a]1+tûFÑ÷Ç&:\u0006m\u0084$ù@à\u0087Ò\u0013é@ºþO\u0004ÊF'\u009a\u000bä\u0094\u0001ènÖÝ\u008a\u0000G\u001b\u000eSÔñ\u0088Àµ£EF:\u0001´lË\u0012¨ÕÌ%r\u001dYò{\u001fàÒ¦ ®O\u0082$\u0011ì\u009cº\u0095ú\u0097Ð¯Ï\u001c8gK7y¡R\t°õ·oz½åf\u0098\u0007\u009c73G\u0091ÄÉ\u000bé\u0096¦\u0091e\u00adø_rz'\bÃóÙ¯·©Zv\u0004¥\u0086Ø[\nùD¤Xq`¿\u0080ï.\u000bØ\u0093e(\rÌå¡çc1";
      int var12 = "¾µ_±o?yF÷zý©2¦\u00ad\u0004i\"¥C\t±À¾\u001fSüêæ\u0002\u0018²cXXéK!âZþ\u001b\u0003\u0096Ê\u001dlÃ¼[f\u008c\u00910\u0080\nR\u0090µ\u0089\u0012+åàv¦\b ` ÿY\u0081s\u001d\u0011\u0085gôÁqiÙÑ_\r\u0081`áNÀ`M\u000fp@xb\u0088¹óøKn\u0003Ñü\\5\nÌ\u0002\u0002\u0090¥y%£¼J\u001cT\u009f,äÜÈ\u0016Cj?PH+è\u0082W7](a¦V\u0094¾c\u0006U¿\u0007Ýà\u0003\u0094DØ\u0092\nó\f\\\u001eý\u001cð¾\u0017\u0005\u001a]1+tûFÑ÷Ç&:\u0006m\u0084$ù@à\u0087Ò\u0013é@ºþO\u0004ÊF'\u009a\u000bä\u0094\u0001ènÖÝ\u008a\u0000G\u001b\u000eSÔñ\u0088Àµ£EF:\u0001´lË\u0012¨ÕÌ%r\u001dYò{\u001fàÒ¦ ®O\u0082$\u0011ì\u009cº\u0095ú\u0097Ð¯Ï\u001c8gK7y¡R\t°õ·oz½åf\u0098\u0007\u009c73G\u0091ÄÉ\u000bé\u0096¦\u0091e\u00adø_rz'\bÃóÙ¯·©Zv\u0004¥\u0086Ø[\nùD¤Xq`¿\u0080ï.\u000bØ\u0093e(\rÌå¡çc1"
         .length();
      char var9 = 15;
      int var17 = -1;

      label71:
      while (true) {
         byte var10000 = 16;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label66: {
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
                     break label66;
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
                        var65 = 32;
                        break;
                     case 1:
                        var65 = 55;
                        break;
                     case 2:
                        var65 = 9;
                        break;
                     case 3:
                        var65 = 74;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 95;
                        break;
                     default:
                        var65 = 55;
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
                     b = new String[27];
                     long var1 = 4934584376210905015L;
                     long[] var0 = new long[9];
                     int var4 = 0;
                     String var5 = "GÀ×mz>PgC'+cz>W³ô\u0004\u0082\u0006z?Ç·»È]®z>W²½WÂ¾\u007f\u0018\u000b·\u00039 Dz>Wçy&\u009eÃz>W½";
                     int var6 = "GÀ×mz>PgC'+cz>W³ô\u0004\u0082\u0006z?Ç·»È]®z>W²½WÂ¾\u007f\u0018\u000b·\u00039 Dz>Wçy&\u009eÃz>W½".length();
                     byte var3 = 0;

                     label45:
                     while (true) {
                        byte var26 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var26, var3).getBytes("ISO-8859-1");
                        long[] var19 = var0;
                        int var27 = var4++;
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
                           long var54 = var37 ^ var1;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var3 >= var6) {
                                    Registry.lookupField(222883478649268280L).setInt(null, (int)var0[0]);
                                    Registry.lookupField(413132319533195410L).setBoolean(null, false);
                                    Registry.lookupField(321135272909391269L).set(null, a(23155, 29485));
                                    Registry.lookupField(279993414668031362L)
                                       .set(null, (String)Registry.lookupField(321135272909391269L).get(null) + a(23160, 9063));
                                    Registry.lookupField(473855244483806616L)
                                       .set(null, (String)Registry.lookupField(321135272909391269L).get(null) + a(23143, 23546));
                                    Registry.lookupField(446994926428474059L)
                                       .set(null, (String)Registry.lookupField(321135272909391269L).get(null) + a(23164, -2426));
                                    Registry.lookupField(347525510598802164L).setInt(null, 1);
                                    Registry.lookupField(330947765844496420L).set(null, a(23163, 5725));
                                    Registry.lookupField(512261197150171295L).setInt(null, (int)var0[4]);
                                    Registry.lookupField(327550303567808343L).setInt(null, (int)var0[7]);
                                    Registry.lookupField(311768198477767120L).set(null, a(23140, -29563));
                                    Registry.lookupField(469230216286842026L).setInt(null, (int)var0[5]);
                                    Registry.lookupField(378649428550991485L).setBoolean(null, true);
                                    Registry.lookupField(489463897050594906L).setInt(null, (int)var0[1]);
                                    Registry.lookupField(258191693237450664L).setInt(null, (int)var0[2]);
                                    Registry.lookupField(341315699110986526L).setInt(null, -1);
                                    Registry.lookupField(130436548453706137L).setInt(null, (int)var0[3]);
                                    Registry.lookupField(611678237881470112L).setInt(null, (int)var0[6]);
                                    Registry.lookupField(159143763483921134L).set(null, a(23152, -10535));
                                    Registry.lookupField(322398614556294006L).set(null, "");
                                    Registry.lookupField(417253634927399276L).set(null, "");
                                    Registry.lookupField(535740206436684870L).setInt(null, 1);
                                    Registry.lookupField(470482756518360500L).set(null, a(23137, -9808));
                                    Registry.lookupField(299938657189986806L).setInt(null, (int)var0[8]);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var3 < var6) {
                                    continue label45;
                                 }

                                 var5 = "J`ËÞz>½×o½\u001c\u000ez>W¢";
                                 var6 = "J`ËÞz>½×o½\u001c\u000ez>W¢".length();
                                 var3 = 0;
                           }

                           byte var28 = var3;
                           var3 += 8;
                           var7 = var5.substring(var28, var3).getBytes("ISO-8859-1");
                           var19 = var0;
                           var27 = var4++;
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
                     continue label71;
                  }

                  var10 = "À\u0084QS\u0014\u0002ùþã*ÜfÇ\u0092x¸Z\u0012\n\u0080\u0093¨~N´P\u0090hOî·¡Åw0ü`u}©ì7ùÝ|&e÷\u0097Ö2\\";
                  var12 = "À\u0084QS\u0014\u0002ùþã*ÜfÇ\u0092x¸Z\u0012\n\u0080\u0093¨~N´P\u0090hOî·¡Åw0ü`u}©ì7ùÝ|&e÷\u0097Ö2\\".length();
                  var9 = '\t';
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





