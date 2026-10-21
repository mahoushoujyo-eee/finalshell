package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import com.finalshell.ui.listener.Uy4;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class Tq4 extends JTable implements Xv2_2 {
   public com.finalshell.ui.model.FT e;
   public int H;
   public JPanel b;
   public int U;
   public Kn2 h;
   public boolean v;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   public Tq4(com.finalshell.ui.model.FT var1) {
      this(var1, true);
   }

   public Tq4(com.finalshell.ui.model.FT var1, boolean var2) {
   super();
      short var10000 = 25504;
      Registry.lookupField(410066848429556838L).setInt(this, -1);
      Registry.lookupField(458852233453534750L).setInt(this, -1);
      String[] var10002 = ClearListDialog.i$arrString();
      Registry.lookupField(119833151246978777L).setBoolean(this, true);
      Registry.lookupField(119833151246978777L).setBoolean(this, var2);
      long var9 = 463316647823010597L;
      Ref.s(463316647823010597L, var1, var9);
      this.setModel(var1);
      this.getTableHeader().setVisible(false);
      this.setTableHeader(null);
      this.setShowGrid(false);
      this.setShowHorizontalLines(false);
      this.setShowVerticalLines(false);
      this.setGridColor(Color.BLUE);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setOpaque(false);
      this.getSelectionModel().setSelectionMode(0);
      int var4 = a((int)7396951719067406216L, (long)var10002);
      this.setGridColor(new Color(var4, var4, var4));
      this.addMouseListener(new Uy4(this));
      this.addMouseMotionListener(new com.finalshell.ui.listener.CY(this));
      JPanel var31 = new JPanel();
      long var11 = 298076432091071542L;
      JPanel var10 = var31;
      Ref.s(298076432091071542L, var10, var11);
      Object var12 = 298076432091071542L;
      ((JPanel)Ref.g(298076432091071542L, var12)).setOpaque(false);
      Object var14 = 298076432091071542L;
      ((JPanel)Ref.g(298076432091071542L, var14)).setLayout(new MigLayout(a(4274, 25621), a(4272, 3109), a(4275, 32300)));
      Registry.packArgs("\uf04b");
      long var16 = 378399160856121064L;
      Object var10005 = Ref.h2(378399160856121064L, var16);

      try {
         var10005 = (C)var10005;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      C var5 = (C)var10005;
      var5.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var5.setForeground(new Color(a(2546, 7754082978386257372L), a(30277, 2442636872927337071L), a(24423, 2055976843247022922L)));
      Object var18 = 298076432091071542L;
      ((JPanel)Ref.g(298076432091071542L, var18)).add(var5);
      var5.addActionListener(new com.finalshell.ui.listener.Ls4(this, var1));
      Registry.packArgs("\uf0c5");
      long var20 = 378399160856121064L;
      Object var10007 = Ref.h2(378399160856121064L, var20);

      try {
         var10007 = (C)var10007;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      C var6 = (C)var10007;
      var6.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var6.setForeground(new Color(a(24423, 2055976843247022922L), a(2224, 3783931735129728155L), a(7284, 7328448178109821016L)));
      Object var22 = 298076432091071542L;
      ((JPanel)Ref.g(298076432091071542L, var22)).add(var6);
      var6.addActionListener(new com.finalshell.ui.listener.KN(this, var1));
      Registry.packArgs("\uf00d");
      long var24 = 378399160856121064L;
      Object var10009 = Ref.h2(378399160856121064L, var24);

      try {
         var10009 = (C)var10009;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      C var7 = (C)var10009;
      var7.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var7.setForeground(new Color(a(26485, 9138792654287719258L), a(24423, 2055976843247022922L), a(24423, 2055976843247022922L)));
      if (this == null) {
         if (var2) {
            Object var26 = 298076432091071542L;
            ((JPanel)Ref.g(298076432091071542L, var26)).add(var7);
         }

         var7.addActionListener(new com.finalshell.ui.listener.H_2(this, var1));
      }
   }

   public int L() {
      Point var1 = MouseInfo.getPointerInfo().getLocation();
      SwingUtilities.convertPointFromScreen(var1, this);
      return this.rowAtPoint(var1);
   }

   public void M() {
      Point var1 = MouseInfo.getPointerInfo().getLocation();
      SwingUtilities.convertPointFromScreen(var1, this);
      Registry.lookupField(458852233453534750L).setInt(this, this.rowAtPoint(var1));
   }

   @Override
   public Rectangle m(Point var1) {
      Object var7 = 298076432091071542L;
      ((JPanel)Ref.g(298076432091071542L, var7)).getPreferredSize();
      int var2 = this.rowAtPoint(var1);
      int var3 = this.convertRowIndexToModel(var2);
      Object var4 = var2 * this.getRowHeight();
      this.getParent().getParent().getWidth();
      Object var9 = 298076432091071542L;
      int var5 = this - ((JPanel)Ref.g(298076432091071542L, var9)).getPreferredSize().width - 5;
      Object var11 = 298076432091071542L;
      int var10006 = this - (((JPanel)Ref.g(298076432091071542L, var11)).getPreferredSize().height - this.getRowHeight()) / 2;
      Object var13 = 298076432091071542L;
      Object var15 = 298076432091071542L;
var10006 = new int[]{(int)this, ((JPanel)Ref.g(298076432091071542L, var13)).getPreferredSize().width, (int)this, ((JPanel)Ref.g(298076432091071542L, var15)).getPreferredSize().height};
      return (Rectangle)var4;
   }

   public void D(int var1, int var2) {
      String[] var3 = ClearListDialog.i$arrString();
      Container var10000 = this.getParent();
      if (var3 == null) {
         if (!(var10000 instanceof JViewport)) {
            return;
         }

         var10000 = this.getParent();
      }

      JViewport var5 = (JViewport)var10000;
      Rectangle var6 = this.getCellRect(var1, var2, true);
      Point var7 = var5.getViewPosition();
      var6.setLocation(var6.x - var7.x, var6.y - var7.y);
      this.scrollRectToVisible(var6);
   }

   @Override
   public void scrollRectToVisible(Rectangle var1) {
      super.scrollRectToVisible(var1);
   }

   @Override
   public JComponent K() {
      Object var1 = 298076432091071542L;
      return (JPanel)Ref.g(298076432091071542L, var1);
   }

   public Kn2 Q() {
      Object var1 = 381104070567601967L;
      return (Kn2)Ref.g(381104070567601967L, var1);
   }

   public void R(Kn2 var1) {
      long var3 = 381104070567601967L;
      Ref.s(381104070567601967L, var1, var3);
   }

   public static int y(Tq4 var0) {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 387507981730670112L;
      Object[] var1 = var10001;
      var10001 = Ref.h(387507981730670112L, var1, var2);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4274) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 39;
               break;
            case 1:
               var10000 = 88;
               break;
            case 2:
               var10000 = 82;
               break;
            case 3:
               var10000 = 168;
               break;
            case 4:
               var10000 = 149;
               break;
            case 5:
               var10000 = 187;
               break;
            case 6:
               var10000 = 134;
               break;
            case 7:
               var10000 = 159;
               break;
            case 8:
               var10000 = 108;
               break;
            case 9:
               var10000 = 166;
               break;
            case 10:
               var10000 = 61;
               break;
            case 11:
               var10000 = 77;
               break;
            case 12:
               var10000 = 34;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 151;
               break;
            case 15:
               var10000 = 12;
               break;
            case 16:
               var10000 = 124;
               break;
            case 17:
               var10000 = 131;
               break;
            case 18:
               var10000 = 49;
               break;
            case 19:
               var10000 = 171;
               break;
            case 20:
               var10000 = 98;
               break;
            case 21:
               var10000 = 182;
               break;
            case 22:
               var10000 = 111;
               break;
            case 23:
               var10000 = 201;
               break;
            case 24:
               var10000 = 78;
               break;
            case 25:
               var10000 = 205;
               break;
            case 26:
               var10000 = 180;
               break;
            case 27:
               var10000 = 37;
               break;
            case 28:
               var10000 = 86;
               break;
            case 29:
               var10000 = 177;
               break;
            case 30:
               var10000 = 100;
               break;
            case 31:
               var10000 = 215;
               break;
            case 32:
               var10000 = 207;
               break;
            case 33:
               var10000 = 0;
               break;
            case 34:
               var10000 = 45;
               break;
            case 35:
               var10000 = 21;
               break;
            case 36:
               var10000 = 59;
               break;
            case 37:
               var10000 = 5;
               break;
            case 38:
               var10000 = 189;
               break;
            case 39:
               var10000 = 246;
               break;
            case 40:
               var10000 = 62;
               break;
            case 41:
               var10000 = 150;
               break;
            case 42:
               var10000 = 130;
               break;
            case 43:
               var10000 = 176;
               break;
            case 44:
               var10000 = 214;
               break;
            case 45:
               var10000 = 97;
               break;
            case 46:
               var10000 = 235;
               break;
            case 47:
               var10000 = 202;
               break;
            case 48:
               var10000 = 178;
               break;
            case 49:
               var10000 = 94;
               break;
            case 50:
               var10000 = 196;
               break;
            case 51:
               var10000 = 69;
               break;
            case 52:
               var10000 = 185;
               break;
            case 53:
               var10000 = 125;
               break;
            case 54:
               var10000 = 31;
               break;
            case 55:
               var10000 = 113;
               break;
            case 56:
               var10000 = 249;
               break;
            case 57:
               var10000 = 173;
               break;
            case 58:
               var10000 = 254;
               break;
            case 59:
               var10000 = 118;
               break;
            case 60:
               var10000 = 24;
               break;
            case 61:
               var10000 = 228;
               break;
            case 62:
               var10000 = 42;
               break;
            case 63:
               var10000 = 46;
               break;
            case 64:
               var10000 = 146;
               break;
            case 65:
               var10000 = 36;
               break;
            case 66:
               var10000 = 26;
               break;
            case 67:
               var10000 = 7;
               break;
            case 68:
               var10000 = 192;
               break;
            case 69:
               var10000 = 148;
               break;
            case 70:
               var10000 = 194;
               break;
            case 71:
               var10000 = 193;
               break;
            case 72:
               var10000 = 244;
               break;
            case 73:
               var10000 = 137;
               break;
            case 74:
               var10000 = 223;
               break;
            case 75:
               var10000 = 28;
               break;
            case 76:
               var10000 = 58;
               break;
            case 77:
               var10000 = 53;
               break;
            case 78:
               var10000 = 81;
               break;
            case 79:
               var10000 = 155;
               break;
            case 80:
               var10000 = 161;
               break;
            case 81:
               var10000 = 231;
               break;
            case 82:
               var10000 = 114;
               break;
            case 83:
               var10000 = 30;
               break;
            case 84:
               var10000 = 181;
               break;
            case 85:
               var10000 = 204;
               break;
            case 86:
               var10000 = 23;
               break;
            case 87:
               var10000 = 70;
               break;
            case 88:
               var10000 = 122;
               break;
            case 89:
               var10000 = 233;
               break;
            case 90:
               var10000 = 240;
               break;
            case 91:
               var10000 = 190;
               break;
            case 92:
               var10000 = 232;
               break;
            case 93:
               var10000 = 230;
               break;
            case 94:
               var10000 = 57;
               break;
            case 95:
               var10000 = 117;
               break;
            case 96:
               var10000 = 4;
               break;
            case 97:
               var10000 = 66;
               break;
            case 98:
               var10000 = 11;
               break;
            case 99:
               var10000 = 234;
               break;
            case 100:
               var10000 = 156;
               break;
            case 101:
               var10000 = 158;
               break;
            case 102:
               var10000 = 17;
               break;
            case 103:
               var10000 = 74;
               break;
            case 104:
               var10000 = 68;
               break;
            case 105:
               var10000 = 116;
               break;
            case 106:
               var10000 = 90;
               break;
            case 107:
               var10000 = 255;
               break;
            case 108:
               var10000 = 52;
               break;
            case 109:
               var10000 = 25;
               break;
            case 110:
               var10000 = 164;
               break;
            case 111:
               var10000 = 245;
               break;
            case 112:
               var10000 = 51;
               break;
            case 113:
               var10000 = 121;
               break;
            case 114:
               var10000 = 2;
               break;
            case 115:
               var10000 = 65;
               break;
            case 116:
               var10000 = 147;
               break;
            case 117:
               var10000 = 157;
               break;
            case 118:
               var10000 = 144;
               break;
            case 119:
               var10000 = 225;
               break;
            case 120:
               var10000 = 217;
               break;
            case 121:
               var10000 = 243;
               break;
            case 122:
               var10000 = 64;
               break;
            case 123:
               var10000 = 152;
               break;
            case 124:
               var10000 = 203;
               break;
            case 125:
               var10000 = 136;
               break;
            case 126:
               var10000 = 154;
               break;
            case 127:
               var10000 = 120;
               break;
            case 128:
               var10000 = 224;
               break;
            case 129:
               var10000 = 199;
               break;
            case 130:
               var10000 = 44;
               break;
            case 131:
               var10000 = 38;
               break;
            case 132:
               var10000 = 165;
               break;
            case 133:
               var10000 = 54;
               break;
            case 134:
               var10000 = 213;
               break;
            case 135:
               var10000 = 71;
               break;
            case 136:
               var10000 = 123;
               break;
            case 137:
               var10000 = 127;
               break;
            case 138:
               var10000 = 13;
               break;
            case 139:
               var10000 = 237;
               break;
            case 140:
               var10000 = 3;
               break;
            case 141:
               var10000 = 8;
               break;
            case 142:
               var10000 = 252;
               break;
            case 143:
               var10000 = 174;
               break;
            case 144:
               var10000 = 126;
               break;
            case 145:
               var10000 = 191;
               break;
            case 146:
               var10000 = 236;
               break;
            case 147:
               var10000 = 216;
               break;
            case 148:
               var10000 = 91;
               break;
            case 149:
               var10000 = 106;
               break;
            case 150:
               var10000 = 55;
               break;
            case 151:
               var10000 = 20;
               break;
            case 152:
               var10000 = 200;
               break;
            case 153:
               var10000 = 208;
               break;
            case 154:
               var10000 = 183;
               break;
            case 155:
               var10000 = 93;
               break;
            case 156:
               var10000 = 103;
               break;
            case 157:
               var10000 = 105;
               break;
            case 158:
               var10000 = 169;
               break;
            case 159:
               var10000 = 33;
               break;
            case 160:
               var10000 = 85;
               break;
            case 161:
               var10000 = 18;
               break;
            case 162:
               var10000 = 50;
               break;
            case 163:
               var10000 = 129;
               break;
            case 164:
               var10000 = 195;
               break;
            case 165:
               var10000 = 251;
               break;
            case 166:
               var10000 = 101;
               break;
            case 167:
               var10000 = 175;
               break;
            case 168:
               var10000 = 80;
               break;
            case 169:
               var10000 = 6;
               break;
            case 170:
               var10000 = 84;
               break;
            case 171:
               var10000 = 48;
               break;
            case 172:
               var10000 = 63;
               break;
            case 173:
               var10000 = 47;
               break;
            case 174:
               var10000 = 188;
               break;
            case 175:
               var10000 = 145;
               break;
            case 176:
               var10000 = 184;
               break;
            case 177:
               var10000 = 139;
               break;
            case 178:
               var10000 = 75;
               break;
            case 179:
               var10000 = 109;
               break;
            case 180:
               var10000 = 99;
               break;
            case 181:
               var10000 = 247;
               break;
            case 182:
               var10000 = 198;
               break;
            case 183:
               var10000 = 43;
               break;
            case 184:
               var10000 = 27;
               break;
            case 185:
               var10000 = 95;
               break;
            case 186:
               var10000 = 14;
               break;
            case 187:
               var10000 = 112;
               break;
            case 188:
               var10000 = 179;
               break;
            case 189:
               var10000 = 9;
               break;
            case 190:
               var10000 = 172;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 138;
               break;
            case 193:
               var10000 = 72;
               break;
            case 194:
               var10000 = 41;
               break;
            case 195:
               var10000 = 1;
               break;
            case 196:
               var10000 = 119;
               break;
            case 197:
               var10000 = 242;
               break;
            case 198:
               var10000 = 22;
               break;
            case 199:
               var10000 = 107;
               break;
            case 200:
               var10000 = 143;
               break;
            case 201:
               var10000 = 35;
               break;
            case 202:
               var10000 = 229;
               break;
            case 203:
               var10000 = 163;
               break;
            case 204:
               var10000 = 83;
               break;
            case 205:
               var10000 = 102;
               break;
            case 206:
               var10000 = 227;
               break;
            case 207:
               var10000 = 211;
               break;
            case 208:
               var10000 = 221;
               break;
            case 209:
               var10000 = 133;
               break;
            case 210:
               var10000 = 92;
               break;
            case 211:
               var10000 = 170;
               break;
            case 212:
               var10000 = 79;
               break;
            case 213:
               var10000 = 10;
               break;
            case 214:
               var10000 = 219;
               break;
            case 215:
               var10000 = 19;
               break;
            case 216:
               var10000 = 141;
               break;
            case 217:
               var10000 = 186;
               break;
            case 218:
               var10000 = 56;
               break;
            case 219:
               var10000 = 132;
               break;
            case 220:
               var10000 = 209;
               break;
            case 221:
               var10000 = 60;
               break;
            case 222:
               var10000 = 238;
               break;
            case 223:
               var10000 = 73;
               break;
            case 224:
               var10000 = 226;
               break;
            case 225:
               var10000 = 104;
               break;
            case 226:
               var10000 = 115;
               break;
            case 227:
               var10000 = 197;
               break;
            case 228:
               var10000 = 32;
               break;
            case 229:
               var10000 = 128;
               break;
            case 230:
               var10000 = 253;
               break;
            case 231:
               var10000 = 212;
               break;
            case 232:
               var10000 = 16;
               break;
            case 233:
               var10000 = 29;
               break;
            case 234:
               var10000 = 87;
               break;
            case 235:
               var10000 = 250;
               break;
            case 236:
               var10000 = 67;
               break;
            case 237:
               var10000 = 135;
               break;
            case 238:
               var10000 = 220;
               break;
            case 239:
               var10000 = 160;
               break;
            case 240:
               var10000 = 206;
               break;
            case 241:
               var10000 = 222;
               break;
            case 242:
               var10000 = 110;
               break;
            case 243:
               var10000 = 218;
               break;
            case 244:
               var10000 = 76;
               break;
            case 245:
               var10000 = 162;
               break;
            case 246:
               var10000 = 140;
               break;
            case 247:
               var10000 = 153;
               break;
            case 248:
               var10000 = 89;
               break;
            case 249:
               var10000 = 96;
               break;
            case 250:
               var10000 = 241;
               break;
            case 251:
               var10000 = 40;
               break;
            case 252:
               var10000 = 248;
               break;
            case 253:
               var10000 = 210;
               break;
            case 254:
               var10000 = 142;
               break;
            default:
               var10000 = 15;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11310;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "+\u0000\r\b\u009c_G\rûøµ]F¡\u0005\u0005(!ZGt\u0005£Á+[Z";
      int var12 = "+\u0000\r\b\u009c_G\rûøµ]F¡\u0005\u0005(!ZGt\u0005£Á+[Z".length();
      char var9 = 15;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 89;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 89;
               var10006 = var14;
            } else {
               var27 = 89;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 89;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 58;
                     break;
                  case 1:
                     var47 = 71;
                     break;
                  case 2:
                     var47 = 106;
                     break;
                  case 3:
                     var47 = 84;
                     break;
                  case 4:
                     var47 = 107;
                     break;
                  case 5:
                     var47 = 28;
                     break;
                  default:
                     var47 = 17;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            c = new String[3];
            long var0 = 2815947432195903799L;
            long[] var6 = new long[7];
            int var3 = 0;
            String var4 = "Í´\u0002³ï¨t»çÔüEÈñ\u001aÍ%\u000eB\u008ci-á§úà\u001bÖâ\u001f\"-¢¹ªñt/\u000bÔ";
            int var5 = "Í´\u0002³ï¨t»çÔüEÈñ\u001aÍ%\u000eB\u008ci-á§úà\u001bÖâ\u001f\"-¢¹ªñt/\u000bÔ".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           d = var6;
                           f = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "\\QGÆL\u0089õÈ²Ó;Âñ\u008f\u009ew";
                        var5 = "\\QGÆL\u0089õÈ²Ó;Âñ\u008f\u009ew".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





