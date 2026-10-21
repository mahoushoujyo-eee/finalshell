package com.finalshell.ui.panel;

import com.finalshell.core.KD;
import com.finalshell.core.Qe2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Df4;
import com.finalshell.ui.listener.UJ;
import com.finalshell.ui.listener.V2;
import com.finalshell.ui.listener.Yv4;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import net.miginfocom.swing.MigLayout;

public class AcceleratePanel extends JPanel {
   SelectDownloadFolderPanel T;
   Ky4 t;
   JComponent m;
   Qe2_2 V;
   Qe2_2 n;
   KD y;
   KD p;
   KD D;
   AccelerateRdpHelpPanel C;
   int l;
   Color u;
   public static int I;
   public static int i;
   int k;
   Ky4 G;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public AcceleratePanel() {
      Registry.lookupField(545053246129936011L).setInt(this, a(26819, 4512602748799718509L));
      Color var10001 = new Color(
         Registry.lookupField(545053246129936011L).getInt(this),
         Registry.lookupField(545053246129936011L).getInt(this),
         Registry.lookupField(545053246129936011L).getInt(this)
      );
      long var11 = 120327766488773442L;
      Color var10 = var10001;
      Ref.s(120327766488773442L, var10, var11);
      Registry.lookupField(144708592452319805L).setInt(this, Registry.lookupField(168555354480801721L).getInt(null));
      this.setLayout(new MigLayout(a(-29103, 2960), "", a(-29094, -15545)));
      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10003 = Registry.emptyArgs();
      long var15 = 634817973682994708L;
      Object[] var14 = var10003;
      Ref.h(634817973682994708L, var14, var15);
      Object[] var10004 = Registry.emptyArgs();
      long var17 = 240567170779145617L;
      Object[] var16 = var10004;
      Ref.h(240567170779145617L, var16, var17);
      Object[] var10005 = Registry.emptyArgs();
      long var19 = 226341449505323490L;
      Object[] var18 = var10005;
      var10005 = Ref.h(226341449505323490L, var18, var19);

      try {
         var10005 = (com.finalshell.ui.frame.U)var10005;
      } catch (InvocationTargetException var103) {
         throw var103.getTargetException();
      }

      com.finalshell.ui.frame.U var2 = var10005;
      AccelerateRdpHelpPanel var10006 = new AccelerateRdpHelpPanel();
      long var21 = 222226325555356894L;
      AccelerateRdpHelpPanel var20 = var10006;
      Ref.s(222226325555356894L, var20, var21);
      Ky4 var10007 = new Ky4();
      long var23 = 543057538257207972L;
      Ky4 var22 = var10007;
      Ref.s(543057538257207972L, var22, var23);
      Object var24 = 543057538257207972L;
      ((Ky4)Ref.g(543057538257207972L, var24)).setOpaque(false);
      Object var26 = 543057538257207972L;
      ((Ky4)Ref.g(543057538257207972L, var26)).setLayout(new MigLayout(a(-29091, 23303), a(-29100, -28995), a(-29089, -20344)));
      boolean var10009 = false;
      Object var28 = 120327766488773442L;
      CompoundBorder var3 = BorderFactory.createCompoundBorder(
         BorderFactory.createMatteBorder(0, 2, 0, (int)this, (Color)Ref.g(120327766488773442L, var28)), BorderFactory.createEmptyBorder(0, 0, 0, 0)
      );
      Object var30 = 543057538257207972L;
      ((Ky4)Ref.g(543057538257207972L, var30)).setBorder(var3);
      Object var32 = 543057538257207972L;
      this.add((Ky4)Ref.g(543057538257207972L, var32), a(-29093, 23393));
      Ky4 var10013 = new Ky4();
      long var35 = 503182329446332632L;
      Ky4 var34 = var10013;
      Ref.s(503182329446332632L, var34, var35);
      Object var36 = 503182329446332632L;
      ((Ky4)Ref.g(503182329446332632L, var36)).setOpaque(false);
      Object var38 = 503182329446332632L;
      ((Ky4)Ref.g(503182329446332632L, var38)).setLayout(new MigLayout(a(-29095, 2937), a(-29090, 27184), a(-29098, -16598)));
      Object var40 = 503182329446332632L;
      ((Ky4)Ref.g(503182329446332632L, var40)).setBorder(var3);
      Object var42 = 503182329446332632L;
      ((Ky4)Ref.g(503182329446332632L, var42)).I(a(28081, 6451237067082731797L), a(19557, 5983448586412470464L));
      Image var4 = (Image)Registry.lookupField(582605604039442414L).get(null);
      SelectDownloadFolderPanel.O$arrint();
      Object[] var10020 = Registry.packArgs(a(-29109, -32204));
      long var45 = 553788149343995401L;
      Object[] var44 = var10020;
      var10020 = Ref.h(553788149343995401L, var44, var45);
      long var47 = 259967528067878784L;
      Object var46 = var10020;
      Ref.s(259967528067878784L, var46, var47);
      Object var48 = 503182329446332632L;
      Ky4 var10021 = (Ky4)Ref.g(503182329446332632L, var48);
      Object var50 = 259967528067878784L;
      this.add((KD)Ref.g(259967528067878784L, var50), a(-29097, -6666));
      JFrame var5 = new JFrame();
      Ky4 var1 = var10021;
      var5.setIconImage(var4);
      var5.setTitle(a(-29092, -24416));
      Object var52 = 222226325555356894L;
      this.setContentPane((AccelerateRdpHelpPanel)Ref.g(222226325555356894L, var52));
      Object var54 = 259967528067878784L;
      ((KD)Ref.g(259967528067878784L, var54)).addActionListener(new UJ(this, var5, var2));
      JPanel var6 = new JPanel();
      var6.setOpaque(false);
      var6.setBorder(null);
      var6.setLayout(new MigLayout(a(-29102, 26305), a(-29112, -12236), a(-29111, -12810)));
      Object var56 = 503182329446332632L;
      ((Ky4)Ref.g(503182329446332632L, var56)).add(var6, a(-29110, 1882));
      Object var58 = 250396764166819821L;
      this.add((KD)Ref.g(250396764166819821L, var58));
      Object[] var10027 = Registry.packArgs(a(-29096, 25705));
      long var61 = 363596579551925348L;
      Object[] var60 = var10027;
      var10027 = Ref.h(363596579551925348L, var60, var61);
      long var63 = 442601371933228411L;
      Object var62 = var10027;
      Ref.s(442601371933228411L, var62, var63);
      Object[] var10029 = Registry.packArgs(a(-29099, 11003));
      long var65 = 363596579551925348L;
      Object[] var64 = var10029;
      var10029 = Ref.h(363596579551925348L, var64, var65);
      long var67 = 266390688568107078L;
      Object var66 = var10029;
      Ref.s(266390688568107078L, var66, var67);
      ButtonGroup var7 = new ButtonGroup();
      Object var68 = 442601371933228411L;
      this.add((Qe2_2)Ref.g(442601371933228411L, var68));
      Object var70 = 266390688568107078L;
      this.add((Qe2_2)Ref.g(266390688568107078L, var70));
      Object var72 = 543057538257207972L;
      Ky4 var10032 = (Ky4)Ref.g(543057538257207972L, var72);
      Object var74 = 442601371933228411L;
      this.add((Qe2_2)Ref.g(442601371933228411L, var74));
      Object var76 = 543057538257207972L;
      Ky4 var10034 = (Ky4)Ref.g(543057538257207972L, var76);
      Object var78 = 266390688568107078L;
      this.add((Qe2_2)Ref.g(266390688568107078L, var78));
      Object var80 = 442601371933228411L;
      ((Qe2_2)Ref.g(442601371933228411L, var80)).setSelected(true);
      Df4 var8 = new Df4(this);
      Object var82 = 442601371933228411L;
      ((Qe2_2)Ref.g(442601371933228411L, var82)).addActionListener(var8);
      Object var84 = 266390688568107078L;
      ((Qe2_2)Ref.g(266390688568107078L, var84)).addActionListener(var8);
      Object var86 = 250396764166819821L;
      ((KD)Ref.g(250396764166819821L, var86)).addActionListener(var8);
      Object var88 = 624825723918235119L;
      ((KD)Ref.g(624825723918235119L, var88)).addActionListener(var8);
      Ky4 var10041 = new Ky4();
      long var91 = 562372469151204576L;
      Ky4 var90 = var10041;
      Ref.s(562372469151204576L, var90, var91);
      Object var92 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var92)).setOpaque(false);
      Object var94 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var94)).setLayout(new MigLayout(a(-29101, -14509), "", ""));
      CompoundBorder var9 = BorderFactory.createCompoundBorder(
         BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(a(12839, 5803067322349670022L), a(12839, 5803067322349670022L), a(12839, 5803067322349670022L))),
         BorderFactory.createEmptyBorder(0, 0, 0, 0)
      );
      Object var96 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var96)).setBorder(var9);
      Object var98 = 562372469151204576L;
      this.add((JComponent)Ref.g(562372469151204576L, var98), a(-29104, -32519));
      Object[] var10046 = Registry.emptyArgs();
      long var101 = 307011559159458648L;
      Object[] var100 = var10046;
      Ref.h(307011559159458648L, var100, var101);

      try {
         ;
      } catch (InvocationTargetException var102) {
         throw var102.getTargetException();
      }

      if (Registry.lookupField(144708592452319805L).getInt(this) == Registry.lookupField(168555354480801721L).getInt(null)) {
      }

      if (var1 != null) {
         Ky4.K(new String[2]);
      }
   }

   public void I() {
      Object var1 = 442601371933228411L;
      ((Qe2_2)Ref.g(442601371933228411L, var1)).setSelected(true);
      Object var3 = 234520774724776074L;
      Object[] var10003 = Registry.packArgs(Ref.g(234520774724776074L, var3));
      long var6 = 602040225738704982L;
      Object[] var5 = var10003;
      Ref.h(602040225738704982L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void B() {
      Object var1 = 266390688568107078L;
      ((Qe2_2)Ref.g(266390688568107078L, var1)).setSelected(true);
      Object var3 = 503182329446332632L;
      Object[] var10003 = Registry.packArgs(Ref.g(503182329446332632L, var3));
      long var6 = 602040225738704982L;
      Object[] var5 = var10003;
      Ref.h(602040225738704982L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void E(int var1) {
   }

   KD H(String var1) {
      KD var2 = new KD(var1);
      var2.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var2.setForeground(new Color(a(2659, 8300784763847177921L), a(17644, 3366682729625696330L), a(17644, 3366682729625696330L)));
      var2.t(new Color(a(27672, 4960157896286834879L), a(23390, 6909002466986338291L), a(23390, 6909002466986338291L)));
      var2.s(2);
      Object[] var10001 = Registry.packArgs(3, 5);
      long var3 = 188631797336214587L;
      Object var10002 = Ref.h2(188631797336214587L, var3);

      try {
         var10002 = (Border)var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001.setBorder((Border)var10002);
      var2.H(new Color(a(5139, 7707437394558740659L), a(8378, 1716917834194967574L), a(8378, 1716917834194967574L)));
      var2.addActionListener(new V2(this));
      return var2;
   }

   Qe2_2 A(String var1) {
      Qe2_2 var2 = new Qe2_2(var1);
      var2.r((Color)Registry.lookupField(503018106388102479L).get(null));
      var2.setForeground(new Color(a(17644, 3366682729625696330L), a(17644, 3366682729625696330L), a(17644, 3366682729625696330L)));
      var2.R(new Color(a(8378, 1716917834194967574L), a(8378, 1716917834194967574L), a(8378, 1716917834194967574L)));
      var2.k(0);
      var2.t(0);
      var2.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var2.W(false);
      Object var3 = 120327766488773442L;
      this.j((Color)Ref.g(120327766488773442L, var3));
      var2.addActionListener(new Yv4(this));
      return var2;
   }

   void L(JComponent var1) {
      Object var2 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var2)).removeAll();
      Object var4 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var4)).add(var1);
      Object var6 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var6)).revalidate();
      Object var8 = 562372469151204576L;
      ((JComponent)Ref.g(562372469151204576L, var8)).repaint();
   }

   public int r() {
      return Registry.lookupField(144708592452319805L).getInt(this);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -29094) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 125;
               break;
            case 1:
               var10000 = 15;
               break;
            case 2:
               var10000 = 136;
               break;
            case 3:
               var10000 = 187;
               break;
            case 4:
               var10000 = 45;
               break;
            case 5:
               var10000 = 198;
               break;
            case 6:
               var10000 = 180;
               break;
            case 7:
               var10000 = 230;
               break;
            case 8:
               var10000 = 155;
               break;
            case 9:
               var10000 = 201;
               break;
            case 10:
               var10000 = 52;
               break;
            case 11:
               var10000 = 153;
               break;
            case 12:
               var10000 = 205;
               break;
            case 13:
               var10000 = 165;
               break;
            case 14:
               var10000 = 39;
               break;
            case 15:
               var10000 = 185;
               break;
            case 16:
               var10000 = 248;
               break;
            case 17:
               var10000 = 24;
               break;
            case 18:
               var10000 = 41;
               break;
            case 19:
               var10000 = 115;
               break;
            case 20:
               var10000 = 237;
               break;
            case 21:
               var10000 = 140;
               break;
            case 22:
               var10000 = 104;
               break;
            case 23:
               var10000 = 37;
               break;
            case 24:
               var10000 = 214;
               break;
            case 25:
               var10000 = 234;
               break;
            case 26:
               var10000 = 130;
               break;
            case 27:
               var10000 = 175;
               break;
            case 28:
               var10000 = 102;
               break;
            case 29:
               var10000 = 47;
               break;
            case 30:
               var10000 = 177;
               break;
            case 31:
               var10000 = 33;
               break;
            case 32:
               var10000 = 245;
               break;
            case 33:
               var10000 = 95;
               break;
            case 34:
               var10000 = 206;
               break;
            case 35:
               var10000 = 3;
               break;
            case 36:
               var10000 = 25;
               break;
            case 37:
               var10000 = 10;
               break;
            case 38:
               var10000 = 142;
               break;
            case 39:
               var10000 = 222;
               break;
            case 40:
               var10000 = 209;
               break;
            case 41:
               var10000 = 75;
               break;
            case 42:
               var10000 = 106;
               break;
            case 43:
               var10000 = 5;
               break;
            case 44:
               var10000 = 116;
               break;
            case 45:
               var10000 = 121;
               break;
            case 46:
               var10000 = 163;
               break;
            case 47:
               var10000 = 150;
               break;
            case 48:
               var10000 = 32;
               break;
            case 49:
               var10000 = 251;
               break;
            case 50:
               var10000 = 182;
               break;
            case 51:
               var10000 = 135;
               break;
            case 52:
               var10000 = 148;
               break;
            case 53:
               var10000 = 103;
               break;
            case 54:
               var10000 = 174;
               break;
            case 55:
               var10000 = 244;
               break;
            case 56:
               var10000 = 252;
               break;
            case 57:
               var10000 = 178;
               break;
            case 58:
               var10000 = 221;
               break;
            case 59:
               var10000 = 27;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 57;
               break;
            case 62:
               var10000 = 217;
               break;
            case 63:
               var10000 = 2;
               break;
            case 64:
               var10000 = 19;
               break;
            case 65:
               var10000 = 179;
               break;
            case 66:
               var10000 = 82;
               break;
            case 67:
               var10000 = 156;
               break;
            case 68:
               var10000 = 84;
               break;
            case 69:
               var10000 = 56;
               break;
            case 70:
               var10000 = 197;
               break;
            case 71:
               var10000 = 157;
               break;
            case 72:
               var10000 = 181;
               break;
            case 73:
               var10000 = 73;
               break;
            case 74:
               var10000 = 183;
               break;
            case 75:
               var10000 = 0;
               break;
            case 76:
               var10000 = 171;
               break;
            case 77:
               var10000 = 13;
               break;
            case 78:
               var10000 = 48;
               break;
            case 79:
               var10000 = 22;
               break;
            case 80:
               var10000 = 35;
               break;
            case 81:
               var10000 = 144;
               break;
            case 82:
               var10000 = 131;
               break;
            case 83:
               var10000 = 120;
               break;
            case 84:
               var10000 = 65;
               break;
            case 85:
               var10000 = 224;
               break;
            case 86:
               var10000 = 71;
               break;
            case 87:
               var10000 = 76;
               break;
            case 88:
               var10000 = 208;
               break;
            case 89:
               var10000 = 108;
               break;
            case 90:
               var10000 = 169;
               break;
            case 91:
               var10000 = 184;
               break;
            case 92:
               var10000 = 85;
               break;
            case 93:
               var10000 = 34;
               break;
            case 94:
               var10000 = 128;
               break;
            case 95:
               var10000 = 231;
               break;
            case 96:
               var10000 = 129;
               break;
            case 97:
               var10000 = 172;
               break;
            case 98:
               var10000 = 235;
               break;
            case 99:
               var10000 = 162;
               break;
            case 100:
               var10000 = 146;
               break;
            case 101:
               var10000 = 97;
               break;
            case 102:
               var10000 = 107;
               break;
            case 103:
               var10000 = 98;
               break;
            case 104:
               var10000 = 101;
               break;
            case 105:
               var10000 = 50;
               break;
            case 106:
               var10000 = 243;
               break;
            case 107:
               var10000 = 196;
               break;
            case 108:
               var10000 = 11;
               break;
            case 109:
               var10000 = 18;
               break;
            case 110:
               var10000 = 55;
               break;
            case 111:
               var10000 = 67;
               break;
            case 112:
               var10000 = 233;
               break;
            case 113:
               var10000 = 40;
               break;
            case 114:
               var10000 = 100;
               break;
            case 115:
               var10000 = 14;
               break;
            case 116:
               var10000 = 89;
               break;
            case 117:
               var10000 = 239;
               break;
            case 118:
               var10000 = 154;
               break;
            case 119:
               var10000 = 9;
               break;
            case 120:
               var10000 = 74;
               break;
            case 121:
               var10000 = 193;
               break;
            case 122:
               var10000 = 226;
               break;
            case 123:
               var10000 = 64;
               break;
            case 124:
               var10000 = 190;
               break;
            case 125:
               var10000 = 241;
               break;
            case 126:
               var10000 = 158;
               break;
            case 127:
               var10000 = 58;
               break;
            case 128:
               var10000 = 212;
               break;
            case 129:
               var10000 = 80;
               break;
            case 130:
               var10000 = 78;
               break;
            case 131:
               var10000 = 21;
               break;
            case 132:
               var10000 = 124;
               break;
            case 133:
               var10000 = 53;
               break;
            case 134:
               var10000 = 119;
               break;
            case 135:
               var10000 = 229;
               break;
            case 136:
               var10000 = 137;
               break;
            case 137:
               var10000 = 199;
               break;
            case 138:
               var10000 = 29;
               break;
            case 139:
               var10000 = 170;
               break;
            case 140:
               var10000 = 215;
               break;
            case 141:
               var10000 = 255;
               break;
            case 142:
               var10000 = 36;
               break;
            case 143:
               var10000 = 81;
               break;
            case 144:
               var10000 = 118;
               break;
            case 145:
               var10000 = 28;
               break;
            case 146:
               var10000 = 77;
               break;
            case 147:
               var10000 = 228;
               break;
            case 148:
               var10000 = 4;
               break;
            case 149:
               var10000 = 238;
               break;
            case 150:
               var10000 = 26;
               break;
            case 151:
               var10000 = 23;
               break;
            case 152:
               var10000 = 194;
               break;
            case 153:
               var10000 = 202;
               break;
            case 154:
               var10000 = 51;
               break;
            case 155:
               var10000 = 88;
               break;
            case 156:
               var10000 = 132;
               break;
            case 157:
               var10000 = 134;
               break;
            case 158:
               var10000 = 43;
               break;
            case 159:
               var10000 = 242;
               break;
            case 160:
               var10000 = 72;
               break;
            case 161:
               var10000 = 176;
               break;
            case 162:
               var10000 = 38;
               break;
            case 163:
               var10000 = 192;
               break;
            case 164:
               var10000 = 49;
               break;
            case 165:
               var10000 = 8;
               break;
            case 166:
               var10000 = 188;
               break;
            case 167:
               var10000 = 86;
               break;
            case 168:
               var10000 = 167;
               break;
            case 169:
               var10000 = 160;
               break;
            case 170:
               var10000 = 99;
               break;
            case 171:
               var10000 = 143;
               break;
            case 172:
               var10000 = 12;
               break;
            case 173:
               var10000 = 220;
               break;
            case 174:
               var10000 = 113;
               break;
            case 175:
               var10000 = 123;
               break;
            case 176:
               var10000 = 91;
               break;
            case 177:
               var10000 = 30;
               break;
            case 178:
               var10000 = 60;
               break;
            case 179:
               var10000 = 200;
               break;
            case 180:
               var10000 = 93;
               break;
            case 181:
               var10000 = 152;
               break;
            case 182:
               var10000 = 249;
               break;
            case 183:
               var10000 = 54;
               break;
            case 184:
               var10000 = 240;
               break;
            case 185:
               var10000 = 59;
               break;
            case 186:
               var10000 = 62;
               break;
            case 187:
               var10000 = 7;
               break;
            case 188:
               var10000 = 111;
               break;
            case 189:
               var10000 = 139;
               break;
            case 190:
               var10000 = 66;
               break;
            case 191:
               var10000 = 69;
               break;
            case 192:
               var10000 = 189;
               break;
            case 193:
               var10000 = 141;
               break;
            case 194:
               var10000 = 227;
               break;
            case 195:
               var10000 = 210;
               break;
            case 196:
               var10000 = 151;
               break;
            case 197:
               var10000 = 117;
               break;
            case 198:
               var10000 = 191;
               break;
            case 199:
               var10000 = 253;
               break;
            case 200:
               var10000 = 195;
               break;
            case 201:
               var10000 = 149;
               break;
            case 202:
               var10000 = 247;
               break;
            case 203:
               var10000 = 166;
               break;
            case 204:
               var10000 = 6;
               break;
            case 205:
               var10000 = 126;
               break;
            case 206:
               var10000 = 61;
               break;
            case 207:
               var10000 = 110;
               break;
            case 208:
               var10000 = 96;
               break;
            case 209:
               var10000 = 254;
               break;
            case 210:
               var10000 = 16;
               break;
            case 211:
               var10000 = 204;
               break;
            case 212:
               var10000 = 105;
               break;
            case 213:
               var10000 = 20;
               break;
            case 214:
               var10000 = 79;
               break;
            case 215:
               var10000 = 68;
               break;
            case 216:
               var10000 = 211;
               break;
            case 217:
               var10000 = 17;
               break;
            case 218:
               var10000 = 70;
               break;
            case 219:
               var10000 = 147;
               break;
            case 220:
               var10000 = 31;
               break;
            case 221:
               var10000 = 203;
               break;
            case 222:
               var10000 = 216;
               break;
            case 223:
               var10000 = 236;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 250;
               break;
            case 226:
               var10000 = 223;
               break;
            case 227:
               var10000 = 1;
               break;
            case 228:
               var10000 = 92;
               break;
            case 229:
               var10000 = 87;
               break;
            case 230:
               var10000 = 127;
               break;
            case 231:
               var10000 = 46;
               break;
            case 232:
               var10000 = 161;
               break;
            case 233:
               var10000 = 83;
               break;
            case 234:
               var10000 = 112;
               break;
            case 235:
               var10000 = 225;
               break;
            case 236:
               var10000 = 44;
               break;
            case 237:
               var10000 = 219;
               break;
            case 238:
               var10000 = 213;
               break;
            case 239:
               var10000 = 94;
               break;
            case 240:
               var10000 = 133;
               break;
            case 241:
               var10000 = 90;
               break;
            case 242:
               var10000 = 122;
               break;
            case 243:
               var10000 = 109;
               break;
            case 244:
               var10000 = 173;
               break;
            case 245:
               var10000 = 246;
               break;
            case 246:
               var10000 = 145;
               break;
            case 247:
               var10000 = 232;
               break;
            case 248:
               var10000 = 159;
               break;
            case 249:
               var10000 = 63;
               break;
            case 250:
               var10000 = 42;
               break;
            case 251:
               var10000 = 114;
               break;
            case 252:
               var10000 = 207;
               break;
            case 253:
               var10000 = 168;
               break;
            case 254:
               var10000 = 164;
               break;
            default:
               var10000 = 138;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31908;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[20];
      int var11 = 0;
      String var10 = "I\u0083\u001bÈ\u008f\u0011@\u0014Æ§þB\u0001zÃ[kÁ\u001b³\u009f \u008c\u0002侃轻\r[®o\u0006\"E\f\u008bIFZjA\u000f\u009b\u0093@ÊÅ5\u0094ê<ÃùÞþ1ø\bºÄd Ah\u0004A\u0005腰孀仃剴邡\r\u0098«\u0017¦-Qî\tw\u0016¿`\u009d\r²\u0010RÑ\u0085¿ûÔ×\u00adé\u0017W\rZ\u0089Oâ&Ù\u008f\u0018Y48$m\fæÃ\u0012]d\u001dR\u0091©&&n\rz¶K\u0005¦%\u009c\u0087XÇ\u0018Zi\b$ß·C;\u0004KÌ\u0004ÜöP\u0087\u000fB5{\u001e¢¯x¹¡©J\u0093\u0088\u00986\u0003崙冚篸\u0004Þ6\u0010\u009f\u0005脵害乫刊邴";
      int var12 = "I\u0083\u001bÈ\u008f\u0011@\u0014Æ§þB\u0001zÃ[kÁ\u001b³\u009f \u008c\u0002侃轻\r[®o\u0006\"E\f\u008bIFZjA\u000f\u009b\u0093@ÊÅ5\u0094ê<ÃùÞþ1ø\bºÄd Ah\u0004A\u0005腰孀仃剴邡\r\u0098«\u0017¦-Qî\tw\u0016¿`\u009d\r²\u0010RÑ\u0085¿ûÔ×\u00adé\u0017W\rZ\u0089Oâ&Ù\u008f\u0018Y48$m\fæÃ\u0012]d\u001dR\u0091©&&n\rz¶K\u0005¦%\u009c\u0087XÇ\u0018Zi\b$ß·C;\u0004KÌ\u0004ÜöP\u0087\u000fB5{\u001e¢¯x¹¡©J\u0093\u0088\u00986\u0003崙冚篸\u0004Þ6\u0010\u009f\u0005脵害乫刊邴"
         .length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 99;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 8;
                        break;
                     case 1:
                        var65 = 72;
                        break;
                     case 2:
                        var65 = 61;
                        break;
                     case 3:
                        var65 = 19;
                        break;
                     case 4:
                        var65 = 14;
                        break;
                     case 5:
                        var65 = 1;
                        break;
                     default:
                        var65 = 79;
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
                     b = new String[20];
                     long var0 = 5742449288947359208L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "9\bW!©*O\u0015µ\u0086\u0094Ù¼\u008bnÀÿe\f9ò®åÆìD4f\u0086`M\u0011·\u0014\u0006\u0019gZµ¡ST\u001b\u001bÌ2\u0093¼mR-\u0080~s+M\u008aËì-ó\u0082\u0003Õ\u009dk6\u0094wß\u0081\u0004";
                     int var5 = "9\bW!©*O\u0015µ\u0086\u0094Ù¼\u008bnÀÿe\f9ò®åÆìD4f\u0086`M\u0011·\u0014\u0006\u0019gZµ¡ST\u001b\u001bÌ2\u0093¼mR-\u0080~s+M\u008aËì-ó\u0082\u0003Õ\u009dk6\u0094wß\u0081\u0004"
                        .length();
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
                                    d = new Integer[11];
                                    Registry.lookupField(168555354480801721L).setInt(null, a(17644, 3366682729625696330L));
                                    Registry.lookupField(553670676087696590L).setInt(null, a(8790, 1411929597249117941L));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\\$ÝÌ}bz]\u0019¹â¬\u0096ÎIW";
                                 var5 = "\\$ÝÌ}bz]\u0019¹â¬\u0096ÎIW".length();
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

                  var10 = "SÜÖj5®Ã»Y w=fod§\u00058'Ð¸3";
                  var12 = "SÜÖj5®Ã»Y w=fod§\u00058'Ð¸3".length();
                  var9 = 16;
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





