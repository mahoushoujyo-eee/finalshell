package com.finalshell.ui.panel;

import com.finalshell.core.AL;
import com.finalshell.core.Fb2;
import com.finalshell.core.Li4;
import com.finalshell.core.Lj4_2;
import com.finalshell.core.NY;
import com.finalshell.core.T32;
import com.finalshell.core.Ty4;
import com.finalshell.core.U62;
import com.finalshell.core.Y9;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Xk2;
import com.finalshell.ui.dialog.EditDialog3;
import com.finalshell.ui.dialog.RenameFolderDialog;
import com.finalshell.ui.listener.Bm4;
import com.finalshell.ui.listener.File7;
import com.finalshell.ui.listener.L23;
import com.finalshell.ui.listener.LX;
import com.finalshell.ui.listener.Listener;
import com.finalshell.ui.listener.NC;
import com.finalshell.ui.listener.Nw2;
import com.finalshell.ui.listener.Oc2;
import com.finalshell.ui.listener.TR3;
import com.finalshell.ui.listener.Td2;
import com.finalshell.ui.listener.U7;
import com.finalshell.ui.listener.UZ3;
import com.finalshell.ui.listener.VG;
import com.finalshell.ui.listener.Y5;
import com.finalshell.ui.listener.Ym2;
import com.finalshell.ui.model.Bj2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class AppendCarriageReturnCRPanel extends JPanel implements AL, Fb2 {
   AM Q;
   Ge2 i;
   Cp2 B;
   T32 g;
   JSplitPane a;
   JPanel J;
   JScrollPane m;
   JTextArea Z;
   EditPanel d;
   JPanel T;
   Lj4_2 k;
   Copy3 j;
   JCheckBoxMenuItem E;
   boolean b;
   String M;
   public static int[] u;
   public static String[] c;
   public static String[] e;
   public static long[] f;
   public static Integer[] h;

   public AppendCarriageReturnCRPanel(Cp2 var1) {
      Registry.lookupField(490286977843074498L).setBoolean(this, false);
      String var10001 = a(-20355, -12157);
      long var30 = 127006560398762220L;
      String var29 = var10001;
      Ref.s(127006560398762220L, var29, var30);
      Registry.emptyArgs();
      long var31 = 270389152141252877L;
      Ref.h2(270389152141252877L, var31);
      U62 var10003 = (U62)(Registry.emptyArgs());
      long var34 = 306266403902896148L;
      Object[] var33 = var10003;
      var10003 = Ref.h(306266403902896148L, var33, var34);

      try {
         var10003 = (U62)var10003;
      } catch (InvocationTargetException var224) {
         throw var224.getTargetException();
      }

      U62 var3 = var10003;
      long var36 = 605695900471117140L;
      Ref.s(605695900471117140L, var1, var36);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-20390, -22181), a(-20414, 7114), a(-20409, 8174)));
      this.setMinimumSize(new Dimension(0, 0));
      this.setPreferredSize(new Dimension(a(32443, 262566989094281743L), a(24270, 4737300961074889328L)));
      JSplitPane var10005 = new JSplitPane(1);
      long var38 = 256433469970092898L;
      JSplitPane var37 = var10005;
      Ref.s(256433469970092898L, var37, var38);
      Object var39 = 256433469970092898L;
      ((JSplitPane)Ref.g(256433469970092898L, var39)).setOpaque(false);
      Object var41 = 256433469970092898L;
      ((JSplitPane)Ref.g(256433469970092898L, var41)).setResizeWeight(1.0);
      Y();
      Object var43 = 256433469970092898L;
      ((JSplitPane)Ref.g(256433469970092898L, var43))
         .setBorder(
            BorderFactory.createCompoundBorder(
               BorderFactory.createMatteBorder(
                  1, 1, 0, 1, new Color(a(372, 8405589324709010892L), a(4391, 7430188607703190936L), a(4391, 7430188607703190936L))
               ),
               BorderFactory.createEmptyBorder(3, 3, 0, 0)
            )
         );
      Object var45 = 256433469970092898L;
      this.add((JSplitPane)Ref.g(256433469970092898L, var45), a(-20385, -22609));
      Object var47 = 256433469970092898L;
      ((JSplitPane)Ref.g(256433469970092898L, var47)).addPropertyChangeListener(a(-20396, -16222), new TR3(this));
      JPanel var10012 = new JPanel(new MigLayout(a(-20411, 19710), a(-20409, 8174), a(-20409, 8174)));
      long var50 = 390502927378779445L;
      JPanel var49 = var10012;
      Ref.s(390502927378779445L, var49, var50);
      AppendCarriageReturnCRPanel var2 = this;
      Object var51 = 390502927378779445L;
      ((JPanel)Ref.g(390502927378779445L, var51)).setOpaque(false);
      JPanel var10013 = new JPanel();
      long var54 = 265429771357654528L;
      JPanel var53 = var10013;
      Ref.s(265429771357654528L, var53, var54);
      Object var55 = 265429771357654528L;
      ((JPanel)Ref.g(265429771357654528L, var55)).setOpaque(false);
      Object var57 = 265429771357654528L;
      ((JPanel)Ref.g(265429771357654528L, var57)).setLayout(new MigLayout(a(-20392, -30236), a(-20409, 8174), a(-20391, 25468)));
      Object var59 = 265429771357654528L;
      JPanel var10016 = (JPanel)Ref.g(265429771357654528L, var59);
      Object var61 = 390502927378779445L;
      this.add((JPanel)Ref.g(390502927378779445L, var61), a(-20398, -380));
      EditPanel var10018 = new EditPanel(this);
      long var64 = 499934073596807594L;
      EditPanel var63 = var10018;
      Ref.s(499934073596807594L, var63, var64);
      Object var65 = 256433469970092898L;
      JSplitPane var10019 = (JSplitPane)Ref.g(256433469970092898L, var65);
      Object var67 = 265429771357654528L;
      this.setTopComponent((JPanel)Ref.g(265429771357654528L, var67));
      JPanel var4 = new JPanel(new MigLayout(a(-20413, -8904), "", a(-20407, 187)));
      var4.setOpaque(false);
      Object var69 = 256433469970092898L;
      ((JSplitPane)Ref.g(256433469970092898L, var69)).setBottomComponent(var4);
      JLabel var5 = new JLabel(a(-20394, -20622));
      var5.setOpaque(true);
      var5.setBackground(new Color(a(29533, 8033787875321901031L), a(27417, 118699993695418286L), a(27417, 118699993695418286L)));
      var5.setBorder(BorderFactory.createEmptyBorder(0, a(32079, 7867375544837562862L), 0, 0));
      var5.setForeground(new Color(a(8641, 1128320059243838839L), a(26423, 6746314708720057220L), a(26423, 6746314708720057220L)));
      var4.add(var5, a(-20400, -28614));
      JTextArea var10022 = new JTextArea();
      long var72 = 165605583887724001L;
      JTextArea var71 = var10022;
      Ref.s(165605583887724001L, var71, var72);
      Object var73 = 165605583887724001L;
      ((JTextArea)Ref.g(165605583887724001L, var73)).setAutoscrolls(false);
      Object var75 = 165605583887724001L;
      ((JTextArea)Ref.g(165605583887724001L, var75)).setLineWrap(true);
      Object var77 = 165605583887724001L;
      ((JTextArea)Ref.g(165605583887724001L, var77)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object var79 = 165605583887724001L;
      ((JTextArea)Ref.g(165605583887724001L, var79))
         .setBackground(new Color(a(21319, 6247902318478872548L), a(11775, 7274761049129824578L), a(11775, 7274761049129824578L)));
      KeyStroke var6 = KeyStroke.getKeyStroke(a(4865, 4623524674937163700L), 0, false);
      KeyStroke var7 = KeyStroke.getKeyStroke(a(4513, 8947452529549184275L), a(28161, 2988871503571317437L), false);
      Object var81 = 165605583887724001L;
      ((JTextArea)Ref.g(165605583887724001L, var81)).addKeyListener(new Ym2(this));
      JScrollPane var10028;
      Object var83 = 165605583887724001L;
      super((JTextArea)Ref.g(165605583887724001L, var83));
      JScrollPane var8 = var10028;
      var8.setOpaque(false);
      var8.getViewport().setOpaque(false);
      var8.setBorder(BorderFactory.createLineBorder(new Color(a(2993, 5790809365120325384L), a(7959, 2766375006535222183L), a(7959, 2766375006535222183L)), 1));
      var4.add(var8, a(-20366, -1056));
      JPanel var9 = new JPanel(new MigLayout(a(-20388, -17027), "", a(-20409, 8174)));
      var9.setOpaque(false);
      var4.add(var9, a(-20405, -6837));
      JPanel var10 = new JPanel(new MigLayout(a(-20412, -12691), "", a(-20409, 8174)));
      var10.setOpaque(false);
      var9.add(var10, a(-20393, 25049));
      W9 var11 = new W9();
      var11.E(Bj2.standalone);
      var10.add(var11);
      JMenu var12 = new JMenu(a(-20401, -20247));
      var12.setMargin(new Insets(0, 0, 0, 0));
      var11.add(var12);
      ButtonGroup var13 = new ButtonGroup();
      JRadioButtonMenuItem var14 = new JRadioButtonMenuItem(a(-20356, -10288));
      var14.addActionListener(new Oc2(this));
      var13.add(var14);
      String var15 = a(-20415, -14618);
      Registry.emptyArgs();
      long var85 = 454647487873911743L;
      Object var10029 = Ref.h2(454647487873911743L, var85);

      try {
         var230 = (Boolean)var10029;
      } catch (InvocationTargetException var223) {
         throw var223.getTargetException();
      }

      if (var230) {
         var15 = a(-20360, -20196);
      }

      JMenuItem var16 = new JMenuItem(var15);
      var16.addActionListener(new NC(this));
      var13.add(var16);
      var12.add(var16);
      Integer var10030 = (Integer)(Registry.emptyArgs());
      long var88 = 257025344649675398L;
      Object[] var87 = var10030;
      var10030 = Ref.h(257025344649675398L, var87, var88);

      try {
         var10030 = (Integer)var10030;
      } catch (InvocationTargetException var222) {
         throw var222.getTargetException();
      }

      label283: {
         int var10031 = Registry.lookupField(616402908672951906L).getInt(null);
         if (this == null) {
            if (var10030 == var10031) {
               var16.setSelected(true);
               if (this == null) {
                  break label283;
               }

               Ky4.K(new String[3]);
            }

            var10030 = var3;
            Object[] var233 = Registry.emptyArgs();
            long var90 = 257025344649675398L;
            Object[] var89 = var233;
            Object var234 = Ref.h(257025344649675398L, var89, var90);

            try {
               var10031 = (Integer)var234;
            } catch (InvocationTargetException var221) {
               throw var221.getTargetException();
            }

            Registry.lookupField(286465688371404925L).getInt(null);
         }

         if (var10030 == var10031) {
            var14.setSelected(true);
         }
      }

      var12.addSeparator();
      JCheckBoxMenuItem var235;
      String var10032 = a(-20387, 3570);
      Object[] var10034 = Registry.emptyArgs();
      long var92 = 575356025127634892L;
      Object[] var91 = var10034;
      var10034 = Ref.h(575356025127634892L, var91, var92);

      try {
         var238 = (Boolean)var10034;
      } catch (InvocationTargetException var220) {
         throw var220.getTargetException();
      }

new Dimension(var3, var238);
      JCheckBoxMenuItem var17 = var235;
      var17.addActionListener(new com.finalshell.ui.listener.T(this, var17));
      var12.add((JMenuItem)var17);
      JCheckBoxMenuItem var236;
      String var10033 = a(-20395, -20692);
      Object[] var10035 = Registry.emptyArgs();
      long var94 = 338108372597229383L;
      Object[] var93 = var10035;
      var10035 = Ref.h(338108372597229383L, var93, var94);

      try {
         var241 = (Boolean)var10035;
      } catch (InvocationTargetException var219) {
         throw var219.getTargetException();
      }

new Dimension(var3, var241);
      JCheckBoxMenuItem var18 = var236;
      var18.addActionListener(new Nw2(this, var18));
      JCheckBoxMenuItem var239;
      String var242 = a(-20367, 23556);
      Object[] var10037 = Registry.emptyArgs();
      long var96 = 404018409349740430L;
      Object[] var95 = var10037;
      var10037 = Ref.h(404018409349740430L, var95, var96);

      try {
         var244 = (Boolean)var10037;
      } catch (InvocationTargetException var218) {
         throw var218.getTargetException();
      }

new Dimension(var3, var244);
      long var98 = 274811053631936956L;
      JCheckBoxMenuItem var97 = var239;
      Ref.s(274811053631936956L, var97, var98);
      Object var99 = 274811053631936956L;
      ((JCheckBoxMenuItem)Ref.g(274811053631936956L, var99)).addActionListener(new Y5(this));
      Object var101 = 274811053631936956L;
      this.add((JMenuItem)((JCheckBoxMenuItem)Ref.g(274811053631936956L, var101)));
      JPanel var19 = new JPanel(new MigLayout(a(-20411, 19710), "", ""));
      var19.setOpaque(false);
      var19.add(new JLabel(a(-20410, 15092)));
      JComboBox var20 = new JComboBox();
      var19.setOpaque(false);
      var20.addItem(a(-20406, 5643));
      var20.addItem(a(-20386, -5308));
      var19.add(var20);
      var9.add(var19);
      var10037 = Registry.emptyArgs();
      long var104 = 165950045643857861L;
      Object[] var103 = var10037;
      var10037 = Ref.h(165950045643857861L, var103, var104);

      try {
         var10037 = (Integer)var10037;
      } catch (InvocationTargetException var217) {
         throw var217.getTargetException();
      }

      label274: {
         int var10038 = 1;
         if (this == null) {
            if (var10037 == 1) {
               var20.setSelectedIndex(0);
               if (this == null) {
                  break label274;
               }
            }

            var10037 = var3;
            Object[] var248 = Registry.emptyArgs();
            long var106 = 165950045643857861L;
            Object[] var105 = var248;
            Object var249 = Ref.h(165950045643857861L, var105, var106);

            try {
               var10038 = (Integer)var249;
            } catch (InvocationTargetException var216) {
               throw var216.getTargetException();
            }

            byte var10039 = 2;
         }

         if (var10037 == var10038) {
            var20.setSelectedIndex(1);
         }
      }

      var20.addActionListener(new com.finalshell.ui.listener.QS(this, var20));
      JButton var21 = new JButton(a(-20354, -2395));
      var21.setMargin(new Insets(2, a(5461, 486438176686180853L), 2, a(12698, 3062732849082772792L)));
      var9.add(var21, "");
      var21.addActionListener(new Td2(this));
      AM var250 = new AM();
      long var108 = 220282364724549275L;
      AM var107 = var250;
      Ref.s(220282364724549275L, var107, var108);
      Object var109 = 220282364724549275L;
      ((AM)Ref.g(220282364724549275L, var109)).setOpaque(false);
      Object var111 = 220282364724549275L;
      Ref.g(220282364724549275L, var111);
      Object[] var10041 = Registry.packArgs(true);
      long var114 = 137984194358335738L;
      Object[] var113 = var10041;
      Ref.h(137984194358335738L, var113, var114);

      try {
         ;
      } catch (InvocationTargetException var215) {
         throw var215.getTargetException();
      }

      Object var115 = 220282364724549275L;
      Ref.g(220282364724549275L, var115);
      Object[] var10043 = Registry.packArgs(this);
      long var118 = 253827983161591241L;
      Object[] var117 = var10043;
      Ref.h(253827983161591241L, var117, var118);

      try {
         ;
      } catch (InvocationTargetException var214) {
         throw var214.getTargetException();
      }

      Object var119 = 390502927378779445L;
      JPanel var10044 = (JPanel)Ref.g(390502927378779445L, var119);
      Object var121 = 220282364724549275L;
      this.add((AM)Ref.g(220282364724549275L, var121), a(-20358, 4493));
      Object var123 = 220282364724549275L;
      ((AM)Ref.g(220282364724549275L, var123)).addMouseListener(new File7(this));
      Registry.emptyArgs();
      long var125 = 270389152141252877L;
      Ref.h2(270389152141252877L, var125);
      Object[] var10048 = Registry.emptyArgs();
      long var128 = 306266403902896148L;
      Object[] var127 = var10048;
      Ref.h(306266403902896148L, var127, var128);
      String var10049 = (String)(Registry.emptyArgs());
      long var130 = 392686248093970107L;
      Object[] var129 = var10049;
      var10049 = Ref.h(392686248093970107L, var129, var130);

      try {
         var10049 = (String)var10049;
      } catch (InvocationTargetException var213) {
         throw var213.getTargetException();
      }

      String var22 = var10049;
      T32 var23 = null;
      ArrayList var10050 = (ArrayList)(Registry.emptyArgs());
      long var132 = 518875030097846779L;
      Object[] var131 = var10050;
      var10050 = Ref.h(518875030097846779L, var131, var132);

      try {
         var10050 = (ArrayList)var10050;
      } catch (InvocationTargetException var212) {
         throw var212.getTargetException();
      }

      label292: {
         ArrayList var24 = var10050;
         if (var24 != null) {
            int var25 = 0;

            while (var25 < var24.size()) {
               Li4 var26 = (Li4)var24.get(var25);
               Copy3 var27 = new Copy3(this, var26);
               Object var133 = 220282364724549275L;
               Ref.g(220282364724549275L, var133);
               Object[] var10054 = Registry.emptyArgs();
               long var136 = 286931176286176762L;
               Object[] var135 = var10054;
               T32 var10053 = (T32)(Registry.packArgs(var26, Ref.h(286931176286176762L, var135, var136)));
               long var138 = 407014907239672455L;
               Object[] var137 = var10053;
               var10053 = Ref.h(407014907239672455L, var137, var138);

               try {
                  var10053 = (T32)var10053;
               } catch (InvocationTargetException var210) {
                  throw var210.getTargetException();
               }

               T32 var28 = var10053;
               var10054 = Registry.packArgs(var26);
               long var140 = 276170834929945961L;
               Object[] var139 = var10054;
               Ref.h(276170834929945961L, var139, var140);

               try {
                  ;
               } catch (InvocationTargetException var209) {
                  throw var209.getTargetException();
               }

               if (var2 != null) {
                  break label292;
               }

               if (var2 == null) {
                  String var10055 = (String)(Registry.emptyArgs());
                  long var142 = 194080076253066315L;
                  Object[] var141 = var10055;
                  var10055 = Ref.h(194080076253066315L, var141, var142);

                  try {
                     var10055 = (String)var10055;
                  } catch (InvocationTargetException var211) {
                     throw var211.getTargetException();
                  }

                  if (var10055.equals(var22)) {
                     var23 = var28;
                     long var144 = 571979224017632290L;
                     Ref.s(571979224017632290L, var28, var144);
                  }

                  var25++;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         if (var23 != null) {
            Object var145 = 220282364724549275L;
            Ref.g(220282364724549275L, var145);
            Object[] var10052 = Registry.packArgs(var23);
            long var148 = 176011466134249595L;
            Object[] var147 = var10052;
            Ref.h(176011466134249595L, var147, var148);

            try {
               ;
            } catch (InvocationTargetException var208) {
               throw var208.getTargetException();
            }

            Object[] var257 = Registry.packArgs(var23);
            long var150 = 357321015215036950L;
            Object[] var149 = var257;
            Ref.h(357321015215036950L, var149, var150);

            try {
               ;
            } catch (InvocationTargetException var207) {
               throw var207.getTargetException();
            }
         }

         Object var151 = 220282364724549275L;
         Ref.g(220282364724549275L, var151);
         Object[] var258 = Registry.emptyArgs();
         long var154 = 435326248614032175L;
         Object[] var153 = var258;
         var258 = Ref.h(435326248614032175L, var153, var154);
         long var156 = 132722259088033339L;
         Object var155 = var258;
         Ref.s(132722259088033339L, var155, var156);
         Object var157 = 132722259088033339L;
         ((Ge2)Ref.g(132722259088033339L, var157)).setOpaque(false);
         JScrollPane var10056;
         Object var159 = 132722259088033339L;
         super((Ge2)Ref.g(132722259088033339L, var159));
         long var162 = 544586534803602568L;
         JScrollPane var161 = var10056;
         Ref.s(544586534803602568L, var161, var162);
         Object var163 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var163)).setOpaque(false);
         Object var165 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var165)).getViewport().setOpaque(false);
         Object var167 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var167))
            .setBorder(
               BorderFactory.createLineBorder(new Color(a(7959, 2766375006535222183L), a(7959, 2766375006535222183L), a(7959, 2766375006535222183L)), 1)
            );
         Object var169 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var169)).getVerticalScrollBar().setUnitIncrement(a(7017, 7518903384784373714L));
         Object var171 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var171)).setHorizontalScrollBarPolicy(a(16351, 6289341594541630318L));
         Object var173 = 544586534803602568L;
         ((JScrollPane)Ref.g(544586534803602568L, var173)).addComponentListener(new LX(this));
         Object var175 = 390502927378779445L;
         JPanel var10063 = (JPanel)Ref.g(390502927378779445L, var175);
         Object var177 = 544586534803602568L;
         this.add((JScrollPane)Ref.g(544586534803602568L, var177), a(-20359, 7796));
         Object var179 = 220282364724549275L;
         Ref.g(220282364724549275L, var179);
         Object var181 = 544586534803602568L;
         Object[] var10067 = Registry.packArgs(Ref.g(544586534803602568L, var181));
         long var184 = 418459409428567221L;
         Object[] var183 = var10067;
         Ref.h(418459409428567221L, var183, var184);

         try {
            ;
         } catch (InvocationTargetException var206) {
            throw var206.getTargetException();
         }
      }

      JPanel var225 = new JPanel(new MigLayout(a(-20403, 20874), "", a(-20409, 8174)));
      var225.setOpaque(false);
      var225.add(new JLabel(a(-20389, 27847)));
      JComboBox var226 = new JComboBox();
      var226.setOpaque(false);
      var226.addItem(a(-20399, -9611));
      var226.addItem(a(-20416, -26628));
      Integer var10068 = (Integer)(Registry.emptyArgs());
      long var186 = 579797607180676881L;
      Object[] var185 = var10068;
      var10068 = Ref.h(579797607180676881L, var185, var186);

      try {
         var10068 = (Integer)var10068;
      } catch (InvocationTargetException var205) {
         throw var205.getTargetException();
      }

      label251: {
         int var10069 = 1;
         if (var2 == null) {
            if (var10068 == 1) {
               var226.setSelectedIndex(0);
               if (var2 == null) {
                  break label251;
               }
            }

            var10068 = var3;
            Object[] var265 = Registry.emptyArgs();
            long var188 = 579797607180676881L;
            Object[] var187 = var265;
            Object var266 = Ref.h(579797607180676881L, var187, var188);

            try {
               var10069 = (Integer)var266;
            } catch (InvocationTargetException var204) {
               throw var204.getTargetException();
            }

            byte var10070 = 2;
         }

         if (var10068 == var10069) {
            var226.setSelectedIndex(1);
         }
      }

      var226.addActionListener(new L23(this, var226));
      var225.add(var226);
      JButton var227 = new JButton(a(-20365, 30310));
      var227.setMargin(new Insets(2, a(12698, 3062732849082772792L), 2, a(12698, 3062732849082772792L)));
      var225.add(var227);
      var227.addActionListener(new Bm4(this));
      Object var189 = 265429771357654528L;
      ((JPanel)Ref.g(265429771357654528L, var189)).add(var225, a(-20408, 15234));
      Object[] var267 = Registry.emptyArgs();
      long var192 = 608567651342586873L;
      Object[] var191 = var267;
      Ref.h(608567651342586873L, var191, var192);

      try {
         ;
      } catch (InvocationTargetException var203) {
         throw var203.getTargetException();
      }

      Object var193 = 256433469970092898L;
      JSplitPane var10071 = (JSplitPane)Ref.g(256433469970092898L, var193);
      Object[] var10073 = Registry.emptyArgs();
      long var196 = 552368665913993587L;
      Object[] var195 = var10073;
      var10073 = Ref.h(552368665913993587L, var195, var196);

      try {
         var269 = (Integer)var10073;
      } catch (InvocationTargetException var202) {
         throw var202.getTargetException();
      }

      var3.setDividerLocation(var269);
      Registry.emptyArgs();
      long var197 = 270389152141252877L;
      Ref.h2(270389152141252877L, var197);
      Object[] var10074 = Registry.packArgs(this);
      long var200 = 459969040127248336L;
      Object[] var199 = var10074;
      Ref.h(459969040127248336L, var199, var200);

      try {
         ;
      } catch (InvocationTargetException var201) {
         throw var201.getTargetException();
      }
   }

   public void n() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.packArgs(this);
      long var4 = 390922222656242580L;
      Object[] var3 = var10002;
      Ref.h(390922222656242580L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Registry.packArgs(this);
      long var5 = 242617331513341262L;
      Ref.h2(242617331513341262L, var5);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var8 = 518755539737989671L;
      Object[] var7 = var10004;
      Ref.h(518755539737989671L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public boolean l$boolean() {
      return Registry.lookupField(490286977843074498L).getBoolean(this);
   }

   public void g$void() {
      Registry.lookupField(490286977843074498L).setBoolean(this, true);
      Object var1 = 265429771357654528L;
      JPanel var10001 = (JPanel)Ref.g(265429771357654528L, var1);
      Object var3 = 499934073596807594L;
      this.add((EditPanel)Ref.g(499934073596807594L, var3), a(-20353, 7268), 1);
      this.validate();
      this.repaint();
   }

   public void u(Lj4_2 var1) {
      Y();
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
      Ref.h(226341449505323490L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      Registry.emptyArgs();
      long var20 = 270389152141252877L;
      Ref.h2(270389152141252877L, var20);
      U62 var10007 = (U62)(Registry.emptyArgs());
      long var23 = 306266403902896148L;
      Object[] var22 = var10007;
      var10007 = Ref.h(306266403902896148L, var22, var23);

      try {
         var10007 = (U62)var10007;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      U62 var4 = var10007;
      ConnectionProperty var10008 = (ConnectionProperty)(Registry.emptyArgs());
      long var25 = 179934491990092343L;
      Object[] var24 = var10008;
      var10008 = Ref.h(179934491990092343L, var24, var25);

      try {
         var10008 = (ConnectionProperty)var10008;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      ConnectionProperty var5 = var10008;
      Object[] var10010 = Registry.emptyArgs();
      long var27 = 299075327592978837L;
      Object[] var26 = var10010;
      var10010 = Ref.h(299075327592978837L, var26, var27);
      String var10011 = (String)(Registry.emptyArgs());
      long var29 = 311960122574804250L;
      Object[] var28 = var10011;
      var10011 = Registry.packArgs(Ref.h(311960122574804250L, var28, var29));
      long var31 = 241545340359946271L;
      Object[] var30 = var10011;
      var10011 = Ref.h(241545340359946271L, var30, var31);

      try {
         var10011 = (String)var10011;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      String var6 = var10011;
      Object var2 = var10010;
      var10011 = Registry.emptyArgs();
      long var33 = 579797607180676881L;
      Object[] var32 = var10011;
      var10011 = Ref.h(579797607180676881L, var32, var33);

      try {
         var10011 = (Integer)var10011;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      int var10012 = Registry.lookupField(467635188979611528L).getInt(null);
      if (var2 == null) {
         if (var10011 == var10012) {
            Object[] var68 = Registry.emptyArgs();
            long var35 = 179934491990092343L;
            Object[] var34 = var68;
            Object var69 = Ref.h(179934491990092343L, var34, var35);

            try {
               var70 = (ConnectionProperty)var69;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            label145: {
               ConnectionProperty var7 = var70;
               ConnectionProperty var71 = var7;
               if (var2 == null) {
                  if (var7 == null) {
                     break label145;
                  }

                  var71 = var5;
               }

               Object var8 = var71.equals(var7);
               ConnectHost var9 = var7.s$Fv_2().e();
               if (var9.t$boolean()) {
                  var7.O$pA_3();
                  String var10013 = var6.toString();
                  Object[] var10016 = Registry.emptyArgs();
                  long var37 = 135618565837694791L;
                  Object[] var36 = var10016;
                  var10016 = Ref.h(135618565837694791L, var36, var37);

                  try {
                     var79 = (Boolean)var10016;
                  } catch (InvocationTargetException var47) {
                     throw var47.getTargetException();
                  }

                  var10013.v((String)var8, (boolean)var1, var79);
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var10011 = var4;
         Object[] var72 = Registry.emptyArgs();
         long var39 = 579797607180676881L;
         Object[] var38 = var72;
         Object var73 = Ref.h(579797607180676881L, var38, var39);

         try {
            var10012 = (Integer)var73;
         } catch (InvocationTargetException var46) {
            throw var46.getTargetException();
         }

         Registry.lookupField(472725359540387970L).getInt(null);
      }

      if (var10011 == var10012) {
         Object[] var74 = Registry.emptyArgs();
         long var41 = 562853838685452383L;
         Object[] var40 = var74;
         Object var75 = Ref.h(562853838685452383L, var40, var41);

         try {
            var76 = (ArrayList)var75;
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }

         for (ConnectionProperty var56 : var76) {
            label130: {
               ConnectionProperty var77 = var56;
               if (var2 == null) {
                  if (var56 == null) {
                     break label130;
                  }

                  var77 = var5;
               }

               Object var10 = var77.equals(var56);
               ConnectHost var11 = var56.s$Fv_2().e();
               if (var11.t$boolean()) {
                  var56.O$pA_3();
                  Object[] var80 = Registry.emptyArgs();
                  long var43 = 135618565837694791L;
                  Object[] var42 = var80;
                  var80 = Ref.h(135618565837694791L, var42, var43);

                  try {
                     var82 = (Boolean)var80;
                  } catch (InvocationTargetException var44) {
                     throw var44.getTargetException();
                  }

                  var6.v((String)var10, (boolean)var1, var82);
               }
            }

            if (var2 != null) {
               break;
            }
         }
      }
   }

   void R() {
      Y();
      Object var2 = 499934073596807594L;
      Ref.g(499934073596807594L, var2);
      Object var4 = 448526077136728943L;
      Object[] var10004 = Registry.packArgs(Ref.g(448526077136728943L, var4));
      long var7 = 481489239624270930L;
      Object[] var6 = var10004;
      Ref.h(481489239624270930L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      if (this == null) {
         Object var8 = 152428484444415463L;
         if ((Lj4_2)Ref.g(152428484444415463L, var8) == null) {
            return;
         }
      }

      Object var10 = 499934073596807594L;
      Ref.g(499934073596807594L, var10);
      Object var12 = 152428484444415463L;
      Object[] var10006 = Registry.packArgs(Ref.g(152428484444415463L, var12));
      long var15 = 233540561683029566L;
      Object[] var14 = var10006;
      Ref.h(233540561683029566L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void t() {
      Registry.lookupField(490286977843074498L).setBoolean(this, false);
      Object var1 = 265429771357654528L;
      JPanel var10001 = (JPanel)Ref.g(265429771357654528L, var1);
      Object var3 = 499934073596807594L;
      this.remove((EditPanel)Ref.g(499934073596807594L, var3));
      this.validate();
   }

   public void f(Lj4_2 var1) {
      label43: {
         int[] var2 = Y();
         if (var2 == null) {
            long var4 = 152428484444415463L;
            Ref.s(152428484444415463L, var1, var4);
            Object[] var10002 = Registry.emptyArgs();
            long var6 = 194080076253066315L;
            Object[] var5 = var10002;
            Ref.h(194080076253066315L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            Object var7 = 127006560398762220L;
            if (this.equals((String)Ref.g(127006560398762220L, var7))) {
               break label43;
            }
         }

         Object[] var10001 = Registry.emptyArgs();
         long var10 = 212885583671664730L;
         Object[] var9 = var10001;
         Ref.h(212885583671664730L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }
      }

      Object[] var20 = Registry.emptyArgs();
      long var12 = 150455284980691365L;
      Object[] var11 = var20;
      Ref.h(150455284980691365L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var14 = 194080076253066315L;
      Object[] var13 = var10004;
      var10004 = Ref.h(194080076253066315L, var13, var14);
      long var16 = 127006560398762220L;
      Object var15 = var10004;
      Ref.s(127006560398762220L, var15, var16);
   }

   void o() {
      Y();
      Registry.emptyArgs();
      long var17 = 270389152141252877L;
      Ref.h2(270389152141252877L, var17);
      Object[] var10003 = Registry.emptyArgs();
      long var20 = 306266403902896148L;
      Object[] var19 = var10003;
      Ref.h(306266403902896148L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var96) {
         throw var96.getTargetException();
      }

      Object var21 = 220282364724549275L;
      Object var10004 = Ref.g(220282364724549275L, var21);
      ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
      long var24 = 230171768324088030L;
      Object[] var23 = var10005;
      var10005 = Ref.h(230171768324088030L, var23, var24);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var95) {
         throw var95.getTargetException();
      }

      ArrayList var3 = var10005;
      Iterator var4 = var3.iterator();
      Object var1 = var10004;

      while (true) {
         if (var4.hasNext()) {
            T32 var5 = (T32)var4.next();
            var10005 = Registry.emptyArgs();
            long var26 = 424156930953488367L;
            Object[] var25 = var10005;
            Copy3 var6 = (Copy3)Ref.h(424156930953488367L, var25, var26);
            Object[] var10006 = Registry.emptyArgs();
            long var28 = 358371840708368096L;
            Object[] var27 = var10006;
            Ref.h(358371840708368096L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }

            if (var1 != null) {
               break;
            }

            Object[] var10007 = Registry.emptyArgs();
            long var30 = 409034760944520307L;
            Object[] var29 = var10007;
            Ref.h(409034760944520307L, var29, var30);

            try {
               ;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var31 = 220282364724549275L;
         AM var102 = (AM)Ref.g(220282364724549275L, var31);
         break;
      }

      Object[] var103 = Registry.emptyArgs();
      long var34 = 194560825135347400L;
      Object[] var33 = var103;
      Ref.h(194560825135347400L, var33, var34);
      Object[] var104 = Registry.emptyArgs();
      long var36 = 424156930953488367L;
      Object[] var35 = var104;
      Copy3 var97 = (Copy3)Ref.h(424156930953488367L, var35, var36);
      Object[] var10008 = Registry.emptyArgs();
      long var38 = 183035319181805634L;
      Object[] var37 = var10008;
      Ref.h(183035319181805634L, var37, var38);
      Object[] var10009 = Registry.emptyArgs();
      long var40 = 194080076253066315L;
      Object[] var39 = var10009;
      Ref.h(194080076253066315L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var92) {
         throw var92.getTargetException();
      }

      Object var41 = 220282364724549275L;
      Ref.g(220282364724549275L, var41);
      Object[] var10011 = Registry.emptyArgs();
      long var44 = 409034760944520307L;
      Object[] var43 = var10011;
      Ref.h(409034760944520307L, var43, var44);

      try {
         ;
      } catch (InvocationTargetException var91) {
         throw var91.getTargetException();
      }

      Object var98 = null;
      ArrayList var10012 = (ArrayList)(Registry.emptyArgs());
      long var46 = 518875030097846779L;
      Object[] var45 = var10012;
      var10012 = Ref.h(518875030097846779L, var45, var46);

      try {
         var10012 = (ArrayList)var10012;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      label239: {
         label222: {
            ArrayList var7 = var10012;
            boolean var8 = false;
            T32 var9 = null;
            if (var7 != null) {
               int var10 = 0;

               while (var10 < var7.size()) {
                  var10012 = (Object[])var7.get(var10);

                  label216:
                  while (true) {
                     Li4 var11 = (Li4)var10012;
                     Copy3 var12 = new Copy3(this, var11);
                     var10012 = this;
                     Object var47 = 220282364724549275L;
                     Ref.g(220282364724549275L, var47);
                     Object[] var10016 = Registry.emptyArgs();
                     long var50 = 286931176286176762L;
                     Object[] var49 = var10016;
                     T32 var10015 = (T32)(Registry.packArgs(var11, Ref.h(286931176286176762L, var49, var50)));
                     long var52 = 407014907239672455L;
                     Object[] var51 = var10015;
                     var10015 = Ref.h(407014907239672455L, var51, var52);

                     try {
                        var10015 = (T32)var10015;
                     } catch (InvocationTargetException var89) {
                        throw var89.getTargetException();
                     }

                     label193: {
                        T32 var13 = var10015;
                        if (var1 == null) {
                           var10016 = Registry.packArgs(var11);
                           long var54 = 276170834929945961L;
                           Object[] var53 = var10016;
                           Ref.h(276170834929945961L, var53, var54);

                           try {
                              ;
                           } catch (InvocationTargetException var88) {
                              throw var88.getTargetException();
                           }

                           if (var1 != null) {
                              break label222;
                           }

                           Object[] var10018 = Registry.emptyArgs();
                           long var56 = 183035319181805634L;
                           Object[] var55 = var10018;
                           var10018 = Ref.h(183035319181805634L, var55, var56);
                           String var10019 = (String)(Registry.emptyArgs());
                           long var58 = 194080076253066315L;
                           Object[] var57 = var10019;
                           var10019 = Ref.h(194080076253066315L, var57, var58);

                           try {
                              var10019 = (String)var10019;
                           } catch (InvocationTargetException var87) {
                              throw var87.getTargetException();
                           }

                           if (var10018 != var10019) {
                              break label193;
                           }
                        }

                        var9 = var13;
                     }

                     var10016 = Registry.emptyArgs();
                     long var60 = 408177353860141270L;
                     Object[] var59 = var10016;
                     var10016 = Ref.h(408177353860141270L, var59, var60);

                     try {
                        var10016 = (ArrayList)var10016;
                     } catch (InvocationTargetException var86) {
                        throw var86.getTargetException();
                     }

                     ArrayList var14 = var10016;
                     Iterator var15 = var14.iterator();

                     while (true) {
                        if (!var15.hasNext()) {
                           break label216;
                        }

                        Lj4_2 var16 = (Lj4_2)var15.next();
                        Object var61 = 152428484444415463L;
                        Lj4_2 var10017 = (Lj4_2)Ref.g(152428484444415463L, var61);
                        if (var1 != null) {
                           break;
                        }

                        label211: {
                           label244: {
                              if (var1 == null) {
                                 if (var10017 == null) {
                                    break label211;
                                 }

                                 if (var1 != null) {
                                    break label244;
                                 }

                                 Object var63 = 152428484444415463L;
                                 Lj4_2 var117 = (Lj4_2)Ref.g(152428484444415463L, var63);
                              }

                              Object[] var118 = Registry.emptyArgs();
                              long var66 = 194080076253066315L;
                              Object[] var65 = var118;
                              Ref.h(194080076253066315L, var65, var66);

                              try {
                                 ;
                              } catch (InvocationTargetException var85) {
                                 throw var85.getTargetException();
                              }

                              String var10020 = (String)(Registry.emptyArgs());
                              long var68 = 194080076253066315L;
                              Object[] var67 = var10020;
                              var10020 = Ref.h(194080076253066315L, var67, var68);

                              try {
                                 var10020 = (String)var10020;
                              } catch (InvocationTargetException var84) {
                                 throw var84.getTargetException();
                              }

                              if (!var16.equals(var10020)) {
                                 break label211;
                              }
                           }

                           long var70 = 152428484444415463L;
                           Ref.s(152428484444415463L, var16, var70);
                        }

                        if (var1 != null) {
                           break label216;
                        }
                     }
                  }

                  var10++;
                  if (var1 != null) {
                     break;
                  }
               }
            }

            if (var9 != null) {
               Object var71 = 220282364724549275L;
               Ref.g(220282364724549275L, var71);
               Object[] var10014 = Registry.packArgs(var9);
               long var74 = 176011466134249595L;
               Object[] var73 = var10014;
               Ref.h(176011466134249595L, var73, var74);

               try {
                  ;
               } catch (InvocationTargetException var83) {
                  throw var83.getTargetException();
               }

               if (var1 == null) {
                  break label239;
               }
            }
         }

         Object var75 = 220282364724549275L;
         Ref.g(220282364724549275L, var75);
         Object[] var108 = Registry.packArgs(0);
         long var78 = 451518351793196330L;
         Object[] var77 = var108;
         Ref.h(451518351793196330L, var77, var78);

         try {
            ;
         } catch (InvocationTargetException var82) {
            throw var82.getTargetException();
         }
      }

      Object[] var111 = Registry.emptyArgs();
      long var80 = 212885583671664730L;
      Object[] var79 = var111;
      Ref.h(212885583671664730L, var79, var80);

      try {
         ;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }
   }

   void x() {
      Object var11 = 165605583887724001L;
      String var2 = ((JTextArea)Ref.g(165605583887724001L, var11)).getText();
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10003 = Registry.emptyArgs();
      long var16 = 634817973682994708L;
      Object[] var15 = var10003;
      Ref.h(634817973682994708L, var15, var16);
      Object[] var10004 = Registry.emptyArgs();
      long var18 = 240567170779145617L;
      Object[] var17 = var10004;
      Ref.h(240567170779145617L, var17, var18);
      Object[] var10005 = Registry.emptyArgs();
      long var20 = 226341449505323490L;
      Object[] var19 = var10005;
      var10005 = Ref.h(226341449505323490L, var19, var20);

      try {
         var10005 = (com.finalshell.ui.frame.U)var10005;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }

      com.finalshell.ui.frame.U var3 = var10005;
      Registry.emptyArgs();
      long var21 = 270389152141252877L;
      Ref.h2(270389152141252877L, var21);
      U62 var10007 = (U62)(Registry.emptyArgs());
      long var24 = 306266403902896148L;
      Object[] var23 = var10007;
      var10007 = Ref.h(306266403902896148L, var23, var24);

      try {
         var10007 = (U62)var10007;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      U62 var4 = var10007;
      Y();
      ConnectionProperty var10009 = (ConnectionProperty)(Registry.emptyArgs());
      long var26 = 179934491990092343L;
      Object[] var25 = var10009;
      var10009 = Ref.h(179934491990092343L, var25, var26);

      try {
         var10009 = (ConnectionProperty)var10009;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      ConnectionProperty var5 = var10009;
      com.finalshell.ui.frame.U var1 = var3;
      var10009 = Registry.emptyArgs();
      long var28 = 165950045643857861L;
      Object[] var27 = var10009;
      var10009 = Ref.h(165950045643857861L, var27, var28);

      try {
         var10009 = (Integer)var10009;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      long var10012;
      label150: {
         label144: {
            int var10010 = Registry.lookupField(467635188979611528L).getInt(null);
            if (var3 == null) {
               if (var10009 == var10010) {
                  Object[] var67 = Registry.emptyArgs();
                  long var30 = 179934491990092343L;
                  Object[] var29 = var67;
                  Object var68 = Ref.h(179934491990092343L, var29, var30);

                  try {
                     var69 = (ConnectionProperty)var68;
                  } catch (InvocationTargetException var50) {
                     throw var50.getTargetException();
                  }

                  label139: {
                     ConnectionProperty var6 = var69;
                     ConnectionProperty var70 = var6;
                     if (var3 == null) {
                        if (var6 == null) {
                           break label139;
                        }

                        var70 = var5;
                     }

                     Object var7 = var70.equals(var6);
                     ConnectHost var8 = var6.s$Fv_2().e();
                     if (var8.t$boolean()) {
                        var6.O$pA_3();
                        Object var31 = 274811053631936956L;
                        var2.v((String)var7, (boolean)this, ((JCheckBoxMenuItem)Ref.g(274811053631936956L, var31)).isSelected());
                     }
                  }

                  if (var3 == null) {
                     break label144;
                  }
               }

               var10009 = var4;
               Object[] var71 = Registry.emptyArgs();
               long var34 = 165950045643857861L;
               Object[] var33 = var71;
               var10012 = var34;
               Object var72 = Ref.h(165950045643857861L, var33, var34);

               try {
                  var10010 = (Integer)var72;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }

               if (var3 != null) {
                  break label150;
               }

               Registry.lookupField(472725359540387970L).getInt(null);
            }

            if (var10009 == var10010) {
               Object[] var73 = Registry.emptyArgs();
               long var36 = 562853838685452383L;
               Object[] var35 = var73;
               Object var74 = Ref.h(562853838685452383L, var35, var36);

               try {
                  var75 = (ArrayList)var74;
               } catch (InvocationTargetException var48) {
                  throw var48.getTargetException();
               }

               for (ConnectionProperty var57 : var75) {
                  if (var1 != null) {
                     return;
                  }

                  label124: {
                     ConnectionProperty var76 = var57;
                     if (var1 == null) {
                        if (var57 == null) {
                           break label124;
                        }

                        var76 = var5;
                     }

                     Object var9 = var76.equals(var57);
                     ConnectHost var10 = var57.s$Fv_2().e();
                     if (var10.t$boolean()) {
                        var57.O$pA_3();
                        Object var37 = 274811053631936956L;
                        var2.v((String)var9, (boolean)this, ((JCheckBoxMenuItem)Ref.g(274811053631936956L, var37)).isSelected());
                     }
                  }

                  if (var1 != null) {
                     break;
                  }
               }
            }
         }

         Registry.emptyArgs();
         long var39 = 270389152141252877L;
         Ref.h2(270389152141252877L, var39);
         Object[] var10011 = Registry.emptyArgs();
         long var42 = 306266403902896148L;
         Object[] var41 = var10011;
         Ref.h(306266403902896148L, var41, var42);
         Object[] var77 = Registry.emptyArgs();
         long var44 = 575356025127634892L;
         Object[] var43 = var77;
         Object var78 = Ref.h(575356025127634892L, var43, var44);

         try {
            var10012 = (long)(Boolean)var78;
         } catch (InvocationTargetException var47) {
            throw var47.getTargetException();
         }
      }

      if (var10012 != false) {
         Object var45 = 165605583887724001L;
         ((JTextArea)Ref.g(165605583887724001L, var45)).setText("");
      }
   }

   void d() {
      int[] var1 = Y();
      Object var4 = 544586534803602568L;
      Object var10001 = (JScrollPane)Ref.g(544586534803602568L, var4);
      if (var1 == null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var6 = 544586534803602568L;
         JScrollPane var10002 = (JScrollPane)Ref.g(544586534803602568L, var6);
      }

      Dimension var2 = var10001.getSize();
      Object var8 = 544586534803602568L;
      var2.width.width = this - ((JScrollPane)Ref.g(544586534803602568L, var8)).getVerticalScrollBar().getWidth();
      Object var10 = 132722259088033339L;
      ((Ge2)Ref.g(132722259088033339L, var10)).setPreferredSize(var2);
      Object var12 = 132722259088033339L;
      ((Ge2)Ref.g(132722259088033339L, var12)).setSize(var2);
      Object var14 = 220282364724549275L;
      Ref.g(220282364724549275L, var14);
      Object[] var10006 = Registry.emptyArgs();
      long var17 = 194560825135347400L;
      Object[] var16 = var10006;
      Ref.h(194560825135347400L, var16, var17);
      Object[] var10007 = Registry.emptyArgs();
      long var19 = 424156930953488367L;
      Object[] var18 = var10007;
      Copy3 var3 = (Copy3)Ref.h(424156930953488367L, var18, var19);
      var2.height = a(4391, 7430188607703190936L);
   }

   void z() {
      Ty4 var1 = new Ty4(Registry.lookupField(412252850898252674L).getInt(null));
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 473928376202613579L;
      Object[] var4 = var10002;
      Ref.h(473928376202613579L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   void E() {
      Ty4 var1 = new Ty4(Registry.lookupField(494664326722011331L).getInt(null));
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 473928376202613579L;
      Object[] var4 = var10002;
      Ref.h(473928376202613579L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public AM l$aM() {
      Object var1 = 220282364724549275L;
      return (AM)Ref.g(220282364724549275L, var1);
   }

   public void w(AM var1) {
      long var3 = 220282364724549275L;
      Ref.s(220282364724549275L, var1, var3);
   }

   public Copy3 g(String var1) {
      Copy3 var3 = null;
      Object var8 = 220282364724549275L;
      Ref.g(220282364724549275L, var8);
      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var11 = 230171768324088030L;
      Object[] var10 = var10002;
      var10002 = Ref.h(230171768324088030L, var10, var11);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      ArrayList var4 = var10002;
      int[] var22 = Y();
      Iterator var5 = var4.iterator();
      int[] var2 = var22;

      while (var5.hasNext()) {
         T32 var6 = (T32)var5.next();
         Object[] var10003 = Registry.emptyArgs();
         long var13 = 424156930953488367L;
         Object[] var12 = var10003;
         Copy3 var7 = (Copy3)Ref.h(424156930953488367L, var12, var13);
         if (var2 == null) {
            Object[] var10004 = Registry.emptyArgs();
            long var15 = 183035319181805634L;
            Object[] var14 = var10004;
            Ref.h(183035319181805634L, var14, var15);
            String var10005 = (String)(Registry.emptyArgs());
            long var17 = 194080076253066315L;
            Object[] var16 = var10005;
            var10005 = Ref.h(194080076253066315L, var16, var17);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            if (!var10005.equals(var1)) {
               continue;
            }
         }

         var3 = var7;
         break;
      }

      return var3;
   }

   void e(String var1) {
      Li4 var2 = new Li4();
      Object[] var10001 = Registry.packArgs(var1);
      long var8 = 193904661956891993L;
      Object[] var7 = var10001;
      Ref.h(193904661956891993L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var10 = 418850269901941975L;
      Object[] var9 = var10002;
      var10002 = Ref.h(418850269901941975L, var9, var10);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      ArrayList var3 = var10002;
      Li4 var4 = (Li4)var3.get(var3.size() - 1);
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 145535910876897139L;
      Object[] var11 = var10004;
      var10004 = Ref.h(145535910876897139L, var11, var12);

      try {
         var50 = (Integer)var10004;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Registry.packArgs(var50);
      long var13 = 153746706510242688L;
      Object var10005 = Ref.h2(153746706510242688L, var13);

      try {
         var51 = (Integer)var10005;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      var10005 = Registry.packArgs(var51);
      long var16 = 470936572593593753L;
      Object[] var15 = (Object[])var10005;
      Ref.h(470936572593593753L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.emptyArgs();
      long var17 = 270389152141252877L;
      Ref.h2(270389152141252877L, var17);
      Object[] var10007 = Registry.emptyArgs();
      long var20 = 306266403902896148L;
      Object[] var19 = var10007;
      Ref.h(306266403902896148L, var19, var20);
      ArrayList var10008 = Registry.emptyArgs();
      long var22 = 518875030097846779L;
      Object[] var21 = var10008;
      var10008 = Ref.h(518875030097846779L, var21, var22);

      try {
         var10008 = (ArrayList)var10008;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      var10008.add(var2);
      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object[] var10010 = Registry.emptyArgs();
      long var26 = 578864097947885485L;
      Object[] var25 = var10010;
      Ref.h(578864097947885485L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Copy3 var5 = new Copy3(this, var2);
      Object var27 = 220282364724549275L;
      Ref.g(220282364724549275L, var27);
      Object[] var10014 = Registry.emptyArgs();
      long var30 = 286931176286176762L;
      Object[] var29 = var10014;
      Object[] var10013 = Registry.packArgs(var2, Ref.h(286931176286176762L, var29, var30));
      long var32 = 407014907239672455L;
      Object[] var31 = var10013;
      Ref.h(407014907239672455L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      var10014 = Registry.packArgs(var2);
      long var34 = 276170834929945961L;
      Object[] var33 = var10014;
      Ref.h(276170834929945961L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object[] var10015 = Registry.emptyArgs();
      long var36 = 254774089477135261L;
      Object[] var35 = var10015;
      Ref.h(254774089477135261L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }
   }

   void F(T32 var1, Li4 var2, String var3) {
      Object[] var10001 = Registry.packArgs(var3);
      long var6 = 193904661956891993L;
      Object[] var5 = var10001;
      Ref.h(193904661956891993L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10003 = Registry.emptyArgs();
      long var10 = 306266403902896148L;
      Object[] var9 = var10003;
      Ref.h(306266403902896148L, var9, var10);
      Li4 var10005 = (Li4)(Registry.emptyArgs());
      long var12 = 194080076253066315L;
      Object[] var11 = var10005;
      var10005 = Registry.packArgs(Ref.h(194080076253066315L, var11, var12));
      long var14 = 233092091994680304L;
      Object[] var13 = var10005;
      var10005 = Ref.h(233092091994680304L, var13, var14);

      try {
         var10005 = (Li4)var10005;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Li4 var4 = var10005;
      Object[] var10006 = Registry.e(System.currentTimeMillis());
      long var16 = 379623615202365815L;
      Object[] var15 = var10006;
      Ref.h(379623615202365815L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      Object[] var10007 = Registry.packArgs(var3);
      long var18 = 193904661956891993L;
      Object[] var17 = var10007;
      Ref.h(193904661956891993L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object[] var10008 = Registry.packArgs(var3);
      long var20 = 519460332647460288L;
      Object[] var19 = var10008;
      Ref.h(519460332647460288L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object[] var10009 = Registry.packArgs(var4);
      long var22 = 276170834929945961L;
      Object[] var21 = var10009;
      Ref.h(276170834929945961L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object[] var10011 = Registry.emptyArgs();
      long var26 = 578864097947885485L;
      Object[] var25 = var10011;
      Ref.h(578864097947885485L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Object[] var10012 = Registry.emptyArgs();
      long var28 = 584096728105558414L;
      Object[] var27 = var10012;
      Ref.h(584096728105558414L, var27, var28);
      Object[] var10013 = Registry.packArgs(var1);
      long var30 = 379860037679905473L;
      Object[] var29 = var10013;
      Ref.h(379860037679905473L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      Object[] var10014 = Registry.emptyArgs();
      long var32 = 254774089477135261L;
      Object[] var31 = var10014;
      Ref.h(254774089477135261L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }
   }

   public void H() {
      new RenameFolderDialog(this, false, null);
   }

   public void s(T32 var1) {
      new RenameFolderDialog(this, true, var1);
   }

   public void C(T32 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 348047003824927685L;
      Object[] var3 = var10001;
      Li4 var2 = (Li4)Ref.h(348047003824927685L, var3, var4);
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      Ref.h(306266403902896148L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 194080076253066315L;
      Object[] var9 = var10005;
      var10005 = Registry.packArgs(Ref.h(194080076253066315L, var9, var10));
      long var12 = 247075554724088452L;
      Object[] var11 = var10005;
      Ref.h(247075554724088452L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 578864097947885485L;
      Object[] var15 = var10007;
      Ref.h(578864097947885485L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Object var17 = 220282364724549275L;
      Ref.g(220282364724549275L, var17);
      Object[] var10009 = Registry.packArgs(var1);
      long var20 = 267026473738179692L;
      Object[] var19 = var10009;
      Ref.h(267026473738179692L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.emptyArgs();
      long var21 = 270389152141252877L;
      Ref.h2(270389152141252877L, var21);
      Object[] var10011 = Registry.emptyArgs();
      long var24 = 445913128761932285L;
      Object[] var23 = var10011;
      Ref.h(445913128761932285L, var23, var24);
      Object[] var10013 = Registry.emptyArgs();
      long var26 = 194080076253066315L;
      Object[] var25 = var10013;
      Ref.h(194080076253066315L, var25, var26);
      Object[] var10015 = Registry.emptyArgs();
      long var28 = 286931176286176762L;
      Object[] var27 = var10015;
      Object[] var10014 = Registry.packArgs(var2, Ref.h(286931176286176762L, var27, var28), Registry.lookupField(213538898722647981L).getInt(null));
      long var30 = 200839191777796316L;
      Object[] var29 = var10014;
      Ref.h(200839191777796316L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Registry.emptyArgs();
      long var31 = 270389152141252877L;
      Ref.h2(270389152141252877L, var31);
      Object[] var10016 = Registry.emptyArgs();
      long var34 = 612604310671515822L;
      Object[] var33 = var10016;
      Ref.h(612604310671515822L, var33, var34);
      Object[] var10017 = Registry.emptyArgs();
      long var36 = 200561288808923907L;
      Object[] var35 = var10017;
      Ref.h(200561288808923907L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Object[] var10018 = Registry.emptyArgs();
      long var38 = 254774089477135261L;
      Object[] var37 = var10018;
      Ref.h(254774089477135261L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   public void S() {
      Object var2 = 220282364724549275L;
      Ref.g(220282364724549275L, var2);
      EditDialog3 var10004 = Registry.emptyArgs();
      long var5 = 194560825135347400L;
      Object[] var4 = var10004;
      var10004 = (EditDialog3)Ref.h(194560825135347400L, var4, var5);
      Object[] var10005 = Registry.emptyArgs();
      long var7 = 424156930953488367L;
      Object[] var6 = var10005;
new Insets((Copy3)Ref.h(424156930953488367L, var6, var7), false, this, null);
   }

   public void j(T32 var1) {
      Object var3 = 220282364724549275L;
      Ref.g(220282364724549275L, var3);
      EditDialog3 var10004 = Registry.emptyArgs();
      long var6 = 194560825135347400L;
      Object[] var5 = var10004;
      var10004 = (EditDialog3)Ref.h(194560825135347400L, var5, var6);
      Object[] var10005 = Registry.emptyArgs();
      long var8 = 424156930953488367L;
      Object[] var7 = var10005;
new Insets((Copy3)Ref.h(424156930953488367L, var7, var8), true, this, var1);
   }

   public void J() {
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
      boolean var15 = false;
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
      this.setBorder(var2);
   }

   public ArrayList g$ArrayList() {
      Object var11 = 220282364724549275L;
      Component[] var2 = ((AM)Ref.g(220282364724549275L, var11)).getComponents();
      ArrayList var3 = new ArrayList();
      int[] var10001 = Y();
      Component[] var4 = var2;
      int[] var1 = var10001;
      int var5 = var2.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
      JScrollPane var20;
            Component var7 = var4[var6];
            Bq2 var8 = (Bq2)var7;
            var20 = var8;
            Object[] var10002 = Registry.emptyArgs();
            long var14 = 227343441450903310L;
            Object[] var13 = var10002;
            Ref.h(227343441450903310L, var13, var14);
            Object[] var10003 = Registry.emptyArgs();
            long var16 = 424156930953488367L;
            Object[] var15 = var10003;
            Copy3 var9 = (Copy3)Ref.h(424156930953488367L, var15, var16);
            Li4 var10004 = (Li4)(Registry.emptyArgs());
            long var18 = 537700506963524298L;
            Object[] var17 = var10004;
            var10004 = Ref.h(537700506963524298L, var17, var18);

            try {
               var10004 = (Li4)var10004;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            Li4 var10 = var10004;
            if (var1 != null) {
               break;
            }

            var3.add(var10);
            var6++;
            if (var1 == null) {
      U62 var20;
               continue;
            }
         }

         var20 = var3;
         break;
      }

      return (ArrayList)var20;
   }

   void R(Y9 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var6 = 625676037677438329L;
      Object[] var5 = var10001;
      Ref.h(625676037677438329L, var5, var6);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 348047003824927685L;
      Object[] var7 = var10002;
      Li4 var2 = (Li4)Ref.h(348047003824927685L, var7, var8);
      Object var9 = 220282364724549275L;
      Component[] var3 = ((AM)Ref.g(220282364724549275L, var9)).getComponents();
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 418850269901941975L;
      Object[] var11 = var10004;
      var10004 = Ref.h(418850269901941975L, var11, var12);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      ArrayList var4 = var10004;
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10006 = Registry.emptyArgs();
      long var16 = 306266403902896148L;
      Object[] var15 = var10006;
      Ref.h(306266403902896148L, var15, var16);
      Object[] var10007 = Registry.packArgs(var4);
      long var18 = 482439858102463037L;
      Object[] var17 = var10007;
      Ref.h(482439858102463037L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      Registry.packArgs(var1, var4, var2);
      long var19 = 186563482927567915L;
      Ref.h2(186563482927567915L, var19);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      Registry.emptyArgs();
      long var21 = 270389152141252877L;
      Ref.h2(270389152141252877L, var21);
      Object[] var10010 = Registry.emptyArgs();
      long var24 = 578864097947885485L;
      Object[] var23 = var10010;
      Ref.h(578864097947885485L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      Object[] var10011 = Registry.emptyArgs();
      long var26 = 254774089477135261L;
      Object[] var25 = var10011;
      Ref.h(254774089477135261L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }
   }

   @Override
   public void P(Y9 var1) {
   }

   @Override
   public void v(Y9 var1) {
      Y();
      Object var4 = 220282364724549275L;
      Ref.g(220282364724549275L, var4);
      Object[] var10004 = Registry.emptyArgs();
      long var7 = 194560825135347400L;
      Object[] var6 = var10004;
      var10004 = Ref.h(194560825135347400L, var6, var7);
      Object[] var10005 = Registry.emptyArgs();
      long var9 = 424156930953488367L;
      Object[] var8 = var10005;
      Copy3 var46 = (Copy3)Ref.h(424156930953488367L, var8, var9);
      long var11 = 448526077136728943L;
      Copy3 var10 = var46;
      Ref.s(448526077136728943L, var10, var11);
      Object var2 = var10004;
      Object var12 = 448526077136728943L;
      Ref.g(448526077136728943L, var12);
      Object[] var10006 = Registry.emptyArgs();
      long var15 = 537700506963524298L;
      Object[] var14 = var10006;
      Ref.h(537700506963524298L, var14, var15);
      Object[] var10007 = Registry.emptyArgs();
      long var17 = 194080076253066315L;
      Object[] var16 = var10007;
      var10007 = Ref.h(194080076253066315L, var16, var17);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      String var3 = var10007;
      Registry.emptyArgs();
      long var18 = 270389152141252877L;
      Ref.h2(270389152141252877L, var18);
      Object[] var10009 = Registry.emptyArgs();
      long var21 = 306266403902896148L;
      Object[] var20 = var10009;
      Ref.h(306266403902896148L, var20, var21);
      Object[] var10010 = Registry.packArgs(var3);
      long var23 = 585163400043361868L;
      Object[] var22 = var10010;
      Ref.h(585163400043361868L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Registry.emptyArgs();
      long var24 = 270389152141252877L;
      Ref.h2(270389152141252877L, var24);
      Object[] var10012 = Registry.emptyArgs();
      long var27 = 578864097947885485L;
      Object[] var26 = var10012;
      Ref.h(578864097947885485L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      if (var2 == null) {
         Object var28 = 605695900471117140L;
         if ((Cp2)Ref.g(605695900471117140L, var28) != null) {
            Object var30 = 605695900471117140L;
            Ref.g(605695900471117140L, var30);
            Object var32 = 220282364724549275L;
            Ref.g(220282364724549275L, var32);
            Object[] var10017 = Registry.emptyArgs();
            long var35 = 194560825135347400L;
            Object[] var34 = var10017;
            var10017 = Registry.packArgs(Ref.h(194560825135347400L, var34, var35));
            long var37 = 357321015215036950L;
            Object[] var36 = var10017;
            Ref.h(357321015215036950L, var36, var37);

            try {
               ;
            } catch (InvocationTargetException var41) {
               throw var41.getTargetException();
            }
         }
      }

      Object[] var10013 = Registry.emptyArgs();
      long var39 = 363067491039837712L;
      Object[] var38 = var10013;
      Ref.h(363067491039837712L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }
   }

   @Override
   public void U(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 584516543498116581L;
      Object[] var2 = var10001;
      Ref.h(584516543498116581L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void K(Y9 var1) {
      Y();
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 446119396850912594L;
      Object[] var9 = var10002;
      var10002 = Ref.h(446119396850912594L, var9, var10);

      try {
         var10002 = (MouseEvent)var10002;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      MouseEvent var3 = var10002;
      if (var1 != null) {
         JPopupMenu var4 = new JPopupMenu();
         JMenuItem var5 = new JMenuItem(a(-20404, -28559));
         var5.addActionListener(new U7(this));
         var4.add(var5);
         JMenuItem var6 = new JMenuItem(a(-20402, 21811));
         var6.addActionListener(new VG(this));
         var4.add(var6);
         JMenuItem var7 = new JMenuItem(a(-20357, 31401));
         var7.addActionListener(new Listener(this));
         var4.add(var7);
         var4.addSeparator();
         JMenuItem var8 = new JMenuItem(a(-20397, 6215));
         var8.addActionListener(new UZ3(this));
         var4.add(var8);
         var4.show((Component)var3.getSource(), var3.getX(), var3.getY());
      } else if (var3.getButton() == 3) {
         Object var11 = 220282364724549275L;
         Ref.g(220282364724549275L, var11);
         Object[] var10004 = Registry.emptyArgs();
         long var14 = 625676037677438329L;
         Object[] var13 = var10004;
         var10004 = Registry.packArgs(Ref.h(625676037677438329L, var13, var14));
         long var16 = 176011466134249595L;
         Object[] var15 = var10004;
         Ref.h(176011466134249595L, var15, var16);

         label22:
         try {
            break label22;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }
   }

   public Cp2 c() {
      Object var1 = 605695900471117140L;
      return (Cp2)Ref.g(605695900471117140L, var1);
   }

   public void Z(Cp2 var1) {
      long var3 = 605695900471117140L;
      Ref.s(605695900471117140L, var1, var3);
   }

   public T32 r() {
      Object var1 = 571979224017632290L;
      return (T32)Ref.g(571979224017632290L, var1);
   }

   public void u(T32 var1) {
      long var3 = 571979224017632290L;
      Ref.s(571979224017632290L, var1, var3);
   }

   @Override
   public void O(Ty4 var1) {
      Ty4 var17;
      int var21;
      label59: {
         label55: {
            int[] var2 = Y();
            if (var2 == null) {
               Object[] var10001 = Registry.emptyArgs();
               long var4 = 542590257020999358L;
               Object[] var3 = var10001;
               var17 = (Ty4)Ref.h(542590257020999358L, var3, var4);

               try {
                  var16 = (Integer)var17;
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               if (var16 != Registry.lookupField(412252850898252674L).getInt(null)) {
                  var17 = var1;
                  Object[] var10002 = Registry.emptyArgs();
                  long var6 = 542590257020999358L;
                  Object[] var5 = var10002;
                  Object var20 = Ref.h(542590257020999358L, var5, var6);

                  try {
                     var21 = (Integer)var20;
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  int var10003 = Registry.lookupField(614101277846852824L).getInt(null);
                  if (var2 != null) {
                     break label59;
                  }

                  if (var21 != var10003) {
                     break label55;
                  }
               }

               Object[] var22 = Registry.emptyArgs();
               long var8 = 260667861511060696L;
               Object[] var7 = var22;
               Ref.h(260667861511060696L, var7, var8);

               try {
                  ;
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }
            }

            if (var2 == null) {
               return;
            }
         }

         Object[] var18 = Registry.emptyArgs();
         long var10 = 542590257020999358L;
         Object[] var9 = var18;
         var17 = (Ty4)Ref.h(542590257020999358L, var9, var10);

         try {
            var17 = (Integer)var17;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var21 = Registry.lookupField(494664326722011331L).getInt(null);
      }

      if (var17 == var21) {
      }
   }

   public EditPanel U() {
      Object var1 = 499934073596807594L;
      return (EditPanel)Ref.g(499934073596807594L, var1);
   }

   public void T(EditPanel var1) {
      long var3 = 499934073596807594L;
      Ref.s(499934073596807594L, var1, var3);
   }

   public Lj4_2 a() {
      Object var1 = 152428484444415463L;
      return (Lj4_2)Ref.g(152428484444415463L, var1);
   }

   public void m(Lj4_2 var1) {
      long var3 = 152428484444415463L;
      Ref.s(152428484444415463L, var1, var3);
   }

   public void y() {
      long var2 = 220282364724549275L;
      Object var1 = null;
      Ref.s(220282364724549275L, var1, var2);
      long var4 = 132722259088033339L;
      Object var3 = null;
      Ref.s(132722259088033339L, var3, var4);
      long var6 = 605695900471117140L;
      Object var5 = null;
      Ref.s(605695900471117140L, var5, var6);
      long var8 = 571979224017632290L;
      Object var7 = null;
      Ref.s(571979224017632290L, var7, var8);
      long var10 = 256433469970092898L;
      Object var9 = null;
      Ref.s(256433469970092898L, var9, var10);
      long var12 = 390502927378779445L;
      Object var11 = null;
      Ref.s(390502927378779445L, var11, var12);
      long var14 = 544586534803602568L;
      Object var13 = null;
      Ref.s(544586534803602568L, var13, var14);
      long var16 = 165605583887724001L;
      Object var15 = null;
      Ref.s(165605583887724001L, var15, var16);
      long var18 = 499934073596807594L;
      Object var17 = null;
      Ref.s(499934073596807594L, var17, var18);
      long var20 = 265429771357654528L;
      Object var19 = null;
      Ref.s(265429771357654528L, var19, var20);
      long var22 = 152428484444415463L;
      Object var21 = null;
      Ref.s(152428484444415463L, var21, var22);
      long var24 = 448526077136728943L;
      Object var23 = null;
      Ref.s(448526077136728943L, var23, var24);
      long var26 = 274811053631936956L;
      Object var25 = null;
      Ref.s(274811053631936956L, var25, var26);
      long var28 = 127006560398762220L;
      Object var27 = null;
      Ref.s(127006560398762220L, var27, var28);
   }

   public void b() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Xk2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void X(int[] var0) {
      u = var0;
   }

   public static int[] Y() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -20389) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 54;
               break;
            case 1:
               var10000 = 143;
               break;
            case 2:
               var10000 = 4;
               break;
            case 3:
               var10000 = 245;
               break;
            case 4:
               var10000 = 29;
               break;
            case 5:
               var10000 = 172;
               break;
            case 6:
               var10000 = 110;
               break;
            case 7:
               var10000 = 19;
               break;
            case 8:
               var10000 = 159;
               break;
            case 9:
               var10000 = 23;
               break;
            case 10:
               var10000 = 195;
               break;
            case 11:
               var10000 = 109;
               break;
            case 12:
               var10000 = 70;
               break;
            case 13:
               var10000 = 174;
               break;
            case 14:
               var10000 = 108;
               break;
            case 15:
               var10000 = 255;
               break;
            case 16:
               var10000 = 31;
               break;
            case 17:
               var10000 = 92;
               break;
            case 18:
               var10000 = 162;
               break;
            case 19:
               var10000 = 3;
               break;
            case 20:
               var10000 = 140;
               break;
            case 21:
               var10000 = 183;
               break;
            case 22:
               var10000 = 84;
               break;
            case 23:
               var10000 = 145;
               break;
            case 24:
               var10000 = 33;
               break;
            case 25:
               var10000 = 64;
               break;
            case 26:
               var10000 = 248;
               break;
            case 27:
               var10000 = 15;
               break;
            case 28:
               var10000 = 91;
               break;
            case 29:
               var10000 = 223;
               break;
            case 30:
               var10000 = 61;
               break;
            case 31:
               var10000 = 158;
               break;
            case 32:
               var10000 = 229;
               break;
            case 33:
               var10000 = 237;
               break;
            case 34:
               var10000 = 138;
               break;
            case 35:
               var10000 = 246;
               break;
            case 36:
               var10000 = 176;
               break;
            case 37:
               var10000 = 187;
               break;
            case 38:
               var10000 = 76;
               break;
            case 39:
               var10000 = 136;
               break;
            case 40:
               var10000 = 28;
               break;
            case 41:
               var10000 = 123;
               break;
            case 42:
               var10000 = 221;
               break;
            case 43:
               var10000 = 148;
               break;
            case 44:
               var10000 = 239;
               break;
            case 45:
               var10000 = 208;
               break;
            case 46:
               var10000 = 88;
               break;
            case 47:
               var10000 = 189;
               break;
            case 48:
               var10000 = 250;
               break;
            case 49:
               var10000 = 152;
               break;
            case 50:
               var10000 = 57;
               break;
            case 51:
               var10000 = 30;
               break;
            case 52:
               var10000 = 153;
               break;
            case 53:
               var10000 = 232;
               break;
            case 54:
               var10000 = 161;
               break;
            case 55:
               var10000 = 188;
               break;
            case 56:
               var10000 = 47;
               break;
            case 57:
               var10000 = 102;
               break;
            case 58:
               var10000 = 13;
               break;
            case 59:
               var10000 = 133;
               break;
            case 60:
               var10000 = 50;
               break;
            case 61:
               var10000 = 191;
               break;
            case 62:
               var10000 = 127;
               break;
            case 63:
               var10000 = 86;
               break;
            case 64:
               var10000 = 38;
               break;
            case 65:
               var10000 = 233;
               break;
            case 66:
               var10000 = 80;
               break;
            case 67:
               var10000 = 111;
               break;
            case 68:
               var10000 = 90;
               break;
            case 69:
               var10000 = 160;
               break;
            case 70:
               var10000 = 62;
               break;
            case 71:
               var10000 = 96;
               break;
            case 72:
               var10000 = 201;
               break;
            case 73:
               var10000 = 155;
               break;
            case 74:
               var10000 = 126;
               break;
            case 75:
               var10000 = 120;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 147;
               break;
            case 78:
               var10000 = 118;
               break;
            case 79:
               var10000 = 228;
               break;
            case 80:
               var10000 = 36;
               break;
            case 81:
               var10000 = 74;
               break;
            case 82:
               var10000 = 182;
               break;
            case 83:
               var10000 = 194;
               break;
            case 84:
               var10000 = 135;
               break;
            case 85:
               var10000 = 119;
               break;
            case 86:
               var10000 = 165;
               break;
            case 87:
               var10000 = 37;
               break;
            case 88:
               var10000 = 137;
               break;
            case 89:
               var10000 = 113;
               break;
            case 90:
               var10000 = 100;
               break;
            case 91:
               var10000 = 122;
               break;
            case 92:
               var10000 = 89;
               break;
            case 93:
               var10000 = 164;
               break;
            case 94:
               var10000 = 16;
               break;
            case 95:
               var10000 = 157;
               break;
            case 96:
               var10000 = 82;
               break;
            case 97:
               var10000 = 39;
               break;
            case 98:
               var10000 = 81;
               break;
            case 99:
               var10000 = 216;
               break;
            case 100:
               var10000 = 224;
               break;
            case 101:
               var10000 = 45;
               break;
            case 102:
               var10000 = 103;
               break;
            case 103:
               var10000 = 43;
               break;
            case 104:
               var10000 = 73;
               break;
            case 105:
               var10000 = 154;
               break;
            case 106:
               var10000 = 101;
               break;
            case 107:
               var10000 = 167;
               break;
            case 108:
               var10000 = 203;
               break;
            case 109:
               var10000 = 134;
               break;
            case 110:
               var10000 = 177;
               break;
            case 111:
               var10000 = 175;
               break;
            case 112:
               var10000 = 130;
               break;
            case 113:
               var10000 = 99;
               break;
            case 114:
               var10000 = 219;
               break;
            case 115:
               var10000 = 71;
               break;
            case 116:
               var10000 = 105;
               break;
            case 117:
               var10000 = 169;
               break;
            case 118:
               var10000 = 141;
               break;
            case 119:
               var10000 = 231;
               break;
            case 120:
               var10000 = 150;
               break;
            case 121:
               var10000 = 247;
               break;
            case 122:
               var10000 = 139;
               break;
            case 123:
               var10000 = 58;
               break;
            case 124:
               var10000 = 204;
               break;
            case 125:
               var10000 = 98;
               break;
            case 126:
               var10000 = 17;
               break;
            case 127:
               var10000 = 193;
               break;
            case 128:
               var10000 = 170;
               break;
            case 129:
               var10000 = 24;
               break;
            case 130:
               var10000 = 173;
               break;
            case 131:
               var10000 = 95;
               break;
            case 132:
               var10000 = 196;
               break;
            case 133:
               var10000 = 14;
               break;
            case 134:
               var10000 = 40;
               break;
            case 135:
               var10000 = 220;
               break;
            case 136:
               var10000 = 56;
               break;
            case 137:
               var10000 = 240;
               break;
            case 138:
               var10000 = 230;
               break;
            case 139:
               var10000 = 34;
               break;
            case 140:
               var10000 = 46;
               break;
            case 141:
               var10000 = 226;
               break;
            case 142:
               var10000 = 53;
               break;
            case 143:
               var10000 = 124;
               break;
            case 144:
               var10000 = 79;
               break;
            case 145:
               var10000 = 1;
               break;
            case 146:
               var10000 = 93;
               break;
            case 147:
               var10000 = 18;
               break;
            case 148:
               var10000 = 238;
               break;
            case 149:
               var10000 = 68;
               break;
            case 150:
               var10000 = 254;
               break;
            case 151:
               var10000 = 72;
               break;
            case 152:
               var10000 = 48;
               break;
            case 153:
               var10000 = 112;
               break;
            case 154:
               var10000 = 215;
               break;
            case 155:
               var10000 = 67;
               break;
            case 156:
               var10000 = 60;
               break;
            case 157:
               var10000 = 78;
               break;
            case 158:
               var10000 = 227;
               break;
            case 159:
               var10000 = 44;
               break;
            case 160:
               var10000 = 186;
               break;
            case 161:
               var10000 = 149;
               break;
            case 162:
               var10000 = 7;
               break;
            case 163:
               var10000 = 200;
               break;
            case 164:
               var10000 = 66;
               break;
            case 165:
               var10000 = 234;
               break;
            case 166:
               var10000 = 209;
               break;
            case 167:
               var10000 = 106;
               break;
            case 168:
               var10000 = 244;
               break;
            case 169:
               var10000 = 217;
               break;
            case 170:
               var10000 = 0;
               break;
            case 171:
               var10000 = 249;
               break;
            case 172:
               var10000 = 117;
               break;
            case 173:
               var10000 = 199;
               break;
            case 174:
               var10000 = 180;
               break;
            case 175:
               var10000 = 5;
               break;
            case 176:
               var10000 = 207;
               break;
            case 177:
               var10000 = 27;
               break;
            case 178:
               var10000 = 97;
               break;
            case 179:
               var10000 = 129;
               break;
            case 180:
               var10000 = 83;
               break;
            case 181:
               var10000 = 20;
               break;
            case 182:
               var10000 = 51;
               break;
            case 183:
               var10000 = 125;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 115;
               break;
            case 186:
               var10000 = 69;
               break;
            case 187:
               var10000 = 142;
               break;
            case 188:
               var10000 = 22;
               break;
            case 189:
               var10000 = 236;
               break;
            case 190:
               var10000 = 2;
               break;
            case 191:
               var10000 = 114;
               break;
            case 192:
               var10000 = 205;
               break;
            case 193:
               var10000 = 10;
               break;
            case 194:
               var10000 = 252;
               break;
            case 195:
               var10000 = 166;
               break;
            case 196:
               var10000 = 85;
               break;
            case 197:
               var10000 = 243;
               break;
            case 198:
               var10000 = 8;
               break;
            case 199:
               var10000 = 144;
               break;
            case 200:
               var10000 = 241;
               break;
            case 201:
               var10000 = 198;
               break;
            case 202:
               var10000 = 25;
               break;
            case 203:
               var10000 = 211;
               break;
            case 204:
               var10000 = 55;
               break;
            case 205:
               var10000 = 94;
               break;
            case 206:
               var10000 = 171;
               break;
            case 207:
               var10000 = 35;
               break;
            case 208:
               var10000 = 242;
               break;
            case 209:
               var10000 = 222;
               break;
            case 210:
               var10000 = 132;
               break;
            case 211:
               var10000 = 197;
               break;
            case 212:
               var10000 = 65;
               break;
            case 213:
               var10000 = 214;
               break;
            case 214:
               var10000 = 168;
               break;
            case 215:
               var10000 = 21;
               break;
            case 216:
               var10000 = 107;
               break;
            case 217:
               var10000 = 163;
               break;
            case 218:
               var10000 = 146;
               break;
            case 219:
               var10000 = 121;
               break;
            case 220:
               var10000 = 181;
               break;
            case 221:
               var10000 = 32;
               break;
            case 222:
               var10000 = 253;
               break;
            case 223:
               var10000 = 128;
               break;
            case 224:
               var10000 = 116;
               break;
            case 225:
               var10000 = 213;
               break;
            case 226:
               var10000 = 75;
               break;
            case 227:
               var10000 = 202;
               break;
            case 228:
               var10000 = 49;
               break;
            case 229:
               var10000 = 190;
               break;
            case 230:
               var10000 = 192;
               break;
            case 231:
               var10000 = 179;
               break;
            case 232:
               var10000 = 225;
               break;
            case 233:
               var10000 = 185;
               break;
            case 234:
               var10000 = 12;
               break;
            case 235:
               var10000 = 11;
               break;
            case 236:
               var10000 = 218;
               break;
            case 237:
               var10000 = 178;
               break;
            case 238:
               var10000 = 184;
               break;
            case 239:
               var10000 = 156;
               break;
            case 240:
               var10000 = 63;
               break;
            case 241:
               var10000 = 212;
               break;
            case 242:
               var10000 = 41;
               break;
            case 243:
               var10000 = 210;
               break;
            case 244:
               var10000 = 131;
               break;
            case 245:
               var10000 = 77;
               break;
            case 246:
               var10000 = 235;
               break;
            case 247:
               var10000 = 9;
               break;
            case 248:
               var10000 = 42;
               break;
            case 249:
               var10000 = 251;
               break;
            case 250:
               var10000 = 52;
               break;
            case 251:
               var10000 = 26;
               break;
            case 252:
               var10000 = 206;
               break;
            case 253:
               var10000 = 151;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 6;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7347;
      if (h[var3] == null) {
         h[var3] = (int)(f[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[43];
      int var11 = 0;
      String var10 = "厞郁務\u000f-^C\u0090TùQ°\u0000Á\u0099kfjj\u0005¨\u009fÇÃ¥\u000e\u001bí\u0085æ\u008c7Jicúõ\fë\u0086\u001d\u0003?LJ\\ÂÕïÙ\t¤0M\u001dVLZ\u0018°~è(óÁ®H\u0086Lú\u0004凴郷估譋\u0005厨逩吡溜竄\u000e^³--\u0099NèF7\u001f\u007f°º\u0013\u0007淳勑呖价cù¨\u0004\u0011°\u000bÇ\u0004徫到侇订\u0012ò\u0010r¯\u009b~-xÆùCl5\u0096\u000e'è5\u0012Ó|§¼\u008d9õE\u008e(F\u0090d#®\u0090[\u0091\u0005吹仅缲迌嚯\u0004快痜窔袃\u000fcf#|íÿ&Ø¹lI£\\à\u0003\f}àZ\u00074\u001aG §x¯Ò\u0004忖勹伨讛\u0005¦Ï\u0007É\u009c\u0011I\u0015Ü¹äÍ]Zä'Ç9Lmð{\u0083\u0002邂颓\u0003醧呓呜\u000e Ââ\u0003`\u008b×þÐ\b\u0083R%O\b攕庚敒亝契ä\u001bû\u000fêz»\u0014Ki²¢|\u0083\u0016!\u0097aT\u0005\u001ec\u0012\\|\r揚ZÖ\u008f\u0019·\u0086tg\u0099ù卾道\u0004凛逖俕護\u0005\u0095\u008ecáR\u0003厼退劝\u000f\u0099\u0002Õ\u001b\u0086\u0088\u000b\u009eK\u0004ðÓK}Ï\u000e\u000b\u0099\u0087hÌæBSb½Õäï\u009b\u0002剼雡)\t¹\r\u009atØÚ§rhöZËÂÁc%ý_Â\u0015¿L8EH\"ì\u00adIÑ¤´!Ü}\u0000_FFÕ$Â¬t8[\u008c?-Î9ap9\u0087\u009fËîè&`:ë©¹åGï\u00ad×\u0081z(Ä\u008fa\u001f\u0011挞ËU¢\u0010¤\u00ad\u001f\u0013\u0088Ô(w\u008cù卒遌\u0012\u0083\u007f\\B^Ã\u0095ÏÑ\u000f¡²iM\u0085\\\u0099Z\u0002卩造\u0002\u0013\u0096\b揸á\u00888\u0082Þ卉遄\u0002厩連";
      int var12 = "厞郁務\u000f-^C\u0090TùQ°\u0000Á\u0099kfjj\u0005¨\u009fÇÃ¥\u000e\u001bí\u0085æ\u008c7Jicúõ\fë\u0086\u001d\u0003?LJ\\ÂÕïÙ\t¤0M\u001dVLZ\u0018°~è(óÁ®H\u0086Lú\u0004凴郷估譋\u0005厨逩吡溜竄\u000e^³--\u0099NèF7\u001f\u007f°º\u0013\u0007淳勑呖价cù¨\u0004\u0011°\u000bÇ\u0004徫到侇订\u0012ò\u0010r¯\u009b~-xÆùCl5\u0096\u000e'è5\u0012Ó|§¼\u008d9õE\u008e(F\u0090d#®\u0090[\u0091\u0005吹仅缲迌嚯\u0004快痜窔袃\u000fcf#|íÿ&Ø¹lI£\\à\u0003\f}àZ\u00074\u001aG §x¯Ò\u0004忖勹伨讛\u0005¦Ï\u0007É\u009c\u0011I\u0015Ü¹äÍ]Zä'Ç9Lmð{\u0083\u0002邂颓\u0003醧呓呜\u000e Ââ\u0003`\u008b×þÐ\b\u0083R%O\b攕庚敒亝契ä\u001bû\u000fêz»\u0014Ki²¢|\u0083\u0016!\u0097aT\u0005\u001ec\u0012\\|\r揚ZÖ\u008f\u0019·\u0086tg\u0099ù卾道\u0004凛逖俕護\u0005\u0095\u008ecáR\u0003厼退劝\u000f\u0099\u0002Õ\u001b\u0086\u0088\u000b\u009eK\u0004ðÓK}Ï\u000e\u000b\u0099\u0087hÌæBSb½Õäï\u009b\u0002剼雡)\t¹\r\u009atØÚ§rhöZËÂÁc%ý_Â\u0015¿L8EH\"ì\u00adIÑ¤´!Ü}\u0000_FFÕ$Â¬t8[\u008c?-Î9ap9\u0087\u009fËîè&`:ë©¹åGï\u00ad×\u0081z(Ä\u008fa\u001f\u0011挞ËU¢\u0010¤\u00ad\u001f\u0013\u0088Ô(w\u008cù卒遌\u0012\u0083\u007f\\B^Ã\u0095ÏÑ\u000f¡²iM\u0085\\\u0099Z\u0002卩造\u0002\u0013\u0096\b揸á\u00888\u0082Þ卉遄\u0002厩連"
         .length();
      char var9 = 3;
      int var17 = -1;
      X(null);

      label70:
      while (true) {
         byte var10000 = 2;
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
                        var65 = 79;
                        break;
                     case 1:
                        var65 = 101;
                        break;
                     case 2:
                        var65 = 122;
                        break;
                     case 3:
                        var65 = 115;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 125;
                        break;
                     default:
                        var65 = 72;
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
                     c = var13;
                     e = new String[43];
                     long var0 = 613608558086267396L;
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "\u00ad\u0013Ü0k\u009fYä{K!D\u0003¬/\u001dp+\u0086)\u001aa\u0001uF?j\u0086ÛÒ!\u007fêcFåhÑU_WN3\u0004#ò\u001f\u00179[pä\u0084=-º\u0096C\u009e\u009b\u0095jg\u001bDm=U!Q%Ï8\"Õ<z¹Í\u0016\u0011\fNqEßµÐ\u0083\u007f\"ßDÇ¿\u0000Vâ\u001cé\u0087\u0092¯T*5G×u#GdE»kNøä\u0013¹~ÆÕ?~xÐ¨<_\u0018VË\u009aí\u001f¨Úp¤\u0010 \u008f0";
                     int var5 = "\u00ad\u0013Ü0k\u009fYä{K!D\u0003¬/\u001dp+\u0086)\u001aa\u0001uF?j\u0086ÛÒ!\u007fêcFåhÑU_WN3\u0004#ò\u001f\u00179[pä\u0084=-º\u0096C\u009e\u009b\u0095jg\u001bDm=U!Q%Ï8\"Õ<z¹Í\u0016\u0011\fNqEßµÐ\u0083\u007f\"ßDÇ¿\u0000Vâ\u001cé\u0087\u0092¯T*5G×u#GdE»kNøä\u0013¹~ÆÕ?~xÐ¨<_\u0018VË\u009aí\u001f¨Úp¤\u0010 \u008f0"
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
                                    f = var6;
                                    h = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\\H\u009fÄ\u007f|CôÅáÞ`AN«ý";
                                 var5 = "\\H\u009fÄ\u007f|CôÅáÞ`AN«ý".length();
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

                  var10 = "IX½\u001eÚð½\u0011lnªd4/Á²\u0010\u007fA*n\u001a\u009b?\u001b/\u0088\u0018\u0083\u008f\u0013\u000fwD\t枦尡洈剘嚶輰筌õ¯";
                  var12 = "IX½\u001eÚð½\u0011lnªd4/Á²\u0010\u007fA*n\u001a\u009b?\u001b/\u0088\u0018\u0083\u008f\u0013\u000fwD\t枦尡洈剘嚶輰筌õ¯".length();
                  var9 = '"';
                  var17 = -1;
            }

            var10000 = 116;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






