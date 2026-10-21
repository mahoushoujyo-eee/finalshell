package com.finalshell.core;

import com.finalshell.ui.model.Ks2_2;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

public abstract class U9 implements P7, Closeable {
   public int Y;
   public int i;
   public int y;
   public char l;
   public int d;
   public int n;
   public char[] V;
   public int e;
   public int S;
   public boolean L;
   public Calendar M;
   public TimeZone N;
   public Locale b;
   public int z;
   public static ThreadLocal s;
   public String J;
   public int I;
   public static char[] Z;
   public static int[] K;
   public static String[] a;
   public static String[] c;
   public static long[] h;
   public static Integer[] j;
   public static long[] p;
   public static Long[] q;

   public void G(String var1, Object[] var2) {
      this.Y = 1;
   }

   public U9(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: aconst_null
      // 06: putfield com/finalshell/core/U9.M Ljava/util/Calendar;
      // 09: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 0c: aload 0
      // 0d: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 10: putfield com/finalshell/core/U9.N Ljava/util/TimeZone;
      // 13: aload 0
      // 14: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 17: putfield com/finalshell/core/U9.b Ljava/util/Locale;
      // 1a: aload 0
      // 1b: bipush 0
      // 1c: putfield com/finalshell/core/U9.z I
      // 1f: aload 0
      // 20: aconst_null
      // 21: putfield com/finalshell/core/U9.J Ljava/lang/String;
      // 24: aload 0
      // 25: bipush 0
      // 26: putfield com/finalshell/core/U9.I I
      // 29: istore 2
      // 2a: aload 0
      // 2b: iload 1
      // 2c: putfield com/finalshell/core/U9.y I
      // 2f: iload 2
      // 30: ifeq 5f
      // 33: iload 1
      // 34: getstatic com/finalshell/ui/model/Ks2_2.InitStringFieldAsEmpty Lcom/finalshell/ui/model/Ks2_2;
      // 37: getfield com/finalshell/ui/model/Ks2_2.mask I
      // 3a: iand
      // 3b: ifeq 52
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: ldc ""
      // 48: putfield com/finalshell/core/U9.J Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: aload 0
      // 53: getstatic com/finalshell/core/U9.s Ljava/lang/ThreadLocal;
      // 56: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 59: checkcast [C
      // 5c: putfield com/finalshell/core/U9.V [C
      // 5f: aload 0
      // 60: iload 2
      // 61: ifeq 79
      // 64: getfield com/finalshell/core/U9.V [C
      // 67: ifnonnull 87
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: sipush 2951
      // 7c: ldc2_w 2275088566118897361
      // 7f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 82: newarray 5
      // 84: putfield com/finalshell/core/U9.V [C
      // 87: return
   }

   public final int x$int() {
      return this.z;
   }

   public void f(int var1) {
      this.Y = var1;
   }

   @Override
   public final void K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.e I
      // 008: istore 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield com/finalshell/core/U9.d I
      // 00e: putfield com/finalshell/core/U9.i I
      // 011: aload 0
      // 012: getfield com/finalshell/core/U9.l C
      // 015: sipush 9180
      // 018: ldc2_w 6298462668578782968
      // 01b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 01e: if_icmpne 034
      // 021: aload 0
      // 022: invokevirtual com/finalshell/core/U9.F ()V
      // 025: iload 1
      // 026: ifeq 058
      // 029: iload 1
      // 02a: ifne 009
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: getfield com/finalshell/core/U9.l C
      // 038: sipush 26107
      // 03b: ldc2_w 2081374444732725480
      // 03e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 041: iload 1
      // 042: ifeq 065
      // 045: if_icmpne 058
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual com/finalshell/core/U9.A$void ()V
      // 053: return
      // 054: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 0
      // 059: getfield com/finalshell/core/U9.l C
      // 05c: sipush 26927
      // 05f: ldc2_w 6101958691031889140
      // 062: invokestatic com/finalshell/core/U9.a (IJ)I
      // 065: iload 1
      // 066: ifeq 097
      // 069: if_icmpne 08a
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 0
      // 074: invokevirtual com/finalshell/core/U9.C$char ()C
      // 077: pop
      // 078: aload 0
      // 079: sipush 9361
      // 07c: ldc2_w 2488456831667599749
      // 07f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 082: putfield com/finalshell/core/U9.Y I
      // 085: return
      // 086: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield com/finalshell/core/U9.l C
      // 08e: sipush 21259
      // 091: ldc2_w 1287927339301015045
      // 094: invokestatic com/finalshell/core/U9.a (IJ)I
      // 097: iload 1
      // 098: ifeq 0e8
      // 09b: if_icmplt 0d0
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: getfield com/finalshell/core/U9.l C
      // 0a9: sipush 24153
      // 0ac: ldc2_w 3168790736949871469
      // 0af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b2: iload 1
      // 0b3: ifeq 0e8
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: if_icmpgt 0d0
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: invokevirtual com/finalshell/core/U9.C$void ()V
      // 0cb: return
      // 0cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/core/U9.l C
      // 0d4: iload 1
      // 0d5: ifeq 0f8
      // 0d8: sipush 19418
      // 0db: ldc2_w 715321441499911916
      // 0de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: if_icmpne 0f4
      // 0eb: aload 0
      // 0ec: invokevirtual com/finalshell/core/U9.C$void ()V
      // 0ef: return
      // 0f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/core/U9.l C
      // 0f8: iload 1
      // 0f9: ifeq 2e5
      // 0fc: lookupswitch 485 25 8 270 9 270 10 270 12 270 13 270 32 270 39 216 40 299 41 318 43 470 46 451 58 413 59 432 78 294 83 294 84 294 91 337 93 356 102 284 110 289 116 279 117 294 120 480 123 375 125 394
      // 1d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: iload 1
      // 1d6: ifeq 206
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: getstatic com/finalshell/ui/model/Ks2_2.AllowSingleQuotes Lcom/finalshell/ui/model/Ks2_2;
      // 1e3: invokevirtual com/finalshell/core/U9.w (Lcom/finalshell/ui/model/Ks2_2;)Z
      // 1e6: ifne 205
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: new com/finalshell/core/Hi2
      // 1f3: dup
      // 1f4: sipush 10515
      // 1f7: sipush 32259
      // 1fa: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 1fd: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 200: athrow
      // 201: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: aload 0
      // 206: invokespecial com/finalshell/core/U9.l ()V
      // 209: return
      // 20a: aload 0
      // 20b: invokevirtual com/finalshell/core/U9.C$char ()C
      // 20e: pop
      // 20f: iload 1
      // 210: ifne 009
      // 213: aload 0
      // 214: invokevirtual com/finalshell/core/U9.U ()V
      // 217: return
      // 218: aload 0
      // 219: invokevirtual com/finalshell/core/U9.E ()V
      // 21c: return
      // 21d: aload 0
      // 21e: invokevirtual com/finalshell/core/U9.s ()V
      // 221: return
      // 222: aload 0
      // 223: invokevirtual com/finalshell/core/U9.D ()V
      // 226: return
      // 227: aload 0
      // 228: invokevirtual com/finalshell/core/U9.C$char ()C
      // 22b: pop
      // 22c: aload 0
      // 22d: sipush 1861
      // 230: ldc2_w 5349631099953699429
      // 233: invokestatic com/finalshell/core/U9.a (IJ)I
      // 236: putfield com/finalshell/core/U9.Y I
      // 239: return
      // 23a: aload 0
      // 23b: invokevirtual com/finalshell/core/U9.C$char ()C
      // 23e: pop
      // 23f: aload 0
      // 240: sipush 32041
      // 243: ldc2_w 2283178923427340345
      // 246: invokestatic com/finalshell/core/U9.a (IJ)I
      // 249: putfield com/finalshell/core/U9.Y I
      // 24c: return
      // 24d: aload 0
      // 24e: invokevirtual com/finalshell/core/U9.C$char ()C
      // 251: pop
      // 252: aload 0
      // 253: sipush 26467
      // 256: ldc2_w 5688268127982992063
      // 259: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25c: putfield com/finalshell/core/U9.Y I
      // 25f: return
      // 260: aload 0
      // 261: invokevirtual com/finalshell/core/U9.C$char ()C
      // 264: pop
      // 265: aload 0
      // 266: sipush 9145
      // 269: ldc2_w 6577731744871808687
      // 26c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26f: putfield com/finalshell/core/U9.Y I
      // 272: return
      // 273: aload 0
      // 274: invokevirtual com/finalshell/core/U9.C$char ()C
      // 277: pop
      // 278: aload 0
      // 279: sipush 16823
      // 27c: ldc2_w 1966285255030480114
      // 27f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 282: putfield com/finalshell/core/U9.Y I
      // 285: return
      // 286: aload 0
      // 287: invokevirtual com/finalshell/core/U9.C$char ()C
      // 28a: pop
      // 28b: aload 0
      // 28c: sipush 16923
      // 28f: ldc2_w 1571494982232874791
      // 292: invokestatic com/finalshell/core/U9.a (IJ)I
      // 295: putfield com/finalshell/core/U9.Y I
      // 298: return
      // 299: aload 0
      // 29a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 29d: pop
      // 29e: aload 0
      // 29f: sipush 8285
      // 2a2: ldc2_w 1050517695616711985
      // 2a5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a8: putfield com/finalshell/core/U9.Y I
      // 2ab: return
      // 2ac: aload 0
      // 2ad: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2b0: pop
      // 2b1: aload 0
      // 2b2: sipush 5895
      // 2b5: ldc2_w 3376681134362184415
      // 2b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bb: putfield com/finalshell/core/U9.Y I
      // 2be: return
      // 2bf: aload 0
      // 2c0: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2c3: pop
      // 2c4: aload 0
      // 2c5: sipush 20674
      // 2c8: ldc2_w 5172885406162587038
      // 2cb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ce: putfield com/finalshell/core/U9.Y I
      // 2d1: return
      // 2d2: aload 0
      // 2d3: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2d6: pop
      // 2d7: aload 0
      // 2d8: invokevirtual com/finalshell/core/U9.C$void ()V
      // 2db: return
      // 2dc: aload 0
      // 2dd: invokevirtual com/finalshell/core/U9.x$void ()V
      // 2e0: return
      // 2e1: aload 0
      // 2e2: invokevirtual com/finalshell/core/U9.A$boolean ()Z
      // 2e5: iload 1
      // 2e6: ifeq 353
      // 2e9: ifeq 348
      // 2ec: goto 2f3
      // 2ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: aload 0
      // 2f4: iload 1
      // 2f5: ifeq 338
      // 2f8: goto 2ff
      // 2fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: getfield com/finalshell/core/U9.Y I
      // 302: sipush 9907
      // 305: ldc2_w 514190805586246625
      // 308: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30b: if_icmpne 32a
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 314: athrow
      // 315: new com/finalshell/core/Hi2
      // 318: dup
      // 319: sipush 10553
      // 31c: sipush 5632
      // 31f: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 322: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 325: athrow
      // 326: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 0
      // 32b: sipush 9907
      // 32e: ldc2_w 514190805586246625
      // 331: invokestatic com/finalshell/core/U9.a (IJ)I
      // 334: putfield com/finalshell/core/U9.Y I
      // 337: aload 0
      // 338: aload 0
      // 339: aload 0
      // 33a: getfield com/finalshell/core/U9.d I
      // 33d: dup_x1
      // 33e: putfield com/finalshell/core/U9.i I
      // 341: putfield com/finalshell/core/U9.n I
      // 344: iload 1
      // 345: ifne 3bc
      // 348: aload 0
      // 349: getfield com/finalshell/core/U9.l C
      // 34c: goto 353
      // 34f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 352: athrow
      // 353: iload 1
      // 354: ifeq 397
      // 357: sipush 15860
      // 35a: ldc2_w 1051985027903185082
      // 35d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 360: if_icmple 38c
      // 363: goto 36a
      // 366: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 369: athrow
      // 36a: aload 0
      // 36b: getfield com/finalshell/core/U9.l C
      // 36e: iload 1
      // 36f: ifeq 3bb
      // 372: goto 379
      // 375: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 378: athrow
      // 379: sipush 9836
      // 37c: ldc2_w 1894860844908575579
      // 37f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 382: if_icmpne 39c
      // 385: goto 38c
      // 388: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38b: athrow
      // 38c: aload 0
      // 38d: invokevirtual com/finalshell/core/U9.C$char ()C
      // 390: goto 397
      // 393: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 396: athrow
      // 397: pop
      // 398: iload 1
      // 399: ifne 009
      // 39c: aload 0
      // 39d: sipush 10531
      // 3a0: sipush 18589
      // 3a3: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 3a6: bipush 1
      // 3a7: anewarray 4
      // 3aa: dup
      // 3ab: bipush 0
      // 3ac: aload 0
      // 3ad: getfield com/finalshell/core/U9.l C
      // 3b0: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 3b3: aastore
      // 3b4: invokevirtual com/finalshell/core/U9.G (Ljava/lang/String;[Ljava/lang/Object;)V
      // 3b7: aload 0
      // 3b8: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3bb: pop
      // 3bc: return
   }

   @Override
   public final void S(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.e I
      // 008: istore 2
      // 009: iload 1
      // 00a: tableswitch 1066 2 20 422 1066 644 1066 1066 1066 1066 1066 1066 1066 90 1066 866 966 190 1066 1061 1066 1016
      // 064: aload 0
      // 065: getfield com/finalshell/core/U9.l C
      // 068: sipush 5090
      // 06b: ldc2_w 1330812522866921152
      // 06e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 071: iload 2
      // 072: ifne 0a3
      // 075: if_icmpne 096
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: sipush 16823
      // 083: ldc2_w 1966285255030480114
      // 086: invokestatic com/finalshell/core/U9.a (IJ)I
      // 089: putfield com/finalshell/core/U9.Y I
      // 08c: aload 0
      // 08d: invokevirtual com/finalshell/core/U9.C$char ()C
      // 090: pop
      // 091: return
      // 092: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 0
      // 097: getfield com/finalshell/core/U9.l C
      // 09a: sipush 31790
      // 09d: ldc2_w 4972276358763192576
      // 0a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a3: iload 2
      // 0a4: ifne 44c
      // 0a7: if_icmpne 434
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: sipush 26467
      // 0b5: ldc2_w 5688268127982992063
      // 0b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0bb: putfield com/finalshell/core/U9.Y I
      // 0be: aload 0
      // 0bf: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0c2: pop
      // 0c3: return
      // 0c4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/core/U9.l C
      // 0cc: sipush 26927
      // 0cf: ldc2_w 6101958691031889140
      // 0d2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d5: iload 2
      // 0d6: ifne 107
      // 0d9: if_icmpne 0fa
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: sipush 9361
      // 0e7: ldc2_w 2488456831667599749
      // 0ea: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ed: putfield com/finalshell/core/U9.Y I
      // 0f0: aload 0
      // 0f1: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0f4: pop
      // 0f5: return
      // 0f6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/core/U9.l C
      // 0fe: sipush 4784
      // 101: ldc2_w 3082167687830622095
      // 104: invokestatic com/finalshell/core/U9.a (IJ)I
      // 107: iload 2
      // 108: ifne 139
      // 10b: if_icmpne 12c
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 0
      // 116: sipush 16923
      // 119: ldc2_w 1571494982232874791
      // 11c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11f: putfield com/finalshell/core/U9.Y I
      // 122: aload 0
      // 123: invokevirtual com/finalshell/core/U9.C$char ()C
      // 126: pop
      // 127: return
      // 128: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: aload 0
      // 12d: getfield com/finalshell/core/U9.l C
      // 130: sipush 30337
      // 133: ldc2_w 2029800848590515112
      // 136: invokestatic com/finalshell/core/U9.a (IJ)I
      // 139: iload 2
      // 13a: ifne 16b
      // 13d: if_icmpne 15e
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: aload 0
      // 148: sipush 9145
      // 14b: ldc2_w 6577731744871808687
      // 14e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 151: putfield com/finalshell/core/U9.Y I
      // 154: aload 0
      // 155: invokevirtual com/finalshell/core/U9.C$char ()C
      // 158: pop
      // 159: return
      // 15a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield com/finalshell/core/U9.l C
      // 162: sipush 2765
      // 165: ldc2_w 8216137057917720563
      // 168: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16b: iload 2
      // 16c: ifne 198
      // 16f: if_icmpne 18b
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: aload 0
      // 17a: sipush 9907
      // 17d: ldc2_w 514190805586246625
      // 180: invokestatic com/finalshell/core/U9.a (IJ)I
      // 183: putfield com/finalshell/core/U9.Y I
      // 186: return
      // 187: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: aload 0
      // 18c: getfield com/finalshell/core/U9.l C
      // 18f: sipush 7800
      // 192: ldc2_w 5201320676148134657
      // 195: invokestatic com/finalshell/core/U9.a (IJ)I
      // 198: iload 2
      // 199: ifne 44c
      // 19c: if_icmpne 434
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: bipush 0
      // 1a8: invokevirtual com/finalshell/core/U9.c (Z)V
      // 1ab: return
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield com/finalshell/core/U9.l C
      // 1b4: sipush 21259
      // 1b7: ldc2_w 1287927339301015045
      // 1ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1bd: iload 2
      // 1be: ifne 20b
      // 1c1: if_icmplt 1fe
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: getfield com/finalshell/core/U9.l C
      // 1cf: sipush 24153
      // 1d2: ldc2_w 3168790736949871469
      // 1d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1d8: iload 2
      // 1d9: ifne 20b
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: if_icmpgt 1fe
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: aload 0
      // 1ef: getfield com/finalshell/core/U9.d I
      // 1f2: putfield com/finalshell/core/U9.i I
      // 1f5: aload 0
      // 1f6: invokevirtual com/finalshell/core/U9.C$void ()V
      // 1f9: return
      // 1fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: getfield com/finalshell/core/U9.l C
      // 202: sipush 26107
      // 205: ldc2_w 2081374444732725480
      // 208: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20b: iload 2
      // 20c: ifne 237
      // 20f: if_icmpne 22a
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: aload 0
      // 21a: aload 0
      // 21b: getfield com/finalshell/core/U9.d I
      // 21e: putfield com/finalshell/core/U9.i I
      // 221: aload 0
      // 222: invokevirtual com/finalshell/core/U9.A$void ()V
      // 225: return
      // 226: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: aload 0
      // 22b: getfield com/finalshell/core/U9.l C
      // 22e: sipush 31790
      // 231: ldc2_w 4972276358763192576
      // 234: invokestatic com/finalshell/core/U9.a (IJ)I
      // 237: iload 2
      // 238: ifne 269
      // 23b: if_icmpne 25c
      // 23e: goto 245
      // 241: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 244: athrow
      // 245: aload 0
      // 246: sipush 26467
      // 249: ldc2_w 5688268127982992063
      // 24c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 24f: putfield com/finalshell/core/U9.Y I
      // 252: aload 0
      // 253: invokevirtual com/finalshell/core/U9.C$char ()C
      // 256: pop
      // 257: return
      // 258: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25b: athrow
      // 25c: aload 0
      // 25d: getfield com/finalshell/core/U9.l C
      // 260: sipush 5090
      // 263: ldc2_w 1330812522866921152
      // 266: invokestatic com/finalshell/core/U9.a (IJ)I
      // 269: iload 2
      // 26a: ifne 44c
      // 26d: if_icmpne 434
      // 270: goto 277
      // 273: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 276: athrow
      // 277: aload 0
      // 278: sipush 16823
      // 27b: ldc2_w 1966285255030480114
      // 27e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 281: putfield com/finalshell/core/U9.Y I
      // 284: aload 0
      // 285: invokevirtual com/finalshell/core/U9.C$char ()C
      // 288: pop
      // 289: return
      // 28a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: aload 0
      // 28f: getfield com/finalshell/core/U9.l C
      // 292: sipush 26107
      // 295: ldc2_w 2081374444732725480
      // 298: invokestatic com/finalshell/core/U9.a (IJ)I
      // 29b: iload 2
      // 29c: ifne 2c7
      // 29f: if_icmpne 2ba
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: aload 0
      // 2aa: aload 0
      // 2ab: getfield com/finalshell/core/U9.d I
      // 2ae: putfield com/finalshell/core/U9.i I
      // 2b1: aload 0
      // 2b2: invokevirtual com/finalshell/core/U9.A$void ()V
      // 2b5: return
      // 2b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b9: athrow
      // 2ba: aload 0
      // 2bb: getfield com/finalshell/core/U9.l C
      // 2be: sipush 21259
      // 2c1: ldc2_w 1287927339301015045
      // 2c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c7: iload 2
      // 2c8: ifne 315
      // 2cb: if_icmplt 308
      // 2ce: goto 2d5
      // 2d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield com/finalshell/core/U9.l C
      // 2d9: sipush 24153
      // 2dc: ldc2_w 3168790736949871469
      // 2df: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e2: iload 2
      // 2e3: ifne 315
      // 2e6: goto 2ed
      // 2e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ec: athrow
      // 2ed: if_icmpgt 308
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f6: athrow
      // 2f7: aload 0
      // 2f8: aload 0
      // 2f9: getfield com/finalshell/core/U9.d I
      // 2fc: putfield com/finalshell/core/U9.i I
      // 2ff: aload 0
      // 300: invokevirtual com/finalshell/core/U9.C$void ()V
      // 303: return
      // 304: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: aload 0
      // 309: getfield com/finalshell/core/U9.l C
      // 30c: sipush 31790
      // 30f: ldc2_w 4972276358763192576
      // 312: invokestatic com/finalshell/core/U9.a (IJ)I
      // 315: iload 2
      // 316: ifne 347
      // 319: if_icmpne 33a
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: aload 0
      // 324: sipush 26467
      // 327: ldc2_w 5688268127982992063
      // 32a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 32d: putfield com/finalshell/core/U9.Y I
      // 330: aload 0
      // 331: invokevirtual com/finalshell/core/U9.C$char ()C
      // 334: pop
      // 335: return
      // 336: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 339: athrow
      // 33a: aload 0
      // 33b: getfield com/finalshell/core/U9.l C
      // 33e: sipush 5090
      // 341: ldc2_w 1330812522866921152
      // 344: invokestatic com/finalshell/core/U9.a (IJ)I
      // 347: iload 2
      // 348: ifne 44c
      // 34b: if_icmpne 434
      // 34e: goto 355
      // 351: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 354: athrow
      // 355: aload 0
      // 356: sipush 16823
      // 359: ldc2_w 1966285255030480114
      // 35c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35f: putfield com/finalshell/core/U9.Y I
      // 362: aload 0
      // 363: invokevirtual com/finalshell/core/U9.C$char ()C
      // 366: pop
      // 367: return
      // 368: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36b: athrow
      // 36c: aload 0
      // 36d: getfield com/finalshell/core/U9.l C
      // 370: sipush 31790
      // 373: ldc2_w 4972276358763192576
      // 376: invokestatic com/finalshell/core/U9.a (IJ)I
      // 379: iload 2
      // 37a: ifne 3ab
      // 37d: if_icmpne 39e
      // 380: goto 387
      // 383: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 386: athrow
      // 387: aload 0
      // 388: sipush 26467
      // 38b: ldc2_w 5688268127982992063
      // 38e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 391: putfield com/finalshell/core/U9.Y I
      // 394: aload 0
      // 395: invokevirtual com/finalshell/core/U9.C$char ()C
      // 398: pop
      // 399: return
      // 39a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 0
      // 39f: getfield com/finalshell/core/U9.l C
      // 3a2: sipush 5090
      // 3a5: ldc2_w 1330812522866921152
      // 3a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ab: iload 2
      // 3ac: ifne 44c
      // 3af: if_icmpne 434
      // 3b2: goto 3b9
      // 3b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b8: athrow
      // 3b9: aload 0
      // 3ba: sipush 16823
      // 3bd: ldc2_w 1966285255030480114
      // 3c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c3: putfield com/finalshell/core/U9.Y I
      // 3c6: aload 0
      // 3c7: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3ca: pop
      // 3cb: return
      // 3cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cf: athrow
      // 3d0: aload 0
      // 3d1: getfield com/finalshell/core/U9.l C
      // 3d4: sipush 30337
      // 3d7: ldc2_w 2029800848590515112
      // 3da: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3dd: iload 2
      // 3de: ifne 40f
      // 3e1: if_icmpne 402
      // 3e4: goto 3eb
      // 3e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ea: athrow
      // 3eb: aload 0
      // 3ec: sipush 9145
      // 3ef: ldc2_w 6577731744871808687
      // 3f2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f5: putfield com/finalshell/core/U9.Y I
      // 3f8: aload 0
      // 3f9: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3fc: pop
      // 3fd: return
      // 3fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 401: athrow
      // 402: aload 0
      // 403: getfield com/finalshell/core/U9.l C
      // 406: sipush 2765
      // 409: ldc2_w 8216137057917720563
      // 40c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 40f: iload 2
      // 410: ifne 44c
      // 413: if_icmpne 434
      // 416: goto 41d
      // 419: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41c: athrow
      // 41d: aload 0
      // 41e: sipush 9907
      // 421: ldc2_w 514190805586246625
      // 424: invokestatic com/finalshell/core/U9.a (IJ)I
      // 427: putfield com/finalshell/core/U9.Y I
      // 42a: return
      // 42b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42e: athrow
      // 42f: aload 0
      // 430: invokevirtual com/finalshell/core/U9.V ()V
      // 433: return
      // 434: aload 0
      // 435: getfield com/finalshell/core/U9.l C
      // 438: iload 2
      // 439: ifne 504
      // 43c: sipush 18572
      // 43f: ldc2_w 5664846119839831378
      // 442: invokestatic com/finalshell/core/U9.a (IJ)I
      // 445: goto 44c
      // 448: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44b: athrow
      // 44c: if_icmpeq 4f9
      // 44f: aload 0
      // 450: getfield com/finalshell/core/U9.l C
      // 453: iload 2
      // 454: ifne 504
      // 457: goto 45e
      // 45a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45d: athrow
      // 45e: sipush 1861
      // 461: ldc2_w 5349631099953699429
      // 464: invokestatic com/finalshell/core/U9.a (IJ)I
      // 467: if_icmpeq 4f9
      // 46a: goto 471
      // 46d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 470: athrow
      // 471: aload 0
      // 472: getfield com/finalshell/core/U9.l C
      // 475: iload 2
      // 476: ifne 504
      // 479: goto 480
      // 47c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47f: athrow
      // 480: sipush 16923
      // 483: ldc2_w 1571494982232874791
      // 486: invokestatic com/finalshell/core/U9.a (IJ)I
      // 489: if_icmpeq 4f9
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 492: athrow
      // 493: aload 0
      // 494: getfield com/finalshell/core/U9.l C
      // 497: iload 2
      // 498: ifne 504
      // 49b: goto 4a2
      // 49e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a1: athrow
      // 4a2: sipush 28233
      // 4a5: ldc2_w 5739983667078181753
      // 4a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ab: if_icmpeq 4f9
      // 4ae: goto 4b5
      // 4b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b4: athrow
      // 4b5: aload 0
      // 4b6: getfield com/finalshell/core/U9.l C
      // 4b9: iload 2
      // 4ba: ifne 504
      // 4bd: goto 4c4
      // 4c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c3: athrow
      // 4c4: sipush 16823
      // 4c7: ldc2_w 1966285255030480114
      // 4ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4cd: if_icmpeq 4f9
      // 4d0: goto 4d7
      // 4d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d6: athrow
      // 4d7: aload 0
      // 4d8: iload 2
      // 4d9: ifne 50a
      // 4dc: goto 4e3
      // 4df: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e2: athrow
      // 4e3: getfield com/finalshell/core/U9.l C
      // 4e6: sipush 16265
      // 4e9: ldc2_w 35568148908106386
      // 4ec: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ef: if_icmpne 509
      // 4f2: goto 4f9
      // 4f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f8: athrow
      // 4f9: aload 0
      // 4fa: invokevirtual com/finalshell/core/U9.C$char ()C
      // 4fd: goto 504
      // 500: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 503: athrow
      // 504: pop
      // 505: iload 2
      // 506: ifeq 009
      // 509: aload 0
      // 50a: invokevirtual com/finalshell/core/U9.K ()V
      // 50d: goto 510
      // 510: return
   }

   public final void V() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/U9.l C
      // 08: invokestatic com/finalshell/core/U9.Y (C)Z
      // 0b: ifeq 22
      // 0e: aload 0
      // 0f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 12: pop
      // 13: iload 1
      // 14: ifeq 86
      // 17: iload 1
      // 18: ifne 04
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: ifeq 83
      // 27: getfield com/finalshell/core/U9.l C
      // 2a: sipush 6104
      // 2d: ldc2_w 8860110065425271480
      // 30: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33: if_icmpeq 7b
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 1
      // 3f: ifeq 83
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: getfield com/finalshell/core/U9.l C
      // 4c: sipush 5030
      // 4f: ldc2_w 5463149266322411209
      // 52: invokestatic com/finalshell/core/U9.a (IJ)I
      // 55: if_icmpeq 7b
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: iload 1
      // 61: ifeq 92
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: getfield com/finalshell/core/U9.l C
      // 6e: invokestatic java/lang/Character.isLetter (C)Z
      // 71: ifeq 8a
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 0
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: invokevirtual com/finalshell/core/U9.D ()V
      // 86: iload 1
      // 87: ifne 95
      // 8a: aload 0
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: invokevirtual com/finalshell/core/U9.K ()V
      // 95: return
   }

   @Override
   public final void Z() {
      this.n((char)a(5277, 8676978433026148774L));
   }

   public final void n(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.e I
      // 008: istore 2
      // 009: aload 0
      // 00a: getfield com/finalshell/core/U9.l C
      // 00d: iload 1
      // 00e: if_icmpne 023
      // 011: aload 0
      // 012: invokevirtual com/finalshell/core/U9.C$char ()C
      // 015: pop
      // 016: aload 0
      // 017: invokevirtual com/finalshell/core/U9.K ()V
      // 01a: iload 2
      // 01b: ifeq 0f4
      // 01e: return
      // 01f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 0
      // 024: getfield com/finalshell/core/U9.l C
      // 027: iload 2
      // 028: ifeq 0f3
      // 02b: sipush 18572
      // 02e: ldc2_w 5664846119839831378
      // 031: invokestatic com/finalshell/core/U9.a (IJ)I
      // 034: if_icmpeq 0e8
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield com/finalshell/core/U9.l C
      // 042: iload 2
      // 043: ifeq 0f3
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: sipush 1861
      // 050: ldc2_w 5349631099953699429
      // 053: invokestatic com/finalshell/core/U9.a (IJ)I
      // 056: if_icmpeq 0e8
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield com/finalshell/core/U9.l C
      // 064: iload 2
      // 065: ifeq 0f3
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: sipush 16923
      // 072: ldc2_w 1571494982232874791
      // 075: invokestatic com/finalshell/core/U9.a (IJ)I
      // 078: if_icmpeq 0e8
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: aload 0
      // 083: getfield com/finalshell/core/U9.l C
      // 086: iload 2
      // 087: ifeq 0f3
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: sipush 28233
      // 094: ldc2_w 5739983667078181753
      // 097: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09a: if_icmpeq 0e8
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield com/finalshell/core/U9.l C
      // 0a8: iload 2
      // 0a9: ifeq 0f3
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: sipush 16823
      // 0b6: ldc2_w 1966285255030480114
      // 0b9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0bc: if_icmpeq 0e8
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield com/finalshell/core/U9.l C
      // 0ca: iload 2
      // 0cb: ifeq 0f3
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: sipush 16265
      // 0d8: ldc2_w 35568148908106386
      // 0db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0de: if_icmpne 0f8
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: pop
      // 0f4: iload 2
      // 0f5: ifne 009
      // 0f8: new com/finalshell/core/Hi2
      // 0fb: dup
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: sipush 10533
      // 106: sipush 27589
      // 109: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: iload 1
      // 110: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 113: sipush 10500
      // 116: sipush -10440
      // 119: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: aload 0
      // 120: getfield com/finalshell/core/U9.l C
      // 123: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 126: sipush 10540
      // 129: sipush -5734
      // 12c: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: aload 0
      // 133: invokevirtual com/finalshell/core/U9.C$String ()Ljava/lang/String;
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 13f: athrow
   }

   @Override
   public final int P() {
      return this.Y;
   }

   @Override
   public final String B() {
      return Ge2.g(this.Y);
   }

   @Override
   public final int R() {
      return this.i;
   }

   public final String r() {
      return this.J;
   }

   @Override
   public final Number j() throws NumberFormatException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lconst_0
      // 001: lstore 2
      // 002: invokestatic com/finalshell/core/Yn4.o ()Z
      // 005: bipush 0
      // 006: istore 4
      // 008: istore 1
      // 009: aload 0
      // 00a: getfield com/finalshell/core/U9.S I
      // 00d: iload 1
      // 00e: ifne 02c
      // 011: bipush -1
      // 012: if_icmpne 028
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: bipush 0
      // 01e: putfield com/finalshell/core/U9.S I
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/finalshell/core/U9.S I
      // 02c: istore 5
      // 02e: sipush 18572
      // 031: aload 0
      // 032: getfield com/finalshell/core/U9.S I
      // 035: aload 0
      // 036: getfield com/finalshell/core/U9.e I
      // 039: iadd
      // 03a: istore 6
      // 03c: ldc2_w 5664846119839831378
      // 03f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 042: istore 12
      // 044: aload 0
      // 045: iload 6
      // 047: bipush 1
      // 048: isub
      // 049: invokevirtual com/finalshell/core/U9.C (I)C
      // 04c: iload 1
      // 04d: ifne 0b5
      // 050: lookupswitch 93 3 66 76 76 40 83 58
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: iinc 6 -1
      // 07b: sipush 24882
      // 07e: ldc2_w 2640544065015594009
      // 081: invokestatic com/finalshell/core/U9.a (IJ)I
      // 084: istore 12
      // 086: iload 1
      // 087: ifeq 0ad
      // 08a: iinc 6 -1
      // 08d: sipush 25916
      // 090: ldc2_w 7342535848027207785
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: istore 12
      // 098: iload 1
      // 099: ifeq 0ad
      // 09c: iinc 6 -1
      // 09f: sipush 28091
      // 0a2: ldc2_w 7922031995348824293
      // 0a5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a8: istore 12
      // 0aa: goto 0ad
      // 0ad: aload 0
      // 0ae: aload 0
      // 0af: getfield com/finalshell/core/U9.S I
      // 0b2: invokevirtual com/finalshell/core/U9.C (I)C
      // 0b5: iload 1
      // 0b6: ifne 0d4
      // 0b9: sipush 19418
      // 0bc: ldc2_w 715321441499911916
      // 0bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c2: if_icmpne 0e8
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: bipush 1
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: istore 4
      // 0d6: sipush 25403
      // 0d9: ldc2_w 8238026159827273832
      // 0dc: invokestatic com/finalshell/core/U9.c (IJ)J
      // 0df: lstore 7
      // 0e1: iinc 5 1
      // 0e4: iload 1
      // 0e5: ifeq 0f3
      // 0e8: sipush 20873
      // 0eb: ldc2_w 928796667000486615
      // 0ee: invokestatic com/finalshell/core/U9.c (IJ)J
      // 0f1: lstore 7
      // 0f3: sipush 6370
      // 0f6: ldc2_w 1423820674037560255
      // 0f9: invokestatic com/finalshell/core/U9.c (IJ)J
      // 0fc: lstore 9
      // 0fe: iload 5
      // 100: iload 6
      // 102: iload 1
      // 103: ifne 12e
      // 106: if_icmpge 12a
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 0
      // 111: iload 5
      // 113: iinc 5 1
      // 116: invokevirtual com/finalshell/core/U9.C (I)C
      // 119: sipush 21259
      // 11c: ldc2_w 1287927339301015045
      // 11f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 122: isub
      // 123: istore 11
      // 125: iload 11
      // 127: ineg
      // 128: i2l
      // 129: lstore 2
      // 12a: iload 5
      // 12c: iload 6
      // 12e: if_icmpge 1c1
      // 131: aload 0
      // 132: iload 5
      // 134: iinc 5 1
      // 137: invokevirtual com/finalshell/core/U9.C (I)C
      // 13a: sipush 21259
      // 13d: ldc2_w 1287927339301015045
      // 140: invokestatic com/finalshell/core/U9.a (IJ)I
      // 143: isub
      // 144: istore 11
      // 146: lload 2
      // 147: lload 9
      // 149: lcmp
      // 14a: iload 1
      // 14b: ifne 1c3
      // 14e: iload 1
      // 14f: ifne 19b
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: ifge 17c
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: new java/math/BigInteger
      // 166: dup
      // 167: aload 0
      // 168: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 16b: sipush 1861
      // 16e: ldc2_w 5349631099953699429
      // 171: invokestatic com/finalshell/core/U9.a (IJ)I
      // 174: invokespecial java/math/BigInteger.<init> (Ljava/lang/String;I)V
      // 177: areturn
      // 178: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: lload 2
      // 17d: sipush 3395
      // 180: ldc2_w 2174368042043745818
      // 183: invokestatic com/finalshell/core/U9.c (IJ)J
      // 186: lmul
      // 187: lstore 2
      // 188: lload 2
      // 189: lload 7
      // 18b: iload 11
      // 18d: i2l
      // 18e: ladd
      // 18f: iload 1
      // 190: ifne 1bb
      // 193: lcmp
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: ifge 1b7
      // 19e: new java/math/BigInteger
      // 1a1: dup
      // 1a2: aload 0
      // 1a3: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 1a6: sipush 1861
      // 1a9: ldc2_w 5349631099953699429
      // 1ac: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1af: invokespecial java/math/BigInteger.<init> (Ljava/lang/String;I)V
      // 1b2: areturn
      // 1b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: lload 2
      // 1b8: iload 11
      // 1ba: i2l
      // 1bb: lsub
      // 1bc: lstore 2
      // 1bd: iload 1
      // 1be: ifeq 12a
      // 1c1: iload 4
      // 1c3: iload 1
      // 1c4: ifne 2c6
      // 1c7: ifeq 2ad
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: iload 5
      // 1d3: iload 1
      // 1d4: ifne 20b
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: getfield com/finalshell/core/U9.S I
      // 1e2: bipush 1
      // 1e3: iadd
      // 1e4: if_icmple 288
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: lload 2
      // 1ef: iload 1
      // 1f0: ifne 284
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: sipush 21037
      // 1fd: ldc2_w 3277254628683544955
      // 200: invokestatic com/finalshell/core/U9.c (IJ)J
      // 203: lcmp
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: iflt 283
      // 20e: iload 12
      // 210: sipush 24882
      // 213: ldc2_w 2640544065015594009
      // 216: invokestatic com/finalshell/core/U9.a (IJ)I
      // 219: iload 1
      // 21a: ifne 240
      // 21d: goto 224
      // 220: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 223: athrow
      // 224: if_icmpeq 283
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: iload 12
      // 230: sipush 25916
      // 233: ldc2_w 7342535848027207785
      // 236: invokestatic com/finalshell/core/U9.a (IJ)I
      // 239: goto 240
      // 23c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23f: athrow
      // 240: iload 1
      // 241: ifne 26f
      // 244: if_icmpne 259
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: lload 2
      // 24f: l2i
      // 250: i2s
      // 251: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 254: areturn
      // 255: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: iload 12
      // 25b: iload 1
      // 25c: ifne 27f
      // 25f: sipush 28091
      // 262: ldc2_w 7922031995348824293
      // 265: invokestatic com/finalshell/core/U9.a (IJ)I
      // 268: goto 26f
      // 26b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26e: athrow
      // 26f: if_icmpne 27d
      // 272: lload 2
      // 273: l2i
      // 274: i2b
      // 275: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 278: areturn
      // 279: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27c: athrow
      // 27d: lload 2
      // 27e: l2i
      // 27f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 282: areturn
      // 283: lload 2
      // 284: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 287: areturn
      // 288: new com/finalshell/core/Hi2
      // 28b: dup
      // 28c: new java/lang/StringBuilder
      // 28f: dup
      // 290: invokespecial java/lang/StringBuilder.<init> ()V
      // 293: sipush 10549
      // 296: sipush -30954
      // 299: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 29c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29f: aload 0
      // 2a0: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 2a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a9: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2ac: athrow
      // 2ad: lload 2
      // 2ae: lneg
      // 2af: lstore 2
      // 2b0: lload 2
      // 2b1: iload 1
      // 2b2: ifne 33f
      // 2b5: sipush 14694
      // 2b8: ldc2_w 18234741758038586
      // 2bb: invokestatic com/finalshell/core/U9.c (IJ)J
      // 2be: lcmp
      // 2bf: goto 2c6
      // 2c2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c5: athrow
      // 2c6: ifgt 33e
      // 2c9: iload 12
      // 2cb: sipush 24882
      // 2ce: ldc2_w 2640544065015594009
      // 2d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d4: iload 1
      // 2d5: ifne 2fb
      // 2d8: goto 2df
      // 2db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2de: athrow
      // 2df: if_icmpeq 33e
      // 2e2: goto 2e9
      // 2e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: iload 12
      // 2eb: sipush 25916
      // 2ee: ldc2_w 7342535848027207785
      // 2f1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: iload 1
      // 2fc: ifne 32a
      // 2ff: if_icmpne 314
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: lload 2
      // 30a: l2i
      // 30b: i2s
      // 30c: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 30f: areturn
      // 310: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 313: athrow
      // 314: iload 12
      // 316: iload 1
      // 317: ifne 33a
      // 31a: sipush 28091
      // 31d: ldc2_w 7922031995348824293
      // 320: invokestatic com/finalshell/core/U9.a (IJ)I
      // 323: goto 32a
      // 326: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: if_icmpne 338
      // 32d: lload 2
      // 32e: l2i
      // 32f: i2b
      // 330: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 333: areturn
      // 334: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 337: athrow
      // 338: lload 2
      // 339: l2i
      // 33a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33d: areturn
      // 33e: lload 2
      // 33f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 342: areturn
   }

   @Override
   public final void e(int var1) {
      this.n((char)a(5277, 8676978433026148774L));
   }

   public float I$float() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 0d: fstore 3
      // 0e: fload 3
      // 0f: fconst_0
      // 10: fcmpl
      // 11: iload 1
      // 12: ifne 45
      // 15: ifeq 39
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: fload 3
      // 20: iload 1
      // 21: ifne 9c
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ldc_w Infinity
      // 2e: fcmpl
      // 2f: ifne 9b
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 2
      // 3a: bipush 0
      // 3b: invokevirtual java/lang/String.charAt (I)C
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: istore 4
      // 47: iload 4
      // 49: sipush 21259
      // 4c: ldc2_w 1287927339301015045
      // 4f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 52: iload 1
      // 53: ifne 72
      // 56: if_icmple 9b
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: iload 4
      // 62: sipush 24153
      // 65: ldc2_w 3168790736949871469
      // 68: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: if_icmpgt 9b
      // 75: new com/finalshell/core/Hi2
      // 78: dup
      // 79: new java/lang/StringBuilder
      // 7c: dup
      // 7d: invokespecial java/lang/StringBuilder.<init> ()V
      // 80: sipush 10504
      // 83: sipush -18305
      // 86: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: aload 2
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 96: athrow
      // 97: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: fload 3
      // 9c: freturn
   }

   public double O() {
      return Double.parseDouble(this.c$String());
   }

   @Override
   public void K(Ks2_2 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: aload 0
      // 04: aload 0
      // 05: getfield com/finalshell/core/U9.y I
      // 08: aload 1
      // 09: iload 2
      // 0a: invokestatic com/finalshell/ui/model/Ks2_2.H (ILcom/finalshell/ui/model/Ks2_2;Z)I
      // 0d: putfield com/finalshell/core/U9.y I
      // 10: istore 3
      // 11: aload 0
      // 12: iload 3
      // 13: ifeq 32
      // 16: getfield com/finalshell/core/U9.y I
      // 19: getstatic com/finalshell/ui/model/Ks2_2.InitStringFieldAsEmpty Lcom/finalshell/ui/model/Ks2_2;
      // 1c: getfield com/finalshell/ui/model/Ks2_2.mask I
      // 1f: iand
      // 20: ifeq 37
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: ldc ""
      // 34: putfield com/finalshell/core/U9.J Ljava/lang/String;
      // 37: return
   }

   @Override
   public final boolean w(Ks2_2 var1) {
      return this.g(var1.mask);
   }

   @Override
   public final boolean g(int var1) {
      boolean var2 = Yn4.Y();

      try {
         int var10000 = this.y & var1;
         if (!var2) {
            return var10000 != 0;
         }

         if (var10000 != 0) {
            return 1 != 0;
         }
      } catch (Hi2 var3) {
         throw a(var3);
      }

      return 0 != 0;
   }

   public final boolean X(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/U9.y I
      // 08: iload 2
      // 09: iand
      // 0a: iload 3
      // 0b: ifne 31
      // 0e: ifne 30
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: iload 1
      // 19: iload 2
      // 1a: iand
      // 1b: iload 3
      // 1c: ifne 31
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: ifeq 34
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   @Override
   public abstract String c$String();

   public abstract boolean A$boolean();

   @Override
   public final char w$char() {
      return this.l;
   }

   public abstract char C(int var1);

   @Override
   public abstract char C$char();

   public void F() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: aload 0
      // 04: invokevirtual com/finalshell/core/U9.C$char ()C
      // 07: pop
      // 08: istore 1
      // 09: aload 0
      // 0a: getfield com/finalshell/core/U9.l C
      // 0d: sipush 9180
      // 10: ldc2_w 6298462668578782968
      // 13: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16: iload 1
      // 17: ifeq 73
      // 1a: if_icmpne 5b
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual com/finalshell/core/U9.C$char ()C
      // 28: pop
      // 29: aload 0
      // 2a: getfield com/finalshell/core/U9.l C
      // 2d: sipush 1861
      // 30: ldc2_w 5349631099953699429
      // 33: invokestatic com/finalshell/core/U9.a (IJ)I
      // 36: if_icmpne 46
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: invokevirtual com/finalshell/core/U9.C$char ()C
      // 44: pop
      // 45: return
      // 46: aload 0
      // 47: getfield com/finalshell/core/U9.l C
      // 4a: sipush 2765
      // 4d: ldc2_w 8216137057917720563
      // 50: invokestatic com/finalshell/core/U9.a (IJ)I
      // 53: if_icmpne 24
      // 56: iload 1
      // 57: ifeq 45
      // 5a: return
      // 5b: aload 0
      // 5c: getfield com/finalshell/core/U9.l C
      // 5f: iload 1
      // 60: ifeq 81
      // 63: sipush 1400
      // 66: ldc2_w 4628862990277073005
      // 69: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: if_icmpne e0
      // 76: aload 0
      // 77: invokevirtual com/finalshell/core/U9.C$char ()C
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: pop
      // 82: aload 0
      // 83: getfield com/finalshell/core/U9.l C
      // 86: sipush 2765
      // 89: ldc2_w 8216137057917720563
      // 8c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8f: if_icmpeq f1
      // 92: aload 0
      // 93: getfield com/finalshell/core/U9.l C
      // 96: iload 1
      // 97: ifeq db
      // 9a: sipush 24333
      // 9d: ldc2_w 1809113354653106702
      // a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // a3: if_icmpne d7
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 0
      // ae: invokevirtual com/finalshell/core/U9.C$char ()C
      // b1: pop
      // b2: aload 0
      // b3: getfield com/finalshell/core/U9.l C
      // b6: sipush 9180
      // b9: ldc2_w 6298462668578782968
      // bc: invokestatic com/finalshell/core/U9.a (IJ)I
      // bf: if_icmpne 82
      // c2: goto c9
      // c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c8: athrow
      // c9: aload 0
      // ca: invokevirtual com/finalshell/core/U9.C$char ()C
      // cd: pop
      // ce: iload 1
      // cf: ifeq dc
      // d2: return
      // d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d6: athrow
      // d7: aload 0
      // d8: invokevirtual com/finalshell/core/U9.C$char ()C
      // db: pop
      // dc: iload 1
      // dd: ifne 82
      // e0: new com/finalshell/core/Hi2
      // e3: dup
      // e4: sipush 10558
      // e7: sipush 29564
      // ea: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // ed: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // f0: athrow
      // f1: return
   }

   @Override
   public final String Q(O12 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: invokevirtual com/finalshell/core/U9.N ()V
      // 007: istore 2
      // 008: aload 0
      // 009: getfield com/finalshell/core/U9.l C
      // 00c: sipush 26107
      // 00f: ldc2_w 2081374444732725480
      // 012: invokestatic com/finalshell/core/U9.a (IJ)I
      // 015: iload 2
      // 016: ifeq 043
      // 019: if_icmpne 036
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 0
      // 024: aload 1
      // 025: sipush 26107
      // 028: ldc2_w 2081374444732725480
      // 02b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 02e: invokevirtual com/finalshell/core/U9.z (Lcom/finalshell/core/O12;C)Ljava/lang/String;
      // 031: areturn
      // 032: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 0
      // 037: getfield com/finalshell/core/U9.l C
      // 03a: sipush 15280
      // 03d: ldc2_w 3357099522267637465
      // 040: invokestatic com/finalshell/core/U9.a (IJ)I
      // 043: iload 2
      // 044: ifeq 09e
      // 047: if_icmpne 091
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: iload 2
      // 053: ifeq 083
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: getstatic com/finalshell/ui/model/Ks2_2.AllowSingleQuotes Lcom/finalshell/ui/model/Ks2_2;
      // 060: invokevirtual com/finalshell/core/U9.w (Lcom/finalshell/ui/model/Ks2_2;)Z
      // 063: ifne 082
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: new com/finalshell/core/Hi2
      // 070: dup
      // 071: sipush 10508
      // 074: sipush -28589
      // 077: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 07a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 07d: athrow
      // 07e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: aload 0
      // 083: aload 1
      // 084: sipush 15280
      // 087: ldc2_w 3357099522267637465
      // 08a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 08d: invokevirtual com/finalshell/core/U9.z (Lcom/finalshell/core/O12;C)Ljava/lang/String;
      // 090: areturn
      // 091: aload 0
      // 092: getfield com/finalshell/core/U9.l C
      // 095: sipush 4784
      // 098: ldc2_w 3082167687830622095
      // 09b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09e: iload 2
      // 09f: ifeq 0d1
      // 0a2: if_icmpne 0c4
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0b0: pop
      // 0b1: aload 0
      // 0b2: sipush 16923
      // 0b5: ldc2_w 1571494982232874791
      // 0b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0bb: putfield com/finalshell/core/U9.Y I
      // 0be: aconst_null
      // 0bf: areturn
      // 0c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield com/finalshell/core/U9.l C
      // 0c8: sipush 26927
      // 0cb: ldc2_w 6101958691031889140
      // 0ce: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d1: iload 2
      // 0d2: ifeq 10f
      // 0d5: if_icmpne 0f7
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0e3: pop
      // 0e4: aload 0
      // 0e5: sipush 9361
      // 0e8: ldc2_w 2488456831667599749
      // 0eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ee: putfield com/finalshell/core/U9.Y I
      // 0f1: aconst_null
      // 0f2: areturn
      // 0f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/U9.l C
      // 0fb: iload 2
      // 0fc: ifeq 137
      // 0ff: sipush 2765
      // 102: ldc2_w 8216137057917720563
      // 105: invokestatic com/finalshell/core/U9.a (IJ)I
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: if_icmpne 125
      // 112: aload 0
      // 113: sipush 9907
      // 116: ldc2_w 514190805586246625
      // 119: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11c: putfield com/finalshell/core/U9.Y I
      // 11f: aconst_null
      // 120: areturn
      // 121: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: aload 0
      // 126: iload 2
      // 127: ifeq 150
      // 12a: getstatic com/finalshell/ui/model/Ks2_2.AllowUnQuotedFieldNames Lcom/finalshell/ui/model/Ks2_2;
      // 12d: invokevirtual com/finalshell/core/U9.w (Lcom/finalshell/ui/model/Ks2_2;)Z
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: ifne 14f
      // 13a: new com/finalshell/core/Hi2
      // 13d: dup
      // 13e: sipush 10559
      // 141: sipush -31599
      // 144: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 147: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 14a: athrow
      // 14b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: aload 0
      // 150: aload 1
      // 151: invokevirtual com/finalshell/core/U9.w (Lcom/finalshell/core/O12;)Ljava/lang/String;
      // 154: areturn
   }

   public abstract void w(int var1, char[] var2, int var3, int var4);

   @Override
   public final String z(O12 param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 4
      // 003: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 006: aload 0
      // 007: aload 0
      // 008: getfield com/finalshell/core/U9.d I
      // 00b: putfield com/finalshell/core/U9.S I
      // 00e: aload 0
      // 00f: bipush 0
      // 010: putfield com/finalshell/core/U9.e I
      // 013: istore 3
      // 014: bipush 0
      // 015: istore 5
      // 017: aload 0
      // 018: invokevirtual com/finalshell/core/U9.C$char ()C
      // 01b: istore 6
      // 01d: iload 6
      // 01f: iload 2
      // 020: if_icmpne 032
      // 023: iload 3
      // 024: ifeq 067
      // 027: iload 3
      // 028: ifne 640
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: iload 6
      // 034: sipush 2765
      // 037: ldc2_w 8216137057917720563
      // 03a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 03d: iload 3
      // 03e: ifeq 072
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: if_icmpne 067
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: new com/finalshell/core/Hi2
      // 055: dup
      // 056: sipush 10536
      // 059: sipush 9926
      // 05c: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 05f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 062: athrow
      // 063: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: iload 6
      // 069: sipush 30531
      // 06c: ldc2_w 4175784576570993226
      // 06f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 072: iload 3
      // 073: ifeq 5da
      // 076: if_icmpne 5cc
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: iload 5
      // 082: iload 3
      // 083: ifeq 116
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: ifne 103
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: bipush 1
      // 098: istore 5
      // 09a: aload 0
      // 09b: iload 3
      // 09c: ifeq 0f1
      // 09f: getfield com/finalshell/core/U9.e I
      // 0a2: aload 0
      // 0a3: getfield com/finalshell/core/U9.V [C
      // 0a6: arraylength
      // 0a7: if_icmplt 0f0
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/core/U9.V [C
      // 0b5: arraylength
      // 0b6: bipush 2
      // 0b7: imul
      // 0b8: istore 7
      // 0ba: aload 0
      // 0bb: getfield com/finalshell/core/U9.e I
      // 0be: iload 3
      // 0bf: ifeq 0d6
      // 0c2: iload 7
      // 0c4: if_icmple 0d4
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/core/U9.e I
      // 0d2: istore 7
      // 0d4: iload 7
      // 0d6: newarray 5
      // 0d8: astore 8
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/U9.V [C
      // 0de: bipush 0
      // 0df: aload 8
      // 0e1: bipush 0
      // 0e2: aload 0
      // 0e3: getfield com/finalshell/core/U9.V [C
      // 0e6: arraylength
      // 0e7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ea: aload 0
      // 0eb: aload 8
      // 0ed: putfield com/finalshell/core/U9.V [C
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield com/finalshell/core/U9.S I
      // 0f5: bipush 1
      // 0f6: iadd
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/U9.V [C
      // 0fb: bipush 0
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/core/U9.e I
      // 100: invokevirtual com/finalshell/core/U9.w (I[CII)V
      // 103: aload 0
      // 104: invokevirtual com/finalshell/core/U9.C$char ()C
      // 107: istore 6
      // 109: iload 3
      // 10a: ifeq 5bb
      // 10d: iload 6
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: tableswitch 1183 34 120 832 1183 1183 1183 1183 873 1183 1183 1183 1183 1183 1183 1183 914 362 388 414 440 466 492 518 552 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 750 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 1183 955 1183 1183 1183 1183 1183 586 1183 1183 1183 750 1183 1183 1183 1183 1183 1183 1183 668 1183 1183 1183 791 1183 627 1075 709 1183 996
      // 280: sipush 15860
      // 283: ldc2_w 1051985027903185082
      // 286: invokestatic com/finalshell/core/U9.a (IJ)I
      // 289: iload 4
      // 28b: imul
      // 28c: iload 6
      // 28e: iadd
      // 28f: istore 4
      // 291: aload 0
      // 292: bipush 0
      // 293: invokevirtual com/finalshell/core/U9.x (C)V
      // 296: iload 3
      // 297: ifne 017
      // 29a: sipush 15860
      // 29d: ldc2_w 1051985027903185082
      // 2a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a3: iload 4
      // 2a5: imul
      // 2a6: iload 6
      // 2a8: iadd
      // 2a9: istore 4
      // 2ab: aload 0
      // 2ac: bipush 1
      // 2ad: invokevirtual com/finalshell/core/U9.x (C)V
      // 2b0: iload 3
      // 2b1: ifne 017
      // 2b4: sipush 15860
      // 2b7: ldc2_w 1051985027903185082
      // 2ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bd: iload 4
      // 2bf: imul
      // 2c0: iload 6
      // 2c2: iadd
      // 2c3: istore 4
      // 2c5: aload 0
      // 2c6: bipush 2
      // 2c7: invokevirtual com/finalshell/core/U9.x (C)V
      // 2ca: iload 3
      // 2cb: ifne 017
      // 2ce: sipush 15860
      // 2d1: ldc2_w 1051985027903185082
      // 2d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d7: iload 4
      // 2d9: imul
      // 2da: iload 6
      // 2dc: iadd
      // 2dd: istore 4
      // 2df: aload 0
      // 2e0: bipush 3
      // 2e1: invokevirtual com/finalshell/core/U9.x (C)V
      // 2e4: iload 3
      // 2e5: ifne 017
      // 2e8: sipush 15860
      // 2eb: ldc2_w 1051985027903185082
      // 2ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f1: iload 4
      // 2f3: imul
      // 2f4: iload 6
      // 2f6: iadd
      // 2f7: istore 4
      // 2f9: aload 0
      // 2fa: bipush 4
      // 2fb: invokevirtual com/finalshell/core/U9.x (C)V
      // 2fe: iload 3
      // 2ff: ifne 017
      // 302: sipush 15860
      // 305: ldc2_w 1051985027903185082
      // 308: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30b: iload 4
      // 30d: imul
      // 30e: iload 6
      // 310: iadd
      // 311: istore 4
      // 313: aload 0
      // 314: bipush 5
      // 315: invokevirtual com/finalshell/core/U9.x (C)V
      // 318: iload 3
      // 319: ifne 017
      // 31c: sipush 15860
      // 31f: ldc2_w 1051985027903185082
      // 322: invokestatic com/finalshell/core/U9.a (IJ)I
      // 325: iload 4
      // 327: imul
      // 328: iload 6
      // 32a: iadd
      // 32b: istore 4
      // 32d: aload 0
      // 32e: sipush 3944
      // 331: ldc2_w 2225081863752602224
      // 334: invokestatic com/finalshell/core/U9.a (IJ)I
      // 337: invokevirtual com/finalshell/core/U9.x (C)V
      // 33a: iload 3
      // 33b: ifne 017
      // 33e: sipush 15860
      // 341: ldc2_w 1051985027903185082
      // 344: invokestatic com/finalshell/core/U9.a (IJ)I
      // 347: iload 4
      // 349: imul
      // 34a: iload 6
      // 34c: iadd
      // 34d: istore 4
      // 34f: aload 0
      // 350: sipush 22600
      // 353: ldc2_w 9208633943651026235
      // 356: invokestatic com/finalshell/core/U9.a (IJ)I
      // 359: invokevirtual com/finalshell/core/U9.x (C)V
      // 35c: iload 3
      // 35d: ifne 017
      // 360: sipush 15860
      // 363: ldc2_w 1051985027903185082
      // 366: invokestatic com/finalshell/core/U9.a (IJ)I
      // 369: iload 4
      // 36b: imul
      // 36c: sipush 16265
      // 36f: ldc2_w 35568148908106386
      // 372: invokestatic com/finalshell/core/U9.a (IJ)I
      // 375: iadd
      // 376: istore 4
      // 378: aload 0
      // 379: sipush 16265
      // 37c: ldc2_w 35568148908106386
      // 37f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 382: invokevirtual com/finalshell/core/U9.x (C)V
      // 385: iload 3
      // 386: ifne 017
      // 389: sipush 15860
      // 38c: ldc2_w 1051985027903185082
      // 38f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 392: iload 4
      // 394: imul
      // 395: sipush 28233
      // 398: ldc2_w 5739983667078181753
      // 39b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 39e: iadd
      // 39f: istore 4
      // 3a1: aload 0
      // 3a2: sipush 28233
      // 3a5: ldc2_w 5739983667078181753
      // 3a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ab: invokevirtual com/finalshell/core/U9.x (C)V
      // 3ae: iload 3
      // 3af: ifne 017
      // 3b2: sipush 15860
      // 3b5: ldc2_w 1051985027903185082
      // 3b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3bb: iload 4
      // 3bd: imul
      // 3be: sipush 1861
      // 3c1: ldc2_w 5349631099953699429
      // 3c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c7: iadd
      // 3c8: istore 4
      // 3ca: aload 0
      // 3cb: sipush 1861
      // 3ce: ldc2_w 5349631099953699429
      // 3d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3d4: invokevirtual com/finalshell/core/U9.x (C)V
      // 3d7: iload 3
      // 3d8: ifne 017
      // 3db: sipush 15860
      // 3de: ldc2_w 1051985027903185082
      // 3e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e4: iload 4
      // 3e6: imul
      // 3e7: sipush 32041
      // 3ea: ldc2_w 2283178923427340345
      // 3ed: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f0: iadd
      // 3f1: istore 4
      // 3f3: aload 0
      // 3f4: sipush 32041
      // 3f7: ldc2_w 2283178923427340345
      // 3fa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3fd: invokevirtual com/finalshell/core/U9.x (C)V
      // 400: iload 3
      // 401: ifne 017
      // 404: sipush 15860
      // 407: ldc2_w 1051985027903185082
      // 40a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 40d: iload 4
      // 40f: imul
      // 410: sipush 16823
      // 413: ldc2_w 1966285255030480114
      // 416: invokestatic com/finalshell/core/U9.a (IJ)I
      // 419: iadd
      // 41a: istore 4
      // 41c: aload 0
      // 41d: sipush 16823
      // 420: ldc2_w 1966285255030480114
      // 423: invokestatic com/finalshell/core/U9.a (IJ)I
      // 426: invokevirtual com/finalshell/core/U9.x (C)V
      // 429: iload 3
      // 42a: ifne 017
      // 42d: sipush 15860
      // 430: ldc2_w 1051985027903185082
      // 433: invokestatic com/finalshell/core/U9.a (IJ)I
      // 436: iload 4
      // 438: imul
      // 439: sipush 16923
      // 43c: ldc2_w 1571494982232874791
      // 43f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 442: iadd
      // 443: istore 4
      // 445: aload 0
      // 446: sipush 16923
      // 449: ldc2_w 1571494982232874791
      // 44c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 44f: invokevirtual com/finalshell/core/U9.x (C)V
      // 452: iload 3
      // 453: ifne 017
      // 456: sipush 15860
      // 459: ldc2_w 1051985027903185082
      // 45c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 45f: iload 4
      // 461: imul
      // 462: sipush 26107
      // 465: ldc2_w 2081374444732725480
      // 468: invokestatic com/finalshell/core/U9.a (IJ)I
      // 46b: iadd
      // 46c: istore 4
      // 46e: aload 0
      // 46f: sipush 26107
      // 472: ldc2_w 2081374444732725480
      // 475: invokestatic com/finalshell/core/U9.a (IJ)I
      // 478: invokevirtual com/finalshell/core/U9.x (C)V
      // 47b: iload 3
      // 47c: ifne 017
      // 47f: sipush 15860
      // 482: ldc2_w 1051985027903185082
      // 485: invokestatic com/finalshell/core/U9.a (IJ)I
      // 488: iload 4
      // 48a: imul
      // 48b: sipush 15280
      // 48e: ldc2_w 3357099522267637465
      // 491: invokestatic com/finalshell/core/U9.a (IJ)I
      // 494: iadd
      // 495: istore 4
      // 497: aload 0
      // 498: sipush 15280
      // 49b: ldc2_w 3357099522267637465
      // 49e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4a1: invokevirtual com/finalshell/core/U9.x (C)V
      // 4a4: iload 3
      // 4a5: ifne 017
      // 4a8: sipush 15860
      // 4ab: ldc2_w 1051985027903185082
      // 4ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b1: iload 4
      // 4b3: imul
      // 4b4: sipush 9180
      // 4b7: ldc2_w 6298462668578782968
      // 4ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4bd: iadd
      // 4be: istore 4
      // 4c0: aload 0
      // 4c1: sipush 9180
      // 4c4: ldc2_w 6298462668578782968
      // 4c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ca: invokevirtual com/finalshell/core/U9.x (C)V
      // 4cd: iload 3
      // 4ce: ifne 017
      // 4d1: sipush 15860
      // 4d4: ldc2_w 1051985027903185082
      // 4d7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4da: iload 4
      // 4dc: imul
      // 4dd: sipush 30531
      // 4e0: ldc2_w 4175784576570993226
      // 4e3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4e6: iadd
      // 4e7: istore 4
      // 4e9: aload 0
      // 4ea: sipush 30531
      // 4ed: ldc2_w 4175784576570993226
      // 4f0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f3: invokevirtual com/finalshell/core/U9.x (C)V
      // 4f6: iload 3
      // 4f7: ifne 017
      // 4fa: aload 0
      // 4fb: aload 0
      // 4fc: invokevirtual com/finalshell/core/U9.C$char ()C
      // 4ff: dup_x1
      // 500: putfield com/finalshell/core/U9.l C
      // 503: istore 7
      // 505: aload 0
      // 506: aload 0
      // 507: invokevirtual com/finalshell/core/U9.C$char ()C
      // 50a: dup_x1
      // 50b: putfield com/finalshell/core/U9.l C
      // 50e: istore 8
      // 510: getstatic com/finalshell/core/U9.K [I
      // 513: iload 7
      // 515: iaload
      // 516: sipush 9361
      // 519: ldc2_w 2488456831667599749
      // 51c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 51f: imul
      // 520: getstatic com/finalshell/core/U9.K [I
      // 523: iload 8
      // 525: iaload
      // 526: iadd
      // 527: istore 9
      // 529: sipush 15860
      // 52c: iload 9
      // 52e: i2c
      // 52f: istore 10
      // 531: ldc2_w 1051985027903185082
      // 534: invokestatic com/finalshell/core/U9.a (IJ)I
      // 537: iload 4
      // 539: imul
      // 53a: iload 10
      // 53c: iadd
      // 53d: istore 4
      // 53f: aload 0
      // 540: iload 10
      // 542: invokevirtual com/finalshell/core/U9.x (C)V
      // 545: iload 3
      // 546: ifne 017
      // 549: aload 0
      // 54a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 54d: dup
      // 54e: istore 6
      // 550: istore 11
      // 552: aload 0
      // 553: invokevirtual com/finalshell/core/U9.C$char ()C
      // 556: dup
      // 557: istore 6
      // 559: istore 12
      // 55b: aload 0
      // 55c: invokevirtual com/finalshell/core/U9.C$char ()C
      // 55f: dup
      // 560: istore 6
      // 562: istore 13
      // 564: aload 0
      // 565: invokevirtual com/finalshell/core/U9.C$char ()C
      // 568: dup
      // 569: istore 6
      // 56b: istore 14
      // 56d: new java/lang/String
      // 570: dup
      // 571: bipush 4
      // 572: newarray 5
      // 574: dup
      // 575: bipush 0
      // 576: iload 11
      // 578: castore
      // 579: dup
      // 57a: bipush 1
      // 57b: iload 12
      // 57d: castore
      // 57e: dup
      // 57f: bipush 2
      // 580: iload 13
      // 582: castore
      // 583: dup
      // 584: bipush 3
      // 585: iload 14
      // 587: castore
      // 588: invokespecial java/lang/String.<init> ([C)V
      // 58b: sipush 9361
      // 58e: ldc2_w 2488456831667599749
      // 591: invokestatic com/finalshell/core/U9.a (IJ)I
      // 594: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 597: istore 15
      // 599: sipush 15860
      // 59c: ldc2_w 1051985027903185082
      // 59f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a2: iload 4
      // 5a4: imul
      // 5a5: iload 15
      // 5a7: iadd
      // 5a8: istore 4
      // 5aa: aload 0
      // 5ab: iload 15
      // 5ad: i2c
      // 5ae: invokevirtual com/finalshell/core/U9.x (C)V
      // 5b1: iload 3
      // 5b2: ifne 017
      // 5b5: aload 0
      // 5b6: iload 6
      // 5b8: putfield com/finalshell/core/U9.l C
      // 5bb: new com/finalshell/core/Hi2
      // 5be: dup
      // 5bf: sipush 10502
      // 5c2: sipush 27063
      // 5c5: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 5c8: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 5cb: athrow
      // 5cc: sipush 15860
      // 5cf: ldc2_w 1051985027903185082
      // 5d2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5d5: iload 4
      // 5d7: imul
      // 5d8: iload 6
      // 5da: iadd
      // 5db: istore 4
      // 5dd: iload 5
      // 5df: iload 3
      // 5e0: ifeq 611
      // 5e3: ifne 602
      // 5e6: goto 5ed
      // 5e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ec: athrow
      // 5ed: aload 0
      // 5ee: dup
      // 5ef: getfield com/finalshell/core/U9.e I
      // 5f2: bipush 1
      // 5f3: iadd
      // 5f4: putfield com/finalshell/core/U9.e I
      // 5f7: iload 3
      // 5f8: ifne 017
      // 5fb: goto 602
      // 5fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 601: athrow
      // 602: aload 0
      // 603: iload 3
      // 604: ifeq 62b
      // 607: getfield com/finalshell/core/U9.e I
      // 60a: goto 611
      // 60d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 610: athrow
      // 611: aload 0
      // 612: getfield com/finalshell/core/U9.V [C
      // 615: arraylength
      // 616: if_icmpne 62a
      // 619: aload 0
      // 61a: iload 6
      // 61c: invokevirtual com/finalshell/core/U9.x (C)V
      // 61f: iload 3
      // 620: ifne 017
      // 623: goto 62a
      // 626: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 629: athrow
      // 62a: aload 0
      // 62b: getfield com/finalshell/core/U9.V [C
      // 62e: aload 0
      // 62f: dup
      // 630: getfield com/finalshell/core/U9.e I
      // 633: dup_x1
      // 634: bipush 1
      // 635: iadd
      // 636: putfield com/finalshell/core/U9.e I
      // 639: iload 6
      // 63b: castore
      // 63c: iload 3
      // 63d: ifne 017
      // 640: aload 0
      // 641: sipush 2897
      // 644: ldc2_w 695568451002816123
      // 647: invokestatic com/finalshell/core/U9.a (IJ)I
      // 64a: putfield com/finalshell/core/U9.Y I
      // 64d: iload 5
      // 64f: iload 3
      // 650: ifeq 668
      // 653: ifne 6a0
      // 656: goto 65d
      // 659: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65c: athrow
      // 65d: aload 0
      // 65e: getfield com/finalshell/core/U9.S I
      // 661: goto 668
      // 664: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 667: athrow
      // 668: bipush -1
      // 669: iload 3
      // 66a: ifeq 68a
      // 66d: if_icmpne 67e
      // 670: goto 677
      // 673: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 676: athrow
      // 677: bipush 0
      // 678: istore 8
      // 67a: iload 3
      // 67b: ifne 68d
      // 67e: aload 0
      // 67f: getfield com/finalshell/core/U9.S I
      // 682: bipush 1
      // 683: goto 68a
      // 686: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 689: athrow
      // 68a: iadd
      // 68b: istore 8
      // 68d: aload 0
      // 68e: iload 8
      // 690: aload 0
      // 691: getfield com/finalshell/core/U9.e I
      // 694: iload 4
      // 696: aload 1
      // 697: invokevirtual com/finalshell/core/U9.e (IIILcom/finalshell/core/O12;)Ljava/lang/String;
      // 69a: astore 7
      // 69c: iload 3
      // 69d: ifne 6b1
      // 6a0: aload 1
      // 6a1: aload 0
      // 6a2: getfield com/finalshell/core/U9.V [C
      // 6a5: bipush 0
      // 6a6: aload 0
      // 6a7: getfield com/finalshell/core/U9.e I
      // 6aa: iload 4
      // 6ac: invokevirtual com/finalshell/core/O12.n ([CIII)Ljava/lang/String;
      // 6af: astore 7
      // 6b1: aload 0
      // 6b2: bipush 0
      // 6b3: putfield com/finalshell/core/U9.e I
      // 6b6: aload 0
      // 6b7: invokevirtual com/finalshell/core/U9.C$char ()C
      // 6ba: pop
      // 6bb: aload 7
      // 6bd: areturn
   }

   @Override
   public final void w$void() {
      this.e = 0;
   }

   @Override
   public String C$String() {
      return "";
   }

   @Override
   public final String w(O12 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.Y I
      // 008: iload 2
      // 009: ifne 022
      // 00c: bipush 1
      // 00d: if_icmpne 056
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield com/finalshell/core/U9.i I
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: iload 2
      // 023: ifne 046
      // 026: ifne 056
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: iload 2
      // 032: ifne 052
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: getfield com/finalshell/core/U9.d I
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: bipush 1
      // 047: if_icmpne 056
      // 04a: aload 0
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: bipush 0
      // 053: putfield com/finalshell/core/U9.d I
      // 056: getstatic com/finalshell/core/S7.K [Z
      // 059: astore 3
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/U9.l C
      // 05e: istore 4
      // 060: aload 0
      // 061: getfield com/finalshell/core/U9.l C
      // 064: iload 2
      // 065: ifne 08e
      // 068: aload 3
      // 069: arraylength
      // 06a: if_icmpge 08d
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 3
      // 075: iload 4
      // 077: baload
      // 078: iload 2
      // 079: ifne 08e
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: ifeq 091
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: goto 092
      // 091: bipush 0
      // 092: istore 5
      // 094: iload 5
      // 096: ifne 0c9
      // 099: new com/finalshell/core/Hi2
      // 09c: dup
      // 09d: new java/lang/StringBuilder
      // 0a0: dup
      // 0a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a4: sipush 10505
      // 0a7: sipush -22552
      // 0aa: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: aload 0
      // 0b1: getfield com/finalshell/core/U9.l C
      // 0b4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b7: aload 0
      // 0b8: invokevirtual com/finalshell/core/U9.C$String ()Ljava/lang/String;
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c1: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0c4: athrow
      // 0c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: getstatic com/finalshell/core/S7.t [Z
      // 0cc: astore 6
      // 0ce: iload 4
      // 0d0: istore 7
      // 0d2: aload 0
      // 0d3: aload 0
      // 0d4: getfield com/finalshell/core/U9.d I
      // 0d7: putfield com/finalshell/core/U9.S I
      // 0da: aload 0
      // 0db: bipush 1
      // 0dc: putfield com/finalshell/core/U9.e I
      // 0df: aload 0
      // 0e0: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0e3: istore 8
      // 0e5: iload 8
      // 0e7: aload 6
      // 0e9: arraylength
      // 0ea: if_icmpge 124
      // 0ed: aload 6
      // 0ef: iload 8
      // 0f1: baload
      // 0f2: iload 2
      // 0f3: ifne 133
      // 0f6: iload 2
      // 0f7: ifne 133
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: ifne 124
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: iload 2
      // 10c: ifeq 143
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: bipush 2
      // 117: anewarray 211
      // 11a: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: sipush 10758
      // 127: ldc2_w 8080126340802344927
      // 12a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12d: iload 7
      // 12f: imul
      // 130: iload 8
      // 132: iadd
      // 133: istore 7
      // 135: aload 0
      // 136: dup
      // 137: getfield com/finalshell/core/U9.e I
      // 13a: bipush 1
      // 13b: iadd
      // 13c: putfield com/finalshell/core/U9.e I
      // 13f: iload 2
      // 140: ifeq 0df
      // 143: aload 0
      // 144: aload 0
      // 145: aload 0
      // 146: getfield com/finalshell/core/U9.d I
      // 149: invokevirtual com/finalshell/core/U9.C (I)C
      // 14c: putfield com/finalshell/core/U9.l C
      // 14f: aload 0
      // 150: sipush 4325
      // 153: ldc2_w 2531875489902644661
      // 156: invokestatic com/finalshell/core/U9.a (IJ)I
      // 159: putfield com/finalshell/core/U9.Y I
      // 15c: sipush 20456
      // 15f: ldc2_w 3217441703218975474
      // 162: invokestatic com/finalshell/core/U9.a (IJ)I
      // 165: istore 9
      // 167: aload 0
      // 168: getfield com/finalshell/core/U9.e I
      // 16b: bipush 4
      // 16c: iload 2
      // 16d: ifne 18c
      // 170: if_icmpne 233
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: iload 7
      // 17c: sipush 28152
      // 17f: ldc2_w 8914811050425594044
      // 182: invokestatic com/finalshell/core/U9.a (IJ)I
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: iload 2
      // 18d: ifne 1b2
      // 190: if_icmpne 233
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 0
      // 19c: getfield com/finalshell/core/U9.S I
      // 19f: invokevirtual com/finalshell/core/U9.C (I)C
      // 1a2: sipush 7800
      // 1a5: ldc2_w 5201320676148134657
      // 1a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: iload 2
      // 1b3: ifne 1da
      // 1b6: if_icmpne 233
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/U9.S I
      // 1c5: bipush 1
      // 1c6: iadd
      // 1c7: invokevirtual com/finalshell/core/U9.C (I)C
      // 1ca: sipush 25252
      // 1cd: ldc2_w 2256381802227974060
      // 1d0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1d3: goto 1da
      // 1d6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d9: athrow
      // 1da: iload 2
      // 1db: ifne 202
      // 1de: if_icmpne 233
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: aload 0
      // 1ea: getfield com/finalshell/core/U9.S I
      // 1ed: bipush 2
      // 1ee: iadd
      // 1ef: invokevirtual com/finalshell/core/U9.C (I)C
      // 1f2: sipush 7325
      // 1f5: ldc2_w 7975301603790307833
      // 1f8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: iload 2
      // 203: ifne 22a
      // 206: if_icmpne 233
      // 209: goto 210
      // 20c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: aload 0
      // 211: aload 0
      // 212: getfield com/finalshell/core/U9.S I
      // 215: bipush 3
      // 216: iadd
      // 217: invokevirtual com/finalshell/core/U9.C (I)C
      // 21a: sipush 7325
      // 21d: ldc2_w 7975301603790307833
      // 220: invokestatic com/finalshell/core/U9.a (IJ)I
      // 223: goto 22a
      // 226: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: if_icmpne 233
      // 22d: aconst_null
      // 22e: areturn
      // 22f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: aload 1
      // 234: ifnonnull 248
      // 237: aload 0
      // 238: aload 0
      // 239: getfield com/finalshell/core/U9.S I
      // 23c: aload 0
      // 23d: getfield com/finalshell/core/U9.e I
      // 240: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 243: areturn
      // 244: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: aload 0
      // 249: aload 0
      // 24a: getfield com/finalshell/core/U9.S I
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/U9.e I
      // 251: iload 7
      // 253: aload 1
      // 254: invokevirtual com/finalshell/core/U9.e (IIILcom/finalshell/core/O12;)Ljava/lang/String;
      // 257: areturn
   }

   public abstract void l(int var1, int var2, char[] var3);

   @Override
   public final void A$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.d I
      // 008: putfield com/finalshell/core/U9.S I
      // 00b: istore 1
      // 00c: aload 0
      // 00d: bipush 0
      // 00e: putfield com/finalshell/core/U9.L Z
      // 011: aload 0
      // 012: invokevirtual com/finalshell/core/U9.C$char ()C
      // 015: istore 2
      // 016: iload 2
      // 017: sipush 26107
      // 01a: ldc2_w 2081374444732725480
      // 01d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 020: if_icmpne 032
      // 023: iload 1
      // 024: ifne 0a4
      // 027: iload 1
      // 028: ifeq 695
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: iload 2
      // 033: sipush 2765
      // 036: ldc2_w 8216137057917720563
      // 039: invokestatic com/finalshell/core/U9.a (IJ)I
      // 03c: iload 1
      // 03d: ifne 0b9
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: if_icmpne 0a4
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: iload 1
      // 053: ifne 072
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: invokevirtual com/finalshell/core/U9.A$boolean ()Z
      // 060: ifne 082
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 0
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: sipush 2765
      // 075: ldc2_w 8216137057917720563
      // 078: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07b: invokevirtual com/finalshell/core/U9.x (C)V
      // 07e: iload 1
      // 07f: ifeq 011
      // 082: new com/finalshell/core/Hi2
      // 085: dup
      // 086: new java/lang/StringBuilder
      // 089: dup
      // 08a: invokespecial java/lang/StringBuilder.<init> ()V
      // 08d: sipush 10555
      // 090: sipush -25861
      // 093: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: iload 2
      // 09a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 09d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a0: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0a3: athrow
      // 0a4: iload 2
      // 0a5: iload 1
      // 0a6: ifne 636
      // 0a9: sipush 29056
      // 0ac: ldc2_w 7719496880081317096
      // 0af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: if_icmpne 632
      // 0bc: aload 0
      // 0bd: getfield com/finalshell/core/U9.L Z
      // 0c0: iload 1
      // 0c1: ifne 156
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: ifne 145
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: bipush 1
      // 0d7: putfield com/finalshell/core/U9.L Z
      // 0da: aload 0
      // 0db: iload 1
      // 0dc: ifne 134
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: getfield com/finalshell/core/U9.e I
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/core/U9.V [C
      // 0ed: arraylength
      // 0ee: if_icmplt 133
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/U9.V [C
      // 0fc: arraylength
      // 0fd: bipush 2
      // 0fe: imul
      // 0ff: istore 3
      // 100: aload 0
      // 101: getfield com/finalshell/core/U9.e I
      // 104: iload 1
      // 105: ifne 119
      // 108: iload 3
      // 109: if_icmple 118
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: aload 0
      // 114: getfield com/finalshell/core/U9.e I
      // 117: istore 3
      // 118: iload 3
      // 119: newarray 5
      // 11b: astore 4
      // 11d: aload 0
      // 11e: getfield com/finalshell/core/U9.V [C
      // 121: bipush 0
      // 122: aload 4
      // 124: bipush 0
      // 125: aload 0
      // 126: getfield com/finalshell/core/U9.V [C
      // 129: arraylength
      // 12a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 12d: aload 0
      // 12e: aload 4
      // 130: putfield com/finalshell/core/U9.V [C
      // 133: aload 0
      // 134: aload 0
      // 135: getfield com/finalshell/core/U9.S I
      // 138: bipush 1
      // 139: iadd
      // 13a: aload 0
      // 13b: getfield com/finalshell/core/U9.e I
      // 13e: aload 0
      // 13f: getfield com/finalshell/core/U9.V [C
      // 142: invokevirtual com/finalshell/core/U9.l (II[C)V
      // 145: aload 0
      // 146: invokevirtual com/finalshell/core/U9.C$char ()C
      // 149: istore 2
      // 14a: iload 1
      // 14b: ifne 610
      // 14e: iload 2
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: tableswitch 1205 34 120 559 1205 1205 1205 1205 576 1205 1205 1205 1205 1205 1205 1205 593 362 378 387 396 405 414 423 440 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 525 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 1205 610 1205 1205 1205 1205 1205 457 1205 1205 1205 525 1205 1205 1205 1205 1205 1205 1205 491 1205 1205 1205 542 1205 474 1126 508 1205 627
      // 2c0: aload 0
      // 2c1: bipush 0
      // 2c2: invokevirtual com/finalshell/core/U9.x (C)V
      // 2c5: iload 1
      // 2c6: ifeq 011
      // 2c9: goto 2d0
      // 2cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: aload 0
      // 2d1: bipush 1
      // 2d2: invokevirtual com/finalshell/core/U9.x (C)V
      // 2d5: iload 1
      // 2d6: ifeq 011
      // 2d9: aload 0
      // 2da: bipush 2
      // 2db: invokevirtual com/finalshell/core/U9.x (C)V
      // 2de: iload 1
      // 2df: ifeq 011
      // 2e2: aload 0
      // 2e3: bipush 3
      // 2e4: invokevirtual com/finalshell/core/U9.x (C)V
      // 2e7: iload 1
      // 2e8: ifeq 011
      // 2eb: aload 0
      // 2ec: bipush 4
      // 2ed: invokevirtual com/finalshell/core/U9.x (C)V
      // 2f0: iload 1
      // 2f1: ifeq 011
      // 2f4: aload 0
      // 2f5: bipush 5
      // 2f6: invokevirtual com/finalshell/core/U9.x (C)V
      // 2f9: iload 1
      // 2fa: ifeq 011
      // 2fd: aload 0
      // 2fe: sipush 14084
      // 301: ldc2_w 1355227673099463244
      // 304: invokestatic com/finalshell/core/U9.a (IJ)I
      // 307: invokevirtual com/finalshell/core/U9.x (C)V
      // 30a: iload 1
      // 30b: ifeq 011
      // 30e: aload 0
      // 30f: sipush 22600
      // 312: ldc2_w 9208633943651026235
      // 315: invokestatic com/finalshell/core/U9.a (IJ)I
      // 318: invokevirtual com/finalshell/core/U9.x (C)V
      // 31b: iload 1
      // 31c: ifeq 011
      // 31f: aload 0
      // 320: sipush 16265
      // 323: ldc2_w 35568148908106386
      // 326: invokestatic com/finalshell/core/U9.a (IJ)I
      // 329: invokevirtual com/finalshell/core/U9.x (C)V
      // 32c: iload 1
      // 32d: ifeq 011
      // 330: aload 0
      // 331: sipush 28233
      // 334: ldc2_w 5739983667078181753
      // 337: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33a: invokevirtual com/finalshell/core/U9.x (C)V
      // 33d: iload 1
      // 33e: ifeq 011
      // 341: aload 0
      // 342: sipush 1861
      // 345: ldc2_w 5349631099953699429
      // 348: invokestatic com/finalshell/core/U9.a (IJ)I
      // 34b: invokevirtual com/finalshell/core/U9.x (C)V
      // 34e: iload 1
      // 34f: ifeq 011
      // 352: aload 0
      // 353: sipush 21144
      // 356: ldc2_w 4755168422946901983
      // 359: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35c: invokevirtual com/finalshell/core/U9.x (C)V
      // 35f: iload 1
      // 360: ifeq 011
      // 363: aload 0
      // 364: sipush 16823
      // 367: ldc2_w 1966285255030480114
      // 36a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 36d: invokevirtual com/finalshell/core/U9.x (C)V
      // 370: iload 1
      // 371: ifeq 011
      // 374: aload 0
      // 375: sipush 16923
      // 378: ldc2_w 1571494982232874791
      // 37b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 37e: invokevirtual com/finalshell/core/U9.x (C)V
      // 381: iload 1
      // 382: ifeq 011
      // 385: aload 0
      // 386: sipush 26107
      // 389: ldc2_w 2081374444732725480
      // 38c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 38f: invokevirtual com/finalshell/core/U9.x (C)V
      // 392: iload 1
      // 393: ifeq 011
      // 396: aload 0
      // 397: sipush 12919
      // 39a: ldc2_w 5442412316522344201
      // 39d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a0: invokevirtual com/finalshell/core/U9.x (C)V
      // 3a3: iload 1
      // 3a4: ifeq 011
      // 3a7: aload 0
      // 3a8: sipush 9180
      // 3ab: ldc2_w 6298462668578782968
      // 3ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3b1: invokevirtual com/finalshell/core/U9.x (C)V
      // 3b4: iload 1
      // 3b5: ifeq 011
      // 3b8: aload 0
      // 3b9: sipush 30531
      // 3bc: ldc2_w 4175784576570993226
      // 3bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c2: invokevirtual com/finalshell/core/U9.x (C)V
      // 3c5: iload 1
      // 3c6: ifeq 011
      // 3c9: aload 0
      // 3ca: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3cd: istore 3
      // 3ce: aload 0
      // 3cf: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3d2: istore 4
      // 3d4: iload 3
      // 3d5: sipush 21259
      // 3d8: ldc2_w 1287927339301015045
      // 3db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3de: iload 1
      // 3df: ifne 41c
      // 3e2: if_icmplt 40b
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3eb: athrow
      // 3ec: iload 3
      // 3ed: iload 1
      // 3ee: ifne 488
      // 3f1: goto 3f8
      // 3f4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f7: athrow
      // 3f8: sipush 24153
      // 3fb: ldc2_w 3168790736949871469
      // 3fe: invokestatic com/finalshell/core/U9.a (IJ)I
      // 401: if_icmple 487
      // 404: goto 40b
      // 407: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: iload 3
      // 40c: sipush 31880
      // 40f: ldc2_w 6345766455927677411
      // 412: invokestatic com/finalshell/core/U9.a (IJ)I
      // 415: goto 41c
      // 418: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41b: athrow
      // 41c: iload 1
      // 41d: ifne 45a
      // 420: if_icmplt 449
      // 423: goto 42a
      // 426: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 429: athrow
      // 42a: iload 3
      // 42b: iload 1
      // 42c: ifne 488
      // 42f: goto 436
      // 432: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 435: athrow
      // 436: sipush 23709
      // 439: ldc2_w 6885726342037307881
      // 43c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 43f: if_icmple 487
      // 442: goto 449
      // 445: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 448: athrow
      // 449: iload 3
      // 44a: sipush 5536
      // 44d: ldc2_w 2544096826271647950
      // 450: invokestatic com/finalshell/core/U9.a (IJ)I
      // 453: goto 45a
      // 456: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 459: athrow
      // 45a: iload 1
      // 45b: ifne 484
      // 45e: if_icmplt 48b
      // 461: goto 468
      // 464: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 467: athrow
      // 468: iload 3
      // 469: iload 1
      // 46a: ifne 488
      // 46d: goto 474
      // 470: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 473: athrow
      // 474: sipush 9542
      // 477: ldc2_w 3595215171757176836
      // 47a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 47d: goto 484
      // 480: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 483: athrow
      // 484: if_icmpgt 48b
      // 487: bipush 1
      // 488: goto 48c
      // 48b: bipush 0
      // 48c: istore 5
      // 48e: iload 4
      // 490: sipush 21259
      // 493: ldc2_w 1287927339301015045
      // 496: invokestatic com/finalshell/core/U9.a (IJ)I
      // 499: iload 1
      // 49a: ifne 4d9
      // 49d: if_icmplt 4c7
      // 4a0: goto 4a7
      // 4a3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a6: athrow
      // 4a7: iload 4
      // 4a9: iload 1
      // 4aa: ifne 548
      // 4ad: goto 4b4
      // 4b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b3: athrow
      // 4b4: sipush 24153
      // 4b7: ldc2_w 3168790736949871469
      // 4ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4bd: if_icmple 547
      // 4c0: goto 4c7
      // 4c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c6: athrow
      // 4c7: iload 4
      // 4c9: sipush 31880
      // 4cc: ldc2_w 6345766455927677411
      // 4cf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4d2: goto 4d9
      // 4d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: iload 1
      // 4da: ifne 519
      // 4dd: if_icmplt 507
      // 4e0: goto 4e7
      // 4e3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e6: athrow
      // 4e7: iload 4
      // 4e9: iload 1
      // 4ea: ifne 548
      // 4ed: goto 4f4
      // 4f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f3: athrow
      // 4f4: sipush 23709
      // 4f7: ldc2_w 6885726342037307881
      // 4fa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4fd: if_icmple 547
      // 500: goto 507
      // 503: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 506: athrow
      // 507: iload 4
      // 509: sipush 31506
      // 50c: ldc2_w 427738362136340011
      // 50f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 512: goto 519
      // 515: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 518: athrow
      // 519: iload 1
      // 51a: ifne 544
      // 51d: if_icmplt 54b
      // 520: goto 527
      // 523: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 526: athrow
      // 527: iload 4
      // 529: iload 1
      // 52a: ifne 548
      // 52d: goto 534
      // 530: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 533: athrow
      // 534: sipush 17399
      // 537: ldc2_w 8707971467972353759
      // 53a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 53d: goto 544
      // 540: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 543: athrow
      // 544: if_icmpgt 54b
      // 547: bipush 1
      // 548: goto 54c
      // 54b: bipush 0
      // 54c: istore 6
      // 54e: iload 5
      // 550: iload 1
      // 551: ifne 560
      // 554: ifeq 56e
      // 557: goto 55e
      // 55a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55d: athrow
      // 55e: iload 6
      // 560: iload 1
      // 561: ifne 5b0
      // 564: ifne 599
      // 567: goto 56e
      // 56a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56d: athrow
      // 56e: new com/finalshell/core/Hi2
      // 571: dup
      // 572: new java/lang/StringBuilder
      // 575: dup
      // 576: invokespecial java/lang/StringBuilder.<init> ()V
      // 579: sipush 10498
      // 57c: sipush -16684
      // 57f: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 582: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 585: iload 3
      // 586: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 589: iload 4
      // 58b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 58e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 591: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 594: athrow
      // 595: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 598: athrow
      // 599: getstatic com/finalshell/core/U9.K [I
      // 59c: iload 3
      // 59d: iaload
      // 59e: sipush 9361
      // 5a1: ldc2_w 2488456831667599749
      // 5a4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a7: imul
      // 5a8: getstatic com/finalshell/core/U9.K [I
      // 5ab: iload 4
      // 5ad: iaload
      // 5ae: iadd
      // 5af: i2c
      // 5b0: istore 7
      // 5b2: aload 0
      // 5b3: iload 7
      // 5b5: invokevirtual com/finalshell/core/U9.x (C)V
      // 5b8: iload 1
      // 5b9: ifeq 011
      // 5bc: aload 0
      // 5bd: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5c0: istore 8
      // 5c2: aload 0
      // 5c3: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5c6: istore 9
      // 5c8: aload 0
      // 5c9: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5cc: istore 10
      // 5ce: aload 0
      // 5cf: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5d2: istore 11
      // 5d4: new java/lang/String
      // 5d7: dup
      // 5d8: bipush 4
      // 5d9: newarray 5
      // 5db: dup
      // 5dc: bipush 0
      // 5dd: iload 8
      // 5df: castore
      // 5e0: dup
      // 5e1: bipush 1
      // 5e2: iload 9
      // 5e4: castore
      // 5e5: dup
      // 5e6: bipush 2
      // 5e7: iload 10
      // 5e9: castore
      // 5ea: dup
      // 5eb: bipush 3
      // 5ec: iload 11
      // 5ee: castore
      // 5ef: invokespecial java/lang/String.<init> ([C)V
      // 5f2: sipush 9361
      // 5f5: ldc2_w 2488456831667599749
      // 5f8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5fb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 5fe: istore 12
      // 600: aload 0
      // 601: iload 12
      // 603: i2c
      // 604: invokevirtual com/finalshell/core/U9.x (C)V
      // 607: iload 1
      // 608: ifeq 011
      // 60b: aload 0
      // 60c: iload 2
      // 60d: putfield com/finalshell/core/U9.l C
      // 610: new com/finalshell/core/Hi2
      // 613: dup
      // 614: new java/lang/StringBuilder
      // 617: dup
      // 618: invokespecial java/lang/StringBuilder.<init> ()V
      // 61b: sipush 10534
      // 61e: sipush -22691
      // 621: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 624: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 627: iload 2
      // 628: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 62b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 631: athrow
      // 632: aload 0
      // 633: getfield com/finalshell/core/U9.L Z
      // 636: iload 1
      // 637: ifne 668
      // 63a: ifne 659
      // 63d: goto 644
      // 640: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 643: athrow
      // 644: aload 0
      // 645: dup
      // 646: getfield com/finalshell/core/U9.e I
      // 649: bipush 1
      // 64a: iadd
      // 64b: putfield com/finalshell/core/U9.e I
      // 64e: iload 1
      // 64f: ifeq 011
      // 652: goto 659
      // 655: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 658: athrow
      // 659: aload 0
      // 65a: iload 1
      // 65b: ifne 681
      // 65e: getfield com/finalshell/core/U9.e I
      // 661: goto 668
      // 664: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 667: athrow
      // 668: aload 0
      // 669: getfield com/finalshell/core/U9.V [C
      // 66c: arraylength
      // 66d: if_icmpne 680
      // 670: aload 0
      // 671: iload 2
      // 672: invokevirtual com/finalshell/core/U9.x (C)V
      // 675: iload 1
      // 676: ifeq 011
      // 679: goto 680
      // 67c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67f: athrow
      // 680: aload 0
      // 681: getfield com/finalshell/core/U9.V [C
      // 684: aload 0
      // 685: dup
      // 686: getfield com/finalshell/core/U9.e I
      // 689: dup_x1
      // 68a: bipush 1
      // 68b: iadd
      // 68c: putfield com/finalshell/core/U9.e I
      // 68f: iload 2
      // 690: castore
      // 691: iload 1
      // 692: ifeq 011
      // 695: aload 0
      // 696: sipush 2897
      // 699: ldc2_w 695568451002816123
      // 69c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 69f: putfield com/finalshell/core/U9.Y I
      // 6a2: aload 0
      // 6a3: aload 0
      // 6a4: invokevirtual com/finalshell/core/U9.C$char ()C
      // 6a7: putfield com/finalshell/core/U9.l C
      // 6aa: return
   }

   public Calendar c$Calendar() {
      return this.M;
   }

   @Override
   public TimeZone t() {
      return this.N;
   }

   @Override
   public void J(TimeZone var1) {
      this.N = var1;
   }

   @Override
   public Locale w$Locale() {
      return this.b;
   }

   @Override
   public void D(Locale var1) {
      this.b = var1;
   }

   @Override
   public final int G() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.S I
      // 008: iload 1
      // 009: ifeq 024
      // 00c: bipush -1
      // 00d: if_icmpne 023
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield com/finalshell/core/U9.S I
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: bipush 0
      // 024: istore 2
      // 025: bipush 0
      // 026: istore 3
      // 027: aload 0
      // 028: getfield com/finalshell/core/U9.S I
      // 02b: istore 4
      // 02d: aload 0
      // 02e: getfield com/finalshell/core/U9.S I
      // 031: aload 0
      // 032: getfield com/finalshell/core/U9.e I
      // 035: iadd
      // 036: istore 5
      // 038: aload 0
      // 039: aload 0
      // 03a: getfield com/finalshell/core/U9.S I
      // 03d: invokevirtual com/finalshell/core/U9.C (I)C
      // 040: iload 1
      // 041: ifeq 07b
      // 044: sipush 19418
      // 047: ldc2_w 715321441499911916
      // 04a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04d: if_icmpne 06b
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: bipush 1
      // 058: istore 3
      // 059: sipush 3230
      // 05c: ldc2_w 22340269189059038
      // 05f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 062: istore 6
      // 064: iinc 4 1
      // 067: iload 1
      // 068: ifne 07d
      // 06b: sipush 30596
      // 06e: ldc2_w 6646999769678359173
      // 071: invokestatic com/finalshell/core/U9.a (IJ)I
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: istore 6
      // 07d: sipush 11100
      // 080: ldc2_w 6189022143479840775
      // 083: invokestatic com/finalshell/core/U9.c (IJ)J
      // 086: lstore 8
      // 088: iload 4
      // 08a: iload 5
      // 08c: iload 1
      // 08d: ifeq 0b7
      // 090: if_icmpge 0b3
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 0
      // 09b: iload 4
      // 09d: iinc 4 1
      // 0a0: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a3: sipush 21259
      // 0a6: ldc2_w 1287927339301015045
      // 0a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ac: isub
      // 0ad: istore 7
      // 0af: iload 7
      // 0b1: ineg
      // 0b2: istore 2
      // 0b3: iload 4
      // 0b5: iload 5
      // 0b7: if_icmpge 1a5
      // 0ba: aload 0
      // 0bb: iload 4
      // 0bd: iinc 4 1
      // 0c0: invokevirtual com/finalshell/core/U9.C (I)C
      // 0c3: istore 10
      // 0c5: iload 10
      // 0c7: iload 1
      // 0c8: ifeq 1a6
      // 0cb: sipush 24882
      // 0ce: ldc2_w 2640544065015594009
      // 0d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d4: iload 1
      // 0d5: ifeq 1ce
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: if_icmpeq 1a5
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: iload 10
      // 0eb: iload 1
      // 0ec: ifeq 1a6
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: sipush 25916
      // 0f9: ldc2_w 7342535848027207785
      // 0fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ff: if_icmpeq 1a5
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: iload 10
      // 10b: sipush 28091
      // 10e: ldc2_w 7922031995348824293
      // 111: invokestatic com/finalshell/core/U9.a (IJ)I
      // 114: iload 1
      // 115: ifeq 146
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: if_icmpne 134
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: iload 1
      // 12a: ifne 1a5
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: iload 10
      // 136: sipush 21259
      // 139: ldc2_w 1287927339301015045
      // 13c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: isub
      // 147: istore 7
      // 149: iload 2
      // 14a: i2l
      // 14b: lload 8
      // 14d: lcmp
      // 14e: iload 1
      // 14f: ifeq 179
      // 152: ifge 16c
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: new java/lang/NumberFormatException
      // 15f: dup
      // 160: aload 0
      // 161: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 164: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 167: athrow
      // 168: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: iload 2
      // 16d: sipush 1861
      // 170: ldc2_w 5349631099953699429
      // 173: invokestatic com/finalshell/core/U9.a (IJ)I
      // 176: imul
      // 177: istore 2
      // 178: iload 2
      // 179: iload 6
      // 17b: iload 7
      // 17d: iadd
      // 17e: iload 1
      // 17f: ifeq 19f
      // 182: if_icmpge 19c
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: new java/lang/NumberFormatException
      // 18f: dup
      // 190: aload 0
      // 191: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 194: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 197: athrow
      // 198: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: iload 2
      // 19d: iload 7
      // 19f: isub
      // 1a0: istore 2
      // 1a1: iload 1
      // 1a2: ifne 0b3
      // 1a5: iload 3
      // 1a6: iload 1
      // 1a7: ifeq 1e1
      // 1aa: ifeq 1df
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: iload 4
      // 1b6: iload 1
      // 1b7: ifeq 1d2
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/U9.S I
      // 1c5: bipush 1
      // 1c6: iadd
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: if_icmple 1d3
      // 1d1: iload 2
      // 1d2: ireturn
      // 1d3: new java/lang/NumberFormatException
      // 1d6: dup
      // 1d7: aload 0
      // 1d8: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 1db: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 1de: athrow
      // 1df: iload 2
      // 1e0: ineg
      // 1e1: ireturn
   }

   @Override
   public abstract byte[] e();

   @Override
   public void close() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 32
      // 09: getfield com/finalshell/core/U9.V [C
      // 0c: arraylength
      // 0d: sipush 6188
      // 10: ldc2_w 8417845100170265881
      // 13: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16: if_icmpgt 31
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: getstatic com/finalshell/core/U9.s Ljava/lang/ThreadLocal;
      // 23: aload 0
      // 24: getfield com/finalshell/core/U9.V [C
      // 27: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: aconst_null
      // 33: putfield com/finalshell/core/U9.V [C
      // 36: return
   }

   @Override
   public final boolean p() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/U9.e I
      // 08: bipush 4
      // 09: iload 1
      // 0a: ifne 30
      // 0d: if_icmpeq 1d
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/U9.S I
      // 22: bipush 1
      // 23: iadd
      // 24: invokevirtual com/finalshell/core/U9.C (I)C
      // 27: sipush 5030
      // 2a: ldc2_w 5463149266322411209
      // 2d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30: iload 1
      // 31: ifne 58
      // 34: if_icmpne ba
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 0
      // 40: getfield com/finalshell/core/U9.S I
      // 43: bipush 2
      // 44: iadd
      // 45: invokevirtual com/finalshell/core/U9.C (I)C
      // 48: sipush 24249
      // 4b: ldc2_w 8775186783408882680
      // 4e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: iload 1
      // 59: ifne 80
      // 5c: if_icmpne ba
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: aload 0
      // 68: getfield com/finalshell/core/U9.S I
      // 6b: bipush 3
      // 6c: iadd
      // 6d: invokevirtual com/finalshell/core/U9.C (I)C
      // 70: sipush 16831
      // 73: ldc2_w 1205696545576721607
      // 76: invokestatic com/finalshell/core/U9.a (IJ)I
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: iload 1
      // 81: ifne b3
      // 84: if_icmpne ba
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 0
      // 90: getfield com/finalshell/core/U9.S I
      // 93: bipush 4
      // 94: iadd
      // 95: invokevirtual com/finalshell/core/U9.C (I)C
      // 98: iload 1
      // 99: ifne b7
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: sipush 23709
      // a6: ldc2_w 6885726342037307881
      // a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // ac: goto b3
      // af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: if_icmpne ba
      // b6: bipush 1
      // b7: goto bb
      // ba: bipush 0
      // bb: ireturn
   }

   @Override
   public String t(O12 var1) {
      return null;
   }

   public final int W(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: getstatic com/finalshell/core/U9.Z [C
      // 00d: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 010: iload 2
      // 011: ifne 035
      // 014: ifne 02c
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: sipush 4469
      // 021: ldc2_w 8451788941981764676
      // 024: invokestatic com/finalshell/core/U9.a (IJ)I
      // 027: ireturn
      // 028: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/U9.d I
      // 030: getstatic com/finalshell/core/U9.Z [C
      // 033: arraylength
      // 034: iadd
      // 035: istore 3
      // 036: aload 1
      // 037: invokevirtual java/lang/String.length ()I
      // 03a: istore 4
      // 03c: bipush 0
      // 03d: istore 5
      // 03f: iload 5
      // 041: iload 4
      // 043: if_icmpge 076
      // 046: aload 1
      // 047: iload 5
      // 049: invokevirtual java/lang/String.charAt (I)C
      // 04c: iload 2
      // 04d: ifne 06e
      // 050: aload 0
      // 051: iload 3
      // 052: iload 5
      // 054: iadd
      // 055: invokevirtual com/finalshell/core/U9.C (I)C
      // 058: iload 2
      // 059: ifne 089
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: if_icmpeq 06f
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: bipush -1
      // 06e: ireturn
      // 06f: iinc 5 1
      // 072: iload 2
      // 073: ifeq 03f
      // 076: iload 3
      // 077: iload 4
      // 079: iadd
      // 07a: istore 3
      // 07b: aload 0
      // 07c: iload 3
      // 07d: invokevirtual com/finalshell/core/U9.C (I)C
      // 080: sipush 26107
      // 083: ldc2_w 2081374444732725480
      // 086: invokestatic com/finalshell/core/U9.a (IJ)I
      // 089: iload 2
      // 08a: ifne 0b6
      // 08d: if_icmpeq 09d
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: bipush -1
      // 098: ireturn
      // 099: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 0
      // 09f: iinc 3 1
      // 0a2: iload 3
      // 0a3: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a6: putfield com/finalshell/core/U9.l C
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/U9.l C
      // 0ad: sipush 26927
      // 0b0: ldc2_w 6101958691031889140
      // 0b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b6: iload 2
      // 0b7: ifne 100
      // 0ba: if_icmpne 0e8
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 0
      // 0c6: iinc 3 1
      // 0c9: iload 3
      // 0ca: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cd: putfield com/finalshell/core/U9.l C
      // 0d0: aload 0
      // 0d1: iload 3
      // 0d2: putfield com/finalshell/core/U9.d I
      // 0d5: aload 0
      // 0d6: sipush 9361
      // 0d9: ldc2_w 2488456831667599749
      // 0dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0df: putfield com/finalshell/core/U9.Y I
      // 0e2: bipush 3
      // 0e3: ireturn
      // 0e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/core/U9.l C
      // 0ec: iload 2
      // 0ed: ifne 23a
      // 0f0: sipush 4784
      // 0f3: ldc2_w 3082167687830622095
      // 0f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: if_icmpne 231
      // 103: aload 0
      // 104: aload 0
      // 105: iinc 3 1
      // 108: iload 3
      // 109: invokevirtual com/finalshell/core/U9.C (I)C
      // 10c: putfield com/finalshell/core/U9.l C
      // 10f: aload 0
      // 110: getfield com/finalshell/core/U9.l C
      // 113: sipush 26927
      // 116: ldc2_w 6101958691031889140
      // 119: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11c: iload 2
      // 11d: ifne 169
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: if_icmpne 155
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: aload 0
      // 132: sipush 9361
      // 135: ldc2_w 2488456831667599749
      // 138: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13b: putfield com/finalshell/core/U9.Y I
      // 13e: aload 0
      // 13f: aload 0
      // 140: iinc 3 1
      // 143: iload 3
      // 144: invokevirtual com/finalshell/core/U9.C (I)C
      // 147: putfield com/finalshell/core/U9.l C
      // 14a: iload 2
      // 14b: ifeq 224
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: aload 0
      // 156: getfield com/finalshell/core/U9.l C
      // 159: sipush 30337
      // 15c: ldc2_w 2029800848590515112
      // 15f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: iload 2
      // 16a: ifne 1af
      // 16d: if_icmpne 19b
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: aload 0
      // 178: sipush 9145
      // 17b: ldc2_w 6577731744871808687
      // 17e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 181: putfield com/finalshell/core/U9.Y I
      // 184: aload 0
      // 185: aload 0
      // 186: iinc 3 1
      // 189: iload 3
      // 18a: invokevirtual com/finalshell/core/U9.C (I)C
      // 18d: putfield com/finalshell/core/U9.l C
      // 190: iload 2
      // 191: ifeq 224
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: aload 0
      // 19c: getfield com/finalshell/core/U9.l C
      // 19f: sipush 4784
      // 1a2: ldc2_w 3082167687830622095
      // 1a5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: iload 2
      // 1b0: ifne 200
      // 1b3: if_icmpne 1e1
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: sipush 16923
      // 1c1: ldc2_w 1571494982232874791
      // 1c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c7: putfield com/finalshell/core/U9.Y I
      // 1ca: aload 0
      // 1cb: aload 0
      // 1cc: iinc 3 1
      // 1cf: iload 3
      // 1d0: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d3: putfield com/finalshell/core/U9.l C
      // 1d6: iload 2
      // 1d7: ifeq 224
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: getfield com/finalshell/core/U9.l C
      // 1e5: iload 2
      // 1e6: ifne 223
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: sipush 2765
      // 1f3: ldc2_w 8216137057917720563
      // 1f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: if_icmpne 21b
      // 203: aload 0
      // 204: sipush 9907
      // 207: ldc2_w 514190805586246625
      // 20a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20d: putfield com/finalshell/core/U9.Y I
      // 210: iload 2
      // 211: ifeq 224
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: bipush -1
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: ireturn
      // 224: aload 0
      // 225: sipush 2897
      // 228: ldc2_w 695568451002816123
      // 22b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22e: putfield com/finalshell/core/U9.z I
      // 231: aload 0
      // 232: iload 3
      // 233: putfield com/finalshell/core/U9.d I
      // 236: aload 0
      // 237: getfield com/finalshell/core/U9.z I
      // 23a: ireturn
   }

   public final boolean b(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 009: ifne 03e
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.l C
      // 010: invokestatic com/finalshell/core/U9.Y (C)Z
      // 013: iload 2
      // 014: ifne 059
      // 017: iload 2
      // 018: ifne 03d
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: ifeq 03c
      // 025: goto 02c
      // 028: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokevirtual com/finalshell/core/U9.C$char ()C
      // 030: pop
      // 031: iload 2
      // 032: ifeq 004
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: bipush 0
      // 03d: ireturn
      // 03e: aload 0
      // 03f: aload 0
      // 040: getfield com/finalshell/core/U9.d I
      // 043: aload 1
      // 044: arraylength
      // 045: iadd
      // 046: putfield com/finalshell/core/U9.d I
      // 049: aload 0
      // 04a: aload 0
      // 04b: aload 0
      // 04c: getfield com/finalshell/core/U9.d I
      // 04f: invokevirtual com/finalshell/core/U9.C (I)C
      // 052: putfield com/finalshell/core/U9.l C
      // 055: aload 0
      // 056: getfield com/finalshell/core/U9.l C
      // 059: sipush 26430
      // 05c: ldc2_w 6362384774257064524
      // 05f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 062: iload 2
      // 063: ifne 0a1
      // 066: if_icmpne 08d
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: aload 0
      // 071: invokevirtual com/finalshell/core/U9.C$char ()C
      // 074: pop
      // 075: aload 0
      // 076: sipush 7903
      // 079: ldc2_w 2149410589282452435
      // 07c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07f: putfield com/finalshell/core/U9.Y I
      // 082: iload 2
      // 083: ifeq 19f
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield com/finalshell/core/U9.l C
      // 091: sipush 4512
      // 094: ldc2_w 1334031661316426965
      // 097: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: iload 2
      // 0a2: ifne 0eb
      // 0a5: if_icmpne 0cc
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0b3: pop
      // 0b4: aload 0
      // 0b5: sipush 1667
      // 0b8: ldc2_w 208143214865374180
      // 0bb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0be: putfield com/finalshell/core/U9.Y I
      // 0c1: iload 2
      // 0c2: ifeq 19f
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: iload 2
      // 0ce: ifne 19c
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: getfield com/finalshell/core/U9.l C
      // 0db: sipush 25916
      // 0de: ldc2_w 7342535848027207785
      // 0e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: if_icmpne 194
      // 0ee: aload 0
      // 0ef: iload 2
      // 0f0: ifne 19c
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/core/U9.d I
      // 0fe: bipush 1
      // 0ff: iadd
      // 100: invokevirtual com/finalshell/core/U9.C (I)C
      // 103: sipush 16831
      // 106: ldc2_w 1205696545576721607
      // 109: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10c: if_icmpne 194
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 0
      // 117: iload 2
      // 118: ifne 19c
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 0
      // 123: getfield com/finalshell/core/U9.d I
      // 126: bipush 2
      // 127: iadd
      // 128: invokevirtual com/finalshell/core/U9.C (I)C
      // 12b: sipush 8041
      // 12e: ldc2_w 5268590767087698500
      // 131: invokestatic com/finalshell/core/U9.a (IJ)I
      // 134: if_icmpne 194
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 0
      // 13f: iload 2
      // 140: ifne 19c
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield com/finalshell/core/U9.d I
      // 14e: bipush 3
      // 14f: iadd
      // 150: invokevirtual com/finalshell/core/U9.C (I)C
      // 153: sipush 31790
      // 156: ldc2_w 4972276358763192576
      // 159: invokestatic com/finalshell/core/U9.a (IJ)I
      // 15c: if_icmpne 194
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 0
      // 167: dup
      // 168: getfield com/finalshell/core/U9.d I
      // 16b: bipush 3
      // 16c: iadd
      // 16d: putfield com/finalshell/core/U9.d I
      // 170: aload 0
      // 171: aload 0
      // 172: aload 0
      // 173: getfield com/finalshell/core/U9.d I
      // 176: invokevirtual com/finalshell/core/U9.C (I)C
      // 179: putfield com/finalshell/core/U9.l C
      // 17c: aload 0
      // 17d: sipush 6963
      // 180: ldc2_w 6693040839549666847
      // 183: invokestatic com/finalshell/core/U9.a (IJ)I
      // 186: putfield com/finalshell/core/U9.Y I
      // 189: iload 2
      // 18a: ifeq 19f
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: aload 0
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: invokevirtual com/finalshell/core/U9.K ()V
      // 19f: bipush 1
      // 1a0: ireturn
   }

   public int E(long var1) {
      throw new UnsupportedOperationException();
   }

   public boolean p(int var1) {
      throw new UnsupportedOperationException();
   }

   public int w(long var1, boolean var3) {
      throw new UnsupportedOperationException();
   }

   public int R(long[] var1) {
      throw new UnsupportedOperationException();
   }

   public int q(long var1) {
      throw new UnsupportedOperationException();
   }

   public void I$void() {
      throw new UnsupportedOperationException();
   }

   public void d(boolean var1) {
      throw new UnsupportedOperationException();
   }

   public void M() {
      throw new UnsupportedOperationException();
   }

   public abstract int d(char var1, int var2);

   public abstract String e(int var1, int var2, int var3, O12 var4);

   public String L(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 034
      // 012: ifne 032
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aload 0
      // 02a: invokevirtual com/finalshell/core/U9.r ()Ljava/lang/String;
      // 02d: areturn
      // 02e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 1
      // 033: arraylength
      // 034: istore 3
      // 035: aload 0
      // 036: aload 0
      // 037: getfield com/finalshell/core/U9.d I
      // 03a: iload 3
      // 03b: iinc 3 1
      // 03e: iadd
      // 03f: invokevirtual com/finalshell/core/U9.C (I)C
      // 042: istore 4
      // 044: iload 4
      // 046: sipush 26107
      // 049: ldc2_w 2081374444732725480
      // 04c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04f: iload 2
      // 050: ifne 073
      // 053: if_icmpeq 06b
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 0
      // 05e: bipush -1
      // 05f: putfield com/finalshell/core/U9.z I
      // 062: aload 0
      // 063: invokevirtual com/finalshell/core/U9.r ()Ljava/lang/String;
      // 066: areturn
      // 067: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield com/finalshell/core/U9.d I
      // 06f: aload 1
      // 070: arraylength
      // 071: iadd
      // 072: bipush 1
      // 073: iadd
      // 074: istore 6
      // 076: aload 0
      // 077: sipush 26107
      // 07a: ldc2_w 2081374444732725480
      // 07d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 080: iload 6
      // 082: invokevirtual com/finalshell/core/U9.d (CI)I
      // 085: istore 7
      // 087: iload 7
      // 089: bipush -1
      // 08a: iload 2
      // 08b: ifne 0b5
      // 08e: if_icmpne 0ad
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: new com/finalshell/core/Hi2
      // 09b: dup
      // 09c: sipush 10510
      // 09f: sipush -21017
      // 0a2: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0a5: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0a8: athrow
      // 0a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/core/U9.d I
      // 0b1: aload 1
      // 0b2: arraylength
      // 0b3: iadd
      // 0b4: bipush 1
      // 0b5: iadd
      // 0b6: istore 8
      // 0b8: aload 0
      // 0b9: iload 8
      // 0bb: iload 7
      // 0bd: iload 8
      // 0bf: isub
      // 0c0: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 0c3: astore 9
      // 0c5: aload 9
      // 0c7: sipush 30531
      // 0ca: ldc2_w 4175784576570993226
      // 0cd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d0: invokevirtual java/lang/String.indexOf (I)I
      // 0d3: bipush -1
      // 0d4: iload 2
      // 0d5: ifne 19b
      // 0d8: if_icmpeq 18c
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: bipush 0
      // 0e3: istore 10
      // 0e5: iload 7
      // 0e7: bipush 1
      // 0e8: isub
      // 0e9: istore 11
      // 0eb: iload 11
      // 0ed: iflt 129
      // 0f0: aload 0
      // 0f1: iload 11
      // 0f3: invokevirtual com/finalshell/core/U9.C (I)C
      // 0f6: sipush 30531
      // 0f9: ldc2_w 4175784576570993226
      // 0fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ff: iload 2
      // 100: ifne 12c
      // 103: iload 2
      // 104: ifne 12c
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: if_icmpne 129
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: iinc 10 1
      // 11b: iinc 11 -1
      // 11e: iload 2
      // 11f: ifeq 0eb
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: iload 10
      // 12b: bipush 2
      // 12c: irem
      // 12d: iload 2
      // 12e: ifne 15e
      // 131: ifne 146
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: iload 2
      // 13c: ifeq 164
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: aload 0
      // 147: sipush 26107
      // 14a: ldc2_w 2081374444732725480
      // 14d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 150: iload 7
      // 152: bipush 1
      // 153: iadd
      // 154: invokevirtual com/finalshell/core/U9.d (CI)I
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: istore 7
      // 160: iload 2
      // 161: ifeq 0e2
      // 164: iload 7
      // 166: aload 0
      // 167: getfield com/finalshell/core/U9.d I
      // 16a: aload 1
      // 16b: arraylength
      // 16c: iadd
      // 16d: bipush 1
      // 16e: iadd
      // 16f: isub
      // 170: istore 10
      // 172: aload 0
      // 173: aload 0
      // 174: getfield com/finalshell/core/U9.d I
      // 177: aload 1
      // 178: arraylength
      // 179: iadd
      // 17a: bipush 1
      // 17b: iadd
      // 17c: iload 10
      // 17e: invokevirtual com/finalshell/core/U9.s (II)[C
      // 181: astore 11
      // 183: aload 11
      // 185: iload 10
      // 187: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 18a: astore 9
      // 18c: iload 3
      // 18d: iload 7
      // 18f: aload 0
      // 190: getfield com/finalshell/core/U9.d I
      // 193: aload 1
      // 194: arraylength
      // 195: iadd
      // 196: bipush 1
      // 197: iadd
      // 198: isub
      // 199: bipush 1
      // 19a: iadd
      // 19b: iadd
      // 19c: istore 3
      // 19d: aload 0
      // 19e: aload 0
      // 19f: getfield com/finalshell/core/U9.d I
      // 1a2: iload 3
      // 1a3: iinc 3 1
      // 1a6: iadd
      // 1a7: invokevirtual com/finalshell/core/U9.C (I)C
      // 1aa: istore 4
      // 1ac: aload 9
      // 1ae: astore 5
      // 1b0: iload 4
      // 1b2: sipush 26927
      // 1b5: ldc2_w 6101958691031889140
      // 1b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1bb: iload 2
      // 1bc: ifne 1fe
      // 1bf: if_icmpne 1f3
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: dup
      // 1cb: getfield com/finalshell/core/U9.d I
      // 1ce: iload 3
      // 1cf: iadd
      // 1d0: putfield com/finalshell/core/U9.d I
      // 1d3: aload 0
      // 1d4: aload 0
      // 1d5: aload 0
      // 1d6: getfield com/finalshell/core/U9.d I
      // 1d9: invokevirtual com/finalshell/core/U9.C (I)C
      // 1dc: putfield com/finalshell/core/U9.l C
      // 1df: aload 0
      // 1e0: sipush 5887
      // 1e3: ldc2_w 3467391210321595353
      // 1e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e9: putfield com/finalshell/core/U9.z I
      // 1ec: aload 5
      // 1ee: areturn
      // 1ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: iload 4
      // 1f5: sipush 4784
      // 1f8: ldc2_w 3082167687830622095
      // 1fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1fe: iload 2
      // 1ff: ifne 226
      // 202: if_icmpne 363
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: aload 0
      // 20d: aload 0
      // 20e: getfield com/finalshell/core/U9.d I
      // 211: iload 3
      // 212: iinc 3 1
      // 215: iadd
      // 216: invokevirtual com/finalshell/core/U9.C (I)C
      // 219: istore 4
      // 21b: iload 4
      // 21d: sipush 26927
      // 220: ldc2_w 6101958691031889140
      // 223: invokestatic com/finalshell/core/U9.a (IJ)I
      // 226: iload 2
      // 227: ifne 274
      // 22a: if_icmpne 262
      // 22d: goto 234
      // 230: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 233: athrow
      // 234: aload 0
      // 235: sipush 9361
      // 238: ldc2_w 2488456831667599749
      // 23b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23e: putfield com/finalshell/core/U9.Y I
      // 241: aload 0
      // 242: dup
      // 243: getfield com/finalshell/core/U9.d I
      // 246: iload 3
      // 247: iadd
      // 248: putfield com/finalshell/core/U9.d I
      // 24b: aload 0
      // 24c: aload 0
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/U9.d I
      // 251: invokevirtual com/finalshell/core/U9.C (I)C
      // 254: putfield com/finalshell/core/U9.l C
      // 257: iload 2
      // 258: ifeq 352
      // 25b: goto 262
      // 25e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: iload 4
      // 264: sipush 30337
      // 267: ldc2_w 2029800848590515112
      // 26a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26d: goto 274
      // 270: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: iload 2
      // 275: ifne 2c2
      // 278: if_icmpne 2b0
      // 27b: goto 282
      // 27e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 281: athrow
      // 282: aload 0
      // 283: sipush 9145
      // 286: ldc2_w 6577731744871808687
      // 289: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28c: putfield com/finalshell/core/U9.Y I
      // 28f: aload 0
      // 290: dup
      // 291: getfield com/finalshell/core/U9.d I
      // 294: iload 3
      // 295: iadd
      // 296: putfield com/finalshell/core/U9.d I
      // 299: aload 0
      // 29a: aload 0
      // 29b: aload 0
      // 29c: getfield com/finalshell/core/U9.d I
      // 29f: invokevirtual com/finalshell/core/U9.C (I)C
      // 2a2: putfield com/finalshell/core/U9.l C
      // 2a5: iload 2
      // 2a6: ifeq 352
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: iload 4
      // 2b2: sipush 4784
      // 2b5: ldc2_w 3082167687830622095
      // 2b8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: iload 2
      // 2c3: ifne 310
      // 2c6: if_icmpne 2fe
      // 2c9: goto 2d0
      // 2cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: aload 0
      // 2d1: sipush 16923
      // 2d4: ldc2_w 1571494982232874791
      // 2d7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2da: putfield com/finalshell/core/U9.Y I
      // 2dd: aload 0
      // 2de: dup
      // 2df: getfield com/finalshell/core/U9.d I
      // 2e2: iload 3
      // 2e3: iadd
      // 2e4: putfield com/finalshell/core/U9.d I
      // 2e7: aload 0
      // 2e8: aload 0
      // 2e9: aload 0
      // 2ea: getfield com/finalshell/core/U9.d I
      // 2ed: invokevirtual com/finalshell/core/U9.C (I)C
      // 2f0: putfield com/finalshell/core/U9.l C
      // 2f3: iload 2
      // 2f4: ifeq 352
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fd: athrow
      // 2fe: iload 4
      // 300: sipush 2765
      // 303: ldc2_w 8216137057917720563
      // 306: invokestatic com/finalshell/core/U9.a (IJ)I
      // 309: goto 310
      // 30c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30f: athrow
      // 310: if_icmpne 344
      // 313: aload 0
      // 314: sipush 9907
      // 317: ldc2_w 514190805586246625
      // 31a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 31d: putfield com/finalshell/core/U9.Y I
      // 320: aload 0
      // 321: dup
      // 322: getfield com/finalshell/core/U9.d I
      // 325: iload 3
      // 326: bipush 1
      // 327: isub
      // 328: iadd
      // 329: putfield com/finalshell/core/U9.d I
      // 32c: aload 0
      // 32d: sipush 2765
      // 330: ldc2_w 8216137057917720563
      // 333: invokestatic com/finalshell/core/U9.a (IJ)I
      // 336: putfield com/finalshell/core/U9.l C
      // 339: iload 2
      // 33a: ifeq 352
      // 33d: goto 344
      // 340: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: aload 0
      // 345: bipush -1
      // 346: putfield com/finalshell/core/U9.z I
      // 349: aload 0
      // 34a: invokevirtual com/finalshell/core/U9.r ()Ljava/lang/String;
      // 34d: areturn
      // 34e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 351: athrow
      // 352: aload 0
      // 353: sipush 2897
      // 356: ldc2_w 695568451002816123
      // 359: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35c: putfield com/finalshell/core/U9.z I
      // 35f: iload 2
      // 360: ifeq 371
      // 363: aload 0
      // 364: bipush -1
      // 365: putfield com/finalshell/core/U9.z I
      // 368: aload 0
      // 369: invokevirtual com/finalshell/core/U9.r ()Ljava/lang/String;
      // 36c: areturn
      // 36d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 370: athrow
      // 371: aload 5
      // 373: areturn
   }

   @Override
   public String A(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield com/finalshell/core/U9.z I
      // 005: invokestatic com/finalshell/core/Yn4.o ()Z
      // 008: bipush 0
      // 009: istore 3
      // 00a: istore 2
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: sipush 7800
      // 01f: ldc2_w 5201320676148134657
      // 022: invokestatic com/finalshell/core/U9.a (IJ)I
      // 025: iload 2
      // 026: ifne 114
      // 029: if_icmpne 109
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 0
      // 034: aload 0
      // 035: getfield com/finalshell/core/U9.d I
      // 038: iload 3
      // 039: iadd
      // 03a: iload 2
      // 03b: ifne 0ce
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: invokevirtual com/finalshell/core/U9.C (I)C
      // 048: sipush 25252
      // 04b: ldc2_w 2256381802227974060
      // 04e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 051: if_icmpne 0c5
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 0
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/U9.d I
      // 060: iload 3
      // 061: iadd
      // 062: bipush 1
      // 063: iadd
      // 064: iload 2
      // 065: ifne 0ce
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: invokevirtual com/finalshell/core/U9.C (I)C
      // 072: sipush 7325
      // 075: ldc2_w 7975301603790307833
      // 078: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07b: if_icmpne 0c5
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 0
      // 086: aload 0
      // 087: getfield com/finalshell/core/U9.d I
      // 08a: iload 3
      // 08b: iadd
      // 08c: bipush 2
      // 08d: iadd
      // 08e: iload 2
      // 08f: ifne 0ce
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: invokevirtual com/finalshell/core/U9.C (I)C
      // 09c: sipush 7325
      // 09f: ldc2_w 7975301603790307833
      // 0a2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a5: if_icmpne 0c5
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: iinc 3 3
      // 0b2: aload 0
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/core/U9.d I
      // 0b7: iload 3
      // 0b8: iinc 3 1
      // 0bb: iadd
      // 0bc: invokevirtual com/finalshell/core/U9.C (I)C
      // 0bf: istore 4
      // 0c1: iload 2
      // 0c2: ifeq 0d3
      // 0c5: aload 0
      // 0c6: bipush -1
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: putfield com/finalshell/core/U9.z I
      // 0d1: aconst_null
      // 0d2: areturn
      // 0d3: iload 4
      // 0d5: iload 1
      // 0d6: if_icmpne 102
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield com/finalshell/core/U9.d I
      // 0de: iload 3
      // 0df: iadd
      // 0e0: putfield com/finalshell/core/U9.d I
      // 0e3: aload 0
      // 0e4: aload 0
      // 0e5: aload 0
      // 0e6: getfield com/finalshell/core/U9.d I
      // 0e9: invokevirtual com/finalshell/core/U9.C (I)C
      // 0ec: putfield com/finalshell/core/U9.l C
      // 0ef: aload 0
      // 0f0: sipush 5887
      // 0f3: ldc2_w 3467391210321595353
      // 0f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f9: putfield com/finalshell/core/U9.z I
      // 0fc: aconst_null
      // 0fd: areturn
      // 0fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: aload 0
      // 103: bipush -1
      // 104: putfield com/finalshell/core/U9.z I
      // 107: aconst_null
      // 108: areturn
      // 109: iload 4
      // 10b: sipush 26107
      // 10e: ldc2_w 2081374444732725480
      // 111: invokestatic com/finalshell/core/U9.a (IJ)I
      // 114: if_icmpne 245
      // 117: aload 0
      // 118: getfield com/finalshell/core/U9.d I
      // 11b: iload 3
      // 11c: iadd
      // 11d: istore 6
      // 11f: aload 0
      // 120: sipush 26107
      // 123: ldc2_w 2081374444732725480
      // 126: invokestatic com/finalshell/core/U9.a (IJ)I
      // 129: iload 6
      // 12b: invokevirtual com/finalshell/core/U9.d (CI)I
      // 12e: istore 7
      // 130: iload 7
      // 132: iload 2
      // 133: ifne 251
      // 136: bipush -1
      // 137: if_icmpne 156
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: new com/finalshell/core/Hi2
      // 144: dup
      // 145: sipush 10510
      // 148: sipush -21017
      // 14b: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 14e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 151: athrow
      // 152: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 0
      // 157: aload 0
      // 158: getfield com/finalshell/core/U9.d I
      // 15b: iload 3
      // 15c: iadd
      // 15d: iload 7
      // 15f: iload 6
      // 161: isub
      // 162: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 165: astore 8
      // 167: aload 8
      // 169: sipush 30531
      // 16c: ldc2_w 4175784576570993226
      // 16f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 172: invokevirtual java/lang/String.indexOf (I)I
      // 175: bipush -1
      // 176: iload 2
      // 177: ifne 22c
      // 17a: if_icmpeq 224
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: bipush 0
      // 185: istore 9
      // 187: iload 7
      // 189: bipush 1
      // 18a: isub
      // 18b: istore 10
      // 18d: iload 10
      // 18f: iflt 1cb
      // 192: aload 0
      // 193: iload 10
      // 195: invokevirtual com/finalshell/core/U9.C (I)C
      // 198: sipush 30531
      // 19b: ldc2_w 4175784576570993226
      // 19e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a1: iload 2
      // 1a2: ifne 1ce
      // 1a5: iload 2
      // 1a6: ifne 1ce
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: if_icmpne 1cb
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: iinc 9 1
      // 1bd: iinc 10 -1
      // 1c0: iload 2
      // 1c1: ifeq 18d
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: iload 9
      // 1cd: bipush 2
      // 1ce: irem
      // 1cf: iload 2
      // 1d0: ifne 200
      // 1d3: ifne 1e8
      // 1d6: goto 1dd
      // 1d9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: iload 2
      // 1de: ifeq 206
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: sipush 26107
      // 1ec: ldc2_w 2081374444732725480
      // 1ef: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f2: iload 7
      // 1f4: bipush 1
      // 1f5: iadd
      // 1f6: invokevirtual com/finalshell/core/U9.d (CI)I
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: istore 7
      // 202: iload 2
      // 203: ifeq 184
      // 206: iload 7
      // 208: iload 6
      // 20a: isub
      // 20b: istore 9
      // 20d: aload 0
      // 20e: aload 0
      // 20f: getfield com/finalshell/core/U9.d I
      // 212: bipush 1
      // 213: iadd
      // 214: iload 9
      // 216: invokevirtual com/finalshell/core/U9.s (II)[C
      // 219: astore 10
      // 21b: aload 10
      // 21d: iload 9
      // 21f: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 222: astore 8
      // 224: iload 3
      // 225: iload 7
      // 227: iload 6
      // 229: isub
      // 22a: bipush 1
      // 22b: iadd
      // 22c: iadd
      // 22d: istore 3
      // 22e: aload 0
      // 22f: aload 0
      // 230: getfield com/finalshell/core/U9.d I
      // 233: iload 3
      // 234: iinc 3 1
      // 237: iadd
      // 238: invokevirtual com/finalshell/core/U9.C (I)C
      // 23b: istore 4
      // 23d: aload 8
      // 23f: astore 5
      // 241: iload 2
      // 242: ifeq 283
      // 245: iload 4
      // 247: invokestatic com/finalshell/core/U9.Y (C)Z
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: iload 2
      // 252: ifne 273
      // 255: ifeq 279
      // 258: goto 25f
      // 25b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: aload 0
      // 260: aload 0
      // 261: getfield com/finalshell/core/U9.d I
      // 264: iload 3
      // 265: iinc 3 1
      // 268: iadd
      // 269: invokevirtual com/finalshell/core/U9.C (I)C
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: istore 4
      // 275: iload 2
      // 276: ifeq 109
      // 279: aload 0
      // 27a: bipush -1
      // 27b: putfield com/finalshell/core/U9.z I
      // 27e: aload 0
      // 27f: invokevirtual com/finalshell/core/U9.r ()Ljava/lang/String;
      // 282: areturn
      // 283: iload 4
      // 285: iload 1
      // 286: if_icmpne 2c4
      // 289: aload 0
      // 28a: dup
      // 28b: getfield com/finalshell/core/U9.d I
      // 28e: iload 3
      // 28f: iadd
      // 290: putfield com/finalshell/core/U9.d I
      // 293: aload 0
      // 294: aload 0
      // 295: aload 0
      // 296: getfield com/finalshell/core/U9.d I
      // 299: invokevirtual com/finalshell/core/U9.C (I)C
      // 29c: putfield com/finalshell/core/U9.l C
      // 29f: aload 0
      // 2a0: sipush 5887
      // 2a3: ldc2_w 3467391210321595353
      // 2a6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a9: putfield com/finalshell/core/U9.z I
      // 2ac: aload 0
      // 2ad: sipush 9361
      // 2b0: ldc2_w 2488456831667599749
      // 2b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b6: putfield com/finalshell/core/U9.Y I
      // 2b9: aload 5
      // 2bb: iload 2
      // 2bc: ifne 31c
      // 2bf: areturn
      // 2c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c3: athrow
      // 2c4: iload 4
      // 2c6: invokestatic com/finalshell/core/U9.Y (C)Z
      // 2c9: iload 2
      // 2ca: ifne 2ec
      // 2cd: ifeq 2ea
      // 2d0: goto 2d7
      // 2d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: aload 0
      // 2d8: aload 0
      // 2d9: getfield com/finalshell/core/U9.d I
      // 2dc: iload 3
      // 2dd: iinc 3 1
      // 2e0: iadd
      // 2e1: invokevirtual com/finalshell/core/U9.C (I)C
      // 2e4: istore 4
      // 2e6: iload 2
      // 2e7: ifeq 283
      // 2ea: iload 4
      // 2ec: sipush 30337
      // 2ef: ldc2_w 2029800848590515112
      // 2f2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f5: if_icmpne 31a
      // 2f8: aload 0
      // 2f9: dup
      // 2fa: getfield com/finalshell/core/U9.d I
      // 2fd: iload 3
      // 2fe: iadd
      // 2ff: putfield com/finalshell/core/U9.d I
      // 302: aload 0
      // 303: aload 0
      // 304: aload 0
      // 305: getfield com/finalshell/core/U9.d I
      // 308: invokevirtual com/finalshell/core/U9.C (I)C
      // 30b: putfield com/finalshell/core/U9.l C
      // 30e: aload 0
      // 30f: bipush -1
      // 310: putfield com/finalshell/core/U9.z I
      // 313: goto 31a
      // 316: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 319: athrow
      // 31a: aload 5
      // 31c: areturn
   }

   public long W$long(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifeq 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: lconst_0
      // 02a: lreturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 2
      // 042: ifeq 066
      // 045: iload 4
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpeq 068
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: bipush -1
      // 05c: putfield com/finalshell/core/U9.z I
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: lconst_0
      // 067: lreturn
      // 068: sipush 23971
      // 06b: ldc2_w 2384962921652582131
      // 06e: invokestatic com/finalshell/core/U9.c (IJ)J
      // 071: lstore 5
      // 073: aload 0
      // 074: aload 0
      // 075: getfield com/finalshell/core/U9.d I
      // 078: iload 3
      // 079: iinc 3 1
      // 07c: iadd
      // 07d: invokevirtual com/finalshell/core/U9.C (I)C
      // 080: istore 4
      // 082: iload 4
      // 084: sipush 26107
      // 087: ldc2_w 2081374444732725480
      // 08a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 08d: if_icmpne 0a3
      // 090: aload 0
      // 091: aload 0
      // 092: getfield com/finalshell/core/U9.d I
      // 095: iload 3
      // 096: iinc 3 1
      // 099: iadd
      // 09a: invokevirtual com/finalshell/core/U9.C (I)C
      // 09d: istore 4
      // 09f: iload 2
      // 0a0: ifne 0d6
      // 0a3: lload 5
      // 0a5: iload 4
      // 0a7: i2l
      // 0a8: lxor
      // 0a9: lstore 5
      // 0ab: lload 5
      // 0ad: sipush 11451
      // 0b0: ldc2_w 6505083625250457571
      // 0b3: invokestatic com/finalshell/core/U9.c (IJ)J
      // 0b6: lmul
      // 0b7: lstore 5
      // 0b9: iload 4
      // 0bb: sipush 30531
      // 0be: ldc2_w 4175784576570993226
      // 0c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c4: if_icmpne 073
      // 0c7: aload 0
      // 0c8: bipush -1
      // 0c9: putfield com/finalshell/core/U9.z I
      // 0cc: lconst_0
      // 0cd: iload 2
      // 0ce: ifeq 293
      // 0d1: lreturn
      // 0d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: iload 4
      // 0d8: sipush 26927
      // 0db: ldc2_w 6101958691031889140
      // 0de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e1: iload 2
      // 0e2: ifeq 124
      // 0e5: if_icmpne 119
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: dup
      // 0f1: getfield com/finalshell/core/U9.d I
      // 0f4: iload 3
      // 0f5: iadd
      // 0f6: putfield com/finalshell/core/U9.d I
      // 0f9: aload 0
      // 0fa: aload 0
      // 0fb: aload 0
      // 0fc: getfield com/finalshell/core/U9.d I
      // 0ff: invokevirtual com/finalshell/core/U9.C (I)C
      // 102: putfield com/finalshell/core/U9.l C
      // 105: aload 0
      // 106: sipush 5887
      // 109: ldc2_w 3467391210321595353
      // 10c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10f: putfield com/finalshell/core/U9.z I
      // 112: lload 5
      // 114: lreturn
      // 115: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: iload 4
      // 11b: sipush 4784
      // 11e: ldc2_w 3082167687830622095
      // 121: invokestatic com/finalshell/core/U9.a (IJ)I
      // 124: iload 2
      // 125: ifeq 14c
      // 128: if_icmpne 286
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aload 0
      // 133: aload 0
      // 134: getfield com/finalshell/core/U9.d I
      // 137: iload 3
      // 138: iinc 3 1
      // 13b: iadd
      // 13c: invokevirtual com/finalshell/core/U9.C (I)C
      // 13f: istore 4
      // 141: iload 4
      // 143: sipush 26927
      // 146: ldc2_w 6101958691031889140
      // 149: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14c: iload 2
      // 14d: ifeq 19a
      // 150: if_icmpne 188
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 0
      // 15b: sipush 9361
      // 15e: ldc2_w 2488456831667599749
      // 161: invokestatic com/finalshell/core/U9.a (IJ)I
      // 164: putfield com/finalshell/core/U9.Y I
      // 167: aload 0
      // 168: dup
      // 169: getfield com/finalshell/core/U9.d I
      // 16c: iload 3
      // 16d: iadd
      // 16e: putfield com/finalshell/core/U9.d I
      // 171: aload 0
      // 172: aload 0
      // 173: aload 0
      // 174: getfield com/finalshell/core/U9.d I
      // 177: invokevirtual com/finalshell/core/U9.C (I)C
      // 17a: putfield com/finalshell/core/U9.l C
      // 17d: iload 2
      // 17e: ifne 275
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: iload 4
      // 18a: sipush 30337
      // 18d: ldc2_w 2029800848590515112
      // 190: invokestatic com/finalshell/core/U9.a (IJ)I
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: iload 2
      // 19b: ifeq 1e8
      // 19e: if_icmpne 1d6
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: sipush 9145
      // 1ac: ldc2_w 6577731744871808687
      // 1af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b2: putfield com/finalshell/core/U9.Y I
      // 1b5: aload 0
      // 1b6: dup
      // 1b7: getfield com/finalshell/core/U9.d I
      // 1ba: iload 3
      // 1bb: iadd
      // 1bc: putfield com/finalshell/core/U9.d I
      // 1bf: aload 0
      // 1c0: aload 0
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/U9.d I
      // 1c5: invokevirtual com/finalshell/core/U9.C (I)C
      // 1c8: putfield com/finalshell/core/U9.l C
      // 1cb: iload 2
      // 1cc: ifne 275
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: iload 4
      // 1d8: sipush 4784
      // 1db: ldc2_w 3082167687830622095
      // 1de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: iload 2
      // 1e9: ifeq 236
      // 1ec: if_icmpne 224
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: sipush 16923
      // 1fa: ldc2_w 1571494982232874791
      // 1fd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 200: putfield com/finalshell/core/U9.Y I
      // 203: aload 0
      // 204: dup
      // 205: getfield com/finalshell/core/U9.d I
      // 208: iload 3
      // 209: iadd
      // 20a: putfield com/finalshell/core/U9.d I
      // 20d: aload 0
      // 20e: aload 0
      // 20f: aload 0
      // 210: getfield com/finalshell/core/U9.d I
      // 213: invokevirtual com/finalshell/core/U9.C (I)C
      // 216: putfield com/finalshell/core/U9.l C
      // 219: iload 2
      // 21a: ifne 275
      // 21d: goto 224
      // 220: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 223: athrow
      // 224: iload 4
      // 226: sipush 2765
      // 229: ldc2_w 8216137057917720563
      // 22c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: if_icmpne 26a
      // 239: aload 0
      // 23a: sipush 9907
      // 23d: ldc2_w 514190805586246625
      // 240: invokestatic com/finalshell/core/U9.a (IJ)I
      // 243: putfield com/finalshell/core/U9.Y I
      // 246: aload 0
      // 247: dup
      // 248: getfield com/finalshell/core/U9.d I
      // 24b: iload 3
      // 24c: bipush 1
      // 24d: isub
      // 24e: iadd
      // 24f: putfield com/finalshell/core/U9.d I
      // 252: aload 0
      // 253: sipush 2765
      // 256: ldc2_w 8216137057917720563
      // 259: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25c: putfield com/finalshell/core/U9.l C
      // 25f: iload 2
      // 260: ifne 275
      // 263: goto 26a
      // 266: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 0
      // 26b: bipush -1
      // 26c: putfield com/finalshell/core/U9.z I
      // 26f: lconst_0
      // 270: lreturn
      // 271: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 274: athrow
      // 275: aload 0
      // 276: sipush 2897
      // 279: ldc2_w 695568451002816123
      // 27c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27f: putfield com/finalshell/core/U9.z I
      // 282: iload 2
      // 283: ifne 294
      // 286: aload 0
      // 287: bipush -1
      // 288: putfield com/finalshell/core/U9.z I
      // 28b: lconst_0
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: lreturn
      // 294: lload 5
      // 296: lreturn
   }

   public long u(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifeq 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: lconst_0
      // 02a: lreturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 2
      // 042: ifeq 066
      // 045: iload 4
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpeq 068
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: bipush -1
      // 05c: putfield com/finalshell/core/U9.z I
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: lconst_0
      // 067: lreturn
      // 068: sipush 5334
      // 06b: ldc2_w 2310459111681671047
      // 06e: invokestatic com/finalshell/core/U9.c (IJ)J
      // 071: lstore 5
      // 073: aload 0
      // 074: aload 0
      // 075: getfield com/finalshell/core/U9.d I
      // 078: iload 3
      // 079: iinc 3 1
      // 07c: iadd
      // 07d: invokevirtual com/finalshell/core/U9.C (I)C
      // 080: istore 4
      // 082: iload 4
      // 084: sipush 26107
      // 087: ldc2_w 2081374444732725480
      // 08a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 08d: if_icmpne 0a3
      // 090: aload 0
      // 091: aload 0
      // 092: getfield com/finalshell/core/U9.d I
      // 095: iload 3
      // 096: iinc 3 1
      // 099: iadd
      // 09a: invokevirtual com/finalshell/core/U9.C (I)C
      // 09d: istore 4
      // 09f: iload 2
      // 0a0: ifne 12c
      // 0a3: lload 5
      // 0a5: iload 4
      // 0a7: sipush 31506
      // 0aa: ldc2_w 427738362136340011
      // 0ad: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b0: iload 2
      // 0b1: ifeq 0d7
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: if_icmplt 0fb
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: iload 4
      // 0c7: sipush 14109
      // 0ca: ldc2_w 5333362742203640357
      // 0cd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: iload 2
      // 0d8: ifeq 0f7
      // 0db: if_icmpgt 0fb
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: iload 4
      // 0e7: sipush 18572
      // 0ea: ldc2_w 5664846119839831378
      // 0ed: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: iadd
      // 0f8: goto 0fd
      // 0fb: iload 4
      // 0fd: i2l
      // 0fe: lxor
      // 0ff: lstore 5
      // 101: lload 5
      // 103: sipush 8957
      // 106: ldc2_w 1185165701950441890
      // 109: invokestatic com/finalshell/core/U9.c (IJ)J
      // 10c: lmul
      // 10d: lstore 5
      // 10f: iload 4
      // 111: sipush 30531
      // 114: ldc2_w 4175784576570993226
      // 117: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11a: if_icmpne 073
      // 11d: aload 0
      // 11e: bipush -1
      // 11f: putfield com/finalshell/core/U9.z I
      // 122: lconst_0
      // 123: iload 2
      // 124: ifeq 2e9
      // 127: lreturn
      // 128: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: iload 4
      // 12e: sipush 26927
      // 131: ldc2_w 6101958691031889140
      // 134: invokestatic com/finalshell/core/U9.a (IJ)I
      // 137: iload 2
      // 138: ifeq 17a
      // 13b: if_icmpne 16f
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 0
      // 146: dup
      // 147: getfield com/finalshell/core/U9.d I
      // 14a: iload 3
      // 14b: iadd
      // 14c: putfield com/finalshell/core/U9.d I
      // 14f: aload 0
      // 150: aload 0
      // 151: aload 0
      // 152: getfield com/finalshell/core/U9.d I
      // 155: invokevirtual com/finalshell/core/U9.C (I)C
      // 158: putfield com/finalshell/core/U9.l C
      // 15b: aload 0
      // 15c: sipush 5887
      // 15f: ldc2_w 3467391210321595353
      // 162: invokestatic com/finalshell/core/U9.a (IJ)I
      // 165: putfield com/finalshell/core/U9.z I
      // 168: lload 5
      // 16a: lreturn
      // 16b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: iload 4
      // 171: sipush 4784
      // 174: ldc2_w 3082167687830622095
      // 177: invokestatic com/finalshell/core/U9.a (IJ)I
      // 17a: iload 2
      // 17b: ifeq 1a2
      // 17e: if_icmpne 2dc
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: aload 0
      // 189: aload 0
      // 18a: getfield com/finalshell/core/U9.d I
      // 18d: iload 3
      // 18e: iinc 3 1
      // 191: iadd
      // 192: invokevirtual com/finalshell/core/U9.C (I)C
      // 195: istore 4
      // 197: iload 4
      // 199: sipush 26927
      // 19c: ldc2_w 6101958691031889140
      // 19f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a2: iload 2
      // 1a3: ifeq 1f0
      // 1a6: if_icmpne 1de
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: sipush 9361
      // 1b4: ldc2_w 2488456831667599749
      // 1b7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ba: putfield com/finalshell/core/U9.Y I
      // 1bd: aload 0
      // 1be: dup
      // 1bf: getfield com/finalshell/core/U9.d I
      // 1c2: iload 3
      // 1c3: iadd
      // 1c4: putfield com/finalshell/core/U9.d I
      // 1c7: aload 0
      // 1c8: aload 0
      // 1c9: aload 0
      // 1ca: getfield com/finalshell/core/U9.d I
      // 1cd: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d0: putfield com/finalshell/core/U9.l C
      // 1d3: iload 2
      // 1d4: ifne 2cb
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: iload 4
      // 1e0: sipush 30337
      // 1e3: ldc2_w 2029800848590515112
      // 1e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: iload 2
      // 1f1: ifeq 23e
      // 1f4: if_icmpne 22c
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: sipush 9145
      // 202: ldc2_w 6577731744871808687
      // 205: invokestatic com/finalshell/core/U9.a (IJ)I
      // 208: putfield com/finalshell/core/U9.Y I
      // 20b: aload 0
      // 20c: dup
      // 20d: getfield com/finalshell/core/U9.d I
      // 210: iload 3
      // 211: iadd
      // 212: putfield com/finalshell/core/U9.d I
      // 215: aload 0
      // 216: aload 0
      // 217: aload 0
      // 218: getfield com/finalshell/core/U9.d I
      // 21b: invokevirtual com/finalshell/core/U9.C (I)C
      // 21e: putfield com/finalshell/core/U9.l C
      // 221: iload 2
      // 222: ifne 2cb
      // 225: goto 22c
      // 228: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: iload 4
      // 22e: sipush 4784
      // 231: ldc2_w 3082167687830622095
      // 234: invokestatic com/finalshell/core/U9.a (IJ)I
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: iload 2
      // 23f: ifeq 28c
      // 242: if_icmpne 27a
      // 245: goto 24c
      // 248: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24b: athrow
      // 24c: aload 0
      // 24d: sipush 16923
      // 250: ldc2_w 1571494982232874791
      // 253: invokestatic com/finalshell/core/U9.a (IJ)I
      // 256: putfield com/finalshell/core/U9.Y I
      // 259: aload 0
      // 25a: dup
      // 25b: getfield com/finalshell/core/U9.d I
      // 25e: iload 3
      // 25f: iadd
      // 260: putfield com/finalshell/core/U9.d I
      // 263: aload 0
      // 264: aload 0
      // 265: aload 0
      // 266: getfield com/finalshell/core/U9.d I
      // 269: invokevirtual com/finalshell/core/U9.C (I)C
      // 26c: putfield com/finalshell/core/U9.l C
      // 26f: iload 2
      // 270: ifne 2cb
      // 273: goto 27a
      // 276: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: iload 4
      // 27c: sipush 2765
      // 27f: ldc2_w 8216137057917720563
      // 282: invokestatic com/finalshell/core/U9.a (IJ)I
      // 285: goto 28c
      // 288: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28b: athrow
      // 28c: if_icmpne 2c0
      // 28f: aload 0
      // 290: sipush 9907
      // 293: ldc2_w 514190805586246625
      // 296: invokestatic com/finalshell/core/U9.a (IJ)I
      // 299: putfield com/finalshell/core/U9.Y I
      // 29c: aload 0
      // 29d: dup
      // 29e: getfield com/finalshell/core/U9.d I
      // 2a1: iload 3
      // 2a2: bipush 1
      // 2a3: isub
      // 2a4: iadd
      // 2a5: putfield com/finalshell/core/U9.d I
      // 2a8: aload 0
      // 2a9: sipush 2765
      // 2ac: ldc2_w 8216137057917720563
      // 2af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b2: putfield com/finalshell/core/U9.l C
      // 2b5: iload 2
      // 2b6: ifne 2cb
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: bipush -1
      // 2c2: putfield com/finalshell/core/U9.z I
      // 2c5: lconst_0
      // 2c6: lreturn
      // 2c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: sipush 2897
      // 2cf: ldc2_w 695568451002816123
      // 2d2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d5: putfield com/finalshell/core/U9.z I
      // 2d8: iload 2
      // 2d9: ifne 2ea
      // 2dc: aload 0
      // 2dd: bipush -1
      // 2de: putfield com/finalshell/core/U9.z I
      // 2e1: lconst_0
      // 2e2: goto 2e9
      // 2e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: lreturn
      // 2ea: lload 5
      // 2ec: lreturn
   }

   @Override
   public Enum E(java.lang.Class var1, O12 var2, char var3) {
      String var4 = this.k(var2, var3);

      try {
         if (var4 == null) {
            return null;
         }
      } catch (Hi2 var5) {
         throw a(var5);
      }

      return Enum.valueOf(var1, var4);
   }

   @Override
   public String k(O12 param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 3
      // 009: bipush 0
      // 00a: istore 4
      // 00c: aload 0
      // 00d: aload 0
      // 00e: getfield com/finalshell/core/U9.d I
      // 011: iload 4
      // 013: iinc 4 1
      // 016: iadd
      // 017: invokevirtual com/finalshell/core/U9.C (I)C
      // 01a: istore 5
      // 01c: iload 5
      // 01e: sipush 7800
      // 021: ldc2_w 5201320676148134657
      // 024: invokestatic com/finalshell/core/U9.a (IJ)I
      // 027: iload 3
      // 028: ifeq 126
      // 02b: if_icmpne 110
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: aload 0
      // 036: aload 0
      // 037: getfield com/finalshell/core/U9.d I
      // 03a: iload 4
      // 03c: iadd
      // 03d: iload 3
      // 03e: ifeq 0d4
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: invokevirtual com/finalshell/core/U9.C (I)C
      // 04b: sipush 25252
      // 04e: ldc2_w 2256381802227974060
      // 051: invokestatic com/finalshell/core/U9.a (IJ)I
      // 054: if_icmpne 0cb
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield com/finalshell/core/U9.d I
      // 063: iload 4
      // 065: iadd
      // 066: bipush 1
      // 067: iadd
      // 068: iload 3
      // 069: ifeq 0d4
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: invokevirtual com/finalshell/core/U9.C (I)C
      // 076: sipush 7325
      // 079: ldc2_w 7975301603790307833
      // 07c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07f: if_icmpne 0cb
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 0
      // 08a: aload 0
      // 08b: getfield com/finalshell/core/U9.d I
      // 08e: iload 4
      // 090: iadd
      // 091: bipush 2
      // 092: iadd
      // 093: iload 3
      // 094: ifeq 0d4
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a1: sipush 7325
      // 0a4: ldc2_w 7975301603790307833
      // 0a7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0aa: if_icmpne 0cb
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: iinc 4 3
      // 0b7: aload 0
      // 0b8: aload 0
      // 0b9: getfield com/finalshell/core/U9.d I
      // 0bc: iload 4
      // 0be: iinc 4 1
      // 0c1: iadd
      // 0c2: invokevirtual com/finalshell/core/U9.C (I)C
      // 0c5: istore 5
      // 0c7: iload 3
      // 0c8: ifne 0d9
      // 0cb: aload 0
      // 0cc: bipush -1
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: putfield com/finalshell/core/U9.z I
      // 0d7: aconst_null
      // 0d8: areturn
      // 0d9: iload 5
      // 0db: iload 2
      // 0dc: if_icmpne 109
      // 0df: aload 0
      // 0e0: dup
      // 0e1: getfield com/finalshell/core/U9.d I
      // 0e4: iload 4
      // 0e6: iadd
      // 0e7: putfield com/finalshell/core/U9.d I
      // 0ea: aload 0
      // 0eb: aload 0
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/core/U9.d I
      // 0f0: invokevirtual com/finalshell/core/U9.C (I)C
      // 0f3: putfield com/finalshell/core/U9.l C
      // 0f6: aload 0
      // 0f7: sipush 5887
      // 0fa: ldc2_w 3467391210321595353
      // 0fd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 100: putfield com/finalshell/core/U9.z I
      // 103: aconst_null
      // 104: areturn
      // 105: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 0
      // 10a: bipush -1
      // 10b: putfield com/finalshell/core/U9.z I
      // 10e: aconst_null
      // 10f: areturn
      // 110: iload 5
      // 112: iload 3
      // 113: ifeq 135
      // 116: sipush 26107
      // 119: ldc2_w 2081374444732725480
      // 11c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: if_icmpeq 134
      // 129: aload 0
      // 12a: bipush -1
      // 12b: putfield com/finalshell/core/U9.z I
      // 12e: aconst_null
      // 12f: areturn
      // 130: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: bipush 0
      // 135: istore 7
      // 137: aload 0
      // 138: aload 0
      // 139: getfield com/finalshell/core/U9.d I
      // 13c: iload 4
      // 13e: iinc 4 1
      // 141: iadd
      // 142: invokevirtual com/finalshell/core/U9.C (I)C
      // 145: istore 5
      // 147: iload 5
      // 149: sipush 26107
      // 14c: ldc2_w 2081374444732725480
      // 14f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 152: if_icmpne 18e
      // 155: aload 0
      // 156: getfield com/finalshell/core/U9.d I
      // 159: bipush 0
      // 15a: iadd
      // 15b: bipush 1
      // 15c: iadd
      // 15d: istore 8
      // 15f: aload 0
      // 160: getfield com/finalshell/core/U9.d I
      // 163: iload 4
      // 165: iadd
      // 166: iload 8
      // 168: isub
      // 169: bipush 1
      // 16a: isub
      // 16b: istore 9
      // 16d: aload 0
      // 16e: iload 8
      // 170: iload 9
      // 172: iload 7
      // 174: aload 1
      // 175: invokevirtual com/finalshell/core/U9.e (IIILcom/finalshell/core/O12;)Ljava/lang/String;
      // 178: astore 6
      // 17a: aload 0
      // 17b: aload 0
      // 17c: getfield com/finalshell/core/U9.d I
      // 17f: iload 4
      // 181: iinc 4 1
      // 184: iadd
      // 185: invokevirtual com/finalshell/core/U9.C (I)C
      // 188: istore 5
      // 18a: iload 3
      // 18b: ifne 1b8
      // 18e: sipush 15860
      // 191: ldc2_w 1051985027903185082
      // 194: invokestatic com/finalshell/core/U9.a (IJ)I
      // 197: iload 7
      // 199: imul
      // 19a: iload 5
      // 19c: iadd
      // 19d: istore 7
      // 19f: iload 5
      // 1a1: sipush 30531
      // 1a4: ldc2_w 4175784576570993226
      // 1a7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1aa: if_icmpne 137
      // 1ad: aload 0
      // 1ae: iload 3
      // 1af: ifeq 156
      // 1b2: bipush -1
      // 1b3: putfield com/finalshell/core/U9.z I
      // 1b6: aconst_null
      // 1b7: areturn
      // 1b8: iload 5
      // 1ba: iload 2
      // 1bb: if_icmpne 1ed
      // 1be: aload 0
      // 1bf: dup
      // 1c0: getfield com/finalshell/core/U9.d I
      // 1c3: iload 4
      // 1c5: iadd
      // 1c6: putfield com/finalshell/core/U9.d I
      // 1c9: aload 0
      // 1ca: aload 0
      // 1cb: aload 0
      // 1cc: getfield com/finalshell/core/U9.d I
      // 1cf: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d2: putfield com/finalshell/core/U9.l C
      // 1d5: aload 0
      // 1d6: sipush 5887
      // 1d9: ldc2_w 3467391210321595353
      // 1dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1df: putfield com/finalshell/core/U9.z I
      // 1e2: aload 6
      // 1e4: iload 3
      // 1e5: ifeq 222
      // 1e8: areturn
      // 1e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: iload 5
      // 1ef: invokestatic com/finalshell/core/U9.Y (C)Z
      // 1f2: iload 3
      // 1f3: ifeq 215
      // 1f6: ifeq 21b
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: aload 0
      // 201: aload 0
      // 202: getfield com/finalshell/core/U9.d I
      // 205: iload 4
      // 207: iinc 4 1
      // 20a: iadd
      // 20b: invokevirtual com/finalshell/core/U9.C (I)C
      // 20e: goto 215
      // 211: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: istore 5
      // 217: iload 3
      // 218: ifne 1b8
      // 21b: aload 0
      // 21c: bipush -1
      // 21d: putfield com/finalshell/core/U9.z I
      // 220: aload 6
      // 222: areturn
   }

   public Collection L(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: ldc_w java/util/HashSet
      // 08: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0b: iload 2
      // 0c: ifne 2c
      // 0f: ifeq 25
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: new java/util/HashSet
      // 1c: dup
      // 1d: invokespecial java/util/HashSet.<init> ()V
      // 20: areturn
      // 21: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: ldc_w java/util/ArrayList
      // 29: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 2c: iload 2
      // 2d: ifne 58
      // 30: ifeq 46
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: new java/util/ArrayList
      // 3d: dup
      // 3e: invokespecial java/util/ArrayList.<init> ()V
      // 41: areturn
      // 42: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 1
      // 47: iload 2
      // 48: ifne 6b
      // 4b: ldc_w java/util/LinkedList
      // 4e: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: ifeq 67
      // 5b: new java/util/LinkedList
      // 5e: dup
      // 5f: invokespecial java/util/LinkedList.<init> ()V
      // 62: areturn
      // 63: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 1
      // 68: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 6b: checkcast java/util/Collection
      // 6e: areturn
      // 6f: astore 3
      // 70: new com/finalshell/core/Hi2
      // 73: dup
      // 74: aload 3
      // 75: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 78: aload 3
      // 79: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 7c: athrow
   }

   public Collection C(char[] param1, java.lang.Class param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 3
      // 009: aload 0
      // 00a: iload 3
      // 00b: ifeq 030
      // 00e: aload 1
      // 00f: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: aload 2
      // 031: invokevirtual com/finalshell/core/U9.L (Ljava/lang/Class;)Ljava/util/Collection;
      // 034: astore 4
      // 036: aload 1
      // 037: arraylength
      // 038: istore 5
      // 03a: aload 0
      // 03b: aload 0
      // 03c: getfield com/finalshell/core/U9.d I
      // 03f: iload 5
      // 041: iinc 5 1
      // 044: iadd
      // 045: invokevirtual com/finalshell/core/U9.C (I)C
      // 048: istore 6
      // 04a: iload 6
      // 04c: iload 3
      // 04d: ifeq 07c
      // 050: sipush 31790
      // 053: ldc2_w 4972276358763192576
      // 056: invokestatic com/finalshell/core/U9.a (IJ)I
      // 059: if_icmpeq 06e
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 0
      // 064: bipush -1
      // 065: putfield com/finalshell/core/U9.z I
      // 068: aconst_null
      // 069: areturn
      // 06a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 0
      // 070: getfield com/finalshell/core/U9.d I
      // 073: iload 5
      // 075: iinc 5 1
      // 078: iadd
      // 079: invokevirtual com/finalshell/core/U9.C (I)C
      // 07c: istore 6
      // 07e: iload 6
      // 080: sipush 26107
      // 083: ldc2_w 2081374444732725480
      // 086: invokestatic com/finalshell/core/U9.a (IJ)I
      // 089: if_icmpne 1df
      // 08c: aload 0
      // 08d: getfield com/finalshell/core/U9.d I
      // 090: iload 5
      // 092: iadd
      // 093: istore 7
      // 095: aload 0
      // 096: sipush 26107
      // 099: ldc2_w 2081374444732725480
      // 09c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09f: iload 7
      // 0a1: invokevirtual com/finalshell/core/U9.d (CI)I
      // 0a4: istore 8
      // 0a6: iload 8
      // 0a8: bipush -1
      // 0a9: iload 3
      // 0aa: ifeq 1f1
      // 0ad: iload 3
      // 0ae: ifeq 0dd
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: if_icmpne 0d7
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: new com/finalshell/core/Hi2
      // 0c5: dup
      // 0c6: sipush 10510
      // 0c9: sipush -21017
      // 0cc: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0cf: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0d2: athrow
      // 0d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/core/U9.d I
      // 0db: iload 5
      // 0dd: iadd
      // 0de: istore 9
      // 0e0: aload 0
      // 0e1: iload 9
      // 0e3: iload 8
      // 0e5: iload 9
      // 0e7: isub
      // 0e8: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 0eb: astore 10
      // 0ed: aload 10
      // 0ef: sipush 30531
      // 0f2: ldc2_w 4175784576570993226
      // 0f5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f8: invokevirtual java/lang/String.indexOf (I)I
      // 0fb: bipush -1
      // 0fc: iload 3
      // 0fd: ifeq 1be
      // 100: if_icmpeq 1b0
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: bipush 0
      // 10b: istore 11
      // 10d: iload 8
      // 10f: bipush 1
      // 110: isub
      // 111: istore 12
      // 113: iload 12
      // 115: iflt 151
      // 118: aload 0
      // 119: iload 12
      // 11b: invokevirtual com/finalshell/core/U9.C (I)C
      // 11e: sipush 30531
      // 121: ldc2_w 4175784576570993226
      // 124: invokestatic com/finalshell/core/U9.a (IJ)I
      // 127: iload 3
      // 128: ifeq 154
      // 12b: iload 3
      // 12c: ifeq 154
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: if_icmpne 151
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: iinc 11 1
      // 143: iinc 12 -1
      // 146: iload 3
      // 147: ifne 113
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: iload 11
      // 153: bipush 2
      // 154: irem
      // 155: iload 3
      // 156: ifeq 186
      // 159: ifne 16e
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: iload 3
      // 164: ifne 18c
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 0
      // 16f: sipush 26107
      // 172: ldc2_w 2081374444732725480
      // 175: invokestatic com/finalshell/core/U9.a (IJ)I
      // 178: iload 8
      // 17a: bipush 1
      // 17b: iadd
      // 17c: invokevirtual com/finalshell/core/U9.d (CI)I
      // 17f: goto 186
      // 182: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: istore 8
      // 188: iload 3
      // 189: ifne 10a
      // 18c: iload 8
      // 18e: aload 0
      // 18f: getfield com/finalshell/core/U9.d I
      // 192: iload 5
      // 194: iadd
      // 195: isub
      // 196: istore 11
      // 198: aload 0
      // 199: aload 0
      // 19a: getfield com/finalshell/core/U9.d I
      // 19d: iload 5
      // 19f: iadd
      // 1a0: iload 11
      // 1a2: invokevirtual com/finalshell/core/U9.s (II)[C
      // 1a5: astore 12
      // 1a7: aload 12
      // 1a9: iload 11
      // 1ab: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 1ae: astore 10
      // 1b0: iload 5
      // 1b2: iload 8
      // 1b4: aload 0
      // 1b5: getfield com/finalshell/core/U9.d I
      // 1b8: iload 5
      // 1ba: iadd
      // 1bb: isub
      // 1bc: bipush 1
      // 1bd: iadd
      // 1be: iadd
      // 1bf: istore 5
      // 1c1: aload 0
      // 1c2: aload 0
      // 1c3: getfield com/finalshell/core/U9.d I
      // 1c6: iload 5
      // 1c8: iinc 5 1
      // 1cb: iadd
      // 1cc: invokevirtual com/finalshell/core/U9.C (I)C
      // 1cf: istore 6
      // 1d1: aload 4
      // 1d3: aload 10
      // 1d5: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 1da: pop
      // 1db: iload 3
      // 1dc: ifne 30a
      // 1df: iload 6
      // 1e1: sipush 7800
      // 1e4: ldc2_w 5201320676148134657
      // 1e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f0: athrow
      // 1f1: iload 3
      // 1f2: ifeq 2bb
      // 1f5: if_icmpne 29e
      // 1f8: goto 1ff
      // 1fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: aload 0
      // 200: aload 0
      // 201: getfield com/finalshell/core/U9.d I
      // 204: iload 5
      // 206: iadd
      // 207: invokevirtual com/finalshell/core/U9.C (I)C
      // 20a: sipush 25252
      // 20d: ldc2_w 2256381802227974060
      // 210: invokestatic com/finalshell/core/U9.a (IJ)I
      // 213: iload 3
      // 214: ifeq 2bb
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: if_icmpne 29e
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: aload 0
      // 229: aload 0
      // 22a: getfield com/finalshell/core/U9.d I
      // 22d: iload 5
      // 22f: iadd
      // 230: bipush 1
      // 231: iadd
      // 232: invokevirtual com/finalshell/core/U9.C (I)C
      // 235: sipush 7325
      // 238: ldc2_w 7975301603790307833
      // 23b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23e: iload 3
      // 23f: ifeq 2bb
      // 242: goto 249
      // 245: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: if_icmpne 29e
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 0
      // 254: aload 0
      // 255: getfield com/finalshell/core/U9.d I
      // 258: iload 5
      // 25a: iadd
      // 25b: bipush 2
      // 25c: iadd
      // 25d: invokevirtual com/finalshell/core/U9.C (I)C
      // 260: sipush 7325
      // 263: ldc2_w 7975301603790307833
      // 266: invokestatic com/finalshell/core/U9.a (IJ)I
      // 269: iload 3
      // 26a: ifeq 2bb
      // 26d: goto 274
      // 270: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: if_icmpne 29e
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27d: athrow
      // 27e: iinc 5 3
      // 281: aload 0
      // 282: aload 0
      // 283: getfield com/finalshell/core/U9.d I
      // 286: iload 5
      // 288: iinc 5 1
      // 28b: iadd
      // 28c: invokevirtual com/finalshell/core/U9.C (I)C
      // 28f: istore 6
      // 291: aload 4
      // 293: aconst_null
      // 294: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 299: pop
      // 29a: iload 3
      // 29b: ifne 30a
      // 29e: iload 6
      // 2a0: iload 3
      // 2a1: ifeq 2cc
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: sipush 30337
      // 2ae: ldc2_w 2029800848590515112
      // 2b1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: if_icmpne 2f5
      // 2be: aload 4
      // 2c0: invokeinterface java/util/Collection.size ()I 1
      // 2c5: goto 2cc
      // 2c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: iload 3
      // 2cd: ifeq 2ef
      // 2d0: ifne 2f5
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: aload 0
      // 2dc: getfield com/finalshell/core/U9.d I
      // 2df: iload 5
      // 2e1: iinc 5 1
      // 2e4: iadd
      // 2e5: invokevirtual com/finalshell/core/U9.C (I)C
      // 2e8: goto 2ef
      // 2eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ee: athrow
      // 2ef: istore 6
      // 2f1: iload 3
      // 2f2: ifne 376
      // 2f5: new com/finalshell/core/Hi2
      // 2f8: dup
      // 2f9: sipush 10512
      // 2fc: sipush 12483
      // 2ff: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 302: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 305: athrow
      // 306: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 309: athrow
      // 30a: iload 6
      // 30c: sipush 26927
      // 30f: ldc2_w 6101958691031889140
      // 312: invokestatic com/finalshell/core/U9.a (IJ)I
      // 315: iload 3
      // 316: ifeq 34d
      // 319: if_icmpne 337
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: aload 0
      // 324: aload 0
      // 325: getfield com/finalshell/core/U9.d I
      // 328: iload 5
      // 32a: iinc 5 1
      // 32d: iadd
      // 32e: invokevirtual com/finalshell/core/U9.C (I)C
      // 331: istore 6
      // 333: iload 3
      // 334: ifne 07e
      // 337: iload 6
      // 339: iload 3
      // 33a: ifeq 365
      // 33d: sipush 30337
      // 340: ldc2_w 2029800848590515112
      // 343: invokestatic com/finalshell/core/U9.a (IJ)I
      // 346: goto 34d
      // 349: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34c: athrow
      // 34d: if_icmpne 36b
      // 350: aload 0
      // 351: aload 0
      // 352: getfield com/finalshell/core/U9.d I
      // 355: iload 5
      // 357: iinc 5 1
      // 35a: iadd
      // 35b: invokevirtual com/finalshell/core/U9.C (I)C
      // 35e: goto 365
      // 361: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: istore 6
      // 367: iload 3
      // 368: ifne 376
      // 36b: aload 0
      // 36c: bipush -1
      // 36d: putfield com/finalshell/core/U9.z I
      // 370: aconst_null
      // 371: areturn
      // 372: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 375: athrow
      // 376: iload 6
      // 378: sipush 26927
      // 37b: ldc2_w 6101958691031889140
      // 37e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 381: iload 3
      // 382: ifeq 3c5
      // 385: if_icmpne 3ba
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: aload 0
      // 390: dup
      // 391: getfield com/finalshell/core/U9.d I
      // 394: iload 5
      // 396: iadd
      // 397: putfield com/finalshell/core/U9.d I
      // 39a: aload 0
      // 39b: aload 0
      // 39c: aload 0
      // 39d: getfield com/finalshell/core/U9.d I
      // 3a0: invokevirtual com/finalshell/core/U9.C (I)C
      // 3a3: putfield com/finalshell/core/U9.l C
      // 3a6: aload 0
      // 3a7: sipush 5887
      // 3aa: ldc2_w 3467391210321595353
      // 3ad: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3b0: putfield com/finalshell/core/U9.z I
      // 3b3: aload 4
      // 3b5: areturn
      // 3b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b9: athrow
      // 3ba: iload 6
      // 3bc: sipush 4784
      // 3bf: ldc2_w 3082167687830622095
      // 3c2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c5: iload 3
      // 3c6: ifeq 3ee
      // 3c9: if_icmpne 52c
      // 3cc: goto 3d3
      // 3cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d2: athrow
      // 3d3: aload 0
      // 3d4: aload 0
      // 3d5: getfield com/finalshell/core/U9.d I
      // 3d8: iload 5
      // 3da: iinc 5 1
      // 3dd: iadd
      // 3de: invokevirtual com/finalshell/core/U9.C (I)C
      // 3e1: istore 6
      // 3e3: iload 6
      // 3e5: sipush 26927
      // 3e8: ldc2_w 6101958691031889140
      // 3eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ee: iload 3
      // 3ef: ifeq 43d
      // 3f2: if_icmpne 42b
      // 3f5: goto 3fc
      // 3f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fb: athrow
      // 3fc: aload 0
      // 3fd: sipush 9361
      // 400: ldc2_w 2488456831667599749
      // 403: invokestatic com/finalshell/core/U9.a (IJ)I
      // 406: putfield com/finalshell/core/U9.Y I
      // 409: aload 0
      // 40a: dup
      // 40b: getfield com/finalshell/core/U9.d I
      // 40e: iload 5
      // 410: iadd
      // 411: putfield com/finalshell/core/U9.d I
      // 414: aload 0
      // 415: aload 0
      // 416: aload 0
      // 417: getfield com/finalshell/core/U9.d I
      // 41a: invokevirtual com/finalshell/core/U9.C (I)C
      // 41d: putfield com/finalshell/core/U9.l C
      // 420: iload 3
      // 421: ifne 51b
      // 424: goto 42b
      // 427: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42a: athrow
      // 42b: iload 6
      // 42d: sipush 30337
      // 430: ldc2_w 2029800848590515112
      // 433: invokestatic com/finalshell/core/U9.a (IJ)I
      // 436: goto 43d
      // 439: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43c: athrow
      // 43d: iload 3
      // 43e: ifeq 48c
      // 441: if_icmpne 47a
      // 444: goto 44b
      // 447: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44a: athrow
      // 44b: aload 0
      // 44c: sipush 9145
      // 44f: ldc2_w 6577731744871808687
      // 452: invokestatic com/finalshell/core/U9.a (IJ)I
      // 455: putfield com/finalshell/core/U9.Y I
      // 458: aload 0
      // 459: dup
      // 45a: getfield com/finalshell/core/U9.d I
      // 45d: iload 5
      // 45f: iadd
      // 460: putfield com/finalshell/core/U9.d I
      // 463: aload 0
      // 464: aload 0
      // 465: aload 0
      // 466: getfield com/finalshell/core/U9.d I
      // 469: invokevirtual com/finalshell/core/U9.C (I)C
      // 46c: putfield com/finalshell/core/U9.l C
      // 46f: iload 3
      // 470: ifne 51b
      // 473: goto 47a
      // 476: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 479: athrow
      // 47a: iload 6
      // 47c: sipush 4784
      // 47f: ldc2_w 3082167687830622095
      // 482: invokestatic com/finalshell/core/U9.a (IJ)I
      // 485: goto 48c
      // 488: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48b: athrow
      // 48c: iload 3
      // 48d: ifeq 4db
      // 490: if_icmpne 4c9
      // 493: goto 49a
      // 496: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 499: athrow
      // 49a: aload 0
      // 49b: sipush 16923
      // 49e: ldc2_w 1571494982232874791
      // 4a1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4a4: putfield com/finalshell/core/U9.Y I
      // 4a7: aload 0
      // 4a8: dup
      // 4a9: getfield com/finalshell/core/U9.d I
      // 4ac: iload 5
      // 4ae: iadd
      // 4af: putfield com/finalshell/core/U9.d I
      // 4b2: aload 0
      // 4b3: aload 0
      // 4b4: aload 0
      // 4b5: getfield com/finalshell/core/U9.d I
      // 4b8: invokevirtual com/finalshell/core/U9.C (I)C
      // 4bb: putfield com/finalshell/core/U9.l C
      // 4be: iload 3
      // 4bf: ifne 51b
      // 4c2: goto 4c9
      // 4c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c8: athrow
      // 4c9: iload 6
      // 4cb: sipush 2765
      // 4ce: ldc2_w 8216137057917720563
      // 4d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4d4: goto 4db
      // 4d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4da: athrow
      // 4db: if_icmpne 510
      // 4de: aload 0
      // 4df: dup
      // 4e0: getfield com/finalshell/core/U9.d I
      // 4e3: iload 5
      // 4e5: bipush 1
      // 4e6: isub
      // 4e7: iadd
      // 4e8: putfield com/finalshell/core/U9.d I
      // 4eb: aload 0
      // 4ec: sipush 9907
      // 4ef: ldc2_w 514190805586246625
      // 4f2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f5: putfield com/finalshell/core/U9.Y I
      // 4f8: aload 0
      // 4f9: sipush 2765
      // 4fc: ldc2_w 8216137057917720563
      // 4ff: invokestatic com/finalshell/core/U9.a (IJ)I
      // 502: putfield com/finalshell/core/U9.l C
      // 505: iload 3
      // 506: ifne 51b
      // 509: goto 510
      // 50c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50f: athrow
      // 510: aload 0
      // 511: bipush -1
      // 512: putfield com/finalshell/core/U9.z I
      // 515: aconst_null
      // 516: areturn
      // 517: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51a: athrow
      // 51b: aload 0
      // 51c: sipush 2897
      // 51f: ldc2_w 695568451002816123
      // 522: invokestatic com/finalshell/core/U9.a (IJ)I
      // 525: putfield com/finalshell/core/U9.z I
      // 528: iload 3
      // 529: ifne 537
      // 52c: aload 0
      // 52d: bipush -1
      // 52e: putfield com/finalshell/core/U9.z I
      // 531: aconst_null
      // 532: areturn
      // 533: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 536: athrow
      // 537: aload 4
      // 539: areturn
   }

   @Override
   public void b(Collection param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: bipush 0
      // 009: istore 4
      // 00b: istore 3
      // 00c: aload 0
      // 00d: aload 0
      // 00e: getfield com/finalshell/core/U9.d I
      // 011: iload 4
      // 013: iinc 4 1
      // 016: iadd
      // 017: invokevirtual com/finalshell/core/U9.C (I)C
      // 01a: istore 5
      // 01c: iload 5
      // 01e: sipush 7800
      // 021: ldc2_w 5201320676148134657
      // 024: invokestatic com/finalshell/core/U9.a (IJ)I
      // 027: iload 3
      // 028: ifeq 115
      // 02b: if_icmpne 0ff
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: aload 0
      // 036: aload 0
      // 037: getfield com/finalshell/core/U9.d I
      // 03a: iload 4
      // 03c: iadd
      // 03d: invokevirtual com/finalshell/core/U9.C (I)C
      // 040: sipush 25252
      // 043: ldc2_w 2256381802227974060
      // 046: invokestatic com/finalshell/core/U9.a (IJ)I
      // 049: iload 3
      // 04a: ifeq 115
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: if_icmpne 0ff
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield com/finalshell/core/U9.d I
      // 063: iload 4
      // 065: iadd
      // 066: bipush 1
      // 067: iadd
      // 068: invokevirtual com/finalshell/core/U9.C (I)C
      // 06b: sipush 7325
      // 06e: ldc2_w 7975301603790307833
      // 071: invokestatic com/finalshell/core/U9.a (IJ)I
      // 074: iload 3
      // 075: ifeq 115
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: if_icmpne 0ff
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 0
      // 08a: aload 0
      // 08b: getfield com/finalshell/core/U9.d I
      // 08e: iload 4
      // 090: iadd
      // 091: bipush 2
      // 092: iadd
      // 093: invokevirtual com/finalshell/core/U9.C (I)C
      // 096: sipush 7325
      // 099: ldc2_w 7975301603790307833
      // 09c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09f: iload 3
      // 0a0: ifeq 115
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: if_icmpne 0ff
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 0
      // 0b6: getfield com/finalshell/core/U9.d I
      // 0b9: iload 4
      // 0bb: iadd
      // 0bc: bipush 3
      // 0bd: iadd
      // 0be: invokevirtual com/finalshell/core/U9.C (I)C
      // 0c1: iload 2
      // 0c2: iload 3
      // 0c3: ifeq 115
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: if_icmpne 0ff
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: dup
      // 0d9: getfield com/finalshell/core/U9.d I
      // 0dc: bipush 5
      // 0dd: iadd
      // 0de: putfield com/finalshell/core/U9.d I
      // 0e1: aload 0
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/core/U9.d I
      // 0e7: invokevirtual com/finalshell/core/U9.C (I)C
      // 0ea: putfield com/finalshell/core/U9.l C
      // 0ed: aload 0
      // 0ee: sipush 19103
      // 0f1: ldc2_w 2592984034142099420
      // 0f4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f7: putfield com/finalshell/core/U9.z I
      // 0fa: return
      // 0fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: iload 5
      // 101: iload 3
      // 102: ifeq 130
      // 105: sipush 31790
      // 108: ldc2_w 4972276358763192576
      // 10b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: if_icmpeq 122
      // 118: aload 0
      // 119: bipush -1
      // 11a: putfield com/finalshell/core/U9.z I
      // 11d: return
      // 11e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 0
      // 123: aload 0
      // 124: getfield com/finalshell/core/U9.d I
      // 127: iload 4
      // 129: iinc 4 1
      // 12c: iadd
      // 12d: invokevirtual com/finalshell/core/U9.C (I)C
      // 130: istore 5
      // 132: iload 5
      // 134: sipush 7800
      // 137: ldc2_w 5201320676148134657
      // 13a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13d: if_icmpne 1e2
      // 140: aload 0
      // 141: aload 0
      // 142: getfield com/finalshell/core/U9.d I
      // 145: iload 4
      // 147: iadd
      // 148: invokevirtual com/finalshell/core/U9.C (I)C
      // 14b: sipush 25252
      // 14e: ldc2_w 2256381802227974060
      // 151: invokestatic com/finalshell/core/U9.a (IJ)I
      // 154: iload 3
      // 155: ifeq 1f4
      // 158: iload 3
      // 159: ifeq 1f4
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: if_icmpne 1e2
      // 166: goto 16d
      // 169: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: aload 0
      // 16e: aload 0
      // 16f: getfield com/finalshell/core/U9.d I
      // 172: iload 4
      // 174: iadd
      // 175: bipush 1
      // 176: iadd
      // 177: invokevirtual com/finalshell/core/U9.C (I)C
      // 17a: sipush 7325
      // 17d: ldc2_w 7975301603790307833
      // 180: invokestatic com/finalshell/core/U9.a (IJ)I
      // 183: iload 3
      // 184: ifeq 1f4
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: if_icmpne 1e2
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: aload 0
      // 199: aload 0
      // 19a: getfield com/finalshell/core/U9.d I
      // 19d: iload 4
      // 19f: iadd
      // 1a0: bipush 2
      // 1a1: iadd
      // 1a2: invokevirtual com/finalshell/core/U9.C (I)C
      // 1a5: sipush 7325
      // 1a8: ldc2_w 7975301603790307833
      // 1ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ae: iload 3
      // 1af: ifeq 1f4
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: if_icmpne 1e2
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: iinc 4 3
      // 1c6: aload 0
      // 1c7: aload 0
      // 1c8: getfield com/finalshell/core/U9.d I
      // 1cb: iload 4
      // 1cd: iinc 4 1
      // 1d0: iadd
      // 1d1: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d4: istore 5
      // 1d6: aload 1
      // 1d7: aconst_null
      // 1d8: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 1dd: pop
      // 1de: iload 3
      // 1df: ifne 38a
      // 1e2: iload 5
      // 1e4: sipush 30337
      // 1e7: ldc2_w 2029800848590515112
      // 1ea: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: iload 3
      // 1f5: ifeq 243
      // 1f8: if_icmpne 231
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 1
      // 203: invokeinterface java/util/Collection.size ()I 1
      // 208: iload 3
      // 209: ifeq 23a
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 212: athrow
      // 213: ifne 231
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: aload 0
      // 21e: aload 0
      // 21f: getfield com/finalshell/core/U9.d I
      // 222: iload 4
      // 224: iinc 4 1
      // 227: iadd
      // 228: invokevirtual com/finalshell/core/U9.C (I)C
      // 22b: istore 5
      // 22d: iload 3
      // 22e: ifne 3f5
      // 231: iload 5
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: sipush 26107
      // 23d: ldc2_w 2081374444732725480
      // 240: invokestatic com/finalshell/core/U9.a (IJ)I
      // 243: iload 3
      // 244: ifeq 261
      // 247: if_icmpeq 25b
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: aload 0
      // 252: bipush -1
      // 253: putfield com/finalshell/core/U9.z I
      // 256: return
      // 257: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: aload 0
      // 25c: getfield com/finalshell/core/U9.d I
      // 25f: iload 4
      // 261: iadd
      // 262: istore 6
      // 264: aload 0
      // 265: sipush 26107
      // 268: ldc2_w 2081374444732725480
      // 26b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26e: iload 6
      // 270: invokevirtual com/finalshell/core/U9.d (CI)I
      // 273: istore 7
      // 275: iload 7
      // 277: bipush -1
      // 278: if_icmpne 290
      // 27b: new com/finalshell/core/Hi2
      // 27e: dup
      // 27f: sipush 10510
      // 282: sipush -21017
      // 285: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 288: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 28b: athrow
      // 28c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28f: athrow
      // 290: aload 0
      // 291: aload 0
      // 292: getfield com/finalshell/core/U9.d I
      // 295: iload 4
      // 297: iadd
      // 298: iload 7
      // 29a: iload 6
      // 29c: isub
      // 29d: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 2a0: astore 8
      // 2a2: aload 8
      // 2a4: sipush 30531
      // 2a7: ldc2_w 4175784576570993226
      // 2aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ad: invokevirtual java/lang/String.indexOf (I)I
      // 2b0: bipush -1
      // 2b1: iload 3
      // 2b2: ifeq 36e
      // 2b5: if_icmpeq 360
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: bipush 0
      // 2c0: istore 9
      // 2c2: iload 7
      // 2c4: bipush 1
      // 2c5: isub
      // 2c6: istore 10
      // 2c8: iload 10
      // 2ca: iflt 306
      // 2cd: aload 0
      // 2ce: iload 10
      // 2d0: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d3: sipush 30531
      // 2d6: ldc2_w 4175784576570993226
      // 2d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2dc: iload 3
      // 2dd: ifeq 309
      // 2e0: iload 3
      // 2e1: ifeq 309
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: if_icmpne 306
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: iinc 9 1
      // 2f8: iinc 10 -1
      // 2fb: iload 3
      // 2fc: ifne 2c8
      // 2ff: goto 306
      // 302: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 305: athrow
      // 306: iload 9
      // 308: bipush 2
      // 309: irem
      // 30a: iload 3
      // 30b: ifeq 33b
      // 30e: ifne 323
      // 311: goto 318
      // 314: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: iload 3
      // 319: ifne 341
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: aload 0
      // 324: sipush 26107
      // 327: ldc2_w 2081374444732725480
      // 32a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 32d: iload 7
      // 32f: bipush 1
      // 330: iadd
      // 331: invokevirtual com/finalshell/core/U9.d (CI)I
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: istore 7
      // 33d: iload 3
      // 33e: ifne 2bf
      // 341: iload 7
      // 343: iload 6
      // 345: isub
      // 346: istore 9
      // 348: aload 0
      // 349: aload 0
      // 34a: getfield com/finalshell/core/U9.d I
      // 34d: iload 4
      // 34f: iadd
      // 350: iload 9
      // 352: invokevirtual com/finalshell/core/U9.s (II)[C
      // 355: astore 10
      // 357: aload 10
      // 359: iload 9
      // 35b: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 35e: astore 8
      // 360: iload 4
      // 362: iload 7
      // 364: aload 0
      // 365: getfield com/finalshell/core/U9.d I
      // 368: iload 4
      // 36a: iadd
      // 36b: isub
      // 36c: bipush 1
      // 36d: iadd
      // 36e: iadd
      // 36f: istore 4
      // 371: aload 0
      // 372: aload 0
      // 373: getfield com/finalshell/core/U9.d I
      // 376: iload 4
      // 378: iinc 4 1
      // 37b: iadd
      // 37c: invokevirtual com/finalshell/core/U9.C (I)C
      // 37f: istore 5
      // 381: aload 1
      // 382: aload 8
      // 384: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 389: pop
      // 38a: iload 5
      // 38c: sipush 26927
      // 38f: ldc2_w 6101958691031889140
      // 392: invokestatic com/finalshell/core/U9.a (IJ)I
      // 395: iload 3
      // 396: ifeq 3cd
      // 399: if_icmpne 3b7
      // 39c: goto 3a3
      // 39f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a2: athrow
      // 3a3: aload 0
      // 3a4: aload 0
      // 3a5: getfield com/finalshell/core/U9.d I
      // 3a8: iload 4
      // 3aa: iinc 4 1
      // 3ad: iadd
      // 3ae: invokevirtual com/finalshell/core/U9.C (I)C
      // 3b1: istore 5
      // 3b3: iload 3
      // 3b4: ifne 132
      // 3b7: iload 5
      // 3b9: iload 3
      // 3ba: ifeq 3e5
      // 3bd: sipush 30337
      // 3c0: ldc2_w 2029800848590515112
      // 3c3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c6: goto 3cd
      // 3c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cc: athrow
      // 3cd: if_icmpne 3eb
      // 3d0: aload 0
      // 3d1: aload 0
      // 3d2: getfield com/finalshell/core/U9.d I
      // 3d5: iload 4
      // 3d7: iinc 4 1
      // 3da: iadd
      // 3db: invokevirtual com/finalshell/core/U9.C (I)C
      // 3de: goto 3e5
      // 3e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: istore 5
      // 3e7: iload 3
      // 3e8: ifne 3f5
      // 3eb: aload 0
      // 3ec: bipush -1
      // 3ed: putfield com/finalshell/core/U9.z I
      // 3f0: return
      // 3f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f4: athrow
      // 3f5: iload 5
      // 3f7: iload 2
      // 3f8: if_icmpne 424
      // 3fb: aload 0
      // 3fc: dup
      // 3fd: getfield com/finalshell/core/U9.d I
      // 400: iload 4
      // 402: iadd
      // 403: putfield com/finalshell/core/U9.d I
      // 406: aload 0
      // 407: aload 0
      // 408: aload 0
      // 409: getfield com/finalshell/core/U9.d I
      // 40c: invokevirtual com/finalshell/core/U9.C (I)C
      // 40f: putfield com/finalshell/core/U9.l C
      // 412: aload 0
      // 413: sipush 5887
      // 416: ldc2_w 3467391210321595353
      // 419: invokestatic com/finalshell/core/U9.a (IJ)I
      // 41c: putfield com/finalshell/core/U9.z I
      // 41f: return
      // 420: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 423: athrow
      // 424: aload 0
      // 425: bipush -1
      // 426: putfield com/finalshell/core/U9.z I
      // 429: return
   }

   public int W$int(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: bipush 0
      // 02a: ireturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 062
      // 047: sipush 19418
      // 04a: ldc2_w 715321441499911916
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpne 065
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 1
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: goto 066
      // 065: bipush 0
      // 066: istore 5
      // 068: iload 5
      // 06a: iload 2
      // 06b: ifne 089
      // 06e: ifeq 087
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 0
      // 07a: getfield com/finalshell/core/U9.d I
      // 07d: iload 3
      // 07e: iinc 3 1
      // 081: iadd
      // 082: invokevirtual com/finalshell/core/U9.C (I)C
      // 085: istore 4
      // 087: iload 4
      // 089: iload 2
      // 08a: ifne 1e7
      // 08d: sipush 21259
      // 090: ldc2_w 1287927339301015045
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: if_icmplt 1e1
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: iload 4
      // 0a2: iload 2
      // 0a3: ifne 1e7
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: sipush 24153
      // 0b0: ldc2_w 3168790736949871469
      // 0b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b6: if_icmpgt 1e1
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: iload 4
      // 0c2: sipush 21259
      // 0c5: ldc2_w 1287927339301015045
      // 0c8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0cb: isub
      // 0cc: istore 6
      // 0ce: aload 0
      // 0cf: aload 0
      // 0d0: getfield com/finalshell/core/U9.d I
      // 0d3: iload 3
      // 0d4: iinc 3 1
      // 0d7: iadd
      // 0d8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0db: istore 4
      // 0dd: iload 4
      // 0df: sipush 21259
      // 0e2: ldc2_w 1287927339301015045
      // 0e5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e8: if_icmplt 12e
      // 0eb: iload 4
      // 0ed: sipush 24153
      // 0f0: ldc2_w 3168790736949871469
      // 0f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f6: iload 2
      // 0f7: ifne 144
      // 0fa: iload 2
      // 0fb: ifne 144
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: if_icmpgt 12e
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: iload 6
      // 111: sipush 1861
      // 114: ldc2_w 5349631099953699429
      // 117: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11a: imul
      // 11b: iload 4
      // 11d: sipush 21259
      // 120: ldc2_w 1287927339301015045
      // 123: invokestatic com/finalshell/core/U9.a (IJ)I
      // 126: isub
      // 127: iadd
      // 128: istore 6
      // 12a: iload 2
      // 12b: ifeq 0ce
      // 12e: iload 4
      // 130: iload 2
      // 131: ifne 154
      // 134: sipush 19110
      // 137: ldc2_w 4854799824381581179
      // 13a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: if_icmpne 152
      // 147: aload 0
      // 148: bipush -1
      // 149: putfield com/finalshell/core/U9.z I
      // 14c: bipush 0
      // 14d: ireturn
      // 14e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 6
      // 154: iload 2
      // 155: ifne 186
      // 158: iflt 184
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: iload 3
      // 163: sipush 26467
      // 166: ldc2_w 5688268127982992063
      // 169: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16c: aload 1
      // 16d: arraylength
      // 16e: iadd
      // 16f: iload 2
      // 170: ifne 1f3
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: if_icmple 1e8
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: iload 6
      // 186: iload 2
      // 187: ifne 1e0
      // 18a: sipush 8342
      // 18d: ldc2_w 6278209057510587856
      // 190: invokestatic com/finalshell/core/U9.a (IJ)I
      // 193: if_icmpne 1d3
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: iload 3
      // 19e: iload 2
      // 19f: ifne 1e0
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: sipush 8285
      // 1ac: ldc2_w 1050517695616711985
      // 1af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b2: if_icmpne 1d3
      // 1b5: goto 1bc
      // 1b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: iload 5
      // 1be: iload 2
      // 1bf: ifne 1ea
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: ifne 1e8
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: bipush -1
      // 1d5: putfield com/finalshell/core/U9.z I
      // 1d8: bipush 0
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: ireturn
      // 1e1: aload 0
      // 1e2: bipush -1
      // 1e3: putfield com/finalshell/core/U9.z I
      // 1e6: bipush 0
      // 1e7: ireturn
      // 1e8: iload 4
      // 1ea: sipush 26927
      // 1ed: ldc2_w 6101958691031889140
      // 1f0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f3: iload 2
      // 1f4: ifne 26e
      // 1f7: if_icmpne 258
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: aload 0
      // 202: dup
      // 203: getfield com/finalshell/core/U9.d I
      // 206: iload 3
      // 207: iadd
      // 208: putfield com/finalshell/core/U9.d I
      // 20b: aload 0
      // 20c: aload 0
      // 20d: aload 0
      // 20e: getfield com/finalshell/core/U9.d I
      // 211: invokevirtual com/finalshell/core/U9.C (I)C
      // 214: putfield com/finalshell/core/U9.l C
      // 217: aload 0
      // 218: sipush 5887
      // 21b: ldc2_w 3467391210321595353
      // 21e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 221: putfield com/finalshell/core/U9.z I
      // 224: aload 0
      // 225: sipush 9361
      // 228: ldc2_w 2488456831667599749
      // 22b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22e: putfield com/finalshell/core/U9.Y I
      // 231: iload 5
      // 233: iload 2
      // 234: ifne 252
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: ifeq 255
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: iload 6
      // 24a: ineg
      // 24b: goto 252
      // 24e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: goto 257
      // 255: iload 6
      // 257: ireturn
      // 258: iload 4
      // 25a: iload 2
      // 25b: ifne 3e0
      // 25e: sipush 4784
      // 261: ldc2_w 3082167687830622095
      // 264: invokestatic com/finalshell/core/U9.a (IJ)I
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: if_icmpne 3d3
      // 271: aload 0
      // 272: aload 0
      // 273: getfield com/finalshell/core/U9.d I
      // 276: iload 3
      // 277: iinc 3 1
      // 27a: iadd
      // 27b: invokevirtual com/finalshell/core/U9.C (I)C
      // 27e: istore 4
      // 280: iload 4
      // 282: sipush 26927
      // 285: ldc2_w 6101958691031889140
      // 288: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28b: iload 2
      // 28c: ifne 2d9
      // 28f: if_icmpne 2c7
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: aload 0
      // 29a: sipush 9361
      // 29d: ldc2_w 2488456831667599749
      // 2a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a3: putfield com/finalshell/core/U9.Y I
      // 2a6: aload 0
      // 2a7: dup
      // 2a8: getfield com/finalshell/core/U9.d I
      // 2ab: iload 3
      // 2ac: iadd
      // 2ad: putfield com/finalshell/core/U9.d I
      // 2b0: aload 0
      // 2b1: aload 0
      // 2b2: aload 0
      // 2b3: getfield com/finalshell/core/U9.d I
      // 2b6: invokevirtual com/finalshell/core/U9.C (I)C
      // 2b9: putfield com/finalshell/core/U9.l C
      // 2bc: iload 2
      // 2bd: ifeq 3c2
      // 2c0: goto 2c7
      // 2c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c6: athrow
      // 2c7: iload 4
      // 2c9: sipush 30337
      // 2cc: ldc2_w 2029800848590515112
      // 2cf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d2: goto 2d9
      // 2d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d8: athrow
      // 2d9: iload 2
      // 2da: ifne 327
      // 2dd: if_icmpne 315
      // 2e0: goto 2e7
      // 2e3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e6: athrow
      // 2e7: aload 0
      // 2e8: sipush 9145
      // 2eb: ldc2_w 6577731744871808687
      // 2ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f1: putfield com/finalshell/core/U9.Y I
      // 2f4: aload 0
      // 2f5: dup
      // 2f6: getfield com/finalshell/core/U9.d I
      // 2f9: iload 3
      // 2fa: iadd
      // 2fb: putfield com/finalshell/core/U9.d I
      // 2fe: aload 0
      // 2ff: aload 0
      // 300: aload 0
      // 301: getfield com/finalshell/core/U9.d I
      // 304: invokevirtual com/finalshell/core/U9.C (I)C
      // 307: putfield com/finalshell/core/U9.l C
      // 30a: iload 2
      // 30b: ifeq 3c2
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 314: athrow
      // 315: iload 4
      // 317: sipush 4784
      // 31a: ldc2_w 3082167687830622095
      // 31d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 320: goto 327
      // 323: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: iload 2
      // 328: ifne 380
      // 32b: if_icmpne 363
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 334: athrow
      // 335: aload 0
      // 336: sipush 16923
      // 339: ldc2_w 1571494982232874791
      // 33c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33f: putfield com/finalshell/core/U9.Y I
      // 342: aload 0
      // 343: dup
      // 344: getfield com/finalshell/core/U9.d I
      // 347: iload 3
      // 348: iadd
      // 349: putfield com/finalshell/core/U9.d I
      // 34c: aload 0
      // 34d: aload 0
      // 34e: aload 0
      // 34f: getfield com/finalshell/core/U9.d I
      // 352: invokevirtual com/finalshell/core/U9.C (I)C
      // 355: putfield com/finalshell/core/U9.l C
      // 358: iload 2
      // 359: ifeq 3c2
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: iload 4
      // 365: iload 2
      // 366: ifne 3c1
      // 369: goto 370
      // 36c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: sipush 2765
      // 373: ldc2_w 8216137057917720563
      // 376: invokestatic com/finalshell/core/U9.a (IJ)I
      // 379: goto 380
      // 37c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37f: athrow
      // 380: if_icmpne 3b4
      // 383: aload 0
      // 384: sipush 9907
      // 387: ldc2_w 514190805586246625
      // 38a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 38d: putfield com/finalshell/core/U9.Y I
      // 390: aload 0
      // 391: dup
      // 392: getfield com/finalshell/core/U9.d I
      // 395: iload 3
      // 396: bipush 1
      // 397: isub
      // 398: iadd
      // 399: putfield com/finalshell/core/U9.d I
      // 39c: aload 0
      // 39d: sipush 2765
      // 3a0: ldc2_w 8216137057917720563
      // 3a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a6: putfield com/finalshell/core/U9.l C
      // 3a9: iload 2
      // 3aa: ifeq 3c2
      // 3ad: goto 3b4
      // 3b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b3: athrow
      // 3b4: aload 0
      // 3b5: bipush -1
      // 3b6: putfield com/finalshell/core/U9.z I
      // 3b9: bipush 0
      // 3ba: goto 3c1
      // 3bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c0: athrow
      // 3c1: ireturn
      // 3c2: aload 0
      // 3c3: sipush 2897
      // 3c6: ldc2_w 695568451002816123
      // 3c9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3cc: putfield com/finalshell/core/U9.z I
      // 3cf: iload 2
      // 3d0: ifeq 3e1
      // 3d3: aload 0
      // 3d4: bipush -1
      // 3d5: putfield com/finalshell/core/U9.z I
      // 3d8: bipush 0
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3df: athrow
      // 3e0: ireturn
      // 3e1: iload 5
      // 3e3: iload 2
      // 3e4: ifne 3fb
      // 3e7: ifeq 3fe
      // 3ea: goto 3f1
      // 3ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f0: athrow
      // 3f1: iload 6
      // 3f3: ineg
      // 3f4: goto 3fb
      // 3f7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fa: athrow
      // 3fb: goto 400
      // 3fe: iload 6
      // 400: ireturn
   }

   public final int[] D(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 085
      // 047: sipush 31790
      // 04a: ldc2_w 4972276358763192576
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpeq 06d
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: sipush 4469
      // 05e: ldc2_w 8451788941981764676
      // 061: invokestatic com/finalshell/core/U9.a (IJ)I
      // 064: putfield com/finalshell/core/U9.z I
      // 067: aconst_null
      // 068: areturn
      // 069: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/U9.d I
      // 072: iload 3
      // 073: iinc 3 1
      // 076: iadd
      // 077: invokevirtual com/finalshell/core/U9.C (I)C
      // 07a: istore 4
      // 07c: sipush 9361
      // 07f: ldc2_w 2488456831667599749
      // 082: invokestatic com/finalshell/core/U9.a (IJ)I
      // 085: newarray 10
      // 087: astore 5
      // 089: bipush 0
      // 08a: istore 6
      // 08c: iload 4
      // 08e: iload 2
      // 08f: ifne 0c0
      // 092: sipush 30337
      // 095: ldc2_w 2029800848590515112
      // 098: invokestatic com/finalshell/core/U9.a (IJ)I
      // 09b: if_icmpne 0b8
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 0
      // 0a7: getfield com/finalshell/core/U9.d I
      // 0aa: iload 3
      // 0ab: iinc 3 1
      // 0ae: iadd
      // 0af: invokevirtual com/finalshell/core/U9.C (I)C
      // 0b2: istore 4
      // 0b4: iload 2
      // 0b5: ifeq 26f
      // 0b8: bipush 0
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: istore 7
      // 0c2: iload 4
      // 0c4: sipush 19418
      // 0c7: ldc2_w 715321441499911916
      // 0ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0cd: if_icmpne 0e6
      // 0d0: aload 0
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/core/U9.d I
      // 0d5: iload 3
      // 0d6: iinc 3 1
      // 0d9: iadd
      // 0da: invokevirtual com/finalshell/core/U9.C (I)C
      // 0dd: istore 4
      // 0df: bipush 1
      // 0e0: iload 2
      // 0e1: ifne 0e8
      // 0e4: istore 7
      // 0e6: iload 4
      // 0e8: sipush 21259
      // 0eb: ldc2_w 1287927339301015045
      // 0ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f1: iload 2
      // 0f2: ifne 111
      // 0f5: if_icmplt 260
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: iload 4
      // 101: sipush 24153
      // 104: ldc2_w 3168790736949871469
      // 107: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: iload 2
      // 112: ifne 131
      // 115: if_icmpgt 260
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: iload 4
      // 121: sipush 21259
      // 124: ldc2_w 1287927339301015045
      // 127: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: isub
      // 132: istore 8
      // 134: aload 0
      // 135: aload 0
      // 136: getfield com/finalshell/core/U9.d I
      // 139: iload 3
      // 13a: iinc 3 1
      // 13d: iadd
      // 13e: invokevirtual com/finalshell/core/U9.C (I)C
      // 141: istore 4
      // 143: iload 4
      // 145: sipush 21259
      // 148: ldc2_w 1287927339301015045
      // 14b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14e: if_icmplt 194
      // 151: iload 4
      // 153: sipush 24153
      // 156: ldc2_w 3168790736949871469
      // 159: invokestatic com/finalshell/core/U9.a (IJ)I
      // 15c: iload 2
      // 15d: ifne 199
      // 160: iload 2
      // 161: ifne 199
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: if_icmpgt 194
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: iload 8
      // 177: sipush 1861
      // 17a: ldc2_w 5349631099953699429
      // 17d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 180: imul
      // 181: iload 4
      // 183: sipush 21259
      // 186: ldc2_w 1287927339301015045
      // 189: invokestatic com/finalshell/core/U9.a (IJ)I
      // 18c: isub
      // 18d: iadd
      // 18e: istore 8
      // 190: iload 2
      // 191: ifeq 134
      // 194: iload 6
      // 196: aload 5
      // 198: arraylength
      // 199: iload 2
      // 19a: ifne 1b4
      // 19d: if_icmplt 1c8
      // 1a0: goto 1a7
      // 1a3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: aload 5
      // 1a9: arraylength
      // 1aa: bipush 3
      // 1ab: imul
      // 1ac: bipush 2
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: idiv
      // 1b5: newarray 10
      // 1b7: astore 9
      // 1b9: aload 5
      // 1bb: bipush 0
      // 1bc: aload 9
      // 1be: bipush 0
      // 1bf: iload 6
      // 1c1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1c4: aload 9
      // 1c6: astore 5
      // 1c8: aload 5
      // 1ca: iload 6
      // 1cc: iinc 6 1
      // 1cf: iload 7
      // 1d1: iload 2
      // 1d2: ifne 1e9
      // 1d5: ifeq 1ec
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: iload 8
      // 1e1: ineg
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: goto 1ee
      // 1ec: iload 8
      // 1ee: iastore
      // 1ef: iload 4
      // 1f1: sipush 26927
      // 1f4: ldc2_w 6101958691031889140
      // 1f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1fa: iload 2
      // 1fb: ifne 238
      // 1fe: if_icmpne 21b
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: aload 0
      // 209: aload 0
      // 20a: getfield com/finalshell/core/U9.d I
      // 20d: iload 3
      // 20e: iinc 3 1
      // 211: iadd
      // 212: invokevirtual com/finalshell/core/U9.C (I)C
      // 215: istore 4
      // 217: iload 2
      // 218: ifeq 255
      // 21b: iload 4
      // 21d: iload 2
      // 21e: ifne 24f
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: sipush 30337
      // 22b: ldc2_w 2029800848590515112
      // 22e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: if_icmpne 255
      // 23b: aload 0
      // 23c: aload 0
      // 23d: getfield com/finalshell/core/U9.d I
      // 240: iload 3
      // 241: iinc 3 1
      // 244: iadd
      // 245: invokevirtual com/finalshell/core/U9.C (I)C
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24e: athrow
      // 24f: istore 4
      // 251: iload 2
      // 252: ifeq 26f
      // 255: iload 2
      // 256: ifeq 26b
      // 259: goto 260
      // 25c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: aload 0
      // 261: bipush -1
      // 262: putfield com/finalshell/core/U9.z I
      // 265: aconst_null
      // 266: areturn
      // 267: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26a: athrow
      // 26b: iload 2
      // 26c: ifeq 0b8
      // 26f: iload 6
      // 271: aload 5
      // 273: arraylength
      // 274: iload 2
      // 275: ifne 2a2
      // 278: if_icmpeq 297
      // 27b: goto 282
      // 27e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 281: athrow
      // 282: iload 6
      // 284: newarray 10
      // 286: astore 7
      // 288: aload 5
      // 28a: bipush 0
      // 28b: aload 7
      // 28d: bipush 0
      // 28e: iload 6
      // 290: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 293: aload 7
      // 295: astore 5
      // 297: iload 4
      // 299: sipush 26927
      // 29c: ldc2_w 6101958691031889140
      // 29f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a2: iload 2
      // 2a3: ifne 2ed
      // 2a6: if_icmpne 2e2
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: aload 0
      // 2b1: dup
      // 2b2: getfield com/finalshell/core/U9.d I
      // 2b5: iload 3
      // 2b6: bipush 1
      // 2b7: isub
      // 2b8: iadd
      // 2b9: putfield com/finalshell/core/U9.d I
      // 2bc: aload 0
      // 2bd: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2c0: pop
      // 2c1: aload 0
      // 2c2: sipush 5887
      // 2c5: ldc2_w 3467391210321595353
      // 2c8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2cb: putfield com/finalshell/core/U9.z I
      // 2ce: aload 0
      // 2cf: sipush 9361
      // 2d2: ldc2_w 2488456831667599749
      // 2d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d8: putfield com/finalshell/core/U9.Y I
      // 2db: aload 5
      // 2dd: areturn
      // 2de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: iload 4
      // 2e4: sipush 4784
      // 2e7: ldc2_w 3082167687830622095
      // 2ea: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ed: iload 2
      // 2ee: ifne 315
      // 2f1: if_icmpne 440
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 0
      // 2fc: aload 0
      // 2fd: getfield com/finalshell/core/U9.d I
      // 300: iload 3
      // 301: iinc 3 1
      // 304: iadd
      // 305: invokevirtual com/finalshell/core/U9.C (I)C
      // 308: istore 4
      // 30a: iload 4
      // 30c: sipush 26927
      // 30f: ldc2_w 6101958691031889140
      // 312: invokestatic com/finalshell/core/U9.a (IJ)I
      // 315: iload 2
      // 316: ifne 35e
      // 319: if_icmpne 34c
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: aload 0
      // 324: sipush 9361
      // 327: ldc2_w 2488456831667599749
      // 32a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 32d: putfield com/finalshell/core/U9.Y I
      // 330: aload 0
      // 331: dup
      // 332: getfield com/finalshell/core/U9.d I
      // 335: iload 3
      // 336: bipush 1
      // 337: isub
      // 338: iadd
      // 339: putfield com/finalshell/core/U9.d I
      // 33c: aload 0
      // 33d: invokevirtual com/finalshell/core/U9.C$char ()C
      // 340: pop
      // 341: iload 2
      // 342: ifeq 42f
      // 345: goto 34c
      // 348: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34b: athrow
      // 34c: iload 4
      // 34e: sipush 30337
      // 351: ldc2_w 2029800848590515112
      // 354: invokestatic com/finalshell/core/U9.a (IJ)I
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: iload 2
      // 35f: ifne 3a7
      // 362: if_icmpne 395
      // 365: goto 36c
      // 368: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36b: athrow
      // 36c: aload 0
      // 36d: sipush 9145
      // 370: ldc2_w 6577731744871808687
      // 373: invokestatic com/finalshell/core/U9.a (IJ)I
      // 376: putfield com/finalshell/core/U9.Y I
      // 379: aload 0
      // 37a: dup
      // 37b: getfield com/finalshell/core/U9.d I
      // 37e: iload 3
      // 37f: bipush 1
      // 380: isub
      // 381: iadd
      // 382: putfield com/finalshell/core/U9.d I
      // 385: aload 0
      // 386: invokevirtual com/finalshell/core/U9.C$char ()C
      // 389: pop
      // 38a: iload 2
      // 38b: ifeq 42f
      // 38e: goto 395
      // 391: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 394: athrow
      // 395: iload 4
      // 397: sipush 4784
      // 39a: ldc2_w 3082167687830622095
      // 39d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a0: goto 3a7
      // 3a3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a6: athrow
      // 3a7: iload 2
      // 3a8: ifne 3f0
      // 3ab: if_icmpne 3de
      // 3ae: goto 3b5
      // 3b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b4: athrow
      // 3b5: aload 0
      // 3b6: sipush 16923
      // 3b9: ldc2_w 1571494982232874791
      // 3bc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3bf: putfield com/finalshell/core/U9.Y I
      // 3c2: aload 0
      // 3c3: dup
      // 3c4: getfield com/finalshell/core/U9.d I
      // 3c7: iload 3
      // 3c8: bipush 1
      // 3c9: isub
      // 3ca: iadd
      // 3cb: putfield com/finalshell/core/U9.d I
      // 3ce: aload 0
      // 3cf: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3d2: pop
      // 3d3: iload 2
      // 3d4: ifeq 42f
      // 3d7: goto 3de
      // 3da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dd: athrow
      // 3de: iload 4
      // 3e0: sipush 2765
      // 3e3: ldc2_w 8216137057917720563
      // 3e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: if_icmpne 424
      // 3f3: aload 0
      // 3f4: dup
      // 3f5: getfield com/finalshell/core/U9.d I
      // 3f8: iload 3
      // 3f9: bipush 1
      // 3fa: isub
      // 3fb: iadd
      // 3fc: putfield com/finalshell/core/U9.d I
      // 3ff: aload 0
      // 400: sipush 9907
      // 403: ldc2_w 514190805586246625
      // 406: invokestatic com/finalshell/core/U9.a (IJ)I
      // 409: putfield com/finalshell/core/U9.Y I
      // 40c: aload 0
      // 40d: sipush 2765
      // 410: ldc2_w 8216137057917720563
      // 413: invokestatic com/finalshell/core/U9.a (IJ)I
      // 416: putfield com/finalshell/core/U9.l C
      // 419: iload 2
      // 41a: ifeq 42f
      // 41d: goto 424
      // 420: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 423: athrow
      // 424: aload 0
      // 425: bipush -1
      // 426: putfield com/finalshell/core/U9.z I
      // 429: aconst_null
      // 42a: areturn
      // 42b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42e: athrow
      // 42f: aload 0
      // 430: sipush 2897
      // 433: ldc2_w 695568451002816123
      // 436: invokestatic com/finalshell/core/U9.a (IJ)I
      // 439: putfield com/finalshell/core/U9.z I
      // 43c: iload 2
      // 43d: ifeq 44b
      // 440: aload 0
      // 441: bipush -1
      // 442: putfield com/finalshell/core/U9.z I
      // 445: aconst_null
      // 446: areturn
      // 447: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44a: athrow
      // 44b: aload 5
      // 44d: areturn
   }

   @Override
   public boolean I(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: bipush 0
      // 00a: istore 3
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: bipush 0
      // 01b: istore 5
      // 01d: iload 4
      // 01f: sipush 2974
      // 022: ldc2_w 7517364692915017364
      // 025: invokestatic com/finalshell/core/U9.a (IJ)I
      // 028: iload 2
      // 029: ifeq 0e4
      // 02c: if_icmpne 0d9
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 0
      // 037: aload 0
      // 038: getfield com/finalshell/core/U9.d I
      // 03b: iload 3
      // 03c: iadd
      // 03d: invokevirtual com/finalshell/core/U9.C (I)C
      // 040: iload 2
      // 041: ifeq 0d8
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: sipush 7317
      // 04e: ldc2_w 2791501365709849076
      // 051: invokestatic com/finalshell/core/U9.a (IJ)I
      // 054: if_icmpne 0cb
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield com/finalshell/core/U9.d I
      // 063: iload 3
      // 064: iadd
      // 065: bipush 1
      // 066: iadd
      // 067: invokevirtual com/finalshell/core/U9.C (I)C
      // 06a: iload 2
      // 06b: ifeq 0d8
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: sipush 25252
      // 078: ldc2_w 2256381802227974060
      // 07b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07e: if_icmpne 0cb
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 0
      // 089: aload 0
      // 08a: getfield com/finalshell/core/U9.d I
      // 08d: iload 3
      // 08e: iadd
      // 08f: bipush 2
      // 090: iadd
      // 091: invokevirtual com/finalshell/core/U9.C (I)C
      // 094: iload 2
      // 095: ifeq 0d8
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: sipush 16831
      // 0a2: ldc2_w 1205696545576721607
      // 0a5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a8: if_icmpne 0cb
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: iinc 3 3
      // 0b5: aload 0
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/U9.d I
      // 0ba: iload 3
      // 0bb: iinc 3 1
      // 0be: iadd
      // 0bf: invokevirtual com/finalshell/core/U9.C (I)C
      // 0c2: istore 4
      // 0c4: bipush 1
      // 0c5: istore 5
      // 0c7: iload 2
      // 0c8: ifne 220
      // 0cb: aload 0
      // 0cc: bipush -1
      // 0cd: putfield com/finalshell/core/U9.z I
      // 0d0: bipush 0
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: ireturn
      // 0d9: iload 4
      // 0db: sipush 15254
      // 0de: ldc2_w 4060672531983525529
      // 0e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e4: iload 2
      // 0e5: ifeq 1ca
      // 0e8: if_icmpne 1bf
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/core/U9.d I
      // 0f7: iload 3
      // 0f8: iadd
      // 0f9: invokevirtual com/finalshell/core/U9.C (I)C
      // 0fc: iload 2
      // 0fd: ifeq 1be
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: sipush 31543
      // 10a: ldc2_w 4137327465093899819
      // 10d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 110: if_icmpne 1b1
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 0
      // 11c: getfield com/finalshell/core/U9.d I
      // 11f: iload 3
      // 120: iadd
      // 121: bipush 1
      // 122: iadd
      // 123: invokevirtual com/finalshell/core/U9.C (I)C
      // 126: iload 2
      // 127: ifeq 1be
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: sipush 7325
      // 134: ldc2_w 7975301603790307833
      // 137: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13a: if_icmpne 1b1
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 0
      // 145: aload 0
      // 146: getfield com/finalshell/core/U9.d I
      // 149: iload 3
      // 14a: iadd
      // 14b: bipush 2
      // 14c: iadd
      // 14d: invokevirtual com/finalshell/core/U9.C (I)C
      // 150: iload 2
      // 151: ifeq 1be
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: sipush 28547
      // 15e: ldc2_w 1168755113503306425
      // 161: invokestatic com/finalshell/core/U9.a (IJ)I
      // 164: if_icmpne 1b1
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 0
      // 16f: aload 0
      // 170: getfield com/finalshell/core/U9.d I
      // 173: iload 3
      // 174: iadd
      // 175: bipush 3
      // 176: iadd
      // 177: invokevirtual com/finalshell/core/U9.C (I)C
      // 17a: iload 2
      // 17b: ifeq 1be
      // 17e: goto 185
      // 181: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: sipush 16831
      // 188: ldc2_w 1205696545576721607
      // 18b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 18e: if_icmpne 1b1
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: iinc 3 4
      // 19b: aload 0
      // 19c: aload 0
      // 19d: getfield com/finalshell/core/U9.d I
      // 1a0: iload 3
      // 1a1: iinc 3 1
      // 1a4: iadd
      // 1a5: invokevirtual com/finalshell/core/U9.C (I)C
      // 1a8: istore 4
      // 1aa: bipush 0
      // 1ab: istore 5
      // 1ad: iload 2
      // 1ae: ifne 220
      // 1b1: aload 0
      // 1b2: bipush -1
      // 1b3: putfield com/finalshell/core/U9.z I
      // 1b6: bipush 0
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: ireturn
      // 1bf: iload 4
      // 1c1: sipush 28346
      // 1c4: ldc2_w 2744492090225669041
      // 1c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ca: iload 2
      // 1cb: ifeq 200
      // 1ce: if_icmpne 1ee
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: aload 0
      // 1da: getfield com/finalshell/core/U9.d I
      // 1dd: iload 3
      // 1de: iinc 3 1
      // 1e1: iadd
      // 1e2: invokevirtual com/finalshell/core/U9.C (I)C
      // 1e5: istore 4
      // 1e7: bipush 1
      // 1e8: istore 5
      // 1ea: iload 2
      // 1eb: ifne 220
      // 1ee: iload 4
      // 1f0: sipush 21259
      // 1f3: ldc2_w 1287927339301015045
      // 1f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: iload 2
      // 201: ifeq 223
      // 204: if_icmpne 220
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: aload 0
      // 20f: aload 0
      // 210: getfield com/finalshell/core/U9.d I
      // 213: iload 3
      // 214: iinc 3 1
      // 217: iadd
      // 218: invokevirtual com/finalshell/core/U9.C (I)C
      // 21b: istore 4
      // 21d: bipush 0
      // 21e: istore 5
      // 220: iload 4
      // 222: iload 1
      // 223: if_icmpne 25b
      // 226: aload 0
      // 227: dup
      // 228: getfield com/finalshell/core/U9.d I
      // 22b: iload 3
      // 22c: iadd
      // 22d: putfield com/finalshell/core/U9.d I
      // 230: aload 0
      // 231: aload 0
      // 232: aload 0
      // 233: getfield com/finalshell/core/U9.d I
      // 236: invokevirtual com/finalshell/core/U9.C (I)C
      // 239: putfield com/finalshell/core/U9.l C
      // 23c: aload 0
      // 23d: sipush 5887
      // 240: ldc2_w 3467391210321595353
      // 243: invokestatic com/finalshell/core/U9.a (IJ)I
      // 246: putfield com/finalshell/core/U9.z I
      // 249: iload 5
      // 24b: iload 2
      // 24c: ifeq 260
      // 24f: goto 256
      // 252: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 255: athrow
      // 256: ireturn
      // 257: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: iload 4
      // 25d: invokestatic com/finalshell/core/U9.Y (C)Z
      // 260: iload 2
      // 261: ifeq 288
      // 264: ifeq 281
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: aload 0
      // 26f: aload 0
      // 270: getfield com/finalshell/core/U9.d I
      // 273: iload 3
      // 274: iinc 3 1
      // 277: iadd
      // 278: invokevirtual com/finalshell/core/U9.C (I)C
      // 27b: istore 4
      // 27d: iload 2
      // 27e: ifne 220
      // 281: aload 0
      // 282: bipush -1
      // 283: putfield com/finalshell/core/U9.z I
      // 286: iload 5
      // 288: ireturn
   }

   @Override
   public int y(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield com/finalshell/core/U9.z I
      // 005: bipush 0
      // 006: istore 3
      // 007: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 00a: aload 0
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/U9.d I
      // 00f: iload 3
      // 010: iinc 3 1
      // 013: iadd
      // 014: invokevirtual com/finalshell/core/U9.C (I)C
      // 017: istore 4
      // 019: istore 2
      // 01a: iload 4
      // 01c: iload 2
      // 01d: ifeq 03b
      // 020: sipush 26107
      // 023: ldc2_w 2081374444732725480
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: iload 2
      // 044: ifeq 062
      // 047: ifeq 060
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield com/finalshell/core/U9.d I
      // 056: iload 3
      // 057: iinc 3 1
      // 05a: iadd
      // 05b: invokevirtual com/finalshell/core/U9.C (I)C
      // 05e: istore 4
      // 060: iload 4
      // 062: iload 2
      // 063: ifeq 081
      // 066: sipush 19418
      // 069: ldc2_w 715321441499911916
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: if_icmpne 084
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: goto 085
      // 084: bipush 0
      // 085: istore 6
      // 087: iload 6
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: ifeq 0a6
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/U9.d I
      // 09c: iload 3
      // 09d: iinc 3 1
      // 0a0: iadd
      // 0a1: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a4: istore 4
      // 0a6: iload 4
      // 0a8: sipush 21259
      // 0ab: ldc2_w 1287927339301015045
      // 0ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b1: iload 2
      // 0b2: ifeq 1a2
      // 0b5: if_icmplt 18c
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: sipush 24153
      // 0c4: ldc2_w 3168790736949871469
      // 0c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ca: iload 2
      // 0cb: ifeq 1a2
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: if_icmpgt 18c
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: iload 4
      // 0e1: sipush 21259
      // 0e4: ldc2_w 1287927339301015045
      // 0e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ea: isub
      // 0eb: istore 7
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/U9.d I
      // 0f2: iload 3
      // 0f3: iinc 3 1
      // 0f6: iadd
      // 0f7: invokevirtual com/finalshell/core/U9.C (I)C
      // 0fa: istore 4
      // 0fc: iload 4
      // 0fe: sipush 21259
      // 101: ldc2_w 1287927339301015045
      // 104: invokestatic com/finalshell/core/U9.a (IJ)I
      // 107: if_icmplt 14d
      // 10a: iload 4
      // 10c: sipush 24153
      // 10f: ldc2_w 3168790736949871469
      // 112: invokestatic com/finalshell/core/U9.a (IJ)I
      // 115: iload 2
      // 116: ifeq 163
      // 119: iload 2
      // 11a: ifeq 163
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: if_icmpgt 14d
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: iload 7
      // 130: sipush 1861
      // 133: ldc2_w 5349631099953699429
      // 136: invokestatic com/finalshell/core/U9.a (IJ)I
      // 139: imul
      // 13a: iload 4
      // 13c: sipush 21259
      // 13f: ldc2_w 1287927339301015045
      // 142: invokestatic com/finalshell/core/U9.a (IJ)I
      // 145: isub
      // 146: iadd
      // 147: istore 7
      // 149: iload 2
      // 14a: ifne 0ed
      // 14d: iload 4
      // 14f: iload 2
      // 150: ifeq 173
      // 153: sipush 19110
      // 156: ldc2_w 4854799824381581179
      // 159: invokestatic com/finalshell/core/U9.a (IJ)I
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: if_icmpne 171
      // 166: aload 0
      // 167: bipush -1
      // 168: putfield com/finalshell/core/U9.z I
      // 16b: bipush 0
      // 16c: ireturn
      // 16d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: iload 7
      // 173: iload 2
      // 174: ifeq 358
      // 177: ifge 356
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: aload 0
      // 182: bipush -1
      // 183: putfield com/finalshell/core/U9.z I
      // 186: bipush 0
      // 187: ireturn
      // 188: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: iload 4
      // 18e: iload 2
      // 18f: ifeq 355
      // 192: sipush 7800
      // 195: ldc2_w 5201320676148134657
      // 198: invokestatic com/finalshell/core/U9.a (IJ)I
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: if_icmpne 34f
      // 1a5: aload 0
      // 1a6: aload 0
      // 1a7: getfield com/finalshell/core/U9.d I
      // 1aa: iload 3
      // 1ab: iadd
      // 1ac: invokevirtual com/finalshell/core/U9.C (I)C
      // 1af: iload 2
      // 1b0: ifeq 355
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: sipush 25252
      // 1bd: ldc2_w 2256381802227974060
      // 1c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c3: if_icmpne 34f
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: aload 0
      // 1cf: getfield com/finalshell/core/U9.d I
      // 1d2: iload 3
      // 1d3: iadd
      // 1d4: bipush 1
      // 1d5: iadd
      // 1d6: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d9: iload 2
      // 1da: ifeq 355
      // 1dd: goto 1e4
      // 1e0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: sipush 7325
      // 1e7: ldc2_w 7975301603790307833
      // 1ea: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ed: if_icmpne 34f
      // 1f0: goto 1f7
      // 1f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f6: athrow
      // 1f7: aload 0
      // 1f8: aload 0
      // 1f9: getfield com/finalshell/core/U9.d I
      // 1fc: iload 3
      // 1fd: iadd
      // 1fe: bipush 2
      // 1ff: iadd
      // 200: invokevirtual com/finalshell/core/U9.C (I)C
      // 203: iload 2
      // 204: ifeq 355
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: sipush 7325
      // 211: ldc2_w 7975301603790307833
      // 214: invokestatic com/finalshell/core/U9.a (IJ)I
      // 217: if_icmpne 34f
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: aload 0
      // 222: sipush 19103
      // 225: ldc2_w 2592984034142099420
      // 228: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22b: putfield com/finalshell/core/U9.z I
      // 22e: bipush 0
      // 22f: istore 7
      // 231: iinc 3 3
      // 234: aload 0
      // 235: aload 0
      // 236: getfield com/finalshell/core/U9.d I
      // 239: iload 3
      // 23a: iinc 3 1
      // 23d: iadd
      // 23e: invokevirtual com/finalshell/core/U9.C (I)C
      // 241: istore 4
      // 243: iload 5
      // 245: iload 2
      // 246: ifeq 284
      // 249: ifeq 282
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: iload 4
      // 255: sipush 26107
      // 258: ldc2_w 2081374444732725480
      // 25b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25e: iload 2
      // 25f: ifeq 28d
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: if_icmpne 282
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: aload 0
      // 274: aload 0
      // 275: getfield com/finalshell/core/U9.d I
      // 278: iload 3
      // 279: iinc 3 1
      // 27c: iadd
      // 27d: invokevirtual com/finalshell/core/U9.C (I)C
      // 280: istore 4
      // 282: iload 4
      // 284: sipush 26927
      // 287: ldc2_w 6101958691031889140
      // 28a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28d: if_icmpne 2d2
      // 290: aload 0
      // 291: dup
      // 292: getfield com/finalshell/core/U9.d I
      // 295: iload 3
      // 296: iadd
      // 297: putfield com/finalshell/core/U9.d I
      // 29a: aload 0
      // 29b: aload 0
      // 29c: aload 0
      // 29d: getfield com/finalshell/core/U9.d I
      // 2a0: invokevirtual com/finalshell/core/U9.C (I)C
      // 2a3: putfield com/finalshell/core/U9.l C
      // 2a6: aload 0
      // 2a7: sipush 19103
      // 2aa: ldc2_w 2592984034142099420
      // 2ad: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b0: putfield com/finalshell/core/U9.z I
      // 2b3: aload 0
      // 2b4: sipush 9361
      // 2b7: ldc2_w 2488456831667599749
      // 2ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bd: putfield com/finalshell/core/U9.Y I
      // 2c0: iload 7
      // 2c2: iload 2
      // 2c3: ifeq 2d4
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: ireturn
      // 2ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d1: athrow
      // 2d2: iload 4
      // 2d4: iload 2
      // 2d5: ifeq 327
      // 2d8: sipush 30337
      // 2db: ldc2_w 2029800848590515112
      // 2de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e1: if_icmpne 322
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: aload 0
      // 2ec: dup
      // 2ed: getfield com/finalshell/core/U9.d I
      // 2f0: iload 3
      // 2f1: iadd
      // 2f2: putfield com/finalshell/core/U9.d I
      // 2f5: aload 0
      // 2f6: aload 0
      // 2f7: aload 0
      // 2f8: getfield com/finalshell/core/U9.d I
      // 2fb: invokevirtual com/finalshell/core/U9.C (I)C
      // 2fe: putfield com/finalshell/core/U9.l C
      // 301: aload 0
      // 302: sipush 19103
      // 305: ldc2_w 2592984034142099420
      // 308: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30b: putfield com/finalshell/core/U9.z I
      // 30e: aload 0
      // 30f: sipush 9145
      // 312: ldc2_w 6577731744871808687
      // 315: invokestatic com/finalshell/core/U9.a (IJ)I
      // 318: putfield com/finalshell/core/U9.Y I
      // 31b: iload 7
      // 31d: ireturn
      // 31e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 321: athrow
      // 322: iload 4
      // 324: invokestatic com/finalshell/core/U9.Y (C)Z
      // 327: iload 2
      // 328: ifeq 34e
      // 32b: ifeq 348
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 334: athrow
      // 335: aload 0
      // 336: aload 0
      // 337: getfield com/finalshell/core/U9.d I
      // 33a: iload 3
      // 33b: iinc 3 1
      // 33e: iadd
      // 33f: invokevirtual com/finalshell/core/U9.C (I)C
      // 342: istore 4
      // 344: iload 2
      // 345: ifne 282
      // 348: aload 0
      // 349: bipush -1
      // 34a: putfield com/finalshell/core/U9.z I
      // 34d: bipush 0
      // 34e: ireturn
      // 34f: aload 0
      // 350: bipush -1
      // 351: putfield com/finalshell/core/U9.z I
      // 354: bipush 0
      // 355: ireturn
      // 356: iload 4
      // 358: iload 1
      // 359: if_icmpne 3be
      // 35c: aload 0
      // 35d: dup
      // 35e: getfield com/finalshell/core/U9.d I
      // 361: iload 3
      // 362: iadd
      // 363: putfield com/finalshell/core/U9.d I
      // 366: aload 0
      // 367: aload 0
      // 368: aload 0
      // 369: getfield com/finalshell/core/U9.d I
      // 36c: invokevirtual com/finalshell/core/U9.C (I)C
      // 36f: putfield com/finalshell/core/U9.l C
      // 372: aload 0
      // 373: sipush 5887
      // 376: ldc2_w 3467391210321595353
      // 379: invokestatic com/finalshell/core/U9.a (IJ)I
      // 37c: putfield com/finalshell/core/U9.z I
      // 37f: aload 0
      // 380: sipush 9361
      // 383: ldc2_w 2488456831667599749
      // 386: invokestatic com/finalshell/core/U9.a (IJ)I
      // 389: putfield com/finalshell/core/U9.Y I
      // 38c: iload 6
      // 38e: iload 2
      // 38f: ifeq 3c3
      // 392: goto 399
      // 395: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 398: athrow
      // 399: iload 2
      // 39a: ifeq 3b8
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: ifeq 3bb
      // 3a7: goto 3ae
      // 3aa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ad: athrow
      // 3ae: iload 7
      // 3b0: ineg
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: goto 3bd
      // 3bb: iload 7
      // 3bd: ireturn
      // 3be: iload 4
      // 3c0: invokestatic com/finalshell/core/U9.Y (C)Z
      // 3c3: iload 2
      // 3c4: ifeq 3eb
      // 3c7: ifeq 3e4
      // 3ca: goto 3d1
      // 3cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d0: athrow
      // 3d1: aload 0
      // 3d2: aload 0
      // 3d3: getfield com/finalshell/core/U9.d I
      // 3d6: iload 3
      // 3d7: iinc 3 1
      // 3da: iadd
      // 3db: invokevirtual com/finalshell/core/U9.C (I)C
      // 3de: istore 4
      // 3e0: iload 2
      // 3e1: ifne 356
      // 3e4: aload 0
      // 3e5: bipush -1
      // 3e6: putfield com/finalshell/core/U9.z I
      // 3e9: iload 6
      // 3eb: iload 2
      // 3ec: ifeq 403
      // 3ef: ifeq 406
      // 3f2: goto 3f9
      // 3f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f8: athrow
      // 3f9: iload 7
      // 3fb: ineg
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: goto 408
      // 406: iload 7
      // 408: ireturn
   }

   public boolean c(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: bipush 0
      // 02a: ireturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: sipush 2974
      // 046: ldc2_w 7517364692915017364
      // 049: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04c: iload 2
      // 04d: ifne 112
      // 050: if_icmpne 0f5
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: aload 0
      // 05c: getfield com/finalshell/core/U9.d I
      // 05f: iload 3
      // 060: iinc 3 1
      // 063: iadd
      // 064: invokevirtual com/finalshell/core/U9.C (I)C
      // 067: sipush 24249
      // 06a: ldc2_w 8775186783408882680
      // 06d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 070: iload 2
      // 071: ifne 0a6
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: if_icmpeq 090
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 0
      // 086: bipush -1
      // 087: putfield com/finalshell/core/U9.z I
      // 08a: bipush 0
      // 08b: ireturn
      // 08c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 0
      // 091: aload 0
      // 092: getfield com/finalshell/core/U9.d I
      // 095: iload 3
      // 096: iinc 3 1
      // 099: iadd
      // 09a: invokevirtual com/finalshell/core/U9.C (I)C
      // 09d: sipush 25252
      // 0a0: ldc2_w 2256381802227974060
      // 0a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a6: iload 2
      // 0a7: ifne 0e0
      // 0aa: if_icmpeq 0bf
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: bipush -1
      // 0b6: putfield com/finalshell/core/U9.z I
      // 0b9: bipush 0
      // 0ba: ireturn
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: aload 0
      // 0c1: getfield com/finalshell/core/U9.d I
      // 0c4: iload 3
      // 0c5: iinc 3 1
      // 0c8: iadd
      // 0c9: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cc: iload 2
      // 0cd: ifne 0ef
      // 0d0: sipush 16831
      // 0d3: ldc2_w 1205696545576721607
      // 0d6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: if_icmpeq 0ee
      // 0e3: aload 0
      // 0e4: bipush -1
      // 0e5: putfield com/finalshell/core/U9.z I
      // 0e8: bipush 0
      // 0e9: ireturn
      // 0ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: bipush 1
      // 0ef: istore 5
      // 0f1: iload 2
      // 0f2: ifeq 1ed
      // 0f5: iload 4
      // 0f7: iload 2
      // 0f8: ifne 1ec
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: sipush 23709
      // 105: ldc2_w 6885726342037307881
      // 108: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: if_icmpne 1df
      // 115: aload 0
      // 116: aload 0
      // 117: getfield com/finalshell/core/U9.d I
      // 11a: iload 3
      // 11b: iinc 3 1
      // 11e: iadd
      // 11f: invokevirtual com/finalshell/core/U9.C (I)C
      // 122: sipush 31880
      // 125: ldc2_w 6345766455927677411
      // 128: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12b: iload 2
      // 12c: ifne 161
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: if_icmpeq 14b
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: aload 0
      // 141: bipush -1
      // 142: putfield com/finalshell/core/U9.z I
      // 145: bipush 0
      // 146: ireturn
      // 147: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 0
      // 14c: aload 0
      // 14d: getfield com/finalshell/core/U9.d I
      // 150: iload 3
      // 151: iinc 3 1
      // 154: iadd
      // 155: invokevirtual com/finalshell/core/U9.C (I)C
      // 158: sipush 7325
      // 15b: ldc2_w 7975301603790307833
      // 15e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 161: iload 2
      // 162: ifne 190
      // 165: if_icmpeq 17a
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 0
      // 170: bipush -1
      // 171: putfield com/finalshell/core/U9.z I
      // 174: bipush 0
      // 175: ireturn
      // 176: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: aload 0
      // 17b: aload 0
      // 17c: getfield com/finalshell/core/U9.d I
      // 17f: iload 3
      // 180: iinc 3 1
      // 183: iadd
      // 184: invokevirtual com/finalshell/core/U9.C (I)C
      // 187: sipush 18553
      // 18a: ldc2_w 4201120391641765129
      // 18d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 190: iload 2
      // 191: ifne 1ca
      // 194: if_icmpeq 1a9
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: aload 0
      // 19f: bipush -1
      // 1a0: putfield com/finalshell/core/U9.z I
      // 1a3: bipush 0
      // 1a4: ireturn
      // 1a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: getfield com/finalshell/core/U9.d I
      // 1ae: iload 3
      // 1af: iinc 3 1
      // 1b2: iadd
      // 1b3: invokevirtual com/finalshell/core/U9.C (I)C
      // 1b6: iload 2
      // 1b7: ifne 1d9
      // 1ba: sipush 16831
      // 1bd: ldc2_w 1205696545576721607
      // 1c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: if_icmpeq 1d8
      // 1cd: aload 0
      // 1ce: bipush -1
      // 1cf: putfield com/finalshell/core/U9.z I
      // 1d2: bipush 0
      // 1d3: ireturn
      // 1d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: bipush 0
      // 1d9: istore 5
      // 1db: iload 2
      // 1dc: ifeq 1ed
      // 1df: aload 0
      // 1e0: bipush -1
      // 1e1: putfield com/finalshell/core/U9.z I
      // 1e4: bipush 0
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: ireturn
      // 1ed: aload 0
      // 1ee: aload 0
      // 1ef: getfield com/finalshell/core/U9.d I
      // 1f2: iload 3
      // 1f3: iinc 3 1
      // 1f6: iadd
      // 1f7: invokevirtual com/finalshell/core/U9.C (I)C
      // 1fa: istore 4
      // 1fc: iload 4
      // 1fe: sipush 26927
      // 201: ldc2_w 6101958691031889140
      // 204: invokestatic com/finalshell/core/U9.a (IJ)I
      // 207: iload 2
      // 208: ifne 262
      // 20b: if_icmpne 24c
      // 20e: goto 215
      // 211: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: aload 0
      // 216: dup
      // 217: getfield com/finalshell/core/U9.d I
      // 21a: iload 3
      // 21b: iadd
      // 21c: putfield com/finalshell/core/U9.d I
      // 21f: aload 0
      // 220: aload 0
      // 221: aload 0
      // 222: getfield com/finalshell/core/U9.d I
      // 225: invokevirtual com/finalshell/core/U9.C (I)C
      // 228: putfield com/finalshell/core/U9.l C
      // 22b: aload 0
      // 22c: sipush 5887
      // 22f: ldc2_w 3467391210321595353
      // 232: invokestatic com/finalshell/core/U9.a (IJ)I
      // 235: putfield com/finalshell/core/U9.z I
      // 238: aload 0
      // 239: sipush 9361
      // 23c: ldc2_w 2488456831667599749
      // 23f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 242: putfield com/finalshell/core/U9.Y I
      // 245: iload 5
      // 247: ireturn
      // 248: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24b: athrow
      // 24c: iload 4
      // 24e: iload 2
      // 24f: ifne 3d4
      // 252: sipush 4784
      // 255: ldc2_w 3082167687830622095
      // 258: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25b: goto 262
      // 25e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: if_icmpne 3c7
      // 265: aload 0
      // 266: aload 0
      // 267: getfield com/finalshell/core/U9.d I
      // 26a: iload 3
      // 26b: iinc 3 1
      // 26e: iadd
      // 26f: invokevirtual com/finalshell/core/U9.C (I)C
      // 272: istore 4
      // 274: iload 4
      // 276: sipush 26927
      // 279: ldc2_w 6101958691031889140
      // 27c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27f: iload 2
      // 280: ifne 2cd
      // 283: if_icmpne 2bb
      // 286: goto 28d
      // 289: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: aload 0
      // 28e: sipush 9361
      // 291: ldc2_w 2488456831667599749
      // 294: invokestatic com/finalshell/core/U9.a (IJ)I
      // 297: putfield com/finalshell/core/U9.Y I
      // 29a: aload 0
      // 29b: dup
      // 29c: getfield com/finalshell/core/U9.d I
      // 29f: iload 3
      // 2a0: iadd
      // 2a1: putfield com/finalshell/core/U9.d I
      // 2a4: aload 0
      // 2a5: aload 0
      // 2a6: aload 0
      // 2a7: getfield com/finalshell/core/U9.d I
      // 2aa: invokevirtual com/finalshell/core/U9.C (I)C
      // 2ad: putfield com/finalshell/core/U9.l C
      // 2b0: iload 2
      // 2b1: ifeq 3b6
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: iload 4
      // 2bd: sipush 30337
      // 2c0: ldc2_w 2029800848590515112
      // 2c3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: iload 2
      // 2ce: ifne 31b
      // 2d1: if_icmpne 309
      // 2d4: goto 2db
      // 2d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2da: athrow
      // 2db: aload 0
      // 2dc: sipush 9145
      // 2df: ldc2_w 6577731744871808687
      // 2e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e5: putfield com/finalshell/core/U9.Y I
      // 2e8: aload 0
      // 2e9: dup
      // 2ea: getfield com/finalshell/core/U9.d I
      // 2ed: iload 3
      // 2ee: iadd
      // 2ef: putfield com/finalshell/core/U9.d I
      // 2f2: aload 0
      // 2f3: aload 0
      // 2f4: aload 0
      // 2f5: getfield com/finalshell/core/U9.d I
      // 2f8: invokevirtual com/finalshell/core/U9.C (I)C
      // 2fb: putfield com/finalshell/core/U9.l C
      // 2fe: iload 2
      // 2ff: ifeq 3b6
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: iload 4
      // 30b: sipush 4784
      // 30e: ldc2_w 3082167687830622095
      // 311: invokestatic com/finalshell/core/U9.a (IJ)I
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31a: athrow
      // 31b: iload 2
      // 31c: ifne 374
      // 31f: if_icmpne 357
      // 322: goto 329
      // 325: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: aload 0
      // 32a: sipush 16923
      // 32d: ldc2_w 1571494982232874791
      // 330: invokestatic com/finalshell/core/U9.a (IJ)I
      // 333: putfield com/finalshell/core/U9.Y I
      // 336: aload 0
      // 337: dup
      // 338: getfield com/finalshell/core/U9.d I
      // 33b: iload 3
      // 33c: iadd
      // 33d: putfield com/finalshell/core/U9.d I
      // 340: aload 0
      // 341: aload 0
      // 342: aload 0
      // 343: getfield com/finalshell/core/U9.d I
      // 346: invokevirtual com/finalshell/core/U9.C (I)C
      // 349: putfield com/finalshell/core/U9.l C
      // 34c: iload 2
      // 34d: ifeq 3b6
      // 350: goto 357
      // 353: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 356: athrow
      // 357: iload 4
      // 359: iload 2
      // 35a: ifne 3b5
      // 35d: goto 364
      // 360: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: sipush 2765
      // 367: ldc2_w 8216137057917720563
      // 36a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 36d: goto 374
      // 370: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 373: athrow
      // 374: if_icmpne 3a8
      // 377: aload 0
      // 378: sipush 9907
      // 37b: ldc2_w 514190805586246625
      // 37e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 381: putfield com/finalshell/core/U9.Y I
      // 384: aload 0
      // 385: dup
      // 386: getfield com/finalshell/core/U9.d I
      // 389: iload 3
      // 38a: bipush 1
      // 38b: isub
      // 38c: iadd
      // 38d: putfield com/finalshell/core/U9.d I
      // 390: aload 0
      // 391: sipush 2765
      // 394: ldc2_w 8216137057917720563
      // 397: invokestatic com/finalshell/core/U9.a (IJ)I
      // 39a: putfield com/finalshell/core/U9.l C
      // 39d: iload 2
      // 39e: ifeq 3b6
      // 3a1: goto 3a8
      // 3a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a7: athrow
      // 3a8: aload 0
      // 3a9: bipush -1
      // 3aa: putfield com/finalshell/core/U9.z I
      // 3ad: bipush 0
      // 3ae: goto 3b5
      // 3b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b4: athrow
      // 3b5: ireturn
      // 3b6: aload 0
      // 3b7: sipush 2897
      // 3ba: ldc2_w 695568451002816123
      // 3bd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c0: putfield com/finalshell/core/U9.z I
      // 3c3: iload 2
      // 3c4: ifeq 3d5
      // 3c7: aload 0
      // 3c8: bipush -1
      // 3c9: putfield com/finalshell/core/U9.z I
      // 3cc: bipush 0
      // 3cd: goto 3d4
      // 3d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d3: athrow
      // 3d4: ireturn
      // 3d5: iload 5
      // 3d7: ireturn
   }

   public long G(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 9860
      // 020: ldc2_w 1322974969826802615
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: lconst_0
      // 02a: lreturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: bipush 0
      // 042: istore 5
      // 044: iload 4
      // 046: sipush 19418
      // 049: ldc2_w 715321441499911916
      // 04c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04f: iload 2
      // 050: ifne 07a
      // 053: if_icmpne 06f
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 0
      // 05f: getfield com/finalshell/core/U9.d I
      // 062: iload 3
      // 063: iinc 3 1
      // 066: iadd
      // 067: invokevirtual com/finalshell/core/U9.C (I)C
      // 06a: istore 4
      // 06c: bipush 1
      // 06d: istore 5
      // 06f: iload 4
      // 071: sipush 21259
      // 074: ldc2_w 1287927339301015045
      // 077: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07a: iload 2
      // 07b: ifne 09a
      // 07e: if_icmplt 1d1
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: iload 4
      // 08a: sipush 24153
      // 08d: ldc2_w 3168790736949871469
      // 090: invokestatic com/finalshell/core/U9.a (IJ)I
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: iload 2
      // 09b: ifne 0ba
      // 09e: if_icmpgt 1d1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: iload 4
      // 0aa: sipush 21259
      // 0ad: ldc2_w 1287927339301015045
      // 0b0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: isub
      // 0bb: i2l
      // 0bc: lstore 6
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/U9.d I
      // 0c3: iload 3
      // 0c4: iinc 3 1
      // 0c7: iadd
      // 0c8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: sipush 21259
      // 0d2: ldc2_w 1287927339301015045
      // 0d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d8: if_icmplt 11f
      // 0db: iload 4
      // 0dd: sipush 24153
      // 0e0: ldc2_w 3168790736949871469
      // 0e3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e6: iload 2
      // 0e7: ifne 12a
      // 0ea: iload 2
      // 0eb: ifne 12a
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: if_icmpgt 11f
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: lload 6
      // 101: sipush 3395
      // 104: ldc2_w 2174368042043745818
      // 107: invokestatic com/finalshell/core/U9.c (IJ)J
      // 10a: lmul
      // 10b: iload 4
      // 10d: sipush 21259
      // 110: ldc2_w 1287927339301015045
      // 113: invokestatic com/finalshell/core/U9.a (IJ)I
      // 116: isub
      // 117: i2l
      // 118: ladd
      // 119: lstore 6
      // 11b: iload 2
      // 11c: ifeq 0be
      // 11f: iload 4
      // 121: sipush 19110
      // 124: ldc2_w 4854799824381581179
      // 127: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12a: iload 2
      // 12b: ifne 15b
      // 12e: if_icmpne 143
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 0
      // 139: bipush -1
      // 13a: putfield com/finalshell/core/U9.z I
      // 13d: lconst_0
      // 13e: lreturn
      // 13f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: iload 3
      // 144: aload 1
      // 145: arraylength
      // 146: isub
      // 147: iload 2
      // 148: ifne 169
      // 14b: sipush 7609
      // 14e: ldc2_w 8745918760387363013
      // 151: invokestatic com/finalshell/core/U9.a (IJ)I
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: if_icmpge 1ac
      // 15e: lload 6
      // 160: lconst_0
      // 161: lcmp
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: iload 2
      // 16a: ifne 1a9
      // 16d: ifge 1a8
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: lload 6
      // 179: sipush 25403
      // 17c: ldc2_w 8238026159827273832
      // 17f: invokestatic com/finalshell/core/U9.c (IJ)J
      // 182: lcmp
      // 183: iload 2
      // 184: ifne 19a
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: ifne 1ac
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: iload 5
      // 19a: iload 2
      // 19b: ifne 1a9
      // 19e: ifeq 1ac
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: bipush 1
      // 1a9: goto 1ad
      // 1ac: bipush 0
      // 1ad: istore 8
      // 1af: iload 2
      // 1b0: ifne 1cb
      // 1b3: iload 8
      // 1b5: ifne 1cd
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: bipush -1
      // 1c1: putfield com/finalshell/core/U9.z I
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: lconst_0
      // 1cc: lreturn
      // 1cd: iload 2
      // 1ce: ifeq 1dc
      // 1d1: aload 0
      // 1d2: bipush -1
      // 1d3: putfield com/finalshell/core/U9.z I
      // 1d6: lconst_0
      // 1d7: lreturn
      // 1d8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1db: athrow
      // 1dc: iload 4
      // 1de: sipush 26927
      // 1e1: ldc2_w 6101958691031889140
      // 1e4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e7: iload 2
      // 1e8: ifne 249
      // 1eb: if_icmpne 23e
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: dup
      // 1f7: getfield com/finalshell/core/U9.d I
      // 1fa: iload 3
      // 1fb: iadd
      // 1fc: putfield com/finalshell/core/U9.d I
      // 1ff: aload 0
      // 200: aload 0
      // 201: aload 0
      // 202: getfield com/finalshell/core/U9.d I
      // 205: invokevirtual com/finalshell/core/U9.C (I)C
      // 208: putfield com/finalshell/core/U9.l C
      // 20b: aload 0
      // 20c: sipush 5887
      // 20f: ldc2_w 3467391210321595353
      // 212: invokestatic com/finalshell/core/U9.a (IJ)I
      // 215: putfield com/finalshell/core/U9.z I
      // 218: aload 0
      // 219: sipush 9361
      // 21c: ldc2_w 2488456831667599749
      // 21f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 222: putfield com/finalshell/core/U9.Y I
      // 225: iload 5
      // 227: ifeq 23b
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: lload 6
      // 233: lneg
      // 234: goto 23d
      // 237: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: lload 6
      // 23d: lreturn
      // 23e: iload 4
      // 240: sipush 4784
      // 243: ldc2_w 3082167687830622095
      // 246: invokestatic com/finalshell/core/U9.a (IJ)I
      // 249: iload 2
      // 24a: ifne 271
      // 24d: if_icmpne 3ab
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: aload 0
      // 258: aload 0
      // 259: getfield com/finalshell/core/U9.d I
      // 25c: iload 3
      // 25d: iinc 3 1
      // 260: iadd
      // 261: invokevirtual com/finalshell/core/U9.C (I)C
      // 264: istore 4
      // 266: iload 4
      // 268: sipush 26927
      // 26b: ldc2_w 6101958691031889140
      // 26e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 271: iload 2
      // 272: ifne 2bf
      // 275: if_icmpne 2ad
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: aload 0
      // 280: sipush 9361
      // 283: ldc2_w 2488456831667599749
      // 286: invokestatic com/finalshell/core/U9.a (IJ)I
      // 289: putfield com/finalshell/core/U9.Y I
      // 28c: aload 0
      // 28d: dup
      // 28e: getfield com/finalshell/core/U9.d I
      // 291: iload 3
      // 292: iadd
      // 293: putfield com/finalshell/core/U9.d I
      // 296: aload 0
      // 297: aload 0
      // 298: aload 0
      // 299: getfield com/finalshell/core/U9.d I
      // 29c: invokevirtual com/finalshell/core/U9.C (I)C
      // 29f: putfield com/finalshell/core/U9.l C
      // 2a2: iload 2
      // 2a3: ifeq 39a
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: iload 4
      // 2af: sipush 30337
      // 2b2: ldc2_w 2029800848590515112
      // 2b5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: iload 2
      // 2c0: ifne 30d
      // 2c3: if_icmpne 2fb
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: aload 0
      // 2ce: sipush 9145
      // 2d1: ldc2_w 6577731744871808687
      // 2d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d7: putfield com/finalshell/core/U9.Y I
      // 2da: aload 0
      // 2db: dup
      // 2dc: getfield com/finalshell/core/U9.d I
      // 2df: iload 3
      // 2e0: iadd
      // 2e1: putfield com/finalshell/core/U9.d I
      // 2e4: aload 0
      // 2e5: aload 0
      // 2e6: aload 0
      // 2e7: getfield com/finalshell/core/U9.d I
      // 2ea: invokevirtual com/finalshell/core/U9.C (I)C
      // 2ed: putfield com/finalshell/core/U9.l C
      // 2f0: iload 2
      // 2f1: ifeq 39a
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: iload 4
      // 2fd: sipush 4784
      // 300: ldc2_w 3082167687830622095
      // 303: invokestatic com/finalshell/core/U9.a (IJ)I
      // 306: goto 30d
      // 309: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30c: athrow
      // 30d: iload 2
      // 30e: ifne 35b
      // 311: if_icmpne 349
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31a: athrow
      // 31b: aload 0
      // 31c: sipush 16923
      // 31f: ldc2_w 1571494982232874791
      // 322: invokestatic com/finalshell/core/U9.a (IJ)I
      // 325: putfield com/finalshell/core/U9.Y I
      // 328: aload 0
      // 329: dup
      // 32a: getfield com/finalshell/core/U9.d I
      // 32d: iload 3
      // 32e: iadd
      // 32f: putfield com/finalshell/core/U9.d I
      // 332: aload 0
      // 333: aload 0
      // 334: aload 0
      // 335: getfield com/finalshell/core/U9.d I
      // 338: invokevirtual com/finalshell/core/U9.C (I)C
      // 33b: putfield com/finalshell/core/U9.l C
      // 33e: iload 2
      // 33f: ifeq 39a
      // 342: goto 349
      // 345: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: iload 4
      // 34b: sipush 2765
      // 34e: ldc2_w 8216137057917720563
      // 351: invokestatic com/finalshell/core/U9.a (IJ)I
      // 354: goto 35b
      // 357: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: if_icmpne 38f
      // 35e: aload 0
      // 35f: sipush 15328
      // 362: ldc2_w 2987394968101676733
      // 365: invokestatic com/finalshell/core/U9.a (IJ)I
      // 368: putfield com/finalshell/core/U9.Y I
      // 36b: aload 0
      // 36c: dup
      // 36d: getfield com/finalshell/core/U9.d I
      // 370: iload 3
      // 371: bipush 1
      // 372: isub
      // 373: iadd
      // 374: putfield com/finalshell/core/U9.d I
      // 377: aload 0
      // 378: sipush 2765
      // 37b: ldc2_w 8216137057917720563
      // 37e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 381: putfield com/finalshell/core/U9.l C
      // 384: iload 2
      // 385: ifeq 39a
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: aload 0
      // 390: bipush -1
      // 391: putfield com/finalshell/core/U9.z I
      // 394: lconst_0
      // 395: lreturn
      // 396: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 399: athrow
      // 39a: aload 0
      // 39b: sipush 11246
      // 39e: ldc2_w 6769911336749168273
      // 3a1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a4: putfield com/finalshell/core/U9.z I
      // 3a7: iload 2
      // 3a8: ifeq 3b6
      // 3ab: aload 0
      // 3ac: bipush -1
      // 3ad: putfield com/finalshell/core/U9.z I
      // 3b0: lconst_0
      // 3b1: lreturn
      // 3b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b5: athrow
      // 3b6: iload 5
      // 3b8: ifeq 3c5
      // 3bb: lload 6
      // 3bd: lneg
      // 3be: goto 3c7
      // 3c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c4: athrow
      // 3c5: lload 6
      // 3c7: lreturn
   }

   @Override
   public long a(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: bipush 0
      // 00a: istore 3
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: iload 2
      // 01d: ifeq 03b
      // 020: sipush 26107
      // 023: ldc2_w 2081374444732725480
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: iload 2
      // 044: ifeq 062
      // 047: ifeq 060
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield com/finalshell/core/U9.d I
      // 056: iload 3
      // 057: iinc 3 1
      // 05a: iadd
      // 05b: invokevirtual com/finalshell/core/U9.C (I)C
      // 05e: istore 4
      // 060: iload 4
      // 062: iload 2
      // 063: ifeq 081
      // 066: sipush 19418
      // 069: ldc2_w 715321441499911916
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: if_icmpne 084
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: goto 085
      // 084: bipush 0
      // 085: istore 6
      // 087: iload 6
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: ifeq 0a6
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/U9.d I
      // 09c: iload 3
      // 09d: iinc 3 1
      // 0a0: iadd
      // 0a1: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a4: istore 4
      // 0a6: iload 4
      // 0a8: sipush 21259
      // 0ab: ldc2_w 1287927339301015045
      // 0ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b1: iload 2
      // 0b2: ifeq 1ef
      // 0b5: if_icmplt 1dd
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: sipush 24153
      // 0c4: ldc2_w 3168790736949871469
      // 0c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ca: iload 2
      // 0cb: ifeq 1ef
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: if_icmpgt 1dd
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: iload 4
      // 0e1: sipush 21259
      // 0e4: ldc2_w 1287927339301015045
      // 0e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ea: isub
      // 0eb: i2l
      // 0ec: lstore 7
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/U9.d I
      // 0f3: iload 3
      // 0f4: iinc 3 1
      // 0f7: iadd
      // 0f8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0fb: istore 4
      // 0fd: iload 4
      // 0ff: sipush 21259
      // 102: ldc2_w 1287927339301015045
      // 105: invokestatic com/finalshell/core/U9.a (IJ)I
      // 108: if_icmplt 14f
      // 10b: iload 4
      // 10d: sipush 24153
      // 110: ldc2_w 3168790736949871469
      // 113: invokestatic com/finalshell/core/U9.a (IJ)I
      // 116: iload 2
      // 117: ifeq 165
      // 11a: iload 2
      // 11b: ifeq 165
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: if_icmpgt 14f
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: lload 7
      // 131: sipush 3395
      // 134: ldc2_w 2174368042043745818
      // 137: invokestatic com/finalshell/core/U9.c (IJ)J
      // 13a: lmul
      // 13b: iload 4
      // 13d: sipush 21259
      // 140: ldc2_w 1287927339301015045
      // 143: invokestatic com/finalshell/core/U9.a (IJ)I
      // 146: isub
      // 147: i2l
      // 148: ladd
      // 149: lstore 7
      // 14b: iload 2
      // 14c: ifne 0ee
      // 14f: iload 4
      // 151: iload 2
      // 152: ifeq 177
      // 155: sipush 19110
      // 158: ldc2_w 4854799824381581179
      // 15b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: if_icmpne 173
      // 168: aload 0
      // 169: bipush -1
      // 16a: putfield com/finalshell/core/U9.z I
      // 16d: lconst_0
      // 16e: lreturn
      // 16f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: lload 7
      // 175: lconst_0
      // 176: lcmp
      // 177: iload 2
      // 178: ifeq 1b7
      // 17b: ifge 1b6
      // 17e: goto 185
      // 181: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: lload 7
      // 187: sipush 25403
      // 18a: ldc2_w 8238026159827273832
      // 18d: invokestatic com/finalshell/core/U9.c (IJ)J
      // 190: lcmp
      // 191: iload 2
      // 192: ifeq 1a8
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: ifne 1ba
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: iload 6
      // 1a8: iload 2
      // 1a9: ifeq 1b7
      // 1ac: ifeq 1ba
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: bipush 1
      // 1b7: goto 1bb
      // 1ba: bipush 0
      // 1bb: istore 9
      // 1bd: iload 9
      // 1bf: ifne 1d9
      // 1c2: aload 0
      // 1c3: aload 0
      // 1c4: getfield com/finalshell/core/U9.d I
      // 1c7: iload 3
      // 1c8: bipush 1
      // 1c9: isub
      // 1ca: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 1cd: astore 10
      // 1cf: new java/lang/NumberFormatException
      // 1d2: dup
      // 1d3: aload 10
      // 1d5: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 1d8: athrow
      // 1d9: iload 2
      // 1da: ifne 3b5
      // 1dd: iload 4
      // 1df: sipush 7800
      // 1e2: ldc2_w 5201320676148134657
      // 1e5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: iload 2
      // 1f0: ifeq 222
      // 1f3: if_icmpne 3ae
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: aload 0
      // 1ff: getfield com/finalshell/core/U9.d I
      // 202: iload 3
      // 203: iadd
      // 204: iload 2
      // 205: ifeq 3b0
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: invokevirtual com/finalshell/core/U9.C (I)C
      // 212: sipush 25252
      // 215: ldc2_w 2256381802227974060
      // 218: invokestatic com/finalshell/core/U9.a (IJ)I
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: if_icmpne 3ae
      // 225: aload 0
      // 226: aload 0
      // 227: getfield com/finalshell/core/U9.d I
      // 22a: iload 3
      // 22b: iadd
      // 22c: bipush 1
      // 22d: iadd
      // 22e: iload 2
      // 22f: ifeq 3b0
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: invokevirtual com/finalshell/core/U9.C (I)C
      // 23c: sipush 7325
      // 23f: ldc2_w 7975301603790307833
      // 242: invokestatic com/finalshell/core/U9.a (IJ)I
      // 245: if_icmpne 3ae
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24e: athrow
      // 24f: aload 0
      // 250: aload 0
      // 251: getfield com/finalshell/core/U9.d I
      // 254: iload 3
      // 255: iadd
      // 256: bipush 2
      // 257: iadd
      // 258: iload 2
      // 259: ifeq 3b0
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: invokevirtual com/finalshell/core/U9.C (I)C
      // 266: sipush 7325
      // 269: ldc2_w 7975301603790307833
      // 26c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26f: if_icmpne 3ae
      // 272: goto 279
      // 275: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 278: athrow
      // 279: aload 0
      // 27a: sipush 19103
      // 27d: ldc2_w 2592984034142099420
      // 280: invokestatic com/finalshell/core/U9.a (IJ)I
      // 283: putfield com/finalshell/core/U9.z I
      // 286: lconst_0
      // 287: lstore 7
      // 289: iinc 3 3
      // 28c: aload 0
      // 28d: aload 0
      // 28e: getfield com/finalshell/core/U9.d I
      // 291: iload 3
      // 292: iinc 3 1
      // 295: iadd
      // 296: invokevirtual com/finalshell/core/U9.C (I)C
      // 299: istore 4
      // 29b: iload 5
      // 29d: iload 2
      // 29e: ifeq 2dc
      // 2a1: ifeq 2da
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: iload 4
      // 2ad: sipush 26107
      // 2b0: ldc2_w 2081374444732725480
      // 2b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b6: iload 2
      // 2b7: ifeq 2e5
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c0: athrow
      // 2c1: if_icmpne 2da
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: aload 0
      // 2cd: getfield com/finalshell/core/U9.d I
      // 2d0: iload 3
      // 2d1: iinc 3 1
      // 2d4: iadd
      // 2d5: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d8: istore 4
      // 2da: iload 4
      // 2dc: sipush 26927
      // 2df: ldc2_w 6101958691031889140
      // 2e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e5: if_icmpne 32a
      // 2e8: aload 0
      // 2e9: dup
      // 2ea: getfield com/finalshell/core/U9.d I
      // 2ed: iload 3
      // 2ee: iadd
      // 2ef: putfield com/finalshell/core/U9.d I
      // 2f2: aload 0
      // 2f3: aload 0
      // 2f4: aload 0
      // 2f5: getfield com/finalshell/core/U9.d I
      // 2f8: invokevirtual com/finalshell/core/U9.C (I)C
      // 2fb: putfield com/finalshell/core/U9.l C
      // 2fe: aload 0
      // 2ff: sipush 19103
      // 302: ldc2_w 2592984034142099420
      // 305: invokestatic com/finalshell/core/U9.a (IJ)I
      // 308: putfield com/finalshell/core/U9.z I
      // 30b: aload 0
      // 30c: sipush 9361
      // 30f: ldc2_w 2488456831667599749
      // 312: invokestatic com/finalshell/core/U9.a (IJ)I
      // 315: putfield com/finalshell/core/U9.Y I
      // 318: lload 7
      // 31a: iload 2
      // 31b: ifeq 3ad
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 324: athrow
      // 325: lreturn
      // 326: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: iload 4
      // 32c: iload 2
      // 32d: ifeq 37f
      // 330: sipush 30337
      // 333: ldc2_w 2029800848590515112
      // 336: invokestatic com/finalshell/core/U9.a (IJ)I
      // 339: if_icmpne 37a
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 342: athrow
      // 343: aload 0
      // 344: dup
      // 345: getfield com/finalshell/core/U9.d I
      // 348: iload 3
      // 349: iadd
      // 34a: putfield com/finalshell/core/U9.d I
      // 34d: aload 0
      // 34e: aload 0
      // 34f: aload 0
      // 350: getfield com/finalshell/core/U9.d I
      // 353: invokevirtual com/finalshell/core/U9.C (I)C
      // 356: putfield com/finalshell/core/U9.l C
      // 359: aload 0
      // 35a: sipush 19103
      // 35d: ldc2_w 2592984034142099420
      // 360: invokestatic com/finalshell/core/U9.a (IJ)I
      // 363: putfield com/finalshell/core/U9.z I
      // 366: aload 0
      // 367: sipush 9145
      // 36a: ldc2_w 6577731744871808687
      // 36d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 370: putfield com/finalshell/core/U9.Y I
      // 373: lload 7
      // 375: lreturn
      // 376: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 379: athrow
      // 37a: iload 4
      // 37c: invokestatic com/finalshell/core/U9.Y (C)Z
      // 37f: iload 2
      // 380: ifeq 3a1
      // 383: ifeq 3a7
      // 386: goto 38d
      // 389: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38c: athrow
      // 38d: aload 0
      // 38e: aload 0
      // 38f: getfield com/finalshell/core/U9.d I
      // 392: iload 3
      // 393: iinc 3 1
      // 396: iadd
      // 397: invokevirtual com/finalshell/core/U9.C (I)C
      // 39a: goto 3a1
      // 39d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a0: athrow
      // 3a1: istore 4
      // 3a3: iload 2
      // 3a4: ifne 2da
      // 3a7: aload 0
      // 3a8: bipush -1
      // 3a9: putfield com/finalshell/core/U9.z I
      // 3ac: lconst_0
      // 3ad: lreturn
      // 3ae: aload 0
      // 3af: bipush -1
      // 3b0: putfield com/finalshell/core/U9.z I
      // 3b3: lconst_0
      // 3b4: lreturn
      // 3b5: iload 5
      // 3b7: iload 2
      // 3b8: ifeq 401
      // 3bb: ifeq 3ff
      // 3be: goto 3c5
      // 3c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c4: athrow
      // 3c5: iload 4
      // 3c7: iload 2
      // 3c8: ifeq 3fd
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: sipush 26107
      // 3d5: ldc2_w 2081374444732725480
      // 3d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3db: if_icmpeq 3f0
      // 3de: goto 3e5
      // 3e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: aload 0
      // 3e6: bipush -1
      // 3e7: putfield com/finalshell/core/U9.z I
      // 3ea: lconst_0
      // 3eb: lreturn
      // 3ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: aload 0
      // 3f2: getfield com/finalshell/core/U9.d I
      // 3f5: iload 3
      // 3f6: iinc 3 1
      // 3f9: iadd
      // 3fa: invokevirtual com/finalshell/core/U9.C (I)C
      // 3fd: istore 4
      // 3ff: iload 4
      // 401: iload 1
      // 402: if_icmpne 459
      // 405: aload 0
      // 406: dup
      // 407: getfield com/finalshell/core/U9.d I
      // 40a: iload 3
      // 40b: iadd
      // 40c: putfield com/finalshell/core/U9.d I
      // 40f: aload 0
      // 410: aload 0
      // 411: aload 0
      // 412: getfield com/finalshell/core/U9.d I
      // 415: invokevirtual com/finalshell/core/U9.C (I)C
      // 418: putfield com/finalshell/core/U9.l C
      // 41b: aload 0
      // 41c: sipush 5887
      // 41f: ldc2_w 3467391210321595353
      // 422: invokestatic com/finalshell/core/U9.a (IJ)I
      // 425: putfield com/finalshell/core/U9.z I
      // 428: aload 0
      // 429: sipush 9361
      // 42c: ldc2_w 2488456831667599749
      // 42f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 432: putfield com/finalshell/core/U9.Y I
      // 435: iload 6
      // 437: iload 2
      // 438: ifeq 45e
      // 43b: goto 442
      // 43e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 441: athrow
      // 442: ifeq 456
      // 445: goto 44c
      // 448: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44b: athrow
      // 44c: lload 7
      // 44e: lneg
      // 44f: goto 458
      // 452: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 455: athrow
      // 456: lload 7
      // 458: lreturn
      // 459: iload 4
      // 45b: invokestatic com/finalshell/core/U9.Y (C)Z
      // 45e: iload 2
      // 45f: ifeq 480
      // 462: ifeq 486
      // 465: goto 46c
      // 468: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46b: athrow
      // 46c: aload 0
      // 46d: aload 0
      // 46e: getfield com/finalshell/core/U9.d I
      // 471: iload 3
      // 472: iinc 3 1
      // 475: iadd
      // 476: invokevirtual com/finalshell/core/U9.C (I)C
      // 479: goto 480
      // 47c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47f: athrow
      // 480: istore 4
      // 482: iload 2
      // 483: ifne 3ff
      // 486: aload 0
      // 487: bipush -1
      // 488: putfield com/finalshell/core/U9.z I
      // 48b: lload 7
      // 48d: lreturn
   }

   public final float v(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifeq 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: fconst_0
      // 02a: freturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifeq 062
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpne 065
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 1
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: goto 066
      // 065: bipush 0
      // 066: istore 5
      // 068: iload 5
      // 06a: iload 2
      // 06b: ifeq 089
      // 06e: ifeq 087
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 0
      // 07a: getfield com/finalshell/core/U9.d I
      // 07d: iload 3
      // 07e: iinc 3 1
      // 081: iadd
      // 082: invokevirtual com/finalshell/core/U9.C (I)C
      // 085: istore 4
      // 087: iload 4
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: sipush 19418
      // 090: ldc2_w 715321441499911916
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: if_icmpne 0ab
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: goto 0ac
      // 0ab: bipush 0
      // 0ac: istore 6
      // 0ae: iload 6
      // 0b0: iload 2
      // 0b1: ifeq 0cf
      // 0b4: ifeq 0cd
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/U9.d I
      // 0c3: iload 3
      // 0c4: iinc 3 1
      // 0c7: iadd
      // 0c8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: sipush 21259
      // 0d2: ldc2_w 1287927339301015045
      // 0d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d8: iload 2
      // 0d9: ifeq 460
      // 0dc: if_icmplt 44e
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: sipush 24153
      // 0eb: ldc2_w 3168790736949871469
      // 0ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f1: iload 2
      // 0f2: ifeq 460
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: if_icmpgt 44e
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: iload 4
      // 108: sipush 21259
      // 10b: ldc2_w 1287927339301015045
      // 10e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 111: isub
      // 112: i2l
      // 113: lstore 8
      // 115: aload 0
      // 116: aload 0
      // 117: getfield com/finalshell/core/U9.d I
      // 11a: iload 3
      // 11b: iinc 3 1
      // 11e: iadd
      // 11f: invokevirtual com/finalshell/core/U9.C (I)C
      // 122: istore 4
      // 124: iload 4
      // 126: sipush 21259
      // 129: ldc2_w 1287927339301015045
      // 12c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12f: if_icmplt 160
      // 132: iload 4
      // 134: sipush 24153
      // 137: ldc2_w 3168790736949871469
      // 13a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13d: if_icmpgt 160
      // 140: lload 8
      // 142: sipush 3395
      // 145: ldc2_w 2174368042043745818
      // 148: invokestatic com/finalshell/core/U9.c (IJ)J
      // 14b: lmul
      // 14c: iload 4
      // 14e: sipush 21259
      // 151: ldc2_w 1287927339301015045
      // 154: invokestatic com/finalshell/core/U9.a (IJ)I
      // 157: isub
      // 158: i2l
      // 159: ladd
      // 15a: lstore 8
      // 15c: iload 2
      // 15d: ifne 115
      // 160: lconst_1
      // 161: lstore 10
      // 163: iload 4
      // 165: iload 2
      // 166: ifeq 184
      // 169: sipush 19110
      // 16c: ldc2_w 4854799824381581179
      // 16f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 172: if_icmpne 187
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: bipush 1
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: goto 188
      // 187: bipush 0
      // 188: istore 12
      // 18a: iload 12
      // 18c: iload 2
      // 18d: ifeq 276
      // 190: ifeq 274
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 0
      // 19c: getfield com/finalshell/core/U9.d I
      // 19f: iload 3
      // 1a0: iinc 3 1
      // 1a3: iadd
      // 1a4: invokevirtual com/finalshell/core/U9.C (I)C
      // 1a7: istore 4
      // 1a9: iload 2
      // 1aa: ifeq 272
      // 1ad: iload 4
      // 1af: sipush 21259
      // 1b2: ldc2_w 1287927339301015045
      // 1b5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b8: if_icmplt 26d
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: iload 4
      // 1c4: sipush 24153
      // 1c7: ldc2_w 3168790736949871469
      // 1ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1cd: if_icmpgt 26d
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: lload 8
      // 1d9: sipush 3395
      // 1dc: ldc2_w 2174368042043745818
      // 1df: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1e2: lmul
      // 1e3: iload 4
      // 1e5: sipush 21259
      // 1e8: ldc2_w 1287927339301015045
      // 1eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ee: isub
      // 1ef: i2l
      // 1f0: ladd
      // 1f1: lstore 8
      // 1f3: sipush 3395
      // 1f6: ldc2_w 2174368042043745818
      // 1f9: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1fc: lstore 10
      // 1fe: aload 0
      // 1ff: aload 0
      // 200: getfield com/finalshell/core/U9.d I
      // 203: iload 3
      // 204: iinc 3 1
      // 207: iadd
      // 208: invokevirtual com/finalshell/core/U9.C (I)C
      // 20b: istore 4
      // 20d: iload 4
      // 20f: sipush 21259
      // 212: ldc2_w 1287927339301015045
      // 215: invokestatic com/finalshell/core/U9.a (IJ)I
      // 218: if_icmplt 274
      // 21b: iload 4
      // 21d: sipush 24153
      // 220: ldc2_w 3168790736949871469
      // 223: invokestatic com/finalshell/core/U9.a (IJ)I
      // 226: iload 2
      // 227: ifeq 28a
      // 22a: iload 2
      // 22b: ifeq 28a
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: if_icmpgt 274
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: lload 8
      // 241: sipush 3395
      // 244: ldc2_w 2174368042043745818
      // 247: invokestatic com/finalshell/core/U9.c (IJ)J
      // 24a: lmul
      // 24b: iload 4
      // 24d: sipush 21259
      // 250: ldc2_w 1287927339301015045
      // 253: invokestatic com/finalshell/core/U9.a (IJ)I
      // 256: isub
      // 257: i2l
      // 258: ladd
      // 259: lstore 8
      // 25b: lload 10
      // 25d: sipush 3395
      // 260: ldc2_w 2174368042043745818
      // 263: invokestatic com/finalshell/core/U9.c (IJ)J
      // 266: lmul
      // 267: lstore 10
      // 269: iload 2
      // 26a: ifne 1fe
      // 26d: aload 0
      // 26e: bipush -1
      // 26f: putfield com/finalshell/core/U9.z I
      // 272: fconst_0
      // 273: freturn
      // 274: iload 4
      // 276: iload 2
      // 277: ifeq 2b5
      // 27a: sipush 16831
      // 27d: ldc2_w 1205696545576721607
      // 280: invokestatic com/finalshell/core/U9.a (IJ)I
      // 283: goto 28a
      // 286: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 289: athrow
      // 28a: if_icmpeq 2ad
      // 28d: iload 4
      // 28f: iload 2
      // 290: ifeq 2b5
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: sipush 19786
      // 29d: ldc2_w 559752938502885485
      // 2a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a3: if_icmpne 2b8
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: bipush 1
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: goto 2b9
      // 2b8: bipush 0
      // 2b9: istore 13
      // 2bb: iload 13
      // 2bd: iload 2
      // 2be: ifeq 377
      // 2c1: ifeq 375
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: aload 0
      // 2cd: getfield com/finalshell/core/U9.d I
      // 2d0: iload 3
      // 2d1: iinc 3 1
      // 2d4: iadd
      // 2d5: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d8: istore 4
      // 2da: iload 4
      // 2dc: iload 2
      // 2dd: ifeq 327
      // 2e0: sipush 22734
      // 2e3: ldc2_w 9000764304867362202
      // 2e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e9: if_icmpeq 313
      // 2ec: goto 2f3
      // 2ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: iload 4
      // 2f5: sipush 19418
      // 2f8: ldc2_w 715321441499911916
      // 2fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2fe: iload 2
      // 2ff: ifeq 334
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: if_icmpne 329
      // 30c: goto 313
      // 30f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: aload 0
      // 314: aload 0
      // 315: getfield com/finalshell/core/U9.d I
      // 318: iload 3
      // 319: iinc 3 1
      // 31c: iadd
      // 31d: invokevirtual com/finalshell/core/U9.C (I)C
      // 320: goto 327
      // 323: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: istore 4
      // 329: iload 4
      // 32b: sipush 21259
      // 32e: ldc2_w 1287927339301015045
      // 331: invokestatic com/finalshell/core/U9.a (IJ)I
      // 334: if_icmplt 375
      // 337: iload 4
      // 339: iload 2
      // 33a: ifeq 377
      // 33d: goto 344
      // 340: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: sipush 24153
      // 347: ldc2_w 3168790736949871469
      // 34a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 34d: iload 2
      // 34e: ifeq 3e8
      // 351: goto 358
      // 354: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 357: athrow
      // 358: if_icmpgt 375
      // 35b: goto 362
      // 35e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 361: athrow
      // 362: aload 0
      // 363: aload 0
      // 364: getfield com/finalshell/core/U9.d I
      // 367: iload 3
      // 368: iinc 3 1
      // 36b: iadd
      // 36c: invokevirtual com/finalshell/core/U9.C (I)C
      // 36f: istore 4
      // 371: iload 2
      // 372: ifne 329
      // 375: iload 5
      // 377: iload 2
      // 378: ifeq 3e9
      // 37b: ifeq 3db
      // 37e: goto 385
      // 381: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: iload 4
      // 387: sipush 26107
      // 38a: ldc2_w 2081374444732725480
      // 38d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 390: iload 2
      // 391: ifeq 3c7
      // 394: goto 39b
      // 397: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39a: athrow
      // 39b: if_icmpeq 3b0
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: bipush -1
      // 3a7: putfield com/finalshell/core/U9.z I
      // 3aa: fconst_0
      // 3ab: freturn
      // 3ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3af: athrow
      // 3b0: aload 0
      // 3b1: aload 0
      // 3b2: getfield com/finalshell/core/U9.d I
      // 3b5: iload 3
      // 3b6: iinc 3 1
      // 3b9: iadd
      // 3ba: invokevirtual com/finalshell/core/U9.C (I)C
      // 3bd: istore 4
      // 3bf: aload 0
      // 3c0: getfield com/finalshell/core/U9.d I
      // 3c3: aload 1
      // 3c4: arraylength
      // 3c5: iadd
      // 3c6: bipush 1
      // 3c7: iadd
      // 3c8: istore 14
      // 3ca: aload 0
      // 3cb: getfield com/finalshell/core/U9.d I
      // 3ce: iload 3
      // 3cf: iadd
      // 3d0: iload 14
      // 3d2: isub
      // 3d3: bipush 2
      // 3d4: isub
      // 3d5: istore 15
      // 3d7: iload 2
      // 3d8: ifne 3f8
      // 3db: aload 0
      // 3dc: getfield com/finalshell/core/U9.d I
      // 3df: aload 1
      // 3e0: arraylength
      // 3e1: goto 3e8
      // 3e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e7: athrow
      // 3e8: iadd
      // 3e9: istore 14
      // 3eb: aload 0
      // 3ec: getfield com/finalshell/core/U9.d I
      // 3ef: iload 3
      // 3f0: iadd
      // 3f1: iload 14
      // 3f3: isub
      // 3f4: bipush 1
      // 3f5: isub
      // 3f6: istore 15
      // 3f8: iload 13
      // 3fa: iload 2
      // 3fb: ifeq 40a
      // 3fe: ifne 439
      // 401: goto 408
      // 404: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 407: athrow
      // 408: iload 15
      // 40a: sipush 8285
      // 40d: ldc2_w 1050517695616711985
      // 410: invokestatic com/finalshell/core/U9.a (IJ)I
      // 413: if_icmpge 439
      // 416: lload 8
      // 418: l2d
      // 419: lload 10
      // 41b: l2d
      // 41c: ddiv
      // 41d: d2f
      // 41e: fstore 7
      // 420: iload 2
      // 421: ifeq 435
      // 424: iload 6
      // 426: ifeq 44a
      // 429: goto 430
      // 42c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42f: athrow
      // 430: fload 7
      // 432: fneg
      // 433: fstore 7
      // 435: iload 2
      // 436: ifne 44a
      // 439: aload 0
      // 43a: iload 14
      // 43c: iload 15
      // 43e: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 441: astore 16
      // 443: aload 16
      // 445: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 448: fstore 7
      // 44a: iload 2
      // 44b: ifne 626
      // 44e: iload 4
      // 450: sipush 7800
      // 453: ldc2_w 5201320676148134657
      // 456: invokestatic com/finalshell/core/U9.a (IJ)I
      // 459: goto 460
      // 45c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: iload 2
      // 461: ifeq 493
      // 464: if_icmpne 61f
      // 467: goto 46e
      // 46a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46d: athrow
      // 46e: aload 0
      // 46f: aload 0
      // 470: getfield com/finalshell/core/U9.d I
      // 473: iload 3
      // 474: iadd
      // 475: iload 2
      // 476: ifeq 621
      // 479: goto 480
      // 47c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47f: athrow
      // 480: invokevirtual com/finalshell/core/U9.C (I)C
      // 483: sipush 25252
      // 486: ldc2_w 2256381802227974060
      // 489: invokestatic com/finalshell/core/U9.a (IJ)I
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 492: athrow
      // 493: if_icmpne 61f
      // 496: aload 0
      // 497: aload 0
      // 498: getfield com/finalshell/core/U9.d I
      // 49b: iload 3
      // 49c: iadd
      // 49d: bipush 1
      // 49e: iadd
      // 49f: iload 2
      // 4a0: ifeq 621
      // 4a3: goto 4aa
      // 4a6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a9: athrow
      // 4aa: invokevirtual com/finalshell/core/U9.C (I)C
      // 4ad: sipush 7325
      // 4b0: ldc2_w 7975301603790307833
      // 4b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b6: if_icmpne 61f
      // 4b9: goto 4c0
      // 4bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bf: athrow
      // 4c0: aload 0
      // 4c1: aload 0
      // 4c2: getfield com/finalshell/core/U9.d I
      // 4c5: iload 3
      // 4c6: iadd
      // 4c7: bipush 2
      // 4c8: iadd
      // 4c9: iload 2
      // 4ca: ifeq 621
      // 4cd: goto 4d4
      // 4d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d3: athrow
      // 4d4: invokevirtual com/finalshell/core/U9.C (I)C
      // 4d7: sipush 7325
      // 4da: ldc2_w 7975301603790307833
      // 4dd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4e0: if_icmpne 61f
      // 4e3: goto 4ea
      // 4e6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e9: athrow
      // 4ea: aload 0
      // 4eb: sipush 19103
      // 4ee: ldc2_w 2592984034142099420
      // 4f1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f4: putfield com/finalshell/core/U9.z I
      // 4f7: fconst_0
      // 4f8: fstore 7
      // 4fa: iinc 3 3
      // 4fd: aload 0
      // 4fe: aload 0
      // 4ff: getfield com/finalshell/core/U9.d I
      // 502: iload 3
      // 503: iinc 3 1
      // 506: iadd
      // 507: invokevirtual com/finalshell/core/U9.C (I)C
      // 50a: istore 4
      // 50c: iload 5
      // 50e: iload 2
      // 50f: ifeq 54d
      // 512: ifeq 54b
      // 515: goto 51c
      // 518: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51b: athrow
      // 51c: iload 4
      // 51e: sipush 26107
      // 521: ldc2_w 2081374444732725480
      // 524: invokestatic com/finalshell/core/U9.a (IJ)I
      // 527: iload 2
      // 528: ifeq 556
      // 52b: goto 532
      // 52e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 531: athrow
      // 532: if_icmpne 54b
      // 535: goto 53c
      // 538: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53b: athrow
      // 53c: aload 0
      // 53d: aload 0
      // 53e: getfield com/finalshell/core/U9.d I
      // 541: iload 3
      // 542: iinc 3 1
      // 545: iadd
      // 546: invokevirtual com/finalshell/core/U9.C (I)C
      // 549: istore 4
      // 54b: iload 4
      // 54d: sipush 26927
      // 550: ldc2_w 6101958691031889140
      // 553: invokestatic com/finalshell/core/U9.a (IJ)I
      // 556: if_icmpne 59b
      // 559: aload 0
      // 55a: dup
      // 55b: getfield com/finalshell/core/U9.d I
      // 55e: iload 3
      // 55f: iadd
      // 560: putfield com/finalshell/core/U9.d I
      // 563: aload 0
      // 564: aload 0
      // 565: aload 0
      // 566: getfield com/finalshell/core/U9.d I
      // 569: invokevirtual com/finalshell/core/U9.C (I)C
      // 56c: putfield com/finalshell/core/U9.l C
      // 56f: aload 0
      // 570: sipush 19103
      // 573: ldc2_w 2592984034142099420
      // 576: invokestatic com/finalshell/core/U9.a (IJ)I
      // 579: putfield com/finalshell/core/U9.z I
      // 57c: aload 0
      // 57d: sipush 9361
      // 580: ldc2_w 2488456831667599749
      // 583: invokestatic com/finalshell/core/U9.a (IJ)I
      // 586: putfield com/finalshell/core/U9.Y I
      // 589: fload 7
      // 58b: iload 2
      // 58c: ifeq 61e
      // 58f: goto 596
      // 592: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 595: athrow
      // 596: freturn
      // 597: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59a: athrow
      // 59b: iload 4
      // 59d: iload 2
      // 59e: ifeq 5f0
      // 5a1: sipush 4784
      // 5a4: ldc2_w 3082167687830622095
      // 5a7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5aa: if_icmpne 5eb
      // 5ad: goto 5b4
      // 5b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b3: athrow
      // 5b4: aload 0
      // 5b5: dup
      // 5b6: getfield com/finalshell/core/U9.d I
      // 5b9: iload 3
      // 5ba: iadd
      // 5bb: putfield com/finalshell/core/U9.d I
      // 5be: aload 0
      // 5bf: aload 0
      // 5c0: aload 0
      // 5c1: getfield com/finalshell/core/U9.d I
      // 5c4: invokevirtual com/finalshell/core/U9.C (I)C
      // 5c7: putfield com/finalshell/core/U9.l C
      // 5ca: aload 0
      // 5cb: sipush 19103
      // 5ce: ldc2_w 2592984034142099420
      // 5d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5d4: putfield com/finalshell/core/U9.z I
      // 5d7: aload 0
      // 5d8: sipush 16923
      // 5db: ldc2_w 1571494982232874791
      // 5de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5e1: putfield com/finalshell/core/U9.Y I
      // 5e4: fload 7
      // 5e6: freturn
      // 5e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ea: athrow
      // 5eb: iload 4
      // 5ed: invokestatic com/finalshell/core/U9.Y (C)Z
      // 5f0: iload 2
      // 5f1: ifeq 612
      // 5f4: ifeq 618
      // 5f7: goto 5fe
      // 5fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fd: athrow
      // 5fe: aload 0
      // 5ff: aload 0
      // 600: getfield com/finalshell/core/U9.d I
      // 603: iload 3
      // 604: iinc 3 1
      // 607: iadd
      // 608: invokevirtual com/finalshell/core/U9.C (I)C
      // 60b: goto 612
      // 60e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 611: athrow
      // 612: istore 4
      // 614: iload 2
      // 615: ifne 54b
      // 618: aload 0
      // 619: bipush -1
      // 61a: putfield com/finalshell/core/U9.z I
      // 61d: fconst_0
      // 61e: freturn
      // 61f: aload 0
      // 620: bipush -1
      // 621: putfield com/finalshell/core/U9.z I
      // 624: fconst_0
      // 625: freturn
      // 626: iload 4
      // 628: sipush 26927
      // 62b: ldc2_w 6101958691031889140
      // 62e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 631: iload 2
      // 632: ifeq 681
      // 635: if_icmpne 676
      // 638: goto 63f
      // 63b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63e: athrow
      // 63f: aload 0
      // 640: dup
      // 641: getfield com/finalshell/core/U9.d I
      // 644: iload 3
      // 645: iadd
      // 646: putfield com/finalshell/core/U9.d I
      // 649: aload 0
      // 64a: aload 0
      // 64b: aload 0
      // 64c: getfield com/finalshell/core/U9.d I
      // 64f: invokevirtual com/finalshell/core/U9.C (I)C
      // 652: putfield com/finalshell/core/U9.l C
      // 655: aload 0
      // 656: sipush 5887
      // 659: ldc2_w 3467391210321595353
      // 65c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 65f: putfield com/finalshell/core/U9.z I
      // 662: aload 0
      // 663: sipush 9361
      // 666: ldc2_w 2488456831667599749
      // 669: invokestatic com/finalshell/core/U9.a (IJ)I
      // 66c: putfield com/finalshell/core/U9.Y I
      // 66f: fload 7
      // 671: freturn
      // 672: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 675: athrow
      // 676: iload 4
      // 678: sipush 4784
      // 67b: ldc2_w 3082167687830622095
      // 67e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 681: iload 2
      // 682: ifeq 6a9
      // 685: if_icmpne 7e3
      // 688: goto 68f
      // 68b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68e: athrow
      // 68f: aload 0
      // 690: aload 0
      // 691: getfield com/finalshell/core/U9.d I
      // 694: iload 3
      // 695: iinc 3 1
      // 698: iadd
      // 699: invokevirtual com/finalshell/core/U9.C (I)C
      // 69c: istore 4
      // 69e: iload 4
      // 6a0: sipush 26927
      // 6a3: ldc2_w 6101958691031889140
      // 6a6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6a9: iload 2
      // 6aa: ifeq 6f7
      // 6ad: if_icmpne 6e5
      // 6b0: goto 6b7
      // 6b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b6: athrow
      // 6b7: aload 0
      // 6b8: sipush 9361
      // 6bb: ldc2_w 2488456831667599749
      // 6be: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6c1: putfield com/finalshell/core/U9.Y I
      // 6c4: aload 0
      // 6c5: dup
      // 6c6: getfield com/finalshell/core/U9.d I
      // 6c9: iload 3
      // 6ca: iadd
      // 6cb: putfield com/finalshell/core/U9.d I
      // 6ce: aload 0
      // 6cf: aload 0
      // 6d0: aload 0
      // 6d1: getfield com/finalshell/core/U9.d I
      // 6d4: invokevirtual com/finalshell/core/U9.C (I)C
      // 6d7: putfield com/finalshell/core/U9.l C
      // 6da: iload 2
      // 6db: ifne 7d2
      // 6de: goto 6e5
      // 6e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e4: athrow
      // 6e5: iload 4
      // 6e7: sipush 30337
      // 6ea: ldc2_w 2029800848590515112
      // 6ed: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6f0: goto 6f7
      // 6f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f6: athrow
      // 6f7: iload 2
      // 6f8: ifeq 745
      // 6fb: if_icmpne 733
      // 6fe: goto 705
      // 701: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 704: athrow
      // 705: aload 0
      // 706: sipush 9145
      // 709: ldc2_w 6577731744871808687
      // 70c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 70f: putfield com/finalshell/core/U9.Y I
      // 712: aload 0
      // 713: dup
      // 714: getfield com/finalshell/core/U9.d I
      // 717: iload 3
      // 718: iadd
      // 719: putfield com/finalshell/core/U9.d I
      // 71c: aload 0
      // 71d: aload 0
      // 71e: aload 0
      // 71f: getfield com/finalshell/core/U9.d I
      // 722: invokevirtual com/finalshell/core/U9.C (I)C
      // 725: putfield com/finalshell/core/U9.l C
      // 728: iload 2
      // 729: ifne 7d2
      // 72c: goto 733
      // 72f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 732: athrow
      // 733: iload 4
      // 735: sipush 4784
      // 738: ldc2_w 3082167687830622095
      // 73b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 73e: goto 745
      // 741: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 744: athrow
      // 745: iload 2
      // 746: ifeq 793
      // 749: if_icmpne 781
      // 74c: goto 753
      // 74f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 752: athrow
      // 753: aload 0
      // 754: sipush 16923
      // 757: ldc2_w 1571494982232874791
      // 75a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 75d: putfield com/finalshell/core/U9.Y I
      // 760: aload 0
      // 761: dup
      // 762: getfield com/finalshell/core/U9.d I
      // 765: iload 3
      // 766: iadd
      // 767: putfield com/finalshell/core/U9.d I
      // 76a: aload 0
      // 76b: aload 0
      // 76c: aload 0
      // 76d: getfield com/finalshell/core/U9.d I
      // 770: invokevirtual com/finalshell/core/U9.C (I)C
      // 773: putfield com/finalshell/core/U9.l C
      // 776: iload 2
      // 777: ifne 7d2
      // 77a: goto 781
      // 77d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 780: athrow
      // 781: iload 4
      // 783: sipush 2765
      // 786: ldc2_w 8216137057917720563
      // 789: invokestatic com/finalshell/core/U9.a (IJ)I
      // 78c: goto 793
      // 78f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 792: athrow
      // 793: if_icmpne 7c7
      // 796: aload 0
      // 797: dup
      // 798: getfield com/finalshell/core/U9.d I
      // 79b: iload 3
      // 79c: bipush 1
      // 79d: isub
      // 79e: iadd
      // 79f: putfield com/finalshell/core/U9.d I
      // 7a2: aload 0
      // 7a3: sipush 9907
      // 7a6: ldc2_w 514190805586246625
      // 7a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7ac: putfield com/finalshell/core/U9.Y I
      // 7af: aload 0
      // 7b0: sipush 2765
      // 7b3: ldc2_w 8216137057917720563
      // 7b6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7b9: putfield com/finalshell/core/U9.l C
      // 7bc: iload 2
      // 7bd: ifne 7d2
      // 7c0: goto 7c7
      // 7c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c6: athrow
      // 7c7: aload 0
      // 7c8: bipush -1
      // 7c9: putfield com/finalshell/core/U9.z I
      // 7cc: fconst_0
      // 7cd: freturn
      // 7ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d1: athrow
      // 7d2: aload 0
      // 7d3: sipush 2897
      // 7d6: ldc2_w 695568451002816123
      // 7d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7dc: putfield com/finalshell/core/U9.z I
      // 7df: iload 2
      // 7e0: ifne 7ee
      // 7e3: aload 0
      // 7e4: bipush -1
      // 7e5: putfield com/finalshell/core/U9.z I
      // 7e8: fconst_0
      // 7e9: freturn
      // 7ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7ed: athrow
      // 7ee: fload 7
      // 7f0: freturn
   }

   @Override
   public final float w(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield com/finalshell/core/U9.z I
      // 005: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 008: bipush 0
      // 009: istore 3
      // 00a: istore 2
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: iload 2
      // 01d: ifeq 03b
      // 020: sipush 26107
      // 023: ldc2_w 2081374444732725480
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: iload 2
      // 044: ifeq 062
      // 047: ifeq 060
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield com/finalshell/core/U9.d I
      // 056: iload 3
      // 057: iinc 3 1
      // 05a: iadd
      // 05b: invokevirtual com/finalshell/core/U9.C (I)C
      // 05e: istore 4
      // 060: iload 4
      // 062: iload 2
      // 063: ifeq 081
      // 066: sipush 19418
      // 069: ldc2_w 715321441499911916
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: if_icmpne 084
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: goto 085
      // 084: bipush 0
      // 085: istore 6
      // 087: iload 6
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: ifeq 0a6
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/U9.d I
      // 09c: iload 3
      // 09d: iinc 3 1
      // 0a0: iadd
      // 0a1: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a4: istore 4
      // 0a6: iload 4
      // 0a8: sipush 21259
      // 0ab: ldc2_w 1287927339301015045
      // 0ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b1: iload 2
      // 0b2: ifeq 433
      // 0b5: if_icmplt 421
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: sipush 24153
      // 0c4: ldc2_w 3168790736949871469
      // 0c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ca: iload 2
      // 0cb: ifeq 433
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: if_icmpgt 421
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: iload 4
      // 0e1: sipush 21259
      // 0e4: ldc2_w 1287927339301015045
      // 0e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ea: isub
      // 0eb: i2l
      // 0ec: lstore 8
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/U9.d I
      // 0f3: iload 3
      // 0f4: iinc 3 1
      // 0f7: iadd
      // 0f8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0fb: istore 4
      // 0fd: iload 4
      // 0ff: sipush 21259
      // 102: ldc2_w 1287927339301015045
      // 105: invokestatic com/finalshell/core/U9.a (IJ)I
      // 108: if_icmplt 139
      // 10b: iload 4
      // 10d: sipush 24153
      // 110: ldc2_w 3168790736949871469
      // 113: invokestatic com/finalshell/core/U9.a (IJ)I
      // 116: if_icmpgt 139
      // 119: lload 8
      // 11b: sipush 3395
      // 11e: ldc2_w 2174368042043745818
      // 121: invokestatic com/finalshell/core/U9.c (IJ)J
      // 124: lmul
      // 125: iload 4
      // 127: sipush 21259
      // 12a: ldc2_w 1287927339301015045
      // 12d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 130: isub
      // 131: i2l
      // 132: ladd
      // 133: lstore 8
      // 135: iload 2
      // 136: ifne 0ee
      // 139: lconst_1
      // 13a: lstore 10
      // 13c: iload 4
      // 13e: iload 2
      // 13f: ifeq 15d
      // 142: sipush 19110
      // 145: ldc2_w 4854799824381581179
      // 148: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14b: if_icmpne 160
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: bipush 1
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15c: athrow
      // 15d: goto 161
      // 160: bipush 0
      // 161: istore 12
      // 163: iload 12
      // 165: iload 2
      // 166: ifeq 24f
      // 169: ifeq 24d
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 0
      // 174: aload 0
      // 175: getfield com/finalshell/core/U9.d I
      // 178: iload 3
      // 179: iinc 3 1
      // 17c: iadd
      // 17d: invokevirtual com/finalshell/core/U9.C (I)C
      // 180: istore 4
      // 182: iload 2
      // 183: ifeq 24b
      // 186: iload 4
      // 188: sipush 21259
      // 18b: ldc2_w 1287927339301015045
      // 18e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 191: if_icmplt 246
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: iload 4
      // 19d: sipush 24153
      // 1a0: ldc2_w 3168790736949871469
      // 1a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a6: if_icmpgt 246
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: lload 8
      // 1b2: sipush 3395
      // 1b5: ldc2_w 2174368042043745818
      // 1b8: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1bb: lmul
      // 1bc: iload 4
      // 1be: sipush 21259
      // 1c1: ldc2_w 1287927339301015045
      // 1c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c7: isub
      // 1c8: i2l
      // 1c9: ladd
      // 1ca: lstore 8
      // 1cc: sipush 3395
      // 1cf: ldc2_w 2174368042043745818
      // 1d2: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1d5: lstore 10
      // 1d7: aload 0
      // 1d8: aload 0
      // 1d9: getfield com/finalshell/core/U9.d I
      // 1dc: iload 3
      // 1dd: iinc 3 1
      // 1e0: iadd
      // 1e1: invokevirtual com/finalshell/core/U9.C (I)C
      // 1e4: istore 4
      // 1e6: iload 4
      // 1e8: sipush 21259
      // 1eb: ldc2_w 1287927339301015045
      // 1ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f1: if_icmplt 24d
      // 1f4: iload 4
      // 1f6: sipush 24153
      // 1f9: ldc2_w 3168790736949871469
      // 1fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ff: iload 2
      // 200: ifeq 263
      // 203: iload 2
      // 204: ifeq 263
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: if_icmpgt 24d
      // 211: goto 218
      // 214: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: lload 8
      // 21a: sipush 3395
      // 21d: ldc2_w 2174368042043745818
      // 220: invokestatic com/finalshell/core/U9.c (IJ)J
      // 223: lmul
      // 224: iload 4
      // 226: sipush 21259
      // 229: ldc2_w 1287927339301015045
      // 22c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22f: isub
      // 230: i2l
      // 231: ladd
      // 232: lstore 8
      // 234: lload 10
      // 236: sipush 3395
      // 239: ldc2_w 2174368042043745818
      // 23c: invokestatic com/finalshell/core/U9.c (IJ)J
      // 23f: lmul
      // 240: lstore 10
      // 242: iload 2
      // 243: ifne 1d7
      // 246: aload 0
      // 247: bipush -1
      // 248: putfield com/finalshell/core/U9.z I
      // 24b: fconst_0
      // 24c: freturn
      // 24d: iload 4
      // 24f: iload 2
      // 250: ifeq 28e
      // 253: sipush 16831
      // 256: ldc2_w 1205696545576721607
      // 259: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: if_icmpeq 286
      // 266: iload 4
      // 268: iload 2
      // 269: ifeq 28e
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: sipush 19786
      // 276: ldc2_w 559752938502885485
      // 279: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27c: if_icmpne 291
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: bipush 1
      // 287: goto 28e
      // 28a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: goto 292
      // 291: bipush 0
      // 292: istore 13
      // 294: iload 13
      // 296: iload 2
      // 297: ifeq 350
      // 29a: ifeq 34e
      // 29d: goto 2a4
      // 2a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: aload 0
      // 2a6: getfield com/finalshell/core/U9.d I
      // 2a9: iload 3
      // 2aa: iinc 3 1
      // 2ad: iadd
      // 2ae: invokevirtual com/finalshell/core/U9.C (I)C
      // 2b1: istore 4
      // 2b3: iload 4
      // 2b5: iload 2
      // 2b6: ifeq 300
      // 2b9: sipush 22734
      // 2bc: ldc2_w 9000764304867362202
      // 2bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c2: if_icmpeq 2ec
      // 2c5: goto 2cc
      // 2c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: iload 4
      // 2ce: sipush 19418
      // 2d1: ldc2_w 715321441499911916
      // 2d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d7: iload 2
      // 2d8: ifeq 30d
      // 2db: goto 2e2
      // 2de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: if_icmpne 302
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: aload 0
      // 2ed: aload 0
      // 2ee: getfield com/finalshell/core/U9.d I
      // 2f1: iload 3
      // 2f2: iinc 3 1
      // 2f5: iadd
      // 2f6: invokevirtual com/finalshell/core/U9.C (I)C
      // 2f9: goto 300
      // 2fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: istore 4
      // 302: iload 4
      // 304: sipush 21259
      // 307: ldc2_w 1287927339301015045
      // 30a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30d: if_icmplt 34e
      // 310: iload 4
      // 312: iload 2
      // 313: ifeq 350
      // 316: goto 31d
      // 319: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: sipush 24153
      // 320: ldc2_w 3168790736949871469
      // 323: invokestatic com/finalshell/core/U9.a (IJ)I
      // 326: iload 2
      // 327: ifeq 370
      // 32a: goto 331
      // 32d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 330: athrow
      // 331: if_icmpgt 34e
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: aload 0
      // 33c: aload 0
      // 33d: getfield com/finalshell/core/U9.d I
      // 340: iload 3
      // 341: iinc 3 1
      // 344: iadd
      // 345: invokevirtual com/finalshell/core/U9.C (I)C
      // 348: istore 4
      // 34a: iload 2
      // 34b: ifne 302
      // 34e: iload 5
      // 350: iload 2
      // 351: ifeq 3bc
      // 354: ifeq 3b1
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: iload 4
      // 360: sipush 26107
      // 363: ldc2_w 2081374444732725480
      // 366: invokestatic com/finalshell/core/U9.a (IJ)I
      // 369: goto 370
      // 36c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: iload 2
      // 371: ifeq 39d
      // 374: if_icmpeq 389
      // 377: goto 37e
      // 37a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37d: athrow
      // 37e: aload 0
      // 37f: bipush -1
      // 380: putfield com/finalshell/core/U9.z I
      // 383: fconst_0
      // 384: freturn
      // 385: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: aload 0
      // 38a: aload 0
      // 38b: getfield com/finalshell/core/U9.d I
      // 38e: iload 3
      // 38f: iinc 3 1
      // 392: iadd
      // 393: invokevirtual com/finalshell/core/U9.C (I)C
      // 396: istore 4
      // 398: aload 0
      // 399: getfield com/finalshell/core/U9.d I
      // 39c: bipush 1
      // 39d: iadd
      // 39e: istore 14
      // 3a0: aload 0
      // 3a1: getfield com/finalshell/core/U9.d I
      // 3a4: iload 3
      // 3a5: iadd
      // 3a6: iload 14
      // 3a8: isub
      // 3a9: bipush 2
      // 3aa: isub
      // 3ab: istore 15
      // 3ad: iload 2
      // 3ae: ifne 3cb
      // 3b1: aload 0
      // 3b2: getfield com/finalshell/core/U9.d I
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: istore 14
      // 3be: aload 0
      // 3bf: getfield com/finalshell/core/U9.d I
      // 3c2: iload 3
      // 3c3: iadd
      // 3c4: iload 14
      // 3c6: isub
      // 3c7: bipush 1
      // 3c8: isub
      // 3c9: istore 15
      // 3cb: iload 13
      // 3cd: iload 2
      // 3ce: ifeq 3dd
      // 3d1: ifne 40c
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: iload 15
      // 3dd: sipush 8285
      // 3e0: ldc2_w 1050517695616711985
      // 3e3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e6: if_icmpge 40c
      // 3e9: lload 8
      // 3eb: l2d
      // 3ec: lload 10
      // 3ee: l2d
      // 3ef: ddiv
      // 3f0: d2f
      // 3f1: fstore 7
      // 3f3: iload 2
      // 3f4: ifeq 408
      // 3f7: iload 6
      // 3f9: ifeq 41d
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: fload 7
      // 405: fneg
      // 406: fstore 7
      // 408: iload 2
      // 409: ifne 41d
      // 40c: aload 0
      // 40d: iload 14
      // 40f: iload 15
      // 411: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 414: astore 16
      // 416: aload 16
      // 418: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 41b: fstore 7
      // 41d: iload 2
      // 41e: ifne 5f9
      // 421: iload 4
      // 423: sipush 7800
      // 426: ldc2_w 5201320676148134657
      // 429: invokestatic com/finalshell/core/U9.a (IJ)I
      // 42c: goto 433
      // 42f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 432: athrow
      // 433: iload 2
      // 434: ifeq 466
      // 437: if_icmpne 5f2
      // 43a: goto 441
      // 43d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 440: athrow
      // 441: aload 0
      // 442: aload 0
      // 443: getfield com/finalshell/core/U9.d I
      // 446: iload 3
      // 447: iadd
      // 448: iload 2
      // 449: ifeq 5f4
      // 44c: goto 453
      // 44f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 452: athrow
      // 453: invokevirtual com/finalshell/core/U9.C (I)C
      // 456: sipush 25252
      // 459: ldc2_w 2256381802227974060
      // 45c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 45f: goto 466
      // 462: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 465: athrow
      // 466: if_icmpne 5f2
      // 469: aload 0
      // 46a: aload 0
      // 46b: getfield com/finalshell/core/U9.d I
      // 46e: iload 3
      // 46f: iadd
      // 470: bipush 1
      // 471: iadd
      // 472: iload 2
      // 473: ifeq 5f4
      // 476: goto 47d
      // 479: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47c: athrow
      // 47d: invokevirtual com/finalshell/core/U9.C (I)C
      // 480: sipush 7325
      // 483: ldc2_w 7975301603790307833
      // 486: invokestatic com/finalshell/core/U9.a (IJ)I
      // 489: if_icmpne 5f2
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 492: athrow
      // 493: aload 0
      // 494: aload 0
      // 495: getfield com/finalshell/core/U9.d I
      // 498: iload 3
      // 499: iadd
      // 49a: bipush 2
      // 49b: iadd
      // 49c: iload 2
      // 49d: ifeq 5f4
      // 4a0: goto 4a7
      // 4a3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a6: athrow
      // 4a7: invokevirtual com/finalshell/core/U9.C (I)C
      // 4aa: sipush 7325
      // 4ad: ldc2_w 7975301603790307833
      // 4b0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b3: if_icmpne 5f2
      // 4b6: goto 4bd
      // 4b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bc: athrow
      // 4bd: aload 0
      // 4be: sipush 19103
      // 4c1: ldc2_w 2592984034142099420
      // 4c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c7: putfield com/finalshell/core/U9.z I
      // 4ca: fconst_0
      // 4cb: fstore 7
      // 4cd: iinc 3 3
      // 4d0: aload 0
      // 4d1: aload 0
      // 4d2: getfield com/finalshell/core/U9.d I
      // 4d5: iload 3
      // 4d6: iinc 3 1
      // 4d9: iadd
      // 4da: invokevirtual com/finalshell/core/U9.C (I)C
      // 4dd: istore 4
      // 4df: iload 5
      // 4e1: iload 2
      // 4e2: ifeq 520
      // 4e5: ifeq 51e
      // 4e8: goto 4ef
      // 4eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ee: athrow
      // 4ef: iload 4
      // 4f1: sipush 26107
      // 4f4: ldc2_w 2081374444732725480
      // 4f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4fa: iload 2
      // 4fb: ifeq 529
      // 4fe: goto 505
      // 501: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 504: athrow
      // 505: if_icmpne 51e
      // 508: goto 50f
      // 50b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50e: athrow
      // 50f: aload 0
      // 510: aload 0
      // 511: getfield com/finalshell/core/U9.d I
      // 514: iload 3
      // 515: iinc 3 1
      // 518: iadd
      // 519: invokevirtual com/finalshell/core/U9.C (I)C
      // 51c: istore 4
      // 51e: iload 4
      // 520: sipush 26927
      // 523: ldc2_w 6101958691031889140
      // 526: invokestatic com/finalshell/core/U9.a (IJ)I
      // 529: if_icmpne 56e
      // 52c: aload 0
      // 52d: dup
      // 52e: getfield com/finalshell/core/U9.d I
      // 531: iload 3
      // 532: iadd
      // 533: putfield com/finalshell/core/U9.d I
      // 536: aload 0
      // 537: aload 0
      // 538: aload 0
      // 539: getfield com/finalshell/core/U9.d I
      // 53c: invokevirtual com/finalshell/core/U9.C (I)C
      // 53f: putfield com/finalshell/core/U9.l C
      // 542: aload 0
      // 543: sipush 19103
      // 546: ldc2_w 2592984034142099420
      // 549: invokestatic com/finalshell/core/U9.a (IJ)I
      // 54c: putfield com/finalshell/core/U9.z I
      // 54f: aload 0
      // 550: sipush 9361
      // 553: ldc2_w 2488456831667599749
      // 556: invokestatic com/finalshell/core/U9.a (IJ)I
      // 559: putfield com/finalshell/core/U9.Y I
      // 55c: fload 7
      // 55e: iload 2
      // 55f: ifeq 5f1
      // 562: goto 569
      // 565: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 568: athrow
      // 569: freturn
      // 56a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56d: athrow
      // 56e: iload 4
      // 570: iload 2
      // 571: ifeq 5c3
      // 574: sipush 30337
      // 577: ldc2_w 2029800848590515112
      // 57a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57d: if_icmpne 5be
      // 580: goto 587
      // 583: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 586: athrow
      // 587: aload 0
      // 588: dup
      // 589: getfield com/finalshell/core/U9.d I
      // 58c: iload 3
      // 58d: iadd
      // 58e: putfield com/finalshell/core/U9.d I
      // 591: aload 0
      // 592: aload 0
      // 593: aload 0
      // 594: getfield com/finalshell/core/U9.d I
      // 597: invokevirtual com/finalshell/core/U9.C (I)C
      // 59a: putfield com/finalshell/core/U9.l C
      // 59d: aload 0
      // 59e: sipush 19103
      // 5a1: ldc2_w 2592984034142099420
      // 5a4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a7: putfield com/finalshell/core/U9.z I
      // 5aa: aload 0
      // 5ab: sipush 9145
      // 5ae: ldc2_w 6577731744871808687
      // 5b1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5b4: putfield com/finalshell/core/U9.Y I
      // 5b7: fload 7
      // 5b9: freturn
      // 5ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5bd: athrow
      // 5be: iload 4
      // 5c0: invokestatic com/finalshell/core/U9.Y (C)Z
      // 5c3: iload 2
      // 5c4: ifeq 5e5
      // 5c7: ifeq 5eb
      // 5ca: goto 5d1
      // 5cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d0: athrow
      // 5d1: aload 0
      // 5d2: aload 0
      // 5d3: getfield com/finalshell/core/U9.d I
      // 5d6: iload 3
      // 5d7: iinc 3 1
      // 5da: iadd
      // 5db: invokevirtual com/finalshell/core/U9.C (I)C
      // 5de: goto 5e5
      // 5e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e4: athrow
      // 5e5: istore 4
      // 5e7: iload 2
      // 5e8: ifne 51e
      // 5eb: aload 0
      // 5ec: bipush -1
      // 5ed: putfield com/finalshell/core/U9.z I
      // 5f0: fconst_0
      // 5f1: freturn
      // 5f2: aload 0
      // 5f3: bipush -1
      // 5f4: putfield com/finalshell/core/U9.z I
      // 5f7: fconst_0
      // 5f8: freturn
      // 5f9: iload 4
      // 5fb: iload 1
      // 5fc: if_icmpne 636
      // 5ff: aload 0
      // 600: dup
      // 601: getfield com/finalshell/core/U9.d I
      // 604: iload 3
      // 605: iadd
      // 606: putfield com/finalshell/core/U9.d I
      // 609: aload 0
      // 60a: aload 0
      // 60b: aload 0
      // 60c: getfield com/finalshell/core/U9.d I
      // 60f: invokevirtual com/finalshell/core/U9.C (I)C
      // 612: putfield com/finalshell/core/U9.l C
      // 615: aload 0
      // 616: sipush 5887
      // 619: ldc2_w 3467391210321595353
      // 61c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 61f: putfield com/finalshell/core/U9.z I
      // 622: aload 0
      // 623: sipush 9361
      // 626: ldc2_w 2488456831667599749
      // 629: invokestatic com/finalshell/core/U9.a (IJ)I
      // 62c: putfield com/finalshell/core/U9.Y I
      // 62f: fload 7
      // 631: freturn
      // 632: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 635: athrow
      // 636: aload 0
      // 637: bipush -1
      // 638: putfield com/finalshell/core/U9.z I
      // 63b: fload 7
      // 63d: freturn
   }

   @Override
   public double r(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield com/finalshell/core/U9.z I
      // 005: invokestatic com/finalshell/core/Yn4.o ()Z
      // 008: bipush 0
      // 009: istore 3
      // 00a: istore 2
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: iload 2
      // 01d: ifne 03b
      // 020: sipush 19741
      // 023: ldc2_w 232066712145072206
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: iload 2
      // 044: ifne 062
      // 047: ifeq 060
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield com/finalshell/core/U9.d I
      // 056: iload 3
      // 057: iinc 3 1
      // 05a: iadd
      // 05b: invokevirtual com/finalshell/core/U9.C (I)C
      // 05e: istore 4
      // 060: iload 4
      // 062: iload 2
      // 063: ifne 081
      // 066: sipush 19587
      // 069: ldc2_w 5070216309889339777
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: if_icmpne 084
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: goto 085
      // 084: bipush 0
      // 085: istore 6
      // 087: iload 6
      // 089: iload 2
      // 08a: ifne 0a8
      // 08d: ifeq 0a6
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/U9.d I
      // 09c: iload 3
      // 09d: iinc 3 1
      // 0a0: iadd
      // 0a1: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a4: istore 4
      // 0a6: iload 4
      // 0a8: sipush 10589
      // 0ab: ldc2_w 2036242623284638779
      // 0ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b1: iload 2
      // 0b2: ifne 432
      // 0b5: if_icmplt 420
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: sipush 7812
      // 0c4: ldc2_w 3156131624429274021
      // 0c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ca: iload 2
      // 0cb: ifne 432
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: if_icmpgt 420
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: iload 4
      // 0e1: sipush 21259
      // 0e4: ldc2_w 1287927339301015045
      // 0e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ea: isub
      // 0eb: i2l
      // 0ec: lstore 9
      // 0ee: aload 0
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/U9.d I
      // 0f3: iload 3
      // 0f4: iinc 3 1
      // 0f7: iadd
      // 0f8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0fb: istore 4
      // 0fd: iload 4
      // 0ff: sipush 21259
      // 102: ldc2_w 1287927339301015045
      // 105: invokestatic com/finalshell/core/U9.a (IJ)I
      // 108: if_icmplt 139
      // 10b: iload 4
      // 10d: sipush 24153
      // 110: ldc2_w 3168790736949871469
      // 113: invokestatic com/finalshell/core/U9.a (IJ)I
      // 116: if_icmpgt 139
      // 119: lload 9
      // 11b: sipush 19807
      // 11e: ldc2_w 329547382467683845
      // 121: invokestatic com/finalshell/core/U9.c (IJ)J
      // 124: lmul
      // 125: iload 4
      // 127: sipush 21259
      // 12a: ldc2_w 1287927339301015045
      // 12d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 130: isub
      // 131: i2l
      // 132: ladd
      // 133: lstore 9
      // 135: iload 2
      // 136: ifeq 0ee
      // 139: lconst_1
      // 13a: lstore 11
      // 13c: iload 4
      // 13e: iload 2
      // 13f: ifne 15d
      // 142: sipush 1154
      // 145: ldc2_w 7800275738647419229
      // 148: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14b: if_icmpne 160
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: bipush 1
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15c: athrow
      // 15d: goto 161
      // 160: bipush 0
      // 161: istore 13
      // 163: iload 13
      // 165: iload 2
      // 166: ifne 24f
      // 169: ifeq 24d
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 0
      // 174: aload 0
      // 175: getfield com/finalshell/core/U9.d I
      // 178: iload 3
      // 179: iinc 3 1
      // 17c: iadd
      // 17d: invokevirtual com/finalshell/core/U9.C (I)C
      // 180: istore 4
      // 182: iload 2
      // 183: ifne 24b
      // 186: iload 4
      // 188: sipush 21259
      // 18b: ldc2_w 1287927339301015045
      // 18e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 191: if_icmplt 246
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: iload 4
      // 19d: sipush 24153
      // 1a0: ldc2_w 3168790736949871469
      // 1a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a6: if_icmpgt 246
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: lload 9
      // 1b2: sipush 3395
      // 1b5: ldc2_w 2174368042043745818
      // 1b8: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1bb: lmul
      // 1bc: iload 4
      // 1be: sipush 21259
      // 1c1: ldc2_w 1287927339301015045
      // 1c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c7: isub
      // 1c8: i2l
      // 1c9: ladd
      // 1ca: lstore 9
      // 1cc: sipush 3395
      // 1cf: ldc2_w 2174368042043745818
      // 1d2: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1d5: lstore 11
      // 1d7: aload 0
      // 1d8: aload 0
      // 1d9: getfield com/finalshell/core/U9.d I
      // 1dc: iload 3
      // 1dd: iinc 3 1
      // 1e0: iadd
      // 1e1: invokevirtual com/finalshell/core/U9.C (I)C
      // 1e4: istore 4
      // 1e6: iload 4
      // 1e8: sipush 21259
      // 1eb: ldc2_w 1287927339301015045
      // 1ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f1: if_icmplt 24d
      // 1f4: iload 4
      // 1f6: sipush 24153
      // 1f9: ldc2_w 3168790736949871469
      // 1fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ff: iload 2
      // 200: ifne 263
      // 203: iload 2
      // 204: ifne 263
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: if_icmpgt 24d
      // 211: goto 218
      // 214: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: lload 9
      // 21a: sipush 3395
      // 21d: ldc2_w 2174368042043745818
      // 220: invokestatic com/finalshell/core/U9.c (IJ)J
      // 223: lmul
      // 224: iload 4
      // 226: sipush 21259
      // 229: ldc2_w 1287927339301015045
      // 22c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22f: isub
      // 230: i2l
      // 231: ladd
      // 232: lstore 9
      // 234: lload 11
      // 236: sipush 3395
      // 239: ldc2_w 2174368042043745818
      // 23c: invokestatic com/finalshell/core/U9.c (IJ)J
      // 23f: lmul
      // 240: lstore 11
      // 242: iload 2
      // 243: ifeq 1d7
      // 246: aload 0
      // 247: bipush -1
      // 248: putfield com/finalshell/core/U9.z I
      // 24b: dconst_0
      // 24c: dreturn
      // 24d: iload 4
      // 24f: iload 2
      // 250: ifne 28e
      // 253: sipush 17636
      // 256: ldc2_w 8363314352351812054
      // 259: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: if_icmpeq 286
      // 266: iload 4
      // 268: iload 2
      // 269: ifne 28e
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: sipush 1712
      // 276: ldc2_w 2559145264987724793
      // 279: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27c: if_icmpne 291
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: bipush 1
      // 287: goto 28e
      // 28a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: goto 292
      // 291: bipush 0
      // 292: istore 14
      // 294: iload 14
      // 296: iload 2
      // 297: ifne 350
      // 29a: ifeq 34e
      // 29d: goto 2a4
      // 2a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: aload 0
      // 2a6: getfield com/finalshell/core/U9.d I
      // 2a9: iload 3
      // 2aa: iinc 3 1
      // 2ad: iadd
      // 2ae: invokevirtual com/finalshell/core/U9.C (I)C
      // 2b1: istore 4
      // 2b3: iload 4
      // 2b5: iload 2
      // 2b6: ifne 300
      // 2b9: sipush 13281
      // 2bc: ldc2_w 6586593657839513270
      // 2bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c2: if_icmpeq 2ec
      // 2c5: goto 2cc
      // 2c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: iload 4
      // 2ce: sipush 19418
      // 2d1: ldc2_w 715321441499911916
      // 2d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d7: iload 2
      // 2d8: ifne 30d
      // 2db: goto 2e2
      // 2de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: if_icmpne 302
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: aload 0
      // 2ed: aload 0
      // 2ee: getfield com/finalshell/core/U9.d I
      // 2f1: iload 3
      // 2f2: iinc 3 1
      // 2f5: iadd
      // 2f6: invokevirtual com/finalshell/core/U9.C (I)C
      // 2f9: goto 300
      // 2fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: istore 4
      // 302: iload 4
      // 304: sipush 21259
      // 307: ldc2_w 1287927339301015045
      // 30a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30d: if_icmplt 34e
      // 310: iload 4
      // 312: iload 2
      // 313: ifne 350
      // 316: goto 31d
      // 319: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: sipush 24153
      // 320: ldc2_w 3168790736949871469
      // 323: invokestatic com/finalshell/core/U9.a (IJ)I
      // 326: iload 2
      // 327: ifne 370
      // 32a: goto 331
      // 32d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 330: athrow
      // 331: if_icmpgt 34e
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: aload 0
      // 33c: aload 0
      // 33d: getfield com/finalshell/core/U9.d I
      // 340: iload 3
      // 341: iinc 3 1
      // 344: iadd
      // 345: invokevirtual com/finalshell/core/U9.C (I)C
      // 348: istore 4
      // 34a: iload 2
      // 34b: ifeq 302
      // 34e: iload 5
      // 350: iload 2
      // 351: ifne 3bc
      // 354: ifeq 3b1
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: iload 4
      // 360: sipush 26107
      // 363: ldc2_w 2081374444732725480
      // 366: invokestatic com/finalshell/core/U9.a (IJ)I
      // 369: goto 370
      // 36c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: iload 2
      // 371: ifne 39d
      // 374: if_icmpeq 389
      // 377: goto 37e
      // 37a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37d: athrow
      // 37e: aload 0
      // 37f: bipush -1
      // 380: putfield com/finalshell/core/U9.z I
      // 383: dconst_0
      // 384: dreturn
      // 385: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: aload 0
      // 38a: aload 0
      // 38b: getfield com/finalshell/core/U9.d I
      // 38e: iload 3
      // 38f: iinc 3 1
      // 392: iadd
      // 393: invokevirtual com/finalshell/core/U9.C (I)C
      // 396: istore 4
      // 398: aload 0
      // 399: getfield com/finalshell/core/U9.d I
      // 39c: bipush 1
      // 39d: iadd
      // 39e: istore 15
      // 3a0: aload 0
      // 3a1: getfield com/finalshell/core/U9.d I
      // 3a4: iload 3
      // 3a5: iadd
      // 3a6: iload 15
      // 3a8: isub
      // 3a9: bipush 2
      // 3aa: isub
      // 3ab: istore 16
      // 3ad: iload 2
      // 3ae: ifeq 3cb
      // 3b1: aload 0
      // 3b2: getfield com/finalshell/core/U9.d I
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: istore 15
      // 3be: aload 0
      // 3bf: getfield com/finalshell/core/U9.d I
      // 3c2: iload 3
      // 3c3: iadd
      // 3c4: iload 15
      // 3c6: isub
      // 3c7: bipush 1
      // 3c8: isub
      // 3c9: istore 16
      // 3cb: iload 14
      // 3cd: iload 2
      // 3ce: ifne 3dd
      // 3d1: ifne 40b
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: iload 16
      // 3dd: sipush 14768
      // 3e0: ldc2_w 949857017519760589
      // 3e3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e6: if_icmpge 40b
      // 3e9: lload 9
      // 3eb: l2d
      // 3ec: lload 11
      // 3ee: l2d
      // 3ef: ddiv
      // 3f0: dstore 7
      // 3f2: iload 2
      // 3f3: ifne 407
      // 3f6: iload 6
      // 3f8: ifeq 41c
      // 3fb: goto 402
      // 3fe: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 401: athrow
      // 402: dload 7
      // 404: dneg
      // 405: dstore 7
      // 407: iload 2
      // 408: ifeq 41c
      // 40b: aload 0
      // 40c: iload 15
      // 40e: iload 16
      // 410: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 413: astore 17
      // 415: aload 17
      // 417: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 41a: dstore 7
      // 41c: iload 2
      // 41d: ifeq 5f8
      // 420: iload 4
      // 422: sipush 666
      // 425: ldc2_w 3093246883395166200
      // 428: invokestatic com/finalshell/core/U9.a (IJ)I
      // 42b: goto 432
      // 42e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 431: athrow
      // 432: iload 2
      // 433: ifne 465
      // 436: if_icmpne 5f1
      // 439: goto 440
      // 43c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43f: athrow
      // 440: aload 0
      // 441: aload 0
      // 442: getfield com/finalshell/core/U9.d I
      // 445: iload 3
      // 446: iadd
      // 447: iload 2
      // 448: ifne 5f3
      // 44b: goto 452
      // 44e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 451: athrow
      // 452: invokevirtual com/finalshell/core/U9.C (I)C
      // 455: sipush 5123
      // 458: ldc2_w 2607244729290639692
      // 45b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 45e: goto 465
      // 461: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 464: athrow
      // 465: if_icmpne 5f1
      // 468: aload 0
      // 469: aload 0
      // 46a: getfield com/finalshell/core/U9.d I
      // 46d: iload 3
      // 46e: iadd
      // 46f: bipush 1
      // 470: iadd
      // 471: iload 2
      // 472: ifne 5f3
      // 475: goto 47c
      // 478: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47b: athrow
      // 47c: invokevirtual com/finalshell/core/U9.C (I)C
      // 47f: sipush 16597
      // 482: ldc2_w 4827624552368741816
      // 485: invokestatic com/finalshell/core/U9.a (IJ)I
      // 488: if_icmpne 5f1
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 491: athrow
      // 492: aload 0
      // 493: aload 0
      // 494: getfield com/finalshell/core/U9.d I
      // 497: iload 3
      // 498: iadd
      // 499: bipush 2
      // 49a: iadd
      // 49b: iload 2
      // 49c: ifne 5f3
      // 49f: goto 4a6
      // 4a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a5: athrow
      // 4a6: invokevirtual com/finalshell/core/U9.C (I)C
      // 4a9: sipush 7325
      // 4ac: ldc2_w 7975301603790307833
      // 4af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b2: if_icmpne 5f1
      // 4b5: goto 4bc
      // 4b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bb: athrow
      // 4bc: aload 0
      // 4bd: sipush 17933
      // 4c0: ldc2_w 6162954095752485680
      // 4c3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c6: putfield com/finalshell/core/U9.z I
      // 4c9: dconst_0
      // 4ca: dstore 7
      // 4cc: iinc 3 3
      // 4cf: aload 0
      // 4d0: aload 0
      // 4d1: getfield com/finalshell/core/U9.d I
      // 4d4: iload 3
      // 4d5: iinc 3 1
      // 4d8: iadd
      // 4d9: invokevirtual com/finalshell/core/U9.C (I)C
      // 4dc: istore 4
      // 4de: iload 5
      // 4e0: iload 2
      // 4e1: ifne 51f
      // 4e4: ifeq 51d
      // 4e7: goto 4ee
      // 4ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ed: athrow
      // 4ee: iload 4
      // 4f0: sipush 26107
      // 4f3: ldc2_w 2081374444732725480
      // 4f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f9: iload 2
      // 4fa: ifne 528
      // 4fd: goto 504
      // 500: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 503: athrow
      // 504: if_icmpne 51d
      // 507: goto 50e
      // 50a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50d: athrow
      // 50e: aload 0
      // 50f: aload 0
      // 510: getfield com/finalshell/core/U9.d I
      // 513: iload 3
      // 514: iinc 3 1
      // 517: iadd
      // 518: invokevirtual com/finalshell/core/U9.C (I)C
      // 51b: istore 4
      // 51d: iload 4
      // 51f: sipush 29006
      // 522: ldc2_w 4895431357792824398
      // 525: invokestatic com/finalshell/core/U9.a (IJ)I
      // 528: if_icmpne 56d
      // 52b: aload 0
      // 52c: dup
      // 52d: getfield com/finalshell/core/U9.d I
      // 530: iload 3
      // 531: iadd
      // 532: putfield com/finalshell/core/U9.d I
      // 535: aload 0
      // 536: aload 0
      // 537: aload 0
      // 538: getfield com/finalshell/core/U9.d I
      // 53b: invokevirtual com/finalshell/core/U9.C (I)C
      // 53e: putfield com/finalshell/core/U9.l C
      // 541: aload 0
      // 542: sipush 19103
      // 545: ldc2_w 2592984034142099420
      // 548: invokestatic com/finalshell/core/U9.a (IJ)I
      // 54b: putfield com/finalshell/core/U9.z I
      // 54e: aload 0
      // 54f: sipush 5916
      // 552: ldc2_w 482622447619820099
      // 555: invokestatic com/finalshell/core/U9.a (IJ)I
      // 558: putfield com/finalshell/core/U9.Y I
      // 55b: dload 7
      // 55d: iload 2
      // 55e: ifne 5f0
      // 561: goto 568
      // 564: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 567: athrow
      // 568: dreturn
      // 569: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56c: athrow
      // 56d: iload 4
      // 56f: iload 2
      // 570: ifne 5c2
      // 573: sipush 9708
      // 576: ldc2_w 5745832427178850459
      // 579: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57c: if_icmpne 5bd
      // 57f: goto 586
      // 582: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 585: athrow
      // 586: aload 0
      // 587: dup
      // 588: getfield com/finalshell/core/U9.d I
      // 58b: iload 3
      // 58c: iadd
      // 58d: putfield com/finalshell/core/U9.d I
      // 590: aload 0
      // 591: aload 0
      // 592: aload 0
      // 593: getfield com/finalshell/core/U9.d I
      // 596: invokevirtual com/finalshell/core/U9.C (I)C
      // 599: putfield com/finalshell/core/U9.l C
      // 59c: aload 0
      // 59d: sipush 19103
      // 5a0: ldc2_w 2592984034142099420
      // 5a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a6: putfield com/finalshell/core/U9.z I
      // 5a9: aload 0
      // 5aa: sipush 17636
      // 5ad: ldc2_w 8919315183999228341
      // 5b0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5b3: putfield com/finalshell/core/U9.Y I
      // 5b6: dload 7
      // 5b8: dreturn
      // 5b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5bc: athrow
      // 5bd: iload 4
      // 5bf: invokestatic com/finalshell/core/U9.Y (C)Z
      // 5c2: iload 2
      // 5c3: ifne 5e4
      // 5c6: ifeq 5ea
      // 5c9: goto 5d0
      // 5cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cf: athrow
      // 5d0: aload 0
      // 5d1: aload 0
      // 5d2: getfield com/finalshell/core/U9.d I
      // 5d5: iload 3
      // 5d6: iinc 3 1
      // 5d9: iadd
      // 5da: invokevirtual com/finalshell/core/U9.C (I)C
      // 5dd: goto 5e4
      // 5e0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e3: athrow
      // 5e4: istore 4
      // 5e6: iload 2
      // 5e7: ifeq 51d
      // 5ea: aload 0
      // 5eb: bipush -1
      // 5ec: putfield com/finalshell/core/U9.z I
      // 5ef: dconst_0
      // 5f0: dreturn
      // 5f1: aload 0
      // 5f2: bipush -1
      // 5f3: putfield com/finalshell/core/U9.z I
      // 5f6: dconst_0
      // 5f7: dreturn
      // 5f8: iload 4
      // 5fa: iload 1
      // 5fb: if_icmpne 635
      // 5fe: aload 0
      // 5ff: dup
      // 600: getfield com/finalshell/core/U9.d I
      // 603: iload 3
      // 604: iadd
      // 605: putfield com/finalshell/core/U9.d I
      // 608: aload 0
      // 609: aload 0
      // 60a: aload 0
      // 60b: getfield com/finalshell/core/U9.d I
      // 60e: invokevirtual com/finalshell/core/U9.C (I)C
      // 611: putfield com/finalshell/core/U9.l C
      // 614: aload 0
      // 615: sipush 919
      // 618: ldc2_w 3857835534727110350
      // 61b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 61e: putfield com/finalshell/core/U9.z I
      // 621: aload 0
      // 622: sipush 9361
      // 625: ldc2_w 2488456831667599749
      // 628: invokestatic com/finalshell/core/U9.a (IJ)I
      // 62b: putfield com/finalshell/core/U9.Y I
      // 62e: dload 7
      // 630: dreturn
      // 631: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 634: athrow
      // 635: aload 0
      // 636: bipush -1
      // 637: putfield com/finalshell/core/U9.z I
      // 63a: dload 7
      // 63c: dreturn
   }

   @Override
   public BigDecimal L(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield com/finalshell/core/U9.z I
      // 005: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 008: bipush 0
      // 009: istore 3
      // 00a: istore 2
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: iload 2
      // 01d: ifeq 03b
      // 020: sipush 26107
      // 023: ldc2_w 2081374444732725480
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: istore 5
      // 041: iload 5
      // 043: iload 2
      // 044: ifeq 062
      // 047: ifeq 060
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield com/finalshell/core/U9.d I
      // 056: iload 3
      // 057: iinc 3 1
      // 05a: iadd
      // 05b: invokevirtual com/finalshell/core/U9.C (I)C
      // 05e: istore 4
      // 060: iload 4
      // 062: iload 2
      // 063: ifeq 081
      // 066: sipush 19418
      // 069: ldc2_w 715321441499911916
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: if_icmpne 084
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: goto 085
      // 084: bipush 0
      // 085: istore 6
      // 087: iload 6
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: ifeq 0a6
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 0
      // 099: getfield com/finalshell/core/U9.d I
      // 09c: iload 3
      // 09d: iinc 3 1
      // 0a0: iadd
      // 0a1: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a4: istore 4
      // 0a6: iload 4
      // 0a8: sipush 21259
      // 0ab: ldc2_w 1287927339301015045
      // 0ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b1: iload 2
      // 0b2: ifeq 3d0
      // 0b5: if_icmplt 3be
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: iload 4
      // 0c1: sipush 24153
      // 0c4: ldc2_w 3168790736949871469
      // 0c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ca: iload 2
      // 0cb: ifeq 3d0
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: if_icmpgt 3be
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/core/U9.d I
      // 0e4: iload 3
      // 0e5: iinc 3 1
      // 0e8: iadd
      // 0e9: invokevirtual com/finalshell/core/U9.C (I)C
      // 0ec: istore 4
      // 0ee: iload 4
      // 0f0: sipush 21259
      // 0f3: ldc2_w 1287927339301015045
      // 0f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f9: if_icmplt 12b
      // 0fc: iload 4
      // 0fe: sipush 24153
      // 101: ldc2_w 3168790736949871469
      // 104: invokestatic com/finalshell/core/U9.a (IJ)I
      // 107: iload 2
      // 108: ifeq 141
      // 10b: iload 2
      // 10c: ifeq 141
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: if_icmpgt 12b
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: iload 2
      // 121: ifne 0df
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: iload 4
      // 12d: iload 2
      // 12e: ifeq 145
      // 131: sipush 19110
      // 134: ldc2_w 4854799824381581179
      // 137: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: if_icmpne 148
      // 144: bipush 1
      // 145: goto 149
      // 148: bipush 0
      // 149: istore 8
      // 14b: iload 8
      // 14d: iload 2
      // 14e: ifeq 1ff
      // 151: ifeq 1fd
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: aload 0
      // 15c: aload 0
      // 15d: getfield com/finalshell/core/U9.d I
      // 160: iload 3
      // 161: iinc 3 1
      // 164: iadd
      // 165: invokevirtual com/finalshell/core/U9.C (I)C
      // 168: istore 4
      // 16a: iload 2
      // 16b: ifeq 1fb
      // 16e: iload 4
      // 170: sipush 21259
      // 173: ldc2_w 1287927339301015045
      // 176: invokestatic com/finalshell/core/U9.a (IJ)I
      // 179: if_icmplt 1f6
      // 17c: goto 183
      // 17f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: iload 4
      // 185: sipush 24153
      // 188: ldc2_w 3168790736949871469
      // 18b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 18e: iload 2
      // 18f: ifeq 1bd
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: if_icmpgt 1f6
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: aload 0
      // 1a5: getfield com/finalshell/core/U9.d I
      // 1a8: iload 3
      // 1a9: iinc 3 1
      // 1ac: iadd
      // 1ad: invokevirtual com/finalshell/core/U9.C (I)C
      // 1b0: istore 4
      // 1b2: iload 4
      // 1b4: sipush 21259
      // 1b7: ldc2_w 1287927339301015045
      // 1ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1bd: if_icmplt 1fd
      // 1c0: iload 4
      // 1c2: sipush 24153
      // 1c5: ldc2_w 3168790736949871469
      // 1c8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1cb: iload 2
      // 1cc: ifeq 213
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: iload 2
      // 1d7: ifeq 213
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: if_icmpgt 1fd
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: iload 2
      // 1ec: ifne 1a3
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: bipush -1
      // 1f8: putfield com/finalshell/core/U9.z I
      // 1fb: aconst_null
      // 1fc: areturn
      // 1fd: iload 4
      // 1ff: iload 2
      // 200: ifeq 23e
      // 203: sipush 16831
      // 206: ldc2_w 1205696545576721607
      // 209: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20c: goto 213
      // 20f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 212: athrow
      // 213: if_icmpeq 236
      // 216: iload 4
      // 218: iload 2
      // 219: ifeq 23e
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: sipush 19786
      // 226: ldc2_w 559752938502885485
      // 229: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22c: if_icmpne 241
      // 22f: goto 236
      // 232: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: bipush 1
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: goto 242
      // 241: bipush 0
      // 242: istore 9
      // 244: iload 9
      // 246: iload 2
      // 247: ifeq 300
      // 24a: ifeq 2fe
      // 24d: goto 254
      // 250: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: aload 0
      // 255: aload 0
      // 256: getfield com/finalshell/core/U9.d I
      // 259: iload 3
      // 25a: iinc 3 1
      // 25d: iadd
      // 25e: invokevirtual com/finalshell/core/U9.C (I)C
      // 261: istore 4
      // 263: iload 4
      // 265: iload 2
      // 266: ifeq 2b0
      // 269: sipush 22734
      // 26c: ldc2_w 9000764304867362202
      // 26f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 272: if_icmpeq 29c
      // 275: goto 27c
      // 278: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27b: athrow
      // 27c: iload 4
      // 27e: sipush 19418
      // 281: ldc2_w 715321441499911916
      // 284: invokestatic com/finalshell/core/U9.a (IJ)I
      // 287: iload 2
      // 288: ifeq 2bd
      // 28b: goto 292
      // 28e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 291: athrow
      // 292: if_icmpne 2b2
      // 295: goto 29c
      // 298: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: aload 0
      // 29d: aload 0
      // 29e: getfield com/finalshell/core/U9.d I
      // 2a1: iload 3
      // 2a2: iinc 3 1
      // 2a5: iadd
      // 2a6: invokevirtual com/finalshell/core/U9.C (I)C
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: istore 4
      // 2b2: iload 4
      // 2b4: sipush 21259
      // 2b7: ldc2_w 1287927339301015045
      // 2ba: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bd: if_icmplt 2fe
      // 2c0: iload 4
      // 2c2: iload 2
      // 2c3: ifeq 300
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: sipush 24153
      // 2d0: ldc2_w 3168790736949871469
      // 2d3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d6: iload 2
      // 2d7: ifeq 320
      // 2da: goto 2e1
      // 2dd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: if_icmpgt 2fe
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: aload 0
      // 2ec: aload 0
      // 2ed: getfield com/finalshell/core/U9.d I
      // 2f0: iload 3
      // 2f1: iinc 3 1
      // 2f4: iadd
      // 2f5: invokevirtual com/finalshell/core/U9.C (I)C
      // 2f8: istore 4
      // 2fa: iload 2
      // 2fb: ifne 2b2
      // 2fe: iload 5
      // 300: iload 2
      // 301: ifeq 36c
      // 304: ifeq 361
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: iload 4
      // 310: sipush 26107
      // 313: ldc2_w 2081374444732725480
      // 316: invokestatic com/finalshell/core/U9.a (IJ)I
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: iload 2
      // 321: ifeq 34d
      // 324: if_icmpeq 339
      // 327: goto 32e
      // 32a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32d: athrow
      // 32e: aload 0
      // 32f: bipush -1
      // 330: putfield com/finalshell/core/U9.z I
      // 333: aconst_null
      // 334: areturn
      // 335: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 338: athrow
      // 339: aload 0
      // 33a: aload 0
      // 33b: getfield com/finalshell/core/U9.d I
      // 33e: iload 3
      // 33f: iinc 3 1
      // 342: iadd
      // 343: invokevirtual com/finalshell/core/U9.C (I)C
      // 346: istore 4
      // 348: aload 0
      // 349: getfield com/finalshell/core/U9.d I
      // 34c: bipush 1
      // 34d: iadd
      // 34e: istore 10
      // 350: aload 0
      // 351: getfield com/finalshell/core/U9.d I
      // 354: iload 3
      // 355: iadd
      // 356: iload 10
      // 358: isub
      // 359: bipush 2
      // 35a: isub
      // 35b: istore 11
      // 35d: iload 2
      // 35e: ifne 37b
      // 361: aload 0
      // 362: getfield com/finalshell/core/U9.d I
      // 365: goto 36c
      // 368: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36b: athrow
      // 36c: istore 10
      // 36e: aload 0
      // 36f: getfield com/finalshell/core/U9.d I
      // 372: iload 3
      // 373: iadd
      // 374: iload 10
      // 376: isub
      // 377: bipush 1
      // 378: isub
      // 379: istore 11
      // 37b: iload 11
      // 37d: sipush 28697
      // 380: ldc2_w 6865322254820814080
      // 383: invokestatic com/finalshell/core/U9.a (IJ)I
      // 386: if_icmple 39e
      // 389: new com/finalshell/core/Hi2
      // 38c: dup
      // 38d: sipush 10535
      // 390: sipush 3143
      // 393: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 396: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 399: athrow
      // 39a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 0
      // 39f: iload 10
      // 3a1: iload 11
      // 3a3: invokevirtual com/finalshell/core/U9.s (II)[C
      // 3a6: astore 12
      // 3a8: new java/math/BigDecimal
      // 3ab: dup
      // 3ac: aload 12
      // 3ae: bipush 0
      // 3af: aload 12
      // 3b1: arraylength
      // 3b2: getstatic java/math/MathContext.UNLIMITED Ljava/math/MathContext;
      // 3b5: invokespecial java/math/BigDecimal.<init> ([CIILjava/math/MathContext;)V
      // 3b8: astore 7
      // 3ba: iload 2
      // 3bb: ifne 596
      // 3be: iload 4
      // 3c0: sipush 7800
      // 3c3: ldc2_w 5201320676148134657
      // 3c6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c9: goto 3d0
      // 3cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cf: athrow
      // 3d0: iload 2
      // 3d1: ifeq 403
      // 3d4: if_icmpne 58f
      // 3d7: goto 3de
      // 3da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dd: athrow
      // 3de: aload 0
      // 3df: aload 0
      // 3e0: getfield com/finalshell/core/U9.d I
      // 3e3: iload 3
      // 3e4: iadd
      // 3e5: iload 2
      // 3e6: ifeq 591
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: invokevirtual com/finalshell/core/U9.C (I)C
      // 3f3: sipush 25252
      // 3f6: ldc2_w 2256381802227974060
      // 3f9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: if_icmpne 58f
      // 406: aload 0
      // 407: aload 0
      // 408: getfield com/finalshell/core/U9.d I
      // 40b: iload 3
      // 40c: iadd
      // 40d: bipush 1
      // 40e: iadd
      // 40f: iload 2
      // 410: ifeq 591
      // 413: goto 41a
      // 416: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 419: athrow
      // 41a: invokevirtual com/finalshell/core/U9.C (I)C
      // 41d: sipush 7325
      // 420: ldc2_w 7975301603790307833
      // 423: invokestatic com/finalshell/core/U9.a (IJ)I
      // 426: if_icmpne 58f
      // 429: goto 430
      // 42c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42f: athrow
      // 430: aload 0
      // 431: aload 0
      // 432: getfield com/finalshell/core/U9.d I
      // 435: iload 3
      // 436: iadd
      // 437: bipush 2
      // 438: iadd
      // 439: iload 2
      // 43a: ifeq 591
      // 43d: goto 444
      // 440: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 443: athrow
      // 444: invokevirtual com/finalshell/core/U9.C (I)C
      // 447: sipush 7325
      // 44a: ldc2_w 7975301603790307833
      // 44d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 450: if_icmpne 58f
      // 453: goto 45a
      // 456: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 459: athrow
      // 45a: aload 0
      // 45b: sipush 19103
      // 45e: ldc2_w 2592984034142099420
      // 461: invokestatic com/finalshell/core/U9.a (IJ)I
      // 464: putfield com/finalshell/core/U9.z I
      // 467: aconst_null
      // 468: astore 7
      // 46a: iinc 3 3
      // 46d: aload 0
      // 46e: aload 0
      // 46f: getfield com/finalshell/core/U9.d I
      // 472: iload 3
      // 473: iinc 3 1
      // 476: iadd
      // 477: invokevirtual com/finalshell/core/U9.C (I)C
      // 47a: istore 4
      // 47c: iload 5
      // 47e: iload 2
      // 47f: ifeq 4bd
      // 482: ifeq 4bb
      // 485: goto 48c
      // 488: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48b: athrow
      // 48c: iload 4
      // 48e: sipush 26107
      // 491: ldc2_w 2081374444732725480
      // 494: invokestatic com/finalshell/core/U9.a (IJ)I
      // 497: iload 2
      // 498: ifeq 4c6
      // 49b: goto 4a2
      // 49e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a1: athrow
      // 4a2: if_icmpne 4bb
      // 4a5: goto 4ac
      // 4a8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ab: athrow
      // 4ac: aload 0
      // 4ad: aload 0
      // 4ae: getfield com/finalshell/core/U9.d I
      // 4b1: iload 3
      // 4b2: iinc 3 1
      // 4b5: iadd
      // 4b6: invokevirtual com/finalshell/core/U9.C (I)C
      // 4b9: istore 4
      // 4bb: iload 4
      // 4bd: sipush 26927
      // 4c0: ldc2_w 6101958691031889140
      // 4c3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c6: if_icmpne 50b
      // 4c9: aload 0
      // 4ca: dup
      // 4cb: getfield com/finalshell/core/U9.d I
      // 4ce: iload 3
      // 4cf: iadd
      // 4d0: putfield com/finalshell/core/U9.d I
      // 4d3: aload 0
      // 4d4: aload 0
      // 4d5: aload 0
      // 4d6: getfield com/finalshell/core/U9.d I
      // 4d9: invokevirtual com/finalshell/core/U9.C (I)C
      // 4dc: putfield com/finalshell/core/U9.l C
      // 4df: aload 0
      // 4e0: sipush 19103
      // 4e3: ldc2_w 2592984034142099420
      // 4e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4e9: putfield com/finalshell/core/U9.z I
      // 4ec: aload 0
      // 4ed: sipush 9361
      // 4f0: ldc2_w 2488456831667599749
      // 4f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f6: putfield com/finalshell/core/U9.Y I
      // 4f9: aload 7
      // 4fb: iload 2
      // 4fc: ifeq 58e
      // 4ff: goto 506
      // 502: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 505: athrow
      // 506: areturn
      // 507: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50a: athrow
      // 50b: iload 4
      // 50d: iload 2
      // 50e: ifeq 560
      // 511: sipush 4784
      // 514: ldc2_w 3082167687830622095
      // 517: invokestatic com/finalshell/core/U9.a (IJ)I
      // 51a: if_icmpne 55b
      // 51d: goto 524
      // 520: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 523: athrow
      // 524: aload 0
      // 525: dup
      // 526: getfield com/finalshell/core/U9.d I
      // 529: iload 3
      // 52a: iadd
      // 52b: putfield com/finalshell/core/U9.d I
      // 52e: aload 0
      // 52f: aload 0
      // 530: aload 0
      // 531: getfield com/finalshell/core/U9.d I
      // 534: invokevirtual com/finalshell/core/U9.C (I)C
      // 537: putfield com/finalshell/core/U9.l C
      // 53a: aload 0
      // 53b: sipush 19103
      // 53e: ldc2_w 2592984034142099420
      // 541: invokestatic com/finalshell/core/U9.a (IJ)I
      // 544: putfield com/finalshell/core/U9.z I
      // 547: aload 0
      // 548: sipush 16923
      // 54b: ldc2_w 1571494982232874791
      // 54e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 551: putfield com/finalshell/core/U9.Y I
      // 554: aload 7
      // 556: areturn
      // 557: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55a: athrow
      // 55b: iload 4
      // 55d: invokestatic com/finalshell/core/U9.Y (C)Z
      // 560: iload 2
      // 561: ifeq 582
      // 564: ifeq 588
      // 567: goto 56e
      // 56a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56d: athrow
      // 56e: aload 0
      // 56f: aload 0
      // 570: getfield com/finalshell/core/U9.d I
      // 573: iload 3
      // 574: iinc 3 1
      // 577: iadd
      // 578: invokevirtual com/finalshell/core/U9.C (I)C
      // 57b: goto 582
      // 57e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 581: athrow
      // 582: istore 4
      // 584: iload 2
      // 585: ifne 4bb
      // 588: aload 0
      // 589: bipush -1
      // 58a: putfield com/finalshell/core/U9.z I
      // 58d: aconst_null
      // 58e: areturn
      // 58f: aload 0
      // 590: bipush -1
      // 591: putfield com/finalshell/core/U9.z I
      // 594: aconst_null
      // 595: areturn
      // 596: iload 4
      // 598: sipush 26927
      // 59b: ldc2_w 6101958691031889140
      // 59e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a1: iload 2
      // 5a2: ifeq 5f1
      // 5a5: if_icmpne 5e6
      // 5a8: goto 5af
      // 5ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ae: athrow
      // 5af: aload 0
      // 5b0: dup
      // 5b1: getfield com/finalshell/core/U9.d I
      // 5b4: iload 3
      // 5b5: iadd
      // 5b6: putfield com/finalshell/core/U9.d I
      // 5b9: aload 0
      // 5ba: aload 0
      // 5bb: aload 0
      // 5bc: getfield com/finalshell/core/U9.d I
      // 5bf: invokevirtual com/finalshell/core/U9.C (I)C
      // 5c2: putfield com/finalshell/core/U9.l C
      // 5c5: aload 0
      // 5c6: sipush 5887
      // 5c9: ldc2_w 3467391210321595353
      // 5cc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5cf: putfield com/finalshell/core/U9.z I
      // 5d2: aload 0
      // 5d3: sipush 9361
      // 5d6: ldc2_w 2488456831667599749
      // 5d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5dc: putfield com/finalshell/core/U9.Y I
      // 5df: aload 7
      // 5e1: areturn
      // 5e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e5: athrow
      // 5e6: iload 4
      // 5e8: sipush 30337
      // 5eb: ldc2_w 2029800848590515112
      // 5ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5f1: iload 2
      // 5f2: ifeq 619
      // 5f5: if_icmpne 753
      // 5f8: goto 5ff
      // 5fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fe: athrow
      // 5ff: aload 0
      // 600: aload 0
      // 601: getfield com/finalshell/core/U9.d I
      // 604: iload 3
      // 605: iinc 3 1
      // 608: iadd
      // 609: invokevirtual com/finalshell/core/U9.C (I)C
      // 60c: istore 4
      // 60e: iload 4
      // 610: sipush 26927
      // 613: ldc2_w 6101958691031889140
      // 616: invokestatic com/finalshell/core/U9.a (IJ)I
      // 619: iload 2
      // 61a: ifeq 667
      // 61d: if_icmpne 655
      // 620: goto 627
      // 623: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 626: athrow
      // 627: aload 0
      // 628: sipush 9361
      // 62b: ldc2_w 2488456831667599749
      // 62e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 631: putfield com/finalshell/core/U9.Y I
      // 634: aload 0
      // 635: dup
      // 636: getfield com/finalshell/core/U9.d I
      // 639: iload 3
      // 63a: iadd
      // 63b: putfield com/finalshell/core/U9.d I
      // 63e: aload 0
      // 63f: aload 0
      // 640: aload 0
      // 641: getfield com/finalshell/core/U9.d I
      // 644: invokevirtual com/finalshell/core/U9.C (I)C
      // 647: putfield com/finalshell/core/U9.l C
      // 64a: iload 2
      // 64b: ifne 742
      // 64e: goto 655
      // 651: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 654: athrow
      // 655: iload 4
      // 657: sipush 30337
      // 65a: ldc2_w 2029800848590515112
      // 65d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 660: goto 667
      // 663: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 666: athrow
      // 667: iload 2
      // 668: ifeq 6b5
      // 66b: if_icmpne 6a3
      // 66e: goto 675
      // 671: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 674: athrow
      // 675: aload 0
      // 676: sipush 9145
      // 679: ldc2_w 6577731744871808687
      // 67c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 67f: putfield com/finalshell/core/U9.Y I
      // 682: aload 0
      // 683: dup
      // 684: getfield com/finalshell/core/U9.d I
      // 687: iload 3
      // 688: iadd
      // 689: putfield com/finalshell/core/U9.d I
      // 68c: aload 0
      // 68d: aload 0
      // 68e: aload 0
      // 68f: getfield com/finalshell/core/U9.d I
      // 692: invokevirtual com/finalshell/core/U9.C (I)C
      // 695: putfield com/finalshell/core/U9.l C
      // 698: iload 2
      // 699: ifne 742
      // 69c: goto 6a3
      // 69f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a2: athrow
      // 6a3: iload 4
      // 6a5: sipush 4784
      // 6a8: ldc2_w 3082167687830622095
      // 6ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6ae: goto 6b5
      // 6b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b4: athrow
      // 6b5: iload 2
      // 6b6: ifeq 703
      // 6b9: if_icmpne 6f1
      // 6bc: goto 6c3
      // 6bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c2: athrow
      // 6c3: aload 0
      // 6c4: sipush 16923
      // 6c7: ldc2_w 1571494982232874791
      // 6ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6cd: putfield com/finalshell/core/U9.Y I
      // 6d0: aload 0
      // 6d1: dup
      // 6d2: getfield com/finalshell/core/U9.d I
      // 6d5: iload 3
      // 6d6: iadd
      // 6d7: putfield com/finalshell/core/U9.d I
      // 6da: aload 0
      // 6db: aload 0
      // 6dc: aload 0
      // 6dd: getfield com/finalshell/core/U9.d I
      // 6e0: invokevirtual com/finalshell/core/U9.C (I)C
      // 6e3: putfield com/finalshell/core/U9.l C
      // 6e6: iload 2
      // 6e7: ifne 742
      // 6ea: goto 6f1
      // 6ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f0: athrow
      // 6f1: iload 4
      // 6f3: sipush 2765
      // 6f6: ldc2_w 8216137057917720563
      // 6f9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6fc: goto 703
      // 6ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 702: athrow
      // 703: if_icmpne 737
      // 706: aload 0
      // 707: sipush 9907
      // 70a: ldc2_w 514190805586246625
      // 70d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 710: putfield com/finalshell/core/U9.Y I
      // 713: aload 0
      // 714: dup
      // 715: getfield com/finalshell/core/U9.d I
      // 718: iload 3
      // 719: bipush 1
      // 71a: isub
      // 71b: iadd
      // 71c: putfield com/finalshell/core/U9.d I
      // 71f: aload 0
      // 720: sipush 2765
      // 723: ldc2_w 8216137057917720563
      // 726: invokestatic com/finalshell/core/U9.a (IJ)I
      // 729: putfield com/finalshell/core/U9.l C
      // 72c: iload 2
      // 72d: ifne 742
      // 730: goto 737
      // 733: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 736: athrow
      // 737: aload 0
      // 738: bipush -1
      // 739: putfield com/finalshell/core/U9.z I
      // 73c: aconst_null
      // 73d: areturn
      // 73e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 741: athrow
      // 742: aload 0
      // 743: sipush 2897
      // 746: ldc2_w 695568451002816123
      // 749: invokestatic com/finalshell/core/U9.a (IJ)I
      // 74c: putfield com/finalshell/core/U9.z I
      // 74f: iload 2
      // 750: ifne 75e
      // 753: aload 0
      // 754: bipush -1
      // 755: putfield com/finalshell/core/U9.z I
      // 758: aconst_null
      // 759: areturn
      // 75a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75d: athrow
      // 75e: aload 7
      // 760: areturn
   }

   public final float[] O(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 085
      // 047: sipush 31790
      // 04a: ldc2_w 4972276358763192576
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpeq 06d
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: sipush 4469
      // 05e: ldc2_w 8451788941981764676
      // 061: invokestatic com/finalshell/core/U9.a (IJ)I
      // 064: putfield com/finalshell/core/U9.z I
      // 067: aconst_null
      // 068: areturn
      // 069: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/U9.d I
      // 072: iload 3
      // 073: iinc 3 1
      // 076: iadd
      // 077: invokevirtual com/finalshell/core/U9.C (I)C
      // 07a: istore 4
      // 07c: sipush 9361
      // 07f: ldc2_w 2488456831667599749
      // 082: invokestatic com/finalshell/core/U9.a (IJ)I
      // 085: newarray 6
      // 087: astore 5
      // 089: bipush 0
      // 08a: istore 6
      // 08c: aload 0
      // 08d: getfield com/finalshell/core/U9.d I
      // 090: iload 3
      // 091: iadd
      // 092: bipush 1
      // 093: isub
      // 094: istore 7
      // 096: iload 4
      // 098: sipush 19418
      // 09b: ldc2_w 715321441499911916
      // 09e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a1: if_icmpne 0b0
      // 0a4: bipush 1
      // 0a5: iload 2
      // 0a6: ifne 0b1
      // 0a9: goto 0b1
      // 0ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: istore 8
      // 0b3: iload 8
      // 0b5: iload 2
      // 0b6: ifne 0d4
      // 0b9: ifeq 0d2
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: aload 0
      // 0c5: getfield com/finalshell/core/U9.d I
      // 0c8: iload 3
      // 0c9: iinc 3 1
      // 0cc: iadd
      // 0cd: invokevirtual com/finalshell/core/U9.C (I)C
      // 0d0: istore 4
      // 0d2: iload 4
      // 0d4: sipush 21259
      // 0d7: ldc2_w 1287927339301015045
      // 0da: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0dd: iload 2
      // 0de: ifne 0fd
      // 0e1: if_icmplt 4b6
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: iload 4
      // 0ed: sipush 24153
      // 0f0: ldc2_w 3168790736949871469
      // 0f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 11d
      // 101: if_icmpgt 4b6
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: iload 4
      // 10d: sipush 21259
      // 110: ldc2_w 1287927339301015045
      // 113: invokestatic com/finalshell/core/U9.a (IJ)I
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: isub
      // 11e: istore 9
      // 120: aload 0
      // 121: aload 0
      // 122: getfield com/finalshell/core/U9.d I
      // 125: iload 3
      // 126: iinc 3 1
      // 129: iadd
      // 12a: invokevirtual com/finalshell/core/U9.C (I)C
      // 12d: istore 4
      // 12f: iload 4
      // 131: sipush 21259
      // 134: ldc2_w 1287927339301015045
      // 137: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13a: if_icmplt 179
      // 13d: iload 4
      // 13f: iload 2
      // 140: ifne 17a
      // 143: sipush 24153
      // 146: ldc2_w 3168790736949871469
      // 149: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14c: iload 2
      // 14d: ifne 0a1
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: if_icmpgt 179
      // 15a: iload 9
      // 15c: sipush 1861
      // 15f: ldc2_w 5349631099953699429
      // 162: invokestatic com/finalshell/core/U9.a (IJ)I
      // 165: imul
      // 166: iload 4
      // 168: sipush 21259
      // 16b: ldc2_w 1287927339301015045
      // 16e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 171: isub
      // 172: iadd
      // 173: istore 9
      // 175: iload 2
      // 176: ifeq 120
      // 179: bipush 1
      // 17a: istore 10
      // 17c: iload 4
      // 17e: iload 2
      // 17f: ifne 19d
      // 182: sipush 19110
      // 185: ldc2_w 4854799824381581179
      // 188: invokestatic com/finalshell/core/U9.a (IJ)I
      // 18b: if_icmpne 1a0
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: bipush 1
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: goto 1a1
      // 1a0: bipush 0
      // 1a1: istore 11
      // 1a3: iload 11
      // 1a5: iload 2
      // 1a6: ifne 29f
      // 1a9: ifeq 29d
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: aload 0
      // 1b5: getfield com/finalshell/core/U9.d I
      // 1b8: iload 3
      // 1b9: iinc 3 1
      // 1bc: iadd
      // 1bd: invokevirtual com/finalshell/core/U9.C (I)C
      // 1c0: istore 4
      // 1c2: sipush 1861
      // 1c5: ldc2_w 5349631099953699429
      // 1c8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1cb: istore 10
      // 1cd: iload 2
      // 1ce: ifne 29b
      // 1d1: iload 4
      // 1d3: sipush 21259
      // 1d6: ldc2_w 1287927339301015045
      // 1d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1dc: if_icmplt 296
      // 1df: goto 1e6
      // 1e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: iload 4
      // 1e8: sipush 24153
      // 1eb: ldc2_w 3168790736949871469
      // 1ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f1: iload 2
      // 1f2: ifne 225
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: if_icmpgt 296
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: iload 9
      // 208: sipush 1861
      // 20b: ldc2_w 5349631099953699429
      // 20e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 211: imul
      // 212: iload 4
      // 214: sipush 21259
      // 217: ldc2_w 1287927339301015045
      // 21a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 21d: isub
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: iadd
      // 226: istore 9
      // 228: aload 0
      // 229: aload 0
      // 22a: getfield com/finalshell/core/U9.d I
      // 22d: iload 3
      // 22e: iinc 3 1
      // 231: iadd
      // 232: invokevirtual com/finalshell/core/U9.C (I)C
      // 235: istore 4
      // 237: iload 4
      // 239: sipush 21259
      // 23c: ldc2_w 1287927339301015045
      // 23f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 242: if_icmplt 29d
      // 245: iload 4
      // 247: sipush 24153
      // 24a: ldc2_w 3168790736949871469
      // 24d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 250: iload 2
      // 251: ifne 2b3
      // 254: iload 2
      // 255: ifne 2b3
      // 258: goto 25f
      // 25b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: if_icmpgt 29d
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: iload 9
      // 26b: sipush 1861
      // 26e: ldc2_w 5349631099953699429
      // 271: invokestatic com/finalshell/core/U9.a (IJ)I
      // 274: imul
      // 275: iload 4
      // 277: sipush 21259
      // 27a: ldc2_w 1287927339301015045
      // 27d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 280: isub
      // 281: iadd
      // 282: istore 9
      // 284: iload 10
      // 286: sipush 1861
      // 289: ldc2_w 5349631099953699429
      // 28c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28f: imul
      // 290: istore 10
      // 292: iload 2
      // 293: ifeq 228
      // 296: aload 0
      // 297: bipush -1
      // 298: putfield com/finalshell/core/U9.z I
      // 29b: aconst_null
      // 29c: areturn
      // 29d: iload 4
      // 29f: iload 2
      // 2a0: ifne 2de
      // 2a3: sipush 16831
      // 2a6: ldc2_w 1205696545576721607
      // 2a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ac: goto 2b3
      // 2af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: if_icmpeq 2d6
      // 2b6: iload 4
      // 2b8: iload 2
      // 2b9: ifne 2de
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: sipush 19786
      // 2c6: ldc2_w 559752938502885485
      // 2c9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2cc: if_icmpne 2e1
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: bipush 1
      // 2d7: goto 2de
      // 2da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dd: athrow
      // 2de: goto 2e2
      // 2e1: bipush 0
      // 2e2: istore 12
      // 2e4: iload 12
      // 2e6: iload 2
      // 2e7: ifne 3a9
      // 2ea: ifeq 39e
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: aload 0
      // 2f5: aload 0
      // 2f6: getfield com/finalshell/core/U9.d I
      // 2f9: iload 3
      // 2fa: iinc 3 1
      // 2fd: iadd
      // 2fe: invokevirtual com/finalshell/core/U9.C (I)C
      // 301: istore 4
      // 303: iload 4
      // 305: iload 2
      // 306: ifne 350
      // 309: sipush 22734
      // 30c: ldc2_w 9000764304867362202
      // 30f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 312: if_icmpeq 33c
      // 315: goto 31c
      // 318: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31b: athrow
      // 31c: iload 4
      // 31e: sipush 19418
      // 321: ldc2_w 715321441499911916
      // 324: invokestatic com/finalshell/core/U9.a (IJ)I
      // 327: iload 2
      // 328: ifne 35d
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: if_icmpne 352
      // 335: goto 33c
      // 338: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: aload 0
      // 33d: aload 0
      // 33e: getfield com/finalshell/core/U9.d I
      // 341: iload 3
      // 342: iinc 3 1
      // 345: iadd
      // 346: invokevirtual com/finalshell/core/U9.C (I)C
      // 349: goto 350
      // 34c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34f: athrow
      // 350: istore 4
      // 352: iload 4
      // 354: sipush 21259
      // 357: ldc2_w 1287927339301015045
      // 35a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35d: if_icmplt 39e
      // 360: iload 4
      // 362: sipush 24153
      // 365: ldc2_w 3168790736949871469
      // 368: invokestatic com/finalshell/core/U9.a (IJ)I
      // 36b: iload 2
      // 36c: ifne 3a8
      // 36f: goto 376
      // 372: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 375: athrow
      // 376: iload 2
      // 377: ifne 3a8
      // 37a: goto 381
      // 37d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 380: athrow
      // 381: if_icmpgt 39e
      // 384: goto 38b
      // 387: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38a: athrow
      // 38b: aload 0
      // 38c: aload 0
      // 38d: getfield com/finalshell/core/U9.d I
      // 390: iload 3
      // 391: iinc 3 1
      // 394: iadd
      // 395: invokevirtual com/finalshell/core/U9.C (I)C
      // 398: istore 4
      // 39a: iload 2
      // 39b: ifeq 352
      // 39e: aload 0
      // 39f: getfield com/finalshell/core/U9.d I
      // 3a2: iload 3
      // 3a3: iadd
      // 3a4: iload 7
      // 3a6: isub
      // 3a7: bipush 1
      // 3a8: isub
      // 3a9: istore 13
      // 3ab: iload 12
      // 3ad: iload 2
      // 3ae: ifne 3bd
      // 3b1: ifne 3fd
      // 3b4: goto 3bb
      // 3b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ba: athrow
      // 3bb: iload 13
      // 3bd: iload 2
      // 3be: ifne 3dd
      // 3c1: sipush 1861
      // 3c4: ldc2_w 5349631099953699429
      // 3c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ca: if_icmpge 3fd
      // 3cd: goto 3d4
      // 3d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d3: athrow
      // 3d4: iload 9
      // 3d6: goto 3dd
      // 3d9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dc: athrow
      // 3dd: i2f
      // 3de: iload 10
      // 3e0: i2f
      // 3e1: fdiv
      // 3e2: fstore 14
      // 3e4: iload 8
      // 3e6: iload 2
      // 3e7: ifne 410
      // 3ea: ifeq 40e
      // 3ed: goto 3f4
      // 3f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f3: athrow
      // 3f4: fload 14
      // 3f6: fneg
      // 3f7: fstore 14
      // 3f9: iload 2
      // 3fa: ifeq 40e
      // 3fd: aload 0
      // 3fe: iload 7
      // 400: iload 13
      // 402: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 405: astore 15
      // 407: aload 15
      // 409: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 40c: fstore 14
      // 40e: iload 6
      // 410: aload 5
      // 412: arraylength
      // 413: iload 2
      // 414: ifne 450
      // 417: if_icmplt 43b
      // 41a: goto 421
      // 41d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: aload 5
      // 423: arraylength
      // 424: bipush 3
      // 425: imul
      // 426: bipush 2
      // 427: idiv
      // 428: newarray 6
      // 42a: astore 15
      // 42c: aload 5
      // 42e: bipush 0
      // 42f: aload 15
      // 431: bipush 0
      // 432: iload 6
      // 434: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 437: aload 15
      // 439: astore 5
      // 43b: aload 5
      // 43d: iload 6
      // 43f: iinc 6 1
      // 442: fload 14
      // 444: fastore
      // 445: iload 4
      // 447: sipush 26927
      // 44a: ldc2_w 6101958691031889140
      // 44d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 450: iload 2
      // 451: ifne 48e
      // 454: if_icmpne 471
      // 457: goto 45e
      // 45a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45d: athrow
      // 45e: aload 0
      // 45f: aload 0
      // 460: getfield com/finalshell/core/U9.d I
      // 463: iload 3
      // 464: iinc 3 1
      // 467: iadd
      // 468: invokevirtual com/finalshell/core/U9.C (I)C
      // 46b: istore 4
      // 46d: iload 2
      // 46e: ifeq 4ab
      // 471: iload 4
      // 473: iload 2
      // 474: ifne 4a5
      // 477: goto 47e
      // 47a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47d: athrow
      // 47e: sipush 30337
      // 481: ldc2_w 2029800848590515112
      // 484: invokestatic com/finalshell/core/U9.a (IJ)I
      // 487: goto 48e
      // 48a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48d: athrow
      // 48e: if_icmpne 4ab
      // 491: aload 0
      // 492: aload 0
      // 493: getfield com/finalshell/core/U9.d I
      // 496: iload 3
      // 497: iinc 3 1
      // 49a: iadd
      // 49b: invokevirtual com/finalshell/core/U9.C (I)C
      // 49e: goto 4a5
      // 4a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a4: athrow
      // 4a5: istore 4
      // 4a7: iload 2
      // 4a8: ifeq 4c5
      // 4ab: iload 2
      // 4ac: ifeq 4c1
      // 4af: goto 4b6
      // 4b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b5: athrow
      // 4b6: aload 0
      // 4b7: bipush -1
      // 4b8: putfield com/finalshell/core/U9.z I
      // 4bb: aconst_null
      // 4bc: areturn
      // 4bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c0: athrow
      // 4c1: iload 2
      // 4c2: ifeq 08c
      // 4c5: iload 6
      // 4c7: aload 5
      // 4c9: arraylength
      // 4ca: iload 2
      // 4cb: ifne 4f8
      // 4ce: if_icmpeq 4ed
      // 4d1: goto 4d8
      // 4d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d7: athrow
      // 4d8: iload 6
      // 4da: newarray 6
      // 4dc: astore 7
      // 4de: aload 5
      // 4e0: bipush 0
      // 4e1: aload 7
      // 4e3: bipush 0
      // 4e4: iload 6
      // 4e6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 4e9: aload 7
      // 4eb: astore 5
      // 4ed: iload 4
      // 4ef: sipush 26927
      // 4f2: ldc2_w 6101958691031889140
      // 4f5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f8: iload 2
      // 4f9: ifne 543
      // 4fc: if_icmpne 538
      // 4ff: goto 506
      // 502: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 505: athrow
      // 506: aload 0
      // 507: dup
      // 508: getfield com/finalshell/core/U9.d I
      // 50b: iload 3
      // 50c: bipush 1
      // 50d: isub
      // 50e: iadd
      // 50f: putfield com/finalshell/core/U9.d I
      // 512: aload 0
      // 513: invokevirtual com/finalshell/core/U9.C$char ()C
      // 516: pop
      // 517: aload 0
      // 518: sipush 5887
      // 51b: ldc2_w 3467391210321595353
      // 51e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 521: putfield com/finalshell/core/U9.z I
      // 524: aload 0
      // 525: sipush 9361
      // 528: ldc2_w 2488456831667599749
      // 52b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 52e: putfield com/finalshell/core/U9.Y I
      // 531: aload 5
      // 533: areturn
      // 534: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 537: athrow
      // 538: iload 4
      // 53a: sipush 4784
      // 53d: ldc2_w 3082167687830622095
      // 540: invokestatic com/finalshell/core/U9.a (IJ)I
      // 543: iload 2
      // 544: ifne 56b
      // 547: if_icmpne 696
      // 54a: goto 551
      // 54d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 550: athrow
      // 551: aload 0
      // 552: aload 0
      // 553: getfield com/finalshell/core/U9.d I
      // 556: iload 3
      // 557: iinc 3 1
      // 55a: iadd
      // 55b: invokevirtual com/finalshell/core/U9.C (I)C
      // 55e: istore 4
      // 560: iload 4
      // 562: sipush 26927
      // 565: ldc2_w 6101958691031889140
      // 568: invokestatic com/finalshell/core/U9.a (IJ)I
      // 56b: iload 2
      // 56c: ifne 5b4
      // 56f: if_icmpne 5a2
      // 572: goto 579
      // 575: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 578: athrow
      // 579: aload 0
      // 57a: sipush 9361
      // 57d: ldc2_w 2488456831667599749
      // 580: invokestatic com/finalshell/core/U9.a (IJ)I
      // 583: putfield com/finalshell/core/U9.Y I
      // 586: aload 0
      // 587: dup
      // 588: getfield com/finalshell/core/U9.d I
      // 58b: iload 3
      // 58c: bipush 1
      // 58d: isub
      // 58e: iadd
      // 58f: putfield com/finalshell/core/U9.d I
      // 592: aload 0
      // 593: invokevirtual com/finalshell/core/U9.C$char ()C
      // 596: pop
      // 597: iload 2
      // 598: ifeq 685
      // 59b: goto 5a2
      // 59e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a1: athrow
      // 5a2: iload 4
      // 5a4: sipush 30337
      // 5a7: ldc2_w 2029800848590515112
      // 5aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5ad: goto 5b4
      // 5b0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b3: athrow
      // 5b4: iload 2
      // 5b5: ifne 5fd
      // 5b8: if_icmpne 5eb
      // 5bb: goto 5c2
      // 5be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c1: athrow
      // 5c2: aload 0
      // 5c3: sipush 9145
      // 5c6: ldc2_w 6577731744871808687
      // 5c9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5cc: putfield com/finalshell/core/U9.Y I
      // 5cf: aload 0
      // 5d0: dup
      // 5d1: getfield com/finalshell/core/U9.d I
      // 5d4: iload 3
      // 5d5: bipush 1
      // 5d6: isub
      // 5d7: iadd
      // 5d8: putfield com/finalshell/core/U9.d I
      // 5db: aload 0
      // 5dc: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5df: pop
      // 5e0: iload 2
      // 5e1: ifeq 685
      // 5e4: goto 5eb
      // 5e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ea: athrow
      // 5eb: iload 4
      // 5ed: sipush 4784
      // 5f0: ldc2_w 3082167687830622095
      // 5f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5f6: goto 5fd
      // 5f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fc: athrow
      // 5fd: iload 2
      // 5fe: ifne 646
      // 601: if_icmpne 634
      // 604: goto 60b
      // 607: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60a: athrow
      // 60b: aload 0
      // 60c: sipush 16923
      // 60f: ldc2_w 1571494982232874791
      // 612: invokestatic com/finalshell/core/U9.a (IJ)I
      // 615: putfield com/finalshell/core/U9.Y I
      // 618: aload 0
      // 619: dup
      // 61a: getfield com/finalshell/core/U9.d I
      // 61d: iload 3
      // 61e: bipush 1
      // 61f: isub
      // 620: iadd
      // 621: putfield com/finalshell/core/U9.d I
      // 624: aload 0
      // 625: invokevirtual com/finalshell/core/U9.C$char ()C
      // 628: pop
      // 629: iload 2
      // 62a: ifeq 685
      // 62d: goto 634
      // 630: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 633: athrow
      // 634: iload 4
      // 636: sipush 2765
      // 639: ldc2_w 8216137057917720563
      // 63c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 63f: goto 646
      // 642: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 645: athrow
      // 646: if_icmpne 67a
      // 649: aload 0
      // 64a: dup
      // 64b: getfield com/finalshell/core/U9.d I
      // 64e: iload 3
      // 64f: bipush 1
      // 650: isub
      // 651: iadd
      // 652: putfield com/finalshell/core/U9.d I
      // 655: aload 0
      // 656: sipush 9907
      // 659: ldc2_w 514190805586246625
      // 65c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 65f: putfield com/finalshell/core/U9.Y I
      // 662: aload 0
      // 663: sipush 2765
      // 666: ldc2_w 8216137057917720563
      // 669: invokestatic com/finalshell/core/U9.a (IJ)I
      // 66c: putfield com/finalshell/core/U9.l C
      // 66f: iload 2
      // 670: ifeq 685
      // 673: goto 67a
      // 676: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 679: athrow
      // 67a: aload 0
      // 67b: bipush -1
      // 67c: putfield com/finalshell/core/U9.z I
      // 67f: aconst_null
      // 680: areturn
      // 681: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 684: athrow
      // 685: aload 0
      // 686: sipush 2897
      // 689: ldc2_w 695568451002816123
      // 68c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 68f: putfield com/finalshell/core/U9.z I
      // 692: iload 2
      // 693: ifeq 6a1
      // 696: aload 0
      // 697: bipush -1
      // 698: putfield com/finalshell/core/U9.z I
      // 69b: aconst_null
      // 69c: areturn
      // 69d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a0: athrow
      // 6a1: aload 5
      // 6a3: areturn
   }

   public final float[][] P$arrarrfloat(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 085
      // 047: sipush 31790
      // 04a: ldc2_w 4972276358763192576
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpeq 06d
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: sipush 4469
      // 05e: ldc2_w 8451788941981764676
      // 061: invokestatic com/finalshell/core/U9.a (IJ)I
      // 064: putfield com/finalshell/core/U9.z I
      // 067: aconst_null
      // 068: areturn
      // 069: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/U9.d I
      // 072: iload 3
      // 073: iinc 3 1
      // 076: iadd
      // 077: invokevirtual com/finalshell/core/U9.C (I)C
      // 07a: istore 4
      // 07c: sipush 9361
      // 07f: ldc2_w 2488456831667599749
      // 082: invokestatic com/finalshell/core/U9.a (IJ)I
      // 085: anewarray 721
      // 088: astore 5
      // 08a: bipush 0
      // 08b: istore 6
      // 08d: iload 4
      // 08f: sipush 31790
      // 092: ldc2_w 4972276358763192576
      // 095: invokestatic com/finalshell/core/U9.a (IJ)I
      // 098: if_icmpne 5aa
      // 09b: aload 0
      // 09c: aload 0
      // 09d: getfield com/finalshell/core/U9.d I
      // 0a0: iload 3
      // 0a1: iinc 3 1
      // 0a4: iadd
      // 0a5: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a8: istore 4
      // 0aa: sipush 9361
      // 0ad: ldc2_w 2488456831667599749
      // 0b0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b3: newarray 6
      // 0b5: astore 7
      // 0b7: bipush 0
      // 0b8: iload 2
      // 0b9: ifne 5ac
      // 0bc: istore 8
      // 0be: aload 0
      // 0bf: getfield com/finalshell/core/U9.d I
      // 0c2: iload 3
      // 0c3: iadd
      // 0c4: bipush 1
      // 0c5: isub
      // 0c6: istore 9
      // 0c8: iload 4
      // 0ca: sipush 19418
      // 0cd: ldc2_w 715321441499911916
      // 0d0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d3: if_icmpne 0e2
      // 0d6: bipush 1
      // 0d7: iload 2
      // 0d8: ifne 0e3
      // 0db: goto 0e3
      // 0de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: bipush 0
      // 0e3: istore 10
      // 0e5: iload 10
      // 0e7: iload 2
      // 0e8: ifne 106
      // 0eb: ifeq 104
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: aload 0
      // 0f7: getfield com/finalshell/core/U9.d I
      // 0fa: iload 3
      // 0fb: iinc 3 1
      // 0fe: iadd
      // 0ff: invokevirtual com/finalshell/core/U9.C (I)C
      // 102: istore 4
      // 104: iload 4
      // 106: sipush 21259
      // 109: ldc2_w 1287927339301015045
      // 10c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10f: iload 2
      // 110: ifne 12f
      // 113: if_icmplt 4ca
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: iload 4
      // 11f: sipush 24153
      // 122: ldc2_w 3168790736949871469
      // 125: invokestatic com/finalshell/core/U9.a (IJ)I
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: iload 2
      // 130: ifne 14f
      // 133: if_icmpgt 4ca
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: iload 4
      // 13f: sipush 21259
      // 142: ldc2_w 1287927339301015045
      // 145: invokestatic com/finalshell/core/U9.a (IJ)I
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: isub
      // 150: istore 11
      // 152: aload 0
      // 153: aload 0
      // 154: getfield com/finalshell/core/U9.d I
      // 157: iload 3
      // 158: iinc 3 1
      // 15b: iadd
      // 15c: invokevirtual com/finalshell/core/U9.C (I)C
      // 15f: istore 4
      // 161: iload 4
      // 163: sipush 21259
      // 166: ldc2_w 1287927339301015045
      // 169: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16c: if_icmplt 1ab
      // 16f: iload 4
      // 171: iload 2
      // 172: ifne 1ac
      // 175: sipush 24153
      // 178: ldc2_w 3168790736949871469
      // 17b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 17e: iload 2
      // 17f: ifne 0d3
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: if_icmpgt 1ab
      // 18c: iload 11
      // 18e: sipush 1861
      // 191: ldc2_w 5349631099953699429
      // 194: invokestatic com/finalshell/core/U9.a (IJ)I
      // 197: imul
      // 198: iload 4
      // 19a: sipush 21259
      // 19d: ldc2_w 1287927339301015045
      // 1a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a3: isub
      // 1a4: iadd
      // 1a5: istore 11
      // 1a7: iload 2
      // 1a8: ifeq 152
      // 1ab: bipush 1
      // 1ac: istore 12
      // 1ae: iload 4
      // 1b0: sipush 19110
      // 1b3: ldc2_w 4854799824381581179
      // 1b6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b9: iload 2
      // 1ba: ifne 2c7
      // 1bd: if_icmpne 2b1
      // 1c0: goto 1c7
      // 1c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: aload 0
      // 1c9: getfield com/finalshell/core/U9.d I
      // 1cc: iload 3
      // 1cd: iinc 3 1
      // 1d0: iadd
      // 1d1: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d4: istore 4
      // 1d6: iload 2
      // 1d7: ifne 2af
      // 1da: iload 4
      // 1dc: sipush 21259
      // 1df: ldc2_w 1287927339301015045
      // 1e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e5: if_icmplt 2aa
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: iload 4
      // 1f1: sipush 24153
      // 1f4: ldc2_w 3168790736949871469
      // 1f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1fa: iload 2
      // 1fb: ifne 22e
      // 1fe: goto 205
      // 201: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: if_icmpgt 2aa
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: iload 11
      // 211: sipush 1861
      // 214: ldc2_w 5349631099953699429
      // 217: invokestatic com/finalshell/core/U9.a (IJ)I
      // 21a: imul
      // 21b: iload 4
      // 21d: sipush 21259
      // 220: ldc2_w 1287927339301015045
      // 223: invokestatic com/finalshell/core/U9.a (IJ)I
      // 226: isub
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: iadd
      // 22f: istore 11
      // 231: sipush 1861
      // 234: ldc2_w 5349631099953699429
      // 237: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23a: istore 12
      // 23c: aload 0
      // 23d: aload 0
      // 23e: getfield com/finalshell/core/U9.d I
      // 241: iload 3
      // 242: iinc 3 1
      // 245: iadd
      // 246: invokevirtual com/finalshell/core/U9.C (I)C
      // 249: istore 4
      // 24b: iload 4
      // 24d: sipush 21259
      // 250: ldc2_w 1287927339301015045
      // 253: invokestatic com/finalshell/core/U9.a (IJ)I
      // 256: if_icmplt 2b1
      // 259: iload 4
      // 25b: sipush 24153
      // 25e: ldc2_w 3168790736949871469
      // 261: invokestatic com/finalshell/core/U9.a (IJ)I
      // 264: iload 2
      // 265: ifne 2c7
      // 268: iload 2
      // 269: ifne 2c7
      // 26c: goto 273
      // 26f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 272: athrow
      // 273: if_icmpgt 2b1
      // 276: goto 27d
      // 279: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27c: athrow
      // 27d: iload 11
      // 27f: sipush 1861
      // 282: ldc2_w 5349631099953699429
      // 285: invokestatic com/finalshell/core/U9.a (IJ)I
      // 288: imul
      // 289: iload 4
      // 28b: sipush 21259
      // 28e: ldc2_w 1287927339301015045
      // 291: invokestatic com/finalshell/core/U9.a (IJ)I
      // 294: isub
      // 295: iadd
      // 296: istore 11
      // 298: iload 12
      // 29a: sipush 1861
      // 29d: ldc2_w 5349631099953699429
      // 2a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a3: imul
      // 2a4: istore 12
      // 2a6: iload 2
      // 2a7: ifeq 23c
      // 2aa: aload 0
      // 2ab: bipush -1
      // 2ac: putfield com/finalshell/core/U9.z I
      // 2af: aconst_null
      // 2b0: areturn
      // 2b1: iload 4
      // 2b3: iload 2
      // 2b4: ifne 2f2
      // 2b7: sipush 16831
      // 2ba: ldc2_w 1205696545576721607
      // 2bd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c0: goto 2c7
      // 2c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c6: athrow
      // 2c7: if_icmpeq 2ea
      // 2ca: iload 4
      // 2cc: iload 2
      // 2cd: ifne 2f2
      // 2d0: goto 2d7
      // 2d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: sipush 19786
      // 2da: ldc2_w 559752938502885485
      // 2dd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e0: if_icmpne 2f5
      // 2e3: goto 2ea
      // 2e6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e9: athrow
      // 2ea: bipush 1
      // 2eb: goto 2f2
      // 2ee: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f1: athrow
      // 2f2: goto 2f6
      // 2f5: bipush 0
      // 2f6: istore 13
      // 2f8: iload 13
      // 2fa: iload 2
      // 2fb: ifne 3bd
      // 2fe: ifeq 3b2
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: aload 0
      // 309: aload 0
      // 30a: getfield com/finalshell/core/U9.d I
      // 30d: iload 3
      // 30e: iinc 3 1
      // 311: iadd
      // 312: invokevirtual com/finalshell/core/U9.C (I)C
      // 315: istore 4
      // 317: iload 4
      // 319: iload 2
      // 31a: ifne 364
      // 31d: sipush 22734
      // 320: ldc2_w 9000764304867362202
      // 323: invokestatic com/finalshell/core/U9.a (IJ)I
      // 326: if_icmpeq 350
      // 329: goto 330
      // 32c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32f: athrow
      // 330: iload 4
      // 332: sipush 19418
      // 335: ldc2_w 715321441499911916
      // 338: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33b: iload 2
      // 33c: ifne 371
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: if_icmpne 366
      // 349: goto 350
      // 34c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34f: athrow
      // 350: aload 0
      // 351: aload 0
      // 352: getfield com/finalshell/core/U9.d I
      // 355: iload 3
      // 356: iinc 3 1
      // 359: iadd
      // 35a: invokevirtual com/finalshell/core/U9.C (I)C
      // 35d: goto 364
      // 360: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: istore 4
      // 366: iload 4
      // 368: sipush 21259
      // 36b: ldc2_w 1287927339301015045
      // 36e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 371: if_icmplt 3b2
      // 374: iload 4
      // 376: sipush 24153
      // 379: ldc2_w 3168790736949871469
      // 37c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 37f: iload 2
      // 380: ifne 3bc
      // 383: goto 38a
      // 386: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 389: athrow
      // 38a: iload 2
      // 38b: ifne 3bc
      // 38e: goto 395
      // 391: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 394: athrow
      // 395: if_icmpgt 3b2
      // 398: goto 39f
      // 39b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39e: athrow
      // 39f: aload 0
      // 3a0: aload 0
      // 3a1: getfield com/finalshell/core/U9.d I
      // 3a4: iload 3
      // 3a5: iinc 3 1
      // 3a8: iadd
      // 3a9: invokevirtual com/finalshell/core/U9.C (I)C
      // 3ac: istore 4
      // 3ae: iload 2
      // 3af: ifeq 366
      // 3b2: aload 0
      // 3b3: getfield com/finalshell/core/U9.d I
      // 3b6: iload 3
      // 3b7: iadd
      // 3b8: iload 9
      // 3ba: isub
      // 3bb: bipush 1
      // 3bc: isub
      // 3bd: istore 14
      // 3bf: iload 13
      // 3c1: iload 2
      // 3c2: ifne 3d1
      // 3c5: ifne 411
      // 3c8: goto 3cf
      // 3cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ce: athrow
      // 3cf: iload 14
      // 3d1: iload 2
      // 3d2: ifne 3f1
      // 3d5: sipush 1861
      // 3d8: ldc2_w 5349631099953699429
      // 3db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3de: if_icmpge 411
      // 3e1: goto 3e8
      // 3e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e7: athrow
      // 3e8: iload 11
      // 3ea: goto 3f1
      // 3ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f0: athrow
      // 3f1: i2f
      // 3f2: iload 12
      // 3f4: i2f
      // 3f5: fdiv
      // 3f6: fstore 15
      // 3f8: iload 10
      // 3fa: iload 2
      // 3fb: ifne 424
      // 3fe: ifeq 422
      // 401: goto 408
      // 404: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 407: athrow
      // 408: fload 15
      // 40a: fneg
      // 40b: fstore 15
      // 40d: iload 2
      // 40e: ifeq 422
      // 411: aload 0
      // 412: iload 9
      // 414: iload 14
      // 416: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 419: astore 16
      // 41b: aload 16
      // 41d: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 420: fstore 15
      // 422: iload 8
      // 424: aload 7
      // 426: arraylength
      // 427: iload 2
      // 428: ifne 464
      // 42b: if_icmplt 44f
      // 42e: goto 435
      // 431: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 434: athrow
      // 435: aload 7
      // 437: arraylength
      // 438: bipush 3
      // 439: imul
      // 43a: bipush 2
      // 43b: idiv
      // 43c: newarray 6
      // 43e: astore 16
      // 440: aload 7
      // 442: bipush 0
      // 443: aload 16
      // 445: bipush 0
      // 446: iload 8
      // 448: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 44b: aload 16
      // 44d: astore 7
      // 44f: aload 7
      // 451: iload 8
      // 453: iinc 8 1
      // 456: fload 15
      // 458: fastore
      // 459: iload 4
      // 45b: sipush 26927
      // 45e: ldc2_w 6101958691031889140
      // 461: invokestatic com/finalshell/core/U9.a (IJ)I
      // 464: iload 2
      // 465: ifne 4a2
      // 468: if_icmpne 485
      // 46b: goto 472
      // 46e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: aload 0
      // 473: aload 0
      // 474: getfield com/finalshell/core/U9.d I
      // 477: iload 3
      // 478: iinc 3 1
      // 47b: iadd
      // 47c: invokevirtual com/finalshell/core/U9.C (I)C
      // 47f: istore 4
      // 481: iload 2
      // 482: ifeq 4bf
      // 485: iload 4
      // 487: iload 2
      // 488: ifne 4b9
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 491: athrow
      // 492: sipush 30337
      // 495: ldc2_w 2029800848590515112
      // 498: invokestatic com/finalshell/core/U9.a (IJ)I
      // 49b: goto 4a2
      // 49e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a1: athrow
      // 4a2: if_icmpne 4bf
      // 4a5: aload 0
      // 4a6: aload 0
      // 4a7: getfield com/finalshell/core/U9.d I
      // 4aa: iload 3
      // 4ab: iinc 3 1
      // 4ae: iadd
      // 4af: invokevirtual com/finalshell/core/U9.C (I)C
      // 4b2: goto 4b9
      // 4b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: istore 4
      // 4bb: iload 2
      // 4bc: ifeq 4d9
      // 4bf: iload 2
      // 4c0: ifeq 4d5
      // 4c3: goto 4ca
      // 4c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c9: athrow
      // 4ca: aload 0
      // 4cb: bipush -1
      // 4cc: putfield com/finalshell/core/U9.z I
      // 4cf: aconst_null
      // 4d0: areturn
      // 4d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d4: athrow
      // 4d5: iload 2
      // 4d6: ifeq 0be
      // 4d9: iload 8
      // 4db: aload 7
      // 4dd: arraylength
      // 4de: iload 2
      // 4df: ifne 506
      // 4e2: if_icmpeq 501
      // 4e5: goto 4ec
      // 4e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4eb: athrow
      // 4ec: iload 8
      // 4ee: newarray 6
      // 4f0: astore 9
      // 4f2: aload 7
      // 4f4: bipush 0
      // 4f5: aload 9
      // 4f7: bipush 0
      // 4f8: iload 8
      // 4fa: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 4fd: aload 9
      // 4ff: astore 7
      // 501: iload 6
      // 503: aload 5
      // 505: arraylength
      // 506: iload 2
      // 507: ifne 544
      // 50a: if_icmplt 52f
      // 50d: goto 514
      // 510: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: aload 5
      // 516: arraylength
      // 517: bipush 3
      // 518: imul
      // 519: bipush 2
      // 51a: idiv
      // 51b: anewarray 721
      // 51e: astore 9
      // 520: aload 7
      // 522: bipush 0
      // 523: aload 9
      // 525: bipush 0
      // 526: iload 8
      // 528: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 52b: aload 9
      // 52d: astore 5
      // 52f: aload 5
      // 531: iload 6
      // 533: iinc 6 1
      // 536: aload 7
      // 538: aastore
      // 539: iload 4
      // 53b: sipush 26927
      // 53e: ldc2_w 6101958691031889140
      // 541: invokestatic com/finalshell/core/U9.a (IJ)I
      // 544: iload 2
      // 545: ifne 582
      // 548: if_icmpne 565
      // 54b: goto 552
      // 54e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 551: athrow
      // 552: aload 0
      // 553: aload 0
      // 554: getfield com/finalshell/core/U9.d I
      // 557: iload 3
      // 558: iinc 3 1
      // 55b: iadd
      // 55c: invokevirtual com/finalshell/core/U9.C (I)C
      // 55f: istore 4
      // 561: iload 2
      // 562: ifeq 59f
      // 565: iload 4
      // 567: iload 2
      // 568: ifne 599
      // 56b: goto 572
      // 56e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 571: athrow
      // 572: sipush 30337
      // 575: ldc2_w 2029800848590515112
      // 578: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57b: goto 582
      // 57e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 581: athrow
      // 582: if_icmpne 59f
      // 585: aload 0
      // 586: aload 0
      // 587: getfield com/finalshell/core/U9.d I
      // 58a: iload 3
      // 58b: iinc 3 1
      // 58e: iadd
      // 58f: invokevirtual com/finalshell/core/U9.C (I)C
      // 592: goto 599
      // 595: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 598: athrow
      // 599: istore 4
      // 59b: iload 2
      // 59c: ifeq 5aa
      // 59f: iload 2
      // 5a0: ifeq 08d
      // 5a3: goto 5aa
      // 5a6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a9: athrow
      // 5aa: iload 6
      // 5ac: aload 5
      // 5ae: arraylength
      // 5af: iload 2
      // 5b0: ifne 5de
      // 5b3: if_icmpeq 5d3
      // 5b6: goto 5bd
      // 5b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5bc: athrow
      // 5bd: iload 6
      // 5bf: anewarray 721
      // 5c2: astore 7
      // 5c4: aload 5
      // 5c6: bipush 0
      // 5c7: aload 7
      // 5c9: bipush 0
      // 5ca: iload 6
      // 5cc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5cf: aload 7
      // 5d1: astore 5
      // 5d3: iload 4
      // 5d5: sipush 26927
      // 5d8: ldc2_w 6101958691031889140
      // 5db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5de: iload 2
      // 5df: ifne 629
      // 5e2: if_icmpne 61e
      // 5e5: goto 5ec
      // 5e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5eb: athrow
      // 5ec: aload 0
      // 5ed: dup
      // 5ee: getfield com/finalshell/core/U9.d I
      // 5f1: iload 3
      // 5f2: bipush 1
      // 5f3: isub
      // 5f4: iadd
      // 5f5: putfield com/finalshell/core/U9.d I
      // 5f8: aload 0
      // 5f9: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5fc: pop
      // 5fd: aload 0
      // 5fe: sipush 5887
      // 601: ldc2_w 3467391210321595353
      // 604: invokestatic com/finalshell/core/U9.a (IJ)I
      // 607: putfield com/finalshell/core/U9.z I
      // 60a: aload 0
      // 60b: sipush 9361
      // 60e: ldc2_w 2488456831667599749
      // 611: invokestatic com/finalshell/core/U9.a (IJ)I
      // 614: putfield com/finalshell/core/U9.Y I
      // 617: aload 5
      // 619: areturn
      // 61a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61d: athrow
      // 61e: iload 4
      // 620: sipush 4784
      // 623: ldc2_w 3082167687830622095
      // 626: invokestatic com/finalshell/core/U9.a (IJ)I
      // 629: iload 2
      // 62a: ifne 651
      // 62d: if_icmpne 77c
      // 630: goto 637
      // 633: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 636: athrow
      // 637: aload 0
      // 638: aload 0
      // 639: getfield com/finalshell/core/U9.d I
      // 63c: iload 3
      // 63d: iinc 3 1
      // 640: iadd
      // 641: invokevirtual com/finalshell/core/U9.C (I)C
      // 644: istore 4
      // 646: iload 4
      // 648: sipush 26927
      // 64b: ldc2_w 6101958691031889140
      // 64e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 651: iload 2
      // 652: ifne 69a
      // 655: if_icmpne 688
      // 658: goto 65f
      // 65b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65e: athrow
      // 65f: aload 0
      // 660: sipush 9361
      // 663: ldc2_w 2488456831667599749
      // 666: invokestatic com/finalshell/core/U9.a (IJ)I
      // 669: putfield com/finalshell/core/U9.Y I
      // 66c: aload 0
      // 66d: dup
      // 66e: getfield com/finalshell/core/U9.d I
      // 671: iload 3
      // 672: bipush 1
      // 673: isub
      // 674: iadd
      // 675: putfield com/finalshell/core/U9.d I
      // 678: aload 0
      // 679: invokevirtual com/finalshell/core/U9.C$char ()C
      // 67c: pop
      // 67d: iload 2
      // 67e: ifeq 76b
      // 681: goto 688
      // 684: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 687: athrow
      // 688: iload 4
      // 68a: sipush 30337
      // 68d: ldc2_w 2029800848590515112
      // 690: invokestatic com/finalshell/core/U9.a (IJ)I
      // 693: goto 69a
      // 696: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 699: athrow
      // 69a: iload 2
      // 69b: ifne 6e3
      // 69e: if_icmpne 6d1
      // 6a1: goto 6a8
      // 6a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a7: athrow
      // 6a8: aload 0
      // 6a9: sipush 9145
      // 6ac: ldc2_w 6577731744871808687
      // 6af: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6b2: putfield com/finalshell/core/U9.Y I
      // 6b5: aload 0
      // 6b6: dup
      // 6b7: getfield com/finalshell/core/U9.d I
      // 6ba: iload 3
      // 6bb: bipush 1
      // 6bc: isub
      // 6bd: iadd
      // 6be: putfield com/finalshell/core/U9.d I
      // 6c1: aload 0
      // 6c2: invokevirtual com/finalshell/core/U9.C$char ()C
      // 6c5: pop
      // 6c6: iload 2
      // 6c7: ifeq 76b
      // 6ca: goto 6d1
      // 6cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d0: athrow
      // 6d1: iload 4
      // 6d3: sipush 4784
      // 6d6: ldc2_w 3082167687830622095
      // 6d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6dc: goto 6e3
      // 6df: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e2: athrow
      // 6e3: iload 2
      // 6e4: ifne 72c
      // 6e7: if_icmpne 71a
      // 6ea: goto 6f1
      // 6ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f0: athrow
      // 6f1: aload 0
      // 6f2: sipush 16923
      // 6f5: ldc2_w 1571494982232874791
      // 6f8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6fb: putfield com/finalshell/core/U9.Y I
      // 6fe: aload 0
      // 6ff: dup
      // 700: getfield com/finalshell/core/U9.d I
      // 703: iload 3
      // 704: bipush 1
      // 705: isub
      // 706: iadd
      // 707: putfield com/finalshell/core/U9.d I
      // 70a: aload 0
      // 70b: invokevirtual com/finalshell/core/U9.C$char ()C
      // 70e: pop
      // 70f: iload 2
      // 710: ifeq 76b
      // 713: goto 71a
      // 716: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 719: athrow
      // 71a: iload 4
      // 71c: sipush 2765
      // 71f: ldc2_w 8216137057917720563
      // 722: invokestatic com/finalshell/core/U9.a (IJ)I
      // 725: goto 72c
      // 728: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72b: athrow
      // 72c: if_icmpne 760
      // 72f: aload 0
      // 730: dup
      // 731: getfield com/finalshell/core/U9.d I
      // 734: iload 3
      // 735: bipush 1
      // 736: isub
      // 737: iadd
      // 738: putfield com/finalshell/core/U9.d I
      // 73b: aload 0
      // 73c: sipush 9907
      // 73f: ldc2_w 514190805586246625
      // 742: invokestatic com/finalshell/core/U9.a (IJ)I
      // 745: putfield com/finalshell/core/U9.Y I
      // 748: aload 0
      // 749: sipush 2765
      // 74c: ldc2_w 8216137057917720563
      // 74f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 752: putfield com/finalshell/core/U9.l C
      // 755: iload 2
      // 756: ifeq 76b
      // 759: goto 760
      // 75c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75f: athrow
      // 760: aload 0
      // 761: bipush -1
      // 762: putfield com/finalshell/core/U9.z I
      // 765: aconst_null
      // 766: areturn
      // 767: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76a: athrow
      // 76b: aload 0
      // 76c: sipush 2897
      // 76f: ldc2_w 695568451002816123
      // 772: invokestatic com/finalshell/core/U9.a (IJ)I
      // 775: putfield com/finalshell/core/U9.z I
      // 778: iload 2
      // 779: ifeq 787
      // 77c: aload 0
      // 77d: bipush -1
      // 77e: putfield com/finalshell/core/U9.z I
      // 781: aconst_null
      // 782: areturn
      // 783: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 786: athrow
      // 787: aload 5
      // 789: areturn
   }

   public final double m(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: dconst_0
      // 02a: dreturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 062
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpne 065
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 1
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: goto 066
      // 065: bipush 0
      // 066: istore 5
      // 068: iload 5
      // 06a: iload 2
      // 06b: ifne 089
      // 06e: ifeq 087
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 0
      // 07a: getfield com/finalshell/core/U9.d I
      // 07d: iload 3
      // 07e: iinc 3 1
      // 081: iadd
      // 082: invokevirtual com/finalshell/core/U9.C (I)C
      // 085: istore 4
      // 087: iload 4
      // 089: iload 2
      // 08a: ifne 0a8
      // 08d: sipush 19418
      // 090: ldc2_w 715321441499911916
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: if_icmpne 0ab
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: goto 0ac
      // 0ab: bipush 0
      // 0ac: istore 6
      // 0ae: iload 6
      // 0b0: iload 2
      // 0b1: ifne 0cf
      // 0b4: ifeq 0cd
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/U9.d I
      // 0c3: iload 3
      // 0c4: iinc 3 1
      // 0c7: iadd
      // 0c8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: sipush 21259
      // 0d2: ldc2_w 1287927339301015045
      // 0d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d8: iload 2
      // 0d9: ifne 45f
      // 0dc: if_icmplt 44d
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: sipush 24153
      // 0eb: ldc2_w 3168790736949871469
      // 0ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f1: iload 2
      // 0f2: ifne 45f
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: if_icmpgt 44d
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: iload 4
      // 108: sipush 21259
      // 10b: ldc2_w 1287927339301015045
      // 10e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 111: isub
      // 112: i2l
      // 113: lstore 9
      // 115: aload 0
      // 116: aload 0
      // 117: getfield com/finalshell/core/U9.d I
      // 11a: iload 3
      // 11b: iinc 3 1
      // 11e: iadd
      // 11f: invokevirtual com/finalshell/core/U9.C (I)C
      // 122: istore 4
      // 124: iload 4
      // 126: sipush 21259
      // 129: ldc2_w 1287927339301015045
      // 12c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12f: if_icmplt 160
      // 132: iload 4
      // 134: sipush 24153
      // 137: ldc2_w 3168790736949871469
      // 13a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13d: if_icmpgt 160
      // 140: lload 9
      // 142: sipush 3395
      // 145: ldc2_w 2174368042043745818
      // 148: invokestatic com/finalshell/core/U9.c (IJ)J
      // 14b: lmul
      // 14c: iload 4
      // 14e: sipush 21259
      // 151: ldc2_w 1287927339301015045
      // 154: invokestatic com/finalshell/core/U9.a (IJ)I
      // 157: isub
      // 158: i2l
      // 159: ladd
      // 15a: lstore 9
      // 15c: iload 2
      // 15d: ifeq 115
      // 160: lconst_1
      // 161: lstore 11
      // 163: iload 4
      // 165: iload 2
      // 166: ifne 184
      // 169: sipush 19110
      // 16c: ldc2_w 4854799824381581179
      // 16f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 172: if_icmpne 187
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: bipush 1
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: goto 188
      // 187: bipush 0
      // 188: istore 13
      // 18a: iload 13
      // 18c: iload 2
      // 18d: ifne 276
      // 190: ifeq 274
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 0
      // 19c: getfield com/finalshell/core/U9.d I
      // 19f: iload 3
      // 1a0: iinc 3 1
      // 1a3: iadd
      // 1a4: invokevirtual com/finalshell/core/U9.C (I)C
      // 1a7: istore 4
      // 1a9: iload 2
      // 1aa: ifne 272
      // 1ad: iload 4
      // 1af: sipush 21259
      // 1b2: ldc2_w 1287927339301015045
      // 1b5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b8: if_icmplt 26d
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: iload 4
      // 1c4: sipush 24153
      // 1c7: ldc2_w 3168790736949871469
      // 1ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1cd: if_icmpgt 26d
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: lload 9
      // 1d9: sipush 3395
      // 1dc: ldc2_w 2174368042043745818
      // 1df: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1e2: lmul
      // 1e3: iload 4
      // 1e5: sipush 21259
      // 1e8: ldc2_w 1287927339301015045
      // 1eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ee: isub
      // 1ef: i2l
      // 1f0: ladd
      // 1f1: lstore 9
      // 1f3: sipush 3395
      // 1f6: ldc2_w 2174368042043745818
      // 1f9: invokestatic com/finalshell/core/U9.c (IJ)J
      // 1fc: lstore 11
      // 1fe: aload 0
      // 1ff: aload 0
      // 200: getfield com/finalshell/core/U9.d I
      // 203: iload 3
      // 204: iinc 3 1
      // 207: iadd
      // 208: invokevirtual com/finalshell/core/U9.C (I)C
      // 20b: istore 4
      // 20d: iload 4
      // 20f: sipush 21259
      // 212: ldc2_w 1287927339301015045
      // 215: invokestatic com/finalshell/core/U9.a (IJ)I
      // 218: if_icmplt 274
      // 21b: iload 4
      // 21d: sipush 24153
      // 220: ldc2_w 3168790736949871469
      // 223: invokestatic com/finalshell/core/U9.a (IJ)I
      // 226: iload 2
      // 227: ifne 28a
      // 22a: iload 2
      // 22b: ifne 28a
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: if_icmpgt 274
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: lload 9
      // 241: sipush 3395
      // 244: ldc2_w 2174368042043745818
      // 247: invokestatic com/finalshell/core/U9.c (IJ)J
      // 24a: lmul
      // 24b: iload 4
      // 24d: sipush 21259
      // 250: ldc2_w 1287927339301015045
      // 253: invokestatic com/finalshell/core/U9.a (IJ)I
      // 256: isub
      // 257: i2l
      // 258: ladd
      // 259: lstore 9
      // 25b: lload 11
      // 25d: sipush 3395
      // 260: ldc2_w 2174368042043745818
      // 263: invokestatic com/finalshell/core/U9.c (IJ)J
      // 266: lmul
      // 267: lstore 11
      // 269: iload 2
      // 26a: ifeq 1fe
      // 26d: aload 0
      // 26e: bipush -1
      // 26f: putfield com/finalshell/core/U9.z I
      // 272: dconst_0
      // 273: dreturn
      // 274: iload 4
      // 276: iload 2
      // 277: ifne 2b5
      // 27a: sipush 16831
      // 27d: ldc2_w 1205696545576721607
      // 280: invokestatic com/finalshell/core/U9.a (IJ)I
      // 283: goto 28a
      // 286: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 289: athrow
      // 28a: if_icmpeq 2ad
      // 28d: iload 4
      // 28f: iload 2
      // 290: ifne 2b5
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: sipush 19786
      // 29d: ldc2_w 559752938502885485
      // 2a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2a3: if_icmpne 2b8
      // 2a6: goto 2ad
      // 2a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: bipush 1
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: goto 2b9
      // 2b8: bipush 0
      // 2b9: istore 14
      // 2bb: iload 14
      // 2bd: iload 2
      // 2be: ifne 377
      // 2c1: ifeq 375
      // 2c4: goto 2cb
      // 2c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: aload 0
      // 2cd: getfield com/finalshell/core/U9.d I
      // 2d0: iload 3
      // 2d1: iinc 3 1
      // 2d4: iadd
      // 2d5: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d8: istore 4
      // 2da: iload 4
      // 2dc: iload 2
      // 2dd: ifne 327
      // 2e0: sipush 22734
      // 2e3: ldc2_w 9000764304867362202
      // 2e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e9: if_icmpeq 313
      // 2ec: goto 2f3
      // 2ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: iload 4
      // 2f5: sipush 19418
      // 2f8: ldc2_w 715321441499911916
      // 2fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2fe: iload 2
      // 2ff: ifne 334
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: if_icmpne 329
      // 30c: goto 313
      // 30f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: aload 0
      // 314: aload 0
      // 315: getfield com/finalshell/core/U9.d I
      // 318: iload 3
      // 319: iinc 3 1
      // 31c: iadd
      // 31d: invokevirtual com/finalshell/core/U9.C (I)C
      // 320: goto 327
      // 323: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: istore 4
      // 329: iload 4
      // 32b: sipush 21259
      // 32e: ldc2_w 1287927339301015045
      // 331: invokestatic com/finalshell/core/U9.a (IJ)I
      // 334: if_icmplt 375
      // 337: iload 4
      // 339: iload 2
      // 33a: ifne 377
      // 33d: goto 344
      // 340: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: sipush 24153
      // 347: ldc2_w 3168790736949871469
      // 34a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 34d: iload 2
      // 34e: ifne 3e8
      // 351: goto 358
      // 354: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 357: athrow
      // 358: if_icmpgt 375
      // 35b: goto 362
      // 35e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 361: athrow
      // 362: aload 0
      // 363: aload 0
      // 364: getfield com/finalshell/core/U9.d I
      // 367: iload 3
      // 368: iinc 3 1
      // 36b: iadd
      // 36c: invokevirtual com/finalshell/core/U9.C (I)C
      // 36f: istore 4
      // 371: iload 2
      // 372: ifeq 329
      // 375: iload 5
      // 377: iload 2
      // 378: ifne 3e9
      // 37b: ifeq 3db
      // 37e: goto 385
      // 381: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: iload 4
      // 387: sipush 26107
      // 38a: ldc2_w 2081374444732725480
      // 38d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 390: iload 2
      // 391: ifne 3c7
      // 394: goto 39b
      // 397: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39a: athrow
      // 39b: if_icmpeq 3b0
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: bipush -1
      // 3a7: putfield com/finalshell/core/U9.z I
      // 3aa: dconst_0
      // 3ab: dreturn
      // 3ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3af: athrow
      // 3b0: aload 0
      // 3b1: aload 0
      // 3b2: getfield com/finalshell/core/U9.d I
      // 3b5: iload 3
      // 3b6: iinc 3 1
      // 3b9: iadd
      // 3ba: invokevirtual com/finalshell/core/U9.C (I)C
      // 3bd: istore 4
      // 3bf: aload 0
      // 3c0: getfield com/finalshell/core/U9.d I
      // 3c3: aload 1
      // 3c4: arraylength
      // 3c5: iadd
      // 3c6: bipush 1
      // 3c7: iadd
      // 3c8: istore 15
      // 3ca: aload 0
      // 3cb: getfield com/finalshell/core/U9.d I
      // 3ce: iload 3
      // 3cf: iadd
      // 3d0: iload 15
      // 3d2: isub
      // 3d3: bipush 2
      // 3d4: isub
      // 3d5: istore 16
      // 3d7: iload 2
      // 3d8: ifeq 3f8
      // 3db: aload 0
      // 3dc: getfield com/finalshell/core/U9.d I
      // 3df: aload 1
      // 3e0: arraylength
      // 3e1: goto 3e8
      // 3e4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e7: athrow
      // 3e8: iadd
      // 3e9: istore 15
      // 3eb: aload 0
      // 3ec: getfield com/finalshell/core/U9.d I
      // 3ef: iload 3
      // 3f0: iadd
      // 3f1: iload 15
      // 3f3: isub
      // 3f4: bipush 1
      // 3f5: isub
      // 3f6: istore 16
      // 3f8: iload 14
      // 3fa: iload 2
      // 3fb: ifne 40a
      // 3fe: ifne 438
      // 401: goto 408
      // 404: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 407: athrow
      // 408: iload 16
      // 40a: sipush 8285
      // 40d: ldc2_w 1050517695616711985
      // 410: invokestatic com/finalshell/core/U9.a (IJ)I
      // 413: if_icmpge 438
      // 416: lload 9
      // 418: l2d
      // 419: lload 11
      // 41b: l2d
      // 41c: ddiv
      // 41d: dstore 7
      // 41f: iload 2
      // 420: ifne 434
      // 423: iload 6
      // 425: ifeq 449
      // 428: goto 42f
      // 42b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42e: athrow
      // 42f: dload 7
      // 431: dneg
      // 432: dstore 7
      // 434: iload 2
      // 435: ifeq 449
      // 438: aload 0
      // 439: iload 15
      // 43b: iload 16
      // 43d: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 440: astore 17
      // 442: aload 17
      // 444: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 447: dstore 7
      // 449: iload 2
      // 44a: ifeq 625
      // 44d: iload 4
      // 44f: sipush 7800
      // 452: ldc2_w 5201320676148134657
      // 455: invokestatic com/finalshell/core/U9.a (IJ)I
      // 458: goto 45f
      // 45b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45e: athrow
      // 45f: iload 2
      // 460: ifne 492
      // 463: if_icmpne 61e
      // 466: goto 46d
      // 469: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46c: athrow
      // 46d: aload 0
      // 46e: aload 0
      // 46f: getfield com/finalshell/core/U9.d I
      // 472: iload 3
      // 473: iadd
      // 474: iload 2
      // 475: ifne 620
      // 478: goto 47f
      // 47b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47e: athrow
      // 47f: invokevirtual com/finalshell/core/U9.C (I)C
      // 482: sipush 25252
      // 485: ldc2_w 2256381802227974060
      // 488: invokestatic com/finalshell/core/U9.a (IJ)I
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 491: athrow
      // 492: if_icmpne 61e
      // 495: aload 0
      // 496: aload 0
      // 497: getfield com/finalshell/core/U9.d I
      // 49a: iload 3
      // 49b: iadd
      // 49c: bipush 1
      // 49d: iadd
      // 49e: iload 2
      // 49f: ifne 620
      // 4a2: goto 4a9
      // 4a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a8: athrow
      // 4a9: invokevirtual com/finalshell/core/U9.C (I)C
      // 4ac: sipush 7325
      // 4af: ldc2_w 7975301603790307833
      // 4b2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b5: if_icmpne 61e
      // 4b8: goto 4bf
      // 4bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4be: athrow
      // 4bf: aload 0
      // 4c0: aload 0
      // 4c1: getfield com/finalshell/core/U9.d I
      // 4c4: iload 3
      // 4c5: iadd
      // 4c6: bipush 2
      // 4c7: iadd
      // 4c8: iload 2
      // 4c9: ifne 620
      // 4cc: goto 4d3
      // 4cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d2: athrow
      // 4d3: invokevirtual com/finalshell/core/U9.C (I)C
      // 4d6: sipush 7325
      // 4d9: ldc2_w 7975301603790307833
      // 4dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4df: if_icmpne 61e
      // 4e2: goto 4e9
      // 4e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e8: athrow
      // 4e9: aload 0
      // 4ea: sipush 19103
      // 4ed: ldc2_w 2592984034142099420
      // 4f0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f3: putfield com/finalshell/core/U9.z I
      // 4f6: dconst_0
      // 4f7: dstore 7
      // 4f9: iinc 3 3
      // 4fc: aload 0
      // 4fd: aload 0
      // 4fe: getfield com/finalshell/core/U9.d I
      // 501: iload 3
      // 502: iinc 3 1
      // 505: iadd
      // 506: invokevirtual com/finalshell/core/U9.C (I)C
      // 509: istore 4
      // 50b: iload 5
      // 50d: iload 2
      // 50e: ifne 54c
      // 511: ifeq 54a
      // 514: goto 51b
      // 517: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51a: athrow
      // 51b: iload 4
      // 51d: sipush 26107
      // 520: ldc2_w 2081374444732725480
      // 523: invokestatic com/finalshell/core/U9.a (IJ)I
      // 526: iload 2
      // 527: ifne 555
      // 52a: goto 531
      // 52d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 530: athrow
      // 531: if_icmpne 54a
      // 534: goto 53b
      // 537: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53a: athrow
      // 53b: aload 0
      // 53c: aload 0
      // 53d: getfield com/finalshell/core/U9.d I
      // 540: iload 3
      // 541: iinc 3 1
      // 544: iadd
      // 545: invokevirtual com/finalshell/core/U9.C (I)C
      // 548: istore 4
      // 54a: iload 4
      // 54c: sipush 26927
      // 54f: ldc2_w 6101958691031889140
      // 552: invokestatic com/finalshell/core/U9.a (IJ)I
      // 555: if_icmpne 59a
      // 558: aload 0
      // 559: dup
      // 55a: getfield com/finalshell/core/U9.d I
      // 55d: iload 3
      // 55e: iadd
      // 55f: putfield com/finalshell/core/U9.d I
      // 562: aload 0
      // 563: aload 0
      // 564: aload 0
      // 565: getfield com/finalshell/core/U9.d I
      // 568: invokevirtual com/finalshell/core/U9.C (I)C
      // 56b: putfield com/finalshell/core/U9.l C
      // 56e: aload 0
      // 56f: sipush 19103
      // 572: ldc2_w 2592984034142099420
      // 575: invokestatic com/finalshell/core/U9.a (IJ)I
      // 578: putfield com/finalshell/core/U9.z I
      // 57b: aload 0
      // 57c: sipush 9361
      // 57f: ldc2_w 2488456831667599749
      // 582: invokestatic com/finalshell/core/U9.a (IJ)I
      // 585: putfield com/finalshell/core/U9.Y I
      // 588: dload 7
      // 58a: iload 2
      // 58b: ifne 61d
      // 58e: goto 595
      // 591: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 594: athrow
      // 595: dreturn
      // 596: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 599: athrow
      // 59a: iload 4
      // 59c: iload 2
      // 59d: ifne 5ef
      // 5a0: sipush 4784
      // 5a3: ldc2_w 3082167687830622095
      // 5a6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5a9: if_icmpne 5ea
      // 5ac: goto 5b3
      // 5af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b2: athrow
      // 5b3: aload 0
      // 5b4: dup
      // 5b5: getfield com/finalshell/core/U9.d I
      // 5b8: iload 3
      // 5b9: iadd
      // 5ba: putfield com/finalshell/core/U9.d I
      // 5bd: aload 0
      // 5be: aload 0
      // 5bf: aload 0
      // 5c0: getfield com/finalshell/core/U9.d I
      // 5c3: invokevirtual com/finalshell/core/U9.C (I)C
      // 5c6: putfield com/finalshell/core/U9.l C
      // 5c9: aload 0
      // 5ca: sipush 19103
      // 5cd: ldc2_w 2592984034142099420
      // 5d0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5d3: putfield com/finalshell/core/U9.z I
      // 5d6: aload 0
      // 5d7: sipush 16923
      // 5da: ldc2_w 1571494982232874791
      // 5dd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5e0: putfield com/finalshell/core/U9.Y I
      // 5e3: dload 7
      // 5e5: dreturn
      // 5e6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e9: athrow
      // 5ea: iload 4
      // 5ec: invokestatic com/finalshell/core/U9.Y (C)Z
      // 5ef: iload 2
      // 5f0: ifne 611
      // 5f3: ifeq 617
      // 5f6: goto 5fd
      // 5f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fc: athrow
      // 5fd: aload 0
      // 5fe: aload 0
      // 5ff: getfield com/finalshell/core/U9.d I
      // 602: iload 3
      // 603: iinc 3 1
      // 606: iadd
      // 607: invokevirtual com/finalshell/core/U9.C (I)C
      // 60a: goto 611
      // 60d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 610: athrow
      // 611: istore 4
      // 613: iload 2
      // 614: ifeq 54a
      // 617: aload 0
      // 618: bipush -1
      // 619: putfield com/finalshell/core/U9.z I
      // 61c: dconst_0
      // 61d: dreturn
      // 61e: aload 0
      // 61f: bipush -1
      // 620: putfield com/finalshell/core/U9.z I
      // 623: dconst_0
      // 624: dreturn
      // 625: iload 4
      // 627: sipush 26927
      // 62a: ldc2_w 6101958691031889140
      // 62d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 630: iload 2
      // 631: ifne 680
      // 634: if_icmpne 675
      // 637: goto 63e
      // 63a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63d: athrow
      // 63e: aload 0
      // 63f: dup
      // 640: getfield com/finalshell/core/U9.d I
      // 643: iload 3
      // 644: iadd
      // 645: putfield com/finalshell/core/U9.d I
      // 648: aload 0
      // 649: aload 0
      // 64a: aload 0
      // 64b: getfield com/finalshell/core/U9.d I
      // 64e: invokevirtual com/finalshell/core/U9.C (I)C
      // 651: putfield com/finalshell/core/U9.l C
      // 654: aload 0
      // 655: sipush 5887
      // 658: ldc2_w 3467391210321595353
      // 65b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 65e: putfield com/finalshell/core/U9.z I
      // 661: aload 0
      // 662: sipush 9361
      // 665: ldc2_w 2488456831667599749
      // 668: invokestatic com/finalshell/core/U9.a (IJ)I
      // 66b: putfield com/finalshell/core/U9.Y I
      // 66e: dload 7
      // 670: dreturn
      // 671: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 674: athrow
      // 675: iload 4
      // 677: sipush 4784
      // 67a: ldc2_w 3082167687830622095
      // 67d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 680: iload 2
      // 681: ifne 6a8
      // 684: if_icmpne 7e2
      // 687: goto 68e
      // 68a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68d: athrow
      // 68e: aload 0
      // 68f: aload 0
      // 690: getfield com/finalshell/core/U9.d I
      // 693: iload 3
      // 694: iinc 3 1
      // 697: iadd
      // 698: invokevirtual com/finalshell/core/U9.C (I)C
      // 69b: istore 4
      // 69d: iload 4
      // 69f: sipush 26927
      // 6a2: ldc2_w 6101958691031889140
      // 6a5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6a8: iload 2
      // 6a9: ifne 6f6
      // 6ac: if_icmpne 6e4
      // 6af: goto 6b6
      // 6b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b5: athrow
      // 6b6: aload 0
      // 6b7: sipush 9361
      // 6ba: ldc2_w 2488456831667599749
      // 6bd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6c0: putfield com/finalshell/core/U9.Y I
      // 6c3: aload 0
      // 6c4: dup
      // 6c5: getfield com/finalshell/core/U9.d I
      // 6c8: iload 3
      // 6c9: iadd
      // 6ca: putfield com/finalshell/core/U9.d I
      // 6cd: aload 0
      // 6ce: aload 0
      // 6cf: aload 0
      // 6d0: getfield com/finalshell/core/U9.d I
      // 6d3: invokevirtual com/finalshell/core/U9.C (I)C
      // 6d6: putfield com/finalshell/core/U9.l C
      // 6d9: iload 2
      // 6da: ifeq 7d1
      // 6dd: goto 6e4
      // 6e0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e3: athrow
      // 6e4: iload 4
      // 6e6: sipush 30337
      // 6e9: ldc2_w 2029800848590515112
      // 6ec: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6ef: goto 6f6
      // 6f2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f5: athrow
      // 6f6: iload 2
      // 6f7: ifne 744
      // 6fa: if_icmpne 732
      // 6fd: goto 704
      // 700: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 703: athrow
      // 704: aload 0
      // 705: sipush 9145
      // 708: ldc2_w 6577731744871808687
      // 70b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 70e: putfield com/finalshell/core/U9.Y I
      // 711: aload 0
      // 712: dup
      // 713: getfield com/finalshell/core/U9.d I
      // 716: iload 3
      // 717: iadd
      // 718: putfield com/finalshell/core/U9.d I
      // 71b: aload 0
      // 71c: aload 0
      // 71d: aload 0
      // 71e: getfield com/finalshell/core/U9.d I
      // 721: invokevirtual com/finalshell/core/U9.C (I)C
      // 724: putfield com/finalshell/core/U9.l C
      // 727: iload 2
      // 728: ifeq 7d1
      // 72b: goto 732
      // 72e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 731: athrow
      // 732: iload 4
      // 734: sipush 4784
      // 737: ldc2_w 3082167687830622095
      // 73a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 73d: goto 744
      // 740: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 743: athrow
      // 744: iload 2
      // 745: ifne 792
      // 748: if_icmpne 780
      // 74b: goto 752
      // 74e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 751: athrow
      // 752: aload 0
      // 753: sipush 16923
      // 756: ldc2_w 1571494982232874791
      // 759: invokestatic com/finalshell/core/U9.a (IJ)I
      // 75c: putfield com/finalshell/core/U9.Y I
      // 75f: aload 0
      // 760: dup
      // 761: getfield com/finalshell/core/U9.d I
      // 764: iload 3
      // 765: iadd
      // 766: putfield com/finalshell/core/U9.d I
      // 769: aload 0
      // 76a: aload 0
      // 76b: aload 0
      // 76c: getfield com/finalshell/core/U9.d I
      // 76f: invokevirtual com/finalshell/core/U9.C (I)C
      // 772: putfield com/finalshell/core/U9.l C
      // 775: iload 2
      // 776: ifeq 7d1
      // 779: goto 780
      // 77c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77f: athrow
      // 780: iload 4
      // 782: sipush 2765
      // 785: ldc2_w 8216137057917720563
      // 788: invokestatic com/finalshell/core/U9.a (IJ)I
      // 78b: goto 792
      // 78e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 791: athrow
      // 792: if_icmpne 7c6
      // 795: aload 0
      // 796: sipush 9907
      // 799: ldc2_w 514190805586246625
      // 79c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 79f: putfield com/finalshell/core/U9.Y I
      // 7a2: aload 0
      // 7a3: dup
      // 7a4: getfield com/finalshell/core/U9.d I
      // 7a7: iload 3
      // 7a8: bipush 1
      // 7a9: isub
      // 7aa: iadd
      // 7ab: putfield com/finalshell/core/U9.d I
      // 7ae: aload 0
      // 7af: sipush 2765
      // 7b2: ldc2_w 8216137057917720563
      // 7b5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7b8: putfield com/finalshell/core/U9.l C
      // 7bb: iload 2
      // 7bc: ifeq 7d1
      // 7bf: goto 7c6
      // 7c2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c5: athrow
      // 7c6: aload 0
      // 7c7: bipush -1
      // 7c8: putfield com/finalshell/core/U9.z I
      // 7cb: dconst_0
      // 7cc: dreturn
      // 7cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d0: athrow
      // 7d1: aload 0
      // 7d2: sipush 2897
      // 7d5: ldc2_w 695568451002816123
      // 7d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7db: putfield com/finalshell/core/U9.z I
      // 7de: iload 2
      // 7df: ifeq 7ed
      // 7e2: aload 0
      // 7e3: bipush -1
      // 7e4: putfield com/finalshell/core/U9.z I
      // 7e7: dconst_0
      // 7e8: dreturn
      // 7e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7ec: athrow
      // 7ed: dload 7
      // 7ef: dreturn
   }

   public BigDecimal I(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifeq 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifeq 062
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpne 065
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 1
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: goto 066
      // 065: bipush 0
      // 066: istore 5
      // 068: iload 5
      // 06a: iload 2
      // 06b: ifeq 089
      // 06e: ifeq 087
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 0
      // 07a: getfield com/finalshell/core/U9.d I
      // 07d: iload 3
      // 07e: iinc 3 1
      // 081: iadd
      // 082: invokevirtual com/finalshell/core/U9.C (I)C
      // 085: istore 4
      // 087: iload 4
      // 089: iload 2
      // 08a: ifeq 0a8
      // 08d: sipush 19418
      // 090: ldc2_w 715321441499911916
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: if_icmpne 0ab
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: goto 0ac
      // 0ab: bipush 0
      // 0ac: istore 6
      // 0ae: iload 6
      // 0b0: iload 2
      // 0b1: ifeq 0cf
      // 0b4: ifeq 0cd
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/U9.d I
      // 0c3: iload 3
      // 0c4: iinc 3 1
      // 0c7: iadd
      // 0c8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: sipush 21259
      // 0d2: ldc2_w 1287927339301015045
      // 0d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d8: iload 2
      // 0d9: ifeq 3fd
      // 0dc: if_icmplt 3eb
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: sipush 24153
      // 0eb: ldc2_w 3168790736949871469
      // 0ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f1: iload 2
      // 0f2: ifeq 3fd
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: if_icmpgt 3eb
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 0
      // 107: aload 0
      // 108: getfield com/finalshell/core/U9.d I
      // 10b: iload 3
      // 10c: iinc 3 1
      // 10f: iadd
      // 110: invokevirtual com/finalshell/core/U9.C (I)C
      // 113: istore 4
      // 115: iload 4
      // 117: sipush 21259
      // 11a: ldc2_w 1287927339301015045
      // 11d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 120: if_icmplt 152
      // 123: iload 4
      // 125: sipush 24153
      // 128: ldc2_w 3168790736949871469
      // 12b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12e: iload 2
      // 12f: ifeq 168
      // 132: iload 2
      // 133: ifeq 168
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: if_icmpgt 152
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: iload 2
      // 148: ifne 106
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 4
      // 154: iload 2
      // 155: ifeq 16c
      // 158: sipush 19110
      // 15b: ldc2_w 4854799824381581179
      // 15e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: if_icmpne 16f
      // 16b: bipush 1
      // 16c: goto 170
      // 16f: bipush 0
      // 170: istore 8
      // 172: iload 8
      // 174: iload 2
      // 175: ifeq 226
      // 178: ifeq 224
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: aload 0
      // 183: aload 0
      // 184: getfield com/finalshell/core/U9.d I
      // 187: iload 3
      // 188: iinc 3 1
      // 18b: iadd
      // 18c: invokevirtual com/finalshell/core/U9.C (I)C
      // 18f: istore 4
      // 191: iload 2
      // 192: ifeq 222
      // 195: iload 4
      // 197: sipush 21259
      // 19a: ldc2_w 1287927339301015045
      // 19d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a0: if_icmplt 21d
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: iload 4
      // 1ac: sipush 24153
      // 1af: ldc2_w 3168790736949871469
      // 1b2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b5: iload 2
      // 1b6: ifeq 1e4
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: if_icmpgt 21d
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: aload 0
      // 1cc: getfield com/finalshell/core/U9.d I
      // 1cf: iload 3
      // 1d0: iinc 3 1
      // 1d3: iadd
      // 1d4: invokevirtual com/finalshell/core/U9.C (I)C
      // 1d7: istore 4
      // 1d9: iload 4
      // 1db: sipush 21259
      // 1de: ldc2_w 1287927339301015045
      // 1e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e4: if_icmplt 224
      // 1e7: iload 4
      // 1e9: sipush 24153
      // 1ec: ldc2_w 3168790736949871469
      // 1ef: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f2: iload 2
      // 1f3: ifeq 23a
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: iload 2
      // 1fe: ifeq 23a
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: if_icmpgt 224
      // 20b: goto 212
      // 20e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: iload 2
      // 213: ifne 1ca
      // 216: goto 21d
      // 219: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: aload 0
      // 21e: bipush -1
      // 21f: putfield com/finalshell/core/U9.z I
      // 222: aconst_null
      // 223: areturn
      // 224: iload 4
      // 226: iload 2
      // 227: ifeq 265
      // 22a: sipush 16831
      // 22d: ldc2_w 1205696545576721607
      // 230: invokestatic com/finalshell/core/U9.a (IJ)I
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: if_icmpeq 25d
      // 23d: iload 4
      // 23f: iload 2
      // 240: ifeq 265
      // 243: goto 24a
      // 246: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 249: athrow
      // 24a: sipush 19786
      // 24d: ldc2_w 559752938502885485
      // 250: invokestatic com/finalshell/core/U9.a (IJ)I
      // 253: if_icmpne 268
      // 256: goto 25d
      // 259: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25c: athrow
      // 25d: bipush 1
      // 25e: goto 265
      // 261: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 264: athrow
      // 265: goto 269
      // 268: bipush 0
      // 269: istore 9
      // 26b: iload 9
      // 26d: iload 2
      // 26e: ifeq 327
      // 271: ifeq 325
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 0
      // 27c: aload 0
      // 27d: getfield com/finalshell/core/U9.d I
      // 280: iload 3
      // 281: iinc 3 1
      // 284: iadd
      // 285: invokevirtual com/finalshell/core/U9.C (I)C
      // 288: istore 4
      // 28a: iload 4
      // 28c: iload 2
      // 28d: ifeq 2d7
      // 290: sipush 22734
      // 293: ldc2_w 9000764304867362202
      // 296: invokestatic com/finalshell/core/U9.a (IJ)I
      // 299: if_icmpeq 2c3
      // 29c: goto 2a3
      // 29f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: iload 4
      // 2a5: sipush 19418
      // 2a8: ldc2_w 715321441499911916
      // 2ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ae: iload 2
      // 2af: ifeq 2e4
      // 2b2: goto 2b9
      // 2b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b8: athrow
      // 2b9: if_icmpne 2d9
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: aload 0
      // 2c4: aload 0
      // 2c5: getfield com/finalshell/core/U9.d I
      // 2c8: iload 3
      // 2c9: iinc 3 1
      // 2cc: iadd
      // 2cd: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d0: goto 2d7
      // 2d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: istore 4
      // 2d9: iload 4
      // 2db: sipush 21259
      // 2de: ldc2_w 1287927339301015045
      // 2e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e4: if_icmplt 325
      // 2e7: iload 4
      // 2e9: iload 2
      // 2ea: ifeq 327
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: sipush 24153
      // 2f7: ldc2_w 3168790736949871469
      // 2fa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2fd: iload 2
      // 2fe: ifeq 398
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: if_icmpgt 325
      // 30b: goto 312
      // 30e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 311: athrow
      // 312: aload 0
      // 313: aload 0
      // 314: getfield com/finalshell/core/U9.d I
      // 317: iload 3
      // 318: iinc 3 1
      // 31b: iadd
      // 31c: invokevirtual com/finalshell/core/U9.C (I)C
      // 31f: istore 4
      // 321: iload 2
      // 322: ifne 2d9
      // 325: iload 5
      // 327: iload 2
      // 328: ifeq 399
      // 32b: ifeq 38b
      // 32e: goto 335
      // 331: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 334: athrow
      // 335: iload 4
      // 337: sipush 26107
      // 33a: ldc2_w 2081374444732725480
      // 33d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 340: iload 2
      // 341: ifeq 377
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: if_icmpeq 360
      // 34e: goto 355
      // 351: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 354: athrow
      // 355: aload 0
      // 356: bipush -1
      // 357: putfield com/finalshell/core/U9.z I
      // 35a: aconst_null
      // 35b: areturn
      // 35c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: aload 0
      // 361: aload 0
      // 362: getfield com/finalshell/core/U9.d I
      // 365: iload 3
      // 366: iinc 3 1
      // 369: iadd
      // 36a: invokevirtual com/finalshell/core/U9.C (I)C
      // 36d: istore 4
      // 36f: aload 0
      // 370: getfield com/finalshell/core/U9.d I
      // 373: aload 1
      // 374: arraylength
      // 375: iadd
      // 376: bipush 1
      // 377: iadd
      // 378: istore 10
      // 37a: aload 0
      // 37b: getfield com/finalshell/core/U9.d I
      // 37e: iload 3
      // 37f: iadd
      // 380: iload 10
      // 382: isub
      // 383: bipush 2
      // 384: isub
      // 385: istore 11
      // 387: iload 2
      // 388: ifne 3a8
      // 38b: aload 0
      // 38c: getfield com/finalshell/core/U9.d I
      // 38f: aload 1
      // 390: arraylength
      // 391: goto 398
      // 394: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: iadd
      // 399: istore 10
      // 39b: aload 0
      // 39c: getfield com/finalshell/core/U9.d I
      // 39f: iload 3
      // 3a0: iadd
      // 3a1: iload 10
      // 3a3: isub
      // 3a4: bipush 1
      // 3a5: isub
      // 3a6: istore 11
      // 3a8: iload 11
      // 3aa: sipush 26118
      // 3ad: ldc2_w 1407188946055805716
      // 3b0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3b3: if_icmple 3cb
      // 3b6: new com/finalshell/core/Hi2
      // 3b9: dup
      // 3ba: sipush 10501
      // 3bd: sipush 3309
      // 3c0: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 3c3: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3c6: athrow
      // 3c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ca: athrow
      // 3cb: aload 0
      // 3cc: iload 10
      // 3ce: iload 11
      // 3d0: invokevirtual com/finalshell/core/U9.s (II)[C
      // 3d3: astore 12
      // 3d5: new java/math/BigDecimal
      // 3d8: dup
      // 3d9: aload 12
      // 3db: bipush 0
      // 3dc: aload 12
      // 3de: arraylength
      // 3df: getstatic java/math/MathContext.UNLIMITED Ljava/math/MathContext;
      // 3e2: invokespecial java/math/BigDecimal.<init> ([CIILjava/math/MathContext;)V
      // 3e5: astore 7
      // 3e7: iload 2
      // 3e8: ifne 5c3
      // 3eb: iload 4
      // 3ed: sipush 7800
      // 3f0: ldc2_w 5201320676148134657
      // 3f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f6: goto 3fd
      // 3f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fc: athrow
      // 3fd: iload 2
      // 3fe: ifeq 430
      // 401: if_icmpne 5bc
      // 404: goto 40b
      // 407: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: aload 0
      // 40c: aload 0
      // 40d: getfield com/finalshell/core/U9.d I
      // 410: iload 3
      // 411: iadd
      // 412: iload 2
      // 413: ifeq 5be
      // 416: goto 41d
      // 419: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41c: athrow
      // 41d: invokevirtual com/finalshell/core/U9.C (I)C
      // 420: sipush 25252
      // 423: ldc2_w 2256381802227974060
      // 426: invokestatic com/finalshell/core/U9.a (IJ)I
      // 429: goto 430
      // 42c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42f: athrow
      // 430: if_icmpne 5bc
      // 433: aload 0
      // 434: aload 0
      // 435: getfield com/finalshell/core/U9.d I
      // 438: iload 3
      // 439: iadd
      // 43a: bipush 1
      // 43b: iadd
      // 43c: iload 2
      // 43d: ifeq 5be
      // 440: goto 447
      // 443: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 446: athrow
      // 447: invokevirtual com/finalshell/core/U9.C (I)C
      // 44a: sipush 7325
      // 44d: ldc2_w 7975301603790307833
      // 450: invokestatic com/finalshell/core/U9.a (IJ)I
      // 453: if_icmpne 5bc
      // 456: goto 45d
      // 459: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45c: athrow
      // 45d: aload 0
      // 45e: aload 0
      // 45f: getfield com/finalshell/core/U9.d I
      // 462: iload 3
      // 463: iadd
      // 464: bipush 2
      // 465: iadd
      // 466: iload 2
      // 467: ifeq 5be
      // 46a: goto 471
      // 46d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 470: athrow
      // 471: invokevirtual com/finalshell/core/U9.C (I)C
      // 474: sipush 7325
      // 477: ldc2_w 7975301603790307833
      // 47a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 47d: if_icmpne 5bc
      // 480: goto 487
      // 483: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 486: athrow
      // 487: aload 0
      // 488: sipush 19103
      // 48b: ldc2_w 2592984034142099420
      // 48e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 491: putfield com/finalshell/core/U9.z I
      // 494: aconst_null
      // 495: astore 7
      // 497: iinc 3 3
      // 49a: aload 0
      // 49b: aload 0
      // 49c: getfield com/finalshell/core/U9.d I
      // 49f: iload 3
      // 4a0: iinc 3 1
      // 4a3: iadd
      // 4a4: invokevirtual com/finalshell/core/U9.C (I)C
      // 4a7: istore 4
      // 4a9: iload 5
      // 4ab: iload 2
      // 4ac: ifeq 4ea
      // 4af: ifeq 4e8
      // 4b2: goto 4b9
      // 4b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: iload 4
      // 4bb: sipush 26107
      // 4be: ldc2_w 2081374444732725480
      // 4c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c4: iload 2
      // 4c5: ifeq 4f3
      // 4c8: goto 4cf
      // 4cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ce: athrow
      // 4cf: if_icmpne 4e8
      // 4d2: goto 4d9
      // 4d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: aload 0
      // 4da: aload 0
      // 4db: getfield com/finalshell/core/U9.d I
      // 4de: iload 3
      // 4df: iinc 3 1
      // 4e2: iadd
      // 4e3: invokevirtual com/finalshell/core/U9.C (I)C
      // 4e6: istore 4
      // 4e8: iload 4
      // 4ea: sipush 26927
      // 4ed: ldc2_w 6101958691031889140
      // 4f0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f3: if_icmpne 538
      // 4f6: aload 0
      // 4f7: dup
      // 4f8: getfield com/finalshell/core/U9.d I
      // 4fb: iload 3
      // 4fc: iadd
      // 4fd: putfield com/finalshell/core/U9.d I
      // 500: aload 0
      // 501: aload 0
      // 502: aload 0
      // 503: getfield com/finalshell/core/U9.d I
      // 506: invokevirtual com/finalshell/core/U9.C (I)C
      // 509: putfield com/finalshell/core/U9.l C
      // 50c: aload 0
      // 50d: sipush 19103
      // 510: ldc2_w 2592984034142099420
      // 513: invokestatic com/finalshell/core/U9.a (IJ)I
      // 516: putfield com/finalshell/core/U9.z I
      // 519: aload 0
      // 51a: sipush 9361
      // 51d: ldc2_w 2488456831667599749
      // 520: invokestatic com/finalshell/core/U9.a (IJ)I
      // 523: putfield com/finalshell/core/U9.Y I
      // 526: aload 7
      // 528: iload 2
      // 529: ifeq 5bb
      // 52c: goto 533
      // 52f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 532: athrow
      // 533: areturn
      // 534: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 537: athrow
      // 538: iload 4
      // 53a: iload 2
      // 53b: ifeq 58d
      // 53e: sipush 4784
      // 541: ldc2_w 3082167687830622095
      // 544: invokestatic com/finalshell/core/U9.a (IJ)I
      // 547: if_icmpne 588
      // 54a: goto 551
      // 54d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 550: athrow
      // 551: aload 0
      // 552: dup
      // 553: getfield com/finalshell/core/U9.d I
      // 556: iload 3
      // 557: iadd
      // 558: putfield com/finalshell/core/U9.d I
      // 55b: aload 0
      // 55c: aload 0
      // 55d: aload 0
      // 55e: getfield com/finalshell/core/U9.d I
      // 561: invokevirtual com/finalshell/core/U9.C (I)C
      // 564: putfield com/finalshell/core/U9.l C
      // 567: aload 0
      // 568: sipush 19103
      // 56b: ldc2_w 2592984034142099420
      // 56e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 571: putfield com/finalshell/core/U9.z I
      // 574: aload 0
      // 575: sipush 16923
      // 578: ldc2_w 1571494982232874791
      // 57b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57e: putfield com/finalshell/core/U9.Y I
      // 581: aload 7
      // 583: areturn
      // 584: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 587: athrow
      // 588: iload 4
      // 58a: invokestatic com/finalshell/core/U9.Y (C)Z
      // 58d: iload 2
      // 58e: ifeq 5af
      // 591: ifeq 5b5
      // 594: goto 59b
      // 597: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59a: athrow
      // 59b: aload 0
      // 59c: aload 0
      // 59d: getfield com/finalshell/core/U9.d I
      // 5a0: iload 3
      // 5a1: iinc 3 1
      // 5a4: iadd
      // 5a5: invokevirtual com/finalshell/core/U9.C (I)C
      // 5a8: goto 5af
      // 5ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ae: athrow
      // 5af: istore 4
      // 5b1: iload 2
      // 5b2: ifne 4e8
      // 5b5: aload 0
      // 5b6: bipush -1
      // 5b7: putfield com/finalshell/core/U9.z I
      // 5ba: aconst_null
      // 5bb: areturn
      // 5bc: aload 0
      // 5bd: bipush -1
      // 5be: putfield com/finalshell/core/U9.z I
      // 5c1: aconst_null
      // 5c2: areturn
      // 5c3: iload 4
      // 5c5: sipush 26927
      // 5c8: ldc2_w 6101958691031889140
      // 5cb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5ce: iload 2
      // 5cf: ifeq 61e
      // 5d2: if_icmpne 613
      // 5d5: goto 5dc
      // 5d8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5db: athrow
      // 5dc: aload 0
      // 5dd: dup
      // 5de: getfield com/finalshell/core/U9.d I
      // 5e1: iload 3
      // 5e2: iadd
      // 5e3: putfield com/finalshell/core/U9.d I
      // 5e6: aload 0
      // 5e7: aload 0
      // 5e8: aload 0
      // 5e9: getfield com/finalshell/core/U9.d I
      // 5ec: invokevirtual com/finalshell/core/U9.C (I)C
      // 5ef: putfield com/finalshell/core/U9.l C
      // 5f2: aload 0
      // 5f3: sipush 5887
      // 5f6: ldc2_w 3467391210321595353
      // 5f9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5fc: putfield com/finalshell/core/U9.z I
      // 5ff: aload 0
      // 600: sipush 9361
      // 603: ldc2_w 2488456831667599749
      // 606: invokestatic com/finalshell/core/U9.a (IJ)I
      // 609: putfield com/finalshell/core/U9.Y I
      // 60c: aload 7
      // 60e: areturn
      // 60f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 612: athrow
      // 613: iload 4
      // 615: sipush 4784
      // 618: ldc2_w 3082167687830622095
      // 61b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 61e: iload 2
      // 61f: ifeq 646
      // 622: if_icmpne 780
      // 625: goto 62c
      // 628: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62b: athrow
      // 62c: aload 0
      // 62d: aload 0
      // 62e: getfield com/finalshell/core/U9.d I
      // 631: iload 3
      // 632: iinc 3 1
      // 635: iadd
      // 636: invokevirtual com/finalshell/core/U9.C (I)C
      // 639: istore 4
      // 63b: iload 4
      // 63d: sipush 26927
      // 640: ldc2_w 6101958691031889140
      // 643: invokestatic com/finalshell/core/U9.a (IJ)I
      // 646: iload 2
      // 647: ifeq 694
      // 64a: if_icmpne 682
      // 64d: goto 654
      // 650: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 653: athrow
      // 654: aload 0
      // 655: sipush 9361
      // 658: ldc2_w 2488456831667599749
      // 65b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 65e: putfield com/finalshell/core/U9.Y I
      // 661: aload 0
      // 662: dup
      // 663: getfield com/finalshell/core/U9.d I
      // 666: iload 3
      // 667: iadd
      // 668: putfield com/finalshell/core/U9.d I
      // 66b: aload 0
      // 66c: aload 0
      // 66d: aload 0
      // 66e: getfield com/finalshell/core/U9.d I
      // 671: invokevirtual com/finalshell/core/U9.C (I)C
      // 674: putfield com/finalshell/core/U9.l C
      // 677: iload 2
      // 678: ifne 76f
      // 67b: goto 682
      // 67e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 681: athrow
      // 682: iload 4
      // 684: sipush 30337
      // 687: ldc2_w 2029800848590515112
      // 68a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 68d: goto 694
      // 690: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 693: athrow
      // 694: iload 2
      // 695: ifeq 6e2
      // 698: if_icmpne 6d0
      // 69b: goto 6a2
      // 69e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a1: athrow
      // 6a2: aload 0
      // 6a3: sipush 9145
      // 6a6: ldc2_w 6577731744871808687
      // 6a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6ac: putfield com/finalshell/core/U9.Y I
      // 6af: aload 0
      // 6b0: dup
      // 6b1: getfield com/finalshell/core/U9.d I
      // 6b4: iload 3
      // 6b5: iadd
      // 6b6: putfield com/finalshell/core/U9.d I
      // 6b9: aload 0
      // 6ba: aload 0
      // 6bb: aload 0
      // 6bc: getfield com/finalshell/core/U9.d I
      // 6bf: invokevirtual com/finalshell/core/U9.C (I)C
      // 6c2: putfield com/finalshell/core/U9.l C
      // 6c5: iload 2
      // 6c6: ifne 76f
      // 6c9: goto 6d0
      // 6cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6cf: athrow
      // 6d0: iload 4
      // 6d2: sipush 4784
      // 6d5: ldc2_w 3082167687830622095
      // 6d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6db: goto 6e2
      // 6de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e1: athrow
      // 6e2: iload 2
      // 6e3: ifeq 730
      // 6e6: if_icmpne 71e
      // 6e9: goto 6f0
      // 6ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ef: athrow
      // 6f0: aload 0
      // 6f1: sipush 16923
      // 6f4: ldc2_w 1571494982232874791
      // 6f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6fa: putfield com/finalshell/core/U9.Y I
      // 6fd: aload 0
      // 6fe: dup
      // 6ff: getfield com/finalshell/core/U9.d I
      // 702: iload 3
      // 703: iadd
      // 704: putfield com/finalshell/core/U9.d I
      // 707: aload 0
      // 708: aload 0
      // 709: aload 0
      // 70a: getfield com/finalshell/core/U9.d I
      // 70d: invokevirtual com/finalshell/core/U9.C (I)C
      // 710: putfield com/finalshell/core/U9.l C
      // 713: iload 2
      // 714: ifne 76f
      // 717: goto 71e
      // 71a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71d: athrow
      // 71e: iload 4
      // 720: sipush 2765
      // 723: ldc2_w 8216137057917720563
      // 726: invokestatic com/finalshell/core/U9.a (IJ)I
      // 729: goto 730
      // 72c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72f: athrow
      // 730: if_icmpne 764
      // 733: aload 0
      // 734: sipush 9907
      // 737: ldc2_w 514190805586246625
      // 73a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 73d: putfield com/finalshell/core/U9.Y I
      // 740: aload 0
      // 741: dup
      // 742: getfield com/finalshell/core/U9.d I
      // 745: iload 3
      // 746: bipush 1
      // 747: isub
      // 748: iadd
      // 749: putfield com/finalshell/core/U9.d I
      // 74c: aload 0
      // 74d: sipush 2765
      // 750: ldc2_w 8216137057917720563
      // 753: invokestatic com/finalshell/core/U9.a (IJ)I
      // 756: putfield com/finalshell/core/U9.l C
      // 759: iload 2
      // 75a: ifne 76f
      // 75d: goto 764
      // 760: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 763: athrow
      // 764: aload 0
      // 765: bipush -1
      // 766: putfield com/finalshell/core/U9.z I
      // 769: aconst_null
      // 76a: areturn
      // 76b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76e: athrow
      // 76f: aload 0
      // 770: sipush 2897
      // 773: ldc2_w 695568451002816123
      // 776: invokestatic com/finalshell/core/U9.a (IJ)I
      // 779: putfield com/finalshell/core/U9.z I
      // 77c: iload 2
      // 77d: ifne 78b
      // 780: aload 0
      // 781: bipush -1
      // 782: putfield com/finalshell/core/U9.z I
      // 785: aconst_null
      // 786: areturn
      // 787: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78a: athrow
      // 78b: aload 7
      // 78d: areturn
   }

   public BigInteger z(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: iload 2
      // 044: ifne 062
      // 047: sipush 26107
      // 04a: ldc2_w 2081374444732725480
      // 04d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 050: if_icmpne 065
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: bipush 1
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: goto 066
      // 065: bipush 0
      // 066: istore 5
      // 068: iload 5
      // 06a: iload 2
      // 06b: ifne 089
      // 06e: ifeq 087
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: aload 0
      // 07a: getfield com/finalshell/core/U9.d I
      // 07d: iload 3
      // 07e: iinc 3 1
      // 081: iadd
      // 082: invokevirtual com/finalshell/core/U9.C (I)C
      // 085: istore 4
      // 087: iload 4
      // 089: iload 2
      // 08a: ifne 0a8
      // 08d: sipush 19418
      // 090: ldc2_w 715321441499911916
      // 093: invokestatic com/finalshell/core/U9.a (IJ)I
      // 096: if_icmpne 0ab
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: goto 0ac
      // 0ab: bipush 0
      // 0ac: istore 6
      // 0ae: iload 6
      // 0b0: iload 2
      // 0b1: ifne 0cf
      // 0b4: ifeq 0cd
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/U9.d I
      // 0c3: iload 3
      // 0c4: iinc 3 1
      // 0c7: iadd
      // 0c8: invokevirtual com/finalshell/core/U9.C (I)C
      // 0cb: istore 4
      // 0cd: iload 4
      // 0cf: sipush 21259
      // 0d2: ldc2_w 1287927339301015045
      // 0d5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d8: iload 2
      // 0d9: ifne 300
      // 0dc: if_icmplt 2ee
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: sipush 24153
      // 0eb: ldc2_w 3168790736949871469
      // 0ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f1: iload 2
      // 0f2: ifne 300
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: if_icmpgt 2ee
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: iload 4
      // 108: sipush 21259
      // 10b: ldc2_w 1287927339301015045
      // 10e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 111: isub
      // 112: i2l
      // 113: lstore 8
      // 115: bipush 0
      // 116: istore 10
      // 118: aload 0
      // 119: aload 0
      // 11a: getfield com/finalshell/core/U9.d I
      // 11d: iload 3
      // 11e: iinc 3 1
      // 121: iadd
      // 122: invokevirtual com/finalshell/core/U9.C (I)C
      // 125: istore 4
      // 127: iload 4
      // 129: sipush 21259
      // 12c: ldc2_w 1287927339301015045
      // 12f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 132: if_icmplt 19e
      // 135: iload 4
      // 137: iload 2
      // 138: ifne 1a0
      // 13b: sipush 24153
      // 13e: ldc2_w 3168790736949871469
      // 141: invokestatic com/finalshell/core/U9.a (IJ)I
      // 144: iload 2
      // 145: ifne 211
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: if_icmpgt 19e
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: lload 8
      // 15b: sipush 3395
      // 15e: ldc2_w 2174368042043745818
      // 161: invokestatic com/finalshell/core/U9.c (IJ)J
      // 164: lmul
      // 165: iload 4
      // 167: sipush 21259
      // 16a: ldc2_w 1287927339301015045
      // 16d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 170: isub
      // 171: i2l
      // 172: ladd
      // 173: lstore 11
      // 175: lload 11
      // 177: iload 2
      // 178: ifne 198
      // 17b: lload 8
      // 17d: lcmp
      // 17e: ifge 18f
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: bipush 1
      // 189: istore 10
      // 18b: iload 2
      // 18c: ifeq 19e
      // 18f: lload 11
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: lstore 8
      // 19a: iload 2
      // 19b: ifeq 118
      // 19e: iload 5
      // 1a0: iload 2
      // 1a1: ifne 212
      // 1a4: ifeq 204
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: iload 4
      // 1b0: sipush 26107
      // 1b3: ldc2_w 2081374444732725480
      // 1b6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b9: iload 2
      // 1ba: ifne 1f0
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c3: athrow
      // 1c4: if_icmpeq 1d9
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: bipush -1
      // 1d0: putfield com/finalshell/core/U9.z I
      // 1d3: aconst_null
      // 1d4: areturn
      // 1d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: aload 0
      // 1db: getfield com/finalshell/core/U9.d I
      // 1de: iload 3
      // 1df: iinc 3 1
      // 1e2: iadd
      // 1e3: invokevirtual com/finalshell/core/U9.C (I)C
      // 1e6: istore 4
      // 1e8: aload 0
      // 1e9: getfield com/finalshell/core/U9.d I
      // 1ec: aload 1
      // 1ed: arraylength
      // 1ee: iadd
      // 1ef: bipush 1
      // 1f0: iadd
      // 1f1: istore 13
      // 1f3: aload 0
      // 1f4: getfield com/finalshell/core/U9.d I
      // 1f7: iload 3
      // 1f8: iadd
      // 1f9: iload 13
      // 1fb: isub
      // 1fc: bipush 2
      // 1fd: isub
      // 1fe: istore 14
      // 200: iload 2
      // 201: ifeq 221
      // 204: aload 0
      // 205: getfield com/finalshell/core/U9.d I
      // 208: aload 1
      // 209: arraylength
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: iadd
      // 212: istore 13
      // 214: aload 0
      // 215: getfield com/finalshell/core/U9.d I
      // 218: iload 3
      // 219: iadd
      // 21a: iload 13
      // 21c: isub
      // 21d: bipush 1
      // 21e: isub
      // 21f: istore 14
      // 221: iload 10
      // 223: iload 2
      // 224: ifne 2ab
      // 227: ifne 2a2
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: iload 14
      // 233: iload 2
      // 234: ifne 28a
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23d: athrow
      // 23e: sipush 9907
      // 241: ldc2_w 514190805586246625
      // 244: invokestatic com/finalshell/core/U9.a (IJ)I
      // 247: if_icmplt 288
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: iload 6
      // 253: iload 2
      // 254: ifne 2ab
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25d: athrow
      // 25e: ifeq 2a2
      // 261: goto 268
      // 264: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 267: athrow
      // 268: iload 14
      // 26a: sipush 7609
      // 26d: ldc2_w 8745918760387363013
      // 270: invokestatic com/finalshell/core/U9.a (IJ)I
      // 273: iload 2
      // 274: ifne 2b4
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27d: athrow
      // 27e: if_icmpge 2a2
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: iload 6
      // 28a: ifeq 297
      // 28d: lload 8
      // 28f: lneg
      // 290: goto 299
      // 293: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 296: athrow
      // 297: lload 8
      // 299: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 29c: astore 7
      // 29e: iload 2
      // 29f: ifeq 2ea
      // 2a2: iload 14
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: sipush 28697
      // 2ae: ldc2_w 6865322254820814080
      // 2b1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b4: if_icmple 2cc
      // 2b7: new com/finalshell/core/Hi2
      // 2ba: dup
      // 2bb: sipush 10537
      // 2be: sipush -21872
      // 2c1: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 2c4: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2c7: athrow
      // 2c8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: aload 0
      // 2cd: iload 13
      // 2cf: iload 14
      // 2d1: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 2d4: astore 15
      // 2d6: new java/math/BigInteger
      // 2d9: dup
      // 2da: aload 15
      // 2dc: sipush 1861
      // 2df: ldc2_w 5349631099953699429
      // 2e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e5: invokespecial java/math/BigInteger.<init> (Ljava/lang/String;I)V
      // 2e8: astore 7
      // 2ea: iload 2
      // 2eb: ifeq 4c6
      // 2ee: iload 4
      // 2f0: sipush 7800
      // 2f3: ldc2_w 5201320676148134657
      // 2f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f9: goto 300
      // 2fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: iload 2
      // 301: ifne 333
      // 304: if_icmpne 4bf
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: aload 0
      // 30f: aload 0
      // 310: getfield com/finalshell/core/U9.d I
      // 313: iload 3
      // 314: iadd
      // 315: iload 2
      // 316: ifne 4c1
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: invokevirtual com/finalshell/core/U9.C (I)C
      // 323: sipush 25252
      // 326: ldc2_w 2256381802227974060
      // 329: invokestatic com/finalshell/core/U9.a (IJ)I
      // 32c: goto 333
      // 32f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 332: athrow
      // 333: if_icmpne 4bf
      // 336: aload 0
      // 337: aload 0
      // 338: getfield com/finalshell/core/U9.d I
      // 33b: iload 3
      // 33c: iadd
      // 33d: bipush 1
      // 33e: iadd
      // 33f: iload 2
      // 340: ifne 4c1
      // 343: goto 34a
      // 346: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 349: athrow
      // 34a: invokevirtual com/finalshell/core/U9.C (I)C
      // 34d: sipush 7325
      // 350: ldc2_w 7975301603790307833
      // 353: invokestatic com/finalshell/core/U9.a (IJ)I
      // 356: if_icmpne 4bf
      // 359: goto 360
      // 35c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35f: athrow
      // 360: aload 0
      // 361: aload 0
      // 362: getfield com/finalshell/core/U9.d I
      // 365: iload 3
      // 366: iadd
      // 367: bipush 2
      // 368: iadd
      // 369: iload 2
      // 36a: ifne 4c1
      // 36d: goto 374
      // 370: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 373: athrow
      // 374: invokevirtual com/finalshell/core/U9.C (I)C
      // 377: sipush 7325
      // 37a: ldc2_w 7975301603790307833
      // 37d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 380: if_icmpne 4bf
      // 383: goto 38a
      // 386: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 389: athrow
      // 38a: aload 0
      // 38b: sipush 19103
      // 38e: ldc2_w 2592984034142099420
      // 391: invokestatic com/finalshell/core/U9.a (IJ)I
      // 394: putfield com/finalshell/core/U9.z I
      // 397: aconst_null
      // 398: astore 7
      // 39a: iinc 3 3
      // 39d: aload 0
      // 39e: aload 0
      // 39f: getfield com/finalshell/core/U9.d I
      // 3a2: iload 3
      // 3a3: iinc 3 1
      // 3a6: iadd
      // 3a7: invokevirtual com/finalshell/core/U9.C (I)C
      // 3aa: istore 4
      // 3ac: iload 5
      // 3ae: iload 2
      // 3af: ifne 3ed
      // 3b2: ifeq 3eb
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: iload 4
      // 3be: sipush 26107
      // 3c1: ldc2_w 2081374444732725480
      // 3c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c7: iload 2
      // 3c8: ifne 3f6
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: if_icmpne 3eb
      // 3d5: goto 3dc
      // 3d8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3db: athrow
      // 3dc: aload 0
      // 3dd: aload 0
      // 3de: getfield com/finalshell/core/U9.d I
      // 3e1: iload 3
      // 3e2: iinc 3 1
      // 3e5: iadd
      // 3e6: invokevirtual com/finalshell/core/U9.C (I)C
      // 3e9: istore 4
      // 3eb: iload 4
      // 3ed: sipush 26927
      // 3f0: ldc2_w 6101958691031889140
      // 3f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f6: if_icmpne 43b
      // 3f9: aload 0
      // 3fa: dup
      // 3fb: getfield com/finalshell/core/U9.d I
      // 3fe: iload 3
      // 3ff: iadd
      // 400: putfield com/finalshell/core/U9.d I
      // 403: aload 0
      // 404: aload 0
      // 405: aload 0
      // 406: getfield com/finalshell/core/U9.d I
      // 409: invokevirtual com/finalshell/core/U9.C (I)C
      // 40c: putfield com/finalshell/core/U9.l C
      // 40f: aload 0
      // 410: sipush 19103
      // 413: ldc2_w 2592984034142099420
      // 416: invokestatic com/finalshell/core/U9.a (IJ)I
      // 419: putfield com/finalshell/core/U9.z I
      // 41c: aload 0
      // 41d: sipush 9361
      // 420: ldc2_w 2488456831667599749
      // 423: invokestatic com/finalshell/core/U9.a (IJ)I
      // 426: putfield com/finalshell/core/U9.Y I
      // 429: aload 7
      // 42b: iload 2
      // 42c: ifne 4be
      // 42f: goto 436
      // 432: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 435: athrow
      // 436: areturn
      // 437: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43a: athrow
      // 43b: iload 4
      // 43d: iload 2
      // 43e: ifne 490
      // 441: sipush 4784
      // 444: ldc2_w 3082167687830622095
      // 447: invokestatic com/finalshell/core/U9.a (IJ)I
      // 44a: if_icmpne 48b
      // 44d: goto 454
      // 450: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 453: athrow
      // 454: aload 0
      // 455: dup
      // 456: getfield com/finalshell/core/U9.d I
      // 459: iload 3
      // 45a: iadd
      // 45b: putfield com/finalshell/core/U9.d I
      // 45e: aload 0
      // 45f: aload 0
      // 460: aload 0
      // 461: getfield com/finalshell/core/U9.d I
      // 464: invokevirtual com/finalshell/core/U9.C (I)C
      // 467: putfield com/finalshell/core/U9.l C
      // 46a: aload 0
      // 46b: sipush 19103
      // 46e: ldc2_w 2592984034142099420
      // 471: invokestatic com/finalshell/core/U9.a (IJ)I
      // 474: putfield com/finalshell/core/U9.z I
      // 477: aload 0
      // 478: sipush 16923
      // 47b: ldc2_w 1571494982232874791
      // 47e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 481: putfield com/finalshell/core/U9.Y I
      // 484: aload 7
      // 486: areturn
      // 487: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48a: athrow
      // 48b: iload 4
      // 48d: invokestatic com/finalshell/core/U9.Y (C)Z
      // 490: iload 2
      // 491: ifne 4b2
      // 494: ifeq 4b8
      // 497: goto 49e
      // 49a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49d: athrow
      // 49e: aload 0
      // 49f: aload 0
      // 4a0: getfield com/finalshell/core/U9.d I
      // 4a3: iload 3
      // 4a4: iinc 3 1
      // 4a7: iadd
      // 4a8: invokevirtual com/finalshell/core/U9.C (I)C
      // 4ab: goto 4b2
      // 4ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b1: athrow
      // 4b2: istore 4
      // 4b4: iload 2
      // 4b5: ifeq 3eb
      // 4b8: aload 0
      // 4b9: bipush -1
      // 4ba: putfield com/finalshell/core/U9.z I
      // 4bd: aconst_null
      // 4be: areturn
      // 4bf: aload 0
      // 4c0: bipush -1
      // 4c1: putfield com/finalshell/core/U9.z I
      // 4c4: aconst_null
      // 4c5: areturn
      // 4c6: iload 4
      // 4c8: sipush 26927
      // 4cb: ldc2_w 6101958691031889140
      // 4ce: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4d1: iload 2
      // 4d2: ifne 521
      // 4d5: if_icmpne 516
      // 4d8: goto 4df
      // 4db: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4de: athrow
      // 4df: aload 0
      // 4e0: dup
      // 4e1: getfield com/finalshell/core/U9.d I
      // 4e4: iload 3
      // 4e5: iadd
      // 4e6: putfield com/finalshell/core/U9.d I
      // 4e9: aload 0
      // 4ea: aload 0
      // 4eb: aload 0
      // 4ec: getfield com/finalshell/core/U9.d I
      // 4ef: invokevirtual com/finalshell/core/U9.C (I)C
      // 4f2: putfield com/finalshell/core/U9.l C
      // 4f5: aload 0
      // 4f6: sipush 5887
      // 4f9: ldc2_w 3467391210321595353
      // 4fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ff: putfield com/finalshell/core/U9.z I
      // 502: aload 0
      // 503: sipush 9361
      // 506: ldc2_w 2488456831667599749
      // 509: invokestatic com/finalshell/core/U9.a (IJ)I
      // 50c: putfield com/finalshell/core/U9.Y I
      // 50f: aload 7
      // 511: areturn
      // 512: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 515: athrow
      // 516: iload 4
      // 518: sipush 4784
      // 51b: ldc2_w 3082167687830622095
      // 51e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 521: iload 2
      // 522: ifne 549
      // 525: if_icmpne 683
      // 528: goto 52f
      // 52b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52e: athrow
      // 52f: aload 0
      // 530: aload 0
      // 531: getfield com/finalshell/core/U9.d I
      // 534: iload 3
      // 535: iinc 3 1
      // 538: iadd
      // 539: invokevirtual com/finalshell/core/U9.C (I)C
      // 53c: istore 4
      // 53e: iload 4
      // 540: sipush 26927
      // 543: ldc2_w 6101958691031889140
      // 546: invokestatic com/finalshell/core/U9.a (IJ)I
      // 549: iload 2
      // 54a: ifne 597
      // 54d: if_icmpne 585
      // 550: goto 557
      // 553: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 556: athrow
      // 557: aload 0
      // 558: sipush 9361
      // 55b: ldc2_w 2488456831667599749
      // 55e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 561: putfield com/finalshell/core/U9.Y I
      // 564: aload 0
      // 565: dup
      // 566: getfield com/finalshell/core/U9.d I
      // 569: iload 3
      // 56a: iadd
      // 56b: putfield com/finalshell/core/U9.d I
      // 56e: aload 0
      // 56f: aload 0
      // 570: aload 0
      // 571: getfield com/finalshell/core/U9.d I
      // 574: invokevirtual com/finalshell/core/U9.C (I)C
      // 577: putfield com/finalshell/core/U9.l C
      // 57a: iload 2
      // 57b: ifeq 672
      // 57e: goto 585
      // 581: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 584: athrow
      // 585: iload 4
      // 587: sipush 30337
      // 58a: ldc2_w 2029800848590515112
      // 58d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 590: goto 597
      // 593: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 596: athrow
      // 597: iload 2
      // 598: ifne 5e5
      // 59b: if_icmpne 5d3
      // 59e: goto 5a5
      // 5a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a4: athrow
      // 5a5: aload 0
      // 5a6: sipush 9145
      // 5a9: ldc2_w 6577731744871808687
      // 5ac: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5af: putfield com/finalshell/core/U9.Y I
      // 5b2: aload 0
      // 5b3: dup
      // 5b4: getfield com/finalshell/core/U9.d I
      // 5b7: iload 3
      // 5b8: iadd
      // 5b9: putfield com/finalshell/core/U9.d I
      // 5bc: aload 0
      // 5bd: aload 0
      // 5be: aload 0
      // 5bf: getfield com/finalshell/core/U9.d I
      // 5c2: invokevirtual com/finalshell/core/U9.C (I)C
      // 5c5: putfield com/finalshell/core/U9.l C
      // 5c8: iload 2
      // 5c9: ifeq 672
      // 5cc: goto 5d3
      // 5cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d2: athrow
      // 5d3: iload 4
      // 5d5: sipush 4784
      // 5d8: ldc2_w 3082167687830622095
      // 5db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5de: goto 5e5
      // 5e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e4: athrow
      // 5e5: iload 2
      // 5e6: ifne 633
      // 5e9: if_icmpne 621
      // 5ec: goto 5f3
      // 5ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f2: athrow
      // 5f3: aload 0
      // 5f4: sipush 16923
      // 5f7: ldc2_w 1571494982232874791
      // 5fa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5fd: putfield com/finalshell/core/U9.Y I
      // 600: aload 0
      // 601: dup
      // 602: getfield com/finalshell/core/U9.d I
      // 605: iload 3
      // 606: iadd
      // 607: putfield com/finalshell/core/U9.d I
      // 60a: aload 0
      // 60b: aload 0
      // 60c: aload 0
      // 60d: getfield com/finalshell/core/U9.d I
      // 610: invokevirtual com/finalshell/core/U9.C (I)C
      // 613: putfield com/finalshell/core/U9.l C
      // 616: iload 2
      // 617: ifeq 672
      // 61a: goto 621
      // 61d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 620: athrow
      // 621: iload 4
      // 623: sipush 2765
      // 626: ldc2_w 8216137057917720563
      // 629: invokestatic com/finalshell/core/U9.a (IJ)I
      // 62c: goto 633
      // 62f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 632: athrow
      // 633: if_icmpne 667
      // 636: aload 0
      // 637: sipush 9907
      // 63a: ldc2_w 514190805586246625
      // 63d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 640: putfield com/finalshell/core/U9.Y I
      // 643: aload 0
      // 644: dup
      // 645: getfield com/finalshell/core/U9.d I
      // 648: iload 3
      // 649: bipush 1
      // 64a: isub
      // 64b: iadd
      // 64c: putfield com/finalshell/core/U9.d I
      // 64f: aload 0
      // 650: sipush 2765
      // 653: ldc2_w 8216137057917720563
      // 656: invokestatic com/finalshell/core/U9.a (IJ)I
      // 659: putfield com/finalshell/core/U9.l C
      // 65c: iload 2
      // 65d: ifeq 672
      // 660: goto 667
      // 663: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 666: athrow
      // 667: aload 0
      // 668: bipush -1
      // 669: putfield com/finalshell/core/U9.z I
      // 66c: aconst_null
      // 66d: areturn
      // 66e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 671: athrow
      // 672: aload 0
      // 673: sipush 2897
      // 676: ldc2_w 695568451002816123
      // 679: invokestatic com/finalshell/core/U9.a (IJ)I
      // 67c: putfield com/finalshell/core/U9.z I
      // 67f: iload 2
      // 680: ifeq 68e
      // 683: aload 0
      // 684: bipush -1
      // 685: putfield com/finalshell/core/U9.z I
      // 688: aconst_null
      // 689: areturn
      // 68a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68d: athrow
      // 68e: aload 7
      // 690: areturn
   }

   public Date i(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifeq 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: sipush 26107
      // 046: ldc2_w 2081374444732725480
      // 049: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04c: iload 2
      // 04d: ifeq 20b
      // 050: if_icmpne 1f9
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/U9.d I
      // 05e: aload 1
      // 05f: arraylength
      // 060: iadd
      // 061: bipush 1
      // 062: iadd
      // 063: istore 6
      // 065: aload 0
      // 066: sipush 26107
      // 069: ldc2_w 2081374444732725480
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: iload 6
      // 071: invokevirtual com/finalshell/core/U9.d (CI)I
      // 074: istore 7
      // 076: iload 7
      // 078: bipush -1
      // 079: iload 2
      // 07a: ifeq 0a4
      // 07d: if_icmpne 09c
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: new com/finalshell/core/Hi2
      // 08a: dup
      // 08b: sipush 10510
      // 08e: sipush -21017
      // 091: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 094: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 097: athrow
      // 098: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield com/finalshell/core/U9.d I
      // 0a0: aload 1
      // 0a1: arraylength
      // 0a2: iadd
      // 0a3: bipush 1
      // 0a4: iadd
      // 0a5: istore 8
      // 0a7: aload 0
      // 0a8: iload 8
      // 0aa: iload 7
      // 0ac: iload 8
      // 0ae: isub
      // 0af: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 0b2: astore 9
      // 0b4: aload 9
      // 0b6: sipush 30531
      // 0b9: ldc2_w 4175784576570993226
      // 0bc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0bf: invokevirtual java/lang/String.indexOf (I)I
      // 0c2: bipush -1
      // 0c3: iload 2
      // 0c4: ifeq 18a
      // 0c7: if_icmpeq 17b
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: istore 10
      // 0d4: iload 7
      // 0d6: bipush 1
      // 0d7: isub
      // 0d8: istore 11
      // 0da: iload 11
      // 0dc: iflt 118
      // 0df: aload 0
      // 0e0: iload 11
      // 0e2: invokevirtual com/finalshell/core/U9.C (I)C
      // 0e5: sipush 30531
      // 0e8: ldc2_w 4175784576570993226
      // 0eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ee: iload 2
      // 0ef: ifeq 11b
      // 0f2: iload 2
      // 0f3: ifeq 11b
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: if_icmpne 118
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: iinc 10 1
      // 10a: iinc 11 -1
      // 10d: iload 2
      // 10e: ifne 0da
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: iload 10
      // 11a: bipush 2
      // 11b: irem
      // 11c: iload 2
      // 11d: ifeq 14d
      // 120: ifne 135
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: iload 2
      // 12b: ifne 153
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 0
      // 136: sipush 26107
      // 139: ldc2_w 2081374444732725480
      // 13c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13f: iload 7
      // 141: bipush 1
      // 142: iadd
      // 143: invokevirtual com/finalshell/core/U9.d (CI)I
      // 146: goto 14d
      // 149: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: istore 7
      // 14f: iload 2
      // 150: ifne 0d1
      // 153: iload 7
      // 155: aload 0
      // 156: getfield com/finalshell/core/U9.d I
      // 159: aload 1
      // 15a: arraylength
      // 15b: iadd
      // 15c: bipush 1
      // 15d: iadd
      // 15e: isub
      // 15f: istore 10
      // 161: aload 0
      // 162: aload 0
      // 163: getfield com/finalshell/core/U9.d I
      // 166: aload 1
      // 167: arraylength
      // 168: iadd
      // 169: bipush 1
      // 16a: iadd
      // 16b: iload 10
      // 16d: invokevirtual com/finalshell/core/U9.s (II)[C
      // 170: astore 11
      // 172: aload 11
      // 174: iload 10
      // 176: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 179: astore 9
      // 17b: iload 3
      // 17c: iload 7
      // 17e: aload 0
      // 17f: getfield com/finalshell/core/U9.d I
      // 182: aload 1
      // 183: arraylength
      // 184: iadd
      // 185: bipush 1
      // 186: iadd
      // 187: isub
      // 188: bipush 1
      // 189: iadd
      // 18a: iadd
      // 18b: istore 3
      // 18c: aload 0
      // 18d: aload 0
      // 18e: getfield com/finalshell/core/U9.d I
      // 191: iload 3
      // 192: iinc 3 1
      // 195: iadd
      // 196: invokevirtual com/finalshell/core/U9.C (I)C
      // 199: istore 4
      // 19b: new com/finalshell/core/Uy2_2
      // 19e: dup
      // 19f: aload 9
      // 1a1: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 1a4: astore 10
      // 1a6: aload 10
      // 1a8: bipush 0
      // 1a9: iload 2
      // 1aa: ifeq 1d5
      // 1ad: invokevirtual com/finalshell/core/Uy2_2.Z (Z)Z
      // 1b0: ifeq 1cc
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: aload 10
      // 1bc: invokevirtual com/finalshell/core/Uy2_2.c ()Ljava/util/Calendar;
      // 1bf: astore 11
      // 1c1: aload 11
      // 1c3: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 1c6: astore 5
      // 1c8: iload 2
      // 1c9: ifne 1e3
      // 1cc: aload 0
      // 1cd: bipush -1
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: putfield com/finalshell/core/U9.z I
      // 1d8: aconst_null
      // 1d9: astore 11
      // 1db: aload 10
      // 1dd: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1e0: aload 11
      // 1e2: areturn
      // 1e3: aload 10
      // 1e5: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1e8: goto 1f5
      // 1eb: astore 12
      // 1ed: aload 10
      // 1ef: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1f2: aload 12
      // 1f4: athrow
      // 1f5: iload 2
      // 1f6: ifne 369
      // 1f9: iload 4
      // 1fb: sipush 19418
      // 1fe: ldc2_w 715321441499911916
      // 201: invokestatic com/finalshell/core/U9.a (IJ)I
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: iload 2
      // 20c: ifeq 22b
      // 20f: if_icmpeq 24e
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: iload 4
      // 21b: sipush 21259
      // 21e: ldc2_w 1287927339301015045
      // 221: invokestatic com/finalshell/core/U9.a (IJ)I
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22a: athrow
      // 22b: iload 2
      // 22c: ifeq 24b
      // 22f: if_icmplt 35e
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: iload 4
      // 23b: sipush 24153
      // 23e: ldc2_w 3168790736949871469
      // 241: invokestatic com/finalshell/core/U9.a (IJ)I
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24a: athrow
      // 24b: if_icmpgt 35e
      // 24e: lconst_0
      // 24f: lstore 6
      // 251: bipush 0
      // 252: istore 8
      // 254: iload 4
      // 256: sipush 19418
      // 259: ldc2_w 715321441499911916
      // 25c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25f: iload 2
      // 260: ifeq 295
      // 263: if_icmpne 27f
      // 266: goto 26d
      // 269: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26c: athrow
      // 26d: aload 0
      // 26e: aload 0
      // 26f: getfield com/finalshell/core/U9.d I
      // 272: iload 3
      // 273: iinc 3 1
      // 276: iadd
      // 277: invokevirtual com/finalshell/core/U9.C (I)C
      // 27a: istore 4
      // 27c: bipush 1
      // 27d: istore 8
      // 27f: iload 4
      // 281: iload 2
      // 282: ifeq 32c
      // 285: sipush 21259
      // 288: ldc2_w 1287927339301015045
      // 28b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28e: goto 295
      // 291: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: if_icmplt 328
      // 298: iload 4
      // 29a: iload 2
      // 29b: ifeq 32c
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a4: athrow
      // 2a5: sipush 24153
      // 2a8: ldc2_w 3168790736949871469
      // 2ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ae: if_icmpgt 328
      // 2b1: goto 2b8
      // 2b4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b7: athrow
      // 2b8: iload 4
      // 2ba: sipush 21259
      // 2bd: ldc2_w 1287927339301015045
      // 2c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c3: isub
      // 2c4: i2l
      // 2c5: lstore 6
      // 2c7: aload 0
      // 2c8: aload 0
      // 2c9: getfield com/finalshell/core/U9.d I
      // 2cc: iload 3
      // 2cd: iinc 3 1
      // 2d0: iadd
      // 2d1: invokevirtual com/finalshell/core/U9.C (I)C
      // 2d4: istore 4
      // 2d6: iload 4
      // 2d8: sipush 21259
      // 2db: ldc2_w 1287927339301015045
      // 2de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e1: if_icmplt 328
      // 2e4: iload 4
      // 2e6: iload 2
      // 2e7: ifeq 32c
      // 2ea: iload 2
      // 2eb: ifeq 32c
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: sipush 24153
      // 2f8: ldc2_w 3168790736949871469
      // 2fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2fe: if_icmpgt 328
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: lload 6
      // 30a: sipush 3395
      // 30d: ldc2_w 2174368042043745818
      // 310: invokestatic com/finalshell/core/U9.c (IJ)J
      // 313: lmul
      // 314: iload 4
      // 316: sipush 21259
      // 319: ldc2_w 1287927339301015045
      // 31c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 31f: isub
      // 320: i2l
      // 321: ladd
      // 322: lstore 6
      // 324: iload 2
      // 325: ifne 2c7
      // 328: lload 6
      // 32a: lconst_0
      // 32b: lcmp
      // 32c: iload 2
      // 32d: ifeq 347
      // 330: ifge 345
      // 333: goto 33a
      // 336: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 339: athrow
      // 33a: aload 0
      // 33b: bipush -1
      // 33c: putfield com/finalshell/core/U9.z I
      // 33f: aconst_null
      // 340: areturn
      // 341: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: iload 8
      // 347: ifeq 34f
      // 34a: lload 6
      // 34c: lneg
      // 34d: lstore 6
      // 34f: new java/util/Date
      // 352: dup
      // 353: lload 6
      // 355: invokespecial java/util/Date.<init> (J)V
      // 358: astore 5
      // 35a: iload 2
      // 35b: ifne 369
      // 35e: aload 0
      // 35f: bipush -1
      // 360: putfield com/finalshell/core/U9.z I
      // 363: aconst_null
      // 364: areturn
      // 365: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: iload 4
      // 36b: sipush 26927
      // 36e: ldc2_w 6101958691031889140
      // 371: invokestatic com/finalshell/core/U9.a (IJ)I
      // 374: iload 2
      // 375: ifeq 3b7
      // 378: if_icmpne 3ac
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: aload 0
      // 383: dup
      // 384: getfield com/finalshell/core/U9.d I
      // 387: iload 3
      // 388: iadd
      // 389: putfield com/finalshell/core/U9.d I
      // 38c: aload 0
      // 38d: aload 0
      // 38e: aload 0
      // 38f: getfield com/finalshell/core/U9.d I
      // 392: invokevirtual com/finalshell/core/U9.C (I)C
      // 395: putfield com/finalshell/core/U9.l C
      // 398: aload 0
      // 399: sipush 5887
      // 39c: ldc2_w 3467391210321595353
      // 39f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a2: putfield com/finalshell/core/U9.z I
      // 3a5: aload 5
      // 3a7: areturn
      // 3a8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ab: athrow
      // 3ac: iload 4
      // 3ae: sipush 4784
      // 3b1: ldc2_w 3082167687830622095
      // 3b4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3b7: iload 2
      // 3b8: ifeq 3df
      // 3bb: if_icmpne 519
      // 3be: goto 3c5
      // 3c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c4: athrow
      // 3c5: aload 0
      // 3c6: aload 0
      // 3c7: getfield com/finalshell/core/U9.d I
      // 3ca: iload 3
      // 3cb: iinc 3 1
      // 3ce: iadd
      // 3cf: invokevirtual com/finalshell/core/U9.C (I)C
      // 3d2: istore 4
      // 3d4: iload 4
      // 3d6: sipush 26927
      // 3d9: ldc2_w 6101958691031889140
      // 3dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3df: iload 2
      // 3e0: ifeq 42d
      // 3e3: if_icmpne 41b
      // 3e6: goto 3ed
      // 3e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ec: athrow
      // 3ed: aload 0
      // 3ee: sipush 9361
      // 3f1: ldc2_w 2488456831667599749
      // 3f4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f7: putfield com/finalshell/core/U9.Y I
      // 3fa: aload 0
      // 3fb: dup
      // 3fc: getfield com/finalshell/core/U9.d I
      // 3ff: iload 3
      // 400: iadd
      // 401: putfield com/finalshell/core/U9.d I
      // 404: aload 0
      // 405: aload 0
      // 406: aload 0
      // 407: getfield com/finalshell/core/U9.d I
      // 40a: invokevirtual com/finalshell/core/U9.C (I)C
      // 40d: putfield com/finalshell/core/U9.l C
      // 410: iload 2
      // 411: ifne 508
      // 414: goto 41b
      // 417: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41a: athrow
      // 41b: iload 4
      // 41d: sipush 30337
      // 420: ldc2_w 2029800848590515112
      // 423: invokestatic com/finalshell/core/U9.a (IJ)I
      // 426: goto 42d
      // 429: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42c: athrow
      // 42d: iload 2
      // 42e: ifeq 47b
      // 431: if_icmpne 469
      // 434: goto 43b
      // 437: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43a: athrow
      // 43b: aload 0
      // 43c: sipush 9145
      // 43f: ldc2_w 6577731744871808687
      // 442: invokestatic com/finalshell/core/U9.a (IJ)I
      // 445: putfield com/finalshell/core/U9.Y I
      // 448: aload 0
      // 449: dup
      // 44a: getfield com/finalshell/core/U9.d I
      // 44d: iload 3
      // 44e: iadd
      // 44f: putfield com/finalshell/core/U9.d I
      // 452: aload 0
      // 453: aload 0
      // 454: aload 0
      // 455: getfield com/finalshell/core/U9.d I
      // 458: invokevirtual com/finalshell/core/U9.C (I)C
      // 45b: putfield com/finalshell/core/U9.l C
      // 45e: iload 2
      // 45f: ifne 508
      // 462: goto 469
      // 465: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 468: athrow
      // 469: iload 4
      // 46b: sipush 4784
      // 46e: ldc2_w 3082167687830622095
      // 471: invokestatic com/finalshell/core/U9.a (IJ)I
      // 474: goto 47b
      // 477: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47a: athrow
      // 47b: iload 2
      // 47c: ifeq 4c9
      // 47f: if_icmpne 4b7
      // 482: goto 489
      // 485: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 488: athrow
      // 489: aload 0
      // 48a: sipush 16923
      // 48d: ldc2_w 1571494982232874791
      // 490: invokestatic com/finalshell/core/U9.a (IJ)I
      // 493: putfield com/finalshell/core/U9.Y I
      // 496: aload 0
      // 497: dup
      // 498: getfield com/finalshell/core/U9.d I
      // 49b: iload 3
      // 49c: iadd
      // 49d: putfield com/finalshell/core/U9.d I
      // 4a0: aload 0
      // 4a1: aload 0
      // 4a2: aload 0
      // 4a3: getfield com/finalshell/core/U9.d I
      // 4a6: invokevirtual com/finalshell/core/U9.C (I)C
      // 4a9: putfield com/finalshell/core/U9.l C
      // 4ac: iload 2
      // 4ad: ifne 508
      // 4b0: goto 4b7
      // 4b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b6: athrow
      // 4b7: iload 4
      // 4b9: sipush 2765
      // 4bc: ldc2_w 8216137057917720563
      // 4bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c2: goto 4c9
      // 4c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c8: athrow
      // 4c9: if_icmpne 4fd
      // 4cc: aload 0
      // 4cd: sipush 9907
      // 4d0: ldc2_w 514190805586246625
      // 4d3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4d6: putfield com/finalshell/core/U9.Y I
      // 4d9: aload 0
      // 4da: dup
      // 4db: getfield com/finalshell/core/U9.d I
      // 4de: iload 3
      // 4df: bipush 1
      // 4e0: isub
      // 4e1: iadd
      // 4e2: putfield com/finalshell/core/U9.d I
      // 4e5: aload 0
      // 4e6: sipush 2765
      // 4e9: ldc2_w 8216137057917720563
      // 4ec: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ef: putfield com/finalshell/core/U9.l C
      // 4f2: iload 2
      // 4f3: ifne 508
      // 4f6: goto 4fd
      // 4f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fc: athrow
      // 4fd: aload 0
      // 4fe: bipush -1
      // 4ff: putfield com/finalshell/core/U9.z I
      // 502: aconst_null
      // 503: areturn
      // 504: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 507: athrow
      // 508: aload 0
      // 509: sipush 2897
      // 50c: ldc2_w 695568451002816123
      // 50f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 512: putfield com/finalshell/core/U9.z I
      // 515: iload 2
      // 516: ifne 524
      // 519: aload 0
      // 51a: bipush -1
      // 51b: putfield com/finalshell/core/U9.z I
      // 51e: aconst_null
      // 51f: areturn
      // 520: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 523: athrow
      // 524: aload 5
      // 526: areturn
   }

   public Date z(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: bipush 0
      // 00a: istore 3
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: sipush 26107
      // 01f: ldc2_w 2081374444732725480
      // 022: invokestatic com/finalshell/core/U9.a (IJ)I
      // 025: iload 2
      // 026: ifeq 1d5
      // 029: if_icmpne 1c3
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: bipush 1
      // 038: iadd
      // 039: istore 6
      // 03b: aload 0
      // 03c: sipush 26107
      // 03f: ldc2_w 2081374444732725480
      // 042: invokestatic com/finalshell/core/U9.a (IJ)I
      // 045: iload 6
      // 047: invokevirtual com/finalshell/core/U9.d (CI)I
      // 04a: istore 7
      // 04c: iload 7
      // 04e: bipush -1
      // 04f: iload 2
      // 050: ifeq 077
      // 053: if_icmpne 072
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: new com/finalshell/core/Hi2
      // 060: dup
      // 061: sipush 10510
      // 064: sipush -21017
      // 067: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 06a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 06d: athrow
      // 06e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/finalshell/core/U9.d I
      // 076: bipush 1
      // 077: iadd
      // 078: istore 8
      // 07a: aload 0
      // 07b: iload 8
      // 07d: iload 7
      // 07f: iload 8
      // 081: isub
      // 082: invokevirtual com/finalshell/core/U9.R (II)Ljava/lang/String;
      // 085: astore 9
      // 087: aload 9
      // 089: sipush 30531
      // 08c: ldc2_w 4175784576570993226
      // 08f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 092: invokevirtual java/lang/String.indexOf (I)I
      // 095: bipush -1
      // 096: iload 2
      // 097: ifeq 154
      // 09a: if_icmpeq 148
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: bipush 0
      // 0a5: istore 10
      // 0a7: iload 7
      // 0a9: bipush 1
      // 0aa: isub
      // 0ab: istore 11
      // 0ad: iload 11
      // 0af: iflt 0eb
      // 0b2: aload 0
      // 0b3: iload 11
      // 0b5: invokevirtual com/finalshell/core/U9.C (I)C
      // 0b8: sipush 30531
      // 0bb: ldc2_w 4175784576570993226
      // 0be: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c1: iload 2
      // 0c2: ifeq 0ee
      // 0c5: iload 2
      // 0c6: ifeq 0ee
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: if_icmpne 0eb
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: iinc 10 1
      // 0dd: iinc 11 -1
      // 0e0: iload 2
      // 0e1: ifne 0ad
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: iload 10
      // 0ed: bipush 2
      // 0ee: irem
      // 0ef: iload 2
      // 0f0: ifeq 120
      // 0f3: ifne 108
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 126
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: sipush 26107
      // 10c: ldc2_w 2081374444732725480
      // 10f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 112: iload 7
      // 114: bipush 1
      // 115: iadd
      // 116: invokevirtual com/finalshell/core/U9.d (CI)I
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: istore 7
      // 122: iload 2
      // 123: ifne 0a4
      // 126: iload 7
      // 128: aload 0
      // 129: getfield com/finalshell/core/U9.d I
      // 12c: bipush 1
      // 12d: iadd
      // 12e: isub
      // 12f: istore 10
      // 131: aload 0
      // 132: aload 0
      // 133: getfield com/finalshell/core/U9.d I
      // 136: bipush 1
      // 137: iadd
      // 138: iload 10
      // 13a: invokevirtual com/finalshell/core/U9.s (II)[C
      // 13d: astore 11
      // 13f: aload 11
      // 141: iload 10
      // 143: invokestatic com/finalshell/core/U9.M ([CI)Ljava/lang/String;
      // 146: astore 9
      // 148: iload 3
      // 149: iload 7
      // 14b: aload 0
      // 14c: getfield com/finalshell/core/U9.d I
      // 14f: bipush 1
      // 150: iadd
      // 151: isub
      // 152: bipush 1
      // 153: iadd
      // 154: iadd
      // 155: istore 3
      // 156: aload 0
      // 157: aload 0
      // 158: getfield com/finalshell/core/U9.d I
      // 15b: iload 3
      // 15c: iinc 3 1
      // 15f: iadd
      // 160: invokevirtual com/finalshell/core/U9.C (I)C
      // 163: istore 4
      // 165: new com/finalshell/core/Uy2_2
      // 168: dup
      // 169: aload 9
      // 16b: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 16e: astore 10
      // 170: aload 10
      // 172: bipush 0
      // 173: iload 2
      // 174: ifeq 19f
      // 177: invokevirtual com/finalshell/core/Uy2_2.Z (Z)Z
      // 17a: ifeq 196
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: aload 10
      // 186: invokevirtual com/finalshell/core/Uy2_2.c ()Ljava/util/Calendar;
      // 189: astore 11
      // 18b: aload 11
      // 18d: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 190: astore 5
      // 192: iload 2
      // 193: ifne 1ad
      // 196: aload 0
      // 197: bipush -1
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: putfield com/finalshell/core/U9.z I
      // 1a2: aconst_null
      // 1a3: astore 11
      // 1a5: aload 10
      // 1a7: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1aa: aload 11
      // 1ac: areturn
      // 1ad: aload 10
      // 1af: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1b2: goto 1bf
      // 1b5: astore 12
      // 1b7: aload 10
      // 1b9: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 1bc: aload 12
      // 1be: athrow
      // 1bf: iload 2
      // 1c0: ifne 403
      // 1c3: iload 4
      // 1c5: sipush 19418
      // 1c8: ldc2_w 715321441499911916
      // 1cb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: iload 2
      // 1d6: ifeq 1f5
      // 1d9: if_icmpeq 223
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: iload 4
      // 1e5: sipush 21259
      // 1e8: ldc2_w 1287927339301015045
      // 1eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: iload 2
      // 1f6: ifeq 345
      // 1f9: if_icmplt 333
      // 1fc: goto 203
      // 1ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: iload 4
      // 205: sipush 24153
      // 208: ldc2_w 3168790736949871469
      // 20b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20e: iload 2
      // 20f: ifeq 345
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: if_icmpgt 333
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: lconst_0
      // 224: lstore 6
      // 226: bipush 0
      // 227: istore 8
      // 229: iload 4
      // 22b: sipush 19418
      // 22e: ldc2_w 715321441499911916
      // 231: invokestatic com/finalshell/core/U9.a (IJ)I
      // 234: iload 2
      // 235: ifeq 26a
      // 238: if_icmpne 254
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 0
      // 243: aload 0
      // 244: getfield com/finalshell/core/U9.d I
      // 247: iload 3
      // 248: iinc 3 1
      // 24b: iadd
      // 24c: invokevirtual com/finalshell/core/U9.C (I)C
      // 24f: istore 4
      // 251: bipush 1
      // 252: istore 8
      // 254: iload 4
      // 256: iload 2
      // 257: ifeq 301
      // 25a: sipush 21259
      // 25d: ldc2_w 1287927339301015045
      // 260: invokestatic com/finalshell/core/U9.a (IJ)I
      // 263: goto 26a
      // 266: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: if_icmplt 2fd
      // 26d: iload 4
      // 26f: iload 2
      // 270: ifeq 301
      // 273: goto 27a
      // 276: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: sipush 24153
      // 27d: ldc2_w 3168790736949871469
      // 280: invokestatic com/finalshell/core/U9.a (IJ)I
      // 283: if_icmpgt 2fd
      // 286: goto 28d
      // 289: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: iload 4
      // 28f: sipush 21259
      // 292: ldc2_w 1287927339301015045
      // 295: invokestatic com/finalshell/core/U9.a (IJ)I
      // 298: isub
      // 299: i2l
      // 29a: lstore 6
      // 29c: aload 0
      // 29d: aload 0
      // 29e: getfield com/finalshell/core/U9.d I
      // 2a1: iload 3
      // 2a2: iinc 3 1
      // 2a5: iadd
      // 2a6: invokevirtual com/finalshell/core/U9.C (I)C
      // 2a9: istore 4
      // 2ab: iload 4
      // 2ad: sipush 21259
      // 2b0: ldc2_w 1287927339301015045
      // 2b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b6: if_icmplt 2fd
      // 2b9: iload 4
      // 2bb: iload 2
      // 2bc: ifeq 301
      // 2bf: iload 2
      // 2c0: ifeq 301
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: sipush 24153
      // 2cd: ldc2_w 3168790736949871469
      // 2d0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d3: if_icmpgt 2fd
      // 2d6: goto 2dd
      // 2d9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dc: athrow
      // 2dd: lload 6
      // 2df: sipush 3395
      // 2e2: ldc2_w 2174368042043745818
      // 2e5: invokestatic com/finalshell/core/U9.c (IJ)J
      // 2e8: lmul
      // 2e9: iload 4
      // 2eb: sipush 21259
      // 2ee: ldc2_w 1287927339301015045
      // 2f1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f4: isub
      // 2f5: i2l
      // 2f6: ladd
      // 2f7: lstore 6
      // 2f9: iload 2
      // 2fa: ifne 29c
      // 2fd: lload 6
      // 2ff: lconst_0
      // 300: lcmp
      // 301: iload 2
      // 302: ifeq 31c
      // 305: ifge 31a
      // 308: goto 30f
      // 30b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: aload 0
      // 310: bipush -1
      // 311: putfield com/finalshell/core/U9.z I
      // 314: aconst_null
      // 315: areturn
      // 316: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 319: athrow
      // 31a: iload 8
      // 31c: ifeq 324
      // 31f: lload 6
      // 321: lneg
      // 322: lstore 6
      // 324: new java/util/Date
      // 327: dup
      // 328: lload 6
      // 32a: invokespecial java/util/Date.<init> (J)V
      // 32d: astore 5
      // 32f: iload 2
      // 330: ifne 403
      // 333: iload 4
      // 335: sipush 7800
      // 338: ldc2_w 5201320676148134657
      // 33b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33e: goto 345
      // 341: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: iload 2
      // 346: ifeq 378
      // 349: if_icmpne 3f5
      // 34c: goto 353
      // 34f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 352: athrow
      // 353: aload 0
      // 354: aload 0
      // 355: getfield com/finalshell/core/U9.d I
      // 358: iload 3
      // 359: iadd
      // 35a: iload 2
      // 35b: ifeq 3fe
      // 35e: goto 365
      // 361: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: invokevirtual com/finalshell/core/U9.C (I)C
      // 368: sipush 25252
      // 36b: ldc2_w 2256381802227974060
      // 36e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 371: goto 378
      // 374: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 377: athrow
      // 378: if_icmpne 3f5
      // 37b: aload 0
      // 37c: aload 0
      // 37d: getfield com/finalshell/core/U9.d I
      // 380: iload 3
      // 381: iadd
      // 382: bipush 1
      // 383: iadd
      // 384: iload 2
      // 385: ifeq 3fe
      // 388: goto 38f
      // 38b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: invokevirtual com/finalshell/core/U9.C (I)C
      // 392: sipush 7325
      // 395: ldc2_w 7975301603790307833
      // 398: invokestatic com/finalshell/core/U9.a (IJ)I
      // 39b: if_icmpne 3f5
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: aload 0
      // 3a7: getfield com/finalshell/core/U9.d I
      // 3aa: iload 3
      // 3ab: iadd
      // 3ac: bipush 2
      // 3ad: iadd
      // 3ae: iload 2
      // 3af: ifeq 3fe
      // 3b2: goto 3b9
      // 3b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b8: athrow
      // 3b9: invokevirtual com/finalshell/core/U9.C (I)C
      // 3bc: sipush 7325
      // 3bf: ldc2_w 7975301603790307833
      // 3c2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c5: if_icmpne 3f5
      // 3c8: goto 3cf
      // 3cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ce: athrow
      // 3cf: aload 0
      // 3d0: sipush 19103
      // 3d3: ldc2_w 2592984034142099420
      // 3d6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3d9: putfield com/finalshell/core/U9.z I
      // 3dc: aconst_null
      // 3dd: astore 5
      // 3df: iinc 3 3
      // 3e2: aload 0
      // 3e3: aload 0
      // 3e4: getfield com/finalshell/core/U9.d I
      // 3e7: iload 3
      // 3e8: iinc 3 1
      // 3eb: iadd
      // 3ec: invokevirtual com/finalshell/core/U9.C (I)C
      // 3ef: istore 4
      // 3f1: iload 2
      // 3f2: ifne 403
      // 3f5: aload 0
      // 3f6: bipush -1
      // 3f7: goto 3fe
      // 3fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fd: athrow
      // 3fe: putfield com/finalshell/core/U9.z I
      // 401: aconst_null
      // 402: areturn
      // 403: iload 4
      // 405: sipush 26927
      // 408: ldc2_w 6101958691031889140
      // 40b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 40e: iload 2
      // 40f: ifeq 45e
      // 412: if_icmpne 453
      // 415: goto 41c
      // 418: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41b: athrow
      // 41c: aload 0
      // 41d: dup
      // 41e: getfield com/finalshell/core/U9.d I
      // 421: iload 3
      // 422: iadd
      // 423: putfield com/finalshell/core/U9.d I
      // 426: aload 0
      // 427: aload 0
      // 428: aload 0
      // 429: getfield com/finalshell/core/U9.d I
      // 42c: invokevirtual com/finalshell/core/U9.C (I)C
      // 42f: putfield com/finalshell/core/U9.l C
      // 432: aload 0
      // 433: sipush 5887
      // 436: ldc2_w 3467391210321595353
      // 439: invokestatic com/finalshell/core/U9.a (IJ)I
      // 43c: putfield com/finalshell/core/U9.z I
      // 43f: aload 0
      // 440: sipush 9361
      // 443: ldc2_w 2488456831667599749
      // 446: invokestatic com/finalshell/core/U9.a (IJ)I
      // 449: putfield com/finalshell/core/U9.Y I
      // 44c: aload 5
      // 44e: areturn
      // 44f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 452: athrow
      // 453: iload 4
      // 455: sipush 30337
      // 458: ldc2_w 2029800848590515112
      // 45b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 45e: iload 2
      // 45f: ifeq 486
      // 462: if_icmpne 5c0
      // 465: goto 46c
      // 468: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46b: athrow
      // 46c: aload 0
      // 46d: aload 0
      // 46e: getfield com/finalshell/core/U9.d I
      // 471: iload 3
      // 472: iinc 3 1
      // 475: iadd
      // 476: invokevirtual com/finalshell/core/U9.C (I)C
      // 479: istore 4
      // 47b: iload 4
      // 47d: sipush 26927
      // 480: ldc2_w 6101958691031889140
      // 483: invokestatic com/finalshell/core/U9.a (IJ)I
      // 486: iload 2
      // 487: ifeq 4d4
      // 48a: if_icmpne 4c2
      // 48d: goto 494
      // 490: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 493: athrow
      // 494: aload 0
      // 495: sipush 9361
      // 498: ldc2_w 2488456831667599749
      // 49b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 49e: putfield com/finalshell/core/U9.Y I
      // 4a1: aload 0
      // 4a2: dup
      // 4a3: getfield com/finalshell/core/U9.d I
      // 4a6: iload 3
      // 4a7: iadd
      // 4a8: putfield com/finalshell/core/U9.d I
      // 4ab: aload 0
      // 4ac: aload 0
      // 4ad: aload 0
      // 4ae: getfield com/finalshell/core/U9.d I
      // 4b1: invokevirtual com/finalshell/core/U9.C (I)C
      // 4b4: putfield com/finalshell/core/U9.l C
      // 4b7: iload 2
      // 4b8: ifne 5af
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c1: athrow
      // 4c2: iload 4
      // 4c4: sipush 30337
      // 4c7: ldc2_w 2029800848590515112
      // 4ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4cd: goto 4d4
      // 4d0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d3: athrow
      // 4d4: iload 2
      // 4d5: ifeq 522
      // 4d8: if_icmpne 510
      // 4db: goto 4e2
      // 4de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e1: athrow
      // 4e2: aload 0
      // 4e3: sipush 9145
      // 4e6: ldc2_w 6577731744871808687
      // 4e9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ec: putfield com/finalshell/core/U9.Y I
      // 4ef: aload 0
      // 4f0: dup
      // 4f1: getfield com/finalshell/core/U9.d I
      // 4f4: iload 3
      // 4f5: iadd
      // 4f6: putfield com/finalshell/core/U9.d I
      // 4f9: aload 0
      // 4fa: aload 0
      // 4fb: aload 0
      // 4fc: getfield com/finalshell/core/U9.d I
      // 4ff: invokevirtual com/finalshell/core/U9.C (I)C
      // 502: putfield com/finalshell/core/U9.l C
      // 505: iload 2
      // 506: ifne 5af
      // 509: goto 510
      // 50c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50f: athrow
      // 510: iload 4
      // 512: sipush 4784
      // 515: ldc2_w 3082167687830622095
      // 518: invokestatic com/finalshell/core/U9.a (IJ)I
      // 51b: goto 522
      // 51e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 521: athrow
      // 522: iload 2
      // 523: ifeq 570
      // 526: if_icmpne 55e
      // 529: goto 530
      // 52c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52f: athrow
      // 530: aload 0
      // 531: sipush 16923
      // 534: ldc2_w 1571494982232874791
      // 537: invokestatic com/finalshell/core/U9.a (IJ)I
      // 53a: putfield com/finalshell/core/U9.Y I
      // 53d: aload 0
      // 53e: dup
      // 53f: getfield com/finalshell/core/U9.d I
      // 542: iload 3
      // 543: iadd
      // 544: putfield com/finalshell/core/U9.d I
      // 547: aload 0
      // 548: aload 0
      // 549: aload 0
      // 54a: getfield com/finalshell/core/U9.d I
      // 54d: invokevirtual com/finalshell/core/U9.C (I)C
      // 550: putfield com/finalshell/core/U9.l C
      // 553: iload 2
      // 554: ifne 5af
      // 557: goto 55e
      // 55a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55d: athrow
      // 55e: iload 4
      // 560: sipush 2765
      // 563: ldc2_w 8216137057917720563
      // 566: invokestatic com/finalshell/core/U9.a (IJ)I
      // 569: goto 570
      // 56c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56f: athrow
      // 570: if_icmpne 5a4
      // 573: aload 0
      // 574: sipush 9907
      // 577: ldc2_w 514190805586246625
      // 57a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57d: putfield com/finalshell/core/U9.Y I
      // 580: aload 0
      // 581: dup
      // 582: getfield com/finalshell/core/U9.d I
      // 585: iload 3
      // 586: bipush 1
      // 587: isub
      // 588: iadd
      // 589: putfield com/finalshell/core/U9.d I
      // 58c: aload 0
      // 58d: sipush 2765
      // 590: ldc2_w 8216137057917720563
      // 593: invokestatic com/finalshell/core/U9.a (IJ)I
      // 596: putfield com/finalshell/core/U9.l C
      // 599: iload 2
      // 59a: ifne 5af
      // 59d: goto 5a4
      // 5a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a3: athrow
      // 5a4: aload 0
      // 5a5: bipush -1
      // 5a6: putfield com/finalshell/core/U9.z I
      // 5a9: aconst_null
      // 5aa: areturn
      // 5ab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ae: athrow
      // 5af: aload 0
      // 5b0: sipush 2897
      // 5b3: ldc2_w 695568451002816123
      // 5b6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5b9: putfield com/finalshell/core/U9.z I
      // 5bc: iload 2
      // 5bd: ifne 5cb
      // 5c0: aload 0
      // 5c1: bipush -1
      // 5c2: putfield com/finalshell/core/U9.z I
      // 5c5: aconst_null
      // 5c6: areturn
      // 5c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ca: athrow
      // 5cb: aload 5
      // 5cd: areturn
   }

   public UUID M(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/finalshell/core/U9.P$boolean ([C)Z
      // 00e: iload 2
      // 00f: ifne 031
      // 012: ifne 02f
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: sipush 4469
      // 020: ldc2_w 8451788941981764676
      // 023: invokestatic com/finalshell/core/U9.a (IJ)I
      // 026: putfield com/finalshell/core/U9.z I
      // 029: aconst_null
      // 02a: areturn
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: istore 3
      // 032: aload 0
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: iload 3
      // 038: iinc 3 1
      // 03b: iadd
      // 03c: invokevirtual com/finalshell/core/U9.C (I)C
      // 03f: istore 4
      // 041: iload 4
      // 043: sipush 26107
      // 046: ldc2_w 2081374444732725480
      // 049: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04c: iload 2
      // 04d: ifne aec
      // 050: if_icmpne ada
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/U9.d I
      // 05e: aload 1
      // 05f: arraylength
      // 060: iadd
      // 061: bipush 1
      // 062: iadd
      // 063: istore 6
      // 065: aload 0
      // 066: sipush 26107
      // 069: ldc2_w 2081374444732725480
      // 06c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 06f: iload 6
      // 071: invokevirtual com/finalshell/core/U9.d (CI)I
      // 074: istore 7
      // 076: iload 7
      // 078: bipush -1
      // 079: iload 2
      // 07a: ifne 0a4
      // 07d: if_icmpne 09c
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: new com/finalshell/core/Hi2
      // 08a: dup
      // 08b: sipush 10510
      // 08e: sipush -21017
      // 091: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 094: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 097: athrow
      // 098: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield com/finalshell/core/U9.d I
      // 0a0: aload 1
      // 0a1: arraylength
      // 0a2: iadd
      // 0a3: bipush 1
      // 0a4: iadd
      // 0a5: istore 8
      // 0a7: iload 7
      // 0a9: iload 8
      // 0ab: isub
      // 0ac: istore 9
      // 0ae: iload 9
      // 0b0: sipush 5030
      // 0b3: ldc2_w 5463149266322411209
      // 0b6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b9: iload 2
      // 0ba: ifne 7e2
      // 0bd: if_icmpne 7d0
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: lconst_0
      // 0c8: lstore 10
      // 0ca: lconst_0
      // 0cb: lstore 12
      // 0cd: bipush 0
      // 0ce: istore 14
      // 0d0: iload 14
      // 0d2: sipush 16265
      // 0d5: ldc2_w 35568148908106386
      // 0d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0db: if_icmpge 226
      // 0de: aload 0
      // 0df: iload 8
      // 0e1: iload 14
      // 0e3: iadd
      // 0e4: invokevirtual com/finalshell/core/U9.C (I)C
      // 0e7: istore 15
      // 0e9: iload 15
      // 0eb: sipush 21259
      // 0ee: ldc2_w 1287927339301015045
      // 0f1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0f4: iload 2
      // 0f5: ifne 23c
      // 0f8: iload 2
      // 0f9: ifne 151
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: if_icmplt 13f
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: iload 15
      // 10f: sipush 24153
      // 112: ldc2_w 3168790736949871469
      // 115: invokestatic com/finalshell/core/U9.a (IJ)I
      // 118: iload 2
      // 119: ifne 151
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: if_icmpgt 13f
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: iload 15
      // 12f: sipush 21259
      // 132: ldc2_w 1287927339301015045
      // 135: invokestatic com/finalshell/core/U9.a (IJ)I
      // 138: isub
      // 139: istore 16
      // 13b: iload 2
      // 13c: ifeq 211
      // 13f: iload 15
      // 141: sipush 31880
      // 144: ldc2_w 6345766455927677411
      // 147: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: iload 2
      // 152: ifne 1ad
      // 155: if_icmplt 19b
      // 158: goto 15f
      // 15b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: iload 15
      // 161: sipush 23709
      // 164: ldc2_w 6885726342037307881
      // 167: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16a: iload 2
      // 16b: ifne 1ad
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: if_icmpgt 19b
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: sipush 1861
      // 182: ldc2_w 5349631099953699429
      // 185: invokestatic com/finalshell/core/U9.a (IJ)I
      // 188: iload 15
      // 18a: sipush 31880
      // 18d: ldc2_w 6345766455927677411
      // 190: invokestatic com/finalshell/core/U9.a (IJ)I
      // 193: isub
      // 194: iadd
      // 195: istore 16
      // 197: iload 2
      // 198: ifeq 211
      // 19b: iload 15
      // 19d: sipush 31506
      // 1a0: ldc2_w 427738362136340011
      // 1a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: iload 2
      // 1ae: ifne 1cd
      // 1b1: if_icmplt 1fe
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: iload 15
      // 1bd: sipush 17399
      // 1c0: ldc2_w 8707971467972353759
      // 1c3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: iload 2
      // 1ce: ifne 1f7
      // 1d1: if_icmpgt 1fe
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: sipush 1861
      // 1de: ldc2_w 5349631099953699429
      // 1e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e4: iload 15
      // 1e6: sipush 31506
      // 1e9: ldc2_w 427738362136340011
      // 1ec: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ef: isub
      // 1f0: goto 1f7
      // 1f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f6: athrow
      // 1f7: iadd
      // 1f8: istore 16
      // 1fa: iload 2
      // 1fb: ifeq 211
      // 1fe: aload 0
      // 1ff: sipush 4469
      // 202: ldc2_w 8451788941981764676
      // 205: invokestatic com/finalshell/core/U9.a (IJ)I
      // 208: putfield com/finalshell/core/U9.z I
      // 20b: aconst_null
      // 20c: areturn
      // 20d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: lload 10
      // 213: bipush 4
      // 214: lshl
      // 215: lstore 10
      // 217: lload 10
      // 219: iload 16
      // 21b: i2l
      // 21c: lor
      // 21d: lstore 10
      // 21f: iinc 14 1
      // 222: iload 2
      // 223: ifeq 0d0
      // 226: sipush 28233
      // 229: ldc2_w 5739983667078181753
      // 22c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22f: istore 14
      // 231: iload 14
      // 233: sipush 16923
      // 236: ldc2_w 1571494982232874791
      // 239: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23c: if_icmpge 387
      // 23f: aload 0
      // 240: iload 8
      // 242: iload 14
      // 244: iadd
      // 245: invokevirtual com/finalshell/core/U9.C (I)C
      // 248: istore 15
      // 24a: iload 15
      // 24c: sipush 21259
      // 24f: ldc2_w 1287927339301015045
      // 252: invokestatic com/finalshell/core/U9.a (IJ)I
      // 255: iload 2
      // 256: ifne 39d
      // 259: iload 2
      // 25a: ifne 2b2
      // 25d: goto 264
      // 260: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 263: athrow
      // 264: if_icmplt 2a0
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: iload 15
      // 270: sipush 24153
      // 273: ldc2_w 3168790736949871469
      // 276: invokestatic com/finalshell/core/U9.a (IJ)I
      // 279: iload 2
      // 27a: ifne 2b2
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 283: athrow
      // 284: if_icmpgt 2a0
      // 287: goto 28e
      // 28a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: iload 15
      // 290: sipush 21259
      // 293: ldc2_w 1287927339301015045
      // 296: invokestatic com/finalshell/core/U9.a (IJ)I
      // 299: isub
      // 29a: istore 16
      // 29c: iload 2
      // 29d: ifeq 372
      // 2a0: iload 15
      // 2a2: sipush 31880
      // 2a5: ldc2_w 6345766455927677411
      // 2a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2ab: goto 2b2
      // 2ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b1: athrow
      // 2b2: iload 2
      // 2b3: ifne 30e
      // 2b6: if_icmplt 2fc
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bf: athrow
      // 2c0: iload 15
      // 2c2: sipush 23709
      // 2c5: ldc2_w 6885726342037307881
      // 2c8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2cb: iload 2
      // 2cc: ifne 30e
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: if_icmpgt 2fc
      // 2d9: goto 2e0
      // 2dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: sipush 1861
      // 2e3: ldc2_w 5349631099953699429
      // 2e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e9: iload 15
      // 2eb: sipush 31880
      // 2ee: ldc2_w 6345766455927677411
      // 2f1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f4: isub
      // 2f5: iadd
      // 2f6: istore 16
      // 2f8: iload 2
      // 2f9: ifeq 372
      // 2fc: iload 15
      // 2fe: sipush 31506
      // 301: ldc2_w 427738362136340011
      // 304: invokestatic com/finalshell/core/U9.a (IJ)I
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: iload 2
      // 30f: ifne 32e
      // 312: if_icmplt 35f
      // 315: goto 31c
      // 318: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31b: athrow
      // 31c: iload 15
      // 31e: sipush 17399
      // 321: ldc2_w 8707971467972353759
      // 324: invokestatic com/finalshell/core/U9.a (IJ)I
      // 327: goto 32e
      // 32a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32d: athrow
      // 32e: iload 2
      // 32f: ifne 358
      // 332: if_icmpgt 35f
      // 335: goto 33c
      // 338: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: sipush 1861
      // 33f: ldc2_w 5349631099953699429
      // 342: invokestatic com/finalshell/core/U9.a (IJ)I
      // 345: iload 15
      // 347: sipush 31506
      // 34a: ldc2_w 427738362136340011
      // 34d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 350: isub
      // 351: goto 358
      // 354: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 357: athrow
      // 358: iadd
      // 359: istore 16
      // 35b: iload 2
      // 35c: ifeq 372
      // 35f: aload 0
      // 360: sipush 4469
      // 363: ldc2_w 8451788941981764676
      // 366: invokestatic com/finalshell/core/U9.a (IJ)I
      // 369: putfield com/finalshell/core/U9.z I
      // 36c: aconst_null
      // 36d: areturn
      // 36e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: lload 10
      // 374: bipush 4
      // 375: lshl
      // 376: lstore 10
      // 378: lload 10
      // 37a: iload 16
      // 37c: i2l
      // 37d: lor
      // 37e: lstore 10
      // 380: iinc 14 1
      // 383: iload 2
      // 384: ifeq 231
      // 387: sipush 26467
      // 38a: ldc2_w 5688268127982992063
      // 38d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 390: istore 14
      // 392: iload 14
      // 394: sipush 3728
      // 397: ldc2_w 2887857698909475834
      // 39a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 39d: if_icmpge 4e8
      // 3a0: aload 0
      // 3a1: iload 8
      // 3a3: iload 14
      // 3a5: iadd
      // 3a6: invokevirtual com/finalshell/core/U9.C (I)C
      // 3a9: istore 15
      // 3ab: iload 15
      // 3ad: sipush 21259
      // 3b0: ldc2_w 1287927339301015045
      // 3b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3b6: iload 2
      // 3b7: ifne 4fe
      // 3ba: iload 2
      // 3bb: ifne 413
      // 3be: goto 3c5
      // 3c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c4: athrow
      // 3c5: if_icmplt 401
      // 3c8: goto 3cf
      // 3cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ce: athrow
      // 3cf: iload 15
      // 3d1: sipush 24153
      // 3d4: ldc2_w 3168790736949871469
      // 3d7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3da: iload 2
      // 3db: ifne 413
      // 3de: goto 3e5
      // 3e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: if_icmpgt 401
      // 3e8: goto 3ef
      // 3eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ee: athrow
      // 3ef: iload 15
      // 3f1: sipush 21259
      // 3f4: ldc2_w 1287927339301015045
      // 3f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3fa: isub
      // 3fb: istore 16
      // 3fd: iload 2
      // 3fe: ifeq 4d3
      // 401: iload 15
      // 403: sipush 31880
      // 406: ldc2_w 6345766455927677411
      // 409: invokestatic com/finalshell/core/U9.a (IJ)I
      // 40c: goto 413
      // 40f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 412: athrow
      // 413: iload 2
      // 414: ifne 46f
      // 417: if_icmplt 45d
      // 41a: goto 421
      // 41d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: iload 15
      // 423: sipush 23709
      // 426: ldc2_w 6885726342037307881
      // 429: invokestatic com/finalshell/core/U9.a (IJ)I
      // 42c: iload 2
      // 42d: ifne 46f
      // 430: goto 437
      // 433: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 436: athrow
      // 437: if_icmpgt 45d
      // 43a: goto 441
      // 43d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 440: athrow
      // 441: sipush 1861
      // 444: ldc2_w 5349631099953699429
      // 447: invokestatic com/finalshell/core/U9.a (IJ)I
      // 44a: iload 15
      // 44c: sipush 31880
      // 44f: ldc2_w 6345766455927677411
      // 452: invokestatic com/finalshell/core/U9.a (IJ)I
      // 455: isub
      // 456: iadd
      // 457: istore 16
      // 459: iload 2
      // 45a: ifeq 4d3
      // 45d: iload 15
      // 45f: sipush 31506
      // 462: ldc2_w 427738362136340011
      // 465: invokestatic com/finalshell/core/U9.a (IJ)I
      // 468: goto 46f
      // 46b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46e: athrow
      // 46f: iload 2
      // 470: ifne 48f
      // 473: if_icmplt 4c0
      // 476: goto 47d
      // 479: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47c: athrow
      // 47d: iload 15
      // 47f: sipush 17399
      // 482: ldc2_w 8707971467972353759
      // 485: invokestatic com/finalshell/core/U9.a (IJ)I
      // 488: goto 48f
      // 48b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48e: athrow
      // 48f: iload 2
      // 490: ifne 4b9
      // 493: if_icmpgt 4c0
      // 496: goto 49d
      // 499: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49c: athrow
      // 49d: sipush 1861
      // 4a0: ldc2_w 5349631099953699429
      // 4a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4a6: iload 15
      // 4a8: sipush 31506
      // 4ab: ldc2_w 427738362136340011
      // 4ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4b1: isub
      // 4b2: goto 4b9
      // 4b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: iadd
      // 4ba: istore 16
      // 4bc: iload 2
      // 4bd: ifeq 4d3
      // 4c0: aload 0
      // 4c1: sipush 4469
      // 4c4: ldc2_w 8451788941981764676
      // 4c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ca: putfield com/finalshell/core/U9.z I
      // 4cd: aconst_null
      // 4ce: areturn
      // 4cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d2: athrow
      // 4d3: lload 10
      // 4d5: bipush 4
      // 4d6: lshl
      // 4d7: lstore 10
      // 4d9: lload 10
      // 4db: iload 16
      // 4dd: i2l
      // 4de: lor
      // 4df: lstore 10
      // 4e1: iinc 14 1
      // 4e4: iload 2
      // 4e5: ifeq 392
      // 4e8: sipush 21353
      // 4eb: ldc2_w 8730446353700589107
      // 4ee: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4f1: istore 14
      // 4f3: iload 14
      // 4f5: sipush 11303
      // 4f8: ldc2_w 8570254624104968456
      // 4fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4fe: if_icmpge 649
      // 501: aload 0
      // 502: iload 8
      // 504: iload 14
      // 506: iadd
      // 507: invokevirtual com/finalshell/core/U9.C (I)C
      // 50a: istore 15
      // 50c: iload 15
      // 50e: sipush 21259
      // 511: ldc2_w 1287927339301015045
      // 514: invokestatic com/finalshell/core/U9.a (IJ)I
      // 517: iload 2
      // 518: ifne 65f
      // 51b: iload 2
      // 51c: ifne 574
      // 51f: goto 526
      // 522: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 525: athrow
      // 526: if_icmplt 562
      // 529: goto 530
      // 52c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52f: athrow
      // 530: iload 15
      // 532: sipush 24153
      // 535: ldc2_w 3168790736949871469
      // 538: invokestatic com/finalshell/core/U9.a (IJ)I
      // 53b: iload 2
      // 53c: ifne 574
      // 53f: goto 546
      // 542: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 545: athrow
      // 546: if_icmpgt 562
      // 549: goto 550
      // 54c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54f: athrow
      // 550: iload 15
      // 552: sipush 21259
      // 555: ldc2_w 1287927339301015045
      // 558: invokestatic com/finalshell/core/U9.a (IJ)I
      // 55b: isub
      // 55c: istore 16
      // 55e: iload 2
      // 55f: ifeq 634
      // 562: iload 15
      // 564: sipush 31880
      // 567: ldc2_w 6345766455927677411
      // 56a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 56d: goto 574
      // 570: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 573: athrow
      // 574: iload 2
      // 575: ifne 5d0
      // 578: if_icmplt 5be
      // 57b: goto 582
      // 57e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 581: athrow
      // 582: iload 15
      // 584: sipush 23709
      // 587: ldc2_w 6885726342037307881
      // 58a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 58d: iload 2
      // 58e: ifne 5d0
      // 591: goto 598
      // 594: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 597: athrow
      // 598: if_icmpgt 5be
      // 59b: goto 5a2
      // 59e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a1: athrow
      // 5a2: sipush 1861
      // 5a5: ldc2_w 5349631099953699429
      // 5a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5ab: iload 15
      // 5ad: sipush 31880
      // 5b0: ldc2_w 6345766455927677411
      // 5b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5b6: isub
      // 5b7: iadd
      // 5b8: istore 16
      // 5ba: iload 2
      // 5bb: ifeq 634
      // 5be: iload 15
      // 5c0: sipush 31506
      // 5c3: ldc2_w 427738362136340011
      // 5c6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5c9: goto 5d0
      // 5cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cf: athrow
      // 5d0: iload 2
      // 5d1: ifne 5f0
      // 5d4: if_icmplt 621
      // 5d7: goto 5de
      // 5da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dd: athrow
      // 5de: iload 15
      // 5e0: sipush 17399
      // 5e3: ldc2_w 8707971467972353759
      // 5e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5e9: goto 5f0
      // 5ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ef: athrow
      // 5f0: iload 2
      // 5f1: ifne 61a
      // 5f4: if_icmpgt 621
      // 5f7: goto 5fe
      // 5fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fd: athrow
      // 5fe: sipush 1861
      // 601: ldc2_w 5349631099953699429
      // 604: invokestatic com/finalshell/core/U9.a (IJ)I
      // 607: iload 15
      // 609: sipush 31506
      // 60c: ldc2_w 427738362136340011
      // 60f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 612: isub
      // 613: goto 61a
      // 616: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 619: athrow
      // 61a: iadd
      // 61b: istore 16
      // 61d: iload 2
      // 61e: ifeq 634
      // 621: aload 0
      // 622: sipush 4469
      // 625: ldc2_w 8451788941981764676
      // 628: invokestatic com/finalshell/core/U9.a (IJ)I
      // 62b: putfield com/finalshell/core/U9.z I
      // 62e: aconst_null
      // 62f: areturn
      // 630: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 633: athrow
      // 634: lload 12
      // 636: bipush 4
      // 637: lshl
      // 638: lstore 12
      // 63a: lload 12
      // 63c: iload 16
      // 63e: i2l
      // 63f: lor
      // 640: lstore 12
      // 642: iinc 14 1
      // 645: iload 2
      // 646: ifeq 4f3
      // 649: sipush 5895
      // 64c: ldc2_w 3376681134362184415
      // 64f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 652: istore 14
      // 654: iload 14
      // 656: sipush 5030
      // 659: ldc2_w 5463149266322411209
      // 65c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 65f: if_icmpge 79f
      // 662: aload 0
      // 663: iload 8
      // 665: iload 14
      // 667: iadd
      // 668: invokevirtual com/finalshell/core/U9.C (I)C
      // 66b: istore 15
      // 66d: iload 15
      // 66f: sipush 21259
      // 672: ldc2_w 1287927339301015045
      // 675: invokestatic com/finalshell/core/U9.a (IJ)I
      // 678: iload 2
      // 679: ifne 6ca
      // 67c: if_icmplt 6b8
      // 67f: goto 686
      // 682: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 685: athrow
      // 686: iload 15
      // 688: sipush 24153
      // 68b: ldc2_w 3168790736949871469
      // 68e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 691: iload 2
      // 692: ifne 6ca
      // 695: goto 69c
      // 698: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69b: athrow
      // 69c: if_icmpgt 6b8
      // 69f: goto 6a6
      // 6a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a5: athrow
      // 6a6: iload 15
      // 6a8: sipush 21259
      // 6ab: ldc2_w 1287927339301015045
      // 6ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6b1: isub
      // 6b2: istore 16
      // 6b4: iload 2
      // 6b5: ifeq 78a
      // 6b8: iload 15
      // 6ba: sipush 31880
      // 6bd: ldc2_w 6345766455927677411
      // 6c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6c3: goto 6ca
      // 6c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c9: athrow
      // 6ca: iload 2
      // 6cb: ifne 726
      // 6ce: if_icmplt 714
      // 6d1: goto 6d8
      // 6d4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d7: athrow
      // 6d8: iload 15
      // 6da: sipush 23709
      // 6dd: ldc2_w 6885726342037307881
      // 6e0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6e3: iload 2
      // 6e4: ifne 726
      // 6e7: goto 6ee
      // 6ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ed: athrow
      // 6ee: if_icmpgt 714
      // 6f1: goto 6f8
      // 6f4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f7: athrow
      // 6f8: sipush 1861
      // 6fb: ldc2_w 5349631099953699429
      // 6fe: invokestatic com/finalshell/core/U9.a (IJ)I
      // 701: iload 15
      // 703: sipush 31880
      // 706: ldc2_w 6345766455927677411
      // 709: invokestatic com/finalshell/core/U9.a (IJ)I
      // 70c: isub
      // 70d: iadd
      // 70e: istore 16
      // 710: iload 2
      // 711: ifeq 78a
      // 714: iload 15
      // 716: sipush 31506
      // 719: ldc2_w 427738362136340011
      // 71c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 71f: goto 726
      // 722: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 725: athrow
      // 726: iload 2
      // 727: ifne 746
      // 72a: if_icmplt 777
      // 72d: goto 734
      // 730: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 733: athrow
      // 734: iload 15
      // 736: sipush 17399
      // 739: ldc2_w 8707971467972353759
      // 73c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 73f: goto 746
      // 742: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 745: athrow
      // 746: iload 2
      // 747: ifne 770
      // 74a: if_icmpgt 777
      // 74d: goto 754
      // 750: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 753: athrow
      // 754: sipush 1861
      // 757: ldc2_w 5349631099953699429
      // 75a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 75d: iload 15
      // 75f: sipush 31506
      // 762: ldc2_w 427738362136340011
      // 765: invokestatic com/finalshell/core/U9.a (IJ)I
      // 768: isub
      // 769: goto 770
      // 76c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76f: athrow
      // 770: iadd
      // 771: istore 16
      // 773: iload 2
      // 774: ifeq 78a
      // 777: aload 0
      // 778: sipush 4469
      // 77b: ldc2_w 8451788941981764676
      // 77e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 781: putfield com/finalshell/core/U9.z I
      // 784: aconst_null
      // 785: areturn
      // 786: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 789: athrow
      // 78a: lload 12
      // 78c: bipush 4
      // 78d: lshl
      // 78e: lstore 12
      // 790: lload 12
      // 792: iload 16
      // 794: i2l
      // 795: lor
      // 796: lstore 12
      // 798: iinc 14 1
      // 79b: iload 2
      // 79c: ifeq 654
      // 79f: new java/util/UUID
      // 7a2: dup
      // 7a3: lload 10
      // 7a5: lload 12
      // 7a7: invokespecial java/util/UUID.<init> (JJ)V
      // 7aa: astore 5
      // 7ac: iload 3
      // 7ad: iload 7
      // 7af: aload 0
      // 7b0: getfield com/finalshell/core/U9.d I
      // 7b3: aload 1
      // 7b4: arraylength
      // 7b5: iadd
      // 7b6: bipush 1
      // 7b7: iadd
      // 7b8: isub
      // 7b9: bipush 1
      // 7ba: iadd
      // 7bb: iadd
      // 7bc: istore 3
      // 7bd: aload 0
      // 7be: aload 0
      // 7bf: getfield com/finalshell/core/U9.d I
      // 7c2: iload 3
      // 7c3: iinc 3 1
      // 7c6: iadd
      // 7c7: invokevirtual com/finalshell/core/U9.C (I)C
      // 7ca: istore 4
      // 7cc: iload 2
      // 7cd: ifeq ad6
      // 7d0: iload 9
      // 7d2: sipush 18572
      // 7d5: ldc2_w 5664846119839831378
      // 7d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7db: goto 7e2
      // 7de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e1: athrow
      // 7e2: if_icmpne acb
      // 7e5: lconst_0
      // 7e6: lstore 10
      // 7e8: lconst_0
      // 7e9: lstore 12
      // 7eb: bipush 0
      // 7ec: istore 14
      // 7ee: iload 14
      // 7f0: sipush 9361
      // 7f3: ldc2_w 2488456831667599749
      // 7f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7f9: if_icmpge 944
      // 7fc: aload 0
      // 7fd: iload 8
      // 7ff: iload 14
      // 801: iadd
      // 802: invokevirtual com/finalshell/core/U9.C (I)C
      // 805: istore 15
      // 807: iload 15
      // 809: sipush 21259
      // 80c: ldc2_w 1287927339301015045
      // 80f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 812: iload 2
      // 813: ifne 95a
      // 816: iload 2
      // 817: ifne 86f
      // 81a: goto 821
      // 81d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 820: athrow
      // 821: if_icmplt 85d
      // 824: goto 82b
      // 827: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82a: athrow
      // 82b: iload 15
      // 82d: sipush 24153
      // 830: ldc2_w 3168790736949871469
      // 833: invokestatic com/finalshell/core/U9.a (IJ)I
      // 836: iload 2
      // 837: ifne 86f
      // 83a: goto 841
      // 83d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 840: athrow
      // 841: if_icmpgt 85d
      // 844: goto 84b
      // 847: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84a: athrow
      // 84b: iload 15
      // 84d: sipush 21259
      // 850: ldc2_w 1287927339301015045
      // 853: invokestatic com/finalshell/core/U9.a (IJ)I
      // 856: isub
      // 857: istore 16
      // 859: iload 2
      // 85a: ifeq 92f
      // 85d: iload 15
      // 85f: sipush 31880
      // 862: ldc2_w 6345766455927677411
      // 865: invokestatic com/finalshell/core/U9.a (IJ)I
      // 868: goto 86f
      // 86b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86e: athrow
      // 86f: iload 2
      // 870: ifne 8cb
      // 873: if_icmplt 8b9
      // 876: goto 87d
      // 879: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87c: athrow
      // 87d: iload 15
      // 87f: sipush 23709
      // 882: ldc2_w 6885726342037307881
      // 885: invokestatic com/finalshell/core/U9.a (IJ)I
      // 888: iload 2
      // 889: ifne 8cb
      // 88c: goto 893
      // 88f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 892: athrow
      // 893: if_icmpgt 8b9
      // 896: goto 89d
      // 899: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89c: athrow
      // 89d: sipush 1861
      // 8a0: ldc2_w 5349631099953699429
      // 8a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8a6: iload 15
      // 8a8: sipush 31880
      // 8ab: ldc2_w 6345766455927677411
      // 8ae: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8b1: isub
      // 8b2: iadd
      // 8b3: istore 16
      // 8b5: iload 2
      // 8b6: ifeq 92f
      // 8b9: iload 15
      // 8bb: sipush 31506
      // 8be: ldc2_w 427738362136340011
      // 8c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8c4: goto 8cb
      // 8c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ca: athrow
      // 8cb: iload 2
      // 8cc: ifne 8eb
      // 8cf: if_icmplt 91c
      // 8d2: goto 8d9
      // 8d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d8: athrow
      // 8d9: iload 15
      // 8db: sipush 17399
      // 8de: ldc2_w 8707971467972353759
      // 8e1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8e4: goto 8eb
      // 8e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ea: athrow
      // 8eb: iload 2
      // 8ec: ifne 915
      // 8ef: if_icmpgt 91c
      // 8f2: goto 8f9
      // 8f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f8: athrow
      // 8f9: sipush 1861
      // 8fc: ldc2_w 5349631099953699429
      // 8ff: invokestatic com/finalshell/core/U9.a (IJ)I
      // 902: iload 15
      // 904: sipush 31506
      // 907: ldc2_w 427738362136340011
      // 90a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 90d: isub
      // 90e: goto 915
      // 911: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 914: athrow
      // 915: iadd
      // 916: istore 16
      // 918: iload 2
      // 919: ifeq 92f
      // 91c: aload 0
      // 91d: sipush 4469
      // 920: ldc2_w 8451788941981764676
      // 923: invokestatic com/finalshell/core/U9.a (IJ)I
      // 926: putfield com/finalshell/core/U9.z I
      // 929: aconst_null
      // 92a: areturn
      // 92b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92e: athrow
      // 92f: lload 10
      // 931: bipush 4
      // 932: lshl
      // 933: lstore 10
      // 935: lload 10
      // 937: iload 16
      // 939: i2l
      // 93a: lor
      // 93b: lstore 10
      // 93d: iinc 14 1
      // 940: iload 2
      // 941: ifeq 7ee
      // 944: sipush 9361
      // 947: ldc2_w 2488456831667599749
      // 94a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 94d: istore 14
      // 94f: iload 14
      // 951: sipush 18572
      // 954: ldc2_w 5664846119839831378
      // 957: invokestatic com/finalshell/core/U9.a (IJ)I
      // 95a: if_icmpge a9a
      // 95d: aload 0
      // 95e: iload 8
      // 960: iload 14
      // 962: iadd
      // 963: invokevirtual com/finalshell/core/U9.C (I)C
      // 966: istore 15
      // 968: iload 15
      // 96a: sipush 21259
      // 96d: ldc2_w 1287927339301015045
      // 970: invokestatic com/finalshell/core/U9.a (IJ)I
      // 973: iload 2
      // 974: ifne 9c5
      // 977: if_icmplt 9b3
      // 97a: goto 981
      // 97d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 980: athrow
      // 981: iload 15
      // 983: sipush 24153
      // 986: ldc2_w 3168790736949871469
      // 989: invokestatic com/finalshell/core/U9.a (IJ)I
      // 98c: iload 2
      // 98d: ifne 9c5
      // 990: goto 997
      // 993: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 996: athrow
      // 997: if_icmpgt 9b3
      // 99a: goto 9a1
      // 99d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a0: athrow
      // 9a1: iload 15
      // 9a3: sipush 21259
      // 9a6: ldc2_w 1287927339301015045
      // 9a9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9ac: isub
      // 9ad: istore 16
      // 9af: iload 2
      // 9b0: ifeq a85
      // 9b3: iload 15
      // 9b5: sipush 31880
      // 9b8: ldc2_w 6345766455927677411
      // 9bb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9be: goto 9c5
      // 9c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c4: athrow
      // 9c5: iload 2
      // 9c6: ifne a21
      // 9c9: if_icmplt a0f
      // 9cc: goto 9d3
      // 9cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d2: athrow
      // 9d3: iload 15
      // 9d5: sipush 23709
      // 9d8: ldc2_w 6885726342037307881
      // 9db: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9de: iload 2
      // 9df: ifne a21
      // 9e2: goto 9e9
      // 9e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e8: athrow
      // 9e9: if_icmpgt a0f
      // 9ec: goto 9f3
      // 9ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f2: athrow
      // 9f3: sipush 1861
      // 9f6: ldc2_w 5349631099953699429
      // 9f9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9fc: iload 15
      // 9fe: sipush 31880
      // a01: ldc2_w 6345766455927677411
      // a04: invokestatic com/finalshell/core/U9.a (IJ)I
      // a07: isub
      // a08: iadd
      // a09: istore 16
      // a0b: iload 2
      // a0c: ifeq a85
      // a0f: iload 15
      // a11: sipush 31506
      // a14: ldc2_w 427738362136340011
      // a17: invokestatic com/finalshell/core/U9.a (IJ)I
      // a1a: goto a21
      // a1d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a20: athrow
      // a21: iload 2
      // a22: ifne a41
      // a25: if_icmplt a72
      // a28: goto a2f
      // a2b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2e: athrow
      // a2f: iload 15
      // a31: sipush 17399
      // a34: ldc2_w 8707971467972353759
      // a37: invokestatic com/finalshell/core/U9.a (IJ)I
      // a3a: goto a41
      // a3d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a40: athrow
      // a41: iload 2
      // a42: ifne a6b
      // a45: if_icmpgt a72
      // a48: goto a4f
      // a4b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4e: athrow
      // a4f: sipush 1861
      // a52: ldc2_w 5349631099953699429
      // a55: invokestatic com/finalshell/core/U9.a (IJ)I
      // a58: iload 15
      // a5a: sipush 31506
      // a5d: ldc2_w 427738362136340011
      // a60: invokestatic com/finalshell/core/U9.a (IJ)I
      // a63: isub
      // a64: goto a6b
      // a67: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6a: athrow
      // a6b: iadd
      // a6c: istore 16
      // a6e: iload 2
      // a6f: ifeq a85
      // a72: aload 0
      // a73: sipush 4469
      // a76: ldc2_w 8451788941981764676
      // a79: invokestatic com/finalshell/core/U9.a (IJ)I
      // a7c: putfield com/finalshell/core/U9.z I
      // a7f: aconst_null
      // a80: areturn
      // a81: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a84: athrow
      // a85: lload 12
      // a87: bipush 4
      // a88: lshl
      // a89: lstore 12
      // a8b: lload 12
      // a8d: iload 16
      // a8f: i2l
      // a90: lor
      // a91: lstore 12
      // a93: iinc 14 1
      // a96: iload 2
      // a97: ifeq 94f
      // a9a: new java/util/UUID
      // a9d: dup
      // a9e: lload 10
      // aa0: lload 12
      // aa2: invokespecial java/util/UUID.<init> (JJ)V
      // aa5: astore 5
      // aa7: iload 3
      // aa8: iload 7
      // aaa: aload 0
      // aab: getfield com/finalshell/core/U9.d I
      // aae: aload 1
      // aaf: arraylength
      // ab0: iadd
      // ab1: bipush 1
      // ab2: iadd
      // ab3: isub
      // ab4: bipush 1
      // ab5: iadd
      // ab6: iadd
      // ab7: istore 3
      // ab8: aload 0
      // ab9: aload 0
      // aba: getfield com/finalshell/core/U9.d I
      // abd: iload 3
      // abe: iinc 3 1
      // ac1: iadd
      // ac2: invokevirtual com/finalshell/core/U9.C (I)C
      // ac5: istore 4
      // ac7: iload 2
      // ac8: ifeq ad6
      // acb: aload 0
      // acc: bipush -1
      // acd: putfield com/finalshell/core/U9.z I
      // ad0: aconst_null
      // ad1: areturn
      // ad2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ad5: athrow
      // ad6: iload 2
      // ad7: ifeq b9f
      // ada: iload 4
      // adc: sipush 7800
      // adf: ldc2_w 5201320676148134657
      // ae2: invokestatic com/finalshell/core/U9.a (IJ)I
      // ae5: goto aec
      // ae8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aeb: athrow
      // aec: iload 2
      // aed: ifne b22
      // af0: if_icmpne b91
      // af3: goto afa
      // af6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af9: athrow
      // afa: aload 0
      // afb: aload 0
      // afc: getfield com/finalshell/core/U9.d I
      // aff: iload 3
      // b00: iinc 3 1
      // b03: iadd
      // b04: iload 2
      // b05: ifne b9a
      // b08: goto b0f
      // b0b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0e: athrow
      // b0f: invokevirtual com/finalshell/core/U9.C (I)C
      // b12: sipush 25252
      // b15: ldc2_w 2256381802227974060
      // b18: invokestatic com/finalshell/core/U9.a (IJ)I
      // b1b: goto b22
      // b1e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b21: athrow
      // b22: if_icmpne b91
      // b25: aload 0
      // b26: aload 0
      // b27: getfield com/finalshell/core/U9.d I
      // b2a: iload 3
      // b2b: iinc 3 1
      // b2e: iadd
      // b2f: iload 2
      // b30: ifne b9a
      // b33: goto b3a
      // b36: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b39: athrow
      // b3a: invokevirtual com/finalshell/core/U9.C (I)C
      // b3d: sipush 7325
      // b40: ldc2_w 7975301603790307833
      // b43: invokestatic com/finalshell/core/U9.a (IJ)I
      // b46: if_icmpne b91
      // b49: goto b50
      // b4c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4f: athrow
      // b50: aload 0
      // b51: aload 0
      // b52: getfield com/finalshell/core/U9.d I
      // b55: iload 3
      // b56: iinc 3 1
      // b59: iadd
      // b5a: iload 2
      // b5b: ifne b9a
      // b5e: goto b65
      // b61: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b64: athrow
      // b65: invokevirtual com/finalshell/core/U9.C (I)C
      // b68: sipush 7325
      // b6b: ldc2_w 7975301603790307833
      // b6e: invokestatic com/finalshell/core/U9.a (IJ)I
      // b71: if_icmpne b91
      // b74: goto b7b
      // b77: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7a: athrow
      // b7b: aconst_null
      // b7c: astore 5
      // b7e: aload 0
      // b7f: aload 0
      // b80: getfield com/finalshell/core/U9.d I
      // b83: iload 3
      // b84: iinc 3 1
      // b87: iadd
      // b88: invokevirtual com/finalshell/core/U9.C (I)C
      // b8b: istore 4
      // b8d: iload 2
      // b8e: ifeq b9f
      // b91: aload 0
      // b92: bipush -1
      // b93: goto b9a
      // b96: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b99: athrow
      // b9a: putfield com/finalshell/core/U9.z I
      // b9d: aconst_null
      // b9e: areturn
      // b9f: iload 4
      // ba1: sipush 26927
      // ba4: ldc2_w 6101958691031889140
      // ba7: invokestatic com/finalshell/core/U9.a (IJ)I
      // baa: iload 2
      // bab: ifne bed
      // bae: if_icmpne be2
      // bb1: goto bb8
      // bb4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb7: athrow
      // bb8: aload 0
      // bb9: dup
      // bba: getfield com/finalshell/core/U9.d I
      // bbd: iload 3
      // bbe: iadd
      // bbf: putfield com/finalshell/core/U9.d I
      // bc2: aload 0
      // bc3: aload 0
      // bc4: aload 0
      // bc5: getfield com/finalshell/core/U9.d I
      // bc8: invokevirtual com/finalshell/core/U9.C (I)C
      // bcb: putfield com/finalshell/core/U9.l C
      // bce: aload 0
      // bcf: sipush 5887
      // bd2: ldc2_w 3467391210321595353
      // bd5: invokestatic com/finalshell/core/U9.a (IJ)I
      // bd8: putfield com/finalshell/core/U9.z I
      // bdb: aload 5
      // bdd: areturn
      // bde: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be1: athrow
      // be2: iload 4
      // be4: sipush 4784
      // be7: ldc2_w 3082167687830622095
      // bea: invokestatic com/finalshell/core/U9.a (IJ)I
      // bed: iload 2
      // bee: ifne c15
      // bf1: if_icmpne d4f
      // bf4: goto bfb
      // bf7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bfa: athrow
      // bfb: aload 0
      // bfc: aload 0
      // bfd: getfield com/finalshell/core/U9.d I
      // c00: iload 3
      // c01: iinc 3 1
      // c04: iadd
      // c05: invokevirtual com/finalshell/core/U9.C (I)C
      // c08: istore 4
      // c0a: iload 4
      // c0c: sipush 26927
      // c0f: ldc2_w 6101958691031889140
      // c12: invokestatic com/finalshell/core/U9.a (IJ)I
      // c15: iload 2
      // c16: ifne c63
      // c19: if_icmpne c51
      // c1c: goto c23
      // c1f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c22: athrow
      // c23: aload 0
      // c24: sipush 9361
      // c27: ldc2_w 2488456831667599749
      // c2a: invokestatic com/finalshell/core/U9.a (IJ)I
      // c2d: putfield com/finalshell/core/U9.Y I
      // c30: aload 0
      // c31: dup
      // c32: getfield com/finalshell/core/U9.d I
      // c35: iload 3
      // c36: iadd
      // c37: putfield com/finalshell/core/U9.d I
      // c3a: aload 0
      // c3b: aload 0
      // c3c: aload 0
      // c3d: getfield com/finalshell/core/U9.d I
      // c40: invokevirtual com/finalshell/core/U9.C (I)C
      // c43: putfield com/finalshell/core/U9.l C
      // c46: iload 2
      // c47: ifeq d3e
      // c4a: goto c51
      // c4d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c50: athrow
      // c51: iload 4
      // c53: sipush 30337
      // c56: ldc2_w 2029800848590515112
      // c59: invokestatic com/finalshell/core/U9.a (IJ)I
      // c5c: goto c63
      // c5f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c62: athrow
      // c63: iload 2
      // c64: ifne cb1
      // c67: if_icmpne c9f
      // c6a: goto c71
      // c6d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c70: athrow
      // c71: aload 0
      // c72: sipush 9145
      // c75: ldc2_w 6577731744871808687
      // c78: invokestatic com/finalshell/core/U9.a (IJ)I
      // c7b: putfield com/finalshell/core/U9.Y I
      // c7e: aload 0
      // c7f: dup
      // c80: getfield com/finalshell/core/U9.d I
      // c83: iload 3
      // c84: iadd
      // c85: putfield com/finalshell/core/U9.d I
      // c88: aload 0
      // c89: aload 0
      // c8a: aload 0
      // c8b: getfield com/finalshell/core/U9.d I
      // c8e: invokevirtual com/finalshell/core/U9.C (I)C
      // c91: putfield com/finalshell/core/U9.l C
      // c94: iload 2
      // c95: ifeq d3e
      // c98: goto c9f
      // c9b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9e: athrow
      // c9f: iload 4
      // ca1: sipush 4784
      // ca4: ldc2_w 3082167687830622095
      // ca7: invokestatic com/finalshell/core/U9.a (IJ)I
      // caa: goto cb1
      // cad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb0: athrow
      // cb1: iload 2
      // cb2: ifne cff
      // cb5: if_icmpne ced
      // cb8: goto cbf
      // cbb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cbe: athrow
      // cbf: aload 0
      // cc0: sipush 16923
      // cc3: ldc2_w 1571494982232874791
      // cc6: invokestatic com/finalshell/core/U9.a (IJ)I
      // cc9: putfield com/finalshell/core/U9.Y I
      // ccc: aload 0
      // ccd: dup
      // cce: getfield com/finalshell/core/U9.d I
      // cd1: iload 3
      // cd2: iadd
      // cd3: putfield com/finalshell/core/U9.d I
      // cd6: aload 0
      // cd7: aload 0
      // cd8: aload 0
      // cd9: getfield com/finalshell/core/U9.d I
      // cdc: invokevirtual com/finalshell/core/U9.C (I)C
      // cdf: putfield com/finalshell/core/U9.l C
      // ce2: iload 2
      // ce3: ifeq d3e
      // ce6: goto ced
      // ce9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cec: athrow
      // ced: iload 4
      // cef: sipush 2765
      // cf2: ldc2_w 8216137057917720563
      // cf5: invokestatic com/finalshell/core/U9.a (IJ)I
      // cf8: goto cff
      // cfb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cfe: athrow
      // cff: if_icmpne d33
      // d02: aload 0
      // d03: sipush 9907
      // d06: ldc2_w 514190805586246625
      // d09: invokestatic com/finalshell/core/U9.a (IJ)I
      // d0c: putfield com/finalshell/core/U9.Y I
      // d0f: aload 0
      // d10: dup
      // d11: getfield com/finalshell/core/U9.d I
      // d14: iload 3
      // d15: bipush 1
      // d16: isub
      // d17: iadd
      // d18: putfield com/finalshell/core/U9.d I
      // d1b: aload 0
      // d1c: sipush 2765
      // d1f: ldc2_w 8216137057917720563
      // d22: invokestatic com/finalshell/core/U9.a (IJ)I
      // d25: putfield com/finalshell/core/U9.l C
      // d28: iload 2
      // d29: ifeq d3e
      // d2c: goto d33
      // d2f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d32: athrow
      // d33: aload 0
      // d34: bipush -1
      // d35: putfield com/finalshell/core/U9.z I
      // d38: aconst_null
      // d39: areturn
      // d3a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3d: athrow
      // d3e: aload 0
      // d3f: sipush 2897
      // d42: ldc2_w 695568451002816123
      // d45: invokestatic com/finalshell/core/U9.a (IJ)I
      // d48: putfield com/finalshell/core/U9.z I
      // d4b: iload 2
      // d4c: ifeq d5a
      // d4f: aload 0
      // d50: bipush -1
      // d51: putfield com/finalshell/core/U9.z I
      // d54: aconst_null
      // d55: areturn
      // d56: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d59: athrow
      // d5a: aload 5
      // d5c: areturn
   }

   public UUID T(char param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: aload 0
      // 004: bipush 0
      // 005: putfield com/finalshell/core/U9.z I
      // 008: istore 2
      // 009: bipush 0
      // 00a: istore 3
      // 00b: aload 0
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.d I
      // 010: iload 3
      // 011: iinc 3 1
      // 014: iadd
      // 015: invokevirtual com/finalshell/core/U9.C (I)C
      // 018: istore 4
      // 01a: iload 4
      // 01c: sipush 26107
      // 01f: ldc2_w 2081374444732725480
      // 022: invokestatic com/finalshell/core/U9.a (IJ)I
      // 025: iload 2
      // 026: ifne ab9
      // 029: if_icmpne aa7
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 0
      // 034: getfield com/finalshell/core/U9.d I
      // 037: bipush 1
      // 038: iadd
      // 039: istore 6
      // 03b: aload 0
      // 03c: sipush 26107
      // 03f: ldc2_w 2081374444732725480
      // 042: invokestatic com/finalshell/core/U9.a (IJ)I
      // 045: iload 6
      // 047: invokevirtual com/finalshell/core/U9.d (CI)I
      // 04a: istore 7
      // 04c: iload 7
      // 04e: bipush -1
      // 04f: iload 2
      // 050: ifne 077
      // 053: if_icmpne 072
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: new com/finalshell/core/Hi2
      // 060: dup
      // 061: sipush 10543
      // 064: sipush 6660
      // 067: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 06a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 06d: athrow
      // 06e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/finalshell/core/U9.d I
      // 076: bipush 1
      // 077: iadd
      // 078: istore 8
      // 07a: iload 7
      // 07c: iload 8
      // 07e: isub
      // 07f: istore 9
      // 081: iload 9
      // 083: sipush 24473
      // 086: ldc2_w 546015447496589972
      // 089: invokestatic com/finalshell/core/U9.a (IJ)I
      // 08c: iload 2
      // 08d: ifne 7b2
      // 090: if_icmpne 7a0
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: lconst_0
      // 09b: lstore 10
      // 09d: lconst_0
      // 09e: lstore 12
      // 0a0: bipush 0
      // 0a1: istore 14
      // 0a3: iload 14
      // 0a5: sipush 16265
      // 0a8: ldc2_w 35568148908106386
      // 0ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ae: if_icmpge 1f9
      // 0b1: aload 0
      // 0b2: iload 8
      // 0b4: iload 14
      // 0b6: iadd
      // 0b7: invokevirtual com/finalshell/core/U9.C (I)C
      // 0ba: istore 15
      // 0bc: iload 15
      // 0be: sipush 21259
      // 0c1: ldc2_w 1287927339301015045
      // 0c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c7: iload 2
      // 0c8: ifne 20f
      // 0cb: iload 2
      // 0cc: ifne 124
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: if_icmplt 112
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: iload 15
      // 0e2: sipush 24153
      // 0e5: ldc2_w 3168790736949871469
      // 0e8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0eb: iload 2
      // 0ec: ifne 124
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: if_icmpgt 112
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: iload 15
      // 102: sipush 21259
      // 105: ldc2_w 1287927339301015045
      // 108: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10b: isub
      // 10c: istore 16
      // 10e: iload 2
      // 10f: ifeq 1e4
      // 112: iload 15
      // 114: sipush 31880
      // 117: ldc2_w 6345766455927677411
      // 11a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: iload 2
      // 125: ifne 180
      // 128: if_icmplt 16e
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: iload 15
      // 134: sipush 23709
      // 137: ldc2_w 6885726342037307881
      // 13a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 13d: iload 2
      // 13e: ifne 180
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: if_icmpgt 16e
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: sipush 1861
      // 155: ldc2_w 5349631099953699429
      // 158: invokestatic com/finalshell/core/U9.a (IJ)I
      // 15b: iload 15
      // 15d: sipush 31880
      // 160: ldc2_w 6345766455927677411
      // 163: invokestatic com/finalshell/core/U9.a (IJ)I
      // 166: isub
      // 167: iadd
      // 168: istore 16
      // 16a: iload 2
      // 16b: ifeq 1e4
      // 16e: iload 15
      // 170: sipush 31506
      // 173: ldc2_w 427738362136340011
      // 176: invokestatic com/finalshell/core/U9.a (IJ)I
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: iload 2
      // 181: ifne 1a0
      // 184: if_icmplt 1d1
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: iload 15
      // 190: sipush 17399
      // 193: ldc2_w 8707971467972353759
      // 196: invokestatic com/finalshell/core/U9.a (IJ)I
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: iload 2
      // 1a1: ifne 1ca
      // 1a4: if_icmpgt 1d1
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: sipush 1861
      // 1b1: ldc2_w 5349631099953699429
      // 1b4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b7: iload 15
      // 1b9: sipush 31506
      // 1bc: ldc2_w 427738362136340011
      // 1bf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c2: isub
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: iadd
      // 1cb: istore 16
      // 1cd: iload 2
      // 1ce: ifeq 1e4
      // 1d1: aload 0
      // 1d2: sipush 4469
      // 1d5: ldc2_w 8451788941981764676
      // 1d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1db: putfield com/finalshell/core/U9.z I
      // 1de: aconst_null
      // 1df: areturn
      // 1e0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: lload 10
      // 1e6: bipush 4
      // 1e7: lshl
      // 1e8: lstore 10
      // 1ea: lload 10
      // 1ec: iload 16
      // 1ee: i2l
      // 1ef: lor
      // 1f0: lstore 10
      // 1f2: iinc 14 1
      // 1f5: iload 2
      // 1f6: ifeq 0a3
      // 1f9: sipush 28233
      // 1fc: ldc2_w 5739983667078181753
      // 1ff: invokestatic com/finalshell/core/U9.a (IJ)I
      // 202: istore 14
      // 204: iload 14
      // 206: sipush 16923
      // 209: ldc2_w 1571494982232874791
      // 20c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20f: if_icmpge 35a
      // 212: aload 0
      // 213: iload 8
      // 215: iload 14
      // 217: iadd
      // 218: invokevirtual com/finalshell/core/U9.C (I)C
      // 21b: istore 15
      // 21d: iload 15
      // 21f: sipush 21259
      // 222: ldc2_w 1287927339301015045
      // 225: invokestatic com/finalshell/core/U9.a (IJ)I
      // 228: iload 2
      // 229: ifne 370
      // 22c: iload 2
      // 22d: ifne 285
      // 230: goto 237
      // 233: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 236: athrow
      // 237: if_icmplt 273
      // 23a: goto 241
      // 23d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 240: athrow
      // 241: iload 15
      // 243: sipush 24153
      // 246: ldc2_w 3168790736949871469
      // 249: invokestatic com/finalshell/core/U9.a (IJ)I
      // 24c: iload 2
      // 24d: ifne 285
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: if_icmpgt 273
      // 25a: goto 261
      // 25d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 260: athrow
      // 261: iload 15
      // 263: sipush 21259
      // 266: ldc2_w 1287927339301015045
      // 269: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26c: isub
      // 26d: istore 16
      // 26f: iload 2
      // 270: ifeq 345
      // 273: iload 15
      // 275: sipush 31880
      // 278: ldc2_w 6345766455927677411
      // 27b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27e: goto 285
      // 281: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: iload 2
      // 286: ifne 2e1
      // 289: if_icmplt 2cf
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: iload 15
      // 295: sipush 23709
      // 298: ldc2_w 6885726342037307881
      // 29b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 29e: iload 2
      // 29f: ifne 2e1
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: if_icmpgt 2cf
      // 2ac: goto 2b3
      // 2af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: sipush 1861
      // 2b6: ldc2_w 5349631099953699429
      // 2b9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bc: iload 15
      // 2be: sipush 31880
      // 2c1: ldc2_w 6345766455927677411
      // 2c4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c7: isub
      // 2c8: iadd
      // 2c9: istore 16
      // 2cb: iload 2
      // 2cc: ifeq 345
      // 2cf: iload 15
      // 2d1: sipush 31506
      // 2d4: ldc2_w 427738362136340011
      // 2d7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2da: goto 2e1
      // 2dd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: iload 2
      // 2e2: ifne 301
      // 2e5: if_icmplt 332
      // 2e8: goto 2ef
      // 2eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ee: athrow
      // 2ef: iload 15
      // 2f1: sipush 17399
      // 2f4: ldc2_w 8707971467972353759
      // 2f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2fa: goto 301
      // 2fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 300: athrow
      // 301: iload 2
      // 302: ifne 32b
      // 305: if_icmpgt 332
      // 308: goto 30f
      // 30b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: sipush 1861
      // 312: ldc2_w 5349631099953699429
      // 315: invokestatic com/finalshell/core/U9.a (IJ)I
      // 318: iload 15
      // 31a: sipush 31506
      // 31d: ldc2_w 427738362136340011
      // 320: invokestatic com/finalshell/core/U9.a (IJ)I
      // 323: isub
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32a: athrow
      // 32b: iadd
      // 32c: istore 16
      // 32e: iload 2
      // 32f: ifeq 345
      // 332: aload 0
      // 333: sipush 4469
      // 336: ldc2_w 8451788941981764676
      // 339: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33c: putfield com/finalshell/core/U9.z I
      // 33f: aconst_null
      // 340: areturn
      // 341: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 344: athrow
      // 345: lload 10
      // 347: bipush 4
      // 348: lshl
      // 349: lstore 10
      // 34b: lload 10
      // 34d: iload 16
      // 34f: i2l
      // 350: lor
      // 351: lstore 10
      // 353: iinc 14 1
      // 356: iload 2
      // 357: ifeq 204
      // 35a: sipush 26467
      // 35d: ldc2_w 5688268127982992063
      // 360: invokestatic com/finalshell/core/U9.a (IJ)I
      // 363: istore 14
      // 365: iload 14
      // 367: sipush 3728
      // 36a: ldc2_w 2887857698909475834
      // 36d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 370: if_icmpge 4bb
      // 373: aload 0
      // 374: iload 8
      // 376: iload 14
      // 378: iadd
      // 379: invokevirtual com/finalshell/core/U9.C (I)C
      // 37c: istore 15
      // 37e: iload 15
      // 380: sipush 21259
      // 383: ldc2_w 1287927339301015045
      // 386: invokestatic com/finalshell/core/U9.a (IJ)I
      // 389: iload 2
      // 38a: ifne 4d1
      // 38d: iload 2
      // 38e: ifne 3e6
      // 391: goto 398
      // 394: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: if_icmplt 3d4
      // 39b: goto 3a2
      // 39e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a1: athrow
      // 3a2: iload 15
      // 3a4: sipush 24153
      // 3a7: ldc2_w 3168790736949871469
      // 3aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ad: iload 2
      // 3ae: ifne 3e6
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: if_icmpgt 3d4
      // 3bb: goto 3c2
      // 3be: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c1: athrow
      // 3c2: iload 15
      // 3c4: sipush 21259
      // 3c7: ldc2_w 1287927339301015045
      // 3ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3cd: isub
      // 3ce: istore 16
      // 3d0: iload 2
      // 3d1: ifeq 4a6
      // 3d4: iload 15
      // 3d6: sipush 31880
      // 3d9: ldc2_w 6345766455927677411
      // 3dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3df: goto 3e6
      // 3e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e5: athrow
      // 3e6: iload 2
      // 3e7: ifne 442
      // 3ea: if_icmplt 430
      // 3ed: goto 3f4
      // 3f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f3: athrow
      // 3f4: iload 15
      // 3f6: sipush 23709
      // 3f9: ldc2_w 6885726342037307881
      // 3fc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ff: iload 2
      // 400: ifne 442
      // 403: goto 40a
      // 406: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 409: athrow
      // 40a: if_icmpgt 430
      // 40d: goto 414
      // 410: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 413: athrow
      // 414: sipush 1861
      // 417: ldc2_w 5349631099953699429
      // 41a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 41d: iload 15
      // 41f: sipush 31880
      // 422: ldc2_w 6345766455927677411
      // 425: invokestatic com/finalshell/core/U9.a (IJ)I
      // 428: isub
      // 429: iadd
      // 42a: istore 16
      // 42c: iload 2
      // 42d: ifeq 4a6
      // 430: iload 15
      // 432: sipush 31506
      // 435: ldc2_w 427738362136340011
      // 438: invokestatic com/finalshell/core/U9.a (IJ)I
      // 43b: goto 442
      // 43e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 441: athrow
      // 442: iload 2
      // 443: ifne 462
      // 446: if_icmplt 493
      // 449: goto 450
      // 44c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: iload 15
      // 452: sipush 17399
      // 455: ldc2_w 8707971467972353759
      // 458: invokestatic com/finalshell/core/U9.a (IJ)I
      // 45b: goto 462
      // 45e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 461: athrow
      // 462: iload 2
      // 463: ifne 48c
      // 466: if_icmpgt 493
      // 469: goto 470
      // 46c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46f: athrow
      // 470: sipush 1861
      // 473: ldc2_w 5349631099953699429
      // 476: invokestatic com/finalshell/core/U9.a (IJ)I
      // 479: iload 15
      // 47b: sipush 31506
      // 47e: ldc2_w 427738362136340011
      // 481: invokestatic com/finalshell/core/U9.a (IJ)I
      // 484: isub
      // 485: goto 48c
      // 488: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48b: athrow
      // 48c: iadd
      // 48d: istore 16
      // 48f: iload 2
      // 490: ifeq 4a6
      // 493: aload 0
      // 494: sipush 4469
      // 497: ldc2_w 8451788941981764676
      // 49a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 49d: putfield com/finalshell/core/U9.z I
      // 4a0: aconst_null
      // 4a1: areturn
      // 4a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a5: athrow
      // 4a6: lload 10
      // 4a8: bipush 4
      // 4a9: lshl
      // 4aa: lstore 10
      // 4ac: lload 10
      // 4ae: iload 16
      // 4b0: i2l
      // 4b1: lor
      // 4b2: lstore 10
      // 4b4: iinc 14 1
      // 4b7: iload 2
      // 4b8: ifeq 365
      // 4bb: sipush 11963
      // 4be: ldc2_w 9151090831235478465
      // 4c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4c4: istore 14
      // 4c6: iload 14
      // 4c8: sipush 11303
      // 4cb: ldc2_w 8570254624104968456
      // 4ce: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4d1: if_icmpge 61c
      // 4d4: aload 0
      // 4d5: iload 8
      // 4d7: iload 14
      // 4d9: iadd
      // 4da: invokevirtual com/finalshell/core/U9.C (I)C
      // 4dd: istore 15
      // 4df: iload 15
      // 4e1: sipush 21259
      // 4e4: ldc2_w 1287927339301015045
      // 4e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4ea: iload 2
      // 4eb: ifne 632
      // 4ee: iload 2
      // 4ef: ifne 547
      // 4f2: goto 4f9
      // 4f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f8: athrow
      // 4f9: if_icmplt 535
      // 4fc: goto 503
      // 4ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 502: athrow
      // 503: iload 15
      // 505: sipush 24153
      // 508: ldc2_w 3168790736949871469
      // 50b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 50e: iload 2
      // 50f: ifne 547
      // 512: goto 519
      // 515: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 518: athrow
      // 519: if_icmpgt 535
      // 51c: goto 523
      // 51f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 522: athrow
      // 523: iload 15
      // 525: sipush 21259
      // 528: ldc2_w 1287927339301015045
      // 52b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 52e: isub
      // 52f: istore 16
      // 531: iload 2
      // 532: ifeq 607
      // 535: iload 15
      // 537: sipush 31880
      // 53a: ldc2_w 6345766455927677411
      // 53d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 540: goto 547
      // 543: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 546: athrow
      // 547: iload 2
      // 548: ifne 5a3
      // 54b: if_icmplt 591
      // 54e: goto 555
      // 551: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 554: athrow
      // 555: iload 15
      // 557: sipush 23709
      // 55a: ldc2_w 6885726342037307881
      // 55d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 560: iload 2
      // 561: ifne 5a3
      // 564: goto 56b
      // 567: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56a: athrow
      // 56b: if_icmpgt 591
      // 56e: goto 575
      // 571: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 574: athrow
      // 575: sipush 1861
      // 578: ldc2_w 5349631099953699429
      // 57b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 57e: iload 15
      // 580: sipush 31880
      // 583: ldc2_w 6345766455927677411
      // 586: invokestatic com/finalshell/core/U9.a (IJ)I
      // 589: isub
      // 58a: iadd
      // 58b: istore 16
      // 58d: iload 2
      // 58e: ifeq 607
      // 591: iload 15
      // 593: sipush 31506
      // 596: ldc2_w 427738362136340011
      // 599: invokestatic com/finalshell/core/U9.a (IJ)I
      // 59c: goto 5a3
      // 59f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a2: athrow
      // 5a3: iload 2
      // 5a4: ifne 5c3
      // 5a7: if_icmplt 5f4
      // 5aa: goto 5b1
      // 5ad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b0: athrow
      // 5b1: iload 15
      // 5b3: sipush 17399
      // 5b6: ldc2_w 8707971467972353759
      // 5b9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5bc: goto 5c3
      // 5bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c2: athrow
      // 5c3: iload 2
      // 5c4: ifne 5ed
      // 5c7: if_icmpgt 5f4
      // 5ca: goto 5d1
      // 5cd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d0: athrow
      // 5d1: sipush 1861
      // 5d4: ldc2_w 5349631099953699429
      // 5d7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5da: iload 15
      // 5dc: sipush 31506
      // 5df: ldc2_w 427738362136340011
      // 5e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5e5: isub
      // 5e6: goto 5ed
      // 5e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ec: athrow
      // 5ed: iadd
      // 5ee: istore 16
      // 5f0: iload 2
      // 5f1: ifeq 607
      // 5f4: aload 0
      // 5f5: sipush 4469
      // 5f8: ldc2_w 8451788941981764676
      // 5fb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5fe: putfield com/finalshell/core/U9.z I
      // 601: aconst_null
      // 602: areturn
      // 603: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 606: athrow
      // 607: lload 12
      // 609: bipush 4
      // 60a: lshl
      // 60b: lstore 12
      // 60d: lload 12
      // 60f: iload 16
      // 611: i2l
      // 612: lor
      // 613: lstore 12
      // 615: iinc 14 1
      // 618: iload 2
      // 619: ifeq 4c6
      // 61c: sipush 3207
      // 61f: ldc2_w 1942954832259305858
      // 622: invokestatic com/finalshell/core/U9.a (IJ)I
      // 625: istore 14
      // 627: iload 14
      // 629: sipush 5030
      // 62c: ldc2_w 5463149266322411209
      // 62f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 632: if_icmpge 772
      // 635: aload 0
      // 636: iload 8
      // 638: iload 14
      // 63a: iadd
      // 63b: invokevirtual com/finalshell/core/U9.C (I)C
      // 63e: istore 15
      // 640: iload 15
      // 642: sipush 21259
      // 645: ldc2_w 1287927339301015045
      // 648: invokestatic com/finalshell/core/U9.a (IJ)I
      // 64b: iload 2
      // 64c: ifne 69d
      // 64f: if_icmplt 68b
      // 652: goto 659
      // 655: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 658: athrow
      // 659: iload 15
      // 65b: sipush 24153
      // 65e: ldc2_w 3168790736949871469
      // 661: invokestatic com/finalshell/core/U9.a (IJ)I
      // 664: iload 2
      // 665: ifne 69d
      // 668: goto 66f
      // 66b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66e: athrow
      // 66f: if_icmpgt 68b
      // 672: goto 679
      // 675: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 678: athrow
      // 679: iload 15
      // 67b: sipush 21259
      // 67e: ldc2_w 1287927339301015045
      // 681: invokestatic com/finalshell/core/U9.a (IJ)I
      // 684: isub
      // 685: istore 16
      // 687: iload 2
      // 688: ifeq 75d
      // 68b: iload 15
      // 68d: sipush 31880
      // 690: ldc2_w 6345766455927677411
      // 693: invokestatic com/finalshell/core/U9.a (IJ)I
      // 696: goto 69d
      // 699: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69c: athrow
      // 69d: iload 2
      // 69e: ifne 6f9
      // 6a1: if_icmplt 6e7
      // 6a4: goto 6ab
      // 6a7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6aa: athrow
      // 6ab: iload 15
      // 6ad: sipush 23709
      // 6b0: ldc2_w 6885726342037307881
      // 6b3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6b6: iload 2
      // 6b7: ifne 6f9
      // 6ba: goto 6c1
      // 6bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c0: athrow
      // 6c1: if_icmpgt 6e7
      // 6c4: goto 6cb
      // 6c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ca: athrow
      // 6cb: sipush 1861
      // 6ce: ldc2_w 5349631099953699429
      // 6d1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6d4: iload 15
      // 6d6: sipush 31880
      // 6d9: ldc2_w 6345766455927677411
      // 6dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6df: isub
      // 6e0: iadd
      // 6e1: istore 16
      // 6e3: iload 2
      // 6e4: ifeq 75d
      // 6e7: iload 15
      // 6e9: sipush 31506
      // 6ec: ldc2_w 427738362136340011
      // 6ef: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6f2: goto 6f9
      // 6f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f8: athrow
      // 6f9: iload 2
      // 6fa: ifne 719
      // 6fd: if_icmplt 74a
      // 700: goto 707
      // 703: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 706: athrow
      // 707: iload 15
      // 709: sipush 17399
      // 70c: ldc2_w 8707971467972353759
      // 70f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 712: goto 719
      // 715: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 718: athrow
      // 719: iload 2
      // 71a: ifne 743
      // 71d: if_icmpgt 74a
      // 720: goto 727
      // 723: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 726: athrow
      // 727: sipush 1861
      // 72a: ldc2_w 5349631099953699429
      // 72d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 730: iload 15
      // 732: sipush 31506
      // 735: ldc2_w 427738362136340011
      // 738: invokestatic com/finalshell/core/U9.a (IJ)I
      // 73b: isub
      // 73c: goto 743
      // 73f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 742: athrow
      // 743: iadd
      // 744: istore 16
      // 746: iload 2
      // 747: ifeq 75d
      // 74a: aload 0
      // 74b: sipush 4469
      // 74e: ldc2_w 8451788941981764676
      // 751: invokestatic com/finalshell/core/U9.a (IJ)I
      // 754: putfield com/finalshell/core/U9.z I
      // 757: aconst_null
      // 758: areturn
      // 759: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75c: athrow
      // 75d: lload 12
      // 75f: bipush 4
      // 760: lshl
      // 761: lstore 12
      // 763: lload 12
      // 765: iload 16
      // 767: i2l
      // 768: lor
      // 769: lstore 12
      // 76b: iinc 14 1
      // 76e: iload 2
      // 76f: ifeq 627
      // 772: new java/util/UUID
      // 775: dup
      // 776: lload 10
      // 778: lload 12
      // 77a: invokespecial java/util/UUID.<init> (JJ)V
      // 77d: astore 5
      // 77f: iload 3
      // 780: iload 7
      // 782: aload 0
      // 783: getfield com/finalshell/core/U9.d I
      // 786: bipush 1
      // 787: iadd
      // 788: isub
      // 789: bipush 1
      // 78a: iadd
      // 78b: iadd
      // 78c: istore 3
      // 78d: aload 0
      // 78e: aload 0
      // 78f: getfield com/finalshell/core/U9.d I
      // 792: iload 3
      // 793: iinc 3 1
      // 796: iadd
      // 797: invokevirtual com/finalshell/core/U9.C (I)C
      // 79a: istore 4
      // 79c: iload 2
      // 79d: ifeq aa3
      // 7a0: iload 9
      // 7a2: sipush 18572
      // 7a5: ldc2_w 5664846119839831378
      // 7a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7ab: goto 7b2
      // 7ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b1: athrow
      // 7b2: if_icmpne a98
      // 7b5: lconst_0
      // 7b6: lstore 10
      // 7b8: lconst_0
      // 7b9: lstore 12
      // 7bb: bipush 0
      // 7bc: istore 14
      // 7be: iload 14
      // 7c0: sipush 9361
      // 7c3: ldc2_w 2488456831667599749
      // 7c6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7c9: if_icmpge 914
      // 7cc: aload 0
      // 7cd: iload 8
      // 7cf: iload 14
      // 7d1: iadd
      // 7d2: invokevirtual com/finalshell/core/U9.C (I)C
      // 7d5: istore 15
      // 7d7: iload 15
      // 7d9: sipush 21259
      // 7dc: ldc2_w 1287927339301015045
      // 7df: invokestatic com/finalshell/core/U9.a (IJ)I
      // 7e2: iload 2
      // 7e3: ifne 92a
      // 7e6: iload 2
      // 7e7: ifne 83f
      // 7ea: goto 7f1
      // 7ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f0: athrow
      // 7f1: if_icmplt 82d
      // 7f4: goto 7fb
      // 7f7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fa: athrow
      // 7fb: iload 15
      // 7fd: sipush 24153
      // 800: ldc2_w 3168790736949871469
      // 803: invokestatic com/finalshell/core/U9.a (IJ)I
      // 806: iload 2
      // 807: ifne 83f
      // 80a: goto 811
      // 80d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 810: athrow
      // 811: if_icmpgt 82d
      // 814: goto 81b
      // 817: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81a: athrow
      // 81b: iload 15
      // 81d: sipush 21259
      // 820: ldc2_w 1287927339301015045
      // 823: invokestatic com/finalshell/core/U9.a (IJ)I
      // 826: isub
      // 827: istore 16
      // 829: iload 2
      // 82a: ifeq 8ff
      // 82d: iload 15
      // 82f: sipush 31880
      // 832: ldc2_w 6345766455927677411
      // 835: invokestatic com/finalshell/core/U9.a (IJ)I
      // 838: goto 83f
      // 83b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83e: athrow
      // 83f: iload 2
      // 840: ifne 89b
      // 843: if_icmplt 889
      // 846: goto 84d
      // 849: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84c: athrow
      // 84d: iload 15
      // 84f: sipush 23709
      // 852: ldc2_w 6885726342037307881
      // 855: invokestatic com/finalshell/core/U9.a (IJ)I
      // 858: iload 2
      // 859: ifne 89b
      // 85c: goto 863
      // 85f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 862: athrow
      // 863: if_icmpgt 889
      // 866: goto 86d
      // 869: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86c: athrow
      // 86d: sipush 1861
      // 870: ldc2_w 5349631099953699429
      // 873: invokestatic com/finalshell/core/U9.a (IJ)I
      // 876: iload 15
      // 878: sipush 31880
      // 87b: ldc2_w 6345766455927677411
      // 87e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 881: isub
      // 882: iadd
      // 883: istore 16
      // 885: iload 2
      // 886: ifeq 8ff
      // 889: iload 15
      // 88b: sipush 31506
      // 88e: ldc2_w 427738362136340011
      // 891: invokestatic com/finalshell/core/U9.a (IJ)I
      // 894: goto 89b
      // 897: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89a: athrow
      // 89b: iload 2
      // 89c: ifne 8bb
      // 89f: if_icmplt 8ec
      // 8a2: goto 8a9
      // 8a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a8: athrow
      // 8a9: iload 15
      // 8ab: sipush 17399
      // 8ae: ldc2_w 8707971467972353759
      // 8b1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8b4: goto 8bb
      // 8b7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ba: athrow
      // 8bb: iload 2
      // 8bc: ifne 8e5
      // 8bf: if_icmpgt 8ec
      // 8c2: goto 8c9
      // 8c5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c8: athrow
      // 8c9: sipush 1861
      // 8cc: ldc2_w 5349631099953699429
      // 8cf: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8d2: iload 15
      // 8d4: sipush 31506
      // 8d7: ldc2_w 427738362136340011
      // 8da: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8dd: isub
      // 8de: goto 8e5
      // 8e1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e4: athrow
      // 8e5: iadd
      // 8e6: istore 16
      // 8e8: iload 2
      // 8e9: ifeq 8ff
      // 8ec: aload 0
      // 8ed: sipush 4469
      // 8f0: ldc2_w 8451788941981764676
      // 8f3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8f6: putfield com/finalshell/core/U9.z I
      // 8f9: aconst_null
      // 8fa: areturn
      // 8fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8fe: athrow
      // 8ff: lload 10
      // 901: bipush 4
      // 902: lshl
      // 903: lstore 10
      // 905: lload 10
      // 907: iload 16
      // 909: i2l
      // 90a: lor
      // 90b: lstore 10
      // 90d: iinc 14 1
      // 910: iload 2
      // 911: ifeq 7be
      // 914: sipush 9361
      // 917: ldc2_w 2488456831667599749
      // 91a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 91d: istore 14
      // 91f: iload 14
      // 921: sipush 18572
      // 924: ldc2_w 5664846119839831378
      // 927: invokestatic com/finalshell/core/U9.a (IJ)I
      // 92a: if_icmpge a6a
      // 92d: aload 0
      // 92e: iload 8
      // 930: iload 14
      // 932: iadd
      // 933: invokevirtual com/finalshell/core/U9.C (I)C
      // 936: istore 15
      // 938: iload 15
      // 93a: sipush 21259
      // 93d: ldc2_w 1287927339301015045
      // 940: invokestatic com/finalshell/core/U9.a (IJ)I
      // 943: iload 2
      // 944: ifne 995
      // 947: if_icmplt 983
      // 94a: goto 951
      // 94d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 950: athrow
      // 951: iload 15
      // 953: sipush 24153
      // 956: ldc2_w 3168790736949871469
      // 959: invokestatic com/finalshell/core/U9.a (IJ)I
      // 95c: iload 2
      // 95d: ifne 995
      // 960: goto 967
      // 963: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 966: athrow
      // 967: if_icmpgt 983
      // 96a: goto 971
      // 96d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 970: athrow
      // 971: iload 15
      // 973: sipush 21259
      // 976: ldc2_w 1287927339301015045
      // 979: invokestatic com/finalshell/core/U9.a (IJ)I
      // 97c: isub
      // 97d: istore 16
      // 97f: iload 2
      // 980: ifeq a55
      // 983: iload 15
      // 985: sipush 31880
      // 988: ldc2_w 6345766455927677411
      // 98b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 98e: goto 995
      // 991: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 994: athrow
      // 995: iload 2
      // 996: ifne 9f1
      // 999: if_icmplt 9df
      // 99c: goto 9a3
      // 99f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a2: athrow
      // 9a3: iload 15
      // 9a5: sipush 23709
      // 9a8: ldc2_w 6885726342037307881
      // 9ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9ae: iload 2
      // 9af: ifne 9f1
      // 9b2: goto 9b9
      // 9b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b8: athrow
      // 9b9: if_icmpgt 9df
      // 9bc: goto 9c3
      // 9bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c2: athrow
      // 9c3: sipush 1861
      // 9c6: ldc2_w 5349631099953699429
      // 9c9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9cc: iload 15
      // 9ce: sipush 31880
      // 9d1: ldc2_w 6345766455927677411
      // 9d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9d7: isub
      // 9d8: iadd
      // 9d9: istore 16
      // 9db: iload 2
      // 9dc: ifeq a55
      // 9df: iload 15
      // 9e1: sipush 31506
      // 9e4: ldc2_w 427738362136340011
      // 9e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 9ea: goto 9f1
      // 9ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f0: athrow
      // 9f1: iload 2
      // 9f2: ifne a11
      // 9f5: if_icmplt a42
      // 9f8: goto 9ff
      // 9fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9fe: athrow
      // 9ff: iload 15
      // a01: sipush 17399
      // a04: ldc2_w 8707971467972353759
      // a07: invokestatic com/finalshell/core/U9.a (IJ)I
      // a0a: goto a11
      // a0d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a10: athrow
      // a11: iload 2
      // a12: ifne a3b
      // a15: if_icmpgt a42
      // a18: goto a1f
      // a1b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1e: athrow
      // a1f: sipush 1861
      // a22: ldc2_w 5349631099953699429
      // a25: invokestatic com/finalshell/core/U9.a (IJ)I
      // a28: iload 15
      // a2a: sipush 31506
      // a2d: ldc2_w 427738362136340011
      // a30: invokestatic com/finalshell/core/U9.a (IJ)I
      // a33: isub
      // a34: goto a3b
      // a37: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3a: athrow
      // a3b: iadd
      // a3c: istore 16
      // a3e: iload 2
      // a3f: ifeq a55
      // a42: aload 0
      // a43: sipush 4469
      // a46: ldc2_w 8451788941981764676
      // a49: invokestatic com/finalshell/core/U9.a (IJ)I
      // a4c: putfield com/finalshell/core/U9.z I
      // a4f: aconst_null
      // a50: areturn
      // a51: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a54: athrow
      // a55: lload 12
      // a57: bipush 4
      // a58: lshl
      // a59: lstore 12
      // a5b: lload 12
      // a5d: iload 16
      // a5f: i2l
      // a60: lor
      // a61: lstore 12
      // a63: iinc 14 1
      // a66: iload 2
      // a67: ifeq 91f
      // a6a: new java/util/UUID
      // a6d: dup
      // a6e: lload 10
      // a70: lload 12
      // a72: invokespecial java/util/UUID.<init> (JJ)V
      // a75: astore 5
      // a77: iload 3
      // a78: iload 7
      // a7a: aload 0
      // a7b: getfield com/finalshell/core/U9.d I
      // a7e: bipush 1
      // a7f: iadd
      // a80: isub
      // a81: bipush 1
      // a82: iadd
      // a83: iadd
      // a84: istore 3
      // a85: aload 0
      // a86: aload 0
      // a87: getfield com/finalshell/core/U9.d I
      // a8a: iload 3
      // a8b: iinc 3 1
      // a8e: iadd
      // a8f: invokevirtual com/finalshell/core/U9.C (I)C
      // a92: istore 4
      // a94: iload 2
      // a95: ifeq aa3
      // a98: aload 0
      // a99: bipush -1
      // a9a: putfield com/finalshell/core/U9.z I
      // a9d: aconst_null
      // a9e: areturn
      // a9f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa2: athrow
      // aa3: iload 2
      // aa4: ifeq b6c
      // aa7: iload 4
      // aa9: sipush 7800
      // aac: ldc2_w 5201320676148134657
      // aaf: invokestatic com/finalshell/core/U9.a (IJ)I
      // ab2: goto ab9
      // ab5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab8: athrow
      // ab9: iload 2
      // aba: ifne aef
      // abd: if_icmpne b5e
      // ac0: goto ac7
      // ac3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac6: athrow
      // ac7: aload 0
      // ac8: aload 0
      // ac9: getfield com/finalshell/core/U9.d I
      // acc: iload 3
      // acd: iinc 3 1
      // ad0: iadd
      // ad1: iload 2
      // ad2: ifne b67
      // ad5: goto adc
      // ad8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // adb: athrow
      // adc: invokevirtual com/finalshell/core/U9.C (I)C
      // adf: sipush 25252
      // ae2: ldc2_w 2256381802227974060
      // ae5: invokestatic com/finalshell/core/U9.a (IJ)I
      // ae8: goto aef
      // aeb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aee: athrow
      // aef: if_icmpne b5e
      // af2: aload 0
      // af3: aload 0
      // af4: getfield com/finalshell/core/U9.d I
      // af7: iload 3
      // af8: iinc 3 1
      // afb: iadd
      // afc: iload 2
      // afd: ifne b67
      // b00: goto b07
      // b03: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b06: athrow
      // b07: invokevirtual com/finalshell/core/U9.C (I)C
      // b0a: sipush 7325
      // b0d: ldc2_w 7975301603790307833
      // b10: invokestatic com/finalshell/core/U9.a (IJ)I
      // b13: if_icmpne b5e
      // b16: goto b1d
      // b19: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1c: athrow
      // b1d: aload 0
      // b1e: aload 0
      // b1f: getfield com/finalshell/core/U9.d I
      // b22: iload 3
      // b23: iinc 3 1
      // b26: iadd
      // b27: iload 2
      // b28: ifne b67
      // b2b: goto b32
      // b2e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b31: athrow
      // b32: invokevirtual com/finalshell/core/U9.C (I)C
      // b35: sipush 7325
      // b38: ldc2_w 7975301603790307833
      // b3b: invokestatic com/finalshell/core/U9.a (IJ)I
      // b3e: if_icmpne b5e
      // b41: goto b48
      // b44: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b47: athrow
      // b48: aconst_null
      // b49: astore 5
      // b4b: aload 0
      // b4c: aload 0
      // b4d: getfield com/finalshell/core/U9.d I
      // b50: iload 3
      // b51: iinc 3 1
      // b54: iadd
      // b55: invokevirtual com/finalshell/core/U9.C (I)C
      // b58: istore 4
      // b5a: iload 2
      // b5b: ifeq b6c
      // b5e: aload 0
      // b5f: bipush -1
      // b60: goto b67
      // b63: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b66: athrow
      // b67: putfield com/finalshell/core/U9.z I
      // b6a: aconst_null
      // b6b: areturn
      // b6c: iload 4
      // b6e: sipush 26927
      // b71: ldc2_w 6101958691031889140
      // b74: invokestatic com/finalshell/core/U9.a (IJ)I
      // b77: iload 2
      // b78: ifne bba
      // b7b: if_icmpne baf
      // b7e: goto b85
      // b81: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b84: athrow
      // b85: aload 0
      // b86: dup
      // b87: getfield com/finalshell/core/U9.d I
      // b8a: iload 3
      // b8b: iadd
      // b8c: putfield com/finalshell/core/U9.d I
      // b8f: aload 0
      // b90: aload 0
      // b91: aload 0
      // b92: getfield com/finalshell/core/U9.d I
      // b95: invokevirtual com/finalshell/core/U9.C (I)C
      // b98: putfield com/finalshell/core/U9.l C
      // b9b: aload 0
      // b9c: sipush 5887
      // b9f: ldc2_w 3467391210321595353
      // ba2: invokestatic com/finalshell/core/U9.a (IJ)I
      // ba5: putfield com/finalshell/core/U9.z I
      // ba8: aload 5
      // baa: areturn
      // bab: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bae: athrow
      // baf: iload 4
      // bb1: sipush 30337
      // bb4: ldc2_w 2029800848590515112
      // bb7: invokestatic com/finalshell/core/U9.a (IJ)I
      // bba: iload 2
      // bbb: ifne be2
      // bbe: if_icmpne d1c
      // bc1: goto bc8
      // bc4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc7: athrow
      // bc8: aload 0
      // bc9: aload 0
      // bca: getfield com/finalshell/core/U9.d I
      // bcd: iload 3
      // bce: iinc 3 1
      // bd1: iadd
      // bd2: invokevirtual com/finalshell/core/U9.C (I)C
      // bd5: istore 4
      // bd7: iload 4
      // bd9: sipush 26927
      // bdc: ldc2_w 6101958691031889140
      // bdf: invokestatic com/finalshell/core/U9.a (IJ)I
      // be2: iload 2
      // be3: ifne c30
      // be6: if_icmpne c1e
      // be9: goto bf0
      // bec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bef: athrow
      // bf0: aload 0
      // bf1: sipush 9361
      // bf4: ldc2_w 2488456831667599749
      // bf7: invokestatic com/finalshell/core/U9.a (IJ)I
      // bfa: putfield com/finalshell/core/U9.Y I
      // bfd: aload 0
      // bfe: dup
      // bff: getfield com/finalshell/core/U9.d I
      // c02: iload 3
      // c03: iadd
      // c04: putfield com/finalshell/core/U9.d I
      // c07: aload 0
      // c08: aload 0
      // c09: aload 0
      // c0a: getfield com/finalshell/core/U9.d I
      // c0d: invokevirtual com/finalshell/core/U9.C (I)C
      // c10: putfield com/finalshell/core/U9.l C
      // c13: iload 2
      // c14: ifeq d0b
      // c17: goto c1e
      // c1a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1d: athrow
      // c1e: iload 4
      // c20: sipush 30337
      // c23: ldc2_w 2029800848590515112
      // c26: invokestatic com/finalshell/core/U9.a (IJ)I
      // c29: goto c30
      // c2c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2f: athrow
      // c30: iload 2
      // c31: ifne c7e
      // c34: if_icmpne c6c
      // c37: goto c3e
      // c3a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c3d: athrow
      // c3e: aload 0
      // c3f: sipush 9145
      // c42: ldc2_w 6577731744871808687
      // c45: invokestatic com/finalshell/core/U9.a (IJ)I
      // c48: putfield com/finalshell/core/U9.Y I
      // c4b: aload 0
      // c4c: dup
      // c4d: getfield com/finalshell/core/U9.d I
      // c50: iload 3
      // c51: iadd
      // c52: putfield com/finalshell/core/U9.d I
      // c55: aload 0
      // c56: aload 0
      // c57: aload 0
      // c58: getfield com/finalshell/core/U9.d I
      // c5b: invokevirtual com/finalshell/core/U9.C (I)C
      // c5e: putfield com/finalshell/core/U9.l C
      // c61: iload 2
      // c62: ifeq d0b
      // c65: goto c6c
      // c68: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c6b: athrow
      // c6c: iload 4
      // c6e: sipush 4784
      // c71: ldc2_w 3082167687830622095
      // c74: invokestatic com/finalshell/core/U9.a (IJ)I
      // c77: goto c7e
      // c7a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7d: athrow
      // c7e: iload 2
      // c7f: ifne ccc
      // c82: if_icmpne cba
      // c85: goto c8c
      // c88: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c8b: athrow
      // c8c: aload 0
      // c8d: sipush 16923
      // c90: ldc2_w 1571494982232874791
      // c93: invokestatic com/finalshell/core/U9.a (IJ)I
      // c96: putfield com/finalshell/core/U9.Y I
      // c99: aload 0
      // c9a: dup
      // c9b: getfield com/finalshell/core/U9.d I
      // c9e: iload 3
      // c9f: iadd
      // ca0: putfield com/finalshell/core/U9.d I
      // ca3: aload 0
      // ca4: aload 0
      // ca5: aload 0
      // ca6: getfield com/finalshell/core/U9.d I
      // ca9: invokevirtual com/finalshell/core/U9.C (I)C
      // cac: putfield com/finalshell/core/U9.l C
      // caf: iload 2
      // cb0: ifeq d0b
      // cb3: goto cba
      // cb6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb9: athrow
      // cba: iload 4
      // cbc: sipush 2765
      // cbf: ldc2_w 8216137057917720563
      // cc2: invokestatic com/finalshell/core/U9.a (IJ)I
      // cc5: goto ccc
      // cc8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ccb: athrow
      // ccc: if_icmpne d00
      // ccf: aload 0
      // cd0: sipush 9907
      // cd3: ldc2_w 514190805586246625
      // cd6: invokestatic com/finalshell/core/U9.a (IJ)I
      // cd9: putfield com/finalshell/core/U9.Y I
      // cdc: aload 0
      // cdd: dup
      // cde: getfield com/finalshell/core/U9.d I
      // ce1: iload 3
      // ce2: bipush 1
      // ce3: isub
      // ce4: iadd
      // ce5: putfield com/finalshell/core/U9.d I
      // ce8: aload 0
      // ce9: sipush 2765
      // cec: ldc2_w 8216137057917720563
      // cef: invokestatic com/finalshell/core/U9.a (IJ)I
      // cf2: putfield com/finalshell/core/U9.l C
      // cf5: iload 2
      // cf6: ifeq d0b
      // cf9: goto d00
      // cfc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cff: athrow
      // d00: aload 0
      // d01: bipush -1
      // d02: putfield com/finalshell/core/U9.z I
      // d05: aconst_null
      // d06: areturn
      // d07: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d0a: athrow
      // d0b: aload 0
      // d0c: sipush 2897
      // d0f: ldc2_w 695568451002816123
      // d12: invokestatic com/finalshell/core/U9.a (IJ)I
      // d15: putfield com/finalshell/core/U9.z I
      // d18: iload 2
      // d19: ifeq d27
      // d1c: aload 0
      // d1d: bipush -1
      // d1e: putfield com/finalshell/core/U9.z I
      // d21: aconst_null
      // d22: areturn
      // d23: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d26: athrow
      // d27: aload 5
      // d29: areturn
   }

   public final void U() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.l C
      // 008: sipush 2974
      // 00b: ldc2_w 7517364692915017364
      // 00e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 011: iload 1
      // 012: ifeq 046
      // 015: if_icmpeq 034
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: new com/finalshell/core/Hi2
      // 022: dup
      // 023: sipush 10532
      // 026: sipush -14439
      // 029: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 02c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 02f: athrow
      // 030: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: invokevirtual com/finalshell/core/U9.C$char ()C
      // 038: pop
      // 039: aload 0
      // 03a: getfield com/finalshell/core/U9.l C
      // 03d: sipush 24249
      // 040: ldc2_w 8775186783408882680
      // 043: invokestatic com/finalshell/core/U9.a (IJ)I
      // 046: iload 1
      // 047: ifeq 07b
      // 04a: if_icmpeq 069
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: new com/finalshell/core/Hi2
      // 057: dup
      // 058: sipush 10550
      // 05b: sipush 14350
      // 05e: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 061: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aload 0
      // 06a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 06d: pop
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/U9.l C
      // 072: sipush 25252
      // 075: ldc2_w 2256381802227974060
      // 078: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07b: iload 1
      // 07c: ifeq 0b0
      // 07f: if_icmpeq 09e
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: new com/finalshell/core/Hi2
      // 08c: dup
      // 08d: sipush 10550
      // 090: sipush 14350
      // 093: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 096: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 099: athrow
      // 09a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 0
      // 09f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0a2: pop
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/U9.l C
      // 0a7: sipush 16831
      // 0aa: ldc2_w 1205696545576721607
      // 0ad: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b0: iload 1
      // 0b1: ifeq 0f0
      // 0b4: if_icmpeq 0d3
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: new com/finalshell/core/Hi2
      // 0c1: dup
      // 0c2: sipush 10550
      // 0c5: sipush 14350
      // 0c8: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0cb: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0ce: athrow
      // 0cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0d7: pop
      // 0d8: aload 0
      // 0d9: iload 1
      // 0da: ifeq 271
      // 0dd: getfield com/finalshell/core/U9.l C
      // 0e0: sipush 18572
      // 0e3: ldc2_w 5664846119839831378
      // 0e6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: if_icmpeq 269
      // 0f3: aload 0
      // 0f4: iload 1
      // 0f5: ifeq 271
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: getfield com/finalshell/core/U9.l C
      // 102: sipush 26927
      // 105: ldc2_w 6101958691031889140
      // 108: invokestatic com/finalshell/core/U9.a (IJ)I
      // 10b: if_icmpeq 269
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 0
      // 116: iload 1
      // 117: ifeq 271
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: getfield com/finalshell/core/U9.l C
      // 124: sipush 4784
      // 127: ldc2_w 3082167687830622095
      // 12a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 12d: if_icmpeq 269
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: aload 0
      // 138: iload 1
      // 139: ifeq 271
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: getfield com/finalshell/core/U9.l C
      // 146: sipush 30337
      // 149: ldc2_w 2029800848590515112
      // 14c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14f: if_icmpeq 269
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: aload 0
      // 15a: iload 1
      // 15b: ifeq 271
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: getfield com/finalshell/core/U9.l C
      // 168: sipush 1861
      // 16b: ldc2_w 5349631099953699429
      // 16e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 171: if_icmpeq 269
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: aload 0
      // 17c: iload 1
      // 17d: ifeq 271
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: getfield com/finalshell/core/U9.l C
      // 18a: sipush 16923
      // 18d: ldc2_w 1571494982232874791
      // 190: invokestatic com/finalshell/core/U9.a (IJ)I
      // 193: if_icmpeq 269
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: aload 0
      // 19e: iload 1
      // 19f: ifeq 271
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: getfield com/finalshell/core/U9.l C
      // 1ac: sipush 28233
      // 1af: ldc2_w 5739983667078181753
      // 1b2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1b5: if_icmpeq 269
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: iload 1
      // 1c1: ifeq 271
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: getfield com/finalshell/core/U9.l C
      // 1ce: sipush 2765
      // 1d1: ldc2_w 8216137057917720563
      // 1d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1d7: if_icmpeq 269
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: iload 1
      // 1e3: ifeq 271
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: getfield com/finalshell/core/U9.l C
      // 1f0: sipush 16823
      // 1f3: ldc2_w 1966285255030480114
      // 1f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1f9: if_icmpeq 269
      // 1fc: goto 203
      // 1ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aload 0
      // 204: iload 1
      // 205: ifeq 271
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: getfield com/finalshell/core/U9.l C
      // 212: sipush 16265
      // 215: ldc2_w 35568148908106386
      // 218: invokestatic com/finalshell/core/U9.a (IJ)I
      // 21b: if_icmpeq 269
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: aload 0
      // 226: iload 1
      // 227: ifeq 271
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: getfield com/finalshell/core/U9.l C
      // 234: sipush 5277
      // 237: ldc2_w 8676978433026148774
      // 23a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23d: if_icmpeq 269
      // 240: goto 247
      // 243: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 246: athrow
      // 247: aload 0
      // 248: iload 1
      // 249: ifeq 271
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: getfield com/finalshell/core/U9.l C
      // 256: sipush 9180
      // 259: ldc2_w 6298462668578782968
      // 25c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 25f: if_icmpne 281
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: aload 0
      // 26a: goto 271
      // 26d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: sipush 3944
      // 274: ldc2_w 2225081863752602224
      // 277: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27a: putfield com/finalshell/core/U9.Y I
      // 27d: iload 1
      // 27e: ifne 296
      // 281: new com/finalshell/core/Hi2
      // 284: dup
      // 285: sipush 10503
      // 288: sipush -23864
      // 28b: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 28e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 291: athrow
      // 292: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 295: athrow
      // 296: return
   }

   public final void s() {
      this.c(true);
   }

   public final void c(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.l C
      // 008: sipush 7800
      // 00b: ldc2_w 5201320676148134657
      // 00e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 011: iload 2
      // 012: ifne 046
      // 015: if_icmpeq 034
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: new com/finalshell/core/Hi2
      // 022: dup
      // 023: sipush 10557
      // 026: sipush -13743
      // 029: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 02c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 02f: athrow
      // 030: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: invokevirtual com/finalshell/core/U9.C$char ()C
      // 038: pop
      // 039: aload 0
      // 03a: getfield com/finalshell/core/U9.l C
      // 03d: sipush 25252
      // 040: ldc2_w 2256381802227974060
      // 043: invokestatic com/finalshell/core/U9.a (IJ)I
      // 046: iload 2
      // 047: ifne 28a
      // 04a: if_icmpne 27d
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: aload 0
      // 055: invokevirtual com/finalshell/core/U9.C$char ()C
      // 058: pop
      // 059: aload 0
      // 05a: getfield com/finalshell/core/U9.l C
      // 05d: sipush 7325
      // 060: ldc2_w 7975301603790307833
      // 063: invokestatic com/finalshell/core/U9.a (IJ)I
      // 066: iload 2
      // 067: ifne 0a2
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: if_icmpeq 090
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: new com/finalshell/core/Hi2
      // 07e: dup
      // 07f: sipush 10539
      // 082: sipush -3641
      // 085: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 088: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 0
      // 091: invokevirtual com/finalshell/core/U9.C$char ()C
      // 094: pop
      // 095: aload 0
      // 096: getfield com/finalshell/core/U9.l C
      // 099: sipush 7325
      // 09c: ldc2_w 7975301603790307833
      // 09f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a2: iload 2
      // 0a3: ifne 0e2
      // 0a6: if_icmpeq 0c5
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: new com/finalshell/core/Hi2
      // 0b3: dup
      // 0b4: sipush 10509
      // 0b7: sipush -521
      // 0ba: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0bd: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0c0: athrow
      // 0c1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0c9: pop
      // 0ca: aload 0
      // 0cb: iload 2
      // 0cc: ifne 257
      // 0cf: getfield com/finalshell/core/U9.l C
      // 0d2: sipush 18572
      // 0d5: ldc2_w 5664846119839831378
      // 0d8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: if_icmpeq 24f
      // 0e5: aload 0
      // 0e6: iload 2
      // 0e7: ifne 257
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: getfield com/finalshell/core/U9.l C
      // 0f4: sipush 26927
      // 0f7: ldc2_w 6101958691031889140
      // 0fa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0fd: if_icmpeq 24f
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 0
      // 108: iload 2
      // 109: ifne 257
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: getfield com/finalshell/core/U9.l C
      // 116: sipush 4784
      // 119: ldc2_w 3082167687830622095
      // 11c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11f: if_icmpeq 24f
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 0
      // 12a: iload 2
      // 12b: ifne 257
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: getfield com/finalshell/core/U9.l C
      // 138: sipush 30337
      // 13b: ldc2_w 2029800848590515112
      // 13e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 141: if_icmpeq 24f
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 0
      // 14c: iload 2
      // 14d: ifne 257
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: getfield com/finalshell/core/U9.l C
      // 15a: sipush 1861
      // 15d: ldc2_w 5349631099953699429
      // 160: invokestatic com/finalshell/core/U9.a (IJ)I
      // 163: if_icmpeq 24f
      // 166: goto 16d
      // 169: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: aload 0
      // 16e: iload 2
      // 16f: ifne 257
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: getfield com/finalshell/core/U9.l C
      // 17c: sipush 16923
      // 17f: ldc2_w 1571494982232874791
      // 182: invokestatic com/finalshell/core/U9.a (IJ)I
      // 185: if_icmpeq 24f
      // 188: goto 18f
      // 18b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18e: athrow
      // 18f: aload 0
      // 190: iload 2
      // 191: ifne 257
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: getfield com/finalshell/core/U9.l C
      // 19e: sipush 28233
      // 1a1: ldc2_w 5739983667078181753
      // 1a4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a7: if_icmpeq 24f
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: iload 2
      // 1b3: ifne 257
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: getfield com/finalshell/core/U9.l C
      // 1c0: sipush 2765
      // 1c3: ldc2_w 8216137057917720563
      // 1c6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c9: if_icmpeq 24f
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: getfield com/finalshell/core/U9.l C
      // 1d7: sipush 5277
      // 1da: ldc2_w 8676978433026148774
      // 1dd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1e0: iload 2
      // 1e1: ifne 22a
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: if_icmpne 20b
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: iload 1
      // 1f6: iload 2
      // 1f7: ifne 221
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: ifne 24f
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: aload 0
      // 20c: iload 2
      // 20d: ifne 257
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: getfield com/finalshell/core/U9.l C
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: sipush 16823
      // 224: ldc2_w 1966285255030480114
      // 227: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22a: if_icmpeq 24f
      // 22d: aload 0
      // 22e: iload 2
      // 22f: ifne 257
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: getfield com/finalshell/core/U9.l C
      // 23c: sipush 16265
      // 23f: ldc2_w 35568148908106386
      // 242: invokestatic com/finalshell/core/U9.a (IJ)I
      // 245: if_icmpne 267
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24e: athrow
      // 24f: aload 0
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: sipush 16265
      // 25a: ldc2_w 35568148908106386
      // 25d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 260: putfield com/finalshell/core/U9.Y I
      // 263: iload 2
      // 264: ifeq 27c
      // 267: new com/finalshell/core/Hi2
      // 26a: dup
      // 26b: sipush 10556
      // 26e: sipush 30496
      // 271: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 274: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 277: athrow
      // 278: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27b: athrow
      // 27c: return
      // 27d: aload 0
      // 27e: getfield com/finalshell/core/U9.l C
      // 281: sipush 16831
      // 284: ldc2_w 1205696545576721607
      // 287: invokestatic com/finalshell/core/U9.a (IJ)I
      // 28a: iload 2
      // 28b: ifne 2bf
      // 28e: if_icmpeq 2ad
      // 291: goto 298
      // 294: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 297: athrow
      // 298: new com/finalshell/core/Hi2
      // 29b: dup
      // 29c: sipush 10514
      // 29f: sipush 19267
      // 2a2: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 2a5: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2a8: athrow
      // 2a9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: aload 0
      // 2ae: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2b1: pop
      // 2b2: aload 0
      // 2b3: getfield com/finalshell/core/U9.l C
      // 2b6: sipush 8468
      // 2b9: ldc2_w 4735028716575980639
      // 2bc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2bf: iload 2
      // 2c0: ifne 2ff
      // 2c3: if_icmpeq 2e2
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: new com/finalshell/core/Hi2
      // 2d0: dup
      // 2d1: sipush 10513
      // 2d4: sipush -29348
      // 2d7: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 2da: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2dd: athrow
      // 2de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2e6: pop
      // 2e7: aload 0
      // 2e8: iload 2
      // 2e9: ifne 43c
      // 2ec: getfield com/finalshell/core/U9.l C
      // 2ef: sipush 18572
      // 2f2: ldc2_w 5664846119839831378
      // 2f5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f8: goto 2ff
      // 2fb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: if_icmpeq 434
      // 302: aload 0
      // 303: iload 2
      // 304: ifne 43c
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: getfield com/finalshell/core/U9.l C
      // 311: sipush 26927
      // 314: ldc2_w 6101958691031889140
      // 317: invokestatic com/finalshell/core/U9.a (IJ)I
      // 31a: if_icmpeq 434
      // 31d: goto 324
      // 320: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 323: athrow
      // 324: aload 0
      // 325: iload 2
      // 326: ifne 43c
      // 329: goto 330
      // 32c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32f: athrow
      // 330: getfield com/finalshell/core/U9.l C
      // 333: sipush 4784
      // 336: ldc2_w 3082167687830622095
      // 339: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33c: if_icmpeq 434
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: aload 0
      // 347: iload 2
      // 348: ifne 43c
      // 34b: goto 352
      // 34e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 351: athrow
      // 352: getfield com/finalshell/core/U9.l C
      // 355: sipush 30337
      // 358: ldc2_w 2029800848590515112
      // 35b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35e: if_icmpeq 434
      // 361: goto 368
      // 364: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 367: athrow
      // 368: aload 0
      // 369: iload 2
      // 36a: ifne 43c
      // 36d: goto 374
      // 370: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 373: athrow
      // 374: getfield com/finalshell/core/U9.l C
      // 377: sipush 1861
      // 37a: ldc2_w 5349631099953699429
      // 37d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 380: if_icmpeq 434
      // 383: goto 38a
      // 386: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 389: athrow
      // 38a: aload 0
      // 38b: iload 2
      // 38c: ifne 43c
      // 38f: goto 396
      // 392: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 395: athrow
      // 396: getfield com/finalshell/core/U9.l C
      // 399: sipush 16923
      // 39c: ldc2_w 1571494982232874791
      // 39f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3a2: if_icmpeq 434
      // 3a5: goto 3ac
      // 3a8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ab: athrow
      // 3ac: aload 0
      // 3ad: iload 2
      // 3ae: ifne 43c
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: getfield com/finalshell/core/U9.l C
      // 3bb: sipush 28233
      // 3be: ldc2_w 5739983667078181753
      // 3c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c4: if_icmpeq 434
      // 3c7: goto 3ce
      // 3ca: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cd: athrow
      // 3ce: aload 0
      // 3cf: iload 2
      // 3d0: ifne 43c
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: getfield com/finalshell/core/U9.l C
      // 3dd: sipush 2765
      // 3e0: ldc2_w 8216137057917720563
      // 3e3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e6: if_icmpeq 434
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 0
      // 3f1: iload 2
      // 3f2: ifne 43c
      // 3f5: goto 3fc
      // 3f8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fb: athrow
      // 3fc: getfield com/finalshell/core/U9.l C
      // 3ff: sipush 16823
      // 402: ldc2_w 1966285255030480114
      // 405: invokestatic com/finalshell/core/U9.a (IJ)I
      // 408: if_icmpeq 434
      // 40b: goto 412
      // 40e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 411: athrow
      // 412: aload 0
      // 413: iload 2
      // 414: ifne 43c
      // 417: goto 41e
      // 41a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41d: athrow
      // 41e: getfield com/finalshell/core/U9.l C
      // 421: sipush 16265
      // 424: ldc2_w 35568148908106386
      // 427: invokestatic com/finalshell/core/U9.a (IJ)I
      // 42a: if_icmpne 44c
      // 42d: goto 434
      // 430: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 433: athrow
      // 434: aload 0
      // 435: goto 43c
      // 438: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43b: athrow
      // 43c: sipush 28233
      // 43f: ldc2_w 5739983667078181753
      // 442: invokestatic com/finalshell/core/U9.a (IJ)I
      // 445: putfield com/finalshell/core/U9.Y I
      // 448: iload 2
      // 449: ifeq 461
      // 44c: new com/finalshell/core/Hi2
      // 44f: dup
      // 450: sipush 10544
      // 453: sipush -31961
      // 456: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 459: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 45c: athrow
      // 45d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 460: athrow
      // 461: return
   }

   public final void E() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.l C
      // 008: sipush 23709
      // 00b: ldc2_w 6885726342037307881
      // 00e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 011: iload 1
      // 012: ifne 046
      // 015: if_icmpeq 034
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: new com/finalshell/core/Hi2
      // 022: dup
      // 023: sipush 10551
      // 026: sipush 27538
      // 029: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 02c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 02f: athrow
      // 030: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: invokevirtual com/finalshell/core/U9.C$char ()C
      // 038: pop
      // 039: aload 0
      // 03a: getfield com/finalshell/core/U9.l C
      // 03d: sipush 31880
      // 040: ldc2_w 6345766455927677411
      // 043: invokestatic com/finalshell/core/U9.a (IJ)I
      // 046: iload 1
      // 047: ifne 07b
      // 04a: if_icmpeq 069
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: new com/finalshell/core/Hi2
      // 057: dup
      // 058: sipush 10542
      // 05b: sipush -31810
      // 05e: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 061: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aload 0
      // 06a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 06d: pop
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/U9.l C
      // 072: sipush 7325
      // 075: ldc2_w 7975301603790307833
      // 078: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07b: iload 1
      // 07c: ifne 0b0
      // 07f: if_icmpeq 09e
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: new com/finalshell/core/Hi2
      // 08c: dup
      // 08d: sipush 10542
      // 090: sipush -31810
      // 093: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 096: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 099: athrow
      // 09a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 0
      // 09f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0a2: pop
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/U9.l C
      // 0a7: sipush 18553
      // 0aa: ldc2_w 4201120391641765129
      // 0ad: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0b0: iload 1
      // 0b1: ifne 0e5
      // 0b4: if_icmpeq 0d3
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: new com/finalshell/core/Hi2
      // 0c1: dup
      // 0c2: sipush 10542
      // 0c5: sipush -31810
      // 0c8: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0cb: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0ce: athrow
      // 0cf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0d7: pop
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/core/U9.l C
      // 0dc: sipush 16831
      // 0df: ldc2_w 1205696545576721607
      // 0e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e5: iload 1
      // 0e6: ifne 125
      // 0e9: if_icmpeq 108
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: new com/finalshell/core/Hi2
      // 0f6: dup
      // 0f7: sipush 10542
      // 0fa: sipush -31810
      // 0fd: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 100: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 103: athrow
      // 104: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: invokevirtual com/finalshell/core/U9.C$char ()C
      // 10c: pop
      // 10d: aload 0
      // 10e: iload 1
      // 10f: ifne 2a6
      // 112: getfield com/finalshell/core/U9.l C
      // 115: sipush 29249
      // 118: ldc2_w 7137332647309389638
      // 11b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: if_icmpeq 29e
      // 128: aload 0
      // 129: iload 1
      // 12a: ifne 2a6
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: getfield com/finalshell/core/U9.l C
      // 137: sipush 26927
      // 13a: ldc2_w 6101958691031889140
      // 13d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 140: if_icmpeq 29e
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 149: athrow
      // 14a: aload 0
      // 14b: iload 1
      // 14c: ifne 2a6
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: getfield com/finalshell/core/U9.l C
      // 159: sipush 19055
      // 15c: ldc2_w 4512167536073611060
      // 15f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 162: if_icmpeq 29e
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 0
      // 16d: iload 1
      // 16e: ifne 2a6
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: getfield com/finalshell/core/U9.l C
      // 17b: sipush 30337
      // 17e: ldc2_w 2029800848590515112
      // 181: invokestatic com/finalshell/core/U9.a (IJ)I
      // 184: if_icmpeq 29e
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 0
      // 18f: iload 1
      // 190: ifne 2a6
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: getfield com/finalshell/core/U9.l C
      // 19d: sipush 20042
      // 1a0: ldc2_w 3417458310621139759
      // 1a3: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1a6: if_icmpeq 29e
      // 1a9: goto 1b0
      // 1ac: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: iload 1
      // 1b2: ifne 2a6
      // 1b5: goto 1bc
      // 1b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: getfield com/finalshell/core/U9.l C
      // 1bf: sipush 9068
      // 1c2: ldc2_w 2351417879441768059
      // 1c5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c8: if_icmpeq 29e
      // 1cb: goto 1d2
      // 1ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: iload 1
      // 1d4: ifne 2a6
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: getfield com/finalshell/core/U9.l C
      // 1e1: sipush 27424
      // 1e4: ldc2_w 1737741129686758975
      // 1e7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ea: if_icmpeq 29e
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: iload 1
      // 1f6: ifne 2a6
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: getfield com/finalshell/core/U9.l C
      // 203: sipush 25442
      // 206: ldc2_w 1159842815932841497
      // 209: invokestatic com/finalshell/core/U9.a (IJ)I
      // 20c: if_icmpeq 29e
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: aload 0
      // 217: iload 1
      // 218: ifne 2a6
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: getfield com/finalshell/core/U9.l C
      // 225: sipush 16823
      // 228: ldc2_w 1966285255030480114
      // 22b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 22e: if_icmpeq 29e
      // 231: goto 238
      // 234: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 237: athrow
      // 238: aload 0
      // 239: iload 1
      // 23a: ifne 2a6
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: getfield com/finalshell/core/U9.l C
      // 247: sipush 4645
      // 24a: ldc2_w 5237133398926479215
      // 24d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 250: if_icmpeq 29e
      // 253: goto 25a
      // 256: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: aload 0
      // 25b: iload 1
      // 25c: ifne 2a6
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: getfield com/finalshell/core/U9.l C
      // 269: sipush 22293
      // 26c: ldc2_w 4100636094053386870
      // 26f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 272: if_icmpeq 29e
      // 275: goto 27c
      // 278: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27b: athrow
      // 27c: aload 0
      // 27d: iload 1
      // 27e: ifne 2a6
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: getfield com/finalshell/core/U9.l C
      // 28b: sipush 6002
      // 28e: ldc2_w 7476916750800669247
      // 291: invokestatic com/finalshell/core/U9.a (IJ)I
      // 294: if_icmpne 2b6
      // 297: goto 29e
      // 29a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29d: athrow
      // 29e: aload 0
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: sipush 20634
      // 2a9: ldc2_w 1306501616152939915
      // 2ac: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2af: putfield com/finalshell/core/U9.Y I
      // 2b2: iload 1
      // 2b3: ifeq 2cb
      // 2b6: new com/finalshell/core/Hi2
      // 2b9: dup
      // 2ba: sipush 10552
      // 2bd: sipush -25200
      // 2c0: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 2c3: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2c6: athrow
      // 2c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: return
   }

   public final void D() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield com/finalshell/core/U9.d I
      // 005: bipush 1
      // 006: isub
      // 007: putfield com/finalshell/core/U9.S I
      // 00a: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 00d: aload 0
      // 00e: bipush 0
      // 00f: putfield com/finalshell/core/U9.L Z
      // 012: istore 1
      // 013: aload 0
      // 014: dup
      // 015: getfield com/finalshell/core/U9.e I
      // 018: bipush 1
      // 019: iadd
      // 01a: putfield com/finalshell/core/U9.e I
      // 01d: aload 0
      // 01e: invokevirtual com/finalshell/core/U9.C$char ()C
      // 021: pop
      // 022: aload 0
      // 023: getfield com/finalshell/core/U9.l C
      // 026: invokestatic java/lang/Character.isLetterOrDigit (C)Z
      // 029: ifeq 030
      // 02c: iload 1
      // 02d: ifne 013
      // 030: aload 0
      // 031: invokevirtual com/finalshell/core/U9.z ()Ljava/lang/String;
      // 034: astore 2
      // 035: sipush 10499
      // 038: sipush -16745
      // 03b: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 03e: aload 2
      // 03f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 042: iload 1
      // 043: ifeq 07c
      // 046: ifeq 068
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: aload 0
      // 051: sipush 16265
      // 054: ldc2_w 35568148908106386
      // 057: invokestatic com/finalshell/core/U9.a (IJ)I
      // 05a: putfield com/finalshell/core/U9.Y I
      // 05d: iload 1
      // 05e: ifne 1cd
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: sipush 10541
      // 06b: sipush 17621
      // 06e: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 071: aload 2
      // 072: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: iload 1
      // 07d: ifeq 0b6
      // 080: ifeq 0a2
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 0
      // 08b: sipush 28233
      // 08e: ldc2_w 5739983667078181753
      // 091: invokestatic com/finalshell/core/U9.a (IJ)I
      // 094: putfield com/finalshell/core/U9.Y I
      // 097: iload 1
      // 098: ifne 1cd
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: sipush 10529
      // 0a5: sipush 4313
      // 0a8: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0ab: aload 2
      // 0ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: iload 1
      // 0b7: ifeq 0f0
      // 0ba: ifeq 0dc
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: sipush 3944
      // 0c8: ldc2_w 2225081863752602224
      // 0cb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ce: putfield com/finalshell/core/U9.Y I
      // 0d1: iload 1
      // 0d2: ifne 1cd
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: sipush 10546
      // 0df: sipush 1358
      // 0e2: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 0e5: aload 2
      // 0e6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: iload 1
      // 0f1: ifeq 12a
      // 0f4: ifeq 116
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: sipush 22600
      // 102: ldc2_w 9208633943651026235
      // 105: invokestatic com/finalshell/core/U9.a (IJ)I
      // 108: putfield com/finalshell/core/U9.Y I
      // 10b: iload 1
      // 10c: ifne 1cd
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: sipush 10538
      // 119: sipush -17278
      // 11c: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 11f: aload 2
      // 120: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: iload 1
      // 12b: ifeq 164
      // 12e: ifeq 150
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 0
      // 139: sipush 19708
      // 13c: ldc2_w 6452238752883675609
      // 13f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 142: putfield com/finalshell/core/U9.Y I
      // 145: iload 1
      // 146: ifne 1cd
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: sipush 10511
      // 153: sipush 25037
      // 156: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 159: aload 2
      // 15a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: iload 1
      // 165: ifeq 19e
      // 168: ifeq 18a
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 0
      // 173: sipush 7609
      // 176: ldc2_w 8745918760387363013
      // 179: invokestatic com/finalshell/core/U9.a (IJ)I
      // 17c: putfield com/finalshell/core/U9.Y I
      // 17f: iload 1
      // 180: ifne 1cd
      // 183: goto 18a
      // 186: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: sipush 10545
      // 18d: sipush -15664
      // 190: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 193: aload 2
      // 194: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: ifeq 1b9
      // 1a1: aload 0
      // 1a2: sipush 9795
      // 1a5: ldc2_w 8743812529414339399
      // 1a8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ab: putfield com/finalshell/core/U9.Y I
      // 1ae: iload 1
      // 1af: ifne 1cd
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: sipush 3728
      // 1bd: ldc2_w 2887857698909475834
      // 1c0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c3: putfield com/finalshell/core/U9.Y I
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: return
   }

   @Override
   public abstract String z();

   public abstract String R(int var1, int var2);

   public abstract char[] s(int var1, int var2);

   public static String M(char[] param0, int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: iload 1
      // 004: newarray 5
      // 006: astore 3
      // 007: bipush 0
      // 008: istore 4
      // 00a: bipush 0
      // 00b: istore 5
      // 00d: istore 2
      // 00e: iload 5
      // 010: iload 1
      // 011: if_icmpge 41f
      // 014: aload 0
      // 015: iload 5
      // 017: caload
      // 018: istore 6
      // 01a: iload 6
      // 01c: iload 2
      // 01d: ifne 05d
      // 020: sipush 30531
      // 023: ldc2_w 4175784576570993226
      // 026: invokestatic com/finalshell/core/U9.a (IJ)I
      // 029: if_icmpeq 047
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 3
      // 034: iload 4
      // 036: iinc 4 1
      // 039: iload 6
      // 03b: castore
      // 03c: iload 2
      // 03d: ifeq 418
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: iinc 5 1
      // 04b: iload 5
      // 04d: caload
      // 04e: istore 6
      // 050: iload 2
      // 051: ifne 1d7
      // 054: iload 6
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: tableswitch 934 34 120 693 934 934 934 934 720 934 934 934 934 934 934 934 747 363 382 401 420 439 458 477 504 934 934 934 934 934 934 934 934 934 934 934 934 934 934 639 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 934 774 934 934 934 934 934 531 934 934 934 639 934 934 934 934 934 934 934 585 934 934 934 666 934 558 853 612 934 801
      // 1c8: aload 3
      // 1c9: iload 4
      // 1cb: iinc 4 1
      // 1ce: bipush 0
      // 1cf: castore
      // 1d0: goto 1d7
      // 1d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: iload 2
      // 1d8: ifeq 418
      // 1db: aload 3
      // 1dc: iload 4
      // 1de: iinc 4 1
      // 1e1: bipush 1
      // 1e2: castore
      // 1e3: iload 2
      // 1e4: ifeq 418
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: aload 3
      // 1ef: iload 4
      // 1f1: iinc 4 1
      // 1f4: bipush 2
      // 1f5: castore
      // 1f6: iload 2
      // 1f7: ifeq 418
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: aload 3
      // 202: iload 4
      // 204: iinc 4 1
      // 207: bipush 3
      // 208: castore
      // 209: iload 2
      // 20a: ifeq 418
      // 20d: goto 214
      // 210: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: aload 3
      // 215: iload 4
      // 217: iinc 4 1
      // 21a: bipush 4
      // 21b: castore
      // 21c: iload 2
      // 21d: ifeq 418
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 226: athrow
      // 227: aload 3
      // 228: iload 4
      // 22a: iinc 4 1
      // 22d: bipush 5
      // 22e: castore
      // 22f: iload 2
      // 230: ifeq 418
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: aload 3
      // 23b: iload 4
      // 23d: iinc 4 1
      // 240: sipush 3944
      // 243: ldc2_w 2225081863752602224
      // 246: invokestatic com/finalshell/core/U9.a (IJ)I
      // 249: castore
      // 24a: iload 2
      // 24b: ifeq 418
      // 24e: goto 255
      // 251: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 254: athrow
      // 255: aload 3
      // 256: iload 4
      // 258: iinc 4 1
      // 25b: sipush 22600
      // 25e: ldc2_w 9208633943651026235
      // 261: invokestatic com/finalshell/core/U9.a (IJ)I
      // 264: castore
      // 265: iload 2
      // 266: ifeq 418
      // 269: goto 270
      // 26c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 3
      // 271: iload 4
      // 273: iinc 4 1
      // 276: sipush 16265
      // 279: ldc2_w 35568148908106386
      // 27c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 27f: castore
      // 280: iload 2
      // 281: ifeq 418
      // 284: goto 28b
      // 287: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28a: athrow
      // 28b: aload 3
      // 28c: iload 4
      // 28e: iinc 4 1
      // 291: sipush 28233
      // 294: ldc2_w 5739983667078181753
      // 297: invokestatic com/finalshell/core/U9.a (IJ)I
      // 29a: castore
      // 29b: iload 2
      // 29c: ifeq 418
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: aload 3
      // 2a7: iload 4
      // 2a9: iinc 4 1
      // 2ac: sipush 1861
      // 2af: ldc2_w 5349631099953699429
      // 2b2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2b5: castore
      // 2b6: iload 2
      // 2b7: ifeq 418
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c0: athrow
      // 2c1: aload 3
      // 2c2: iload 4
      // 2c4: iinc 4 1
      // 2c7: sipush 32041
      // 2ca: ldc2_w 2283178923427340345
      // 2cd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d0: castore
      // 2d1: iload 2
      // 2d2: ifeq 418
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: aload 3
      // 2dd: iload 4
      // 2df: iinc 4 1
      // 2e2: sipush 16823
      // 2e5: ldc2_w 1966285255030480114
      // 2e8: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2eb: castore
      // 2ec: iload 2
      // 2ed: ifeq 418
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f6: athrow
      // 2f7: aload 3
      // 2f8: iload 4
      // 2fa: iinc 4 1
      // 2fd: sipush 16923
      // 300: ldc2_w 1571494982232874791
      // 303: invokestatic com/finalshell/core/U9.a (IJ)I
      // 306: castore
      // 307: iload 2
      // 308: ifeq 418
      // 30b: goto 312
      // 30e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 311: athrow
      // 312: aload 3
      // 313: iload 4
      // 315: iinc 4 1
      // 318: sipush 26107
      // 31b: ldc2_w 2081374444732725480
      // 31e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 321: castore
      // 322: iload 2
      // 323: ifeq 418
      // 326: goto 32d
      // 329: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32c: athrow
      // 32d: aload 3
      // 32e: iload 4
      // 330: iinc 4 1
      // 333: sipush 15280
      // 336: ldc2_w 3357099522267637465
      // 339: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33c: castore
      // 33d: iload 2
      // 33e: ifeq 418
      // 341: goto 348
      // 344: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 347: athrow
      // 348: aload 3
      // 349: iload 4
      // 34b: iinc 4 1
      // 34e: sipush 9180
      // 351: ldc2_w 6298462668578782968
      // 354: invokestatic com/finalshell/core/U9.a (IJ)I
      // 357: castore
      // 358: iload 2
      // 359: ifeq 418
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: aload 3
      // 364: iload 4
      // 366: iinc 4 1
      // 369: sipush 30531
      // 36c: ldc2_w 4175784576570993226
      // 36f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 372: castore
      // 373: iload 2
      // 374: ifeq 418
      // 377: goto 37e
      // 37a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37d: athrow
      // 37e: aload 3
      // 37f: iload 4
      // 381: iinc 4 1
      // 384: getstatic com/finalshell/core/U9.K [I
      // 387: aload 0
      // 388: iinc 5 1
      // 38b: iload 5
      // 38d: caload
      // 38e: iaload
      // 38f: sipush 9361
      // 392: ldc2_w 2488456831667599749
      // 395: invokestatic com/finalshell/core/U9.a (IJ)I
      // 398: imul
      // 399: getstatic com/finalshell/core/U9.K [I
      // 39c: aload 0
      // 39d: iinc 5 1
      // 3a0: iload 5
      // 3a2: caload
      // 3a3: iaload
      // 3a4: iadd
      // 3a5: i2c
      // 3a6: castore
      // 3a7: iload 2
      // 3a8: ifeq 418
      // 3ab: goto 3b2
      // 3ae: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b1: athrow
      // 3b2: aload 3
      // 3b3: iload 4
      // 3b5: iinc 4 1
      // 3b8: new java/lang/String
      // 3bb: dup
      // 3bc: bipush 4
      // 3bd: newarray 5
      // 3bf: dup
      // 3c0: bipush 0
      // 3c1: aload 0
      // 3c2: iinc 5 1
      // 3c5: iload 5
      // 3c7: caload
      // 3c8: castore
      // 3c9: dup
      // 3ca: bipush 1
      // 3cb: aload 0
      // 3cc: iinc 5 1
      // 3cf: iload 5
      // 3d1: caload
      // 3d2: castore
      // 3d3: dup
      // 3d4: bipush 2
      // 3d5: aload 0
      // 3d6: iinc 5 1
      // 3d9: iload 5
      // 3db: caload
      // 3dc: castore
      // 3dd: dup
      // 3de: bipush 3
      // 3df: aload 0
      // 3e0: iinc 5 1
      // 3e3: iload 5
      // 3e5: caload
      // 3e6: castore
      // 3e7: invokespecial java/lang/String.<init> ([C)V
      // 3ea: sipush 9361
      // 3ed: ldc2_w 2488456831667599749
      // 3f0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3f3: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 3f6: i2c
      // 3f7: castore
      // 3f8: iload 2
      // 3f9: ifeq 418
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: new com/finalshell/core/Hi2
      // 406: dup
      // 407: sipush 10530
      // 40a: sipush -20210
      // 40d: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 410: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 413: athrow
      // 414: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 417: athrow
      // 418: iinc 5 1
      // 41b: iload 2
      // 41c: ifeq 00e
      // 41f: new java/lang/String
      // 422: dup
      // 423: aload 3
      // 424: bipush 0
      // 425: iload 4
      // 427: invokespecial java/lang/String.<init> ([CII)V
      // 42a: areturn
   }

   public abstract boolean P$boolean(char[] var1);

   @Override
   public boolean k() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: aload 0
      // 07: iload 2
      // 08: invokevirtual com/finalshell/core/U9.C (I)C
      // 0b: istore 3
      // 0c: iload 3
      // 0d: sipush 2765
      // 10: ldc2_w 8216137057917720563
      // 13: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16: if_icmpne 35
      // 19: aload 0
      // 1a: sipush 9907
      // 1d: ldc2_w 514190805586246625
      // 20: invokestatic com/finalshell/core/U9.a (IJ)I
      // 23: putfield com/finalshell/core/U9.Y I
      // 26: iload 1
      // 27: ifne 53
      // 2a: iload 1
      // 2b: ifeq 57
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: iload 3
      // 36: invokestatic com/finalshell/core/U9.Y (C)Z
      // 39: iload 1
      // 3a: ifne 4f
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: ifne 50
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: iinc 2 1
      // 53: iload 1
      // 54: ifeq 06
      // 57: bipush 1
      // 58: ireturn
   }

   @Override
   public final void N() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.l C
      // 008: sipush 9180
      // 00b: ldc2_w 6298462668578782968
      // 00e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 011: if_icmpgt 10c
      // 014: aload 0
      // 015: getfield com/finalshell/core/U9.l C
      // 018: iload 1
      // 019: ifne 0e4
      // 01c: sipush 18572
      // 01f: ldc2_w 5664846119839831378
      // 022: invokestatic com/finalshell/core/U9.a (IJ)I
      // 025: if_icmpeq 0d9
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield com/finalshell/core/U9.l C
      // 033: iload 1
      // 034: ifne 0e4
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: sipush 16923
      // 041: ldc2_w 1571494982232874791
      // 044: invokestatic com/finalshell/core/U9.a (IJ)I
      // 047: if_icmpeq 0d9
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: getfield com/finalshell/core/U9.l C
      // 055: iload 1
      // 056: ifne 0e4
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: sipush 1861
      // 063: ldc2_w 5349631099953699429
      // 066: invokestatic com/finalshell/core/U9.a (IJ)I
      // 069: if_icmpeq 0d9
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 0
      // 074: getfield com/finalshell/core/U9.l C
      // 077: iload 1
      // 078: ifne 0e4
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: sipush 28233
      // 085: ldc2_w 5739983667078181753
      // 088: invokestatic com/finalshell/core/U9.a (IJ)I
      // 08b: if_icmpeq 0d9
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 0
      // 096: getfield com/finalshell/core/U9.l C
      // 099: iload 1
      // 09a: ifne 0e4
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: sipush 16823
      // 0a7: ldc2_w 1966285255030480114
      // 0aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ad: if_icmpeq 0d9
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield com/finalshell/core/U9.l C
      // 0bb: sipush 16265
      // 0be: ldc2_w 35568148908106386
      // 0c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c4: iload 1
      // 0c5: ifne 101
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: if_icmpne 0e9
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: pop
      // 0e5: iload 1
      // 0e6: ifeq 004
      // 0e9: aload 0
      // 0ea: iload 1
      // 0eb: ifne 105
      // 0ee: getfield com/finalshell/core/U9.l C
      // 0f1: sipush 9180
      // 0f4: ldc2_w 6298462668578782968
      // 0f7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: if_icmpne 10c
      // 104: aload 0
      // 105: invokevirtual com/finalshell/core/U9.F ()V
      // 108: iload 1
      // 109: ifeq 004
      // 10c: return
   }

   public void l() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield com/finalshell/core/U9.d I
      // 005: putfield com/finalshell/core/U9.S I
      // 008: invokestatic com/finalshell/core/Yn4.o ()Z
      // 00b: aload 0
      // 00c: bipush 0
      // 00d: putfield com/finalshell/core/U9.L Z
      // 010: istore 1
      // 011: aload 0
      // 012: invokevirtual com/finalshell/core/U9.C$char ()C
      // 015: istore 2
      // 016: iload 2
      // 017: sipush 15280
      // 01a: ldc2_w 3357099522267637465
      // 01d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 020: if_icmpne 032
      // 023: iload 1
      // 024: ifne 093
      // 027: iload 1
      // 028: ifeq 631
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: iload 2
      // 033: sipush 2765
      // 036: ldc2_w 8216137057917720563
      // 039: invokestatic com/finalshell/core/U9.a (IJ)I
      // 03c: iload 1
      // 03d: ifne 0a8
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: if_icmpne 093
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: iload 1
      // 053: ifne 072
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: invokevirtual com/finalshell/core/U9.A$boolean ()Z
      // 060: ifne 082
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 0
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: sipush 2765
      // 075: ldc2_w 8216137057917720563
      // 078: invokestatic com/finalshell/core/U9.a (IJ)I
      // 07b: invokevirtual com/finalshell/core/U9.x (C)V
      // 07e: iload 1
      // 07f: ifeq 011
      // 082: new com/finalshell/core/Hi2
      // 085: dup
      // 086: sipush 10507
      // 089: sipush -10797
      // 08c: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 08f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 092: athrow
      // 093: iload 2
      // 094: iload 1
      // 095: ifne 5d2
      // 098: sipush 30531
      // 09b: ldc2_w 4175784576570993226
      // 09e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: if_icmpne 5ce
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/U9.L Z
      // 0af: iload 1
      // 0b0: ifne 127
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: ifne 116
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: bipush 1
      // 0c6: putfield com/finalshell/core/U9.L Z
      // 0c9: aload 0
      // 0ca: iload 1
      // 0cb: ifne 105
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: getfield com/finalshell/core/U9.e I
      // 0d8: aload 0
      // 0d9: getfield com/finalshell/core/U9.V [C
      // 0dc: arraylength
      // 0dd: if_icmple 104
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/core/U9.e I
      // 0eb: bipush 2
      // 0ec: imul
      // 0ed: newarray 5
      // 0ef: astore 3
      // 0f0: aload 0
      // 0f1: getfield com/finalshell/core/U9.V [C
      // 0f4: bipush 0
      // 0f5: aload 3
      // 0f6: bipush 0
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/U9.V [C
      // 0fb: arraylength
      // 0fc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ff: aload 0
      // 100: aload 3
      // 101: putfield com/finalshell/core/U9.V [C
      // 104: aload 0
      // 105: aload 0
      // 106: getfield com/finalshell/core/U9.S I
      // 109: bipush 1
      // 10a: iadd
      // 10b: aload 0
      // 10c: getfield com/finalshell/core/U9.e I
      // 10f: aload 0
      // 110: getfield com/finalshell/core/U9.V [C
      // 113: invokevirtual com/finalshell/core/U9.l (II[C)V
      // 116: aload 0
      // 117: invokevirtual com/finalshell/core/U9.C$char ()C
      // 11a: istore 2
      // 11b: iload 1
      // 11c: ifne 5bd
      // 11f: iload 2
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: tableswitch 1169 34 120 558 1169 1169 1169 1169 575 1169 1169 1169 1169 1169 1169 1169 592 361 377 386 395 404 413 422 439 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 524 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 1169 609 1169 1169 1169 1169 1169 456 1169 1169 1169 524 1169 1169 1169 1169 1169 1169 1169 490 1169 1169 1169 541 1169 473 1110 507 1169 626
      // 290: aload 0
      // 291: bipush 0
      // 292: invokevirtual com/finalshell/core/U9.x (C)V
      // 295: iload 1
      // 296: ifeq 011
      // 299: goto 2a0
      // 29c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: bipush 1
      // 2a2: invokevirtual com/finalshell/core/U9.x (C)V
      // 2a5: iload 1
      // 2a6: ifeq 011
      // 2a9: aload 0
      // 2aa: bipush 2
      // 2ab: invokevirtual com/finalshell/core/U9.x (C)V
      // 2ae: iload 1
      // 2af: ifeq 011
      // 2b2: aload 0
      // 2b3: bipush 3
      // 2b4: invokevirtual com/finalshell/core/U9.x (C)V
      // 2b7: iload 1
      // 2b8: ifeq 011
      // 2bb: aload 0
      // 2bc: bipush 4
      // 2bd: invokevirtual com/finalshell/core/U9.x (C)V
      // 2c0: iload 1
      // 2c1: ifeq 011
      // 2c4: aload 0
      // 2c5: bipush 5
      // 2c6: invokevirtual com/finalshell/core/U9.x (C)V
      // 2c9: iload 1
      // 2ca: ifeq 011
      // 2cd: aload 0
      // 2ce: sipush 3944
      // 2d1: ldc2_w 2225081863752602224
      // 2d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2d7: invokevirtual com/finalshell/core/U9.x (C)V
      // 2da: iload 1
      // 2db: ifeq 011
      // 2de: aload 0
      // 2df: sipush 22600
      // 2e2: ldc2_w 9208633943651026235
      // 2e5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2e8: invokevirtual com/finalshell/core/U9.x (C)V
      // 2eb: iload 1
      // 2ec: ifeq 011
      // 2ef: aload 0
      // 2f0: sipush 16265
      // 2f3: ldc2_w 35568148908106386
      // 2f6: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2f9: invokevirtual com/finalshell/core/U9.x (C)V
      // 2fc: iload 1
      // 2fd: ifeq 011
      // 300: aload 0
      // 301: sipush 28233
      // 304: ldc2_w 5739983667078181753
      // 307: invokestatic com/finalshell/core/U9.a (IJ)I
      // 30a: invokevirtual com/finalshell/core/U9.x (C)V
      // 30d: iload 1
      // 30e: ifeq 011
      // 311: aload 0
      // 312: sipush 1861
      // 315: ldc2_w 5349631099953699429
      // 318: invokestatic com/finalshell/core/U9.a (IJ)I
      // 31b: invokevirtual com/finalshell/core/U9.x (C)V
      // 31e: iload 1
      // 31f: ifeq 011
      // 322: aload 0
      // 323: sipush 32041
      // 326: ldc2_w 2283178923427340345
      // 329: invokestatic com/finalshell/core/U9.a (IJ)I
      // 32c: invokevirtual com/finalshell/core/U9.x (C)V
      // 32f: iload 1
      // 330: ifeq 011
      // 333: aload 0
      // 334: sipush 16823
      // 337: ldc2_w 1966285255030480114
      // 33a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 33d: invokevirtual com/finalshell/core/U9.x (C)V
      // 340: iload 1
      // 341: ifeq 011
      // 344: aload 0
      // 345: sipush 16923
      // 348: ldc2_w 1571494982232874791
      // 34b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 34e: invokevirtual com/finalshell/core/U9.x (C)V
      // 351: iload 1
      // 352: ifeq 011
      // 355: aload 0
      // 356: sipush 26107
      // 359: ldc2_w 2081374444732725480
      // 35c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 35f: invokevirtual com/finalshell/core/U9.x (C)V
      // 362: iload 1
      // 363: ifeq 011
      // 366: aload 0
      // 367: sipush 15280
      // 36a: ldc2_w 3357099522267637465
      // 36d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 370: invokevirtual com/finalshell/core/U9.x (C)V
      // 373: iload 1
      // 374: ifeq 011
      // 377: aload 0
      // 378: sipush 9180
      // 37b: ldc2_w 6298462668578782968
      // 37e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 381: invokevirtual com/finalshell/core/U9.x (C)V
      // 384: iload 1
      // 385: ifeq 011
      // 388: aload 0
      // 389: sipush 30531
      // 38c: ldc2_w 4175784576570993226
      // 38f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 392: invokevirtual com/finalshell/core/U9.x (C)V
      // 395: iload 1
      // 396: ifeq 011
      // 399: aload 0
      // 39a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 39d: istore 3
      // 39e: aload 0
      // 39f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3a2: istore 4
      // 3a4: iload 3
      // 3a5: sipush 21259
      // 3a8: ldc2_w 1287927339301015045
      // 3ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3ae: iload 1
      // 3af: ifne 3ec
      // 3b2: if_icmplt 3db
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: iload 3
      // 3bd: iload 1
      // 3be: ifne 458
      // 3c1: goto 3c8
      // 3c4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c7: athrow
      // 3c8: sipush 24153
      // 3cb: ldc2_w 3168790736949871469
      // 3ce: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3d1: if_icmple 457
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: iload 3
      // 3dc: sipush 31880
      // 3df: ldc2_w 6345766455927677411
      // 3e2: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3eb: athrow
      // 3ec: iload 1
      // 3ed: ifne 42a
      // 3f0: if_icmplt 419
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f9: athrow
      // 3fa: iload 3
      // 3fb: iload 1
      // 3fc: ifne 458
      // 3ff: goto 406
      // 402: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 405: athrow
      // 406: sipush 23709
      // 409: ldc2_w 6885726342037307881
      // 40c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 40f: if_icmple 457
      // 412: goto 419
      // 415: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 418: athrow
      // 419: iload 3
      // 41a: sipush 31506
      // 41d: ldc2_w 427738362136340011
      // 420: invokestatic com/finalshell/core/U9.a (IJ)I
      // 423: goto 42a
      // 426: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 429: athrow
      // 42a: iload 1
      // 42b: ifne 454
      // 42e: if_icmplt 45b
      // 431: goto 438
      // 434: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 437: athrow
      // 438: iload 3
      // 439: iload 1
      // 43a: ifne 458
      // 43d: goto 444
      // 440: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 443: athrow
      // 444: sipush 17399
      // 447: ldc2_w 8707971467972353759
      // 44a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 44d: goto 454
      // 450: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 453: athrow
      // 454: if_icmpgt 45b
      // 457: bipush 1
      // 458: goto 45c
      // 45b: bipush 0
      // 45c: istore 5
      // 45e: iload 4
      // 460: sipush 21259
      // 463: ldc2_w 1287927339301015045
      // 466: invokestatic com/finalshell/core/U9.a (IJ)I
      // 469: iload 1
      // 46a: ifne 4a9
      // 46d: if_icmplt 497
      // 470: goto 477
      // 473: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 476: athrow
      // 477: iload 4
      // 479: iload 1
      // 47a: ifne 518
      // 47d: goto 484
      // 480: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 483: athrow
      // 484: sipush 24153
      // 487: ldc2_w 3168790736949871469
      // 48a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 48d: if_icmple 517
      // 490: goto 497
      // 493: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 496: athrow
      // 497: iload 4
      // 499: sipush 31880
      // 49c: ldc2_w 6345766455927677411
      // 49f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4a2: goto 4a9
      // 4a5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a8: athrow
      // 4a9: iload 1
      // 4aa: ifne 4e9
      // 4ad: if_icmplt 4d7
      // 4b0: goto 4b7
      // 4b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b6: athrow
      // 4b7: iload 4
      // 4b9: iload 1
      // 4ba: ifne 518
      // 4bd: goto 4c4
      // 4c0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c3: athrow
      // 4c4: sipush 23709
      // 4c7: ldc2_w 6885726342037307881
      // 4ca: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4cd: if_icmple 517
      // 4d0: goto 4d7
      // 4d3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d6: athrow
      // 4d7: iload 4
      // 4d9: sipush 31506
      // 4dc: ldc2_w 427738362136340011
      // 4df: invokestatic com/finalshell/core/U9.a (IJ)I
      // 4e2: goto 4e9
      // 4e5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e8: athrow
      // 4e9: iload 1
      // 4ea: ifne 514
      // 4ed: if_icmplt 51b
      // 4f0: goto 4f7
      // 4f3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f6: athrow
      // 4f7: iload 4
      // 4f9: iload 1
      // 4fa: ifne 518
      // 4fd: goto 504
      // 500: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 503: athrow
      // 504: sipush 17399
      // 507: ldc2_w 8707971467972353759
      // 50a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 50d: goto 514
      // 510: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: if_icmpgt 51b
      // 517: bipush 1
      // 518: goto 51c
      // 51b: bipush 0
      // 51c: istore 6
      // 51e: iload 5
      // 520: iload 1
      // 521: ifne 530
      // 524: ifeq 533
      // 527: goto 52e
      // 52a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52d: athrow
      // 52e: iload 6
      // 530: ifne 55e
      // 533: new com/finalshell/core/Hi2
      // 536: dup
      // 537: new java/lang/StringBuilder
      // 53a: dup
      // 53b: invokespecial java/lang/StringBuilder.<init> ()V
      // 53e: sipush 10506
      // 541: sipush -30371
      // 544: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 547: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54a: iload 3
      // 54b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 54e: iload 4
      // 550: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 553: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 556: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 559: athrow
      // 55a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55d: athrow
      // 55e: aload 0
      // 55f: getstatic com/finalshell/core/U9.K [I
      // 562: iload 3
      // 563: iaload
      // 564: sipush 9361
      // 567: ldc2_w 2488456831667599749
      // 56a: invokestatic com/finalshell/core/U9.a (IJ)I
      // 56d: imul
      // 56e: getstatic com/finalshell/core/U9.K [I
      // 571: iload 4
      // 573: iaload
      // 574: iadd
      // 575: i2c
      // 576: invokevirtual com/finalshell/core/U9.x (C)V
      // 579: iload 1
      // 57a: ifeq 011
      // 57d: aload 0
      // 57e: new java/lang/String
      // 581: dup
      // 582: bipush 4
      // 583: newarray 5
      // 585: dup
      // 586: bipush 0
      // 587: aload 0
      // 588: invokevirtual com/finalshell/core/U9.C$char ()C
      // 58b: castore
      // 58c: dup
      // 58d: bipush 1
      // 58e: aload 0
      // 58f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 592: castore
      // 593: dup
      // 594: bipush 2
      // 595: aload 0
      // 596: invokevirtual com/finalshell/core/U9.C$char ()C
      // 599: castore
      // 59a: dup
      // 59b: bipush 3
      // 59c: aload 0
      // 59d: invokevirtual com/finalshell/core/U9.C$char ()C
      // 5a0: castore
      // 5a1: invokespecial java/lang/String.<init> ([C)V
      // 5a4: sipush 9361
      // 5a7: ldc2_w 2488456831667599749
      // 5aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // 5ad: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 5b0: i2c
      // 5b1: invokevirtual com/finalshell/core/U9.x (C)V
      // 5b4: iload 1
      // 5b5: ifeq 011
      // 5b8: aload 0
      // 5b9: iload 2
      // 5ba: putfield com/finalshell/core/U9.l C
      // 5bd: new com/finalshell/core/Hi2
      // 5c0: dup
      // 5c1: sipush 10554
      // 5c4: sipush -5787
      // 5c7: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 5ca: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 5cd: athrow
      // 5ce: aload 0
      // 5cf: getfield com/finalshell/core/U9.L Z
      // 5d2: iload 1
      // 5d3: ifne 604
      // 5d6: ifne 5f5
      // 5d9: goto 5e0
      // 5dc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5df: athrow
      // 5e0: aload 0
      // 5e1: dup
      // 5e2: getfield com/finalshell/core/U9.e I
      // 5e5: bipush 1
      // 5e6: iadd
      // 5e7: putfield com/finalshell/core/U9.e I
      // 5ea: iload 1
      // 5eb: ifeq 011
      // 5ee: goto 5f5
      // 5f1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f4: athrow
      // 5f5: aload 0
      // 5f6: iload 1
      // 5f7: ifne 61d
      // 5fa: getfield com/finalshell/core/U9.e I
      // 5fd: goto 604
      // 600: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 603: athrow
      // 604: aload 0
      // 605: getfield com/finalshell/core/U9.V [C
      // 608: arraylength
      // 609: if_icmpne 61c
      // 60c: aload 0
      // 60d: iload 2
      // 60e: invokevirtual com/finalshell/core/U9.x (C)V
      // 611: iload 1
      // 612: ifeq 011
      // 615: goto 61c
      // 618: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61b: athrow
      // 61c: aload 0
      // 61d: getfield com/finalshell/core/U9.V [C
      // 620: aload 0
      // 621: dup
      // 622: getfield com/finalshell/core/U9.e I
      // 625: dup_x1
      // 626: bipush 1
      // 627: iadd
      // 628: putfield com/finalshell/core/U9.e I
      // 62b: iload 2
      // 62c: castore
      // 62d: iload 1
      // 62e: ifeq 011
      // 631: aload 0
      // 632: sipush 2897
      // 635: ldc2_w 695568451002816123
      // 638: invokestatic com/finalshell/core/U9.a (IJ)I
      // 63b: putfield com/finalshell/core/U9.Y I
      // 63e: aload 0
      // 63f: invokevirtual com/finalshell/core/U9.C$char ()C
      // 642: pop
      // 643: return
   }

   public final void x(char var1) {
      int var7;
      boolean var2 = Yn4.o();

      U9 var10000;
      label39: {
         label43: {
            try {
               var10000 = this;
               if (var2) {
                  break label39;
               }

               if (this.e < this.V.length) {
                  break label43;
               }
            } catch (Hi2 var6) {
               throw a(var6);
            }

            int var3 = this.V.length * 2;

            label31: {
               label30: {
                  try {
                     var7 = var3;
                     if (var2) {
                        break label31;
                     }

                     if (var3 >= this.e) {
                        break label30;
                     }
                  } catch (Hi2 var5) {
                     throw a(var5);
                  }

                  var3 = this.e + 1;
               }

               var7 = var3;
            }

            char[] var4 = new char[var7];
            System.arraycopy(this.V, 0, var4, 0, this.V.length);
            this.V = var4;
         }

         var10000 = this;
      }

      var10000.V[this.e++] = var1;
   }

   public final void x$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.o ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.l C
      // 008: sipush 31611
      // 00b: ldc2_w 1161837634643207782
      // 00e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 011: iload 1
      // 012: ifne 05a
      // 015: if_icmpeq 048
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: new com/finalshell/core/Hi2
      // 022: dup
      // 023: new java/lang/StringBuilder
      // 026: dup
      // 027: invokespecial java/lang/StringBuilder.<init> ()V
      // 02a: sipush 10497
      // 02d: sipush -5060
      // 030: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 033: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 036: aload 0
      // 037: getfield com/finalshell/core/U9.l C
      // 03a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 03d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 040: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 043: athrow
      // 044: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: invokevirtual com/finalshell/core/U9.C$char ()C
      // 04c: pop
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/U9.l C
      // 051: sipush 15280
      // 054: ldc2_w 3357099522267637465
      // 057: invokestatic com/finalshell/core/U9.a (IJ)I
      // 05a: iload 1
      // 05b: ifne 0b6
      // 05e: if_icmpeq 091
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: new com/finalshell/core/Hi2
      // 06b: dup
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 10548
      // 076: sipush 18564
      // 079: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: aload 0
      // 080: getfield com/finalshell/core/U9.l C
      // 083: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 086: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 089: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 08c: athrow
      // 08d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 0
      // 092: aload 0
      // 093: getfield com/finalshell/core/U9.d I
      // 096: putfield com/finalshell/core/U9.S I
      // 099: aload 0
      // 09a: invokevirtual com/finalshell/core/U9.C$char ()C
      // 09d: pop
      // 09e: aload 0
      // 09f: getfield com/finalshell/core/U9.l C
      // 0a2: iload 1
      // 0a3: ifne 0d1
      // 0a6: sipush 15280
      // 0a9: ldc2_w 3357099522267637465
      // 0ac: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: if_icmpne 0d0
      // 0b9: aload 0
      // 0ba: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0bd: pop
      // 0be: aload 0
      // 0bf: sipush 2765
      // 0c2: ldc2_w 8216137057917720563
      // 0c5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0c8: putfield com/finalshell/core/U9.Y I
      // 0cb: return
      // 0cc: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: bipush 0
      // 0d1: istore 2
      // 0d2: aload 0
      // 0d3: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0d6: istore 3
      // 0d7: iload 3
      // 0d8: sipush 21259
      // 0db: ldc2_w 1287927339301015045
      // 0de: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e1: if_icmplt 107
      // 0e4: iload 3
      // 0e5: sipush 24153
      // 0e8: ldc2_w 3168790736949871469
      // 0eb: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ee: iload 1
      // 0ef: ifne 118
      // 0f2: iload 1
      // 0f3: ifne 118
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: if_icmple 145
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: iload 3
      // 108: sipush 31506
      // 10b: ldc2_w 427738362136340011
      // 10e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: iload 1
      // 119: ifne 176
      // 11c: if_icmplt 15a
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: iload 3
      // 127: sipush 17399
      // 12a: ldc2_w 8707971467972353759
      // 12d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 130: iload 1
      // 131: ifne 176
      // 134: goto 13b
      // 137: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: if_icmpgt 15a
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 0
      // 146: dup
      // 147: getfield com/finalshell/core/U9.e I
      // 14a: bipush 1
      // 14b: iadd
      // 14c: putfield com/finalshell/core/U9.e I
      // 14f: iload 1
      // 150: ifeq 1b9
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: iload 3
      // 15b: iload 1
      // 15c: ifne 18e
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: sipush 15280
      // 169: ldc2_w 3357099522267637465
      // 16c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: if_icmpne 193
      // 179: aload 0
      // 17a: dup
      // 17b: getfield com/finalshell/core/U9.e I
      // 17e: bipush 1
      // 17f: iadd
      // 180: putfield com/finalshell/core/U9.e I
      // 183: aload 0
      // 184: invokevirtual com/finalshell/core/U9.C$char ()C
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: pop
      // 18f: iload 1
      // 190: ifeq 1c0
      // 193: new com/finalshell/core/Hi2
      // 196: dup
      // 197: new java/lang/StringBuilder
      // 19a: dup
      // 19b: invokespecial java/lang/StringBuilder.<init> ()V
      // 19e: sipush 10548
      // 1a1: sipush 18564
      // 1a4: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: iload 3
      // 1ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1b4: athrow
      // 1b5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: iinc 2 1
      // 1bc: iload 1
      // 1bd: ifeq 0d2
      // 1c0: aload 0
      // 1c1: sipush 2765
      // 1c4: ldc2_w 8216137057917720563
      // 1c7: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1ca: putfield com/finalshell/core/U9.Y I
      // 1cd: return
   }

   @Override
   public final void C$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Yn4.Y ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: getfield com/finalshell/core/U9.d I
      // 008: putfield com/finalshell/core/U9.S I
      // 00b: istore 1
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/U9.l C
      // 010: sipush 19418
      // 013: ldc2_w 715321441499911916
      // 016: invokestatic com/finalshell/core/U9.a (IJ)I
      // 019: iload 1
      // 01a: ifeq 04a
      // 01d: if_icmpne 03d
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: dup
      // 029: getfield com/finalshell/core/U9.e I
      // 02c: bipush 1
      // 02d: iadd
      // 02e: putfield com/finalshell/core/U9.e I
      // 031: aload 0
      // 032: invokevirtual com/finalshell/core/U9.C$char ()C
      // 035: pop
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/U9.l C
      // 041: sipush 21259
      // 044: ldc2_w 1287927339301015045
      // 047: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04a: if_icmplt 094
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/U9.l C
      // 051: iload 1
      // 052: ifeq 095
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: iload 1
      // 05d: ifeq 095
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: sipush 24153
      // 06a: ldc2_w 3168790736949871469
      // 06d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 070: if_icmpgt 094
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: aload 0
      // 07b: dup
      // 07c: getfield com/finalshell/core/U9.e I
      // 07f: bipush 1
      // 080: iadd
      // 081: putfield com/finalshell/core/U9.e I
      // 084: aload 0
      // 085: invokevirtual com/finalshell/core/U9.C$char ()C
      // 088: pop
      // 089: iload 1
      // 08a: ifne 03d
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: bipush 0
      // 095: istore 2
      // 096: aload 0
      // 097: getfield com/finalshell/core/U9.l C
      // 09a: sipush 19110
      // 09d: ldc2_w 4854799824381581179
      // 0a0: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0a3: iload 1
      // 0a4: ifeq 11f
      // 0a7: if_icmpne 112
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: dup
      // 0b3: getfield com/finalshell/core/U9.e I
      // 0b6: bipush 1
      // 0b7: iadd
      // 0b8: putfield com/finalshell/core/U9.e I
      // 0bb: aload 0
      // 0bc: invokevirtual com/finalshell/core/U9.C$char ()C
      // 0bf: pop
      // 0c0: bipush 1
      // 0c1: istore 2
      // 0c2: aload 0
      // 0c3: getfield com/finalshell/core/U9.l C
      // 0c6: sipush 21259
      // 0c9: ldc2_w 1287927339301015045
      // 0cc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0cf: if_icmplt 112
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/U9.l C
      // 0d6: sipush 24153
      // 0d9: ldc2_w 3168790736949871469
      // 0dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0df: iload 1
      // 0e0: ifeq 11f
      // 0e3: iload 1
      // 0e4: ifeq 11f
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: if_icmpgt 112
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: dup
      // 0fa: getfield com/finalshell/core/U9.e I
      // 0fd: bipush 1
      // 0fe: iadd
      // 0ff: putfield com/finalshell/core/U9.e I
      // 102: aload 0
      // 103: invokevirtual com/finalshell/core/U9.C$char ()C
      // 106: pop
      // 107: iload 1
      // 108: ifne 0c2
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 0
      // 113: getfield com/finalshell/core/U9.e I
      // 116: sipush 28697
      // 119: ldc2_w 6865322254820814080
      // 11c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 11f: iload 1
      // 120: ifeq 14f
      // 123: if_icmple 142
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: new com/finalshell/core/Hi2
      // 130: dup
      // 131: sipush 10528
      // 134: sipush -24626
      // 137: invokestatic com/finalshell/core/U9.a (II)Ljava/lang/String;
      // 13a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 13d: athrow
      // 13e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 0
      // 143: getfield com/finalshell/core/U9.l C
      // 146: sipush 24882
      // 149: ldc2_w 2640544065015594009
      // 14c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 14f: iload 1
      // 150: ifeq 18b
      // 153: if_icmpne 177
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15c: athrow
      // 15d: aload 0
      // 15e: dup
      // 15f: getfield com/finalshell/core/U9.e I
      // 162: bipush 1
      // 163: iadd
      // 164: putfield com/finalshell/core/U9.e I
      // 167: aload 0
      // 168: invokevirtual com/finalshell/core/U9.C$char ()C
      // 16b: pop
      // 16c: iload 1
      // 16d: ifne 3b6
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: aload 0
      // 178: getfield com/finalshell/core/U9.l C
      // 17b: sipush 25916
      // 17e: ldc2_w 7342535848027207785
      // 181: invokestatic com/finalshell/core/U9.a (IJ)I
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: iload 1
      // 18c: ifeq 1c7
      // 18f: if_icmpne 1b3
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: aload 0
      // 19a: dup
      // 19b: getfield com/finalshell/core/U9.e I
      // 19e: bipush 1
      // 19f: iadd
      // 1a0: putfield com/finalshell/core/U9.e I
      // 1a3: aload 0
      // 1a4: invokevirtual com/finalshell/core/U9.C$char ()C
      // 1a7: pop
      // 1a8: iload 1
      // 1a9: ifne 3b6
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield com/finalshell/core/U9.l C
      // 1b7: sipush 28091
      // 1ba: ldc2_w 7922031995348824293
      // 1bd: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1c0: goto 1c7
      // 1c3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: iload 1
      // 1c8: ifeq 203
      // 1cb: if_icmpne 1ef
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: dup
      // 1d7: getfield com/finalshell/core/U9.e I
      // 1da: bipush 1
      // 1db: iadd
      // 1dc: putfield com/finalshell/core/U9.e I
      // 1df: aload 0
      // 1e0: invokevirtual com/finalshell/core/U9.C$char ()C
      // 1e3: pop
      // 1e4: iload 1
      // 1e5: ifne 3b6
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: getfield com/finalshell/core/U9.l C
      // 1f3: sipush 17399
      // 1f6: ldc2_w 8707971467972353759
      // 1f9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 1fc: goto 203
      // 1ff: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: iload 1
      // 204: ifeq 23a
      // 207: if_icmpne 226
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 210: athrow
      // 211: aload 0
      // 212: dup
      // 213: getfield com/finalshell/core/U9.e I
      // 216: bipush 1
      // 217: iadd
      // 218: putfield com/finalshell/core/U9.e I
      // 21b: aload 0
      // 21c: invokevirtual com/finalshell/core/U9.C$char ()C
      // 21f: pop
      // 220: bipush 1
      // 221: istore 2
      // 222: iload 1
      // 223: ifne 3b6
      // 226: aload 0
      // 227: getfield com/finalshell/core/U9.l C
      // 22a: sipush 23192
      // 22d: ldc2_w 4316719740623292372
      // 230: invokestatic com/finalshell/core/U9.a (IJ)I
      // 233: goto 23a
      // 236: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: iload 1
      // 23b: ifeq 271
      // 23e: if_icmpne 25d
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: aload 0
      // 249: dup
      // 24a: getfield com/finalshell/core/U9.e I
      // 24d: bipush 1
      // 24e: iadd
      // 24f: putfield com/finalshell/core/U9.e I
      // 252: aload 0
      // 253: invokevirtual com/finalshell/core/U9.C$char ()C
      // 256: pop
      // 257: bipush 1
      // 258: istore 2
      // 259: iload 1
      // 25a: ifne 3b6
      // 25d: aload 0
      // 25e: getfield com/finalshell/core/U9.l C
      // 261: sipush 16831
      // 264: ldc2_w 1205696545576721607
      // 267: invokestatic com/finalshell/core/U9.a (IJ)I
      // 26a: goto 271
      // 26d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: iload 1
      // 272: ifeq 2cf
      // 275: if_icmpeq 2a1
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: aload 0
      // 280: getfield com/finalshell/core/U9.l C
      // 283: iload 1
      // 284: ifeq 3b7
      // 287: goto 28e
      // 28a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28d: athrow
      // 28e: sipush 19786
      // 291: ldc2_w 559752938502885485
      // 294: invokestatic com/finalshell/core/U9.a (IJ)I
      // 297: if_icmpne 3b6
      // 29a: goto 2a1
      // 29d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: dup
      // 2a3: getfield com/finalshell/core/U9.e I
      // 2a6: bipush 1
      // 2a7: iadd
      // 2a8: putfield com/finalshell/core/U9.e I
      // 2ab: aload 0
      // 2ac: invokevirtual com/finalshell/core/U9.C$char ()C
      // 2af: pop
      // 2b0: aload 0
      // 2b1: getfield com/finalshell/core/U9.l C
      // 2b4: iload 1
      // 2b5: ifeq 309
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2be: athrow
      // 2bf: sipush 22734
      // 2c2: ldc2_w 9000764304867362202
      // 2c5: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2c8: goto 2cf
      // 2cb: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ce: athrow
      // 2cf: if_icmpeq 2f4
      // 2d2: aload 0
      // 2d3: getfield com/finalshell/core/U9.l C
      // 2d6: sipush 19418
      // 2d9: ldc2_w 715321441499911916
      // 2dc: invokestatic com/finalshell/core/U9.a (IJ)I
      // 2df: iload 1
      // 2e0: ifeq 317
      // 2e3: goto 2ea
      // 2e6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e9: athrow
      // 2ea: if_icmpne 30a
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: aload 0
      // 2f5: dup
      // 2f6: getfield com/finalshell/core/U9.e I
      // 2f9: bipush 1
      // 2fa: iadd
      // 2fb: putfield com/finalshell/core/U9.e I
      // 2fe: aload 0
      // 2ff: invokevirtual com/finalshell/core/U9.C$char ()C
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: pop
      // 30a: aload 0
      // 30b: getfield com/finalshell/core/U9.l C
      // 30e: sipush 21259
      // 311: ldc2_w 1287927339301015045
      // 314: invokestatic com/finalshell/core/U9.a (IJ)I
      // 317: if_icmplt 361
      // 31a: aload 0
      // 31b: getfield com/finalshell/core/U9.l C
      // 31e: sipush 24153
      // 321: ldc2_w 3168790736949871469
      // 324: invokestatic com/finalshell/core/U9.a (IJ)I
      // 327: iload 1
      // 328: ifeq 379
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: iload 1
      // 333: ifeq 379
      // 336: goto 33d
      // 339: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33c: athrow
      // 33d: if_icmpgt 361
      // 340: goto 347
      // 343: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 346: athrow
      // 347: aload 0
      // 348: dup
      // 349: getfield com/finalshell/core/U9.e I
      // 34c: bipush 1
      // 34d: iadd
      // 34e: putfield com/finalshell/core/U9.e I
      // 351: aload 0
      // 352: invokevirtual com/finalshell/core/U9.C$char ()C
      // 355: pop
      // 356: iload 1
      // 357: ifne 30a
      // 35a: goto 361
      // 35d: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 360: athrow
      // 361: aload 0
      // 362: getfield com/finalshell/core/U9.l C
      // 365: iload 1
      // 366: ifeq 3b3
      // 369: sipush 23192
      // 36c: ldc2_w 4316719740623292372
      // 36f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 372: goto 379
      // 375: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 378: athrow
      // 379: if_icmpeq 39e
      // 37c: aload 0
      // 37d: getfield com/finalshell/core/U9.l C
      // 380: iload 1
      // 381: ifeq 3b5
      // 384: goto 38b
      // 387: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38a: athrow
      // 38b: sipush 17399
      // 38e: ldc2_w 8707971467972353759
      // 391: invokestatic com/finalshell/core/U9.a (IJ)I
      // 394: if_icmpne 3b4
      // 397: goto 39e
      // 39a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 0
      // 39f: dup
      // 3a0: getfield com/finalshell/core/U9.e I
      // 3a3: bipush 1
      // 3a4: iadd
      // 3a5: putfield com/finalshell/core/U9.e I
      // 3a8: aload 0
      // 3a9: invokevirtual com/finalshell/core/U9.C$char ()C
      // 3ac: goto 3b3
      // 3af: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b2: athrow
      // 3b3: pop
      // 3b4: bipush 1
      // 3b5: istore 2
      // 3b6: iload 2
      // 3b7: ifeq 3d2
      // 3ba: aload 0
      // 3bb: sipush 5887
      // 3be: ldc2_w 3467391210321595353
      // 3c1: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3c4: putfield com/finalshell/core/U9.Y I
      // 3c7: iload 1
      // 3c8: ifne 3e6
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: aload 0
      // 3d3: sipush 29754
      // 3d6: ldc2_w 1533387650364680473
      // 3d9: invokestatic com/finalshell/core/U9.a (IJ)I
      // 3dc: putfield com/finalshell/core/U9.Y I
      // 3df: goto 3e6
      // 3e2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e5: athrow
      // 3e6: return
   }

   @Override
   public final long f() throws NumberFormatException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lconst_0
      // 001: lstore 2
      // 002: invokestatic com/finalshell/core/Yn4.o ()Z
      // 005: bipush 0
      // 006: istore 4
      // 008: istore 1
      // 009: aload 0
      // 00a: getfield com/finalshell/core/U9.S I
      // 00d: iload 1
      // 00e: ifne 02c
      // 011: bipush -1
      // 012: if_icmpne 028
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: bipush 0
      // 01e: putfield com/finalshell/core/U9.S I
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/finalshell/core/U9.S I
      // 02c: istore 8
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/U9.S I
      // 032: aload 0
      // 033: getfield com/finalshell/core/U9.e I
      // 036: iadd
      // 037: istore 9
      // 039: aload 0
      // 03a: aload 0
      // 03b: getfield com/finalshell/core/U9.S I
      // 03e: invokevirtual com/finalshell/core/U9.C (I)C
      // 041: iload 1
      // 042: ifne 060
      // 045: sipush 19418
      // 048: ldc2_w 715321441499911916
      // 04b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 04e: if_icmpne 074
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: bipush 1
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: istore 4
      // 062: sipush 10076
      // 065: ldc2_w 3988557257157807115
      // 068: invokestatic com/finalshell/core/U9.c (IJ)J
      // 06b: lstore 5
      // 06d: iinc 8 1
      // 070: iload 1
      // 071: ifeq 07f
      // 074: sipush 25279
      // 077: ldc2_w 4733224050431904235
      // 07a: invokestatic com/finalshell/core/U9.c (IJ)J
      // 07d: lstore 5
      // 07f: sipush 29999
      // 082: ldc2_w 6393931142929636986
      // 085: invokestatic com/finalshell/core/U9.c (IJ)J
      // 088: lstore 10
      // 08a: iload 8
      // 08c: iload 9
      // 08e: iload 1
      // 08f: ifne 0ba
      // 092: if_icmpge 0b6
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: iload 8
      // 09f: iinc 8 1
      // 0a2: invokevirtual com/finalshell/core/U9.C (I)C
      // 0a5: sipush 21259
      // 0a8: ldc2_w 1287927339301015045
      // 0ab: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0ae: isub
      // 0af: istore 7
      // 0b1: iload 7
      // 0b3: ineg
      // 0b4: i2l
      // 0b5: lstore 2
      // 0b6: iload 8
      // 0b8: iload 9
      // 0ba: if_icmpge 1aa
      // 0bd: aload 0
      // 0be: iload 8
      // 0c0: iinc 8 1
      // 0c3: invokevirtual com/finalshell/core/U9.C (I)C
      // 0c6: istore 12
      // 0c8: iload 12
      // 0ca: iload 1
      // 0cb: ifne 1ac
      // 0ce: sipush 6237
      // 0d1: ldc2_w 5663385358208615747
      // 0d4: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0d7: iload 1
      // 0d8: ifne 1c2
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: if_icmpeq 1aa
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: iload 12
      // 0ee: iload 1
      // 0ef: ifne 1ac
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: sipush 15723
      // 0fc: ldc2_w 6761962926741315610
      // 0ff: invokestatic com/finalshell/core/U9.a (IJ)I
      // 102: if_icmpeq 1aa
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: iload 12
      // 10e: sipush 3347
      // 111: ldc2_w 7772225107834589205
      // 114: invokestatic com/finalshell/core/U9.a (IJ)I
      // 117: iload 1
      // 118: ifne 149
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: if_icmpne 137
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: iload 1
      // 12d: ifeq 1aa
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: iload 12
      // 139: sipush 21259
      // 13c: ldc2_w 1287927339301015045
      // 13f: invokestatic com/finalshell/core/U9.a (IJ)I
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: isub
      // 14a: istore 7
      // 14c: lload 2
      // 14d: lload 10
      // 14f: lcmp
      // 150: iload 1
      // 151: ifne 18d
      // 154: ifge 16e
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: new java/lang/NumberFormatException
      // 161: dup
      // 162: aload 0
      // 163: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 166: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 169: athrow
      // 16a: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: lload 2
      // 16f: sipush 3395
      // 172: ldc2_w 2174368042043745818
      // 175: invokestatic com/finalshell/core/U9.c (IJ)J
      // 178: lmul
      // 179: lstore 2
      // 17a: lload 2
      // 17b: lload 5
      // 17d: iload 7
      // 17f: i2l
      // 180: ladd
      // 181: iload 1
      // 182: ifne 1a4
      // 185: lcmp
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: ifge 1a0
      // 190: new java/lang/NumberFormatException
      // 193: dup
      // 194: aload 0
      // 195: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 198: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 19b: athrow
      // 19c: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: lload 2
      // 1a1: iload 7
      // 1a3: i2l
      // 1a4: lsub
      // 1a5: lstore 2
      // 1a6: iload 1
      // 1a7: ifeq 0b6
      // 1aa: iload 4
      // 1ac: iload 1
      // 1ad: ifne 1bc
      // 1b0: ifeq 1d7
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: iload 8
      // 1bc: aload 0
      // 1bd: getfield com/finalshell/core/U9.S I
      // 1c0: bipush 1
      // 1c1: iadd
      // 1c2: if_icmple 1cb
      // 1c5: lload 2
      // 1c6: lreturn
      // 1c7: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: new java/lang/NumberFormatException
      // 1ce: dup
      // 1cf: aload 0
      // 1d0: invokevirtual com/finalshell/core/U9.c$String ()Ljava/lang/String;
      // 1d3: invokespecial java/lang/NumberFormatException.<init> (Ljava/lang/String;)V
      // 1d6: athrow
      // 1d7: lload 2
      // 1d8: lneg
      // 1d9: lreturn
   }

   @Override
   public final Number E(boolean var1) {
      char var10000 = (Yn4.Y()) ? 1 : 0;
      char var3 = this.C(this.S + this.e - 1);
      boolean var2 = ((boolean)var10000) != 0;

      try {
         int var10001;
         label47: {
            try {
               var10000 = var3;
               var10001 = a(17399, 8707971467972353759L);
               if (!var2) {
                  break label47;
               }

               if (var3 == var10001) {
                  return Float.parseFloat(this.c$String());
               }
            } catch (NumberFormatException var6) {
               throw a(var6);
            }

            try {
               var10000 = var3;
               if (!var2) {
                  return (Number)(var3 != 0 ? this.c$BigDecimal() : this.O());
               }

               var10001 = a(29115, 1763126385975471309L);
            } catch (NumberFormatException var5) {
               throw a(var5);
            }
         }

         if (var10000 == var10001) {
            return Double.parseDouble(this.c$String());
         } else {
            return (Number)(var1 != 0 ? this.c$BigDecimal() : this.O());
         }
      } catch (NumberFormatException var7) {
         throw new Hi2(var7.getMessage() + a(10496, 16010) + this.C$String());
      }
   }

   @Override
   public abstract BigDecimal c$BigDecimal();

   public static boolean Y(char param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Yn4.o ()Z
      // 03: istore 1
      // 04: iload 0
      // 05: sipush 18572
      // 08: ldc2_w 5664846119839831378
      // 0b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 0e: iload 1
      // 0f: ifne 38
      // 12: if_icmpgt e1
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: iload 0
      // 1d: iload 1
      // 1e: ifne de
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: sipush 18572
      // 2b: ldc2_w 5664846119839831378
      // 2e: invokestatic com/finalshell/core/U9.a (IJ)I
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: if_icmpeq d6
      // 3b: iload 0
      // 3c: iload 1
      // 3d: ifne de
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: sipush 1861
      // 4a: ldc2_w 5349631099953699429
      // 4d: invokestatic com/finalshell/core/U9.a (IJ)I
      // 50: if_icmpeq d6
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: iload 0
      // 5b: iload 1
      // 5c: ifne de
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: sipush 16923
      // 69: ldc2_w 1571494982232874791
      // 6c: invokestatic com/finalshell/core/U9.a (IJ)I
      // 6f: if_icmpeq d6
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: iload 0
      // 7a: iload 1
      // 7b: ifne de
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: sipush 28233
      // 88: ldc2_w 5739983667078181753
      // 8b: invokestatic com/finalshell/core/U9.a (IJ)I
      // 8e: if_icmpeq d6
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: iload 0
      // 99: iload 1
      // 9a: ifne de
      // 9d: goto a4
      // a0: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: sipush 16823
      // a7: ldc2_w 1966285255030480114
      // aa: invokestatic com/finalshell/core/U9.a (IJ)I
      // ad: if_icmpeq d6
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: iload 0
      // b8: iload 1
      // b9: ifne de
      // bc: goto c3
      // bf: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: sipush 16265
      // c6: ldc2_w 35568148908106386
      // c9: invokestatic com/finalshell/core/U9.a (IJ)I
      // cc: if_icmpne e1
      // cf: goto d6
      // d2: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d5: athrow
      // d6: bipush 1
      // d7: goto de
      // da: invokestatic com/finalshell/core/U9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dd: athrow
      // de: goto e2
      // e1: bipush 0
      // e2: ireturn
   }

   public String[] J(char[] var1, int var2, O12 var3) {
      throw new UnsupportedOperationException();
   }

   public boolean t(char[] var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public int A$int() {
      return this.y;
   }

   @Override
   public void P(int var1) {
      this.y = var1;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 10531) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 25;
               break;
            case 1:
               var10000 = 134;
               break;
            case 2:
               var10000 = 149;
               break;
            case 3:
               var10000 = 243;
               break;
            case 4:
               var10000 = 161;
               break;
            case 5:
               var10000 = 193;
               break;
            case 6:
               var10000 = 241;
               break;
            case 7:
               var10000 = 117;
               break;
            case 8:
               var10000 = 24;
               break;
            case 9:
               var10000 = 124;
               break;
            case 10:
               var10000 = 12;
               break;
            case 11:
               var10000 = 178;
               break;
            case 12:
               var10000 = 189;
               break;
            case 13:
               var10000 = 219;
               break;
            case 14:
               var10000 = 34;
               break;
            case 15:
               var10000 = 225;
               break;
            case 16:
               var10000 = 82;
               break;
            case 17:
               var10000 = 151;
               break;
            case 18:
               var10000 = 163;
               break;
            case 19:
               var10000 = 175;
               break;
            case 20:
               var10000 = 74;
               break;
            case 21:
               var10000 = 135;
               break;
            case 22:
               var10000 = 114;
               break;
            case 23:
               var10000 = 102;
               break;
            case 24:
               var10000 = 136;
               break;
            case 25:
               var10000 = 200;
               break;
            case 26:
               var10000 = 216;
               break;
            case 27:
               var10000 = 176;
               break;
            case 28:
               var10000 = 223;
               break;
            case 29:
               var10000 = 142;
               break;
            case 30:
               var10000 = 23;
               break;
            case 31:
               var10000 = 255;
               break;
            case 32:
               var10000 = 38;
               break;
            case 33:
               var10000 = 46;
               break;
            case 34:
               var10000 = 138;
               break;
            case 35:
               var10000 = 228;
               break;
            case 36:
               var10000 = 51;
               break;
            case 37:
               var10000 = 195;
               break;
            case 38:
               var10000 = 75;
               break;
            case 39:
               var10000 = 180;
               break;
            case 40:
               var10000 = 130;
               break;
            case 41:
               var10000 = 33;
               break;
            case 42:
               var10000 = 198;
               break;
            case 43:
               var10000 = 144;
               break;
            case 44:
               var10000 = 73;
               break;
            case 45:
               var10000 = 16;
               break;
            case 46:
               var10000 = 155;
               break;
            case 47:
               var10000 = 204;
               break;
            case 48:
               var10000 = 202;
               break;
            case 49:
               var10000 = 32;
               break;
            case 50:
               var10000 = 66;
               break;
            case 51:
               var10000 = 47;
               break;
            case 52:
               var10000 = 247;
               break;
            case 53:
               var10000 = 53;
               break;
            case 54:
               var10000 = 105;
               break;
            case 55:
               var10000 = 140;
               break;
            case 56:
               var10000 = 107;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 141;
               break;
            case 59:
               var10000 = 71;
               break;
            case 60:
               var10000 = 172;
               break;
            case 61:
               var10000 = 154;
               break;
            case 62:
               var10000 = 147;
               break;
            case 63:
               var10000 = 251;
               break;
            case 64:
               var10000 = 250;
               break;
            case 65:
               var10000 = 27;
               break;
            case 66:
               var10000 = 96;
               break;
            case 67:
               var10000 = 217;
               break;
            case 68:
               var10000 = 222;
               break;
            case 69:
               var10000 = 81;
               break;
            case 70:
               var10000 = 160;
               break;
            case 71:
               var10000 = 94;
               break;
            case 72:
               var10000 = 249;
               break;
            case 73:
               var10000 = 236;
               break;
            case 74:
               var10000 = 185;
               break;
            case 75:
               var10000 = 78;
               break;
            case 76:
               var10000 = 146;
               break;
            case 77:
               var10000 = 218;
               break;
            case 78:
               var10000 = 49;
               break;
            case 79:
               var10000 = 121;
               break;
            case 80:
               var10000 = 165;
               break;
            case 81:
               var10000 = 237;
               break;
            case 82:
               var10000 = 15;
               break;
            case 83:
               var10000 = 59;
               break;
            case 84:
               var10000 = 233;
               break;
            case 85:
               var10000 = 69;
               break;
            case 86:
               var10000 = 234;
               break;
            case 87:
               var10000 = 8;
               break;
            case 88:
               var10000 = 31;
               break;
            case 89:
               var10000 = 173;
               break;
            case 90:
               var10000 = 45;
               break;
            case 91:
               var10000 = 166;
               break;
            case 92:
               var10000 = 26;
               break;
            case 93:
               var10000 = 129;
               break;
            case 94:
               var10000 = 174;
               break;
            case 95:
               var10000 = 109;
               break;
            case 96:
               var10000 = 156;
               break;
            case 97:
               var10000 = 88;
               break;
            case 98:
               var10000 = 139;
               break;
            case 99:
               var10000 = 215;
               break;
            case 100:
               var10000 = 113;
               break;
            case 101:
               var10000 = 89;
               break;
            case 102:
               var10000 = 227;
               break;
            case 103:
               var10000 = 221;
               break;
            case 104:
               var10000 = 63;
               break;
            case 105:
               var10000 = 150;
               break;
            case 106:
               var10000 = 61;
               break;
            case 107:
               var10000 = 91;
               break;
            case 108:
               var10000 = 120;
               break;
            case 109:
               var10000 = 184;
               break;
            case 110:
               var10000 = 103;
               break;
            case 111:
               var10000 = 126;
               break;
            case 112:
               var10000 = 90;
               break;
            case 113:
               var10000 = 104;
               break;
            case 114:
               var10000 = 70;
               break;
            case 115:
               var10000 = 77;
               break;
            case 116:
               var10000 = 145;
               break;
            case 117:
               var10000 = 80;
               break;
            case 118:
               var10000 = 9;
               break;
            case 119:
               var10000 = 203;
               break;
            case 120:
               var10000 = 100;
               break;
            case 121:
               var10000 = 86;
               break;
            case 122:
               var10000 = 212;
               break;
            case 123:
               var10000 = 137;
               break;
            case 124:
               var10000 = 127;
               break;
            case 125:
               var10000 = 192;
               break;
            case 126:
               var10000 = 1;
               break;
            case 127:
               var10000 = 108;
               break;
            case 128:
               var10000 = 242;
               break;
            case 129:
               var10000 = 152;
               break;
            case 130:
               var10000 = 35;
               break;
            case 131:
               var10000 = 30;
               break;
            case 132:
               var10000 = 197;
               break;
            case 133:
               var10000 = 97;
               break;
            case 134:
               var10000 = 4;
               break;
            case 135:
               var10000 = 162;
               break;
            case 136:
               var10000 = 37;
               break;
            case 137:
               var10000 = 11;
               break;
            case 138:
               var10000 = 244;
               break;
            case 139:
               var10000 = 65;
               break;
            case 140:
               var10000 = 92;
               break;
            case 141:
               var10000 = 7;
               break;
            case 142:
               var10000 = 252;
               break;
            case 143:
               var10000 = 182;
               break;
            case 144:
               var10000 = 131;
               break;
            case 145:
               var10000 = 112;
               break;
            case 146:
               var10000 = 143;
               break;
            case 147:
               var10000 = 253;
               break;
            case 148:
               var10000 = 210;
               break;
            case 149:
               var10000 = 230;
               break;
            case 150:
               var10000 = 209;
               break;
            case 151:
               var10000 = 5;
               break;
            case 152:
               var10000 = 239;
               break;
            case 153:
               var10000 = 231;
               break;
            case 154:
               var10000 = 64;
               break;
            case 155:
               var10000 = 101;
               break;
            case 156:
               var10000 = 207;
               break;
            case 157:
               var10000 = 50;
               break;
            case 158:
               var10000 = 186;
               break;
            case 159:
               var10000 = 232;
               break;
            case 160:
               var10000 = 54;
               break;
            case 161:
               var10000 = 235;
               break;
            case 162:
               var10000 = 191;
               break;
            case 163:
               var10000 = 211;
               break;
            case 164:
               var10000 = 2;
               break;
            case 165:
               var10000 = 19;
               break;
            case 166:
               var10000 = 13;
               break;
            case 167:
               var10000 = 76;
               break;
            case 168:
               var10000 = 0;
               break;
            case 169:
               var10000 = 41;
               break;
            case 170:
               var10000 = 125;
               break;
            case 171:
               var10000 = 79;
               break;
            case 172:
               var10000 = 199;
               break;
            case 173:
               var10000 = 36;
               break;
            case 174:
               var10000 = 220;
               break;
            case 175:
               var10000 = 213;
               break;
            case 176:
               var10000 = 115;
               break;
            case 177:
               var10000 = 190;
               break;
            case 178:
               var10000 = 14;
               break;
            case 179:
               var10000 = 83;
               break;
            case 180:
               var10000 = 95;
               break;
            case 181:
               var10000 = 39;
               break;
            case 182:
               var10000 = 240;
               break;
            case 183:
               var10000 = 58;
               break;
            case 184:
               var10000 = 93;
               break;
            case 185:
               var10000 = 60;
               break;
            case 186:
               var10000 = 106;
               break;
            case 187:
               var10000 = 10;
               break;
            case 188:
               var10000 = 153;
               break;
            case 189:
               var10000 = 194;
               break;
            case 190:
               var10000 = 245;
               break;
            case 191:
               var10000 = 196;
               break;
            case 192:
               var10000 = 168;
               break;
            case 193:
               var10000 = 181;
               break;
            case 194:
               var10000 = 170;
               break;
            case 195:
               var10000 = 119;
               break;
            case 196:
               var10000 = 84;
               break;
            case 197:
               var10000 = 43;
               break;
            case 198:
               var10000 = 133;
               break;
            case 199:
               var10000 = 3;
               break;
            case 200:
               var10000 = 57;
               break;
            case 201:
               var10000 = 187;
               break;
            case 202:
               var10000 = 111;
               break;
            case 203:
               var10000 = 44;
               break;
            case 204:
               var10000 = 164;
               break;
            case 205:
               var10000 = 20;
               break;
            case 206:
               var10000 = 167;
               break;
            case 207:
               var10000 = 21;
               break;
            case 208:
               var10000 = 55;
               break;
            case 209:
               var10000 = 214;
               break;
            case 210:
               var10000 = 40;
               break;
            case 211:
               var10000 = 254;
               break;
            case 212:
               var10000 = 28;
               break;
            case 213:
               var10000 = 188;
               break;
            case 214:
               var10000 = 87;
               break;
            case 215:
               var10000 = 208;
               break;
            case 216:
               var10000 = 123;
               break;
            case 217:
               var10000 = 67;
               break;
            case 218:
               var10000 = 205;
               break;
            case 219:
               var10000 = 128;
               break;
            case 220:
               var10000 = 48;
               break;
            case 221:
               var10000 = 6;
               break;
            case 222:
               var10000 = 159;
               break;
            case 223:
               var10000 = 226;
               break;
            case 224:
               var10000 = 72;
               break;
            case 225:
               var10000 = 68;
               break;
            case 226:
               var10000 = 238;
               break;
            case 227:
               var10000 = 110;
               break;
            case 228:
               var10000 = 169;
               break;
            case 229:
               var10000 = 99;
               break;
            case 230:
               var10000 = 229;
               break;
            case 231:
               var10000 = 157;
               break;
            case 232:
               var10000 = 248;
               break;
            case 233:
               var10000 = 62;
               break;
            case 234:
               var10000 = 179;
               break;
            case 235:
               var10000 = 18;
               break;
            case 236:
               var10000 = 29;
               break;
            case 237:
               var10000 = 98;
               break;
            case 238:
               var10000 = 116;
               break;
            case 239:
               var10000 = 183;
               break;
            case 240:
               var10000 = 158;
               break;
            case 241:
               var10000 = 201;
               break;
            case 242:
               var10000 = 42;
               break;
            case 243:
               var10000 = 56;
               break;
            case 244:
               var10000 = 22;
               break;
            case 245:
               var10000 = 17;
               break;
            case 246:
               var10000 = 206;
               break;
            case 247:
               var10000 = 52;
               break;
            case 248:
               var10000 = 148;
               break;
            case 249:
               var10000 = 224;
               break;
            case 250:
               var10000 = 246;
               break;
            case 251:
               var10000 = 171;
               break;
            case 252:
               var10000 = 122;
               break;
            case 253:
               var10000 = 118;
               break;
            case 254:
               var10000 = 177;
               break;
            default:
               var10000 = 132;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23901;
      if (j[var3] == null) {
         j[var3] = (int)(h[var3] ^ var1);
      }

      return j[var3];
   }

   public static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 11101) & 32767;
      if (q[var3] == null) {
         q[var3] = p[var3] ^ var1;
      }

      return q[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var52;
      byte[] var7;
      String[] var21 = new String[52];
      int var19 = 0;
      String var18 = "\u0014FA\u008b\u0014ÞÚw\u007f\u0086F}\u0010Ùohå×)¢\u0093\u0015\u0002ú\u0095\u008c]Ü\u0098\u0004Ç\u0092\u009cÌ\u0013}¶8p¾ß\u0082\u008dS\u0006D)Ý}¾¦lÖ¡\u0010\u0012\\\"ì\u009c¿\u0080U8\u0013'\u0012L\u00ad\u0083\u0085\u0012æ½\u008f¿+b=úè/\u008a0ÅëTXÐÈ\nÏnÅ¨\u0095W¹\u000b\u0003¥\u0010\u0085ªàÁè\u009dî9wòpÙ´ÒÖ¥\u00106Á\u0096¬&07\u008cLD\u0017\u000fB\u000fHð\tB\t\u001c ·£\u008d\u009aÐ\u0014\u0099©¤\u0093*¸î\u001eæ\u0084âÃ\b\u0095)ÞaLS\u0018\f³\u0002%H~\u009c\u0097%³Ô.O\fÅîëÕ§/¬SÚ\u001aÌ\u0096\u0011û#/ð\u0011»Ñý\u0090j\u008cÊ9£.ìª\u0003ÕE\u0085\t¬ù¾²O\u009dÜÄ9\u0003-\u009f\n\u0005ê,p|0\u0007\u0089³aè\f¶s\u000eåC+Î²\u0013¨yZ8Ú\u0006\u000f1\u0011\n|\u0011\u001bÖÆ)R\u008f\u009fotEt¡\u0016[\u0010Û\u009c+\u0007\u0091EÁ\"\u0092\u0091Ìµ#_$\u0014\u0018ðpÝM\u0087\u0006¨b<ö\u008eÝsXH÷©á`f\u0007n\u0086\"\u000fI\u008aê\u0012aít\u001fºXì?²\u008cp\u00127Aµ l\u0091Õ\u0084õà)É±ÔÚ¿\u00014\u001csæ=Ô}\u000f÷W±\u009a¼\u009a³#W\u000e¹û½×ïïáF\u0094áÇ \t-\u0007å¡íe¹0ß\u0010\u0099\u0096¤tCL\u0092\u0080Ê\u007f£ù%;8\u008f\f]®30\u001e\u0083\u0011\u00adÒåÎH\u000f¶²\u000fS\u008fIË\u0082Tð/KGx\u009a\u0017ä~Ì[mÎ^Sa¿²pöàÞ\rñèÒ¸·\u0099\u0084\u000f®\u001dB\u0005\u009fj\u001dM²\u0083\u0015\u009c\u001e\u007fB\u0004©Q\u0011Z\u001b[¼²\u00928q=\u0085\u008c\füGç\u007fmã\nÕì\u0091}ÄcûB¥\u0013\u000f\u0092Í\u0091ú\u000eð\u0099¼\u0007,[±D]®\u0002z(\u000fv²YðüÎv\u00991#M\u0088\u0015ý#\u00106U\u0095¢hÁU\u008eë¡%áwÓ£I\u0015\u0093ªåók¾\u0093\u0093tûliç\u001caÂ\r0KÄ@\u0003â\u0082³\u001c`w_æ1I~\u009f\u0080\u0083\u009a¹wGÏ\u0082ªjßå£©h\u008e¥øá\u0083\u001bç\u0096%×ÊÙc\u0090G®\u0085\u0013Èõ\u0088²¶ÿ{Ô\u008fl=î\u0089\u0007j\u0015\u008bÃ²;jÈ\u0015»\u008cÜw§T\u0081Ù»\u001f\u0086°Ñ\u00ad\u0011W\u0010ÄEÔÂ°ÅW\u0099\u0082Ù\u0092\u0012?G\b\u0003¬$3\f!zwG4}Þ\u0019\u0094S\u0005¿\u0010\u0093\u0088\"\u0085°\u0015å(\u0016Ð\\\u009d+]eº\fÉ\u008c¡tL\u000b[¼\u009bÇç\f\"@Ò\f \u0003\u008ba¬\u0002ù\u0082\u000bÁ\u000f\u0007\u0010(\nQö)\u0005,¬ËÆ\n0êÛózúÌ\u000f+.5QR\u008f¹{\u009dº-Ð\u0005ä»";
      int var20 = "\u0014FA\u008b\u0014ÞÚw\u007f\u0086F}\u0010Ùohå×)¢\u0093\u0015\u0002ú\u0095\u008c]Ü\u0098\u0004Ç\u0092\u009cÌ\u0013}¶8p¾ß\u0082\u008dS\u0006D)Ý}¾¦lÖ¡\u0010\u0012\\\"ì\u009c¿\u0080U8\u0013'\u0012L\u00ad\u0083\u0085\u0012æ½\u008f¿+b=úè/\u008a0ÅëTXÐÈ\nÏnÅ¨\u0095W¹\u000b\u0003¥\u0010\u0085ªàÁè\u009dî9wòpÙ´ÒÖ¥\u00106Á\u0096¬&07\u008cLD\u0017\u000fB\u000fHð\tB\t\u001c ·£\u008d\u009aÐ\u0014\u0099©¤\u0093*¸î\u001eæ\u0084âÃ\b\u0095)ÞaLS\u0018\f³\u0002%H~\u009c\u0097%³Ô.O\fÅîëÕ§/¬SÚ\u001aÌ\u0096\u0011û#/ð\u0011»Ñý\u0090j\u008cÊ9£.ìª\u0003ÕE\u0085\t¬ù¾²O\u009dÜÄ9\u0003-\u009f\n\u0005ê,p|0\u0007\u0089³aè\f¶s\u000eåC+Î²\u0013¨yZ8Ú\u0006\u000f1\u0011\n|\u0011\u001bÖÆ)R\u008f\u009fotEt¡\u0016[\u0010Û\u009c+\u0007\u0091EÁ\"\u0092\u0091Ìµ#_$\u0014\u0018ðpÝM\u0087\u0006¨b<ö\u008eÝsXH÷©á`f\u0007n\u0086\"\u000fI\u008aê\u0012aít\u001fºXì?²\u008cp\u00127Aµ l\u0091Õ\u0084õà)É±ÔÚ¿\u00014\u001csæ=Ô}\u000f÷W±\u009a¼\u009a³#W\u000e¹û½×ïïáF\u0094áÇ \t-\u0007å¡íe¹0ß\u0010\u0099\u0096¤tCL\u0092\u0080Ê\u007f£ù%;8\u008f\f]®30\u001e\u0083\u0011\u00adÒåÎH\u000f¶²\u000fS\u008fIË\u0082Tð/KGx\u009a\u0017ä~Ì[mÎ^Sa¿²pöàÞ\rñèÒ¸·\u0099\u0084\u000f®\u001dB\u0005\u009fj\u001dM²\u0083\u0015\u009c\u001e\u007fB\u0004©Q\u0011Z\u001b[¼²\u00928q=\u0085\u008c\füGç\u007fmã\nÕì\u0091}ÄcûB¥\u0013\u000f\u0092Í\u0091ú\u000eð\u0099¼\u0007,[±D]®\u0002z(\u000fv²YðüÎv\u00991#M\u0088\u0015ý#\u00106U\u0095¢hÁU\u008eë¡%áwÓ£I\u0015\u0093ªåók¾\u0093\u0093tûliç\u001caÂ\r0KÄ@\u0003â\u0082³\u001c`w_æ1I~\u009f\u0080\u0083\u009a¹wGÏ\u0082ªjßå£©h\u008e¥øá\u0083\u001bç\u0096%×ÊÙc\u0090G®\u0085\u0013Èõ\u0088²¶ÿ{Ô\u008fl=î\u0089\u0007j\u0015\u008bÃ²;jÈ\u0015»\u008cÜw§T\u0081Ù»\u001f\u0086°Ñ\u00ad\u0011W\u0010ÄEÔÂ°ÅW\u0099\u0082Ù\u0092\u0012?G\b\u0003¬$3\f!zwG4}Þ\u0019\u0094S\u0005¿\u0010\u0093\u0088\"\u0085°\u0015å(\u0016Ð\\\u009d+]eº\fÉ\u008c¡tL\u000b[¼\u009bÇç\f\"@Ò\f \u0003\u008ba¬\u0002ù\u0082\u000bÁ\u000f\u0007\u0010(\nQö)\u0005,¬ËÆ\n0êÛózúÌ\u000f+.5QR\u008f¹{\u009dº-Ð\u0005ä»"
         .length();
      char var17 = '\f';
      int var30 = -1;

      label126:
      while (true) {
         byte var10000 = 112;
         String var10001 = var18.substring(++var30, var30 + var17);
         byte var10002 = -1;

         while (true) {
            label121: {
               char[] var60 = var10001.toCharArray();
               int var10004 = var60.length;
               int var22 = 0;
               byte var63 = var10000;
               var52 = var60;
               int var40 = var10004;
               byte var72;
               char[] var80;
               int var10006;
               if (var10004 <= 1) {
                  var80 = var60;
                  var72 = var10000;
                  var10006 = var22;
               } else {
                  var63 = var10000;
                  var40 = var10004;
                  if (var10004 <= var22) {
                     break label121;
                  }

                  var80 = var60;
                  var72 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var89 = var80[var10006];
                  byte var90;
                  switch (var22 % 7) {
                     case 0:
                        var90 = 86;
                        break;
                     case 1:
                        var90 = 92;
                        break;
                     case 2:
                        var90 = 95;
                        break;
                     case 3:
                        var90 = 50;
                        break;
                     case 4:
                        var90 = 47;
                        break;
                     case 5:
                        var90 = 63;
                        break;
                     default:
                        var90 = 36;
                  }

                  var80[var10006] = (char)(var89 ^ var72 ^ var90);
                  var22++;
                  if (var63 == 0) {
                     var10006 = var63;
                     var80 = var52;
                     var72 = var63;
                  } else {
                     if (var40 <= var22) {
                        break;
                     }

                     var80 = var52;
                     var72 = var63;
                     var10006 = var22;
                  }
               }
            }

            String var65 = new String(var52).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var65;
                  if ((var30 += var17) >= var20) {
                     a = var21;
                     c = new String[52];
                     long var8 = 5808828506475657219L;
                     long[] var14 = new long[135];
                     int var11 = 0;
                     String var12 = "[\u001bøóLÙ\u009eªML?6£»u\u0084§ÁôG\u0016¦²PZ\u0099o\\\u008f¯H¤®\u008d«À í&Î\u0092{\u009aô£.c?¿¼e®»\u0013oJ\u0007<©UãIv#Q\u001cÿÖ\u0085\u009f@9µùW\u001es\u0006}²\u0081ªEOÞù\u0096\u009e\u007fÐ\u0095±1µ,Ò¢è\u008dw7¡a¹b¯.Oþ\u008eµ¤ø¦Ôwü=hoÈ§\u0082I0\u0019\u0083ö@DFØ«\u0000²\u0013&µí\\§`\u007f\u0093\u0006_\r#rD1:v\b\u007f\u009a \u0096\u0018¦ã\u008eÑ%I\u0093£¿\u0005\u001e\u0088ñe{\u0092IåØ\u0097\nÅl\u0004+\u000fH±\u007f%ü7d\u0081ýñ\u008b\u0080\u008aäý\u001d\u00adBJåÏ\r8+]´Ø\u0091Cw×¬\u008eDöS*\u0005ÓQ\u0080~[ÿnû\u0089Ôxz\u009cÈ\u0097©Ý¡öÁþ®èoÚÿt \u0004\u008a\n\u0080A½y\u0003OÍ\t\u009cßóJ qZô¸Ó\u008bJ-ÿ\nv\u000e\u0096õ·wH¦\"\u0097-~¾ë©é\u0010»lÿêz`Ë ä¡\u0017SI'WSÆ\u00003ësOV»\u000bÑÓO\u0011ÙRG4\u008d\u0087\u0019qü4\u000bù\u008c&Ë\u0084ÒQN\u0080ÅËÕK«C\u008bT\u008a\u0090àDþ\u0091b\u0018J¸+\u0012¢ÓÑíy'à³LLH}?Ý±w\u0088 VÂ4R\u009c\u008eÿÑ@e×'\u008b\u0096\u009c4Ú\u0005#\u001cÇ\u0017Q\u0007±¶îE÷k×\u009dº0\u008c\u008fx\u0003\"\u009dÁ\u009eýZõ>«L_T·`§¸\u0019`\u008cY\u0081 ëñ\u0083ØÄ«ëÖfU/\u0016ãk&Üæ¤\u008a·\"¹\u0096!XN¸¹Ñ£ébX\u000f\u0086\u0094Ç\f\b\u001c´R;´\u0083¹\u0085\u001fo\u00051i-²äÎ\u008f¼\u00ad\"\u0096rOCU\u000f\fÞþ§\u0095Ïíx\u007fB2^\u001d ñCÒ½Ç^I\u0089å\u0096S³4N5Ú#ZM?\u0088½\fvþ×]r\u0089ªü\u0005Zv~\u008c\u0087ªu £\u0005I\tX\u009a\u0099\u00ad×\u000bÂ¤r/vw(ý~`Î D&\u008e\u0092ÔÛÔ\u0001\u0096MHI#W\u0004\u0006uÐKÔÒù@\u0006£x]c\u008c0áõ\u008f\f&\u0013IX/X1²®b\u0098¯z@ÉTeÙ§\u0004'<èô/\re\u001cMú³3²ß5ó\u0000;ÜA&íìC´\u009eü¶Ñt j)ö6iáX(°µR\u0015\u0011ä\bÚ^ÐÇÚ\u001dI_Z×aË\u0083¸Ö¤\u0012\u0001ç®ãg\u0083\u00ad~&Õ)\u0099\u0099âÍ\u0095?ý\u0003R\u008b\u00adæ³7\bWeðÓ\u0087ws~¨T'Ë0¿4lÒ\u0087\u0083°)àö(TavÎ)ÍÇ'z'Ä%B@ìüi¯¨¥oÒåùc6©ÂüH?èg)$\u0004ë\u001a\u0092ð7ñCÛb|\u0082¿/ê\u008c^¹·\"U^i\u0016øFd\u0012ý\u0012|É¢W\u008c\u0081\u009b1\u009fétÆáPmÊÉ¯B}WÐM\u009d\u001a?`özêÖûW¶\u009cb\u0004.6\u0083'Ï`%Ñ\u00advnÂ¦\u001f/õ\u0095>Ë¹\u008d\u008dùnÍ\u0019Ësmy\u0089ý5\u0019|J0~ÊÖµ\u007fá°F\u0017ë\u0093z\u008eº3\u0092ZGQ¥.¾\t¤å¯ÁaÈ\t\u001cÃ\u0010K\u0001\u0000\u0083ÙXì,pL\u0018¢Óöú\n¿jÇ\u001ef\u009a\u009f6E\u0080H¡ÄV\u001d¹\u009cV/Y.|\u001dÕ_àÞ\u0000éÍÄÅóP.\u0016\u0086Ô\fü÷xüÖè+|.p'E#3Ùº&\u0082ý\u009bß;\u009f\"ÍÒZY»¢lÄï¨®\u0093QÑ\u0018¿\u0000HþA»6¸By\u0089Lâ@oV¾¡0×\u008a>Â²i^(Oá\u0089¡pÐ\u0000Ô\u0084AémqRãmq²h\u000fÃ";
                     int var13 = "[\u001bøóLÙ\u009eªML?6£»u\u0084§ÁôG\u0016¦²PZ\u0099o\\\u008f¯H¤®\u008d«À í&Î\u0092{\u009aô£.c?¿¼e®»\u0013oJ\u0007<©UãIv#Q\u001cÿÖ\u0085\u009f@9µùW\u001es\u0006}²\u0081ªEOÞù\u0096\u009e\u007fÐ\u0095±1µ,Ò¢è\u008dw7¡a¹b¯.Oþ\u008eµ¤ø¦Ôwü=hoÈ§\u0082I0\u0019\u0083ö@DFØ«\u0000²\u0013&µí\\§`\u007f\u0093\u0006_\r#rD1:v\b\u007f\u009a \u0096\u0018¦ã\u008eÑ%I\u0093£¿\u0005\u001e\u0088ñe{\u0092IåØ\u0097\nÅl\u0004+\u000fH±\u007f%ü7d\u0081ýñ\u008b\u0080\u008aäý\u001d\u00adBJåÏ\r8+]´Ø\u0091Cw×¬\u008eDöS*\u0005ÓQ\u0080~[ÿnû\u0089Ôxz\u009cÈ\u0097©Ý¡öÁþ®èoÚÿt \u0004\u008a\n\u0080A½y\u0003OÍ\t\u009cßóJ qZô¸Ó\u008bJ-ÿ\nv\u000e\u0096õ·wH¦\"\u0097-~¾ë©é\u0010»lÿêz`Ë ä¡\u0017SI'WSÆ\u00003ësOV»\u000bÑÓO\u0011ÙRG4\u008d\u0087\u0019qü4\u000bù\u008c&Ë\u0084ÒQN\u0080ÅËÕK«C\u008bT\u008a\u0090àDþ\u0091b\u0018J¸+\u0012¢ÓÑíy'à³LLH}?Ý±w\u0088 VÂ4R\u009c\u008eÿÑ@e×'\u008b\u0096\u009c4Ú\u0005#\u001cÇ\u0017Q\u0007±¶îE÷k×\u009dº0\u008c\u008fx\u0003\"\u009dÁ\u009eýZõ>«L_T·`§¸\u0019`\u008cY\u0081 ëñ\u0083ØÄ«ëÖfU/\u0016ãk&Üæ¤\u008a·\"¹\u0096!XN¸¹Ñ£ébX\u000f\u0086\u0094Ç\f\b\u001c´R;´\u0083¹\u0085\u001fo\u00051i-²äÎ\u008f¼\u00ad\"\u0096rOCU\u000f\fÞþ§\u0095Ïíx\u007fB2^\u001d ñCÒ½Ç^I\u0089å\u0096S³4N5Ú#ZM?\u0088½\fvþ×]r\u0089ªü\u0005Zv~\u008c\u0087ªu £\u0005I\tX\u009a\u0099\u00ad×\u000bÂ¤r/vw(ý~`Î D&\u008e\u0092ÔÛÔ\u0001\u0096MHI#W\u0004\u0006uÐKÔÒù@\u0006£x]c\u008c0áõ\u008f\f&\u0013IX/X1²®b\u0098¯z@ÉTeÙ§\u0004'<èô/\re\u001cMú³3²ß5ó\u0000;ÜA&íìC´\u009eü¶Ñt j)ö6iáX(°µR\u0015\u0011ä\bÚ^ÐÇÚ\u001dI_Z×aË\u0083¸Ö¤\u0012\u0001ç®ãg\u0083\u00ad~&Õ)\u0099\u0099âÍ\u0095?ý\u0003R\u008b\u00adæ³7\bWeðÓ\u0087ws~¨T'Ë0¿4lÒ\u0087\u0083°)àö(TavÎ)ÍÇ'z'Ä%B@ìüi¯¨¥oÒåùc6©ÂüH?èg)$\u0004ë\u001a\u0092ð7ñCÛb|\u0082¿/ê\u008c^¹·\"U^i\u0016øFd\u0012ý\u0012|É¢W\u008c\u0081\u009b1\u009fétÆáPmÊÉ¯B}WÐM\u009d\u001a?`özêÖûW¶\u009cb\u0004.6\u0083'Ï`%Ñ\u00advnÂ¦\u001f/õ\u0095>Ë¹\u008d\u008dùnÍ\u0019Ësmy\u0089ý5\u0019|J0~ÊÖµ\u007fá°F\u0017ë\u0093z\u008eº3\u0092ZGQ¥.¾\t¤å¯ÁaÈ\t\u001cÃ\u0010K\u0001\u0000\u0083ÙXì,pL\u0018¢Óöú\n¿jÇ\u001ef\u009a\u009f6E\u0080H¡ÄV\u001d¹\u009cV/Y.|\u001dÕ_àÞ\u0000éÍÄÅóP.\u0016\u0086Ô\fü÷xüÖè+|.p'E#3Ùº&\u0082ý\u009bß;\u009f\"ÍÒZY»¢lÄï¨®\u0093QÑ\u0018¿\u0000HþA»6¸By\u0089Lâ@oV¾¡0×\u008a>Â²i^(Oá\u0089¡pÐ\u0000Ô\u0084AémqRãmq²h\u000fÃ"
                        .length();
                     byte var10 = 0;

                     label100:
                     while (true) {
                        byte var42 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var42, var10).getBytes("ISO-8859-1");
                        long[] var34 = var14;
                        int var43 = var11++;
                        long var56 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var66 = -1;

                        while (true) {
                           long var77 = var56 ^ var8;
                           switch (var66) {
                              case 0:
                                 var34[var43] = var77;
                                 if (var10 >= var13) {
                                    h = var14;
                                    j = new Integer[135];
                                    long var0 = 4049832507630397755L;
                                    long[] var6 = new long[15];
                                    int var3 = 0;
                                    String var4 = "ØÂ»]¹Í)°8s-S§ÓDþ(AiØI\u0098!*´ÐZ\u0090¼\u0002Óí&\u001f\r\u0003µÙ\u000f+buW\"\f`/k\u0092/È\u0013Ã4\u001a\b<¡,¬]\u0086Ï4\u0093»\u0018y>°Duù\u009c/\u0007IwàÑ\u008fiÖ\u0084\u001e\u0011%0ê·?rl\fP@ÓÑ\u001f\u0083îØ5\u0099";
                                    int var5 = "ØÂ»]¹Í)°8s-S§ÓDþ(AiØI\u0098!*´ÐZ\u0090¼\u0002Óí&\u001f\r\u0003µÙ\u000f+buW\"\f`/k\u0092/È\u0013Ã4\u001a\b<¡,¬]\u0086Ï4\u0093»\u0018y>°Duù\u009c/\u0007IwàÑ\u008fiÖ\u0084\u001e\u0011%0ê·?rl\fP@ÓÑ\u001f\u0083îØ5\u0099"
                                       .length();
                                    byte var2 = 0;

                                    label90:
                                    while (true) {
                                       byte var45 = var2;
                                       var2 += 8;
                                       var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
                                       long[] var35 = var6;
                                       int var46 = var3++;
                                       long var58 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var68 = -1;

                                       while (true) {
                                          var77 = var58 ^ var0;
                                          switch (var68) {
                                             case 0:
                                                var35[var46] = var77;
                                                if (var2 >= var5) {
                                                   p = var6;
                                                   q = new Long[15];
                                                   s = new ThreadLocal();
                                                   Z = ("\"" + Ok2.Z + a(10547, 15323)).toCharArray();
                                                   K = new int[a(17923, 2109405557441600347L)];
                                                   int var23 = a(21259, 1287927339301015045L);

                                                   try {
                                                      while (var23 <= a(24153, 3168790736949871469L)) {
                                                         K[var23] = var23 - a(21259, 1287927339301015045L);
                                                         var23++;
                                                      }
                                                   } catch (Hi2 var26) {
                                                      throw a(var26);
                                                   }

                                                   var23 = a(31880, 6345766455927677411L);

                                                   try {
                                                      while (var23 <= a(23709, 6885726342037307881L)) {
                                                         K[var23] = var23 - a(31880, 6345766455927677411L) + a(1861, 5349631099953699429L);
                                                         var23++;
                                                      }
                                                   } catch (Hi2 var25) {
                                                      throw a(var25);
                                                   }

                                                   var23 = a(31506, 427738362136340011L);

                                                   try {
                                                      while (var23 <= a(17399, 8707971467972353759L)) {
                                                         K[var23] = var23 - a(31506, 427738362136340011L) + a(1861, 5349631099953699429L);
                                                         var23++;
                                                      }

                                                      return;
                                                   } catch (Hi2 var24) {
                                                      throw a(var24);
                                                   }
                                                }
                                                break;
                                             default:
                                                var35[var46] = var77;
                                                if (var2 < var5) {
                                                   continue label90;
                                                }

                                                var4 = "ÒØnõÖ\u0095üíÊ`¼\u0010KÂáS";
                                                var5 = "ÒØnõÖ\u0095üíÊ`¼\u0010KÂáS".length();
                                                var2 = 0;
                                          }

                                          byte var47 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                          var35 = var6;
                                          var46 = var3++;
                                          var58 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var68 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var34[var43] = var77;
                                 if (var10 < var13) {
                                    continue label100;
                                 }

                                 var12 = "xNÿ\u0087äÏ2Ä\u0084ª×\u0092\u009c´ÌÛ";
                                 var13 = "xNÿ\u0087äÏ2Ä\u0084ª×\u0092\u009c´ÌÛ".length();
                                 var10 = 0;
                           }

                           byte var44 = var10;
                           var10 += 8;
                           var15 = var12.substring(var44, var10).getBytes("ISO-8859-1");
                           var34 = var14;
                           var43 = var11++;
                           var56 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var66 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var30);
                  break;
               default:
                  var21[var19++] = var65;
                  if ((var30 += var17) < var20) {
                     var17 = var18.charAt(var30);
                     continue label126;
                  }

                  var18 = "\u0005)ú»¡ØÍ\u009b\u0019¬·\u0018\\÷\u009a\nL¬@Ü>>Ù<Ç\t";
                  var20 = "\u0005)ú»¡ØÍ\u009b\u0019¬·\u0018\\÷\u009a\nL¬@Ü>>Ù<Ç\t".length();
                  var17 = 15;
                  var30 = -1;
            }

            var10000 = 50;
            var10001 = var18.substring(++var30, var30 + var17);
            var10002 = 0;
         }
      }
   }
}





