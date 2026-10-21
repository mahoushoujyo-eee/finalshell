package com.finalshell.ui.dialog;

import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.B1;
import com.finalshell.ui.listener.Op4;
import com.finalshell.ui.listener.QK;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.TunnelList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class EditTunnelDialog extends JDialog {
   public TunnelList Y;
   public YE J;
   public YE E;
   public boolean K;
   public JPanel x;
   public JPanel A;
   public JTextField L;
   public JTextField O;
   public JTextField s;
   public JTextField T;
   public JTextField n;
   public Random F;
   public JComboBox p;
   public ArrayList P;
   public JLabel v;
   public JLabel I;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public EditTunnelDialog(TunnelList var1, YE var2, ArrayList var3, boolean var4) {
   super(SwingUtilities.getWindowAncestor(var1));
   Integer var154;
   Integer var159;
   Object[] var30;
      label127: {
         TunnelList.V();
         Random var10002 = new Random();
         long var17 = 208060216150987566L;
         Random var16 = var10002;
         Ref.s(208060216150987566L, var16, var17);
         JLabel var137 = new JLabel(a(-4326, 29475));
         long var19 = 329278972422819942L;
         JLabel var18 = var137;
         Ref.s(329278972422819942L, var18, var19);
         JLabel var10003 = new JLabel(a(-4290, -23345));
         long var21 = 492841651621062230L;
         JLabel var20 = var10003;
         Ref.s(492841651621062230L, var20, var21);
         long var23 = 174133863343276975L;
         Ref.s(174133863343276975L, var3, var23);
         long var25 = 301599412610048278L;
         Ref.s(301599412610048278L, var1, var25);
         long var27 = 335167237343284276L;
         Ref.s(335167237343284276L, var2, var27);
         YE var10007 = new YE();
         long var29 = 236594814748383325L;
         YE var28 = var10007;
         Ref.s(236594814748383325L, var28, var29);
         if (this != null) {
            Registry.lookupField(545517466406007910L).setBoolean(this, var4);
            if (!var4) {
               this.setTitle(a(-4348, 390));
               if (this != null) {
                  break label127;
               }

               Ky4.K(new String[3]);
            }
         }

         StringBuilder var10008 = new StringBuilder().append(a(-4347, 14476));
         String var10010 = (String)(Registry.emptyArgs());
         long var31 = 474678417197598864L;
         var30 = var10010;
         var10010 = Ref.h(474678417197598864L, var30, var31);

         try {
            var10010 = (String)var10010;
         } catch (InvocationTargetException var136) {
            throw var136.getTargetException();
         }

         var10008.setTitle(var2.append((String)var10010).toString());
      }

      JPanel var6 = (JPanel)this.getContentPane();
      var6.setLayout(new MigLayout(a(-4350, 7841), "", a(-4335, -3756)));
      JPanel var10009 = new JPanel();
      long var33 = 625211350622638680L;
      JPanel var32 = var10009;
      Ref.s(625211350622638680L, var32, var33);
      Object var34 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var34)).setLayout(new MigLayout(a(-4289, 2175), a(-4325, -29691), a(-4332, 8003)));
      Object var36 = 625211350622638680L;
      this.add((JPanel)Ref.g(625211350622638680L, var36), a(-4340, -24659));
      JPanel var7 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var38 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var38)).add(var7, a(-4342, 10427));
      var7.add(new JLabel(a(-4295, -18106)), a(-4338, 26462));
      JTextField var10013 = new JTextField();
      long var41 = 414608544041084281L;
      JTextField var40 = var10013;
      Ref.s(414608544041084281L, var40, var41);
      Object var42 = 414608544041084281L;
      this.add((JTextField)Ref.g(414608544041084281L, var42), a(-4343, 2756));
      JPanel var8 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var44 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var44)).add(var8, a(-4336, -26830));
      var8.add(new JLabel(a(-4345, 21817)), a(-4294, 20312));
      JComboBox var10016 = new JComboBox();
      long var47 = 319966052179776705L;
      JComboBox var46 = var10016;
      Ref.s(319966052179776705L, var46, var47);
      Object var48 = 319966052179776705L;
      ((JComboBox)Ref.g(319966052179776705L, var48)).addItem(a(-4303, 17649));
      Object var50 = 319966052179776705L;
      ((JComboBox)Ref.g(319966052179776705L, var50)).addItem(a(-4321, -11883));
      Object var52 = 319966052179776705L;
      ((JComboBox)Ref.g(319966052179776705L, var52)).addItem(a(-4328, 32327));
      Object var54 = 319966052179776705L;
      this.add((JComboBox)Ref.g(319966052179776705L, var54), a(-4324, -8932));
      Object var56 = 319966052179776705L;
      ((JComboBox)Ref.g(319966052179776705L, var56)).addItemListener(new QK(this));
      JPanel var9 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var58 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var58)).add(var9, a(-4336, -26830));
      var9.add(new JLabel(a(-4330, 4810)), a(-4294, 20312));
      JTextField var10023 = new JTextField();
      long var61 = 310253859679637216L;
      JTextField var60 = var10023;
      Ref.s(310253859679637216L, var60, var61);
      Object var62 = 310253859679637216L;
      this.add((JTextField)Ref.g(310253859679637216L, var62), a(-4324, -8932));
      JPanel var10 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var64 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var64)).add(var10, a(-4336, -26830));
      var10.add(new JLabel(a(-4341, 21411)), a(-4294, 20312));
      JTextField var10026 = new JTextField(a(-4334, 2826));
      long var67 = 557254593771208646L;
      JTextField var66 = var10026;
      Ref.s(557254593771208646L, var66, var67);
      Object var68 = 557254593771208646L;
      this.add((JTextField)Ref.g(557254593771208646L, var68), a(-4324, -8932));
      JPanel var11 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var70 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var70)).add(var11, a(-4336, -26830));
      Object var72 = 329278972422819942L;
      this.add((JLabel)Ref.g(329278972422819942L, var72), a(-4294, 20312));
      JTextField var10030 = new JTextField(a(-4322, 9270));
      long var75 = 252123593957137435L;
      JTextField var74 = var10030;
      Ref.s(252123593957137435L, var74, var75);
      Object var76 = 252123593957137435L;
      this.add((JTextField)Ref.g(252123593957137435L, var76), a(-4324, -8932));
      JPanel var12 = new JPanel(new MigLayout(a(-4352, 12814)));
      Object var78 = 625211350622638680L;
      ((JPanel)Ref.g(625211350622638680L, var78)).add(var12, a(-4336, -26830));
      Object var80 = 492841651621062230L;
      this.add((JLabel)Ref.g(492841651621062230L, var80), a(-4294, 20312));
      JTextField var10034 = new JTextField();
      long var83 = 332149350821937177L;
      JTextField var82 = var10034;
      Ref.s(332149350821937177L, var82, var83);
      Object var84 = 332149350821937177L;
      this.add((JTextField)Ref.g(332149350821937177L, var84), a(-4324, -8932));
      JPanel var10036 = new JPanel();
      long var87 = 215666905968093925L;
      JPanel var86 = var10036;
      Ref.s(215666905968093925L, var86, var87);
      Object var88 = 215666905968093925L;
      this.add((JPanel)Ref.g(215666905968093925L, var88), a(-4344, 7629));
      Object var90 = 215666905968093925L;
      ((JPanel)Ref.g(215666905968093925L, var90)).setLayout(new MigLayout(a(-4333, -26521)));
      JButton var13 = new JButton(a(-4292, -395));
      var13.setFocusable(false);
      Object var92 = 215666905968093925L;
      ((JPanel)Ref.g(215666905968093925L, var92)).add(var13);
      var13.addActionListener(new Op4(this));
      JButton var14 = new JButton(a(-4331, 4180));
      var14.setFocusable(false);
      if (this != null) {
         Object var94 = 215666905968093925L;
         ((JPanel)Ref.g(215666905968093925L, var94)).add(var14);
         var14.addActionListener(new B1(this));
         if (var4) {
            Object var96 = 414608544041084281L;
            JTextField var10041 = (JTextField)Ref.g(414608544041084281L, var96);
            String var10043 = (String)(Registry.emptyArgs());
            long var99 = 474678417197598864L;
            Object var98 = var10043;
            var10043 = Ref.h(474678417197598864L, var98, var99);

            try {
               var10043 = (String)var10043;
            } catch (InvocationTargetException var135) {
               throw var135.getTargetException();
            }

            var2.setText(var10043);
            var10043 = Registry.emptyArgs();
            long var101 = 471582560640574154L;
            Object var100 = var10043;
            var10043 = Ref.h(471582560640574154L, var100, var101);

            try {
               var10043 = (Integer)var10043;
            } catch (InvocationTargetException var134) {
               throw var134.getTargetException();
            }

            label129: {
               int var10044 = Registry.lookupField(343042688357189616L).getInt(null);
               if (this != null) {
                  if (var10043 == var10044) {
                     Object var102 = 319966052179776705L;
                     ((JComboBox)Ref.g(319966052179776705L, var102)).setSelectedItem(a(-4321, -11883));
                     if (this != null) {
                        break label129;
                     }
                  }

                  var10043 = var2;
                  Object[] var145 = Registry.emptyArgs();
                  long var105 = 471582560640574154L;
                  Object[] var104 = var145;
                  Object var146 = Ref.h(471582560640574154L, var104, var105);

                  try {
                     var10044 = (Integer)var146;
                  } catch (InvocationTargetException var133) {
                     throw var133.getTargetException();
                  }

                  Registry.lookupField(314583299194608155L).getInt(null);
               }

               if (this != null) {
                  if (var10043 == var10044) {
                     Object var106 = 319966052179776705L;
                     ((JComboBox)Ref.g(319966052179776705L, var106)).setSelectedItem(a(-4303, 17649));
                     if (this != null) {
                        break label129;
                     }
                  }

                  var10043 = var2;
                  Object[] var147 = Registry.emptyArgs();
                  long var109 = 471582560640574154L;
                  Object[] var108 = var147;
                  Object var148 = Ref.h(471582560640574154L, var108, var109);

                  try {
                     var10044 = (Integer)var148;
                  } catch (InvocationTargetException var132) {
                     throw var132.getTargetException();
                  }

                  Registry.lookupField(297191265528158022L).getInt(null);
               }

               if (var10043 == var10044) {
                  Object var110 = 319966052179776705L;
                  ((JComboBox)Ref.g(319966052179776705L, var110)).setSelectedItem(a(-4327, 18725));
               }
            }

            Object var112 = 557254593771208646L;
            JTextField var149 = (JTextField)Ref.g(557254593771208646L, var112);
            String var10046 = (String)(Registry.emptyArgs());
            long var115 = 406140209836756951L;
            Object var114 = var10046;
            var10046 = Ref.h(406140209836756951L, var114, var115);

            try {
               var10046 = (String)var10046;
            } catch (InvocationTargetException var131) {
               throw var131.getTargetException();
            }

            var2.setText(var10046);
            Object var116 = 310253859679637216L;
            JTextField var152 = (JTextField)Ref.g(310253859679637216L, var116);
            StringBuilder var10047 = new StringBuilder();
            Object var10049 = Registry.emptyArgs();
            long var119 = 437259655987883724L;
            Object var118 = var10049;
            var10049 = Ref.h(437259655987883724L, var118, var119);

            try {
               var154 = (Integer)var10049;
            } catch (InvocationTargetException var130) {
               throw var130.getTargetException();
            }

            var10047.setText(var2.append(var154).append("").toString());
            Object var120 = 252123593957137435L;
            JTextField var10048 = (JTextField)Ref.g(252123593957137435L, var120);
            String var10050 = (String)(Registry.emptyArgs());
            long var123 = 531077488409752038L;
            Object var122 = var10050;
            var10050 = Ref.h(531077488409752038L, var122, var123);

            try {
               var10050 = (String)var10050;
            } catch (InvocationTargetException var129) {
               throw var129.getTargetException();
            }

            var2.setText(var10050);
            Object var124 = 332149350821937177L;
            JTextField var157 = (JTextField)Ref.g(332149350821937177L, var124);
            StringBuilder var10051 = new StringBuilder();
            Object var10053 = Registry.emptyArgs();
            long var127 = 595134275840130239L;
            Object var126 = var10053;
            var10053 = Ref.h(595134275840130239L, var126, var127);

            try {
               var159 = (Integer)var10053;
            } catch (InvocationTargetException var128) {
               throw var128.getTargetException();
            }

            var10051.setText(var2.append(var159).append("").toString());
         }

         SwingUtilities.getWindowAncestor(var1);
      }

      this.setSize(a(6109, 1625767630155087386L), a(22539, 3264626618149450189L));
      this.pack();
      this.setLocationRelativeTo(this);
      this.setModal(true);
      this.setVisible(true);
   }

   public void v() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 319966052179776705
      // 004: astore 8
      // 006: ldc2_w 319966052179776705
      // 009: aload 8
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: checkcast javax/swing/JComboBox
      // 011: invokevirtual javax/swing/JComboBox.getSelectedItem ()Ljava/lang/Object;
      // 014: checkcast java/lang/String
      // 017: astore 2
      // 018: invokestatic com/finalshell/ui/panel/TunnelList.V ()Ljava/lang/String;
      // 01b: aload 2
      // 01c: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 01f: astore 2
      // 020: astore 1
      // 021: bipush 0
      // 022: istore 3
      // 023: bipush 0
      // 024: istore 4
      // 026: aload 0
      // 027: ldc2_w 414608544041084281
      // 02a: astore 10
      // 02c: ldc2_w 414608544041084281
      // 02f: aload 10
      // 031: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 034: checkcast javax/swing/JTextField
      // 037: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 03a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03d: ldc ""
      // 03f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 042: aload 1
      // 043: ifnull 092
      // 046: ifeq 076
      // 049: goto 050
      // 04c: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: aload 0
      // 051: sipush -4339
      // 054: sipush -12098
      // 057: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 05a: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 05d: aload 0
      // 05e: ldc2_w 414608544041084281
      // 061: astore 12
      // 063: ldc2_w 414608544041084281
      // 066: aload 12
      // 068: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06b: checkcast javax/swing/JTextField
      // 06e: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 071: return
      // 072: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: aload 0
      // 077: ldc2_w 310253859679637216
      // 07a: astore 14
      // 07c: ldc2_w 310253859679637216
      // 07f: aload 14
      // 081: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 084: checkcast javax/swing/JTextField
      // 087: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 08a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08d: ldc ""
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: aload 1
      // 093: ifnull 0e2
      // 096: ifeq 0c6
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: sipush -4296
      // 0a4: sipush -30454
      // 0a7: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 0aa: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 0ad: aload 0
      // 0ae: ldc2_w 310253859679637216
      // 0b1: astore 16
      // 0b3: ldc2_w 310253859679637216
      // 0b6: aload 16
      // 0b8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bb: checkcast javax/swing/JTextField
      // 0be: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 0c1: return
      // 0c2: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: ldc2_w 252123593957137435
      // 0ca: astore 18
      // 0cc: ldc2_w 252123593957137435
      // 0cf: aload 18
      // 0d1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d4: checkcast javax/swing/JTextField
      // 0d7: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0da: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0dd: ldc ""
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: aload 1
      // 0e3: ifnull 154
      // 0e6: ifeq 138
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 2
      // 0f1: sipush -4351
      // 0f4: sipush -10294
      // 0f7: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fd: aload 1
      // 0fe: ifnull 154
      // 101: goto 108
      // 104: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: ifne 138
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 0
      // 113: sipush -4346
      // 116: sipush 10647
      // 119: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 11c: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 11f: aload 0
      // 120: ldc2_w 252123593957137435
      // 123: astore 20
      // 125: ldc2_w 252123593957137435
      // 128: aload 20
      // 12a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12d: checkcast javax/swing/JTextField
      // 130: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 133: return
      // 134: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 0
      // 139: ldc2_w 332149350821937177
      // 13c: astore 22
      // 13e: ldc2_w 332149350821937177
      // 141: aload 22
      // 143: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 146: checkcast javax/swing/JTextField
      // 149: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 14c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 14f: ldc ""
      // 151: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 154: aload 1
      // 155: ifnull 1c4
      // 158: ifeq 1aa
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: aload 2
      // 163: sipush -4291
      // 166: sipush 975
      // 169: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 16c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16f: aload 1
      // 170: ifnull 1c4
      // 173: goto 17a
      // 176: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: ifne 1aa
      // 17d: goto 184
      // 180: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: aload 0
      // 185: sipush -4329
      // 188: sipush 15895
      // 18b: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 18e: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 191: aload 0
      // 192: ldc2_w 332149350821937177
      // 195: astore 24
      // 197: ldc2_w 332149350821937177
      // 19a: aload 24
      // 19c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19f: checkcast javax/swing/JTextField
      // 1a2: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 1a5: return
      // 1a6: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: ldc2_w 310253859679637216
      // 1ae: astore 26
      // 1b0: ldc2_w 310253859679637216
      // 1b3: aload 26
      // 1b5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b8: checkcast javax/swing/JTextField
      // 1bb: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 1be: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1c1: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1c4: istore 3
      // 1c5: goto 1ec
      // 1c8: astore 5
      // 1ca: aload 0
      // 1cb: sipush -4337
      // 1ce: sipush -32331
      // 1d1: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 1d4: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 1d7: aload 0
      // 1d8: ldc2_w 310253859679637216
      // 1db: astore 28
      // 1dd: ldc2_w 310253859679637216
      // 1e0: aload 28
      // 1e2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e5: checkcast javax/swing/JTextField
      // 1e8: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 1eb: return
      // 1ec: aload 0
      // 1ed: ldc2_w 332149350821937177
      // 1f0: astore 30
      // 1f2: ldc2_w 332149350821937177
      // 1f5: aload 30
      // 1f7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1fa: checkcast javax/swing/JTextField
      // 1fd: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 200: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 203: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 206: istore 4
      // 208: goto 24e
      // 20b: astore 5
      // 20d: aload 2
      // 20e: sipush -4291
      // 211: sipush 975
      // 214: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 217: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21a: aload 1
      // 21b: ifnull 25b
      // 21e: ifne 24e
      // 221: goto 228
      // 224: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: aload 0
      // 229: sipush -4293
      // 22c: sipush 24286
      // 22f: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 232: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 235: aload 0
      // 236: ldc2_w 332149350821937177
      // 239: astore 32
      // 23b: ldc2_w 332149350821937177
      // 23e: aload 32
      // 240: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 243: checkcast javax/swing/JTextField
      // 246: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 249: return
      // 24a: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: aload 2
      // 24f: sipush -4291
      // 252: sipush 975
      // 255: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 258: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25b: ifne 25e
      // 25e: bipush 0
      // 25f: istore 5
      // 261: aload 0
      // 262: ldc2_w 545517466406007910
      // 265: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 268: swap
      // 269: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 26c: aload 1
      // 26d: ifnull 2cd
      // 270: ifeq 2af
      // 273: goto 27a
      // 276: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: aload 0
      // 27b: ldc2_w 335167237343284276
      // 27e: astore 34
      // 280: ldc2_w 335167237343284276
      // 283: aload 34
      // 285: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 288: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28b: ldc2_w 347860782649835626
      // 28e: astore 37
      // 290: astore 36
      // 292: ldc2_w 347860782649835626
      // 295: aload 36
      // 297: aload 37
      // 299: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29c: checkcast java/lang/Integer
      // 29f: invokevirtual java/lang/Integer.intValue ()I
      // 2a2: goto 2a9
      // 2a5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: istore 5
      // 2ab: aload 1
      // 2ac: ifnonnull 2cf
      // 2af: aload 0
      // 2b0: ldc2_w 208060216150987566
      // 2b3: astore 38
      // 2b5: ldc2_w 208060216150987566
      // 2b8: aload 38
      // 2ba: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2bd: checkcast java/util/Random
      // 2c0: invokevirtual java/util/Random.nextInt ()I
      // 2c3: invokestatic java/lang/Math.abs (I)I
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: istore 5
      // 2cf: aload 0
      // 2d0: ldc2_w 236594814748383325
      // 2d3: astore 40
      // 2d5: ldc2_w 236594814748383325
      // 2d8: aload 40
      // 2da: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2dd: iload 5
      // 2df: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 2e2: ldc2_w 405774458605996140
      // 2e5: astore 43
      // 2e7: astore 42
      // 2e9: ldc2_w 405774458605996140
      // 2ec: aload 42
      // 2ee: aload 43
      // 2f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f3: pop
      // 2f4: goto 2fb
      // 2f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fa: athrow
      // 2fb: aload 0
      // 2fc: ldc2_w 236594814748383325
      // 2ff: astore 44
      // 301: ldc2_w 236594814748383325
      // 304: aload 44
      // 306: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 309: iload 5
      // 30b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 30e: ldc2_w 405774458605996140
      // 311: astore 47
      // 313: astore 46
      // 315: ldc2_w 405774458605996140
      // 318: aload 46
      // 31a: aload 47
      // 31c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 31f: pop
      // 320: goto 327
      // 323: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 326: athrow
      // 327: aload 0
      // 328: ldc2_w 236594814748383325
      // 32b: astore 48
      // 32d: ldc2_w 236594814748383325
      // 330: aload 48
      // 332: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 335: aload 0
      // 336: ldc2_w 414608544041084281
      // 339: astore 50
      // 33b: ldc2_w 414608544041084281
      // 33e: aload 50
      // 340: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 343: checkcast javax/swing/JTextField
      // 346: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 349: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 34c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 34f: ldc2_w 356843886607898983
      // 352: astore 53
      // 354: astore 52
      // 356: ldc2_w 356843886607898983
      // 359: aload 52
      // 35b: aload 53
      // 35d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 360: pop
      // 361: goto 368
      // 364: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 367: athrow
      // 368: aload 2
      // 369: sipush -4291
      // 36c: sipush 975
      // 36f: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 372: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 375: aload 1
      // 376: ifnull 3d6
      // 379: ifeq 3c2
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 382: athrow
      // 383: aload 0
      // 384: ldc2_w 236594814748383325
      // 387: astore 54
      // 389: ldc2_w 236594814748383325
      // 38c: aload 54
      // 38e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 391: ldc2_w 297191265528158022
      // 394: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 397: aconst_null
      // 398: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 39b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 39e: ldc2_w 382697892041253906
      // 3a1: astore 57
      // 3a3: astore 56
      // 3a5: ldc2_w 382697892041253906
      // 3a8: aload 56
      // 3aa: aload 57
      // 3ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3af: pop
      // 3b0: goto 3b7
      // 3b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b6: athrow
      // 3b7: aload 1
      // 3b8: ifnonnull 480
      // 3bb: goto 3c2
      // 3be: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c1: athrow
      // 3c2: aload 2
      // 3c3: sipush -4323
      // 3c6: sipush -3159
      // 3c9: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 3cc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: aload 1
      // 3d7: ifnull 437
      // 3da: ifeq 423
      // 3dd: goto 3e4
      // 3e0: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e3: athrow
      // 3e4: aload 0
      // 3e5: ldc2_w 236594814748383325
      // 3e8: astore 58
      // 3ea: ldc2_w 236594814748383325
      // 3ed: aload 58
      // 3ef: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3f2: ldc2_w 343042688357189616
      // 3f5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3f8: aconst_null
      // 3f9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 3fc: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 3ff: ldc2_w 382697892041253906
      // 402: astore 61
      // 404: astore 60
      // 406: ldc2_w 382697892041253906
      // 409: aload 60
      // 40b: aload 61
      // 40d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 410: pop
      // 411: goto 418
      // 414: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 417: athrow
      // 418: aload 1
      // 419: ifnonnull 480
      // 41c: goto 423
      // 41f: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 422: athrow
      // 423: aload 2
      // 424: sipush -4349
      // 427: sipush 21556
      // 42a: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (II)Ljava/lang/String;
      // 42d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 430: goto 437
      // 433: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 436: athrow
      // 437: aload 1
      // 438: ifnull 59a
      // 43b: ifeq 480
      // 43e: goto 445
      // 441: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 444: athrow
      // 445: aload 0
      // 446: ldc2_w 236594814748383325
      // 449: astore 62
      // 44b: ldc2_w 236594814748383325
      // 44e: aload 62
      // 450: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 453: ldc2_w 314583299194608155
      // 456: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 459: aconst_null
      // 45a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 45d: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 460: ldc2_w 382697892041253906
      // 463: astore 65
      // 465: astore 64
      // 467: ldc2_w 382697892041253906
      // 46a: aload 64
      // 46c: aload 65
      // 46e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 471: pop
      // 472: goto 479
      // 475: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 478: athrow
      // 479: goto 480
      // 47c: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47f: athrow
      // 480: aload 0
      // 481: ldc2_w 236594814748383325
      // 484: astore 66
      // 486: ldc2_w 236594814748383325
      // 489: aload 66
      // 48b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 48e: iload 3
      // 48f: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 492: ldc2_w 202185198655524445
      // 495: astore 69
      // 497: astore 68
      // 499: ldc2_w 202185198655524445
      // 49c: aload 68
      // 49e: aload 69
      // 4a0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a3: pop
      // 4a4: goto 4ab
      // 4a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4aa: athrow
      // 4ab: aload 0
      // 4ac: ldc2_w 236594814748383325
      // 4af: astore 70
      // 4b1: ldc2_w 236594814748383325
      // 4b4: aload 70
      // 4b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4b9: aload 0
      // 4ba: ldc2_w 557254593771208646
      // 4bd: astore 72
      // 4bf: ldc2_w 557254593771208646
      // 4c2: aload 72
      // 4c4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4c7: checkcast javax/swing/JTextField
      // 4ca: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 4cd: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 4d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d3: ldc2_w 485249438175786597
      // 4d6: astore 75
      // 4d8: astore 74
      // 4da: ldc2_w 485249438175786597
      // 4dd: aload 74
      // 4df: aload 75
      // 4e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e4: pop
      // 4e5: goto 4ec
      // 4e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4eb: athrow
      // 4ec: aload 0
      // 4ed: ldc2_w 236594814748383325
      // 4f0: astore 76
      // 4f2: ldc2_w 236594814748383325
      // 4f5: aload 76
      // 4f7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4fa: iload 3
      // 4fb: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 4fe: ldc2_w 202185198655524445
      // 501: astore 79
      // 503: astore 78
      // 505: ldc2_w 202185198655524445
      // 508: aload 78
      // 50a: aload 79
      // 50c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 50f: pop
      // 510: goto 517
      // 513: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 516: athrow
      // 517: aload 0
      // 518: ldc2_w 236594814748383325
      // 51b: astore 80
      // 51d: ldc2_w 236594814748383325
      // 520: aload 80
      // 522: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 525: aload 0
      // 526: ldc2_w 252123593957137435
      // 529: astore 82
      // 52b: ldc2_w 252123593957137435
      // 52e: aload 82
      // 530: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 533: checkcast javax/swing/JTextField
      // 536: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 539: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 53c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 53f: ldc2_w 493521021805121041
      // 542: astore 85
      // 544: astore 84
      // 546: ldc2_w 493521021805121041
      // 549: aload 84
      // 54b: aload 85
      // 54d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 550: pop
      // 551: goto 558
      // 554: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 557: athrow
      // 558: aload 0
      // 559: ldc2_w 236594814748383325
      // 55c: astore 86
      // 55e: ldc2_w 236594814748383325
      // 561: aload 86
      // 563: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 566: iload 4
      // 568: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 56b: ldc2_w 303196941230602751
      // 56e: astore 89
      // 570: astore 88
      // 572: ldc2_w 303196941230602751
      // 575: aload 88
      // 577: aload 89
      // 579: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 57c: pop
      // 57d: goto 584
      // 580: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 583: athrow
      // 584: aload 0
      // 585: aload 1
      // 586: ifnull 5fc
      // 589: ldc2_w 545517466406007910
      // 58c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 58f: swap
      // 590: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 593: goto 59a
      // 596: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 599: athrow
      // 59a: ifne 5f4
      // 59d: aload 0
      // 59e: ldc2_w 174133863343276975
      // 5a1: astore 90
      // 5a3: ldc2_w 174133863343276975
      // 5a6: aload 90
      // 5a8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5ab: checkcast java/util/ArrayList
      // 5ae: aload 0
      // 5af: ldc2_w 236594814748383325
      // 5b2: astore 92
      // 5b4: ldc2_w 236594814748383325
      // 5b7: aload 92
      // 5b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5bc: checkcast com/finalshell/core/YE
      // 5bf: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 5c2: pop
      // 5c3: aload 0
      // 5c4: ldc2_w 174133863343276975
      // 5c7: astore 94
      // 5c9: ldc2_w 174133863343276975
      // 5cc: aload 94
      // 5ce: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5d1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5d4: ldc2_w 250081855046758848
      // 5d7: astore 96
      // 5d9: ldc2_w 250081855046758848
      // 5dc: aload 96
      // 5de: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5e1: pop
      // 5e2: goto 5e9
      // 5e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e8: athrow
      // 5e9: aload 1
      // 5ea: ifnonnull 6de
      // 5ed: goto 5f4
      // 5f0: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f3: athrow
      // 5f4: aload 0
      // 5f5: goto 5fc
      // 5f8: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fb: athrow
      // 5fc: ldc2_w 174133863343276975
      // 5ff: astore 98
      // 601: ldc2_w 174133863343276975
      // 604: aload 98
      // 606: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 609: checkcast java/util/ArrayList
      // 60c: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 60f: astore 6
      // 611: aload 6
      // 613: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 618: ifeq 692
      // 61b: aload 6
      // 61d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 622: checkcast com/finalshell/core/YE
      // 625: astore 7
      // 627: aload 7
      // 629: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 62c: ldc2_w 347860782649835626
      // 62f: astore 101
      // 631: astore 100
      // 633: ldc2_w 347860782649835626
      // 636: aload 100
      // 638: aload 101
      // 63a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 63d: checkcast java/lang/Integer
      // 640: invokevirtual java/lang/Integer.intValue ()I
      // 643: goto 64a
      // 646: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 649: athrow
      // 64a: aload 1
      // 64b: ifnull 6b7
      // 64e: aload 1
      // 64f: ifnull 682
      // 652: goto 659
      // 655: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 658: athrow
      // 659: iload 5
      // 65b: if_icmpne 687
      // 65e: goto 665
      // 661: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 664: athrow
      // 665: aload 0
      // 666: ldc2_w 174133863343276975
      // 669: astore 102
      // 66b: ldc2_w 174133863343276975
      // 66e: aload 102
      // 670: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 673: checkcast java/util/ArrayList
      // 676: aload 7
      // 678: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 67b: goto 682
      // 67e: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 681: athrow
      // 682: pop
      // 683: aload 1
      // 684: ifnonnull 692
      // 687: aload 1
      // 688: ifnonnull 611
      // 68b: goto 692
      // 68e: invokestatic com/finalshell/ui/dialog/EditTunnelDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 691: athrow
      // 692: aload 0
      // 693: ldc2_w 174133863343276975
      // 696: astore 104
      // 698: ldc2_w 174133863343276975
      // 69b: aload 104
      // 69d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6a0: checkcast java/util/ArrayList
      // 6a3: aload 0
      // 6a4: ldc2_w 236594814748383325
      // 6a7: astore 106
      // 6a9: ldc2_w 236594814748383325
      // 6ac: aload 106
      // 6ae: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6b1: checkcast com/finalshell/core/YE
      // 6b4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 6b7: pop
      // 6b8: aload 0
      // 6b9: ldc2_w 174133863343276975
      // 6bc: astore 108
      // 6be: ldc2_w 174133863343276975
      // 6c1: aload 108
      // 6c3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6c6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6c9: ldc2_w 323125401524668221
      // 6cc: astore 110
      // 6ce: ldc2_w 323125401524668221
      // 6d1: aload 110
      // 6d3: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 6d6: pop
      // 6d7: goto 6de
      // 6da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6dd: athrow
      // 6de: aload 0
      // 6df: ldc2_w 301599412610048278
      // 6e2: astore 112
      // 6e4: ldc2_w 301599412610048278
      // 6e7: aload 112
      // 6e9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6ec: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6ef: ldc2_w 430403702259957300
      // 6f2: astore 115
      // 6f4: astore 114
      // 6f6: ldc2_w 430403702259957300
      // 6f9: aload 114
      // 6fb: aload 115
      // 6fd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 700: pop
      // 701: goto 708
      // 704: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 707: athrow
      // 708: aload 0
      // 709: ldc2_w 301599412610048278
      // 70c: astore 116
      // 70e: ldc2_w 301599412610048278
      // 711: aload 116
      // 713: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 716: aload 0
      // 717: ldc2_w 236594814748383325
      // 71a: astore 118
      // 71c: ldc2_w 236594814748383325
      // 71f: aload 118
      // 721: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 724: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 727: ldc2_w 347860782649835626
      // 72a: astore 121
      // 72c: astore 120
      // 72e: ldc2_w 347860782649835626
      // 731: aload 120
      // 733: aload 121
      // 735: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 738: checkcast java/lang/Integer
      // 73b: invokevirtual java/lang/Integer.intValue ()I
      // 73e: goto 745
      // 741: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 744: athrow
      // 745: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 748: ldc2_w 507015418792587867
      // 74b: astore 123
      // 74d: astore 122
      // 74f: ldc2_w 507015418792587867
      // 752: aload 122
      // 754: aload 123
      // 756: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 759: pop
      // 75a: goto 761
      // 75d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 760: athrow
      // 761: aload 0
      // 762: bipush 0
      // 763: invokevirtual com/finalshell/ui/dialog/EditTunnelDialog.setVisible (Z)V
      // 766: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4327) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 149;
               break;
            case 1:
               var10000 = 188;
               break;
            case 2:
               var10000 = 66;
               break;
            case 3:
               var10000 = 99;
               break;
            case 4:
               var10000 = 80;
               break;
            case 5:
               var10000 = 134;
               break;
            case 6:
               var10000 = 53;
               break;
            case 7:
               var10000 = 198;
               break;
            case 8:
               var10000 = 233;
               break;
            case 9:
               var10000 = 109;
               break;
            case 10:
               var10000 = 62;
               break;
            case 11:
               var10000 = 91;
               break;
            case 12:
               var10000 = 173;
               break;
            case 13:
               var10000 = 207;
               break;
            case 14:
               var10000 = 160;
               break;
            case 15:
               var10000 = 201;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 177;
               break;
            case 18:
               var10000 = 217;
               break;
            case 19:
               var10000 = 6;
               break;
            case 20:
               var10000 = 176;
               break;
            case 21:
               var10000 = 51;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 42;
               break;
            case 24:
               var10000 = 101;
               break;
            case 25:
               var10000 = 228;
               break;
            case 26:
               var10000 = 146;
               break;
            case 27:
               var10000 = 235;
               break;
            case 28:
               var10000 = 238;
               break;
            case 29:
               var10000 = 3;
               break;
            case 30:
               var10000 = 112;
               break;
            case 31:
               var10000 = 152;
               break;
            case 32:
               var10000 = 197;
               break;
            case 33:
               var10000 = 21;
               break;
            case 34:
               var10000 = 63;
               break;
            case 35:
               var10000 = 221;
               break;
            case 36:
               var10000 = 179;
               break;
            case 37:
               var10000 = 14;
               break;
            case 38:
               var10000 = 191;
               break;
            case 39:
               var10000 = 187;
               break;
            case 40:
               var10000 = 184;
               break;
            case 41:
               var10000 = 145;
               break;
            case 42:
               var10000 = 122;
               break;
            case 43:
               var10000 = 128;
               break;
            case 44:
               var10000 = 102;
               break;
            case 45:
               var10000 = 229;
               break;
            case 46:
               var10000 = 90;
               break;
            case 47:
               var10000 = 206;
               break;
            case 48:
               var10000 = 23;
               break;
            case 49:
               var10000 = 84;
               break;
            case 50:
               var10000 = 254;
               break;
            case 51:
               var10000 = 30;
               break;
            case 52:
               var10000 = 118;
               break;
            case 53:
               var10000 = 154;
               break;
            case 54:
               var10000 = 11;
               break;
            case 55:
               var10000 = 67;
               break;
            case 56:
               var10000 = 226;
               break;
            case 57:
               var10000 = 38;
               break;
            case 58:
               var10000 = 165;
               break;
            case 59:
               var10000 = 147;
               break;
            case 60:
               var10000 = 28;
               break;
            case 61:
               var10000 = 139;
               break;
            case 62:
               var10000 = 171;
               break;
            case 63:
               var10000 = 223;
               break;
            case 64:
               var10000 = 164;
               break;
            case 65:
               var10000 = 231;
               break;
            case 66:
               var10000 = 192;
               break;
            case 67:
               var10000 = 1;
               break;
            case 68:
               var10000 = 36;
               break;
            case 69:
               var10000 = 58;
               break;
            case 70:
               var10000 = 141;
               break;
            case 71:
               var10000 = 20;
               break;
            case 72:
               var10000 = 249;
               break;
            case 73:
               var10000 = 202;
               break;
            case 74:
               var10000 = 82;
               break;
            case 75:
               var10000 = 126;
               break;
            case 76:
               var10000 = 136;
               break;
            case 77:
               var10000 = 92;
               break;
            case 78:
               var10000 = 116;
               break;
            case 79:
               var10000 = 224;
               break;
            case 80:
               var10000 = 166;
               break;
            case 81:
               var10000 = 50;
               break;
            case 82:
               var10000 = 10;
               break;
            case 83:
               var10000 = 130;
               break;
            case 84:
               var10000 = 19;
               break;
            case 85:
               var10000 = 244;
               break;
            case 86:
               var10000 = 220;
               break;
            case 87:
               var10000 = 83;
               break;
            case 88:
               var10000 = 43;
               break;
            case 89:
               var10000 = 142;
               break;
            case 90:
               var10000 = 236;
               break;
            case 91:
               var10000 = 107;
               break;
            case 92:
               var10000 = 143;
               break;
            case 93:
               var10000 = 88;
               break;
            case 94:
               var10000 = 120;
               break;
            case 95:
               var10000 = 18;
               break;
            case 96:
               var10000 = 52;
               break;
            case 97:
               var10000 = 44;
               break;
            case 98:
               var10000 = 190;
               break;
            case 99:
               var10000 = 39;
               break;
            case 100:
               var10000 = 85;
               break;
            case 101:
               var10000 = 34;
               break;
            case 102:
               var10000 = 89;
               break;
            case 103:
               var10000 = 232;
               break;
            case 104:
               var10000 = 96;
               break;
            case 105:
               var10000 = 140;
               break;
            case 106:
               var10000 = 167;
               break;
            case 107:
               var10000 = 158;
               break;
            case 108:
               var10000 = 213;
               break;
            case 109:
               var10000 = 237;
               break;
            case 110:
               var10000 = 148;
               break;
            case 111:
               var10000 = 77;
               break;
            case 112:
               var10000 = 8;
               break;
            case 113:
               var10000 = 161;
               break;
            case 114:
               var10000 = 61;
               break;
            case 115:
               var10000 = 127;
               break;
            case 116:
               var10000 = 214;
               break;
            case 117:
               var10000 = 133;
               break;
            case 118:
               var10000 = 129;
               break;
            case 119:
               var10000 = 162;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 115;
               break;
            case 122:
               var10000 = 65;
               break;
            case 123:
               var10000 = 2;
               break;
            case 124:
               var10000 = 135;
               break;
            case 125:
               var10000 = 131;
               break;
            case 126:
               var10000 = 70;
               break;
            case 127:
               var10000 = 9;
               break;
            case 128:
               var10000 = 247;
               break;
            case 129:
               var10000 = 151;
               break;
            case 130:
               var10000 = 17;
               break;
            case 131:
               var10000 = 74;
               break;
            case 132:
               var10000 = 86;
               break;
            case 133:
               var10000 = 60;
               break;
            case 134:
               var10000 = 4;
               break;
            case 135:
               var10000 = 98;
               break;
            case 136:
               var10000 = 29;
               break;
            case 137:
               var10000 = 37;
               break;
            case 138:
               var10000 = 46;
               break;
            case 139:
               var10000 = 114;
               break;
            case 140:
               var10000 = 104;
               break;
            case 141:
               var10000 = 76;
               break;
            case 142:
               var10000 = 205;
               break;
            case 143:
               var10000 = 75;
               break;
            case 144:
               var10000 = 78;
               break;
            case 145:
               var10000 = 106;
               break;
            case 146:
               var10000 = 182;
               break;
            case 147:
               var10000 = 195;
               break;
            case 148:
               var10000 = 218;
               break;
            case 149:
               var10000 = 211;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 189;
               break;
            case 152:
               var10000 = 93;
               break;
            case 153:
               var10000 = 219;
               break;
            case 154:
               var10000 = 105;
               break;
            case 155:
               var10000 = 163;
               break;
            case 156:
               var10000 = 103;
               break;
            case 157:
               var10000 = 5;
               break;
            case 158:
               var10000 = 13;
               break;
            case 159:
               var10000 = 253;
               break;
            case 160:
               var10000 = 246;
               break;
            case 161:
               var10000 = 125;
               break;
            case 162:
               var10000 = 252;
               break;
            case 163:
               var10000 = 16;
               break;
            case 164:
               var10000 = 108;
               break;
            case 165:
               var10000 = 55;
               break;
            case 166:
               var10000 = 27;
               break;
            case 167:
               var10000 = 71;
               break;
            case 168:
               var10000 = 216;
               break;
            case 169:
               var10000 = 49;
               break;
            case 170:
               var10000 = 208;
               break;
            case 171:
               var10000 = 100;
               break;
            case 172:
               var10000 = 111;
               break;
            case 173:
               var10000 = 33;
               break;
            case 174:
               var10000 = 185;
               break;
            case 175:
               var10000 = 87;
               break;
            case 176:
               var10000 = 186;
               break;
            case 177:
               var10000 = 222;
               break;
            case 178:
               var10000 = 25;
               break;
            case 179:
               var10000 = 113;
               break;
            case 180:
               var10000 = 248;
               break;
            case 181:
               var10000 = 137;
               break;
            case 182:
               var10000 = 243;
               break;
            case 183:
               var10000 = 212;
               break;
            case 184:
               var10000 = 156;
               break;
            case 185:
               var10000 = 230;
               break;
            case 186:
               var10000 = 26;
               break;
            case 187:
               var10000 = 95;
               break;
            case 188:
               var10000 = 174;
               break;
            case 189:
               var10000 = 241;
               break;
            case 190:
               var10000 = 178;
               break;
            case 191:
               var10000 = 204;
               break;
            case 192:
               var10000 = 121;
               break;
            case 193:
               var10000 = 54;
               break;
            case 194:
               var10000 = 119;
               break;
            case 195:
               var10000 = 32;
               break;
            case 196:
               var10000 = 203;
               break;
            case 197:
               var10000 = 144;
               break;
            case 198:
               var10000 = 132;
               break;
            case 199:
               var10000 = 245;
               break;
            case 200:
               var10000 = 155;
               break;
            case 201:
               var10000 = 81;
               break;
            case 202:
               var10000 = 196;
               break;
            case 203:
               var10000 = 40;
               break;
            case 204:
               var10000 = 59;
               break;
            case 205:
               var10000 = 193;
               break;
            case 206:
               var10000 = 138;
               break;
            case 207:
               var10000 = 12;
               break;
            case 208:
               var10000 = 57;
               break;
            case 209:
               var10000 = 31;
               break;
            case 210:
               var10000 = 41;
               break;
            case 211:
               var10000 = 124;
               break;
            case 212:
               var10000 = 251;
               break;
            case 213:
               var10000 = 172;
               break;
            case 214:
               var10000 = 227;
               break;
            case 215:
               var10000 = 69;
               break;
            case 216:
               var10000 = 68;
               break;
            case 217:
               var10000 = 0;
               break;
            case 218:
               var10000 = 94;
               break;
            case 219:
               var10000 = 239;
               break;
            case 220:
               var10000 = 48;
               break;
            case 221:
               var10000 = 22;
               break;
            case 222:
               var10000 = 73;
               break;
            case 223:
               var10000 = 170;
               break;
            case 224:
               var10000 = 157;
               break;
            case 225:
               var10000 = 159;
               break;
            case 226:
               var10000 = 200;
               break;
            case 227:
               var10000 = 242;
               break;
            case 228:
               var10000 = 97;
               break;
            case 229:
               var10000 = 110;
               break;
            case 230:
               var10000 = 15;
               break;
            case 231:
               var10000 = 45;
               break;
            case 232:
               var10000 = 183;
               break;
            case 233:
               var10000 = 180;
               break;
            case 234:
               var10000 = 72;
               break;
            case 235:
               var10000 = 24;
               break;
            case 236:
               var10000 = 153;
               break;
            case 237:
               var10000 = 240;
               break;
            case 238:
               var10000 = 64;
               break;
            case 239:
               var10000 = 234;
               break;
            case 240:
               var10000 = 169;
               break;
            case 241:
               var10000 = 181;
               break;
            case 242:
               var10000 = 194;
               break;
            case 243:
               var10000 = 35;
               break;
            case 244:
               var10000 = 199;
               break;
            case 245:
               var10000 = 56;
               break;
            case 246:
               var10000 = 168;
               break;
            case 247:
               var10000 = 255;
               break;
            case 248:
               var10000 = 123;
               break;
            case 249:
               var10000 = 225;
               break;
            case 250:
               var10000 = 175;
               break;
            case 251:
               var10000 = 150;
               break;
            case 252:
               var10000 = 215;
               break;
            case 253:
               var10000 = 209;
               break;
            case 254:
               var10000 = 47;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27079;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[41];
      int var11 = 0;
      String var10 = "'\u001c3Õë\u009d\u0006äLKßäÜ\u0005+÷Èè\u0087\u0005瘔森圬埁|\u0002輤竦\u000b×µª= MÝ\u0006Î)n\u0002辟穏\t»íú\\K~é³\u0002\u0011¯\tX7\u0095Ö\u0099\b\u000b\u0001±Õ«WÌ\u007f_\u0004^µ\u009eA\u001d\u0095¦(©\u0099¿ocÑÇ\u0085\n\u0094ð,7\u001fâS©È\n\u000bG\u000bP\n \u0007\t\u0090Ñ\u009fÛç\u008e|\u00ad°\u0002叙涘\u0011\u001bºÌAE\u001a\u0083ÓJzÛ¸æ¸g\u0082h\b謄轜允瘿栓程叠ë\u0005皯呙穜叚V\u000b5\u0016öI«Ã¬×à\u0013«\nË-0U\t/§\u00874\u0011\u0005縧察Ëùò\u0004âY\tÜ\u0006譍轸全员私¶\u0011¸\u001c^sÄçE\u0006K\u0089\u0099?¶@´Èw\t诬辟兜旙寠窚叄匏\u001e\no%½/Â\u000f\u0081KE/\u0006Ñyé}´¬\u000e\u007f\u001fu\u009e2Y\u001a¿\u007f\\Px>\u008f\u0002杂坽\u000e\u0084]\nÖÝPç\u009eÀx§üÀ\u001f\u0007罖轆阔邃\u0004T\u0002\u0004攏庽降郺\u0003簜埃\u0000\b譎迷儈癊栺坺坦á\u0003咝禮\u0088\b讲輖冗癉哢稝厐)\t譯迈儬攳寮竇包厤&\n\u000eh\u0091\u0086G:1íSû\u0006=6t\u0094\u0007\u0091\u0002硯孡\u0011Þ\u0003A\u001d´)Ê°w\u008c\u0010p\u0005\u0089\u001dé\u001a";
      int var12 = "'\u001c3Õë\u009d\u0006äLKßäÜ\u0005+÷Èè\u0087\u0005瘔森圬埁|\u0002輤竦\u000b×µª= MÝ\u0006Î)n\u0002辟穏\t»íú\\K~é³\u0002\u0011¯\tX7\u0095Ö\u0099\b\u000b\u0001±Õ«WÌ\u007f_\u0004^µ\u009eA\u001d\u0095¦(©\u0099¿ocÑÇ\u0085\n\u0094ð,7\u001fâS©È\n\u000bG\u000bP\n \u0007\t\u0090Ñ\u009fÛç\u008e|\u00ad°\u0002叙涘\u0011\u001bºÌAE\u001a\u0083ÓJzÛ¸æ¸g\u0082h\b謄轜允瘿栓程叠ë\u0005皯呙穜叚V\u000b5\u0016öI«Ã¬×à\u0013«\nË-0U\t/§\u00874\u0011\u0005縧察Ëùò\u0004âY\tÜ\u0006譍轸全员私¶\u0011¸\u001c^sÄçE\u0006K\u0089\u0099?¶@´Èw\t诬辟兜旙寠窚叄匏\u001e\no%½/Â\u000f\u0081KE/\u0006Ñyé}´¬\u000e\u007f\u001fu\u009e2Y\u001a¿\u007f\\Px>\u008f\u0002杂坽\u000e\u0084]\nÖÝPç\u009eÀx§üÀ\u001f\u0007罖轆阔邃\u0004T\u0002\u0004攏庽降郺\u0003簜埃\u0000\b譎迷儈癊栺坺坦á\u0003咝禮\u0088\b讲輖冗癉哢稝厐)\t譯迈儬攳寮竇包厤&\n\u000eh\u0091\u0086G:1íSû\u0006=6t\u0094\u0007\u0091\u0002硯孡\u0011Þ\u0003A\u001d´)Ê°w\u008c\u0010p\u0005\u0089\u001dé\u001a"
         .length();
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 77;
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
                        var58 = 18;
                        break;
                     case 1:
                        var58 = 81;
                        break;
                     case 2:
                        var58 = 11;
                        break;
                     case 3:
                        var58 = 117;
                        break;
                     case 4:
                        var58 = 112;
                        break;
                     case 5:
                        var58 = 122;
                        break;
                     default:
                        var58 = 108;
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
                     b = new String[41];
                     long var0 = 5682101892984789991L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "HÕÊ×ÎV$mªXÓ%Çûë\u0006";
                     int var5 = "HÕÊ×ÎV$mªXÓ%Çûë\u0006".length();
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

                     c = var6;
                     d = new Integer[2];
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

                  var10 = "瘗棠竛叫î\u0002朘園";
                  var12 = "瘗棠竛叫î\u0002朘園".length();
                  var9 = 5;
                  var16 = -1;
            }

            var10000 = 13;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





