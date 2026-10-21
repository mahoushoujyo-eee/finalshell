package com.finalshell.ui.dialog;

import com.finalshell.core.ZG_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.OK;
import com.finalshell.ui.listener.UT3;
import com.finalshell.ui.listener.VT;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class SetByKeyboardDialog extends JDialog {
   public SwitchTabCommand S;
   public ZG_2 P;
   public boolean i;
   public JPanel W;
   public JPanel T;
   public JTextField d;
   public Random z;
   public JLabel g;
   public KeyStroke a;
   public static String[] b;
   public static String[] c;
   public static long[] e;
   public static Integer[] f;

   public SetByKeyboardDialog(SwitchTabCommand var1, ZG_2 var2, boolean var3) {
   super(SwingUtilities.getWindowAncestor(var1));
   JTextField var37;
      String[] var4;
      label62: {
         String[] var10000 = SwitchTabCommand.B();
         var4 = var10000;
         Random var10001 = new Random();
         long var14 = 386686818580790910L;
         Random var13 = var10001;
         Ref.s(386686818580790910L, var13, var14);
         long var16 = 184771138473043971L;
         Ref.s(184771138473043971L, var1, var16);
         long var18 = 140293464803714020L;
         Ref.s(140293464803714020L, var2, var18);
         Registry.lookupField(499887376556262912L).setBoolean(this, var3);
         if (var4 != null) {
            if (!var3) {
               this.setTitle(a(-3830, 30283));
               if (var4 != null) {
                  break label62;
               }

               Ky4.K(new String[4]);
            }

            this.setTitle(a(-3817, 16932));
         }

         Object[] var10005 = Registry.emptyArgs();
         long var20 = 546345160214988812L;
         Object[] var19 = var10005;
         var10005 = Ref.h(546345160214988812L, var19, var20);
         long var22 = 225851015118401415L;
         Object var21 = var10005;
         Ref.s(225851015118401415L, var21, var22);
      }

      JPanel var5 = (JPanel)this.getContentPane();
      var5.setLayout(new MigLayout(a(-3821, -516), "", a(-3810, 19242)));
      JPanel var10006 = new JPanel();
      long var24 = 202435209707003633L;
      JPanel var23 = var10006;
      Ref.s(202435209707003633L, var23, var24);
      Object var25 = 202435209707003633L;
      ((JPanel)Ref.g(202435209707003633L, var25)).setLayout(new MigLayout(a(-3816, 15715), a(-3827, -21777), a(-3809, 30159)));
      Object var27 = 202435209707003633L;
      this.add((JPanel)Ref.g(202435209707003633L, var27), a(-3824, -31183));
      JPanel var6 = new JPanel(new MigLayout(a(-3811, 8511)));
      Object var29 = 202435209707003633L;
      ((JPanel)Ref.g(202435209707003633L, var29)).add(var6, a(-3812, -961));
      var6.add(new JLabel(a(-3832, -391)), a(-3825, -11739));
      JLabel var10010 = new JLabel();
      long var32 = 423082797457659284L;
      JLabel var31 = var10010;
      Ref.s(423082797457659284L, var31, var32);
      Object var33 = 423082797457659284L;
      this.add((JLabel)Ref.g(423082797457659284L, var33), a(-3820, -31310));
      JPanel var7 = new JPanel(new MigLayout(a(-3823, 3190)));
      Object var35 = 202435209707003633L;
      ((JPanel)Ref.g(202435209707003633L, var35)).add(var7, a(-3828, -878));
      var7.add(new JLabel(a(-3819, -27897)), a(-3815, 10086));
      JTextField var10013 = new JTextField();
      long var38 = 429365332657596163L;
      var37 = var10013;
      Ref.s(429365332657596163L, var37, var38);
      Object var39 = 429365332657596163L;
      ((JTextField)Ref.g(429365332657596163L, var39)).setEditable(false);
      Object var41 = 429365332657596163L;
      ((JTextField)Ref.g(429365332657596163L, var41)).setFont((Font)Registry.lookupField(168620665706526093L).get(null));
      Object var43 = 429365332657596163L;
      KeyListener[] var8 = ((JTextField)Ref.g(429365332657596163L, var43)).getKeyListeners();
      KeyListener[] var9 = var8;
      int var10 = var8.length;
      int var11 = 0;

      while (true) {
         if (var11 < var10) {
            KeyListener var12 = var9[var11];
            Object var45 = 429365332657596163L;
            ((JTextField)Ref.g(429365332657596163L, var45)).removeKeyListener(var12);
            var11++;
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         Object var47 = 429365332657596163L;
         ((JTextField)Ref.g(429365332657596163L, var47)).getInputMap().clear();
         Object var49 = 429365332657596163L;
         ((JTextField)Ref.g(429365332657596163L, var49)).getActionMap().clear();
         Object var51 = 429365332657596163L;
         ((JTextField)Ref.g(429365332657596163L, var51))
            .setForeground(new Color(a(1451, 6414258268126243132L), a(4369, 8249963419253702020L), a(4369, 8249963419253702020L)));
         Object var53 = 429365332657596163L;
         this.add((JTextField)Ref.g(429365332657596163L, var53), a(-3822, -9951));
         Object var55 = 429365332657596163L;
         ((JTextField)Ref.g(429365332657596163L, var55)).addKeyListener(new OK(this));
         Object var57 = 202435209707003633L;
         ((JPanel)Ref.g(202435209707003633L, var57)).add(new JPanel(), a(-3831, 23041));
         break;
      }

      JPanel var83 = new JPanel(new MigLayout(a(-3823, 3190)));
      Object var59 = 202435209707003633L;
      ((JPanel)Ref.g(202435209707003633L, var59)).add(var83, a(-3828, -878));
      var83.add(new JLabel(a(-3814, 22411)), "");
      JPanel var10024 = new JPanel();
      long var62 = 477495723670059197L;
      JPanel var61 = var10024;
      Ref.s(477495723670059197L, var61, var62);
      Object var63 = 477495723670059197L;
      this.add((JPanel)Ref.g(477495723670059197L, var63), a(-3818, 25836));
      Object var65 = 477495723670059197L;
      ((JPanel)Ref.g(477495723670059197L, var65)).setLayout(new MigLayout(a(-3826, 22359)));
      JButton var84 = new JButton(a(-3813, 440));
      var84.setFocusable(false);
      Object var67 = 477495723670059197L;
      ((JPanel)Ref.g(477495723670059197L, var67)).add(var84);
      var84.addActionListener(new VT(this));
      JButton var85 = new JButton(a(-3829, 25097));
      var85.setFocusable(false);
      if (var4 != null) {
         Object var69 = 477495723670059197L;
         ((JPanel)Ref.g(477495723670059197L, var69)).add(var85);
         var85.addActionListener(new UT3(this));
         if (var3) {
            Object var71 = 423082797457659284L;
            JLabel var10029 = (JLabel)Ref.g(423082797457659284L, var71);
            String var10031 = (String)(Registry.emptyArgs());
            long var74 = 540131728661869699L;
            Object var73 = var10031;
            var10031 = Ref.h(540131728661869699L, var73, var74);

            try {
               var10031 = (String)var10031;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

            var2.setText(var10031);
            Object var75 = 429365332657596163L;
            JTextField var89 = (JTextField)Ref.g(429365332657596163L, var75);
            Object var10033 = Registry.emptyArgs();
            long var78 = 546345160214988812L;
            Object var77 = var10033;
            var10033 = Registry.packArgs(Ref.h(546345160214988812L, var77, var78));
            long var79 = 214304962730069281L;
            Object var10034 = Ref.h2(214304962730069281L, var79);

            try {
               var10034 = (String)var10034;
            } catch (InvocationTargetException var81) {
               throw var81.getTargetException();
            }

            ((javax.swing.text.JTextComponent)var10033).setText((String)var10034);
         }

         SwingUtilities.getWindowAncestor(var1);
      }

      this.setSize(a(20644, 4215116110895234096L), a(21201, 7401634698643127879L));
      this.pack();
      this.setLocationRelativeTo(this);
      this.setModal(true);
      this.setVisible(true);
   }

   public void D() {
      Integer var37;
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 306266403902896148L;
      Object[] var3 = var10002;
      Ref.h(306266403902896148L, var3, var4);
      Object var5 = 140293464803714020L;
      Ref.g(140293464803714020L, var5);
      Object[] var10005 = Registry.emptyArgs();
      long var8 = 468069908955066583L;
      Object[] var7 = var10005;
      var10005 = Ref.h(468069908955066583L, var7, var8);

      try {
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      Object var9 = 225851015118401415L;
      Object[] var10006 = Registry.packArgs((int)this, Ref.g(225851015118401415L, var9));
      long var12 = 607172107682271369L;
      Object[] var11 = var10006;
      Ref.h(607172107682271369L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10008 = Registry.emptyArgs();
      long var16 = 578864097947885485L;
      Object[] var15 = var10008;
      Ref.h(578864097947885485L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object var17 = 184771138473043971L;
      Ref.g(184771138473043971L, var17);
      Object[] var10010 = Registry.emptyArgs();
      long var20 = 380643681445351128L;
      Object[] var19 = var10010;
      Ref.h(380643681445351128L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var21 = 184771138473043971L;
      Ref.g(184771138473043971L, var21);
      Object var23 = 140293464803714020L;
      Ref.g(140293464803714020L, var23);
      Object var10014 = Registry.emptyArgs();
      long var26 = 468069908955066583L;
      Object var25 = var10014;
      var10014 = Ref.h(468069908955066583L, var25, var26);

      try {
         var37 = (Integer)var10014;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      var10014 = Registry.packArgs(var37);
      long var28 = 221528496004086081L;
      Object var27 = var10014;
      Ref.h(221528496004086081L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      this.setVisible(false);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3814) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 230;
               break;
            case 1:
               var10000 = 140;
               break;
            case 2:
               var10000 = 14;
               break;
            case 3:
               var10000 = 141;
               break;
            case 4:
               var10000 = 80;
               break;
            case 5:
               var10000 = 63;
               break;
            case 6:
               var10000 = 128;
               break;
            case 7:
               var10000 = 176;
               break;
            case 8:
               var10000 = 15;
               break;
            case 9:
               var10000 = 223;
               break;
            case 10:
               var10000 = 27;
               break;
            case 11:
               var10000 = 239;
               break;
            case 12:
               var10000 = 66;
               break;
            case 13:
               var10000 = 39;
               break;
            case 14:
               var10000 = 19;
               break;
            case 15:
               var10000 = 170;
               break;
            case 16:
               var10000 = 171;
               break;
            case 17:
               var10000 = 44;
               break;
            case 18:
               var10000 = 218;
               break;
            case 19:
               var10000 = 18;
               break;
            case 20:
               var10000 = 0;
               break;
            case 21:
               var10000 = 98;
               break;
            case 22:
               var10000 = 194;
               break;
            case 23:
               var10000 = 114;
               break;
            case 24:
               var10000 = 78;
               break;
            case 25:
               var10000 = 183;
               break;
            case 26:
               var10000 = 86;
               break;
            case 27:
               var10000 = 180;
               break;
            case 28:
               var10000 = 159;
               break;
            case 29:
               var10000 = 101;
               break;
            case 30:
               var10000 = 142;
               break;
            case 31:
               var10000 = 215;
               break;
            case 32:
               var10000 = 199;
               break;
            case 33:
               var10000 = 85;
               break;
            case 34:
               var10000 = 124;
               break;
            case 35:
               var10000 = 83;
               break;
            case 36:
               var10000 = 153;
               break;
            case 37:
               var10000 = 40;
               break;
            case 38:
               var10000 = 136;
               break;
            case 39:
               var10000 = 236;
               break;
            case 40:
               var10000 = 226;
               break;
            case 41:
               var10000 = 135;
               break;
            case 42:
               var10000 = 177;
               break;
            case 43:
               var10000 = 200;
               break;
            case 44:
               var10000 = 108;
               break;
            case 45:
               var10000 = 182;
               break;
            case 46:
               var10000 = 82;
               break;
            case 47:
               var10000 = 164;
               break;
            case 48:
               var10000 = 160;
               break;
            case 49:
               var10000 = 109;
               break;
            case 50:
               var10000 = 23;
               break;
            case 51:
               var10000 = 133;
               break;
            case 52:
               var10000 = 219;
               break;
            case 53:
               var10000 = 90;
               break;
            case 54:
               var10000 = 119;
               break;
            case 55:
               var10000 = 26;
               break;
            case 56:
               var10000 = 233;
               break;
            case 57:
               var10000 = 139;
               break;
            case 58:
               var10000 = 56;
               break;
            case 59:
               var10000 = 46;
               break;
            case 60:
               var10000 = 94;
               break;
            case 61:
               var10000 = 227;
               break;
            case 62:
               var10000 = 31;
               break;
            case 63:
               var10000 = 143;
               break;
            case 64:
               var10000 = 38;
               break;
            case 65:
               var10000 = 59;
               break;
            case 66:
               var10000 = 93;
               break;
            case 67:
               var10000 = 32;
               break;
            case 68:
               var10000 = 151;
               break;
            case 69:
               var10000 = 35;
               break;
            case 70:
               var10000 = 146;
               break;
            case 71:
               var10000 = 57;
               break;
            case 72:
               var10000 = 209;
               break;
            case 73:
               var10000 = 253;
               break;
            case 74:
               var10000 = 22;
               break;
            case 75:
               var10000 = 3;
               break;
            case 76:
               var10000 = 88;
               break;
            case 77:
               var10000 = 220;
               break;
            case 78:
               var10000 = 228;
               break;
            case 79:
               var10000 = 34;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 211;
               break;
            case 82:
               var10000 = 65;
               break;
            case 83:
               var10000 = 89;
               break;
            case 84:
               var10000 = 16;
               break;
            case 85:
               var10000 = 225;
               break;
            case 86:
               var10000 = 54;
               break;
            case 87:
               var10000 = 116;
               break;
            case 88:
               var10000 = 221;
               break;
            case 89:
               var10000 = 92;
               break;
            case 90:
               var10000 = 30;
               break;
            case 91:
               var10000 = 72;
               break;
            case 92:
               var10000 = 210;
               break;
            case 93:
               var10000 = 25;
               break;
            case 94:
               var10000 = 193;
               break;
            case 95:
               var10000 = 55;
               break;
            case 96:
               var10000 = 132;
               break;
            case 97:
               var10000 = 162;
               break;
            case 98:
               var10000 = 155;
               break;
            case 99:
               var10000 = 5;
               break;
            case 100:
               var10000 = 169;
               break;
            case 101:
               var10000 = 178;
               break;
            case 102:
               var10000 = 10;
               break;
            case 103:
               var10000 = 172;
               break;
            case 104:
               var10000 = 207;
               break;
            case 105:
               var10000 = 84;
               break;
            case 106:
               var10000 = 224;
               break;
            case 107:
               var10000 = 24;
               break;
            case 108:
               var10000 = 186;
               break;
            case 109:
               var10000 = 185;
               break;
            case 110:
               var10000 = 229;
               break;
            case 111:
               var10000 = 237;
               break;
            case 112:
               var10000 = 91;
               break;
            case 113:
               var10000 = 214;
               break;
            case 114:
               var10000 = 126;
               break;
            case 115:
               var10000 = 222;
               break;
            case 116:
               var10000 = 130;
               break;
            case 117:
               var10000 = 231;
               break;
            case 118:
               var10000 = 118;
               break;
            case 119:
               var10000 = 106;
               break;
            case 120:
               var10000 = 166;
               break;
            case 121:
               var10000 = 125;
               break;
            case 122:
               var10000 = 104;
               break;
            case 123:
               var10000 = 9;
               break;
            case 124:
               var10000 = 175;
               break;
            case 125:
               var10000 = 137;
               break;
            case 126:
               var10000 = 216;
               break;
            case 127:
               var10000 = 69;
               break;
            case 128:
               var10000 = 181;
               break;
            case 129:
               var10000 = 206;
               break;
            case 130:
               var10000 = 110;
               break;
            case 131:
               var10000 = 250;
               break;
            case 132:
               var10000 = 77;
               break;
            case 133:
               var10000 = 74;
               break;
            case 134:
               var10000 = 243;
               break;
            case 135:
               var10000 = 244;
               break;
            case 136:
               var10000 = 37;
               break;
            case 137:
               var10000 = 4;
               break;
            case 138:
               var10000 = 95;
               break;
            case 139:
               var10000 = 12;
               break;
            case 140:
               var10000 = 235;
               break;
            case 141:
               var10000 = 148;
               break;
            case 142:
               var10000 = 241;
               break;
            case 143:
               var10000 = 20;
               break;
            case 144:
               var10000 = 197;
               break;
            case 145:
               var10000 = 179;
               break;
            case 146:
               var10000 = 112;
               break;
            case 147:
               var10000 = 62;
               break;
            case 148:
               var10000 = 100;
               break;
            case 149:
               var10000 = 234;
               break;
            case 150:
               var10000 = 208;
               break;
            case 151:
               var10000 = 198;
               break;
            case 152:
               var10000 = 102;
               break;
            case 153:
               var10000 = 103;
               break;
            case 154:
               var10000 = 52;
               break;
            case 155:
               var10000 = 122;
               break;
            case 156:
               var10000 = 120;
               break;
            case 157:
               var10000 = 217;
               break;
            case 158:
               var10000 = 113;
               break;
            case 159:
               var10000 = 157;
               break;
            case 160:
               var10000 = 247;
               break;
            case 161:
               var10000 = 73;
               break;
            case 162:
               var10000 = 50;
               break;
            case 163:
               var10000 = 203;
               break;
            case 164:
               var10000 = 87;
               break;
            case 165:
               var10000 = 232;
               break;
            case 166:
               var10000 = 36;
               break;
            case 167:
               var10000 = 152;
               break;
            case 168:
               var10000 = 6;
               break;
            case 169:
               var10000 = 254;
               break;
            case 170:
               var10000 = 165;
               break;
            case 171:
               var10000 = 189;
               break;
            case 172:
               var10000 = 51;
               break;
            case 173:
               var10000 = 43;
               break;
            case 174:
               var10000 = 147;
               break;
            case 175:
               var10000 = 41;
               break;
            case 176:
               var10000 = 2;
               break;
            case 177:
               var10000 = 96;
               break;
            case 178:
               var10000 = 76;
               break;
            case 179:
               var10000 = 238;
               break;
            case 180:
               var10000 = 167;
               break;
            case 181:
               var10000 = 61;
               break;
            case 182:
               var10000 = 29;
               break;
            case 183:
               var10000 = 188;
               break;
            case 184:
               var10000 = 129;
               break;
            case 185:
               var10000 = 81;
               break;
            case 186:
               var10000 = 68;
               break;
            case 187:
               var10000 = 7;
               break;
            case 188:
               var10000 = 17;
               break;
            case 189:
               var10000 = 58;
               break;
            case 190:
               var10000 = 121;
               break;
            case 191:
               var10000 = 156;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 212;
               break;
            case 194:
               var10000 = 205;
               break;
            case 195:
               var10000 = 11;
               break;
            case 196:
               var10000 = 190;
               break;
            case 197:
               var10000 = 154;
               break;
            case 198:
               var10000 = 202;
               break;
            case 199:
               var10000 = 60;
               break;
            case 200:
               var10000 = 161;
               break;
            case 201:
               var10000 = 213;
               break;
            case 202:
               var10000 = 131;
               break;
            case 203:
               var10000 = 111;
               break;
            case 204:
               var10000 = 248;
               break;
            case 205:
               var10000 = 144;
               break;
            case 206:
               var10000 = 163;
               break;
            case 207:
               var10000 = 107;
               break;
            case 208:
               var10000 = 145;
               break;
            case 209:
               var10000 = 49;
               break;
            case 210:
               var10000 = 246;
               break;
            case 211:
               var10000 = 13;
               break;
            case 212:
               var10000 = 64;
               break;
            case 213:
               var10000 = 97;
               break;
            case 214:
               var10000 = 67;
               break;
            case 215:
               var10000 = 48;
               break;
            case 216:
               var10000 = 1;
               break;
            case 217:
               var10000 = 252;
               break;
            case 218:
               var10000 = 249;
               break;
            case 219:
               var10000 = 45;
               break;
            case 220:
               var10000 = 192;
               break;
            case 221:
               var10000 = 71;
               break;
            case 222:
               var10000 = 187;
               break;
            case 223:
               var10000 = 138;
               break;
            case 224:
               var10000 = 173;
               break;
            case 225:
               var10000 = 99;
               break;
            case 226:
               var10000 = 242;
               break;
            case 227:
               var10000 = 42;
               break;
            case 228:
               var10000 = 117;
               break;
            case 229:
               var10000 = 47;
               break;
            case 230:
               var10000 = 196;
               break;
            case 231:
               var10000 = 184;
               break;
            case 232:
               var10000 = 53;
               break;
            case 233:
               var10000 = 149;
               break;
            case 234:
               var10000 = 168;
               break;
            case 235:
               var10000 = 28;
               break;
            case 236:
               var10000 = 251;
               break;
            case 237:
               var10000 = 33;
               break;
            case 238:
               var10000 = 201;
               break;
            case 239:
               var10000 = 204;
               break;
            case 240:
               var10000 = 158;
               break;
            case 241:
               var10000 = 240;
               break;
            case 242:
               var10000 = 21;
               break;
            case 243:
               var10000 = 70;
               break;
            case 244:
               var10000 = 123;
               break;
            case 245:
               var10000 = 174;
               break;
            case 246:
               var10000 = 115;
               break;
            case 247:
               var10000 = 79;
               break;
            case 248:
               var10000 = 195;
               break;
            case 249:
               var10000 = 245;
               break;
            case 250:
               var10000 = 127;
               break;
            case 251:
               var10000 = 105;
               break;
            case 252:
               var10000 = 8;
               break;
            case 253:
               var10000 = 191;
               break;
            case 254:
               var10000 = 134;
               break;
            default:
               var10000 = 255;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27798;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long var37;
      String[] var13 = new String[24];
      int var11 = 0;
      String var10 = "盋揨挀閾皶譱翝\u0002碃孪\u0011\u0001j\r\u0017\u008e«\u00ad\u0016aïõ¯zR\u0004h\u008e\nÛÂ\u009côU·S¨å¦\u0011´\u008b\u008c@¼û\u009c[QÜÝÝåvó¡\u000f\u0011a{4^é:6!\u0006\u0093u6ðISFY\u0004_Q\tú\u000eI*\u0004\u001f¯ª\u00897÷úf\u001f;C\u0017ÚÊ¼õQ\u0097Û¬ý&/Ó\u0003\u0010#nR®Iï\u009bÝ½\u000eö\u0088óKQ Vc\fÕ\u0019úÔÿ\u0011Ú&¥\u0013\b(ü\t\u0086ß\u0007F¦O@Ó^\u000e~\u0085âês\u0014\u0012à\u0084\u0000\b@ö¨\no´\u0013AÞn}Y\u0095}\u0005侭攞彷挶锐\u000bóø\u0099³õ_G²g\b|\u0004揲镯Vº\u0005敪帹弚捩閽\u0002叧浄\u0004撕俇æ\u0093\u000f\r\u001d·\u0091\u009c>pHÒ]\u0097ÏÚ§X\u001eÙ\u0098\u0016Ií`ÁnþÑG{\u000fþ©\f\u0018¢\u0000b\u0082\u0085¸\u0001K'ûÿöµ\n°[ñÇøÑædS?";
      int var12 = "盋揨挀閾皶譱翝\u0002碃孪\u0011\u0001j\r\u0017\u008e«\u00ad\u0016aïõ¯zR\u0004h\u008e\nÛÂ\u009côU·S¨å¦\u0011´\u008b\u008c@¼û\u009c[QÜÝÝåvó¡\u000f\u0011a{4^é:6!\u0006\u0093u6ðISFY\u0004_Q\tú\u000eI*\u0004\u001f¯ª\u00897÷úf\u001f;C\u0017ÚÊ¼õQ\u0097Û¬ý&/Ó\u0003\u0010#nR®Iï\u009bÝ½\u000eö\u0088óKQ Vc\fÕ\u0019úÔÿ\u0011Ú&¥\u0013\b(ü\t\u0086ß\u0007F¦O@Ó^\u000e~\u0085âês\u0014\u0012à\u0084\u0000\b@ö¨\no´\u0013AÞn}Y\u0095}\u0005侭攞彷挶锐\u000bóø\u0099³õ_G²g\b|\u0004揲镯Vº\u0005敪帹弚捩閽\u0002叧浄\u0004撕俇æ\u0093\u000f\r\u001d·\u0091\u009c>pHÒ]\u0097ÏÚ§X\u001eÙ\u0098\u0016Ií`ÁnþÑG{\u000fþ©\f\u0018¢\u0000b\u0082\u0085¸\u0001K'ûÿöµ\n°[ñÇøÑædS?"
         .length();
      char var9 = 7;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 44;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 108;
                        break;
                     case 1:
                        var65 = 42;
                        break;
                     case 2:
                        var65 = 62;
                        break;
                     case 3:
                        var65 = 112;
                        break;
                     case 4:
                        var65 = 40;
                        break;
                     case 5:
                        var65 = 84;
                        break;
                     default:
                        var65 = 10;
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
                     b = var13;
                     c = new String[24];
                     long var0 = 3922255842208162629L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "fñÐ\b¨Ð\u009c.\u0096Æ\u0007ÀpBJ\u001d";
                     int var5 = "fñÐ\b¨Ð\u009c.\u0096Æ\u0007ÀpBJ\u001d".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56
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
                                    e = var6;
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Q~ÚÈ}ë\u001eåÕ£\u008d{W\u0091Þ¥";
                                 var5 = "Q~ÚÈ}ë\u001eåÕ£\u008d{W\u0091Þ¥".length();
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

                  var10 = "m\u0098ôx\u0005)®\u0084_\u0006";
                  var12 = "m\u0098ôx\u0005)®\u0084_\u0006".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 16;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





