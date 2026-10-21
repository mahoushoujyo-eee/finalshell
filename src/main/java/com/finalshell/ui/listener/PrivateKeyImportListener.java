package com.finalshell.ui.listener;

import com.finalshell.ui.dialog.ImportPrivateKeyDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrivateKeyImportListener implements ActionListener {
   public final boolean f;
   public final ImportPrivateKeyDialog F;
   public static String[] a;
   public static String[] b;
   public static long c;

   public PrivateKeyImportListener(ImportPrivateKeyDialog var1, boolean var2) {
      this.F = var1;
      this.f = var2;
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
      // 000: invokestatic com/finalshell/ui/panel/ImportPanel.j ()[Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 603606008534273859
      // 007: astore 14
      // 009: ldc2_w 603606008534273859
      // 00c: aload 14
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: ldc2_w 482002669080232033
      // 014: astore 16
      // 016: ldc2_w 482002669080232033
      // 019: aload 16
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 021: ldc2_w 139927727350187157
      // 024: astore 19
      // 026: astore 18
      // 028: ldc2_w 139927727350187157
      // 02b: aload 18
      // 02d: aload 19
      // 02f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 032: pop
      // 033: goto 03a
      // 036: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: ldc2_w 603606008534273859
      // 03e: astore 20
      // 040: ldc2_w 603606008534273859
      // 043: aload 20
      // 045: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 048: ldc2_w 482002669080232033
      // 04b: astore 22
      // 04d: ldc2_w 482002669080232033
      // 050: aload 22
      // 052: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 055: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 058: ldc2_w 251376083349311680
      // 05b: astore 25
      // 05d: astore 24
      // 05f: ldc2_w 251376083349311680
      // 062: aload 24
      // 064: aload 25
      // 066: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 069: checkcast javax/swing/JTextField
      // 06c: goto 073
      // 06f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 072: athrow
      // 073: astore 3
      // 074: aload 0
      // 075: ldc2_w 603606008534273859
      // 078: astore 26
      // 07a: ldc2_w 603606008534273859
      // 07d: aload 26
      // 07f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 082: ldc2_w 482002669080232033
      // 085: astore 28
      // 087: ldc2_w 482002669080232033
      // 08a: aload 28
      // 08c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 092: ldc2_w 619418841642223843
      // 095: astore 31
      // 097: astore 30
      // 099: ldc2_w 619418841642223843
      // 09c: aload 30
      // 09e: aload 31
      // 0a0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a3: checkcast javax/swing/JTextField
      // 0a6: goto 0ad
      // 0a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: astore 4
      // 0af: astore 2
      // 0b0: aload 0
      // 0b1: ldc2_w 603606008534273859
      // 0b4: astore 32
      // 0b6: ldc2_w 603606008534273859
      // 0b9: aload 32
      // 0bb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0be: ldc2_w 482002669080232033
      // 0c1: astore 34
      // 0c3: ldc2_w 482002669080232033
      // 0c6: aload 34
      // 0c8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0cb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ce: ldc2_w 536651445993482274
      // 0d1: astore 37
      // 0d3: astore 36
      // 0d5: ldc2_w 536651445993482274
      // 0d8: aload 36
      // 0da: aload 37
      // 0dc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0df: checkcast javax/swing/JPasswordField
      // 0e2: goto 0e9
      // 0e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: astore 5
      // 0eb: aload 3
      // 0ec: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 0ef: astore 6
      // 0f1: aload 0
      // 0f2: ldc2_w 615068421900999353
      // 0f5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0f8: swap
      // 0f9: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0fc: aload 2
      // 0fd: ifnull 19b
      // 100: ifne 137
      // 103: goto 10a
      // 106: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: ldc2_w 603606008534273859
      // 10e: astore 38
      // 110: ldc2_w 603606008534273859
      // 113: aload 38
      // 115: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 118: new com/finalshell/core/LN3
      // 11b: dup
      // 11c: invokespecial com/finalshell/core/LN3.<init> ()V
      // 11f: ldc2_w 207141121032052158
      // 122: astore 41
      // 124: astore 40
      // 126: ldc2_w 207141121032052158
      // 129: aload 40
      // 12b: aload 41
      // 12d: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 130: goto 137
      // 133: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: aload 0
      // 138: ldc2_w 603606008534273859
      // 13b: astore 42
      // 13d: ldc2_w 603606008534273859
      // 140: aload 42
      // 142: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 145: ldc2_w 482002669080232033
      // 148: astore 44
      // 14a: ldc2_w 482002669080232033
      // 14d: aload 44
      // 14f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 152: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 155: ldc2_w 619418841642223843
      // 158: astore 47
      // 15a: astore 46
      // 15c: ldc2_w 619418841642223843
      // 15f: aload 46
      // 161: aload 47
      // 163: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 166: checkcast javax/swing/JTextField
      // 169: goto 170
      // 16c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16f: athrow
      // 170: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 173: aload 2
      // 174: ifnull 1d1
      // 177: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 17a: ldc2_w 330094358428833085
      // 17d: astore 48
      // 17f: ldc2_w 330094358428833085
      // 182: aload 48
      // 184: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 187: checkcast java/lang/Boolean
      // 18a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 18d: goto 194
      // 190: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 193: athrow
      // 194: goto 19b
      // 197: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: ifeq 1c5
      // 19e: aload 0
      // 19f: ldc2_w 603606008534273859
      // 1a2: astore 50
      // 1a4: ldc2_w 603606008534273859
      // 1a7: aload 50
      // 1a9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ac: checkcast com/finalshell/ui/dialog/ImportPrivateKeyDialog
      // 1af: sipush 6373
      // 1b2: sipush 30939
      // 1b5: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 1b8: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 1bb: aload 4
      // 1bd: invokevirtual javax/swing/JTextField.requestFocus ()V
      // 1c0: return
      // 1c1: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: new java/lang/String
      // 1c8: dup
      // 1c9: aload 5
      // 1cb: invokevirtual javax/swing/JPasswordField.getPassword ()[C
      // 1ce: invokespecial java/lang/String.<init> ([C)V
      // 1d1: astore 7
      // 1d3: bipush 0
      // 1d4: istore 8
      // 1d6: ldc ""
      // 1d8: astore 9
      // 1da: aconst_null
      // 1db: astore 10
      // 1dd: aload 6
      // 1df: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e2: ldc2_w 330094358428833085
      // 1e5: astore 52
      // 1e7: ldc2_w 330094358428833085
      // 1ea: aload 52
      // 1ec: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ef: checkcast java/lang/Boolean
      // 1f2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f5: goto 1fc
      // 1f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: aload 2
      // 1fd: ifnull 2ab
      // 200: ifne 295
      // 203: goto 20a
      // 206: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 209: athrow
      // 20a: new java/io/File
      // 20d: dup
      // 20e: aload 6
      // 210: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 213: astore 11
      // 215: aload 6
      // 217: aload 2
      // 218: ifnull 276
      // 21b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 21e: ldc2_w 330094358428833085
      // 221: astore 54
      // 223: ldc2_w 330094358428833085
      // 226: aload 54
      // 228: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 22b: checkcast java/lang/Boolean
      // 22e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 231: goto 238
      // 234: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 237: athrow
      // 238: ifne 274
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 11
      // 244: invokevirtual java/io/File.length ()J
      // 247: getstatic com/finalshell/ui/listener/PrivateKey.c J
      // 24a: lcmp
      // 24b: aload 2
      // 24c: ifnull 261
      // 24f: goto 256
      // 252: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 255: athrow
      // 256: ifle 274
      // 259: goto 260
      // 25c: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: bipush 0
      // 261: istore 8
      // 263: new java/lang/Exception
      // 266: dup
      // 267: sipush 6371
      // 26a: sipush 14933
      // 26d: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 270: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 273: athrow
      // 274: aload 6
      // 276: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 279: ldc2_w 496335176330579488
      // 27c: astore 56
      // 27e: ldc2_w 496335176330579488
      // 281: aload 56
      // 283: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 286: checkcast com/finalshell/core/PW3
      // 289: goto 290
      // 28c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28f: athrow
      // 290: astore 10
      // 292: goto 2f9
      // 295: aload 0
      // 296: aload 2
      // 297: ifnull 2af
      // 29a: ldc2_w 615068421900999353
      // 29d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2a0: swap
      // 2a1: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: ifeq 2e8
      // 2ae: aload 0
      // 2af: ldc2_w 603606008534273859
      // 2b2: astore 58
      // 2b4: ldc2_w 603606008534273859
      // 2b7: aload 58
      // 2b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2bc: ldc2_w 207141121032052158
      // 2bf: astore 60
      // 2c1: ldc2_w 207141121032052158
      // 2c4: aload 60
      // 2c6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2c9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2cc: ldc2_w 181303880124437871
      // 2cf: astore 62
      // 2d1: ldc2_w 181303880124437871
      // 2d4: aload 62
      // 2d6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d9: checkcast com/finalshell/core/PW3
      // 2dc: goto 2e3
      // 2df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e2: athrow
      // 2e3: astore 10
      // 2e5: goto 2f9
      // 2e8: new java/lang/Exception
      // 2eb: dup
      // 2ec: sipush 6368
      // 2ef: sipush 7559
      // 2f2: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 2f5: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 2f8: athrow
      // 2f9: aconst_null
      // 2fa: astore 11
      // 2fc: aload 10
      // 2fe: invokeinterface com/finalshell/core/AB_2.f ()Z 1
      // 303: aload 2
      // 304: ifnull 39d
      // 307: ifeq 37e
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: aload 7
      // 313: aload 2
      // 314: ifnull 34b
      // 317: goto 31e
      // 31a: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: ifnull 350
      // 321: goto 328
      // 324: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 327: athrow
      // 328: aload 7
      // 32a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 32d: ldc2_w 556691693894836467
      // 330: astore 64
      // 332: ldc2_w 556691693894836467
      // 335: aload 64
      // 337: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 33a: checkcast java/lang/String
      // 33d: goto 344
      // 340: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 343: athrow
      // 344: goto 34b
      // 347: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 34e: astore 11
      // 350: aload 10
      // 352: aload 11
      // 354: invokeinterface com/finalshell/core/AB_2.M ([B)Z 2
      // 359: istore 8
      // 35b: aload 2
      // 35c: ifnull 37b
      // 35f: iload 8
      // 361: ifne 3d3
      // 364: goto 36b
      // 367: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36a: athrow
      // 36b: sipush 6374
      // 36e: sipush -18036
      // 371: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 374: astore 9
      // 376: aload 5
      // 378: invokevirtual javax/swing/JPasswordField.requestFocus ()V
      // 37b: goto 3d3
      // 37e: aload 7
      // 380: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 383: ldc2_w 330094358428833085
      // 386: astore 66
      // 388: ldc2_w 330094358428833085
      // 38b: aload 66
      // 38d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 390: checkcast java/lang/Boolean
      // 393: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 396: goto 39d
      // 399: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: aload 2
      // 39e: ifnull 3d1
      // 3a1: ifne 3c9
      // 3a4: goto 3ab
      // 3a7: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3aa: athrow
      // 3ab: bipush 0
      // 3ac: istore 8
      // 3ae: sipush 6372
      // 3b1: sipush 29416
      // 3b4: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 3b7: astore 9
      // 3b9: aload 5
      // 3bb: ldc ""
      // 3bd: invokevirtual javax/swing/JPasswordField.setText (Ljava/lang/String;)V
      // 3c0: aload 5
      // 3c2: invokevirtual javax/swing/JPasswordField.requestFocus ()V
      // 3c5: aload 2
      // 3c6: ifnonnull 3d3
      // 3c9: bipush 1
      // 3ca: goto 3d1
      // 3cd: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d0: athrow
      // 3d1: istore 8
      // 3d3: goto 40e
      // 3d6: astore 11
      // 3d8: bipush 0
      // 3d9: istore 8
      // 3db: aload 11
      // 3dd: invokevirtual java/lang/Exception.printStackTrace ()V
      // 3e0: aload 11
      // 3e2: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 3e5: astore 9
      // 3e7: aload 9
      // 3e9: sipush 6369
      // 3ec: sipush -7066
      // 3ef: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 3f2: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 3f5: aload 2
      // 3f6: ifnull 410
      // 3f9: ifeq 40e
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: sipush 6370
      // 406: sipush 22297
      // 409: invokestatic com/finalshell/ui/listener/PrivateKey.a (II)Ljava/lang/String;
      // 40c: astore 9
      // 40e: iload 8
      // 410: ifne 434
      // 413: aload 0
      // 414: ldc2_w 603606008534273859
      // 417: astore 68
      // 419: ldc2_w 603606008534273859
      // 41c: aload 68
      // 41e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 421: checkcast com/finalshell/ui/dialog/ImportPrivateKeyDialog
      // 424: aload 9
      // 426: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 429: aload 2
      // 42a: ifnonnull 6f5
      // 42d: goto 434
      // 430: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 433: athrow
      // 434: invokestatic java/lang/System.currentTimeMillis ()J
      // 437: lstore 11
      // 439: aload 0
      // 43a: ldc2_w 615068421900999353
      // 43d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 440: swap
      // 441: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 444: aload 2
      // 445: ifnull 50b
      // 448: ifne 504
      // 44b: goto 452
      // 44e: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 451: athrow
      // 452: aload 0
      // 453: ldc2_w 603606008534273859
      // 456: astore 70
      // 458: ldc2_w 603606008534273859
      // 45b: aload 70
      // 45d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 460: ldc2_w 207141121032052158
      // 463: astore 72
      // 465: ldc2_w 207141121032052158
      // 468: aload 72
      // 46a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 46d: lload 11
      // 46f: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 472: ldc2_w 632174181210947576
      // 475: astore 75
      // 477: astore 74
      // 479: ldc2_w 632174181210947576
      // 47c: aload 74
      // 47e: aload 75
      // 480: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 483: pop
      // 484: goto 48b
      // 487: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 48a: athrow
      // 48b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 48e: ldc2_w 270389152141252877
      // 491: astore 76
      // 493: ldc2_w 270389152141252877
      // 496: aload 76
      // 498: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 49b: goto 4a2
      // 49e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a1: athrow
      // 4a2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4a5: ldc2_w 306266403902896148
      // 4a8: astore 79
      // 4aa: astore 78
      // 4ac: ldc2_w 306266403902896148
      // 4af: aload 78
      // 4b1: aload 79
      // 4b3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b6: goto 4bd
      // 4b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bc: athrow
      // 4bd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4c0: ldc2_w 626356373183057367
      // 4c3: astore 81
      // 4c5: astore 80
      // 4c7: ldc2_w 626356373183057367
      // 4ca: aload 80
      // 4cc: aload 81
      // 4ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d1: checkcast java/util/ArrayList
      // 4d4: goto 4db
      // 4d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4da: athrow
      // 4db: aload 0
      // 4dc: ldc2_w 603606008534273859
      // 4df: astore 82
      // 4e1: ldc2_w 603606008534273859
      // 4e4: aload 82
      // 4e6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4e9: ldc2_w 207141121032052158
      // 4ec: astore 84
      // 4ee: ldc2_w 207141121032052158
      // 4f1: aload 84
      // 4f3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4f6: checkcast com/finalshell/core/LN3
      // 4f9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4fc: pop
      // 4fd: goto 504
      // 500: invokestatic com/finalshell/ui/listener/PrivateKey.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 503: athrow
      // 504: aload 6
      // 506: ldc ""
      // 508: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 50b: ifne 555
      // 50e: new java/io/File
      // 511: dup
      // 512: aload 6
      // 514: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 517: invokestatic org/apache/commons/io/FileUtils.readFileToByteArray (Ljava/io/File;)[B
      // 51a: astore 13
      // 51c: aload 0
      // 51d: ldc2_w 603606008534273859
      // 520: astore 86
      // 522: ldc2_w 603606008534273859
      // 525: aload 86
      // 527: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 52a: ldc2_w 207141121032052158
      // 52d: astore 88
      // 52f: ldc2_w 207141121032052158
      // 532: aload 88
      // 534: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 537: aload 13
      // 539: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 53c: ldc2_w 622750082590203090
      // 53f: astore 91
      // 541: astore 90
      // 543: ldc2_w 622750082590203090
      // 546: aload 90
      // 548: aload 91
      // 54a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 54d: pop
      // 54e: goto 555
      // 551: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 554: athrow
      // 555: aload 0
      // 556: ldc2_w 603606008534273859
      // 559: astore 92
      // 55b: ldc2_w 603606008534273859
      // 55e: aload 92
      // 560: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 563: ldc2_w 207141121032052158
      // 566: astore 94
      // 568: ldc2_w 207141121032052158
      // 56b: aload 94
      // 56d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 570: aload 4
      // 572: invokevirtual javax/swing/JTextField.getText ()Ljava/lang/String;
      // 575: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 578: ldc2_w 193904661956891993
      // 57b: astore 97
      // 57d: astore 96
      // 57f: ldc2_w 193904661956891993
      // 582: aload 96
      // 584: aload 97
      // 586: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 589: pop
      // 58a: goto 591
      // 58d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 590: athrow
      // 591: aload 0
      // 592: ldc2_w 603606008534273859
      // 595: astore 98
      // 597: ldc2_w 603606008534273859
      // 59a: aload 98
      // 59c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 59f: ldc2_w 207141121032052158
      // 5a2: astore 100
      // 5a4: ldc2_w 207141121032052158
      // 5a7: aload 100
      // 5a9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5ac: new java/lang/String
      // 5af: dup
      // 5b0: aload 5
      // 5b2: invokevirtual javax/swing/JPasswordField.getPassword ()[C
      // 5b5: invokespecial java/lang/String.<init> ([C)V
      // 5b8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5bb: ldc2_w 271672579734969828
      // 5be: astore 103
      // 5c0: astore 102
      // 5c2: ldc2_w 271672579734969828
      // 5c5: aload 102
      // 5c7: aload 103
      // 5c9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5cc: pop
      // 5cd: goto 5d4
      // 5d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d3: athrow
      // 5d4: aload 0
      // 5d5: ldc2_w 603606008534273859
      // 5d8: astore 104
      // 5da: ldc2_w 603606008534273859
      // 5dd: aload 104
      // 5df: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5e2: ldc2_w 207141121032052158
      // 5e5: astore 106
      // 5e7: ldc2_w 207141121032052158
      // 5ea: aload 106
      // 5ec: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5ef: lload 11
      // 5f1: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 5f4: ldc2_w 448034136929726083
      // 5f7: astore 109
      // 5f9: astore 108
      // 5fb: ldc2_w 448034136929726083
      // 5fe: aload 108
      // 600: aload 109
      // 602: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 605: pop
      // 606: goto 60d
      // 609: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 60c: athrow
      // 60d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 610: ldc2_w 270389152141252877
      // 613: astore 110
      // 615: ldc2_w 270389152141252877
      // 618: aload 110
      // 61a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 61d: goto 624
      // 620: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 623: athrow
      // 624: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 627: ldc2_w 578864097947885485
      // 62a: astore 113
      // 62c: astore 112
      // 62e: ldc2_w 578864097947885485
      // 631: aload 112
      // 633: aload 113
      // 635: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 638: pop
      // 639: goto 640
      // 63c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 63f: athrow
      // 640: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 643: ldc2_w 270389152141252877
      // 646: astore 114
      // 648: ldc2_w 270389152141252877
      // 64b: aload 114
      // 64d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 650: goto 657
      // 653: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 656: athrow
      // 657: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 65a: ldc2_w 612604310671515822
      // 65d: astore 117
      // 65f: astore 116
      // 661: ldc2_w 612604310671515822
      // 664: aload 116
      // 666: aload 117
      // 668: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 66b: goto 672
      // 66e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 671: athrow
      // 672: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 675: ldc2_w 200561288808923907
      // 678: astore 119
      // 67a: astore 118
      // 67c: ldc2_w 200561288808923907
      // 67f: aload 118
      // 681: aload 119
      // 683: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 686: pop
      // 687: goto 68e
      // 68a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 68d: athrow
      // 68e: new com/finalshell/core/Ty4
      // 691: dup
      // 692: ldc2_w 456349507517882113
      // 695: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 698: aconst_null
      // 699: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 69c: invokespecial com/finalshell/core/Ty4.<init> (I)V
      // 69f: astore 13
      // 6a1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6a4: ldc2_w 270389152141252877
      // 6a7: astore 120
      // 6a9: ldc2_w 270389152141252877
      // 6ac: aload 120
      // 6ae: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 6b1: goto 6b8
      // 6b4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6b7: athrow
      // 6b8: aload 13
      // 6ba: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6bd: ldc2_w 473928376202613579
      // 6c0: astore 123
      // 6c2: astore 122
      // 6c4: ldc2_w 473928376202613579
      // 6c7: aload 122
      // 6c9: aload 123
      // 6cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6ce: pop
      // 6cf: goto 6d6
      // 6d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6d5: athrow
      // 6d6: aload 0
      // 6d7: ldc2_w 603606008534273859
      // 6da: astore 124
      // 6dc: ldc2_w 603606008534273859
      // 6df: aload 124
      // 6e1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6e4: checkcast com/finalshell/ui/dialog/ImportPrivateKeyDialog
      // 6e7: bipush 0
      // 6e8: invokevirtual com/finalshell/ui/dialog/ImportPrivateKeyDialog.setVisible (Z)V
      // 6eb: goto 6f5
      // 6ee: astore 11
      // 6f0: aload 11
      // 6f2: invokevirtual java/io/IOException.printStackTrace ()V
      // 6f5: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 6368) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 235;
               break;
            case 1:
               var10000 = 90;
               break;
            case 2:
               var10000 = 29;
               break;
            case 3:
               var10000 = 55;
               break;
            case 4:
               var10000 = 218;
               break;
            case 5:
               var10000 = 87;
               break;
            case 6:
               var10000 = 132;
               break;
            case 7:
               var10000 = 219;
               break;
            case 8:
               var10000 = 197;
               break;
            case 9:
               var10000 = 16;
               break;
            case 10:
               var10000 = 252;
               break;
            case 11:
               var10000 = 95;
               break;
            case 12:
               var10000 = 5;
               break;
            case 13:
               var10000 = 129;
               break;
            case 14:
               var10000 = 144;
               break;
            case 15:
               var10000 = 42;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 192;
               break;
            case 18:
               var10000 = 62;
               break;
            case 19:
               var10000 = 141;
               break;
            case 20:
               var10000 = 139;
               break;
            case 21:
               var10000 = 41;
               break;
            case 22:
               var10000 = 204;
               break;
            case 23:
               var10000 = 194;
               break;
            case 24:
               var10000 = 124;
               break;
            case 25:
               var10000 = 10;
               break;
            case 26:
               var10000 = 239;
               break;
            case 27:
               var10000 = 11;
               break;
            case 28:
               var10000 = 233;
               break;
            case 29:
               var10000 = 20;
               break;
            case 30:
               var10000 = 172;
               break;
            case 31:
               var10000 = 116;
               break;
            case 32:
               var10000 = 9;
               break;
            case 33:
               var10000 = 93;
               break;
            case 34:
               var10000 = 119;
               break;
            case 35:
               var10000 = 28;
               break;
            case 36:
               var10000 = 39;
               break;
            case 37:
               var10000 = 57;
               break;
            case 38:
               var10000 = 27;
               break;
            case 39:
               var10000 = 146;
               break;
            case 40:
               var10000 = 249;
               break;
            case 41:
               var10000 = 196;
               break;
            case 42:
               var10000 = 17;
               break;
            case 43:
               var10000 = 120;
               break;
            case 44:
               var10000 = 22;
               break;
            case 45:
               var10000 = 243;
               break;
            case 46:
               var10000 = 97;
               break;
            case 47:
               var10000 = 2;
               break;
            case 48:
               var10000 = 185;
               break;
            case 49:
               var10000 = 37;
               break;
            case 50:
               var10000 = 45;
               break;
            case 51:
               var10000 = 117;
               break;
            case 52:
               var10000 = 134;
               break;
            case 53:
               var10000 = 38;
               break;
            case 54:
               var10000 = 193;
               break;
            case 55:
               var10000 = 215;
               break;
            case 56:
               var10000 = 234;
               break;
            case 57:
               var10000 = 165;
               break;
            case 58:
               var10000 = 138;
               break;
            case 59:
               var10000 = 75;
               break;
            case 60:
               var10000 = 143;
               break;
            case 61:
               var10000 = 189;
               break;
            case 62:
               var10000 = 118;
               break;
            case 63:
               var10000 = 255;
               break;
            case 64:
               var10000 = 68;
               break;
            case 65:
               var10000 = 167;
               break;
            case 66:
               var10000 = 173;
               break;
            case 67:
               var10000 = 12;
               break;
            case 68:
               var10000 = 14;
               break;
            case 69:
               var10000 = 170;
               break;
            case 70:
               var10000 = 47;
               break;
            case 71:
               var10000 = 53;
               break;
            case 72:
               var10000 = 171;
               break;
            case 73:
               var10000 = 36;
               break;
            case 74:
               var10000 = 102;
               break;
            case 75:
               var10000 = 227;
               break;
            case 76:
               var10000 = 83;
               break;
            case 77:
               var10000 = 153;
               break;
            case 78:
               var10000 = 18;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 105;
               break;
            case 81:
               var10000 = 109;
               break;
            case 82:
               var10000 = 220;
               break;
            case 83:
               var10000 = 147;
               break;
            case 84:
               var10000 = 187;
               break;
            case 85:
               var10000 = 77;
               break;
            case 86:
               var10000 = 199;
               break;
            case 87:
               var10000 = 115;
               break;
            case 88:
               var10000 = 149;
               break;
            case 89:
               var10000 = 19;
               break;
            case 90:
               var10000 = 225;
               break;
            case 91:
               var10000 = 126;
               break;
            case 92:
               var10000 = 156;
               break;
            case 93:
               var10000 = 127;
               break;
            case 94:
               var10000 = 174;
               break;
            case 95:
               var10000 = 175;
               break;
            case 96:
               var10000 = 152;
               break;
            case 97:
               var10000 = 101;
               break;
            case 98:
               var10000 = 176;
               break;
            case 99:
               var10000 = 81;
               break;
            case 100:
               var10000 = 67;
               break;
            case 101:
               var10000 = 35;
               break;
            case 102:
               var10000 = 182;
               break;
            case 103:
               var10000 = 251;
               break;
            case 104:
               var10000 = 89;
               break;
            case 105:
               var10000 = 229;
               break;
            case 106:
               var10000 = 91;
               break;
            case 107:
               var10000 = 43;
               break;
            case 108:
               var10000 = 76;
               break;
            case 109:
               var10000 = 52;
               break;
            case 110:
               var10000 = 86;
               break;
            case 111:
               var10000 = 248;
               break;
            case 112:
               var10000 = 164;
               break;
            case 113:
               var10000 = 70;
               break;
            case 114:
               var10000 = 163;
               break;
            case 115:
               var10000 = 108;
               break;
            case 116:
               var10000 = 157;
               break;
            case 117:
               var10000 = 223;
               break;
            case 118:
               var10000 = 0;
               break;
            case 119:
               var10000 = 33;
               break;
            case 120:
               var10000 = 222;
               break;
            case 121:
               var10000 = 212;
               break;
            case 122:
               var10000 = 106;
               break;
            case 123:
               var10000 = 84;
               break;
            case 124:
               var10000 = 92;
               break;
            case 125:
               var10000 = 188;
               break;
            case 126:
               var10000 = 50;
               break;
            case 127:
               var10000 = 142;
               break;
            case 128:
               var10000 = 64;
               break;
            case 129:
               var10000 = 216;
               break;
            case 130:
               var10000 = 26;
               break;
            case 131:
               var10000 = 80;
               break;
            case 132:
               var10000 = 54;
               break;
            case 133:
               var10000 = 104;
               break;
            case 134:
               var10000 = 178;
               break;
            case 135:
               var10000 = 7;
               break;
            case 136:
               var10000 = 113;
               break;
            case 137:
               var10000 = 99;
               break;
            case 138:
               var10000 = 253;
               break;
            case 139:
               var10000 = 179;
               break;
            case 140:
               var10000 = 145;
               break;
            case 141:
               var10000 = 60;
               break;
            case 142:
               var10000 = 98;
               break;
            case 143:
               var10000 = 245;
               break;
            case 144:
               var10000 = 205;
               break;
            case 145:
               var10000 = 131;
               break;
            case 146:
               var10000 = 34;
               break;
            case 147:
               var10000 = 242;
               break;
            case 148:
               var10000 = 150;
               break;
            case 149:
               var10000 = 56;
               break;
            case 150:
               var10000 = 1;
               break;
            case 151:
               var10000 = 177;
               break;
            case 152:
               var10000 = 186;
               break;
            case 153:
               var10000 = 48;
               break;
            case 154:
               var10000 = 151;
               break;
            case 155:
               var10000 = 23;
               break;
            case 156:
               var10000 = 137;
               break;
            case 157:
               var10000 = 250;
               break;
            case 158:
               var10000 = 180;
               break;
            case 159:
               var10000 = 210;
               break;
            case 160:
               var10000 = 240;
               break;
            case 161:
               var10000 = 247;
               break;
            case 162:
               var10000 = 15;
               break;
            case 163:
               var10000 = 183;
               break;
            case 164:
               var10000 = 66;
               break;
            case 165:
               var10000 = 58;
               break;
            case 166:
               var10000 = 190;
               break;
            case 167:
               var10000 = 72;
               break;
            case 168:
               var10000 = 121;
               break;
            case 169:
               var10000 = 61;
               break;
            case 170:
               var10000 = 158;
               break;
            case 171:
               var10000 = 228;
               break;
            case 172:
               var10000 = 140;
               break;
            case 173:
               var10000 = 154;
               break;
            case 174:
               var10000 = 30;
               break;
            case 175:
               var10000 = 69;
               break;
            case 176:
               var10000 = 169;
               break;
            case 177:
               var10000 = 237;
               break;
            case 178:
               var10000 = 155;
               break;
            case 179:
               var10000 = 217;
               break;
            case 180:
               var10000 = 59;
               break;
            case 181:
               var10000 = 221;
               break;
            case 182:
               var10000 = 191;
               break;
            case 183:
               var10000 = 195;
               break;
            case 184:
               var10000 = 214;
               break;
            case 185:
               var10000 = 135;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 114;
               break;
            case 188:
               var10000 = 241;
               break;
            case 189:
               var10000 = 125;
               break;
            case 190:
               var10000 = 202;
               break;
            case 191:
               var10000 = 159;
               break;
            case 192:
               var10000 = 110;
               break;
            case 193:
               var10000 = 209;
               break;
            case 194:
               var10000 = 133;
               break;
            case 195:
               var10000 = 123;
               break;
            case 196:
               var10000 = 78;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 181;
               break;
            case 199:
               var10000 = 51;
               break;
            case 200:
               var10000 = 130;
               break;
            case 201:
               var10000 = 184;
               break;
            case 202:
               var10000 = 254;
               break;
            case 203:
               var10000 = 74;
               break;
            case 204:
               var10000 = 96;
               break;
            case 205:
               var10000 = 100;
               break;
            case 206:
               var10000 = 238;
               break;
            case 207:
               var10000 = 162;
               break;
            case 208:
               var10000 = 128;
               break;
            case 209:
               var10000 = 13;
               break;
            case 210:
               var10000 = 4;
               break;
            case 211:
               var10000 = 88;
               break;
            case 212:
               var10000 = 65;
               break;
            case 213:
               var10000 = 208;
               break;
            case 214:
               var10000 = 201;
               break;
            case 215:
               var10000 = 166;
               break;
            case 216:
               var10000 = 200;
               break;
            case 217:
               var10000 = 94;
               break;
            case 218:
               var10000 = 107;
               break;
            case 219:
               var10000 = 168;
               break;
            case 220:
               var10000 = 236;
               break;
            case 221:
               var10000 = 44;
               break;
            case 222:
               var10000 = 71;
               break;
            case 223:
               var10000 = 160;
               break;
            case 224:
               var10000 = 198;
               break;
            case 225:
               var10000 = 21;
               break;
            case 226:
               var10000 = 244;
               break;
            case 227:
               var10000 = 85;
               break;
            case 228:
               var10000 = 63;
               break;
            case 229:
               var10000 = 206;
               break;
            case 230:
               var10000 = 232;
               break;
            case 231:
               var10000 = 82;
               break;
            case 232:
               var10000 = 24;
               break;
            case 233:
               var10000 = 112;
               break;
            case 234:
               var10000 = 122;
               break;
            case 235:
               var10000 = 103;
               break;
            case 236:
               var10000 = 226;
               break;
            case 237:
               var10000 = 246;
               break;
            case 238:
               var10000 = 224;
               break;
            case 239:
               var10000 = 46;
               break;
            case 240:
               var10000 = 203;
               break;
            case 241:
               var10000 = 40;
               break;
            case 242:
               var10000 = 49;
               break;
            case 243:
               var10000 = 148;
               break;
            case 244:
               var10000 = 231;
               break;
            case 245:
               var10000 = 136;
               break;
            case 246:
               var10000 = 111;
               break;
            case 247:
               var10000 = 6;
               break;
            case 248:
               var10000 = 211;
               break;
            case 249:
               var10000 = 31;
               break;
            case 250:
               var10000 = 73;
               break;
            case 251:
               var10000 = 213;
               break;
            case 252:
               var10000 = 3;
               break;
            case 253:
               var10000 = 8;
               break;
            case 254:
               var10000 = 161;
               break;
            default:
               var10000 = 25;
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
      char[] var23;
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "设邺拘禊鐧斘上k\u0012W¶7 \u007f\u0097c¸\u009d®\u0090Ò\u0080\u009f\u0016\u000b\u0081*\u0005福鑍仪卣疔\u000f礴鑓攗亹輟妏ù诫郶扲殡碹攋乫\u0019\b欖祡鑠嬧硑乷穸\u009c";
      int var6 = "设邺拘禊鐧斘上k\u0012W¶7 \u007f\u0097c¸\u009d®\u0090Ò\u0080\u009f\u0016\u000b\u0081*\u0005福鑍仪卣疔\u000f礴鑓攗亹輟妏ù诫郶扲殡碹攋乫\u0019\b欖祡鑠嬧硑乷穸\u009c".length();
      char var3 = '\b';
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 54;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
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
                        var50 = 26;
                        break;
                     case 1:
                        var50 = 126;
                        break;
                     case 2:
                        var50 = 92;
                        break;
                     case 3:
                        var50 = 11;
                        break;
                     case 4:
                        var50 = 54;
                        break;
                     case 5:
                        var50 = 38;
                        break;
                     default:
                        var50 = 63;
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
                     b = new String[7];
                     long var0 = 3305934966496783991L;
                     long var27 = 3305934966496718455L ^ var0;
                     byte var18 = -1;
                     c = var27;
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

                  var4 = "讝迲凨呞禱\u0007礯铸寭磣锯话/";
                  var6 = "讝迲凨呞禱\u0007礯铸寭磣锯话/".length();
                  var3 = 5;
                  var10 = -1;
            }

            var10000 = 9;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





