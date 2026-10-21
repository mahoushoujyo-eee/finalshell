package com.finalshell.ui.panel;

import com.finalshell.core.KV;
import com.finalshell.core.RemoteProcessManager;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Fa2;
import com.finalshell.ui.listener.DQ;
import com.finalshell.ui.listener.Dd2;
import com.finalshell.ui.listener.JB;
import com.finalshell.ui.listener.Le2;
import com.finalshell.ui.listener.TerminateProcessConfirmListener;
import com.finalshell.ui.listener.Pp;
import com.finalshell.ui.listener.Q5;
import com.finalshell.ui.listener.Ur2;
import com.finalshell.ui.model.Gk2;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class TerminateProcessPanel extends JPanel {
   public Uo2 M;
   public Gk2 t;
   public CT U;
   public int u;
   public int S;
   public boolean A;
   public RemoteProcessManager d;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public TerminateProcessPanel(boolean var1, RemoteProcessManager var2) {
      super();
      Registry.lookupField(356967793820925117L).setInt(this, -1);
      Registry.lookupField(480311688723572747L).setInt(this, -1);
      Registry.lookupField(261689646727117349L).setBoolean(this, false);
      Registry.lookupField(261689646727117349L).setBoolean(this, var1);
      long var14 = 525494908816748907L;
      Ref.s(525494908816748907L, var2, var14);
      this.setOpaque(false);
      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10004 = Registry.emptyArgs();
      long var18 = 399585344452154517L;
      Object[] var17 = var10004;
      Ref.h(399585344452154517L, var17, var18);
      TerminateProcessPanel var10005 = Registry.emptyArgs();
      long var20 = 149968465491171480L;
      Object var19 = var10005;
      var10005 = (TerminateProcessPanel)Ref.h(149968465491171480L, var19, var20);
      Color var10006 = (Color)(Registry.emptyArgs());
      long var22 = 345089686683358688L;
      Object var21 = var10006;
      var10006 = Ref.h(345089686683358688L, var21, var22);

      try {
         var10006 = (Color)var10006;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      var10005.setBackground(var10006);
      this.setPreferredSize(new Dimension(a(8141, 7503464904360218499L), a(20785, 5399733676005425534L)));
      this.setLayout(new MigLayout(a(-19428, 22810), a(-19429, 8418), a(-19432, -30388)));
      JPopupMenu var4 = new JPopupMenu();
      JMenuItem var5 = new JMenuItem(a(-19427, 6525));
      var5.addActionListener(new TerminateProcessConfirmListener(this, var2));
      var4.add(var5);
      var4.addSeparator();
      JMenuItem var6 = new JMenuItem(a(-19436, -12156));
      var6.addActionListener(new Q5(this));
      var4.add(var6);
      JMenuItem var7 = new JMenuItem(a(-19431, 30453));
      Uo2.i();
      var7.addActionListener(new Dd2(this));
      var4.add(var7);
      JMenuItem var8 = new JMenuItem(a(-19435, -291));
      var8.addActionListener(new JB(this));
      var4.add(var8);
      JMenuItem var9 = new JMenuItem(a(-19425, -29908));
      var9.addActionListener(new DQ(this));
      var4.add(var9);
      JMenuItem var10 = new JMenuItem(a(-19430, -30721));
      var10.addActionListener(new Ur2(this));
      Uo2 var10007 = new Uo2(var1);
      long var24 = 342129762932297171L;
      Uo2 var23 = var10007;
      Ref.s(342129762932297171L, var23, var24);
      Object var25 = 342129762932297171L;
      ((Uo2)Ref.g(342129762932297171L, var25)).setOpaque(false);
      Object var27 = 342129762932297171L;
      ((Uo2)Ref.g(342129762932297171L, var27)).getSelectionModel().addListSelectionListener(new Pp(this));
      Object var29 = 342129762932297171L;
      ((Uo2)Ref.g(342129762932297171L, var29)).addMouseListener(new Le2(this, var8, var9, var4));
      JScrollPane var10010;
      Object var31 = 342129762932297171L;
      // [VF-super] super((Uo2)Ref.g(342129762932297171L, var31));
      JScrollPane var11 = var10010;
      this.add(var11, a(-19426, 26607));
      var11.setBackground(Color.blue);
      var11.getViewport().setBackground(Color.blue);
      var11.setOpaque(false);
      var11.getViewport().setOpaque(false);
      var11.addMouseListener(new com.finalshell.ui.listener.QX(this));
      Gk2 var10011 = new Gk2(var1);
      long var34 = 435109479173232140L;
      Gk2 var33 = var10011;
      Ref.s(435109479173232140L, var33, var34);
      ArrayList var12 = new ArrayList();
      Object var35 = 435109479173232140L;
      Ref.g(435109479173232140L, var35);
      Object[] var10015 = Registry.emptyArgs();
      long var38 = 121632250293569146L;
      Object[] var37 = var10015;
      Object[] var10014 = Registry.packArgs(var2, Ref.h(121632250293569146L, var37, var38));
      long var40 = 458222231249276992L;
      Object[] var39 = var10014;
      Ref.h(458222231249276992L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      Object var41 = 342129762932297171L;
      Ref.g(342129762932297171L, var41);
      Object var43 = 435109479173232140L;
      Object[] var10017 = Registry.packArgs(Ref.g(435109479173232140L, var43));
      long var46 = 515035633884749095L;
      Object[] var45 = var10017;
      Ref.h(515035633884749095L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Object[] var10018 = Registry.emptyArgs();
      long var48 = 335277021954772688L;
      Object[] var47 = var10018;
      Ref.h(335277021954772688L, var47, var48);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         Uo2.J(this == null);
      }
   }

   public void j() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Fa2(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void c() {
   }

   public void G(ArrayList var1, KV var2) {
      Uo2.i();
      Object var6 = 435109479173232140L;
      Object var10002 = Ref.g(435109479173232140L, var6);
      Object[] var10003 = Registry.packArgs(var1, var2);
      long var9 = 458222231249276992L;
      Object[] var8 = var10003;
      Ref.h(458222231249276992L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Object var3 = var10002;
      var10002 = Registry.lookupField(480311688723572747L).getInt(this);
      if (var3 == null) {
         TerminateProcessPanel var4 = (TerminateProcessPanel)var10002;
         var10002 = var4;
         if (var3 == null) {
            if (!(var4 > -1)) {
               return;
            }

            var10002 = this;
            Object var14 = 342129762932297171L;
            ((Uo2)Ref.g(342129762932297171L, var14)).convertRowIndexToView((int)var4);
         }

         TerminateProcessPanel var5 = (TerminateProcessPanel)var10002;
         Object var16 = 342129762932297171L;
         ((Uo2)Ref.g(342129762932297171L, var16)).getSelectionModel().setSelectionInterval((int)var5, (int)var5);
      } else if (var10002 > -1) {
         var10002 = this;
         Object var10 = 435109479173232140L;
         Ref.g(435109479173232140L, var10);
         Object[] var10004 = Registry.packArgs(Registry.lookupField(480311688723572747L).getInt(this));
         long var13 = 126832136261952786L;
         Object[] var12 = var10004;
         var10004 = Ref.h(126832136261952786L, var12, var13);

         label22:
         try {
            break label22;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }
      }
   }

   public CT q() {
      Object var1 = 625890154666924805L;
      return (CT)Ref.g(625890154666924805L, var1);
   }

   public void c(CT var1) {
      long var3 = 625890154666924805L;
      Ref.s(625890154666924805L, var1, var3);
   }

   public Uo2 W() {
      Object var1 = 342129762932297171L;
      return (Uo2)Ref.g(342129762932297171L, var1);
   }

   public void p(Uo2 var1) {
      long var3 = 342129762932297171L;
      Ref.s(342129762932297171L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -19428) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 86;
               break;
            case 1:
               var10000 = 56;
               break;
            case 2:
               var10000 = 62;
               break;
            case 3:
               var10000 = 70;
               break;
            case 4:
               var10000 = 18;
               break;
            case 5:
               var10000 = 142;
               break;
            case 6:
               var10000 = 253;
               break;
            case 7:
               var10000 = 10;
               break;
            case 8:
               var10000 = 103;
               break;
            case 9:
               var10000 = 159;
               break;
            case 10:
               var10000 = 4;
               break;
            case 11:
               var10000 = 144;
               break;
            case 12:
               var10000 = 72;
               break;
            case 13:
               var10000 = 90;
               break;
            case 14:
               var10000 = 6;
               break;
            case 15:
               var10000 = 172;
               break;
            case 16:
               var10000 = 175;
               break;
            case 17:
               var10000 = 251;
               break;
            case 18:
               var10000 = 3;
               break;
            case 19:
               var10000 = 226;
               break;
            case 20:
               var10000 = 166;
               break;
            case 21:
               var10000 = 130;
               break;
            case 22:
               var10000 = 220;
               break;
            case 23:
               var10000 = 106;
               break;
            case 24:
               var10000 = 173;
               break;
            case 25:
               var10000 = 247;
               break;
            case 26:
               var10000 = 207;
               break;
            case 27:
               var10000 = 34;
               break;
            case 28:
               var10000 = 57;
               break;
            case 29:
               var10000 = 110;
               break;
            case 30:
               var10000 = 68;
               break;
            case 31:
               var10000 = 221;
               break;
            case 32:
               var10000 = 29;
               break;
            case 33:
               var10000 = 102;
               break;
            case 34:
               var10000 = 75;
               break;
            case 35:
               var10000 = 241;
               break;
            case 36:
               var10000 = 158;
               break;
            case 37:
               var10000 = 2;
               break;
            case 38:
               var10000 = 153;
               break;
            case 39:
               var10000 = 108;
               break;
            case 40:
               var10000 = 66;
               break;
            case 41:
               var10000 = 117;
               break;
            case 42:
               var10000 = 20;
               break;
            case 43:
               var10000 = 27;
               break;
            case 44:
               var10000 = 201;
               break;
            case 45:
               var10000 = 190;
               break;
            case 46:
               var10000 = 9;
               break;
            case 47:
               var10000 = 150;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 191;
               break;
            case 50:
               var10000 = 105;
               break;
            case 51:
               var10000 = 236;
               break;
            case 52:
               var10000 = 81;
               break;
            case 53:
               var10000 = 171;
               break;
            case 54:
               var10000 = 91;
               break;
            case 55:
               var10000 = 255;
               break;
            case 56:
               var10000 = 32;
               break;
            case 57:
               var10000 = 11;
               break;
            case 58:
               var10000 = 184;
               break;
            case 59:
               var10000 = 181;
               break;
            case 60:
               var10000 = 36;
               break;
            case 61:
               var10000 = 17;
               break;
            case 62:
               var10000 = 218;
               break;
            case 63:
               var10000 = 230;
               break;
            case 64:
               var10000 = 23;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 28;
               break;
            case 67:
               var10000 = 136;
               break;
            case 68:
               var10000 = 239;
               break;
            case 69:
               var10000 = 53;
               break;
            case 70:
               var10000 = 196;
               break;
            case 71:
               var10000 = 55;
               break;
            case 72:
               var10000 = 79;
               break;
            case 73:
               var10000 = 227;
               break;
            case 74:
               var10000 = 235;
               break;
            case 75:
               var10000 = 133;
               break;
            case 76:
               var10000 = 180;
               break;
            case 77:
               var10000 = 208;
               break;
            case 78:
               var10000 = 47;
               break;
            case 79:
               var10000 = 197;
               break;
            case 80:
               var10000 = 100;
               break;
            case 81:
               var10000 = 42;
               break;
            case 82:
               var10000 = 111;
               break;
            case 83:
               var10000 = 121;
               break;
            case 84:
               var10000 = 25;
               break;
            case 85:
               var10000 = 76;
               break;
            case 86:
               var10000 = 98;
               break;
            case 87:
               var10000 = 97;
               break;
            case 88:
               var10000 = 43;
               break;
            case 89:
               var10000 = 58;
               break;
            case 90:
               var10000 = 124;
               break;
            case 91:
               var10000 = 200;
               break;
            case 92:
               var10000 = 71;
               break;
            case 93:
               var10000 = 164;
               break;
            case 94:
               var10000 = 40;
               break;
            case 95:
               var10000 = 245;
               break;
            case 96:
               var10000 = 92;
               break;
            case 97:
               var10000 = 232;
               break;
            case 98:
               var10000 = 87;
               break;
            case 99:
               var10000 = 228;
               break;
            case 100:
               var10000 = 141;
               break;
            case 101:
               var10000 = 206;
               break;
            case 102:
               var10000 = 234;
               break;
            case 103:
               var10000 = 125;
               break;
            case 104:
               var10000 = 64;
               break;
            case 105:
               var10000 = 84;
               break;
            case 106:
               var10000 = 88;
               break;
            case 107:
               var10000 = 246;
               break;
            case 108:
               var10000 = 96;
               break;
            case 109:
               var10000 = 143;
               break;
            case 110:
               var10000 = 237;
               break;
            case 111:
               var10000 = 162;
               break;
            case 112:
               var10000 = 148;
               break;
            case 113:
               var10000 = 123;
               break;
            case 114:
               var10000 = 107;
               break;
            case 115:
               var10000 = 156;
               break;
            case 116:
               var10000 = 169;
               break;
            case 117:
               var10000 = 82;
               break;
            case 118:
               var10000 = 254;
               break;
            case 119:
               var10000 = 21;
               break;
            case 120:
               var10000 = 116;
               break;
            case 121:
               var10000 = 67;
               break;
            case 122:
               var10000 = 24;
               break;
            case 123:
               var10000 = 233;
               break;
            case 124:
               var10000 = 187;
               break;
            case 125:
               var10000 = 69;
               break;
            case 126:
               var10000 = 95;
               break;
            case 127:
               var10000 = 155;
               break;
            case 128:
               var10000 = 152;
               break;
            case 129:
               var10000 = 214;
               break;
            case 130:
               var10000 = 80;
               break;
            case 131:
               var10000 = 203;
               break;
            case 132:
               var10000 = 157;
               break;
            case 133:
               var10000 = 63;
               break;
            case 134:
               var10000 = 217;
               break;
            case 135:
               var10000 = 202;
               break;
            case 136:
               var10000 = 147;
               break;
            case 137:
               var10000 = 216;
               break;
            case 138:
               var10000 = 45;
               break;
            case 139:
               var10000 = 113;
               break;
            case 140:
               var10000 = 188;
               break;
            case 141:
               var10000 = 219;
               break;
            case 142:
               var10000 = 249;
               break;
            case 143:
               var10000 = 211;
               break;
            case 144:
               var10000 = 49;
               break;
            case 145:
               var10000 = 145;
               break;
            case 146:
               var10000 = 170;
               break;
            case 147:
               var10000 = 89;
               break;
            case 148:
               var10000 = 104;
               break;
            case 149:
               var10000 = 179;
               break;
            case 150:
               var10000 = 78;
               break;
            case 151:
               var10000 = 19;
               break;
            case 152:
               var10000 = 151;
               break;
            case 153:
               var10000 = 109;
               break;
            case 154:
               var10000 = 163;
               break;
            case 155:
               var10000 = 99;
               break;
            case 156:
               var10000 = 39;
               break;
            case 157:
               var10000 = 33;
               break;
            case 158:
               var10000 = 13;
               break;
            case 159:
               var10000 = 46;
               break;
            case 160:
               var10000 = 74;
               break;
            case 161:
               var10000 = 192;
               break;
            case 162:
               var10000 = 161;
               break;
            case 163:
               var10000 = 127;
               break;
            case 164:
               var10000 = 129;
               break;
            case 165:
               var10000 = 30;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 83;
               break;
            case 168:
               var10000 = 193;
               break;
            case 169:
               var10000 = 189;
               break;
            case 170:
               var10000 = 7;
               break;
            case 171:
               var10000 = 225;
               break;
            case 172:
               var10000 = 52;
               break;
            case 173:
               var10000 = 35;
               break;
            case 174:
               var10000 = 215;
               break;
            case 175:
               var10000 = 248;
               break;
            case 176:
               var10000 = 199;
               break;
            case 177:
               var10000 = 194;
               break;
            case 178:
               var10000 = 22;
               break;
            case 179:
               var10000 = 8;
               break;
            case 180:
               var10000 = 213;
               break;
            case 181:
               var10000 = 0;
               break;
            case 182:
               var10000 = 210;
               break;
            case 183:
               var10000 = 154;
               break;
            case 184:
               var10000 = 14;
               break;
            case 185:
               var10000 = 238;
               break;
            case 186:
               var10000 = 41;
               break;
            case 187:
               var10000 = 240;
               break;
            case 188:
               var10000 = 15;
               break;
            case 189:
               var10000 = 85;
               break;
            case 190:
               var10000 = 73;
               break;
            case 191:
               var10000 = 112;
               break;
            case 192:
               var10000 = 16;
               break;
            case 193:
               var10000 = 44;
               break;
            case 194:
               var10000 = 146;
               break;
            case 195:
               var10000 = 65;
               break;
            case 196:
               var10000 = 101;
               break;
            case 197:
               var10000 = 115;
               break;
            case 198:
               var10000 = 93;
               break;
            case 199:
               var10000 = 212;
               break;
            case 200:
               var10000 = 128;
               break;
            case 201:
               var10000 = 38;
               break;
            case 202:
               var10000 = 26;
               break;
            case 203:
               var10000 = 31;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 168;
               break;
            case 206:
               var10000 = 224;
               break;
            case 207:
               var10000 = 118;
               break;
            case 208:
               var10000 = 223;
               break;
            case 209:
               var10000 = 50;
               break;
            case 210:
               var10000 = 229;
               break;
            case 211:
               var10000 = 243;
               break;
            case 212:
               var10000 = 242;
               break;
            case 213:
               var10000 = 204;
               break;
            case 214:
               var10000 = 160;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 37;
               break;
            case 217:
               var10000 = 132;
               break;
            case 218:
               var10000 = 61;
               break;
            case 219:
               var10000 = 244;
               break;
            case 220:
               var10000 = 131;
               break;
            case 221:
               var10000 = 114;
               break;
            case 222:
               var10000 = 138;
               break;
            case 223:
               var10000 = 122;
               break;
            case 224:
               var10000 = 205;
               break;
            case 225:
               var10000 = 185;
               break;
            case 226:
               var10000 = 177;
               break;
            case 227:
               var10000 = 252;
               break;
            case 228:
               var10000 = 119;
               break;
            case 229:
               var10000 = 51;
               break;
            case 230:
               var10000 = 120;
               break;
            case 231:
               var10000 = 222;
               break;
            case 232:
               var10000 = 183;
               break;
            case 233:
               var10000 = 195;
               break;
            case 234:
               var10000 = 209;
               break;
            case 235:
               var10000 = 1;
               break;
            case 236:
               var10000 = 12;
               break;
            case 237:
               var10000 = 54;
               break;
            case 238:
               var10000 = 231;
               break;
            case 239:
               var10000 = 250;
               break;
            case 240:
               var10000 = 182;
               break;
            case 241:
               var10000 = 174;
               break;
            case 242:
               var10000 = 176;
               break;
            case 243:
               var10000 = 94;
               break;
            case 244:
               var10000 = 137;
               break;
            case 245:
               var10000 = 126;
               break;
            case 246:
               var10000 = 167;
               break;
            case 247:
               var10000 = 48;
               break;
            case 248:
               var10000 = 77;
               break;
            case 249:
               var10000 = 165;
               break;
            case 250:
               var10000 = 178;
               break;
            case 251:
               var10000 = 5;
               break;
            case 252:
               var10000 = 149;
               break;
            case 253:
               var10000 = 59;
               break;
            case 254:
               var10000 = 60;
               break;
            default:
               var10000 = 134;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20558;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[10];
      int var11 = 0;
      String var10 = "ßè\u008e\u001aoõá\u0091cv©\u001f=3¡\u0004纟欦辻稠\u001df\u0087s\u00019ö®ÉÃ\\¿Z÷\u008b\u00adf;\u0001\u001e\u0000êGÆ¿T\u0007\u00800\u001e\u0004妲功俵羬\u00058\u0086E¼\u0014\u0004奦助启秴\u0004縗杴迒竰\u0005Ve\u0088À\u00ad";
      int var12 = "ßè\u008e\u001aoõá\u0091cv©\u001f=3¡\u0004纟欦辻稠\u001df\u0087s\u00019ö®ÉÃ\\¿Z÷\u008b\u00adf;\u0001\u001e\u0000êGÆ¿T\u0007\u00800\u001e\u0004妲功俵羬\u00058\u0086E¼\u0014\u0004奦助启秴\u0004縗杴迒竰\u0005Ve\u0088À\u00ad"
         .length();
      char var9 = 15;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 96;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var58 = 74;
                        break;
                     case 1:
                        var58 = 61;
                        break;
                     case 2:
                        var58 = 103;
                        break;
                     case 3:
                        var58 = 10;
                        break;
                     case 4:
                        var58 = 87;
                        break;
                     case 5:
                        var58 = 33;
                        break;
                     default:
                        var58 = 80;
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
                     b = new String[10];
                     long var0 = 7465193142172524758L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "W\u001dÓ\u000f\u001bàHEÄ´(\u0099\u0012ä\u0086¸";
                     int var5 = "W\u001dÓ\u000f\u001bàHEÄ´(\u0099\u0012ä\u0086¸".length();
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

                     c = var6;
                     e = new Integer[2];
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

                  var10 = "头刄\u0010Ðã\u0005姣劌哇乬袙";
                  var12 = "头刄\u0010Ðã\u0005姣劌哇乬袙".length();
                  var9 = 5;
                  var16 = -1;
            }

            var10000 = 105;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





