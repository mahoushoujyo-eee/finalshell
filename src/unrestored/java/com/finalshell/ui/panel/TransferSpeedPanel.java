package com.finalshell.ui.panel;

import com.finalshell.core.KV;
import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.SpeedTestFrame;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class TransferSpeedPanel extends JPanel {
   public Lv4_2 U;
   public boolean F;
   public Kz_4 w;
   public JLabel g;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public TransferSpeedPanel(Lv4_2 var1, boolean var2) {
   super();
      String var6;
      label17: {
         Registry.lookupField(411215649304430257L).setBoolean(this, var2);
         SpeedTestFrame.K();
         long var8 = 544833948968310431L;
         Ref.s(544833948968310431L, var1, var8);
         this.setOpaque(false);
         this.setLayout(new MigLayout(a(21198, -30867), a(21197, 8180), a(21193, -3298)));
         Kz_4 var10003 = new Kz_4(var2);
         long var10 = 361072334695515325L;
         Kz_4 var9 = var10003;
         Ref.s(361072334695515325L, var9, var10);
         Object var11 = 361072334695515325L;
         this.add((Kz_4)Ref.g(361072334695515325L, var11), a(21191, -20096));
         JPanel var4 = new JPanel(new MigLayout(a(21196, 3767), "", ""));
         this.add(var4, a(21192, 29999));
         Font var5 = new Font((String)Registry.lookupField(523981883291410284L).get(null), 0, a(8016, 8402785199904046631L));
         JLabel var10005 = new JLabel();
         long var14 = 586386105516248075L;
         JLabel var13 = var10005;
         Ref.s(586386105516248075L, var13, var14);
         Object var15 = 586386105516248075L;
         ((JLabel)Ref.g(586386105516248075L, var15)).setOpaque(false);
         Object var17 = 586386105516248075L;
         ((JLabel)Ref.g(586386105516248075L, var17)).setFont(var5);
         Object var19 = 586386105516248075L;
         ((JLabel)Ref.g(586386105516248075L, var19))
            .setForeground(new Color(a(26197, 4579579712248268577L), a(16658, 2991183659115765860L), a(16658, 2991183659115765860L)));
         Object var21 = 586386105516248075L;
         this.add((JLabel)Ref.g(586386105516248075L, var21), a(21187, 18061));
         var6 = "";
         if (this != null) {
            if (var2) {
               var6 = a(21194, 29974);
               var4.setBackground(new Color(a(2098, 352142080914794823L), a(3671, 7770594135658868519L), a(13646, 8952030729298547772L)));
               if (this != null) {
                  break label17;
               }

               Ky4.K(new String[1]);
            }

            var6 = a(21199, 15988);
         }

         var4.setBackground(new Color(a(19654, 361565837847915957L), a(7982, 3157696384233520735L), a(15237, 1465187613935246077L)));
      }

      Object var23 = 586386105516248075L;
      ((JLabel)Ref.g(586386105516248075L, var23)).setText(var6);
   }

   public void v(KV var1) {
      Long var37;
      Long var40;
      String var29;
      label84: {
         Ky4[] var10000 = SpeedTestFrame.K();
         var29 = "";
         Ky4[] var2 = var10000;
         KV var30 = Registry.lookupField(411215649304430257L).getBoolean(this);
         if (var2 != null) {
            if (var30 != null) {
               ArrayList var10001 = (ArrayList)(Registry.emptyArgs());
               long var5 = 342518482064718676L;
               Object var4 = var10001;
               var10001 = Ref.h(342518482064718676L, var4, var5);

               try {
                  var10001 = (ArrayList)var10001;
               } catch (InvocationTargetException var28) {
                  throw var28.getTargetException();
               }

               if (var10001.size() >= Registry.lookupField(443908032455270008L).getInt(null) - 2) {
                  return;
               }

               new StringBuilder().append(a(21190, -7171));
               Object var10003 = Registry.emptyArgs();
               long var7 = 398587758596300573L;
               Object var6 = var10003;
               var10003 = Ref.h(398587758596300573L, var6, var7);

               try {
                  var40 = (Long)var10003;
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }

               var10003 = Registry.e(var40);
               long var8 = 408529162510360196L;
               Object var10004 = Ref.h2(408529162510360196L, var8);

               try {
                  var10004 = (String)var10004;
               } catch (InvocationTargetException var26) {
                  throw var26.getTargetException();
               }

               var29 = ((java.lang.StringBuilder)var10003).append((String)var10004).append(a(21189, -9742)).toString();
               if (var2 != null) {
                  break label84;
               }
            }

            var30 = var1;
            ArrayList var33 = Registry.emptyArgs();
            long var11 = 152136701106434889L;
            Object var10 = var33;
            var33 = Ref.h(152136701106434889L, var10, var11);

            try {
               var33 = (ArrayList)var33;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            var33.size();
         }

         if (var30 >= Registry.lookupField(443908032455270008L).getInt(null) - 2) {
            return;
         }

         new StringBuilder().append(a(21188, -20064));
         Object var10002 = Registry.emptyArgs();
         long var13 = 347022309252191680L;
         Object var12 = var10002;
         var10002 = Ref.h(347022309252191680L, var12, var13);

         try {
            var37 = (Long)var10002;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         var10002 = Registry.e(var37);
         long var14 = 408529162510360196L;
         Object var42 = Ref.h2(408529162510360196L, var14);

         try {
            var42 = (String)var42;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         var29 = ((java.lang.StringBuilder)var10002).append((String)var42).append(a(21195, -32714)).toString();
      }

      Object var16 = 586386105516248075L;
      ((JLabel)Ref.g(586386105516248075L, var16)).setText(var29);
      Object var18 = 361072334695515325L;
      Ref.g(361072334695515325L, var18);
      Object[] var10005 = Registry.packArgs(var1);
      long var21 = 177465092308172989L;
      Object[] var20 = var10005;
      Ref.h(177465092308172989L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 21199) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 142;
               break;
            case 1:
               var10000 = 133;
               break;
            case 2:
               var10000 = 46;
               break;
            case 3:
               var10000 = 20;
               break;
            case 4:
               var10000 = 55;
               break;
            case 5:
               var10000 = 215;
               break;
            case 6:
               var10000 = 84;
               break;
            case 7:
               var10000 = 103;
               break;
            case 8:
               var10000 = 0;
               break;
            case 9:
               var10000 = 36;
               break;
            case 10:
               var10000 = 50;
               break;
            case 11:
               var10000 = 119;
               break;
            case 12:
               var10000 = 149;
               break;
            case 13:
               var10000 = 195;
               break;
            case 14:
               var10000 = 79;
               break;
            case 15:
               var10000 = 57;
               break;
            case 16:
               var10000 = 96;
               break;
            case 17:
               var10000 = 17;
               break;
            case 18:
               var10000 = 137;
               break;
            case 19:
               var10000 = 68;
               break;
            case 20:
               var10000 = 75;
               break;
            case 21:
               var10000 = 208;
               break;
            case 22:
               var10000 = 91;
               break;
            case 23:
               var10000 = 74;
               break;
            case 24:
               var10000 = 127;
               break;
            case 25:
               var10000 = 136;
               break;
            case 26:
               var10000 = 67;
               break;
            case 27:
               var10000 = 202;
               break;
            case 28:
               var10000 = 71;
               break;
            case 29:
               var10000 = 161;
               break;
            case 30:
               var10000 = 246;
               break;
            case 31:
               var10000 = 141;
               break;
            case 32:
               var10000 = 23;
               break;
            case 33:
               var10000 = 25;
               break;
            case 34:
               var10000 = 34;
               break;
            case 35:
               var10000 = 130;
               break;
            case 36:
               var10000 = 32;
               break;
            case 37:
               var10000 = 227;
               break;
            case 38:
               var10000 = 128;
               break;
            case 39:
               var10000 = 234;
               break;
            case 40:
               var10000 = 218;
               break;
            case 41:
               var10000 = 221;
               break;
            case 42:
               var10000 = 203;
               break;
            case 43:
               var10000 = 110;
               break;
            case 44:
               var10000 = 83;
               break;
            case 45:
               var10000 = 111;
               break;
            case 46:
               var10000 = 179;
               break;
            case 47:
               var10000 = 163;
               break;
            case 48:
               var10000 = 220;
               break;
            case 49:
               var10000 = 63;
               break;
            case 50:
               var10000 = 16;
               break;
            case 51:
               var10000 = 105;
               break;
            case 52:
               var10000 = 210;
               break;
            case 53:
               var10000 = 66;
               break;
            case 54:
               var10000 = 232;
               break;
            case 55:
               var10000 = 211;
               break;
            case 56:
               var10000 = 207;
               break;
            case 57:
               var10000 = 106;
               break;
            case 58:
               var10000 = 168;
               break;
            case 59:
               var10000 = 191;
               break;
            case 60:
               var10000 = 95;
               break;
            case 61:
               var10000 = 6;
               break;
            case 62:
               var10000 = 214;
               break;
            case 63:
               var10000 = 129;
               break;
            case 64:
               var10000 = 153;
               break;
            case 65:
               var10000 = 10;
               break;
            case 66:
               var10000 = 213;
               break;
            case 67:
               var10000 = 78;
               break;
            case 68:
               var10000 = 146;
               break;
            case 69:
               var10000 = 206;
               break;
            case 70:
               var10000 = 11;
               break;
            case 71:
               var10000 = 198;
               break;
            case 72:
               var10000 = 7;
               break;
            case 73:
               var10000 = 219;
               break;
            case 74:
               var10000 = 185;
               break;
            case 75:
               var10000 = 35;
               break;
            case 76:
               var10000 = 160;
               break;
            case 77:
               var10000 = 122;
               break;
            case 78:
               var10000 = 157;
               break;
            case 79:
               var10000 = 140;
               break;
            case 80:
               var10000 = 166;
               break;
            case 81:
               var10000 = 209;
               break;
            case 82:
               var10000 = 62;
               break;
            case 83:
               var10000 = 121;
               break;
            case 84:
               var10000 = 250;
               break;
            case 85:
               var10000 = 114;
               break;
            case 86:
               var10000 = 29;
               break;
            case 87:
               var10000 = 241;
               break;
            case 88:
               var10000 = 38;
               break;
            case 89:
               var10000 = 147;
               break;
            case 90:
               var10000 = 120;
               break;
            case 91:
               var10000 = 56;
               break;
            case 92:
               var10000 = 85;
               break;
            case 93:
               var10000 = 108;
               break;
            case 94:
               var10000 = 201;
               break;
            case 95:
               var10000 = 8;
               break;
            case 96:
               var10000 = 239;
               break;
            case 97:
               var10000 = 126;
               break;
            case 98:
               var10000 = 138;
               break;
            case 99:
               var10000 = 45;
               break;
            case 100:
               var10000 = 59;
               break;
            case 101:
               var10000 = 150;
               break;
            case 102:
               var10000 = 72;
               break;
            case 103:
               var10000 = 19;
               break;
            case 104:
               var10000 = 30;
               break;
            case 105:
               var10000 = 231;
               break;
            case 106:
               var10000 = 174;
               break;
            case 107:
               var10000 = 143;
               break;
            case 108:
               var10000 = 93;
               break;
            case 109:
               var10000 = 22;
               break;
            case 110:
               var10000 = 115;
               break;
            case 111:
               var10000 = 65;
               break;
            case 112:
               var10000 = 199;
               break;
            case 113:
               var10000 = 173;
               break;
            case 114:
               var10000 = 92;
               break;
            case 115:
               var10000 = 175;
               break;
            case 116:
               var10000 = 244;
               break;
            case 117:
               var10000 = 104;
               break;
            case 118:
               var10000 = 9;
               break;
            case 119:
               var10000 = 189;
               break;
            case 120:
               var10000 = 33;
               break;
            case 121:
               var10000 = 243;
               break;
            case 122:
               var10000 = 216;
               break;
            case 123:
               var10000 = 182;
               break;
            case 124:
               var10000 = 64;
               break;
            case 125:
               var10000 = 51;
               break;
            case 126:
               var10000 = 2;
               break;
            case 127:
               var10000 = 159;
               break;
            case 128:
               var10000 = 194;
               break;
            case 129:
               var10000 = 151;
               break;
            case 130:
               var10000 = 124;
               break;
            case 131:
               var10000 = 87;
               break;
            case 132:
               var10000 = 230;
               break;
            case 133:
               var10000 = 144;
               break;
            case 134:
               var10000 = 205;
               break;
            case 135:
               var10000 = 24;
               break;
            case 136:
               var10000 = 44;
               break;
            case 137:
               var10000 = 76;
               break;
            case 138:
               var10000 = 247;
               break;
            case 139:
               var10000 = 176;
               break;
            case 140:
               var10000 = 200;
               break;
            case 141:
               var10000 = 248;
               break;
            case 142:
               var10000 = 54;
               break;
            case 143:
               var10000 = 152;
               break;
            case 144:
               var10000 = 60;
               break;
            case 145:
               var10000 = 139;
               break;
            case 146:
               var10000 = 14;
               break;
            case 147:
               var10000 = 255;
               break;
            case 148:
               var10000 = 15;
               break;
            case 149:
               var10000 = 181;
               break;
            case 150:
               var10000 = 156;
               break;
            case 151:
               var10000 = 224;
               break;
            case 152:
               var10000 = 31;
               break;
            case 153:
               var10000 = 145;
               break;
            case 154:
               var10000 = 242;
               break;
            case 155:
               var10000 = 109;
               break;
            case 156:
               var10000 = 132;
               break;
            case 157:
               var10000 = 18;
               break;
            case 158:
               var10000 = 43;
               break;
            case 159:
               var10000 = 235;
               break;
            case 160:
               var10000 = 212;
               break;
            case 161:
               var10000 = 225;
               break;
            case 162:
               var10000 = 180;
               break;
            case 163:
               var10000 = 107;
               break;
            case 164:
               var10000 = 28;
               break;
            case 165:
               var10000 = 169;
               break;
            case 166:
               var10000 = 41;
               break;
            case 167:
               var10000 = 53;
               break;
            case 168:
               var10000 = 98;
               break;
            case 169:
               var10000 = 27;
               break;
            case 170:
               var10000 = 102;
               break;
            case 171:
               var10000 = 251;
               break;
            case 172:
               var10000 = 148;
               break;
            case 173:
               var10000 = 82;
               break;
            case 174:
               var10000 = 123;
               break;
            case 175:
               var10000 = 12;
               break;
            case 176:
               var10000 = 223;
               break;
            case 177:
               var10000 = 186;
               break;
            case 178:
               var10000 = 217;
               break;
            case 179:
               var10000 = 73;
               break;
            case 180:
               var10000 = 183;
               break;
            case 181:
               var10000 = 171;
               break;
            case 182:
               var10000 = 26;
               break;
            case 183:
               var10000 = 116;
               break;
            case 184:
               var10000 = 86;
               break;
            case 185:
               var10000 = 172;
               break;
            case 186:
               var10000 = 222;
               break;
            case 187:
               var10000 = 5;
               break;
            case 188:
               var10000 = 229;
               break;
            case 189:
               var10000 = 135;
               break;
            case 190:
               var10000 = 167;
               break;
            case 191:
               var10000 = 49;
               break;
            case 192:
               var10000 = 101;
               break;
            case 193:
               var10000 = 4;
               break;
            case 194:
               var10000 = 245;
               break;
            case 195:
               var10000 = 188;
               break;
            case 196:
               var10000 = 226;
               break;
            case 197:
               var10000 = 192;
               break;
            case 198:
               var10000 = 77;
               break;
            case 199:
               var10000 = 197;
               break;
            case 200:
               var10000 = 90;
               break;
            case 201:
               var10000 = 228;
               break;
            case 202:
               var10000 = 37;
               break;
            case 203:
               var10000 = 134;
               break;
            case 204:
               var10000 = 233;
               break;
            case 205:
               var10000 = 69;
               break;
            case 206:
               var10000 = 237;
               break;
            case 207:
               var10000 = 253;
               break;
            case 208:
               var10000 = 165;
               break;
            case 209:
               var10000 = 42;
               break;
            case 210:
               var10000 = 204;
               break;
            case 211:
               var10000 = 170;
               break;
            case 212:
               var10000 = 52;
               break;
            case 213:
               var10000 = 3;
               break;
            case 214:
               var10000 = 118;
               break;
            case 215:
               var10000 = 117;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 58;
               break;
            case 218:
               var10000 = 21;
               break;
            case 219:
               var10000 = 94;
               break;
            case 220:
               var10000 = 1;
               break;
            case 221:
               var10000 = 162;
               break;
            case 222:
               var10000 = 99;
               break;
            case 223:
               var10000 = 249;
               break;
            case 224:
               var10000 = 131;
               break;
            case 225:
               var10000 = 47;
               break;
            case 226:
               var10000 = 184;
               break;
            case 227:
               var10000 = 196;
               break;
            case 228:
               var10000 = 178;
               break;
            case 229:
               var10000 = 89;
               break;
            case 230:
               var10000 = 193;
               break;
            case 231:
               var10000 = 112;
               break;
            case 232:
               var10000 = 158;
               break;
            case 233:
               var10000 = 155;
               break;
            case 234:
               var10000 = 88;
               break;
            case 235:
               var10000 = 164;
               break;
            case 236:
               var10000 = 177;
               break;
            case 237:
               var10000 = 187;
               break;
            case 238:
               var10000 = 97;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 13;
               break;
            case 241:
               var10000 = 190;
               break;
            case 242:
               var10000 = 80;
               break;
            case 243:
               var10000 = 240;
               break;
            case 244:
               var10000 = 252;
               break;
            case 245:
               var10000 = 236;
               break;
            case 246:
               var10000 = 154;
               break;
            case 247:
               var10000 = 70;
               break;
            case 248:
               var10000 = 113;
               break;
            case 249:
               var10000 = 39;
               break;
            case 250:
               var10000 = 40;
               break;
            case 251:
               var10000 = 125;
               break;
            case 252:
               var10000 = 81;
               break;
            case 253:
               var10000 = 48;
               break;
            case 254:
               var10000 = 254;
               break;
            default:
               var10000 = 238;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8560;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long var37;
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "丹俕èÈF Ú\u0002\u000f Ý\u0097\u000bÉæV¡²§&¢ÿå¨\b¹x\u0093ÔK§qÎ\u001bÇ«kÅV?¥\u0099ÜÓé,\u0004tÙµZä\u009f\u008bíà\u0090ÙÙ¯\u008e\u0002øb\b丙返Í\u001eâúNY\b+\\ÁP\u000178Ü\u0011\u0000Ï@Äô]îÞ7U;8\u001bÓ\u008fÐÝ\u0004\u008f§\u00adÎ\u0004亥輩Z¡\u0002ÿ\u0084";
      int var12 = "丹俕èÈF Ú\u0002\u000f Ý\u0097\u000bÉæV¡²§&¢ÿå¨\b¹x\u0093ÔK§qÎ\u001bÇ«kÅV?¥\u0099ÜÓé,\u0004tÙµZä\u009f\u008bíà\u0090ÙÙ¯\u008e\u0002øb\b丙返Í\u001eâúNY\b+\\ÁP\u000178Ü\u0011\u0000Ï@Äô]îÞ7U;8\u001bÓ\u008fÐÝ\u0004\u008f§\u00adÎ\u0004亥輩Z¡\u0002ÿ\u0084"
         .length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 93;
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
                        var65 = 99;
                        break;
                     case 1:
                        var65 = 127;
                        break;
                     case 2:
                        var65 = 62;
                        break;
                     case 3:
                        var65 = 111;
                        break;
                     case 4:
                        var65 = 99;
                        break;
                     case 5:
                        var65 = 38;
                        break;
                     default:
                        var65 = 47;
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
                     b = new String[13];
                     long var0 = 4246878247461592771L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "¹`\u0003»Íæ1*þVnKz\u008e T\u0015t\u0003MVp\u008aBH8§×_\u009fs\u0099\u0000®\"\u008añlÙÞ«´Ñ\u009f»,·9ðáI\u0087CÄ~\u009b";
                     int var5 = "¹`\u0003»Íæ1*þVnKz\u008e T\u0015t\u0003MVp\u008aBH8§×_\u009fs\u0099\u0000®\"\u008añlÙÞ«´Ñ\u009f»,·9ðáI\u0087CÄ~\u009b"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56
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
                                    c = var6;
                                    d = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "GBÚ\u001ftx ê\u008dàA\u0010Ù¡\u0084\u0086";
                                 var5 = "GBÚ\u001ftx ê\u008dàA\u0010Ù¡\u0084\u0086".length();
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

                  var10 = "亩侎!x\f)\u0087~Ûl6#\r²c=m";
                  var12 = "亩侎!x\f)\u0087~Ûl6#\r²c=m".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 40;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





