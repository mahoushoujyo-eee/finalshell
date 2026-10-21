package com.finalshell.ui.dialog;

import com.finalshell.core.LD3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.FP3;
import com.finalshell.ui.listener.Us4;
import com.finalshell.ui.panel.ProxySelectionPanel;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class EditProxyServerDialog extends JDialog {
   public ProxySelectionPanel b;
   public LD3_2 g;
   public boolean r;
   public JPanel W;
   public JPanel P;
   public JTextField d;
   public JTextField t;
   public JTextField v;
   public JTextField N;
   public JPasswordField A;
   public Random E;
   public JComboBox Q;
   public static String[] a;
   public static String[] c;
   public static long[] e;
   public static Integer[] f;

   public EditProxyServerDialog(ProxySelectionPanel var1, LD3_2 var2, boolean var3) {
   super(SwingUtilities.getWindowAncestor(var1));
   Integer var131;
      label112: {
         Random var10001 = new Random();
         long var16 = 174948735561805446L;
         Random var15 = var10001;
         Ref.s(174948735561805446L, var15, var16);
         ProxySelectionPanel.t();
         long var18 = 415794868331118026L;
         Ref.s(415794868331118026L, var1, var18);
         long var20 = 461038843446045898L;
         Ref.s(461038843446045898L, var2, var20);
         if (this == null) {
            Registry.lookupField(523559207238648973L).setBoolean(this, var3);
            if (!var3) {
               this.setTitle(a(5684, -1730));
               if (this == null) {
                  break label112;
               }

               Ky4.K(new String[5]);
            }
         }

         StringBuilder var10004 = new StringBuilder().append(a(5676, -976));
         String var10006 = (String)(Registry.emptyArgs());
         long var22 = 286931176286176762L;
         Object var21 = var10006;
         var10006 = Ref.h(286931176286176762L, var21, var22);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var116) {
            throw var116.getTargetException();
         }

         var10004.setTitle(var2.append((String)var10006).toString());
      }

      JPanel var5 = (JPanel)this.getContentPane();
      var5.setLayout(new MigLayout(a(5667, -23010), "", a(5673, -32044)));
      JPanel var10005 = new JPanel();
      long var24 = 401336523224739031L;
      JPanel var23 = var10005;
      Ref.s(401336523224739031L, var23, var24);
      Object var25 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var25)).setLayout(new MigLayout(a(5650, -2698), a(5685, 22238), a(5670, 27620)));
      Object var27 = 401336523224739031L;
      this.add((JPanel)Ref.g(401336523224739031L, var27), a(5664, 19914));
      JPanel var6 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var29 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var29)).add(var6, a(5678, 22752));
      var6.add(new JLabel(a(5669, 19041)), a(5688, 28402));
      JTextField var10009 = new JTextField();
      long var32 = 390158584844885747L;
      JTextField var31 = var10009;
      Ref.s(390158584844885747L, var31, var32);
      Object var33 = 390158584844885747L;
      this.add((JTextField)Ref.g(390158584844885747L, var33), a(5682, 24111));
      JPanel var7 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var35 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var35)).add(var7, a(5665, -12803));
      var7.add(new JLabel(a(5687, -20638)), a(5690, 8543));
      JComboBox var10012 = new JComboBox();
      long var38 = 156771271142104101L;
      JComboBox var37 = var10012;
      Ref.s(156771271142104101L, var37, var38);
      Object var39 = 156771271142104101L;
      ((JComboBox)Ref.g(156771271142104101L, var39)).addItem(a(5677, 30950));
      Object var41 = 156771271142104101L;
      ((JComboBox)Ref.g(156771271142104101L, var41)).addItem(a(5691, -29664));
      Object var43 = 156771271142104101L;
      this.add((JComboBox)Ref.g(156771271142104101L, var43), a(5674, -16894));
      JPanel var8 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var45 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var45)).add(var8, a(5665, -12803));
      var8.add(new JLabel(a(5683, 21074)), a(5690, 8543));
      JTextField var10017 = new JTextField();
      long var48 = 279457316740415055L;
      JTextField var47 = var10017;
      Ref.s(279457316740415055L, var47, var48);
      Object var49 = 279457316740415055L;
      this.add((JTextField)Ref.g(279457316740415055L, var49), a(5674, -16894));
      JPanel var9 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var51 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var51)).add(var9, a(5665, -12803));
      var9.add(new JLabel(a(5675, 26573)), a(5690, 8543));
      JTextField var10020 = new JTextField();
      long var54 = 592995861040925927L;
      JTextField var53 = var10020;
      Ref.s(592995861040925927L, var53, var54);
      Object var55 = 592995861040925927L;
      this.add((JTextField)Ref.g(592995861040925927L, var55), a(5674, -16894));
      JPanel var10 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var57 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var57)).add(var10, a(5665, -12803));
      var10.add(new JLabel(a(5680, -13249)), a(5690, 8543));
      JTextField var10023 = new JTextField();
      long var60 = 321981137791138635L;
      JTextField var59 = var10023;
      Ref.s(321981137791138635L, var59, var60);
      Object var61 = 321981137791138635L;
      this.add((JTextField)Ref.g(321981137791138635L, var61), a(5674, -16894));
      JPanel var11 = new JPanel(new MigLayout(a(5692, 29308)));
      Object var63 = 401336523224739031L;
      ((JPanel)Ref.g(401336523224739031L, var63)).add(var11, a(5665, -12803));
      var11.add(new JLabel(a(5694, -11702)), a(5690, 8543));
      Registry.emptyArgs();
      long var65 = 305013025773761213L;
      Object var10027 = Ref.h2(305013025773761213L, var65);
      long var68 = 326791501671553256L;
      Object var67 = var10027;
      Ref.s(326791501671553256L, var67, var68);
      Object var69 = 326791501671553256L;
      this.add((JPasswordField)Ref.g(326791501671553256L, var69), a(5674, -16894));
      JPanel var10029 = new JPanel();
      long var72 = 617228258557024260L;
      JPanel var71 = var10029;
      Ref.s(617228258557024260L, var71, var72);
      Object var73 = 617228258557024260L;
      this.add((JPanel)Ref.g(617228258557024260L, var73), a(5668, -29081));
      Object var75 = 617228258557024260L;
      ((JPanel)Ref.g(617228258557024260L, var75)).setLayout(new MigLayout(a(5681, 11745)));
      JButton var12 = new JButton(a(5648, 6593));
      var12.setFocusable(false);
      Object var77 = 617228258557024260L;
      ((JPanel)Ref.g(617228258557024260L, var77)).add(var12);
      var12.addActionListener(new Us4(this));
      JButton var13 = new JButton(a(5651, -20712));
      var13.setFocusable(false);
      if (this == null) {
         Object var79 = 617228258557024260L;
         ((JPanel)Ref.g(617228258557024260L, var79)).add(var13);
         var13.addActionListener(new FP3(this));
         if (var3) {
            Object var81 = 390158584844885747L;
            JTextField var10034 = (JTextField)Ref.g(390158584844885747L, var81);
            String var10036 = (String)(Registry.emptyArgs());
            long var84 = 286931176286176762L;
            Object var83 = var10036;
            var10036 = Ref.h(286931176286176762L, var83, var84);

            try {
               var10036 = (String)var10036;
            } catch (InvocationTargetException var115) {
               throw var115.getTargetException();
            }

            var2.setText(var10036);
            var10036 = Registry.emptyArgs();
            long var86 = 562951426394330328L;
            Object var85 = var10036;
            var10036 = Ref.h(562951426394330328L, var85, var86);

            try {
               var10036 = (Integer)var10036;
            } catch (InvocationTargetException var114) {
               throw var114.getTargetException();
            }

            label97: {
               int var10037 = Registry.lookupField(319971801115033366L).getInt(null);
               if (this == null) {
                  if (var10036 == var10037) {
                     Object var87 = 156771271142104101L;
                     ((JComboBox)Ref.g(156771271142104101L, var87)).setSelectedItem(a(5666, -15977));
                     if (this == null) {
                        break label97;
                     }
                  }

                  var10036 = (String)(var2);
                  Object[] var124 = Registry.emptyArgs();
                  long var90 = 562951426394330328L;
                  Object[] var89 = var124;
                  Object var125 = Ref.h(562951426394330328L, var89, var90);

                  try {
                     var10037 = (Integer)var125;
                  } catch (InvocationTargetException var113) {
                     throw var113.getTargetException();
                  }

                  Registry.lookupField(392143205024518869L).getInt(null);
               }

               if (var10036 == var10037) {
                  Object var91 = 156771271142104101L;
                  ((JComboBox)Ref.g(156771271142104101L, var91)).setSelectedItem(a(5672, 19249));
               }
            }

            Object var93 = 279457316740415055L;
            JTextField var126 = (JTextField)Ref.g(279457316740415055L, var93);
            String var10039 = (String)(Registry.emptyArgs());
            long var96 = 531355023953548464L;
            Object var95 = var10039;
            var10039 = Ref.h(531355023953548464L, var95, var96);

            try {
               var10039 = (String)var10039;
            } catch (InvocationTargetException var112) {
               throw var112.getTargetException();
            }

            var2.setText(var10039);
            Object var97 = 592995861040925927L;
            JTextField var129 = (JTextField)Ref.g(592995861040925927L, var97);
            StringBuilder var10040 = new StringBuilder();
            Object var10042 = Registry.emptyArgs();
            long var100 = 511476850441845458L;
            Object var99 = var10042;
            var10042 = Ref.h(511476850441845458L, var99, var100);

            try {
               var131 = (Integer)var10042;
            } catch (InvocationTargetException var111) {
               throw var111.getTargetException();
            }

            var10040.setText(var2.append(var131).append("").toString());
            Object var101 = 321981137791138635L;
            JTextField var10041 = (JTextField)Ref.g(321981137791138635L, var101);
            String var10043 = (String)(Registry.emptyArgs());
            long var104 = 562777604625200665L;
            Object var103 = var10043;
            var10043 = Ref.h(562777604625200665L, var103, var104);

            try {
               var10043 = (String)var10043;
            } catch (InvocationTargetException var110) {
               throw var110.getTargetException();
            }

            var2.setText(var10043);
            Object var105 = 326791501671553256L;
            JPasswordField var134 = (JPasswordField)Ref.g(326791501671553256L, var105);
            String var10045 = (String)(Registry.emptyArgs());
            long var108 = 465224899237569377L;
            Object var107 = var10045;
            var10045 = Ref.h(465224899237569377L, var107, var108);

            try {
               var10045 = (String)var10045;
            } catch (InvocationTargetException var109) {
               throw var109.getTargetException();
            }

            var2.setText(var10045);
         }

         SwingUtilities.getWindowAncestor(var1);
      }

      this.setSize(a(21950, 7816302353238956560L), a(21982, 5792242019032275569L));
      this.pack();
      this.setLocationRelativeTo(this);
      this.setModal(true);
      this.setVisible(true);
   }

   public void b() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Edit.t ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: bipush 0
      // 004: istore 2
      // 005: astore 1
      // 006: aload 0
      // 007: ldc2_w 390158584844885747
      // 00a: astore 7
      // 00c: ldc2_w 390158584844885747
      // 00f: aload 7
      // 011: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 014: checkcast javax/swing/JTextField
      // 017: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 01a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 01d: ldc ""
      // 01f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 022: aload 1
      // 023: ifnonnull 072
      // 026: ifeq 056
      // 029: goto 030
      // 02c: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: sipush 5686
      // 034: sipush 32499
      // 037: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 03a: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 03d: aload 0
      // 03e: ldc2_w 390158584844885747
      // 041: astore 9
      // 043: ldc2_w 390158584844885747
      // 046: aload 9
      // 048: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04b: checkcast javax/swing/JTextField
      // 04e: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 051: return
      // 052: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 0
      // 057: ldc2_w 279457316740415055
      // 05a: astore 11
      // 05c: ldc2_w 279457316740415055
      // 05f: aload 11
      // 061: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 064: checkcast javax/swing/JTextField
      // 067: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 06a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 06d: ldc ""
      // 06f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 072: aload 1
      // 073: ifnonnull 0c2
      // 076: ifeq 0a6
      // 079: goto 080
      // 07c: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 0
      // 081: sipush 5689
      // 084: sipush -2877
      // 087: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 08a: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 08d: aload 0
      // 08e: ldc2_w 279457316740415055
      // 091: astore 13
      // 093: ldc2_w 279457316740415055
      // 096: aload 13
      // 098: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09b: checkcast javax/swing/JTextField
      // 09e: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 0a1: return
      // 0a2: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: ldc2_w 592995861040925927
      // 0aa: astore 15
      // 0ac: ldc2_w 592995861040925927
      // 0af: aload 15
      // 0b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b4: checkcast javax/swing/JTextField
      // 0b7: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0bd: ldc ""
      // 0bf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c2: aload 1
      // 0c3: ifnonnull 110
      // 0c6: ifeq 0f6
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: sipush 5695
      // 0d4: sipush 17949
      // 0d7: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 0da: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0dd: aload 0
      // 0de: ldc2_w 592995861040925927
      // 0e1: astore 17
      // 0e3: ldc2_w 592995861040925927
      // 0e6: aload 17
      // 0e8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0eb: checkcast javax/swing/JTextField
      // 0ee: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 0f1: return
      // 0f2: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: ldc2_w 592995861040925927
      // 0fa: astore 19
      // 0fc: ldc2_w 592995861040925927
      // 0ff: aload 19
      // 101: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 104: checkcast javax/swing/JTextField
      // 107: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 10a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 10d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 110: istore 2
      // 111: goto 136
      // 114: astore 3
      // 115: aload 0
      // 116: sipush 5679
      // 119: sipush 16036
      // 11c: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 11f: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 122: aload 0
      // 123: ldc2_w 592995861040925927
      // 126: astore 21
      // 128: ldc2_w 592995861040925927
      // 12b: aload 21
      // 12d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 130: checkcast javax/swing/JTextField
      // 133: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 136: aload 0
      // 137: aload 1
      // 138: ifnonnull 157
      // 13b: ldc2_w 523559207238648973
      // 13e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 141: swap
      // 142: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 145: ifeq 156
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: goto 16f
      // 152: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 0
      // 157: new com/finalshell/core/LD3_2
      // 15a: dup
      // 15b: invokespecial com/finalshell/core/LD3_2.<init> ()V
      // 15e: ldc2_w 461038843446045898
      // 161: astore 24
      // 163: astore 23
      // 165: ldc2_w 461038843446045898
      // 168: aload 23
      // 16a: aload 24
      // 16c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 16f: aload 0
      // 170: ldc2_w 461038843446045898
      // 173: astore 25
      // 175: ldc2_w 461038843446045898
      // 178: aload 25
      // 17a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17d: aload 0
      // 17e: ldc2_w 279457316740415055
      // 181: astore 27
      // 183: ldc2_w 279457316740415055
      // 186: aload 27
      // 188: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 18b: checkcast javax/swing/JTextField
      // 18e: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 191: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 194: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 197: ldc2_w 377666728424280826
      // 19a: astore 30
      // 19c: astore 29
      // 19e: ldc2_w 377666728424280826
      // 1a1: aload 29
      // 1a3: aload 30
      // 1a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a8: pop
      // 1a9: goto 1b0
      // 1ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: ldc2_w 461038843446045898
      // 1b4: astore 31
      // 1b6: ldc2_w 461038843446045898
      // 1b9: aload 31
      // 1bb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1be: aload 0
      // 1bf: ldc2_w 390158584844885747
      // 1c2: astore 33
      // 1c4: ldc2_w 390158584844885747
      // 1c7: aload 33
      // 1c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1cc: checkcast javax/swing/JTextField
      // 1cf: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 1d2: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d8: ldc2_w 193904661956891993
      // 1db: astore 36
      // 1dd: astore 35
      // 1df: ldc2_w 193904661956891993
      // 1e2: aload 35
      // 1e4: aload 36
      // 1e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e9: pop
      // 1ea: goto 1f1
      // 1ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: ldc2_w 461038843446045898
      // 1f5: astore 37
      // 1f7: ldc2_w 461038843446045898
      // 1fa: aload 37
      // 1fc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ff: new java/lang/String
      // 202: dup
      // 203: aload 0
      // 204: ldc2_w 326791501671553256
      // 207: astore 39
      // 209: ldc2_w 326791501671553256
      // 20c: aload 39
      // 20e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 211: checkcast javax/swing/JPasswordField
      // 214: invokevirtual javax/swing/JPasswordField.getPassword ()[C
      // 217: invokespecial java/lang/String.<init> ([C)V
      // 21a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 21d: ldc2_w 182129248968368124
      // 220: astore 42
      // 222: astore 41
      // 224: ldc2_w 182129248968368124
      // 227: aload 41
      // 229: aload 42
      // 22b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22e: pop
      // 22f: goto 236
      // 232: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 235: athrow
      // 236: aload 0
      // 237: ldc2_w 461038843446045898
      // 23a: astore 43
      // 23c: ldc2_w 461038843446045898
      // 23f: aload 43
      // 241: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 244: iload 2
      // 245: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 248: ldc2_w 272088854428135235
      // 24b: astore 46
      // 24d: astore 45
      // 24f: ldc2_w 272088854428135235
      // 252: aload 45
      // 254: aload 46
      // 256: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 259: pop
      // 25a: goto 261
      // 25d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 260: athrow
      // 261: aload 0
      // 262: ldc2_w 156771271142104101
      // 265: astore 47
      // 267: ldc2_w 156771271142104101
      // 26a: aload 47
      // 26c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 26f: checkcast javax/swing/JComboBox
      // 272: invokevirtual javax/swing/JComboBox.getSelectedItem ()Ljava/lang/Object;
      // 275: checkcast java/lang/String
      // 278: astore 3
      // 279: aload 3
      // 27a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 27d: astore 3
      // 27e: aload 3
      // 27f: sipush 5671
      // 282: sipush 27648
      // 285: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 288: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28b: aload 1
      // 28c: ifnonnull 2ec
      // 28f: ifeq 2d8
      // 292: goto 299
      // 295: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: aload 0
      // 29a: ldc2_w 461038843446045898
      // 29d: astore 49
      // 29f: ldc2_w 461038843446045898
      // 2a2: aload 49
      // 2a4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a7: ldc2_w 392143205024518869
      // 2aa: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2ad: aconst_null
      // 2ae: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2b1: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 2b4: ldc2_w 225283838617508237
      // 2b7: astore 52
      // 2b9: astore 51
      // 2bb: ldc2_w 225283838617508237
      // 2be: aload 51
      // 2c0: aload 52
      // 2c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c5: pop
      // 2c6: goto 2cd
      // 2c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: aload 1
      // 2ce: ifnull 32a
      // 2d1: goto 2d8
      // 2d4: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d7: athrow
      // 2d8: aload 3
      // 2d9: sipush 5693
      // 2dc: sipush -21233
      // 2df: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (II)Ljava/lang/String;
      // 2e2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: ifeq 32a
      // 2ef: aload 0
      // 2f0: ldc2_w 461038843446045898
      // 2f3: astore 53
      // 2f5: ldc2_w 461038843446045898
      // 2f8: aload 53
      // 2fa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2fd: ldc2_w 319971801115033366
      // 300: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 303: aconst_null
      // 304: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 307: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 30a: ldc2_w 225283838617508237
      // 30d: astore 56
      // 30f: astore 55
      // 311: ldc2_w 225283838617508237
      // 314: aload 55
      // 316: aload 56
      // 318: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 31b: pop
      // 31c: goto 323
      // 31f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 322: athrow
      // 323: goto 32a
      // 326: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 0
      // 32b: ldc2_w 461038843446045898
      // 32e: astore 57
      // 330: ldc2_w 461038843446045898
      // 333: aload 57
      // 335: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 338: aload 0
      // 339: ldc2_w 321981137791138635
      // 33c: astore 59
      // 33e: ldc2_w 321981137791138635
      // 341: aload 59
      // 343: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 346: checkcast javax/swing/JTextField
      // 349: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 34c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 34f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 352: ldc2_w 164722860361686941
      // 355: astore 62
      // 357: astore 61
      // 359: ldc2_w 164722860361686941
      // 35c: aload 61
      // 35e: aload 62
      // 360: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 363: pop
      // 364: goto 36b
      // 367: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36a: athrow
      // 36b: invokestatic java/lang/System.currentTimeMillis ()J
      // 36e: lstore 4
      // 370: aload 0
      // 371: aload 1
      // 372: ifnonnull 4f9
      // 375: ldc2_w 523559207238648973
      // 378: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 37b: swap
      // 37c: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 37f: ifne 421
      // 382: goto 389
      // 385: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38c: ldc2_w 270389152141252877
      // 38f: astore 63
      // 391: ldc2_w 270389152141252877
      // 394: aload 63
      // 396: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 399: goto 3a0
      // 39c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 39f: athrow
      // 3a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a3: ldc2_w 306266403902896148
      // 3a6: astore 66
      // 3a8: astore 65
      // 3aa: ldc2_w 306266403902896148
      // 3ad: aload 65
      // 3af: aload 66
      // 3b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b4: goto 3bb
      // 3b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ba: athrow
      // 3bb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3be: ldc2_w 401275417195122293
      // 3c1: astore 68
      // 3c3: astore 67
      // 3c5: ldc2_w 401275417195122293
      // 3c8: aload 67
      // 3ca: aload 68
      // 3cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3cf: checkcast java/util/ArrayList
      // 3d2: goto 3d9
      // 3d5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: aload 0
      // 3da: ldc2_w 461038843446045898
      // 3dd: astore 69
      // 3df: ldc2_w 461038843446045898
      // 3e2: aload 69
      // 3e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3e7: checkcast com/finalshell/core/LD3_2
      // 3ea: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3ed: pop
      // 3ee: aload 0
      // 3ef: ldc2_w 461038843446045898
      // 3f2: astore 71
      // 3f4: ldc2_w 461038843446045898
      // 3f7: aload 71
      // 3f9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3fc: lload 4
      // 3fe: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 401: ldc2_w 632174181210947576
      // 404: astore 74
      // 406: astore 73
      // 408: ldc2_w 632174181210947576
      // 40b: aload 73
      // 40d: aload 74
      // 40f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 412: pop
      // 413: goto 41a
      // 416: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 419: athrow
      // 41a: goto 421
      // 41d: invokestatic com/finalshell/ui/dialog/EditProxyServerDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: aload 0
      // 422: ldc2_w 461038843446045898
      // 425: astore 75
      // 427: ldc2_w 461038843446045898
      // 42a: aload 75
      // 42c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 42f: lload 4
      // 431: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 434: ldc2_w 448034136929726083
      // 437: astore 78
      // 439: astore 77
      // 43b: ldc2_w 448034136929726083
      // 43e: aload 77
      // 440: aload 78
      // 442: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 445: pop
      // 446: goto 44d
      // 449: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44c: athrow
      // 44d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 450: ldc2_w 270389152141252877
      // 453: astore 79
      // 455: ldc2_w 270389152141252877
      // 458: aload 79
      // 45a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 45d: goto 464
      // 460: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 463: athrow
      // 464: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 467: ldc2_w 612604310671515822
      // 46a: astore 82
      // 46c: astore 81
      // 46e: ldc2_w 612604310671515822
      // 471: aload 81
      // 473: aload 82
      // 475: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 478: goto 47f
      // 47b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47e: athrow
      // 47f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 482: ldc2_w 200561288808923907
      // 485: astore 84
      // 487: astore 83
      // 489: ldc2_w 200561288808923907
      // 48c: aload 83
      // 48e: aload 84
      // 490: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 493: pop
      // 494: goto 49b
      // 497: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49a: athrow
      // 49b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 49e: ldc2_w 270389152141252877
      // 4a1: astore 85
      // 4a3: ldc2_w 270389152141252877
      // 4a6: aload 85
      // 4a8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4ab: goto 4b2
      // 4ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4b1: athrow
      // 4b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4b5: ldc2_w 578864097947885485
      // 4b8: astore 88
      // 4ba: astore 87
      // 4bc: ldc2_w 578864097947885485
      // 4bf: aload 87
      // 4c1: aload 88
      // 4c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c6: pop
      // 4c7: goto 4ce
      // 4ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4cd: athrow
      // 4ce: aload 0
      // 4cf: ldc2_w 415794868331118026
      // 4d2: astore 89
      // 4d4: ldc2_w 415794868331118026
      // 4d7: aload 89
      // 4d9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4df: ldc2_w 233983325047014865
      // 4e2: astore 92
      // 4e4: astore 91
      // 4e6: ldc2_w 233983325047014865
      // 4e9: aload 91
      // 4eb: aload 92
      // 4ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f0: pop
      // 4f1: goto 4f8
      // 4f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f7: athrow
      // 4f8: aload 0
      // 4f9: ldc2_w 415794868331118026
      // 4fc: astore 93
      // 4fe: ldc2_w 415794868331118026
      // 501: aload 93
      // 503: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 506: aload 0
      // 507: ldc2_w 461038843446045898
      // 50a: astore 95
      // 50c: ldc2_w 461038843446045898
      // 50f: aload 95
      // 511: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 514: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 517: ldc2_w 194080076253066315
      // 51a: astore 98
      // 51c: astore 97
      // 51e: ldc2_w 194080076253066315
      // 521: aload 97
      // 523: aload 98
      // 525: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 528: goto 52f
      // 52b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 52e: athrow
      // 52f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 532: ldc2_w 337170684095864907
      // 535: astore 100
      // 537: astore 99
      // 539: ldc2_w 337170684095864907
      // 53c: aload 99
      // 53e: aload 100
      // 540: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 543: pop
      // 544: goto 54b
      // 547: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 54a: athrow
      // 54b: new com/finalshell/core/Ty4
      // 54e: dup
      // 54f: ldc2_w 164254360187462884
      // 552: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 555: aconst_null
      // 556: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 559: invokespecial com/finalshell/core/Ty4.<init> (I)V
      // 55c: astore 6
      // 55e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 561: ldc2_w 270389152141252877
      // 564: astore 101
      // 566: ldc2_w 270389152141252877
      // 569: aload 101
      // 56b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 56e: goto 575
      // 571: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 574: athrow
      // 575: aload 6
      // 577: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 57a: ldc2_w 473928376202613579
      // 57d: astore 104
      // 57f: astore 103
      // 581: ldc2_w 473928376202613579
      // 584: aload 103
      // 586: aload 104
      // 588: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 58b: pop
      // 58c: goto 593
      // 58f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 592: athrow
      // 593: aload 0
      // 594: bipush 0
      // 595: invokevirtual com/finalshell/ui/dialog/EditProxyServerDialog.setVisible (Z)V
      // 598: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 5682) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 98;
               break;
            case 1:
               var10000 = 25;
               break;
            case 2:
               var10000 = 53;
               break;
            case 3:
               var10000 = 45;
               break;
            case 4:
               var10000 = 92;
               break;
            case 5:
               var10000 = 18;
               break;
            case 6:
               var10000 = 31;
               break;
            case 7:
               var10000 = 230;
               break;
            case 8:
               var10000 = 208;
               break;
            case 9:
               var10000 = 198;
               break;
            case 10:
               var10000 = 4;
               break;
            case 11:
               var10000 = 95;
               break;
            case 12:
               var10000 = 238;
               break;
            case 13:
               var10000 = 242;
               break;
            case 14:
               var10000 = 237;
               break;
            case 15:
               var10000 = 193;
               break;
            case 16:
               var10000 = 13;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 173;
               break;
            case 19:
               var10000 = 140;
               break;
            case 20:
               var10000 = 1;
               break;
            case 21:
               var10000 = 206;
               break;
            case 22:
               var10000 = 184;
               break;
            case 23:
               var10000 = 160;
               break;
            case 24:
               var10000 = 252;
               break;
            case 25:
               var10000 = 110;
               break;
            case 26:
               var10000 = 149;
               break;
            case 27:
               var10000 = 105;
               break;
            case 28:
               var10000 = 21;
               break;
            case 29:
               var10000 = 207;
               break;
            case 30:
               var10000 = 190;
               break;
            case 31:
               var10000 = 154;
               break;
            case 32:
               var10000 = 255;
               break;
            case 33:
               var10000 = 155;
               break;
            case 34:
               var10000 = 76;
               break;
            case 35:
               var10000 = 35;
               break;
            case 36:
               var10000 = 249;
               break;
            case 37:
               var10000 = 187;
               break;
            case 38:
               var10000 = 212;
               break;
            case 39:
               var10000 = 205;
               break;
            case 40:
               var10000 = 133;
               break;
            case 41:
               var10000 = 191;
               break;
            case 42:
               var10000 = 55;
               break;
            case 43:
               var10000 = 33;
               break;
            case 44:
               var10000 = 233;
               break;
            case 45:
               var10000 = 222;
               break;
            case 46:
               var10000 = 156;
               break;
            case 47:
               var10000 = 112;
               break;
            case 48:
               var10000 = 15;
               break;
            case 49:
               var10000 = 66;
               break;
            case 50:
               var10000 = 79;
               break;
            case 51:
               var10000 = 241;
               break;
            case 52:
               var10000 = 215;
               break;
            case 53:
               var10000 = 214;
               break;
            case 54:
               var10000 = 22;
               break;
            case 55:
               var10000 = 84;
               break;
            case 56:
               var10000 = 132;
               break;
            case 57:
               var10000 = 97;
               break;
            case 58:
               var10000 = 82;
               break;
            case 59:
               var10000 = 8;
               break;
            case 60:
               var10000 = 48;
               break;
            case 61:
               var10000 = 180;
               break;
            case 62:
               var10000 = 86;
               break;
            case 63:
               var10000 = 147;
               break;
            case 64:
               var10000 = 90;
               break;
            case 65:
               var10000 = 75;
               break;
            case 66:
               var10000 = 77;
               break;
            case 67:
               var10000 = 178;
               break;
            case 68:
               var10000 = 130;
               break;
            case 69:
               var10000 = 236;
               break;
            case 70:
               var10000 = 119;
               break;
            case 71:
               var10000 = 250;
               break;
            case 72:
               var10000 = 226;
               break;
            case 73:
               var10000 = 183;
               break;
            case 74:
               var10000 = 23;
               break;
            case 75:
               var10000 = 50;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 228;
               break;
            case 78:
               var10000 = 32;
               break;
            case 79:
               var10000 = 194;
               break;
            case 80:
               var10000 = 39;
               break;
            case 81:
               var10000 = 168;
               break;
            case 82:
               var10000 = 175;
               break;
            case 83:
               var10000 = 200;
               break;
            case 84:
               var10000 = 231;
               break;
            case 85:
               var10000 = 104;
               break;
            case 86:
               var10000 = 247;
               break;
            case 87:
               var10000 = 56;
               break;
            case 88:
               var10000 = 72;
               break;
            case 89:
               var10000 = 244;
               break;
            case 90:
               var10000 = 118;
               break;
            case 91:
               var10000 = 36;
               break;
            case 92:
               var10000 = 80;
               break;
            case 93:
               var10000 = 145;
               break;
            case 94:
               var10000 = 9;
               break;
            case 95:
               var10000 = 68;
               break;
            case 96:
               var10000 = 225;
               break;
            case 97:
               var10000 = 176;
               break;
            case 98:
               var10000 = 172;
               break;
            case 99:
               var10000 = 71;
               break;
            case 100:
               var10000 = 189;
               break;
            case 101:
               var10000 = 100;
               break;
            case 102:
               var10000 = 69;
               break;
            case 103:
               var10000 = 38;
               break;
            case 104:
               var10000 = 218;
               break;
            case 105:
               var10000 = 111;
               break;
            case 106:
               var10000 = 5;
               break;
            case 107:
               var10000 = 182;
               break;
            case 108:
               var10000 = 51;
               break;
            case 109:
               var10000 = 152;
               break;
            case 110:
               var10000 = 63;
               break;
            case 111:
               var10000 = 131;
               break;
            case 112:
               var10000 = 177;
               break;
            case 113:
               var10000 = 209;
               break;
            case 114:
               var10000 = 41;
               break;
            case 115:
               var10000 = 254;
               break;
            case 116:
               var10000 = 219;
               break;
            case 117:
               var10000 = 60;
               break;
            case 118:
               var10000 = 93;
               break;
            case 119:
               var10000 = 224;
               break;
            case 120:
               var10000 = 165;
               break;
            case 121:
               var10000 = 239;
               break;
            case 122:
               var10000 = 143;
               break;
            case 123:
               var10000 = 106;
               break;
            case 124:
               var10000 = 204;
               break;
            case 125:
               var10000 = 136;
               break;
            case 126:
               var10000 = 6;
               break;
            case 127:
               var10000 = 246;
               break;
            case 128:
               var10000 = 142;
               break;
            case 129:
               var10000 = 134;
               break;
            case 130:
               var10000 = 78;
               break;
            case 131:
               var10000 = 216;
               break;
            case 132:
               var10000 = 11;
               break;
            case 133:
               var10000 = 196;
               break;
            case 134:
               var10000 = 197;
               break;
            case 135:
               var10000 = 7;
               break;
            case 136:
               var10000 = 34;
               break;
            case 137:
               var10000 = 28;
               break;
            case 138:
               var10000 = 167;
               break;
            case 139:
               var10000 = 186;
               break;
            case 140:
               var10000 = 251;
               break;
            case 141:
               var10000 = 2;
               break;
            case 142:
               var10000 = 54;
               break;
            case 143:
               var10000 = 158;
               break;
            case 144:
               var10000 = 83;
               break;
            case 145:
               var10000 = 192;
               break;
            case 146:
               var10000 = 245;
               break;
            case 147:
               var10000 = 188;
               break;
            case 148:
               var10000 = 19;
               break;
            case 149:
               var10000 = 114;
               break;
            case 150:
               var10000 = 99;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 44;
               break;
            case 153:
               var10000 = 123;
               break;
            case 154:
               var10000 = 57;
               break;
            case 155:
               var10000 = 0;
               break;
            case 156:
               var10000 = 217;
               break;
            case 157:
               var10000 = 40;
               break;
            case 158:
               var10000 = 202;
               break;
            case 159:
               var10000 = 166;
               break;
            case 160:
               var10000 = 124;
               break;
            case 161:
               var10000 = 229;
               break;
            case 162:
               var10000 = 16;
               break;
            case 163:
               var10000 = 89;
               break;
            case 164:
               var10000 = 171;
               break;
            case 165:
               var10000 = 144;
               break;
            case 166:
               var10000 = 121;
               break;
            case 167:
               var10000 = 103;
               break;
            case 168:
               var10000 = 58;
               break;
            case 169:
               var10000 = 10;
               break;
            case 170:
               var10000 = 150;
               break;
            case 171:
               var10000 = 47;
               break;
            case 172:
               var10000 = 73;
               break;
            case 173:
               var10000 = 46;
               break;
            case 174:
               var10000 = 235;
               break;
            case 175:
               var10000 = 201;
               break;
            case 176:
               var10000 = 122;
               break;
            case 177:
               var10000 = 161;
               break;
            case 178:
               var10000 = 43;
               break;
            case 179:
               var10000 = 141;
               break;
            case 180:
               var10000 = 179;
               break;
            case 181:
               var10000 = 102;
               break;
            case 182:
               var10000 = 146;
               break;
            case 183:
               var10000 = 107;
               break;
            case 184:
               var10000 = 221;
               break;
            case 185:
               var10000 = 162;
               break;
            case 186:
               var10000 = 117;
               break;
            case 187:
               var10000 = 88;
               break;
            case 188:
               var10000 = 248;
               break;
            case 189:
               var10000 = 67;
               break;
            case 190:
               var10000 = 52;
               break;
            case 191:
               var10000 = 164;
               break;
            case 192:
               var10000 = 227;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 120;
               break;
            case 195:
               var10000 = 115;
               break;
            case 196:
               var10000 = 169;
               break;
            case 197:
               var10000 = 64;
               break;
            case 198:
               var10000 = 240;
               break;
            case 199:
               var10000 = 42;
               break;
            case 200:
               var10000 = 128;
               break;
            case 201:
               var10000 = 26;
               break;
            case 202:
               var10000 = 62;
               break;
            case 203:
               var10000 = 137;
               break;
            case 204:
               var10000 = 37;
               break;
            case 205:
               var10000 = 211;
               break;
            case 206:
               var10000 = 17;
               break;
            case 207:
               var10000 = 61;
               break;
            case 208:
               var10000 = 20;
               break;
            case 209:
               var10000 = 129;
               break;
            case 210:
               var10000 = 12;
               break;
            case 211:
               var10000 = 14;
               break;
            case 212:
               var10000 = 91;
               break;
            case 213:
               var10000 = 3;
               break;
            case 214:
               var10000 = 81;
               break;
            case 215:
               var10000 = 253;
               break;
            case 216:
               var10000 = 220;
               break;
            case 217:
               var10000 = 170;
               break;
            case 218:
               var10000 = 151;
               break;
            case 219:
               var10000 = 163;
               break;
            case 220:
               var10000 = 199;
               break;
            case 221:
               var10000 = 87;
               break;
            case 222:
               var10000 = 138;
               break;
            case 223:
               var10000 = 181;
               break;
            case 224:
               var10000 = 174;
               break;
            case 225:
               var10000 = 223;
               break;
            case 226:
               var10000 = 24;
               break;
            case 227:
               var10000 = 185;
               break;
            case 228:
               var10000 = 116;
               break;
            case 229:
               var10000 = 70;
               break;
            case 230:
               var10000 = 27;
               break;
            case 231:
               var10000 = 113;
               break;
            case 232:
               var10000 = 127;
               break;
            case 233:
               var10000 = 243;
               break;
            case 234:
               var10000 = 139;
               break;
            case 235:
               var10000 = 30;
               break;
            case 236:
               var10000 = 85;
               break;
            case 237:
               var10000 = 109;
               break;
            case 238:
               var10000 = 195;
               break;
            case 239:
               var10000 = 49;
               break;
            case 240:
               var10000 = 153;
               break;
            case 241:
               var10000 = 148;
               break;
            case 242:
               var10000 = 59;
               break;
            case 243:
               var10000 = 101;
               break;
            case 244:
               var10000 = 203;
               break;
            case 245:
               var10000 = 74;
               break;
            case 246:
               var10000 = 96;
               break;
            case 247:
               var10000 = 135;
               break;
            case 248:
               var10000 = 126;
               break;
            case 249:
               var10000 = 125;
               break;
            case 250:
               var10000 = 94;
               break;
            case 251:
               var10000 = 157;
               break;
            case 252:
               var10000 = 232;
               break;
            case 253:
               var10000 = 213;
               break;
            case 254:
               var10000 = 65;
               break;
            default:
               var10000 = 210;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20399;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[35];
      int var11 = 0;
      String var10 = "\u008cE\t\u001cPÙ\u0089/¶Ä^\u0003亍枊²\u0004痪找吘 \u001dÈ\u0085Kòñd8£É\u0017¹\u0014£iqö|å;ù\u009f»\u0013¹7\u008b=\u0081Z\u0006课輁凖呈礒\u0004\u0003籤埥Ç\u0007斅希亐璦東刳嘶\u0005\u001dåÆ\u0095B\nÿ!g\u0090\u009dH0\u001a\u0081\u008f\u0004åKÌc\nÔp\u0002º1\r¥²3\u009a\b讀輱儙乸朡埣埅i\u0003寈碑X\u0006试连决穑厭\u0099\u000eyb}\u000e7ûàPÒiÚÚß\u0081\u0004Ô,î\u008b\u0004Ìàé\u0016\u000e\u0015lðÏ\u0086ÃÖW\u0014\u0089\u0002ÆÄ\u0002\u0011ÅU9e,\u0095\u0002óQÿåõ\u0089CèZ4\u0004¼ï\n5\u0011-¢Â}\u0080-a\u008eä\u00191Ð\u000bïa\u009a`\u0006\u008f\u0001êMÐ\u001a\n!\u001d¥l¿¸+ÎWð\u0003吾秮4\u000b\u001dI;\u009d\u0016éA)¯\u0004}\u0003稱厑k\u0006¿Cè\u0001\u0094·\u0011\u0011¯GÜr\u001b?\n-\u0089JÀd¯\u008e\u0092ß\u0004ÎED`\t讹轱儾攻宨究厗匩\u0086\n缃轶串瓯朥刚嚼ô\u0015ÿ\u0006\u001d\u0095¼Û\u001eì\u0011U×ø¸\u0087-ö\u008b\u0002#\u0081\u0081\u0087íö\u0097¯";
      int var12 = "\u008cE\t\u001cPÙ\u0089/¶Ä^\u0003亍枊²\u0004痪找吘 \u001dÈ\u0085Kòñd8£É\u0017¹\u0014£iqö|å;ù\u009f»\u0013¹7\u008b=\u0081Z\u0006课輁凖呈礒\u0004\u0003籤埥Ç\u0007斅希亐璦東刳嘶\u0005\u001dåÆ\u0095B\nÿ!g\u0090\u009dH0\u001a\u0081\u008f\u0004åKÌc\nÔp\u0002º1\r¥²3\u009a\b讀輱儙乸朡埣埅i\u0003寈碑X\u0006试连决穑厭\u0099\u000eyb}\u000e7ûàPÒiÚÚß\u0081\u0004Ô,î\u008b\u0004Ìàé\u0016\u000e\u0015lðÏ\u0086ÃÖW\u0014\u0089\u0002ÆÄ\u0002\u0011ÅU9e,\u0095\u0002óQÿåõ\u0089CèZ4\u0004¼ï\n5\u0011-¢Â}\u0080-a\u008eä\u00191Ð\u000bïa\u009a`\u0006\u008f\u0001êMÐ\u001a\n!\u001d¥l¿¸+ÎWð\u0003吾秮4\u000b\u001dI;\u009d\u0016éA)¯\u0004}\u0003稱厑k\u0006¿Cè\u0001\u0094·\u0011\u0011¯GÜr\u001b?\n-\u0089JÀd¯\u008e\u0092ß\u0004ÎED`\t讹轱儾攻宨究厗匩\u0086\n缃轶串瓯朥刚嚼ô\u0015ÿ\u0006\u001d\u0095¼Û\u001eì\u0011U×ø¸\u0087-ö\u008b\u0002#\u0081\u0081\u0087íö\u0097¯"
         .length();
      char var9 = 11;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 69;
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
                        var58 = 71;
                        break;
                     case 1:
                        var58 = 65;
                        break;
                     case 2:
                        var58 = 96;
                        break;
                     case 3:
                        var58 = 65;
                        break;
                     case 4:
                        var58 = 16;
                        break;
                     case 5:
                        var58 = 69;
                        break;
                     default:
                        var58 = 51;
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
                     c = new String[35];
                     long var0 = 1988308315226514633L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u001e-(Ê¬\u008a¿\u0094wç\u008f\u00964Ó¿I";
                     int var5 = "\u001e-(Ê¬\u008a¿\u0094wç\u008f\u00964Ó¿I".length();
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

                     e = var6;
                     f = new Integer[2];
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

                  var10 = "卷浖\u0002碝嬷";
                  var12 = "卷浖\u0002碝嬷".length();
                  var9 = 2;
                  var16 = -1;
            }

            var10000 = 19;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





