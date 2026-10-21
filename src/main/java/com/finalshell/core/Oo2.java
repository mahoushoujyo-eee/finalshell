package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class Oo2 extends CharsetDecoder {
   public static Charset S;
   public static long[] a;
   public static Integer[] b;

   public Oo2() {
      super((Charset)Registry.lookupField(272275969875907371L).get(null), 1.0F, 1.0F);
   }

   public static boolean x(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: iload 0
      // 05: sipush 13208
      // 08: ldc2_w 689404320959572223
      // 0b: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0e: iand
      // 0f: aload 1
      // 10: ifnull 2e
      // 13: sipush 5676
      // 16: ldc2_w 181876239625162051
      // 19: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1c: if_icmpeq 31
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   public static boolean O(int param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: iload 0
      // 05: sipush 27801
      // 08: ldc2_w 4282155249032525808
      // 0b: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0e: iand
      // 0f: aload 2
      // 10: ifnull 4e
      // 13: ifeq 46
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c: athrow
      // 1d: iload 1
      // 1e: sipush 13208
      // 21: ldc2_w 689404320959572223
      // 24: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 27: iand
      // 28: aload 2
      // 29: ifnull 4e
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32: athrow
      // 33: sipush 5676
      // 36: ldc2_w 181876239625162051
      // 39: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3c: if_icmpeq 51
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d: athrow
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   public static boolean J(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: iload 0
      // 05: sipush 17957
      // 08: ldc2_w 1357216946985426256
      // 0b: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0e: aload 3
      // 0f: ifnull 6b
      // 12: if_icmpne 45
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b: athrow
      // 1c: iload 1
      // 1d: sipush 11219
      // 20: ldc2_w 1596815004674797742
      // 23: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 26: iand
      // 27: aload 3
      // 28: ifnull 9f
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 31: athrow
      // 32: sipush 16366
      // 35: ldc2_w 6028752449774888082
      // 38: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3b: if_icmpeq 97
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: iload 1
      // 46: sipush 29426
      // 49: ldc2_w 4873890222995827083
      // 4c: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 4f: iand
      // 50: aload 3
      // 51: ifnull 9f
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5a: athrow
      // 5b: sipush 5676
      // 5e: ldc2_w 181876239625162051
      // 61: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6a: athrow
      // 6b: if_icmpne 97
      // 6e: iload 2
      // 6f: sipush 13208
      // 72: ldc2_w 689404320959572223
      // 75: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 78: iand
      // 79: aload 3
      // 7a: ifnull 9f
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 83: athrow
      // 84: sipush 5676
      // 87: ldc2_w 181876239625162051
      // 8a: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 8d: if_icmpeq a2
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 96: athrow
      // 97: bipush 1
      // 98: goto 9f
      // 9b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 9e: athrow
      // 9f: goto a3
      // a2: bipush 0
      // a3: ireturn
   }

   public static boolean g(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: iload 0
      // 05: sipush 13208
      // 08: ldc2_w 689404320959572223
      // 0b: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0e: iand
      // 0f: aload 3
      // 10: ifnull 80
      // 13: sipush 5676
      // 16: ldc2_w 181876239625162051
      // 19: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1c: if_icmpne 78
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: iload 1
      // 27: sipush 13208
      // 2a: ldc2_w 689404320959572223
      // 2d: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 30: iand
      // 31: aload 3
      // 32: ifnull 80
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: sipush 5676
      // 3f: ldc2_w 181876239625162051
      // 42: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 45: if_icmpne 78
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4e: athrow
      // 4f: iload 2
      // 50: sipush 13208
      // 53: ldc2_w 689404320959572223
      // 56: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 59: iand
      // 5a: aload 3
      // 5b: ifnull 80
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 64: athrow
      // 65: sipush 5676
      // 68: ldc2_w 181876239625162051
      // 6b: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 6e: if_icmpeq 83
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: goto 84
      // 83: bipush 0
      // 84: ireturn
   }

   public static CoderResult s(ByteBuffer param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: iload 1
      // 08: if_icmpge 51
      // 0b: aload 0
      // 0c: invokevirtual java/nio/ByteBuffer.get ()B
      // 0f: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 12: ldc2_w 402579295193391332
      // 15: astore 4
      // 17: ldc2_w 402579295193391332
      // 1a: aload 4
      // 1c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f: checkcast java/lang/Boolean
      // 22: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25: goto 2c
      // 28: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 2
      // 2d: ifnull 52
      // 30: aload 2
      // 31: ifnull 46
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3a: athrow
      // 3b: ifeq 4a
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: iload 3
      // 46: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 49: areturn
      // 4a: iinc 3 1
      // 4d: aload 2
      // 4e: ifnonnull 06
      // 51: iload 1
      // 52: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 55: areturn
   }

   public static CoderResult k(ByteBuffer param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 2
      // 004: iload 1
      // 005: aload 2
      // 006: ifnull 037
      // 009: tableswitch 722 1 4 35 238 243 381
      // 028: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokevirtual java/nio/ByteBuffer.get ()B
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 036: athrow
      // 037: istore 3
      // 038: iload 3
      // 039: bipush 2
      // 03a: ishr
      // 03b: sipush 2914
      // 03e: ldc2_w 8035495061001834504
      // 041: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 044: aload 2
      // 045: ifnull 0a8
      // 048: if_icmpne 091
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 051: athrow
      // 052: aload 0
      // 053: aload 2
      // 054: ifnull 075
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 05d: athrow
      // 05e: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 061: bipush 4
      // 062: if_icmpge 074
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06b: athrow
      // 06c: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 06f: areturn
      // 070: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 073: athrow
      // 074: aload 0
      // 075: bipush 5
      // 076: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 079: ldc2_w 594584287808360844
      // 07c: astore 5
      // 07e: ldc2_w 594584287808360844
      // 081: aload 5
      // 083: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 086: checkcast java/nio/charset/CoderResult
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: areturn
      // 091: iload 3
      // 092: bipush 1
      // 093: ishr
      // 094: aload 2
      // 095: ifnull 0f3
      // 098: sipush 25096
      // 09b: ldc2_w 3096227559546517859
      // 09e: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a7: athrow
      // 0a8: if_icmpne 0f2
      // 0ab: aload 0
      // 0ac: aload 2
      // 0ad: ifnull 0ce
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b6: athrow
      // 0b7: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 0ba: bipush 5
      // 0bb: if_icmpge 0cd
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c4: athrow
      // 0c5: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 0c8: areturn
      // 0c9: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: sipush 4877
      // 0d1: ldc2_w 8726807685109745779
      // 0d4: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 0d7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0da: ldc2_w 594584287808360844
      // 0dd: astore 7
      // 0df: ldc2_w 594584287808360844
      // 0e2: aload 7
      // 0e4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e7: checkcast java/nio/charset/CoderResult
      // 0ea: goto 0f1
      // 0ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: areturn
      // 0f2: bipush 1
      // 0f3: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 0f6: areturn
      // 0f7: bipush 1
      // 0f8: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 0fb: areturn
      // 0fc: aload 0
      // 0fd: invokevirtual java/nio/ByteBuffer.get ()B
      // 100: istore 3
      // 101: aload 0
      // 102: invokevirtual java/nio/ByteBuffer.get ()B
      // 105: istore 4
      // 107: iload 3
      // 108: aload 2
      // 109: ifnull 16f
      // 10c: sipush 14188
      // 10f: ldc2_w 5792397528822885384
      // 112: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 115: if_icmpne 149
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11e: athrow
      // 11f: iload 4
      // 121: sipush 5555
      // 124: ldc2_w 3633863416421748433
      // 127: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 12a: iand
      // 12b: aload 2
      // 12c: ifnull 17e
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 135: athrow
      // 136: sipush 5676
      // 139: ldc2_w 181876239625162051
      // 13c: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 13f: if_icmpeq 17d
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 148: athrow
      // 149: iload 4
      // 14b: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 14e: ldc2_w 402579295193391332
      // 151: astore 9
      // 153: ldc2_w 402579295193391332
      // 156: aload 9
      // 158: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 15b: checkcast java/lang/Boolean
      // 15e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 161: goto 168
      // 164: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 167: athrow
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16e: athrow
      // 16f: aload 2
      // 170: ifnull 17e
      // 173: ifeq 181
      // 176: goto 17d
      // 179: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 17c: athrow
      // 17d: bipush 1
      // 17e: goto 182
      // 181: bipush 2
      // 182: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 185: areturn
      // 186: aload 0
      // 187: invokevirtual java/nio/ByteBuffer.get ()B
      // 18a: sipush 25476
      // 18d: ldc2_w 5718449305355319536
      // 190: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 193: iand
      // 194: istore 3
      // 195: aload 0
      // 196: invokevirtual java/nio/ByteBuffer.get ()B
      // 199: sipush 19793
      // 19c: ldc2_w 4976728337947678250
      // 19f: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1a2: iand
      // 1a3: istore 4
      // 1a5: iload 3
      // 1a6: aload 2
      // 1a7: ifnull 29a
      // 1aa: sipush 20525
      // 1ad: ldc2_w 8180781640450362179
      // 1b0: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1b3: if_icmpgt 299
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1bc: athrow
      // 1bd: iload 3
      // 1be: sipush 16935
      // 1c1: ldc2_w 6423443740942489930
      // 1c4: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1c7: aload 2
      // 1c8: ifnull 238
      // 1cb: goto 1d2
      // 1ce: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d1: athrow
      // 1d2: if_icmpne 21c
      // 1d5: goto 1dc
      // 1d8: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1db: athrow
      // 1dc: iload 4
      // 1de: aload 2
      // 1df: ifnull 29a
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e8: athrow
      // 1e9: sipush 856
      // 1ec: ldc2_w 3262767448543369259
      // 1ef: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1f2: if_icmplt 299
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1fb: athrow
      // 1fc: iload 4
      // 1fe: aload 2
      // 1ff: ifnull 29a
      // 202: goto 209
      // 205: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 208: athrow
      // 209: sipush 15747
      // 20c: ldc2_w 9091783678488094450
      // 20f: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 212: if_icmpgt 299
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 21b: athrow
      // 21c: iload 3
      // 21d: aload 2
      // 21e: ifnull 28b
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 227: athrow
      // 228: sipush 10817
      // 22b: ldc2_w 5239543400420716859
      // 22e: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 237: athrow
      // 238: if_icmpne 265
      // 23b: iload 4
      // 23d: sipush 2979
      // 240: ldc2_w 6267095865808294085
      // 243: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 246: iand
      // 247: aload 2
      // 248: ifnull 29a
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 251: athrow
      // 252: sipush 5676
      // 255: ldc2_w 181876239625162051
      // 258: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 25b: if_icmpne 299
      // 25e: goto 265
      // 261: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 264: athrow
      // 265: iload 4
      // 267: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 26a: ldc2_w 402579295193391332
      // 26d: astore 11
      // 26f: ldc2_w 402579295193391332
      // 272: aload 11
      // 274: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 277: checkcast java/lang/Boolean
      // 27a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27d: goto 284
      // 280: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 283: athrow
      // 284: goto 28b
      // 287: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 28a: athrow
      // 28b: aload 2
      // 28c: ifnull 2bf
      // 28f: ifeq 29e
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 298: athrow
      // 299: bipush 1
      // 29a: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 29d: areturn
      // 29e: aload 0
      // 29f: invokevirtual java/nio/ByteBuffer.get ()B
      // 2a2: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 2a5: ldc2_w 402579295193391332
      // 2a8: astore 13
      // 2aa: ldc2_w 402579295193391332
      // 2ad: aload 13
      // 2af: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2b2: checkcast java/lang/Boolean
      // 2b5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b8: goto 2bf
      // 2bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: aload 2
      // 2c0: ifnull 2d7
      // 2c3: ifeq 2d6
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2cc: athrow
      // 2cd: bipush 2
      // 2ce: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 2d1: areturn
      // 2d2: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d5: athrow
      // 2d6: bipush 3
      // 2d7: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 2da: areturn
      // 2db: new java/lang/IllegalStateException
      // 2de: dup
      // 2df: invokespecial java/lang/IllegalStateException.<init> ()V
      // 2e2: athrow
   }

   public static CoderResult Z(ByteBuffer var0, int var1, CharBuffer var2, int var3, int var4) {
      var0.position(var1 - var0.arrayOffset());
      Registry.packArgs(var0, var4);
      long var6 = 174418536633944643L;
      Object var10001 = Ref.h2(174418536633944643L, var6);

      try {
         var10001 = (CoderResult)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      CoderResult var5 = (CoderResult)var10001;
      Registry.packArgs(var0, var1, var2, var3);
      long var8 = 306347285061184554L;
      Ref.h2(306347285061184554L, var8);

      try {
         return var5;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public static CoderResult G(Buffer param0, int param1, int param2, Buffer param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: iload 1
      // 05: aload 3
      // 06: iload 4
      // 08: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;I)[Ljava/lang/Object;
      // 0b: ldc2_w 306347285061184554
      // 0e: astore 7
      // 10: ldc2_w 306347285061184554
      // 13: aload 7
      // 15: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 18: pop
      // 19: goto 20
      // 1c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f: athrow
      // 20: astore 6
      // 22: iload 5
      // 24: aload 6
      // 26: ifnull 3d
      // 29: ifeq 42
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32: athrow
      // 33: iload 2
      // 34: iload 1
      // 35: isub
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: iload 5
      // 3f: if_icmpge 4c
      // 42: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 45: goto 4f
      // 48: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4b: athrow
      // 4c: getstatic java/nio/charset/CoderResult.OVERFLOW Ljava/nio/charset/CoderResult;
      // 4f: areturn
   }

   public CoderResult x(ByteBuffer param1, CharBuffer param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual java/nio/ByteBuffer.array ()[B
      // 004: astore 4
      // 006: aload 1
      // 007: invokevirtual java/nio/ByteBuffer.arrayOffset ()I
      // 00a: aload 1
      // 00b: invokevirtual java/nio/ByteBuffer.position ()I
      // 00e: iadd
      // 00f: istore 5
      // 011: aload 1
      // 012: invokevirtual java/nio/ByteBuffer.arrayOffset ()I
      // 015: aload 1
      // 016: invokevirtual java/nio/ByteBuffer.limit ()I
      // 019: iadd
      // 01a: istore 6
      // 01c: aload 2
      // 01d: invokevirtual java/nio/CharBuffer.array ()[C
      // 020: astore 7
      // 022: aload 2
      // 023: invokevirtual java/nio/CharBuffer.arrayOffset ()I
      // 026: aload 2
      // 027: invokevirtual java/nio/CharBuffer.position ()I
      // 02a: iadd
      // 02b: istore 8
      // 02d: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 030: aload 2
      // 031: invokevirtual java/nio/CharBuffer.arrayOffset ()I
      // 034: aload 2
      // 035: invokevirtual java/nio/CharBuffer.limit ()I
      // 038: iadd
      // 039: istore 9
      // 03b: astore 3
      // 03c: iload 8
      // 03e: iload 6
      // 040: iload 5
      // 042: isub
      // 043: iload 9
      // 045: iload 8
      // 047: isub
      // 048: invokestatic java/lang/Math.min (II)I
      // 04b: iadd
      // 04c: istore 10
      // 04e: iload 8
      // 050: iload 10
      // 052: if_icmpge 08f
      // 055: aload 4
      // 057: iload 5
      // 059: baload
      // 05a: aload 3
      // 05b: ifnull 091
      // 05e: aload 3
      // 05f: ifnull 091
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 068: athrow
      // 069: iflt 08f
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 072: athrow
      // 073: aload 7
      // 075: iload 8
      // 077: iinc 8 1
      // 07a: aload 4
      // 07c: iload 5
      // 07e: iinc 5 1
      // 081: baload
      // 082: i2c
      // 083: castore
      // 084: aload 3
      // 085: ifnonnull 04e
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08e: athrow
      // 08f: iload 5
      // 091: iload 6
      // 093: if_icmpge 504
      // 096: aload 4
      // 098: iload 5
      // 09a: baload
      // 09b: istore 11
      // 09d: iload 11
      // 09f: aload 3
      // 0a0: ifnull 100
      // 0a3: iflt 0f5
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ac: athrow
      // 0ad: iload 8
      // 0af: iload 9
      // 0b1: if_icmplt 0e3
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: iload 5
      // 0be: iload 6
      // 0c0: aload 2
      // 0c1: iload 8
      // 0c3: bipush 1
      // 0c4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 0c7: ldc2_w 394353787798029126
      // 0ca: astore 16
      // 0cc: ldc2_w 394353787798029126
      // 0cf: aload 16
      // 0d1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d4: checkcast java/nio/charset/CoderResult
      // 0d7: goto 0de
      // 0da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: areturn
      // 0df: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e2: athrow
      // 0e3: aload 7
      // 0e5: iload 8
      // 0e7: iinc 8 1
      // 0ea: iload 11
      // 0ec: i2c
      // 0ed: castore
      // 0ee: iinc 5 1
      // 0f1: aload 3
      // 0f2: ifnonnull 500
      // 0f5: iload 11
      // 0f7: bipush 5
      // 0f8: ishr
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ff: athrow
      // 100: sipush 25096
      // 103: ldc2_w 3096227559546517859
      // 106: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 109: aload 3
      // 10a: ifnull 20e
      // 10d: if_icmpne 1fa
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 116: athrow
      // 117: iload 6
      // 119: iload 5
      // 11b: isub
      // 11c: bipush 2
      // 11d: aload 3
      // 11e: ifnull 148
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 127: athrow
      // 128: if_icmplt 14b
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 131: athrow
      // 132: iload 8
      // 134: aload 3
      // 135: ifnull 17a
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 13e: athrow
      // 13f: iload 9
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 147: athrow
      // 148: if_icmplt 173
      // 14b: aload 1
      // 14c: iload 5
      // 14e: iload 6
      // 150: aload 2
      // 151: iload 8
      // 153: bipush 2
      // 154: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 157: ldc2_w 394353787798029126
      // 15a: astore 18
      // 15c: ldc2_w 394353787798029126
      // 15f: aload 18
      // 161: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 164: checkcast java/nio/charset/CoderResult
      // 167: goto 16e
      // 16a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16d: athrow
      // 16e: areturn
      // 16f: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 172: athrow
      // 173: aload 4
      // 175: iload 5
      // 177: bipush 1
      // 178: iadd
      // 179: baload
      // 17a: istore 12
      // 17c: aload 3
      // 17d: ifnull 1f6
      // 180: iload 11
      // 182: iload 12
      // 184: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 187: ldc2_w 348155184905289657
      // 18a: astore 20
      // 18c: ldc2_w 348155184905289657
      // 18f: aload 20
      // 191: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 194: checkcast java/lang/Boolean
      // 197: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19a: goto 1a1
      // 19d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a0: athrow
      // 1a1: ifeq 1d1
      // 1a4: goto 1ab
      // 1a7: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1aa: athrow
      // 1ab: aload 1
      // 1ac: iload 5
      // 1ae: aload 2
      // 1af: iload 8
      // 1b1: bipush 2
      // 1b2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 1b5: ldc2_w 179680890716543486
      // 1b8: astore 22
      // 1ba: ldc2_w 179680890716543486
      // 1bd: aload 22
      // 1bf: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c2: checkcast java/nio/charset/CoderResult
      // 1c5: goto 1cc
      // 1c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: areturn
      // 1cd: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d0: athrow
      // 1d1: aload 7
      // 1d3: iload 8
      // 1d5: iinc 8 1
      // 1d8: iload 11
      // 1da: sipush 6916
      // 1dd: ldc2_w 6642617722743488609
      // 1e0: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1e3: ishl
      // 1e4: iload 12
      // 1e6: ixor
      // 1e7: sipush 3930
      // 1ea: ldc2_w 8194718530277020709
      // 1ed: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 1f0: ixor
      // 1f1: i2c
      // 1f2: castore
      // 1f3: iinc 5 2
      // 1f6: aload 3
      // 1f7: ifnonnull 500
      // 1fa: iload 11
      // 1fc: bipush 4
      // 1fd: ishr
      // 1fe: sipush 25096
      // 201: ldc2_w 3096227559546517859
      // 204: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20d: athrow
      // 20e: aload 3
      // 20f: ifnull 32b
      // 212: if_icmpne 317
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 21b: athrow
      // 21c: iload 6
      // 21e: iload 5
      // 220: isub
      // 221: bipush 3
      // 222: aload 3
      // 223: ifnull 24d
      // 226: goto 22d
      // 229: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 22c: athrow
      // 22d: if_icmplt 250
      // 230: goto 237
      // 233: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 236: athrow
      // 237: iload 8
      // 239: aload 3
      // 23a: ifnull 27f
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 243: athrow
      // 244: iload 9
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 24c: athrow
      // 24d: if_icmplt 278
      // 250: aload 1
      // 251: iload 5
      // 253: iload 6
      // 255: aload 2
      // 256: iload 8
      // 258: bipush 3
      // 259: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 25c: ldc2_w 394353787798029126
      // 25f: astore 24
      // 261: ldc2_w 394353787798029126
      // 264: aload 24
      // 266: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 269: checkcast java/nio/charset/CoderResult
      // 26c: goto 273
      // 26f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 272: athrow
      // 273: areturn
      // 274: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 277: athrow
      // 278: aload 4
      // 27a: iload 5
      // 27c: bipush 1
      // 27d: iadd
      // 27e: baload
      // 27f: istore 12
      // 281: aload 4
      // 283: iload 5
      // 285: bipush 2
      // 286: iadd
      // 287: baload
      // 288: istore 13
      // 28a: aload 3
      // 28b: ifnull 313
      // 28e: iload 11
      // 290: iload 12
      // 292: iload 13
      // 294: invokestatic com/finalshell/reflect/Registry.packArgs (III)[Ljava/lang/Object;
      // 297: ldc2_w 360458443030090071
      // 29a: astore 26
      // 29c: ldc2_w 360458443030090071
      // 29f: aload 26
      // 2a1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a4: checkcast java/lang/Boolean
      // 2a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2aa: goto 2b1
      // 2ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b0: athrow
      // 2b1: ifeq 2e1
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2ba: athrow
      // 2bb: aload 1
      // 2bc: iload 5
      // 2be: aload 2
      // 2bf: iload 8
      // 2c1: bipush 3
      // 2c2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 2c5: ldc2_w 179680890716543486
      // 2c8: astore 28
      // 2ca: ldc2_w 179680890716543486
      // 2cd: aload 28
      // 2cf: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d2: checkcast java/nio/charset/CoderResult
      // 2d5: goto 2dc
      // 2d8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: areturn
      // 2dd: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2e0: athrow
      // 2e1: aload 7
      // 2e3: iload 8
      // 2e5: iinc 8 1
      // 2e8: iload 11
      // 2ea: sipush 17053
      // 2ed: ldc2_w 4672373939300751851
      // 2f0: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 2f3: ishl
      // 2f4: iload 12
      // 2f6: sipush 6916
      // 2f9: ldc2_w 6642617722743488609
      // 2fc: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 2ff: ishl
      // 300: ixor
      // 301: iload 13
      // 303: ixor
      // 304: sipush 31167
      // 307: ldc2_w 7461759825354187479
      // 30a: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 30d: ixor
      // 30e: i2c
      // 30f: castore
      // 310: iinc 5 3
      // 313: aload 3
      // 314: ifnonnull 500
      // 317: iload 11
      // 319: bipush 3
      // 31a: ishr
      // 31b: sipush 25096
      // 31e: ldc2_w 3096227559546517859
      // 321: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32a: athrow
      // 32b: aload 3
      // 32c: ifnull 346
      // 32f: if_icmpne 4da
      // 332: goto 339
      // 335: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 338: athrow
      // 339: iload 6
      // 33b: iload 5
      // 33d: isub
      // 33e: bipush 4
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 345: athrow
      // 346: aload 3
      // 347: ifnull 36c
      // 34a: if_icmplt 36f
      // 34d: goto 354
      // 350: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 353: athrow
      // 354: iload 9
      // 356: iload 8
      // 358: isub
      // 359: aload 3
      // 35a: ifnull 39e
      // 35d: goto 364
      // 360: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 363: athrow
      // 364: bipush 2
      // 365: goto 36c
      // 368: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 36b: athrow
      // 36c: if_icmpge 397
      // 36f: aload 1
      // 370: iload 5
      // 372: iload 6
      // 374: aload 2
      // 375: iload 8
      // 377: bipush 4
      // 378: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 37b: ldc2_w 394353787798029126
      // 37e: astore 30
      // 380: ldc2_w 394353787798029126
      // 383: aload 30
      // 385: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 388: checkcast java/nio/charset/CoderResult
      // 38b: goto 392
      // 38e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 391: athrow
      // 392: areturn
      // 393: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 396: athrow
      // 397: aload 4
      // 399: iload 5
      // 39b: bipush 1
      // 39c: iadd
      // 39d: baload
      // 39e: istore 12
      // 3a0: aload 4
      // 3a2: iload 5
      // 3a4: bipush 2
      // 3a5: iadd
      // 3a6: baload
      // 3a7: istore 13
      // 3a9: aload 4
      // 3ab: iload 5
      // 3ad: bipush 3
      // 3ae: iadd
      // 3af: baload
      // 3b0: istore 14
      // 3b2: iload 11
      // 3b4: sipush 27567
      // 3b7: ldc2_w 6006764407085035736
      // 3ba: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3bd: iand
      // 3be: sipush 21619
      // 3c1: ldc2_w 5302362025873428225
      // 3c4: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3c7: ishl
      // 3c8: iload 12
      // 3ca: sipush 29625
      // 3cd: ldc2_w 8423516448292563137
      // 3d0: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3d3: iand
      // 3d4: sipush 2715
      // 3d7: ldc2_w 9129453940641141227
      // 3da: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3dd: ishl
      // 3de: ior
      // 3df: iload 13
      // 3e1: sipush 6031
      // 3e4: ldc2_w 6047268913849306339
      // 3e7: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3ea: iand
      // 3eb: sipush 6916
      // 3ee: ldc2_w 6642617722743488609
      // 3f1: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 3f4: ishl
      // 3f5: ior
      // 3f6: iload 14
      // 3f8: sipush 6031
      // 3fb: ldc2_w 6047268913849306339
      // 3fe: invokestatic com/finalshell/core/Oo2.a (IJ)I
      // 401: iand
      // 402: ior
      // 403: istore 15
      // 405: iload 12
      // 407: iload 13
      // 409: iload 14
      // 40b: invokestatic com/finalshell/reflect/Registry.packArgs (III)[Ljava/lang/Object;
      // 40e: ldc2_w 448547725336641219
      // 411: astore 32
      // 413: ldc2_w 448547725336641219
      // 416: aload 32
      // 418: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 41b: checkcast java/lang/Boolean
      // 41e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 421: goto 428
      // 424: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 427: athrow
      // 428: aload 3
      // 429: ifnull 45c
      // 42c: ifne 45f
      // 42f: goto 436
      // 432: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 435: athrow
      // 436: iload 15
      // 438: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 43b: ldc2_w 536530111645880732
      // 43e: astore 34
      // 440: ldc2_w 536530111645880732
      // 443: aload 34
      // 445: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 448: checkcast java/lang/Boolean
      // 44b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 44e: goto 455
      // 451: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 454: athrow
      // 455: goto 45c
      // 458: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45b: athrow
      // 45c: ifne 485
      // 45f: aload 1
      // 460: iload 5
      // 462: aload 2
      // 463: iload 8
      // 465: bipush 4
      // 466: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 469: ldc2_w 179680890716543486
      // 46c: astore 36
      // 46e: ldc2_w 179680890716543486
      // 471: aload 36
      // 473: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 476: checkcast java/nio/charset/CoderResult
      // 479: goto 480
      // 47c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 47f: athrow
      // 480: areturn
      // 481: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 484: athrow
      // 485: aload 7
      // 487: iload 8
      // 489: iinc 8 1
      // 48c: iload 15
      // 48e: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 491: ldc2_w 634243481968168316
      // 494: astore 38
      // 496: ldc2_w 634243481968168316
      // 499: aload 38
      // 49b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 49e: checkcast java/lang/Character
      // 4a1: invokevirtual java/lang/Character.charValue ()C
      // 4a4: goto 4ab
      // 4a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4aa: athrow
      // 4ab: castore
      // 4ac: aload 7
      // 4ae: iload 8
      // 4b0: iinc 8 1
      // 4b3: iload 15
      // 4b5: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 4b8: ldc2_w 369580655194218898
      // 4bb: astore 40
      // 4bd: ldc2_w 369580655194218898
      // 4c0: aload 40
      // 4c2: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c5: checkcast java/lang/Character
      // 4c8: invokevirtual java/lang/Character.charValue ()C
      // 4cb: goto 4d2
      // 4ce: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d1: athrow
      // 4d2: castore
      // 4d3: iinc 5 4
      // 4d6: aload 3
      // 4d7: ifnonnull 500
      // 4da: aload 1
      // 4db: iload 5
      // 4dd: aload 2
      // 4de: iload 8
      // 4e0: bipush 1
      // 4e1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 4e4: ldc2_w 179680890716543486
      // 4e7: astore 42
      // 4e9: ldc2_w 179680890716543486
      // 4ec: aload 42
      // 4ee: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f1: checkcast java/nio/charset/CoderResult
      // 4f4: goto 4fb
      // 4f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4fa: athrow
      // 4fb: areturn
      // 4fc: invokestatic com/finalshell/core/Oo2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4ff: athrow
      // 500: aload 3
      // 501: ifnonnull 08f
      // 504: aload 1
      // 505: iload 5
      // 507: iload 6
      // 509: aload 2
      // 50a: iload 8
      // 50c: bipush 0
      // 50d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 510: ldc2_w 394353787798029126
      // 513: astore 44
      // 515: ldc2_w 394353787798029126
      // 518: aload 44
      // 51a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 51d: checkcast java/nio/charset/CoderResult
      // 520: goto 527
      // 523: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 526: athrow
      // 527: areturn
   }

   @Override
   protected CoderResult decodeLoop(ByteBuffer var1, CharBuffer var2) {
      Object[] var10001 = Registry.packArgs(var1, var2);
      long var4 = 633854366038463952L;
      Object[] var3 = var10001;
      var10001 = Ref.h(633854366038463952L, var3, var4);

      try {
         return (CoderResult)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   static void j(Buffer var0, int var1, Buffer var2, int var3) {
      var0.position(var1);
      var2.position(var3);
   }

   static {
      __vfClinit__();
   }

   public static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7038;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = ";F?\u0005&".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var36 = 26;
      char[] var10002 = var10003;
      int var21 = var10004;
      char[] var44;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var9;
         char var10008 = var10003[var9];
         var10007 = 26;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var52 = 116;
               break;
            case 1:
               var52 = 8;
               break;
            case 2:
               var52 = 99;
               break;
            case 3:
               var52 = 50;
               break;
            case 4:
               var52 = 4;
               break;
            case 5:
               var52 = 27;
               break;
            default:
               var52 = 126;
         }
      } else {
         var36 = 26;
         var21 = var10004;
         if (var10004 <= var9) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            String var19 = var41;
            long var10 = 8680417123626146034L;
            long[] var15 = new long[29];
            int var12 = 0;
            String var13 = "`%5ÕMéÐ\u0087éÕV\u008eä\u008dCW\u0082\u0084<\u008d\\m|àYÉîàFSè¼3£¤¡L¥é=62úã%\t\u008e'\u0017ðPÏo×0\f+»\u001e\n¤\u001e1¹mUº\u000e¾$\u0001\u0015\u0018W\f`>7(-îy0×d< ý(9\u0003Ú´?zB®&Ì×M@\u0097á\u001cø}ë0ÖÀIÕy\u0087³&ÀÉ\u0015¨\u0015\u0000úÁ\u000e~¿]ô+üãà\u0093E¿¬Ì\u0014ü\u0005U1\u0084¿eç\u009c´T.Gxé0¾a\u0001Hs\u0015\u0090~Í`7\u0004R\u001eí\u0099z\u0080ÞovRÜâþp%¥\u009d\t\u0004\u0089È\\/\u001c§´O U&ÈÇ\u0083eEbÚ\u009epÍ\u0097\u0013=¦\u0003]\u000b\u001a";
            int var14 = "`%5ÕMéÐ\u0087éÕV\u008eä\u008dCW\u0082\u0084<\u008d\\m|àYÉîàFSè¼3£¤¡L¥é=62úã%\t\u008e'\u0017ðPÏo×0\f+»\u001e\n¤\u001e1¹mUº\u000e¾$\u0001\u0015\u0018W\f`>7(-îy0×d< ý(9\u0003Ú´?zB®&Ì×M@\u0097á\u001cø}ë0ÖÀIÕy\u0087³&ÀÉ\u0015¨\u0015\u0000úÁ\u000e~¿]ô+üãà\u0093E¿¬Ì\u0014ü\u0005U1\u0084¿eç\u009c´T.Gxé0¾a\u0001Hs\u0015\u0090~Í`7\u0004R\u001eí\u0099z\u0080ÞovRÜâþp%¥\u009d\t\u0004\u0089È\\/\u001c§´O U&ÈÇ\u0083eEbÚ\u009epÍ\u0097\u0013=¦\u0003]\u000b\u001a"
               .length();
            byte var11 = 0;

            label71:
            while (true) {
               var27 = var11;
               var11 += 8;
               byte[] var17 = var13.substring(var27, var11).getBytes("ISO-8859-1");
               long[] var20 = var15;
               var27 = var12++;
               long var34 = ((long)var17[0] & 255L) << 56
                  | ((long)var17[1] & 255L) << 48
                  | ((long)var17[2] & 255L) << 40
                  | ((long)var17[3] & 255L) << 32
                  | ((long)var17[4] & 255L) << 24
                  | ((long)var17[5] & 255L) << 16
                  | ((long)var17[6] & 255L) << 8
                  | (long)var17[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var10;
                  switch (var42) {
                     case 0:
                        var20[var27] = var50;
                        if (var11 >= var14) {
                           a = var15;
                           b = new Integer[29];
                           S = Charset.forName(var19);
                           return;
                        }
                        break;
                     default:
                        var20[var27] = var50;
                        if (var11 < var14) {
                           continue label71;
                        }

                        var13 = "N\u0094úXý#X\u0095Iq\u0001°!ïVÃ";
                        var14 = "N\u0094úXý#X\u0095Iq\u0001°!ïVÃ".length();
                        var11 = 0;
                  }

                  byte var30 = var11;
                  var11 += 8;
                  var17 = var13.substring(var30, var11).getBytes("ISO-8859-1");
                  var20 = var15;
                  var27 = var12++;
                  var34 = ((long)var17[0] & 255L) << 56
                     | ((long)var17[1] & 255L) << 48
                     | ((long)var17[2] & 255L) << 40
                     | ((long)var17[3] & 255L) << 32
                     | ((long)var17[4] & 255L) << 24
                     | ((long)var17[5] & 255L) << 16
                     | ((long)var17[6] & 255L) << 8
                     | (long)var17[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var9;
         char var53 = var10003[var9];
         var10007 = 26;
         var10006 = var53;
         switch (var9 % 7) {
            case 0:
               var52 = 116;
               break;
            case 1:
               var52 = 8;
               break;
            case 2:
               var52 = 99;
               break;
            case 3:
               var52 = 50;
               break;
            case 4:
               var52 = 4;
               break;
            case 5:
               var52 = 27;
               break;
            default:
               var52 = 126;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var9++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var9 % 7) {
               case 0:
                  var52 = 116;
                  break;
               case 1:
                  var52 = 8;
                  break;
               case 2:
                  var52 = 99;
                  break;
               case 3:
                  var52 = 50;
                  break;
               case 4:
                  var52 = 4;
                  break;
               case 5:
                  var52 = 27;
                  break;
               default:
                  var52 = 126;
            }
         } else {
            if (var21 <= var9) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               String var8 = var38;
               long var0 = 8680417123626146034L;
               long[] var6 = new long[29];
               int var3 = 0;
               String var4 = "`%5ÕMéÐ\u0087éÕV\u008eä\u008dCW\u0082\u0084<\u008d\\m|àYÉîàFSè¼3£¤¡L¥é=62úã%\t\u008e'\u0017ðPÏo×0\f+»\u001e\n¤\u001e1¹mUº\u000e¾$\u0001\u0015\u0018W\f`>7(-îy0×d< ý(9\u0003Ú´?zB®&Ì×M@\u0097á\u001cø}ë0ÖÀIÕy\u0087³&ÀÉ\u0015¨\u0015\u0000úÁ\u000e~¿]ô+üãà\u0093E¿¬Ì\u0014ü\u0005U1\u0084¿eç\u009c´T.Gxé0¾a\u0001Hs\u0015\u0090~Í`7\u0004R\u001eí\u0099z\u0080ÞovRÜâþp%¥\u009d\t\u0004\u0089È\\/\u001c§´O U&ÈÇ\u0083eEbÚ\u009epÍ\u0097\u0013=¦\u0003]\u000b\u001a";
               int var5 = "`%5ÕMéÐ\u0087éÕV\u008eä\u008dCW\u0082\u0084<\u008d\\m|àYÉîàFSè¼3£¤¡L¥é=62úã%\t\u008e'\u0017ðPÏo×0\f+»\u001e\n¤\u001e1¹mUº\u000e¾$\u0001\u0015\u0018W\f`>7(-îy0×d< ý(9\u0003Ú´?zB®&Ì×M@\u0097á\u001cø}ë0ÖÀIÕy\u0087³&ÀÉ\u0015¨\u0015\u0000úÁ\u000e~¿]ô+üãà\u0093E¿¬Ì\u0014ü\u0005U1\u0084¿eç\u009c´T.Gxé0¾a\u0001Hs\u0015\u0090~Í`7\u0004R\u001eí\u0099z\u0080ÞovRÜâþp%¥\u009d\t\u0004\u0089È\\/\u001c§´O U&ÈÇ\u0083eEbÚ\u009epÍ\u0097\u0013=¦\u0003]\u000b\u001a"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var23 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var23 = var3++;
                  long var32 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var39 = -1;

                  while (true) {
                     long var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              a = var6;
                              b = new Integer[29];
                              S = Charset.forName(var8);
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "N\u0094úXý#X\u0095Iq\u0001°!ïVÃ";
                           var5 = "N\u0094úXý#X\u0095Iq\u0001°!ïVÃ".length();
                           var2 = 0;
                     }

                     byte var26 = var2;
                     var2 += 8;
                     var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var23 = var3++;
                     var32 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var39 = 0;
                  }
               }
            }

            var44 = var10002;
            var10005 = var9;
            char var54 = var10002[var9];
            var10007 = var36;
            var10006 = var54;
            switch (var9 % 7) {
               case 0:
                  var52 = 116;
                  break;
               case 1:
                  var52 = 8;
                  break;
               case 2:
                  var52 = 99;
                  break;
               case 3:
                  var52 = 50;
                  break;
               case 4:
                  var52 = 4;
                  break;
               case 5:
                  var52 = 27;
                  break;
               default:
                  var52 = 126;
            }
         }
      }
   }
}





