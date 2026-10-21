package com.finalshell.ui.frame;

import com.finalshell.core.BJ;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.listener.G6;
import com.finalshell.ui.listener.J9;
import com.finalshell.ui.listener.K72;
import com.finalshell.ui.listener.N_;
import com.finalshell.ui.listener.QN;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.ProxySelectionPanel;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.LocalDrive;
import com.finalshell.ui.panel.ReconnectSettingsPanel;
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

public class Kb2 extends JFrame {
   public JPanel G;
   public JPanel V;
   public Z8 R;
   public Lv4_2 o;
   public ArrayList I;
   public Vg2 c;
   public AA S;
   public DefaultMutableTreeNode m;
   public DefaultMutableTreeNode Q;
   public long H;
   public Kb2 z;
   public String A;
   public static boolean w;
   public KQ a;
   public DefaultMutableTreeNode y;
   public ProxySelectionPanel j;
   public boolean q;
   public DefaultMutableTreeNode g;
   public String e;
   public static String[] b;
   public static String[] d;
   public static long[] f;
   public static Integer[] h;

   public Kb2(String var1, KQ var2, Window var3, Lv4_2 var4, DefaultMutableTreeNode var5) {
   super();
   Object[] var41;
      label191: {
         Z7.m();
         ArrayList var10002 = new ArrayList();
         long var18 = 429204764258682403L;
         ArrayList var17 = var10002;
         Ref.s(429204764258682403L, var17, var18);
         long var20 = 143703518532667980L;
         Object var19 = null;
         Ref.s(143703518532667980L, var19, var20);
         long var22 = 418996528515713032L;
         Object var21 = null;
         Ref.s(418996528515713032L, var21, var22);
         long var24 = 322611781361533534L;
         Object var23 = null;
         Ref.s(322611781361533534L, var23, var24);
         Registry.lookupField(300266073511944820L).setBoolean(this, false);
         long var26 = 407576561248461390L;
         Ref.s(407576561248461390L, var5, var26);
         long var28 = 473641348993414305L;
         Ref.s(473641348993414305L, var4, var28);
         if (this == null) {
            Object var29 = 473641348993414305L;
            if ((Lv4_2)Ref.g(473641348993414305L, var29) != null) {
               Registry.lookupField(300266073511944820L).setBoolean(this, true);
               new StringBuilder();
               Object var31 = 473641348993414305L;
               Object var10010 = Ref.g(473641348993414305L, var31);
               String var10011 = (String)(Registry.emptyArgs());
               long var34 = 286931176286176762L;
               Object var33 = var10011;
               var10011 = Ref.h(286931176286176762L, var33, var34);

               try {
                  var10011 = (String)var10011;
               } catch (InvocationTargetException var192) {
                  throw var192.getTargetException();
               }

               this.setTitle(((java.lang.StringBuilder)var10010).append((String)var10011).append(a(-6089, 29415)).toString());
               Registry.emptyArgs();
               long var35 = 270389152141252877L;
               Ref.h2(270389152141252877L, var35);
               var10011 = Registry.emptyArgs();
               long var38 = 271043866899908885L;
               Object var37 = var10011;
               Ref.h(271043866899908885L, var37, var38);
               Object var39 = 473641348993414305L;
               Ref.g(473641348993414305L, var39);
               Object[] var10014 = Registry.emptyArgs();
               long var42 = 292557478156152530L;
               var41 = var10014;
               var10014 = Registry.packArgs(Ref.h(292557478156152530L, var41, var42), this);
               long var44 = 332759013866444339L;
               Object var43 = var10014;
               Ref.h(332759013866444339L, var43, var44);

               try {
                  ;
               } catch (InvocationTargetException var191) {
                  throw var191.getTargetException();
               }

               if (this == null) {
                  break label191;
               }
            }
         }

         this.setTitle(a(-6099, -20197));
      }

      long var46 = 327812457858977329L;
      Ref.s(327812457858977329L, var2, var46);
      long var48 = 122657887402216783L;
      Ref.s(122657887402216783L, var1, var48);
      long var50 = 216628356337370843L;
      Ref.s(216628356337370843L, this, var50);
      this.setLayout(new MigLayout(a(-6090, 30049), a(-6100, 2348), a(-6092, -31257)));
      JPanel var194 = new JPanel();
      long var52 = 155789165845644440L;
      JPanel var51 = var194;
      Ref.s(155789165845644440L, var51, var52);
      Object var53 = 155789165845644440L;
      ((JPanel)Ref.g(155789165845644440L, var53)).setLayout(new MigLayout(a(-6101, -12017), a(-6091, -7479), a(-6093, -24054)));
      Object var55 = 155789165845644440L;
      this.add((JPanel)Ref.g(155789165845644440L, var55), a(-6098, 22772));
      JScrollPane var7 = new JScrollPane();
      var7.getVerticalScrollBar().setUnitIncrement(a(17130, 3081665225335331916L));
      Object var57 = 155789165845644440L;
      ((JPanel)Ref.g(155789165845644440L, var57)).add(var7, a(-6094, 17433));
      Z8 var199 = new Z8();
      long var60 = 605945497076756383L;
      Z8 var59 = var199;
      Ref.s(605945497076756383L, var59, var60);
      LocalDrive var10015;
      Object var61 = 122657887402216783L;
      // [VF-super] super((String)Ref.g(122657887402216783L, var61), Registry.lookupField(300266073511944820L).getBoolean(this));
      LocalDrive var8 = var10015;
      Object var63 = 429204764258682403L;
      ((ArrayList)Ref.g(429204764258682403L, var63)).add(var8);
      Object var65 = 605945497076756383L;
      Ref.g(605945497076756383L, var65);
      Object[] var10018 = Registry.packArgs(var8);
      long var68 = 551450432066951191L;
      Object[] var67 = var10018;
      Ref.h(551450432066951191L, var67, var68);

      try {
         ;
      } catch (InvocationTargetException var190) {
         throw var190.getTargetException();
      }

      ReconnectSettingsPanel var9 = new ReconnectSettingsPanel();
      Object var69 = 429204764258682403L;
      ((ArrayList)Ref.g(429204764258682403L, var69)).add(var9);
      Object var71 = 605945497076756383L;
      Ref.g(605945497076756383L, var71);
      Object[] var10021 = Registry.packArgs(var9);
      long var74 = 551450432066951191L;
      Object[] var73 = var10021;
      Ref.h(551450432066951191L, var73, var74);

      try {
         ;
      } catch (InvocationTargetException var189) {
         throw var189.getTargetException();
      }

      AA var10022 = new AA();
      long var76 = 418996528515713032L;
      AA var75 = var10022;
      Ref.s(418996528515713032L, var75, var76);
      Object var77 = 418996528515713032L;
      ((AA)Ref.g(418996528515713032L, var77)).setRootVisible(false);
      Object var79 = 418996528515713032L;
      ((AA)Ref.g(418996528515713032L, var79)).setFocusable(false);
      Object var81 = 418996528515713032L;
      ((AA)Ref.g(418996528515713032L, var81)).getSelectionModel().setSelectionMode(1);
      Object var83 = 418996528515713032L;
      this.setViewportView((AA)Ref.g(418996528515713032L, var83));
      Object var85 = 418996528515713032L;
      DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)((AA)Ref.g(418996528515713032L, var85)).getModel().getRoot();
      BJ var11 = new BJ();
      Object[] var10028 = Registry.packArgs(a(-6111, -25728));
      long var88 = 179928667197536173L;
      Object[] var87 = var10028;
      Ref.h(179928667197536173L, var87, var88);

      try {
         ;
      } catch (InvocationTargetException var188) {
         throw var188.getTargetException();
      }

      Object[] var10029 = Registry.packArgs(Registry.lookupField(282832775171570604L).getInt(null));
      long var90 = 404948097134317144L;
      Object[] var89 = var10029;
      Ref.h(404948097134317144L, var89, var90);

      try {
         ;
      } catch (InvocationTargetException var187) {
         throw var187.getTargetException();
      }

      var10.setUserObject(a(-6107, -13224));
      DefaultTreeModel var12 = new DefaultTreeModel(var10);
      var10.removeAllChildren();
      DefaultMutableTreeNode var13 = new DefaultMutableTreeNode(a(-6105, 10926));
      var10.add(var13);
      Object[] var10030 = Registry.packArgs(var13);
      long var92 = 379808289092320154L;
      Object[] var91 = var10030;
      Ref.h(379808289092320154L, var91, var92);

      try {
         ;
      } catch (InvocationTargetException var186) {
         throw var186.getTargetException();
      }

      DefaultMutableTreeNode var10031 = new DefaultMutableTreeNode(a(-6102, 19353));
      long var94 = 477205005732428780L;
      DefaultMutableTreeNode var93 = var10031;
      Ref.s(477205005732428780L, var93, var94);
      Object var95 = 477205005732428780L;
      this.add((DefaultMutableTreeNode)Ref.g(477205005732428780L, var95));
      ProxySelectionPanel var10033 = new ProxySelectionPanel();
      long var98 = 619862119829431751L;
      ProxySelectionPanel var97 = var10033;
      Ref.s(619862119829431751L, var97, var98);
      Object var99 = 429204764258682403L;
      ArrayList var10034 = (ArrayList)Ref.g(429204764258682403L, var99);
      Object var101 = 619862119829431751L;
      this.add((ProxySelectionPanel)Ref.g(619862119829431751L, var101));
      Object var103 = 605945497076756383L;
      Ref.g(605945497076756383L, var103);
      Object var105 = 619862119829431751L;
      Object[] var10038 = Registry.packArgs(Ref.g(619862119829431751L, var105));
      long var108 = 551450432066951191L;
      Object[] var107 = var10038;
      Ref.h(551450432066951191L, var107, var108);

      try {
         ;
      } catch (InvocationTargetException var185) {
         throw var185.getTargetException();
      }

      new DefaultMutableTreeNode(a(-6106, -2252));
      Object var109 = 418996528515713032L;
      ((AA)Ref.g(418996528515713032L, var109)).setModel(var12);
      Object var111 = 418996528515713032L;
      Ref.g(418996528515713032L, var111);
      Object[] var10041 = Registry.emptyArgs();
      long var114 = 606838486540289950L;
      Object[] var113 = var10041;
      Ref.h(606838486540289950L, var113, var114);

      try {
         ;
      } catch (InvocationTargetException var184) {
         throw var184.getTargetException();
      }

      label182: {
         Object var115 = 418996528515713032L;
         ((AA)Ref.g(418996528515713032L, var115)).addTreeSelectionListener(new K72(this, var13, var8));
         Object var117 = 418996528515713032L;
         ((AA)Ref.g(418996528515713032L, var117)).addMouseListener(new G6(this));
         Object var119 = 155789165845644440L;
         JPanel var10044 = (JPanel)Ref.g(155789165845644440L, var119);
         Object var121 = 605945497076756383L;
         this.add((Z8)Ref.g(605945497076756383L, var121), a(-6110, -14412));
         JPanel var10046 = new JPanel();
         long var124 = 289180313571318483L;
         JPanel var123 = var10046;
         Ref.s(289180313571318483L, var123, var124);
         Object var125 = 289180313571318483L;
         this.add((JPanel)Ref.g(289180313571318483L, var125), a(-6097, 29551));
         Object var127 = 289180313571318483L;
         ((JPanel)Ref.g(289180313571318483L, var127)).setLayout(new MigLayout(a(-6104, 20797)));
         JButton var15 = new JButton(a(-6103, 10802));
         var15.setFocusable(false);
         Object var129 = 289180313571318483L;
         ((JPanel)Ref.g(289180313571318483L, var129)).add(var15);
         JButton var10049 = var15;
         if (this == null) {
            var15.addActionListener(new QN(this));
            if (Registry.lookupField(300266073511944820L).getBoolean(this)) {
               JButton var16 = new JButton(a(-6108, 27334));
               var16.setFocusable(false);
               Object var131 = 289180313571318483L;
               ((JPanel)Ref.g(289180313571318483L, var131)).add(var16);
               var16.addActionListener(new J9(this));
               if (this == null) {
                  break label182;
               }
            }

            var10049 = var15;
         }

         var10049.setText(a(-6095, 21309));
      }

      JButton var193 = new JButton(a(-6112, 24812));
      var193.setFocusable(false);
      Object var133 = 289180313571318483L;
      ((JPanel)Ref.g(289180313571318483L, var133)).add(var193);
      var193.addActionListener(new N_(this));
      long var136 = 292193458601960086L;
      Ref.s(292193458601960086L, var13, var136);
      Object var137 = 418996528515713032L;
      Ref.g(418996528515713032L, var137);
      Object[] var10053 = Registry.packArgs(var13);
      long var140 = 243902657553228984L;
      Object[] var139 = var10053;
      Ref.h(243902657553228984L, var139, var140);

      try {
         ;
      } catch (InvocationTargetException var183) {
         throw var183.getTargetException();
      }

      label195: {
         if (this == null) {
            if (!Registry.lookupField(300266073511944820L).getBoolean(this)) {
               Lv4_2 var10054 = new Lv4_2();
               long var142 = 473641348993414305L;
               Lv4_2 var141 = var10054;
               Ref.s(473641348993414305L, var141, var142);
               Object var143 = 473641348993414305L;
               Ref.g(473641348993414305L, var143);
               Object var145 = 122657887402216783L;
               Object[] var10057 = Registry.packArgs(Ref.g(122657887402216783L, var145));
               long var148 = 189603700854791470L;
               Object[] var147 = var10057;
               Ref.h(189603700854791470L, var147, var148);

               try {
                  ;
               } catch (InvocationTargetException var182) {
                  throw var182.getTargetException();
               }

               Object var149 = 473641348993414305L;
               Ref.g(473641348993414305L, var149);
               Object[] var10059 = Registry.packArgs(a(16252, 7124514169757704667L));
               long var152 = 386290519648630578L;
               Object[] var151 = var10059;
               Ref.h(386290519648630578L, var151, var152);

               try {
                  ;
               } catch (InvocationTargetException var181) {
                  throw var181.getTargetException();
               }

               Object var153 = 473641348993414305L;
               Object[] var10061 = Registry.packArgs(Ref.g(473641348993414305L, var153));
               long var156 = 281786862918099720L;
               Object[] var155 = var10061;
               Ref.h(281786862918099720L, var155, var156);

               try {
                  ;
               } catch (InvocationTargetException var180) {
                  throw var180.getTargetException();
               }

               if (this == null) {
                  break label195;
               }
            }

            Object var157 = 473641348993414305L;
            Ref.g(473641348993414305L, var157);
            Object[] var10056 = Registry.emptyArgs();
            long var160 = 286931176286176762L;
            Object[] var159 = var10056;
            var10056 = Ref.h(286931176286176762L, var159, var160);
            long var162 = 289785643588205370L;
            Object var161 = var10056;
            Ref.s(289785643588205370L, var161, var162);
         }

         Object var163 = 473641348993414305L;
         Object[] var10055 = Registry.packArgs(Ref.g(473641348993414305L, var163));
         long var166 = 281786862918099720L;
         Object[] var165 = var10055;
         Ref.h(281786862918099720L, var165, var166);

         try {
            ;
         } catch (InvocationTargetException var179) {
            throw var179.getTargetException();
         }
      }

      this.pack();
      Registry.emptyArgs();
      long var167 = 270389152141252877L;
      Ref.h2(270389152141252877L, var167);
      Object[] var10058 = Registry.emptyArgs();
      long var170 = 634817973682994708L;
      Object[] var169 = var10058;
      Ref.h(634817973682994708L, var169, var170);
      Kb2 var201 = Registry.emptyArgs();
      long var172 = 240567170779145617L;
      Object var171 = var201;
      var201 = (Kb2)Ref.h(240567170779145617L, var171, var172);
      MainFrame var10060 = (MainFrame)(Registry.emptyArgs());
      long var174 = 402818413346430437L;
      Object var173 = var10060;
      var10060 = Ref.h(402818413346430437L, var173, var174);

      try {
         var10060 = (MainFrame)var10060;
      } catch (InvocationTargetException var178) {
         throw var178.getTargetException();
      }

      var201.setLocationRelativeTo(var10060);
      var10060 = Registry.packArgs(true);
      long var176 = 583190785470630532L;
      Object var175 = var10060;
      Ref.h(583190785470630532L, var175, var176);

      try {
         ;
      } catch (InvocationTargetException var177) {
         throw var177.getTargetException();
      }

      Registry.lookupField(364177130736457168L).setBoolean(null, true);
      if (Ky4.F$arrString() != null) {
         int var6 = 0 + 1;
         Z7.z(var6);
      }
   }

   public void X(Lv4_2 var1) {
      Z7.M();
      Object var5 = 429204764258682403L;
      Iterator var3 = ((ArrayList)Ref.g(429204764258682403L, var5)).iterator();
      Kb2 var2 = this;

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
      long var30;
      int var2 = Z7.m();
      if (var2 != 0) {
         super.setVisible(var1);
         if (var1) {
            return;
         }
      }

      if (var2 != 0) {
         Object var3 = 327812457858977329L;
         if ((KQ)Ref.g(327812457858977329L, var3) != null) {
            Object var5 = 327812457858977329L;
            ((KQ)Ref.g(327812457858977329L, var5)).requestFocus();
            Object var7 = 327812457858977329L;
            Ref.g(327812457858977329L, var7);
            Object[] var10004 = Registry.packArgs(false);
            long var10 = 480031414946709658L;
            Object[] var9 = var10004;
            Ref.h(480031414946709658L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            Object var11 = 327812457858977329L;
            Ref.g(327812457858977329L, var11);
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

      if (var2 != 0) {
         Object var15 = 473641348993414305L;
         if ((Lv4_2)Ref.g(473641348993414305L, var15) != null) {
            Registry.emptyArgs();
            long var17 = 270389152141252877L;
            Ref.h2(270389152141252877L, var17);
            Object[] var10003 = Registry.emptyArgs();
            long var20 = 271043866899908885L;
            Object[] var19 = var10003;
            Ref.h(271043866899908885L, var19, var20);
            Object var21 = 473641348993414305L;
            Ref.g(473641348993414305L, var21);
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

      Object var27 = 619862119829431751L;
      Ref.g(619862119829431751L, var27);
      Object[] var10002 = Registry.emptyArgs();
      var30 = 598662538376324278L;
      Object[] var29 = var10002;
      Ref.h(598662538376324278L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }

   public boolean l() {
      boolean var41;
      long var10 = 143703518532667980L;
      Object var9 = null;
      Ref.s(143703518532667980L, var9, var10);
      Object var2 = true;
      int var10001 = Z7.M();
      ArrayList var3 = new ArrayList();
      int var1 = var10001;
      Object var11 = 429204764258682403L;
      Iterator var4 = ((ArrayList)Ref.g(429204764258682403L, var11)).iterator();

      Z7 var10002;
      while (true) {
         if (var4.hasNext()) {
            Z7 var5 = (Z7)var4.next();
            var10002 = var5;
            Vg2 var10003 = (Vg2)(Registry.emptyArgs());
            long var14 = 276413420287290174L;
            Object var13 = var10003;
            var10003 = Ref.h(276413420287290174L, var13, var14);

            try {
               var10003 = (Vg2)var10003;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            Vg2 var6 = var10003;
            Object var10004 = Registry.emptyArgs();
            long var16 = 192561546377353250L;
            Object var15 = var10004;
            var10004 = Ref.h(192561546377353250L, var15, var16);

            try {
               var41 = (Boolean)var10004;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            if (var1 != 0) {
               break;
            }

            if (var1 == 0 && !var41) {
               var3.add(var6);
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10002 = (Z7)(var3.size());
         break;
      }

      if (var1 == 0) {
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
                     Object var17 = var37;
                     var37 = Ref.h(387830385623632083L, var17, var18);

                     try {
                        var37 = (ArrayList)var37;
                     } catch (InvocationTargetException var28) {
                        throw var28.getTargetException();
                     }

                     ArrayList var34 = var37;
                     if (var1 != 0) {
                        break label93;
                     }

                     Iterator var7 = var34.iterator();

                     while (true) {
                        if (!var7.hasNext()) {
                           break label88;
                        }

                        label83: {
                           String var8 = (String)var7.next();
                           if (var1 == 0) {
                              Object var19 = 143703518532667980L;
                              Vg2 var42 = (Vg2)Ref.g(143703518532667980L, var19);
                              if (var1 != 0) {
                                 break;
                              }

                              if (var42 != null) {
                                 break label83;
                              }
                           }

                           long var22 = 143703518532667980L;
                           Ref.s(143703518532667980L, var33, var22);
                           if (var1 == 0) {
                              break label88;
                           }
                        }

                        if (var1 != 0) {
                           break label88;
                        }
                     }
                  }

                  if (var1 == 0) {
                     continue;
                  }
               }

               var2 = false;
               break;
            }

            new StringBuilder().append(a(-6096, 11580));
            Object var23 = 143703518532667980L;
            Object var43 = Ref.g(143703518532667980L, var23);
            ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
            long var26 = 387830385623632083L;
            Object var25 = var10005;
            var10005 = Ref.h(387830385623632083L, var25, var26);

            try {
               var10005 = (ArrayList)var10005;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            String var32 = ((java.lang.StringBuilder)var43).append((String)var10005.get(0)).toString();
         }

         var10002 = (Z7)var2;
      }

      return (boolean)var10002;
   }

   public void X(Lv4_2 param1, boolean param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc2_w 292712586650823274
      // 004: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 007: aconst_null
      // 008: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 00b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 00e: ldc2_w 167890385721506775
      // 011: astore 10
      // 013: astore 9
      // 015: ldc2_w 167890385721506775
      // 018: aload 9
      // 01a: aload 10
      // 01c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01f: pop
      // 020: goto 027
      // 023: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 026: athrow
      // 027: invokestatic com/finalshell/ui/panel/Z7.m ()I
      // 02a: aload 0
      // 02b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02e: ldc2_w 589770811905469363
      // 031: astore 12
      // 033: astore 11
      // 035: ldc2_w 589770811905469363
      // 038: aload 11
      // 03a: aload 12
      // 03c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03f: checkcast java/lang/Boolean
      // 042: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 045: goto 04c
      // 048: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: istore 4
      // 04e: istore 3
      // 04f: iload 4
      // 051: iload 3
      // 052: ifeq 060
      // 055: ifeq 238
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: bipush 0
      // 060: istore 5
      // 062: aload 0
      // 063: ldc2_w 407576561248461390
      // 066: astore 13
      // 068: ldc2_w 407576561248461390
      // 06b: aload 13
      // 06d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 070: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 073: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 076: astore 6
      // 078: aload 6
      // 07a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07d: ldc_w com/finalshell/ui/model/Ck4
      // 080: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 083: iload 3
      // 084: ifeq 0d8
      // 087: ifeq 0c6
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 0
      // 092: ldc2_w 407576561248461390
      // 095: astore 15
      // 097: ldc2_w 407576561248461390
      // 09a: aload 15
      // 09c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09f: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0a2: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 0a5: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0a8: astore 7
      // 0aa: aload 7
      // 0ac: aload 0
      // 0ad: ldc2_w 407576561248461390
      // 0b0: astore 17
      // 0b2: ldc2_w 407576561248461390
      // 0b5: aload 17
      // 0b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ba: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0bd: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getIndex (Ljavax/swing/tree/TreeNode;)I
      // 0c0: istore 5
      // 0c2: iload 3
      // 0c3: ifne 0db
      // 0c6: aload 6
      // 0c8: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0cb: ldc_w com/finalshell/ui/model/Tf4
      // 0ce: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: ifeq 0db
      // 0db: aload 0
      // 0dc: ldc2_w 429204764258682403
      // 0df: astore 19
      // 0e1: ldc2_w 429204764258682403
      // 0e4: aload 19
      // 0e6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e9: checkcast java/util/ArrayList
      // 0ec: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0ef: astore 7
      // 0f1: aload 7
      // 0f3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f8: ifeq 135
      // 0fb: aload 7
      // 0fd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 102: checkcast com/finalshell/ui/panel/Z7
      // 105: astore 8
      // 107: aload 8
      // 109: aload 1
      // 10a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10d: ldc2_w 492246582322995221
      // 110: astore 22
      // 112: astore 21
      // 114: ldc2_w 492246582322995221
      // 117: aload 21
      // 119: aload 22
      // 11b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11e: pop
      // 11f: goto 126
      // 122: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 125: athrow
      // 126: iload 3
      // 127: ifeq 155
      // 12a: iload 3
      // 12b: ifne 0f1
      // 12e: goto 135
      // 131: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 1
      // 136: invokestatic java/lang/System.currentTimeMillis ()J
      // 139: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 13c: ldc2_w 448034136929726083
      // 13f: astore 24
      // 141: astore 23
      // 143: ldc2_w 448034136929726083
      // 146: aload 23
      // 148: aload 24
      // 14a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 14d: pop
      // 14e: goto 155
      // 151: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 154: athrow
      // 155: iload 3
      // 156: ifeq 234
      // 159: aload 0
      // 15a: ldc2_w 289785643588205370
      // 15d: astore 25
      // 15f: ldc2_w 289785643588205370
      // 162: aload 25
      // 164: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 167: checkcast java/lang/String
      // 16a: ifnull 1d8
      // 16d: goto 174
      // 170: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: aload 0
      // 175: ldc2_w 289785643588205370
      // 178: astore 27
      // 17a: ldc2_w 289785643588205370
      // 17d: aload 27
      // 17f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 182: checkcast java/lang/String
      // 185: aload 1
      // 186: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 189: ldc2_w 286931176286176762
      // 18c: astore 30
      // 18e: astore 29
      // 190: ldc2_w 286931176286176762
      // 193: aload 29
      // 195: aload 30
      // 197: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19a: checkcast java/lang/String
      // 19d: goto 1a4
      // 1a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a7: ifne 1d8
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aload 1
      // 1b2: invokestatic java/lang/System.currentTimeMillis ()J
      // 1b5: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 1b8: ldc2_w 379623615202365815
      // 1bb: astore 32
      // 1bd: astore 31
      // 1bf: ldc2_w 379623615202365815
      // 1c2: aload 31
      // 1c4: aload 32
      // 1c6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c9: pop
      // 1ca: goto 1d1
      // 1cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1db: ldc2_w 270389152141252877
      // 1de: astore 33
      // 1e0: ldc2_w 270389152141252877
      // 1e3: aload 33
      // 1e5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e8: goto 1ef
      // 1eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f2: ldc2_w 410905379772103887
      // 1f5: astore 36
      // 1f7: astore 35
      // 1f9: ldc2_w 410905379772103887
      // 1fc: aload 35
      // 1fe: aload 36
      // 200: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 203: goto 20a
      // 206: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 1
      // 20b: iload 5
      // 20d: aload 0
      // 20e: ldc2_w 300266073511944820
      // 211: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 214: swap
      // 215: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 218: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IZ)[Ljava/lang/Object;
      // 21b: ldc2_w 425640194583900456
      // 21e: astore 38
      // 220: astore 37
      // 222: ldc2_w 425640194583900456
      // 225: aload 37
      // 227: aload 38
      // 229: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22c: pop
      // 22d: goto 234
      // 230: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 233: athrow
      // 234: iload 3
      // 235: ifne 25c
      // 238: aload 0
      // 239: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 23c: ldc2_w 467968002539848304
      // 23f: astore 40
      // 241: astore 39
      // 243: ldc2_w 467968002539848304
      // 246: aload 39
      // 248: aload 40
      // 24a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24d: pop
      // 24e: goto 255
      // 251: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 254: athrow
      // 255: goto 25c
      // 258: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25b: athrow
      // 25c: iload 4
      // 25e: iload 3
      // 25f: ifeq 26d
      // 262: ifeq 295
      // 265: goto 26c
      // 268: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: iload 2
      // 26d: ifeq 295
      // 270: aload 0
      // 271: bipush 0
      // 272: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 275: ldc2_w 583190785470630532
      // 278: astore 42
      // 27a: astore 41
      // 27c: ldc2_w 583190785470630532
      // 27f: aload 41
      // 281: aload 42
      // 283: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 286: pop
      // 287: goto 28e
      // 28a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28d: athrow
      // 28e: goto 295
      // 291: invokestatic com/finalshell/ui/frame/Kb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: return
   }

   public void s() {
      Object var1 = 605945497076756383L;
      Ref.g(605945497076756383L, var1);
      Object var3 = 143703518532667980L;
      Ref.g(143703518532667980L, var3);
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

      Object var9 = 418996528515713032L;
      Ref.g(418996528515713032L, var9);
      Object var11 = 292193458601960086L;
      Object[] var10007 = Registry.packArgs(Ref.g(292193458601960086L, var11));
      long var14 = 243902657553228984L;
      Object[] var13 = var10007;
      Ref.h(243902657553228984L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object var15 = 216628356337370843L;
      Kb2 var10008 = (Kb2)Ref.g(216628356337370843L, var15);
      Object var17 = 143703518532667980L;
      Object var10010 = Ref.g(143703518532667980L, var17);
      ArrayList var10011 = (ArrayList)(Registry.emptyArgs());
      long var20 = 387830385623632083L;
      Object var19 = var10011;
      var10011 = Ref.h(387830385623632083L, var19, var20);

      try {
         var10011 = (ArrayList)var10011;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      JOptionPane.showMessageDialog((Component)var10010, var10011.get(0), a(-6109, -10538), 2);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -6109) & 65535;
      if (d[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 24;
               break;
            case 1:
               var10000 = 255;
               break;
            case 2:
               var10000 = 247;
               break;
            case 3:
               var10000 = 106;
               break;
            case 4:
               var10000 = 234;
               break;
            case 5:
               var10000 = 68;
               break;
            case 6:
               var10000 = 206;
               break;
            case 7:
               var10000 = 74;
               break;
            case 8:
               var10000 = 141;
               break;
            case 9:
               var10000 = 220;
               break;
            case 10:
               var10000 = 58;
               break;
            case 11:
               var10000 = 99;
               break;
            case 12:
               var10000 = 91;
               break;
            case 13:
               var10000 = 147;
               break;
            case 14:
               var10000 = 154;
               break;
            case 15:
               var10000 = 43;
               break;
            case 16:
               var10000 = 232;
               break;
            case 17:
               var10000 = 170;
               break;
            case 18:
               var10000 = 6;
               break;
            case 19:
               var10000 = 178;
               break;
            case 20:
               var10000 = 107;
               break;
            case 21:
               var10000 = 148;
               break;
            case 22:
               var10000 = 157;
               break;
            case 23:
               var10000 = 185;
               break;
            case 24:
               var10000 = 183;
               break;
            case 25:
               var10000 = 7;
               break;
            case 26:
               var10000 = 88;
               break;
            case 27:
               var10000 = 224;
               break;
            case 28:
               var10000 = 233;
               break;
            case 29:
               var10000 = 55;
               break;
            case 30:
               var10000 = 101;
               break;
            case 31:
               var10000 = 189;
               break;
            case 32:
               var10000 = 66;
               break;
            case 33:
               var10000 = 115;
               break;
            case 34:
               var10000 = 111;
               break;
            case 35:
               var10000 = 128;
               break;
            case 36:
               var10000 = 25;
               break;
            case 37:
               var10000 = 211;
               break;
            case 38:
               var10000 = 195;
               break;
            case 39:
               var10000 = 230;
               break;
            case 40:
               var10000 = 134;
               break;
            case 41:
               var10000 = 72;
               break;
            case 42:
               var10000 = 198;
               break;
            case 43:
               var10000 = 112;
               break;
            case 44:
               var10000 = 57;
               break;
            case 45:
               var10000 = 212;
               break;
            case 46:
               var10000 = 40;
               break;
            case 47:
               var10000 = 146;
               break;
            case 48:
               var10000 = 245;
               break;
            case 49:
               var10000 = 53;
               break;
            case 50:
               var10000 = 216;
               break;
            case 51:
               var10000 = 190;
               break;
            case 52:
               var10000 = 124;
               break;
            case 53:
               var10000 = 249;
               break;
            case 54:
               var10000 = 223;
               break;
            case 55:
               var10000 = 127;
               break;
            case 56:
               var10000 = 172;
               break;
            case 57:
               var10000 = 144;
               break;
            case 58:
               var10000 = 119;
               break;
            case 59:
               var10000 = 9;
               break;
            case 60:
               var10000 = 173;
               break;
            case 61:
               var10000 = 120;
               break;
            case 62:
               var10000 = 26;
               break;
            case 63:
               var10000 = 77;
               break;
            case 64:
               var10000 = 208;
               break;
            case 65:
               var10000 = 37;
               break;
            case 66:
               var10000 = 90;
               break;
            case 67:
               var10000 = 133;
               break;
            case 68:
               var10000 = 235;
               break;
            case 69:
               var10000 = 160;
               break;
            case 70:
               var10000 = 167;
               break;
            case 71:
               var10000 = 35;
               break;
            case 72:
               var10000 = 169;
               break;
            case 73:
               var10000 = 162;
               break;
            case 74:
               var10000 = 69;
               break;
            case 75:
               var10000 = 225;
               break;
            case 76:
               var10000 = 30;
               break;
            case 77:
               var10000 = 113;
               break;
            case 78:
               var10000 = 67;
               break;
            case 79:
               var10000 = 45;
               break;
            case 80:
               var10000 = 122;
               break;
            case 81:
               var10000 = 243;
               break;
            case 82:
               var10000 = 21;
               break;
            case 83:
               var10000 = 59;
               break;
            case 84:
               var10000 = 60;
               break;
            case 85:
               var10000 = 23;
               break;
            case 86:
               var10000 = 131;
               break;
            case 87:
               var10000 = 241;
               break;
            case 88:
               var10000 = 184;
               break;
            case 89:
               var10000 = 98;
               break;
            case 90:
               var10000 = 73;
               break;
            case 91:
               var10000 = 118;
               break;
            case 92:
               var10000 = 63;
               break;
            case 93:
               var10000 = 168;
               break;
            case 94:
               var10000 = 215;
               break;
            case 95:
               var10000 = 135;
               break;
            case 96:
               var10000 = 201;
               break;
            case 97:
               var10000 = 104;
               break;
            case 98:
               var10000 = 48;
               break;
            case 99:
               var10000 = 117;
               break;
            case 100:
               var10000 = 22;
               break;
            case 101:
               var10000 = 78;
               break;
            case 102:
               var10000 = 1;
               break;
            case 103:
               var10000 = 228;
               break;
            case 104:
               var10000 = 182;
               break;
            case 105:
               var10000 = 15;
               break;
            case 106:
               var10000 = 186;
               break;
            case 107:
               var10000 = 52;
               break;
            case 108:
               var10000 = 253;
               break;
            case 109:
               var10000 = 240;
               break;
            case 110:
               var10000 = 29;
               break;
            case 111:
               var10000 = 18;
               break;
            case 112:
               var10000 = 28;
               break;
            case 113:
               var10000 = 17;
               break;
            case 114:
               var10000 = 130;
               break;
            case 115:
               var10000 = 64;
               break;
            case 116:
               var10000 = 244;
               break;
            case 117:
               var10000 = 152;
               break;
            case 118:
               var10000 = 151;
               break;
            case 119:
               var10000 = 116;
               break;
            case 120:
               var10000 = 109;
               break;
            case 121:
               var10000 = 61;
               break;
            case 122:
               var10000 = 202;
               break;
            case 123:
               var10000 = 87;
               break;
            case 124:
               var10000 = 13;
               break;
            case 125:
               var10000 = 70;
               break;
            case 126:
               var10000 = 49;
               break;
            case 127:
               var10000 = 187;
               break;
            case 128:
               var10000 = 176;
               break;
            case 129:
               var10000 = 82;
               break;
            case 130:
               var10000 = 14;
               break;
            case 131:
               var10000 = 83;
               break;
            case 132:
               var10000 = 92;
               break;
            case 133:
               var10000 = 231;
               break;
            case 134:
               var10000 = 80;
               break;
            case 135:
               var10000 = 94;
               break;
            case 136:
               var10000 = 3;
               break;
            case 137:
               var10000 = 44;
               break;
            case 138:
               var10000 = 209;
               break;
            case 139:
               var10000 = 50;
               break;
            case 140:
               var10000 = 102;
               break;
            case 141:
               var10000 = 32;
               break;
            case 142:
               var10000 = 159;
               break;
            case 143:
               var10000 = 126;
               break;
            case 144:
               var10000 = 136;
               break;
            case 145:
               var10000 = 221;
               break;
            case 146:
               var10000 = 199;
               break;
            case 147:
               var10000 = 105;
               break;
            case 148:
               var10000 = 156;
               break;
            case 149:
               var10000 = 51;
               break;
            case 150:
               var10000 = 34;
               break;
            case 151:
               var10000 = 177;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 125;
               break;
            case 154:
               var10000 = 238;
               break;
            case 155:
               var10000 = 132;
               break;
            case 156:
               var10000 = 248;
               break;
            case 157:
               var10000 = 217;
               break;
            case 158:
               var10000 = 218;
               break;
            case 159:
               var10000 = 250;
               break;
            case 160:
               var10000 = 200;
               break;
            case 161:
               var10000 = 153;
               break;
            case 162:
               var10000 = 8;
               break;
            case 163:
               var10000 = 205;
               break;
            case 164:
               var10000 = 89;
               break;
            case 165:
               var10000 = 79;
               break;
            case 166:
               var10000 = 142;
               break;
            case 167:
               var10000 = 100;
               break;
            case 168:
               var10000 = 155;
               break;
            case 169:
               var10000 = 27;
               break;
            case 170:
               var10000 = 165;
               break;
            case 171:
               var10000 = 97;
               break;
            case 172:
               var10000 = 180;
               break;
            case 173:
               var10000 = 163;
               break;
            case 174:
               var10000 = 76;
               break;
            case 175:
               var10000 = 86;
               break;
            case 176:
               var10000 = 12;
               break;
            case 177:
               var10000 = 108;
               break;
            case 178:
               var10000 = 62;
               break;
            case 179:
               var10000 = 181;
               break;
            case 180:
               var10000 = 140;
               break;
            case 181:
               var10000 = 11;
               break;
            case 182:
               var10000 = 38;
               break;
            case 183:
               var10000 = 150;
               break;
            case 184:
               var10000 = 158;
               break;
            case 185:
               var10000 = 192;
               break;
            case 186:
               var10000 = 214;
               break;
            case 187:
               var10000 = 149;
               break;
            case 188:
               var10000 = 96;
               break;
            case 189:
               var10000 = 219;
               break;
            case 190:
               var10000 = 175;
               break;
            case 191:
               var10000 = 36;
               break;
            case 192:
               var10000 = 46;
               break;
            case 193:
               var10000 = 10;
               break;
            case 194:
               var10000 = 229;
               break;
            case 195:
               var10000 = 226;
               break;
            case 196:
               var10000 = 196;
               break;
            case 197:
               var10000 = 103;
               break;
            case 198:
               var10000 = 93;
               break;
            case 199:
               var10000 = 237;
               break;
            case 200:
               var10000 = 65;
               break;
            case 201:
               var10000 = 42;
               break;
            case 202:
               var10000 = 193;
               break;
            case 203:
               var10000 = 227;
               break;
            case 204:
               var10000 = 47;
               break;
            case 205:
               var10000 = 161;
               break;
            case 206:
               var10000 = 5;
               break;
            case 207:
               var10000 = 75;
               break;
            case 208:
               var10000 = 139;
               break;
            case 209:
               var10000 = 16;
               break;
            case 210:
               var10000 = 121;
               break;
            case 211:
               var10000 = 33;
               break;
            case 212:
               var10000 = 81;
               break;
            case 213:
               var10000 = 2;
               break;
            case 214:
               var10000 = 4;
               break;
            case 215:
               var10000 = 31;
               break;
            case 216:
               var10000 = 39;
               break;
            case 217:
               var10000 = 236;
               break;
            case 218:
               var10000 = 254;
               break;
            case 219:
               var10000 = 210;
               break;
            case 220:
               var10000 = 252;
               break;
            case 221:
               var10000 = 129;
               break;
            case 222:
               var10000 = 179;
               break;
            case 223:
               var10000 = 242;
               break;
            case 224:
               var10000 = 0;
               break;
            case 225:
               var10000 = 194;
               break;
            case 226:
               var10000 = 71;
               break;
            case 227:
               var10000 = 164;
               break;
            case 228:
               var10000 = 56;
               break;
            case 229:
               var10000 = 20;
               break;
            case 230:
               var10000 = 114;
               break;
            case 231:
               var10000 = 222;
               break;
            case 232:
               var10000 = 41;
               break;
            case 233:
               var10000 = 143;
               break;
            case 234:
               var10000 = 145;
               break;
            case 235:
               var10000 = 191;
               break;
            case 236:
               var10000 = 204;
               break;
            case 237:
               var10000 = 251;
               break;
            case 238:
               var10000 = 197;
               break;
            case 239:
               var10000 = 188;
               break;
            case 240:
               var10000 = 239;
               break;
            case 241:
               var10000 = 95;
               break;
            case 242:
               var10000 = 166;
               break;
            case 243:
               var10000 = 174;
               break;
            case 244:
               var10000 = 137;
               break;
            case 245:
               var10000 = 203;
               break;
            case 246:
               var10000 = 213;
               break;
            case 247:
               var10000 = 19;
               break;
            case 248:
               var10000 = 85;
               break;
            case 249:
               var10000 = 171;
               break;
            case 250:
               var10000 = 110;
               break;
            case 251:
               var10000 = 246;
               break;
            case 252:
               var10000 = 207;
               break;
            case 253:
               var10000 = 138;
               break;
            case 254:
               var10000 = 123;
               break;
            default:
               var10000 = 84;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7847;
      if (h[var3] == null) {
         h[var3] = (int)(f[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[24];
      int var11 = 0;
      String var10 = "涄恎\u0010{^´dß\u0019\u0085\f\tõ?¹Ç£ôe\u0004辜穋梧鞅\u0002匠淟\u000bàwð*`ú²迮稝棩靏\u0004柵圇赬溢\u0004²\u0016:Ð\u0002幖畣\u000e°X\u001e)\u0018¿\u0096+\u008bü\u0091\u008e\u0016\u0098\u0005亰瓎枻剚嘁\u0002砈寙\u001b_\u0099ã\u0011§¸aÉuâNJíæXºÆvNh¬R\u00198\u009c\u0099L\n\n>\u009ah\u001b\u0098,< ô\u0011¡\u0005ï\u000fµx¢¸ÒÌõÐ+tJ+:\u0004斥幬迳捩\u0006Ø¤f\u00945m\u0006\u001d¤Þ\u0094\"m\u0019\u009cÀQÌ\u0018c\u0018\u008by¥Ç[\u0089g\u001eU·´ýí³\u0092Ï&æ\u0002碶孹\u0004閟譋Ì¿\u0003ò罳轸\u000eøÆ\u0017ú9Å²a\u000f\u0015\u0001\u0016\u0004\u008b";
      int var12 = "涄恎\u0010{^´dß\u0019\u0085\f\tõ?¹Ç£ôe\u0004辜穋梧鞅\u0002匠淟\u000bàwð*`ú²迮稝棩靏\u0004柵圇赬溢\u0004²\u0016:Ð\u0002幖畣\u000e°X\u001e)\u0018¿\u0096+\u008bü\u0091\u008e\u0016\u0098\u0005亰瓎枻剚嘁\u0002砈寙\u001b_\u0099ã\u0011§¸aÉuâNJíæXºÆvNh¬R\u00198\u009c\u0099L\n\n>\u009ah\u001b\u0098,< ô\u0011¡\u0005ï\u000fµx¢¸ÒÌõÐ+tJ+:\u0004斥幬迳捩\u0006Ø¤f\u00945m\u0006\u001d¤Þ\u0094\"m\u0019\u009cÀQÌ\u0018c\u0018\u008by¥Ç[\u0089g\u001eU·´ýí³\u0092Ï&æ\u0002碶孹\u0004閟譋Ì¿\u0003ò罳轸\u000eøÆ\u0017ú9Å²a\u000f\u0015\u0001\u0016\u0004\u008b"
         .length();
      char var9 = 2;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 67;
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
                        var58 = 26;
                        break;
                     case 1:
                        var58 = 55;
                        break;
                     case 2:
                        var58 = 87;
                        break;
                     case 3:
                        var58 = 41;
                        break;
                     case 4:
                        var58 = 115;
                        break;
                     case 5:
                        var58 = 46;
                        break;
                     default:
                        var58 = 10;
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
                     b = var13;
                     d = new String[24];
                     long var0 = 6480813445327176269L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "¡>zO=èn«2\u009b\u0092ø\u0010\u0084\u001e\u000b";
                     int var5 = "¡>zO=èn«2\u009b\u0092ø\u0010\u0084\u001e\u000b".length();
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

                     f = var6;
                     h = new Integer[2];
                     Registry.lookupField(364177130736457168L).setBoolean(null, false);
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

                  var10 = "ÝÙH¾&y£\\:\t\u009f BÈ}*\u0085ÐJ";
                  var12 = "ÝÙH¾&y£\\:\t\u009f BÈ}*\u0085ÐJ".length();
                  var9 = '\t';
                  var16 = -1;
            }

            var10000 = 7;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





