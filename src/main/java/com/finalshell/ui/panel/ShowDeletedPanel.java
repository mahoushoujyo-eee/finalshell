package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.Fb2;
import com.finalshell.core.JT;
import com.finalshell.core.KD;
import com.finalshell.core.LO3;
import com.finalshell.core.Ne4;
import com.finalshell.core.Qe2_2;
import com.finalshell.core.TQ3;
import com.finalshell.core.Ty4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Jp2;
import com.finalshell.task.YE3;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.frame.Kb2;
import com.finalshell.ui.frame.Km4;
import com.finalshell.ui.listener.AI;
import com.finalshell.ui.listener.At2;
import com.finalshell.ui.listener.BM3;
import com.finalshell.ui.listener.Dm2;
import com.finalshell.ui.listener.FD3;
import com.finalshell.ui.listener.L3;
import com.finalshell.ui.listener.MA;
import com.finalshell.ui.listener.Oz4;
import com.finalshell.ui.listener.PortForwardActionListener;
import com.finalshell.ui.listener.Qs2;
import com.finalshell.ui.listener.Tq2;
import com.finalshell.ui.listener.Uq2;
import com.finalshell.ui.listener.X73;
import com.finalshell.ui.listener.XH2;
import com.finalshell.ui.listener.Yr2;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.LS;
import com.finalshell.ui.model.Tf4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import net.miginfocom.swing.MigLayout;

public class ShowDeletedPanel extends JPanel implements Fb2 {
   public UV3 O;
   public UV3 R;
   public int T;
   public int l;
   public int H;
   public int b;
   public ShowDeletedPanel Y;
   public JT U;
   public KQ E;
   public JPanel M;
   public C I;
   public Ne4 B;
   public XT3 r;
   public JComboBox S;
   public KD A;
   public KD u;
   public boolean y;
   public int q;
   public boolean x;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public ShowDeletedPanel() {
      Boolean var177;
      Registry.lookupField(455118846627771080L).setInt(this, -1);
      Registry.lookupField(181494556387054133L).setInt(this, 1);
      Registry.lookupField(532186872455451527L).setInt(this, a(25241, 4112275145674261376L));
      Registry.lookupField(401113094809405887L).setInt(this, a(159, 5488164243582968195L));
      Registry.lookupField(270047832273883253L).setBoolean(this, false);
      Registry.lookupField(212642861526004398L).setInt(this, 0);
      Registry.lookupField(576761866492028513L).setBoolean(this, false);
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 182098455520953031L;
      Object[] var10 = var10003;
      var10003 = Ref.h(182098455520953031L, var10, var11);
      long var13 = 166410067581525611L;
      Object var12 = var10003;
      Ref.s(166410067581525611L, var12, var13);
      long var15 = 127112736708268771L;
      Ref.s(127112736708268771L, this, var15);
      long var17 = 605575582011546661L;
      Ref.s(605575582011546661L, this, var17);
      F8.y();
      Object var18 = 605575582011546661L;
      ((JPanel)Ref.g(605575582011546661L, var18)).setLayout(new MigLayout(a(23330, 20702), a(23342, 27012), a(23337, 12956)));
      UV3 var10008 = new UV3(this, false);
      long var21 = 354859781990372885L;
      UV3 var20 = var10008;
      Ref.s(354859781990372885L, var20, var21);
      UV3 var10009 = new UV3(this, true);
      long var23 = 585473904632414414L;
      UV3 var22 = var10009;
      Ref.s(585473904632414414L, var22, var23);
      Qe2_2 var10010 = (Qe2_2)(Registry.packArgs(a(23328, 8913)));
      long var25 = 634198882764672414L;
      Object var24 = var10010;
      var10010 = Ref.h(634198882764672414L, var24, var25);

      try {
         var10010 = (Qe2_2)var10010;
      } catch (InvocationTargetException var165) {
         throw var165.getTargetException();
      }

      Qe2_2 var2 = var10010;
      var2.addActionListener(new MA(this, var2));
      var2.setSelected(true);
      JPanel var3 = new JPanel(new MigLayout(a(23333, 31454), a(23352, -847), ""));
      var3.setOpaque(true);
      var3.setBackground(new Color(a(1068, 7928601095365846306L), a(32232, 8130845514757283067L), a(32232, 8130845514757283067L)));
      Object var26 = 605575582011546661L;
      ((JPanel)Ref.g(605575582011546661L, var26)).add(var3, a(23347, -23909));
      Object[] var10013 = Registry.emptyArgs();
      long var29 = 434852328804426870L;
      Object[] var28 = var10013;
      var10013 = Ref.h(434852328804426870L, var28, var29);
      long var31 = 253940905173559176L;
      Object var30 = var10013;
      Ref.s(253940905173559176L, var30, var31);
      Object var32 = 253940905173559176L;
      ((XT3)Ref.g(253940905173559176L, var32)).setOpaque(false);
      Object var34 = 253940905173559176L;
      this.add((XT3)Ref.g(253940905173559176L, var34));
      Object var36 = 253940905173559176L;
      ((XT3)Ref.g(253940905173559176L, var36)).d$void(0);
      Ne4 var10017 = new Ne4();
      long var39 = 503453149395465632L;
      Ne4 var38 = var10017;
      Ref.s(503453149395465632L, var38, var39);
      Object var40 = 503453149395465632L;
      ((Ne4)Ref.g(503453149395465632L, var40)).h(a(9956, 3608676357232543732L));
      Object var42 = 503453149395465632L;
      ((Ne4)Ref.g(503453149395465632L, var42)).setText("");
      Object var44 = 503453149395465632L;
      ((Ne4)Ref.g(503453149395465632L, var44)).I(0, 5, 0, 5);
      Registry.packArgs("\uf002");
      long var46 = 360256375153447639L;
      Object var10020 = Ref.h2(360256375153447639L, var46);

      try {
         var10020 = (T2)var10020;
      } catch (InvocationTargetException var164) {
         throw var164.getTargetException();
      }

      T2 var4 = (T2)var10020;
      var4.setOpaque(false);
      var4.setForeground(new Color(a(12112, 7386344300059512389L), a(16652, 1286867193058369555L), a(16652, 1286867193058369555L)));
      var4.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      Object var48 = 503453149395465632L;
      ((Ne4)Ref.g(503453149395465632L, var48)).v(var4);
      Registry.packArgs("\uf00d");
      long var50 = 378399160856121064L;
      Object var10023 = Ref.h2(378399160856121064L, var50);
      long var53 = 567545484825691029L;
      Object var52 = var10023;
      Ref.s(567545484825691029L, var52, var53);
      Object var54 = 567545484825691029L;
      ((C)Ref.g(567545484825691029L, var54)).setOpaque(false);
      Object var56 = 567545484825691029L;
      ((C)Ref.g(567545484825691029L, var56))
         .setForeground(new Color(a(16652, 1286867193058369555L), a(16652, 1286867193058369555L), a(16652, 1286867193058369555L)));
      Object var58 = 567545484825691029L;
      ((C)Ref.g(567545484825691029L, var58)).setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      Object var60 = 567545484825691029L;
      ((C)Ref.g(567545484825691029L, var60)).addActionListener(new Tq2(this));
      Object var62 = 503453149395465632L;
      Registry.packArgs(Ref.g(503453149395465632L, var62));
      long var64 = 322267315291882359L;
      Ref.h2(322267315291882359L, var64);
      Object var66 = 503453149395465632L;
      this.add((Ne4)Ref.g(503453149395465632L, var66), a(23339, 2191));
      Object var68 = 503453149395465632L;
      ((Ne4)Ref.g(503453149395465632L, var68)).getDocument().addDocumentListener(new XH2(this));
      JComboBox var10032 = new JComboBox();
      long var71 = 290275742837119451L;
      JComboBox var70 = var10032;
      Ref.s(290275742837119451L, var70, var71);
      Object var72 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var72)).addItem(a(23332, -10689));
      Object var74 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var74)).addItem(a(23354, 14269));
      Object var76 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var76)).addItem(a(23348, 17179));
      Object var78 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var78)).addItem(a(23341, -34));
      Object var80 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var80)).addItem(a(23350, -3115));
      Object var82 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var82)).addItem(a(23336, 32698));
      Object var84 = 290275742837119451L;
      this.add((JComboBox)Ref.g(290275742837119451L, var84));
      Registry.emptyArgs();
      long var86 = 270389152141252877L;
      Ref.h2(270389152141252877L, var86);
      Object[] var10041 = Registry.emptyArgs();
      long var89 = 306266403902896148L;
      Object[] var88 = var10041;
      Ref.h(306266403902896148L, var88, var89);
      Object var10042 = Registry.emptyArgs();
      long var91 = 512419353738146707L;
      Object var90 = var10042;
      var10042 = Ref.h(512419353738146707L, var90, var91);

      try {
         var172 = (Integer)var10042;
      } catch (InvocationTargetException var163) {
         throw var163.getTargetException();
      }

      label162: {
         int var5 = var172;
         int var173 = var5;
         int var10043 = Registry.lookupField(304719506057429442L).getInt(null);
         if (this == null) {
            if (var5 == var10043) {
               Object var92 = 290275742837119451L;
               ((JComboBox)Ref.g(290275742837119451L, var92)).setSelectedItem(a(23332, -10689));
               if (this == null) {
                  break label162;
               }

               Ky4.K(new String[5]);
            }

            var173 = var5;
            var10043 = Registry.lookupField(387101562873018885L).getInt(null);
         }

         if (this == null) {
            if (var173 == var10043) {
               Object var94 = 290275742837119451L;
               ((JComboBox)Ref.g(290275742837119451L, var94)).setSelectedItem(a(23358, -29772));
               if (this == null) {
                  break label162;
               }
            }

            var173 = var5;
            var10043 = Registry.lookupField(243306902745055487L).getInt(null);
         }

         if (this == null) {
            if (var173 == var10043) {
               Object var96 = 290275742837119451L;
               ((JComboBox)Ref.g(290275742837119451L, var96)).setSelectedItem(a(23349, 22501));
               if (this == null) {
                  break label162;
               }
            }

            var173 = var5;
            var10043 = Registry.lookupField(346595405273673113L).getInt(null);
         }

         if (this == null) {
            if (var173 == var10043) {
               Object var98 = 290275742837119451L;
               ((JComboBox)Ref.g(290275742837119451L, var98)).setSelectedItem(a(23351, 30552));
               if (this == null) {
                  break label162;
               }
            }

            var173 = var5;
            var10043 = Registry.lookupField(238917600523772047L).getInt(null);
         }

         if (this == null) {
            if (var173 == var10043) {
               Object var100 = 290275742837119451L;
               ((JComboBox)Ref.g(290275742837119451L, var100)).setSelectedItem(a(23346, 21870));
               if (this == null) {
                  break label162;
               }
            }

            var173 = var5;
            var10043 = Registry.lookupField(478586759941923574L).getInt(null);
         }

         if (var173 == var10043) {
            Object var102 = 290275742837119451L;
            ((JComboBox)Ref.g(290275742837119451L, var102)).setSelectedItem(a(23345, -8806));
         }
      }

      Object var104 = 290275742837119451L;
      ((JComboBox)Ref.g(290275742837119451L, var104)).addActionListener(new PortForwardActionListener(this));
      this.setBackground(new Color(a(26685, 7931182217900984608L), a(26685, 7931182217900984608L), a(26685, 7931182217900984608L)));
      this.setBorder(BorderFactory.createLineBorder(new Color(a(32023, 718345535109504017L), a(6334, 8443103957753297327L), a(6334, 8443103957753297327L)), 1));
      Registry.emptyArgs();
      long var106 = 270389152141252877L;
      Ref.h2(270389152141252877L, var106);
      Object[] var10045 = Registry.packArgs(this);
      long var109 = 459969040127248336L;
      Object[] var108 = var10045;
      Ref.h(459969040127248336L, var108, var109);

      try {
         ;
      } catch (InvocationTargetException var162) {
         throw var162.getTargetException();
      }

      Object[] var10046 = Registry.emptyArgs();
      long var111 = 261545782326467617L;
      Object[] var110 = var10046;
      Ref.h(261545782326467617L, var110, var111);

      try {
         ;
      } catch (InvocationTargetException var161) {
         throw var161.getTargetException();
      }

      JPanel var6 = new JPanel(new MigLayout(a(23333, 31454), a(23331, 19456), ""));
      Object var112 = 605575582011546661L;
      ((JPanel)Ref.g(605575582011546661L, var112)).add(var6, a(23359, 12617));
      var6.setOpaque(false);
      var6.setBorder(
         BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(a(24838, 8569931258633191429L), a(17839, 3080574848242689201L), a(17839, 3080574848242689201L)))
      );
      Registry.packArgs(Registry.lookupField(420455465341613887L).get(null));
      long var114 = 265160760176632718L;
      Object var10049 = Ref.h2(265160760176632718L, var114);
      long var117 = 311342787696881683L;
      Object var116 = var10049;
      Ref.s(311342787696881683L, var116, var117);
      Object var118 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var118)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var120 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var120)).setHorizontalAlignment(2);
      Object var122 = 311342787696881683L;
      this.add((KD)Ref.g(311342787696881683L, var122));
      Object var124 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var124)).G(true);
      Object var126 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var126))
         .setForeground(new Color(a(20415, 6685541441017458362L), a(10115, 1690408217406260874L), a(11658, 8859461137036987544L)));
      Object var128 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var128)).t(new Color(a(10115, 1690408217406260874L), a(10115, 1690408217406260874L), a(24300, 8601565349015732206L)));
      Object var130 = 311342787696881683L;
      ((KD)Ref.g(311342787696881683L, var130)).addActionListener(new Yr2(this));
      Registry.packArgs(a(23340, 11262));
      long var132 = 517287540690064504L;
      Ref.h2(517287540690064504L, var132);

      try {
         ;
      } catch (InvocationTargetException var160) {
         throw var160.getTargetException();
      }

      Object[] var10060 = Registry.emptyArgs();
      long var134 = 270389152141252877L;
      Object var10061 = Ref.h2(270389152141252877L, var134);
      Object[] var10062 = Registry.emptyArgs();
      long var137 = 306266403902896148L;
      Object[] var136 = var10062;
      var10062 = Ref.h(306266403902896148L, var136, var137);
      Object var10063 = Registry.emptyArgs();
      long var139 = 236705034508525556L;
      Object var138 = var10063;
      var10063 = Ref.h(236705034508525556L, var138, var139);

      try {
         var177 = (Boolean)var10063;
      } catch (InvocationTargetException var159) {
         throw var159.getTargetException();
      }

var10061 = new UV3(var10062, var177);
      Object var7 = var10060;
      var7.setOpaque(false);
      var7.setBackground(Color.white);
      var6.add(var7, "");
      var7.addActionListener(new Dm2(this, var7));
      Registry.packArgs(a(23329, -16369));
      long var140 = 265160760176632718L;
      var10062 = Ref.h2(265160760176632718L, var140);
      long var143 = 154919748794789787L;
      Object var142 = var10062;
      Ref.s(154919748794789787L, var142, var143);
      Object var144 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var144)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var146 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var146)).G(true);
      Object var148 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var148)).setOpaque(true);
      Object var150 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var150)).V(2, a(15346, 583437617130035960L), 2, a(15346, 583437617130035960L));
      Object var152 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var152))
         .setBackground(new Color(a(16411, 5758421620306288947L), a(6334, 8443103957753297327L), a(32196, 2961633740102900944L)));
      Object var154 = 154919748794789787L;
      ((KD)Ref.g(154919748794789787L, var154)).addActionListener(new L3(this));
      Object[] var10069 = Registry.packArgs(false);
      long var157 = 593429187478510131L;
      Object[] var156 = var10069;
      Ref.h(593429187478510131L, var156, var157);

      try {
         ;
      } catch (InvocationTargetException var158) {
         throw var158.getTargetException();
      }
   }

   public void g(boolean var1) {
      boolean var37;
      label34: {
         F8.y();
         Object var3 = 154919748794789787L;
         ((KD)Ref.g(154919748794789787L, var3))
            .setBackground(new Color(a(26130, 740254649329944328L), a(32232, 8130845514757283067L), a(16411, 5758421620306288947L)));
         if (this == null) {
            if (var1) {
               Object var5 = 311342787696881683L;
               ((KD)Ref.g(311342787696881683L, var5)).V(2, a(15346, 583437617130035960L), 2, a(15346, 583437617130035960L));
               Object var7 = 311342787696881683L;
               ((KD)Ref.g(311342787696881683L, var7)).setOpaque(true);
               Object var9 = 311342787696881683L;
               ((KD)Ref.g(311342787696881683L, var9)).setText((String)Registry.lookupField(204284935306083361L).get(null));
               Object var11 = 311342787696881683L;
               ((KD)Ref.g(311342787696881683L, var11))
                  .setForeground(new Color(a(21618, 2722125183326172534L), a(10115, 1690408217406260874L), a(24300, 8601565349015732206L)));
               Object var13 = 311342787696881683L;
               ((KD)Ref.g(311342787696881683L, var13))
                  .setBackground(new Color(a(20812, 7477644624595660876L), a(26685, 7931182217900984608L), a(17839, 3080574848242689201L)));
               if (this == null) {
                  break label34;
               }
            }

            Object var15 = 311342787696881683L;
            ((KD)Ref.g(311342787696881683L, var15)).V(2, a(15346, 583437617130035960L), 2, a(15346, 583437617130035960L));
            Object var17 = 311342787696881683L;
            ((KD)Ref.g(311342787696881683L, var17)).setOpaque(true);
            Object var19 = 311342787696881683L;
            ((KD)Ref.g(311342787696881683L, var19)).setText((String)Registry.lookupField(420455465341613887L).get(null));
            Object var21 = 311342787696881683L;
            ((KD)Ref.g(311342787696881683L, var21))
               .setBackground(new Color(a(20901, 4500807497294131379L), a(26685, 7931182217900984608L), a(17839, 3080574848242689201L)));
            Object var23 = 311342787696881683L;
            ((KD)Ref.g(311342787696881683L, var23))
               .setForeground(new Color(a(16740, 3619768301498048613L), a(20516, 3022011081670930729L), a(20516, 3022011081670930729L)));
         }

         Object var25 = 311342787696881683L;
         ((KD)Ref.g(311342787696881683L, var25)).t(new Color(a(20516, 3022011081670930729L), a(20516, 3022011081670930729L), a(20516, 3022011081670930729L)));
      }

      Registry.emptyArgs();
      long var27 = 270389152141252877L;
      Ref.h2(270389152141252877L, var27);
      Object[] var10004 = Registry.emptyArgs();
      long var30 = 163462326892114024L;
      Object[] var29 = var10004;
      Ref.h(163462326892114024L, var29, var30);
      Object var10005 = Registry.emptyArgs();
      long var32 = 133802226692684648L;
      Object var31 = var10005;
      var10005 = Ref.h(133802226692684648L, var31, var32);

      try {
         var37 = (Boolean)var10005;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      if (var37) {
         Object var33 = 311342787696881683L;
         ((KD)Ref.g(311342787696881683L, var33)).setText((String)Registry.lookupField(127034442177009153L).get(null));
      }
   }

   public static KD s(String var0) {
      KD var1 = new KD(var0);
      Registry.packArgs(var1);
      long var2 = 560784054776466487L;
      Ref.h2(560784054776466487L, var2);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var1.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var1.setForeground(new Color(a(4341, 1367282710368154105L), a(13239, 4211477629955560127L), a(13239, 4211477629955560127L)));
      var1.t(new Color(a(6458, 3047591403612633137L), a(24139, 2617293032765865811L), a(24139, 2617293032765865811L)));
      var1.s(2);
      Object var10002 = Registry.packArgs(3, 5);
      long var4 = 188631797336214587L;
      Object var10003 = Ref.h2(188631797336214587L, var4);

      try {
         var10003 = (Border)var10003;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10002.setBorder((Border)var10003);
      var1.H(new Color(a(20901, 4500807497294131379L), a(20901, 4500807497294131379L), a(20901, 4500807497294131379L)));
      var1.addActionListener(new Oz4());
      return var1;
   }

   public void c() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Jp2(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public synchronized void O$void() {
      Object[] var14;
      String[] var1 = F8.y();
      if (var1 == null) {
         if (Registry.lookupField(576761866492028513L).getBoolean(this)) {
            return;
         }

         Registry.lookupField(576761866492028513L).setBoolean(this, true);
      }

      String var2;
      label60: {
         Object var4 = 503453149395465632L;
         var2 = ((Ne4)Ref.g(503453149395465632L, var4)).getText().trim();
         ShowDeletedPanel var10001 = var2.length();
         if (var1 == null) {
            if (var10001 == null) {
               Object var6 = 503453149395465632L;
               ((Ne4)Ref.g(503453149395465632L, var6)).z(null);
               Object[] var10003 = Registry.emptyArgs();
               long var9 = 261545782326467617L;
               Object[] var8 = var10003;
               Ref.h(261545782326467617L, var8, var9);

               try {
                  ;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }

               if (var1 == null) {
                  break label60;
               }
            }

            var10001 = this;
            Object var10 = 503453149395465632L;
            Ne4 var10002 = (Ne4)Ref.g(503453149395465632L, var10);
            Object var12 = 567545484825691029L;
            this.z((C)Ref.g(567545484825691029L, var12));
            if (var1 != null) {
               break label60;
            }

            Registry.lookupField(270047832273883253L).getBoolean(this);
         }

         if (var10001 == null) {
            Object[] var26 = Registry.emptyArgs();
            long var15 = 344765142696056302L;
            var14 = var26;
            Ref.h(344765142696056302L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }
         }
      }

      Object var16 = 585473904632414414L;
      Ref.g(585473904632414414L, var16);
      ImportExportPanel var27 = (ImportExportPanel)(Registry.emptyArgs());
      long var19 = 258495433430833129L;
      Object var18 = var27;
      var27 = Ref.h(258495433430833129L, var18, var19);

      try {
         var27 = (ImportExportPanel)var27;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      ImportExportPanel var3 = var27;
      Object[] var10004 = Registry.packArgs(var2);
      long var21 = 546067833853166045L;
      Object[] var20 = var10004;
      Ref.h(546067833853166045L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      SwingUtilities.invokeLater(new YE3(this, var2, var3));
   }

   public void j() {
      Registry.lookupField(270047832273883253L).setBoolean(this, true);
      Object var7 = 605575582011546661L;
      JPanel var10001 = (JPanel)Ref.g(605575582011546661L, var7);
      Object var9 = 354859781990372885L;
      this.remove((UV3)Ref.g(354859781990372885L, var9));
      Object var11 = 605575582011546661L;
      JPanel var10003 = (JPanel)Ref.g(605575582011546661L, var11);
      Object var13 = 585473904632414414L;
      this.add((UV3)Ref.g(585473904632414414L, var13), a(23338, 30389), 1);
      Object var15 = 253940905173559176L;
      ((XT3)Ref.g(253940905173559176L, var15)).setEnabled(false);
      F8.y();
      Object var17 = 253940905173559176L;
      Component[] var2 = ((XT3)Ref.g(253940905173559176L, var17)).getComponents();
      ShowDeletedPanel var1 = this;

      for (Component var6 : var2) {
         var6.setEnabled(false);
         if (var1 != null) {
            break;
         }
      }
   }

   public void Z() {
      Registry.lookupField(270047832273883253L).setBoolean(this, false);
      Object var7 = 605575582011546661L;
      JPanel var10001 = (JPanel)Ref.g(605575582011546661L, var7);
      Object var9 = 585473904632414414L;
      this.remove((UV3)Ref.g(585473904632414414L, var9));
      Object var11 = 605575582011546661L;
      JPanel var10003 = (JPanel)Ref.g(605575582011546661L, var11);
      Object var13 = 354859781990372885L;
      this.add((UV3)Ref.g(354859781990372885L, var13), a(23335, -29181), 1);
      F8.y();
      Object var15 = 253940905173559176L;
      ((XT3)Ref.g(253940905173559176L, var15)).setEnabled(true);
      Object var17 = 253940905173559176L;
      Component[] var2 = ((XT3)Ref.g(253940905173559176L, var17)).getComponents();
      ShowDeletedPanel var1 = this;

      for (Component var6 : var2) {
         var6.setEnabled(true);
         if (var1 != null) {
            break;
         }
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      var2.setColor(Color.white);
      var2.fillRect(0, 0, this.getWidth(), this.getHeight());
   }

   @Override
   public void O(Ty4 var1) {
      Object[] var14;
      Object[] var33;
      String[] var2 = F8.y();
      Ty4 var10000 = var1;
      if (var2 == null) {
         if (!var1.getClass().equals(TQ3.class)) {
            return;
         }

         var10000 = var1;
      }

      TQ3 var3 = (TQ3)var10000;
      Object var4 = 354859781990372885L;
      Ref.g(354859781990372885L, var4);
      Object[] var10002 = Registry.packArgs(var3);
      long var7 = 295991026597668944L;
      Object[] var6 = var10002;
      Ref.h(295991026597668944L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      Object var8 = 585473904632414414L;
      Ref.g(585473904632414414L, var8);
      Object[] var10004 = Registry.packArgs(var3);
      long var11 = 295991026597668944L;
      Object[] var10 = var10004;
      Ref.h(295991026597668944L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      Object var12 = 354859781990372885L;
      ((UV3)Ref.g(354859781990372885L, var12)).repaint();
      Integer var10006 = (Integer)(Registry.emptyArgs());
      long var15 = 486203322657356972L;
      var14 = var10006;
      var10006 = Ref.h(486203322657356972L, var14, var15);

      try {
         var10006 = (Integer)var10006;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      int var10007 = Registry.lookupField(428968525961987582L).getInt(null);
      if (var2 == null) {
         if (var10006 == var10007) {
            return;
         }

         var10006 = var3;
         var33 = Registry.emptyArgs();
         long var17 = 486203322657356972L;
         Object[] var16 = var33;
         Object var34 = Ref.h(486203322657356972L, var16, var17);

         try {
            var10007 = (Integer)var34;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Registry.lookupField(360540448640992052L).getInt(null);
      }

      if (var10006 != var10007) {
         Object var18 = 354859781990372885L;
         Ref.g(354859781990372885L, var18);
         Object[] var10008 = Registry.emptyArgs();
         long var21 = 258495433430833129L;
         Object[] var20 = var10008;
         Ref.h(258495433430833129L, var20, var21);
         Object[] var10010 = Registry.emptyArgs();
         long var23 = 328789796189272699L;
         Object[] var22 = var10010;
         var10010 = Registry.packArgs(Ref.h(328789796189272699L, var22, var23));
         long var25 = 328044482765605018L;
         Object[] var24 = var10010;
         Ref.h(328044482765605018L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }
      }
   }

   public Qe2_2 r(String var1) {
      Qe2_2 var2 = new Qe2_2(var1).k(0);
      int var3 = a(12358, 4071600662827487561L);
      var2.setMargin(new Insets(0, var3, 0, var3));
      return var2;
   }

   public XT3 g() {
      Object[] var33;
      boolean var42;
      XT3 var2 = new XT3(0);
      var2.O(true);
      var2.setBorder(null);
      var2.f(0, 0, 0, 0);
      String[] var10000 = F8.y();
      var2.setBorderPainted(false);
      var2.setFloatable(false);
      String[] var1 = var10000;
      var2.X(LS.attached);
      var2.O(new Color(a(4358, 8322049213668519965L), a(26685, 7931182217900984608L), a(26685, 7931182217900984608L)));
      var2.T(new Color(a(19791, 856922405293501528L), a(16411, 5758421620306288947L), a(16411, 5758421620306288947L), a(16411, 5758421620306288947L)));
      var2.setFloatable(false);
      var2.setBorder(null);
      JPopupMenu var3 = new JPopupMenu();
      JMenuItem var4 = new JMenuItem(a(23300, -6923));
      var3.add(var4);
      var4.addActionListener(new Qs2(this));
      JMenuItem var5 = new JMenuItem(a(23344, -27869));
      if (var1 == null) {
         Registry.emptyArgs();
         long var11 = 253808553645062345L;
         Object var10001 = Ref.h2(253808553645062345L, var11);

         try {
            var42 = (Boolean)var10001;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         if (var42) {
            var3.add(var5);
         }

         var5.addActionListener(new Uq2(this));
      }

      Object var13 = 166410067581525611L;
      Ref.g(166410067581525611L, var13);
      Object[] var10002 = Registry.packArgs(a(23356, -2401));
      long var16 = 563115472405786955L;
      Object[] var15 = var10002;
      Registry.packArgs(Ref.h(563115472405786955L, var15, var16));
      long var17 = 400943764010088455L;
      Object var10003 = Ref.h2(400943764010088455L, var17);

      try {
         var10003 = (JButton)var10003;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      JButton var6 = (JButton)var10003;
      var2.add(var6);
      var6.setFocusable(false);
      var6.addActionListener(new AI(this, var3, var6));
      Object var19 = 166410067581525611L;
      Ref.g(166410067581525611L, var19);
      Object[] var10005 = Registry.packArgs(a(23357, -688));
      long var22 = 563115472405786955L;
      Object[] var21 = var10005;
      Registry.packArgs(Ref.h(563115472405786955L, var21, var22));
      long var23 = 400943764010088455L;
      Object var10006 = Ref.h2(400943764010088455L, var23);

      try {
         var10006 = (JButton)var10006;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      JButton var7 = (JButton)var10006;
      var2.add(var7);
      var7.setFocusable(false);
      var2.addSeparator();
      var7.addActionListener(new X73(this));
      Object var25 = 166410067581525611L;
      Ref.g(166410067581525611L, var25);
      Object[] var10008 = Registry.packArgs(a(23353, -31966));
      long var28 = 563115472405786955L;
      Object[] var27 = var10008;
      Registry.packArgs(Ref.h(563115472405786955L, var27, var28));
      long var29 = 400943764010088455L;
      Object var10009 = Ref.h2(400943764010088455L, var29);

      try {
         var10009 = (JButton)var10009;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      JButton var8 = (JButton)var10009;
      var2.add(var8);
      var8.setFocusable(false);
      var8.addActionListener(new At2(this));
      Object var31 = 166410067581525611L;
      Ref.g(166410067581525611L, var31);
      Object[] var10011 = Registry.packArgs(a(23343, 23838));
      long var34 = 563115472405786955L;
      var33 = var10011;
      Registry.packArgs(Ref.h(563115472405786955L, var33, var34));
      long var35 = 400943764010088455L;
      Object var10012 = Ref.h2(400943764010088455L, var35);

      try {
         var10012 = (JButton)var10012;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      JButton var9 = (JButton)var10012;
      var2.add(var9);
      var9.setFocusable(false);
      var9.addActionListener(new FD3(this));
      JCheckBox var10 = new JCheckBox(a(23355, 975), false);
      var2.add(var10);
      var10.setFocusable(false);
      var10.addActionListener(new BM3(this, var10));
      return var2;
   }

   public void L() {
      Object[] var33;
      Object[] var37;
      String[] var10000 = F8.y();
      String var2 = (String)Registry.lookupField(478301022169899080L).get(null);
      String[] var1 = var10000;
      Object var11 = 354859781990372885L;
      Ref.g(354859781990372885L, var11);
      Object var13 = 601581016628183308L;
      Object var10002 = (ImportExportPanel)Ref.g(601581016628183308L, var13);
      if (var1 == null) {
         if (((ImportExportPanel)var10002).getSelectionCount() == 0) {
            Object var15 = 354859781990372885L;
            Ref.g(354859781990372885L, var15);
            Object var17 = 601581016628183308L;
            Ref.g(601581016628183308L, var17);
            Object[] var10005 = Registry.emptyArgs();
            long var20 = 205680329605647971L;
            Object[] var19 = var10005;
            Ref.h(205680329605647971L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var56) {
               throw var56.getTargetException();
            }
         }

         var10002 = this;
         Object var21 = 354859781990372885L;
         Ref.g(354859781990372885L, var21);
         Object var23 = 601581016628183308L;
         ((ImportExportPanel)Ref.g(601581016628183308L, var23)).getSelectionPath().getLastPathComponent();
      }

      DefaultMutableTreeNode var3;
      label116: {
         label120: {
            label121: {
               var3 = (DefaultMutableTreeNode)var10002;
               Object var4 = var3.getUserObject();
               boolean var60 = var4.getClass().equals(Tf4.class);
               if (var1 == null) {
                  if (var60) {
                     Tf4 var5 = (Tf4)var4;
                     java.io.File var10003 = Registry.emptyArgs();
                     long var26 = 543633160597441792L;
                     Object var25 = var10003;
                     var10003 = Ref.h(543633160597441792L, var25, var26);

                     try {
                        var10003 = (java.io.File)var10003;
                     } catch (InvocationTargetException var55) {
                        throw var55.getTargetException();
                     }

                     var2 = var10003.getAbsolutePath();
                     if (var1 == null) {
                        break label116;
                     }
                  }

                  var10002 = var4.getClass();
                  if (var1 != null) {
                     break label121;
                  }

                  var60 = var10002.equals(Ck4.class);
               }

               if (!var60) {
                  break label120;
               }

               var10002 = var4;
            }

            Ck4 var58 = (Ck4)var10002;
            Object var64 = Registry.emptyArgs();
            long var28 = 272998330038223631L;
            Object var27 = var64;
            var64 = Ref.h(272998330038223631L, var27, var28);

            try {
               var64 = (java.io.File)var64;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }

            var2 = var64.getParentFile().getAbsolutePath();
            if (var1 == null) {
               break label116;
            }
         }

         var2 = new java.io.File((String)Registry.lookupField(478301022169899080L).get(null)).getAbsolutePath();
      }

      String var10004 = (String)(Registry.packArgs(var2));
      long var30 = 444106268310274996L;
      Object var29 = var10004;
      var10004 = Ref.h(444106268310274996L, var29, var30);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      String var59 = var10004;
      Registry.emptyArgs();
      long var31 = 270389152141252877L;
      Ref.h2(270389152141252877L, var31);
      Object[] var10006 = Registry.emptyArgs();
      long var34 = 410905379772103887L;
      var33 = var10006;
      Ref.h(410905379772103887L, var33, var34);
      LO3 var10007 = (LO3)(Registry.packArgs(var2, var59));
      long var36 = 416293356817081351L;
      Object var35 = var10007;
      var10007 = Ref.h(416293356817081351L, var35, var36);

      try {
         var10007 = (LO3)var10007;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      LO3 var6 = var10007;
      new StringBuilder().append(var2).append(java.io.File.separator);
      String var10009 = (String)(Registry.emptyArgs());
      long var38 = 194080076253066315L;
      var37 = var10009;
      var10009 = Ref.h(194080076253066315L, var37, var38);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      String var7;
      int var8;
      label97: {
         var7 = var6.append((String)var10009).toString();
         var8 = 0;
         Object var9 = var3.getUserObject();
         boolean var10008 = var9.getClass().equals(Ck4.class);
         if (var1 == null) {
            if (var10008) {
               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var3.getParent();
               var8 = var10.getIndex(var3);
               if (var1 == null) {
                  break label97;
               }
            }

            var10008 = var9.getClass().equals(Tf4.class);
         }

         if (var10008) {
         }
      }

      Object var39 = 354859781990372885L;
      Ref.g(354859781990372885L, var39);
      Object var41 = 601581016628183308L;
      Ref.g(601581016628183308L, var41);
      Object[] var10011 = Registry.packArgs(var7, var8);
      long var44 = 295612812222941676L;
      Object[] var43 = var10011;
      Ref.h(295612812222941676L, var43, var44);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Object var45 = 313728980571712684L;
      Ref.g(313728980571712684L, var45);
      Object[] var10013 = Registry.packArgs(true);
      long var48 = 438941361784812150L;
      Object[] var47 = var10013;
      Ref.h(438941361784812150L, var47, var48);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }
   }

   public void S() {
      Object[] var14;
      long var33;
      String[] var10000 = F8.y();
      String var2 = (String)Registry.lookupField(478301022169899080L).get(null);
      String[] var1 = var10000;
      Object var6 = 354859781990372885L;
      Ref.g(354859781990372885L, var6);
      Object var8 = 601581016628183308L;
      Object var10002 = (ImportExportPanel)Ref.g(601581016628183308L, var8);
      if (var1 == null) {
         if (((ImportExportPanel)var10002).getSelectionCount() == 0) {
            Object var10 = 354859781990372885L;
            Ref.g(354859781990372885L, var10);
            Object var12 = 601581016628183308L;
            Ref.g(601581016628183308L, var12);
            Object[] var10005 = Registry.emptyArgs();
            long var15 = 205680329605647971L;
            var14 = var10005;
            Ref.h(205680329605647971L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }
         }

         var10002 = this;
         Object var16 = 354859781990372885L;
         Ref.g(354859781990372885L, var16);
         Object var18 = 601581016628183308L;
         ((ImportExportPanel)Ref.g(601581016628183308L, var18)).getSelectionPath().getLastPathComponent();
      }

      DefaultMutableTreeNode var3;
      label77: {
         label78: {
            var3 = (DefaultMutableTreeNode)var10002;
            Object var4 = var3.getUserObject();
            boolean var44 = var4.getClass().equals(Tf4.class);
            if (var1 == null) {
               if (var44) {
                  Tf4 var5 = (Tf4)var4;
                  java.io.File var10003 = Registry.emptyArgs();
                  long var21 = 543633160597441792L;
                  Object var20 = var10003;
                  var10003 = Ref.h(543633160597441792L, var20, var21);

                  try {
                     var10003 = (java.io.File)var10003;
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }

                  var2 = var10003.getAbsolutePath();
                  if (var1 == null) {
                     break label77;
                  }
               }

               var10002 = var4.getClass();
               if (var1 != null) {
                  break label78;
               }

               var44 = var10002.equals(Ck4.class);
            }

            if (!var44) {
               break label77;
            }

            var10002 = var4;
         }

         Ck4 var43 = (Ck4)var10002;
         Object var48 = Registry.emptyArgs();
         long var23 = 272998330038223631L;
         Object var22 = var48;
         var48 = Ref.h(272998330038223631L, var22, var23);

         try {
            var48 = (java.io.File)var48;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         var2 = var48.getParentFile().getAbsolutePath();
      }

      Object var24 = 313728980571712684L;
      Ref.g(313728980571712684L, var24);
      Object[] var10004 = Registry.packArgs(true);
      long var27 = 480031414946709658L;
      Object[] var26 = var10004;
      Ref.h(480031414946709658L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object var28 = 313728980571712684L;
      KQ var10008 = (KQ)Ref.g(313728980571712684L, var28);
      Object var30 = 313728980571712684L;
      Object var10010 = Ref.g(313728980571712684L, var30);
      Object[] var10011 = Registry.emptyArgs();
      var33 = 249886410317960768L;
      Object[] var32 = var10011;
      Ref.h(249886410317960768L, var32, var33);
      var10011 = Registry.emptyArgs();
      long var34 = 513527511121793373L;
      Object var10012 = Ref.h2(513527511121793373L, var34);

      try {
         var10012 = (JDialog)var10012;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      // [VF-super] super((String)var10010, var10011, (Window)var10012, null, var3);
   }

   public void h() {
      Object[] var14;
      long var33;
      String[] var10000 = F8.y();
      String var2 = (String)Registry.lookupField(478301022169899080L).get(null);
      String[] var1 = var10000;
      Object var6 = 354859781990372885L;
      Ref.g(354859781990372885L, var6);
      Object var8 = 601581016628183308L;
      Object var10002 = (ImportExportPanel)Ref.g(601581016628183308L, var8);
      if (var1 == null) {
         if (((ImportExportPanel)var10002).getSelectionCount() == 0) {
            Object var10 = 354859781990372885L;
            Ref.g(354859781990372885L, var10);
            Object var12 = 601581016628183308L;
            Ref.g(601581016628183308L, var12);
            Object[] var10005 = Registry.emptyArgs();
            long var15 = 205680329605647971L;
            var14 = var10005;
            Ref.h(205680329605647971L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }
         }

         var10002 = this;
         Object var16 = 354859781990372885L;
         Ref.g(354859781990372885L, var16);
         Object var18 = 601581016628183308L;
         ((ImportExportPanel)Ref.g(601581016628183308L, var18)).getSelectionPath().getLastPathComponent();
      }

      DefaultMutableTreeNode var3;
      label77: {
         label78: {
            var3 = (DefaultMutableTreeNode)var10002;
            Object var4 = var3.getUserObject();
            boolean var44 = var4.getClass().equals(Tf4.class);
            if (var1 == null) {
               if (var44) {
                  Tf4 var5 = (Tf4)var4;
                  java.io.File var10003 = Registry.emptyArgs();
                  long var21 = 543633160597441792L;
                  Object var20 = var10003;
                  var10003 = Ref.h(543633160597441792L, var20, var21);

                  try {
                     var10003 = (java.io.File)var10003;
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }

                  var2 = var10003.getAbsolutePath();
                  if (var1 == null) {
                     break label77;
                  }
               }

               var10002 = var4.getClass();
               if (var1 != null) {
                  break label78;
               }

               var44 = var10002.equals(Ck4.class);
            }

            if (!var44) {
               break label77;
            }

            var10002 = var4;
         }

         Ck4 var43 = (Ck4)var10002;
         Object var48 = Registry.emptyArgs();
         long var23 = 272998330038223631L;
         Object var22 = var48;
         var48 = Ref.h(272998330038223631L, var22, var23);

         try {
            var48 = (java.io.File)var48;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         var2 = var48.getParentFile().getAbsolutePath();
      }

      Object var24 = 313728980571712684L;
      Ref.g(313728980571712684L, var24);
      Object[] var10004 = Registry.packArgs(true);
      long var27 = 480031414946709658L;
      Object[] var26 = var10004;
      Ref.h(480031414946709658L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object var28 = 313728980571712684L;
      KQ var10008 = (KQ)Ref.g(313728980571712684L, var28);
      Object var30 = 313728980571712684L;
      Object var10010 = Ref.g(313728980571712684L, var30);
      Object[] var10011 = Registry.emptyArgs();
      var33 = 249886410317960768L;
      Object[] var32 = var10011;
      Ref.h(249886410317960768L, var32, var33);
      var10011 = Registry.emptyArgs();
      long var34 = 513527511121793373L;
      Object var10012 = Ref.h2(513527511121793373L, var34);

      try {
         var10012 = (JDialog)var10012;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      // [VF-super] super((String)var10010, var10011, (Window)var10012, null, var3);
   }

   public String t(String var1) {
      String var3 = a(23334, 30727);
      String var10000 = F8.y();
      String var4 = var3;
      String[] var2 = var10000;
      HashSet var5 = new HashSet();
      java.io.File var6 = new java.io.File(var1);
      java.io.File var7 = var6.listFiles();
      java.io.File[] var13 = var7;
      if (var2 == null) {
         if (var7 == null) {
            return var3;
         }

         var13 = var7;
      }

      java.io.File[] var8 = var13;
      int var9 = var8.length;
      int var10 = 0;

      while (true) {
         if (var10 < var9) {
            java.io.File var11 = var8[var10];
            if (var2 == null) {
               var14 = var11.isDirectory();
               if (var2 != null) {
                  break;
               }

               if (var14 != 0) {
                  var5.add(var11.getName());
               }

               var10++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var14 = var5.contains(var3);
         break;
      }

      if (var2 == null) {
         if (var14 == 0) {
            return var3;
         }

         var14 = 1;
      }

      int var12 = var14;

      while (true) {
         if (var12 < a(16292, 397751338449854115L)) {
            var10000 = var3 + var12;
            if (var2 != null) {
               break;
            }

            var4 = var10000;
            if (var2 == null) {
               if (!var5.contains(var4)) {
                  return var4;
               }

               var12++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   public UV3 O$uV_3() {
      Object var1 = 354859781990372885L;
      return (UV3)Ref.g(354859781990372885L, var1);
   }

   public void l(UV3 var1) {
      long var3 = 354859781990372885L;
      Ref.s(354859781990372885L, var1, var3);
   }

   public KQ p() {
      Object var1 = 313728980571712684L;
      return (KQ)Ref.g(313728980571712684L, var1);
   }

   public void r(KQ var1) {
      long var3 = 313728980571712684L;
      Ref.s(313728980571712684L, var1, var3);
   }

   public UV3 z() {
      Object var1 = 585473904632414414L;
      return (UV3)Ref.g(585473904632414414L, var1);
   }

   public void y(UV3 var1) {
      long var3 = 585473904632414414L;
      Ref.s(585473904632414414L, var1, var3);
   }

   public Ne4 A() {
      Object var1 = 503453149395465632L;
      return (Ne4)Ref.g(503453149395465632L, var1);
   }

   public void M(Ne4 var1) {
      long var3 = 503453149395465632L;
      Ref.s(503453149395465632L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23332) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 131;
               break;
            case 1:
               var10000 = 16;
               break;
            case 2:
               var10000 = 30;
               break;
            case 3:
               var10000 = 185;
               break;
            case 4:
               var10000 = 128;
               break;
            case 5:
               var10000 = 11;
               break;
            case 6:
               var10000 = 19;
               break;
            case 7:
               var10000 = 179;
               break;
            case 8:
               var10000 = 216;
               break;
            case 9:
               var10000 = 60;
               break;
            case 10:
               var10000 = 133;
               break;
            case 11:
               var10000 = 55;
               break;
            case 12:
               var10000 = 77;
               break;
            case 13:
               var10000 = 248;
               break;
            case 14:
               var10000 = 41;
               break;
            case 15:
               var10000 = 197;
               break;
            case 16:
               var10000 = 76;
               break;
            case 17:
               var10000 = 235;
               break;
            case 18:
               var10000 = 134;
               break;
            case 19:
               var10000 = 102;
               break;
            case 20:
               var10000 = 236;
               break;
            case 21:
               var10000 = 25;
               break;
            case 22:
               var10000 = 52;
               break;
            case 23:
               var10000 = 117;
               break;
            case 24:
               var10000 = 157;
               break;
            case 25:
               var10000 = 105;
               break;
            case 26:
               var10000 = 118;
               break;
            case 27:
               var10000 = 153;
               break;
            case 28:
               var10000 = 231;
               break;
            case 29:
               var10000 = 31;
               break;
            case 30:
               var10000 = 202;
               break;
            case 31:
               var10000 = 142;
               break;
            case 32:
               var10000 = 146;
               break;
            case 33:
               var10000 = 152;
               break;
            case 34:
               var10000 = 242;
               break;
            case 35:
               var10000 = 1;
               break;
            case 36:
               var10000 = 56;
               break;
            case 37:
               var10000 = 237;
               break;
            case 38:
               var10000 = 223;
               break;
            case 39:
               var10000 = 144;
               break;
            case 40:
               var10000 = 88;
               break;
            case 41:
               var10000 = 126;
               break;
            case 42:
               var10000 = 113;
               break;
            case 43:
               var10000 = 75;
               break;
            case 44:
               var10000 = 104;
               break;
            case 45:
               var10000 = 22;
               break;
            case 46:
               var10000 = 203;
               break;
            case 47:
               var10000 = 221;
               break;
            case 48:
               var10000 = 111;
               break;
            case 49:
               var10000 = 65;
               break;
            case 50:
               var10000 = 129;
               break;
            case 51:
               var10000 = 98;
               break;
            case 52:
               var10000 = 232;
               break;
            case 53:
               var10000 = 103;
               break;
            case 54:
               var10000 = 217;
               break;
            case 55:
               var10000 = 192;
               break;
            case 56:
               var10000 = 108;
               break;
            case 57:
               var10000 = 138;
               break;
            case 58:
               var10000 = 206;
               break;
            case 59:
               var10000 = 154;
               break;
            case 60:
               var10000 = 175;
               break;
            case 61:
               var10000 = 255;
               break;
            case 62:
               var10000 = 207;
               break;
            case 63:
               var10000 = 91;
               break;
            case 64:
               var10000 = 241;
               break;
            case 65:
               var10000 = 251;
               break;
            case 66:
               var10000 = 109;
               break;
            case 67:
               var10000 = 159;
               break;
            case 68:
               var10000 = 120;
               break;
            case 69:
               var10000 = 34;
               break;
            case 70:
               var10000 = 198;
               break;
            case 71:
               var10000 = 158;
               break;
            case 72:
               var10000 = 89;
               break;
            case 73:
               var10000 = 15;
               break;
            case 74:
               var10000 = 71;
               break;
            case 75:
               var10000 = 119;
               break;
            case 76:
               var10000 = 107;
               break;
            case 77:
               var10000 = 174;
               break;
            case 78:
               var10000 = 67;
               break;
            case 79:
               var10000 = 112;
               break;
            case 80:
               var10000 = 150;
               break;
            case 81:
               var10000 = 81;
               break;
            case 82:
               var10000 = 214;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 17;
               break;
            case 85:
               var10000 = 193;
               break;
            case 86:
               var10000 = 224;
               break;
            case 87:
               var10000 = 228;
               break;
            case 88:
               var10000 = 166;
               break;
            case 89:
               var10000 = 230;
               break;
            case 90:
               var10000 = 164;
               break;
            case 91:
               var10000 = 45;
               break;
            case 92:
               var10000 = 163;
               break;
            case 93:
               var10000 = 50;
               break;
            case 94:
               var10000 = 213;
               break;
            case 95:
               var10000 = 100;
               break;
            case 96:
               var10000 = 210;
               break;
            case 97:
               var10000 = 93;
               break;
            case 98:
               var10000 = 239;
               break;
            case 99:
               var10000 = 156;
               break;
            case 100:
               var10000 = 123;
               break;
            case 101:
               var10000 = 124;
               break;
            case 102:
               var10000 = 249;
               break;
            case 103:
               var10000 = 200;
               break;
            case 104:
               var10000 = 189;
               break;
            case 105:
               var10000 = 168;
               break;
            case 106:
               var10000 = 49;
               break;
            case 107:
               var10000 = 73;
               break;
            case 108:
               var10000 = 106;
               break;
            case 109:
               var10000 = 61;
               break;
            case 110:
               var10000 = 64;
               break;
            case 111:
               var10000 = 140;
               break;
            case 112:
               var10000 = 227;
               break;
            case 113:
               var10000 = 135;
               break;
            case 114:
               var10000 = 101;
               break;
            case 115:
               var10000 = 250;
               break;
            case 116:
               var10000 = 5;
               break;
            case 117:
               var10000 = 254;
               break;
            case 118:
               var10000 = 180;
               break;
            case 119:
               var10000 = 35;
               break;
            case 120:
               var10000 = 225;
               break;
            case 121:
               var10000 = 176;
               break;
            case 122:
               var10000 = 42;
               break;
            case 123:
               var10000 = 80;
               break;
            case 124:
               var10000 = 238;
               break;
            case 125:
               var10000 = 139;
               break;
            case 126:
               var10000 = 137;
               break;
            case 127:
               var10000 = 95;
               break;
            case 128:
               var10000 = 188;
               break;
            case 129:
               var10000 = 253;
               break;
            case 130:
               var10000 = 14;
               break;
            case 131:
               var10000 = 21;
               break;
            case 132:
               var10000 = 26;
               break;
            case 133:
               var10000 = 84;
               break;
            case 134:
               var10000 = 209;
               break;
            case 135:
               var10000 = 201;
               break;
            case 136:
               var10000 = 199;
               break;
            case 137:
               var10000 = 147;
               break;
            case 138:
               var10000 = 130;
               break;
            case 139:
               var10000 = 78;
               break;
            case 140:
               var10000 = 170;
               break;
            case 141:
               var10000 = 28;
               break;
            case 142:
               var10000 = 38;
               break;
            case 143:
               var10000 = 115;
               break;
            case 144:
               var10000 = 66;
               break;
            case 145:
               var10000 = 208;
               break;
            case 146:
               var10000 = 183;
               break;
            case 147:
               var10000 = 23;
               break;
            case 148:
               var10000 = 229;
               break;
            case 149:
               var10000 = 29;
               break;
            case 150:
               var10000 = 92;
               break;
            case 151:
               var10000 = 169;
               break;
            case 152:
               var10000 = 3;
               break;
            case 153:
               var10000 = 97;
               break;
            case 154:
               var10000 = 6;
               break;
            case 155:
               var10000 = 7;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 86;
               break;
            case 158:
               var10000 = 48;
               break;
            case 159:
               var10000 = 184;
               break;
            case 160:
               var10000 = 161;
               break;
            case 161:
               var10000 = 149;
               break;
            case 162:
               var10000 = 70;
               break;
            case 163:
               var10000 = 13;
               break;
            case 164:
               var10000 = 69;
               break;
            case 165:
               var10000 = 141;
               break;
            case 166:
               var10000 = 72;
               break;
            case 167:
               var10000 = 12;
               break;
            case 168:
               var10000 = 62;
               break;
            case 169:
               var10000 = 79;
               break;
            case 170:
               var10000 = 39;
               break;
            case 171:
               var10000 = 187;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 90;
               break;
            case 174:
               var10000 = 151;
               break;
            case 175:
               var10000 = 8;
               break;
            case 176:
               var10000 = 18;
               break;
            case 177:
               var10000 = 37;
               break;
            case 178:
               var10000 = 233;
               break;
            case 179:
               var10000 = 246;
               break;
            case 180:
               var10000 = 83;
               break;
            case 181:
               var10000 = 125;
               break;
            case 182:
               var10000 = 240;
               break;
            case 183:
               var10000 = 63;
               break;
            case 184:
               var10000 = 33;
               break;
            case 185:
               var10000 = 96;
               break;
            case 186:
               var10000 = 167;
               break;
            case 187:
               var10000 = 219;
               break;
            case 188:
               var10000 = 54;
               break;
            case 189:
               var10000 = 243;
               break;
            case 190:
               var10000 = 245;
               break;
            case 191:
               var10000 = 247;
               break;
            case 192:
               var10000 = 226;
               break;
            case 193:
               var10000 = 0;
               break;
            case 194:
               var10000 = 114;
               break;
            case 195:
               var10000 = 99;
               break;
            case 196:
               var10000 = 212;
               break;
            case 197:
               var10000 = 173;
               break;
            case 198:
               var10000 = 165;
               break;
            case 199:
               var10000 = 205;
               break;
            case 200:
               var10000 = 171;
               break;
            case 201:
               var10000 = 10;
               break;
            case 202:
               var10000 = 145;
               break;
            case 203:
               var10000 = 74;
               break;
            case 204:
               var10000 = 195;
               break;
            case 205:
               var10000 = 2;
               break;
            case 206:
               var10000 = 215;
               break;
            case 207:
               var10000 = 190;
               break;
            case 208:
               var10000 = 68;
               break;
            case 209:
               var10000 = 220;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 36;
               break;
            case 212:
               var10000 = 87;
               break;
            case 213:
               var10000 = 44;
               break;
            case 214:
               var10000 = 148;
               break;
            case 215:
               var10000 = 186;
               break;
            case 216:
               var10000 = 136;
               break;
            case 217:
               var10000 = 47;
               break;
            case 218:
               var10000 = 127;
               break;
            case 219:
               var10000 = 116;
               break;
            case 220:
               var10000 = 43;
               break;
            case 221:
               var10000 = 53;
               break;
            case 222:
               var10000 = 51;
               break;
            case 223:
               var10000 = 94;
               break;
            case 224:
               var10000 = 132;
               break;
            case 225:
               var10000 = 182;
               break;
            case 226:
               var10000 = 155;
               break;
            case 227:
               var10000 = 57;
               break;
            case 228:
               var10000 = 143;
               break;
            case 229:
               var10000 = 196;
               break;
            case 230:
               var10000 = 20;
               break;
            case 231:
               var10000 = 58;
               break;
            case 232:
               var10000 = 218;
               break;
            case 233:
               var10000 = 59;
               break;
            case 234:
               var10000 = 211;
               break;
            case 235:
               var10000 = 177;
               break;
            case 236:
               var10000 = 46;
               break;
            case 237:
               var10000 = 191;
               break;
            case 238:
               var10000 = 234;
               break;
            case 239:
               var10000 = 222;
               break;
            case 240:
               var10000 = 110;
               break;
            case 241:
               var10000 = 9;
               break;
            case 242:
               var10000 = 162;
               break;
            case 243:
               var10000 = 244;
               break;
            case 244:
               var10000 = 160;
               break;
            case 245:
               var10000 = 181;
               break;
            case 246:
               var10000 = 178;
               break;
            case 247:
               var10000 = 172;
               break;
            case 248:
               var10000 = 122;
               break;
            case 249:
               var10000 = 252;
               break;
            case 250:
               var10000 = 40;
               break;
            case 251:
               var10000 = 194;
               break;
            case 252:
               var10000 = 204;
               break;
            case 253:
               var10000 = 121;
               break;
            case 254:
               var10000 = 32;
               break;
            default:
               var10000 = 4;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24840;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long var37;
      byte var42;
      String[] var13 = new String[33];
      int var11 = 0;
      String var10 = "冤郖\u000eb\u009a¾:m\u000f\u0091f\r\u000f\n4·f\u0005旃幃斜五夎'Ç÷ÀaK\u0004Ð4|\u0012l]sãè¸\u009dpt¸d±æé¨\n¬\\\u008a\u0081O{qg}FOõ\n\u0002凶郚\n杳弒瘯厷辛\u0005X\u0084劻逐\u000e\u0096\\ â¾\u0014ë\u0005Bcã¹\u008a×\u0006\u009f\u008e7¸y\u008e<F\u0005Âz´í\u008b\u0097\u008b¿º@K\u0019y¨µ~\bä#\u001f¯c\u0080Ê\u000bJk×Ñÿ}-\u008baÆ\u008e Có^1B5\fÀ\b\u000er\u0086Eã\u0097¿\u0092\u008fX\u0004·\u0002窊厼\u0006\n\u0080Æ[@F\u0014èpý\u0006DÊ\u0088\u008b\u0098\rªb\u008ehÿ\u0017õÜèp\u0002捈轩\u0013åé TÿÄÈ\u009fro'\u0016ª\u009eo±î±²'¿9Ï¸ª?ìSûþ\u009cÀmP+Îå¾{a\u0085\u008aÚ\u008e/æ\\Á\u00942\u008c\r\t©r\u009f®Î6\u000b´\u0088®\u008e\u0086ùb\u0082Pú©\u0002亘未\u0002亻朓\u0003疔戾呷\u0002窗厡\u000f輙童棭霛轵挚e¯ÓãõcÓ{`\u0003疭截呐\u0002掚輙\n\u0001F\u0001,\tÂÇ);¬\u00158\u0018ç\u000b\u0007kà\u00ad\u0084\u0087\u001fï\u008eÆ\u008c2\u0080\u000e*¶º\u0015 JôAe\"¬\u0095\u000b±(am\\Ua»dMûV\u0002哶祻\u0010+\u009dDW¡\u00adÄÚ\u0087\u0018u{\u0093È_\u009f\b8\b\u0080J\u0088d5\u008d\u0016\u0012ì¢\u0095¯¸õÃ ÞE\u0088ËÉÈ~yA3K\u0005Ú\u0002咹禅";
      int var12 = "冤郖\u000eb\u009a¾:m\u000f\u0091f\r\u000f\n4·f\u0005旃幃斜五夎'Ç÷ÀaK\u0004Ð4|\u0012l]sãè¸\u009dpt¸d±æé¨\n¬\\\u008a\u0081O{qg}FOõ\n\u0002凶郚\n杳弒瘯厷辛\u0005X\u0084劻逐\u000e\u0096\\ â¾\u0014ë\u0005Bcã¹\u008a×\u0006\u009f\u008e7¸y\u008e<F\u0005Âz´í\u008b\u0097\u008b¿º@K\u0019y¨µ~\bä#\u001f¯c\u0080Ê\u000bJk×Ñÿ}-\u008baÆ\u008e Có^1B5\fÀ\b\u000er\u0086Eã\u0097¿\u0092\u008fX\u0004·\u0002窊厼\u0006\n\u0080Æ[@F\u0014èpý\u0006DÊ\u0088\u008b\u0098\rªb\u008ehÿ\u0017õÜèp\u0002捈轩\u0013åé TÿÄÈ\u009fro'\u0016ª\u009eo±î±²'¿9Ï¸ª?ìSûþ\u009cÀmP+Îå¾{a\u0085\u008aÚ\u008e/æ\\Á\u00942\u008c\r\t©r\u009f®Î6\u000b´\u0088®\u008e\u0086ùb\u0082Pú©\u0002亘未\u0002亻朓\u0003疔戾呷\u0002窗厡\u000f輙童棭霛轵挚e¯ÓãõcÓ{`\u0003疭截呐\u0002掚輙\n\u0001F\u0001,\tÂÇ);¬\u00158\u0018ç\u000b\u0007kà\u00ad\u0084\u0087\u001fï\u008eÆ\u008c2\u0080\u000e*¶º\u0015 JôAe\"¬\u0095\u000b±(am\\Ua»dMûV\u0002哶祻\u0010+\u009dDW¡\u00adÄÚ\u0087\u0018u{\u0093È_\u009f\b8\b\u0080J\u0088d5\u008d\u0016\u0012ì¢\u0095¯¸õÃ ÞE\u0088ËÉÈ~yA3K\u0005Ú\u0002咹禅"
         .length();
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 33;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               var42 = var10000;
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
                        var65 = 100;
                        break;
                     case 1:
                        var65 = 63;
                        break;
                     case 2:
                        var65 = 76;
                        break;
                     case 3:
                        var65 = 77;
                        break;
                     case 4:
                        var65 = 95;
                        break;
                     case 5:
                        var65 = 94;
                        break;
                     default:
                        var65 = 8;
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
                     c = new String[33];
                     long var0 = 513129469774749519L;
                     long[] var6 = new long[33];
                     int var3 = 0;
                     String var4 = "¥ÏÜÔè´\r ¤Õ\u0099ÏòS\u0099¡¢@\u0081òT\u0017\u0085¿ï\u009c?\u0007¡h'`\u00adÍü\u0093:³®æç¡ÇGÿÿnZÓ\u001cæ-ö¸º\u0098\u0099ÀÂP¾¦\u008e\tL]\u0086¸L\u0017où\u0086Qd\u0098=·ÿ\u0016ªº\\4\u001dÑ`Ùb'ïÇ½ì_\u0096{Ga¨3øjc\u008clÒú[Jñ¯¡)\u0015}÷\u0085Ã\u0096²F\nL\u009c\u0088\u0001\u0088<úòGÊ¨`\u0002\u0015\u0018g¾µ \\Í\u0096.Ú\u0019Á\u0011Ø¡\u009eÕJßI²¯¢ß\u0089\u0091þöv>Ï¢_\u000bw\u0003WV\u009f\u0013\u009bTG\u00047{\"!ê¬\u0016bì\u007fÐ:Q\u0083·G\u0087\u0018³XûÛ\u0089R!&(´~+AOÂ\u0093¯6+\u001c,\u001f\u001aÃA\u009bf1â@\u0010C+Å!0ü\u0018r\u0011\u0086ß3TH7\u0014ï\u0006";
                     int var5 = "¥ÏÜÔè´\r ¤Õ\u0099ÏòS\u0099¡¢@\u0081òT\u0017\u0085¿ï\u009c?\u0007¡h'`\u00adÍü\u0093:³®æç¡ÇGÿÿnZÓ\u001cæ-ö¸º\u0098\u0099ÀÂP¾¦\u008e\tL]\u0086¸L\u0017où\u0086Qd\u0098=·ÿ\u0016ªº\\4\u001dÑ`Ùb'ïÇ½ì_\u0096{Ga¨3øjc\u008clÒú[Jñ¯¡)\u0015}÷\u0085Ã\u0096²F\nL\u009c\u0088\u0001\u0088<úòGÊ¨`\u0002\u0015\u0018g¾µ \\Í\u0096.Ú\u0019Á\u0011Ø¡\u009eÕJßI²¯¢ß\u0089\u0091þöv>Ï¢_\u000bw\u0003WV\u009f\u0013\u009bTG\u00047{\"!ê¬\u0016bì\u007fÐ:Q\u0083·G\u0087\u0018³XûÛ\u0089R!&(´~+AOÂ\u0093¯6+\u001c,\u001f\u001aÃA\u009bf1â@\u0010C+Å!0ü\u0018r\u0011\u0086ß3TH7\u0014ï\u0006"
                        .length();
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
                                    d = var6;
                                    e = new Integer[33];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Î_\u0088L\u0096\"óè(\"¡\u0092ðü~\u0083";
                                 var5 = "Î_\u0088L\u0096\"óè(\"¡\u0092ðü~\u0083".length();
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

                  var10 = "昂禁嵠刬雹\fú\u0090\u0005辴捹§zô1\u0084¼_";
                  var12 = "昂禁嵠刬雹\fú\u0090\u0005辴捹§zô1\u0084¼_".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 46;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





