package com.finalshell.io;

import com.finalshell.core.Hi2;
import com.finalshell.core.Nv4;
import com.finalshell.core.Ok2;
import com.finalshell.core.S7;
import com.finalshell.ui.model.EP;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;

public final class YM3 extends Writer {
   public static ThreadLocal l;
   public static ThreadLocal C;
   public static char[] G;
   public static char[] F;
   public static int o;
   protected char[] U;
   protected int c;
   protected int q;
   public final Writer j;
   protected boolean R;
   protected boolean e;
   protected boolean K;
   protected boolean g;
   protected boolean A;
   protected boolean z;
   protected boolean d;
   protected boolean Y;
   protected boolean p;
   protected boolean D;
   protected char t;
   protected int M;
   protected boolean T;
   protected long s;
   static int b;
   public static String[] a;
   public static String[] f;
   public static long[] h;
   public static Integer[] i;
   public static long[] k;
   public static Long[] m;

   public YM3() {
      this((Writer)null);
   }

   public YM3(Writer var1) {
      this(var1, Ok2.a, EP.EMPTY);
   }

   public YM3(EP[] var1) {
      this(null, var1);
   }

   public YM3(Writer var1, EP[] var2) {
      this(var1, 0, var2);
   }

   public YM3(Writer param1, int param2, EP[] param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/io/Writer.<init> ()V
      // 04: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 07: aload 0
      // 08: bipush -1
      // 09: putfield com/finalshell/io/YM3.M I
      // 0c: astore 4
      // 0e: aload 0
      // 0f: aload 1
      // 10: putfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 13: aload 0
      // 14: getstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // 17: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 1a: checkcast [C
      // 1d: putfield com/finalshell/io/YM3.U [C
      // 20: aload 0
      // 21: aload 4
      // 23: ifnull 4e
      // 26: getfield com/finalshell/io/YM3.U [C
      // 29: ifnull 46
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: getstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // 36: aconst_null
      // 37: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 3a: aload 4
      // 3c: ifnonnull 5c
      // 3f: goto 46
      // 42: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: sipush 13312
      // 51: ldc2_w 3670573840539764632
      // 54: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 57: newarray 5
      // 59: putfield com/finalshell/io/YM3.U [C
      // 5c: iload 2
      // 5d: istore 5
      // 5f: aload 3
      // 60: astore 6
      // 62: aload 6
      // 64: arraylength
      // 65: istore 7
      // 67: bipush 0
      // 68: istore 8
      // 6a: iload 8
      // 6c: iload 7
      // 6e: if_icmpge 96
      // 71: aload 6
      // 73: iload 8
      // 75: aaload
      // 76: astore 9
      // 78: iload 5
      // 7a: aload 9
      // 7c: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 7f: ior
      // 80: istore 5
      // 82: iinc 8 1
      // 85: aload 4
      // 87: ifnull a0
      // 8a: aload 4
      // 8c: ifnonnull 6a
      // 8f: goto 96
      // 92: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 0
      // 97: iload 5
      // 99: putfield com/finalshell/io/YM3.q I
      // 9c: aload 0
      // 9d: invokevirtual com/finalshell/io/YM3.C ()V
      // a0: return
   }

   public int X() {
      return this.M;
   }

   public void h(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 47
      // 08: iload 1
      // 09: aload 0
      // 0a: getfield com/finalshell/io/YM3.U [C
      // 0d: arraylength
      // 0e: if_icmpge 42
      // 11: goto 18
      // 14: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: new com/finalshell/core/Hi2
      // 1b: dup
      // 1c: new java/lang/StringBuilder
      // 1f: dup
      // 20: invokespecial java/lang/StringBuilder.<init> ()V
      // 23: sipush -18222
      // 26: sipush -5187
      // 29: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: aload 0
      // 30: getfield com/finalshell/io/YM3.U [C
      // 33: arraylength
      // 34: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 37: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3d: athrow
      // 3e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: iload 1
      // 44: putfield com/finalshell/io/YM3.M I
      // 47: return
   }

   public int y() {
      return this.U.length;
   }

   public YM3(int var1) {
      this(null, var1);
   }

   public YM3(Writer param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/io/Writer.<init> ()V
      // 04: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 07: aload 0
      // 08: bipush -1
      // 09: putfield com/finalshell/io/YM3.M I
      // 0c: astore 3
      // 0d: aload 0
      // 0e: aload 1
      // 0f: putfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 12: aload 3
      // 13: ifnull 52
      // 16: iload 2
      // 17: ifgt 47
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: new java/lang/IllegalArgumentException
      // 24: dup
      // 25: new java/lang/StringBuilder
      // 28: dup
      // 29: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c: sipush -18229
      // 2f: sipush 28326
      // 32: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 35: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38: iload 2
      // 39: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 42: athrow
      // 43: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 0
      // 48: iload 2
      // 49: newarray 5
      // 4b: putfield com/finalshell/io/YM3.U [C
      // 4e: aload 0
      // 4f: invokevirtual com/finalshell/io/YM3.C ()V
      // 52: return
   }

   public void k(EP param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 3
      // 05: ifnull 27
      // 08: iload 2
      // 09: ifeq 7f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: dup
      // 15: getfield com/finalshell/io/YM3.q I
      // 18: aload 1
      // 19: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 1c: ior
      // 1d: putfield com/finalshell/io/YM3.q I
      // 20: goto 27
      // 23: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 1
      // 28: getstatic com/finalshell/ui/model/EP.WriteEnumUsingToString Lcom/finalshell/ui/model/EP;
      // 2b: aload 3
      // 2c: ifnull 60
      // 2f: if_acmpne 55
      // 32: goto 39
      // 35: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 0
      // 3a: dup
      // 3b: getfield com/finalshell/io/YM3.q I
      // 3e: getstatic com/finalshell/ui/model/EP.WriteEnumUsingName Lcom/finalshell/ui/model/EP;
      // 41: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 44: bipush -1
      // 45: ixor
      // 46: iand
      // 47: putfield com/finalshell/io/YM3.q I
      // 4a: aload 3
      // 4b: ifnonnull 95
      // 4e: goto 55
      // 51: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 1
      // 56: getstatic com/finalshell/ui/model/EP.WriteEnumUsingName Lcom/finalshell/ui/model/EP;
      // 59: goto 60
      // 5c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: if_acmpne 95
      // 63: aload 0
      // 64: dup
      // 65: getfield com/finalshell/io/YM3.q I
      // 68: getstatic com/finalshell/ui/model/EP.WriteEnumUsingToString Lcom/finalshell/ui/model/EP;
      // 6b: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 6e: bipush -1
      // 6f: ixor
      // 70: iand
      // 71: putfield com/finalshell/io/YM3.q I
      // 74: aload 3
      // 75: ifnonnull 95
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 0
      // 80: dup
      // 81: getfield com/finalshell/io/YM3.q I
      // 84: aload 1
      // 85: invokevirtual com/finalshell/ui/model/EP.a ()I
      // 88: bipush -1
      // 89: ixor
      // 8a: iand
      // 8b: putfield com/finalshell/io/YM3.q I
      // 8e: goto 95
      // 91: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: aload 0
      // 96: invokevirtual com/finalshell/io/YM3.C ()V
      // 99: return
   }

   protected void C() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 0
      // 006: getfield com/finalshell/io/YM3.q I
      // 009: getstatic com/finalshell/ui/model/EP.QuoteFieldNames Lcom/finalshell/ui/model/EP;
      // 00c: getfield com/finalshell/ui/model/EP.mask I
      // 00f: iand
      // 010: aload 1
      // 011: ifnull 01f
      // 014: ifeq 022
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: bipush 1
      // 01f: goto 023
      // 022: bipush 0
      // 023: putfield com/finalshell/io/YM3.e Z
      // 026: aload 0
      // 027: aload 0
      // 028: getfield com/finalshell/io/YM3.q I
      // 02b: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 02e: getfield com/finalshell/ui/model/EP.mask I
      // 031: iand
      // 032: aload 1
      // 033: ifnull 041
      // 036: ifeq 044
      // 039: goto 040
      // 03c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: bipush 1
      // 041: goto 045
      // 044: bipush 0
      // 045: putfield com/finalshell/io/YM3.R Z
      // 048: aload 0
      // 049: aload 0
      // 04a: getfield com/finalshell/io/YM3.q I
      // 04d: getstatic com/finalshell/ui/model/EP.SortField Lcom/finalshell/ui/model/EP;
      // 050: getfield com/finalshell/ui/model/EP.mask I
      // 053: iand
      // 054: aload 1
      // 055: ifnull 063
      // 058: ifeq 066
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: bipush 1
      // 063: goto 067
      // 066: bipush 0
      // 067: putfield com/finalshell/io/YM3.K Z
      // 06a: aload 0
      // 06b: aload 0
      // 06c: getfield com/finalshell/io/YM3.q I
      // 06f: getstatic com/finalshell/ui/model/EP.DisableCircularReferenceDetect Lcom/finalshell/ui/model/EP;
      // 072: getfield com/finalshell/ui/model/EP.mask I
      // 075: iand
      // 076: aload 1
      // 077: ifnull 085
      // 07a: ifeq 088
      // 07d: goto 084
      // 080: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: bipush 1
      // 085: goto 089
      // 088: bipush 0
      // 089: putfield com/finalshell/io/YM3.g Z
      // 08c: aload 0
      // 08d: aload 0
      // 08e: getfield com/finalshell/io/YM3.q I
      // 091: getstatic com/finalshell/ui/model/EP.BeanToArray Lcom/finalshell/ui/model/EP;
      // 094: getfield com/finalshell/ui/model/EP.mask I
      // 097: iand
      // 098: aload 1
      // 099: ifnull 0a7
      // 09c: ifeq 0aa
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: bipush 1
      // 0a7: goto 0ab
      // 0aa: bipush 0
      // 0ab: putfield com/finalshell/io/YM3.A Z
      // 0ae: aload 0
      // 0af: aload 0
      // 0b0: getfield com/finalshell/io/YM3.q I
      // 0b3: getstatic com/finalshell/ui/model/EP.WriteNonStringValueAsString Lcom/finalshell/ui/model/EP;
      // 0b6: getfield com/finalshell/ui/model/EP.mask I
      // 0b9: iand
      // 0ba: aload 1
      // 0bb: ifnull 0c9
      // 0be: ifeq 0cc
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: bipush 1
      // 0c9: goto 0cd
      // 0cc: bipush 0
      // 0cd: putfield com/finalshell/io/YM3.z Z
      // 0d0: aload 0
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/io/YM3.q I
      // 0d5: getstatic com/finalshell/ui/model/EP.NotWriteDefaultValue Lcom/finalshell/ui/model/EP;
      // 0d8: getfield com/finalshell/ui/model/EP.mask I
      // 0db: iand
      // 0dc: aload 1
      // 0dd: ifnull 0eb
      // 0e0: ifeq 0ee
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: bipush 1
      // 0eb: goto 0ef
      // 0ee: bipush 0
      // 0ef: putfield com/finalshell/io/YM3.d Z
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/io/YM3.q I
      // 0f7: getstatic com/finalshell/ui/model/EP.WriteEnumUsingName Lcom/finalshell/ui/model/EP;
      // 0fa: getfield com/finalshell/ui/model/EP.mask I
      // 0fd: iand
      // 0fe: aload 1
      // 0ff: ifnull 10d
      // 102: ifeq 110
      // 105: goto 10c
      // 108: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: bipush 1
      // 10d: goto 111
      // 110: bipush 0
      // 111: putfield com/finalshell/io/YM3.Y Z
      // 114: aload 0
      // 115: aload 0
      // 116: getfield com/finalshell/io/YM3.q I
      // 119: getstatic com/finalshell/ui/model/EP.WriteEnumUsingToString Lcom/finalshell/ui/model/EP;
      // 11c: getfield com/finalshell/ui/model/EP.mask I
      // 11f: iand
      // 120: aload 1
      // 121: ifnull 12f
      // 124: ifeq 132
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: goto 133
      // 132: bipush 0
      // 133: putfield com/finalshell/io/YM3.p Z
      // 136: aload 0
      // 137: aload 0
      // 138: getfield com/finalshell/io/YM3.e Z
      // 13b: aload 1
      // 13c: ifnull 158
      // 13f: ifeq 19c
      // 142: goto 149
      // 145: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield com/finalshell/io/YM3.q I
      // 14d: getstatic com/finalshell/io/YM3.b I
      // 150: iand
      // 151: goto 158
      // 154: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 1
      // 159: ifnull 171
      // 15c: ifne 19c
      // 15f: goto 166
      // 162: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 0
      // 167: getfield com/finalshell/io/YM3.A Z
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 1
      // 172: ifnull 199
      // 175: ifne 198
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 0
      // 180: getfield com/finalshell/io/YM3.Y Z
      // 183: aload 1
      // 184: ifnull 199
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: ifeq 19c
      // 191: goto 198
      // 194: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: bipush 1
      // 199: goto 19d
      // 19c: bipush 0
      // 19d: putfield com/finalshell/io/YM3.D Z
      // 1a0: aload 0
      // 1a1: aload 0
      // 1a2: getfield com/finalshell/io/YM3.R Z
      // 1a5: aload 1
      // 1a6: ifnull 1bc
      // 1a9: ifeq 1bf
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: sipush 745
      // 1b6: ldc2_w 8237602896978899237
      // 1b9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1bc: goto 1c8
      // 1bf: sipush 32680
      // 1c2: ldc2_w 6661901957014359160
      // 1c5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1c8: putfield com/finalshell/io/YM3.t C
      // 1cb: aload 0
      // 1cc: aload 0
      // 1cd: getfield com/finalshell/io/YM3.q I
      // 1d0: getstatic com/finalshell/ui/model/EP.BrowserSecure Lcom/finalshell/ui/model/EP;
      // 1d3: getfield com/finalshell/ui/model/EP.mask I
      // 1d6: iand
      // 1d7: aload 1
      // 1d8: ifnull 1e6
      // 1db: ifeq 1e9
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: bipush 1
      // 1e6: goto 1ea
      // 1e9: bipush 0
      // 1ea: putfield com/finalshell/io/YM3.T Z
      // 1ed: sipush 30844
      // 1f0: ldc2_w 4551467436829497383
      // 1f3: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 1f6: lstore 2
      // 1f7: sipush 11983
      // 1fa: ldc2_w 5310135334211882646
      // 1fd: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 200: lstore 4
      // 202: sipush 19232
      // 205: ldc2_w 7446413168064588666
      // 208: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 20b: lstore 6
      // 20d: aload 0
      // 20e: aload 0
      // 20f: getfield com/finalshell/io/YM3.T Z
      // 212: aload 1
      // 213: ifnull 23b
      // 216: ifeq 230
      // 219: goto 220
      // 21c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21f: athrow
      // 220: sipush 28806
      // 223: ldc2_w 8169367419362627806
      // 226: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 229: goto 257
      // 22c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22f: athrow
      // 230: aload 0
      // 231: getfield com/finalshell/io/YM3.q I
      // 234: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 237: getfield com/finalshell/ui/model/EP.mask I
      // 23a: iand
      // 23b: ifeq 24e
      // 23e: sipush 9941
      // 241: ldc2_w 2395300785692575368
      // 244: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 247: goto 257
      // 24a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: sipush 31805
      // 251: ldc2_w 2486020965703703649
      // 254: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 257: putfield com/finalshell/io/YM3.s J
      // 25a: aload 1
      // 25b: ifnonnull 26c
      // 25e: bipush 3
      // 25f: anewarray 225
      // 262: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 265: goto 26c
      // 268: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: return
   }

   public boolean d() {
      return this.K;
   }

   public boolean w$boolean() {
      return this.d;
   }

   public boolean I(EP var1) {
      String var2 = Nv4.o();

      try {
         int var10000 = this.q & var1.mask;
         if (var2 == null) {
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

   public boolean y(int var1) {
      String var2 = Nv4.o();

      try {
         int var10000 = this.q & var1;
         if (var2 == null) {
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

   @Override
   public void write(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/io/YM3.c I
      // 07: bipush 1
      // 08: iadd
      // 09: istore 3
      // 0a: astore 2
      // 0b: aload 2
      // 0c: ifnull 65
      // 0f: iload 3
      // 10: aload 0
      // 11: getfield com/finalshell/io/YM3.U [C
      // 14: arraylength
      // 15: if_icmple 55
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 2
      // 21: ifnull 50
      // 24: goto 2b
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 2e: ifnonnull 48
      // 31: goto 38
      // 34: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: iload 3
      // 3a: invokevirtual com/finalshell/io/YM3.L (I)V
      // 3d: aload 2
      // 3e: ifnonnull 55
      // 41: goto 48
      // 44: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: invokevirtual com/finalshell/io/YM3.flush ()V
      // 53: bipush 1
      // 54: istore 3
      // 55: aload 0
      // 56: getfield com/finalshell/io/YM3.U [C
      // 59: aload 0
      // 5a: getfield com/finalshell/io/YM3.c I
      // 5d: iload 1
      // 5e: i2c
      // 5f: castore
      // 60: aload 0
      // 61: iload 3
      // 62: putfield com/finalshell/io/YM3.c I
      // 65: return
   }

   @Override
   public void write(char[] param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 4
      // 005: iload 2
      // 006: aload 4
      // 008: ifnull 016
      // 00b: iflt 072
      // 00e: goto 015
      // 011: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: iload 2
      // 016: aload 4
      // 018: ifnull 02f
      // 01b: aload 1
      // 01c: arraylength
      // 01d: if_icmpgt 072
      // 020: goto 027
      // 023: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: iload 3
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 4
      // 031: ifnull 048
      // 034: iflt 072
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 2
      // 03f: iload 3
      // 040: iadd
      // 041: goto 048
      // 044: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 1
      // 049: arraylength
      // 04a: aload 4
      // 04c: ifnull 062
      // 04f: if_icmpgt 072
      // 052: goto 059
      // 055: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: iload 2
      // 05a: iload 3
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: iadd
      // 063: aload 4
      // 065: ifnull 07f
      // 068: ifge 07e
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: new java/lang/IndexOutOfBoundsException
      // 075: dup
      // 076: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 079: athrow
      // 07a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: iload 3
      // 07f: aload 4
      // 081: ifnull 095
      // 084: ifne 08f
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: return
      // 08f: aload 0
      // 090: getfield com/finalshell/io/YM3.c I
      // 093: iload 3
      // 094: iadd
      // 095: istore 5
      // 097: aload 4
      // 099: ifnull 137
      // 09c: iload 5
      // 09e: aload 0
      // 09f: getfield com/finalshell/io/YM3.U [C
      // 0a2: arraylength
      // 0a3: if_icmple 123
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 4
      // 0b0: ifnull 0e1
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0bd: ifnonnull 0d9
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: iload 5
      // 0ca: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0cd: aload 4
      // 0cf: ifnonnull 123
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: getfield com/finalshell/io/YM3.U [C
      // 0e4: arraylength
      // 0e5: aload 0
      // 0e6: getfield com/finalshell/io/YM3.c I
      // 0e9: isub
      // 0ea: istore 6
      // 0ec: aload 1
      // 0ed: iload 2
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/io/YM3.U [C
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/io/YM3.c I
      // 0f6: iload 6
      // 0f8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/io/YM3.U [C
      // 100: arraylength
      // 101: putfield com/finalshell/io/YM3.c I
      // 104: aload 0
      // 105: invokevirtual com/finalshell/io/YM3.flush ()V
      // 108: iload 3
      // 109: iload 6
      // 10b: isub
      // 10c: istore 3
      // 10d: iload 2
      // 10e: iload 6
      // 110: iadd
      // 111: istore 2
      // 112: iload 3
      // 113: aload 0
      // 114: getfield com/finalshell/io/YM3.U [C
      // 117: arraylength
      // 118: if_icmpgt 0d9
      // 11b: iload 3
      // 11c: aload 4
      // 11e: ifnull 113
      // 121: istore 5
      // 123: aload 1
      // 124: iload 2
      // 125: aload 0
      // 126: getfield com/finalshell/io/YM3.U [C
      // 129: aload 0
      // 12a: getfield com/finalshell/io/YM3.c I
      // 12d: iload 3
      // 12e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 131: aload 0
      // 132: iload 5
      // 134: putfield com/finalshell/io/YM3.c I
      // 137: return
   }

   public void L(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/io/YM3.M I
      // 08: bipush -1
      // 09: aload 2
      // 0a: ifnull 78
      // 0d: if_icmpeq 6a
      // 10: goto 17
      // 13: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: iload 1
      // 18: aload 0
      // 19: getfield com/finalshell/io/YM3.M I
      // 1c: aload 2
      // 1d: ifnull 78
      // 20: goto 27
      // 23: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: if_icmplt 6a
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: new com/finalshell/core/Hi2
      // 34: dup
      // 35: new java/lang/StringBuilder
      // 38: dup
      // 39: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c: sipush -18221
      // 3f: sipush 27586
      // 42: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: aload 0
      // 49: getfield com/finalshell/io/YM3.M I
      // 4c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4f: sipush -18217
      // 52: sipush -13015
      // 55: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 58: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5b: iload 1
      // 5c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 65: athrow
      // 66: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield com/finalshell/io/YM3.U [C
      // 6e: arraylength
      // 6f: aload 0
      // 70: getfield com/finalshell/io/YM3.U [C
      // 73: arraylength
      // 74: bipush 1
      // 75: ishr
      // 76: iadd
      // 77: bipush 1
      // 78: iadd
      // 79: istore 3
      // 7a: iload 3
      // 7b: aload 2
      // 7c: ifnull 8d
      // 7f: iload 1
      // 80: if_icmpge 8c
      // 83: goto 8a
      // 86: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: iload 1
      // 8b: istore 3
      // 8c: iload 3
      // 8d: newarray 5
      // 8f: astore 4
      // 91: aload 0
      // 92: getfield com/finalshell/io/YM3.U [C
      // 95: bipush 0
      // 96: aload 4
      // 98: bipush 0
      // 99: aload 0
      // 9a: getfield com/finalshell/io/YM3.c I
      // 9d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a0: aload 0
      // a1: aload 2
      // a2: ifnull ee
      // a5: getfield com/finalshell/io/YM3.U [C
      // a8: arraylength
      // a9: getstatic com/finalshell/io/YM3.o I
      // ac: if_icmpge ed
      // af: goto b6
      // b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: getstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // b9: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // bc: checkcast [C
      // bf: astore 5
      // c1: aload 5
      // c3: aload 2
      // c4: ifnull d3
      // c7: ifnull dc
      // ca: goto d1
      // cd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: aload 5
      // d3: arraylength
      // d4: aload 0
      // d5: getfield com/finalshell/io/YM3.U [C
      // d8: arraylength
      // d9: if_icmpge ed
      // dc: getstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // df: aload 0
      // e0: getfield com/finalshell/io/YM3.U [C
      // e3: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // e6: goto ed
      // e9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ec: athrow
      // ed: aload 0
      // ee: aload 4
      // f0: putfield com/finalshell/io/YM3.U [C
      // f3: return
   }

   public YM3 q(CharSequence param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 24
      // 09: ifnonnull 23
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: sipush -18216
      // 16: sipush -19122
      // 19: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 1c: goto 29
      // 1f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 1
      // 24: invokeinterface java/lang/CharSequence.toString ()Ljava/lang/String; 1
      // 29: astore 3
      // 2a: aload 0
      // 2b: aload 3
      // 2c: bipush 0
      // 2d: aload 3
      // 2e: invokevirtual java/lang/String.length ()I
      // 31: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;II)V
      // 34: aload 0
      // 35: areturn
   }

   public YM3 G(CharSequence var1, int var2, int var3) {
      Object var10000;
      label16: {
         try {
            if (var1 == null) {
               var10000 = a(-18227, -30511);
               break label16;
            }
         } catch (Hi2 var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      String var4 = var10000.subSequence(var2, var3).toString();
      this.write(var4, 0, var4.length());
      return this;
   }

   public YM3 T(char var1) {
      this.write(var1);
      return this;
   }

   @Override
   public void write(String param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/io/YM3.c I
      // 07: iload 3
      // 08: iadd
      // 09: istore 5
      // 0b: astore 4
      // 0d: aload 4
      // 0f: ifnull b1
      // 12: iload 5
      // 14: aload 0
      // 15: getfield com/finalshell/io/YM3.U [C
      // 18: arraylength
      // 19: if_icmple 9b
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: aload 4
      // 26: ifnull 57
      // 29: goto 30
      // 2c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 33: ifnonnull 4f
      // 36: goto 3d
      // 39: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 5
      // 40: invokevirtual com/finalshell/io/YM3.L (I)V
      // 43: aload 4
      // 45: ifnonnull 9b
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 0
      // 50: goto 57
      // 53: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: getfield com/finalshell/io/YM3.U [C
      // 5a: arraylength
      // 5b: aload 0
      // 5c: getfield com/finalshell/io/YM3.c I
      // 5f: isub
      // 60: istore 6
      // 62: aload 1
      // 63: iload 2
      // 64: iload 2
      // 65: iload 6
      // 67: iadd
      // 68: aload 0
      // 69: getfield com/finalshell/io/YM3.U [C
      // 6c: aload 0
      // 6d: getfield com/finalshell/io/YM3.c I
      // 70: invokevirtual java/lang/String.getChars (II[CI)V
      // 73: aload 0
      // 74: aload 0
      // 75: getfield com/finalshell/io/YM3.U [C
      // 78: arraylength
      // 79: putfield com/finalshell/io/YM3.c I
      // 7c: aload 0
      // 7d: invokevirtual com/finalshell/io/YM3.flush ()V
      // 80: iload 3
      // 81: iload 6
      // 83: isub
      // 84: istore 3
      // 85: iload 2
      // 86: iload 6
      // 88: iadd
      // 89: istore 2
      // 8a: iload 3
      // 8b: aload 0
      // 8c: getfield com/finalshell/io/YM3.U [C
      // 8f: arraylength
      // 90: if_icmpgt 4f
      // 93: iload 3
      // 94: aload 4
      // 96: ifnull 8b
      // 99: istore 5
      // 9b: aload 1
      // 9c: iload 2
      // 9d: iload 2
      // 9e: iload 3
      // 9f: iadd
      // a0: aload 0
      // a1: getfield com/finalshell/io/YM3.U [C
      // a4: aload 0
      // a5: getfield com/finalshell/io/YM3.c I
      // a8: invokevirtual java/lang/String.getChars (II[CI)V
      // ab: aload 0
      // ac: iload 5
      // ae: putfield com/finalshell/io/YM3.c I
      // b1: return
   }

   public void F(Writer param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 08: aload 2
      // 09: ifnull 2c
      // 0c: ifnull 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/UnsupportedOperationException
      // 19: dup
      // 1a: sipush -18230
      // 1d: sipush 24248
      // 20: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 23: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 1
      // 2c: aload 0
      // 2d: getfield com/finalshell/io/YM3.U [C
      // 30: bipush 0
      // 31: aload 0
      // 32: getfield com/finalshell/io/YM3.c I
      // 35: invokevirtual java/io/Writer.write ([CII)V
      // 38: return
   }

   public void W(OutputStream var1, String var2) throws IOException {
      this.I(var1, Charset.forName(var2));
   }

   public void I(OutputStream var1, Charset var2) throws IOException {
      this.c(var1, var2);
   }

   public int c(OutputStream var1, Charset var2) throws IOException {
      try {
         if (this.j != null) {
            throw new UnsupportedOperationException(a(-18230, 24248));
         }
      } catch (IOException var4) {
         throw a(var4);
      }

      try {
         if (var2 == S7.v) {
            return this.O(var1);
         }
      } catch (IOException var5) {
         throw a(var5);
      }

      byte[] var3 = new String(this.U, 0, this.c).getBytes(var2);
      var1.write(var3);
      return var3.length;
   }

   public char[] J() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 2c
      // 09: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0c: ifnull 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/UnsupportedOperationException
      // 19: dup
      // 1a: sipush -18230
      // 1d: sipush 24248
      // 20: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 23: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/YM3.c I
      // 2f: newarray 5
      // 31: astore 2
      // 32: aload 0
      // 33: getfield com/finalshell/io/YM3.U [C
      // 36: bipush 0
      // 37: aload 2
      // 38: bipush 0
      // 39: aload 0
      // 3a: getfield com/finalshell/io/YM3.c I
      // 3d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 40: aload 2
      // 41: areturn
   }

   public char[] B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 2c
      // 09: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0c: ifnull 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new java/lang/UnsupportedOperationException
      // 19: dup
      // 1a: sipush -18230
      // 1d: sipush 24248
      // 20: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 23: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/YM3.c I
      // 2f: bipush 2
      // 30: isub
      // 31: newarray 5
      // 33: astore 2
      // 34: aload 0
      // 35: getfield com/finalshell/io/YM3.U [C
      // 38: bipush 1
      // 39: aload 2
      // 3a: bipush 0
      // 3b: aload 0
      // 3c: getfield com/finalshell/io/YM3.c I
      // 3f: bipush 2
      // 40: isub
      // 41: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 44: aload 2
      // 45: areturn
   }

   public byte[] S(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: ifnull 1d
      // 0a: ifnull 2f
      // 0d: goto 14
      // 10: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: sipush -18210
      // 17: sipush -8309
      // 1a: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 1d: aload 2
      // 1e: ifnull 3a
      // 21: aload 1
      // 22: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 25: ifeq 39
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: getstatic com/finalshell/core/S7.v Ljava/nio/charset/Charset;
      // 32: goto 3d
      // 35: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 1
      // 3a: invokestatic java/nio/charset/Charset.forName (Ljava/lang/String;)Ljava/nio/charset/Charset;
      // 3d: invokevirtual com/finalshell/io/YM3.f (Ljava/nio/charset/Charset;)[B
      // 40: areturn
   }

   public byte[] f(Charset var1) {
      try {
         if (this.j != null) {
            throw new UnsupportedOperationException(a(-18224, -3916));
         }
      } catch (Hi2 var2) {
         throw a(var2);
      }

      try {
         if (var1 == S7.v) {
            return this.z();
         }
      } catch (Hi2 var3) {
         throw a(var3);
      }

      return new String(this.U, 0, this.c).getBytes(var1);
   }

   public int O(OutputStream param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/io/YM3.c I
      // 07: i2d
      // 08: ldc2_w 3.0
      // 0b: dmul
      // 0c: d2i
      // 0d: istore 3
      // 0e: astore 2
      // 0f: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // 12: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 15: checkcast [B
      // 18: astore 4
      // 1a: aload 4
      // 1c: aload 2
      // 1d: ifnull 41
      // 20: ifnonnull 3f
      // 23: goto 2a
      // 26: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: sipush 22948
      // 2d: ldc2_w 2204016931179932198
      // 30: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 33: newarray 8
      // 35: astore 4
      // 37: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // 3a: aload 4
      // 3c: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 3f: aload 4
      // 41: astore 5
      // 43: aload 4
      // 45: arraylength
      // 46: aload 2
      // 47: ifnull 68
      // 4a: iload 3
      // 4b: if_icmpge 5a
      // 4e: goto 55
      // 51: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: iload 3
      // 56: newarray 8
      // 58: astore 4
      // 5a: aload 0
      // 5b: getfield com/finalshell/io/YM3.U [C
      // 5e: bipush 0
      // 5f: aload 0
      // 60: getfield com/finalshell/io/YM3.c I
      // 63: aload 4
      // 65: invokestatic com/finalshell/core/S7.u ([CII[B)I
      // 68: istore 6
      // 6a: aload 1
      // 6b: aload 4
      // 6d: bipush 0
      // 6e: iload 6
      // 70: invokevirtual java/io/OutputStream.write ([BII)V
      // 73: aload 4
      // 75: aload 2
      // 76: ifnull 8e
      // 79: aload 5
      // 7b: if_acmpeq af
      // 7e: goto 85
      // 81: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 4
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: arraylength
      // 8f: aload 2
      // 90: ifnull b1
      // 93: getstatic com/finalshell/io/YM3.o I
      // 96: if_icmpgt af
      // 99: goto a0
      // 9c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // a3: aload 4
      // a5: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // a8: goto af
      // ab: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: iload 6
      // b1: ireturn
   }

   public byte[] z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/io/YM3.c I
      // 07: i2d
      // 08: ldc2_w 3.0
      // 0b: dmul
      // 0c: d2i
      // 0d: istore 2
      // 0e: astore 1
      // 0f: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // 12: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
      // 15: checkcast [B
      // 18: astore 3
      // 19: aload 3
      // 1a: aload 1
      // 1b: ifnull 3c
      // 1e: ifnonnull 3b
      // 21: goto 28
      // 24: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: sipush 31281
      // 2b: ldc2_w 4361305472630884770
      // 2e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 31: newarray 8
      // 33: astore 3
      // 34: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // 37: aload 3
      // 38: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 3b: aload 3
      // 3c: astore 4
      // 3e: aload 3
      // 3f: arraylength
      // 40: aload 1
      // 41: ifnull 60
      // 44: iload 2
      // 45: if_icmpge 53
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: iload 2
      // 50: newarray 8
      // 52: astore 3
      // 53: aload 0
      // 54: getfield com/finalshell/io/YM3.U [C
      // 57: bipush 0
      // 58: aload 0
      // 59: getfield com/finalshell/io/YM3.c I
      // 5c: aload 3
      // 5d: invokestatic com/finalshell/core/S7.u ([CII[B)I
      // 60: istore 5
      // 62: iload 5
      // 64: newarray 8
      // 66: astore 6
      // 68: aload 3
      // 69: bipush 0
      // 6a: aload 6
      // 6c: bipush 0
      // 6d: iload 5
      // 6f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 72: aload 3
      // 73: aload 1
      // 74: ifnull ad
      // 77: aload 4
      // 79: if_acmpeq ab
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 3
      // 84: aload 1
      // 85: ifnull ad
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: arraylength
      // 90: getstatic com/finalshell/io/YM3.o I
      // 93: if_icmpgt ab
      // 96: goto 9d
      // 99: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: getstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // a0: aload 3
      // a1: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // a4: goto ab
      // a7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: aload 6
      // ad: areturn
   }

   public int w$int() {
      return this.c;
   }

   @Override
   public String toString() {
      return new String(this.U, 0, this.c);
   }

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
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 3b
      // 09: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0c: ifnull 3a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/io/YM3.c I
      // 1a: aload 1
      // 1b: ifnull 4a
      // 1e: goto 25
      // 21: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifle 3a
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: invokevirtual com/finalshell/io/YM3.flush ()V
      // 33: goto 3a
      // 36: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: ifnull 62
      // 3f: getfield com/finalshell/io/YM3.U [C
      // 42: arraylength
      // 43: goto 4a
      // 46: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: getstatic com/finalshell/io/YM3.o I
      // 4d: if_icmpgt 61
      // 50: getstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // 53: aload 0
      // 54: getfield com/finalshell/io/YM3.U [C
      // 57: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 0
      // 62: aconst_null
      // 63: putfield com/finalshell/io/YM3.U [C
      // 66: return
   }

   @Override
   public void write(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 26
      // 08: aload 1
      // 09: ifnonnull 1c
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual com/finalshell/io/YM3.Y ()V
      // 17: return
      // 18: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: bipush 0
      // 1f: aload 1
      // 20: invokevirtual java/lang/String.length ()I
      // 23: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;II)V
      // 26: return
   }

   public void v(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnull 2f
      // 09: sipush 9474
      // 0c: ldc2_w 5485700167410046658
      // 0f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12: if_icmpne 2e
      // 15: goto 1c
      // 18: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: sipush -18212
      // 20: sipush 31614
      // 23: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 26: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 29: return
      // 2a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iload 1
      // 2f: aload 2
      // 30: ifnull 4c
      // 33: ifge 4b
      // 36: goto 3d
      // 39: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iload 1
      // 3e: ineg
      // 3f: invokestatic com/finalshell/core/S7.x (I)I
      // 42: bipush 1
      // 43: iadd
      // 44: goto 4f
      // 47: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 1
      // 4c: invokestatic com/finalshell/core/S7.x (I)I
      // 4f: istore 3
      // 50: aload 0
      // 51: getfield com/finalshell/io/YM3.c I
      // 54: iload 3
      // 55: iadd
      // 56: istore 4
      // 58: iload 4
      // 5a: aload 0
      // 5b: getfield com/finalshell/io/YM3.U [C
      // 5e: arraylength
      // 5f: aload 2
      // 60: ifnull b1
      // 63: if_icmple ae
      // 66: goto 6d
      // 69: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 2
      // 6f: ifnull 8e
      // 72: goto 79
      // 75: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 7c: ifnonnull 97
      // 7f: goto 86
      // 82: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 0
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: iload 4
      // 90: invokevirtual com/finalshell/io/YM3.L (I)V
      // 93: aload 2
      // 94: ifnonnull ae
      // 97: iload 3
      // 98: newarray 5
      // 9a: astore 5
      // 9c: iload 1
      // 9d: iload 3
      // 9e: aload 5
      // a0: invokestatic com/finalshell/core/S7.E (II[C)V
      // a3: aload 0
      // a4: aload 5
      // a6: bipush 0
      // a7: aload 5
      // a9: arraylength
      // aa: invokevirtual com/finalshell/io/YM3.write ([CII)V
      // ad: return
      // ae: iload 1
      // af: iload 4
      // b1: aload 0
      // b2: getfield com/finalshell/io/YM3.U [C
      // b5: invokestatic com/finalshell/core/S7.E (II[C)V
      // b8: aload 0
      // b9: iload 4
      // bb: putfield com/finalshell/io/YM3.c I
      // be: return
   }

   public void B(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 008: getfield com/finalshell/ui/model/EP.mask I
      // 00b: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 00e: aload 2
      // 00f: ifnull 028
      // 012: ifeq 026
      // 015: goto 01c
      // 018: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: aload 0
      // 01d: aload 1
      // 01e: invokevirtual com/finalshell/io/YM3.W ([B)V
      // 021: return
      // 022: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 1
      // 027: arraylength
      // 028: istore 3
      // 029: aload 0
      // 02a: getfield com/finalshell/io/YM3.R Z
      // 02d: aload 2
      // 02e: ifnull 044
      // 031: ifeq 047
      // 034: goto 03b
      // 037: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: sipush 745
      // 03e: ldc2_w 8237602896978899237
      // 041: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 044: goto 050
      // 047: sipush 32680
      // 04a: ldc2_w 6661901957014359160
      // 04d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 050: istore 4
      // 052: iload 3
      // 053: aload 2
      // 054: ifnull 06c
      // 057: ifne 091
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 0
      // 062: getfield com/finalshell/io/YM3.R Z
      // 065: goto 06c
      // 068: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: ifeq 07f
      // 06f: sipush -18215
      // 072: sipush -30317
      // 075: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 078: goto 088
      // 07b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: sipush -18223
      // 082: sipush -286
      // 085: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 088: astore 5
      // 08a: aload 0
      // 08b: aload 5
      // 08d: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 090: return
      // 091: getstatic com/finalshell/core/S7.z [C
      // 094: astore 5
      // 096: iload 3
      // 097: bipush 3
      // 098: idiv
      // 099: bipush 3
      // 09a: imul
      // 09b: istore 6
      // 09d: iload 3
      // 09e: bipush 1
      // 09f: isub
      // 0a0: bipush 3
      // 0a1: idiv
      // 0a2: bipush 1
      // 0a3: iadd
      // 0a4: bipush 2
      // 0a5: ishl
      // 0a6: istore 7
      // 0a8: aload 0
      // 0a9: getfield com/finalshell/io/YM3.c I
      // 0ac: istore 8
      // 0ae: aload 0
      // 0af: getfield com/finalshell/io/YM3.c I
      // 0b2: iload 7
      // 0b4: iadd
      // 0b5: bipush 2
      // 0b6: iadd
      // 0b7: istore 9
      // 0b9: iload 9
      // 0bb: aload 2
      // 0bc: ifnull 2b4
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/io/YM3.U [C
      // 0c3: arraylength
      // 0c4: if_icmple 2a1
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: aload 2
      // 0d0: ifnull 29c
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0dd: ifnull 29b
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: iload 4
      // 0ea: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0ed: bipush 0
      // 0ee: istore 10
      // 0f0: iload 10
      // 0f2: iload 6
      // 0f4: if_icmpge 1bb
      // 0f7: aload 1
      // 0f8: iload 10
      // 0fa: iinc 10 1
      // 0fd: baload
      // 0fe: sipush 4142
      // 101: ldc2_w 677802001263617019
      // 104: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 107: iand
      // 108: sipush 12275
      // 10b: ldc2_w 3854874294567132220
      // 10e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 111: ishl
      // 112: aload 1
      // 113: iload 10
      // 115: iinc 10 1
      // 118: baload
      // 119: sipush 10963
      // 11c: ldc2_w 7035864795917801800
      // 11f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 122: iand
      // 123: sipush 26013
      // 126: ldc2_w 6161215010688144955
      // 129: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12c: ishl
      // 12d: ior
      // 12e: aload 1
      // 12f: iload 10
      // 131: iinc 10 1
      // 134: baload
      // 135: sipush 10963
      // 138: ldc2_w 7035864795917801800
      // 13b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13e: iand
      // 13f: ior
      // 140: istore 11
      // 142: aload 0
      // 143: aload 5
      // 145: iload 11
      // 147: sipush 20995
      // 14a: ldc2_w 5910056461468934600
      // 14d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 150: iushr
      // 151: sipush 7638
      // 154: ldc2_w 819495717925023349
      // 157: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15a: iand
      // 15b: caload
      // 15c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 15f: aload 0
      // 160: aload 5
      // 162: iload 11
      // 164: sipush 1062
      // 167: ldc2_w 52276764489676699
      // 16a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 16d: iushr
      // 16e: sipush 29923
      // 171: ldc2_w 5472563698003216202
      // 174: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 177: iand
      // 178: caload
      // 179: invokevirtual com/finalshell/io/YM3.write (I)V
      // 17c: aload 0
      // 17d: aload 5
      // 17f: iload 11
      // 181: sipush 3986
      // 184: ldc2_w 2743502366801689638
      // 187: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 18a: iushr
      // 18b: sipush 29923
      // 18e: ldc2_w 5472563698003216202
      // 191: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 194: iand
      // 195: caload
      // 196: invokevirtual com/finalshell/io/YM3.write (I)V
      // 199: aload 0
      // 19a: aload 5
      // 19c: iload 11
      // 19e: sipush 29923
      // 1a1: ldc2_w 5472563698003216202
      // 1a4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1a7: iand
      // 1a8: caload
      // 1a9: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1ac: aload 2
      // 1ad: ifnull 1c1
      // 1b0: aload 2
      // 1b1: ifnonnull 0f0
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: iload 3
      // 1bc: iload 6
      // 1be: isub
      // 1bf: istore 10
      // 1c1: aload 2
      // 1c2: ifnull 29a
      // 1c5: iload 10
      // 1c7: ifle 294
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: aload 1
      // 1d2: iload 6
      // 1d4: baload
      // 1d5: sipush 10963
      // 1d8: ldc2_w 7035864795917801800
      // 1db: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1de: iand
      // 1df: sipush 8709
      // 1e2: ldc2_w 3518840093398847962
      // 1e5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1e8: ishl
      // 1e9: iload 10
      // 1eb: bipush 2
      // 1ec: aload 2
      // 1ed: ifnull 218
      // 1f0: goto 1f7
      // 1f3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f6: athrow
      // 1f7: if_icmpne 21c
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: aload 1
      // 202: iload 3
      // 203: bipush 1
      // 204: isub
      // 205: baload
      // 206: sipush 10963
      // 209: ldc2_w 7035864795917801800
      // 20c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 20f: iand
      // 210: bipush 2
      // 211: goto 218
      // 214: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: ishl
      // 219: goto 21d
      // 21c: bipush 0
      // 21d: ior
      // 21e: istore 11
      // 220: aload 0
      // 221: aload 5
      // 223: iload 11
      // 225: sipush 7603
      // 228: ldc2_w 7325892985974222453
      // 22b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 22e: ishr
      // 22f: caload
      // 230: invokevirtual com/finalshell/io/YM3.write (I)V
      // 233: aload 0
      // 234: aload 5
      // 236: iload 11
      // 238: sipush 3986
      // 23b: ldc2_w 2743502366801689638
      // 23e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 241: iushr
      // 242: sipush 29923
      // 245: ldc2_w 5472563698003216202
      // 248: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 24b: iand
      // 24c: caload
      // 24d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 250: aload 0
      // 251: iload 10
      // 253: aload 2
      // 254: ifnull 278
      // 257: bipush 2
      // 258: if_icmpne 27b
      // 25b: goto 262
      // 25e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 261: athrow
      // 262: aload 5
      // 264: iload 11
      // 266: sipush 29923
      // 269: ldc2_w 5472563698003216202
      // 26c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 26f: iand
      // 270: caload
      // 271: goto 278
      // 274: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 277: athrow
      // 278: goto 284
      // 27b: sipush 13406
      // 27e: ldc2_w 1995426737354131413
      // 281: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 284: invokevirtual com/finalshell/io/YM3.write (I)V
      // 287: aload 0
      // 288: sipush 22688
      // 28b: ldc2_w 8400170447684971390
      // 28e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 291: invokevirtual com/finalshell/io/YM3.write (I)V
      // 294: aload 0
      // 295: iload 4
      // 297: invokevirtual com/finalshell/io/YM3.write (I)V
      // 29a: return
      // 29b: aload 0
      // 29c: iload 9
      // 29e: invokevirtual com/finalshell/io/YM3.L (I)V
      // 2a1: aload 0
      // 2a2: iload 9
      // 2a4: putfield com/finalshell/io/YM3.c I
      // 2a7: aload 0
      // 2a8: getfield com/finalshell/io/YM3.U [C
      // 2ab: iload 8
      // 2ad: iinc 8 1
      // 2b0: iload 4
      // 2b2: castore
      // 2b3: bipush 0
      // 2b4: istore 10
      // 2b6: iload 8
      // 2b8: istore 11
      // 2ba: iload 10
      // 2bc: iload 6
      // 2be: if_icmpge 39d
      // 2c1: aload 1
      // 2c2: iload 10
      // 2c4: iinc 10 1
      // 2c7: baload
      // 2c8: sipush 10963
      // 2cb: ldc2_w 7035864795917801800
      // 2ce: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2d1: iand
      // 2d2: sipush 14189
      // 2d5: ldc2_w 5076241688261051577
      // 2d8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2db: ishl
      // 2dc: aload 1
      // 2dd: iload 10
      // 2df: iinc 10 1
      // 2e2: baload
      // 2e3: sipush 10963
      // 2e6: ldc2_w 7035864795917801800
      // 2e9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2ec: iand
      // 2ed: sipush 19011
      // 2f0: ldc2_w 74932091958442375
      // 2f3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2f6: ishl
      // 2f7: ior
      // 2f8: aload 1
      // 2f9: iload 10
      // 2fb: iinc 10 1
      // 2fe: baload
      // 2ff: sipush 10963
      // 302: ldc2_w 7035864795917801800
      // 305: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 308: iand
      // 309: ior
      // 30a: istore 12
      // 30c: aload 0
      // 30d: getfield com/finalshell/io/YM3.U [C
      // 310: iload 11
      // 312: iinc 11 1
      // 315: aload 5
      // 317: iload 12
      // 319: sipush 5251
      // 31c: ldc2_w 7115195474239285070
      // 31f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 322: iushr
      // 323: sipush 29923
      // 326: ldc2_w 5472563698003216202
      // 329: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 32c: iand
      // 32d: caload
      // 32e: castore
      // 32f: aload 0
      // 330: getfield com/finalshell/io/YM3.U [C
      // 333: iload 11
      // 335: iinc 11 1
      // 338: aload 5
      // 33a: iload 12
      // 33c: sipush 7603
      // 33f: ldc2_w 7325892985974222453
      // 342: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 345: iushr
      // 346: sipush 29923
      // 349: ldc2_w 5472563698003216202
      // 34c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 34f: iand
      // 350: caload
      // 351: castore
      // 352: aload 0
      // 353: getfield com/finalshell/io/YM3.U [C
      // 356: iload 11
      // 358: iinc 11 1
      // 35b: aload 5
      // 35d: iload 12
      // 35f: sipush 3986
      // 362: ldc2_w 2743502366801689638
      // 365: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 368: iushr
      // 369: sipush 29923
      // 36c: ldc2_w 5472563698003216202
      // 36f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 372: iand
      // 373: caload
      // 374: castore
      // 375: aload 0
      // 376: getfield com/finalshell/io/YM3.U [C
      // 379: iload 11
      // 37b: iinc 11 1
      // 37e: aload 5
      // 380: iload 12
      // 382: sipush 29923
      // 385: ldc2_w 5472563698003216202
      // 388: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 38b: iand
      // 38c: caload
      // 38d: castore
      // 38e: aload 2
      // 38f: ifnull 3a3
      // 392: aload 2
      // 393: ifnonnull 2ba
      // 396: goto 39d
      // 399: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: iload 3
      // 39e: iload 6
      // 3a0: isub
      // 3a1: istore 10
      // 3a3: aload 2
      // 3a4: ifnull 495
      // 3a7: iload 10
      // 3a9: ifle 48a
      // 3ac: goto 3b3
      // 3af: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b2: athrow
      // 3b3: aload 1
      // 3b4: iload 6
      // 3b6: baload
      // 3b7: sipush 10963
      // 3ba: ldc2_w 7035864795917801800
      // 3bd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3c0: iand
      // 3c1: sipush 23523
      // 3c4: ldc2_w 2731639075105253491
      // 3c7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3ca: ishl
      // 3cb: iload 10
      // 3cd: bipush 2
      // 3ce: aload 2
      // 3cf: ifnull 3fa
      // 3d2: goto 3d9
      // 3d5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: if_icmpne 3fe
      // 3dc: goto 3e3
      // 3df: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e2: athrow
      // 3e3: aload 1
      // 3e4: iload 3
      // 3e5: bipush 1
      // 3e6: isub
      // 3e7: baload
      // 3e8: sipush 10963
      // 3eb: ldc2_w 7035864795917801800
      // 3ee: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3f1: iand
      // 3f2: bipush 2
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: ishl
      // 3fb: goto 3ff
      // 3fe: bipush 0
      // 3ff: ior
      // 400: istore 11
      // 402: aload 0
      // 403: getfield com/finalshell/io/YM3.U [C
      // 406: iload 9
      // 408: bipush 5
      // 409: isub
      // 40a: aload 5
      // 40c: iload 11
      // 40e: sipush 7603
      // 411: ldc2_w 7325892985974222453
      // 414: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 417: ishr
      // 418: caload
      // 419: castore
      // 41a: aload 0
      // 41b: getfield com/finalshell/io/YM3.U [C
      // 41e: iload 9
      // 420: bipush 4
      // 421: isub
      // 422: aload 5
      // 424: iload 11
      // 426: sipush 3986
      // 429: ldc2_w 2743502366801689638
      // 42c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 42f: iushr
      // 430: sipush 29923
      // 433: ldc2_w 5472563698003216202
      // 436: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 439: iand
      // 43a: caload
      // 43b: castore
      // 43c: aload 0
      // 43d: getfield com/finalshell/io/YM3.U [C
      // 440: iload 9
      // 442: bipush 3
      // 443: isub
      // 444: iload 10
      // 446: aload 2
      // 447: ifnull 46b
      // 44a: bipush 2
      // 44b: if_icmpne 46e
      // 44e: goto 455
      // 451: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 454: athrow
      // 455: aload 5
      // 457: iload 11
      // 459: sipush 29923
      // 45c: ldc2_w 5472563698003216202
      // 45f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 462: iand
      // 463: caload
      // 464: goto 46b
      // 467: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46a: athrow
      // 46b: goto 477
      // 46e: sipush 22688
      // 471: ldc2_w 8400170447684971390
      // 474: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 477: castore
      // 478: aload 0
      // 479: getfield com/finalshell/io/YM3.U [C
      // 47c: iload 9
      // 47e: bipush 2
      // 47f: isub
      // 480: sipush 22688
      // 483: ldc2_w 8400170447684971390
      // 486: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 489: castore
      // 48a: aload 0
      // 48b: getfield com/finalshell/io/YM3.U [C
      // 48e: iload 9
      // 490: bipush 1
      // 491: isub
      // 492: iload 4
      // 494: castore
      // 495: return
   }

   public void W(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/io/YM3.c I
      // 007: aload 1
      // 008: arraylength
      // 009: bipush 2
      // 00a: imul
      // 00b: iadd
      // 00c: bipush 3
      // 00d: iadd
      // 00e: istore 3
      // 00f: astore 2
      // 010: iload 3
      // 011: aload 2
      // 012: ifnull 063
      // 015: aload 0
      // 016: getfield com/finalshell/io/YM3.U [C
      // 019: arraylength
      // 01a: if_icmple 030
      // 01d: goto 024
      // 020: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: iload 3
      // 026: invokevirtual com/finalshell/io/YM3.L (I)V
      // 029: goto 030
      // 02c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield com/finalshell/io/YM3.U [C
      // 034: aload 0
      // 035: dup
      // 036: getfield com/finalshell/io/YM3.c I
      // 039: dup_x1
      // 03a: bipush 1
      // 03b: iadd
      // 03c: putfield com/finalshell/io/YM3.c I
      // 03f: sipush 25680
      // 042: ldc2_w 3668966256805287879
      // 045: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 048: castore
      // 049: aload 0
      // 04a: getfield com/finalshell/io/YM3.U [C
      // 04d: aload 0
      // 04e: dup
      // 04f: getfield com/finalshell/io/YM3.c I
      // 052: dup_x1
      // 053: bipush 1
      // 054: iadd
      // 055: putfield com/finalshell/io/YM3.c I
      // 058: sipush 745
      // 05b: ldc2_w 8237602896978899237
      // 05e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 061: castore
      // 062: bipush 0
      // 063: istore 4
      // 065: iload 4
      // 067: aload 1
      // 068: arraylength
      // 069: if_icmpge 138
      // 06c: aload 1
      // 06d: iload 4
      // 06f: baload
      // 070: istore 5
      // 072: iload 5
      // 074: sipush 10963
      // 077: ldc2_w 7035864795917801800
      // 07a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07d: iand
      // 07e: istore 6
      // 080: iload 6
      // 082: bipush 4
      // 083: ishr
      // 084: istore 7
      // 086: iload 6
      // 088: sipush 21773
      // 08b: ldc2_w 6638525112670398138
      // 08e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 091: iand
      // 092: istore 8
      // 094: aload 0
      // 095: getfield com/finalshell/io/YM3.U [C
      // 098: aload 0
      // 099: dup
      // 09a: getfield com/finalshell/io/YM3.c I
      // 09d: dup_x1
      // 09e: bipush 1
      // 09f: iadd
      // 0a0: putfield com/finalshell/io/YM3.c I
      // 0a3: iload 7
      // 0a5: aload 2
      // 0a6: ifnull 150
      // 0a9: iload 7
      // 0ab: aload 2
      // 0ac: ifnull 0d9
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: sipush 23523
      // 0b9: ldc2_w 2731639075105253491
      // 0bc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0bf: if_icmpge 0dc
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: sipush 7439
      // 0cc: ldc2_w 4938701561976712839
      // 0cf: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: goto 0e5
      // 0dc: sipush 23214
      // 0df: ldc2_w 7089363054216751390
      // 0e2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e5: iadd
      // 0e6: i2c
      // 0e7: castore
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/io/YM3.U [C
      // 0ec: aload 0
      // 0ed: dup
      // 0ee: getfield com/finalshell/io/YM3.c I
      // 0f1: dup_x1
      // 0f2: bipush 1
      // 0f3: iadd
      // 0f4: putfield com/finalshell/io/YM3.c I
      // 0f7: iload 8
      // 0f9: iload 8
      // 0fb: aload 2
      // 0fc: ifnull 122
      // 0ff: sipush 23523
      // 102: ldc2_w 2731639075105253491
      // 105: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 108: if_icmpge 125
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: sipush 7439
      // 115: ldc2_w 4938701561976712839
      // 118: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: goto 12e
      // 125: sipush 5380
      // 128: ldc2_w 7203972641376528025
      // 12b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12e: iadd
      // 12f: i2c
      // 130: castore
      // 131: iinc 4 1
      // 134: aload 2
      // 135: ifnonnull 065
      // 138: aload 0
      // 139: getfield com/finalshell/io/YM3.U [C
      // 13c: aload 0
      // 13d: dup
      // 13e: getfield com/finalshell/io/YM3.c I
      // 141: dup_x1
      // 142: bipush 1
      // 143: iadd
      // 144: putfield com/finalshell/io/YM3.c I
      // 147: sipush 745
      // 14a: ldc2_w 8237602896978899237
      // 14d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 150: castore
      // 151: return
   }

   public void q(float param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 3
      // 005: ifnull 054
      // 008: fload 1
      // 009: fload 1
      // 00a: fcmpl
      // 00b: ifne 049
      // 00e: goto 015
      // 011: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: fload 1
      // 016: ldc_w Infinity
      // 019: fcmpl
      // 01a: aload 3
      // 01b: ifnull 03b
      // 01e: goto 025
      // 021: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifeq 049
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: fload 1
      // 030: ldc_w -Infinity
      // 033: fcmpl
      // 034: goto 03b
      // 037: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 3
      // 03c: ifnull 06d
      // 03f: ifne 058
      // 042: goto 049
      // 045: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 0
      // 04a: invokevirtual com/finalshell/io/YM3.Y ()V
      // 04d: goto 054
      // 050: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 3
      // 055: ifnonnull 14a
      // 058: aload 0
      // 059: getfield com/finalshell/io/YM3.c I
      // 05c: sipush 21773
      // 05f: ldc2_w 6638525112670398138
      // 062: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 065: iadd
      // 066: goto 06d
      // 069: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: istore 4
      // 06f: iload 4
      // 071: aload 3
      // 072: ifnull 105
      // 075: aload 0
      // 076: getfield com/finalshell/io/YM3.U [C
      // 079: arraylength
      // 07a: if_icmple 0f9
      // 07d: goto 084
      // 080: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: aload 0
      // 085: aload 3
      // 086: ifnull 0a5
      // 089: goto 090
      // 08c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 093: ifnonnull 0ae
      // 096: goto 09d
      // 099: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 0
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: iload 4
      // 0a7: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0aa: aload 3
      // 0ab: ifnonnull 0f9
      // 0ae: fload 1
      // 0af: invokestatic com/finalshell/core/AM.r (F)Ljava/lang/String;
      // 0b2: astore 5
      // 0b4: aload 0
      // 0b5: aload 5
      // 0b7: bipush 0
      // 0b8: aload 5
      // 0ba: invokevirtual java/lang/String.length ()I
      // 0bd: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;II)V
      // 0c0: iload 2
      // 0c1: aload 3
      // 0c2: ifnull 0e8
      // 0c5: ifeq 0f8
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 3
      // 0d1: ifnull 0ec
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 0de: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: ifeq 0f8
      // 0eb: aload 0
      // 0ec: sipush 14611
      // 0ef: ldc2_w 7931649215795219136
      // 0f2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0f8: return
      // 0f9: fload 1
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/io/YM3.U [C
      // 0fe: aload 0
      // 0ff: getfield com/finalshell/io/YM3.c I
      // 102: invokestatic com/finalshell/core/AM.J (F[CI)I
      // 105: istore 5
      // 107: aload 0
      // 108: dup
      // 109: getfield com/finalshell/io/YM3.c I
      // 10c: iload 5
      // 10e: iadd
      // 10f: putfield com/finalshell/io/YM3.c I
      // 112: iload 2
      // 113: aload 3
      // 114: ifnull 13a
      // 117: ifeq 14a
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 0
      // 122: aload 3
      // 123: ifnull 13e
      // 126: goto 12d
      // 129: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 130: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 133: goto 13a
      // 136: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: ifeq 14a
      // 13d: aload 0
      // 13e: sipush 31454
      // 141: ldc2_w 966707618756168031
      // 144: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 147: invokevirtual com/finalshell/io/YM3.write (I)V
      // 14a: return
   }

   public void B(double param1, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 4
      // 007: ifnull 03d
      // 00a: dload 1
      // 00b: invokestatic java/lang/Double.isNaN (D)Z
      // 00e: ifne 032
      // 011: goto 018
      // 014: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: dload 1
      // 019: invokestatic java/lang/Double.isInfinite (D)Z
      // 01c: aload 4
      // 01e: ifnull 04c
      // 021: goto 028
      // 024: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: ifeq 03e
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: invokevirtual com/finalshell/io/YM3.Y ()V
      // 036: goto 03d
      // 039: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: return
      // 03e: aload 0
      // 03f: getfield com/finalshell/io/YM3.c I
      // 042: sipush 24461
      // 045: ldc2_w 7324984970947406908
      // 048: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04b: iadd
      // 04c: istore 5
      // 04e: iload 5
      // 050: aload 4
      // 052: ifnull 0e9
      // 055: aload 0
      // 056: getfield com/finalshell/io/YM3.U [C
      // 059: arraylength
      // 05a: if_icmple 0dd
      // 05d: goto 064
      // 060: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 0
      // 065: aload 4
      // 067: ifnull 086
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 074: ifnonnull 090
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 0
      // 07f: goto 086
      // 082: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: iload 5
      // 088: invokevirtual com/finalshell/io/YM3.L (I)V
      // 08b: aload 4
      // 08d: ifnonnull 0dd
      // 090: dload 1
      // 091: invokestatic com/finalshell/core/Z2.U (D)Ljava/lang/String;
      // 094: astore 6
      // 096: aload 0
      // 097: aload 6
      // 099: bipush 0
      // 09a: aload 6
      // 09c: invokevirtual java/lang/String.length ()I
      // 09f: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;II)V
      // 0a2: iload 3
      // 0a3: aload 4
      // 0a5: ifnull 0cc
      // 0a8: ifeq 0dc
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: aload 4
      // 0b5: ifnull 0d0
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 0c2: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: ifeq 0dc
      // 0cf: aload 0
      // 0d0: sipush 19927
      // 0d3: ldc2_w 8288471564461424144
      // 0d6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0d9: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0dc: return
      // 0dd: dload 1
      // 0de: aload 0
      // 0df: getfield com/finalshell/io/YM3.U [C
      // 0e2: aload 0
      // 0e3: getfield com/finalshell/io/YM3.c I
      // 0e6: invokestatic com/finalshell/core/Z2.F (D[CI)I
      // 0e9: istore 6
      // 0eb: aload 0
      // 0ec: dup
      // 0ed: getfield com/finalshell/io/YM3.c I
      // 0f0: iload 6
      // 0f2: iadd
      // 0f3: putfield com/finalshell/io/YM3.c I
      // 0f6: iload 3
      // 0f7: aload 4
      // 0f9: ifnull 120
      // 0fc: ifeq 130
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 0
      // 107: aload 4
      // 109: ifnull 124
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 116: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 119: goto 120
      // 11c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: ifeq 130
      // 123: aload 0
      // 124: sipush 31714
      // 127: ldc2_w 5464267343006074980
      // 12a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 130: return
   }

   public void V(Enum param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 1e
      // 08: aload 1
      // 09: ifnonnull 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual com/finalshell/io/YM3.Y ()V
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: return
      // 1f: aconst_null
      // 20: astore 3
      // 21: aload 0
      // 22: getfield com/finalshell/io/YM3.Y Z
      // 25: aload 2
      // 26: ifnull 58
      // 29: ifeq 54
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: getfield com/finalshell/io/YM3.p Z
      // 37: aload 2
      // 38: ifnull 58
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: ifne 54
      // 45: goto 4c
      // 48: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 50: astore 3
      // 51: goto 60
      // 54: aload 0
      // 55: getfield com/finalshell/io/YM3.p Z
      // 58: ifeq 60
      // 5b: aload 1
      // 5c: invokevirtual java/lang/Enum.toString ()Ljava/lang/String;
      // 5f: astore 3
      // 60: aload 3
      // 61: ifnull ac
      // 64: aload 0
      // 65: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 68: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 6b: aload 2
      // 6c: ifnull 89
      // 6f: goto 76
      // 72: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: ifeq 8c
      // 79: goto 80
      // 7c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: sipush 745
      // 83: ldc2_w 8237602896978899237
      // 86: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 89: goto 95
      // 8c: sipush 32680
      // 8f: ldc2_w 6661901957014359160
      // 92: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 95: istore 4
      // 97: aload 0
      // 98: iload 4
      // 9a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 9d: aload 0
      // 9e: aload 3
      // 9f: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // a2: aload 0
      // a3: iload 4
      // a5: invokevirtual com/finalshell/io/YM3.write (I)V
      // a8: aload 2
      // a9: ifnonnull bb
      // ac: aload 0
      // ad: aload 1
      // ae: invokevirtual java/lang/Enum.ordinal ()I
      // b1: invokevirtual com/finalshell/io/YM3.v (I)V
      // b4: goto bb
      // b7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: return
   }

   /** @deprecated */
   public void u(long var1, char var3) throws IOException {
      this.i(var1);
      this.write(var3);
   }

   public void i(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 008: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 00b: aload 3
      // 00c: ifnull 027
      // 00f: ifeq 079
      // 012: goto 019
      // 015: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 01d: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 020: goto 027
      // 023: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 3
      // 028: ifnull 047
      // 02b: ifne 079
      // 02e: goto 035
      // 031: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: lload 1
      // 036: sipush 30959
      // 039: ldc2_w 6440959098057971902
      // 03c: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 03f: lcmp
      // 040: goto 047
      // 043: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 3
      // 048: ifnull 076
      // 04b: ifgt 075
      // 04e: goto 055
      // 051: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: lload 1
      // 056: sipush 1385
      // 059: ldc2_w 2370922580633429303
      // 05c: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 05f: lcmp
      // 060: aload 3
      // 061: ifnull 076
      // 064: goto 06b
      // 067: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: ifge 079
      // 06e: goto 075
      // 071: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: bipush 1
      // 076: goto 07a
      // 079: bipush 0
      // 07a: istore 4
      // 07c: lload 1
      // 07d: sipush 17475
      // 080: ldc2_w 2715585864214799379
      // 083: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 086: lcmp
      // 087: aload 3
      // 088: ifnull 0dc
      // 08b: ifne 0ce
      // 08e: goto 095
      // 091: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: iload 4
      // 097: ifeq 0b9
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: sipush -18214
      // 0a5: sipush -16868
      // 0a8: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 0ab: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0ae: aload 3
      // 0af: ifnonnull 0cd
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: sipush -18219
      // 0bd: sipush -9481
      // 0c0: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 0c3: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: return
      // 0ce: lload 1
      // 0cf: aload 3
      // 0d0: ifnull 0ee
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: ifge 0ed
      // 0df: lload 1
      // 0e0: lneg
      // 0e1: invokestatic com/finalshell/core/S7.u (J)I
      // 0e4: bipush 1
      // 0e5: iadd
      // 0e6: goto 0f1
      // 0e9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: lload 1
      // 0ee: invokestatic com/finalshell/core/S7.u (J)I
      // 0f1: istore 5
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/io/YM3.c I
      // 0f7: iload 5
      // 0f9: iadd
      // 0fa: istore 6
      // 0fc: iload 4
      // 0fe: aload 3
      // 0ff: ifnull 111
      // 102: ifeq 10f
      // 105: goto 10c
      // 108: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: iinc 6 2
      // 10f: iload 6
      // 111: aload 3
      // 112: ifnull 1af
      // 115: aload 0
      // 116: getfield com/finalshell/io/YM3.U [C
      // 119: arraylength
      // 11a: if_icmple 1ad
      // 11d: goto 124
      // 120: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 0
      // 125: aload 3
      // 126: ifnull 145
      // 129: goto 130
      // 12c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 133: ifnonnull 14e
      // 136: goto 13d
      // 139: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 0
      // 13e: goto 145
      // 141: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: iload 6
      // 147: invokevirtual com/finalshell/io/YM3.L (I)V
      // 14a: aload 3
      // 14b: ifnonnull 1ad
      // 14e: iload 5
      // 150: newarray 5
      // 152: astore 7
      // 154: lload 1
      // 155: iload 5
      // 157: aload 7
      // 159: invokestatic com/finalshell/core/S7.v (JI[C)V
      // 15c: aload 3
      // 15d: ifnull 197
      // 160: iload 4
      // 162: ifeq 19b
      // 165: goto 16c
      // 168: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 0
      // 16d: sipush 32680
      // 170: ldc2_w 6661901957014359160
      // 173: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 176: invokevirtual com/finalshell/io/YM3.write (I)V
      // 179: aload 0
      // 17a: aload 7
      // 17c: bipush 0
      // 17d: aload 7
      // 17f: arraylength
      // 180: invokevirtual com/finalshell/io/YM3.write ([CII)V
      // 183: aload 0
      // 184: sipush 32680
      // 187: ldc2_w 6661901957014359160
      // 18a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 18d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 190: goto 197
      // 193: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 3
      // 198: ifnonnull 1ac
      // 19b: aload 0
      // 19c: aload 7
      // 19e: bipush 0
      // 19f: aload 7
      // 1a1: arraylength
      // 1a2: invokevirtual com/finalshell/io/YM3.write ([CII)V
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: return
      // 1ad: iload 4
      // 1af: ifeq 1ed
      // 1b2: aload 0
      // 1b3: getfield com/finalshell/io/YM3.U [C
      // 1b6: aload 0
      // 1b7: getfield com/finalshell/io/YM3.c I
      // 1ba: sipush 32680
      // 1bd: ldc2_w 6661901957014359160
      // 1c0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1c3: castore
      // 1c4: lload 1
      // 1c5: iload 6
      // 1c7: bipush 1
      // 1c8: isub
      // 1c9: aload 0
      // 1ca: getfield com/finalshell/io/YM3.U [C
      // 1cd: invokestatic com/finalshell/core/S7.v (JI[C)V
      // 1d0: aload 0
      // 1d1: getfield com/finalshell/io/YM3.U [C
      // 1d4: iload 6
      // 1d6: bipush 1
      // 1d7: isub
      // 1d8: sipush 32680
      // 1db: ldc2_w 6661901957014359160
      // 1de: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1e1: castore
      // 1e2: aload 3
      // 1e3: ifnonnull 1fe
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: lload 1
      // 1ee: iload 6
      // 1f0: aload 0
      // 1f1: getfield com/finalshell/io/YM3.U [C
      // 1f4: invokestatic com/finalshell/core/S7.v (JI[C)V
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: iload 6
      // 201: putfield com/finalshell/io/YM3.c I
      // 204: return
   }

   public void Y() {
      this.write(a(-18216, -19122));
   }

   public void x(EP var1) {
      this.s(0, var1.mask);
   }

   public void s(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: iload 1
      // 005: iload 2
      // 006: iand
      // 007: aload 3
      // 008: ifnull 041
      // 00b: ifne 039
      // 00e: goto 015
      // 011: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: aload 0
      // 016: getfield com/finalshell/io/YM3.q I
      // 019: iload 2
      // 01a: iand
      // 01b: aload 3
      // 01c: ifnull 041
      // 01f: goto 026
      // 022: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: ifne 039
      // 029: goto 030
      // 02c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 0
      // 031: invokevirtual com/finalshell/io/YM3.Y ()V
      // 034: return
      // 035: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: iload 1
      // 03a: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 03d: getfield com/finalshell/ui/model/EP.mask I
      // 040: iand
      // 041: aload 3
      // 042: ifnull 07c
      // 045: ifeq 07b
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: iload 1
      // 050: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 053: getfield com/finalshell/ui/model/EP.mask I
      // 056: bipush -1
      // 057: ixor
      // 058: iand
      // 059: getstatic com/finalshell/ui/model/EP.WRITE_MAP_NULL_FEATURES I
      // 05c: iand
      // 05d: aload 3
      // 05e: ifnull 07c
      // 061: goto 068
      // 064: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: ifne 07b
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 0
      // 073: invokevirtual com/finalshell/io/YM3.Y ()V
      // 076: return
      // 077: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: iload 2
      // 07c: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 07f: getfield com/finalshell/ui/model/EP.mask I
      // 082: aload 3
      // 083: ifnull 0b6
      // 086: if_icmpne 0a8
      // 089: goto 090
      // 08c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 0
      // 091: sipush -18228
      // 094: sipush -24996
      // 097: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 09a: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 09d: aload 3
      // 09e: ifnonnull 13e
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 0ac: getfield com/finalshell/ui/model/EP.mask I
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 3
      // 0b7: ifnull 0e4
      // 0ba: if_icmpne 0d6
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: ldc_w ""
      // 0c8: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 0cb: aload 3
      // 0cc: ifnonnull 13e
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 2
      // 0d7: getstatic com/finalshell/ui/model/EP.WriteNullBooleanAsFalse Lcom/finalshell/ui/model/EP;
      // 0da: getfield com/finalshell/ui/model/EP.mask I
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 3
      // 0e5: ifnull 118
      // 0e8: if_icmpne 10a
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: sipush -18209
      // 0f6: sipush -9680
      // 0f9: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 0fc: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0ff: aload 3
      // 100: ifnonnull 13e
      // 103: goto 10a
      // 106: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: iload 2
      // 10b: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 10e: getfield com/finalshell/ui/model/EP.mask I
      // 111: goto 118
      // 114: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: if_icmpne 133
      // 11b: aload 0
      // 11c: sipush 11068
      // 11f: ldc2_w 124448384682547449
      // 122: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 125: invokevirtual com/finalshell/io/YM3.write (I)V
      // 128: aload 3
      // 129: ifnonnull 13e
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 0
      // 134: invokevirtual com/finalshell/io/YM3.Y ()V
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: return
   }

   public void j(String param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 0003: astore 3
      // 0004: aload 1
      // 0005: aload 3
      // 0006: ifnull 003b
      // 0009: ifnonnull 003a
      // 000c: goto 0013
      // 000f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0012: athrow
      // 0013: aload 0
      // 0014: aload 3
      // 0015: ifnull 0035
      // 0018: goto 001f
      // 001b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 001e: athrow
      // 001f: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0022: iload 2
      // 0023: ifeq 0039
      // 0026: goto 002d
      // 0029: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 002c: athrow
      // 002d: aload 0
      // 002e: goto 0035
      // 0031: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0034: athrow
      // 0035: iload 2
      // 0036: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0039: return
      // 003a: aload 1
      // 003b: invokevirtual java/lang/String.length ()I
      // 003e: istore 4
      // 0040: aload 0
      // 0041: getfield com/finalshell/io/YM3.c I
      // 0044: iload 4
      // 0046: iadd
      // 0047: bipush 2
      // 0048: iadd
      // 0049: istore 5
      // 004b: iload 2
      // 004c: aload 3
      // 004d: ifnull 005f
      // 0050: ifeq 005d
      // 0053: goto 005a
      // 0056: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0059: athrow
      // 005a: iinc 5 1
      // 005d: iload 5
      // 005f: aload 0
      // 0060: getfield com/finalshell/io/YM3.U [C
      // 0063: arraylength
      // 0064: aload 3
      // 0065: ifnull 05a4
      // 0068: if_icmple 059f
      // 006b: goto 0072
      // 006e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0071: athrow
      // 0072: aload 0
      // 0073: aload 3
      // 0074: ifnull 059a
      // 0077: goto 007e
      // 007a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 007d: athrow
      // 007e: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0081: ifnull 0599
      // 0084: goto 008b
      // 0087: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 008a: athrow
      // 008b: aload 0
      // 008c: sipush 32680
      // 008f: ldc2_w 6661901957014359160
      // 0092: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0095: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0098: bipush 0
      // 0099: istore 6
      // 009b: iload 6
      // 009d: aload 1
      // 009e: invokevirtual java/lang/String.length ()I
      // 00a1: if_icmpge 0570
      // 00a4: aload 1
      // 00a5: iload 6
      // 00a7: invokevirtual java/lang/String.charAt (I)C
      // 00aa: istore 7
      // 00ac: aload 0
      // 00ad: getstatic com/finalshell/ui/model/EP.BrowserSecure Lcom/finalshell/ui/model/EP;
      // 00b0: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 00b3: aload 3
      // 00b4: ifnull 0589
      // 00b7: aload 3
      // 00b8: ifnull 01e5
      // 00bb: goto 00c2
      // 00be: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00c1: athrow
      // 00c2: ifeq 01d7
      // 00c5: goto 00cc
      // 00c8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00cb: athrow
      // 00cc: iload 7
      // 00ce: sipush 9733
      // 00d1: ldc2_w 3098582508513318318
      // 00d4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 00d7: aload 3
      // 00d8: ifnull 00fe
      // 00db: goto 00e2
      // 00de: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00e1: athrow
      // 00e2: if_icmpeq 014c
      // 00e5: goto 00ec
      // 00e8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00eb: athrow
      // 00ec: iload 7
      // 00ee: sipush 7167
      // 00f1: ldc2_w 533731140055459941
      // 00f4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 00f7: goto 00fe
      // 00fa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00fd: athrow
      // 00fe: aload 3
      // 00ff: ifnull 011e
      // 0102: if_icmpeq 014c
      // 0105: goto 010c
      // 0108: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 010b: athrow
      // 010c: iload 7
      // 010e: sipush 9365
      // 0111: ldc2_w 5841398891035383596
      // 0114: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0117: goto 011e
      // 011a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011d: athrow
      // 011e: aload 3
      // 011f: ifnull 0149
      // 0122: if_icmpeq 014c
      // 0125: goto 012c
      // 0128: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012b: athrow
      // 012c: iload 7
      // 012e: aload 3
      // 012f: ifnull 01e5
      // 0132: goto 0139
      // 0135: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0138: athrow
      // 0139: sipush 10603
      // 013c: ldc2_w 7120517856793582322
      // 013f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0142: goto 0149
      // 0145: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0148: athrow
      // 0149: if_icmpne 01d7
      // 014c: aload 0
      // 014d: sipush 29331
      // 0150: ldc2_w 5838482518343647551
      // 0153: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0156: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0159: aload 0
      // 015a: sipush 2840
      // 015d: ldc2_w 8026305073874237628
      // 0160: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0163: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0166: aload 0
      // 0167: getstatic com/finalshell/core/S7.y [C
      // 016a: iload 7
      // 016c: sipush 7603
      // 016f: ldc2_w 7325892985974222453
      // 0172: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0175: iushr
      // 0176: sipush 1201
      // 0179: ldc2_w 5200089846859429744
      // 017c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 017f: iand
      // 0180: caload
      // 0181: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0184: aload 0
      // 0185: getstatic com/finalshell/core/S7.y [C
      // 0188: iload 7
      // 018a: sipush 19011
      // 018d: ldc2_w 74932091958442375
      // 0190: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0193: iushr
      // 0194: sipush 21773
      // 0197: ldc2_w 6638525112670398138
      // 019a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 019d: iand
      // 019e: caload
      // 019f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01a2: aload 0
      // 01a3: getstatic com/finalshell/core/S7.y [C
      // 01a6: iload 7
      // 01a8: bipush 4
      // 01a9: iushr
      // 01aa: sipush 21773
      // 01ad: ldc2_w 6638525112670398138
      // 01b0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01b3: iand
      // 01b4: caload
      // 01b5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01b8: aload 0
      // 01b9: getstatic com/finalshell/core/S7.y [C
      // 01bc: iload 7
      // 01be: sipush 21773
      // 01c1: ldc2_w 6638525112670398138
      // 01c4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01c7: iand
      // 01c8: caload
      // 01c9: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01cc: aload 3
      // 01cd: ifnonnull 0569
      // 01d0: goto 01d7
      // 01d3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d6: athrow
      // 01d7: aload 0
      // 01d8: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 01db: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 01de: goto 01e5
      // 01e1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e4: athrow
      // 01e5: aload 3
      // 01e6: ifnull 0437
      // 01e9: ifeq 042e
      // 01ec: goto 01f3
      // 01ef: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f2: athrow
      // 01f3: iload 7
      // 01f5: sipush 19011
      // 01f8: ldc2_w 74932091958442375
      // 01fb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01fe: aload 3
      // 01ff: ifnull 0225
      // 0202: goto 0209
      // 0205: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0208: athrow
      // 0209: if_icmpeq 02f3
      // 020c: goto 0213
      // 020f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0212: athrow
      // 0213: iload 7
      // 0215: sipush 7603
      // 0218: ldc2_w 7325892985974222453
      // 021b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 021e: goto 0225
      // 0221: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0224: athrow
      // 0225: aload 3
      // 0226: ifnull 0245
      // 0229: if_icmpeq 02f3
      // 022c: goto 0233
      // 022f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0232: athrow
      // 0233: iload 7
      // 0235: sipush 23523
      // 0238: ldc2_w 2731639075105253491
      // 023b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 023e: goto 0245
      // 0241: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0244: athrow
      // 0245: aload 3
      // 0246: ifnull 0265
      // 0249: if_icmpeq 02f3
      // 024c: goto 0253
      // 024f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0252: athrow
      // 0253: iload 7
      // 0255: sipush 13058
      // 0258: ldc2_w 5903679206401720468
      // 025b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 025e: goto 0265
      // 0261: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0264: athrow
      // 0265: aload 3
      // 0266: ifnull 0285
      // 0269: if_icmpeq 02f3
      // 026c: goto 0273
      // 026f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0272: athrow
      // 0273: iload 7
      // 0275: sipush 27912
      // 0278: ldc2_w 2955552917765299929
      // 027b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 027e: goto 0285
      // 0281: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0284: athrow
      // 0285: aload 3
      // 0286: ifnull 02a5
      // 0289: if_icmpeq 02f3
      // 028c: goto 0293
      // 028f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0292: athrow
      // 0293: iload 7
      // 0295: sipush 32680
      // 0298: ldc2_w 6661901957014359160
      // 029b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 029e: goto 02a5
      // 02a1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a4: athrow
      // 02a5: aload 3
      // 02a6: ifnull 02c5
      // 02a9: if_icmpeq 02f3
      // 02ac: goto 02b3
      // 02af: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b2: athrow
      // 02b3: iload 7
      // 02b5: sipush 4624
      // 02b8: ldc2_w 6912903878219129232
      // 02bb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02be: goto 02c5
      // 02c1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c4: athrow
      // 02c5: aload 3
      // 02c6: ifnull 02e5
      // 02c9: if_icmpeq 02f3
      // 02cc: goto 02d3
      // 02cf: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d2: athrow
      // 02d3: iload 7
      // 02d5: sipush 29331
      // 02d8: ldc2_w 5838482518343647551
      // 02db: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02de: goto 02e5
      // 02e1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e4: athrow
      // 02e5: aload 3
      // 02e6: ifnull 0327
      // 02e9: if_icmpne 0315
      // 02ec: goto 02f3
      // 02ef: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f2: athrow
      // 02f3: aload 0
      // 02f4: sipush 29331
      // 02f7: ldc2_w 5838482518343647551
      // 02fa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02fd: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0300: aload 0
      // 0301: getstatic com/finalshell/core/S7.Q [C
      // 0304: iload 7
      // 0306: caload
      // 0307: invokevirtual com/finalshell/io/YM3.write (I)V
      // 030a: aload 3
      // 030b: ifnonnull 0569
      // 030e: goto 0315
      // 0311: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0314: athrow
      // 0315: iload 7
      // 0317: sipush 15095
      // 031a: ldc2_w 2207052621178587477
      // 031d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0320: goto 0327
      // 0323: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0326: athrow
      // 0327: aload 3
      // 0328: ifnull 03a0
      // 032b: if_icmpge 038e
      // 032e: goto 0335
      // 0331: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0334: athrow
      // 0335: aload 0
      // 0336: sipush 29331
      // 0339: ldc2_w 5838482518343647551
      // 033c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 033f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0342: aload 0
      // 0343: sipush 32152
      // 0346: ldc2_w 2468978250544385558
      // 0349: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 034c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 034f: aload 0
      // 0350: sipush 7439
      // 0353: ldc2_w 4938701561976712839
      // 0356: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0359: invokevirtual com/finalshell/io/YM3.write (I)V
      // 035c: aload 0
      // 035d: sipush 7439
      // 0360: ldc2_w 4938701561976712839
      // 0363: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0366: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0369: aload 0
      // 036a: getstatic com/finalshell/core/S7.n [C
      // 036d: iload 7
      // 036f: bipush 2
      // 0370: imul
      // 0371: caload
      // 0372: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0375: aload 0
      // 0376: getstatic com/finalshell/core/S7.n [C
      // 0379: iload 7
      // 037b: bipush 2
      // 037c: imul
      // 037d: bipush 1
      // 037e: iadd
      // 037f: caload
      // 0380: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0383: aload 3
      // 0384: ifnonnull 0569
      // 0387: goto 038e
      // 038a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038d: athrow
      // 038e: iload 7
      // 0390: sipush 881
      // 0393: ldc2_w 2011838916470862052
      // 0396: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0399: goto 03a0
      // 039c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039f: athrow
      // 03a0: if_icmplt 055c
      // 03a3: aload 0
      // 03a4: sipush 29331
      // 03a7: ldc2_w 5838482518343647551
      // 03aa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03ad: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03b0: aload 0
      // 03b1: sipush 32152
      // 03b4: ldc2_w 2468978250544385558
      // 03b7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03ba: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03bd: aload 0
      // 03be: getstatic com/finalshell/core/S7.y [C
      // 03c1: iload 7
      // 03c3: sipush 7603
      // 03c6: ldc2_w 7325892985974222453
      // 03c9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03cc: iushr
      // 03cd: sipush 21773
      // 03d0: ldc2_w 6638525112670398138
      // 03d3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03d6: iand
      // 03d7: caload
      // 03d8: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03db: aload 0
      // 03dc: getstatic com/finalshell/core/S7.y [C
      // 03df: iload 7
      // 03e1: sipush 19011
      // 03e4: ldc2_w 74932091958442375
      // 03e7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03ea: iushr
      // 03eb: sipush 21773
      // 03ee: ldc2_w 6638525112670398138
      // 03f1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03f4: iand
      // 03f5: caload
      // 03f6: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03f9: aload 0
      // 03fa: getstatic com/finalshell/core/S7.y [C
      // 03fd: iload 7
      // 03ff: bipush 4
      // 0400: iushr
      // 0401: sipush 21773
      // 0404: ldc2_w 6638525112670398138
      // 0407: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 040a: iand
      // 040b: caload
      // 040c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 040f: aload 0
      // 0410: getstatic com/finalshell/core/S7.y [C
      // 0413: iload 7
      // 0415: sipush 21773
      // 0418: ldc2_w 6638525112670398138
      // 041b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 041e: iand
      // 041f: caload
      // 0420: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0423: aload 3
      // 0424: ifnonnull 0569
      // 0427: goto 042e
      // 042a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042d: athrow
      // 042e: iload 7
      // 0430: goto 0437
      // 0433: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0436: athrow
      // 0437: getstatic com/finalshell/core/S7.j [B
      // 043a: arraylength
      // 043b: aload 3
      // 043c: ifnull 0481
      // 043f: if_icmpge 0464
      // 0442: goto 0449
      // 0445: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0448: athrow
      // 0449: getstatic com/finalshell/core/S7.j [B
      // 044c: iload 7
      // 044e: baload
      // 044f: aload 3
      // 0450: ifnull 04c5
      // 0453: goto 045a
      // 0456: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0459: athrow
      // 045a: ifne 04a0
      // 045d: goto 0464
      // 0460: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0463: athrow
      // 0464: iload 7
      // 0466: aload 3
      // 0467: ifnull 049d
      // 046a: goto 0471
      // 046d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0470: athrow
      // 0471: sipush 4624
      // 0474: ldc2_w 6912903878219129232
      // 0477: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 047a: goto 0481
      // 047d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0480: athrow
      // 0481: if_icmpne 055c
      // 0484: aload 0
      // 0485: aload 3
      // 0486: ifnull 0564
      // 0489: goto 0490
      // 048c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048f: athrow
      // 0490: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 0493: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0496: goto 049d
      // 0499: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049c: athrow
      // 049d: ifeq 055c
      // 04a0: aload 0
      // 04a1: sipush 29331
      // 04a4: ldc2_w 5838482518343647551
      // 04a7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04aa: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04ad: aload 3
      // 04ae: ifnull 0558
      // 04b1: goto 04b8
      // 04b4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b7: athrow
      // 04b8: getstatic com/finalshell/core/S7.j [B
      // 04bb: iload 7
      // 04bd: baload
      // 04be: goto 04c5
      // 04c1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c4: athrow
      // 04c5: bipush 4
      // 04c6: if_icmpne 0547
      // 04c9: aload 0
      // 04ca: sipush 32152
      // 04cd: ldc2_w 2468978250544385558
      // 04d0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04d3: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04d6: aload 0
      // 04d7: getstatic com/finalshell/core/S7.y [C
      // 04da: iload 7
      // 04dc: sipush 7603
      // 04df: ldc2_w 7325892985974222453
      // 04e2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04e5: iushr
      // 04e6: sipush 21773
      // 04e9: ldc2_w 6638525112670398138
      // 04ec: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04ef: iand
      // 04f0: caload
      // 04f1: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04f4: aload 0
      // 04f5: getstatic com/finalshell/core/S7.y [C
      // 04f8: iload 7
      // 04fa: sipush 19011
      // 04fd: ldc2_w 74932091958442375
      // 0500: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0503: iushr
      // 0504: sipush 21773
      // 0507: ldc2_w 6638525112670398138
      // 050a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 050d: iand
      // 050e: caload
      // 050f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0512: aload 0
      // 0513: getstatic com/finalshell/core/S7.y [C
      // 0516: iload 7
      // 0518: bipush 4
      // 0519: iushr
      // 051a: sipush 21773
      // 051d: ldc2_w 6638525112670398138
      // 0520: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0523: iand
      // 0524: caload
      // 0525: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0528: aload 0
      // 0529: getstatic com/finalshell/core/S7.y [C
      // 052c: iload 7
      // 052e: sipush 21773
      // 0531: ldc2_w 6638525112670398138
      // 0534: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0537: iand
      // 0538: caload
      // 0539: invokevirtual com/finalshell/io/YM3.write (I)V
      // 053c: aload 3
      // 053d: ifnonnull 0569
      // 0540: goto 0547
      // 0543: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0546: athrow
      // 0547: aload 0
      // 0548: getstatic com/finalshell/core/S7.Q [C
      // 054b: iload 7
      // 054d: caload
      // 054e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0551: goto 0558
      // 0554: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0557: athrow
      // 0558: aload 3
      // 0559: ifnonnull 0569
      // 055c: aload 0
      // 055d: goto 0564
      // 0560: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0563: athrow
      // 0564: iload 7
      // 0566: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0569: iinc 6 1
      // 056c: aload 3
      // 056d: ifnonnull 009b
      // 0570: aload 0
      // 0571: sipush 32680
      // 0574: ldc2_w 6661901957014359160
      // 0577: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 057a: aload 3
      // 057b: ifnull 0595
      // 057e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0581: iload 2
      // 0582: goto 0589
      // 0585: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0588: athrow
      // 0589: ifeq 0598
      // 058c: aload 0
      // 058d: iload 2
      // 058e: goto 0595
      // 0591: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0594: athrow
      // 0595: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0598: return
      // 0599: aload 0
      // 059a: iload 5
      // 059c: invokevirtual com/finalshell/io/YM3.L (I)V
      // 059f: aload 0
      // 05a0: getfield com/finalshell/io/YM3.c I
      // 05a3: bipush 1
      // 05a4: iadd
      // 05a5: istore 6
      // 05a7: iload 6
      // 05a9: iload 4
      // 05ab: iadd
      // 05ac: istore 7
      // 05ae: aload 0
      // 05af: getfield com/finalshell/io/YM3.U [C
      // 05b2: aload 0
      // 05b3: getfield com/finalshell/io/YM3.c I
      // 05b6: sipush 32680
      // 05b9: ldc2_w 6661901957014359160
      // 05bc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 05bf: castore
      // 05c0: aload 1
      // 05c1: bipush 0
      // 05c2: iload 4
      // 05c4: aload 0
      // 05c5: getfield com/finalshell/io/YM3.U [C
      // 05c8: iload 6
      // 05ca: invokevirtual java/lang/String.getChars (II[CI)V
      // 05cd: aload 0
      // 05ce: iload 5
      // 05d0: putfield com/finalshell/io/YM3.c I
      // 05d3: aload 0
      // 05d4: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 05d7: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 05da: aload 3
      // 05db: ifnull 0b29
      // 05de: ifeq 0b28
      // 05e1: goto 05e8
      // 05e4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e7: athrow
      // 05e8: bipush -1
      // 05e9: istore 8
      // 05eb: iload 6
      // 05ed: istore 9
      // 05ef: iload 9
      // 05f1: iload 7
      // 05f3: if_icmpge 0775
      // 05f6: aload 0
      // 05f7: getfield com/finalshell/io/YM3.U [C
      // 05fa: iload 9
      // 05fc: caload
      // 05fd: istore 10
      // 05ff: iload 10
      // 0601: aload 3
      // 0602: ifnull 0665
      // 0605: sipush 32680
      // 0608: ldc2_w 6661901957014359160
      // 060b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 060e: aload 3
      // 060f: ifnull 0787
      // 0612: goto 0619
      // 0615: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0618: athrow
      // 0619: if_icmpeq 0663
      // 061c: goto 0623
      // 061f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0622: athrow
      // 0623: iload 10
      // 0625: aload 3
      // 0626: ifnull 0665
      // 0629: goto 0630
      // 062c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062f: athrow
      // 0630: sipush 4624
      // 0633: ldc2_w 6912903878219129232
      // 0636: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0639: if_icmpeq 0663
      // 063c: goto 0643
      // 063f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0642: athrow
      // 0643: iload 10
      // 0645: sipush 29331
      // 0648: ldc2_w 5838482518343647551
      // 064b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 064e: aload 3
      // 064f: ifnull 068b
      // 0652: goto 0659
      // 0655: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0658: athrow
      // 0659: if_icmpne 066e
      // 065c: goto 0663
      // 065f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0662: athrow
      // 0663: iload 9
      // 0665: istore 8
      // 0667: iinc 5 1
      // 066a: aload 3
      // 066b: ifnonnull 076e
      // 066e: iload 10
      // 0670: aload 3
      // 0671: ifnull 0710
      // 0674: goto 067b
      // 0677: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067a: athrow
      // 067b: sipush 19011
      // 067e: ldc2_w 74932091958442375
      // 0681: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0684: goto 068b
      // 0687: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068a: athrow
      // 068b: if_icmpeq 070e
      // 068e: iload 10
      // 0690: aload 3
      // 0691: ifnull 0710
      // 0694: goto 069b
      // 0697: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069a: athrow
      // 069b: sipush 7603
      // 069e: ldc2_w 7325892985974222453
      // 06a1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06a4: if_icmpeq 070e
      // 06a7: goto 06ae
      // 06aa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06ad: athrow
      // 06ae: iload 10
      // 06b0: aload 3
      // 06b1: ifnull 0710
      // 06b4: goto 06bb
      // 06b7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06ba: athrow
      // 06bb: sipush 23523
      // 06be: ldc2_w 2731639075105253491
      // 06c1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06c4: if_icmpeq 070e
      // 06c7: goto 06ce
      // 06ca: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06cd: athrow
      // 06ce: iload 10
      // 06d0: aload 3
      // 06d1: ifnull 0710
      // 06d4: goto 06db
      // 06d7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06da: athrow
      // 06db: sipush 13058
      // 06de: ldc2_w 5903679206401720468
      // 06e1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06e4: if_icmpeq 070e
      // 06e7: goto 06ee
      // 06ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06ed: athrow
      // 06ee: iload 10
      // 06f0: sipush 28589
      // 06f3: ldc2_w 2513251627265039423
      // 06f6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06f9: aload 3
      // 06fa: ifnull 072b
      // 06fd: goto 0704
      // 0700: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0703: athrow
      // 0704: if_icmpne 0719
      // 0707: goto 070e
      // 070a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070d: athrow
      // 070e: iload 9
      // 0710: istore 8
      // 0712: iinc 5 1
      // 0715: aload 3
      // 0716: ifnonnull 076e
      // 0719: iload 10
      // 071b: sipush 15095
      // 071e: ldc2_w 2207052621178587477
      // 0721: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0724: goto 072b
      // 0727: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072a: athrow
      // 072b: aload 3
      // 072c: ifnull 0761
      // 072f: if_icmpge 0744
      // 0732: goto 0739
      // 0735: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0738: athrow
      // 0739: iload 9
      // 073b: istore 8
      // 073d: iinc 5 5
      // 0740: aload 3
      // 0741: ifnonnull 076e
      // 0744: iload 10
      // 0746: aload 3
      // 0747: ifnull 0766
      // 074a: goto 0751
      // 074d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0750: athrow
      // 0751: sipush 17176
      // 0754: ldc2_w 5558249671418261723
      // 0757: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 075a: goto 0761
      // 075d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0760: athrow
      // 0761: if_icmplt 076e
      // 0764: iload 9
      // 0766: istore 8
      // 0768: iinc 5 5
      // 076b: goto 076e
      // 076e: iinc 9 1
      // 0771: aload 3
      // 0772: ifnonnull 05ef
      // 0775: iload 5
      // 0777: aload 3
      // 0778: ifnull 079f
      // 077b: aload 0
      // 077c: getfield com/finalshell/io/YM3.U [C
      // 077f: arraylength
      // 0780: goto 0787
      // 0783: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0786: athrow
      // 0787: if_icmple 0797
      // 078a: aload 0
      // 078b: iload 5
      // 078d: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0790: goto 0797
      // 0793: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0796: athrow
      // 0797: aload 0
      // 0798: iload 5
      // 079a: putfield com/finalshell/io/YM3.c I
      // 079d: iload 8
      // 079f: istore 9
      // 07a1: iload 9
      // 07a3: iload 6
      // 07a5: if_icmplt 0add
      // 07a8: aload 0
      // 07a9: getfield com/finalshell/io/YM3.U [C
      // 07ac: iload 9
      // 07ae: caload
      // 07af: istore 10
      // 07b1: aload 3
      // 07b2: ifnull 0898
      // 07b5: iload 10
      // 07b7: aload 3
      // 07b8: ifnull 0ade
      // 07bb: goto 07c2
      // 07be: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c1: athrow
      // 07c2: sipush 19011
      // 07c5: ldc2_w 74932091958442375
      // 07c8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07cb: if_icmpeq 0855
      // 07ce: goto 07d5
      // 07d1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d4: athrow
      // 07d5: iload 10
      // 07d7: sipush 7603
      // 07da: ldc2_w 7325892985974222453
      // 07dd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07e0: aload 3
      // 07e1: ifnull 0807
      // 07e4: goto 07eb
      // 07e7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07ea: athrow
      // 07eb: if_icmpeq 0855
      // 07ee: goto 07f5
      // 07f1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f4: athrow
      // 07f5: iload 10
      // 07f7: sipush 23523
      // 07fa: ldc2_w 2731639075105253491
      // 07fd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0800: goto 0807
      // 0803: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0806: athrow
      // 0807: aload 3
      // 0808: ifnull 0827
      // 080b: if_icmpeq 0855
      // 080e: goto 0815
      // 0811: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0814: athrow
      // 0815: iload 10
      // 0817: sipush 13058
      // 081a: ldc2_w 5903679206401720468
      // 081d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0820: goto 0827
      // 0823: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0826: athrow
      // 0827: aload 3
      // 0828: ifnull 0847
      // 082b: if_icmpeq 0855
      // 082e: goto 0835
      // 0831: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0834: athrow
      // 0835: iload 10
      // 0837: sipush 28589
      // 083a: ldc2_w 2513251627265039423
      // 083d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0840: goto 0847
      // 0843: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0846: athrow
      // 0847: aload 3
      // 0848: ifnull 08ae
      // 084b: if_icmpne 089c
      // 084e: goto 0855
      // 0851: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0854: athrow
      // 0855: aload 0
      // 0856: getfield com/finalshell/io/YM3.U [C
      // 0859: iload 9
      // 085b: bipush 1
      // 085c: iadd
      // 085d: aload 0
      // 085e: getfield com/finalshell/io/YM3.U [C
      // 0861: iload 9
      // 0863: bipush 2
      // 0864: iadd
      // 0865: iload 7
      // 0867: iload 9
      // 0869: isub
      // 086a: bipush 1
      // 086b: isub
      // 086c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 086f: aload 0
      // 0870: getfield com/finalshell/io/YM3.U [C
      // 0873: iload 9
      // 0875: sipush 29331
      // 0878: ldc2_w 5838482518343647551
      // 087b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 087e: castore
      // 087f: aload 0
      // 0880: getfield com/finalshell/io/YM3.U [C
      // 0883: iload 9
      // 0885: bipush 1
      // 0886: iadd
      // 0887: getstatic com/finalshell/core/S7.Q [C
      // 088a: iload 10
      // 088c: caload
      // 088d: castore
      // 088e: iinc 7 1
      // 0891: goto 0898
      // 0894: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0897: athrow
      // 0898: aload 3
      // 0899: ifnonnull 0ad6
      // 089c: iload 10
      // 089e: sipush 32680
      // 08a1: ldc2_w 6661901957014359160
      // 08a4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08a7: goto 08ae
      // 08aa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08ad: athrow
      // 08ae: aload 3
      // 08af: ifnull 08ce
      // 08b2: if_icmpeq 08fc
      // 08b5: goto 08bc
      // 08b8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08bb: athrow
      // 08bc: iload 10
      // 08be: sipush 4624
      // 08c1: ldc2_w 6912903878219129232
      // 08c4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08c7: goto 08ce
      // 08ca: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08cd: athrow
      // 08ce: aload 3
      // 08cf: ifnull 08ee
      // 08d2: if_icmpeq 08fc
      // 08d5: goto 08dc
      // 08d8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08db: athrow
      // 08dc: iload 10
      // 08de: sipush 29331
      // 08e1: ldc2_w 5838482518343647551
      // 08e4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08e7: goto 08ee
      // 08ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08ed: athrow
      // 08ee: aload 3
      // 08ef: ifnull 0951
      // 08f2: if_icmpne 093f
      // 08f5: goto 08fc
      // 08f8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08fb: athrow
      // 08fc: aload 0
      // 08fd: getfield com/finalshell/io/YM3.U [C
      // 0900: iload 9
      // 0902: bipush 1
      // 0903: iadd
      // 0904: aload 0
      // 0905: getfield com/finalshell/io/YM3.U [C
      // 0908: iload 9
      // 090a: bipush 2
      // 090b: iadd
      // 090c: iload 7
      // 090e: iload 9
      // 0910: isub
      // 0911: bipush 1
      // 0912: isub
      // 0913: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0916: aload 0
      // 0917: getfield com/finalshell/io/YM3.U [C
      // 091a: iload 9
      // 091c: sipush 29331
      // 091f: ldc2_w 5838482518343647551
      // 0922: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0925: castore
      // 0926: aload 0
      // 0927: getfield com/finalshell/io/YM3.U [C
      // 092a: iload 9
      // 092c: bipush 1
      // 092d: iadd
      // 092e: iload 10
      // 0930: castore
      // 0931: iinc 7 1
      // 0934: aload 3
      // 0935: ifnonnull 0ad6
      // 0938: goto 093f
      // 093b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093e: athrow
      // 093f: iload 10
      // 0941: sipush 15095
      // 0944: ldc2_w 2207052621178587477
      // 0947: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 094a: goto 0951
      // 094d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0950: athrow
      // 0951: aload 3
      // 0952: ifnull 0a0b
      // 0955: if_icmpge 09f9
      // 0958: goto 095f
      // 095b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095e: athrow
      // 095f: aload 0
      // 0960: getfield com/finalshell/io/YM3.U [C
      // 0963: iload 9
      // 0965: bipush 1
      // 0966: iadd
      // 0967: aload 0
      // 0968: getfield com/finalshell/io/YM3.U [C
      // 096b: iload 9
      // 096d: sipush 3986
      // 0970: ldc2_w 2743502366801689638
      // 0973: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0976: iadd
      // 0977: iload 7
      // 0979: iload 9
      // 097b: isub
      // 097c: bipush 1
      // 097d: isub
      // 097e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0981: aload 0
      // 0982: getfield com/finalshell/io/YM3.U [C
      // 0985: iload 9
      // 0987: sipush 29331
      // 098a: ldc2_w 5838482518343647551
      // 098d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0990: castore
      // 0991: aload 0
      // 0992: getfield com/finalshell/io/YM3.U [C
      // 0995: iload 9
      // 0997: bipush 1
      // 0998: iadd
      // 0999: sipush 32152
      // 099c: ldc2_w 2468978250544385558
      // 099f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09a2: castore
      // 09a3: aload 0
      // 09a4: getfield com/finalshell/io/YM3.U [C
      // 09a7: iload 9
      // 09a9: bipush 2
      // 09aa: iadd
      // 09ab: sipush 7439
      // 09ae: ldc2_w 4938701561976712839
      // 09b1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09b4: castore
      // 09b5: aload 0
      // 09b6: getfield com/finalshell/io/YM3.U [C
      // 09b9: iload 9
      // 09bb: bipush 3
      // 09bc: iadd
      // 09bd: sipush 7439
      // 09c0: ldc2_w 4938701561976712839
      // 09c3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09c6: castore
      // 09c7: aload 0
      // 09c8: getfield com/finalshell/io/YM3.U [C
      // 09cb: iload 9
      // 09cd: bipush 4
      // 09ce: iadd
      // 09cf: getstatic com/finalshell/core/S7.n [C
      // 09d2: iload 10
      // 09d4: bipush 2
      // 09d5: imul
      // 09d6: caload
      // 09d7: castore
      // 09d8: aload 0
      // 09d9: getfield com/finalshell/io/YM3.U [C
      // 09dc: iload 9
      // 09de: bipush 5
      // 09df: iadd
      // 09e0: getstatic com/finalshell/core/S7.n [C
      // 09e3: iload 10
      // 09e5: bipush 2
      // 09e6: imul
      // 09e7: bipush 1
      // 09e8: iadd
      // 09e9: caload
      // 09ea: castore
      // 09eb: iinc 7 5
      // 09ee: aload 3
      // 09ef: ifnonnull 0ad6
      // 09f2: goto 09f9
      // 09f5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f8: athrow
      // 09f9: iload 10
      // 09fb: sipush 17176
      // 09fe: ldc2_w 5558249671418261723
      // 0a01: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a04: goto 0a0b
      // 0a07: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0a: athrow
      // 0a0b: if_icmplt 0ad6
      // 0a0e: aload 0
      // 0a0f: getfield com/finalshell/io/YM3.U [C
      // 0a12: iload 9
      // 0a14: bipush 1
      // 0a15: iadd
      // 0a16: aload 0
      // 0a17: getfield com/finalshell/io/YM3.U [C
      // 0a1a: iload 9
      // 0a1c: sipush 3986
      // 0a1f: ldc2_w 2743502366801689638
      // 0a22: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a25: iadd
      // 0a26: iload 7
      // 0a28: iload 9
      // 0a2a: isub
      // 0a2b: bipush 1
      // 0a2c: isub
      // 0a2d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a30: aload 0
      // 0a31: getfield com/finalshell/io/YM3.U [C
      // 0a34: iload 9
      // 0a36: sipush 29331
      // 0a39: ldc2_w 5838482518343647551
      // 0a3c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a3f: castore
      // 0a40: aload 0
      // 0a41: getfield com/finalshell/io/YM3.U [C
      // 0a44: iload 9
      // 0a46: bipush 1
      // 0a47: iadd
      // 0a48: sipush 32152
      // 0a4b: ldc2_w 2468978250544385558
      // 0a4e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a51: castore
      // 0a52: aload 0
      // 0a53: getfield com/finalshell/io/YM3.U [C
      // 0a56: iload 9
      // 0a58: bipush 2
      // 0a59: iadd
      // 0a5a: getstatic com/finalshell/core/S7.y [C
      // 0a5d: iload 10
      // 0a5f: sipush 7603
      // 0a62: ldc2_w 7325892985974222453
      // 0a65: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a68: iushr
      // 0a69: sipush 21773
      // 0a6c: ldc2_w 6638525112670398138
      // 0a6f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a72: iand
      // 0a73: caload
      // 0a74: castore
      // 0a75: aload 0
      // 0a76: getfield com/finalshell/io/YM3.U [C
      // 0a79: iload 9
      // 0a7b: bipush 3
      // 0a7c: iadd
      // 0a7d: getstatic com/finalshell/core/S7.y [C
      // 0a80: iload 10
      // 0a82: sipush 19011
      // 0a85: ldc2_w 74932091958442375
      // 0a88: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a8b: iushr
      // 0a8c: sipush 21773
      // 0a8f: ldc2_w 6638525112670398138
      // 0a92: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a95: iand
      // 0a96: caload
      // 0a97: castore
      // 0a98: aload 0
      // 0a99: getfield com/finalshell/io/YM3.U [C
      // 0a9c: iload 9
      // 0a9e: bipush 4
      // 0a9f: iadd
      // 0aa0: getstatic com/finalshell/core/S7.y [C
      // 0aa3: iload 10
      // 0aa5: bipush 4
      // 0aa6: iushr
      // 0aa7: sipush 21773
      // 0aaa: ldc2_w 6638525112670398138
      // 0aad: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ab0: iand
      // 0ab1: caload
      // 0ab2: castore
      // 0ab3: aload 0
      // 0ab4: getfield com/finalshell/io/YM3.U [C
      // 0ab7: iload 9
      // 0ab9: bipush 5
      // 0aba: iadd
      // 0abb: getstatic com/finalshell/core/S7.y [C
      // 0abe: iload 10
      // 0ac0: sipush 21773
      // 0ac3: ldc2_w 6638525112670398138
      // 0ac6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ac9: iand
      // 0aca: caload
      // 0acb: castore
      // 0acc: iinc 7 5
      // 0acf: goto 0ad6
      // 0ad2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad5: athrow
      // 0ad6: iinc 9 -1
      // 0ad9: aload 3
      // 0ada: ifnonnull 07a1
      // 0add: iload 2
      // 0ade: ifeq 0b0c
      // 0ae1: aload 0
      // 0ae2: getfield com/finalshell/io/YM3.U [C
      // 0ae5: aload 0
      // 0ae6: getfield com/finalshell/io/YM3.c I
      // 0ae9: bipush 2
      // 0aea: isub
      // 0aeb: sipush 32680
      // 0aee: ldc2_w 6661901957014359160
      // 0af1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0af4: castore
      // 0af5: aload 0
      // 0af6: getfield com/finalshell/io/YM3.U [C
      // 0af9: aload 0
      // 0afa: getfield com/finalshell/io/YM3.c I
      // 0afd: bipush 1
      // 0afe: isub
      // 0aff: iload 2
      // 0b00: castore
      // 0b01: aload 3
      // 0b02: ifnonnull 0b27
      // 0b05: goto 0b0c
      // 0b08: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0b: athrow
      // 0b0c: aload 0
      // 0b0d: getfield com/finalshell/io/YM3.U [C
      // 0b10: aload 0
      // 0b11: getfield com/finalshell/io/YM3.c I
      // 0b14: bipush 1
      // 0b15: isub
      // 0b16: sipush 32680
      // 0b19: ldc2_w 6661901957014359160
      // 0b1c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b1f: castore
      // 0b20: goto 0b27
      // 0b23: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b26: athrow
      // 0b27: return
      // 0b28: bipush 0
      // 0b29: istore 8
      // 0b2b: bipush -1
      // 0b2c: istore 9
      // 0b2e: bipush -1
      // 0b2f: istore 10
      // 0b31: bipush 0
      // 0b32: istore 11
      // 0b34: iload 6
      // 0b36: istore 12
      // 0b38: iload 12
      // 0b3a: iload 7
      // 0b3c: if_icmpge 0d6b
      // 0b3f: aload 0
      // 0b40: getfield com/finalshell/io/YM3.U [C
      // 0b43: iload 12
      // 0b45: caload
      // 0b46: istore 13
      // 0b48: iload 13
      // 0b4a: sipush 10460
      // 0b4d: ldc2_w 6283370691821230963
      // 0b50: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b53: aload 3
      // 0b54: ifnull 0d89
      // 0b57: aload 3
      // 0b58: ifnull 0c2c
      // 0b5b: goto 0b62
      // 0b5e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b61: athrow
      // 0b62: if_icmplt 0c1a
      // 0b65: goto 0b6c
      // 0b68: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6b: athrow
      // 0b6c: iload 13
      // 0b6e: sipush 17176
      // 0b71: ldc2_w 5558249671418261723
      // 0b74: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b77: aload 3
      // 0b78: ifnull 0b9e
      // 0b7b: goto 0b82
      // 0b7e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b81: athrow
      // 0b82: if_icmplt 0d64
      // 0b85: goto 0b8c
      // 0b88: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8b: athrow
      // 0b8c: iload 13
      // 0b8e: sipush 14504
      // 0b91: ldc2_w 8217363719508315007
      // 0b94: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b97: goto 0b9e
      // 0b9a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9d: athrow
      // 0b9e: aload 3
      // 0b9f: ifnull 0c01
      // 0ba2: if_icmpeq 0bec
      // 0ba5: goto 0bac
      // 0ba8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bab: athrow
      // 0bac: iload 13
      // 0bae: sipush 27225
      // 0bb1: ldc2_w 3058902701037492678
      // 0bb4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0bb7: aload 3
      // 0bb8: ifnull 0c01
      // 0bbb: goto 0bc2
      // 0bbe: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc1: athrow
      // 0bc2: if_icmpeq 0bec
      // 0bc5: goto 0bcc
      // 0bc8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bcb: athrow
      // 0bcc: iload 13
      // 0bce: sipush 19674
      // 0bd1: ldc2_w 2754572087518052116
      // 0bd4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0bd7: aload 3
      // 0bd8: ifnull 0c01
      // 0bdb: goto 0be2
      // 0bde: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be1: athrow
      // 0be2: if_icmpge 0d64
      // 0be5: goto 0bec
      // 0be8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0beb: athrow
      // 0bec: iload 10
      // 0bee: aload 3
      // 0bef: ifnull 0c11
      // 0bf2: goto 0bf9
      // 0bf5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf8: athrow
      // 0bf9: bipush -1
      // 0bfa: goto 0c01
      // 0bfd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c00: athrow
      // 0c01: if_icmpne 0c08
      // 0c04: iload 12
      // 0c06: istore 10
      // 0c08: iinc 8 1
      // 0c0b: iload 12
      // 0c0d: istore 9
      // 0c0f: iload 13
      // 0c11: istore 11
      // 0c13: iinc 5 4
      // 0c16: aload 3
      // 0c17: ifnonnull 0d64
      // 0c1a: iload 13
      // 0c1c: sipush 6005
      // 0c1f: ldc2_w 3649355536797459666
      // 0c22: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0c25: goto 0c2c
      // 0c28: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2b: athrow
      // 0c2c: aload 3
      // 0c2d: ifnull 0c77
      // 0c30: if_icmpge 0c5a
      // 0c33: goto 0c3a
      // 0c36: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c39: athrow
      // 0c3a: aload 0
      // 0c3b: getfield com/finalshell/io/YM3.s J
      // 0c3e: lconst_1
      // 0c3f: iload 13
      // 0c41: lshl
      // 0c42: land
      // 0c43: lconst_0
      // 0c44: lcmp
      // 0c45: aload 3
      // 0c46: ifnull 0c7b
      // 0c49: goto 0c50
      // 0c4c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4f: athrow
      // 0c50: ifne 0c7a
      // 0c53: goto 0c5a
      // 0c56: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c59: athrow
      // 0c5a: iload 13
      // 0c5c: aload 3
      // 0c5d: ifnull 0c7b
      // 0c60: goto 0c67
      // 0c63: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c66: athrow
      // 0c67: sipush 29331
      // 0c6a: ldc2_w 5838482518343647551
      // 0c6d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0c70: goto 0c77
      // 0c73: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c76: athrow
      // 0c77: if_icmpne 0c7e
      // 0c7a: bipush 1
      // 0c7b: goto 0c7f
      // 0c7e: bipush 0
      // 0c7f: istore 14
      // 0c81: aload 3
      // 0c82: ifnull 0d67
      // 0c85: iload 14
      // 0c87: ifeq 0d64
      // 0c8a: goto 0c91
      // 0c8d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c90: athrow
      // 0c91: iinc 8 1
      // 0c94: iload 12
      // 0c96: istore 9
      // 0c98: iload 13
      // 0c9a: istore 11
      // 0c9c: iload 13
      // 0c9e: sipush 26409
      // 0ca1: ldc2_w 6991741584307557557
      // 0ca4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ca7: aload 3
      // 0ca8: ifnull 0cc7
      // 0cab: if_icmpeq 0d4c
      // 0cae: goto 0cb5
      // 0cb1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb4: athrow
      // 0cb5: iload 13
      // 0cb7: sipush 26201
      // 0cba: ldc2_w 1379715028855887237
      // 0cbd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0cc0: goto 0cc7
      // 0cc3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc6: athrow
      // 0cc7: aload 3
      // 0cc8: ifnull 0ce7
      // 0ccb: if_icmpeq 0d4c
      // 0cce: goto 0cd5
      // 0cd1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd4: athrow
      // 0cd5: iload 13
      // 0cd7: sipush 6084
      // 0cda: ldc2_w 7009744229576303721
      // 0cdd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ce0: goto 0ce7
      // 0ce3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce6: athrow
      // 0ce7: aload 3
      // 0ce8: ifnull 0d07
      // 0ceb: if_icmpeq 0d4c
      // 0cee: goto 0cf5
      // 0cf1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf4: athrow
      // 0cf5: iload 13
      // 0cf7: sipush 10281
      // 0cfa: ldc2_w 6620221265790393235
      // 0cfd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0d00: goto 0d07
      // 0d03: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d06: athrow
      // 0d07: aload 3
      // 0d08: ifnull 0d22
      // 0d0b: if_icmpeq 0d4c
      // 0d0e: goto 0d15
      // 0d11: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d14: athrow
      // 0d15: iload 13
      // 0d17: getstatic com/finalshell/core/S7.j [B
      // 0d1a: arraylength
      // 0d1b: goto 0d22
      // 0d1e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d21: athrow
      // 0d22: aload 3
      // 0d23: ifnull 0d5d
      // 0d26: if_icmpge 0d4f
      // 0d29: goto 0d30
      // 0d2c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2f: athrow
      // 0d30: getstatic com/finalshell/core/S7.j [B
      // 0d33: iload 13
      // 0d35: baload
      // 0d36: bipush 4
      // 0d37: aload 3
      // 0d38: ifnull 0d5d
      // 0d3b: goto 0d42
      // 0d3e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d41: athrow
      // 0d42: if_icmpne 0d4f
      // 0d45: goto 0d4c
      // 0d48: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4b: athrow
      // 0d4c: iinc 5 4
      // 0d4f: iload 10
      // 0d51: aload 3
      // 0d52: ifnull 0d62
      // 0d55: bipush -1
      // 0d56: goto 0d5d
      // 0d59: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5c: athrow
      // 0d5d: if_icmpne 0d64
      // 0d60: iload 12
      // 0d62: istore 10
      // 0d64: iinc 12 1
      // 0d67: aload 3
      // 0d68: ifnonnull 0b38
      // 0d6b: iload 8
      // 0d6d: aload 3
      // 0d6e: ifnull 15da
      // 0d71: ifle 15d9
      // 0d74: goto 0d7b
      // 0d77: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7a: athrow
      // 0d7b: iload 5
      // 0d7d: iload 8
      // 0d7f: iadd
      // 0d80: istore 5
      // 0d82: iload 5
      // 0d84: aload 0
      // 0d85: getfield com/finalshell/io/YM3.U [C
      // 0d88: arraylength
      // 0d89: aload 3
      // 0d8a: ifnull 0dad
      // 0d8d: if_icmple 0da4
      // 0d90: goto 0d97
      // 0d93: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d96: athrow
      // 0d97: aload 0
      // 0d98: iload 5
      // 0d9a: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0d9d: goto 0da4
      // 0da0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da3: athrow
      // 0da4: aload 0
      // 0da5: iload 5
      // 0da7: putfield com/finalshell/io/YM3.c I
      // 0daa: iload 8
      // 0dac: bipush 1
      // 0dad: aload 3
      // 0dae: ifnull 1208
      // 0db1: if_icmpne 11f3
      // 0db4: goto 0dbb
      // 0db7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dba: athrow
      // 0dbb: iload 11
      // 0dbd: sipush 27592
      // 0dc0: ldc2_w 5349127045759342678
      // 0dc3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0dc6: aload 3
      // 0dc7: ifnull 0e8e
      // 0dca: goto 0dd1
      // 0dcd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd0: athrow
      // 0dd1: if_icmpne 0e7c
      // 0dd4: goto 0ddb
      // 0dd7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dda: athrow
      // 0ddb: iload 9
      // 0ddd: bipush 1
      // 0dde: iadd
      // 0ddf: istore 12
      // 0de1: iload 9
      // 0de3: sipush 3986
      // 0de6: ldc2_w 2743502366801689638
      // 0de9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0dec: iadd
      // 0ded: istore 13
      // 0def: iload 7
      // 0df1: iload 9
      // 0df3: isub
      // 0df4: bipush 1
      // 0df5: isub
      // 0df6: istore 14
      // 0df8: aload 0
      // 0df9: getfield com/finalshell/io/YM3.U [C
      // 0dfc: iload 12
      // 0dfe: aload 0
      // 0dff: getfield com/finalshell/io/YM3.U [C
      // 0e02: iload 13
      // 0e04: iload 14
      // 0e06: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e09: aload 0
      // 0e0a: getfield com/finalshell/io/YM3.U [C
      // 0e0d: iload 9
      // 0e0f: sipush 29331
      // 0e12: ldc2_w 5838482518343647551
      // 0e15: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e18: castore
      // 0e19: aload 0
      // 0e1a: getfield com/finalshell/io/YM3.U [C
      // 0e1d: iinc 9 1
      // 0e20: iload 9
      // 0e22: sipush 32152
      // 0e25: ldc2_w 2468978250544385558
      // 0e28: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e2b: castore
      // 0e2c: aload 0
      // 0e2d: getfield com/finalshell/io/YM3.U [C
      // 0e30: iinc 9 1
      // 0e33: iload 9
      // 0e35: sipush 23961
      // 0e38: ldc2_w 8415308023596920411
      // 0e3b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e3e: castore
      // 0e3f: aload 0
      // 0e40: getfield com/finalshell/io/YM3.U [C
      // 0e43: iinc 9 1
      // 0e46: iload 9
      // 0e48: sipush 7439
      // 0e4b: ldc2_w 4938701561976712839
      // 0e4e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e51: castore
      // 0e52: aload 0
      // 0e53: getfield com/finalshell/io/YM3.U [C
      // 0e56: iinc 9 1
      // 0e59: iload 9
      // 0e5b: sipush 7575
      // 0e5e: ldc2_w 560967801291468318
      // 0e61: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e64: castore
      // 0e65: aload 0
      // 0e66: getfield com/finalshell/io/YM3.U [C
      // 0e69: iinc 9 1
      // 0e6c: iload 9
      // 0e6e: sipush 17764
      // 0e71: ldc2_w 1378871339086984928
      // 0e74: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e77: castore
      // 0e78: aload 3
      // 0e79: ifnonnull 15d9
      // 0e7c: iload 11
      // 0e7e: sipush 3052
      // 0e81: ldc2_w 3411686180789123159
      // 0e84: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e87: goto 0e8e
      // 0e8a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8d: athrow
      // 0e8e: aload 3
      // 0e8f: ifnull 0f4f
      // 0e92: if_icmpne 0f3d
      // 0e95: goto 0e9c
      // 0e98: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9b: athrow
      // 0e9c: iload 9
      // 0e9e: bipush 1
      // 0e9f: iadd
      // 0ea0: istore 12
      // 0ea2: iload 9
      // 0ea4: sipush 3986
      // 0ea7: ldc2_w 2743502366801689638
      // 0eaa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ead: iadd
      // 0eae: istore 13
      // 0eb0: iload 7
      // 0eb2: iload 9
      // 0eb4: isub
      // 0eb5: bipush 1
      // 0eb6: isub
      // 0eb7: istore 14
      // 0eb9: aload 0
      // 0eba: getfield com/finalshell/io/YM3.U [C
      // 0ebd: iload 12
      // 0ebf: aload 0
      // 0ec0: getfield com/finalshell/io/YM3.U [C
      // 0ec3: iload 13
      // 0ec5: iload 14
      // 0ec7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0eca: aload 0
      // 0ecb: getfield com/finalshell/io/YM3.U [C
      // 0ece: iload 9
      // 0ed0: sipush 29331
      // 0ed3: ldc2_w 5838482518343647551
      // 0ed6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ed9: castore
      // 0eda: aload 0
      // 0edb: getfield com/finalshell/io/YM3.U [C
      // 0ede: iinc 9 1
      // 0ee1: iload 9
      // 0ee3: sipush 32152
      // 0ee6: ldc2_w 2468978250544385558
      // 0ee9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0eec: castore
      // 0eed: aload 0
      // 0eee: getfield com/finalshell/io/YM3.U [C
      // 0ef1: iinc 9 1
      // 0ef4: iload 9
      // 0ef6: sipush 7575
      // 0ef9: ldc2_w 560967801291468318
      // 0efc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0eff: castore
      // 0f00: aload 0
      // 0f01: getfield com/finalshell/io/YM3.U [C
      // 0f04: iinc 9 1
      // 0f07: iload 9
      // 0f09: sipush 7439
      // 0f0c: ldc2_w 4938701561976712839
      // 0f0f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f12: castore
      // 0f13: aload 0
      // 0f14: getfield com/finalshell/io/YM3.U [C
      // 0f17: iinc 9 1
      // 0f1a: iload 9
      // 0f1c: sipush 7575
      // 0f1f: ldc2_w 560967801291468318
      // 0f22: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f25: castore
      // 0f26: aload 0
      // 0f27: getfield com/finalshell/io/YM3.U [C
      // 0f2a: iinc 9 1
      // 0f2d: iload 9
      // 0f2f: sipush 2849
      // 0f32: ldc2_w 1429314846559336681
      // 0f35: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f38: castore
      // 0f39: aload 3
      // 0f3a: ifnonnull 15d9
      // 0f3d: iload 11
      // 0f3f: sipush 26409
      // 0f42: ldc2_w 6991741584307557557
      // 0f45: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f48: goto 0f4f
      // 0f4b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4e: athrow
      // 0f4f: aload 3
      // 0f50: ifnull 0fce
      // 0f53: if_icmpeq 0fbd
      // 0f56: goto 0f5d
      // 0f59: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5c: athrow
      // 0f5d: iload 11
      // 0f5f: sipush 26201
      // 0f62: ldc2_w 1379715028855887237
      // 0f65: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f68: aload 3
      // 0f69: ifnull 0fce
      // 0f6c: goto 0f73
      // 0f6f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f72: athrow
      // 0f73: if_icmpeq 0fbd
      // 0f76: goto 0f7d
      // 0f79: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7c: athrow
      // 0f7d: iload 11
      // 0f7f: sipush 6084
      // 0f82: ldc2_w 7009744229576303721
      // 0f85: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f88: aload 3
      // 0f89: ifnull 0fce
      // 0f8c: goto 0f93
      // 0f8f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f92: athrow
      // 0f93: if_icmpeq 0fbd
      // 0f96: goto 0f9d
      // 0f99: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9c: athrow
      // 0f9d: iload 11
      // 0f9f: sipush 10281
      // 0fa2: ldc2_w 6620221265790393235
      // 0fa5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fa8: aload 3
      // 0fa9: ifnull 109e
      // 0fac: goto 0fb3
      // 0faf: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb2: athrow
      // 0fb3: if_icmpne 1094
      // 0fb6: goto 0fbd
      // 0fb9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fbc: athrow
      // 0fbd: iload 9
      // 0fbf: bipush 1
      // 0fc0: iadd
      // 0fc1: istore 12
      // 0fc3: iload 9
      // 0fc5: sipush 3986
      // 0fc8: ldc2_w 2743502366801689638
      // 0fcb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fce: iadd
      // 0fcf: istore 13
      // 0fd1: iload 7
      // 0fd3: iload 9
      // 0fd5: isub
      // 0fd6: bipush 1
      // 0fd7: isub
      // 0fd8: istore 14
      // 0fda: aload 0
      // 0fdb: getfield com/finalshell/io/YM3.U [C
      // 0fde: iload 12
      // 0fe0: aload 0
      // 0fe1: getfield com/finalshell/io/YM3.U [C
      // 0fe4: iload 13
      // 0fe6: iload 14
      // 0fe8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0feb: aload 0
      // 0fec: getfield com/finalshell/io/YM3.U [C
      // 0fef: iload 9
      // 0ff1: sipush 29331
      // 0ff4: ldc2_w 5838482518343647551
      // 0ff7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ffa: castore
      // 0ffb: aload 0
      // 0ffc: getfield com/finalshell/io/YM3.U [C
      // 0fff: iinc 9 1
      // 1002: iload 9
      // 1004: sipush 32152
      // 1007: ldc2_w 2468978250544385558
      // 100a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 100d: castore
      // 100e: iload 11
      // 1010: istore 15
      // 1012: aload 0
      // 1013: getfield com/finalshell/io/YM3.U [C
      // 1016: iinc 9 1
      // 1019: iload 9
      // 101b: getstatic com/finalshell/core/S7.y [C
      // 101e: iload 15
      // 1020: sipush 7603
      // 1023: ldc2_w 7325892985974222453
      // 1026: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1029: iushr
      // 102a: sipush 21773
      // 102d: ldc2_w 6638525112670398138
      // 1030: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1033: iand
      // 1034: caload
      // 1035: castore
      // 1036: aload 0
      // 1037: getfield com/finalshell/io/YM3.U [C
      // 103a: iinc 9 1
      // 103d: iload 9
      // 103f: getstatic com/finalshell/core/S7.y [C
      // 1042: iload 15
      // 1044: sipush 19011
      // 1047: ldc2_w 74932091958442375
      // 104a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 104d: iushr
      // 104e: sipush 21773
      // 1051: ldc2_w 6638525112670398138
      // 1054: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1057: iand
      // 1058: caload
      // 1059: castore
      // 105a: aload 0
      // 105b: getfield com/finalshell/io/YM3.U [C
      // 105e: iinc 9 1
      // 1061: iload 9
      // 1063: getstatic com/finalshell/core/S7.y [C
      // 1066: iload 15
      // 1068: bipush 4
      // 1069: iushr
      // 106a: sipush 21773
      // 106d: ldc2_w 6638525112670398138
      // 1070: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1073: iand
      // 1074: caload
      // 1075: castore
      // 1076: aload 0
      // 1077: getfield com/finalshell/io/YM3.U [C
      // 107a: iinc 9 1
      // 107d: iload 9
      // 107f: getstatic com/finalshell/core/S7.y [C
      // 1082: iload 15
      // 1084: sipush 21773
      // 1087: ldc2_w 6638525112670398138
      // 108a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 108d: iand
      // 108e: caload
      // 108f: castore
      // 1090: aload 3
      // 1091: ifnonnull 15d9
      // 1094: iload 11
      // 1096: istore 12
      // 1098: iload 12
      // 109a: getstatic com/finalshell/core/S7.j [B
      // 109d: arraylength
      // 109e: aload 3
      // 109f: ifnull 11ac
      // 10a2: if_icmpge 11a2
      // 10a5: goto 10ac
      // 10a8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10ab: athrow
      // 10ac: getstatic com/finalshell/core/S7.j [B
      // 10af: iload 12
      // 10b1: baload
      // 10b2: bipush 4
      // 10b3: aload 3
      // 10b4: ifnull 11ac
      // 10b7: goto 10be
      // 10ba: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10bd: athrow
      // 10be: if_icmpne 11a2
      // 10c1: goto 10c8
      // 10c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c7: athrow
      // 10c8: iload 9
      // 10ca: bipush 1
      // 10cb: iadd
      // 10cc: istore 13
      // 10ce: iload 9
      // 10d0: sipush 3986
      // 10d3: ldc2_w 2743502366801689638
      // 10d6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 10d9: iadd
      // 10da: istore 14
      // 10dc: iload 7
      // 10de: iload 9
      // 10e0: isub
      // 10e1: bipush 1
      // 10e2: isub
      // 10e3: istore 15
      // 10e5: aload 0
      // 10e6: getfield com/finalshell/io/YM3.U [C
      // 10e9: iload 13
      // 10eb: aload 0
      // 10ec: getfield com/finalshell/io/YM3.U [C
      // 10ef: iload 14
      // 10f1: iload 15
      // 10f3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 10f6: iload 9
      // 10f8: istore 16
      // 10fa: aload 0
      // 10fb: getfield com/finalshell/io/YM3.U [C
      // 10fe: iload 16
      // 1100: iinc 16 1
      // 1103: sipush 29331
      // 1106: ldc2_w 5838482518343647551
      // 1109: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 110c: castore
      // 110d: aload 0
      // 110e: getfield com/finalshell/io/YM3.U [C
      // 1111: iload 16
      // 1113: iinc 16 1
      // 1116: sipush 32152
      // 1119: ldc2_w 2468978250544385558
      // 111c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 111f: castore
      // 1120: aload 0
      // 1121: getfield com/finalshell/io/YM3.U [C
      // 1124: iload 16
      // 1126: iinc 16 1
      // 1129: getstatic com/finalshell/core/S7.y [C
      // 112c: iload 12
      // 112e: sipush 7603
      // 1131: ldc2_w 7325892985974222453
      // 1134: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1137: iushr
      // 1138: sipush 21773
      // 113b: ldc2_w 6638525112670398138
      // 113e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1141: iand
      // 1142: caload
      // 1143: castore
      // 1144: aload 0
      // 1145: getfield com/finalshell/io/YM3.U [C
      // 1148: iload 16
      // 114a: iinc 16 1
      // 114d: getstatic com/finalshell/core/S7.y [C
      // 1150: iload 12
      // 1152: sipush 19011
      // 1155: ldc2_w 74932091958442375
      // 1158: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 115b: iushr
      // 115c: sipush 21773
      // 115f: ldc2_w 6638525112670398138
      // 1162: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1165: iand
      // 1166: caload
      // 1167: castore
      // 1168: aload 0
      // 1169: getfield com/finalshell/io/YM3.U [C
      // 116c: iload 16
      // 116e: iinc 16 1
      // 1171: getstatic com/finalshell/core/S7.y [C
      // 1174: iload 12
      // 1176: bipush 4
      // 1177: iushr
      // 1178: sipush 21773
      // 117b: ldc2_w 6638525112670398138
      // 117e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1181: iand
      // 1182: caload
      // 1183: castore
      // 1184: aload 0
      // 1185: getfield com/finalshell/io/YM3.U [C
      // 1188: iload 16
      // 118a: iinc 16 1
      // 118d: getstatic com/finalshell/core/S7.y [C
      // 1190: iload 12
      // 1192: sipush 21773
      // 1195: ldc2_w 6638525112670398138
      // 1198: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 119b: iand
      // 119c: caload
      // 119d: castore
      // 119e: aload 3
      // 119f: ifnonnull 11ef
      // 11a2: iload 9
      // 11a4: bipush 1
      // 11a5: goto 11ac
      // 11a8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11ab: athrow
      // 11ac: iadd
      // 11ad: istore 13
      // 11af: iload 9
      // 11b1: bipush 2
      // 11b2: iadd
      // 11b3: istore 14
      // 11b5: iload 7
      // 11b7: iload 9
      // 11b9: isub
      // 11ba: bipush 1
      // 11bb: isub
      // 11bc: istore 15
      // 11be: aload 0
      // 11bf: getfield com/finalshell/io/YM3.U [C
      // 11c2: iload 13
      // 11c4: aload 0
      // 11c5: getfield com/finalshell/io/YM3.U [C
      // 11c8: iload 14
      // 11ca: iload 15
      // 11cc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11cf: aload 0
      // 11d0: getfield com/finalshell/io/YM3.U [C
      // 11d3: iload 9
      // 11d5: sipush 29331
      // 11d8: ldc2_w 5838482518343647551
      // 11db: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 11de: castore
      // 11df: aload 0
      // 11e0: getfield com/finalshell/io/YM3.U [C
      // 11e3: iinc 9 1
      // 11e6: iload 9
      // 11e8: getstatic com/finalshell/core/S7.Q [C
      // 11eb: iload 12
      // 11ed: caload
      // 11ee: castore
      // 11ef: aload 3
      // 11f0: ifnonnull 15d9
      // 11f3: iload 8
      // 11f5: aload 3
      // 11f6: ifnull 15da
      // 11f9: goto 1200
      // 11fc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11ff: athrow
      // 1200: bipush 1
      // 1201: goto 1208
      // 1204: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1207: athrow
      // 1208: if_icmple 15d9
      // 120b: iload 10
      // 120d: iload 6
      // 120f: isub
      // 1210: istore 12
      // 1212: iload 10
      // 1214: istore 13
      // 1216: iload 12
      // 1218: istore 14
      // 121a: iload 14
      // 121c: aload 1
      // 121d: invokevirtual java/lang/String.length ()I
      // 1220: if_icmpge 15d9
      // 1223: aload 1
      // 1224: iload 14
      // 1226: invokevirtual java/lang/String.charAt (I)C
      // 1229: istore 15
      // 122b: aload 0
      // 122c: getfield com/finalshell/io/YM3.T Z
      // 122f: aload 3
      // 1230: ifnull 15da
      // 1233: aload 3
      // 1234: ifnull 1383
      // 1237: goto 123e
      // 123a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123d: athrow
      // 123e: ifeq 137a
      // 1241: goto 1248
      // 1244: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1247: athrow
      // 1248: iload 15
      // 124a: sipush 26409
      // 124d: ldc2_w 6991741584307557557
      // 1250: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1253: aload 3
      // 1254: ifnull 127a
      // 1257: goto 125e
      // 125a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125d: athrow
      // 125e: if_icmpeq 12c8
      // 1261: goto 1268
      // 1264: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1267: athrow
      // 1268: iload 15
      // 126a: sipush 26201
      // 126d: ldc2_w 1379715028855887237
      // 1270: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1273: goto 127a
      // 1276: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1279: athrow
      // 127a: aload 3
      // 127b: ifnull 129a
      // 127e: if_icmpeq 12c8
      // 1281: goto 1288
      // 1284: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1287: athrow
      // 1288: iload 15
      // 128a: sipush 6084
      // 128d: ldc2_w 7009744229576303721
      // 1290: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1293: goto 129a
      // 1296: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1299: athrow
      // 129a: aload 3
      // 129b: ifnull 12ba
      // 129e: if_icmpeq 12c8
      // 12a1: goto 12a8
      // 12a4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a7: athrow
      // 12a8: iload 15
      // 12aa: sipush 10281
      // 12ad: ldc2_w 6620221265790393235
      // 12b0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12b3: goto 12ba
      // 12b6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b9: athrow
      // 12ba: aload 3
      // 12bb: ifnull 1387
      // 12be: if_icmpne 137a
      // 12c1: goto 12c8
      // 12c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c7: athrow
      // 12c8: aload 0
      // 12c9: getfield com/finalshell/io/YM3.U [C
      // 12cc: iload 13
      // 12ce: iinc 13 1
      // 12d1: sipush 29331
      // 12d4: ldc2_w 5838482518343647551
      // 12d7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12da: castore
      // 12db: aload 0
      // 12dc: getfield com/finalshell/io/YM3.U [C
      // 12df: iload 13
      // 12e1: iinc 13 1
      // 12e4: sipush 32152
      // 12e7: ldc2_w 2468978250544385558
      // 12ea: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12ed: castore
      // 12ee: aload 0
      // 12ef: getfield com/finalshell/io/YM3.U [C
      // 12f2: iload 13
      // 12f4: iinc 13 1
      // 12f7: getstatic com/finalshell/core/S7.y [C
      // 12fa: iload 15
      // 12fc: sipush 7603
      // 12ff: ldc2_w 7325892985974222453
      // 1302: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1305: iushr
      // 1306: sipush 21773
      // 1309: ldc2_w 6638525112670398138
      // 130c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 130f: iand
      // 1310: caload
      // 1311: castore
      // 1312: aload 0
      // 1313: getfield com/finalshell/io/YM3.U [C
      // 1316: iload 13
      // 1318: iinc 13 1
      // 131b: getstatic com/finalshell/core/S7.y [C
      // 131e: iload 15
      // 1320: sipush 19011
      // 1323: ldc2_w 74932091958442375
      // 1326: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1329: iushr
      // 132a: sipush 21773
      // 132d: ldc2_w 6638525112670398138
      // 1330: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1333: iand
      // 1334: caload
      // 1335: castore
      // 1336: aload 0
      // 1337: getfield com/finalshell/io/YM3.U [C
      // 133a: iload 13
      // 133c: iinc 13 1
      // 133f: getstatic com/finalshell/core/S7.y [C
      // 1342: iload 15
      // 1344: bipush 4
      // 1345: iushr
      // 1346: sipush 21773
      // 1349: ldc2_w 6638525112670398138
      // 134c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 134f: iand
      // 1350: caload
      // 1351: castore
      // 1352: aload 0
      // 1353: getfield com/finalshell/io/YM3.U [C
      // 1356: iload 13
      // 1358: iinc 13 1
      // 135b: getstatic com/finalshell/core/S7.y [C
      // 135e: iload 15
      // 1360: sipush 21773
      // 1363: ldc2_w 6638525112670398138
      // 1366: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1369: iand
      // 136a: caload
      // 136b: castore
      // 136c: iinc 7 5
      // 136f: aload 3
      // 1370: ifnonnull 15d2
      // 1373: goto 137a
      // 1376: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1379: athrow
      // 137a: iload 15
      // 137c: goto 1383
      // 137f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1382: athrow
      // 1383: getstatic com/finalshell/core/S7.j [B
      // 1386: arraylength
      // 1387: aload 3
      // 1388: ifnull 13c2
      // 138b: if_icmpge 13b0
      // 138e: goto 1395
      // 1391: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1394: athrow
      // 1395: getstatic com/finalshell/core/S7.j [B
      // 1398: iload 15
      // 139a: baload
      // 139b: aload 3
      // 139c: ifnull 1417
      // 139f: goto 13a6
      // 13a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a5: athrow
      // 13a6: ifne 13ec
      // 13a9: goto 13b0
      // 13ac: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13af: athrow
      // 13b0: iload 15
      // 13b2: sipush 4624
      // 13b5: ldc2_w 6912903878219129232
      // 13b8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13bb: goto 13c2
      // 13be: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c1: athrow
      // 13c2: aload 3
      // 13c3: ifnull 14ea
      // 13c6: if_icmpne 14d8
      // 13c9: goto 13d0
      // 13cc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13cf: athrow
      // 13d0: aload 0
      // 13d1: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 13d4: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 13d7: aload 3
      // 13d8: ifnull 14e1
      // 13db: goto 13e2
      // 13de: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e1: athrow
      // 13e2: ifeq 14d8
      // 13e5: goto 13ec
      // 13e8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13eb: athrow
      // 13ec: aload 0
      // 13ed: getfield com/finalshell/io/YM3.U [C
      // 13f0: iload 13
      // 13f2: iinc 13 1
      // 13f5: sipush 29331
      // 13f8: ldc2_w 5838482518343647551
      // 13fb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13fe: castore
      // 13ff: aload 3
      // 1400: ifnull 14d4
      // 1403: goto 140a
      // 1406: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1409: athrow
      // 140a: getstatic com/finalshell/core/S7.j [B
      // 140d: iload 15
      // 140f: baload
      // 1410: goto 1417
      // 1413: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1416: athrow
      // 1417: bipush 4
      // 1418: if_icmpne 14ba
      // 141b: aload 0
      // 141c: getfield com/finalshell/io/YM3.U [C
      // 141f: iload 13
      // 1421: iinc 13 1
      // 1424: sipush 32152
      // 1427: ldc2_w 2468978250544385558
      // 142a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 142d: castore
      // 142e: aload 0
      // 142f: getfield com/finalshell/io/YM3.U [C
      // 1432: iload 13
      // 1434: iinc 13 1
      // 1437: getstatic com/finalshell/core/S7.y [C
      // 143a: iload 15
      // 143c: sipush 7603
      // 143f: ldc2_w 7325892985974222453
      // 1442: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1445: iushr
      // 1446: sipush 21773
      // 1449: ldc2_w 6638525112670398138
      // 144c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 144f: iand
      // 1450: caload
      // 1451: castore
      // 1452: aload 0
      // 1453: getfield com/finalshell/io/YM3.U [C
      // 1456: iload 13
      // 1458: iinc 13 1
      // 145b: getstatic com/finalshell/core/S7.y [C
      // 145e: iload 15
      // 1460: sipush 19011
      // 1463: ldc2_w 74932091958442375
      // 1466: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1469: iushr
      // 146a: sipush 21773
      // 146d: ldc2_w 6638525112670398138
      // 1470: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1473: iand
      // 1474: caload
      // 1475: castore
      // 1476: aload 0
      // 1477: getfield com/finalshell/io/YM3.U [C
      // 147a: iload 13
      // 147c: iinc 13 1
      // 147f: getstatic com/finalshell/core/S7.y [C
      // 1482: iload 15
      // 1484: bipush 4
      // 1485: iushr
      // 1486: sipush 21773
      // 1489: ldc2_w 6638525112670398138
      // 148c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 148f: iand
      // 1490: caload
      // 1491: castore
      // 1492: aload 0
      // 1493: getfield com/finalshell/io/YM3.U [C
      // 1496: iload 13
      // 1498: iinc 13 1
      // 149b: getstatic com/finalshell/core/S7.y [C
      // 149e: iload 15
      // 14a0: sipush 21773
      // 14a3: ldc2_w 6638525112670398138
      // 14a6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14a9: iand
      // 14aa: caload
      // 14ab: castore
      // 14ac: iinc 7 5
      // 14af: aload 3
      // 14b0: ifnonnull 15d2
      // 14b3: goto 14ba
      // 14b6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b9: athrow
      // 14ba: aload 0
      // 14bb: getfield com/finalshell/io/YM3.U [C
      // 14be: iload 13
      // 14c0: iinc 13 1
      // 14c3: getstatic com/finalshell/core/S7.Q [C
      // 14c6: iload 15
      // 14c8: caload
      // 14c9: castore
      // 14ca: iinc 7 1
      // 14cd: goto 14d4
      // 14d0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d3: athrow
      // 14d4: aload 3
      // 14d5: ifnonnull 15d2
      // 14d8: iload 15
      // 14da: goto 14e1
      // 14dd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e0: athrow
      // 14e1: sipush 27592
      // 14e4: ldc2_w 5349127045759342678
      // 14e7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14ea: aload 3
      // 14eb: ifnull 150a
      // 14ee: if_icmpeq 150d
      // 14f1: goto 14f8
      // 14f4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f7: athrow
      // 14f8: iload 15
      // 14fa: sipush 3052
      // 14fd: ldc2_w 3411686180789123159
      // 1500: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1503: goto 150a
      // 1506: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1509: athrow
      // 150a: if_icmpne 15bf
      // 150d: aload 0
      // 150e: getfield com/finalshell/io/YM3.U [C
      // 1511: iload 13
      // 1513: iinc 13 1
      // 1516: sipush 29331
      // 1519: ldc2_w 5838482518343647551
      // 151c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 151f: castore
      // 1520: aload 0
      // 1521: getfield com/finalshell/io/YM3.U [C
      // 1524: iload 13
      // 1526: iinc 13 1
      // 1529: sipush 32152
      // 152c: ldc2_w 2468978250544385558
      // 152f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1532: castore
      // 1533: aload 0
      // 1534: getfield com/finalshell/io/YM3.U [C
      // 1537: iload 13
      // 1539: iinc 13 1
      // 153c: getstatic com/finalshell/core/S7.y [C
      // 153f: iload 15
      // 1541: sipush 7603
      // 1544: ldc2_w 7325892985974222453
      // 1547: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 154a: iushr
      // 154b: sipush 21773
      // 154e: ldc2_w 6638525112670398138
      // 1551: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1554: iand
      // 1555: caload
      // 1556: castore
      // 1557: aload 0
      // 1558: getfield com/finalshell/io/YM3.U [C
      // 155b: iload 13
      // 155d: iinc 13 1
      // 1560: getstatic com/finalshell/core/S7.y [C
      // 1563: iload 15
      // 1565: sipush 19011
      // 1568: ldc2_w 74932091958442375
      // 156b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 156e: iushr
      // 156f: sipush 21773
      // 1572: ldc2_w 6638525112670398138
      // 1575: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1578: iand
      // 1579: caload
      // 157a: castore
      // 157b: aload 0
      // 157c: getfield com/finalshell/io/YM3.U [C
      // 157f: iload 13
      // 1581: iinc 13 1
      // 1584: getstatic com/finalshell/core/S7.y [C
      // 1587: iload 15
      // 1589: bipush 4
      // 158a: iushr
      // 158b: sipush 21773
      // 158e: ldc2_w 6638525112670398138
      // 1591: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1594: iand
      // 1595: caload
      // 1596: castore
      // 1597: aload 0
      // 1598: getfield com/finalshell/io/YM3.U [C
      // 159b: iload 13
      // 159d: iinc 13 1
      // 15a0: getstatic com/finalshell/core/S7.y [C
      // 15a3: iload 15
      // 15a5: sipush 21773
      // 15a8: ldc2_w 6638525112670398138
      // 15ab: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15ae: iand
      // 15af: caload
      // 15b0: castore
      // 15b1: iinc 7 5
      // 15b4: aload 3
      // 15b5: ifnonnull 15d2
      // 15b8: goto 15bf
      // 15bb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15be: athrow
      // 15bf: aload 0
      // 15c0: getfield com/finalshell/io/YM3.U [C
      // 15c3: iload 13
      // 15c5: iinc 13 1
      // 15c8: iload 15
      // 15ca: castore
      // 15cb: goto 15d2
      // 15ce: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d1: athrow
      // 15d2: iinc 14 1
      // 15d5: aload 3
      // 15d6: ifnonnull 121a
      // 15d9: iload 2
      // 15da: ifeq 1608
      // 15dd: aload 0
      // 15de: getfield com/finalshell/io/YM3.U [C
      // 15e1: aload 0
      // 15e2: getfield com/finalshell/io/YM3.c I
      // 15e5: bipush 2
      // 15e6: isub
      // 15e7: sipush 32680
      // 15ea: ldc2_w 6661901957014359160
      // 15ed: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15f0: castore
      // 15f1: aload 0
      // 15f2: getfield com/finalshell/io/YM3.U [C
      // 15f5: aload 0
      // 15f6: getfield com/finalshell/io/YM3.c I
      // 15f9: bipush 1
      // 15fa: isub
      // 15fb: iload 2
      // 15fc: castore
      // 15fd: aload 3
      // 15fe: ifnonnull 1623
      // 1601: goto 1608
      // 1604: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1607: athrow
      // 1608: aload 0
      // 1609: getfield com/finalshell/io/YM3.U [C
      // 160c: aload 0
      // 160d: getfield com/finalshell/io/YM3.c I
      // 1610: bipush 1
      // 1611: isub
      // 1612: sipush 32680
      // 1615: ldc2_w 6661901957014359160
      // 1618: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 161b: castore
      // 161c: goto 1623
      // 161f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1622: athrow
      // 1623: return
   }

   public void Y(char[] param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 0003: astore 3
      // 0004: aload 1
      // 0005: aload 3
      // 0006: ifnull 003b
      // 0009: ifnonnull 003a
      // 000c: goto 0013
      // 000f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0012: athrow
      // 0013: aload 0
      // 0014: aload 3
      // 0015: ifnull 0035
      // 0018: goto 001f
      // 001b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 001e: athrow
      // 001f: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0022: iload 2
      // 0023: ifeq 0039
      // 0026: goto 002d
      // 0029: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 002c: athrow
      // 002d: aload 0
      // 002e: goto 0035
      // 0031: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0034: athrow
      // 0035: iload 2
      // 0036: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0039: return
      // 003a: aload 1
      // 003b: arraylength
      // 003c: istore 4
      // 003e: aload 0
      // 003f: getfield com/finalshell/io/YM3.c I
      // 0042: iload 4
      // 0044: iadd
      // 0045: bipush 2
      // 0046: iadd
      // 0047: istore 5
      // 0049: iload 2
      // 004a: aload 3
      // 004b: ifnull 005d
      // 004e: ifeq 005b
      // 0051: goto 0058
      // 0054: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0057: athrow
      // 0058: iinc 5 1
      // 005b: iload 5
      // 005d: aload 0
      // 005e: getfield com/finalshell/io/YM3.U [C
      // 0061: arraylength
      // 0062: aload 3
      // 0063: ifnull 059e
      // 0066: if_icmple 0599
      // 0069: goto 0070
      // 006c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 006f: athrow
      // 0070: aload 0
      // 0071: aload 3
      // 0072: ifnull 0594
      // 0075: goto 007c
      // 0078: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 007b: athrow
      // 007c: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 007f: ifnull 0593
      // 0082: goto 0089
      // 0085: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0088: athrow
      // 0089: aload 0
      // 008a: sipush 32680
      // 008d: ldc2_w 6661901957014359160
      // 0090: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0093: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0096: bipush 0
      // 0097: istore 6
      // 0099: iload 6
      // 009b: aload 1
      // 009c: arraylength
      // 009d: if_icmpge 056a
      // 00a0: aload 1
      // 00a1: iload 6
      // 00a3: caload
      // 00a4: istore 7
      // 00a6: aload 0
      // 00a7: getstatic com/finalshell/ui/model/EP.BrowserSecure Lcom/finalshell/ui/model/EP;
      // 00aa: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 00ad: aload 3
      // 00ae: ifnull 0583
      // 00b1: aload 3
      // 00b2: ifnull 01df
      // 00b5: goto 00bc
      // 00b8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00bb: athrow
      // 00bc: ifeq 01d1
      // 00bf: goto 00c6
      // 00c2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00c5: athrow
      // 00c6: iload 7
      // 00c8: sipush 26409
      // 00cb: ldc2_w 6991741584307557557
      // 00ce: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 00d1: aload 3
      // 00d2: ifnull 00f8
      // 00d5: goto 00dc
      // 00d8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00db: athrow
      // 00dc: if_icmpeq 0146
      // 00df: goto 00e6
      // 00e2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00e5: athrow
      // 00e6: iload 7
      // 00e8: sipush 26201
      // 00eb: ldc2_w 1379715028855887237
      // 00ee: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 00f1: goto 00f8
      // 00f4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f7: athrow
      // 00f8: aload 3
      // 00f9: ifnull 0118
      // 00fc: if_icmpeq 0146
      // 00ff: goto 0106
      // 0102: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0105: athrow
      // 0106: iload 7
      // 0108: sipush 6084
      // 010b: ldc2_w 7009744229576303721
      // 010e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0111: goto 0118
      // 0114: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0117: athrow
      // 0118: aload 3
      // 0119: ifnull 0143
      // 011c: if_icmpeq 0146
      // 011f: goto 0126
      // 0122: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0125: athrow
      // 0126: iload 7
      // 0128: aload 3
      // 0129: ifnull 01df
      // 012c: goto 0133
      // 012f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0132: athrow
      // 0133: sipush 10281
      // 0136: ldc2_w 6620221265790393235
      // 0139: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 013c: goto 0143
      // 013f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0142: athrow
      // 0143: if_icmpne 01d1
      // 0146: aload 0
      // 0147: sipush 29331
      // 014a: ldc2_w 5838482518343647551
      // 014d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0150: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0153: aload 0
      // 0154: sipush 32152
      // 0157: ldc2_w 2468978250544385558
      // 015a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 015d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0160: aload 0
      // 0161: getstatic com/finalshell/core/S7.y [C
      // 0164: iload 7
      // 0166: sipush 7603
      // 0169: ldc2_w 7325892985974222453
      // 016c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 016f: iushr
      // 0170: sipush 21773
      // 0173: ldc2_w 6638525112670398138
      // 0176: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0179: iand
      // 017a: caload
      // 017b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 017e: aload 0
      // 017f: getstatic com/finalshell/core/S7.y [C
      // 0182: iload 7
      // 0184: sipush 19011
      // 0187: ldc2_w 74932091958442375
      // 018a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 018d: iushr
      // 018e: sipush 21773
      // 0191: ldc2_w 6638525112670398138
      // 0194: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0197: iand
      // 0198: caload
      // 0199: invokevirtual com/finalshell/io/YM3.write (I)V
      // 019c: aload 0
      // 019d: getstatic com/finalshell/core/S7.y [C
      // 01a0: iload 7
      // 01a2: bipush 4
      // 01a3: iushr
      // 01a4: sipush 21773
      // 01a7: ldc2_w 6638525112670398138
      // 01aa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01ad: iand
      // 01ae: caload
      // 01af: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01b2: aload 0
      // 01b3: getstatic com/finalshell/core/S7.y [C
      // 01b6: iload 7
      // 01b8: sipush 21773
      // 01bb: ldc2_w 6638525112670398138
      // 01be: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01c1: iand
      // 01c2: caload
      // 01c3: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01c6: aload 3
      // 01c7: ifnonnull 0563
      // 01ca: goto 01d1
      // 01cd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d0: athrow
      // 01d1: aload 0
      // 01d2: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 01d5: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 01d8: goto 01df
      // 01db: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01de: athrow
      // 01df: aload 3
      // 01e0: ifnull 0431
      // 01e3: ifeq 0428
      // 01e6: goto 01ed
      // 01e9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01ec: athrow
      // 01ed: iload 7
      // 01ef: sipush 19011
      // 01f2: ldc2_w 74932091958442375
      // 01f5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 01f8: aload 3
      // 01f9: ifnull 021f
      // 01fc: goto 0203
      // 01ff: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0202: athrow
      // 0203: if_icmpeq 02ed
      // 0206: goto 020d
      // 0209: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020c: athrow
      // 020d: iload 7
      // 020f: sipush 7603
      // 0212: ldc2_w 7325892985974222453
      // 0215: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0218: goto 021f
      // 021b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021e: athrow
      // 021f: aload 3
      // 0220: ifnull 023f
      // 0223: if_icmpeq 02ed
      // 0226: goto 022d
      // 0229: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022c: athrow
      // 022d: iload 7
      // 022f: sipush 23523
      // 0232: ldc2_w 2731639075105253491
      // 0235: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0238: goto 023f
      // 023b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023e: athrow
      // 023f: aload 3
      // 0240: ifnull 025f
      // 0243: if_icmpeq 02ed
      // 0246: goto 024d
      // 0249: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024c: athrow
      // 024d: iload 7
      // 024f: sipush 13058
      // 0252: ldc2_w 5903679206401720468
      // 0255: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0258: goto 025f
      // 025b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025e: athrow
      // 025f: aload 3
      // 0260: ifnull 027f
      // 0263: if_icmpeq 02ed
      // 0266: goto 026d
      // 0269: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026c: athrow
      // 026d: iload 7
      // 026f: sipush 28589
      // 0272: ldc2_w 2513251627265039423
      // 0275: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0278: goto 027f
      // 027b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027e: athrow
      // 027f: aload 3
      // 0280: ifnull 029f
      // 0283: if_icmpeq 02ed
      // 0286: goto 028d
      // 0289: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028c: athrow
      // 028d: iload 7
      // 028f: sipush 32680
      // 0292: ldc2_w 6661901957014359160
      // 0295: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0298: goto 029f
      // 029b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029e: athrow
      // 029f: aload 3
      // 02a0: ifnull 02bf
      // 02a3: if_icmpeq 02ed
      // 02a6: goto 02ad
      // 02a9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02ac: athrow
      // 02ad: iload 7
      // 02af: sipush 4624
      // 02b2: ldc2_w 6912903878219129232
      // 02b5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02b8: goto 02bf
      // 02bb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02be: athrow
      // 02bf: aload 3
      // 02c0: ifnull 02df
      // 02c3: if_icmpeq 02ed
      // 02c6: goto 02cd
      // 02c9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02cc: athrow
      // 02cd: iload 7
      // 02cf: sipush 29331
      // 02d2: ldc2_w 5838482518343647551
      // 02d5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02d8: goto 02df
      // 02db: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02de: athrow
      // 02df: aload 3
      // 02e0: ifnull 0321
      // 02e3: if_icmpne 030f
      // 02e6: goto 02ed
      // 02e9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02ec: athrow
      // 02ed: aload 0
      // 02ee: sipush 29331
      // 02f1: ldc2_w 5838482518343647551
      // 02f4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 02f7: invokevirtual com/finalshell/io/YM3.write (I)V
      // 02fa: aload 0
      // 02fb: getstatic com/finalshell/core/S7.Q [C
      // 02fe: iload 7
      // 0300: caload
      // 0301: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0304: aload 3
      // 0305: ifnonnull 0563
      // 0308: goto 030f
      // 030b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030e: athrow
      // 030f: iload 7
      // 0311: sipush 15095
      // 0314: ldc2_w 2207052621178587477
      // 0317: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 031a: goto 0321
      // 031d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0320: athrow
      // 0321: aload 3
      // 0322: ifnull 039a
      // 0325: if_icmpge 0388
      // 0328: goto 032f
      // 032b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032e: athrow
      // 032f: aload 0
      // 0330: sipush 29331
      // 0333: ldc2_w 5838482518343647551
      // 0336: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0339: invokevirtual com/finalshell/io/YM3.write (I)V
      // 033c: aload 0
      // 033d: sipush 32152
      // 0340: ldc2_w 2468978250544385558
      // 0343: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0346: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0349: aload 0
      // 034a: sipush 7439
      // 034d: ldc2_w 4938701561976712839
      // 0350: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0353: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0356: aload 0
      // 0357: sipush 7439
      // 035a: ldc2_w 4938701561976712839
      // 035d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0360: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0363: aload 0
      // 0364: getstatic com/finalshell/core/S7.n [C
      // 0367: iload 7
      // 0369: bipush 2
      // 036a: imul
      // 036b: caload
      // 036c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 036f: aload 0
      // 0370: getstatic com/finalshell/core/S7.n [C
      // 0373: iload 7
      // 0375: bipush 2
      // 0376: imul
      // 0377: bipush 1
      // 0378: iadd
      // 0379: caload
      // 037a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 037d: aload 3
      // 037e: ifnonnull 0563
      // 0381: goto 0388
      // 0384: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0387: athrow
      // 0388: iload 7
      // 038a: sipush 17176
      // 038d: ldc2_w 5558249671418261723
      // 0390: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0393: goto 039a
      // 0396: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0399: athrow
      // 039a: if_icmplt 0556
      // 039d: aload 0
      // 039e: sipush 29331
      // 03a1: ldc2_w 5838482518343647551
      // 03a4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03a7: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03aa: aload 0
      // 03ab: sipush 32152
      // 03ae: ldc2_w 2468978250544385558
      // 03b1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03b4: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03b7: aload 0
      // 03b8: getstatic com/finalshell/core/S7.y [C
      // 03bb: iload 7
      // 03bd: sipush 7603
      // 03c0: ldc2_w 7325892985974222453
      // 03c3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03c6: iushr
      // 03c7: sipush 21773
      // 03ca: ldc2_w 6638525112670398138
      // 03cd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03d0: iand
      // 03d1: caload
      // 03d2: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03d5: aload 0
      // 03d6: getstatic com/finalshell/core/S7.y [C
      // 03d9: iload 7
      // 03db: sipush 19011
      // 03de: ldc2_w 74932091958442375
      // 03e1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03e4: iushr
      // 03e5: sipush 21773
      // 03e8: ldc2_w 6638525112670398138
      // 03eb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 03ee: iand
      // 03ef: caload
      // 03f0: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03f3: aload 0
      // 03f4: getstatic com/finalshell/core/S7.y [C
      // 03f7: iload 7
      // 03f9: bipush 4
      // 03fa: iushr
      // 03fb: sipush 21773
      // 03fe: ldc2_w 6638525112670398138
      // 0401: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0404: iand
      // 0405: caload
      // 0406: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0409: aload 0
      // 040a: getstatic com/finalshell/core/S7.y [C
      // 040d: iload 7
      // 040f: sipush 21773
      // 0412: ldc2_w 6638525112670398138
      // 0415: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0418: iand
      // 0419: caload
      // 041a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 041d: aload 3
      // 041e: ifnonnull 0563
      // 0421: goto 0428
      // 0424: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0427: athrow
      // 0428: iload 7
      // 042a: goto 0431
      // 042d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0430: athrow
      // 0431: getstatic com/finalshell/core/S7.j [B
      // 0434: arraylength
      // 0435: aload 3
      // 0436: ifnull 047b
      // 0439: if_icmpge 045e
      // 043c: goto 0443
      // 043f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0442: athrow
      // 0443: getstatic com/finalshell/core/S7.j [B
      // 0446: iload 7
      // 0448: baload
      // 0449: aload 3
      // 044a: ifnull 04bf
      // 044d: goto 0454
      // 0450: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0453: athrow
      // 0454: ifne 049a
      // 0457: goto 045e
      // 045a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045d: athrow
      // 045e: iload 7
      // 0460: aload 3
      // 0461: ifnull 0497
      // 0464: goto 046b
      // 0467: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046a: athrow
      // 046b: sipush 4624
      // 046e: ldc2_w 6912903878219129232
      // 0471: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0474: goto 047b
      // 0477: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047a: athrow
      // 047b: if_icmpne 0556
      // 047e: aload 0
      // 047f: aload 3
      // 0480: ifnull 055e
      // 0483: goto 048a
      // 0486: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0489: athrow
      // 048a: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 048d: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0490: goto 0497
      // 0493: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0496: athrow
      // 0497: ifeq 0556
      // 049a: aload 0
      // 049b: sipush 29331
      // 049e: ldc2_w 5838482518343647551
      // 04a1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04a4: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04a7: aload 3
      // 04a8: ifnull 0552
      // 04ab: goto 04b2
      // 04ae: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b1: athrow
      // 04b2: getstatic com/finalshell/core/S7.j [B
      // 04b5: iload 7
      // 04b7: baload
      // 04b8: goto 04bf
      // 04bb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04be: athrow
      // 04bf: bipush 4
      // 04c0: if_icmpne 0541
      // 04c3: aload 0
      // 04c4: sipush 32152
      // 04c7: ldc2_w 2468978250544385558
      // 04ca: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04cd: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04d0: aload 0
      // 04d1: getstatic com/finalshell/core/S7.y [C
      // 04d4: iload 7
      // 04d6: sipush 7603
      // 04d9: ldc2_w 7325892985974222453
      // 04dc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04df: iushr
      // 04e0: sipush 21773
      // 04e3: ldc2_w 6638525112670398138
      // 04e6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04e9: iand
      // 04ea: caload
      // 04eb: invokevirtual com/finalshell/io/YM3.write (I)V
      // 04ee: aload 0
      // 04ef: getstatic com/finalshell/core/S7.y [C
      // 04f2: iload 7
      // 04f4: sipush 19011
      // 04f7: ldc2_w 74932091958442375
      // 04fa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 04fd: iushr
      // 04fe: sipush 21773
      // 0501: ldc2_w 6638525112670398138
      // 0504: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0507: iand
      // 0508: caload
      // 0509: invokevirtual com/finalshell/io/YM3.write (I)V
      // 050c: aload 0
      // 050d: getstatic com/finalshell/core/S7.y [C
      // 0510: iload 7
      // 0512: bipush 4
      // 0513: iushr
      // 0514: sipush 21773
      // 0517: ldc2_w 6638525112670398138
      // 051a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 051d: iand
      // 051e: caload
      // 051f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0522: aload 0
      // 0523: getstatic com/finalshell/core/S7.y [C
      // 0526: iload 7
      // 0528: sipush 21773
      // 052b: ldc2_w 6638525112670398138
      // 052e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0531: iand
      // 0532: caload
      // 0533: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0536: aload 3
      // 0537: ifnonnull 0563
      // 053a: goto 0541
      // 053d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0540: athrow
      // 0541: aload 0
      // 0542: getstatic com/finalshell/core/S7.Q [C
      // 0545: iload 7
      // 0547: caload
      // 0548: invokevirtual com/finalshell/io/YM3.write (I)V
      // 054b: goto 0552
      // 054e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0551: athrow
      // 0552: aload 3
      // 0553: ifnonnull 0563
      // 0556: aload 0
      // 0557: goto 055e
      // 055a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055d: athrow
      // 055e: iload 7
      // 0560: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0563: iinc 6 1
      // 0566: aload 3
      // 0567: ifnonnull 0099
      // 056a: aload 0
      // 056b: sipush 32680
      // 056e: ldc2_w 6661901957014359160
      // 0571: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0574: aload 3
      // 0575: ifnull 058f
      // 0578: invokevirtual com/finalshell/io/YM3.write (I)V
      // 057b: iload 2
      // 057c: goto 0583
      // 057f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0582: athrow
      // 0583: ifeq 0592
      // 0586: aload 0
      // 0587: iload 2
      // 0588: goto 058f
      // 058b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058e: athrow
      // 058f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0592: return
      // 0593: aload 0
      // 0594: iload 5
      // 0596: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0599: aload 0
      // 059a: getfield com/finalshell/io/YM3.c I
      // 059d: bipush 1
      // 059e: iadd
      // 059f: istore 6
      // 05a1: iload 6
      // 05a3: iload 4
      // 05a5: iadd
      // 05a6: istore 7
      // 05a8: aload 0
      // 05a9: getfield com/finalshell/io/YM3.U [C
      // 05ac: aload 0
      // 05ad: getfield com/finalshell/io/YM3.c I
      // 05b0: sipush 32680
      // 05b3: ldc2_w 6661901957014359160
      // 05b6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 05b9: castore
      // 05ba: aload 1
      // 05bb: bipush 0
      // 05bc: aload 0
      // 05bd: getfield com/finalshell/io/YM3.U [C
      // 05c0: iload 6
      // 05c2: aload 1
      // 05c3: arraylength
      // 05c4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 05c7: aload 0
      // 05c8: iload 5
      // 05ca: putfield com/finalshell/io/YM3.c I
      // 05cd: aload 0
      // 05ce: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 05d1: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 05d4: aload 3
      // 05d5: ifnull 0b23
      // 05d8: ifeq 0b22
      // 05db: goto 05e2
      // 05de: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e1: athrow
      // 05e2: bipush -1
      // 05e3: istore 8
      // 05e5: iload 6
      // 05e7: istore 9
      // 05e9: iload 9
      // 05eb: iload 7
      // 05ed: if_icmpge 076f
      // 05f0: aload 0
      // 05f1: getfield com/finalshell/io/YM3.U [C
      // 05f4: iload 9
      // 05f6: caload
      // 05f7: istore 10
      // 05f9: iload 10
      // 05fb: aload 3
      // 05fc: ifnull 065f
      // 05ff: sipush 32680
      // 0602: ldc2_w 6661901957014359160
      // 0605: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0608: aload 3
      // 0609: ifnull 0781
      // 060c: goto 0613
      // 060f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0612: athrow
      // 0613: if_icmpeq 065d
      // 0616: goto 061d
      // 0619: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061c: athrow
      // 061d: iload 10
      // 061f: aload 3
      // 0620: ifnull 065f
      // 0623: goto 062a
      // 0626: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0629: athrow
      // 062a: sipush 4624
      // 062d: ldc2_w 6912903878219129232
      // 0630: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0633: if_icmpeq 065d
      // 0636: goto 063d
      // 0639: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063c: athrow
      // 063d: iload 10
      // 063f: sipush 29331
      // 0642: ldc2_w 5838482518343647551
      // 0645: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0648: aload 3
      // 0649: ifnull 0685
      // 064c: goto 0653
      // 064f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0652: athrow
      // 0653: if_icmpne 0668
      // 0656: goto 065d
      // 0659: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065c: athrow
      // 065d: iload 9
      // 065f: istore 8
      // 0661: iinc 5 1
      // 0664: aload 3
      // 0665: ifnonnull 0768
      // 0668: iload 10
      // 066a: aload 3
      // 066b: ifnull 070a
      // 066e: goto 0675
      // 0671: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0674: athrow
      // 0675: sipush 19011
      // 0678: ldc2_w 74932091958442375
      // 067b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 067e: goto 0685
      // 0681: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0684: athrow
      // 0685: if_icmpeq 0708
      // 0688: iload 10
      // 068a: aload 3
      // 068b: ifnull 070a
      // 068e: goto 0695
      // 0691: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0694: athrow
      // 0695: sipush 7603
      // 0698: ldc2_w 7325892985974222453
      // 069b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 069e: if_icmpeq 0708
      // 06a1: goto 06a8
      // 06a4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a7: athrow
      // 06a8: iload 10
      // 06aa: aload 3
      // 06ab: ifnull 070a
      // 06ae: goto 06b5
      // 06b1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b4: athrow
      // 06b5: sipush 23523
      // 06b8: ldc2_w 2731639075105253491
      // 06bb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06be: if_icmpeq 0708
      // 06c1: goto 06c8
      // 06c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c7: athrow
      // 06c8: iload 10
      // 06ca: aload 3
      // 06cb: ifnull 070a
      // 06ce: goto 06d5
      // 06d1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d4: athrow
      // 06d5: sipush 13058
      // 06d8: ldc2_w 5903679206401720468
      // 06db: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06de: if_icmpeq 0708
      // 06e1: goto 06e8
      // 06e4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e7: athrow
      // 06e8: iload 10
      // 06ea: sipush 28589
      // 06ed: ldc2_w 2513251627265039423
      // 06f0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06f3: aload 3
      // 06f4: ifnull 0725
      // 06f7: goto 06fe
      // 06fa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06fd: athrow
      // 06fe: if_icmpne 0713
      // 0701: goto 0708
      // 0704: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0707: athrow
      // 0708: iload 9
      // 070a: istore 8
      // 070c: iinc 5 1
      // 070f: aload 3
      // 0710: ifnonnull 0768
      // 0713: iload 10
      // 0715: sipush 15095
      // 0718: ldc2_w 2207052621178587477
      // 071b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 071e: goto 0725
      // 0721: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0724: athrow
      // 0725: aload 3
      // 0726: ifnull 075b
      // 0729: if_icmpge 073e
      // 072c: goto 0733
      // 072f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0732: athrow
      // 0733: iload 9
      // 0735: istore 8
      // 0737: iinc 5 5
      // 073a: aload 3
      // 073b: ifnonnull 0768
      // 073e: iload 10
      // 0740: aload 3
      // 0741: ifnull 0760
      // 0744: goto 074b
      // 0747: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074a: athrow
      // 074b: sipush 17176
      // 074e: ldc2_w 5558249671418261723
      // 0751: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0754: goto 075b
      // 0757: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075a: athrow
      // 075b: if_icmplt 0768
      // 075e: iload 9
      // 0760: istore 8
      // 0762: iinc 5 5
      // 0765: goto 0768
      // 0768: iinc 9 1
      // 076b: aload 3
      // 076c: ifnonnull 05e9
      // 076f: iload 5
      // 0771: aload 3
      // 0772: ifnull 0799
      // 0775: aload 0
      // 0776: getfield com/finalshell/io/YM3.U [C
      // 0779: arraylength
      // 077a: goto 0781
      // 077d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0780: athrow
      // 0781: if_icmple 0791
      // 0784: aload 0
      // 0785: iload 5
      // 0787: invokevirtual com/finalshell/io/YM3.L (I)V
      // 078a: goto 0791
      // 078d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0790: athrow
      // 0791: aload 0
      // 0792: iload 5
      // 0794: putfield com/finalshell/io/YM3.c I
      // 0797: iload 8
      // 0799: istore 9
      // 079b: iload 9
      // 079d: iload 6
      // 079f: if_icmplt 0ad7
      // 07a2: aload 0
      // 07a3: getfield com/finalshell/io/YM3.U [C
      // 07a6: iload 9
      // 07a8: caload
      // 07a9: istore 10
      // 07ab: aload 3
      // 07ac: ifnull 0892
      // 07af: iload 10
      // 07b1: aload 3
      // 07b2: ifnull 0ad8
      // 07b5: goto 07bc
      // 07b8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07bb: athrow
      // 07bc: sipush 19011
      // 07bf: ldc2_w 74932091958442375
      // 07c2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07c5: if_icmpeq 084f
      // 07c8: goto 07cf
      // 07cb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07ce: athrow
      // 07cf: iload 10
      // 07d1: sipush 7603
      // 07d4: ldc2_w 7325892985974222453
      // 07d7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07da: aload 3
      // 07db: ifnull 0801
      // 07de: goto 07e5
      // 07e1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e4: athrow
      // 07e5: if_icmpeq 084f
      // 07e8: goto 07ef
      // 07eb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07ee: athrow
      // 07ef: iload 10
      // 07f1: sipush 23523
      // 07f4: ldc2_w 2731639075105253491
      // 07f7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 07fa: goto 0801
      // 07fd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0800: athrow
      // 0801: aload 3
      // 0802: ifnull 0821
      // 0805: if_icmpeq 084f
      // 0808: goto 080f
      // 080b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080e: athrow
      // 080f: iload 10
      // 0811: sipush 13058
      // 0814: ldc2_w 5903679206401720468
      // 0817: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 081a: goto 0821
      // 081d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0820: athrow
      // 0821: aload 3
      // 0822: ifnull 0841
      // 0825: if_icmpeq 084f
      // 0828: goto 082f
      // 082b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082e: athrow
      // 082f: iload 10
      // 0831: sipush 28589
      // 0834: ldc2_w 2513251627265039423
      // 0837: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 083a: goto 0841
      // 083d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0840: athrow
      // 0841: aload 3
      // 0842: ifnull 08a8
      // 0845: if_icmpne 0896
      // 0848: goto 084f
      // 084b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084e: athrow
      // 084f: aload 0
      // 0850: getfield com/finalshell/io/YM3.U [C
      // 0853: iload 9
      // 0855: bipush 1
      // 0856: iadd
      // 0857: aload 0
      // 0858: getfield com/finalshell/io/YM3.U [C
      // 085b: iload 9
      // 085d: bipush 2
      // 085e: iadd
      // 085f: iload 7
      // 0861: iload 9
      // 0863: isub
      // 0864: bipush 1
      // 0865: isub
      // 0866: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0869: aload 0
      // 086a: getfield com/finalshell/io/YM3.U [C
      // 086d: iload 9
      // 086f: sipush 29331
      // 0872: ldc2_w 5838482518343647551
      // 0875: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0878: castore
      // 0879: aload 0
      // 087a: getfield com/finalshell/io/YM3.U [C
      // 087d: iload 9
      // 087f: bipush 1
      // 0880: iadd
      // 0881: getstatic com/finalshell/core/S7.Q [C
      // 0884: iload 10
      // 0886: caload
      // 0887: castore
      // 0888: iinc 7 1
      // 088b: goto 0892
      // 088e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0891: athrow
      // 0892: aload 3
      // 0893: ifnonnull 0ad0
      // 0896: iload 10
      // 0898: sipush 32680
      // 089b: ldc2_w 6661901957014359160
      // 089e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08a1: goto 08a8
      // 08a4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a7: athrow
      // 08a8: aload 3
      // 08a9: ifnull 08c8
      // 08ac: if_icmpeq 08f6
      // 08af: goto 08b6
      // 08b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b5: athrow
      // 08b6: iload 10
      // 08b8: sipush 4624
      // 08bb: ldc2_w 6912903878219129232
      // 08be: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08c1: goto 08c8
      // 08c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c7: athrow
      // 08c8: aload 3
      // 08c9: ifnull 08e8
      // 08cc: if_icmpeq 08f6
      // 08cf: goto 08d6
      // 08d2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d5: athrow
      // 08d6: iload 10
      // 08d8: sipush 29331
      // 08db: ldc2_w 5838482518343647551
      // 08de: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 08e1: goto 08e8
      // 08e4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e7: athrow
      // 08e8: aload 3
      // 08e9: ifnull 094b
      // 08ec: if_icmpne 0939
      // 08ef: goto 08f6
      // 08f2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f5: athrow
      // 08f6: aload 0
      // 08f7: getfield com/finalshell/io/YM3.U [C
      // 08fa: iload 9
      // 08fc: bipush 1
      // 08fd: iadd
      // 08fe: aload 0
      // 08ff: getfield com/finalshell/io/YM3.U [C
      // 0902: iload 9
      // 0904: bipush 2
      // 0905: iadd
      // 0906: iload 7
      // 0908: iload 9
      // 090a: isub
      // 090b: bipush 1
      // 090c: isub
      // 090d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0910: aload 0
      // 0911: getfield com/finalshell/io/YM3.U [C
      // 0914: iload 9
      // 0916: sipush 29331
      // 0919: ldc2_w 5838482518343647551
      // 091c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 091f: castore
      // 0920: aload 0
      // 0921: getfield com/finalshell/io/YM3.U [C
      // 0924: iload 9
      // 0926: bipush 1
      // 0927: iadd
      // 0928: iload 10
      // 092a: castore
      // 092b: iinc 7 1
      // 092e: aload 3
      // 092f: ifnonnull 0ad0
      // 0932: goto 0939
      // 0935: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0938: athrow
      // 0939: iload 10
      // 093b: sipush 15095
      // 093e: ldc2_w 2207052621178587477
      // 0941: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0944: goto 094b
      // 0947: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094a: athrow
      // 094b: aload 3
      // 094c: ifnull 0a05
      // 094f: if_icmpge 09f3
      // 0952: goto 0959
      // 0955: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0958: athrow
      // 0959: aload 0
      // 095a: getfield com/finalshell/io/YM3.U [C
      // 095d: iload 9
      // 095f: bipush 1
      // 0960: iadd
      // 0961: aload 0
      // 0962: getfield com/finalshell/io/YM3.U [C
      // 0965: iload 9
      // 0967: sipush 3986
      // 096a: ldc2_w 2743502366801689638
      // 096d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0970: iadd
      // 0971: iload 7
      // 0973: iload 9
      // 0975: isub
      // 0976: bipush 1
      // 0977: isub
      // 0978: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 097b: aload 0
      // 097c: getfield com/finalshell/io/YM3.U [C
      // 097f: iload 9
      // 0981: sipush 29331
      // 0984: ldc2_w 5838482518343647551
      // 0987: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 098a: castore
      // 098b: aload 0
      // 098c: getfield com/finalshell/io/YM3.U [C
      // 098f: iload 9
      // 0991: bipush 1
      // 0992: iadd
      // 0993: sipush 32152
      // 0996: ldc2_w 2468978250544385558
      // 0999: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 099c: castore
      // 099d: aload 0
      // 099e: getfield com/finalshell/io/YM3.U [C
      // 09a1: iload 9
      // 09a3: bipush 2
      // 09a4: iadd
      // 09a5: sipush 7439
      // 09a8: ldc2_w 4938701561976712839
      // 09ab: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09ae: castore
      // 09af: aload 0
      // 09b0: getfield com/finalshell/io/YM3.U [C
      // 09b3: iload 9
      // 09b5: bipush 3
      // 09b6: iadd
      // 09b7: sipush 7439
      // 09ba: ldc2_w 4938701561976712839
      // 09bd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09c0: castore
      // 09c1: aload 0
      // 09c2: getfield com/finalshell/io/YM3.U [C
      // 09c5: iload 9
      // 09c7: bipush 4
      // 09c8: iadd
      // 09c9: getstatic com/finalshell/core/S7.n [C
      // 09cc: iload 10
      // 09ce: bipush 2
      // 09cf: imul
      // 09d0: caload
      // 09d1: castore
      // 09d2: aload 0
      // 09d3: getfield com/finalshell/io/YM3.U [C
      // 09d6: iload 9
      // 09d8: bipush 5
      // 09d9: iadd
      // 09da: getstatic com/finalshell/core/S7.n [C
      // 09dd: iload 10
      // 09df: bipush 2
      // 09e0: imul
      // 09e1: bipush 1
      // 09e2: iadd
      // 09e3: caload
      // 09e4: castore
      // 09e5: iinc 7 5
      // 09e8: aload 3
      // 09e9: ifnonnull 0ad0
      // 09ec: goto 09f3
      // 09ef: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f2: athrow
      // 09f3: iload 10
      // 09f5: sipush 17176
      // 09f8: ldc2_w 5558249671418261723
      // 09fb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09fe: goto 0a05
      // 0a01: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a04: athrow
      // 0a05: if_icmplt 0ad0
      // 0a08: aload 0
      // 0a09: getfield com/finalshell/io/YM3.U [C
      // 0a0c: iload 9
      // 0a0e: bipush 1
      // 0a0f: iadd
      // 0a10: aload 0
      // 0a11: getfield com/finalshell/io/YM3.U [C
      // 0a14: iload 9
      // 0a16: sipush 3986
      // 0a19: ldc2_w 2743502366801689638
      // 0a1c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a1f: iadd
      // 0a20: iload 7
      // 0a22: iload 9
      // 0a24: isub
      // 0a25: bipush 1
      // 0a26: isub
      // 0a27: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a2a: aload 0
      // 0a2b: getfield com/finalshell/io/YM3.U [C
      // 0a2e: iload 9
      // 0a30: sipush 29331
      // 0a33: ldc2_w 5838482518343647551
      // 0a36: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a39: castore
      // 0a3a: aload 0
      // 0a3b: getfield com/finalshell/io/YM3.U [C
      // 0a3e: iload 9
      // 0a40: bipush 1
      // 0a41: iadd
      // 0a42: sipush 32152
      // 0a45: ldc2_w 2468978250544385558
      // 0a48: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a4b: castore
      // 0a4c: aload 0
      // 0a4d: getfield com/finalshell/io/YM3.U [C
      // 0a50: iload 9
      // 0a52: bipush 2
      // 0a53: iadd
      // 0a54: getstatic com/finalshell/core/S7.y [C
      // 0a57: iload 10
      // 0a59: sipush 7603
      // 0a5c: ldc2_w 7325892985974222453
      // 0a5f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a62: iushr
      // 0a63: sipush 21773
      // 0a66: ldc2_w 6638525112670398138
      // 0a69: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a6c: iand
      // 0a6d: caload
      // 0a6e: castore
      // 0a6f: aload 0
      // 0a70: getfield com/finalshell/io/YM3.U [C
      // 0a73: iload 9
      // 0a75: bipush 3
      // 0a76: iadd
      // 0a77: getstatic com/finalshell/core/S7.y [C
      // 0a7a: iload 10
      // 0a7c: sipush 19011
      // 0a7f: ldc2_w 74932091958442375
      // 0a82: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a85: iushr
      // 0a86: sipush 21773
      // 0a89: ldc2_w 6638525112670398138
      // 0a8c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a8f: iand
      // 0a90: caload
      // 0a91: castore
      // 0a92: aload 0
      // 0a93: getfield com/finalshell/io/YM3.U [C
      // 0a96: iload 9
      // 0a98: bipush 4
      // 0a99: iadd
      // 0a9a: getstatic com/finalshell/core/S7.y [C
      // 0a9d: iload 10
      // 0a9f: bipush 4
      // 0aa0: iushr
      // 0aa1: sipush 21773
      // 0aa4: ldc2_w 6638525112670398138
      // 0aa7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0aaa: iand
      // 0aab: caload
      // 0aac: castore
      // 0aad: aload 0
      // 0aae: getfield com/finalshell/io/YM3.U [C
      // 0ab1: iload 9
      // 0ab3: bipush 5
      // 0ab4: iadd
      // 0ab5: getstatic com/finalshell/core/S7.y [C
      // 0ab8: iload 10
      // 0aba: sipush 21773
      // 0abd: ldc2_w 6638525112670398138
      // 0ac0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ac3: iand
      // 0ac4: caload
      // 0ac5: castore
      // 0ac6: iinc 7 5
      // 0ac9: goto 0ad0
      // 0acc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0acf: athrow
      // 0ad0: iinc 9 -1
      // 0ad3: aload 3
      // 0ad4: ifnonnull 079b
      // 0ad7: iload 2
      // 0ad8: ifeq 0b06
      // 0adb: aload 0
      // 0adc: getfield com/finalshell/io/YM3.U [C
      // 0adf: aload 0
      // 0ae0: getfield com/finalshell/io/YM3.c I
      // 0ae3: bipush 2
      // 0ae4: isub
      // 0ae5: sipush 32680
      // 0ae8: ldc2_w 6661901957014359160
      // 0aeb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0aee: castore
      // 0aef: aload 0
      // 0af0: getfield com/finalshell/io/YM3.U [C
      // 0af3: aload 0
      // 0af4: getfield com/finalshell/io/YM3.c I
      // 0af7: bipush 1
      // 0af8: isub
      // 0af9: iload 2
      // 0afa: castore
      // 0afb: aload 3
      // 0afc: ifnonnull 0b21
      // 0aff: goto 0b06
      // 0b02: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b05: athrow
      // 0b06: aload 0
      // 0b07: getfield com/finalshell/io/YM3.U [C
      // 0b0a: aload 0
      // 0b0b: getfield com/finalshell/io/YM3.c I
      // 0b0e: bipush 1
      // 0b0f: isub
      // 0b10: sipush 32680
      // 0b13: ldc2_w 6661901957014359160
      // 0b16: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b19: castore
      // 0b1a: goto 0b21
      // 0b1d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b20: athrow
      // 0b21: return
      // 0b22: bipush 0
      // 0b23: istore 8
      // 0b25: bipush -1
      // 0b26: istore 9
      // 0b28: bipush -1
      // 0b29: istore 10
      // 0b2b: bipush 0
      // 0b2c: istore 11
      // 0b2e: iload 6
      // 0b30: istore 12
      // 0b32: iload 12
      // 0b34: iload 7
      // 0b36: if_icmpge 0d65
      // 0b39: aload 0
      // 0b3a: getfield com/finalshell/io/YM3.U [C
      // 0b3d: iload 12
      // 0b3f: caload
      // 0b40: istore 13
      // 0b42: iload 13
      // 0b44: sipush 10460
      // 0b47: ldc2_w 6283370691821230963
      // 0b4a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b4d: aload 3
      // 0b4e: ifnull 0d83
      // 0b51: aload 3
      // 0b52: ifnull 0c26
      // 0b55: goto 0b5c
      // 0b58: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5b: athrow
      // 0b5c: if_icmplt 0c14
      // 0b5f: goto 0b66
      // 0b62: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b65: athrow
      // 0b66: iload 13
      // 0b68: sipush 17176
      // 0b6b: ldc2_w 5558249671418261723
      // 0b6e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b71: aload 3
      // 0b72: ifnull 0b98
      // 0b75: goto 0b7c
      // 0b78: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7b: athrow
      // 0b7c: if_icmplt 0d5e
      // 0b7f: goto 0b86
      // 0b82: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b85: athrow
      // 0b86: iload 13
      // 0b88: sipush 27592
      // 0b8b: ldc2_w 5349127045759342678
      // 0b8e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0b91: goto 0b98
      // 0b94: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b97: athrow
      // 0b98: aload 3
      // 0b99: ifnull 0bfb
      // 0b9c: if_icmpeq 0be6
      // 0b9f: goto 0ba6
      // 0ba2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba5: athrow
      // 0ba6: iload 13
      // 0ba8: sipush 3052
      // 0bab: ldc2_w 3411686180789123159
      // 0bae: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0bb1: aload 3
      // 0bb2: ifnull 0bfb
      // 0bb5: goto 0bbc
      // 0bb8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bbb: athrow
      // 0bbc: if_icmpeq 0be6
      // 0bbf: goto 0bc6
      // 0bc2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc5: athrow
      // 0bc6: iload 13
      // 0bc8: sipush 817
      // 0bcb: ldc2_w 6505768906698158210
      // 0bce: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0bd1: aload 3
      // 0bd2: ifnull 0bfb
      // 0bd5: goto 0bdc
      // 0bd8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bdb: athrow
      // 0bdc: if_icmpge 0d5e
      // 0bdf: goto 0be6
      // 0be2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be5: athrow
      // 0be6: iload 10
      // 0be8: aload 3
      // 0be9: ifnull 0c0b
      // 0bec: goto 0bf3
      // 0bef: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf2: athrow
      // 0bf3: bipush -1
      // 0bf4: goto 0bfb
      // 0bf7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bfa: athrow
      // 0bfb: if_icmpne 0c02
      // 0bfe: iload 12
      // 0c00: istore 10
      // 0c02: iinc 8 1
      // 0c05: iload 12
      // 0c07: istore 9
      // 0c09: iload 13
      // 0c0b: istore 11
      // 0c0d: iinc 5 4
      // 0c10: aload 3
      // 0c11: ifnonnull 0d5e
      // 0c14: iload 13
      // 0c16: sipush 6005
      // 0c19: ldc2_w 3649355536797459666
      // 0c1c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0c1f: goto 0c26
      // 0c22: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c25: athrow
      // 0c26: aload 3
      // 0c27: ifnull 0c71
      // 0c2a: if_icmpge 0c54
      // 0c2d: goto 0c34
      // 0c30: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c33: athrow
      // 0c34: aload 0
      // 0c35: getfield com/finalshell/io/YM3.s J
      // 0c38: lconst_1
      // 0c39: iload 13
      // 0c3b: lshl
      // 0c3c: land
      // 0c3d: lconst_0
      // 0c3e: lcmp
      // 0c3f: aload 3
      // 0c40: ifnull 0c75
      // 0c43: goto 0c4a
      // 0c46: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c49: athrow
      // 0c4a: ifne 0c74
      // 0c4d: goto 0c54
      // 0c50: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c53: athrow
      // 0c54: iload 13
      // 0c56: aload 3
      // 0c57: ifnull 0c75
      // 0c5a: goto 0c61
      // 0c5d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c60: athrow
      // 0c61: sipush 29331
      // 0c64: ldc2_w 5838482518343647551
      // 0c67: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0c6a: goto 0c71
      // 0c6d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c70: athrow
      // 0c71: if_icmpne 0c78
      // 0c74: bipush 1
      // 0c75: goto 0c79
      // 0c78: bipush 0
      // 0c79: istore 14
      // 0c7b: aload 3
      // 0c7c: ifnull 0d61
      // 0c7f: iload 14
      // 0c81: ifeq 0d5e
      // 0c84: goto 0c8b
      // 0c87: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8a: athrow
      // 0c8b: iinc 8 1
      // 0c8e: iload 12
      // 0c90: istore 9
      // 0c92: iload 13
      // 0c94: istore 11
      // 0c96: iload 13
      // 0c98: sipush 26409
      // 0c9b: ldc2_w 6991741584307557557
      // 0c9e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ca1: aload 3
      // 0ca2: ifnull 0cc1
      // 0ca5: if_icmpeq 0d46
      // 0ca8: goto 0caf
      // 0cab: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cae: athrow
      // 0caf: iload 13
      // 0cb1: sipush 26201
      // 0cb4: ldc2_w 1379715028855887237
      // 0cb7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0cba: goto 0cc1
      // 0cbd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc0: athrow
      // 0cc1: aload 3
      // 0cc2: ifnull 0ce1
      // 0cc5: if_icmpeq 0d46
      // 0cc8: goto 0ccf
      // 0ccb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cce: athrow
      // 0ccf: iload 13
      // 0cd1: sipush 6084
      // 0cd4: ldc2_w 7009744229576303721
      // 0cd7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0cda: goto 0ce1
      // 0cdd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce0: athrow
      // 0ce1: aload 3
      // 0ce2: ifnull 0d01
      // 0ce5: if_icmpeq 0d46
      // 0ce8: goto 0cef
      // 0ceb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cee: athrow
      // 0cef: iload 13
      // 0cf1: sipush 10281
      // 0cf4: ldc2_w 6620221265790393235
      // 0cf7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0cfa: goto 0d01
      // 0cfd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d00: athrow
      // 0d01: aload 3
      // 0d02: ifnull 0d1c
      // 0d05: if_icmpeq 0d46
      // 0d08: goto 0d0f
      // 0d0b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0e: athrow
      // 0d0f: iload 13
      // 0d11: getstatic com/finalshell/core/S7.j [B
      // 0d14: arraylength
      // 0d15: goto 0d1c
      // 0d18: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1b: athrow
      // 0d1c: aload 3
      // 0d1d: ifnull 0d57
      // 0d20: if_icmpge 0d49
      // 0d23: goto 0d2a
      // 0d26: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d29: athrow
      // 0d2a: getstatic com/finalshell/core/S7.j [B
      // 0d2d: iload 13
      // 0d2f: baload
      // 0d30: bipush 4
      // 0d31: aload 3
      // 0d32: ifnull 0d57
      // 0d35: goto 0d3c
      // 0d38: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3b: athrow
      // 0d3c: if_icmpne 0d49
      // 0d3f: goto 0d46
      // 0d42: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d45: athrow
      // 0d46: iinc 5 4
      // 0d49: iload 10
      // 0d4b: aload 3
      // 0d4c: ifnull 0d5c
      // 0d4f: bipush -1
      // 0d50: goto 0d57
      // 0d53: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d56: athrow
      // 0d57: if_icmpne 0d5e
      // 0d5a: iload 12
      // 0d5c: istore 10
      // 0d5e: iinc 12 1
      // 0d61: aload 3
      // 0d62: ifnonnull 0b32
      // 0d65: iload 8
      // 0d67: aload 3
      // 0d68: ifnull 15d0
      // 0d6b: ifle 15cf
      // 0d6e: goto 0d75
      // 0d71: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d74: athrow
      // 0d75: iload 5
      // 0d77: iload 8
      // 0d79: iadd
      // 0d7a: istore 5
      // 0d7c: iload 5
      // 0d7e: aload 0
      // 0d7f: getfield com/finalshell/io/YM3.U [C
      // 0d82: arraylength
      // 0d83: aload 3
      // 0d84: ifnull 0da7
      // 0d87: if_icmple 0d9e
      // 0d8a: goto 0d91
      // 0d8d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d90: athrow
      // 0d91: aload 0
      // 0d92: iload 5
      // 0d94: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0d97: goto 0d9e
      // 0d9a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9d: athrow
      // 0d9e: aload 0
      // 0d9f: iload 5
      // 0da1: putfield com/finalshell/io/YM3.c I
      // 0da4: iload 8
      // 0da6: bipush 1
      // 0da7: aload 3
      // 0da8: ifnull 1202
      // 0dab: if_icmpne 11ed
      // 0dae: goto 0db5
      // 0db1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db4: athrow
      // 0db5: iload 11
      // 0db7: sipush 27592
      // 0dba: ldc2_w 5349127045759342678
      // 0dbd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0dc0: aload 3
      // 0dc1: ifnull 0e88
      // 0dc4: goto 0dcb
      // 0dc7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dca: athrow
      // 0dcb: if_icmpne 0e76
      // 0dce: goto 0dd5
      // 0dd1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd4: athrow
      // 0dd5: iload 9
      // 0dd7: bipush 1
      // 0dd8: iadd
      // 0dd9: istore 12
      // 0ddb: iload 9
      // 0ddd: sipush 3986
      // 0de0: ldc2_w 2743502366801689638
      // 0de3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0de6: iadd
      // 0de7: istore 13
      // 0de9: iload 7
      // 0deb: iload 9
      // 0ded: isub
      // 0dee: bipush 1
      // 0def: isub
      // 0df0: istore 14
      // 0df2: aload 0
      // 0df3: getfield com/finalshell/io/YM3.U [C
      // 0df6: iload 12
      // 0df8: aload 0
      // 0df9: getfield com/finalshell/io/YM3.U [C
      // 0dfc: iload 13
      // 0dfe: iload 14
      // 0e00: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e03: aload 0
      // 0e04: getfield com/finalshell/io/YM3.U [C
      // 0e07: iload 9
      // 0e09: sipush 29331
      // 0e0c: ldc2_w 5838482518343647551
      // 0e0f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e12: castore
      // 0e13: aload 0
      // 0e14: getfield com/finalshell/io/YM3.U [C
      // 0e17: iinc 9 1
      // 0e1a: iload 9
      // 0e1c: sipush 32152
      // 0e1f: ldc2_w 2468978250544385558
      // 0e22: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e25: castore
      // 0e26: aload 0
      // 0e27: getfield com/finalshell/io/YM3.U [C
      // 0e2a: iinc 9 1
      // 0e2d: iload 9
      // 0e2f: sipush 7575
      // 0e32: ldc2_w 560967801291468318
      // 0e35: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e38: castore
      // 0e39: aload 0
      // 0e3a: getfield com/finalshell/io/YM3.U [C
      // 0e3d: iinc 9 1
      // 0e40: iload 9
      // 0e42: sipush 7439
      // 0e45: ldc2_w 4938701561976712839
      // 0e48: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e4b: castore
      // 0e4c: aload 0
      // 0e4d: getfield com/finalshell/io/YM3.U [C
      // 0e50: iinc 9 1
      // 0e53: iload 9
      // 0e55: sipush 7575
      // 0e58: ldc2_w 560967801291468318
      // 0e5b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e5e: castore
      // 0e5f: aload 0
      // 0e60: getfield com/finalshell/io/YM3.U [C
      // 0e63: iinc 9 1
      // 0e66: iload 9
      // 0e68: sipush 16310
      // 0e6b: ldc2_w 5418059658387213321
      // 0e6e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e71: castore
      // 0e72: aload 3
      // 0e73: ifnonnull 15cf
      // 0e76: iload 11
      // 0e78: sipush 3052
      // 0e7b: ldc2_w 3411686180789123159
      // 0e7e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e81: goto 0e88
      // 0e84: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e87: athrow
      // 0e88: aload 3
      // 0e89: ifnull 0f49
      // 0e8c: if_icmpne 0f37
      // 0e8f: goto 0e96
      // 0e92: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e95: athrow
      // 0e96: iload 9
      // 0e98: bipush 1
      // 0e99: iadd
      // 0e9a: istore 12
      // 0e9c: iload 9
      // 0e9e: sipush 3986
      // 0ea1: ldc2_w 2743502366801689638
      // 0ea4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ea7: iadd
      // 0ea8: istore 13
      // 0eaa: iload 7
      // 0eac: iload 9
      // 0eae: isub
      // 0eaf: bipush 1
      // 0eb0: isub
      // 0eb1: istore 14
      // 0eb3: aload 0
      // 0eb4: getfield com/finalshell/io/YM3.U [C
      // 0eb7: iload 12
      // 0eb9: aload 0
      // 0eba: getfield com/finalshell/io/YM3.U [C
      // 0ebd: iload 13
      // 0ebf: iload 14
      // 0ec1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ec4: aload 0
      // 0ec5: getfield com/finalshell/io/YM3.U [C
      // 0ec8: iload 9
      // 0eca: sipush 29331
      // 0ecd: ldc2_w 5838482518343647551
      // 0ed0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ed3: castore
      // 0ed4: aload 0
      // 0ed5: getfield com/finalshell/io/YM3.U [C
      // 0ed8: iinc 9 1
      // 0edb: iload 9
      // 0edd: sipush 32152
      // 0ee0: ldc2_w 2468978250544385558
      // 0ee3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ee6: castore
      // 0ee7: aload 0
      // 0ee8: getfield com/finalshell/io/YM3.U [C
      // 0eeb: iinc 9 1
      // 0eee: iload 9
      // 0ef0: sipush 7575
      // 0ef3: ldc2_w 560967801291468318
      // 0ef6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ef9: castore
      // 0efa: aload 0
      // 0efb: getfield com/finalshell/io/YM3.U [C
      // 0efe: iinc 9 1
      // 0f01: iload 9
      // 0f03: sipush 7439
      // 0f06: ldc2_w 4938701561976712839
      // 0f09: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f0c: castore
      // 0f0d: aload 0
      // 0f0e: getfield com/finalshell/io/YM3.U [C
      // 0f11: iinc 9 1
      // 0f14: iload 9
      // 0f16: sipush 7575
      // 0f19: ldc2_w 560967801291468318
      // 0f1c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f1f: castore
      // 0f20: aload 0
      // 0f21: getfield com/finalshell/io/YM3.U [C
      // 0f24: iinc 9 1
      // 0f27: iload 9
      // 0f29: sipush 18773
      // 0f2c: ldc2_w 6087480711469153005
      // 0f2f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f32: castore
      // 0f33: aload 3
      // 0f34: ifnonnull 15cf
      // 0f37: iload 11
      // 0f39: sipush 26409
      // 0f3c: ldc2_w 6991741584307557557
      // 0f3f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f42: goto 0f49
      // 0f45: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f48: athrow
      // 0f49: aload 3
      // 0f4a: ifnull 0fc8
      // 0f4d: if_icmpeq 0fb7
      // 0f50: goto 0f57
      // 0f53: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f56: athrow
      // 0f57: iload 11
      // 0f59: sipush 26201
      // 0f5c: ldc2_w 1379715028855887237
      // 0f5f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f62: aload 3
      // 0f63: ifnull 0fc8
      // 0f66: goto 0f6d
      // 0f69: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6c: athrow
      // 0f6d: if_icmpeq 0fb7
      // 0f70: goto 0f77
      // 0f73: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f76: athrow
      // 0f77: iload 11
      // 0f79: sipush 6084
      // 0f7c: ldc2_w 7009744229576303721
      // 0f7f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f82: aload 3
      // 0f83: ifnull 0fc8
      // 0f86: goto 0f8d
      // 0f89: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8c: athrow
      // 0f8d: if_icmpeq 0fb7
      // 0f90: goto 0f97
      // 0f93: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f96: athrow
      // 0f97: iload 11
      // 0f99: sipush 10281
      // 0f9c: ldc2_w 6620221265790393235
      // 0f9f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fa2: aload 3
      // 0fa3: ifnull 1098
      // 0fa6: goto 0fad
      // 0fa9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fac: athrow
      // 0fad: if_icmpne 108e
      // 0fb0: goto 0fb7
      // 0fb3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb6: athrow
      // 0fb7: iload 9
      // 0fb9: bipush 1
      // 0fba: iadd
      // 0fbb: istore 12
      // 0fbd: iload 9
      // 0fbf: sipush 3986
      // 0fc2: ldc2_w 2743502366801689638
      // 0fc5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fc8: iadd
      // 0fc9: istore 13
      // 0fcb: iload 7
      // 0fcd: iload 9
      // 0fcf: isub
      // 0fd0: bipush 1
      // 0fd1: isub
      // 0fd2: istore 14
      // 0fd4: aload 0
      // 0fd5: getfield com/finalshell/io/YM3.U [C
      // 0fd8: iload 12
      // 0fda: aload 0
      // 0fdb: getfield com/finalshell/io/YM3.U [C
      // 0fde: iload 13
      // 0fe0: iload 14
      // 0fe2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0fe5: aload 0
      // 0fe6: getfield com/finalshell/io/YM3.U [C
      // 0fe9: iload 9
      // 0feb: sipush 29331
      // 0fee: ldc2_w 5838482518343647551
      // 0ff1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ff4: castore
      // 0ff5: aload 0
      // 0ff6: getfield com/finalshell/io/YM3.U [C
      // 0ff9: iinc 9 1
      // 0ffc: iload 9
      // 0ffe: sipush 32152
      // 1001: ldc2_w 2468978250544385558
      // 1004: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1007: castore
      // 1008: iload 11
      // 100a: istore 15
      // 100c: aload 0
      // 100d: getfield com/finalshell/io/YM3.U [C
      // 1010: iinc 9 1
      // 1013: iload 9
      // 1015: getstatic com/finalshell/core/S7.y [C
      // 1018: iload 15
      // 101a: sipush 7603
      // 101d: ldc2_w 7325892985974222453
      // 1020: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1023: iushr
      // 1024: sipush 21773
      // 1027: ldc2_w 6638525112670398138
      // 102a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 102d: iand
      // 102e: caload
      // 102f: castore
      // 1030: aload 0
      // 1031: getfield com/finalshell/io/YM3.U [C
      // 1034: iinc 9 1
      // 1037: iload 9
      // 1039: getstatic com/finalshell/core/S7.y [C
      // 103c: iload 15
      // 103e: sipush 19011
      // 1041: ldc2_w 74932091958442375
      // 1044: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1047: iushr
      // 1048: sipush 21773
      // 104b: ldc2_w 6638525112670398138
      // 104e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1051: iand
      // 1052: caload
      // 1053: castore
      // 1054: aload 0
      // 1055: getfield com/finalshell/io/YM3.U [C
      // 1058: iinc 9 1
      // 105b: iload 9
      // 105d: getstatic com/finalshell/core/S7.y [C
      // 1060: iload 15
      // 1062: bipush 4
      // 1063: iushr
      // 1064: sipush 21773
      // 1067: ldc2_w 6638525112670398138
      // 106a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 106d: iand
      // 106e: caload
      // 106f: castore
      // 1070: aload 0
      // 1071: getfield com/finalshell/io/YM3.U [C
      // 1074: iinc 9 1
      // 1077: iload 9
      // 1079: getstatic com/finalshell/core/S7.y [C
      // 107c: iload 15
      // 107e: sipush 21773
      // 1081: ldc2_w 6638525112670398138
      // 1084: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1087: iand
      // 1088: caload
      // 1089: castore
      // 108a: aload 3
      // 108b: ifnonnull 15cf
      // 108e: iload 11
      // 1090: istore 12
      // 1092: iload 12
      // 1094: getstatic com/finalshell/core/S7.j [B
      // 1097: arraylength
      // 1098: aload 3
      // 1099: ifnull 11a6
      // 109c: if_icmpge 119c
      // 109f: goto 10a6
      // 10a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a5: athrow
      // 10a6: getstatic com/finalshell/core/S7.j [B
      // 10a9: iload 12
      // 10ab: baload
      // 10ac: bipush 4
      // 10ad: aload 3
      // 10ae: ifnull 11a6
      // 10b1: goto 10b8
      // 10b4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b7: athrow
      // 10b8: if_icmpne 119c
      // 10bb: goto 10c2
      // 10be: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c1: athrow
      // 10c2: iload 9
      // 10c4: bipush 1
      // 10c5: iadd
      // 10c6: istore 13
      // 10c8: iload 9
      // 10ca: sipush 3986
      // 10cd: ldc2_w 2743502366801689638
      // 10d0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 10d3: iadd
      // 10d4: istore 14
      // 10d6: iload 7
      // 10d8: iload 9
      // 10da: isub
      // 10db: bipush 1
      // 10dc: isub
      // 10dd: istore 15
      // 10df: aload 0
      // 10e0: getfield com/finalshell/io/YM3.U [C
      // 10e3: iload 13
      // 10e5: aload 0
      // 10e6: getfield com/finalshell/io/YM3.U [C
      // 10e9: iload 14
      // 10eb: iload 15
      // 10ed: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 10f0: iload 9
      // 10f2: istore 16
      // 10f4: aload 0
      // 10f5: getfield com/finalshell/io/YM3.U [C
      // 10f8: iload 16
      // 10fa: iinc 16 1
      // 10fd: sipush 29331
      // 1100: ldc2_w 5838482518343647551
      // 1103: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1106: castore
      // 1107: aload 0
      // 1108: getfield com/finalshell/io/YM3.U [C
      // 110b: iload 16
      // 110d: iinc 16 1
      // 1110: sipush 32152
      // 1113: ldc2_w 2468978250544385558
      // 1116: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1119: castore
      // 111a: aload 0
      // 111b: getfield com/finalshell/io/YM3.U [C
      // 111e: iload 16
      // 1120: iinc 16 1
      // 1123: getstatic com/finalshell/core/S7.y [C
      // 1126: iload 12
      // 1128: sipush 7603
      // 112b: ldc2_w 7325892985974222453
      // 112e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1131: iushr
      // 1132: sipush 21773
      // 1135: ldc2_w 6638525112670398138
      // 1138: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 113b: iand
      // 113c: caload
      // 113d: castore
      // 113e: aload 0
      // 113f: getfield com/finalshell/io/YM3.U [C
      // 1142: iload 16
      // 1144: iinc 16 1
      // 1147: getstatic com/finalshell/core/S7.y [C
      // 114a: iload 12
      // 114c: sipush 19011
      // 114f: ldc2_w 74932091958442375
      // 1152: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1155: iushr
      // 1156: sipush 21773
      // 1159: ldc2_w 6638525112670398138
      // 115c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 115f: iand
      // 1160: caload
      // 1161: castore
      // 1162: aload 0
      // 1163: getfield com/finalshell/io/YM3.U [C
      // 1166: iload 16
      // 1168: iinc 16 1
      // 116b: getstatic com/finalshell/core/S7.y [C
      // 116e: iload 12
      // 1170: bipush 4
      // 1171: iushr
      // 1172: sipush 21773
      // 1175: ldc2_w 6638525112670398138
      // 1178: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 117b: iand
      // 117c: caload
      // 117d: castore
      // 117e: aload 0
      // 117f: getfield com/finalshell/io/YM3.U [C
      // 1182: iload 16
      // 1184: iinc 16 1
      // 1187: getstatic com/finalshell/core/S7.y [C
      // 118a: iload 12
      // 118c: sipush 21773
      // 118f: ldc2_w 6638525112670398138
      // 1192: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1195: iand
      // 1196: caload
      // 1197: castore
      // 1198: aload 3
      // 1199: ifnonnull 11e9
      // 119c: iload 9
      // 119e: bipush 1
      // 119f: goto 11a6
      // 11a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a5: athrow
      // 11a6: iadd
      // 11a7: istore 13
      // 11a9: iload 9
      // 11ab: bipush 2
      // 11ac: iadd
      // 11ad: istore 14
      // 11af: iload 7
      // 11b1: iload 9
      // 11b3: isub
      // 11b4: bipush 1
      // 11b5: isub
      // 11b6: istore 15
      // 11b8: aload 0
      // 11b9: getfield com/finalshell/io/YM3.U [C
      // 11bc: iload 13
      // 11be: aload 0
      // 11bf: getfield com/finalshell/io/YM3.U [C
      // 11c2: iload 14
      // 11c4: iload 15
      // 11c6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11c9: aload 0
      // 11ca: getfield com/finalshell/io/YM3.U [C
      // 11cd: iload 9
      // 11cf: sipush 29331
      // 11d2: ldc2_w 5838482518343647551
      // 11d5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 11d8: castore
      // 11d9: aload 0
      // 11da: getfield com/finalshell/io/YM3.U [C
      // 11dd: iinc 9 1
      // 11e0: iload 9
      // 11e2: getstatic com/finalshell/core/S7.Q [C
      // 11e5: iload 12
      // 11e7: caload
      // 11e8: castore
      // 11e9: aload 3
      // 11ea: ifnonnull 15cf
      // 11ed: iload 8
      // 11ef: aload 3
      // 11f0: ifnull 15d0
      // 11f3: goto 11fa
      // 11f6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f9: athrow
      // 11fa: bipush 1
      // 11fb: goto 1202
      // 11fe: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1201: athrow
      // 1202: if_icmple 15cf
      // 1205: iload 10
      // 1207: iload 6
      // 1209: isub
      // 120a: istore 12
      // 120c: iload 10
      // 120e: istore 13
      // 1210: iload 12
      // 1212: istore 14
      // 1214: iload 14
      // 1216: aload 1
      // 1217: arraylength
      // 1218: if_icmpge 15cf
      // 121b: aload 1
      // 121c: iload 14
      // 121e: caload
      // 121f: istore 15
      // 1221: aload 0
      // 1222: getfield com/finalshell/io/YM3.T Z
      // 1225: aload 3
      // 1226: ifnull 15d0
      // 1229: aload 3
      // 122a: ifnull 1379
      // 122d: goto 1234
      // 1230: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1233: athrow
      // 1234: ifeq 1370
      // 1237: goto 123e
      // 123a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123d: athrow
      // 123e: iload 15
      // 1240: sipush 26409
      // 1243: ldc2_w 6991741584307557557
      // 1246: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1249: aload 3
      // 124a: ifnull 1270
      // 124d: goto 1254
      // 1250: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1253: athrow
      // 1254: if_icmpeq 12be
      // 1257: goto 125e
      // 125a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125d: athrow
      // 125e: iload 15
      // 1260: sipush 26201
      // 1263: ldc2_w 1379715028855887237
      // 1266: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1269: goto 1270
      // 126c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126f: athrow
      // 1270: aload 3
      // 1271: ifnull 1290
      // 1274: if_icmpeq 12be
      // 1277: goto 127e
      // 127a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127d: athrow
      // 127e: iload 15
      // 1280: sipush 6084
      // 1283: ldc2_w 7009744229576303721
      // 1286: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1289: goto 1290
      // 128c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128f: athrow
      // 1290: aload 3
      // 1291: ifnull 12b0
      // 1294: if_icmpeq 12be
      // 1297: goto 129e
      // 129a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129d: athrow
      // 129e: iload 15
      // 12a0: sipush 10281
      // 12a3: ldc2_w 6620221265790393235
      // 12a6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12a9: goto 12b0
      // 12ac: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12af: athrow
      // 12b0: aload 3
      // 12b1: ifnull 137d
      // 12b4: if_icmpne 1370
      // 12b7: goto 12be
      // 12ba: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12bd: athrow
      // 12be: aload 0
      // 12bf: getfield com/finalshell/io/YM3.U [C
      // 12c2: iload 13
      // 12c4: iinc 13 1
      // 12c7: sipush 29331
      // 12ca: ldc2_w 5838482518343647551
      // 12cd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12d0: castore
      // 12d1: aload 0
      // 12d2: getfield com/finalshell/io/YM3.U [C
      // 12d5: iload 13
      // 12d7: iinc 13 1
      // 12da: sipush 32152
      // 12dd: ldc2_w 2468978250544385558
      // 12e0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12e3: castore
      // 12e4: aload 0
      // 12e5: getfield com/finalshell/io/YM3.U [C
      // 12e8: iload 13
      // 12ea: iinc 13 1
      // 12ed: getstatic com/finalshell/core/S7.y [C
      // 12f0: iload 15
      // 12f2: sipush 7603
      // 12f5: ldc2_w 7325892985974222453
      // 12f8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12fb: iushr
      // 12fc: sipush 21773
      // 12ff: ldc2_w 6638525112670398138
      // 1302: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1305: iand
      // 1306: caload
      // 1307: castore
      // 1308: aload 0
      // 1309: getfield com/finalshell/io/YM3.U [C
      // 130c: iload 13
      // 130e: iinc 13 1
      // 1311: getstatic com/finalshell/core/S7.y [C
      // 1314: iload 15
      // 1316: sipush 19011
      // 1319: ldc2_w 74932091958442375
      // 131c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 131f: iushr
      // 1320: sipush 21773
      // 1323: ldc2_w 6638525112670398138
      // 1326: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1329: iand
      // 132a: caload
      // 132b: castore
      // 132c: aload 0
      // 132d: getfield com/finalshell/io/YM3.U [C
      // 1330: iload 13
      // 1332: iinc 13 1
      // 1335: getstatic com/finalshell/core/S7.y [C
      // 1338: iload 15
      // 133a: bipush 4
      // 133b: iushr
      // 133c: sipush 21773
      // 133f: ldc2_w 6638525112670398138
      // 1342: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1345: iand
      // 1346: caload
      // 1347: castore
      // 1348: aload 0
      // 1349: getfield com/finalshell/io/YM3.U [C
      // 134c: iload 13
      // 134e: iinc 13 1
      // 1351: getstatic com/finalshell/core/S7.y [C
      // 1354: iload 15
      // 1356: sipush 21773
      // 1359: ldc2_w 6638525112670398138
      // 135c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 135f: iand
      // 1360: caload
      // 1361: castore
      // 1362: iinc 7 5
      // 1365: aload 3
      // 1366: ifnonnull 15c8
      // 1369: goto 1370
      // 136c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136f: athrow
      // 1370: iload 15
      // 1372: goto 1379
      // 1375: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1378: athrow
      // 1379: getstatic com/finalshell/core/S7.j [B
      // 137c: arraylength
      // 137d: aload 3
      // 137e: ifnull 13b8
      // 1381: if_icmpge 13a6
      // 1384: goto 138b
      // 1387: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138a: athrow
      // 138b: getstatic com/finalshell/core/S7.j [B
      // 138e: iload 15
      // 1390: baload
      // 1391: aload 3
      // 1392: ifnull 140d
      // 1395: goto 139c
      // 1398: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139b: athrow
      // 139c: ifne 13e2
      // 139f: goto 13a6
      // 13a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a5: athrow
      // 13a6: iload 15
      // 13a8: sipush 4624
      // 13ab: ldc2_w 6912903878219129232
      // 13ae: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13b1: goto 13b8
      // 13b4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b7: athrow
      // 13b8: aload 3
      // 13b9: ifnull 14e0
      // 13bc: if_icmpne 14ce
      // 13bf: goto 13c6
      // 13c2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c5: athrow
      // 13c6: aload 0
      // 13c7: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 13ca: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 13cd: aload 3
      // 13ce: ifnull 14d7
      // 13d1: goto 13d8
      // 13d4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d7: athrow
      // 13d8: ifeq 14ce
      // 13db: goto 13e2
      // 13de: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e1: athrow
      // 13e2: aload 0
      // 13e3: getfield com/finalshell/io/YM3.U [C
      // 13e6: iload 13
      // 13e8: iinc 13 1
      // 13eb: sipush 29331
      // 13ee: ldc2_w 5838482518343647551
      // 13f1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13f4: castore
      // 13f5: aload 3
      // 13f6: ifnull 14ca
      // 13f9: goto 1400
      // 13fc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13ff: athrow
      // 1400: getstatic com/finalshell/core/S7.j [B
      // 1403: iload 15
      // 1405: baload
      // 1406: goto 140d
      // 1409: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140c: athrow
      // 140d: bipush 4
      // 140e: if_icmpne 14b0
      // 1411: aload 0
      // 1412: getfield com/finalshell/io/YM3.U [C
      // 1415: iload 13
      // 1417: iinc 13 1
      // 141a: sipush 32152
      // 141d: ldc2_w 2468978250544385558
      // 1420: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1423: castore
      // 1424: aload 0
      // 1425: getfield com/finalshell/io/YM3.U [C
      // 1428: iload 13
      // 142a: iinc 13 1
      // 142d: getstatic com/finalshell/core/S7.y [C
      // 1430: iload 15
      // 1432: sipush 7603
      // 1435: ldc2_w 7325892985974222453
      // 1438: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 143b: iushr
      // 143c: sipush 21773
      // 143f: ldc2_w 6638525112670398138
      // 1442: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1445: iand
      // 1446: caload
      // 1447: castore
      // 1448: aload 0
      // 1449: getfield com/finalshell/io/YM3.U [C
      // 144c: iload 13
      // 144e: iinc 13 1
      // 1451: getstatic com/finalshell/core/S7.y [C
      // 1454: iload 15
      // 1456: sipush 19011
      // 1459: ldc2_w 74932091958442375
      // 145c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 145f: iushr
      // 1460: sipush 21773
      // 1463: ldc2_w 6638525112670398138
      // 1466: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1469: iand
      // 146a: caload
      // 146b: castore
      // 146c: aload 0
      // 146d: getfield com/finalshell/io/YM3.U [C
      // 1470: iload 13
      // 1472: iinc 13 1
      // 1475: getstatic com/finalshell/core/S7.y [C
      // 1478: iload 15
      // 147a: bipush 4
      // 147b: iushr
      // 147c: sipush 21773
      // 147f: ldc2_w 6638525112670398138
      // 1482: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1485: iand
      // 1486: caload
      // 1487: castore
      // 1488: aload 0
      // 1489: getfield com/finalshell/io/YM3.U [C
      // 148c: iload 13
      // 148e: iinc 13 1
      // 1491: getstatic com/finalshell/core/S7.y [C
      // 1494: iload 15
      // 1496: sipush 21773
      // 1499: ldc2_w 6638525112670398138
      // 149c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 149f: iand
      // 14a0: caload
      // 14a1: castore
      // 14a2: iinc 7 5
      // 14a5: aload 3
      // 14a6: ifnonnull 15c8
      // 14a9: goto 14b0
      // 14ac: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14af: athrow
      // 14b0: aload 0
      // 14b1: getfield com/finalshell/io/YM3.U [C
      // 14b4: iload 13
      // 14b6: iinc 13 1
      // 14b9: getstatic com/finalshell/core/S7.Q [C
      // 14bc: iload 15
      // 14be: caload
      // 14bf: castore
      // 14c0: iinc 7 1
      // 14c3: goto 14ca
      // 14c6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c9: athrow
      // 14ca: aload 3
      // 14cb: ifnonnull 15c8
      // 14ce: iload 15
      // 14d0: goto 14d7
      // 14d3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d6: athrow
      // 14d7: sipush 27592
      // 14da: ldc2_w 5349127045759342678
      // 14dd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14e0: aload 3
      // 14e1: ifnull 1500
      // 14e4: if_icmpeq 1503
      // 14e7: goto 14ee
      // 14ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14ed: athrow
      // 14ee: iload 15
      // 14f0: sipush 3052
      // 14f3: ldc2_w 3411686180789123159
      // 14f6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14f9: goto 1500
      // 14fc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14ff: athrow
      // 1500: if_icmpne 15b5
      // 1503: aload 0
      // 1504: getfield com/finalshell/io/YM3.U [C
      // 1507: iload 13
      // 1509: iinc 13 1
      // 150c: sipush 29331
      // 150f: ldc2_w 5838482518343647551
      // 1512: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1515: castore
      // 1516: aload 0
      // 1517: getfield com/finalshell/io/YM3.U [C
      // 151a: iload 13
      // 151c: iinc 13 1
      // 151f: sipush 32152
      // 1522: ldc2_w 2468978250544385558
      // 1525: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1528: castore
      // 1529: aload 0
      // 152a: getfield com/finalshell/io/YM3.U [C
      // 152d: iload 13
      // 152f: iinc 13 1
      // 1532: getstatic com/finalshell/core/S7.y [C
      // 1535: iload 15
      // 1537: sipush 7603
      // 153a: ldc2_w 7325892985974222453
      // 153d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1540: iushr
      // 1541: sipush 21773
      // 1544: ldc2_w 6638525112670398138
      // 1547: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 154a: iand
      // 154b: caload
      // 154c: castore
      // 154d: aload 0
      // 154e: getfield com/finalshell/io/YM3.U [C
      // 1551: iload 13
      // 1553: iinc 13 1
      // 1556: getstatic com/finalshell/core/S7.y [C
      // 1559: iload 15
      // 155b: sipush 19011
      // 155e: ldc2_w 74932091958442375
      // 1561: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1564: iushr
      // 1565: sipush 21773
      // 1568: ldc2_w 6638525112670398138
      // 156b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 156e: iand
      // 156f: caload
      // 1570: castore
      // 1571: aload 0
      // 1572: getfield com/finalshell/io/YM3.U [C
      // 1575: iload 13
      // 1577: iinc 13 1
      // 157a: getstatic com/finalshell/core/S7.y [C
      // 157d: iload 15
      // 157f: bipush 4
      // 1580: iushr
      // 1581: sipush 21773
      // 1584: ldc2_w 6638525112670398138
      // 1587: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 158a: iand
      // 158b: caload
      // 158c: castore
      // 158d: aload 0
      // 158e: getfield com/finalshell/io/YM3.U [C
      // 1591: iload 13
      // 1593: iinc 13 1
      // 1596: getstatic com/finalshell/core/S7.y [C
      // 1599: iload 15
      // 159b: sipush 21773
      // 159e: ldc2_w 6638525112670398138
      // 15a1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15a4: iand
      // 15a5: caload
      // 15a6: castore
      // 15a7: iinc 7 5
      // 15aa: aload 3
      // 15ab: ifnonnull 15c8
      // 15ae: goto 15b5
      // 15b1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b4: athrow
      // 15b5: aload 0
      // 15b6: getfield com/finalshell/io/YM3.U [C
      // 15b9: iload 13
      // 15bb: iinc 13 1
      // 15be: iload 15
      // 15c0: castore
      // 15c1: goto 15c8
      // 15c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c7: athrow
      // 15c8: iinc 14 1
      // 15cb: aload 3
      // 15cc: ifnonnull 1214
      // 15cf: iload 2
      // 15d0: ifeq 15fe
      // 15d3: aload 0
      // 15d4: getfield com/finalshell/io/YM3.U [C
      // 15d7: aload 0
      // 15d8: getfield com/finalshell/io/YM3.c I
      // 15db: bipush 2
      // 15dc: isub
      // 15dd: sipush 32680
      // 15e0: ldc2_w 6661901957014359160
      // 15e3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15e6: castore
      // 15e7: aload 0
      // 15e8: getfield com/finalshell/io/YM3.U [C
      // 15eb: aload 0
      // 15ec: getfield com/finalshell/io/YM3.c I
      // 15ef: bipush 1
      // 15f0: isub
      // 15f1: iload 2
      // 15f2: castore
      // 15f3: aload 3
      // 15f4: ifnonnull 1619
      // 15f7: goto 15fe
      // 15fa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15fd: athrow
      // 15fe: aload 0
      // 15ff: getfield com/finalshell/io/YM3.U [C
      // 1602: aload 0
      // 1603: getfield com/finalshell/io/YM3.c I
      // 1606: bipush 1
      // 1607: isub
      // 1608: sipush 32680
      // 160b: ldc2_w 6661901957014359160
      // 160e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1611: castore
      // 1612: goto 1619
      // 1615: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1618: athrow
      // 1619: return
   }

   public void g(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/lang/String.length ()I
      // 07: istore 3
      // 08: astore 2
      // 09: aload 0
      // 0a: getfield com/finalshell/io/YM3.c I
      // 0d: iload 3
      // 0e: iadd
      // 0f: bipush 3
      // 10: iadd
      // 11: istore 4
      // 13: iload 4
      // 15: aload 0
      // 16: getfield com/finalshell/io/YM3.U [C
      // 19: arraylength
      // 1a: aload 2
      // 1b: ifnull 3a
      // 1e: if_icmple 35
      // 21: goto 28
      // 24: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 0
      // 29: iload 4
      // 2b: invokevirtual com/finalshell/io/YM3.L (I)V
      // 2e: goto 35
      // 31: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/io/YM3.c I
      // 39: bipush 1
      // 3a: iadd
      // 3b: istore 5
      // 3d: aload 0
      // 3e: getfield com/finalshell/io/YM3.U [C
      // 41: aload 0
      // 42: getfield com/finalshell/io/YM3.c I
      // 45: sipush 32680
      // 48: ldc2_w 6661901957014359160
      // 4b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4e: castore
      // 4f: aload 1
      // 50: bipush 0
      // 51: iload 3
      // 52: aload 0
      // 53: getfield com/finalshell/io/YM3.U [C
      // 56: iload 5
      // 58: invokevirtual java/lang/String.getChars (II[CI)V
      // 5b: aload 0
      // 5c: iload 4
      // 5e: putfield com/finalshell/io/YM3.c I
      // 61: aload 0
      // 62: getfield com/finalshell/io/YM3.U [C
      // 65: aload 0
      // 66: getfield com/finalshell/io/YM3.c I
      // 69: bipush 2
      // 6a: isub
      // 6b: sipush 32680
      // 6e: ldc2_w 6661901957014359160
      // 71: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 74: castore
      // 75: aload 0
      // 76: getfield com/finalshell/io/YM3.U [C
      // 79: aload 0
      // 7a: getfield com/finalshell/io/YM3.c I
      // 7d: bipush 1
      // 7e: isub
      // 7f: sipush 2562
      // 82: ldc2_w 8714183661880932788
      // 85: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 88: castore
      // 89: return
   }

   public void R(List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: invokeinterface java/util/List.isEmpty ()Z 1
      // 00a: aload 2
      // 00b: ifnull 02e
      // 00e: ifeq 02a
      // 011: goto 018
      // 014: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: sipush -18231
      // 01c: sipush 1370
      // 01f: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 022: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 025: return
      // 026: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield com/finalshell/io/YM3.c I
      // 02e: istore 3
      // 02f: iload 3
      // 030: istore 4
      // 032: bipush 0
      // 033: istore 5
      // 035: aload 1
      // 036: invokeinterface java/util/List.size ()I 1
      // 03b: istore 6
      // 03d: iload 5
      // 03f: iload 6
      // 041: if_icmpge 2b0
      // 044: aload 1
      // 045: iload 5
      // 047: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04c: checkcast java/lang/String
      // 04f: astore 7
      // 051: bipush 0
      // 052: istore 8
      // 054: aload 2
      // 055: ifnull 2c7
      // 058: aload 2
      // 059: ifnull 072
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 7
      // 065: ifnonnull 076
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: bipush 1
      // 070: istore 8
      // 072: aload 2
      // 073: ifnonnull 13f
      // 076: bipush 0
      // 077: istore 9
      // 079: aload 7
      // 07b: invokevirtual java/lang/String.length ()I
      // 07e: istore 10
      // 080: iload 9
      // 082: iload 10
      // 084: if_icmpge 13f
      // 087: aload 7
      // 089: iload 9
      // 08b: invokevirtual java/lang/String.charAt (I)C
      // 08e: istore 11
      // 090: iload 11
      // 092: aload 2
      // 093: ifnull 11c
      // 096: sipush 1440
      // 099: ldc2_w 3428613792358856306
      // 09c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09f: aload 2
      // 0a0: ifnull 1fa
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: if_icmplt 114
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: iload 11
      // 0b6: aload 2
      // 0b7: ifnull 11c
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: sipush 15684
      // 0c4: ldc2_w 1065302460053311224
      // 0c7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ca: if_icmpgt 114
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: iload 11
      // 0d6: aload 2
      // 0d7: ifnull 11c
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: sipush 32680
      // 0e4: ldc2_w 6661901957014359160
      // 0e7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ea: if_icmpeq 114
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: iload 11
      // 0f6: aload 2
      // 0f7: ifnull 11c
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: sipush 29331
      // 104: ldc2_w 5838482518343647551
      // 107: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 10a: if_icmpne 11f
      // 10d: goto 114
      // 110: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: bipush 1
      // 115: goto 11c
      // 118: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: goto 120
      // 11f: bipush 0
      // 120: dup
      // 121: istore 8
      // 123: ifeq 131
      // 126: aload 2
      // 127: ifnonnull 13f
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: iinc 9 1
      // 134: aload 2
      // 135: ifnonnull 080
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: iload 8
      // 141: aload 2
      // 142: ifnull 1ee
      // 145: ifeq 1e5
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 0
      // 150: iload 4
      // 152: putfield com/finalshell/io/YM3.c I
      // 155: aload 0
      // 156: sipush 17104
      // 159: ldc2_w 798103654703477075
      // 15c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 162: bipush 0
      // 163: istore 9
      // 165: iload 9
      // 167: aload 1
      // 168: invokeinterface java/util/List.size ()I 1
      // 16d: if_icmpge 1d7
      // 170: aload 1
      // 171: iload 9
      // 173: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 178: checkcast java/lang/String
      // 17b: aload 2
      // 17c: ifnull 1a7
      // 17f: astore 7
      // 181: aload 2
      // 182: ifnull 1e4
      // 185: iload 9
      // 187: ifeq 1a5
      // 18a: goto 191
      // 18d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 0
      // 192: sipush 8902
      // 195: ldc2_w 7797077946944246126
      // 198: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 19b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: aload 7
      // 1a7: ifnonnull 1c2
      // 1aa: aload 0
      // 1ab: sipush -18216
      // 1ae: sipush -19122
      // 1b1: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 1b4: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 1b7: aload 2
      // 1b8: ifnonnull 1d0
      // 1bb: goto 1c2
      // 1be: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: aload 7
      // 1c5: bipush 0
      // 1c6: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: iinc 9 1
      // 1d3: aload 2
      // 1d4: ifnonnull 165
      // 1d7: aload 0
      // 1d8: sipush 21380
      // 1db: ldc2_w 7475567310577573946
      // 1de: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1e1: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1e4: return
      // 1e5: iload 3
      // 1e6: aload 7
      // 1e8: invokevirtual java/lang/String.length ()I
      // 1eb: iadd
      // 1ec: bipush 3
      // 1ed: iadd
      // 1ee: istore 9
      // 1f0: iload 5
      // 1f2: aload 1
      // 1f3: invokeinterface java/util/List.size ()I 1
      // 1f8: bipush 1
      // 1f9: isub
      // 1fa: aload 2
      // 1fb: ifnull 21d
      // 1fe: if_icmpne 20b
      // 201: goto 208
      // 204: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 207: athrow
      // 208: iinc 9 1
      // 20b: iload 9
      // 20d: aload 2
      // 20e: ifnull 234
      // 211: aload 0
      // 212: getfield com/finalshell/io/YM3.U [C
      // 215: arraylength
      // 216: goto 21d
      // 219: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21c: athrow
      // 21d: if_icmple 232
      // 220: aload 0
      // 221: iload 3
      // 222: putfield com/finalshell/io/YM3.c I
      // 225: aload 0
      // 226: iload 9
      // 228: invokevirtual com/finalshell/io/YM3.L (I)V
      // 22b: goto 232
      // 22e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 231: athrow
      // 232: iload 5
      // 234: ifne 254
      // 237: aload 0
      // 238: getfield com/finalshell/io/YM3.U [C
      // 23b: iload 3
      // 23c: iinc 3 1
      // 23f: sipush 7607
      // 242: ldc2_w 6789217549841690168
      // 245: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 248: castore
      // 249: aload 2
      // 24a: ifnonnull 26d
      // 24d: goto 254
      // 250: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: aload 0
      // 255: getfield com/finalshell/io/YM3.U [C
      // 258: iload 3
      // 259: iinc 3 1
      // 25c: sipush 18870
      // 25f: ldc2_w 2384222970302020115
      // 262: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 265: castore
      // 266: goto 26d
      // 269: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: aload 0
      // 26e: getfield com/finalshell/io/YM3.U [C
      // 271: iload 3
      // 272: iinc 3 1
      // 275: sipush 32680
      // 278: ldc2_w 6661901957014359160
      // 27b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 27e: castore
      // 27f: aload 7
      // 281: bipush 0
      // 282: aload 7
      // 284: invokevirtual java/lang/String.length ()I
      // 287: aload 0
      // 288: getfield com/finalshell/io/YM3.U [C
      // 28b: iload 3
      // 28c: invokevirtual java/lang/String.getChars (II[CI)V
      // 28f: iload 3
      // 290: aload 7
      // 292: invokevirtual java/lang/String.length ()I
      // 295: iadd
      // 296: istore 3
      // 297: aload 0
      // 298: getfield com/finalshell/io/YM3.U [C
      // 29b: iload 3
      // 29c: iinc 3 1
      // 29f: sipush 32680
      // 2a2: ldc2_w 6661901957014359160
      // 2a5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2a8: castore
      // 2a9: iinc 5 1
      // 2ac: aload 2
      // 2ad: ifnonnull 03d
      // 2b0: aload 0
      // 2b1: getfield com/finalshell/io/YM3.U [C
      // 2b4: iload 3
      // 2b5: iinc 3 1
      // 2b8: sipush 10460
      // 2bb: ldc2_w 6283370691821230963
      // 2be: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2c1: castore
      // 2c2: aload 0
      // 2c3: iload 3
      // 2c4: putfield com/finalshell/io/YM3.c I
      // 2c7: return
   }

   public void m(char param1, String param2, char param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/finalshell/io/YM3.write (I)V
      // 08: astore 4
      // 0a: aload 0
      // 0b: aload 2
      // 0c: aload 4
      // 0e: ifnull 3e
      // 11: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 14: iload 3
      // 15: ifne 32
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: ldc_w "\u0000"
      // 23: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 26: aload 4
      // 28: ifnonnull 41
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: iload 3
      // 34: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 41: return
   }

   public void s(char param1, String param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/io/YM3.e Z
      // 009: aload 4
      // 00b: ifnull 02d
      // 00e: ifne 02c
      // 011: goto 018
      // 014: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: iload 1
      // 01a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 01d: aload 0
      // 01e: aload 2
      // 01f: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 022: aload 0
      // 023: iload 3
      // 024: invokevirtual com/finalshell/io/YM3.u (Z)V
      // 027: return
      // 028: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: iload 3
      // 02d: aload 4
      // 02f: ifnull 03d
      // 032: ifeq 040
      // 035: goto 03c
      // 038: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: bipush 4
      // 03d: goto 041
      // 040: bipush 5
      // 041: istore 5
      // 043: aload 2
      // 044: invokevirtual java/lang/String.length ()I
      // 047: istore 6
      // 049: aload 0
      // 04a: getfield com/finalshell/io/YM3.c I
      // 04d: iload 6
      // 04f: iadd
      // 050: bipush 4
      // 051: iadd
      // 052: iload 5
      // 054: iadd
      // 055: istore 7
      // 057: iload 7
      // 059: aload 4
      // 05b: ifnull 0b2
      // 05e: aload 0
      // 05f: getfield com/finalshell/io/YM3.U [C
      // 062: arraylength
      // 063: if_icmple 0ae
      // 066: goto 06d
      // 069: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 4
      // 070: ifnull 0a9
      // 073: goto 07a
      // 076: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 07d: ifnull 0a8
      // 080: goto 087
      // 083: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 0
      // 088: iload 1
      // 089: invokevirtual com/finalshell/io/YM3.write (I)V
      // 08c: aload 0
      // 08d: aload 2
      // 08e: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 091: aload 0
      // 092: sipush 2562
      // 095: ldc2_w 8714183661880932788
      // 098: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 09e: aload 0
      // 09f: iload 3
      // 0a0: invokevirtual com/finalshell/io/YM3.u (Z)V
      // 0a3: return
      // 0a4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: iload 7
      // 0ab: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0ae: aload 0
      // 0af: getfield com/finalshell/io/YM3.c I
      // 0b2: istore 8
      // 0b4: aload 0
      // 0b5: iload 7
      // 0b7: putfield com/finalshell/io/YM3.c I
      // 0ba: aload 0
      // 0bb: getfield com/finalshell/io/YM3.U [C
      // 0be: iload 8
      // 0c0: iload 1
      // 0c1: castore
      // 0c2: iload 8
      // 0c4: iload 6
      // 0c6: iadd
      // 0c7: bipush 1
      // 0c8: iadd
      // 0c9: istore 9
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/io/YM3.U [C
      // 0cf: iload 8
      // 0d1: bipush 1
      // 0d2: iadd
      // 0d3: aload 0
      // 0d4: getfield com/finalshell/io/YM3.t C
      // 0d7: castore
      // 0d8: aload 2
      // 0d9: bipush 0
      // 0da: iload 6
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/io/YM3.U [C
      // 0e0: iload 8
      // 0e2: bipush 2
      // 0e3: iadd
      // 0e4: invokevirtual java/lang/String.getChars (II[CI)V
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/io/YM3.U [C
      // 0eb: iload 9
      // 0ed: bipush 1
      // 0ee: iadd
      // 0ef: aload 0
      // 0f0: aload 4
      // 0f2: ifnull 12c
      // 0f5: getfield com/finalshell/io/YM3.t C
      // 0f8: castore
      // 0f9: iload 3
      // 0fa: ifeq 120
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: getstatic com/finalshell/io/YM3.G [C
      // 107: bipush 0
      // 108: aload 0
      // 109: getfield com/finalshell/io/YM3.U [C
      // 10c: iload 9
      // 10e: bipush 2
      // 10f: iadd
      // 110: bipush 5
      // 111: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 114: aload 4
      // 116: ifnonnull 13f
      // 119: goto 120
      // 11c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: getstatic com/finalshell/io/YM3.F [C
      // 123: bipush 0
      // 124: aload 0
      // 125: goto 12c
      // 128: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: getfield com/finalshell/io/YM3.U [C
      // 12f: iload 9
      // 131: bipush 2
      // 132: iadd
      // 133: sipush 3986
      // 136: ldc2_w 2743502366801689638
      // 139: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 13f: return
   }

   public void u(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 27
      // 08: iload 1
      // 09: ifeq 2b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: sipush -18213
      // 17: sipush -27227
      // 1a: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 1d: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 20: goto 27
      // 23: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 2
      // 28: ifnonnull 3f
      // 2b: aload 0
      // 2c: sipush -18211
      // 2f: sipush -4192
      // 32: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 35: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: return
   }

   public void D(char param1, String param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 4
      // 007: ifnull 04e
      // 00a: iload 3
      // 00b: sipush 16070
      // 00e: ldc2_w 2645281623592553831
      // 011: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 014: if_icmpeq 038
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield com/finalshell/io/YM3.e Z
      // 022: aload 4
      // 024: ifnull 050
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: ifne 04f
      // 031: goto 038
      // 034: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 0
      // 039: iload 1
      // 03a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 03d: aload 0
      // 03e: aload 2
      // 03f: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 042: aload 0
      // 043: iload 3
      // 044: invokevirtual com/finalshell/io/YM3.v (I)V
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: return
      // 04f: iload 3
      // 050: aload 4
      // 052: ifnull 06e
      // 055: ifge 06d
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: iload 3
      // 060: ineg
      // 061: invokestatic com/finalshell/core/S7.x (I)I
      // 064: bipush 1
      // 065: iadd
      // 066: goto 071
      // 069: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: iload 3
      // 06e: invokestatic com/finalshell/core/S7.x (I)I
      // 071: istore 5
      // 073: aload 2
      // 074: invokevirtual java/lang/String.length ()I
      // 077: istore 6
      // 079: aload 0
      // 07a: getfield com/finalshell/io/YM3.c I
      // 07d: iload 6
      // 07f: iadd
      // 080: bipush 4
      // 081: iadd
      // 082: iload 5
      // 084: iadd
      // 085: istore 7
      // 087: iload 7
      // 089: aload 4
      // 08b: ifnull 0d5
      // 08e: aload 0
      // 08f: getfield com/finalshell/io/YM3.U [C
      // 092: arraylength
      // 093: if_icmple 0d1
      // 096: goto 09d
      // 099: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 4
      // 0a0: ifnull 0cc
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0ad: ifnull 0cb
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: iload 1
      // 0b9: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0bc: aload 0
      // 0bd: aload 2
      // 0be: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 0c1: aload 0
      // 0c2: iload 3
      // 0c3: invokevirtual com/finalshell/io/YM3.v (I)V
      // 0c6: return
      // 0c7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: iload 7
      // 0ce: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/io/YM3.c I
      // 0d5: istore 8
      // 0d7: aload 0
      // 0d8: iload 7
      // 0da: putfield com/finalshell/io/YM3.c I
      // 0dd: aload 0
      // 0de: getfield com/finalshell/io/YM3.U [C
      // 0e1: iload 8
      // 0e3: iload 1
      // 0e4: castore
      // 0e5: iload 8
      // 0e7: iload 6
      // 0e9: iadd
      // 0ea: bipush 1
      // 0eb: iadd
      // 0ec: istore 9
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/io/YM3.U [C
      // 0f2: iload 8
      // 0f4: bipush 1
      // 0f5: iadd
      // 0f6: aload 0
      // 0f7: getfield com/finalshell/io/YM3.t C
      // 0fa: castore
      // 0fb: aload 2
      // 0fc: bipush 0
      // 0fd: iload 6
      // 0ff: aload 0
      // 100: getfield com/finalshell/io/YM3.U [C
      // 103: iload 8
      // 105: bipush 2
      // 106: iadd
      // 107: invokevirtual java/lang/String.getChars (II[CI)V
      // 10a: aload 0
      // 10b: getfield com/finalshell/io/YM3.U [C
      // 10e: iload 9
      // 110: bipush 1
      // 111: iadd
      // 112: aload 0
      // 113: getfield com/finalshell/io/YM3.t C
      // 116: castore
      // 117: aload 0
      // 118: getfield com/finalshell/io/YM3.U [C
      // 11b: iload 9
      // 11d: bipush 2
      // 11e: iadd
      // 11f: sipush 2562
      // 122: ldc2_w 8714183661880932788
      // 125: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 128: castore
      // 129: iload 3
      // 12a: aload 0
      // 12b: getfield com/finalshell/io/YM3.c I
      // 12e: aload 0
      // 12f: getfield com/finalshell/io/YM3.U [C
      // 132: invokestatic com/finalshell/core/S7.E (II[C)V
      // 135: return
   }

   public void l(char param1, String param2, long param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 5
      // 005: aload 5
      // 007: ifnull 06f
      // 00a: lload 3
      // 00b: sipush 27487
      // 00e: ldc2_w 6123170280058047232
      // 011: invokestatic com/finalshell/io/YM3.b (IJ)J
      // 014: lcmp
      // 015: ifeq 059
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 0
      // 020: aload 5
      // 022: ifnull 06b
      // 025: goto 02c
      // 028: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: getfield com/finalshell/io/YM3.e Z
      // 02f: ifeq 059
      // 032: goto 039
      // 035: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 0
      // 03a: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 03d: getfield com/finalshell/ui/model/EP.mask I
      // 040: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 043: aload 5
      // 045: ifnull 07f
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: ifeq 070
      // 052: goto 059
      // 055: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 0
      // 05a: iload 1
      // 05b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 05e: aload 0
      // 05f: aload 2
      // 060: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 063: aload 0
      // 064: goto 06b
      // 067: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: lload 3
      // 06c: invokevirtual com/finalshell/io/YM3.i (J)V
      // 06f: return
      // 070: lload 3
      // 071: aload 5
      // 073: ifnull 091
      // 076: lconst_0
      // 077: lcmp
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: ifge 090
      // 082: lload 3
      // 083: lneg
      // 084: invokestatic com/finalshell/core/S7.u (J)I
      // 087: bipush 1
      // 088: iadd
      // 089: goto 094
      // 08c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: lload 3
      // 091: invokestatic com/finalshell/core/S7.u (J)I
      // 094: istore 6
      // 096: aload 2
      // 097: invokevirtual java/lang/String.length ()I
      // 09a: istore 7
      // 09c: aload 0
      // 09d: getfield com/finalshell/io/YM3.c I
      // 0a0: iload 7
      // 0a2: iadd
      // 0a3: bipush 4
      // 0a4: iadd
      // 0a5: iload 6
      // 0a7: iadd
      // 0a8: istore 8
      // 0aa: iload 8
      // 0ac: aload 5
      // 0ae: ifnull 0f8
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/io/YM3.U [C
      // 0b5: arraylength
      // 0b6: if_icmple 0f4
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: aload 5
      // 0c3: ifnull 0ef
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 0d0: ifnull 0ee
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: iload 1
      // 0dc: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0df: aload 0
      // 0e0: aload 2
      // 0e1: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 0e4: aload 0
      // 0e5: lload 3
      // 0e6: invokevirtual com/finalshell/io/YM3.i (J)V
      // 0e9: return
      // 0ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: iload 8
      // 0f1: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/io/YM3.c I
      // 0f8: istore 9
      // 0fa: aload 0
      // 0fb: iload 8
      // 0fd: putfield com/finalshell/io/YM3.c I
      // 100: aload 0
      // 101: getfield com/finalshell/io/YM3.U [C
      // 104: iload 9
      // 106: iload 1
      // 107: castore
      // 108: iload 9
      // 10a: iload 7
      // 10c: iadd
      // 10d: bipush 1
      // 10e: iadd
      // 10f: istore 10
      // 111: aload 0
      // 112: getfield com/finalshell/io/YM3.U [C
      // 115: iload 9
      // 117: bipush 1
      // 118: iadd
      // 119: aload 0
      // 11a: getfield com/finalshell/io/YM3.t C
      // 11d: castore
      // 11e: aload 2
      // 11f: bipush 0
      // 120: iload 7
      // 122: aload 0
      // 123: getfield com/finalshell/io/YM3.U [C
      // 126: iload 9
      // 128: bipush 2
      // 129: iadd
      // 12a: invokevirtual java/lang/String.getChars (II[CI)V
      // 12d: aload 0
      // 12e: getfield com/finalshell/io/YM3.U [C
      // 131: iload 10
      // 133: bipush 1
      // 134: iadd
      // 135: aload 0
      // 136: getfield com/finalshell/io/YM3.t C
      // 139: castore
      // 13a: aload 0
      // 13b: getfield com/finalshell/io/YM3.U [C
      // 13e: iload 10
      // 140: bipush 2
      // 141: iadd
      // 142: sipush 2562
      // 145: ldc2_w 8714183661880932788
      // 148: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14b: castore
      // 14c: lload 3
      // 14d: aload 0
      // 14e: getfield com/finalshell/io/YM3.c I
      // 151: aload 0
      // 152: getfield com/finalshell/io/YM3.U [C
      // 155: invokestatic com/finalshell/core/S7.v (JI[C)V
      // 158: return
   }

   public void F(char var1, String var2, float var3) {
      this.write(var1);
      this.u(var2);
      this.q(var3, false);
   }

   public void I(char var1, String var2, double var3) {
      this.write(var1);
      this.u(var2);
      this.B(var3, false);
   }

   public void H(char param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 4
      // 008: ifnull 0d6
      // 00b: getfield com/finalshell/io/YM3.e Z
      // 00e: ifeq 0c9
      // 011: goto 018
      // 014: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: getfield com/finalshell/io/YM3.R Z
      // 01c: aload 4
      // 01e: ifnull 08e
      // 021: goto 028
      // 024: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: ifeq 074
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: iload 1
      // 034: invokevirtual com/finalshell/io/YM3.write (I)V
      // 037: aload 0
      // 038: aload 2
      // 039: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 03c: aload 4
      // 03e: ifnull 06f
      // 041: goto 048
      // 044: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 3
      // 049: ifnonnull 063
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 0
      // 054: invokevirtual com/finalshell/io/YM3.Y ()V
      // 057: aload 4
      // 059: ifnonnull 106
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: aload 3
      // 065: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 4
      // 071: ifnonnull 106
      // 074: aload 0
      // 075: aload 4
      // 077: ifnull 0be
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 084: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: ifeq 0b6
      // 091: aload 0
      // 092: iload 1
      // 093: invokevirtual com/finalshell/io/YM3.write (I)V
      // 096: aload 0
      // 097: aload 2
      // 098: sipush 2562
      // 09b: ldc2_w 8714183661880932788
      // 09e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a1: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 0a4: aload 0
      // 0a5: aload 3
      // 0a6: bipush 0
      // 0a7: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 0aa: aload 4
      // 0ac: ifnonnull 106
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: iload 1
      // 0bf: aload 2
      // 0c0: aload 3
      // 0c1: invokevirtual com/finalshell/io/YM3.x (CLjava/lang/String;Ljava/lang/String;)V
      // 0c4: aload 4
      // 0c6: ifnonnull 106
      // 0c9: aload 0
      // 0ca: iload 1
      // 0cb: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0ce: aload 0
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 2
      // 0d7: aload 4
      // 0d9: ifnull 103
      // 0dc: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 0df: aload 3
      // 0e0: ifnonnull 0fa
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0ee: aload 4
      // 0f0: ifnonnull 106
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: aload 3
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 106: return
   }

   public void x(char param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 2
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 5
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield com/finalshell/io/YM3.c I
      // 00f: istore 7
      // 011: aload 3
      // 012: aload 4
      // 014: ifnull 042
      // 017: ifnonnull 03a
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: bipush 4
      // 022: istore 6
      // 024: iload 7
      // 026: iload 5
      // 028: sipush 19011
      // 02b: ldc2_w 74932091958442375
      // 02e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 031: iadd
      // 032: iadd
      // 033: istore 7
      // 035: aload 4
      // 037: ifnonnull 05b
      // 03a: aload 3
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: invokevirtual java/lang/String.length ()I
      // 045: istore 6
      // 047: iload 7
      // 049: iload 5
      // 04b: iload 6
      // 04d: iadd
      // 04e: sipush 3986
      // 051: ldc2_w 2743502366801689638
      // 054: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 057: iadd
      // 058: iadd
      // 059: istore 7
      // 05b: iload 7
      // 05d: aload 0
      // 05e: getfield com/finalshell/io/YM3.U [C
      // 061: arraylength
      // 062: aload 4
      // 064: ifnull 0be
      // 067: if_icmple 0af
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 0
      // 072: aload 4
      // 074: ifnull 0aa
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 081: ifnull 0a9
      // 084: goto 08b
      // 087: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 0
      // 08c: iload 1
      // 08d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 090: aload 0
      // 091: aload 2
      // 092: sipush 2562
      // 095: ldc2_w 8714183661880932788
      // 098: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09b: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 09e: aload 0
      // 09f: aload 3
      // 0a0: bipush 0
      // 0a1: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 0a4: return
      // 0a5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 7
      // 0ac: invokevirtual com/finalshell/io/YM3.L (I)V
      // 0af: aload 0
      // 0b0: getfield com/finalshell/io/YM3.U [C
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/io/YM3.c I
      // 0b7: iload 1
      // 0b8: castore
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/io/YM3.c I
      // 0bd: bipush 2
      // 0be: iadd
      // 0bf: istore 8
      // 0c1: iload 8
      // 0c3: iload 5
      // 0c5: iadd
      // 0c6: istore 9
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/io/YM3.U [C
      // 0cc: aload 0
      // 0cd: getfield com/finalshell/io/YM3.c I
      // 0d0: bipush 1
      // 0d1: iadd
      // 0d2: sipush 32680
      // 0d5: ldc2_w 6661901957014359160
      // 0d8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0db: castore
      // 0dc: aload 2
      // 0dd: bipush 0
      // 0de: iload 5
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/io/YM3.U [C
      // 0e4: iload 8
      // 0e6: invokevirtual java/lang/String.getChars (II[CI)V
      // 0e9: aload 0
      // 0ea: iload 7
      // 0ec: putfield com/finalshell/io/YM3.c I
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/io/YM3.U [C
      // 0f3: iload 9
      // 0f5: sipush 32680
      // 0f8: ldc2_w 6661901957014359160
      // 0fb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fe: castore
      // 0ff: iload 9
      // 101: bipush 1
      // 102: iadd
      // 103: istore 10
      // 105: aload 0
      // 106: getfield com/finalshell/io/YM3.U [C
      // 109: iload 10
      // 10b: iinc 10 1
      // 10e: sipush 2562
      // 111: ldc2_w 8714183661880932788
      // 114: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 117: castore
      // 118: aload 4
      // 11a: ifnull 18c
      // 11d: aload 3
      // 11e: ifnonnull 179
      // 121: goto 128
      // 124: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 0
      // 129: getfield com/finalshell/io/YM3.U [C
      // 12c: iload 10
      // 12e: iinc 10 1
      // 131: sipush 19816
      // 134: ldc2_w 7629151895730765512
      // 137: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 13a: castore
      // 13b: aload 0
      // 13c: getfield com/finalshell/io/YM3.U [C
      // 13f: iload 10
      // 141: iinc 10 1
      // 144: sipush 32152
      // 147: ldc2_w 2468978250544385558
      // 14a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 14d: castore
      // 14e: aload 0
      // 14f: getfield com/finalshell/io/YM3.U [C
      // 152: iload 10
      // 154: iinc 10 1
      // 157: sipush 19732
      // 15a: ldc2_w 5899734016625753728
      // 15d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 160: castore
      // 161: aload 0
      // 162: getfield com/finalshell/io/YM3.U [C
      // 165: iload 10
      // 167: iinc 10 1
      // 16a: sipush 30047
      // 16d: ldc2_w 8425753768065304309
      // 170: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 173: castore
      // 174: return
      // 175: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: aload 0
      // 17a: getfield com/finalshell/io/YM3.U [C
      // 17d: iload 10
      // 17f: iinc 10 1
      // 182: sipush 32680
      // 185: ldc2_w 6661901957014359160
      // 188: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 18b: castore
      // 18c: iload 10
      // 18e: istore 11
      // 190: iload 11
      // 192: iload 6
      // 194: iadd
      // 195: istore 12
      // 197: aload 3
      // 198: bipush 0
      // 199: iload 6
      // 19b: aload 0
      // 19c: getfield com/finalshell/io/YM3.U [C
      // 19f: iload 11
      // 1a1: invokevirtual java/lang/String.getChars (II[CI)V
      // 1a4: bipush 0
      // 1a5: istore 13
      // 1a7: bipush -1
      // 1a8: istore 14
      // 1aa: bipush -1
      // 1ab: istore 15
      // 1ad: bipush 0
      // 1ae: istore 16
      // 1b0: iload 11
      // 1b2: istore 17
      // 1b4: iload 17
      // 1b6: iload 12
      // 1b8: if_icmpge 3fb
      // 1bb: aload 0
      // 1bc: getfield com/finalshell/io/YM3.U [C
      // 1bf: iload 17
      // 1c1: caload
      // 1c2: istore 18
      // 1c4: iload 18
      // 1c6: sipush 10460
      // 1c9: ldc2_w 6283370691821230963
      // 1cc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1cf: aload 4
      // 1d1: ifnull 41a
      // 1d4: aload 4
      // 1d6: ifnull 2b0
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: if_icmplt 29e
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: iload 18
      // 1ec: sipush 17176
      // 1ef: ldc2_w 5558249671418261723
      // 1f2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1f5: aload 4
      // 1f7: ifnull 21d
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: if_icmplt 3f3
      // 204: goto 20b
      // 207: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: iload 18
      // 20d: sipush 27592
      // 210: ldc2_w 5349127045759342678
      // 213: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 216: goto 21d
      // 219: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21c: athrow
      // 21d: aload 4
      // 21f: ifnull 284
      // 222: if_icmpeq 26e
      // 225: goto 22c
      // 228: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: iload 18
      // 22e: sipush 3052
      // 231: ldc2_w 3411686180789123159
      // 234: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 237: aload 4
      // 239: ifnull 284
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 242: athrow
      // 243: if_icmpeq 26e
      // 246: goto 24d
      // 249: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: iload 18
      // 24f: sipush 817
      // 252: ldc2_w 6505768906698158210
      // 255: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 258: aload 4
      // 25a: ifnull 284
      // 25d: goto 264
      // 260: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 263: athrow
      // 264: if_icmpge 3f3
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: iload 15
      // 270: aload 4
      // 272: ifnull 294
      // 275: goto 27c
      // 278: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: bipush -1
      // 27d: goto 284
      // 280: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 283: athrow
      // 284: if_icmpne 28b
      // 287: iload 17
      // 289: istore 15
      // 28b: iinc 13 1
      // 28e: iload 17
      // 290: istore 14
      // 292: iload 18
      // 294: istore 16
      // 296: iinc 7 4
      // 299: aload 4
      // 29b: ifnonnull 3f3
      // 29e: iload 18
      // 2a0: sipush 6005
      // 2a3: ldc2_w 3649355536797459666
      // 2a6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2af: athrow
      // 2b0: aload 4
      // 2b2: ifnull 2fe
      // 2b5: if_icmpge 2e0
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: getfield com/finalshell/io/YM3.s J
      // 2c3: lconst_1
      // 2c4: iload 18
      // 2c6: lshl
      // 2c7: land
      // 2c8: lconst_0
      // 2c9: lcmp
      // 2ca: aload 4
      // 2cc: ifnull 302
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d5: athrow
      // 2d6: ifne 301
      // 2d9: goto 2e0
      // 2dc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2df: athrow
      // 2e0: iload 18
      // 2e2: aload 4
      // 2e4: ifnull 302
      // 2e7: goto 2ee
      // 2ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ed: athrow
      // 2ee: sipush 29331
      // 2f1: ldc2_w 5838482518343647551
      // 2f4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: if_icmpne 305
      // 301: bipush 1
      // 302: goto 306
      // 305: bipush 0
      // 306: istore 19
      // 308: aload 4
      // 30a: ifnull 3f6
      // 30d: iload 19
      // 30f: ifeq 3f3
      // 312: goto 319
      // 315: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 318: athrow
      // 319: iinc 13 1
      // 31c: iload 17
      // 31e: istore 14
      // 320: iload 18
      // 322: istore 16
      // 324: iload 18
      // 326: sipush 26409
      // 329: ldc2_w 6991741584307557557
      // 32c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 32f: aload 4
      // 331: ifnull 350
      // 334: if_icmpeq 3da
      // 337: goto 33e
      // 33a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33d: athrow
      // 33e: iload 18
      // 340: sipush 26201
      // 343: ldc2_w 1379715028855887237
      // 346: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 349: goto 350
      // 34c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34f: athrow
      // 350: aload 4
      // 352: ifnull 371
      // 355: if_icmpeq 3da
      // 358: goto 35f
      // 35b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35e: athrow
      // 35f: iload 18
      // 361: sipush 6084
      // 364: ldc2_w 7009744229576303721
      // 367: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 36a: goto 371
      // 36d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 370: athrow
      // 371: aload 4
      // 373: ifnull 392
      // 376: if_icmpeq 3da
      // 379: goto 380
      // 37c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37f: athrow
      // 380: iload 18
      // 382: sipush 10281
      // 385: ldc2_w 6620221265790393235
      // 388: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 38b: goto 392
      // 38e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 391: athrow
      // 392: aload 4
      // 394: ifnull 3ae
      // 397: if_icmpeq 3da
      // 39a: goto 3a1
      // 39d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a0: athrow
      // 3a1: iload 18
      // 3a3: getstatic com/finalshell/core/S7.j [B
      // 3a6: arraylength
      // 3a7: goto 3ae
      // 3aa: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: aload 4
      // 3b0: ifnull 3ec
      // 3b3: if_icmpge 3dd
      // 3b6: goto 3bd
      // 3b9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bc: athrow
      // 3bd: getstatic com/finalshell/core/S7.j [B
      // 3c0: iload 18
      // 3c2: baload
      // 3c3: bipush 4
      // 3c4: aload 4
      // 3c6: ifnull 3ec
      // 3c9: goto 3d0
      // 3cc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: if_icmpne 3dd
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d9: athrow
      // 3da: iinc 7 4
      // 3dd: iload 15
      // 3df: aload 4
      // 3e1: ifnull 3f1
      // 3e4: bipush -1
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3eb: athrow
      // 3ec: if_icmpne 3f3
      // 3ef: iload 17
      // 3f1: istore 15
      // 3f3: iinc 17 1
      // 3f6: aload 4
      // 3f8: ifnonnull 1b4
      // 3fb: iload 13
      // 3fd: aload 4
      // 3ff: ifnull 415
      // 402: ifle c99
      // 405: goto 40c
      // 408: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40b: athrow
      // 40c: iload 7
      // 40e: iload 13
      // 410: iadd
      // 411: istore 7
      // 413: iload 7
      // 415: aload 0
      // 416: getfield com/finalshell/io/YM3.U [C
      // 419: arraylength
      // 41a: aload 4
      // 41c: ifnull 43f
      // 41f: if_icmple 436
      // 422: goto 429
      // 425: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 428: athrow
      // 429: aload 0
      // 42a: iload 7
      // 42c: invokevirtual com/finalshell/io/YM3.L (I)V
      // 42f: goto 436
      // 432: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 435: athrow
      // 436: aload 0
      // 437: iload 7
      // 439: putfield com/finalshell/io/YM3.c I
      // 43c: iload 13
      // 43e: bipush 1
      // 43f: aload 4
      // 441: ifnull 8a4
      // 444: if_icmpne 89a
      // 447: goto 44e
      // 44a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44d: athrow
      // 44e: iload 16
      // 450: sipush 27592
      // 453: ldc2_w 5349127045759342678
      // 456: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 459: aload 4
      // 45b: ifnull 523
      // 45e: goto 465
      // 461: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 464: athrow
      // 465: if_icmpne 511
      // 468: goto 46f
      // 46b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46e: athrow
      // 46f: iload 14
      // 471: bipush 1
      // 472: iadd
      // 473: istore 17
      // 475: iload 14
      // 477: sipush 3986
      // 47a: ldc2_w 2743502366801689638
      // 47d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 480: iadd
      // 481: istore 18
      // 483: iload 12
      // 485: iload 14
      // 487: isub
      // 488: bipush 1
      // 489: isub
      // 48a: istore 19
      // 48c: aload 0
      // 48d: getfield com/finalshell/io/YM3.U [C
      // 490: iload 17
      // 492: aload 0
      // 493: getfield com/finalshell/io/YM3.U [C
      // 496: iload 18
      // 498: iload 19
      // 49a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 49d: aload 0
      // 49e: getfield com/finalshell/io/YM3.U [C
      // 4a1: iload 14
      // 4a3: sipush 29331
      // 4a6: ldc2_w 5838482518343647551
      // 4a9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4ac: castore
      // 4ad: aload 0
      // 4ae: getfield com/finalshell/io/YM3.U [C
      // 4b1: iinc 14 1
      // 4b4: iload 14
      // 4b6: sipush 32152
      // 4b9: ldc2_w 2468978250544385558
      // 4bc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4bf: castore
      // 4c0: aload 0
      // 4c1: getfield com/finalshell/io/YM3.U [C
      // 4c4: iinc 14 1
      // 4c7: iload 14
      // 4c9: sipush 7575
      // 4cc: ldc2_w 560967801291468318
      // 4cf: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4d2: castore
      // 4d3: aload 0
      // 4d4: getfield com/finalshell/io/YM3.U [C
      // 4d7: iinc 14 1
      // 4da: iload 14
      // 4dc: sipush 7439
      // 4df: ldc2_w 4938701561976712839
      // 4e2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4e5: castore
      // 4e6: aload 0
      // 4e7: getfield com/finalshell/io/YM3.U [C
      // 4ea: iinc 14 1
      // 4ed: iload 14
      // 4ef: sipush 7575
      // 4f2: ldc2_w 560967801291468318
      // 4f5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4f8: castore
      // 4f9: aload 0
      // 4fa: getfield com/finalshell/io/YM3.U [C
      // 4fd: iinc 14 1
      // 500: iload 14
      // 502: sipush 16310
      // 505: ldc2_w 5418059658387213321
      // 508: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 50b: castore
      // 50c: aload 4
      // 50e: ifnonnull c99
      // 511: iload 16
      // 513: sipush 3052
      // 516: ldc2_w 3411686180789123159
      // 519: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 51c: goto 523
      // 51f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 522: athrow
      // 523: aload 4
      // 525: ifnull 5e6
      // 528: if_icmpne 5d4
      // 52b: goto 532
      // 52e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 531: athrow
      // 532: iload 14
      // 534: bipush 1
      // 535: iadd
      // 536: istore 17
      // 538: iload 14
      // 53a: sipush 3986
      // 53d: ldc2_w 2743502366801689638
      // 540: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 543: iadd
      // 544: istore 18
      // 546: iload 12
      // 548: iload 14
      // 54a: isub
      // 54b: bipush 1
      // 54c: isub
      // 54d: istore 19
      // 54f: aload 0
      // 550: getfield com/finalshell/io/YM3.U [C
      // 553: iload 17
      // 555: aload 0
      // 556: getfield com/finalshell/io/YM3.U [C
      // 559: iload 18
      // 55b: iload 19
      // 55d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 560: aload 0
      // 561: getfield com/finalshell/io/YM3.U [C
      // 564: iload 14
      // 566: sipush 29331
      // 569: ldc2_w 5838482518343647551
      // 56c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 56f: castore
      // 570: aload 0
      // 571: getfield com/finalshell/io/YM3.U [C
      // 574: iinc 14 1
      // 577: iload 14
      // 579: sipush 32152
      // 57c: ldc2_w 2468978250544385558
      // 57f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 582: castore
      // 583: aload 0
      // 584: getfield com/finalshell/io/YM3.U [C
      // 587: iinc 14 1
      // 58a: iload 14
      // 58c: sipush 7575
      // 58f: ldc2_w 560967801291468318
      // 592: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 595: castore
      // 596: aload 0
      // 597: getfield com/finalshell/io/YM3.U [C
      // 59a: iinc 14 1
      // 59d: iload 14
      // 59f: sipush 7439
      // 5a2: ldc2_w 4938701561976712839
      // 5a5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 5a8: castore
      // 5a9: aload 0
      // 5aa: getfield com/finalshell/io/YM3.U [C
      // 5ad: iinc 14 1
      // 5b0: iload 14
      // 5b2: sipush 7575
      // 5b5: ldc2_w 560967801291468318
      // 5b8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 5bb: castore
      // 5bc: aload 0
      // 5bd: getfield com/finalshell/io/YM3.U [C
      // 5c0: iinc 14 1
      // 5c3: iload 14
      // 5c5: sipush 18773
      // 5c8: ldc2_w 6087480711469153005
      // 5cb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 5ce: castore
      // 5cf: aload 4
      // 5d1: ifnonnull c99
      // 5d4: iload 16
      // 5d6: sipush 26409
      // 5d9: ldc2_w 6991741584307557557
      // 5dc: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 5df: goto 5e6
      // 5e2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e5: athrow
      // 5e6: aload 4
      // 5e8: ifnull 65f
      // 5eb: if_icmpeq 658
      // 5ee: goto 5f5
      // 5f1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f4: athrow
      // 5f5: iload 16
      // 5f7: sipush 26201
      // 5fa: ldc2_w 1379715028855887237
      // 5fd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 600: aload 4
      // 602: ifnull 65f
      // 605: goto 60c
      // 608: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60b: athrow
      // 60c: if_icmpeq 658
      // 60f: goto 616
      // 612: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 615: athrow
      // 616: iload 16
      // 618: sipush 6084
      // 61b: ldc2_w 7009744229576303721
      // 61e: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 621: aload 4
      // 623: ifnull 65f
      // 626: goto 62d
      // 629: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62c: athrow
      // 62d: if_icmpeq 658
      // 630: goto 637
      // 633: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 636: athrow
      // 637: iload 16
      // 639: sipush 10281
      // 63c: ldc2_w 6620221265790393235
      // 63f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 642: aload 4
      // 644: ifnull 741
      // 647: goto 64e
      // 64a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64d: athrow
      // 64e: if_icmpne 737
      // 651: goto 658
      // 654: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 657: athrow
      // 658: iload 16
      // 65a: istore 17
      // 65c: iload 14
      // 65e: bipush 1
      // 65f: iadd
      // 660: istore 18
      // 662: iload 14
      // 664: sipush 3986
      // 667: ldc2_w 2743502366801689638
      // 66a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 66d: iadd
      // 66e: istore 19
      // 670: iload 12
      // 672: iload 14
      // 674: isub
      // 675: bipush 1
      // 676: isub
      // 677: istore 20
      // 679: aload 0
      // 67a: getfield com/finalshell/io/YM3.U [C
      // 67d: iload 18
      // 67f: aload 0
      // 680: getfield com/finalshell/io/YM3.U [C
      // 683: iload 19
      // 685: iload 20
      // 687: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 68a: iload 14
      // 68c: istore 21
      // 68e: aload 0
      // 68f: getfield com/finalshell/io/YM3.U [C
      // 692: iload 21
      // 694: iinc 21 1
      // 697: sipush 29331
      // 69a: ldc2_w 5838482518343647551
      // 69d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6a0: castore
      // 6a1: aload 0
      // 6a2: getfield com/finalshell/io/YM3.U [C
      // 6a5: iload 21
      // 6a7: iinc 21 1
      // 6aa: sipush 32152
      // 6ad: ldc2_w 2468978250544385558
      // 6b0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6b3: castore
      // 6b4: aload 0
      // 6b5: getfield com/finalshell/io/YM3.U [C
      // 6b8: iload 21
      // 6ba: iinc 21 1
      // 6bd: getstatic com/finalshell/core/S7.y [C
      // 6c0: iload 17
      // 6c2: sipush 7603
      // 6c5: ldc2_w 7325892985974222453
      // 6c8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6cb: iushr
      // 6cc: sipush 21773
      // 6cf: ldc2_w 6638525112670398138
      // 6d2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6d5: iand
      // 6d6: caload
      // 6d7: castore
      // 6d8: aload 0
      // 6d9: getfield com/finalshell/io/YM3.U [C
      // 6dc: iload 21
      // 6de: iinc 21 1
      // 6e1: getstatic com/finalshell/core/S7.y [C
      // 6e4: iload 17
      // 6e6: sipush 19011
      // 6e9: ldc2_w 74932091958442375
      // 6ec: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6ef: iushr
      // 6f0: sipush 21773
      // 6f3: ldc2_w 6638525112670398138
      // 6f6: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 6f9: iand
      // 6fa: caload
      // 6fb: castore
      // 6fc: aload 0
      // 6fd: getfield com/finalshell/io/YM3.U [C
      // 700: iload 21
      // 702: iinc 21 1
      // 705: getstatic com/finalshell/core/S7.y [C
      // 708: iload 17
      // 70a: bipush 4
      // 70b: iushr
      // 70c: sipush 21773
      // 70f: ldc2_w 6638525112670398138
      // 712: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 715: iand
      // 716: caload
      // 717: castore
      // 718: aload 0
      // 719: getfield com/finalshell/io/YM3.U [C
      // 71c: iload 21
      // 71e: iinc 21 1
      // 721: getstatic com/finalshell/core/S7.y [C
      // 724: iload 17
      // 726: sipush 21773
      // 729: ldc2_w 6638525112670398138
      // 72c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 72f: iand
      // 730: caload
      // 731: castore
      // 732: aload 4
      // 734: ifnonnull c99
      // 737: iload 16
      // 739: istore 17
      // 73b: iload 17
      // 73d: getstatic com/finalshell/core/S7.j [B
      // 740: arraylength
      // 741: aload 4
      // 743: ifnull 852
      // 746: if_icmpge 848
      // 749: goto 750
      // 74c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74f: athrow
      // 750: getstatic com/finalshell/core/S7.j [B
      // 753: iload 17
      // 755: baload
      // 756: bipush 4
      // 757: aload 4
      // 759: ifnull 852
      // 75c: goto 763
      // 75f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 762: athrow
      // 763: if_icmpne 848
      // 766: goto 76d
      // 769: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76c: athrow
      // 76d: iload 14
      // 76f: bipush 1
      // 770: iadd
      // 771: istore 18
      // 773: iload 14
      // 775: sipush 3986
      // 778: ldc2_w 2743502366801689638
      // 77b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 77e: iadd
      // 77f: istore 19
      // 781: iload 12
      // 783: iload 14
      // 785: isub
      // 786: bipush 1
      // 787: isub
      // 788: istore 20
      // 78a: aload 0
      // 78b: getfield com/finalshell/io/YM3.U [C
      // 78e: iload 18
      // 790: aload 0
      // 791: getfield com/finalshell/io/YM3.U [C
      // 794: iload 19
      // 796: iload 20
      // 798: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 79b: iload 14
      // 79d: istore 21
      // 79f: aload 0
      // 7a0: getfield com/finalshell/io/YM3.U [C
      // 7a3: iload 21
      // 7a5: iinc 21 1
      // 7a8: sipush 29331
      // 7ab: ldc2_w 5838482518343647551
      // 7ae: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 7b1: castore
      // 7b2: aload 0
      // 7b3: getfield com/finalshell/io/YM3.U [C
      // 7b6: iload 21
      // 7b8: iinc 21 1
      // 7bb: sipush 32152
      // 7be: ldc2_w 2468978250544385558
      // 7c1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 7c4: castore
      // 7c5: aload 0
      // 7c6: getfield com/finalshell/io/YM3.U [C
      // 7c9: iload 21
      // 7cb: iinc 21 1
      // 7ce: getstatic com/finalshell/core/S7.y [C
      // 7d1: iload 17
      // 7d3: sipush 7603
      // 7d6: ldc2_w 7325892985974222453
      // 7d9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 7dc: iushr
      // 7dd: sipush 21773
      // 7e0: ldc2_w 6638525112670398138
      // 7e3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 7e6: iand
      // 7e7: caload
      // 7e8: castore
      // 7e9: aload 0
      // 7ea: getfield com/finalshell/io/YM3.U [C
      // 7ed: iload 21
      // 7ef: iinc 21 1
      // 7f2: getstatic com/finalshell/core/S7.y [C
      // 7f5: iload 17
      // 7f7: sipush 19011
      // 7fa: ldc2_w 74932091958442375
      // 7fd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 800: iushr
      // 801: sipush 21773
      // 804: ldc2_w 6638525112670398138
      // 807: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 80a: iand
      // 80b: caload
      // 80c: castore
      // 80d: aload 0
      // 80e: getfield com/finalshell/io/YM3.U [C
      // 811: iload 21
      // 813: iinc 21 1
      // 816: getstatic com/finalshell/core/S7.y [C
      // 819: iload 17
      // 81b: bipush 4
      // 81c: iushr
      // 81d: sipush 21773
      // 820: ldc2_w 6638525112670398138
      // 823: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 826: iand
      // 827: caload
      // 828: castore
      // 829: aload 0
      // 82a: getfield com/finalshell/io/YM3.U [C
      // 82d: iload 21
      // 82f: iinc 21 1
      // 832: getstatic com/finalshell/core/S7.y [C
      // 835: iload 17
      // 837: sipush 21773
      // 83a: ldc2_w 6638525112670398138
      // 83d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 840: iand
      // 841: caload
      // 842: castore
      // 843: aload 4
      // 845: ifnonnull 895
      // 848: iload 14
      // 84a: bipush 1
      // 84b: goto 852
      // 84e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 851: athrow
      // 852: iadd
      // 853: istore 18
      // 855: iload 14
      // 857: bipush 2
      // 858: iadd
      // 859: istore 19
      // 85b: iload 12
      // 85d: iload 14
      // 85f: isub
      // 860: bipush 1
      // 861: isub
      // 862: istore 20
      // 864: aload 0
      // 865: getfield com/finalshell/io/YM3.U [C
      // 868: iload 18
      // 86a: aload 0
      // 86b: getfield com/finalshell/io/YM3.U [C
      // 86e: iload 19
      // 870: iload 20
      // 872: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 875: aload 0
      // 876: getfield com/finalshell/io/YM3.U [C
      // 879: iload 14
      // 87b: sipush 29331
      // 87e: ldc2_w 5838482518343647551
      // 881: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 884: castore
      // 885: aload 0
      // 886: getfield com/finalshell/io/YM3.U [C
      // 889: iinc 14 1
      // 88c: iload 14
      // 88e: getstatic com/finalshell/core/S7.Q [C
      // 891: iload 17
      // 893: caload
      // 894: castore
      // 895: aload 4
      // 897: ifnonnull c99
      // 89a: iload 13
      // 89c: bipush 1
      // 89d: goto 8a4
      // 8a0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a3: athrow
      // 8a4: aload 4
      // 8a6: ifnull 8be
      // 8a9: if_icmple c99
      // 8ac: goto 8b3
      // 8af: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b2: athrow
      // 8b3: iload 15
      // 8b5: iload 11
      // 8b7: goto 8be
      // 8ba: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8bd: athrow
      // 8be: isub
      // 8bf: istore 17
      // 8c1: iload 15
      // 8c3: istore 18
      // 8c5: iload 17
      // 8c7: istore 19
      // 8c9: iload 19
      // 8cb: aload 3
      // 8cc: invokevirtual java/lang/String.length ()I
      // 8cf: if_icmpge c99
      // 8d2: aload 3
      // 8d3: iload 19
      // 8d5: invokevirtual java/lang/String.charAt (I)C
      // 8d8: istore 20
      // 8da: aload 0
      // 8db: aload 4
      // 8dd: ifnull c9a
      // 8e0: getfield com/finalshell/io/YM3.T Z
      // 8e3: aload 4
      // 8e5: ifnull a39
      // 8e8: goto 8ef
      // 8eb: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8ee: athrow
      // 8ef: ifeq a30
      // 8f2: goto 8f9
      // 8f5: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f8: athrow
      // 8f9: iload 20
      // 8fb: sipush 26409
      // 8fe: ldc2_w 6991741584307557557
      // 901: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 904: aload 4
      // 906: ifnull 92c
      // 909: goto 910
      // 90c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90f: athrow
      // 910: if_icmpeq 97d
      // 913: goto 91a
      // 916: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 919: athrow
      // 91a: iload 20
      // 91c: sipush 26201
      // 91f: ldc2_w 1379715028855887237
      // 922: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 925: goto 92c
      // 928: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92b: athrow
      // 92c: aload 4
      // 92e: ifnull 94d
      // 931: if_icmpeq 97d
      // 934: goto 93b
      // 937: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93a: athrow
      // 93b: iload 20
      // 93d: sipush 6084
      // 940: ldc2_w 7009744229576303721
      // 943: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 946: goto 94d
      // 949: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94c: athrow
      // 94d: aload 4
      // 94f: ifnull 96e
      // 952: if_icmpeq 97d
      // 955: goto 95c
      // 958: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95b: athrow
      // 95c: iload 20
      // 95e: sipush 10281
      // 961: ldc2_w 6620221265790393235
      // 964: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 967: goto 96e
      // 96a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96d: athrow
      // 96e: aload 4
      // 970: ifnull a3d
      // 973: if_icmpne a30
      // 976: goto 97d
      // 979: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97c: athrow
      // 97d: aload 0
      // 97e: getfield com/finalshell/io/YM3.U [C
      // 981: iload 18
      // 983: iinc 18 1
      // 986: sipush 29331
      // 989: ldc2_w 5838482518343647551
      // 98c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 98f: castore
      // 990: aload 0
      // 991: getfield com/finalshell/io/YM3.U [C
      // 994: iload 18
      // 996: iinc 18 1
      // 999: sipush 32152
      // 99c: ldc2_w 2468978250544385558
      // 99f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 9a2: castore
      // 9a3: aload 0
      // 9a4: getfield com/finalshell/io/YM3.U [C
      // 9a7: iload 18
      // 9a9: iinc 18 1
      // 9ac: getstatic com/finalshell/core/S7.y [C
      // 9af: iload 20
      // 9b1: sipush 7603
      // 9b4: ldc2_w 7325892985974222453
      // 9b7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 9ba: iushr
      // 9bb: sipush 21773
      // 9be: ldc2_w 6638525112670398138
      // 9c1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 9c4: iand
      // 9c5: caload
      // 9c6: castore
      // 9c7: aload 0
      // 9c8: getfield com/finalshell/io/YM3.U [C
      // 9cb: iload 18
      // 9cd: iinc 18 1
      // 9d0: getstatic com/finalshell/core/S7.y [C
      // 9d3: iload 20
      // 9d5: sipush 19011
      // 9d8: ldc2_w 74932091958442375
      // 9db: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 9de: iushr
      // 9df: sipush 21773
      // 9e2: ldc2_w 6638525112670398138
      // 9e5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 9e8: iand
      // 9e9: caload
      // 9ea: castore
      // 9eb: aload 0
      // 9ec: getfield com/finalshell/io/YM3.U [C
      // 9ef: iload 18
      // 9f1: iinc 18 1
      // 9f4: getstatic com/finalshell/core/S7.y [C
      // 9f7: iload 20
      // 9f9: bipush 4
      // 9fa: iushr
      // 9fb: sipush 21773
      // 9fe: ldc2_w 6638525112670398138
      // a01: invokestatic com/finalshell/io/YM3.a (IJ)I
      // a04: iand
      // a05: caload
      // a06: castore
      // a07: aload 0
      // a08: getfield com/finalshell/io/YM3.U [C
      // a0b: iload 18
      // a0d: iinc 18 1
      // a10: getstatic com/finalshell/core/S7.y [C
      // a13: iload 20
      // a15: sipush 21773
      // a18: ldc2_w 6638525112670398138
      // a1b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // a1e: iand
      // a1f: caload
      // a20: castore
      // a21: iinc 12 5
      // a24: aload 4
      // a26: ifnonnull c91
      // a29: goto a30
      // a2c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2f: athrow
      // a30: iload 20
      // a32: goto a39
      // a35: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a38: athrow
      // a39: getstatic com/finalshell/core/S7.j [B
      // a3c: arraylength
      // a3d: aload 4
      // a3f: ifnull a7a
      // a42: if_icmpge a68
      // a45: goto a4c
      // a48: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4b: athrow
      // a4c: getstatic com/finalshell/core/S7.j [B
      // a4f: iload 20
      // a51: baload
      // a52: aload 4
      // a54: ifnull ad2
      // a57: goto a5e
      // a5a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5d: athrow
      // a5e: ifne aa6
      // a61: goto a68
      // a64: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a67: athrow
      // a68: iload 20
      // a6a: sipush 4624
      // a6d: ldc2_w 6912903878219129232
      // a70: invokestatic com/finalshell/io/YM3.a (IJ)I
      // a73: goto a7a
      // a76: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a79: athrow
      // a7a: aload 4
      // a7c: ifnull ba7
      // a7f: if_icmpne b95
      // a82: goto a89
      // a85: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a88: athrow
      // a89: aload 0
      // a8a: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // a8d: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // a90: aload 4
      // a92: ifnull b9e
      // a95: goto a9c
      // a98: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9b: athrow
      // a9c: ifeq b95
      // a9f: goto aa6
      // aa2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa5: athrow
      // aa6: aload 0
      // aa7: getfield com/finalshell/io/YM3.U [C
      // aaa: iload 18
      // aac: iinc 18 1
      // aaf: sipush 29331
      // ab2: ldc2_w 5838482518343647551
      // ab5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // ab8: castore
      // ab9: aload 4
      // abb: ifnull b90
      // abe: goto ac5
      // ac1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac4: athrow
      // ac5: getstatic com/finalshell/core/S7.j [B
      // ac8: iload 20
      // aca: baload
      // acb: goto ad2
      // ace: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ad1: athrow
      // ad2: bipush 4
      // ad3: if_icmpne b76
      // ad6: aload 0
      // ad7: getfield com/finalshell/io/YM3.U [C
      // ada: iload 18
      // adc: iinc 18 1
      // adf: sipush 32152
      // ae2: ldc2_w 2468978250544385558
      // ae5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // ae8: castore
      // ae9: aload 0
      // aea: getfield com/finalshell/io/YM3.U [C
      // aed: iload 18
      // aef: iinc 18 1
      // af2: getstatic com/finalshell/core/S7.y [C
      // af5: iload 20
      // af7: sipush 7603
      // afa: ldc2_w 7325892985974222453
      // afd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b00: iushr
      // b01: sipush 21773
      // b04: ldc2_w 6638525112670398138
      // b07: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b0a: iand
      // b0b: caload
      // b0c: castore
      // b0d: aload 0
      // b0e: getfield com/finalshell/io/YM3.U [C
      // b11: iload 18
      // b13: iinc 18 1
      // b16: getstatic com/finalshell/core/S7.y [C
      // b19: iload 20
      // b1b: sipush 19011
      // b1e: ldc2_w 74932091958442375
      // b21: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b24: iushr
      // b25: sipush 21773
      // b28: ldc2_w 6638525112670398138
      // b2b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b2e: iand
      // b2f: caload
      // b30: castore
      // b31: aload 0
      // b32: getfield com/finalshell/io/YM3.U [C
      // b35: iload 18
      // b37: iinc 18 1
      // b3a: getstatic com/finalshell/core/S7.y [C
      // b3d: iload 20
      // b3f: bipush 4
      // b40: iushr
      // b41: sipush 21773
      // b44: ldc2_w 6638525112670398138
      // b47: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b4a: iand
      // b4b: caload
      // b4c: castore
      // b4d: aload 0
      // b4e: getfield com/finalshell/io/YM3.U [C
      // b51: iload 18
      // b53: iinc 18 1
      // b56: getstatic com/finalshell/core/S7.y [C
      // b59: iload 20
      // b5b: sipush 21773
      // b5e: ldc2_w 6638525112670398138
      // b61: invokestatic com/finalshell/io/YM3.a (IJ)I
      // b64: iand
      // b65: caload
      // b66: castore
      // b67: iinc 12 5
      // b6a: aload 4
      // b6c: ifnonnull c91
      // b6f: goto b76
      // b72: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b75: athrow
      // b76: aload 0
      // b77: getfield com/finalshell/io/YM3.U [C
      // b7a: iload 18
      // b7c: iinc 18 1
      // b7f: getstatic com/finalshell/core/S7.Q [C
      // b82: iload 20
      // b84: caload
      // b85: castore
      // b86: iinc 12 1
      // b89: goto b90
      // b8c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8f: athrow
      // b90: aload 4
      // b92: ifnonnull c91
      // b95: iload 20
      // b97: goto b9e
      // b9a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b9d: athrow
      // b9e: sipush 27592
      // ba1: ldc2_w 5349127045759342678
      // ba4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // ba7: aload 4
      // ba9: ifnull bc8
      // bac: if_icmpeq bcb
      // baf: goto bb6
      // bb2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb5: athrow
      // bb6: iload 20
      // bb8: sipush 3052
      // bbb: ldc2_w 3411686180789123159
      // bbe: invokestatic com/finalshell/io/YM3.a (IJ)I
      // bc1: goto bc8
      // bc4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc7: athrow
      // bc8: if_icmpne c7e
      // bcb: aload 0
      // bcc: getfield com/finalshell/io/YM3.U [C
      // bcf: iload 18
      // bd1: iinc 18 1
      // bd4: sipush 29331
      // bd7: ldc2_w 5838482518343647551
      // bda: invokestatic com/finalshell/io/YM3.a (IJ)I
      // bdd: castore
      // bde: aload 0
      // bdf: getfield com/finalshell/io/YM3.U [C
      // be2: iload 18
      // be4: iinc 18 1
      // be7: sipush 32152
      // bea: ldc2_w 2468978250544385558
      // bed: invokestatic com/finalshell/io/YM3.a (IJ)I
      // bf0: castore
      // bf1: aload 0
      // bf2: getfield com/finalshell/io/YM3.U [C
      // bf5: iload 18
      // bf7: iinc 18 1
      // bfa: getstatic com/finalshell/core/S7.y [C
      // bfd: iload 20
      // bff: sipush 7603
      // c02: ldc2_w 7325892985974222453
      // c05: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c08: iushr
      // c09: sipush 21773
      // c0c: ldc2_w 6638525112670398138
      // c0f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c12: iand
      // c13: caload
      // c14: castore
      // c15: aload 0
      // c16: getfield com/finalshell/io/YM3.U [C
      // c19: iload 18
      // c1b: iinc 18 1
      // c1e: getstatic com/finalshell/core/S7.y [C
      // c21: iload 20
      // c23: sipush 19011
      // c26: ldc2_w 74932091958442375
      // c29: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c2c: iushr
      // c2d: sipush 21773
      // c30: ldc2_w 6638525112670398138
      // c33: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c36: iand
      // c37: caload
      // c38: castore
      // c39: aload 0
      // c3a: getfield com/finalshell/io/YM3.U [C
      // c3d: iload 18
      // c3f: iinc 18 1
      // c42: getstatic com/finalshell/core/S7.y [C
      // c45: iload 20
      // c47: bipush 4
      // c48: iushr
      // c49: sipush 21773
      // c4c: ldc2_w 6638525112670398138
      // c4f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c52: iand
      // c53: caload
      // c54: castore
      // c55: aload 0
      // c56: getfield com/finalshell/io/YM3.U [C
      // c59: iload 18
      // c5b: iinc 18 1
      // c5e: getstatic com/finalshell/core/S7.y [C
      // c61: iload 20
      // c63: sipush 21773
      // c66: ldc2_w 6638525112670398138
      // c69: invokestatic com/finalshell/io/YM3.a (IJ)I
      // c6c: iand
      // c6d: caload
      // c6e: castore
      // c6f: iinc 12 5
      // c72: aload 4
      // c74: ifnonnull c91
      // c77: goto c7e
      // c7a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7d: athrow
      // c7e: aload 0
      // c7f: getfield com/finalshell/io/YM3.U [C
      // c82: iload 18
      // c84: iinc 18 1
      // c87: iload 20
      // c89: castore
      // c8a: goto c91
      // c8d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c90: athrow
      // c91: iinc 19 1
      // c94: aload 4
      // c96: ifnonnull 8c9
      // c99: aload 0
      // c9a: getfield com/finalshell/io/YM3.U [C
      // c9d: aload 0
      // c9e: getfield com/finalshell/io/YM3.c I
      // ca1: bipush 1
      // ca2: isub
      // ca3: sipush 32680
      // ca6: ldc2_w 6661901957014359160
      // ca9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // cac: castore
      // cad: return
   }

   public void l(char param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 2
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 5
      // 009: astore 4
      // 00b: aload 0
      // 00c: getfield com/finalshell/io/YM3.c I
      // 00f: istore 7
      // 011: aload 3
      // 012: invokevirtual java/lang/String.length ()I
      // 015: istore 6
      // 017: iload 7
      // 019: iload 5
      // 01b: iload 6
      // 01d: iadd
      // 01e: sipush 18434
      // 021: ldc2_w 8803446699062246320
      // 024: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 027: iadd
      // 028: iadd
      // 029: istore 7
      // 02b: iload 7
      // 02d: aload 0
      // 02e: getfield com/finalshell/io/YM3.U [C
      // 031: arraylength
      // 032: aload 4
      // 034: ifnull 08e
      // 037: if_icmple 07f
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 0
      // 042: aload 4
      // 044: ifnull 07a
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 051: ifnull 079
      // 054: goto 05b
      // 057: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: iload 1
      // 05d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 060: aload 0
      // 061: aload 2
      // 062: sipush 24491
      // 065: ldc2_w 457274472053943340
      // 068: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 06b: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 06e: aload 0
      // 06f: aload 3
      // 070: bipush 0
      // 071: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 074: return
      // 075: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: iload 7
      // 07c: invokevirtual com/finalshell/io/YM3.L (I)V
      // 07f: aload 0
      // 080: getfield com/finalshell/io/YM3.U [C
      // 083: aload 0
      // 084: getfield com/finalshell/io/YM3.c I
      // 087: iload 1
      // 088: castore
      // 089: aload 0
      // 08a: getfield com/finalshell/io/YM3.c I
      // 08d: bipush 2
      // 08e: iadd
      // 08f: istore 8
      // 091: iload 8
      // 093: iload 5
      // 095: iadd
      // 096: istore 9
      // 098: aload 0
      // 099: getfield com/finalshell/io/YM3.U [C
      // 09c: aload 0
      // 09d: getfield com/finalshell/io/YM3.c I
      // 0a0: bipush 1
      // 0a1: iadd
      // 0a2: sipush 23787
      // 0a5: ldc2_w 6715659368349806405
      // 0a8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ab: castore
      // 0ac: aload 2
      // 0ad: bipush 0
      // 0ae: iload 5
      // 0b0: aload 0
      // 0b1: getfield com/finalshell/io/YM3.U [C
      // 0b4: iload 8
      // 0b6: invokevirtual java/lang/String.getChars (II[CI)V
      // 0b9: aload 0
      // 0ba: iload 7
      // 0bc: putfield com/finalshell/io/YM3.c I
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/io/YM3.U [C
      // 0c3: iload 9
      // 0c5: sipush 32680
      // 0c8: ldc2_w 6661901957014359160
      // 0cb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ce: castore
      // 0cf: iload 9
      // 0d1: bipush 1
      // 0d2: iadd
      // 0d3: istore 10
      // 0d5: aload 0
      // 0d6: getfield com/finalshell/io/YM3.U [C
      // 0d9: iload 10
      // 0db: iinc 10 1
      // 0de: sipush 2562
      // 0e1: ldc2_w 8714183661880932788
      // 0e4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e7: castore
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/io/YM3.U [C
      // 0ec: iload 10
      // 0ee: iinc 10 1
      // 0f1: sipush 32680
      // 0f4: ldc2_w 6661901957014359160
      // 0f7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fa: castore
      // 0fb: iload 10
      // 0fd: istore 11
      // 0ff: aload 3
      // 100: bipush 0
      // 101: iload 6
      // 103: aload 0
      // 104: getfield com/finalshell/io/YM3.U [C
      // 107: iload 11
      // 109: invokevirtual java/lang/String.getChars (II[CI)V
      // 10c: aload 0
      // 10d: getfield com/finalshell/io/YM3.U [C
      // 110: aload 0
      // 111: getfield com/finalshell/io/YM3.c I
      // 114: bipush 1
      // 115: isub
      // 116: sipush 32680
      // 119: ldc2_w 6661901957014359160
      // 11c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 11f: castore
      // 120: return
   }

   public void z(char param1, String param2, Enum param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 4
      // 07: ifnull 2a
      // 0a: aload 3
      // 0b: ifnonnull 2b
      // 0e: goto 15
      // 11: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1a: aload 0
      // 1b: aload 2
      // 1c: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 1f: aload 0
      // 20: invokevirtual com/finalshell/io/YM3.Y ()V
      // 23: goto 2a
      // 26: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: return
      // 2b: aload 0
      // 2c: getfield com/finalshell/io/YM3.Y Z
      // 2f: aload 4
      // 31: ifnull 85
      // 34: ifeq 6e
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/finalshell/io/YM3.p Z
      // 42: aload 4
      // 44: ifnull 85
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: ifne 6e
      // 51: goto 58
      // 54: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 0
      // 59: iload 1
      // 5a: aload 2
      // 5b: aload 3
      // 5c: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 5f: invokespecial com/finalshell/io/YM3.z (CLjava/lang/String;Ljava/lang/String;)V
      // 62: aload 4
      // 64: ifnonnull af
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: aload 0
      // 6f: aload 4
      // 71: ifnull a6
      // 74: goto 7b
      // 77: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: getfield com/finalshell/io/YM3.p Z
      // 7e: goto 85
      // 81: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: ifeq 9e
      // 88: aload 0
      // 89: iload 1
      // 8a: aload 2
      // 8b: aload 3
      // 8c: invokevirtual java/lang/Enum.toString ()Ljava/lang/String;
      // 8f: invokespecial com/finalshell/io/YM3.z (CLjava/lang/String;Ljava/lang/String;)V
      // 92: aload 4
      // 94: ifnonnull af
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 0
      // 9f: goto a6
      // a2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: iload 1
      // a7: aload 2
      // a8: aload 3
      // a9: invokevirtual java/lang/Enum.ordinal ()I
      // ac: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // af: return
   }

   public void z(char param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnull 33
      // 0b: getfield com/finalshell/io/YM3.R Z
      // 0e: ifeq 2b
      // 11: goto 18
      // 14: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: aload 2
      // 1b: aload 3
      // 1c: invokevirtual com/finalshell/io/YM3.H (CLjava/lang/String;Ljava/lang/String;)V
      // 1f: aload 4
      // 21: ifnonnull 39
      // 24: goto 2b
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iload 1
      // 34: aload 2
      // 35: aload 3
      // 36: invokevirtual com/finalshell/io/YM3.l (CLjava/lang/String;Ljava/lang/String;)V
      // 39: return
   }

   public void f(char param1, String param2, BigDecimal param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/finalshell/io/YM3.write (I)V
      // 08: astore 4
      // 0a: aload 0
      // 0b: aload 2
      // 0c: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 0f: aload 3
      // 10: aload 4
      // 12: ifnull 37
      // 15: ifnonnull 2f
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual com/finalshell/io/YM3.Y ()V
      // 23: aload 4
      // 25: ifnonnull 94
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 3
      // 30: goto 37
      // 33: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: invokevirtual java/math/BigDecimal.scale ()I
      // 3a: istore 5
      // 3c: aload 0
      // 3d: aload 0
      // 3e: getstatic com/finalshell/ui/model/EP.WriteBigDecimalAsPlain Lcom/finalshell/ui/model/EP;
      // 41: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 44: aload 4
      // 46: ifnull 55
      // 49: ifeq 8d
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 5
      // 55: sipush 10472
      // 58: ldc2_w 4331692504184871801
      // 5b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 5e: aload 4
      // 60: ifnull 7f
      // 63: if_icmplt 8d
      // 66: goto 6d
      // 69: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: iload 5
      // 6f: sipush 17828
      // 72: ldc2_w 7501298861240858158
      // 75: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: if_icmpge 8d
      // 82: aload 3
      // 83: invokevirtual java/math/BigDecimal.toPlainString ()Ljava/lang/String;
      // 86: goto 91
      // 89: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 3
      // 8e: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 91: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 94: return
   }

   public void o(String param1, char param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnull 33
      // 09: getfield com/finalshell/io/YM3.R Z
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual com/finalshell/io/YM3.E (Ljava/lang/String;)V
      // 1b: aload 0
      // 1c: iload 2
      // 1d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 20: aload 3
      // 21: ifnonnull 38
      // 24: goto 2b
      // 27: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 1
      // 34: iload 2
      // 35: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 38: return
   }

   public void y(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 2e
      // 09: getfield com/finalshell/io/YM3.R Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual com/finalshell/io/YM3.E (Ljava/lang/String;)V
      // 1b: aload 2
      // 1c: ifnonnull 33
      // 1f: goto 26
      // 22: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: bipush 0
      // 30: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 33: return
   }

   public void v(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 1e
      // 09: getfield com/finalshell/io/YM3.R Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual com/finalshell/io/YM3.l ([C)V
      // 22: aload 2
      // 23: ifnonnull 35
      // 26: new java/lang/String
      // 29: dup
      // 2a: aload 1
      // 2b: invokespecial java/lang/String.<init> ([C)V
      // 2e: astore 3
      // 2f: aload 0
      // 30: aload 3
      // 31: bipush 0
      // 32: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 35: return
   }

   protected void E(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnull 057
      // 009: ifnonnull 056
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aload 0
      // 014: getfield com/finalshell/io/YM3.c I
      // 017: bipush 4
      // 018: iadd
      // 019: istore 3
      // 01a: aload 2
      // 01b: ifnull 055
      // 01e: iload 3
      // 01f: aload 0
      // 020: getfield com/finalshell/io/YM3.U [C
      // 023: arraylength
      // 024: if_icmple 03a
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: iload 3
      // 030: invokevirtual com/finalshell/io/YM3.L (I)V
      // 033: goto 03a
      // 036: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: sipush -18216
      // 03d: sipush -19122
      // 040: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 043: bipush 0
      // 044: bipush 4
      // 045: aload 0
      // 046: getfield com/finalshell/io/YM3.U [C
      // 049: aload 0
      // 04a: getfield com/finalshell/io/YM3.c I
      // 04d: invokevirtual java/lang/String.getChars (II[CI)V
      // 050: aload 0
      // 051: iload 3
      // 052: putfield com/finalshell/io/YM3.c I
      // 055: return
      // 056: aload 1
      // 057: invokevirtual java/lang/String.length ()I
      // 05a: istore 3
      // 05b: aload 0
      // 05c: getfield com/finalshell/io/YM3.c I
      // 05f: iload 3
      // 060: iadd
      // 061: bipush 2
      // 062: iadd
      // 063: istore 4
      // 065: iload 4
      // 067: aload 0
      // 068: getfield com/finalshell/io/YM3.U [C
      // 06b: arraylength
      // 06c: aload 2
      // 06d: ifnull 1a3
      // 070: if_icmple 19e
      // 073: goto 07a
      // 076: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 2
      // 07c: ifnull 199
      // 07f: goto 086
      // 082: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 089: ifnull 198
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: aload 0
      // 094: sipush 745
      // 097: ldc2_w 8237602896978899237
      // 09a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09d: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0a0: bipush 0
      // 0a1: istore 5
      // 0a3: iload 5
      // 0a5: aload 1
      // 0a6: invokevirtual java/lang/String.length ()I
      // 0a9: if_icmpge 18a
      // 0ac: aload 1
      // 0ad: iload 5
      // 0af: invokevirtual java/lang/String.charAt (I)C
      // 0b2: istore 6
      // 0b4: aload 2
      // 0b5: ifnull 197
      // 0b8: aload 2
      // 0b9: ifnull 172
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: iload 6
      // 0c5: sipush 13058
      // 0c8: ldc2_w 5903679206401720468
      // 0cb: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0ce: if_icmple 154
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: iload 6
      // 0da: sipush 29331
      // 0dd: ldc2_w 5838482518343647551
      // 0e0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0e3: aload 2
      // 0e4: ifnull 10a
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: if_icmpeq 154
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: iload 6
      // 0fa: sipush 745
      // 0fd: ldc2_w 8237602896978899237
      // 100: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 103: goto 10a
      // 106: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 2
      // 10b: ifnull 135
      // 10e: if_icmpeq 154
      // 111: goto 118
      // 114: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: iload 6
      // 11a: aload 2
      // 11b: ifnull 151
      // 11e: goto 125
      // 121: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: sipush 4624
      // 128: ldc2_w 6912903878219129232
      // 12b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 12e: goto 135
      // 131: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: if_icmpne 176
      // 138: aload 0
      // 139: aload 2
      // 13a: ifnull 17e
      // 13d: goto 144
      // 140: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 147: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: ifeq 176
      // 154: aload 0
      // 155: sipush 29331
      // 158: ldc2_w 5838482518343647551
      // 15b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 15e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 161: aload 0
      // 162: getstatic com/finalshell/core/S7.Q [C
      // 165: iload 6
      // 167: caload
      // 168: invokevirtual com/finalshell/io/YM3.write (I)V
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 2
      // 173: ifnonnull 183
      // 176: aload 0
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: iload 6
      // 180: invokevirtual com/finalshell/io/YM3.write (I)V
      // 183: iinc 5 1
      // 186: aload 2
      // 187: ifnonnull 0a3
      // 18a: aload 0
      // 18b: sipush 745
      // 18e: ldc2_w 8237602896978899237
      // 191: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 194: invokevirtual com/finalshell/io/YM3.write (I)V
      // 197: return
      // 198: aload 0
      // 199: iload 4
      // 19b: invokevirtual com/finalshell/io/YM3.L (I)V
      // 19e: aload 0
      // 19f: getfield com/finalshell/io/YM3.c I
      // 1a2: bipush 1
      // 1a3: iadd
      // 1a4: istore 5
      // 1a6: iload 5
      // 1a8: iload 3
      // 1a9: iadd
      // 1aa: istore 6
      // 1ac: aload 0
      // 1ad: getfield com/finalshell/io/YM3.U [C
      // 1b0: aload 0
      // 1b1: getfield com/finalshell/io/YM3.c I
      // 1b4: sipush 745
      // 1b7: ldc2_w 8237602896978899237
      // 1ba: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1bd: castore
      // 1be: aload 1
      // 1bf: bipush 0
      // 1c0: iload 3
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/io/YM3.U [C
      // 1c5: iload 5
      // 1c7: invokevirtual java/lang/String.getChars (II[CI)V
      // 1ca: aload 0
      // 1cb: iload 4
      // 1cd: putfield com/finalshell/io/YM3.c I
      // 1d0: bipush 0
      // 1d1: istore 7
      // 1d3: bipush -1
      // 1d4: istore 8
      // 1d6: bipush 0
      // 1d7: istore 9
      // 1d9: iload 5
      // 1db: istore 10
      // 1dd: iload 10
      // 1df: iload 6
      // 1e1: if_icmpge 29f
      // 1e4: aload 0
      // 1e5: getfield com/finalshell/io/YM3.U [C
      // 1e8: iload 10
      // 1ea: caload
      // 1eb: istore 11
      // 1ed: iload 11
      // 1ef: aload 2
      // 1f0: ifnull 296
      // 1f3: sipush 13058
      // 1f6: ldc2_w 5903679206401720468
      // 1f9: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1fc: aload 2
      // 1fd: ifnull 2ad
      // 200: goto 207
      // 203: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 206: athrow
      // 207: if_icmple 28d
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: iload 11
      // 213: aload 2
      // 214: ifnull 296
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21d: athrow
      // 21e: sipush 29331
      // 221: ldc2_w 5838482518343647551
      // 224: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 227: if_icmpeq 28d
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 230: athrow
      // 231: iload 11
      // 233: aload 2
      // 234: ifnull 296
      // 237: goto 23e
      // 23a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: sipush 745
      // 241: ldc2_w 8237602896978899237
      // 244: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 247: if_icmpeq 28d
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: iload 11
      // 253: aload 2
      // 254: ifnull 27f
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: sipush 4624
      // 261: ldc2_w 6912903878219129232
      // 264: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 267: if_icmpne 298
      // 26a: goto 271
      // 26d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 270: athrow
      // 271: aload 0
      // 272: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 275: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: aload 2
      // 280: ifnull 296
      // 283: ifeq 298
      // 286: goto 28d
      // 289: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: iinc 7 1
      // 290: iload 10
      // 292: istore 8
      // 294: iload 11
      // 296: istore 9
      // 298: iinc 10 1
      // 29b: aload 2
      // 29c: ifnonnull 1dd
      // 29f: iload 4
      // 2a1: iload 7
      // 2a3: iadd
      // 2a4: istore 4
      // 2a6: iload 4
      // 2a8: aload 0
      // 2a9: getfield com/finalshell/io/YM3.U [C
      // 2ac: arraylength
      // 2ad: aload 2
      // 2ae: ifnull 2d1
      // 2b1: if_icmple 2c8
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: iload 4
      // 2be: invokevirtual com/finalshell/io/YM3.L (I)V
      // 2c1: goto 2c8
      // 2c4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: aload 0
      // 2c9: iload 4
      // 2cb: putfield com/finalshell/io/YM3.c I
      // 2ce: iload 7
      // 2d0: bipush 1
      // 2d1: aload 2
      // 2d2: ifnull 32e
      // 2d5: if_icmpne 324
      // 2d8: goto 2df
      // 2db: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: aload 0
      // 2e0: getfield com/finalshell/io/YM3.U [C
      // 2e3: iload 8
      // 2e5: bipush 1
      // 2e6: iadd
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/io/YM3.U [C
      // 2eb: iload 8
      // 2ed: bipush 2
      // 2ee: iadd
      // 2ef: iload 6
      // 2f1: iload 8
      // 2f3: isub
      // 2f4: bipush 1
      // 2f5: isub
      // 2f6: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2f9: aload 0
      // 2fa: getfield com/finalshell/io/YM3.U [C
      // 2fd: iload 8
      // 2ff: sipush 29331
      // 302: ldc2_w 5838482518343647551
      // 305: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 308: castore
      // 309: aload 0
      // 30a: getfield com/finalshell/io/YM3.U [C
      // 30d: iinc 8 1
      // 310: iload 8
      // 312: getstatic com/finalshell/core/S7.Q [C
      // 315: iload 9
      // 317: caload
      // 318: castore
      // 319: aload 2
      // 31a: ifnonnull 480
      // 31d: goto 324
      // 320: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 323: athrow
      // 324: iload 7
      // 326: bipush 1
      // 327: goto 32e
      // 32a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32d: athrow
      // 32e: aload 2
      // 32f: ifnull 383
      // 332: if_icmple 480
      // 335: goto 33c
      // 338: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33b: athrow
      // 33c: aload 0
      // 33d: getfield com/finalshell/io/YM3.U [C
      // 340: iload 8
      // 342: bipush 1
      // 343: iadd
      // 344: aload 0
      // 345: getfield com/finalshell/io/YM3.U [C
      // 348: iload 8
      // 34a: bipush 2
      // 34b: iadd
      // 34c: iload 6
      // 34e: iload 8
      // 350: isub
      // 351: bipush 1
      // 352: isub
      // 353: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 356: aload 0
      // 357: getfield com/finalshell/io/YM3.U [C
      // 35a: iload 8
      // 35c: sipush 29331
      // 35f: ldc2_w 5838482518343647551
      // 362: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 365: castore
      // 366: aload 0
      // 367: getfield com/finalshell/io/YM3.U [C
      // 36a: iinc 8 1
      // 36d: iload 8
      // 36f: getstatic com/finalshell/core/S7.Q [C
      // 372: iload 9
      // 374: caload
      // 375: castore
      // 376: iinc 6 1
      // 379: iload 8
      // 37b: bipush 2
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 382: athrow
      // 383: isub
      // 384: istore 10
      // 386: iload 10
      // 388: iload 5
      // 38a: if_icmplt 480
      // 38d: aload 0
      // 38e: getfield com/finalshell/io/YM3.U [C
      // 391: iload 10
      // 393: caload
      // 394: istore 11
      // 396: aload 2
      // 397: ifnull 494
      // 39a: aload 2
      // 39b: ifnull 476
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a4: athrow
      // 3a5: iload 11
      // 3a7: sipush 13058
      // 3aa: ldc2_w 5903679206401720468
      // 3ad: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3b0: if_icmple 436
      // 3b3: goto 3ba
      // 3b6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b9: athrow
      // 3ba: iload 11
      // 3bc: sipush 29331
      // 3bf: ldc2_w 5838482518343647551
      // 3c2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3c5: aload 2
      // 3c6: ifnull 3ec
      // 3c9: goto 3d0
      // 3cc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: if_icmpeq 436
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d9: athrow
      // 3da: iload 11
      // 3dc: sipush 745
      // 3df: ldc2_w 8237602896978899237
      // 3e2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3eb: athrow
      // 3ec: aload 2
      // 3ed: ifnull 417
      // 3f0: if_icmpeq 436
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: iload 11
      // 3fc: aload 2
      // 3fd: ifnull 433
      // 400: goto 407
      // 403: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 406: athrow
      // 407: sipush 4624
      // 40a: ldc2_w 6912903878219129232
      // 40d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 410: goto 417
      // 413: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 416: athrow
      // 417: if_icmpne 479
      // 41a: aload 0
      // 41b: aload 2
      // 41c: ifnull 468
      // 41f: goto 426
      // 422: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 425: athrow
      // 426: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 429: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 42c: goto 433
      // 42f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 432: athrow
      // 433: ifeq 479
      // 436: aload 0
      // 437: getfield com/finalshell/io/YM3.U [C
      // 43a: iload 10
      // 43c: bipush 1
      // 43d: iadd
      // 43e: aload 0
      // 43f: getfield com/finalshell/io/YM3.U [C
      // 442: iload 10
      // 444: bipush 2
      // 445: iadd
      // 446: iload 6
      // 448: iload 10
      // 44a: isub
      // 44b: bipush 1
      // 44c: isub
      // 44d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 450: aload 0
      // 451: getfield com/finalshell/io/YM3.U [C
      // 454: iload 10
      // 456: sipush 29331
      // 459: ldc2_w 5838482518343647551
      // 45c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 45f: castore
      // 460: aload 0
      // 461: goto 468
      // 464: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 467: athrow
      // 468: getfield com/finalshell/io/YM3.U [C
      // 46b: iload 10
      // 46d: bipush 1
      // 46e: iadd
      // 46f: getstatic com/finalshell/core/S7.Q [C
      // 472: iload 11
      // 474: caload
      // 475: castore
      // 476: iinc 6 1
      // 479: iinc 10 -1
      // 47c: aload 2
      // 47d: ifnonnull 386
      // 480: aload 0
      // 481: getfield com/finalshell/io/YM3.U [C
      // 484: aload 0
      // 485: getfield com/finalshell/io/YM3.c I
      // 488: bipush 1
      // 489: isub
      // 48a: sipush 745
      // 48d: ldc2_w 8237602896978899237
      // 490: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 493: castore
      // 494: return
   }

   protected void l(char[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnull 057
      // 009: ifnonnull 056
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aload 0
      // 014: getfield com/finalshell/io/YM3.c I
      // 017: bipush 4
      // 018: iadd
      // 019: istore 3
      // 01a: aload 2
      // 01b: ifnull 055
      // 01e: iload 3
      // 01f: aload 0
      // 020: getfield com/finalshell/io/YM3.U [C
      // 023: arraylength
      // 024: if_icmple 03a
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: iload 3
      // 030: invokevirtual com/finalshell/io/YM3.L (I)V
      // 033: goto 03a
      // 036: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: sipush -18216
      // 03d: sipush -19122
      // 040: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 043: bipush 0
      // 044: bipush 4
      // 045: aload 0
      // 046: getfield com/finalshell/io/YM3.U [C
      // 049: aload 0
      // 04a: getfield com/finalshell/io/YM3.c I
      // 04d: invokevirtual java/lang/String.getChars (II[CI)V
      // 050: aload 0
      // 051: iload 3
      // 052: putfield com/finalshell/io/YM3.c I
      // 055: return
      // 056: aload 1
      // 057: arraylength
      // 058: istore 3
      // 059: aload 0
      // 05a: getfield com/finalshell/io/YM3.c I
      // 05d: iload 3
      // 05e: iadd
      // 05f: bipush 2
      // 060: iadd
      // 061: istore 4
      // 063: iload 4
      // 065: aload 0
      // 066: getfield com/finalshell/io/YM3.U [C
      // 069: arraylength
      // 06a: aload 2
      // 06b: ifnull 19d
      // 06e: if_icmple 198
      // 071: goto 078
      // 074: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 0
      // 079: aload 2
      // 07a: ifnull 193
      // 07d: goto 084
      // 080: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 087: ifnull 192
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 0
      // 092: sipush 745
      // 095: ldc2_w 8237602896978899237
      // 098: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 09b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 09e: bipush 0
      // 09f: istore 5
      // 0a1: iload 5
      // 0a3: aload 1
      // 0a4: arraylength
      // 0a5: if_icmpge 184
      // 0a8: aload 1
      // 0a9: iload 5
      // 0ab: caload
      // 0ac: istore 6
      // 0ae: aload 2
      // 0af: ifnull 191
      // 0b2: aload 2
      // 0b3: ifnull 16c
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: iload 6
      // 0bf: sipush 7187
      // 0c2: ldc2_w 5325295365943357343
      // 0c5: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0c8: if_icmple 14e
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: iload 6
      // 0d4: sipush 29331
      // 0d7: ldc2_w 5838482518343647551
      // 0da: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0dd: aload 2
      // 0de: ifnull 104
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: if_icmpeq 14e
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: iload 6
      // 0f4: sipush 745
      // 0f7: ldc2_w 8237602896978899237
      // 0fa: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 2
      // 105: ifnull 12f
      // 108: if_icmpeq 14e
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: iload 6
      // 114: aload 2
      // 115: ifnull 14b
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: sipush 8790
      // 122: ldc2_w 8581795588875997659
      // 125: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 128: goto 12f
      // 12b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: if_icmpne 170
      // 132: aload 0
      // 133: aload 2
      // 134: ifnull 178
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 141: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 144: goto 14b
      // 147: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: ifeq 170
      // 14e: aload 0
      // 14f: sipush 29331
      // 152: ldc2_w 5838482518343647551
      // 155: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 158: invokevirtual com/finalshell/io/YM3.write (I)V
      // 15b: aload 0
      // 15c: getstatic com/finalshell/core/S7.Q [C
      // 15f: iload 6
      // 161: caload
      // 162: invokevirtual com/finalshell/io/YM3.write (I)V
      // 165: goto 16c
      // 168: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 2
      // 16d: ifnonnull 17d
      // 170: aload 0
      // 171: goto 178
      // 174: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: iload 6
      // 17a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 17d: iinc 5 1
      // 180: aload 2
      // 181: ifnonnull 0a1
      // 184: aload 0
      // 185: sipush 745
      // 188: ldc2_w 8237602896978899237
      // 18b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 18e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 191: return
      // 192: aload 0
      // 193: iload 4
      // 195: invokevirtual com/finalshell/io/YM3.L (I)V
      // 198: aload 0
      // 199: getfield com/finalshell/io/YM3.c I
      // 19c: bipush 1
      // 19d: iadd
      // 19e: istore 5
      // 1a0: iload 5
      // 1a2: iload 3
      // 1a3: iadd
      // 1a4: istore 6
      // 1a6: aload 0
      // 1a7: getfield com/finalshell/io/YM3.U [C
      // 1aa: aload 0
      // 1ab: getfield com/finalshell/io/YM3.c I
      // 1ae: sipush 745
      // 1b1: ldc2_w 8237602896978899237
      // 1b4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1b7: castore
      // 1b8: aload 1
      // 1b9: bipush 0
      // 1ba: aload 0
      // 1bb: getfield com/finalshell/io/YM3.U [C
      // 1be: iload 5
      // 1c0: aload 1
      // 1c1: arraylength
      // 1c2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1c5: aload 0
      // 1c6: iload 4
      // 1c8: putfield com/finalshell/io/YM3.c I
      // 1cb: bipush 0
      // 1cc: istore 7
      // 1ce: bipush -1
      // 1cf: istore 8
      // 1d1: bipush 0
      // 1d2: istore 9
      // 1d4: iload 5
      // 1d6: istore 10
      // 1d8: iload 10
      // 1da: iload 6
      // 1dc: if_icmpge 29a
      // 1df: aload 0
      // 1e0: getfield com/finalshell/io/YM3.U [C
      // 1e3: iload 10
      // 1e5: caload
      // 1e6: istore 11
      // 1e8: iload 11
      // 1ea: aload 2
      // 1eb: ifnull 291
      // 1ee: sipush 13058
      // 1f1: ldc2_w 5903679206401720468
      // 1f4: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1f7: aload 2
      // 1f8: ifnull 2a8
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: if_icmple 288
      // 205: goto 20c
      // 208: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: iload 11
      // 20e: aload 2
      // 20f: ifnull 291
      // 212: goto 219
      // 215: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 218: athrow
      // 219: sipush 29331
      // 21c: ldc2_w 5838482518343647551
      // 21f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 222: if_icmpeq 288
      // 225: goto 22c
      // 228: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: iload 11
      // 22e: aload 2
      // 22f: ifnull 291
      // 232: goto 239
      // 235: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: sipush 745
      // 23c: ldc2_w 8237602896978899237
      // 23f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 242: if_icmpeq 288
      // 245: goto 24c
      // 248: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: iload 11
      // 24e: aload 2
      // 24f: ifnull 27a
      // 252: goto 259
      // 255: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 258: athrow
      // 259: sipush 4624
      // 25c: ldc2_w 6912903878219129232
      // 25f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 262: if_icmpne 293
      // 265: goto 26c
      // 268: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: aload 0
      // 26d: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 270: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 273: goto 27a
      // 276: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 279: athrow
      // 27a: aload 2
      // 27b: ifnull 291
      // 27e: ifeq 293
      // 281: goto 288
      // 284: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: iinc 7 1
      // 28b: iload 10
      // 28d: istore 8
      // 28f: iload 11
      // 291: istore 9
      // 293: iinc 10 1
      // 296: aload 2
      // 297: ifnonnull 1d8
      // 29a: iload 4
      // 29c: iload 7
      // 29e: iadd
      // 29f: istore 4
      // 2a1: iload 4
      // 2a3: aload 0
      // 2a4: getfield com/finalshell/io/YM3.U [C
      // 2a7: arraylength
      // 2a8: aload 2
      // 2a9: ifnull 2cc
      // 2ac: if_icmple 2c3
      // 2af: goto 2b6
      // 2b2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: aload 0
      // 2b7: iload 4
      // 2b9: invokevirtual com/finalshell/io/YM3.L (I)V
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: aload 0
      // 2c4: iload 4
      // 2c6: putfield com/finalshell/io/YM3.c I
      // 2c9: iload 7
      // 2cb: bipush 1
      // 2cc: aload 2
      // 2cd: ifnull 329
      // 2d0: if_icmpne 31f
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: getfield com/finalshell/io/YM3.U [C
      // 2de: iload 8
      // 2e0: bipush 1
      // 2e1: iadd
      // 2e2: aload 0
      // 2e3: getfield com/finalshell/io/YM3.U [C
      // 2e6: iload 8
      // 2e8: bipush 2
      // 2e9: iadd
      // 2ea: iload 6
      // 2ec: iload 8
      // 2ee: isub
      // 2ef: bipush 1
      // 2f0: isub
      // 2f1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2f4: aload 0
      // 2f5: getfield com/finalshell/io/YM3.U [C
      // 2f8: iload 8
      // 2fa: sipush 29331
      // 2fd: ldc2_w 5838482518343647551
      // 300: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 303: castore
      // 304: aload 0
      // 305: getfield com/finalshell/io/YM3.U [C
      // 308: iinc 8 1
      // 30b: iload 8
      // 30d: getstatic com/finalshell/core/S7.Q [C
      // 310: iload 9
      // 312: caload
      // 313: castore
      // 314: aload 2
      // 315: ifnonnull 47b
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31e: athrow
      // 31f: iload 7
      // 321: bipush 1
      // 322: goto 329
      // 325: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 328: athrow
      // 329: aload 2
      // 32a: ifnull 37e
      // 32d: if_icmple 47b
      // 330: goto 337
      // 333: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 336: athrow
      // 337: aload 0
      // 338: getfield com/finalshell/io/YM3.U [C
      // 33b: iload 8
      // 33d: bipush 1
      // 33e: iadd
      // 33f: aload 0
      // 340: getfield com/finalshell/io/YM3.U [C
      // 343: iload 8
      // 345: bipush 2
      // 346: iadd
      // 347: iload 6
      // 349: iload 8
      // 34b: isub
      // 34c: bipush 1
      // 34d: isub
      // 34e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 351: aload 0
      // 352: getfield com/finalshell/io/YM3.U [C
      // 355: iload 8
      // 357: sipush 29331
      // 35a: ldc2_w 5838482518343647551
      // 35d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 360: castore
      // 361: aload 0
      // 362: getfield com/finalshell/io/YM3.U [C
      // 365: iinc 8 1
      // 368: iload 8
      // 36a: getstatic com/finalshell/core/S7.Q [C
      // 36d: iload 9
      // 36f: caload
      // 370: castore
      // 371: iinc 6 1
      // 374: iload 8
      // 376: bipush 2
      // 377: goto 37e
      // 37a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37d: athrow
      // 37e: isub
      // 37f: istore 10
      // 381: iload 10
      // 383: iload 5
      // 385: if_icmplt 47b
      // 388: aload 0
      // 389: getfield com/finalshell/io/YM3.U [C
      // 38c: iload 10
      // 38e: caload
      // 38f: istore 11
      // 391: aload 2
      // 392: ifnull 48f
      // 395: aload 2
      // 396: ifnull 471
      // 399: goto 3a0
      // 39c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39f: athrow
      // 3a0: iload 11
      // 3a2: sipush 13058
      // 3a5: ldc2_w 5903679206401720468
      // 3a8: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3ab: if_icmple 431
      // 3ae: goto 3b5
      // 3b1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b4: athrow
      // 3b5: iload 11
      // 3b7: sipush 29331
      // 3ba: ldc2_w 5838482518343647551
      // 3bd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3c0: aload 2
      // 3c1: ifnull 3e7
      // 3c4: goto 3cb
      // 3c7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ca: athrow
      // 3cb: if_icmpeq 431
      // 3ce: goto 3d5
      // 3d1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d4: athrow
      // 3d5: iload 11
      // 3d7: sipush 745
      // 3da: ldc2_w 8237602896978899237
      // 3dd: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3e0: goto 3e7
      // 3e3: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e6: athrow
      // 3e7: aload 2
      // 3e8: ifnull 412
      // 3eb: if_icmpeq 431
      // 3ee: goto 3f5
      // 3f1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f4: athrow
      // 3f5: iload 11
      // 3f7: aload 2
      // 3f8: ifnull 42e
      // 3fb: goto 402
      // 3fe: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 401: athrow
      // 402: sipush 4624
      // 405: ldc2_w 6912903878219129232
      // 408: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 40b: goto 412
      // 40e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 411: athrow
      // 412: if_icmpne 474
      // 415: aload 0
      // 416: aload 2
      // 417: ifnull 463
      // 41a: goto 421
      // 41d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 420: athrow
      // 421: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 424: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 427: goto 42e
      // 42a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42d: athrow
      // 42e: ifeq 474
      // 431: aload 0
      // 432: getfield com/finalshell/io/YM3.U [C
      // 435: iload 10
      // 437: bipush 1
      // 438: iadd
      // 439: aload 0
      // 43a: getfield com/finalshell/io/YM3.U [C
      // 43d: iload 10
      // 43f: bipush 2
      // 440: iadd
      // 441: iload 6
      // 443: iload 10
      // 445: isub
      // 446: bipush 1
      // 447: isub
      // 448: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 44b: aload 0
      // 44c: getfield com/finalshell/io/YM3.U [C
      // 44f: iload 10
      // 451: sipush 29331
      // 454: ldc2_w 5838482518343647551
      // 457: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 45a: castore
      // 45b: aload 0
      // 45c: goto 463
      // 45f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 462: athrow
      // 463: getfield com/finalshell/io/YM3.U [C
      // 466: iload 10
      // 468: bipush 1
      // 469: iadd
      // 46a: getstatic com/finalshell/core/S7.Q [C
      // 46d: iload 11
      // 46f: caload
      // 470: castore
      // 471: iinc 6 1
      // 474: iinc 10 -1
      // 477: aload 2
      // 478: ifnonnull 381
      // 47b: aload 0
      // 47c: getfield com/finalshell/io/YM3.U [C
      // 47f: aload 0
      // 480: getfield com/finalshell/io/YM3.c I
      // 483: bipush 1
      // 484: isub
      // 485: sipush 745
      // 488: ldc2_w 8237602896978899237
      // 48b: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 48e: castore
      // 48f: return
   }

   public void u(String var1) {
      this.o(var1, false);
   }

   public void o(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 3
      // 005: ifnull 027
      // 008: aload 1
      // 009: ifnonnull 028
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aload 0
      // 014: sipush -18225
      // 017: sipush 5233
      // 01a: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 01d: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 020: goto 027
      // 023: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: return
      // 028: aload 0
      // 029: getfield com/finalshell/io/YM3.R Z
      // 02c: aload 3
      // 02d: ifnull 08b
      // 030: ifeq 080
      // 033: goto 03a
      // 036: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 3
      // 03c: ifnull 078
      // 03f: goto 046
      // 042: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: getfield com/finalshell/io/YM3.e Z
      // 049: ifeq 070
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 0
      // 054: aload 1
      // 055: invokevirtual com/finalshell/io/YM3.E (Ljava/lang/String;)V
      // 058: aload 0
      // 059: sipush 2562
      // 05c: ldc2_w 8714183661880932788
      // 05f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 062: invokevirtual com/finalshell/io/YM3.write (I)V
      // 065: aload 3
      // 066: ifnonnull 1ad
      // 069: goto 070
      // 06c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 0
      // 071: goto 078
      // 074: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 1
      // 079: invokespecial com/finalshell/io/YM3.s (Ljava/lang/String;)V
      // 07c: aload 3
      // 07d: ifnonnull 1ad
      // 080: aload 0
      // 081: getfield com/finalshell/io/YM3.e Z
      // 084: goto 08b
      // 087: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 3
      // 08c: ifnull 0bd
      // 08f: ifeq 0b2
      // 092: goto 099
      // 095: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 0
      // 09a: aload 1
      // 09b: sipush 2562
      // 09e: ldc2_w 8714183661880932788
      // 0a1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0a4: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 0a7: aload 3
      // 0a8: ifnonnull 1ad
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: aload 1
      // 0b3: invokevirtual java/lang/String.length ()I
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 3
      // 0be: ifnull 0cc
      // 0c1: ifne 0cf
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: bipush 1
      // 0cc: goto 0d0
      // 0cf: bipush 0
      // 0d0: istore 4
      // 0d2: bipush 0
      // 0d3: istore 5
      // 0d5: iload 5
      // 0d7: aload 1
      // 0d8: invokevirtual java/lang/String.length ()I
      // 0db: if_icmpge 176
      // 0de: aload 1
      // 0df: iload 5
      // 0e1: invokevirtual java/lang/String.charAt (I)C
      // 0e4: istore 6
      // 0e6: iload 6
      // 0e8: aload 3
      // 0e9: ifnull 178
      // 0ec: sipush 8115
      // 0ef: ldc2_w 8750079369629690934
      // 0f2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 0f5: aload 3
      // 0f6: ifnull 147
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: if_icmpge 12a
      // 103: goto 10a
      // 106: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield com/finalshell/io/YM3.s J
      // 10e: lconst_1
      // 10f: iload 6
      // 111: lshl
      // 112: land
      // 113: lconst_0
      // 114: lcmp
      // 115: aload 3
      // 116: ifnull 14b
      // 119: goto 120
      // 11c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: ifne 14a
      // 123: goto 12a
      // 126: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: iload 6
      // 12c: aload 3
      // 12d: ifnull 14b
      // 130: goto 137
      // 133: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: sipush 29331
      // 13a: ldc2_w 5838482518343647551
      // 13d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 140: goto 147
      // 143: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: if_icmpne 14e
      // 14a: bipush 1
      // 14b: goto 14f
      // 14e: bipush 0
      // 14f: istore 7
      // 151: aload 3
      // 152: ifnull 172
      // 155: iload 7
      // 157: ifeq 168
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: bipush 1
      // 162: istore 4
      // 164: aload 3
      // 165: ifnonnull 176
      // 168: iinc 5 1
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 3
      // 173: ifnonnull 0d5
      // 176: iload 4
      // 178: ifeq 194
      // 17b: aload 0
      // 17c: aload 1
      // 17d: sipush 2562
      // 180: ldc2_w 8714183661880932788
      // 183: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 186: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 189: aload 3
      // 18a: ifnonnull 1ad
      // 18d: goto 194
      // 190: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: aload 0
      // 195: aload 1
      // 196: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 199: aload 0
      // 19a: sipush 2562
      // 19d: ldc2_w 8714183661880932788
      // 1a0: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1a3: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: return
   }

   public void s(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: getstatic com/finalshell/core/S7.q [B
      // 006: astore 3
      // 007: astore 2
      // 008: aload 1
      // 009: invokevirtual java/lang/String.length ()I
      // 00c: istore 4
      // 00e: aload 0
      // 00f: getfield com/finalshell/io/YM3.c I
      // 012: iload 4
      // 014: iadd
      // 015: bipush 1
      // 016: iadd
      // 017: istore 5
      // 019: iload 5
      // 01b: aload 2
      // 01c: ifnull 1b0
      // 01f: aload 0
      // 020: getfield com/finalshell/io/YM3.U [C
      // 023: arraylength
      // 024: if_icmple 1ae
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: aload 0
      // 02f: aload 2
      // 030: ifnull 1a9
      // 033: goto 03a
      // 036: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: getfield com/finalshell/io/YM3.j Ljava/io/Writer;
      // 03d: ifnull 1a8
      // 040: goto 047
      // 043: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: iload 4
      // 049: aload 2
      // 04a: ifnull 08b
      // 04d: goto 054
      // 050: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: ifne 08a
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 0
      // 05f: sipush 32734
      // 062: ldc2_w 8198145788966767619
      // 065: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 068: invokevirtual com/finalshell/io/YM3.write (I)V
      // 06b: aload 0
      // 06c: sipush 745
      // 06f: ldc2_w 8237602896978899237
      // 072: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 075: invokevirtual com/finalshell/io/YM3.write (I)V
      // 078: aload 0
      // 079: sipush 2562
      // 07c: ldc2_w 8714183661880932788
      // 07f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 082: invokevirtual com/finalshell/io/YM3.write (I)V
      // 085: return
      // 086: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: bipush 0
      // 08b: istore 6
      // 08d: bipush 0
      // 08e: istore 7
      // 090: iload 7
      // 092: iload 4
      // 094: if_icmpge 0ea
      // 097: aload 1
      // 098: iload 7
      // 09a: invokevirtual java/lang/String.charAt (I)C
      // 09d: istore 8
      // 09f: aload 2
      // 0a0: ifnull 0e6
      // 0a3: iload 8
      // 0a5: aload 3
      // 0a6: arraylength
      // 0a7: aload 2
      // 0a8: ifnull 115
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: if_icmpge 0dc
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: aload 3
      // 0bd: iload 8
      // 0bf: baload
      // 0c0: aload 2
      // 0c1: ifnull 0d6
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: ifeq 0dc
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: istore 6
      // 0d8: aload 2
      // 0d9: ifnonnull 0ea
      // 0dc: iinc 7 1
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 2
      // 0e7: ifnonnull 090
      // 0ea: iload 6
      // 0ec: aload 2
      // 0ed: ifnull 10f
      // 0f0: ifeq 10e
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: sipush 745
      // 0fe: ldc2_w 8237602896978899237
      // 101: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 104: invokevirtual com/finalshell/io/YM3.write (I)V
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: bipush 0
      // 10f: istore 7
      // 111: iload 7
      // 113: iload 4
      // 115: if_icmpge 181
      // 118: aload 1
      // 119: iload 7
      // 11b: invokevirtual java/lang/String.charAt (I)C
      // 11e: istore 8
      // 120: iload 8
      // 122: aload 2
      // 123: ifnull 183
      // 126: aload 2
      // 127: ifnull 148
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: aload 3
      // 132: arraylength
      // 133: if_icmpge 16d
      // 136: goto 13d
      // 139: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 3
      // 13e: iload 8
      // 140: baload
      // 141: goto 148
      // 144: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: ifeq 16d
      // 14b: aload 0
      // 14c: sipush 12951
      // 14f: ldc2_w 9078227151570092382
      // 152: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 155: invokevirtual com/finalshell/io/YM3.write (I)V
      // 158: aload 0
      // 159: getstatic com/finalshell/core/S7.Q [C
      // 15c: iload 8
      // 15e: caload
      // 15f: invokevirtual com/finalshell/io/YM3.write (I)V
      // 162: aload 2
      // 163: ifnonnull 17a
      // 166: goto 16d
      // 169: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 0
      // 16e: iload 8
      // 170: invokevirtual com/finalshell/io/YM3.write (I)V
      // 173: goto 17a
      // 176: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: iinc 7 1
      // 17d: aload 2
      // 17e: ifnonnull 111
      // 181: iload 6
      // 183: ifeq 19a
      // 186: aload 0
      // 187: sipush 745
      // 18a: ldc2_w 8237602896978899237
      // 18d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 190: invokevirtual com/finalshell/io/YM3.write (I)V
      // 193: goto 19a
      // 196: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 0
      // 19b: sipush 2562
      // 19e: ldc2_w 8714183661880932788
      // 1a1: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 1a4: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1a7: return
      // 1a8: aload 0
      // 1a9: iload 5
      // 1ab: invokevirtual com/finalshell/io/YM3.L (I)V
      // 1ae: iload 4
      // 1b0: aload 2
      // 1b1: ifnull 23c
      // 1b4: ifne 238
      // 1b7: goto 1be
      // 1ba: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: getfield com/finalshell/io/YM3.c I
      // 1c2: bipush 3
      // 1c3: iadd
      // 1c4: istore 6
      // 1c6: aload 2
      // 1c7: ifnull 237
      // 1ca: iload 6
      // 1cc: aload 0
      // 1cd: getfield com/finalshell/io/YM3.U [C
      // 1d0: arraylength
      // 1d1: if_icmple 1ec
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: aload 0
      // 1dd: getfield com/finalshell/io/YM3.c I
      // 1e0: bipush 3
      // 1e1: iadd
      // 1e2: invokevirtual com/finalshell/io/YM3.L (I)V
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 0
      // 1ed: getfield com/finalshell/io/YM3.U [C
      // 1f0: aload 0
      // 1f1: dup
      // 1f2: getfield com/finalshell/io/YM3.c I
      // 1f5: dup_x1
      // 1f6: bipush 1
      // 1f7: iadd
      // 1f8: putfield com/finalshell/io/YM3.c I
      // 1fb: sipush 745
      // 1fe: ldc2_w 8237602896978899237
      // 201: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 204: castore
      // 205: aload 0
      // 206: getfield com/finalshell/io/YM3.U [C
      // 209: aload 0
      // 20a: dup
      // 20b: getfield com/finalshell/io/YM3.c I
      // 20e: dup_x1
      // 20f: bipush 1
      // 210: iadd
      // 211: putfield com/finalshell/io/YM3.c I
      // 214: sipush 745
      // 217: ldc2_w 8237602896978899237
      // 21a: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 21d: castore
      // 21e: aload 0
      // 21f: getfield com/finalshell/io/YM3.U [C
      // 222: aload 0
      // 223: dup
      // 224: getfield com/finalshell/io/YM3.c I
      // 227: dup_x1
      // 228: bipush 1
      // 229: iadd
      // 22a: putfield com/finalshell/io/YM3.c I
      // 22d: sipush 2562
      // 230: ldc2_w 8714183661880932788
      // 233: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 236: castore
      // 237: return
      // 238: aload 0
      // 239: getfield com/finalshell/io/YM3.c I
      // 23c: istore 6
      // 23e: iload 6
      // 240: iload 4
      // 242: iadd
      // 243: istore 7
      // 245: aload 1
      // 246: bipush 0
      // 247: iload 4
      // 249: aload 0
      // 24a: getfield com/finalshell/io/YM3.U [C
      // 24d: iload 6
      // 24f: invokevirtual java/lang/String.getChars (II[CI)V
      // 252: aload 0
      // 253: iload 5
      // 255: putfield com/finalshell/io/YM3.c I
      // 258: bipush 0
      // 259: istore 8
      // 25b: iload 6
      // 25d: istore 9
      // 25f: iload 9
      // 261: iload 7
      // 263: if_icmpge 3d5
      // 266: aload 0
      // 267: getfield com/finalshell/io/YM3.U [C
      // 26a: iload 9
      // 26c: caload
      // 26d: istore 10
      // 26f: aload 2
      // 270: ifnull 3e7
      // 273: aload 2
      // 274: ifnull 3d1
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27d: athrow
      // 27e: iload 10
      // 280: aload 3
      // 281: arraylength
      // 282: if_icmpge 3ce
      // 285: goto 28c
      // 288: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: aload 3
      // 28d: iload 10
      // 28f: baload
      // 290: aload 2
      // 291: ifnull 2a7
      // 294: goto 29b
      // 297: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29a: athrow
      // 29b: ifeq 3ce
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a4: athrow
      // 2a5: iload 8
      // 2a7: aload 2
      // 2a8: ifnull 378
      // 2ab: ifne 361
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: iinc 5 3
      // 2b8: iload 5
      // 2ba: aload 2
      // 2bb: ifnull 35b
      // 2be: goto 2c5
      // 2c1: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c4: athrow
      // 2c5: aload 0
      // 2c6: getfield com/finalshell/io/YM3.U [C
      // 2c9: arraylength
      // 2ca: if_icmple 2e1
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d3: athrow
      // 2d4: aload 0
      // 2d5: iload 5
      // 2d7: invokevirtual com/finalshell/io/YM3.L (I)V
      // 2da: goto 2e1
      // 2dd: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e0: athrow
      // 2e1: aload 0
      // 2e2: iload 5
      // 2e4: putfield com/finalshell/io/YM3.c I
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/io/YM3.U [C
      // 2eb: iload 9
      // 2ed: bipush 1
      // 2ee: iadd
      // 2ef: aload 0
      // 2f0: getfield com/finalshell/io/YM3.U [C
      // 2f3: iload 9
      // 2f5: bipush 3
      // 2f6: iadd
      // 2f7: iload 7
      // 2f9: iload 9
      // 2fb: isub
      // 2fc: bipush 1
      // 2fd: isub
      // 2fe: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 301: aload 0
      // 302: getfield com/finalshell/io/YM3.U [C
      // 305: bipush 0
      // 306: aload 0
      // 307: getfield com/finalshell/io/YM3.U [C
      // 30a: bipush 1
      // 30b: iload 9
      // 30d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 310: aload 0
      // 311: getfield com/finalshell/io/YM3.U [C
      // 314: iload 6
      // 316: sipush 745
      // 319: ldc2_w 8237602896978899237
      // 31c: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 31f: castore
      // 320: aload 0
      // 321: getfield com/finalshell/io/YM3.U [C
      // 324: iinc 9 1
      // 327: iload 9
      // 329: sipush 29331
      // 32c: ldc2_w 5838482518343647551
      // 32f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 332: castore
      // 333: aload 0
      // 334: getfield com/finalshell/io/YM3.U [C
      // 337: iinc 9 1
      // 33a: iload 9
      // 33c: getstatic com/finalshell/core/S7.Q [C
      // 33f: iload 10
      // 341: caload
      // 342: castore
      // 343: iinc 7 2
      // 346: aload 0
      // 347: getfield com/finalshell/io/YM3.U [C
      // 34a: aload 0
      // 34b: getfield com/finalshell/io/YM3.c I
      // 34e: bipush 2
      // 34f: isub
      // 350: sipush 745
      // 353: ldc2_w 8237602896978899237
      // 356: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 359: castore
      // 35a: bipush 1
      // 35b: istore 8
      // 35d: aload 2
      // 35e: ifnonnull 3ce
      // 361: iinc 5 1
      // 364: aload 2
      // 365: ifnull 3cb
      // 368: goto 36f
      // 36b: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36e: athrow
      // 36f: iload 5
      // 371: goto 378
      // 374: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 377: athrow
      // 378: aload 0
      // 379: getfield com/finalshell/io/YM3.U [C
      // 37c: arraylength
      // 37d: if_icmple 38d
      // 380: aload 0
      // 381: iload 5
      // 383: invokevirtual com/finalshell/io/YM3.L (I)V
      // 386: goto 38d
      // 389: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: aload 0
      // 38e: iload 5
      // 390: putfield com/finalshell/io/YM3.c I
      // 393: aload 0
      // 394: getfield com/finalshell/io/YM3.U [C
      // 397: iload 9
      // 399: bipush 1
      // 39a: iadd
      // 39b: aload 0
      // 39c: getfield com/finalshell/io/YM3.U [C
      // 39f: iload 9
      // 3a1: bipush 2
      // 3a2: iadd
      // 3a3: iload 7
      // 3a5: iload 9
      // 3a7: isub
      // 3a8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3ab: aload 0
      // 3ac: getfield com/finalshell/io/YM3.U [C
      // 3af: iload 9
      // 3b1: sipush 29331
      // 3b4: ldc2_w 5838482518343647551
      // 3b7: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3ba: castore
      // 3bb: aload 0
      // 3bc: getfield com/finalshell/io/YM3.U [C
      // 3bf: iinc 9 1
      // 3c2: iload 9
      // 3c4: getstatic com/finalshell/core/S7.Q [C
      // 3c7: iload 10
      // 3c9: caload
      // 3ca: castore
      // 3cb: iinc 7 1
      // 3ce: iinc 9 1
      // 3d1: aload 2
      // 3d2: ifnonnull 25f
      // 3d5: aload 0
      // 3d6: getfield com/finalshell/io/YM3.U [C
      // 3d9: iload 5
      // 3db: bipush 1
      // 3dc: isub
      // 3dd: sipush 2562
      // 3e0: ldc2_w 8714183661880932788
      // 3e3: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 3e6: castore
      // 3e7: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void flush() {
      String var1 = Nv4.o();

      IOException var6;
      label38: {
         label33: {
            try {
               var10000 = this.j;
               if (var1 == null) {
                  break label33;
               }

               if (this.j == null) {
                  return;
               }
            } catch (IOException var5) {
               throw a(var5);
            }

            try {
               this.j.write(this.U, 0, this.c);
               var10000 = this.j;
            } catch (IOException var4) {
               var6 = var4;
               boolean var10001 = false;
               break label38;
            }
         }

         try {
            var10000.flush();
         } catch (IOException var3) {
            var6 = var3;
            boolean var7 = false;
            break label38;
         }

         this.c = 0;
         return;
      }

      IOException var2 = var6;
      throw new Hi2(var2.getMessage(), var2);
   }

   /** @deprecated */
   public void w$void() {
      this.c = 0;
   }

   public Writer append$Writer(char var1) throws IOException {
      return this.T(var1);
   }

   public Writer append$Writer(CharSequence var1, int var2, int var3) throws IOException {
      return this.G(var1, var2, var3);
   }

   public Writer append$Writer(CharSequence var1) throws IOException {
      return this.q(var1);
   }

   public Appendable append$Appendable(char var1) throws IOException {
      return this.T(var1);
   }

   public Appendable append$Appendable(CharSequence var1, int var2, int var3) throws IOException {
      return this.G(var1, var2, var3);
   }

   public Appendable append$Appendable(CharSequence var1) throws IOException {
      return this.q(var1);
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -18215) & 65535;
      if (f[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 111;
               break;
            case 1:
               var10000 = 87;
               break;
            case 2:
               var10000 = 54;
               break;
            case 3:
               var10000 = 145;
               break;
            case 4:
               var10000 = 196;
               break;
            case 5:
               var10000 = 46;
               break;
            case 6:
               var10000 = 235;
               break;
            case 7:
               var10000 = 210;
               break;
            case 8:
               var10000 = 255;
               break;
            case 9:
               var10000 = 137;
               break;
            case 10:
               var10000 = 190;
               break;
            case 11:
               var10000 = 17;
               break;
            case 12:
               var10000 = 213;
               break;
            case 13:
               var10000 = 59;
               break;
            case 14:
               var10000 = 222;
               break;
            case 15:
               var10000 = 4;
               break;
            case 16:
               var10000 = 144;
               break;
            case 17:
               var10000 = 226;
               break;
            case 18:
               var10000 = 119;
               break;
            case 19:
               var10000 = 101;
               break;
            case 20:
               var10000 = 15;
               break;
            case 21:
               var10000 = 66;
               break;
            case 22:
               var10000 = 21;
               break;
            case 23:
               var10000 = 29;
               break;
            case 24:
               var10000 = 252;
               break;
            case 25:
               var10000 = 13;
               break;
            case 26:
               var10000 = 139;
               break;
            case 27:
               var10000 = 193;
               break;
            case 28:
               var10000 = 130;
               break;
            case 29:
               var10000 = 88;
               break;
            case 30:
               var10000 = 187;
               break;
            case 31:
               var10000 = 223;
               break;
            case 32:
               var10000 = 120;
               break;
            case 33:
               var10000 = 228;
               break;
            case 34:
               var10000 = 79;
               break;
            case 35:
               var10000 = 182;
               break;
            case 36:
               var10000 = 40;
               break;
            case 37:
               var10000 = 22;
               break;
            case 38:
               var10000 = 90;
               break;
            case 39:
               var10000 = 47;
               break;
            case 40:
               var10000 = 136;
               break;
            case 41:
               var10000 = 93;
               break;
            case 42:
               var10000 = 105;
               break;
            case 43:
               var10000 = 67;
               break;
            case 44:
               var10000 = 203;
               break;
            case 45:
               var10000 = 178;
               break;
            case 46:
               var10000 = 244;
               break;
            case 47:
               var10000 = 216;
               break;
            case 48:
               var10000 = 122;
               break;
            case 49:
               var10000 = 118;
               break;
            case 50:
               var10000 = 76;
               break;
            case 51:
               var10000 = 162;
               break;
            case 52:
               var10000 = 19;
               break;
            case 53:
               var10000 = 240;
               break;
            case 54:
               var10000 = 84;
               break;
            case 55:
               var10000 = 126;
               break;
            case 56:
               var10000 = 94;
               break;
            case 57:
               var10000 = 127;
               break;
            case 58:
               var10000 = 103;
               break;
            case 59:
               var10000 = 100;
               break;
            case 60:
               var10000 = 229;
               break;
            case 61:
               var10000 = 231;
               break;
            case 62:
               var10000 = 50;
               break;
            case 63:
               var10000 = 27;
               break;
            case 64:
               var10000 = 10;
               break;
            case 65:
               var10000 = 24;
               break;
            case 66:
               var10000 = 249;
               break;
            case 67:
               var10000 = 32;
               break;
            case 68:
               var10000 = 89;
               break;
            case 69:
               var10000 = 129;
               break;
            case 70:
               var10000 = 124;
               break;
            case 71:
               var10000 = 58;
               break;
            case 72:
               var10000 = 208;
               break;
            case 73:
               var10000 = 52;
               break;
            case 74:
               var10000 = 138;
               break;
            case 75:
               var10000 = 7;
               break;
            case 76:
               var10000 = 3;
               break;
            case 77:
               var10000 = 82;
               break;
            case 78:
               var10000 = 98;
               break;
            case 79:
               var10000 = 68;
               break;
            case 80:
               var10000 = 167;
               break;
            case 81:
               var10000 = 110;
               break;
            case 82:
               var10000 = 69;
               break;
            case 83:
               var10000 = 65;
               break;
            case 84:
               var10000 = 151;
               break;
            case 85:
               var10000 = 44;
               break;
            case 86:
               var10000 = 104;
               break;
            case 87:
               var10000 = 85;
               break;
            case 88:
               var10000 = 232;
               break;
            case 89:
               var10000 = 207;
               break;
            case 90:
               var10000 = 96;
               break;
            case 91:
               var10000 = 30;
               break;
            case 92:
               var10000 = 25;
               break;
            case 93:
               var10000 = 215;
               break;
            case 94:
               var10000 = 245;
               break;
            case 95:
               var10000 = 20;
               break;
            case 96:
               var10000 = 197;
               break;
            case 97:
               var10000 = 214;
               break;
            case 98:
               var10000 = 180;
               break;
            case 99:
               var10000 = 172;
               break;
            case 100:
               var10000 = 225;
               break;
            case 101:
               var10000 = 80;
               break;
            case 102:
               var10000 = 131;
               break;
            case 103:
               var10000 = 57;
               break;
            case 104:
               var10000 = 91;
               break;
            case 105:
               var10000 = 233;
               break;
            case 106:
               var10000 = 45;
               break;
            case 107:
               var10000 = 125;
               break;
            case 108:
               var10000 = 95;
               break;
            case 109:
               var10000 = 205;
               break;
            case 110:
               var10000 = 200;
               break;
            case 111:
               var10000 = 35;
               break;
            case 112:
               var10000 = 74;
               break;
            case 113:
               var10000 = 34;
               break;
            case 114:
               var10000 = 147;
               break;
            case 115:
               var10000 = 108;
               break;
            case 116:
               var10000 = 115;
               break;
            case 117:
               var10000 = 230;
               break;
            case 118:
               var10000 = 132;
               break;
            case 119:
               var10000 = 61;
               break;
            case 120:
               var10000 = 168;
               break;
            case 121:
               var10000 = 134;
               break;
            case 122:
               var10000 = 192;
               break;
            case 123:
               var10000 = 62;
               break;
            case 124:
               var10000 = 41;
               break;
            case 125:
               var10000 = 2;
               break;
            case 126:
               var10000 = 42;
               break;
            case 127:
               var10000 = 241;
               break;
            case 128:
               var10000 = 238;
               break;
            case 129:
               var10000 = 251;
               break;
            case 130:
               var10000 = 72;
               break;
            case 131:
               var10000 = 254;
               break;
            case 132:
               var10000 = 51;
               break;
            case 133:
               var10000 = 156;
               break;
            case 134:
               var10000 = 189;
               break;
            case 135:
               var10000 = 18;
               break;
            case 136:
               var10000 = 86;
               break;
            case 137:
               var10000 = 243;
               break;
            case 138:
               var10000 = 64;
               break;
            case 139:
               var10000 = 169;
               break;
            case 140:
               var10000 = 221;
               break;
            case 141:
               var10000 = 179;
               break;
            case 142:
               var10000 = 75;
               break;
            case 143:
               var10000 = 26;
               break;
            case 144:
               var10000 = 39;
               break;
            case 145:
               var10000 = 247;
               break;
            case 146:
               var10000 = 143;
               break;
            case 147:
               var10000 = 23;
               break;
            case 148:
               var10000 = 36;
               break;
            case 149:
               var10000 = 224;
               break;
            case 150:
               var10000 = 107;
               break;
            case 151:
               var10000 = 202;
               break;
            case 152:
               var10000 = 123;
               break;
            case 153:
               var10000 = 227;
               break;
            case 154:
               var10000 = 212;
               break;
            case 155:
               var10000 = 1;
               break;
            case 156:
               var10000 = 176;
               break;
            case 157:
               var10000 = 186;
               break;
            case 158:
               var10000 = 11;
               break;
            case 159:
               var10000 = 16;
               break;
            case 160:
               var10000 = 157;
               break;
            case 161:
               var10000 = 149;
               break;
            case 162:
               var10000 = 161;
               break;
            case 163:
               var10000 = 166;
               break;
            case 164:
               var10000 = 56;
               break;
            case 165:
               var10000 = 181;
               break;
            case 166:
               var10000 = 160;
               break;
            case 167:
               var10000 = 73;
               break;
            case 168:
               var10000 = 109;
               break;
            case 169:
               var10000 = 250;
               break;
            case 170:
               var10000 = 55;
               break;
            case 171:
               var10000 = 141;
               break;
            case 172:
               var10000 = 5;
               break;
            case 173:
               var10000 = 206;
               break;
            case 174:
               var10000 = 78;
               break;
            case 175:
               var10000 = 174;
               break;
            case 176:
               var10000 = 112;
               break;
            case 177:
               var10000 = 48;
               break;
            case 178:
               var10000 = 234;
               break;
            case 179:
               var10000 = 114;
               break;
            case 180:
               var10000 = 70;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 77;
               break;
            case 183:
               var10000 = 246;
               break;
            case 184:
               var10000 = 31;
               break;
            case 185:
               var10000 = 92;
               break;
            case 186:
               var10000 = 43;
               break;
            case 187:
               var10000 = 140;
               break;
            case 188:
               var10000 = 237;
               break;
            case 189:
               var10000 = 159;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 81;
               break;
            case 192:
               var10000 = 209;
               break;
            case 193:
               var10000 = 106;
               break;
            case 194:
               var10000 = 63;
               break;
            case 195:
               var10000 = 195;
               break;
            case 196:
               var10000 = 152;
               break;
            case 197:
               var10000 = 191;
               break;
            case 198:
               var10000 = 28;
               break;
            case 199:
               var10000 = 146;
               break;
            case 200:
               var10000 = 9;
               break;
            case 201:
               var10000 = 184;
               break;
            case 202:
               var10000 = 53;
               break;
            case 203:
               var10000 = 218;
               break;
            case 204:
               var10000 = 6;
               break;
            case 205:
               var10000 = 150;
               break;
            case 206:
               var10000 = 154;
               break;
            case 207:
               var10000 = 201;
               break;
            case 208:
               var10000 = 219;
               break;
            case 209:
               var10000 = 135;
               break;
            case 210:
               var10000 = 242;
               break;
            case 211:
               var10000 = 0;
               break;
            case 212:
               var10000 = 99;
               break;
            case 213:
               var10000 = 248;
               break;
            case 214:
               var10000 = 188;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 71;
               break;
            case 217:
               var10000 = 8;
               break;
            case 218:
               var10000 = 171;
               break;
            case 219:
               var10000 = 83;
               break;
            case 220:
               var10000 = 204;
               break;
            case 221:
               var10000 = 239;
               break;
            case 222:
               var10000 = 165;
               break;
            case 223:
               var10000 = 155;
               break;
            case 224:
               var10000 = 121;
               break;
            case 225:
               var10000 = 14;
               break;
            case 226:
               var10000 = 163;
               break;
            case 227:
               var10000 = 185;
               break;
            case 228:
               var10000 = 97;
               break;
            case 229:
               var10000 = 37;
               break;
            case 230:
               var10000 = 199;
               break;
            case 231:
               var10000 = 175;
               break;
            case 232:
               var10000 = 116;
               break;
            case 233:
               var10000 = 170;
               break;
            case 234:
               var10000 = 153;
               break;
            case 235:
               var10000 = 142;
               break;
            case 236:
               var10000 = 49;
               break;
            case 237:
               var10000 = 177;
               break;
            case 238:
               var10000 = 164;
               break;
            case 239:
               var10000 = 148;
               break;
            case 240:
               var10000 = 194;
               break;
            case 241:
               var10000 = 12;
               break;
            case 242:
               var10000 = 173;
               break;
            case 243:
               var10000 = 158;
               break;
            case 244:
               var10000 = 117;
               break;
            case 245:
               var10000 = 33;
               break;
            case 246:
               var10000 = 113;
               break;
            case 247:
               var10000 = 102;
               break;
            case 248:
               var10000 = 253;
               break;
            case 249:
               var10000 = 133;
               break;
            case 250:
               var10000 = 60;
               break;
            case 251:
               var10000 = 220;
               break;
            case 252:
               var10000 = 217;
               break;
            case 253:
               var10000 = 128;
               break;
            case 254:
               var10000 = 183;
               break;
            default:
               var10000 = 236;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29573;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 8281) & 32767;
      if (m[var3] == null) {
         m[var3] = k[var3] ^ var1;
      }

      return m[var3];
   }

   public static void __vfClinit__() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 23
      // 002: anewarray 225
      // 005: astore 21
      // 007: bipush 0
      // 008: istore 19
      // 00a: ldc_w "Ï\u0081\u0004 x¬á\u00042|¾\u008f\u0016}\u0094\u0087q,\u0007\u001f\u001e\u000eUßZøS\u0088Dã5ekvå\u0005\"\u008aõ6Ê\u000b¹ûùfï$É\u0099º%Æ\u0005Pù»X\u0003\u0005\u009d0}¬é\u0002Âf\u000f*³Âg\u0089\n\u0005\u008faQ×NÅÛ\u0093%'Àüá2z¿H\\k~Á\u000b÷\u0097Ù)î<\u0016?â[7Óä»ÊåsYÆP\u001c\u0004øé\u0007h~É9ô\u008dG\u0014\u000bh¬x\"&û?\u0014×ÛgÐ:\"H×¹©^\u0006¦M¿69,\u0012t\u0084=\u0084ùÓ,×¢\u0015¬\t×áBÍ\u0002'\u0005ê\u0088%Ç\r\u0002£\u0086$Ùç\u0095\u009c5t3a@\u008bßî5]\u0012\u0005®ØbãÏ!;îñõÆ+\u0098gdúÝCo\u0012\u0017\u0011:µ¶¹\u009cf.Þ\u0012È\u009f \u0003\u0013Âx\u0093²{ªü6\u000f¬K\u0012x\u0093éFó\tÞÚ¿då§\u0004DÌ0w"
      // 00d: dup
      // 00e: astore 18
      // 010: invokevirtual java/lang/String.length ()I
      // 013: istore 20
      // 015: bipush 2
      // 016: istore 17
      // 018: bipush -1
      // 019: istore 16
      // 01b: bipush 5
      // 01c: iinc 16 1
      // 01f: aload 18
      // 021: iload 16
      // 023: dup
      // 024: iload 17
      // 026: iadd
      // 027: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 02a: bipush -1
      // 02b: goto 0a8
      // 02e: aload 21
      // 030: swap
      // 031: iload 19
      // 033: iinc 19 1
      // 036: swap
      // 037: aastore
      // 038: iload 16
      // 03a: iload 17
      // 03c: iadd
      // 03d: dup
      // 03e: istore 16
      // 040: iload 20
      // 042: if_icmpge 051
      // 045: aload 18
      // 047: iload 16
      // 049: invokevirtual java/lang/String.charAt (I)C
      // 04c: istore 17
      // 04e: goto 01b
      // 051: ldc_w "ôè\u0005\u008e¢¯|\u0018"
      // 054: dup
      // 055: astore 18
      // 057: invokevirtual java/lang/String.length ()I
      // 05a: istore 20
      // 05c: bipush 2
      // 05d: istore 17
      // 05f: bipush -1
      // 060: istore 16
      // 062: bipush 3
      // 063: iinc 16 1
      // 066: aload 18
      // 068: iload 16
      // 06a: dup
      // 06b: iload 17
      // 06d: iadd
      // 06e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 071: bipush 0
      // 072: goto 0a8
      // 075: aload 21
      // 077: swap
      // 078: iload 19
      // 07a: iinc 19 1
      // 07d: swap
      // 07e: aastore
      // 07f: iload 16
      // 081: iload 17
      // 083: iadd
      // 084: dup
      // 085: istore 16
      // 087: iload 20
      // 089: if_icmpge 098
      // 08c: aload 18
      // 08e: iload 16
      // 090: invokevirtual java/lang/String.charAt (I)C
      // 093: istore 17
      // 095: goto 062
      // 098: aload 21
      // 09a: putstatic com/finalshell/io/YM3.a [Ljava/lang/String;
      // 09d: bipush 23
      // 09f: anewarray 225
      // 0a2: putstatic com/finalshell/io/YM3.f [Ljava/lang/String;
      // 0a5: goto 144
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokevirtual java/lang/String.toCharArray ()[C
      // 0ad: dup_x1
      // 0ae: arraylength
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: bipush 0
      // 0b2: istore 22
      // 0b4: dup2_x1
      // 0b5: pop2
      // 0b6: dup_x2
      // 0b7: bipush 1
      // 0b8: if_icmpgt 11c
      // 0bb: dup2
      // 0bc: swap
      // 0bd: iload 22
      // 0bf: dup2_x1
      // 0c0: caload
      // 0c1: swap
      // 0c2: iload 22
      // 0c4: bipush 7
      // 0c6: irem
      // 0c7: tableswitch 67 0 5 37 42 47 52 57 62
      // 0ec: bipush 21
      // 0ee: goto 10c
      // 0f1: bipush 77
      // 0f3: goto 10c
      // 0f6: bipush 112
      // 0f8: goto 10c
      // 0fb: bipush 85
      // 0fd: goto 10c
      // 100: bipush 91
      // 102: goto 10c
      // 105: bipush 97
      // 107: goto 10c
      // 10a: bipush 19
      // 10c: ixor
      // 10d: ixor
      // 10e: i2c
      // 10f: castore
      // 110: iinc 22 1
      // 113: dup
      // 114: ifne 11c
      // 117: dup2
      // 118: dup_x1
      // 119: goto 0bf
      // 11c: dup2_x1
      // 11d: pop2
      // 11e: dup_x2
      // 11f: iload 22
      // 121: if_icmpgt 0bb
      // 124: pop
      // 125: new java/lang/String
      // 128: dup_x1
      // 129: swap
      // 12a: invokespecial java/lang/String.<init> ([C)V
      // 12d: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 130: swap
      // 131: pop
      // 132: swap
      // 133: tableswitch -261 0 0 -190
      // 144: ldc2_w 3331611459314207061
      // 147: lstore 8
      // 149: bipush 92
      // 14b: newarray 11
      // 14d: astore 14
      // 14f: bipush 0
      // 150: istore 11
      // 152: ldc_w "\r\u0014£ïÝK%#\u001eóo¬\u001f4\u007f\u008dà|\u009eïÝªeC?s¡\u001fë®Au>DÜlc«@Lü\u008c\u000bÛ\u0001 ¨ê\u0090á«øÚ\u0081ø]àF)YÏæCsu6zNÓü\u0098¡\u0091ëÜ)É\u001d&ÇBV\u000eàs\"'6kq\n£GÖG6\u0010h^@Dc§yý\u001c#Ý\u0007B§âý\u0016/ÚåD\u000e½\u008fÈ\u0018\u000f`Fÿ\u001fðD`¨£\u00869Îä¦½G\u0000Ow¹ D8\fgÍ^ê(zzW÷d\tÌ©\u00ad\u000fûYÝí°\u000eÀæ\u0012l2á,JÒ@¡'*à÷êáÜ\u0019pEUcm A\u0018\u008eê/ûs\u009c\u009c\u001e/ñÝÈWó\u0083\u000f»Ùðºrº/\u0097vàñ+\u0011{_ÿÅ\n\u0093\u0099¼Ëp\u0016¥=\u0086ÍWö\u0000\u0012bP\u0010ây[«©\u009a\u009a¡\u0019\u0004Û\u0013\u008d°&ój&`¡Õù;1\u009c\u001b³ÿ)÷á\u00adÇØó©rÚÔ_f\"ï\u008b\u0001ë\u0011\u00042-fÌÅ\u0010\u008c÷óÈf×À\u0003Ô§\u001f'ó¬\u001c'ú\u0080 \u0092ïµÂ¨6-\u0000A5Å\u0015Ï8È6\u0093è¿0\u0004\u0011\u0092{¹Àó»1\bæ2¡è\u0006\u000bD%N O¢,\u009b{¯\u0098\u0017Á¼)²¥'\u009cÓß×¼ilzOÌdE\u0091\u008dð¬}W\u0007Þ]\u0088\u0097£5u7l \u001b\u009f1ïà\t¨\u0012À\u0093ç°Û\u0099qm\u0097ðneq\b\u0099KcxU`|r\u009d\u0019\"x\u008d9w\u0019\u0001à~*»òã\b\u000f\u0084\u0000Ãb¾Â<&¹f\u000fØ\u0087ÓóÞ\"\u001cä\u0000\u0005d\u0080Ö@þãté2*2È:Ù\u008d\u001eEßÅç\u00122\"s\u0081AÍUû\u0011\u0000\u0011+À\u0092¨[\u000bç\u0012øM×\u0007ßûÔ\u0091\u009c/\u000e¥\rI~ðÚ\u008d\u0096öÎ8\u00adw\u0001âÊ¡^9\u008f§,íxfP` ¾*\u0002M\u009fù$Í\u009f\u0097\fê\tfïÚyñ\u008f:\u001d\u0085×ög</ÅÐk\u0087t®\tÄzdiÑ,¸Wß\u0084L×O~\u0015yÅ©\u0006ÿZ³vá°C\u0000É\u0095¯\bW=±æ°ÏW1\u0085qDå´\u008ePè\u008fÓ\bK\u0098\u0013(\u0086¾%mõ\u000bCVªQßPÒíäß\rüx}Ç\f\u0089r¢\u0002fØôï{! \rQ´\u008c£HNW\u0085.\u001f\u0000\u009eæYE\u000fV®qÒ\\q\u0083ÓO·Lóg\u0086¿\u0007¤»ì\u008eª1Åq¸\u008dàa@2\\ù"
      // 155: dup
      // 156: astore 12
      // 158: invokevirtual java/lang/String.length ()I
      // 15b: istore 13
      // 15d: bipush 0
      // 15e: istore 10
      // 160: aload 12
      // 162: iload 10
      // 164: iinc 10 8
      // 167: iload 10
      // 169: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 16c: ldc_w "ISO-8859-1"
      // 16f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 172: astore 15
      // 174: aload 14
      // 176: iload 11
      // 178: iinc 11 1
      // 17b: aload 15
      // 17d: bipush 0
      // 17e: baload
      // 17f: i2l
      // 180: ldc2_w 255
      // 183: land
      // 184: bipush 56
      // 186: lshl
      // 187: aload 15
      // 189: bipush 1
      // 18a: baload
      // 18b: i2l
      // 18c: ldc2_w 255
      // 18f: land
      // 190: bipush 48
      // 192: lshl
      // 193: lor
      // 194: aload 15
      // 196: bipush 2
      // 197: baload
      // 198: i2l
      // 199: ldc2_w 255
      // 19c: land
      // 19d: bipush 40
      // 19f: lshl
      // 1a0: lor
      // 1a1: aload 15
      // 1a3: bipush 3
      // 1a4: baload
      // 1a5: i2l
      // 1a6: ldc2_w 255
      // 1a9: land
      // 1aa: bipush 32
      // 1ac: lshl
      // 1ad: lor
      // 1ae: aload 15
      // 1b0: bipush 4
      // 1b1: baload
      // 1b2: i2l
      // 1b3: ldc2_w 255
      // 1b6: land
      // 1b7: bipush 24
      // 1b9: lshl
      // 1ba: lor
      // 1bb: aload 15
      // 1bd: bipush 5
      // 1be: baload
      // 1bf: i2l
      // 1c0: ldc2_w 255
      // 1c3: land
      // 1c4: bipush 16
      // 1c6: lshl
      // 1c7: lor
      // 1c8: aload 15
      // 1ca: bipush 6
      // 1cc: baload
      // 1cd: i2l
      // 1ce: ldc2_w 255
      // 1d1: land
      // 1d2: bipush 8
      // 1d4: lshl
      // 1d5: lor
      // 1d6: aload 15
      // 1d8: bipush 7
      // 1da: baload
      // 1db: i2l
      // 1dc: ldc2_w 255
      // 1df: land
      // 1e0: lor
      // 1e1: bipush -1
      // 1e2: goto 298
      // 1e5: lastore
      // 1e6: iload 10
      // 1e8: iload 13
      // 1ea: if_icmplt 160
      // 1ed: ldc_w "¬BL\b¦{\u0098\u0085 2g-Xôb\u0016"
      // 1f0: dup
      // 1f1: astore 12
      // 1f3: invokevirtual java/lang/String.length ()I
      // 1f6: istore 13
      // 1f8: bipush 0
      // 1f9: istore 10
      // 1fb: aload 12
      // 1fd: iload 10
      // 1ff: iinc 10 8
      // 202: iload 10
      // 204: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 207: ldc_w "ISO-8859-1"
      // 20a: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 20d: astore 15
      // 20f: aload 14
      // 211: iload 11
      // 213: iinc 11 1
      // 216: aload 15
      // 218: bipush 0
      // 219: baload
      // 21a: i2l
      // 21b: ldc2_w 255
      // 21e: land
      // 21f: bipush 56
      // 221: lshl
      // 222: aload 15
      // 224: bipush 1
      // 225: baload
      // 226: i2l
      // 227: ldc2_w 255
      // 22a: land
      // 22b: bipush 48
      // 22d: lshl
      // 22e: lor
      // 22f: aload 15
      // 231: bipush 2
      // 232: baload
      // 233: i2l
      // 234: ldc2_w 255
      // 237: land
      // 238: bipush 40
      // 23a: lshl
      // 23b: lor
      // 23c: aload 15
      // 23e: bipush 3
      // 23f: baload
      // 240: i2l
      // 241: ldc2_w 255
      // 244: land
      // 245: bipush 32
      // 247: lshl
      // 248: lor
      // 249: aload 15
      // 24b: bipush 4
      // 24c: baload
      // 24d: i2l
      // 24e: ldc2_w 255
      // 251: land
      // 252: bipush 24
      // 254: lshl
      // 255: lor
      // 256: aload 15
      // 258: bipush 5
      // 259: baload
      // 25a: i2l
      // 25b: ldc2_w 255
      // 25e: land
      // 25f: bipush 16
      // 261: lshl
      // 262: lor
      // 263: aload 15
      // 265: bipush 6
      // 267: baload
      // 268: i2l
      // 269: ldc2_w 255
      // 26c: land
      // 26d: bipush 8
      // 26f: lshl
      // 270: lor
      // 271: aload 15
      // 273: bipush 7
      // 275: baload
      // 276: i2l
      // 277: ldc2_w 255
      // 27a: land
      // 27b: lor
      // 27c: bipush 0
      // 27d: goto 298
      // 280: lastore
      // 281: iload 10
      // 283: iload 13
      // 285: if_icmplt 1fb
      // 288: aload 14
      // 28a: putstatic com/finalshell/io/YM3.h [J
      // 28d: bipush 92
      // 28f: anewarray 774
      // 292: putstatic com/finalshell/io/YM3.i [Ljava/lang/Integer;
      // 295: goto 2b0
      // 298: dup_x2
      // 299: pop
      // 29a: lload 8
      // 29c: lxor
      // 29d: dup2_x1
      // 29e: pop2
      // 29f: tableswitch -186 0 0 -31
      // 2b0: ldc2_w 7228997096065170438
      // 2b3: lstore 0
      // 2b4: bipush 10
      // 2b6: newarray 11
      // 2b8: astore 6
      // 2ba: bipush 0
      // 2bb: istore 3
      // 2bc: ldc_w "-ãmyæG\u008doE\ráèXvÓ'[x\u0081\u000eÄN[ÞS\u0004tØóóh\u0083EoßÕ\u008bß\u0005qFÒ\u0090o²Eß\u0098°«Pc[]·\u0006»U»\bYÐÙ0"
      // 2bf: dup
      // 2c0: astore 4
      // 2c2: invokevirtual java/lang/String.length ()I
      // 2c5: istore 5
      // 2c7: bipush 0
      // 2c8: istore 2
      // 2c9: aload 4
      // 2cb: iload 2
      // 2cc: iinc 2 8
      // 2cf: iload 2
      // 2d0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2d3: ldc_w "ISO-8859-1"
      // 2d6: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 2d9: astore 7
      // 2db: aload 6
      // 2dd: iload 3
      // 2de: iinc 3 1
      // 2e1: aload 7
      // 2e3: bipush 0
      // 2e4: baload
      // 2e5: i2l
      // 2e6: ldc2_w 255
      // 2e9: land
      // 2ea: bipush 56
      // 2ec: lshl
      // 2ed: aload 7
      // 2ef: bipush 1
      // 2f0: baload
      // 2f1: i2l
      // 2f2: ldc2_w 255
      // 2f5: land
      // 2f6: bipush 48
      // 2f8: lshl
      // 2f9: lor
      // 2fa: aload 7
      // 2fc: bipush 2
      // 2fd: baload
      // 2fe: i2l
      // 2ff: ldc2_w 255
      // 302: land
      // 303: bipush 40
      // 305: lshl
      // 306: lor
      // 307: aload 7
      // 309: bipush 3
      // 30a: baload
      // 30b: i2l
      // 30c: ldc2_w 255
      // 30f: land
      // 310: bipush 32
      // 312: lshl
      // 313: lor
      // 314: aload 7
      // 316: bipush 4
      // 317: baload
      // 318: i2l
      // 319: ldc2_w 255
      // 31c: land
      // 31d: bipush 24
      // 31f: lshl
      // 320: lor
      // 321: aload 7
      // 323: bipush 5
      // 324: baload
      // 325: i2l
      // 326: ldc2_w 255
      // 329: land
      // 32a: bipush 16
      // 32c: lshl
      // 32d: lor
      // 32e: aload 7
      // 330: bipush 6
      // 332: baload
      // 333: i2l
      // 334: ldc2_w 255
      // 337: land
      // 338: bipush 8
      // 33a: lshl
      // 33b: lor
      // 33c: aload 7
      // 33e: bipush 7
      // 340: baload
      // 341: i2l
      // 342: ldc2_w 255
      // 345: land
      // 346: lor
      // 347: bipush -1
      // 348: goto 3f8
      // 34b: lastore
      // 34c: iload 2
      // 34d: iload 5
      // 34f: if_icmplt 2c9
      // 352: ldc_w "=/\u0093]ª$[GÁý<zpÓ\u0018\u0015"
      // 355: dup
      // 356: astore 4
      // 358: invokevirtual java/lang/String.length ()I
      // 35b: istore 5
      // 35d: bipush 0
      // 35e: istore 2
      // 35f: aload 4
      // 361: iload 2
      // 362: iinc 2 8
      // 365: iload 2
      // 366: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 369: ldc_w "ISO-8859-1"
      // 36c: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 36f: astore 7
      // 371: aload 6
      // 373: iload 3
      // 374: iinc 3 1
      // 377: aload 7
      // 379: bipush 0
      // 37a: baload
      // 37b: i2l
      // 37c: ldc2_w 255
      // 37f: land
      // 380: bipush 56
      // 382: lshl
      // 383: aload 7
      // 385: bipush 1
      // 386: baload
      // 387: i2l
      // 388: ldc2_w 255
      // 38b: land
      // 38c: bipush 48
      // 38e: lshl
      // 38f: lor
      // 390: aload 7
      // 392: bipush 2
      // 393: baload
      // 394: i2l
      // 395: ldc2_w 255
      // 398: land
      // 399: bipush 40
      // 39b: lshl
      // 39c: lor
      // 39d: aload 7
      // 39f: bipush 3
      // 3a0: baload
      // 3a1: i2l
      // 3a2: ldc2_w 255
      // 3a5: land
      // 3a6: bipush 32
      // 3a8: lshl
      // 3a9: lor
      // 3aa: aload 7
      // 3ac: bipush 4
      // 3ad: baload
      // 3ae: i2l
      // 3af: ldc2_w 255
      // 3b2: land
      // 3b3: bipush 24
      // 3b5: lshl
      // 3b6: lor
      // 3b7: aload 7
      // 3b9: bipush 5
      // 3ba: baload
      // 3bb: i2l
      // 3bc: ldc2_w 255
      // 3bf: land
      // 3c0: bipush 16
      // 3c2: lshl
      // 3c3: lor
      // 3c4: aload 7
      // 3c6: bipush 6
      // 3c8: baload
      // 3c9: i2l
      // 3ca: ldc2_w 255
      // 3cd: land
      // 3ce: bipush 8
      // 3d0: lshl
      // 3d1: lor
      // 3d2: aload 7
      // 3d4: bipush 7
      // 3d6: baload
      // 3d7: i2l
      // 3d8: ldc2_w 255
      // 3db: land
      // 3dc: lor
      // 3dd: bipush 0
      // 3de: goto 3f8
      // 3e1: lastore
      // 3e2: iload 2
      // 3e3: iload 5
      // 3e5: if_icmplt 35f
      // 3e8: aload 6
      // 3ea: putstatic com/finalshell/io/YM3.k [J
      // 3ed: bipush 10
      // 3ef: anewarray 787
      // 3f2: putstatic com/finalshell/io/YM3.m [Ljava/lang/Long;
      // 3f5: goto 410
      // 3f8: dup_x2
      // 3f9: pop
      // 3fa: lload 0
      // 3fb: lxor
      // 3fc: dup2_x1
      // 3fd: pop2
      // 3fe: tableswitch -179 0 0 -29
      // 410: sipush -18218
      // 413: new java/lang/ThreadLocal
      // 416: dup
      // 417: invokespecial java/lang/ThreadLocal.<init> ()V
      // 41a: putstatic com/finalshell/io/YM3.l Ljava/lang/ThreadLocal;
      // 41d: sipush -3844
      // 420: new java/lang/ThreadLocal
      // 423: dup
      // 424: invokespecial java/lang/ThreadLocal.<init> ()V
      // 427: putstatic com/finalshell/io/YM3.C Ljava/lang/ThreadLocal;
      // 42a: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 42d: invokevirtual java/lang/String.toCharArray ()[C
      // 430: putstatic com/finalshell/io/YM3.G [C
      // 433: sipush 15393
      // 436: sipush -18220
      // 439: sipush -20263
      // 43c: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 43f: invokevirtual java/lang/String.toCharArray ()[C
      // 442: putstatic com/finalshell/io/YM3.F [C
      // 445: ldc2_w 3828479290448662507
      // 448: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 44b: putstatic com/finalshell/io/YM3.o I
      // 44e: sipush -18232
      // 451: sipush -31129
      // 454: invokestatic com/finalshell/io/YM3.a (II)Ljava/lang/String;
      // 457: invokestatic com/finalshell/core/S7.A (Ljava/lang/String;)Ljava/lang/String;
      // 45a: astore 23
      // 45c: aload 23
      // 45e: ifnull 4b0
      // 461: aload 23
      // 463: invokevirtual java/lang/String.length ()I
      // 466: ifle 4b0
      // 469: goto 470
      // 46c: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46f: athrow
      // 470: aload 23
      // 472: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 475: istore 24
      // 477: iload 24
      // 479: sipush 6005
      // 47c: ldc2_w 3649355536797459666
      // 47f: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 482: if_icmplt 4b0
      // 485: iload 24
      // 487: sipush 18359
      // 48a: ldc2_w 2731469808102421506
      // 48d: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 490: if_icmpgt 4b0
      // 493: goto 49a
      // 496: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 499: athrow
      // 49a: iload 24
      // 49c: sipush 7822
      // 49f: ldc2_w 9145469980189060440
      // 4a2: invokestatic com/finalshell/io/YM3.a (IJ)I
      // 4a5: imul
      // 4a6: putstatic com/finalshell/io/YM3.o I
      // 4a9: goto 4b0
      // 4ac: invokestatic com/finalshell/io/YM3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4af: athrow
      // 4b0: goto 4b5
      // 4b3: astore 23
      // 4b5: bipush 0
      // 4b6: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 4b9: getfield com/finalshell/ui/model/EP.mask I
      // 4bc: ior
      // 4bd: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 4c0: getfield com/finalshell/ui/model/EP.mask I
      // 4c3: ior
      // 4c4: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // 4c7: getfield com/finalshell/ui/model/EP.mask I
      // 4ca: ior
      // 4cb: getstatic com/finalshell/ui/model/EP.WriteEnumUsingToString Lcom/finalshell/ui/model/EP;
      // 4ce: getfield com/finalshell/ui/model/EP.mask I
      // 4d1: ior
      // 4d2: getstatic com/finalshell/ui/model/EP.WriteNonStringValueAsString Lcom/finalshell/ui/model/EP;
      // 4d5: getfield com/finalshell/ui/model/EP.mask I
      // 4d8: ior
      // 4d9: getstatic com/finalshell/ui/model/EP.WriteSlashAsSpecial Lcom/finalshell/ui/model/EP;
      // 4dc: getfield com/finalshell/ui/model/EP.mask I
      // 4df: ior
      // 4e0: getstatic com/finalshell/ui/model/EP.IgnoreErrorGetter Lcom/finalshell/ui/model/EP;
      // 4e3: getfield com/finalshell/ui/model/EP.mask I
      // 4e6: ior
      // 4e7: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 4ea: getfield com/finalshell/ui/model/EP.mask I
      // 4ed: ior
      // 4ee: getstatic com/finalshell/ui/model/EP.NotWriteDefaultValue Lcom/finalshell/ui/model/EP;
      // 4f1: getfield com/finalshell/ui/model/EP.mask I
      // 4f4: ior
      // 4f5: putstatic com/finalshell/io/YM3.b I
      // 4f8: return
   }
}





