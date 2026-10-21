package com.finalshell.core;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class Zb2 {
   public static BufferedImage I;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static BufferedImage d(ImageProducer param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 03: new java/awt/image/PixelGrabber
      // 06: dup
      // 07: aload 0
      // 08: bipush 0
      // 09: bipush 0
      // 0a: bipush -1
      // 0b: bipush -1
      // 0c: aconst_null
      // 0d: bipush 0
      // 0e: bipush 0
      // 0f: invokespecial java/awt/image/PixelGrabber.<init> (Ljava/awt/image/ImageProducer;IIII[III)V
      // 12: astore 2
      // 13: astore 1
      // 14: aload 2
      // 15: invokevirtual java/awt/image/PixelGrabber.grabPixels ()Z
      // 18: pop
      // 19: goto 2e
      // 1c: astore 3
      // 1d: new java/lang/RuntimeException
      // 20: dup
      // 21: sipush -5560
      // 24: sipush 29587
      // 27: invokestatic com/finalshell/core/Zb2.a (II)Ljava/lang/String;
      // 2a: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual java/awt/image/PixelGrabber.status ()I
      // 32: sipush 29296
      // 35: ldc2_w 7324890674716781270
      // 38: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 3b: iand
      // 3c: aload 1
      // 3d: ifnull 6d
      // 40: ifeq 5f
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: new java/lang/RuntimeException
      // 4d: dup
      // 4e: sipush -5559
      // 51: sipush 18418
      // 54: invokestatic com/finalshell/core/Zb2.a (II)Ljava/lang/String;
      // 57: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 5a: athrow
      // 5b: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 2
      // 60: invokevirtual java/awt/image/PixelGrabber.status ()I
      // 63: sipush 28905
      // 66: ldc2_w 2153863042812192846
      // 69: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 6c: iand
      // 6d: ifeq 85
      // 70: new java/lang/RuntimeException
      // 73: dup
      // 74: sipush -5557
      // 77: sipush -27034
      // 7a: invokestatic com/finalshell/core/Zb2.a (II)Ljava/lang/String;
      // 7d: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 80: athrow
      // 81: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: new java/awt/image/BufferedImage
      // 88: dup
      // 89: aload 2
      // 8a: invokevirtual java/awt/image/PixelGrabber.getWidth ()I
      // 8d: aload 2
      // 8e: invokevirtual java/awt/image/PixelGrabber.getHeight ()I
      // 91: bipush 2
      // 92: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 95: astore 3
      // 96: aload 3
      // 97: bipush 0
      // 98: bipush 0
      // 99: aload 2
      // 9a: invokevirtual java/awt/image/PixelGrabber.getWidth ()I
      // 9d: aload 2
      // 9e: invokevirtual java/awt/image/PixelGrabber.getHeight ()I
      // a1: aload 2
      // a2: invokevirtual java/awt/image/PixelGrabber.getPixels ()Ljava/lang/Object;
      // a5: checkcast [I
      // a8: bipush 0
      // a9: aload 2
      // aa: invokevirtual java/awt/image/PixelGrabber.getWidth ()I
      // ad: invokevirtual java/awt/image/BufferedImage.setRGB (IIII[III)V
      // b0: aload 3
      // b1: areturn
   }

   public static BufferedImage u(Image param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: instanceof java/awt/image/BufferedImage
      // 08: aload 1
      // 09: ifnull 2f
      // 0c: ifeq 3c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/awt/image/BufferedImage
      // 1a: aload 1
      // 1b: ifnull 4e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: bipush 2
      // 30: if_icmpne 3c
      // 33: aload 0
      // 34: checkcast java/awt/image/BufferedImage
      // 37: areturn
      // 38: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: new java/awt/image/BufferedImage
      // 3f: dup
      // 40: aload 0
      // 41: aconst_null
      // 42: invokevirtual java/awt/Image.getWidth (Ljava/awt/image/ImageObserver;)I
      // 45: aload 0
      // 46: aconst_null
      // 47: invokevirtual java/awt/Image.getHeight (Ljava/awt/image/ImageObserver;)I
      // 4a: bipush 2
      // 4b: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 4e: astore 2
      // 4f: aload 2
      // 50: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 53: astore 3
      // 54: aload 3
      // 55: aload 0
      // 56: bipush 0
      // 57: bipush 0
      // 58: aconst_null
      // 59: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 5c: pop
      // 5d: aload 3
      // 5e: invokevirtual java/awt/Graphics2D.dispose ()V
      // 61: aload 2
      // 62: areturn
   }

   public static BufferedImage h(BufferedImage var0, int var1, int var2, int var3, int var4) {
      BufferedImage var5 = new BufferedImage(var3, var4, 2);
      Graphics2D var6 = var5.createGraphics();
      var6.drawRenderedImage(var0, AffineTransform.getTranslateInstance((double)(-var1), (double)(-var2)));
      var6.dispose();
      return var5;
   }

   public static BufferedImage A(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      Graphics2D var2 = var1.createGraphics();
      var2.drawRenderedImage(var0, null);
      var2.dispose();
      return var1;
   }

   public static void f(Component param0, Graphics param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 003: astore 6
      // 005: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 008: aload 6
      // 00a: ifnull 0c6
      // 00d: ifnonnull 0c3
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: new java/awt/image/BufferedImage
      // 01a: dup
      // 01b: sipush 25483
      // 01e: ldc2_w 1348758473218308907
      // 021: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 024: sipush 28905
      // 027: ldc2_w 2153863042812192846
      // 02a: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 02d: bipush 2
      // 02e: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 031: putstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 034: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 037: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 03a: astore 7
      // 03c: bipush 0
      // 03d: istore 8
      // 03f: iload 8
      // 041: sipush 28905
      // 044: ldc2_w 2153863042812192846
      // 047: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 04a: if_icmpge 0be
      // 04d: aload 6
      // 04f: ifnull 0c3
      // 052: bipush 0
      // 053: istore 9
      // 055: iload 9
      // 057: sipush 28905
      // 05a: ldc2_w 2153863042812192846
      // 05d: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 060: if_icmpge 0b6
      // 063: aload 7
      // 065: aload 6
      // 067: ifnull 0c0
      // 06a: iload 9
      // 06c: iload 8
      // 06e: ixor
      // 06f: sipush 7262
      // 072: ldc2_w 7453272590818034940
      // 075: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 078: iand
      // 079: ifeq 08d
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: getstatic java/awt/Color.lightGray Ljava/awt/Color;
      // 086: goto 090
      // 089: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: getstatic java/awt/Color.white Ljava/awt/Color;
      // 090: invokevirtual java/awt/Graphics.setColor (Ljava/awt/Color;)V
      // 093: aload 7
      // 095: iload 9
      // 097: iload 8
      // 099: sipush 7410
      // 09c: ldc2_w 108848770989343827
      // 09f: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 0a2: sipush 7410
      // 0a5: ldc2_w 108848770989343827
      // 0a8: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 0ab: invokevirtual java/awt/Graphics.fillRect (IIII)V
      // 0ae: iinc 9 8
      // 0b1: aload 6
      // 0b3: ifnonnull 055
      // 0b6: iinc 8 8
      // 0b9: aload 6
      // 0bb: ifnonnull 03f
      // 0be: aload 7
      // 0c0: invokevirtual java/awt/Graphics.dispose ()V
      // 0c3: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 0c6: ifnull 1e1
      // 0c9: aload 1
      // 0ca: invokevirtual java/awt/Graphics.getClip ()Ljava/awt/Shape;
      // 0cd: astore 7
      // 0cf: aload 1
      // 0d0: invokevirtual java/awt/Graphics.getClipBounds ()Ljava/awt/Rectangle;
      // 0d3: astore 8
      // 0d5: aload 8
      // 0d7: aload 6
      // 0d9: ifnull 105
      // 0dc: ifnonnull 0f3
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: new java/awt/Rectangle
      // 0e9: dup
      // 0ea: aload 0
      // 0eb: invokevirtual java/awt/Component.getSize ()Ljava/awt/Dimension;
      // 0ee: invokespecial java/awt/Rectangle.<init> (Ljava/awt/Dimension;)V
      // 0f1: astore 8
      // 0f3: aload 8
      // 0f5: new java/awt/Rectangle
      // 0f8: dup
      // 0f9: iload 2
      // 0fa: iload 3
      // 0fb: iload 4
      // 0fd: iload 5
      // 0ff: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 102: invokevirtual java/awt/Rectangle.intersection (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
      // 105: astore 8
      // 107: aload 1
      // 108: aload 8
      // 10a: invokevirtual java/awt/Graphics.setClip (Ljava/awt/Shape;)V
      // 10d: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 110: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 113: istore 9
      // 115: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 118: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 11b: istore 10
      // 11d: iload 9
      // 11f: bipush -1
      // 120: aload 6
      // 122: ifnull 139
      // 125: if_icmpeq 1db
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: iload 10
      // 131: bipush -1
      // 132: goto 139
      // 135: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: aload 6
      // 13b: ifnull 159
      // 13e: if_icmpeq 1db
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 8
      // 14a: getfield java/awt/Rectangle.x I
      // 14d: iload 9
      // 14f: idiv
      // 150: iload 9
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: imul
      // 15a: istore 11
      // 15c: aload 8
      // 15e: getfield java/awt/Rectangle.y I
      // 161: iload 10
      // 163: idiv
      // 164: iload 10
      // 166: imul
      // 167: istore 12
      // 169: aload 8
      // 16b: getfield java/awt/Rectangle.x I
      // 16e: aload 8
      // 170: getfield java/awt/Rectangle.width I
      // 173: iadd
      // 174: iload 9
      // 176: iadd
      // 177: bipush 1
      // 178: isub
      // 179: iload 9
      // 17b: idiv
      // 17c: iload 9
      // 17e: imul
      // 17f: istore 13
      // 181: aload 8
      // 183: getfield java/awt/Rectangle.y I
      // 186: aload 8
      // 188: getfield java/awt/Rectangle.height I
      // 18b: iadd
      // 18c: iload 10
      // 18e: iadd
      // 18f: bipush 1
      // 190: isub
      // 191: iload 10
      // 193: idiv
      // 194: iload 10
      // 196: imul
      // 197: istore 14
      // 199: iload 12
      // 19b: istore 3
      // 19c: iload 3
      // 19d: iload 14
      // 19f: if_icmpge 1db
      // 1a2: aload 6
      // 1a4: ifnull 1e1
      // 1a7: iload 11
      // 1a9: istore 2
      // 1aa: iload 2
      // 1ab: iload 13
      // 1ad: if_icmpge 1d1
      // 1b0: aload 1
      // 1b1: getstatic com/finalshell/core/Zb2.I Ljava/awt/image/BufferedImage;
      // 1b4: iload 2
      // 1b5: iload 3
      // 1b6: aload 0
      // 1b7: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 1ba: pop
      // 1bb: iload 2
      // 1bc: iload 9
      // 1be: iadd
      // 1bf: istore 2
      // 1c0: aload 6
      // 1c2: ifnull 1d6
      // 1c5: aload 6
      // 1c7: ifnonnull 1aa
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: iload 3
      // 1d2: iload 10
      // 1d4: iadd
      // 1d5: istore 3
      // 1d6: aload 6
      // 1d8: ifnonnull 19c
      // 1db: aload 1
      // 1dc: aload 7
      // 1de: invokevirtual java/awt/Graphics.setClip (Ljava/awt/Shape;)V
      // 1e1: return
   }

   public static Rectangle f(BufferedImage param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 004: istore 2
      // 005: aload 0
      // 006: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 009: istore 3
      // 00a: bipush 0
      // 00b: istore 4
      // 00d: bipush 0
      // 00e: istore 5
      // 010: iload 2
      // 011: istore 6
      // 013: iload 3
      // 014: istore 7
      // 016: bipush 0
      // 017: istore 8
      // 019: aconst_null
      // 01a: astore 10
      // 01c: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 01f: iload 3
      // 020: bipush 1
      // 021: isub
      // 022: istore 9
      // 024: astore 1
      // 025: iload 9
      // 027: iflt 0f5
      // 02a: aload 0
      // 02b: bipush 0
      // 02c: iload 9
      // 02e: iload 2
      // 02f: bipush 1
      // 030: aload 10
      // 032: invokestatic com/finalshell/core/Zb2.Z (Ljava/awt/image/BufferedImage;IIII[I)[I
      // 035: astore 10
      // 037: bipush 0
      // 038: istore 11
      // 03a: iload 11
      // 03c: iload 6
      // 03e: if_icmpge 086
      // 041: aload 10
      // 043: iload 11
      // 045: iaload
      // 046: sipush 21823
      // 049: ldc2_w 7691695537885121947
      // 04c: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 04f: iand
      // 050: aload 1
      // 051: ifnull 089
      // 054: aload 1
      // 055: ifnull 072
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: ifeq 078
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: iload 11
      // 06b: istore 6
      // 06d: iload 9
      // 06f: istore 5
      // 071: bipush 1
      // 072: istore 8
      // 074: aload 1
      // 075: ifnonnull 086
      // 078: iinc 11 1
      // 07b: aload 1
      // 07c: ifnonnull 03a
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: iload 2
      // 087: bipush 1
      // 088: isub
      // 089: istore 11
      // 08b: iload 11
      // 08d: iload 4
      // 08f: if_icmplt 0d7
      // 092: aload 10
      // 094: iload 11
      // 096: iaload
      // 097: sipush 4101
      // 09a: ldc2_w 3170561948624570528
      // 09d: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 0a0: iand
      // 0a1: aload 1
      // 0a2: ifnull 0d9
      // 0a5: aload 1
      // 0a6: ifnull 0c3
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: ifeq 0c9
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: iload 11
      // 0bc: istore 4
      // 0be: iload 9
      // 0c0: istore 5
      // 0c2: bipush 1
      // 0c3: istore 8
      // 0c5: aload 1
      // 0c6: ifnonnull 0d7
      // 0c9: iinc 11 -1
      // 0cc: aload 1
      // 0cd: ifnonnull 08b
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: iload 8
      // 0d9: ifeq 0e7
      // 0dc: aload 1
      // 0dd: ifnonnull 0f5
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: iinc 9 -1
      // 0ea: aload 1
      // 0eb: ifnonnull 025
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aconst_null
      // 0f6: astore 10
      // 0f8: bipush 0
      // 0f9: istore 11
      // 0fb: iload 11
      // 0fd: iload 9
      // 0ff: if_icmpge 1d7
      // 102: aload 0
      // 103: bipush 0
      // 104: iload 11
      // 106: iload 2
      // 107: bipush 1
      // 108: aload 10
      // 10a: invokestatic com/finalshell/core/Zb2.Z (Ljava/awt/image/BufferedImage;IIII[I)[I
      // 10d: astore 10
      // 10f: bipush 0
      // 110: aload 1
      // 111: ifnull 1d9
      // 114: istore 12
      // 116: iload 12
      // 118: iload 6
      // 11a: if_icmpge 174
      // 11d: aload 10
      // 11f: iload 12
      // 121: iaload
      // 122: sipush 4101
      // 125: ldc2_w 3170561948624570528
      // 128: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 12b: iand
      // 12c: aload 1
      // 12d: ifnull 177
      // 130: aload 1
      // 131: ifnull 14b
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: ifeq 166
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: iload 12
      // 147: istore 6
      // 149: iload 11
      // 14b: aload 1
      // 14c: ifnull 160
      // 14f: iload 7
      // 151: if_icmpge 15f
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: iload 11
      // 15d: istore 7
      // 15f: bipush 1
      // 160: istore 8
      // 162: aload 1
      // 163: ifnonnull 174
      // 166: iinc 12 1
      // 169: aload 1
      // 16a: ifnonnull 116
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: iload 2
      // 175: bipush 1
      // 176: isub
      // 177: istore 12
      // 179: iload 12
      // 17b: iload 4
      // 17d: if_icmplt 1d0
      // 180: aload 10
      // 182: iload 12
      // 184: iaload
      // 185: sipush 4101
      // 188: ldc2_w 3170561948624570528
      // 18b: invokestatic com/finalshell/core/Zb2.a (IJ)I
      // 18e: iand
      // 18f: aload 1
      // 190: ifnull 0fd
      // 193: aload 1
      // 194: ifnull 1a7
      // 197: ifeq 1c2
      // 19a: goto 1a1
      // 19d: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: iload 12
      // 1a3: istore 4
      // 1a5: iload 11
      // 1a7: aload 1
      // 1a8: ifnull 1bc
      // 1ab: iload 7
      // 1ad: if_icmpge 1bb
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: iload 11
      // 1b9: istore 7
      // 1bb: bipush 1
      // 1bc: istore 8
      // 1be: aload 1
      // 1bf: ifnonnull 1d0
      // 1c2: iinc 12 -1
      // 1c5: aload 1
      // 1c6: ifnonnull 179
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: iinc 11 1
      // 1d3: aload 1
      // 1d4: ifnonnull 0fb
      // 1d7: iload 8
      // 1d9: ifeq 1fa
      // 1dc: new java/awt/Rectangle
      // 1df: dup
      // 1e0: iload 6
      // 1e2: iload 7
      // 1e4: iload 4
      // 1e6: iload 6
      // 1e8: isub
      // 1e9: bipush 1
      // 1ea: iadd
      // 1eb: iload 5
      // 1ed: iload 7
      // 1ef: isub
      // 1f0: bipush 1
      // 1f1: iadd
      // 1f2: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 1f5: areturn
      // 1f6: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: aconst_null
      // 1fb: areturn
   }

   public static void g(Raster var0, WritableRaster var1, Raster var2) {
      int var4 = var0.getMinX();
      int var5 = var0.getMinY();
      int var6 = var0.getWidth();
      String[] var10000 = W5.q();
      int var7 = var0.getHeight();
      int[] var8 = null;
      int[] var9 = null;
      int[] var10 = null;
      int var11 = 0;
      String[] var3 = var10000;

      while (var11 < var7) {
         var8 = var0.getPixels(var4, var5, var6, 1, var8);
         var9 = var2.getPixels(var4, var5, var6, 1, var9);
         var10 = var1.getPixels(var4, var5, var6, 1, var10);
         int var12 = var4;
         int var13 = 0;

         while (true) {
            if (var13 < var6) {
               int var14 = var8[var12];
               int var15 = var10[var12];
               int var16 = var8[var12 + 1];
               int var17 = var10[var12 + 1];
               int var18 = var8[var12 + 2];
               int var19 = var10[var12 + 2];
               int var20 = var8[var12 + 3];
               int var21 = var10[var12 + 3];
               float var22 = (float)var9[var12 + 3] / 255.0F;
               float var23 = 1.0F - var22;

               try {
                  var10[var12] = (int)(var22 * (float)var14 + var23 * (float)var15);
                  var10[var12 + 1] = (int)(var22 * (float)var16 + var23 * (float)var17);
                  var10[var12 + 2] = (int)(var22 * (float)var18 + var23 * (float)var19);
                  var10[var12 + 3] = (int)(var22 * (float)var20 + var23 * (float)var21);
                  var12 += 4;
                  var13++;
                  if (var3 == null) {
                     break;
                  }

                  if (var3 != null) {
                     continue;
                  }
               } catch (RuntimeException var24) {
                  throw a(var24);
               }
            }

            var1.setPixels(var4, var5, var6, 1, var10);
            var5++;
            var11++;
            break;
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public static int[] Z(BufferedImage param0, int param1, int param2, int param3, int param4, int[] param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 07: istore 7
      // 09: astore 6
      // 0b: iload 7
      // 0d: bipush 2
      // 0e: aload 6
      // 10: ifnull 27
      // 13: if_icmpeq 2a
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 7
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: if_icmpne 40
      // 2a: aload 0
      // 2b: invokevirtual java/awt/image/BufferedImage.getRaster ()Ljava/awt/image/WritableRaster;
      // 2e: iload 1
      // 2f: iload 2
      // 30: iload 3
      // 31: iload 4
      // 33: aload 5
      // 35: invokevirtual java/awt/image/WritableRaster.getDataElements (IIIILjava/lang/Object;)Ljava/lang/Object;
      // 38: checkcast [I
      // 3b: areturn
      // 3c: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: iload 1
      // 42: iload 2
      // 43: iload 3
      // 44: iload 4
      // 46: aload 5
      // 48: bipush 0
      // 49: iload 3
      // 4a: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 4d: areturn
   }

   public static void u(BufferedImage param0, int param1, int param2, int param3, int param4, int[] param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 07: istore 7
      // 09: astore 6
      // 0b: aload 6
      // 0d: ifnull 3f
      // 10: iload 7
      // 12: bipush 2
      // 13: if_icmpeq 2a
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 7
      // 1f: bipush 1
      // 20: if_icmpne 44
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: invokevirtual java/awt/image/BufferedImage.getRaster ()Ljava/awt/image/WritableRaster;
      // 2e: iload 1
      // 2f: iload 2
      // 30: iload 3
      // 31: iload 4
      // 33: aload 5
      // 35: invokevirtual java/awt/image/WritableRaster.setDataElements (IIIILjava/lang/Object;)V
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 6
      // 41: ifnonnull 58
      // 44: aload 0
      // 45: iload 1
      // 46: iload 2
      // 47: iload 3
      // 48: iload 4
      // 4a: aload 5
      // 4c: bipush 0
      // 4d: iload 3
      // 4e: invokevirtual java/awt/image/BufferedImage.setRGB (IIII[III)V
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Zb2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: return
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -5559) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 137;
               break;
            case 1:
               var10000 = 60;
               break;
            case 2:
               var10000 = 236;
               break;
            case 3:
               var10000 = 15;
               break;
            case 4:
               var10000 = 222;
               break;
            case 5:
               var10000 = 99;
               break;
            case 6:
               var10000 = 153;
               break;
            case 7:
               var10000 = 27;
               break;
            case 8:
               var10000 = 90;
               break;
            case 9:
               var10000 = 164;
               break;
            case 10:
               var10000 = 105;
               break;
            case 11:
               var10000 = 96;
               break;
            case 12:
               var10000 = 37;
               break;
            case 13:
               var10000 = 170;
               break;
            case 14:
               var10000 = 70;
               break;
            case 15:
               var10000 = 116;
               break;
            case 16:
               var10000 = 221;
               break;
            case 17:
               var10000 = 126;
               break;
            case 18:
               var10000 = 24;
               break;
            case 19:
               var10000 = 74;
               break;
            case 20:
               var10000 = 231;
               break;
            case 21:
               var10000 = 19;
               break;
            case 22:
               var10000 = 218;
               break;
            case 23:
               var10000 = 30;
               break;
            case 24:
               var10000 = 39;
               break;
            case 25:
               var10000 = 26;
               break;
            case 26:
               var10000 = 25;
               break;
            case 27:
               var10000 = 243;
               break;
            case 28:
               var10000 = 8;
               break;
            case 29:
               var10000 = 185;
               break;
            case 30:
               var10000 = 38;
               break;
            case 31:
               var10000 = 157;
               break;
            case 32:
               var10000 = 192;
               break;
            case 33:
               var10000 = 62;
               break;
            case 34:
               var10000 = 232;
               break;
            case 35:
               var10000 = 67;
               break;
            case 36:
               var10000 = 2;
               break;
            case 37:
               var10000 = 178;
               break;
            case 38:
               var10000 = 40;
               break;
            case 39:
               var10000 = 51;
               break;
            case 40:
               var10000 = 205;
               break;
            case 41:
               var10000 = 87;
               break;
            case 42:
               var10000 = 31;
               break;
            case 43:
               var10000 = 112;
               break;
            case 44:
               var10000 = 6;
               break;
            case 45:
               var10000 = 59;
               break;
            case 46:
               var10000 = 143;
               break;
            case 47:
               var10000 = 63;
               break;
            case 48:
               var10000 = 53;
               break;
            case 49:
               var10000 = 36;
               break;
            case 50:
               var10000 = 135;
               break;
            case 51:
               var10000 = 201;
               break;
            case 52:
               var10000 = 41;
               break;
            case 53:
               var10000 = 234;
               break;
            case 54:
               var10000 = 175;
               break;
            case 55:
               var10000 = 131;
               break;
            case 56:
               var10000 = 233;
               break;
            case 57:
               var10000 = 100;
               break;
            case 58:
               var10000 = 188;
               break;
            case 59:
               var10000 = 5;
               break;
            case 60:
               var10000 = 152;
               break;
            case 61:
               var10000 = 238;
               break;
            case 62:
               var10000 = 228;
               break;
            case 63:
               var10000 = 216;
               break;
            case 64:
               var10000 = 187;
               break;
            case 65:
               var10000 = 88;
               break;
            case 66:
               var10000 = 77;
               break;
            case 67:
               var10000 = 14;
               break;
            case 68:
               var10000 = 194;
               break;
            case 69:
               var10000 = 246;
               break;
            case 70:
               var10000 = 110;
               break;
            case 71:
               var10000 = 179;
               break;
            case 72:
               var10000 = 119;
               break;
            case 73:
               var10000 = 203;
               break;
            case 74:
               var10000 = 202;
               break;
            case 75:
               var10000 = 48;
               break;
            case 76:
               var10000 = 145;
               break;
            case 77:
               var10000 = 206;
               break;
            case 78:
               var10000 = 165;
               break;
            case 79:
               var10000 = 16;
               break;
            case 80:
               var10000 = 211;
               break;
            case 81:
               var10000 = 226;
               break;
            case 82:
               var10000 = 235;
               break;
            case 83:
               var10000 = 49;
               break;
            case 84:
               var10000 = 47;
               break;
            case 85:
               var10000 = 245;
               break;
            case 86:
               var10000 = 125;
               break;
            case 87:
               var10000 = 12;
               break;
            case 88:
               var10000 = 29;
               break;
            case 89:
               var10000 = 71;
               break;
            case 90:
               var10000 = 18;
               break;
            case 91:
               var10000 = 224;
               break;
            case 92:
               var10000 = 161;
               break;
            case 93:
               var10000 = 197;
               break;
            case 94:
               var10000 = 84;
               break;
            case 95:
               var10000 = 229;
               break;
            case 96:
               var10000 = 160;
               break;
            case 97:
               var10000 = 0;
               break;
            case 98:
               var10000 = 81;
               break;
            case 99:
               var10000 = 120;
               break;
            case 100:
               var10000 = 52;
               break;
            case 101:
               var10000 = 241;
               break;
            case 102:
               var10000 = 109;
               break;
            case 103:
               var10000 = 1;
               break;
            case 104:
               var10000 = 66;
               break;
            case 105:
               var10000 = 176;
               break;
            case 106:
               var10000 = 89;
               break;
            case 107:
               var10000 = 28;
               break;
            case 108:
               var10000 = 73;
               break;
            case 109:
               var10000 = 121;
               break;
            case 110:
               var10000 = 138;
               break;
            case 111:
               var10000 = 210;
               break;
            case 112:
               var10000 = 34;
               break;
            case 113:
               var10000 = 130;
               break;
            case 114:
               var10000 = 166;
               break;
            case 115:
               var10000 = 72;
               break;
            case 116:
               var10000 = 108;
               break;
            case 117:
               var10000 = 151;
               break;
            case 118:
               var10000 = 68;
               break;
            case 119:
               var10000 = 114;
               break;
            case 120:
               var10000 = 78;
               break;
            case 121:
               var10000 = 177;
               break;
            case 122:
               var10000 = 168;
               break;
            case 123:
               var10000 = 128;
               break;
            case 124:
               var10000 = 42;
               break;
            case 125:
               var10000 = 46;
               break;
            case 126:
               var10000 = 75;
               break;
            case 127:
               var10000 = 223;
               break;
            case 128:
               var10000 = 65;
               break;
            case 129:
               var10000 = 124;
               break;
            case 130:
               var10000 = 55;
               break;
            case 131:
               var10000 = 239;
               break;
            case 132:
               var10000 = 227;
               break;
            case 133:
               var10000 = 33;
               break;
            case 134:
               var10000 = 94;
               break;
            case 135:
               var10000 = 163;
               break;
            case 136:
               var10000 = 252;
               break;
            case 137:
               var10000 = 254;
               break;
            case 138:
               var10000 = 191;
               break;
            case 139:
               var10000 = 182;
               break;
            case 140:
               var10000 = 230;
               break;
            case 141:
               var10000 = 69;
               break;
            case 142:
               var10000 = 171;
               break;
            case 143:
               var10000 = 156;
               break;
            case 144:
               var10000 = 4;
               break;
            case 145:
               var10000 = 186;
               break;
            case 146:
               var10000 = 214;
               break;
            case 147:
               var10000 = 204;
               break;
            case 148:
               var10000 = 195;
               break;
            case 149:
               var10000 = 154;
               break;
            case 150:
               var10000 = 217;
               break;
            case 151:
               var10000 = 180;
               break;
            case 152:
               var10000 = 219;
               break;
            case 153:
               var10000 = 129;
               break;
            case 154:
               var10000 = 80;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 23;
               break;
            case 157:
               var10000 = 184;
               break;
            case 158:
               var10000 = 140;
               break;
            case 159:
               var10000 = 142;
               break;
            case 160:
               var10000 = 244;
               break;
            case 161:
               var10000 = 117;
               break;
            case 162:
               var10000 = 9;
               break;
            case 163:
               var10000 = 10;
               break;
            case 164:
               var10000 = 213;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 101;
               break;
            case 167:
               var10000 = 3;
               break;
            case 168:
               var10000 = 122;
               break;
            case 169:
               var10000 = 220;
               break;
            case 170:
               var10000 = 133;
               break;
            case 171:
               var10000 = 95;
               break;
            case 172:
               var10000 = 174;
               break;
            case 173:
               var10000 = 189;
               break;
            case 174:
               var10000 = 255;
               break;
            case 175:
               var10000 = 21;
               break;
            case 176:
               var10000 = 13;
               break;
            case 177:
               var10000 = 57;
               break;
            case 178:
               var10000 = 93;
               break;
            case 179:
               var10000 = 144;
               break;
            case 180:
               var10000 = 172;
               break;
            case 181:
               var10000 = 237;
               break;
            case 182:
               var10000 = 225;
               break;
            case 183:
               var10000 = 198;
               break;
            case 184:
               var10000 = 107;
               break;
            case 185:
               var10000 = 17;
               break;
            case 186:
               var10000 = 97;
               break;
            case 187:
               var10000 = 247;
               break;
            case 188:
               var10000 = 181;
               break;
            case 189:
               var10000 = 111;
               break;
            case 190:
               var10000 = 139;
               break;
            case 191:
               var10000 = 209;
               break;
            case 192:
               var10000 = 20;
               break;
            case 193:
               var10000 = 127;
               break;
            case 194:
               var10000 = 45;
               break;
            case 195:
               var10000 = 104;
               break;
            case 196:
               var10000 = 102;
               break;
            case 197:
               var10000 = 58;
               break;
            case 198:
               var10000 = 158;
               break;
            case 199:
               var10000 = 35;
               break;
            case 200:
               var10000 = 208;
               break;
            case 201:
               var10000 = 7;
               break;
            case 202:
               var10000 = 106;
               break;
            case 203:
               var10000 = 123;
               break;
            case 204:
               var10000 = 249;
               break;
            case 205:
               var10000 = 190;
               break;
            case 206:
               var10000 = 91;
               break;
            case 207:
               var10000 = 200;
               break;
            case 208:
               var10000 = 44;
               break;
            case 209:
               var10000 = 150;
               break;
            case 210:
               var10000 = 242;
               break;
            case 211:
               var10000 = 173;
               break;
            case 212:
               var10000 = 50;
               break;
            case 213:
               var10000 = 196;
               break;
            case 214:
               var10000 = 85;
               break;
            case 215:
               var10000 = 193;
               break;
            case 216:
               var10000 = 61;
               break;
            case 217:
               var10000 = 250;
               break;
            case 218:
               var10000 = 167;
               break;
            case 219:
               var10000 = 134;
               break;
            case 220:
               var10000 = 155;
               break;
            case 221:
               var10000 = 98;
               break;
            case 222:
               var10000 = 32;
               break;
            case 223:
               var10000 = 253;
               break;
            case 224:
               var10000 = 159;
               break;
            case 225:
               var10000 = 147;
               break;
            case 226:
               var10000 = 103;
               break;
            case 227:
               var10000 = 54;
               break;
            case 228:
               var10000 = 86;
               break;
            case 229:
               var10000 = 113;
               break;
            case 230:
               var10000 = 11;
               break;
            case 231:
               var10000 = 83;
               break;
            case 232:
               var10000 = 146;
               break;
            case 233:
               var10000 = 183;
               break;
            case 234:
               var10000 = 207;
               break;
            case 235:
               var10000 = 64;
               break;
            case 236:
               var10000 = 43;
               break;
            case 237:
               var10000 = 212;
               break;
            case 238:
               var10000 = 115;
               break;
            case 239:
               var10000 = 92;
               break;
            case 240:
               var10000 = 148;
               break;
            case 241:
               var10000 = 76;
               break;
            case 242:
               var10000 = 199;
               break;
            case 243:
               var10000 = 132;
               break;
            case 244:
               var10000 = 149;
               break;
            case 245:
               var10000 = 136;
               break;
            case 246:
               var10000 = 169;
               break;
            case 247:
               var10000 = 141;
               break;
            case 248:
               var10000 = 162;
               break;
            case 249:
               var10000 = 215;
               break;
            case 250:
               var10000 = 240;
               break;
            case 251:
               var10000 = 79;
               break;
            case 252:
               var10000 = 82;
               break;
            case 253:
               var10000 = 56;
               break;
            case 254:
               var10000 = 22;
               break;
            default:
               var10000 = 118;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22692;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "¹é6\u008d(µM\u0089l\u009b\b\u009aªò\t\u0019×m¢\u0017ÖóÛÎ\u0095Ýú\u0084\u009a:Ö®yxaÒ¤ö\u001b=+Âà\u0011O\u009aèãóx60\u0003¬å|\u0013>§\u008fº";
      int var12 = "¹é6\u008d(µM\u0089l\u009b\b\u009aªò\t\u0019×m¢\u0017ÖóÛÎ\u0095Ýú\u0084\u009a:Ö®yxaÒ¤ö\u001b=+Âà\u0011O\u009aèãóx60\u0003¬å|\u0013>§\u008fº"
         .length();
      char var9 = 19;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 14;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 14;
               var10006 = var14;
            } else {
               var27 = 14;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 14;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 116;
                     break;
                  case 1:
                     var47 = 85;
                     break;
                  case 2:
                     var47 = 65;
                     break;
                  case 3:
                     var47 = 114;
                     break;
                  case 4:
                     var47 = 33;
                     break;
                  case 5:
                     var47 = 46;
                     break;
                  default:
                     var47 = 12;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[3];
            long var0 = 76515271408208940L;
            long[] var6 = new long[7];
            int var3 = 0;
            String var4 = "\u009b¬ØNû4A·\u008cBýe%\u000e\u0084\u008c\u000f«\u0089ó\u0099=fz!\u0082\u0080z}\u0084d\"9H\u008fò\u0097ÔwG";
            int var5 = "\u009b¬ØNû4A·\u008cBýe%\u000e\u0084\u008c\u000f«\u0089ó\u0099=fz!\u0082\u0080z}\u0084d\"9H\u008fò\u0097ÔwG".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[7];
                           I = null;
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Ç[:\u0094\u008d#\bwmûªUAð\u0088Ø";
                        var5 = "Ç[:\u0094\u008d#\bwmûªUAð\u0088Ø".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





