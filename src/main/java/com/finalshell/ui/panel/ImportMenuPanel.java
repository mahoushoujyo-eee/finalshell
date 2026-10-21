package com.finalshell.ui.panel;

import com.finalshell.core.Fb2;
import com.finalshell.core.LN3;
import com.finalshell.core.NA_2;
import com.finalshell.core.Ty4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ImportPrivateKeyDialog;
import com.finalshell.ui.listener.ConfirmDeleteListener2;
import com.finalshell.ui.listener.NG;
import com.finalshell.ui.listener.Os2;
import com.finalshell.ui.listener.YY;
import com.finalshell.ui.model.VX;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class ImportMenuPanel extends JPanel implements Fb2 {
   public VX w;
   public NA_2 j;
   public static String[] E;
   public static String[] b;
   public static String[] c;

   public ImportMenuPanel() {
      super();
      this.setLayout(new MigLayout(a(-15185, 29003)));
      String var1 = a(-15192, 22881);
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout());
      JButton var3 = new JButton(a(-15190, 22055));
      var2.add(var3, var1);
      var3.addActionListener(new YY(this));
      VX var10001 = new VX();
      long var8 = 620647041658699396L;
      VX var7 = var10001;
      Ref.s(620647041658699396L, var7, var8);
      NA_2 var10003;
      Object var9 = 620647041658699396L;
      // [VF-super] super(this, (VX)Ref.g(620647041658699396L, var9));
      long var12 = 474934089651157961L;
      NA_2 var11 = var10003;
      Ref.s(474934089651157961L, var11, var12);
      Object var13 = 474934089651157961L;
      NA_2 var10004 = (NA_2)Ref.g(474934089651157961L, var13);
      Object var15 = 620647041658699396L;
      this.setModel((VX)Ref.g(620647041658699396L, var15));
      JScrollPane var10006;
      Object var17 = 474934089651157961L;
      super((NA_2)Ref.g(474934089651157961L, var17));
      JScrollPane var4 = var10006;
      this.add(var4, a(-15186, 28247));
      var4.addMouseListener(new NG(this));
      JButton var5 = new JButton(a(-15191, -20814));
      var2.add(var5, var1);
      var5.addActionListener(new Os2(this));
      JButton var6 = new JButton(a(-15189, 6892));
      var2.add(var6, var1);
      var6.addActionListener(new ConfirmDeleteListener2(this));
      this.add(var2);
   }

   public void M() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.packArgs(this);
      long var4 = 459969040127248336L;
      Object[] var3 = var10002;
      Ref.h(459969040127248336L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void O(Ty4 var1) {
      String[] var2 = j();
      Integer var10001 = (Integer)(Registry.emptyArgs());
      long var4 = 542590257020999358L;
      Object var3 = var10001;
      var10001 = Ref.h(542590257020999358L, var3, var4);

      try {
         var10001 = (Integer)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      label38: {
         int var10002 = Registry.lookupField(456349507517882113L).getInt(null);
         if (var2 != null) {
            if (var10001 == var10002) {
               break label38;
            }

            var10001 = var1;
            Object[] var14 = Registry.emptyArgs();
            long var6 = 542590257020999358L;
            Object[] var5 = var14;
            Object var15 = Ref.h(542590257020999358L, var5, var6);

            try {
               var10002 = (Integer)var15;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            Registry.lookupField(213416441008748074L).getInt(null);
         }

         if (var10001 != var10002) {
            return;
         }
      }

      Object[] var16 = Registry.emptyArgs();
      long var8 = 545869479264541461L;
      Object[] var7 = var16;
      Ref.h(545869479264541461L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public LN3 U() {
      j();
      Object var4 = 474934089651157961L;
      int var2 = ((NA_2)Ref.g(474934089651157961L, var4)).getSelectedRow();
      Object var3 = null;
      ImportMenuPanel var10001 = var2;
      if (this != null) {
         if (!(var2 > -1)) {
            return (LN3)var3;
         }

         var10001 = this;
         Object var6 = 474934089651157961L;
         ((NA_2)Ref.g(474934089651157961L, var6)).convertRowIndexToModel(var2);
      }

      var2 = (int)var10001;
      Object var8 = 620647041658699396L;
      Ref.g(620647041658699396L, var8);
      LN3 var10003 = Registry.packArgs((int)var13);
      long var11 = 252060558040035249L;
      Object var10 = var10003;
      var10003 = Ref.h(252060558040035249L, var10, var11);

      try {
         var10003 = (LN3)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      return var10003;
   }

   public void e(LN3 var1) {
      ImportPrivateKeyDialog var2 = new ImportPrivateKeyDialog(SwingUtilities.windowForComponent(this), true);
      var2.setLocationRelativeTo(this);
      var2.setVisible(true);
      Object[] var10001 = Registry.packArgs(var1);
      long var4 = 178544509098445831L;
      Object[] var3 = var10001;
      Ref.h(178544509098445831L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void g() {
      ImportPrivateKeyDialog var1 = new ImportPrivateKeyDialog(SwingUtilities.windowForComponent(this), false);
      var1.setLocationRelativeTo(this);
      var1.setVisible(true);
   }

   public void b() {
      Object[] var21;
      ArrayList var2 = new ArrayList();
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 306266403902896148L;
      Object[] var9 = var10002;
      Ref.h(306266403902896148L, var9, var10);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var12 = 626356373183057367L;
      Object var11 = var10003;
      var10003 = Ref.h(626356373183057367L, var11, var12);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      ArrayList var3 = var10003;
      var2.addAll(var3);
      j();
      Object var13 = 474934089651157961L;
      int var4 = ((NA_2)Ref.g(474934089651157961L, var13)).getSelectedRow();
      LN3 var5 = null;
      if (var4 > -1) {
         Object var15 = 620647041658699396L;
         Ref.g(620647041658699396L, var15);
         LN3 var10006 = (LN3)(Registry.packArgs(var4));
         long var18 = 252060558040035249L;
         Object var17 = var10006;
         var10006 = Ref.h(252060558040035249L, var17, var18);

         try {
            var10006 = (LN3)var10006;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         var5 = var10006;
      }

      Object var19 = 620647041658699396L;
      VX var10005 = (VX)Ref.g(620647041658699396L, var19);
      if (this != null) {
         Object[] var42 = Registry.packArgs(var2);
         long var22 = 289729707909099448L;
         var21 = var42;
         Ref.h(289729707909099448L, var21, var22);

         try {
            ;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         if (var5 == null) {
            return;
         }

         Object var23 = 620647041658699396L;
         VX var10007 = (VX)Ref.g(620647041658699396L, var23);
      }

      Integer var43 = (Integer)(Registry.emptyArgs());
      long var26 = 194080076253066315L;
      Object var25 = var43;
      var43 = Registry.packArgs(Ref.h(194080076253066315L, var25, var26));
      long var28 = 446438636309646226L;
      Object var27 = var43;
      var43 = Ref.h(446438636309646226L, var27, var28);

      try {
         var43 = (Integer)var43;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      int var6 = (int)var43;
      ImportMenuPanel var47 = var6;
      if (this != null) {
         if (!(var6 > -1)) {
            return;
         }

         var47 = this;
         Object var29 = 474934089651157961L;
         ((NA_2)Ref.g(474934089651157961L, var29)).convertRowIndexToView(var6);
      }

      var6 = (int)var47;
      Object var31 = 474934089651157961L;
      ((NA_2)Ref.g(474934089651157961L, var31)).getSelectionModel().setSelectionInterval((int)var37, (int)var37);
   }

   public NA_2 E() {
      Object var1 = 474934089651157961L;
      return (NA_2)Ref.g(474934089651157961L, var1);
   }

   public void R(NA_2 var1) {
      long var3 = 474934089651157961L;
      Ref.s(474934089651157961L, var1, var3);
   }

   public static void u(String[] var0) {
      E = var0;
   }

   public static String[] j() {
      return E;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -15189) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 64;
               break;
            case 1:
               var10000 = 54;
               break;
            case 2:
               var10000 = 2;
               break;
            case 3:
               var10000 = 130;
               break;
            case 4:
               var10000 = 135;
               break;
            case 5:
               var10000 = 212;
               break;
            case 6:
               var10000 = 128;
               break;
            case 7:
               var10000 = 170;
               break;
            case 8:
               var10000 = 23;
               break;
            case 9:
               var10000 = 225;
               break;
            case 10:
               var10000 = 69;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 142;
               break;
            case 13:
               var10000 = 42;
               break;
            case 14:
               var10000 = 181;
               break;
            case 15:
               var10000 = 223;
               break;
            case 16:
               var10000 = 93;
               break;
            case 17:
               var10000 = 207;
               break;
            case 18:
               var10000 = 254;
               break;
            case 19:
               var10000 = 186;
               break;
            case 20:
               var10000 = 66;
               break;
            case 21:
               var10000 = 45;
               break;
            case 22:
               var10000 = 188;
               break;
            case 23:
               var10000 = 211;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 239;
               break;
            case 26:
               var10000 = 252;
               break;
            case 27:
               var10000 = 187;
               break;
            case 28:
               var10000 = 6;
               break;
            case 29:
               var10000 = 191;
               break;
            case 30:
               var10000 = 25;
               break;
            case 31:
               var10000 = 151;
               break;
            case 32:
               var10000 = 134;
               break;
            case 33:
               var10000 = 229;
               break;
            case 34:
               var10000 = 190;
               break;
            case 35:
               var10000 = 137;
               break;
            case 36:
               var10000 = 28;
               break;
            case 37:
               var10000 = 148;
               break;
            case 38:
               var10000 = 176;
               break;
            case 39:
               var10000 = 26;
               break;
            case 40:
               var10000 = 199;
               break;
            case 41:
               var10000 = 127;
               break;
            case 42:
               var10000 = 234;
               break;
            case 43:
               var10000 = 80;
               break;
            case 44:
               var10000 = 201;
               break;
            case 45:
               var10000 = 94;
               break;
            case 46:
               var10000 = 253;
               break;
            case 47:
               var10000 = 53;
               break;
            case 48:
               var10000 = 59;
               break;
            case 49:
               var10000 = 100;
               break;
            case 50:
               var10000 = 99;
               break;
            case 51:
               var10000 = 195;
               break;
            case 52:
               var10000 = 194;
               break;
            case 53:
               var10000 = 158;
               break;
            case 54:
               var10000 = 192;
               break;
            case 55:
               var10000 = 173;
               break;
            case 56:
               var10000 = 193;
               break;
            case 57:
               var10000 = 210;
               break;
            case 58:
               var10000 = 189;
               break;
            case 59:
               var10000 = 154;
               break;
            case 60:
               var10000 = 24;
               break;
            case 61:
               var10000 = 19;
               break;
            case 62:
               var10000 = 146;
               break;
            case 63:
               var10000 = 145;
               break;
            case 64:
               var10000 = 203;
               break;
            case 65:
               var10000 = 105;
               break;
            case 66:
               var10000 = 0;
               break;
            case 67:
               var10000 = 70;
               break;
            case 68:
               var10000 = 153;
               break;
            case 69:
               var10000 = 43;
               break;
            case 70:
               var10000 = 233;
               break;
            case 71:
               var10000 = 36;
               break;
            case 72:
               var10000 = 217;
               break;
            case 73:
               var10000 = 101;
               break;
            case 74:
               var10000 = 75;
               break;
            case 75:
               var10000 = 74;
               break;
            case 76:
               var10000 = 117;
               break;
            case 77:
               var10000 = 32;
               break;
            case 78:
               var10000 = 123;
               break;
            case 79:
               var10000 = 11;
               break;
            case 80:
               var10000 = 214;
               break;
            case 81:
               var10000 = 175;
               break;
            case 82:
               var10000 = 213;
               break;
            case 83:
               var10000 = 96;
               break;
            case 84:
               var10000 = 156;
               break;
            case 85:
               var10000 = 51;
               break;
            case 86:
               var10000 = 107;
               break;
            case 87:
               var10000 = 92;
               break;
            case 88:
               var10000 = 114;
               break;
            case 89:
               var10000 = 30;
               break;
            case 90:
               var10000 = 132;
               break;
            case 91:
               var10000 = 108;
               break;
            case 92:
               var10000 = 166;
               break;
            case 93:
               var10000 = 231;
               break;
            case 94:
               var10000 = 133;
               break;
            case 95:
               var10000 = 82;
               break;
            case 96:
               var10000 = 240;
               break;
            case 97:
               var10000 = 126;
               break;
            case 98:
               var10000 = 31;
               break;
            case 99:
               var10000 = 204;
               break;
            case 100:
               var10000 = 17;
               break;
            case 101:
               var10000 = 221;
               break;
            case 102:
               var10000 = 227;
               break;
            case 103:
               var10000 = 104;
               break;
            case 104:
               var10000 = 81;
               break;
            case 105:
               var10000 = 150;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 164;
               break;
            case 108:
               var10000 = 119;
               break;
            case 109:
               var10000 = 125;
               break;
            case 110:
               var10000 = 58;
               break;
            case 111:
               var10000 = 90;
               break;
            case 112:
               var10000 = 112;
               break;
            case 113:
               var10000 = 89;
               break;
            case 114:
               var10000 = 77;
               break;
            case 115:
               var10000 = 84;
               break;
            case 116:
               var10000 = 159;
               break;
            case 117:
               var10000 = 115;
               break;
            case 118:
               var10000 = 238;
               break;
            case 119:
               var10000 = 37;
               break;
            case 120:
               var10000 = 179;
               break;
            case 121:
               var10000 = 143;
               break;
            case 122:
               var10000 = 62;
               break;
            case 123:
               var10000 = 79;
               break;
            case 124:
               var10000 = 41;
               break;
            case 125:
               var10000 = 72;
               break;
            case 126:
               var10000 = 160;
               break;
            case 127:
               var10000 = 60;
               break;
            case 128:
               var10000 = 172;
               break;
            case 129:
               var10000 = 255;
               break;
            case 130:
               var10000 = 22;
               break;
            case 131:
               var10000 = 245;
               break;
            case 132:
               var10000 = 162;
               break;
            case 133:
               var10000 = 139;
               break;
            case 134:
               var10000 = 171;
               break;
            case 135:
               var10000 = 71;
               break;
            case 136:
               var10000 = 241;
               break;
            case 137:
               var10000 = 29;
               break;
            case 138:
               var10000 = 180;
               break;
            case 139:
               var10000 = 244;
               break;
            case 140:
               var10000 = 236;
               break;
            case 141:
               var10000 = 21;
               break;
            case 142:
               var10000 = 124;
               break;
            case 143:
               var10000 = 27;
               break;
            case 144:
               var10000 = 243;
               break;
            case 145:
               var10000 = 169;
               break;
            case 146:
               var10000 = 209;
               break;
            case 147:
               var10000 = 218;
               break;
            case 148:
               var10000 = 95;
               break;
            case 149:
               var10000 = 129;
               break;
            case 150:
               var10000 = 14;
               break;
            case 151:
               var10000 = 85;
               break;
            case 152:
               var10000 = 106;
               break;
            case 153:
               var10000 = 202;
               break;
            case 154:
               var10000 = 120;
               break;
            case 155:
               var10000 = 56;
               break;
            case 156:
               var10000 = 198;
               break;
            case 157:
               var10000 = 206;
               break;
            case 158:
               var10000 = 52;
               break;
            case 159:
               var10000 = 110;
               break;
            case 160:
               var10000 = 113;
               break;
            case 161:
               var10000 = 18;
               break;
            case 162:
               var10000 = 152;
               break;
            case 163:
               var10000 = 5;
               break;
            case 164:
               var10000 = 200;
               break;
            case 165:
               var10000 = 246;
               break;
            case 166:
               var10000 = 163;
               break;
            case 167:
               var10000 = 161;
               break;
            case 168:
               var10000 = 63;
               break;
            case 169:
               var10000 = 220;
               break;
            case 170:
               var10000 = 141;
               break;
            case 171:
               var10000 = 8;
               break;
            case 172:
               var10000 = 33;
               break;
            case 173:
               var10000 = 15;
               break;
            case 174:
               var10000 = 67;
               break;
            case 175:
               var10000 = 177;
               break;
            case 176:
               var10000 = 250;
               break;
            case 177:
               var10000 = 196;
               break;
            case 178:
               var10000 = 7;
               break;
            case 179:
               var10000 = 208;
               break;
            case 180:
               var10000 = 78;
               break;
            case 181:
               var10000 = 237;
               break;
            case 182:
               var10000 = 86;
               break;
            case 183:
               var10000 = 47;
               break;
            case 184:
               var10000 = 197;
               break;
            case 185:
               var10000 = 44;
               break;
            case 186:
               var10000 = 184;
               break;
            case 187:
               var10000 = 116;
               break;
            case 188:
               var10000 = 242;
               break;
            case 189:
               var10000 = 232;
               break;
            case 190:
               var10000 = 68;
               break;
            case 191:
               var10000 = 219;
               break;
            case 192:
               var10000 = 61;
               break;
            case 193:
               var10000 = 157;
               break;
            case 194:
               var10000 = 182;
               break;
            case 195:
               var10000 = 131;
               break;
            case 196:
               var10000 = 9;
               break;
            case 197:
               var10000 = 248;
               break;
            case 198:
               var10000 = 109;
               break;
            case 199:
               var10000 = 147;
               break;
            case 200:
               var10000 = 97;
               break;
            case 201:
               var10000 = 20;
               break;
            case 202:
               var10000 = 34;
               break;
            case 203:
               var10000 = 140;
               break;
            case 204:
               var10000 = 50;
               break;
            case 205:
               var10000 = 165;
               break;
            case 206:
               var10000 = 4;
               break;
            case 207:
               var10000 = 48;
               break;
            case 208:
               var10000 = 121;
               break;
            case 209:
               var10000 = 98;
               break;
            case 210:
               var10000 = 12;
               break;
            case 211:
               var10000 = 216;
               break;
            case 212:
               var10000 = 224;
               break;
            case 213:
               var10000 = 39;
               break;
            case 214:
               var10000 = 185;
               break;
            case 215:
               var10000 = 230;
               break;
            case 216:
               var10000 = 3;
               break;
            case 217:
               var10000 = 155;
               break;
            case 218:
               var10000 = 235;
               break;
            case 219:
               var10000 = 49;
               break;
            case 220:
               var10000 = 16;
               break;
            case 221:
               var10000 = 228;
               break;
            case 222:
               var10000 = 91;
               break;
            case 223:
               var10000 = 87;
               break;
            case 224:
               var10000 = 222;
               break;
            case 225:
               var10000 = 149;
               break;
            case 226:
               var10000 = 102;
               break;
            case 227:
               var10000 = 13;
               break;
            case 228:
               var10000 = 251;
               break;
            case 229:
               var10000 = 38;
               break;
            case 230:
               var10000 = 76;
               break;
            case 231:
               var10000 = 73;
               break;
            case 232:
               var10000 = 178;
               break;
            case 233:
               var10000 = 55;
               break;
            case 234:
               var10000 = 226;
               break;
            case 235:
               var10000 = 249;
               break;
            case 236:
               var10000 = 103;
               break;
            case 237:
               var10000 = 122;
               break;
            case 238:
               var10000 = 88;
               break;
            case 239:
               var10000 = 144;
               break;
            case 240:
               var10000 = 174;
               break;
            case 241:
               var10000 = 65;
               break;
            case 242:
               var10000 = 46;
               break;
            case 243:
               var10000 = 215;
               break;
            case 244:
               var10000 = 83;
               break;
            case 245:
               var10000 = 57;
               break;
            case 246:
               var10000 = 111;
               break;
            case 247:
               var10000 = 167;
               break;
            case 248:
               var10000 = 35;
               break;
            case 249:
               var10000 = 136;
               break;
            case 250:
               var10000 = 40;
               break;
            case 251:
               var10000 = 1;
               break;
            case 252:
               var10000 = 205;
               break;
            case 253:
               var10000 = 10;
               break;
            case 254:
               var10000 = 138;
               break;
            default:
               var10000 = 247;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var21;
      String[] var5 = new String[6];
      int var3 = 0;
      String[] var10000 = new String[2];
      String var2 = "劧隼\u0005審兊Tf¶\u0002罿迹\u001b~\u0086ç¶)?\u0019ÑåPÝ¢§í÷ZZYï)\u0081×¶ÔÅ\u009bâ";
      int var4 = "劧隼\u0005審兊Tf¶\u0002罿迹\u001b~\u0086ç¶)?\u0019ÑåPÝ¢§í÷ZZYï)\u0081×¶ÔÅ\u009bâ".length();
      u(var10000);
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var9 = 111;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var9;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               } else {
                  var28 = var9;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var9;
                  var10006 = var6;
               }

               while (true) {
                  char var46 = var37[var10006];
                  byte var47;
                  switch (var6 % 7) {
                     case 0:
                        var47 = 126;
                        break;
                     case 1:
                        var47 = 115;
                        break;
                     case 2:
                        var47 = 105;
                        break;
                     case 3:
                        var47 = 36;
                        break;
                     case 4:
                        var47 = 86;
                        break;
                     case 5:
                        var47 = 16;
                        break;
                     default:
                        var47 = 49;
                  }

                  var37[var10006] = (char)(var46 ^ var33 ^ var47);
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var8 += var1) >= var4) {
                     b = var5;
                     c = new String[6];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "À*\u0096\u0085\u008fÚ\u0085\u001e¨\bî°Í\u001bX¼\\á|~'ªðØ^`Iî\u0095\u0088¶{^²ü3\u008bë1\u0006¨";
                  var4 = "À*\u0096\u0085\u008fÚ\u0085\u001e¨\bî°Í\u001bX¼\\á|~'ªðØ^`Iî\u0095\u0088¶{^²ü3\u008bë1\u0006¨".length();
                  var1 = '\r';
                  var8 = -1;
            }

            var9 = 41;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





