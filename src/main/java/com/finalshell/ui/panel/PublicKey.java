package com.finalshell.ui.panel;

import com.finalshell.core.LN3;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.MB;
import com.finalshell.ui.listener.Uw4;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class PublicKey extends Z7 {
   JTextField O;
   JTextField R;
   JTextField N;
   JTextField X;
   JPasswordField Z;
   JComboBox d;
   String J;
   int T;
   String f;
   JTextArea U;
   String M;
   JTextField W;
   JButton p;
   JPanel a;
   JPanel Q;
   JPanel b;
   String A;
   Lv4_2 i;
   JCheckBox I;
   JCheckBox u;
   boolean z;
   String m;
   LN3 w;
   public static String[] g;
   public static String[] j;
   public static long k;

   public PublicKey(String var1, boolean var2) {
      String var10001 = a(-9121, -23453);
      long var6 = 556050314558680135L;
      String var5 = var10001;
      Ref.s(556050314558680135L, var5, var6);
      String var10002 = a(-9110, 5570);
      long var8 = 538467077500058128L;
      String var7 = var10002;
      Ref.s(538467077500058128L, var7, var8);
      long var10 = 385368274622886672L;
      Ref.s(385368274622886672L, var1, var10);
      Registry.lookupField(194975612625565682L).setBoolean(this, var2);
      JPanel var10005 = (JPanel)(Registry.emptyArgs());
      long var12 = 627479028757546205L;
      Object[] var11 = var10005;
      var10005 = Ref.h(627479028757546205L, var11, var12);

      try {
         var10005 = (JPanel)var10005;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      this.add(var10005, a(-9105, 27068));
      JPanel var10006 = (JPanel)(Registry.emptyArgs());
      long var14 = 593407320323646202L;
      Object[] var13 = var10006;
      var10006 = Ref.h(593407320323646202L, var13, var14);

      try {
         var10006 = (JPanel)var10006;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      this.add(var10006, a(-9109, -19602));
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(-9112, -1846)));
      this.add(var3, a(-9106, 9444));
      var3.setBorder(BorderFactory.createTitledBorder(a(-9095, -18619)));
      JCheckBox var29 = new JCheckBox(a(-9125, -7069), false);
      long var16 = 480855221133532244L;
      JCheckBox var15 = var29;
      Ref.s(480855221133532244L, var15, var16);
      Object var17 = 480855221133532244L;
      this.add((JCheckBox)Ref.g(480855221133532244L, var17), a(-9117, -5107));
      JCheckBox var10008 = new JCheckBox(a(-9122, -21393), false);
      long var20 = 264606901179483755L;
      JCheckBox var19 = var10008;
      Ref.s(264606901179483755L, var19, var20);
      Object var21 = 264606901179483755L;
      this.add((JCheckBox)Ref.g(264606901179483755L, var21), a(-9093, 6966));
      JLabel var4 = new JLabel(a(-9127, -22515));
      var4.setBorder(BorderFactory.createEmptyBorder(0, (int)k, 0, 0));
      var3.add(var4, a(-9093, 6966));
   }

   JPanel Y() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-9096, 26280)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-9119, -29015)));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-9092, 4582)));
      var1.add(var2, a(-9093, 6966));
      JLabel var10001 = new JLabel(a(-9099, 27721));
      Object var5 = 556050314558680135L;
      var10001.add(this, (String)Ref.g(556050314558680135L, var5));
      Registry.emptyArgs();
      long var7 = 373611601539122883L;
      Object var10003 = Ref.h2(373611601539122883L, var7);
      long var10 = 586080412313098006L;
      Object var9 = var10003;
      Ref.s(586080412313098006L, var9, var10);
      Object var11 = 586080412313098006L;
      JTextField var10005 = (JTextField)Ref.g(586080412313098006L, var11);
      Object var13 = 538467077500058128L;
      var10005.add(this, (String)Ref.g(538467077500058128L, var13));
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(-9108, -2289)));
      var1.add(var3, a(-9093, 6966));
      Registry.emptyArgs();
      long var15 = 373611601539122883L;
      Object var10007 = Ref.h2(373611601539122883L, var15);
      long var18 = 351668280571690269L;
      Object var17 = var10007;
      Ref.s(351668280571690269L, var17, var18);
      JLabel var10008 = new JLabel(a(-9116, 26888));
      Object var19 = 556050314558680135L;
      var10008.add(this, (String)Ref.g(556050314558680135L, var19));
      Object var21 = 351668280571690269L;
      JTextField var10010 = (JTextField)Ref.g(351668280571690269L, var21);
      Object var23 = 538467077500058128L;
      var10010.add(this, (String)Ref.g(538467077500058128L, var23));
      var3.add(new JLabel(a(-9101, 15471)));
      Registry.emptyArgs();
      long var25 = 373611601539122883L;
      Object var10012 = Ref.h2(373611601539122883L, var25);
      long var28 = 531059755280049363L;
      Object var27 = var10012;
      Ref.s(531059755280049363L, var27, var28);
      Object var29 = 531059755280049363L;
      ((JTextField)Ref.g(531059755280049363L, var29)).setText(a(-9103, -8286));
      Object var31 = 531059755280049363L;
      this.add((JTextField)Ref.g(531059755280049363L, var31), a(-9124, -31460));
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(-9108, -2289)));
      var1.add(var4, a(-9093, 6966));
      JLabel var10015 = new JLabel(a(-9100, 14204));
      StringBuilder var10016 = new StringBuilder();
      Object var33 = 556050314558680135L;
      var10015.add(var10016, this.append((String)Ref.g(556050314558680135L, var33)).append(a(-9107, -11691)).toString());
      Registry.emptyArgs();
      long var35 = 321230539747506149L;
      Object var10017 = Ref.h2(321230539747506149L, var35);
      long var38 = 459647606786793824L;
      Object var37 = var10017;
      Ref.s(459647606786793824L, var37, var38);
      Object var39 = 459647606786793824L;
      this.add((JTextArea)Ref.g(459647606786793824L, var39), a(-9111, 11030));
      Object var41 = 459647606786793824L;
      ((JTextArea)Ref.g(459647606786793824L, var41)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      return var1;
   }

   JPanel q() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-9096, 26280)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-9133, 18225)));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-9108, -2289)));
      var1.add(var2, a(-9093, 6966));
      JLabel var10001 = new JLabel(a(-9098, -7364));
      Object var3 = 556050314558680135L;
      var10001.add(this, (String)Ref.g(556050314558680135L, var3));
      JComboBox var10002 = new JComboBox();
      long var6 = 585848040491365148L;
      JComboBox var5 = var10002;
      Ref.s(585848040491365148L, var5, var6);
      Object var7 = 585848040491365148L;
      ((JComboBox)Ref.g(585848040491365148L, var7)).addItem(a(-9089, 25314));
      Object var9 = 585848040491365148L;
      ((JComboBox)Ref.g(585848040491365148L, var9)).addItem(a(-9114, 29901));
      Object var11 = 585848040491365148L;
      ((JComboBox)Ref.g(585848040491365148L, var11)).addItem(a(-9113, -23401));
      Object var13 = 585848040491365148L;
      JComboBox var10007 = (JComboBox)Ref.g(585848040491365148L, var13);
      Object var15 = 538467077500058128L;
      var10007.add(this, (String)Ref.g(538467077500058128L, var15));
      Object var17 = 585848040491365148L;
      ((JComboBox)Ref.g(585848040491365148L, var17)).addItemListener(new MB(this));
      JPanel var10009 = new JPanel();
      long var20 = 541991402883865267L;
      JPanel var19 = var10009;
      Ref.s(541991402883865267L, var19, var20);
      Object var21 = 541991402883865267L;
      ((JPanel)Ref.g(541991402883865267L, var21)).setLayout(new MigLayout(a(-9108, -2289)));
      Object var23 = 541991402883865267L;
      this.add((JPanel)Ref.g(541991402883865267L, var23), a(-9093, 6966));
      Registry.emptyArgs();
      long var25 = 373611601539122883L;
      Object var10013 = Ref.h2(373611601539122883L, var25);
      long var28 = 566354696491472305L;
      Object var27 = var10013;
      Ref.s(566354696491472305L, var27, var28);
      Object var29 = 541991402883865267L;
      JPanel var10014 = (JPanel)Ref.g(541991402883865267L, var29);
      JLabel var10015 = new JLabel(a(-9128, -25473));
      Object var31 = 556050314558680135L;
      var10015.add(this, (String)Ref.g(556050314558680135L, var31));
      Object var33 = 541991402883865267L;
      JPanel var10016 = (JPanel)Ref.g(541991402883865267L, var33);
      Object var35 = 566354696491472305L;
      JTextField var10018 = (JTextField)Ref.g(566354696491472305L, var35);
      Object var37 = 538467077500058128L;
      var10018.add(this, (String)Ref.g(538467077500058128L, var37));
      JPanel var10019 = new JPanel();
      long var40 = 399877965770322711L;
      JPanel var39 = var10019;
      Ref.s(399877965770322711L, var39, var40);
      Object var41 = 399877965770322711L;
      ((JPanel)Ref.g(399877965770322711L, var41)).setLayout(new MigLayout(a(-9108, -2289)));
      Object var43 = 399877965770322711L;
      this.add((JPanel)Ref.g(399877965770322711L, var43), a(-9093, 6966));
      Registry.emptyArgs();
      long var45 = 305013025773761213L;
      Object var10023 = Ref.h2(305013025773761213L, var45);
      long var48 = 577645454911985600L;
      Object var47 = var10023;
      Ref.s(577645454911985600L, var47, var48);
      Object var49 = 399877965770322711L;
      JPanel var10024 = (JPanel)Ref.g(399877965770322711L, var49);
      JLabel var10025 = new JLabel(a(-9104, -21696));
      Object var51 = 556050314558680135L;
      var10025.add(this, (String)Ref.g(556050314558680135L, var51));
      Object var53 = 399877965770322711L;
      JPanel var10026 = (JPanel)Ref.g(399877965770322711L, var53);
      Object var55 = 577645454911985600L;
      JPasswordField var10028 = (JPasswordField)Ref.g(577645454911985600L, var55);
      Object var57 = 538467077500058128L;
      var10028.add(this, (String)Ref.g(538467077500058128L, var57));
      JPanel var10029 = new JPanel();
      long var60 = 149624382547038137L;
      JPanel var59 = var10029;
      Ref.s(149624382547038137L, var59, var60);
      Object var61 = 149624382547038137L;
      ((JPanel)Ref.g(149624382547038137L, var61)).setLayout(new MigLayout(a(-9108, -2289)));
      Object var63 = 149624382547038137L;
      this.add((JPanel)Ref.g(149624382547038137L, var63), a(-9093, 6966));
      Object var65 = 149624382547038137L;
      JPanel var10032 = (JPanel)Ref.g(149624382547038137L, var65);
      JLabel var10033 = new JLabel(a(-9090, 25255));
      Object var67 = 556050314558680135L;
      var10033.add(this, (String)Ref.g(556050314558680135L, var67));
      Registry.emptyArgs();
      long var69 = 373611601539122883L;
      Object var10035 = Ref.h2(373611601539122883L, var69);
      long var72 = 132310058849395865L;
      Object var71 = var10035;
      Ref.s(132310058849395865L, var71, var72);
      Object var73 = 132310058849395865L;
      ((JTextField)Ref.g(132310058849395865L, var73)).setEditable(false);
      Object var75 = 149624382547038137L;
      JPanel var10037 = (JPanel)Ref.g(149624382547038137L, var75);
      Object var77 = 132310058849395865L;
      this.add((JTextField)Ref.g(132310058849395865L, var77), a(-9091, -5123));
      JButton var10039 = new JButton(a(-9102, -15859));
      long var80 = 630638272830162503L;
      JButton var79 = var10039;
      Ref.s(630638272830162503L, var79, var80);
      Object var81 = 149624382547038137L;
      JPanel var10040 = (JPanel)Ref.g(149624382547038137L, var81);
      Object var83 = 630638272830162503L;
      this.add((JButton)Ref.g(630638272830162503L, var83));
      Object var85 = 630638272830162503L;
      ((JButton)Ref.g(630638272830162503L, var85)).addActionListener(new Uw4(this));
      Object var87 = 459647606786793824L;
      ((JTextArea)Ref.g(459647606786793824L, var87)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object[] var10044 = Registry.emptyArgs();
      long var90 = 533982889688130251L;
      Object[] var89 = var10044;
      Ref.h(533982889688130251L, var89, var90);

      try {
         return var1;
      } catch (InvocationTargetException var91) {
         throw var91.getTargetException();
      }
   }

   void w() {
      int var10001;
      byte var10002;
      label55: {
         int var2;
         label54: {
            Z7.m();
            Object var3 = 585848040491365148L;
            var2 = ((JComboBox)Ref.g(585848040491365148L, var3)).getSelectedIndex();
            if (this != false) {
               if (var2 != 0) {
                  var10001 = var2;
                  var10002 = 2;
                  if (this == false) {
                     break label55;
                  }

                  if (var2 != 2) {
                     break label54;
                  }
               }

               Object var5 = 399877965770322711L;
               Object[] var10003 = Registry.packArgs(Ref.g(399877965770322711L, var5), true);
               long var8 = 355830514496920690L;
               Object[] var7 = var10003;
               Ref.h(355830514496920690L, var7, var8);

               try {
                  ;
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }

               Object var9 = 149624382547038137L;
               Object[] var10005 = Registry.packArgs(Ref.g(149624382547038137L, var9), false);
               long var12 = 355830514496920690L;
               Object[] var11 = var10005;
               Ref.h(355830514496920690L, var11, var12);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            if (this != false) {
               return;
            }
         }

         var10001 = var2;
         var10002 = 1;
      }

      if (var10001 == var10002) {
         Object var13 = 399877965770322711L;
         Object[] var25 = Registry.packArgs(Ref.g(399877965770322711L, var13), false);
         long var16 = 355830514496920690L;
         Object[] var15 = var25;
         Ref.h(355830514496920690L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         Object var17 = 149624382547038137L;
         Object[] var26 = Registry.packArgs(Ref.g(149624382547038137L, var17), true);
         long var20 = 355830514496920690L;
         Object[] var19 = var26;
         Ref.h(355830514496920690L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }
      }
   }

   void d(JComponent var1, boolean var2) {
      int var10000 = Z7.M();
      var1.setEnabled(var2);
      int var3 = var10000;

      for (Component var7 : var1.getComponents()) {
         var7.setEnabled(var2);
         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public void A(Lv4_2 var1) {
      Z7.M();
      long var4 = 314219493031905147L;
      Ref.s(314219493031905147L, var1, var4);
      Object var5 = 586080412313098006L;
      JTextField var10002 = (JTextField)Ref.g(586080412313098006L, var5);
      String var10004 = (String)(Registry.emptyArgs());
      long var8 = 286931176286176762L;
      Object[] var7 = var10004;
      var10004 = Ref.h(286931176286176762L, var7, var8);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      var1.setText(var10004);
      Object var9 = 351668280571690269L;
      JTextField var84 = (JTextField)Ref.g(351668280571690269L, var9);
      String var10006 = (String)(Registry.emptyArgs());
      long var12 = 380415140795833934L;
      Object[] var11 = var10006;
      var10006 = Ref.h(380415140795833934L, var11, var12);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      var1.setText(var10006);
      Object var13 = 531059755280049363L;
      JTextField var87 = (JTextField)Ref.g(531059755280049363L, var13);
      StringBuilder var10007 = new StringBuilder();
      Object[] var10009 = Registry.emptyArgs();
      long var16 = 255354522009994316L;
      Object[] var15 = var10009;
      var10009 = Ref.h(255354522009994316L, var15, var16);

      try {
         var89 = (Integer)var10009;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      var10007.setText(var1.append(var89).append("").toString());
      Object var17 = 459647606786793824L;
      JTextArea var10008 = (JTextArea)Ref.g(459647606786793824L, var17);
      String var10010 = (String)(Registry.emptyArgs());
      long var20 = 218711337515318169L;
      Object[] var19 = var10010;
      var10010 = Ref.h(218711337515318169L, var19, var20);

      try {
         var10010 = (String)var10010;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      var1.setText(var10010);
      Object var21 = 566354696491472305L;
      JTextField var92 = (JTextField)Ref.g(566354696491472305L, var21);
      String var10012 = (String)(Registry.emptyArgs());
      long var24 = 255973732097233937L;
      Object[] var23 = var10012;
      var10012 = Ref.h(255973732097233937L, var23, var24);

      try {
         var10012 = (String)var10012;
      } catch (InvocationTargetException var77) {
         throw var77.getTargetException();
      }

      var1.setText(var10012);
      Object var25 = 577645454911985600L;
      JPasswordField var95 = (JPasswordField)Ref.g(577645454911985600L, var25);
      String var10014 = (String)(Registry.emptyArgs());
      long var28 = 328657051879287558L;
      Object[] var27 = var10014;
      var10014 = Ref.h(328657051879287558L, var27, var28);

      try {
         var10014 = (String)var10014;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      var1.setText(var10014);
      Object var29 = 132310058849395865L;
      JTextField var98 = (JTextField)Ref.g(132310058849395865L, var29);
      String var10016 = (String)(Registry.emptyArgs());
      long var32 = 183387209870064348L;
      Object[] var31 = var10016;
      var10016 = Ref.h(183387209870064348L, var31, var32);

      try {
         var10016 = (String)var10016;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      var1.setText(var10016);
      Object var33 = 480855221133532244L;
      JCheckBox var101 = (JCheckBox)Ref.g(480855221133532244L, var33);
      Object[] var10018 = Registry.emptyArgs();
      long var36 = 581008912184751225L;
      Object[] var35 = var10018;
      var10018 = Ref.h(581008912184751225L, var35, var36);

      try {
         var103 = (Boolean)var10018;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      var1.setSelected(var103);
      Object var37 = 264606901179483755L;
      JCheckBox var104 = (JCheckBox)Ref.g(264606901179483755L, var37);
      Object[] var10020 = Registry.emptyArgs();
      long var40 = 351807163041799452L;
      Object[] var39 = var10020;
      var10020 = Ref.h(351807163041799452L, var39, var40);

      try {
         var106 = (Boolean)var10020;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      var1.setSelected(var106);
      var10020 = Registry.emptyArgs();
      long var42 = 142726811055146914L;
      Object[] var41 = var10020;
      var10020 = Ref.h(142726811055146914L, var41, var42);

      try {
         var10020 = (Integer)var10020;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      label153: {
         int var10021 = Registry.lookupField(613057195457720571L).getInt(null);
         if (this == false) {
            if (var10020 == var10021) {
               Object var43 = 585848040491365148L;
               ((JComboBox)Ref.g(585848040491365148L, var43)).setSelectedIndex(0);
               if (this == false) {
                  break label153;
               }
            }

            var10020 = var1;
            Object[] var110 = Registry.emptyArgs();
            long var46 = 142726811055146914L;
            Object[] var45 = var110;
            Object var111 = Ref.h(142726811055146914L, var45, var46);

            try {
               var10021 = (Integer)var111;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            Registry.lookupField(187047088046998003L).getInt(null);
         }

         if (this == false) {
            if (var10020 == var10021) {
               Object var47 = 585848040491365148L;
               ((JComboBox)Ref.g(585848040491365148L, var47)).setSelectedIndex(1);
               if (this == false) {
                  break label153;
               }
            }

            var10020 = var1;
            Object[] var112 = Registry.emptyArgs();
            long var50 = 142726811055146914L;
            Object[] var49 = var112;
            Object var113 = Ref.h(142726811055146914L, var49, var50);

            try {
               var10021 = (Integer)var113;
            } catch (InvocationTargetException var70) {
               throw var70.getTargetException();
            }

            Registry.lookupField(561522029490727843L).getInt(null);
         }

         if (var10020 == var10021) {
            Object var51 = 585848040491365148L;
            ((JComboBox)Ref.g(585848040491365148L, var51)).setSelectedIndex(2);
         }
      }

      Object[] var10022 = Registry.emptyArgs();
      long var54 = 183387209870064348L;
      Object[] var53 = var10022;
      Registry.packArgs(Ref.h(183387209870064348L, var53, var54));
      long var55 = 602938716458919917L;
      Object var10023 = Ref.h2(602938716458919917L, var55);
      long var58 = 581836656594480986L;
      Object var57 = var10023;
      Ref.s(581836656594480986L, var57, var58);
      if (this == false) {
         Object var59 = 581836656594480986L;
         if ((LN3)Ref.g(581836656594480986L, var59) != null) {
            Object var61 = 132310058849395865L;
            JTextField var10025 = (JTextField)Ref.g(132310058849395865L, var61);
            Object var63 = 581836656594480986L;
            Object var10027 = Ref.g(581836656594480986L, var63);
            String var10028 = (String)(Registry.emptyArgs());
            long var66 = 286931176286176762L;
            Object[] var65 = var10028;
            var10028 = Ref.h(286931176286176762L, var65, var66);

            try {
               var10028 = (String)var10028;
            } catch (InvocationTargetException var69) {
               throw var69.getTargetException();
            }

            var10027.setText(var10028);
            if (this == false) {
               return;
            }
         }
      }

      Object var67 = 132310058849395865L;
      ((JTextField)Ref.g(132310058849395865L, var67)).setText("");
   }

   @Override
   public Vg2 c() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 586080412313098006
      // 004: astore 5
      // 006: ldc2_w 586080412313098006
      // 009: aload 5
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 011: ldc2_w 609184206856198648
      // 014: astore 7
      // 016: ldc2_w 609184206856198648
      // 019: aload 7
      // 01b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e: pop
      // 01f: goto 026
      // 022: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 025: athrow
      // 026: invokestatic com/finalshell/ui/panel/Z7.m ()I
      // 029: aload 0
      // 02a: ldc2_w 351668280571690269
      // 02d: astore 9
      // 02f: ldc2_w 351668280571690269
      // 032: aload 9
      // 034: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 037: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 03a: ldc2_w 609184206856198648
      // 03d: astore 11
      // 03f: ldc2_w 609184206856198648
      // 042: aload 11
      // 044: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 047: pop
      // 048: goto 04f
      // 04b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 0
      // 050: ldc2_w 531059755280049363
      // 053: astore 13
      // 055: ldc2_w 531059755280049363
      // 058: aload 13
      // 05a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 060: ldc2_w 609184206856198648
      // 063: astore 15
      // 065: ldc2_w 609184206856198648
      // 068: aload 15
      // 06a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 06d: pop
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: new com/finalshell/core/Vg2
      // 078: dup
      // 079: invokespecial com/finalshell/core/Vg2.<init> ()V
      // 07c: astore 2
      // 07d: aload 2
      // 07e: aload 0
      // 07f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 082: ldc2_w 143039821796059343
      // 085: astore 18
      // 087: astore 17
      // 089: ldc2_w 143039821796059343
      // 08c: aload 17
      // 08e: aload 18
      // 090: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 093: pop
      // 094: goto 09b
      // 097: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 0
      // 09d: ldc2_w 586080412313098006
      // 0a0: astore 19
      // 0a2: ldc2_w 586080412313098006
      // 0a5: aload 19
      // 0a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0aa: checkcast javax/swing/JTextField
      // 0ad: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0b0: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b3: ldc2_w 254069723652208787
      // 0b6: astore 22
      // 0b8: astore 21
      // 0ba: ldc2_w 254069723652208787
      // 0bd: aload 21
      // 0bf: aload 22
      // 0c1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c4: istore 1
      // 0c5: aload 0
      // 0c6: ldc2_w 254069723652208787
      // 0c9: astore 23
      // 0cb: ldc2_w 254069723652208787
      // 0ce: aload 23
      // 0d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d3: checkcast java/lang/String
      // 0d6: ldc_w ""
      // 0d9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0dc: iload 1
      // 0dd: ifeq 15e
      // 0e0: ifeq 148
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: ldc2_w 586080412313098006
      // 0ee: astore 25
      // 0f0: ldc2_w 586080412313098006
      // 0f3: aload 25
      // 0f5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f8: checkcast javax/swing/JTextField
      // 0fb: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 0fe: aload 2
      // 0ff: sipush -9134
      // 102: sipush -30772
      // 105: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 108: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 10b: ldc2_w 424356908681699937
      // 10e: astore 28
      // 110: astore 27
      // 112: ldc2_w 424356908681699937
      // 115: aload 27
      // 117: aload 28
      // 119: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11c: pop
      // 11d: goto 124
      // 120: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 2
      // 125: bipush 0
      // 126: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 129: ldc2_w 301723499838963718
      // 12c: astore 30
      // 12e: astore 29
      // 130: ldc2_w 301723499838963718
      // 133: aload 29
      // 135: aload 30
      // 137: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13a: pop
      // 13b: goto 142
      // 13e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 141: athrow
      // 142: aload 2
      // 143: areturn
      // 144: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 0
      // 149: iload 1
      // 14a: ifeq 218
      // 14d: ldc2_w 194975612625565682
      // 150: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 153: swap
      // 154: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: ifne 210
      // 161: new java/io/File
      // 164: dup
      // 165: new java/lang/StringBuilder
      // 168: dup
      // 169: invokespecial java/lang/StringBuilder.<init> ()V
      // 16c: aload 0
      // 16d: ldc2_w 385368274622886672
      // 170: astore 31
      // 172: ldc2_w 385368274622886672
      // 175: aload 31
      // 177: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17a: checkcast java/lang/String
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: getstatic java/io/File.separator Ljava/lang/String;
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: aload 0
      // 187: ldc2_w 254069723652208787
      // 18a: astore 33
      // 18c: ldc2_w 254069723652208787
      // 18f: aload 33
      // 191: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 194: checkcast java/lang/String
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: sipush -9094
      // 19d: sipush 1417
      // 1a0: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1ac: astore 3
      // 1ad: iload 1
      // 1ae: ifeq 20a
      // 1b1: aload 3
      // 1b2: invokevirtual java/io/File.exists ()Z
      // 1b5: ifeq 20c
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: aload 2
      // 1c0: sipush -9115
      // 1c3: sipush 16978
      // 1c6: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 1c9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1cc: ldc2_w 424356908681699937
      // 1cf: astore 36
      // 1d1: astore 35
      // 1d3: ldc2_w 424356908681699937
      // 1d6: aload 35
      // 1d8: aload 36
      // 1da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1dd: pop
      // 1de: goto 1e5
      // 1e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: aload 2
      // 1e6: bipush 0
      // 1e7: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 1ea: ldc2_w 301723499838963718
      // 1ed: astore 38
      // 1ef: astore 37
      // 1f1: ldc2_w 301723499838963718
      // 1f4: aload 37
      // 1f6: aload 38
      // 1f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fb: pop
      // 1fc: goto 203
      // 1ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 202: athrow
      // 203: goto 20a
      // 206: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 209: athrow
      // 20a: aload 2
      // 20b: areturn
      // 20c: iload 1
      // 20d: ifne 311
      // 210: aload 0
      // 211: goto 218
      // 214: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: ldc2_w 314219493031905147
      // 21b: astore 39
      // 21d: ldc2_w 314219493031905147
      // 220: aload 39
      // 222: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 225: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 228: ldc2_w 286931176286176762
      // 22b: astore 42
      // 22d: astore 41
      // 22f: ldc2_w 286931176286176762
      // 232: aload 41
      // 234: aload 42
      // 236: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 239: checkcast java/lang/String
      // 23c: goto 243
      // 23f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 242: athrow
      // 243: astore 3
      // 244: aload 3
      // 245: aload 0
      // 246: ldc2_w 254069723652208787
      // 249: astore 43
      // 24b: ldc2_w 254069723652208787
      // 24e: aload 43
      // 250: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 253: checkcast java/lang/String
      // 256: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 259: iload 1
      // 25a: ifeq 35c
      // 25d: ifne 311
      // 260: goto 267
      // 263: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 266: athrow
      // 267: new java/io/File
      // 26a: dup
      // 26b: new java/lang/StringBuilder
      // 26e: dup
      // 26f: invokespecial java/lang/StringBuilder.<init> ()V
      // 272: aload 0
      // 273: ldc2_w 385368274622886672
      // 276: astore 45
      // 278: ldc2_w 385368274622886672
      // 27b: aload 45
      // 27d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 280: checkcast java/lang/String
      // 283: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 286: getstatic java/io/File.separator Ljava/lang/String;
      // 289: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28c: aload 0
      // 28d: ldc2_w 254069723652208787
      // 290: astore 47
      // 292: ldc2_w 254069723652208787
      // 295: aload 47
      // 297: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 29a: checkcast java/lang/String
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: sipush -9118
      // 2a3: sipush 5983
      // 2a6: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2af: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2b2: astore 4
      // 2b4: aload 4
      // 2b6: invokevirtual java/io/File.exists ()Z
      // 2b9: iload 1
      // 2ba: ifeq 35c
      // 2bd: ifeq 311
      // 2c0: goto 2c7
      // 2c3: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c6: athrow
      // 2c7: aload 2
      // 2c8: sipush -9120
      // 2cb: sipush 1439
      // 2ce: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 2d1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d4: ldc2_w 424356908681699937
      // 2d7: astore 50
      // 2d9: astore 49
      // 2db: ldc2_w 424356908681699937
      // 2de: aload 49
      // 2e0: aload 50
      // 2e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e5: pop
      // 2e6: goto 2ed
      // 2e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: aload 2
      // 2ee: bipush 0
      // 2ef: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 2f2: ldc2_w 301723499838963718
      // 2f5: astore 52
      // 2f7: astore 51
      // 2f9: ldc2_w 301723499838963718
      // 2fc: aload 51
      // 2fe: aload 52
      // 300: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 303: pop
      // 304: goto 30b
      // 307: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 30a: athrow
      // 30b: aload 2
      // 30c: areturn
      // 30d: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: aload 0
      // 312: aload 0
      // 313: ldc2_w 351668280571690269
      // 316: astore 53
      // 318: ldc2_w 351668280571690269
      // 31b: aload 53
      // 31d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 320: checkcast javax/swing/JTextField
      // 323: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 326: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 329: ldc2_w 422009266530171987
      // 32c: astore 56
      // 32e: astore 55
      // 330: ldc2_w 422009266530171987
      // 333: aload 55
      // 335: aload 56
      // 337: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 33a: aload 0
      // 33b: iload 1
      // 33c: ifeq 3be
      // 33f: ldc2_w 422009266530171987
      // 342: astore 57
      // 344: ldc2_w 422009266530171987
      // 347: aload 57
      // 349: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 34c: checkcast java/lang/String
      // 34f: ldc_w ""
      // 352: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 355: goto 35c
      // 358: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35b: athrow
      // 35c: ifeq 3bd
      // 35f: aload 0
      // 360: ldc2_w 351668280571690269
      // 363: astore 59
      // 365: ldc2_w 351668280571690269
      // 368: aload 59
      // 36a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 36d: checkcast javax/swing/JTextField
      // 370: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 373: aload 2
      // 374: sipush -9123
      // 377: sipush 24943
      // 37a: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 37d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 380: ldc2_w 424356908681699937
      // 383: astore 62
      // 385: astore 61
      // 387: ldc2_w 424356908681699937
      // 38a: aload 61
      // 38c: aload 62
      // 38e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 391: pop
      // 392: goto 399
      // 395: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 398: athrow
      // 399: aload 2
      // 39a: bipush 0
      // 39b: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 39e: ldc2_w 301723499838963718
      // 3a1: astore 64
      // 3a3: astore 63
      // 3a5: ldc2_w 301723499838963718
      // 3a8: aload 63
      // 3aa: aload 64
      // 3ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3af: pop
      // 3b0: goto 3b7
      // 3b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b6: athrow
      // 3b7: aload 2
      // 3b8: areturn
      // 3b9: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bc: athrow
      // 3bd: aload 0
      // 3be: aload 0
      // 3bf: ldc2_w 531059755280049363
      // 3c2: astore 65
      // 3c4: ldc2_w 531059755280049363
      // 3c7: aload 65
      // 3c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3cc: checkcast javax/swing/JTextField
      // 3cf: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 3d2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3d5: ldc2_w 151764283561046445
      // 3d8: astore 67
      // 3da: ldc2_w 151764283561046445
      // 3dd: aload 67
      // 3df: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e2: checkcast java/lang/Integer
      // 3e5: invokevirtual java/lang/Integer.intValue ()I
      // 3e8: goto 3ef
      // 3eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ee: athrow
      // 3ef: ldc2_w 248201428268480063
      // 3f2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3f5: dup_x2
      // 3f6: pop
      // 3f7: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 3fa: goto 458
      // 3fd: astore 3
      // 3fe: aload 0
      // 3ff: ldc2_w 531059755280049363
      // 402: astore 69
      // 404: ldc2_w 531059755280049363
      // 407: aload 69
      // 409: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 40c: checkcast javax/swing/JTextField
      // 40f: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 412: aload 2
      // 413: sipush -9097
      // 416: sipush 31170
      // 419: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 41c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 41f: ldc2_w 424356908681699937
      // 422: astore 72
      // 424: astore 71
      // 426: ldc2_w 424356908681699937
      // 429: aload 71
      // 42b: aload 72
      // 42d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 430: pop
      // 431: goto 438
      // 434: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 437: athrow
      // 438: aload 2
      // 439: bipush 0
      // 43a: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 43d: ldc2_w 301723499838963718
      // 440: astore 74
      // 442: astore 73
      // 444: ldc2_w 301723499838963718
      // 447: aload 73
      // 449: aload 74
      // 44b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 44e: pop
      // 44f: goto 456
      // 452: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 455: athrow
      // 456: aload 2
      // 457: areturn
      // 458: aload 0
      // 459: ldc2_w 577645454911985600
      // 45c: astore 75
      // 45e: ldc2_w 577645454911985600
      // 461: aload 75
      // 463: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 466: aload 0
      // 467: ldc2_w 314219493031905147
      // 46a: astore 77
      // 46c: ldc2_w 314219493031905147
      // 46f: aload 77
      // 471: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 474: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 477: ldc2_w 241874182434251261
      // 47a: astore 79
      // 47c: ldc2_w 241874182434251261
      // 47f: aload 79
      // 481: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 484: pop
      // 485: goto 48c
      // 488: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 48b: athrow
      // 48c: aload 0
      // 48d: ldc2_w 585848040491365148
      // 490: astore 81
      // 492: ldc2_w 585848040491365148
      // 495: aload 81
      // 497: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 49a: checkcast javax/swing/JComboBox
      // 49d: invokevirtual javax/swing/JComboBox.getSelectedIndex ()I
      // 4a0: istore 3
      // 4a1: iload 3
      // 4a2: bipush 1
      // 4a3: if_icmpne 4cc
      // 4a6: aload 0
      // 4a7: ldc2_w 581836656594480986
      // 4aa: astore 83
      // 4ac: ldc2_w 581836656594480986
      // 4af: aload 83
      // 4b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4b4: checkcast com/finalshell/core/LN3
      // 4b7: ifnonnull 4cc
      // 4ba: goto 4c1
      // 4bd: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c0: athrow
      // 4c1: sipush -9126
      // 4c4: sipush 4489
      // 4c7: invokestatic com/finalshell/ui/panel/PublicKey.a (II)Ljava/lang/String;
      // 4ca: astore 4
      // 4cc: aload 2
      // 4cd: areturn
   }

   public static void g(JPasswordField param0, Lv4_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/Z7.m ()I
      // 03: new java/lang/String
      // 06: dup
      // 07: aload 0
      // 08: invokevirtual javax/swing/JPasswordField.getPassword ()[C
      // 0b: invokespecial java/lang/String.<init> ([C)V
      // 0e: astore 3
      // 0f: istore 2
      // 10: aload 3
      // 11: iload 2
      // 12: ifeq 2f
      // 15: ldc_w ""
      // 18: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b: ifeq 2c
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: goto ae
      // 28: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: ldc_w ""
      // 2f: astore 4
      // 31: aload 1
      // 32: iload 2
      // 33: ifeq 41
      // 36: ifnull 61
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 1
      // 41: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 44: ldc2_w 328657051879287558
      // 47: astore 8
      // 49: astore 7
      // 4b: ldc2_w 328657051879287558
      // 4e: aload 7
      // 50: aload 8
      // 52: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55: checkcast java/lang/String
      // 58: goto 5f
      // 5b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: astore 4
      // 61: aload 3
      // 62: iload 2
      // 63: ifeq 7f
      // 66: aload 4
      // 68: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6b: ifne ae
      // 6e: goto 75
      // 71: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: ldc_w ""
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/ui/panel/PublicKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: astore 5
      // 81: aload 3
      // 82: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 85: ldc2_w 466665856241452304
      // 88: astore 9
      // 8a: ldc2_w 466665856241452304
      // 8d: aload 9
      // 8f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 92: checkcast java/lang/String
      // 95: goto 9c
      // 98: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: astore 5
      // 9e: goto a8
      // a1: astore 6
      // a3: aload 6
      // a5: invokevirtual java/lang/Exception.printStackTrace ()V
      // a8: aload 0
      // a9: aload 5
      // ab: invokevirtual javax/swing/JPasswordField.setText (Ljava/lang/String;)V
      // ae: return
   }

   @Override
   public void F(Lv4_2 var1) {
      Object var10 = 586080412313098006L;
      String var3 = ((JTextField)Ref.g(586080412313098006L, var10)).getText().trim();
      Object[] var10002 = Registry.packArgs(var3);
      long var13 = 193904661956891993L;
      Object[] var12 = var10002;
      Ref.h(193904661956891993L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      Object var14 = 351668280571690269L;
      String var4 = ((JTextField)Ref.g(351668280571690269L, var14)).getText().trim();
      Z7.m();
      Object[] var10005 = Registry.packArgs(var4);
      long var17 = 147865982467055787L;
      Object[] var16 = var10005;
      Ref.h(147865982467055787L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      Object var18 = 531059755280049363L;
      String var5 = ((JTextField)Ref.g(531059755280049363L, var18)).getText().trim();
      Object[] var10007 = Registry.packArgs(Integer.parseInt(var5));
      long var21 = 386290519648630578L;
      Object[] var20 = var10007;
      Ref.h(386290519648630578L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      Object var22 = 566354696491472305L;
      String var6 = ((JTextField)Ref.g(566354696491472305L, var22)).getText().trim();
      Object[] var10009 = Registry.packArgs(var6);
      long var25 = 398038918869130788L;
      Object[] var24 = var10009;
      Ref.h(398038918869130788L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      String var10010;
      Object var26 = 577645454911985600L;
      super(((JPasswordField)Ref.g(577645454911985600L, var26)).getPassword());
      String var7 = var10010;
      Object[] var10011 = Registry.packArgs(var7);
      long var29 = 313165978053394358L;
      Object[] var28 = var10011;
      Ref.h(313165978053394358L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var65) {
         throw var65.getTargetException();
      }

      if (var1 != false) {
         Object var30 = 581836656594480986L;
         if ((LN3)Ref.g(581836656594480986L, var30) != null) {
            Object var32 = 581836656594480986L;
            Ref.g(581836656594480986L, var32);
            Object[] var10014 = Registry.emptyArgs();
            long var35 = 194080076253066315L;
            Object[] var34 = var10014;
            var10014 = Registry.packArgs(Ref.h(194080076253066315L, var34, var35));
            long var37 = 118023489548873021L;
            Object[] var36 = var10014;
            Ref.h(118023489548873021L, var36, var37);

            try {
               ;
            } catch (InvocationTargetException var64) {
               throw var64.getTargetException();
            }
         }

         Object var38 = 480855221133532244L;
         Object[] var10013 = Registry.packArgs(((JCheckBox)Ref.g(480855221133532244L, var38)).isSelected());
         long var41 = 285343467162226764L;
         Object[] var40 = var10013;
         Ref.h(285343467162226764L, var40, var41);

         try {
            ;
         } catch (InvocationTargetException var63) {
            throw var63.getTargetException();
         }

         Object var42 = 264606901179483755L;
         Object[] var10015 = Registry.packArgs(((JCheckBox)Ref.g(264606901179483755L, var42)).isSelected());
         long var45 = 299040192832639409L;
         Object[] var44 = var10015;
         Ref.h(299040192832639409L, var44, var45);

         try {
            ;
         } catch (InvocationTargetException var62) {
            throw var62.getTargetException();
         }
      }

      label134: {
         Object var46 = 585848040491365148L;
         int var8 = ((JComboBox)Ref.g(585848040491365148L, var46)).getSelectedIndex();
         int var70 = var8;
         if (var1 != false) {
            if (var8 == 0) {
               Object[] var10012 = Registry.packArgs(Registry.lookupField(613057195457720571L).getInt(null));
               long var49 = 465782969021020321L;
               Object[] var48 = var10012;
               Ref.h(465782969021020321L, var48, var49);

               try {
                  ;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               if (var1 != false) {
                  break label134;
               }
            }

            var70 = var8;
         }

         byte var71 = 1;
         if (var1 != false) {
            if (var70 == 1) {
               Object[] var72 = Registry.packArgs(Registry.lookupField(187047088046998003L).getInt(null));
               long var51 = 465782969021020321L;
               Object[] var50 = var72;
               Ref.h(465782969021020321L, var50, var51);

               try {
                  ;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               if (var1 != false) {
                  break label134;
               }
            }

            var70 = var8;
            var71 = 2;
         }

         if (var70 == var71) {
            Object[] var73 = Registry.packArgs(Registry.lookupField(561522029490727843L).getInt(null));
            long var53 = 465782969021020321L;
            Object[] var52 = var73;
            Ref.h(465782969021020321L, var52, var53);

            try {
               ;
            } catch (InvocationTargetException var59) {
               throw var59.getTargetException();
            }
         }
      }

      Object var54 = 459647606786793824L;
      String var9 = ((JTextArea)Ref.g(459647606786793824L, var54)).getText().trim();
      Object[] var74 = Registry.packArgs(var9);
      long var57 = 249125115094411481L;
      Object[] var56 = var74;
      Ref.h(249125115094411481L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -9093) & 65535;
      if (j[var2] == null) {
         char[] var3 = g[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 78;
               break;
            case 1:
               var10000 = 55;
               break;
            case 2:
               var10000 = 90;
               break;
            case 3:
               var10000 = 7;
               break;
            case 4:
               var10000 = 101;
               break;
            case 5:
               var10000 = 125;
               break;
            case 6:
               var10000 = 91;
               break;
            case 7:
               var10000 = 148;
               break;
            case 8:
               var10000 = 180;
               break;
            case 9:
               var10000 = 64;
               break;
            case 10:
               var10000 = 11;
               break;
            case 11:
               var10000 = 92;
               break;
            case 12:
               var10000 = 144;
               break;
            case 13:
               var10000 = 137;
               break;
            case 14:
               var10000 = 51;
               break;
            case 15:
               var10000 = 218;
               break;
            case 16:
               var10000 = 152;
               break;
            case 17:
               var10000 = 69;
               break;
            case 18:
               var10000 = 123;
               break;
            case 19:
               var10000 = 112;
               break;
            case 20:
               var10000 = 37;
               break;
            case 21:
               var10000 = 107;
               break;
            case 22:
               var10000 = 225;
               break;
            case 23:
               var10000 = 228;
               break;
            case 24:
               var10000 = 237;
               break;
            case 25:
               var10000 = 166;
               break;
            case 26:
               var10000 = 190;
               break;
            case 27:
               var10000 = 176;
               break;
            case 28:
               var10000 = 236;
               break;
            case 29:
               var10000 = 171;
               break;
            case 30:
               var10000 = 127;
               break;
            case 31:
               var10000 = 210;
               break;
            case 32:
               var10000 = 167;
               break;
            case 33:
               var10000 = 192;
               break;
            case 34:
               var10000 = 27;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 252;
               break;
            case 37:
               var10000 = 36;
               break;
            case 38:
               var10000 = 238;
               break;
            case 39:
               var10000 = 139;
               break;
            case 40:
               var10000 = 227;
               break;
            case 41:
               var10000 = 255;
               break;
            case 42:
               var10000 = 199;
               break;
            case 43:
               var10000 = 159;
               break;
            case 44:
               var10000 = 145;
               break;
            case 45:
               var10000 = 198;
               break;
            case 46:
               var10000 = 67;
               break;
            case 47:
               var10000 = 38;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 33;
               break;
            case 50:
               var10000 = 235;
               break;
            case 51:
               var10000 = 216;
               break;
            case 52:
               var10000 = 165;
               break;
            case 53:
               var10000 = 184;
               break;
            case 54:
               var10000 = 28;
               break;
            case 55:
               var10000 = 10;
               break;
            case 56:
               var10000 = 87;
               break;
            case 57:
               var10000 = 12;
               break;
            case 58:
               var10000 = 31;
               break;
            case 59:
               var10000 = 29;
               break;
            case 60:
               var10000 = 136;
               break;
            case 61:
               var10000 = 195;
               break;
            case 62:
               var10000 = 89;
               break;
            case 63:
               var10000 = 254;
               break;
            case 64:
               var10000 = 214;
               break;
            case 65:
               var10000 = 161;
               break;
            case 66:
               var10000 = 23;
               break;
            case 67:
               var10000 = 15;
               break;
            case 68:
               var10000 = 245;
               break;
            case 69:
               var10000 = 18;
               break;
            case 70:
               var10000 = 47;
               break;
            case 71:
               var10000 = 116;
               break;
            case 72:
               var10000 = 203;
               break;
            case 73:
               var10000 = 135;
               break;
            case 74:
               var10000 = 187;
               break;
            case 75:
               var10000 = 66;
               break;
            case 76:
               var10000 = 196;
               break;
            case 77:
               var10000 = 109;
               break;
            case 78:
               var10000 = 157;
               break;
            case 79:
               var10000 = 117;
               break;
            case 80:
               var10000 = 70;
               break;
            case 81:
               var10000 = 106;
               break;
            case 82:
               var10000 = 191;
               break;
            case 83:
               var10000 = 14;
               break;
            case 84:
               var10000 = 219;
               break;
            case 85:
               var10000 = 0;
               break;
            case 86:
               var10000 = 120;
               break;
            case 87:
               var10000 = 246;
               break;
            case 88:
               var10000 = 73;
               break;
            case 89:
               var10000 = 114;
               break;
            case 90:
               var10000 = 150;
               break;
            case 91:
               var10000 = 230;
               break;
            case 92:
               var10000 = 147;
               break;
            case 93:
               var10000 = 197;
               break;
            case 94:
               var10000 = 172;
               break;
            case 95:
               var10000 = 6;
               break;
            case 96:
               var10000 = 188;
               break;
            case 97:
               var10000 = 158;
               break;
            case 98:
               var10000 = 1;
               break;
            case 99:
               var10000 = 26;
               break;
            case 100:
               var10000 = 242;
               break;
            case 101:
               var10000 = 3;
               break;
            case 102:
               var10000 = 222;
               break;
            case 103:
               var10000 = 94;
               break;
            case 104:
               var10000 = 59;
               break;
            case 105:
               var10000 = 146;
               break;
            case 106:
               var10000 = 48;
               break;
            case 107:
               var10000 = 174;
               break;
            case 108:
               var10000 = 177;
               break;
            case 109:
               var10000 = 119;
               break;
            case 110:
               var10000 = 105;
               break;
            case 111:
               var10000 = 68;
               break;
            case 112:
               var10000 = 81;
               break;
            case 113:
               var10000 = 99;
               break;
            case 114:
               var10000 = 86;
               break;
            case 115:
               var10000 = 183;
               break;
            case 116:
               var10000 = 151;
               break;
            case 117:
               var10000 = 50;
               break;
            case 118:
               var10000 = 104;
               break;
            case 119:
               var10000 = 162;
               break;
            case 120:
               var10000 = 240;
               break;
            case 121:
               var10000 = 129;
               break;
            case 122:
               var10000 = 82;
               break;
            case 123:
               var10000 = 24;
               break;
            case 124:
               var10000 = 220;
               break;
            case 125:
               var10000 = 108;
               break;
            case 126:
               var10000 = 130;
               break;
            case 127:
               var10000 = 62;
               break;
            case 128:
               var10000 = 164;
               break;
            case 129:
               var10000 = 34;
               break;
            case 130:
               var10000 = 179;
               break;
            case 131:
               var10000 = 16;
               break;
            case 132:
               var10000 = 22;
               break;
            case 133:
               var10000 = 250;
               break;
            case 134:
               var10000 = 223;
               break;
            case 135:
               var10000 = 143;
               break;
            case 136:
               var10000 = 247;
               break;
            case 137:
               var10000 = 128;
               break;
            case 138:
               var10000 = 71;
               break;
            case 139:
               var10000 = 85;
               break;
            case 140:
               var10000 = 173;
               break;
            case 141:
               var10000 = 124;
               break;
            case 142:
               var10000 = 185;
               break;
            case 143:
               var10000 = 103;
               break;
            case 144:
               var10000 = 42;
               break;
            case 145:
               var10000 = 80;
               break;
            case 146:
               var10000 = 63;
               break;
            case 147:
               var10000 = 76;
               break;
            case 148:
               var10000 = 118;
               break;
            case 149:
               var10000 = 110;
               break;
            case 150:
               var10000 = 142;
               break;
            case 151:
               var10000 = 122;
               break;
            case 152:
               var10000 = 243;
               break;
            case 153:
               var10000 = 253;
               break;
            case 154:
               var10000 = 224;
               break;
            case 155:
               var10000 = 249;
               break;
            case 156:
               var10000 = 239;
               break;
            case 157:
               var10000 = 84;
               break;
            case 158:
               var10000 = 213;
               break;
            case 159:
               var10000 = 72;
               break;
            case 160:
               var10000 = 231;
               break;
            case 161:
               var10000 = 141;
               break;
            case 162:
               var10000 = 226;
               break;
            case 163:
               var10000 = 74;
               break;
            case 164:
               var10000 = 241;
               break;
            case 165:
               var10000 = 132;
               break;
            case 166:
               var10000 = 111;
               break;
            case 167:
               var10000 = 201;
               break;
            case 168:
               var10000 = 30;
               break;
            case 169:
               var10000 = 215;
               break;
            case 170:
               var10000 = 207;
               break;
            case 171:
               var10000 = 46;
               break;
            case 172:
               var10000 = 93;
               break;
            case 173:
               var10000 = 2;
               break;
            case 174:
               var10000 = 212;
               break;
            case 175:
               var10000 = 79;
               break;
            case 176:
               var10000 = 169;
               break;
            case 177:
               var10000 = 54;
               break;
            case 178:
               var10000 = 49;
               break;
            case 179:
               var10000 = 168;
               break;
            case 180:
               var10000 = 60;
               break;
            case 181:
               var10000 = 95;
               break;
            case 182:
               var10000 = 189;
               break;
            case 183:
               var10000 = 61;
               break;
            case 184:
               var10000 = 229;
               break;
            case 185:
               var10000 = 39;
               break;
            case 186:
               var10000 = 5;
               break;
            case 187:
               var10000 = 113;
               break;
            case 188:
               var10000 = 170;
               break;
            case 189:
               var10000 = 100;
               break;
            case 190:
               var10000 = 251;
               break;
            case 191:
               var10000 = 248;
               break;
            case 192:
               var10000 = 43;
               break;
            case 193:
               var10000 = 175;
               break;
            case 194:
               var10000 = 160;
               break;
            case 195:
               var10000 = 138;
               break;
            case 196:
               var10000 = 13;
               break;
            case 197:
               var10000 = 25;
               break;
            case 198:
               var10000 = 155;
               break;
            case 199:
               var10000 = 44;
               break;
            case 200:
               var10000 = 19;
               break;
            case 201:
               var10000 = 149;
               break;
            case 202:
               var10000 = 121;
               break;
            case 203:
               var10000 = 202;
               break;
            case 204:
               var10000 = 126;
               break;
            case 205:
               var10000 = 193;
               break;
            case 206:
               var10000 = 40;
               break;
            case 207:
               var10000 = 41;
               break;
            case 208:
               var10000 = 98;
               break;
            case 209:
               var10000 = 211;
               break;
            case 210:
               var10000 = 208;
               break;
            case 211:
               var10000 = 234;
               break;
            case 212:
               var10000 = 97;
               break;
            case 213:
               var10000 = 45;
               break;
            case 214:
               var10000 = 133;
               break;
            case 215:
               var10000 = 56;
               break;
            case 216:
               var10000 = 4;
               break;
            case 217:
               var10000 = 134;
               break;
            case 218:
               var10000 = 131;
               break;
            case 219:
               var10000 = 9;
               break;
            case 220:
               var10000 = 200;
               break;
            case 221:
               var10000 = 21;
               break;
            case 222:
               var10000 = 233;
               break;
            case 223:
               var10000 = 178;
               break;
            case 224:
               var10000 = 65;
               break;
            case 225:
               var10000 = 88;
               break;
            case 226:
               var10000 = 35;
               break;
            case 227:
               var10000 = 115;
               break;
            case 228:
               var10000 = 8;
               break;
            case 229:
               var10000 = 102;
               break;
            case 230:
               var10000 = 20;
               break;
            case 231:
               var10000 = 232;
               break;
            case 232:
               var10000 = 209;
               break;
            case 233:
               var10000 = 217;
               break;
            case 234:
               var10000 = 53;
               break;
            case 235:
               var10000 = 206;
               break;
            case 236:
               var10000 = 154;
               break;
            case 237:
               var10000 = 57;
               break;
            case 238:
               var10000 = 153;
               break;
            case 239:
               var10000 = 181;
               break;
            case 240:
               var10000 = 77;
               break;
            case 241:
               var10000 = 244;
               break;
            case 242:
               var10000 = 96;
               break;
            case 243:
               var10000 = 163;
               break;
            case 244:
               var10000 = 204;
               break;
            case 245:
               var10000 = 58;
               break;
            case 246:
               var10000 = 194;
               break;
            case 247:
               var10000 = 221;
               break;
            case 248:
               var10000 = 75;
               break;
            case 249:
               var10000 = 52;
               break;
            case 250:
               var10000 = 156;
               break;
            case 251:
               var10000 = 32;
               break;
            case 252:
               var10000 = 83;
               break;
            case 253:
               var10000 = 182;
               break;
            case 254:
               var10000 = 17;
               break;
            default:
               var10000 = 205;
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

         j[var2] = new String(var3).intern();
      }

      return j[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[42];
      int var5 = 0;
      String var4 = "ãÙ\u009f\u007f\u0005Í\u0007: Â\u0002髊縕\u000e\u008c[½¥(ò&\u008bîÌÑÉÂf\u0002宮磻\u0003礗钚:\u000eÅ§^Ì½¿\u0019\u001eIÔ-#\u0014Ù\u000e÷\u0019ÒíÅû\u009b¯Yè'í\u001cB\u0003税口ò\u0006\u008b涡覆´Ù¯\u0002³b\u0003宧砟Ë\b譚轥儼欦磖竘卣匃\u0003斃汚ß\u0003吔礞\u000f\u0003姷沵8\u000f\u0015GA¬¿vË\u0017ÑÓ\u0099C\u008e\u0016\u0091\u000e\u008bè\u0097%\u0084\u0082=¼®%Ñ\u001e\u008e\u001d\u001a%<B¿>ÑaÒGfå=\u0005yN_\u001eï\u009b-u\u001d@©Mj\u000et\u0093¢¼ËÑZïa@ XüT\u000f\u0087=\u0013ãõ\u009f\u0082*øt¼·*\u0088\u0005\n\u008aÕn4\u0011Ñ\u0014\u0086+v\u000bØ\u0002ÅlÈ[\u0012\u0015NòK\u000e\u0017úÎ\u0091Ftë^WÖæ*$º\u0004O;\n#\u0005ðn\u009d\u008d6\u0002帪觡\b巠対垃咈咦鄭翯\u009d\u0014ª¥\u0015\u0017mQ¤þ¦e\u0096Nè¸Hf+¢\u001f\u0089\u0002其铊\b嵧寯坳咪咸酩缬\u0015\u0003丞柢¾\u0010暚肎勝還Ù¸剆郘津姪朸勞嘿轩揚/\u0006峺材讣缃礪钚\f凢闳呔旆汦瘉揽机剣嚘伐惯\u0004畹戗吔\u0001\nÓ\u001e\u009cûåY\u0016Â&O$哐疂\u008e\r¯Iå\u0098ÞBØ\u009d!\u00858芚迯控丄尨袙敂心g讇净门謙飉x殠夬赟柔枥Þ\u0007護輗写丰朶垖圂\niÜË£\u000fRE£\u0083c";
      int var6 = "ãÙ\u009f\u007f\u0005Í\u0007: Â\u0002髊縕\u000e\u008c[½¥(ò&\u008bîÌÑÉÂf\u0002宮磻\u0003礗钚:\u000eÅ§^Ì½¿\u0019\u001eIÔ-#\u0014Ù\u000e÷\u0019ÒíÅû\u009b¯Yè'í\u001cB\u0003税口ò\u0006\u008b涡覆´Ù¯\u0002³b\u0003宧砟Ë\b譚轥儼欦磖竘卣匃\u0003斃汚ß\u0003吔礞\u000f\u0003姷沵8\u000f\u0015GA¬¿vË\u0017ÑÓ\u0099C\u008e\u0016\u0091\u000e\u008bè\u0097%\u0084\u0082=¼®%Ñ\u001e\u008e\u001d\u001a%<B¿>ÑaÒGfå=\u0005yN_\u001eï\u009b-u\u001d@©Mj\u000et\u0093¢¼ËÑZïa@ XüT\u000f\u0087=\u0013ãõ\u009f\u0082*øt¼·*\u0088\u0005\n\u008aÕn4\u0011Ñ\u0014\u0086+v\u000bØ\u0002ÅlÈ[\u0012\u0015NòK\u000e\u0017úÎ\u0091Ftë^WÖæ*$º\u0004O;\n#\u0005ðn\u009d\u008d6\u0002帪觡\b巠対垃咈咦鄭翯\u009d\u0014ª¥\u0015\u0017mQ¤þ¦e\u0096Nè¸Hf+¢\u001f\u0089\u0002其铊\b嵧寯坳咪咸酩缬\u0015\u0003丞柢¾\u0010暚肎勝還Ù¸剆郘津姪朸勞嘿轩揚/\u0006峺材讣缃礪钚\f凢闳呔旆汦瘉揽机剣嚘伐惯\u0004畹戗吔\u0001\nÓ\u001e\u009cûåY\u0016Â&O$哐疂\u008e\r¯Iå\u0098ÞBØ\u009d!\u00858芚迯控丄尨袙敂心g讇净门謙飉x殠夬赟柔枥Þ\u0007護輗写丰朶垖圂\niÜË£\u000fRE£\u0083c"
         .length();
      char var3 = 4;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 13;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
      long var23;
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 127;
                        break;
                     case 1:
                        var50 = 109;
                        break;
                     case 2:
                        var50 = 88;
                        break;
                     case 3:
                        var50 = 9;
                        break;
                     case 4:
                        var50 = 81;
                        break;
                     case 5:
                        var50 = 113;
                        break;
                     default:
                        var50 = 127;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     g = var7;
                     j = new String[42];
                     long var0 = 7739653394210764691L;
                     long var27 = -4974943737603672185L ^ var0;
                     byte var18 = -1;
                     k = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "謟讂\u0005讒輹凇吡秕";
                  var6 = "謟讂\u0005讒輹凇吡秕".length();
                  var3 = 2;
                  var10 = -1;
            }

            var10000 = 43;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





