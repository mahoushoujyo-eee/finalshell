package com.finalshell.ui.panel;

import com.finalshell.core.DX3_2;
import com.finalshell.core.KV;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.MM;
import com.finalshell.core.NY;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.GU;
import com.finalshell.task.J5;
import com.finalshell.task.KL3_2;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import javax.swing.BorderFactory;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class F5 extends F8 {
   public RouteTracePanel g;
   public T32 t;
   public KV L;
   public String S;
   public boolean V;
   public FY3 u;
   public Lv4_2 Z;
   public DX3_2 F;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public F5(String var1, Lv4_2 var2) {
   super((String)Ref.g(370410546418678766L, var2));
      KV var10001 = new KV();
      long var4 = 474524358810565567L;
      KV var3 = var10001;
      Ref.s(474524358810565567L, var3, var4);
      Registry.lookupField(555330742514801377L).setBoolean(this, true);
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 332056532434062105L;
      Object[] var7 = var10004;
      Ref.h(332056532434062105L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 629746328777526573L;
      Object[] var9 = var10005;
      var10005 = Registry.packArgs(Ref.h(629746328777526573L, var9, var10));
      long var12 = 348300936400245960L;
      Object[] var11 = var10005;
      Ref.h(348300936400245960L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      long var14 = 370410546418678766L;
      Ref.s(370410546418678766L, var1, var14);
      long var16 = 407975048006702352L;
      Ref.s(407975048006702352L, var2, var16);
      this.setOpaque(false);
      this.setPreferredSize(new Dimension(b(26494, 1555414995835617442L), b(31311, 7446646597061320082L)));
      this.setLayout(new MigLayout(a(-2440, -10984), a(-2439, 9085), a(-2437, 32166)));
      FY3 var10008 = new FY3(this);
      long var18 = 399914242702643275L;
      FY3 var17 = var10008;
      Ref.s(399914242702643275L, var17, var18);
      Object var19 = 474524358810565567L;
      Ref.g(474524358810565567L, var19);
      Object[] var10010 = Registry.packArgs(var1);
      long var22 = 323500893576011855L;
      Object[] var21 = var10010;
      Ref.h(323500893576011855L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10011 = Registry.packArgs(new KL3_2(this));
      long var24 = 434592463220957006L;
      Object[] var23 = var10011;
      Ref.h(434592463220957006L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10012 = Registry.packArgs(new GU(this, var1));
      long var26 = 434592463220957006L;
      Object[] var25 = var10012;
      Ref.h(434592463220957006L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10013 = Registry.packArgs(new J5(this, var1));
      long var28 = 434592463220957006L;
      Object[] var27 = var10013;
      Ref.h(434592463220957006L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      RouteTracePanel var10014 = new RouteTracePanel(var1, this);
      long var30 = 357816784137601461L;
      RouteTracePanel var29 = var10014;
      Ref.s(357816784137601461L, var29, var30);
      Object var31 = 357816784137601461L;
      this.add((RouteTracePanel)Ref.g(357816784137601461L, var31));
      Object[] var10016 = Registry.emptyArgs();
      long var34 = 447912758445060699L;
      Object[] var33 = var10016;
      Ref.h(447912758445060699L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }
   }

   @Override
   public void S() {
      Registry.lookupField(555330742514801377L).setBoolean(this, false);
      Object var1 = 357816784137601461L;
      Ref.g(357816784137601461L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 337610225334143603L;
      Object[] var3 = var10002;
      Ref.h(337610225334143603L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object var5 = 474524358810565567L;
      Ref.g(474524358810565567L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 457070090305342817L;
      Object[] var7 = var10004;
      Ref.h(457070090305342817L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Object var9 = 399914242702643275L;
      Ref.g(399914242702643275L, var9);
      Object[] var10006 = Registry.emptyArgs();
      long var12 = 233031816753906091L;
      Object[] var11 = var10006;
      Ref.h(233031816753906091L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object var13 = 572928643335060995L;
      ((DX3_2)Ref.g(572928643335060995L, var13)).v();
   }

   public void c() {
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
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      NY var1 = var10003;
      byte var22 = 2;
      Color var10008 = (Color)(Registry.emptyArgs());
      long var10 = 345089686683358688L;
      Object var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
      this.setBorder(null);
      Object var11 = 399914242702643275L;
      Ref.g(399914242702643275L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 187894907200639463L;
      Object[] var13 = var10006;
      Ref.h(187894907200639463L, var13, var14);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 415642889349902360L;
      Object[] var15 = var10007;
      Ref.h(415642889349902360L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }

   public void D() {
      DX3_2 var10002;
      Object var2 = 370410546418678766L;
      long var5 = 572928643335060995L;
      DX3_2 var4 = var10002;
      Ref.s(572928643335060995L, var4, var5);
      Object var6 = 572928643335060995L;
      ((DX3_2)Ref.g(572928643335060995L, var6)).j(new MM(this));

      try {
         Object var8 = 572928643335060995L;
         ((DX3_2)Ref.g(572928643335060995L, var8)).C();
      } catch (PcapNativeException | NotOpenException | UnknownHostException var10) {
         var10.printStackTrace();
      }
   }

   public void n() {
      Object var1 = 474524358810565567L;
      Registry.lookupField(461634183601281643L).setBoolean(Ref.g(474524358810565567L, var1), false);
      Object var3 = 474524358810565567L;
      Registry.lookupField(208124046164384842L).setLong(Ref.g(474524358810565567L, var3), System.currentTimeMillis());
   }

   @Override
   public T32 X() {
      Object var1 = 576192056398327317L;
      return (T32)Ref.g(576192056398327317L, var1);
   }

   @Override
   public void U(T32 var1) {
      long var3 = 576192056398327317L;
      Ref.s(576192056398327317L, var1, var3);
   }

   public KV G() {
      Object var1 = 474524358810565567L;
      return (KV)Ref.g(474524358810565567L, var1);
   }

   public void u(KV var1) {
      long var3 = 474524358810565567L;
      Ref.s(474524358810565567L, var1, var3);
   }

   public String R() {
      Object var1 = 370410546418678766L;
      return (String)Ref.g(370410546418678766L, var1);
   }

   public void l(String var1) {
      long var3 = 370410546418678766L;
      Ref.s(370410546418678766L, var1, var3);
   }

   public FY3 V() {
      Object var1 = 399914242702643275L;
      return (FY3)Ref.g(399914242702643275L, var1);
   }

   public void b(FY3 var1) {
      long var3 = 399914242702643275L;
      Ref.s(399914242702643275L, var1, var3);
   }

   public Lv4_2 t() {
      Object var1 = 407975048006702352L;
      return (Lv4_2)Ref.g(407975048006702352L, var1);
   }

   public void O(Lv4_2 var1) {
      long var3 = 407975048006702352L;
      Ref.s(407975048006702352L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -2439) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 159;
               break;
            case 2:
               var10000 = 156;
               break;
            case 3:
               var10000 = 112;
               break;
            case 4:
               var10000 = 219;
               break;
            case 5:
               var10000 = 97;
               break;
            case 6:
               var10000 = 68;
               break;
            case 7:
               var10000 = 185;
               break;
            case 8:
               var10000 = 31;
               break;
            case 9:
               var10000 = 32;
               break;
            case 10:
               var10000 = 222;
               break;
            case 11:
               var10000 = 101;
               break;
            case 12:
               var10000 = 207;
               break;
            case 13:
               var10000 = 202;
               break;
            case 14:
               var10000 = 111;
               break;
            case 15:
               var10000 = 48;
               break;
            case 16:
               var10000 = 26;
               break;
            case 17:
               var10000 = 60;
               break;
            case 18:
               var10000 = 242;
               break;
            case 19:
               var10000 = 13;
               break;
            case 20:
               var10000 = 85;
               break;
            case 21:
               var10000 = 98;
               break;
            case 22:
               var10000 = 1;
               break;
            case 23:
               var10000 = 9;
               break;
            case 24:
               var10000 = 158;
               break;
            case 25:
               var10000 = 246;
               break;
            case 26:
               var10000 = 172;
               break;
            case 27:
               var10000 = 45;
               break;
            case 28:
               var10000 = 86;
               break;
            case 29:
               var10000 = 115;
               break;
            case 30:
               var10000 = 103;
               break;
            case 31:
               var10000 = 55;
               break;
            case 32:
               var10000 = 66;
               break;
            case 33:
               var10000 = 226;
               break;
            case 34:
               var10000 = 203;
               break;
            case 35:
               var10000 = 161;
               break;
            case 36:
               var10000 = 30;
               break;
            case 37:
               var10000 = 33;
               break;
            case 38:
               var10000 = 254;
               break;
            case 39:
               var10000 = 70;
               break;
            case 40:
               var10000 = 179;
               break;
            case 41:
               var10000 = 181;
               break;
            case 42:
               var10000 = 189;
               break;
            case 43:
               var10000 = 46;
               break;
            case 44:
               var10000 = 173;
               break;
            case 45:
               var10000 = 57;
               break;
            case 46:
               var10000 = 134;
               break;
            case 47:
               var10000 = 170;
               break;
            case 48:
               var10000 = 28;
               break;
            case 49:
               var10000 = 177;
               break;
            case 50:
               var10000 = 63;
               break;
            case 51:
               var10000 = 15;
               break;
            case 52:
               var10000 = 121;
               break;
            case 53:
               var10000 = 130;
               break;
            case 54:
               var10000 = 194;
               break;
            case 55:
               var10000 = 75;
               break;
            case 56:
               var10000 = 140;
               break;
            case 57:
               var10000 = 3;
               break;
            case 58:
               var10000 = 4;
               break;
            case 59:
               var10000 = 182;
               break;
            case 60:
               var10000 = 167;
               break;
            case 61:
               var10000 = 157;
               break;
            case 62:
               var10000 = 91;
               break;
            case 63:
               var10000 = 67;
               break;
            case 64:
               var10000 = 83;
               break;
            case 65:
               var10000 = 136;
               break;
            case 66:
               var10000 = 19;
               break;
            case 67:
               var10000 = 37;
               break;
            case 68:
               var10000 = 61;
               break;
            case 69:
               var10000 = 12;
               break;
            case 70:
               var10000 = 138;
               break;
            case 71:
               var10000 = 52;
               break;
            case 72:
               var10000 = 35;
               break;
            case 73:
               var10000 = 144;
               break;
            case 74:
               var10000 = 201;
               break;
            case 75:
               var10000 = 232;
               break;
            case 76:
               var10000 = 154;
               break;
            case 77:
               var10000 = 199;
               break;
            case 78:
               var10000 = 148;
               break;
            case 79:
               var10000 = 6;
               break;
            case 80:
               var10000 = 21;
               break;
            case 81:
               var10000 = 213;
               break;
            case 82:
               var10000 = 169;
               break;
            case 83:
               var10000 = 127;
               break;
            case 84:
               var10000 = 223;
               break;
            case 85:
               var10000 = 64;
               break;
            case 86:
               var10000 = 123;
               break;
            case 87:
               var10000 = 87;
               break;
            case 88:
               var10000 = 90;
               break;
            case 89:
               var10000 = 69;
               break;
            case 90:
               var10000 = 153;
               break;
            case 91:
               var10000 = 0;
               break;
            case 92:
               var10000 = 54;
               break;
            case 93:
               var10000 = 106;
               break;
            case 94:
               var10000 = 50;
               break;
            case 95:
               var10000 = 233;
               break;
            case 96:
               var10000 = 114;
               break;
            case 97:
               var10000 = 227;
               break;
            case 98:
               var10000 = 125;
               break;
            case 99:
               var10000 = 139;
               break;
            case 100:
               var10000 = 214;
               break;
            case 101:
               var10000 = 252;
               break;
            case 102:
               var10000 = 131;
               break;
            case 103:
               var10000 = 20;
               break;
            case 104:
               var10000 = 151;
               break;
            case 105:
               var10000 = 183;
               break;
            case 106:
               var10000 = 247;
               break;
            case 107:
               var10000 = 160;
               break;
            case 108:
               var10000 = 34;
               break;
            case 109:
               var10000 = 197;
               break;
            case 110:
               var10000 = 163;
               break;
            case 111:
               var10000 = 88;
               break;
            case 112:
               var10000 = 8;
               break;
            case 113:
               var10000 = 184;
               break;
            case 114:
               var10000 = 14;
               break;
            case 115:
               var10000 = 105;
               break;
            case 116:
               var10000 = 175;
               break;
            case 117:
               var10000 = 79;
               break;
            case 118:
               var10000 = 237;
               break;
            case 119:
               var10000 = 152;
               break;
            case 120:
               var10000 = 51;
               break;
            case 121:
               var10000 = 2;
               break;
            case 122:
               var10000 = 124;
               break;
            case 123:
               var10000 = 251;
               break;
            case 124:
               var10000 = 73;
               break;
            case 125:
               var10000 = 119;
               break;
            case 126:
               var10000 = 76;
               break;
            case 127:
               var10000 = 11;
               break;
            case 128:
               var10000 = 165;
               break;
            case 129:
               var10000 = 208;
               break;
            case 130:
               var10000 = 38;
               break;
            case 131:
               var10000 = 133;
               break;
            case 132:
               var10000 = 17;
               break;
            case 133:
               var10000 = 141;
               break;
            case 134:
               var10000 = 205;
               break;
            case 135:
               var10000 = 43;
               break;
            case 136:
               var10000 = 18;
               break;
            case 137:
               var10000 = 216;
               break;
            case 138:
               var10000 = 104;
               break;
            case 139:
               var10000 = 42;
               break;
            case 140:
               var10000 = 166;
               break;
            case 141:
               var10000 = 145;
               break;
            case 142:
               var10000 = 120;
               break;
            case 143:
               var10000 = 210;
               break;
            case 144:
               var10000 = 22;
               break;
            case 145:
               var10000 = 221;
               break;
            case 146:
               var10000 = 176;
               break;
            case 147:
               var10000 = 82;
               break;
            case 148:
               var10000 = 126;
               break;
            case 149:
               var10000 = 41;
               break;
            case 150:
               var10000 = 71;
               break;
            case 151:
               var10000 = 218;
               break;
            case 152:
               var10000 = 211;
               break;
            case 153:
               var10000 = 149;
               break;
            case 154:
               var10000 = 81;
               break;
            case 155:
               var10000 = 137;
               break;
            case 156:
               var10000 = 39;
               break;
            case 157:
               var10000 = 108;
               break;
            case 158:
               var10000 = 78;
               break;
            case 159:
               var10000 = 191;
               break;
            case 160:
               var10000 = 40;
               break;
            case 161:
               var10000 = 255;
               break;
            case 162:
               var10000 = 89;
               break;
            case 163:
               var10000 = 234;
               break;
            case 164:
               var10000 = 195;
               break;
            case 165:
               var10000 = 241;
               break;
            case 166:
               var10000 = 128;
               break;
            case 167:
               var10000 = 225;
               break;
            case 168:
               var10000 = 188;
               break;
            case 169:
               var10000 = 235;
               break;
            case 170:
               var10000 = 65;
               break;
            case 171:
               var10000 = 143;
               break;
            case 172:
               var10000 = 243;
               break;
            case 173:
               var10000 = 198;
               break;
            case 174:
               var10000 = 117;
               break;
            case 175:
               var10000 = 56;
               break;
            case 176:
               var10000 = 77;
               break;
            case 177:
               var10000 = 204;
               break;
            case 178:
               var10000 = 212;
               break;
            case 179:
               var10000 = 102;
               break;
            case 180:
               var10000 = 93;
               break;
            case 181:
               var10000 = 228;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 58;
               break;
            case 184:
               var10000 = 217;
               break;
            case 185:
               var10000 = 53;
               break;
            case 186:
               var10000 = 7;
               break;
            case 187:
               var10000 = 96;
               break;
            case 188:
               var10000 = 192;
               break;
            case 189:
               var10000 = 190;
               break;
            case 190:
               var10000 = 72;
               break;
            case 191:
               var10000 = 168;
               break;
            case 192:
               var10000 = 244;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 174;
               break;
            case 195:
               var10000 = 209;
               break;
            case 196:
               var10000 = 220;
               break;
            case 197:
               var10000 = 186;
               break;
            case 198:
               var10000 = 206;
               break;
            case 199:
               var10000 = 116;
               break;
            case 200:
               var10000 = 135;
               break;
            case 201:
               var10000 = 47;
               break;
            case 202:
               var10000 = 164;
               break;
            case 203:
               var10000 = 245;
               break;
            case 204:
               var10000 = 150;
               break;
            case 205:
               var10000 = 100;
               break;
            case 206:
               var10000 = 94;
               break;
            case 207:
               var10000 = 16;
               break;
            case 208:
               var10000 = 110;
               break;
            case 209:
               var10000 = 215;
               break;
            case 210:
               var10000 = 129;
               break;
            case 211:
               var10000 = 95;
               break;
            case 212:
               var10000 = 187;
               break;
            case 213:
               var10000 = 229;
               break;
            case 214:
               var10000 = 10;
               break;
            case 215:
               var10000 = 5;
               break;
            case 216:
               var10000 = 239;
               break;
            case 217:
               var10000 = 180;
               break;
            case 218:
               var10000 = 23;
               break;
            case 219:
               var10000 = 99;
               break;
            case 220:
               var10000 = 80;
               break;
            case 221:
               var10000 = 236;
               break;
            case 222:
               var10000 = 146;
               break;
            case 223:
               var10000 = 240;
               break;
            case 224:
               var10000 = 248;
               break;
            case 225:
               var10000 = 74;
               break;
            case 226:
               var10000 = 107;
               break;
            case 227:
               var10000 = 253;
               break;
            case 228:
               var10000 = 109;
               break;
            case 229:
               var10000 = 92;
               break;
            case 230:
               var10000 = 193;
               break;
            case 231:
               var10000 = 36;
               break;
            case 232:
               var10000 = 200;
               break;
            case 233:
               var10000 = 162;
               break;
            case 234:
               var10000 = 62;
               break;
            case 235:
               var10000 = 196;
               break;
            case 236:
               var10000 = 59;
               break;
            case 237:
               var10000 = 147;
               break;
            case 238:
               var10000 = 250;
               break;
            case 239:
               var10000 = 142;
               break;
            case 240:
               var10000 = 113;
               break;
            case 241:
               var10000 = 132;
               break;
            case 242:
               var10000 = 49;
               break;
            case 243:
               var10000 = 230;
               break;
            case 244:
               var10000 = 44;
               break;
            case 245:
               var10000 = 118;
               break;
            case 246:
               var10000 = 231;
               break;
            case 247:
               var10000 = 249;
               break;
            case 248:
               var10000 = 84;
               break;
            case 249:
               var10000 = 27;
               break;
            case 250:
               var10000 = 224;
               break;
            case 251:
               var10000 = 155;
               break;
            case 252:
               var10000 = 25;
               break;
            case 253:
               var10000 = 238;
               break;
            case 254:
               var10000 = 24;
               break;
            default:
               var10000 = 178;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26589;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "Ì?é\u0085\u0015\u000f÷ê¹T\u001dß\u008cÛ\u0005\rkä\u0086oÙ\u0005×á\u008a^y";
      int var12 = "Ì?é\u0085\u0015\u000f÷ê¹T\u001dß\u008cÛ\u0005\rkä\u0086oÙ\u0005×á\u008a^y".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 5;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 5;
               var10006 = var14;
            } else {
               var23 = 5;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 5;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 69;
                     break;
                  case 1:
                     var41 = 26;
                     break;
                  case 2:
                     var41 = 125;
                     break;
                  case 3:
                     var41 = 41;
                     break;
                  case 4:
                     var41 = 73;
                     break;
                  case 5:
                     var41 = 111;
                     break;
                  default:
                     var41 = 121;
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
            b = new String[3];
            long var0 = 4108703212267018464L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "èw7f?\u0018¢b\u001bS:¿ß·¿R";
            int var5 = "èw7f?\u0018¢b\u001bS:¿ß·¿R".length();
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

            d = var6;
            e = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





