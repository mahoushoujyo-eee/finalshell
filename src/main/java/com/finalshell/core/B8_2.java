package com.finalshell.core;

import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.util.P72;
import com.finalshell.util.XT;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class B8_2 {
   public static Pattern S;
   public static boolean i;
   public static boolean d;
   public static boolean y;
   public static boolean Y;
   public static Method r;
   public static boolean Z;
   public static Method x;
   public static boolean B;
   public static java.lang.Class X;
   public static boolean q;
   public static java.lang.Class a;
   public static java.lang.Class G;
   public static boolean W;
   public static java.lang.Class f;
   public static boolean b;
   public static Method t;
   public static boolean u;
   public static volatile java.lang.Class l;
   public static volatile boolean k;
   public static volatile boolean v;
   public static volatile Constructor z;
   public static volatile Method g;
   public static volatile Method p;
   public static volatile Method n;
   public static volatile boolean s;
   public static volatile Map E;
   public static volatile boolean H;
   public static ConcurrentMap F;
   public static java.lang.Class C;
   public static boolean T;
   public static java.lang.Class R;
   public static boolean w;
   public static volatile java.lang.Class K;
   public static volatile java.lang.Class Q;
   public static volatile boolean m;
   public static volatile Method U;
   public static volatile Field e;
   public static volatile Object c;
   public static java.lang.Class V;
   public static WE3 O;
   public static WE3 A;
   public static WE3 P;
   public static WE3 j;
   public static PK3 I;
   public static WE3 M;
   public static Map N;
   public static Set h;
   public static Object L;
   public static boolean D;
   public static String[] o;
   public static String[] J;
   public static long[] ab;
   public static Integer[] bb;
   public static long[] cb;
   public static Long[] db;

   public static boolean y(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 007: iload 1
      // 008: ifeq 03c
      // 00b: ifnonnull 039
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: getstatic com/finalshell/core/B8_2.m Z
      // 018: ifne 039
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: sipush -26439
      // 025: sipush 26010
      // 028: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 02b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 02e: putstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 031: goto 039
      // 034: astore 2
      // 035: bipush 1
      // 036: putstatic com/finalshell/core/B8_2.m Z
      // 039: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 03c: iload 1
      // 03d: ifeq 051
      // 040: ifnonnull 050
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: bipush 0
      // 04b: ireturn
      // 04c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: aload 0
      // 051: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 054: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 057: astore 2
      // 058: aload 2
      // 059: ifnonnull 062
      // 05c: bipush 0
      // 05d: ireturn
      // 05e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: getstatic com/finalshell/core/B8_2.U Ljava/lang/reflect/Method;
      // 065: iload 1
      // 066: ifeq 0a1
      // 069: ifnonnull 09e
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: getstatic com/finalshell/core/B8_2.m Z
      // 076: ifne 09e
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 083: sipush -26448
      // 086: sipush -19215
      // 089: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08c: bipush 0
      // 08d: anewarray 100
      // 090: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 093: putstatic com/finalshell/core/B8_2.U Ljava/lang/reflect/Method;
      // 096: goto 09e
      // 099: astore 3
      // 09a: bipush 1
      // 09b: putstatic com/finalshell/core/B8_2.m Z
      // 09e: getstatic com/finalshell/core/B8_2.U Ljava/lang/reflect/Method;
      // 0a1: ifnonnull 0aa
      // 0a4: bipush 0
      // 0a5: ireturn
      // 0a6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aconst_null
      // 0ab: astore 3
      // 0ac: getstatic com/finalshell/core/B8_2.m Z
      // 0af: ifne 0c7
      // 0b2: getstatic com/finalshell/core/B8_2.U Ljava/lang/reflect/Method;
      // 0b5: aload 2
      // 0b6: bipush 0
      // 0b7: anewarray 4
      // 0ba: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0bd: astore 3
      // 0be: goto 0c7
      // 0c1: astore 4
      // 0c3: bipush 1
      // 0c4: putstatic com/finalshell/core/B8_2.m Z
      // 0c7: aload 3
      // 0c8: ifnonnull 0d1
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: getstatic com/finalshell/core/B8_2.K Ljava/lang/Class;
      // 0d4: iload 1
      // 0d5: ifeq 124
      // 0d8: ifnonnull 123
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: getstatic com/finalshell/core/B8_2.m Z
      // 0e5: ifne 123
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: sipush -26441
      // 0f2: sipush 11268
      // 0f5: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0f8: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0fb: putstatic com/finalshell/core/B8_2.K Ljava/lang/Class;
      // 0fe: getstatic com/finalshell/core/B8_2.K Ljava/lang/Class;
      // 101: sipush -26371
      // 104: sipush -24359
      // 107: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 10a: invokevirtual java/lang/Class.getField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 10d: putstatic com/finalshell/core/B8_2.e Ljava/lang/reflect/Field;
      // 110: getstatic com/finalshell/core/B8_2.e Ljava/lang/reflect/Field;
      // 113: aconst_null
      // 114: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 117: putstatic com/finalshell/core/B8_2.c Ljava/lang/Object;
      // 11a: goto 123
      // 11d: astore 4
      // 11f: bipush 1
      // 120: putstatic com/finalshell/core/B8_2.m Z
      // 123: aload 3
      // 124: getstatic com/finalshell/core/B8_2.c Ljava/lang/Object;
      // 127: if_acmpne 132
      // 12a: bipush 1
      // 12b: goto 133
      // 12e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: bipush 0
      // 133: ireturn
   }

   public static Annotation K$Annotation(java.lang.Class param0) {
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
      // 04: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 07: iload 1
      // 08: ifeq 3c
      // 0b: ifnonnull 39
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic com/finalshell/core/B8_2.m Z
      // 18: ifne 39
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: sipush -26469
      // 25: sipush -21234
      // 28: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 2b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 2e: putstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 31: goto 39
      // 34: astore 2
      // 35: bipush 1
      // 36: putstatic com/finalshell/core/B8_2.m Z
      // 39: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 3c: iload 1
      // 3d: ifeq 51
      // 40: ifnonnull 50
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aconst_null
      // 4b: areturn
      // 4c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 0
      // 51: getstatic com/finalshell/core/B8_2.Q Ljava/lang/Class;
      // 54: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 57: areturn
   }

   public static boolean h(java.lang.Class var0) {
      int var10000;
      var10000 = Ph2.w();
      Boolean var2 = (Boolean)XJ.w(O, var0);
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 == null) {
            return false;
         }
      } catch (Hi2 var3) {
         throw a(var3);
      }

      return var2;
   }

   public static String i(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 1d: areturn
   }

   public static Byte d(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/math/BigDecimal
      // 01d: iload 1
      // 01e: ifne 03e
      // 021: ifeq 03a
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/math/BigDecimal
      // 02f: invokestatic com/finalshell/core/B8_2.i (Ljava/math/BigDecimal;)B
      // 032: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 035: areturn
      // 036: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: instanceof java/lang/Number
      // 03e: iload 1
      // 03f: ifne 05f
      // 042: ifeq 05b
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: checkcast java/lang/Number
      // 050: invokevirtual java/lang/Number.byteValue ()B
      // 053: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 056: areturn
      // 057: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: instanceof java/lang/String
      // 05f: iload 1
      // 060: ifne 0da
      // 063: ifeq 0d6
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: aload 0
      // 06e: checkcast java/lang/String
      // 071: astore 2
      // 072: aload 2
      // 073: invokevirtual java/lang/String.length ()I
      // 076: iload 1
      // 077: ifne 098
      // 07a: ifeq 0c8
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: sipush -26453
      // 087: sipush -1256
      // 08a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08d: aload 2
      // 08e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 1
      // 099: ifne 0ba
      // 09c: ifne 0c8
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: sipush -26432
      // 0a9: sipush -21979
      // 0ac: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0af: aload 2
      // 0b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: iload 1
      // 0bb: ifne 0d2
      // 0be: ifeq 0ce
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aconst_null
      // 0c9: areturn
      // 0ca: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 2
      // 0cf: invokestatic java/lang/Byte.parseByte (Ljava/lang/String;)B
      // 0d2: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0d5: areturn
      // 0d6: aload 0
      // 0d7: instanceof java/lang/Boolean
      // 0da: iload 1
      // 0db: ifne 0f6
      // 0de: ifeq 10d
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: checkcast java/lang/Boolean
      // 0ec: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: iload 1
      // 0f7: ifne 105
      // 0fa: ifeq 108
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: bipush 1
      // 105: goto 109
      // 108: bipush 0
      // 109: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 10c: areturn
      // 10d: new com/finalshell/core/Hi2
      // 110: dup
      // 111: new java/lang/StringBuilder
      // 114: dup
      // 115: invokespecial java/lang/StringBuilder.<init> ()V
      // 118: sipush -26619
      // 11b: sipush -12703
      // 11e: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: aload 0
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 128: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 12e: athrow
   }

   public static Character S(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: instanceof java/lang/Character
      // 1d: iload 1
      // 1e: ifne 43
      // 21: ifeq 34
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: checkcast java/lang/Character
      // 2f: areturn
      // 30: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: iload 1
      // 36: ifne 47
      // 39: instanceof java/lang/String
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ifeq a5
      // 46: aload 0
      // 47: checkcast java/lang/String
      // 4a: astore 2
      // 4b: aload 2
      // 4c: invokevirtual java/lang/String.length ()I
      // 4f: iload 1
      // 50: ifne 67
      // 53: ifne 63
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aconst_null
      // 5e: areturn
      // 5f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 2
      // 64: invokevirtual java/lang/String.length ()I
      // 67: iload 1
      // 68: ifne a1
      // 6b: bipush 1
      // 6c: if_icmpeq 9c
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: new com/finalshell/core/Hi2
      // 79: dup
      // 7a: new java/lang/StringBuilder
      // 7d: dup
      // 7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 81: sipush -26470
      // 84: sipush 6668
      // 87: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: aload 0
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 94: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 97: athrow
      // 98: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 2
      // 9d: bipush 0
      // 9e: invokevirtual java/lang/String.charAt (I)C
      // a1: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // a4: areturn
      // a5: new com/finalshell/core/Hi2
      // a8: dup
      // a9: new java/lang/StringBuilder
      // ac: dup
      // ad: invokespecial java/lang/StringBuilder.<init> ()V
      // b0: sipush -26482
      // b3: sipush -6368
      // b6: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bc: aload 0
      // bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c3: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // c6: athrow
   }

   public static Short Q(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/math/BigDecimal
      // 01d: iload 1
      // 01e: ifne 03e
      // 021: ifeq 03a
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/math/BigDecimal
      // 02f: invokestatic com/finalshell/core/B8_2.p (Ljava/math/BigDecimal;)S
      // 032: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 035: areturn
      // 036: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: instanceof java/lang/Number
      // 03e: iload 1
      // 03f: ifne 05f
      // 042: ifeq 05b
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: checkcast java/lang/Number
      // 050: invokevirtual java/lang/Number.shortValue ()S
      // 053: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 056: areturn
      // 057: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: instanceof java/lang/String
      // 05f: iload 1
      // 060: ifne 0da
      // 063: ifeq 0d6
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: aload 0
      // 06e: checkcast java/lang/String
      // 071: astore 2
      // 072: aload 2
      // 073: invokevirtual java/lang/String.length ()I
      // 076: iload 1
      // 077: ifne 098
      // 07a: ifeq 0c8
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: sipush -26453
      // 087: sipush -1256
      // 08a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08d: aload 2
      // 08e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 1
      // 099: ifne 0ba
      // 09c: ifne 0c8
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: sipush -26432
      // 0a9: sipush -21979
      // 0ac: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0af: aload 2
      // 0b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: iload 1
      // 0bb: ifne 0d2
      // 0be: ifeq 0ce
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aconst_null
      // 0c9: areturn
      // 0ca: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 2
      // 0cf: invokestatic java/lang/Short.parseShort (Ljava/lang/String;)S
      // 0d2: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 0d5: areturn
      // 0d6: aload 0
      // 0d7: instanceof java/lang/Boolean
      // 0da: iload 1
      // 0db: ifne 0f6
      // 0de: ifeq 10d
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: checkcast java/lang/Boolean
      // 0ec: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: iload 1
      // 0f7: ifne 105
      // 0fa: ifeq 108
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: bipush 1
      // 105: goto 109
      // 108: bipush 0
      // 109: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 10c: areturn
      // 10d: new com/finalshell/core/Hi2
      // 110: dup
      // 111: new java/lang/StringBuilder
      // 114: dup
      // 115: invokespecial java/lang/StringBuilder.<init> ()V
      // 118: sipush -26426
      // 11b: sipush 19119
      // 11e: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: aload 0
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 128: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 12e: athrow
   }

   public static BigDecimal b(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Float
      // 01d: iload 1
      // 01e: ifeq 073
      // 021: ifeq 06f
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Float
      // 02f: invokevirtual java/lang/Float.floatValue ()F
      // 032: invokestatic java/lang/Float.isNaN (F)Z
      // 035: iload 1
      // 036: ifeq 066
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: ifne 069
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 0
      // 04b: checkcast java/lang/Float
      // 04e: iload 1
      // 04f: ifeq 139
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: invokevirtual java/lang/Float.floatValue ()F
      // 05c: invokestatic java/lang/Float.isInfinite (F)Z
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: ifeq 138
      // 069: aconst_null
      // 06a: areturn
      // 06b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 0
      // 070: instanceof java/lang/Double
      // 073: iload 1
      // 074: ifeq 0c9
      // 077: ifeq 0c5
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 0
      // 082: checkcast java/lang/Double
      // 085: invokevirtual java/lang/Double.doubleValue ()D
      // 088: invokestatic java/lang/Double.isNaN (D)Z
      // 08b: iload 1
      // 08c: ifeq 0bc
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: ifne 0bf
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: checkcast java/lang/Double
      // 0a4: iload 1
      // 0a5: ifeq 139
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: invokevirtual java/lang/Double.doubleValue ()D
      // 0b2: invokestatic java/lang/Double.isInfinite (D)Z
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: ifeq 138
      // 0bf: aconst_null
      // 0c0: areturn
      // 0c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: instanceof java/math/BigDecimal
      // 0c9: iload 1
      // 0ca: ifeq 0e4
      // 0cd: ifeq 0e0
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: checkcast java/math/BigDecimal
      // 0db: areturn
      // 0dc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: instanceof java/math/BigInteger
      // 0e4: iload 1
      // 0e5: ifeq 111
      // 0e8: ifeq 102
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: new java/math/BigDecimal
      // 0f5: dup
      // 0f6: aload 0
      // 0f7: checkcast java/math/BigInteger
      // 0fa: invokespecial java/math/BigDecimal.<init> (Ljava/math/BigInteger;)V
      // 0fd: areturn
      // 0fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 0
      // 103: iload 1
      // 104: ifeq 139
      // 107: instanceof java/util/Map
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: ifeq 138
      // 114: aload 0
      // 115: checkcast java/util/Map
      // 118: iload 1
      // 119: ifeq 139
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: invokeinterface java/util/Map.size ()I 1
      // 128: ifne 138
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: aconst_null
      // 133: areturn
      // 134: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: aload 0
      // 139: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 13c: astore 2
      // 13d: aload 2
      // 13e: invokevirtual java/lang/String.length ()I
      // 141: iload 1
      // 142: ifeq 163
      // 145: ifeq 171
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 2
      // 150: sipush -26456
      // 153: sipush -5188
      // 156: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 159: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 15c: goto 163
      // 15f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 162: athrow
      // 163: iload 1
      // 164: ifeq 17b
      // 167: ifeq 177
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aconst_null
      // 172: areturn
      // 173: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 2
      // 178: invokevirtual java/lang/String.length ()I
      // 17b: sipush 7463
      // 17e: ldc2_w 8937918710718184256
      // 181: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 184: if_icmple 19c
      // 187: new com/finalshell/core/Hi2
      // 18a: dup
      // 18b: sipush -26425
      // 18e: sipush 16555
      // 191: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 194: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 197: athrow
      // 198: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: new java/math/BigDecimal
      // 19f: dup
      // 1a0: aload 2
      // 1a1: invokespecial java/math/BigDecimal.<init> (Ljava/lang/String;)V
      // 1a4: areturn
   }

   public static BigInteger I(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Float
      // 01d: iload 1
      // 01e: ifne 073
      // 021: ifeq 06f
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Float
      // 02f: astore 2
      // 030: aload 2
      // 031: invokevirtual java/lang/Float.floatValue ()F
      // 034: invokestatic java/lang/Float.isNaN (F)Z
      // 037: iload 1
      // 038: ifne 05e
      // 03b: ifne 061
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 2
      // 046: iload 1
      // 047: ifne 068
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: invokevirtual java/lang/Float.floatValue ()F
      // 054: invokestatic java/lang/Float.isInfinite (F)Z
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: ifeq 067
      // 061: aconst_null
      // 062: areturn
      // 063: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: aload 2
      // 068: invokevirtual java/lang/Float.longValue ()J
      // 06b: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 06e: areturn
      // 06f: aload 0
      // 070: instanceof java/lang/Double
      // 073: iload 1
      // 074: ifne 0c9
      // 077: ifeq 0c5
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 0
      // 082: checkcast java/lang/Double
      // 085: astore 2
      // 086: aload 2
      // 087: invokevirtual java/lang/Double.doubleValue ()D
      // 08a: invokestatic java/lang/Double.isNaN (D)Z
      // 08d: iload 1
      // 08e: ifne 0b4
      // 091: ifne 0b7
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 2
      // 09c: iload 1
      // 09d: ifne 0be
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: invokevirtual java/lang/Double.doubleValue ()D
      // 0aa: invokestatic java/lang/Double.isInfinite (D)Z
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: ifeq 0bd
      // 0b7: aconst_null
      // 0b8: areturn
      // 0b9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 2
      // 0be: invokevirtual java/lang/Double.longValue ()J
      // 0c1: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 0c4: areturn
      // 0c5: aload 0
      // 0c6: instanceof java/math/BigInteger
      // 0c9: iload 1
      // 0ca: ifne 0ef
      // 0cd: ifeq 0e0
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: checkcast java/math/BigInteger
      // 0db: areturn
      // 0dc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: iload 1
      // 0e2: ifne 12e
      // 0e5: instanceof java/math/BigDecimal
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: ifeq 12d
      // 0f2: aload 0
      // 0f3: checkcast java/math/BigDecimal
      // 0f6: astore 2
      // 0f7: aload 2
      // 0f8: iload 1
      // 0f9: ifne 12e
      // 0fc: invokevirtual java/math/BigDecimal.scale ()I
      // 0ff: istore 3
      // 100: iload 3
      // 101: sipush 30058
      // 104: ldc2_w 4404974519118418710
      // 107: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 10a: if_icmple 12d
      // 10d: iload 3
      // 10e: sipush 16446
      // 111: ldc2_w 3506229998107944540
      // 114: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 117: if_icmpge 12d
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 0
      // 122: checkcast java/math/BigDecimal
      // 125: invokevirtual java/math/BigDecimal.toBigInteger ()Ljava/math/BigInteger;
      // 128: areturn
      // 129: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 0
      // 12e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 131: astore 2
      // 132: aload 2
      // 133: invokevirtual java/lang/String.length ()I
      // 136: iload 1
      // 137: ifne 158
      // 13a: ifeq 166
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: aload 2
      // 145: sipush -26453
      // 148: sipush -1256
      // 14b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 14e: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 151: goto 158
      // 154: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: iload 1
      // 159: ifne 170
      // 15c: ifeq 16c
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: aconst_null
      // 167: areturn
      // 168: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 2
      // 16d: invokevirtual java/lang/String.length ()I
      // 170: sipush 6528
      // 173: ldc2_w 8952932570990559121
      // 176: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 179: if_icmple 191
      // 17c: new com/finalshell/core/Hi2
      // 17f: dup
      // 180: sipush -26402
      // 183: sipush -16133
      // 186: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 189: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 18c: athrow
      // 18d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: new java/math/BigInteger
      // 194: dup
      // 195: aload 2
      // 196: invokespecial java/math/BigInteger.<init> (Ljava/lang/String;)V
      // 199: areturn
   }

   public static Float h(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Number
      // 01d: iload 1
      // 01e: ifeq 03e
      // 021: ifeq 03a
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Number
      // 02f: invokevirtual java/lang/Number.floatValue ()F
      // 032: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 035: areturn
      // 036: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: instanceof java/lang/String
      // 03e: iload 1
      // 03f: ifeq 0e0
      // 042: ifeq 0dc
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 050: astore 2
      // 051: aload 2
      // 052: invokevirtual java/lang/String.length ()I
      // 055: iload 1
      // 056: ifeq 077
      // 059: ifeq 0a7
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: sipush -26453
      // 066: sipush -1256
      // 069: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 06c: aload 2
      // 06d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iload 1
      // 078: ifeq 099
      // 07b: ifne 0a7
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: sipush -26476
      // 088: sipush -25371
      // 08b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08e: aload 2
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: iload 1
      // 09a: ifeq 0c5
      // 09d: ifeq 0ad
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aconst_null
      // 0a8: areturn
      // 0a9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 2
      // 0ae: iload 1
      // 0af: ifeq 0d5
      // 0b2: sipush 8439
      // 0b5: ldc2_w 1851507036708275949
      // 0b8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0bb: invokevirtual java/lang/String.indexOf (I)I
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: bipush -1
      // 0c6: if_icmpeq 0d4
      // 0c9: aload 2
      // 0ca: ldc_w ","
      // 0cd: ldc_w ""
      // 0d0: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0d3: astore 2
      // 0d4: aload 2
      // 0d5: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 0d8: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0db: areturn
      // 0dc: aload 0
      // 0dd: instanceof java/lang/Boolean
      // 0e0: iload 1
      // 0e1: ifeq 0fc
      // 0e4: ifeq 10c
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: checkcast java/lang/Boolean
      // 0f2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: ifeq 107
      // 0ff: fconst_1
      // 100: goto 108
      // 103: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: fconst_0
      // 108: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 10b: areturn
      // 10c: new com/finalshell/core/Hi2
      // 10f: dup
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush -26442
      // 11a: sipush -8583
      // 11d: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: aload 0
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 12d: athrow
   }

   public static Double Z(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Number
      // 01d: iload 1
      // 01e: ifeq 03e
      // 021: ifeq 03a
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Number
      // 02f: invokevirtual java/lang/Number.doubleValue ()D
      // 032: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 035: areturn
      // 036: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: instanceof java/lang/String
      // 03e: iload 1
      // 03f: ifeq 0e0
      // 042: ifeq 0dc
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 050: astore 2
      // 051: aload 2
      // 052: invokevirtual java/lang/String.length ()I
      // 055: iload 1
      // 056: ifeq 077
      // 059: ifeq 0a7
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: sipush -26453
      // 066: sipush -1256
      // 069: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 06c: aload 2
      // 06d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iload 1
      // 078: ifeq 099
      // 07b: ifne 0a7
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: sipush -26432
      // 088: sipush -21979
      // 08b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08e: aload 2
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: iload 1
      // 09a: ifeq 0c5
      // 09d: ifeq 0ad
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aconst_null
      // 0a8: areturn
      // 0a9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 2
      // 0ae: iload 1
      // 0af: ifeq 0d5
      // 0b2: sipush 8439
      // 0b5: ldc2_w 1851507036708275949
      // 0b8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0bb: invokevirtual java/lang/String.indexOf (I)I
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: bipush -1
      // 0c6: if_icmpeq 0d4
      // 0c9: aload 2
      // 0ca: ldc_w ","
      // 0cd: ldc_w ""
      // 0d0: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0d3: astore 2
      // 0d4: aload 2
      // 0d5: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 0d8: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0db: areturn
      // 0dc: aload 0
      // 0dd: instanceof java/lang/Boolean
      // 0e0: iload 1
      // 0e1: ifeq 0fc
      // 0e4: ifeq 10c
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: checkcast java/lang/Boolean
      // 0f2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: ifeq 107
      // 0ff: dconst_1
      // 100: goto 108
      // 103: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: dconst_0
      // 108: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 10b: areturn
      // 10c: new com/finalshell/core/Hi2
      // 10f: dup
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush -26434
      // 11a: sipush 14326
      // 11d: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: aload 0
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 12d: athrow
   }

   public static Date C(Object var0) {
      return n(var0, null);
   }

   public static Date n(Object param0, String param1) {
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
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/util/Date
      // 01d: iload 2
      // 01e: ifeq 043
      // 021: ifeq 034
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/util/Date
      // 02f: areturn
      // 030: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: iload 2
      // 036: ifeq 047
      // 039: instanceof java/util/Calendar
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: ifeq 04e
      // 046: aload 0
      // 047: checkcast java/util/Calendar
      // 04a: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 04d: areturn
      // 04e: sipush 6242
      // 051: ldc2_w 7108868673252527061
      // 054: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 057: lstore 3
      // 058: aload 0
      // 059: instanceof java/math/BigDecimal
      // 05c: iload 2
      // 05d: ifeq 07f
      // 060: ifeq 07b
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: aload 0
      // 06b: checkcast java/math/BigDecimal
      // 06e: invokestatic com/finalshell/core/B8_2.X (Ljava/math/BigDecimal;)J
      // 071: lstore 3
      // 072: new java/util/Date
      // 075: dup
      // 076: lload 3
      // 077: invokespecial java/util/Date.<init> (J)V
      // 07a: areturn
      // 07b: aload 0
      // 07c: instanceof java/lang/Number
      // 07f: iload 2
      // 080: ifeq 0d0
      // 083: ifeq 0cc
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 0
      // 08e: checkcast java/lang/Number
      // 091: invokevirtual java/lang/Number.longValue ()J
      // 094: iload 2
      // 095: ifeq 0c2
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: lstore 3
      // 0a0: sipush -26395
      // 0a3: sipush 27287
      // 0a6: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0a9: aload 1
      // 0aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ad: ifeq 0c3
      // 0b0: lload 3
      // 0b1: sipush 6213
      // 0b4: ldc2_w 8839483027315985406
      // 0b7: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 0ba: lmul
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: lstore 3
      // 0c3: new java/util/Date
      // 0c6: dup
      // 0c7: lload 3
      // 0c8: invokespecial java/util/Date.<init> (J)V
      // 0cb: areturn
      // 0cc: aload 0
      // 0cd: instanceof java/lang/String
      // 0d0: iload 2
      // 0d1: ifeq 40a
      // 0d4: ifeq 3ff
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: checkcast java/lang/String
      // 0e2: astore 5
      // 0e4: new com/finalshell/core/Uy2_2
      // 0e7: dup
      // 0e8: aload 5
      // 0ea: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 0ed: astore 6
      // 0ef: aload 6
      // 0f1: iload 2
      // 0f2: ifeq 11b
      // 0f5: bipush 0
      // 0f6: invokevirtual com/finalshell/core/Uy2_2.Z (Z)Z
      // 0f9: ifeq 119
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: aload 6
      // 105: invokevirtual com/finalshell/core/Uy2_2.c ()Ljava/util/Calendar;
      // 108: astore 7
      // 10a: aload 7
      // 10c: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 10f: astore 8
      // 111: aload 6
      // 113: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 116: aload 8
      // 118: areturn
      // 119: aload 6
      // 11b: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 11e: goto 12b
      // 121: astore 9
      // 123: aload 6
      // 125: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 128: aload 9
      // 12a: athrow
      // 12b: aload 5
      // 12d: sipush -26468
      // 130: sipush -19573
      // 133: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 136: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 139: iload 2
      // 13a: ifeq 19a
      // 13d: ifeq 181
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: aload 5
      // 149: sipush -26484
      // 14c: sipush 19251
      // 14f: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 152: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 155: iload 2
      // 156: ifeq 19a
      // 159: goto 160
      // 15c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: ifeq 181
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: aload 5
      // 16c: sipush 10343
      // 16f: ldc2_w 2756203802854821413
      // 172: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 175: aload 5
      // 177: invokevirtual java/lang/String.length ()I
      // 17a: bipush 2
      // 17b: isub
      // 17c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 17f: astore 5
      // 181: aload 5
      // 183: iload 2
      // 184: ifeq 1d7
      // 187: sipush 7616
      // 18a: ldc2_w 659717581093354484
      // 18d: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 190: invokevirtual java/lang/String.indexOf (I)I
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: ifgt 1d6
      // 19d: aload 5
      // 19f: iload 2
      // 1a0: ifeq 1d7
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: sipush 30714
      // 1ad: ldc2_w 4334247759643595150
      // 1b0: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 1b3: invokevirtual java/lang/String.indexOf (I)I
      // 1b6: ifgt 1d6
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: aload 1
      // 1c1: iload 2
      // 1c2: ifeq 3e2
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: ifnull 3e0
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: aload 1
      // 1d7: iload 2
      // 1d8: ifeq 1e7
      // 1db: ifnonnull 39e
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: aload 5
      // 1e7: invokevirtual java/lang/String.length ()I
      // 1ea: istore 7
      // 1ec: iload 2
      // 1ed: ifeq 24a
      // 1f0: iload 7
      // 1f2: getstatic com/finalshell/core/Ok2.z Ljava/lang/String;
      // 1f5: invokevirtual java/lang/String.length ()I
      // 1f8: if_icmpeq 246
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: iload 7
      // 204: sipush 17540
      // 207: ldc2_w 4871966299286201017
      // 20a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 20d: iload 2
      // 20e: ifeq 260
      // 211: goto 218
      // 214: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: if_icmpne 24e
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: getstatic com/finalshell/core/Ok2.z Ljava/lang/String;
      // 225: sipush -26387
      // 228: sipush 3694
      // 22b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 22e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 231: iload 2
      // 232: ifeq 257
      // 235: goto 23c
      // 238: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: ifeq 24e
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 245: athrow
      // 246: getstatic com/finalshell/core/Ok2.z Ljava/lang/String;
      // 249: astore 1
      // 24a: iload 2
      // 24b: ifne 39e
      // 24e: iload 7
      // 250: goto 257
      // 253: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 256: athrow
      // 257: sipush 11448
      // 25a: ldc2_w 6983840208133098154
      // 25d: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 260: iload 2
      // 261: ifeq 291
      // 264: if_icmpne 27c
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26d: athrow
      // 26e: sipush -26452
      // 271: sipush -4121
      // 274: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 277: astore 1
      // 278: iload 2
      // 279: ifne 39e
      // 27c: iload 7
      // 27e: sipush -26477
      // 281: sipush -21827
      // 284: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 287: invokevirtual java/lang/String.length ()I
      // 28a: goto 291
      // 28d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: iload 2
      // 292: ifeq 2bf
      // 295: if_icmpne 2ad
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: sipush -26391
      // 2a2: sipush -15098
      // 2a5: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 2a8: astore 1
      // 2a9: iload 2
      // 2aa: ifne 39e
      // 2ad: iload 7
      // 2af: sipush 3798
      // 2b2: ldc2_w 1634944969235376272
      // 2b5: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: iload 2
      // 2c0: ifeq 345
      // 2c3: if_icmpne 333
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: aload 5
      // 2cf: sipush 20626
      // 2d2: ldc2_w 8167910039943935637
      // 2d5: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2d8: invokevirtual java/lang/String.charAt (I)C
      // 2db: sipush 23875
      // 2de: ldc2_w 8110577994123279174
      // 2e1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2e4: iload 2
      // 2e5: ifeq 345
      // 2e8: goto 2ef
      // 2eb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ee: athrow
      // 2ef: if_icmpne 333
      // 2f2: goto 2f9
      // 2f5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: aload 5
      // 2fb: sipush 5170
      // 2fe: ldc2_w 2780238763065717255
      // 301: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 304: invokevirtual java/lang/String.charAt (I)C
      // 307: sipush 10433
      // 30a: ldc2_w 8301337562390302429
      // 30d: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 310: iload 2
      // 311: ifeq 345
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: if_icmpne 333
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 324: athrow
      // 325: sipush -26449
      // 328: sipush -11569
      // 32b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 32e: astore 1
      // 32f: iload 2
      // 330: ifne 39e
      // 333: iload 7
      // 335: sipush 6479
      // 338: ldc2_w 1128073240583913306
      // 33b: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 33e: goto 345
      // 341: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 344: athrow
      // 345: iload 2
      // 346: ifeq 37c
      // 349: if_icmpne 38d
      // 34c: goto 353
      // 34f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: aload 5
      // 355: iload 2
      // 356: ifeq 39d
      // 359: goto 360
      // 35c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35f: athrow
      // 360: sipush 20314
      // 363: ldc2_w 5909910695257958756
      // 366: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 369: invokevirtual java/lang/String.charAt (I)C
      // 36c: sipush 8439
      // 36f: ldc2_w 1851507036708275949
      // 372: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 375: goto 37c
      // 378: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37b: athrow
      // 37c: if_icmpne 38d
      // 37f: sipush -26399
      // 382: sipush 10853
      // 385: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 388: astore 1
      // 389: iload 2
      // 38a: ifne 39e
      // 38d: sipush -26401
      // 390: sipush -13406
      // 393: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 396: goto 39d
      // 399: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: astore 1
      // 39e: new java/text/SimpleDateFormat
      // 3a1: dup
      // 3a2: aload 1
      // 3a3: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 3a6: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 3a9: astore 7
      // 3ab: aload 7
      // 3ad: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 3b0: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 3b3: aload 7
      // 3b5: aload 5
      // 3b7: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 3ba: areturn
      // 3bb: astore 8
      // 3bd: new com/finalshell/core/Hi2
      // 3c0: dup
      // 3c1: new java/lang/StringBuilder
      // 3c4: dup
      // 3c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c8: sipush -26403
      // 3cb: sipush 31455
      // 3ce: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 3d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d4: aload 5
      // 3d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3dc: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3df: athrow
      // 3e0: aload 5
      // 3e2: iload 2
      // 3e3: ifeq 3fb
      // 3e6: invokevirtual java/lang/String.length ()I
      // 3e9: ifne 3f9
      // 3ec: goto 3f3
      // 3ef: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f2: athrow
      // 3f3: aconst_null
      // 3f4: areturn
      // 3f5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f8: athrow
      // 3f9: aload 5
      // 3fb: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3fe: lstore 3
      // 3ff: lload 3
      // 400: sipush 28719
      // 403: ldc2_w 1329718195656844182
      // 406: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 409: lcmp
      // 40a: ifne 57a
      // 40d: aload 0
      // 40e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 411: astore 5
      // 413: sipush -26433
      // 416: sipush 25724
      // 419: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 41c: aload 5
      // 41e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 421: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 424: iload 2
      // 425: ifeq 4cc
      // 428: ifeq 4bb
      // 42b: goto 432
      // 42e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 431: athrow
      // 432: getstatic com/finalshell/core/B8_2.r Ljava/lang/reflect/Method;
      // 435: iload 2
      // 436: ifeq 49b
      // 439: goto 440
      // 43c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43f: athrow
      // 440: ifnonnull 490
      // 443: goto 44a
      // 446: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 449: athrow
      // 44a: getstatic com/finalshell/core/B8_2.Y Z
      // 44d: iload 2
      // 44e: ifeq 478
      // 451: goto 458
      // 454: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 457: athrow
      // 458: ifne 490
      // 45b: goto 462
      // 45e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 461: athrow
      // 462: aload 5
      // 464: sipush -26409
      // 467: sipush -21977
      // 46a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 46d: bipush 0
      // 46e: anewarray 100
      // 471: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 474: putstatic com/finalshell/core/B8_2.r Ljava/lang/reflect/Method;
      // 477: bipush 1
      // 478: putstatic com/finalshell/core/B8_2.Y Z
      // 47b: goto 490
      // 47e: astore 6
      // 480: bipush 1
      // 481: putstatic com/finalshell/core/B8_2.Y Z
      // 484: goto 490
      // 487: astore 10
      // 489: bipush 1
      // 48a: putstatic com/finalshell/core/B8_2.Y Z
      // 48d: aload 10
      // 48f: athrow
      // 490: getstatic com/finalshell/core/B8_2.r Ljava/lang/reflect/Method;
      // 493: aload 0
      // 494: bipush 0
      // 495: anewarray 4
      // 498: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 49b: astore 6
      // 49d: goto 4b5
      // 4a0: astore 7
      // 4a2: new com/finalshell/core/Hi2
      // 4a5: dup
      // 4a6: sipush -26454
      // 4a9: sipush 23442
      // 4ac: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 4af: aload 7
      // 4b1: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4b4: athrow
      // 4b5: aload 6
      // 4b7: checkcast java/util/Date
      // 4ba: areturn
      // 4bb: sipush -26617
      // 4be: sipush 5544
      // 4c1: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 4c4: aload 5
      // 4c6: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 4c9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4cc: ifeq 558
      // 4cf: getstatic com/finalshell/core/B8_2.x Ljava/lang/reflect/Method;
      // 4d2: iload 2
      // 4d3: ifeq 538
      // 4d6: goto 4dd
      // 4d9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4dc: athrow
      // 4dd: ifnonnull 52d
      // 4e0: goto 4e7
      // 4e3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: getstatic com/finalshell/core/B8_2.Z Z
      // 4ea: iload 2
      // 4eb: ifeq 515
      // 4ee: goto 4f5
      // 4f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f4: athrow
      // 4f5: ifne 52d
      // 4f8: goto 4ff
      // 4fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fe: athrow
      // 4ff: aload 5
      // 501: sipush -26408
      // 504: sipush -21949
      // 507: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 50a: bipush 0
      // 50b: anewarray 100
      // 50e: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 511: putstatic com/finalshell/core/B8_2.x Ljava/lang/reflect/Method;
      // 514: bipush 1
      // 515: putstatic com/finalshell/core/B8_2.Z Z
      // 518: goto 52d
      // 51b: astore 6
      // 51d: bipush 1
      // 51e: putstatic com/finalshell/core/B8_2.Z Z
      // 521: goto 52d
      // 524: astore 11
      // 526: bipush 1
      // 527: putstatic com/finalshell/core/B8_2.Z Z
      // 52a: aload 11
      // 52c: athrow
      // 52d: getstatic com/finalshell/core/B8_2.x Ljava/lang/reflect/Method;
      // 530: aload 0
      // 531: bipush 0
      // 532: anewarray 4
      // 535: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 538: astore 6
      // 53a: goto 552
      // 53d: astore 7
      // 53f: new com/finalshell/core/Hi2
      // 542: dup
      // 543: sipush -26404
      // 546: sipush 7290
      // 549: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 54c: aload 7
      // 54e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 551: athrow
      // 552: aload 6
      // 554: checkcast java/util/Date
      // 557: areturn
      // 558: new com/finalshell/core/Hi2
      // 55b: dup
      // 55c: new java/lang/StringBuilder
      // 55f: dup
      // 560: invokespecial java/lang/StringBuilder.<init> ()V
      // 563: sipush -26472
      // 566: sipush 29807
      // 569: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 56c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56f: aload 0
      // 570: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 573: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 576: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 579: athrow
      // 57a: new java/util/Date
      // 57d: dup
      // 57e: lload 3
      // 57f: invokespecial java/util/Date.<init> (J)V
      // 582: areturn
   }

   public static Object p(Object var0) {
      return XJ.w(A, var0);
   }

   public static long e(Number param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 23
      // 09: instanceof java/math/BigDecimal
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/math/BigDecimal
      // 1a: invokevirtual java/math/BigDecimal.longValueExact ()J
      // 1d: lreturn
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual java/lang/Number.longValue ()J
      // 26: lreturn
   }

   public static Object z(Object var0) {
      return XJ.w(P, var0);
   }

   public static Object q(Object var0) {
      return XJ.w(j, var0);
   }

   public static int j(char param0, char param1) {
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
      // 04: iload 0
      // 05: iload 2
      // 06: ifne a0
      // 09: sipush 10433
      // 0c: ldc2_w 8301337562390302429
      // 0f: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 12: if_icmplt 9f
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: iload 0
      // 1d: iload 2
      // 1e: ifne a0
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: sipush 31983
      // 2b: ldc2_w 1197547028193598095
      // 2e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 31: if_icmpgt 9f
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 1
      // 3c: iload 2
      // 3d: ifne a0
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: sipush 10433
      // 4a: ldc2_w 8301337562390302429
      // 4d: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 50: if_icmplt 9f
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: iload 1
      // 5b: iload 2
      // 5c: ifne a0
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: sipush 31983
      // 69: ldc2_w 1197547028193598095
      // 6c: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 6f: if_icmpgt 9f
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: iload 0
      // 7a: sipush 10433
      // 7d: ldc2_w 8301337562390302429
      // 80: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 83: isub
      // 84: sipush 11448
      // 87: ldc2_w 6983840208133098154
      // 8a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 8d: imul
      // 8e: iload 1
      // 8f: sipush 10433
      // 92: ldc2_w 8301337562390302429
      // 95: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 98: isub
      // 99: iadd
      // 9a: ireturn
      // 9b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: bipush -1
      // a0: ireturn
   }

   public static int R(char param0, char param1, char param2, char param3) {
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
      // 005: iload 0
      // 006: iload 4
      // 008: ifeq 151
      // 00b: sipush 10433
      // 00e: ldc2_w 8301337562390302429
      // 011: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 014: if_icmplt 150
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: iload 0
      // 01f: iload 4
      // 021: ifeq 151
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: sipush 31983
      // 02e: ldc2_w 1197547028193598095
      // 031: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 034: if_icmpgt 150
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 1
      // 03f: iload 4
      // 041: ifeq 151
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: sipush 10433
      // 04e: ldc2_w 8301337562390302429
      // 051: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 054: if_icmplt 150
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: iload 1
      // 05f: iload 4
      // 061: ifeq 151
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: sipush 31983
      // 06e: ldc2_w 1197547028193598095
      // 071: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 074: if_icmpgt 150
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: iload 2
      // 07f: iload 4
      // 081: ifeq 151
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: sipush 10433
      // 08e: ldc2_w 8301337562390302429
      // 091: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 094: if_icmplt 150
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: iload 2
      // 09f: iload 4
      // 0a1: ifeq 151
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: sipush 31983
      // 0ae: ldc2_w 1197547028193598095
      // 0b1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0b4: if_icmpgt 150
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: iload 3
      // 0bf: iload 4
      // 0c1: ifeq 151
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: sipush 10433
      // 0ce: ldc2_w 8301337562390302429
      // 0d1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0d4: if_icmplt 150
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: iload 3
      // 0df: iload 4
      // 0e1: ifeq 151
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: sipush 31983
      // 0ee: ldc2_w 1197547028193598095
      // 0f1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0f4: if_icmpgt 150
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: iload 0
      // 0ff: sipush 10433
      // 102: ldc2_w 8301337562390302429
      // 105: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 108: isub
      // 109: sipush 16446
      // 10c: ldc2_w 3506229998107944540
      // 10f: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 112: imul
      // 113: iload 1
      // 114: sipush 10433
      // 117: ldc2_w 8301337562390302429
      // 11a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 11d: isub
      // 11e: sipush 6001
      // 121: ldc2_w 36044248809550199
      // 124: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 127: imul
      // 128: iadd
      // 129: iload 2
      // 12a: sipush 10433
      // 12d: ldc2_w 8301337562390302429
      // 130: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 133: isub
      // 134: sipush 11448
      // 137: ldc2_w 6983840208133098154
      // 13a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 13d: imul
      // 13e: iadd
      // 13f: iload 3
      // 140: sipush 10433
      // 143: ldc2_w 8301337562390302429
      // 146: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 149: isub
      // 14a: iadd
      // 14b: ireturn
      // 14c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: bipush -1
      // 151: ireturn
   }

   public static int M(char param0, char param1, char param2, char param3, char param4, char param5, char param6, char param7, char param8) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 9
      // 005: iload 0
      // 006: iload 9
      // 008: ifeq 30e
      // 00b: sipush 10433
      // 00e: ldc2_w 8301337562390302429
      // 011: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 014: if_icmplt 30d
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: iload 0
      // 01f: iload 9
      // 021: ifeq 30e
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: sipush 31983
      // 02e: ldc2_w 1197547028193598095
      // 031: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 034: if_icmpgt 30d
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 1
      // 03f: iload 9
      // 041: ifeq 30e
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: sipush 10433
      // 04e: ldc2_w 8301337562390302429
      // 051: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 054: if_icmplt 30d
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: iload 1
      // 05f: iload 9
      // 061: ifeq 30e
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: sipush 31983
      // 06e: ldc2_w 1197547028193598095
      // 071: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 074: if_icmpgt 30d
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: iload 2
      // 07f: iload 9
      // 081: ifeq 30e
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: sipush 10433
      // 08e: ldc2_w 8301337562390302429
      // 091: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 094: if_icmplt 30d
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: iload 2
      // 09f: iload 9
      // 0a1: ifeq 30e
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: sipush 31983
      // 0ae: ldc2_w 1197547028193598095
      // 0b1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0b4: if_icmpgt 30d
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: iload 3
      // 0bf: iload 9
      // 0c1: ifeq 30e
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: sipush 10433
      // 0ce: ldc2_w 8301337562390302429
      // 0d1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0d4: if_icmplt 30d
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: iload 3
      // 0df: iload 9
      // 0e1: ifeq 30e
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: sipush 31983
      // 0ee: ldc2_w 1197547028193598095
      // 0f1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0f4: if_icmpgt 30d
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: iload 4
      // 100: iload 9
      // 102: ifeq 30e
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: sipush 10433
      // 10f: ldc2_w 8301337562390302429
      // 112: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 115: if_icmplt 30d
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: iload 4
      // 121: iload 9
      // 123: ifeq 30e
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: sipush 31983
      // 130: ldc2_w 1197547028193598095
      // 133: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 136: if_icmpgt 30d
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: iload 5
      // 142: iload 9
      // 144: ifeq 30e
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: sipush 10433
      // 151: ldc2_w 8301337562390302429
      // 154: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 157: if_icmplt 30d
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: iload 5
      // 163: iload 9
      // 165: ifeq 30e
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: sipush 31983
      // 172: ldc2_w 1197547028193598095
      // 175: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 178: if_icmpgt 30d
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: iload 6
      // 184: iload 9
      // 186: ifeq 30e
      // 189: goto 190
      // 18c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: sipush 10433
      // 193: ldc2_w 8301337562390302429
      // 196: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 199: if_icmplt 30d
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: iload 6
      // 1a5: iload 9
      // 1a7: ifeq 30e
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: sipush 31983
      // 1b4: ldc2_w 1197547028193598095
      // 1b7: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 1ba: if_icmpgt 30d
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c3: athrow
      // 1c4: iload 7
      // 1c6: iload 9
      // 1c8: ifeq 30e
      // 1cb: goto 1d2
      // 1ce: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d1: athrow
      // 1d2: sipush 10433
      // 1d5: ldc2_w 8301337562390302429
      // 1d8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 1db: if_icmplt 30d
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: iload 7
      // 1e7: iload 9
      // 1e9: ifeq 30e
      // 1ec: goto 1f3
      // 1ef: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f2: athrow
      // 1f3: sipush 31983
      // 1f6: ldc2_w 1197547028193598095
      // 1f9: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 1fc: if_icmpgt 30d
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 205: athrow
      // 206: iload 8
      // 208: iload 9
      // 20a: ifeq 30e
      // 20d: goto 214
      // 210: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: sipush 10433
      // 217: ldc2_w 8301337562390302429
      // 21a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 21d: if_icmplt 30d
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: iload 8
      // 229: iload 9
      // 22b: ifeq 30e
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: sipush 31983
      // 238: ldc2_w 1197547028193598095
      // 23b: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 23e: if_icmpgt 30d
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 247: athrow
      // 248: iload 0
      // 249: sipush 10433
      // 24c: ldc2_w 8301337562390302429
      // 24f: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 252: isub
      // 253: sipush 15285
      // 256: ldc2_w 1696023494043311525
      // 259: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 25c: imul
      // 25d: iload 1
      // 25e: sipush 10433
      // 261: ldc2_w 8301337562390302429
      // 264: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 267: isub
      // 268: sipush 30187
      // 26b: ldc2_w 342584084667880327
      // 26e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 271: imul
      // 272: iadd
      // 273: iload 2
      // 274: sipush 10433
      // 277: ldc2_w 8301337562390302429
      // 27a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 27d: isub
      // 27e: sipush 16872
      // 281: ldc2_w 8933446676430186368
      // 284: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 287: imul
      // 288: iadd
      // 289: iload 3
      // 28a: sipush 10433
      // 28d: ldc2_w 8301337562390302429
      // 290: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 293: isub
      // 294: sipush 15615
      // 297: ldc2_w 6938861132883139204
      // 29a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 29d: imul
      // 29e: iadd
      // 29f: iload 4
      // 2a1: sipush 10433
      // 2a4: ldc2_w 8301337562390302429
      // 2a7: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2aa: isub
      // 2ab: sipush 14305
      // 2ae: ldc2_w 155292954913346011
      // 2b1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2b4: imul
      // 2b5: iadd
      // 2b6: iload 5
      // 2b8: sipush 10433
      // 2bb: ldc2_w 8301337562390302429
      // 2be: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2c1: isub
      // 2c2: sipush 16678
      // 2c5: ldc2_w 5403241129717360434
      // 2c8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2cb: imul
      // 2cc: iadd
      // 2cd: iload 6
      // 2cf: sipush 10433
      // 2d2: ldc2_w 8301337562390302429
      // 2d5: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2d8: isub
      // 2d9: sipush 6001
      // 2dc: ldc2_w 36044248809550199
      // 2df: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2e2: imul
      // 2e3: iadd
      // 2e4: iload 7
      // 2e6: sipush 10433
      // 2e9: ldc2_w 8301337562390302429
      // 2ec: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2ef: isub
      // 2f0: sipush 11448
      // 2f3: ldc2_w 6983840208133098154
      // 2f6: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2f9: imul
      // 2fa: iadd
      // 2fb: iload 8
      // 2fd: sipush 10433
      // 300: ldc2_w 8301337562390302429
      // 303: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 306: isub
      // 307: iadd
      // 308: ireturn
      // 309: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30c: athrow
      // 30d: bipush -1
      // 30e: ireturn
   }

   public static boolean Y(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: iload 2
      // 07: aload 0
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: if_icmpge ae
      // 0e: aload 0
      // 0f: iload 2
      // 10: invokevirtual java/lang/String.charAt (I)C
      // 13: istore 3
      // 14: iload 3
      // 15: iload 1
      // 16: ifne af
      // 19: iload 1
      // 1a: ifne 57
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: sipush 30714
      // 27: ldc2_w 4334247759643595150
      // 2a: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2d: if_icmpeq 56
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: iload 3
      // 38: sipush 7616
      // 3b: ldc2_w 659717581093354484
      // 3e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 41: iload 1
      // 42: ifne 7c
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: if_icmpne 67
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: iload 2
      // 57: iload 1
      // 58: ifne 66
      // 5b: ifeq a7
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: bipush 0
      // 66: ireturn
      // 67: iload 3
      // 68: iload 1
      // 69: ifne a6
      // 6c: sipush 10433
      // 6f: ldc2_w 8301337562390302429
      // 72: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: if_icmplt 9e
      // 7f: iload 3
      // 80: iload 1
      // 81: ifne a6
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: sipush 31983
      // 8e: ldc2_w 1197547028193598095
      // 91: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 94: if_icmple a7
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: bipush 0
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: ireturn
      // a7: iinc 2 1
      // aa: iload 1
      // ab: ifeq 06
      // ae: bipush 1
      // af: ireturn
   }

   public static Long s(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/math/BigDecimal
      // 01d: iload 1
      // 01e: ifeq 03e
      // 021: ifeq 03a
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/math/BigDecimal
      // 02f: invokestatic com/finalshell/core/B8_2.X (Ljava/math/BigDecimal;)J
      // 032: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 035: areturn
      // 036: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 0
      // 03b: instanceof java/lang/Number
      // 03e: iload 1
      // 03f: ifeq 05f
      // 042: ifeq 05b
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: checkcast java/lang/Number
      // 050: invokevirtual java/lang/Number.longValue ()J
      // 053: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 056: areturn
      // 057: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: instanceof java/lang/String
      // 05f: iload 1
      // 060: ifeq 14f
      // 063: ifeq 14b
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: aload 0
      // 06e: checkcast java/lang/String
      // 071: astore 2
      // 072: aload 2
      // 073: invokevirtual java/lang/String.length ()I
      // 076: iload 1
      // 077: ifeq 098
      // 07a: ifeq 0c8
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: sipush -26453
      // 087: sipush -1256
      // 08a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 08d: aload 2
      // 08e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 1
      // 099: ifeq 0ba
      // 09c: ifne 0c8
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: sipush -26432
      // 0a9: sipush -21979
      // 0ac: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0af: aload 2
      // 0b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: iload 1
      // 0bb: ifeq 0e6
      // 0be: ifeq 0ce
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aconst_null
      // 0c9: areturn
      // 0ca: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 2
      // 0cf: iload 1
      // 0d0: ifeq 0f6
      // 0d3: sipush 8439
      // 0d6: ldc2_w 1851507036708275949
      // 0d9: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0dc: invokevirtual java/lang/String.indexOf (I)I
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: bipush -1
      // 0e7: if_icmpeq 0f5
      // 0ea: aload 2
      // 0eb: ldc_w ","
      // 0ee: ldc_w ""
      // 0f1: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0f4: astore 2
      // 0f5: aload 2
      // 0f6: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: areturn
      // 0fd: astore 3
      // 0fe: new com/finalshell/core/Uy2_2
      // 101: dup
      // 102: aload 2
      // 103: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 106: astore 3
      // 107: aconst_null
      // 108: astore 4
      // 10a: aload 3
      // 10b: iload 1
      // 10c: ifeq 125
      // 10f: bipush 0
      // 110: invokevirtual com/finalshell/core/Uy2_2.Z (Z)Z
      // 113: ifeq 12a
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 3
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: invokevirtual com/finalshell/core/Uy2_2.c ()Ljava/util/Calendar;
      // 128: astore 4
      // 12a: aload 3
      // 12b: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 12e: aload 4
      // 130: iload 1
      // 131: ifeq 14c
      // 134: ifnull 14b
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 4
      // 140: invokevirtual java/util/Calendar.getTimeInMillis ()J
      // 143: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 146: areturn
      // 147: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: aload 0
      // 14c: instanceof java/util/Map
      // 14f: iload 1
      // 150: ifeq 1e4
      // 153: ifeq 1e0
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: aload 0
      // 15e: checkcast java/util/Map
      // 161: astore 2
      // 162: aload 2
      // 163: invokeinterface java/util/Map.size ()I 1
      // 168: iload 1
      // 169: ifeq 1e4
      // 16c: bipush 2
      // 16d: if_icmpne 1e0
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 2
      // 178: sipush -26406
      // 17b: sipush 23575
      // 17e: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 181: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 186: iload 1
      // 187: ifeq 1e4
      // 18a: goto 191
      // 18d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: ifeq 1e0
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: aload 2
      // 19c: sipush -26388
      // 19f: sipush 14443
      // 1a2: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 1a5: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1aa: iload 1
      // 1ab: ifeq 1e4
      // 1ae: goto 1b5
      // 1b1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: ifeq 1e0
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1be: athrow
      // 1bf: aload 2
      // 1c0: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1c5: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1ca: astore 3
      // 1cb: aload 3
      // 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d1: pop
      // 1d2: aload 3
      // 1d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d8: astore 4
      // 1da: aload 4
      // 1dc: invokestatic com/finalshell/core/B8_2.s (Ljava/lang/Object;)Ljava/lang/Long;
      // 1df: areturn
      // 1e0: aload 0
      // 1e1: instanceof java/lang/Boolean
      // 1e4: iload 1
      // 1e5: ifeq 200
      // 1e8: ifeq 210
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: checkcast java/lang/Boolean
      // 1f6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f9: goto 200
      // 1fc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: ifeq 20b
      // 203: lconst_1
      // 204: goto 20c
      // 207: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: lconst_0
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: areturn
      // 210: new com/finalshell/core/Hi2
      // 213: dup
      // 214: new java/lang/StringBuilder
      // 217: dup
      // 218: invokespecial java/lang/StringBuilder.<init> ()V
      // 21b: sipush -26375
      // 21e: sipush 28899
      // 221: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 224: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 227: aload 0
      // 228: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 22b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 231: athrow
   }

   public static byte i(BigDecimal param0) {
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
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/math/BigDecimal.scale ()I
      // 1d: istore 2
      // 1e: iload 2
      // 1f: iload 1
      // 20: ifeq 62
      // 23: sipush 13168
      // 26: ldc2_w 286835664072545618
      // 29: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2c: if_icmplt 5e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 2
      // 37: iload 1
      // 38: ifeq 62
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 6001
      // 45: ldc2_w 36044248809550199
      // 48: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 4b: if_icmpgt 5e
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual java/math/BigDecimal.byteValue ()B
      // 59: ireturn
      // 5a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual java/math/BigDecimal.byteValueExact ()B
      // 62: ireturn
   }

   public static short p(BigDecimal param0) {
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
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/math/BigDecimal.scale ()I
      // 1d: istore 2
      // 1e: iload 2
      // 1f: iload 1
      // 20: ifeq 62
      // 23: sipush 13168
      // 26: ldc2_w 286835664072545618
      // 29: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2c: if_icmplt 5e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 2
      // 37: iload 1
      // 38: ifeq 62
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 6001
      // 45: ldc2_w 36044248809550199
      // 48: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 4b: if_icmpgt 5e
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual java/math/BigDecimal.shortValue ()S
      // 59: ireturn
      // 5a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual java/math/BigDecimal.shortValueExact ()S
      // 62: ireturn
   }

   public static int P(BigDecimal param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/math/BigDecimal.scale ()I
      // 1d: istore 2
      // 1e: iload 2
      // 1f: iload 1
      // 20: ifne 62
      // 23: sipush 13168
      // 26: ldc2_w 286835664072545618
      // 29: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 2c: if_icmplt 5e
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 2
      // 37: iload 1
      // 38: ifne 62
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: sipush 6001
      // 45: ldc2_w 36044248809550199
      // 48: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 4b: if_icmpgt 5e
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual java/math/BigDecimal.intValue ()I
      // 59: ireturn
      // 5a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual java/math/BigDecimal.intValueExact ()I
      // 62: ireturn
   }

   public static long X(BigDecimal param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: lconst_0
      // 14: lreturn
      // 15: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual java/math/BigDecimal.scale ()I
      // 1d: istore 2
      // 1e: iload 2
      // 1f: sipush 28783
      // 22: ldc2_w 2659261384975603211
      // 25: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 28: iload 1
      // 29: ifne 47
      // 2c: if_icmplt 53
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 2
      // 37: sipush 32108
      // 3a: ldc2_w 4468748853615680369
      // 3d: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: if_icmpgt 53
      // 4a: aload 0
      // 4b: invokevirtual java/math/BigDecimal.longValue ()J
      // 4e: lreturn
      // 4f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 0
      // 54: invokevirtual java/math/BigDecimal.longValueExact ()J
      // 57: lreturn
   }

   public static Integer Y(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Integer
      // 01d: iload 1
      // 01e: ifeq 038
      // 021: ifeq 034
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Integer
      // 02f: areturn
      // 030: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: instanceof java/math/BigDecimal
      // 038: iload 1
      // 039: ifeq 059
      // 03c: ifeq 055
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 0
      // 047: checkcast java/math/BigDecimal
      // 04a: invokestatic com/finalshell/core/B8_2.P (Ljava/math/BigDecimal;)I
      // 04d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 050: areturn
      // 051: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 0
      // 056: instanceof java/lang/Number
      // 059: iload 1
      // 05a: ifeq 07a
      // 05d: ifeq 076
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: aload 0
      // 068: checkcast java/lang/Number
      // 06b: invokevirtual java/lang/Number.intValue ()I
      // 06e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 071: areturn
      // 072: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: aload 0
      // 077: instanceof java/lang/String
      // 07a: iload 1
      // 07b: ifeq 145
      // 07e: ifeq 141
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 0
      // 089: checkcast java/lang/String
      // 08c: astore 2
      // 08d: aload 2
      // 08e: invokevirtual java/lang/String.length ()I
      // 091: iload 1
      // 092: ifeq 0b3
      // 095: ifeq 0e3
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: sipush -26453
      // 0a2: sipush -1256
      // 0a5: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0a8: aload 2
      // 0a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: iload 1
      // 0b4: ifeq 0d5
      // 0b7: ifne 0e3
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: sipush -26432
      // 0c4: sipush -21979
      // 0c7: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0ca: aload 2
      // 0cb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: iload 1
      // 0d6: ifeq 101
      // 0d9: ifeq 0e9
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aconst_null
      // 0e4: areturn
      // 0e5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: aload 2
      // 0ea: iload 1
      // 0eb: ifeq 116
      // 0ee: sipush 8439
      // 0f1: ldc2_w 1851507036708275949
      // 0f4: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0f7: invokevirtual java/lang/String.indexOf (I)I
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: bipush -1
      // 102: if_icmpeq 117
      // 105: aload 2
      // 106: ldc_w ","
      // 109: ldc_w ""
      // 10c: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: astore 2
      // 117: getstatic com/finalshell/core/B8_2.S Ljava/util/regex/Pattern;
      // 11a: aload 2
      // 11b: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 11e: astore 3
      // 11f: aload 3
      // 120: invokevirtual java/util/regex/Matcher.find ()Z
      // 123: iload 1
      // 124: ifeq 13d
      // 127: ifeq 139
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: aload 3
      // 132: ldc_w ""
      // 135: invokevirtual java/util/regex/Matcher.replaceAll (Ljava/lang/String;)Ljava/lang/String;
      // 138: astore 2
      // 139: aload 2
      // 13a: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 13d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 140: areturn
      // 141: aload 0
      // 142: instanceof java/lang/Boolean
      // 145: iload 1
      // 146: ifeq 187
      // 149: ifeq 178
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: aload 0
      // 154: checkcast java/lang/Boolean
      // 157: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15a: iload 1
      // 15b: ifeq 170
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 164: athrow
      // 165: ifeq 173
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: bipush 1
      // 170: goto 174
      // 173: bipush 0
      // 174: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 177: areturn
      // 178: aload 0
      // 179: iload 1
      // 17a: ifeq 18b
      // 17d: instanceof java/util/Map
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: ifeq 20d
      // 18a: aload 0
      // 18b: checkcast java/util/Map
      // 18e: astore 2
      // 18f: aload 2
      // 190: invokeinterface java/util/Map.size ()I 1
      // 195: iload 1
      // 196: ifeq 1ba
      // 199: bipush 2
      // 19a: if_icmpne 20d
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 2
      // 1a5: sipush -26460
      // 1a8: sipush 29157
      // 1ab: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 1ae: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b9: athrow
      // 1ba: iload 1
      // 1bb: ifeq 1e9
      // 1be: ifeq 20d
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: aload 2
      // 1c9: iload 1
      // 1ca: ifeq 1ed
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: sipush -26382
      // 1d7: sipush -21917
      // 1da: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 1dd: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: ifeq 20d
      // 1ec: aload 2
      // 1ed: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1f2: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1f7: astore 3
      // 1f8: aload 3
      // 1f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1fe: pop
      // 1ff: aload 3
      // 200: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 205: astore 4
      // 207: aload 4
      // 209: invokestatic com/finalshell/core/B8_2.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 20c: areturn
      // 20d: new com/finalshell/core/Hi2
      // 210: dup
      // 211: new java/lang/StringBuilder
      // 214: dup
      // 215: invokespecial java/lang/StringBuilder.<init> ()V
      // 218: sipush -26398
      // 21b: sipush 24206
      // 21e: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 224: aload 0
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 228: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 22e: athrow
   }

   public static byte[] B(Object param0) {
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
      // 05: instanceof [B
      // 08: iload 1
      // 09: ifeq 2e
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast [B
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifeq 32
      // 24: instanceof java/lang/String
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ifeq 39
      // 31: aload 0
      // 32: checkcast java/lang/String
      // 35: invokestatic com/finalshell/core/S7.T (Ljava/lang/String;)[B
      // 38: areturn
      // 39: new com/finalshell/core/Hi2
      // 3c: dup
      // 3d: new java/lang/StringBuilder
      // 40: dup
      // 41: invokespecial java/lang/StringBuilder.<init> ()V
      // 44: sipush -26405
      // 47: sipush 24285
      // 4a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 4d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50: aload 0
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 5a: athrow
   }

   public static Boolean J(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: instanceof java/lang/Boolean
      // 01d: iload 1
      // 01e: ifne 038
      // 021: ifeq 034
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: checkcast java/lang/Boolean
      // 02f: areturn
      // 030: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: instanceof java/math/BigDecimal
      // 038: iload 1
      // 039: ifne 077
      // 03c: ifeq 073
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 0
      // 047: checkcast java/math/BigDecimal
      // 04a: invokestatic com/finalshell/core/B8_2.P (Ljava/math/BigDecimal;)I
      // 04d: iload 1
      // 04e: ifne 06b
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: bipush 1
      // 059: if_icmpne 06e
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: bipush 1
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: goto 06f
      // 06e: bipush 0
      // 06f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 072: areturn
      // 073: aload 0
      // 074: instanceof java/lang/Number
      // 077: iload 1
      // 078: ifne 0c1
      // 07b: ifeq 0b2
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 0
      // 086: checkcast java/lang/Number
      // 089: invokevirtual java/lang/Number.intValue ()I
      // 08c: iload 1
      // 08d: ifne 0aa
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: bipush 1
      // 098: if_icmpne 0ad
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: bipush 1
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: goto 0ae
      // 0ad: bipush 0
      // 0ae: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b1: areturn
      // 0b2: aload 0
      // 0b3: iload 1
      // 0b4: ifne 0c5
      // 0b7: instanceof java/lang/String
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: ifeq 20a
      // 0c4: aload 0
      // 0c5: checkcast java/lang/String
      // 0c8: astore 2
      // 0c9: aload 2
      // 0ca: invokevirtual java/lang/String.length ()I
      // 0cd: iload 1
      // 0ce: ifne 0ef
      // 0d1: ifeq 11f
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: sipush -26453
      // 0de: sipush -1256
      // 0e1: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0e4: aload 2
      // 0e5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: iload 1
      // 0f0: ifne 111
      // 0f3: ifne 11f
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: sipush -26432
      // 100: sipush -21979
      // 103: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 106: aload 2
      // 107: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: iload 1
      // 112: ifne 132
      // 115: ifeq 125
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: aconst_null
      // 120: areturn
      // 121: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: sipush -26465
      // 128: sipush -6088
      // 12b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 12e: aload 2
      // 12f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 132: iload 1
      // 133: ifne 14e
      // 136: ifne 15c
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: ldc_w "1"
      // 143: aload 2
      // 144: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: iload 1
      // 14f: ifne 171
      // 152: ifeq 164
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 15f: areturn
      // 160: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: sipush -26436
      // 167: sipush 29673
      // 16a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 16d: aload 2
      // 16e: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 171: iload 1
      // 172: ifne 18d
      // 175: ifne 19b
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: ldc_w "0"
      // 182: aload 2
      // 183: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: iload 1
      // 18e: ifne 1aa
      // 191: ifeq 1a3
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 19e: areturn
      // 19f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: ldc_w "Y"
      // 1a6: aload 2
      // 1a7: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 1aa: iload 1
      // 1ab: ifne 1c6
      // 1ae: ifne 1d4
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: ldc_w "T"
      // 1bb: aload 2
      // 1bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bf: goto 1c6
      // 1c2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: iload 1
      // 1c7: ifne 1e3
      // 1ca: ifeq 1dc
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 1d7: areturn
      // 1d8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: ldc_w "F"
      // 1df: aload 2
      // 1e0: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 1e3: iload 1
      // 1e4: ifne 1ff
      // 1e7: ifne 202
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: ldc_w "N"
      // 1f4: aload 2
      // 1f5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f8: goto 1ff
      // 1fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: ifeq 20a
      // 202: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 205: areturn
      // 206: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: new com/finalshell/core/Hi2
      // 20d: dup
      // 20e: new java/lang/StringBuilder
      // 211: dup
      // 212: invokespecial java/lang/StringBuilder.<init> ()V
      // 215: sipush -26620
      // 218: sipush -17931
      // 21b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: aload 0
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 225: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 228: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 22b: athrow
   }

   public static Object t(Object var0, java.lang.Class var1) {
      return B(var0, var1, IG.G());
   }

   public static Object B(Object param0, java.lang.Class param1, IG param2) {
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
      // 004: aload 0
      // 005: ifnonnull 0c2
      // 008: aload 1
      // 009: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 00c: iload 3
      // 00d: ifeq 02e
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: if_acmpne 02a
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: bipush 0
      // 022: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 025: areturn
      // 026: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 1
      // 02b: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 02e: iload 3
      // 02f: ifeq 049
      // 032: if_acmpne 045
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: lconst_0
      // 03d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 040: areturn
      // 041: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 1
      // 046: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 049: iload 3
      // 04a: ifeq 064
      // 04d: if_acmpne 060
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: bipush 0
      // 058: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 05b: areturn
      // 05c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 1
      // 061: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 064: iload 3
      // 065: ifeq 07f
      // 068: if_acmpne 07b
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: bipush 0
      // 073: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 076: areturn
      // 077: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 1
      // 07c: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 07f: iload 3
      // 080: ifeq 09a
      // 083: if_acmpne 096
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: fconst_0
      // 08e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 091: areturn
      // 092: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 1
      // 097: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 09a: iload 3
      // 09b: ifeq 0b5
      // 09e: if_acmpne 0b1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: dconst_0
      // 0a9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 0ac: areturn
      // 0ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 0b5: if_acmpne 0c0
      // 0b8: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 0bb: areturn
      // 0bc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aconst_null
      // 0c1: areturn
      // 0c2: aload 1
      // 0c3: iload 3
      // 0c4: ifeq 0e7
      // 0c7: ifnonnull 0e6
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: new java/lang/IllegalArgumentException
      // 0d4: dup
      // 0d5: sipush -26495
      // 0d8: sipush -28028
      // 0db: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0de: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0e1: athrow
      // 0e2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: iload 3
      // 0e8: ifeq 100
      // 0eb: aload 0
      // 0ec: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ef: if_acmpne 0ff
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: areturn
      // 0fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: instanceof java/util/Map
      // 103: iload 3
      // 104: ifeq 17a
      // 107: ifeq 176
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 1
      // 112: iload 3
      // 113: ifeq 131
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: ldc_w java/util/Map
      // 120: if_acmpne 130
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: aload 0
      // 12b: areturn
      // 12c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 0
      // 131: checkcast java/util/Map
      // 134: astore 4
      // 136: aload 1
      // 137: iload 3
      // 138: ifeq 175
      // 13b: ldc java/lang/Object
      // 13d: if_acmpne 16c
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: aload 4
      // 149: iload 3
      // 14a: ifeq 175
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 157: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 15c: ifne 16c
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 0
      // 167: areturn
      // 168: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 0
      // 16d: checkcast java/util/Map
      // 170: aload 1
      // 171: aload 2
      // 172: invokestatic com/finalshell/core/B8_2.g (Ljava/util/Map;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 175: areturn
      // 176: aload 1
      // 177: invokevirtual java/lang/Class.isArray ()Z
      // 17a: iload 3
      // 17b: ifeq 235
      // 17e: ifeq 222
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 187: athrow
      // 188: aload 0
      // 189: iload 3
      // 18a: ifeq 1a9
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: instanceof java/util/Collection
      // 197: ifeq 207
      // 19a: goto 1a1
      // 19d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: checkcast java/util/Collection
      // 1ac: astore 4
      // 1ae: bipush 0
      // 1af: istore 5
      // 1b1: aload 1
      // 1b2: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 1b5: aload 4
      // 1b7: invokeinterface java/util/Collection.size ()I 1
      // 1bc: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 1bf: astore 6
      // 1c1: aload 4
      // 1c3: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1c8: astore 7
      // 1ca: aload 7
      // 1cc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d1: ifeq 204
      // 1d4: aload 7
      // 1d6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1db: astore 8
      // 1dd: aload 8
      // 1df: aload 1
      // 1e0: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 1e3: aload 2
      // 1e4: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 1e7: astore 9
      // 1e9: aload 6
      // 1eb: iload 3
      // 1ec: ifeq 206
      // 1ef: iload 5
      // 1f1: aload 9
      // 1f3: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 1f6: iinc 5 1
      // 1f9: iload 3
      // 1fa: ifne 1ca
      // 1fd: goto 204
      // 200: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: aload 6
      // 206: areturn
      // 207: aload 1
      // 208: ldc_w [B
      // 20b: iload 3
      // 20c: ifeq 227
      // 20f: if_acmpne 222
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 218: athrow
      // 219: aload 0
      // 21a: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;)[B
      // 21d: areturn
      // 21e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: aload 1
      // 223: aload 0
      // 224: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 227: iload 3
      // 228: ifeq 24d
      // 22b: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: ifeq 23e
      // 238: aload 0
      // 239: areturn
      // 23a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: aload 1
      // 23f: iload 3
      // 240: ifeq 269
      // 243: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: if_acmpeq 268
      // 250: aload 1
      // 251: ldc java/lang/Boolean
      // 253: iload 3
      // 254: ifeq 27c
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: if_acmpne 26d
      // 261: goto 268
      // 264: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 267: athrow
      // 268: aload 0
      // 269: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/Object;)Ljava/lang/Boolean;
      // 26c: areturn
      // 26d: aload 1
      // 26e: iload 3
      // 26f: ifeq 298
      // 272: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 275: goto 27c
      // 278: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: if_acmpeq 297
      // 27f: aload 1
      // 280: ldc java/lang/Byte
      // 282: iload 3
      // 283: ifeq 2ab
      // 286: goto 28d
      // 289: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: if_acmpne 29c
      // 290: goto 297
      // 293: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: aload 0
      // 298: invokestatic com/finalshell/core/B8_2.d (Ljava/lang/Object;)Ljava/lang/Byte;
      // 29b: areturn
      // 29c: aload 1
      // 29d: iload 3
      // 29e: ifeq 2c7
      // 2a1: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: if_acmpeq 2c6
      // 2ae: aload 1
      // 2af: ldc java/lang/Character
      // 2b1: iload 3
      // 2b2: ifeq 2da
      // 2b5: goto 2bc
      // 2b8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bb: athrow
      // 2bc: if_acmpne 2cb
      // 2bf: goto 2c6
      // 2c2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: invokestatic com/finalshell/core/B8_2.S (Ljava/lang/Object;)Ljava/lang/Character;
      // 2ca: areturn
      // 2cb: aload 1
      // 2cc: iload 3
      // 2cd: ifeq 2f6
      // 2d0: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: if_acmpeq 2f5
      // 2dd: aload 1
      // 2de: ldc java/lang/Short
      // 2e0: iload 3
      // 2e1: ifeq 309
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: if_acmpne 2fa
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f4: athrow
      // 2f5: aload 0
      // 2f6: invokestatic com/finalshell/core/B8_2.Q (Ljava/lang/Object;)Ljava/lang/Short;
      // 2f9: areturn
      // 2fa: aload 1
      // 2fb: iload 3
      // 2fc: ifeq 326
      // 2ff: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 308: athrow
      // 309: if_acmpeq 325
      // 30c: aload 1
      // 30d: ldc_w java/lang/Integer
      // 310: iload 3
      // 311: ifeq 339
      // 314: goto 31b
      // 317: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: if_acmpne 32a
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 324: athrow
      // 325: aload 0
      // 326: invokestatic com/finalshell/core/B8_2.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 329: areturn
      // 32a: aload 1
      // 32b: iload 3
      // 32c: ifeq 356
      // 32f: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 332: goto 339
      // 335: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 338: athrow
      // 339: if_acmpeq 355
      // 33c: aload 1
      // 33d: ldc_w java/lang/Long
      // 340: iload 3
      // 341: ifeq 369
      // 344: goto 34b
      // 347: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: if_acmpne 35a
      // 34e: goto 355
      // 351: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 354: athrow
      // 355: aload 0
      // 356: invokestatic com/finalshell/core/B8_2.s (Ljava/lang/Object;)Ljava/lang/Long;
      // 359: areturn
      // 35a: aload 1
      // 35b: iload 3
      // 35c: ifeq 385
      // 35f: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 362: goto 369
      // 365: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: if_acmpeq 384
      // 36c: aload 1
      // 36d: ldc java/lang/Float
      // 36f: iload 3
      // 370: ifeq 398
      // 373: goto 37a
      // 376: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 379: athrow
      // 37a: if_acmpne 389
      // 37d: goto 384
      // 380: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 383: athrow
      // 384: aload 0
      // 385: invokestatic com/finalshell/core/B8_2.h (Ljava/lang/Object;)Ljava/lang/Float;
      // 388: areturn
      // 389: aload 1
      // 38a: iload 3
      // 38b: ifeq 3b4
      // 38e: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 391: goto 398
      // 394: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 397: athrow
      // 398: if_acmpeq 3b3
      // 39b: aload 1
      // 39c: ldc java/lang/Double
      // 39e: iload 3
      // 39f: ifeq 3bb
      // 3a2: goto 3a9
      // 3a5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a8: athrow
      // 3a9: if_acmpne 3b8
      // 3ac: goto 3b3
      // 3af: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b2: athrow
      // 3b3: aload 0
      // 3b4: invokestatic com/finalshell/core/B8_2.Z (Ljava/lang/Object;)Ljava/lang/Double;
      // 3b7: areturn
      // 3b8: aload 1
      // 3b9: ldc java/lang/String
      // 3bb: iload 3
      // 3bc: ifeq 3d5
      // 3bf: if_acmpne 3d2
      // 3c2: goto 3c9
      // 3c5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: invokestatic com/finalshell/core/B8_2.i (Ljava/lang/Object;)Ljava/lang/String;
      // 3cd: areturn
      // 3ce: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d1: athrow
      // 3d2: aload 1
      // 3d3: ldc java/math/BigDecimal
      // 3d5: iload 3
      // 3d6: ifeq 3f0
      // 3d9: if_acmpne 3ec
      // 3dc: goto 3e3
      // 3df: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e2: athrow
      // 3e3: aload 0
      // 3e4: invokestatic com/finalshell/core/B8_2.b (Ljava/lang/Object;)Ljava/math/BigDecimal;
      // 3e7: areturn
      // 3e8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3eb: athrow
      // 3ec: aload 1
      // 3ed: ldc_w java/math/BigInteger
      // 3f0: iload 3
      // 3f1: ifeq 416
      // 3f4: if_acmpne 407
      // 3f7: goto 3fe
      // 3fa: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fd: athrow
      // 3fe: aload 0
      // 3ff: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;)Ljava/math/BigInteger;
      // 402: areturn
      // 403: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 406: athrow
      // 407: aload 1
      // 408: iload 3
      // 409: ifeq 42a
      // 40c: ldc_w java/util/Date
      // 40f: goto 416
      // 412: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 415: athrow
      // 416: if_acmpne 422
      // 419: aload 0
      // 41a: invokestatic com/finalshell/core/B8_2.C (Ljava/lang/Object;)Ljava/util/Date;
      // 41d: areturn
      // 41e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 421: athrow
      // 422: getstatic com/finalshell/core/B8_2.I Lcom/finalshell/core/PK3;
      // 425: aload 0
      // 426: aload 1
      // 427: invokestatic com/finalshell/core/XJ.h (Lcom/finalshell/core/PK3;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 42a: astore 4
      // 42c: aload 4
      // 42e: iload 3
      // 42f: ifeq 43e
      // 432: ifnull 43f
      // 435: goto 43c
      // 438: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43b: athrow
      // 43c: aload 4
      // 43e: areturn
      // 43f: aload 1
      // 440: invokevirtual java/lang/Class.isEnum ()Z
      // 443: iload 3
      // 444: ifeq 46e
      // 447: ifeq 45c
      // 44a: goto 451
      // 44d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 450: athrow
      // 451: aload 0
      // 452: aload 1
      // 453: aload 2
      // 454: invokestatic com/finalshell/core/B8_2.c (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 457: areturn
      // 458: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45b: athrow
      // 45c: ldc_w java/util/Calendar
      // 45f: iload 3
      // 460: ifeq 4d8
      // 463: aload 1
      // 464: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 467: goto 46e
      // 46a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46d: athrow
      // 46e: ifeq 4d7
      // 471: aload 0
      // 472: invokestatic com/finalshell/core/B8_2.C (Ljava/lang/Object;)Ljava/util/Date;
      // 475: astore 5
      // 477: aload 1
      // 478: iload 3
      // 479: ifeq 49c
      // 47c: ldc_w java/util/Calendar
      // 47f: if_acmpne 498
      // 482: goto 489
      // 485: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 488: athrow
      // 489: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 48c: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 48f: invokestatic java/util/Calendar.getInstance (Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;
      // 492: astore 6
      // 494: iload 3
      // 495: ifne 4cd
      // 498: aload 1
      // 499: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 49c: checkcast java/util/Calendar
      // 49f: astore 6
      // 4a1: goto 4cd
      // 4a4: astore 7
      // 4a6: new com/finalshell/core/Hi2
      // 4a9: dup
      // 4aa: new java/lang/StringBuilder
      // 4ad: dup
      // 4ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b1: sipush -26464
      // 4b4: sipush 25444
      // 4b7: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 4ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bd: aload 1
      // 4be: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 4c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c7: aload 7
      // 4c9: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4cc: athrow
      // 4cd: aload 6
      // 4cf: aload 5
      // 4d1: invokevirtual java/util/Calendar.setTime (Ljava/util/Date;)V
      // 4d4: aload 6
      // 4d6: areturn
      // 4d7: aload 1
      // 4d8: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 4db: astore 5
      // 4dd: aload 5
      // 4df: sipush -26390
      // 4e2: sipush -17515
      // 4e5: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 4e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4eb: iload 3
      // 4ec: ifeq 529
      // 4ef: ifeq 51a
      // 4f2: goto 4f9
      // 4f5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f8: athrow
      // 4f9: aload 0
      // 4fa: invokestatic com/finalshell/core/B8_2.C (Ljava/lang/Object;)Ljava/util/Date;
      // 4fd: astore 6
      // 4ff: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 502: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 505: invokestatic java/util/Calendar.getInstance (Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;
      // 508: astore 7
      // 50a: aload 7
      // 50c: aload 6
      // 50e: invokevirtual java/util/Calendar.setTime (Ljava/util/Date;)V
      // 511: getstatic com/finalshell/core/Ze2.q Lcom/finalshell/core/Ze2;
      // 514: aload 7
      // 516: invokevirtual com/finalshell/core/Ze2.Z (Ljava/util/Calendar;)Ljavax/xml/datatype/XMLGregorianCalendar;
      // 519: areturn
      // 51a: aload 0
      // 51b: iload 3
      // 51c: ifeq 52d
      // 51f: instanceof java/lang/String
      // 522: goto 529
      // 525: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 528: athrow
      // 529: ifeq 5e4
      // 52c: aload 0
      // 52d: checkcast java/lang/String
      // 530: astore 6
      // 532: aload 6
      // 534: invokevirtual java/lang/String.length ()I
      // 537: iload 3
      // 538: ifeq 55a
      // 53b: ifeq 580
      // 53e: goto 545
      // 541: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 544: athrow
      // 545: sipush -26453
      // 548: sipush -1256
      // 54b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 54e: aload 6
      // 550: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 553: goto 55a
      // 556: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 559: athrow
      // 55a: iload 3
      // 55b: ifeq 57d
      // 55e: ifne 580
      // 561: goto 568
      // 564: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 567: athrow
      // 568: sipush -26432
      // 56b: sipush -21979
      // 56e: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 571: aload 6
      // 573: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 576: goto 57d
      // 579: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57c: athrow
      // 57d: ifeq 586
      // 580: aconst_null
      // 581: areturn
      // 582: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 585: athrow
      // 586: aload 1
      // 587: ldc_w java/util/Currency
      // 58a: iload 3
      // 58b: ifeq 5a6
      // 58e: if_acmpne 5a2
      // 591: goto 598
      // 594: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 597: athrow
      // 598: aload 6
      // 59a: invokestatic java/util/Currency.getInstance (Ljava/lang/String;)Ljava/util/Currency;
      // 59d: areturn
      // 59e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a1: athrow
      // 5a2: aload 1
      // 5a3: ldc_w java/util/Locale
      // 5a6: if_acmpne 5b3
      // 5a9: aload 6
      // 5ab: invokestatic com/finalshell/core/B8_2.h (Ljava/lang/String;)Ljava/util/Locale;
      // 5ae: areturn
      // 5af: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b2: athrow
      // 5b3: aload 5
      // 5b5: iload 3
      // 5b6: ifeq 5db
      // 5b9: sipush -26389
      // 5bc: sipush -31739
      // 5bf: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 5c2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 5c5: ifeq 5e4
      // 5c8: goto 5cf
      // 5cb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ce: athrow
      // 5cf: aload 6
      // 5d1: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 5d4: goto 5db
      // 5d7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5da: athrow
      // 5db: astore 7
      // 5dd: aload 7
      // 5df: aload 1
      // 5e0: invokestatic com/finalshell/core/Ok2.n (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 5e3: areturn
      // 5e4: aload 2
      // 5e5: aload 1
      // 5e6: invokevirtual com/finalshell/core/IG.x (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 5e9: astore 6
      // 5eb: aload 6
      // 5ed: iload 3
      // 5ee: ifeq 5fc
      // 5f1: ifnull 608
      // 5f4: goto 5fb
      // 5f7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5fa: athrow
      // 5fb: aload 0
      // 5fc: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 5ff: astore 7
      // 601: aload 7
      // 603: aload 1
      // 604: invokestatic com/finalshell/core/Ok2.n (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 607: areturn
      // 608: new com/finalshell/core/Hi2
      // 60b: dup
      // 60c: new java/lang/StringBuilder
      // 60f: dup
      // 610: invokespecial java/lang/StringBuilder.<init> ()V
      // 613: sipush -26464
      // 616: sipush 25444
      // 619: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 61c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61f: aload 1
      // 620: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 623: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 626: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 629: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 62c: athrow
   }

   public static Locale h(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: aload 0
      // 04: ldc_w "_"
      // 07: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 2
      // 0d: arraylength
      // 0e: bipush 1
      // 0f: iload 1
      // 10: ifne 2f
      // 13: if_icmpne 2c
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: new java/util/Locale
      // 20: dup
      // 21: aload 2
      // 22: bipush 0
      // 23: aaload
      // 24: invokespecial java/util/Locale.<init> (Ljava/lang/String;)V
      // 27: areturn
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 2
      // 2d: arraylength
      // 2e: bipush 2
      // 2f: if_icmpne 44
      // 32: new java/util/Locale
      // 35: dup
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: aload 2
      // 3a: bipush 1
      // 3b: aaload
      // 3c: invokespecial java/util/Locale.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 3f: areturn
      // 40: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: new java/util/Locale
      // 47: dup
      // 48: aload 2
      // 49: bipush 0
      // 4a: aaload
      // 4b: aload 2
      // 4c: bipush 1
      // 4d: aaload
      // 4e: aload 2
      // 4f: bipush 2
      // 50: aaload
      // 51: invokespecial java/util/Locale.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 54: areturn
   }

   public static Object c(Object param0, java.lang.Class param1, IG param2) {
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
      // 004: aload 0
      // 005: instanceof java/lang/String
      // 008: iload 3
      // 009: ifeq 077
      // 00c: ifeq 073
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: checkcast java/lang/String
      // 01a: astore 4
      // 01c: aload 4
      // 01e: invokevirtual java/lang/String.length ()I
      // 021: ifne 026
      // 024: aconst_null
      // 025: areturn
      // 026: aload 2
      // 027: iload 3
      // 028: ifeq 03a
      // 02b: ifnonnull 039
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 038: astore 2
      // 039: aload 2
      // 03a: aload 1
      // 03b: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 03e: astore 5
      // 040: aload 5
      // 042: iload 3
      // 043: ifeq 05c
      // 046: instanceof com/finalshell/core/Kh2
      // 049: ifeq 06c
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 5
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: checkcast com/finalshell/core/Kh2
      // 05f: astore 6
      // 061: aload 6
      // 063: aload 4
      // 065: invokestatic com/finalshell/core/B8_2.z$long (Ljava/lang/String;)J
      // 068: invokevirtual com/finalshell/core/Kh2.f (J)Ljava/lang/Enum;
      // 06b: areturn
      // 06c: aload 1
      // 06d: aload 4
      // 06f: invokestatic java/lang/Enum.valueOf (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
      // 072: areturn
      // 073: aload 0
      // 074: instanceof java/math/BigDecimal
      // 077: iload 3
      // 078: ifeq 0b1
      // 07b: ifeq 0ad
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 0
      // 086: checkcast java/math/BigDecimal
      // 089: invokestatic com/finalshell/core/B8_2.P (Ljava/math/BigDecimal;)I
      // 08c: istore 4
      // 08e: aload 1
      // 08f: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 092: astore 5
      // 094: iload 4
      // 096: iload 3
      // 097: ifeq 0b1
      // 09a: aload 5
      // 09c: arraylength
      // 09d: if_icmpge 0ad
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 5
      // 0a9: iload 4
      // 0ab: aaload
      // 0ac: areturn
      // 0ad: aload 0
      // 0ae: instanceof java/lang/Number
      // 0b1: iload 3
      // 0b2: ifeq 0cd
      // 0b5: ifeq 0e3
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: checkcast java/lang/Number
      // 0c3: invokevirtual java/lang/Number.intValue ()I
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: istore 4
      // 0cf: aload 1
      // 0d0: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 0d3: astore 5
      // 0d5: iload 4
      // 0d7: aload 5
      // 0d9: arraylength
      // 0da: if_icmpge 0e3
      // 0dd: aload 5
      // 0df: iload 4
      // 0e1: aaload
      // 0e2: areturn
      // 0e3: goto 10f
      // 0e6: astore 4
      // 0e8: new com/finalshell/core/Hi2
      // 0eb: dup
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: sipush -26380
      // 0f6: sipush -29100
      // 0f9: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ff: aload 1
      // 100: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 106: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 109: aload 4
      // 10b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 10e: athrow
      // 10f: new com/finalshell/core/Hi2
      // 112: dup
      // 113: new java/lang/StringBuilder
      // 116: dup
      // 117: invokespecial java/lang/StringBuilder.<init> ()V
      // 11a: sipush -26464
      // 11d: sipush 25444
      // 120: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: aload 1
      // 127: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 130: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 133: athrow
   }

   public static Object I(Object param0, Type param1, IG param2) {
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
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: aload 1
      // 0f: instanceof java/lang/Class
      // 12: iload 3
      // 13: ifeq 32
      // 16: ifeq 2e
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: checkcast java/lang/Class
      // 25: aload 2
      // 26: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 29: areturn
      // 2a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 1
      // 2f: instanceof java/lang/reflect/ParameterizedType
      // 32: iload 3
      // 33: ifeq 52
      // 36: ifeq 4e
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: checkcast java/lang/reflect/ParameterizedType
      // 45: aload 2
      // 46: invokestatic com/finalshell/core/B8_2.U (Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 49: areturn
      // 4a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 0
      // 4f: instanceof java/lang/String
      // 52: iload 3
      // 53: ifeq d4
      // 56: ifeq c5
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 0
      // 61: checkcast java/lang/String
      // 64: astore 4
      // 66: aload 4
      // 68: invokevirtual java/lang/String.length ()I
      // 6b: iload 3
      // 6c: ifeq 8e
      // 6f: ifeq bf
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: sipush -26453
      // 7c: sipush -1256
      // 7f: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 82: aload 4
      // 84: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: iload 3
      // 8f: ifeq b1
      // 92: ifne bf
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: sipush -26432
      // 9f: sipush -21979
      // a2: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // a5: aload 4
      // a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: iload 3
      // b2: ifeq d4
      // b5: ifeq c5
      // b8: goto bf
      // bb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be: athrow
      // bf: aconst_null
      // c0: areturn
      // c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c4: athrow
      // c5: aload 1
      // c6: iload 3
      // c7: ifeq d8
      // ca: instanceof java/lang/reflect/TypeVariable
      // cd: goto d4
      // d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d3: athrow
      // d4: ifeq d9
      // d7: aload 0
      // d8: areturn
      // d9: new com/finalshell/core/Hi2
      // dc: dup
      // dd: new java/lang/StringBuilder
      // e0: dup
      // e1: invokespecial java/lang/StringBuilder.<init> ()V
      // e4: sipush -26464
      // e7: sipush 25444
      // ea: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // f0: aload 1
      // f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f7: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // fa: athrow
   }

   public static Object U(Object param0, ParameterizedType param1, IG param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: aload 1
      // 004: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 009: astore 4
      // 00b: istore 3
      // 00c: aload 4
      // 00e: iload 3
      // 00f: ifeq 048
      // 012: ldc_w java/util/List
      // 015: if_acmpeq 039
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 4
      // 021: ldc_w java/util/ArrayList
      // 024: iload 3
      // 025: ifeq 12d
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: if_acmpne 11d
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 1
      // 03a: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 03f: bipush 0
      // 040: aaload
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: iload 3
      // 049: ifeq 11f
      // 04c: astore 5
      // 04e: aload 0
      // 04f: instanceof java/util/List
      // 052: ifeq 11d
      // 055: aload 0
      // 056: checkcast java/util/List
      // 059: astore 6
      // 05b: new java/util/ArrayList
      // 05e: dup
      // 05f: aload 6
      // 061: invokeinterface java/util/List.size ()I 1
      // 066: invokespecial java/util/ArrayList.<init> (I)V
      // 069: astore 7
      // 06b: aload 6
      // 06d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 072: astore 8
      // 074: aload 8
      // 076: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07b: ifeq 11a
      // 07e: aload 8
      // 080: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 085: astore 9
      // 087: aload 5
      // 089: iload 3
      // 08a: ifeq 10a
      // 08d: instanceof java/lang/Class
      // 090: ifeq 0fb
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 9
      // 09c: iload 3
      // 09d: ifeq 0f5
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: ifnull 0e3
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 9
      // 0b3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0b6: ldc_w com/finalshell/ui/model/O0
      // 0b9: iload 3
      // 0ba: ifeq 0f1
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: if_acmpne 0e3
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 9
      // 0d0: checkcast com/finalshell/ui/model/O0
      // 0d3: aload 5
      // 0d5: checkcast java/lang/Class
      // 0d8: aload 2
      // 0d9: bipush 0
      // 0da: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/Class;Lcom/finalshell/core/IG;I)Ljava/lang/Object;
      // 0dd: astore 10
      // 0df: iload 3
      // 0e0: ifne 10c
      // 0e3: aload 9
      // 0e5: aload 5
      // 0e7: checkcast java/lang/Class
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 0f5: astore 10
      // 0f7: iload 3
      // 0f8: ifne 10c
      // 0fb: aload 9
      // 0fd: aload 5
      // 0ff: aload 2
      // 100: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: astore 10
      // 10c: aload 7
      // 10e: aload 10
      // 110: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 115: pop
      // 116: iload 3
      // 117: ifne 074
      // 11a: aload 7
      // 11c: areturn
      // 11d: aload 4
      // 11f: iload 3
      // 120: ifeq 1c1
      // 123: ldc_w java/util/Set
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: if_acmpeq 1b2
      // 130: aload 4
      // 132: iload 3
      // 133: ifeq 1c1
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: ldc_w java/util/HashSet
      // 140: if_acmpeq 1b2
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 4
      // 14c: iload 3
      // 14d: ifeq 1c1
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: ldc_w java/util/TreeSet
      // 15a: if_acmpeq 1b2
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: aload 4
      // 166: iload 3
      // 167: ifeq 1c1
      // 16a: goto 171
      // 16d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: ldc_w java/util/Collection
      // 174: if_acmpeq 1b2
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: aload 4
      // 180: iload 3
      // 181: ifeq 1c1
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: ldc_w java/util/List
      // 18e: if_acmpeq 1b2
      // 191: goto 198
      // 194: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: aload 4
      // 19a: ldc_w java/util/ArrayList
      // 19d: iload 3
      // 19e: ifeq 2f8
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: if_acmpne 2e8
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b1: athrow
      // 1b2: aload 1
      // 1b3: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 1b8: bipush 0
      // 1b9: aaload
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: iload 3
      // 1c2: ifeq 2ea
      // 1c5: astore 5
      // 1c7: aload 0
      // 1c8: instanceof java/lang/Iterable
      // 1cb: ifeq 2e8
      // 1ce: aload 4
      // 1d0: ldc_w java/util/Set
      // 1d3: iload 3
      // 1d4: ifeq 1f4
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: if_acmpeq 202
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e7: athrow
      // 1e8: aload 4
      // 1ea: ldc_w java/util/HashSet
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f3: athrow
      // 1f4: iload 3
      // 1f5: ifeq 21b
      // 1f8: if_acmpne 20f
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 201: athrow
      // 202: new java/util/HashSet
      // 205: dup
      // 206: invokespecial java/util/HashSet.<init> ()V
      // 209: astore 6
      // 20b: iload 3
      // 20c: ifne 234
      // 20f: aload 4
      // 211: ldc_w java/util/TreeSet
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: if_acmpne 22b
      // 21e: new java/util/TreeSet
      // 221: dup
      // 222: invokespecial java/util/TreeSet.<init> ()V
      // 225: astore 6
      // 227: iload 3
      // 228: ifne 234
      // 22b: new java/util/ArrayList
      // 22e: dup
      // 22f: invokespecial java/util/ArrayList.<init> ()V
      // 232: astore 6
      // 234: aload 0
      // 235: checkcast java/lang/Iterable
      // 238: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 23d: astore 7
      // 23f: aload 7
      // 241: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 246: ifeq 2e5
      // 249: aload 7
      // 24b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 250: astore 8
      // 252: aload 5
      // 254: iload 3
      // 255: ifeq 2d5
      // 258: instanceof java/lang/Class
      // 25b: ifeq 2c6
      // 25e: goto 265
      // 261: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 264: athrow
      // 265: aload 8
      // 267: iload 3
      // 268: ifeq 2c0
      // 26b: goto 272
      // 26e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 271: athrow
      // 272: ifnull 2ae
      // 275: goto 27c
      // 278: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: aload 8
      // 27e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 281: ldc_w com/finalshell/ui/model/O0
      // 284: iload 3
      // 285: ifeq 2bc
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28e: athrow
      // 28f: if_acmpne 2ae
      // 292: goto 299
      // 295: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: aload 8
      // 29b: checkcast com/finalshell/ui/model/O0
      // 29e: aload 5
      // 2a0: checkcast java/lang/Class
      // 2a3: aload 2
      // 2a4: bipush 0
      // 2a5: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/Class;Lcom/finalshell/core/IG;I)Ljava/lang/Object;
      // 2a8: astore 9
      // 2aa: iload 3
      // 2ab: ifne 2d7
      // 2ae: aload 8
      // 2b0: aload 5
      // 2b2: checkcast java/lang/Class
      // 2b5: goto 2bc
      // 2b8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bb: athrow
      // 2bc: aload 2
      // 2bd: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 2c0: astore 9
      // 2c2: iload 3
      // 2c3: ifne 2d7
      // 2c6: aload 8
      // 2c8: aload 5
      // 2ca: aload 2
      // 2cb: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 2ce: goto 2d5
      // 2d1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d4: athrow
      // 2d5: astore 9
      // 2d7: aload 6
      // 2d9: aload 9
      // 2db: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 2e0: pop
      // 2e1: iload 3
      // 2e2: ifne 23f
      // 2e5: aload 6
      // 2e7: areturn
      // 2e8: aload 4
      // 2ea: iload 3
      // 2eb: ifeq 324
      // 2ee: ldc_w java/util/Map
      // 2f1: goto 2f8
      // 2f4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: if_acmpeq 315
      // 2fb: aload 4
      // 2fd: iload 3
      // 2fe: ifeq 3ae
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 307: athrow
      // 308: ldc_w java/util/HashMap
      // 30b: if_acmpne 3ad
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 314: athrow
      // 315: aload 1
      // 316: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 31b: bipush 0
      // 31c: aaload
      // 31d: goto 324
      // 320: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 323: athrow
      // 324: astore 5
      // 326: aload 1
      // 327: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 32c: bipush 1
      // 32d: aaload
      // 32e: astore 6
      // 330: aload 0
      // 331: instanceof java/util/Map
      // 334: iload 3
      // 335: ifeq 3bc
      // 338: ifeq 3ad
      // 33b: goto 342
      // 33e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 341: athrow
      // 342: new java/util/HashMap
      // 345: dup
      // 346: invokespecial java/util/HashMap.<init> ()V
      // 349: astore 7
      // 34b: aload 0
      // 34c: checkcast java/util/Map
      // 34f: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 354: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 359: astore 8
      // 35b: aload 8
      // 35d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 362: ifeq 3aa
      // 365: aload 8
      // 367: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 36c: checkcast java/util/Map$Entry
      // 36f: astore 9
      // 371: aload 9
      // 373: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 378: aload 5
      // 37a: aload 2
      // 37b: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 37e: astore 10
      // 380: aload 9
      // 382: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 387: aload 6
      // 389: aload 2
      // 38a: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 38d: astore 11
      // 38f: aload 7
      // 391: iload 3
      // 392: ifeq 3ac
      // 395: aload 10
      // 397: aload 11
      // 399: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 39e: pop
      // 39f: iload 3
      // 3a0: ifne 35b
      // 3a3: goto 3aa
      // 3a6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a9: athrow
      // 3aa: aload 7
      // 3ac: areturn
      // 3ad: aload 0
      // 3ae: iload 3
      // 3af: ifeq 3c0
      // 3b2: instanceof java/lang/String
      // 3b5: goto 3bc
      // 3b8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: ifeq 3d3
      // 3bf: aload 0
      // 3c0: checkcast java/lang/String
      // 3c3: astore 5
      // 3c5: aload 5
      // 3c7: invokevirtual java/lang/String.length ()I
      // 3ca: ifne 3d3
      // 3cd: aconst_null
      // 3ce: areturn
      // 3cf: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d2: athrow
      // 3d3: aload 1
      // 3d4: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 3d9: astore 5
      // 3db: aload 5
      // 3dd: iload 3
      // 3de: ifeq 3fa
      // 3e1: arraylength
      // 3e2: bipush 1
      // 3e3: if_icmpne 41d
      // 3e6: goto 3ed
      // 3e9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ec: athrow
      // 3ed: aload 1
      // 3ee: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 3f3: goto 3fa
      // 3f6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: bipush 0
      // 3fb: aaload
      // 3fc: astore 6
      // 3fe: aload 6
      // 400: iload 3
      // 401: ifeq 41f
      // 404: instanceof java/lang/reflect/WildcardType
      // 407: ifeq 41d
      // 40a: goto 411
      // 40d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 410: athrow
      // 411: aload 0
      // 412: aload 4
      // 414: aload 2
      // 415: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 418: areturn
      // 419: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41c: athrow
      // 41d: aload 4
      // 41f: iload 3
      // 420: ifeq 4c5
      // 423: ldc_w java/util/Map$Entry
      // 426: if_acmpne 4c3
      // 429: goto 430
      // 42c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42f: athrow
      // 430: aload 0
      // 431: instanceof java/util/Map
      // 434: iload 3
      // 435: ifeq 4c8
      // 438: goto 43f
      // 43b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43e: athrow
      // 43f: ifeq 4c3
      // 442: goto 449
      // 445: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 448: athrow
      // 449: aload 0
      // 44a: checkcast java/util/Map
      // 44d: invokeinterface java/util/Map.size ()I 1
      // 452: iload 3
      // 453: ifeq 4c8
      // 456: goto 45d
      // 459: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45c: athrow
      // 45d: bipush 1
      // 45e: if_icmpne 4c3
      // 461: goto 468
      // 464: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 467: athrow
      // 468: aload 0
      // 469: checkcast java/util/Map
      // 46c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 471: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 476: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47b: checkcast java/util/Map$Entry
      // 47e: astore 6
      // 480: aload 6
      // 482: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 487: astore 7
      // 489: aload 5
      // 48b: arraylength
      // 48c: iload 3
      // 48d: ifeq 4a7
      // 490: bipush 2
      // 491: if_icmpne 4c0
      // 494: goto 49b
      // 497: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49a: athrow
      // 49b: aload 7
      // 49d: instanceof java/util/Map
      // 4a0: goto 4a7
      // 4a3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a6: athrow
      // 4a7: ifeq 4c0
      // 4aa: aload 5
      // 4ac: bipush 1
      // 4ad: aaload
      // 4ae: astore 8
      // 4b0: aload 6
      // 4b2: aload 7
      // 4b4: aload 8
      // 4b6: aload 2
      // 4b7: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 4ba: invokeinterface java/util/Map$Entry.setValue (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4bf: pop
      // 4c0: aload 6
      // 4c2: areturn
      // 4c3: aload 4
      // 4c5: instanceof java/lang/Class
      // 4c8: ifeq 51b
      // 4cb: aload 2
      // 4cc: iload 3
      // 4cd: ifeq 4e6
      // 4d0: goto 4d7
      // 4d3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d6: athrow
      // 4d7: ifnonnull 4e5
      // 4da: goto 4e1
      // 4dd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e0: athrow
      // 4e1: getstatic com/finalshell/core/IG.D Lcom/finalshell/core/IG;
      // 4e4: astore 2
      // 4e5: aload 2
      // 4e6: aload 4
      // 4e8: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 4eb: astore 6
      // 4ed: aload 6
      // 4ef: iload 3
      // 4f0: ifeq 4fe
      // 4f3: ifnull 51b
      // 4f6: goto 4fd
      // 4f9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fc: athrow
      // 4fd: aload 0
      // 4fe: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 501: astore 7
      // 503: new com/finalshell/core/Yn4
      // 506: dup
      // 507: aload 7
      // 509: aload 2
      // 50a: invokespecial com/finalshell/core/Yn4.<init> (Ljava/lang/String;Lcom/finalshell/core/IG;)V
      // 50d: astore 8
      // 50f: aload 6
      // 511: aload 8
      // 513: aload 1
      // 514: aconst_null
      // 515: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 51a: areturn
      // 51b: new com/finalshell/core/Hi2
      // 51e: dup
      // 51f: new java/lang/StringBuilder
      // 522: dup
      // 523: invokespecial java/lang/StringBuilder.<init> ()V
      // 526: sipush -26464
      // 529: sipush 25444
      // 52c: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 52f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 532: aload 1
      // 533: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 536: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 539: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 53c: athrow
   }

   public static Object g(Map param0, java.lang.Class param1, IG param2) {
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
      // 004: aload 1
      // 005: iload 3
      // 006: ifeq 0cc
      // 009: ldc_w java/lang/StackTraceElement
      // 00c: if_acmpne 0c3
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: sipush -26459
      // 01a: sipush -26829
      // 01d: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 020: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 025: checkcast java/lang/String
      // 028: astore 4
      // 02a: aload 0
      // 02b: sipush -26435
      // 02e: sipush 25252
      // 031: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 034: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 039: checkcast java/lang/String
      // 03c: astore 5
      // 03e: aload 0
      // 03f: sipush -26479
      // 042: sipush -24571
      // 045: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 048: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 04d: checkcast java/lang/String
      // 050: astore 6
      // 052: aload 0
      // 053: sipush -26457
      // 056: sipush 22922
      // 059: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 05c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 061: checkcast java/lang/Number
      // 064: astore 8
      // 066: aload 8
      // 068: iload 3
      // 069: ifeq 086
      // 06c: ifnonnull 07d
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: bipush 0
      // 077: istore 7
      // 079: iload 3
      // 07a: ifne 0b3
      // 07d: aload 8
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: instanceof java/math/BigDecimal
      // 089: iload 3
      // 08a: ifeq 0b1
      // 08d: ifeq 0a5
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 8
      // 099: checkcast java/math/BigDecimal
      // 09c: invokevirtual java/math/BigDecimal.intValueExact ()I
      // 09f: istore 7
      // 0a1: iload 3
      // 0a2: ifne 0b3
      // 0a5: aload 8
      // 0a7: invokevirtual java/lang/Number.intValue ()I
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: istore 7
      // 0b3: new java/lang/StackTraceElement
      // 0b6: dup
      // 0b7: aload 4
      // 0b9: aload 5
      // 0bb: aload 6
      // 0bd: iload 7
      // 0bf: invokespecial java/lang/StackTraceElement.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
      // 0c2: areturn
      // 0c3: aload 0
      // 0c4: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 0c7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0cc: astore 4
      // 0ce: aload 4
      // 0d0: instanceof java/lang/String
      // 0d3: iload 3
      // 0d4: ifeq 166
      // 0d7: ifeq 157
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: checkcast java/lang/String
      // 0e6: astore 5
      // 0e8: aload 2
      // 0e9: iload 3
      // 0ea: ifeq 0fc
      // 0ed: ifnonnull 0fb
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: getstatic com/finalshell/core/IG.D Lcom/finalshell/core/IG;
      // 0fa: astore 2
      // 0fb: aload 2
      // 0fc: aload 5
      // 0fe: aconst_null
      // 0ff: invokevirtual com/finalshell/core/IG.Z (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
      // 102: astore 6
      // 104: aload 6
      // 106: iload 3
      // 107: ifeq 13d
      // 10a: ifnonnull 13b
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: new java/lang/ClassNotFoundException
      // 117: dup
      // 118: new java/lang/StringBuilder
      // 11b: dup
      // 11c: invokespecial java/lang/StringBuilder.<init> ()V
      // 11f: aload 5
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: sipush -26494
      // 127: sipush 5907
      // 12a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 133: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // 136: athrow
      // 137: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 6
      // 13d: aload 1
      // 13e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 141: iload 3
      // 142: ifeq 166
      // 145: ifne 157
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 0
      // 150: aload 6
      // 152: aload 2
      // 153: invokestatic com/finalshell/core/B8_2.g (Ljava/util/Map;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 156: areturn
      // 157: aload 1
      // 158: iload 3
      // 159: ifeq 1ea
      // 15c: invokevirtual java/lang/Class.isInterface ()Z
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: ifeq 1e9
      // 169: aload 0
      // 16a: iload 3
      // 16b: ifeq 18a
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: instanceof com/finalshell/ui/model/O0
      // 178: ifeq 193
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: aload 0
      // 183: goto 18a
      // 186: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: checkcast com/finalshell/ui/model/O0
      // 18d: astore 4
      // 18f: iload 3
      // 190: ifne 19d
      // 193: new com/finalshell/ui/model/O0
      // 196: dup
      // 197: aload 0
      // 198: invokespecial com/finalshell/ui/model/O0.<init> (Ljava/util/Map;)V
      // 19b: astore 4
      // 19d: aload 2
      // 19e: iload 3
      // 19f: ifeq 1b1
      // 1a2: ifnonnull 1b0
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 1af: astore 2
      // 1b0: aload 2
      // 1b1: aload 1
      // 1b2: invokevirtual com/finalshell/core/IG.x (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 1b5: astore 5
      // 1b7: aload 5
      // 1b9: iload 3
      // 1ba: ifeq 1e8
      // 1bd: ifnull 1d5
      // 1c0: goto 1c7
      // 1c3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: aload 4
      // 1c9: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 1cc: astore 6
      // 1ce: aload 6
      // 1d0: aload 1
      // 1d1: invokestatic com/finalshell/core/Ok2.n (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 1d4: areturn
      // 1d5: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 1d8: invokevirtual java/lang/Thread.getContextClassLoader ()Ljava/lang/ClassLoader;
      // 1db: bipush 1
      // 1dc: anewarray 100
      // 1df: dup
      // 1e0: bipush 0
      // 1e1: aload 1
      // 1e2: aastore
      // 1e3: aload 4
      // 1e5: invokestatic java/lang/reflect/Proxy.newProxyInstance (Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
      // 1e8: areturn
      // 1e9: aload 1
      // 1ea: ldc_w java/util/Locale
      // 1ed: iload 3
      // 1ee: ifeq 276
      // 1f1: if_acmpne 273
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: sipush -26487
      // 1ff: sipush -7323
      // 202: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 205: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 20a: astore 4
      // 20c: aload 0
      // 20d: sipush -26437
      // 210: sipush -6104
      // 213: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 216: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 21b: astore 5
      // 21d: aload 4
      // 21f: iload 3
      // 220: ifeq 239
      // 223: instanceof java/lang/String
      // 226: ifeq 273
      // 229: goto 230
      // 22c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22f: athrow
      // 230: aload 4
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: checkcast java/lang/String
      // 23c: astore 6
      // 23e: aload 5
      // 240: iload 3
      // 241: ifeq 266
      // 244: instanceof java/lang/String
      // 247: ifeq 264
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: aload 5
      // 253: checkcast java/lang/String
      // 256: astore 7
      // 258: new java/util/Locale
      // 25b: dup
      // 25c: aload 6
      // 25e: aload 7
      // 260: invokespecial java/util/Locale.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 263: areturn
      // 264: aload 5
      // 266: ifnonnull 273
      // 269: new java/util/Locale
      // 26c: dup
      // 26d: aload 6
      // 26f: invokespecial java/util/Locale.<init> (Ljava/lang/String;)V
      // 272: areturn
      // 273: aload 1
      // 274: ldc java/lang/String
      // 276: iload 3
      // 277: ifeq 2ad
      // 27a: if_acmpne 2a9
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 283: athrow
      // 284: aload 0
      // 285: iload 3
      // 286: ifeq 2a5
      // 289: goto 290
      // 28c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28f: athrow
      // 290: instanceof com/finalshell/ui/model/O0
      // 293: ifeq 2a9
      // 296: goto 29d
      // 299: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29c: athrow
      // 29d: aload 0
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a4: athrow
      // 2a5: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 2a8: areturn
      // 2a9: aload 1
      // 2aa: ldc_w com/finalshell/core/Ok2
      // 2ad: iload 3
      // 2ae: ifeq 2ec
      // 2b1: if_acmpne 2dd
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: iload 3
      // 2bd: ifeq 2dc
      // 2c0: goto 2c7
      // 2c3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c6: athrow
      // 2c7: instanceof com/finalshell/ui/model/O0
      // 2ca: ifeq 2dd
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d3: athrow
      // 2d4: aload 0
      // 2d5: goto 2dc
      // 2d8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: areturn
      // 2dd: aload 1
      // 2de: iload 3
      // 2df: ifeq 32c
      // 2e2: ldc_w java/util/LinkedHashMap
      // 2e5: goto 2ec
      // 2e8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2eb: athrow
      // 2ec: if_acmpne 32b
      // 2ef: aload 0
      // 2f0: instanceof com/finalshell/ui/model/O0
      // 2f3: iload 3
      // 2f4: ifeq 33b
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: ifeq 32b
      // 301: goto 308
      // 304: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 307: athrow
      // 308: aload 0
      // 309: checkcast com/finalshell/ui/model/O0
      // 30c: astore 4
      // 30e: aload 4
      // 310: invokevirtual com/finalshell/ui/model/O0.d ()Ljava/util/Map;
      // 313: astore 5
      // 315: aload 5
      // 317: instanceof java/util/LinkedHashMap
      // 31a: iload 3
      // 31b: ifeq 33b
      // 31e: ifeq 32b
      // 321: goto 328
      // 324: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 327: athrow
      // 328: aload 5
      // 32a: areturn
      // 32b: aload 1
      // 32c: iload 3
      // 32d: ifeq 341
      // 330: aload 0
      // 331: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33a: athrow
      // 33b: ifeq 340
      // 33e: aload 0
      // 33f: areturn
      // 340: aload 1
      // 341: ldc_w com/finalshell/ui/model/O0
      // 344: if_acmpne 350
      // 347: new com/finalshell/ui/model/O0
      // 34a: dup
      // 34b: aload 0
      // 34c: invokespecial com/finalshell/ui/model/O0.<init> (Ljava/util/Map;)V
      // 34f: areturn
      // 350: aload 2
      // 351: iload 3
      // 352: ifeq 362
      // 355: ifnonnull 363
      // 358: goto 35f
      // 35b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35e: athrow
      // 35f: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 362: astore 2
      // 363: aconst_null
      // 364: astore 4
      // 366: aload 2
      // 367: aload 1
      // 368: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 36b: astore 5
      // 36d: aload 5
      // 36f: iload 3
      // 370: ifeq 389
      // 373: instanceof com/finalshell/core/Ep4
      // 376: ifeq 38e
      // 379: goto 380
      // 37c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37f: athrow
      // 380: aload 5
      // 382: goto 389
      // 385: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 388: athrow
      // 389: checkcast com/finalshell/core/Ep4
      // 38c: astore 4
      // 38e: aload 4
      // 390: iload 3
      // 391: ifeq 3ce
      // 394: ifnonnull 3c7
      // 397: goto 39e
      // 39a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39d: athrow
      // 39e: new com/finalshell/core/Hi2
      // 3a1: dup
      // 3a2: new java/lang/StringBuilder
      // 3a5: dup
      // 3a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a9: sipush -26450
      // 3ac: sipush -6063
      // 3af: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 3b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b5: aload 1
      // 3b6: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 3b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3bf: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3c2: athrow
      // 3c3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c6: athrow
      // 3c7: aload 4
      // 3c9: aload 0
      // 3ca: aload 2
      // 3cb: invokevirtual com/finalshell/core/Ep4.g (Ljava/util/Map;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 3ce: areturn
      // 3cf: astore 4
      // 3d1: new com/finalshell/core/Hi2
      // 3d4: dup
      // 3d5: aload 4
      // 3d7: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 3da: aload 4
      // 3dc: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3df: athrow
   }

   public static void w() {
      java.lang.Class[] var10000;
      F.put(a(-26473, -20828), byte.class);
      F.put(a(-26372, -8818), short.class);
      F.put(a(-26492, -12073), int.class);
      F.put(a(-26374, 909), long.class);
      F.put(a(-26483, -14064), float.class);
      F.put(a(-26413, -19855), double.class);
      F.put(a(-26474, 16099), boolean.class);
      F.put(a(-26370, 27291), char.class);
      F.put(a(-26438, 16159), byte[].class);
      F.put(a(-26490, 17315), short[].class);
      F.put(a(-26467, 23298), int[].class);
      F.put(a(-26416, 19623), long[].class);
      F.put(a(-26430, -23616), float[].class);
      F.put(a(-26496, 23190), double[].class);
      F.put(a(-26419, -16436), boolean[].class);
      F.put(a(-26446, -20923), char[].class);
      F.put(a(-26429, -25889), byte[].class);
      F.put(a(-26462, 26965), short[].class);
      F.put(a(-26373, -5419), int[].class);
      F.put(a(-26463, -4211), long[].class);
      F.put(a(-26407, -27789), float[].class);
      F.put(a(-26400, -20101), double[].class);
      F.put(a(-26451, -11447), char[].class);
      F.put(a(-26396, 19393), boolean[].class);
      var10000 = new java.lang.Class[a(22904, 636548593017421579L)];
      var10000[0] = Object.class;
      var10000[1] = Cloneable.class;
      var10000[2] = L$Class(a(-26475, 32515));
      var10000[3] = Exception.class;
      var10000[4] = RuntimeException.class;
      var10000[5] = IllegalAccessError.class;
      var10000[a(6078, 4319501930786730447L)] = IllegalAccessException.class;
      var10000[a(1853, 4119604648051220754L)] = IllegalArgumentException.class;
      var10000[a(19781, 8483530750444399471L)] = IllegalMonitorStateException.class;
      var10000[a(21480, 6667078135964661200L)] = IllegalStateException.class;
      var10000[a(14715, 4791631734980189957L)] = IllegalThreadStateException.class;
      var10000[a(25054, 246111812493887401L)] = IndexOutOfBoundsException.class;
      var10000[a(20709, 6914261331315291810L)] = InstantiationError.class;
      var10000[a(13310, 1363231746186450394L)] = InstantiationException.class;
      var10000[a(11961, 5653209587161794712L)] = InternalError.class;
      var10000[a(16311, 4129311149589436865L)] = InterruptedException.class;
      var10000[a(7878, 8617774715938027716L)] = LinkageError.class;
      var10000[a(29298, 5599114029351064596L)] = NegativeArraySizeException.class;
      var10000[a(1323, 1191524381412107026L)] = NoClassDefFoundError.class;
      var10000[a(32447, 9046934990981486753L)] = NoSuchFieldError.class;
      var10000[a(28079, 7693173063517916143L)] = NoSuchFieldException.class;
      var10000[a(25362, 8601188648920892713L)] = NoSuchMethodError.class;
      var10000[a(12780, 245435123331667842L)] = NoSuchMethodException.class;
      var10000[a(17756, 9192958579855450915L)] = NullPointerException.class;
      var10000[a(14198, 5552867118068928869L)] = NumberFormatException.class;
      var10000[a(14185, 3822618477225480544L)] = OutOfMemoryError.class;
      var10000[a(16784, 2226050041719318462L)] = SecurityException.class;
      var10000[a(10913, 5976934311130008776L)] = StackOverflowError.class;
      var10000[a(28931, 7529084910228461430L)] = StringIndexOutOfBoundsException.class;
      var10000[a(14885, 4490981513893092357L)] = TypeNotPresentException.class;
      var10000[a(22994, 65045343476350911L)] = VerifyError.class;
      var10000[a(25946, 3506161093388354425L)] = StackTraceElement.class;
      var10000[a(13888, 462139182901825578L)] = HashMap.class;
      var10000[a(20723, 5100903747691181810L)] = LinkedHashMap.class;
      var10000[a(25545, 3657147046055790025L)] = Hashtable.class;
      var10000[a(4898, 5563843145188914453L)] = TreeMap.class;
      var10000[a(15838, 7141303170956270510L)] = IdentityHashMap.class;
      var10000[a(5118, 6491958643865630092L)] = WeakHashMap.class;
      var10000[a(14674, 1286322743797391179L)] = LinkedHashMap.class;
      var10000[a(22100, 893465562260369495L)] = HashSet.class;
      var10000[a(17959, 1170001856058482699L)] = LinkedHashSet.class;
      var10000[a(15182, 3284535094172720453L)] = TreeSet.class;
      var10000[a(7009, 3724746201463176480L)] = ArrayList.class;
      var10000[a(24703, 7934889816806803047L)] = TimeUnit.class;
      var10000[a(15087, 8511693049153428691L)] = ConcurrentHashMap.class;
      var10000[a(1835, 4874541196450570529L)] = AtomicInteger.class;
      var10000[a(12260, 3656697619790465448L)] = AtomicLong.class;
      var10000[a(13109, 2582304086745453854L)] = Collections.EMPTY_MAP.getClass();
      var10000[a(24129, 1072787716062967910L)] = Boolean.class;
      var10000[a(14892, 7063151424398695450L)] = Character.class;
      var10000[a(16355, 234656422676928898L)] = Byte.class;
      var10000[a(13063, 6187666330153751823L)] = Short.class;
      var10000[a(4241, 2025251482824881844L)] = Integer.class;
      var10000[a(7229, 2404307545026902622L)] = Long.class;
      var10000[a(14799, 5152796948206100417L)] = Float.class;
      var10000[a(20241, 2428323280908446009L)] = Double.class;
      var10000[a(26820, 8442941226749480637L)] = Number.class;
      var10000[a(28734, 1200516697054008872L)] = String.class;
      var10000[a(1486, 6152300889920906145L)] = BigDecimal.class;
      var10000[a(19789, 1069393444030770002L)] = BigInteger.class;
      var10000[a(31618, 9046499175075208652L)] = BitSet.class;
      var10000[a(26794, 309098881355009775L)] = Calendar.class;
      var10000[a(28066, 340619318853651385L)] = Date.class;
      var10000[a(5528, 2883443664868291477L)] = Locale.class;
      var10000[a(24133, 3417156029091543144L)] = UUID.class;
      var10000[a(8077, 5148750630974536127L)] = SimpleDateFormat.class;
      var10000[a(29292, 4218207633015788551L)] = O0.class;
      var10000[a(3939, 6773137405007767916L)] = Dp2.class;
      var10000[a(22504, 2153462906555888108L)] = Oc2.class;
      java.lang.Class[] var0 = var10000;

      for (java.lang.Class var4 : var0) {
         try {
            if (var4 == null) {
               continue;
            }
         } catch (Hi2 var5) {
            throw a(var5);
         }

         F.put(var4.getName(), var4);
      }

      XJ.w(M, F);
   }

   public static void b() {
      F.clear();
      w();
   }

   public static void Q(String var0, java.lang.Class var1) {
      F.put(var0, var1);
   }

   public static java.lang.Class L$Class(String var0) {
      return v(var0, null);
   }

   public static boolean Y(java.lang.Class param0) {
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
      // 04: getstatic com/finalshell/core/B8_2.C Ljava/lang/Class;
      // 07: iload 1
      // 08: ifeq 3c
      // 0b: ifnonnull 39
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic com/finalshell/core/B8_2.T Z
      // 18: ifne 39
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: sipush -26385
      // 25: sipush -24494
      // 28: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 2b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 2e: putstatic com/finalshell/core/B8_2.C Ljava/lang/Class;
      // 31: goto 39
      // 34: astore 2
      // 35: bipush 1
      // 36: putstatic com/finalshell/core/B8_2.T Z
      // 39: getstatic com/finalshell/core/B8_2.C Ljava/lang/Class;
      // 3c: iload 1
      // 3d: ifeq 4d
      // 40: ifnull 52
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: getstatic com/finalshell/core/B8_2.C Ljava/lang/Class;
      // 4d: aload 0
      // 4e: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 51: ireturn
      // 52: bipush 0
      // 53: ireturn
   }

   public static java.lang.Class A$Class(String var0) {
      return (java.lang.Class)F.get(var0);
   }

   public static java.lang.Class v(String var0, ClassLoader var1) {
      return n(var0, var1, false);
   }

   public static java.lang.Class n(String param0, ClassLoader param1, boolean param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ifnull 012
      // 004: aload 0
      // 005: invokevirtual java/lang/String.length ()I
      // 008: ifne 018
      // 00b: goto 012
      // 00e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aconst_null
      // 013: areturn
      // 014: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: invokevirtual java/lang/String.length ()I
      // 01c: sipush 13037
      // 01f: ldc2_w 8084534148420080791
      // 022: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 025: if_icmple 04e
      // 028: new com/finalshell/core/Hi2
      // 02b: dup
      // 02c: new java/lang/StringBuilder
      // 02f: dup
      // 030: invokespecial java/lang/StringBuilder.<init> ()V
      // 033: sipush -26386
      // 036: sipush -8886
      // 039: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 03c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03f: aload 0
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 046: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 049: athrow
      // 04a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: getstatic com/finalshell/core/B8_2.F Ljava/util/concurrent/ConcurrentMap;
      // 051: aload 0
      // 052: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 057: checkcast java/lang/Class
      // 05a: astore 3
      // 05b: aload 3
      // 05c: ifnull 065
      // 05f: aload 3
      // 060: areturn
      // 061: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 0
      // 066: bipush 0
      // 067: invokevirtual java/lang/String.charAt (I)C
      // 06a: sipush 14093
      // 06d: ldc2_w 945814716107100480
      // 070: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 073: if_icmpne 08b
      // 076: aload 0
      // 077: bipush 1
      // 078: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 07b: aload 1
      // 07c: invokestatic com/finalshell/core/B8_2.v (Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
      // 07f: astore 4
      // 081: aload 4
      // 083: bipush 0
      // 084: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 087: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 08a: areturn
      // 08b: aload 0
      // 08c: ldc_w "L"
      // 08f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 092: ifeq 0ba
      // 095: aload 0
      // 096: ldc_w ";"
      // 099: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 09c: ifeq 0ba
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: bipush 1
      // 0a8: aload 0
      // 0a9: invokevirtual java/lang/String.length ()I
      // 0ac: bipush 1
      // 0ad: isub
      // 0ae: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0b1: astore 4
      // 0b3: aload 4
      // 0b5: aload 1
      // 0b6: invokestatic com/finalshell/core/B8_2.v (Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
      // 0b9: areturn
      // 0ba: aload 1
      // 0bb: ifnull 0dc
      // 0be: aload 1
      // 0bf: aload 0
      // 0c0: invokevirtual java/lang/ClassLoader.loadClass (Ljava/lang/String;)Ljava/lang/Class;
      // 0c3: astore 3
      // 0c4: iload 2
      // 0c5: ifeq 0da
      // 0c8: getstatic com/finalshell/core/B8_2.F Ljava/util/concurrent/ConcurrentMap;
      // 0cb: aload 0
      // 0cc: aload 3
      // 0cd: invokeinterface java/util/concurrent/ConcurrentMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d2: pop
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 3
      // 0db: areturn
      // 0dc: goto 0e6
      // 0df: astore 4
      // 0e1: aload 4
      // 0e3: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 0e6: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 0e9: invokevirtual java/lang/Thread.getContextClassLoader ()Ljava/lang/ClassLoader;
      // 0ec: astore 4
      // 0ee: aload 4
      // 0f0: ifnull 11f
      // 0f3: aload 4
      // 0f5: aload 1
      // 0f6: if_acmpeq 11f
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 4
      // 102: aload 0
      // 103: invokevirtual java/lang/ClassLoader.loadClass (Ljava/lang/String;)Ljava/lang/Class;
      // 106: astore 3
      // 107: iload 2
      // 108: ifeq 11d
      // 10b: getstatic com/finalshell/core/B8_2.F Ljava/util/concurrent/ConcurrentMap;
      // 10e: aload 0
      // 10f: aload 3
      // 110: invokeinterface java/util/concurrent/ConcurrentMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 115: pop
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 3
      // 11e: areturn
      // 11f: goto 124
      // 122: astore 4
      // 124: aload 0
      // 125: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 128: astore 3
      // 129: iload 2
      // 12a: ifeq 13f
      // 12d: getstatic com/finalshell/core/B8_2.F Ljava/util/concurrent/ConcurrentMap;
      // 130: aload 0
      // 131: aload 3
      // 132: invokeinterface java/util/concurrent/ConcurrentMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 137: pop
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: aload 3
      // 140: areturn
      // 141: astore 4
      // 143: aload 3
      // 144: areturn
   }

   public static Zzzzd4BeanInfo L(java.lang.Class var0, Map var1, com.finalshell.ui.model.D var2) {
      return Z(var0, var1, var2, false);
   }

   public static Zzzzd4BeanInfo Z(java.lang.Class param0, Map param1, com.finalshell.ui.model.D param2, boolean param3) {
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
      // 004: ldc_w com/finalshell/core/O4
      // 007: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 00a: checkcast com/finalshell/core/O4
      // 00d: astore 5
      // 00f: istore 4
      // 011: aconst_null
      // 012: astore 6
      // 014: aconst_null
      // 015: astore 8
      // 017: aconst_null
      // 018: astore 9
      // 01a: aload 5
      // 01c: iload 4
      // 01e: ifeq 02d
      // 021: ifnull 1a8
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 5
      // 02d: invokeinterface com/finalshell/core/O4.Z$arrString ()[Ljava/lang/String; 1
      // 032: astore 6
      // 034: aload 5
      // 036: invokeinterface com/finalshell/core/O4.Z$String ()Ljava/lang/String; 1
      // 03b: astore 8
      // 03d: aload 8
      // 03f: invokevirtual java/lang/String.length ()I
      // 042: ifne 048
      // 045: aconst_null
      // 046: astore 8
      // 048: aload 5
      // 04a: invokeinterface com/finalshell/core/O4.n ()Lcom/finalshell/ui/model/D; 1
      // 04f: astore 10
      // 051: aload 10
      // 053: iload 4
      // 055: ifeq 06e
      // 058: getstatic com/finalshell/ui/model/D.NeverUseThisValueExceptDefaultValue Lcom/finalshell/ui/model/D;
      // 05b: if_acmpeq 06f
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 10
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: astore 2
      // 06f: aload 5
      // 071: invokeinterface com/finalshell/core/O4.u ()[Lcom/finalshell/ui/model/EP; 1
      // 076: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 079: istore 7
      // 07b: aload 0
      // 07c: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 07f: astore 11
      // 081: aload 11
      // 083: ifnull 10b
      // 086: aload 11
      // 088: iload 4
      // 08a: ifeq 10c
      // 08d: iload 4
      // 08f: ifeq 10c
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: ldc java/lang/Object
      // 09b: if_acmpeq 10b
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 11
      // 0a7: ldc_w com/finalshell/core/O4
      // 0aa: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0ad: checkcast com/finalshell/core/O4
      // 0b0: astore 12
      // 0b2: aload 12
      // 0b4: iload 4
      // 0b6: ifeq 0d8
      // 0b9: ifnonnull 0cf
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: iload 4
      // 0c5: ifne 10b
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 12
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: invokeinterface com/finalshell/core/O4.W ()Ljava/lang/String; 1
      // 0dd: astore 9
      // 0df: iload 4
      // 0e1: ifeq 106
      // 0e4: aload 9
      // 0e6: invokevirtual java/lang/String.length ()I
      // 0e9: ifeq 0ff
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: iload 4
      // 0f5: ifne 10b
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 11
      // 101: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 104: astore 11
      // 106: iload 4
      // 108: ifne 081
      // 10b: aload 0
      // 10c: invokevirtual java/lang/Class.getInterfaces ()[Ljava/lang/Class;
      // 10f: astore 11
      // 111: aload 11
      // 113: arraylength
      // 114: istore 12
      // 116: bipush 0
      // 117: istore 13
      // 119: iload 13
      // 11b: iload 12
      // 11d: if_icmpge 189
      // 120: aload 11
      // 122: iload 13
      // 124: aaload
      // 125: astore 14
      // 127: aload 14
      // 129: ldc_w com/finalshell/core/O4
      // 12c: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 12f: checkcast com/finalshell/core/O4
      // 132: astore 15
      // 134: iload 4
      // 136: ifeq 1a5
      // 139: iload 4
      // 13b: ifeq 184
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: aload 15
      // 147: ifnull 17a
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: aload 15
      // 153: invokeinterface com/finalshell/core/O4.W ()Ljava/lang/String; 1
      // 158: astore 9
      // 15a: iload 4
      // 15c: ifeq 184
      // 15f: aload 9
      // 161: invokevirtual java/lang/String.length ()I
      // 164: ifeq 17a
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16d: athrow
      // 16e: iload 4
      // 170: ifne 189
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: iinc 13 1
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: iload 4
      // 186: ifne 119
      // 189: aload 9
      // 18b: iload 4
      // 18d: ifeq 19c
      // 190: ifnull 1a5
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 9
      // 19c: invokevirtual java/lang/String.length ()I
      // 19f: ifne 1a5
      // 1a2: aconst_null
      // 1a3: astore 9
      // 1a5: goto 1ab
      // 1a8: bipush 0
      // 1a9: istore 7
      // 1ab: new java/util/HashMap
      // 1ae: dup
      // 1af: invokespecial java/util/HashMap.<init> ()V
      // 1b2: astore 10
      // 1b4: aload 0
      // 1b5: iload 4
      // 1b7: ifeq 1d9
      // 1ba: aload 10
      // 1bc: invokestatic com/finalshell/core/IG.J (Ljava/lang/Class;Ljava/util/Map;)V
      // 1bf: iload 3
      // 1c0: ifeq 1d8
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: aload 1
      // 1cc: bipush 0
      // 1cd: aload 2
      // 1ce: invokestatic com/finalshell/core/B8_2.r (Ljava/lang/Class;Ljava/util/Map;ZLcom/finalshell/ui/model/D;)Ljava/util/List;
      // 1d1: goto 1e3
      // 1d4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: aload 5
      // 1db: aload 1
      // 1dc: aload 10
      // 1de: bipush 0
      // 1df: aload 2
      // 1e0: invokestatic com/finalshell/core/B8_2.R (Ljava/lang/Class;Lcom/finalshell/core/O4;Ljava/util/Map;Ljava/util/Map;ZLcom/finalshell/ui/model/D;)Ljava/util/List;
      // 1e3: astore 11
      // 1e5: aload 11
      // 1e7: invokeinterface java/util/List.size ()I 1
      // 1ec: anewarray 85
      // 1ef: astore 12
      // 1f1: aload 11
      // 1f3: aload 12
      // 1f5: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1fa: pop
      // 1fb: aload 6
      // 1fd: iload 4
      // 1ff: ifeq 20e
      // 202: ifnull 242
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: aload 6
      // 20e: arraylength
      // 20f: iload 4
      // 211: ifeq 21f
      // 214: ifeq 242
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21d: athrow
      // 21e: iload 3
      // 21f: ifeq 230
      // 222: aload 0
      // 223: aload 1
      // 224: bipush 1
      // 225: aload 2
      // 226: invokestatic com/finalshell/core/B8_2.r (Ljava/lang/Class;Ljava/util/Map;ZLcom/finalshell/ui/model/D;)Ljava/util/List;
      // 229: goto 23b
      // 22c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22f: athrow
      // 230: aload 0
      // 231: aload 5
      // 233: aload 1
      // 234: aload 10
      // 236: bipush 1
      // 237: aload 2
      // 238: invokestatic com/finalshell/core/B8_2.R (Ljava/lang/Class;Lcom/finalshell/core/O4;Ljava/util/Map;Ljava/util/Map;ZLcom/finalshell/ui/model/D;)Ljava/util/List;
      // 23b: astore 14
      // 23d: iload 4
      // 23f: ifne 252
      // 242: new java/util/ArrayList
      // 245: dup
      // 246: aload 11
      // 248: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 24b: astore 14
      // 24d: aload 14
      // 24f: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 252: aload 14
      // 254: invokeinterface java/util/List.size ()I 1
      // 259: anewarray 85
      // 25c: astore 13
      // 25e: aload 14
      // 260: aload 13
      // 262: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 267: pop
      // 268: aload 13
      // 26a: iload 4
      // 26c: ifeq 287
      // 26f: aload 12
      // 271: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 274: ifeq 289
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27d: athrow
      // 27e: aload 12
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 286: athrow
      // 287: astore 13
      // 289: new com/finalshell/core/Zzzzd4BeanInfo
      // 28c: dup
      // 28d: aload 0
      // 28e: aload 5
      // 290: aload 8
      // 292: aload 9
      // 294: iload 7
      // 296: aload 12
      // 298: aload 13
      // 29a: invokespecial com/finalshell/core/Zzzzd4BeanInfo.<init> (Ljava/lang/Class;Lcom/finalshell/core/O4;Ljava/lang/String;Ljava/lang/String;I[Lcom/finalshell/core/Ph2;[Lcom/finalshell/core/Ph2;)V
      // 29d: areturn
   }

   public static List r(java.lang.Class var0, Map var1, boolean var2, com.finalshell.ui.model.D var3) {
      int var10000;
      java.lang.Class var8;
      var10000 = Ph2.w();
      LinkedHashMap var5 = new LinkedHashMap();
      java.lang.Class var6 = var0;
      int var4 = var10000;

      while (true) {
         if (var6 != null) {
            Field[] var7 = var6.getDeclaredFields();
            S(var6, var1, var3, var5, var7);
            var8 = var6.getSuperclass();
            if (var4 == 0) {
               break;
            }

            var6 = var8;
            if (var4 != 0) {
               continue;
            }
         }

         var8 = var0;
         break;
      }

      return M(var8, var2, var5);
   }

   public static List m(java.lang.Class var0, Map var1) {
      return Z(var0, var1, true);
   }

   public static List Z(java.lang.Class var0, Map var1, boolean var2) {
      O4 var3 = (O4)X(var0, O4.class);
      HashMap var4 = new HashMap();
      IG.J(var0, var4);
      return R(var0, var3, var1, var4, var2, com.finalshell.ui.model.D.CamelCase);
   }

   public static List R(java.lang.Class param0, O4 param1, Map param2, Map param3, boolean param4, com.finalshell.ui.model.D param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/LinkedHashMap
      // 003: dup
      // 004: invokespecial java/util/LinkedHashMap.<init> ()V
      // 007: astore 7
      // 009: aload 0
      // 00a: invokestatic com/finalshell/core/B8_2.O (Ljava/lang/Class;)Z
      // 00d: istore 8
      // 00f: invokestatic com/finalshell/core/Ph2.u ()I
      // 012: aconst_null
      // 013: astore 9
      // 015: istore 6
      // 017: aconst_null
      // 018: astore 10
      // 01a: aconst_null
      // 01b: astore 11
      // 01d: aconst_null
      // 01e: astore 12
      // 020: aload 0
      // 021: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 024: astore 13
      // 026: aload 13
      // 028: new com/finalshell/ui/model/Ki2
      // 02b: dup
      // 02c: invokespecial com/finalshell/ui/model/Ki2.<init> ()V
      // 02f: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 032: goto 037
      // 035: astore 14
      // 037: aload 13
      // 039: astore 14
      // 03b: aload 14
      // 03d: arraylength
      // 03e: istore 15
      // 040: bipush 0
      // 041: istore 16
      // 043: iload 16
      // 045: iload 15
      // 047: if_icmpge d3f
      // 04a: aload 14
      // 04c: iload 16
      // 04e: aaload
      // 04f: astore 17
      // 051: aload 17
      // 053: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 056: astore 18
      // 058: bipush 0
      // 059: istore 19
      // 05b: bipush 0
      // 05c: istore 20
      // 05e: bipush 0
      // 05f: istore 21
      // 061: aconst_null
      // 062: astore 22
      // 064: aload 17
      // 066: iload 6
      // 068: ifne 090
      // 06b: invokevirtual java/lang/reflect/Method.getModifiers ()I
      // 06e: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 071: ifeq 087
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: iload 6
      // 07d: ifeq d37
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 17
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 093: astore 23
      // 095: aload 23
      // 097: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 09a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 09d: iload 6
      // 09f: ifne 0c5
      // 0a2: ifeq 0b8
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: iload 6
      // 0ae: ifeq d37
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 17
      // 0ba: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0bd: arraylength
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: ifeq 0d4
      // 0c8: iload 6
      // 0ca: ifeq d37
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 23
      // 0d6: ldc_w java/lang/ClassLoader
      // 0d9: iload 6
      // 0db: ifne 0fb
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: if_acmpeq d37
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 23
      // 0f1: ldc_w java/io/InputStream
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: iload 6
      // 0fd: ifne 116
      // 100: if_acmpeq d37
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: aload 23
      // 10c: ldc_w java/io/Reader
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: if_acmpne 125
      // 119: iload 6
      // 11b: ifeq d37
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 18
      // 127: sipush -26393
      // 12a: sipush -5771
      // 12d: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 130: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 133: iload 6
      // 135: ifne 191
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: ifeq 17c
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: aload 23
      // 14b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 14e: sipush -26471
      // 151: sipush 804
      // 154: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 157: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15a: iload 6
      // 15c: ifne 191
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: ifeq 17c
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: iload 6
      // 172: ifeq d37
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: aload 18
      // 17e: sipush -26412
      // 181: sipush 23596
      // 184: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 187: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18a: goto 191
      // 18d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: iload 6
      // 193: ifne 1c6
      // 196: ifeq 1bd
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 17
      // 1a2: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 1a5: ldc java/lang/Throwable
      // 1a7: if_acmpne 1bd
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: iload 6
      // 1b3: ifeq d37
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bc: athrow
      // 1bd: iload 8
      // 1bf: goto 1c6
      // 1c2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: iload 6
      // 1c8: ifne 205
      // 1cb: ifeq 1fd
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: aload 18
      // 1d8: invokestatic com/finalshell/core/B8_2.j (Ljava/lang/Class;Ljava/lang/String;)Z
      // 1db: iload 6
      // 1dd: ifne 205
      // 1e0: goto 1e7
      // 1e3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: ifeq 1fd
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: iload 6
      // 1f3: ifeq d37
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fc: athrow
      // 1fd: bipush 0
      // 1fe: goto 205
      // 201: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 204: athrow
      // 205: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 208: astore 24
      // 20a: aload 17
      // 20c: ldc_w com/finalshell/core/E6
      // 20f: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 212: checkcast com/finalshell/core/E6
      // 215: astore 25
      // 217: aload 25
      // 219: iload 6
      // 21b: ifne 232
      // 21e: ifnonnull 230
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 227: athrow
      // 228: aload 0
      // 229: aload 17
      // 22b: invokestatic com/finalshell/core/B8_2.E (Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/finalshell/core/E6;
      // 22e: astore 25
      // 230: aload 25
      // 232: iload 6
      // 234: ifne 462
      // 237: ifnonnull 460
      // 23a: goto 241
      // 23d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: iload 8
      // 243: ifeq 460
      // 246: goto 24d
      // 249: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: aload 9
      // 24f: iload 6
      // 251: ifne 26d
      // 254: goto 25b
      // 257: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: ifnonnull 2fb
      // 25e: goto 265
      // 261: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 264: athrow
      // 265: aload 0
      // 266: invokevirtual java/lang/Class.getDeclaredConstructors ()[Ljava/lang/reflect/Constructor;
      // 269: astore 9
      // 26b: aload 9
      // 26d: invokestatic com/finalshell/core/B8_2.n ([Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;
      // 270: astore 26
      // 272: aload 26
      // 274: iload 6
      // 276: ifne 285
      // 279: ifnull 2fb
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: aload 26
      // 285: invokestatic com/finalshell/core/B8_2.R (Ljava/lang/reflect/Constructor;)[[Ljava/lang/annotation/Annotation;
      // 288: astore 10
      // 28a: aload 0
      // 28b: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Class;)[Ljava/lang/String;
      // 28e: astore 11
      // 290: aload 11
      // 292: iload 6
      // 294: ifne 2fd
      // 297: ifnull 2fb
      // 29a: goto 2a1
      // 29d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a0: athrow
      // 2a1: aload 11
      // 2a3: arraylength
      // 2a4: anewarray 179
      // 2a7: astore 27
      // 2a9: aload 11
      // 2ab: bipush 0
      // 2ac: aload 27
      // 2ae: bipush 0
      // 2af: aload 11
      // 2b1: arraylength
      // 2b2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2b5: aload 27
      // 2b7: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 2ba: aload 11
      // 2bc: arraylength
      // 2bd: newarray 9
      // 2bf: astore 12
      // 2c1: bipush 0
      // 2c2: istore 28
      // 2c4: iload 28
      // 2c6: aload 11
      // 2c8: arraylength
      // 2c9: if_icmpge 2f7
      // 2cc: aload 27
      // 2ce: aload 11
      // 2d0: iload 28
      // 2d2: aaload
      // 2d3: invokestatic java/util/Arrays.binarySearch ([Ljava/lang/Object;Ljava/lang/Object;)I
      // 2d6: istore 29
      // 2d8: aload 12
      // 2da: iload 29
      // 2dc: iload 28
      // 2de: sastore
      // 2df: iload 28
      // 2e1: bipush 1
      // 2e2: iadd
      // 2e3: i2s
      // 2e4: istore 28
      // 2e6: iload 6
      // 2e8: ifne 2fb
      // 2eb: iload 6
      // 2ed: ifeq 2c4
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f6: athrow
      // 2f7: aload 27
      // 2f9: astore 11
      // 2fb: aload 11
      // 2fd: ifnull 460
      // 300: aload 12
      // 302: ifnull 460
      // 305: goto 30c
      // 308: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30b: athrow
      // 30c: aload 18
      // 30e: iload 6
      // 310: ifne 340
      // 313: goto 31a
      // 316: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 319: athrow
      // 31a: sipush -26418
      // 31d: sipush 26998
      // 320: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 323: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 326: ifeq 460
      // 329: goto 330
      // 32c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32f: athrow
      // 330: aload 18
      // 332: bipush 3
      // 333: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 336: invokestatic com/finalshell/core/B8_2.y (Ljava/lang/String;)Ljava/lang/String;
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33f: athrow
      // 340: astore 26
      // 342: aload 11
      // 344: aload 26
      // 346: invokestatic java/util/Arrays.binarySearch ([Ljava/lang/Object;Ljava/lang/Object;)I
      // 349: istore 27
      // 34b: iload 27
      // 34d: iload 6
      // 34f: ifne 3a6
      // 352: ifge 3a4
      // 355: goto 35c
      // 358: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35b: athrow
      // 35c: bipush 0
      // 35d: istore 28
      // 35f: iload 28
      // 361: aload 11
      // 363: arraylength
      // 364: if_icmpge 3a4
      // 367: aload 26
      // 369: aload 11
      // 36b: iload 28
      // 36d: aaload
      // 36e: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 371: iload 6
      // 373: ifne 3a6
      // 376: iload 6
      // 378: ifne 38e
      // 37b: goto 382
      // 37e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 381: athrow
      // 382: ifeq 395
      // 385: goto 38c
      // 388: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38b: athrow
      // 38c: iload 28
      // 38e: istore 27
      // 390: iload 6
      // 392: ifeq 3a4
      // 395: iinc 28 1
      // 398: iload 6
      // 39a: ifeq 35f
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a3: athrow
      // 3a4: iload 27
      // 3a6: iload 6
      // 3a8: ifne 3c1
      // 3ab: iflt 460
      // 3ae: goto 3b5
      // 3b1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b4: athrow
      // 3b5: aload 12
      // 3b7: iload 27
      // 3b9: saload
      // 3ba: goto 3c1
      // 3bd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c0: athrow
      // 3c1: istore 28
      // 3c3: aload 10
      // 3c5: iload 28
      // 3c7: aaload
      // 3c8: astore 29
      // 3ca: aload 29
      // 3cc: iload 6
      // 3ce: ifne 3dd
      // 3d1: ifnull 429
      // 3d4: goto 3db
      // 3d7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3da: athrow
      // 3db: aload 29
      // 3dd: astore 30
      // 3df: aload 30
      // 3e1: arraylength
      // 3e2: istore 31
      // 3e4: bipush 0
      // 3e5: istore 32
      // 3e7: iload 32
      // 3e9: iload 31
      // 3eb: if_icmpge 429
      // 3ee: aload 30
      // 3f0: iload 32
      // 3f2: aaload
      // 3f3: astore 33
      // 3f5: iload 6
      // 3f7: ifne 424
      // 3fa: aload 33
      // 3fc: instanceof com/finalshell/core/E6
      // 3ff: iload 6
      // 401: ifne 045
      // 404: goto 40b
      // 407: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40a: athrow
      // 40b: ifeq 41a
      // 40e: aload 33
      // 410: checkcast com/finalshell/core/E6
      // 413: astore 25
      // 415: iload 6
      // 417: ifeq 429
      // 41a: iinc 32 1
      // 41d: goto 424
      // 420: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 423: athrow
      // 424: iload 6
      // 426: ifeq 3e7
      // 429: aload 25
      // 42b: iload 6
      // 42d: ifne 462
      // 430: ifnonnull 460
      // 433: goto 43a
      // 436: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 439: athrow
      // 43a: aload 26
      // 43c: aload 3
      // 43d: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // 440: astore 30
      // 442: aload 30
      // 444: iload 6
      // 446: ifne 455
      // 449: ifnull 460
      // 44c: goto 453
      // 44f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 452: athrow
      // 453: aload 30
      // 455: ldc_w com/finalshell/core/E6
      // 458: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 45b: checkcast com/finalshell/core/E6
      // 45e: astore 25
      // 460: aload 25
      // 462: iload 6
      // 464: ifne 473
      // 467: ifnull 567
      // 46a: goto 471
      // 46d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 470: athrow
      // 471: aload 25
      // 473: invokeinterface com/finalshell/core/E6.W$boolean ()Z 1
      // 478: iload 6
      // 47a: ifne 4be
      // 47d: ifne 493
      // 480: goto 487
      // 483: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 486: athrow
      // 487: iload 6
      // 489: ifeq d37
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 492: athrow
      // 493: aload 25
      // 495: invokeinterface com/finalshell/core/E6.I ()I 1
      // 49a: istore 19
      // 49c: aload 25
      // 49e: invokeinterface com/finalshell/core/E6.N ()[Lcom/finalshell/ui/model/EP; 1
      // 4a3: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 4a6: istore 20
      // 4a8: aload 25
      // 4aa: invokeinterface com/finalshell/core/E6.M ()[Lcom/finalshell/ui/model/Ks2_2; 1
      // 4af: invokestatic com/finalshell/ui/model/Ks2_2.C ([Lcom/finalshell/ui/model/Ks2_2;)I
      // 4b2: istore 21
      // 4b4: aload 25
      // 4b6: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 4bb: invokevirtual java/lang/String.length ()I
      // 4be: iload 6
      // 4c0: ifne 554
      // 4c3: ifeq 537
      // 4c6: goto 4cd
      // 4c9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cc: athrow
      // 4cd: aload 25
      // 4cf: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 4d4: astore 26
      // 4d6: aload 2
      // 4d7: iload 6
      // 4d9: ifne 4f5
      // 4dc: ifnull 50b
      // 4df: goto 4e6
      // 4e2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e5: athrow
      // 4e6: aload 2
      // 4e7: aload 26
      // 4e9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4ee: goto 4f5
      // 4f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f4: athrow
      // 4f5: checkcast java/lang/String
      // 4f8: astore 26
      // 4fa: aload 26
      // 4fc: ifnonnull 50b
      // 4ff: iload 6
      // 501: ifeq d37
      // 504: goto 50b
      // 507: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50a: athrow
      // 50b: new com/finalshell/core/Ph2
      // 50e: dup
      // 50f: aload 26
      // 511: aload 17
      // 513: aconst_null
      // 514: aload 0
      // 515: aconst_null
      // 516: iload 19
      // 518: iload 20
      // 51a: iload 21
      // 51c: aload 25
      // 51e: aconst_null
      // 51f: aload 22
      // 521: invokespecial com/finalshell/core/Ph2.<init> (Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILcom/finalshell/core/E6;Lcom/finalshell/core/E6;Ljava/lang/String;)V
      // 524: astore 27
      // 526: aload 7
      // 528: aload 26
      // 52a: aload 27
      // 52c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 531: pop
      // 532: iload 6
      // 534: ifeq d37
      // 537: aload 25
      // 539: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 53e: iload 6
      // 540: ifne 565
      // 543: goto 54a
      // 546: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 549: athrow
      // 54a: invokevirtual java/lang/String.length ()I
      // 54d: goto 554
      // 550: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 553: athrow
      // 554: ifeq 567
      // 557: aload 25
      // 559: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 55e: goto 565
      // 561: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 564: athrow
      // 565: astore 22
      // 567: aload 18
      // 569: sipush -26423
      // 56c: sipush -10280
      // 56f: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 572: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 575: iload 6
      // 577: ifne 9d6
      // 57a: ifeq 9c8
      // 57d: goto 584
      // 580: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 583: athrow
      // 584: aload 18
      // 586: invokevirtual java/lang/String.length ()I
      // 589: iload 6
      // 58b: ifne 5c1
      // 58e: goto 595
      // 591: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 594: athrow
      // 595: bipush 4
      // 596: if_icmpge 5ac
      // 599: goto 5a0
      // 59c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59f: athrow
      // 5a0: iload 6
      // 5a2: ifeq d37
      // 5a5: goto 5ac
      // 5a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ab: athrow
      // 5ac: aload 18
      // 5ae: sipush -26444
      // 5b1: sipush -19428
      // 5b4: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 5b7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5ba: goto 5c1
      // 5bd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c0: athrow
      // 5c1: iload 6
      // 5c3: ifne 5f1
      // 5c6: ifeq 5dc
      // 5c9: goto 5d0
      // 5cc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5cf: athrow
      // 5d0: iload 6
      // 5d2: ifeq d37
      // 5d5: goto 5dc
      // 5d8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5db: athrow
      // 5dc: aload 18
      // 5de: sipush -26480
      // 5e1: sipush 16769
      // 5e4: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 5e7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5ea: goto 5f1
      // 5ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f0: athrow
      // 5f1: iload 6
      // 5f3: ifne 633
      // 5f6: ifeq 626
      // 5f9: goto 600
      // 5fc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ff: athrow
      // 600: aload 0
      // 601: invokevirtual java/lang/Class.isEnum ()Z
      // 604: iload 6
      // 606: ifne 633
      // 609: goto 610
      // 60c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60f: athrow
      // 610: ifeq 626
      // 613: goto 61a
      // 616: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 619: athrow
      // 61a: iload 6
      // 61c: ifeq d37
      // 61f: goto 626
      // 622: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 625: athrow
      // 626: aload 18
      // 628: bipush 3
      // 629: invokevirtual java/lang/String.charAt (I)C
      // 62c: goto 633
      // 62f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 632: athrow
      // 633: istore 26
      // 635: aconst_null
      // 636: astore 28
      // 638: iload 26
      // 63a: invokestatic java/lang/Character.isUpperCase (C)Z
      // 63d: iload 6
      // 63f: ifne 670
      // 642: ifne 66d
      // 645: goto 64c
      // 648: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64b: athrow
      // 64c: iload 26
      // 64e: sipush 15667
      // 651: ldc2_w 8129710089975405324
      // 654: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 657: iload 6
      // 659: ifne 6ac
      // 65c: goto 663
      // 65f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 662: athrow
      // 663: if_icmple 69a
      // 666: goto 66d
      // 669: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66c: athrow
      // 66d: getstatic com/finalshell/core/B8_2.i Z
      // 670: ifeq 683
      // 673: aload 18
      // 675: bipush 3
      // 676: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 679: invokestatic com/finalshell/core/B8_2.y (Ljava/lang/String;)Ljava/lang/String;
      // 67c: astore 27
      // 67e: iload 6
      // 680: ifeq 68a
      // 683: aload 18
      // 685: invokestatic com/finalshell/core/B8_2.L$String (Ljava/lang/String;)Ljava/lang/String;
      // 688: astore 27
      // 68a: aload 3
      // 68b: aload 18
      // 68d: aload 27
      // 68f: bipush 3
      // 690: invokestatic com/finalshell/core/B8_2.Z (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
      // 693: astore 27
      // 695: iload 6
      // 697: ifeq 79b
      // 69a: iload 26
      // 69c: sipush 12202
      // 69f: ldc2_w 1587617516911856038
      // 6a2: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 6a5: goto 6ac
      // 6a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6ab: athrow
      // 6ac: iload 6
      // 6ae: ifne 70c
      // 6b1: if_icmpne 701
      // 6b4: goto 6bb
      // 6b7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6ba: athrow
      // 6bb: aload 18
      // 6bd: bipush 3
      // 6be: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 6c1: astore 27
      // 6c3: aload 3
      // 6c4: aload 27
      // 6c6: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6cb: checkcast java/lang/reflect/Field
      // 6ce: astore 28
      // 6d0: aload 28
      // 6d2: ifnonnull 79b
      // 6d5: aload 27
      // 6d7: astore 29
      // 6d9: aload 18
      // 6db: bipush 4
      // 6dc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 6df: astore 27
      // 6e1: aload 27
      // 6e3: iload 6
      // 6e5: ifne 6fc
      // 6e8: aload 3
      // 6e9: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // 6ec: astore 28
      // 6ee: aload 28
      // 6f0: ifnonnull 6fe
      // 6f3: aload 29
      // 6f5: goto 6fc
      // 6f8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6fb: athrow
      // 6fc: astore 27
      // 6fe: goto 79b
      // 701: iload 26
      // 703: sipush 14279
      // 706: ldc2_w 5480488426780365247
      // 709: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 70c: iload 6
      // 70e: ifne 741
      // 711: if_icmpne 728
      // 714: goto 71b
      // 717: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71a: athrow
      // 71b: aload 18
      // 71d: bipush 3
      // 71e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 721: astore 27
      // 723: iload 6
      // 725: ifeq 79b
      // 728: aload 18
      // 72a: iload 6
      // 72c: ifne 780
      // 72f: goto 736
      // 732: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 735: athrow
      // 736: invokevirtual java/lang/String.length ()I
      // 739: bipush 5
      // 73a: goto 741
      // 73d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 740: athrow
      // 741: if_icmplt 773
      // 744: aload 18
      // 746: bipush 4
      // 747: iload 6
      // 749: ifne 77d
      // 74c: goto 753
      // 74f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 752: athrow
      // 753: invokevirtual java/lang/String.charAt (I)C
      // 756: invokestatic java/lang/Character.isUpperCase (C)Z
      // 759: ifeq 773
      // 75c: goto 763
      // 75f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 762: athrow
      // 763: aload 18
      // 765: bipush 3
      // 766: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 769: invokestatic com/finalshell/core/B8_2.y (Ljava/lang/String;)Ljava/lang/String;
      // 76c: astore 27
      // 76e: iload 6
      // 770: ifeq 79b
      // 773: aload 18
      // 775: bipush 3
      // 776: goto 77d
      // 779: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77c: athrow
      // 77d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 780: astore 27
      // 782: aload 27
      // 784: aload 3
      // 785: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // 788: astore 28
      // 78a: aload 28
      // 78c: ifnonnull 79b
      // 78f: iload 6
      // 791: ifeq d37
      // 794: goto 79b
      // 797: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79a: athrow
      // 79b: aload 0
      // 79c: aload 27
      // 79e: invokestatic com/finalshell/core/B8_2.L (Ljava/lang/Class;Ljava/lang/String;)Z
      // 7a1: istore 29
      // 7a3: iload 29
      // 7a5: ifeq 7b4
      // 7a8: iload 6
      // 7aa: ifeq d37
      // 7ad: goto 7b4
      // 7b0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b3: athrow
      // 7b4: aload 28
      // 7b6: iload 6
      // 7b8: ifne 7d6
      // 7bb: goto 7c2
      // 7be: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c1: athrow
      // 7c2: ifnonnull 7d4
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7cb: athrow
      // 7cc: aload 27
      // 7ce: aload 3
      // 7cf: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // 7d2: astore 28
      // 7d4: aload 28
      // 7d6: ifnonnull 846
      // 7d9: aload 27
      // 7db: invokevirtual java/lang/String.length ()I
      // 7de: iload 6
      // 7e0: ifne 802
      // 7e3: goto 7ea
      // 7e6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e9: athrow
      // 7ea: bipush 1
      // 7eb: if_icmple 846
      // 7ee: goto 7f5
      // 7f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f4: athrow
      // 7f5: aload 27
      // 7f7: bipush 1
      // 7f8: invokevirtual java/lang/String.charAt (I)C
      // 7fb: goto 802
      // 7fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 801: athrow
      // 802: istore 30
      // 804: iload 30
      // 806: sipush 10648
      // 809: ldc2_w 8362706924682317783
      // 80c: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 80f: iload 6
      // 811: ifne 830
      // 814: if_icmplt 846
      // 817: goto 81e
      // 81a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81d: athrow
      // 81e: iload 30
      // 820: sipush 15521
      // 823: ldc2_w 5660554601004309128
      // 826: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 829: goto 830
      // 82c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82f: athrow
      // 830: if_icmpgt 846
      // 833: aload 18
      // 835: bipush 3
      // 836: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 839: invokestatic com/finalshell/core/B8_2.y (Ljava/lang/String;)Ljava/lang/String;
      // 83c: astore 31
      // 83e: aload 31
      // 840: aload 3
      // 841: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // 844: astore 28
      // 846: aconst_null
      // 847: astore 30
      // 849: aload 28
      // 84b: iload 6
      // 84d: ifne 85c
      // 850: ifnull 946
      // 853: goto 85a
      // 856: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 859: athrow
      // 85a: aload 28
      // 85c: ldc_w com/finalshell/core/E6
      // 85f: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 862: checkcast com/finalshell/core/E6
      // 865: astore 30
      // 867: aload 30
      // 869: iload 6
      // 86b: ifne 87a
      // 86e: ifnull 946
      // 871: goto 878
      // 874: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 877: athrow
      // 878: aload 30
      // 87a: invokeinterface com/finalshell/core/E6.W$boolean ()Z 1
      // 87f: iload 6
      // 881: ifne 8c5
      // 884: ifne 89a
      // 887: goto 88e
      // 88a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88d: athrow
      // 88e: iload 6
      // 890: ifeq d37
      // 893: goto 89a
      // 896: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 899: athrow
      // 89a: aload 30
      // 89c: invokeinterface com/finalshell/core/E6.I ()I 1
      // 8a1: istore 19
      // 8a3: aload 30
      // 8a5: invokeinterface com/finalshell/core/E6.N ()[Lcom/finalshell/ui/model/EP; 1
      // 8aa: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 8ad: istore 20
      // 8af: aload 30
      // 8b1: invokeinterface com/finalshell/core/E6.M ()[Lcom/finalshell/ui/model/Ks2_2; 1
      // 8b6: invokestatic com/finalshell/ui/model/Ks2_2.C ([Lcom/finalshell/ui/model/Ks2_2;)I
      // 8b9: istore 21
      // 8bb: aload 30
      // 8bd: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 8c2: invokevirtual java/lang/String.length ()I
      // 8c5: iload 6
      // 8c7: ifne 933
      // 8ca: ifeq 916
      // 8cd: goto 8d4
      // 8d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d3: athrow
      // 8d4: bipush 1
      // 8d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d8: astore 24
      // 8da: aload 30
      // 8dc: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 8e1: iload 6
      // 8e3: ifne 924
      // 8e6: astore 27
      // 8e8: aload 2
      // 8e9: ifnull 916
      // 8ec: aload 2
      // 8ed: aload 27
      // 8ef: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8f4: checkcast java/lang/String
      // 8f7: astore 27
      // 8f9: aload 27
      // 8fb: iload 6
      // 8fd: ifne 924
      // 900: ifnonnull 916
      // 903: goto 90a
      // 906: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 909: athrow
      // 90a: iload 6
      // 90c: ifeq d37
      // 90f: goto 916
      // 912: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 915: athrow
      // 916: aload 30
      // 918: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 91d: goto 924
      // 920: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 923: athrow
      // 924: iload 6
      // 926: ifne 944
      // 929: invokevirtual java/lang/String.length ()I
      // 92c: goto 933
      // 92f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 932: athrow
      // 933: ifeq 946
      // 936: aload 30
      // 938: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 93d: goto 944
      // 940: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 943: athrow
      // 944: astore 22
      // 946: aload 2
      // 947: iload 6
      // 949: ifne 965
      // 94c: ifnull 97b
      // 94f: goto 956
      // 952: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 955: athrow
      // 956: aload 2
      // 957: aload 27
      // 959: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 95e: goto 965
      // 961: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 964: athrow
      // 965: checkcast java/lang/String
      // 968: astore 27
      // 96a: aload 27
      // 96c: ifnonnull 97b
      // 96f: iload 6
      // 971: ifeq d37
      // 974: goto 97b
      // 977: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97a: athrow
      // 97b: aload 5
      // 97d: ifnull 99f
      // 980: goto 987
      // 983: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 986: athrow
      // 987: aload 24
      // 989: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 98c: ifne 99f
      // 98f: goto 996
      // 992: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 995: athrow
      // 996: aload 5
      // 998: aload 27
      // 99a: invokevirtual com/finalshell/ui/model/D.C (Ljava/lang/String;)Ljava/lang/String;
      // 99d: astore 27
      // 99f: new com/finalshell/core/Ph2
      // 9a2: dup
      // 9a3: aload 27
      // 9a5: aload 17
      // 9a7: aload 28
      // 9a9: aload 0
      // 9aa: aconst_null
      // 9ab: iload 19
      // 9ad: iload 20
      // 9af: iload 21
      // 9b1: aload 25
      // 9b3: aload 30
      // 9b5: aload 22
      // 9b7: invokespecial com/finalshell/core/Ph2.<init> (Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILcom/finalshell/core/E6;Lcom/finalshell/core/E6;Ljava/lang/String;)V
      // 9ba: astore 31
      // 9bc: aload 7
      // 9be: aload 27
      // 9c0: aload 31
      // 9c2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 9c7: pop
      // 9c8: aload 18
      // 9ca: sipush -26486
      // 9cd: sipush 241
      // 9d0: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 9d3: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 9d6: iload 6
      // 9d8: ifne 9f1
      // 9db: ifeq d37
      // 9de: goto 9e5
      // 9e1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e4: athrow
      // 9e5: aload 18
      // 9e7: invokevirtual java/lang/String.length ()I
      // 9ea: goto 9f1
      // 9ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f0: athrow
      // 9f1: bipush 3
      // 9f2: if_icmpge a01
      // 9f5: iload 6
      // 9f7: ifeq d37
      // 9fa: goto a01
      // 9fd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a00: athrow
      // a01: aload 23
      // a03: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // a06: iload 6
      // a08: ifne a27
      // a0b: goto a12
      // a0e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a11: athrow
      // a12: if_acmpeq a36
      // a15: goto a1c
      // a18: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1b: athrow
      // a1c: aload 23
      // a1e: ldc java/lang/Boolean
      // a20: goto a27
      // a23: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a26: athrow
      // a27: if_acmpeq a36
      // a2a: iload 6
      // a2c: ifeq d37
      // a2f: goto a36
      // a32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a35: athrow
      // a36: aload 18
      // a38: bipush 2
      // a39: invokevirtual java/lang/String.charAt (I)C
      // a3c: istore 26
      // a3e: aconst_null
      // a3f: astore 28
      // a41: iload 26
      // a43: invokestatic java/lang/Character.isUpperCase (C)Z
      // a46: iload 6
      // a48: ifne aac
      // a4b: ifeq aa3
      // a4e: goto a55
      // a51: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a54: athrow
      // a55: getstatic com/finalshell/core/B8_2.i Z
      // a58: ifeq a72
      // a5b: goto a62
      // a5e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a61: athrow
      // a62: aload 18
      // a64: bipush 2
      // a65: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // a68: invokestatic com/finalshell/core/B8_2.y (Ljava/lang/String;)Ljava/lang/String;
      // a6b: astore 27
      // a6d: iload 6
      // a6f: ifeq a93
      // a72: new java/lang/StringBuilder
      // a75: dup
      // a76: invokespecial java/lang/StringBuilder.<init> ()V
      // a79: aload 18
      // a7b: bipush 2
      // a7c: invokevirtual java/lang/String.charAt (I)C
      // a7f: invokestatic java/lang/Character.toLowerCase (C)C
      // a82: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a85: aload 18
      // a87: bipush 3
      // a88: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // a8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a91: astore 27
      // a93: aload 3
      // a94: aload 18
      // a96: aload 27
      // a98: bipush 2
      // a99: invokestatic com/finalshell/core/B8_2.Z (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
      // a9c: astore 27
      // a9e: iload 6
      // aa0: ifeq b46
      // aa3: iload 26
      // aa5: goto aac
      // aa8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aab: athrow
      // aac: sipush 28764
      // aaf: ldc2_w 8016641780204721695
      // ab2: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // ab5: iload 6
      // ab7: ifne b15
      // aba: if_icmpne b0a
      // abd: goto ac4
      // ac0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac3: athrow
      // ac4: aload 18
      // ac6: bipush 3
      // ac7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // aca: astore 27
      // acc: aload 3
      // acd: aload 27
      // acf: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // ad4: checkcast java/lang/reflect/Field
      // ad7: astore 28
      // ad9: aload 28
      // adb: ifnonnull b46
      // ade: aload 27
      // ae0: astore 29
      // ae2: aload 18
      // ae4: bipush 2
      // ae5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // ae8: astore 27
      // aea: aload 27
      // aec: iload 6
      // aee: ifne b05
      // af1: aload 3
      // af2: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // af5: astore 28
      // af7: aload 28
      // af9: ifnonnull b07
      // afc: aload 29
      // afe: goto b05
      // b01: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b04: athrow
      // b05: astore 27
      // b07: goto b46
      // b0a: iload 26
      // b0c: sipush 6446
      // b0f: ldc2_w 618634685785915144
      // b12: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // b15: if_icmpne b25
      // b18: aload 18
      // b1a: bipush 2
      // b1b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b1e: astore 27
      // b20: iload 6
      // b22: ifeq b46
      // b25: aload 18
      // b27: bipush 2
      // b28: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b2b: astore 27
      // b2d: aload 27
      // b2f: aload 3
      // b30: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // b33: astore 28
      // b35: aload 28
      // b37: ifnonnull b46
      // b3a: iload 6
      // b3c: ifeq d37
      // b3f: goto b46
      // b42: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b45: athrow
      // b46: aload 0
      // b47: aload 27
      // b49: invokestatic com/finalshell/core/B8_2.L (Ljava/lang/Class;Ljava/lang/String;)Z
      // b4c: istore 29
      // b4e: iload 29
      // b50: ifeq b5f
      // b53: iload 6
      // b55: ifeq d37
      // b58: goto b5f
      // b5b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5e: athrow
      // b5f: aload 28
      // b61: iload 6
      // b63: ifne b81
      // b66: goto b6d
      // b69: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6c: athrow
      // b6d: ifnonnull b7f
      // b70: goto b77
      // b73: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b76: athrow
      // b77: aload 27
      // b79: aload 3
      // b7a: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // b7d: astore 28
      // b7f: aload 28
      // b81: iload 6
      // b83: ifne b9d
      // b86: ifnonnull b9f
      // b89: goto b90
      // b8c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8f: athrow
      // b90: aload 18
      // b92: aload 3
      // b93: invokestatic com/finalshell/core/IG.P (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
      // b96: goto b9d
      // b99: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b9c: athrow
      // b9d: astore 28
      // b9f: aconst_null
      // ba0: astore 30
      // ba2: aload 28
      // ba4: iload 6
      // ba6: ifne bb5
      // ba9: ifnull ca0
      // bac: goto bb3
      // baf: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb2: athrow
      // bb3: aload 28
      // bb5: ldc_w com/finalshell/core/E6
      // bb8: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // bbb: checkcast com/finalshell/core/E6
      // bbe: astore 30
      // bc0: aload 30
      // bc2: iload 6
      // bc4: ifne bd3
      // bc7: ifnull ca0
      // bca: goto bd1
      // bcd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd0: athrow
      // bd1: aload 30
      // bd3: invokeinterface com/finalshell/core/E6.W$boolean ()Z 1
      // bd8: iload 6
      // bda: ifne c1e
      // bdd: ifne bf3
      // be0: goto be7
      // be3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be6: athrow
      // be7: iload 6
      // be9: ifeq d37
      // bec: goto bf3
      // bef: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf2: athrow
      // bf3: aload 30
      // bf5: invokeinterface com/finalshell/core/E6.I ()I 1
      // bfa: istore 19
      // bfc: aload 30
      // bfe: invokeinterface com/finalshell/core/E6.N ()[Lcom/finalshell/ui/model/EP; 1
      // c03: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // c06: istore 20
      // c08: aload 30
      // c0a: invokeinterface com/finalshell/core/E6.M ()[Lcom/finalshell/ui/model/Ks2_2; 1
      // c0f: invokestatic com/finalshell/ui/model/Ks2_2.C ([Lcom/finalshell/ui/model/Ks2_2;)I
      // c12: istore 21
      // c14: aload 30
      // c16: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // c1b: invokevirtual java/lang/String.length ()I
      // c1e: iload 6
      // c20: ifne c8d
      // c23: ifeq c70
      // c26: goto c2d
      // c29: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2c: athrow
      // c2d: aload 30
      // c2f: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // c34: iload 6
      // c36: ifne c7e
      // c39: goto c40
      // c3c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3f: athrow
      // c40: astore 27
      // c42: aload 2
      // c43: ifnull c70
      // c46: aload 2
      // c47: aload 27
      // c49: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c4e: checkcast java/lang/String
      // c51: astore 27
      // c53: aload 27
      // c55: iload 6
      // c57: ifne c7e
      // c5a: ifnonnull c70
      // c5d: goto c64
      // c60: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c63: athrow
      // c64: iload 6
      // c66: ifeq d37
      // c69: goto c70
      // c6c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c6f: athrow
      // c70: aload 30
      // c72: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // c77: goto c7e
      // c7a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7d: athrow
      // c7e: iload 6
      // c80: ifne c9e
      // c83: invokevirtual java/lang/String.length ()I
      // c86: goto c8d
      // c89: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c8c: athrow
      // c8d: ifeq ca0
      // c90: aload 30
      // c92: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // c97: goto c9e
      // c9a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9d: athrow
      // c9e: astore 22
      // ca0: aload 2
      // ca1: iload 6
      // ca3: ifne cbf
      // ca6: ifnull cd5
      // ca9: goto cb0
      // cac: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // caf: athrow
      // cb0: aload 2
      // cb1: aload 27
      // cb3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // cb8: goto cbf
      // cbb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cbe: athrow
      // cbf: checkcast java/lang/String
      // cc2: astore 27
      // cc4: aload 27
      // cc6: ifnonnull cd5
      // cc9: iload 6
      // ccb: ifeq d37
      // cce: goto cd5
      // cd1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cd4: athrow
      // cd5: aload 5
      // cd7: iload 6
      // cd9: ifne cef
      // cdc: goto ce3
      // cdf: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ce2: athrow
      // ce3: ifnull cf6
      // ce6: goto ced
      // ce9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cec: athrow
      // ced: aload 5
      // cef: aload 27
      // cf1: invokevirtual com/finalshell/ui/model/D.C (Ljava/lang/String;)Ljava/lang/String;
      // cf4: astore 27
      // cf6: aload 7
      // cf8: aload 27
      // cfa: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // cff: ifeq d0e
      // d02: iload 6
      // d04: ifeq d37
      // d07: goto d0e
      // d0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0d: athrow
      // d0e: new com/finalshell/core/Ph2
      // d11: dup
      // d12: aload 27
      // d14: aload 17
      // d16: aload 28
      // d18: aload 0
      // d19: aconst_null
      // d1a: iload 19
      // d1c: iload 20
      // d1e: iload 21
      // d20: aload 25
      // d22: aload 30
      // d24: aload 22
      // d26: invokespecial com/finalshell/core/Ph2.<init> (Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILcom/finalshell/core/E6;Lcom/finalshell/core/E6;Ljava/lang/String;)V
      // d29: astore 31
      // d2b: aload 7
      // d2d: aload 27
      // d2f: aload 31
      // d31: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d36: pop
      // d37: iinc 16 1
      // d3a: iload 6
      // d3c: ifeq 043
      // d3f: aload 0
      // d40: invokevirtual java/lang/Class.getFields ()[Ljava/lang/reflect/Field;
      // d43: astore 14
      // d45: aload 0
      // d46: aload 2
      // d47: aload 5
      // d49: aload 7
      // d4b: aload 14
      // d4d: invokestatic com/finalshell/core/B8_2.S (Ljava/lang/Class;Ljava/util/Map;Lcom/finalshell/ui/model/D;Ljava/util/Map;[Ljava/lang/reflect/Field;)V
      // d50: aload 0
      // d51: iload 4
      // d53: aload 7
      // d55: invokestatic com/finalshell/core/B8_2.M (Ljava/lang/Class;ZLjava/util/Map;)Ljava/util/List;
      // d58: areturn
   }

   public static List M(java.lang.Class param0, boolean param1, Map param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 4
      // 009: invokestatic com/finalshell/core/Ph2.u ()I
      // 00c: aconst_null
      // 00d: astore 5
      // 00f: istore 3
      // 010: aload 0
      // 011: ldc_w com/finalshell/core/O4
      // 014: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 017: checkcast com/finalshell/core/O4
      // 01a: astore 6
      // 01c: aload 6
      // 01e: iload 3
      // 01f: ifne 02e
      // 022: ifnull 035
      // 025: goto 02c
      // 028: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 6
      // 02e: invokeinterface com/finalshell/core/O4.Z$arrString ()[Ljava/lang/String; 1
      // 033: astore 5
      // 035: aload 5
      // 037: iload 3
      // 038: ifne 047
      // 03b: ifnull 116
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 5
      // 047: arraylength
      // 048: iload 3
      // 049: ifne 137
      // 04c: ifle 116
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: new java/util/LinkedHashMap
      // 059: dup
      // 05a: aload 2
      // 05b: invokeinterface java/util/Map.size ()I 1
      // 060: invokespecial java/util/LinkedHashMap.<init> (I)V
      // 063: astore 7
      // 065: aload 2
      // 066: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 06b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 070: astore 8
      // 072: aload 8
      // 074: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 079: ifeq 0a4
      // 07c: aload 8
      // 07e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 083: checkcast com/finalshell/core/Ph2
      // 086: astore 9
      // 088: aload 7
      // 08a: aload 9
      // 08c: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 08f: aload 9
      // 091: invokevirtual java/util/LinkedHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 094: pop
      // 095: iload 3
      // 096: ifne 146
      // 099: iload 3
      // 09a: ifeq 072
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: aload 5
      // 0a6: astore 8
      // 0a8: aload 8
      // 0aa: arraylength
      // 0ab: istore 9
      // 0ad: bipush 0
      // 0ae: istore 10
      // 0b0: iload 10
      // 0b2: iload 9
      // 0b4: if_icmpge 105
      // 0b7: aload 8
      // 0b9: iload 10
      // 0bb: aaload
      // 0bc: astore 11
      // 0be: aload 7
      // 0c0: aload 11
      // 0c2: invokevirtual java/util/LinkedHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast com/finalshell/core/Ph2
      // 0c8: astore 12
      // 0ca: iload 3
      // 0cb: ifne 112
      // 0ce: iload 3
      // 0cf: ifne 101
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: aload 12
      // 0db: ifnull 0fe
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: aload 4
      // 0e7: aload 12
      // 0e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ee: pop
      // 0ef: aload 7
      // 0f1: aload 11
      // 0f3: invokevirtual java/util/LinkedHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f6: pop
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: iinc 10 1
      // 101: iload 3
      // 102: ifeq 0b0
      // 105: aload 4
      // 107: aload 7
      // 109: invokevirtual java/util/LinkedHashMap.values ()Ljava/util/Collection;
      // 10c: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 111: pop
      // 112: iload 3
      // 113: ifeq 146
      // 116: aload 4
      // 118: iload 3
      // 119: ifne 148
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: aload 2
      // 124: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 129: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 12e: pop
      // 12f: iload 1
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: ifeq 146
      // 13a: aload 4
      // 13c: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 4
      // 148: areturn
   }

   public static void S(java.lang.Class param0, Map param1, com.finalshell.ui.model.D param2, Map param3, Field[] param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 4
      // 005: astore 6
      // 007: istore 5
      // 009: aload 6
      // 00b: arraylength
      // 00c: istore 7
      // 00e: bipush 0
      // 00f: istore 8
      // 011: iload 8
      // 013: iload 7
      // 015: if_icmpge 195
      // 018: aload 6
      // 01a: iload 8
      // 01c: aaload
      // 01d: astore 9
      // 01f: aload 9
      // 021: iload 5
      // 023: ifne 04b
      // 026: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 029: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 02c: ifeq 042
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: iload 5
      // 038: ifeq 18d
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 9
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: ldc_w com/finalshell/core/E6
      // 04e: invokestatic com/finalshell/core/B8_2.f (Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 051: checkcast com/finalshell/core/E6
      // 054: astore 10
      // 056: bipush 0
      // 057: istore 11
      // 059: bipush 0
      // 05a: istore 12
      // 05c: bipush 0
      // 05d: istore 13
      // 05f: aload 9
      // 061: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // 064: astore 14
      // 066: aconst_null
      // 067: astore 15
      // 069: aload 10
      // 06b: iload 5
      // 06d: ifne 07c
      // 070: ifnull 108
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 10
      // 07c: invokeinterface com/finalshell/core/E6.W$boolean ()Z 1
      // 081: iload 5
      // 083: ifne 0c7
      // 086: ifne 09c
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: iload 5
      // 092: ifeq 18d
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 10
      // 09e: invokeinterface com/finalshell/core/E6.I ()I 1
      // 0a3: istore 11
      // 0a5: aload 10
      // 0a7: invokeinterface com/finalshell/core/E6.N ()[Lcom/finalshell/ui/model/EP; 1
      // 0ac: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 0af: istore 12
      // 0b1: aload 10
      // 0b3: invokeinterface com/finalshell/core/E6.M ()[Lcom/finalshell/ui/model/Ks2_2; 1
      // 0b8: invokestatic com/finalshell/ui/model/Ks2_2.C ([Lcom/finalshell/ui/model/Ks2_2;)I
      // 0bb: istore 13
      // 0bd: aload 10
      // 0bf: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 0c4: invokevirtual java/lang/String.length ()I
      // 0c7: iload 5
      // 0c9: ifne 0f5
      // 0cc: ifeq 0df
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 10
      // 0d8: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 0dd: astore 14
      // 0df: aload 10
      // 0e1: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 0e6: iload 5
      // 0e8: ifne 106
      // 0eb: invokevirtual java/lang/String.length ()I
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: ifeq 108
      // 0f8: aload 10
      // 0fa: invokeinterface com/finalshell/core/E6.Q ()Ljava/lang/String; 1
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: astore 15
      // 108: aload 1
      // 109: iload 5
      // 10b: ifne 127
      // 10e: ifnull 13d
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 1
      // 119: aload 14
      // 11b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: checkcast java/lang/String
      // 12a: astore 14
      // 12c: aload 14
      // 12e: ifnonnull 13d
      // 131: iload 5
      // 133: ifeq 18d
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 2
      // 13e: iload 5
      // 140: ifne 155
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: ifnull 15c
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 2
      // 155: aload 14
      // 157: invokevirtual com/finalshell/ui/model/D.C (Ljava/lang/String;)Ljava/lang/String;
      // 15a: astore 14
      // 15c: aload 3
      // 15d: aload 14
      // 15f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 164: ifne 18d
      // 167: new com/finalshell/core/Ph2
      // 16a: dup
      // 16b: aload 14
      // 16d: aconst_null
      // 16e: aload 9
      // 170: aload 0
      // 171: aconst_null
      // 172: iload 11
      // 174: iload 12
      // 176: iload 13
      // 178: aconst_null
      // 179: aload 10
      // 17b: aload 15
      // 17d: invokespecial com/finalshell/core/Ph2.<init> (Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILcom/finalshell/core/E6;Lcom/finalshell/core/E6;Ljava/lang/String;)V
      // 180: astore 16
      // 182: aload 3
      // 183: aload 14
      // 185: aload 16
      // 187: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 18c: pop
      // 18d: iinc 8 1
      // 190: iload 5
      // 192: ifeq 011
      // 195: return
   }

   public static String Z(Map param0, String param1, String param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: istore 4
      // 05: getstatic com/finalshell/core/B8_2.d Z
      // 08: iload 4
      // 0a: ifeq 25
      // 0d: ifeq 45
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: aload 2
      // 19: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifne 45
      // 28: aload 1
      // 29: iload 3
      // 2a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2d: astore 5
      // 2f: aload 0
      // 30: aload 5
      // 32: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 37: ifeq 43
      // 3a: aload 5
      // 3c: goto 44
      // 3f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 2
      // 44: areturn
      // 45: aload 2
      // 46: areturn
   }

   public static E6 E(java.lang.Class param0, Method param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 0
      // 004: invokevirtual java/lang/Class.getInterfaces ()[Ljava/lang/Class;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 3
      // 00a: iload 2
      // 00b: ifne 024
      // 00e: arraylength
      // 00f: ifle 148
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 1
      // 01a: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 01d: goto 024
      // 020: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: astore 4
      // 026: aload 3
      // 027: astore 5
      // 029: aload 5
      // 02b: arraylength
      // 02c: istore 6
      // 02e: bipush 0
      // 02f: istore 7
      // 031: iload 7
      // 033: iload 6
      // 035: if_icmpge 148
      // 038: aload 5
      // 03a: iload 7
      // 03c: aaload
      // 03d: astore 8
      // 03f: aload 8
      // 041: iload 2
      // 042: ifne 14c
      // 045: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 048: astore 9
      // 04a: aload 9
      // 04c: arraylength
      // 04d: istore 10
      // 04f: bipush 0
      // 050: istore 11
      // 052: iload 11
      // 054: iload 10
      // 056: if_icmpge 141
      // 059: aload 9
      // 05b: iload 11
      // 05d: aaload
      // 05e: astore 12
      // 060: aload 12
      // 062: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 065: astore 13
      // 067: aload 13
      // 069: arraylength
      // 06a: iload 2
      // 06b: ifne 09d
      // 06e: aload 4
      // 070: arraylength
      // 071: iload 2
      // 072: ifne 035
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: if_icmpeq 08a
      // 07f: iload 2
      // 080: ifeq 13a
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 12
      // 08c: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 08f: aload 1
      // 090: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 093: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: iload 2
      // 09e: ifne 0be
      // 0a1: ifne 0b6
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: iload 2
      // 0ac: ifeq 13a
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: bipush 1
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: istore 14
      // 0c0: bipush 0
      // 0c1: istore 15
      // 0c3: iload 15
      // 0c5: aload 4
      // 0c7: arraylength
      // 0c8: if_icmpge 106
      // 0cb: aload 13
      // 0cd: iload 15
      // 0cf: aaload
      // 0d0: aload 4
      // 0d2: iload 15
      // 0d4: aaload
      // 0d5: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0d8: iload 2
      // 0d9: ifne 108
      // 0dc: iload 2
      // 0dd: ifne 0f2
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: ifne 0f8
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: bipush 0
      // 0f2: istore 14
      // 0f4: iload 2
      // 0f5: ifeq 106
      // 0f8: iinc 15 1
      // 0fb: iload 2
      // 0fc: ifeq 0c3
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: iload 14
      // 108: ifne 116
      // 10b: iload 2
      // 10c: ifeq 13a
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 12
      // 118: ldc_w com/finalshell/core/E6
      // 11b: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 11e: checkcast com/finalshell/core/E6
      // 121: astore 15
      // 123: iload 2
      // 124: ifne 13d
      // 127: aload 15
      // 129: ifnull 13a
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 15
      // 135: areturn
      // 136: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: iinc 11 1
      // 13d: iload 2
      // 13e: ifeq 052
      // 141: iinc 7 1
      // 144: iload 2
      // 145: ifeq 031
      // 148: aload 0
      // 149: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 14c: astore 4
      // 14e: aload 4
      // 150: iload 2
      // 151: ifne 166
      // 154: ifnonnull 164
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aconst_null
      // 15f: areturn
      // 160: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: aload 4
      // 166: invokevirtual java/lang/Class.getModifiers ()I
      // 169: invokestatic java/lang/reflect/Modifier.isAbstract (I)Z
      // 16c: ifeq 26f
      // 16f: aload 1
      // 170: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 173: astore 5
      // 175: aload 4
      // 177: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 17a: astore 6
      // 17c: aload 6
      // 17e: arraylength
      // 17f: istore 7
      // 181: bipush 0
      // 182: istore 8
      // 184: iload 8
      // 186: iload 7
      // 188: if_icmpge 26f
      // 18b: aload 6
      // 18d: iload 8
      // 18f: aaload
      // 190: astore 9
      // 192: aload 9
      // 194: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 197: astore 10
      // 199: aload 10
      // 19b: arraylength
      // 19c: iload 2
      // 19d: ifne 1cb
      // 1a0: aload 5
      // 1a2: arraylength
      // 1a3: if_icmpeq 1b8
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: iload 2
      // 1ae: ifeq 268
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: aload 9
      // 1ba: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 1bd: aload 1
      // 1be: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 1c1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: iload 2
      // 1cc: ifne 1ec
      // 1cf: ifne 1e4
      // 1d2: goto 1d9
      // 1d5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: iload 2
      // 1da: ifeq 268
      // 1dd: goto 1e4
      // 1e0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: bipush 1
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: istore 11
      // 1ee: bipush 0
      // 1ef: istore 12
      // 1f1: iload 12
      // 1f3: aload 5
      // 1f5: arraylength
      // 1f6: if_icmpge 234
      // 1f9: aload 10
      // 1fb: iload 12
      // 1fd: aaload
      // 1fe: aload 5
      // 200: iload 12
      // 202: aaload
      // 203: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 206: iload 2
      // 207: ifne 236
      // 20a: iload 2
      // 20b: ifne 220
      // 20e: goto 215
      // 211: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 214: athrow
      // 215: ifne 226
      // 218: goto 21f
      // 21b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: bipush 0
      // 220: istore 11
      // 222: iload 2
      // 223: ifeq 234
      // 226: iinc 12 1
      // 229: iload 2
      // 22a: ifeq 1f1
      // 22d: goto 234
      // 230: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 233: athrow
      // 234: iload 11
      // 236: ifne 244
      // 239: iload 2
      // 23a: ifeq 268
      // 23d: goto 244
      // 240: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 243: athrow
      // 244: aload 9
      // 246: ldc_w com/finalshell/core/E6
      // 249: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 24c: checkcast com/finalshell/core/E6
      // 24f: astore 12
      // 251: iload 2
      // 252: ifne 26b
      // 255: aload 12
      // 257: ifnull 268
      // 25a: goto 261
      // 25d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 260: athrow
      // 261: aload 12
      // 263: areturn
      // 264: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 267: athrow
      // 268: iinc 8 1
      // 26b: iload 2
      // 26c: ifeq 184
      // 26f: aconst_null
      // 270: areturn
   }

   public static boolean L(java.lang.Class param0, String param1) {
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
      // 004: ldc_w com/finalshell/core/O4
      // 007: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 00a: checkcast com/finalshell/core/O4
      // 00d: astore 3
      // 00e: istore 2
      // 00f: aload 3
      // 010: iload 2
      // 011: ifeq 01f
      // 014: ifnull 0cd
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aload 3
      // 01f: invokeinterface com/finalshell/core/O4.y ()[Ljava/lang/String; 1
      // 024: astore 4
      // 026: aload 4
      // 028: iload 2
      // 029: ifeq 089
      // 02c: arraylength
      // 02d: ifle 07f
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 4
      // 039: astore 5
      // 03b: aload 5
      // 03d: arraylength
      // 03e: istore 6
      // 040: bipush 0
      // 041: istore 7
      // 043: iload 7
      // 045: iload 6
      // 047: if_icmpge 07d
      // 04a: aload 5
      // 04c: iload 7
      // 04e: aaload
      // 04f: astore 8
      // 051: iload 2
      // 052: ifeq 079
      // 055: aload 1
      // 056: aload 8
      // 058: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05b: iload 2
      // 05c: ifeq 07e
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: ifeq 076
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: bipush 0
      // 071: ireturn
      // 072: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: iinc 7 1
      // 079: iload 2
      // 07a: ifne 043
      // 07d: bipush 1
      // 07e: ireturn
      // 07f: aload 3
      // 080: invokeinterface com/finalshell/core/O4.Q ()[Ljava/lang/String; 1
      // 085: astore 4
      // 087: aload 4
      // 089: astore 5
      // 08b: aload 5
      // 08d: arraylength
      // 08e: istore 6
      // 090: bipush 0
      // 091: istore 7
      // 093: iload 7
      // 095: iload 6
      // 097: if_icmpge 0cd
      // 09a: aload 5
      // 09c: iload 7
      // 09e: aaload
      // 09f: astore 8
      // 0a1: iload 2
      // 0a2: ifeq 0c9
      // 0a5: aload 1
      // 0a6: aload 8
      // 0a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ab: iload 2
      // 0ac: ifeq 10b
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: ifeq 0c6
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: bipush 1
      // 0c1: ireturn
      // 0c2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: iinc 7 1
      // 0c9: iload 2
      // 0ca: ifne 093
      // 0cd: aload 0
      // 0ce: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 0d1: iload 2
      // 0d2: ifeq 0ec
      // 0d5: ldc java/lang/Object
      // 0d7: if_acmpeq 10a
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: ifeq 105
      // 0f0: ifnull 10a
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 1
      // 106: invokestatic com/finalshell/core/B8_2.L (Ljava/lang/Class;Ljava/lang/String;)Z
      // 109: ireturn
      // 10a: bipush 0
      // 10b: ireturn
   }

   public static boolean A(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: instanceof java/lang/reflect/ParameterizedType
      // 08: iload 1
      // 09: ifne 20
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: instanceof java/lang/Class
      // 20: iload 1
      // 21: ifne 67
      // 24: ifeq 66
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: checkcast java/lang/Class
      // 32: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 35: astore 2
      // 36: aload 2
      // 37: iload 1
      // 38: ifne 4f
      // 3b: ldc java/lang/Object
      // 3d: if_acmpeq 64
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 2
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokestatic com/finalshell/core/B8_2.A (Ljava/lang/reflect/Type;)Z
      // 52: iload 1
      // 53: ifne 61
      // 56: ifeq 64
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
      // 66: bipush 0
      // 67: ireturn
   }

   public static Type U(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: instanceof java/lang/reflect/ParameterizedType
      // 08: iload 1
      // 09: ifne 2b
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: areturn
      // 18: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: ifne 3e
      // 21: instanceof java/lang/Class
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifeq 3d
      // 2e: aload 0
      // 2f: checkcast java/lang/Class
      // 32: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 35: invokestatic com/finalshell/core/B8_2.U (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 38: areturn
      // 39: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: areturn
   }

   public static Type u(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: getstatic com/finalshell/core/B8_2.B Z
      // 07: iload 1
      // 08: ifne 49
      // 0b: ifne 3a
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: sipush -26458
      // 18: sipush -2386
      // 1b: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 1e: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 21: putstatic com/finalshell/core/B8_2.X Ljava/lang/Class;
      // 24: bipush 1
      // 25: putstatic com/finalshell/core/B8_2.B Z
      // 28: goto 3a
      // 2b: astore 2
      // 2c: bipush 1
      // 2d: putstatic com/finalshell/core/B8_2.B Z
      // 30: goto 3a
      // 33: astore 3
      // 34: bipush 1
      // 35: putstatic com/finalshell/core/B8_2.B Z
      // 38: aload 3
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: ifne 76
      // 3f: instanceof java/lang/reflect/ParameterizedType
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: ifeq 75
      // 4c: aload 0
      // 4d: checkcast java/lang/reflect/ParameterizedType
      // 50: astore 2
      // 51: aload 2
      // 52: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 57: iload 1
      // 58: ifne 76
      // 5b: getstatic com/finalshell/core/B8_2.X Ljava/lang/Class;
      // 5e: if_acmpne 75
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 2
      // 69: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 6e: bipush 0
      // 6f: aaload
      // 70: areturn
      // 71: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 0
      // 76: areturn
   }

   public static java.lang.Class x(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 08: iload 1
      // 09: ifne 22
      // 0c: ldc java/lang/Class
      // 0e: if_acmpne 21
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: checkcast java/lang/Class
      // 1c: areturn
      // 1d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: instanceof java/lang/reflect/ParameterizedType
      // 25: iload 1
      // 26: ifne 48
      // 29: ifeq 44
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: checkcast java/lang/reflect/ParameterizedType
      // 37: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 3c: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 3f: areturn
      // 40: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 0
      // 45: instanceof java/lang/reflect/TypeVariable
      // 48: iload 1
      // 49: ifne 91
      // 4c: ifeq 82
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 0
      // 57: checkcast java/lang/reflect/TypeVariable
      // 5a: invokeinterface java/lang/reflect/TypeVariable.getBounds ()[Ljava/lang/reflect/Type; 1
      // 5f: bipush 0
      // 60: aaload
      // 61: astore 2
      // 62: aload 2
      // 63: iload 1
      // 64: ifne 7e
      // 67: instanceof java/lang/Class
      // 6a: ifeq 7d
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: aload 2
      // 75: checkcast java/lang/Class
      // 78: areturn
      // 79: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 2
      // 7e: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 81: areturn
      // 82: aload 0
      // 83: iload 1
      // 84: ifne 95
      // 87: instanceof java/lang/reflect/WildcardType
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: ifeq bd
      // 94: aload 0
      // 95: checkcast java/lang/reflect/WildcardType
      // 98: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 9d: astore 2
      // 9e: aload 2
      // 9f: iload 1
      // a0: ifne b7
      // a3: arraylength
      // a4: bipush 1
      // a5: if_icmpne bd
      // a8: goto af
      // ab: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 2
      // b0: goto b7
      // b3: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: bipush 0
      // b8: aaload
      // b9: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // bc: areturn
      // bd: ldc java/lang/Object
      // bf: areturn
   }

   public static Field X(java.lang.Class param0, String param1, Field[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 2
      // 004: astore 4
      // 006: istore 3
      // 007: aload 4
      // 009: arraylength
      // 00a: istore 5
      // 00c: bipush 0
      // 00d: istore 6
      // 00f: iload 6
      // 011: iload 5
      // 013: if_icmpge 0fc
      // 016: aload 4
      // 018: iload 6
      // 01a: aaload
      // 01b: astore 7
      // 01d: aload 7
      // 01f: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // 022: astore 8
      // 024: aload 1
      // 025: aload 8
      // 027: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02a: iload 3
      // 02b: ifne 043
      // 02e: ifeq 03f
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 7
      // 03a: areturn
      // 03b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 1
      // 040: invokevirtual java/lang/String.length ()I
      // 043: bipush 2
      // 044: iload 3
      // 045: ifne 05f
      // 048: if_icmple 0f5
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 1
      // 053: bipush 0
      // 054: invokevirtual java/lang/String.charAt (I)C
      // 057: dup
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: istore 9
      // 061: sipush 18006
      // 064: ldc2_w 3288865744290963499
      // 067: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 06a: iload 3
      // 06b: ifne 08a
      // 06e: if_icmplt 0f5
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: iload 9
      // 07a: sipush 6556
      // 07d: ldc2_w 7258906271988400044
      // 080: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: iload 3
      // 08b: ifne 0a5
      // 08e: if_icmpgt 0f5
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 1
      // 099: bipush 1
      // 09a: invokevirtual java/lang/String.charAt (I)C
      // 09d: dup
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: istore 10
      // 0a7: sipush 10648
      // 0aa: ldc2_w 8362706924682317783
      // 0ad: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0b0: iload 3
      // 0b1: ifne 0db
      // 0b4: if_icmplt 0f5
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: iload 10
      // 0c0: iload 3
      // 0c1: ifne 0eb
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: sipush 15521
      // 0ce: ldc2_w 5660554601004309128
      // 0d1: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: if_icmpgt 0f5
      // 0de: aload 1
      // 0df: aload 8
      // 0e1: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: ifeq 0f5
      // 0ee: aload 7
      // 0f0: areturn
      // 0f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: iinc 6 1
      // 0f8: iload 3
      // 0f9: ifeq 00f
      // 0fc: aload 0
      // 0fd: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 100: astore 4
      // 102: aload 4
      // 104: iload 3
      // 105: ifne 114
      // 108: ifnull 137
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 4
      // 114: iload 3
      // 115: ifne 12d
      // 118: ldc java/lang/Object
      // 11a: if_acmpeq 137
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 4
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 1
      // 12e: aload 4
      // 130: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 133: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;
      // 136: areturn
      // 137: aconst_null
      // 138: areturn
   }

   /** @deprecated */
   public static int g(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: aload 0
      // 04: ldc_w com/finalshell/core/O4
      // 07: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0a: checkcast com/finalshell/core/O4
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 25
      // 14: ifnonnull 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 2
      // 25: invokeinterface com/finalshell/core/O4.u ()[Lcom/finalshell/ui/model/EP; 1
      // 2a: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 2d: ireturn
   }

   public static int b(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: aload 0
      // 04: ldc_w com/finalshell/core/O4
      // 07: invokestatic com/finalshell/core/B8_2.X (Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0a: checkcast com/finalshell/core/O4
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 2
      // 10: iload 1
      // 11: ifeq 25
      // 14: ifnonnull 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 2
      // 25: invokeinterface com/finalshell/core/O4.p ()[Lcom/finalshell/ui/model/Ks2_2; 1
      // 2a: invokestatic com/finalshell/ui/model/Ks2_2.C ([Lcom/finalshell/ui/model/Ks2_2;)I
      // 2d: ireturn
   }

   public static String y(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2d
      // 09: ifnull 2c
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: iload 1
      // 18: ifne 3d
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: ifne 2e
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: areturn
      // 2e: aload 0
      // 2f: iload 1
      // 30: ifne 82
      // 33: invokevirtual java/lang/String.length ()I
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: if_icmple 81
      // 41: aload 0
      // 42: iload 1
      // 43: ifne 82
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: bipush 1
      // 4e: invokevirtual java/lang/String.charAt (I)C
      // 51: invokestatic java/lang/Character.isUpperCase (C)Z
      // 54: ifeq 81
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: iload 1
      // 60: ifne 82
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: bipush 0
      // 6b: invokevirtual java/lang/String.charAt (I)C
      // 6e: invokestatic java/lang/Character.isUpperCase (C)Z
      // 71: ifeq 81
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: aload 0
      // 7c: areturn
      // 7d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 0
      // 82: invokevirtual java/lang/String.toCharArray ()[C
      // 85: astore 2
      // 86: aload 2
      // 87: bipush 0
      // 88: aload 2
      // 89: bipush 0
      // 8a: caload
      // 8b: invokestatic java/lang/Character.toLowerCase (C)C
      // 8e: castore
      // 8f: new java/lang/String
      // 92: dup
      // 93: aload 2
      // 94: invokespecial java/lang/String.<init> ([C)V
      // 97: areturn
   }

   public static String L$String(String var0) {
      return Character.toLowerCase(var0.charAt(3)) + var0.substring(4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void P(AccessibleObject var0) {
      boolean var10000;
      AccessibleObject var7;
      boolean var8;
      int var1 = Ph2.u();

      label47: {
         label53: {
            label45: {
               try {
                  var10000 = y;
                  if (var1 != 0) {
                     break label45;
                  }

                  if (!y) {
                     return;
                  }
               } catch (AccessControlException var6) {
                  throw a(var6);
               }

               try {
                  var7 = var0;
                  if (var1 != 0) {
                     break label53;
                  }

                  var10000 = var0.isAccessible();
               } catch (AccessControlException var5) {
                  throw a(var5);
               }
            }

            if (var10000) {
               return;
            }

            try {
               var7 = var0;
            } catch (AccessControlException var4) {
               boolean var10001 = false;
               break label47;
            }
         }

         try {
            var7.setAccessible(true);
            return;
         } catch (AccessControlException var3) {
            var8 = false;
         }
      }

      y = false;
   }

   public static Type r(Type param0) {
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
      // 05: instanceof java/lang/reflect/ParameterizedType
      // 08: iload 1
      // 09: ifeq 31
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/lang/reflect/ParameterizedType
      // 1a: invokestatic com/finalshell/core/B8_2.E (Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: ifeq 42
      // 27: instanceof java/lang/Class
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifeq 43
      // 34: aload 0
      // 35: checkcast java/lang/Class
      // 38: invokestatic com/finalshell/core/B8_2.K$Type (Ljava/lang/Class;)Ljava/lang/reflect/Type;
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: areturn
      // 43: ldc java/lang/Object
      // 45: areturn
   }

   public static Type K$Type(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2f
      // 09: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0c: sipush -26381
      // 0f: sipush 26941
      // 12: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 15: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 18: ifeq 2b
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: ldc java/lang/Object
      // 24: goto 32
      // 27: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokestatic com/finalshell/core/B8_2.r (Ljava/lang/Class;)Ljava/lang/reflect/Type;
      // 2f: invokestatic com/finalshell/core/B8_2.r (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 32: areturn
   }

   public static Type E(ParameterizedType param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 06: astore 2
      // 07: invokestatic com/finalshell/core/Ph2.u ()I
      // 0a: aload 0
      // 0b: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 10: astore 3
      // 11: istore 1
      // 12: aload 2
      // 13: iload 1
      // 14: ifne 30
      // 17: ldc_w java/util/Collection
      // 1a: if_acmpne 2f
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 3
      // 25: bipush 0
      // 26: aaload
      // 27: invokestatic com/finalshell/core/B8_2.Z (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 2a: areturn
      // 2b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 2
      // 30: checkcast java/lang/Class
      // 33: astore 4
      // 35: aload 4
      // 37: invokevirtual java/lang/Class.getTypeParameters ()[Ljava/lang/reflect/TypeVariable;
      // 3a: aload 3
      // 3b: invokestatic com/finalshell/core/B8_2.V ([Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Ljava/util/Map;
      // 3e: astore 5
      // 40: aload 4
      // 42: invokestatic com/finalshell/core/B8_2.r (Ljava/lang/Class;)Ljava/lang/reflect/Type;
      // 45: astore 6
      // 47: aload 6
      // 49: iload 1
      // 4a: ifne 94
      // 4d: instanceof java/lang/reflect/ParameterizedType
      // 50: ifeq 8c
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 6
      // 5c: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 5f: astore 7
      // 61: aload 6
      // 63: checkcast java/lang/reflect/ParameterizedType
      // 66: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 6b: astore 8
      // 6d: aload 8
      // 6f: arraylength
      // 70: ifle 86
      // 73: aload 7
      // 75: aload 8
      // 77: aload 5
      // 79: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/Class;[Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/ParameterizedType;
      // 7c: invokestatic com/finalshell/core/B8_2.E (Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;
      // 7f: goto 8b
      // 82: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 7
      // 88: invokestatic com/finalshell/core/B8_2.K$Type (Ljava/lang/Class;)Ljava/lang/reflect/Type;
      // 8b: areturn
      // 8c: aload 6
      // 8e: checkcast java/lang/Class
      // 91: invokestatic com/finalshell/core/B8_2.K$Type (Ljava/lang/Class;)Ljava/lang/reflect/Type;
      // 94: areturn
   }

   public static Type r(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: aconst_null
      // 04: astore 2
      // 05: aload 0
      // 06: invokevirtual java/lang/Class.getGenericInterfaces ()[Ljava/lang/reflect/Type;
      // 09: astore 3
      // 0a: istore 1
      // 0b: aload 3
      // 0c: arraylength
      // 0d: istore 4
      // 0f: bipush 0
      // 10: istore 5
      // 12: iload 5
      // 14: iload 4
      // 16: if_icmpge 72
      // 19: aload 3
      // 1a: iload 5
      // 1c: aaload
      // 1d: astore 6
      // 1f: aload 6
      // 21: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 24: astore 7
      // 26: aload 7
      // 28: iload 1
      // 29: ifeq 73
      // 2c: ldc_w java/util/Collection
      // 2f: iload 1
      // 30: ifeq 5b
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: if_acmpne 4b
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 6
      // 46: areturn
      // 47: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: ldc_w java/util/Collection
      // 4e: iload 1
      // 4f: ifeq 6a
      // 52: aload 7
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 5e: ifeq 6b
      // 61: aload 6
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: astore 2
      // 6b: iinc 5 1
      // 6e: iload 1
      // 6f: ifne 12
      // 72: aload 2
      // 73: iload 1
      // 74: ifeq 8c
      // 77: ifnonnull 8f
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 0
      // 82: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: goto 90
      // 8f: aload 2
      // 90: areturn
   }

   public static Map V(TypeVariable[] var0, Type[] var1) {
      int var10000;
      HashMap var7;
      int var3 = var0.length;
      var10000 = Ph2.w();
      HashMap var4 = new HashMap(var3);
      int var5 = 0;
      int var2 = var10000;

      while (true) {
         if (var5 < var3) {
            try {
               var7 = var4;
               if (var2 == 0) {
                  break;
               }

               var4.put(var0[var5], var1[var5]);
               var5++;
               if (var2 != 0) {
                  continue;
               }
            } catch (Hi2 var6) {
               throw a(var6);
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   public static ParameterizedType J(java.lang.Class var0, Type[] var1, Map var2) {
      int var10000;
      var10000 = Ph2.w();
      int var4 = var1.length;
      int var3 = var10000;
      Type[] var5 = new Type[var4];
      int var6 = 0;

      while (var6 < var4) {
         var5[var6] = x(var1[var6], var2);
         var6++;
         if (var3 == 0) {
            break;
         }
      }

      return new HK(var5, null, var0);
   }

   public static Type x(Type param0, Map param1) {
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
      // 04: aload 0
      // 05: instanceof java/lang/reflect/TypeVariable
      // 08: iload 2
      // 09: ifne 29
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: aload 0
      // 18: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d: checkcast java/lang/reflect/Type
      // 20: areturn
      // 21: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: instanceof java/lang/reflect/ParameterizedType
      // 29: iload 2
      // 2a: ifne 5c
      // 2d: ifeq 4d
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 3b: aload 0
      // 3c: checkcast java/lang/reflect/ParameterizedType
      // 3f: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 44: aload 1
      // 45: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/Class;[Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/ParameterizedType;
      // 48: areturn
      // 49: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 2
      // 4f: ifne 79
      // 52: instanceof java/lang/reflect/GenericArrayType
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: ifeq 78
      // 5f: new com/finalshell/core/Xf4
      // 62: dup
      // 63: aload 0
      // 64: checkcast java/lang/reflect/GenericArrayType
      // 67: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 6c: aload 1
      // 6d: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;
      // 70: invokespecial com/finalshell/core/Xf4.<init> (Ljava/lang/reflect/Type;)V
      // 73: areturn
      // 74: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: areturn
   }

   public static Type Z(Type param0) {
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
      // 06: ifeq 43
      // 09: instanceof java/lang/reflect/WildcardType
      // 0c: ifeq 42
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/lang/reflect/WildcardType
      // 1a: astore 2
      // 1b: aload 2
      // 1c: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 21: astore 3
      // 22: aload 3
      // 23: iload 1
      // 24: ifeq 3a
      // 27: arraylength
      // 28: ifle 3f
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 0
      // 3b: aaload
      // 3c: goto 41
      // 3f: ldc java/lang/Object
      // 41: areturn
      // 42: aload 0
      // 43: areturn
   }

   public static java.lang.Class p(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 28
      // 09: instanceof java/lang/reflect/ParameterizedType
      // 0c: ifeq b5
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/lang/reflect/ParameterizedType
      // 1a: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 1f: bipush 0
      // 20: aaload
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: astore 3
      // 29: aload 3
      // 2a: instanceof java/lang/reflect/WildcardType
      // 2d: iload 1
      // 2e: ifne 70
      // 31: ifeq 61
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 3
      // 3c: checkcast java/lang/reflect/WildcardType
      // 3f: astore 4
      // 41: aload 4
      // 43: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 48: astore 5
      // 4a: aload 5
      // 4c: arraylength
      // 4d: iload 1
      // 4e: ifne 70
      // 51: bipush 1
      // 52: if_icmpne 61
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 5
      // 5e: bipush 0
      // 5f: aaload
      // 60: astore 3
      // 61: aload 3
      // 62: iload 1
      // 63: ifne 74
      // 66: instanceof java/lang/Class
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: ifeq a2
      // 73: aload 3
      // 74: checkcast java/lang/Class
      // 77: astore 2
      // 78: aload 2
      // 79: iload 1
      // 7a: ifne b4
      // 7d: invokevirtual java/lang/Class.getModifiers ()I
      // 80: invokestatic java/lang/reflect/Modifier.isPublic (I)Z
      // 83: ifne b3
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: new com/finalshell/core/Hi2
      // 90: dup
      // 91: sipush -26420
      // 94: sipush 21267
      // 97: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 9a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 9d: athrow
      // 9e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: new com/finalshell/core/Hi2
      // a5: dup
      // a6: sipush -26376
      // a9: sipush -18794
      // ac: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // af: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // b2: athrow
      // b3: aload 2
      // b4: areturn
      // b5: ldc java/lang/Object
      // b7: areturn
   }

   public static Type A(GenericArrayType param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: aload 0
      // 04: astore 2
      // 05: istore 1
      // 06: aload 0
      // 07: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 0c: astore 3
      // 0d: ldc_w "["
      // 10: astore 4
      // 12: aload 3
      // 13: instanceof java/lang/reflect/GenericArrayType
      // 16: ifeq 48
      // 19: aload 3
      // 1a: checkcast java/lang/reflect/GenericArrayType
      // 1d: invokeinterface java/lang/reflect/GenericArrayType.getGenericComponentType ()Ljava/lang/reflect/Type; 1
      // 22: astore 3
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: aload 4
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: aload 4
      // 31: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 37: astore 4
      // 39: iload 1
      // 3a: ifeq b6
      // 3d: iload 1
      // 3e: ifne 12
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 3
      // 49: iload 1
      // 4a: ifeq b7
      // 4d: instanceof java/lang/Class
      // 50: ifeq b6
      // 53: goto 5a
      // 56: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 3
      // 5b: checkcast java/lang/Class
      // 5e: astore 5
      // 60: aload 5
      // 62: iload 1
      // 63: ifeq b7
      // 66: invokevirtual java/lang/Class.isPrimitive ()Z
      // 69: ifeq b6
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: getstatic com/finalshell/core/B8_2.N Ljava/util/Map;
      // 76: aload 5
      // 78: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7d: checkcast java/lang/String
      // 80: astore 6
      // 82: aload 6
      // 84: iload 1
      // 85: ifeq ad
      // 88: ifnull b1
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: new java/lang/StringBuilder
      // 95: dup
      // 96: invokespecial java/lang/StringBuilder.<init> ()V
      // 99: aload 4
      // 9b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e: aload 6
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // b0: astore 2
      // b1: goto b6
      // b4: astore 6
      // b6: aload 2
      // b7: areturn
   }

   public static Set a(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 0
      // 004: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 007: astore 2
      // 008: istore 1
      // 009: aload 2
      // 00a: ldc_w java/util/AbstractCollection
      // 00d: iload 1
      // 00e: ifne 026
      // 011: if_acmpeq 034
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 2
      // 01c: ldc_w java/util/Collection
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: iload 1
      // 027: ifne 04b
      // 02a: if_acmpne 040
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: new java/util/HashSet
      // 037: dup
      // 038: invokespecial java/util/HashSet.<init> ()V
      // 03b: astore 3
      // 03c: iload 1
      // 03d: ifeq 148
      // 040: aload 2
      // 041: ldc_w java/util/HashSet
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 04e: iload 1
      // 04f: ifne 076
      // 052: ifeq 068
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: new java/util/HashSet
      // 05f: dup
      // 060: invokespecial java/util/HashSet.<init> ()V
      // 063: astore 3
      // 064: iload 1
      // 065: ifeq 148
      // 068: aload 2
      // 069: ldc_w java/util/LinkedHashSet
      // 06c: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: iload 1
      // 077: ifne 09e
      // 07a: ifeq 090
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: new java/util/LinkedHashSet
      // 087: dup
      // 088: invokespecial java/util/LinkedHashSet.<init> ()V
      // 08b: astore 3
      // 08c: iload 1
      // 08d: ifeq 148
      // 090: aload 2
      // 091: ldc_w java/util/TreeSet
      // 094: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: iload 1
      // 09f: ifne 0d1
      // 0a2: ifeq 0b8
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: new java/util/TreeSet
      // 0af: dup
      // 0b0: invokespecial java/util/TreeSet.<init> ()V
      // 0b3: astore 3
      // 0b4: iload 1
      // 0b5: ifeq 148
      // 0b8: aload 2
      // 0b9: iload 1
      // 0ba: ifne 11a
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: ldc_w java/util/EnumSet
      // 0c7: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: ifeq 116
      // 0d4: aload 0
      // 0d5: iload 1
      // 0d6: ifne 0ff
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: instanceof java/lang/reflect/ParameterizedType
      // 0e3: ifeq 105
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: checkcast java/lang/reflect/ParameterizedType
      // 0f1: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 0f6: bipush 0
      // 0f7: aaload
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: astore 4
      // 101: iload 1
      // 102: ifeq 109
      // 105: ldc java/lang/Object
      // 107: astore 4
      // 109: aload 4
      // 10b: checkcast java/lang/Class
      // 10e: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 111: astore 3
      // 112: iload 1
      // 113: ifeq 148
      // 116: aload 2
      // 117: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 11a: checkcast java/util/Set
      // 11d: astore 3
      // 11e: goto 148
      // 121: astore 4
      // 123: new com/finalshell/core/Hi2
      // 126: dup
      // 127: new java/lang/StringBuilder
      // 12a: dup
      // 12b: invokespecial java/lang/StringBuilder.<init> ()V
      // 12e: sipush -26421
      // 131: sipush 30471
      // 134: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: aload 2
      // 13b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 144: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 147: athrow
      // 148: aload 3
      // 149: areturn
   }

   public static Collection P$Collection(Type param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 0
      // 004: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 007: astore 2
      // 008: istore 1
      // 009: aload 2
      // 00a: ldc_w java/util/AbstractCollection
      // 00d: iload 1
      // 00e: ifne 026
      // 011: if_acmpeq 034
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 2
      // 01c: ldc_w java/util/Collection
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: iload 1
      // 027: ifne 04b
      // 02a: if_acmpne 040
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: new java/util/ArrayList
      // 037: dup
      // 038: invokespecial java/util/ArrayList.<init> ()V
      // 03b: astore 3
      // 03c: iload 1
      // 03d: ifeq 1c5
      // 040: aload 2
      // 041: ldc_w java/util/HashSet
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 04e: iload 1
      // 04f: ifne 076
      // 052: ifeq 068
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: new java/util/HashSet
      // 05f: dup
      // 060: invokespecial java/util/HashSet.<init> ()V
      // 063: astore 3
      // 064: iload 1
      // 065: ifeq 1c5
      // 068: aload 2
      // 069: ldc_w java/util/LinkedHashSet
      // 06c: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: iload 1
      // 077: ifne 09e
      // 07a: ifeq 090
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: new java/util/LinkedHashSet
      // 087: dup
      // 088: invokespecial java/util/LinkedHashSet.<init> ()V
      // 08b: astore 3
      // 08c: iload 1
      // 08d: ifeq 1c5
      // 090: aload 2
      // 091: ldc_w java/util/TreeSet
      // 094: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: iload 1
      // 09f: ifne 0c6
      // 0a2: ifeq 0b8
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: new java/util/TreeSet
      // 0af: dup
      // 0b0: invokespecial java/util/TreeSet.<init> ()V
      // 0b3: astore 3
      // 0b4: iload 1
      // 0b5: ifeq 1c5
      // 0b8: aload 2
      // 0b9: ldc_w java/util/ArrayList
      // 0bc: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: iload 1
      // 0c7: ifne 0ee
      // 0ca: ifeq 0e0
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: new java/util/ArrayList
      // 0d7: dup
      // 0d8: invokespecial java/util/ArrayList.<init> ()V
      // 0db: astore 3
      // 0dc: iload 1
      // 0dd: ifeq 1c5
      // 0e0: aload 2
      // 0e1: ldc_w java/util/EnumSet
      // 0e4: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: iload 1
      // 0ef: ifne 157
      // 0f2: ifeq 13e
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: iload 1
      // 0fe: ifne 127
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: instanceof java/lang/reflect/ParameterizedType
      // 10b: ifeq 12d
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 0
      // 116: checkcast java/lang/reflect/ParameterizedType
      // 119: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 11e: bipush 0
      // 11f: aaload
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: astore 4
      // 129: iload 1
      // 12a: ifeq 131
      // 12d: ldc java/lang/Object
      // 12f: astore 4
      // 131: aload 4
      // 133: checkcast java/lang/Class
      // 136: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 139: astore 3
      // 13a: iload 1
      // 13b: ifeq 1c5
      // 13e: aload 2
      // 13f: iload 1
      // 140: ifne 15d
      // 143: goto 14a
      // 146: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: ldc_w java/util/Queue
      // 14d: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: ifne 187
      // 15a: getstatic com/finalshell/core/B8_2.V Ljava/lang/Class;
      // 15d: iload 1
      // 15e: ifne 197
      // 161: ifnull 193
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: aload 2
      // 16c: iload 1
      // 16d: ifne 197
      // 170: goto 177
      // 173: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: getstatic com/finalshell/core/B8_2.V Ljava/lang/Class;
      // 17a: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 17d: ifeq 193
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: new java/util/LinkedList
      // 18a: dup
      // 18b: invokespecial java/util/LinkedList.<init> ()V
      // 18e: astore 3
      // 18f: iload 1
      // 190: ifeq 1c5
      // 193: aload 2
      // 194: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 197: checkcast java/util/Collection
      // 19a: astore 3
      // 19b: goto 1c5
      // 19e: astore 4
      // 1a0: new com/finalshell/core/Hi2
      // 1a3: dup
      // 1a4: new java/lang/StringBuilder
      // 1a7: dup
      // 1a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ab: sipush -26488
      // 1ae: sipush 3486
      // 1b1: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: aload 2
      // 1b8: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1c4: athrow
      // 1c5: aload 3
      // 1c6: areturn
   }

   public static java.lang.Class P$Class(Type param0) {
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
      // 05: instanceof java/lang/Class
      // 08: iload 1
      // 09: ifeq 23
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/lang/Class
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: instanceof java/lang/reflect/ParameterizedType
      // 23: iload 1
      // 24: ifeq 51
      // 27: ifeq 42
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: checkcast java/lang/reflect/ParameterizedType
      // 35: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 3a: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 3d: areturn
      // 3e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: iload 1
      // 44: ifeq 55
      // 47: instanceof java/lang/reflect/WildcardType
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: ifeq 90
      // 54: aload 0
      // 55: checkcast java/lang/reflect/WildcardType
      // 58: astore 2
      // 59: aload 2
      // 5a: invokeinterface java/lang/reflect/WildcardType.getUpperBounds ()[Ljava/lang/reflect/Type; 1
      // 5f: astore 3
      // 60: aload 3
      // 61: iload 1
      // 62: ifeq 79
      // 65: arraylength
      // 66: bipush 1
      // 67: if_icmpne 7f
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 3
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: bipush 0
      // 7a: aaload
      // 7b: invokestatic com/finalshell/core/B8_2.P$Class (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 7e: areturn
      // 7f: new com/finalshell/core/Hi2
      // 82: dup
      // 83: sipush -26461
      // 86: sipush -31679
      // 89: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 8c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 8f: athrow
      // 90: new com/finalshell/core/Hi2
      // 93: dup
      // 94: sipush -26493
      // 97: sipush -6529
      // 9a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 9d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // a0: athrow
   }

   public static boolean F(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/Class.getInterfaces ()[Ljava/lang/Class;
      // 04: astore 2
      // 05: aload 2
      // 06: arraylength
      // 07: istore 3
      // 08: invokestatic com/finalshell/core/Ph2.w ()I
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 1
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 52
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 20: astore 6
      // 22: iload 1
      // 23: ifeq 4e
      // 26: getstatic com/finalshell/core/B8_2.h Ljava/util/Set;
      // 29: aload 6
      // 2b: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 30: iload 1
      // 31: ifeq 53
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: ifeq 4b
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 1
      // 46: ireturn
      // 47: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iinc 4 1
      // 4e: iload 1
      // 4f: ifne 0f
      // 52: bipush 0
      // 53: ireturn
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean w(Method var0) {
      boolean var10000;
      int var1 = Ph2.w();

      try {
         if (var0 == null) {
            return false;
         }
      } catch (Exception var10) {
         throw a(var10);
      }

      label96: {
         label100: {
            try {
               var10000 = q;
               if (var1 == 0) {
                  break label100;
               }

               if (q) {
                  break label96;
               }
            } catch (Exception var12) {
               throw a(var12);
            }

            boolean var9 = false /* VF: Semaphore variable */;

            label93: {
               try {
                  var9 = true;
                  a = java.lang.Class.forName(a(-26489, -12628));
                  var9 = false;
                  break label93;
               } catch (Exception var13) {
                  var9 = false;
               } finally {
                  if (var9) {
                     q = true;
                  }
               }

               q = true;
               break label96;
            }

            var10000 = true;
         }

         q = var10000;
      }

      if (a != null) {
         Annotation var2 = J(var0, a);

         try {
            if (var2 != null) {
               return true;
            }
         } catch (Exception var11) {
            throw a(var11);
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean z(Method param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/B8_2.G Ljava/lang/Class;
      // 11: iload 1
      // 12: ifne 46
      // 15: ifnonnull 43
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: getstatic com/finalshell/core/B8_2.W Z
      // 22: ifne 43
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: sipush -26378
      // 2f: sipush 32340
      // 32: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 35: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 38: putstatic com/finalshell/core/B8_2.G Ljava/lang/Class;
      // 3b: goto 43
      // 3e: astore 2
      // 3f: bipush 1
      // 40: putstatic com/finalshell/core/B8_2.W Z
      // 43: getstatic com/finalshell/core/B8_2.G Ljava/lang/Class;
      // 46: ifnull 69
      // 49: aload 0
      // 4a: getstatic com/finalshell/core/B8_2.G Ljava/lang/Class;
      // 4d: invokevirtual java/lang/reflect/Method.isAnnotationPresent (Ljava/lang/Class;)Z
      // 50: iload 1
      // 51: ifne 66
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifeq 69
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
   }

   public static boolean G(Method param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/B8_2.f Ljava/lang/Class;
      // 11: iload 1
      // 12: ifne 46
      // 15: ifnonnull 43
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: getstatic com/finalshell/core/B8_2.b Z
      // 22: ifne 43
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: sipush -26415
      // 2f: sipush 5184
      // 32: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 35: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 38: putstatic com/finalshell/core/B8_2.f Ljava/lang/Class;
      // 3b: goto 43
      // 3e: astore 2
      // 3f: bipush 1
      // 40: putstatic com/finalshell/core/B8_2.b Z
      // 43: getstatic com/finalshell/core/B8_2.f Ljava/lang/Class;
      // 46: ifnull 85
      // 49: aload 0
      // 4a: getstatic com/finalshell/core/B8_2.G Ljava/lang/Class;
      // 4d: invokevirtual java/lang/reflect/Method.isAnnotationPresent (Ljava/lang/Class;)Z
      // 50: iload 1
      // 51: ifne 82
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifne 81
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 0
      // 66: getstatic com/finalshell/core/B8_2.f Ljava/lang/Class;
      // 69: invokevirtual java/lang/reflect/Method.isAnnotationPresent (Ljava/lang/Class;)Z
      // 6c: iload 1
      // 6d: ifne 82
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: ifeq 85
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static boolean O(Object param0) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/B8_2.t Ljava/lang/reflect/Method;
      // 11: iload 1
      // 12: ifeq 5d
      // 15: ifnonnull 5a
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: getstatic com/finalshell/core/B8_2.u Z
      // 22: ifne 5a
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: sipush -26383
      // 2f: sipush 26477
      // 32: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 35: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 38: astore 2
      // 39: aload 2
      // 3a: sipush -26443
      // 3d: sipush 6984
      // 40: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 43: bipush 1
      // 44: anewarray 100
      // 47: dup
      // 48: bipush 0
      // 49: ldc java/lang/Object
      // 4b: aastore
      // 4c: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 4f: putstatic com/finalshell/core/B8_2.t Ljava/lang/reflect/Method;
      // 52: goto 5a
      // 55: astore 2
      // 56: bipush 1
      // 57: putstatic com/finalshell/core/B8_2.u Z
      // 5a: getstatic com/finalshell/core/B8_2.t Ljava/lang/reflect/Method;
      // 5d: iload 1
      // 5e: ifeq 7a
      // 61: ifnull 84
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: getstatic com/finalshell/core/B8_2.t Ljava/lang/reflect/Method;
      // 6e: aconst_null
      // 6f: bipush 1
      // 70: anewarray 4
      // 73: dup
      // 74: bipush 0
      // 75: aload 0
      // 76: aastore
      // 77: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 7a: checkcast java/lang/Boolean
      // 7d: astore 2
      // 7e: aload 2
      // 7f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 82: ireturn
      // 83: astore 2
      // 84: bipush 1
      // 85: ireturn
   }

   public static double E(String param0) {
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
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 2
      // 008: istore 1
      // 009: iload 2
      // 00a: iload 1
      // 00b: ifeq 02b
      // 00e: sipush 11448
      // 011: ldc2_w 6983840208133098154
      // 014: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 017: if_icmple 02a
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 0
      // 022: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 025: dreturn
      // 026: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: bipush 0
      // 02b: istore 3
      // 02c: lconst_0
      // 02d: lstore 4
      // 02f: bipush 0
      // 030: istore 6
      // 032: bipush 0
      // 033: istore 7
      // 035: iload 7
      // 037: iload 2
      // 038: if_icmpge 14b
      // 03b: aload 0
      // 03c: iload 7
      // 03e: invokevirtual java/lang/String.charAt (I)C
      // 041: istore 8
      // 043: iload 8
      // 045: iload 1
      // 046: ifeq 14c
      // 049: sipush 7616
      // 04c: ldc2_w 659717581093354484
      // 04f: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 052: iload 1
      // 053: ifeq 096
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: if_icmpne 084
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: iload 7
      // 069: iload 1
      // 06a: ifeq 08d
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: ifne 084
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: bipush 1
      // 07f: istore 3
      // 080: iload 1
      // 081: ifne 144
      // 084: iload 8
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: sipush 25600
      // 090: ldc2_w 560660300898189892
      // 093: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 096: iload 1
      // 097: ifeq 0e2
      // 09a: if_icmpne 0d0
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: iload 6
      // 0a6: iload 1
      // 0a7: ifeq 0ca
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: ifeq 0c4
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 0bf: dreturn
      // 0c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: iload 2
      // 0c5: iload 7
      // 0c7: isub
      // 0c8: bipush 1
      // 0c9: isub
      // 0ca: istore 6
      // 0cc: iload 1
      // 0cd: ifne 144
      // 0d0: iload 8
      // 0d2: sipush 10433
      // 0d5: ldc2_w 8301337562390302429
      // 0d8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: iload 1
      // 0e3: ifeq 102
      // 0e6: if_icmplt 13b
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: iload 8
      // 0f2: sipush 31983
      // 0f5: ldc2_w 1197547028193598095
      // 0f8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: iload 1
      // 103: ifeq 122
      // 106: if_icmpgt 13b
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: iload 8
      // 112: sipush 10433
      // 115: ldc2_w 8301337562390302429
      // 118: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: isub
      // 123: istore 9
      // 125: lload 4
      // 127: sipush 13094
      // 12a: ldc2_w 2400752089642246298
      // 12d: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 130: lmul
      // 131: iload 9
      // 133: i2l
      // 134: ladd
      // 135: lstore 4
      // 137: iload 1
      // 138: ifne 144
      // 13b: aload 0
      // 13c: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 13f: dreturn
      // 140: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: iinc 7 1
      // 147: iload 1
      // 148: ifne 035
      // 14b: iload 3
      // 14c: iload 1
      // 14d: ifeq 161
      // 150: ifeq 15f
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: lload 4
      // 15c: lneg
      // 15d: lstore 4
      // 15f: iload 6
      // 161: tableswitch 135 0 9 55 63 71 79 87 95 103 111 119 127
      // 198: lload 4
      // 19a: l2d
      // 19b: dreturn
      // 19c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: lload 4
      // 1a2: l2d
      // 1a3: ldc2_w 10.0
      // 1a6: ddiv
      // 1a7: dreturn
      // 1a8: lload 4
      // 1aa: l2d
      // 1ab: ldc2_w 100.0
      // 1ae: ddiv
      // 1af: dreturn
      // 1b0: lload 4
      // 1b2: l2d
      // 1b3: ldc2_w 1000.0
      // 1b6: ddiv
      // 1b7: dreturn
      // 1b8: lload 4
      // 1ba: l2d
      // 1bb: ldc2_w 10000.0
      // 1be: ddiv
      // 1bf: dreturn
      // 1c0: lload 4
      // 1c2: l2d
      // 1c3: ldc2_w 100000.0
      // 1c6: ddiv
      // 1c7: dreturn
      // 1c8: lload 4
      // 1ca: l2d
      // 1cb: ldc2_w 1000000.0
      // 1ce: ddiv
      // 1cf: dreturn
      // 1d0: lload 4
      // 1d2: l2d
      // 1d3: ldc2_w 1.0E7
      // 1d6: ddiv
      // 1d7: dreturn
      // 1d8: lload 4
      // 1da: l2d
      // 1db: ldc2_w 1.0E8
      // 1de: ddiv
      // 1df: dreturn
      // 1e0: lload 4
      // 1e2: l2d
      // 1e3: ldc2_w 1.0E9
      // 1e6: ddiv
      // 1e7: dreturn
      // 1e8: aload 0
      // 1e9: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 1ec: dreturn
   }

   public static float z$float(String param0) {
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
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 2
      // 008: istore 1
      // 009: iload 2
      // 00a: iload 1
      // 00b: ifeq 02b
      // 00e: sipush 11448
      // 011: ldc2_w 6983840208133098154
      // 014: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 017: if_icmplt 02a
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 0
      // 022: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 025: freturn
      // 026: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: bipush 0
      // 02b: istore 3
      // 02c: lconst_0
      // 02d: lstore 4
      // 02f: bipush 0
      // 030: istore 6
      // 032: bipush 0
      // 033: istore 7
      // 035: iload 7
      // 037: iload 2
      // 038: if_icmpge 14b
      // 03b: aload 0
      // 03c: iload 7
      // 03e: invokevirtual java/lang/String.charAt (I)C
      // 041: istore 8
      // 043: iload 8
      // 045: iload 1
      // 046: ifeq 14c
      // 049: sipush 7616
      // 04c: ldc2_w 659717581093354484
      // 04f: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 052: iload 1
      // 053: ifeq 096
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: if_icmpne 084
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: iload 7
      // 069: iload 1
      // 06a: ifeq 08d
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: ifne 084
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: bipush 1
      // 07f: istore 3
      // 080: iload 1
      // 081: ifne 144
      // 084: iload 8
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: sipush 25600
      // 090: ldc2_w 560660300898189892
      // 093: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 096: iload 1
      // 097: ifeq 0e2
      // 09a: if_icmpne 0d0
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: iload 6
      // 0a6: iload 1
      // 0a7: ifeq 0ca
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: ifeq 0c4
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 0bf: freturn
      // 0c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: iload 2
      // 0c5: iload 7
      // 0c7: isub
      // 0c8: bipush 1
      // 0c9: isub
      // 0ca: istore 6
      // 0cc: iload 1
      // 0cd: ifne 144
      // 0d0: iload 8
      // 0d2: sipush 10433
      // 0d5: ldc2_w 8301337562390302429
      // 0d8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: iload 1
      // 0e3: ifeq 102
      // 0e6: if_icmplt 13b
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: iload 8
      // 0f2: sipush 31983
      // 0f5: ldc2_w 1197547028193598095
      // 0f8: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 0fb: goto 102
      // 0fe: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: iload 1
      // 103: ifeq 122
      // 106: if_icmpgt 13b
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: iload 8
      // 112: sipush 10433
      // 115: ldc2_w 8301337562390302429
      // 118: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: isub
      // 123: istore 9
      // 125: lload 4
      // 127: sipush 2042
      // 12a: ldc2_w 7803335937870271557
      // 12d: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 130: lmul
      // 131: iload 9
      // 133: i2l
      // 134: ladd
      // 135: lstore 4
      // 137: iload 1
      // 138: ifne 144
      // 13b: aload 0
      // 13c: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 13f: freturn
      // 140: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: iinc 7 1
      // 147: iload 1
      // 148: ifne 035
      // 14b: iload 3
      // 14c: iload 1
      // 14d: ifeq 161
      // 150: ifeq 15f
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: lload 4
      // 15c: lneg
      // 15d: lstore 4
      // 15f: iload 6
      // 161: tableswitch 135 0 9 55 63 71 79 87 95 103 111 119 127
      // 198: lload 4
      // 19a: l2f
      // 19b: freturn
      // 19c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: lload 4
      // 1a2: l2f
      // 1a3: ldc_w 10.0
      // 1a6: fdiv
      // 1a7: freturn
      // 1a8: lload 4
      // 1aa: l2f
      // 1ab: ldc_w 100.0
      // 1ae: fdiv
      // 1af: freturn
      // 1b0: lload 4
      // 1b2: l2f
      // 1b3: ldc_w 1000.0
      // 1b6: fdiv
      // 1b7: freturn
      // 1b8: lload 4
      // 1ba: l2f
      // 1bb: ldc_w 10000.0
      // 1be: fdiv
      // 1bf: freturn
      // 1c0: lload 4
      // 1c2: l2f
      // 1c3: ldc_w 100000.0
      // 1c6: fdiv
      // 1c7: freturn
      // 1c8: lload 4
      // 1ca: l2f
      // 1cb: ldc_w 1000000.0
      // 1ce: fdiv
      // 1cf: freturn
      // 1d0: lload 4
      // 1d2: l2f
      // 1d3: ldc_w 1.0E7
      // 1d6: fdiv
      // 1d7: freturn
      // 1d8: lload 4
      // 1da: l2f
      // 1db: ldc_w 1.0E8
      // 1de: fdiv
      // 1df: freturn
      // 1e0: lload 4
      // 1e2: l2f
      // 1e3: ldc_w 1.0E9
      // 1e6: fdiv
      // 1e7: freturn
      // 1e8: aload 0
      // 1e9: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 1ec: freturn
   }

   public static long A$long(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: sipush 376
      // 06: ldc2_w 848363383778742982
      // 09: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 0c: lstore 2
      // 0d: bipush 0
      // 0e: istore 4
      // 10: istore 1
      // 11: iload 4
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: if_icmpge d5
      // 1a: aload 0
      // 1b: iload 4
      // 1d: invokevirtual java/lang/String.charAt (I)C
      // 20: istore 5
      // 22: iload 1
      // 23: ifne d1
      // 26: iload 5
      // 28: sipush 28764
      // 2b: ldc2_w 8016641780204721695
      // 2e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 31: if_icmpeq ce
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 5
      // 3d: sipush 7616
      // 40: ldc2_w 659717581093354484
      // 43: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 46: iload 1
      // 47: ifne 78
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: if_icmpne 66
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: iload 1
      // 5c: ifeq ce
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: iload 5
      // 68: sipush 10648
      // 6b: ldc2_w 8362706924682317783
      // 6e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: iload 1
      // 79: ifne 98
      // 7c: if_icmplt bc
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: iload 5
      // 88: sipush 15521
      // 8b: ldc2_w 5660554601004309128
      // 8e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: iload 1
      // 99: ifne b8
      // 9c: if_icmpgt bc
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: iload 5
      // a8: sipush 16938
      // ab: ldc2_w 2443125401671984207
      // ae: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // b1: goto b8
      // b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b7: athrow
      // b8: iadd
      // b9: i2c
      // ba: istore 5
      // bc: lload 2
      // bd: iload 5
      // bf: i2l
      // c0: lxor
      // c1: lstore 2
      // c2: lload 2
      // c3: sipush 16774
      // c6: ldc2_w 8053343350903067198
      // c9: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // cc: lmul
      // cd: lstore 2
      // ce: iinc 4 1
      // d1: iload 1
      // d2: ifeq 11
      // d5: lload 2
      // d6: lreturn
   }

   public static long o(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: sipush 17571
      // 06: ldc2_w 1611286462948235038
      // 09: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 0c: lstore 2
      // 0d: istore 1
      // 0e: bipush 0
      // 0f: istore 4
      // 11: iload 4
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: if_icmpge 8a
      // 1a: aload 0
      // 1b: iload 4
      // 1d: invokevirtual java/lang/String.charAt (I)C
      // 20: istore 5
      // 22: iload 1
      // 23: ifeq 86
      // 26: iload 5
      // 28: sipush 10648
      // 2b: ldc2_w 8362706924682317783
      // 2e: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 31: if_icmplt 71
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 5
      // 3d: sipush 927
      // 40: ldc2_w 9053302487923959212
      // 43: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 46: iload 1
      // 47: ifeq 6d
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: if_icmpgt 71
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: iload 5
      // 5d: sipush 16938
      // 60: ldc2_w 2443125401671984207
      // 63: invokestatic com/finalshell/core/B8_2.a (IJ)I
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: iadd
      // 6e: i2c
      // 6f: istore 5
      // 71: lload 2
      // 72: iload 5
      // 74: i2l
      // 75: lxor
      // 76: lstore 2
      // 77: lload 2
      // 78: sipush 27337
      // 7b: ldc2_w 787565905631934835
      // 7e: invokestatic com/finalshell/core/B8_2.b (IJ)J
      // 81: lmul
      // 82: lstore 2
      // 83: iinc 4 1
      // 86: iload 1
      // 87: ifne 11
      // 8a: lload 2
      // 8b: lreturn
   }

   public static long z$long(String var0) {
      long var1 = b(376, 848363383778742982L);

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         var1 ^= (long)var4;
         var1 *= b(16774, 8053343350903067198L);
      }

      return var1;
   }

   public static boolean O(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: getstatic com/finalshell/core/B8_2.l Ljava/lang/Class;
      // 07: iload 1
      // 08: ifne 3c
      // 0b: ifnonnull 39
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic com/finalshell/core/B8_2.k Z
      // 18: ifne 39
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: sipush -26417
      // 25: sipush 16667
      // 28: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 2b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 2e: putstatic com/finalshell/core/B8_2.l Ljava/lang/Class;
      // 31: goto 39
      // 34: astore 2
      // 35: bipush 1
      // 36: putstatic com/finalshell/core/B8_2.k Z
      // 39: getstatic com/finalshell/core/B8_2.l Ljava/lang/Class;
      // 3c: iload 1
      // 3d: ifne 4b
      // 40: ifnull 63
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: getstatic com/finalshell/core/B8_2.l Ljava/lang/Class;
      // 4e: invokevirtual java/lang/Class.isAnnotationPresent (Ljava/lang/Class;)Z
      // 51: iload 1
      // 52: ifne 60
      // 55: ifeq 63
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: bipush 0
      // 64: ireturn
   }

   public static Constructor n(Constructor[] var0) {
      return B(var0, null);
   }

   public static Constructor B(Constructor[] param0, String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: aload 0
      // 03: astore 4
      // 05: invokestatic com/finalshell/core/Ph2.w ()I
      // 08: aload 4
      // 0a: arraylength
      // 0b: istore 5
      // 0d: istore 2
      // 0e: bipush 0
      // 0f: istore 6
      // 11: iload 6
      // 13: iload 5
      // 15: if_icmpge e6
      // 18: aload 4
      // 1a: iload 6
      // 1c: aaload
      // 1d: astore 7
      // 1f: aload 7
      // 21: iload 2
      // 22: ifeq e7
      // 25: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 28: astore 8
      // 2a: aload 1
      // 2b: ifnull 53
      // 2e: aload 8
      // 30: arraylength
      // 31: iload 2
      // 32: ifeq 5d
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: arraylength
      // 3e: if_icmpeq 53
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 2
      // 49: ifne df
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 8
      // 55: arraylength
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifeq 89
      // 61: ifle 97
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 8
      // 6d: aload 8
      // 6f: arraylength
      // 70: bipush 1
      // 71: isub
      // 72: aaload
      // 73: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 76: sipush -26427
      // 79: sipush 26118
      // 7c: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 7f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: ifeq 97
      // 8c: iload 2
      // 8d: ifne df
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: aload 3
      // 98: iload 2
      // 99: ifeq de
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: ifnull d5
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 3
      // ae: iload 2
      // af: ifeq de
      // b2: goto b9
      // b5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // bc: arraylength
      // bd: aload 8
      // bf: arraylength
      // c0: if_icmplt d5
      // c3: goto ca
      // c6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: iload 2
      // cb: ifne df
      // ce: goto d5
      // d1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d4: athrow
      // d5: aload 7
      // d7: goto de
      // da: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dd: athrow
      // de: astore 3
      // df: iinc 6 1
      // e2: iload 2
      // e3: ifne 11
      // e6: aload 3
      // e7: areturn
   }

   public static String[] B(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.w ()I
      // 003: istore 1
      // 004: getstatic com/finalshell/core/B8_2.z Ljava/lang/reflect/Constructor;
      // 007: iload 1
      // 008: ifeq 04a
      // 00b: ifnonnull 047
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: getstatic com/finalshell/core/B8_2.v Z
      // 018: ifne 047
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: sipush -26379
      // 025: sipush 7318
      // 028: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 02b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 02e: astore 2
      // 02f: aload 2
      // 030: bipush 1
      // 031: anewarray 100
      // 034: dup
      // 035: bipush 0
      // 036: ldc java/lang/Class
      // 038: aastore
      // 039: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 03c: putstatic com/finalshell/core/B8_2.z Ljava/lang/reflect/Constructor;
      // 03f: goto 047
      // 042: astore 2
      // 043: bipush 1
      // 044: putstatic com/finalshell/core/B8_2.v Z
      // 047: getstatic com/finalshell/core/B8_2.z Ljava/lang/reflect/Constructor;
      // 04a: ifnonnull 053
      // 04d: aconst_null
      // 04e: areturn
      // 04f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: getstatic com/finalshell/core/B8_2.g Ljava/lang/reflect/Method;
      // 056: iload 1
      // 057: ifeq 09d
      // 05a: ifnonnull 09a
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: getstatic com/finalshell/core/B8_2.v Z
      // 067: ifne 09a
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: sipush -26394
      // 074: sipush 6747
      // 077: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 07a: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 07d: astore 2
      // 07e: aload 2
      // 07f: sipush -26414
      // 082: sipush 14539
      // 085: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 088: bipush 0
      // 089: anewarray 100
      // 08c: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 08f: putstatic com/finalshell/core/B8_2.g Ljava/lang/reflect/Method;
      // 092: goto 09a
      // 095: astore 2
      // 096: bipush 1
      // 097: putstatic com/finalshell/core/B8_2.v Z
      // 09a: getstatic com/finalshell/core/B8_2.p Ljava/lang/reflect/Method;
      // 09d: iload 1
      // 09e: ifeq 0e4
      // 0a1: ifnonnull 0e1
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: getstatic com/finalshell/core/B8_2.v Z
      // 0ae: ifne 0e1
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: sipush -26392
      // 0bb: sipush 2921
      // 0be: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0c1: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0c4: astore 2
      // 0c5: aload 2
      // 0c6: sipush -26384
      // 0c9: sipush -6993
      // 0cc: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0cf: bipush 0
      // 0d0: anewarray 100
      // 0d3: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 0d6: putstatic com/finalshell/core/B8_2.p Ljava/lang/reflect/Method;
      // 0d9: goto 0e1
      // 0dc: astore 2
      // 0dd: bipush 1
      // 0de: putstatic com/finalshell/core/B8_2.v Z
      // 0e1: getstatic com/finalshell/core/B8_2.n Ljava/lang/reflect/Method;
      // 0e4: ifnonnull 128
      // 0e7: getstatic com/finalshell/core/B8_2.v Z
      // 0ea: iload 1
      // 0eb: ifeq 12b
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: ifne 128
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: sipush -26410
      // 102: sipush -14132
      // 105: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 108: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 10b: astore 2
      // 10c: aload 2
      // 10d: sipush -26397
      // 110: sipush 25014
      // 113: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 116: bipush 0
      // 117: anewarray 100
      // 11a: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 11d: putstatic com/finalshell/core/B8_2.n Ljava/lang/reflect/Method;
      // 120: goto 128
      // 123: astore 2
      // 124: bipush 1
      // 125: putstatic com/finalshell/core/B8_2.v Z
      // 128: getstatic com/finalshell/core/B8_2.s Z
      // 12b: ifeq 134
      // 12e: aconst_null
      // 12f: areturn
      // 130: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: aconst_null
      // 135: astore 2
      // 136: getstatic com/finalshell/core/B8_2.z Ljava/lang/reflect/Constructor;
      // 139: bipush 1
      // 13a: anewarray 4
      // 13d: dup
      // 13e: bipush 0
      // 13f: aload 0
      // 140: aastore
      // 141: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 144: astore 3
      // 145: getstatic com/finalshell/core/B8_2.g Ljava/lang/reflect/Method;
      // 148: aload 3
      // 149: bipush 0
      // 14a: anewarray 4
      // 14d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 150: checkcast java/lang/Iterable
      // 153: astore 4
      // 155: aload 4
      // 157: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 15c: astore 5
      // 15e: aload 5
      // 160: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 165: ifeq 1d9
      // 168: aload 5
      // 16a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16f: astore 6
      // 171: getstatic com/finalshell/core/B8_2.p Ljava/lang/reflect/Method;
      // 174: aload 6
      // 176: bipush 0
      // 177: anewarray 4
      // 17a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17d: checkcast java/util/List
      // 180: astore 7
      // 182: aload 2
      // 183: iload 1
      // 184: ifeq 1da
      // 187: iload 1
      // 188: ifeq 1cc
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: ifnull 1c3
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 7
      // 19e: iload 1
      // 19f: ifeq 1cc
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: invokeinterface java/util/List.size ()I 1
      // 1ae: ifne 1c3
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: iload 1
      // 1b9: ifne 1cd
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: aload 6
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: astore 2
      // 1cd: aload 5
      // 1cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d4: pop
      // 1d5: iload 1
      // 1d6: ifne 15e
      // 1d9: aload 2
      // 1da: iload 1
      // 1db: ifeq 1f5
      // 1de: ifnonnull 1ea
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e7: athrow
      // 1e8: aconst_null
      // 1e9: areturn
      // 1ea: getstatic com/finalshell/core/B8_2.p Ljava/lang/reflect/Method;
      // 1ed: aload 2
      // 1ee: bipush 0
      // 1ef: anewarray 4
      // 1f2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1f5: checkcast java/util/List
      // 1f8: astore 5
      // 1fa: aload 5
      // 1fc: invokeinterface java/util/List.size ()I 1
      // 201: anewarray 179
      // 204: astore 6
      // 206: bipush 0
      // 207: istore 7
      // 209: iload 7
      // 20b: aload 5
      // 20d: invokeinterface java/util/List.size ()I 1
      // 212: if_icmpge 246
      // 215: aload 5
      // 217: iload 7
      // 219: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21e: astore 8
      // 220: aload 6
      // 222: iload 1
      // 223: ifeq 248
      // 226: iload 7
      // 228: getstatic com/finalshell/core/B8_2.n Ljava/lang/reflect/Method;
      // 22b: aload 8
      // 22d: bipush 0
      // 22e: anewarray 4
      // 231: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 234: checkcast java/lang/String
      // 237: aastore
      // 238: iinc 7 1
      // 23b: iload 1
      // 23c: ifne 209
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 245: athrow
      // 246: aload 6
      // 248: areturn
      // 249: astore 2
      // 24a: aload 2
      // 24b: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 24e: bipush 1
      // 24f: putstatic com/finalshell/core/B8_2.s Z
      // 252: aconst_null
      // 253: areturn
   }

   public static boolean j(java.lang.Class param0, String param1) {
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
      // 004: getstatic com/finalshell/core/B8_2.E Ljava/util/Map;
      // 007: iload 2
      // 008: ifne 138
      // 00b: ifnonnull 135
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: getstatic com/finalshell/core/B8_2.H Z
      // 018: ifne 135
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: new java/util/HashMap
      // 025: dup
      // 026: invokespecial java/util/HashMap.<init> ()V
      // 029: astore 3
      // 02a: sipush -26466
      // 02d: sipush -24846
      // 030: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 033: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 036: astore 4
      // 038: aload 3
      // 039: aload 4
      // 03b: bipush 2
      // 03c: anewarray 179
      // 03f: dup
      // 040: bipush 0
      // 041: sipush -26491
      // 044: sipush 10737
      // 047: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 04a: aastore
      // 04b: dup
      // 04c: bipush 1
      // 04d: sipush -26428
      // 050: sipush 11140
      // 053: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 056: aastore
      // 057: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 05c: pop
      // 05d: sipush -26445
      // 060: sipush -20356
      // 063: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 066: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 069: astore 5
      // 06b: aload 3
      // 06c: aload 5
      // 06e: bipush 2
      // 06f: anewarray 179
      // 072: dup
      // 073: bipush 0
      // 074: sipush -26455
      // 077: sipush -14479
      // 07a: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 07d: aastore
      // 07e: dup
      // 07f: bipush 1
      // 080: sipush -26478
      // 083: sipush -29956
      // 086: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 089: aastore
      // 08a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 08f: pop
      // 090: sipush -26485
      // 093: sipush -1373
      // 096: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 099: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 09c: astore 6
      // 09e: aload 3
      // 09f: aload 6
      // 0a1: bipush 2
      // 0a2: anewarray 179
      // 0a5: dup
      // 0a6: bipush 0
      // 0a7: sipush -26455
      // 0aa: sipush -14479
      // 0ad: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0b0: aastore
      // 0b1: dup
      // 0b2: bipush 1
      // 0b3: sipush -26478
      // 0b6: sipush -29956
      // 0b9: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0bc: aastore
      // 0bd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c2: pop
      // 0c3: sipush -26377
      // 0c6: sipush -22713
      // 0c9: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0cc: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0cf: astore 7
      // 0d1: aload 3
      // 0d2: aload 7
      // 0d4: bipush 2
      // 0d5: anewarray 179
      // 0d8: dup
      // 0d9: bipush 0
      // 0da: sipush -26455
      // 0dd: sipush -14479
      // 0e0: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0e3: aastore
      // 0e4: dup
      // 0e5: bipush 1
      // 0e6: sipush -26478
      // 0e9: sipush -29956
      // 0ec: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0ef: aastore
      // 0f0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0f5: pop
      // 0f6: sipush -26447
      // 0f9: sipush -10041
      // 0fc: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 0ff: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 102: astore 8
      // 104: aload 3
      // 105: aload 8
      // 107: bipush 2
      // 108: anewarray 179
      // 10b: dup
      // 10c: bipush 0
      // 10d: sipush -26455
      // 110: sipush -14479
      // 113: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 116: aastore
      // 117: dup
      // 118: bipush 1
      // 119: sipush -26478
      // 11c: sipush -29956
      // 11f: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 122: aastore
      // 123: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 128: pop
      // 129: aload 3
      // 12a: putstatic com/finalshell/core/B8_2.E Ljava/util/Map;
      // 12d: goto 135
      // 130: astore 3
      // 131: bipush 1
      // 132: putstatic com/finalshell/core/B8_2.H Z
      // 135: getstatic com/finalshell/core/B8_2.E Ljava/util/Map;
      // 138: iload 2
      // 139: ifne 155
      // 13c: ifnonnull 14c
      // 13f: goto 146
      // 142: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: bipush 0
      // 147: ireturn
      // 148: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: getstatic com/finalshell/core/B8_2.E Ljava/util/Map;
      // 14f: aload 0
      // 150: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 155: checkcast [Ljava/lang/String;
      // 158: astore 3
      // 159: aload 3
      // 15a: iload 2
      // 15b: ifne 169
      // 15e: ifnull 17f
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 3
      // 169: aload 1
      // 16a: invokestatic java/util/Arrays.binarySearch ([Ljava/lang/Object;Ljava/lang/Object;)I
      // 16d: iload 2
      // 16e: ifne 17c
      // 171: iflt 17f
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: bipush 1
      // 17c: goto 180
      // 17f: bipush 0
      // 180: ireturn
   }

   public static Annotation X(java.lang.Class param0, java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual java/lang/Class.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 008: astore 3
      // 009: aconst_null
      // 00a: astore 4
      // 00c: istore 2
      // 00d: aload 0
      // 00e: invokestatic com/finalshell/core/Ok2.k (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 011: astore 5
      // 013: aload 5
      // 015: iload 2
      // 016: ifne 02f
      // 019: instanceof java/lang/Class
      // 01c: ifeq 034
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 5
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: checkcast java/lang/Class
      // 032: astore 4
      // 034: aload 4
      // 036: iload 2
      // 037: ifne 0f1
      // 03a: ifnull 0f0
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 4
      // 046: aload 1
      // 047: invokevirtual java/lang/Class.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 04a: astore 6
      // 04c: aload 4
      // 04e: invokevirtual java/lang/Class.getAnnotations ()[Ljava/lang/annotation/Annotation;
      // 051: astore 7
      // 053: aload 6
      // 055: iload 2
      // 056: ifne 0df
      // 059: ifnonnull 0dd
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 7
      // 065: iload 2
      // 066: ifne 084
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: arraylength
      // 071: ifle 0dd
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 7
      // 07d: goto 084
      // 080: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: astore 8
      // 086: aload 8
      // 088: arraylength
      // 089: istore 9
      // 08b: bipush 0
      // 08c: istore 10
      // 08e: iload 10
      // 090: iload 9
      // 092: if_icmpge 0dd
      // 095: aload 8
      // 097: iload 10
      // 099: aaload
      // 09a: astore 11
      // 09c: aload 11
      // 09e: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 0a3: aload 1
      // 0a4: invokevirtual java/lang/Class.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0a7: astore 6
      // 0a9: iload 2
      // 0aa: ifne 0d9
      // 0ad: aload 6
      // 0af: iload 2
      // 0b0: ifne 0df
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: ifnull 0cf
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: iload 2
      // 0c5: ifeq 0dd
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: iinc 10 1
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifeq 08e
      // 0dd: aload 6
      // 0df: iload 2
      // 0e0: ifne 0ef
      // 0e3: ifnull 0f0
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 6
      // 0ef: areturn
      // 0f0: aload 0
      // 0f1: invokevirtual java/lang/Class.getAnnotations ()[Ljava/lang/annotation/Annotation;
      // 0f4: astore 6
      // 0f6: aload 3
      // 0f7: iload 2
      // 0f8: ifne 17e
      // 0fb: ifnonnull 17d
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 6
      // 107: iload 2
      // 108: ifne 126
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: arraylength
      // 113: ifle 17d
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 6
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: astore 7
      // 128: aload 7
      // 12a: arraylength
      // 12b: istore 8
      // 12d: bipush 0
      // 12e: istore 9
      // 130: iload 9
      // 132: iload 8
      // 134: if_icmpge 17d
      // 137: aload 7
      // 139: iload 9
      // 13b: aaload
      // 13c: astore 10
      // 13e: aload 10
      // 140: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 145: aload 1
      // 146: invokevirtual java/lang/Class.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 149: astore 3
      // 14a: iload 2
      // 14b: ifne 179
      // 14e: aload 3
      // 14f: iload 2
      // 150: ifne 17e
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: ifnull 16f
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: iload 2
      // 165: ifeq 17d
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: iinc 9 1
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: iload 2
      // 17a: ifeq 130
      // 17d: aload 3
      // 17e: areturn
   }

   public static Annotation f(Field param0, java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual java/lang/reflect/Field.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 05: astore 3
      // 06: aload 0
      // 07: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 0a: astore 4
      // 0c: invokestatic com/finalshell/core/Ph2.u ()I
      // 0f: aconst_null
      // 10: astore 6
      // 12: istore 2
      // 13: aload 4
      // 15: invokestatic com/finalshell/core/Ok2.k (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 18: astore 7
      // 1a: aload 7
      // 1c: iload 2
      // 1d: ifne 36
      // 20: instanceof java/lang/Class
      // 23: ifeq 3b
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 7
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: checkcast java/lang/Class
      // 39: astore 6
      // 3b: aload 6
      // 3d: ifnull bd
      // 40: aconst_null
      // 41: astore 8
      // 43: aload 0
      // 44: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // 47: astore 9
      // 49: aload 6
      // 4b: astore 10
      // 4d: aload 10
      // 4f: iload 2
      // 50: ifne 5f
      // 53: ifnull 88
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 10
      // 5f: iload 2
      // 60: ifne 71
      // 63: ldc java/lang/Object
      // 65: if_acmpeq 88
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 10
      // 71: aload 9
      // 73: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 76: astore 8
      // 78: goto 88
      // 7b: astore 11
      // 7d: aload 10
      // 7f: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 82: astore 10
      // 84: iload 2
      // 85: ifeq 4d
      // 88: aload 8
      // 8a: iload 2
      // 8b: ifne a0
      // 8e: ifnonnull 9e
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: aload 3
      // 99: areturn
      // 9a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: aload 8
      // a0: aload 1
      // a1: invokevirtual java/lang/reflect/Field.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // a4: astore 5
      // a6: aload 5
      // a8: iload 2
      // a9: ifne be
      // ac: ifnull bd
      // af: goto b6
      // b2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: aload 5
      // b8: areturn
      // b9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: aload 3
      // be: areturn
   }

   public static Annotation J(Method param0, java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 05: astore 3
      // 06: aload 0
      // 07: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 0a: astore 4
      // 0c: aconst_null
      // 0d: astore 6
      // 0f: invokestatic com/finalshell/core/Ph2.w ()I
      // 12: aload 4
      // 14: invokestatic com/finalshell/core/Ok2.k (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 17: astore 7
      // 19: istore 2
      // 1a: aload 7
      // 1c: iload 2
      // 1d: ifeq 36
      // 20: instanceof java/lang/Class
      // 23: ifeq 3b
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 7
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: checkcast java/lang/Class
      // 39: astore 6
      // 3b: aload 6
      // 3d: ifnull c5
      // 40: aconst_null
      // 41: astore 8
      // 43: aload 0
      // 44: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 47: astore 9
      // 49: aload 0
      // 4a: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 4d: astore 10
      // 4f: aload 6
      // 51: astore 11
      // 53: aload 11
      // 55: iload 2
      // 56: ifeq 65
      // 59: ifnull 90
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 11
      // 65: iload 2
      // 66: ifeq 77
      // 69: ldc java/lang/Object
      // 6b: if_acmpeq 90
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 11
      // 77: aload 9
      // 79: aload 10
      // 7b: invokevirtual java/lang/Class.getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 7e: astore 8
      // 80: goto 90
      // 83: astore 12
      // 85: aload 11
      // 87: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 8a: astore 11
      // 8c: iload 2
      // 8d: ifne 53
      // 90: aload 8
      // 92: iload 2
      // 93: ifeq a8
      // 96: ifnonnull a6
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: aload 3
      // a1: areturn
      // a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: aload 8
      // a8: aload 1
      // a9: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // ac: astore 5
      // ae: aload 5
      // b0: iload 2
      // b1: ifeq c6
      // b4: ifnull c5
      // b7: goto be
      // ba: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: aload 5
      // c0: areturn
      // c1: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c4: athrow
      // c5: aload 3
      // c6: areturn
   }

   public static Annotation[][] v(Method param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/reflect/Method.getParameterAnnotations ()[[Ljava/lang/annotation/Annotation;
      // 04: astore 2
      // 05: invokestatic com/finalshell/core/Ph2.u ()I
      // 08: aload 0
      // 09: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 0c: astore 3
      // 0d: aconst_null
      // 0e: astore 5
      // 10: istore 1
      // 11: aload 3
      // 12: invokestatic com/finalshell/core/Ok2.k (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 15: astore 6
      // 17: aload 6
      // 19: iload 1
      // 1a: ifne 33
      // 1d: instanceof java/lang/Class
      // 20: ifeq 38
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 6
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: checkcast java/lang/Class
      // 36: astore 5
      // 38: aload 5
      // 3a: ifnull c4
      // 3d: aconst_null
      // 3e: astore 7
      // 40: aload 0
      // 41: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 44: astore 8
      // 46: aload 0
      // 47: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 4a: astore 9
      // 4c: aload 5
      // 4e: astore 10
      // 50: aload 10
      // 52: iload 1
      // 53: ifne 62
      // 56: ifnull 90
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 10
      // 62: iload 1
      // 63: ifne 74
      // 66: ldc java/lang/Object
      // 68: if_acmpeq 90
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 10
      // 74: aload 8
      // 76: aload 9
      // 78: invokevirtual java/lang/Class.getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 7b: astore 7
      // 7d: goto 90
      // 80: astore 11
      // 82: goto 85
      // 85: aload 10
      // 87: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 8a: astore 10
      // 8c: iload 1
      // 8d: ifeq 50
      // 90: aload 7
      // 92: iload 1
      // 93: ifne a8
      // 96: ifnonnull a6
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: aload 2
      // a1: areturn
      // a2: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: aload 7
      // a8: invokevirtual java/lang/reflect/Method.getParameterAnnotations ()[[Ljava/lang/annotation/Annotation;
      // ab: astore 4
      // ad: aload 4
      // af: iload 1
      // b0: ifne c5
      // b3: ifnull c4
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: aload 4
      // bf: areturn
      // c0: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: aload 2
      // c5: areturn
   }

   public static Annotation[][] R(Constructor param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ph2.u ()I
      // 003: aload 0
      // 004: invokevirtual java/lang/reflect/Constructor.getParameterAnnotations ()[[Ljava/lang/annotation/Annotation;
      // 007: astore 2
      // 008: istore 1
      // 009: aload 0
      // 00a: invokevirtual java/lang/reflect/Constructor.getDeclaringClass ()Ljava/lang/Class;
      // 00d: astore 3
      // 00e: aconst_null
      // 00f: astore 5
      // 011: aload 3
      // 012: invokestatic com/finalshell/core/Ok2.k (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 015: astore 6
      // 017: aload 6
      // 019: iload 1
      // 01a: ifne 033
      // 01d: instanceof java/lang/Class
      // 020: ifeq 038
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 6
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: checkcast java/lang/Class
      // 036: astore 5
      // 038: aload 5
      // 03a: ifnull 15c
      // 03d: aconst_null
      // 03e: astore 7
      // 040: aload 0
      // 041: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 044: astore 8
      // 046: new java/util/ArrayList
      // 049: dup
      // 04a: bipush 2
      // 04b: invokespecial java/util/ArrayList.<init> (I)V
      // 04e: astore 9
      // 050: aload 5
      // 052: invokevirtual java/lang/Class.getEnclosingClass ()Ljava/lang/Class;
      // 055: astore 10
      // 057: aload 10
      // 059: ifnull 07c
      // 05c: aload 9
      // 05e: aload 10
      // 060: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 065: pop
      // 066: aload 10
      // 068: invokevirtual java/lang/Class.getEnclosingClass ()Ljava/lang/Class;
      // 06b: astore 10
      // 06d: iload 1
      // 06e: ifne 15c
      // 071: iload 1
      // 072: ifeq 057
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 9
      // 07e: invokeinterface java/util/List.size ()I 1
      // 083: istore 10
      // 085: aload 5
      // 087: astore 11
      // 089: aload 11
      // 08b: iload 1
      // 08c: ifne 09b
      // 08f: ifnull 128
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 11
      // 09b: ldc java/lang/Object
      // 09d: if_acmpeq 128
      // 0a0: iload 10
      // 0a2: iload 1
      // 0a3: ifne 0bd
      // 0a6: ifeq 10c
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: iload 10
      // 0b2: aload 8
      // 0b4: arraylength
      // 0b5: iadd
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: anewarray 100
      // 0c0: astore 12
      // 0c2: aload 8
      // 0c4: bipush 0
      // 0c5: aload 12
      // 0c7: iload 10
      // 0c9: aload 8
      // 0cb: arraylength
      // 0cc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0cf: iload 10
      // 0d1: istore 13
      // 0d3: iload 13
      // 0d5: ifle 0ff
      // 0d8: aload 12
      // 0da: iload 13
      // 0dc: bipush 1
      // 0dd: isub
      // 0de: aload 9
      // 0e0: iload 13
      // 0e2: bipush 1
      // 0e3: isub
      // 0e4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e9: checkcast java/lang/Class
      // 0ec: aastore
      // 0ed: iinc 13 -1
      // 0f0: iload 1
      // 0f1: ifne 108
      // 0f4: iload 1
      // 0f5: ifeq 0d3
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 5
      // 101: aload 12
      // 103: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 106: astore 7
      // 108: iload 1
      // 109: ifeq 115
      // 10c: aload 5
      // 10e: aload 8
      // 110: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 113: astore 7
      // 115: goto 128
      // 118: astore 12
      // 11a: iinc 10 -1
      // 11d: aload 11
      // 11f: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 122: astore 11
      // 124: iload 1
      // 125: ifeq 089
      // 128: aload 7
      // 12a: iload 1
      // 12b: ifne 140
      // 12e: ifnonnull 13e
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: aload 2
      // 139: areturn
      // 13a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 7
      // 140: invokevirtual java/lang/reflect/Constructor.getParameterAnnotations ()[[Ljava/lang/annotation/Annotation;
      // 143: astore 4
      // 145: aload 4
      // 147: iload 1
      // 148: ifne 15d
      // 14b: ifnull 15c
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: aload 4
      // 157: areturn
      // 158: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 2
      // 15d: areturn
   }

   public static boolean e(Method param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic com/finalshell/core/B8_2.R Ljava/lang/Class;
      // 11: iload 1
      // 12: ifne 46
      // 15: ifnonnull 43
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: getstatic com/finalshell/core/B8_2.w Z
      // 22: ifne 43
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: sipush -26369
      // 2f: sipush 14325
      // 32: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 35: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 38: putstatic com/finalshell/core/B8_2.R Ljava/lang/Class;
      // 3b: goto 43
      // 3e: astore 2
      // 3f: bipush 1
      // 40: putstatic com/finalshell/core/B8_2.w Z
      // 43: getstatic com/finalshell/core/B8_2.R Ljava/lang/Class;
      // 46: ifnull 69
      // 49: aload 0
      // 4a: getstatic com/finalshell/core/B8_2.R Ljava/lang/Class;
      // 4d: invokevirtual java/lang/reflect/Method.isAnnotationPresent (Ljava/lang/Class;)Z
      // 50: iload 1
      // 51: ifne 66
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifeq 69
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
   }

   public static Object Q(Type param0) {
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
      // 04: getstatic com/finalshell/core/B8_2.D Z
      // 07: ifeq 10
      // 0a: aconst_null
      // 0b: areturn
      // 0c: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: aload 0
      // 11: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 14: astore 2
      // 15: aload 2
      // 16: iload 1
      // 17: ifeq 2b
      // 1a: ifnonnull 2a
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aconst_null
      // 25: areturn
      // 26: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 2e: astore 3
      // 2f: sipush -26481
      // 32: sipush 15523
      // 35: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 38: iload 1
      // 39: ifeq 54
      // 3c: aload 3
      // 3d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 40: ifeq 92
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: getstatic com/finalshell/core/B8_2.L Ljava/lang/Object;
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: iload 1
      // 55: ifeq 91
      // 58: ifnonnull 8e
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/B8_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 3
      // 63: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 66: sipush -26440
      // 69: sipush 20568
      // 6c: invokestatic com/finalshell/core/B8_2.a (II)Ljava/lang/String;
      // 6f: bipush 0
      // 70: anewarray 100
      // 73: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 76: astore 4
      // 78: aload 4
      // 7a: aconst_null
      // 7b: bipush 0
      // 7c: anewarray 4
      // 7f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 82: putstatic com/finalshell/core/B8_2.L Ljava/lang/Object;
      // 85: goto 8e
      // 88: astore 4
      // 8a: bipush 1
      // 8b: putstatic com/finalshell/core/B8_2.D Z
      // 8e: getstatic com/finalshell/core/B8_2.L Ljava/lang/Object;
      // 91: areturn
      // 92: aconst_null
      // 93: areturn
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -26489) & 65535;
      if (J[var2] == null) {
         char[] var3 = o[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 26;
               break;
            case 1:
               var10000 = 180;
               break;
            case 2:
               var10000 = 125;
               break;
            case 3:
               var10000 = 59;
               break;
            case 4:
               var10000 = 219;
               break;
            case 5:
               var10000 = 47;
               break;
            case 6:
               var10000 = 21;
               break;
            case 7:
               var10000 = 91;
               break;
            case 8:
               var10000 = 96;
               break;
            case 9:
               var10000 = 81;
               break;
            case 10:
               var10000 = 142;
               break;
            case 11:
               var10000 = 42;
               break;
            case 12:
               var10000 = 166;
               break;
            case 13:
               var10000 = 124;
               break;
            case 14:
               var10000 = 242;
               break;
            case 15:
               var10000 = 100;
               break;
            case 16:
               var10000 = 27;
               break;
            case 17:
               var10000 = 13;
               break;
            case 18:
               var10000 = 133;
               break;
            case 19:
               var10000 = 241;
               break;
            case 20:
               var10000 = 229;
               break;
            case 21:
               var10000 = 35;
               break;
            case 22:
               var10000 = 178;
               break;
            case 23:
               var10000 = 225;
               break;
            case 24:
               var10000 = 165;
               break;
            case 25:
               var10000 = 238;
               break;
            case 26:
               var10000 = 55;
               break;
            case 27:
               var10000 = 195;
               break;
            case 28:
               var10000 = 34;
               break;
            case 29:
               var10000 = 29;
               break;
            case 30:
               var10000 = 177;
               break;
            case 31:
               var10000 = 30;
               break;
            case 32:
               var10000 = 83;
               break;
            case 33:
               var10000 = 63;
               break;
            case 34:
               var10000 = 140;
               break;
            case 35:
               var10000 = 214;
               break;
            case 36:
               var10000 = 159;
               break;
            case 37:
               var10000 = 193;
               break;
            case 38:
               var10000 = 240;
               break;
            case 39:
               var10000 = 33;
               break;
            case 40:
               var10000 = 118;
               break;
            case 41:
               var10000 = 201;
               break;
            case 42:
               var10000 = 98;
               break;
            case 43:
               var10000 = 87;
               break;
            case 44:
               var10000 = 198;
               break;
            case 45:
               var10000 = 210;
               break;
            case 46:
               var10000 = 247;
               break;
            case 47:
               var10000 = 68;
               break;
            case 48:
               var10000 = 73;
               break;
            case 49:
               var10000 = 84;
               break;
            case 50:
               var10000 = 62;
               break;
            case 51:
               var10000 = 36;
               break;
            case 52:
               var10000 = 7;
               break;
            case 53:
               var10000 = 54;
               break;
            case 54:
               var10000 = 104;
               break;
            case 55:
               var10000 = 182;
               break;
            case 56:
               var10000 = 19;
               break;
            case 57:
               var10000 = 206;
               break;
            case 58:
               var10000 = 8;
               break;
            case 59:
               var10000 = 132;
               break;
            case 60:
               var10000 = 197;
               break;
            case 61:
               var10000 = 151;
               break;
            case 62:
               var10000 = 95;
               break;
            case 63:
               var10000 = 122;
               break;
            case 64:
               var10000 = 156;
               break;
            case 65:
               var10000 = 129;
               break;
            case 66:
               var10000 = 154;
               break;
            case 67:
               var10000 = 227;
               break;
            case 68:
               var10000 = 136;
               break;
            case 69:
               var10000 = 116;
               break;
            case 70:
               var10000 = 72;
               break;
            case 71:
               var10000 = 9;
               break;
            case 72:
               var10000 = 231;
               break;
            case 73:
               var10000 = 61;
               break;
            case 74:
               var10000 = 50;
               break;
            case 75:
               var10000 = 172;
               break;
            case 76:
               var10000 = 143;
               break;
            case 77:
               var10000 = 93;
               break;
            case 78:
               var10000 = 176;
               break;
            case 79:
               var10000 = 38;
               break;
            case 80:
               var10000 = 97;
               break;
            case 81:
               var10000 = 155;
               break;
            case 82:
               var10000 = 86;
               break;
            case 83:
               var10000 = 11;
               break;
            case 84:
               var10000 = 107;
               break;
            case 85:
               var10000 = 52;
               break;
            case 86:
               var10000 = 115;
               break;
            case 87:
               var10000 = 113;
               break;
            case 88:
               var10000 = 82;
               break;
            case 89:
               var10000 = 187;
               break;
            case 90:
               var10000 = 15;
               break;
            case 91:
               var10000 = 76;
               break;
            case 92:
               var10000 = 205;
               break;
            case 93:
               var10000 = 224;
               break;
            case 94:
               var10000 = 147;
               break;
            case 95:
               var10000 = 148;
               break;
            case 96:
               var10000 = 171;
               break;
            case 97:
               var10000 = 138;
               break;
            case 98:
               var10000 = 189;
               break;
            case 99:
               var10000 = 112;
               break;
            case 100:
               var10000 = 44;
               break;
            case 101:
               var10000 = 78;
               break;
            case 102:
               var10000 = 150;
               break;
            case 103:
               var10000 = 141;
               break;
            case 104:
               var10000 = 250;
               break;
            case 105:
               var10000 = 25;
               break;
            case 106:
               var10000 = 249;
               break;
            case 107:
               var10000 = 0;
               break;
            case 108:
               var10000 = 14;
               break;
            case 109:
               var10000 = 254;
               break;
            case 110:
               var10000 = 234;
               break;
            case 111:
               var10000 = 23;
               break;
            case 112:
               var10000 = 235;
               break;
            case 113:
               var10000 = 71;
               break;
            case 114:
               var10000 = 203;
               break;
            case 115:
               var10000 = 135;
               break;
            case 116:
               var10000 = 194;
               break;
            case 117:
               var10000 = 66;
               break;
            case 118:
               var10000 = 53;
               break;
            case 119:
               var10000 = 255;
               break;
            case 120:
               var10000 = 130;
               break;
            case 121:
               var10000 = 186;
               break;
            case 122:
               var10000 = 5;
               break;
            case 123:
               var10000 = 251;
               break;
            case 124:
               var10000 = 57;
               break;
            case 125:
               var10000 = 2;
               break;
            case 126:
               var10000 = 200;
               break;
            case 127:
               var10000 = 149;
               break;
            case 128:
               var10000 = 106;
               break;
            case 129:
               var10000 = 22;
               break;
            case 130:
               var10000 = 185;
               break;
            case 131:
               var10000 = 183;
               break;
            case 132:
               var10000 = 75;
               break;
            case 133:
               var10000 = 4;
               break;
            case 134:
               var10000 = 179;
               break;
            case 135:
               var10000 = 3;
               break;
            case 136:
               var10000 = 131;
               break;
            case 137:
               var10000 = 41;
               break;
            case 138:
               var10000 = 152;
               break;
            case 139:
               var10000 = 24;
               break;
            case 140:
               var10000 = 253;
               break;
            case 141:
               var10000 = 17;
               break;
            case 142:
               var10000 = 169;
               break;
            case 143:
               var10000 = 117;
               break;
            case 144:
               var10000 = 134;
               break;
            case 145:
               var10000 = 108;
               break;
            case 146:
               var10000 = 228;
               break;
            case 147:
               var10000 = 69;
               break;
            case 148:
               var10000 = 16;
               break;
            case 149:
               var10000 = 70;
               break;
            case 150:
               var10000 = 237;
               break;
            case 151:
               var10000 = 184;
               break;
            case 152:
               var10000 = 6;
               break;
            case 153:
               var10000 = 192;
               break;
            case 154:
               var10000 = 79;
               break;
            case 155:
               var10000 = 145;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 160;
               break;
            case 158:
               var10000 = 103;
               break;
            case 159:
               var10000 = 64;
               break;
            case 160:
               var10000 = 226;
               break;
            case 161:
               var10000 = 199;
               break;
            case 162:
               var10000 = 139;
               break;
            case 163:
               var10000 = 190;
               break;
            case 164:
               var10000 = 181;
               break;
            case 165:
               var10000 = 28;
               break;
            case 166:
               var10000 = 175;
               break;
            case 167:
               var10000 = 31;
               break;
            case 168:
               var10000 = 170;
               break;
            case 169:
               var10000 = 218;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 188;
               break;
            case 172:
               var10000 = 123;
               break;
            case 173:
               var10000 = 167;
               break;
            case 174:
               var10000 = 162;
               break;
            case 175:
               var10000 = 126;
               break;
            case 176:
               var10000 = 1;
               break;
            case 177:
               var10000 = 245;
               break;
            case 178:
               var10000 = 39;
               break;
            case 179:
               var10000 = 102;
               break;
            case 180:
               var10000 = 37;
               break;
            case 181:
               var10000 = 215;
               break;
            case 182:
               var10000 = 202;
               break;
            case 183:
               var10000 = 127;
               break;
            case 184:
               var10000 = 209;
               break;
            case 185:
               var10000 = 213;
               break;
            case 186:
               var10000 = 232;
               break;
            case 187:
               var10000 = 67;
               break;
            case 188:
               var10000 = 233;
               break;
            case 189:
               var10000 = 45;
               break;
            case 190:
               var10000 = 157;
               break;
            case 191:
               var10000 = 109;
               break;
            case 192:
               var10000 = 12;
               break;
            case 193:
               var10000 = 43;
               break;
            case 194:
               var10000 = 208;
               break;
            case 195:
               var10000 = 211;
               break;
            case 196:
               var10000 = 99;
               break;
            case 197:
               var10000 = 207;
               break;
            case 198:
               var10000 = 56;
               break;
            case 199:
               var10000 = 243;
               break;
            case 200:
               var10000 = 48;
               break;
            case 201:
               var10000 = 46;
               break;
            case 202:
               var10000 = 80;
               break;
            case 203:
               var10000 = 49;
               break;
            case 204:
               var10000 = 101;
               break;
            case 205:
               var10000 = 90;
               break;
            case 206:
               var10000 = 65;
               break;
            case 207:
               var10000 = 105;
               break;
            case 208:
               var10000 = 111;
               break;
            case 209:
               var10000 = 51;
               break;
            case 210:
               var10000 = 121;
               break;
            case 211:
               var10000 = 120;
               break;
            case 212:
               var10000 = 40;
               break;
            case 213:
               var10000 = 164;
               break;
            case 214:
               var10000 = 217;
               break;
            case 215:
               var10000 = 236;
               break;
            case 216:
               var10000 = 10;
               break;
            case 217:
               var10000 = 248;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 153;
               break;
            case 220:
               var10000 = 223;
               break;
            case 221:
               var10000 = 244;
               break;
            case 222:
               var10000 = 252;
               break;
            case 223:
               var10000 = 20;
               break;
            case 224:
               var10000 = 137;
               break;
            case 225:
               var10000 = 146;
               break;
            case 226:
               var10000 = 212;
               break;
            case 227:
               var10000 = 161;
               break;
            case 228:
               var10000 = 77;
               break;
            case 229:
               var10000 = 144;
               break;
            case 230:
               var10000 = 239;
               break;
            case 231:
               var10000 = 60;
               break;
            case 232:
               var10000 = 32;
               break;
            case 233:
               var10000 = 230;
               break;
            case 234:
               var10000 = 18;
               break;
            case 235:
               var10000 = 222;
               break;
            case 236:
               var10000 = 88;
               break;
            case 237:
               var10000 = 220;
               break;
            case 238:
               var10000 = 163;
               break;
            case 239:
               var10000 = 168;
               break;
            case 240:
               var10000 = 58;
               break;
            case 241:
               var10000 = 221;
               break;
            case 242:
               var10000 = 174;
               break;
            case 243:
               var10000 = 110;
               break;
            case 244:
               var10000 = 173;
               break;
            case 245:
               var10000 = 158;
               break;
            case 246:
               var10000 = 114;
               break;
            case 247:
               var10000 = 74;
               break;
            case 248:
               var10000 = 216;
               break;
            case 249:
               var10000 = 89;
               break;
            case 250:
               var10000 = 119;
               break;
            case 251:
               var10000 = 246;
               break;
            case 252:
               var10000 = 191;
               break;
            case 253:
               var10000 = 92;
               break;
            case 254:
               var10000 = 204;
               break;
            default:
               var10000 = 94;
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
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         J[var2] = new String(var3).intern();
      }

      return J[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9766;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 5055) & 32767;
      if (db[var3] == null) {
         db[var3] = cb[var3] ^ var1;
      }

      return db[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var49;
      byte[] var7;
      long var8;
      String[] var21 = new String[132];
      int var19 = 0;
      String var18 = "¦\u0084-\u0084.©\u001eÚ\u0087ÍEí'W\u00167 ¦#\u007f\u0006\u000f\u0088\u0011[(\u008b\u000f;þ0k\u008fòNx)hg\u0082Hn\u0088\u0003HG\u0091\u0004cÞ^\n\n\u007f:\f¨>\u009fÙ\u008c4\u0086\r\u00ad³sÕD¹\u0081À·Ã\u009fªR\u0007ý\tH\u0084ô1\u0080\u00126\u009b?glÂGJ\u009d\u008b%÷`¼9^l<\u001e{\u008d¦ä\u0004Á\u0002::ª\u0003qKõ\u0082\u0087\u0019\u0084P\u0091>\u008eû<\u0093¢àúO¸\u0005\nF,pn\u0002ÌÝ\u0017,þ_\te¸\u0093f\u001b6q\u001dÀ\u0011éE>u+RFÀí\u0002\u0081\u0087\bím\u009a¿\u0098\u000búé\u001d\u009b\u0016±§\u0096Ê]Y\u0002´¯÷w\u0085\u0088|\u0015á\u0004y\u009b!\u008cFá»¸\u001c\u008a\u0004G]\u001a \u0007£D\u009d^I]Û\u0017ZÚ²OÝÞdôE»Zô@\u007f\u0011âÎö#´\u009a\u0017û\u0004\u0087Ú\u0093Ð\u0013·Åq¯Hø\u0099vP\u008aúì%³(\u0085W;ù\u0007lë$5\u0004\u0004Ò\blÇãáÎ\u0082fØ\u0011\u0006K\u0097Üp\"þ\u008a¯Ý\u009f\u0085\u0005\u0002J1ß\u0004¹\u0000\u0010a\u0017û$¥R:Óx\u000bf\u009bÞ¨5§X\u0094é½?üÄ\u0015½\u0004Â\u0098®\u001b\u0006ôH\u009d\u0089\u0086õ)ðSç~!º~q7h]\u0092ý'\u0092\u008e\u007fÊ>\u0098q=é\u009a/â\b\u008f\u009e\u0093ù@Hbæ\u009eP\u00adw\u0006Ë\u001eZ%\u0082ñ\u0080c\u0092n( A \u0003ß\u008bÂ8,t\u0084º,kh\u0081(¢«\u0007\u0092\u0015\u001e%\u008fÏ\u0018\u0014À\u0018q$<\u0014WYÚ`J\u0015\u001e&¨\u001e÷ÿ7ª6\bD\u0003ò\u008d\u001a\u0095hiæ\u0014²ÿóÁýq\u0083Ã\u009c]\u0001\u0005sG\n\u0017,Å\u009cH9¶>\u00903\u0012QíÓ©ñ\u001bôqëìë\u001b¹!\u0002í\u000bJ\tb\u000e\u008akr(gO'\fê~Ü\u001d\u0000¶\u0084\u001c\"\u0087ÒP\u0004I\u0018\u001bÒ\u0002^M\u0002äX\u0012\u0098\u0094ÚÇ\u008b¥ó¶\u0004;ÄC³³\u009dO£Õ\u001c\u0094\u009e\u0015ÄÄ\u0095\bÛb?»F\u0085\u000b\u009bù÷\u0017\u0019Gx{¢\u007f\u0006\u0093·,\"Ý'r±\u009ekQoT\u0004Mt/\u009e\u0014\u001cÐ\u0093lÃÑ\u001efÇ\u009bE8Õ\u0083Âù'Åî\u0002\u0089\u0014\n\u009e\u0099T$ì\u0089\rXÂO\u0004i\u0098J\u009c)\rYh~Ý\u00929P]çïØÖÛ,{rv9\u0017ÈØ\u008bÂüç\u001a\u008cTËZÒo\u0088\u0096úë1\u0000\u0083>\u000fÃ\u0094/&l[2M¦Î\u0096VvôO\u0004¼\u007fð`'»\u0097\u008eæ\f©Û\u0013\u0083$Ë\u001b/\u0016È¨4\u000eW\u0000\\.Lø\u009b®\u009e\u0006L¢£f\u0003¦\u008f=v¡Å\u001f\u00960\u001bS³7ôääqØ\n0\u009aíjñ=æ1\u007fçÖ\u008b§¸ÚÆ\u0000È¬\r\u0002:å\f¨@m3fêoaª\b+\u008e2cÍ0~\u0098\u00165ê|\u008b\u0001è\u001fl\u008awC5\u0086\u0014$ä8U\u0081ÊO?\u0005jÊ½\u000f½\u001f\u0001\u001búµÑ/\u0005\u0094Éh+Ö\u008bh\u008fi\u001d\u0087Y\u009fóÔ$Ò\u000b\fÄ|NF§\u0005\"}8¯\u009e\u0014e\u008fç\u0096À®\u0082Ï) l¬9S¢>E\u0087&ß \u0014ÚK\u000e¹\u009cµ\u0091ÌßÝß\u0090 ù=qÔ®l7fÈ\u008dþé\u001dP\u0087\u0012«~\nÛ\u0002gÙd,\u0015¬«\u0015\u0005ÈZwMw\u0007Õ\u0016h\u0016¿\u0005!\u0005h>ì¥³)a°Õ\u0002g5¶\u0080.V~U\u0099ß\u001e\u0091î)\fä7²!k6Ü+Húku_Ù\u0081Ôâ\u0016\"¿÷Ò\u00052-W)ð\u0010\u0091ä\u0011\u0004]³R»'\u008d;fÞÉ¾L\u001fBª\u0081\u0000à]\u009e©©Øq?\u0005<K¾0£iu\u008e\u001eè´`_\":\u001fWO,õ\u009ed\u0005\u00029\u007fN\u0091+\u009cÑ\u0000_f\u0080ÃuªÛ¥UýªXi²Úcý5PÔ\u0093\u0090}\u0091\u008fÅ±8Eþ?\u0007\u0000l©Åµ\u001aä\u0002\fG\u0006Ï\u001a\r¾<7 =\u007fÖî°B\u000b\u009b.\u001by\u001cËwÓ)J5\u001f\u0006\u0016©\r!\u0095Ò\u008c¢\u009e>\u0091×\u0004möÎU\u000fiL÷_pr1\u0000K8ù\u0084\u0005Y,\u0003¸ @\b¯\u008e\u0002¨³ä£\u009b\u0018/â,\tU|(\u008d\u007fO½©\u001cHùbàPh\u0099p\u00ad´r\u001d#Í¦Üt¥\u0001´\u0089\tÞ@YsM¢\u00ad:\u0013\u0002yNÐ«j\u0006É«¤\u001ff\u001a½BÝ×¦)\u009bMÏÖ\u001d.\t\u0002\u0011Ptª{< \u009f(\u009b?Üo\u0013â\u0003\u007fq¸\u000f©\u0080Ì\u0004\u0012®\u0088Çd:\u0011Ô\u0089s«\u0006ç~ä\u0011à¿\u0019Mzs\u0099àª#$\tv¼\u001c\u0003ká?/\u009cÐ©\u001e½\u0094³\"\u0004[hLl\rÕ\u0088í³/)\u001b\u0089\u009bÖñ¿Q\u0006 e!t\u008eÓ\u000f·/¡W¼¹3@ê/:W17w\u001c¬ül\u008bP\u0004X®äÇñ\u008b\u0018\\7Â\u0088A\u0088´Î\u0002ÍÑ\u0012ÄÞù\u00054kqÚÖ\u0017g1k1\u000b+ñ\f]Å[\u0005\u0011\u008e®\"\u0087ÏãÜg\u0083e\u0010\u0087ÆÓ@\u0005;YªF¯\u0017\"[A\u000e]\u001eÒ:\u0093\u0012¢\u001fÖá ÑP\u001e!\u0018Ï:\u0097:Wyif\u0011!Î\u0001K\u008e:6$¸\u0017Þ·\u000b«ãw\u0006\u0003\u0084D»H\u0081\tÇ8\u008fÞ\u001eáQå·\u000bx\u0018QyÉÍâê±Õ ÀNÑ\u009cêÎßÛ\u0081\u0096tö¥\u0005_\u0099£V3ï\u0092É\u00adGR°\u0088{5wýÒ\fÉ\u0094¸@\u008c\u001d\u0015i\u0010)\u0094\u0085\u0002Ky\u0006éd%RØ×\fÄuÏ\u0012{Ä\u0092\u0081\u0090Ò¸y&±ýìi\u0013´]çÆ\u000eE\u0013<\u008a\u0006\"õ65yv¿ë×âº\u0085aºg±\u009e¹û6¯5ñ\b\u008cµ\u008bU\\¢IÕ\u0002§×\u0007ß\u0005¬\u001f\u0013\u001f\u001f\u001d\u0016+\u000b0±[´iìÀÙ<\u0010\\é²~$â\u001dÓÜÜç\u009be\u009e\nw\u0017L\u0088\u000e\u0006§ÍdÐï^\rvÛà÷ï¬v\u0086éËgð\u0002þ\u0094\u0012L\u0006pÔ\u0085¯g\u0099e\u007f\u00164õ\u001c\u0087êv@\u0014òUÞ\u0016@|ºB6¨\u0090\u009a:U\u009b£ó¬\u0090\u0087\u00125\u009a!D\"\u0085\u0091\u0090q\u001a:râ¨²¸\u0094L\fø\u000b\u009e¾Cn\u0086\u0007bäÚ<\nkî\u0094É\u0019\u0016ôõ\\ø'3í\u009f©.@\u009f.\u000b\u0083Üç\u0011\u0085\fg£ç9{ÔÐÚ\u0005©æ\u0085pû°ý `Uq\u0085`Ú®\u0013\u001ePD\u001dî®M¼ÊÓ©ÇOÖe)þ®Ì\u0018\u0015|xY\u0081²\u000f'\u008c\u0016\f\u0010\u0015ê#\u000fa\u008eÑ\u007f¸)a§\u001eô\u009fD%\u0006=ÿÖ\u0096 ÀßöI Mè\u0003ç\u000f&ÅÆ\u0090\u0016\u0010O!c\u0001\u001b\u0086|)\u009bø\u0006MîFÏ¥\u008a\u0092|fÆ¢ÁÏ«o\"¨\u007fÎxû&\u0016g\u0018:\u008dÞ\u008eª¼§\n&Õ,;öR¬Á*èÕ8\u009a\u0098\u0013ÊTSÁ\u008cJ\u001eaÂü«\u009b\u0012\u009aQ\u009a\u007f\u0083²òT$gÀÈ3Â\u008da¡\u0010\u0005ó£\u0087`{\f\u0015Þ#\u0004ô9pí¼¹\u0001\u0097\u0017\u0015\rï\u008b\u0003å2=ù¨Zßuz\u008f.zÜ\u000e*É2ò\rî¨\u008a´×¨\u0083ä»\u0080ã\u0085Ð,_\u001a!×\u009ff\u007fUt\u008a\u0007\u001dí\u0018\u0096j>S¦\u0015ò®\u007føôÎ_oÅ*\u0085W\u0001\u0015ín-¤LÇÂ\u0010Úi\u0004ì9[\b\u0005\u0014[á\u007f\u0088\u0005¥~nà&\u0002Àò\u0004¥#\u0093¹\u001e¡9ýro\u0013o`\u0097á¶\u0018ýØT\"Ì7\u000b\u0015»©KØ\u0085>\"i\u0017Ê\u0018&\u000b\r4qÛ¬yïÑ¯z^2±-é¹I¤T\n0\u0086\u000f6·\u008d\u0091\u008dN+Ó\u001c£ÊÌåT0\u0005Ì7Ö\u001fÕ";
      int var20 = "¦\u0084-\u0084.©\u001eÚ\u0087ÍEí'W\u00167 ¦#\u007f\u0006\u000f\u0088\u0011[(\u008b\u000f;þ0k\u008fòNx)hg\u0082Hn\u0088\u0003HG\u0091\u0004cÞ^\n\n\u007f:\f¨>\u009fÙ\u008c4\u0086\r\u00ad³sÕD¹\u0081À·Ã\u009fªR\u0007ý\tH\u0084ô1\u0080\u00126\u009b?glÂGJ\u009d\u008b%÷`¼9^l<\u001e{\u008d¦ä\u0004Á\u0002::ª\u0003qKõ\u0082\u0087\u0019\u0084P\u0091>\u008eû<\u0093¢àúO¸\u0005\nF,pn\u0002ÌÝ\u0017,þ_\te¸\u0093f\u001b6q\u001dÀ\u0011éE>u+RFÀí\u0002\u0081\u0087\bím\u009a¿\u0098\u000búé\u001d\u009b\u0016±§\u0096Ê]Y\u0002´¯÷w\u0085\u0088|\u0015á\u0004y\u009b!\u008cFá»¸\u001c\u008a\u0004G]\u001a \u0007£D\u009d^I]Û\u0017ZÚ²OÝÞdôE»Zô@\u007f\u0011âÎö#´\u009a\u0017û\u0004\u0087Ú\u0093Ð\u0013·Åq¯Hø\u0099vP\u008aúì%³(\u0085W;ù\u0007lë$5\u0004\u0004Ò\blÇãáÎ\u0082fØ\u0011\u0006K\u0097Üp\"þ\u008a¯Ý\u009f\u0085\u0005\u0002J1ß\u0004¹\u0000\u0010a\u0017û$¥R:Óx\u000bf\u009bÞ¨5§X\u0094é½?üÄ\u0015½\u0004Â\u0098®\u001b\u0006ôH\u009d\u0089\u0086õ)ðSç~!º~q7h]\u0092ý'\u0092\u008e\u007fÊ>\u0098q=é\u009a/â\b\u008f\u009e\u0093ù@Hbæ\u009eP\u00adw\u0006Ë\u001eZ%\u0082ñ\u0080c\u0092n( A \u0003ß\u008bÂ8,t\u0084º,kh\u0081(¢«\u0007\u0092\u0015\u001e%\u008fÏ\u0018\u0014À\u0018q$<\u0014WYÚ`J\u0015\u001e&¨\u001e÷ÿ7ª6\bD\u0003ò\u008d\u001a\u0095hiæ\u0014²ÿóÁýq\u0083Ã\u009c]\u0001\u0005sG\n\u0017,Å\u009cH9¶>\u00903\u0012QíÓ©ñ\u001bôqëìë\u001b¹!\u0002í\u000bJ\tb\u000e\u008akr(gO'\fê~Ü\u001d\u0000¶\u0084\u001c\"\u0087ÒP\u0004I\u0018\u001bÒ\u0002^M\u0002äX\u0012\u0098\u0094ÚÇ\u008b¥ó¶\u0004;ÄC³³\u009dO£Õ\u001c\u0094\u009e\u0015ÄÄ\u0095\bÛb?»F\u0085\u000b\u009bù÷\u0017\u0019Gx{¢\u007f\u0006\u0093·,\"Ý'r±\u009ekQoT\u0004Mt/\u009e\u0014\u001cÐ\u0093lÃÑ\u001efÇ\u009bE8Õ\u0083Âù'Åî\u0002\u0089\u0014\n\u009e\u0099T$ì\u0089\rXÂO\u0004i\u0098J\u009c)\rYh~Ý\u00929P]çïØÖÛ,{rv9\u0017ÈØ\u008bÂüç\u001a\u008cTËZÒo\u0088\u0096úë1\u0000\u0083>\u000fÃ\u0094/&l[2M¦Î\u0096VvôO\u0004¼\u007fð`'»\u0097\u008eæ\f©Û\u0013\u0083$Ë\u001b/\u0016È¨4\u000eW\u0000\\.Lø\u009b®\u009e\u0006L¢£f\u0003¦\u008f=v¡Å\u001f\u00960\u001bS³7ôääqØ\n0\u009aíjñ=æ1\u007fçÖ\u008b§¸ÚÆ\u0000È¬\r\u0002:å\f¨@m3fêoaª\b+\u008e2cÍ0~\u0098\u00165ê|\u008b\u0001è\u001fl\u008awC5\u0086\u0014$ä8U\u0081ÊO?\u0005jÊ½\u000f½\u001f\u0001\u001búµÑ/\u0005\u0094Éh+Ö\u008bh\u008fi\u001d\u0087Y\u009fóÔ$Ò\u000b\fÄ|NF§\u0005\"}8¯\u009e\u0014e\u008fç\u0096À®\u0082Ï) l¬9S¢>E\u0087&ß \u0014ÚK\u000e¹\u009cµ\u0091ÌßÝß\u0090 ù=qÔ®l7fÈ\u008dþé\u001dP\u0087\u0012«~\nÛ\u0002gÙd,\u0015¬«\u0015\u0005ÈZwMw\u0007Õ\u0016h\u0016¿\u0005!\u0005h>ì¥³)a°Õ\u0002g5¶\u0080.V~U\u0099ß\u001e\u0091î)\fä7²!k6Ü+Húku_Ù\u0081Ôâ\u0016\"¿÷Ò\u00052-W)ð\u0010\u0091ä\u0011\u0004]³R»'\u008d;fÞÉ¾L\u001fBª\u0081\u0000à]\u009e©©Øq?\u0005<K¾0£iu\u008e\u001eè´`_\":\u001fWO,õ\u009ed\u0005\u00029\u007fN\u0091+\u009cÑ\u0000_f\u0080ÃuªÛ¥UýªXi²Úcý5PÔ\u0093\u0090}\u0091\u008fÅ±8Eþ?\u0007\u0000l©Åµ\u001aä\u0002\fG\u0006Ï\u001a\r¾<7 =\u007fÖî°B\u000b\u009b.\u001by\u001cËwÓ)J5\u001f\u0006\u0016©\r!\u0095Ò\u008c¢\u009e>\u0091×\u0004möÎU\u000fiL÷_pr1\u0000K8ù\u0084\u0005Y,\u0003¸ @\b¯\u008e\u0002¨³ä£\u009b\u0018/â,\tU|(\u008d\u007fO½©\u001cHùbàPh\u0099p\u00ad´r\u001d#Í¦Üt¥\u0001´\u0089\tÞ@YsM¢\u00ad:\u0013\u0002yNÐ«j\u0006É«¤\u001ff\u001a½BÝ×¦)\u009bMÏÖ\u001d.\t\u0002\u0011Ptª{< \u009f(\u009b?Üo\u0013â\u0003\u007fq¸\u000f©\u0080Ì\u0004\u0012®\u0088Çd:\u0011Ô\u0089s«\u0006ç~ä\u0011à¿\u0019Mzs\u0099àª#$\tv¼\u001c\u0003ká?/\u009cÐ©\u001e½\u0094³\"\u0004[hLl\rÕ\u0088í³/)\u001b\u0089\u009bÖñ¿Q\u0006 e!t\u008eÓ\u000f·/¡W¼¹3@ê/:W17w\u001c¬ül\u008bP\u0004X®äÇñ\u008b\u0018\\7Â\u0088A\u0088´Î\u0002ÍÑ\u0012ÄÞù\u00054kqÚÖ\u0017g1k1\u000b+ñ\f]Å[\u0005\u0011\u008e®\"\u0087ÏãÜg\u0083e\u0010\u0087ÆÓ@\u0005;YªF¯\u0017\"[A\u000e]\u001eÒ:\u0093\u0012¢\u001fÖá ÑP\u001e!\u0018Ï:\u0097:Wyif\u0011!Î\u0001K\u008e:6$¸\u0017Þ·\u000b«ãw\u0006\u0003\u0084D»H\u0081\tÇ8\u008fÞ\u001eáQå·\u000bx\u0018QyÉÍâê±Õ ÀNÑ\u009cêÎßÛ\u0081\u0096tö¥\u0005_\u0099£V3ï\u0092É\u00adGR°\u0088{5wýÒ\fÉ\u0094¸@\u008c\u001d\u0015i\u0010)\u0094\u0085\u0002Ky\u0006éd%RØ×\fÄuÏ\u0012{Ä\u0092\u0081\u0090Ò¸y&±ýìi\u0013´]çÆ\u000eE\u0013<\u008a\u0006\"õ65yv¿ë×âº\u0085aºg±\u009e¹û6¯5ñ\b\u008cµ\u008bU\\¢IÕ\u0002§×\u0007ß\u0005¬\u001f\u0013\u001f\u001f\u001d\u0016+\u000b0±[´iìÀÙ<\u0010\\é²~$â\u001dÓÜÜç\u009be\u009e\nw\u0017L\u0088\u000e\u0006§ÍdÐï^\rvÛà÷ï¬v\u0086éËgð\u0002þ\u0094\u0012L\u0006pÔ\u0085¯g\u0099e\u007f\u00164õ\u001c\u0087êv@\u0014òUÞ\u0016@|ºB6¨\u0090\u009a:U\u009b£ó¬\u0090\u0087\u00125\u009a!D\"\u0085\u0091\u0090q\u001a:râ¨²¸\u0094L\fø\u000b\u009e¾Cn\u0086\u0007bäÚ<\nkî\u0094É\u0019\u0016ôõ\\ø'3í\u009f©.@\u009f.\u000b\u0083Üç\u0011\u0085\fg£ç9{ÔÐÚ\u0005©æ\u0085pû°ý `Uq\u0085`Ú®\u0013\u001ePD\u001dî®M¼ÊÓ©ÇOÖe)þ®Ì\u0018\u0015|xY\u0081²\u000f'\u008c\u0016\f\u0010\u0015ê#\u000fa\u008eÑ\u007f¸)a§\u001eô\u009fD%\u0006=ÿÖ\u0096 ÀßöI Mè\u0003ç\u000f&ÅÆ\u0090\u0016\u0010O!c\u0001\u001b\u0086|)\u009bø\u0006MîFÏ¥\u008a\u0092|fÆ¢ÁÏ«o\"¨\u007fÎxû&\u0016g\u0018:\u008dÞ\u008eª¼§\n&Õ,;öR¬Á*èÕ8\u009a\u0098\u0013ÊTSÁ\u008cJ\u001eaÂü«\u009b\u0012\u009aQ\u009a\u007f\u0083²òT$gÀÈ3Â\u008da¡\u0010\u0005ó£\u0087`{\f\u0015Þ#\u0004ô9pí¼¹\u0001\u0097\u0017\u0015\rï\u008b\u0003å2=ù¨Zßuz\u008f.zÜ\u000e*É2ò\rî¨\u008a´×¨\u0083ä»\u0080ã\u0085Ð,_\u001a!×\u009ff\u007fUt\u008a\u0007\u001dí\u0018\u0096j>S¦\u0015ò®\u007føôÎ_oÅ*\u0085W\u0001\u0015ín-¤LÇÂ\u0010Úi\u0004ì9[\b\u0005\u0014[á\u007f\u0088\u0005¥~nà&\u0002Àò\u0004¥#\u0093¹\u001e¡9ýro\u0013o`\u0097á¶\u0018ýØT\"Ì7\u000b\u0015»©KØ\u0085>\"i\u0017Ê\u0018&\u000b\r4qÛ¬yïÑ¯z^2±-é¹I¤T\n0\u0086\u000f6·\u008d\u0091\u008dN+Ó\u001c£ÊÌåT0\u0005Ì7Ö\u001fÕ"
         .length();
      char var17 = 20;
      int var29 = -1;

      label104:
      while (true) {
         byte var10000 = 86;
         String var10001 = var18.substring(++var29, var29 + var17);
         byte var10002 = -1;

         while (true) {
            label99: {
               char[] var57 = var10001.toCharArray();
               int var10004 = var57.length;
               int var22 = 0;
               byte var60 = var10000;
               var49 = var57;
               int var37 = var10004;
               byte var69;
               char[] var77;
               int var10006;
               if (var10004 <= 1) {
                  var77 = var57;
                  var69 = var10000;
                  var10006 = var22;
               } else {
                  var60 = var10000;
                  var37 = var10004;
                  if (var10004 <= var22) {
                     break label99;
                  }

                  var77 = var57;
                  var69 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var86 = var77[var10006];
                  byte var87;
                  switch (var22 % 7) {
                     case 0:
                        var87 = 80;
                        break;
                     case 1:
                        var87 = 95;
                        break;
                     case 2:
                        var87 = 62;
                        break;
                     case 3:
                        var87 = 79;
                        break;
                     case 4:
                        var87 = 70;
                        break;
                     case 5:
                        var87 = 99;
                        break;
                     default:
                        var87 = 1;
                  }

                  var77[var10006] = (char)(var86 ^ var69 ^ var87);
                  var22++;
                  if (var60 == 0) {
                     var10006 = var60;
                     var77 = var49;
                     var69 = var60;
                  } else {
                     if (var37 <= var22) {
                        break;
                     }

                     var77 = var49;
                     var69 = var60;
                     var10006 = var22;
                  }
               }
            }

            String var62 = new String(var49).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var62;
                  if ((var29 += var17) >= var20) {
                     o = var21;
                     J = new String[132];
                     var8 = 8855679842230277199L;
                     long[] var14 = new long[108];
                     int var11 = 0;
                     String var12 = "\u0083\u0010\u0005ë¼¸+!ÉluóÇìì\u0019\u009c\u0018ÀdAC\u0081\u0098ª\u001dWÂæ%\"Ï\u0018'Bu\u001e³þ\u00811U\u0088§\u0088\fW),z#ì,È\u0088W\u001fºÕïK%\u009cÙ¸Tôþ¬Usëþ\u009cZXf\u009d5Z?u\u0015ä\u0090PôlÀv\u008c\u008f\u0010¬ìg&þ«\u0005½î\u007f(þ\u0085\u0098f\b9\u0081~ü'ñûÖâýA=\u0092\u0017!\u0098)\u008e\u009dý<±\u001cö\u00ad\bd(\u0084û@\u0006C!yî|6\u009f¡\u009f/\u0096¡u+\u0087\u001fô¦T\u001d&RªÄ÷-±\u009b\u008d\u0083\u009aÜg1¹\u007f\u009a\u008d*/\u0000+\u00998k{tÿë\u0082= -]Yµ\u0098ý8ÒÊ^µ_]\u008dC\u0088f\u000bà\u009fJ\u0088°åï\u0089éú\u0019öàúÜ\u0015\u0083\r\u0002\"\u0084¢¯¡Éù´Qs¢¥ã#\u0007Ka\u0096\r\u008d(\u000e\u000fð7O\u0007ciî\u000eÄ%\\µ×¾\u0086@\u008dbÀ ó®®6\u0087eç°ÔÓvnho3¥\nÝ\u0012Qm,\u009b\u0000jÎÚY+ä?b¢ã|\u0003?Q¤_z?³b.b\u009cï®óW¹3\u008b¸}ì\u0084Ø8ß=`D\u0015k(þ\u0001\u001d¶ÕÝ£±Æê'å\u001e\u0080\u0089âáÈµCÀ=±\u009a¼Á\t#ãÖZ\u0005õÌ\u0081s9AmAÖg\u00856Ê\u0095\u0013\u00adâmB^¥3ºÒ³ï9\u0006[q#Ð¤,p\u0095=ü·\u0018\u0019\u0019«\u0002ëË\u008f\u0017}d\u001eïü\u0095ÇT\u0091Ë\u00052\u009c#\u0015\u0018hgèêè\"n\u0094¿ST!\u001d\u009f\u0088$£9Ìý\u0086\"V2L,ÿ&ZîÂ@~X\u009a¢d¡ñ\u0087B\u008bOZåâà\u0014¾\u009b\u0012\u008e4i\u0019/\u0097Q_ÈC³\t¹ö\u001bR\u0003\u0083q#ÿÊ5\u008b\"bJ\u008d¾ðÙ@J\u00adtÿ0ÿ\u0015PðZß\u0005\u0016¿$½Ø²\u0005<¹dÝp \u008ení±ê³ñûþ\u0099ð\u008fè§®$¡?\u008d¸ÉôÎù\u0084Ó¹\u008fEU\rÿEàÈS\u0015/\u0083Û\u0013(Çy\u008f·7Ôntx¾XuQH(V@Ç\u0098\u008akî\u0016pX§Á\u001e\u0004EÉ\u008cú¹ê\u0006@\nYä\u008d©\u00105±\u008f´\u0019×\u0091\u0014\u0006\u0098\u009c\u0089RÂffï\u008d\u0081é¹B=\u001e\u0000ÓínDxÇ\n¯Åê$êQëmRÃ%QF£Ð\b\u009a!æ\u001e?Q+\tªë\u0001_Õfçz\u0081\u000fÅ\b1Üãg\u0091%\u0086YàM³©B\u008b@13Õï\u0093\u0090÷{.a\bÌÇõ»A\u00ad³\u0095\u0089\u008aÐô\u0005\u000bHn®Ã¡\u0000\u001e\u0004\u0082,Hcû\bkaÜ'¢Y[\u0005\u0096êù'j\u008f^ZÊ\u0083íÜ\n./<Â\u001a±FZ\u0081ýbá\u00980Xþ\u0012\nV%la_ï×\u001bÚ\u009dÝ7\u001b¯Ý\u0007\u001almB\u0011J\b\u0011B\u000f>ÈÈó¶/ß´M\u0098\u0013# \u000b©EÐFñp\u0017\u0081É¿\u0005¢F}^Ú\u009bÙ";
                     int var13 = "\u0083\u0010\u0005ë¼¸+!ÉluóÇìì\u0019\u009c\u0018ÀdAC\u0081\u0098ª\u001dWÂæ%\"Ï\u0018'Bu\u001e³þ\u00811U\u0088§\u0088\fW),z#ì,È\u0088W\u001fºÕïK%\u009cÙ¸Tôþ¬Usëþ\u009cZXf\u009d5Z?u\u0015ä\u0090PôlÀv\u008c\u008f\u0010¬ìg&þ«\u0005½î\u007f(þ\u0085\u0098f\b9\u0081~ü'ñûÖâýA=\u0092\u0017!\u0098)\u008e\u009dý<±\u001cö\u00ad\bd(\u0084û@\u0006C!yî|6\u009f¡\u009f/\u0096¡u+\u0087\u001fô¦T\u001d&RªÄ÷-±\u009b\u008d\u0083\u009aÜg1¹\u007f\u009a\u008d*/\u0000+\u00998k{tÿë\u0082= -]Yµ\u0098ý8ÒÊ^µ_]\u008dC\u0088f\u000bà\u009fJ\u0088°åï\u0089éú\u0019öàúÜ\u0015\u0083\r\u0002\"\u0084¢¯¡Éù´Qs¢¥ã#\u0007Ka\u0096\r\u008d(\u000e\u000fð7O\u0007ciî\u000eÄ%\\µ×¾\u0086@\u008dbÀ ó®®6\u0087eç°ÔÓvnho3¥\nÝ\u0012Qm,\u009b\u0000jÎÚY+ä?b¢ã|\u0003?Q¤_z?³b.b\u009cï®óW¹3\u008b¸}ì\u0084Ø8ß=`D\u0015k(þ\u0001\u001d¶ÕÝ£±Æê'å\u001e\u0080\u0089âáÈµCÀ=±\u009a¼Á\t#ãÖZ\u0005õÌ\u0081s9AmAÖg\u00856Ê\u0095\u0013\u00adâmB^¥3ºÒ³ï9\u0006[q#Ð¤,p\u0095=ü·\u0018\u0019\u0019«\u0002ëË\u008f\u0017}d\u001eïü\u0095ÇT\u0091Ë\u00052\u009c#\u0015\u0018hgèêè\"n\u0094¿ST!\u001d\u009f\u0088$£9Ìý\u0086\"V2L,ÿ&ZîÂ@~X\u009a¢d¡ñ\u0087B\u008bOZåâà\u0014¾\u009b\u0012\u008e4i\u0019/\u0097Q_ÈC³\t¹ö\u001bR\u0003\u0083q#ÿÊ5\u008b\"bJ\u008d¾ðÙ@J\u00adtÿ0ÿ\u0015PðZß\u0005\u0016¿$½Ø²\u0005<¹dÝp \u008ení±ê³ñûþ\u0099ð\u008fè§®$¡?\u008d¸ÉôÎù\u0084Ó¹\u008fEU\rÿEàÈS\u0015/\u0083Û\u0013(Çy\u008f·7Ôntx¾XuQH(V@Ç\u0098\u008akî\u0016pX§Á\u001e\u0004EÉ\u008cú¹ê\u0006@\nYä\u008d©\u00105±\u008f´\u0019×\u0091\u0014\u0006\u0098\u009c\u0089RÂffï\u008d\u0081é¹B=\u001e\u0000ÓínDxÇ\n¯Åê$êQëmRÃ%QF£Ð\b\u009a!æ\u001e?Q+\tªë\u0001_Õfçz\u0081\u000fÅ\b1Üãg\u0091%\u0086YàM³©B\u008b@13Õï\u0093\u0090÷{.a\bÌÇõ»A\u00ad³\u0095\u0089\u008aÐô\u0005\u000bHn®Ã¡\u0000\u001e\u0004\u0082,Hcû\bkaÜ'¢Y[\u0005\u0096êù'j\u008f^ZÊ\u0083íÜ\n./<Â\u001a±FZ\u0081ýbá\u00980Xþ\u0012\nV%la_ï×\u001bÚ\u009dÝ7\u001b¯Ý\u0007\u001almB\u0011J\b\u0011B\u000f>ÈÈó¶/ß´M\u0098\u0013# \u000b©EÐFñp\u0017\u0081É¿\u0005¢F}^Ú\u009bÙ"
                        .length();
                     byte var10 = 0;

                     label78:
                     while (true) {
                        byte var39 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                        long[] var31 = var14;
                        int var40 = var11++;
                        long var53 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var63 = -1;

                        while (true) {
                           long var74 = var53 ^ var8;
                           switch (var63) {
                              case 0:
                                 var31[var40] = var74;
                                 if (var10 >= var13) {
                                    ab = var14;
                                    bb = new Integer[108];
                                    long var0 = 8589111616825605043L;
                                    long[] var6 = new long[9];
                                    int var3 = 0;
                                    String var4 = "\u001by£3&Þ/ü·\u0005Åf\u001f¤\u008aPª\u009cKæê\\Ï\u0088Vc\u0088Ìaõ\u001b#\r\u009e\u0081xøQ³¥}ßY\u0086\u0093tCs\u009a¹CÚ\u0089\u0092'Ú";
                                    int var5 = "\u001by£3&Þ/ü·\u0005Åf\u001f¤\u008aPª\u009cKæê\\Ï\u0088Vc\u0088Ìaõ\u001b#\r\u009e\u0081xøQ³¥}ßY\u0086\u0093tCs\u009a¹CÚ\u0089\u0092'Ú"
                                       .length();
                                    byte var2 = 0;

                                    label68:
                                    while (true) {
                                       byte var42 = var2;
                                       var2 += 8;
                                       var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                                       long[] var32 = var6;
                                       int var43 = var3++;
                                       long var55 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var65 = -1;

                                       while (true) {
                                          var74 = var55 ^ var0;
                                          switch (var65) {
                                             case 0:
                                                var32[var43] = var74;
                                                if (var2 >= var5) {
                                                   cb = var6;
                                                   db = new Long[9];
                                                   S = Pattern.compile(a(-26618, 24806));
                                                   i = false;
                                                   d = false;
                                                   y = true;
                                                   Y = false;
                                                   Z = false;
                                                   B = false;
                                                   q = false;
                                                   G = null;
                                                   W = false;
                                                   f = null;
                                                   b = false;
                                                   t = null;
                                                   u = false;
                                                   F = new ConcurrentHashMap(a(12611, 9200627248729855858L), 0.75F, 1);
                                                   T = false;
                                                   R = null;
                                                   w = false;
                                                   K = null;
                                                   Q = null;
                                                   m = false;
                                                   U = null;
                                                   e = null;
                                                   c = null;
                                                   V = null;

                                                   try {
                                                      i = a(-26411, -3319).equals(S7.A(a(-26422, 7601)));
                                                      d = a(-26411, -3319).equals(S7.A(a(-26431, -25631)));
                                                   } catch (Throwable var25) {
                                                   }

                                                   try {
                                                      V = java.lang.Class.forName(a(-26424, 26179));
                                                   } catch (Throwable var24) {
                                                   }

                                                   O = new CR_2();
                                                   A = new GI();
                                                   P = new QI();
                                                   j = new CC3();
                                                   I = new EJ3();
                                                   M = new Rb2();
                                                   w();
                                                   N = new XT(a(2902, 7482632521072913729L));
                                                   h = new P72(a(10343, 2756203802854821413L));
                                                   D = false;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var32[var43] = var74;
                                                if (var2 < var5) {
                                                   continue label68;
                                                }

                                                var4 = "\u0018ñ\u009f\u0099ÝÆè>êj\u009e\u0019\u000eóO\u0099";
                                                var5 = "\u0018ñ\u009f\u0099ÝÆè>êj\u009e\u0019\u000eóO\u0099".length();
                                                var2 = 0;
                                          }

                                          byte var44 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                                          var32 = var6;
                                          var43 = var3++;
                                          var55 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var65 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var31[var40] = var74;
                                 if (var10 < var13) {
                                    continue label78;
                                 }

                                 var12 = "äwt6Þ\u0019\u009dÉ»RÑ\u0095\u0088_\u0085T";
                                 var13 = "äwt6Þ\u0019\u009dÉ»RÑ\u0095\u0088_\u0085T".length();
                                 var10 = 0;
                           }

                           byte var41 = var10;
                           var10 += 8;
                           var15 = var12.substring(var41, var10).getBytes("ISO-8859-1");
                           var31 = var14;
                           var40 = var11++;
                           var53 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var63 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var29);
                  break;
               default:
                  var21[var19++] = var62;
                  if ((var29 += var17) < var20) {
                     var17 = var18.charAt(var29);
                     continue label104;
                  }

                  var18 = "8ªJ\u0084\u001dI¥¯J\u009c\u00893\u009e9¼\u009a[²¨÷\u00123ú\u000f7@ð\"É'!?Nª\u0018\u0001Ú&Ý:Ò\u0087ú_\u0000\u0084½\\@St\\*K\bVG\u001dí¿^ \u0084\u0099";
                  var20 = "8ªJ\u0084\u001dI¥¯J\u009c\u00893\u009e9¼\u009a[²¨÷\u00123ú\u000f7@ð\"É'!?Nª\u0018\u0001Ú&Ý:Ò\u0087ú_\u0000\u0084½\\@St\\*K\bVG\u001dí¿^ \u0084\u0099"
                     .length();
                  var17 = 30;
                  var29 = -1;
            }

            var10000 = 82;
            var10001 = var18.substring(++var29, var29 + var17);
            var10002 = 0;
         }
      }
   }
}





