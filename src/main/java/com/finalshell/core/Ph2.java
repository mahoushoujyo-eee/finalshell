package com.finalshell.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public class Ph2 implements Comparable {
   public final String I;
   public final Method Y;
   public final Field w;
   public int p;
   public final java.lang.Class O;
   public final Type a;
   public final java.lang.Class Q;
   public final boolean j;
   public final int c;
   public final int h;
   public final String N;
   public final E6 F;
   public final E6 A;
   public final boolean b;
   public final boolean Z;
   public final char[] L;
   public final boolean X;
   public final boolean s;
   public final boolean D;
   public final String J;
   public final String[] E;
   public final long x;
   public static int z;
   public static String[] d;
   public static String[] e;
   public static long[] f;
   public static Integer[] g;

   public Ph2(String param1, java.lang.Class param2, java.lang.Class param3, Type param4, Field param5, int param6, int param7, int param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: aload 0
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: istore 9
      // 009: aload 0
      // 00a: bipush 0
      // 00b: putfield com/finalshell/core/Ph2.p I
      // 00e: iload 9
      // 010: ifeq 05c
      // 013: iload 6
      // 015: ifge 022
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: bipush 0
      // 020: istore 6
      // 022: aload 0
      // 023: aload 1
      // 024: putfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 027: aload 0
      // 028: aload 2
      // 029: putfield com/finalshell/core/Ph2.Q Ljava/lang/Class;
      // 02c: aload 0
      // 02d: aload 3
      // 02e: putfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 031: aload 0
      // 032: aload 4
      // 034: putfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 037: aload 0
      // 038: aconst_null
      // 039: putfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 03c: aload 0
      // 03d: aload 5
      // 03f: putfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 042: aload 0
      // 043: iload 6
      // 045: putfield com/finalshell/core/Ph2.p I
      // 048: aload 0
      // 049: iload 7
      // 04b: putfield com/finalshell/core/Ph2.c I
      // 04e: aload 0
      // 04f: iload 8
      // 051: putfield com/finalshell/core/Ph2.h I
      // 054: aload 0
      // 055: aload 3
      // 056: invokevirtual java/lang/Class.isEnum ()Z
      // 059: putfield com/finalshell/core/Ph2.X Z
      // 05c: iload 9
      // 05e: ifeq 0bf
      // 061: aload 5
      // 063: ifnull 0b3
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 5
      // 06f: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 072: istore 10
      // 074: aload 0
      // 075: iload 10
      // 077: bipush 1
      // 078: iand
      // 079: iload 9
      // 07b: ifeq 09e
      // 07e: ifne 096
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 0
      // 089: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 08c: ifnonnull 0a1
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: bipush 1
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: goto 0a2
      // 0a1: bipush 0
      // 0a2: putfield com/finalshell/core/Ph2.b Z
      // 0a5: aload 0
      // 0a6: iload 10
      // 0a8: invokestatic java/lang/reflect/Modifier.isTransient (I)Z
      // 0ab: putfield com/finalshell/core/Ph2.Z Z
      // 0ae: iload 9
      // 0b0: ifne 0c4
      // 0b3: aload 0
      // 0b4: bipush 0
      // 0b5: putfield com/finalshell/core/Ph2.Z Z
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: bipush 0
      // 0c1: putfield com/finalshell/core/Ph2.b Z
      // 0c4: aload 0
      // 0c5: aload 0
      // 0c6: invokevirtual com/finalshell/core/Ph2.l ()[C
      // 0c9: putfield com/finalshell/core/Ph2.L [C
      // 0cc: iload 9
      // 0ce: ifeq 0ef
      // 0d1: aload 5
      // 0d3: ifnull 0e9
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 5
      // 0df: invokestatic com/finalshell/core/B8_2.P (Ljava/lang/reflect/AccessibleObject;)V
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: ldc ""
      // 0ec: putfield com/finalshell/core/Ph2.N Ljava/lang/String;
      // 0ef: aload 0
      // 0f0: aload 5
      // 0f2: iload 9
      // 0f4: ifeq 10b
      // 0f7: ifnonnull 109
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aconst_null
      // 102: goto 113
      // 105: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 5
      // 10b: ldc com/finalshell/core/E6
      // 10d: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 110: checkcast com/finalshell/core/E6
      // 113: putfield com/finalshell/core/Ph2.F Lcom/finalshell/core/E6;
      // 116: aload 0
      // 117: aconst_null
      // 118: putfield com/finalshell/core/Ph2.A Lcom/finalshell/core/E6;
      // 11b: aload 0
      // 11c: bipush 0
      // 11d: putfield com/finalshell/core/Ph2.j Z
      // 120: aload 0
      // 121: bipush 0
      // 122: putfield com/finalshell/core/Ph2.s Z
      // 125: aload 0
      // 126: bipush 0
      // 127: putfield com/finalshell/core/Ph2.D Z
      // 12a: aload 0
      // 12b: aconst_null
      // 12c: putfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 12f: aload 0
      // 130: bipush 0
      // 131: anewarray 133
      // 134: putfield com/finalshell/core/Ph2.E [Ljava/lang/String;
      // 137: aload 0
      // 138: aload 0
      // 139: aload 1
      // 13a: aload 0
      // 13b: getfield com/finalshell/core/Ph2.F Lcom/finalshell/core/E6;
      // 13e: invokespecial com/finalshell/core/Ph2.v (Ljava/lang/String;Lcom/finalshell/core/E6;)J
      // 141: putfield com/finalshell/core/Ph2.x J
      // 144: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 147: ifnull 159
      // 14a: iinc 9 1
      // 14d: iload 9
      // 14f: invokestatic com/finalshell/core/Ph2.S (I)V
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: return
   }

   public Ph2(String var1, Method var2, Field var3, java.lang.Class var4, Type var5, int var6, int var7, int var8, E6 var9, E6 var10, String var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, null);
   }

   public Ph2(
      String param1,
      Method param2,
      Field param3,
      java.lang.Class param4,
      Type param5,
      int param6,
      int param7,
      int param8,
      E6 param9,
      E6 param10,
      String param11,
      Map param12
   ) {
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
      // 004: invokestatic com/finalshell/core/Ph2.w ()I
      // 007: aload 0
      // 008: bipush 0
      // 009: putfield com/finalshell/core/Ph2.p I
      // 00c: istore 13
      // 00e: aload 3
      // 00f: iload 13
      // 011: ifeq 01f
      // 014: ifnull 03c
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 3
      // 01f: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // 022: astore 14
      // 024: aload 14
      // 026: aload 1
      // 027: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02a: iload 13
      // 02c: ifeq 03e
      // 02f: ifeq 03c
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 14
      // 03b: astore 1
      // 03c: iload 6
      // 03e: iload 13
      // 040: ifeq 04e
      // 043: ifge 050
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: bipush 0
      // 04e: istore 6
      // 050: aload 0
      // 051: aload 1
      // 052: putfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 055: aload 0
      // 056: aload 2
      // 057: putfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 05a: aload 0
      // 05b: aload 3
      // 05c: putfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 05f: aload 0
      // 060: iload 6
      // 062: putfield com/finalshell/core/Ph2.p I
      // 065: aload 0
      // 066: iload 7
      // 068: putfield com/finalshell/core/Ph2.c I
      // 06b: aload 0
      // 06c: iload 8
      // 06e: putfield com/finalshell/core/Ph2.h I
      // 071: aload 0
      // 072: aload 9
      // 074: putfield com/finalshell/core/Ph2.F Lcom/finalshell/core/E6;
      // 077: aload 0
      // 078: aload 10
      // 07a: putfield com/finalshell/core/Ph2.A Lcom/finalshell/core/E6;
      // 07d: iload 13
      // 07f: ifeq 110
      // 082: aload 3
      // 083: ifnull 10b
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 3
      // 08e: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 091: istore 14
      // 093: aload 0
      // 094: iload 14
      // 096: bipush 1
      // 097: iand
      // 098: iload 13
      // 09a: ifeq 0ba
      // 09d: ifne 0b2
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 2
      // 0a8: ifnonnull 0bd
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: bipush 1
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: goto 0be
      // 0bd: bipush 0
      // 0be: putfield com/finalshell/core/Ph2.b Z
      // 0c1: aload 0
      // 0c2: iload 14
      // 0c4: invokestatic java/lang/reflect/Modifier.isTransient (I)Z
      // 0c7: iload 13
      // 0c9: ifeq 0f1
      // 0cc: ifne 0f0
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: aload 2
      // 0d7: invokestatic com/finalshell/core/B8_2.w (Ljava/lang/reflect/Method;)Z
      // 0da: iload 13
      // 0dc: ifeq 0f1
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: ifeq 0f4
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: bipush 1
      // 0f1: goto 0f5
      // 0f4: bipush 0
      // 0f5: putfield com/finalshell/core/Ph2.Z Z
      // 0f8: iload 13
      // 0fa: ifne 118
      // 0fd: bipush 4
      // 0fe: anewarray 133
      // 101: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: aload 0
      // 10c: bipush 0
      // 10d: putfield com/finalshell/core/Ph2.b Z
      // 110: aload 0
      // 111: aload 2
      // 112: invokestatic com/finalshell/core/B8_2.w (Ljava/lang/reflect/Method;)Z
      // 115: putfield com/finalshell/core/Ph2.Z Z
      // 118: aload 11
      // 11a: iload 13
      // 11c: ifeq 12b
      // 11f: ifnull 143
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 11
      // 12b: invokevirtual java/lang/String.length ()I
      // 12e: ifle 143
      // 131: aload 0
      // 132: aload 11
      // 134: putfield com/finalshell/core/Ph2.N Ljava/lang/String;
      // 137: iload 13
      // 139: ifne 150
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 0
      // 144: ldc ""
      // 146: putfield com/finalshell/core/Ph2.N Ljava/lang/String;
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aconst_null
      // 151: astore 14
      // 153: aload 0
      // 154: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 157: astore 15
      // 159: aload 0
      // 15a: aload 0
      // 15b: aload 1
      // 15c: aload 15
      // 15e: invokespecial com/finalshell/core/Ph2.v (Ljava/lang/String;Lcom/finalshell/core/E6;)J
      // 161: putfield com/finalshell/core/Ph2.x J
      // 164: bipush 0
      // 165: istore 16
      // 167: iload 13
      // 169: ifeq 1c5
      // 16c: aload 15
      // 16e: ifnull 1bd
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: aload 15
      // 17a: invokeinterface com/finalshell/core/E6.q ()Ljava/lang/String; 1
      // 17f: astore 14
      // 181: aload 14
      // 183: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 186: invokevirtual java/lang/String.length ()I
      // 189: iload 13
      // 18b: ifeq 1a2
      // 18e: ifne 19b
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: aconst_null
      // 199: astore 14
      // 19b: aload 15
      // 19d: invokeinterface com/finalshell/core/E6.i ()Z 1
      // 1a2: istore 16
      // 1a4: aload 0
      // 1a5: aload 15
      // 1a7: invokeinterface com/finalshell/core/E6.t ()Z 1
      // 1ac: putfield com/finalshell/core/Ph2.D Z
      // 1af: aload 0
      // 1b0: aload 15
      // 1b2: invokeinterface com/finalshell/core/E6.X ()[Ljava/lang/String; 1
      // 1b7: putfield com/finalshell/core/Ph2.E [Ljava/lang/String;
      // 1ba: goto 1cd
      // 1bd: bipush 0
      // 1be: istore 16
      // 1c0: aload 0
      // 1c1: bipush 0
      // 1c2: putfield com/finalshell/core/Ph2.D Z
      // 1c5: aload 0
      // 1c6: bipush 0
      // 1c7: anewarray 133
      // 1ca: putfield com/finalshell/core/Ph2.E [Ljava/lang/String;
      // 1cd: aload 0
      // 1ce: aload 14
      // 1d0: putfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 1d3: aload 0
      // 1d4: aload 0
      // 1d5: invokevirtual com/finalshell/core/Ph2.l ()[C
      // 1d8: putfield com/finalshell/core/Ph2.L [C
      // 1db: aload 2
      // 1dc: iload 13
      // 1de: ifeq 1ec
      // 1e1: ifnull 1ef
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: aload 2
      // 1ec: invokestatic com/finalshell/core/B8_2.P (Ljava/lang/reflect/AccessibleObject;)V
      // 1ef: aload 3
      // 1f0: iload 13
      // 1f2: ifeq 200
      // 1f5: ifnull 203
      // 1f8: goto 1ff
      // 1fb: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: aload 3
      // 200: invokestatic com/finalshell/core/B8_2.P (Ljava/lang/reflect/AccessibleObject;)V
      // 203: bipush 0
      // 204: istore 17
      // 206: aload 2
      // 207: iload 13
      // 209: ifeq 217
      // 20c: ifnull 2bd
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: aload 2
      // 217: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 21a: dup
      // 21b: astore 20
      // 21d: arraylength
      // 21e: bipush 1
      // 21f: iload 13
      // 221: ifeq 258
      // 224: if_icmpne 241
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: aload 20
      // 230: bipush 0
      // 231: aaload
      // 232: astore 19
      // 234: aload 2
      // 235: invokevirtual java/lang/reflect/Method.getGenericParameterTypes ()[Ljava/lang/reflect/Type;
      // 238: bipush 0
      // 239: aaload
      // 23a: astore 18
      // 23c: iload 13
      // 23e: ifne 2b0
      // 241: aload 20
      // 243: iload 13
      // 245: ifeq 25d
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24e: athrow
      // 24f: arraylength
      // 250: bipush 2
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: if_icmpne 29a
      // 25b: aload 20
      // 25d: bipush 0
      // 25e: aaload
      // 25f: iload 13
      // 261: ifeq 2a5
      // 264: ldc java/lang/String
      // 266: if_acmpne 29a
      // 269: goto 270
      // 26c: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 20
      // 272: bipush 1
      // 273: aaload
      // 274: iload 13
      // 276: ifeq 2a5
      // 279: goto 280
      // 27c: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27f: athrow
      // 280: ldc java/lang/Object
      // 282: if_acmpne 29a
      // 285: goto 28c
      // 288: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28b: athrow
      // 28c: aload 20
      // 28e: bipush 0
      // 28f: aaload
      // 290: dup
      // 291: astore 19
      // 293: astore 18
      // 295: iload 13
      // 297: ifne 2b0
      // 29a: aload 2
      // 29b: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a4: athrow
      // 2a5: astore 19
      // 2a7: aload 2
      // 2a8: invokevirtual java/lang/reflect/Method.getGenericReturnType ()Ljava/lang/reflect/Type;
      // 2ab: astore 18
      // 2ad: bipush 1
      // 2ae: istore 17
      // 2b0: aload 0
      // 2b1: aload 2
      // 2b2: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 2b5: putfield com/finalshell/core/Ph2.Q Ljava/lang/Class;
      // 2b8: iload 13
      // 2ba: ifne 2da
      // 2bd: aload 3
      // 2be: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 2c1: astore 19
      // 2c3: aload 3
      // 2c4: invokevirtual java/lang/reflect/Field.getGenericType ()Ljava/lang/reflect/Type;
      // 2c7: astore 18
      // 2c9: aload 0
      // 2ca: aload 3
      // 2cb: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 2ce: putfield com/finalshell/core/Ph2.Q Ljava/lang/Class;
      // 2d1: aload 3
      // 2d2: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 2d5: invokestatic java/lang/reflect/Modifier.isFinal (I)Z
      // 2d8: istore 17
      // 2da: aload 0
      // 2db: iload 17
      // 2dd: putfield com/finalshell/core/Ph2.j Z
      // 2e0: aload 0
      // 2e1: iload 16
      // 2e3: ifeq 2fc
      // 2e6: aload 19
      // 2e8: ldc java/lang/String
      // 2ea: if_acmpne 2fc
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: bipush 1
      // 2f5: goto 2fd
      // 2f8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: bipush 0
      // 2fd: putfield com/finalshell/core/Ph2.s Z
      // 300: aload 4
      // 302: iload 13
      // 304: ifeq 388
      // 307: ifnull 386
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: aload 19
      // 313: iload 13
      // 315: ifeq 388
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: ldc java/lang/Object
      // 321: if_acmpne 386
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32a: athrow
      // 32b: aload 18
      // 32d: iload 13
      // 32f: ifeq 388
      // 332: goto 339
      // 335: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 338: athrow
      // 339: instanceof java/lang/reflect/TypeVariable
      // 33c: ifeq 386
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: aload 18
      // 348: checkcast java/lang/reflect/TypeVariable
      // 34b: astore 20
      // 34d: aload 4
      // 34f: aload 5
      // 351: aload 20
      // 353: invokestatic com/finalshell/core/Ph2.e (Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
      // 356: astore 21
      // 358: aload 21
      // 35a: iload 13
      // 35c: ifeq 398
      // 35f: ifnull 386
      // 362: goto 369
      // 365: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: aload 0
      // 36a: aload 21
      // 36c: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 36f: putfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 372: aload 0
      // 373: aload 21
      // 375: putfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 378: aload 0
      // 379: aload 19
      // 37b: invokevirtual java/lang/Class.isEnum ()Z
      // 37e: putfield com/finalshell/core/Ph2.X Z
      // 381: return
      // 382: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 385: athrow
      // 386: aload 18
      // 388: astore 20
      // 38a: iload 13
      // 38c: ifeq 439
      // 38f: aload 18
      // 391: goto 398
      // 394: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: instanceof java/lang/Class
      // 39b: ifne 424
      // 39e: aload 4
      // 3a0: aload 5
      // 3a2: iload 13
      // 3a4: ifeq 3ba
      // 3a7: goto 3ae
      // 3aa: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ad: athrow
      // 3ae: ifnull 3bd
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: aload 5
      // 3ba: goto 3bf
      // 3bd: aload 4
      // 3bf: aload 18
      // 3c1: aload 12
      // 3c3: invokestatic com/finalshell/core/Ph2.I (Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;
      // 3c6: astore 20
      // 3c8: iload 13
      // 3ca: ifeq 439
      // 3cd: aload 20
      // 3cf: aload 18
      // 3d1: if_acmpeq 424
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: aload 20
      // 3dd: instanceof java/lang/reflect/ParameterizedType
      // 3e0: iload 13
      // 3e2: ifeq 41a
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3eb: athrow
      // 3ec: ifeq 402
      // 3ef: goto 3f6
      // 3f2: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f5: athrow
      // 3f6: aload 20
      // 3f8: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 3fb: astore 19
      // 3fd: iload 13
      // 3ff: ifne 424
      // 402: aload 20
      // 404: iload 13
      // 406: ifeq 41f
      // 409: goto 410
      // 40c: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40f: athrow
      // 410: instanceof java/lang/Class
      // 413: goto 41a
      // 416: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 419: athrow
      // 41a: ifeq 424
      // 41d: aload 20
      // 41f: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 422: astore 19
      // 424: aload 0
      // 425: aload 20
      // 427: putfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 42a: aload 0
      // 42b: aload 19
      // 42d: putfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 430: aload 0
      // 431: aload 19
      // 433: invokevirtual java/lang/Class.isEnum ()Z
      // 436: putfield com/finalshell/core/Ph2.X Z
      // 439: return
   }

   public long v(String param1, E6 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 14
      // 09: ifnull 33
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 2
      // 14: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 19: iload 3
      // 1a: ifeq 34
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: ifeq 33
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokestatic com/finalshell/core/B8_2.o (Ljava/lang/String;)J
      // 2e: lreturn
      // 2f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 1
      // 34: invokestatic com/finalshell/core/B8_2.A$long (Ljava/lang/String;)J
      // 37: lreturn
   }

   public char[] l() {
      int var1 = this.I.length();
      char[] var2 = new char[var1 + 3];
      this.I.getChars(0, this.I.length(), var2, 1);
      var2[0] = (char)a(6529, 1377286997616063244L);
      var2[var1 + 1] = (char)a(19880, 2702823453134104358L);
      var2[var1 + 2] = (char)a(17537, 5716825889897000462L);
      return var2;
   }

   public Annotation m(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ldc com/finalshell/core/E6
      // 07: if_acmpne 13
      // 0a: aload 0
      // 0b: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 0e: areturn
      // 0f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aconst_null
      // 14: astore 3
      // 15: aload 0
      // 16: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 19: iload 2
      // 1a: ifne 32
      // 1d: ifnull 37
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 1
      // 33: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 36: astore 3
      // 37: aload 3
      // 38: iload 2
      // 39: ifne 70
      // 3c: ifnonnull 6f
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 4a: iload 2
      // 4b: ifne 6a
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: ifnull 6f
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 1
      // 6b: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 6e: astore 3
      // 6f: aload 3
      // 70: areturn
   }

   public static Type O(java.lang.Class var0, Type var1, Type var2) {
      return I(var0, var1, var2, null);
   }

   public static Type I(java.lang.Class param0, Type param1, Type param2, Map param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifeq 02d
      // 00b: ifnull 02c
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 1
      // 016: iload 4
      // 018: ifeq 02f
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: ifnonnull 02e
      // 025: goto 02c
      // 028: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aload 2
      // 02d: areturn
      // 02e: aload 2
      // 02f: instanceof java/lang/reflect/GenericArrayType
      // 032: iload 4
      // 034: ifeq 084
      // 037: ifeq 080
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: aload 2
      // 042: checkcast java/lang/reflect/GenericArrayType
      // 045: astore 5
      // 047: aload 5
      // 049: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 04e: astore 6
      // 050: aload 0
      // 051: aload 1
      // 052: aload 6
      // 054: aload 3
      // 055: invokestatic com/finalshell/core/Ph2.I (Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;
      // 058: astore 7
      // 05a: aload 6
      // 05c: iload 4
      // 05e: ifeq 07f
      // 061: aload 7
      // 063: if_acmpeq 07e
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 7
      // 06f: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 072: bipush 0
      // 073: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 076: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 079: astore 8
      // 07b: aload 8
      // 07d: areturn
      // 07e: aload 2
      // 07f: areturn
      // 080: aload 1
      // 081: invokestatic com/finalshell/core/B8_2.A (Ljava/lang/reflect/Type;)Z
      // 084: iload 4
      // 086: ifeq 09d
      // 089: ifne 099
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 2
      // 094: areturn
      // 095: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 2
      // 09a: instanceof java/lang/reflect/TypeVariable
      // 09d: iload 4
      // 09f: ifeq 128
      // 0a2: ifeq 118
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: invokestatic com/finalshell/core/B8_2.U (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 0b0: checkcast java/lang/reflect/ParameterizedType
      // 0b3: astore 5
      // 0b5: aload 5
      // 0b7: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 0ba: astore 6
      // 0bc: aload 2
      // 0bd: checkcast java/lang/reflect/TypeVariable
      // 0c0: astore 7
      // 0c2: aload 6
      // 0c4: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 0c7: astore 8
      // 0c9: bipush 0
      // 0ca: istore 9
      // 0cc: iload 9
      // 0ce: aload 8
      // 0d0: arraylength
      // 0d1: if_icmpge 118
      // 0d4: aload 8
      // 0d6: iload 9
      // 0d8: aaload
      // 0d9: iload 4
      // 0db: ifeq 10f
      // 0de: invokeinterface java/lang/reflect/TypeVariable.getName ()Ljava/lang/String; 1
      // 0e3: aload 7
      // 0e5: invokeinterface java/lang/reflect/TypeVariable.getName ()Ljava/lang/String; 1
      // 0ea: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ed: iload 4
      // 0ef: ifeq 128
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: ifeq 110
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: aload 5
      // 105: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 10a: iload 9
      // 10c: aaload
      // 10d: astore 2
      // 10e: aload 2
      // 10f: areturn
      // 110: iinc 9 1
      // 113: iload 4
      // 115: ifne 0cc
      // 118: aload 2
      // 119: iload 4
      // 11b: ifeq 1f9
      // 11e: instanceof java/lang/reflect/ParameterizedType
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: ifeq 1f8
      // 12b: aload 2
      // 12c: checkcast java/lang/reflect/ParameterizedType
      // 12f: astore 5
      // 131: aload 5
      // 133: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 138: astore 6
      // 13a: aload 6
      // 13c: aload 3
      // 13d: invokestatic com/finalshell/core/Ph2.Z ([Ljava/lang/reflect/Type;Ljava/util/Map;)Z
      // 140: istore 9
      // 142: iload 9
      // 144: iload 4
      // 146: ifeq 1d8
      // 149: ifne 1d6
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: aload 1
      // 154: instanceof java/lang/reflect/ParameterizedType
      // 157: iload 4
      // 159: ifeq 198
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: ifeq 17e
      // 166: goto 16d
      // 169: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: aload 1
      // 16e: checkcast java/lang/reflect/ParameterizedType
      // 171: astore 8
      // 173: aload 0
      // 174: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 177: astore 7
      // 179: iload 4
      // 17b: ifne 1c6
      // 17e: aload 0
      // 17f: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 182: iload 4
      // 184: ifeq 1a6
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: instanceof java/lang/reflect/ParameterizedType
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 197: athrow
      // 198: ifeq 1b9
      // 19b: aload 0
      // 19c: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: checkcast java/lang/reflect/ParameterizedType
      // 1a9: astore 8
      // 1ab: aload 0
      // 1ac: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 1af: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 1b2: astore 7
      // 1b4: iload 4
      // 1b6: ifne 1c6
      // 1b9: aload 5
      // 1bb: astore 8
      // 1bd: aload 1
      // 1be: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1c1: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 1c4: astore 7
      // 1c6: aload 6
      // 1c8: aload 7
      // 1ca: aload 8
      // 1cc: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 1d1: invokestatic com/finalshell/core/Ph2.y ([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z
      // 1d4: istore 9
      // 1d6: iload 9
      // 1d8: ifeq 1f8
      // 1db: new com/finalshell/core/HK
      // 1de: dup
      // 1df: aload 6
      // 1e1: aload 5
      // 1e3: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType ()Ljava/lang/reflect/Type; 1
      // 1e8: aload 5
      // 1ea: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 1ef: invokespecial com/finalshell/core/HK.<init> ([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
      // 1f2: invokestatic com/finalshell/core/HI.V (Lcom/finalshell/core/HK;)Ljava/lang/reflect/Type;
      // 1f5: astore 2
      // 1f6: aload 2
      // 1f7: areturn
      // 1f8: aload 2
      // 1f9: areturn
   }

   public static boolean Z(Type[] param0, Map param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifeq 014
      // 009: ifnull 027
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 1
      // 014: invokeinterface java/util/Map.size ()I 1
      // 019: iload 2
      // 01a: ifeq 02e
      // 01d: ifne 02d
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: bipush 0
      // 028: ireturn
      // 029: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 3
      // 02f: bipush 0
      // 030: istore 4
      // 032: iload 4
      // 034: aload 0
      // 035: arraylength
      // 036: if_icmpge 106
      // 039: aload 0
      // 03a: iload 4
      // 03c: aaload
      // 03d: astore 5
      // 03f: aload 5
      // 041: instanceof java/lang/reflect/ParameterizedType
      // 044: iload 2
      // 045: ifeq 107
      // 048: iload 2
      // 049: ifeq 0bc
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: ifeq 0b0
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 5
      // 05f: checkcast java/lang/reflect/ParameterizedType
      // 062: astore 6
      // 064: aload 6
      // 066: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 06b: astore 7
      // 06d: aload 7
      // 06f: aload 1
      // 070: invokestatic com/finalshell/core/Ph2.Z ([Ljava/lang/reflect/Type;Ljava/util/Map;)Z
      // 073: istore 8
      // 075: iload 8
      // 077: iload 2
      // 078: ifeq 0ab
      // 07b: ifeq 0ac
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 0
      // 086: iload 4
      // 088: new com/finalshell/core/HK
      // 08b: dup
      // 08c: aload 7
      // 08e: aload 6
      // 090: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType ()Ljava/lang/reflect/Type; 1
      // 095: aload 6
      // 097: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 09c: invokespecial com/finalshell/core/HK.<init> ([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
      // 09f: invokestatic com/finalshell/core/HI.V (Lcom/finalshell/core/HK;)Ljava/lang/reflect/Type;
      // 0a2: aastore
      // 0a3: bipush 1
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: istore 3
      // 0ac: iload 2
      // 0ad: ifne 0ff
      // 0b0: aload 5
      // 0b2: instanceof java/lang/reflect/TypeVariable
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: iload 2
      // 0bd: ifeq 0d9
      // 0c0: ifeq 0ff
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: aload 1
      // 0cb: aload 5
      // 0cd: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifeq 0fe
      // 0dd: ifeq 0ff
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: iload 4
      // 0ea: aload 1
      // 0eb: aload 5
      // 0ed: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f2: checkcast java/lang/reflect/Type
      // 0f5: aastore
      // 0f6: bipush 1
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: istore 3
      // 0ff: iinc 4 1
      // 102: iload 2
      // 103: ifne 032
      // 106: iload 3
      // 107: ireturn
   }

   public static boolean y(Type[] param0, TypeVariable[] param1, Type[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 3
      // 004: aload 2
      // 005: ifnull 01f
      // 008: aload 1
      // 009: arraylength
      // 00a: iload 3
      // 00b: ifeq 026
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: ifne 025
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: bipush 0
      // 020: ireturn
      // 021: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: bipush 0
      // 026: istore 4
      // 028: bipush 0
      // 029: istore 5
      // 02b: iload 5
      // 02d: aload 0
      // 02e: arraylength
      // 02f: if_icmpge 10a
      // 032: aload 0
      // 033: iload 5
      // 035: aaload
      // 036: astore 6
      // 038: aload 6
      // 03a: instanceof java/lang/reflect/ParameterizedType
      // 03d: iload 3
      // 03e: ifeq 10c
      // 041: iload 3
      // 042: ifeq 0b7
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: ifeq 0ab
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 6
      // 058: checkcast java/lang/reflect/ParameterizedType
      // 05b: astore 7
      // 05d: aload 7
      // 05f: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 064: astore 8
      // 066: aload 8
      // 068: aload 1
      // 069: aload 2
      // 06a: invokestatic com/finalshell/core/Ph2.y ([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z
      // 06d: istore 9
      // 06f: iload 9
      // 071: iload 3
      // 072: ifeq 0a5
      // 075: ifeq 0a7
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: iload 5
      // 082: new com/finalshell/core/HK
      // 085: dup
      // 086: aload 8
      // 088: aload 7
      // 08a: invokeinterface java/lang/reflect/ParameterizedType.getOwnerType ()Ljava/lang/reflect/Type; 1
      // 08f: aload 7
      // 091: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 096: invokespecial com/finalshell/core/HK.<init> ([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
      // 099: invokestatic com/finalshell/core/HI.V (Lcom/finalshell/core/HK;)Ljava/lang/reflect/Type;
      // 09c: aastore
      // 09d: bipush 1
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: istore 4
      // 0a7: iload 3
      // 0a8: ifne 103
      // 0ab: aload 6
      // 0ad: instanceof java/lang/reflect/TypeVariable
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: iload 3
      // 0b8: ifeq 0c6
      // 0bb: ifeq 103
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: bipush 0
      // 0c6: istore 7
      // 0c8: iload 7
      // 0ca: aload 1
      // 0cb: arraylength
      // 0cc: if_icmpge 103
      // 0cf: aload 6
      // 0d1: aload 1
      // 0d2: iload 7
      // 0d4: aaload
      // 0d5: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0d8: iload 3
      // 0d9: ifeq 02d
      // 0dc: iload 3
      // 0dd: ifeq 0fa
      // 0e0: ifeq 0fc
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: iload 5
      // 0ed: aload 2
      // 0ee: iload 7
      // 0f0: aaload
      // 0f1: aastore
      // 0f2: bipush 1
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: istore 4
      // 0fc: iinc 7 1
      // 0ff: iload 3
      // 100: ifne 0c8
      // 103: iinc 5 1
      // 106: iload 3
      // 107: ifne 02b
      // 10a: iload 4
      // 10c: ireturn
   }

   public static Type e(java.lang.Class param0, Type param1, TypeVariable param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration ()Ljava/lang/reflect/GenericDeclaration; 1
      // 006: astore 4
      // 008: invokestatic com/finalshell/core/Ph2.w ()I
      // 00b: aconst_null
      // 00c: astore 5
      // 00e: istore 3
      // 00f: aload 4
      // 011: iload 3
      // 012: ifeq 02f
      // 015: instanceof java/lang/Class
      // 018: ifeq 034
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 2
      // 023: invokeinterface java/lang/reflect/TypeVariable.getGenericDeclaration ()Ljava/lang/reflect/GenericDeclaration; 1
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: checkcast java/lang/Class
      // 032: astore 5
      // 034: aconst_null
      // 035: astore 6
      // 037: aload 5
      // 039: iload 3
      // 03a: ifeq 07b
      // 03d: aload 0
      // 03e: if_acmpne 07a
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 1
      // 049: iload 3
      // 04a: ifeq 069
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: instanceof java/lang/reflect/ParameterizedType
      // 057: ifeq 105
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 1
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: checkcast java/lang/reflect/ParameterizedType
      // 06c: astore 7
      // 06e: aload 7
      // 070: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 075: astore 6
      // 077: goto 105
      // 07a: aload 0
      // 07b: astore 7
      // 07d: aload 7
      // 07f: ifnull 105
      // 082: aload 7
      // 084: iload 3
      // 085: ifeq 113
      // 088: ldc java/lang/Object
      // 08a: iload 3
      // 08b: ifeq 0b5
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: if_acmpeq 105
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 7
      // 0a1: iload 3
      // 0a2: ifeq 0c4
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 5
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: if_acmpeq 105
      // 0b8: aload 7
      // 0ba: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: astore 8
      // 0c6: iload 3
      // 0c7: ifeq 101
      // 0ca: aload 8
      // 0cc: instanceof java/lang/reflect/ParameterizedType
      // 0cf: ifeq 0fa
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 8
      // 0db: checkcast java/lang/reflect/ParameterizedType
      // 0de: astore 9
      // 0e0: aload 9
      // 0e2: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 0e7: astore 10
      // 0e9: aload 10
      // 0eb: aload 7
      // 0ed: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 0f0: aload 6
      // 0f2: invokestatic com/finalshell/core/Ph2.y ([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z
      // 0f5: pop
      // 0f6: aload 10
      // 0f8: astore 6
      // 0fa: aload 7
      // 0fc: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 0ff: astore 7
      // 101: iload 3
      // 102: ifne 07d
      // 105: aload 6
      // 107: ifnull 116
      // 10a: aload 5
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: ifnonnull 11c
      // 116: aconst_null
      // 117: areturn
      // 118: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aconst_null
      // 11d: astore 7
      // 11f: aload 5
      // 121: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 124: astore 8
      // 126: bipush 0
      // 127: istore 9
      // 129: iload 9
      // 12b: aload 8
      // 12d: arraylength
      // 12e: if_icmpge 166
      // 131: aload 2
      // 132: iload 3
      // 133: ifeq 15b
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 8
      // 13f: iload 9
      // 141: aaload
      // 142: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 145: ifeq 160
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: aload 6
      // 151: iload 9
      // 153: aaload
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: astore 7
      // 15d: goto 166
      // 160: iinc 9 1
      // 163: goto 129
      // 166: aload 7
      // 168: areturn
   }

   @Override
   public String toString() {
      return this.I;
   }

   public Member r() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 20
      // 09: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 23: areturn
   }

   public java.lang.Class W() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 0c: ifnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1a: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 26: iload 1
      // 27: ifeq 3f
      // 2a: ifnull 43
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 42: areturn
      // 43: aconst_null
      // 44: areturn
   }

   public int M(Ph2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 094
      // 009: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 00c: ifnull 093
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: iload 2
      // 018: ifne 094
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 025: ifnull 093
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 033: invokevirtual java/lang/reflect/Method.isBridge ()Z
      // 036: iload 2
      // 037: ifne 097
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: ifeq 093
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 04f: invokevirtual java/lang/reflect/Method.isBridge ()Z
      // 052: iload 2
      // 053: ifne 097
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: ifne 093
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 1
      // 068: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 06b: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 072: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 075: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 078: iload 2
      // 079: ifne 097
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: ifeq 093
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: ireturn
      // 08f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 0
      // 094: getfield com/finalshell/core/Ph2.p I
      // 097: aload 1
      // 098: getfield com/finalshell/core/Ph2.p I
      // 09b: iload 2
      // 09c: ifne 0c2
      // 09f: if_icmpge 0af
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: bipush -1
      // 0aa: ireturn
      // 0ab: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield com/finalshell/core/Ph2.p I
      // 0b3: iload 2
      // 0b4: ifne 0d6
      // 0b7: aload 1
      // 0b8: getfield com/finalshell/core/Ph2.p I
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: if_icmple 0cb
      // 0c5: bipush 1
      // 0c6: ireturn
      // 0c7: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 0cf: aload 1
      // 0d0: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 0d3: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 0d6: istore 3
      // 0d7: iload 3
      // 0d8: iload 2
      // 0d9: ifne 0e7
      // 0dc: ifeq 0e8
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: iload 3
      // 0e7: ireturn
      // 0e8: aload 0
      // 0e9: invokevirtual com/finalshell/core/Ph2.W ()Ljava/lang/Class;
      // 0ec: astore 4
      // 0ee: aload 1
      // 0ef: invokevirtual com/finalshell/core/Ph2.W ()Ljava/lang/Class;
      // 0f2: astore 5
      // 0f4: aload 4
      // 0f6: iload 2
      // 0f7: ifne 106
      // 0fa: ifnull 15f
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: aload 5
      // 106: iload 2
      // 107: ifne 116
      // 10a: ifnull 15f
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 4
      // 116: aload 5
      // 118: iload 2
      // 119: ifne 131
      // 11c: if_acmpeq 15f
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: aload 4
      // 128: aload 5
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 134: iload 2
      // 135: ifne 14f
      // 138: ifeq 148
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: bipush -1
      // 143: ireturn
      // 144: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: aload 5
      // 14a: aload 4
      // 14c: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 14f: iload 2
      // 150: ifne 15e
      // 153: ifeq 15f
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15c: athrow
      // 15d: bipush 1
      // 15e: ireturn
      // 15f: aload 0
      // 160: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 163: iload 2
      // 164: ifne 17c
      // 167: ifnull 18e
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: aload 0
      // 172: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 17f: aload 0
      // 180: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 183: if_acmpne 18e
      // 186: bipush 1
      // 187: goto 18f
      // 18a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: bipush 0
      // 18f: istore 6
      // 191: aload 1
      // 192: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 195: iload 2
      // 196: ifne 1ae
      // 199: ifnull 1c0
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 1
      // 1a4: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 1a7: goto 1ae
      // 1aa: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 1b1: aload 1
      // 1b2: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 1b5: if_acmpne 1c0
      // 1b8: bipush 1
      // 1b9: goto 1c1
      // 1bc: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: bipush 0
      // 1c1: istore 7
      // 1c3: iload 6
      // 1c5: iload 2
      // 1c6: ifne 1f2
      // 1c9: ifeq 1f0
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: iload 7
      // 1d5: iload 2
      // 1d6: ifne 1f2
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: ifne 1f0
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: bipush 1
      // 1eb: ireturn
      // 1ec: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: iload 7
      // 1f2: iload 2
      // 1f3: ifne 224
      // 1f6: ifeq 21d
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: iload 6
      // 202: iload 2
      // 203: ifne 224
      // 206: goto 20d
      // 209: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: ifne 21d
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: bipush -1
      // 218: ireturn
      // 219: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: aload 1
      // 21e: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 221: invokevirtual java/lang/Class.isPrimitive ()Z
      // 224: iload 2
      // 225: ifne 25b
      // 228: ifeq 254
      // 22b: goto 232
      // 22e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 231: athrow
      // 232: aload 0
      // 233: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 236: invokevirtual java/lang/Class.isPrimitive ()Z
      // 239: iload 2
      // 23a: ifne 25b
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: ifne 254
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: bipush 1
      // 24f: ireturn
      // 250: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: aload 0
      // 255: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 258: invokevirtual java/lang/Class.isPrimitive ()Z
      // 25b: iload 2
      // 25c: ifne 29e
      // 25f: ifeq 28b
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: aload 1
      // 26a: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 26d: invokevirtual java/lang/Class.isPrimitive ()Z
      // 270: iload 2
      // 271: ifne 29e
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: ifne 28b
      // 27e: goto 285
      // 281: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: bipush -1
      // 286: ireturn
      // 287: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28a: athrow
      // 28b: aload 1
      // 28c: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 28f: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 292: sipush -12314
      // 295: sipush 4452
      // 298: invokestatic com/finalshell/core/Ph2.a (II)Ljava/lang/String;
      // 29b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 29e: iload 2
      // 29f: ifne 2ed
      // 2a2: ifeq 2da
      // 2a5: goto 2ac
      // 2a8: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: aload 0
      // 2ad: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 2b0: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 2b3: sipush -12313
      // 2b6: sipush 2000
      // 2b9: invokestatic com/finalshell/core/Ph2.a (II)Ljava/lang/String;
      // 2bc: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2bf: iload 2
      // 2c0: ifne 2ed
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: ifne 2da
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d3: athrow
      // 2d4: bipush 1
      // 2d5: ireturn
      // 2d6: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 2de: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 2e1: sipush -12313
      // 2e4: sipush 2000
      // 2e7: invokestatic com/finalshell/core/Ph2.a (II)Ljava/lang/String;
      // 2ea: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2ed: iload 2
      // 2ee: ifne 33a
      // 2f1: ifeq 329
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 1
      // 2fc: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 2ff: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 302: sipush -12313
      // 305: sipush 2000
      // 308: invokestatic com/finalshell/core/Ph2.a (II)Ljava/lang/String;
      // 30b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 30e: iload 2
      // 30f: ifne 33a
      // 312: goto 319
      // 315: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 318: athrow
      // 319: ifne 329
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: bipush -1
      // 324: ireturn
      // 325: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: aload 0
      // 32a: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 32d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 330: aload 1
      // 331: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 334: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 337: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 33a: ireturn
   }

   public E6 Z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ph2.F Lcom/finalshell/core/E6;
      // 08: iload 1
      // 09: ifeq 23
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.F Lcom/finalshell/core/E6;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Ph2.A Lcom/finalshell/core/E6;
      // 23: areturn
   }

   public String G() {
      return this.J;
   }

   public Object e(Object param1) throws IllegalAccessException, InvocationTargetException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 2a
      // 09: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 0c: ifnull 29
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1a: aload 1
      // 1b: bipush 0
      // 1c: anewarray 4
      // 1f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 22: goto 31
      // 25: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 2d: aload 1
      // 2e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 31: areturn
   }

   public void K(Object param1, Object param2) throws IllegalAccessException, InvocationTargetException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 2d
      // 09: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 0c: ifnull 2c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1a: aload 1
      // 1b: bipush 1
      // 1c: anewarray 4
      // 1f: dup
      // 20: bipush 0
      // 21: aload 2
      // 22: aastore
      // 23: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: pop
      // 27: return
      // 28: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 30: aload 1
      // 31: aload 2
      // 32: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 35: return
   }

   public void L() throws SecurityException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 0c: ifnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1a: invokestatic com/finalshell/core/B8_2.P (Ljava/lang/reflect/AccessibleObject;)V
      // 1d: return
      // 1e: invokestatic com/finalshell/core/Ph2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 26: invokestatic com/finalshell/core/B8_2.P (Ljava/lang/reflect/AccessibleObject;)V
      // 29: return
   }

   @Override
   public int compareTo(Object var1) {
      return this.M((Ph2)var1);
   }

   public static void S(int var0) {
      z = var0;
   }

   public static int w() {
      return z;
   }

   public static int u() {
      int var0 = w();

      try {
         return var0 == 0 ? 50 : 0;
      } catch (SecurityException var1) {
         throw a(var1);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -12313) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 171;
               break;
            case 1:
               var10000 = 6;
               break;
            case 2:
               var10000 = 52;
               break;
            case 3:
               var10000 = 29;
               break;
            case 4:
               var10000 = 137;
               break;
            case 5:
               var10000 = 118;
               break;
            case 6:
               var10000 = 56;
               break;
            case 7:
               var10000 = 108;
               break;
            case 8:
               var10000 = 30;
               break;
            case 9:
               var10000 = 103;
               break;
            case 10:
               var10000 = 53;
               break;
            case 11:
               var10000 = 61;
               break;
            case 12:
               var10000 = 222;
               break;
            case 13:
               var10000 = 126;
               break;
            case 14:
               var10000 = 185;
               break;
            case 15:
               var10000 = 225;
               break;
            case 16:
               var10000 = 109;
               break;
            case 17:
               var10000 = 42;
               break;
            case 18:
               var10000 = 183;
               break;
            case 19:
               var10000 = 116;
               break;
            case 20:
               var10000 = 1;
               break;
            case 21:
               var10000 = 48;
               break;
            case 22:
               var10000 = 73;
               break;
            case 23:
               var10000 = 235;
               break;
            case 24:
               var10000 = 86;
               break;
            case 25:
               var10000 = 43;
               break;
            case 26:
               var10000 = 184;
               break;
            case 27:
               var10000 = 33;
               break;
            case 28:
               var10000 = 20;
               break;
            case 29:
               var10000 = 251;
               break;
            case 30:
               var10000 = 106;
               break;
            case 31:
               var10000 = 101;
               break;
            case 32:
               var10000 = 217;
               break;
            case 33:
               var10000 = 75;
               break;
            case 34:
               var10000 = 121;
               break;
            case 35:
               var10000 = 228;
               break;
            case 36:
               var10000 = 194;
               break;
            case 37:
               var10000 = 91;
               break;
            case 38:
               var10000 = 148;
               break;
            case 39:
               var10000 = 66;
               break;
            case 40:
               var10000 = 67;
               break;
            case 41:
               var10000 = 32;
               break;
            case 42:
               var10000 = 119;
               break;
            case 43:
               var10000 = 247;
               break;
            case 44:
               var10000 = 104;
               break;
            case 45:
               var10000 = 78;
               break;
            case 46:
               var10000 = 47;
               break;
            case 47:
               var10000 = 158;
               break;
            case 48:
               var10000 = 170;
               break;
            case 49:
               var10000 = 69;
               break;
            case 50:
               var10000 = 37;
               break;
            case 51:
               var10000 = 23;
               break;
            case 52:
               var10000 = 68;
               break;
            case 53:
               var10000 = 41;
               break;
            case 54:
               var10000 = 163;
               break;
            case 55:
               var10000 = 135;
               break;
            case 56:
               var10000 = 242;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 127;
               break;
            case 59:
               var10000 = 150;
               break;
            case 60:
               var10000 = 200;
               break;
            case 61:
               var10000 = 208;
               break;
            case 62:
               var10000 = 4;
               break;
            case 63:
               var10000 = 236;
               break;
            case 64:
               var10000 = 179;
               break;
            case 65:
               var10000 = 18;
               break;
            case 66:
               var10000 = 63;
               break;
            case 67:
               var10000 = 97;
               break;
            case 68:
               var10000 = 79;
               break;
            case 69:
               var10000 = 7;
               break;
            case 70:
               var10000 = 141;
               break;
            case 71:
               var10000 = 17;
               break;
            case 72:
               var10000 = 156;
               break;
            case 73:
               var10000 = 3;
               break;
            case 74:
               var10000 = 12;
               break;
            case 75:
               var10000 = 96;
               break;
            case 76:
               var10000 = 113;
               break;
            case 77:
               var10000 = 216;
               break;
            case 78:
               var10000 = 16;
               break;
            case 79:
               var10000 = 173;
               break;
            case 80:
               var10000 = 55;
               break;
            case 81:
               var10000 = 248;
               break;
            case 82:
               var10000 = 253;
               break;
            case 83:
               var10000 = 9;
               break;
            case 84:
               var10000 = 136;
               break;
            case 85:
               var10000 = 72;
               break;
            case 86:
               var10000 = 39;
               break;
            case 87:
               var10000 = 252;
               break;
            case 88:
               var10000 = 123;
               break;
            case 89:
               var10000 = 159;
               break;
            case 90:
               var10000 = 223;
               break;
            case 91:
               var10000 = 152;
               break;
            case 92:
               var10000 = 74;
               break;
            case 93:
               var10000 = 186;
               break;
            case 94:
               var10000 = 220;
               break;
            case 95:
               var10000 = 209;
               break;
            case 96:
               var10000 = 224;
               break;
            case 97:
               var10000 = 99;
               break;
            case 98:
               var10000 = 227;
               break;
            case 99:
               var10000 = 146;
               break;
            case 100:
               var10000 = 40;
               break;
            case 101:
               var10000 = 21;
               break;
            case 102:
               var10000 = 196;
               break;
            case 103:
               var10000 = 174;
               break;
            case 104:
               var10000 = 168;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 139;
               break;
            case 107:
               var10000 = 160;
               break;
            case 108:
               var10000 = 206;
               break;
            case 109:
               var10000 = 192;
               break;
            case 110:
               var10000 = 77;
               break;
            case 111:
               var10000 = 221;
               break;
            case 112:
               var10000 = 5;
               break;
            case 113:
               var10000 = 234;
               break;
            case 114:
               var10000 = 144;
               break;
            case 115:
               var10000 = 201;
               break;
            case 116:
               var10000 = 213;
               break;
            case 117:
               var10000 = 100;
               break;
            case 118:
               var10000 = 131;
               break;
            case 119:
               var10000 = 166;
               break;
            case 120:
               var10000 = 254;
               break;
            case 121:
               var10000 = 107;
               break;
            case 122:
               var10000 = 105;
               break;
            case 123:
               var10000 = 243;
               break;
            case 124:
               var10000 = 14;
               break;
            case 125:
               var10000 = 34;
               break;
            case 126:
               var10000 = 207;
               break;
            case 127:
               var10000 = 22;
               break;
            case 128:
               var10000 = 129;
               break;
            case 129:
               var10000 = 212;
               break;
            case 130:
               var10000 = 147;
               break;
            case 131:
               var10000 = 197;
               break;
            case 132:
               var10000 = 162;
               break;
            case 133:
               var10000 = 177;
               break;
            case 134:
               var10000 = 246;
               break;
            case 135:
               var10000 = 180;
               break;
            case 136:
               var10000 = 44;
               break;
            case 137:
               var10000 = 157;
               break;
            case 138:
               var10000 = 102;
               break;
            case 139:
               var10000 = 15;
               break;
            case 140:
               var10000 = 255;
               break;
            case 141:
               var10000 = 154;
               break;
            case 142:
               var10000 = 142;
               break;
            case 143:
               var10000 = 124;
               break;
            case 144:
               var10000 = 70;
               break;
            case 145:
               var10000 = 19;
               break;
            case 146:
               var10000 = 229;
               break;
            case 147:
               var10000 = 239;
               break;
            case 148:
               var10000 = 155;
               break;
            case 149:
               var10000 = 145;
               break;
            case 150:
               var10000 = 153;
               break;
            case 151:
               var10000 = 64;
               break;
            case 152:
               var10000 = 214;
               break;
            case 153:
               var10000 = 202;
               break;
            case 154:
               var10000 = 59;
               break;
            case 155:
               var10000 = 172;
               break;
            case 156:
               var10000 = 50;
               break;
            case 157:
               var10000 = 233;
               break;
            case 158:
               var10000 = 80;
               break;
            case 159:
               var10000 = 65;
               break;
            case 160:
               var10000 = 112;
               break;
            case 161:
               var10000 = 46;
               break;
            case 162:
               var10000 = 195;
               break;
            case 163:
               var10000 = 49;
               break;
            case 164:
               var10000 = 231;
               break;
            case 165:
               var10000 = 81;
               break;
            case 166:
               var10000 = 218;
               break;
            case 167:
               var10000 = 151;
               break;
            case 168:
               var10000 = 134;
               break;
            case 169:
               var10000 = 188;
               break;
            case 170:
               var10000 = 26;
               break;
            case 171:
               var10000 = 187;
               break;
            case 172:
               var10000 = 98;
               break;
            case 173:
               var10000 = 27;
               break;
            case 174:
               var10000 = 143;
               break;
            case 175:
               var10000 = 165;
               break;
            case 176:
               var10000 = 190;
               break;
            case 177:
               var10000 = 110;
               break;
            case 178:
               var10000 = 149;
               break;
            case 179:
               var10000 = 250;
               break;
            case 180:
               var10000 = 132;
               break;
            case 181:
               var10000 = 83;
               break;
            case 182:
               var10000 = 133;
               break;
            case 183:
               var10000 = 175;
               break;
            case 184:
               var10000 = 232;
               break;
            case 185:
               var10000 = 87;
               break;
            case 186:
               var10000 = 219;
               break;
            case 187:
               var10000 = 93;
               break;
            case 188:
               var10000 = 205;
               break;
            case 189:
               var10000 = 138;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 31;
               break;
            case 192:
               var10000 = 115;
               break;
            case 193:
               var10000 = 38;
               break;
            case 194:
               var10000 = 117;
               break;
            case 195:
               var10000 = 51;
               break;
            case 196:
               var10000 = 210;
               break;
            case 197:
               var10000 = 204;
               break;
            case 198:
               var10000 = 95;
               break;
            case 199:
               var10000 = 35;
               break;
            case 200:
               var10000 = 114;
               break;
            case 201:
               var10000 = 88;
               break;
            case 202:
               var10000 = 241;
               break;
            case 203:
               var10000 = 10;
               break;
            case 204:
               var10000 = 120;
               break;
            case 205:
               var10000 = 57;
               break;
            case 206:
               var10000 = 2;
               break;
            case 207:
               var10000 = 249;
               break;
            case 208:
               var10000 = 0;
               break;
            case 209:
               var10000 = 167;
               break;
            case 210:
               var10000 = 181;
               break;
            case 211:
               var10000 = 125;
               break;
            case 212:
               var10000 = 54;
               break;
            case 213:
               var10000 = 244;
               break;
            case 214:
               var10000 = 178;
               break;
            case 215:
               var10000 = 161;
               break;
            case 216:
               var10000 = 94;
               break;
            case 217:
               var10000 = 13;
               break;
            case 218:
               var10000 = 169;
               break;
            case 219:
               var10000 = 203;
               break;
            case 220:
               var10000 = 45;
               break;
            case 221:
               var10000 = 128;
               break;
            case 222:
               var10000 = 199;
               break;
            case 223:
               var10000 = 90;
               break;
            case 224:
               var10000 = 111;
               break;
            case 225:
               var10000 = 76;
               break;
            case 226:
               var10000 = 193;
               break;
            case 227:
               var10000 = 182;
               break;
            case 228:
               var10000 = 84;
               break;
            case 229:
               var10000 = 25;
               break;
            case 230:
               var10000 = 237;
               break;
            case 231:
               var10000 = 191;
               break;
            case 232:
               var10000 = 82;
               break;
            case 233:
               var10000 = 226;
               break;
            case 234:
               var10000 = 62;
               break;
            case 235:
               var10000 = 140;
               break;
            case 236:
               var10000 = 215;
               break;
            case 237:
               var10000 = 122;
               break;
            case 238:
               var10000 = 11;
               break;
            case 239:
               var10000 = 60;
               break;
            case 240:
               var10000 = 28;
               break;
            case 241:
               var10000 = 198;
               break;
            case 242:
               var10000 = 58;
               break;
            case 243:
               var10000 = 71;
               break;
            case 244:
               var10000 = 238;
               break;
            case 245:
               var10000 = 164;
               break;
            case 246:
               var10000 = 189;
               break;
            case 247:
               var10000 = 230;
               break;
            case 248:
               var10000 = 92;
               break;
            case 249:
               var10000 = 8;
               break;
            case 250:
               var10000 = 24;
               break;
            case 251:
               var10000 = 36;
               break;
            case 252:
               var10000 = 176;
               break;
            case 253:
               var10000 = 89;
               break;
            case 254:
               var10000 = 240;
               break;
            default:
               var10000 = 130;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27279;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      S(90);
      String var10 = "Ü©¬\u0097ô\u0005¼7 Du";
      int var12 = "Ü©¬\u0097ô\u0005¼7 Du".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 49;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 49;
               var10006 = var14;
            } else {
               var23 = 49;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 49;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 42;
                     break;
                  case 1:
                     var41 = 29;
                     break;
                  case 2:
                     var41 = 52;
                     break;
                  case 3:
                     var41 = 58;
                     break;
                  case 4:
                     var41 = 102;
                     break;
                  case 5:
                     var41 = 32;
                     break;
                  default:
                     var41 = 116;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            d = var13;
            e = new String[2];
            long var0 = 6093904486419795693L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "\u0083Õ®Ñj' Ùâ¡úë¶\u0091)ér&\u000eìÖ\u009d}Ã";
            int var5 = "\u0083Õ®Ñj' Ùâ¡úë¶\u0091)ér&\u000eìÖ\u009d}Ã".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            f = var6;
            g = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





