package com.finalshell.ui.frame;

import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.LP;
import com.finalshell.ui.listener.Ll2;
import com.finalshell.ui.listener.YH;
import com.finalshell.ui.listener.Yk4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.AutoSelectTab;
import com.finalshell.ui.panel.EffectPreview;
import com.finalshell.ui.panel.EnableBackgroundImage;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.SwitchTabCommand;
import com.finalshell.ui.panel.TerminalHint;
import com.finalshell.ui.panel.Z8;
import com.finalshell.ui.panel.Zm2;
import com.finalshell.ui.panel.Zn2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import net.miginfocom.swing.MigLayout;

public class Ox4 extends JFrame {
   public JPanel b;
   public JPanel E;
   public Z8 K;
   public ArrayList V;
   public Vg2 h;
   public Ox4 o;
   public AA B;
   public static boolean C;
   public DefaultMutableTreeNode M;
   public DefaultMutableTreeNode J;
   public Zm2 Q;
   public AutoSelectTab D;
   public TerminalHint X;
   public EnableBackgroundImage z;
   public SwitchTabCommand s;
   public EffectPreview R;
   public Zn2 P;
   public DefaultMutableTreeNode m;
   public static String W;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public Ox4(JFrame var1) {
      ArrayList var10001 = new ArrayList();
      long var15 = 600217306549421865L;
      ArrayList var14 = var10001;
      Ref.s(600217306549421865L, var14, var15);
      long var17 = 580514381871929960L;
      Object var16 = null;
      Ref.s(580514381871929960L, var16, var17);
      long var19 = 577313982458780365L;
      Object var18 = null;
      Ref.s(577313982458780365L, var18, var19);
      long var21 = 448185761952082693L;
      Object var20 = null;
      Ref.s(448185761952082693L, var20, var21);
      this.setTitle(a(-1698, 10837));
      D();
      long var23 = 124747692258223201L;
      Ref.s(124747692258223201L, this, var23);
      this.setLocationRelativeTo(null);
      this.setLayout(new MigLayout(a(-1708, -30730), a(-1712, 7230), a(-1700, 18100)));
      JPanel var10006 = new JPanel();
      long var25 = 416028824075080592L;
      JPanel var24 = var10006;
      Ref.s(416028824075080592L, var24, var25);
      Object var26 = 416028824075080592L;
      ((JPanel)Ref.g(416028824075080592L, var26)).setLayout(new MigLayout(a(-1705, -2706), a(-1703, -11964), a(-1727, 15601)));
      Object var28 = 416028824075080592L;
      this.add((JPanel)Ref.g(416028824075080592L, var28), a(-1726, -19876));
      JScrollPane var3 = new JScrollPane();
      var3.getVerticalScrollBar().setUnitIncrement(a(32730, 475074780669424574L));
      Object var30 = 416028824075080592L;
      ((JPanel)Ref.g(416028824075080592L, var30)).add(var3, a(-1709, 13349));
      Z8 var10010 = new Z8();
      long var33 = 271121671883085064L;
      Z8 var32 = var10010;
      Ref.s(271121671883085064L, var32, var33);
      AutoSelectTab var10011 = new AutoSelectTab();
      long var35 = 135919189921598557L;
      AutoSelectTab var34 = var10011;
      Ref.s(135919189921598557L, var34, var35);
      Object var36 = 600217306549421865L;
      ArrayList var10012 = (ArrayList)Ref.g(600217306549421865L, var36);
      Object var38 = 135919189921598557L;
      this.add((AutoSelectTab)Ref.g(135919189921598557L, var38));
      Object var40 = 271121671883085064L;
      Ref.g(271121671883085064L, var40);
      Object var42 = 135919189921598557L;
      Object[] var10016 = Registry.packArgs(Ref.g(135919189921598557L, var42));
      long var45 = 551450432066951191L;
      Object[] var44 = var10016;
      Ref.h(551450432066951191L, var44, var45);

      try {
         ;
      } catch (InvocationTargetException var176) {
         throw var176.getTargetException();
      }

      TerminalHint var10017 = new TerminalHint();
      long var47 = 283479699941796699L;
      TerminalHint var46 = var10017;
      Ref.s(283479699941796699L, var46, var47);
      Object var48 = 600217306549421865L;
      ArrayList var10018 = (ArrayList)Ref.g(600217306549421865L, var48);
      Object var50 = 283479699941796699L;
      this.add((TerminalHint)Ref.g(283479699941796699L, var50));
      Object var52 = 271121671883085064L;
      Ref.g(271121671883085064L, var52);
      Object var54 = 283479699941796699L;
      Object[] var10022 = Registry.packArgs(Ref.g(283479699941796699L, var54));
      long var57 = 551450432066951191L;
      Object[] var56 = var10022;
      Ref.h(551450432066951191L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var175) {
         throw var175.getTargetException();
      }

      AA var10023 = new AA();
      long var59 = 577313982458780365L;
      AA var58 = var10023;
      Ref.s(577313982458780365L, var58, var59);
      Object var60 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var60)).setRootVisible(false);
      Object var62 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var62)).setFocusable(false);
      Object var64 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var64)).getSelectionModel().setSelectionMode(1);
      Object var66 = 577313982458780365L;
      this.setViewportView((AA)Ref.g(577313982458780365L, var66));
      Object var68 = 577313982458780365L;
      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)((AA)Ref.g(577313982458780365L, var68)).getModel().getRoot();
      var4.setUserObject(a(-1728, 5985));
      DefaultTreeModel var5 = new DefaultTreeModel(var4);
      var4.removeAllChildren();
      DefaultMutableTreeNode var6 = new DefaultMutableTreeNode(a(-1697, 31992));
      var4.add(var6);
      DefaultMutableTreeNode var7 = new DefaultMutableTreeNode(a(-1725, -768));
      var4.add(var7);
      Zm2 var10029 = new Zm2();
      long var71 = 219413512886902160L;
      Zm2 var70 = var10029;
      Ref.s(219413512886902160L, var70, var71);
      Object var72 = 600217306549421865L;
      ArrayList var10030 = (ArrayList)Ref.g(600217306549421865L, var72);
      Object var74 = 219413512886902160L;
      this.add((Zm2)Ref.g(219413512886902160L, var74));
      Object var76 = 271121671883085064L;
      Ref.g(271121671883085064L, var76);
      Object var78 = 219413512886902160L;
      Object[] var10034 = Registry.packArgs(Ref.g(219413512886902160L, var78));
      long var81 = 551450432066951191L;
      Object[] var80 = var10034;
      Ref.h(551450432066951191L, var80, var81);

      try {
         ;
      } catch (InvocationTargetException var174) {
         throw var174.getTargetException();
      }

      DefaultMutableTreeNode var8 = new DefaultMutableTreeNode(a(-1724, -16920));
      var7.add(var8);
      SwitchTabCommand var10035 = new SwitchTabCommand();
      long var83 = 450762109032120484L;
      SwitchTabCommand var82 = var10035;
      Ref.s(450762109032120484L, var82, var83);
      Object var84 = 600217306549421865L;
      ArrayList var10036 = (ArrayList)Ref.g(600217306549421865L, var84);
      Object var86 = 450762109032120484L;
      this.add((SwitchTabCommand)Ref.g(450762109032120484L, var86));
      Object var88 = 271121671883085064L;
      Ref.g(271121671883085064L, var88);
      Object var90 = 450762109032120484L;
      Object[] var10040 = Registry.packArgs(Ref.g(450762109032120484L, var90));
      long var93 = 551450432066951191L;
      Object[] var92 = var10040;
      Ref.h(551450432066951191L, var92, var93);

      try {
         ;
      } catch (InvocationTargetException var173) {
         throw var173.getTargetException();
      }

      DefaultMutableTreeNode var9 = new DefaultMutableTreeNode(a(-1711, -17387));
      var7.add(var9);
      EffectPreview var10041 = new EffectPreview();
      long var95 = 366907071704052849L;
      EffectPreview var94 = var10041;
      Ref.s(366907071704052849L, var94, var95);
      Object var96 = 600217306549421865L;
      ArrayList var10042 = (ArrayList)Ref.g(600217306549421865L, var96);
      Object var98 = 366907071704052849L;
      this.add((EffectPreview)Ref.g(366907071704052849L, var98));
      Object var100 = 271121671883085064L;
      Ref.g(271121671883085064L, var100);
      Object var102 = 366907071704052849L;
      Object[] var10046 = Registry.packArgs(Ref.g(366907071704052849L, var102));
      long var105 = 551450432066951191L;
      Object[] var104 = var10046;
      Ref.h(551450432066951191L, var104, var105);

      try {
         ;
      } catch (InvocationTargetException var172) {
         throw var172.getTargetException();
      }

      DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(a(-1704, -30543));
      var7.add(var10);
      EnableBackgroundImage var10047 = new EnableBackgroundImage();
      long var107 = 566132279816238623L;
      EnableBackgroundImage var106 = var10047;
      Ref.s(566132279816238623L, var106, var107);
      Object var108 = 600217306549421865L;
      ArrayList var10048 = (ArrayList)Ref.g(600217306549421865L, var108);
      Object var110 = 566132279816238623L;
      this.add((EnableBackgroundImage)Ref.g(566132279816238623L, var110));
      Object var112 = 271121671883085064L;
      Ref.g(271121671883085064L, var112);
      Object var114 = 566132279816238623L;
      Object[] var10052 = Registry.packArgs(Ref.g(566132279816238623L, var114));
      long var117 = 551450432066951191L;
      Object[] var116 = var10052;
      Ref.h(551450432066951191L, var116, var117);

      try {
         ;
      } catch (InvocationTargetException var171) {
         throw var171.getTargetException();
      }

      DefaultMutableTreeNode var10053 = new DefaultMutableTreeNode(a(-1707, 4940));
      long var119 = 240689802017866820L;
      DefaultMutableTreeNode var118 = var10053;
      Ref.s(240689802017866820L, var118, var119);
      Object var120 = 240689802017866820L;
      this.add((DefaultMutableTreeNode)Ref.g(240689802017866820L, var120));
      Zn2 var10055 = new Zn2();
      long var123 = 163252014093871594L;
      Zn2 var122 = var10055;
      Ref.s(163252014093871594L, var122, var123);
      Object var124 = 600217306549421865L;
      ArrayList var10056 = (ArrayList)Ref.g(600217306549421865L, var124);
      Object var126 = 163252014093871594L;
      this.add((Zn2)Ref.g(163252014093871594L, var126));
      Object var128 = 271121671883085064L;
      Ref.g(271121671883085064L, var128);
      Object var130 = 163252014093871594L;
      Object[] var10060 = Registry.packArgs(Ref.g(163252014093871594L, var130));
      long var133 = 551450432066951191L;
      Object[] var132 = var10060;
      Ref.h(551450432066951191L, var132, var133);

      try {
         ;
      } catch (InvocationTargetException var170) {
         throw var170.getTargetException();
      }

      DefaultMutableTreeNode var11 = new DefaultMutableTreeNode(a(-1706, -2555));
      var7.add(var11);
      Object var134 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var134)).setModel(var5);
      Object var136 = 577313982458780365L;
      Ref.g(577313982458780365L, var136);
      Object[] var10063 = Registry.emptyArgs();
      long var139 = 606838486540289950L;
      Object[] var138 = var10063;
      Ref.h(606838486540289950L, var138, var139);

      try {
         ;
      } catch (InvocationTargetException var169) {
         throw var169.getTargetException();
      }

      Object var140 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var140)).addTreeSelectionListener(new Yk4(this, var7, var6, var8, var9, var10, var11));
      Object var142 = 577313982458780365L;
      ((AA)Ref.g(577313982458780365L, var142)).addMouseListener(new LP(this));
      Object var144 = 416028824075080592L;
      JPanel var10066 = (JPanel)Ref.g(416028824075080592L, var144);
      Object var146 = 271121671883085064L;
      this.add((Z8)Ref.g(271121671883085064L, var146), a(-1701, 21010));
      JPanel var10068 = new JPanel();
      long var149 = 618200721620798822L;
      JPanel var148 = var10068;
      Ref.s(618200721620798822L, var148, var149);
      Object var150 = 618200721620798822L;
      ((JPanel)Ref.g(618200721620798822L, var150)).setLayout(new MigLayout(a(-1710, -21706)));
      JButton var12 = new JButton(a(-1702, 30273));
      var12.setFocusable(false);
      Object var152 = 618200721620798822L;
      ((JPanel)Ref.g(618200721620798822L, var152)).add(var12);
      var12.addActionListener(new Ll2(this));
      JButton var13 = new JButton(a(-1699, 2559));
      var13.setFocusable(false);
      Object var154 = 618200721620798822L;
      ((JPanel)Ref.g(618200721620798822L, var154)).add(var13);
      var13.addActionListener(new YH(this));
      long var157 = 136901208482934375L;
      Ref.s(136901208482934375L, var7, var157);
      Object var158 = 577313982458780365L;
      Ref.g(577313982458780365L, var158);
      Object[] var10074 = Registry.packArgs(var6);
      long var161 = 243902657553228984L;
      Object[] var160 = var10074;
      Ref.h(243902657553228984L, var160, var161);

      try {
         ;
      } catch (InvocationTargetException var168) {
         throw var168.getTargetException();
      }

      this.setSize(a(19111, 7040538396383250113L), a(29005, 1864449888257785128L));
      this.setLocationRelativeTo(var1);
      Registry.emptyArgs();
      long var162 = 253808553645062345L;
      Object var10075 = Ref.h2(253808553645062345L, var162);

      try {
         var10075 = (Boolean)var10075;
      } catch (InvocationTargetException var167) {
         throw var167.getTargetException();
      }

      if (this == null) {
         if (var10075 == null) {
            this.setAlwaysOnTop(true);
         }

         Registry.lookupField(554968548006549525L).setBoolean(null, true);
         var10075 = Registry.emptyArgs();
         long var164 = 253808553645062345L;
         Object var10076 = Ref.h2(253808553645062345L, var164);

         try {
         } catch (InvocationTargetException var166) {
            throw var166.getTargetException();
         }
      }

      if (var10075 == null) {
         this.setAlwaysOnTop(false);
      }

      if (this != null) {
         Ky4.K(new String[4]);
      }
   }

   public void Z() {
      Object var1 = 577313982458780365L;
      Ref.g(577313982458780365L, var1);
      Object var3 = 240689802017866820L;
      Object[] var10003 = Registry.packArgs(Ref.g(240689802017866820L, var3));
      long var6 = 243902657553228984L;
      Object[] var5 = var10003;
      Ref.h(243902657553228984L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
   }

   static {
      __vfClinit__();
   }

   public static void M(String var0) {
      W = var0;
   }

   public static String D() {
      return W;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -1712) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 115;
               break;
            case 1:
               var10000 = 233;
               break;
            case 2:
               var10000 = 35;
               break;
            case 3:
               var10000 = 155;
               break;
            case 4:
               var10000 = 252;
               break;
            case 5:
               var10000 = 159;
               break;
            case 6:
               var10000 = 27;
               break;
            case 7:
               var10000 = 62;
               break;
            case 8:
               var10000 = 201;
               break;
            case 9:
               var10000 = 110;
               break;
            case 10:
               var10000 = 179;
               break;
            case 11:
               var10000 = 33;
               break;
            case 12:
               var10000 = 86;
               break;
            case 13:
               var10000 = 67;
               break;
            case 14:
               var10000 = 161;
               break;
            case 15:
               var10000 = 10;
               break;
            case 16:
               var10000 = 24;
               break;
            case 17:
               var10000 = 231;
               break;
            case 18:
               var10000 = 212;
               break;
            case 19:
               var10000 = 246;
               break;
            case 20:
               var10000 = 114;
               break;
            case 21:
               var10000 = 228;
               break;
            case 22:
               var10000 = 116;
               break;
            case 23:
               var10000 = 149;
               break;
            case 24:
               var10000 = 135;
               break;
            case 25:
               var10000 = 126;
               break;
            case 26:
               var10000 = 106;
               break;
            case 27:
               var10000 = 14;
               break;
            case 28:
               var10000 = 153;
               break;
            case 29:
               var10000 = 66;
               break;
            case 30:
               var10000 = 21;
               break;
            case 31:
               var10000 = 38;
               break;
            case 32:
               var10000 = 190;
               break;
            case 33:
               var10000 = 65;
               break;
            case 34:
               var10000 = 88;
               break;
            case 35:
               var10000 = 222;
               break;
            case 36:
               var10000 = 170;
               break;
            case 37:
               var10000 = 26;
               break;
            case 38:
               var10000 = 0;
               break;
            case 39:
               var10000 = 122;
               break;
            case 40:
               var10000 = 124;
               break;
            case 41:
               var10000 = 107;
               break;
            case 42:
               var10000 = 100;
               break;
            case 43:
               var10000 = 64;
               break;
            case 44:
               var10000 = 76;
               break;
            case 45:
               var10000 = 108;
               break;
            case 46:
               var10000 = 198;
               break;
            case 47:
               var10000 = 226;
               break;
            case 48:
               var10000 = 79;
               break;
            case 49:
               var10000 = 22;
               break;
            case 50:
               var10000 = 74;
               break;
            case 51:
               var10000 = 255;
               break;
            case 52:
               var10000 = 84;
               break;
            case 53:
               var10000 = 132;
               break;
            case 54:
               var10000 = 213;
               break;
            case 55:
               var10000 = 244;
               break;
            case 56:
               var10000 = 176;
               break;
            case 57:
               var10000 = 101;
               break;
            case 58:
               var10000 = 202;
               break;
            case 59:
               var10000 = 56;
               break;
            case 60:
               var10000 = 16;
               break;
            case 61:
               var10000 = 180;
               break;
            case 62:
               var10000 = 178;
               break;
            case 63:
               var10000 = 133;
               break;
            case 64:
               var10000 = 134;
               break;
            case 65:
               var10000 = 96;
               break;
            case 66:
               var10000 = 42;
               break;
            case 67:
               var10000 = 195;
               break;
            case 68:
               var10000 = 163;
               break;
            case 69:
               var10000 = 225;
               break;
            case 70:
               var10000 = 160;
               break;
            case 71:
               var10000 = 63;
               break;
            case 72:
               var10000 = 192;
               break;
            case 73:
               var10000 = 146;
               break;
            case 74:
               var10000 = 204;
               break;
            case 75:
               var10000 = 19;
               break;
            case 76:
               var10000 = 184;
               break;
            case 77:
               var10000 = 111;
               break;
            case 78:
               var10000 = 53;
               break;
            case 79:
               var10000 = 194;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 39;
               break;
            case 82:
               var10000 = 221;
               break;
            case 83:
               var10000 = 215;
               break;
            case 84:
               var10000 = 55;
               break;
            case 85:
               var10000 = 1;
               break;
            case 86:
               var10000 = 121;
               break;
            case 87:
               var10000 = 151;
               break;
            case 88:
               var10000 = 181;
               break;
            case 89:
               var10000 = 89;
               break;
            case 90:
               var10000 = 156;
               break;
            case 91:
               var10000 = 147;
               break;
            case 92:
               var10000 = 235;
               break;
            case 93:
               var10000 = 251;
               break;
            case 94:
               var10000 = 87;
               break;
            case 95:
               var10000 = 193;
               break;
            case 96:
               var10000 = 172;
               break;
            case 97:
               var10000 = 152;
               break;
            case 98:
               var10000 = 199;
               break;
            case 99:
               var10000 = 2;
               break;
            case 100:
               var10000 = 113;
               break;
            case 101:
               var10000 = 91;
               break;
            case 102:
               var10000 = 171;
               break;
            case 103:
               var10000 = 41;
               break;
            case 104:
               var10000 = 209;
               break;
            case 105:
               var10000 = 191;
               break;
            case 106:
               var10000 = 247;
               break;
            case 107:
               var10000 = 75;
               break;
            case 108:
               var10000 = 164;
               break;
            case 109:
               var10000 = 206;
               break;
            case 110:
               var10000 = 83;
               break;
            case 111:
               var10000 = 85;
               break;
            case 112:
               var10000 = 18;
               break;
            case 113:
               var10000 = 70;
               break;
            case 114:
               var10000 = 37;
               break;
            case 115:
               var10000 = 80;
               break;
            case 116:
               var10000 = 81;
               break;
            case 117:
               var10000 = 245;
               break;
            case 118:
               var10000 = 136;
               break;
            case 119:
               var10000 = 173;
               break;
            case 120:
               var10000 = 51;
               break;
            case 121:
               var10000 = 40;
               break;
            case 122:
               var10000 = 186;
               break;
            case 123:
               var10000 = 50;
               break;
            case 124:
               var10000 = 148;
               break;
            case 125:
               var10000 = 177;
               break;
            case 126:
               var10000 = 203;
               break;
            case 127:
               var10000 = 59;
               break;
            case 128:
               var10000 = 253;
               break;
            case 129:
               var10000 = 68;
               break;
            case 130:
               var10000 = 5;
               break;
            case 131:
               var10000 = 28;
               break;
            case 132:
               var10000 = 95;
               break;
            case 133:
               var10000 = 123;
               break;
            case 134:
               var10000 = 17;
               break;
            case 135:
               var10000 = 187;
               break;
            case 136:
               var10000 = 73;
               break;
            case 137:
               var10000 = 218;
               break;
            case 138:
               var10000 = 138;
               break;
            case 139:
               var10000 = 25;
               break;
            case 140:
               var10000 = 6;
               break;
            case 141:
               var10000 = 120;
               break;
            case 142:
               var10000 = 210;
               break;
            case 143:
               var10000 = 166;
               break;
            case 144:
               var10000 = 250;
               break;
            case 145:
               var10000 = 72;
               break;
            case 146:
               var10000 = 129;
               break;
            case 147:
               var10000 = 243;
               break;
            case 148:
               var10000 = 139;
               break;
            case 149:
               var10000 = 98;
               break;
            case 150:
               var10000 = 205;
               break;
            case 151:
               var10000 = 189;
               break;
            case 152:
               var10000 = 158;
               break;
            case 153:
               var10000 = 208;
               break;
            case 154:
               var10000 = 131;
               break;
            case 155:
               var10000 = 183;
               break;
            case 156:
               var10000 = 211;
               break;
            case 157:
               var10000 = 61;
               break;
            case 158:
               var10000 = 220;
               break;
            case 159:
               var10000 = 71;
               break;
            case 160:
               var10000 = 143;
               break;
            case 161:
               var10000 = 34;
               break;
            case 162:
               var10000 = 137;
               break;
            case 163:
               var10000 = 36;
               break;
            case 164:
               var10000 = 234;
               break;
            case 165:
               var10000 = 169;
               break;
            case 166:
               var10000 = 141;
               break;
            case 167:
               var10000 = 154;
               break;
            case 168:
               var10000 = 254;
               break;
            case 169:
               var10000 = 46;
               break;
            case 170:
               var10000 = 125;
               break;
            case 171:
               var10000 = 54;
               break;
            case 172:
               var10000 = 217;
               break;
            case 173:
               var10000 = 78;
               break;
            case 174:
               var10000 = 47;
               break;
            case 175:
               var10000 = 248;
               break;
            case 176:
               var10000 = 93;
               break;
            case 177:
               var10000 = 29;
               break;
            case 178:
               var10000 = 20;
               break;
            case 179:
               var10000 = 142;
               break;
            case 180:
               var10000 = 197;
               break;
            case 181:
               var10000 = 31;
               break;
            case 182:
               var10000 = 69;
               break;
            case 183:
               var10000 = 236;
               break;
            case 184:
               var10000 = 8;
               break;
            case 185:
               var10000 = 7;
               break;
            case 186:
               var10000 = 216;
               break;
            case 187:
               var10000 = 127;
               break;
            case 188:
               var10000 = 239;
               break;
            case 189:
               var10000 = 130;
               break;
            case 190:
               var10000 = 227;
               break;
            case 191:
               var10000 = 11;
               break;
            case 192:
               var10000 = 109;
               break;
            case 193:
               var10000 = 175;
               break;
            case 194:
               var10000 = 229;
               break;
            case 195:
               var10000 = 214;
               break;
            case 196:
               var10000 = 32;
               break;
            case 197:
               var10000 = 102;
               break;
            case 198:
               var10000 = 128;
               break;
            case 199:
               var10000 = 241;
               break;
            case 200:
               var10000 = 3;
               break;
            case 201:
               var10000 = 238;
               break;
            case 202:
               var10000 = 12;
               break;
            case 203:
               var10000 = 196;
               break;
            case 204:
               var10000 = 52;
               break;
            case 205:
               var10000 = 224;
               break;
            case 206:
               var10000 = 200;
               break;
            case 207:
               var10000 = 242;
               break;
            case 208:
               var10000 = 44;
               break;
            case 209:
               var10000 = 167;
               break;
            case 210:
               var10000 = 117;
               break;
            case 211:
               var10000 = 104;
               break;
            case 212:
               var10000 = 57;
               break;
            case 213:
               var10000 = 157;
               break;
            case 214:
               var10000 = 94;
               break;
            case 215:
               var10000 = 119;
               break;
            case 216:
               var10000 = 144;
               break;
            case 217:
               var10000 = 230;
               break;
            case 218:
               var10000 = 182;
               break;
            case 219:
               var10000 = 237;
               break;
            case 220:
               var10000 = 165;
               break;
            case 221:
               var10000 = 140;
               break;
            case 222:
               var10000 = 185;
               break;
            case 223:
               var10000 = 232;
               break;
            case 224:
               var10000 = 4;
               break;
            case 225:
               var10000 = 13;
               break;
            case 226:
               var10000 = 105;
               break;
            case 227:
               var10000 = 43;
               break;
            case 228:
               var10000 = 118;
               break;
            case 229:
               var10000 = 92;
               break;
            case 230:
               var10000 = 219;
               break;
            case 231:
               var10000 = 240;
               break;
            case 232:
               var10000 = 168;
               break;
            case 233:
               var10000 = 103;
               break;
            case 234:
               var10000 = 99;
               break;
            case 235:
               var10000 = 207;
               break;
            case 236:
               var10000 = 48;
               break;
            case 237:
               var10000 = 249;
               break;
            case 238:
               var10000 = 45;
               break;
            case 239:
               var10000 = 30;
               break;
            case 240:
               var10000 = 162;
               break;
            case 241:
               var10000 = 23;
               break;
            case 242:
               var10000 = 97;
               break;
            case 243:
               var10000 = 188;
               break;
            case 244:
               var10000 = 90;
               break;
            case 245:
               var10000 = 77;
               break;
            case 246:
               var10000 = 112;
               break;
            case 247:
               var10000 = 145;
               break;
            case 248:
               var10000 = 82;
               break;
            case 249:
               var10000 = 58;
               break;
            case 250:
               var10000 = 9;
               break;
            case 251:
               var10000 = 174;
               break;
            case 252:
               var10000 = 223;
               break;
            case 253:
               var10000 = 15;
               break;
            case 254:
               var10000 = 49;
               break;
            default:
               var10000 = 150;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19556;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[21];
      int var11 = 0;
      M(null);
      String var10 = "Ã\u0092Ýìa-\u0003弊捲锞\u001b÷h.\u0091=çi1\"%\u001a\u0091(Æóèk\u0082Ø¹%{~ÅÎ\u0005I\u0019\u001a\u0018Yi:\u0098\u0007çÌðÏÒÇ\rÄN4i®\u0019\u0082\u001f¿OV\u000e\u0093h¢\u0091¬ç[6d'Òs1|\u0004聳暘嘢犌\u0002嬚俠\u000evù\u001e£;¡©û:>\u0019õH¬\u0002鄐苋\tê\u0096º%\u0097\u0089\u0002\u009d\u0094\u0002磭嬫\u0010\u0015O¡ø^Åî\u00842<æ£³»i0\tó®Ûk¡Ý\u0089ñQ\u0002又涣\u0002逌頦\u0002師襔\u0004á\u00ad\u0088\u0019\u0006.R`ôÖ.\u0011b¢OE\u0082~\u001fk3nw§4ÁºËü";
      int var12 = "Ã\u0092Ýìa-\u0003弊捲锞\u001b÷h.\u0091=çi1\"%\u001a\u0091(Æóèk\u0082Ø¹%{~ÅÎ\u0005I\u0019\u001a\u0018Yi:\u0098\u0007çÌðÏÒÇ\rÄN4i®\u0019\u0082\u001f¿OV\u000e\u0093h¢\u0091¬ç[6d'Òs1|\u0004聳暘嘢犌\u0002嬚俠\u000evù\u001e£;¡©û:>\u0019õH¬\u0002鄐苋\tê\u0096º%\u0097\u0089\u0002\u009d\u0094\u0002磭嬫\u0010\u0015O¡ø^Åî\u00842<æ£³»i0\tó®Ûk¡Ý\u0089ñQ\u0002又涣\u0002逌頦\u0002師襔\u0004á\u00ad\u0088\u0019\u0006.R`ôÖ.\u0011b¢OE\u0082~\u001fk3nw§4ÁºËü"
         .length();
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 12;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      AutoSelectTab var30;
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
                        var58 = 75;
                        break;
                     case 1:
                        var58 = 68;
                        break;
                     case 2:
                        var58 = 3;
                        break;
                     case 3:
                        var58 = 95;
                        break;
                     case 4:
                        var58 = 124;
                        break;
                     case 5:
                        var58 = 9;
                        break;
                     default:
                        var58 = 22;
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
                     c = new String[21];
                     long var0 = 3169222210218202346L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u00ad\u001c\u0001ÑáÙ§^¬E\u0004}\u009dJ¨6Wh¢\u009di¹\u0090\u0097";
                     int var5 = "\u00ad\u001c\u0001ÑáÙ§^¬E\u0004}\u009dJ¨6Wh¢\u009di¹\u0090\u0097".length();
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
                     e = new Integer[3];
                     Registry.lookupField(554968548006549525L).setBoolean(null, false);
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

                  var10 = "纼窗\u0002龖棉";
                  var12 = "纼窗\u0002龖棉".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 44;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





