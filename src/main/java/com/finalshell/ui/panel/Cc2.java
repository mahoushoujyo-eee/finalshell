package com.finalshell.ui.panel;

import com.finalshell.core.J2_2;
import com.finalshell.core.L9;
import com.finalshell.core.NY;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.F9;
import com.finalshell.task.K62;
import com.finalshell.task.M_;
import com.finalshell.task.Nt2;
import com.finalshell.task.WD;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class Cc2 extends F8 {
   public String A;
   public String z;
   public int a;
   public JTextArea h;
   public String D;
   public static String[] b;
   public static String[] d;
   public static long[] e;
   public static Integer[] g;

   public Cc2(String var1, String var2, int var3) {
      super();
      Object[] var33;
      long var6 = 210912483329447649L;
      String var5 = "";
      Ref.s(210912483329447649L, var5, var6);
      long var8 = 554544078061403266L;
      Ref.s(554544078061403266L, var1, var8);
      long var10 = 331777772926621384L;
      Ref.s(331777772926621384L, var2, var10);
      Registry.lookupField(187578027657145904L).setInt(this, var3);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-29621, -3663), a(-29620, 14653), a(-29623, -21292)));
      this.setPreferredSize(new Dimension(b(1192, 7793266391222445068L), b(10257, 2837605854575347895L)));
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 176588753192518743L;
      Object[] var11 = var10004;
      Ref.h(176588753192518743L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      J2_2 var10005 = new J2_2(this);
      long var14 = 421079234105022764L;
      J2_2 var13 = var10005;
      Ref.s(421079234105022764L, var13, var14);
      Object var15 = 421079234105022764L;
      Registry.packArgs(Ref.g(421079234105022764L, var15), false);
      long var17 = 370149877875067536L;
      Ref.h2(370149877875067536L, var17);
      Object var19 = 421079234105022764L;
      ((JTextArea)Ref.g(421079234105022764L, var19))
         .setForeground(new Color(b(22316, 9125120365844608905L), b(5790, 4884306411723290169L), b(5790, 4884306411723290169L)));
      Object var21 = 421079234105022764L;
      ((JTextArea)Ref.g(421079234105022764L, var21)).setOpaque(false);
      Object var23 = 421079234105022764L;
      ((JTextArea)Ref.g(421079234105022764L, var23)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object var25 = 421079234105022764L;
      ((JTextArea)Ref.g(421079234105022764L, var25)).setEditable(false);
      JScrollPane var10012;
      Object var27 = 421079234105022764L;
      // [VF-super] super((JTextArea)Ref.g(421079234105022764L, var27));
      JScrollPane var4 = var10012;
      var4.setOpaque(false);
      var4.getViewport().setOpaque(false);
      this.add(var4, a(-29617, 32725));
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10013 = Registry.packArgs(new K62(this));
      long var30 = 434592463220957006L;
      Object[] var29 = var10013;
      Ref.h(434592463220957006L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10014 = Registry.packArgs(new M_(this));
      long var32 = 434592463220957006L;
      Object[] var31 = var10014;
      Ref.h(434592463220957006L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10015 = Registry.packArgs(new F9(this));
      long var34 = 434592463220957006L;
      var33 = var10015;
      Ref.h(434592463220957006L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10016 = Registry.packArgs(new Nt2(this));
      long var36 = 434592463220957006L;
      Object[] var35 = var10016;
      Ref.h(434592463220957006L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10017 = Registry.packArgs(new WD(this));
      long var38 = 434592463220957006L;
      Object[] var37 = var10017;
      Ref.h(434592463220957006L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   public void u(String var1) {
      L9.X();
      Object var6 = 331777772926621384L;
      Object[] var10002 = Registry.packArgs(this, Ref.g(331777772926621384L, var6));
      long var8 = 405719060143778520L;
      Object var10003 = Ref.h2(405719060143778520L, var8);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      String var3 = (String)var10003;
      Object[] var2 = var10002;
      String var21 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var21 = var3.toLowerCase();
      }

      String var4 = var21;
      String var22 = var4.contains(a(-29624, 21488));
      if (var2 == null) {
         if (var22 == null) {
            return;
         }

         var22 = var4.contains(a(-29618, 14278));
      }

      if (var2 == null) {
         if (var22 == null) {
            return;
         }

         var22 = var4.contains(a(-29625, 6854));
      }

      if (var2 == null) {
         if (var22 == null) {
            return;
         }

         var22 = var4.contains(a(-29619, 31946));
      }

      if (var2 == null) {
         if (var22 == null) {
            return;
         }

         var22 = var4.contains(a(-29626, -18639));
      }

      String var10005;
      if (var2 == null) {
         if (var22 == null) {
            return;
         }

         var22 = var3;
         Object var10 = 210912483329447649L;
         var10005 = (String)var10;
         this.equals((String)Ref.g(210912483329447649L, var10));
      }

      label83: {
         if (var2 == null) {
            if (var22 == null) {
               return;
            }

            if (var2 != null) {
               break label83;
            }

            var3.length();
         }

         Object var12 = 210912483329447649L;
         if (!(this > ((String)Ref.g(210912483329447649L, var12)).length())) {
            return;
         }

         long var15 = 210912483329447649L;
         Ref.s(210912483329447649L, var3, var15);
         new StringBuilder().append(a(-29622, 10277));
         Object var16 = 331777772926621384L;
         var10005 = this.append((String)Ref.g(331777772926621384L, var16)).append("\n").append(var3).toString();
      }

      String var5 = var10005;
      Object var18 = 421079234105022764L;
      ((JTextArea)Ref.g(421079234105022764L, var18)).setText(var5);
   }

   public void w() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 399585344452154517L;
      Object[] var5 = var10002;
      Ref.h(399585344452154517L, var5, var6);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var8 = 149968465491171480L;
      Object var7 = var10003;
      var10003 = Ref.h(149968465491171480L, var7, var8);

      try {
         var10003 = (NY)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      NY var1 = var10003;
      byte var15 = 2;
      Color var10008 = (Color)(Registry.emptyArgs());
      long var10 = 345089686683358688L;
      Object var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
      this.setBorder(null);
   }

   @Override
   public String getName() {
      Object var1 = 554544078061403266L;
      return (String)Ref.g(554544078061403266L, var1);
   }

   @Override
   public void setName(String var1) {
      long var3 = 554544078061403266L;
      Ref.s(554544078061403266L, var1, var3);
   }

   public String i() {
      Object var1 = 331777772926621384L;
      return (String)Ref.g(331777772926621384L, var1);
   }

   public void S(String var1) {
      long var3 = 331777772926621384L;
      Ref.s(331777772926621384L, var1, var3);
   }

   public int L() {
      return Registry.lookupField(187578027657145904L).getInt(this);
   }

   public void F(int var1) {
      Registry.lookupField(187578027657145904L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -29617) & 65535;
      if (d[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 48;
               break;
            case 1:
               var10000 = 179;
               break;
            case 2:
               var10000 = 137;
               break;
            case 3:
               var10000 = 210;
               break;
            case 4:
               var10000 = 168;
               break;
            case 5:
               var10000 = 148;
               break;
            case 6:
               var10000 = 152;
               break;
            case 7:
               var10000 = 128;
               break;
            case 8:
               var10000 = 160;
               break;
            case 9:
               var10000 = 217;
               break;
            case 10:
               var10000 = 141;
               break;
            case 11:
               var10000 = 213;
               break;
            case 12:
               var10000 = 37;
               break;
            case 13:
               var10000 = 64;
               break;
            case 14:
               var10000 = 60;
               break;
            case 15:
               var10000 = 178;
               break;
            case 16:
               var10000 = 22;
               break;
            case 17:
               var10000 = 154;
               break;
            case 18:
               var10000 = 236;
               break;
            case 19:
               var10000 = 171;
               break;
            case 20:
               var10000 = 2;
               break;
            case 21:
               var10000 = 110;
               break;
            case 22:
               var10000 = 23;
               break;
            case 23:
               var10000 = 211;
               break;
            case 24:
               var10000 = 25;
               break;
            case 25:
               var10000 = 150;
               break;
            case 26:
               var10000 = 177;
               break;
            case 27:
               var10000 = 212;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 226;
               break;
            case 30:
               var10000 = 123;
               break;
            case 31:
               var10000 = 194;
               break;
            case 32:
               var10000 = 162;
               break;
            case 33:
               var10000 = 105;
               break;
            case 34:
               var10000 = 27;
               break;
            case 35:
               var10000 = 129;
               break;
            case 36:
               var10000 = 126;
               break;
            case 37:
               var10000 = 144;
               break;
            case 38:
               var10000 = 8;
               break;
            case 39:
               var10000 = 190;
               break;
            case 40:
               var10000 = 216;
               break;
            case 41:
               var10000 = 192;
               break;
            case 42:
               var10000 = 50;
               break;
            case 43:
               var10000 = 47;
               break;
            case 44:
               var10000 = 28;
               break;
            case 45:
               var10000 = 52;
               break;
            case 46:
               var10000 = 187;
               break;
            case 47:
               var10000 = 240;
               break;
            case 48:
               var10000 = 88;
               break;
            case 49:
               var10000 = 139;
               break;
            case 50:
               var10000 = 181;
               break;
            case 51:
               var10000 = 13;
               break;
            case 52:
               var10000 = 119;
               break;
            case 53:
               var10000 = 248;
               break;
            case 54:
               var10000 = 175;
               break;
            case 55:
               var10000 = 151;
               break;
            case 56:
               var10000 = 66;
               break;
            case 57:
               var10000 = 91;
               break;
            case 58:
               var10000 = 135;
               break;
            case 59:
               var10000 = 203;
               break;
            case 60:
               var10000 = 111;
               break;
            case 61:
               var10000 = 21;
               break;
            case 62:
               var10000 = 230;
               break;
            case 63:
               var10000 = 237;
               break;
            case 64:
               var10000 = 11;
               break;
            case 65:
               var10000 = 251;
               break;
            case 66:
               var10000 = 117;
               break;
            case 67:
               var10000 = 206;
               break;
            case 68:
               var10000 = 57;
               break;
            case 69:
               var10000 = 30;
               break;
            case 70:
               var10000 = 100;
               break;
            case 71:
               var10000 = 247;
               break;
            case 72:
               var10000 = 246;
               break;
            case 73:
               var10000 = 153;
               break;
            case 74:
               var10000 = 44;
               break;
            case 75:
               var10000 = 75;
               break;
            case 76:
               var10000 = 227;
               break;
            case 77:
               var10000 = 238;
               break;
            case 78:
               var10000 = 220;
               break;
            case 79:
               var10000 = 243;
               break;
            case 80:
               var10000 = 53;
               break;
            case 81:
               var10000 = 38;
               break;
            case 82:
               var10000 = 68;
               break;
            case 83:
               var10000 = 224;
               break;
            case 84:
               var10000 = 145;
               break;
            case 85:
               var10000 = 7;
               break;
            case 86:
               var10000 = 242;
               break;
            case 87:
               var10000 = 18;
               break;
            case 88:
               var10000 = 163;
               break;
            case 89:
               var10000 = 225;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 9;
               break;
            case 92:
               var10000 = 198;
               break;
            case 93:
               var10000 = 1;
               break;
            case 94:
               var10000 = 51;
               break;
            case 95:
               var10000 = 208;
               break;
            case 96:
               var10000 = 81;
               break;
            case 97:
               var10000 = 102;
               break;
            case 98:
               var10000 = 120;
               break;
            case 99:
               var10000 = 191;
               break;
            case 100:
               var10000 = 200;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 180;
               break;
            case 103:
               var10000 = 165;
               break;
            case 104:
               var10000 = 89;
               break;
            case 105:
               var10000 = 155;
               break;
            case 106:
               var10000 = 114;
               break;
            case 107:
               var10000 = 169;
               break;
            case 108:
               var10000 = 109;
               break;
            case 109:
               var10000 = 149;
               break;
            case 110:
               var10000 = 65;
               break;
            case 111:
               var10000 = 41;
               break;
            case 112:
               var10000 = 83;
               break;
            case 113:
               var10000 = 223;
               break;
            case 114:
               var10000 = 170;
               break;
            case 115:
               var10000 = 17;
               break;
            case 116:
               var10000 = 185;
               break;
            case 117:
               var10000 = 157;
               break;
            case 118:
               var10000 = 67;
               break;
            case 119:
               var10000 = 197;
               break;
            case 120:
               var10000 = 46;
               break;
            case 121:
               var10000 = 221;
               break;
            case 122:
               var10000 = 86;
               break;
            case 123:
               var10000 = 10;
               break;
            case 124:
               var10000 = 219;
               break;
            case 125:
               var10000 = 94;
               break;
            case 126:
               var10000 = 253;
               break;
            case 127:
               var10000 = 132;
               break;
            case 128:
               var10000 = 254;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 199;
               break;
            case 131:
               var10000 = 134;
               break;
            case 132:
               var10000 = 222;
               break;
            case 133:
               var10000 = 34;
               break;
            case 134:
               var10000 = 215;
               break;
            case 135:
               var10000 = 0;
               break;
            case 136:
               var10000 = 176;
               break;
            case 137:
               var10000 = 239;
               break;
            case 138:
               var10000 = 166;
               break;
            case 139:
               var10000 = 186;
               break;
            case 140:
               var10000 = 59;
               break;
            case 141:
               var10000 = 158;
               break;
            case 142:
               var10000 = 112;
               break;
            case 143:
               var10000 = 229;
               break;
            case 144:
               var10000 = 39;
               break;
            case 145:
               var10000 = 214;
               break;
            case 146:
               var10000 = 72;
               break;
            case 147:
               var10000 = 205;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 12;
               break;
            case 150:
               var10000 = 55;
               break;
            case 151:
               var10000 = 116;
               break;
            case 152:
               var10000 = 40;
               break;
            case 153:
               var10000 = 234;
               break;
            case 154:
               var10000 = 62;
               break;
            case 155:
               var10000 = 77;
               break;
            case 156:
               var10000 = 36;
               break;
            case 157:
               var10000 = 69;
               break;
            case 158:
               var10000 = 104;
               break;
            case 159:
               var10000 = 80;
               break;
            case 160:
               var10000 = 252;
               break;
            case 161:
               var10000 = 188;
               break;
            case 162:
               var10000 = 73;
               break;
            case 163:
               var10000 = 173;
               break;
            case 164:
               var10000 = 3;
               break;
            case 165:
               var10000 = 142;
               break;
            case 166:
               var10000 = 4;
               break;
            case 167:
               var10000 = 49;
               break;
            case 168:
               var10000 = 201;
               break;
            case 169:
               var10000 = 127;
               break;
            case 170:
               var10000 = 241;
               break;
            case 171:
               var10000 = 147;
               break;
            case 172:
               var10000 = 35;
               break;
            case 173:
               var10000 = 189;
               break;
            case 174:
               var10000 = 167;
               break;
            case 175:
               var10000 = 61;
               break;
            case 176:
               var10000 = 143;
               break;
            case 177:
               var10000 = 93;
               break;
            case 178:
               var10000 = 156;
               break;
            case 179:
               var10000 = 107;
               break;
            case 180:
               var10000 = 118;
               break;
            case 181:
               var10000 = 122;
               break;
            case 182:
               var10000 = 250;
               break;
            case 183:
               var10000 = 92;
               break;
            case 184:
               var10000 = 228;
               break;
            case 185:
               var10000 = 54;
               break;
            case 186:
               var10000 = 138;
               break;
            case 187:
               var10000 = 15;
               break;
            case 188:
               var10000 = 101;
               break;
            case 189:
               var10000 = 231;
               break;
            case 190:
               var10000 = 133;
               break;
            case 191:
               var10000 = 235;
               break;
            case 192:
               var10000 = 136;
               break;
            case 193:
               var10000 = 195;
               break;
            case 194:
               var10000 = 31;
               break;
            case 195:
               var10000 = 84;
               break;
            case 196:
               var10000 = 193;
               break;
            case 197:
               var10000 = 71;
               break;
            case 198:
               var10000 = 76;
               break;
            case 199:
               var10000 = 42;
               break;
            case 200:
               var10000 = 164;
               break;
            case 201:
               var10000 = 87;
               break;
            case 202:
               var10000 = 244;
               break;
            case 203:
               var10000 = 115;
               break;
            case 204:
               var10000 = 14;
               break;
            case 205:
               var10000 = 96;
               break;
            case 206:
               var10000 = 74;
               break;
            case 207:
               var10000 = 172;
               break;
            case 208:
               var10000 = 97;
               break;
            case 209:
               var10000 = 218;
               break;
            case 210:
               var10000 = 202;
               break;
            case 211:
               var10000 = 174;
               break;
            case 212:
               var10000 = 32;
               break;
            case 213:
               var10000 = 20;
               break;
            case 214:
               var10000 = 58;
               break;
            case 215:
               var10000 = 131;
               break;
            case 216:
               var10000 = 29;
               break;
            case 217:
               var10000 = 124;
               break;
            case 218:
               var10000 = 24;
               break;
            case 219:
               var10000 = 103;
               break;
            case 220:
               var10000 = 249;
               break;
            case 221:
               var10000 = 245;
               break;
            case 222:
               var10000 = 108;
               break;
            case 223:
               var10000 = 43;
               break;
            case 224:
               var10000 = 56;
               break;
            case 225:
               var10000 = 159;
               break;
            case 226:
               var10000 = 5;
               break;
            case 227:
               var10000 = 78;
               break;
            case 228:
               var10000 = 85;
               break;
            case 229:
               var10000 = 79;
               break;
            case 230:
               var10000 = 161;
               break;
            case 231:
               var10000 = 209;
               break;
            case 232:
               var10000 = 19;
               break;
            case 233:
               var10000 = 130;
               break;
            case 234:
               var10000 = 125;
               break;
            case 235:
               var10000 = 182;
               break;
            case 236:
               var10000 = 33;
               break;
            case 237:
               var10000 = 183;
               break;
            case 238:
               var10000 = 204;
               break;
            case 239:
               var10000 = 233;
               break;
            case 240:
               var10000 = 6;
               break;
            case 241:
               var10000 = 82;
               break;
            case 242:
               var10000 = 63;
               break;
            case 243:
               var10000 = 16;
               break;
            case 244:
               var10000 = 90;
               break;
            case 245:
               var10000 = 232;
               break;
            case 246:
               var10000 = 121;
               break;
            case 247:
               var10000 = 106;
               break;
            case 248:
               var10000 = 255;
               break;
            case 249:
               var10000 = 95;
               break;
            case 250:
               var10000 = 99;
               break;
            case 251:
               var10000 = 196;
               break;
            case 252:
               var10000 = 26;
               break;
            case 253:
               var10000 = 184;
               break;
            case 254:
               var10000 = 140;
               break;
            default:
               var10000 = 45;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24742;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "aæêÂ ÿT\u0007\u0019ü\u000bä\u0010\u0099ú!h¤\\\u0016Ñïñ\u008b7\n\u009dR\u000b¢á¸°ý.\u000e\u0004Û\u0093º\râ\u009e°_ã×8·!ýrJ\u009f\u0005\b!:§Q\u000fr\u0086B8\\ÀNØ\u0013&H¿pîç\u0003\u008a¥*\u0005\u001dð\u0098\u009d\u0005\rb¯ yò\u001a` PÜ_Î\b";
      int var12 = "aæêÂ ÿT\u0007\u0019ü\u000bä\u0010\u0099ú!h¤\\\u0016Ñïñ\u008b7\n\u009dR\u000b¢á¸°ý.\u000e\u0004Û\u0093º\râ\u009e°_ã×8·!ýrJ\u009f\u0005\b!:§Q\u000fr\u0086B8\\ÀNØ\u0013&H¿pîç\u0003\u008a¥*\u0005\u001dð\u0098\u009d\u0005\rb¯ yò\u001a` PÜ_Î\b"
         .length();
      char var9 = 28;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 45;
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
                        var65 = 111;
                        break;
                     case 1:
                        var65 = 92;
                        break;
                     case 2:
                        var65 = 94;
                        break;
                     case 3:
                        var65 = 45;
                        break;
                     case 4:
                        var65 = 62;
                        break;
                     case 5:
                        var65 = 80;
                        break;
                     default:
                        var65 = 80;
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
                     b = var13;
                     d = new String[10];
                     long var0 = 6330064885795135555L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "vIõò4vOä¨L3ã\u001e\u0013Öd";
                     int var5 = "vIõò4vOä¨L3ã\u001e\u0013Öd".length();
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
                                    e = var6;
                                    g = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Tý(\u0010²3ã_D\u001f¡\b\u0088'\u0097Ô";
                                 var5 = "Tý(\u0010²3ã_D\u001f¡\b\u0088'\u0097Ô".length();
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

                  var10 = "\u0081ß\u009b0Ò|\"¤sÅ×²¸\u0086\u0011\u0011\u0012\u0087%Fé¡6\u009d\u0097EÏ\u009ac\u0091\u0004÷\u008aÛ\u000f";
                  var12 = "\u0081ß\u009b0Ò|\"¤sÅ×²¸\u0086\u0011\u0011\u0012\u0087%Fé¡6\u009d\u0097EÏ\u009ac\u0091\u0004÷\u008aÛ\u000f".length();
                  var9 = 16;
                  var17 = -1;
            }

            var10000 = 14;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





