package com.finalshell.ui.panel;

import com.finalshell.core.Dw4;
import com.finalshell.core.L9;
import com.finalshell.core.UA3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Da2;
import com.finalshell.task.UM;
import com.finalshell.ui.listener.CI3;
import com.finalshell.ui.listener.Gb2;
import com.finalshell.ui.listener.K__2;
import com.finalshell.ui.listener.NQ;
import com.finalshell.ui.listener.O52;
import com.finalshell.ui.listener.Q3;
import com.finalshell.ui.model.DR;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class RouteTracePanel extends JPanel {
   public UA3 q;
   public DR K;
   public Dw4 Q;
   public String E;
   public F5 t;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   public RouteTracePanel(String var1, F5 var2) {
   super(this, (String)Ref.g(515268954690772930L, var1));
   DR var33;
      long var12 = 515268954690772930L;
      Ref.s(515268954690772930L, var1, var12);
      long var14 = 185868897793230818L;
      Ref.s(185868897793230818L, var2, var14);
      L9.X();
      this.setOpaque(false);
      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 399585344452154517L;
      Object[] var17 = var10006;
      var10006 = Ref.h(399585344452154517L, var17, var18);
      RouteTracePanel var10007 = Registry.emptyArgs();
      long var20 = 149968465491171480L;
      Object var19 = var10007;
      var10007 = (RouteTracePanel)Ref.h(149968465491171480L, var19, var20);
      Color var10008 = (Color)(Registry.emptyArgs());
      long var22 = 345089686683358688L;
      Object var21 = var10008;
      var10008 = Ref.h(345089686683358688L, var21, var22);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      var10007.setBackground(var10008);
      this.setPreferredSize(new Dimension(a(18253, 3771843793046212466L), a(31264, 3109442504975692318L)));
      this.setLayout(new MigLayout(a(-8024, 23906), a(-8020, 14307), a(-8021, -24681)));
      JPopupMenu var4 = new JPopupMenu();
      JMenuItem var5 = new JMenuItem(a(-8017, 29205));
      var5.addActionListener(new Gb2(this));
      Object var3 = var10006;
      var4.add(var5);
      JMenuItem var6 = new JMenuItem(a(-8023, 4052));
      var6.addActionListener(new Q3(this));
      var4.add(var6);
      JMenuItem var7 = new JMenuItem(a(-8019, -7310));
      var7.addActionListener(new K__2(this));
      var4.add(var7);
      UA3 var53 = new UA3();
      long var24 = 266946451169580014L;
      UA3 var23 = var53;
      Ref.s(266946451169580014L, var23, var24);
      Object var25 = 266946451169580014L;
      ((UA3)Ref.g(266946451169580014L, var25)).setOpaque(false);
      Object var27 = 266946451169580014L;
      ((UA3)Ref.g(266946451169580014L, var27)).getSelectionModel().addListSelectionListener(new NQ(this));
      Object var29 = 266946451169580014L;
      ((UA3)Ref.g(266946451169580014L, var29)).addMouseListener(new O52(this, var2, var6, var5, var4));
      JScrollPane var10011;
      Object var31 = 266946451169580014L;
      // [VF-super] super((UA3)Ref.g(266946451169580014L, var31));
      JScrollPane var8 = var10011;
      this.add(var8, a(-8018, -26478));
      var8.setBackground(Color.blue);
      var8.getViewport().setBackground(Color.blue);
      var8.setOpaque(false);
      var8.getViewport().setOpaque(false);
      var8.addMouseListener(new CI3(this));
      DR var10012 = new DR();
      long var34 = 434008521855552520L;
      var33 = var10012;
      Ref.s(434008521855552520L, var33, var34);
      L9 var9 = new L9();
      ArrayList var10 = new ArrayList();
      var10.add(var9);
      Object var35 = 434008521855552520L;
      Ref.g(434008521855552520L, var35);
      Object[] var10014 = Registry.packArgs(var10);
      long var38 = 441147601158038608L;
      Object[] var37 = var10014;
      Ref.h(441147601158038608L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      Object var39 = 266946451169580014L;
      Ref.g(266946451169580014L, var39);
      Object var41 = 434008521855552520L;
      Object[] var10017 = Registry.packArgs(Ref.g(434008521855552520L, var41));
      long var44 = 418115237337733019L;
      Object[] var43 = var10017;
      Ref.h(418115237337733019L, var43, var44);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      Object[] var10018 = Registry.emptyArgs();
      long var46 = 344377977684219796L;
      Object[] var45 = var10018;
      Ref.h(344377977684219796L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      if (var3 != null) {
         Ky4.K(new String[1]);
      }
   }

   public void H() {
      int[] var10000 = L9.X();
      int var2 = 0;
      int[] var1 = var10000;

      while (var2 < 5) {
         try {
            Object var6 = 515268954690772930L;
            InetAddress var3 = InetAddress.getByName((String)Ref.g(515268954690772930L, var6));
            String var4 = var3.getHostAddress();
            Object var8 = 185868897793230818L;
            Ref.g(185868897793230818L, var8);
            Object[] var10003 = Registry.emptyArgs();
            long var11 = 629411790963347134L;
            Object[] var10 = var10003;
            Ref.h(629411790963347134L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            new StringBuilder().append(a(-8022, 895));
            Object var12 = 515268954690772930L;
            Object[] var10005 = Registry.packArgs(this.append((String)Ref.g(515268954690772930L, var12)).toString(), var4, -1);
            long var15 = 411401147617277002L;
            Object[] var14 = var10005;
            Ref.h(411401147617277002L, var14, var15);
            break;
         } catch (UnknownHostException var18) {
            try {
               Thread.sleep(e);
            } catch (InterruptedException var16) {
               var16.printStackTrace();
            }

            var2++;
            if (var1 != null) {
               break;
            }
         }
      }
   }

   public void N() {
      Dw4 var10002;
      Object var1 = 515268954690772930L;
      long var4 = 498715864659540734L;
      Dw4 var3 = var10002;
      Ref.s(498715864659540734L, var3, var4);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10003 = Registry.packArgs(new Da2(this));
      long var6 = 434592463220957006L;
      Object[] var5 = var10003;
      Ref.h(434592463220957006L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10004 = Registry.packArgs(new UM(this));
      long var8 = 434592463220957006L;
      Object[] var7 = var10004;
      Ref.h(434592463220957006L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void z() {
      Object var1 = 498715864659540734L;
      Ref.g(498715864659540734L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 228543544839699439L;
      Object[] var3 = var10002;
      Ref.h(228543544839699439L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void N(L9 var1) {
      Object var2 = 434008521855552520L;
      Ref.g(434008521855552520L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 348406851833570241L;
      Object[] var4 = var10002;
      Ref.h(348406851833570241L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void m() {
      Object var2 = 498715864659540734L;
      Ref.g(498715864659540734L, var2);
      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var5 = 287584207520852054L;
      Object var4 = var10002;
      var10002 = Ref.h(287584207520852054L, var4, var5);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      ArrayList var1 = var10002;
      Object var6 = 434008521855552520L;
      Ref.g(434008521855552520L, var6);
      Object[] var10004 = Registry.packArgs(var1);
      long var9 = 441147601158038608L;
      Object[] var8 = var10004;
      Ref.h(441147601158038608L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public F5 A() {
      Object var1 = 185868897793230818L;
      return (F5)Ref.g(185868897793230818L, var1);
   }

   public void s(F5 var1) {
      long var3 = 185868897793230818L;
      Ref.s(185868897793230818L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -8020) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 111;
               break;
            case 1:
               var10000 = 41;
               break;
            case 2:
               var10000 = 109;
               break;
            case 3:
               var10000 = 254;
               break;
            case 4:
               var10000 = 224;
               break;
            case 5:
               var10000 = 229;
               break;
            case 6:
               var10000 = 83;
               break;
            case 7:
               var10000 = 45;
               break;
            case 8:
               var10000 = 74;
               break;
            case 9:
               var10000 = 36;
               break;
            case 10:
               var10000 = 182;
               break;
            case 11:
               var10000 = 131;
               break;
            case 12:
               var10000 = 247;
               break;
            case 13:
               var10000 = 167;
               break;
            case 14:
               var10000 = 101;
               break;
            case 15:
               var10000 = 244;
               break;
            case 16:
               var10000 = 73;
               break;
            case 17:
               var10000 = 30;
               break;
            case 18:
               var10000 = 157;
               break;
            case 19:
               var10000 = 206;
               break;
            case 20:
               var10000 = 40;
               break;
            case 21:
               var10000 = 119;
               break;
            case 22:
               var10000 = 150;
               break;
            case 23:
               var10000 = 95;
               break;
            case 24:
               var10000 = 47;
               break;
            case 25:
               var10000 = 180;
               break;
            case 26:
               var10000 = 198;
               break;
            case 27:
               var10000 = 124;
               break;
            case 28:
               var10000 = 201;
               break;
            case 29:
               var10000 = 185;
               break;
            case 30:
               var10000 = 51;
               break;
            case 31:
               var10000 = 134;
               break;
            case 32:
               var10000 = 97;
               break;
            case 33:
               var10000 = 137;
               break;
            case 34:
               var10000 = 1;
               break;
            case 35:
               var10000 = 129;
               break;
            case 36:
               var10000 = 204;
               break;
            case 37:
               var10000 = 9;
               break;
            case 38:
               var10000 = 251;
               break;
            case 39:
               var10000 = 0;
               break;
            case 40:
               var10000 = 5;
               break;
            case 41:
               var10000 = 245;
               break;
            case 42:
               var10000 = 250;
               break;
            case 43:
               var10000 = 183;
               break;
            case 44:
               var10000 = 29;
               break;
            case 45:
               var10000 = 22;
               break;
            case 46:
               var10000 = 76;
               break;
            case 47:
               var10000 = 232;
               break;
            case 48:
               var10000 = 195;
               break;
            case 49:
               var10000 = 240;
               break;
            case 50:
               var10000 = 216;
               break;
            case 51:
               var10000 = 255;
               break;
            case 52:
               var10000 = 120;
               break;
            case 53:
               var10000 = 246;
               break;
            case 54:
               var10000 = 13;
               break;
            case 55:
               var10000 = 100;
               break;
            case 56:
               var10000 = 31;
               break;
            case 57:
               var10000 = 177;
               break;
            case 58:
               var10000 = 98;
               break;
            case 59:
               var10000 = 12;
               break;
            case 60:
               var10000 = 170;
               break;
            case 61:
               var10000 = 32;
               break;
            case 62:
               var10000 = 3;
               break;
            case 63:
               var10000 = 189;
               break;
            case 64:
               var10000 = 169;
               break;
            case 65:
               var10000 = 174;
               break;
            case 66:
               var10000 = 133;
               break;
            case 67:
               var10000 = 210;
               break;
            case 68:
               var10000 = 220;
               break;
            case 69:
               var10000 = 235;
               break;
            case 70:
               var10000 = 116;
               break;
            case 71:
               var10000 = 173;
               break;
            case 72:
               var10000 = 186;
               break;
            case 73:
               var10000 = 141;
               break;
            case 74:
               var10000 = 125;
               break;
            case 75:
               var10000 = 39;
               break;
            case 76:
               var10000 = 54;
               break;
            case 77:
               var10000 = 175;
               break;
            case 78:
               var10000 = 82;
               break;
            case 79:
               var10000 = 21;
               break;
            case 80:
               var10000 = 249;
               break;
            case 81:
               var10000 = 128;
               break;
            case 82:
               var10000 = 165;
               break;
            case 83:
               var10000 = 144;
               break;
            case 84:
               var10000 = 50;
               break;
            case 85:
               var10000 = 238;
               break;
            case 86:
               var10000 = 179;
               break;
            case 87:
               var10000 = 20;
               break;
            case 88:
               var10000 = 145;
               break;
            case 89:
               var10000 = 209;
               break;
            case 90:
               var10000 = 158;
               break;
            case 91:
               var10000 = 110;
               break;
            case 92:
               var10000 = 199;
               break;
            case 93:
               var10000 = 52;
               break;
            case 94:
               var10000 = 33;
               break;
            case 95:
               var10000 = 105;
               break;
            case 96:
               var10000 = 81;
               break;
            case 97:
               var10000 = 236;
               break;
            case 98:
               var10000 = 166;
               break;
            case 99:
               var10000 = 46;
               break;
            case 100:
               var10000 = 68;
               break;
            case 101:
               var10000 = 91;
               break;
            case 102:
               var10000 = 59;
               break;
            case 103:
               var10000 = 15;
               break;
            case 104:
               var10000 = 211;
               break;
            case 105:
               var10000 = 140;
               break;
            case 106:
               var10000 = 194;
               break;
            case 107:
               var10000 = 6;
               break;
            case 108:
               var10000 = 61;
               break;
            case 109:
               var10000 = 107;
               break;
            case 110:
               var10000 = 221;
               break;
            case 111:
               var10000 = 219;
               break;
            case 112:
               var10000 = 172;
               break;
            case 113:
               var10000 = 231;
               break;
            case 114:
               var10000 = 85;
               break;
            case 115:
               var10000 = 70;
               break;
            case 116:
               var10000 = 197;
               break;
            case 117:
               var10000 = 168;
               break;
            case 118:
               var10000 = 253;
               break;
            case 119:
               var10000 = 187;
               break;
            case 120:
               var10000 = 239;
               break;
            case 121:
               var10000 = 19;
               break;
            case 122:
               var10000 = 237;
               break;
            case 123:
               var10000 = 16;
               break;
            case 124:
               var10000 = 115;
               break;
            case 125:
               var10000 = 159;
               break;
            case 126:
               var10000 = 78;
               break;
            case 127:
               var10000 = 178;
               break;
            case 128:
               var10000 = 176;
               break;
            case 129:
               var10000 = 4;
               break;
            case 130:
               var10000 = 2;
               break;
            case 131:
               var10000 = 99;
               break;
            case 132:
               var10000 = 127;
               break;
            case 133:
               var10000 = 26;
               break;
            case 134:
               var10000 = 55;
               break;
            case 135:
               var10000 = 161;
               break;
            case 136:
               var10000 = 28;
               break;
            case 137:
               var10000 = 89;
               break;
            case 138:
               var10000 = 149;
               break;
            case 139:
               var10000 = 71;
               break;
            case 140:
               var10000 = 181;
               break;
            case 141:
               var10000 = 67;
               break;
            case 142:
               var10000 = 72;
               break;
            case 143:
               var10000 = 35;
               break;
            case 144:
               var10000 = 217;
               break;
            case 145:
               var10000 = 69;
               break;
            case 146:
               var10000 = 138;
               break;
            case 147:
               var10000 = 154;
               break;
            case 148:
               var10000 = 215;
               break;
            case 149:
               var10000 = 233;
               break;
            case 150:
               var10000 = 130;
               break;
            case 151:
               var10000 = 148;
               break;
            case 152:
               var10000 = 63;
               break;
            case 153:
               var10000 = 37;
               break;
            case 154:
               var10000 = 104;
               break;
            case 155:
               var10000 = 164;
               break;
            case 156:
               var10000 = 160;
               break;
            case 157:
               var10000 = 102;
               break;
            case 158:
               var10000 = 230;
               break;
            case 159:
               var10000 = 90;
               break;
            case 160:
               var10000 = 151;
               break;
            case 161:
               var10000 = 156;
               break;
            case 162:
               var10000 = 212;
               break;
            case 163:
               var10000 = 202;
               break;
            case 164:
               var10000 = 43;
               break;
            case 165:
               var10000 = 135;
               break;
            case 166:
               var10000 = 93;
               break;
            case 167:
               var10000 = 17;
               break;
            case 168:
               var10000 = 214;
               break;
            case 169:
               var10000 = 208;
               break;
            case 170:
               var10000 = 162;
               break;
            case 171:
               var10000 = 213;
               break;
            case 172:
               var10000 = 193;
               break;
            case 173:
               var10000 = 38;
               break;
            case 174:
               var10000 = 103;
               break;
            case 175:
               var10000 = 62;
               break;
            case 176:
               var10000 = 23;
               break;
            case 177:
               var10000 = 153;
               break;
            case 178:
               var10000 = 108;
               break;
            case 179:
               var10000 = 248;
               break;
            case 180:
               var10000 = 147;
               break;
            case 181:
               var10000 = 242;
               break;
            case 182:
               var10000 = 87;
               break;
            case 183:
               var10000 = 75;
               break;
            case 184:
               var10000 = 146;
               break;
            case 185:
               var10000 = 188;
               break;
            case 186:
               var10000 = 126;
               break;
            case 187:
               var10000 = 196;
               break;
            case 188:
               var10000 = 234;
               break;
            case 189:
               var10000 = 114;
               break;
            case 190:
               var10000 = 7;
               break;
            case 191:
               var10000 = 56;
               break;
            case 192:
               var10000 = 241;
               break;
            case 193:
               var10000 = 8;
               break;
            case 194:
               var10000 = 11;
               break;
            case 195:
               var10000 = 184;
               break;
            case 196:
               var10000 = 117;
               break;
            case 197:
               var10000 = 84;
               break;
            case 198:
               var10000 = 203;
               break;
            case 199:
               var10000 = 14;
               break;
            case 200:
               var10000 = 226;
               break;
            case 201:
               var10000 = 86;
               break;
            case 202:
               var10000 = 53;
               break;
            case 203:
               var10000 = 94;
               break;
            case 204:
               var10000 = 121;
               break;
            case 205:
               var10000 = 42;
               break;
            case 206:
               var10000 = 49;
               break;
            case 207:
               var10000 = 152;
               break;
            case 208:
               var10000 = 171;
               break;
            case 209:
               var10000 = 142;
               break;
            case 210:
               var10000 = 77;
               break;
            case 211:
               var10000 = 205;
               break;
            case 212:
               var10000 = 25;
               break;
            case 213:
               var10000 = 227;
               break;
            case 214:
               var10000 = 252;
               break;
            case 215:
               var10000 = 228;
               break;
            case 216:
               var10000 = 113;
               break;
            case 217:
               var10000 = 222;
               break;
            case 218:
               var10000 = 118;
               break;
            case 219:
               var10000 = 122;
               break;
            case 220:
               var10000 = 24;
               break;
            case 221:
               var10000 = 136;
               break;
            case 222:
               var10000 = 155;
               break;
            case 223:
               var10000 = 112;
               break;
            case 224:
               var10000 = 66;
               break;
            case 225:
               var10000 = 18;
               break;
            case 226:
               var10000 = 192;
               break;
            case 227:
               var10000 = 58;
               break;
            case 228:
               var10000 = 64;
               break;
            case 229:
               var10000 = 163;
               break;
            case 230:
               var10000 = 218;
               break;
            case 231:
               var10000 = 57;
               break;
            case 232:
               var10000 = 60;
               break;
            case 233:
               var10000 = 132;
               break;
            case 234:
               var10000 = 88;
               break;
            case 235:
               var10000 = 80;
               break;
            case 236:
               var10000 = 96;
               break;
            case 237:
               var10000 = 48;
               break;
            case 238:
               var10000 = 27;
               break;
            case 239:
               var10000 = 79;
               break;
            case 240:
               var10000 = 34;
               break;
            case 241:
               var10000 = 92;
               break;
            case 242:
               var10000 = 44;
               break;
            case 243:
               var10000 = 139;
               break;
            case 244:
               var10000 = 143;
               break;
            case 245:
               var10000 = 200;
               break;
            case 246:
               var10000 = 10;
               break;
            case 247:
               var10000 = 123;
               break;
            case 248:
               var10000 = 223;
               break;
            case 249:
               var10000 = 225;
               break;
            case 250:
               var10000 = 207;
               break;
            case 251:
               var10000 = 191;
               break;
            case 252:
               var10000 = 106;
               break;
            case 253:
               var10000 = 190;
               break;
            case 254:
               var10000 = 243;
               break;
            default:
               var10000 = 65;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18494;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var15 = new String[8];
      int var13 = 0;
      String var12 = "Hð\u008b\u001bx\u0004跟痢辖軉\u001dÔfåT^I\u0085åþ\u0019qG;ïï²³òºk¹ñô©{pp\u0019Û\u0004夼勶àÖ\u000fr\"û*tæE(¯\u0081YT6\u009d\u001b\u0005姺勞乊枹呺";
      int var14 = "Hð\u008b\u001bx\u0004跟痢辖軉\u001dÔfåT^I\u0085åþ\u0019qG;ïï²³òºk¹ñô©{pp\u0019Û\u0004夼勶àÖ\u000fr\"û*tæE(¯\u0081YT6\u009d\u001b\u0005姺勞乊枹呺"
         .length();
      char var11 = 5;
      int var18 = -1;

      label61:
      while (true) {
         byte var10000 = 64;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label56;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 30;
                        break;
                     case 1:
                        var62 = 76;
                        break;
                     case 2:
                        var62 = 9;
                        break;
                     case 3:
                        var62 = 105;
                        break;
                     case 4:
                        var62 = 11;
                        break;
                     case 5:
                        var62 = 124;
                        break;
                     default:
                        var62 = 56;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     a = var15;
                     b = new String[8];
                     long var2 = 611858979599765662L;
                     long[] var8 = new long[2];
                     int var5 = 0;
                     String var6 = "´\u0098ï©Ý>Å\u0090'ø\u0082¶\u0013exü";
                     int var7 = "´\u0098ï©Ý>Å\u0090'ø\u0082¶\u0013exü".length();
                     byte var4 = 0;

                     do {
                        byte var26 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var26, var4).getBytes("ISO-8859-1");
                        int var27 = var5++;
                        long var51 = (
                              ((long)var9[0] & 255L) << 56
                                 | ((long)var9[1] & 255L) << 48
                                 | ((long)var9[2] & 255L) << 40
                                 | ((long)var9[3] & 255L) << 32
                                 | ((long)var9[4] & 255L) << 24
                                 | ((long)var9[5] & 255L) << 16
                                 | ((long)var9[6] & 255L) << 8
                                 | (long)var9[7] & 255L
                           )
                           ^ var2;
                        byte var44 = -1;
                        var8[var27] = var51;
                     } while (var4 < var7);

                     c = var8;
                     d = new Integer[2];
                     long var0 = 6774717728278654491L;
                     long var37 = 6774717728278654451L ^ var0;
                     byte var28 = -1;
                     e = var37;
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label61;
                  }

                  var12 = "于杙a\u0005\u0093¿¾¼\u0090";
                  var14 = "于杙a\u0005\u0093¿¾¼\u0090".length();
                  var11 = 3;
                  var18 = -1;
            }

            var10000 = 107;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }
}





