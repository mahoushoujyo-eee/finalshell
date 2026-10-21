package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class TA extends T4 implements SwingConstants {
   public Map L = new HashMap();
   public int T = GO.FJ;
   public int i = GO.F_;
   public int R = 0;
   public Insets I = null;
   public static String[] a;
   public static String[] b;

   public TA() {
   }

   public TA(int var1) {
      this.T = var1;
   }

   public TA(int var1, int var2) {
      this.T = var1;
      this.R = var2;
   }

   public TA(int var1, int var2, int var3) {
      this.T = var1;
      this.i = var2;
      this.R = var3;
   }

   public Map C() {
      return this.L;
   }

   public void w(Map var1) {
      this.L = var1;
   }

   public int Q() {
      return this.T;
   }

   public void H(int var1) {
      this.T = var1;
   }

   public int h() {
      return this.i;
   }

   public void f(int var1) {
      this.i = var1;
   }

   public int N() {
      return this.R;
   }

   public void c(int var1) {
      this.R = var1;
   }

   public Insets x() {
      return this.I;
   }

   public void M(Insets var1) {
      this.I = var1;
   }

   @Override
   public void A(Component param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/T4.b ()I
      // 003: aload 2
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: istore 3
      // 00a: aload 4
      // 00c: iload 3
      // 00d: ifeq 026
      // 010: ifnull 0cf
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 019: athrow
      // 01a: aload 4
      // 01c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 025: athrow
      // 026: ldc ""
      // 028: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02b: iload 3
      // 02c: ifeq 04e
      // 02f: ifne 0cf
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 038: athrow
      // 039: aload 4
      // 03b: sipush 18976
      // 03e: sipush -32644
      // 041: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 044: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04d: athrow
      // 04e: iload 3
      // 04f: ifeq 071
      // 052: ifne 0cf
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05b: athrow
      // 05c: aload 4
      // 05e: sipush 18990
      // 061: sipush -9011
      // 064: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 067: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 070: athrow
      // 071: iload 3
      // 072: ifeq 094
      // 075: ifne 0cf
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07e: athrow
      // 07f: aload 4
      // 081: sipush 18984
      // 084: sipush 3581
      // 087: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 08a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: iload 3
      // 095: ifeq 0b7
      // 098: ifne 0cf
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: sipush 18989
      // 0a7: sipush 26262
      // 0aa: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 0ad: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: ifne 0cf
      // 0ba: new java/lang/IllegalArgumentException
      // 0bd: dup
      // 0be: sipush 18988
      // 0c1: sipush -30915
      // 0c4: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 0c7: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ca: athrow
      // 0cb: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 0d3: aload 1
      // 0d4: aload 4
      // 0d6: iload 3
      // 0d7: ifeq 113
      // 0da: ifnull 103
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: aload 4
      // 0e6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0e9: iload 3
      // 0ea: ifeq 113
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: ldc ""
      // 0f6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f9: ifeq 116
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: sipush 18976
      // 106: sipush -32644
      // 109: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 112: athrow
      // 113: goto 118
      // 116: aload 4
      // 118: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11d: pop
      // 11e: return
   }

   @Override
   public void F(Component var1) {
      this.L.remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual com/finalshell/core/TA.Y (Ljava/awt/Container;)Ljava/awt/Insets;
      // 005: astore 3
      // 006: invokestatic com/finalshell/core/T4.O ()I
      // 009: new java/awt/Dimension
      // 00c: dup
      // 00d: aload 3
      // 00e: getfield java/awt/Insets.left I
      // 011: aload 3
      // 012: getfield java/awt/Insets.right I
      // 015: iadd
      // 016: aload 3
      // 017: getfield java/awt/Insets.top I
      // 01a: aload 3
      // 01b: getfield java/awt/Insets.bottom I
      // 01e: iadd
      // 01f: invokespecial java/awt/Dimension.<init> (II)V
      // 022: astore 4
      // 024: istore 2
      // 025: aload 1
      // 026: invokevirtual java/awt/Container.getComponentCount ()I
      // 029: istore 5
      // 02b: bipush 0
      // 02c: istore 6
      // 02e: iload 6
      // 030: iload 5
      // 032: if_icmpge 118
      // 035: aload 1
      // 036: iload 6
      // 038: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 03b: astore 7
      // 03d: aload 7
      // 03f: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 042: astore 8
      // 044: iload 2
      // 045: ifne 0de
      // 048: aload 0
      // 049: getfield com/finalshell/core/TA.R I
      // 04c: iload 2
      // 04d: ifne 125
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 056: athrow
      // 057: ifne 0bb
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 060: athrow
      // 061: aload 4
      // 063: dup
      // 064: getfield java/awt/Dimension.width I
      // 067: aload 8
      // 069: getfield java/awt/Dimension.width I
      // 06c: iload 6
      // 06e: iload 2
      // 06f: ifne 092
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 078: athrow
      // 079: iload 5
      // 07b: bipush 1
      // 07c: isub
      // 07d: if_icmpge 095
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 086: athrow
      // 087: aload 0
      // 088: getfield com/finalshell/core/TA.T I
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 091: athrow
      // 092: goto 096
      // 095: bipush 0
      // 096: iadd
      // 097: iadd
      // 098: putfield java/awt/Dimension.width I
      // 09b: aload 4
      // 09d: aload 4
      // 09f: getfield java/awt/Dimension.height I
      // 0a2: aload 8
      // 0a4: getfield java/awt/Dimension.height I
      // 0a7: aload 3
      // 0a8: getfield java/awt/Insets.top I
      // 0ab: iadd
      // 0ac: aload 3
      // 0ad: getfield java/awt/Insets.bottom I
      // 0b0: iadd
      // 0b1: invokestatic java/lang/Math.max (II)I
      // 0b4: putfield java/awt/Dimension.height I
      // 0b7: iload 2
      // 0b8: ifeq 111
      // 0bb: aload 4
      // 0bd: aload 4
      // 0bf: getfield java/awt/Dimension.width I
      // 0c2: aload 8
      // 0c4: getfield java/awt/Dimension.width I
      // 0c7: aload 3
      // 0c8: getfield java/awt/Insets.left I
      // 0cb: iadd
      // 0cc: aload 3
      // 0cd: getfield java/awt/Insets.right I
      // 0d0: iadd
      // 0d1: invokestatic java/lang/Math.max (II)I
      // 0d4: putfield java/awt/Dimension.width I
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: dup
      // 0e1: getfield java/awt/Dimension.height I
      // 0e4: aload 8
      // 0e6: getfield java/awt/Dimension.height I
      // 0e9: iload 6
      // 0eb: iload 2
      // 0ec: ifne 108
      // 0ef: iload 5
      // 0f1: bipush 1
      // 0f2: isub
      // 0f3: if_icmpge 10b
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/TA.T I
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 107: athrow
      // 108: goto 10c
      // 10b: bipush 0
      // 10c: iadd
      // 10d: iadd
      // 10e: putfield java/awt/Dimension.height I
      // 111: iinc 6 1
      // 114: iload 2
      // 115: ifeq 02e
      // 118: aload 0
      // 119: sipush 18976
      // 11c: sipush -32644
      // 11f: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 122: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 125: iload 2
      // 126: ifne 147
      // 129: ifeq 19d
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 132: athrow
      // 133: aload 0
      // 134: sipush 18989
      // 137: sipush 26262
      // 13a: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 13d: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 146: athrow
      // 147: iload 2
      // 148: ifne 169
      // 14b: ifeq 19d
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 154: athrow
      // 155: aload 0
      // 156: sipush 18990
      // 159: sipush -9011
      // 15c: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 15f: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: iload 2
      // 16a: ifne 18b
      // 16d: ifne 19d
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 176: athrow
      // 177: aload 0
      // 178: sipush 18984
      // 17b: sipush 3581
      // 17e: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 181: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18a: athrow
      // 18b: iload 2
      // 18c: ifne 19a
      // 18f: ifne 19d
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 198: athrow
      // 199: bipush 1
      // 19a: goto 19e
      // 19d: bipush 0
      // 19e: istore 6
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/TA.R I
      // 1a4: iload 2
      // 1a5: ifne 1e0
      // 1a8: ifne 1d7
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b1: athrow
      // 1b2: iload 6
      // 1b4: ifeq 1f8
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bd: athrow
      // 1be: aload 4
      // 1c0: dup
      // 1c1: getfield java/awt/Dimension.width I
      // 1c4: aload 0
      // 1c5: getfield com/finalshell/core/TA.i I
      // 1c8: iadd
      // 1c9: putfield java/awt/Dimension.width I
      // 1cc: iload 2
      // 1cd: ifeq 1f8
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d6: athrow
      // 1d7: iload 6
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1df: athrow
      // 1e0: ifeq 1f8
      // 1e3: aload 4
      // 1e5: dup
      // 1e6: getfield java/awt/Dimension.height I
      // 1e9: aload 0
      // 1ea: getfield com/finalshell/core/TA.i I
      // 1ed: iadd
      // 1ee: putfield java/awt/Dimension.height I
      // 1f1: goto 1f8
      // 1f4: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f7: athrow
      // 1f8: aload 4
      // 1fa: areturn
   }

   @Override
   public void layoutContainer(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/T4.b ()I
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/TA.Y (Ljava/awt/Container;)Ljava/awt/Insets;
      // 008: astore 3
      // 009: istore 2
      // 00a: aload 0
      // 00b: getfield com/finalshell/core/TA.R I
      // 00e: iload 2
      // 00f: ifeq 608
      // 012: ifne 5fd
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01b: athrow
      // 01c: aload 1
      // 01d: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 020: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 023: iload 2
      // 024: ifeq 322
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02d: athrow
      // 02e: ifeq 317
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 037: athrow
      // 038: aload 3
      // 039: getfield java/awt/Insets.left I
      // 03c: istore 4
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: aload 1
      // 044: invokevirtual java/awt/Container.getComponentCount ()I
      // 047: if_icmpge 100
      // 04a: aload 1
      // 04b: iload 5
      // 04d: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 050: astore 6
      // 052: aload 0
      // 053: iload 2
      // 054: ifeq 10c
      // 057: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 05a: aload 6
      // 05c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 061: iload 2
      // 062: ifeq 088
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06b: athrow
      // 06c: ifnull 0c5
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 075: athrow
      // 076: aload 0
      // 077: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 07a: aload 6
      // 07c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 087: athrow
      // 088: checkcast java/lang/String
      // 08b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08e: ldc ""
      // 090: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 093: iload 2
      // 094: ifeq 0c2
      // 097: ifne 0c5
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 0a5: aload 6
      // 0a7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ac: checkcast java/lang/String
      // 0af: sipush 18985
      // 0b2: sipush 26538
      // 0b5: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c1: athrow
      // 0c2: ifeq 0f9
      // 0c5: aload 6
      // 0c7: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 0ca: astore 7
      // 0cc: aload 6
      // 0ce: iload 4
      // 0d0: aload 3
      // 0d1: getfield java/awt/Insets.top I
      // 0d4: aload 7
      // 0d6: getfield java/awt/Dimension.width I
      // 0d9: aload 1
      // 0da: invokevirtual java/awt/Container.getHeight ()I
      // 0dd: aload 3
      // 0de: getfield java/awt/Insets.top I
      // 0e1: isub
      // 0e2: aload 3
      // 0e3: getfield java/awt/Insets.bottom I
      // 0e6: isub
      // 0e7: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0ea: iload 4
      // 0ec: aload 7
      // 0ee: getfield java/awt/Dimension.width I
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/TA.T I
      // 0f5: iadd
      // 0f6: iadd
      // 0f7: istore 4
      // 0f9: iinc 5 1
      // 0fc: iload 2
      // 0fd: ifne 041
      // 100: aload 1
      // 101: invokevirtual java/awt/Container.getWidth ()I
      // 104: aload 3
      // 105: getfield java/awt/Insets.right I
      // 108: isub
      // 109: istore 5
      // 10b: aload 0
      // 10c: sipush 18987
      // 10f: sipush 7225
      // 112: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 115: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 118: iload 2
      // 119: ifeq 1c4
      // 11c: ifeq 1c2
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 125: athrow
      // 126: aload 1
      // 127: invokevirtual java/awt/Container.getComponentCount ()I
      // 12a: bipush 1
      // 12b: isub
      // 12c: istore 6
      // 12e: iload 6
      // 130: iflt 1c2
      // 133: aload 1
      // 134: iload 6
      // 136: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 139: astore 7
      // 13b: iload 2
      // 13c: ifeq 1be
      // 13f: aload 0
      // 140: iload 2
      // 141: ifeq 1dc
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14a: athrow
      // 14b: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 14e: aload 7
      // 150: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 155: ifnull 1bb
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 163: aload 7
      // 165: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 16a: checkcast java/lang/String
      // 16d: sipush 18989
      // 170: sipush 26262
      // 173: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 176: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 179: ifeq 1bb
      // 17c: goto 183
      // 17f: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 182: athrow
      // 183: aload 7
      // 185: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 188: astore 8
      // 18a: iload 5
      // 18c: aload 8
      // 18e: getfield java/awt/Dimension.width I
      // 191: isub
      // 192: istore 5
      // 194: aload 7
      // 196: iload 5
      // 198: aload 3
      // 199: getfield java/awt/Insets.top I
      // 19c: aload 8
      // 19e: getfield java/awt/Dimension.width I
      // 1a1: aload 1
      // 1a2: invokevirtual java/awt/Container.getHeight ()I
      // 1a5: aload 3
      // 1a6: getfield java/awt/Insets.top I
      // 1a9: isub
      // 1aa: aload 3
      // 1ab: getfield java/awt/Insets.bottom I
      // 1ae: isub
      // 1af: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1b2: iload 5
      // 1b4: aload 0
      // 1b5: getfield com/finalshell/core/TA.T I
      // 1b8: isub
      // 1b9: istore 5
      // 1bb: iinc 6 -1
      // 1be: iload 2
      // 1bf: ifne 12e
      // 1c2: iload 5
      // 1c4: iload 2
      // 1c5: ifeq 1e8
      // 1c8: iload 4
      // 1ca: if_icmple 313
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: goto 1dc
      // 1d8: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1db: athrow
      // 1dc: sipush 18991
      // 1df: sipush 11984
      // 1e2: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 1e5: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 1e8: iload 2
      // 1e9: ifeq 20a
      // 1ec: ifne 20d
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: sipush 18986
      // 1fa: sipush 11805
      // 1fd: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 200: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 209: athrow
      // 20a: ifeq 313
      // 20d: aload 1
      // 20e: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 211: astore 6
      // 213: aload 6
      // 215: arraylength
      // 216: istore 7
      // 218: bipush 0
      // 219: istore 8
      // 21b: iload 8
      // 21d: iload 7
      // 21f: if_icmpge 313
      // 222: aload 6
      // 224: iload 8
      // 226: aaload
      // 227: astore 9
      // 229: iload 2
      // 22a: ifeq 8a9
      // 22d: iload 2
      // 22e: ifeq 30f
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 237: athrow
      // 238: aload 0
      // 239: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 23c: aload 9
      // 23e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 243: ifnull 30c
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24c: athrow
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 251: aload 9
      // 253: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 258: checkcast java/lang/String
      // 25b: sipush 18990
      // 25e: sipush -9011
      // 261: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 264: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 267: iload 2
      // 268: ifeq 2e0
      // 26b: goto 272
      // 26e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 271: athrow
      // 272: ifeq 2bf
      // 275: goto 27c
      // 278: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27b: athrow
      // 27c: aload 9
      // 27e: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 281: astore 10
      // 283: aload 9
      // 285: iload 4
      // 287: iload 4
      // 289: iload 5
      // 28b: iadd
      // 28c: bipush 2
      // 28d: idiv
      // 28e: aload 10
      // 290: getfield java/awt/Dimension.width I
      // 293: bipush 2
      // 294: idiv
      // 295: isub
      // 296: invokestatic java/lang/Math.max (II)I
      // 299: aload 3
      // 29a: getfield java/awt/Insets.top I
      // 29d: aload 10
      // 29f: getfield java/awt/Dimension.width I
      // 2a2: iload 5
      // 2a4: iload 4
      // 2a6: isub
      // 2a7: invokestatic java/lang/Math.min (II)I
      // 2aa: aload 1
      // 2ab: invokevirtual java/awt/Container.getHeight ()I
      // 2ae: aload 3
      // 2af: getfield java/awt/Insets.top I
      // 2b2: isub
      // 2b3: aload 3
      // 2b4: getfield java/awt/Insets.bottom I
      // 2b7: isub
      // 2b8: invokevirtual java/awt/Component.setBounds (IIII)V
      // 2bb: iload 2
      // 2bc: ifne 30c
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 2c3: aload 9
      // 2c5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2ca: checkcast java/lang/String
      // 2cd: sipush 18984
      // 2d0: sipush 3581
      // 2d3: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 2d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d9: goto 2e0
      // 2dc: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2df: athrow
      // 2e0: ifeq 30c
      // 2e3: aload 9
      // 2e5: iload 4
      // 2e7: aload 3
      // 2e8: getfield java/awt/Insets.top I
      // 2eb: bipush 0
      // 2ec: iload 5
      // 2ee: iload 4
      // 2f0: isub
      // 2f1: invokestatic java/lang/Math.max (II)I
      // 2f4: aload 1
      // 2f5: invokevirtual java/awt/Container.getHeight ()I
      // 2f8: aload 3
      // 2f9: getfield java/awt/Insets.top I
      // 2fc: isub
      // 2fd: aload 3
      // 2fe: getfield java/awt/Insets.bottom I
      // 301: isub
      // 302: invokevirtual java/awt/Component.setBounds (IIII)V
      // 305: goto 30c
      // 308: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30b: athrow
      // 30c: iinc 8 1
      // 30f: iload 2
      // 310: ifne 21b
      // 313: iload 2
      // 314: ifne 8a9
      // 317: aload 3
      // 318: getfield java/awt/Insets.left I
      // 31b: goto 322
      // 31e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 321: athrow
      // 322: istore 4
      // 324: aload 0
      // 325: sipush 18989
      // 328: sipush 26262
      // 32b: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 32e: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 331: iload 2
      // 332: ifeq 3e0
      // 335: ifeq 3d7
      // 338: goto 33f
      // 33b: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33e: athrow
      // 33f: aload 1
      // 340: invokevirtual java/awt/Container.getComponentCount ()I
      // 343: bipush 1
      // 344: isub
      // 345: istore 5
      // 347: iload 5
      // 349: iflt 3d7
      // 34c: aload 1
      // 34d: iload 5
      // 34f: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 352: astore 6
      // 354: iload 2
      // 355: ifeq 3e2
      // 358: iload 2
      // 359: ifeq 3d3
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 362: athrow
      // 363: aload 0
      // 364: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 367: aload 6
      // 369: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 36e: ifnull 3d0
      // 371: goto 378
      // 374: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 377: athrow
      // 378: aload 0
      // 379: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 37c: aload 6
      // 37e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 383: checkcast java/lang/String
      // 386: sipush 18989
      // 389: sipush 26262
      // 38c: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 38f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 392: ifeq 3d0
      // 395: goto 39c
      // 398: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39b: athrow
      // 39c: aload 6
      // 39e: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 3a1: astore 7
      // 3a3: aload 6
      // 3a5: iload 4
      // 3a7: aload 3
      // 3a8: getfield java/awt/Insets.top I
      // 3ab: aload 7
      // 3ad: getfield java/awt/Dimension.width I
      // 3b0: aload 1
      // 3b1: invokevirtual java/awt/Container.getHeight ()I
      // 3b4: aload 3
      // 3b5: getfield java/awt/Insets.top I
      // 3b8: isub
      // 3b9: aload 3
      // 3ba: getfield java/awt/Insets.bottom I
      // 3bd: isub
      // 3be: invokevirtual java/awt/Component.setBounds (IIII)V
      // 3c1: iload 4
      // 3c3: aload 7
      // 3c5: getfield java/awt/Dimension.width I
      // 3c8: aload 0
      // 3c9: getfield com/finalshell/core/TA.T I
      // 3cc: iadd
      // 3cd: iadd
      // 3ce: istore 4
      // 3d0: iinc 5 -1
      // 3d3: iload 2
      // 3d4: ifne 347
      // 3d7: aload 1
      // 3d8: invokevirtual java/awt/Container.getWidth ()I
      // 3db: aload 3
      // 3dc: getfield java/awt/Insets.right I
      // 3df: isub
      // 3e0: istore 5
      // 3e2: bipush 0
      // 3e3: istore 6
      // 3e5: iload 6
      // 3e7: aload 1
      // 3e8: invokevirtual java/awt/Container.getComponentCount ()I
      // 3eb: if_icmpge 4a8
      // 3ee: aload 1
      // 3ef: iload 6
      // 3f1: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 3f4: astore 7
      // 3f6: aload 0
      // 3f7: iload 2
      // 3f8: ifeq 4c2
      // 3fb: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 3fe: aload 7
      // 400: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 405: iload 2
      // 406: ifeq 42c
      // 409: goto 410
      // 40c: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40f: athrow
      // 410: ifnull 469
      // 413: goto 41a
      // 416: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 419: athrow
      // 41a: aload 0
      // 41b: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 41e: aload 7
      // 420: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 425: goto 42c
      // 428: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42b: athrow
      // 42c: checkcast java/lang/String
      // 42f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 432: ldc ""
      // 434: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 437: iload 2
      // 438: ifeq 466
      // 43b: ifne 469
      // 43e: goto 445
      // 441: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 444: athrow
      // 445: aload 0
      // 446: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 449: aload 7
      // 44b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 450: checkcast java/lang/String
      // 453: sipush 18976
      // 456: sipush -32644
      // 459: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 45c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45f: goto 466
      // 462: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 465: athrow
      // 466: ifeq 4a1
      // 469: aload 7
      // 46b: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 46e: astore 8
      // 470: iload 5
      // 472: aload 8
      // 474: getfield java/awt/Dimension.width I
      // 477: isub
      // 478: istore 5
      // 47a: aload 7
      // 47c: iload 5
      // 47e: aload 3
      // 47f: getfield java/awt/Insets.top I
      // 482: aload 8
      // 484: getfield java/awt/Dimension.width I
      // 487: aload 1
      // 488: invokevirtual java/awt/Container.getHeight ()I
      // 48b: aload 3
      // 48c: getfield java/awt/Insets.top I
      // 48f: isub
      // 490: aload 3
      // 491: getfield java/awt/Insets.bottom I
      // 494: isub
      // 495: invokevirtual java/awt/Component.setBounds (IIII)V
      // 498: iload 5
      // 49a: aload 0
      // 49b: getfield com/finalshell/core/TA.T I
      // 49e: isub
      // 49f: istore 5
      // 4a1: iinc 6 1
      // 4a4: iload 2
      // 4a5: ifne 3e5
      // 4a8: iload 5
      // 4aa: iload 2
      // 4ab: ifeq 4ce
      // 4ae: iload 4
      // 4b0: if_icmple 5f9
      // 4b3: goto 4ba
      // 4b6: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b9: athrow
      // 4ba: aload 0
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c1: athrow
      // 4c2: sipush 18990
      // 4c5: sipush -9011
      // 4c8: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 4cb: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 4ce: iload 2
      // 4cf: ifeq 4f0
      // 4d2: ifne 4f3
      // 4d5: goto 4dc
      // 4d8: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4db: athrow
      // 4dc: aload 0
      // 4dd: sipush 18984
      // 4e0: sipush 3581
      // 4e3: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 4e6: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 4e9: goto 4f0
      // 4ec: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4ef: athrow
      // 4f0: ifeq 5f9
      // 4f3: aload 1
      // 4f4: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 4f7: astore 6
      // 4f9: aload 6
      // 4fb: arraylength
      // 4fc: istore 7
      // 4fe: bipush 0
      // 4ff: istore 8
      // 501: iload 8
      // 503: iload 7
      // 505: if_icmpge 5f9
      // 508: aload 6
      // 50a: iload 8
      // 50c: aaload
      // 50d: astore 9
      // 50f: iload 2
      // 510: ifeq 8a9
      // 513: iload 2
      // 514: ifeq 5f5
      // 517: goto 51e
      // 51a: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51d: athrow
      // 51e: aload 0
      // 51f: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 522: aload 9
      // 524: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 529: ifnull 5f2
      // 52c: goto 533
      // 52f: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 532: athrow
      // 533: aload 0
      // 534: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 537: aload 9
      // 539: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 53e: checkcast java/lang/String
      // 541: sipush 18990
      // 544: sipush -9011
      // 547: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 54a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 54d: iload 2
      // 54e: ifeq 5c6
      // 551: goto 558
      // 554: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 557: athrow
      // 558: ifeq 5a5
      // 55b: goto 562
      // 55e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 561: athrow
      // 562: aload 9
      // 564: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 567: astore 10
      // 569: aload 9
      // 56b: iload 4
      // 56d: iload 4
      // 56f: iload 5
      // 571: iadd
      // 572: bipush 2
      // 573: idiv
      // 574: aload 10
      // 576: getfield java/awt/Dimension.width I
      // 579: bipush 2
      // 57a: idiv
      // 57b: isub
      // 57c: invokestatic java/lang/Math.max (II)I
      // 57f: aload 3
      // 580: getfield java/awt/Insets.top I
      // 583: aload 10
      // 585: getfield java/awt/Dimension.width I
      // 588: iload 5
      // 58a: iload 4
      // 58c: isub
      // 58d: invokestatic java/lang/Math.min (II)I
      // 590: aload 1
      // 591: invokevirtual java/awt/Container.getHeight ()I
      // 594: aload 3
      // 595: getfield java/awt/Insets.top I
      // 598: isub
      // 599: aload 3
      // 59a: getfield java/awt/Insets.bottom I
      // 59d: isub
      // 59e: invokevirtual java/awt/Component.setBounds (IIII)V
      // 5a1: iload 2
      // 5a2: ifne 5f2
      // 5a5: aload 0
      // 5a6: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 5a9: aload 9
      // 5ab: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5b0: checkcast java/lang/String
      // 5b3: sipush 18984
      // 5b6: sipush 3581
      // 5b9: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 5bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5bf: goto 5c6
      // 5c2: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c5: athrow
      // 5c6: ifeq 5f2
      // 5c9: aload 9
      // 5cb: iload 4
      // 5cd: aload 3
      // 5ce: getfield java/awt/Insets.top I
      // 5d1: bipush 0
      // 5d2: iload 5
      // 5d4: iload 4
      // 5d6: isub
      // 5d7: invokestatic java/lang/Math.max (II)I
      // 5da: aload 1
      // 5db: invokevirtual java/awt/Container.getHeight ()I
      // 5de: aload 3
      // 5df: getfield java/awt/Insets.top I
      // 5e2: isub
      // 5e3: aload 3
      // 5e4: getfield java/awt/Insets.bottom I
      // 5e7: isub
      // 5e8: invokevirtual java/awt/Component.setBounds (IIII)V
      // 5eb: goto 5f2
      // 5ee: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f1: athrow
      // 5f2: iinc 8 1
      // 5f5: iload 2
      // 5f6: ifne 501
      // 5f9: iload 2
      // 5fa: ifne 8a9
      // 5fd: aload 3
      // 5fe: getfield java/awt/Insets.top I
      // 601: goto 608
      // 604: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 607: athrow
      // 608: istore 4
      // 60a: bipush 0
      // 60b: istore 5
      // 60d: iload 5
      // 60f: aload 1
      // 610: invokevirtual java/awt/Container.getComponentCount ()I
      // 613: if_icmpge 6a1
      // 616: aload 1
      // 617: iload 5
      // 619: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 61c: astore 6
      // 61e: aload 0
      // 61f: iload 2
      // 620: ifeq 6ad
      // 623: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 626: aload 6
      // 628: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 62d: iload 2
      // 62e: ifeq 654
      // 631: goto 638
      // 634: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 637: athrow
      // 638: ifnull 666
      // 63b: goto 642
      // 63e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 641: athrow
      // 642: aload 0
      // 643: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 646: aload 6
      // 648: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 64d: goto 654
      // 650: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 653: athrow
      // 654: checkcast java/lang/String
      // 657: sipush 18976
      // 65a: sipush -32644
      // 65d: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 660: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 663: ifeq 69a
      // 666: aload 6
      // 668: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 66b: astore 7
      // 66d: aload 6
      // 66f: aload 3
      // 670: getfield java/awt/Insets.left I
      // 673: iload 4
      // 675: aload 1
      // 676: invokevirtual java/awt/Container.getWidth ()I
      // 679: aload 3
      // 67a: getfield java/awt/Insets.left I
      // 67d: isub
      // 67e: aload 3
      // 67f: getfield java/awt/Insets.right I
      // 682: isub
      // 683: aload 7
      // 685: getfield java/awt/Dimension.height I
      // 688: invokevirtual java/awt/Component.setBounds (IIII)V
      // 68b: iload 4
      // 68d: aload 7
      // 68f: getfield java/awt/Dimension.height I
      // 692: aload 0
      // 693: getfield com/finalshell/core/TA.T I
      // 696: iadd
      // 697: iadd
      // 698: istore 4
      // 69a: iinc 5 1
      // 69d: iload 2
      // 69e: ifne 60d
      // 6a1: aload 1
      // 6a2: invokevirtual java/awt/Container.getHeight ()I
      // 6a5: aload 3
      // 6a6: getfield java/awt/Insets.bottom I
      // 6a9: isub
      // 6aa: istore 5
      // 6ac: aload 0
      // 6ad: sipush 18989
      // 6b0: sipush 26262
      // 6b3: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 6b6: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 6b9: iload 2
      // 6ba: ifeq 765
      // 6bd: ifeq 763
      // 6c0: goto 6c7
      // 6c3: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c6: athrow
      // 6c7: aload 1
      // 6c8: invokevirtual java/awt/Container.getComponentCount ()I
      // 6cb: bipush 1
      // 6cc: isub
      // 6cd: istore 6
      // 6cf: iload 6
      // 6d1: iflt 763
      // 6d4: aload 1
      // 6d5: iload 6
      // 6d7: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 6da: astore 7
      // 6dc: iload 2
      // 6dd: ifeq 75f
      // 6e0: aload 0
      // 6e1: iload 2
      // 6e2: ifeq 77d
      // 6e5: goto 6ec
      // 6e8: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6eb: athrow
      // 6ec: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 6ef: aload 7
      // 6f1: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6f6: ifnull 75c
      // 6f9: goto 700
      // 6fc: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6ff: athrow
      // 700: aload 0
      // 701: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 704: aload 7
      // 706: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 70b: checkcast java/lang/String
      // 70e: sipush 18989
      // 711: sipush 26262
      // 714: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 717: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 71a: ifeq 75c
      // 71d: goto 724
      // 720: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 723: athrow
      // 724: aload 7
      // 726: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 729: astore 8
      // 72b: iload 5
      // 72d: aload 8
      // 72f: getfield java/awt/Dimension.height I
      // 732: isub
      // 733: istore 5
      // 735: aload 7
      // 737: aload 3
      // 738: getfield java/awt/Insets.left I
      // 73b: iload 5
      // 73d: aload 1
      // 73e: invokevirtual java/awt/Container.getWidth ()I
      // 741: aload 3
      // 742: getfield java/awt/Insets.left I
      // 745: isub
      // 746: aload 3
      // 747: getfield java/awt/Insets.right I
      // 74a: isub
      // 74b: aload 8
      // 74d: getfield java/awt/Dimension.height I
      // 750: invokevirtual java/awt/Component.setBounds (IIII)V
      // 753: iload 5
      // 755: aload 0
      // 756: getfield com/finalshell/core/TA.T I
      // 759: isub
      // 75a: istore 5
      // 75c: iinc 6 -1
      // 75f: iload 2
      // 760: ifne 6cf
      // 763: iload 5
      // 765: iload 2
      // 766: ifeq 789
      // 769: iload 4
      // 76b: if_icmple 8a9
      // 76e: goto 775
      // 771: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 774: athrow
      // 775: aload 0
      // 776: goto 77d
      // 779: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77c: athrow
      // 77d: sipush 18990
      // 780: sipush -9011
      // 783: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 786: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 789: iload 2
      // 78a: ifeq 7ab
      // 78d: ifne 7ae
      // 790: goto 797
      // 793: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 796: athrow
      // 797: aload 0
      // 798: sipush 18984
      // 79b: sipush 3581
      // 79e: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 7a1: invokevirtual com/finalshell/core/TA.A (Ljava/lang/String;)Z
      // 7a4: goto 7ab
      // 7a7: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7aa: athrow
      // 7ab: ifeq 8a9
      // 7ae: aload 1
      // 7af: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 7b2: astore 6
      // 7b4: aload 6
      // 7b6: arraylength
      // 7b7: istore 7
      // 7b9: bipush 0
      // 7ba: istore 8
      // 7bc: iload 8
      // 7be: iload 7
      // 7c0: if_icmpge 8a9
      // 7c3: aload 6
      // 7c5: iload 8
      // 7c7: aaload
      // 7c8: astore 9
      // 7ca: iload 2
      // 7cb: ifeq 8a5
      // 7ce: aload 0
      // 7cf: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 7d2: aload 9
      // 7d4: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7d9: ifnull 8a2
      // 7dc: goto 7e3
      // 7df: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7e2: athrow
      // 7e3: aload 0
      // 7e4: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 7e7: aload 9
      // 7e9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7ee: checkcast java/lang/String
      // 7f1: sipush 18990
      // 7f4: sipush -9011
      // 7f7: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 7fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7fd: iload 2
      // 7fe: ifeq 876
      // 801: goto 808
      // 804: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 807: athrow
      // 808: ifeq 855
      // 80b: goto 812
      // 80e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 811: athrow
      // 812: aload 9
      // 814: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 817: astore 10
      // 819: aload 9
      // 81b: aload 3
      // 81c: getfield java/awt/Insets.left I
      // 81f: iload 4
      // 821: iload 4
      // 823: iload 5
      // 825: iadd
      // 826: bipush 2
      // 827: idiv
      // 828: aload 10
      // 82a: getfield java/awt/Dimension.height I
      // 82d: bipush 2
      // 82e: idiv
      // 82f: isub
      // 830: invokestatic java/lang/Math.max (II)I
      // 833: aload 1
      // 834: invokevirtual java/awt/Container.getWidth ()I
      // 837: aload 3
      // 838: getfield java/awt/Insets.left I
      // 83b: isub
      // 83c: aload 3
      // 83d: getfield java/awt/Insets.right I
      // 840: isub
      // 841: aload 10
      // 843: getfield java/awt/Dimension.height I
      // 846: iload 5
      // 848: iload 4
      // 84a: isub
      // 84b: invokestatic java/lang/Math.min (II)I
      // 84e: invokevirtual java/awt/Component.setBounds (IIII)V
      // 851: iload 2
      // 852: ifne 8a2
      // 855: aload 0
      // 856: getfield com/finalshell/core/TA.L Ljava/util/Map;
      // 859: aload 9
      // 85b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 860: checkcast java/lang/String
      // 863: sipush 18984
      // 866: sipush 3581
      // 869: invokestatic com/finalshell/core/TA.a (II)Ljava/lang/String;
      // 86c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 86f: goto 876
      // 872: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 875: athrow
      // 876: ifeq 8a2
      // 879: aload 9
      // 87b: aload 3
      // 87c: getfield java/awt/Insets.left I
      // 87f: iload 4
      // 881: aload 1
      // 882: invokevirtual java/awt/Container.getWidth ()I
      // 885: aload 3
      // 886: getfield java/awt/Insets.left I
      // 889: isub
      // 88a: aload 3
      // 88b: getfield java/awt/Insets.right I
      // 88e: isub
      // 88f: bipush 0
      // 890: iload 5
      // 892: iload 4
      // 894: isub
      // 895: invokestatic java/lang/Math.max (II)I
      // 898: invokevirtual java/awt/Component.setBounds (IIII)V
      // 89b: goto 8a2
      // 89e: invokestatic com/finalshell/core/TA.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8a1: athrow
      // 8a2: iinc 8 1
      // 8a5: iload 2
      // 8a6: ifne 7bc
      // 8a9: return
   }

   public boolean A(String var1) {
      return this.L.containsValue(var1);
   }

   public Insets Y(Container var1) {
      int var2 = T4.b();

      label27: {
         try {
            if (var2 == 0) {
               return this.I;
            }

            if (this.I != null) {
               break label27;
            }
         } catch (IllegalArgumentException var4) {
            throw new RuntimeException(a(var4));
         }

         return var1.getInsets();
      }

      Insets var3 = var1.getInsets();
      var3.top = var3.top + this.I.top;
      var3.left = var3.left + this.I.left;
      var3.bottom = var3.bottom + this.I.bottom;
      var3.right = var3.right + this.I.right;
      return var3;
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 18984) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 32;
               break;
            case 1:
               var10000 = 2;
               break;
            case 2:
               var10000 = 73;
               break;
            case 3:
               var10000 = 235;
               break;
            case 4:
               var10000 = 131;
               break;
            case 5:
               var10000 = 80;
               break;
            case 6:
               var10000 = 140;
               break;
            case 7:
               var10000 = 191;
               break;
            case 8:
               var10000 = 30;
               break;
            case 9:
               var10000 = 41;
               break;
            case 10:
               var10000 = 137;
               break;
            case 11:
               var10000 = 222;
               break;
            case 12:
               var10000 = 169;
               break;
            case 13:
               var10000 = 145;
               break;
            case 14:
               var10000 = 205;
               break;
            case 15:
               var10000 = 84;
               break;
            case 16:
               var10000 = 242;
               break;
            case 17:
               var10000 = 39;
               break;
            case 18:
               var10000 = 197;
               break;
            case 19:
               var10000 = 135;
               break;
            case 20:
               var10000 = 162;
               break;
            case 21:
               var10000 = 240;
               break;
            case 22:
               var10000 = 152;
               break;
            case 23:
               var10000 = 97;
               break;
            case 24:
               var10000 = 115;
               break;
            case 25:
               var10000 = 44;
               break;
            case 26:
               var10000 = 51;
               break;
            case 27:
               var10000 = 70;
               break;
            case 28:
               var10000 = 204;
               break;
            case 29:
               var10000 = 253;
               break;
            case 30:
               var10000 = 114;
               break;
            case 31:
               var10000 = 206;
               break;
            case 32:
               var10000 = 116;
               break;
            case 33:
               var10000 = 201;
               break;
            case 34:
               var10000 = 165;
               break;
            case 35:
               var10000 = 34;
               break;
            case 36:
               var10000 = 120;
               break;
            case 37:
               var10000 = 28;
               break;
            case 38:
               var10000 = 98;
               break;
            case 39:
               var10000 = 49;
               break;
            case 40:
               var10000 = 33;
               break;
            case 41:
               var10000 = 13;
               break;
            case 42:
               var10000 = 218;
               break;
            case 43:
               var10000 = 88;
               break;
            case 44:
               var10000 = 164;
               break;
            case 45:
               var10000 = 173;
               break;
            case 46:
               var10000 = 252;
               break;
            case 47:
               var10000 = 213;
               break;
            case 48:
               var10000 = 146;
               break;
            case 49:
               var10000 = 78;
               break;
            case 50:
               var10000 = 134;
               break;
            case 51:
               var10000 = 66;
               break;
            case 52:
               var10000 = 117;
               break;
            case 53:
               var10000 = 176;
               break;
            case 54:
               var10000 = 20;
               break;
            case 55:
               var10000 = 48;
               break;
            case 56:
               var10000 = 219;
               break;
            case 57:
               var10000 = 108;
               break;
            case 58:
               var10000 = 3;
               break;
            case 59:
               var10000 = 96;
               break;
            case 60:
               var10000 = 69;
               break;
            case 61:
               var10000 = 237;
               break;
            case 62:
               var10000 = 15;
               break;
            case 63:
               var10000 = 75;
               break;
            case 64:
               var10000 = 25;
               break;
            case 65:
               var10000 = 127;
               break;
            case 66:
               var10000 = 154;
               break;
            case 67:
               var10000 = 128;
               break;
            case 68:
               var10000 = 63;
               break;
            case 69:
               var10000 = 40;
               break;
            case 70:
               var10000 = 233;
               break;
            case 71:
               var10000 = 21;
               break;
            case 72:
               var10000 = 158;
               break;
            case 73:
               var10000 = 156;
               break;
            case 74:
               var10000 = 56;
               break;
            case 75:
               var10000 = 6;
               break;
            case 76:
               var10000 = 147;
               break;
            case 77:
               var10000 = 163;
               break;
            case 78:
               var10000 = 139;
               break;
            case 79:
               var10000 = 85;
               break;
            case 80:
               var10000 = 167;
               break;
            case 81:
               var10000 = 125;
               break;
            case 82:
               var10000 = 67;
               break;
            case 83:
               var10000 = 95;
               break;
            case 84:
               var10000 = 53;
               break;
            case 85:
               var10000 = 236;
               break;
            case 86:
               var10000 = 221;
               break;
            case 87:
               var10000 = 112;
               break;
            case 88:
               var10000 = 92;
               break;
            case 89:
               var10000 = 245;
               break;
            case 90:
               var10000 = 141;
               break;
            case 91:
               var10000 = 254;
               break;
            case 92:
               var10000 = 122;
               break;
            case 93:
               var10000 = 142;
               break;
            case 94:
               var10000 = 133;
               break;
            case 95:
               var10000 = 22;
               break;
            case 96:
               var10000 = 189;
               break;
            case 97:
               var10000 = 150;
               break;
            case 98:
               var10000 = 52;
               break;
            case 99:
               var10000 = 43;
               break;
            case 100:
               var10000 = 220;
               break;
            case 101:
               var10000 = 177;
               break;
            case 102:
               var10000 = 37;
               break;
            case 103:
               var10000 = 91;
               break;
            case 104:
               var10000 = 224;
               break;
            case 105:
               var10000 = 119;
               break;
            case 106:
               var10000 = 209;
               break;
            case 107:
               var10000 = 212;
               break;
            case 108:
               var10000 = 121;
               break;
            case 109:
               var10000 = 42;
               break;
            case 110:
               var10000 = 86;
               break;
            case 111:
               var10000 = 185;
               break;
            case 112:
               var10000 = 103;
               break;
            case 113:
               var10000 = 230;
               break;
            case 114:
               var10000 = 57;
               break;
            case 115:
               var10000 = 62;
               break;
            case 116:
               var10000 = 196;
               break;
            case 117:
               var10000 = 211;
               break;
            case 118:
               var10000 = 203;
               break;
            case 119:
               var10000 = 61;
               break;
            case 120:
               var10000 = 178;
               break;
            case 121:
               var10000 = 248;
               break;
            case 122:
               var10000 = 149;
               break;
            case 123:
               var10000 = 59;
               break;
            case 124:
               var10000 = 71;
               break;
            case 125:
               var10000 = 171;
               break;
            case 126:
               var10000 = 138;
               break;
            case 127:
               var10000 = 199;
               break;
            case 128:
               var10000 = 227;
               break;
            case 129:
               var10000 = 113;
               break;
            case 130:
               var10000 = 226;
               break;
            case 131:
               var10000 = 217;
               break;
            case 132:
               var10000 = 110;
               break;
            case 133:
               var10000 = 247;
               break;
            case 134:
               var10000 = 35;
               break;
            case 135:
               var10000 = 168;
               break;
            case 136:
               var10000 = 38;
               break;
            case 137:
               var10000 = 188;
               break;
            case 138:
               var10000 = 12;
               break;
            case 139:
               var10000 = 234;
               break;
            case 140:
               var10000 = 89;
               break;
            case 141:
               var10000 = 180;
               break;
            case 142:
               var10000 = 58;
               break;
            case 143:
               var10000 = 10;
               break;
            case 144:
               var10000 = 207;
               break;
            case 145:
               var10000 = 136;
               break;
            case 146:
               var10000 = 250;
               break;
            case 147:
               var10000 = 190;
               break;
            case 148:
               var10000 = 19;
               break;
            case 149:
               var10000 = 111;
               break;
            case 150:
               var10000 = 100;
               break;
            case 151:
               var10000 = 172;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 102;
               break;
            case 154:
               var10000 = 106;
               break;
            case 155:
               var10000 = 132;
               break;
            case 156:
               var10000 = 166;
               break;
            case 157:
               var10000 = 200;
               break;
            case 158:
               var10000 = 175;
               break;
            case 159:
               var10000 = 82;
               break;
            case 160:
               var10000 = 202;
               break;
            case 161:
               var10000 = 194;
               break;
            case 162:
               var10000 = 231;
               break;
            case 163:
               var10000 = 246;
               break;
            case 164:
               var10000 = 238;
               break;
            case 165:
               var10000 = 229;
               break;
            case 166:
               var10000 = 17;
               break;
            case 167:
               var10000 = 155;
               break;
            case 168:
               var10000 = 47;
               break;
            case 169:
               var10000 = 83;
               break;
            case 170:
               var10000 = 60;
               break;
            case 171:
               var10000 = 118;
               break;
            case 172:
               var10000 = 198;
               break;
            case 173:
               var10000 = 109;
               break;
            case 174:
               var10000 = 50;
               break;
            case 175:
               var10000 = 107;
               break;
            case 176:
               var10000 = 0;
               break;
            case 177:
               var10000 = 23;
               break;
            case 178:
               var10000 = 36;
               break;
            case 179:
               var10000 = 225;
               break;
            case 180:
               var10000 = 31;
               break;
            case 181:
               var10000 = 159;
               break;
            case 182:
               var10000 = 126;
               break;
            case 183:
               var10000 = 255;
               break;
            case 184:
               var10000 = 148;
               break;
            case 185:
               var10000 = 183;
               break;
            case 186:
               var10000 = 243;
               break;
            case 187:
               var10000 = 143;
               break;
            case 188:
               var10000 = 68;
               break;
            case 189:
               var10000 = 93;
               break;
            case 190:
               var10000 = 77;
               break;
            case 191:
               var10000 = 4;
               break;
            case 192:
               var10000 = 193;
               break;
            case 193:
               var10000 = 241;
               break;
            case 194:
               var10000 = 223;
               break;
            case 195:
               var10000 = 7;
               break;
            case 196:
               var10000 = 184;
               break;
            case 197:
               var10000 = 232;
               break;
            case 198:
               var10000 = 195;
               break;
            case 199:
               var10000 = 130;
               break;
            case 200:
               var10000 = 170;
               break;
            case 201:
               var10000 = 151;
               break;
            case 202:
               var10000 = 46;
               break;
            case 203:
               var10000 = 1;
               break;
            case 204:
               var10000 = 174;
               break;
            case 205:
               var10000 = 105;
               break;
            case 206:
               var10000 = 160;
               break;
            case 207:
               var10000 = 251;
               break;
            case 208:
               var10000 = 5;
               break;
            case 209:
               var10000 = 94;
               break;
            case 210:
               var10000 = 18;
               break;
            case 211:
               var10000 = 179;
               break;
            case 212:
               var10000 = 161;
               break;
            case 213:
               var10000 = 186;
               break;
            case 214:
               var10000 = 24;
               break;
            case 215:
               var10000 = 45;
               break;
            case 216:
               var10000 = 29;
               break;
            case 217:
               var10000 = 104;
               break;
            case 218:
               var10000 = 72;
               break;
            case 219:
               var10000 = 157;
               break;
            case 220:
               var10000 = 244;
               break;
            case 221:
               var10000 = 216;
               break;
            case 222:
               var10000 = 187;
               break;
            case 223:
               var10000 = 153;
               break;
            case 224:
               var10000 = 81;
               break;
            case 225:
               var10000 = 144;
               break;
            case 226:
               var10000 = 239;
               break;
            case 227:
               var10000 = 9;
               break;
            case 228:
               var10000 = 64;
               break;
            case 229:
               var10000 = 210;
               break;
            case 230:
               var10000 = 101;
               break;
            case 231:
               var10000 = 215;
               break;
            case 232:
               var10000 = 124;
               break;
            case 233:
               var10000 = 208;
               break;
            case 234:
               var10000 = 76;
               break;
            case 235:
               var10000 = 79;
               break;
            case 236:
               var10000 = 228;
               break;
            case 237:
               var10000 = 192;
               break;
            case 238:
               var10000 = 27;
               break;
            case 239:
               var10000 = 182;
               break;
            case 240:
               var10000 = 11;
               break;
            case 241:
               var10000 = 123;
               break;
            case 242:
               var10000 = 214;
               break;
            case 243:
               var10000 = 8;
               break;
            case 244:
               var10000 = 87;
               break;
            case 245:
               var10000 = 90;
               break;
            case 246:
               var10000 = 249;
               break;
            case 247:
               var10000 = 14;
               break;
            case 248:
               var10000 = 74;
               break;
            case 249:
               var10000 = 16;
               break;
            case 250:
               var10000 = 55;
               break;
            case 251:
               var10000 = 26;
               break;
            case 252:
               var10000 = 99;
               break;
            case 253:
               var10000 = 129;
               break;
            case 254:
               var10000 = 65;
               break;
            default:
               var10000 = 181;
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
      char[] var20;
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "R\"Ãç\u0005hÃ>{N\u0004ÄÕ\u0011\u0019\u0003ü}}^\u0091\u0002<ìÿ÷º\u007fH\u008dN\u0099?\u000e\u0013Û±Ö¡\u00912ò\u0007^\u000e\u008e«Yô!ö\u009béY\u008b\u0082\u0081&'1Wf¡\\ÈÅ#S!-1\u0083o\u008déâ Ö>Ìä\\÷¬\u009e/¸Ö \u009d:l\u0085àÆE³8ë`\u0010R[\"ü²t5\u008aKÙà6t\u0003Ún¹\u0006\u001ed('1Ð";
      int var4 = "R\"Ãç\u0005hÃ>{N\u0004ÄÕ\u0011\u0019\u0003ü}}^\u0091\u0002<ìÿ÷º\u007fH\u008dN\u0099?\u000e\u0013Û±Ö¡\u00912ò\u0007^\u000e\u008e«Yô!ö\u009béY\u008b\u0082\u0081&'1Wf¡\\ÈÅ#S!-1\u0083o\u008déâ Ö>Ìä\\÷¬\u009e/¸Ö \u009d:l\u0085àÆE³8ë`\u0010R[\"ü²t5\u008aKÙà6t\u0003Ún¹\u0006\u001ed('1Ð"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 93;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 101;
                        break;
                     case 1:
                        var46 = 10;
                        break;
                     case 2:
                        var46 = 17;
                        break;
                     case 3:
                        var46 = 56;
                        break;
                     case 4:
                        var46 = 96;
                        break;
                     case 5:
                        var46 = 76;
                        break;
                     default:
                        var46 = 29;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[9];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Å\f\u0095ì@o\u0005 Ôá_s";
                  var4 = "Å\f\u0095ì@o\u0005 Ôá_s".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





