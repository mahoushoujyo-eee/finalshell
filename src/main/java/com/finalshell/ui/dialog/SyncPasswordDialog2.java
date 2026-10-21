package com.finalshell.ui.dialog;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.FP;
import com.finalshell.ui.listener.Bm2;
import com.finalshell.ui.listener.Vx2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import net.miginfocom.swing.MigLayout;

public class SyncPasswordDialog2 extends JDialog {
   JPasswordField f;
   JPasswordField m;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public SyncPasswordDialog2(FP var1) {
      super((Frame)var1);
      String var3 = a(4188, 22520);
      this.setTitle(var3);
      this.setLayout(new MigLayout(a(4170, 16028), a(4184, -5675), a(4180, -10909)));
      String var4 = new String(a(4174, 4974));
      JLabel var5 = new JLabel(a(4186, 22744));
      var5.setForeground(new Color(a(17608, 7658664735749544881L), 0, 0));
      this.add(var5, a(4179, -29353));
      JLabel var6 = new JLabel(a(4178, -27108));
      var6.setForeground(new Color(a(16769, 7979105738886553339L), 0, 0));
      this.add(var6, a(4164, 22743));
      JLabel var7 = new JLabel(a(4187, 21516));
      var7.setForeground(new Color(a(16769, 7979105738886553339L), 0, 0));
      this.add(var7, a(4164, 22743));
      this.add(new JLabel(a(4191, -29235)), a(4164, 22743));
      this.add(new JLabel(a(4161, -31406)), a(4164, 22743));
      JPanel var8 = new JPanel(new MigLayout(a(4166, -13793)));
      this.add(var8, a(4185, -31568));
      var8.add(new JLabel(a(4176, 26848)), a(4190, 20476));
      JPasswordField var10001 = new JPasswordField();
      long var14 = 240001478134891022L;
      JPasswordField var13 = var10001;
      Ref.s(240001478134891022L, var13, var14);
      Object var15 = 240001478134891022L;
      Registry.packArgs(Ref.g(240001478134891022L, var15));
      long var17 = 322267315291882359L;
      Ref.h2(322267315291882359L, var17);
      Object var19 = 240001478134891022L;
      this.add((JPasswordField)Ref.g(240001478134891022L, var19), var4);
      JPanel var9 = new JPanel(new MigLayout(a(4182, -13217)));
      var9.add(new JLabel(a(4175, -7855)), a(4177, -3767));
      this.add(var9, a(4169, -18843));
      User.c$int();
      JPasswordField var10006 = new JPasswordField();
      long var22 = 126392943304858444L;
      JPasswordField var21 = var10006;
      Ref.s(126392943304858444L, var21, var22);
      Object var23 = 126392943304858444L;
      Registry.packArgs(Ref.g(126392943304858444L, var23));
      long var25 = 322267315291882359L;
      Ref.h2(322267315291882359L, var25);
      Object var27 = 126392943304858444L;
      this.add((JPasswordField)Ref.g(126392943304858444L, var27), var4);
      JPanel var10 = new JPanel(new MigLayout(a(4182, -13217)));
      this.add(var10, a(4169, -18843));
      JButton var11 = new JButton(a(4181, -14879));
      var11.setFocusable(false);
      var10.add(var11, a(4172, 32095));
      var11.addActionListener(new Vx2(this));
      JButton var12 = new JButton(a(4163, -11720));
      var12.setFocusable(false);
      var10.add(var12, a(4189, 6300));
      var12.addActionListener(new Bm2(this));
      this.pack();
      this.setLocationRelativeTo(null);
      if (Ky4.F$arrString() != null) {
         int var2 = var9 + 1;
         User.B(var2);
      }
   }

   void J() {
      Object var1 = 240001478134891022L;
      ((JPasswordField)Ref.g(240001478134891022L, var1)).setText("");
      Object var3 = 126392943304858444L;
      ((JPasswordField)Ref.g(126392943304858444L, var3)).setText("");
   }

   void Q() {
      User.c$int();
      String var10001;
      Object var12 = 240001478134891022L;
      super(((JPasswordField)Ref.g(240001478134891022L, var12)).getPassword());
      String var2 = var10001;
      String var1 = var10001;
      String var10002;
      Object var14 = 126392943304858444L;
      super(((JPasswordField)Ref.g(126392943304858444L, var14)).getPassword());
      String var3 = var10002;
      if (var1 == false) {
         label92:
         if (var2.length() >= a(2389, 7498614023425906222L)) {
            int var21 = var3.length();
            if (var1 == false) {
               if (var21 < a(3783, 7118769469375435199L)) {
                  break label92;
               }

               var21 = (var2.equals(var3)) ? 1 : 0;
            }

            if (var21 == 0) {
               JOptionPane.showMessageDialog(this, a(4162, 29051));
               return;
            }

            Object var16 = 240001478134891022L;
            char[] var4 = ((JPasswordField)Ref.g(240001478134891022L, var16)).getPassword();
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            char[] var8 = var4;
            int var9 = var4.length;
            int var10 = 0;

            boolean var10003;
            while (true) {
               if (var10 < var9) {
                  char var11 = var8[var10];
                  var10003 = Character.isLowerCase(var11);
                  if (var1 != false) {
                     break;
                  }

                  if (var1 == false) {
                     if (var10003) {
                        var6 = true;
                     }

                     var10003 = Character.isUpperCase(var11);
                  }

                  if (var1 == false) {
                     if (var10003) {
                        var5 = true;
                     }

                     var10003 = Character.isDigit(var11);
                  }

                  label73: {
                     if (var1 == false) {
                        if (!var10003) {
                           break label73;
                        }

                        var10003 = true;
                     }

                     var7 = var10003;
                  }

                  var10++;
                  if (var1 == false) {
                     continue;
                  }
               }

               var10003 = var5;
               break;
            }

            if (var1 == false) {
               if (!var10003) {
                  JOptionPane.showMessageDialog(this, a(4167, -14574));
                  return;
               }

               var10003 = var6;
            }

            if (var1 == false) {
               if (!var10003) {
                  JOptionPane.showMessageDialog(this, a(4165, 23207));
                  return;
               }

               var10003 = var7;
            }

            if (!var10003) {
               JOptionPane.showMessageDialog(this, a(4168, -24244));
               return;
            }

            Object[] var10004 = Registry.packArgs(var2);
            long var19 = 130485595362944062L;
            Object[] var18 = var10004;
            Ref.h(130485595362944062L, var18, var19);

            try {
               return;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }

         JOptionPane.showMessageDialog(this, a(4160, 6965));
      }
   }

   void F(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/User.w ()I
      // 003: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 006: ldc2_w 270389152141252877
      // 009: astore 6
      // 00b: ldc2_w 270389152141252877
      // 00e: aload 6
      // 010: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 013: goto 01a
      // 016: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 019: athrow
      // 01a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01d: ldc2_w 612604310671515822
      // 020: astore 9
      // 022: astore 8
      // 024: ldc2_w 612604310671515822
      // 027: aload 8
      // 029: aload 9
      // 02b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02e: checkcast com/finalshell/core/Ln2
      // 031: goto 038
      // 034: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 037: athrow
      // 038: astore 3
      // 039: istore 2
      // 03a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03d: ldc2_w 270389152141252877
      // 040: astore 10
      // 042: ldc2_w 270389152141252877
      // 045: aload 10
      // 047: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 04a: goto 051
      // 04d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 050: athrow
      // 051: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 054: ldc2_w 612604310671515822
      // 057: astore 13
      // 059: astore 12
      // 05b: ldc2_w 612604310671515822
      // 05e: aload 12
      // 060: aload 13
      // 062: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 065: checkcast com/finalshell/core/Ln2
      // 068: goto 06f
      // 06b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 2
      // 070: ifeq 0da
      // 073: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 076: ldc2_w 287288583543378382
      // 079: astore 15
      // 07b: astore 14
      // 07d: ldc2_w 287288583543378382
      // 080: aload 14
      // 082: aload 15
      // 084: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 087: checkcast java/lang/Boolean
      // 08a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08d: goto 094
      // 090: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 093: athrow
      // 094: ifne 0f7
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/ui/dialog/SyncPasswordDialog2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a1: ldc2_w 270389152141252877
      // 0a4: astore 16
      // 0a6: ldc2_w 270389152141252877
      // 0a9: aload 16
      // 0ab: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ae: goto 0b5
      // 0b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b8: ldc2_w 612604310671515822
      // 0bb: astore 19
      // 0bd: astore 18
      // 0bf: ldc2_w 612604310671515822
      // 0c2: aload 18
      // 0c4: aload 19
      // 0c6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c9: checkcast com/finalshell/core/Ln2
      // 0cc: goto 0d3
      // 0cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/ui/dialog/SyncPasswordDialog2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: bipush 1
      // 0db: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 0de: ldc2_w 472288963033761188
      // 0e1: astore 21
      // 0e3: astore 20
      // 0e5: ldc2_w 472288963033761188
      // 0e8: aload 20
      // 0ea: aload 21
      // 0ec: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ef: pop
      // 0f0: goto 0f7
      // 0f3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0fb: ldc2_w 397336479715995013
      // 0fe: astore 22
      // 100: ldc2_w 397336479715995013
      // 103: aload 22
      // 105: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 108: checkcast [B
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: astore 4
      // 114: aload 3
      // 115: aload 4
      // 117: bipush 1
      // 118: bipush 1
      // 119: bipush 1
      // 11a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZZ)[Ljava/lang/Object;
      // 11d: ldc2_w 527638713568168540
      // 120: astore 25
      // 122: astore 24
      // 124: ldc2_w 527638713568168540
      // 127: aload 24
      // 129: aload 25
      // 12b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12e: pop
      // 12f: goto 136
      // 132: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 135: athrow
      // 136: aload 1
      // 137: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 13a: ldc2_w 169145696401012743
      // 13d: astore 26
      // 13f: ldc2_w 169145696401012743
      // 142: aload 26
      // 144: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 147: pop
      // 148: goto 14f
      // 14b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 0
      // 150: sipush 4183
      // 153: sipush 16144
      // 156: invokestatic com/finalshell/ui/dialog/SyncPasswordDialog2.a (II)Ljava/lang/String;
      // 159: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 15c: aload 0
      // 15d: bipush 0
      // 15e: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 161: ldc2_w 392410176539816794
      // 164: astore 29
      // 166: astore 28
      // 168: ldc2_w 392410176539816794
      // 16b: aload 28
      // 16d: aload 29
      // 16f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 172: pop
      // 173: goto 17a
      // 176: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 179: athrow
      // 17a: aload 0
      // 17b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17e: ldc2_w 249566416557987503
      // 181: astore 31
      // 183: astore 30
      // 185: ldc2_w 249566416557987503
      // 188: aload 30
      // 18a: aload 31
      // 18c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18f: pop
      // 190: goto 197
      // 193: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 3
      // 198: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19b: ldc2_w 203513045669525032
      // 19e: astore 33
      // 1a0: astore 32
      // 1a2: ldc2_w 203513045669525032
      // 1a5: aload 32
      // 1a7: aload 33
      // 1a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ac: pop
      // 1ad: goto 1b4
      // 1b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: goto 1d8
      // 1b7: astore 5
      // 1b9: aload 0
      // 1ba: new java/lang/StringBuilder
      // 1bd: dup
      // 1be: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c1: sipush 4173
      // 1c4: sipush -15995
      // 1c7: invokestatic com/finalshell/ui/dialog/SyncPasswordDialog2.a (II)Ljava/lang/String;
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: aload 5
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 1d8: goto 1fc
      // 1db: astore 4
      // 1dd: aload 0
      // 1de: new java/lang/StringBuilder
      // 1e1: dup
      // 1e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e5: sipush 4171
      // 1e8: sipush 26843
      // 1eb: invokestatic com/finalshell/ui/dialog/SyncPasswordDialog2.a (II)Ljava/lang/String;
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 4
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f9: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 1fc: return
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
      Object var2 = 240001478134891022L;
      ((JPasswordField)Ref.g(240001478134891022L, var2)).requestFocus();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4183) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 154;
               break;
            case 1:
               var10000 = 146;
               break;
            case 2:
               var10000 = 54;
               break;
            case 3:
               var10000 = 20;
               break;
            case 4:
               var10000 = 245;
               break;
            case 5:
               var10000 = 171;
               break;
            case 6:
               var10000 = 118;
               break;
            case 7:
               var10000 = 188;
               break;
            case 8:
               var10000 = 239;
               break;
            case 9:
               var10000 = 160;
               break;
            case 10:
               var10000 = 15;
               break;
            case 11:
               var10000 = 31;
               break;
            case 12:
               var10000 = 46;
               break;
            case 13:
               var10000 = 133;
               break;
            case 14:
               var10000 = 12;
               break;
            case 15:
               var10000 = 115;
               break;
            case 16:
               var10000 = 44;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 85;
               break;
            case 19:
               var10000 = 43;
               break;
            case 20:
               var10000 = 65;
               break;
            case 21:
               var10000 = 100;
               break;
            case 22:
               var10000 = 19;
               break;
            case 23:
               var10000 = 201;
               break;
            case 24:
               var10000 = 151;
               break;
            case 25:
               var10000 = 192;
               break;
            case 26:
               var10000 = 59;
               break;
            case 27:
               var10000 = 159;
               break;
            case 28:
               var10000 = 137;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 37;
               break;
            case 31:
               var10000 = 255;
               break;
            case 32:
               var10000 = 62;
               break;
            case 33:
               var10000 = 47;
               break;
            case 34:
               var10000 = 198;
               break;
            case 35:
               var10000 = 216;
               break;
            case 36:
               var10000 = 140;
               break;
            case 37:
               var10000 = 127;
               break;
            case 38:
               var10000 = 204;
               break;
            case 39:
               var10000 = 2;
               break;
            case 40:
               var10000 = 211;
               break;
            case 41:
               var10000 = 248;
               break;
            case 42:
               var10000 = 158;
               break;
            case 43:
               var10000 = 144;
               break;
            case 44:
               var10000 = 208;
               break;
            case 45:
               var10000 = 194;
               break;
            case 46:
               var10000 = 28;
               break;
            case 47:
               var10000 = 121;
               break;
            case 48:
               var10000 = 162;
               break;
            case 49:
               var10000 = 174;
               break;
            case 50:
               var10000 = 91;
               break;
            case 51:
               var10000 = 167;
               break;
            case 52:
               var10000 = 186;
               break;
            case 53:
               var10000 = 114;
               break;
            case 54:
               var10000 = 24;
               break;
            case 55:
               var10000 = 61;
               break;
            case 56:
               var10000 = 110;
               break;
            case 57:
               var10000 = 80;
               break;
            case 58:
               var10000 = 36;
               break;
            case 59:
               var10000 = 99;
               break;
            case 60:
               var10000 = 181;
               break;
            case 61:
               var10000 = 141;
               break;
            case 62:
               var10000 = 213;
               break;
            case 63:
               var10000 = 153;
               break;
            case 64:
               var10000 = 132;
               break;
            case 65:
               var10000 = 75;
               break;
            case 66:
               var10000 = 7;
               break;
            case 67:
               var10000 = 60;
               break;
            case 68:
               var10000 = 250;
               break;
            case 69:
               var10000 = 102;
               break;
            case 70:
               var10000 = 200;
               break;
            case 71:
               var10000 = 71;
               break;
            case 72:
               var10000 = 134;
               break;
            case 73:
               var10000 = 34;
               break;
            case 74:
               var10000 = 217;
               break;
            case 75:
               var10000 = 58;
               break;
            case 76:
               var10000 = 235;
               break;
            case 77:
               var10000 = 119;
               break;
            case 78:
               var10000 = 48;
               break;
            case 79:
               var10000 = 251;
               break;
            case 80:
               var10000 = 83;
               break;
            case 81:
               var10000 = 223;
               break;
            case 82:
               var10000 = 1;
               break;
            case 83:
               var10000 = 252;
               break;
            case 84:
               var10000 = 215;
               break;
            case 85:
               var10000 = 49;
               break;
            case 86:
               var10000 = 22;
               break;
            case 87:
               var10000 = 57;
               break;
            case 88:
               var10000 = 234;
               break;
            case 89:
               var10000 = 116;
               break;
            case 90:
               var10000 = 111;
               break;
            case 91:
               var10000 = 33;
               break;
            case 92:
               var10000 = 23;
               break;
            case 93:
               var10000 = 238;
               break;
            case 94:
               var10000 = 164;
               break;
            case 95:
               var10000 = 143;
               break;
            case 96:
               var10000 = 230;
               break;
            case 97:
               var10000 = 195;
               break;
            case 98:
               var10000 = 98;
               break;
            case 99:
               var10000 = 232;
               break;
            case 100:
               var10000 = 180;
               break;
            case 101:
               var10000 = 148;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 97;
               break;
            case 104:
               var10000 = 177;
               break;
            case 105:
               var10000 = 92;
               break;
            case 106:
               var10000 = 185;
               break;
            case 107:
               var10000 = 112;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 3;
               break;
            case 110:
               var10000 = 107;
               break;
            case 111:
               var10000 = 253;
               break;
            case 112:
               var10000 = 170;
               break;
            case 113:
               var10000 = 182;
               break;
            case 114:
               var10000 = 240;
               break;
            case 115:
               var10000 = 70;
               break;
            case 116:
               var10000 = 205;
               break;
            case 117:
               var10000 = 32;
               break;
            case 118:
               var10000 = 72;
               break;
            case 119:
               var10000 = 106;
               break;
            case 120:
               var10000 = 93;
               break;
            case 121:
               var10000 = 79;
               break;
            case 122:
               var10000 = 136;
               break;
            case 123:
               var10000 = 149;
               break;
            case 124:
               var10000 = 222;
               break;
            case 125:
               var10000 = 244;
               break;
            case 126:
               var10000 = 8;
               break;
            case 127:
               var10000 = 87;
               break;
            case 128:
               var10000 = 249;
               break;
            case 129:
               var10000 = 175;
               break;
            case 130:
               var10000 = 178;
               break;
            case 131:
               var10000 = 199;
               break;
            case 132:
               var10000 = 51;
               break;
            case 133:
               var10000 = 130;
               break;
            case 134:
               var10000 = 161;
               break;
            case 135:
               var10000 = 113;
               break;
            case 136:
               var10000 = 220;
               break;
            case 137:
               var10000 = 226;
               break;
            case 138:
               var10000 = 152;
               break;
            case 139:
               var10000 = 147;
               break;
            case 140:
               var10000 = 66;
               break;
            case 141:
               var10000 = 122;
               break;
            case 142:
               var10000 = 89;
               break;
            case 143:
               var10000 = 39;
               break;
            case 144:
               var10000 = 206;
               break;
            case 145:
               var10000 = 247;
               break;
            case 146:
               var10000 = 225;
               break;
            case 147:
               var10000 = 21;
               break;
            case 148:
               var10000 = 25;
               break;
            case 149:
               var10000 = 50;
               break;
            case 150:
               var10000 = 187;
               break;
            case 151:
               var10000 = 69;
               break;
            case 152:
               var10000 = 117;
               break;
            case 153:
               var10000 = 184;
               break;
            case 154:
               var10000 = 56;
               break;
            case 155:
               var10000 = 129;
               break;
            case 156:
               var10000 = 6;
               break;
            case 157:
               var10000 = 123;
               break;
            case 158:
               var10000 = 183;
               break;
            case 159:
               var10000 = 202;
               break;
            case 160:
               var10000 = 176;
               break;
            case 161:
               var10000 = 166;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 55;
               break;
            case 164:
               var10000 = 67;
               break;
            case 165:
               var10000 = 233;
               break;
            case 166:
               var10000 = 231;
               break;
            case 167:
               var10000 = 224;
               break;
            case 168:
               var10000 = 45;
               break;
            case 169:
               var10000 = 64;
               break;
            case 170:
               var10000 = 76;
               break;
            case 171:
               var10000 = 229;
               break;
            case 172:
               var10000 = 131;
               break;
            case 173:
               var10000 = 13;
               break;
            case 174:
               var10000 = 42;
               break;
            case 175:
               var10000 = 207;
               break;
            case 176:
               var10000 = 9;
               break;
            case 177:
               var10000 = 142;
               break;
            case 178:
               var10000 = 169;
               break;
            case 179:
               var10000 = 193;
               break;
            case 180:
               var10000 = 163;
               break;
            case 181:
               var10000 = 218;
               break;
            case 182:
               var10000 = 191;
               break;
            case 183:
               var10000 = 139;
               break;
            case 184:
               var10000 = 165;
               break;
            case 185:
               var10000 = 246;
               break;
            case 186:
               var10000 = 63;
               break;
            case 187:
               var10000 = 237;
               break;
            case 188:
               var10000 = 68;
               break;
            case 189:
               var10000 = 52;
               break;
            case 190:
               var10000 = 0;
               break;
            case 191:
               var10000 = 126;
               break;
            case 192:
               var10000 = 128;
               break;
            case 193:
               var10000 = 124;
               break;
            case 194:
               var10000 = 88;
               break;
            case 195:
               var10000 = 17;
               break;
            case 196:
               var10000 = 172;
               break;
            case 197:
               var10000 = 40;
               break;
            case 198:
               var10000 = 81;
               break;
            case 199:
               var10000 = 145;
               break;
            case 200:
               var10000 = 84;
               break;
            case 201:
               var10000 = 203;
               break;
            case 202:
               var10000 = 214;
               break;
            case 203:
               var10000 = 104;
               break;
            case 204:
               var10000 = 157;
               break;
            case 205:
               var10000 = 29;
               break;
            case 206:
               var10000 = 241;
               break;
            case 207:
               var10000 = 101;
               break;
            case 208:
               var10000 = 77;
               break;
            case 209:
               var10000 = 108;
               break;
            case 210:
               var10000 = 190;
               break;
            case 211:
               var10000 = 120;
               break;
            case 212:
               var10000 = 78;
               break;
            case 213:
               var10000 = 53;
               break;
            case 214:
               var10000 = 196;
               break;
            case 215:
               var10000 = 4;
               break;
            case 216:
               var10000 = 95;
               break;
            case 217:
               var10000 = 11;
               break;
            case 218:
               var10000 = 156;
               break;
            case 219:
               var10000 = 135;
               break;
            case 220:
               var10000 = 150;
               break;
            case 221:
               var10000 = 26;
               break;
            case 222:
               var10000 = 14;
               break;
            case 223:
               var10000 = 227;
               break;
            case 224:
               var10000 = 125;
               break;
            case 225:
               var10000 = 155;
               break;
            case 226:
               var10000 = 16;
               break;
            case 227:
               var10000 = 212;
               break;
            case 228:
               var10000 = 189;
               break;
            case 229:
               var10000 = 86;
               break;
            case 230:
               var10000 = 35;
               break;
            case 231:
               var10000 = 221;
               break;
            case 232:
               var10000 = 210;
               break;
            case 233:
               var10000 = 41;
               break;
            case 234:
               var10000 = 30;
               break;
            case 235:
               var10000 = 94;
               break;
            case 236:
               var10000 = 27;
               break;
            case 237:
               var10000 = 197;
               break;
            case 238:
               var10000 = 243;
               break;
            case 239:
               var10000 = 103;
               break;
            case 240:
               var10000 = 109;
               break;
            case 241:
               var10000 = 209;
               break;
            case 242:
               var10000 = 38;
               break;
            case 243:
               var10000 = 138;
               break;
            case 244:
               var10000 = 82;
               break;
            case 245:
               var10000 = 5;
               break;
            case 246:
               var10000 = 73;
               break;
            case 247:
               var10000 = 105;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 90;
               break;
            case 250:
               var10000 = 173;
               break;
            case 251:
               var10000 = 236;
               break;
            case 252:
               var10000 = 96;
               break;
            case 253:
               var10000 = 168;
               break;
            case 254:
               var10000 = 254;
               break;
            default:
               var10000 = 242;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24440;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[32];
      int var11 = 0;
      String var10 = "謇翧抅勞\u000eC(CÝp/ÅÒÍ@£\u007f^ø\u0002磌寝\u0012}èØ¨\u0001\u0090Z£8®6Ï\u0083Chß>\u008e\u0004Ëõ\u009dì$夺杛改宼磱含早室硖些哹\u0082來滭竩呥歱朲刷嚬乨癮敇掫¤廑尕枿杄敟掇酆斒亘俅l\nà\u0007ýÎN-\u0085«Äe\u0004哤欄寋硖'嬄碂彇頔叡咓妯尩凞宀殢ð敾寱\u0087閍廣臌屮\u0002侢I帻謲í~俉乏仍í庘丞叟呐父比家筻[\n®d4¢w ¢\u001a S\u0016¸8\u0007·½'ã6\u001c\u00944²¢\u0087³±êòsa7\u009f\u0006详羔咥歊宎碯\u0013凸丑謅夷鞸覮辕儛吮梁宐碑扯叭维縳咕歍`\u0012讅搬侩症丝饭毌哿殈剳复厷戫釾翅嬜砆\u00ad\u0011£\u009bLëÒø\u008bDa)ôÜUÁk±=\u0005\u0091b.ÿß\b弮飆厡哹姇准孽殥\u000eD\u0097£*lÑF\r½»\u00ad\u0000\u009f\u0017\b录頝収咂専冩寨歈\u0004ïj\u0019\u001f\u0002号洆\u0007迯兢密碚人乜脞\u0018呚毁嬜磮講奷嗿伸寂Q丷姃敎沫扑嚵«升聐醼早譇羄³\u0006閶幄膩峵ñ修\u0006醟姎輈儎磿讂\u000b2v§à\u0005èå\u0015êtO\u0005譖罛妎跳½\u0016Ù÷+N8\u0018SÑ\nhö-út¸Ï\u008b=_\u0098² \u0005诫義夹趭K\u001e$L¯Qí¾vâ«\u0014oç\u0097ëì\b\u0095G\u0094\u0003§ü¯(+5*\n\u0099¸";
      int var12 = "謇翧抅勞\u000eC(CÝp/ÅÒÍ@£\u007f^ø\u0002磌寝\u0012}èØ¨\u0001\u0090Z£8®6Ï\u0083Chß>\u008e\u0004Ëõ\u009dì$夺杛改宼磱含早室硖些哹\u0082來滭竩呥歱朲刷嚬乨癮敇掫¤廑尕枿杄敟掇酆斒亘俅l\nà\u0007ýÎN-\u0085«Äe\u0004哤欄寋硖'嬄碂彇頔叡咓妯尩凞宀殢ð敾寱\u0087閍廣臌屮\u0002侢I帻謲í~俉乏仍í庘丞叟呐父比家筻[\n®d4¢w ¢\u001a S\u0016¸8\u0007·½'ã6\u001c\u00944²¢\u0087³±êòsa7\u009f\u0006详羔咥歊宎碯\u0013凸丑謅夷鞸覮辕儛吮梁宐碑扯叭维縳咕歍`\u0012讅搬侩症丝饭毌哿殈剳复厷戫釾翅嬜砆\u00ad\u0011£\u009bLëÒø\u008bDa)ôÜUÁk±=\u0005\u0091b.ÿß\b弮飆厡哹姇准孽殥\u000eD\u0097£*lÑF\r½»\u00ad\u0000\u009f\u0017\b录頝収咂専冩寨歈\u0004ïj\u0019\u001f\u0002号洆\u0007迯兢密碚人乜脞\u0018呚毁嬜磮講奷嗿伸寂Q丷姃敎沫扑嚵«升聐醼早譇羄³\u0006閶幄膩峵ñ修\u0006醟姎輈儎磿讂\u000b2v§à\u0005èå\u0015êtO\u0005譖罛妎跳½\u0016Ù÷+N8\u0018SÑ\nhö-út¸Ï\u008b=_\u0098² \u0005诫義夹趭K\u001e$L¯Qí¾vâ«\u0014oç\u0097ëì\b\u0095G\u0094\u0003§ü¯(+5*\n\u0099¸"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 75;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 113;
                        break;
                     case 1:
                        var65 = 112;
                        break;
                     case 2:
                        var65 = 16;
                        break;
                     case 3:
                        var65 = 50;
                        break;
                     case 4:
                        var65 = 81;
                        break;
                     case 5:
                        var65 = 74;
                        break;
                     default:
                        var65 = 25;
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
                     b = new String[32];
                     long var0 = 1331640820791812469L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "è\u0088E>ÿ°pÂ0)\u0082Ö\u009f\u009d:\u0018";
                     int var5 = "è\u0088E>ÿ°pÂ0)\u0082Ö\u009f\u009d:\u0018".length();
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
                                    c = var6;
                                    d = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "}¸=ó\u009c)¿Rä*v}ý¤÷S";
                                 var5 = "}¸=ó\u009c)¿Rä*v}ý¤÷S".length();
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

                  var10 = "BÿøïÌðÀÍ\u0080\u0090@cK¾ ÖÜ\u0006弮頼匩吮攉孺";
                  var12 = "BÿøïÌðÀÍ\u0080\u0090@cK¾ ÖÜ\u0006弮頼匩吮攉孺".length();
                  var9 = 17;
                  var17 = -1;
            }

            var10000 = 102;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





