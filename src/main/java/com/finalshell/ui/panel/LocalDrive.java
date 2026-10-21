package com.finalshell.ui.panel;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.G8;
import com.finalshell.ui.listener.WF;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class LocalDrive extends Z7 {
   JTextField u;
   JTextField N;
   JTextField O;
   JTextField Y;
   JPasswordField r;
   JComboBox J;
   JComboBox C;
   String i;
   int H;
   String G;
   JTextArea F;
   String w;
   JPanel s;
   JPanel y;
   String p;
   Lv4_2 E;
   JCheckBox A;
   JCheckBox z;
   JTextField X;
   JTextField S;
   boolean v;
   String g;
   JCheckBox t;
   public static String[] a;
   public static String[] b;
   public static long d;

   public LocalDrive(String var1, boolean var2) {
      int var10001 = (int)d;
      Registry.lookupField(154337357816029279L).setInt(this, var10001);
      String var26 = a(-3053, 7160);
      long var5 = 543761068727510639L;
      String var4 = var26;
      Ref.s(543761068727510639L, var4, var5);
      String var10002 = a(-3051, 22819);
      long var7 = 144088008064216702L;
      String var6 = var10002;
      Ref.s(144088008064216702L, var6, var7);
      long var9 = 237132661222451996L;
      Ref.s(237132661222451996L, var1, var9);
      Registry.lookupField(197355681785271272L).setBoolean(this, var2);
      JPanel var10005 = (JPanel)(Registry.emptyArgs());
      long var11 = 608704978143961012L;
      Object[] var10 = var10005;
      var10005 = Ref.h(608704978143961012L, var10, var11);

      try {
         var10005 = (JPanel)var10005;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      this.add(var10005, a(-3042, 6912));
      JPanel var10006 = (JPanel)(Registry.emptyArgs());
      long var13 = 365709943079984455L;
      Object[] var12 = var10006;
      var10006 = Ref.h(365709943079984455L, var12, var13);

      try {
         var10006 = (JPanel)var10006;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      this.add(var10006, a(-3049, 4970));
      JPanel var10007 = (JPanel)(Registry.emptyArgs());
      long var15 = 394619730622092443L;
      Object[] var14 = var10007;
      var10007 = Ref.h(394619730622092443L, var14, var15);

      try {
         var10007 = (JPanel)var10007;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      this.add(var10007, a(-3049, 4970));
      JPanel var10008 = (JPanel)(Registry.emptyArgs());
      long var17 = 576588122403023061L;
      Object[] var16 = var10008;
      var10008 = Ref.h(576588122403023061L, var16, var17);

      try {
         var10008 = (JPanel)var10008;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      this.add(var10008, a(-3049, 4970));
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(-3060, 3591)));
      this.add(var3, a(-3052, 15359));
      var3.setBorder(BorderFactory.createTitledBorder(a(-3040, 17837)));
      JCheckBox var35 = new JCheckBox(a(-3012, 4778), false);
      long var19 = 404502531953452066L;
      JCheckBox var18 = var35;
      Ref.s(404502531953452066L, var18, var19);
      Object var20 = 404502531953452066L;
      this.add((JCheckBox)Ref.g(404502531953452066L, var20), a(-3063, -11470));
   }

   JPanel S() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-3060, 3591)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-3019, 2034)));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-3020, -5181)));
      var1.add(var2, a(-3063, -11470));
      JLabel var10001 = new JLabel(a(-3010, 24700));
      Object var5 = 543761068727510639L;
      var10001.add(this, (String)Ref.g(543761068727510639L, var5));
      Registry.emptyArgs();
      long var7 = 373611601539122883L;
      Object var10003 = Ref.h2(373611601539122883L, var7);
      long var10 = 197610545248073809L;
      Object var9 = var10003;
      Ref.s(197610545248073809L, var9, var10);
      Object var11 = 197610545248073809L;
      JTextField var10005 = (JTextField)Ref.g(197610545248073809L, var11);
      Object var13 = 144088008064216702L;
      var10005.add(this, (String)Ref.g(144088008064216702L, var13));
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(-3020, -5181)));
      var1.add(var3, a(-3063, -11470));
      Registry.emptyArgs();
      long var15 = 373611601539122883L;
      Object var10007 = Ref.h2(373611601539122883L, var15);
      long var18 = 263407884175474521L;
      Object var17 = var10007;
      Ref.s(263407884175474521L, var17, var18);
      JLabel var10008 = new JLabel(a(-3035, 30077));
      Object var19 = 543761068727510639L;
      var10008.add(this, (String)Ref.g(543761068727510639L, var19));
      Object var21 = 263407884175474521L;
      JTextField var10010 = (JTextField)Ref.g(263407884175474521L, var21);
      Object var23 = 144088008064216702L;
      var10010.add(this, (String)Ref.g(144088008064216702L, var23));
      var3.add(new JLabel(a(-3041, -18093)));
      Registry.emptyArgs();
      long var25 = 373611601539122883L;
      Object var10012 = Ref.h2(373611601539122883L, var25);
      long var28 = 296269333086093142L;
      Object var27 = var10012;
      Ref.s(296269333086093142L, var27, var28);
      Object var29 = 296269333086093142L;
      ((JTextField)Ref.g(296269333086093142L, var29)).setText(a(-3048, 20764));
      Object var31 = 296269333086093142L;
      this.add((JTextField)Ref.g(296269333086093142L, var31), a(-3045, -8895));
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(-3020, -5181)));
      var1.add(var4, a(-3063, -11470));
      JLabel var10015 = new JLabel(a(-3011, 19474));
      StringBuilder var10016 = new StringBuilder();
      Object var33 = 543761068727510639L;
      var10015.add(var10016, this.append((String)Ref.g(543761068727510639L, var33)).append(a(-3025, -17490)).toString());
      Registry.emptyArgs();
      long var35 = 321230539747506149L;
      Object var10017 = Ref.h2(321230539747506149L, var35);
      long var38 = 249088734500529849L;
      Object var37 = var10017;
      Ref.s(249088734500529849L, var37, var38);
      Object var39 = 249088734500529849L;
      this.add((JTextArea)Ref.g(249088734500529849L, var39), a(-3013, -19889));
      Object var41 = 249088734500529849L;
      ((JTextArea)Ref.g(249088734500529849L, var41)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      return var1;
   }

   JPanel q() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-3060, 3591)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-3044, 16046)));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-3020, -5181)));
      var1.add(var2, a(-3063, -11470));
      JLabel var10001 = new JLabel(a(-3017, -30803));
      Object var4 = 543761068727510639L;
      var10001.add(this, (String)Ref.g(543761068727510639L, var4));
      JComboBox var10002 = new JComboBox();
      long var7 = 368767177165012471L;
      JComboBox var6 = var10002;
      Ref.s(368767177165012471L, var6, var7);
      Object var8 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var8)).setEnabled(true);
      Object var10 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var10)).addItem(a(-3039, 8084));
      Object var12 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var12)).addItem(a(-3014, 21051));
      Object var14 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var14)).addItem(a(-3064, -9822));
      Object var16 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var16)).addItem(a(-3047, -30206));
      Object var18 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var18)).addItem(a(-3016, -8983));
      Object var20 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var20)).addItem(a(-3059, 13273));
      Object var22 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var22)).addItem(a(-3033, 23646));
      Object var24 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var24)).addItem(a(-3023, -884));
      Object var26 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var26)).addItem(a(-3022, 15332));
      Object var28 = 368767177165012471L;
      JComboBox var10014 = (JComboBox)Ref.g(368767177165012471L, var28);
      Object var30 = 144088008064216702L;
      var10014.add(this, (String)Ref.g(144088008064216702L, var30));
      Object var32 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var32)).addItemListener(new WF(this));
      G8 var3 = new G8(this);
      Registry.emptyArgs();
      long var34 = 373611601539122883L;
      Object var10017 = Ref.h2(373611601539122883L, var34);
      long var37 = 415056051757211192L;
      Object var36 = var10017;
      Ref.s(415056051757211192L, var36, var37);
      Object var38 = 415056051757211192L;
      ((JTextField)Ref.g(415056051757211192L, var38)).addKeyListener(var3);
      Registry.emptyArgs();
      long var40 = 373611601539122883L;
      Object var10020 = Ref.h2(373611601539122883L, var40);
      long var43 = 363204830369816461L;
      Object var42 = var10020;
      Ref.s(363204830369816461L, var42, var43);
      Object var44 = 363204830369816461L;
      ((JTextField)Ref.g(363204830369816461L, var44)).addKeyListener(var3);
      Object var46 = 415056051757211192L;
      this.add((JTextField)Ref.g(415056051757211192L, var46), a(-3030, -10756));
      Object var48 = 363204830369816461L;
      this.add((JTextField)Ref.g(363204830369816461L, var48), a(-3018, 13163));
      Object var50 = 368767177165012471L;
      ((JComboBox)Ref.g(368767177165012471L, var50)).setSelectedItem(a(-3026, 4442));
      JCheckBox var10025 = new JCheckBox(a(-3032, 15138), false);
      long var53 = 453640689889277073L;
      JCheckBox var52 = var10025;
      Ref.s(453640689889277073L, var52, var53);
      Object var54 = 453640689889277073L;
      this.add((JCheckBox)Ref.g(453640689889277073L, var54), a(-3063, -11470));
      return var1;
   }

   JPanel B() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-3060, 3591)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-3024, -19659)));
      JCheckBox var10001 = new JCheckBox(a(-3015, 19602), true);
      long var3 = 235374670800404729L;
      JCheckBox var2 = var10001;
      Ref.s(235374670800404729L, var2, var3);
      Object var4 = 235374670800404729L;
      this.add((JCheckBox)Ref.g(235374670800404729L, var4), a(-3063, -11470));
      return var1;
   }

   void I() {
      label45: {
         Object var7 = 368767177165012471L;
         int var2 = ((JComboBox)Ref.g(368767177165012471L, var7)).getSelectedIndex();
         Z7.M();
         Object var9 = 368767177165012471L;
         String var3 = (String)((JComboBox)Ref.g(368767177165012471L, var9)).getSelectedItem();
         int var10002 = (var3.contains("x")) ? 1 : 0;
         if (this == false) {
            if (var10002 == 0) {
               break label45;
            }

            var10002 = var3.indexOf("x");
         }

         int var4 = var10002;
         String var5 = var3.substring(0, var4);
         String var6 = var3.substring(var4 + 1);
         Object var11 = 415056051757211192L;
         ((JTextField)Ref.g(415056051757211192L, var11)).setText(var5);
         Object var13 = 363204830369816461L;
         ((JTextField)Ref.g(363204830369816461L, var13)).setText(var6);
         Object var15 = 415056051757211192L;
         ((JTextField)Ref.g(415056051757211192L, var15)).setEnabled(false);
         Object var17 = 363204830369816461L;
         ((JTextField)Ref.g(363204830369816461L, var17)).setEnabled(false);
         if (this == false) {
            return;
         }
      }

      label37: {
         if (this == false) {
            Object var19 = 151389623773796165L;
            if ((Lv4_2)Ref.g(151389623773796165L, var19) != null) {
               Object var21 = 415056051757211192L;
               JTextField var10008 = (JTextField)Ref.g(415056051757211192L, var21);
               new StringBuilder().append("");
               Object var23 = 151389623773796165L;
               Object var10011 = Ref.g(151389623773796165L, var23);
               Object[] var10012 = Registry.emptyArgs();
               long var26 = 412792667242934937L;
               Object[] var25 = var10012;
               var10012 = Ref.h(412792667242934937L, var25, var26);

               try {
                  var45 = (Integer)var10012;
               } catch (InvocationTargetException var42) {
                  throw var42.getTargetException();
               }

               this.setText(var10011.append(var45).toString());
               Object var27 = 363204830369816461L;
               var10011 = (JTextField)Ref.g(363204830369816461L, var27);
               new StringBuilder().append("");
               Object var29 = 151389623773796165L;
               Object var10014 = Ref.g(151389623773796165L, var29);
               Object[] var10015 = Registry.emptyArgs();
               long var32 = 435664632647390684L;
               Object[] var31 = var10015;
               var10015 = Ref.h(435664632647390684L, var31, var32);

               try {
                  var47 = (Integer)var10015;
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               this.setText(var10014.append(var47).toString());
               if (this == false) {
                  break label37;
               }
            }

            Object var33 = 415056051757211192L;
            ((JTextField)Ref.g(415056051757211192L, var33)).setText("");
         }

         Object var35 = 363204830369816461L;
         ((JTextField)Ref.g(363204830369816461L, var35)).setText("");
      }

      Object var37 = 415056051757211192L;
      ((JTextField)Ref.g(415056051757211192L, var37)).setEnabled(true);
      Object var39 = 363204830369816461L;
      ((JTextField)Ref.g(363204830369816461L, var39)).setEnabled(true);
   }

   JPanel U() {
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout(a(-3055, -10212)));
      var1.setBorder(BorderFactory.createTitledBorder(a(-3043, -8432)));
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(-3021, 15664)));
      var1.add(var2, a(-3036, -4518));
      JLabel var10001 = new JLabel(a(-3034, 28101));
      Object var3 = 543761068727510639L;
      var10001.add(this, (String)Ref.g(543761068727510639L, var3));
      JComboBox var10002 = new JComboBox();
      long var6 = 468493916317149036L;
      JComboBox var5 = var10002;
      Ref.s(468493916317149036L, var5, var6);
      Object var7 = 468493916317149036L;
      ((JComboBox)Ref.g(468493916317149036L, var7)).setEnabled(false);
      Object var9 = 468493916317149036L;
      ((JComboBox)Ref.g(468493916317149036L, var9)).addItem(a(-3009, -31599));
      Object var11 = 468493916317149036L;
      ((JComboBox)Ref.g(468493916317149036L, var11)).addItem(a(-3057, -4632));
      Object var13 = 468493916317149036L;
      JComboBox var10007 = (JComboBox)Ref.g(468493916317149036L, var13);
      Object var15 = 144088008064216702L;
      var10007.add(this, (String)Ref.g(144088008064216702L, var15));
      JPanel var10008 = new JPanel();
      long var18 = 390304842584141116L;
      JPanel var17 = var10008;
      Ref.s(390304842584141116L, var17, var18);
      Object var19 = 390304842584141116L;
      ((JPanel)Ref.g(390304842584141116L, var19)).setLayout(new MigLayout(a(-3020, -5181)));
      Object var21 = 390304842584141116L;
      this.add((JPanel)Ref.g(390304842584141116L, var21), a(-3063, -11470));
      Registry.emptyArgs();
      long var23 = 373611601539122883L;
      Object var10012 = Ref.h2(373611601539122883L, var23);
      long var26 = 403035936589301088L;
      Object var25 = var10012;
      Ref.s(403035936589301088L, var25, var26);
      Object var27 = 390304842584141116L;
      JPanel var10013 = (JPanel)Ref.g(390304842584141116L, var27);
      JLabel var10014 = new JLabel(a(-3050, -7122));
      Object var29 = 543761068727510639L;
      var10014.add(this, (String)Ref.g(543761068727510639L, var29));
      Object var31 = 390304842584141116L;
      JPanel var10015 = (JPanel)Ref.g(390304842584141116L, var31);
      Object var33 = 403035936589301088L;
      JTextField var10017 = (JTextField)Ref.g(403035936589301088L, var33);
      Object var35 = 144088008064216702L;
      var10017.add(this, (String)Ref.g(144088008064216702L, var35));
      JPanel var10018 = new JPanel();
      long var38 = 369234700566588947L;
      JPanel var37 = var10018;
      Ref.s(369234700566588947L, var37, var38);
      Object var39 = 369234700566588947L;
      ((JPanel)Ref.g(369234700566588947L, var39)).setLayout(new MigLayout(a(-3020, -5181)));
      Object var41 = 369234700566588947L;
      this.add((JPanel)Ref.g(369234700566588947L, var41), a(-3063, -11470));
      Registry.emptyArgs();
      long var43 = 305013025773761213L;
      Object var10022 = Ref.h2(305013025773761213L, var43);
      long var46 = 391788251218956875L;
      Object var45 = var10022;
      Ref.s(391788251218956875L, var45, var46);
      Object var47 = 369234700566588947L;
      JPanel var10023 = (JPanel)Ref.g(369234700566588947L, var47);
      JLabel var10024 = new JLabel(a(-3031, -18740));
      Object var49 = 543761068727510639L;
      var10024.add(this, (String)Ref.g(543761068727510639L, var49));
      Object var51 = 369234700566588947L;
      JPanel var10025 = (JPanel)Ref.g(369234700566588947L, var51);
      Object var53 = 391788251218956875L;
      JPasswordField var10027 = (JPasswordField)Ref.g(391788251218956875L, var53);
      Object var55 = 144088008064216702L;
      var10027.add(this, (String)Ref.g(144088008064216702L, var55));
      Object var57 = 249088734500529849L;
      ((JTextArea)Ref.g(249088734500529849L, var57)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      return var1;
   }

   @Override
   public void A(Lv4_2 var1) {
      long var4 = 151389623773796165L;
      Ref.s(151389623773796165L, var1, var4);
      Object var5 = 197610545248073809L;
      JTextField var10002 = (JTextField)Ref.g(197610545248073809L, var5);
      String var10004 = (String)(Registry.emptyArgs());
      long var8 = 286931176286176762L;
      Object[] var7 = var10004;
      var10004 = Ref.h(286931176286176762L, var7, var8);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      var1.setText(var10004);
      Z7.M();
      Object var9 = 263407884175474521L;
      JTextField var10005 = (JTextField)Ref.g(263407884175474521L, var9);
      String var10007 = (String)(Registry.emptyArgs());
      long var12 = 380415140795833934L;
      Object[] var11 = var10007;
      var10007 = Ref.h(380415140795833934L, var11, var12);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      var1.setText(var10007);
      Object var13 = 296269333086093142L;
      JTextField var80 = (JTextField)Ref.g(296269333086093142L, var13);
      StringBuilder var10008 = new StringBuilder();
      Object[] var10010 = Registry.emptyArgs();
      long var16 = 255354522009994316L;
      Object[] var15 = var10010;
      var10010 = Ref.h(255354522009994316L, var15, var16);

      try {
         var82 = (Integer)var10010;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      var10008.setText(var1.append(var82).append("").toString());
      Object var17 = 249088734500529849L;
      JTextArea var10009 = (JTextArea)Ref.g(249088734500529849L, var17);
      String var10011 = (String)(Registry.emptyArgs());
      long var20 = 218711337515318169L;
      Object[] var19 = var10011;
      var10011 = Ref.h(218711337515318169L, var19, var20);

      try {
         var10011 = (String)var10011;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      var1.setText(var10011);
      Object var21 = 403035936589301088L;
      JTextField var85 = (JTextField)Ref.g(403035936589301088L, var21);
      String var10013 = (String)(Registry.emptyArgs());
      long var24 = 255973732097233937L;
      Object[] var23 = var10013;
      var10013 = Ref.h(255973732097233937L, var23, var24);

      try {
         var10013 = (String)var10013;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      var1.setText(var10013);
      Object var25 = 391788251218956875L;
      JPasswordField var88 = (JPasswordField)Ref.g(391788251218956875L, var25);
      String var10015 = (String)(Registry.emptyArgs());
      long var28 = 328657051879287558L;
      Object[] var27 = var10015;
      var10015 = Ref.h(328657051879287558L, var27, var28);

      try {
         var10015 = (String)var10015;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      var1.setText(var10015);
      Object var29 = 404502531953452066L;
      JCheckBox var91 = (JCheckBox)Ref.g(404502531953452066L, var29);
      Object[] var10017 = Registry.emptyArgs();
      long var32 = 581008912184751225L;
      Object[] var31 = var10017;
      var10017 = Ref.h(581008912184751225L, var31, var32);

      try {
         var93 = (Boolean)var10017;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      var1.setSelected(var93);
      JCheckBox var2 = var91;
      Object var33 = 235374670800404729L;
      JCheckBox var10016 = (JCheckBox)Ref.g(235374670800404729L, var33);
      Object[] var10018 = Registry.emptyArgs();
      long var36 = 210756892633166167L;
      Object[] var35 = var10018;
      var10018 = Ref.h(210756892633166167L, var35, var36);

      try {
         var95 = (Boolean)var10018;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      var1.setSelected(var95);
      var10018 = Registry.emptyArgs();
      long var38 = 142726811055146914L;
      Object[] var37 = var10018;
      var10018 = Ref.h(142726811055146914L, var37, var38);

      try {
         var10018 = (Integer)var10018;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      int var10019;
      label152: {
         label147: {
            var10019 = Registry.lookupField(613057195457720571L).getInt(null);
            if (var2 == false) {
               if (var10018 == var10019) {
                  Object var39 = 468493916317149036L;
                  ((JComboBox)Ref.g(468493916317149036L, var39)).setSelectedIndex(0);
                  if (var2 == false) {
                     break label147;
                  }
               }

               var10018 = var1;
               Object[] var99 = Registry.emptyArgs();
               long var42 = 142726811055146914L;
               Object[] var41 = var99;
               Object var100 = Ref.h(142726811055146914L, var41, var42);

               try {
                  var10019 = (Integer)var100;
               } catch (InvocationTargetException var66) {
                  throw var66.getTargetException();
               }

               if (var2 != false) {
                  break label152;
               }

               Registry.lookupField(187047088046998003L).getInt(null);
            }

            if (var10018 == var10019) {
               Object var43 = 468493916317149036L;
               ((JComboBox)Ref.g(468493916317149036L, var43)).setSelectedIndex(1);
            }
         }

         Object[] var101 = Registry.emptyArgs();
         long var46 = 460154043505201015L;
         Object[] var45 = var101;
         Object var102 = Ref.h(460154043505201015L, var45, var46);

         try {
            var10019 = (Boolean)var102;
         } catch (InvocationTargetException var65) {
            throw var65.getTargetException();
         }
      }

      label154: {
         if (var10019 != 0) {
            Object var47 = 368767177165012471L;
            ((JComboBox)Ref.g(368767177165012471L, var47)).setSelectedItem(a(-3022, 15332));
            if (var2 == false) {
               break label154;
            }
         }

         Object var49 = 368767177165012471L;
         JComboBox var10020 = (JComboBox)Ref.g(368767177165012471L, var49);
         new StringBuilder();
         Object[] var10023 = Registry.emptyArgs();
         long var52 = 412792667242934937L;
         Object[] var51 = var10023;
         var10023 = Ref.h(412792667242934937L, var51, var52);

         try {
            var104 = (Integer)var10023;
         } catch (InvocationTargetException var64) {
            throw var64.getTargetException();
         }

         StringBuilder var10022 = var1.append(var104).append("x");
         Object[] var10024 = Registry.emptyArgs();
         long var54 = 435664632647390684L;
         Object[] var53 = var10024;
         var10024 = Ref.h(435664632647390684L, var53, var54);

         try {
            var107 = (Integer)var10024;
         } catch (InvocationTargetException var63) {
            throw var63.getTargetException();
         }

         var10022.setSelectedItem(var1.append(var107).toString());
      }

      Object var55 = 453640689889277073L;
      JCheckBox var105 = (JCheckBox)Ref.g(453640689889277073L, var55);
      Object[] var10025 = Registry.emptyArgs();
      long var58 = 527408693245614383L;
      Object[] var57 = var10025;
      var10025 = Ref.h(527408693245614383L, var57, var58);

      try {
         var109 = (Boolean)var10025;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      var1.setSelected(var109);
      var10025 = Registry.emptyArgs();
      long var60 = 568446940499935634L;
      Object[] var59 = var10025;
      Ref.h(568446940499935634L, var59, var60);

      try {
         ;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }
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
      // 001: ldc2_w 197610545248073809
      // 004: astore 5
      // 006: ldc2_w 197610545248073809
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
      // 026: aload 0
      // 027: ldc2_w 263407884175474521
      // 02a: astore 9
      // 02c: ldc2_w 263407884175474521
      // 02f: aload 9
      // 031: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 034: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 037: ldc2_w 609184206856198648
      // 03a: astore 11
      // 03c: ldc2_w 609184206856198648
      // 03f: aload 11
      // 041: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 044: pop
      // 045: goto 04c
      // 048: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: invokestatic com/finalshell/ui/panel/Z7.m ()I
      // 04f: aload 0
      // 050: ldc2_w 296269333086093142
      // 053: astore 13
      // 055: ldc2_w 296269333086093142
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
      // 09d: ldc2_w 197610545248073809
      // 0a0: astore 19
      // 0a2: ldc2_w 197610545248073809
      // 0a5: aload 19
      // 0a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0aa: checkcast javax/swing/JTextField
      // 0ad: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0b0: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b3: ldc2_w 268964977328342525
      // 0b6: astore 22
      // 0b8: astore 21
      // 0ba: ldc2_w 268964977328342525
      // 0bd: aload 21
      // 0bf: aload 22
      // 0c1: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0c4: istore 1
      // 0c5: aload 0
      // 0c6: ldc2_w 268964977328342525
      // 0c9: astore 23
      // 0cb: ldc2_w 268964977328342525
      // 0ce: aload 23
      // 0d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d3: checkcast java/lang/String
      // 0d6: ldc_w ""
      // 0d9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0dc: iload 1
      // 0dd: ifeq 15e
      // 0e0: ifeq 148
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: ldc2_w 197610545248073809
      // 0ee: astore 25
      // 0f0: ldc2_w 197610545248073809
      // 0f3: aload 25
      // 0f5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f8: checkcast javax/swing/JTextField
      // 0fb: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 0fe: aload 2
      // 0ff: sipush -3058
      // 102: sipush -20961
      // 105: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
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
      // 144: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 0
      // 149: iload 1
      // 14a: ifeq 217
      // 14d: ldc2_w 197355681785271272
      // 150: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 153: swap
      // 154: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: ifne 20f
      // 161: new java/io/File
      // 164: dup
      // 165: new java/lang/StringBuilder
      // 168: dup
      // 169: invokespecial java/lang/StringBuilder.<init> ()V
      // 16c: aload 0
      // 16d: ldc2_w 237132661222451996
      // 170: astore 31
      // 172: ldc2_w 237132661222451996
      // 175: aload 31
      // 177: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17a: checkcast java/lang/String
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: getstatic java/io/File.separator Ljava/lang/String;
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: aload 0
      // 187: ldc2_w 268964977328342525
      // 18a: astore 33
      // 18c: ldc2_w 268964977328342525
      // 18f: aload 33
      // 191: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 194: checkcast java/lang/String
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: sipush -3029
      // 19d: bipush 65
      // 19f: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1ab: astore 3
      // 1ac: iload 1
      // 1ad: ifeq 209
      // 1b0: aload 3
      // 1b1: invokevirtual java/io/File.exists ()Z
      // 1b4: ifeq 20b
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: aload 2
      // 1bf: sipush -3027
      // 1c2: sipush 24765
      // 1c5: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 1c8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1cb: ldc2_w 424356908681699937
      // 1ce: astore 36
      // 1d0: astore 35
      // 1d2: ldc2_w 424356908681699937
      // 1d5: aload 35
      // 1d7: aload 36
      // 1d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1dc: pop
      // 1dd: goto 1e4
      // 1e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: aload 2
      // 1e5: bipush 0
      // 1e6: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 1e9: ldc2_w 301723499838963718
      // 1ec: astore 38
      // 1ee: astore 37
      // 1f0: ldc2_w 301723499838963718
      // 1f3: aload 37
      // 1f5: aload 38
      // 1f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fa: pop
      // 1fb: goto 202
      // 1fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 201: athrow
      // 202: goto 209
      // 205: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 208: athrow
      // 209: aload 2
      // 20a: areturn
      // 20b: iload 1
      // 20c: ifne 310
      // 20f: aload 0
      // 210: goto 217
      // 213: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: ldc2_w 151389623773796165
      // 21a: astore 39
      // 21c: ldc2_w 151389623773796165
      // 21f: aload 39
      // 221: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 224: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 227: ldc2_w 286931176286176762
      // 22a: astore 42
      // 22c: astore 41
      // 22e: ldc2_w 286931176286176762
      // 231: aload 41
      // 233: aload 42
      // 235: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 238: checkcast java/lang/String
      // 23b: goto 242
      // 23e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 241: athrow
      // 242: astore 3
      // 243: aload 3
      // 244: aload 0
      // 245: ldc2_w 268964977328342525
      // 248: astore 43
      // 24a: ldc2_w 268964977328342525
      // 24d: aload 43
      // 24f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 252: checkcast java/lang/String
      // 255: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 258: iload 1
      // 259: ifeq 35b
      // 25c: ifne 310
      // 25f: goto 266
      // 262: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: new java/io/File
      // 269: dup
      // 26a: new java/lang/StringBuilder
      // 26d: dup
      // 26e: invokespecial java/lang/StringBuilder.<init> ()V
      // 271: aload 0
      // 272: ldc2_w 237132661222451996
      // 275: astore 45
      // 277: ldc2_w 237132661222451996
      // 27a: aload 45
      // 27c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27f: checkcast java/lang/String
      // 282: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 285: getstatic java/io/File.separator Ljava/lang/String;
      // 288: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28b: aload 0
      // 28c: ldc2_w 268964977328342525
      // 28f: astore 47
      // 291: ldc2_w 268964977328342525
      // 294: aload 47
      // 296: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 299: checkcast java/lang/String
      // 29c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29f: sipush -3056
      // 2a2: sipush 2696
      // 2a5: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 2a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ae: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2b1: astore 4
      // 2b3: aload 4
      // 2b5: invokevirtual java/io/File.exists ()Z
      // 2b8: iload 1
      // 2b9: ifeq 35b
      // 2bc: ifeq 310
      // 2bf: goto 2c6
      // 2c2: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c5: athrow
      // 2c6: aload 2
      // 2c7: sipush -3038
      // 2ca: sipush 3224
      // 2cd: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 2d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d3: ldc2_w 424356908681699937
      // 2d6: astore 50
      // 2d8: astore 49
      // 2da: ldc2_w 424356908681699937
      // 2dd: aload 49
      // 2df: aload 50
      // 2e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e4: pop
      // 2e5: goto 2ec
      // 2e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2eb: athrow
      // 2ec: aload 2
      // 2ed: bipush 0
      // 2ee: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 2f1: ldc2_w 301723499838963718
      // 2f4: astore 52
      // 2f6: astore 51
      // 2f8: ldc2_w 301723499838963718
      // 2fb: aload 51
      // 2fd: aload 52
      // 2ff: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 302: pop
      // 303: goto 30a
      // 306: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 309: athrow
      // 30a: aload 2
      // 30b: areturn
      // 30c: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30f: athrow
      // 310: aload 0
      // 311: aload 0
      // 312: ldc2_w 263407884175474521
      // 315: astore 53
      // 317: ldc2_w 263407884175474521
      // 31a: aload 53
      // 31c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 31f: checkcast javax/swing/JTextField
      // 322: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 325: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 328: ldc2_w 220103127494977956
      // 32b: astore 56
      // 32d: astore 55
      // 32f: ldc2_w 220103127494977956
      // 332: aload 55
      // 334: aload 56
      // 336: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 339: aload 0
      // 33a: iload 1
      // 33b: ifeq 3bd
      // 33e: ldc2_w 220103127494977956
      // 341: astore 57
      // 343: ldc2_w 220103127494977956
      // 346: aload 57
      // 348: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 34b: checkcast java/lang/String
      // 34e: ldc_w ""
      // 351: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 354: goto 35b
      // 357: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: ifeq 3bc
      // 35e: aload 0
      // 35f: ldc2_w 263407884175474521
      // 362: astore 59
      // 364: ldc2_w 263407884175474521
      // 367: aload 59
      // 369: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 36c: checkcast javax/swing/JTextField
      // 36f: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 372: aload 2
      // 373: sipush -3028
      // 376: sipush -28349
      // 379: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 37c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 37f: ldc2_w 424356908681699937
      // 382: astore 62
      // 384: astore 61
      // 386: ldc2_w 424356908681699937
      // 389: aload 61
      // 38b: aload 62
      // 38d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 390: pop
      // 391: goto 398
      // 394: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 397: athrow
      // 398: aload 2
      // 399: bipush 0
      // 39a: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 39d: ldc2_w 301723499838963718
      // 3a0: astore 64
      // 3a2: astore 63
      // 3a4: ldc2_w 301723499838963718
      // 3a7: aload 63
      // 3a9: aload 64
      // 3ab: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ae: pop
      // 3af: goto 3b6
      // 3b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: aload 2
      // 3b7: areturn
      // 3b8: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: aload 0
      // 3bd: aload 0
      // 3be: ldc2_w 296269333086093142
      // 3c1: astore 65
      // 3c3: ldc2_w 296269333086093142
      // 3c6: aload 65
      // 3c8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3cb: checkcast javax/swing/JTextField
      // 3ce: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 3d1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3d4: ldc2_w 151764283561046445
      // 3d7: astore 67
      // 3d9: ldc2_w 151764283561046445
      // 3dc: aload 67
      // 3de: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e1: checkcast java/lang/Integer
      // 3e4: invokevirtual java/lang/Integer.intValue ()I
      // 3e7: goto 3ee
      // 3ea: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ed: athrow
      // 3ee: ldc2_w 154337357816029279
      // 3f1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3f4: dup_x2
      // 3f5: pop
      // 3f6: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 3f9: goto 457
      // 3fc: astore 3
      // 3fd: aload 0
      // 3fe: ldc2_w 296269333086093142
      // 401: astore 69
      // 403: ldc2_w 296269333086093142
      // 406: aload 69
      // 408: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 40b: checkcast javax/swing/JTextField
      // 40e: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 411: aload 2
      // 412: sipush -3046
      // 415: sipush 18094
      // 418: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 41b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 41e: ldc2_w 424356908681699937
      // 421: astore 72
      // 423: astore 71
      // 425: ldc2_w 424356908681699937
      // 428: aload 71
      // 42a: aload 72
      // 42c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 42f: pop
      // 430: goto 437
      // 433: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 436: athrow
      // 437: aload 2
      // 438: bipush 0
      // 439: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 43c: ldc2_w 301723499838963718
      // 43f: astore 74
      // 441: astore 73
      // 443: ldc2_w 301723499838963718
      // 446: aload 73
      // 448: aload 74
      // 44a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 44d: pop
      // 44e: goto 455
      // 451: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 454: athrow
      // 455: aload 2
      // 456: areturn
      // 457: aload 0
      // 458: ldc2_w 391788251218956875
      // 45b: astore 75
      // 45d: ldc2_w 391788251218956875
      // 460: aload 75
      // 462: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 465: aload 0
      // 466: ldc2_w 151389623773796165
      // 469: astore 77
      // 46b: ldc2_w 151389623773796165
      // 46e: aload 77
      // 470: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 473: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 476: ldc2_w 362361786719074322
      // 479: astore 79
      // 47b: ldc2_w 362361786719074322
      // 47e: aload 79
      // 480: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 483: pop
      // 484: goto 48b
      // 487: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 48a: athrow
      // 48b: aload 0
      // 48c: ldc2_w 415056051757211192
      // 48f: astore 81
      // 491: ldc2_w 415056051757211192
      // 494: aload 81
      // 496: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 499: checkcast javax/swing/JTextField
      // 49c: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 49f: astore 3
      // 4a0: aload 3
      // 4a1: iload 1
      // 4a2: ifeq 528
      // 4a5: ldc_w ""
      // 4a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4ab: ifeq 514
      // 4ae: goto 4b5
      // 4b1: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b4: athrow
      // 4b5: aload 0
      // 4b6: ldc2_w 415056051757211192
      // 4b9: astore 83
      // 4bb: ldc2_w 415056051757211192
      // 4be: aload 83
      // 4c0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4c3: checkcast javax/swing/JTextField
      // 4c6: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 4c9: aload 2
      // 4ca: sipush -3062
      // 4cd: sipush 3669
      // 4d0: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 4d3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d6: ldc2_w 424356908681699937
      // 4d9: astore 86
      // 4db: astore 85
      // 4dd: ldc2_w 424356908681699937
      // 4e0: aload 85
      // 4e2: aload 86
      // 4e4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e7: pop
      // 4e8: goto 4ef
      // 4eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ee: athrow
      // 4ef: aload 2
      // 4f0: bipush 0
      // 4f1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 4f4: ldc2_w 301723499838963718
      // 4f7: astore 88
      // 4f9: astore 87
      // 4fb: ldc2_w 301723499838963718
      // 4fe: aload 87
      // 500: aload 88
      // 502: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 505: pop
      // 506: goto 50d
      // 509: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50c: athrow
      // 50d: goto 514
      // 510: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: aload 0
      // 515: ldc2_w 363204830369816461
      // 518: astore 89
      // 51a: ldc2_w 363204830369816461
      // 51d: aload 89
      // 51f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 522: checkcast javax/swing/JTextField
      // 525: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 528: astore 4
      // 52a: iload 1
      // 52b: ifeq 581
      // 52e: aload 4
      // 530: ldc_w ""
      // 533: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 536: ifeq 59f
      // 539: goto 540
      // 53c: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53f: athrow
      // 540: aload 0
      // 541: ldc2_w 363204830369816461
      // 544: astore 91
      // 546: ldc2_w 363204830369816461
      // 549: aload 91
      // 54b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 54e: checkcast javax/swing/JTextField
      // 551: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 554: aload 2
      // 555: sipush -3037
      // 558: sipush -23235
      // 55b: invokestatic com/finalshell/ui/panel/LocalDrive.a (II)Ljava/lang/String;
      // 55e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 561: ldc2_w 424356908681699937
      // 564: astore 94
      // 566: astore 93
      // 568: ldc2_w 424356908681699937
      // 56b: aload 93
      // 56d: aload 94
      // 56f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 572: pop
      // 573: goto 57a
      // 576: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 579: athrow
      // 57a: goto 581
      // 57d: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 580: athrow
      // 581: aload 2
      // 582: bipush 0
      // 583: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 586: ldc2_w 301723499838963718
      // 589: astore 96
      // 58b: astore 95
      // 58d: ldc2_w 301723499838963718
      // 590: aload 95
      // 592: aload 96
      // 594: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 597: pop
      // 598: goto 59f
      // 59b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59e: athrow
      // 59f: aload 2
      // 5a0: areturn
   }

   public static void x(JPasswordField param0, Lv4_2 param1) {
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
      // 21: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: goto ae
      // 28: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: ldc_w ""
      // 2f: astore 4
      // 31: aload 1
      // 32: iload 2
      // 33: ifeq 41
      // 36: ifnull 61
      // 39: goto 40
      // 3c: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 71: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: ldc_w ""
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/ui/panel/LocalDrive.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      Z7.m();
      Object var12 = 197610545248073809L;
      String var3 = ((JTextField)Ref.g(197610545248073809L, var12)).getText().trim();
      Object[] var10003 = Registry.packArgs(var3);
      long var15 = 193904661956891993L;
      Object[] var14 = var10003;
      Ref.h(193904661956891993L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      Object var16 = 263407884175474521L;
      String var4 = ((JTextField)Ref.g(263407884175474521L, var16)).getText().trim();
      Object[] var10004 = Registry.packArgs(var4);
      long var19 = 147865982467055787L;
      Object[] var18 = var10004;
      Ref.h(147865982467055787L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      Object var20 = 296269333086093142L;
      String var5 = ((JTextField)Ref.g(296269333086093142L, var20)).getText().trim();
      Object[] var10006 = Registry.packArgs(Integer.parseInt(var5));
      long var23 = 386290519648630578L;
      Object[] var22 = var10006;
      Ref.h(386290519648630578L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var77) {
         throw var77.getTargetException();
      }

      Object var24 = 403035936589301088L;
      String var6 = ((JTextField)Ref.g(403035936589301088L, var24)).getText().trim();
      Object[] var10008 = Registry.packArgs(var6);
      long var27 = 398038918869130788L;
      Object[] var26 = var10008;
      Ref.h(398038918869130788L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      String var10009;
      Object var28 = 391788251218956875L;
      super(((JPasswordField)Ref.g(391788251218956875L, var28)).getPassword());
      String var7 = var10009;
      Object[] var10010 = Registry.packArgs(var7);
      long var31 = 313165978053394358L;
      Object[] var30 = var10010;
      Ref.h(313165978053394358L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      Object var32 = 404502531953452066L;
      Object[] var10012 = Registry.packArgs(((JCheckBox)Ref.g(404502531953452066L, var32)).isSelected());
      long var35 = 285343467162226764L;
      Object[] var34 = var10012;
      Ref.h(285343467162226764L, var34, var35);

      try {
         ;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      Object var36 = 235374670800404729L;
      Object[] var10014 = Registry.packArgs(((JCheckBox)Ref.g(235374670800404729L, var36)).isSelected());
      long var39 = 136029327388951965L;
      Object[] var38 = var10014;
      Ref.h(136029327388951965L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      label126: {
         Object var40 = 468493916317149036L;
         int var8 = ((JComboBox)Ref.g(468493916317149036L, var40)).getSelectedIndex();
         int var10015 = var8;
         if (this != false) {
            if (var8 == 0) {
               Object[] var10016 = Registry.packArgs(Registry.lookupField(613057195457720571L).getInt(null));
               long var43 = 465782969021020321L;
               Object[] var42 = var10016;
               Ref.h(465782969021020321L, var42, var43);

               try {
                  ;
               } catch (InvocationTargetException var72) {
                  throw var72.getTargetException();
               }

               if (this != false) {
                  break label126;
               }
            }

            var10015 = var8;
         }

         if (var10015 == 1) {
            Object[] var80 = Registry.packArgs(Registry.lookupField(187047088046998003L).getInt(null));
            long var45 = 465782969021020321L;
            Object[] var44 = var80;
            Ref.h(465782969021020321L, var44, var45);

            try {
               ;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }
         }
      }

      Object var46 = 415056051757211192L;
      String var9 = ((JTextField)Ref.g(415056051757211192L, var46)).getText();
      Object var48 = 363204830369816461L;
      String var10 = ((JTextField)Ref.g(363204830369816461L, var48)).getText();
      Object[] var10018 = Registry.packArgs(Integer.parseInt(var9));
      long var51 = 386938733058881227L;
      Object[] var50 = var10018;
      Ref.h(386938733058881227L, var50, var51);

      try {
         ;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      Object[] var10019 = Registry.packArgs(Integer.parseInt(var10));
      long var53 = 429583442676138840L;
      Object[] var52 = var10019;
      Ref.h(429583442676138840L, var52, var53);

      try {
         ;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      Object var54 = 368767177165012471L;
      Object[] var10021 = Registry.packArgs(((JComboBox)Ref.g(368767177165012471L, var54)).getSelectedItem().equals(a(-3054, 23583)));
      long var57 = 569225572219534069L;
      Object[] var56 = var10021;
      Ref.h(569225572219534069L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      Object var58 = 249088734500529849L;
      String var11 = ((JTextArea)Ref.g(249088734500529849L, var58)).getText().trim();
      Object[] var10023 = Registry.packArgs(var11);
      long var61 = 249125115094411481L;
      Object[] var60 = var10023;
      Ref.h(249125115094411481L, var60, var61);

      try {
         ;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      Object var62 = 453640689889277073L;
      Object[] var10025 = Registry.packArgs(((JCheckBox)Ref.g(453640689889277073L, var62)).isSelected());
      long var65 = 465479196941257969L;
      Object[] var64 = var10025;
      Ref.h(465479196941257969L, var64, var65);

      try {
         ;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3012) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 137;
               break;
            case 1:
               var10000 = 95;
               break;
            case 2:
               var10000 = 148;
               break;
            case 3:
               var10000 = 4;
               break;
            case 4:
               var10000 = 255;
               break;
            case 5:
               var10000 = 75;
               break;
            case 6:
               var10000 = 157;
               break;
            case 7:
               var10000 = 179;
               break;
            case 8:
               var10000 = 15;
               break;
            case 9:
               var10000 = 188;
               break;
            case 10:
               var10000 = 212;
               break;
            case 11:
               var10000 = 56;
               break;
            case 12:
               var10000 = 186;
               break;
            case 13:
               var10000 = 123;
               break;
            case 14:
               var10000 = 156;
               break;
            case 15:
               var10000 = 141;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 73;
               break;
            case 18:
               var10000 = 228;
               break;
            case 19:
               var10000 = 136;
               break;
            case 20:
               var10000 = 130;
               break;
            case 21:
               var10000 = 185;
               break;
            case 22:
               var10000 = 92;
               break;
            case 23:
               var10000 = 8;
               break;
            case 24:
               var10000 = 210;
               break;
            case 25:
               var10000 = 231;
               break;
            case 26:
               var10000 = 183;
               break;
            case 27:
               var10000 = 1;
               break;
            case 28:
               var10000 = 86;
               break;
            case 29:
               var10000 = 81;
               break;
            case 30:
               var10000 = 44;
               break;
            case 31:
               var10000 = 173;
               break;
            case 32:
               var10000 = 54;
               break;
            case 33:
               var10000 = 125;
               break;
            case 34:
               var10000 = 58;
               break;
            case 35:
               var10000 = 134;
               break;
            case 36:
               var10000 = 215;
               break;
            case 37:
               var10000 = 143;
               break;
            case 38:
               var10000 = 169;
               break;
            case 39:
               var10000 = 94;
               break;
            case 40:
               var10000 = 42;
               break;
            case 41:
               var10000 = 83;
               break;
            case 42:
               var10000 = 226;
               break;
            case 43:
               var10000 = 16;
               break;
            case 44:
               var10000 = 71;
               break;
            case 45:
               var10000 = 115;
               break;
            case 46:
               var10000 = 46;
               break;
            case 47:
               var10000 = 101;
               break;
            case 48:
               var10000 = 155;
               break;
            case 49:
               var10000 = 174;
               break;
            case 50:
               var10000 = 222;
               break;
            case 51:
               var10000 = 9;
               break;
            case 52:
               var10000 = 40;
               break;
            case 53:
               var10000 = 225;
               break;
            case 54:
               var10000 = 198;
               break;
            case 55:
               var10000 = 163;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 166;
               break;
            case 58:
               var10000 = 100;
               break;
            case 59:
               var10000 = 43;
               break;
            case 60:
               var10000 = 13;
               break;
            case 61:
               var10000 = 242;
               break;
            case 62:
               var10000 = 104;
               break;
            case 63:
               var10000 = 202;
               break;
            case 64:
               var10000 = 25;
               break;
            case 65:
               var10000 = 254;
               break;
            case 66:
               var10000 = 249;
               break;
            case 67:
               var10000 = 232;
               break;
            case 68:
               var10000 = 29;
               break;
            case 69:
               var10000 = 218;
               break;
            case 70:
               var10000 = 116;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 96;
               break;
            case 73:
               var10000 = 147;
               break;
            case 74:
               var10000 = 99;
               break;
            case 75:
               var10000 = 27;
               break;
            case 76:
               var10000 = 129;
               break;
            case 77:
               var10000 = 168;
               break;
            case 78:
               var10000 = 245;
               break;
            case 79:
               var10000 = 37;
               break;
            case 80:
               var10000 = 175;
               break;
            case 81:
               var10000 = 32;
               break;
            case 82:
               var10000 = 233;
               break;
            case 83:
               var10000 = 203;
               break;
            case 84:
               var10000 = 3;
               break;
            case 85:
               var10000 = 90;
               break;
            case 86:
               var10000 = 176;
               break;
            case 87:
               var10000 = 98;
               break;
            case 88:
               var10000 = 149;
               break;
            case 89:
               var10000 = 194;
               break;
            case 90:
               var10000 = 187;
               break;
            case 91:
               var10000 = 223;
               break;
            case 92:
               var10000 = 150;
               break;
            case 93:
               var10000 = 213;
               break;
            case 94:
               var10000 = 106;
               break;
            case 95:
               var10000 = 31;
               break;
            case 96:
               var10000 = 139;
               break;
            case 97:
               var10000 = 14;
               break;
            case 98:
               var10000 = 238;
               break;
            case 99:
               var10000 = 170;
               break;
            case 100:
               var10000 = 165;
               break;
            case 101:
               var10000 = 80;
               break;
            case 102:
               var10000 = 158;
               break;
            case 103:
               var10000 = 93;
               break;
            case 104:
               var10000 = 28;
               break;
            case 105:
               var10000 = 178;
               break;
            case 106:
               var10000 = 112;
               break;
            case 107:
               var10000 = 201;
               break;
            case 108:
               var10000 = 64;
               break;
            case 109:
               var10000 = 135;
               break;
            case 110:
               var10000 = 35;
               break;
            case 111:
               var10000 = 70;
               break;
            case 112:
               var10000 = 206;
               break;
            case 113:
               var10000 = 199;
               break;
            case 114:
               var10000 = 196;
               break;
            case 115:
               var10000 = 2;
               break;
            case 116:
               var10000 = 205;
               break;
            case 117:
               var10000 = 237;
               break;
            case 118:
               var10000 = 146;
               break;
            case 119:
               var10000 = 177;
               break;
            case 120:
               var10000 = 138;
               break;
            case 121:
               var10000 = 241;
               break;
            case 122:
               var10000 = 30;
               break;
            case 123:
               var10000 = 184;
               break;
            case 124:
               var10000 = 18;
               break;
            case 125:
               var10000 = 171;
               break;
            case 126:
               var10000 = 48;
               break;
            case 127:
               var10000 = 17;
               break;
            case 128:
               var10000 = 204;
               break;
            case 129:
               var10000 = 55;
               break;
            case 130:
               var10000 = 229;
               break;
            case 131:
               var10000 = 121;
               break;
            case 132:
               var10000 = 36;
               break;
            case 133:
               var10000 = 107;
               break;
            case 134:
               var10000 = 240;
               break;
            case 135:
               var10000 = 72;
               break;
            case 136:
               var10000 = 63;
               break;
            case 137:
               var10000 = 128;
               break;
            case 138:
               var10000 = 117;
               break;
            case 139:
               var10000 = 216;
               break;
            case 140:
               var10000 = 208;
               break;
            case 141:
               var10000 = 23;
               break;
            case 142:
               var10000 = 111;
               break;
            case 143:
               var10000 = 33;
               break;
            case 144:
               var10000 = 118;
               break;
            case 145:
               var10000 = 140;
               break;
            case 146:
               var10000 = 12;
               break;
            case 147:
               var10000 = 38;
               break;
            case 148:
               var10000 = 159;
               break;
            case 149:
               var10000 = 26;
               break;
            case 150:
               var10000 = 190;
               break;
            case 151:
               var10000 = 103;
               break;
            case 152:
               var10000 = 5;
               break;
            case 153:
               var10000 = 211;
               break;
            case 154:
               var10000 = 200;
               break;
            case 155:
               var10000 = 62;
               break;
            case 156:
               var10000 = 21;
               break;
            case 157:
               var10000 = 152;
               break;
            case 158:
               var10000 = 120;
               break;
            case 159:
               var10000 = 248;
               break;
            case 160:
               var10000 = 219;
               break;
            case 161:
               var10000 = 214;
               break;
            case 162:
               var10000 = 24;
               break;
            case 163:
               var10000 = 39;
               break;
            case 164:
               var10000 = 195;
               break;
            case 165:
               var10000 = 252;
               break;
            case 166:
               var10000 = 97;
               break;
            case 167:
               var10000 = 19;
               break;
            case 168:
               var10000 = 250;
               break;
            case 169:
               var10000 = 239;
               break;
            case 170:
               var10000 = 45;
               break;
            case 171:
               var10000 = 11;
               break;
            case 172:
               var10000 = 50;
               break;
            case 173:
               var10000 = 87;
               break;
            case 174:
               var10000 = 167;
               break;
            case 175:
               var10000 = 124;
               break;
            case 176:
               var10000 = 65;
               break;
            case 177:
               var10000 = 243;
               break;
            case 178:
               var10000 = 109;
               break;
            case 179:
               var10000 = 230;
               break;
            case 180:
               var10000 = 22;
               break;
            case 181:
               var10000 = 142;
               break;
            case 182:
               var10000 = 79;
               break;
            case 183:
               var10000 = 172;
               break;
            case 184:
               var10000 = 227;
               break;
            case 185:
               var10000 = 236;
               break;
            case 186:
               var10000 = 66;
               break;
            case 187:
               var10000 = 182;
               break;
            case 188:
               var10000 = 108;
               break;
            case 189:
               var10000 = 144;
               break;
            case 190:
               var10000 = 76;
               break;
            case 191:
               var10000 = 53;
               break;
            case 192:
               var10000 = 82;
               break;
            case 193:
               var10000 = 180;
               break;
            case 194:
               var10000 = 77;
               break;
            case 195:
               var10000 = 57;
               break;
            case 196:
               var10000 = 162;
               break;
            case 197:
               var10000 = 47;
               break;
            case 198:
               var10000 = 0;
               break;
            case 199:
               var10000 = 41;
               break;
            case 200:
               var10000 = 224;
               break;
            case 201:
               var10000 = 119;
               break;
            case 202:
               var10000 = 131;
               break;
            case 203:
               var10000 = 133;
               break;
            case 204:
               var10000 = 247;
               break;
            case 205:
               var10000 = 234;
               break;
            case 206:
               var10000 = 192;
               break;
            case 207:
               var10000 = 251;
               break;
            case 208:
               var10000 = 132;
               break;
            case 209:
               var10000 = 244;
               break;
            case 210:
               var10000 = 67;
               break;
            case 211:
               var10000 = 145;
               break;
            case 212:
               var10000 = 61;
               break;
            case 213:
               var10000 = 7;
               break;
            case 214:
               var10000 = 221;
               break;
            case 215:
               var10000 = 60;
               break;
            case 216:
               var10000 = 102;
               break;
            case 217:
               var10000 = 161;
               break;
            case 218:
               var10000 = 105;
               break;
            case 219:
               var10000 = 209;
               break;
            case 220:
               var10000 = 85;
               break;
            case 221:
               var10000 = 20;
               break;
            case 222:
               var10000 = 114;
               break;
            case 223:
               var10000 = 253;
               break;
            case 224:
               var10000 = 68;
               break;
            case 225:
               var10000 = 74;
               break;
            case 226:
               var10000 = 197;
               break;
            case 227:
               var10000 = 91;
               break;
            case 228:
               var10000 = 217;
               break;
            case 229:
               var10000 = 235;
               break;
            case 230:
               var10000 = 153;
               break;
            case 231:
               var10000 = 6;
               break;
            case 232:
               var10000 = 181;
               break;
            case 233:
               var10000 = 207;
               break;
            case 234:
               var10000 = 151;
               break;
            case 235:
               var10000 = 126;
               break;
            case 236:
               var10000 = 127;
               break;
            case 237:
               var10000 = 246;
               break;
            case 238:
               var10000 = 193;
               break;
            case 239:
               var10000 = 49;
               break;
            case 240:
               var10000 = 113;
               break;
            case 241:
               var10000 = 154;
               break;
            case 242:
               var10000 = 34;
               break;
            case 243:
               var10000 = 51;
               break;
            case 244:
               var10000 = 164;
               break;
            case 245:
               var10000 = 88;
               break;
            case 246:
               var10000 = 78;
               break;
            case 247:
               var10000 = 220;
               break;
            case 248:
               var10000 = 189;
               break;
            case 249:
               var10000 = 191;
               break;
            case 250:
               var10000 = 110;
               break;
            case 251:
               var10000 = 10;
               break;
            case 252:
               var10000 = 160;
               break;
            case 253:
               var10000 = 69;
               break;
            case 254:
               var10000 = 122;
               break;
            default:
               var10000 = 89;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[55];
      int var5 = 0;
      String var4 = "暱胞刁遗7á则逮淕妍柿則囤还捼\u0002\u0003姥池Ã\u0003呶秇ú\u0002嬗碟\t h\u0081\u001cý[\u0081lA\u0005杸坪驵刂嘚\u0007#\u0014É\u001dº;ì\u001aþ\u000f\u0080\u0000\u0013\u0005F\u0095¸7Ãbâ\u0010oi\u0083ð]í/Ø\u0010¨\u009e?\u000eòýË¨\u0093pÓ\u0003KÄ¼\u001dLÞ\u0002廨覿\n`æS=i¢\u0006`\\¢\u0004劲農玵\u0000\u0002暉屿\tþ\u0019?Qìò¥]\u0003\u0003臩宖乡\u000e\u0081Å¥¯^\u0090j\u001f|GZm\u0090Ð\u0007讧輡儺丯朷坖垠\b嶠嬷圲周哥鄒缅§\tÖ2WÓ.¢ùQ\b\u000b\u0093³\u0015\u0083§\u0085}\u0013¸\u008bL\u0002写峗\u0003孛磒í\n²¥\tU\"¯oÁq\u0096\u00050å<%w\u0004Å,â\u0018\u0003亖柏\u0016\u0003攉沝7\tF\u0000Oÿf'òã/\u0002驔纓\u0007ã>\u001eÜB\u000b±\b嶙寯圕味吁酱羙Ë\u0006謱辭凨劃迿珮\u0002昪禎\u0002设论\u000f'\u0097¾o5-\u0018¡°¼lÛ\u0013\u0087ÿ\u0003稷叱l\u0004\u001b\u0000¬½\t\\\u0097\u0006g\u00044¼\u0083 \b譩辵凣毥硘窃匰厵\nìFÂ)[ M0\u0099¨\nµ40Ñ¯NA¨\u009a\n\u000e\u0012f\u001d-  ;%u¯s:ù\u001b\u0004疹戬咵¿\u000fæZ\u0086Ö2\u001aøG¬`ï@côñ\u0005;©]¬[\u000eTÏ\u001fî\t¸\u0080\u001f!çñÙåæ\u0003腰嬗乒\n×´¥w·ëÞI$\u0087\u000e¨ô\u0080\u0089úTþ\u0082îT\b¯Ú(\tï\u001dz\\ÀS$e·\u0005讱輔凸咿禥\u0002凤鑦\bÐº\u009d\u0084<Ê½\u0090";
      int var6 = "暱胞刁遗7á则逮淕妍柿則囤还捼\u0002\u0003姥池Ã\u0003呶秇ú\u0002嬗碟\t h\u0081\u001cý[\u0081lA\u0005杸坪驵刂嘚\u0007#\u0014É\u001dº;ì\u001aþ\u000f\u0080\u0000\u0013\u0005F\u0095¸7Ãbâ\u0010oi\u0083ð]í/Ø\u0010¨\u009e?\u000eòýË¨\u0093pÓ\u0003KÄ¼\u001dLÞ\u0002廨覿\n`æS=i¢\u0006`\\¢\u0004劲農玵\u0000\u0002暉屿\tþ\u0019?Qìò¥]\u0003\u0003臩宖乡\u000e\u0081Å¥¯^\u0090j\u001f|GZm\u0090Ð\u0007讧輡儺丯朷坖垠\b嶠嬷圲周哥鄒缅§\tÖ2WÓ.¢ùQ\b\u000b\u0093³\u0015\u0083§\u0085}\u0013¸\u008bL\u0002写峗\u0003孛磒í\n²¥\tU\"¯oÁq\u0096\u00050å<%w\u0004Å,â\u0018\u0003亖柏\u0016\u0003攉沝7\tF\u0000Oÿf'òã/\u0002驔纓\u0007ã>\u001eÜB\u000b±\b嶙寯圕味吁酱羙Ë\u0006謱辭凨劃迿珮\u0002昪禎\u0002设论\u000f'\u0097¾o5-\u0018¡°¼lÛ\u0013\u0087ÿ\u0003稷叱l\u0004\u001b\u0000¬½\t\\\u0097\u0006g\u00044¼\u0083 \b譩辵凣毥硘窃匰厵\nìFÂ)[ M0\u0099¨\nµ40Ñ¯NA¨\u009a\n\u000e\u0012f\u001d-  ;%u¯s:ù\u001b\u0004疹戬咵¿\u000fæZ\u0086Ö2\u001aøG¬`ï@côñ\u0005;©]¬[\u000eTÏ\u001fî\t¸\u0080\u001f!çñÙåæ\u0003腰嬗乒\n×´¥w·ëÞI$\u0087\u000e¨ô\u0080\u0089úTþ\u0082îT\b¯Ú(\tï\u001dz\\ÀS$e·\u0005讱輔凸咿禥\u0002凤鑦\bÐº\u009d\u0084<Ê½\u0090"
         .length();
      char var3 = 16;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 66;
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
                        var50 = 101;
                        break;
                     case 1:
                        var50 = 53;
                        break;
                     case 2:
                        var50 = 4;
                        break;
                     case 3:
                        var50 = 125;
                        break;
                     case 4:
                        var50 = 9;
                        break;
                     case 5:
                        var50 = 122;
                        break;
                     default:
                        var50 = 80;
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
                     a = var7;
                     b = new String[55];
                     long var0 = 9114406206872929209L;
                     long var27 = 1056361795033678767L ^ var0;
                     byte var18 = -1;
                     d = var27;
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

                  var4 = "¤RÙÀ\u0006謗轺儻剮辒獄";
                  var6 = "¤RÙÀ\u0006謗轺儻剮辒獄".length();
                  var3 = 4;
                  var10 = -1;
            }

            var10000 = 115;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





