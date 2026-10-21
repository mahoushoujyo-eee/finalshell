package com.finalshell.ui.panel;

import com.finalshell.core.FX3;
import com.finalshell.core.KD;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.U62;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.MU;
import com.finalshell.task.YC;
import com.finalshell.ui.listener.Fd2;
import com.finalshell.ui.listener.MH;
import com.finalshell.ui.listener.ML;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class EnableBackgroundImage extends Z7 {
   public JList O;
   public ListModel o;
   public JTextField P;
   public int v;
   public int f;
   public JComboBox g;
   public boolean F;
   public static Ky4[] Y;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] i;

   public EnableBackgroundImage() {
      super();
      long var34;
      Boolean var66;
      Integer var69;
      Registry.lookupField(339248888387146093L).setInt(this, a(11345, 9071719247284532724L));
      Registry.lookupField(158353115971356460L).setInt(this, a(23114, 8646614288436495340L));
      I();
      Registry.lookupField(427521949153014927L).setBoolean(this, false);
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      U62 var10003 = (U62)(Registry.emptyArgs());
      long var12 = 306266403902896148L;
      Object var11 = var10003;
      var10003 = Ref.h(306266403902896148L, var11, var12);

      try {
         var10003 = (U62)var10003;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      U62 var2 = var10003;
      JPanel var3 = new JPanel(new MigLayout(a(9160, 14067)));
      this.add(var3, a(9153, 3075));
      JCheckBox var64;
      String var10005 = a(9161, 13496);
      Object var10007 = Registry.emptyArgs();
      long var14 = 224406316798891066L;
      Object var13 = var10007;
      var10007 = Ref.h(224406316798891066L, var13, var14);

      try {
         var66 = (Boolean)var10007;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

var10005 = (EnableBackgroundImage)(new com.finalshell.ui.listener.Oi2(var2, var66));
      JCheckBox var4 = var64;
      var4.setForeground(new Color(a(16906, 6456310998628703149L), 0, a(18249, 1688511695136890605L)));
      var3.add(var4, "");
      JCheckBox var1 = var64;
      var4.addItemListener(new MH(this, var2, var4));
      JLabel var5 = new JLabel(a(9154, 16450));
      var5.setForeground(new Color(0, 0, a(1027, 6037901765845966243L)));
      var5.setFont((Font)Registry.lookupField(449209254921925454L).get(null));
      JComboBox var10004 = new JComboBox();
      long var16 = 616493311248242714L;
      JComboBox var15 = var10004;
      Ref.s(616493311248242714L, var15, var16);
      Object var17 = 616493311248242714L;
      ((JComboBox)Ref.g(616493311248242714L, var17)).setForeground(new Color(0, 0, a(26953, 6250026264920731880L)));
      Object var19 = 616493311248242714L;
      ((JComboBox)Ref.g(616493311248242714L, var19)).setFont((Font)Registry.lookupField(449209254921925454L).get(null));
      int var6 = 0;

      while (true) {
         if (var6 < a(11348, 4264436767161710071L)) {
            Object var21 = 616493311248242714L;
            ((JComboBox)Ref.g(616493311248242714L, var21)).addItem(var6);
            var6++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }

            Ky4.K(new String[3]);
         }

         Object var23 = 616493311248242714L;
         ((JComboBox)Ref.g(616493311248242714L, var23)).addItemListener(new Fd2(this));
         Object var25 = 616493311248242714L;
         JComboBox var10008 = (JComboBox)Ref.g(616493311248242714L, var25);
         Registry.emptyArgs();
         long var27 = 270389152141252877L;
         Ref.h2(270389152141252877L, var27);
         JComboBox var10011 = Registry.emptyArgs();
         long var30 = 306266403902896148L;
         Object var29 = var10011;
         var10011 = (JComboBox)Ref.h(306266403902896148L, var29, var30);
         Object var10012 = Registry.emptyArgs();
         long var32 = 358544030666779924L;
         Object var31 = var10012;
         var10012 = Ref.h(358544030666779924L, var31, var32);

         try {
            var69 = (Integer)var10012;
         } catch (InvocationTargetException var58) {
            throw var58.getTargetException();
         }

         var10011.setSelectedItem(var69);
         break;
      }

      JPanel var61 = new JPanel(new MigLayout(a(9152, 7398)));
      this.add(var61, a(9157, 9607));
      var61.add(new JLabel(a(9163, 9453)));
      JTextField var70 = new JTextField();
      var34 = 411696319453013122L;
      JTextField var33 = var70;
      Ref.s(411696319453013122L, var33, var34);
      Object var35 = 411696319453013122L;
      ((JTextField)Ref.g(411696319453013122L, var35)).setOpaque(false);
      Object var37 = 411696319453013122L;
      ((JTextField)Ref.g(411696319453013122L, var37)).setEditable(false);
      Object var39 = 411696319453013122L;
      this.add((JTextField)Ref.g(411696319453013122L, var39));
      KD var7 = new KD(a(9158, 27460));
      this.add(var7, a(9157, 9607));
      var7.V(2, 4, 2, 4);
      var7.addActionListener(new com.finalshell.ui.listener.Oi2(this, var2));
      this.add(new JLabel(a(9156, 22309)), a(9159, 6520));
      JList var10016 = new JList();
      long var42 = 563971228817595380L;
      JList var41 = var10016;
      Ref.s(563971228817595380L, var41, var42);
      Object var43 = 563971228817595380L;
      ((JList)Ref.g(563971228817595380L, var43))
         .setBackground(new Color(a(718, 6942612082025454433L), a(27051, 5966837600905998345L), a(27051, 5966837600905998345L)));
      Object var45 = 563971228817595380L;
      ListModel var10019 = ((JList)Ref.g(563971228817595380L, var45)).getModel();
      long var48 = 558337117145722546L;
      ListModel var47 = var10019;
      Ref.s(558337117145722546L, var47, var48);
      Object var49 = 563971228817595380L;
      ((JList)Ref.g(563971228817595380L, var49)).getSelectionModel().setSelectionMode(0);
      Object var51 = 563971228817595380L;
      ((JList)Ref.g(563971228817595380L, var51)).addListSelectionListener(new ML(this, var4));
      JScrollPane var10022;
      Object var53 = 563971228817595380L;
      // [VF-super] super((JList)Ref.g(563971228817595380L, var53));
      JScrollPane var8 = var10022;
      this.add(var8, a(9155, 21190));
      Object[] var10023 = Registry.emptyArgs();
      long var56 = 588163506851117394L;
      Object[] var55 = var10023;
      Ref.h(588163506851117394L, var55, var56);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void g(String var1) {
      Object[] var34;
      I();
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 306266403902896148L;
      Object[] var6 = var10003;
      var10003 = Ref.h(306266403902896148L, var6, var7);
      ArrayList var10004 = Registry.emptyArgs();
      long var9 = 313091340064438462L;
      Object var8 = var10004;
      var10004 = Ref.h(313091340064438462L, var8, var9);

      try {
         var10004 = (FX3)var10004;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      Object var2;
      FX3 var3;
      label146: {
         var3 = (FX3)(var10004);
         var2 = var10003;
         var10003 = var1.startsWith(a(9165, 1668));
         if (var2 != null) {
            if (var10003 == null) {
               var10003 = Registry.emptyArgs();
               long var10 = 270389152141252877L;
               Ref.h2(270389152141252877L, var10);
               Object[] var10005 = Registry.emptyArgs();
               long var13 = 306266403902896148L;
               Object[] var12 = var10005;
               Ref.h(306266403902896148L, var12, var13);
               Object[] var10006 = Registry.packArgs(var1);
               long var15 = 511939174150919335L;
               Object[] var14 = var10006;
               Ref.h(511939174150919335L, var14, var15);

               try {
                  ;
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }

               if (var2 != null) {
                  ArrayList var10007 = Registry.emptyArgs();
                  long var25 = 250284129792311327L;
                  Object var24 = var10007;
                  var10007 = Ref.h(250284129792311327L, var24, var25);

                  try {
                     var10007 = (ArrayList)var10007;
                  } catch (InvocationTargetException var48) {
                     throw var48.getTargetException();
                  }

                  var10007.size();
                  break label146;
               }

               new java.io.File(var1).exists();
            } else {
               var10003 = new java.io.File(var1).exists();
            }
         }

         if (var2 != null) {
            if (var10003 == null) {
               var10004 = Registry.packArgs(var1);
               long var17 = 586754005152705687L;
               Object var16 = var10004;
               Ref.h(586754005152705687L, var16, var17);

               try {
                  ;
               } catch (InvocationTargetException var45) {
                  throw var45.getTargetException();
               }

               Registry.emptyArgs();
               long var18 = 270389152141252877L;
               Ref.h2(270389152141252877L, var18);
               Object[] var64 = Registry.emptyArgs();
               long var21 = 306266403902896148L;
               Object[] var20 = var64;
               Ref.h(306266403902896148L, var20, var21);
               Object[] var74 = Registry.packArgs(var1);
               long var23 = 511939174150919335L;
               Object[] var22 = var74;
               Ref.h(511939174150919335L, var22, var23);

               try {
                  ;
               } catch (InvocationTargetException var44) {
                  throw var44.getTargetException();
               }
            }

            var10003 = var3;
            var10004 = Registry.emptyArgs();
            long var52 = 250284129792311327L;
            Object var50 = var10004;
            var10004 = Ref.h(250284129792311327L, var50, var52);

            try {
               var10004 = (ArrayList)var10004;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            var10004.size();
         }
      }

      while (var10003 > Registry.lookupField(158353115971356460L).getInt(this)) {
         var10003 = var3;
         Object[] var62 = Registry.emptyArgs();
         long var27 = 250284129792311327L;
         Object[] var26 = var62;
         Ref.h(250284129792311327L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var42) {
            throw var42.getTargetException();
         }

         ArrayList var65 = Registry.emptyArgs();
         long var29 = 250284129792311327L;
         Object var28 = var65;
         var65 = Ref.h(250284129792311327L, var28, var29);

         try {
            var65 = (ArrayList)var65;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         var3.remove(var65.size() - 1);
         if (var2 == null) {
            return;
         }

         if (var2 == null) {
            break;
         }

         var65 = Registry.emptyArgs();
         long var53 = 250284129792311327L;
         Object var51 = var65;
         var65 = Ref.h(250284129792311327L, var51, var53);

         try {
            var65 = (ArrayList)var65;
         } catch (InvocationTargetException var43) {
            throw var43.getTargetException();
         }

         var65.size();
      }

      Object[] var63 = Registry.emptyArgs();
      long var31 = 588163506851117394L;
      Object[] var30 = var63;
      Ref.h(588163506851117394L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Registry.emptyArgs();
      long var32 = 270389152141252877L;
      Ref.h2(270389152141252877L, var32);
      Object[] var71 = Registry.emptyArgs();
      long var35 = 578864097947885485L;
      var34 = var71;
      Ref.h(578864097947885485L, var34, var35);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      SwingUtilities.invokeLater(new MU(this));
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var75 = Registry.packArgs(new YC(this));
      long var37 = 434592463220957006L;
      Object[] var36 = var75;
      Ref.h(434592463220957006L, var36, var37);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }
   }

   public void o() {
      I();
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      var10003 = Ref.h(306266403902896148L, var8, var9);
      FX3 var10004 = (FX3)(Registry.emptyArgs());
      long var11 = 313091340064438462L;
      Object var10 = var10004;
      var10004 = Ref.h(313091340064438462L, var10, var11);

      try {
         var10004 = (FX3)var10004;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      FX3 var2 = var10004;
      ArrayList var3 = new ArrayList();
      Object var1 = var10003;
      int var4 = 0;

      while (true) {
         if (var4 < Registry.lookupField(339248888387146093L).getInt(this)) {
            var3.add(a(9164, 29514) + (var4 + 1) + a(9162, 25020));
            var4++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
         long var13 = 250284129792311327L;
         Object var12 = var10005;
         var10005 = Ref.h(250284129792311327L, var12, var13);

         try {
            var10005 = (ArrayList)var10005;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         var2.addAll(var10005);
         break;
      }

      String[] var27 = new String[var3.size()];
      int var5 = 0;

      while (true) {
         if (var5 < var3.size()) {
            var27[var5] = (String)var3.get(var5);
            var5++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         Object var14 = 563971228817595380L;
         ((JList)Ref.g(563971228817595380L, var14)).setListData(var27);
         Object var16 = 411696319453013122L;
         JTextField var10006 = (JTextField)Ref.g(411696319453013122L, var16);
         Registry.emptyArgs();
         long var18 = 270389152141252877L;
         Ref.h2(270389152141252877L, var18);
         JTextField var10009 = Registry.emptyArgs();
         long var21 = 306266403902896148L;
         Object var20 = var10009;
         var10009 = (JTextField)Ref.h(306266403902896148L, var20, var21);
         String var10010 = (String)(Registry.emptyArgs());
         long var23 = 338793095438116620L;
         Object var22 = var10010;
         var10010 = Ref.h(338793095438116620L, var22, var23);

         try {
            var10010 = (String)var10010;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         var10009.setText(var10010);
         break;
      }
   }

   @Override
   public void A(Lv4_2 var1) {
      if (var1 != null) {
      }
   }

   @Override
   public Vg2 c() {
      Vg2 var1 = new Vg2();
      Object[] var10001 = Registry.packArgs(this);
      long var3 = 143039821796059343L;
      Object[] var2 = var10001;
      Ref.h(143039821796059343L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(true);
      long var5 = 301723499838963718L;
      Object[] var4 = var10002;
      Ref.h(301723499838963718L, var4, var5);

      try {
         return var1;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void F(Lv4_2 var1) {
   }

   public static void R(Ky4[] var0) {
      Y = var0;
   }

   public static Ky4[] I() {
      return Y;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 9153) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 115;
               break;
            case 1:
               var10000 = 210;
               break;
            case 2:
               var10000 = 169;
               break;
            case 3:
               var10000 = 61;
               break;
            case 4:
               var10000 = 146;
               break;
            case 5:
               var10000 = 39;
               break;
            case 6:
               var10000 = 223;
               break;
            case 7:
               var10000 = 153;
               break;
            case 8:
               var10000 = 94;
               break;
            case 9:
               var10000 = 155;
               break;
            case 10:
               var10000 = 135;
               break;
            case 11:
               var10000 = 133;
               break;
            case 12:
               var10000 = 242;
               break;
            case 13:
               var10000 = 177;
               break;
            case 14:
               var10000 = 124;
               break;
            case 15:
               var10000 = 57;
               break;
            case 16:
               var10000 = 17;
               break;
            case 17:
               var10000 = 73;
               break;
            case 18:
               var10000 = 189;
               break;
            case 19:
               var10000 = 46;
               break;
            case 20:
               var10000 = 127;
               break;
            case 21:
               var10000 = 107;
               break;
            case 22:
               var10000 = 254;
               break;
            case 23:
               var10000 = 10;
               break;
            case 24:
               var10000 = 11;
               break;
            case 25:
               var10000 = 197;
               break;
            case 26:
               var10000 = 12;
               break;
            case 27:
               var10000 = 27;
               break;
            case 28:
               var10000 = 126;
               break;
            case 29:
               var10000 = 230;
               break;
            case 30:
               var10000 = 68;
               break;
            case 31:
               var10000 = 196;
               break;
            case 32:
               var10000 = 113;
               break;
            case 33:
               var10000 = 193;
               break;
            case 34:
               var10000 = 106;
               break;
            case 35:
               var10000 = 95;
               break;
            case 36:
               var10000 = 186;
               break;
            case 37:
               var10000 = 31;
               break;
            case 38:
               var10000 = 238;
               break;
            case 39:
               var10000 = 152;
               break;
            case 40:
               var10000 = 226;
               break;
            case 41:
               var10000 = 112;
               break;
            case 42:
               var10000 = 165;
               break;
            case 43:
               var10000 = 200;
               break;
            case 44:
               var10000 = 19;
               break;
            case 45:
               var10000 = 205;
               break;
            case 46:
               var10000 = 235;
               break;
            case 47:
               var10000 = 104;
               break;
            case 48:
               var10000 = 74;
               break;
            case 49:
               var10000 = 161;
               break;
            case 50:
               var10000 = 105;
               break;
            case 51:
               var10000 = 217;
               break;
            case 52:
               var10000 = 232;
               break;
            case 53:
               var10000 = 100;
               break;
            case 54:
               var10000 = 251;
               break;
            case 55:
               var10000 = 3;
               break;
            case 56:
               var10000 = 1;
               break;
            case 57:
               var10000 = 215;
               break;
            case 58:
               var10000 = 154;
               break;
            case 59:
               var10000 = 122;
               break;
            case 60:
               var10000 = 114;
               break;
            case 61:
               var10000 = 151;
               break;
            case 62:
               var10000 = 20;
               break;
            case 63:
               var10000 = 32;
               break;
            case 64:
               var10000 = 66;
               break;
            case 65:
               var10000 = 21;
               break;
            case 66:
               var10000 = 35;
               break;
            case 67:
               var10000 = 13;
               break;
            case 68:
               var10000 = 198;
               break;
            case 69:
               var10000 = 239;
               break;
            case 70:
               var10000 = 190;
               break;
            case 71:
               var10000 = 233;
               break;
            case 72:
               var10000 = 213;
               break;
            case 73:
               var10000 = 55;
               break;
            case 74:
               var10000 = 36;
               break;
            case 75:
               var10000 = 248;
               break;
            case 76:
               var10000 = 240;
               break;
            case 77:
               var10000 = 201;
               break;
            case 78:
               var10000 = 0;
               break;
            case 79:
               var10000 = 111;
               break;
            case 80:
               var10000 = 78;
               break;
            case 81:
               var10000 = 211;
               break;
            case 82:
               var10000 = 44;
               break;
            case 83:
               var10000 = 172;
               break;
            case 84:
               var10000 = 24;
               break;
            case 85:
               var10000 = 63;
               break;
            case 86:
               var10000 = 208;
               break;
            case 87:
               var10000 = 202;
               break;
            case 88:
               var10000 = 59;
               break;
            case 89:
               var10000 = 144;
               break;
            case 90:
               var10000 = 45;
               break;
            case 91:
               var10000 = 221;
               break;
            case 92:
               var10000 = 47;
               break;
            case 93:
               var10000 = 159;
               break;
            case 94:
               var10000 = 209;
               break;
            case 95:
               var10000 = 227;
               break;
            case 96:
               var10000 = 178;
               break;
            case 97:
               var10000 = 109;
               break;
            case 98:
               var10000 = 188;
               break;
            case 99:
               var10000 = 50;
               break;
            case 100:
               var10000 = 212;
               break;
            case 101:
               var10000 = 147;
               break;
            case 102:
               var10000 = 108;
               break;
            case 103:
               var10000 = 120;
               break;
            case 104:
               var10000 = 102;
               break;
            case 105:
               var10000 = 62;
               break;
            case 106:
               var10000 = 118;
               break;
            case 107:
               var10000 = 96;
               break;
            case 108:
               var10000 = 103;
               break;
            case 109:
               var10000 = 185;
               break;
            case 110:
               var10000 = 72;
               break;
            case 111:
               var10000 = 139;
               break;
            case 112:
               var10000 = 119;
               break;
            case 113:
               var10000 = 76;
               break;
            case 114:
               var10000 = 58;
               break;
            case 115:
               var10000 = 99;
               break;
            case 116:
               var10000 = 30;
               break;
            case 117:
               var10000 = 231;
               break;
            case 118:
               var10000 = 247;
               break;
            case 119:
               var10000 = 255;
               break;
            case 120:
               var10000 = 28;
               break;
            case 121:
               var10000 = 156;
               break;
            case 122:
               var10000 = 142;
               break;
            case 123:
               var10000 = 234;
               break;
            case 124:
               var10000 = 117;
               break;
            case 125:
               var10000 = 180;
               break;
            case 126:
               var10000 = 91;
               break;
            case 127:
               var10000 = 244;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 56;
               break;
            case 130:
               var10000 = 174;
               break;
            case 131:
               var10000 = 110;
               break;
            case 132:
               var10000 = 79;
               break;
            case 133:
               var10000 = 195;
               break;
            case 134:
               var10000 = 140;
               break;
            case 135:
               var10000 = 37;
               break;
            case 136:
               var10000 = 166;
               break;
            case 137:
               var10000 = 141;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 181;
               break;
            case 140:
               var10000 = 182;
               break;
            case 141:
               var10000 = 130;
               break;
            case 142:
               var10000 = 49;
               break;
            case 143:
               var10000 = 125;
               break;
            case 144:
               var10000 = 241;
               break;
            case 145:
               var10000 = 71;
               break;
            case 146:
               var10000 = 252;
               break;
            case 147:
               var10000 = 33;
               break;
            case 148:
               var10000 = 187;
               break;
            case 149:
               var10000 = 179;
               break;
            case 150:
               var10000 = 129;
               break;
            case 151:
               var10000 = 5;
               break;
            case 152:
               var10000 = 160;
               break;
            case 153:
               var10000 = 158;
               break;
            case 154:
               var10000 = 162;
               break;
            case 155:
               var10000 = 170;
               break;
            case 156:
               var10000 = 14;
               break;
            case 157:
               var10000 = 167;
               break;
            case 158:
               var10000 = 82;
               break;
            case 159:
               var10000 = 123;
               break;
            case 160:
               var10000 = 67;
               break;
            case 161:
               var10000 = 224;
               break;
            case 162:
               var10000 = 214;
               break;
            case 163:
               var10000 = 92;
               break;
            case 164:
               var10000 = 243;
               break;
            case 165:
               var10000 = 132;
               break;
            case 166:
               var10000 = 191;
               break;
            case 167:
               var10000 = 164;
               break;
            case 168:
               var10000 = 53;
               break;
            case 169:
               var10000 = 18;
               break;
            case 170:
               var10000 = 84;
               break;
            case 171:
               var10000 = 206;
               break;
            case 172:
               var10000 = 75;
               break;
            case 173:
               var10000 = 42;
               break;
            case 174:
               var10000 = 80;
               break;
            case 175:
               var10000 = 16;
               break;
            case 176:
               var10000 = 163;
               break;
            case 177:
               var10000 = 134;
               break;
            case 178:
               var10000 = 86;
               break;
            case 179:
               var10000 = 137;
               break;
            case 180:
               var10000 = 9;
               break;
            case 181:
               var10000 = 81;
               break;
            case 182:
               var10000 = 249;
               break;
            case 183:
               var10000 = 8;
               break;
            case 184:
               var10000 = 54;
               break;
            case 185:
               var10000 = 173;
               break;
            case 186:
               var10000 = 176;
               break;
            case 187:
               var10000 = 250;
               break;
            case 188:
               var10000 = 64;
               break;
            case 189:
               var10000 = 199;
               break;
            case 190:
               var10000 = 101;
               break;
            case 191:
               var10000 = 43;
               break;
            case 192:
               var10000 = 83;
               break;
            case 193:
               var10000 = 216;
               break;
            case 194:
               var10000 = 121;
               break;
            case 195:
               var10000 = 157;
               break;
            case 196:
               var10000 = 65;
               break;
            case 197:
               var10000 = 222;
               break;
            case 198:
               var10000 = 34;
               break;
            case 199:
               var10000 = 70;
               break;
            case 200:
               var10000 = 98;
               break;
            case 201:
               var10000 = 97;
               break;
            case 202:
               var10000 = 40;
               break;
            case 203:
               var10000 = 60;
               break;
            case 204:
               var10000 = 149;
               break;
            case 205:
               var10000 = 131;
               break;
            case 206:
               var10000 = 29;
               break;
            case 207:
               var10000 = 93;
               break;
            case 208:
               var10000 = 52;
               break;
            case 209:
               var10000 = 204;
               break;
            case 210:
               var10000 = 150;
               break;
            case 211:
               var10000 = 87;
               break;
            case 212:
               var10000 = 218;
               break;
            case 213:
               var10000 = 184;
               break;
            case 214:
               var10000 = 26;
               break;
            case 215:
               var10000 = 229;
               break;
            case 216:
               var10000 = 237;
               break;
            case 217:
               var10000 = 77;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 220;
               break;
            case 220:
               var10000 = 90;
               break;
            case 221:
               var10000 = 85;
               break;
            case 222:
               var10000 = 225;
               break;
            case 223:
               var10000 = 41;
               break;
            case 224:
               var10000 = 6;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 15;
               break;
            case 227:
               var10000 = 245;
               break;
            case 228:
               var10000 = 51;
               break;
            case 229:
               var10000 = 148;
               break;
            case 230:
               var10000 = 48;
               break;
            case 231:
               var10000 = 168;
               break;
            case 232:
               var10000 = 192;
               break;
            case 233:
               var10000 = 253;
               break;
            case 234:
               var10000 = 175;
               break;
            case 235:
               var10000 = 22;
               break;
            case 236:
               var10000 = 69;
               break;
            case 237:
               var10000 = 246;
               break;
            case 238:
               var10000 = 138;
               break;
            case 239:
               var10000 = 116;
               break;
            case 240:
               var10000 = 145;
               break;
            case 241:
               var10000 = 128;
               break;
            case 242:
               var10000 = 207;
               break;
            case 243:
               var10000 = 143;
               break;
            case 244:
               var10000 = 236;
               break;
            case 245:
               var10000 = 4;
               break;
            case 246:
               var10000 = 88;
               break;
            case 247:
               var10000 = 23;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 136;
               break;
            case 250:
               var10000 = 228;
               break;
            case 251:
               var10000 = 194;
               break;
            case 252:
               var10000 = 2;
               break;
            case 253:
               var10000 = 38;
               break;
            case 254:
               var10000 = 7;
               break;
            default:
               var10000 = 183;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22951;
      if (i[var3] == null) {
         i[var3] = (int)(d[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var34;
      int var66;
      String[] var13 = new String[14];
      int var11 = 0;
      Ky4[] var10000 = new Ky4[3];
      String var10 = "\u0012\u0019c%\u000exÂáÔK×ùK;¶)ÎÖ\u0095\u001f»^S±ô\u001b\u008bê<£Þf\u0081\u0093`~{©\u008e\u0087[y&Ñ\u009d(éEzPÚ\u0004檰簮繭刷\u0004DP©\f\u0005囋狳劖裳\u0003\u0011OIÍS'GñasÒ7H¼IÐÑ\u008f\t邝戳杮柂嚄犕Õ¯\u007f\u0006咲甾肉曏嚄狋\u000eCþ\u0086S§'dU\u0088u_¶\u0018\u009a\u0004弽刍肋晠\u0004[\u008d)»";
      int var12 = "\u0012\u0019c%\u000exÂáÔK×ùK;¶)ÎÖ\u0095\u001f»^S±ô\u001b\u008bê<£Þf\u0081\u0093`~{©\u008e\u0087[y&Ñ\u009d(éEzPÚ\u0004檰簮繭刷\u0004DP©\f\u0005囋狳劖裳\u0003\u0011OIÍS'GñasÒ7H¼IÐÑ\u008f\t邝戳杮柂嚄犕Õ¯\u007f\u0006咲甾肉曏嚄狋\u000eCþ\u0086S§'dU\u0088u_¶\u0018\u009a\u0004弽刍肋晠\u0004[\u008d)»"
         .length();
      char var9 = 4;
      R(var10000);
      int var17 = -1;

      label70:
      while (true) {
         byte var18 = 58;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var18;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               } else {
                  var43 = var18;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  switch (var14 % 7) {
                     case 0:
                        var66 = 101;
                        break;
                     case 1:
                        var66 = 18;
                        break;
                     case 2:
                        var66 = 8;
                        break;
                     case 3:
                        var66 = 117;
                        break;
                     case 4:
                        var66 = 98;
                        break;
                     case 5:
                        var66 = 36;
                        break;
                     default:
                        var66 = 123;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[14];
                     long var0 = 5216992543731064123L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "\u0016&\u008dÉ\u0094E\u0086\u0082r\u0086Ò|Ðà\u009eÃæ,»µ\u0080\u0084hÊLË\u001bj/I\u0083@äPÙÌµ:hÇLÔþ\u001cÖ\u0081\u00adÈ\u0095jðzù\u0085\u00ad,";
                     int var5 = "\u0016&\u008dÉ\u0094E\u0086\u0082r\u0086Ò|Ðà\u009eÃæ,»µ\u0080\u0084hÊLË\u001bj/I\u0083@äPÙÌµ:hÇLÔþ\u001cÖ\u0081\u00adÈ\u0095jðzù\u0085\u00ad,"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var20[var28] = var55;
                                 if (var2 >= var5) {
                                    d = var6;
                                    i = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "²ºì\u0091\u0091\u0000@gÃ&\u0003ãV\u0085Æ ";
                                 var5 = "²ºì\u0091\u0091\u0000@gÃ&\u0003ãV\u0085Æ ".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u0013ã\u0002áª";
                  var12 = "\u0013ã\u0002áª".length();
                  var9 = 2;
                  var17 = -1;
            }

            var18 = 108;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





