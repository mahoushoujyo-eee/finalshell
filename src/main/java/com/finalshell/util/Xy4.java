package com.finalshell.util;

import com.finalshell.core.Iv4;
import com.finalshell.core.L6_2;
import com.finalshell.core.NI;
import com.finalshell.core.Ph2;
import com.finalshell.ui.model.A_2;
import com.finalshell.ui.model.K;
import com.finalshell.ui.model.O_2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

/** @deprecated */
public class Xy4 extends AbstractMap implements Map, Cloneable, Serializable {
   transient volatile Set n = null;
   transient volatile Collection r = null;
   transient NI[] v;
   transient int t;
   int c;
   final float X;
   transient volatile int b;
   final int U = new Random().nextInt(a(12263, 374339204641768926L));
   public transient Set L = null;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   public int s(String var1) {
      int var3 = a(25292, 3422688848555641083L) * this.U;
      int var10000 = Ph2.u();
      int var4 = 0;
      int var2 = var10000;

      while (true) {
         if (var4 < var1.length()) {
            var10000 = var3 * a(25722, 354480240177712710L) ^ var1.charAt(var4);
            if (var2 != 0) {
               break;
            }

            var3 = var10000;
            var4++;
            if (var2 == 0) {
               continue;
            }
         }

         var10000 = (var3 ^ var3 >> 1) & a(9599, 2876523331689762631L);
         break;
      }

      return var10000;
   }

   public Xy4(int param1, float param2) {
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
      // 004: invokespecial java/util/AbstractMap.<init> ()V
      // 007: istore 3
      // 008: aload 0
      // 009: aconst_null
      // 00a: putfield com/finalshell/util/Xy4.n Ljava/util/Set;
      // 00d: aload 0
      // 00e: aconst_null
      // 00f: putfield com/finalshell/util/Xy4.r Ljava/util/Collection;
      // 012: aload 0
      // 013: new java/util/Random
      // 016: dup
      // 017: invokespecial java/util/Random.<init> ()V
      // 01a: sipush 1979
      // 01d: ldc2_w 3181557961431281039
      // 020: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 023: invokevirtual java/util/Random.nextInt (I)I
      // 026: putfield com/finalshell/util/Xy4.U I
      // 029: aload 0
      // 02a: aconst_null
      // 02b: putfield com/finalshell/util/Xy4.L Ljava/util/Set;
      // 02e: iload 1
      // 02f: iload 3
      // 030: ifne 064
      // 033: ifge 063
      // 036: goto 03d
      // 039: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: new java/lang/IllegalArgumentException
      // 040: dup
      // 041: new java/lang/StringBuilder
      // 044: dup
      // 045: invokespecial java/lang/StringBuilder.<init> ()V
      // 048: sipush -30326
      // 04b: sipush -32385
      // 04e: invokestatic com/finalshell/util/Xy4.a (II)Ljava/lang/String;
      // 051: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 054: iload 1
      // 055: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 058: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 05e: athrow
      // 05f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: iload 1
      // 064: iload 3
      // 065: ifne 088
      // 068: sipush 28063
      // 06b: ldc2_w 8041742057914107810
      // 06e: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 071: if_icmple 085
      // 074: goto 07b
      // 077: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: sipush 28063
      // 07e: ldc2_w 8041742057914107810
      // 081: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 084: istore 1
      // 085: fload 2
      // 086: fconst_0
      // 087: fcmpg
      // 088: iload 3
      // 089: ifne 0a1
      // 08c: ifle 0af
      // 08f: goto 096
      // 092: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: fload 2
      // 097: invokestatic java/lang/Float.isNaN (F)Z
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: iload 3
      // 0a2: ifne 0d6
      // 0a5: ifeq 0d5
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: new java/lang/IllegalArgumentException
      // 0b2: dup
      // 0b3: new java/lang/StringBuilder
      // 0b6: dup
      // 0b7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ba: sipush -30325
      // 0bd: sipush 22816
      // 0c0: invokestatic com/finalshell/util/Xy4.a (II)Ljava/lang/String;
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c6: fload 2
      // 0c7: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 0ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cd: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0d0: athrow
      // 0d1: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: istore 4
      // 0d8: iload 4
      // 0da: iload 1
      // 0db: if_icmpge 0f3
      // 0de: iload 4
      // 0e0: bipush 1
      // 0e1: ishl
      // 0e2: istore 4
      // 0e4: iload 3
      // 0e5: ifne 10f
      // 0e8: iload 3
      // 0e9: ifeq 0d8
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: fload 2
      // 0f5: putfield com/finalshell/util/Xy4.X F
      // 0f8: aload 0
      // 0f9: iload 4
      // 0fb: i2f
      // 0fc: fload 2
      // 0fd: fmul
      // 0fe: f2i
      // 0ff: putfield com/finalshell/util/Xy4.c I
      // 102: aload 0
      // 103: iload 4
      // 105: anewarray 122
      // 108: putfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 10b: aload 0
      // 10c: invokevirtual com/finalshell/util/Xy4.y ()V
      // 10f: return
   }

   public Xy4(int var1) {
      this(var1, 0.75F);
   }

   public Xy4() {
      this.X = 0.75F;
      this.c = a(24634, 750735936114493964L);
      this.v = new NI[a(10481, 5134747017816457921L)];
      this.y();
   }

   public Xy4(Map var1) {
      this(Math.max((int)((float)var1.size() / 0.75F) + 1, a(21203, 8104284561115658473L)), 0.75F);
      this.m(var1);
   }

   void y() {
   }

   static int d(int var0) {
      var0 *= var0;
      var0 ^= var0 >>> a(5549, 6129187728456679318L) ^ var0 >>> a(5148, 5925496626712149549L);
      return var0 ^ var0 >>> a(29800, 8549009448377753181L) ^ var0 >>> 4;
   }

   static int O(int var0, int var1) {
      return var0 & var1 - 1;
   }

   @Override
   public int size() {
      return this.t;
   }

   @Override
   public boolean isEmpty() {
      int var1 = Ph2.u();

      try {
         if (var1 != 0) {
            return (boolean)this.t;
         }

         if (this.t == 0) {
            return 1 != 0;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return 0 != 0;
   }

   @Override
   public Object get(Object param1) {
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1e
      // 09: ifnonnull 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokespecial com/finalshell/util/Xy4.Y ()Ljava/lang/Object;
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: areturn
      // 1f: bipush 0
      // 20: istore 3
      // 21: aload 1
      // 22: instanceof java/lang/String
      // 25: iload 2
      // 26: ifeq 51
      // 29: ifeq 43
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 0
      // 34: aload 1
      // 35: checkcast java/lang/String
      // 38: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 3b: invokestatic com/finalshell/util/Xy4.d (I)I
      // 3e: istore 3
      // 3f: iload 2
      // 40: ifne 52
      // 43: aload 1
      // 44: invokevirtual java/lang/Object.hashCode ()I
      // 47: invokestatic com/finalshell/util/Xy4.d (I)I
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: istore 3
      // 52: aload 0
      // 53: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 56: iload 3
      // 57: aload 0
      // 58: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 5b: arraylength
      // 5c: invokestatic com/finalshell/util/Xy4.O (II)I
      // 5f: aaload
      // 60: astore 4
      // 62: aload 4
      // 64: ifnull c5
      // 67: aload 4
      // 69: iload 2
      // 6a: ifeq bf
      // 6d: getfield com/finalshell/core/NI.m I
      // 70: iload 3
      // 71: if_icmpne ba
      // 74: goto 7b
      // 77: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 4
      // 7d: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 80: dup
      // 81: astore 5
      // 83: iload 2
      // 84: ifeq b9
      // 87: aload 1
      // 88: if_acmpeq ad
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 1
      // 93: iload 2
      // 94: ifeq b9
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: aload 5
      // a0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // a3: ifeq ba
      // a6: goto ad
      // a9: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 4
      // af: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // b2: goto b9
      // b5: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: areturn
      // ba: aload 4
      // bc: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // bf: astore 4
      // c1: iload 2
      // c2: ifne 62
      // c5: aconst_null
      // c6: areturn
   }

   public Object Y() {
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
      // 04: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 07: bipush 0
      // 08: aaload
      // 09: astore 2
      // 0a: istore 1
      // 0b: aload 2
      // 0c: ifnull 33
      // 0f: aload 2
      // 10: iload 1
      // 11: ifeq 2e
      // 14: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 17: ifnonnull 2a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 2
      // 22: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // 25: areturn
      // 26: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 2
      // 2b: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 2e: astore 2
      // 2f: iload 1
      // 30: ifne 0b
      // 33: aconst_null
      // 34: areturn
   }

   @Override
   public boolean containsKey(Object var1) {
      try {
         if (this.j(var1) != null) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   final NI j(Object param1) {
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
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 46
      // 17: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 1
      // 1c: instanceof java/lang/String
      // 1f: iload 2
      // 20: ifne 43
      // 23: ifeq 3f
      // 26: goto 2d
      // 29: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 1
      // 2f: checkcast java/lang/String
      // 32: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 35: invokestatic com/finalshell/util/Xy4.d (I)I
      // 38: goto 46
      // 3b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 1
      // 40: invokevirtual java/lang/Object.hashCode ()I
      // 43: invokestatic com/finalshell/util/Xy4.d (I)I
      // 46: istore 3
      // 47: aload 0
      // 48: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 4b: iload 3
      // 4c: aload 0
      // 4d: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 50: arraylength
      // 51: invokestatic com/finalshell/util/Xy4.O (II)I
      // 54: aaload
      // 55: astore 4
      // 57: aload 4
      // 59: ifnull b8
      // 5c: aload 4
      // 5e: iload 2
      // 5f: ifne b2
      // 62: getfield com/finalshell/core/NI.m I
      // 65: iload 3
      // 66: if_icmpne ad
      // 69: goto 70
      // 6c: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 4
      // 72: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 75: dup
      // 76: astore 5
      // 78: iload 2
      // 79: ifne 8f
      // 7c: aload 1
      // 7d: if_acmpeq a6
      // 80: goto 87
      // 83: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 1
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e: athrow
      // 8f: iload 2
      // 90: ifne 9e
      // 93: ifnull ad
      // 96: goto 9d
      // 99: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: aload 1
      // 9e: aload 5
      // a0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // a3: ifeq ad
      // a6: aload 4
      // a8: areturn
      // a9: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 4
      // af: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // b2: astore 4
      // b4: iload 2
      // b5: ifeq 57
      // b8: aconst_null
      // b9: areturn
   }

   @Override
   public Object put(Object param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.u ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 1f
      // 09: ifnonnull 20
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: aload 2
      // 15: invokespecial com/finalshell/util/Xy4.W (Ljava/lang/Object;)Ljava/lang/Object;
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: areturn
      // 20: bipush 0
      // 21: istore 4
      // 23: aload 1
      // 24: instanceof java/lang/String
      // 27: iload 3
      // 28: ifne 54
      // 2b: ifeq 46
      // 2e: goto 35
      // 31: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: checkcast java/lang/String
      // 3a: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 3d: invokestatic com/finalshell/util/Xy4.d (I)I
      // 40: istore 4
      // 42: iload 3
      // 43: ifeq 56
      // 46: aload 1
      // 47: invokevirtual java/lang/Object.hashCode ()I
      // 4a: invokestatic com/finalshell/util/Xy4.d (I)I
      // 4d: goto 54
      // 50: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: istore 4
      // 56: iload 4
      // 58: aload 0
      // 59: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 5c: arraylength
      // 5d: invokestatic com/finalshell/util/Xy4.O (II)I
      // 60: istore 5
      // 62: aload 0
      // 63: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 66: iload 5
      // 68: aaload
      // 69: astore 6
      // 6b: aload 6
      // 6d: ifnull e4
      // 70: iload 3
      // 71: ifne f8
      // 74: aload 6
      // 76: iload 3
      // 77: ifne de
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: getfield com/finalshell/core/NI.m I
      // 84: iload 4
      // 86: if_icmpne d9
      // 89: goto 90
      // 8c: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f: athrow
      // 90: aload 6
      // 92: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 95: dup
      // 96: astore 7
      // 98: iload 3
      // 99: ifne ce
      // 9c: aload 1
      // 9d: if_acmpeq c2
      // a0: goto a7
      // a3: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6: athrow
      // a7: aload 1
      // a8: iload 3
      // a9: ifne ce
      // ac: goto b3
      // af: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: aload 7
      // b5: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // b8: ifeq d9
      // bb: goto c2
      // be: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1: athrow
      // c2: aload 6
      // c4: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // c7: goto ce
      // ca: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cd: athrow
      // ce: astore 8
      // d0: aload 6
      // d2: aload 2
      // d3: putfield com/finalshell/core/NI.u Ljava/lang/Object;
      // d6: aload 8
      // d8: areturn
      // d9: aload 6
      // db: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // de: astore 6
      // e0: iload 3
      // e1: ifeq 6b
      // e4: aload 0
      // e5: dup
      // e6: getfield com/finalshell/util/Xy4.b I
      // e9: bipush 1
      // ea: iadd
      // eb: putfield com/finalshell/util/Xy4.b I
      // ee: aload 0
      // ef: iload 4
      // f1: aload 1
      // f2: aload 2
      // f3: iload 5
      // f5: invokevirtual com/finalshell/util/Xy4.E (ILjava/lang/Object;Ljava/lang/Object;I)V
      // f8: aconst_null
      // f9: areturn
   }

   public Object W(Object param1) {
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
      // 04: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 07: bipush 0
      // 08: aaload
      // 09: astore 3
      // 0a: istore 2
      // 0b: aload 3
      // 0c: ifnull 43
      // 0f: iload 2
      // 10: ifeq 55
      // 13: aload 3
      // 14: iload 2
      // 15: ifeq 3e
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 22: ifnonnull 3a
      // 25: goto 2c
      // 28: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 3
      // 2d: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // 30: astore 4
      // 32: aload 3
      // 33: aload 1
      // 34: putfield com/finalshell/core/NI.u Ljava/lang/Object;
      // 37: aload 4
      // 39: areturn
      // 3a: aload 3
      // 3b: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 3e: astore 3
      // 3f: iload 2
      // 40: ifne 0b
      // 43: aload 0
      // 44: dup
      // 45: getfield com/finalshell/util/Xy4.b I
      // 48: bipush 1
      // 49: iadd
      // 4a: putfield com/finalshell/util/Xy4.b I
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: aconst_null
      // 50: aload 1
      // 51: bipush 0
      // 52: invokevirtual com/finalshell/util/Xy4.E (ILjava/lang/Object;Ljava/lang/Object;I)V
      // 55: aconst_null
      // 56: areturn
   }

   public void L(Object param1, Object param2) {
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
      // 04: aload 1
      // 05: iload 3
      // 06: ifeq 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 46
      // 17: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 1
      // 1c: instanceof java/lang/String
      // 1f: iload 3
      // 20: ifeq 43
      // 23: ifeq 3f
      // 26: goto 2d
      // 29: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: aload 1
      // 2f: checkcast java/lang/String
      // 32: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 35: invokestatic com/finalshell/util/Xy4.d (I)I
      // 38: goto 46
      // 3b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 1
      // 40: invokevirtual java/lang/Object.hashCode ()I
      // 43: invokestatic com/finalshell/util/Xy4.d (I)I
      // 46: istore 4
      // 48: iload 4
      // 4a: aload 0
      // 4b: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 4e: arraylength
      // 4f: invokestatic com/finalshell/util/Xy4.O (II)I
      // 52: istore 5
      // 54: aload 0
      // 55: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 58: iload 5
      // 5a: aaload
      // 5b: astore 6
      // 5d: aload 6
      // 5f: ifnull ce
      // 62: iload 3
      // 63: ifeq d8
      // 66: aload 6
      // 68: iload 3
      // 69: ifeq c8
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: getfield com/finalshell/core/NI.m I
      // 76: iload 4
      // 78: if_icmpne c3
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 6
      // 84: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 87: dup
      // 88: astore 7
      // 8a: iload 3
      // 8b: ifeq a1
      // 8e: aload 1
      // 8f: if_acmpeq b8
      // 92: goto 99
      // 95: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 1
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: iload 3
      // a2: ifeq b0
      // a5: ifnull c3
      // a8: goto af
      // ab: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 1
      // b0: aload 7
      // b2: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // b5: ifeq c3
      // b8: aload 6
      // ba: aload 2
      // bb: putfield com/finalshell/core/NI.u Ljava/lang/Object;
      // be: return
      // bf: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: aload 6
      // c5: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // c8: astore 6
      // ca: iload 3
      // cb: ifne 5d
      // ce: aload 0
      // cf: iload 4
      // d1: aload 1
      // d2: aload 2
      // d3: iload 5
      // d5: invokevirtual com/finalshell/util/Xy4.Y (ILjava/lang/Object;Ljava/lang/Object;I)V
      // d8: return
   }

   public void m(Map var1) {
      int var10000 = Ph2.u();
      Iterator var3 = var1.entrySet().iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.L(var4.getKey(), var4.getValue());
         if (var2 != 0) {
            break;
         }
      }
   }

   void j(int param1) {
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
      // 04: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 07: astore 3
      // 08: aload 3
      // 09: arraylength
      // 0a: istore 4
      // 0c: istore 2
      // 0d: iload 4
      // 0f: iload 2
      // 10: ifeq 39
      // 13: sipush 28063
      // 16: ldc2_w 8041742057914107810
      // 19: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 1c: if_icmpne 38
      // 1f: goto 26
      // 22: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: sipush 23111
      // 2a: ldc2_w 2035113894466957433
      // 2d: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 30: putfield com/finalshell/util/Xy4.c I
      // 33: return
      // 34: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: iload 1
      // 39: anewarray 122
      // 3c: astore 5
      // 3e: aload 0
      // 3f: aload 5
      // 41: invokevirtual com/finalshell/util/Xy4.g ([Lcom/finalshell/core/NI;)V
      // 44: aload 0
      // 45: aload 5
      // 47: putfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 4a: aload 0
      // 4b: iload 1
      // 4c: i2f
      // 4d: aload 0
      // 4e: getfield com/finalshell/util/Xy4.X F
      // 51: fmul
      // 52: f2i
      // 53: putfield com/finalshell/util/Xy4.c I
      // 56: return
   }

   void g(NI[] param1) {
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
      // 04: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 1
      // 0a: arraylength
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 3
      // 13: arraylength
      // 14: if_icmpge 72
      // 17: aload 3
      // 18: iload 5
      // 1a: aaload
      // 1b: astore 6
      // 1d: iload 2
      // 1e: ifne 6e
      // 21: aload 6
      // 23: ifnull 64
      // 26: goto 2d
      // 29: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 3
      // 2e: iload 5
      // 30: aconst_null
      // 31: aastore
      // 32: goto 39
      // 35: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 6
      // 3b: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 3e: astore 7
      // 40: aload 6
      // 42: getfield com/finalshell/core/NI.m I
      // 45: iload 4
      // 47: invokestatic com/finalshell/util/Xy4.O (II)I
      // 4a: istore 8
      // 4c: aload 6
      // 4e: aload 1
      // 4f: iload 8
      // 51: aaload
      // 52: putfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 55: aload 1
      // 56: iload 8
      // 58: aload 6
      // 5a: aastore
      // 5b: aload 7
      // 5d: astore 6
      // 5f: aload 6
      // 61: ifnonnull 39
      // 64: iinc 5 1
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 2
      // 6f: ifeq 10
      // 72: return
   }

   @Override
   public void putAll(Map param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ph2.w ()I
      // 03: aload 1
      // 04: invokeinterface java/util/Map.size ()I 1
      // 09: istore 3
      // 0a: istore 2
      // 0b: iload 3
      // 0c: iload 2
      // 0d: ifeq 1c
      // 10: ifne 1b
      // 13: goto 1a
      // 16: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: return
      // 1b: iload 3
      // 1c: iload 2
      // 1d: ifeq 3f
      // 20: aload 0
      // 21: getfield com/finalshell/util/Xy4.c I
      // 24: if_icmple 9f
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: iload 3
      // 2f: i2f
      // 30: aload 0
      // 31: getfield com/finalshell/util/Xy4.X F
      // 34: fdiv
      // 35: fconst_1
      // 36: fadd
      // 37: f2i
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: istore 4
      // 41: iload 4
      // 43: iload 2
      // 44: ifeq 6a
      // 47: sipush 1197
      // 4a: ldc2_w 5503730584316800658
      // 4d: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 50: if_icmple 65
      // 53: goto 5a
      // 56: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: sipush 28063
      // 5d: ldc2_w 8041742057914107810
      // 60: invokestatic com/finalshell/util/Xy4.a (IJ)I
      // 63: istore 4
      // 65: aload 0
      // 66: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 69: arraylength
      // 6a: istore 5
      // 6c: iload 5
      // 6e: iload 4
      // 70: if_icmpge 88
      // 73: iload 5
      // 75: bipush 1
      // 76: ishl
      // 77: istore 5
      // 79: iload 2
      // 7a: ifeq 9f
      // 7d: iload 2
      // 7e: ifne 6c
      // 81: goto 88
      // 84: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: iload 5
      // 8a: aload 0
      // 8b: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 8e: arraylength
      // 8f: if_icmple 9f
      // 92: aload 0
      // 93: iload 5
      // 95: invokevirtual com/finalshell/util/Xy4.j (I)V
      // 98: goto 9f
      // 9b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: aload 1
      // a0: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // a5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // aa: astore 4
      // ac: aload 4
      // ae: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b3: ifeq d9
      // b6: aload 4
      // b8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // bd: checkcast java/util/Map$Entry
      // c0: astore 5
      // c2: aload 0
      // c3: aload 5
      // c5: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // ca: aload 5
      // cc: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // d1: invokevirtual com/finalshell/util/Xy4.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // d4: pop
      // d5: iload 2
      // d6: ifne ac
      // d9: return
   }

   @Override
   public Object remove(Object param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/util/Xy4.O (Ljava/lang/Object;)Lcom/finalshell/core/NI;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 22
      // 0f: ifnonnull 21
      // 12: goto 19
      // 15: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 25
      // 1d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 3
      // 22: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // 25: areturn
   }

   final NI O(Object param1) {
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
      // 006: ifeq 01c
      // 009: ifnonnull 01b
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: bipush 0
      // 014: goto 046
      // 017: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 1
      // 01c: instanceof java/lang/String
      // 01f: iload 2
      // 020: ifeq 043
      // 023: ifeq 03f
      // 026: goto 02d
      // 029: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: aload 0
      // 02e: aload 1
      // 02f: checkcast java/lang/String
      // 032: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 035: invokestatic com/finalshell/util/Xy4.d (I)I
      // 038: goto 046
      // 03b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: aload 1
      // 040: invokevirtual java/lang/Object.hashCode ()I
      // 043: invokestatic com/finalshell/util/Xy4.d (I)I
      // 046: istore 3
      // 047: iload 3
      // 048: aload 0
      // 049: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 04c: arraylength
      // 04d: invokestatic com/finalshell/util/Xy4.O (II)I
      // 050: istore 4
      // 052: aload 0
      // 053: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 056: iload 4
      // 058: aaload
      // 059: astore 5
      // 05b: aload 5
      // 05d: astore 6
      // 05f: aload 6
      // 061: ifnull 11e
      // 064: aload 6
      // 066: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 069: astore 7
      // 06b: aload 6
      // 06d: iload 2
      // 06e: ifeq 120
      // 071: iload 2
      // 072: ifeq 118
      // 075: goto 07c
      // 078: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: getfield com/finalshell/core/NI.m I
      // 07f: iload 3
      // 080: if_icmpne 112
      // 083: goto 08a
      // 086: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 6
      // 08c: getfield com/finalshell/core/NI.V Ljava/lang/Object;
      // 08f: dup
      // 090: astore 8
      // 092: iload 2
      // 093: ifeq 0a9
      // 096: aload 1
      // 097: if_acmpeq 0c0
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: iload 2
      // 0aa: ifeq 0b8
      // 0ad: ifnull 112
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: aload 8
      // 0ba: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0bd: ifeq 112
      // 0c0: aload 0
      // 0c1: dup
      // 0c2: getfield com/finalshell/util/Xy4.b I
      // 0c5: bipush 1
      // 0c6: iadd
      // 0c7: putfield com/finalshell/util/Xy4.b I
      // 0ca: aload 0
      // 0cb: dup
      // 0cc: getfield com/finalshell/util/Xy4.t I
      // 0cf: bipush 1
      // 0d0: isub
      // 0d1: putfield com/finalshell/util/Xy4.t I
      // 0d4: aload 5
      // 0d6: aload 6
      // 0d8: iload 2
      // 0d9: ifeq 10c
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: if_acmpne 101
      // 0e6: goto 0ed
      // 0e9: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 0f1: iload 4
      // 0f3: aload 7
      // 0f5: aastore
      // 0f6: iload 2
      // 0f7: ifne 10f
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 5
      // 103: aload 7
      // 105: goto 10c
      // 108: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: putfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 10f: aload 6
      // 111: areturn
      // 112: aload 6
      // 114: astore 5
      // 116: aload 7
      // 118: astore 6
      // 11a: iload 2
      // 11b: ifne 05f
      // 11e: aload 6
      // 120: areturn
   }

   final NI H(Object param1) {
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
      // 006: ifne 01d
      // 009: instanceof java/util/Map$Entry
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aconst_null
      // 017: areturn
      // 018: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 1
      // 01d: checkcast java/util/Map$Entry
      // 020: astore 3
      // 021: aload 3
      // 022: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 027: astore 4
      // 029: aload 4
      // 02b: iload 2
      // 02c: ifne 043
      // 02f: ifnonnull 041
      // 032: goto 039
      // 035: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: bipush 0
      // 03a: goto 06f
      // 03d: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: aload 4
      // 043: instanceof java/lang/String
      // 046: iload 2
      // 047: ifne 06c
      // 04a: ifeq 067
      // 04d: goto 054
      // 050: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: aload 0
      // 055: aload 4
      // 057: checkcast java/lang/String
      // 05a: invokespecial com/finalshell/util/Xy4.s (Ljava/lang/String;)I
      // 05d: invokestatic com/finalshell/util/Xy4.d (I)I
      // 060: goto 06f
      // 063: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 4
      // 069: invokevirtual java/lang/Object.hashCode ()I
      // 06c: invokestatic com/finalshell/util/Xy4.d (I)I
      // 06f: istore 5
      // 071: iload 5
      // 073: aload 0
      // 074: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 077: arraylength
      // 078: invokestatic com/finalshell/util/Xy4.O (II)I
      // 07b: istore 6
      // 07d: aload 0
      // 07e: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 081: iload 6
      // 083: aaload
      // 084: astore 7
      // 086: aload 7
      // 088: astore 8
      // 08a: aload 8
      // 08c: ifnull 12f
      // 08f: aload 8
      // 091: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 094: astore 9
      // 096: aload 8
      // 098: iload 2
      // 099: ifne 131
      // 09c: iload 2
      // 09d: ifne 129
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: getfield com/finalshell/core/NI.m I
      // 0aa: iload 5
      // 0ac: if_icmpne 123
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 8
      // 0b8: iload 2
      // 0b9: ifne 129
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 3
      // 0c4: invokevirtual com/finalshell/core/NI.equals (Ljava/lang/Object;)Z
      // 0c7: ifeq 123
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: dup
      // 0d3: getfield com/finalshell/util/Xy4.b I
      // 0d6: bipush 1
      // 0d7: iadd
      // 0d8: putfield com/finalshell/util/Xy4.b I
      // 0db: aload 0
      // 0dc: dup
      // 0dd: getfield com/finalshell/util/Xy4.t I
      // 0e0: bipush 1
      // 0e1: isub
      // 0e2: putfield com/finalshell/util/Xy4.t I
      // 0e5: aload 7
      // 0e7: aload 8
      // 0e9: iload 2
      // 0ea: ifne 11d
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: if_acmpne 112
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 102: iload 6
      // 104: aload 9
      // 106: aastore
      // 107: iload 2
      // 108: ifeq 120
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 7
      // 114: aload 9
      // 116: goto 11d
      // 119: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: putfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 120: aload 8
      // 122: areturn
      // 123: aload 8
      // 125: astore 7
      // 127: aload 9
      // 129: astore 8
      // 12b: iload 2
      // 12c: ifeq 08a
      // 12f: aload 8
      // 131: areturn
   }

   @Override
   public void clear() {
      this.b++;
      NI[] var2 = this.v;
      int var10000 = Ph2.w();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < var2.length) {
            try {
               var2[var3] = null;
               var3++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (IllegalArgumentException var4) {
               throw a(var4);
            }
         }

         this.t = 0;
         break;
      }
   }

   @Override
   public boolean containsValue(Object var1) {
      int var2 = Ph2.u();

      try {
         if (var1 == null) {
            return this.h();
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }

      NI[] var3 = this.v;
      int var4 = 0;

      label52:
      while (true) {
         int var10000 = var4;

         label48:
         while (var10000 < var3.length) {
            for (NI var5 = var3[var4]; var5 != null; var5 = var5.N) {
               var10000 = (var1.equals(var5.u)) ? 1 : 0;
               if (var2 != 0) {
                  continue label48;
               }

               try {
                  if (var2 != 0) {
                     return var10000 != 0;
                  }

                  if (var10000 != 0) {
                     return 1 != 0;
                  }
               } catch (IllegalArgumentException var6) {
                  throw a(var6);
               }
               break;
            }

            var4++;
            if (var2 == 0) {
               continue label52;
            }

            return false;
         }

         return false;
      }
   }

   public boolean h() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 04: astore 2
      // 05: invokestatic com/finalshell/core/Ph2.u ()I
      // 08: bipush 0
      // 09: istore 3
      // 0a: istore 1
      // 0b: iload 3
      // 0c: aload 2
      // 0d: arraylength
      // 0e: if_icmpge 4a
      // 11: aload 2
      // 12: iload 3
      // 13: aaload
      // 14: astore 4
      // 16: aload 4
      // 18: ifnull 43
      // 1b: aload 4
      // 1d: iload 1
      // 1e: ifne 14
      // 21: iload 1
      // 22: ifne 3d
      // 25: getfield com/finalshell/core/NI.u Ljava/lang/Object;
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 1
      // 33: ireturn
      // 34: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 4
      // 3a: getfield com/finalshell/core/NI.N Lcom/finalshell/core/NI;
      // 3d: astore 4
      // 3f: iload 1
      // 40: ifeq 16
      // 43: iinc 3 1
      // 46: iload 1
      // 47: ifeq 0b
      // 4a: bipush 0
      // 4b: ireturn
   }

   @Override
   public Object clone() {
      Xy4 var1 = null;

      try {
         var1 = (Xy4)super.clone();
      } catch (CloneNotSupportedException var3) {
      }

      var1.v = new NI[this.v.length];
      var1.L = null;
      var1.b = 0;
      var1.t = 0;
      var1.y();
      var1.m(this);
      return var1;
   }

   void E(int param1, Object param2, Object param3, int param4) {
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
      // 04: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 07: iload 4
      // 09: aaload
      // 0a: astore 6
      // 0c: istore 5
      // 0e: aload 0
      // 0f: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 12: iload 4
      // 14: new com/finalshell/core/NI
      // 17: dup
      // 18: iload 1
      // 19: aload 2
      // 1a: aload 3
      // 1b: aload 6
      // 1d: invokespecial com/finalshell/core/NI.<init> (ILjava/lang/Object;Ljava/lang/Object;Lcom/finalshell/core/NI;)V
      // 20: aastore
      // 21: aload 0
      // 22: dup
      // 23: getfield com/finalshell/util/Xy4.t I
      // 26: iload 5
      // 28: ifne 4e
      // 2b: dup_x1
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield com/finalshell/util/Xy4.t I
      // 31: aload 0
      // 32: getfield com/finalshell/util/Xy4.c I
      // 35: if_icmplt 51
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 2
      // 41: aload 0
      // 42: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 45: arraylength
      // 46: imul
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: invokevirtual com/finalshell/util/Xy4.j (I)V
      // 51: return
   }

   void Y(int var1, Object var2, Object var3, int var4) {
      NI var5 = this.v[var4];
      this.v[var4] = new NI(var1, var2, var3, var5);
      this.t++;
   }

   Iterator e() {
      return new A_2(this, null);
   }

   Iterator P() {
      return new O_2(this, null);
   }

   Iterator O() {
      return new K(this, null);
   }

   @Override
   public Set keySet() {
      int var10000 = Ph2.w();
      Set var2 = this.n;
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return this.n = new Iv4(this, null);
   }

   @Override
   public Collection values() {
      int var10000 = Ph2.w();
      Collection var2 = this.r;
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return this.r = new Iv2(this, null);
   }

   @Override
   public Set entrySet() {
      return this.L();
   }

   public Set L() {
      int var10000 = Ph2.w();
      Set var2 = this.L;
      int var1 = var10000;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return this.L = new L6_2(this, null);
   }

   public void writeObject(ObjectOutputStream param1) throws IOException {
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
      // 05: iload 2
      // 06: ifne 1e
      // 09: getfield com/finalshell/util/Xy4.t I
      // 0c: ifle 29
      // 0f: goto 16
      // 12: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: invokespecial com/finalshell/util/Xy4.L ()Ljava/util/Set;
      // 21: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 26: goto 2a
      // 29: aconst_null
      // 2a: astore 3
      // 2b: aload 1
      // 2c: invokevirtual java/io/ObjectOutputStream.defaultWriteObject ()V
      // 2f: aload 1
      // 30: aload 0
      // 31: getfield com/finalshell/util/Xy4.v [Lcom/finalshell/core/NI;
      // 34: arraylength
      // 35: invokevirtual java/io/ObjectOutputStream.writeInt (I)V
      // 38: aload 1
      // 39: aload 0
      // 3a: getfield com/finalshell/util/Xy4.t I
      // 3d: invokevirtual java/io/ObjectOutputStream.writeInt (I)V
      // 40: aload 3
      // 41: iload 2
      // 42: ifne 50
      // 45: ifnull 7d
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/util/Xy4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 3
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq 7d
      // 58: aload 3
      // 59: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5e: checkcast java/util/Map$Entry
      // 61: astore 4
      // 63: aload 1
      // 64: aload 4
      // 66: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 6b: invokevirtual java/io/ObjectOutputStream.writeObject (Ljava/lang/Object;)V
      // 6e: aload 1
      // 6f: aload 4
      // 71: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 76: invokevirtual java/io/ObjectOutputStream.writeObject (Ljava/lang/Object;)V
      // 79: iload 2
      // 7a: ifeq 4f
      // 7d: return
   }

   public void readObject(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      var1.defaultReadObject();
      int var10000 = Ph2.w();
      int var3 = var1.readInt();
      this.v = new NI[var3];
      this.y();
      int var2 = var10000;
      int var4 = var1.readInt();
      int var5 = 0;

      while (var5 < var4) {
         Object var6 = var1.readObject();
         Object var7 = var1.readObject();
         this.L(var6, var7);
         var5++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -30325) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 167;
               break;
            case 1:
               var10000 = 55;
               break;
            case 2:
               var10000 = 156;
               break;
            case 3:
               var10000 = 59;
               break;
            case 4:
               var10000 = 215;
               break;
            case 5:
               var10000 = 149;
               break;
            case 6:
               var10000 = 42;
               break;
            case 7:
               var10000 = 116;
               break;
            case 8:
               var10000 = 131;
               break;
            case 9:
               var10000 = 218;
               break;
            case 10:
               var10000 = 220;
               break;
            case 11:
               var10000 = 153;
               break;
            case 12:
               var10000 = 211;
               break;
            case 13:
               var10000 = 23;
               break;
            case 14:
               var10000 = 110;
               break;
            case 15:
               var10000 = 234;
               break;
            case 16:
               var10000 = 29;
               break;
            case 17:
               var10000 = 86;
               break;
            case 18:
               var10000 = 236;
               break;
            case 19:
               var10000 = 244;
               break;
            case 20:
               var10000 = 178;
               break;
            case 21:
               var10000 = 122;
               break;
            case 22:
               var10000 = 65;
               break;
            case 23:
               var10000 = 96;
               break;
            case 24:
               var10000 = 138;
               break;
            case 25:
               var10000 = 202;
               break;
            case 26:
               var10000 = 245;
               break;
            case 27:
               var10000 = 92;
               break;
            case 28:
               var10000 = 41;
               break;
            case 29:
               var10000 = 148;
               break;
            case 30:
               var10000 = 223;
               break;
            case 31:
               var10000 = 219;
               break;
            case 32:
               var10000 = 77;
               break;
            case 33:
               var10000 = 118;
               break;
            case 34:
               var10000 = 9;
               break;
            case 35:
               var10000 = 33;
               break;
            case 36:
               var10000 = 210;
               break;
            case 37:
               var10000 = 36;
               break;
            case 38:
               var10000 = 85;
               break;
            case 39:
               var10000 = 217;
               break;
            case 40:
               var10000 = 253;
               break;
            case 41:
               var10000 = 198;
               break;
            case 42:
               var10000 = 46;
               break;
            case 43:
               var10000 = 252;
               break;
            case 44:
               var10000 = 94;
               break;
            case 45:
               var10000 = 207;
               break;
            case 46:
               var10000 = 4;
               break;
            case 47:
               var10000 = 103;
               break;
            case 48:
               var10000 = 15;
               break;
            case 49:
               var10000 = 247;
               break;
            case 50:
               var10000 = 141;
               break;
            case 51:
               var10000 = 188;
               break;
            case 52:
               var10000 = 134;
               break;
            case 53:
               var10000 = 1;
               break;
            case 54:
               var10000 = 142;
               break;
            case 55:
               var10000 = 162;
               break;
            case 56:
               var10000 = 69;
               break;
            case 57:
               var10000 = 130;
               break;
            case 58:
               var10000 = 228;
               break;
            case 59:
               var10000 = 89;
               break;
            case 60:
               var10000 = 199;
               break;
            case 61:
               var10000 = 161;
               break;
            case 62:
               var10000 = 21;
               break;
            case 63:
               var10000 = 123;
               break;
            case 64:
               var10000 = 19;
               break;
            case 65:
               var10000 = 97;
               break;
            case 66:
               var10000 = 5;
               break;
            case 67:
               var10000 = 185;
               break;
            case 68:
               var10000 = 150;
               break;
            case 69:
               var10000 = 99;
               break;
            case 70:
               var10000 = 105;
               break;
            case 71:
               var10000 = 112;
               break;
            case 72:
               var10000 = 14;
               break;
            case 73:
               var10000 = 246;
               break;
            case 74:
               var10000 = 137;
               break;
            case 75:
               var10000 = 6;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 53;
               break;
            case 79:
               var10000 = 237;
               break;
            case 80:
               var10000 = 227;
               break;
            case 81:
               var10000 = 111;
               break;
            case 82:
               var10000 = 120;
               break;
            case 83:
               var10000 = 235;
               break;
            case 84:
               var10000 = 50;
               break;
            case 85:
               var10000 = 62;
               break;
            case 86:
               var10000 = 177;
               break;
            case 87:
               var10000 = 67;
               break;
            case 88:
               var10000 = 197;
               break;
            case 89:
               var10000 = 75;
               break;
            case 90:
               var10000 = 182;
               break;
            case 91:
               var10000 = 35;
               break;
            case 92:
               var10000 = 251;
               break;
            case 93:
               var10000 = 184;
               break;
            case 94:
               var10000 = 24;
               break;
            case 95:
               var10000 = 28;
               break;
            case 96:
               var10000 = 127;
               break;
            case 97:
               var10000 = 165;
               break;
            case 98:
               var10000 = 20;
               break;
            case 99:
               var10000 = 164;
               break;
            case 100:
               var10000 = 193;
               break;
            case 101:
               var10000 = 238;
               break;
            case 102:
               var10000 = 151;
               break;
            case 103:
               var10000 = 175;
               break;
            case 104:
               var10000 = 152;
               break;
            case 105:
               var10000 = 248;
               break;
            case 106:
               var10000 = 192;
               break;
            case 107:
               var10000 = 213;
               break;
            case 108:
               var10000 = 145;
               break;
            case 109:
               var10000 = 169;
               break;
            case 110:
               var10000 = 179;
               break;
            case 111:
               var10000 = 3;
               break;
            case 112:
               var10000 = 233;
               break;
            case 113:
               var10000 = 230;
               break;
            case 114:
               var10000 = 39;
               break;
            case 115:
               var10000 = 56;
               break;
            case 116:
               var10000 = 160;
               break;
            case 117:
               var10000 = 232;
               break;
            case 118:
               var10000 = 126;
               break;
            case 119:
               var10000 = 72;
               break;
            case 120:
               var10000 = 212;
               break;
            case 121:
               var10000 = 173;
               break;
            case 122:
               var10000 = 208;
               break;
            case 123:
               var10000 = 128;
               break;
            case 124:
               var10000 = 124;
               break;
            case 125:
               var10000 = 32;
               break;
            case 126:
               var10000 = 57;
               break;
            case 127:
               var10000 = 224;
               break;
            case 128:
               var10000 = 166;
               break;
            case 129:
               var10000 = 129;
               break;
            case 130:
               var10000 = 229;
               break;
            case 131:
               var10000 = 243;
               break;
            case 132:
               var10000 = 104;
               break;
            case 133:
               var10000 = 70;
               break;
            case 134:
               var10000 = 168;
               break;
            case 135:
               var10000 = 78;
               break;
            case 136:
               var10000 = 154;
               break;
            case 137:
               var10000 = 74;
               break;
            case 138:
               var10000 = 195;
               break;
            case 139:
               var10000 = 249;
               break;
            case 140:
               var10000 = 100;
               break;
            case 141:
               var10000 = 226;
               break;
            case 142:
               var10000 = 254;
               break;
            case 143:
               var10000 = 51;
               break;
            case 144:
               var10000 = 121;
               break;
            case 145:
               var10000 = 88;
               break;
            case 146:
               var10000 = 187;
               break;
            case 147:
               var10000 = 101;
               break;
            case 148:
               var10000 = 63;
               break;
            case 149:
               var10000 = 11;
               break;
            case 150:
               var10000 = 10;
               break;
            case 151:
               var10000 = 136;
               break;
            case 152:
               var10000 = 45;
               break;
            case 153:
               var10000 = 181;
               break;
            case 154:
               var10000 = 48;
               break;
            case 155:
               var10000 = 255;
               break;
            case 156:
               var10000 = 34;
               break;
            case 157:
               var10000 = 221;
               break;
            case 158:
               var10000 = 242;
               break;
            case 159:
               var10000 = 79;
               break;
            case 160:
               var10000 = 66;
               break;
            case 161:
               var10000 = 140;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 83;
               break;
            case 164:
               var10000 = 49;
               break;
            case 165:
               var10000 = 125;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 200;
               break;
            case 168:
               var10000 = 250;
               break;
            case 169:
               var10000 = 61;
               break;
            case 170:
               var10000 = 203;
               break;
            case 171:
               var10000 = 71;
               break;
            case 172:
               var10000 = 132;
               break;
            case 173:
               var10000 = 146;
               break;
            case 174:
               var10000 = 106;
               break;
            case 175:
               var10000 = 102;
               break;
            case 176:
               var10000 = 8;
               break;
            case 177:
               var10000 = 90;
               break;
            case 178:
               var10000 = 87;
               break;
            case 179:
               var10000 = 30;
               break;
            case 180:
               var10000 = 12;
               break;
            case 181:
               var10000 = 170;
               break;
            case 182:
               var10000 = 47;
               break;
            case 183:
               var10000 = 38;
               break;
            case 184:
               var10000 = 139;
               break;
            case 185:
               var10000 = 209;
               break;
            case 186:
               var10000 = 76;
               break;
            case 187:
               var10000 = 73;
               break;
            case 188:
               var10000 = 27;
               break;
            case 189:
               var10000 = 54;
               break;
            case 190:
               var10000 = 143;
               break;
            case 191:
               var10000 = 17;
               break;
            case 192:
               var10000 = 2;
               break;
            case 193:
               var10000 = 158;
               break;
            case 194:
               var10000 = 222;
               break;
            case 195:
               var10000 = 95;
               break;
            case 196:
               var10000 = 13;
               break;
            case 197:
               var10000 = 52;
               break;
            case 198:
               var10000 = 174;
               break;
            case 199:
               var10000 = 107;
               break;
            case 200:
               var10000 = 119;
               break;
            case 201:
               var10000 = 190;
               break;
            case 202:
               var10000 = 22;
               break;
            case 203:
               var10000 = 186;
               break;
            case 204:
               var10000 = 113;
               break;
            case 205:
               var10000 = 16;
               break;
            case 206:
               var10000 = 114;
               break;
            case 207:
               var10000 = 157;
               break;
            case 208:
               var10000 = 82;
               break;
            case 209:
               var10000 = 191;
               break;
            case 210:
               var10000 = 239;
               break;
            case 211:
               var10000 = 26;
               break;
            case 212:
               var10000 = 25;
               break;
            case 213:
               var10000 = 31;
               break;
            case 214:
               var10000 = 214;
               break;
            case 215:
               var10000 = 117;
               break;
            case 216:
               var10000 = 84;
               break;
            case 217:
               var10000 = 98;
               break;
            case 218:
               var10000 = 81;
               break;
            case 219:
               var10000 = 163;
               break;
            case 220:
               var10000 = 204;
               break;
            case 221:
               var10000 = 109;
               break;
            case 222:
               var10000 = 225;
               break;
            case 223:
               var10000 = 196;
               break;
            case 224:
               var10000 = 240;
               break;
            case 225:
               var10000 = 80;
               break;
            case 226:
               var10000 = 43;
               break;
            case 227:
               var10000 = 44;
               break;
            case 228:
               var10000 = 216;
               break;
            case 229:
               var10000 = 144;
               break;
            case 230:
               var10000 = 68;
               break;
            case 231:
               var10000 = 7;
               break;
            case 232:
               var10000 = 91;
               break;
            case 233:
               var10000 = 241;
               break;
            case 234:
               var10000 = 205;
               break;
            case 235:
               var10000 = 171;
               break;
            case 236:
               var10000 = 37;
               break;
            case 237:
               var10000 = 64;
               break;
            case 238:
               var10000 = 159;
               break;
            case 239:
               var10000 = 18;
               break;
            case 240:
               var10000 = 133;
               break;
            case 241:
               var10000 = 58;
               break;
            case 242:
               var10000 = 189;
               break;
            case 243:
               var10000 = 147;
               break;
            case 244:
               var10000 = 115;
               break;
            case 245:
               var10000 = 155;
               break;
            case 246:
               var10000 = 194;
               break;
            case 247:
               var10000 = 172;
               break;
            case 248:
               var10000 = 206;
               break;
            case 249:
               var10000 = 0;
               break;
            case 250:
               var10000 = 201;
               break;
            case 251:
               var10000 = 40;
               break;
            case 252:
               var10000 = 176;
               break;
            case 253:
               var10000 = 93;
               break;
            case 254:
               var10000 = 180;
               break;
            default:
               var10000 = 183;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27197;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "'\u0099£ÈýL\u009b\u0097\\òt·\u001e»õ\u001cÌ\u009c\u001eÖ\u001c\u001aè\u009dZHÂ\\|\u0095¥³æ®\f\u008dÚ~\u0092õ\"o\u009aº\u008a!î]";
      int var12 = "'\u0099£ÈýL\u009b\u0097\\òt·\u001e»õ\u001cÌ\u009c\u001eÖ\u001c\u001aè\u009dZHÂ\\|\u0095¥³æ®\f\u008dÚ~\u0092õ\"o\u009aº\u008a!î]".length();
      char var9 = 21;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 120;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 120;
               var10006 = var14;
            } else {
               var27 = 120;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 120;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 104;
                     break;
                  case 1:
                     var47 = 58;
                     break;
                  case 2:
                     var47 = 49;
                     break;
                  case 3:
                     var47 = 79;
                     break;
                  case 4:
                     var47 = 94;
                     break;
                  case 5:
                     var47 = 99;
                     break;
                  default:
                     var47 = 127;
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
            d = new String[2];
            long var0 = 120398060458367585L;
            long[] var6 = new long[14];
            int var3 = 0;
            String var4 = "Üz_|Ø\u000e]ÃGHGe\u0093ôU´$qÔ\u0003Øã´óö\u00adÌ c\u0091\u0095ç{\rÇ\u0094\u001fi\u0019 \u009d\u0000$\u0085£\\kõäëéM\r\u0013¥ã\u008e\u0088ç1^¿b\u0098\u0082OA\u0096\u0091GÄ;n\u0092\u0004m\u0012(±q\u008b¬;\u0012Ê\u0081O_åÐ¬9Ñ}Ða";
            int var5 = "Üz_|Ø\u000e]ÃGHGe\u0093ôU´$qÔ\u0003Øã´óö\u00adÌ c\u0091\u0095ç{\rÇ\u0094\u001fi\u0019 \u009d\u0000$\u0085£\\kõäëéM\r\u0013¥ã\u008e\u0088ç1^¿b\u0098\u0082OA\u0096\u0091GÄ;n\u0092\u0004m\u0012(±q\u008b¬;\u0012Ê\u0081O_åÐ¬9Ñ}Ða"
               .length();
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
                           e = var6;
                           f = new Integer[14];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "îRý@y·¤@&mÎ\u009fÁ6\u0018°";
                        var5 = "îRý@y·¤@&mÎ\u009fÁ6\u0018°".length();
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





