package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Bf4;
import com.finalshell.ui.model.K42;
import com.finalshell.ui.panel.KA_3;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class JR extends JTable {
   K42 Y;
   int p;
   int B;
   com.finalshell.ui.panel.N22 h;
   Color i;
   Color k;
   String N;
   Color X;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public JR(com.finalshell.ui.panel.N22 var1) {
      Registry.lookupField(176933019416346079L).setInt(this, -1);
      Registry.lookupField(464424401591829371L).setInt(this, -1);
      Color var10001 = new Color(a(25089, 7395008992551565110L), a(19226, 1270942700254780985L), a(5995, 8322675085880132167L));
      long var3 = 262573955458954459L;
      Color var2 = var10001;
      Ref.s(262573955458954459L, var2, var3);
      Color var10002 = new Color(a(16860, 7641780260002682104L), a(32342, 4342733992817060704L), a(11097, 1858316679076757100L));
      long var5 = 435262014696409152L;
      Color var4 = var10002;
      Ref.s(435262014696409152L, var4, var5);
      long var7 = 355468840123996031L;
      Object var6 = null;
      Ref.s(355468840123996031L, var6, var7);
      Color var10004 = new Color(a(19762, 349580683889235997L), a(5087, 8862321516161795834L), a(28206, 3219004516474157829L), a(23550, 5536560008764509910L));
      long var9 = 211147456586738223L;
      Color var8 = var10004;
      Ref.s(211147456586738223L, var8, var9);
      long var11 = 395952663097565614L;
      Ref.s(395952663097565614L, var1, var11);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
      this.setCursor(new Cursor(a(24513, 7117678895264910060L)));
      this.addMouseListener(new com.finalshell.ui.listener.Ya4(this));
      this.getTableHeader().setDefaultRenderer(new com.finalshell.ui.adapter.Bx2(this, var1));
      this.getTableHeader().setPreferredSize(new Dimension(a(5975, 3196386394400588407L), a(11236, 5782915369733439173L)));
      this.getTableHeader().addMouseListener(new Bf4(this, var1));
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      Object var3 = 211147456586738223L;
      this.setColor((Color)Ref.g(211147456586738223L, var3));
      var1.drawRect(0, -1, this.getWidth() - 1, this.getHeight());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void K(KV var1, String var2) {
      long var9 = 355468840123996031L;
      Ref.s(355468840123996031L, var2, var9);
      KA_3.y$arrky_4();
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var11 = 604361570872278918L;
      Object[] var10 = var10003;
      var10003 = Ref.h(604361570872278918L, var10, var11);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      ArrayList var4 = var10003;
      KV var3 = var1;
      int var5 = Registry.lookupField(149407827136588388L).getInt(null);
      var10003 = Registry.emptyArgs();
      long var13 = 559196035657690421L;
      Object[] var12 = var10003;
      var10003 = Ref.h(559196035657690421L, var12, var13);

      try {
         var10003 = (Ty2)var10003;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      label86: {
         if (var1 == null) {
            if (var10003 == null) {
               break label86;
            }

            Object[] var10004 = Registry.emptyArgs();
            long var15 = 559196035657690421L;
            Object[] var14 = var10004;
            Ref.h(559196035657690421L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }
         }

         Object[] var32 = Registry.emptyArgs();
         long var17 = 589495788544429046L;
         Object[] var16 = var32;
         var32 = Ref.h(589495788544429046L, var16, var17);

         try {
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }
      }

      ArrayList var6 = new ArrayList();
      int var7 = 0;

      label74:
      while (true) {
         int var34;
         int var10005;
         if (var7 < Registry.lookupField(190401741690531753L).getInt(null)) {
            var34 = var7;
            var10005 = var4.size();
            if (var3 == null && var3 == null) {
               if (var7 < var10005) {
                  var6.add((LI3_2)var4.get(var7));
                  var7++;
                  if (var3 == null) {
                     continue;
                  }
               }

               var34 = var4.size();
               var10005 = Registry.lookupField(190401741690531753L).getInt(null);
            }
         } else {
            var34 = var4.size();
            var10005 = Registry.lookupField(190401741690531753L).getInt(null);
         }

         while (true) {
            if (var34 >= var10005) {
               break label74;
            }

            var4.add(null);
            if (var3 != null) {
               return;
            }

            if (var3 != null) {
               break label74;
            }

            var34 = var4.size();
            var10005 = Registry.lookupField(190401741690531753L).getInt(null);
         }
      }

      Object var18 = 278039161395767975L;
      Ref.g(278039161395767975L, var18);
      Object[] var10006 = Registry.packArgs(var6);
      long var21 = 552647206567648104L;
      Object[] var20 = var10006;
      Ref.h(552647206567648104L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }
   }

   JLabel y() {
      JLabel var1 = new JLabel();
      var1.setBorder(BorderFactory.createEmptyBorder(2, 2, 1, 0));
      var1.setOpaque(false);
      var1.setHorizontalAlignment(2);
      var1.setForeground(
         new Color(a(28856, 185736809000134042L), a(23550, 5536560008764509910L), a(23550, 5536560008764509910L), a(3029, 4684608334202117883L))
      );
      var1.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      return var1;
   }

   public void n(K42 var1) {
      KA_3.y$arrky_4();
      long var10 = 278039161395767975L;
      Ref.s(278039161395767975L, var1, var10);
      JR var2 = this;
      super.setModel(var1);
      TableColumnModel var3 = this.getColumnModel();
      this.setPreferredScrollableViewportSize(new Dimension(a(12719, 63017233631814790L), a(31554, 4720521623290277480L)));
      label44:
      if (this == null) {
         if (var3.getColumnCount() > 2) {
            int var4 = a(7844, 3516213051383778178L);
            com.finalshell.ui.panel.CU3 var5 = new com.finalshell.ui.panel.CU3();
            var5.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
            var5.setText(a(31658, -23736));
            int var6 = var5.getPreferredSize().width;
            var3.getColumn(0).setPreferredWidth(++var6);
            var3.getColumn(0).setMinWidth(var6);
            var3.getColumn(0).setMaxWidth(var6);
            Registry.packArgs(a(31659, 27641), var5.getFont());
            long var11 = 408611976812192060L;
            Object var10002 = Ref.h2(408611976812192060L, var11);

            try {
               var21 = (Integer)var10002;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var6 = var21;
            var6 += 4;
            var3.getColumn(1).setPreferredWidth(var6);
            var3.getColumn(1).setMinWidth(var6);
            var3.getColumn(1).setMaxWidth(var6);
            var3.getColumn(2).setPreferredWidth(a(23550, 5536560008764509910L));
            var3.getColumn(2).setMinWidth(a(23550, 5536560008764509910L));
            var3.getColumn(2).setMaxWidth(a(24623, 8315527868074259720L));
            com.finalshell.ui.adapter.Lc2 var7 = new com.finalshell.ui.adapter.Lc2();
            int var8 = 0;

            while (var8 < var3.getColumnCount()) {
               var3.getColumn(var8).setCellRenderer(var7);
               var8++;
               if (var2 != null) {
                  break label44;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         this.getTableHeader().addMouseListener(new com.finalshell.ui.listener.Uu2(this));
      }

      JTableHeader var17 = this.getTableHeader();
      Registry.emptyArgs();
      long var13 = 454647487873911743L;
      Object var22 = Ref.h2(454647487873911743L, var13);

      try {
         var23 = (Boolean)var22;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      if (var23) {
         var17.addMouseListener(new com.finalshell.ui.listener.U6(this, var17));
      }
   }

   public int Z() {
      return Registry.lookupField(176933019416346079L).getInt(this);
   }

   public void P(int var1) {
      Registry.lookupField(176933019416346079L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 31658) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 149;
               break;
            case 1:
               var10000 = 56;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 171;
               break;
            case 4:
               var10000 = 20;
               break;
            case 5:
               var10000 = 184;
               break;
            case 6:
               var10000 = 133;
               break;
            case 7:
               var10000 = 146;
               break;
            case 8:
               var10000 = 27;
               break;
            case 9:
               var10000 = 150;
               break;
            case 10:
               var10000 = 36;
               break;
            case 11:
               var10000 = 205;
               break;
            case 12:
               var10000 = 231;
               break;
            case 13:
               var10000 = 90;
               break;
            case 14:
               var10000 = 7;
               break;
            case 15:
               var10000 = 159;
               break;
            case 16:
               var10000 = 223;
               break;
            case 17:
               var10000 = 227;
               break;
            case 18:
               var10000 = 25;
               break;
            case 19:
               var10000 = 206;
               break;
            case 20:
               var10000 = 78;
               break;
            case 21:
               var10000 = 226;
               break;
            case 22:
               var10000 = 102;
               break;
            case 23:
               var10000 = 49;
               break;
            case 24:
               var10000 = 12;
               break;
            case 25:
               var10000 = 230;
               break;
            case 26:
               var10000 = 58;
               break;
            case 27:
               var10000 = 100;
               break;
            case 28:
               var10000 = 245;
               break;
            case 29:
               var10000 = 113;
               break;
            case 30:
               var10000 = 2;
               break;
            case 31:
               var10000 = 204;
               break;
            case 32:
               var10000 = 190;
               break;
            case 33:
               var10000 = 175;
               break;
            case 34:
               var10000 = 185;
               break;
            case 35:
               var10000 = 4;
               break;
            case 36:
               var10000 = 188;
               break;
            case 37:
               var10000 = 3;
               break;
            case 38:
               var10000 = 57;
               break;
            case 39:
               var10000 = 244;
               break;
            case 40:
               var10000 = 99;
               break;
            case 41:
               var10000 = 179;
               break;
            case 42:
               var10000 = 129;
               break;
            case 43:
               var10000 = 85;
               break;
            case 44:
               var10000 = 86;
               break;
            case 45:
               var10000 = 101;
               break;
            case 46:
               var10000 = 107;
               break;
            case 47:
               var10000 = 97;
               break;
            case 48:
               var10000 = 26;
               break;
            case 49:
               var10000 = 63;
               break;
            case 50:
               var10000 = 62;
               break;
            case 51:
               var10000 = 23;
               break;
            case 52:
               var10000 = 220;
               break;
            case 53:
               var10000 = 196;
               break;
            case 54:
               var10000 = 191;
               break;
            case 55:
               var10000 = 221;
               break;
            case 56:
               var10000 = 10;
               break;
            case 57:
               var10000 = 145;
               break;
            case 58:
               var10000 = 119;
               break;
            case 59:
               var10000 = 178;
               break;
            case 60:
               var10000 = 193;
               break;
            case 61:
               var10000 = 189;
               break;
            case 62:
               var10000 = 117;
               break;
            case 63:
               var10000 = 207;
               break;
            case 64:
               var10000 = 8;
               break;
            case 65:
               var10000 = 143;
               break;
            case 66:
               var10000 = 83;
               break;
            case 67:
               var10000 = 75;
               break;
            case 68:
               var10000 = 240;
               break;
            case 69:
               var10000 = 147;
               break;
            case 70:
               var10000 = 53;
               break;
            case 71:
               var10000 = 233;
               break;
            case 72:
               var10000 = 141;
               break;
            case 73:
               var10000 = 158;
               break;
            case 74:
               var10000 = 130;
               break;
            case 75:
               var10000 = 127;
               break;
            case 76:
               var10000 = 115;
               break;
            case 77:
               var10000 = 136;
               break;
            case 78:
               var10000 = 22;
               break;
            case 79:
               var10000 = 121;
               break;
            case 80:
               var10000 = 54;
               break;
            case 81:
               var10000 = 6;
               break;
            case 82:
               var10000 = 9;
               break;
            case 83:
               var10000 = 254;
               break;
            case 84:
               var10000 = 67;
               break;
            case 85:
               var10000 = 52;
               break;
            case 86:
               var10000 = 37;
               break;
            case 87:
               var10000 = 181;
               break;
            case 88:
               var10000 = 24;
               break;
            case 89:
               var10000 = 72;
               break;
            case 90:
               var10000 = 126;
               break;
            case 91:
               var10000 = 211;
               break;
            case 92:
               var10000 = 96;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 71;
               break;
            case 95:
               var10000 = 45;
               break;
            case 96:
               var10000 = 229;
               break;
            case 97:
               var10000 = 59;
               break;
            case 98:
               var10000 = 84;
               break;
            case 99:
               var10000 = 73;
               break;
            case 100:
               var10000 = 156;
               break;
            case 101:
               var10000 = 180;
               break;
            case 102:
               var10000 = 108;
               break;
            case 103:
               var10000 = 177;
               break;
            case 104:
               var10000 = 13;
               break;
            case 105:
               var10000 = 104;
               break;
            case 106:
               var10000 = 170;
               break;
            case 107:
               var10000 = 144;
               break;
            case 108:
               var10000 = 32;
               break;
            case 109:
               var10000 = 93;
               break;
            case 110:
               var10000 = 46;
               break;
            case 111:
               var10000 = 241;
               break;
            case 112:
               var10000 = 92;
               break;
            case 113:
               var10000 = 30;
               break;
            case 114:
               var10000 = 239;
               break;
            case 115:
               var10000 = 103;
               break;
            case 116:
               var10000 = 77;
               break;
            case 117:
               var10000 = 87;
               break;
            case 118:
               var10000 = 203;
               break;
            case 119:
               var10000 = 166;
               break;
            case 120:
               var10000 = 222;
               break;
            case 121:
               var10000 = 235;
               break;
            case 122:
               var10000 = 213;
               break;
            case 123:
               var10000 = 164;
               break;
            case 124:
               var10000 = 55;
               break;
            case 125:
               var10000 = 91;
               break;
            case 126:
               var10000 = 69;
               break;
            case 127:
               var10000 = 34;
               break;
            case 128:
               var10000 = 165;
               break;
            case 129:
               var10000 = 68;
               break;
            case 130:
               var10000 = 1;
               break;
            case 131:
               var10000 = 35;
               break;
            case 132:
               var10000 = 16;
               break;
            case 133:
               var10000 = 44;
               break;
            case 134:
               var10000 = 48;
               break;
            case 135:
               var10000 = 18;
               break;
            case 136:
               var10000 = 215;
               break;
            case 137:
               var10000 = 182;
               break;
            case 138:
               var10000 = 236;
               break;
            case 139:
               var10000 = 88;
               break;
            case 140:
               var10000 = 0;
               break;
            case 141:
               var10000 = 168;
               break;
            case 142:
               var10000 = 82;
               break;
            case 143:
               var10000 = 202;
               break;
            case 144:
               var10000 = 28;
               break;
            case 145:
               var10000 = 234;
               break;
            case 146:
               var10000 = 200;
               break;
            case 147:
               var10000 = 251;
               break;
            case 148:
               var10000 = 33;
               break;
            case 149:
               var10000 = 120;
               break;
            case 150:
               var10000 = 139;
               break;
            case 151:
               var10000 = 111;
               break;
            case 152:
               var10000 = 225;
               break;
            case 153:
               var10000 = 65;
               break;
            case 154:
               var10000 = 160;
               break;
            case 155:
               var10000 = 238;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 214;
               break;
            case 158:
               var10000 = 195;
               break;
            case 159:
               var10000 = 125;
               break;
            case 160:
               var10000 = 153;
               break;
            case 161:
               var10000 = 255;
               break;
            case 162:
               var10000 = 163;
               break;
            case 163:
               var10000 = 70;
               break;
            case 164:
               var10000 = 208;
               break;
            case 165:
               var10000 = 123;
               break;
            case 166:
               var10000 = 137;
               break;
            case 167:
               var10000 = 39;
               break;
            case 168:
               var10000 = 5;
               break;
            case 169:
               var10000 = 201;
               break;
            case 170:
               var10000 = 237;
               break;
            case 171:
               var10000 = 122;
               break;
            case 172:
               var10000 = 60;
               break;
            case 173:
               var10000 = 242;
               break;
            case 174:
               var10000 = 249;
               break;
            case 175:
               var10000 = 81;
               break;
            case 176:
               var10000 = 80;
               break;
            case 177:
               var10000 = 186;
               break;
            case 178:
               var10000 = 89;
               break;
            case 179:
               var10000 = 51;
               break;
            case 180:
               var10000 = 216;
               break;
            case 181:
               var10000 = 42;
               break;
            case 182:
               var10000 = 154;
               break;
            case 183:
               var10000 = 40;
               break;
            case 184:
               var10000 = 224;
               break;
            case 185:
               var10000 = 212;
               break;
            case 186:
               var10000 = 31;
               break;
            case 187:
               var10000 = 132;
               break;
            case 188:
               var10000 = 248;
               break;
            case 189:
               var10000 = 192;
               break;
            case 190:
               var10000 = 98;
               break;
            case 191:
               var10000 = 76;
               break;
            case 192:
               var10000 = 194;
               break;
            case 193:
               var10000 = 252;
               break;
            case 194:
               var10000 = 243;
               break;
            case 195:
               var10000 = 218;
               break;
            case 196:
               var10000 = 247;
               break;
            case 197:
               var10000 = 161;
               break;
            case 198:
               var10000 = 174;
               break;
            case 199:
               var10000 = 176;
               break;
            case 200:
               var10000 = 21;
               break;
            case 201:
               var10000 = 217;
               break;
            case 202:
               var10000 = 167;
               break;
            case 203:
               var10000 = 109;
               break;
            case 204:
               var10000 = 43;
               break;
            case 205:
               var10000 = 95;
               break;
            case 206:
               var10000 = 187;
               break;
            case 207:
               var10000 = 128;
               break;
            case 208:
               var10000 = 152;
               break;
            case 209:
               var10000 = 209;
               break;
            case 210:
               var10000 = 172;
               break;
            case 211:
               var10000 = 118;
               break;
            case 212:
               var10000 = 142;
               break;
            case 213:
               var10000 = 112;
               break;
            case 214:
               var10000 = 155;
               break;
            case 215:
               var10000 = 47;
               break;
            case 216:
               var10000 = 74;
               break;
            case 217:
               var10000 = 134;
               break;
            case 218:
               var10000 = 124;
               break;
            case 219:
               var10000 = 105;
               break;
            case 220:
               var10000 = 219;
               break;
            case 221:
               var10000 = 183;
               break;
            case 222:
               var10000 = 197;
               break;
            case 223:
               var10000 = 246;
               break;
            case 224:
               var10000 = 38;
               break;
            case 225:
               var10000 = 50;
               break;
            case 226:
               var10000 = 151;
               break;
            case 227:
               var10000 = 114;
               break;
            case 228:
               var10000 = 162;
               break;
            case 229:
               var10000 = 138;
               break;
            case 230:
               var10000 = 79;
               break;
            case 231:
               var10000 = 253;
               break;
            case 232:
               var10000 = 41;
               break;
            case 233:
               var10000 = 228;
               break;
            case 234:
               var10000 = 148;
               break;
            case 235:
               var10000 = 64;
               break;
            case 236:
               var10000 = 199;
               break;
            case 237:
               var10000 = 198;
               break;
            case 238:
               var10000 = 29;
               break;
            case 239:
               var10000 = 169;
               break;
            case 240:
               var10000 = 232;
               break;
            case 241:
               var10000 = 135;
               break;
            case 242:
               var10000 = 61;
               break;
            case 243:
               var10000 = 250;
               break;
            case 244:
               var10000 = 116;
               break;
            case 245:
               var10000 = 17;
               break;
            case 246:
               var10000 = 94;
               break;
            case 247:
               var10000 = 131;
               break;
            case 248:
               var10000 = 157;
               break;
            case 249:
               var10000 = 66;
               break;
            case 250:
               var10000 = 14;
               break;
            case 251:
               var10000 = 210;
               break;
            case 252:
               var10000 = 173;
               break;
            case 253:
               var10000 = 110;
               break;
            case 254:
               var10000 = 19;
               break;
            default:
               var10000 = 11;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5415;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "~\u0015yè@\u0098\u009a\u0005(¾\u0093½!";
      int var12 = "~\u0015yè@\u0098\u009a\u0005(¾\u0093½!".length();
      char var9 = 7;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 25;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 25;
               var10006 = var14;
            } else {
               var27 = 25;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 25;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 85;
                     break;
                  case 1:
                     var47 = 81;
                     break;
                  case 2:
                     var47 = 33;
                     break;
                  case 3:
                     var47 = 93;
                     break;
                  case 4:
                     var47 = 118;
                     break;
                  case 5:
                     var47 = 19;
                     break;
                  default:
                     var47 = 20;
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
            b = new String[2];
            long var0 = 6076081918226795250L;
            long[] var6 = new long[19];
            int var3 = 0;
            String var4 = "ÂF\"Î2x~\u000eÐÌþ\u0094\u0010G\u0081GN\u008bøA\n5\f\u009eK ëss\u0018^ÂW/ÙÙ\u0018\u009aÔ]\u0083\u0015\u0091¹ ?ï.qôyaQ\u000e´#\u0013\u00029êy6\u0089q\u008f³\u001f\u000bI\u009bRµp\u00055Y]æ\u0094ö,\u0013I\u0087k\u009a@\u0012\r\u0014<\tÀô\bg×X\u0092¶\u0094Äñ%W\u0090\u008a<\u0004ÑC\u008a\u0087\u0095N7ûO`T4Ýý\u0098\u0092\u001fÄb\u008cEù´eÏý\u009e";
            int var5 = "ÂF\"Î2x~\u000eÐÌþ\u0094\u0010G\u0081GN\u008bøA\n5\f\u009eK ëss\u0018^ÂW/ÙÙ\u0018\u009aÔ]\u0083\u0015\u0091¹ ?ï.qôyaQ\u000e´#\u0013\u00029êy6\u0089q\u008f³\u001f\u000bI\u009bRµp\u00055Y]æ\u0094ö,\u0013I\u0087k\u009a@\u0012\r\u0014<\tÀô\bg×X\u0092¶\u0094Äñ%W\u0090\u008a<\u0004ÑC\u008a\u0087\u0095N7ûO`T4Ýý\u0098\u0092\u001fÄb\u008cEù´eÏý\u009e"
               .length();
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
                           c = var6;
                           d = new Integer[19];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = " Ë\u0089Ç)Êáö\u007fÆ\"bj\u0098´Î";
                        var5 = " Ë\u0089Ç)Êáö\u007fÆ\"bj\u0098´Î".length();
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





