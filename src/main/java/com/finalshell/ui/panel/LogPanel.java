package com.finalshell.ui.panel;

import com.finalshell.core.Mk2;
import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Cg4;
import com.finalshell.ui.listener.CP;
import com.finalshell.ui.listener.FH;
import com.finalshell.ui.listener.UP3;
import com.finalshell.ui.listener.Ui2;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class LogPanel extends JPanel {
   public JButton m;
   public JTextArea O;
   public boolean E;
   public final int h;
   public JScrollPane W;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public LogPanel() {
      super();
      long var30;
      Registry.lookupField(376642468236131701L).setBoolean(this, true);
      this.h = a(26660, 3010000648684305307L);
      this.setLayout(new MigLayout(a(23406, 21430), a(23404, -1626), a(23399, -8210)));
      JButton var10002;
      Object[] var10003 = Registry.packArgs(a(23393, 29654));
      long var6 = 517287540690064504L;
      Object var10004 = Ref.h2(517287540690064504L, var6);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

var10003 = new Ui2((String)var10004);
      long var9 = 402079050501623703L;
      JButton var8 = var10002;
      Ref.s(402079050501623703L, var8, var9);
      Object var10 = 402079050501623703L;
      this.add((JButton)Ref.g(402079050501623703L, var10), a(23396, 32061));
      Object var12 = 402079050501623703L;
      ((JButton)Ref.g(402079050501623703L, var12)).addActionListener(new Ui2(this));
      JButton var10005;
      Object[] var10006 = Registry.packArgs(a(23400, 31050));
      long var14 = 517287540690064504L;
      Object var10007 = Ref.h2(517287540690064504L, var14);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      var10006 = new int[(String)var10007];
      JButton var1 = var10005;
      var1.addActionListener(new CP(this));
      JLabel var2 = new JLabel(a(23401, -27424));
      var2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.add(var2, a(23392, 4899));
      JTextArea var46 = new JTextArea();
      long var17 = 544408036581651484L;
      JTextArea var16 = var46;
      Ref.s(544408036581651484L, var16, var17);
      Object var18 = 544408036581651484L;
      ((JTextArea)Ref.g(544408036581651484L, var18)).setEditable(false);
      Object var20 = 544408036581651484L;
      Registry.packArgs(Ref.g(544408036581651484L, var20));
      long var22 = 322267315291882359L;
      Ref.h2(322267315291882359L, var22);
      JScrollPane var10011;
      Object var24 = 544408036581651484L;
      // [VF-super] super((JTextArea)Ref.g(544408036581651484L, var24));
      long var27 = 291624504329155555L;
      JScrollPane var26 = var10011;
      Ref.s(291624504329155555L, var26, var27);
      Object var28 = 291624504329155555L;
      this.add((JScrollPane)Ref.g(291624504329155555L, var28), a(23405, 9799));
      JPanel var3 = new JPanel(new MigLayout());
      this.add(var3, a(23397, 30026));
      JCheckBox var10013;
      Object[] var10014 = Registry.packArgs(a(23403, -22190));
      var30 = 517287540690064504L;
      Object var10015 = Ref.h2(517287540690064504L, var30);

      try {
         var10015 = (String)var10015;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

var10014 = new FH((String)var10015, Registry.lookupField(376642468236131701L).getBoolean(this));
      JCheckBox var4 = var10013;
      var3.add(var4, a(23398, 29260));
      var4.addActionListener(new FH(this, var4));
      Registry.packArgs(a(23407, 4602));
      long var32 = 517287540690064504L;
      var10015 = Registry.packArgs(Ref.h2(517287540690064504L, var32));
      long var35 = 176672096054450641L;
      Object[] var34 = (Object[])var10015;
      var10015 = Ref.h(176672096054450641L, var34, var35);

      try {
         var10015 = (JButton)var10015;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      JButton var5 = (JButton)var10015;
      var3.add(var5, a(23402, -4831));
      var5.addActionListener(new UP3(this));
      Registry.emptyArgs();
      long var36 = 270389152141252877L;
      Ref.h2(270389152141252877L, var36);
      Object[] var10017 = Registry.packArgs(new Mk2(this));
      long var39 = 459969040127248336L;
      Object[] var38 = var10017;
      Ref.h(459969040127248336L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }
   }

   public synchronized void T(String var1) {
      Object var2 = 544408036581651484L;
      ((JTextArea)Ref.g(544408036581651484L, var2)).append(var1 + "\n");
      Object var4 = 544408036581651484L;
      Object[] var10003 = Registry.packArgs(Ref.g(544408036581651484L, var4));
      long var7 = 216740776826608766L;
      Object[] var6 = var10003;
      Ref.h(216740776826608766L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      SwingUtilities.invokeLater(new Cg4(this));
   }

   public void z() {
   }

   public JButton Q(String var1) {
      JButton var2 = new JButton(var1);
      var2.setMargin(new Insets(0, 5, 0, 5));
      var2.setFocusPainted(false);
      return var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void O(JTextArea var1) {
      BadLocationException var10;
      int var10000 = User.c$int();
      int var3 = var1.getLineCount() - a(32221, 3889047184158191203L);
      int var2 = var10000;

      label30: {
         label29: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label29;
               }

               if (var3 <= 0) {
                  return;
               }
            } catch (BadLocationException var7) {
               throw a(var7);
            }

            try {
               var10000 = var1.getLineEndOffset(var3 - 1);
            } catch (BadLocationException var6) {
               var10 = var6;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            int var8 = var10000;
            var1.replaceRange("", 0, var8);
            return;
         } catch (BadLocationException var5) {
            var10 = var5;
            boolean var11 = false;
         }
      }

      BadLocationException var4 = var10;
      var4.printStackTrace();
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23405) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 226;
               break;
            case 1:
               var10000 = 72;
               break;
            case 2:
               var10000 = 74;
               break;
            case 3:
               var10000 = 12;
               break;
            case 4:
               var10000 = 213;
               break;
            case 5:
               var10000 = 204;
               break;
            case 6:
               var10000 = 180;
               break;
            case 7:
               var10000 = 190;
               break;
            case 8:
               var10000 = 217;
               break;
            case 9:
               var10000 = 186;
               break;
            case 10:
               var10000 = 144;
               break;
            case 11:
               var10000 = 248;
               break;
            case 12:
               var10000 = 199;
               break;
            case 13:
               var10000 = 36;
               break;
            case 14:
               var10000 = 121;
               break;
            case 15:
               var10000 = 25;
               break;
            case 16:
               var10000 = 153;
               break;
            case 17:
               var10000 = 90;
               break;
            case 18:
               var10000 = 225;
               break;
            case 19:
               var10000 = 216;
               break;
            case 20:
               var10000 = 27;
               break;
            case 21:
               var10000 = 114;
               break;
            case 22:
               var10000 = 73;
               break;
            case 23:
               var10000 = 195;
               break;
            case 24:
               var10000 = 203;
               break;
            case 25:
               var10000 = 208;
               break;
            case 26:
               var10000 = 116;
               break;
            case 27:
               var10000 = 6;
               break;
            case 28:
               var10000 = 17;
               break;
            case 29:
               var10000 = 30;
               break;
            case 30:
               var10000 = 137;
               break;
            case 31:
               var10000 = 93;
               break;
            case 32:
               var10000 = 19;
               break;
            case 33:
               var10000 = 60;
               break;
            case 34:
               var10000 = 41;
               break;
            case 35:
               var10000 = 172;
               break;
            case 36:
               var10000 = 37;
               break;
            case 37:
               var10000 = 99;
               break;
            case 38:
               var10000 = 212;
               break;
            case 39:
               var10000 = 182;
               break;
            case 40:
               var10000 = 89;
               break;
            case 41:
               var10000 = 236;
               break;
            case 42:
               var10000 = 206;
               break;
            case 43:
               var10000 = 162;
               break;
            case 44:
               var10000 = 9;
               break;
            case 45:
               var10000 = 85;
               break;
            case 46:
               var10000 = 149;
               break;
            case 47:
               var10000 = 197;
               break;
            case 48:
               var10000 = 4;
               break;
            case 49:
               var10000 = 151;
               break;
            case 50:
               var10000 = 69;
               break;
            case 51:
               var10000 = 196;
               break;
            case 52:
               var10000 = 111;
               break;
            case 53:
               var10000 = 218;
               break;
            case 54:
               var10000 = 122;
               break;
            case 55:
               var10000 = 223;
               break;
            case 56:
               var10000 = 23;
               break;
            case 57:
               var10000 = 18;
               break;
            case 58:
               var10000 = 184;
               break;
            case 59:
               var10000 = 98;
               break;
            case 60:
               var10000 = 183;
               break;
            case 61:
               var10000 = 155;
               break;
            case 62:
               var10000 = 31;
               break;
            case 63:
               var10000 = 193;
               break;
            case 64:
               var10000 = 84;
               break;
            case 65:
               var10000 = 164;
               break;
            case 66:
               var10000 = 110;
               break;
            case 67:
               var10000 = 123;
               break;
            case 68:
               var10000 = 245;
               break;
            case 69:
               var10000 = 127;
               break;
            case 70:
               var10000 = 22;
               break;
            case 71:
               var10000 = 117;
               break;
            case 72:
               var10000 = 178;
               break;
            case 73:
               var10000 = 77;
               break;
            case 74:
               var10000 = 49;
               break;
            case 75:
               var10000 = 92;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 97;
               break;
            case 78:
               var10000 = 200;
               break;
            case 79:
               var10000 = 177;
               break;
            case 80:
               var10000 = 47;
               break;
            case 81:
               var10000 = 219;
               break;
            case 82:
               var10000 = 235;
               break;
            case 83:
               var10000 = 215;
               break;
            case 84:
               var10000 = 242;
               break;
            case 85:
               var10000 = 79;
               break;
            case 86:
               var10000 = 154;
               break;
            case 87:
               var10000 = 238;
               break;
            case 88:
               var10000 = 210;
               break;
            case 89:
               var10000 = 171;
               break;
            case 90:
               var10000 = 135;
               break;
            case 91:
               var10000 = 94;
               break;
            case 92:
               var10000 = 201;
               break;
            case 93:
               var10000 = 57;
               break;
            case 94:
               var10000 = 56;
               break;
            case 95:
               var10000 = 254;
               break;
            case 96:
               var10000 = 54;
               break;
            case 97:
               var10000 = 87;
               break;
            case 98:
               var10000 = 131;
               break;
            case 99:
               var10000 = 244;
               break;
            case 100:
               var10000 = 96;
               break;
            case 101:
               var10000 = 51;
               break;
            case 102:
               var10000 = 134;
               break;
            case 103:
               var10000 = 233;
               break;
            case 104:
               var10000 = 64;
               break;
            case 105:
               var10000 = 100;
               break;
            case 106:
               var10000 = 63;
               break;
            case 107:
               var10000 = 113;
               break;
            case 108:
               var10000 = 220;
               break;
            case 109:
               var10000 = 205;
               break;
            case 110:
               var10000 = 174;
               break;
            case 111:
               var10000 = 81;
               break;
            case 112:
               var10000 = 140;
               break;
            case 113:
               var10000 = 83;
               break;
            case 114:
               var10000 = 112;
               break;
            case 115:
               var10000 = 160;
               break;
            case 116:
               var10000 = 165;
               break;
            case 117:
               var10000 = 67;
               break;
            case 118:
               var10000 = 10;
               break;
            case 119:
               var10000 = 146;
               break;
            case 120:
               var10000 = 105;
               break;
            case 121:
               var10000 = 152;
               break;
            case 122:
               var10000 = 202;
               break;
            case 123:
               var10000 = 209;
               break;
            case 124:
               var10000 = 130;
               break;
            case 125:
               var10000 = 82;
               break;
            case 126:
               var10000 = 194;
               break;
            case 127:
               var10000 = 109;
               break;
            case 128:
               var10000 = 128;
               break;
            case 129:
               var10000 = 1;
               break;
            case 130:
               var10000 = 147;
               break;
            case 131:
               var10000 = 80;
               break;
            case 132:
               var10000 = 43;
               break;
            case 133:
               var10000 = 33;
               break;
            case 134:
               var10000 = 249;
               break;
            case 135:
               var10000 = 58;
               break;
            case 136:
               var10000 = 103;
               break;
            case 137:
               var10000 = 108;
               break;
            case 138:
               var10000 = 52;
               break;
            case 139:
               var10000 = 68;
               break;
            case 140:
               var10000 = 143;
               break;
            case 141:
               var10000 = 120;
               break;
            case 142:
               var10000 = 0;
               break;
            case 143:
               var10000 = 187;
               break;
            case 144:
               var10000 = 240;
               break;
            case 145:
               var10000 = 106;
               break;
            case 146:
               var10000 = 157;
               break;
            case 147:
               var10000 = 161;
               break;
            case 148:
               var10000 = 173;
               break;
            case 149:
               var10000 = 48;
               break;
            case 150:
               var10000 = 169;
               break;
            case 151:
               var10000 = 20;
               break;
            case 152:
               var10000 = 53;
               break;
            case 153:
               var10000 = 3;
               break;
            case 154:
               var10000 = 14;
               break;
            case 155:
               var10000 = 46;
               break;
            case 156:
               var10000 = 39;
               break;
            case 157:
               var10000 = 251;
               break;
            case 158:
               var10000 = 234;
               break;
            case 159:
               var10000 = 2;
               break;
            case 160:
               var10000 = 185;
               break;
            case 161:
               var10000 = 232;
               break;
            case 162:
               var10000 = 70;
               break;
            case 163:
               var10000 = 15;
               break;
            case 164:
               var10000 = 86;
               break;
            case 165:
               var10000 = 104;
               break;
            case 166:
               var10000 = 138;
               break;
            case 167:
               var10000 = 29;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 42;
               break;
            case 170:
               var10000 = 35;
               break;
            case 171:
               var10000 = 211;
               break;
            case 172:
               var10000 = 148;
               break;
            case 173:
               var10000 = 188;
               break;
            case 174:
               var10000 = 136;
               break;
            case 175:
               var10000 = 7;
               break;
            case 176:
               var10000 = 170;
               break;
            case 177:
               var10000 = 142;
               break;
            case 178:
               var10000 = 11;
               break;
            case 179:
               var10000 = 125;
               break;
            case 180:
               var10000 = 231;
               break;
            case 181:
               var10000 = 76;
               break;
            case 182:
               var10000 = 124;
               break;
            case 183:
               var10000 = 191;
               break;
            case 184:
               var10000 = 250;
               break;
            case 185:
               var10000 = 246;
               break;
            case 186:
               var10000 = 50;
               break;
            case 187:
               var10000 = 192;
               break;
            case 188:
               var10000 = 156;
               break;
            case 189:
               var10000 = 44;
               break;
            case 190:
               var10000 = 119;
               break;
            case 191:
               var10000 = 88;
               break;
            case 192:
               var10000 = 221;
               break;
            case 193:
               var10000 = 228;
               break;
            case 194:
               var10000 = 78;
               break;
            case 195:
               var10000 = 255;
               break;
            case 196:
               var10000 = 176;
               break;
            case 197:
               var10000 = 61;
               break;
            case 198:
               var10000 = 189;
               break;
            case 199:
               var10000 = 252;
               break;
            case 200:
               var10000 = 163;
               break;
            case 201:
               var10000 = 247;
               break;
            case 202:
               var10000 = 179;
               break;
            case 203:
               var10000 = 107;
               break;
            case 204:
               var10000 = 241;
               break;
            case 205:
               var10000 = 253;
               break;
            case 206:
               var10000 = 65;
               break;
            case 207:
               var10000 = 16;
               break;
            case 208:
               var10000 = 133;
               break;
            case 209:
               var10000 = 24;
               break;
            case 210:
               var10000 = 150;
               break;
            case 211:
               var10000 = 126;
               break;
            case 212:
               var10000 = 118;
               break;
            case 213:
               var10000 = 8;
               break;
            case 214:
               var10000 = 159;
               break;
            case 215:
               var10000 = 26;
               break;
            case 216:
               var10000 = 5;
               break;
            case 217:
               var10000 = 71;
               break;
            case 218:
               var10000 = 167;
               break;
            case 219:
               var10000 = 55;
               break;
            case 220:
               var10000 = 181;
               break;
            case 221:
               var10000 = 243;
               break;
            case 222:
               var10000 = 101;
               break;
            case 223:
               var10000 = 239;
               break;
            case 224:
               var10000 = 91;
               break;
            case 225:
               var10000 = 207;
               break;
            case 226:
               var10000 = 13;
               break;
            case 227:
               var10000 = 62;
               break;
            case 228:
               var10000 = 95;
               break;
            case 229:
               var10000 = 237;
               break;
            case 230:
               var10000 = 145;
               break;
            case 231:
               var10000 = 141;
               break;
            case 232:
               var10000 = 75;
               break;
            case 233:
               var10000 = 166;
               break;
            case 234:
               var10000 = 40;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 132;
               break;
            case 237:
               var10000 = 139;
               break;
            case 238:
               var10000 = 129;
               break;
            case 239:
               var10000 = 21;
               break;
            case 240:
               var10000 = 115;
               break;
            case 241:
               var10000 = 66;
               break;
            case 242:
               var10000 = 38;
               break;
            case 243:
               var10000 = 230;
               break;
            case 244:
               var10000 = 224;
               break;
            case 245:
               var10000 = 175;
               break;
            case 246:
               var10000 = 45;
               break;
            case 247:
               var10000 = 198;
               break;
            case 248:
               var10000 = 229;
               break;
            case 249:
               var10000 = 214;
               break;
            case 250:
               var10000 = 222;
               break;
            case 251:
               var10000 = 227;
               break;
            case 252:
               var10000 = 102;
               break;
            case 253:
               var10000 = 28;
               break;
            case 254:
               var10000 = 32;
               break;
            default:
               var10000 = 168;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5054;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var30;
      String[] var13 = new String[14];
      int var11 = 0;
      var10 = "6=?|'\u0004·Bzk¢!\u001f=øjµ\u008a\tEça:e\u008bê,KXs÷É\u0002§Æ(\u0098ÓÈ§w(ÐùôÁ,}\u0080õl,Tó\u009cÌxApx\u0019%ÿA·Ï¨6\u0000M/8?\u0082³D\u0011¨d&¡íßk\u0002¸1úb\bDÐM\u0018\u0002攺忰0Öý\u001f\u008fýYØT¢dQËDú«ÝZ(û\u009e¥§»\u0090²¹N\u0096Q\u0014+\u0010\u009cT\u0099\u001bà&\u0011 à\u008fÕé\u0018\fßc0\\°-b¶ R\\D²®õ«&\u0018ì¸ËÛ¬%üÂSÔ&{9¦àS°\u00951idT&dó¸xK÷Qñ\u000eO\u00164Ù\u008e~½aþ3\u000f,£\u0094/^Ï:}v°\u008eR¯\fcµLÛã\u0081°¦¶mûe(Æ,!^ä@ÏÂux_ZvK·\u0084\r>/\u0082a\u008b¼i¹Ià\u000f`àI\u0096ÔE\u001e\u009aI\u008c:\u009d\të¨x=\u00038o}$\f¸ç7\u0091\u008cÈ]\u008f\u000bHLÁ";
      int var12 = "6=?|'\u0004·Bzk¢!\u001f=øjµ\u008a\tEça:e\u008bê,KXs÷É\u0002§Æ(\u0098ÓÈ§w(ÐùôÁ,}\u0080õl,Tó\u009cÌxApx\u0019%ÿA·Ï¨6\u0000M/8?\u0082³D\u0011¨d&¡íßk\u0002¸1úb\bDÐM\u0018\u0002攺忰0Öý\u001f\u008fýYØT¢dQËDú«ÝZ(û\u009e¥§»\u0090²¹N\u0096Q\u0014+\u0010\u009cT\u0099\u001bà&\u0011 à\u008fÕé\u0018\fßc0\\°-b¶ R\\D²®õ«&\u0018ì¸ËÛ¬%üÂSÔ&{9¦àS°\u00951idT&dó¸xK÷Qñ\u000eO\u00164Ù\u008e~½aþ3\u000f,£\u0094/^Ï:}v°\u008eR¯\fcµLÛã\u0081°¦¶mûe(Æ,!^ä@ÏÂux_ZvK·\u0084\r>/\u0082a\u008b¼i¹Ià\u000f`àI\u0096ÔE\u001e\u009aI\u008c:\u009d\të¨x=\u00038o}$\f¸ç7\u0091\u008cÈ]\u008f\u000bHLÁ"
         .length();
      char var9 = ' ';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 48;
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
                        var58 = 64;
                        break;
                     case 1:
                        var58 = 116;
                        break;
                     case 2:
                        var58 = 58;
                        break;
                     case 3:
                        var58 = 83;
                        break;
                     case 4:
                        var58 = 49;
                        break;
                     case 5:
                        var58 = 13;
                        break;
                     default:
                        var58 = 28;
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
                     b = new String[14];
                     long var0 = 8776525436907528514L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0091\u008e\u001b'\u0093vÌÉ2h\u0003çë\u0088Y1";
                     int var5 = "\u0091\u008e\u001b'\u0093vÌÉ2h\u0003çë\u0088Y1".length();
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
                     d = new Integer[2];
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

                  var10 = "&\u009e\u0081`júÔSUõ=Ù\\Ê\u008eáÕÖ\u0091/`D²µ¨YR¿&g\u0099Ä\u0081«\u0086\u0086\fÄq÷\u0018ëªf\u0093ç\u0094¾\u0004/.X#";
                  var12 = "&\u009e\u0081`júÔSUõ=Ù\\Ê\u008eáÕÖ\u0091/`D²µ¨YR¿&g\u0099Ä\u0081«\u0086\u0086\fÄq÷\u0018ëªf\u0093ç\u0094¾\u0004/.X#".length();
                  var9 = '0';
                  var16 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





