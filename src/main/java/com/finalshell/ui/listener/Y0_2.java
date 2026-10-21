package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.EditDialog;
import com.finalshell.ui.model.BS;
import com.finalshell.ui.panel.AccelerateRdpHelpPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Y0_2 implements ActionListener {
   final boolean z;
   final BS v;
   final AccelerateRdpHelpPanel J;
   final EditDialog r;
   public static String a;

   Y0_2(EditDialog var1, boolean var2, BS var3, AccelerateRdpHelpPanel var4) {
      this.r = var1;
      this.z = var2;
      this.v = var3;
      this.J = var4;
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/AccelerateRdpHelpPanel.w ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: ldc2_w 540754593665597944
      // 008: astore 8
      // 00a: ldc2_w 540754593665597944
      // 00d: aload 8
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: aload 0
      // 013: ldc2_w 540754593665597944
      // 016: astore 10
      // 018: ldc2_w 540754593665597944
      // 01b: aload 10
      // 01d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 020: ldc2_w 254319470073880893
      // 023: astore 12
      // 025: ldc2_w 254319470073880893
      // 028: aload 12
      // 02a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02d: checkcast javax/swing/JTextField
      // 030: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 033: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 036: ldc2_w 385521960180977175
      // 039: astore 15
      // 03b: astore 14
      // 03d: ldc2_w 385521960180977175
      // 040: aload 14
      // 042: aload 15
      // 044: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 047: pop
      // 048: goto 04f
      // 04b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 0
      // 050: ldc2_w 540754593665597944
      // 053: astore 16
      // 055: ldc2_w 540754593665597944
      // 058: aload 16
      // 05a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05d: aload 0
      // 05e: ldc2_w 540754593665597944
      // 061: astore 18
      // 063: ldc2_w 540754593665597944
      // 066: aload 18
      // 068: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06b: ldc2_w 276801770487614396
      // 06e: astore 20
      // 070: ldc2_w 276801770487614396
      // 073: aload 20
      // 075: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 078: checkcast javax/swing/JTextField
      // 07b: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 07e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 081: ldc2_w 555259152600060646
      // 084: astore 23
      // 086: astore 22
      // 088: ldc2_w 555259152600060646
      // 08b: aload 22
      // 08d: aload 23
      // 08f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 092: pop
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: ldc2_w 540754593665597944
      // 09e: astore 24
      // 0a0: ldc2_w 540754593665597944
      // 0a3: aload 24
      // 0a5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a8: aload 0
      // 0a9: ldc2_w 540754593665597944
      // 0ac: astore 26
      // 0ae: ldc2_w 540754593665597944
      // 0b1: aload 26
      // 0b3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b6: ldc2_w 121010850045535247
      // 0b9: astore 28
      // 0bb: ldc2_w 121010850045535247
      // 0be: aload 28
      // 0c0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c3: checkcast javax/swing/JTextField
      // 0c6: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0c9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0cc: ldc2_w 555259152600060646
      // 0cf: astore 31
      // 0d1: astore 30
      // 0d3: ldc2_w 555259152600060646
      // 0d6: aload 30
      // 0d8: aload 31
      // 0da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0dd: pop
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: ldc2_w 540754593665597944
      // 0e9: astore 32
      // 0eb: ldc2_w 540754593665597944
      // 0ee: aload 32
      // 0f0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f3: aload 0
      // 0f4: ldc2_w 540754593665597944
      // 0f7: astore 34
      // 0f9: ldc2_w 540754593665597944
      // 0fc: aload 34
      // 0fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 101: ldc2_w 289370932320267549
      // 104: astore 36
      // 106: ldc2_w 289370932320267549
      // 109: aload 36
      // 10b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10e: checkcast javax/swing/JTextField
      // 111: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 114: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 117: ldc2_w 621601386232284400
      // 11a: astore 39
      // 11c: astore 38
      // 11e: ldc2_w 621601386232284400
      // 121: aload 38
      // 123: aload 39
      // 125: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 128: pop
      // 129: goto 130
      // 12c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 0
      // 131: ldc2_w 540754593665597944
      // 134: astore 40
      // 136: ldc2_w 540754593665597944
      // 139: aload 40
      // 13b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13e: ldc2_w 254319470073880893
      // 141: astore 42
      // 143: ldc2_w 254319470073880893
      // 146: aload 42
      // 148: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14b: checkcast javax/swing/JTextField
      // 14e: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 151: astore 3
      // 152: aload 0
      // 153: ldc2_w 540754593665597944
      // 156: astore 44
      // 158: ldc2_w 540754593665597944
      // 15b: aload 44
      // 15d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 160: ldc2_w 289370932320267549
      // 163: astore 46
      // 165: ldc2_w 289370932320267549
      // 168: aload 46
      // 16a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 16d: checkcast javax/swing/JTextField
      // 170: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 173: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 176: astore 4
      // 178: aload 0
      // 179: ldc2_w 540754593665597944
      // 17c: astore 48
      // 17e: ldc2_w 540754593665597944
      // 181: aload 48
      // 183: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 186: ldc2_w 276801770487614396
      // 189: astore 50
      // 18b: ldc2_w 276801770487614396
      // 18e: aload 50
      // 190: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 193: checkcast javax/swing/JTextField
      // 196: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 199: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 19c: istore 5
      // 19e: aload 0
      // 19f: ldc2_w 540754593665597944
      // 1a2: astore 52
      // 1a4: ldc2_w 540754593665597944
      // 1a7: aload 52
      // 1a9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ac: ldc2_w 121010850045535247
      // 1af: astore 54
      // 1b1: ldc2_w 121010850045535247
      // 1b4: aload 54
      // 1b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b9: checkcast javax/swing/JTextField
      // 1bc: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 1bf: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1c2: istore 6
      // 1c4: new com/finalshell/ui/model/BS
      // 1c7: dup
      // 1c8: invokespecial com/finalshell/ui/model/BS.<init> ()V
      // 1cb: astore 7
      // 1cd: aload 7
      // 1cf: aload 3
      // 1d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d3: ldc2_w 166310668295903668
      // 1d6: astore 57
      // 1d8: astore 56
      // 1da: ldc2_w 166310668295903668
      // 1dd: aload 56
      // 1df: aload 57
      // 1e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e4: pop
      // 1e5: goto 1ec
      // 1e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 7
      // 1ee: iload 5
      // 1f0: ldc2_w 152188236116144859
      // 1f3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1f6: dup_x2
      // 1f7: pop
      // 1f8: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 1fb: aload 7
      // 1fd: aload 4
      // 1ff: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 202: ldc2_w 553451711596696856
      // 205: astore 59
      // 207: astore 58
      // 209: ldc2_w 553451711596696856
      // 20c: aload 58
      // 20e: aload 59
      // 210: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 213: pop
      // 214: goto 21b
      // 217: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: aload 7
      // 21d: iload 6
      // 21f: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 222: ldc2_w 372592912012355976
      // 225: astore 61
      // 227: astore 60
      // 229: ldc2_w 372592912012355976
      // 22c: aload 60
      // 22e: aload 61
      // 230: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 233: pop
      // 234: goto 23b
      // 237: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: aload 2
      // 23c: ifnonnull 2ab
      // 23f: aload 0
      // 240: ldc2_w 272591222950464746
      // 243: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 246: swap
      // 247: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 24a: ifne 2af
      // 24d: goto 254
      // 250: invokestatic com/finalshell/ui/listener/Y0_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 257: ldc2_w 270389152141252877
      // 25a: astore 62
      // 25c: ldc2_w 270389152141252877
      // 25f: aload 62
      // 261: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 264: goto 26b
      // 267: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26e: ldc2_w 132698234263882391
      // 271: astore 65
      // 273: astore 64
      // 275: ldc2_w 132698234263882391
      // 278: aload 64
      // 27a: aload 65
      // 27c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27f: goto 286
      // 282: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 285: athrow
      // 286: aload 7
      // 288: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 28b: ldc2_w 225574092428051801
      // 28e: astore 67
      // 290: astore 66
      // 292: ldc2_w 225574092428051801
      // 295: aload 66
      // 297: aload 67
      // 299: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29c: pop
      // 29d: goto 2a4
      // 2a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/ui/listener/Y0_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: aload 2
      // 2ac: ifnull 314
      // 2af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2b2: ldc2_w 270389152141252877
      // 2b5: astore 68
      // 2b7: ldc2_w 270389152141252877
      // 2ba: aload 68
      // 2bc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2bf: goto 2c6
      // 2c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c5: athrow
      // 2c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c9: ldc2_w 132698234263882391
      // 2cc: astore 71
      // 2ce: astore 70
      // 2d0: ldc2_w 132698234263882391
      // 2d3: aload 70
      // 2d5: aload 71
      // 2d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2da: goto 2e1
      // 2dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e0: athrow
      // 2e1: aload 0
      // 2e2: ldc2_w 381430570481616002
      // 2e5: astore 72
      // 2e7: ldc2_w 381430570481616002
      // 2ea: aload 72
      // 2ec: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2ef: aload 7
      // 2f1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 2f4: ldc2_w 269449339994578410
      // 2f7: astore 75
      // 2f9: astore 74
      // 2fb: ldc2_w 269449339994578410
      // 2fe: aload 74
      // 300: aload 75
      // 302: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 305: pop
      // 306: goto 30d
      // 309: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 30c: athrow
      // 30d: goto 314
      // 310: invokestatic com/finalshell/ui/listener/Y0_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: aload 0
      // 315: ldc2_w 440638768576455006
      // 318: astore 76
      // 31a: ldc2_w 440638768576455006
      // 31d: aload 76
      // 31f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 322: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 325: ldc2_w 592320200778148842
      // 328: astore 79
      // 32a: astore 78
      // 32c: ldc2_w 592320200778148842
      // 32f: aload 78
      // 331: aload 79
      // 333: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 336: pop
      // 337: goto 33e
      // 33a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33d: athrow
      // 33e: aload 0
      // 33f: ldc2_w 440638768576455006
      // 342: astore 80
      // 344: ldc2_w 440638768576455006
      // 347: aload 80
      // 349: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 34c: aload 7
      // 34e: ldc2_w 512189539626964799
      // 351: astore 82
      // 353: ldc2_w 512189539626964799
      // 356: aload 82
      // 358: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 35b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 35e: ldc2_w 631650601550351677
      // 361: astore 85
      // 363: astore 84
      // 365: ldc2_w 631650601550351677
      // 368: aload 84
      // 36a: aload 85
      // 36c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36f: pop
      // 370: goto 377
      // 373: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 376: athrow
      // 377: aload 0
      // 378: ldc2_w 540754593665597944
      // 37b: astore 86
      // 37d: ldc2_w 540754593665597944
      // 380: aload 86
      // 382: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 385: checkcast com/finalshell/ui/dialog/EditDialog
      // 388: bipush 0
      // 389: invokevirtual com/finalshell/ui/dialog/EditDialog.setVisible (Z)V
      // 38c: goto 3ac
      // 38f: astore 3
      // 390: aload 0
      // 391: ldc2_w 440638768576455006
      // 394: astore 88
      // 396: ldc2_w 440638768576455006
      // 399: aload 88
      // 39b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 39e: checkcast com/finalshell/ui/panel/AccelerateRdpHelpPanel
      // 3a1: aload 3
      // 3a2: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 3a5: getstatic com/finalshell/ui/listener/Y0_2.a Ljava/lang/String;
      // 3a8: bipush 2
      // 3a9: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
      // 3ac: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "淒怟".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 82;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      } else {
         var6 = 82;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 8;
               break;
            case 1:
               var23 = 34;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 83;
               break;
            case 4:
               var23 = 9;
               break;
            case 5:
               var23 = 105;
               break;
            default:
               var23 = 80;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





