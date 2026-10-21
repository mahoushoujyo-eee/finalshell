package com.finalshell.ui.frame;

import com.finalshell.core.BJ;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.listener.Bt2;
import com.finalshell.ui.listener.FD;
import com.finalshell.ui.listener.LW3;
import com.finalshell.ui.listener.X82;
import com.finalshell.ui.listener.YW3;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.Edit;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.PublicKey;
import com.finalshell.ui.panel.Reconnect;
import com.finalshell.ui.panel.TerminalHint;
import com.finalshell.ui.panel.TunnelList;
import com.finalshell.ui.panel.Z7;
import com.finalshell.ui.panel.Z8;
import java.awt.Component;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import net.miginfocom.swing.MigLayout;

public class Km4 extends JFrame {
   public JPanel n;
   public JPanel J;
   public Z8 w;
   public Lv4_2 W;
   public ArrayList q;
   public Vg2 N;
   public AA B;
   public DefaultMutableTreeNode A;
   public DefaultMutableTreeNode L;
   public long P;
   public Km4 f;
   public String D;
   public static boolean j;
   public KQ r;
   public boolean g;
   public DefaultMutableTreeNode V;
   public DefaultMutableTreeNode C;
   public Edit t;
   public DefaultMutableTreeNode c;
   public TunnelList F;
   public TerminalHint h;
   public String O;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public Km4(String var1, KQ var2, Window var3, Lv4_2 var4, DefaultMutableTreeNode var5) {
      ArrayList var10001 = new ArrayList();
      long var21 = 282174882298955991L;
      ArrayList var20 = var10001;
      Ref.s(282174882298955991L, var20, var21);
      long var23 = 192015943206609872L;
      Object var22 = null;
      Ref.s(192015943206609872L, var22, var23);
      Z7.M();
      long var25 = 595819195510091629L;
      Object var24 = null;
      Ref.s(595819195510091629L, var24, var25);
      long var27 = 578607023926813312L;
      Object var26 = null;
      Ref.s(578607023926813312L, var26, var27);
      Registry.lookupField(423197961904551339L).setBoolean(this, false);
      long var29 = 241687581993549108L;
      Ref.s(241687581993549108L, var5, var29);
      if (this == null) {
         if (var2 != null) {
            Object[] var10006 = Registry.packArgs(true);
            long var31 = 480031414946709658L;
            Object[] var30 = var10006;
            Ref.h(480031414946709658L, var30, var31);

            try {
               ;
            } catch (InvocationTargetException var240) {
               throw var240.getTargetException();
            }

            Object[] var10007 = Registry.packArgs(true);
            long var33 = 438941361784812150L;
            Object[] var32 = var10007;
            Ref.h(438941361784812150L, var32, var33);

            try {
               ;
            } catch (InvocationTargetException var239) {
               throw var239.getTargetException();
            }
         }

         long var35 = 193644890840143673L;
         Ref.s(193644890840143673L, var4, var35);
      }

      label268: {
         if (this == null) {
            Object var36 = 193644890840143673L;
            if ((Lv4_2)Ref.g(193644890840143673L, var36) != null) {
               Registry.lookupField(423197961904551339L).setBoolean(this, true);
               new StringBuilder();
               Object var38 = 193644890840143673L;
               Object var10009 = Ref.g(193644890840143673L, var38);
               String var10010 = (String)(Registry.emptyArgs());
               long var41 = 286931176286176762L;
               Object[] var40 = var10010;
               var10010 = Ref.h(286931176286176762L, var40, var41);

               try {
                  var10010 = (String)var10010;
               } catch (InvocationTargetException var238) {
                  throw var238.getTargetException();
               }

               this.setTitle(var10009.append((String)var10010).append(a(-2282, 29772)).toString());
               Registry.emptyArgs();
               long var42 = 270389152141252877L;
               Ref.h2(270389152141252877L, var42);
               var10010 = Registry.emptyArgs();
               long var45 = 271043866899908885L;
               Object[] var44 = var10010;
               Ref.h(271043866899908885L, var44, var45);
               Object var46 = 193644890840143673L;
               Ref.g(193644890840143673L, var46);
               Object[] var10013 = Registry.emptyArgs();
               long var49 = 292557478156152530L;
               Object[] var48 = var10013;
               var10013 = Registry.packArgs(Ref.h(292557478156152530L, var48, var49), this);
               long var51 = 332759013866444339L;
               Object[] var50 = var10013;
               Ref.h(332759013866444339L, var50, var51);

               try {
                  ;
               } catch (InvocationTargetException var237) {
                  throw var237.getTargetException();
               }

               if (this == null) {
                  break label268;
               }

               Ky4.K(new String[5]);
            }
         }

         this.setTitle(a(-2304, 14109));
      }

      long var53 = 609836235334352119L;
      Ref.s(609836235334352119L, var2, var53);
      long var55 = 439712263545556590L;
      Ref.s(439712263545556590L, var1, var55);
      long var57 = 554470559852787945L;
      Ref.s(554470559852787945L, this, var57);
      this.setLayout(new MigLayout(a(-2286, 27822), a(-2300, -6522), a(-2287, -29895)));
      JPanel var242 = new JPanel();
      long var59 = 588650377534203287L;
      JPanel var58 = var242;
      Ref.s(588650377534203287L, var58, var59);
      Object var60 = 588650377534203287L;
      ((JPanel)Ref.g(588650377534203287L, var60)).setLayout(new MigLayout(a(-2279, -6006), a(-2280, -17856), a(-2285, -24345)));
      Object var62 = 588650377534203287L;
      this.add((JPanel)Ref.g(588650377534203287L, var62), a(-2293, 30020));
      JScrollPane var7 = new JScrollPane();
      var7.getVerticalScrollBar().setUnitIncrement(a(24380, 1867328803612690682L));
      Object var64 = 588650377534203287L;
      ((JPanel)Ref.g(588650377534203287L, var64)).add(var7, a(-2289, 13771));
      Z8 var247 = new Z8();
      long var67 = 631372995965003737L;
      Z8 var66 = var247;
      Ref.s(631372995965003737L, var66, var67);
      PublicKey var10014;
      Object var68 = 439712263545556590L;
      super((String)Ref.g(439712263545556590L, var68), Registry.lookupField(423197961904551339L).getBoolean(this));
      PublicKey var8 = var10014;
      Object var70 = 282174882298955991L;
      ((ArrayList)Ref.g(282174882298955991L, var70)).add(var8);
      Object var72 = 631372995965003737L;
      Ref.g(631372995965003737L, var72);
      Object[] var10017 = Registry.packArgs(var8);
      long var75 = 551450432066951191L;
      Object[] var74 = var10017;
      Ref.h(551450432066951191L, var74, var75);

      try {
         ;
      } catch (InvocationTargetException var236) {
         throw var236.getTargetException();
      }

      Reconnect var9 = new Reconnect();
      Object var76 = 282174882298955991L;
      ((ArrayList)Ref.g(282174882298955991L, var76)).add(var9);
      Object var78 = 631372995965003737L;
      Ref.g(631372995965003737L, var78);
      Object[] var10020 = Registry.packArgs(var9);
      long var81 = 551450432066951191L;
      Object[] var80 = var10020;
      Ref.h(551450432066951191L, var80, var81);

      try {
         ;
      } catch (InvocationTargetException var235) {
         throw var235.getTargetException();
      }

      AA var10021 = new AA();
      long var83 = 595819195510091629L;
      AA var82 = var10021;
      Ref.s(595819195510091629L, var82, var83);
      Object var84 = 595819195510091629L;
      ((AA)Ref.g(595819195510091629L, var84)).setRootVisible(false);
      Object var86 = 595819195510091629L;
      ((AA)Ref.g(595819195510091629L, var86)).setFocusable(false);
      Object var88 = 595819195510091629L;
      ((AA)Ref.g(595819195510091629L, var88)).getSelectionModel().setSelectionMode(1);
      Object var90 = 595819195510091629L;
      this.setViewportView((AA)Ref.g(595819195510091629L, var90));
      Object var92 = 595819195510091629L;
      DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)((AA)Ref.g(595819195510091629L, var92)).getModel().getRoot();
      BJ var11 = new BJ();
      Object[] var10027 = Registry.packArgs(a(-2276, -20977));
      long var95 = 179928667197536173L;
      Object[] var94 = var10027;
      Ref.h(179928667197536173L, var94, var95);

      try {
         ;
      } catch (InvocationTargetException var234) {
         throw var234.getTargetException();
      }

      Object[] var10028 = Registry.packArgs(Registry.lookupField(153892563842185940L).getInt(null));
      long var97 = 404948097134317144L;
      Object[] var96 = var10028;
      Ref.h(404948097134317144L, var96, var97);

      try {
         ;
      } catch (InvocationTargetException var233) {
         throw var233.getTargetException();
      }

      var10.setUserObject(a(-2284, -30425));
      DefaultTreeModel var12 = new DefaultTreeModel(var10);
      var10.removeAllChildren();
      DefaultMutableTreeNode var13 = new DefaultMutableTreeNode(a(-2283, 2717));
      var10.add(var13);
      Object[] var10029 = Registry.packArgs(var13);
      long var99 = 379808289092320154L;
      Object[] var98 = var10029;
      Ref.h(379808289092320154L, var98, var99);

      try {
         ;
      } catch (InvocationTargetException var232) {
         throw var232.getTargetException();
      }

      new DefaultMutableTreeNode(a(-2273, -27927));
      DefaultMutableTreeNode var15 = new DefaultMutableTreeNode(a(-2277, -18805));
      Object[] var10030 = Registry.packArgs(var15);
      long var101 = 379808289092320154L;
      Object[] var100 = var10030;
      Ref.h(379808289092320154L, var100, var101);

      try {
         ;
      } catch (InvocationTargetException var231) {
         throw var231.getTargetException();
      }

      TerminalHint var10031 = new TerminalHint();
      long var103 = 162577328667343549L;
      TerminalHint var102 = var10031;
      Ref.s(162577328667343549L, var102, var103);
      Object var104 = 282174882298955991L;
      ArrayList var10032 = (ArrayList)Ref.g(282174882298955991L, var104);
      Object var106 = 162577328667343549L;
      this.add((TerminalHint)Ref.g(162577328667343549L, var106));
      Object var108 = 631372995965003737L;
      Ref.g(631372995965003737L, var108);
      Object var110 = 162577328667343549L;
      Object[] var10036 = Registry.packArgs(Ref.g(162577328667343549L, var110));
      long var113 = 551450432066951191L;
      Object[] var112 = var10036;
      Ref.h(551450432066951191L, var112, var113);

      try {
         ;
      } catch (InvocationTargetException var230) {
         throw var230.getTargetException();
      }

      DefaultMutableTreeNode var16 = new DefaultMutableTreeNode(a(-2292, 26384));
      var13.add(var16);
      DefaultMutableTreeNode var17 = new DefaultMutableTreeNode(a(-2278, 25367));
      var17.add(new DefaultMutableTreeNode(a(-2288, -5238)));
      DefaultMutableTreeNode var10037 = new DefaultMutableTreeNode(a(-2294, 23694));
      long var115 = 140172852301764786L;
      DefaultMutableTreeNode var114 = var10037;
      Ref.s(140172852301764786L, var114, var115);
      Object var116 = 140172852301764786L;
      this.add((DefaultMutableTreeNode)Ref.g(140172852301764786L, var116));
      Edit var10039 = new Edit();
      long var119 = 535177121277639390L;
      Edit var118 = var10039;
      Ref.s(535177121277639390L, var118, var119);
      Object var120 = 282174882298955991L;
      ArrayList var10040 = (ArrayList)Ref.g(282174882298955991L, var120);
      Object var122 = 535177121277639390L;
      this.add((Edit)Ref.g(535177121277639390L, var122));
      Object var124 = 631372995965003737L;
      Ref.g(631372995965003737L, var124);
      Object var126 = 535177121277639390L;
      Object[] var10044 = Registry.packArgs(Ref.g(535177121277639390L, var126));
      long var129 = 551450432066951191L;
      Object[] var128 = var10044;
      Ref.h(551450432066951191L, var128, var129);

      try {
         ;
      } catch (InvocationTargetException var229) {
         throw var229.getTargetException();
      }

      DefaultMutableTreeNode var10045 = new DefaultMutableTreeNode(a(-2295, 28714));
      long var131 = 579289540698555524L;
      DefaultMutableTreeNode var130 = var10045;
      Ref.s(579289540698555524L, var130, var131);
      Object var132 = 579289540698555524L;
      this.add((DefaultMutableTreeNode)Ref.g(579289540698555524L, var132));
      TunnelList var10047 = new TunnelList();
      long var135 = 543324707110410118L;
      TunnelList var134 = var10047;
      Ref.s(543324707110410118L, var134, var135);
      Object var136 = 282174882298955991L;
      ArrayList var10048 = (ArrayList)Ref.g(282174882298955991L, var136);
      Object var138 = 543324707110410118L;
      this.add((TunnelList)Ref.g(543324707110410118L, var138));
      Object var140 = 631372995965003737L;
      Ref.g(631372995965003737L, var140);
      Object var142 = 543324707110410118L;
      Object[] var10052 = Registry.packArgs(Ref.g(543324707110410118L, var142));
      long var145 = 551450432066951191L;
      Object[] var144 = var10052;
      Ref.h(551450432066951191L, var144, var145);

      try {
         ;
      } catch (InvocationTargetException var228) {
         throw var228.getTargetException();
      }

      Object var146 = 595819195510091629L;
      ((AA)Ref.g(595819195510091629L, var146)).setModel(var12);
      Object var148 = 595819195510091629L;
      Ref.g(595819195510091629L, var148);
      Object[] var10055 = Registry.emptyArgs();
      long var151 = 606838486540289950L;
      Object[] var150 = var10055;
      Ref.h(606838486540289950L, var150, var151);

      try {
         ;
      } catch (InvocationTargetException var227) {
         throw var227.getTargetException();
      }

      label258: {
         Object var152 = 595819195510091629L;
         ((AA)Ref.g(595819195510091629L, var152)).addTreeSelectionListener(new X82(this, var13, var8, var15, var9, var16));
         Object var154 = 595819195510091629L;
         ((AA)Ref.g(595819195510091629L, var154)).addMouseListener(new FD(this));
         Object var156 = 588650377534203287L;
         JPanel var10058 = (JPanel)Ref.g(588650377534203287L, var156);
         Object var158 = 631372995965003737L;
         this.add((Z8)Ref.g(631372995965003737L, var158), a(-2281, 25426));
         JPanel var10060 = new JPanel();
         long var161 = 270076967019229732L;
         JPanel var160 = var10060;
         Ref.s(270076967019229732L, var160, var161);
         Object var162 = 270076967019229732L;
         this.add((JPanel)Ref.g(270076967019229732L, var162), a(-2291, -24128));
         Object var164 = 270076967019229732L;
         ((JPanel)Ref.g(270076967019229732L, var164)).setLayout(new MigLayout(a(-2290, 14501)));
         JButton var18 = new JButton(a(-2303, 23197));
         var18.setFocusable(false);
         Object var166 = 270076967019229732L;
         ((JPanel)Ref.g(270076967019229732L, var166)).add(var18);
         JButton var10063 = var18;
         if (this == null) {
            var18.addActionListener(new YW3(this));
            if (Registry.lookupField(423197961904551339L).getBoolean(this)) {
               JButton var19 = new JButton(a(-2302, 10772));
               var19.setFocusable(false);
               Object var168 = 270076967019229732L;
               ((JPanel)Ref.g(270076967019229732L, var168)).add(var19);
               var19.addActionListener(new Bt2(this));
               if (this == null) {
                  break label258;
               }
            }

            var10063 = var18;
         }

         var10063.setText(a(-2275, -19891));
      }

      JButton var241 = new JButton(a(-2301, 1895));
      var241.setFocusable(false);
      Object var170 = 270076967019229732L;
      ((JPanel)Ref.g(270076967019229732L, var170)).add(var241);
      var241.addActionListener(new LW3(this));
      long var173 = 456154352713079276L;
      Ref.s(456154352713079276L, var13, var173);
      Object var174 = 595819195510091629L;
      Ref.g(595819195510091629L, var174);
      Object[] var10067 = Registry.packArgs(var13);
      long var177 = 243902657553228984L;
      Object[] var176 = var10067;
      Ref.h(243902657553228984L, var176, var177);

      try {
         ;
      } catch (InvocationTargetException var226) {
         throw var226.getTargetException();
      }

      label274: {
         if (this == null) {
            if (!Registry.lookupField(423197961904551339L).getBoolean(this)) {
               Lv4_2 var10068 = new Lv4_2();
               long var179 = 193644890840143673L;
               Lv4_2 var178 = var10068;
               Ref.s(193644890840143673L, var178, var179);
               Object var180 = 193644890840143673L;
               Ref.g(193644890840143673L, var180);
               Object var182 = 439712263545556590L;
               Object[] var10071 = Registry.packArgs(Ref.g(439712263545556590L, var182));
               long var185 = 189603700854791470L;
               Object[] var184 = var10071;
               Ref.h(189603700854791470L, var184, var185);

               try {
                  ;
               } catch (InvocationTargetException var225) {
                  throw var225.getTargetException();
               }

               Object var186 = 193644890840143673L;
               Ref.g(193644890840143673L, var186);
               Object[] var10073 = Registry.packArgs(a(28684, 1972638061992749003L));
               long var189 = 386290519648630578L;
               Object[] var188 = var10073;
               Ref.h(386290519648630578L, var188, var189);

               try {
                  ;
               } catch (InvocationTargetException var224) {
                  throw var224.getTargetException();
               }

               Object var190 = 193644890840143673L;
               Object[] var10075 = Registry.packArgs(Ref.g(193644890840143673L, var190));
               long var193 = 185698526593741583L;
               Object[] var192 = var10075;
               Ref.h(185698526593741583L, var192, var193);

               try {
                  ;
               } catch (InvocationTargetException var223) {
                  throw var223.getTargetException();
               }

               if (this == null) {
                  break label274;
               }
            }

            Object var194 = 193644890840143673L;
            Ref.g(193644890840143673L, var194);
            Object[] var10070 = Registry.emptyArgs();
            long var197 = 286931176286176762L;
            Object[] var196 = var10070;
            var10070 = Ref.h(286931176286176762L, var196, var197);
            long var199 = 589187491190408666L;
            Object var198 = var10070;
            Ref.s(589187491190408666L, var198, var199);
         }

         Object var200 = 193644890840143673L;
         Object[] var10069 = Registry.packArgs(Ref.g(193644890840143673L, var200));
         long var203 = 185698526593741583L;
         Object[] var202 = var10069;
         Ref.h(185698526593741583L, var202, var203);

         try {
            ;
         } catch (InvocationTargetException var222) {
            throw var222.getTargetException();
         }
      }

      this.pack();
      Registry.emptyArgs();
      long var204 = 253808553645062345L;
      Km4 var249 = (Km4)Ref.h2(253808553645062345L, var204);

      try {
         var249 = (Boolean)var249;
      } catch (InvocationTargetException var221) {
         throw var221.getTargetException();
      }

      Object[] var251;
      label276: {
         if (this == null) {
            if (var249 == null) {
               this.setAlwaysOnTop(true);
            }

            var249 = this;
            var251 = Registry.emptyArgs();
            long var206 = 270389152141252877L;
            Ref.h2(270389152141252877L, var206);
            Object[] var252 = Registry.emptyArgs();
            long var209 = 634817973682994708L;
            Object[] var208 = var252;
            Ref.h(634817973682994708L, var208, var209);
            Km4 var10074 = Registry.emptyArgs();
            long var211 = 240567170779145617L;
            Object[] var210 = var10074;
            var10074 = (Km4)Ref.h(240567170779145617L, var210, var211);
            U var254 = (U)(Registry.emptyArgs());
            long var213 = 402818413346430437L;
            Object[] var212 = var254;
            var254 = Ref.h(402818413346430437L, var212, var213);

            try {
               var254 = (U)var254;
            } catch (InvocationTargetException var220) {
               throw var220.getTargetException();
            }

            var10074.setLocationRelativeTo(var254);
            if (this == null) {
               break label276;
            }

            var254 = Registry.packArgs(true);
            long var215 = 433716955203722428L;
            Object[] var214 = var254;
            Ref.h(433716955203722428L, var214, var215);

            try {
               ;
            } catch (InvocationTargetException var219) {
               throw var219.getTargetException();
            }

            Registry.lookupField(171155657610638129L).setBoolean(null, true);
            Registry.emptyArgs();
            long var216 = 253808553645062345L;
            Object var10076 = Ref.h2(253808553645062345L, var216);

            try {
            } catch (InvocationTargetException var218) {
               throw var218.getTargetException();
            }
         }

         if (var249 == null) {
            return;
         }

         var249 = this;
         var251 = false;
      }

      var249.setAlwaysOnTop((boolean)var251);
   }

   public void S(Lv4_2 var1) {
      Z7.M();
      Object var5 = 282174882298955991L;
      Iterator var3 = ((ArrayList)Ref.g(282174882298955991L, var5)).iterator();
      Km4 var2 = this;

      while (var3.hasNext()) {
         Z7 var4 = (Z7)var3.next();
         Object[] var10002 = Registry.packArgs(var1);
         long var8 = 511267552762592511L;
         Object[] var7 = var10002;
         Ref.h(511267552762592511L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void setVisible(boolean var1) {
      int var2 = Z7.M();
      if (var2 == 0) {
         super.setVisible(var1);
         if (var1) {
            return;
         }
      }

      if (var2 == 0) {
         Object var3 = 609836235334352119L;
         if ((KQ)Ref.g(609836235334352119L, var3) != null) {
            Object var5 = 609836235334352119L;
            ((KQ)Ref.g(609836235334352119L, var5)).requestFocus();
            Object var7 = 609836235334352119L;
            Ref.g(609836235334352119L, var7);
            Object[] var10004 = Registry.packArgs(false);
            long var10 = 480031414946709658L;
            Object[] var9 = var10004;
            Ref.h(480031414946709658L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            Object var11 = 609836235334352119L;
            Ref.g(609836235334352119L, var11);
            Object[] var10006 = Registry.packArgs(true);
            long var14 = 438941361784812150L;
            Object[] var13 = var10006;
            Ref.h(438941361784812150L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }
         }
      }

      if (var2 == 0) {
         Object var15 = 193644890840143673L;
         if ((Lv4_2)Ref.g(193644890840143673L, var15) != null) {
            Registry.emptyArgs();
            long var17 = 270389152141252877L;
            Ref.h2(270389152141252877L, var17);
            Object[] var10003 = Registry.emptyArgs();
            long var20 = 271043866899908885L;
            Object[] var19 = var10003;
            Ref.h(271043866899908885L, var19, var20);
            Object var21 = 193644890840143673L;
            Ref.g(193644890840143673L, var21);
            Object[] var35 = Registry.emptyArgs();
            long var24 = 292557478156152530L;
            Object[] var23 = var35;
            var35 = Registry.packArgs(Ref.h(292557478156152530L, var23, var24));
            long var26 = 441065978076282601L;
            Object[] var25 = var35;
            Ref.h(441065978076282601L, var25, var26);

            try {
               ;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }
      }

      Object var27 = 535177121277639390L;
      Ref.g(535177121277639390L, var27);
      Object[] var10002 = Registry.emptyArgs();
      long var30 = 598662538376324278L;
      Object[] var29 = var10002;
      Ref.h(598662538376324278L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }

   public boolean w() {
      long var10 = 192015943206609872L;
      Object var9 = null;
      Ref.s(192015943206609872L, var9, var10);
      Object var2 = true;
      Z7.m();
      ArrayList var3 = new ArrayList();
      Object var11 = 282174882298955991L;
      Iterator var4 = ((ArrayList)Ref.g(282174882298955991L, var11)).iterator();
      Km4 var1 = this;

      Z7 var10002;
      while (true) {
         if (var4.hasNext()) {
            Z7 var5 = (Z7)var4.next();
            var10002 = var5;
            Vg2 var10003 = (Vg2)(Registry.emptyArgs());
            long var14 = 276413420287290174L;
            Object[] var13 = var10003;
            var10003 = Ref.h(276413420287290174L, var13, var14);

            try {
               var10003 = (Vg2)var10003;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            Vg2 var6 = var10003;
            Object[] var10004 = Registry.emptyArgs();
            long var16 = 192561546377353250L;
            Object[] var15 = var10004;
            var10004 = Ref.h(192561546377353250L, var15, var16);

            try {
               var41 = (Boolean)var10004;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            if (var1 == null) {
               break;
            }

            if (var1 == null && !var41) {
               var3.add(var6);
            }

            if (var1 == null) {
               continue;
            }
         }

         var10002 = var3.size();
         break;
      }

      if (var1 == null) {
         if (var10002 > 0) {
            var4 = var3.iterator();

            label93:
            while (true) {
               if (var4.hasNext()) {
                  Vg2 var33 = (Vg2)var4.next();

                  label88:
                  while (true) {
                     ArrayList var37 = (ArrayList)(Registry.emptyArgs());
                     long var18 = 387830385623632083L;
                     Object[] var17 = var37;
                     var37 = Ref.h(387830385623632083L, var17, var18);

                     try {
                        var37 = (ArrayList)var37;
                     } catch (InvocationTargetException var28) {
                        throw var28.getTargetException();
                     }

                     ArrayList var34 = var37;
                     if (var1 == null) {
                        break label93;
                     }

                     Iterator var7 = var34.iterator();

                     while (true) {
                        if (!var7.hasNext()) {
                           break label88;
                        }

                        label83: {
                           String var8 = (String)var7.next();
                           if (var1 == null) {
                              Object var19 = 192015943206609872L;
                              Vg2 var42 = (Vg2)Ref.g(192015943206609872L, var19);
                              if (var1 == null) {
                                 break;
                              }

                              if (var42 != null) {
                                 break label83;
                              }
                           }

                           long var22 = 192015943206609872L;
                           Ref.s(192015943206609872L, var33, var22);
                           if (var1 == null) {
                              break label88;
                           }
                        }

                        if (var1 == null) {
                           break label88;
                        }
                     }
                  }

                  if (var1 == null) {
                     continue;
                  }
               }

               var2 = false;
               break;
            }

            new StringBuilder().append(a(-2274, -12187));
            Object var23 = 192015943206609872L;
            Object var43 = Ref.g(192015943206609872L, var23);
            ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
            long var26 = 387830385623632083L;
            Object[] var25 = var10005;
            var10005 = Ref.h(387830385623632083L, var25, var26);

            try {
               var10005 = (ArrayList)var10005;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            String var32 = var43.append((String)var10005.get(0)).toString();
         }

         var10002 = (Z7)var2;
      }

      return (boolean)var10002;
   }

   public void L(Lv4_2 param1, boolean param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Z7.m ()I
      // 003: aload 1
      // 004: ldc2_w 590765520000496083
      // 007: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00a: aconst_null
      // 00b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 00e: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 011: ldc2_w 167890385721506775
      // 014: astore 9
      // 016: astore 8
      // 018: ldc2_w 167890385721506775
      // 01b: aload 8
      // 01d: aload 9
      // 01f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 022: pop
      // 023: goto 02a
      // 026: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 029: athrow
      // 02a: istore 3
      // 02b: aload 0
      // 02c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02f: ldc2_w 479940415849799095
      // 032: astore 11
      // 034: astore 10
      // 036: ldc2_w 479940415849799095
      // 039: aload 10
      // 03b: aload 11
      // 03d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 040: checkcast java/lang/Boolean
      // 043: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 046: goto 04d
      // 049: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: istore 4
      // 04f: iload 4
      // 051: iload 3
      // 052: ifeq 060
      // 055: ifeq 257
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: bipush 0
      // 060: istore 5
      // 062: aload 0
      // 063: iload 3
      // 064: ifeq 0fb
      // 067: ldc2_w 241687581993549108
      // 06a: astore 12
      // 06c: ldc2_w 241687581993549108
      // 06f: aload 12
      // 071: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 074: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 077: ifnull 0fa
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: aload 0
      // 082: ldc2_w 241687581993549108
      // 085: astore 14
      // 087: ldc2_w 241687581993549108
      // 08a: aload 14
      // 08c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08f: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 092: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 095: astore 6
      // 097: aload 6
      // 099: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 09c: ldc_w com/finalshell/ui/model/Ck4
      // 09f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a2: iload 3
      // 0a3: ifeq 0f7
      // 0a6: ifeq 0e5
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: ldc2_w 241687581993549108
      // 0b4: astore 16
      // 0b6: ldc2_w 241687581993549108
      // 0b9: aload 16
      // 0bb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0be: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0c1: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 0c4: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0c7: astore 7
      // 0c9: aload 7
      // 0cb: aload 0
      // 0cc: ldc2_w 241687581993549108
      // 0cf: astore 18
      // 0d1: ldc2_w 241687581993549108
      // 0d4: aload 18
      // 0d6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d9: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0dc: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getIndex (Ljavax/swing/tree/TreeNode;)I
      // 0df: istore 5
      // 0e1: iload 3
      // 0e2: ifne 0fa
      // 0e5: aload 6
      // 0e7: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ea: ldc_w com/finalshell/ui/model/Tf4
      // 0ed: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: ifeq 0fa
      // 0fa: aload 0
      // 0fb: ldc2_w 282174882298955991
      // 0fe: astore 20
      // 100: ldc2_w 282174882298955991
      // 103: aload 20
      // 105: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 108: checkcast java/util/ArrayList
      // 10b: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 10e: astore 6
      // 110: aload 6
      // 112: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 117: ifeq 154
      // 11a: aload 6
      // 11c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 121: checkcast com/finalshell/ui/panel/Z7
      // 124: astore 7
      // 126: aload 7
      // 128: aload 1
      // 129: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12c: ldc2_w 492246582322995221
      // 12f: astore 23
      // 131: astore 22
      // 133: ldc2_w 492246582322995221
      // 136: aload 22
      // 138: aload 23
      // 13a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13d: pop
      // 13e: goto 145
      // 141: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 144: athrow
      // 145: iload 3
      // 146: ifeq 174
      // 149: iload 3
      // 14a: ifne 110
      // 14d: goto 154
      // 150: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: aload 1
      // 155: invokestatic java/lang/System.currentTimeMillis ()J
      // 158: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 15b: ldc2_w 448034136929726083
      // 15e: astore 25
      // 160: astore 24
      // 162: ldc2_w 448034136929726083
      // 165: aload 24
      // 167: aload 25
      // 169: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16c: pop
      // 16d: goto 174
      // 170: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 173: athrow
      // 174: iload 3
      // 175: ifeq 253
      // 178: aload 0
      // 179: ldc2_w 589187491190408666
      // 17c: astore 26
      // 17e: ldc2_w 589187491190408666
      // 181: aload 26
      // 183: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 186: checkcast java/lang/String
      // 189: ifnull 1f7
      // 18c: goto 193
      // 18f: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: aload 0
      // 194: ldc2_w 589187491190408666
      // 197: astore 28
      // 199: ldc2_w 589187491190408666
      // 19c: aload 28
      // 19e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a1: checkcast java/lang/String
      // 1a4: aload 1
      // 1a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1a8: ldc2_w 286931176286176762
      // 1ab: astore 31
      // 1ad: astore 30
      // 1af: ldc2_w 286931176286176762
      // 1b2: aload 30
      // 1b4: aload 31
      // 1b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b9: checkcast java/lang/String
      // 1bc: goto 1c3
      // 1bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c6: ifne 1f7
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 1
      // 1d1: invokestatic java/lang/System.currentTimeMillis ()J
      // 1d4: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 1d7: ldc2_w 379623615202365815
      // 1da: astore 33
      // 1dc: astore 32
      // 1de: ldc2_w 379623615202365815
      // 1e1: aload 32
      // 1e3: aload 33
      // 1e5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e8: pop
      // 1e9: goto 1f0
      // 1ec: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: goto 1f7
      // 1f3: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f6: athrow
      // 1f7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1fa: ldc2_w 270389152141252877
      // 1fd: astore 34
      // 1ff: ldc2_w 270389152141252877
      // 202: aload 34
      // 204: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 211: ldc2_w 410905379772103887
      // 214: astore 37
      // 216: astore 36
      // 218: ldc2_w 410905379772103887
      // 21b: aload 36
      // 21d: aload 37
      // 21f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 222: goto 229
      // 225: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 228: athrow
      // 229: aload 1
      // 22a: iload 5
      // 22c: aload 0
      // 22d: ldc2_w 423197961904551339
      // 230: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 233: swap
      // 234: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 237: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IZ)[Ljava/lang/Object;
      // 23a: ldc2_w 425640194583900456
      // 23d: astore 39
      // 23f: astore 38
      // 241: ldc2_w 425640194583900456
      // 244: aload 38
      // 246: aload 39
      // 248: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24b: pop
      // 24c: goto 253
      // 24f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 252: athrow
      // 253: iload 3
      // 254: ifne 27b
      // 257: aload 0
      // 258: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 25b: ldc2_w 511026305189645501
      // 25e: astore 41
      // 260: astore 40
      // 262: ldc2_w 511026305189645501
      // 265: aload 40
      // 267: aload 41
      // 269: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 26c: pop
      // 26d: goto 274
      // 270: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 273: athrow
      // 274: goto 27b
      // 277: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: iload 4
      // 27d: iload 3
      // 27e: ifeq 28c
      // 281: ifeq 2b4
      // 284: goto 28b
      // 287: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28a: athrow
      // 28b: iload 2
      // 28c: ifeq 2b4
      // 28f: aload 0
      // 290: bipush 0
      // 291: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 294: ldc2_w 433716955203722428
      // 297: astore 43
      // 299: astore 42
      // 29b: ldc2_w 433716955203722428
      // 29e: aload 42
      // 2a0: aload 43
      // 2a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a5: pop
      // 2a6: goto 2ad
      // 2a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: goto 2b4
      // 2b0: invokestatic com/finalshell/ui/frame/Km4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b3: athrow
      // 2b4: return
   }

   public void A() {
      Object var1 = 631372995965003737L;
      Ref.g(631372995965003737L, var1);
      Object var3 = 192015943206609872L;
      Ref.g(192015943206609872L, var3);
      Object[] var10004 = Registry.emptyArgs();
      long var6 = 546304040965726303L;
      Object[] var5 = var10004;
      var10004 = Registry.packArgs(Ref.h(546304040965726303L, var5, var6));
      long var8 = 262788292718351309L;
      Object[] var7 = var10004;
      Ref.h(262788292718351309L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object var9 = 595819195510091629L;
      Ref.g(595819195510091629L, var9);
      Object var11 = 456154352713079276L;
      Object[] var10007 = Registry.packArgs(Ref.g(456154352713079276L, var11));
      long var14 = 243902657553228984L;
      Object[] var13 = var10007;
      Ref.h(243902657553228984L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object var15 = 554470559852787945L;
      Km4 var10008 = (Km4)Ref.g(554470559852787945L, var15);
      Object var17 = 192015943206609872L;
      Object var10010 = Ref.g(192015943206609872L, var17);
      ArrayList var10011 = (ArrayList)(Registry.emptyArgs());
      long var20 = 387830385623632083L;
      Object[] var19 = var10011;
      var10011 = Ref.h(387830385623632083L, var19, var20);

      try {
         var10011 = (ArrayList)var10011;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      JOptionPane.showMessageDialog((Component)var10010, var10011.get(0), a(-2296, -19224), 2);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -2280) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 228;
               break;
            case 1:
               var10000 = 141;
               break;
            case 2:
               var10000 = 63;
               break;
            case 3:
               var10000 = 138;
               break;
            case 4:
               var10000 = 17;
               break;
            case 5:
               var10000 = 120;
               break;
            case 6:
               var10000 = 130;
               break;
            case 7:
               var10000 = 191;
               break;
            case 8:
               var10000 = 87;
               break;
            case 9:
               var10000 = 99;
               break;
            case 10:
               var10000 = 218;
               break;
            case 11:
               var10000 = 51;
               break;
            case 12:
               var10000 = 43;
               break;
            case 13:
               var10000 = 44;
               break;
            case 14:
               var10000 = 178;
               break;
            case 15:
               var10000 = 18;
               break;
            case 16:
               var10000 = 83;
               break;
            case 17:
               var10000 = 249;
               break;
            case 18:
               var10000 = 195;
               break;
            case 19:
               var10000 = 123;
               break;
            case 20:
               var10000 = 127;
               break;
            case 21:
               var10000 = 23;
               break;
            case 22:
               var10000 = 25;
               break;
            case 23:
               var10000 = 29;
               break;
            case 24:
               var10000 = 46;
               break;
            case 25:
               var10000 = 93;
               break;
            case 26:
               var10000 = 77;
               break;
            case 27:
               var10000 = 210;
               break;
            case 28:
               var10000 = 213;
               break;
            case 29:
               var10000 = 82;
               break;
            case 30:
               var10000 = 65;
               break;
            case 31:
               var10000 = 158;
               break;
            case 32:
               var10000 = 58;
               break;
            case 33:
               var10000 = 229;
               break;
            case 34:
               var10000 = 108;
               break;
            case 35:
               var10000 = 179;
               break;
            case 36:
               var10000 = 160;
               break;
            case 37:
               var10000 = 201;
               break;
            case 38:
               var10000 = 73;
               break;
            case 39:
               var10000 = 234;
               break;
            case 40:
               var10000 = 175;
               break;
            case 41:
               var10000 = 170;
               break;
            case 42:
               var10000 = 39;
               break;
            case 43:
               var10000 = 147;
               break;
            case 44:
               var10000 = 161;
               break;
            case 45:
               var10000 = 34;
               break;
            case 46:
               var10000 = 97;
               break;
            case 47:
               var10000 = 142;
               break;
            case 48:
               var10000 = 74;
               break;
            case 49:
               var10000 = 90;
               break;
            case 50:
               var10000 = 190;
               break;
            case 51:
               var10000 = 205;
               break;
            case 52:
               var10000 = 167;
               break;
            case 53:
               var10000 = 146;
               break;
            case 54:
               var10000 = 135;
               break;
            case 55:
               var10000 = 61;
               break;
            case 56:
               var10000 = 9;
               break;
            case 57:
               var10000 = 92;
               break;
            case 58:
               var10000 = 37;
               break;
            case 59:
               var10000 = 78;
               break;
            case 60:
               var10000 = 49;
               break;
            case 61:
               var10000 = 76;
               break;
            case 62:
               var10000 = 253;
               break;
            case 63:
               var10000 = 134;
               break;
            case 64:
               var10000 = 238;
               break;
            case 65:
               var10000 = 143;
               break;
            case 66:
               var10000 = 75;
               break;
            case 67:
               var10000 = 148;
               break;
            case 68:
               var10000 = 183;
               break;
            case 69:
               var10000 = 60;
               break;
            case 70:
               var10000 = 194;
               break;
            case 71:
               var10000 = 193;
               break;
            case 72:
               var10000 = 173;
               break;
            case 73:
               var10000 = 203;
               break;
            case 74:
               var10000 = 198;
               break;
            case 75:
               var10000 = 207;
               break;
            case 76:
               var10000 = 174;
               break;
            case 77:
               var10000 = 129;
               break;
            case 78:
               var10000 = 151;
               break;
            case 79:
               var10000 = 224;
               break;
            case 80:
               var10000 = 5;
               break;
            case 81:
               var10000 = 169;
               break;
            case 82:
               var10000 = 243;
               break;
            case 83:
               var10000 = 16;
               break;
            case 84:
               var10000 = 176;
               break;
            case 85:
               var10000 = 157;
               break;
            case 86:
               var10000 = 202;
               break;
            case 87:
               var10000 = 196;
               break;
            case 88:
               var10000 = 52;
               break;
            case 89:
               var10000 = 84;
               break;
            case 90:
               var10000 = 7;
               break;
            case 91:
               var10000 = 24;
               break;
            case 92:
               var10000 = 50;
               break;
            case 93:
               var10000 = 86;
               break;
            case 94:
               var10000 = 144;
               break;
            case 95:
               var10000 = 113;
               break;
            case 96:
               var10000 = 215;
               break;
            case 97:
               var10000 = 57;
               break;
            case 98:
               var10000 = 98;
               break;
            case 99:
               var10000 = 209;
               break;
            case 100:
               var10000 = 168;
               break;
            case 101:
               var10000 = 188;
               break;
            case 102:
               var10000 = 85;
               break;
            case 103:
               var10000 = 117;
               break;
            case 104:
               var10000 = 125;
               break;
            case 105:
               var10000 = 59;
               break;
            case 106:
               var10000 = 214;
               break;
            case 107:
               var10000 = 94;
               break;
            case 108:
               var10000 = 38;
               break;
            case 109:
               var10000 = 247;
               break;
            case 110:
               var10000 = 10;
               break;
            case 111:
               var10000 = 1;
               break;
            case 112:
               var10000 = 246;
               break;
            case 113:
               var10000 = 8;
               break;
            case 114:
               var10000 = 149;
               break;
            case 115:
               var10000 = 163;
               break;
            case 116:
               var10000 = 140;
               break;
            case 117:
               var10000 = 128;
               break;
            case 118:
               var10000 = 137;
               break;
            case 119:
               var10000 = 101;
               break;
            case 120:
               var10000 = 122;
               break;
            case 121:
               var10000 = 245;
               break;
            case 122:
               var10000 = 236;
               break;
            case 123:
               var10000 = 100;
               break;
            case 124:
               var10000 = 153;
               break;
            case 125:
               var10000 = 240;
               break;
            case 126:
               var10000 = 119;
               break;
            case 127:
               var10000 = 35;
               break;
            case 128:
               var10000 = 6;
               break;
            case 129:
               var10000 = 233;
               break;
            case 130:
               var10000 = 217;
               break;
            case 131:
               var10000 = 79;
               break;
            case 132:
               var10000 = 182;
               break;
            case 133:
               var10000 = 47;
               break;
            case 134:
               var10000 = 54;
               break;
            case 135:
               var10000 = 145;
               break;
            case 136:
               var10000 = 105;
               break;
            case 137:
               var10000 = 177;
               break;
            case 138:
               var10000 = 181;
               break;
            case 139:
               var10000 = 62;
               break;
            case 140:
               var10000 = 155;
               break;
            case 141:
               var10000 = 154;
               break;
            case 142:
               var10000 = 110;
               break;
            case 143:
               var10000 = 254;
               break;
            case 144:
               var10000 = 166;
               break;
            case 145:
               var10000 = 230;
               break;
            case 146:
               var10000 = 88;
               break;
            case 147:
               var10000 = 40;
               break;
            case 148:
               var10000 = 109;
               break;
            case 149:
               var10000 = 226;
               break;
            case 150:
               var10000 = 36;
               break;
            case 151:
               var10000 = 55;
               break;
            case 152:
               var10000 = 184;
               break;
            case 153:
               var10000 = 131;
               break;
            case 154:
               var10000 = 222;
               break;
            case 155:
               var10000 = 255;
               break;
            case 156:
               var10000 = 250;
               break;
            case 157:
               var10000 = 69;
               break;
            case 158:
               var10000 = 41;
               break;
            case 159:
               var10000 = 200;
               break;
            case 160:
               var10000 = 14;
               break;
            case 161:
               var10000 = 124;
               break;
            case 162:
               var10000 = 227;
               break;
            case 163:
               var10000 = 221;
               break;
            case 164:
               var10000 = 126;
               break;
            case 165:
               var10000 = 139;
               break;
            case 166:
               var10000 = 21;
               break;
            case 167:
               var10000 = 165;
               break;
            case 168:
               var10000 = 199;
               break;
            case 169:
               var10000 = 237;
               break;
            case 170:
               var10000 = 136;
               break;
            case 171:
               var10000 = 164;
               break;
            case 172:
               var10000 = 150;
               break;
            case 173:
               var10000 = 235;
               break;
            case 174:
               var10000 = 241;
               break;
            case 175:
               var10000 = 3;
               break;
            case 176:
               var10000 = 4;
               break;
            case 177:
               var10000 = 107;
               break;
            case 178:
               var10000 = 152;
               break;
            case 179:
               var10000 = 70;
               break;
            case 180:
               var10000 = 28;
               break;
            case 181:
               var10000 = 96;
               break;
            case 182:
               var10000 = 192;
               break;
            case 183:
               var10000 = 53;
               break;
            case 184:
               var10000 = 31;
               break;
            case 185:
               var10000 = 231;
               break;
            case 186:
               var10000 = 66;
               break;
            case 187:
               var10000 = 118;
               break;
            case 188:
               var10000 = 162;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 27;
               break;
            case 191:
               var10000 = 204;
               break;
            case 192:
               var10000 = 33;
               break;
            case 193:
               var10000 = 212;
               break;
            case 194:
               var10000 = 189;
               break;
            case 195:
               var10000 = 80;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 106;
               break;
            case 198:
               var10000 = 171;
               break;
            case 199:
               var10000 = 232;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 20;
               break;
            case 202:
               var10000 = 11;
               break;
            case 203:
               var10000 = 172;
               break;
            case 204:
               var10000 = 48;
               break;
            case 205:
               var10000 = 216;
               break;
            case 206:
               var10000 = 159;
               break;
            case 207:
               var10000 = 197;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 32;
               break;
            case 210:
               var10000 = 115;
               break;
            case 211:
               var10000 = 12;
               break;
            case 212:
               var10000 = 102;
               break;
            case 213:
               var10000 = 56;
               break;
            case 214:
               var10000 = 180;
               break;
            case 215:
               var10000 = 26;
               break;
            case 216:
               var10000 = 208;
               break;
            case 217:
               var10000 = 71;
               break;
            case 218:
               var10000 = 187;
               break;
            case 219:
               var10000 = 206;
               break;
            case 220:
               var10000 = 19;
               break;
            case 221:
               var10000 = 72;
               break;
            case 222:
               var10000 = 185;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 0;
               break;
            case 225:
               var10000 = 81;
               break;
            case 226:
               var10000 = 22;
               break;
            case 227:
               var10000 = 112;
               break;
            case 228:
               var10000 = 252;
               break;
            case 229:
               var10000 = 248;
               break;
            case 230:
               var10000 = 68;
               break;
            case 231:
               var10000 = 132;
               break;
            case 232:
               var10000 = 116;
               break;
            case 233:
               var10000 = 13;
               break;
            case 234:
               var10000 = 244;
               break;
            case 235:
               var10000 = 67;
               break;
            case 236:
               var10000 = 223;
               break;
            case 237:
               var10000 = 15;
               break;
            case 238:
               var10000 = 225;
               break;
            case 239:
               var10000 = 211;
               break;
            case 240:
               var10000 = 103;
               break;
            case 241:
               var10000 = 251;
               break;
            case 242:
               var10000 = 239;
               break;
            case 243:
               var10000 = 133;
               break;
            case 244:
               var10000 = 121;
               break;
            case 245:
               var10000 = 104;
               break;
            case 246:
               var10000 = 42;
               break;
            case 247:
               var10000 = 2;
               break;
            case 248:
               var10000 = 89;
               break;
            case 249:
               var10000 = 242;
               break;
            case 250:
               var10000 = 111;
               break;
            case 251:
               var10000 = 95;
               break;
            case 252:
               var10000 = 220;
               break;
            case 253:
               var10000 = 91;
               break;
            case 254:
               var10000 = 219;
               break;
            default:
               var10000 = 114;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22470;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[29];
      int var11 = 0;
      String var10 = "éK\u008d¯ð#N\u000eX\u000eü·\u0018[zE!¡n\"¢÷ÄL\u0004*¥\u0098\u0001\u0004穷匂輠卥\u0003d«M\u0002硕嬠\u0004闦讓l+\u0004盗弾腄板\u0002骓縡\tR\u001e¸LLÂ\u0094Ô·\u000eÄ/\u001fH\u009a'=èí«ÒcÊÞ\u0006\u000fT\u0013\u00059ë\u0004^Ë(ä\u0005P\tË辭掍\u0003\u0002罿迩\u0010µ¿â×·Ûs\u0081ÄË\tÜµôo\u009c\u0002浡惼\u0002雠郼\u0005仱瓌朜劕噗\u0011]7ÿÆ\u0015õMÜ<Ï§\u0012Õ×@Lô\u0002绲穄\n@X\\+aD\u0098r¥²\u001bCùï\u0092\u0084|þ\u0084\u0095ÄÝ,+ÑUOèG)ú»ÕèG-ÔÎ\u0019\u0017\u0091¯iecL^à\u0090{_ª\u001c¯)\u000e´hYúÑõÁ.\u0004旀幂运挣\u0002碱嬴\u0002庭畅";
      int var12 = "éK\u008d¯ð#N\u000eX\u000eü·\u0018[zE!¡n\"¢÷ÄL\u0004*¥\u0098\u0001\u0004穷匂輠卥\u0003d«M\u0002硕嬠\u0004闦讓l+\u0004盗弾腄板\u0002骓縡\tR\u001e¸LLÂ\u0094Ô·\u000eÄ/\u001fH\u009a'=èí«ÒcÊÞ\u0006\u000fT\u0013\u00059ë\u0004^Ë(ä\u0005P\tË辭掍\u0003\u0002罿迩\u0010µ¿â×·Ûs\u0081ÄË\tÜµôo\u009c\u0002浡惼\u0002雠郼\u0005仱瓌朜劕噗\u0011]7ÿÆ\u0015õMÜ<Ï§\u0012Õ×@Lô\u0002绲穄\n@X\\+aD\u0098r¥²\u001bCùï\u0092\u0084|þ\u0084\u0095ÄÝ,+ÑUOèG)ú»ÕèG-ÔÎ\u0019\u0017\u0091¯iecL^à\u0090{_ª\u001c¯)\u000e´hYúÑõÁ.\u0004旀幂运挣\u0002碱嬴\u0002庭畅"
         .length();
      char var9 = '\t';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 104;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      ArrayList var30;
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
                        var58 = 102;
                        break;
                     case 1:
                        var58 = 72;
                        break;
                     case 2:
                        var58 = 25;
                        break;
                     case 3:
                        var58 = 7;
                        break;
                     case 4:
                        var58 = 86;
                        break;
                     case 5:
                        var58 = 17;
                        break;
                     default:
                        var58 = 27;
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
                     b = new String[29];
                     long var0 = 2964640120824284856L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "x\u0002\"\u008cÊªÎH\u008d);\u0005#äae";
                     int var5 = "x\u0002\"\u008cÊªÎH\u008d);\u0005#äae".length();
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
                     e = new Integer[2];
                     Registry.lookupField(171155657610638129L).setBoolean(null, false);
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

                  var10 = "卩浹\u0006e×%\u000e\u0084ñ";
                  var12 = "卩浹\u0006e×%\u000e\u0084ñ".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 57;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





