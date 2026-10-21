import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class Oo_2 extends CharsetDecoder {
   private static final Charset S;
   private static final long[] a;
   private static final Integer[] b;

   public Oo_2() {
      super((Charset)com.c.c(272275969875907371L).get(null), 1.0F, 1.0F);
   }

   private static boolean x(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 1
      // 04: iload 0
      // 05: sipush 13208
      // 08: ldc2_w 689404320959572223
      // 0b: invokestatic Oo_2.a (IJ)I
      // 0e: iand
      // 0f: aload 1
      // 10: ifnull 2e
      // 13: sipush 5676
      // 16: ldc2_w 181876239625162051
      // 19: invokestatic Oo_2.a (IJ)I
      // 1c: if_icmpeq 31
      // 1f: goto 26
      // 22: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   private static boolean O(int param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 2
      // 04: iload 0
      // 05: sipush 27801
      // 08: ldc2_w 4282155249032525808
      // 0b: invokestatic Oo_2.a (IJ)I
      // 0e: iand
      // 0f: aload 2
      // 10: ifnull 4e
      // 13: ifeq 46
      // 16: goto 1d
      // 19: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c: athrow
      // 1d: iload 1
      // 1e: sipush 13208
      // 21: ldc2_w 689404320959572223
      // 24: invokestatic Oo_2.a (IJ)I
      // 27: iand
      // 28: aload 2
      // 29: ifnull 4e
      // 2c: goto 33
      // 2f: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32: athrow
      // 33: sipush 5676
      // 36: ldc2_w 181876239625162051
      // 39: invokestatic Oo_2.a (IJ)I
      // 3c: if_icmpeq 51
      // 3f: goto 46
      // 42: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4e
      // 4a: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d: athrow
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   private static boolean J(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 3
      // 04: iload 0
      // 05: sipush 17957
      // 08: ldc2_w 1357216946985426256
      // 0b: invokestatic Oo_2.a (IJ)I
      // 0e: aload 3
      // 0f: ifnull 6b
      // 12: if_icmpne 45
      // 15: goto 1c
      // 18: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b: athrow
      // 1c: iload 1
      // 1d: sipush 11219
      // 20: ldc2_w 1596815004674797742
      // 23: invokestatic Oo_2.a (IJ)I
      // 26: iand
      // 27: aload 3
      // 28: ifnull 9f
      // 2b: goto 32
      // 2e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 31: athrow
      // 32: sipush 16366
      // 35: ldc2_w 6028752449774888082
      // 38: invokestatic Oo_2.a (IJ)I
      // 3b: if_icmpeq 97
      // 3e: goto 45
      // 41: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: iload 1
      // 46: sipush 29426
      // 49: ldc2_w 4873890222995827083
      // 4c: invokestatic Oo_2.a (IJ)I
      // 4f: iand
      // 50: aload 3
      // 51: ifnull 9f
      // 54: goto 5b
      // 57: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5a: athrow
      // 5b: sipush 5676
      // 5e: ldc2_w 181876239625162051
      // 61: invokestatic Oo_2.a (IJ)I
      // 64: goto 6b
      // 67: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6a: athrow
      // 6b: if_icmpne 97
      // 6e: iload 2
      // 6f: sipush 13208
      // 72: ldc2_w 689404320959572223
      // 75: invokestatic Oo_2.a (IJ)I
      // 78: iand
      // 79: aload 3
      // 7a: ifnull 9f
      // 7d: goto 84
      // 80: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 83: athrow
      // 84: sipush 5676
      // 87: ldc2_w 181876239625162051
      // 8a: invokestatic Oo_2.a (IJ)I
      // 8d: if_icmpeq a2
      // 90: goto 97
      // 93: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 96: athrow
      // 97: bipush 1
      // 98: goto 9f
      // 9b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 9e: athrow
      // 9f: goto a3
      // a2: bipush 0
      // a3: ireturn
   }

   private static boolean g(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: astore 3
      // 04: iload 0
      // 05: sipush 13208
      // 08: ldc2_w 689404320959572223
      // 0b: invokestatic Oo_2.a (IJ)I
      // 0e: iand
      // 0f: aload 3
      // 10: ifnull 80
      // 13: sipush 5676
      // 16: ldc2_w 181876239625162051
      // 19: invokestatic Oo_2.a (IJ)I
      // 1c: if_icmpne 78
      // 1f: goto 26
      // 22: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: iload 1
      // 27: sipush 13208
      // 2a: ldc2_w 689404320959572223
      // 2d: invokestatic Oo_2.a (IJ)I
      // 30: iand
      // 31: aload 3
      // 32: ifnull 80
      // 35: goto 3c
      // 38: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: sipush 5676
      // 3f: ldc2_w 181876239625162051
      // 42: invokestatic Oo_2.a (IJ)I
      // 45: if_icmpne 78
      // 48: goto 4f
      // 4b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4e: athrow
      // 4f: iload 2
      // 50: sipush 13208
      // 53: ldc2_w 689404320959572223
      // 56: invokestatic Oo_2.a (IJ)I
      // 59: iand
      // 5a: aload 3
      // 5b: ifnull 80
      // 5e: goto 65
      // 61: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 64: athrow
      // 65: sipush 5676
      // 68: ldc2_w 181876239625162051
      // 6b: invokestatic Oo_2.a (IJ)I
      // 6e: if_icmpeq 83
      // 71: goto 78
      // 74: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 80
      // 7c: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: goto 84
      // 83: bipush 0
      // 84: ireturn
   }

   private static CoderResult s(ByteBuffer param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: bipush 1
      // 04: istore 3
      // 05: astore 2
      // 06: iload 3
      // 07: iload 1
      // 08: if_icmpge 50
      // 0b: aload 0
      // 0c: invokevirtual java/nio/ByteBuffer.get ()B
      // 0f: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 12: ldc2_w 402579295193391332
      // 15: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 18: swap
      // 19: aconst_null
      // 1a: swap
      // 1b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1e: checkcast java/lang/Boolean
      // 21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24: goto 2b
      // 27: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 2
      // 2c: ifnull 51
      // 2f: aload 2
      // 30: ifnull 45
      // 33: goto 3a
      // 36: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 39: athrow
      // 3a: ifeq 49
      // 3d: goto 44
      // 40: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43: athrow
      // 44: iload 3
      // 45: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 48: areturn
      // 49: iinc 3 1
      // 4c: aload 2
      // 4d: ifnonnull 06
      // 50: iload 1
      // 51: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 54: areturn
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
      // 000: invokestatic yT_3.c ()[Lcom/ky_4;
      // 003: astore 2
      // 004: iload 1
      // 005: aload 2
      // 006: ifnull 037
      // 009: tableswitch 717 1 4 35 236 241 378
      // 028: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokevirtual java/nio/ByteBuffer.get ()B
      // 030: goto 037
      // 033: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 036: athrow
      // 037: istore 3
      // 038: iload 3
      // 039: bipush 2
      // 03a: ishr
      // 03b: sipush 2914
      // 03e: ldc2_w 8035495061001834504
      // 041: invokestatic Oo_2.a (IJ)I
      // 044: aload 2
      // 045: ifnull 0a7
      // 048: if_icmpne 090
      // 04b: goto 052
      // 04e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 051: athrow
      // 052: aload 0
      // 053: aload 2
      // 054: ifnull 075
      // 057: goto 05e
      // 05a: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 05d: athrow
      // 05e: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 061: bipush 4
      // 062: if_icmpge 074
      // 065: goto 06c
      // 068: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06b: athrow
      // 06c: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 06f: areturn
      // 070: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 073: athrow
      // 074: aload 0
      // 075: bipush 5
      // 076: invokestatic com/c.a (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 079: ldc2_w 594584287808360844
      // 07c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 07f: swap
      // 080: aconst_null
      // 081: swap
      // 082: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 085: checkcast java/nio/charset/CoderResult
      // 088: goto 08f
      // 08b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: areturn
      // 090: iload 3
      // 091: bipush 1
      // 092: ishr
      // 093: aload 2
      // 094: ifnull 0f1
      // 097: sipush 25096
      // 09a: ldc2_w 3096227559546517859
      // 09d: invokestatic Oo_2.a (IJ)I
      // 0a0: goto 0a7
      // 0a3: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a6: athrow
      // 0a7: if_icmpne 0f0
      // 0aa: aload 0
      // 0ab: aload 2
      // 0ac: ifnull 0cd
      // 0af: goto 0b6
      // 0b2: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b5: athrow
      // 0b6: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 0b9: bipush 5
      // 0ba: if_icmpge 0cc
      // 0bd: goto 0c4
      // 0c0: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c3: athrow
      // 0c4: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 0c7: areturn
      // 0c8: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: sipush 4877
      // 0d0: ldc2_w 8726807685109745779
      // 0d3: invokestatic Oo_2.a (IJ)I
      // 0d6: invokestatic com/c.a (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0d9: ldc2_w 594584287808360844
      // 0dc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0df: swap
      // 0e0: aconst_null
      // 0e1: swap
      // 0e2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e5: checkcast java/nio/charset/CoderResult
      // 0e8: goto 0ef
      // 0eb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: areturn
      // 0f0: bipush 1
      // 0f1: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 0f4: areturn
      // 0f5: bipush 1
      // 0f6: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 0f9: areturn
      // 0fa: aload 0
      // 0fb: invokevirtual java/nio/ByteBuffer.get ()B
      // 0fe: istore 3
      // 0ff: aload 0
      // 100: invokevirtual java/nio/ByteBuffer.get ()B
      // 103: istore 4
      // 105: iload 3
      // 106: aload 2
      // 107: ifnull 16c
      // 10a: sipush 14188
      // 10d: ldc2_w 5792397528822885384
      // 110: invokestatic Oo_2.a (IJ)I
      // 113: if_icmpne 147
      // 116: goto 11d
      // 119: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11c: athrow
      // 11d: iload 4
      // 11f: sipush 5555
      // 122: ldc2_w 3633863416421748433
      // 125: invokestatic Oo_2.a (IJ)I
      // 128: iand
      // 129: aload 2
      // 12a: ifnull 17b
      // 12d: goto 134
      // 130: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 133: athrow
      // 134: sipush 5676
      // 137: ldc2_w 181876239625162051
      // 13a: invokestatic Oo_2.a (IJ)I
      // 13d: if_icmpeq 17a
      // 140: goto 147
      // 143: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 146: athrow
      // 147: iload 4
      // 149: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 14c: ldc2_w 402579295193391332
      // 14f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 152: swap
      // 153: aconst_null
      // 154: swap
      // 155: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 158: checkcast java/lang/Boolean
      // 15b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15e: goto 165
      // 161: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 164: athrow
      // 165: goto 16c
      // 168: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16b: athrow
      // 16c: aload 2
      // 16d: ifnull 17b
      // 170: ifeq 17e
      // 173: goto 17a
      // 176: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 179: athrow
      // 17a: bipush 1
      // 17b: goto 17f
      // 17e: bipush 2
      // 17f: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 182: areturn
      // 183: aload 0
      // 184: invokevirtual java/nio/ByteBuffer.get ()B
      // 187: sipush 25476
      // 18a: ldc2_w 5718449305355319536
      // 18d: invokestatic Oo_2.a (IJ)I
      // 190: iand
      // 191: istore 3
      // 192: aload 0
      // 193: invokevirtual java/nio/ByteBuffer.get ()B
      // 196: sipush 19793
      // 199: ldc2_w 4976728337947678250
      // 19c: invokestatic Oo_2.a (IJ)I
      // 19f: iand
      // 1a0: istore 4
      // 1a2: iload 3
      // 1a3: aload 2
      // 1a4: ifnull 296
      // 1a7: sipush 20525
      // 1aa: ldc2_w 8180781640450362179
      // 1ad: invokestatic Oo_2.a (IJ)I
      // 1b0: if_icmpgt 295
      // 1b3: goto 1ba
      // 1b6: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b9: athrow
      // 1ba: iload 3
      // 1bb: sipush 16935
      // 1be: ldc2_w 6423443740942489930
      // 1c1: invokestatic Oo_2.a (IJ)I
      // 1c4: aload 2
      // 1c5: ifnull 235
      // 1c8: goto 1cf
      // 1cb: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ce: athrow
      // 1cf: if_icmpne 219
      // 1d2: goto 1d9
      // 1d5: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d8: athrow
      // 1d9: iload 4
      // 1db: aload 2
      // 1dc: ifnull 296
      // 1df: goto 1e6
      // 1e2: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e5: athrow
      // 1e6: sipush 856
      // 1e9: ldc2_w 3262767448543369259
      // 1ec: invokestatic Oo_2.a (IJ)I
      // 1ef: if_icmplt 295
      // 1f2: goto 1f9
      // 1f5: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f8: athrow
      // 1f9: iload 4
      // 1fb: aload 2
      // 1fc: ifnull 296
      // 1ff: goto 206
      // 202: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 205: athrow
      // 206: sipush 15747
      // 209: ldc2_w 9091783678488094450
      // 20c: invokestatic Oo_2.a (IJ)I
      // 20f: if_icmpgt 295
      // 212: goto 219
      // 215: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 218: athrow
      // 219: iload 3
      // 21a: aload 2
      // 21b: ifnull 287
      // 21e: goto 225
      // 221: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 224: athrow
      // 225: sipush 10817
      // 228: ldc2_w 5239543400420716859
      // 22b: invokestatic Oo_2.a (IJ)I
      // 22e: goto 235
      // 231: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 234: athrow
      // 235: if_icmpne 262
      // 238: iload 4
      // 23a: sipush 2979
      // 23d: ldc2_w 6267095865808294085
      // 240: invokestatic Oo_2.a (IJ)I
      // 243: iand
      // 244: aload 2
      // 245: ifnull 296
      // 248: goto 24f
      // 24b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 24e: athrow
      // 24f: sipush 5676
      // 252: ldc2_w 181876239625162051
      // 255: invokestatic Oo_2.a (IJ)I
      // 258: if_icmpne 295
      // 25b: goto 262
      // 25e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 261: athrow
      // 262: iload 4
      // 264: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 267: ldc2_w 402579295193391332
      // 26a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 26d: swap
      // 26e: aconst_null
      // 26f: swap
      // 270: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 273: checkcast java/lang/Boolean
      // 276: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 279: goto 280
      // 27c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27f: athrow
      // 280: goto 287
      // 283: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 286: athrow
      // 287: aload 2
      // 288: ifnull 2ba
      // 28b: ifeq 29a
      // 28e: goto 295
      // 291: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 294: athrow
      // 295: bipush 1
      // 296: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 299: areturn
      // 29a: aload 0
      // 29b: invokevirtual java/nio/ByteBuffer.get ()B
      // 29e: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 2a1: ldc2_w 402579295193391332
      // 2a4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2a7: swap
      // 2a8: aconst_null
      // 2a9: swap
      // 2aa: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2ad: checkcast java/lang/Boolean
      // 2b0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b3: goto 2ba
      // 2b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: aload 2
      // 2bb: ifnull 2d2
      // 2be: ifeq 2d1
      // 2c1: goto 2c8
      // 2c4: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2c7: athrow
      // 2c8: bipush 2
      // 2c9: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 2cc: areturn
      // 2cd: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d0: athrow
      // 2d1: bipush 3
      // 2d2: invokestatic java/nio/charset/CoderResult.malformedForLength (I)Ljava/nio/charset/CoderResult;
      // 2d5: areturn
      // 2d6: new java/lang/IllegalStateException
      // 2d9: dup
      // 2da: invokespecial java/lang/IllegalStateException.<init> ()V
      // 2dd: athrow
   }

   private static CoderResult Z(ByteBuffer var0, int var1, CharBuffer var2, int var3, int var4) {
      var0.position(var1 - var0.arrayOffset());
      Object[] var10000 = com.c.a(var0, var4);
      Method var8 = com.c.d(174418536633944643L);
      Object[] var15 = var10000;
      Object var12 = null;

      try {
         var10000 = (CoderResult)var8.invoke(var12, var15);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      CoderResult var5 = var10000;
      var10000 = com.c.a(var0, var1, var2, var3);
      Method var11 = com.c.d(306347285061184554L);
      var15 = var10000;
      var12 = null;

      try {
         var11.invoke(var12, var15);
         return var5;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   private static CoderResult G(Buffer param0, int param1, int param2, Buffer param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yT_3.c ()[Lcom/ky_4;
      // 03: aload 0
      // 04: iload 1
      // 05: aload 3
      // 06: iload 4
      // 08: invokestatic com/c.a (Ljava/lang/Object;ILjava/lang/Object;I)[Ljava/lang/Object;
      // 0b: ldc2_w 306347285061184554
      // 0e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 11: swap
      // 12: aconst_null
      // 13: swap
      // 14: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17: pop
      // 18: goto 1f
      // 1b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: astore 6
      // 21: iload 5
      // 23: aload 6
      // 25: ifnull 3c
      // 28: ifeq 41
      // 2b: goto 32
      // 2e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 31: athrow
      // 32: iload 2
      // 33: iload 1
      // 34: isub
      // 35: goto 3c
      // 38: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: iload 5
      // 3e: if_icmpge 4b
      // 41: getstatic java/nio/charset/CoderResult.UNDERFLOW Ljava/nio/charset/CoderResult;
      // 44: goto 4e
      // 47: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4a: athrow
      // 4b: getstatic java/nio/charset/CoderResult.OVERFLOW Ljava/nio/charset/CoderResult;
      // 4e: areturn
   }

   private CoderResult x(ByteBuffer param1, CharBuffer param2) {
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
      // 02d: invokestatic yT_3.c ()[Lcom/ky_4;
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
      // 065: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 068: athrow
      // 069: iflt 08f
      // 06c: goto 073
      // 06f: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
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
      // 08b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08e: athrow
      // 08f: iload 5
      // 091: iload 6
      // 093: if_icmpge 4f6
      // 096: aload 4
      // 098: iload 5
      // 09a: baload
      // 09b: istore 11
      // 09d: iload 11
      // 09f: aload 3
      // 0a0: ifnull 0ff
      // 0a3: iflt 0f4
      // 0a6: goto 0ad
      // 0a9: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ac: athrow
      // 0ad: iload 8
      // 0af: iload 9
      // 0b1: if_icmplt 0e2
      // 0b4: goto 0bb
      // 0b7: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: iload 5
      // 0be: iload 6
      // 0c0: aload 2
      // 0c1: iload 8
      // 0c3: bipush 1
      // 0c4: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 0c7: ldc2_w 394353787798029126
      // 0ca: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0cd: swap
      // 0ce: aconst_null
      // 0cf: swap
      // 0d0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0d3: checkcast java/nio/charset/CoderResult
      // 0d6: goto 0dd
      // 0d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: areturn
      // 0de: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e1: athrow
      // 0e2: aload 7
      // 0e4: iload 8
      // 0e6: iinc 8 1
      // 0e9: iload 11
      // 0eb: i2c
      // 0ec: castore
      // 0ed: iinc 5 1
      // 0f0: aload 3
      // 0f1: ifnonnull 4f2
      // 0f4: iload 11
      // 0f6: bipush 5
      // 0f7: ishr
      // 0f8: goto 0ff
      // 0fb: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0fe: athrow
      // 0ff: sipush 25096
      // 102: ldc2_w 3096227559546517859
      // 105: invokestatic Oo_2.a (IJ)I
      // 108: aload 3
      // 109: ifnull 20a
      // 10c: if_icmpne 1f6
      // 10f: goto 116
      // 112: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 115: athrow
      // 116: iload 6
      // 118: iload 5
      // 11a: isub
      // 11b: bipush 2
      // 11c: aload 3
      // 11d: ifnull 147
      // 120: goto 127
      // 123: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 126: athrow
      // 127: if_icmplt 14a
      // 12a: goto 131
      // 12d: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 130: athrow
      // 131: iload 8
      // 133: aload 3
      // 134: ifnull 178
      // 137: goto 13e
      // 13a: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 13d: athrow
      // 13e: iload 9
      // 140: goto 147
      // 143: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 146: athrow
      // 147: if_icmplt 171
      // 14a: aload 1
      // 14b: iload 5
      // 14d: iload 6
      // 14f: aload 2
      // 150: iload 8
      // 152: bipush 2
      // 153: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 156: ldc2_w 394353787798029126
      // 159: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 15c: swap
      // 15d: aconst_null
      // 15e: swap
      // 15f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 162: checkcast java/nio/charset/CoderResult
      // 165: goto 16c
      // 168: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: areturn
      // 16d: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 170: athrow
      // 171: aload 4
      // 173: iload 5
      // 175: bipush 1
      // 176: iadd
      // 177: baload
      // 178: istore 12
      // 17a: aload 3
      // 17b: ifnull 1f2
      // 17e: iload 11
      // 180: iload 12
      // 182: invokestatic com/c.a (II)[Ljava/lang/Object;
      // 185: ldc2_w 348155184905289657
      // 188: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 18b: swap
      // 18c: aconst_null
      // 18d: swap
      // 18e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 191: checkcast java/lang/Boolean
      // 194: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 197: goto 19e
      // 19a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: ifeq 1cd
      // 1a1: goto 1a8
      // 1a4: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a7: athrow
      // 1a8: aload 1
      // 1a9: iload 5
      // 1ab: aload 2
      // 1ac: iload 8
      // 1ae: bipush 2
      // 1af: invokestatic com/c.a (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 1b2: ldc2_w 179680890716543486
      // 1b5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1b8: swap
      // 1b9: aconst_null
      // 1ba: swap
      // 1bb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1be: checkcast java/nio/charset/CoderResult
      // 1c1: goto 1c8
      // 1c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: areturn
      // 1c9: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1cc: athrow
      // 1cd: aload 7
      // 1cf: iload 8
      // 1d1: iinc 8 1
      // 1d4: iload 11
      // 1d6: sipush 6916
      // 1d9: ldc2_w 6642617722743488609
      // 1dc: invokestatic Oo_2.a (IJ)I
      // 1df: ishl
      // 1e0: iload 12
      // 1e2: ixor
      // 1e3: sipush 3930
      // 1e6: ldc2_w 8194718530277020709
      // 1e9: invokestatic Oo_2.a (IJ)I
      // 1ec: ixor
      // 1ed: i2c
      // 1ee: castore
      // 1ef: iinc 5 2
      // 1f2: aload 3
      // 1f3: ifnonnull 4f2
      // 1f6: iload 11
      // 1f8: bipush 4
      // 1f9: ishr
      // 1fa: sipush 25096
      // 1fd: ldc2_w 3096227559546517859
      // 200: invokestatic Oo_2.a (IJ)I
      // 203: goto 20a
      // 206: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 209: athrow
      // 20a: aload 3
      // 20b: ifnull 324
      // 20e: if_icmpne 310
      // 211: goto 218
      // 214: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 217: athrow
      // 218: iload 6
      // 21a: iload 5
      // 21c: isub
      // 21d: bipush 3
      // 21e: aload 3
      // 21f: ifnull 249
      // 222: goto 229
      // 225: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 228: athrow
      // 229: if_icmplt 24c
      // 22c: goto 233
      // 22f: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 232: athrow
      // 233: iload 8
      // 235: aload 3
      // 236: ifnull 27a
      // 239: goto 240
      // 23c: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 23f: athrow
      // 240: iload 9
      // 242: goto 249
      // 245: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 248: athrow
      // 249: if_icmplt 273
      // 24c: aload 1
      // 24d: iload 5
      // 24f: iload 6
      // 251: aload 2
      // 252: iload 8
      // 254: bipush 3
      // 255: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 258: ldc2_w 394353787798029126
      // 25b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 25e: swap
      // 25f: aconst_null
      // 260: swap
      // 261: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 264: checkcast java/nio/charset/CoderResult
      // 267: goto 26e
      // 26a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: areturn
      // 26f: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 272: athrow
      // 273: aload 4
      // 275: iload 5
      // 277: bipush 1
      // 278: iadd
      // 279: baload
      // 27a: istore 12
      // 27c: aload 4
      // 27e: iload 5
      // 280: bipush 2
      // 281: iadd
      // 282: baload
      // 283: istore 13
      // 285: aload 3
      // 286: ifnull 30c
      // 289: iload 11
      // 28b: iload 12
      // 28d: iload 13
      // 28f: invokestatic com/c.a (III)[Ljava/lang/Object;
      // 292: ldc2_w 360458443030090071
      // 295: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 298: swap
      // 299: aconst_null
      // 29a: swap
      // 29b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 29e: checkcast java/lang/Boolean
      // 2a1: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a4: goto 2ab
      // 2a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: ifeq 2da
      // 2ae: goto 2b5
      // 2b1: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b4: athrow
      // 2b5: aload 1
      // 2b6: iload 5
      // 2b8: aload 2
      // 2b9: iload 8
      // 2bb: bipush 3
      // 2bc: invokestatic com/c.a (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 2bf: ldc2_w 179680890716543486
      // 2c2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2c5: swap
      // 2c6: aconst_null
      // 2c7: swap
      // 2c8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2cb: checkcast java/nio/charset/CoderResult
      // 2ce: goto 2d5
      // 2d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d4: athrow
      // 2d5: areturn
      // 2d6: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2d9: athrow
      // 2da: aload 7
      // 2dc: iload 8
      // 2de: iinc 8 1
      // 2e1: iload 11
      // 2e3: sipush 17053
      // 2e6: ldc2_w 4672373939300751851
      // 2e9: invokestatic Oo_2.a (IJ)I
      // 2ec: ishl
      // 2ed: iload 12
      // 2ef: sipush 6916
      // 2f2: ldc2_w 6642617722743488609
      // 2f5: invokestatic Oo_2.a (IJ)I
      // 2f8: ishl
      // 2f9: ixor
      // 2fa: iload 13
      // 2fc: ixor
      // 2fd: sipush 31167
      // 300: ldc2_w 7461759825354187479
      // 303: invokestatic Oo_2.a (IJ)I
      // 306: ixor
      // 307: i2c
      // 308: castore
      // 309: iinc 5 3
      // 30c: aload 3
      // 30d: ifnonnull 4f2
      // 310: iload 11
      // 312: bipush 3
      // 313: ishr
      // 314: sipush 25096
      // 317: ldc2_w 3096227559546517859
      // 31a: invokestatic Oo_2.a (IJ)I
      // 31d: goto 324
      // 320: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 323: athrow
      // 324: aload 3
      // 325: ifnull 33f
      // 328: if_icmpne 4cd
      // 32b: goto 332
      // 32e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 331: athrow
      // 332: iload 6
      // 334: iload 5
      // 336: isub
      // 337: bipush 4
      // 338: goto 33f
      // 33b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 33e: athrow
      // 33f: aload 3
      // 340: ifnull 365
      // 343: if_icmplt 368
      // 346: goto 34d
      // 349: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 34c: athrow
      // 34d: iload 9
      // 34f: iload 8
      // 351: isub
      // 352: aload 3
      // 353: ifnull 396
      // 356: goto 35d
      // 359: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 35c: athrow
      // 35d: bipush 2
      // 35e: goto 365
      // 361: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 364: athrow
      // 365: if_icmpge 38f
      // 368: aload 1
      // 369: iload 5
      // 36b: iload 6
      // 36d: aload 2
      // 36e: iload 8
      // 370: bipush 4
      // 371: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 374: ldc2_w 394353787798029126
      // 377: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 37a: swap
      // 37b: aconst_null
      // 37c: swap
      // 37d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 380: checkcast java/nio/charset/CoderResult
      // 383: goto 38a
      // 386: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 389: athrow
      // 38a: areturn
      // 38b: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 38e: athrow
      // 38f: aload 4
      // 391: iload 5
      // 393: bipush 1
      // 394: iadd
      // 395: baload
      // 396: istore 12
      // 398: aload 4
      // 39a: iload 5
      // 39c: bipush 2
      // 39d: iadd
      // 39e: baload
      // 39f: istore 13
      // 3a1: aload 4
      // 3a3: iload 5
      // 3a5: bipush 3
      // 3a6: iadd
      // 3a7: baload
      // 3a8: istore 14
      // 3aa: iload 11
      // 3ac: sipush 27567
      // 3af: ldc2_w 6006764407085035736
      // 3b2: invokestatic Oo_2.a (IJ)I
      // 3b5: iand
      // 3b6: sipush 21619
      // 3b9: ldc2_w 5302362025873428225
      // 3bc: invokestatic Oo_2.a (IJ)I
      // 3bf: ishl
      // 3c0: iload 12
      // 3c2: sipush 29625
      // 3c5: ldc2_w 8423516448292563137
      // 3c8: invokestatic Oo_2.a (IJ)I
      // 3cb: iand
      // 3cc: sipush 2715
      // 3cf: ldc2_w 9129453940641141227
      // 3d2: invokestatic Oo_2.a (IJ)I
      // 3d5: ishl
      // 3d6: ior
      // 3d7: iload 13
      // 3d9: sipush 6031
      // 3dc: ldc2_w 6047268913849306339
      // 3df: invokestatic Oo_2.a (IJ)I
      // 3e2: iand
      // 3e3: sipush 6916
      // 3e6: ldc2_w 6642617722743488609
      // 3e9: invokestatic Oo_2.a (IJ)I
      // 3ec: ishl
      // 3ed: ior
      // 3ee: iload 14
      // 3f0: sipush 6031
      // 3f3: ldc2_w 6047268913849306339
      // 3f6: invokestatic Oo_2.a (IJ)I
      // 3f9: iand
      // 3fa: ior
      // 3fb: istore 15
      // 3fd: iload 12
      // 3ff: iload 13
      // 401: iload 14
      // 403: invokestatic com/c.a (III)[Ljava/lang/Object;
      // 406: ldc2_w 448547725336641219
      // 409: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 40c: swap
      // 40d: aconst_null
      // 40e: swap
      // 40f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 412: checkcast java/lang/Boolean
      // 415: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 418: goto 41f
      // 41b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 41e: athrow
      // 41f: aload 3
      // 420: ifnull 452
      // 423: ifne 455
      // 426: goto 42d
      // 429: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 42c: athrow
      // 42d: iload 15
      // 42f: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 432: ldc2_w 536530111645880732
      // 435: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 438: swap
      // 439: aconst_null
      // 43a: swap
      // 43b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 43e: checkcast java/lang/Boolean
      // 441: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 444: goto 44b
      // 447: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44a: athrow
      // 44b: goto 452
      // 44e: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 451: athrow
      // 452: ifne 47a
      // 455: aload 1
      // 456: iload 5
      // 458: aload 2
      // 459: iload 8
      // 45b: bipush 4
      // 45c: invokestatic com/c.a (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 45f: ldc2_w 179680890716543486
      // 462: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 465: swap
      // 466: aconst_null
      // 467: swap
      // 468: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 46b: checkcast java/nio/charset/CoderResult
      // 46e: goto 475
      // 471: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 474: athrow
      // 475: areturn
      // 476: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 479: athrow
      // 47a: aload 7
      // 47c: iload 8
      // 47e: iinc 8 1
      // 481: iload 15
      // 483: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 486: ldc2_w 634243481968168316
      // 489: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 48c: swap
      // 48d: aconst_null
      // 48e: swap
      // 48f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 492: checkcast java/lang/Character
      // 495: invokevirtual java/lang/Character.charValue ()C
      // 498: goto 49f
      // 49b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49e: athrow
      // 49f: castore
      // 4a0: aload 7
      // 4a2: iload 8
      // 4a4: iinc 8 1
      // 4a7: iload 15
      // 4a9: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 4ac: ldc2_w 369580655194218898
      // 4af: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4b2: swap
      // 4b3: aconst_null
      // 4b4: swap
      // 4b5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b8: checkcast java/lang/Character
      // 4bb: invokevirtual java/lang/Character.charValue ()C
      // 4be: goto 4c5
      // 4c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c4: athrow
      // 4c5: castore
      // 4c6: iinc 5 4
      // 4c9: aload 3
      // 4ca: ifnonnull 4f2
      // 4cd: aload 1
      // 4ce: iload 5
      // 4d0: aload 2
      // 4d1: iload 8
      // 4d3: bipush 1
      // 4d4: invokestatic com/c.a (Ljava/lang/Object;ILjava/lang/Object;II)[Ljava/lang/Object;
      // 4d7: ldc2_w 179680890716543486
      // 4da: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4dd: swap
      // 4de: aconst_null
      // 4df: swap
      // 4e0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4e3: checkcast java/nio/charset/CoderResult
      // 4e6: goto 4ed
      // 4e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ec: athrow
      // 4ed: areturn
      // 4ee: invokestatic Oo_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f1: athrow
      // 4f2: aload 3
      // 4f3: ifnonnull 08f
      // 4f6: aload 1
      // 4f7: iload 5
      // 4f9: iload 6
      // 4fb: aload 2
      // 4fc: iload 8
      // 4fe: bipush 0
      // 4ff: invokestatic com/c.a (Ljava/lang/Object;IILjava/lang/Object;II)[Ljava/lang/Object;
      // 502: ldc2_w 394353787798029126
      // 505: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 508: swap
      // 509: aconst_null
      // 50a: swap
      // 50b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 50e: checkcast java/nio/charset/CoderResult
      // 511: goto 518
      // 514: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 517: athrow
      // 518: areturn
   }

   @Override
   protected CoderResult decodeLoop(ByteBuffer var1, CharBuffer var2) {
      Object[] var10001 = com.c.a(var1, var2);
      Method var10003 = com.c.d(633854366038463952L);
      Object[] var10002 = var10001;
      Oo_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (CoderResult)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   static void j(Buffer var0, int var1, Buffer var2, int var3) {
      var0.position(var1);
      var2.position(var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7038;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





