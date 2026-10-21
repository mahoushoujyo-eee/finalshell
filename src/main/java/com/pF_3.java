package com;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

@XStreamConverter(Nz_2.class)
public class pF_3 implements Icon {
   protected Component Y;
   protected BufferedImage d;
   protected List J;
   protected List R;
   protected Insets x;
   protected Integer c;
   protected Integer B;
   protected Integer k;
   protected Integer t;
   private static String L;
   private static final String[] a;
   private static final String[] b;

   public pF_3(URL var1) {
      this(var1, null);
   }

   public pF_3(URL var1, Component var2) {
      this(Xg_2.z(var1), var2);
   }

   public pF_3(String var1) {
      this(var1, null);
   }

   public pF_3(String var1, Component var2) {
      this(Xg_2.R(var1), var2);
   }

   public pF_3(ImageIcon var1) {
      this(var1, null);
   }

   public pF_3(ImageIcon var1, Component var2) {
      this(Xg_2.Z(var1), var2);
   }

   public pF_3(Image var1) {
      this(var1, null);
   }

   public pF_3(Image var1, Component var2) {
      this(Xg_2.v(var1), var2);
   }

   public pF_3(BufferedImage var1) {
      this(var1, null);
   }

   public pF_3(BufferedImage var1, Component var2) {
      this(var1, var2, true);
   }

   protected pF_3(BufferedImage param1, Component param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: iload 3
      // 005: ifeq 203
      // 008: aload 1
      // 009: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 00c: bipush 3
      // 00d: if_icmplt 01f
      // 010: aload 1
      // 011: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 014: bipush 3
      // 015: if_icmpge 034
      // 018: goto 01f
      // 01b: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01e: athrow
      // 01f: new java/lang/IllegalArgumentException
      // 022: dup
      // 023: sipush 12761
      // 026: sipush -10005
      // 029: invokestatic com/pF_3.a (II)Ljava/lang/String;
      // 02c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 02f: athrow
      // 030: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: aload 0
      // 035: aload 2
      // 036: putfield com/pF_3.Y Ljava/awt/Component;
      // 039: aload 1
      // 03a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 03d: bipush 2
      // 03e: isub
      // 03f: istore 4
      // 041: aload 1
      // 042: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 045: bipush 2
      // 046: isub
      // 047: istore 5
      // 049: aload 0
      // 04a: aload 1
      // 04b: iload 4
      // 04d: iload 5
      // 04f: invokestatic com/Xg_2.o (Ljava/awt/image/BufferedImage;II)Ljava/awt/image/BufferedImage;
      // 052: putfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 055: aload 0
      // 056: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 059: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 05c: astore 6
      // 05e: aload 6
      // 060: aload 1
      // 061: bipush 0
      // 062: bipush 0
      // 063: iload 4
      // 065: iload 5
      // 067: bipush 1
      // 068: bipush 1
      // 069: aload 1
      // 06a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 06d: bipush 1
      // 06e: isub
      // 06f: aload 1
      // 070: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 073: bipush 1
      // 074: isub
      // 075: aconst_null
      // 076: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 079: pop
      // 07a: aload 6
      // 07c: invokevirtual java/awt/Graphics2D.dispose ()V
      // 07f: aload 0
      // 080: aload 1
      // 081: getstatic com/Fj_2.horizontalStretch Lcom/Fj_2;
      // 084: invokestatic com/Fk_2.O (Ljava/awt/image/BufferedImage;Lcom/Fj_2;)Ljava/util/List;
      // 087: putfield com/pF_3.J Ljava/util/List;
      // 08a: aload 0
      // 08b: aload 1
      // 08c: getstatic com/Fj_2.verticalStretch Lcom/Fj_2;
      // 08f: invokestatic com/Fk_2.O (Ljava/awt/image/BufferedImage;Lcom/Fj_2;)Ljava/util/List;
      // 092: putfield com/pF_3.R Ljava/util/List;
      // 095: aload 0
      // 096: getfield com/pF_3.J Ljava/util/List;
      // 099: invokeinterface java/util/List.size ()I 1
      // 09e: bipush 1
      // 09f: if_icmpgt 0d0
      // 0a2: aload 0
      // 0a3: getfield com/pF_3.J Ljava/util/List;
      // 0a6: invokeinterface java/util/List.size ()I 1
      // 0ab: bipush 1
      // 0ac: if_icmpne 112
      // 0af: goto 0b6
      // 0b2: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield com/pF_3.J Ljava/util/List;
      // 0ba: bipush 0
      // 0bb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c0: checkcast com/EZ
      // 0c3: invokevirtual com/EZ.C ()Z
      // 0c6: ifne 112
      // 0c9: goto 0d0
      // 0cc: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield com/pF_3.R Ljava/util/List;
      // 0d4: invokeinterface java/util/List.size ()I 1
      // 0d9: bipush 1
      // 0da: if_icmpgt 127
      // 0dd: goto 0e4
      // 0e0: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield com/pF_3.R Ljava/util/List;
      // 0e8: invokeinterface java/util/List.size ()I 1
      // 0ed: bipush 1
      // 0ee: if_icmpne 112
      // 0f1: goto 0f8
      // 0f4: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: getfield com/pF_3.R Ljava/util/List;
      // 0fc: bipush 0
      // 0fd: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 102: checkcast com/EZ
      // 105: invokevirtual com/EZ.C ()Z
      // 108: ifeq 127
      // 10b: goto 112
      // 10e: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 111: athrow
      // 112: new java/lang/IllegalArgumentException
      // 115: dup
      // 116: sipush 12760
      // 119: sipush 14576
      // 11c: invokestatic com/pF_3.a (II)Ljava/lang/String;
      // 11f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 122: athrow
      // 123: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 126: athrow
      // 127: aload 1
      // 128: getstatic com/Fj_2.verticalContent Lcom/Fj_2;
      // 12b: invokestatic com/Fk_2.O (Ljava/awt/image/BufferedImage;Lcom/Fj_2;)Ljava/util/List;
      // 12e: astore 7
      // 130: aload 1
      // 131: getstatic com/Fj_2.horizontalContent Lcom/Fj_2;
      // 134: invokestatic com/Fk_2.O (Ljava/awt/image/BufferedImage;Lcom/Fj_2;)Ljava/util/List;
      // 137: astore 8
      // 139: aload 7
      // 13b: invokeinterface java/util/List.size ()I 1
      // 140: ifne 14b
      // 143: bipush 0
      // 144: goto 159
      // 147: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14a: athrow
      // 14b: aload 7
      // 14d: bipush 0
      // 14e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 153: checkcast com/EZ
      // 156: invokevirtual com/EZ.x ()I
      // 159: istore 9
      // 15b: aload 7
      // 15d: invokeinterface java/util/List.size ()I 1
      // 162: ifne 16d
      // 165: bipush 0
      // 166: goto 185
      // 169: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 171: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 174: aload 7
      // 176: bipush 0
      // 177: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 17c: checkcast com/EZ
      // 17f: invokevirtual com/EZ.f ()I
      // 182: isub
      // 183: bipush 1
      // 184: isub
      // 185: istore 10
      // 187: aload 8
      // 189: invokeinterface java/util/List.size ()I 1
      // 18e: ifne 199
      // 191: bipush 0
      // 192: goto 1a7
      // 195: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 198: athrow
      // 199: aload 8
      // 19b: bipush 0
      // 19c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1a1: checkcast com/EZ
      // 1a4: invokevirtual com/EZ.x ()I
      // 1a7: istore 11
      // 1a9: aload 8
      // 1ab: invokeinterface java/util/List.size ()I 1
      // 1b0: ifne 1bb
      // 1b3: bipush 0
      // 1b4: goto 1d3
      // 1b7: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 1bf: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 1c2: aload 8
      // 1c4: bipush 0
      // 1c5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1ca: checkcast com/EZ
      // 1cd: invokevirtual com/EZ.f ()I
      // 1d0: isub
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: istore 12
      // 1d5: aload 0
      // 1d6: new java/awt/Insets
      // 1d9: dup
      // 1da: iload 9
      // 1dc: iload 11
      // 1de: iload 10
      // 1e0: iload 12
      // 1e2: invokespecial java/awt/Insets.<init> (IIII)V
      // 1e5: putfield com/pF_3.x Ljava/awt/Insets;
      // 1e8: aload 0
      // 1e9: bipush 1
      // 1ea: invokevirtual com/pF_3.e (Z)I
      // 1ed: pop
      // 1ee: aload 0
      // 1ef: bipush 0
      // 1f0: invokevirtual com/pF_3.e (Z)I
      // 1f3: pop
      // 1f4: aload 0
      // 1f5: bipush 1
      // 1f6: invokevirtual com/pF_3.L (Z)I
      // 1f9: pop
      // 1fa: aload 0
      // 1fb: bipush 0
      // 1fc: invokevirtual com/pF_3.L (Z)I
      // 1ff: pop
      // 200: goto 223
      // 203: aload 0
      // 204: aload 2
      // 205: putfield com/pF_3.Y Ljava/awt/Component;
      // 208: aload 0
      // 209: aload 1
      // 20a: putfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 20d: aload 0
      // 20e: new java/util/ArrayList
      // 211: dup
      // 212: invokespecial java/util/ArrayList.<init> ()V
      // 215: putfield com/pF_3.J Ljava/util/List;
      // 218: aload 0
      // 219: new java/util/ArrayList
      // 21c: dup
      // 21d: invokespecial java/util/ArrayList.<init> ()V
      // 220: putfield com/pF_3.R Ljava/util/List;
      // 223: return
   }

   public static pF_3 D(BufferedImage var0) {
      return new pF_3(var0, null, false);
   }

   public BufferedImage G() {
      return this.d;
   }

   public Component O() {
      return this.Y;
   }

   public void k(Component var1) {
      this.Y = var1;
   }

   public List U() {
      return this.J;
   }

   public void f(List var1) {
      this.J = var1;
      this.a();
   }

   public void H(EZ var1) {
      this.J.add(var1);
      this.a();
   }

   public void L(int var1, int var2, boolean var3) {
      this.H(new EZ(var1, var2, var3));
   }

   public List g() {
      return this.R;
   }

   public void e(List var1) {
      this.R = var1;
      this.o();
   }

   public void o(EZ var1) {
      this.R.add(var1);
      this.o();
   }

   public void s(int var1, int var2, boolean var3) {
      this.o(new EZ(var1, var2, var3));
   }

   public Insets U$Insets() {
      return (Insets)this.x.clone();
   }

   public Insets x() {
      String var10000 = c();
      EZ var2 = (EZ)this.R.get(0);
      EZ var3 = (EZ)this.J.get(0);
      EZ var4 = (EZ)this.R.get(this.R.size() - 1);
      EZ var5 = (EZ)this.J.get(this.J.size() - 1);
      String var1 = var10000;

      try {
         Insets var7 = new Insets(var2.s(), var3.s(), var4.s(), var5.s());
         if (var1 != null) {
            com.ky_4.K(new String[2]);
         }

         return var7;
      } catch (IllegalArgumentException var6) {
         throw a(var6);
      }
   }

   public void H(Insets var1) {
      this.x = var1;
   }

   public void t(int var1, int var2, int var3, int var4) {
      this.H(new Insets(var1, var2, var3, var4));
   }

   public void n(int var1) {
      this.t(var1, var1, var1, var1);
   }

   public void T(Component var1, Graphics var2) {
      this.l((Graphics2D)var2, 0, 0, var1.getWidth(), var1.getHeight());
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      this.l((Graphics2D)var2, 0, 0, var1.getWidth(), var1.getHeight());
   }

   public void n(Graphics2D var1, Rectangle var2) {
      this.l(var1, var2.x, var2.y, var2.width, var2.height);
   }

   public void l(Graphics2D param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: aload 0
      // 003: bipush 1
      // 004: invokevirtual com/pF_3.e (Z)I
      // 007: invokestatic java/lang/Math.max (II)I
      // 00a: istore 7
      // 00c: iload 5
      // 00e: aload 0
      // 00f: bipush 1
      // 010: invokevirtual com/pF_3.L (Z)I
      // 013: invokestatic java/lang/Math.max (II)I
      // 016: istore 8
      // 018: aload 0
      // 019: bipush 0
      // 01a: invokevirtual com/pF_3.e (Z)I
      // 01d: istore 9
      // 01f: invokestatic com/pF_3.c ()Ljava/lang/String;
      // 022: iload 7
      // 024: iload 9
      // 026: isub
      // 027: istore 10
      // 029: aload 0
      // 02a: bipush 0
      // 02b: invokevirtual com/pF_3.L (Z)I
      // 02e: istore 11
      // 030: iload 8
      // 032: iload 11
      // 034: isub
      // 035: istore 12
      // 037: iload 3
      // 038: istore 13
      // 03a: astore 6
      // 03c: aload 0
      // 03d: getfield com/pF_3.R Ljava/util/List;
      // 040: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 045: astore 14
      // 047: aload 14
      // 049: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04e: ifeq 175
      // 051: aload 14
      // 053: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 058: checkcast com/EZ
      // 05b: astore 15
      // 05d: aload 15
      // 05f: invokevirtual com/EZ.f ()I
      // 062: aload 15
      // 064: invokevirtual com/EZ.x ()I
      // 067: isub
      // 068: bipush 1
      // 069: iadd
      // 06a: istore 16
      // 06c: aload 15
      // 06e: invokevirtual com/EZ.C ()Z
      // 071: aload 6
      // 073: ifnonnull 092
      // 076: ifeq 089
      // 079: goto 080
      // 07c: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07f: athrow
      // 080: iload 16
      // 082: istore 17
      // 084: aload 6
      // 086: ifnull 0ac
      // 089: iload 16
      // 08b: goto 092
      // 08e: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 091: athrow
      // 092: i2f
      // 093: aload 0
      // 094: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 097: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 09a: iload 11
      // 09c: isub
      // 09d: i2f
      // 09e: fdiv
      // 09f: fstore 18
      // 0a1: fload 18
      // 0a3: iload 12
      // 0a5: i2f
      // 0a6: fmul
      // 0a7: invokestatic java/lang/Math.round (F)I
      // 0aa: istore 17
      // 0ac: iload 2
      // 0ad: istore 18
      // 0af: aload 0
      // 0b0: getfield com/pF_3.J Ljava/util/List;
      // 0b3: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b8: astore 19
      // 0ba: aload 19
      // 0bc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c1: ifeq 169
      // 0c4: aload 19
      // 0c6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cb: checkcast com/EZ
      // 0ce: astore 20
      // 0d0: aload 20
      // 0d2: invokevirtual com/EZ.f ()I
      // 0d5: aload 20
      // 0d7: invokevirtual com/EZ.x ()I
      // 0da: isub
      // 0db: bipush 1
      // 0dc: iadd
      // 0dd: istore 21
      // 0df: aload 20
      // 0e1: invokevirtual com/EZ.C ()Z
      // 0e4: aload 6
      // 0e6: ifnonnull 16e
      // 0e9: aload 6
      // 0eb: ifnonnull 111
      // 0ee: goto 0f5
      // 0f1: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: ifeq 108
      // 0f8: goto 0ff
      // 0fb: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: iload 21
      // 101: istore 22
      // 103: aload 6
      // 105: ifnull 12b
      // 108: iload 21
      // 10a: goto 111
      // 10d: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: i2f
      // 112: aload 0
      // 113: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 116: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 119: iload 9
      // 11b: isub
      // 11c: i2f
      // 11d: fdiv
      // 11e: fstore 23
      // 120: fload 23
      // 122: iload 10
      // 124: i2f
      // 125: fmul
      // 126: invokestatic java/lang/Math.round (F)I
      // 129: istore 22
      // 12b: aload 1
      // 12c: aload 0
      // 12d: getfield com/pF_3.d Ljava/awt/image/BufferedImage;
      // 130: iload 18
      // 132: iload 13
      // 134: iload 18
      // 136: iload 22
      // 138: iadd
      // 139: iload 13
      // 13b: iload 17
      // 13d: iadd
      // 13e: aload 20
      // 140: invokevirtual com/EZ.x ()I
      // 143: aload 15
      // 145: invokevirtual com/EZ.x ()I
      // 148: aload 20
      // 14a: invokevirtual com/EZ.x ()I
      // 14d: iload 21
      // 14f: iadd
      // 150: aload 15
      // 152: invokevirtual com/EZ.x ()I
      // 155: iload 16
      // 157: iadd
      // 158: aconst_null
      // 159: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 15c: pop
      // 15d: iload 18
      // 15f: iload 22
      // 161: iadd
      // 162: istore 18
      // 164: aload 6
      // 166: ifnull 0ba
      // 169: iload 13
      // 16b: iload 17
      // 16d: iadd
      // 16e: istore 13
      // 170: aload 6
      // 172: ifnull 047
      // 175: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 178: ifnull 188
      // 17b: ldc_w "qEaAHb"
      // 17e: invokestatic com/pF_3.Z (Ljava/lang/String;)V
      // 181: goto 188
      // 184: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 187: athrow
      // 188: return
   }

   public int e(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: ifeq 2d
      // 04: aload 0
      // 05: getfield com/pF_3.c Ljava/lang/Integer;
      // 08: ifnonnull 25
      // 0b: goto 12
      // 0e: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11: athrow
      // 12: aload 0
      // 13: aload 0
      // 14: iload 1
      // 15: invokevirtual com/pF_3.U (Z)I
      // 18: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b: putfield com/pF_3.c Ljava/lang/Integer;
      // 1e: goto 25
      // 21: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/pF_3.c Ljava/lang/Integer;
      // 29: invokevirtual java/lang/Integer.intValue ()I
      // 2c: ireturn
      // 2d: aload 0
      // 2e: getfield com/pF_3.B Ljava/lang/Integer;
      // 31: ifnonnull 47
      // 34: aload 0
      // 35: aload 0
      // 36: iload 1
      // 37: invokevirtual com/pF_3.U (Z)I
      // 3a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d: putfield com/pF_3.B Ljava/lang/Integer;
      // 40: goto 47
      // 43: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/pF_3.B Ljava/lang/Integer;
      // 4b: invokevirtual java/lang/Integer.intValue ()I
      // 4e: ireturn
   }

   protected int U(boolean var1) {
      int var2 = this.d.getWidth();

      for (EZ var4 : this.J) {
         if (!var4.C()) {
            var2 -= var4.f() - var4.x() + 1;

            try {
               if (var1) {
                  var2++;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }
      }

      return var2;
   }

   protected void a() {
      this.c = null;
      this.B = null;
      this.e(true);
      this.e(false);
   }

   public int L(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: ifeq 2d
      // 04: aload 0
      // 05: getfield com/pF_3.k Ljava/lang/Integer;
      // 08: ifnonnull 25
      // 0b: goto 12
      // 0e: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11: athrow
      // 12: aload 0
      // 13: aload 0
      // 14: iload 1
      // 15: invokevirtual com/pF_3.K (Z)I
      // 18: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b: putfield com/pF_3.k Ljava/lang/Integer;
      // 1e: goto 25
      // 21: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/pF_3.k Ljava/lang/Integer;
      // 29: invokevirtual java/lang/Integer.intValue ()I
      // 2c: ireturn
      // 2d: aload 0
      // 2e: getfield com/pF_3.t Ljava/lang/Integer;
      // 31: ifnonnull 47
      // 34: aload 0
      // 35: aload 0
      // 36: iload 1
      // 37: invokevirtual com/pF_3.K (Z)I
      // 3a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d: putfield com/pF_3.t Ljava/lang/Integer;
      // 40: goto 47
      // 43: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/pF_3.t Ljava/lang/Integer;
      // 4b: invokevirtual java/lang/Integer.intValue ()I
      // 4e: ireturn
   }

   protected int K(boolean var1) {
      int var2 = this.d.getHeight();

      for (EZ var4 : this.R) {
         if (!var4.C()) {
            var2 -= var4.f() - var4.x() + 1;

            try {
               if (var1) {
                  var2++;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }
      }

      return var2;
   }

   protected void o() {
      this.k = null;
      this.t = null;
      this.L(true);
      this.L(false);
   }

   @Override
   public int getIconWidth() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pF_3.c ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/pF_3.Y Ljava/awt/Component;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pF_3.Y Ljava/awt/Component;
      // 1a: goto 21
      // 1d: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: invokevirtual java/awt/Component.getWidth ()I
      // 24: goto 28
      // 27: bipush 0
      // 28: aload 0
      // 29: bipush 1
      // 2a: invokevirtual com/pF_3.e (Z)I
      // 2d: invokestatic java/lang/Math.max (II)I
      // 30: ireturn
   }

   @Override
   public int getIconHeight() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/pF_3.c ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/pF_3.Y Ljava/awt/Component;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/pF_3.Y Ljava/awt/Component;
      // 1a: goto 21
      // 1d: invokestatic com/pF_3.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: invokevirtual java/awt/Component.getHeight ()I
      // 24: goto 28
      // 27: bipush 0
      // 28: aload 0
      // 29: bipush 1
      // 2a: invokevirtual com/pF_3.L (Z)I
      // 2d: invokestatic java/lang/Math.max (II)I
      // 30: ireturn
   }

   public Dimension R() {
      return new Dimension(this.e(true), this.L(true));
   }

   public Dimension s() {
      return new Dimension(this.G().getWidth(), this.G().getHeight());
   }

   public static void Z(String var0) {
      L = var0;
   }

   public static String c() {
      return L;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "öÅ\u0086R÷\u0099zW)_;&ËÄî³¸\u0092PdºñÖ¢Ý\u009d/\u001bcÕe$\u0018é|$M¶ß%JM\u001bk0\u001b4Ã\u0084÷Ðº\rÛÌG\u0002\u00820\u001a ÅÛã³Ü×!é\u00adB\u0083Q¬m2wQ\u0089\u0012à\u0004tw§\u0019u\u0005I¼O$ôÎ_¸ò?B";
      int var4 = "öÅ\u0086R÷\u0099zW)_;&ËÄî³¸\u0092PdºñÖ¢Ý\u009d/\u001bcÕe$\u0018é|$M¶ß%JM\u001bk0\u001b4Ã\u0084÷Ðº\rÛÌG\u0002\u00820\u001a ÅÛã³Ü×!é\u00adB\u0083Q¬m2wQ\u0089\u0012à\u0004tw§\u0019u\u0005I¼O$ôÎ_¸ò?B"
         .length();
      char var1 = '.';
      Z(null);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 29;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            } else {
               var13 = 29;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 29;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 12;
                     break;
                  case 1:
                     var29 = 63;
                     break;
                  case 2:
                     var29 = 11;
                     break;
                  case 3:
                     var29 = 14;
                     break;
                  case 4:
                     var29 = 55;
                     break;
                  case 5:
                     var29 = 116;
                     break;
                  default:
                     var29 = 112;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 12761) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 114;
               break;
            case 1:
               var10000 = 238;
               break;
            case 2:
               var10000 = 104;
               break;
            case 3:
               var10000 = 181;
               break;
            case 4:
               var10000 = 142;
               break;
            case 5:
               var10000 = 222;
               break;
            case 6:
               var10000 = 119;
               break;
            case 7:
               var10000 = 196;
               break;
            case 8:
               var10000 = 244;
               break;
            case 9:
               var10000 = 215;
               break;
            case 10:
               var10000 = 187;
               break;
            case 11:
               var10000 = 172;
               break;
            case 12:
               var10000 = 53;
               break;
            case 13:
               var10000 = 226;
               break;
            case 14:
               var10000 = 25;
               break;
            case 15:
               var10000 = 174;
               break;
            case 16:
               var10000 = 42;
               break;
            case 17:
               var10000 = 202;
               break;
            case 18:
               var10000 = 47;
               break;
            case 19:
               var10000 = 122;
               break;
            case 20:
               var10000 = 88;
               break;
            case 21:
               var10000 = 97;
               break;
            case 22:
               var10000 = 177;
               break;
            case 23:
               var10000 = 45;
               break;
            case 24:
               var10000 = 155;
               break;
            case 25:
               var10000 = 39;
               break;
            case 26:
               var10000 = 152;
               break;
            case 27:
               var10000 = 73;
               break;
            case 28:
               var10000 = 110;
               break;
            case 29:
               var10000 = 251;
               break;
            case 30:
               var10000 = 210;
               break;
            case 31:
               var10000 = 216;
               break;
            case 32:
               var10000 = 185;
               break;
            case 33:
               var10000 = 108;
               break;
            case 34:
               var10000 = 217;
               break;
            case 35:
               var10000 = 190;
               break;
            case 36:
               var10000 = 153;
               break;
            case 37:
               var10000 = 249;
               break;
            case 38:
               var10000 = 248;
               break;
            case 39:
               var10000 = 233;
               break;
            case 40:
               var10000 = 22;
               break;
            case 41:
               var10000 = 145;
               break;
            case 42:
               var10000 = 231;
               break;
            case 43:
               var10000 = 255;
               break;
            case 44:
               var10000 = 179;
               break;
            case 45:
               var10000 = 197;
               break;
            case 46:
               var10000 = 57;
               break;
            case 47:
               var10000 = 37;
               break;
            case 48:
               var10000 = 151;
               break;
            case 49:
               var10000 = 150;
               break;
            case 50:
               var10000 = 252;
               break;
            case 51:
               var10000 = 139;
               break;
            case 52:
               var10000 = 247;
               break;
            case 53:
               var10000 = 176;
               break;
            case 54:
               var10000 = 87;
               break;
            case 55:
               var10000 = 98;
               break;
            case 56:
               var10000 = 230;
               break;
            case 57:
               var10000 = 189;
               break;
            case 58:
               var10000 = 80;
               break;
            case 59:
               var10000 = 105;
               break;
            case 60:
               var10000 = 184;
               break;
            case 61:
               var10000 = 138;
               break;
            case 62:
               var10000 = 69;
               break;
            case 63:
               var10000 = 158;
               break;
            case 64:
               var10000 = 165;
               break;
            case 65:
               var10000 = 10;
               break;
            case 66:
               var10000 = 237;
               break;
            case 67:
               var10000 = 212;
               break;
            case 68:
               var10000 = 18;
               break;
            case 69:
               var10000 = 169;
               break;
            case 70:
               var10000 = 208;
               break;
            case 71:
               var10000 = 253;
               break;
            case 72:
               var10000 = 20;
               break;
            case 73:
               var10000 = 154;
               break;
            case 74:
               var10000 = 38;
               break;
            case 75:
               var10000 = 205;
               break;
            case 76:
               var10000 = 62;
               break;
            case 77:
               var10000 = 7;
               break;
            case 78:
               var10000 = 111;
               break;
            case 79:
               var10000 = 15;
               break;
            case 80:
               var10000 = 86;
               break;
            case 81:
               var10000 = 66;
               break;
            case 82:
               var10000 = 227;
               break;
            case 83:
               var10000 = 160;
               break;
            case 84:
               var10000 = 91;
               break;
            case 85:
               var10000 = 116;
               break;
            case 86:
               var10000 = 209;
               break;
            case 87:
               var10000 = 77;
               break;
            case 88:
               var10000 = 162;
               break;
            case 89:
               var10000 = 89;
               break;
            case 90:
               var10000 = 240;
               break;
            case 91:
               var10000 = 34;
               break;
            case 92:
               var10000 = 127;
               break;
            case 93:
               var10000 = 143;
               break;
            case 94:
               var10000 = 183;
               break;
            case 95:
               var10000 = 3;
               break;
            case 96:
               var10000 = 36;
               break;
            case 97:
               var10000 = 245;
               break;
            case 98:
               var10000 = 242;
               break;
            case 99:
               var10000 = 206;
               break;
            case 100:
               var10000 = 63;
               break;
            case 101:
               var10000 = 123;
               break;
            case 102:
               var10000 = 243;
               break;
            case 103:
               var10000 = 55;
               break;
            case 104:
               var10000 = 129;
               break;
            case 105:
               var10000 = 27;
               break;
            case 106:
               var10000 = 24;
               break;
            case 107:
               var10000 = 213;
               break;
            case 108:
               var10000 = 239;
               break;
            case 109:
               var10000 = 94;
               break;
            case 110:
               var10000 = 161;
               break;
            case 111:
               var10000 = 107;
               break;
            case 112:
               var10000 = 35;
               break;
            case 113:
               var10000 = 65;
               break;
            case 114:
               var10000 = 67;
               break;
            case 115:
               var10000 = 33;
               break;
            case 116:
               var10000 = 112;
               break;
            case 117:
               var10000 = 54;
               break;
            case 118:
               var10000 = 61;
               break;
            case 119:
               var10000 = 125;
               break;
            case 120:
               var10000 = 19;
               break;
            case 121:
               var10000 = 121;
               break;
            case 122:
               var10000 = 236;
               break;
            case 123:
               var10000 = 166;
               break;
            case 124:
               var10000 = 46;
               break;
            case 125:
               var10000 = 232;
               break;
            case 126:
               var10000 = 120;
               break;
            case 127:
               var10000 = 223;
               break;
            case 128:
               var10000 = 199;
               break;
            case 129:
               var10000 = 56;
               break;
            case 130:
               var10000 = 171;
               break;
            case 131:
               var10000 = 58;
               break;
            case 132:
               var10000 = 9;
               break;
            case 133:
               var10000 = 141;
               break;
            case 134:
               var10000 = 219;
               break;
            case 135:
               var10000 = 235;
               break;
            case 136:
               var10000 = 194;
               break;
            case 137:
               var10000 = 102;
               break;
            case 138:
               var10000 = 218;
               break;
            case 139:
               var10000 = 21;
               break;
            case 140:
               var10000 = 191;
               break;
            case 141:
               var10000 = 246;
               break;
            case 142:
               var10000 = 93;
               break;
            case 143:
               var10000 = 159;
               break;
            case 144:
               var10000 = 81;
               break;
            case 145:
               var10000 = 48;
               break;
            case 146:
               var10000 = 50;
               break;
            case 147:
               var10000 = 173;
               break;
            case 148:
               var10000 = 146;
               break;
            case 149:
               var10000 = 78;
               break;
            case 150:
               var10000 = 118;
               break;
            case 151:
               var10000 = 193;
               break;
            case 152:
               var10000 = 100;
               break;
            case 153:
               var10000 = 79;
               break;
            case 154:
               var10000 = 13;
               break;
            case 155:
               var10000 = 68;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 180;
               break;
            case 158:
               var10000 = 168;
               break;
            case 159:
               var10000 = 109;
               break;
            case 160:
               var10000 = 228;
               break;
            case 161:
               var10000 = 203;
               break;
            case 162:
               var10000 = 147;
               break;
            case 163:
               var10000 = 76;
               break;
            case 164:
               var10000 = 28;
               break;
            case 165:
               var10000 = 90;
               break;
            case 166:
               var10000 = 72;
               break;
            case 167:
               var10000 = 14;
               break;
            case 168:
               var10000 = 126;
               break;
            case 169:
               var10000 = 71;
               break;
            case 170:
               var10000 = 95;
               break;
            case 171:
               var10000 = 124;
               break;
            case 172:
               var10000 = 241;
               break;
            case 173:
               var10000 = 4;
               break;
            case 174:
               var10000 = 117;
               break;
            case 175:
               var10000 = 74;
               break;
            case 176:
               var10000 = 221;
               break;
            case 177:
               var10000 = 164;
               break;
            case 178:
               var10000 = 51;
               break;
            case 179:
               var10000 = 64;
               break;
            case 180:
               var10000 = 136;
               break;
            case 181:
               var10000 = 157;
               break;
            case 182:
               var10000 = 96;
               break;
            case 183:
               var10000 = 250;
               break;
            case 184:
               var10000 = 167;
               break;
            case 185:
               var10000 = 12;
               break;
            case 186:
               var10000 = 207;
               break;
            case 187:
               var10000 = 128;
               break;
            case 188:
               var10000 = 131;
               break;
            case 189:
               var10000 = 134;
               break;
            case 190:
               var10000 = 254;
               break;
            case 191:
               var10000 = 133;
               break;
            case 192:
               var10000 = 156;
               break;
            case 193:
               var10000 = 170;
               break;
            case 194:
               var10000 = 0;
               break;
            case 195:
               var10000 = 214;
               break;
            case 196:
               var10000 = 234;
               break;
            case 197:
               var10000 = 229;
               break;
            case 198:
               var10000 = 41;
               break;
            case 199:
               var10000 = 83;
               break;
            case 200:
               var10000 = 59;
               break;
            case 201:
               var10000 = 82;
               break;
            case 202:
               var10000 = 135;
               break;
            case 203:
               var10000 = 115;
               break;
            case 204:
               var10000 = 198;
               break;
            case 205:
               var10000 = 140;
               break;
            case 206:
               var10000 = 113;
               break;
            case 207:
               var10000 = 132;
               break;
            case 208:
               var10000 = 99;
               break;
            case 209:
               var10000 = 195;
               break;
            case 210:
               var10000 = 106;
               break;
            case 211:
               var10000 = 148;
               break;
            case 212:
               var10000 = 31;
               break;
            case 213:
               var10000 = 188;
               break;
            case 214:
               var10000 = 84;
               break;
            case 215:
               var10000 = 200;
               break;
            case 216:
               var10000 = 225;
               break;
            case 217:
               var10000 = 44;
               break;
            case 218:
               var10000 = 92;
               break;
            case 219:
               var10000 = 40;
               break;
            case 220:
               var10000 = 204;
               break;
            case 221:
               var10000 = 60;
               break;
            case 222:
               var10000 = 149;
               break;
            case 223:
               var10000 = 5;
               break;
            case 224:
               var10000 = 1;
               break;
            case 225:
               var10000 = 11;
               break;
            case 226:
               var10000 = 30;
               break;
            case 227:
               var10000 = 101;
               break;
            case 228:
               var10000 = 32;
               break;
            case 229:
               var10000 = 17;
               break;
            case 230:
               var10000 = 52;
               break;
            case 231:
               var10000 = 70;
               break;
            case 232:
               var10000 = 23;
               break;
            case 233:
               var10000 = 178;
               break;
            case 234:
               var10000 = 175;
               break;
            case 235:
               var10000 = 192;
               break;
            case 236:
               var10000 = 211;
               break;
            case 237:
               var10000 = 16;
               break;
            case 238:
               var10000 = 137;
               break;
            case 239:
               var10000 = 75;
               break;
            case 240:
               var10000 = 182;
               break;
            case 241:
               var10000 = 201;
               break;
            case 242:
               var10000 = 8;
               break;
            case 243:
               var10000 = 103;
               break;
            case 244:
               var10000 = 2;
               break;
            case 245:
               var10000 = 130;
               break;
            case 246:
               var10000 = 43;
               break;
            case 247:
               var10000 = 220;
               break;
            case 248:
               var10000 = 49;
               break;
            case 249:
               var10000 = 26;
               break;
            case 250:
               var10000 = 186;
               break;
            case 251:
               var10000 = 144;
               break;
            case 252:
               var10000 = 163;
               break;
            case 253:
               var10000 = 29;
               break;
            case 254:
               var10000 = 6;
               break;
            default:
               var10000 = 224;
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
}





