package com.finalshell.ui.panel;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.C52;
import com.finalshell.ui.listener.Cu4;
import com.finalshell.ui.listener.FC3;
import com.finalshell.ui.listener.Fw4;
import com.finalshell.ui.listener.MK;
import com.finalshell.ui.listener.Wn2;
import com.finalshell.ui.model.UN;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;

public class EffectPreview extends Z7 {
   UN Z;
   JLabel u;
   JTable s;
   String V;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] f;

   public EffectPreview() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 410653314564457204L;
      Object[] var1 = var10001;
      Ref.h(410653314564457204L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   void V() {
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 306266403902896148L;
      Object[] var11 = var10003;
      Ref.h(306266403902896148L, var11, var12);
      Object[] var10004 = Registry.emptyArgs();
      long var14 = 227837117761533093L;
      Object[] var13 = var10004;
      var10004 = Ref.h(227837117761533093L, var13, var14);
      long var16 = 203837641958439669L;
      Object var15 = var10004;
      Ref.s(203837641958439669L, var15, var16);
      JLabel var10005 = new JLabel();
      long var18 = 174835000208644399L;
      JLabel var17 = var10005;
      Ref.s(174835000208644399L, var17, var18);
      Object var19 = 174835000208644399L;
      ((JLabel)Ref.g(174835000208644399L, var19)).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      Object var21 = 174835000208644399L;
      this.add((JLabel)Ref.g(174835000208644399L, var21), a(-9504, 28575));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-9485, 17726), a(-9487, 24780), a(-9481, -26903)));
      this.add(var2, a(-9478, 16469));
      JButton var3 = new JButton(a(-9480, -24248));
      var3.addActionListener(new FC3(this));
      var2.add(var3);
      JButton var4 = new JButton(a(-9479, -27712));
      var4.addActionListener(new Cu4(this));
      var2.add(var4);
      JButton var5 = new JButton(a(-9484, 21707));
      var5.addActionListener(new Wn2(this));
      var2.add(var5);
      JButton var6 = new JButton(a(-9482, -17871));
      var6.addActionListener(new Fw4(this));
      var2.add(var6);
      JButton var7 = new JButton(a(-9473, -14134));
      var7.setForeground(new Color(a(12849, 382274154077833550L)));
      var7.addActionListener(new MK(this));
      EnableBackgroundImage.I();
      var2.add(var7);
      JTable var10009 = new JTable();
      long var24 = 581380630510889882L;
      JTable var23 = var10009;
      Ref.s(581380630510889882L, var23, var24);
      Object var25 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var25)).setGridColor(new Color(a(30299, 6160291761540631845L)));
      Object var27 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var27)).getTableHeader().setVisible(false);
      Object var29 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var29)).setTableHeader(null);
      Object var31 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var31)).setSelectionMode(0);
      JScrollPane var10013;
      Object var33 = 581380630510889882L;
      super((JTable)Ref.g(581380630510889882L, var33));
      JScrollPane var8 = var10013;
      this.add(var8, a(-9477, -1249));
      Object[] var10014 = Registry.emptyArgs();
      long var36 = 419624596741622746L;
      Object[] var35 = var10014;
      Ref.h(419624596741622746L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Object var37 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var37)).getSelectionModel().addListSelectionListener(new C52(this));
      Object[] var10016 = Registry.emptyArgs();
      long var40 = 281646149899954334L;
      Object[] var39 = var10016;
      Ref.h(281646149899954334L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         EnableBackgroundImage.R(new Ky4[2]);
      }
   }

   void U() {
      UN var10001 = new UN();
      long var3 = 636070429409312733L;
      UN var2 = var10001;
      Ref.s(636070429409312733L, var2, var3);
      Object var4 = 636070429409312733L;
      Ref.g(636070429409312733L, var4);
      Object[] var10003 = Registry.packArgs(Registry.lookupField(385117300469648708L).get(null));
      long var7 = 415297149212967264L;
      Object[] var6 = var10003;
      Ref.h(415297149212967264L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object var8 = 581380630510889882L;
      JTable var10004 = (JTable)Ref.g(581380630510889882L, var8);
      Object var10 = 636070429409312733L;
      this.setModel((UN)Ref.g(636070429409312733L, var10));
      Object var12 = 636070429409312733L;
      Ref.g(636070429409312733L, var12);
      Object var14 = 203837641958439669L;
      Object[] var10008 = Registry.packArgs(Ref.g(203837641958439669L, var14));
      long var17 = 435388931657153202L;
      Object[] var16 = var10008;
      var10008 = Ref.h(435388931657153202L, var16, var17);

      try {
         var23 = (Integer)var10008;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      int var1 = var23;
      Object var18 = 581380630510889882L;
      ((JTable)Ref.g(581380630510889882L, var18)).getSelectionModel().setSelectionInterval(var1, var1);
   }

   void k(String var1) {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 338658270250730035L;
      Object[] var4 = var10002;
      Ref.h(338658270250730035L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10004 = Registry.packArgs(var1);
      long var9 = 448378562507554122L;
      Object[] var8 = var10004;
      Ref.h(448378562507554122L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10007 = Registry.emptyArgs();
      long var13 = 306266403902896148L;
      Object[] var12 = var10007;
      Ref.h(306266403902896148L, var12, var13);
      Object[] var10008 = Registry.emptyArgs();
      long var15 = 227837117761533093L;
      Object[] var14 = var10008;
      var10008 = Ref.h(227837117761533093L, var14, var15);
      long var17 = 203837641958439669L;
      Object var16 = var10008;
      Ref.s(203837641958439669L, var16, var17);
      Object[] var10009 = Registry.emptyArgs();
      long var19 = 281646149899954334L;
      Object[] var18 = var10009;
      Ref.h(281646149899954334L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   void H() {
      Object var1 = 174835000208644399L;
      JLabel var10001 = (JLabel)Ref.g(174835000208644399L, var1);
      new StringBuilder().append(a(-9486, -27094));
      Object var3 = 203837641958439669L;
      StringBuilder var10003 = this.append((String)Ref.g(203837641958439669L, var3)).append(a(-9475, -18162));
      Object var5 = 636070429409312733L;
      var10003.setText(this.append((UN)Ref.g(636070429409312733L, var5)).append(a(-9488, 20555)).toString());
      Object var7 = 174835000208644399L;
      JLabel var10004 = (JLabel)Ref.g(174835000208644399L, var7);
      new StringBuilder().append(a(-9483, -24686));
      Object var9 = 203837641958439669L;
      this.append((String)Ref.g(203837641958439669L, var9)).append(a(-9476, 10124));
      Object var11 = 636070429409312733L;
      Object var10008 = Ref.g(636070429409312733L, var11);
      ArrayList var10009 = (ArrayList)(Registry.emptyArgs());
      long var14 = 375227574693169611L;
      Object[] var13 = var10009;
      var10009 = Ref.h(375227574693169611L, var13, var14);

      try {
         var10009 = (ArrayList)var10009;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      this.setText(var10008.append(var10009.size()).append(a(-9474, 16059)).toString());
   }

   @Override
   public void A(Lv4_2 var1) {
   }

   @Override
   public Vg2 c() {
      return null;
   }

   @Override
   public void F(Lv4_2 var1) {
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -9488) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 123;
               break;
            case 1:
               var10000 = 183;
               break;
            case 2:
               var10000 = 223;
               break;
            case 3:
               var10000 = 127;
               break;
            case 4:
               var10000 = 167;
               break;
            case 5:
               var10000 = 130;
               break;
            case 6:
               var10000 = 33;
               break;
            case 7:
               var10000 = 96;
               break;
            case 8:
               var10000 = 35;
               break;
            case 9:
               var10000 = 79;
               break;
            case 10:
               var10000 = 188;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 133;
               break;
            case 13:
               var10000 = 169;
               break;
            case 14:
               var10000 = 14;
               break;
            case 15:
               var10000 = 22;
               break;
            case 16:
               var10000 = 46;
               break;
            case 17:
               var10000 = 175;
               break;
            case 18:
               var10000 = 49;
               break;
            case 19:
               var10000 = 137;
               break;
            case 20:
               var10000 = 244;
               break;
            case 21:
               var10000 = 64;
               break;
            case 22:
               var10000 = 176;
               break;
            case 23:
               var10000 = 109;
               break;
            case 24:
               var10000 = 77;
               break;
            case 25:
               var10000 = 102;
               break;
            case 26:
               var10000 = 234;
               break;
            case 27:
               var10000 = 32;
               break;
            case 28:
               var10000 = 18;
               break;
            case 29:
               var10000 = 72;
               break;
            case 30:
               var10000 = 191;
               break;
            case 31:
               var10000 = 31;
               break;
            case 32:
               var10000 = 8;
               break;
            case 33:
               var10000 = 73;
               break;
            case 34:
               var10000 = 140;
               break;
            case 35:
               var10000 = 37;
               break;
            case 36:
               var10000 = 111;
               break;
            case 37:
               var10000 = 252;
               break;
            case 38:
               var10000 = 146;
               break;
            case 39:
               var10000 = 3;
               break;
            case 40:
               var10000 = 243;
               break;
            case 41:
               var10000 = 203;
               break;
            case 42:
               var10000 = 242;
               break;
            case 43:
               var10000 = 164;
               break;
            case 44:
               var10000 = 125;
               break;
            case 45:
               var10000 = 104;
               break;
            case 46:
               var10000 = 159;
               break;
            case 47:
               var10000 = 106;
               break;
            case 48:
               var10000 = 229;
               break;
            case 49:
               var10000 = 114;
               break;
            case 50:
               var10000 = 196;
               break;
            case 51:
               var10000 = 0;
               break;
            case 52:
               var10000 = 143;
               break;
            case 53:
               var10000 = 122;
               break;
            case 54:
               var10000 = 221;
               break;
            case 55:
               var10000 = 39;
               break;
            case 56:
               var10000 = 246;
               break;
            case 57:
               var10000 = 182;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 66;
               break;
            case 60:
               var10000 = 44;
               break;
            case 61:
               var10000 = 168;
               break;
            case 62:
               var10000 = 205;
               break;
            case 63:
               var10000 = 118;
               break;
            case 64:
               var10000 = 21;
               break;
            case 65:
               var10000 = 207;
               break;
            case 66:
               var10000 = 85;
               break;
            case 67:
               var10000 = 58;
               break;
            case 68:
               var10000 = 209;
               break;
            case 69:
               var10000 = 156;
               break;
            case 70:
               var10000 = 115;
               break;
            case 71:
               var10000 = 101;
               break;
            case 72:
               var10000 = 152;
               break;
            case 73:
               var10000 = 217;
               break;
            case 74:
               var10000 = 95;
               break;
            case 75:
               var10000 = 89;
               break;
            case 76:
               var10000 = 237;
               break;
            case 77:
               var10000 = 20;
               break;
            case 78:
               var10000 = 51;
               break;
            case 79:
               var10000 = 170;
               break;
            case 80:
               var10000 = 2;
               break;
            case 81:
               var10000 = 11;
               break;
            case 82:
               var10000 = 147;
               break;
            case 83:
               var10000 = 84;
               break;
            case 84:
               var10000 = 165;
               break;
            case 85:
               var10000 = 153;
               break;
            case 86:
               var10000 = 48;
               break;
            case 87:
               var10000 = 142;
               break;
            case 88:
               var10000 = 54;
               break;
            case 89:
               var10000 = 75;
               break;
            case 90:
               var10000 = 23;
               break;
            case 91:
               var10000 = 200;
               break;
            case 92:
               var10000 = 247;
               break;
            case 93:
               var10000 = 87;
               break;
            case 94:
               var10000 = 184;
               break;
            case 95:
               var10000 = 47;
               break;
            case 96:
               var10000 = 227;
               break;
            case 97:
               var10000 = 208;
               break;
            case 98:
               var10000 = 253;
               break;
            case 99:
               var10000 = 78;
               break;
            case 100:
               var10000 = 17;
               break;
            case 101:
               var10000 = 136;
               break;
            case 102:
               var10000 = 50;
               break;
            case 103:
               var10000 = 99;
               break;
            case 104:
               var10000 = 198;
               break;
            case 105:
               var10000 = 250;
               break;
            case 106:
               var10000 = 92;
               break;
            case 107:
               var10000 = 239;
               break;
            case 108:
               var10000 = 69;
               break;
            case 109:
               var10000 = 107;
               break;
            case 110:
               var10000 = 7;
               break;
            case 111:
               var10000 = 249;
               break;
            case 112:
               var10000 = 74;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 100;
               break;
            case 115:
               var10000 = 65;
               break;
            case 116:
               var10000 = 236;
               break;
            case 117:
               var10000 = 83;
               break;
            case 118:
               var10000 = 98;
               break;
            case 119:
               var10000 = 141;
               break;
            case 120:
               var10000 = 251;
               break;
            case 121:
               var10000 = 189;
               break;
            case 122:
               var10000 = 172;
               break;
            case 123:
               var10000 = 232;
               break;
            case 124:
               var10000 = 128;
               break;
            case 125:
               var10000 = 30;
               break;
            case 126:
               var10000 = 105;
               break;
            case 127:
               var10000 = 82;
               break;
            case 128:
               var10000 = 163;
               break;
            case 129:
               var10000 = 76;
               break;
            case 130:
               var10000 = 204;
               break;
            case 131:
               var10000 = 199;
               break;
            case 132:
               var10000 = 245;
               break;
            case 133:
               var10000 = 25;
               break;
            case 134:
               var10000 = 88;
               break;
            case 135:
               var10000 = 112;
               break;
            case 136:
               var10000 = 220;
               break;
            case 137:
               var10000 = 110;
               break;
            case 138:
               var10000 = 230;
               break;
            case 139:
               var10000 = 42;
               break;
            case 140:
               var10000 = 15;
               break;
            case 141:
               var10000 = 197;
               break;
            case 142:
               var10000 = 202;
               break;
            case 143:
               var10000 = 214;
               break;
            case 144:
               var10000 = 139;
               break;
            case 145:
               var10000 = 10;
               break;
            case 146:
               var10000 = 218;
               break;
            case 147:
               var10000 = 254;
               break;
            case 148:
               var10000 = 43;
               break;
            case 149:
               var10000 = 215;
               break;
            case 150:
               var10000 = 5;
               break;
            case 151:
               var10000 = 38;
               break;
            case 152:
               var10000 = 26;
               break;
            case 153:
               var10000 = 180;
               break;
            case 154:
               var10000 = 126;
               break;
            case 155:
               var10000 = 131;
               break;
            case 156:
               var10000 = 52;
               break;
            case 157:
               var10000 = 134;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 16;
               break;
            case 160:
               var10000 = 190;
               break;
            case 161:
               var10000 = 4;
               break;
            case 162:
               var10000 = 171;
               break;
            case 163:
               var10000 = 117;
               break;
            case 164:
               var10000 = 62;
               break;
            case 165:
               var10000 = 187;
               break;
            case 166:
               var10000 = 185;
               break;
            case 167:
               var10000 = 166;
               break;
            case 168:
               var10000 = 210;
               break;
            case 169:
               var10000 = 248;
               break;
            case 170:
               var10000 = 226;
               break;
            case 171:
               var10000 = 192;
               break;
            case 172:
               var10000 = 121;
               break;
            case 173:
               var10000 = 45;
               break;
            case 174:
               var10000 = 113;
               break;
            case 175:
               var10000 = 160;
               break;
            case 176:
               var10000 = 157;
               break;
            case 177:
               var10000 = 238;
               break;
            case 178:
               var10000 = 57;
               break;
            case 179:
               var10000 = 178;
               break;
            case 180:
               var10000 = 28;
               break;
            case 181:
               var10000 = 206;
               break;
            case 182:
               var10000 = 119;
               break;
            case 183:
               var10000 = 240;
               break;
            case 184:
               var10000 = 6;
               break;
            case 185:
               var10000 = 228;
               break;
            case 186:
               var10000 = 86;
               break;
            case 187:
               var10000 = 186;
               break;
            case 188:
               var10000 = 19;
               break;
            case 189:
               var10000 = 91;
               break;
            case 190:
               var10000 = 194;
               break;
            case 191:
               var10000 = 174;
               break;
            case 192:
               var10000 = 255;
               break;
            case 193:
               var10000 = 155;
               break;
            case 194:
               var10000 = 177;
               break;
            case 195:
               var10000 = 103;
               break;
            case 196:
               var10000 = 70;
               break;
            case 197:
               var10000 = 41;
               break;
            case 198:
               var10000 = 60;
               break;
            case 199:
               var10000 = 55;
               break;
            case 200:
               var10000 = 235;
               break;
            case 201:
               var10000 = 1;
               break;
            case 202:
               var10000 = 29;
               break;
            case 203:
               var10000 = 61;
               break;
            case 204:
               var10000 = 56;
               break;
            case 205:
               var10000 = 181;
               break;
            case 206:
               var10000 = 71;
               break;
            case 207:
               var10000 = 148;
               break;
            case 208:
               var10000 = 129;
               break;
            case 209:
               var10000 = 97;
               break;
            case 210:
               var10000 = 12;
               break;
            case 211:
               var10000 = 120;
               break;
            case 212:
               var10000 = 36;
               break;
            case 213:
               var10000 = 201;
               break;
            case 214:
               var10000 = 68;
               break;
            case 215:
               var10000 = 225;
               break;
            case 216:
               var10000 = 59;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 161;
               break;
            case 219:
               var10000 = 80;
               break;
            case 220:
               var10000 = 40;
               break;
            case 221:
               var10000 = 9;
               break;
            case 222:
               var10000 = 224;
               break;
            case 223:
               var10000 = 219;
               break;
            case 224:
               var10000 = 144;
               break;
            case 225:
               var10000 = 179;
               break;
            case 226:
               var10000 = 53;
               break;
            case 227:
               var10000 = 162;
               break;
            case 228:
               var10000 = 108;
               break;
            case 229:
               var10000 = 135;
               break;
            case 230:
               var10000 = 13;
               break;
            case 231:
               var10000 = 158;
               break;
            case 232:
               var10000 = 173;
               break;
            case 233:
               var10000 = 124;
               break;
            case 234:
               var10000 = 213;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 231;
               break;
            case 237:
               var10000 = 193;
               break;
            case 238:
               var10000 = 216;
               break;
            case 239:
               var10000 = 233;
               break;
            case 240:
               var10000 = 241;
               break;
            case 241:
               var10000 = 195;
               break;
            case 242:
               var10000 = 93;
               break;
            case 243:
               var10000 = 150;
               break;
            case 244:
               var10000 = 211;
               break;
            case 245:
               var10000 = 27;
               break;
            case 246:
               var10000 = 222;
               break;
            case 247:
               var10000 = 116;
               break;
            case 248:
               var10000 = 151;
               break;
            case 249:
               var10000 = 145;
               break;
            case 250:
               var10000 = 24;
               break;
            case 251:
               var10000 = 67;
               break;
            case 252:
               var10000 = 132;
               break;
            case 253:
               var10000 = 90;
               break;
            case 254:
               var10000 = 94;
               break;
            default:
               var10000 = 154;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31614;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[17];
      int var11 = 0;
      String var10 = "x丹\u000f\u0001³1\u009dv\u0011\u0004vð×XlÂêÊ\u0006循劆鄸芭$`\u000e@0&+P\u0016\u001a\u0016\\Ýd@AÄ\u0004勵斵剡袓\u0006弧剢醉舱\u0012ó\u0003敒仦夝\u00051¤?Òq\u0002罇迕\u0004醲敬力辽\u0004\u0005¡A\u0093\u0012\u0089=Õ|Ç\u009cmtç\u0082Û¡\u001cÒ\u0085\u0004iu\u0004â恈儐\u009e\u0004µ悕出%\u0002æ中";
      int var12 = "x丹\u000f\u0001³1\u009dv\u0011\u0004vð×XlÂêÊ\u0006循劆鄸芭$`\u000e@0&+P\u0016\u001a\u0016\\Ýd@AÄ\u0004勵斵剡袓\u0006弧剢醉舱\u0012ó\u0003敒仦夝\u00051¤?Òq\u0002罇迕\u0004醲敬力辽\u0004\u0005¡A\u0093\u0012\u0089=Õ|Ç\u009cmtç\u0082Û¡\u001cÒ\u0085\u0004iu\u0004â恈儐\u009e\u0004µ悕出%\u0002æ中"
         .length();
      char var9 = 2;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 108;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 28;
                        break;
                     case 1:
                        var58 = 82;
                        break;
                     case 2:
                        var58 = 123;
                        break;
                     case 3:
                        var58 = 64;
                        break;
                     case 4:
                        var58 = 115;
                        break;
                     case 5:
                        var58 = 32;
                        break;
                     default:
                        var58 = 69;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[17];
                     long var0 = 4799246814344531161L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "l3z\u009a9Ç\u008d0`ÆFS\u008e<2\u0097";
                     int var5 = "l3z\u009a9Ç\u008d0`ÆFS\u008e<2\u0097".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     d = var6;
                     f = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "旽来顁覢\u0004\u001a!\u0080¡";
                  var12 = "旽来顁覢\u0004\u001a!\u0080¡".length();
                  var9 = 4;
                  var16 = -1;
            }

            var10000 = 39;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





