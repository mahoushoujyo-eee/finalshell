package com.finalshell.ui.dialog;

import com.finalshell.core.Lj4_2;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Fn4;
import com.finalshell.ui.listener.F__2;
import com.finalshell.ui.listener.InputCommandListener;
import com.finalshell.ui.listener.KS;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import com.finalshell.ui.panel.Copy3;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

public class EditDialog3 extends JDialog {
   public static int Y;
   public static int s;
   int L;
   boolean H;
   Copy3 d;
   T32 t;
   Lj4_2 x;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public EditDialog3(Copy3 var1, boolean var2, Component var3, T32 var4) {
      int[] var5;
      label87: {
         int[] var10000 = AppendCarriageReturnCRPanel.Y();
         super();
         Registry.lookupField(464276435262449023L).setBoolean(this, false);
         var5 = var10000;
         long var16 = 161484386776875275L;
         Ref.s(161484386776875275L, var1, var16);
         Registry.lookupField(464276435262449023L).setBoolean(this, var2);
         long var18 = 520973220688374964L;
         Ref.s(520973220688374964L, var4, var18);
         if (var5 == null) {
            if (!var2) {
               this.setTitle(a(9228, 7089));
               if (var5 == null) {
                  break label87;
               }
            }

            Object[] var10004 = Registry.emptyArgs();
            long var20 = 348047003824927685L;
            Object[] var19 = var10004;
            Lj4_2 var51 = (Lj4_2)Ref.h(348047003824927685L, var19, var20);
            long var22 = 302503956502467966L;
            Lj4_2 var21 = var51;
            Ref.s(302503956502467966L, var21, var22);
         }

         new StringBuilder().append(a(9246, 30255));
         Object var23 = 302503956502467966L;
         Object var10005 = Ref.g(302503956502467966L, var23);
         String var10006 = (String)(Registry.emptyArgs());
         long var26 = 286931176286176762L;
         Object[] var25 = var10006;
         var10006 = Ref.h(286931176286176762L, var25, var26);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var47) {
            throw var47.getTargetException();
         }

         this.setTitle(var10005.append((String)var10006).toString());
      }

      this.setModal(true);
      JPanel var6 = (JPanel)this.getContentPane();
      this.setLayout(new MigLayout(a(9216, 10176), a(9229, 6694), ""));
      this.add(new JLabel(a(9220, -6403)), a(9224, -2331));
      JTextField var7 = new JTextField();
      this.add(var7, a(9217, 19962));
      Registry.packArgs(var7);
      long var27 = 322267315291882359L;
      Ref.h2(322267315291882359L, var27);
      this.add(new JLabel(a(9226, -32490)), a(9245, -23451));
      RSyntaxTextArea var8 = new RSyntaxTextArea(5, a(24984, 6381067655094882207L));
      var8.setSyntaxEditingStyle(a(9243, 17942));
      var8.setMarkOccurrences(false);
      var8.setLineWrap(true);
      var8.setCurrentLineHighlightColor(new Color(a(31914, 4966598014258696879L), a(17737, 5395654146477124431L), a(7461, 2082588742495318823L)));
      var8.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      var8.setParserDelay(a(27369, 4469714447945319661L));
      RTextScrollPane var9 = new RTextScrollPane((RTextArea)var8);
      this.add(var9, a(9231, 30919));
      JPanel var10 = new JPanel();
      var10.setLayout(new MigLayout(a(9222, 18), a(9247, 13284), ""));
      this.add(var10, a(9221, -19339));
      var10.add(new JLabel(a(9244, -21319)), a(9241, 32278));
      int var11 = 0;

      while (var11 < 5) {
         int var12 = var11 + 1;
         JButton var13 = new JButton(a(9240, 21840) + var12);
         var10.add(var13);
         var13.addActionListener(new KS(this, var12, var8));
         var11++;
         if (var5 != null) {
            break;
         }
      }

      JCheckBox var48 = new JCheckBox(a(9230, -31084), true);
      this.add(var48, a(9225, 16927));
      JPanel var49 = new JPanel();
      var49.setLayout(new MigLayout(a(9227, 6245), "", ""));
      this.add(var49, a(9218, 14242));
      JButton var50 = new JButton(a(9223, -20223));
      var50.addActionListener(new InputCommandListener(this, var7, var8, var1, var48, var4));
      var49.add(var50);
      JButton var14 = new JButton(a(9219, 6899));
      var14.addActionListener(new F__2(this));
      var49.add(var14);
      if (var5 == null) {
         Object[] var54 = Registry.emptyArgs();
         long var30 = 459231435454686928L;
         Object[] var29 = var54;
         var54 = Ref.h(459231435454686928L, var29, var30);

         try {
            var56 = (Boolean)var54;
         } catch (InvocationTargetException var46) {
            throw var46.getTargetException();
         }

         if (var56) {
            Object var31 = 302503956502467966L;
            Object var10008 = Ref.g(302503956502467966L, var31);
            String var10009 = (String)(Registry.emptyArgs());
            long var34 = 286931176286176762L;
            Object[] var33 = var10009;
            var10009 = Ref.h(286931176286176762L, var33, var34);

            try {
               var10009 = (String)var10009;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            var10008.setText(var10009);
            Object var35 = 302503956502467966L;
            Object var10010 = Ref.g(302503956502467966L, var35);
            String var10011 = (String)(Registry.emptyArgs());
            long var38 = 547398689030025911L;
            Object[] var37 = var10011;
            var10011 = Ref.h(547398689030025911L, var37, var38);

            try {
               var10011 = (String)var10011;
            } catch (InvocationTargetException var44) {
               throw var44.getTargetException();
            }

            ((RSyntaxTextArea)var10010).setText(var10011);
            Object var39 = 302503956502467966L;
            Object var10012 = Ref.g(302503956502467966L, var39);
            Object[] var10013 = Registry.emptyArgs();
            long var42 = 135618565837694791L;
            Object[] var41 = var10013;
            var10013 = Ref.h(135618565837694791L, var41, var42);

            try {
               var62 = (Boolean)var10013;
            } catch (InvocationTargetException var43) {
               throw var43.getTargetException();
            }

            var10012.setSelected(var62);
            var8.discardAllEdits();
         }

         SwingUtilities.invokeLater(new Fn4(this, var3, var8));
      }

      if (Ky4.F$arrString() != null) {
         AppendCarriageReturnCRPanel.X(new int[3]);
      }
   }

   public int z() {
      return Registry.lookupField(510132525539302172L).getInt(this);
   }

   public void i(int var1) {
      Registry.lookupField(510132525539302172L).setInt(this, var1);
   }

   public boolean Z() {
      return Registry.lookupField(464276435262449023L).getBoolean(this);
   }

   public void L(boolean var1) {
      Registry.lookupField(464276435262449023L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 9229) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 176;
               break;
            case 1:
               var10000 = 203;
               break;
            case 2:
               var10000 = 107;
               break;
            case 3:
               var10000 = 118;
               break;
            case 4:
               var10000 = 162;
               break;
            case 5:
               var10000 = 192;
               break;
            case 6:
               var10000 = 143;
               break;
            case 7:
               var10000 = 178;
               break;
            case 8:
               var10000 = 137;
               break;
            case 9:
               var10000 = 198;
               break;
            case 10:
               var10000 = 220;
               break;
            case 11:
               var10000 = 218;
               break;
            case 12:
               var10000 = 255;
               break;
            case 13:
               var10000 = 154;
               break;
            case 14:
               var10000 = 101;
               break;
            case 15:
               var10000 = 0;
               break;
            case 16:
               var10000 = 28;
               break;
            case 17:
               var10000 = 113;
               break;
            case 18:
               var10000 = 159;
               break;
            case 19:
               var10000 = 96;
               break;
            case 20:
               var10000 = 18;
               break;
            case 21:
               var10000 = 174;
               break;
            case 22:
               var10000 = 88;
               break;
            case 23:
               var10000 = 83;
               break;
            case 24:
               var10000 = 213;
               break;
            case 25:
               var10000 = 100;
               break;
            case 26:
               var10000 = 17;
               break;
            case 27:
               var10000 = 252;
               break;
            case 28:
               var10000 = 12;
               break;
            case 29:
               var10000 = 190;
               break;
            case 30:
               var10000 = 87;
               break;
            case 31:
               var10000 = 90;
               break;
            case 32:
               var10000 = 245;
               break;
            case 33:
               var10000 = 109;
               break;
            case 34:
               var10000 = 112;
               break;
            case 35:
               var10000 = 200;
               break;
            case 36:
               var10000 = 91;
               break;
            case 37:
               var10000 = 14;
               break;
            case 38:
               var10000 = 55;
               break;
            case 39:
               var10000 = 62;
               break;
            case 40:
               var10000 = 15;
               break;
            case 41:
               var10000 = 201;
               break;
            case 42:
               var10000 = 230;
               break;
            case 43:
               var10000 = 144;
               break;
            case 44:
               var10000 = 82;
               break;
            case 45:
               var10000 = 142;
               break;
            case 46:
               var10000 = 128;
               break;
            case 47:
               var10000 = 219;
               break;
            case 48:
               var10000 = 89;
               break;
            case 49:
               var10000 = 231;
               break;
            case 50:
               var10000 = 250;
               break;
            case 51:
               var10000 = 188;
               break;
            case 52:
               var10000 = 191;
               break;
            case 53:
               var10000 = 70;
               break;
            case 54:
               var10000 = 36;
               break;
            case 55:
               var10000 = 150;
               break;
            case 56:
               var10000 = 165;
               break;
            case 57:
               var10000 = 63;
               break;
            case 58:
               var10000 = 80;
               break;
            case 59:
               var10000 = 49;
               break;
            case 60:
               var10000 = 122;
               break;
            case 61:
               var10000 = 193;
               break;
            case 62:
               var10000 = 86;
               break;
            case 63:
               var10000 = 130;
               break;
            case 64:
               var10000 = 127;
               break;
            case 65:
               var10000 = 158;
               break;
            case 66:
               var10000 = 208;
               break;
            case 67:
               var10000 = 26;
               break;
            case 68:
               var10000 = 251;
               break;
            case 69:
               var10000 = 179;
               break;
            case 70:
               var10000 = 65;
               break;
            case 71:
               var10000 = 169;
               break;
            case 72:
               var10000 = 217;
               break;
            case 73:
               var10000 = 135;
               break;
            case 74:
               var10000 = 58;
               break;
            case 75:
               var10000 = 51;
               break;
            case 76:
               var10000 = 95;
               break;
            case 77:
               var10000 = 50;
               break;
            case 78:
               var10000 = 227;
               break;
            case 79:
               var10000 = 81;
               break;
            case 80:
               var10000 = 47;
               break;
            case 81:
               var10000 = 32;
               break;
            case 82:
               var10000 = 68;
               break;
            case 83:
               var10000 = 214;
               break;
            case 84:
               var10000 = 131;
               break;
            case 85:
               var10000 = 69;
               break;
            case 86:
               var10000 = 23;
               break;
            case 87:
               var10000 = 119;
               break;
            case 88:
               var10000 = 48;
               break;
            case 89:
               var10000 = 196;
               break;
            case 90:
               var10000 = 151;
               break;
            case 91:
               var10000 = 232;
               break;
            case 92:
               var10000 = 136;
               break;
            case 93:
               var10000 = 71;
               break;
            case 94:
               var10000 = 33;
               break;
            case 95:
               var10000 = 175;
               break;
            case 96:
               var10000 = 222;
               break;
            case 97:
               var10000 = 24;
               break;
            case 98:
               var10000 = 5;
               break;
            case 99:
               var10000 = 11;
               break;
            case 100:
               var10000 = 3;
               break;
            case 101:
               var10000 = 39;
               break;
            case 102:
               var10000 = 242;
               break;
            case 103:
               var10000 = 238;
               break;
            case 104:
               var10000 = 177;
               break;
            case 105:
               var10000 = 30;
               break;
            case 106:
               var10000 = 254;
               break;
            case 107:
               var10000 = 183;
               break;
            case 108:
               var10000 = 34;
               break;
            case 109:
               var10000 = 84;
               break;
            case 110:
               var10000 = 157;
               break;
            case 111:
               var10000 = 92;
               break;
            case 112:
               var10000 = 133;
               break;
            case 113:
               var10000 = 60;
               break;
            case 114:
               var10000 = 156;
               break;
            case 115:
               var10000 = 235;
               break;
            case 116:
               var10000 = 155;
               break;
            case 117:
               var10000 = 124;
               break;
            case 118:
               var10000 = 145;
               break;
            case 119:
               var10000 = 166;
               break;
            case 120:
               var10000 = 153;
               break;
            case 121:
               var10000 = 221;
               break;
            case 122:
               var10000 = 110;
               break;
            case 123:
               var10000 = 97;
               break;
            case 124:
               var10000 = 186;
               break;
            case 125:
               var10000 = 10;
               break;
            case 126:
               var10000 = 141;
               break;
            case 127:
               var10000 = 172;
               break;
            case 128:
               var10000 = 46;
               break;
            case 129:
               var10000 = 72;
               break;
            case 130:
               var10000 = 21;
               break;
            case 131:
               var10000 = 189;
               break;
            case 132:
               var10000 = 29;
               break;
            case 133:
               var10000 = 37;
               break;
            case 134:
               var10000 = 25;
               break;
            case 135:
               var10000 = 146;
               break;
            case 136:
               var10000 = 129;
               break;
            case 137:
               var10000 = 125;
               break;
            case 138:
               var10000 = 93;
               break;
            case 139:
               var10000 = 111;
               break;
            case 140:
               var10000 = 1;
               break;
            case 141:
               var10000 = 247;
               break;
            case 142:
               var10000 = 194;
               break;
            case 143:
               var10000 = 223;
               break;
            case 144:
               var10000 = 248;
               break;
            case 145:
               var10000 = 173;
               break;
            case 146:
               var10000 = 139;
               break;
            case 147:
               var10000 = 6;
               break;
            case 148:
               var10000 = 108;
               break;
            case 149:
               var10000 = 126;
               break;
            case 150:
               var10000 = 40;
               break;
            case 151:
               var10000 = 31;
               break;
            case 152:
               var10000 = 163;
               break;
            case 153:
               var10000 = 134;
               break;
            case 154:
               var10000 = 199;
               break;
            case 155:
               var10000 = 246;
               break;
            case 156:
               var10000 = 104;
               break;
            case 157:
               var10000 = 225;
               break;
            case 158:
               var10000 = 161;
               break;
            case 159:
               var10000 = 4;
               break;
            case 160:
               var10000 = 160;
               break;
            case 161:
               var10000 = 205;
               break;
            case 162:
               var10000 = 54;
               break;
            case 163:
               var10000 = 79;
               break;
            case 164:
               var10000 = 182;
               break;
            case 165:
               var10000 = 234;
               break;
            case 166:
               var10000 = 228;
               break;
            case 167:
               var10000 = 207;
               break;
            case 168:
               var10000 = 237;
               break;
            case 169:
               var10000 = 41;
               break;
            case 170:
               var10000 = 170;
               break;
            case 171:
               var10000 = 74;
               break;
            case 172:
               var10000 = 249;
               break;
            case 173:
               var10000 = 106;
               break;
            case 174:
               var10000 = 76;
               break;
            case 175:
               var10000 = 202;
               break;
            case 176:
               var10000 = 197;
               break;
            case 177:
               var10000 = 43;
               break;
            case 178:
               var10000 = 78;
               break;
            case 179:
               var10000 = 138;
               break;
            case 180:
               var10000 = 236;
               break;
            case 181:
               var10000 = 115;
               break;
            case 182:
               var10000 = 147;
               break;
            case 183:
               var10000 = 102;
               break;
            case 184:
               var10000 = 98;
               break;
            case 185:
               var10000 = 22;
               break;
            case 186:
               var10000 = 204;
               break;
            case 187:
               var10000 = 206;
               break;
            case 188:
               var10000 = 253;
               break;
            case 189:
               var10000 = 64;
               break;
            case 190:
               var10000 = 212;
               break;
            case 191:
               var10000 = 77;
               break;
            case 192:
               var10000 = 224;
               break;
            case 193:
               var10000 = 195;
               break;
            case 194:
               var10000 = 239;
               break;
            case 195:
               var10000 = 116;
               break;
            case 196:
               var10000 = 233;
               break;
            case 197:
               var10000 = 168;
               break;
            case 198:
               var10000 = 56;
               break;
            case 199:
               var10000 = 9;
               break;
            case 200:
               var10000 = 123;
               break;
            case 201:
               var10000 = 7;
               break;
            case 202:
               var10000 = 152;
               break;
            case 203:
               var10000 = 53;
               break;
            case 204:
               var10000 = 67;
               break;
            case 205:
               var10000 = 27;
               break;
            case 206:
               var10000 = 85;
               break;
            case 207:
               var10000 = 216;
               break;
            case 208:
               var10000 = 241;
               break;
            case 209:
               var10000 = 185;
               break;
            case 210:
               var10000 = 73;
               break;
            case 211:
               var10000 = 57;
               break;
            case 212:
               var10000 = 19;
               break;
            case 213:
               var10000 = 20;
               break;
            case 214:
               var10000 = 103;
               break;
            case 215:
               var10000 = 42;
               break;
            case 216:
               var10000 = 164;
               break;
            case 217:
               var10000 = 75;
               break;
            case 218:
               var10000 = 105;
               break;
            case 219:
               var10000 = 16;
               break;
            case 220:
               var10000 = 184;
               break;
            case 221:
               var10000 = 120;
               break;
            case 222:
               var10000 = 66;
               break;
            case 223:
               var10000 = 243;
               break;
            case 224:
               var10000 = 52;
               break;
            case 225:
               var10000 = 148;
               break;
            case 226:
               var10000 = 35;
               break;
            case 227:
               var10000 = 167;
               break;
            case 228:
               var10000 = 94;
               break;
            case 229:
               var10000 = 211;
               break;
            case 230:
               var10000 = 149;
               break;
            case 231:
               var10000 = 209;
               break;
            case 232:
               var10000 = 187;
               break;
            case 233:
               var10000 = 44;
               break;
            case 234:
               var10000 = 114;
               break;
            case 235:
               var10000 = 13;
               break;
            case 236:
               var10000 = 244;
               break;
            case 237:
               var10000 = 61;
               break;
            case 238:
               var10000 = 132;
               break;
            case 239:
               var10000 = 8;
               break;
            case 240:
               var10000 = 59;
               break;
            case 241:
               var10000 = 2;
               break;
            case 242:
               var10000 = 117;
               break;
            case 243:
               var10000 = 226;
               break;
            case 244:
               var10000 = 240;
               break;
            case 245:
               var10000 = 180;
               break;
            case 246:
               var10000 = 99;
               break;
            case 247:
               var10000 = 140;
               break;
            case 248:
               var10000 = 181;
               break;
            case 249:
               var10000 = 210;
               break;
            case 250:
               var10000 = 45;
               break;
            case 251:
               var10000 = 38;
               break;
            case 252:
               var10000 = 215;
               break;
            case 253:
               var10000 = 171;
               break;
            case 254:
               var10000 = 229;
               break;
            default:
               var10000 = 121;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11782;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[23];
      int var11 = 0;
      String var10 = "\u008e¹ËK\u008dê\u0015-ý\u0012\u0005Ý\u008eÙÊÉ(\u0004淎勮吺乜.Þw%tÁ´jÎÉ'£\u0080B8\u0093¥XåN`ÕZÀS\u008d}(³Ò%îY½í~³ÝIhò\u0006MÑ-Ø8\t来屯洃剥嚥追箞M<\u0018¥H\u008a^äãZ&\u0093c%~ç;×¸:\u0099ÆáÛüÜÉ\u0004v\u000f,|\u001by\u008c\u0011Æ\u0097ð;DY/<òá\u0002à(À½=î\u0086Â,FRSÏ\u0002否三\u0018ï®Ã\u0082Íx\u007fU7\r±³u\u0082\u0085\u008fp\u007f\u008f=ògùº\u0002咐祙\u0002碵嬼\u0019}O\u0091¾\u0087ÿ6¥\u001e\u0013\u0094nÖó\u0007H@\u0002ºÇXçRâ\u009d\u0010Á\u008fß\u0010ä[ÊgK\u0093´÷\u001f,\u0000\u0096\u0013Éª\u0014Btq]\u0019à\u000eÊJíG²\u0080KÕÁ\u0002厅洱\u001aã\u0014BÕý\u0092v\bð¦\tÃG:3åLíÌa\u008ef\u0084\r¹r\u0004\u0005ÌB\u0004\r挐冿卒斟g劦惉畭扗吶仍¢b\u0011[áq@Ú\u008bÿ\u0001 \u0097®mûÏd\u000bý\u0005羀轃咣仾\u0014\tQ7L'w³<\u0095\u0094";
      int var12 = "\u008e¹ËK\u008dê\u0015-ý\u0012\u0005Ý\u008eÙÊÉ(\u0004淎勮吺乜.Þw%tÁ´jÎÉ'£\u0080B8\u0093¥XåN`ÕZÀS\u008d}(³Ò%îY½í~³ÝIhò\u0006MÑ-Ø8\t来屯洃剥嚥追箞M<\u0018¥H\u008a^äãZ&\u0093c%~ç;×¸:\u0099ÆáÛüÜÉ\u0004v\u000f,|\u001by\u008c\u0011Æ\u0097ð;DY/<òá\u0002à(À½=î\u0086Â,FRSÏ\u0002否三\u0018ï®Ã\u0082Íx\u007fU7\r±³u\u0082\u0085\u008fp\u007f\u008f=ògùº\u0002咐祙\u0002碵嬼\u0019}O\u0091¾\u0087ÿ6¥\u001e\u0013\u0094nÖó\u0007H@\u0002ºÇXçRâ\u009d\u0010Á\u008fß\u0010ä[ÊgK\u0093´÷\u001f,\u0000\u0096\u0013Éª\u0014Btq]\u0019à\u000eÊJíG²\u0080KÕÁ\u0002厅洱\u001aã\u0014BÕý\u0092v\bð¦\tÃG:3åLíÌa\u008ef\u0084\r¹r\u0004\u0005ÌB\u0004\r挐冿卒斟g劦惉畭扗吶仍¢b\u0011[áq@Ú\u008bÿ\u0001 \u0097®mûÏd\u000bý\u0005羀轃咣仾\u0014\tQ7L'w³<\u0095\u0094"
         .length();
      char var9 = 17;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 7;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      Object var33;
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
                        var65 = 52;
                        break;
                     case 1:
                        var65 = 57;
                        break;
                     case 2:
                        var65 = 123;
                        break;
                     case 3:
                        var65 = 17;
                        break;
                     case 4:
                        var65 = 23;
                        break;
                     case 5:
                        var65 = 70;
                        break;
                     default:
                        var65 = 12;
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
                     b = new String[23];
                     long var0 = 5946650754015933659L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "[}ÆÄ\u007fÌ_a¾Â\u0001\u0083ñÇûNÝ}ý$y[ð\u0004û\u0091r|Êaf\u00841aÙ\u0094ÅÄ\u0087\u0003";
                     int var5 = "[}ÆÄ\u007fÌ_a¾Â\u0001\u0083ñÇûNÝ}ý$y[ð\u0004û\u0091r|Êaf\u00841aÙ\u0094ÅÄ\u0087\u0003".length();
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
                                    c = var6;
                                    e = new Integer[7];
                                    Registry.lookupField(280491322274249111L).setInt(null, a(18540, 4348643204373767791L));
                                    Registry.lookupField(142413749338711971L).setInt(null, a(16393, 8912541431922650633L));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "7EÎYïðÒÐÕ\u0099ä\u001a\u008bÞÚ\u001a";
                                 var5 = "7EÎYïðÒÐÕ\u0099ä\u001a\u008bÞÚ\u001a".length();
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

                  var10 = "匷斍\t\u0090\\h\u0005(NJ\u0082/";
                  var12 = "匷斍\t\u0090\\h\u0005(NJ\u0082/".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 33;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





