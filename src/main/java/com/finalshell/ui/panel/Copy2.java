package com.finalshell.ui.panel;

import com.finalshell.core.NY;
import com.finalshell.core.U82;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.On2;
import com.finalshell.ui.adapter.CC3;
import com.finalshell.ui.listener.CN;
import com.finalshell.ui.listener.Cv4;
import com.finalshell.ui.listener.LX_3;
import com.finalshell.ui.listener.Yn4;
import com.finalshell.ui.model.OM3;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultCaret;
import net.miginfocom.swing.MigLayout;

public class Copy2 extends F8 {
   String l;
   String O;
   String C;
   U82 b;
   JTable Y;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] g;

   Copy2(U82 var1) {
      long var32 = 342152644107297137L;
      String var31 = "";
      Ref.s(342152644107297137L, var31, var32);
      long var34 = 306591247979331074L;
      Ref.s(306591247979331074L, var1, var34);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(7213, -11796), "", ""));
      Uo2.i();
      this.setPreferredSize(new Dimension(b(11508, 8798020735677354690L), b(14382, 2619784359321486866L)));
      Object[] var10004 = Registry.emptyArgs();
      long var36 = 545133032664017568L;
      Object[] var35 = var10004;
      Ref.h(545133032664017568L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      JPopupMenu var3 = new JPopupMenu();
      JMenuItem var4 = new JMenuItem(a(7215, 27192));
      var4.addActionListener(new Cv4(this));
      var3.add(var4);
      JMenuItem var5 = new JMenuItem(a(7201, 16006));
      var5.addActionListener(new Yn4(this));
      var3.add(var5);
      Border var6 = BorderFactory.createEmptyBorder(4, b(25702, 840559825354299998L), 4, b(979, 6222761145816841709L));
      JSplitPane var7 = new JSplitPane();
      this.add(var7, a(7223, -27915));
      JPanel var8 = new JPanel();
      var8.setLayout(new MigLayout(a(7205, -19945), "", a(7210, 31909)));
      var8.setBackground(new Color(b(22469, 2355984763976460796L), b(37, 685777780146404888L), b(37, 685777780146404888L)));
      var7.setLeftComponent(var8);
      JPanel var9 = new JPanel();
      var9.setLayout(new MigLayout(a(7222, 496), "", ""));
      var9.setOpaque(false);
      var8.add(var9, a(7203, 25770));
      var9.add(new JLabel(a(7211, -1583)));
      JTextField var10 = new JTextField();
      var10.setBackground(new Color(0, 0, 0, 0));
      var10.setOpaque(false);
      var10.setEditable(false);
      StringBuilder var10005 = new StringBuilder();
      Object[] var10007 = Registry.emptyArgs();
      long var38 = 340521912883652737L;
      Object[] var37 = var10007;
      var10007 = Ref.h(340521912883652737L, var37, var38);

      try {
         var91 = (Integer)var10007;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

      var10005.setText(var1.append(var91).append("").toString());
      Registry.packArgs(var10);
      long var39 = 322267315291882359L;
      Ref.h2(322267315291882359L, var39);
      var9.add(var10, a(7212, 23020));
      var9.add(new JLabel(a(7200, 12420)));
      JTextField var11 = new JTextField();
      var11.setBackground(new Color(0, 0, 0, 0));
      var11.setOpaque(false);
      var11.setEditable(false);
      JTextField var10008 = Registry.emptyArgs();
      long var42 = 412318774197756267L;
      Object[] var41 = var10008;
      var10008 = (JTextField)Ref.h(412318774197756267L, var41, var42);
      String var10009 = (String)(Registry.emptyArgs());
      long var44 = 505915899939017355L;
      Object[] var43 = var10009;
      var10009 = Ref.h(505915899939017355L, var43, var44);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      var10008.setText(var10009);
      Registry.packArgs(var11);
      long var45 = 322267315291882359L;
      Ref.h2(322267315291882359L, var45);
      var9.add(var11, a(7217, 6029));
      JPanel var12 = new JPanel();
      var12.setOpaque(false);
      var12.setLayout(new MigLayout(a(7222, 496), "", ""));
      var8.add(var12, a(7204, -27006));
      var12.add(new JLabel(a(7207, 23851)), "");
      JTextField var13 = new JTextField();
      String var10011 = (String)(Registry.emptyArgs());
      long var48 = 577747074549625554L;
      Object[] var47 = var10011;
      var10011 = Ref.h(577747074549625554L, var47, var48);

      try {
         var10011 = (String)var10011;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      var1.setText(var10011);
      var13.setCaretPosition(0);
      Object[] var10010 = Registry.packArgs(var13);
      long var49 = 322267315291882359L;
      Ref.h2(322267315291882359L, var49);
      JScrollPane var14 = new JScrollPane(var13);
      Object[] var2 = var10010;
      var14.getViewport().setOpaque(false);
      var14.setBorder(var6);
      var14.setAutoscrolls(false);
      var12.add(var13, a(7202, -13837));
      JPanel var15 = new JPanel();
      var15.setOpaque(false);
      var15.setLayout(new MigLayout(a(7222, 496), "", ""));
      var8.add(var15, a(7204, -27006));
      var15.add(new JLabel(a(7208, -9720)), "");
      JTextField var16 = new JTextField();
      var10011 = Registry.emptyArgs();
      long var52 = 618034129838847953L;
      Object[] var51 = var10011;
      var10011 = Ref.h(618034129838847953L, var51, var52);

      try {
         var10011 = (HashMap)var10011;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      HashMap var17 = var10011;
      String var18 = (String)var17.get(a(7214, -18987));
      Object[] var10012 = Registry.emptyArgs();
      long var54 = 618034129838847953L;
      Object[] var53 = var10012;
      Ref.h(618034129838847953L, var53, var54);
      String var100 = var18;
      if (var2 == false) {
         if (var18 == null) {
            var18 = (String)var17.get(a(7209, 9751));
         }

         var100 = var18;
      }

      if (var100 != null) {
         var16.setText(var18);
      }

      Registry.packArgs(var16);
      long var55 = 322267315291882359L;
      Ref.h2(322267315291882359L, var55);
      JScrollPane var19 = new JScrollPane(var16);
      var19.getViewport().setOpaque(false);
      var19.setBorder(var6);
      var19.setAutoscrolls(false);
      var15.add(var16, a(7206, -13409));
      JTextArea var10014 = (JTextArea)(Registry.emptyArgs());
      long var58 = 206971562084259587L;
      Object[] var57 = var10014;
      var10014 = Ref.h(206971562084259587L, var57, var58);

      try {
         var10014 = (JTextArea)var10014;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      JTextArea var20 = var10014;
      var20.setBackground(Color.white);
      JScrollPane var21 = new JScrollPane(var20);
      var21.getViewport().setOpaque(false);
      var21.setBorder(var6);
      var21.setAutoscrolls(false);
      var8.add(var21, a(7216, -22459));
      Registry.packArgs(var20);
      long var59 = 322267315291882359L;
      Ref.h2(322267315291882359L, var59);
      Iterator var22 = var17.keySet().iterator();
      ArrayList var23 = new ArrayList();

      while (var22.hasNext()) {
         String var24 = (String)var22.next();
         String var25 = (String)var17.get(var24);
         var23.add(var24);
         if (var2 != false) {
            Ky4.K(new String[1]);
            break;
         }
      }

      Collator var85 = Collator.getInstance(Locale.US);
      Collections.sort(var23, var85);
      String[][] var86 = new String[var23.size()][2];
      int var26 = 0;

      while (var26 < var86.length) {
         String var27 = (String)var23.get(var26);
         String var28 = (String)var17.get(var27);
         if (var2 == false) {
            if (var28 == null) {
               var28 = "";
            }

            var86[var26][0] = var27;
            var86[var26][1] = var28;
            var26++;
         }

         if (var2 != false) {
            break;
         }
      }

      Object[] var87 = new Object[]{a(7218, 11570), a(7219, 7988)};
      OM3 var88 = new OM3(this, var86, var87);
      JTable var10016 = new JTable(var88);
      long var62 = 166263389195533693L;
      JTable var61 = var10016;
      Ref.s(166263389195533693L, var61, var62);
      Object var63 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var63)).setShowGrid(false);
      Object var65 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var65)).setAutoscrolls(false);
      Object var67 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var67)).setAutoResizeMode(0);
      Object var69 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var69)).setOpaque(false);
      JScrollPane var10021;
      Object var71 = 166263389195533693L;
      super((JTable)Ref.g(166263389195533693L, var71));
      JScrollPane var89 = var10021;
      var89.setOpaque(false);
      var89.getViewport().setOpaque(false);
      var7.setRightComponent(var89);
      Object var73 = 166263389195533693L;
      TableColumnModel var29 = ((JTable)Ref.g(166263389195533693L, var73)).getColumnModel();
      var29.getColumn(0).setPreferredWidth(b(21561, 3132666707310520835L));
      var29.getColumn(0).setMinWidth(b(5023, 809375443988376992L));
      var29.getColumn(0).setMaxWidth(b(9274, 1494384179343088142L));
      var29.getColumn(1).setPreferredWidth(b(25388, 4803984291409206555L));
      var29.getColumn(1).setMinWidth(b(18596, 604115474686555807L));
      CC3 var30 = new CC3();
      Object var75 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var75)).setDefaultRenderer(Object.class, var30);
      Object var77 = 166263389195533693L;
      ((JTable)Ref.g(166263389195533693L, var77)).addMouseListener(new LX_3(this, var3));
      var89.addMouseListener(new CN(this));
      var7.setResizeWeight(0.5);
      SwingUtilities.invokeLater(new On2(this, var7));
   }

   JTextArea p() {
      JTextArea var1 = new JTextArea();
      var1.setLineWrap(true);
      var1.setOpaque(false);
      var1.setEditable(false);
      var1.setAutoscrolls(false);
      Object var3 = 306591247979331074L;
      Object var10002 = Ref.g(306591247979331074L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 372900192662778876L;
      Object[] var5 = var10003;
      var10003 = Ref.h(372900192662778876L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10002.setText(var10003);
      var1.setCaretPosition(0);
      DefaultCaret var2 = (DefaultCaret)var1.getCaret();
      var2.setUpdatePolicy(1);
      return var1;
   }

   public void V() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 399585344452154517L;
      Object[] var5 = var10002;
      Ref.h(399585344452154517L, var5, var6);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var8 = 149968465491171480L;
      Object[] var7 = var10003;
      var10003 = Ref.h(149968465491171480L, var7, var8);

      try {
         var10003 = (NY)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      NY var1 = var10003;
      byte var15 = 2;
      Color var10008 = (Color)(Registry.emptyArgs());
      long var10 = 345089686683358688L;
      Object[] var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
      this.setBorder(null);
   }

   @Override
   public String getName() {
      Object var1 = 407137765547988952L;
      return (String)Ref.g(407137765547988952L, var1);
   }

   @Override
   public void setName(String var1) {
      long var3 = 407137765547988952L;
      Ref.s(407137765547988952L, var1, var3);
   }

   public String H() {
      Object var1 = 328346673976630341L;
      return (String)Ref.g(328346673976630341L, var1);
   }

   public void n(String var1) {
      long var3 = 328346673976630341L;
      Ref.s(328346673976630341L, var1, var3);
   }

   public U82 D() {
      Object var1 = 306591247979331074L;
      return (U82)Ref.g(306591247979331074L, var1);
   }

   public void x(U82 var1) {
      long var3 = 306591247979331074L;
      Ref.s(306591247979331074L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 7203) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 93;
               break;
            case 1:
               var10000 = 125;
               break;
            case 2:
               var10000 = 161;
               break;
            case 3:
               var10000 = 51;
               break;
            case 4:
               var10000 = 123;
               break;
            case 5:
               var10000 = 55;
               break;
            case 6:
               var10000 = 109;
               break;
            case 7:
               var10000 = 169;
               break;
            case 8:
               var10000 = 99;
               break;
            case 9:
               var10000 = 244;
               break;
            case 10:
               var10000 = 78;
               break;
            case 11:
               var10000 = 39;
               break;
            case 12:
               var10000 = 7;
               break;
            case 13:
               var10000 = 44;
               break;
            case 14:
               var10000 = 229;
               break;
            case 15:
               var10000 = 27;
               break;
            case 16:
               var10000 = 193;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 48;
               break;
            case 19:
               var10000 = 58;
               break;
            case 20:
               var10000 = 201;
               break;
            case 21:
               var10000 = 67;
               break;
            case 22:
               var10000 = 132;
               break;
            case 23:
               var10000 = 149;
               break;
            case 24:
               var10000 = 6;
               break;
            case 25:
               var10000 = 150;
               break;
            case 26:
               var10000 = 1;
               break;
            case 27:
               var10000 = 173;
               break;
            case 28:
               var10000 = 65;
               break;
            case 29:
               var10000 = 52;
               break;
            case 30:
               var10000 = 141;
               break;
            case 31:
               var10000 = 61;
               break;
            case 32:
               var10000 = 77;
               break;
            case 33:
               var10000 = 224;
               break;
            case 34:
               var10000 = 171;
               break;
            case 35:
               var10000 = 31;
               break;
            case 36:
               var10000 = 134;
               break;
            case 37:
               var10000 = 5;
               break;
            case 38:
               var10000 = 194;
               break;
            case 39:
               var10000 = 104;
               break;
            case 40:
               var10000 = 138;
               break;
            case 41:
               var10000 = 139;
               break;
            case 42:
               var10000 = 246;
               break;
            case 43:
               var10000 = 56;
               break;
            case 44:
               var10000 = 236;
               break;
            case 45:
               var10000 = 11;
               break;
            case 46:
               var10000 = 188;
               break;
            case 47:
               var10000 = 200;
               break;
            case 48:
               var10000 = 16;
               break;
            case 49:
               var10000 = 14;
               break;
            case 50:
               var10000 = 254;
               break;
            case 51:
               var10000 = 128;
               break;
            case 52:
               var10000 = 130;
               break;
            case 53:
               var10000 = 182;
               break;
            case 54:
               var10000 = 94;
               break;
            case 55:
               var10000 = 131;
               break;
            case 56:
               var10000 = 142;
               break;
            case 57:
               var10000 = 156;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 8;
               break;
            case 60:
               var10000 = 195;
               break;
            case 61:
               var10000 = 208;
               break;
            case 62:
               var10000 = 165;
               break;
            case 63:
               var10000 = 190;
               break;
            case 64:
               var10000 = 179;
               break;
            case 65:
               var10000 = 76;
               break;
            case 66:
               var10000 = 120;
               break;
            case 67:
               var10000 = 247;
               break;
            case 68:
               var10000 = 152;
               break;
            case 69:
               var10000 = 198;
               break;
            case 70:
               var10000 = 83;
               break;
            case 71:
               var10000 = 64;
               break;
            case 72:
               var10000 = 111;
               break;
            case 73:
               var10000 = 255;
               break;
            case 74:
               var10000 = 126;
               break;
            case 75:
               var10000 = 95;
               break;
            case 76:
               var10000 = 181;
               break;
            case 77:
               var10000 = 59;
               break;
            case 78:
               var10000 = 207;
               break;
            case 79:
               var10000 = 50;
               break;
            case 80:
               var10000 = 221;
               break;
            case 81:
               var10000 = 42;
               break;
            case 82:
               var10000 = 203;
               break;
            case 83:
               var10000 = 135;
               break;
            case 84:
               var10000 = 206;
               break;
            case 85:
               var10000 = 230;
               break;
            case 86:
               var10000 = 213;
               break;
            case 87:
               var10000 = 0;
               break;
            case 88:
               var10000 = 199;
               break;
            case 89:
               var10000 = 3;
               break;
            case 90:
               var10000 = 105;
               break;
            case 91:
               var10000 = 28;
               break;
            case 92:
               var10000 = 185;
               break;
            case 93:
               var10000 = 147;
               break;
            case 94:
               var10000 = 129;
               break;
            case 95:
               var10000 = 17;
               break;
            case 96:
               var10000 = 220;
               break;
            case 97:
               var10000 = 18;
               break;
            case 98:
               var10000 = 101;
               break;
            case 99:
               var10000 = 62;
               break;
            case 100:
               var10000 = 54;
               break;
            case 101:
               var10000 = 68;
               break;
            case 102:
               var10000 = 107;
               break;
            case 103:
               var10000 = 33;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 124;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 192;
               break;
            case 108:
               var10000 = 45;
               break;
            case 109:
               var10000 = 35;
               break;
            case 110:
               var10000 = 225;
               break;
            case 111:
               var10000 = 245;
               break;
            case 112:
               var10000 = 186;
               break;
            case 113:
               var10000 = 2;
               break;
            case 114:
               var10000 = 40;
               break;
            case 115:
               var10000 = 163;
               break;
            case 116:
               var10000 = 196;
               break;
            case 117:
               var10000 = 240;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 234;
               break;
            case 120:
               var10000 = 22;
               break;
            case 121:
               var10000 = 71;
               break;
            case 122:
               var10000 = 253;
               break;
            case 123:
               var10000 = 115;
               break;
            case 124:
               var10000 = 74;
               break;
            case 125:
               var10000 = 86;
               break;
            case 126:
               var10000 = 100;
               break;
            case 127:
               var10000 = 153;
               break;
            case 128:
               var10000 = 252;
               break;
            case 129:
               var10000 = 10;
               break;
            case 130:
               var10000 = 121;
               break;
            case 131:
               var10000 = 251;
               break;
            case 132:
               var10000 = 249;
               break;
            case 133:
               var10000 = 211;
               break;
            case 134:
               var10000 = 231;
               break;
            case 135:
               var10000 = 175;
               break;
            case 136:
               var10000 = 212;
               break;
            case 137:
               var10000 = 9;
               break;
            case 138:
               var10000 = 91;
               break;
            case 139:
               var10000 = 223;
               break;
            case 140:
               var10000 = 73;
               break;
            case 141:
               var10000 = 216;
               break;
            case 142:
               var10000 = 235;
               break;
            case 143:
               var10000 = 26;
               break;
            case 144:
               var10000 = 242;
               break;
            case 145:
               var10000 = 21;
               break;
            case 146:
               var10000 = 53;
               break;
            case 147:
               var10000 = 92;
               break;
            case 148:
               var10000 = 25;
               break;
            case 149:
               var10000 = 29;
               break;
            case 150:
               var10000 = 187;
               break;
            case 151:
               var10000 = 160;
               break;
            case 152:
               var10000 = 180;
               break;
            case 153:
               var10000 = 166;
               break;
            case 154:
               var10000 = 12;
               break;
            case 155:
               var10000 = 4;
               break;
            case 156:
               var10000 = 162;
               break;
            case 157:
               var10000 = 80;
               break;
            case 158:
               var10000 = 119;
               break;
            case 159:
               var10000 = 191;
               break;
            case 160:
               var10000 = 112;
               break;
            case 161:
               var10000 = 82;
               break;
            case 162:
               var10000 = 30;
               break;
            case 163:
               var10000 = 214;
               break;
            case 164:
               var10000 = 69;
               break;
            case 165:
               var10000 = 250;
               break;
            case 166:
               var10000 = 197;
               break;
            case 167:
               var10000 = 215;
               break;
            case 168:
               var10000 = 110;
               break;
            case 169:
               var10000 = 204;
               break;
            case 170:
               var10000 = 46;
               break;
            case 171:
               var10000 = 79;
               break;
            case 172:
               var10000 = 60;
               break;
            case 173:
               var10000 = 227;
               break;
            case 174:
               var10000 = 106;
               break;
            case 175:
               var10000 = 38;
               break;
            case 176:
               var10000 = 37;
               break;
            case 177:
               var10000 = 184;
               break;
            case 178:
               var10000 = 87;
               break;
            case 179:
               var10000 = 154;
               break;
            case 180:
               var10000 = 145;
               break;
            case 181:
               var10000 = 43;
               break;
            case 182:
               var10000 = 239;
               break;
            case 183:
               var10000 = 85;
               break;
            case 184:
               var10000 = 19;
               break;
            case 185:
               var10000 = 127;
               break;
            case 186:
               var10000 = 143;
               break;
            case 187:
               var10000 = 97;
               break;
            case 188:
               var10000 = 183;
               break;
            case 189:
               var10000 = 205;
               break;
            case 190:
               var10000 = 174;
               break;
            case 191:
               var10000 = 167;
               break;
            case 192:
               var10000 = 116;
               break;
            case 193:
               var10000 = 72;
               break;
            case 194:
               var10000 = 41;
               break;
            case 195:
               var10000 = 155;
               break;
            case 196:
               var10000 = 89;
               break;
            case 197:
               var10000 = 20;
               break;
            case 198:
               var10000 = 96;
               break;
            case 199:
               var10000 = 84;
               break;
            case 200:
               var10000 = 248;
               break;
            case 201:
               var10000 = 238;
               break;
            case 202:
               var10000 = 202;
               break;
            case 203:
               var10000 = 122;
               break;
            case 204:
               var10000 = 176;
               break;
            case 205:
               var10000 = 157;
               break;
            case 206:
               var10000 = 243;
               break;
            case 207:
               var10000 = 118;
               break;
            case 208:
               var10000 = 219;
               break;
            case 209:
               var10000 = 209;
               break;
            case 210:
               var10000 = 114;
               break;
            case 211:
               var10000 = 32;
               break;
            case 212:
               var10000 = 90;
               break;
            case 213:
               var10000 = 148;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 75;
               break;
            case 216:
               var10000 = 241;
               break;
            case 217:
               var10000 = 151;
               break;
            case 218:
               var10000 = 228;
               break;
            case 219:
               var10000 = 98;
               break;
            case 220:
               var10000 = 66;
               break;
            case 221:
               var10000 = 57;
               break;
            case 222:
               var10000 = 140;
               break;
            case 223:
               var10000 = 222;
               break;
            case 224:
               var10000 = 189;
               break;
            case 225:
               var10000 = 177;
               break;
            case 226:
               var10000 = 144;
               break;
            case 227:
               var10000 = 237;
               break;
            case 228:
               var10000 = 158;
               break;
            case 229:
               var10000 = 168;
               break;
            case 230:
               var10000 = 137;
               break;
            case 231:
               var10000 = 170;
               break;
            case 232:
               var10000 = 70;
               break;
            case 233:
               var10000 = 113;
               break;
            case 234:
               var10000 = 232;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 103;
               break;
            case 237:
               var10000 = 117;
               break;
            case 238:
               var10000 = 13;
               break;
            case 239:
               var10000 = 15;
               break;
            case 240:
               var10000 = 88;
               break;
            case 241:
               var10000 = 47;
               break;
            case 242:
               var10000 = 218;
               break;
            case 243:
               var10000 = 164;
               break;
            case 244:
               var10000 = 210;
               break;
            case 245:
               var10000 = 217;
               break;
            case 246:
               var10000 = 49;
               break;
            case 247:
               var10000 = 36;
               break;
            case 248:
               var10000 = 108;
               break;
            case 249:
               var10000 = 233;
               break;
            case 250:
               var10000 = 24;
               break;
            case 251:
               var10000 = 133;
               break;
            case 252:
               var10000 = 23;
               break;
            case 253:
               var10000 = 136;
               break;
            case 254:
               var10000 = 172;
               break;
            default:
               var10000 = 81;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32318;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[22];
      int var11 = 0;
      String var10 = "\u00adðÆw\u001c\u0005?Öò[M8\u0018P\u00ad-ðä\b-×\"qi\u0018dg\u00886>\u001cöÃ\u0005奕券单鄝呥\u0002咧禰\u0002保羲\u001b\u0083o\u0006øA\f{08ª$XW\u0012\u0082Tu\u0083PüÆ%\u0093%\u008c]\u0014\u000f\u0015g\u001e\u000f«\u0092£Þjðly@D¨\u0004¸·d\u009f\u0003H\u0017\u009c\u0017çÈw\u0091\u0084û1°<0É\u0007]\u0087\u000fG\u0001Í\u008c\u001b\u009djÂ\u0006íãÔÌ\u0000N\u0004嵭优皑徤\u0005始勘历鄁倮\u0003²\u008bÃ\u000f«ßÉ\u0018Qpü\u0087\u0081}\u0011¨ï\u001f]\n´Gàý\u009d¬à\"K$\u0003區酒偼\u0004獦塑叅鄳\u0010\u0098\u0006eÕ-©ö\u0084\u008b<\u001a\u009c\u0080DLÞ&ÝbÍY88T¶Ýx\u009cJÒ_ë=ú,r³\u0007\u001dî\u0081ÿ|\u0011\u0085\u008a\u00ad\u0097·õ%óÛ\u009c¼";
      int var12 = "\u00adðÆw\u001c\u0005?Öò[M8\u0018P\u00ad-ðä\b-×\"qi\u0018dg\u00886>\u001cöÃ\u0005奕券单鄝呥\u0002咧禰\u0002保羲\u001b\u0083o\u0006øA\f{08ª$XW\u0012\u0082Tu\u0083PüÆ%\u0093%\u008c]\u0014\u000f\u0015g\u001e\u000f«\u0092£Þjðly@D¨\u0004¸·d\u009f\u0003H\u0017\u009c\u0017çÈw\u0091\u0084û1°<0É\u0007]\u0087\u000fG\u0001Í\u008c\u001b\u009djÂ\u0006íãÔÌ\u0000N\u0004嵭优皑徤\u0005始勘历鄁倮\u0003²\u008bÃ\u000f«ßÉ\u0018Qpü\u0087\u0081}\u0011¨ï\u001f]\n´Gàý\u009d¬à\"K$\u0003區酒偼\u0004獦塑叅鄳\u0010\u0098\u0006eÕ-©ö\u0084\u008b<\u001a\u009c\u0080DLÞ&ÝbÍY88T¶Ýx\u009cJÒ_ë=ú,r³\u0007\u001dî\u0081ÿ|\u0011\u0085\u008a\u00ad\u0097·õ%óÛ\u009c¼"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 118;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      long var33;
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
                        var65 = 114;
                        break;
                     case 1:
                        var65 = 108;
                        break;
                     case 2:
                        var65 = 125;
                        break;
                     case 3:
                        var65 = 16;
                        break;
                     case 4:
                        var65 = 22;
                        break;
                     case 5:
                        var65 = 115;
                        break;
                     default:
                        var65 = 118;
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
                     d = new String[22];
                     long var0 = 3583726882726240341L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "È\u009f$;*i\u009d¾õ¹üm\\3\u008d\u008dè®Ý\u0013U\u0091\u0001Wk\u001aÿð<\u0091\u001e±oÈ\u0083º\u0018\u0005Ê.¦|\u0007â\u0018èV\u0002\u0011\fÐÊâ_z\r\u0002¨$\"ÁæÉUÍ\u0099æ^\f{\u0095\u0087";
                     int var5 = "È\u009f$;*i\u009d¾õ¹üm\\3\u008d\u008dè®Ý\u0013U\u0091\u0001Wk\u001aÿð<\u0091\u001e±oÈ\u0083º\u0018\u0005Ê.¦|\u0007â\u0018èV\u0002\u0011\fÐÊâ_z\r\u0002¨$\"ÁæÉUÍ\u0099æ^\f{\u0095\u0087"
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
                                    e = var6;
                                    g = new Integer[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¹\u001f\fÑdêÿ\u0016÷/þf\u009f_:û";
                                 var5 = "¹\u001f\fÑdêÿ\u0016÷/þf\u009f_:û".length();
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

                  var10 = "[Æ\\\u008cKÃ{\u0088yüMÙ-lU\u001al\u0089áF4íÈ:Z\u0001Åa\u000f\u008d\u0085L\u0012 p\u0083Æ/\u0014\u0085Ä<Óf";
                  var12 = "[Æ\\\u008cKÃ{\u0088yüMÙ-lU\u001al\u0089áF4íÈ:Z\u0001Åa\u000f\u008d\u0085L\u0012 p\u0083Æ/\u0014\u0085Ä<Óf".length();
                  var9 = 28;
                  var17 = -1;
            }

            var10000 = 62;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





