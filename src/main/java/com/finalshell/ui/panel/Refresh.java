package com.finalshell.ui.panel;

import com.finalshell.core.CK;
import com.finalshell.core.GH_2;
import com.finalshell.core.KD;
import com.finalshell.core.KV;
import com.finalshell.core.NY;
import com.finalshell.core.T32;
import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Vd2;
import com.finalshell.ui.listener.DI3;
import java.awt.Color;
import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class Refresh extends F8 {
   T32 E;
   KV Z;
   boolean S;
   ConnectionProperty Q;
   Ty2 n;
   String a;
   NetworkInterfacePanel b;
   GH_2 k;
   public static int[] C;
   public static String[] d;
   public static String[] e;
   public static long[] g;
   public static Integer[] h;

   public Refresh(Ty2 var1, String var2) {
      KV var10001 = new KV();
      long var9 = 323602357927532056L;
      KV var8 = var10001;
      Ref.s(323602357927532056L, var8, var9);
      Registry.lookupField(167519366264478813L).setBoolean(this, true);
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 332056532434062105L;
      Object[] var12 = var10004;
      Ref.h(332056532434062105L, var12, var13);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 510003987689226933L;
      Object[] var14 = var10005;
      var10005 = Registry.packArgs(Ref.h(510003987689226933L, var14, var15));
      long var17 = 348300936400245960L;
      Object[] var16 = var10005;
      Ref.h(348300936400245960L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      long var19 = 417398143488452283L;
      Ref.s(417398143488452283L, var2, var19);
      long var21 = 635993614489710917L;
      Ref.s(635993614489710917L, var1, var21);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-22660, 8833), a(-22664, -21570), a(-22658, -31854)));
      JPanel var4 = new JPanel(new MigLayout(a(-22663, 4212)));
      var4.setOpaque(false);
      AM var5 = new AM();
      var5.setOpaque(false);
      Object[] var10008 = Registry.packArgs(false);
      long var23 = 539963353146557906L;
      Object[] var22 = var10008;
      Ref.h(539963353146557906L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }

      var5.setBorder(new EmptyBorder(0, 0, 0, 0));
      Object[] var10009 = Registry.packArgs(true);
      long var25 = 137984194358335738L;
      Object[] var24 = var10009;
      Ref.h(137984194358335738L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      FlowLayout var10010 = Registry.emptyArgs();
      long var27 = 507960568746859746L;
      Object[] var26 = var10010;
      var10010 = Ref.h(507960568746859746L, var26, var27);

      try {
         var10010 = (FlowLayout)var10010;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      var10010.setAlignment(1);
      var5.setAlignmentX(0.5F);
      Object[] var10011 = Registry.packArgs(false);
      long var29 = 326462668127767256L;
      Object[] var28 = var10011;
      Ref.h(326462668127767256L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      int[] var59 = K();
      KD var6 = new KD(a(-22659, -3116));
      var6.s(b(12325, 8320467696806261543L));
      int[] var3 = var59;
      var6.V(0, 5, 0, 5);
      var4.add(var6, a(-22661, 14128));
      var6.addActionListener(new DI3(this, var1));
      NetworkInterfacePanel var10012 = new NetworkInterfacePanel();
      long var31 = 424420598427453385L;
      NetworkInterfacePanel var30 = var10012;
      Ref.s(424420598427453385L, var30, var31);
      JScrollPane var10013;
      Object var32 = 424420598427453385L;
      super((NetworkInterfacePanel)Ref.g(424420598427453385L, var32));
      JScrollPane var7 = var10013;
      this.add(var7, a(-22662, -26623));
      var7.getViewport().setOpaque(false);
      var7.getVerticalScrollBar().setOpaque(false);
      var7.getHorizontalScrollBar().setOpaque(false);
      Object var34 = 323602357927532056L;
      Ref.g(323602357927532056L, var34);
      Object[] var10015 = Registry.packArgs(var1);
      long var37 = 286657267857987248L;
      Object[] var36 = var10015;
      Ref.h(286657267857987248L, var36, var37);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Object[] var10016 = Registry.emptyArgs();
      long var39 = 174029122558684054L;
      Object[] var38 = var10016;
      Ref.h(174029122558684054L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10018 = Registry.packArgs(new Vd2(this, var1), b(20657, 4478510118326178742L));
      long var41 = 201859364639460244L;
      Object[] var40 = var10018;
      var10018 = Ref.h(201859364639460244L, var40, var41);
      long var43 = 620145009670169986L;
      Object var42 = var10018;
      Ref.s(620145009670169986L, var42, var43);
      Object[] var10020 = Registry.emptyArgs();
      long var45 = 121632250293569146L;
      Object[] var44 = var10020;
      var10020 = Registry.packArgs(Ref.h(121632250293569146L, var44, var45));
      long var47 = 540897424776196125L;
      Object[] var46 = var10020;
      Ref.h(540897424776196125L, var46, var47);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      if (var3 == null) {
         Ky4.K(new String[5]);
      }
   }

   F8 y() {
      F8 var1 = new F8();
      var1.setOpaque(true);
      var1.setBackground(new Color(b(6724, 1581320518255368516L), b(20046, 4176913884594834762L), b(20046, 4176913884594834762L)));
      var1.setBorder(
         BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(b(17262, 3160677513023291503L), 4, 4, 4),
            BorderFactory.createLineBorder(new Color(b(6446, 1420361367835859496L), b(26018, 2696155116633728673L), b(26018, 2696155116633728673L)))
         )
      );
      return var1;
   }

   @Override
   public void C(KV var1) {
      int[] var2 = K();
      if (var2 != null) {
         if (CK.X) {
            Object var3 = 424420598427453385L;
            Ref.g(424420598427453385L, var3);
            Object[] var10002 = Registry.packArgs(var1);
            long var6 = 223639788004637701L;
            Object[] var5 = var10002;
            Ref.h(223639788004637701L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }
         }
      }
   }

   @Override
   public void S() {
      Registry.lookupField(167519366264478813L).setBoolean(this, false);
      Object var1 = 620145009670169986L;
      Ref.g(620145009670169986L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 624731062495880669L;
      Object[] var3 = var10002;
      Ref.h(624731062495880669L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object var5 = 323602357927532056L;
      Ref.g(323602357927532056L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 457070090305342817L;
      Object[] var7 = var10004;
      Ref.h(457070090305342817L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void F() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 399585344452154517L;
      Object[] var5 = var10002;
      Ref.h(399585344452154517L, var5, var6);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var8 = 149968465491171480L;
      Object[] var7 = var10003;
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
      Object[] var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
   }

   void e() {
      Object var1 = 323602357927532056L;
      Registry.lookupField(461634183601281643L).setBoolean(Ref.g(323602357927532056L, var1), false);
      Object var3 = 323602357927532056L;
      Registry.lookupField(208124046164384842L).setLong(Ref.g(323602357927532056L, var3), System.currentTimeMillis());
   }

   public T32 X$t3_2() {
      Object var1 = 437794107827976138L;
      return (T32)Ref.g(437794107827976138L, var1);
   }

   @Override
   public void U(T32 var1) {
      long var3 = 437794107827976138L;
      Ref.s(437794107827976138L, var1, var3);
   }

   public KV n() {
      Object var1 = 323602357927532056L;
      return (KV)Ref.g(323602357927532056L, var1);
   }

   public void U(KV var1) {
      long var3 = 323602357927532056L;
      Ref.s(323602357927532056L, var1, var3);
   }

   public Ty2 X$Ty_2() {
      Object var1 = 635993614489710917L;
      return (Ty2)Ref.g(635993614489710917L, var1);
   }

   public void i(Ty2 var1) {
      long var3 = 635993614489710917L;
      Ref.s(635993614489710917L, var1, var3);
   }

   @Override
   public ConnectionProperty t() {
      Object var1 = 530217499289318507L;
      return (ConnectionProperty)Ref.g(530217499289318507L, var1);
   }

   @Override
   public void E(ConnectionProperty var1) {
      long var3 = 530217499289318507L;
      Ref.s(530217499289318507L, var1, var3);
   }

   @Override
   public String T() {
      Object var1 = 417398143488452283L;
      return (String)Ref.g(417398143488452283L, var1);
   }

   @Override
   public void h(String var1) {
      long var3 = 417398143488452283L;
      Ref.s(417398143488452283L, var1, var3);
   }

   public static void S(int[] var0) {
      C = var0;
   }

   public static int[] K() {
      return C;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -22664) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 182;
               break;
            case 1:
               var10000 = 54;
               break;
            case 2:
               var10000 = 11;
               break;
            case 3:
               var10000 = 158;
               break;
            case 4:
               var10000 = 115;
               break;
            case 5:
               var10000 = 41;
               break;
            case 6:
               var10000 = 92;
               break;
            case 7:
               var10000 = 59;
               break;
            case 8:
               var10000 = 69;
               break;
            case 9:
               var10000 = 245;
               break;
            case 10:
               var10000 = 143;
               break;
            case 11:
               var10000 = 128;
               break;
            case 12:
               var10000 = 79;
               break;
            case 13:
               var10000 = 194;
               break;
            case 14:
               var10000 = 33;
               break;
            case 15:
               var10000 = 171;
               break;
            case 16:
               var10000 = 77;
               break;
            case 17:
               var10000 = 100;
               break;
            case 18:
               var10000 = 22;
               break;
            case 19:
               var10000 = 179;
               break;
            case 20:
               var10000 = 224;
               break;
            case 21:
               var10000 = 102;
               break;
            case 22:
               var10000 = 27;
               break;
            case 23:
               var10000 = 123;
               break;
            case 24:
               var10000 = 216;
               break;
            case 25:
               var10000 = 138;
               break;
            case 26:
               var10000 = 28;
               break;
            case 27:
               var10000 = 80;
               break;
            case 28:
               var10000 = 103;
               break;
            case 29:
               var10000 = 1;
               break;
            case 30:
               var10000 = 207;
               break;
            case 31:
               var10000 = 203;
               break;
            case 32:
               var10000 = 32;
               break;
            case 33:
               var10000 = 246;
               break;
            case 34:
               var10000 = 82;
               break;
            case 35:
               var10000 = 232;
               break;
            case 36:
               var10000 = 166;
               break;
            case 37:
               var10000 = 25;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 214;
               break;
            case 40:
               var10000 = 249;
               break;
            case 41:
               var10000 = 254;
               break;
            case 42:
               var10000 = 175;
               break;
            case 43:
               var10000 = 195;
               break;
            case 44:
               var10000 = 176;
               break;
            case 45:
               var10000 = 233;
               break;
            case 46:
               var10000 = 60;
               break;
            case 47:
               var10000 = 43;
               break;
            case 48:
               var10000 = 173;
               break;
            case 49:
               var10000 = 209;
               break;
            case 50:
               var10000 = 178;
               break;
            case 51:
               var10000 = 244;
               break;
            case 52:
               var10000 = 57;
               break;
            case 53:
               var10000 = 215;
               break;
            case 54:
               var10000 = 184;
               break;
            case 55:
               var10000 = 218;
               break;
            case 56:
               var10000 = 127;
               break;
            case 57:
               var10000 = 55;
               break;
            case 58:
               var10000 = 117;
               break;
            case 59:
               var10000 = 145;
               break;
            case 60:
               var10000 = 149;
               break;
            case 61:
               var10000 = 124;
               break;
            case 62:
               var10000 = 125;
               break;
            case 63:
               var10000 = 152;
               break;
            case 64:
               var10000 = 236;
               break;
            case 65:
               var10000 = 58;
               break;
            case 66:
               var10000 = 250;
               break;
            case 67:
               var10000 = 205;
               break;
            case 68:
               var10000 = 85;
               break;
            case 69:
               var10000 = 154;
               break;
            case 70:
               var10000 = 116;
               break;
            case 71:
               var10000 = 46;
               break;
            case 72:
               var10000 = 97;
               break;
            case 73:
               var10000 = 12;
               break;
            case 74:
               var10000 = 111;
               break;
            case 75:
               var10000 = 146;
               break;
            case 76:
               var10000 = 121;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 132;
               break;
            case 79:
               var10000 = 101;
               break;
            case 80:
               var10000 = 68;
               break;
            case 81:
               var10000 = 81;
               break;
            case 82:
               var10000 = 126;
               break;
            case 83:
               var10000 = 20;
               break;
            case 84:
               var10000 = 239;
               break;
            case 85:
               var10000 = 96;
               break;
            case 86:
               var10000 = 108;
               break;
            case 87:
               var10000 = 56;
               break;
            case 88:
               var10000 = 187;
               break;
            case 89:
               var10000 = 170;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 91;
               break;
            case 92:
               var10000 = 164;
               break;
            case 93:
               var10000 = 191;
               break;
            case 94:
               var10000 = 180;
               break;
            case 95:
               var10000 = 110;
               break;
            case 96:
               var10000 = 90;
               break;
            case 97:
               var10000 = 66;
               break;
            case 98:
               var10000 = 62;
               break;
            case 99:
               var10000 = 206;
               break;
            case 100:
               var10000 = 177;
               break;
            case 101:
               var10000 = 5;
               break;
            case 102:
               var10000 = 67;
               break;
            case 103:
               var10000 = 98;
               break;
            case 104:
               var10000 = 61;
               break;
            case 105:
               var10000 = 23;
               break;
            case 106:
               var10000 = 156;
               break;
            case 107:
               var10000 = 151;
               break;
            case 108:
               var10000 = 9;
               break;
            case 109:
               var10000 = 197;
               break;
            case 110:
               var10000 = 199;
               break;
            case 111:
               var10000 = 240;
               break;
            case 112:
               var10000 = 21;
               break;
            case 113:
               var10000 = 223;
               break;
            case 114:
               var10000 = 234;
               break;
            case 115:
               var10000 = 183;
               break;
            case 116:
               var10000 = 157;
               break;
            case 117:
               var10000 = 168;
               break;
            case 118:
               var10000 = 63;
               break;
            case 119:
               var10000 = 38;
               break;
            case 120:
               var10000 = 50;
               break;
            case 121:
               var10000 = 193;
               break;
            case 122:
               var10000 = 107;
               break;
            case 123:
               var10000 = 238;
               break;
            case 124:
               var10000 = 150;
               break;
            case 125:
               var10000 = 255;
               break;
            case 126:
               var10000 = 73;
               break;
            case 127:
               var10000 = 130;
               break;
            case 128:
               var10000 = 2;
               break;
            case 129:
               var10000 = 44;
               break;
            case 130:
               var10000 = 133;
               break;
            case 131:
               var10000 = 3;
               break;
            case 132:
               var10000 = 36;
               break;
            case 133:
               var10000 = 89;
               break;
            case 134:
               var10000 = 17;
               break;
            case 135:
               var10000 = 161;
               break;
            case 136:
               var10000 = 185;
               break;
            case 137:
               var10000 = 40;
               break;
            case 138:
               var10000 = 0;
               break;
            case 139:
               var10000 = 144;
               break;
            case 140:
               var10000 = 237;
               break;
            case 141:
               var10000 = 235;
               break;
            case 142:
               var10000 = 211;
               break;
            case 143:
               var10000 = 181;
               break;
            case 144:
               var10000 = 253;
               break;
            case 145:
               var10000 = 165;
               break;
            case 146:
               var10000 = 201;
               break;
            case 147:
               var10000 = 129;
               break;
            case 148:
               var10000 = 228;
               break;
            case 149:
               var10000 = 202;
               break;
            case 150:
               var10000 = 48;
               break;
            case 151:
               var10000 = 134;
               break;
            case 152:
               var10000 = 227;
               break;
            case 153:
               var10000 = 229;
               break;
            case 154:
               var10000 = 45;
               break;
            case 155:
               var10000 = 104;
               break;
            case 156:
               var10000 = 241;
               break;
            case 157:
               var10000 = 204;
               break;
            case 158:
               var10000 = 35;
               break;
            case 159:
               var10000 = 221;
               break;
            case 160:
               var10000 = 106;
               break;
            case 161:
               var10000 = 86;
               break;
            case 162:
               var10000 = 136;
               break;
            case 163:
               var10000 = 65;
               break;
            case 164:
               var10000 = 120;
               break;
            case 165:
               var10000 = 49;
               break;
            case 166:
               var10000 = 140;
               break;
            case 167:
               var10000 = 200;
               break;
            case 168:
               var10000 = 119;
               break;
            case 169:
               var10000 = 148;
               break;
            case 170:
               var10000 = 18;
               break;
            case 171:
               var10000 = 147;
               break;
            case 172:
               var10000 = 47;
               break;
            case 173:
               var10000 = 174;
               break;
            case 174:
               var10000 = 139;
               break;
            case 175:
               var10000 = 52;
               break;
            case 176:
               var10000 = 155;
               break;
            case 177:
               var10000 = 252;
               break;
            case 178:
               var10000 = 39;
               break;
            case 179:
               var10000 = 251;
               break;
            case 180:
               var10000 = 208;
               break;
            case 181:
               var10000 = 109;
               break;
            case 182:
               var10000 = 99;
               break;
            case 183:
               var10000 = 186;
               break;
            case 184:
               var10000 = 210;
               break;
            case 185:
               var10000 = 114;
               break;
            case 186:
               var10000 = 153;
               break;
            case 187:
               var10000 = 220;
               break;
            case 188:
               var10000 = 10;
               break;
            case 189:
               var10000 = 78;
               break;
            case 190:
               var10000 = 196;
               break;
            case 191:
               var10000 = 75;
               break;
            case 192:
               var10000 = 26;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 30;
               break;
            case 195:
               var10000 = 105;
               break;
            case 196:
               var10000 = 113;
               break;
            case 197:
               var10000 = 219;
               break;
            case 198:
               var10000 = 7;
               break;
            case 199:
               var10000 = 14;
               break;
            case 200:
               var10000 = 31;
               break;
            case 201:
               var10000 = 213;
               break;
            case 202:
               var10000 = 222;
               break;
            case 203:
               var10000 = 15;
               break;
            case 204:
               var10000 = 71;
               break;
            case 205:
               var10000 = 74;
               break;
            case 206:
               var10000 = 131;
               break;
            case 207:
               var10000 = 226;
               break;
            case 208:
               var10000 = 6;
               break;
            case 209:
               var10000 = 162;
               break;
            case 210:
               var10000 = 169;
               break;
            case 211:
               var10000 = 16;
               break;
            case 212:
               var10000 = 13;
               break;
            case 213:
               var10000 = 231;
               break;
            case 214:
               var10000 = 42;
               break;
            case 215:
               var10000 = 118;
               break;
            case 216:
               var10000 = 53;
               break;
            case 217:
               var10000 = 188;
               break;
            case 218:
               var10000 = 84;
               break;
            case 219:
               var10000 = 172;
               break;
            case 220:
               var10000 = 72;
               break;
            case 221:
               var10000 = 37;
               break;
            case 222:
               var10000 = 142;
               break;
            case 223:
               var10000 = 190;
               break;
            case 224:
               var10000 = 225;
               break;
            case 225:
               var10000 = 93;
               break;
            case 226:
               var10000 = 141;
               break;
            case 227:
               var10000 = 122;
               break;
            case 228:
               var10000 = 70;
               break;
            case 229:
               var10000 = 159;
               break;
            case 230:
               var10000 = 163;
               break;
            case 231:
               var10000 = 83;
               break;
            case 232:
               var10000 = 160;
               break;
            case 233:
               var10000 = 198;
               break;
            case 234:
               var10000 = 4;
               break;
            case 235:
               var10000 = 248;
               break;
            case 236:
               var10000 = 87;
               break;
            case 237:
               var10000 = 112;
               break;
            case 238:
               var10000 = 24;
               break;
            case 239:
               var10000 = 212;
               break;
            case 240:
               var10000 = 64;
               break;
            case 241:
               var10000 = 34;
               break;
            case 242:
               var10000 = 243;
               break;
            case 243:
               var10000 = 51;
               break;
            case 244:
               var10000 = 95;
               break;
            case 245:
               var10000 = 242;
               break;
            case 246:
               var10000 = 192;
               break;
            case 247:
               var10000 = 135;
               break;
            case 248:
               var10000 = 137;
               break;
            case 249:
               var10000 = 88;
               break;
            case 250:
               var10000 = 217;
               break;
            case 251:
               var10000 = 167;
               break;
            case 252:
               var10000 = 8;
               break;
            case 253:
               var10000 = 76;
               break;
            case 254:
               var10000 = 189;
               break;
            default:
               var10000 = 94;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17154;
      if (h[var3] == null) {
         h[var3] = (int)(g[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[7];
      int var11 = 0;
      int[] var10000 = new int[3];
      String var10 = " Í \nwP\u0097s\u0010§\\çS\u008dÁ¿\u0007üÃ\u0095W¥:¡\\\u001b¢M\u008d\u0087);®`\u0097\u000fÿõC\u007f¶ì\\¯l¡\u00993qe#¸Ô\rOQé²\u000f´¶\u0090\u0098W°4\u008f\u001d²JE\u0091Ù\u00995\f\u00ad£¯jà\u009f\næ \u00078wù\u000f³Ñ)C\u0089z«";
      int var12 = " Í \nwP\u0097s\u0010§\\çS\u008dÁ¿\u0007üÃ\u0095W¥:¡\\\u001b¢M\u008d\u0087);®`\u0097\u000fÿõC\u007f¶ì\\¯l¡\u00993qe#¸Ô\rOQé²\u000f´¶\u0090\u0098W°4\u008f\u001d²JE\u0091Ù\u00995\f\u00ad£¯jà\u009f\næ \u00078wù\u000f³Ñ)C\u0089z«"
         .length();
      S(var10000);
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var18 = 10;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      Object[] var34;
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var18;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               } else {
                  var43 = var18;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 114;
                        break;
                     case 1:
                        var66 = 106;
                        break;
                     case 2:
                        var66 = 33;
                        break;
                     case 3:
                        var66 = 24;
                        break;
                     case 4:
                        var66 = 119;
                        break;
                     case 5:
                        var66 = 89;
                        break;
                     default:
                        var66 = 113;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     d = var13;
                     e = new String[7];
                     long var0 = 5291025646202155695L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "\u0010è\u0081*\u0092c\u0081\u0082\u0010n,ÿù\u0012TÒ\u0083Ó¶ÅÝù«\u0014,«hXv\ròÊ\u0093?3ñµ×([";
                     int var5 = "\u0010è\u0081*\u0092c\u0081\u0082\u0010n,ÿù\u0012TÒ\u0083Ó¶ÅÝù«\u0014,«hXv\ròÊ\u0093?3ñµ×([".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var20[var28] = var55;
                                 if (var2 >= var5) {
                                    g = var6;
                                    h = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "².:Ô¾\u008fbñTvýN÷ð\u007f\u001a";
                                 var5 = "².:Ô¾\u008fbñTvýN÷ð\u007f\u001a".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "勼敄\u0014\u008aÙ«\u0083iÉÐiÖêû\u0001dâ\u0010|Ï\u0013Î\u009a";
                  var12 = "勼敄\u0014\u008aÙ«\u0083iÉÐiÖêû\u0001dâ\u0010|Ï\u0013Î\u009a".length();
                  var9 = 2;
                  var17 = -1;
            }

            var18 = 101;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





